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
 * OpaqueExpressionBodies provides the Java implementation bodies of OCL-defined OpaqueExpression operations and properties.
 */
@SuppressWarnings("nls")
public class OpaqueExpressionBodies
{

	/** 
	 * Implementation of the OpaqueExpression 'language_body_size' invariant.
	 */
	public static class _invariant_language_body_size extends AbstractUnaryOperation
	{
		public static _invariant_language_body_size INSTANCE = new _invariant_language_body_size();
	
		/*
		language->notEmpty() implies body->size() = language->size()
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_Collection_notEmpty = OCLstdlibTables.Operations._Collection__notEmpty;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final DomainCollectionType T_OrderedSet_String_ = standardLibrary.getOrderedSetType(T_String);
			final ExecutorProperty P_OpaqueExpression_language = PivotTables.Properties._OpaqueExpression__language;
			final LibraryProperty IP_OpaqueExpression_language = P_OpaqueExpression_language.getImplementation();
			final ExecutorOperation O_Real__eq_ = OCLstdlibTables.Operations._Real___eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final DomainCollectionType T_Sequence_String_ = standardLibrary.getSequenceType(T_String);
			final ExecutorProperty P_OpaqueExpression_body = PivotTables.Properties._OpaqueExpression__body;
			final LibraryProperty IP_OpaqueExpression_body = P_OpaqueExpression_body.getImplementation();
			
			Value leftA_symbol_59;
			try {
				
				Value A_symbol_60 = IP_OpaqueExpression_language.evaluate(evaluator, T_OrderedSet_String_, self, P_OpaqueExpression_language);
				
				DomainType static_A_symbol_61 = valueFactory.typeOf(A_symbol_60);
				LibraryUnaryOperation dynamic_A_symbol_61 = (LibraryUnaryOperation)static_A_symbol_61.lookupImplementation(standardLibrary, O_Collection_notEmpty);
				Value A_symbol_61 = dynamic_A_symbol_61.evaluate(evaluator, T_Boolean, A_symbol_60);
				leftA_symbol_59 = A_symbol_61;
			} catch (InvalidValueException e) {
				leftA_symbol_59 = valueFactory.getInvalid();
			}
			Value A_symbol_61 = leftA_symbol_59;
			Value rightA_symbol_59;
			try {
				
				Value A_symbol_62 = IP_OpaqueExpression_body.evaluate(evaluator, T_Sequence_String_, self, P_OpaqueExpression_body);
				
				DomainType static_A_symbol_63 = valueFactory.typeOf(A_symbol_62);
				LibraryUnaryOperation dynamic_A_symbol_63 = (LibraryUnaryOperation)static_A_symbol_63.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_63 = dynamic_A_symbol_63.evaluate(evaluator, T_Integer, A_symbol_62);
				
				Value A_symbol_64 = IP_OpaqueExpression_language.evaluate(evaluator, T_OrderedSet_String_, self, P_OpaqueExpression_language);
				
				DomainType static_A_symbol_65 = valueFactory.typeOf(A_symbol_64);
				LibraryUnaryOperation dynamic_A_symbol_65 = (LibraryUnaryOperation)static_A_symbol_65.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_65 = dynamic_A_symbol_65.evaluate(evaluator, T_Integer, A_symbol_64);
				DomainType static_A_symbol_66 = valueFactory.typeOf(A_symbol_63, A_symbol_65);
				LibraryBinaryOperation dynamic_A_symbol_66 = (LibraryBinaryOperation)static_A_symbol_66.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_66 = dynamic_A_symbol_66.evaluate(evaluator, T_Boolean, A_symbol_63, A_symbol_65);
				rightA_symbol_59 = A_symbol_66;
			} catch (InvalidValueException e) {
				rightA_symbol_59 = valueFactory.getInvalid();
			}
			Value A_symbol_66 = rightA_symbol_59;
			DomainType static_A_symbol_59 = valueFactory.typeOf(A_symbol_61);
			LibraryBinaryOperation dynamic_A_symbol_59 = (LibraryBinaryOperation)static_A_symbol_59.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_59 = dynamic_A_symbol_59.evaluate(evaluator, T_Boolean, A_symbol_61, A_symbol_66);
			return A_symbol_59;
		}
	}




}

