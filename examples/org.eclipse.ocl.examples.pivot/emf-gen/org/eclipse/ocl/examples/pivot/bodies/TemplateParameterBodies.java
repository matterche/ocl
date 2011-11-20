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
 * TemplateParameterBodies provides the Java implementation bodies of OCL-defined TemplateParameter operations and properties.
 */
@SuppressWarnings("nls")
public class TemplateParameterBodies
{

	/** 
	 * Implementation of the TemplateParameter 'must_be_compatible' invariant.
	 */
	public static class _invariant_must_be_compatible extends AbstractUnaryOperation
	{
		public static _invariant_must_be_compatible INSTANCE = new _invariant_must_be_compatible();
	
		/*
		default->notEmpty() implies
	default.isCompatibleWith(parameteredElement)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_Collection_notEmpty = OCLstdlibTables.Operations._Collection__notEmpty;
			final ExecutorType T_pivot_ecore__pivot__ParameterableElement = PivotTables.Types._ParameterableElement;
			final DomainCollectionType T_Set_pivot_ecore__pivot__ParameterableElement_ = standardLibrary.getSetType(T_pivot_ecore__pivot__ParameterableElement);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorProperty P_TemplateParameter_default = PivotTables.Properties._TemplateParameter__default;
			final LibraryProperty IP_TemplateParameter_default = P_TemplateParameter_default.getImplementation();
			final ExecutorOperation O_ParameterableElement_isCompatibleWith = PivotTables.Operations._ParameterableElement__isCompatibleWith;
			final ExecutorProperty P_TemplateParameter_parameteredElement = PivotTables.Properties._TemplateParameter__parameteredElement;
			final LibraryProperty IP_TemplateParameter_parameteredElement = P_TemplateParameter_parameteredElement.getImplementation();
			
			Value leftA_symbol_98;
			try {
				
				Value A_symbol_99 = IP_TemplateParameter_default.evaluate(evaluator, T_pivot_ecore__pivot__ParameterableElement, self, P_TemplateParameter_default);
				
				DomainType static_A_symbol_100 = valueFactory.typeOf(A_symbol_99);
				LibraryUnaryOperation dynamic_A_symbol_100 = (LibraryUnaryOperation)static_A_symbol_100.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
				Value A_symbol_100 = dynamic_A_symbol_100.evaluate(evaluator, T_Set_pivot_ecore__pivot__ParameterableElement_, A_symbol_99);
				DomainType static_A_symbol_101 = valueFactory.typeOf(A_symbol_100);
				LibraryUnaryOperation dynamic_A_symbol_101 = (LibraryUnaryOperation)static_A_symbol_101.lookupImplementation(standardLibrary, O_Collection_notEmpty);
				Value A_symbol_101 = dynamic_A_symbol_101.evaluate(evaluator, T_Boolean, A_symbol_100);
				leftA_symbol_98 = A_symbol_101;
			} catch (InvalidValueException e) {
				leftA_symbol_98 = valueFactory.getInvalid();
			}
			Value A_symbol_101 = leftA_symbol_98;
			Value rightA_symbol_98;
			try {
				
				Value A_symbol_102 = IP_TemplateParameter_default.evaluate(evaluator, T_pivot_ecore__pivot__ParameterableElement, self, P_TemplateParameter_default);
				
				
				Value A_symbol_103 = IP_TemplateParameter_parameteredElement.evaluate(evaluator, T_pivot_ecore__pivot__ParameterableElement, self, P_TemplateParameter_parameteredElement);
				
				DomainType static_A_symbol_104 = valueFactory.typeOf(A_symbol_102);
				LibraryBinaryOperation dynamic_A_symbol_104 = (LibraryBinaryOperation)static_A_symbol_104.lookupImplementation(standardLibrary, O_ParameterableElement_isCompatibleWith);
				Value A_symbol_104 = dynamic_A_symbol_104.evaluate(evaluator, T_Boolean, A_symbol_102, A_symbol_103);
				rightA_symbol_98 = A_symbol_104;
			} catch (InvalidValueException e) {
				rightA_symbol_98 = valueFactory.getInvalid();
			}
			Value A_symbol_104 = rightA_symbol_98;
			DomainType static_A_symbol_98 = valueFactory.typeOf(A_symbol_101);
			LibraryBinaryOperation dynamic_A_symbol_98 = (LibraryBinaryOperation)static_A_symbol_98.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_98 = dynamic_A_symbol_98.evaluate(evaluator, T_Boolean, A_symbol_101, A_symbol_104);
			return A_symbol_98;
		}
	}







}

