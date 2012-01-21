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
			final Value A_symbol_0 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Bag);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__BagType_ = valueFactory.createTypeValue(PivotTables.Types._BagType);
			
			Value leftA_symbol_1;
			try {
				
				Value A_symbol_2 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_3 = valueFactory.typeOf(A_symbol_2, A_symbol_0);
				LibraryBinaryOperation dynamic_A_symbol_3 = (LibraryBinaryOperation)static_A_symbol_3.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_3 = dynamic_A_symbol_3.evaluate(evaluator, T_Boolean, A_symbol_2, A_symbol_0);
				leftA_symbol_1 = A_symbol_3;
			} catch (InvalidValueException e) {
				leftA_symbol_1 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_3 = leftA_symbol_1;
			Value rightA_symbol_1;
			try {
				
				Value A_symbol_4 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_5 = valueFactory.typeOf(A_symbol_4);
				LibraryBinaryOperation dynamic_A_symbol_5 = (LibraryBinaryOperation)static_A_symbol_5.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_5 = dynamic_A_symbol_5.evaluate(evaluator, T_Boolean, A_symbol_4, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
				rightA_symbol_1 = A_symbol_5;
			} catch (InvalidValueException e) {
				rightA_symbol_1 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_5 = rightA_symbol_1;
			DomainType static_A_symbol_1 = valueFactory.typeOf(A_symbol_3);
			LibraryBinaryOperation dynamic_A_symbol_1 = (LibraryBinaryOperation)static_A_symbol_1.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_1 = dynamic_A_symbol_1.evaluate(evaluator, T_Boolean, A_symbol_3, A_symbol_5);
			return A_symbol_1;
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
			final Value A_symbol_6 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Collection);
			
			
			Value A_symbol_7 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
			
			
			DomainType static_A_symbol_8 = valueFactory.typeOf(A_symbol_7, A_symbol_6);
			LibraryBinaryOperation dynamic_A_symbol_8 = (LibraryBinaryOperation)static_A_symbol_8.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
			Value A_symbol_8 = dynamic_A_symbol_8.evaluate(evaluator, T_Boolean, A_symbol_7, A_symbol_6);
			return A_symbol_8;
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
			final Value A_symbol_9 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__OrderedSet);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_ = valueFactory.createTypeValue(PivotTables.Types._OrderedSetType);
			
			Value leftA_symbol_10;
			try {
				
				Value A_symbol_11 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_12 = valueFactory.typeOf(A_symbol_11, A_symbol_9);
				LibraryBinaryOperation dynamic_A_symbol_12 = (LibraryBinaryOperation)static_A_symbol_12.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_12 = dynamic_A_symbol_12.evaluate(evaluator, T_Boolean, A_symbol_11, A_symbol_9);
				leftA_symbol_10 = A_symbol_12;
			} catch (InvalidValueException e) {
				leftA_symbol_10 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_12 = leftA_symbol_10;
			Value rightA_symbol_10;
			try {
				
				Value A_symbol_13 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_14 = valueFactory.typeOf(A_symbol_13);
				LibraryBinaryOperation dynamic_A_symbol_14 = (LibraryBinaryOperation)static_A_symbol_14.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_14 = dynamic_A_symbol_14.evaluate(evaluator, T_Boolean, A_symbol_13, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
				rightA_symbol_10 = A_symbol_14;
			} catch (InvalidValueException e) {
				rightA_symbol_10 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_14 = rightA_symbol_10;
			DomainType static_A_symbol_10 = valueFactory.typeOf(A_symbol_12);
			LibraryBinaryOperation dynamic_A_symbol_10 = (LibraryBinaryOperation)static_A_symbol_10.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_10 = dynamic_A_symbol_10.evaluate(evaluator, T_Boolean, A_symbol_12, A_symbol_14);
			return A_symbol_10;
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
			final Value A_symbol_15 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Sequence);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SequenceType_ = valueFactory.createTypeValue(PivotTables.Types._SequenceType);
			
			Value leftA_symbol_16;
			try {
				
				Value A_symbol_17 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_18 = valueFactory.typeOf(A_symbol_17, A_symbol_15);
				LibraryBinaryOperation dynamic_A_symbol_18 = (LibraryBinaryOperation)static_A_symbol_18.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_18 = dynamic_A_symbol_18.evaluate(evaluator, T_Boolean, A_symbol_17, A_symbol_15);
				leftA_symbol_16 = A_symbol_18;
			} catch (InvalidValueException e) {
				leftA_symbol_16 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_18 = leftA_symbol_16;
			Value rightA_symbol_16;
			try {
				
				Value A_symbol_19 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_20 = valueFactory.typeOf(A_symbol_19);
				LibraryBinaryOperation dynamic_A_symbol_20 = (LibraryBinaryOperation)static_A_symbol_20.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_20 = dynamic_A_symbol_20.evaluate(evaluator, T_Boolean, A_symbol_19, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
				rightA_symbol_16 = A_symbol_20;
			} catch (InvalidValueException e) {
				rightA_symbol_16 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_20 = rightA_symbol_16;
			DomainType static_A_symbol_16 = valueFactory.typeOf(A_symbol_18);
			LibraryBinaryOperation dynamic_A_symbol_16 = (LibraryBinaryOperation)static_A_symbol_16.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_16 = dynamic_A_symbol_16.evaluate(evaluator, T_Boolean, A_symbol_18, A_symbol_20);
			return A_symbol_16;
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
			final Value A_symbol_21 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Set);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SetType_ = valueFactory.createTypeValue(PivotTables.Types._SetType);
			
			Value leftA_symbol_22;
			try {
				
				Value A_symbol_23 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_24 = valueFactory.typeOf(A_symbol_23, A_symbol_21);
				LibraryBinaryOperation dynamic_A_symbol_24 = (LibraryBinaryOperation)static_A_symbol_24.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_24 = dynamic_A_symbol_24.evaluate(evaluator, T_Boolean, A_symbol_23, A_symbol_21);
				leftA_symbol_22 = A_symbol_24;
			} catch (InvalidValueException e) {
				leftA_symbol_22 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_24 = leftA_symbol_22;
			Value rightA_symbol_22;
			try {
				
				Value A_symbol_25 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_26 = valueFactory.typeOf(A_symbol_25);
				LibraryBinaryOperation dynamic_A_symbol_26 = (LibraryBinaryOperation)static_A_symbol_26.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_26 = dynamic_A_symbol_26.evaluate(evaluator, T_Boolean, A_symbol_25, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
				rightA_symbol_22 = A_symbol_26;
			} catch (InvalidValueException e) {
				rightA_symbol_22 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_26 = rightA_symbol_22;
			DomainType static_A_symbol_22 = valueFactory.typeOf(A_symbol_24);
			LibraryBinaryOperation dynamic_A_symbol_22 = (LibraryBinaryOperation)static_A_symbol_22.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_22 = dynamic_A_symbol_22.evaluate(evaluator, T_Boolean, A_symbol_24, A_symbol_26);
			return A_symbol_22;
		}
	}


}

