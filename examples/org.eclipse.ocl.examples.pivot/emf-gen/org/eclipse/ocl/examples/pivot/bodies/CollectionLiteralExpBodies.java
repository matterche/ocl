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
import org.eclipse.ocl.examples.pivot.CollectionKind;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * CollectionLiteralExpBodies provides the Java implementation bodies of OCL-defined CollectionLiteralExp operations and properties.
 */
@SuppressWarnings("nls")
public class CollectionLiteralExpBodies
{

	/** 
	 * Implementation of the CollectionLiteralExp 'BagKindIsBag' invariant.
	 */
	public static class _invariant_BagKindIsBag extends AbstractUnaryOperation
	{
		public static _invariant_BagKindIsBag INSTANCE = new _invariant_BagKindIsBag();
	
		/*
		kind = CollectionKind::Bag implies type.oclIsKindOf(BagType)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__CollectionKind = PivotTables.Types._CollectionKind;
			final ExecutorProperty P_CollectionLiteralExp_kind = PivotTables.Properties._CollectionLiteralExp__kind;
			final LibraryProperty IP_CollectionLiteralExp_kind = P_CollectionLiteralExp_kind.getImplementation();
			final Value A_symbol_352 = valueFactory.valueOf(CollectionKind.BAG);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__BagType_ = valueFactory.createTypeValue(PivotTables.Types._BagType);
			
			Value leftA_symbol_353;
			try {
				
				Value A_symbol_354 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_355 = valueFactory.typeOf(A_symbol_354, A_symbol_352);
				LibraryBinaryOperation dynamic_A_symbol_355 = (LibraryBinaryOperation)static_A_symbol_355.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_355 = dynamic_A_symbol_355.evaluate(evaluator, T_Boolean, A_symbol_354, A_symbol_352);
				leftA_symbol_353 = A_symbol_355;
			} catch (InvalidValueException e) {
				leftA_symbol_353 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_355 = leftA_symbol_353;
			Value rightA_symbol_353;
			try {
				
				Value A_symbol_356 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_357 = valueFactory.typeOf(A_symbol_356);
				LibraryBinaryOperation dynamic_A_symbol_357 = (LibraryBinaryOperation)static_A_symbol_357.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_357 = dynamic_A_symbol_357.evaluate(evaluator, T_Boolean, A_symbol_356, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
				rightA_symbol_353 = A_symbol_357;
			} catch (InvalidValueException e) {
				rightA_symbol_353 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_357 = rightA_symbol_353;
			DomainType static_A_symbol_353 = valueFactory.typeOf(A_symbol_355);
			LibraryBinaryOperation dynamic_A_symbol_353 = (LibraryBinaryOperation)static_A_symbol_353.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_353 = dynamic_A_symbol_353.evaluate(evaluator, T_Boolean, A_symbol_355, A_symbol_357);
			return A_symbol_353;
		}
	}

	/** 
	 * Implementation of the CollectionLiteralExp 'CollectionKindIsConcrete' invariant.
	 */
	public static class _invariant_CollectionKindIsConcrete extends AbstractUnaryOperation
	{
		public static _invariant_CollectionKindIsConcrete INSTANCE = new _invariant_CollectionKindIsConcrete();
	
		/*
		kind <> CollectionKind::Collection
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_OclAny__lt__gt_ = OCLstdlibTables.Operations._OclAny___lt__gt_;
			final ExecutorType T_Pivot_ecore__pivot__CollectionKind = PivotTables.Types._CollectionKind;
			final ExecutorProperty P_CollectionLiteralExp_kind = PivotTables.Properties._CollectionLiteralExp__kind;
			final LibraryProperty IP_CollectionLiteralExp_kind = P_CollectionLiteralExp_kind.getImplementation();
			final Value A_symbol_358 = valueFactory.valueOf(CollectionKind.COLLECTION);
			
			
			Value A_symbol_359 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
			
			
			DomainType static_A_symbol_360 = valueFactory.typeOf(A_symbol_359, A_symbol_358);
			LibraryBinaryOperation dynamic_A_symbol_360 = (LibraryBinaryOperation)static_A_symbol_360.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
			Value A_symbol_360 = dynamic_A_symbol_360.evaluate(evaluator, T_Boolean, A_symbol_359, A_symbol_358);
			return A_symbol_360;
		}
	}

	/** 
	 * Implementation of the CollectionLiteralExp 'OrderedSetKindIsOrderedSet' invariant.
	 */
	public static class _invariant_OrderedSetKindIsOrderedSet extends AbstractUnaryOperation
	{
		public static _invariant_OrderedSetKindIsOrderedSet INSTANCE = new _invariant_OrderedSetKindIsOrderedSet();
	
		/*
		kind = CollectionKind::OrderedSet implies
	type.oclIsKindOf(OrderedSetType)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__CollectionKind = PivotTables.Types._CollectionKind;
			final ExecutorProperty P_CollectionLiteralExp_kind = PivotTables.Properties._CollectionLiteralExp__kind;
			final LibraryProperty IP_CollectionLiteralExp_kind = P_CollectionLiteralExp_kind.getImplementation();
			final Value A_symbol_361 = valueFactory.valueOf(CollectionKind.ORDERED_SET);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_ = valueFactory.createTypeValue(PivotTables.Types._OrderedSetType);
			
			Value leftA_symbol_362;
			try {
				
				Value A_symbol_363 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_364 = valueFactory.typeOf(A_symbol_363, A_symbol_361);
				LibraryBinaryOperation dynamic_A_symbol_364 = (LibraryBinaryOperation)static_A_symbol_364.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_364 = dynamic_A_symbol_364.evaluate(evaluator, T_Boolean, A_symbol_363, A_symbol_361);
				leftA_symbol_362 = A_symbol_364;
			} catch (InvalidValueException e) {
				leftA_symbol_362 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_364 = leftA_symbol_362;
			Value rightA_symbol_362;
			try {
				
				Value A_symbol_365 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_366 = valueFactory.typeOf(A_symbol_365);
				LibraryBinaryOperation dynamic_A_symbol_366 = (LibraryBinaryOperation)static_A_symbol_366.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_366 = dynamic_A_symbol_366.evaluate(evaluator, T_Boolean, A_symbol_365, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
				rightA_symbol_362 = A_symbol_366;
			} catch (InvalidValueException e) {
				rightA_symbol_362 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_366 = rightA_symbol_362;
			DomainType static_A_symbol_362 = valueFactory.typeOf(A_symbol_364);
			LibraryBinaryOperation dynamic_A_symbol_362 = (LibraryBinaryOperation)static_A_symbol_362.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_362 = dynamic_A_symbol_362.evaluate(evaluator, T_Boolean, A_symbol_364, A_symbol_366);
			return A_symbol_362;
		}
	}

	/** 
	 * Implementation of the CollectionLiteralExp 'SequenceKindIsSequence' invariant.
	 */
	public static class _invariant_SequenceKindIsSequence extends AbstractUnaryOperation
	{
		public static _invariant_SequenceKindIsSequence INSTANCE = new _invariant_SequenceKindIsSequence();
	
		/*
		kind = CollectionKind::Sequence implies
	type.oclIsKindOf(SequenceType)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__CollectionKind = PivotTables.Types._CollectionKind;
			final ExecutorProperty P_CollectionLiteralExp_kind = PivotTables.Properties._CollectionLiteralExp__kind;
			final LibraryProperty IP_CollectionLiteralExp_kind = P_CollectionLiteralExp_kind.getImplementation();
			final Value A_symbol_367 = valueFactory.valueOf(CollectionKind.SEQUENCE);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SequenceType_ = valueFactory.createTypeValue(PivotTables.Types._SequenceType);
			
			Value leftA_symbol_368;
			try {
				
				Value A_symbol_369 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_370 = valueFactory.typeOf(A_symbol_369, A_symbol_367);
				LibraryBinaryOperation dynamic_A_symbol_370 = (LibraryBinaryOperation)static_A_symbol_370.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_370 = dynamic_A_symbol_370.evaluate(evaluator, T_Boolean, A_symbol_369, A_symbol_367);
				leftA_symbol_368 = A_symbol_370;
			} catch (InvalidValueException e) {
				leftA_symbol_368 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_370 = leftA_symbol_368;
			Value rightA_symbol_368;
			try {
				
				Value A_symbol_371 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_372 = valueFactory.typeOf(A_symbol_371);
				LibraryBinaryOperation dynamic_A_symbol_372 = (LibraryBinaryOperation)static_A_symbol_372.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_372 = dynamic_A_symbol_372.evaluate(evaluator, T_Boolean, A_symbol_371, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
				rightA_symbol_368 = A_symbol_372;
			} catch (InvalidValueException e) {
				rightA_symbol_368 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_372 = rightA_symbol_368;
			DomainType static_A_symbol_368 = valueFactory.typeOf(A_symbol_370);
			LibraryBinaryOperation dynamic_A_symbol_368 = (LibraryBinaryOperation)static_A_symbol_368.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_368 = dynamic_A_symbol_368.evaluate(evaluator, T_Boolean, A_symbol_370, A_symbol_372);
			return A_symbol_368;
		}
	}

	/** 
	 * Implementation of the CollectionLiteralExp 'SetKindIsSet' invariant.
	 */
	public static class _invariant_SetKindIsSet extends AbstractUnaryOperation
	{
		public static _invariant_SetKindIsSet INSTANCE = new _invariant_SetKindIsSet();
	
		/*
		kind = CollectionKind::Set implies type.oclIsKindOf(SetType)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__CollectionKind = PivotTables.Types._CollectionKind;
			final ExecutorProperty P_CollectionLiteralExp_kind = PivotTables.Properties._CollectionLiteralExp__kind;
			final LibraryProperty IP_CollectionLiteralExp_kind = P_CollectionLiteralExp_kind.getImplementation();
			final Value A_symbol_373 = valueFactory.valueOf(CollectionKind.SET);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SetType_ = valueFactory.createTypeValue(PivotTables.Types._SetType);
			
			Value leftA_symbol_374;
			try {
				
				Value A_symbol_375 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_376 = valueFactory.typeOf(A_symbol_375, A_symbol_373);
				LibraryBinaryOperation dynamic_A_symbol_376 = (LibraryBinaryOperation)static_A_symbol_376.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_376 = dynamic_A_symbol_376.evaluate(evaluator, T_Boolean, A_symbol_375, A_symbol_373);
				leftA_symbol_374 = A_symbol_376;
			} catch (InvalidValueException e) {
				leftA_symbol_374 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_376 = leftA_symbol_374;
			Value rightA_symbol_374;
			try {
				
				Value A_symbol_377 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_378 = valueFactory.typeOf(A_symbol_377);
				LibraryBinaryOperation dynamic_A_symbol_378 = (LibraryBinaryOperation)static_A_symbol_378.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_378 = dynamic_A_symbol_378.evaluate(evaluator, T_Boolean, A_symbol_377, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
				rightA_symbol_374 = A_symbol_378;
			} catch (InvalidValueException e) {
				rightA_symbol_374 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_378 = rightA_symbol_374;
			DomainType static_A_symbol_374 = valueFactory.typeOf(A_symbol_376);
			LibraryBinaryOperation dynamic_A_symbol_374 = (LibraryBinaryOperation)static_A_symbol_374.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_374 = dynamic_A_symbol_374.evaluate(evaluator, T_Boolean, A_symbol_376, A_symbol_378);
			return A_symbol_374;
		}
	}


}

