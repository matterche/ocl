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

import org.eclipse.ocl.examples.domain.elements.DomainClassifierType;
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
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * ParameterableElementBodies provides the Java implementation bodies of OCL-defined ParameterableElement operations and properties.
 */
@SuppressWarnings("nls")
public class ParameterableElementBodies
{

	/** 
	 * Implementation of the ParameterableElement::isCompatibleWith '' <body>.
	 */
	public static class _isCompatibleWith_body_ extends AbstractBinaryOperation
	{
		public static _isCompatibleWith_body_ INSTANCE = new _isCompatibleWith_body_();
	
		/*
		p->oclIsKindOf(self.oclType())
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self, Value p) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_pivot_ecore__pivot__ParameterableElement = PivotTables.Types._ParameterableElement;
			final DomainCollectionType T_Set_pivot_ecore__pivot__ParameterableElement_ = standardLibrary.getSetType(T_pivot_ecore__pivot__ParameterableElement);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorType T_pivot__ParameterableElement = PivotTables.Types._ParameterableElement;
			final DomainClassifierType T_AnyClassifier_pivot__ParameterableElement_ = standardLibrary.getClassifierType(T_pivot__ParameterableElement);
			final ExecutorOperation O_OclAny_oclType = OCLstdlibTables.Operations._OclAny__oclType;
			
			
			DomainType static_A_symbol_105 = valueFactory.typeOf(p);
			LibraryUnaryOperation dynamic_A_symbol_105 = (LibraryUnaryOperation)static_A_symbol_105.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
			Value A_symbol_105 = dynamic_A_symbol_105.evaluate(evaluator, T_Set_pivot_ecore__pivot__ParameterableElement_, p);
			
			DomainType static_A_symbol_106 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_106 = (LibraryUnaryOperation)static_A_symbol_106.lookupImplementation(standardLibrary, O_OclAny_oclType);
			Value A_symbol_106 = dynamic_A_symbol_106.evaluate(evaluator, T_AnyClassifier_pivot__ParameterableElement_, self);
			DomainType static_A_symbol_107 = valueFactory.typeOf(A_symbol_105);
			LibraryBinaryOperation dynamic_A_symbol_107 = (LibraryBinaryOperation)static_A_symbol_107.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
			Value A_symbol_107 = dynamic_A_symbol_107.evaluate(evaluator, T_Boolean, A_symbol_105, A_symbol_106);
			return A_symbol_107;
		}
	}

	/** 
	 * Implementation of the ParameterableElement::isTemplateParameter '' <body>.
	 */
	public static class _isTemplateParameter_body_ extends AbstractUnaryOperation
	{
		public static _isTemplateParameter_body_ INSTANCE = new _isTemplateParameter_body_();
	
		/*
		templateParameter->notEmpty()
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_notEmpty = OCLstdlibTables.Operations._Collection__notEmpty;
			final ExecutorType T_pivot_ecore__pivot__TemplateParameter = PivotTables.Types._TemplateParameter;
			final DomainCollectionType T_Set_pivot_ecore__pivot__TemplateParameter_ = standardLibrary.getSetType(T_pivot_ecore__pivot__TemplateParameter);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorProperty P_ParameterableElement_templateParameter = PivotTables.Properties._ParameterableElement__templateParameter;
			final LibraryProperty IP_ParameterableElement_templateParameter = P_ParameterableElement_templateParameter.getImplementation();
			
			
			Value A_symbol_108 = IP_ParameterableElement_templateParameter.evaluate(evaluator, T_pivot_ecore__pivot__TemplateParameter, self, P_ParameterableElement_templateParameter);
			
			DomainType static_A_symbol_109 = valueFactory.typeOf(A_symbol_108);
			LibraryUnaryOperation dynamic_A_symbol_109 = (LibraryUnaryOperation)static_A_symbol_109.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
			Value A_symbol_109 = dynamic_A_symbol_109.evaluate(evaluator, T_Set_pivot_ecore__pivot__TemplateParameter_, A_symbol_108);
			DomainType static_A_symbol_110 = valueFactory.typeOf(A_symbol_109);
			LibraryUnaryOperation dynamic_A_symbol_110 = (LibraryUnaryOperation)static_A_symbol_110.lookupImplementation(standardLibrary, O_Collection_notEmpty);
			Value A_symbol_110 = dynamic_A_symbol_110.evaluate(evaluator, T_Boolean, A_symbol_109);
			return A_symbol_110;
		}
	}




}

