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
			
			
			Value A_symbol_47 = IP_TemplateableElement_ownedTemplateSignature.evaluate(evaluator, T_pivot_ecore__pivot__TemplateSignature, self, P_TemplateableElement_ownedTemplateSignature);
			
			DomainType static_A_symbol_48 = valueFactory.typeOf(A_symbol_47);
			LibraryUnaryOperation dynamic_A_symbol_48 = (LibraryUnaryOperation)static_A_symbol_48.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
			Value A_symbol_48 = dynamic_A_symbol_48.evaluate(evaluator, T_Set_pivot_ecore__pivot__TemplateSignature_, A_symbol_47);
			DomainType static_A_symbol_49 = valueFactory.typeOf(A_symbol_48);
			LibraryUnaryOperation dynamic_A_symbol_49 = (LibraryUnaryOperation)static_A_symbol_49.lookupImplementation(standardLibrary, O_Collection_notEmpty);
			Value A_symbol_49 = dynamic_A_symbol_49.evaluate(evaluator, T_Boolean, A_symbol_48);
			return A_symbol_49;
		}
	}

	/** 
	 * Implementation of the TemplateableElement::parameterableElements '' <body>.
	 */
	public static class _parameterableElements_body_ extends AbstractUnaryOperation
	{
		public static _parameterableElements_body_ INSTANCE = new _parameterableElements_body_();
	
		/*
		Errors in 'http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!parameterableElements()'
			bad expression 'allOwnedElements()->select(oclIsKindOf(ParameterableElement))'
		Unresolved operation 'allOwnedElements' for 'unknown-type'
		*/
	}



}

