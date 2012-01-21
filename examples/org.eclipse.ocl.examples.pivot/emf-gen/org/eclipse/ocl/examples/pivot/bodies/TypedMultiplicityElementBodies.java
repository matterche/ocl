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
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self, Value bodySpecification) throws InvalidValueException {
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
			
			
			Value A_symbol_371 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, bodySpecification, P_TypedElement_type);
			
			final Value V_bodyType = A_symbol_371;
				
				DomainType static_A_symbol_372 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_372 = (LibraryBinaryOperation)static_A_symbol_372.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_372 = dynamic_A_symbol_372.evaluate(evaluator, T_Boolean, V_bodyType, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
			Value A_symbol_373;
			if (A_symbol_372.isTrue()) {
				
				DomainType static_A_symbol_374 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_374 = (LibraryBinaryOperation)static_A_symbol_374.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_374 = dynamic_A_symbol_374.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, V_bodyType, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				final Value V_bodyCollectionType = A_symbol_374;
				
				Value A_symbol_375 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_bodyCollectionType, P_CollectionType_elementType);
				
				final Value V_bodyElementType = A_symbol_375;
				Value leftA_symbol_376;
				try {
					Value leftA_symbol_377;
					try {
						
						
						Value A_symbol_378 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
						
						DomainType static_A_symbol_379 = valueFactory.typeOf(V_bodyElementType);
						LibraryBinaryOperation dynamic_A_symbol_379 = (LibraryBinaryOperation)static_A_symbol_379.lookupImplementation(standardLibrary, O_OclType_conformsTo);
						Value A_symbol_379 = dynamic_A_symbol_379.evaluate(evaluator, T_Boolean, V_bodyElementType, A_symbol_378);
						leftA_symbol_377 = A_symbol_379;
					} catch (InvalidValueException e) {
						leftA_symbol_377 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_379 = leftA_symbol_377;
					Value rightA_symbol_377;
					try {
						Value leftA_symbol_380;
						try {
							
							Value A_symbol_381 = IP_MultiplicityElement_isOrdered.evaluate(evaluator, T_Boolean, self, P_MultiplicityElement_isOrdered);
							
							leftA_symbol_380 = A_symbol_381;
						} catch (InvalidValueException e) {
							leftA_symbol_380 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_381 = leftA_symbol_380;
						Value rightA_symbol_380;
						try {
							Value leftA_symbol_382;
							try {
								
								DomainType static_A_symbol_383 = valueFactory.typeOf(V_bodyCollectionType);
								LibraryBinaryOperation dynamic_A_symbol_383 = (LibraryBinaryOperation)static_A_symbol_383.lookupImplementation(standardLibrary, O_OclType_conformsTo);
								Value A_symbol_383 = dynamic_A_symbol_383.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_OrderedSet_OclAny__OclAny_);
								leftA_symbol_382 = A_symbol_383;
							} catch (InvalidValueException e) {
								leftA_symbol_382 = valueFactory.createInvalidValue(e);
							}
							Value A_symbol_383 = leftA_symbol_382;
							Value rightA_symbol_382;
							try {
								
								DomainType static_A_symbol_384 = valueFactory.typeOf(V_bodyCollectionType);
								LibraryBinaryOperation dynamic_A_symbol_384 = (LibraryBinaryOperation)static_A_symbol_384.lookupImplementation(standardLibrary, O_OclType_conformsTo);
								Value A_symbol_384 = dynamic_A_symbol_384.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_Sequence_OclAny__OclAny_);
								rightA_symbol_382 = A_symbol_384;
							} catch (InvalidValueException e) {
								rightA_symbol_382 = valueFactory.createInvalidValue(e);
							}
							Value A_symbol_384 = rightA_symbol_382;
							DomainType static_A_symbol_382 = valueFactory.typeOf(A_symbol_383);
							LibraryBinaryOperation dynamic_A_symbol_382 = (LibraryBinaryOperation)static_A_symbol_382.lookupImplementation(standardLibrary, O_Boolean_or);
							Value A_symbol_382 = dynamic_A_symbol_382.evaluate(evaluator, T_Boolean, A_symbol_383, A_symbol_384);
							rightA_symbol_380 = A_symbol_382;
						} catch (InvalidValueException e) {
							rightA_symbol_380 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_382 = rightA_symbol_380;
						DomainType static_A_symbol_380 = valueFactory.typeOf(A_symbol_381, A_symbol_382);
						LibraryBinaryOperation dynamic_A_symbol_380 = (LibraryBinaryOperation)static_A_symbol_380.lookupImplementation(standardLibrary, O_Boolean__eq_);
						Value A_symbol_380 = dynamic_A_symbol_380.evaluate(evaluator, T_Boolean, A_symbol_381, A_symbol_382);
						rightA_symbol_377 = A_symbol_380;
					} catch (InvalidValueException e) {
						rightA_symbol_377 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_380 = rightA_symbol_377;
					DomainType static_A_symbol_377 = valueFactory.typeOf(A_symbol_379);
					LibraryBinaryOperation dynamic_A_symbol_377 = (LibraryBinaryOperation)static_A_symbol_377.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_377 = dynamic_A_symbol_377.evaluate(evaluator, T_Boolean, A_symbol_379, A_symbol_380);
					leftA_symbol_376 = A_symbol_377;
				} catch (InvalidValueException e) {
					leftA_symbol_376 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_377 = leftA_symbol_376;
				Value rightA_symbol_376;
				try {
					Value leftA_symbol_385;
					try {
						
						Value A_symbol_386 = IP_MultiplicityElement_isUnique.evaluate(evaluator, T_Boolean, self, P_MultiplicityElement_isUnique);
						
						leftA_symbol_385 = A_symbol_386;
					} catch (InvalidValueException e) {
						leftA_symbol_385 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_386 = leftA_symbol_385;
					Value rightA_symbol_385;
					try {
						Value leftA_symbol_387;
						try {
							
							DomainType static_A_symbol_388 = valueFactory.typeOf(V_bodyCollectionType);
							LibraryBinaryOperation dynamic_A_symbol_388 = (LibraryBinaryOperation)static_A_symbol_388.lookupImplementation(standardLibrary, O_OclType_conformsTo);
							Value A_symbol_388 = dynamic_A_symbol_388.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_OrderedSet_OclAny__OclAny_);
							leftA_symbol_387 = A_symbol_388;
						} catch (InvalidValueException e) {
							leftA_symbol_387 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_388 = leftA_symbol_387;
						Value rightA_symbol_387;
						try {
							
							DomainType static_A_symbol_389 = valueFactory.typeOf(V_bodyCollectionType);
							LibraryBinaryOperation dynamic_A_symbol_389 = (LibraryBinaryOperation)static_A_symbol_389.lookupImplementation(standardLibrary, O_OclType_conformsTo);
							Value A_symbol_389 = dynamic_A_symbol_389.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_Set_OclAny__OclAny_);
							rightA_symbol_387 = A_symbol_389;
						} catch (InvalidValueException e) {
							rightA_symbol_387 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_389 = rightA_symbol_387;
						DomainType static_A_symbol_387 = valueFactory.typeOf(A_symbol_388);
						LibraryBinaryOperation dynamic_A_symbol_387 = (LibraryBinaryOperation)static_A_symbol_387.lookupImplementation(standardLibrary, O_Boolean_or);
						Value A_symbol_387 = dynamic_A_symbol_387.evaluate(evaluator, T_Boolean, A_symbol_388, A_symbol_389);
						rightA_symbol_385 = A_symbol_387;
					} catch (InvalidValueException e) {
						rightA_symbol_385 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_387 = rightA_symbol_385;
					DomainType static_A_symbol_385 = valueFactory.typeOf(A_symbol_386, A_symbol_387);
					LibraryBinaryOperation dynamic_A_symbol_385 = (LibraryBinaryOperation)static_A_symbol_385.lookupImplementation(standardLibrary, O_Boolean__eq_);
					Value A_symbol_385 = dynamic_A_symbol_385.evaluate(evaluator, T_Boolean, A_symbol_386, A_symbol_387);
					rightA_symbol_376 = A_symbol_385;
				} catch (InvalidValueException e) {
					rightA_symbol_376 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_385 = rightA_symbol_376;
				DomainType static_A_symbol_376 = valueFactory.typeOf(A_symbol_377);
				LibraryBinaryOperation dynamic_A_symbol_376 = (LibraryBinaryOperation)static_A_symbol_376.lookupImplementation(standardLibrary, O_Boolean_and);
				Value A_symbol_376 = dynamic_A_symbol_376.evaluate(evaluator, T_Boolean, A_symbol_377, A_symbol_385);
				final Value A_symbol_390 = A_symbol_376;
				final Value A_symbol_391 = A_symbol_390;
				A_symbol_373 = A_symbol_391;
			}
			else if (A_symbol_372.isFalse()) {
				
				
				Value A_symbol_392 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_393 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_393 = (LibraryBinaryOperation)static_A_symbol_393.lookupImplementation(standardLibrary, O_OclType_conformsTo);
				Value A_symbol_393 = dynamic_A_symbol_393.evaluate(evaluator, T_Boolean, V_bodyType, A_symbol_392);
				A_symbol_373 = A_symbol_393;
			}
			else if (A_symbol_372.isNull()) {
				A_symbol_373 = valueFactory.throwInvalidValueException("null if condition");
			}
			else {
				A_symbol_373 = valueFactory.throwInvalidValueException("invalid if condition");
			}
			final Value A_symbol_394 = A_symbol_373;
			return A_symbol_394;
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
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final StringValue S_name = valueFactory.stringValueOf("name");
			
			ObjectValue A_symbol_395 = PivotTables.Types._Parameter.createInstance(valueFactory);
			
			P_NamedElement_name.setValue(A_symbol_395, S_name);
			
			return A_symbol_395;
		}
	}
}

