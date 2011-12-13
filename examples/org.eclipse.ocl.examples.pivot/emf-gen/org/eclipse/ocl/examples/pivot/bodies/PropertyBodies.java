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
 * PropertyBodies provides the Java implementation bodies of OCL-defined Property operations and properties.
 */
@SuppressWarnings("nls")
public class PropertyBodies
{

	/** 
	 * Implementation of the Property::isAttribute '' <body>.
	 */
	public static class _isAttribute_body_ extends AbstractBinaryOperation
	{
		public static _isAttribute_body_ INSTANCE = new _isAttribute_body_();
	
		/*
		let container : OclElement = oclContainer()
	in
	  container.oclIsKindOf(Type) and
	  container.oclAsType(Type)
	  .ownedAttribute->includes(self)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self, Value p) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_and = OCLstdlibTables.Operations._Boolean__and;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final Value T_ClassClassifier_Pivot_ecore__pivot__Type_ = valueFactory.createTypeValue(PivotTables.Types._Type);
			final ExecutorOperation O_Collection_includes = OCLstdlibTables.Operations._Collection__includes;
			final ExecutorType T_Pivot_ecore__pivot__Property = PivotTables.Types._Property;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Property_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Property);
			final ExecutorProperty P_Type_ownedAttribute = PivotTables.Properties._Type__ownedAttribute;
			final LibraryProperty IP_Type_ownedAttribute = P_Type_ownedAttribute.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorOperation O_OclAny_oclAsType = OCLstdlibTables.Operations._OclAny__oclAsType;
			final ExecutorType T_OclElement = OCLstdlibTables.Types._OclElement;
			final ExecutorOperation O_OclElement_oclContainer = OCLstdlibTables.Operations._OclElement__oclContainer;
			
			
			DomainType static_A_symbol_0 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_0 = (LibraryUnaryOperation)static_A_symbol_0.lookupImplementation(standardLibrary, O_OclElement_oclContainer);
			Value A_symbol_0 = dynamic_A_symbol_0.evaluate(evaluator, T_OclElement, self);
			final Value V_container = A_symbol_0;
			Value leftA_symbol_1;
			try {
				
				DomainType static_A_symbol_2 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_2 = (LibraryBinaryOperation)static_A_symbol_2.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_2 = dynamic_A_symbol_2.evaluate(evaluator, T_Boolean, V_container, T_ClassClassifier_Pivot_ecore__pivot__Type_);
				leftA_symbol_1 = A_symbol_2;
			} catch (InvalidValueException e) {
				leftA_symbol_1 = valueFactory.getInvalid();
			}
			Value A_symbol_2 = leftA_symbol_1;
			Value rightA_symbol_1;
			try {
				
				DomainType static_A_symbol_3 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_3 = (LibraryBinaryOperation)static_A_symbol_3.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_3 = dynamic_A_symbol_3.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_container, T_ClassClassifier_Pivot_ecore__pivot__Type_);
				Value A_symbol_4 = IP_Type_ownedAttribute.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Property_, A_symbol_3, P_Type_ownedAttribute);
				
				
				DomainType static_A_symbol_5 = valueFactory.typeOf(A_symbol_4);
				LibraryBinaryOperation dynamic_A_symbol_5 = (LibraryBinaryOperation)static_A_symbol_5.lookupImplementation(standardLibrary, O_Collection_includes);
				Value A_symbol_5 = dynamic_A_symbol_5.evaluate(evaluator, T_Boolean, A_symbol_4, self);
				rightA_symbol_1 = A_symbol_5;
			} catch (InvalidValueException e) {
				rightA_symbol_1 = valueFactory.getInvalid();
			}
			Value A_symbol_5 = rightA_symbol_1;
			DomainType static_A_symbol_1 = valueFactory.typeOf(A_symbol_2);
			LibraryBinaryOperation dynamic_A_symbol_1 = (LibraryBinaryOperation)static_A_symbol_1.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_1 = dynamic_A_symbol_1.evaluate(evaluator, T_Boolean, A_symbol_2, A_symbol_5);
			final Value A_symbol_6 = A_symbol_1;
			return A_symbol_6;
		}
	}


















}

