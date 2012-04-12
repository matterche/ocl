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
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.StringValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * TypedMultiplicityElementBodies provides the Java implementation bodies of OCL-defined TypedMultiplicityElement operations and properties.
 */
@SuppressWarnings("nls")
public class TypedMultiplicityElementBodies
{

	/** 
	 * Implementation of the TypedMultiplicityElement::CompatibleBody '' <body>.
	 */
	public static class _CompatibleBody_body_ extends AbstractBinaryOperation
	{
		public static _CompatibleBody_body_ INSTANCE = new _CompatibleBody_body_();
	
		/*
		let bodyType : Type = bodySpecification.type
	in
	  if bodyType.oclIsKindOf(CollectionType)
	  then
	    let
	      bodyCollectionType : CollectionType = bodyType.oclAsType(CollectionType)
	    in
	      let bodyElementType : Type = bodyCollectionType.elementType
	      in
	        bodyElementType.conformsTo(self.type) and self.isOrdered =
	        (
	          bodyCollectionType.conformsTo(OrderedSet(OclAny)) or
	          bodyCollectionType.conformsTo(Sequence(OclAny))
	        ) and self.isUnique =
	        (
	          bodyCollectionType.conformsTo(OrderedSet(OclAny)) or
	          bodyCollectionType.conformsTo(Set(OclAny))
	        )
	  else bodyType.conformsTo(self.type)
	  endif
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self, final Value bodySpecification) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final Value T_ClassClassifier_Pivot_ecore__pivot__CollectionType_ = valueFactory.createTypeValue(PivotTables.Types._CollectionType);
			final ExecutorOperation O_Boolean_and = OCLstdlibTables.Operations._Boolean__and;
			final ExecutorOperation O_OclType_conformsTo = OCLstdlibTables.Operations._OclType__conformsTo;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorOperation O_Boolean__eq_ = OCLstdlibTables.Operations._Boolean___eq_;
			final ExecutorProperty P_MultiplicityElement_isOrdered = PivotTables.Properties._MultiplicityElement__isOrdered;
			final LibraryProperty IP_MultiplicityElement_isOrdered = P_MultiplicityElement_isOrdered.getImplementation();
			final ExecutorOperation O_Boolean_or = OCLstdlibTables.Operations._Boolean__or;
			final Value T_CollectionClassifier_OrderedSet_OclAny__OclAny_ = valueFactory.createTypeValue(OCLstdlibTables.Types._OrderedSet);
			final Value T_CollectionClassifier_Sequence_OclAny__OclAny_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Sequence);
			final ExecutorProperty P_MultiplicityElement_isUnique = PivotTables.Properties._MultiplicityElement__isUnique;
			final LibraryProperty IP_MultiplicityElement_isUnique = P_MultiplicityElement_isUnique.getImplementation();
			final Value T_CollectionClassifier_Set_OclAny__OclAny_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Set);
			final ExecutorProperty P_CollectionType_elementType = PivotTables.Properties._CollectionType__elementType;
			final LibraryProperty IP_CollectionType_elementType = P_CollectionType_elementType.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__CollectionType = PivotTables.Types._CollectionType;
			final ExecutorOperation O_OclAny_oclAsType = OCLstdlibTables.Operations._OclAny__oclAsType;
			
			
			Value A_symbol_390 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, bodySpecification, P_TypedElement_type);
			
			final Value V_bodyType = A_symbol_390;
				
				DomainType static_A_symbol_391 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_391 = (LibraryBinaryOperation)static_A_symbol_391.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_391 = dynamic_A_symbol_391.evaluate(evaluator, T_Boolean, V_bodyType, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
			Value A_symbol_392;
			if (A_symbol_391.isTrue()) {
				
				DomainType static_A_symbol_393 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_393 = (LibraryBinaryOperation)static_A_symbol_393.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_393 = dynamic_A_symbol_393.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, V_bodyType, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				final Value V_bodyCollectionType = A_symbol_393;
				
				Value A_symbol_394 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_bodyCollectionType, P_CollectionType_elementType);
				
				final Value V_bodyElementType = A_symbol_394;
				Value leftA_symbol_395;
				try {
					Value leftA_symbol_396;
					try {
						
						
						Value A_symbol_397 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
						
						DomainType static_A_symbol_398 = valueFactory.typeOf(V_bodyElementType);
						LibraryBinaryOperation dynamic_A_symbol_398 = (LibraryBinaryOperation)static_A_symbol_398.lookupImplementation(standardLibrary, O_OclType_conformsTo);
						Value A_symbol_398 = dynamic_A_symbol_398.evaluate(evaluator, T_Boolean, V_bodyElementType, A_symbol_397);
						leftA_symbol_396 = A_symbol_398;
					} catch (InvalidValueException e) {
						leftA_symbol_396 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_398 = leftA_symbol_396;
					Value rightA_symbol_396;
					try {
						Value leftA_symbol_399;
						try {
							
							Value A_symbol_400 = IP_MultiplicityElement_isOrdered.evaluate(evaluator, T_Boolean, self, P_MultiplicityElement_isOrdered);
							
							leftA_symbol_399 = A_symbol_400;
						} catch (InvalidValueException e) {
							leftA_symbol_399 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_400 = leftA_symbol_399;
						Value rightA_symbol_399;
						try {
							Value leftA_symbol_401;
							try {
								
								DomainType static_A_symbol_402 = valueFactory.typeOf(V_bodyCollectionType);
								LibraryBinaryOperation dynamic_A_symbol_402 = (LibraryBinaryOperation)static_A_symbol_402.lookupImplementation(standardLibrary, O_OclType_conformsTo);
								Value A_symbol_402 = dynamic_A_symbol_402.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_OrderedSet_OclAny__OclAny_);
								leftA_symbol_401 = A_symbol_402;
							} catch (InvalidValueException e) {
								leftA_symbol_401 = valueFactory.createInvalidValue(e);
							}
							Value A_symbol_402 = leftA_symbol_401;
							Value rightA_symbol_401;
							try {
								
								DomainType static_A_symbol_403 = valueFactory.typeOf(V_bodyCollectionType);
								LibraryBinaryOperation dynamic_A_symbol_403 = (LibraryBinaryOperation)static_A_symbol_403.lookupImplementation(standardLibrary, O_OclType_conformsTo);
								Value A_symbol_403 = dynamic_A_symbol_403.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_Sequence_OclAny__OclAny_);
								rightA_symbol_401 = A_symbol_403;
							} catch (InvalidValueException e) {
								rightA_symbol_401 = valueFactory.createInvalidValue(e);
							}
							Value A_symbol_403 = rightA_symbol_401;
							DomainType static_A_symbol_401 = valueFactory.typeOf(A_symbol_402);
							LibraryBinaryOperation dynamic_A_symbol_401 = (LibraryBinaryOperation)static_A_symbol_401.lookupImplementation(standardLibrary, O_Boolean_or);
							Value A_symbol_401 = dynamic_A_symbol_401.evaluate(evaluator, T_Boolean, A_symbol_402, A_symbol_403);
							rightA_symbol_399 = A_symbol_401;
						} catch (InvalidValueException e) {
							rightA_symbol_399 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_401 = rightA_symbol_399;
						DomainType static_A_symbol_399 = valueFactory.typeOf(A_symbol_400, A_symbol_401);
						LibraryBinaryOperation dynamic_A_symbol_399 = (LibraryBinaryOperation)static_A_symbol_399.lookupImplementation(standardLibrary, O_Boolean__eq_);
						Value A_symbol_399 = dynamic_A_symbol_399.evaluate(evaluator, T_Boolean, A_symbol_400, A_symbol_401);
						rightA_symbol_396 = A_symbol_399;
					} catch (InvalidValueException e) {
						rightA_symbol_396 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_399 = rightA_symbol_396;
					DomainType static_A_symbol_396 = valueFactory.typeOf(A_symbol_398);
					LibraryBinaryOperation dynamic_A_symbol_396 = (LibraryBinaryOperation)static_A_symbol_396.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_396 = dynamic_A_symbol_396.evaluate(evaluator, T_Boolean, A_symbol_398, A_symbol_399);
					leftA_symbol_395 = A_symbol_396;
				} catch (InvalidValueException e) {
					leftA_symbol_395 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_396 = leftA_symbol_395;
				Value rightA_symbol_395;
				try {
					Value leftA_symbol_404;
					try {
						
						Value A_symbol_405 = IP_MultiplicityElement_isUnique.evaluate(evaluator, T_Boolean, self, P_MultiplicityElement_isUnique);
						
						leftA_symbol_404 = A_symbol_405;
					} catch (InvalidValueException e) {
						leftA_symbol_404 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_405 = leftA_symbol_404;
					Value rightA_symbol_404;
					try {
						Value leftA_symbol_406;
						try {
							
							DomainType static_A_symbol_407 = valueFactory.typeOf(V_bodyCollectionType);
							LibraryBinaryOperation dynamic_A_symbol_407 = (LibraryBinaryOperation)static_A_symbol_407.lookupImplementation(standardLibrary, O_OclType_conformsTo);
							Value A_symbol_407 = dynamic_A_symbol_407.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_OrderedSet_OclAny__OclAny_);
							leftA_symbol_406 = A_symbol_407;
						} catch (InvalidValueException e) {
							leftA_symbol_406 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_407 = leftA_symbol_406;
						Value rightA_symbol_406;
						try {
							
							DomainType static_A_symbol_408 = valueFactory.typeOf(V_bodyCollectionType);
							LibraryBinaryOperation dynamic_A_symbol_408 = (LibraryBinaryOperation)static_A_symbol_408.lookupImplementation(standardLibrary, O_OclType_conformsTo);
							Value A_symbol_408 = dynamic_A_symbol_408.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_Set_OclAny__OclAny_);
							rightA_symbol_406 = A_symbol_408;
						} catch (InvalidValueException e) {
							rightA_symbol_406 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_408 = rightA_symbol_406;
						DomainType static_A_symbol_406 = valueFactory.typeOf(A_symbol_407);
						LibraryBinaryOperation dynamic_A_symbol_406 = (LibraryBinaryOperation)static_A_symbol_406.lookupImplementation(standardLibrary, O_Boolean_or);
						Value A_symbol_406 = dynamic_A_symbol_406.evaluate(evaluator, T_Boolean, A_symbol_407, A_symbol_408);
						rightA_symbol_404 = A_symbol_406;
					} catch (InvalidValueException e) {
						rightA_symbol_404 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_406 = rightA_symbol_404;
					DomainType static_A_symbol_404 = valueFactory.typeOf(A_symbol_405, A_symbol_406);
					LibraryBinaryOperation dynamic_A_symbol_404 = (LibraryBinaryOperation)static_A_symbol_404.lookupImplementation(standardLibrary, O_Boolean__eq_);
					Value A_symbol_404 = dynamic_A_symbol_404.evaluate(evaluator, T_Boolean, A_symbol_405, A_symbol_406);
					rightA_symbol_395 = A_symbol_404;
				} catch (InvalidValueException e) {
					rightA_symbol_395 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_404 = rightA_symbol_395;
				DomainType static_A_symbol_395 = valueFactory.typeOf(A_symbol_396);
				LibraryBinaryOperation dynamic_A_symbol_395 = (LibraryBinaryOperation)static_A_symbol_395.lookupImplementation(standardLibrary, O_Boolean_and);
				Value A_symbol_395 = dynamic_A_symbol_395.evaluate(evaluator, T_Boolean, A_symbol_396, A_symbol_404);
				final Value A_symbol_409 = A_symbol_395;
				final Value A_symbol_410 = A_symbol_409;
				A_symbol_392 = A_symbol_410;
			}
			else if (A_symbol_391.isFalse()) {
				
				
				Value A_symbol_411 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_412 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_412 = (LibraryBinaryOperation)static_A_symbol_412.lookupImplementation(standardLibrary, O_OclType_conformsTo);
				Value A_symbol_412 = dynamic_A_symbol_412.evaluate(evaluator, T_Boolean, V_bodyType, A_symbol_411);
				A_symbol_392 = A_symbol_412;
			}
			else if (A_symbol_391.isNull()) {
				A_symbol_392 = valueFactory.throwInvalidValueException("null if condition");
			}
			else {
				A_symbol_392 = valueFactory.throwInvalidValueException("invalid if condition");
			}
			final Value A_symbol_413 = A_symbol_392;
			return A_symbol_413;
		}
	}

	/** 
	 * Implementation of the TypedMultiplicityElement::makeParameter '' <body>.
	 */
	public static class _makeParameter_body_ extends AbstractUnaryOperation
	{
		public static _makeParameter_body_ INSTANCE = new _makeParameter_body_();
	
		/*
		Parameter{name = 'name'}
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final StringValue S_name = valueFactory.stringValueOf("name");
			
			ObjectValue A_symbol_414 = PivotTables.Types._Parameter.createInstance(valueFactory);
			
			P_NamedElement_name.setValue(A_symbol_414, S_name);
			
			return A_symbol_414;
		}
	}
}

