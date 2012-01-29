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
			
			
			Value A_symbol_378 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, bodySpecification, P_TypedElement_type);
			
			final Value V_bodyType = A_symbol_378;
				
				DomainType static_A_symbol_379 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_379 = (LibraryBinaryOperation)static_A_symbol_379.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_379 = dynamic_A_symbol_379.evaluate(evaluator, T_Boolean, V_bodyType, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
			Value A_symbol_380;
			if (A_symbol_379.isTrue()) {
				
				DomainType static_A_symbol_381 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_381 = (LibraryBinaryOperation)static_A_symbol_381.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_381 = dynamic_A_symbol_381.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, V_bodyType, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				final Value V_bodyCollectionType = A_symbol_381;
				
				Value A_symbol_382 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_bodyCollectionType, P_CollectionType_elementType);
				
				final Value V_bodyElementType = A_symbol_382;
				Value leftA_symbol_383;
				try {
					Value leftA_symbol_384;
					try {
						
						
						Value A_symbol_385 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
						
						DomainType static_A_symbol_386 = valueFactory.typeOf(V_bodyElementType);
						LibraryBinaryOperation dynamic_A_symbol_386 = (LibraryBinaryOperation)static_A_symbol_386.lookupImplementation(standardLibrary, O_OclType_conformsTo);
						Value A_symbol_386 = dynamic_A_symbol_386.evaluate(evaluator, T_Boolean, V_bodyElementType, A_symbol_385);
						leftA_symbol_384 = A_symbol_386;
					} catch (InvalidValueException e) {
						leftA_symbol_384 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_386 = leftA_symbol_384;
					Value rightA_symbol_384;
					try {
						Value leftA_symbol_387;
						try {
							
							Value A_symbol_388 = IP_MultiplicityElement_isOrdered.evaluate(evaluator, T_Boolean, self, P_MultiplicityElement_isOrdered);
							
							leftA_symbol_387 = A_symbol_388;
						} catch (InvalidValueException e) {
							leftA_symbol_387 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_388 = leftA_symbol_387;
						Value rightA_symbol_387;
						try {
							Value leftA_symbol_389;
							try {
								
								DomainType static_A_symbol_390 = valueFactory.typeOf(V_bodyCollectionType);
								LibraryBinaryOperation dynamic_A_symbol_390 = (LibraryBinaryOperation)static_A_symbol_390.lookupImplementation(standardLibrary, O_OclType_conformsTo);
								Value A_symbol_390 = dynamic_A_symbol_390.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_OrderedSet_OclAny__OclAny_);
								leftA_symbol_389 = A_symbol_390;
							} catch (InvalidValueException e) {
								leftA_symbol_389 = valueFactory.createInvalidValue(e);
							}
							Value A_symbol_390 = leftA_symbol_389;
							Value rightA_symbol_389;
							try {
								
								DomainType static_A_symbol_391 = valueFactory.typeOf(V_bodyCollectionType);
								LibraryBinaryOperation dynamic_A_symbol_391 = (LibraryBinaryOperation)static_A_symbol_391.lookupImplementation(standardLibrary, O_OclType_conformsTo);
								Value A_symbol_391 = dynamic_A_symbol_391.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_Sequence_OclAny__OclAny_);
								rightA_symbol_389 = A_symbol_391;
							} catch (InvalidValueException e) {
								rightA_symbol_389 = valueFactory.createInvalidValue(e);
							}
							Value A_symbol_391 = rightA_symbol_389;
							DomainType static_A_symbol_389 = valueFactory.typeOf(A_symbol_390);
							LibraryBinaryOperation dynamic_A_symbol_389 = (LibraryBinaryOperation)static_A_symbol_389.lookupImplementation(standardLibrary, O_Boolean_or);
							Value A_symbol_389 = dynamic_A_symbol_389.evaluate(evaluator, T_Boolean, A_symbol_390, A_symbol_391);
							rightA_symbol_387 = A_symbol_389;
						} catch (InvalidValueException e) {
							rightA_symbol_387 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_389 = rightA_symbol_387;
						DomainType static_A_symbol_387 = valueFactory.typeOf(A_symbol_388, A_symbol_389);
						LibraryBinaryOperation dynamic_A_symbol_387 = (LibraryBinaryOperation)static_A_symbol_387.lookupImplementation(standardLibrary, O_Boolean__eq_);
						Value A_symbol_387 = dynamic_A_symbol_387.evaluate(evaluator, T_Boolean, A_symbol_388, A_symbol_389);
						rightA_symbol_384 = A_symbol_387;
					} catch (InvalidValueException e) {
						rightA_symbol_384 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_387 = rightA_symbol_384;
					DomainType static_A_symbol_384 = valueFactory.typeOf(A_symbol_386);
					LibraryBinaryOperation dynamic_A_symbol_384 = (LibraryBinaryOperation)static_A_symbol_384.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_384 = dynamic_A_symbol_384.evaluate(evaluator, T_Boolean, A_symbol_386, A_symbol_387);
					leftA_symbol_383 = A_symbol_384;
				} catch (InvalidValueException e) {
					leftA_symbol_383 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_384 = leftA_symbol_383;
				Value rightA_symbol_383;
				try {
					Value leftA_symbol_392;
					try {
						
						Value A_symbol_393 = IP_MultiplicityElement_isUnique.evaluate(evaluator, T_Boolean, self, P_MultiplicityElement_isUnique);
						
						leftA_symbol_392 = A_symbol_393;
					} catch (InvalidValueException e) {
						leftA_symbol_392 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_393 = leftA_symbol_392;
					Value rightA_symbol_392;
					try {
						Value leftA_symbol_394;
						try {
							
							DomainType static_A_symbol_395 = valueFactory.typeOf(V_bodyCollectionType);
							LibraryBinaryOperation dynamic_A_symbol_395 = (LibraryBinaryOperation)static_A_symbol_395.lookupImplementation(standardLibrary, O_OclType_conformsTo);
							Value A_symbol_395 = dynamic_A_symbol_395.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_OrderedSet_OclAny__OclAny_);
							leftA_symbol_394 = A_symbol_395;
						} catch (InvalidValueException e) {
							leftA_symbol_394 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_395 = leftA_symbol_394;
						Value rightA_symbol_394;
						try {
							
							DomainType static_A_symbol_396 = valueFactory.typeOf(V_bodyCollectionType);
							LibraryBinaryOperation dynamic_A_symbol_396 = (LibraryBinaryOperation)static_A_symbol_396.lookupImplementation(standardLibrary, O_OclType_conformsTo);
							Value A_symbol_396 = dynamic_A_symbol_396.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_Set_OclAny__OclAny_);
							rightA_symbol_394 = A_symbol_396;
						} catch (InvalidValueException e) {
							rightA_symbol_394 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_396 = rightA_symbol_394;
						DomainType static_A_symbol_394 = valueFactory.typeOf(A_symbol_395);
						LibraryBinaryOperation dynamic_A_symbol_394 = (LibraryBinaryOperation)static_A_symbol_394.lookupImplementation(standardLibrary, O_Boolean_or);
						Value A_symbol_394 = dynamic_A_symbol_394.evaluate(evaluator, T_Boolean, A_symbol_395, A_symbol_396);
						rightA_symbol_392 = A_symbol_394;
					} catch (InvalidValueException e) {
						rightA_symbol_392 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_394 = rightA_symbol_392;
					DomainType static_A_symbol_392 = valueFactory.typeOf(A_symbol_393, A_symbol_394);
					LibraryBinaryOperation dynamic_A_symbol_392 = (LibraryBinaryOperation)static_A_symbol_392.lookupImplementation(standardLibrary, O_Boolean__eq_);
					Value A_symbol_392 = dynamic_A_symbol_392.evaluate(evaluator, T_Boolean, A_symbol_393, A_symbol_394);
					rightA_symbol_383 = A_symbol_392;
				} catch (InvalidValueException e) {
					rightA_symbol_383 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_392 = rightA_symbol_383;
				DomainType static_A_symbol_383 = valueFactory.typeOf(A_symbol_384);
				LibraryBinaryOperation dynamic_A_symbol_383 = (LibraryBinaryOperation)static_A_symbol_383.lookupImplementation(standardLibrary, O_Boolean_and);
				Value A_symbol_383 = dynamic_A_symbol_383.evaluate(evaluator, T_Boolean, A_symbol_384, A_symbol_392);
				final Value A_symbol_397 = A_symbol_383;
				final Value A_symbol_398 = A_symbol_397;
				A_symbol_380 = A_symbol_398;
			}
			else if (A_symbol_379.isFalse()) {
				
				
				Value A_symbol_399 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_400 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_400 = (LibraryBinaryOperation)static_A_symbol_400.lookupImplementation(standardLibrary, O_OclType_conformsTo);
				Value A_symbol_400 = dynamic_A_symbol_400.evaluate(evaluator, T_Boolean, V_bodyType, A_symbol_399);
				A_symbol_380 = A_symbol_400;
			}
			else if (A_symbol_379.isNull()) {
				A_symbol_380 = valueFactory.throwInvalidValueException("null if condition");
			}
			else {
				A_symbol_380 = valueFactory.throwInvalidValueException("invalid if condition");
			}
			final Value A_symbol_401 = A_symbol_380;
			return A_symbol_401;
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
			
			ObjectValue A_symbol_402 = PivotTables.Types._Parameter.createInstance(valueFactory);
			
			P_NamedElement_name.setValue(A_symbol_402, S_name);
			
			return A_symbol_402;
		}
	}
}

