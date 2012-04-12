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
			final Value A_symbol_21 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Bag);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__BagType_ = valueFactory.createTypeValue(PivotTables.Types._BagType);
			
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
				Value A_symbol_26 = dynamic_A_symbol_26.evaluate(evaluator, T_Boolean, A_symbol_25, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
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
			final Value A_symbol_27 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Collection);
			
			
			Value A_symbol_28 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
			
			
			DomainType static_A_symbol_29 = valueFactory.typeOf(A_symbol_28, A_symbol_27);
			LibraryBinaryOperation dynamic_A_symbol_29 = (LibraryBinaryOperation)static_A_symbol_29.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
			Value A_symbol_29 = dynamic_A_symbol_29.evaluate(evaluator, T_Boolean, A_symbol_28, A_symbol_27);
			return A_symbol_29;
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
			final Value A_symbol_30 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__OrderedSet);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_ = valueFactory.createTypeValue(PivotTables.Types._OrderedSetType);
			
			Value leftA_symbol_31;
			try {
				
				Value A_symbol_32 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_33 = valueFactory.typeOf(A_symbol_32, A_symbol_30);
				LibraryBinaryOperation dynamic_A_symbol_33 = (LibraryBinaryOperation)static_A_symbol_33.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_33 = dynamic_A_symbol_33.evaluate(evaluator, T_Boolean, A_symbol_32, A_symbol_30);
				leftA_symbol_31 = A_symbol_33;
			} catch (InvalidValueException e) {
				leftA_symbol_31 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_33 = leftA_symbol_31;
			Value rightA_symbol_31;
			try {
				
				Value A_symbol_34 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_35 = valueFactory.typeOf(A_symbol_34);
				LibraryBinaryOperation dynamic_A_symbol_35 = (LibraryBinaryOperation)static_A_symbol_35.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_35 = dynamic_A_symbol_35.evaluate(evaluator, T_Boolean, A_symbol_34, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
				rightA_symbol_31 = A_symbol_35;
			} catch (InvalidValueException e) {
				rightA_symbol_31 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_35 = rightA_symbol_31;
			DomainType static_A_symbol_31 = valueFactory.typeOf(A_symbol_33);
			LibraryBinaryOperation dynamic_A_symbol_31 = (LibraryBinaryOperation)static_A_symbol_31.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_31 = dynamic_A_symbol_31.evaluate(evaluator, T_Boolean, A_symbol_33, A_symbol_35);
			return A_symbol_31;
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
			final Value A_symbol_36 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Sequence);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SequenceType_ = valueFactory.createTypeValue(PivotTables.Types._SequenceType);
			
			Value leftA_symbol_37;
			try {
				
				Value A_symbol_38 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_39 = valueFactory.typeOf(A_symbol_38, A_symbol_36);
				LibraryBinaryOperation dynamic_A_symbol_39 = (LibraryBinaryOperation)static_A_symbol_39.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_39 = dynamic_A_symbol_39.evaluate(evaluator, T_Boolean, A_symbol_38, A_symbol_36);
				leftA_symbol_37 = A_symbol_39;
			} catch (InvalidValueException e) {
				leftA_symbol_37 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_39 = leftA_symbol_37;
			Value rightA_symbol_37;
			try {
				
				Value A_symbol_40 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_41 = valueFactory.typeOf(A_symbol_40);
				LibraryBinaryOperation dynamic_A_symbol_41 = (LibraryBinaryOperation)static_A_symbol_41.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_41 = dynamic_A_symbol_41.evaluate(evaluator, T_Boolean, A_symbol_40, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
				rightA_symbol_37 = A_symbol_41;
			} catch (InvalidValueException e) {
				rightA_symbol_37 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_41 = rightA_symbol_37;
			DomainType static_A_symbol_37 = valueFactory.typeOf(A_symbol_39);
			LibraryBinaryOperation dynamic_A_symbol_37 = (LibraryBinaryOperation)static_A_symbol_37.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_37 = dynamic_A_symbol_37.evaluate(evaluator, T_Boolean, A_symbol_39, A_symbol_41);
			return A_symbol_37;
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
			final Value A_symbol_42 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Set);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SetType_ = valueFactory.createTypeValue(PivotTables.Types._SetType);
			
			Value leftA_symbol_43;
			try {
				
				Value A_symbol_44 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_45 = valueFactory.typeOf(A_symbol_44, A_symbol_42);
				LibraryBinaryOperation dynamic_A_symbol_45 = (LibraryBinaryOperation)static_A_symbol_45.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_45 = dynamic_A_symbol_45.evaluate(evaluator, T_Boolean, A_symbol_44, A_symbol_42);
				leftA_symbol_43 = A_symbol_45;
			} catch (InvalidValueException e) {
				leftA_symbol_43 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_45 = leftA_symbol_43;
			Value rightA_symbol_43;
			try {
				
				Value A_symbol_46 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_47 = valueFactory.typeOf(A_symbol_46);
				LibraryBinaryOperation dynamic_A_symbol_47 = (LibraryBinaryOperation)static_A_symbol_47.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_47 = dynamic_A_symbol_47.evaluate(evaluator, T_Boolean, A_symbol_46, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
				rightA_symbol_43 = A_symbol_47;
			} catch (InvalidValueException e) {
				rightA_symbol_43 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_47 = rightA_symbol_43;
			DomainType static_A_symbol_43 = valueFactory.typeOf(A_symbol_45);
			LibraryBinaryOperation dynamic_A_symbol_43 = (LibraryBinaryOperation)static_A_symbol_43.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_43 = dynamic_A_symbol_43.evaluate(evaluator, T_Boolean, A_symbol_45, A_symbol_47);
			return A_symbol_43;
		}
	}


}

