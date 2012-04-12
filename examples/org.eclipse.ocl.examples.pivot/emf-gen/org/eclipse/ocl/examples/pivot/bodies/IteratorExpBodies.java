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
			
			Value leftA_symbol_84;
			try {
				
				Value A_symbol_85 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_86 = valueFactory.typeOf(A_symbol_85, S_any);
				LibraryBinaryOperation dynamic_A_symbol_86 = (LibraryBinaryOperation)static_A_symbol_86.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_86 = dynamic_A_symbol_86.evaluate(evaluator, T_Boolean, A_symbol_85, S_any);
				leftA_symbol_84 = A_symbol_86;
			} catch (InvalidValueException e) {
				leftA_symbol_84 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_86 = leftA_symbol_84;
			Value rightA_symbol_84;
			try {
				
				Value A_symbol_87 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_88 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_87, P_TypedElement_type);
				
				DomainType static_A_symbol_89 = valueFactory.typeOf(A_symbol_88, S_Boolean);
				LibraryBinaryOperation dynamic_A_symbol_89 = (LibraryBinaryOperation)static_A_symbol_89.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_89 = dynamic_A_symbol_89.evaluate(evaluator, T_Boolean, A_symbol_88, S_Boolean);
				rightA_symbol_84 = A_symbol_89;
			} catch (InvalidValueException e) {
				rightA_symbol_84 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_89 = rightA_symbol_84;
			DomainType static_A_symbol_84 = valueFactory.typeOf(A_symbol_86);
			LibraryBinaryOperation dynamic_A_symbol_84 = (LibraryBinaryOperation)static_A_symbol_84.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_84 = dynamic_A_symbol_84.evaluate(evaluator, T_Boolean, A_symbol_86, A_symbol_89);
			return A_symbol_84;
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
			
			Value leftA_symbol_90;
			try {
				
				Value A_symbol_91 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_92 = valueFactory.typeOf(A_symbol_91, S_any);
				LibraryBinaryOperation dynamic_A_symbol_92 = (LibraryBinaryOperation)static_A_symbol_92.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_92 = dynamic_A_symbol_92.evaluate(evaluator, T_Boolean, A_symbol_91, S_any);
				leftA_symbol_90 = A_symbol_92;
			} catch (InvalidValueException e) {
				leftA_symbol_90 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_92 = leftA_symbol_90;
			Value rightA_symbol_90;
			try {
				
				Value A_symbol_93 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_94 = valueFactory.typeOf(A_symbol_93);
				LibraryUnaryOperation dynamic_A_symbol_94 = (LibraryUnaryOperation)static_A_symbol_94.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_94 = dynamic_A_symbol_94.evaluate(evaluator, T_Integer, A_symbol_93);
				DomainType static_A_symbol_95 = valueFactory.typeOf(A_symbol_94, I_1);
				LibraryBinaryOperation dynamic_A_symbol_95 = (LibraryBinaryOperation)static_A_symbol_95.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_95 = dynamic_A_symbol_95.evaluate(evaluator, T_Boolean, A_symbol_94, I_1);
				rightA_symbol_90 = A_symbol_95;
			} catch (InvalidValueException e) {
				rightA_symbol_90 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_95 = rightA_symbol_90;
			DomainType static_A_symbol_90 = valueFactory.typeOf(A_symbol_92);
			LibraryBinaryOperation dynamic_A_symbol_90 = (LibraryBinaryOperation)static_A_symbol_90.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_90 = dynamic_A_symbol_90.evaluate(evaluator, T_Boolean, A_symbol_92, A_symbol_95);
			return A_symbol_90;
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
			
			Value leftA_symbol_96;
			try {
				
				Value A_symbol_97 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_98 = valueFactory.typeOf(A_symbol_97, S_any);
				LibraryBinaryOperation dynamic_A_symbol_98 = (LibraryBinaryOperation)static_A_symbol_98.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_98 = dynamic_A_symbol_98.evaluate(evaluator, T_Boolean, A_symbol_97, S_any);
				leftA_symbol_96 = A_symbol_98;
			} catch (InvalidValueException e) {
				leftA_symbol_96 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_98 = leftA_symbol_96;
			Value rightA_symbol_96;
			try {
				
				Value A_symbol_99 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_100 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_101 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_100, P_TypedElement_type);
				
				DomainType static_A_symbol_102 = valueFactory.typeOf(A_symbol_101);
				LibraryBinaryOperation dynamic_A_symbol_102 = (LibraryBinaryOperation)static_A_symbol_102.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_102 = dynamic_A_symbol_102.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_101, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_103 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_102, P_CollectionType_elementType);
				
				DomainType static_A_symbol_104 = valueFactory.typeOf(A_symbol_99, A_symbol_103);
				LibraryBinaryOperation dynamic_A_symbol_104 = (LibraryBinaryOperation)static_A_symbol_104.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_104 = dynamic_A_symbol_104.evaluate(evaluator, T_Boolean, A_symbol_99, A_symbol_103);
				rightA_symbol_96 = A_symbol_104;
			} catch (InvalidValueException e) {
				rightA_symbol_96 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_104 = rightA_symbol_96;
			DomainType static_A_symbol_96 = valueFactory.typeOf(A_symbol_98);
			LibraryBinaryOperation dynamic_A_symbol_96 = (LibraryBinaryOperation)static_A_symbol_96.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_96 = dynamic_A_symbol_96.evaluate(evaluator, T_Boolean, A_symbol_98, A_symbol_104);
			return A_symbol_96;
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
			
			Value leftA_symbol_105;
			try {
				
				Value A_symbol_106 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_107 = valueFactory.typeOf(A_symbol_106, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_107 = (LibraryBinaryOperation)static_A_symbol_107.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_107 = dynamic_A_symbol_107.evaluate(evaluator, T_Boolean, A_symbol_106, S_closure);
				leftA_symbol_105 = A_symbol_107;
			} catch (InvalidValueException e) {
				leftA_symbol_105 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_107 = leftA_symbol_105;
			Value rightA_symbol_105;
			try {
				
				Value A_symbol_108 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_109 = valueFactory.typeOf(A_symbol_108);
				LibraryBinaryOperation dynamic_A_symbol_109 = (LibraryBinaryOperation)static_A_symbol_109.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_109 = dynamic_A_symbol_109.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_108, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_110 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_109, P_CollectionType_elementType);
				
				
				Value A_symbol_111 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_112 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_111, P_TypedElement_type);
				
				DomainType static_A_symbol_113 = valueFactory.typeOf(A_symbol_112);
				LibraryBinaryOperation dynamic_A_symbol_113 = (LibraryBinaryOperation)static_A_symbol_113.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_113 = dynamic_A_symbol_113.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_112, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_114 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_113, P_CollectionType_elementType);
				
				DomainType static_A_symbol_115 = valueFactory.typeOf(A_symbol_110, A_symbol_114);
				LibraryBinaryOperation dynamic_A_symbol_115 = (LibraryBinaryOperation)static_A_symbol_115.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_115 = dynamic_A_symbol_115.evaluate(evaluator, T_Boolean, A_symbol_110, A_symbol_114);
				rightA_symbol_105 = A_symbol_115;
			} catch (InvalidValueException e) {
				rightA_symbol_105 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_115 = rightA_symbol_105;
			DomainType static_A_symbol_105 = valueFactory.typeOf(A_symbol_107);
			LibraryBinaryOperation dynamic_A_symbol_105 = (LibraryBinaryOperation)static_A_symbol_105.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_105 = dynamic_A_symbol_105.evaluate(evaluator, T_Boolean, A_symbol_107, A_symbol_115);
			return A_symbol_105;
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
				
				Value A_symbol_119 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_120 = valueFactory.typeOf(A_symbol_119);
				LibraryUnaryOperation dynamic_A_symbol_120 = (LibraryUnaryOperation)static_A_symbol_120.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_120 = dynamic_A_symbol_120.evaluate(evaluator, T_Integer, A_symbol_119);
				DomainType static_A_symbol_121 = valueFactory.typeOf(A_symbol_120, I_1);
				LibraryBinaryOperation dynamic_A_symbol_121 = (LibraryBinaryOperation)static_A_symbol_121.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_121 = dynamic_A_symbol_121.evaluate(evaluator, T_Boolean, A_symbol_120, I_1);
				rightA_symbol_116 = A_symbol_121;
			} catch (InvalidValueException e) {
				rightA_symbol_116 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_121 = rightA_symbol_116;
			DomainType static_A_symbol_116 = valueFactory.typeOf(A_symbol_118);
			LibraryBinaryOperation dynamic_A_symbol_116 = (LibraryBinaryOperation)static_A_symbol_116.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_116 = dynamic_A_symbol_116.evaluate(evaluator, T_Boolean, A_symbol_118, A_symbol_121);
			return A_symbol_116;
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
			
			Value leftA_symbol_122;
			try {
				
				Value A_symbol_123 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_124 = valueFactory.typeOf(A_symbol_123, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_124 = (LibraryBinaryOperation)static_A_symbol_124.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_124 = dynamic_A_symbol_124.evaluate(evaluator, T_Boolean, A_symbol_123, S_closure);
				leftA_symbol_122 = A_symbol_124;
			} catch (InvalidValueException e) {
				leftA_symbol_122 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_124 = leftA_symbol_122;
			Value rightA_symbol_122;
			try {
				
				Value A_symbol_125 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_126 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_125, P_TypedElement_type);
				
				DomainType static_A_symbol_127 = valueFactory.typeOf(A_symbol_126);
				LibraryBinaryOperation dynamic_A_symbol_127 = (LibraryBinaryOperation)static_A_symbol_127.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_127 = dynamic_A_symbol_127.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_126, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_128 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_127, P_CollectionType_elementType);
				
					
					Value A_symbol_129 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_130 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_129, P_TypedElement_type);
					
					DomainType static_A_symbol_131 = valueFactory.typeOf(A_symbol_130);
					LibraryBinaryOperation dynamic_A_symbol_131 = (LibraryBinaryOperation)static_A_symbol_131.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_131 = dynamic_A_symbol_131.evaluate(evaluator, T_Boolean, A_symbol_130, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_132;
				if (A_symbol_131.isTrue()) {
					
					Value A_symbol_133 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_134 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_133, P_TypedElement_type);
					
					DomainType static_A_symbol_135 = valueFactory.typeOf(A_symbol_134);
					LibraryBinaryOperation dynamic_A_symbol_135 = (LibraryBinaryOperation)static_A_symbol_135.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_135 = dynamic_A_symbol_135.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_134, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_136 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_135, P_CollectionType_elementType);
					
					A_symbol_132 = A_symbol_136;
				}
				else if (A_symbol_131.isFalse()) {
					
					Value A_symbol_137 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_138 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_137, P_TypedElement_type);
					
					A_symbol_132 = A_symbol_138;
				}
				else if (A_symbol_131.isNull()) {
					A_symbol_132 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_132 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				DomainType static_A_symbol_139 = valueFactory.typeOf(A_symbol_128, A_symbol_132);
				LibraryBinaryOperation dynamic_A_symbol_139 = (LibraryBinaryOperation)static_A_symbol_139.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_139 = dynamic_A_symbol_139.evaluate(evaluator, T_Boolean, A_symbol_128, A_symbol_132);
				rightA_symbol_122 = A_symbol_139;
			} catch (InvalidValueException e) {
				rightA_symbol_122 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_139 = rightA_symbol_122;
			DomainType static_A_symbol_122 = valueFactory.typeOf(A_symbol_124);
			LibraryBinaryOperation dynamic_A_symbol_122 = (LibraryBinaryOperation)static_A_symbol_122.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_122 = dynamic_A_symbol_122.evaluate(evaluator, T_Boolean, A_symbol_124, A_symbol_139);
			return A_symbol_122;
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
			
			Value leftA_symbol_140;
			try {
				
				Value A_symbol_141 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_142 = valueFactory.typeOf(A_symbol_141, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_142 = (LibraryBinaryOperation)static_A_symbol_142.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_142 = dynamic_A_symbol_142.evaluate(evaluator, T_Boolean, A_symbol_141, S_closure);
				leftA_symbol_140 = A_symbol_142;
			} catch (InvalidValueException e) {
				leftA_symbol_140 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_142 = leftA_symbol_140;
			Value rightA_symbol_140;
			try {
					Value leftA_symbol_143;
					try {
						
						Value A_symbol_144 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_145 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_144, P_TypedElement_type);
						
						DomainType static_A_symbol_146 = valueFactory.typeOf(A_symbol_145);
						LibraryBinaryOperation dynamic_A_symbol_146 = (LibraryBinaryOperation)static_A_symbol_146.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_146 = dynamic_A_symbol_146.evaluate(evaluator, T_Boolean, A_symbol_145, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_143 = A_symbol_146;
					} catch (InvalidValueException e) {
						leftA_symbol_143 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_146 = leftA_symbol_143;
					Value rightA_symbol_143;
					try {
						
						Value A_symbol_147 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_148 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_147, P_TypedElement_type);
						
						DomainType static_A_symbol_149 = valueFactory.typeOf(A_symbol_148);
						LibraryBinaryOperation dynamic_A_symbol_149 = (LibraryBinaryOperation)static_A_symbol_149.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_149 = dynamic_A_symbol_149.evaluate(evaluator, T_Boolean, A_symbol_148, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_143 = A_symbol_149;
					} catch (InvalidValueException e) {
						rightA_symbol_143 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_149 = rightA_symbol_143;
					DomainType static_A_symbol_143 = valueFactory.typeOf(A_symbol_146);
					LibraryBinaryOperation dynamic_A_symbol_143 = (LibraryBinaryOperation)static_A_symbol_143.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_143 = dynamic_A_symbol_143.evaluate(evaluator, T_Boolean, A_symbol_146, A_symbol_149);
				Value A_symbol_150;
				if (A_symbol_143.isTrue()) {
					
					Value A_symbol_151 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_152 = valueFactory.typeOf(A_symbol_151);
					LibraryBinaryOperation dynamic_A_symbol_152 = (LibraryBinaryOperation)static_A_symbol_152.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_152 = dynamic_A_symbol_152.evaluate(evaluator, T_Boolean, A_symbol_151, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_150 = A_symbol_152;
				}
				else if (A_symbol_143.isFalse()) {
					
					Value A_symbol_153 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_154 = valueFactory.typeOf(A_symbol_153);
					LibraryBinaryOperation dynamic_A_symbol_154 = (LibraryBinaryOperation)static_A_symbol_154.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_154 = dynamic_A_symbol_154.evaluate(evaluator, T_Boolean, A_symbol_153, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
					A_symbol_150 = A_symbol_154;
				}
				else if (A_symbol_143.isNull()) {
					A_symbol_150 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_150 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_140 = A_symbol_150;
			} catch (InvalidValueException e) {
				rightA_symbol_140 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_150 = rightA_symbol_140;
			DomainType static_A_symbol_140 = valueFactory.typeOf(A_symbol_142);
			LibraryBinaryOperation dynamic_A_symbol_140 = (LibraryBinaryOperation)static_A_symbol_140.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_140 = dynamic_A_symbol_140.evaluate(evaluator, T_Boolean, A_symbol_142, A_symbol_150);
			return A_symbol_140;
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
			
			Value leftA_symbol_155;
			try {
				
				Value A_symbol_156 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_157 = valueFactory.typeOf(A_symbol_156, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_157 = (LibraryBinaryOperation)static_A_symbol_157.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_157 = dynamic_A_symbol_157.evaluate(evaluator, T_Boolean, A_symbol_156, S_collect);
				leftA_symbol_155 = A_symbol_157;
			} catch (InvalidValueException e) {
				leftA_symbol_155 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_157 = leftA_symbol_155;
			Value rightA_symbol_155;
			try {
				
				Value A_symbol_158 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_159 = valueFactory.typeOf(A_symbol_158);
				LibraryBinaryOperation dynamic_A_symbol_159 = (LibraryBinaryOperation)static_A_symbol_159.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_159 = dynamic_A_symbol_159.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_158, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_160 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_159, P_CollectionType_elementType);
				
				
				Value A_symbol_161 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_162 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_161, P_TypedElement_type);
				
				DomainType static_A_symbol_163 = valueFactory.typeOf(A_symbol_162);
				LibraryBinaryOperation dynamic_A_symbol_163 = (LibraryBinaryOperation)static_A_symbol_163.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_163 = dynamic_A_symbol_163.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_162, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_164 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_163, P_CollectionType_elementType);
				
				DomainType static_A_symbol_165 = valueFactory.typeOf(A_symbol_160, A_symbol_164);
				LibraryBinaryOperation dynamic_A_symbol_165 = (LibraryBinaryOperation)static_A_symbol_165.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_165 = dynamic_A_symbol_165.evaluate(evaluator, T_Boolean, A_symbol_160, A_symbol_164);
				rightA_symbol_155 = A_symbol_165;
			} catch (InvalidValueException e) {
				rightA_symbol_155 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_165 = rightA_symbol_155;
			DomainType static_A_symbol_155 = valueFactory.typeOf(A_symbol_157);
			LibraryBinaryOperation dynamic_A_symbol_155 = (LibraryBinaryOperation)static_A_symbol_155.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_155 = dynamic_A_symbol_155.evaluate(evaluator, T_Boolean, A_symbol_157, A_symbol_165);
			return A_symbol_155;
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
				
				Value A_symbol_169 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_170 = valueFactory.typeOf(A_symbol_169);
				LibraryUnaryOperation dynamic_A_symbol_170 = (LibraryUnaryOperation)static_A_symbol_170.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_170 = dynamic_A_symbol_170.evaluate(evaluator, T_Integer, A_symbol_169);
				DomainType static_A_symbol_171 = valueFactory.typeOf(A_symbol_170, I_1);
				LibraryBinaryOperation dynamic_A_symbol_171 = (LibraryBinaryOperation)static_A_symbol_171.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_171 = dynamic_A_symbol_171.evaluate(evaluator, T_Boolean, A_symbol_170, I_1);
				rightA_symbol_166 = A_symbol_171;
			} catch (InvalidValueException e) {
				rightA_symbol_166 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_171 = rightA_symbol_166;
			DomainType static_A_symbol_166 = valueFactory.typeOf(A_symbol_168);
			LibraryBinaryOperation dynamic_A_symbol_166 = (LibraryBinaryOperation)static_A_symbol_166.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_166 = dynamic_A_symbol_166.evaluate(evaluator, T_Boolean, A_symbol_168, A_symbol_171);
			return A_symbol_166;
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
			
			Value leftA_symbol_172;
			try {
				
				Value A_symbol_173 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_174 = valueFactory.typeOf(A_symbol_173, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_174 = (LibraryBinaryOperation)static_A_symbol_174.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_174 = dynamic_A_symbol_174.evaluate(evaluator, T_Boolean, A_symbol_173, S_collectN___);
				leftA_symbol_172 = A_symbol_174;
			} catch (InvalidValueException e) {
				leftA_symbol_172 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_174 = leftA_symbol_172;
			Value rightA_symbol_172;
			try {
				
				Value A_symbol_175 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_176 = valueFactory.typeOf(A_symbol_175);
				LibraryUnaryOperation dynamic_A_symbol_176 = (LibraryUnaryOperation)static_A_symbol_176.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_176 = dynamic_A_symbol_176.evaluate(evaluator, T_Integer, A_symbol_175);
				DomainType static_A_symbol_177 = valueFactory.typeOf(A_symbol_176, I_1);
				LibraryBinaryOperation dynamic_A_symbol_177 = (LibraryBinaryOperation)static_A_symbol_177.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_177 = dynamic_A_symbol_177.evaluate(evaluator, T_Boolean, A_symbol_176, I_1);
				rightA_symbol_172 = A_symbol_177;
			} catch (InvalidValueException e) {
				rightA_symbol_172 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_177 = rightA_symbol_172;
			DomainType static_A_symbol_172 = valueFactory.typeOf(A_symbol_174);
			LibraryBinaryOperation dynamic_A_symbol_172 = (LibraryBinaryOperation)static_A_symbol_172.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_172 = dynamic_A_symbol_172.evaluate(evaluator, T_Boolean, A_symbol_174, A_symbol_177);
			return A_symbol_172;
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
			
			Value leftA_symbol_178;
			try {
				
				Value A_symbol_179 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_180 = valueFactory.typeOf(A_symbol_179, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_180 = (LibraryBinaryOperation)static_A_symbol_180.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_180 = dynamic_A_symbol_180.evaluate(evaluator, T_Boolean, A_symbol_179, S_collectN___);
				leftA_symbol_178 = A_symbol_180;
			} catch (InvalidValueException e) {
				leftA_symbol_178 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_180 = leftA_symbol_178;
			Value rightA_symbol_178;
			try {
				
				Value A_symbol_181 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_182 = valueFactory.typeOf(A_symbol_181);
				LibraryBinaryOperation dynamic_A_symbol_182 = (LibraryBinaryOperation)static_A_symbol_182.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_182 = dynamic_A_symbol_182.evaluate(evaluator, T_Boolean, A_symbol_181, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
				rightA_symbol_178 = A_symbol_182;
			} catch (InvalidValueException e) {
				rightA_symbol_178 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_182 = rightA_symbol_178;
			DomainType static_A_symbol_178 = valueFactory.typeOf(A_symbol_180);
			LibraryBinaryOperation dynamic_A_symbol_178 = (LibraryBinaryOperation)static_A_symbol_178.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_178 = dynamic_A_symbol_178.evaluate(evaluator, T_Boolean, A_symbol_180, A_symbol_182);
			return A_symbol_178;
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
			
			Value leftA_symbol_183;
			try {
				
				Value A_symbol_184 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_185 = valueFactory.typeOf(A_symbol_184, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_185 = (LibraryBinaryOperation)static_A_symbol_185.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_185 = dynamic_A_symbol_185.evaluate(evaluator, T_Boolean, A_symbol_184, S_collectN___);
				leftA_symbol_183 = A_symbol_185;
			} catch (InvalidValueException e) {
				leftA_symbol_183 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_185 = leftA_symbol_183;
			Value rightA_symbol_183;
			try {
				
				Value A_symbol_186 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_187 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_188 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_187, P_TypedElement_type);
				
				DomainType static_A_symbol_189 = valueFactory.typeOf(A_symbol_186, A_symbol_188);
				LibraryBinaryOperation dynamic_A_symbol_189 = (LibraryBinaryOperation)static_A_symbol_189.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_189 = dynamic_A_symbol_189.evaluate(evaluator, T_Boolean, A_symbol_186, A_symbol_188);
				rightA_symbol_183 = A_symbol_189;
			} catch (InvalidValueException e) {
				rightA_symbol_183 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_189 = rightA_symbol_183;
			DomainType static_A_symbol_183 = valueFactory.typeOf(A_symbol_185);
			LibraryBinaryOperation dynamic_A_symbol_183 = (LibraryBinaryOperation)static_A_symbol_183.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_183 = dynamic_A_symbol_183.evaluate(evaluator, T_Boolean, A_symbol_185, A_symbol_189);
			return A_symbol_183;
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
			
			Value leftA_symbol_190;
			try {
				
				Value A_symbol_191 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_192 = valueFactory.typeOf(A_symbol_191, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_192 = (LibraryBinaryOperation)static_A_symbol_192.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_192 = dynamic_A_symbol_192.evaluate(evaluator, T_Boolean, A_symbol_191, S_collect);
				leftA_symbol_190 = A_symbol_192;
			} catch (InvalidValueException e) {
				leftA_symbol_190 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_192 = leftA_symbol_190;
			Value rightA_symbol_190;
			try {
					Value leftA_symbol_193;
					try {
						
						Value A_symbol_194 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_195 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_194, P_TypedElement_type);
						
						DomainType static_A_symbol_196 = valueFactory.typeOf(A_symbol_195);
						LibraryBinaryOperation dynamic_A_symbol_196 = (LibraryBinaryOperation)static_A_symbol_196.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_196 = dynamic_A_symbol_196.evaluate(evaluator, T_Boolean, A_symbol_195, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_193 = A_symbol_196;
					} catch (InvalidValueException e) {
						leftA_symbol_193 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_196 = leftA_symbol_193;
					Value rightA_symbol_193;
					try {
						
						Value A_symbol_197 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_198 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_197, P_TypedElement_type);
						
						DomainType static_A_symbol_199 = valueFactory.typeOf(A_symbol_198);
						LibraryBinaryOperation dynamic_A_symbol_199 = (LibraryBinaryOperation)static_A_symbol_199.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_199 = dynamic_A_symbol_199.evaluate(evaluator, T_Boolean, A_symbol_198, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_193 = A_symbol_199;
					} catch (InvalidValueException e) {
						rightA_symbol_193 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_199 = rightA_symbol_193;
					DomainType static_A_symbol_193 = valueFactory.typeOf(A_symbol_196);
					LibraryBinaryOperation dynamic_A_symbol_193 = (LibraryBinaryOperation)static_A_symbol_193.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_193 = dynamic_A_symbol_193.evaluate(evaluator, T_Boolean, A_symbol_196, A_symbol_199);
				Value A_symbol_200;
				if (A_symbol_193.isTrue()) {
					
					Value A_symbol_201 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_202 = valueFactory.typeOf(A_symbol_201);
					LibraryBinaryOperation dynamic_A_symbol_202 = (LibraryBinaryOperation)static_A_symbol_202.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_202 = dynamic_A_symbol_202.evaluate(evaluator, T_Boolean, A_symbol_201, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_200 = A_symbol_202;
				}
				else if (A_symbol_193.isFalse()) {
					
					Value A_symbol_203 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_204 = valueFactory.typeOf(A_symbol_203);
					LibraryBinaryOperation dynamic_A_symbol_204 = (LibraryBinaryOperation)static_A_symbol_204.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_204 = dynamic_A_symbol_204.evaluate(evaluator, T_Boolean, A_symbol_203, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
					A_symbol_200 = A_symbol_204;
				}
				else if (A_symbol_193.isNull()) {
					A_symbol_200 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_200 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_190 = A_symbol_200;
			} catch (InvalidValueException e) {
				rightA_symbol_190 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_200 = rightA_symbol_190;
			DomainType static_A_symbol_190 = valueFactory.typeOf(A_symbol_192);
			LibraryBinaryOperation dynamic_A_symbol_190 = (LibraryBinaryOperation)static_A_symbol_190.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_190 = dynamic_A_symbol_190.evaluate(evaluator, T_Boolean, A_symbol_192, A_symbol_200);
			return A_symbol_190;
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
			
			Value leftA_symbol_205;
			try {
				
				Value A_symbol_206 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_207 = valueFactory.typeOf(A_symbol_206, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_207 = (LibraryBinaryOperation)static_A_symbol_207.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_207 = dynamic_A_symbol_207.evaluate(evaluator, T_Boolean, A_symbol_206, S_exists);
				leftA_symbol_205 = A_symbol_207;
			} catch (InvalidValueException e) {
				leftA_symbol_205 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_207 = leftA_symbol_205;
			Value rightA_symbol_205;
			try {
				
				Value A_symbol_208 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_209 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_208, P_TypedElement_type);
				
				DomainType static_A_symbol_210 = valueFactory.typeOf(A_symbol_209, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_210 = (LibraryBinaryOperation)static_A_symbol_210.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_210 = dynamic_A_symbol_210.evaluate(evaluator, T_Boolean, A_symbol_209, T_ClassClassifier_Boolean_);
				rightA_symbol_205 = A_symbol_210;
			} catch (InvalidValueException e) {
				rightA_symbol_205 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_210 = rightA_symbol_205;
			DomainType static_A_symbol_205 = valueFactory.typeOf(A_symbol_207);
			LibraryBinaryOperation dynamic_A_symbol_205 = (LibraryBinaryOperation)static_A_symbol_205.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_205 = dynamic_A_symbol_205.evaluate(evaluator, T_Boolean, A_symbol_207, A_symbol_210);
			return A_symbol_205;
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
			
			Value leftA_symbol_211;
			try {
				
				Value A_symbol_212 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_213 = valueFactory.typeOf(A_symbol_212, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_213 = (LibraryBinaryOperation)static_A_symbol_213.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_213 = dynamic_A_symbol_213.evaluate(evaluator, T_Boolean, A_symbol_212, S_exists);
				leftA_symbol_211 = A_symbol_213;
			} catch (InvalidValueException e) {
				leftA_symbol_211 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_213 = leftA_symbol_211;
			Value rightA_symbol_211;
			try {
				
				Value A_symbol_214 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_215 = valueFactory.typeOf(A_symbol_214, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_215 = (LibraryBinaryOperation)static_A_symbol_215.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_215 = dynamic_A_symbol_215.evaluate(evaluator, T_Boolean, A_symbol_214, T_ClassClassifier_Boolean_);
				rightA_symbol_211 = A_symbol_215;
			} catch (InvalidValueException e) {
				rightA_symbol_211 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_215 = rightA_symbol_211;
			DomainType static_A_symbol_211 = valueFactory.typeOf(A_symbol_213);
			LibraryBinaryOperation dynamic_A_symbol_211 = (LibraryBinaryOperation)static_A_symbol_211.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_211 = dynamic_A_symbol_211.evaluate(evaluator, T_Boolean, A_symbol_213, A_symbol_215);
			return A_symbol_211;
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
			
			Value leftA_symbol_216;
			try {
				
				Value A_symbol_217 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_218 = valueFactory.typeOf(A_symbol_217, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_218 = (LibraryBinaryOperation)static_A_symbol_218.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_218 = dynamic_A_symbol_218.evaluate(evaluator, T_Boolean, A_symbol_217, S_forAll);
				leftA_symbol_216 = A_symbol_218;
			} catch (InvalidValueException e) {
				leftA_symbol_216 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_218 = leftA_symbol_216;
			Value rightA_symbol_216;
			try {
				
				Value A_symbol_219 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_220 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_219, P_TypedElement_type);
				
				DomainType static_A_symbol_221 = valueFactory.typeOf(A_symbol_220, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_221 = (LibraryBinaryOperation)static_A_symbol_221.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_221 = dynamic_A_symbol_221.evaluate(evaluator, T_Boolean, A_symbol_220, T_ClassClassifier_Boolean_);
				rightA_symbol_216 = A_symbol_221;
			} catch (InvalidValueException e) {
				rightA_symbol_216 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_221 = rightA_symbol_216;
			DomainType static_A_symbol_216 = valueFactory.typeOf(A_symbol_218);
			LibraryBinaryOperation dynamic_A_symbol_216 = (LibraryBinaryOperation)static_A_symbol_216.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_216 = dynamic_A_symbol_216.evaluate(evaluator, T_Boolean, A_symbol_218, A_symbol_221);
			return A_symbol_216;
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
			
			Value leftA_symbol_222;
			try {
				
				Value A_symbol_223 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_224 = valueFactory.typeOf(A_symbol_223, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_224 = (LibraryBinaryOperation)static_A_symbol_224.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_224 = dynamic_A_symbol_224.evaluate(evaluator, T_Boolean, A_symbol_223, S_forAll);
				leftA_symbol_222 = A_symbol_224;
			} catch (InvalidValueException e) {
				leftA_symbol_222 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_224 = leftA_symbol_222;
			Value rightA_symbol_222;
			try {
				
				Value A_symbol_225 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_226 = valueFactory.typeOf(A_symbol_225, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_226 = (LibraryBinaryOperation)static_A_symbol_226.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_226 = dynamic_A_symbol_226.evaluate(evaluator, T_Boolean, A_symbol_225, T_ClassClassifier_Boolean_);
				rightA_symbol_222 = A_symbol_226;
			} catch (InvalidValueException e) {
				rightA_symbol_222 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_226 = rightA_symbol_222;
			DomainType static_A_symbol_222 = valueFactory.typeOf(A_symbol_224);
			LibraryBinaryOperation dynamic_A_symbol_222 = (LibraryBinaryOperation)static_A_symbol_222.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_222 = dynamic_A_symbol_222.evaluate(evaluator, T_Boolean, A_symbol_224, A_symbol_226);
			return A_symbol_222;
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
			
			Value leftA_symbol_227;
			try {
				
				Value A_symbol_228 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_229 = valueFactory.typeOf(A_symbol_228, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_229 = (LibraryBinaryOperation)static_A_symbol_229.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_229 = dynamic_A_symbol_229.evaluate(evaluator, T_Boolean, A_symbol_228, S_isUnique);
				leftA_symbol_227 = A_symbol_229;
			} catch (InvalidValueException e) {
				leftA_symbol_227 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_229 = leftA_symbol_227;
			Value rightA_symbol_227;
			try {
				
				Value A_symbol_230 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_231 = valueFactory.typeOf(A_symbol_230);
				LibraryUnaryOperation dynamic_A_symbol_231 = (LibraryUnaryOperation)static_A_symbol_231.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_231 = dynamic_A_symbol_231.evaluate(evaluator, T_Integer, A_symbol_230);
				DomainType static_A_symbol_232 = valueFactory.typeOf(A_symbol_231, I_1);
				LibraryBinaryOperation dynamic_A_symbol_232 = (LibraryBinaryOperation)static_A_symbol_232.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_232 = dynamic_A_symbol_232.evaluate(evaluator, T_Boolean, A_symbol_231, I_1);
				rightA_symbol_227 = A_symbol_232;
			} catch (InvalidValueException e) {
				rightA_symbol_227 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_232 = rightA_symbol_227;
			DomainType static_A_symbol_227 = valueFactory.typeOf(A_symbol_229);
			LibraryBinaryOperation dynamic_A_symbol_227 = (LibraryBinaryOperation)static_A_symbol_227.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_227 = dynamic_A_symbol_227.evaluate(evaluator, T_Boolean, A_symbol_229, A_symbol_232);
			return A_symbol_227;
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
			
			Value leftA_symbol_233;
			try {
				
				Value A_symbol_234 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_235 = valueFactory.typeOf(A_symbol_234, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_235 = (LibraryBinaryOperation)static_A_symbol_235.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_235 = dynamic_A_symbol_235.evaluate(evaluator, T_Boolean, A_symbol_234, S_isUnique);
				leftA_symbol_233 = A_symbol_235;
			} catch (InvalidValueException e) {
				leftA_symbol_233 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_235 = leftA_symbol_233;
			Value rightA_symbol_233;
			try {
				
				Value A_symbol_236 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_237 = valueFactory.typeOf(A_symbol_236, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_237 = (LibraryBinaryOperation)static_A_symbol_237.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_237 = dynamic_A_symbol_237.evaluate(evaluator, T_Boolean, A_symbol_236, T_ClassClassifier_Boolean_);
				rightA_symbol_233 = A_symbol_237;
			} catch (InvalidValueException e) {
				rightA_symbol_233 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_237 = rightA_symbol_233;
			DomainType static_A_symbol_233 = valueFactory.typeOf(A_symbol_235);
			LibraryBinaryOperation dynamic_A_symbol_233 = (LibraryBinaryOperation)static_A_symbol_233.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_233 = dynamic_A_symbol_233.evaluate(evaluator, T_Boolean, A_symbol_235, A_symbol_237);
			return A_symbol_233;
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
			
			
			Value A_symbol_238 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_239 = new AbstractBinaryOperation()
			{
			/*
			type =
			source.type.oclAsType(_'file:/C:/Development/OCL3.2.0Aux/GIT/org.eclipse.ocl/examples/org.eclipse.ocl.examples.pivot/model/Pivot.ecore'::ocl::CollectionType).elementType
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_240 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_1_, P_TypedElement_type);
					
					
					Value A_symbol_241 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
					
					Value A_symbol_242 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_241, P_TypedElement_type);
					
					DomainType static_A_symbol_243 = valueFactory.typeOf(A_symbol_242);
					LibraryBinaryOperation dynamic_A_symbol_243 = (LibraryBinaryOperation)static_A_symbol_243.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_243 = dynamic_A_symbol_243.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_242, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_244 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_243, P_CollectionType_elementType);
					
					DomainType static_A_symbol_245 = valueFactory.typeOf(A_symbol_240, A_symbol_244);
					LibraryBinaryOperation dynamic_A_symbol_245 = (LibraryBinaryOperation)static_A_symbol_245.lookupImplementation(standardLibrary, O_OclAny__eq_);
					Value A_symbol_245 = dynamic_A_symbol_245.evaluate(evaluator, T_Boolean, A_symbol_240, A_symbol_244);
					return A_symbol_245;
				}
			};
			DomainType static_A_symbol_239 = A_symbol_238.getType();
			LibraryIteration dynamic_A_symbol_239 = (LibraryIteration)static_A_symbol_239.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_239 = dynamic_A_symbol_239.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_239 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_239, (CollectionValue)A_symbol_238, acc_A_symbol_239);
			Value A_symbol_239 = dynamic_A_symbol_239.evaluateIteration(manager_A_symbol_239);
			return A_symbol_239;
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
			
			Value leftA_symbol_246;
			try {
				
				Value A_symbol_247 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_248 = valueFactory.typeOf(A_symbol_247, S_one);
				LibraryBinaryOperation dynamic_A_symbol_248 = (LibraryBinaryOperation)static_A_symbol_248.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_248 = dynamic_A_symbol_248.evaluate(evaluator, T_Boolean, A_symbol_247, S_one);
				leftA_symbol_246 = A_symbol_248;
			} catch (InvalidValueException e) {
				leftA_symbol_246 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_248 = leftA_symbol_246;
			Value rightA_symbol_246;
			try {
				
				Value A_symbol_249 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_250 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_249, P_TypedElement_type);
				
				DomainType static_A_symbol_251 = valueFactory.typeOf(A_symbol_250, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_251 = (LibraryBinaryOperation)static_A_symbol_251.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_251 = dynamic_A_symbol_251.evaluate(evaluator, T_Boolean, A_symbol_250, T_ClassClassifier_Boolean_);
				rightA_symbol_246 = A_symbol_251;
			} catch (InvalidValueException e) {
				rightA_symbol_246 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_251 = rightA_symbol_246;
			DomainType static_A_symbol_246 = valueFactory.typeOf(A_symbol_248);
			LibraryBinaryOperation dynamic_A_symbol_246 = (LibraryBinaryOperation)static_A_symbol_246.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_246 = dynamic_A_symbol_246.evaluate(evaluator, T_Boolean, A_symbol_248, A_symbol_251);
			return A_symbol_246;
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
			
			Value leftA_symbol_252;
			try {
				
				Value A_symbol_253 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_254 = valueFactory.typeOf(A_symbol_253, S_one);
				LibraryBinaryOperation dynamic_A_symbol_254 = (LibraryBinaryOperation)static_A_symbol_254.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_254 = dynamic_A_symbol_254.evaluate(evaluator, T_Boolean, A_symbol_253, S_one);
				leftA_symbol_252 = A_symbol_254;
			} catch (InvalidValueException e) {
				leftA_symbol_252 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_254 = leftA_symbol_252;
			Value rightA_symbol_252;
			try {
				
				Value A_symbol_255 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_256 = valueFactory.typeOf(A_symbol_255);
				LibraryUnaryOperation dynamic_A_symbol_256 = (LibraryUnaryOperation)static_A_symbol_256.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_256 = dynamic_A_symbol_256.evaluate(evaluator, T_Integer, A_symbol_255);
				DomainType static_A_symbol_257 = valueFactory.typeOf(A_symbol_256, I_1);
				LibraryBinaryOperation dynamic_A_symbol_257 = (LibraryBinaryOperation)static_A_symbol_257.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_257 = dynamic_A_symbol_257.evaluate(evaluator, T_Boolean, A_symbol_256, I_1);
				rightA_symbol_252 = A_symbol_257;
			} catch (InvalidValueException e) {
				rightA_symbol_252 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_257 = rightA_symbol_252;
			DomainType static_A_symbol_252 = valueFactory.typeOf(A_symbol_254);
			LibraryBinaryOperation dynamic_A_symbol_252 = (LibraryBinaryOperation)static_A_symbol_252.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_252 = dynamic_A_symbol_252.evaluate(evaluator, T_Boolean, A_symbol_254, A_symbol_257);
			return A_symbol_252;
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
			
			Value leftA_symbol_258;
			try {
				
				Value A_symbol_259 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_260 = valueFactory.typeOf(A_symbol_259, S_one);
				LibraryBinaryOperation dynamic_A_symbol_260 = (LibraryBinaryOperation)static_A_symbol_260.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_260 = dynamic_A_symbol_260.evaluate(evaluator, T_Boolean, A_symbol_259, S_one);
				leftA_symbol_258 = A_symbol_260;
			} catch (InvalidValueException e) {
				leftA_symbol_258 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_260 = leftA_symbol_258;
			Value rightA_symbol_258;
			try {
				
				Value A_symbol_261 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_262 = valueFactory.typeOf(A_symbol_261, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_262 = (LibraryBinaryOperation)static_A_symbol_262.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_262 = dynamic_A_symbol_262.evaluate(evaluator, T_Boolean, A_symbol_261, T_ClassClassifier_Boolean_);
				rightA_symbol_258 = A_symbol_262;
			} catch (InvalidValueException e) {
				rightA_symbol_258 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_262 = rightA_symbol_258;
			DomainType static_A_symbol_258 = valueFactory.typeOf(A_symbol_260);
			LibraryBinaryOperation dynamic_A_symbol_258 = (LibraryBinaryOperation)static_A_symbol_258.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_258 = dynamic_A_symbol_258.evaluate(evaluator, T_Boolean, A_symbol_260, A_symbol_262);
			return A_symbol_258;
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
			
			Value leftA_symbol_263;
			try {
				Value leftA_symbol_264;
				try {
					
					Value A_symbol_265 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_266 = valueFactory.typeOf(A_symbol_265, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_266 = (LibraryBinaryOperation)static_A_symbol_266.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_266 = dynamic_A_symbol_266.evaluate(evaluator, T_Boolean, A_symbol_265, S_reject);
					leftA_symbol_264 = A_symbol_266;
				} catch (InvalidValueException e) {
					leftA_symbol_264 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_266 = leftA_symbol_264;
				Value rightA_symbol_264;
				try {
					
					Value A_symbol_267 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_268 = valueFactory.typeOf(A_symbol_267, S_select);
					LibraryBinaryOperation dynamic_A_symbol_268 = (LibraryBinaryOperation)static_A_symbol_268.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_268 = dynamic_A_symbol_268.evaluate(evaluator, T_Boolean, A_symbol_267, S_select);
					rightA_symbol_264 = A_symbol_268;
				} catch (InvalidValueException e) {
					rightA_symbol_264 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_268 = rightA_symbol_264;
				DomainType static_A_symbol_264 = valueFactory.typeOf(A_symbol_266);
				LibraryBinaryOperation dynamic_A_symbol_264 = (LibraryBinaryOperation)static_A_symbol_264.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_264 = dynamic_A_symbol_264.evaluate(evaluator, T_Boolean, A_symbol_266, A_symbol_268);
				leftA_symbol_263 = A_symbol_264;
			} catch (InvalidValueException e) {
				leftA_symbol_263 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_264 = leftA_symbol_263;
			Value rightA_symbol_263;
			try {
				
				Value A_symbol_269 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_270 = valueFactory.typeOf(A_symbol_269);
				LibraryUnaryOperation dynamic_A_symbol_270 = (LibraryUnaryOperation)static_A_symbol_270.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_270 = dynamic_A_symbol_270.evaluate(evaluator, T_Integer, A_symbol_269);
				DomainType static_A_symbol_271 = valueFactory.typeOf(A_symbol_270, I_1);
				LibraryBinaryOperation dynamic_A_symbol_271 = (LibraryBinaryOperation)static_A_symbol_271.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_271 = dynamic_A_symbol_271.evaluate(evaluator, T_Boolean, A_symbol_270, I_1);
				rightA_symbol_263 = A_symbol_271;
			} catch (InvalidValueException e) {
				rightA_symbol_263 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_271 = rightA_symbol_263;
			DomainType static_A_symbol_263 = valueFactory.typeOf(A_symbol_264);
			LibraryBinaryOperation dynamic_A_symbol_263 = (LibraryBinaryOperation)static_A_symbol_263.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_263 = dynamic_A_symbol_263.evaluate(evaluator, T_Boolean, A_symbol_264, A_symbol_271);
			return A_symbol_263;
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
			
			Value leftA_symbol_272;
			try {
				Value leftA_symbol_273;
				try {
					
					Value A_symbol_274 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_275 = valueFactory.typeOf(A_symbol_274, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_275 = (LibraryBinaryOperation)static_A_symbol_275.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_275 = dynamic_A_symbol_275.evaluate(evaluator, T_Boolean, A_symbol_274, S_reject);
					leftA_symbol_273 = A_symbol_275;
				} catch (InvalidValueException e) {
					leftA_symbol_273 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_275 = leftA_symbol_273;
				Value rightA_symbol_273;
				try {
					
					Value A_symbol_276 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_277 = valueFactory.typeOf(A_symbol_276, S_select);
					LibraryBinaryOperation dynamic_A_symbol_277 = (LibraryBinaryOperation)static_A_symbol_277.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_277 = dynamic_A_symbol_277.evaluate(evaluator, T_Boolean, A_symbol_276, S_select);
					rightA_symbol_273 = A_symbol_277;
				} catch (InvalidValueException e) {
					rightA_symbol_273 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_277 = rightA_symbol_273;
				DomainType static_A_symbol_273 = valueFactory.typeOf(A_symbol_275);
				LibraryBinaryOperation dynamic_A_symbol_273 = (LibraryBinaryOperation)static_A_symbol_273.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_273 = dynamic_A_symbol_273.evaluate(evaluator, T_Boolean, A_symbol_275, A_symbol_277);
				leftA_symbol_272 = A_symbol_273;
			} catch (InvalidValueException e) {
				leftA_symbol_272 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_273 = leftA_symbol_272;
			Value rightA_symbol_272;
			try {
				
				Value A_symbol_278 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_279 = valueFactory.typeOf(A_symbol_278, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_279 = (LibraryBinaryOperation)static_A_symbol_279.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_279 = dynamic_A_symbol_279.evaluate(evaluator, T_Boolean, A_symbol_278, T_ClassClassifier_Boolean_);
				rightA_symbol_272 = A_symbol_279;
			} catch (InvalidValueException e) {
				rightA_symbol_272 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_279 = rightA_symbol_272;
			DomainType static_A_symbol_272 = valueFactory.typeOf(A_symbol_273);
			LibraryBinaryOperation dynamic_A_symbol_272 = (LibraryBinaryOperation)static_A_symbol_272.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_272 = dynamic_A_symbol_272.evaluate(evaluator, T_Boolean, A_symbol_273, A_symbol_279);
			return A_symbol_272;
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
			
			Value leftA_symbol_280;
			try {
				Value leftA_symbol_281;
				try {
					
					Value A_symbol_282 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_283 = valueFactory.typeOf(A_symbol_282, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_283 = (LibraryBinaryOperation)static_A_symbol_283.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_283 = dynamic_A_symbol_283.evaluate(evaluator, T_Boolean, A_symbol_282, S_reject);
					leftA_symbol_281 = A_symbol_283;
				} catch (InvalidValueException e) {
					leftA_symbol_281 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_283 = leftA_symbol_281;
				Value rightA_symbol_281;
				try {
					
					Value A_symbol_284 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_285 = valueFactory.typeOf(A_symbol_284, S_select);
					LibraryBinaryOperation dynamic_A_symbol_285 = (LibraryBinaryOperation)static_A_symbol_285.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_285 = dynamic_A_symbol_285.evaluate(evaluator, T_Boolean, A_symbol_284, S_select);
					rightA_symbol_281 = A_symbol_285;
				} catch (InvalidValueException e) {
					rightA_symbol_281 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_285 = rightA_symbol_281;
				DomainType static_A_symbol_281 = valueFactory.typeOf(A_symbol_283);
				LibraryBinaryOperation dynamic_A_symbol_281 = (LibraryBinaryOperation)static_A_symbol_281.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_281 = dynamic_A_symbol_281.evaluate(evaluator, T_Boolean, A_symbol_283, A_symbol_285);
				leftA_symbol_280 = A_symbol_281;
			} catch (InvalidValueException e) {
				leftA_symbol_280 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_281 = leftA_symbol_280;
			Value rightA_symbol_280;
			try {
				
				Value A_symbol_286 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_287 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_288 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_287, P_TypedElement_type);
				
				DomainType static_A_symbol_289 = valueFactory.typeOf(A_symbol_286, A_symbol_288);
				LibraryBinaryOperation dynamic_A_symbol_289 = (LibraryBinaryOperation)static_A_symbol_289.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_289 = dynamic_A_symbol_289.evaluate(evaluator, T_Boolean, A_symbol_286, A_symbol_288);
				rightA_symbol_280 = A_symbol_289;
			} catch (InvalidValueException e) {
				rightA_symbol_280 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_289 = rightA_symbol_280;
			DomainType static_A_symbol_280 = valueFactory.typeOf(A_symbol_281);
			LibraryBinaryOperation dynamic_A_symbol_280 = (LibraryBinaryOperation)static_A_symbol_280.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_280 = dynamic_A_symbol_280.evaluate(evaluator, T_Boolean, A_symbol_281, A_symbol_289);
			return A_symbol_280;
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
			
			Value leftA_symbol_290;
			try {
				
				Value A_symbol_291 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_292 = valueFactory.typeOf(A_symbol_291, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_292 = (LibraryBinaryOperation)static_A_symbol_292.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_292 = dynamic_A_symbol_292.evaluate(evaluator, T_Boolean, A_symbol_291, S_sortedBy);
				leftA_symbol_290 = A_symbol_292;
			} catch (InvalidValueException e) {
				leftA_symbol_290 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_292 = leftA_symbol_290;
			Value rightA_symbol_290;
			try {
				
				Value A_symbol_293 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_294 = valueFactory.typeOf(A_symbol_293);
				LibraryBinaryOperation dynamic_A_symbol_294 = (LibraryBinaryOperation)static_A_symbol_294.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_294 = dynamic_A_symbol_294.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_293, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_295 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_294, P_CollectionType_elementType);
				
				
				Value A_symbol_296 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_297 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_296, P_TypedElement_type);
				
				DomainType static_A_symbol_298 = valueFactory.typeOf(A_symbol_297);
				LibraryBinaryOperation dynamic_A_symbol_298 = (LibraryBinaryOperation)static_A_symbol_298.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_298 = dynamic_A_symbol_298.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_297, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_299 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_298, P_CollectionType_elementType);
				
				DomainType static_A_symbol_300 = valueFactory.typeOf(A_symbol_295, A_symbol_299);
				LibraryBinaryOperation dynamic_A_symbol_300 = (LibraryBinaryOperation)static_A_symbol_300.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_300 = dynamic_A_symbol_300.evaluate(evaluator, T_Boolean, A_symbol_295, A_symbol_299);
				rightA_symbol_290 = A_symbol_300;
			} catch (InvalidValueException e) {
				rightA_symbol_290 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_300 = rightA_symbol_290;
			DomainType static_A_symbol_290 = valueFactory.typeOf(A_symbol_292);
			LibraryBinaryOperation dynamic_A_symbol_290 = (LibraryBinaryOperation)static_A_symbol_290.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_290 = dynamic_A_symbol_290.evaluate(evaluator, T_Boolean, A_symbol_292, A_symbol_300);
			return A_symbol_290;
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
			
			Value leftA_symbol_301;
			try {
				
				Value A_symbol_302 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_303 = valueFactory.typeOf(A_symbol_302, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_303 = (LibraryBinaryOperation)static_A_symbol_303.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_303 = dynamic_A_symbol_303.evaluate(evaluator, T_Boolean, A_symbol_302, S_sortedBy);
				leftA_symbol_301 = A_symbol_303;
			} catch (InvalidValueException e) {
				leftA_symbol_301 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_303 = leftA_symbol_301;
			Value rightA_symbol_301;
			try {
				
				Value A_symbol_304 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_305 = valueFactory.typeOf(A_symbol_304);
				LibraryUnaryOperation dynamic_A_symbol_305 = (LibraryUnaryOperation)static_A_symbol_305.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_305 = dynamic_A_symbol_305.evaluate(evaluator, T_Integer, A_symbol_304);
				DomainType static_A_symbol_306 = valueFactory.typeOf(A_symbol_305, I_1);
				LibraryBinaryOperation dynamic_A_symbol_306 = (LibraryBinaryOperation)static_A_symbol_306.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_306 = dynamic_A_symbol_306.evaluate(evaluator, T_Boolean, A_symbol_305, I_1);
				rightA_symbol_301 = A_symbol_306;
			} catch (InvalidValueException e) {
				rightA_symbol_301 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_306 = rightA_symbol_301;
			DomainType static_A_symbol_301 = valueFactory.typeOf(A_symbol_303);
			LibraryBinaryOperation dynamic_A_symbol_301 = (LibraryBinaryOperation)static_A_symbol_301.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_301 = dynamic_A_symbol_301.evaluate(evaluator, T_Boolean, A_symbol_303, A_symbol_306);
			return A_symbol_301;
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
			
			Value leftA_symbol_307;
			try {
				
				Value A_symbol_308 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_309 = valueFactory.typeOf(A_symbol_308, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_309 = (LibraryBinaryOperation)static_A_symbol_309.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_309 = dynamic_A_symbol_309.evaluate(evaluator, T_Boolean, A_symbol_308, S_sortedBy);
				leftA_symbol_307 = A_symbol_309;
			} catch (InvalidValueException e) {
				leftA_symbol_307 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_309 = leftA_symbol_307;
			Value rightA_symbol_307;
			try {
					Value leftA_symbol_310;
					try {
						
						Value A_symbol_311 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_312 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_311, P_TypedElement_type);
						
						DomainType static_A_symbol_313 = valueFactory.typeOf(A_symbol_312);
						LibraryBinaryOperation dynamic_A_symbol_313 = (LibraryBinaryOperation)static_A_symbol_313.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_313 = dynamic_A_symbol_313.evaluate(evaluator, T_Boolean, A_symbol_312, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_310 = A_symbol_313;
					} catch (InvalidValueException e) {
						leftA_symbol_310 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_313 = leftA_symbol_310;
					Value rightA_symbol_310;
					try {
						
						Value A_symbol_314 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_315 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_314, P_TypedElement_type);
						
						DomainType static_A_symbol_316 = valueFactory.typeOf(A_symbol_315);
						LibraryBinaryOperation dynamic_A_symbol_316 = (LibraryBinaryOperation)static_A_symbol_316.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_316 = dynamic_A_symbol_316.evaluate(evaluator, T_Boolean, A_symbol_315, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
						rightA_symbol_310 = A_symbol_316;
					} catch (InvalidValueException e) {
						rightA_symbol_310 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_316 = rightA_symbol_310;
					DomainType static_A_symbol_310 = valueFactory.typeOf(A_symbol_313);
					LibraryBinaryOperation dynamic_A_symbol_310 = (LibraryBinaryOperation)static_A_symbol_310.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_310 = dynamic_A_symbol_310.evaluate(evaluator, T_Boolean, A_symbol_313, A_symbol_316);
				Value A_symbol_317;
				if (A_symbol_310.isTrue()) {
					
					Value A_symbol_318 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_319 = valueFactory.typeOf(A_symbol_318);
					LibraryBinaryOperation dynamic_A_symbol_319 = (LibraryBinaryOperation)static_A_symbol_319.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_319 = dynamic_A_symbol_319.evaluate(evaluator, T_Boolean, A_symbol_318, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_317 = A_symbol_319;
				}
				else if (A_symbol_310.isFalse()) {
					
					Value A_symbol_320 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_321 = valueFactory.typeOf(A_symbol_320);
					LibraryBinaryOperation dynamic_A_symbol_321 = (LibraryBinaryOperation)static_A_symbol_321.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_321 = dynamic_A_symbol_321.evaluate(evaluator, T_Boolean, A_symbol_320, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_317 = A_symbol_321;
				}
				else if (A_symbol_310.isNull()) {
					A_symbol_317 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_317 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_307 = A_symbol_317;
			} catch (InvalidValueException e) {
				rightA_symbol_307 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_317 = rightA_symbol_307;
			DomainType static_A_symbol_307 = valueFactory.typeOf(A_symbol_309);
			LibraryBinaryOperation dynamic_A_symbol_307 = (LibraryBinaryOperation)static_A_symbol_307.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_307 = dynamic_A_symbol_307.evaluate(evaluator, T_Boolean, A_symbol_309, A_symbol_317);
			return A_symbol_307;
		}
	}
}

