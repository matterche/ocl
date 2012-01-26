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

import org.eclipse.ocl.examples.domain.elements.DomainClassifierType;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryUnaryOperation;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
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
		p.oclIsKindOf(self.oclType())
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self, final Value p) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__ParameterableElement = PivotTables.Types._ParameterableElement;
			final DomainClassifierType T_AnyClassifier_Pivot_ecore__pivot__ParameterableElement_ = standardLibrary.getClassifierType(T_Pivot_ecore__pivot__ParameterableElement);
			final ExecutorOperation O_OclAny_oclType = OCLstdlibTables.Operations._OclAny__oclType;
			
			
			
			DomainType static_A_symbol_114 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_114 = (LibraryUnaryOperation)static_A_symbol_114.lookupImplementation(standardLibrary, O_OclAny_oclType);
			Value A_symbol_114 = dynamic_A_symbol_114.evaluate(evaluator, T_AnyClassifier_Pivot_ecore__pivot__ParameterableElement_, self);
			DomainType static_A_symbol_115 = valueFactory.typeOf(p);
			LibraryBinaryOperation dynamic_A_symbol_115 = (LibraryBinaryOperation)static_A_symbol_115.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
			Value A_symbol_115 = dynamic_A_symbol_115.evaluate(evaluator, T_Boolean, p, A_symbol_114);
			return A_symbol_115;
		}
	}





}

