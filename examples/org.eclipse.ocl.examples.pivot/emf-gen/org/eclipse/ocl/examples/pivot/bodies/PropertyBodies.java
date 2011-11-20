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
	  container.oclIsKindOf(_'platform:/resource/org.eclipse.ocl.examples.pivot/model/pivot.ecore'::pivot::Type) and
	  container.oclAsType(_'platform:/resource/org.eclipse.ocl.examples.pivot/model/pivot.ecore'::pivot::Type)
	  .ownedAttribute->includes(self)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self, Value p) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_and = OCLstdlibTables.Operations._Boolean__and;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final Value T_ClassClassifier_pivot_ecore__pivot__Type_ = valueFactory.createTypeValue(PivotTables.Types._Type);
			final ExecutorOperation O_Collection_includes = OCLstdlibTables.Operations._Collection__includes;
			final ExecutorType T_pivot_ecore__pivot__Property = PivotTables.Types._Property;
			final DomainCollectionType T_OrderedSet_pivot_ecore__pivot__Property_ = standardLibrary.getOrderedSetType(T_pivot_ecore__pivot__Property);
			final ExecutorProperty P_Type_ownedAttribute = PivotTables.Properties._Type__ownedAttribute;
			final LibraryProperty IP_Type_ownedAttribute = P_Type_ownedAttribute.getImplementation();
			final ExecutorType T_pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorOperation O_OclAny_oclAsType = OCLstdlibTables.Operations._OclAny__oclAsType;
			final ExecutorType T_OclElement = OCLstdlibTables.Types._OclElement;
			final ExecutorOperation O_OclElement_oclContainer = OCLstdlibTables.Operations._OclElement__oclContainer;
			
			
			DomainType static_A_symbol_6 = valueFactory.typeOf(self);
			LibraryUnaryOperation dynamic_A_symbol_6 = (LibraryUnaryOperation)static_A_symbol_6.lookupImplementation(standardLibrary, O_OclElement_oclContainer);
			Value A_symbol_6 = dynamic_A_symbol_6.evaluate(evaluator, T_OclElement, self);
			final Value V_container = A_symbol_6;
			Value leftA_symbol_7;
			try {
				
				DomainType static_A_symbol_8 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_8 = (LibraryBinaryOperation)static_A_symbol_8.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_8 = dynamic_A_symbol_8.evaluate(evaluator, T_Boolean, V_container, T_ClassClassifier_pivot_ecore__pivot__Type_);
				leftA_symbol_7 = A_symbol_8;
			} catch (InvalidValueException e) {
				leftA_symbol_7 = valueFactory.getInvalid();
			}
			Value A_symbol_8 = leftA_symbol_7;
			Value rightA_symbol_7;
			try {
				
				DomainType static_A_symbol_9 = valueFactory.typeOf(V_container);
				LibraryBinaryOperation dynamic_A_symbol_9 = (LibraryBinaryOperation)static_A_symbol_9.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_9 = dynamic_A_symbol_9.evaluate(evaluator, T_pivot_ecore__pivot__Type, V_container, T_ClassClassifier_pivot_ecore__pivot__Type_);
				Value A_symbol_10 = IP_Type_ownedAttribute.evaluate(evaluator, T_OrderedSet_pivot_ecore__pivot__Property_, A_symbol_9, P_Type_ownedAttribute);
				
				
				DomainType static_A_symbol_11 = valueFactory.typeOf(A_symbol_10);
				LibraryBinaryOperation dynamic_A_symbol_11 = (LibraryBinaryOperation)static_A_symbol_11.lookupImplementation(standardLibrary, O_Collection_includes);
				Value A_symbol_11 = dynamic_A_symbol_11.evaluate(evaluator, T_Boolean, A_symbol_10, self);
				rightA_symbol_7 = A_symbol_11;
			} catch (InvalidValueException e) {
				rightA_symbol_7 = valueFactory.getInvalid();
			}
			Value A_symbol_11 = rightA_symbol_7;
			DomainType static_A_symbol_7 = valueFactory.typeOf(A_symbol_8);
			LibraryBinaryOperation dynamic_A_symbol_7 = (LibraryBinaryOperation)static_A_symbol_7.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_7 = dynamic_A_symbol_7.evaluate(evaluator, T_Boolean, A_symbol_8, A_symbol_11);
			final Value A_symbol_12 = A_symbol_7;
			return A_symbol_12;
		}
	}


















}

