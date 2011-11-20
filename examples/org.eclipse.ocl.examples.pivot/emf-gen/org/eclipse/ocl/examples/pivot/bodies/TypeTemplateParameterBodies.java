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
 * TypeTemplateParameterBodies provides the Java implementation bodies of OCL-defined TypeTemplateParameter operations and properties.
 */
@SuppressWarnings("nls")
public class TypeTemplateParameterBodies
{

	/** 
	 * Implementation of the TypeTemplateParameter 'has_constraining_type' invariant.
	 */
	public static class _invariant_has_constraining_type extends AbstractUnaryOperation
	{
		public static _invariant_has_constraining_type INSTANCE = new _invariant_has_constraining_type();
	
		/*
		allowSubstitutable implies constrainingType->notEmpty()
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorProperty P_TypeTemplateParameter_allowSubstitutable = PivotTables.Properties._TypeTemplateParameter__allowSubstitutable;
			final LibraryProperty IP_TypeTemplateParameter_allowSubstitutable = P_TypeTemplateParameter_allowSubstitutable.getImplementation();
			final ExecutorOperation O_Collection_notEmpty = OCLstdlibTables.Operations._Collection__notEmpty;
			final ExecutorType T_pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final DomainCollectionType T_Set_pivot_ecore__pivot__Type_ = standardLibrary.getSetType(T_pivot_ecore__pivot__Type);
			final ExecutorProperty P_TypeTemplateParameter_constrainingType = PivotTables.Properties._TypeTemplateParameter__constrainingType;
			final LibraryProperty IP_TypeTemplateParameter_constrainingType = P_TypeTemplateParameter_constrainingType.getImplementation();
			
			Value leftA_symbol_67;
			try {
				
				Value A_symbol_68 = IP_TypeTemplateParameter_allowSubstitutable.evaluate(evaluator, T_Boolean, self, P_TypeTemplateParameter_allowSubstitutable);
				
				leftA_symbol_67 = A_symbol_68;
			} catch (InvalidValueException e) {
				leftA_symbol_67 = valueFactory.getInvalid();
			}
			Value A_symbol_68 = leftA_symbol_67;
			Value rightA_symbol_67;
			try {
				
				Value A_symbol_69 = IP_TypeTemplateParameter_constrainingType.evaluate(evaluator, T_Set_pivot_ecore__pivot__Type_, self, P_TypeTemplateParameter_constrainingType);
				
				DomainType static_A_symbol_70 = valueFactory.typeOf(A_symbol_69);
				LibraryUnaryOperation dynamic_A_symbol_70 = (LibraryUnaryOperation)static_A_symbol_70.lookupImplementation(standardLibrary, O_Collection_notEmpty);
				Value A_symbol_70 = dynamic_A_symbol_70.evaluate(evaluator, T_Boolean, A_symbol_69);
				rightA_symbol_67 = A_symbol_70;
			} catch (InvalidValueException e) {
				rightA_symbol_67 = valueFactory.getInvalid();
			}
			Value A_symbol_70 = rightA_symbol_67;
			DomainType static_A_symbol_67 = valueFactory.typeOf(A_symbol_68);
			LibraryBinaryOperation dynamic_A_symbol_67 = (LibraryBinaryOperation)static_A_symbol_67.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_67 = dynamic_A_symbol_67.evaluate(evaluator, T_Boolean, A_symbol_68, A_symbol_70);
			return A_symbol_67;
		}
	}


}

