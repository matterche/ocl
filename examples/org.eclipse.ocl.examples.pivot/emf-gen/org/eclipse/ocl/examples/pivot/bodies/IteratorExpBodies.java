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

import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryIteration;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.library.LibraryUnaryOperation;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.StringValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * IteratorExpBodies provides the Java implementation bodies of OCL-defined IteratorExp operations and properties.
 */
@SuppressWarnings("nls")
public class IteratorExpBodies
{

	/** 
	 * Implementation of the IteratorExp 'AnyBodyTypeIsBoolean' invariant.
	 */
	public static class _invariant_AnyBodyTypeIsBoolean extends AbstractUnaryOperation
	{
		public static _invariant_AnyBodyTypeIsBoolean INSTANCE = new _invariant_AnyBodyTypeIsBoolean();
	
		/*
		name = 'any' implies body.type = 'Boolean'
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_any = valueFactory.stringValueOf("any");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_LoopExp_body = PivotTables.Properties._LoopExp__body;
			final LibraryProperty IP_LoopExp_body = P_LoopExp_body.getImplementation();
			final StringValue S_Boolean = valueFactory.stringValueOf("Boolean");
			
			Value leftA_symbol_60;
			try {
				
				Value A_symbol_61 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_62 = valueFactory.typeOf(A_symbol_61, S_any);
				LibraryBinaryOperation dynamic_A_symbol_62 = (LibraryBinaryOperation)static_A_symbol_62.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_62 = dynamic_A_symbol_62.evaluate(evaluator, T_Boolean, A_symbol_61, S_any);
				leftA_symbol_60 = A_symbol_62;
			} catch (InvalidValueException e) {
				leftA_symbol_60 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_62 = leftA_symbol_60;
			Value rightA_symbol_60;
			try {
				
				Value A_symbol_63 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_64 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_63, P_TypedElement_type);
				
				DomainType static_A_symbol_65 = valueFactory.typeOf(A_symbol_64, S_Boolean);
				LibraryBinaryOperation dynamic_A_symbol_65 = (LibraryBinaryOperation)static_A_symbol_65.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_65 = dynamic_A_symbol_65.evaluate(evaluator, T_Boolean, A_symbol_64, S_Boolean);
				rightA_symbol_60 = A_symbol_65;
			} catch (InvalidValueException e) {
				rightA_symbol_60 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_65 = rightA_symbol_60;
			DomainType static_A_symbol_60 = valueFactory.typeOf(A_symbol_62);
			LibraryBinaryOperation dynamic_A_symbol_60 = (LibraryBinaryOperation)static_A_symbol_60.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_60 = dynamic_A_symbol_60.evaluate(evaluator, T_Boolean, A_symbol_62, A_symbol_65);
			return A_symbol_60;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'AnyHasOneIterator' invariant.
	 */
	public static class _invariant_AnyHasOneIterator extends AbstractUnaryOperation
	{
		public static _invariant_AnyHasOneIterator INSTANCE = new _invariant_AnyHasOneIterator();
	
		/*
		name = 'any' implies iterator->size() = 1
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_any = valueFactory.stringValueOf("any");
			final ExecutorOperation O_Real__eq_ = OCLstdlibTables.Operations._Real___eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Variable_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Variable);
			final ExecutorProperty P_LoopExp_iterator = PivotTables.Properties._LoopExp__iterator;
			final LibraryProperty IP_LoopExp_iterator = P_LoopExp_iterator.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
			Value leftA_symbol_66;
			try {
				
				Value A_symbol_67 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_68 = valueFactory.typeOf(A_symbol_67, S_any);
				LibraryBinaryOperation dynamic_A_symbol_68 = (LibraryBinaryOperation)static_A_symbol_68.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_68 = dynamic_A_symbol_68.evaluate(evaluator, T_Boolean, A_symbol_67, S_any);
				leftA_symbol_66 = A_symbol_68;
			} catch (InvalidValueException e) {
				leftA_symbol_66 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_68 = leftA_symbol_66;
			Value rightA_symbol_66;
			try {
				
				Value A_symbol_69 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_70 = valueFactory.typeOf(A_symbol_69);
				LibraryUnaryOperation dynamic_A_symbol_70 = (LibraryUnaryOperation)static_A_symbol_70.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_70 = dynamic_A_symbol_70.evaluate(evaluator, T_Integer, A_symbol_69);
				DomainType static_A_symbol_71 = valueFactory.typeOf(A_symbol_70, I_1);
				LibraryBinaryOperation dynamic_A_symbol_71 = (LibraryBinaryOperation)static_A_symbol_71.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_71 = dynamic_A_symbol_71.evaluate(evaluator, T_Boolean, A_symbol_70, I_1);
				rightA_symbol_66 = A_symbol_71;
			} catch (InvalidValueException e) {
				rightA_symbol_66 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_71 = rightA_symbol_66;
			DomainType static_A_symbol_66 = valueFactory.typeOf(A_symbol_68);
			LibraryBinaryOperation dynamic_A_symbol_66 = (LibraryBinaryOperation)static_A_symbol_66.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_66 = dynamic_A_symbol_66.evaluate(evaluator, T_Boolean, A_symbol_68, A_symbol_71);
			return A_symbol_66;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'AnyTypeIsSourceElementType' invariant.
	 */
	public static class _invariant_AnyTypeIsSourceElementType extends AbstractUnaryOperation
	{
		public static _invariant_AnyTypeIsSourceElementType INSTANCE = new _invariant_AnyTypeIsSourceElementType();
	
		/*
		name = 'any' implies type = source.type.oclAsType(CollectionType).elementType
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_any = valueFactory.stringValueOf("any");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorProperty P_CollectionType_elementType = PivotTables.Properties._CollectionType__elementType;
			final LibraryProperty IP_CollectionType_elementType = P_CollectionType_elementType.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__CollectionType = PivotTables.Types._CollectionType;
			final ExecutorOperation O_OclAny_oclAsType = OCLstdlibTables.Operations._OclAny__oclAsType;
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_CallExp_source = PivotTables.Properties._CallExp__source;
			final LibraryProperty IP_CallExp_source = P_CallExp_source.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__CollectionType_ = valueFactory.createTypeValue(PivotTables.Types._CollectionType);
			
			Value leftA_symbol_72;
			try {
				
				Value A_symbol_73 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_74 = valueFactory.typeOf(A_symbol_73, S_any);
				LibraryBinaryOperation dynamic_A_symbol_74 = (LibraryBinaryOperation)static_A_symbol_74.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_74 = dynamic_A_symbol_74.evaluate(evaluator, T_Boolean, A_symbol_73, S_any);
				leftA_symbol_72 = A_symbol_74;
			} catch (InvalidValueException e) {
				leftA_symbol_72 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_74 = leftA_symbol_72;
			Value rightA_symbol_72;
			try {
				
				Value A_symbol_75 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_76 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_77 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_76, P_TypedElement_type);
				
				DomainType static_A_symbol_78 = valueFactory.typeOf(A_symbol_77);
				LibraryBinaryOperation dynamic_A_symbol_78 = (LibraryBinaryOperation)static_A_symbol_78.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_78 = dynamic_A_symbol_78.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_77, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_79 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_78, P_CollectionType_elementType);
				
				DomainType static_A_symbol_80 = valueFactory.typeOf(A_symbol_75, A_symbol_79);
				LibraryBinaryOperation dynamic_A_symbol_80 = (LibraryBinaryOperation)static_A_symbol_80.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_80 = dynamic_A_symbol_80.evaluate(evaluator, T_Boolean, A_symbol_75, A_symbol_79);
				rightA_symbol_72 = A_symbol_80;
			} catch (InvalidValueException e) {
				rightA_symbol_72 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_80 = rightA_symbol_72;
			DomainType static_A_symbol_72 = valueFactory.typeOf(A_symbol_74);
			LibraryBinaryOperation dynamic_A_symbol_72 = (LibraryBinaryOperation)static_A_symbol_72.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_72 = dynamic_A_symbol_72.evaluate(evaluator, T_Boolean, A_symbol_74, A_symbol_80);
			return A_symbol_72;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'ClosureElementTypeIsSourceElementType' invariant.
	 */
	public static class _invariant_ClosureElementTypeIsSourceElementType extends AbstractUnaryOperation
	{
		public static _invariant_ClosureElementTypeIsSourceElementType INSTANCE = new _invariant_ClosureElementTypeIsSourceElementType();
	
		/*
		name = 'closure' implies
	type.oclAsType(CollectionType).elementType =
	source.type.oclAsType(CollectionType).elementType
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_closure = valueFactory.stringValueOf("closure");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_CollectionType_elementType = PivotTables.Properties._CollectionType__elementType;
			final LibraryProperty IP_CollectionType_elementType = P_CollectionType_elementType.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__CollectionType = PivotTables.Types._CollectionType;
			final ExecutorOperation O_OclAny_oclAsType = OCLstdlibTables.Operations._OclAny__oclAsType;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__CollectionType_ = valueFactory.createTypeValue(PivotTables.Types._CollectionType);
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_CallExp_source = PivotTables.Properties._CallExp__source;
			final LibraryProperty IP_CallExp_source = P_CallExp_source.getImplementation();
			
			Value leftA_symbol_81;
			try {
				
				Value A_symbol_82 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_83 = valueFactory.typeOf(A_symbol_82, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_83 = (LibraryBinaryOperation)static_A_symbol_83.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_83 = dynamic_A_symbol_83.evaluate(evaluator, T_Boolean, A_symbol_82, S_closure);
				leftA_symbol_81 = A_symbol_83;
			} catch (InvalidValueException e) {
				leftA_symbol_81 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_83 = leftA_symbol_81;
			Value rightA_symbol_81;
			try {
				
				Value A_symbol_84 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_85 = valueFactory.typeOf(A_symbol_84);
				LibraryBinaryOperation dynamic_A_symbol_85 = (LibraryBinaryOperation)static_A_symbol_85.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_85 = dynamic_A_symbol_85.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_84, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_86 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_85, P_CollectionType_elementType);
				
				
				Value A_symbol_87 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_88 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_87, P_TypedElement_type);
				
				DomainType static_A_symbol_89 = valueFactory.typeOf(A_symbol_88);
				LibraryBinaryOperation dynamic_A_symbol_89 = (LibraryBinaryOperation)static_A_symbol_89.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_89 = dynamic_A_symbol_89.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_88, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_90 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_89, P_CollectionType_elementType);
				
				DomainType static_A_symbol_91 = valueFactory.typeOf(A_symbol_86, A_symbol_90);
				LibraryBinaryOperation dynamic_A_symbol_91 = (LibraryBinaryOperation)static_A_symbol_91.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_91 = dynamic_A_symbol_91.evaluate(evaluator, T_Boolean, A_symbol_86, A_symbol_90);
				rightA_symbol_81 = A_symbol_91;
			} catch (InvalidValueException e) {
				rightA_symbol_81 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_91 = rightA_symbol_81;
			DomainType static_A_symbol_81 = valueFactory.typeOf(A_symbol_83);
			LibraryBinaryOperation dynamic_A_symbol_81 = (LibraryBinaryOperation)static_A_symbol_81.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_81 = dynamic_A_symbol_81.evaluate(evaluator, T_Boolean, A_symbol_83, A_symbol_91);
			return A_symbol_81;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'ClosureHasOneIterator' invariant.
	 */
	public static class _invariant_ClosureHasOneIterator extends AbstractUnaryOperation
	{
		public static _invariant_ClosureHasOneIterator INSTANCE = new _invariant_ClosureHasOneIterator();
	
		/*
		name = 'closure' implies iterator->size() = 1
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_closure = valueFactory.stringValueOf("closure");
			final ExecutorOperation O_Real__eq_ = OCLstdlibTables.Operations._Real___eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Variable_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Variable);
			final ExecutorProperty P_LoopExp_iterator = PivotTables.Properties._LoopExp__iterator;
			final LibraryProperty IP_LoopExp_iterator = P_LoopExp_iterator.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
			Value leftA_symbol_92;
			try {
				
				Value A_symbol_93 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_94 = valueFactory.typeOf(A_symbol_93, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_94 = (LibraryBinaryOperation)static_A_symbol_94.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_94 = dynamic_A_symbol_94.evaluate(evaluator, T_Boolean, A_symbol_93, S_closure);
				leftA_symbol_92 = A_symbol_94;
			} catch (InvalidValueException e) {
				leftA_symbol_92 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_94 = leftA_symbol_92;
			Value rightA_symbol_92;
			try {
				
				Value A_symbol_95 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_96 = valueFactory.typeOf(A_symbol_95);
				LibraryUnaryOperation dynamic_A_symbol_96 = (LibraryUnaryOperation)static_A_symbol_96.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_96 = dynamic_A_symbol_96.evaluate(evaluator, T_Integer, A_symbol_95);
				DomainType static_A_symbol_97 = valueFactory.typeOf(A_symbol_96, I_1);
				LibraryBinaryOperation dynamic_A_symbol_97 = (LibraryBinaryOperation)static_A_symbol_97.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_97 = dynamic_A_symbol_97.evaluate(evaluator, T_Boolean, A_symbol_96, I_1);
				rightA_symbol_92 = A_symbol_97;
			} catch (InvalidValueException e) {
				rightA_symbol_92 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_97 = rightA_symbol_92;
			DomainType static_A_symbol_92 = valueFactory.typeOf(A_symbol_94);
			LibraryBinaryOperation dynamic_A_symbol_92 = (LibraryBinaryOperation)static_A_symbol_92.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_92 = dynamic_A_symbol_92.evaluate(evaluator, T_Boolean, A_symbol_94, A_symbol_97);
			return A_symbol_92;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'ClosureSourceElementTypeIsBodyElementType' invariant.
	 */
	public static class _invariant_ClosureSourceElementTypeIsBodyElementType extends AbstractUnaryOperation
	{
		public static _invariant_ClosureSourceElementTypeIsBodyElementType INSTANCE = new _invariant_ClosureSourceElementTypeIsBodyElementType();
	
		/*
		name = 'closure' implies
	source.type.oclAsType(CollectionType).elementType =
	if body.type.oclIsKindOf(CollectionType)
	then body.type.oclAsType(CollectionType).elementType
	else body.type
	endif
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_closure = valueFactory.stringValueOf("closure");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_CollectionType_elementType = PivotTables.Properties._CollectionType__elementType;
			final LibraryProperty IP_CollectionType_elementType = P_CollectionType_elementType.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__CollectionType = PivotTables.Types._CollectionType;
			final ExecutorOperation O_OclAny_oclAsType = OCLstdlibTables.Operations._OclAny__oclAsType;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_CallExp_source = PivotTables.Properties._CallExp__source;
			final LibraryProperty IP_CallExp_source = P_CallExp_source.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__CollectionType_ = valueFactory.createTypeValue(PivotTables.Types._CollectionType);
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorProperty P_LoopExp_body = PivotTables.Properties._LoopExp__body;
			final LibraryProperty IP_LoopExp_body = P_LoopExp_body.getImplementation();
			
			Value leftA_symbol_98;
			try {
				
				Value A_symbol_99 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_100 = valueFactory.typeOf(A_symbol_99, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_100 = (LibraryBinaryOperation)static_A_symbol_100.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_100 = dynamic_A_symbol_100.evaluate(evaluator, T_Boolean, A_symbol_99, S_closure);
				leftA_symbol_98 = A_symbol_100;
			} catch (InvalidValueException e) {
				leftA_symbol_98 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_100 = leftA_symbol_98;
			Value rightA_symbol_98;
			try {
				
				Value A_symbol_101 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_102 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_101, P_TypedElement_type);
				
				DomainType static_A_symbol_103 = valueFactory.typeOf(A_symbol_102);
				LibraryBinaryOperation dynamic_A_symbol_103 = (LibraryBinaryOperation)static_A_symbol_103.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_103 = dynamic_A_symbol_103.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_102, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_104 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_103, P_CollectionType_elementType);
				
					
					Value A_symbol_105 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_106 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_105, P_TypedElement_type);
					
					DomainType static_A_symbol_107 = valueFactory.typeOf(A_symbol_106);
					LibraryBinaryOperation dynamic_A_symbol_107 = (LibraryBinaryOperation)static_A_symbol_107.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_107 = dynamic_A_symbol_107.evaluate(evaluator, T_Boolean, A_symbol_106, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_108;
				if (A_symbol_107.isTrue()) {
					
					Value A_symbol_109 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_110 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_109, P_TypedElement_type);
					
					DomainType static_A_symbol_111 = valueFactory.typeOf(A_symbol_110);
					LibraryBinaryOperation dynamic_A_symbol_111 = (LibraryBinaryOperation)static_A_symbol_111.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_111 = dynamic_A_symbol_111.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_110, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_112 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_111, P_CollectionType_elementType);
					
					A_symbol_108 = A_symbol_112;
				}
				else if (A_symbol_107.isFalse()) {
					
					Value A_symbol_113 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_114 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_113, P_TypedElement_type);
					
					A_symbol_108 = A_symbol_114;
				}
				else if (A_symbol_107.isNull()) {
					A_symbol_108 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_108 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				DomainType static_A_symbol_115 = valueFactory.typeOf(A_symbol_104, A_symbol_108);
				LibraryBinaryOperation dynamic_A_symbol_115 = (LibraryBinaryOperation)static_A_symbol_115.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_115 = dynamic_A_symbol_115.evaluate(evaluator, T_Boolean, A_symbol_104, A_symbol_108);
				rightA_symbol_98 = A_symbol_115;
			} catch (InvalidValueException e) {
				rightA_symbol_98 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_115 = rightA_symbol_98;
			DomainType static_A_symbol_98 = valueFactory.typeOf(A_symbol_100);
			LibraryBinaryOperation dynamic_A_symbol_98 = (LibraryBinaryOperation)static_A_symbol_98.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_98 = dynamic_A_symbol_98.evaluate(evaluator, T_Boolean, A_symbol_100, A_symbol_115);
			return A_symbol_98;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'ClosureTypeIsUniqueCollection' invariant.
	 */
	public static class _invariant_ClosureTypeIsUniqueCollection extends AbstractUnaryOperation
	{
		public static _invariant_ClosureTypeIsUniqueCollection INSTANCE = new _invariant_ClosureTypeIsUniqueCollection();
	
		/*
		name = 'closure' implies
	if
	  source.type.oclIsKindOf(SequenceType) or
	  source.type.oclIsKindOf(OrderedSetType)
	then type.oclIsKindOf(OrderedSetType)
	else type.oclIsKindOf(SetType)
	endif
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_closure = valueFactory.stringValueOf("closure");
			final ExecutorOperation O_Boolean_or = OCLstdlibTables.Operations._Boolean__or;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_CallExp_source = PivotTables.Properties._CallExp__source;
			final LibraryProperty IP_CallExp_source = P_CallExp_source.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SequenceType_ = valueFactory.createTypeValue(PivotTables.Types._SequenceType);
			final Value T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_ = valueFactory.createTypeValue(PivotTables.Types._OrderedSetType);
			final Value T_ClassClassifier_Pivot_ecore__pivot__SetType_ = valueFactory.createTypeValue(PivotTables.Types._SetType);
			
			Value leftA_symbol_116;
			try {
				
				Value A_symbol_117 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_118 = valueFactory.typeOf(A_symbol_117, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_118 = (LibraryBinaryOperation)static_A_symbol_118.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_118 = dynamic_A_symbol_118.evaluate(evaluator, T_Boolean, A_symbol_117, S_closure);
				leftA_symbol_116 = A_symbol_118;
			} catch (InvalidValueException e) {
				leftA_symbol_116 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_118 = leftA_symbol_116;
			Value rightA_symbol_116;
			try {
					Value leftA_symbol_119;
					try {
						
						Value A_symbol_120 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_121 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_120, P_TypedElement_type);
						
						DomainType static_A_symbol_122 = valueFactory.typeOf(A_symbol_121);
						LibraryBinaryOperation dynamic_A_symbol_122 = (LibraryBinaryOperation)static_A_symbol_122.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_122 = dynamic_A_symbol_122.evaluate(evaluator, T_Boolean, A_symbol_121, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_119 = A_symbol_122;
					} catch (InvalidValueException e) {
						leftA_symbol_119 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_122 = leftA_symbol_119;
					Value rightA_symbol_119;
					try {
						
						Value A_symbol_123 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_124 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_123, P_TypedElement_type);
						
						DomainType static_A_symbol_125 = valueFactory.typeOf(A_symbol_124);
						LibraryBinaryOperation dynamic_A_symbol_125 = (LibraryBinaryOperation)static_A_symbol_125.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_125 = dynamic_A_symbol_125.evaluate(evaluator, T_Boolean, A_symbol_124, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_119 = A_symbol_125;
					} catch (InvalidValueException e) {
						rightA_symbol_119 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_125 = rightA_symbol_119;
					DomainType static_A_symbol_119 = valueFactory.typeOf(A_symbol_122);
					LibraryBinaryOperation dynamic_A_symbol_119 = (LibraryBinaryOperation)static_A_symbol_119.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_119 = dynamic_A_symbol_119.evaluate(evaluator, T_Boolean, A_symbol_122, A_symbol_125);
				Value A_symbol_126;
				if (A_symbol_119.isTrue()) {
					
					Value A_symbol_127 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_128 = valueFactory.typeOf(A_symbol_127);
					LibraryBinaryOperation dynamic_A_symbol_128 = (LibraryBinaryOperation)static_A_symbol_128.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_128 = dynamic_A_symbol_128.evaluate(evaluator, T_Boolean, A_symbol_127, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_126 = A_symbol_128;
				}
				else if (A_symbol_119.isFalse()) {
					
					Value A_symbol_129 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_130 = valueFactory.typeOf(A_symbol_129);
					LibraryBinaryOperation dynamic_A_symbol_130 = (LibraryBinaryOperation)static_A_symbol_130.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_130 = dynamic_A_symbol_130.evaluate(evaluator, T_Boolean, A_symbol_129, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
					A_symbol_126 = A_symbol_130;
				}
				else if (A_symbol_119.isNull()) {
					A_symbol_126 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_126 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_116 = A_symbol_126;
			} catch (InvalidValueException e) {
				rightA_symbol_116 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_126 = rightA_symbol_116;
			DomainType static_A_symbol_116 = valueFactory.typeOf(A_symbol_118);
			LibraryBinaryOperation dynamic_A_symbol_116 = (LibraryBinaryOperation)static_A_symbol_116.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_116 = dynamic_A_symbol_116.evaluate(evaluator, T_Boolean, A_symbol_118, A_symbol_126);
			return A_symbol_116;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'CollectElementTypeIsSourceElementType' invariant.
	 */
	public static class _invariant_CollectElementTypeIsSourceElementType extends AbstractUnaryOperation
	{
		public static _invariant_CollectElementTypeIsSourceElementType INSTANCE = new _invariant_CollectElementTypeIsSourceElementType();
	
		/*
		name = 'collect' implies
	type.oclAsType(CollectionType).elementType =
	body.type.oclAsType(CollectionType).elementType
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_collect = valueFactory.stringValueOf("collect");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_CollectionType_elementType = PivotTables.Properties._CollectionType__elementType;
			final LibraryProperty IP_CollectionType_elementType = P_CollectionType_elementType.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__CollectionType = PivotTables.Types._CollectionType;
			final ExecutorOperation O_OclAny_oclAsType = OCLstdlibTables.Operations._OclAny__oclAsType;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__CollectionType_ = valueFactory.createTypeValue(PivotTables.Types._CollectionType);
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_LoopExp_body = PivotTables.Properties._LoopExp__body;
			final LibraryProperty IP_LoopExp_body = P_LoopExp_body.getImplementation();
			
			Value leftA_symbol_131;
			try {
				
				Value A_symbol_132 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_133 = valueFactory.typeOf(A_symbol_132, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_133 = (LibraryBinaryOperation)static_A_symbol_133.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_133 = dynamic_A_symbol_133.evaluate(evaluator, T_Boolean, A_symbol_132, S_collect);
				leftA_symbol_131 = A_symbol_133;
			} catch (InvalidValueException e) {
				leftA_symbol_131 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_133 = leftA_symbol_131;
			Value rightA_symbol_131;
			try {
				
				Value A_symbol_134 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_135 = valueFactory.typeOf(A_symbol_134);
				LibraryBinaryOperation dynamic_A_symbol_135 = (LibraryBinaryOperation)static_A_symbol_135.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_135 = dynamic_A_symbol_135.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_134, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_136 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_135, P_CollectionType_elementType);
				
				
				Value A_symbol_137 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_138 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_137, P_TypedElement_type);
				
				DomainType static_A_symbol_139 = valueFactory.typeOf(A_symbol_138);
				LibraryBinaryOperation dynamic_A_symbol_139 = (LibraryBinaryOperation)static_A_symbol_139.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_139 = dynamic_A_symbol_139.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_138, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_140 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_139, P_CollectionType_elementType);
				
				DomainType static_A_symbol_141 = valueFactory.typeOf(A_symbol_136, A_symbol_140);
				LibraryBinaryOperation dynamic_A_symbol_141 = (LibraryBinaryOperation)static_A_symbol_141.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_141 = dynamic_A_symbol_141.evaluate(evaluator, T_Boolean, A_symbol_136, A_symbol_140);
				rightA_symbol_131 = A_symbol_141;
			} catch (InvalidValueException e) {
				rightA_symbol_131 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_141 = rightA_symbol_131;
			DomainType static_A_symbol_131 = valueFactory.typeOf(A_symbol_133);
			LibraryBinaryOperation dynamic_A_symbol_131 = (LibraryBinaryOperation)static_A_symbol_131.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_131 = dynamic_A_symbol_131.evaluate(evaluator, T_Boolean, A_symbol_133, A_symbol_141);
			return A_symbol_131;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'CollectHasOneIterator' invariant.
	 */
	public static class _invariant_CollectHasOneIterator extends AbstractUnaryOperation
	{
		public static _invariant_CollectHasOneIterator INSTANCE = new _invariant_CollectHasOneIterator();
	
		/*
		name = 'collect' implies iterator->size() = 1
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_collect = valueFactory.stringValueOf("collect");
			final ExecutorOperation O_Real__eq_ = OCLstdlibTables.Operations._Real___eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Variable_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Variable);
			final ExecutorProperty P_LoopExp_iterator = PivotTables.Properties._LoopExp__iterator;
			final LibraryProperty IP_LoopExp_iterator = P_LoopExp_iterator.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
			Value leftA_symbol_142;
			try {
				
				Value A_symbol_143 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_144 = valueFactory.typeOf(A_symbol_143, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_144 = (LibraryBinaryOperation)static_A_symbol_144.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_144 = dynamic_A_symbol_144.evaluate(evaluator, T_Boolean, A_symbol_143, S_collect);
				leftA_symbol_142 = A_symbol_144;
			} catch (InvalidValueException e) {
				leftA_symbol_142 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_144 = leftA_symbol_142;
			Value rightA_symbol_142;
			try {
				
				Value A_symbol_145 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_146 = valueFactory.typeOf(A_symbol_145);
				LibraryUnaryOperation dynamic_A_symbol_146 = (LibraryUnaryOperation)static_A_symbol_146.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_146 = dynamic_A_symbol_146.evaluate(evaluator, T_Integer, A_symbol_145);
				DomainType static_A_symbol_147 = valueFactory.typeOf(A_symbol_146, I_1);
				LibraryBinaryOperation dynamic_A_symbol_147 = (LibraryBinaryOperation)static_A_symbol_147.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_147 = dynamic_A_symbol_147.evaluate(evaluator, T_Boolean, A_symbol_146, I_1);
				rightA_symbol_142 = A_symbol_147;
			} catch (InvalidValueException e) {
				rightA_symbol_142 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_147 = rightA_symbol_142;
			DomainType static_A_symbol_142 = valueFactory.typeOf(A_symbol_144);
			LibraryBinaryOperation dynamic_A_symbol_142 = (LibraryBinaryOperation)static_A_symbol_142.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_142 = dynamic_A_symbol_142.evaluate(evaluator, T_Boolean, A_symbol_144, A_symbol_147);
			return A_symbol_142;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'CollectNestedHasOneIterator' invariant.
	 */
	public static class _invariant_CollectNestedHasOneIterator extends AbstractUnaryOperation
	{
		public static _invariant_CollectNestedHasOneIterator INSTANCE = new _invariant_CollectNestedHasOneIterator();
	
		/*
		name = 'collectNested' implies iterator->size() = 1
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_collectN___ = valueFactory.stringValueOf("collectNested");
			final ExecutorOperation O_Real__eq_ = OCLstdlibTables.Operations._Real___eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Variable_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Variable);
			final ExecutorProperty P_LoopExp_iterator = PivotTables.Properties._LoopExp__iterator;
			final LibraryProperty IP_LoopExp_iterator = P_LoopExp_iterator.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
			Value leftA_symbol_148;
			try {
				
				Value A_symbol_149 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_150 = valueFactory.typeOf(A_symbol_149, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_150 = (LibraryBinaryOperation)static_A_symbol_150.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_150 = dynamic_A_symbol_150.evaluate(evaluator, T_Boolean, A_symbol_149, S_collectN___);
				leftA_symbol_148 = A_symbol_150;
			} catch (InvalidValueException e) {
				leftA_symbol_148 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_150 = leftA_symbol_148;
			Value rightA_symbol_148;
			try {
				
				Value A_symbol_151 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_152 = valueFactory.typeOf(A_symbol_151);
				LibraryUnaryOperation dynamic_A_symbol_152 = (LibraryUnaryOperation)static_A_symbol_152.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_152 = dynamic_A_symbol_152.evaluate(evaluator, T_Integer, A_symbol_151);
				DomainType static_A_symbol_153 = valueFactory.typeOf(A_symbol_152, I_1);
				LibraryBinaryOperation dynamic_A_symbol_153 = (LibraryBinaryOperation)static_A_symbol_153.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_153 = dynamic_A_symbol_153.evaluate(evaluator, T_Boolean, A_symbol_152, I_1);
				rightA_symbol_148 = A_symbol_153;
			} catch (InvalidValueException e) {
				rightA_symbol_148 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_153 = rightA_symbol_148;
			DomainType static_A_symbol_148 = valueFactory.typeOf(A_symbol_150);
			LibraryBinaryOperation dynamic_A_symbol_148 = (LibraryBinaryOperation)static_A_symbol_148.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_148 = dynamic_A_symbol_148.evaluate(evaluator, T_Boolean, A_symbol_150, A_symbol_153);
			return A_symbol_148;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'CollectNestedTypeIsBag' invariant.
	 */
	public static class _invariant_CollectNestedTypeIsBag extends AbstractUnaryOperation
	{
		public static _invariant_CollectNestedTypeIsBag INSTANCE = new _invariant_CollectNestedTypeIsBag();
	
		/*
		name = 'collectNested' implies type.oclIsKindOf(BagType)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_collectN___ = valueFactory.stringValueOf("collectNested");
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__BagType_ = valueFactory.createTypeValue(PivotTables.Types._BagType);
			
			Value leftA_symbol_154;
			try {
				
				Value A_symbol_155 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_156 = valueFactory.typeOf(A_symbol_155, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_156 = (LibraryBinaryOperation)static_A_symbol_156.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_156 = dynamic_A_symbol_156.evaluate(evaluator, T_Boolean, A_symbol_155, S_collectN___);
				leftA_symbol_154 = A_symbol_156;
			} catch (InvalidValueException e) {
				leftA_symbol_154 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_156 = leftA_symbol_154;
			Value rightA_symbol_154;
			try {
				
				Value A_symbol_157 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_158 = valueFactory.typeOf(A_symbol_157);
				LibraryBinaryOperation dynamic_A_symbol_158 = (LibraryBinaryOperation)static_A_symbol_158.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_158 = dynamic_A_symbol_158.evaluate(evaluator, T_Boolean, A_symbol_157, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
				rightA_symbol_154 = A_symbol_158;
			} catch (InvalidValueException e) {
				rightA_symbol_154 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_158 = rightA_symbol_154;
			DomainType static_A_symbol_154 = valueFactory.typeOf(A_symbol_156);
			LibraryBinaryOperation dynamic_A_symbol_154 = (LibraryBinaryOperation)static_A_symbol_154.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_154 = dynamic_A_symbol_154.evaluate(evaluator, T_Boolean, A_symbol_156, A_symbol_158);
			return A_symbol_154;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'CollectNestedTypeIsBodyType' invariant.
	 */
	public static class _invariant_CollectNestedTypeIsBodyType extends AbstractUnaryOperation
	{
		public static _invariant_CollectNestedTypeIsBodyType INSTANCE = new _invariant_CollectNestedTypeIsBodyType();
	
		/*
		name = 'collectNested' implies type = body.type
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_collectN___ = valueFactory.stringValueOf("collectNested");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_LoopExp_body = PivotTables.Properties._LoopExp__body;
			final LibraryProperty IP_LoopExp_body = P_LoopExp_body.getImplementation();
			
			Value leftA_symbol_159;
			try {
				
				Value A_symbol_160 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_161 = valueFactory.typeOf(A_symbol_160, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_161 = (LibraryBinaryOperation)static_A_symbol_161.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_161 = dynamic_A_symbol_161.evaluate(evaluator, T_Boolean, A_symbol_160, S_collectN___);
				leftA_symbol_159 = A_symbol_161;
			} catch (InvalidValueException e) {
				leftA_symbol_159 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_161 = leftA_symbol_159;
			Value rightA_symbol_159;
			try {
				
				Value A_symbol_162 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_163 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_164 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_163, P_TypedElement_type);
				
				DomainType static_A_symbol_165 = valueFactory.typeOf(A_symbol_162, A_symbol_164);
				LibraryBinaryOperation dynamic_A_symbol_165 = (LibraryBinaryOperation)static_A_symbol_165.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_165 = dynamic_A_symbol_165.evaluate(evaluator, T_Boolean, A_symbol_162, A_symbol_164);
				rightA_symbol_159 = A_symbol_165;
			} catch (InvalidValueException e) {
				rightA_symbol_159 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_165 = rightA_symbol_159;
			DomainType static_A_symbol_159 = valueFactory.typeOf(A_symbol_161);
			LibraryBinaryOperation dynamic_A_symbol_159 = (LibraryBinaryOperation)static_A_symbol_159.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_159 = dynamic_A_symbol_159.evaluate(evaluator, T_Boolean, A_symbol_161, A_symbol_165);
			return A_symbol_159;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'CollectTypeIsUnordered' invariant.
	 */
	public static class _invariant_CollectTypeIsUnordered extends AbstractUnaryOperation
	{
		public static _invariant_CollectTypeIsUnordered INSTANCE = new _invariant_CollectTypeIsUnordered();
	
		/*
		name = 'collect' implies
	if
	  source.type.oclIsKindOf(SequenceType) or
	  source.type.oclIsKindOf(OrderedSetType)
	then type.oclIsKindOf(SequenceType)
	else type.oclIsKindOf(BagType)
	endif
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_collect = valueFactory.stringValueOf("collect");
			final ExecutorOperation O_Boolean_or = OCLstdlibTables.Operations._Boolean__or;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_CallExp_source = PivotTables.Properties._CallExp__source;
			final LibraryProperty IP_CallExp_source = P_CallExp_source.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SequenceType_ = valueFactory.createTypeValue(PivotTables.Types._SequenceType);
			final Value T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_ = valueFactory.createTypeValue(PivotTables.Types._OrderedSetType);
			final Value T_ClassClassifier_Pivot_ecore__pivot__BagType_ = valueFactory.createTypeValue(PivotTables.Types._BagType);
			
			Value leftA_symbol_166;
			try {
				
				Value A_symbol_167 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_168 = valueFactory.typeOf(A_symbol_167, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_168 = (LibraryBinaryOperation)static_A_symbol_168.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_168 = dynamic_A_symbol_168.evaluate(evaluator, T_Boolean, A_symbol_167, S_collect);
				leftA_symbol_166 = A_symbol_168;
			} catch (InvalidValueException e) {
				leftA_symbol_166 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_168 = leftA_symbol_166;
			Value rightA_symbol_166;
			try {
					Value leftA_symbol_169;
					try {
						
						Value A_symbol_170 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_171 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_170, P_TypedElement_type);
						
						DomainType static_A_symbol_172 = valueFactory.typeOf(A_symbol_171);
						LibraryBinaryOperation dynamic_A_symbol_172 = (LibraryBinaryOperation)static_A_symbol_172.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_172 = dynamic_A_symbol_172.evaluate(evaluator, T_Boolean, A_symbol_171, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_169 = A_symbol_172;
					} catch (InvalidValueException e) {
						leftA_symbol_169 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_172 = leftA_symbol_169;
					Value rightA_symbol_169;
					try {
						
						Value A_symbol_173 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_174 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_173, P_TypedElement_type);
						
						DomainType static_A_symbol_175 = valueFactory.typeOf(A_symbol_174);
						LibraryBinaryOperation dynamic_A_symbol_175 = (LibraryBinaryOperation)static_A_symbol_175.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_175 = dynamic_A_symbol_175.evaluate(evaluator, T_Boolean, A_symbol_174, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_169 = A_symbol_175;
					} catch (InvalidValueException e) {
						rightA_symbol_169 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_175 = rightA_symbol_169;
					DomainType static_A_symbol_169 = valueFactory.typeOf(A_symbol_172);
					LibraryBinaryOperation dynamic_A_symbol_169 = (LibraryBinaryOperation)static_A_symbol_169.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_169 = dynamic_A_symbol_169.evaluate(evaluator, T_Boolean, A_symbol_172, A_symbol_175);
				Value A_symbol_176;
				if (A_symbol_169.isTrue()) {
					
					Value A_symbol_177 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_178 = valueFactory.typeOf(A_symbol_177);
					LibraryBinaryOperation dynamic_A_symbol_178 = (LibraryBinaryOperation)static_A_symbol_178.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_178 = dynamic_A_symbol_178.evaluate(evaluator, T_Boolean, A_symbol_177, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_176 = A_symbol_178;
				}
				else if (A_symbol_169.isFalse()) {
					
					Value A_symbol_179 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_180 = valueFactory.typeOf(A_symbol_179);
					LibraryBinaryOperation dynamic_A_symbol_180 = (LibraryBinaryOperation)static_A_symbol_180.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_180 = dynamic_A_symbol_180.evaluate(evaluator, T_Boolean, A_symbol_179, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
					A_symbol_176 = A_symbol_180;
				}
				else if (A_symbol_169.isNull()) {
					A_symbol_176 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_176 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_166 = A_symbol_176;
			} catch (InvalidValueException e) {
				rightA_symbol_166 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_176 = rightA_symbol_166;
			DomainType static_A_symbol_166 = valueFactory.typeOf(A_symbol_168);
			LibraryBinaryOperation dynamic_A_symbol_166 = (LibraryBinaryOperation)static_A_symbol_166.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_166 = dynamic_A_symbol_166.evaluate(evaluator, T_Boolean, A_symbol_168, A_symbol_176);
			return A_symbol_166;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'ExistsBodyTypeIsBoolean' invariant.
	 */
	public static class _invariant_ExistsBodyTypeIsBoolean extends AbstractUnaryOperation
	{
		public static _invariant_ExistsBodyTypeIsBoolean INSTANCE = new _invariant_ExistsBodyTypeIsBoolean();
	
		/*
		name = 'exists' implies body.type = Boolean
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_exists = valueFactory.stringValueOf("exists");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_LoopExp_body = PivotTables.Properties._LoopExp__body;
			final LibraryProperty IP_LoopExp_body = P_LoopExp_body.getImplementation();
			final Value T_ClassClassifier_Boolean_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Boolean);
			
			Value leftA_symbol_181;
			try {
				
				Value A_symbol_182 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_183 = valueFactory.typeOf(A_symbol_182, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_183 = (LibraryBinaryOperation)static_A_symbol_183.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_183 = dynamic_A_symbol_183.evaluate(evaluator, T_Boolean, A_symbol_182, S_exists);
				leftA_symbol_181 = A_symbol_183;
			} catch (InvalidValueException e) {
				leftA_symbol_181 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_183 = leftA_symbol_181;
			Value rightA_symbol_181;
			try {
				
				Value A_symbol_184 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_185 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_184, P_TypedElement_type);
				
				DomainType static_A_symbol_186 = valueFactory.typeOf(A_symbol_185, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_186 = (LibraryBinaryOperation)static_A_symbol_186.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_186 = dynamic_A_symbol_186.evaluate(evaluator, T_Boolean, A_symbol_185, T_ClassClassifier_Boolean_);
				rightA_symbol_181 = A_symbol_186;
			} catch (InvalidValueException e) {
				rightA_symbol_181 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_186 = rightA_symbol_181;
			DomainType static_A_symbol_181 = valueFactory.typeOf(A_symbol_183);
			LibraryBinaryOperation dynamic_A_symbol_181 = (LibraryBinaryOperation)static_A_symbol_181.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_181 = dynamic_A_symbol_181.evaluate(evaluator, T_Boolean, A_symbol_183, A_symbol_186);
			return A_symbol_181;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'ExistsTypeIsBoolean' invariant.
	 */
	public static class _invariant_ExistsTypeIsBoolean extends AbstractUnaryOperation
	{
		public static _invariant_ExistsTypeIsBoolean INSTANCE = new _invariant_ExistsTypeIsBoolean();
	
		/*
		name = 'exists' implies type = Boolean
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_exists = valueFactory.stringValueOf("exists");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Boolean_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Boolean);
			
			Value leftA_symbol_187;
			try {
				
				Value A_symbol_188 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_189 = valueFactory.typeOf(A_symbol_188, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_189 = (LibraryBinaryOperation)static_A_symbol_189.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_189 = dynamic_A_symbol_189.evaluate(evaluator, T_Boolean, A_symbol_188, S_exists);
				leftA_symbol_187 = A_symbol_189;
			} catch (InvalidValueException e) {
				leftA_symbol_187 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_189 = leftA_symbol_187;
			Value rightA_symbol_187;
			try {
				
				Value A_symbol_190 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_191 = valueFactory.typeOf(A_symbol_190, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_191 = (LibraryBinaryOperation)static_A_symbol_191.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_191 = dynamic_A_symbol_191.evaluate(evaluator, T_Boolean, A_symbol_190, T_ClassClassifier_Boolean_);
				rightA_symbol_187 = A_symbol_191;
			} catch (InvalidValueException e) {
				rightA_symbol_187 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_191 = rightA_symbol_187;
			DomainType static_A_symbol_187 = valueFactory.typeOf(A_symbol_189);
			LibraryBinaryOperation dynamic_A_symbol_187 = (LibraryBinaryOperation)static_A_symbol_187.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_187 = dynamic_A_symbol_187.evaluate(evaluator, T_Boolean, A_symbol_189, A_symbol_191);
			return A_symbol_187;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'ForAllBodyTypeIsBoolean' invariant.
	 */
	public static class _invariant_ForAllBodyTypeIsBoolean extends AbstractUnaryOperation
	{
		public static _invariant_ForAllBodyTypeIsBoolean INSTANCE = new _invariant_ForAllBodyTypeIsBoolean();
	
		/*
		name = 'forAll' implies body.type = Boolean
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_forAll = valueFactory.stringValueOf("forAll");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_LoopExp_body = PivotTables.Properties._LoopExp__body;
			final LibraryProperty IP_LoopExp_body = P_LoopExp_body.getImplementation();
			final Value T_ClassClassifier_Boolean_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Boolean);
			
			Value leftA_symbol_192;
			try {
				
				Value A_symbol_193 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_194 = valueFactory.typeOf(A_symbol_193, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_194 = (LibraryBinaryOperation)static_A_symbol_194.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_194 = dynamic_A_symbol_194.evaluate(evaluator, T_Boolean, A_symbol_193, S_forAll);
				leftA_symbol_192 = A_symbol_194;
			} catch (InvalidValueException e) {
				leftA_symbol_192 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_194 = leftA_symbol_192;
			Value rightA_symbol_192;
			try {
				
				Value A_symbol_195 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_196 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_195, P_TypedElement_type);
				
				DomainType static_A_symbol_197 = valueFactory.typeOf(A_symbol_196, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_197 = (LibraryBinaryOperation)static_A_symbol_197.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_197 = dynamic_A_symbol_197.evaluate(evaluator, T_Boolean, A_symbol_196, T_ClassClassifier_Boolean_);
				rightA_symbol_192 = A_symbol_197;
			} catch (InvalidValueException e) {
				rightA_symbol_192 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_197 = rightA_symbol_192;
			DomainType static_A_symbol_192 = valueFactory.typeOf(A_symbol_194);
			LibraryBinaryOperation dynamic_A_symbol_192 = (LibraryBinaryOperation)static_A_symbol_192.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_192 = dynamic_A_symbol_192.evaluate(evaluator, T_Boolean, A_symbol_194, A_symbol_197);
			return A_symbol_192;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'ForAllTypeIsBoolean' invariant.
	 */
	public static class _invariant_ForAllTypeIsBoolean extends AbstractUnaryOperation
	{
		public static _invariant_ForAllTypeIsBoolean INSTANCE = new _invariant_ForAllTypeIsBoolean();
	
		/*
		name = 'forAll' implies type = Boolean
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_forAll = valueFactory.stringValueOf("forAll");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Boolean_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Boolean);
			
			Value leftA_symbol_198;
			try {
				
				Value A_symbol_199 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_200 = valueFactory.typeOf(A_symbol_199, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_200 = (LibraryBinaryOperation)static_A_symbol_200.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_200 = dynamic_A_symbol_200.evaluate(evaluator, T_Boolean, A_symbol_199, S_forAll);
				leftA_symbol_198 = A_symbol_200;
			} catch (InvalidValueException e) {
				leftA_symbol_198 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_200 = leftA_symbol_198;
			Value rightA_symbol_198;
			try {
				
				Value A_symbol_201 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_202 = valueFactory.typeOf(A_symbol_201, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_202 = (LibraryBinaryOperation)static_A_symbol_202.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_202 = dynamic_A_symbol_202.evaluate(evaluator, T_Boolean, A_symbol_201, T_ClassClassifier_Boolean_);
				rightA_symbol_198 = A_symbol_202;
			} catch (InvalidValueException e) {
				rightA_symbol_198 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_202 = rightA_symbol_198;
			DomainType static_A_symbol_198 = valueFactory.typeOf(A_symbol_200);
			LibraryBinaryOperation dynamic_A_symbol_198 = (LibraryBinaryOperation)static_A_symbol_198.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_198 = dynamic_A_symbol_198.evaluate(evaluator, T_Boolean, A_symbol_200, A_symbol_202);
			return A_symbol_198;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'IsUniqueHasOneIterator' invariant.
	 */
	public static class _invariant_IsUniqueHasOneIterator extends AbstractUnaryOperation
	{
		public static _invariant_IsUniqueHasOneIterator INSTANCE = new _invariant_IsUniqueHasOneIterator();
	
		/*
		name = 'isUnique' implies iterator->size() = 1
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_isUnique = valueFactory.stringValueOf("isUnique");
			final ExecutorOperation O_Real__eq_ = OCLstdlibTables.Operations._Real___eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Variable_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Variable);
			final ExecutorProperty P_LoopExp_iterator = PivotTables.Properties._LoopExp__iterator;
			final LibraryProperty IP_LoopExp_iterator = P_LoopExp_iterator.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
			Value leftA_symbol_203;
			try {
				
				Value A_symbol_204 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_205 = valueFactory.typeOf(A_symbol_204, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_205 = (LibraryBinaryOperation)static_A_symbol_205.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_205 = dynamic_A_symbol_205.evaluate(evaluator, T_Boolean, A_symbol_204, S_isUnique);
				leftA_symbol_203 = A_symbol_205;
			} catch (InvalidValueException e) {
				leftA_symbol_203 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_205 = leftA_symbol_203;
			Value rightA_symbol_203;
			try {
				
				Value A_symbol_206 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_207 = valueFactory.typeOf(A_symbol_206);
				LibraryUnaryOperation dynamic_A_symbol_207 = (LibraryUnaryOperation)static_A_symbol_207.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_207 = dynamic_A_symbol_207.evaluate(evaluator, T_Integer, A_symbol_206);
				DomainType static_A_symbol_208 = valueFactory.typeOf(A_symbol_207, I_1);
				LibraryBinaryOperation dynamic_A_symbol_208 = (LibraryBinaryOperation)static_A_symbol_208.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_208 = dynamic_A_symbol_208.evaluate(evaluator, T_Boolean, A_symbol_207, I_1);
				rightA_symbol_203 = A_symbol_208;
			} catch (InvalidValueException e) {
				rightA_symbol_203 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_208 = rightA_symbol_203;
			DomainType static_A_symbol_203 = valueFactory.typeOf(A_symbol_205);
			LibraryBinaryOperation dynamic_A_symbol_203 = (LibraryBinaryOperation)static_A_symbol_203.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_203 = dynamic_A_symbol_203.evaluate(evaluator, T_Boolean, A_symbol_205, A_symbol_208);
			return A_symbol_203;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'IsUniqueTypeIsBoolean' invariant.
	 */
	public static class _invariant_IsUniqueTypeIsBoolean extends AbstractUnaryOperation
	{
		public static _invariant_IsUniqueTypeIsBoolean INSTANCE = new _invariant_IsUniqueTypeIsBoolean();
	
		/*
		name = 'isUnique' implies type = Boolean
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_isUnique = valueFactory.stringValueOf("isUnique");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Boolean_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Boolean);
			
			Value leftA_symbol_209;
			try {
				
				Value A_symbol_210 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_211 = valueFactory.typeOf(A_symbol_210, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_211 = (LibraryBinaryOperation)static_A_symbol_211.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_211 = dynamic_A_symbol_211.evaluate(evaluator, T_Boolean, A_symbol_210, S_isUnique);
				leftA_symbol_209 = A_symbol_211;
			} catch (InvalidValueException e) {
				leftA_symbol_209 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_211 = leftA_symbol_209;
			Value rightA_symbol_209;
			try {
				
				Value A_symbol_212 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_213 = valueFactory.typeOf(A_symbol_212, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_213 = (LibraryBinaryOperation)static_A_symbol_213.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_213 = dynamic_A_symbol_213.evaluate(evaluator, T_Boolean, A_symbol_212, T_ClassClassifier_Boolean_);
				rightA_symbol_209 = A_symbol_213;
			} catch (InvalidValueException e) {
				rightA_symbol_209 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_213 = rightA_symbol_209;
			DomainType static_A_symbol_209 = valueFactory.typeOf(A_symbol_211);
			LibraryBinaryOperation dynamic_A_symbol_209 = (LibraryBinaryOperation)static_A_symbol_209.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_209 = dynamic_A_symbol_209.evaluate(evaluator, T_Boolean, A_symbol_211, A_symbol_213);
			return A_symbol_209;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'IteratorTypeIsSourceElementType' invariant.
	 */
	public static class _invariant_IteratorTypeIsSourceElementType extends AbstractUnaryOperation
	{
		public static _invariant_IteratorTypeIsSourceElementType INSTANCE = new _invariant_IteratorTypeIsSourceElementType();
	
		/*
		self.iterator->forAll(type =
	  source.type.oclAsType(CollectionType).elementType)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_forAll = OCLstdlibTables.Operations._Collection__1_forAll;
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Variable_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Variable);
			final ExecutorProperty P_LoopExp_iterator = PivotTables.Properties._LoopExp__iterator;
			final LibraryProperty IP_LoopExp_iterator = P_LoopExp_iterator.getImplementation();
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorProperty P_CollectionType_elementType = PivotTables.Properties._CollectionType__elementType;
			final LibraryProperty IP_CollectionType_elementType = P_CollectionType_elementType.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__CollectionType = PivotTables.Types._CollectionType;
			final ExecutorOperation O_OclAny_oclAsType = OCLstdlibTables.Operations._OclAny__oclAsType;
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_CallExp_source = PivotTables.Properties._CallExp__source;
			final LibraryProperty IP_CallExp_source = P_CallExp_source.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__CollectionType_ = valueFactory.createTypeValue(PivotTables.Types._CollectionType);
			
			
			Value A_symbol_214 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_215 = new AbstractBinaryOperation()
			{
			/*
			type =
			source.type.oclAsType(_'file:/C:/Development/OCL3.2.0Aux/GIT/org.eclipse.ocl/examples/org.eclipse.ocl.examples.pivot/model/Pivot.ecore'::ocl::CollectionType).elementType
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_216 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_1_, P_TypedElement_type);
					
					
					Value A_symbol_217 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
					
					Value A_symbol_218 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_217, P_TypedElement_type);
					
					DomainType static_A_symbol_219 = valueFactory.typeOf(A_symbol_218);
					LibraryBinaryOperation dynamic_A_symbol_219 = (LibraryBinaryOperation)static_A_symbol_219.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_219 = dynamic_A_symbol_219.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_218, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_220 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_219, P_CollectionType_elementType);
					
					DomainType static_A_symbol_221 = valueFactory.typeOf(A_symbol_216, A_symbol_220);
					LibraryBinaryOperation dynamic_A_symbol_221 = (LibraryBinaryOperation)static_A_symbol_221.lookupImplementation(standardLibrary, O_OclAny__eq_);
					Value A_symbol_221 = dynamic_A_symbol_221.evaluate(evaluator, T_Boolean, A_symbol_216, A_symbol_220);
					return A_symbol_221;
				}
			};
			DomainType static_A_symbol_215 = A_symbol_214.getType();
			LibraryIteration dynamic_A_symbol_215 = (LibraryIteration)static_A_symbol_215.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_215 = dynamic_A_symbol_215.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_215 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_215, (CollectionValue)A_symbol_214, acc_A_symbol_215);
			Value A_symbol_215 = dynamic_A_symbol_215.evaluateIteration(manager_A_symbol_215);
			return A_symbol_215;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'OneBodyTypeIsBoolean' invariant.
	 */
	public static class _invariant_OneBodyTypeIsBoolean extends AbstractUnaryOperation
	{
		public static _invariant_OneBodyTypeIsBoolean INSTANCE = new _invariant_OneBodyTypeIsBoolean();
	
		/*
		name = 'one' implies body.type = Boolean
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_one = valueFactory.stringValueOf("one");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_LoopExp_body = PivotTables.Properties._LoopExp__body;
			final LibraryProperty IP_LoopExp_body = P_LoopExp_body.getImplementation();
			final Value T_ClassClassifier_Boolean_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Boolean);
			
			Value leftA_symbol_222;
			try {
				
				Value A_symbol_223 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_224 = valueFactory.typeOf(A_symbol_223, S_one);
				LibraryBinaryOperation dynamic_A_symbol_224 = (LibraryBinaryOperation)static_A_symbol_224.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_224 = dynamic_A_symbol_224.evaluate(evaluator, T_Boolean, A_symbol_223, S_one);
				leftA_symbol_222 = A_symbol_224;
			} catch (InvalidValueException e) {
				leftA_symbol_222 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_224 = leftA_symbol_222;
			Value rightA_symbol_222;
			try {
				
				Value A_symbol_225 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_226 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_225, P_TypedElement_type);
				
				DomainType static_A_symbol_227 = valueFactory.typeOf(A_symbol_226, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_227 = (LibraryBinaryOperation)static_A_symbol_227.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_227 = dynamic_A_symbol_227.evaluate(evaluator, T_Boolean, A_symbol_226, T_ClassClassifier_Boolean_);
				rightA_symbol_222 = A_symbol_227;
			} catch (InvalidValueException e) {
				rightA_symbol_222 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_227 = rightA_symbol_222;
			DomainType static_A_symbol_222 = valueFactory.typeOf(A_symbol_224);
			LibraryBinaryOperation dynamic_A_symbol_222 = (LibraryBinaryOperation)static_A_symbol_222.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_222 = dynamic_A_symbol_222.evaluate(evaluator, T_Boolean, A_symbol_224, A_symbol_227);
			return A_symbol_222;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'OneHasOneIterator' invariant.
	 */
	public static class _invariant_OneHasOneIterator extends AbstractUnaryOperation
	{
		public static _invariant_OneHasOneIterator INSTANCE = new _invariant_OneHasOneIterator();
	
		/*
		name = 'one' implies iterator->size() = 1
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_one = valueFactory.stringValueOf("one");
			final ExecutorOperation O_Real__eq_ = OCLstdlibTables.Operations._Real___eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Variable_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Variable);
			final ExecutorProperty P_LoopExp_iterator = PivotTables.Properties._LoopExp__iterator;
			final LibraryProperty IP_LoopExp_iterator = P_LoopExp_iterator.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
			Value leftA_symbol_228;
			try {
				
				Value A_symbol_229 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_230 = valueFactory.typeOf(A_symbol_229, S_one);
				LibraryBinaryOperation dynamic_A_symbol_230 = (LibraryBinaryOperation)static_A_symbol_230.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_230 = dynamic_A_symbol_230.evaluate(evaluator, T_Boolean, A_symbol_229, S_one);
				leftA_symbol_228 = A_symbol_230;
			} catch (InvalidValueException e) {
				leftA_symbol_228 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_230 = leftA_symbol_228;
			Value rightA_symbol_228;
			try {
				
				Value A_symbol_231 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_232 = valueFactory.typeOf(A_symbol_231);
				LibraryUnaryOperation dynamic_A_symbol_232 = (LibraryUnaryOperation)static_A_symbol_232.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_232 = dynamic_A_symbol_232.evaluate(evaluator, T_Integer, A_symbol_231);
				DomainType static_A_symbol_233 = valueFactory.typeOf(A_symbol_232, I_1);
				LibraryBinaryOperation dynamic_A_symbol_233 = (LibraryBinaryOperation)static_A_symbol_233.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_233 = dynamic_A_symbol_233.evaluate(evaluator, T_Boolean, A_symbol_232, I_1);
				rightA_symbol_228 = A_symbol_233;
			} catch (InvalidValueException e) {
				rightA_symbol_228 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_233 = rightA_symbol_228;
			DomainType static_A_symbol_228 = valueFactory.typeOf(A_symbol_230);
			LibraryBinaryOperation dynamic_A_symbol_228 = (LibraryBinaryOperation)static_A_symbol_228.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_228 = dynamic_A_symbol_228.evaluate(evaluator, T_Boolean, A_symbol_230, A_symbol_233);
			return A_symbol_228;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'OneTypeIsBoolean' invariant.
	 */
	public static class _invariant_OneTypeIsBoolean extends AbstractUnaryOperation
	{
		public static _invariant_OneTypeIsBoolean INSTANCE = new _invariant_OneTypeIsBoolean();
	
		/*
		name = 'one' implies type = Boolean
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_one = valueFactory.stringValueOf("one");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Boolean_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Boolean);
			
			Value leftA_symbol_234;
			try {
				
				Value A_symbol_235 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_236 = valueFactory.typeOf(A_symbol_235, S_one);
				LibraryBinaryOperation dynamic_A_symbol_236 = (LibraryBinaryOperation)static_A_symbol_236.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_236 = dynamic_A_symbol_236.evaluate(evaluator, T_Boolean, A_symbol_235, S_one);
				leftA_symbol_234 = A_symbol_236;
			} catch (InvalidValueException e) {
				leftA_symbol_234 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_236 = leftA_symbol_234;
			Value rightA_symbol_234;
			try {
				
				Value A_symbol_237 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_238 = valueFactory.typeOf(A_symbol_237, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_238 = (LibraryBinaryOperation)static_A_symbol_238.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_238 = dynamic_A_symbol_238.evaluate(evaluator, T_Boolean, A_symbol_237, T_ClassClassifier_Boolean_);
				rightA_symbol_234 = A_symbol_238;
			} catch (InvalidValueException e) {
				rightA_symbol_234 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_238 = rightA_symbol_234;
			DomainType static_A_symbol_234 = valueFactory.typeOf(A_symbol_236);
			LibraryBinaryOperation dynamic_A_symbol_234 = (LibraryBinaryOperation)static_A_symbol_234.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_234 = dynamic_A_symbol_234.evaluate(evaluator, T_Boolean, A_symbol_236, A_symbol_238);
			return A_symbol_234;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'RejectOrSelectHasOneIterator' invariant.
	 */
	public static class _invariant_RejectOrSelectHasOneIterator extends AbstractUnaryOperation
	{
		public static _invariant_RejectOrSelectHasOneIterator INSTANCE = new _invariant_RejectOrSelectHasOneIterator();
	
		/*
		name = 'reject' or name = 'select' implies iterator->size() = 1
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_Boolean_or = OCLstdlibTables.Operations._Boolean__or;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_reject = valueFactory.stringValueOf("reject");
			final StringValue S_select = valueFactory.stringValueOf("select");
			final ExecutorOperation O_Real__eq_ = OCLstdlibTables.Operations._Real___eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Variable_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Variable);
			final ExecutorProperty P_LoopExp_iterator = PivotTables.Properties._LoopExp__iterator;
			final LibraryProperty IP_LoopExp_iterator = P_LoopExp_iterator.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
			Value leftA_symbol_239;
			try {
				Value leftA_symbol_240;
				try {
					
					Value A_symbol_241 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_242 = valueFactory.typeOf(A_symbol_241, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_242 = (LibraryBinaryOperation)static_A_symbol_242.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_242 = dynamic_A_symbol_242.evaluate(evaluator, T_Boolean, A_symbol_241, S_reject);
					leftA_symbol_240 = A_symbol_242;
				} catch (InvalidValueException e) {
					leftA_symbol_240 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_242 = leftA_symbol_240;
				Value rightA_symbol_240;
				try {
					
					Value A_symbol_243 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_244 = valueFactory.typeOf(A_symbol_243, S_select);
					LibraryBinaryOperation dynamic_A_symbol_244 = (LibraryBinaryOperation)static_A_symbol_244.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_244 = dynamic_A_symbol_244.evaluate(evaluator, T_Boolean, A_symbol_243, S_select);
					rightA_symbol_240 = A_symbol_244;
				} catch (InvalidValueException e) {
					rightA_symbol_240 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_244 = rightA_symbol_240;
				DomainType static_A_symbol_240 = valueFactory.typeOf(A_symbol_242);
				LibraryBinaryOperation dynamic_A_symbol_240 = (LibraryBinaryOperation)static_A_symbol_240.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_240 = dynamic_A_symbol_240.evaluate(evaluator, T_Boolean, A_symbol_242, A_symbol_244);
				leftA_symbol_239 = A_symbol_240;
			} catch (InvalidValueException e) {
				leftA_symbol_239 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_240 = leftA_symbol_239;
			Value rightA_symbol_239;
			try {
				
				Value A_symbol_245 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_246 = valueFactory.typeOf(A_symbol_245);
				LibraryUnaryOperation dynamic_A_symbol_246 = (LibraryUnaryOperation)static_A_symbol_246.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_246 = dynamic_A_symbol_246.evaluate(evaluator, T_Integer, A_symbol_245);
				DomainType static_A_symbol_247 = valueFactory.typeOf(A_symbol_246, I_1);
				LibraryBinaryOperation dynamic_A_symbol_247 = (LibraryBinaryOperation)static_A_symbol_247.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_247 = dynamic_A_symbol_247.evaluate(evaluator, T_Boolean, A_symbol_246, I_1);
				rightA_symbol_239 = A_symbol_247;
			} catch (InvalidValueException e) {
				rightA_symbol_239 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_247 = rightA_symbol_239;
			DomainType static_A_symbol_239 = valueFactory.typeOf(A_symbol_240);
			LibraryBinaryOperation dynamic_A_symbol_239 = (LibraryBinaryOperation)static_A_symbol_239.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_239 = dynamic_A_symbol_239.evaluate(evaluator, T_Boolean, A_symbol_240, A_symbol_247);
			return A_symbol_239;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'RejectOrSelectTypeIsBoolean' invariant.
	 */
	public static class _invariant_RejectOrSelectTypeIsBoolean extends AbstractUnaryOperation
	{
		public static _invariant_RejectOrSelectTypeIsBoolean INSTANCE = new _invariant_RejectOrSelectTypeIsBoolean();
	
		/*
		name = 'reject' or name = 'select' implies type = Boolean
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_Boolean_or = OCLstdlibTables.Operations._Boolean__or;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_reject = valueFactory.stringValueOf("reject");
			final StringValue S_select = valueFactory.stringValueOf("select");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Boolean_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Boolean);
			
			Value leftA_symbol_248;
			try {
				Value leftA_symbol_249;
				try {
					
					Value A_symbol_250 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_251 = valueFactory.typeOf(A_symbol_250, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_251 = (LibraryBinaryOperation)static_A_symbol_251.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_251 = dynamic_A_symbol_251.evaluate(evaluator, T_Boolean, A_symbol_250, S_reject);
					leftA_symbol_249 = A_symbol_251;
				} catch (InvalidValueException e) {
					leftA_symbol_249 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_251 = leftA_symbol_249;
				Value rightA_symbol_249;
				try {
					
					Value A_symbol_252 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_253 = valueFactory.typeOf(A_symbol_252, S_select);
					LibraryBinaryOperation dynamic_A_symbol_253 = (LibraryBinaryOperation)static_A_symbol_253.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_253 = dynamic_A_symbol_253.evaluate(evaluator, T_Boolean, A_symbol_252, S_select);
					rightA_symbol_249 = A_symbol_253;
				} catch (InvalidValueException e) {
					rightA_symbol_249 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_253 = rightA_symbol_249;
				DomainType static_A_symbol_249 = valueFactory.typeOf(A_symbol_251);
				LibraryBinaryOperation dynamic_A_symbol_249 = (LibraryBinaryOperation)static_A_symbol_249.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_249 = dynamic_A_symbol_249.evaluate(evaluator, T_Boolean, A_symbol_251, A_symbol_253);
				leftA_symbol_248 = A_symbol_249;
			} catch (InvalidValueException e) {
				leftA_symbol_248 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_249 = leftA_symbol_248;
			Value rightA_symbol_248;
			try {
				
				Value A_symbol_254 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_255 = valueFactory.typeOf(A_symbol_254, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_255 = (LibraryBinaryOperation)static_A_symbol_255.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_255 = dynamic_A_symbol_255.evaluate(evaluator, T_Boolean, A_symbol_254, T_ClassClassifier_Boolean_);
				rightA_symbol_248 = A_symbol_255;
			} catch (InvalidValueException e) {
				rightA_symbol_248 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_255 = rightA_symbol_248;
			DomainType static_A_symbol_248 = valueFactory.typeOf(A_symbol_249);
			LibraryBinaryOperation dynamic_A_symbol_248 = (LibraryBinaryOperation)static_A_symbol_248.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_248 = dynamic_A_symbol_248.evaluate(evaluator, T_Boolean, A_symbol_249, A_symbol_255);
			return A_symbol_248;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'RejectOrSelectTypeIsSourceType' invariant.
	 */
	public static class _invariant_RejectOrSelectTypeIsSourceType extends AbstractUnaryOperation
	{
		public static _invariant_RejectOrSelectTypeIsSourceType INSTANCE = new _invariant_RejectOrSelectTypeIsSourceType();
	
		/*
		name = 'reject' or name = 'select' implies type = source.type
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_Boolean_or = OCLstdlibTables.Operations._Boolean__or;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_reject = valueFactory.stringValueOf("reject");
			final StringValue S_select = valueFactory.stringValueOf("select");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_CallExp_source = PivotTables.Properties._CallExp__source;
			final LibraryProperty IP_CallExp_source = P_CallExp_source.getImplementation();
			
			Value leftA_symbol_256;
			try {
				Value leftA_symbol_257;
				try {
					
					Value A_symbol_258 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_259 = valueFactory.typeOf(A_symbol_258, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_259 = (LibraryBinaryOperation)static_A_symbol_259.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_259 = dynamic_A_symbol_259.evaluate(evaluator, T_Boolean, A_symbol_258, S_reject);
					leftA_symbol_257 = A_symbol_259;
				} catch (InvalidValueException e) {
					leftA_symbol_257 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_259 = leftA_symbol_257;
				Value rightA_symbol_257;
				try {
					
					Value A_symbol_260 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_261 = valueFactory.typeOf(A_symbol_260, S_select);
					LibraryBinaryOperation dynamic_A_symbol_261 = (LibraryBinaryOperation)static_A_symbol_261.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_261 = dynamic_A_symbol_261.evaluate(evaluator, T_Boolean, A_symbol_260, S_select);
					rightA_symbol_257 = A_symbol_261;
				} catch (InvalidValueException e) {
					rightA_symbol_257 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_261 = rightA_symbol_257;
				DomainType static_A_symbol_257 = valueFactory.typeOf(A_symbol_259);
				LibraryBinaryOperation dynamic_A_symbol_257 = (LibraryBinaryOperation)static_A_symbol_257.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_257 = dynamic_A_symbol_257.evaluate(evaluator, T_Boolean, A_symbol_259, A_symbol_261);
				leftA_symbol_256 = A_symbol_257;
			} catch (InvalidValueException e) {
				leftA_symbol_256 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_257 = leftA_symbol_256;
			Value rightA_symbol_256;
			try {
				
				Value A_symbol_262 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_263 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_264 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_263, P_TypedElement_type);
				
				DomainType static_A_symbol_265 = valueFactory.typeOf(A_symbol_262, A_symbol_264);
				LibraryBinaryOperation dynamic_A_symbol_265 = (LibraryBinaryOperation)static_A_symbol_265.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_265 = dynamic_A_symbol_265.evaluate(evaluator, T_Boolean, A_symbol_262, A_symbol_264);
				rightA_symbol_256 = A_symbol_265;
			} catch (InvalidValueException e) {
				rightA_symbol_256 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_265 = rightA_symbol_256;
			DomainType static_A_symbol_256 = valueFactory.typeOf(A_symbol_257);
			LibraryBinaryOperation dynamic_A_symbol_256 = (LibraryBinaryOperation)static_A_symbol_256.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_256 = dynamic_A_symbol_256.evaluate(evaluator, T_Boolean, A_symbol_257, A_symbol_265);
			return A_symbol_256;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'SortedByElementTypeIsSourceElementType' invariant.
	 */
	public static class _invariant_SortedByElementTypeIsSourceElementType extends AbstractUnaryOperation
	{
		public static _invariant_SortedByElementTypeIsSourceElementType INSTANCE = new _invariant_SortedByElementTypeIsSourceElementType();
	
		/*
		name = 'sortedBy' implies
	type.oclAsType(CollectionType).elementType =
	body.type.oclAsType(CollectionType).elementType
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_sortedBy = valueFactory.stringValueOf("sortedBy");
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_CollectionType_elementType = PivotTables.Properties._CollectionType__elementType;
			final LibraryProperty IP_CollectionType_elementType = P_CollectionType_elementType.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__CollectionType = PivotTables.Types._CollectionType;
			final ExecutorOperation O_OclAny_oclAsType = OCLstdlibTables.Operations._OclAny__oclAsType;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__CollectionType_ = valueFactory.createTypeValue(PivotTables.Types._CollectionType);
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_LoopExp_body = PivotTables.Properties._LoopExp__body;
			final LibraryProperty IP_LoopExp_body = P_LoopExp_body.getImplementation();
			
			Value leftA_symbol_266;
			try {
				
				Value A_symbol_267 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_268 = valueFactory.typeOf(A_symbol_267, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_268 = (LibraryBinaryOperation)static_A_symbol_268.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_268 = dynamic_A_symbol_268.evaluate(evaluator, T_Boolean, A_symbol_267, S_sortedBy);
				leftA_symbol_266 = A_symbol_268;
			} catch (InvalidValueException e) {
				leftA_symbol_266 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_268 = leftA_symbol_266;
			Value rightA_symbol_266;
			try {
				
				Value A_symbol_269 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_270 = valueFactory.typeOf(A_symbol_269);
				LibraryBinaryOperation dynamic_A_symbol_270 = (LibraryBinaryOperation)static_A_symbol_270.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_270 = dynamic_A_symbol_270.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_269, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_271 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_270, P_CollectionType_elementType);
				
				
				Value A_symbol_272 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_273 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_272, P_TypedElement_type);
				
				DomainType static_A_symbol_274 = valueFactory.typeOf(A_symbol_273);
				LibraryBinaryOperation dynamic_A_symbol_274 = (LibraryBinaryOperation)static_A_symbol_274.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_274 = dynamic_A_symbol_274.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_273, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_275 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_274, P_CollectionType_elementType);
				
				DomainType static_A_symbol_276 = valueFactory.typeOf(A_symbol_271, A_symbol_275);
				LibraryBinaryOperation dynamic_A_symbol_276 = (LibraryBinaryOperation)static_A_symbol_276.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_276 = dynamic_A_symbol_276.evaluate(evaluator, T_Boolean, A_symbol_271, A_symbol_275);
				rightA_symbol_266 = A_symbol_276;
			} catch (InvalidValueException e) {
				rightA_symbol_266 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_276 = rightA_symbol_266;
			DomainType static_A_symbol_266 = valueFactory.typeOf(A_symbol_268);
			LibraryBinaryOperation dynamic_A_symbol_266 = (LibraryBinaryOperation)static_A_symbol_266.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_266 = dynamic_A_symbol_266.evaluate(evaluator, T_Boolean, A_symbol_268, A_symbol_276);
			return A_symbol_266;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'SortedByHasOneIterator' invariant.
	 */
	public static class _invariant_SortedByHasOneIterator extends AbstractUnaryOperation
	{
		public static _invariant_SortedByHasOneIterator INSTANCE = new _invariant_SortedByHasOneIterator();
	
		/*
		name = 'sortedBy' implies iterator->size() = 1
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_sortedBy = valueFactory.stringValueOf("sortedBy");
			final ExecutorOperation O_Real__eq_ = OCLstdlibTables.Operations._Real___eq_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_Pivot_ecore__pivot__Variable = PivotTables.Types._Variable;
			final DomainCollectionType T_OrderedSet_Pivot_ecore__pivot__Variable_ = standardLibrary.getOrderedSetType(T_Pivot_ecore__pivot__Variable);
			final ExecutorProperty P_LoopExp_iterator = PivotTables.Properties._LoopExp__iterator;
			final LibraryProperty IP_LoopExp_iterator = P_LoopExp_iterator.getImplementation();
			final IntegerValue I_1 = valueFactory.integerValueOf(1);
			
			Value leftA_symbol_277;
			try {
				
				Value A_symbol_278 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_279 = valueFactory.typeOf(A_symbol_278, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_279 = (LibraryBinaryOperation)static_A_symbol_279.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_279 = dynamic_A_symbol_279.evaluate(evaluator, T_Boolean, A_symbol_278, S_sortedBy);
				leftA_symbol_277 = A_symbol_279;
			} catch (InvalidValueException e) {
				leftA_symbol_277 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_279 = leftA_symbol_277;
			Value rightA_symbol_277;
			try {
				
				Value A_symbol_280 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_281 = valueFactory.typeOf(A_symbol_280);
				LibraryUnaryOperation dynamic_A_symbol_281 = (LibraryUnaryOperation)static_A_symbol_281.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_281 = dynamic_A_symbol_281.evaluate(evaluator, T_Integer, A_symbol_280);
				DomainType static_A_symbol_282 = valueFactory.typeOf(A_symbol_281, I_1);
				LibraryBinaryOperation dynamic_A_symbol_282 = (LibraryBinaryOperation)static_A_symbol_282.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_282 = dynamic_A_symbol_282.evaluate(evaluator, T_Boolean, A_symbol_281, I_1);
				rightA_symbol_277 = A_symbol_282;
			} catch (InvalidValueException e) {
				rightA_symbol_277 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_282 = rightA_symbol_277;
			DomainType static_A_symbol_277 = valueFactory.typeOf(A_symbol_279);
			LibraryBinaryOperation dynamic_A_symbol_277 = (LibraryBinaryOperation)static_A_symbol_277.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_277 = dynamic_A_symbol_277.evaluate(evaluator, T_Boolean, A_symbol_279, A_symbol_282);
			return A_symbol_277;
		}
	}

	/** 
	 * Implementation of the IteratorExp 'SortedByIsOrderedIfSourceIsOrdered' invariant.
	 */
	public static class _invariant_SortedByIsOrderedIfSourceIsOrdered extends AbstractUnaryOperation
	{
		public static _invariant_SortedByIsOrderedIfSourceIsOrdered INSTANCE = new _invariant_SortedByIsOrderedIfSourceIsOrdered();
	
		/*
		name = 'sortedBy' implies
	if
	  source.type.oclIsKindOf(SequenceType) or
	  source.type.oclIsKindOf(BagType)
	then type.oclIsKindOf(SequenceType)
	else type.oclIsKindOf(OrderedSetType)
	endif
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_String__eq_ = OCLstdlibTables.Operations._String___eq_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final LibraryProperty IP_NamedElement_name = P_NamedElement_name.getImplementation();
			final StringValue S_sortedBy = valueFactory.stringValueOf("sortedBy");
			final ExecutorOperation O_Boolean_or = OCLstdlibTables.Operations._Boolean__or;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__OclExpression = PivotTables.Types._OclExpression;
			final ExecutorProperty P_CallExp_source = PivotTables.Properties._CallExp__source;
			final LibraryProperty IP_CallExp_source = P_CallExp_source.getImplementation();
			final Value T_ClassClassifier_Pivot_ecore__pivot__SequenceType_ = valueFactory.createTypeValue(PivotTables.Types._SequenceType);
			final Value T_ClassClassifier_Pivot_ecore__pivot__BagType_ = valueFactory.createTypeValue(PivotTables.Types._BagType);
			final Value T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_ = valueFactory.createTypeValue(PivotTables.Types._OrderedSetType);
			
			Value leftA_symbol_283;
			try {
				
				Value A_symbol_284 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_285 = valueFactory.typeOf(A_symbol_284, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_285 = (LibraryBinaryOperation)static_A_symbol_285.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_285 = dynamic_A_symbol_285.evaluate(evaluator, T_Boolean, A_symbol_284, S_sortedBy);
				leftA_symbol_283 = A_symbol_285;
			} catch (InvalidValueException e) {
				leftA_symbol_283 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_285 = leftA_symbol_283;
			Value rightA_symbol_283;
			try {
					Value leftA_symbol_286;
					try {
						
						Value A_symbol_287 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_288 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_287, P_TypedElement_type);
						
						DomainType static_A_symbol_289 = valueFactory.typeOf(A_symbol_288);
						LibraryBinaryOperation dynamic_A_symbol_289 = (LibraryBinaryOperation)static_A_symbol_289.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_289 = dynamic_A_symbol_289.evaluate(evaluator, T_Boolean, A_symbol_288, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_286 = A_symbol_289;
					} catch (InvalidValueException e) {
						leftA_symbol_286 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_289 = leftA_symbol_286;
					Value rightA_symbol_286;
					try {
						
						Value A_symbol_290 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_291 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_290, P_TypedElement_type);
						
						DomainType static_A_symbol_292 = valueFactory.typeOf(A_symbol_291);
						LibraryBinaryOperation dynamic_A_symbol_292 = (LibraryBinaryOperation)static_A_symbol_292.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_292 = dynamic_A_symbol_292.evaluate(evaluator, T_Boolean, A_symbol_291, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
						rightA_symbol_286 = A_symbol_292;
					} catch (InvalidValueException e) {
						rightA_symbol_286 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_292 = rightA_symbol_286;
					DomainType static_A_symbol_286 = valueFactory.typeOf(A_symbol_289);
					LibraryBinaryOperation dynamic_A_symbol_286 = (LibraryBinaryOperation)static_A_symbol_286.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_286 = dynamic_A_symbol_286.evaluate(evaluator, T_Boolean, A_symbol_289, A_symbol_292);
				Value A_symbol_293;
				if (A_symbol_286.isTrue()) {
					
					Value A_symbol_294 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_295 = valueFactory.typeOf(A_symbol_294);
					LibraryBinaryOperation dynamic_A_symbol_295 = (LibraryBinaryOperation)static_A_symbol_295.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_295 = dynamic_A_symbol_295.evaluate(evaluator, T_Boolean, A_symbol_294, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_293 = A_symbol_295;
				}
				else if (A_symbol_286.isFalse()) {
					
					Value A_symbol_296 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_297 = valueFactory.typeOf(A_symbol_296);
					LibraryBinaryOperation dynamic_A_symbol_297 = (LibraryBinaryOperation)static_A_symbol_297.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_297 = dynamic_A_symbol_297.evaluate(evaluator, T_Boolean, A_symbol_296, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_293 = A_symbol_297;
				}
				else if (A_symbol_286.isNull()) {
					A_symbol_293 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_293 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_283 = A_symbol_293;
			} catch (InvalidValueException e) {
				rightA_symbol_283 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_293 = rightA_symbol_283;
			DomainType static_A_symbol_283 = valueFactory.typeOf(A_symbol_285);
			LibraryBinaryOperation dynamic_A_symbol_283 = (LibraryBinaryOperation)static_A_symbol_283.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_283 = dynamic_A_symbol_283.evaluate(evaluator, T_Boolean, A_symbol_285, A_symbol_293);
			return A_symbol_283;
		}
	}
}

