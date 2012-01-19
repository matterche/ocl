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

import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * CollectionItemBodies provides the Java implementation bodies of OCL-defined CollectionItem operations and properties.
 */
@SuppressWarnings("nls")
public class CollectionItemBodies
{

	/** 
	 * Implementation of the CollectionItem 'TypeIsItemType' invariant.
	 */
	public static class _invariant_TypeIsItemType extends AbstractUnaryOperation
	{
		public static _invariant_TypeIsItemType INSTANCE = new _invariant_TypeIsItemType();
	
		/*
		type = item.type
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_CollectionItem_item = PivotTables.Properties._CollectionItem__item;
			final LibraryProperty IP_CollectionItem_item = P_CollectionItem_item.getImplementation();
			
			
			Value A_symbol_346 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
			
			
			Value A_symbol_347 = IP_CollectionItem_item.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CollectionItem_item);
			
			Value A_symbol_348 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_347, P_TypedElement_type);
			
			DomainType static_A_symbol_349 = valueFactory.typeOf(A_symbol_346, A_symbol_348);
			LibraryBinaryOperation dynamic_A_symbol_349 = (LibraryBinaryOperation)static_A_symbol_349.lookupImplementation(standardLibrary, O_OclAny__eq_);
			Value A_symbol_349 = dynamic_A_symbol_349.evaluate(evaluator, T_Boolean, A_symbol_346, A_symbol_348);
			return A_symbol_349;
		}
	}

}

