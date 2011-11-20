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
import org.eclipse.ocl.examples.domain.library.LibraryIteration;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.library.LibraryUnaryOperation;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * TemplateParameterSubstitutionBodies provides the Java implementation bodies of OCL-defined TemplateParameterSubstitution operations and properties.
 */
@SuppressWarnings("nls")
public class TemplateParameterSubstitutionBodies
{

	/** 
	 * Implementation of the TemplateParameterSubstitution 'must_be_compatible' invariant.
	 */
	public static class _invariant_must_be_compatible extends AbstractUnaryOperation
	{
		public static _invariant_must_be_compatible INSTANCE = new _invariant_must_be_compatible();
	
		/*
		actual->forAll(a : _'platform:/resource/org.eclipse.ocl.examples.pivot/model/pivot.ecore'::pivot::ParameterableElement |
	  a.isCompatibleWith(formal.parameteredElement))
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_forAll = OCLstdlibTables.Operations._Collection__0_forAll;
			final ExecutorType T_pivot_ecore__pivot__ParameterableElement = PivotTables.Types._ParameterableElement;
			final DomainCollectionType T_Set_pivot_ecore__pivot__ParameterableElement_ = standardLibrary.getSetType(T_pivot_ecore__pivot__ParameterableElement);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorProperty P_TemplateParameterSubstitution_actual = PivotTables.Properties._TemplateParameterSubstitution__actual;
			final LibraryProperty IP_TemplateParameterSubstitution_actual = P_TemplateParameterSubstitution_actual.getImplementation();
			final ExecutorOperation O_ParameterableElement_isCompatibleWith = PivotTables.Operations._ParameterableElement__isCompatibleWith;
			final ExecutorProperty P_TemplateParameter_parameteredElement = PivotTables.Properties._TemplateParameter__parameteredElement;
			final LibraryProperty IP_TemplateParameter_parameteredElement = P_TemplateParameter_parameteredElement.getImplementation();
			final ExecutorType T_pivot_ecore__pivot__TemplateParameter = PivotTables.Types._TemplateParameter;
			final ExecutorProperty P_TemplateParameterSubstitution_formal = PivotTables.Properties._TemplateParameterSubstitution__formal;
			final LibraryProperty IP_TemplateParameterSubstitution_formal = P_TemplateParameterSubstitution_formal.getImplementation();
			
			
			Value A_symbol_52 = IP_TemplateParameterSubstitution_actual.evaluate(evaluator, T_pivot_ecore__pivot__ParameterableElement, self, P_TemplateParameterSubstitution_actual);
			
			DomainType static_A_symbol_50 = valueFactory.typeOf(A_symbol_52);
			LibraryUnaryOperation dynamic_A_symbol_50 = (LibraryUnaryOperation)static_A_symbol_50.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
			Value A_symbol_50 = dynamic_A_symbol_50.evaluate(evaluator, T_Set_pivot_ecore__pivot__ParameterableElement_, A_symbol_52);
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_51 = new AbstractBinaryOperation()
			{
			/*
			a.isCompatibleWith(formal.parameteredElement)
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_a = iterator1;	// iterator: a
					
					
					Value A_symbol_53 = IP_TemplateParameterSubstitution_formal.evaluate(evaluator, T_pivot_ecore__pivot__TemplateParameter, self, P_TemplateParameterSubstitution_formal);
					
					Value A_symbol_54 = IP_TemplateParameter_parameteredElement.evaluate(evaluator, T_pivot_ecore__pivot__ParameterableElement, A_symbol_53, P_TemplateParameter_parameteredElement);
					
					DomainType static_A_symbol_55 = valueFactory.typeOf(V_a);
					LibraryBinaryOperation dynamic_A_symbol_55 = (LibraryBinaryOperation)static_A_symbol_55.lookupImplementation(standardLibrary, O_ParameterableElement_isCompatibleWith);
					Value A_symbol_55 = dynamic_A_symbol_55.evaluate(evaluator, T_Boolean, V_a, A_symbol_54);
					return A_symbol_55;
				}
			};
			DomainType static_A_symbol_51 = A_symbol_50.getType();
			LibraryIteration dynamic_A_symbol_51 = (LibraryIteration)static_A_symbol_51.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_51 = dynamic_A_symbol_51.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_51 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_51, (CollectionValue)A_symbol_50, acc_A_symbol_51);
			Value A_symbol_51 = dynamic_A_symbol_51.evaluateIteration(manager_A_symbol_51);
			return A_symbol_51;
		}
	}




}

