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
 * TemplateSignatureBodies provides the Java implementation bodies of OCL-defined TemplateSignature operations and properties.
 */
@SuppressWarnings("nls")
public class TemplateSignatureBodies
{

	/** 
	 * Implementation of the TemplateSignature 'own_elements' invariant.
	 */
	public static class _invariant_own_elements extends AbstractUnaryOperation
	{
		public static _invariant_own_elements INSTANCE = new _invariant_own_elements();
	
		/*
		template.oclContents()
	->includesAll(
	  parameter.parameteredElement->asSet() -
	  parameter.ownedParameteredElement->asSet())
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_includesAll = OCLstdlibTables.Operations._Collection__includesAll;
			final ExecutorType T_OclElement = OCLstdlibTables.Types._OclElement;
			final DomainCollectionType T_Set_OclElement_ = standardLibrary.getSetType(T_OclElement);
			final ExecutorOperation O_OclElement_oclContents = OCLstdlibTables.Operations._OclElement__oclContents;
			final ExecutorType T_pivot_ecore__pivot__TemplateableElement = PivotTables.Types._TemplateableElement;
			final ExecutorProperty P_TemplateSignature_template = PivotTables.Properties._TemplateSignature__template;
			final LibraryProperty IP_TemplateSignature_template = P_TemplateSignature_template.getImplementation();
			final ExecutorType T_pivot_ecore__pivot__ParameterableElement = PivotTables.Types._ParameterableElement;
			final DomainCollectionType T_Set_pivot_ecore__pivot__ParameterableElement_ = standardLibrary.getSetType(T_pivot_ecore__pivot__ParameterableElement);
			final ExecutorOperation O_Set__sub_ = OCLstdlibTables.Operations._Set___sub_;
			final ExecutorOperation O_Collection_asSet = OCLstdlibTables.Operations._Collection__asSet;
			final DomainCollectionType T_Sequence_pivot_ecore__pivot__ParameterableElement_ = standardLibrary.getSequenceType(T_pivot_ecore__pivot__ParameterableElement);
			final ExecutorOperation O_Sequence_collect = OCLstdlibTables.Operations._Sequence__collect;
			final ExecutorType T_pivot_ecore__pivot__TemplateParameter = PivotTables.Types._TemplateParameter;
			final DomainCollectionType T_OrderedSet_pivot_ecore__pivot__TemplateParameter_ = standardLibrary.getOrderedSetType(T_pivot_ecore__pivot__TemplateParameter);
			final ExecutorProperty P_TemplateSignature_parameter = PivotTables.Properties._TemplateSignature__parameter;
			final LibraryProperty IP_TemplateSignature_parameter = P_TemplateSignature_parameter.getImplementation();
			final ExecutorProperty P_TemplateParameter_parameteredElement = PivotTables.Properties._TemplateParameter__parameteredElement;
			final LibraryProperty IP_TemplateParameter_parameteredElement = P_TemplateParameter_parameteredElement.getImplementation();
			final ExecutorProperty P_TemplateParameter_ownedParameteredElement = PivotTables.Properties._TemplateParameter__ownedParameteredElement;
			final LibraryProperty IP_TemplateParameter_ownedParameteredElement = P_TemplateParameter_ownedParameteredElement.getImplementation();
			
			
			Value A_symbol_111 = IP_TemplateSignature_template.evaluate(evaluator, T_pivot_ecore__pivot__TemplateableElement, self, P_TemplateSignature_template);
			
			DomainType static_A_symbol_112 = valueFactory.typeOf(A_symbol_111);
			LibraryUnaryOperation dynamic_A_symbol_112 = (LibraryUnaryOperation)static_A_symbol_112.lookupImplementation(standardLibrary, O_OclElement_oclContents);
			Value A_symbol_112 = dynamic_A_symbol_112.evaluate(evaluator, T_Set_OclElement_, A_symbol_111);
			
			Value A_symbol_113 = IP_TemplateSignature_parameter.evaluate(evaluator, T_OrderedSet_pivot_ecore__pivot__TemplateParameter_, self, P_TemplateSignature_parameter);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_114 = new AbstractBinaryOperation()
			{
			/*
			parameteredElement
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_115 = IP_TemplateParameter_parameteredElement.evaluate(evaluator, T_pivot_ecore__pivot__ParameterableElement, V_1_, P_TemplateParameter_parameteredElement);
					
					return A_symbol_115;
				}
			};
			DomainType static_A_symbol_114 = A_symbol_113.getType();
			LibraryIteration dynamic_A_symbol_114 = (LibraryIteration)static_A_symbol_114.lookupImplementation(standardLibrary, O_Sequence_collect);
			Value acc_A_symbol_114 = dynamic_A_symbol_114.createAccumulatorValue(evaluator, T_Sequence_pivot_ecore__pivot__ParameterableElement_, T_pivot_ecore__pivot__ParameterableElement);
			ExecutorSingleIterationManager manager_A_symbol_114 = new ExecutorSingleIterationManager(evaluator, T_Sequence_pivot_ecore__pivot__ParameterableElement_, body_A_symbol_114, (CollectionValue)A_symbol_113, acc_A_symbol_114);
			Value A_symbol_114 = dynamic_A_symbol_114.evaluateIteration(manager_A_symbol_114);
			DomainType static_A_symbol_116 = valueFactory.typeOf(A_symbol_114);
			LibraryUnaryOperation dynamic_A_symbol_116 = (LibraryUnaryOperation)static_A_symbol_116.lookupImplementation(standardLibrary, O_Collection_asSet);
			Value A_symbol_116 = dynamic_A_symbol_116.evaluate(evaluator, T_Set_pivot_ecore__pivot__ParameterableElement_, A_symbol_114);
			
			Value A_symbol_117 = IP_TemplateSignature_parameter.evaluate(evaluator, T_OrderedSet_pivot_ecore__pivot__TemplateParameter_, self, P_TemplateSignature_parameter);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_118 = new AbstractBinaryOperation()
			{
			/*
			ownedParameteredElement
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_1 = iterator1;	// iterator: 1_
					
					Value A_symbol_119 = IP_TemplateParameter_ownedParameteredElement.evaluate(evaluator, T_pivot_ecore__pivot__ParameterableElement, V_1_1, P_TemplateParameter_ownedParameteredElement);
					
					return A_symbol_119;
				}
			};
			DomainType static_A_symbol_118 = A_symbol_117.getType();
			LibraryIteration dynamic_A_symbol_118 = (LibraryIteration)static_A_symbol_118.lookupImplementation(standardLibrary, O_Sequence_collect);
			Value acc_A_symbol_118 = dynamic_A_symbol_118.createAccumulatorValue(evaluator, T_Sequence_pivot_ecore__pivot__ParameterableElement_, T_pivot_ecore__pivot__ParameterableElement);
			ExecutorSingleIterationManager manager_A_symbol_118 = new ExecutorSingleIterationManager(evaluator, T_Sequence_pivot_ecore__pivot__ParameterableElement_, body_A_symbol_118, (CollectionValue)A_symbol_117, acc_A_symbol_118);
			Value A_symbol_118 = dynamic_A_symbol_118.evaluateIteration(manager_A_symbol_118);
			DomainType static_A_symbol_120 = valueFactory.typeOf(A_symbol_118);
			LibraryUnaryOperation dynamic_A_symbol_120 = (LibraryUnaryOperation)static_A_symbol_120.lookupImplementation(standardLibrary, O_Collection_asSet);
			Value A_symbol_120 = dynamic_A_symbol_120.evaluate(evaluator, T_Set_pivot_ecore__pivot__ParameterableElement_, A_symbol_118);
			DomainType static_A_symbol_121 = valueFactory.typeOf(A_symbol_116);
			LibraryBinaryOperation dynamic_A_symbol_121 = (LibraryBinaryOperation)static_A_symbol_121.lookupImplementation(standardLibrary, O_Set__sub_);
			Value A_symbol_121 = dynamic_A_symbol_121.evaluate(evaluator, T_Set_pivot_ecore__pivot__ParameterableElement_, A_symbol_116, A_symbol_120);
			DomainType static_A_symbol_122 = valueFactory.typeOf(A_symbol_112);
			LibraryBinaryOperation dynamic_A_symbol_122 = (LibraryBinaryOperation)static_A_symbol_122.lookupImplementation(standardLibrary, O_Collection_includesAll);
			Value A_symbol_122 = dynamic_A_symbol_122.evaluate(evaluator, T_Boolean, A_symbol_112, A_symbol_121);
			return A_symbol_122;
		}
	}




}

