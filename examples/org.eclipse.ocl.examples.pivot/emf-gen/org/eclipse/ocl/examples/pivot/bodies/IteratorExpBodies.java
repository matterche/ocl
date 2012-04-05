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
			
			Value leftA_symbol_92;
			try {
				
				Value A_symbol_93 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_94 = valueFactory.typeOf(A_symbol_93, S_any);
				LibraryBinaryOperation dynamic_A_symbol_94 = (LibraryBinaryOperation)static_A_symbol_94.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_94 = dynamic_A_symbol_94.evaluate(evaluator, T_Boolean, A_symbol_93, S_any);
				leftA_symbol_92 = A_symbol_94;
			} catch (InvalidValueException e) {
				leftA_symbol_92 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_94 = leftA_symbol_92;
			Value rightA_symbol_92;
			try {
				
				Value A_symbol_95 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_96 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_95, P_TypedElement_type);
				
				DomainType static_A_symbol_97 = valueFactory.typeOf(A_symbol_96, S_Boolean);
				LibraryBinaryOperation dynamic_A_symbol_97 = (LibraryBinaryOperation)static_A_symbol_97.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_97 = dynamic_A_symbol_97.evaluate(evaluator, T_Boolean, A_symbol_96, S_Boolean);
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
			
			Value leftA_symbol_98;
			try {
				
				Value A_symbol_99 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_100 = valueFactory.typeOf(A_symbol_99, S_any);
				LibraryBinaryOperation dynamic_A_symbol_100 = (LibraryBinaryOperation)static_A_symbol_100.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_100 = dynamic_A_symbol_100.evaluate(evaluator, T_Boolean, A_symbol_99, S_any);
				leftA_symbol_98 = A_symbol_100;
			} catch (InvalidValueException e) {
				leftA_symbol_98 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_100 = leftA_symbol_98;
			Value rightA_symbol_98;
			try {
				
				Value A_symbol_101 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_102 = valueFactory.typeOf(A_symbol_101);
				LibraryUnaryOperation dynamic_A_symbol_102 = (LibraryUnaryOperation)static_A_symbol_102.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_102 = dynamic_A_symbol_102.evaluate(evaluator, T_Integer, A_symbol_101);
				DomainType static_A_symbol_103 = valueFactory.typeOf(A_symbol_102, I_1);
				LibraryBinaryOperation dynamic_A_symbol_103 = (LibraryBinaryOperation)static_A_symbol_103.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_103 = dynamic_A_symbol_103.evaluate(evaluator, T_Boolean, A_symbol_102, I_1);
				rightA_symbol_98 = A_symbol_103;
			} catch (InvalidValueException e) {
				rightA_symbol_98 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_103 = rightA_symbol_98;
			DomainType static_A_symbol_98 = valueFactory.typeOf(A_symbol_100);
			LibraryBinaryOperation dynamic_A_symbol_98 = (LibraryBinaryOperation)static_A_symbol_98.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_98 = dynamic_A_symbol_98.evaluate(evaluator, T_Boolean, A_symbol_100, A_symbol_103);
			return A_symbol_98;
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
			
			Value leftA_symbol_104;
			try {
				
				Value A_symbol_105 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_106 = valueFactory.typeOf(A_symbol_105, S_any);
				LibraryBinaryOperation dynamic_A_symbol_106 = (LibraryBinaryOperation)static_A_symbol_106.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_106 = dynamic_A_symbol_106.evaluate(evaluator, T_Boolean, A_symbol_105, S_any);
				leftA_symbol_104 = A_symbol_106;
			} catch (InvalidValueException e) {
				leftA_symbol_104 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_106 = leftA_symbol_104;
			Value rightA_symbol_104;
			try {
				
				Value A_symbol_107 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_108 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_109 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_108, P_TypedElement_type);
				
				DomainType static_A_symbol_110 = valueFactory.typeOf(A_symbol_109);
				LibraryBinaryOperation dynamic_A_symbol_110 = (LibraryBinaryOperation)static_A_symbol_110.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_110 = dynamic_A_symbol_110.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_109, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_111 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_110, P_CollectionType_elementType);
				
				DomainType static_A_symbol_112 = valueFactory.typeOf(A_symbol_107, A_symbol_111);
				LibraryBinaryOperation dynamic_A_symbol_112 = (LibraryBinaryOperation)static_A_symbol_112.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_112 = dynamic_A_symbol_112.evaluate(evaluator, T_Boolean, A_symbol_107, A_symbol_111);
				rightA_symbol_104 = A_symbol_112;
			} catch (InvalidValueException e) {
				rightA_symbol_104 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_112 = rightA_symbol_104;
			DomainType static_A_symbol_104 = valueFactory.typeOf(A_symbol_106);
			LibraryBinaryOperation dynamic_A_symbol_104 = (LibraryBinaryOperation)static_A_symbol_104.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_104 = dynamic_A_symbol_104.evaluate(evaluator, T_Boolean, A_symbol_106, A_symbol_112);
			return A_symbol_104;
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
			
			Value leftA_symbol_113;
			try {
				
				Value A_symbol_114 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_115 = valueFactory.typeOf(A_symbol_114, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_115 = (LibraryBinaryOperation)static_A_symbol_115.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_115 = dynamic_A_symbol_115.evaluate(evaluator, T_Boolean, A_symbol_114, S_closure);
				leftA_symbol_113 = A_symbol_115;
			} catch (InvalidValueException e) {
				leftA_symbol_113 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_115 = leftA_symbol_113;
			Value rightA_symbol_113;
			try {
				
				Value A_symbol_116 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_117 = valueFactory.typeOf(A_symbol_116);
				LibraryBinaryOperation dynamic_A_symbol_117 = (LibraryBinaryOperation)static_A_symbol_117.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_117 = dynamic_A_symbol_117.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_116, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_118 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_117, P_CollectionType_elementType);
				
				
				Value A_symbol_119 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_120 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_119, P_TypedElement_type);
				
				DomainType static_A_symbol_121 = valueFactory.typeOf(A_symbol_120);
				LibraryBinaryOperation dynamic_A_symbol_121 = (LibraryBinaryOperation)static_A_symbol_121.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_121 = dynamic_A_symbol_121.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_120, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_122 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_121, P_CollectionType_elementType);
				
				DomainType static_A_symbol_123 = valueFactory.typeOf(A_symbol_118, A_symbol_122);
				LibraryBinaryOperation dynamic_A_symbol_123 = (LibraryBinaryOperation)static_A_symbol_123.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_123 = dynamic_A_symbol_123.evaluate(evaluator, T_Boolean, A_symbol_118, A_symbol_122);
				rightA_symbol_113 = A_symbol_123;
			} catch (InvalidValueException e) {
				rightA_symbol_113 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_123 = rightA_symbol_113;
			DomainType static_A_symbol_113 = valueFactory.typeOf(A_symbol_115);
			LibraryBinaryOperation dynamic_A_symbol_113 = (LibraryBinaryOperation)static_A_symbol_113.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_113 = dynamic_A_symbol_113.evaluate(evaluator, T_Boolean, A_symbol_115, A_symbol_123);
			return A_symbol_113;
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
			
			Value leftA_symbol_124;
			try {
				
				Value A_symbol_125 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_126 = valueFactory.typeOf(A_symbol_125, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_126 = (LibraryBinaryOperation)static_A_symbol_126.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_126 = dynamic_A_symbol_126.evaluate(evaluator, T_Boolean, A_symbol_125, S_closure);
				leftA_symbol_124 = A_symbol_126;
			} catch (InvalidValueException e) {
				leftA_symbol_124 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_126 = leftA_symbol_124;
			Value rightA_symbol_124;
			try {
				
				Value A_symbol_127 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_128 = valueFactory.typeOf(A_symbol_127);
				LibraryUnaryOperation dynamic_A_symbol_128 = (LibraryUnaryOperation)static_A_symbol_128.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_128 = dynamic_A_symbol_128.evaluate(evaluator, T_Integer, A_symbol_127);
				DomainType static_A_symbol_129 = valueFactory.typeOf(A_symbol_128, I_1);
				LibraryBinaryOperation dynamic_A_symbol_129 = (LibraryBinaryOperation)static_A_symbol_129.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_129 = dynamic_A_symbol_129.evaluate(evaluator, T_Boolean, A_symbol_128, I_1);
				rightA_symbol_124 = A_symbol_129;
			} catch (InvalidValueException e) {
				rightA_symbol_124 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_129 = rightA_symbol_124;
			DomainType static_A_symbol_124 = valueFactory.typeOf(A_symbol_126);
			LibraryBinaryOperation dynamic_A_symbol_124 = (LibraryBinaryOperation)static_A_symbol_124.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_124 = dynamic_A_symbol_124.evaluate(evaluator, T_Boolean, A_symbol_126, A_symbol_129);
			return A_symbol_124;
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
			
			Value leftA_symbol_130;
			try {
				
				Value A_symbol_131 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_132 = valueFactory.typeOf(A_symbol_131, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_132 = (LibraryBinaryOperation)static_A_symbol_132.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_132 = dynamic_A_symbol_132.evaluate(evaluator, T_Boolean, A_symbol_131, S_closure);
				leftA_symbol_130 = A_symbol_132;
			} catch (InvalidValueException e) {
				leftA_symbol_130 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_132 = leftA_symbol_130;
			Value rightA_symbol_130;
			try {
				
				Value A_symbol_133 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_134 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_133, P_TypedElement_type);
				
				DomainType static_A_symbol_135 = valueFactory.typeOf(A_symbol_134);
				LibraryBinaryOperation dynamic_A_symbol_135 = (LibraryBinaryOperation)static_A_symbol_135.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_135 = dynamic_A_symbol_135.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_134, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_136 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_135, P_CollectionType_elementType);
				
					
					Value A_symbol_137 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_138 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_137, P_TypedElement_type);
					
					DomainType static_A_symbol_139 = valueFactory.typeOf(A_symbol_138);
					LibraryBinaryOperation dynamic_A_symbol_139 = (LibraryBinaryOperation)static_A_symbol_139.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_139 = dynamic_A_symbol_139.evaluate(evaluator, T_Boolean, A_symbol_138, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_140;
				if (A_symbol_139.isTrue()) {
					
					Value A_symbol_141 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_142 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_141, P_TypedElement_type);
					
					DomainType static_A_symbol_143 = valueFactory.typeOf(A_symbol_142);
					LibraryBinaryOperation dynamic_A_symbol_143 = (LibraryBinaryOperation)static_A_symbol_143.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_143 = dynamic_A_symbol_143.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_142, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_144 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_143, P_CollectionType_elementType);
					
					A_symbol_140 = A_symbol_144;
				}
				else if (A_symbol_139.isFalse()) {
					
					Value A_symbol_145 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_146 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_145, P_TypedElement_type);
					
					A_symbol_140 = A_symbol_146;
				}
				else if (A_symbol_139.isNull()) {
					A_symbol_140 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_140 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				DomainType static_A_symbol_147 = valueFactory.typeOf(A_symbol_136, A_symbol_140);
				LibraryBinaryOperation dynamic_A_symbol_147 = (LibraryBinaryOperation)static_A_symbol_147.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_147 = dynamic_A_symbol_147.evaluate(evaluator, T_Boolean, A_symbol_136, A_symbol_140);
				rightA_symbol_130 = A_symbol_147;
			} catch (InvalidValueException e) {
				rightA_symbol_130 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_147 = rightA_symbol_130;
			DomainType static_A_symbol_130 = valueFactory.typeOf(A_symbol_132);
			LibraryBinaryOperation dynamic_A_symbol_130 = (LibraryBinaryOperation)static_A_symbol_130.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_130 = dynamic_A_symbol_130.evaluate(evaluator, T_Boolean, A_symbol_132, A_symbol_147);
			return A_symbol_130;
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
			
			Value leftA_symbol_148;
			try {
				
				Value A_symbol_149 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_150 = valueFactory.typeOf(A_symbol_149, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_150 = (LibraryBinaryOperation)static_A_symbol_150.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_150 = dynamic_A_symbol_150.evaluate(evaluator, T_Boolean, A_symbol_149, S_closure);
				leftA_symbol_148 = A_symbol_150;
			} catch (InvalidValueException e) {
				leftA_symbol_148 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_150 = leftA_symbol_148;
			Value rightA_symbol_148;
			try {
					Value leftA_symbol_151;
					try {
						
						Value A_symbol_152 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_153 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_152, P_TypedElement_type);
						
						DomainType static_A_symbol_154 = valueFactory.typeOf(A_symbol_153);
						LibraryBinaryOperation dynamic_A_symbol_154 = (LibraryBinaryOperation)static_A_symbol_154.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_154 = dynamic_A_symbol_154.evaluate(evaluator, T_Boolean, A_symbol_153, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_151 = A_symbol_154;
					} catch (InvalidValueException e) {
						leftA_symbol_151 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_154 = leftA_symbol_151;
					Value rightA_symbol_151;
					try {
						
						Value A_symbol_155 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_156 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_155, P_TypedElement_type);
						
						DomainType static_A_symbol_157 = valueFactory.typeOf(A_symbol_156);
						LibraryBinaryOperation dynamic_A_symbol_157 = (LibraryBinaryOperation)static_A_symbol_157.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_157 = dynamic_A_symbol_157.evaluate(evaluator, T_Boolean, A_symbol_156, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_151 = A_symbol_157;
					} catch (InvalidValueException e) {
						rightA_symbol_151 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_157 = rightA_symbol_151;
					DomainType static_A_symbol_151 = valueFactory.typeOf(A_symbol_154);
					LibraryBinaryOperation dynamic_A_symbol_151 = (LibraryBinaryOperation)static_A_symbol_151.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_151 = dynamic_A_symbol_151.evaluate(evaluator, T_Boolean, A_symbol_154, A_symbol_157);
				Value A_symbol_158;
				if (A_symbol_151.isTrue()) {
					
					Value A_symbol_159 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_160 = valueFactory.typeOf(A_symbol_159);
					LibraryBinaryOperation dynamic_A_symbol_160 = (LibraryBinaryOperation)static_A_symbol_160.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_160 = dynamic_A_symbol_160.evaluate(evaluator, T_Boolean, A_symbol_159, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_158 = A_symbol_160;
				}
				else if (A_symbol_151.isFalse()) {
					
					Value A_symbol_161 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_162 = valueFactory.typeOf(A_symbol_161);
					LibraryBinaryOperation dynamic_A_symbol_162 = (LibraryBinaryOperation)static_A_symbol_162.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_162 = dynamic_A_symbol_162.evaluate(evaluator, T_Boolean, A_symbol_161, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
					A_symbol_158 = A_symbol_162;
				}
				else if (A_symbol_151.isNull()) {
					A_symbol_158 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_158 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_148 = A_symbol_158;
			} catch (InvalidValueException e) {
				rightA_symbol_148 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_158 = rightA_symbol_148;
			DomainType static_A_symbol_148 = valueFactory.typeOf(A_symbol_150);
			LibraryBinaryOperation dynamic_A_symbol_148 = (LibraryBinaryOperation)static_A_symbol_148.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_148 = dynamic_A_symbol_148.evaluate(evaluator, T_Boolean, A_symbol_150, A_symbol_158);
			return A_symbol_148;
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
			
			Value leftA_symbol_163;
			try {
				
				Value A_symbol_164 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_165 = valueFactory.typeOf(A_symbol_164, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_165 = (LibraryBinaryOperation)static_A_symbol_165.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_165 = dynamic_A_symbol_165.evaluate(evaluator, T_Boolean, A_symbol_164, S_collect);
				leftA_symbol_163 = A_symbol_165;
			} catch (InvalidValueException e) {
				leftA_symbol_163 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_165 = leftA_symbol_163;
			Value rightA_symbol_163;
			try {
				
				Value A_symbol_166 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_167 = valueFactory.typeOf(A_symbol_166);
				LibraryBinaryOperation dynamic_A_symbol_167 = (LibraryBinaryOperation)static_A_symbol_167.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_167 = dynamic_A_symbol_167.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_166, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_168 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_167, P_CollectionType_elementType);
				
				
				Value A_symbol_169 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_170 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_169, P_TypedElement_type);
				
				DomainType static_A_symbol_171 = valueFactory.typeOf(A_symbol_170);
				LibraryBinaryOperation dynamic_A_symbol_171 = (LibraryBinaryOperation)static_A_symbol_171.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_171 = dynamic_A_symbol_171.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_170, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_172 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_171, P_CollectionType_elementType);
				
				DomainType static_A_symbol_173 = valueFactory.typeOf(A_symbol_168, A_symbol_172);
				LibraryBinaryOperation dynamic_A_symbol_173 = (LibraryBinaryOperation)static_A_symbol_173.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_173 = dynamic_A_symbol_173.evaluate(evaluator, T_Boolean, A_symbol_168, A_symbol_172);
				rightA_symbol_163 = A_symbol_173;
			} catch (InvalidValueException e) {
				rightA_symbol_163 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_173 = rightA_symbol_163;
			DomainType static_A_symbol_163 = valueFactory.typeOf(A_symbol_165);
			LibraryBinaryOperation dynamic_A_symbol_163 = (LibraryBinaryOperation)static_A_symbol_163.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_163 = dynamic_A_symbol_163.evaluate(evaluator, T_Boolean, A_symbol_165, A_symbol_173);
			return A_symbol_163;
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
			
			Value leftA_symbol_174;
			try {
				
				Value A_symbol_175 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_176 = valueFactory.typeOf(A_symbol_175, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_176 = (LibraryBinaryOperation)static_A_symbol_176.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_176 = dynamic_A_symbol_176.evaluate(evaluator, T_Boolean, A_symbol_175, S_collect);
				leftA_symbol_174 = A_symbol_176;
			} catch (InvalidValueException e) {
				leftA_symbol_174 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_176 = leftA_symbol_174;
			Value rightA_symbol_174;
			try {
				
				Value A_symbol_177 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_178 = valueFactory.typeOf(A_symbol_177);
				LibraryUnaryOperation dynamic_A_symbol_178 = (LibraryUnaryOperation)static_A_symbol_178.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_178 = dynamic_A_symbol_178.evaluate(evaluator, T_Integer, A_symbol_177);
				DomainType static_A_symbol_179 = valueFactory.typeOf(A_symbol_178, I_1);
				LibraryBinaryOperation dynamic_A_symbol_179 = (LibraryBinaryOperation)static_A_symbol_179.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_179 = dynamic_A_symbol_179.evaluate(evaluator, T_Boolean, A_symbol_178, I_1);
				rightA_symbol_174 = A_symbol_179;
			} catch (InvalidValueException e) {
				rightA_symbol_174 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_179 = rightA_symbol_174;
			DomainType static_A_symbol_174 = valueFactory.typeOf(A_symbol_176);
			LibraryBinaryOperation dynamic_A_symbol_174 = (LibraryBinaryOperation)static_A_symbol_174.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_174 = dynamic_A_symbol_174.evaluate(evaluator, T_Boolean, A_symbol_176, A_symbol_179);
			return A_symbol_174;
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
			
			Value leftA_symbol_180;
			try {
				
				Value A_symbol_181 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_182 = valueFactory.typeOf(A_symbol_181, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_182 = (LibraryBinaryOperation)static_A_symbol_182.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_182 = dynamic_A_symbol_182.evaluate(evaluator, T_Boolean, A_symbol_181, S_collectN___);
				leftA_symbol_180 = A_symbol_182;
			} catch (InvalidValueException e) {
				leftA_symbol_180 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_182 = leftA_symbol_180;
			Value rightA_symbol_180;
			try {
				
				Value A_symbol_183 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_184 = valueFactory.typeOf(A_symbol_183);
				LibraryUnaryOperation dynamic_A_symbol_184 = (LibraryUnaryOperation)static_A_symbol_184.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_184 = dynamic_A_symbol_184.evaluate(evaluator, T_Integer, A_symbol_183);
				DomainType static_A_symbol_185 = valueFactory.typeOf(A_symbol_184, I_1);
				LibraryBinaryOperation dynamic_A_symbol_185 = (LibraryBinaryOperation)static_A_symbol_185.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_185 = dynamic_A_symbol_185.evaluate(evaluator, T_Boolean, A_symbol_184, I_1);
				rightA_symbol_180 = A_symbol_185;
			} catch (InvalidValueException e) {
				rightA_symbol_180 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_185 = rightA_symbol_180;
			DomainType static_A_symbol_180 = valueFactory.typeOf(A_symbol_182);
			LibraryBinaryOperation dynamic_A_symbol_180 = (LibraryBinaryOperation)static_A_symbol_180.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_180 = dynamic_A_symbol_180.evaluate(evaluator, T_Boolean, A_symbol_182, A_symbol_185);
			return A_symbol_180;
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
			
			Value leftA_symbol_186;
			try {
				
				Value A_symbol_187 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_188 = valueFactory.typeOf(A_symbol_187, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_188 = (LibraryBinaryOperation)static_A_symbol_188.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_188 = dynamic_A_symbol_188.evaluate(evaluator, T_Boolean, A_symbol_187, S_collectN___);
				leftA_symbol_186 = A_symbol_188;
			} catch (InvalidValueException e) {
				leftA_symbol_186 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_188 = leftA_symbol_186;
			Value rightA_symbol_186;
			try {
				
				Value A_symbol_189 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_190 = valueFactory.typeOf(A_symbol_189);
				LibraryBinaryOperation dynamic_A_symbol_190 = (LibraryBinaryOperation)static_A_symbol_190.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_190 = dynamic_A_symbol_190.evaluate(evaluator, T_Boolean, A_symbol_189, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
				rightA_symbol_186 = A_symbol_190;
			} catch (InvalidValueException e) {
				rightA_symbol_186 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_190 = rightA_symbol_186;
			DomainType static_A_symbol_186 = valueFactory.typeOf(A_symbol_188);
			LibraryBinaryOperation dynamic_A_symbol_186 = (LibraryBinaryOperation)static_A_symbol_186.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_186 = dynamic_A_symbol_186.evaluate(evaluator, T_Boolean, A_symbol_188, A_symbol_190);
			return A_symbol_186;
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
			
			Value leftA_symbol_191;
			try {
				
				Value A_symbol_192 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_193 = valueFactory.typeOf(A_symbol_192, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_193 = (LibraryBinaryOperation)static_A_symbol_193.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_193 = dynamic_A_symbol_193.evaluate(evaluator, T_Boolean, A_symbol_192, S_collectN___);
				leftA_symbol_191 = A_symbol_193;
			} catch (InvalidValueException e) {
				leftA_symbol_191 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_193 = leftA_symbol_191;
			Value rightA_symbol_191;
			try {
				
				Value A_symbol_194 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_195 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_196 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_195, P_TypedElement_type);
				
				DomainType static_A_symbol_197 = valueFactory.typeOf(A_symbol_194, A_symbol_196);
				LibraryBinaryOperation dynamic_A_symbol_197 = (LibraryBinaryOperation)static_A_symbol_197.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_197 = dynamic_A_symbol_197.evaluate(evaluator, T_Boolean, A_symbol_194, A_symbol_196);
				rightA_symbol_191 = A_symbol_197;
			} catch (InvalidValueException e) {
				rightA_symbol_191 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_197 = rightA_symbol_191;
			DomainType static_A_symbol_191 = valueFactory.typeOf(A_symbol_193);
			LibraryBinaryOperation dynamic_A_symbol_191 = (LibraryBinaryOperation)static_A_symbol_191.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_191 = dynamic_A_symbol_191.evaluate(evaluator, T_Boolean, A_symbol_193, A_symbol_197);
			return A_symbol_191;
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
			
			Value leftA_symbol_198;
			try {
				
				Value A_symbol_199 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_200 = valueFactory.typeOf(A_symbol_199, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_200 = (LibraryBinaryOperation)static_A_symbol_200.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_200 = dynamic_A_symbol_200.evaluate(evaluator, T_Boolean, A_symbol_199, S_collect);
				leftA_symbol_198 = A_symbol_200;
			} catch (InvalidValueException e) {
				leftA_symbol_198 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_200 = leftA_symbol_198;
			Value rightA_symbol_198;
			try {
					Value leftA_symbol_201;
					try {
						
						Value A_symbol_202 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_203 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_202, P_TypedElement_type);
						
						DomainType static_A_symbol_204 = valueFactory.typeOf(A_symbol_203);
						LibraryBinaryOperation dynamic_A_symbol_204 = (LibraryBinaryOperation)static_A_symbol_204.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_204 = dynamic_A_symbol_204.evaluate(evaluator, T_Boolean, A_symbol_203, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_201 = A_symbol_204;
					} catch (InvalidValueException e) {
						leftA_symbol_201 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_204 = leftA_symbol_201;
					Value rightA_symbol_201;
					try {
						
						Value A_symbol_205 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_206 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_205, P_TypedElement_type);
						
						DomainType static_A_symbol_207 = valueFactory.typeOf(A_symbol_206);
						LibraryBinaryOperation dynamic_A_symbol_207 = (LibraryBinaryOperation)static_A_symbol_207.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_207 = dynamic_A_symbol_207.evaluate(evaluator, T_Boolean, A_symbol_206, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_201 = A_symbol_207;
					} catch (InvalidValueException e) {
						rightA_symbol_201 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_207 = rightA_symbol_201;
					DomainType static_A_symbol_201 = valueFactory.typeOf(A_symbol_204);
					LibraryBinaryOperation dynamic_A_symbol_201 = (LibraryBinaryOperation)static_A_symbol_201.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_201 = dynamic_A_symbol_201.evaluate(evaluator, T_Boolean, A_symbol_204, A_symbol_207);
				Value A_symbol_208;
				if (A_symbol_201.isTrue()) {
					
					Value A_symbol_209 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_210 = valueFactory.typeOf(A_symbol_209);
					LibraryBinaryOperation dynamic_A_symbol_210 = (LibraryBinaryOperation)static_A_symbol_210.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_210 = dynamic_A_symbol_210.evaluate(evaluator, T_Boolean, A_symbol_209, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_208 = A_symbol_210;
				}
				else if (A_symbol_201.isFalse()) {
					
					Value A_symbol_211 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_212 = valueFactory.typeOf(A_symbol_211);
					LibraryBinaryOperation dynamic_A_symbol_212 = (LibraryBinaryOperation)static_A_symbol_212.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_212 = dynamic_A_symbol_212.evaluate(evaluator, T_Boolean, A_symbol_211, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
					A_symbol_208 = A_symbol_212;
				}
				else if (A_symbol_201.isNull()) {
					A_symbol_208 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_208 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_198 = A_symbol_208;
			} catch (InvalidValueException e) {
				rightA_symbol_198 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_208 = rightA_symbol_198;
			DomainType static_A_symbol_198 = valueFactory.typeOf(A_symbol_200);
			LibraryBinaryOperation dynamic_A_symbol_198 = (LibraryBinaryOperation)static_A_symbol_198.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_198 = dynamic_A_symbol_198.evaluate(evaluator, T_Boolean, A_symbol_200, A_symbol_208);
			return A_symbol_198;
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
			
			Value leftA_symbol_213;
			try {
				
				Value A_symbol_214 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_215 = valueFactory.typeOf(A_symbol_214, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_215 = (LibraryBinaryOperation)static_A_symbol_215.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_215 = dynamic_A_symbol_215.evaluate(evaluator, T_Boolean, A_symbol_214, S_exists);
				leftA_symbol_213 = A_symbol_215;
			} catch (InvalidValueException e) {
				leftA_symbol_213 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_215 = leftA_symbol_213;
			Value rightA_symbol_213;
			try {
				
				Value A_symbol_216 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_217 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_216, P_TypedElement_type);
				
				DomainType static_A_symbol_218 = valueFactory.typeOf(A_symbol_217, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_218 = (LibraryBinaryOperation)static_A_symbol_218.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_218 = dynamic_A_symbol_218.evaluate(evaluator, T_Boolean, A_symbol_217, T_ClassClassifier_Boolean_);
				rightA_symbol_213 = A_symbol_218;
			} catch (InvalidValueException e) {
				rightA_symbol_213 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_218 = rightA_symbol_213;
			DomainType static_A_symbol_213 = valueFactory.typeOf(A_symbol_215);
			LibraryBinaryOperation dynamic_A_symbol_213 = (LibraryBinaryOperation)static_A_symbol_213.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_213 = dynamic_A_symbol_213.evaluate(evaluator, T_Boolean, A_symbol_215, A_symbol_218);
			return A_symbol_213;
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
			
			Value leftA_symbol_219;
			try {
				
				Value A_symbol_220 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_221 = valueFactory.typeOf(A_symbol_220, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_221 = (LibraryBinaryOperation)static_A_symbol_221.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_221 = dynamic_A_symbol_221.evaluate(evaluator, T_Boolean, A_symbol_220, S_exists);
				leftA_symbol_219 = A_symbol_221;
			} catch (InvalidValueException e) {
				leftA_symbol_219 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_221 = leftA_symbol_219;
			Value rightA_symbol_219;
			try {
				
				Value A_symbol_222 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_223 = valueFactory.typeOf(A_symbol_222, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_223 = (LibraryBinaryOperation)static_A_symbol_223.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_223 = dynamic_A_symbol_223.evaluate(evaluator, T_Boolean, A_symbol_222, T_ClassClassifier_Boolean_);
				rightA_symbol_219 = A_symbol_223;
			} catch (InvalidValueException e) {
				rightA_symbol_219 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_223 = rightA_symbol_219;
			DomainType static_A_symbol_219 = valueFactory.typeOf(A_symbol_221);
			LibraryBinaryOperation dynamic_A_symbol_219 = (LibraryBinaryOperation)static_A_symbol_219.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_219 = dynamic_A_symbol_219.evaluate(evaluator, T_Boolean, A_symbol_221, A_symbol_223);
			return A_symbol_219;
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
			
			Value leftA_symbol_224;
			try {
				
				Value A_symbol_225 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_226 = valueFactory.typeOf(A_symbol_225, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_226 = (LibraryBinaryOperation)static_A_symbol_226.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_226 = dynamic_A_symbol_226.evaluate(evaluator, T_Boolean, A_symbol_225, S_forAll);
				leftA_symbol_224 = A_symbol_226;
			} catch (InvalidValueException e) {
				leftA_symbol_224 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_226 = leftA_symbol_224;
			Value rightA_symbol_224;
			try {
				
				Value A_symbol_227 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_228 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_227, P_TypedElement_type);
				
				DomainType static_A_symbol_229 = valueFactory.typeOf(A_symbol_228, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_229 = (LibraryBinaryOperation)static_A_symbol_229.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_229 = dynamic_A_symbol_229.evaluate(evaluator, T_Boolean, A_symbol_228, T_ClassClassifier_Boolean_);
				rightA_symbol_224 = A_symbol_229;
			} catch (InvalidValueException e) {
				rightA_symbol_224 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_229 = rightA_symbol_224;
			DomainType static_A_symbol_224 = valueFactory.typeOf(A_symbol_226);
			LibraryBinaryOperation dynamic_A_symbol_224 = (LibraryBinaryOperation)static_A_symbol_224.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_224 = dynamic_A_symbol_224.evaluate(evaluator, T_Boolean, A_symbol_226, A_symbol_229);
			return A_symbol_224;
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
			
			Value leftA_symbol_230;
			try {
				
				Value A_symbol_231 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_232 = valueFactory.typeOf(A_symbol_231, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_232 = (LibraryBinaryOperation)static_A_symbol_232.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_232 = dynamic_A_symbol_232.evaluate(evaluator, T_Boolean, A_symbol_231, S_forAll);
				leftA_symbol_230 = A_symbol_232;
			} catch (InvalidValueException e) {
				leftA_symbol_230 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_232 = leftA_symbol_230;
			Value rightA_symbol_230;
			try {
				
				Value A_symbol_233 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_234 = valueFactory.typeOf(A_symbol_233, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_234 = (LibraryBinaryOperation)static_A_symbol_234.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_234 = dynamic_A_symbol_234.evaluate(evaluator, T_Boolean, A_symbol_233, T_ClassClassifier_Boolean_);
				rightA_symbol_230 = A_symbol_234;
			} catch (InvalidValueException e) {
				rightA_symbol_230 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_234 = rightA_symbol_230;
			DomainType static_A_symbol_230 = valueFactory.typeOf(A_symbol_232);
			LibraryBinaryOperation dynamic_A_symbol_230 = (LibraryBinaryOperation)static_A_symbol_230.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_230 = dynamic_A_symbol_230.evaluate(evaluator, T_Boolean, A_symbol_232, A_symbol_234);
			return A_symbol_230;
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
			
			Value leftA_symbol_235;
			try {
				
				Value A_symbol_236 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_237 = valueFactory.typeOf(A_symbol_236, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_237 = (LibraryBinaryOperation)static_A_symbol_237.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_237 = dynamic_A_symbol_237.evaluate(evaluator, T_Boolean, A_symbol_236, S_isUnique);
				leftA_symbol_235 = A_symbol_237;
			} catch (InvalidValueException e) {
				leftA_symbol_235 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_237 = leftA_symbol_235;
			Value rightA_symbol_235;
			try {
				
				Value A_symbol_238 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_239 = valueFactory.typeOf(A_symbol_238);
				LibraryUnaryOperation dynamic_A_symbol_239 = (LibraryUnaryOperation)static_A_symbol_239.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_239 = dynamic_A_symbol_239.evaluate(evaluator, T_Integer, A_symbol_238);
				DomainType static_A_symbol_240 = valueFactory.typeOf(A_symbol_239, I_1);
				LibraryBinaryOperation dynamic_A_symbol_240 = (LibraryBinaryOperation)static_A_symbol_240.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_240 = dynamic_A_symbol_240.evaluate(evaluator, T_Boolean, A_symbol_239, I_1);
				rightA_symbol_235 = A_symbol_240;
			} catch (InvalidValueException e) {
				rightA_symbol_235 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_240 = rightA_symbol_235;
			DomainType static_A_symbol_235 = valueFactory.typeOf(A_symbol_237);
			LibraryBinaryOperation dynamic_A_symbol_235 = (LibraryBinaryOperation)static_A_symbol_235.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_235 = dynamic_A_symbol_235.evaluate(evaluator, T_Boolean, A_symbol_237, A_symbol_240);
			return A_symbol_235;
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
			
			Value leftA_symbol_241;
			try {
				
				Value A_symbol_242 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_243 = valueFactory.typeOf(A_symbol_242, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_243 = (LibraryBinaryOperation)static_A_symbol_243.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_243 = dynamic_A_symbol_243.evaluate(evaluator, T_Boolean, A_symbol_242, S_isUnique);
				leftA_symbol_241 = A_symbol_243;
			} catch (InvalidValueException e) {
				leftA_symbol_241 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_243 = leftA_symbol_241;
			Value rightA_symbol_241;
			try {
				
				Value A_symbol_244 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_245 = valueFactory.typeOf(A_symbol_244, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_245 = (LibraryBinaryOperation)static_A_symbol_245.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_245 = dynamic_A_symbol_245.evaluate(evaluator, T_Boolean, A_symbol_244, T_ClassClassifier_Boolean_);
				rightA_symbol_241 = A_symbol_245;
			} catch (InvalidValueException e) {
				rightA_symbol_241 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_245 = rightA_symbol_241;
			DomainType static_A_symbol_241 = valueFactory.typeOf(A_symbol_243);
			LibraryBinaryOperation dynamic_A_symbol_241 = (LibraryBinaryOperation)static_A_symbol_241.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_241 = dynamic_A_symbol_241.evaluate(evaluator, T_Boolean, A_symbol_243, A_symbol_245);
			return A_symbol_241;
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
			
			
			Value A_symbol_246 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_247 = new AbstractBinaryOperation()
			{
			/*
			type =
			source.type.oclAsType(_'file:/C:/Development/OCL3.2.0Aux/GIT/org.eclipse.ocl/examples/org.eclipse.ocl.examples.pivot/model/Pivot.ecore'::ocl::CollectionType).elementType
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_248 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_1_, P_TypedElement_type);
					
					
					Value A_symbol_249 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
					
					Value A_symbol_250 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_249, P_TypedElement_type);
					
					DomainType static_A_symbol_251 = valueFactory.typeOf(A_symbol_250);
					LibraryBinaryOperation dynamic_A_symbol_251 = (LibraryBinaryOperation)static_A_symbol_251.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_251 = dynamic_A_symbol_251.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_250, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_252 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_251, P_CollectionType_elementType);
					
					DomainType static_A_symbol_253 = valueFactory.typeOf(A_symbol_248, A_symbol_252);
					LibraryBinaryOperation dynamic_A_symbol_253 = (LibraryBinaryOperation)static_A_symbol_253.lookupImplementation(standardLibrary, O_OclAny__eq_);
					Value A_symbol_253 = dynamic_A_symbol_253.evaluate(evaluator, T_Boolean, A_symbol_248, A_symbol_252);
					return A_symbol_253;
				}
			};
			DomainType static_A_symbol_247 = A_symbol_246.getType();
			LibraryIteration dynamic_A_symbol_247 = (LibraryIteration)static_A_symbol_247.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_247 = dynamic_A_symbol_247.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_247 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_247, (CollectionValue)A_symbol_246, acc_A_symbol_247);
			Value A_symbol_247 = dynamic_A_symbol_247.evaluateIteration(manager_A_symbol_247);
			return A_symbol_247;
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
			
			Value leftA_symbol_254;
			try {
				
				Value A_symbol_255 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_256 = valueFactory.typeOf(A_symbol_255, S_one);
				LibraryBinaryOperation dynamic_A_symbol_256 = (LibraryBinaryOperation)static_A_symbol_256.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_256 = dynamic_A_symbol_256.evaluate(evaluator, T_Boolean, A_symbol_255, S_one);
				leftA_symbol_254 = A_symbol_256;
			} catch (InvalidValueException e) {
				leftA_symbol_254 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_256 = leftA_symbol_254;
			Value rightA_symbol_254;
			try {
				
				Value A_symbol_257 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_258 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_257, P_TypedElement_type);
				
				DomainType static_A_symbol_259 = valueFactory.typeOf(A_symbol_258, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_259 = (LibraryBinaryOperation)static_A_symbol_259.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_259 = dynamic_A_symbol_259.evaluate(evaluator, T_Boolean, A_symbol_258, T_ClassClassifier_Boolean_);
				rightA_symbol_254 = A_symbol_259;
			} catch (InvalidValueException e) {
				rightA_symbol_254 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_259 = rightA_symbol_254;
			DomainType static_A_symbol_254 = valueFactory.typeOf(A_symbol_256);
			LibraryBinaryOperation dynamic_A_symbol_254 = (LibraryBinaryOperation)static_A_symbol_254.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_254 = dynamic_A_symbol_254.evaluate(evaluator, T_Boolean, A_symbol_256, A_symbol_259);
			return A_symbol_254;
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
			
			Value leftA_symbol_260;
			try {
				
				Value A_symbol_261 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_262 = valueFactory.typeOf(A_symbol_261, S_one);
				LibraryBinaryOperation dynamic_A_symbol_262 = (LibraryBinaryOperation)static_A_symbol_262.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_262 = dynamic_A_symbol_262.evaluate(evaluator, T_Boolean, A_symbol_261, S_one);
				leftA_symbol_260 = A_symbol_262;
			} catch (InvalidValueException e) {
				leftA_symbol_260 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_262 = leftA_symbol_260;
			Value rightA_symbol_260;
			try {
				
				Value A_symbol_263 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_264 = valueFactory.typeOf(A_symbol_263);
				LibraryUnaryOperation dynamic_A_symbol_264 = (LibraryUnaryOperation)static_A_symbol_264.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_264 = dynamic_A_symbol_264.evaluate(evaluator, T_Integer, A_symbol_263);
				DomainType static_A_symbol_265 = valueFactory.typeOf(A_symbol_264, I_1);
				LibraryBinaryOperation dynamic_A_symbol_265 = (LibraryBinaryOperation)static_A_symbol_265.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_265 = dynamic_A_symbol_265.evaluate(evaluator, T_Boolean, A_symbol_264, I_1);
				rightA_symbol_260 = A_symbol_265;
			} catch (InvalidValueException e) {
				rightA_symbol_260 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_265 = rightA_symbol_260;
			DomainType static_A_symbol_260 = valueFactory.typeOf(A_symbol_262);
			LibraryBinaryOperation dynamic_A_symbol_260 = (LibraryBinaryOperation)static_A_symbol_260.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_260 = dynamic_A_symbol_260.evaluate(evaluator, T_Boolean, A_symbol_262, A_symbol_265);
			return A_symbol_260;
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
			
			Value leftA_symbol_266;
			try {
				
				Value A_symbol_267 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_268 = valueFactory.typeOf(A_symbol_267, S_one);
				LibraryBinaryOperation dynamic_A_symbol_268 = (LibraryBinaryOperation)static_A_symbol_268.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_268 = dynamic_A_symbol_268.evaluate(evaluator, T_Boolean, A_symbol_267, S_one);
				leftA_symbol_266 = A_symbol_268;
			} catch (InvalidValueException e) {
				leftA_symbol_266 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_268 = leftA_symbol_266;
			Value rightA_symbol_266;
			try {
				
				Value A_symbol_269 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_270 = valueFactory.typeOf(A_symbol_269, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_270 = (LibraryBinaryOperation)static_A_symbol_270.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_270 = dynamic_A_symbol_270.evaluate(evaluator, T_Boolean, A_symbol_269, T_ClassClassifier_Boolean_);
				rightA_symbol_266 = A_symbol_270;
			} catch (InvalidValueException e) {
				rightA_symbol_266 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_270 = rightA_symbol_266;
			DomainType static_A_symbol_266 = valueFactory.typeOf(A_symbol_268);
			LibraryBinaryOperation dynamic_A_symbol_266 = (LibraryBinaryOperation)static_A_symbol_266.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_266 = dynamic_A_symbol_266.evaluate(evaluator, T_Boolean, A_symbol_268, A_symbol_270);
			return A_symbol_266;
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
			
			Value leftA_symbol_271;
			try {
				Value leftA_symbol_272;
				try {
					
					Value A_symbol_273 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_274 = valueFactory.typeOf(A_symbol_273, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_274 = (LibraryBinaryOperation)static_A_symbol_274.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_274 = dynamic_A_symbol_274.evaluate(evaluator, T_Boolean, A_symbol_273, S_reject);
					leftA_symbol_272 = A_symbol_274;
				} catch (InvalidValueException e) {
					leftA_symbol_272 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_274 = leftA_symbol_272;
				Value rightA_symbol_272;
				try {
					
					Value A_symbol_275 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_276 = valueFactory.typeOf(A_symbol_275, S_select);
					LibraryBinaryOperation dynamic_A_symbol_276 = (LibraryBinaryOperation)static_A_symbol_276.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_276 = dynamic_A_symbol_276.evaluate(evaluator, T_Boolean, A_symbol_275, S_select);
					rightA_symbol_272 = A_symbol_276;
				} catch (InvalidValueException e) {
					rightA_symbol_272 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_276 = rightA_symbol_272;
				DomainType static_A_symbol_272 = valueFactory.typeOf(A_symbol_274);
				LibraryBinaryOperation dynamic_A_symbol_272 = (LibraryBinaryOperation)static_A_symbol_272.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_272 = dynamic_A_symbol_272.evaluate(evaluator, T_Boolean, A_symbol_274, A_symbol_276);
				leftA_symbol_271 = A_symbol_272;
			} catch (InvalidValueException e) {
				leftA_symbol_271 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_272 = leftA_symbol_271;
			Value rightA_symbol_271;
			try {
				
				Value A_symbol_277 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_278 = valueFactory.typeOf(A_symbol_277);
				LibraryUnaryOperation dynamic_A_symbol_278 = (LibraryUnaryOperation)static_A_symbol_278.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_278 = dynamic_A_symbol_278.evaluate(evaluator, T_Integer, A_symbol_277);
				DomainType static_A_symbol_279 = valueFactory.typeOf(A_symbol_278, I_1);
				LibraryBinaryOperation dynamic_A_symbol_279 = (LibraryBinaryOperation)static_A_symbol_279.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_279 = dynamic_A_symbol_279.evaluate(evaluator, T_Boolean, A_symbol_278, I_1);
				rightA_symbol_271 = A_symbol_279;
			} catch (InvalidValueException e) {
				rightA_symbol_271 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_279 = rightA_symbol_271;
			DomainType static_A_symbol_271 = valueFactory.typeOf(A_symbol_272);
			LibraryBinaryOperation dynamic_A_symbol_271 = (LibraryBinaryOperation)static_A_symbol_271.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_271 = dynamic_A_symbol_271.evaluate(evaluator, T_Boolean, A_symbol_272, A_symbol_279);
			return A_symbol_271;
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
				
				DomainType static_A_symbol_287 = valueFactory.typeOf(A_symbol_286, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_287 = (LibraryBinaryOperation)static_A_symbol_287.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_287 = dynamic_A_symbol_287.evaluate(evaluator, T_Boolean, A_symbol_286, T_ClassClassifier_Boolean_);
				rightA_symbol_280 = A_symbol_287;
			} catch (InvalidValueException e) {
				rightA_symbol_280 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_287 = rightA_symbol_280;
			DomainType static_A_symbol_280 = valueFactory.typeOf(A_symbol_281);
			LibraryBinaryOperation dynamic_A_symbol_280 = (LibraryBinaryOperation)static_A_symbol_280.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_280 = dynamic_A_symbol_280.evaluate(evaluator, T_Boolean, A_symbol_281, A_symbol_287);
			return A_symbol_280;
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
			
			Value leftA_symbol_288;
			try {
				Value leftA_symbol_289;
				try {
					
					Value A_symbol_290 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_291 = valueFactory.typeOf(A_symbol_290, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_291 = (LibraryBinaryOperation)static_A_symbol_291.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_291 = dynamic_A_symbol_291.evaluate(evaluator, T_Boolean, A_symbol_290, S_reject);
					leftA_symbol_289 = A_symbol_291;
				} catch (InvalidValueException e) {
					leftA_symbol_289 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_291 = leftA_symbol_289;
				Value rightA_symbol_289;
				try {
					
					Value A_symbol_292 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_293 = valueFactory.typeOf(A_symbol_292, S_select);
					LibraryBinaryOperation dynamic_A_symbol_293 = (LibraryBinaryOperation)static_A_symbol_293.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_293 = dynamic_A_symbol_293.evaluate(evaluator, T_Boolean, A_symbol_292, S_select);
					rightA_symbol_289 = A_symbol_293;
				} catch (InvalidValueException e) {
					rightA_symbol_289 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_293 = rightA_symbol_289;
				DomainType static_A_symbol_289 = valueFactory.typeOf(A_symbol_291);
				LibraryBinaryOperation dynamic_A_symbol_289 = (LibraryBinaryOperation)static_A_symbol_289.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_289 = dynamic_A_symbol_289.evaluate(evaluator, T_Boolean, A_symbol_291, A_symbol_293);
				leftA_symbol_288 = A_symbol_289;
			} catch (InvalidValueException e) {
				leftA_symbol_288 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_289 = leftA_symbol_288;
			Value rightA_symbol_288;
			try {
				
				Value A_symbol_294 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_295 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_296 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_295, P_TypedElement_type);
				
				DomainType static_A_symbol_297 = valueFactory.typeOf(A_symbol_294, A_symbol_296);
				LibraryBinaryOperation dynamic_A_symbol_297 = (LibraryBinaryOperation)static_A_symbol_297.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_297 = dynamic_A_symbol_297.evaluate(evaluator, T_Boolean, A_symbol_294, A_symbol_296);
				rightA_symbol_288 = A_symbol_297;
			} catch (InvalidValueException e) {
				rightA_symbol_288 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_297 = rightA_symbol_288;
			DomainType static_A_symbol_288 = valueFactory.typeOf(A_symbol_289);
			LibraryBinaryOperation dynamic_A_symbol_288 = (LibraryBinaryOperation)static_A_symbol_288.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_288 = dynamic_A_symbol_288.evaluate(evaluator, T_Boolean, A_symbol_289, A_symbol_297);
			return A_symbol_288;
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
			
			Value leftA_symbol_298;
			try {
				
				Value A_symbol_299 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_300 = valueFactory.typeOf(A_symbol_299, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_300 = (LibraryBinaryOperation)static_A_symbol_300.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_300 = dynamic_A_symbol_300.evaluate(evaluator, T_Boolean, A_symbol_299, S_sortedBy);
				leftA_symbol_298 = A_symbol_300;
			} catch (InvalidValueException e) {
				leftA_symbol_298 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_300 = leftA_symbol_298;
			Value rightA_symbol_298;
			try {
				
				Value A_symbol_301 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_302 = valueFactory.typeOf(A_symbol_301);
				LibraryBinaryOperation dynamic_A_symbol_302 = (LibraryBinaryOperation)static_A_symbol_302.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_302 = dynamic_A_symbol_302.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_301, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_303 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_302, P_CollectionType_elementType);
				
				
				Value A_symbol_304 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_305 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_304, P_TypedElement_type);
				
				DomainType static_A_symbol_306 = valueFactory.typeOf(A_symbol_305);
				LibraryBinaryOperation dynamic_A_symbol_306 = (LibraryBinaryOperation)static_A_symbol_306.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_306 = dynamic_A_symbol_306.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_305, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_307 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_306, P_CollectionType_elementType);
				
				DomainType static_A_symbol_308 = valueFactory.typeOf(A_symbol_303, A_symbol_307);
				LibraryBinaryOperation dynamic_A_symbol_308 = (LibraryBinaryOperation)static_A_symbol_308.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_308 = dynamic_A_symbol_308.evaluate(evaluator, T_Boolean, A_symbol_303, A_symbol_307);
				rightA_symbol_298 = A_symbol_308;
			} catch (InvalidValueException e) {
				rightA_symbol_298 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_308 = rightA_symbol_298;
			DomainType static_A_symbol_298 = valueFactory.typeOf(A_symbol_300);
			LibraryBinaryOperation dynamic_A_symbol_298 = (LibraryBinaryOperation)static_A_symbol_298.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_298 = dynamic_A_symbol_298.evaluate(evaluator, T_Boolean, A_symbol_300, A_symbol_308);
			return A_symbol_298;
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
			
			Value leftA_symbol_309;
			try {
				
				Value A_symbol_310 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_311 = valueFactory.typeOf(A_symbol_310, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_311 = (LibraryBinaryOperation)static_A_symbol_311.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_311 = dynamic_A_symbol_311.evaluate(evaluator, T_Boolean, A_symbol_310, S_sortedBy);
				leftA_symbol_309 = A_symbol_311;
			} catch (InvalidValueException e) {
				leftA_symbol_309 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_311 = leftA_symbol_309;
			Value rightA_symbol_309;
			try {
				
				Value A_symbol_312 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_313 = valueFactory.typeOf(A_symbol_312);
				LibraryUnaryOperation dynamic_A_symbol_313 = (LibraryUnaryOperation)static_A_symbol_313.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_313 = dynamic_A_symbol_313.evaluate(evaluator, T_Integer, A_symbol_312);
				DomainType static_A_symbol_314 = valueFactory.typeOf(A_symbol_313, I_1);
				LibraryBinaryOperation dynamic_A_symbol_314 = (LibraryBinaryOperation)static_A_symbol_314.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_314 = dynamic_A_symbol_314.evaluate(evaluator, T_Boolean, A_symbol_313, I_1);
				rightA_symbol_309 = A_symbol_314;
			} catch (InvalidValueException e) {
				rightA_symbol_309 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_314 = rightA_symbol_309;
			DomainType static_A_symbol_309 = valueFactory.typeOf(A_symbol_311);
			LibraryBinaryOperation dynamic_A_symbol_309 = (LibraryBinaryOperation)static_A_symbol_309.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_309 = dynamic_A_symbol_309.evaluate(evaluator, T_Boolean, A_symbol_311, A_symbol_314);
			return A_symbol_309;
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
			
			Value leftA_symbol_315;
			try {
				
				Value A_symbol_316 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_317 = valueFactory.typeOf(A_symbol_316, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_317 = (LibraryBinaryOperation)static_A_symbol_317.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_317 = dynamic_A_symbol_317.evaluate(evaluator, T_Boolean, A_symbol_316, S_sortedBy);
				leftA_symbol_315 = A_symbol_317;
			} catch (InvalidValueException e) {
				leftA_symbol_315 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_317 = leftA_symbol_315;
			Value rightA_symbol_315;
			try {
					Value leftA_symbol_318;
					try {
						
						Value A_symbol_319 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_320 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_319, P_TypedElement_type);
						
						DomainType static_A_symbol_321 = valueFactory.typeOf(A_symbol_320);
						LibraryBinaryOperation dynamic_A_symbol_321 = (LibraryBinaryOperation)static_A_symbol_321.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_321 = dynamic_A_symbol_321.evaluate(evaluator, T_Boolean, A_symbol_320, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_318 = A_symbol_321;
					} catch (InvalidValueException e) {
						leftA_symbol_318 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_321 = leftA_symbol_318;
					Value rightA_symbol_318;
					try {
						
						Value A_symbol_322 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_323 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_322, P_TypedElement_type);
						
						DomainType static_A_symbol_324 = valueFactory.typeOf(A_symbol_323);
						LibraryBinaryOperation dynamic_A_symbol_324 = (LibraryBinaryOperation)static_A_symbol_324.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_324 = dynamic_A_symbol_324.evaluate(evaluator, T_Boolean, A_symbol_323, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
						rightA_symbol_318 = A_symbol_324;
					} catch (InvalidValueException e) {
						rightA_symbol_318 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_324 = rightA_symbol_318;
					DomainType static_A_symbol_318 = valueFactory.typeOf(A_symbol_321);
					LibraryBinaryOperation dynamic_A_symbol_318 = (LibraryBinaryOperation)static_A_symbol_318.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_318 = dynamic_A_symbol_318.evaluate(evaluator, T_Boolean, A_symbol_321, A_symbol_324);
				Value A_symbol_325;
				if (A_symbol_318.isTrue()) {
					
					Value A_symbol_326 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_327 = valueFactory.typeOf(A_symbol_326);
					LibraryBinaryOperation dynamic_A_symbol_327 = (LibraryBinaryOperation)static_A_symbol_327.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_327 = dynamic_A_symbol_327.evaluate(evaluator, T_Boolean, A_symbol_326, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_325 = A_symbol_327;
				}
				else if (A_symbol_318.isFalse()) {
					
					Value A_symbol_328 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_329 = valueFactory.typeOf(A_symbol_328);
					LibraryBinaryOperation dynamic_A_symbol_329 = (LibraryBinaryOperation)static_A_symbol_329.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_329 = dynamic_A_symbol_329.evaluate(evaluator, T_Boolean, A_symbol_328, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_325 = A_symbol_329;
				}
				else if (A_symbol_318.isNull()) {
					A_symbol_325 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_325 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_315 = A_symbol_325;
			} catch (InvalidValueException e) {
				rightA_symbol_315 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_325 = rightA_symbol_315;
			DomainType static_A_symbol_315 = valueFactory.typeOf(A_symbol_317);
			LibraryBinaryOperation dynamic_A_symbol_315 = (LibraryBinaryOperation)static_A_symbol_315.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_315 = dynamic_A_symbol_315.evaluate(evaluator, T_Boolean, A_symbol_317, A_symbol_325);
			return A_symbol_315;
		}
	}
}

