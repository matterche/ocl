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
			final Value A_symbol_302 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Bag);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__BagType_ = valueFactory.createTypeValue(PivotTables.Types._BagType);
			
			Value leftA_symbol_303;
			try {
				
				Value A_symbol_304 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_305 = valueFactory.typeOf(A_symbol_304, A_symbol_302);
				LibraryBinaryOperation dynamic_A_symbol_305 = (LibraryBinaryOperation)static_A_symbol_305.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_305 = dynamic_A_symbol_305.evaluate(evaluator, T_Boolean, A_symbol_304, A_symbol_302);
				leftA_symbol_303 = A_symbol_305;
			} catch (InvalidValueException e) {
				leftA_symbol_303 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_305 = leftA_symbol_303;
			Value rightA_symbol_303;
			try {
				
				Value A_symbol_306 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_307 = valueFactory.typeOf(A_symbol_306);
				LibraryBinaryOperation dynamic_A_symbol_307 = (LibraryBinaryOperation)static_A_symbol_307.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_307 = dynamic_A_symbol_307.evaluate(evaluator, T_Boolean, A_symbol_306, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
				rightA_symbol_303 = A_symbol_307;
			} catch (InvalidValueException e) {
				rightA_symbol_303 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_307 = rightA_symbol_303;
			DomainType static_A_symbol_303 = valueFactory.typeOf(A_symbol_305);
			LibraryBinaryOperation dynamic_A_symbol_303 = (LibraryBinaryOperation)static_A_symbol_303.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_303 = dynamic_A_symbol_303.evaluate(evaluator, T_Boolean, A_symbol_305, A_symbol_307);
			return A_symbol_303;
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
			final Value A_symbol_308 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Collection);
			
			
			Value A_symbol_309 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
			
			
			DomainType static_A_symbol_310 = valueFactory.typeOf(A_symbol_309, A_symbol_308);
			LibraryBinaryOperation dynamic_A_symbol_310 = (LibraryBinaryOperation)static_A_symbol_310.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
			Value A_symbol_310 = dynamic_A_symbol_310.evaluate(evaluator, T_Boolean, A_symbol_309, A_symbol_308);
			return A_symbol_310;
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
			final Value A_symbol_311 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__OrderedSet);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_ = valueFactory.createTypeValue(PivotTables.Types._OrderedSetType);
			
			Value leftA_symbol_312;
			try {
				
				Value A_symbol_313 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_314 = valueFactory.typeOf(A_symbol_313, A_symbol_311);
				LibraryBinaryOperation dynamic_A_symbol_314 = (LibraryBinaryOperation)static_A_symbol_314.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_314 = dynamic_A_symbol_314.evaluate(evaluator, T_Boolean, A_symbol_313, A_symbol_311);
				leftA_symbol_312 = A_symbol_314;
			} catch (InvalidValueException e) {
				leftA_symbol_312 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_314 = leftA_symbol_312;
			Value rightA_symbol_312;
			try {
				
				Value A_symbol_315 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_316 = valueFactory.typeOf(A_symbol_315);
				LibraryBinaryOperation dynamic_A_symbol_316 = (LibraryBinaryOperation)static_A_symbol_316.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_316 = dynamic_A_symbol_316.evaluate(evaluator, T_Boolean, A_symbol_315, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
				rightA_symbol_312 = A_symbol_316;
			} catch (InvalidValueException e) {
				rightA_symbol_312 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_316 = rightA_symbol_312;
			DomainType static_A_symbol_312 = valueFactory.typeOf(A_symbol_314);
			LibraryBinaryOperation dynamic_A_symbol_312 = (LibraryBinaryOperation)static_A_symbol_312.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_312 = dynamic_A_symbol_312.evaluate(evaluator, T_Boolean, A_symbol_314, A_symbol_316);
			return A_symbol_312;
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
			final Value A_symbol_317 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Sequence);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SequenceType_ = valueFactory.createTypeValue(PivotTables.Types._SequenceType);
			
			Value leftA_symbol_318;
			try {
				
				Value A_symbol_319 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_320 = valueFactory.typeOf(A_symbol_319, A_symbol_317);
				LibraryBinaryOperation dynamic_A_symbol_320 = (LibraryBinaryOperation)static_A_symbol_320.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_320 = dynamic_A_symbol_320.evaluate(evaluator, T_Boolean, A_symbol_319, A_symbol_317);
				leftA_symbol_318 = A_symbol_320;
			} catch (InvalidValueException e) {
				leftA_symbol_318 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_320 = leftA_symbol_318;
			Value rightA_symbol_318;
			try {
				
				Value A_symbol_321 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_322 = valueFactory.typeOf(A_symbol_321);
				LibraryBinaryOperation dynamic_A_symbol_322 = (LibraryBinaryOperation)static_A_symbol_322.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_322 = dynamic_A_symbol_322.evaluate(evaluator, T_Boolean, A_symbol_321, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
				rightA_symbol_318 = A_symbol_322;
			} catch (InvalidValueException e) {
				rightA_symbol_318 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_322 = rightA_symbol_318;
			DomainType static_A_symbol_318 = valueFactory.typeOf(A_symbol_320);
			LibraryBinaryOperation dynamic_A_symbol_318 = (LibraryBinaryOperation)static_A_symbol_318.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_318 = dynamic_A_symbol_318.evaluate(evaluator, T_Boolean, A_symbol_320, A_symbol_322);
			return A_symbol_318;
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
			final Value A_symbol_323 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Set);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SetType_ = valueFactory.createTypeValue(PivotTables.Types._SetType);
			
			Value leftA_symbol_324;
			try {
				
				Value A_symbol_325 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_326 = valueFactory.typeOf(A_symbol_325, A_symbol_323);
				LibraryBinaryOperation dynamic_A_symbol_326 = (LibraryBinaryOperation)static_A_symbol_326.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_326 = dynamic_A_symbol_326.evaluate(evaluator, T_Boolean, A_symbol_325, A_symbol_323);
				leftA_symbol_324 = A_symbol_326;
			} catch (InvalidValueException e) {
				leftA_symbol_324 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_326 = leftA_symbol_324;
			Value rightA_symbol_324;
			try {
				
				Value A_symbol_327 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_328 = valueFactory.typeOf(A_symbol_327);
				LibraryBinaryOperation dynamic_A_symbol_328 = (LibraryBinaryOperation)static_A_symbol_328.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_328 = dynamic_A_symbol_328.evaluate(evaluator, T_Boolean, A_symbol_327, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
				rightA_symbol_324 = A_symbol_328;
			} catch (InvalidValueException e) {
				rightA_symbol_324 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_328 = rightA_symbol_324;
			DomainType static_A_symbol_324 = valueFactory.typeOf(A_symbol_326);
			LibraryBinaryOperation dynamic_A_symbol_324 = (LibraryBinaryOperation)static_A_symbol_324.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_324 = dynamic_A_symbol_324.evaluate(evaluator, T_Boolean, A_symbol_326, A_symbol_328);
			return A_symbol_324;
		}
	}


}

