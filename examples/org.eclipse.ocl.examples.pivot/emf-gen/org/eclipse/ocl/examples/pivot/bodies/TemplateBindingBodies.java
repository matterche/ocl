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
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * TemplateBindingBodies provides the Java implementation bodies of OCL-defined TemplateBinding operations and properties.
 */
@SuppressWarnings("nls")
public class TemplateBindingBodies
{

	/** 
	 * Implementation of the TemplateBinding 'one_parameter_substitution' invariant.
	 */
	public static class _invariant_one_parameter_substitution extends AbstractUnaryOperation
	{
		public static _invariant_one_parameter_substitution INSTANCE = new _invariant_one_parameter_substitution();
	
		/*
		signature.parameter->forAll(p : _'platform:/resource/org.eclipse.ocl.examples.pivot/model/pivot.ecore'::pivot::TemplateParameter |
	  parameterSubstitution->select(b : _'platform:/resource/org.eclipse.ocl.examples.pivot/model/pivot.ecore'::pivot::TemplateParameterSubstitution |
	    (b.formal = p
	    ))
	  ->size() <= 1)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_forAll = OCLstdlibTables.Operations._Collection__0_forAll;
			final ExecutorType T_pivot_ecore__pivot__TemplateParameter = PivotTables.Types._TemplateParameter;
			final DomainCollectionType T_OrderedSet_pivot_ecore__pivot__TemplateParameter_ = standardLibrary.getOrderedSetType(T_pivot_ecore__pivot__TemplateParameter);
			final ExecutorProperty P_TemplateSignature_parameter = PivotTables.Properties._TemplateSignature__parameter;
			final LibraryProperty IP_TemplateSignature_parameter = P_TemplateSignature_parameter.getImplementation();
			final ExecutorType T_pivot_ecore__pivot__TemplateSignature = PivotTables.Types._TemplateSignature;
			final ExecutorProperty P_TemplateBinding_signature = PivotTables.Properties._TemplateBinding__signature;
			final LibraryProperty IP_TemplateBinding_signature = P_TemplateBinding_signature.getImplementation();
			final ExecutorOperation O_Real__lt__eq_ = OCLstdlibTables.Operations._Real___lt__eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_pivot_ecore__pivot__TemplateParameterSubstitution = PivotTables.Types._TemplateParameterSubstitution;
			final DomainCollectionType T_Set_pivot_ecore__pivot__TemplateParameterSubstitution_ = standardLibrary.getSetType(T_pivot_ecore__pivot__TemplateParameterSubstitution);
			final ExecutorOperation O_Set_select = OCLstdlibTables.Operations._Set__select;
			final ExecutorProperty P_TemplateBinding_parameterSubstitution = PivotTables.Properties._TemplateBinding__parameterSubstitution;
			final LibraryProperty IP_TemplateBinding_parameterSubstitution = P_TemplateBinding_parameterSubstitution.getImplementation();
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorProperty P_TemplateParameterSubstitution_formal = PivotTables.Properties._TemplateParameterSubstitution__formal;
			final LibraryProperty IP_TemplateParameterSubstitution_formal = P_TemplateParameterSubstitution_formal.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
			
			Value A_symbol_85 = IP_TemplateBinding_signature.evaluate(evaluator, T_pivot_ecore__pivot__TemplateSignature, self, P_TemplateBinding_signature);
			
			Value A_symbol_83 = IP_TemplateSignature_parameter.evaluate(evaluator, T_OrderedSet_pivot_ecore__pivot__TemplateParameter_, A_symbol_85, P_TemplateSignature_parameter);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_84 = new AbstractBinaryOperation()
			{
			/*
			parameterSubstitution->select(b : _'platform:/resource/org.eclipse.ocl.examples.pivot/model/pivot.ecore'::pivot::TemplateParameterSubstitution |
			  (b.formal = p
			  ))
			->size() <= 1
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_p = iterator1;	// iterator: p
					
					Value A_symbol_86 = IP_TemplateBinding_parameterSubstitution.evaluate(evaluator, T_Set_pivot_ecore__pivot__TemplateParameterSubstitution_, self, P_TemplateBinding_parameterSubstitution);
					
					
					/** 
					 * Implementation of the iterator body.
					 */
					AbstractBinaryOperation body_A_symbol_87 = new AbstractBinaryOperation()
					{
					/*
					b.formal = p
					*/
						public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
							final Value V_b = iterator1;	// iterator: b
							
							Value A_symbol_88 = IP_TemplateParameterSubstitution_formal.evaluate(evaluator, T_pivot_ecore__pivot__TemplateParameter, V_b, P_TemplateParameterSubstitution_formal);
							
							
							DomainType static_A_symbol_89 = valueFactory.typeOf(A_symbol_88, V_p);
							LibraryBinaryOperation dynamic_A_symbol_89 = (LibraryBinaryOperation)static_A_symbol_89.lookupImplementation(standardLibrary, O_OclAny__eq_);
							Value A_symbol_89 = dynamic_A_symbol_89.evaluate(evaluator, T_Boolean, A_symbol_88, V_p);
							return A_symbol_89;
						}
					};
					DomainType static_A_symbol_87 = A_symbol_86.getType();
					LibraryIteration dynamic_A_symbol_87 = (LibraryIteration)static_A_symbol_87.lookupImplementation(standardLibrary, O_Set_select);
					Value acc_A_symbol_87 = dynamic_A_symbol_87.createAccumulatorValue(evaluator, T_Set_pivot_ecore__pivot__TemplateParameterSubstitution_, T_Boolean);
					ExecutorSingleIterationManager manager_A_symbol_87 = new ExecutorSingleIterationManager(evaluator, T_Set_pivot_ecore__pivot__TemplateParameterSubstitution_, body_A_symbol_87, (CollectionValue)A_symbol_86, acc_A_symbol_87);
					Value A_symbol_87 = dynamic_A_symbol_87.evaluateIteration(manager_A_symbol_87);
					DomainType static_A_symbol_90 = valueFactory.typeOf(A_symbol_87);
					LibraryUnaryOperation dynamic_A_symbol_90 = (LibraryUnaryOperation)static_A_symbol_90.lookupImplementation(standardLibrary, O_Collection_size);
					Value A_symbol_90 = dynamic_A_symbol_90.evaluate(evaluator, T_Integer, A_symbol_87);
					DomainType static_A_symbol_91 = valueFactory.typeOf(A_symbol_90, I_1);
					LibraryBinaryOperation dynamic_A_symbol_91 = (LibraryBinaryOperation)static_A_symbol_91.lookupImplementation(standardLibrary, O_Real__lt__eq_);
					Value A_symbol_91 = dynamic_A_symbol_91.evaluate(evaluator, T_Boolean, A_symbol_90, I_1);
					return A_symbol_91;
				}
			};
			DomainType static_A_symbol_84 = A_symbol_83.getType();
			LibraryIteration dynamic_A_symbol_84 = (LibraryIteration)static_A_symbol_84.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_84 = dynamic_A_symbol_84.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_84 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_84, (CollectionValue)A_symbol_83, acc_A_symbol_84);
			Value A_symbol_84 = dynamic_A_symbol_84.evaluateIteration(manager_A_symbol_84);
			return A_symbol_84;
		}
	}

	/** 
	 * Implementation of the TemplateBinding 'parameter_substitution_formal' invariant.
	 */
	public static class _invariant_parameter_substitution_formal extends AbstractUnaryOperation
	{
		public static _invariant_parameter_substitution_formal INSTANCE = new _invariant_parameter_substitution_formal();
	
		/*
		parameterSubstitution->forAll(b : _'platform:/resource/org.eclipse.ocl.examples.pivot/model/pivot.ecore'::pivot::TemplateParameterSubstitution |
	  signature.parameter->includes(b.formal))
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_forAll = OCLstdlibTables.Operations._Collection__0_forAll;
			final ExecutorType T_pivot_ecore__pivot__TemplateParameterSubstitution = PivotTables.Types._TemplateParameterSubstitution;
			final DomainCollectionType T_Set_pivot_ecore__pivot__TemplateParameterSubstitution_ = standardLibrary.getSetType(T_pivot_ecore__pivot__TemplateParameterSubstitution);
			final ExecutorProperty P_TemplateBinding_parameterSubstitution = PivotTables.Properties._TemplateBinding__parameterSubstitution;
			final LibraryProperty IP_TemplateBinding_parameterSubstitution = P_TemplateBinding_parameterSubstitution.getImplementation();
			final ExecutorOperation O_Collection_includes = OCLstdlibTables.Operations._Collection__includes;
			final ExecutorType T_pivot_ecore__pivot__TemplateParameter = PivotTables.Types._TemplateParameter;
			final DomainCollectionType T_OrderedSet_pivot_ecore__pivot__TemplateParameter_ = standardLibrary.getOrderedSetType(T_pivot_ecore__pivot__TemplateParameter);
			final ExecutorProperty P_TemplateSignature_parameter = PivotTables.Properties._TemplateSignature__parameter;
			final LibraryProperty IP_TemplateSignature_parameter = P_TemplateSignature_parameter.getImplementation();
			final ExecutorType T_pivot_ecore__pivot__TemplateSignature = PivotTables.Types._TemplateSignature;
			final ExecutorProperty P_TemplateBinding_signature = PivotTables.Properties._TemplateBinding__signature;
			final LibraryProperty IP_TemplateBinding_signature = P_TemplateBinding_signature.getImplementation();
			final ExecutorProperty P_TemplateParameterSubstitution_formal = PivotTables.Properties._TemplateParameterSubstitution__formal;
			final LibraryProperty IP_TemplateParameterSubstitution_formal = P_TemplateParameterSubstitution_formal.getImplementation();
			
			
			Value A_symbol_92 = IP_TemplateBinding_parameterSubstitution.evaluate(evaluator, T_Set_pivot_ecore__pivot__TemplateParameterSubstitution_, self, P_TemplateBinding_parameterSubstitution);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_93 = new AbstractBinaryOperation()
			{
			/*
			signature.parameter->includes(b.formal)
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_b = iterator1;	// iterator: b
					
					Value A_symbol_94 = IP_TemplateBinding_signature.evaluate(evaluator, T_pivot_ecore__pivot__TemplateSignature, self, P_TemplateBinding_signature);
					
					Value A_symbol_95 = IP_TemplateSignature_parameter.evaluate(evaluator, T_OrderedSet_pivot_ecore__pivot__TemplateParameter_, A_symbol_94, P_TemplateSignature_parameter);
					
					
					Value A_symbol_96 = IP_TemplateParameterSubstitution_formal.evaluate(evaluator, T_pivot_ecore__pivot__TemplateParameter, V_b, P_TemplateParameterSubstitution_formal);
					
					DomainType static_A_symbol_97 = valueFactory.typeOf(A_symbol_95);
					LibraryBinaryOperation dynamic_A_symbol_97 = (LibraryBinaryOperation)static_A_symbol_97.lookupImplementation(standardLibrary, O_Collection_includes);
					Value A_symbol_97 = dynamic_A_symbol_97.evaluate(evaluator, T_Boolean, A_symbol_95, A_symbol_96);
					return A_symbol_97;
				}
			};
			DomainType static_A_symbol_93 = A_symbol_92.getType();
			LibraryIteration dynamic_A_symbol_93 = (LibraryIteration)static_A_symbol_93.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_93 = dynamic_A_symbol_93.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_93 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_93, (CollectionValue)A_symbol_92, acc_A_symbol_93);
			Value A_symbol_93 = dynamic_A_symbol_93.evaluateIteration(manager_A_symbol_93);
			return A_symbol_93;
		}
	}



}

