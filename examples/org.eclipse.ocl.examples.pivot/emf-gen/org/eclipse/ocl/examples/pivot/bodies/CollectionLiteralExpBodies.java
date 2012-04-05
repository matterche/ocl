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
			final Value A_symbol_42 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Bag);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__BagType_ = valueFactory.createTypeValue(PivotTables.Types._BagType);
			
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
				Value A_symbol_47 = dynamic_A_symbol_47.evaluate(evaluator, T_Boolean, A_symbol_46, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
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
			final Value A_symbol_48 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Collection);
			
			
			Value A_symbol_49 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
			
			
			DomainType static_A_symbol_50 = valueFactory.typeOf(A_symbol_49, A_symbol_48);
			LibraryBinaryOperation dynamic_A_symbol_50 = (LibraryBinaryOperation)static_A_symbol_50.lookupImplementation(standardLibrary, O_OclAny__lt__gt_);
			Value A_symbol_50 = dynamic_A_symbol_50.evaluate(evaluator, T_Boolean, A_symbol_49, A_symbol_48);
			return A_symbol_50;
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
			final Value A_symbol_51 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__OrderedSet);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_ = valueFactory.createTypeValue(PivotTables.Types._OrderedSetType);
			
			Value leftA_symbol_52;
			try {
				
				Value A_symbol_53 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_54 = valueFactory.typeOf(A_symbol_53, A_symbol_51);
				LibraryBinaryOperation dynamic_A_symbol_54 = (LibraryBinaryOperation)static_A_symbol_54.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_54 = dynamic_A_symbol_54.evaluate(evaluator, T_Boolean, A_symbol_53, A_symbol_51);
				leftA_symbol_52 = A_symbol_54;
			} catch (InvalidValueException e) {
				leftA_symbol_52 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_54 = leftA_symbol_52;
			Value rightA_symbol_52;
			try {
				
				Value A_symbol_55 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_56 = valueFactory.typeOf(A_symbol_55);
				LibraryBinaryOperation dynamic_A_symbol_56 = (LibraryBinaryOperation)static_A_symbol_56.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_56 = dynamic_A_symbol_56.evaluate(evaluator, T_Boolean, A_symbol_55, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
				rightA_symbol_52 = A_symbol_56;
			} catch (InvalidValueException e) {
				rightA_symbol_52 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_56 = rightA_symbol_52;
			DomainType static_A_symbol_52 = valueFactory.typeOf(A_symbol_54);
			LibraryBinaryOperation dynamic_A_symbol_52 = (LibraryBinaryOperation)static_A_symbol_52.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_52 = dynamic_A_symbol_52.evaluate(evaluator, T_Boolean, A_symbol_54, A_symbol_56);
			return A_symbol_52;
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
			final Value A_symbol_57 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Sequence);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SequenceType_ = valueFactory.createTypeValue(PivotTables.Types._SequenceType);
			
			Value leftA_symbol_58;
			try {
				
				Value A_symbol_59 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_60 = valueFactory.typeOf(A_symbol_59, A_symbol_57);
				LibraryBinaryOperation dynamic_A_symbol_60 = (LibraryBinaryOperation)static_A_symbol_60.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_60 = dynamic_A_symbol_60.evaluate(evaluator, T_Boolean, A_symbol_59, A_symbol_57);
				leftA_symbol_58 = A_symbol_60;
			} catch (InvalidValueException e) {
				leftA_symbol_58 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_60 = leftA_symbol_58;
			Value rightA_symbol_58;
			try {
				
				Value A_symbol_61 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_62 = valueFactory.typeOf(A_symbol_61);
				LibraryBinaryOperation dynamic_A_symbol_62 = (LibraryBinaryOperation)static_A_symbol_62.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_62 = dynamic_A_symbol_62.evaluate(evaluator, T_Boolean, A_symbol_61, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
				rightA_symbol_58 = A_symbol_62;
			} catch (InvalidValueException e) {
				rightA_symbol_58 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_62 = rightA_symbol_58;
			DomainType static_A_symbol_58 = valueFactory.typeOf(A_symbol_60);
			LibraryBinaryOperation dynamic_A_symbol_58 = (LibraryBinaryOperation)static_A_symbol_58.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_58 = dynamic_A_symbol_58.evaluate(evaluator, T_Boolean, A_symbol_60, A_symbol_62);
			return A_symbol_58;
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
			final Value A_symbol_63 = valueFactory.createEnumerationLiteralValue(PivotTables.EnumerationLiterals._CollectionKind__Set);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SetType_ = valueFactory.createTypeValue(PivotTables.Types._SetType);
			
			Value leftA_symbol_64;
			try {
				
				Value A_symbol_65 = IP_CollectionLiteralExp_kind.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionKind, self, P_CollectionLiteralExp_kind);
				
				
				DomainType static_A_symbol_66 = valueFactory.typeOf(A_symbol_65, A_symbol_63);
				LibraryBinaryOperation dynamic_A_symbol_66 = (LibraryBinaryOperation)static_A_symbol_66.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_66 = dynamic_A_symbol_66.evaluate(evaluator, T_Boolean, A_symbol_65, A_symbol_63);
				leftA_symbol_64 = A_symbol_66;
			} catch (InvalidValueException e) {
				leftA_symbol_64 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_66 = leftA_symbol_64;
			Value rightA_symbol_64;
			try {
				
				Value A_symbol_67 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_68 = valueFactory.typeOf(A_symbol_67);
				LibraryBinaryOperation dynamic_A_symbol_68 = (LibraryBinaryOperation)static_A_symbol_68.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_68 = dynamic_A_symbol_68.evaluate(evaluator, T_Boolean, A_symbol_67, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
				rightA_symbol_64 = A_symbol_68;
			} catch (InvalidValueException e) {
				rightA_symbol_64 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_68 = rightA_symbol_64;
			DomainType static_A_symbol_64 = valueFactory.typeOf(A_symbol_66);
			LibraryBinaryOperation dynamic_A_symbol_64 = (LibraryBinaryOperation)static_A_symbol_64.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_64 = dynamic_A_symbol_64.evaluate(evaluator, T_Boolean, A_symbol_66, A_symbol_68);
			return A_symbol_64;
		}
	}


}

