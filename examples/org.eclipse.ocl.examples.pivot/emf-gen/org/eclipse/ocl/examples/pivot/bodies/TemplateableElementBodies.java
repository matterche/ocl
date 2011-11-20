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
 * TemplateableElementBodies provides the Java implementation bodies of OCL-defined TemplateableElement operations and properties.
 */
@SuppressWarnings("nls")
public class TemplateableElementBodies
{

	/** 
	 * Implementation of the TemplateableElement::isTemplate '' <body>.
	 */
	public static class _isTemplate_body_ extends AbstractUnaryOperation
	{
		public static _isTemplate_body_ INSTANCE = new _isTemplate_body_();
	
		/*
		ownedTemplateSignature->notEmpty()
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_notEmpty = OCLstdlibTables.Operations._Collection__notEmpty;
			final ExecutorType T_pivot_ecore__pivot__TemplateSignature = PivotTables.Types._TemplateSignature;
			final DomainCollectionType T_Set_pivot_ecore__pivot__TemplateSignature_ = standardLibrary.getSetType(T_pivot_ecore__pivot__TemplateSignature);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorProperty P_TemplateableElement_ownedTemplateSignature = PivotTables.Properties._TemplateableElement__ownedTemplateSignature;
			final LibraryProperty IP_TemplateableElement_ownedTemplateSignature = P_TemplateableElement_ownedTemplateSignature.getImplementation();
			
			
			Value A_symbol_21 = IP_TemplateableElement_ownedTemplateSignature.evaluate(evaluator, T_pivot_ecore__pivot__TemplateSignature, self, P_TemplateableElement_ownedTemplateSignature);
			
			DomainType static_A_symbol_22 = valueFactory.typeOf(A_symbol_21);
			LibraryUnaryOperation dynamic_A_symbol_22 = (LibraryUnaryOperation)static_A_symbol_22.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
			Value A_symbol_22 = dynamic_A_symbol_22.evaluate(evaluator, T_Set_pivot_ecore__pivot__TemplateSignature_, A_symbol_21);
			DomainType static_A_symbol_23 = valueFactory.typeOf(A_symbol_22);
			LibraryUnaryOperation dynamic_A_symbol_23 = (LibraryUnaryOperation)static_A_symbol_23.lookupImplementation(standardLibrary, O_Collection_notEmpty);
			Value A_symbol_23 = dynamic_A_symbol_23.evaluate(evaluator, T_Boolean, A_symbol_22);
			return A_symbol_23;
		}
	}

	/** 
	 * Implementation of the TemplateableElement::parameterableElements '' <body>.
	 */
	public static class _parameterableElements_body_ extends AbstractUnaryOperation
	{
		public static _parameterableElements_body_ INSTANCE = new _parameterableElements_body_();
	
		/*
		allOwnedElements()
	->select(
	  oclIsKindOf(_'platform:/resource/org.eclipse.ocl.examples.pivot/model/pivot.ecore'::pivot::ParameterableElement))
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_pivot_ecore__pivot__Element = PivotTables.Types._Element;
			final DomainCollectionType T_Set_pivot_ecore__pivot__Element_ = standardLibrary.getSetType(T_pivot_ecore__pivot__Element);
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Set_select = OCLstdlibTables.Operations._Set__select;
			final ExecutorOperation O_Element_allOwnedElements = PivotTables.Operations._Element__allOwnedElements;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final Value T_ClassClassifier_pivot_ecore__pivot__ParameterableElement_ = valueFactory.createTypeValue(PivotTables.Types._ParameterableElement);
			
			
			DomainType static_A_symbol_24 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_24 = (LibraryUnaryOperation)static_A_symbol_24.lookupImplementation(standardLibrary, O_Element_allOwnedElements);
			Value A_symbol_24 = dynamic_A_symbol_24.evaluate(evaluator, T_Set_pivot_ecore__pivot__Element_, self);
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_25 = new AbstractBinaryOperation()
			{
			/*
			oclIsKindOf(_'platform:/resource/org.eclipse.ocl.examples.pivot/model/pivot.ecore'::pivot::ParameterableElement)
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					DomainType static_A_symbol_26 = valueFactory.typeOf(V_1_);
					LibraryBinaryOperation dynamic_A_symbol_26 = (LibraryBinaryOperation)static_A_symbol_26.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_26 = dynamic_A_symbol_26.evaluate(evaluator, T_Boolean, V_1_, T_ClassClassifier_pivot_ecore__pivot__ParameterableElement_);
					return A_symbol_26;
				}
			};
			DomainType static_A_symbol_25 = A_symbol_24.getType();
			LibraryIteration dynamic_A_symbol_25 = (LibraryIteration)static_A_symbol_25.lookupImplementation(standardLibrary, O_Set_select);
			Value acc_A_symbol_25 = dynamic_A_symbol_25.createAccumulatorValue(evaluator, T_Set_pivot_ecore__pivot__Element_, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_25 = new ExecutorSingleIterationManager(evaluator, T_Set_pivot_ecore__pivot__Element_, body_A_symbol_25, (CollectionValue)A_symbol_24, acc_A_symbol_25);
			Value A_symbol_25 = dynamic_A_symbol_25.evaluateIteration(manager_A_symbol_25);
			return A_symbol_25;
		}
	}



}

