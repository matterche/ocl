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
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.library.LibraryUnaryOperation;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * ConstraintBodies provides the Java implementation bodies of OCL-defined Constraint operations and properties.
 */
@SuppressWarnings("nls")
public class ConstraintBodies
{

	/** 
	 * Implementation of the Constraint 'not_apply_to_self' invariant.
	 */
	public static class _invariant_not_apply_to_self extends AbstractUnaryOperation
	{
		public static _invariant_not_apply_to_self INSTANCE = new _invariant_not_apply_to_self();
	
		/*
		not constrainedElement->includes(self)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_not = OCLstdlibTables.Operations._Boolean__not;
			final ExecutorOperation O_Collection_includes = OCLstdlibTables.Operations._Collection__includes;
			final ExecutorType T_pivot_ecore__pivot__Element = PivotTables.Types._Element;
			final DomainCollectionType T_OrderedSet_pivot_ecore__pivot__Element_ = standardLibrary.getOrderedSetType(T_pivot_ecore__pivot__Element);
			final ExecutorProperty P_Constraint_constrainedElement = PivotTables.Properties._Constraint__constrainedElement;
			final LibraryProperty IP_Constraint_constrainedElement = P_Constraint_constrainedElement.getImplementation();
			
			
			Value A_symbol_36 = IP_Constraint_constrainedElement.evaluate(evaluator, T_OrderedSet_pivot_ecore__pivot__Element_, self, P_Constraint_constrainedElement);
			
			
			DomainType static_A_symbol_37 = valueFactory.typeOf(A_symbol_36);
			LibraryBinaryOperation dynamic_A_symbol_37 = (LibraryBinaryOperation)static_A_symbol_37.lookupImplementation(standardLibrary, O_Collection_includes);
			Value A_symbol_37 = dynamic_A_symbol_37.evaluate(evaluator, T_Boolean, A_symbol_36, self);
			DomainType static_A_symbol_38 = valueFactory.typeOf(A_symbol_37);
			LibraryUnaryOperation dynamic_A_symbol_38 = (LibraryUnaryOperation)static_A_symbol_38.lookupImplementation(standardLibrary, O_Boolean_not);
			Value A_symbol_38 = dynamic_A_symbol_38.evaluate(evaluator, T_Boolean, A_symbol_37);
			return A_symbol_38;
		}
	}

	/** 
	 * Implementation of the Constraint 'value_specification_boolean' invariant.
	 */
	public static class _invariant_value_specification_boolean extends AbstractUnaryOperation
	{
		public static _invariant_value_specification_boolean INSTANCE = new _invariant_value_specification_boolean();
	
		/*
		self.specification.booleanValue().oclIsKindOf(Boolean)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorOperation O_ValueSpecification_booleanValue = PivotTables.Operations._ValueSpecification__booleanValue;
			final ExecutorType T_pivot_ecore__pivot__ValueSpecification = PivotTables.Types._ValueSpecification;
			final ExecutorProperty P_Constraint_specification = PivotTables.Properties._Constraint__specification;
			final LibraryProperty IP_Constraint_specification = P_Constraint_specification.getImplementation();
			final Value T_ClassClassifier_Boolean_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Boolean);
			
			
			Value A_symbol_39 = IP_Constraint_specification.evaluate(evaluator, T_pivot_ecore__pivot__ValueSpecification, self, P_Constraint_specification);
			
			DomainType static_A_symbol_40 = valueFactory.typeOf(A_symbol_39);
			LibraryUnaryOperation dynamic_A_symbol_40 = (LibraryUnaryOperation)static_A_symbol_40.lookupImplementation(standardLibrary, O_ValueSpecification_booleanValue);
			Value A_symbol_40 = dynamic_A_symbol_40.evaluate(evaluator, T_Boolean, A_symbol_39);
			DomainType static_A_symbol_41 = valueFactory.typeOf(A_symbol_40);
			LibraryBinaryOperation dynamic_A_symbol_41 = (LibraryBinaryOperation)static_A_symbol_41.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
			Value A_symbol_41 = dynamic_A_symbol_41.evaluate(evaluator, T_Boolean, A_symbol_40, T_ClassClassifier_Boolean_);
			return A_symbol_41;
		}
	}






}

