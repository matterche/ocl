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
			
			Value leftA_symbol_100;
			try {
				
				Value A_symbol_101 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_102 = valueFactory.typeOf(A_symbol_101, S_any);
				LibraryBinaryOperation dynamic_A_symbol_102 = (LibraryBinaryOperation)static_A_symbol_102.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_102 = dynamic_A_symbol_102.evaluate(evaluator, T_Boolean, A_symbol_101, S_any);
				leftA_symbol_100 = A_symbol_102;
			} catch (InvalidValueException e) {
				leftA_symbol_100 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_102 = leftA_symbol_100;
			Value rightA_symbol_100;
			try {
				
				Value A_symbol_103 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_104 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_103, P_TypedElement_type);
				
				DomainType static_A_symbol_105 = valueFactory.typeOf(A_symbol_104, S_Boolean);
				LibraryBinaryOperation dynamic_A_symbol_105 = (LibraryBinaryOperation)static_A_symbol_105.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_105 = dynamic_A_symbol_105.evaluate(evaluator, T_Boolean, A_symbol_104, S_Boolean);
				rightA_symbol_100 = A_symbol_105;
			} catch (InvalidValueException e) {
				rightA_symbol_100 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_105 = rightA_symbol_100;
			DomainType static_A_symbol_100 = valueFactory.typeOf(A_symbol_102);
			LibraryBinaryOperation dynamic_A_symbol_100 = (LibraryBinaryOperation)static_A_symbol_100.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_100 = dynamic_A_symbol_100.evaluate(evaluator, T_Boolean, A_symbol_102, A_symbol_105);
			return A_symbol_100;
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
			
			Value leftA_symbol_106;
			try {
				
				Value A_symbol_107 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_108 = valueFactory.typeOf(A_symbol_107, S_any);
				LibraryBinaryOperation dynamic_A_symbol_108 = (LibraryBinaryOperation)static_A_symbol_108.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_108 = dynamic_A_symbol_108.evaluate(evaluator, T_Boolean, A_symbol_107, S_any);
				leftA_symbol_106 = A_symbol_108;
			} catch (InvalidValueException e) {
				leftA_symbol_106 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_108 = leftA_symbol_106;
			Value rightA_symbol_106;
			try {
				
				Value A_symbol_109 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_110 = valueFactory.typeOf(A_symbol_109);
				LibraryUnaryOperation dynamic_A_symbol_110 = (LibraryUnaryOperation)static_A_symbol_110.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_110 = dynamic_A_symbol_110.evaluate(evaluator, T_Integer, A_symbol_109);
				DomainType static_A_symbol_111 = valueFactory.typeOf(A_symbol_110, I_1);
				LibraryBinaryOperation dynamic_A_symbol_111 = (LibraryBinaryOperation)static_A_symbol_111.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_111 = dynamic_A_symbol_111.evaluate(evaluator, T_Boolean, A_symbol_110, I_1);
				rightA_symbol_106 = A_symbol_111;
			} catch (InvalidValueException e) {
				rightA_symbol_106 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_111 = rightA_symbol_106;
			DomainType static_A_symbol_106 = valueFactory.typeOf(A_symbol_108);
			LibraryBinaryOperation dynamic_A_symbol_106 = (LibraryBinaryOperation)static_A_symbol_106.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_106 = dynamic_A_symbol_106.evaluate(evaluator, T_Boolean, A_symbol_108, A_symbol_111);
			return A_symbol_106;
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
			
			Value leftA_symbol_112;
			try {
				
				Value A_symbol_113 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_114 = valueFactory.typeOf(A_symbol_113, S_any);
				LibraryBinaryOperation dynamic_A_symbol_114 = (LibraryBinaryOperation)static_A_symbol_114.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_114 = dynamic_A_symbol_114.evaluate(evaluator, T_Boolean, A_symbol_113, S_any);
				leftA_symbol_112 = A_symbol_114;
			} catch (InvalidValueException e) {
				leftA_symbol_112 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_114 = leftA_symbol_112;
			Value rightA_symbol_112;
			try {
				
				Value A_symbol_115 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_116 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_117 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_116, P_TypedElement_type);
				
				DomainType static_A_symbol_118 = valueFactory.typeOf(A_symbol_117);
				LibraryBinaryOperation dynamic_A_symbol_118 = (LibraryBinaryOperation)static_A_symbol_118.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_118 = dynamic_A_symbol_118.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_117, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_119 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_118, P_CollectionType_elementType);
				
				DomainType static_A_symbol_120 = valueFactory.typeOf(A_symbol_115, A_symbol_119);
				LibraryBinaryOperation dynamic_A_symbol_120 = (LibraryBinaryOperation)static_A_symbol_120.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_120 = dynamic_A_symbol_120.evaluate(evaluator, T_Boolean, A_symbol_115, A_symbol_119);
				rightA_symbol_112 = A_symbol_120;
			} catch (InvalidValueException e) {
				rightA_symbol_112 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_120 = rightA_symbol_112;
			DomainType static_A_symbol_112 = valueFactory.typeOf(A_symbol_114);
			LibraryBinaryOperation dynamic_A_symbol_112 = (LibraryBinaryOperation)static_A_symbol_112.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_112 = dynamic_A_symbol_112.evaluate(evaluator, T_Boolean, A_symbol_114, A_symbol_120);
			return A_symbol_112;
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
			
			Value leftA_symbol_121;
			try {
				
				Value A_symbol_122 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_123 = valueFactory.typeOf(A_symbol_122, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_123 = (LibraryBinaryOperation)static_A_symbol_123.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_123 = dynamic_A_symbol_123.evaluate(evaluator, T_Boolean, A_symbol_122, S_closure);
				leftA_symbol_121 = A_symbol_123;
			} catch (InvalidValueException e) {
				leftA_symbol_121 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_123 = leftA_symbol_121;
			Value rightA_symbol_121;
			try {
				
				Value A_symbol_124 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_125 = valueFactory.typeOf(A_symbol_124);
				LibraryBinaryOperation dynamic_A_symbol_125 = (LibraryBinaryOperation)static_A_symbol_125.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_125 = dynamic_A_symbol_125.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_124, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_126 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_125, P_CollectionType_elementType);
				
				
				Value A_symbol_127 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_128 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_127, P_TypedElement_type);
				
				DomainType static_A_symbol_129 = valueFactory.typeOf(A_symbol_128);
				LibraryBinaryOperation dynamic_A_symbol_129 = (LibraryBinaryOperation)static_A_symbol_129.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_129 = dynamic_A_symbol_129.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_128, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_130 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_129, P_CollectionType_elementType);
				
				DomainType static_A_symbol_131 = valueFactory.typeOf(A_symbol_126, A_symbol_130);
				LibraryBinaryOperation dynamic_A_symbol_131 = (LibraryBinaryOperation)static_A_symbol_131.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_131 = dynamic_A_symbol_131.evaluate(evaluator, T_Boolean, A_symbol_126, A_symbol_130);
				rightA_symbol_121 = A_symbol_131;
			} catch (InvalidValueException e) {
				rightA_symbol_121 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_131 = rightA_symbol_121;
			DomainType static_A_symbol_121 = valueFactory.typeOf(A_symbol_123);
			LibraryBinaryOperation dynamic_A_symbol_121 = (LibraryBinaryOperation)static_A_symbol_121.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_121 = dynamic_A_symbol_121.evaluate(evaluator, T_Boolean, A_symbol_123, A_symbol_131);
			return A_symbol_121;
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
			
			Value leftA_symbol_132;
			try {
				
				Value A_symbol_133 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_134 = valueFactory.typeOf(A_symbol_133, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_134 = (LibraryBinaryOperation)static_A_symbol_134.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_134 = dynamic_A_symbol_134.evaluate(evaluator, T_Boolean, A_symbol_133, S_closure);
				leftA_symbol_132 = A_symbol_134;
			} catch (InvalidValueException e) {
				leftA_symbol_132 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_134 = leftA_symbol_132;
			Value rightA_symbol_132;
			try {
				
				Value A_symbol_135 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_136 = valueFactory.typeOf(A_symbol_135);
				LibraryUnaryOperation dynamic_A_symbol_136 = (LibraryUnaryOperation)static_A_symbol_136.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_136 = dynamic_A_symbol_136.evaluate(evaluator, T_Integer, A_symbol_135);
				DomainType static_A_symbol_137 = valueFactory.typeOf(A_symbol_136, I_1);
				LibraryBinaryOperation dynamic_A_symbol_137 = (LibraryBinaryOperation)static_A_symbol_137.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_137 = dynamic_A_symbol_137.evaluate(evaluator, T_Boolean, A_symbol_136, I_1);
				rightA_symbol_132 = A_symbol_137;
			} catch (InvalidValueException e) {
				rightA_symbol_132 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_137 = rightA_symbol_132;
			DomainType static_A_symbol_132 = valueFactory.typeOf(A_symbol_134);
			LibraryBinaryOperation dynamic_A_symbol_132 = (LibraryBinaryOperation)static_A_symbol_132.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_132 = dynamic_A_symbol_132.evaluate(evaluator, T_Boolean, A_symbol_134, A_symbol_137);
			return A_symbol_132;
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
			
			Value leftA_symbol_138;
			try {
				
				Value A_symbol_139 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_140 = valueFactory.typeOf(A_symbol_139, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_140 = (LibraryBinaryOperation)static_A_symbol_140.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_140 = dynamic_A_symbol_140.evaluate(evaluator, T_Boolean, A_symbol_139, S_closure);
				leftA_symbol_138 = A_symbol_140;
			} catch (InvalidValueException e) {
				leftA_symbol_138 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_140 = leftA_symbol_138;
			Value rightA_symbol_138;
			try {
				
				Value A_symbol_141 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_142 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_141, P_TypedElement_type);
				
				DomainType static_A_symbol_143 = valueFactory.typeOf(A_symbol_142);
				LibraryBinaryOperation dynamic_A_symbol_143 = (LibraryBinaryOperation)static_A_symbol_143.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_143 = dynamic_A_symbol_143.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_142, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_144 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_143, P_CollectionType_elementType);
				
					
					Value A_symbol_145 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_146 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_145, P_TypedElement_type);
					
					DomainType static_A_symbol_147 = valueFactory.typeOf(A_symbol_146);
					LibraryBinaryOperation dynamic_A_symbol_147 = (LibraryBinaryOperation)static_A_symbol_147.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_147 = dynamic_A_symbol_147.evaluate(evaluator, T_Boolean, A_symbol_146, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_148;
				if (A_symbol_147.isTrue()) {
					
					Value A_symbol_149 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_150 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_149, P_TypedElement_type);
					
					DomainType static_A_symbol_151 = valueFactory.typeOf(A_symbol_150);
					LibraryBinaryOperation dynamic_A_symbol_151 = (LibraryBinaryOperation)static_A_symbol_151.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_151 = dynamic_A_symbol_151.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_150, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_152 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_151, P_CollectionType_elementType);
					
					A_symbol_148 = A_symbol_152;
				}
				else if (A_symbol_147.isFalse()) {
					
					Value A_symbol_153 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_154 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_153, P_TypedElement_type);
					
					A_symbol_148 = A_symbol_154;
				}
				else if (A_symbol_147.isNull()) {
					A_symbol_148 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_148 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				DomainType static_A_symbol_155 = valueFactory.typeOf(A_symbol_144, A_symbol_148);
				LibraryBinaryOperation dynamic_A_symbol_155 = (LibraryBinaryOperation)static_A_symbol_155.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_155 = dynamic_A_symbol_155.evaluate(evaluator, T_Boolean, A_symbol_144, A_symbol_148);
				rightA_symbol_138 = A_symbol_155;
			} catch (InvalidValueException e) {
				rightA_symbol_138 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_155 = rightA_symbol_138;
			DomainType static_A_symbol_138 = valueFactory.typeOf(A_symbol_140);
			LibraryBinaryOperation dynamic_A_symbol_138 = (LibraryBinaryOperation)static_A_symbol_138.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_138 = dynamic_A_symbol_138.evaluate(evaluator, T_Boolean, A_symbol_140, A_symbol_155);
			return A_symbol_138;
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
			
			Value leftA_symbol_156;
			try {
				
				Value A_symbol_157 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_158 = valueFactory.typeOf(A_symbol_157, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_158 = (LibraryBinaryOperation)static_A_symbol_158.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_158 = dynamic_A_symbol_158.evaluate(evaluator, T_Boolean, A_symbol_157, S_closure);
				leftA_symbol_156 = A_symbol_158;
			} catch (InvalidValueException e) {
				leftA_symbol_156 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_158 = leftA_symbol_156;
			Value rightA_symbol_156;
			try {
					Value leftA_symbol_159;
					try {
						
						Value A_symbol_160 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_161 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_160, P_TypedElement_type);
						
						DomainType static_A_symbol_162 = valueFactory.typeOf(A_symbol_161);
						LibraryBinaryOperation dynamic_A_symbol_162 = (LibraryBinaryOperation)static_A_symbol_162.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_162 = dynamic_A_symbol_162.evaluate(evaluator, T_Boolean, A_symbol_161, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_159 = A_symbol_162;
					} catch (InvalidValueException e) {
						leftA_symbol_159 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_162 = leftA_symbol_159;
					Value rightA_symbol_159;
					try {
						
						Value A_symbol_163 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_164 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_163, P_TypedElement_type);
						
						DomainType static_A_symbol_165 = valueFactory.typeOf(A_symbol_164);
						LibraryBinaryOperation dynamic_A_symbol_165 = (LibraryBinaryOperation)static_A_symbol_165.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_165 = dynamic_A_symbol_165.evaluate(evaluator, T_Boolean, A_symbol_164, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_159 = A_symbol_165;
					} catch (InvalidValueException e) {
						rightA_symbol_159 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_165 = rightA_symbol_159;
					DomainType static_A_symbol_159 = valueFactory.typeOf(A_symbol_162);
					LibraryBinaryOperation dynamic_A_symbol_159 = (LibraryBinaryOperation)static_A_symbol_159.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_159 = dynamic_A_symbol_159.evaluate(evaluator, T_Boolean, A_symbol_162, A_symbol_165);
				Value A_symbol_166;
				if (A_symbol_159.isTrue()) {
					
					Value A_symbol_167 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_168 = valueFactory.typeOf(A_symbol_167);
					LibraryBinaryOperation dynamic_A_symbol_168 = (LibraryBinaryOperation)static_A_symbol_168.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_168 = dynamic_A_symbol_168.evaluate(evaluator, T_Boolean, A_symbol_167, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_166 = A_symbol_168;
				}
				else if (A_symbol_159.isFalse()) {
					
					Value A_symbol_169 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_170 = valueFactory.typeOf(A_symbol_169);
					LibraryBinaryOperation dynamic_A_symbol_170 = (LibraryBinaryOperation)static_A_symbol_170.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_170 = dynamic_A_symbol_170.evaluate(evaluator, T_Boolean, A_symbol_169, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
					A_symbol_166 = A_symbol_170;
				}
				else if (A_symbol_159.isNull()) {
					A_symbol_166 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_166 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_156 = A_symbol_166;
			} catch (InvalidValueException e) {
				rightA_symbol_156 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_166 = rightA_symbol_156;
			DomainType static_A_symbol_156 = valueFactory.typeOf(A_symbol_158);
			LibraryBinaryOperation dynamic_A_symbol_156 = (LibraryBinaryOperation)static_A_symbol_156.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_156 = dynamic_A_symbol_156.evaluate(evaluator, T_Boolean, A_symbol_158, A_symbol_166);
			return A_symbol_156;
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
			
			Value leftA_symbol_171;
			try {
				
				Value A_symbol_172 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_173 = valueFactory.typeOf(A_symbol_172, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_173 = (LibraryBinaryOperation)static_A_symbol_173.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_173 = dynamic_A_symbol_173.evaluate(evaluator, T_Boolean, A_symbol_172, S_collect);
				leftA_symbol_171 = A_symbol_173;
			} catch (InvalidValueException e) {
				leftA_symbol_171 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_173 = leftA_symbol_171;
			Value rightA_symbol_171;
			try {
				
				Value A_symbol_174 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_175 = valueFactory.typeOf(A_symbol_174);
				LibraryBinaryOperation dynamic_A_symbol_175 = (LibraryBinaryOperation)static_A_symbol_175.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_175 = dynamic_A_symbol_175.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_174, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_176 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_175, P_CollectionType_elementType);
				
				
				Value A_symbol_177 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_178 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_177, P_TypedElement_type);
				
				DomainType static_A_symbol_179 = valueFactory.typeOf(A_symbol_178);
				LibraryBinaryOperation dynamic_A_symbol_179 = (LibraryBinaryOperation)static_A_symbol_179.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_179 = dynamic_A_symbol_179.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_178, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_180 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_179, P_CollectionType_elementType);
				
				DomainType static_A_symbol_181 = valueFactory.typeOf(A_symbol_176, A_symbol_180);
				LibraryBinaryOperation dynamic_A_symbol_181 = (LibraryBinaryOperation)static_A_symbol_181.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_181 = dynamic_A_symbol_181.evaluate(evaluator, T_Boolean, A_symbol_176, A_symbol_180);
				rightA_symbol_171 = A_symbol_181;
			} catch (InvalidValueException e) {
				rightA_symbol_171 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_181 = rightA_symbol_171;
			DomainType static_A_symbol_171 = valueFactory.typeOf(A_symbol_173);
			LibraryBinaryOperation dynamic_A_symbol_171 = (LibraryBinaryOperation)static_A_symbol_171.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_171 = dynamic_A_symbol_171.evaluate(evaluator, T_Boolean, A_symbol_173, A_symbol_181);
			return A_symbol_171;
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
			
			Value leftA_symbol_182;
			try {
				
				Value A_symbol_183 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_184 = valueFactory.typeOf(A_symbol_183, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_184 = (LibraryBinaryOperation)static_A_symbol_184.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_184 = dynamic_A_symbol_184.evaluate(evaluator, T_Boolean, A_symbol_183, S_collect);
				leftA_symbol_182 = A_symbol_184;
			} catch (InvalidValueException e) {
				leftA_symbol_182 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_184 = leftA_symbol_182;
			Value rightA_symbol_182;
			try {
				
				Value A_symbol_185 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_186 = valueFactory.typeOf(A_symbol_185);
				LibraryUnaryOperation dynamic_A_symbol_186 = (LibraryUnaryOperation)static_A_symbol_186.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_186 = dynamic_A_symbol_186.evaluate(evaluator, T_Integer, A_symbol_185);
				DomainType static_A_symbol_187 = valueFactory.typeOf(A_symbol_186, I_1);
				LibraryBinaryOperation dynamic_A_symbol_187 = (LibraryBinaryOperation)static_A_symbol_187.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_187 = dynamic_A_symbol_187.evaluate(evaluator, T_Boolean, A_symbol_186, I_1);
				rightA_symbol_182 = A_symbol_187;
			} catch (InvalidValueException e) {
				rightA_symbol_182 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_187 = rightA_symbol_182;
			DomainType static_A_symbol_182 = valueFactory.typeOf(A_symbol_184);
			LibraryBinaryOperation dynamic_A_symbol_182 = (LibraryBinaryOperation)static_A_symbol_182.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_182 = dynamic_A_symbol_182.evaluate(evaluator, T_Boolean, A_symbol_184, A_symbol_187);
			return A_symbol_182;
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
			
			Value leftA_symbol_188;
			try {
				
				Value A_symbol_189 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_190 = valueFactory.typeOf(A_symbol_189, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_190 = (LibraryBinaryOperation)static_A_symbol_190.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_190 = dynamic_A_symbol_190.evaluate(evaluator, T_Boolean, A_symbol_189, S_collectN___);
				leftA_symbol_188 = A_symbol_190;
			} catch (InvalidValueException e) {
				leftA_symbol_188 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_190 = leftA_symbol_188;
			Value rightA_symbol_188;
			try {
				
				Value A_symbol_191 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_192 = valueFactory.typeOf(A_symbol_191);
				LibraryUnaryOperation dynamic_A_symbol_192 = (LibraryUnaryOperation)static_A_symbol_192.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_192 = dynamic_A_symbol_192.evaluate(evaluator, T_Integer, A_symbol_191);
				DomainType static_A_symbol_193 = valueFactory.typeOf(A_symbol_192, I_1);
				LibraryBinaryOperation dynamic_A_symbol_193 = (LibraryBinaryOperation)static_A_symbol_193.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_193 = dynamic_A_symbol_193.evaluate(evaluator, T_Boolean, A_symbol_192, I_1);
				rightA_symbol_188 = A_symbol_193;
			} catch (InvalidValueException e) {
				rightA_symbol_188 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_193 = rightA_symbol_188;
			DomainType static_A_symbol_188 = valueFactory.typeOf(A_symbol_190);
			LibraryBinaryOperation dynamic_A_symbol_188 = (LibraryBinaryOperation)static_A_symbol_188.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_188 = dynamic_A_symbol_188.evaluate(evaluator, T_Boolean, A_symbol_190, A_symbol_193);
			return A_symbol_188;
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
			
			Value leftA_symbol_194;
			try {
				
				Value A_symbol_195 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_196 = valueFactory.typeOf(A_symbol_195, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_196 = (LibraryBinaryOperation)static_A_symbol_196.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_196 = dynamic_A_symbol_196.evaluate(evaluator, T_Boolean, A_symbol_195, S_collectN___);
				leftA_symbol_194 = A_symbol_196;
			} catch (InvalidValueException e) {
				leftA_symbol_194 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_196 = leftA_symbol_194;
			Value rightA_symbol_194;
			try {
				
				Value A_symbol_197 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_198 = valueFactory.typeOf(A_symbol_197);
				LibraryBinaryOperation dynamic_A_symbol_198 = (LibraryBinaryOperation)static_A_symbol_198.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_198 = dynamic_A_symbol_198.evaluate(evaluator, T_Boolean, A_symbol_197, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
				rightA_symbol_194 = A_symbol_198;
			} catch (InvalidValueException e) {
				rightA_symbol_194 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_198 = rightA_symbol_194;
			DomainType static_A_symbol_194 = valueFactory.typeOf(A_symbol_196);
			LibraryBinaryOperation dynamic_A_symbol_194 = (LibraryBinaryOperation)static_A_symbol_194.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_194 = dynamic_A_symbol_194.evaluate(evaluator, T_Boolean, A_symbol_196, A_symbol_198);
			return A_symbol_194;
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
			
			Value leftA_symbol_199;
			try {
				
				Value A_symbol_200 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_201 = valueFactory.typeOf(A_symbol_200, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_201 = (LibraryBinaryOperation)static_A_symbol_201.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_201 = dynamic_A_symbol_201.evaluate(evaluator, T_Boolean, A_symbol_200, S_collectN___);
				leftA_symbol_199 = A_symbol_201;
			} catch (InvalidValueException e) {
				leftA_symbol_199 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_201 = leftA_symbol_199;
			Value rightA_symbol_199;
			try {
				
				Value A_symbol_202 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_203 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_204 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_203, P_TypedElement_type);
				
				DomainType static_A_symbol_205 = valueFactory.typeOf(A_symbol_202, A_symbol_204);
				LibraryBinaryOperation dynamic_A_symbol_205 = (LibraryBinaryOperation)static_A_symbol_205.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_205 = dynamic_A_symbol_205.evaluate(evaluator, T_Boolean, A_symbol_202, A_symbol_204);
				rightA_symbol_199 = A_symbol_205;
			} catch (InvalidValueException e) {
				rightA_symbol_199 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_205 = rightA_symbol_199;
			DomainType static_A_symbol_199 = valueFactory.typeOf(A_symbol_201);
			LibraryBinaryOperation dynamic_A_symbol_199 = (LibraryBinaryOperation)static_A_symbol_199.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_199 = dynamic_A_symbol_199.evaluate(evaluator, T_Boolean, A_symbol_201, A_symbol_205);
			return A_symbol_199;
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
			
			Value leftA_symbol_206;
			try {
				
				Value A_symbol_207 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_208 = valueFactory.typeOf(A_symbol_207, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_208 = (LibraryBinaryOperation)static_A_symbol_208.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_208 = dynamic_A_symbol_208.evaluate(evaluator, T_Boolean, A_symbol_207, S_collect);
				leftA_symbol_206 = A_symbol_208;
			} catch (InvalidValueException e) {
				leftA_symbol_206 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_208 = leftA_symbol_206;
			Value rightA_symbol_206;
			try {
					Value leftA_symbol_209;
					try {
						
						Value A_symbol_210 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_211 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_210, P_TypedElement_type);
						
						DomainType static_A_symbol_212 = valueFactory.typeOf(A_symbol_211);
						LibraryBinaryOperation dynamic_A_symbol_212 = (LibraryBinaryOperation)static_A_symbol_212.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_212 = dynamic_A_symbol_212.evaluate(evaluator, T_Boolean, A_symbol_211, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_209 = A_symbol_212;
					} catch (InvalidValueException e) {
						leftA_symbol_209 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_212 = leftA_symbol_209;
					Value rightA_symbol_209;
					try {
						
						Value A_symbol_213 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_214 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_213, P_TypedElement_type);
						
						DomainType static_A_symbol_215 = valueFactory.typeOf(A_symbol_214);
						LibraryBinaryOperation dynamic_A_symbol_215 = (LibraryBinaryOperation)static_A_symbol_215.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_215 = dynamic_A_symbol_215.evaluate(evaluator, T_Boolean, A_symbol_214, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_209 = A_symbol_215;
					} catch (InvalidValueException e) {
						rightA_symbol_209 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_215 = rightA_symbol_209;
					DomainType static_A_symbol_209 = valueFactory.typeOf(A_symbol_212);
					LibraryBinaryOperation dynamic_A_symbol_209 = (LibraryBinaryOperation)static_A_symbol_209.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_209 = dynamic_A_symbol_209.evaluate(evaluator, T_Boolean, A_symbol_212, A_symbol_215);
				Value A_symbol_216;
				if (A_symbol_209.isTrue()) {
					
					Value A_symbol_217 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_218 = valueFactory.typeOf(A_symbol_217);
					LibraryBinaryOperation dynamic_A_symbol_218 = (LibraryBinaryOperation)static_A_symbol_218.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_218 = dynamic_A_symbol_218.evaluate(evaluator, T_Boolean, A_symbol_217, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_216 = A_symbol_218;
				}
				else if (A_symbol_209.isFalse()) {
					
					Value A_symbol_219 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_220 = valueFactory.typeOf(A_symbol_219);
					LibraryBinaryOperation dynamic_A_symbol_220 = (LibraryBinaryOperation)static_A_symbol_220.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_220 = dynamic_A_symbol_220.evaluate(evaluator, T_Boolean, A_symbol_219, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
					A_symbol_216 = A_symbol_220;
				}
				else if (A_symbol_209.isNull()) {
					A_symbol_216 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_216 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_206 = A_symbol_216;
			} catch (InvalidValueException e) {
				rightA_symbol_206 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_216 = rightA_symbol_206;
			DomainType static_A_symbol_206 = valueFactory.typeOf(A_symbol_208);
			LibraryBinaryOperation dynamic_A_symbol_206 = (LibraryBinaryOperation)static_A_symbol_206.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_206 = dynamic_A_symbol_206.evaluate(evaluator, T_Boolean, A_symbol_208, A_symbol_216);
			return A_symbol_206;
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
			
			Value leftA_symbol_221;
			try {
				
				Value A_symbol_222 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_223 = valueFactory.typeOf(A_symbol_222, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_223 = (LibraryBinaryOperation)static_A_symbol_223.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_223 = dynamic_A_symbol_223.evaluate(evaluator, T_Boolean, A_symbol_222, S_exists);
				leftA_symbol_221 = A_symbol_223;
			} catch (InvalidValueException e) {
				leftA_symbol_221 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_223 = leftA_symbol_221;
			Value rightA_symbol_221;
			try {
				
				Value A_symbol_224 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_225 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_224, P_TypedElement_type);
				
				DomainType static_A_symbol_226 = valueFactory.typeOf(A_symbol_225, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_226 = (LibraryBinaryOperation)static_A_symbol_226.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_226 = dynamic_A_symbol_226.evaluate(evaluator, T_Boolean, A_symbol_225, T_ClassClassifier_Boolean_);
				rightA_symbol_221 = A_symbol_226;
			} catch (InvalidValueException e) {
				rightA_symbol_221 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_226 = rightA_symbol_221;
			DomainType static_A_symbol_221 = valueFactory.typeOf(A_symbol_223);
			LibraryBinaryOperation dynamic_A_symbol_221 = (LibraryBinaryOperation)static_A_symbol_221.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_221 = dynamic_A_symbol_221.evaluate(evaluator, T_Boolean, A_symbol_223, A_symbol_226);
			return A_symbol_221;
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
			
			Value leftA_symbol_227;
			try {
				
				Value A_symbol_228 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_229 = valueFactory.typeOf(A_symbol_228, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_229 = (LibraryBinaryOperation)static_A_symbol_229.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_229 = dynamic_A_symbol_229.evaluate(evaluator, T_Boolean, A_symbol_228, S_exists);
				leftA_symbol_227 = A_symbol_229;
			} catch (InvalidValueException e) {
				leftA_symbol_227 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_229 = leftA_symbol_227;
			Value rightA_symbol_227;
			try {
				
				Value A_symbol_230 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_231 = valueFactory.typeOf(A_symbol_230, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_231 = (LibraryBinaryOperation)static_A_symbol_231.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_231 = dynamic_A_symbol_231.evaluate(evaluator, T_Boolean, A_symbol_230, T_ClassClassifier_Boolean_);
				rightA_symbol_227 = A_symbol_231;
			} catch (InvalidValueException e) {
				rightA_symbol_227 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_231 = rightA_symbol_227;
			DomainType static_A_symbol_227 = valueFactory.typeOf(A_symbol_229);
			LibraryBinaryOperation dynamic_A_symbol_227 = (LibraryBinaryOperation)static_A_symbol_227.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_227 = dynamic_A_symbol_227.evaluate(evaluator, T_Boolean, A_symbol_229, A_symbol_231);
			return A_symbol_227;
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
			
			Value leftA_symbol_232;
			try {
				
				Value A_symbol_233 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_234 = valueFactory.typeOf(A_symbol_233, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_234 = (LibraryBinaryOperation)static_A_symbol_234.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_234 = dynamic_A_symbol_234.evaluate(evaluator, T_Boolean, A_symbol_233, S_forAll);
				leftA_symbol_232 = A_symbol_234;
			} catch (InvalidValueException e) {
				leftA_symbol_232 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_234 = leftA_symbol_232;
			Value rightA_symbol_232;
			try {
				
				Value A_symbol_235 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_236 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_235, P_TypedElement_type);
				
				DomainType static_A_symbol_237 = valueFactory.typeOf(A_symbol_236, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_237 = (LibraryBinaryOperation)static_A_symbol_237.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_237 = dynamic_A_symbol_237.evaluate(evaluator, T_Boolean, A_symbol_236, T_ClassClassifier_Boolean_);
				rightA_symbol_232 = A_symbol_237;
			} catch (InvalidValueException e) {
				rightA_symbol_232 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_237 = rightA_symbol_232;
			DomainType static_A_symbol_232 = valueFactory.typeOf(A_symbol_234);
			LibraryBinaryOperation dynamic_A_symbol_232 = (LibraryBinaryOperation)static_A_symbol_232.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_232 = dynamic_A_symbol_232.evaluate(evaluator, T_Boolean, A_symbol_234, A_symbol_237);
			return A_symbol_232;
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
			
			Value leftA_symbol_238;
			try {
				
				Value A_symbol_239 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_240 = valueFactory.typeOf(A_symbol_239, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_240 = (LibraryBinaryOperation)static_A_symbol_240.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_240 = dynamic_A_symbol_240.evaluate(evaluator, T_Boolean, A_symbol_239, S_forAll);
				leftA_symbol_238 = A_symbol_240;
			} catch (InvalidValueException e) {
				leftA_symbol_238 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_240 = leftA_symbol_238;
			Value rightA_symbol_238;
			try {
				
				Value A_symbol_241 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_242 = valueFactory.typeOf(A_symbol_241, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_242 = (LibraryBinaryOperation)static_A_symbol_242.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_242 = dynamic_A_symbol_242.evaluate(evaluator, T_Boolean, A_symbol_241, T_ClassClassifier_Boolean_);
				rightA_symbol_238 = A_symbol_242;
			} catch (InvalidValueException e) {
				rightA_symbol_238 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_242 = rightA_symbol_238;
			DomainType static_A_symbol_238 = valueFactory.typeOf(A_symbol_240);
			LibraryBinaryOperation dynamic_A_symbol_238 = (LibraryBinaryOperation)static_A_symbol_238.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_238 = dynamic_A_symbol_238.evaluate(evaluator, T_Boolean, A_symbol_240, A_symbol_242);
			return A_symbol_238;
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
			
			Value leftA_symbol_243;
			try {
				
				Value A_symbol_244 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_245 = valueFactory.typeOf(A_symbol_244, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_245 = (LibraryBinaryOperation)static_A_symbol_245.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_245 = dynamic_A_symbol_245.evaluate(evaluator, T_Boolean, A_symbol_244, S_isUnique);
				leftA_symbol_243 = A_symbol_245;
			} catch (InvalidValueException e) {
				leftA_symbol_243 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_245 = leftA_symbol_243;
			Value rightA_symbol_243;
			try {
				
				Value A_symbol_246 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_247 = valueFactory.typeOf(A_symbol_246);
				LibraryUnaryOperation dynamic_A_symbol_247 = (LibraryUnaryOperation)static_A_symbol_247.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_247 = dynamic_A_symbol_247.evaluate(evaluator, T_Integer, A_symbol_246);
				DomainType static_A_symbol_248 = valueFactory.typeOf(A_symbol_247, I_1);
				LibraryBinaryOperation dynamic_A_symbol_248 = (LibraryBinaryOperation)static_A_symbol_248.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_248 = dynamic_A_symbol_248.evaluate(evaluator, T_Boolean, A_symbol_247, I_1);
				rightA_symbol_243 = A_symbol_248;
			} catch (InvalidValueException e) {
				rightA_symbol_243 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_248 = rightA_symbol_243;
			DomainType static_A_symbol_243 = valueFactory.typeOf(A_symbol_245);
			LibraryBinaryOperation dynamic_A_symbol_243 = (LibraryBinaryOperation)static_A_symbol_243.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_243 = dynamic_A_symbol_243.evaluate(evaluator, T_Boolean, A_symbol_245, A_symbol_248);
			return A_symbol_243;
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
			
			Value leftA_symbol_249;
			try {
				
				Value A_symbol_250 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_251 = valueFactory.typeOf(A_symbol_250, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_251 = (LibraryBinaryOperation)static_A_symbol_251.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_251 = dynamic_A_symbol_251.evaluate(evaluator, T_Boolean, A_symbol_250, S_isUnique);
				leftA_symbol_249 = A_symbol_251;
			} catch (InvalidValueException e) {
				leftA_symbol_249 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_251 = leftA_symbol_249;
			Value rightA_symbol_249;
			try {
				
				Value A_symbol_252 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_253 = valueFactory.typeOf(A_symbol_252, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_253 = (LibraryBinaryOperation)static_A_symbol_253.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_253 = dynamic_A_symbol_253.evaluate(evaluator, T_Boolean, A_symbol_252, T_ClassClassifier_Boolean_);
				rightA_symbol_249 = A_symbol_253;
			} catch (InvalidValueException e) {
				rightA_symbol_249 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_253 = rightA_symbol_249;
			DomainType static_A_symbol_249 = valueFactory.typeOf(A_symbol_251);
			LibraryBinaryOperation dynamic_A_symbol_249 = (LibraryBinaryOperation)static_A_symbol_249.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_249 = dynamic_A_symbol_249.evaluate(evaluator, T_Boolean, A_symbol_251, A_symbol_253);
			return A_symbol_249;
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
			final ExecutorOperation O_Collection_forAll = OCLstdlibTables.Operations._Collection__0_forAll;
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
			
			
			Value A_symbol_254 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_255 = new AbstractBinaryOperation()
			{
			/*
			type =
			source.type.oclAsType(_'file:/C:/GIT/org.eclipse.ocl/examples/org.eclipse.ocl.examples.pivot/model/Pivot.ecore'::ocl::CollectionType).elementType
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_256 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_1_, P_TypedElement_type);
					
					
					Value A_symbol_257 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
					
					Value A_symbol_258 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_257, P_TypedElement_type);
					
					DomainType static_A_symbol_259 = valueFactory.typeOf(A_symbol_258);
					LibraryBinaryOperation dynamic_A_symbol_259 = (LibraryBinaryOperation)static_A_symbol_259.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_259 = dynamic_A_symbol_259.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_258, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_260 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_259, P_CollectionType_elementType);
					
					DomainType static_A_symbol_261 = valueFactory.typeOf(A_symbol_256, A_symbol_260);
					LibraryBinaryOperation dynamic_A_symbol_261 = (LibraryBinaryOperation)static_A_symbol_261.lookupImplementation(standardLibrary, O_OclAny__eq_);
					Value A_symbol_261 = dynamic_A_symbol_261.evaluate(evaluator, T_Boolean, A_symbol_256, A_symbol_260);
					return A_symbol_261;
				}
			};
			DomainType static_A_symbol_255 = A_symbol_254.getType();
			LibraryIteration dynamic_A_symbol_255 = (LibraryIteration)static_A_symbol_255.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_255 = dynamic_A_symbol_255.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_255 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_255, (CollectionValue)A_symbol_254, acc_A_symbol_255);
			Value A_symbol_255 = dynamic_A_symbol_255.evaluateIteration(manager_A_symbol_255);
			return A_symbol_255;
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
			
			Value leftA_symbol_262;
			try {
				
				Value A_symbol_263 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_264 = valueFactory.typeOf(A_symbol_263, S_one);
				LibraryBinaryOperation dynamic_A_symbol_264 = (LibraryBinaryOperation)static_A_symbol_264.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_264 = dynamic_A_symbol_264.evaluate(evaluator, T_Boolean, A_symbol_263, S_one);
				leftA_symbol_262 = A_symbol_264;
			} catch (InvalidValueException e) {
				leftA_symbol_262 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_264 = leftA_symbol_262;
			Value rightA_symbol_262;
			try {
				
				Value A_symbol_265 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_266 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_265, P_TypedElement_type);
				
				DomainType static_A_symbol_267 = valueFactory.typeOf(A_symbol_266, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_267 = (LibraryBinaryOperation)static_A_symbol_267.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_267 = dynamic_A_symbol_267.evaluate(evaluator, T_Boolean, A_symbol_266, T_ClassClassifier_Boolean_);
				rightA_symbol_262 = A_symbol_267;
			} catch (InvalidValueException e) {
				rightA_symbol_262 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_267 = rightA_symbol_262;
			DomainType static_A_symbol_262 = valueFactory.typeOf(A_symbol_264);
			LibraryBinaryOperation dynamic_A_symbol_262 = (LibraryBinaryOperation)static_A_symbol_262.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_262 = dynamic_A_symbol_262.evaluate(evaluator, T_Boolean, A_symbol_264, A_symbol_267);
			return A_symbol_262;
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
			
			Value leftA_symbol_268;
			try {
				
				Value A_symbol_269 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_270 = valueFactory.typeOf(A_symbol_269, S_one);
				LibraryBinaryOperation dynamic_A_symbol_270 = (LibraryBinaryOperation)static_A_symbol_270.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_270 = dynamic_A_symbol_270.evaluate(evaluator, T_Boolean, A_symbol_269, S_one);
				leftA_symbol_268 = A_symbol_270;
			} catch (InvalidValueException e) {
				leftA_symbol_268 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_270 = leftA_symbol_268;
			Value rightA_symbol_268;
			try {
				
				Value A_symbol_271 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_272 = valueFactory.typeOf(A_symbol_271);
				LibraryUnaryOperation dynamic_A_symbol_272 = (LibraryUnaryOperation)static_A_symbol_272.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_272 = dynamic_A_symbol_272.evaluate(evaluator, T_Integer, A_symbol_271);
				DomainType static_A_symbol_273 = valueFactory.typeOf(A_symbol_272, I_1);
				LibraryBinaryOperation dynamic_A_symbol_273 = (LibraryBinaryOperation)static_A_symbol_273.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_273 = dynamic_A_symbol_273.evaluate(evaluator, T_Boolean, A_symbol_272, I_1);
				rightA_symbol_268 = A_symbol_273;
			} catch (InvalidValueException e) {
				rightA_symbol_268 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_273 = rightA_symbol_268;
			DomainType static_A_symbol_268 = valueFactory.typeOf(A_symbol_270);
			LibraryBinaryOperation dynamic_A_symbol_268 = (LibraryBinaryOperation)static_A_symbol_268.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_268 = dynamic_A_symbol_268.evaluate(evaluator, T_Boolean, A_symbol_270, A_symbol_273);
			return A_symbol_268;
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
			
			Value leftA_symbol_274;
			try {
				
				Value A_symbol_275 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_276 = valueFactory.typeOf(A_symbol_275, S_one);
				LibraryBinaryOperation dynamic_A_symbol_276 = (LibraryBinaryOperation)static_A_symbol_276.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_276 = dynamic_A_symbol_276.evaluate(evaluator, T_Boolean, A_symbol_275, S_one);
				leftA_symbol_274 = A_symbol_276;
			} catch (InvalidValueException e) {
				leftA_symbol_274 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_276 = leftA_symbol_274;
			Value rightA_symbol_274;
			try {
				
				Value A_symbol_277 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_278 = valueFactory.typeOf(A_symbol_277, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_278 = (LibraryBinaryOperation)static_A_symbol_278.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_278 = dynamic_A_symbol_278.evaluate(evaluator, T_Boolean, A_symbol_277, T_ClassClassifier_Boolean_);
				rightA_symbol_274 = A_symbol_278;
			} catch (InvalidValueException e) {
				rightA_symbol_274 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_278 = rightA_symbol_274;
			DomainType static_A_symbol_274 = valueFactory.typeOf(A_symbol_276);
			LibraryBinaryOperation dynamic_A_symbol_274 = (LibraryBinaryOperation)static_A_symbol_274.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_274 = dynamic_A_symbol_274.evaluate(evaluator, T_Boolean, A_symbol_276, A_symbol_278);
			return A_symbol_274;
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
			
			Value leftA_symbol_279;
			try {
				Value leftA_symbol_280;
				try {
					
					Value A_symbol_281 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_282 = valueFactory.typeOf(A_symbol_281, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_282 = (LibraryBinaryOperation)static_A_symbol_282.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_282 = dynamic_A_symbol_282.evaluate(evaluator, T_Boolean, A_symbol_281, S_reject);
					leftA_symbol_280 = A_symbol_282;
				} catch (InvalidValueException e) {
					leftA_symbol_280 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_282 = leftA_symbol_280;
				Value rightA_symbol_280;
				try {
					
					Value A_symbol_283 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_284 = valueFactory.typeOf(A_symbol_283, S_select);
					LibraryBinaryOperation dynamic_A_symbol_284 = (LibraryBinaryOperation)static_A_symbol_284.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_284 = dynamic_A_symbol_284.evaluate(evaluator, T_Boolean, A_symbol_283, S_select);
					rightA_symbol_280 = A_symbol_284;
				} catch (InvalidValueException e) {
					rightA_symbol_280 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_284 = rightA_symbol_280;
				DomainType static_A_symbol_280 = valueFactory.typeOf(A_symbol_282);
				LibraryBinaryOperation dynamic_A_symbol_280 = (LibraryBinaryOperation)static_A_symbol_280.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_280 = dynamic_A_symbol_280.evaluate(evaluator, T_Boolean, A_symbol_282, A_symbol_284);
				leftA_symbol_279 = A_symbol_280;
			} catch (InvalidValueException e) {
				leftA_symbol_279 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_280 = leftA_symbol_279;
			Value rightA_symbol_279;
			try {
				
				Value A_symbol_285 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_286 = valueFactory.typeOf(A_symbol_285);
				LibraryUnaryOperation dynamic_A_symbol_286 = (LibraryUnaryOperation)static_A_symbol_286.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_286 = dynamic_A_symbol_286.evaluate(evaluator, T_Integer, A_symbol_285);
				DomainType static_A_symbol_287 = valueFactory.typeOf(A_symbol_286, I_1);
				LibraryBinaryOperation dynamic_A_symbol_287 = (LibraryBinaryOperation)static_A_symbol_287.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_287 = dynamic_A_symbol_287.evaluate(evaluator, T_Boolean, A_symbol_286, I_1);
				rightA_symbol_279 = A_symbol_287;
			} catch (InvalidValueException e) {
				rightA_symbol_279 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_287 = rightA_symbol_279;
			DomainType static_A_symbol_279 = valueFactory.typeOf(A_symbol_280);
			LibraryBinaryOperation dynamic_A_symbol_279 = (LibraryBinaryOperation)static_A_symbol_279.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_279 = dynamic_A_symbol_279.evaluate(evaluator, T_Boolean, A_symbol_280, A_symbol_287);
			return A_symbol_279;
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
				
				DomainType static_A_symbol_295 = valueFactory.typeOf(A_symbol_294, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_295 = (LibraryBinaryOperation)static_A_symbol_295.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_295 = dynamic_A_symbol_295.evaluate(evaluator, T_Boolean, A_symbol_294, T_ClassClassifier_Boolean_);
				rightA_symbol_288 = A_symbol_295;
			} catch (InvalidValueException e) {
				rightA_symbol_288 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_295 = rightA_symbol_288;
			DomainType static_A_symbol_288 = valueFactory.typeOf(A_symbol_289);
			LibraryBinaryOperation dynamic_A_symbol_288 = (LibraryBinaryOperation)static_A_symbol_288.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_288 = dynamic_A_symbol_288.evaluate(evaluator, T_Boolean, A_symbol_289, A_symbol_295);
			return A_symbol_288;
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
			
			Value leftA_symbol_296;
			try {
				Value leftA_symbol_297;
				try {
					
					Value A_symbol_298 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_299 = valueFactory.typeOf(A_symbol_298, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_299 = (LibraryBinaryOperation)static_A_symbol_299.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_299 = dynamic_A_symbol_299.evaluate(evaluator, T_Boolean, A_symbol_298, S_reject);
					leftA_symbol_297 = A_symbol_299;
				} catch (InvalidValueException e) {
					leftA_symbol_297 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_299 = leftA_symbol_297;
				Value rightA_symbol_297;
				try {
					
					Value A_symbol_300 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_301 = valueFactory.typeOf(A_symbol_300, S_select);
					LibraryBinaryOperation dynamic_A_symbol_301 = (LibraryBinaryOperation)static_A_symbol_301.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_301 = dynamic_A_symbol_301.evaluate(evaluator, T_Boolean, A_symbol_300, S_select);
					rightA_symbol_297 = A_symbol_301;
				} catch (InvalidValueException e) {
					rightA_symbol_297 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_301 = rightA_symbol_297;
				DomainType static_A_symbol_297 = valueFactory.typeOf(A_symbol_299);
				LibraryBinaryOperation dynamic_A_symbol_297 = (LibraryBinaryOperation)static_A_symbol_297.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_297 = dynamic_A_symbol_297.evaluate(evaluator, T_Boolean, A_symbol_299, A_symbol_301);
				leftA_symbol_296 = A_symbol_297;
			} catch (InvalidValueException e) {
				leftA_symbol_296 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_297 = leftA_symbol_296;
			Value rightA_symbol_296;
			try {
				
				Value A_symbol_302 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_303 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_304 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_303, P_TypedElement_type);
				
				DomainType static_A_symbol_305 = valueFactory.typeOf(A_symbol_302, A_symbol_304);
				LibraryBinaryOperation dynamic_A_symbol_305 = (LibraryBinaryOperation)static_A_symbol_305.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_305 = dynamic_A_symbol_305.evaluate(evaluator, T_Boolean, A_symbol_302, A_symbol_304);
				rightA_symbol_296 = A_symbol_305;
			} catch (InvalidValueException e) {
				rightA_symbol_296 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_305 = rightA_symbol_296;
			DomainType static_A_symbol_296 = valueFactory.typeOf(A_symbol_297);
			LibraryBinaryOperation dynamic_A_symbol_296 = (LibraryBinaryOperation)static_A_symbol_296.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_296 = dynamic_A_symbol_296.evaluate(evaluator, T_Boolean, A_symbol_297, A_symbol_305);
			return A_symbol_296;
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
			
			Value leftA_symbol_306;
			try {
				
				Value A_symbol_307 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_308 = valueFactory.typeOf(A_symbol_307, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_308 = (LibraryBinaryOperation)static_A_symbol_308.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_308 = dynamic_A_symbol_308.evaluate(evaluator, T_Boolean, A_symbol_307, S_sortedBy);
				leftA_symbol_306 = A_symbol_308;
			} catch (InvalidValueException e) {
				leftA_symbol_306 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_308 = leftA_symbol_306;
			Value rightA_symbol_306;
			try {
				
				Value A_symbol_309 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_310 = valueFactory.typeOf(A_symbol_309);
				LibraryBinaryOperation dynamic_A_symbol_310 = (LibraryBinaryOperation)static_A_symbol_310.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_310 = dynamic_A_symbol_310.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_309, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_311 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_310, P_CollectionType_elementType);
				
				
				Value A_symbol_312 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_313 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_312, P_TypedElement_type);
				
				DomainType static_A_symbol_314 = valueFactory.typeOf(A_symbol_313);
				LibraryBinaryOperation dynamic_A_symbol_314 = (LibraryBinaryOperation)static_A_symbol_314.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_314 = dynamic_A_symbol_314.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_313, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_315 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_314, P_CollectionType_elementType);
				
				DomainType static_A_symbol_316 = valueFactory.typeOf(A_symbol_311, A_symbol_315);
				LibraryBinaryOperation dynamic_A_symbol_316 = (LibraryBinaryOperation)static_A_symbol_316.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_316 = dynamic_A_symbol_316.evaluate(evaluator, T_Boolean, A_symbol_311, A_symbol_315);
				rightA_symbol_306 = A_symbol_316;
			} catch (InvalidValueException e) {
				rightA_symbol_306 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_316 = rightA_symbol_306;
			DomainType static_A_symbol_306 = valueFactory.typeOf(A_symbol_308);
			LibraryBinaryOperation dynamic_A_symbol_306 = (LibraryBinaryOperation)static_A_symbol_306.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_306 = dynamic_A_symbol_306.evaluate(evaluator, T_Boolean, A_symbol_308, A_symbol_316);
			return A_symbol_306;
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
			
			Value leftA_symbol_317;
			try {
				
				Value A_symbol_318 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_319 = valueFactory.typeOf(A_symbol_318, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_319 = (LibraryBinaryOperation)static_A_symbol_319.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_319 = dynamic_A_symbol_319.evaluate(evaluator, T_Boolean, A_symbol_318, S_sortedBy);
				leftA_symbol_317 = A_symbol_319;
			} catch (InvalidValueException e) {
				leftA_symbol_317 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_319 = leftA_symbol_317;
			Value rightA_symbol_317;
			try {
				
				Value A_symbol_320 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_321 = valueFactory.typeOf(A_symbol_320);
				LibraryUnaryOperation dynamic_A_symbol_321 = (LibraryUnaryOperation)static_A_symbol_321.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_321 = dynamic_A_symbol_321.evaluate(evaluator, T_Integer, A_symbol_320);
				DomainType static_A_symbol_322 = valueFactory.typeOf(A_symbol_321, I_1);
				LibraryBinaryOperation dynamic_A_symbol_322 = (LibraryBinaryOperation)static_A_symbol_322.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_322 = dynamic_A_symbol_322.evaluate(evaluator, T_Boolean, A_symbol_321, I_1);
				rightA_symbol_317 = A_symbol_322;
			} catch (InvalidValueException e) {
				rightA_symbol_317 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_322 = rightA_symbol_317;
			DomainType static_A_symbol_317 = valueFactory.typeOf(A_symbol_319);
			LibraryBinaryOperation dynamic_A_symbol_317 = (LibraryBinaryOperation)static_A_symbol_317.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_317 = dynamic_A_symbol_317.evaluate(evaluator, T_Boolean, A_symbol_319, A_symbol_322);
			return A_symbol_317;
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
			
			Value leftA_symbol_323;
			try {
				
				Value A_symbol_324 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_325 = valueFactory.typeOf(A_symbol_324, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_325 = (LibraryBinaryOperation)static_A_symbol_325.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_325 = dynamic_A_symbol_325.evaluate(evaluator, T_Boolean, A_symbol_324, S_sortedBy);
				leftA_symbol_323 = A_symbol_325;
			} catch (InvalidValueException e) {
				leftA_symbol_323 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_325 = leftA_symbol_323;
			Value rightA_symbol_323;
			try {
					Value leftA_symbol_326;
					try {
						
						Value A_symbol_327 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_328 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_327, P_TypedElement_type);
						
						DomainType static_A_symbol_329 = valueFactory.typeOf(A_symbol_328);
						LibraryBinaryOperation dynamic_A_symbol_329 = (LibraryBinaryOperation)static_A_symbol_329.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_329 = dynamic_A_symbol_329.evaluate(evaluator, T_Boolean, A_symbol_328, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_326 = A_symbol_329;
					} catch (InvalidValueException e) {
						leftA_symbol_326 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_329 = leftA_symbol_326;
					Value rightA_symbol_326;
					try {
						
						Value A_symbol_330 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_331 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_330, P_TypedElement_type);
						
						DomainType static_A_symbol_332 = valueFactory.typeOf(A_symbol_331);
						LibraryBinaryOperation dynamic_A_symbol_332 = (LibraryBinaryOperation)static_A_symbol_332.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_332 = dynamic_A_symbol_332.evaluate(evaluator, T_Boolean, A_symbol_331, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
						rightA_symbol_326 = A_symbol_332;
					} catch (InvalidValueException e) {
						rightA_symbol_326 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_332 = rightA_symbol_326;
					DomainType static_A_symbol_326 = valueFactory.typeOf(A_symbol_329);
					LibraryBinaryOperation dynamic_A_symbol_326 = (LibraryBinaryOperation)static_A_symbol_326.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_326 = dynamic_A_symbol_326.evaluate(evaluator, T_Boolean, A_symbol_329, A_symbol_332);
				Value A_symbol_333;
				if (A_symbol_326.isTrue()) {
					
					Value A_symbol_334 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_335 = valueFactory.typeOf(A_symbol_334);
					LibraryBinaryOperation dynamic_A_symbol_335 = (LibraryBinaryOperation)static_A_symbol_335.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_335 = dynamic_A_symbol_335.evaluate(evaluator, T_Boolean, A_symbol_334, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_333 = A_symbol_335;
				}
				else if (A_symbol_326.isFalse()) {
					
					Value A_symbol_336 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_337 = valueFactory.typeOf(A_symbol_336);
					LibraryBinaryOperation dynamic_A_symbol_337 = (LibraryBinaryOperation)static_A_symbol_337.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_337 = dynamic_A_symbol_337.evaluate(evaluator, T_Boolean, A_symbol_336, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_333 = A_symbol_337;
				}
				else if (A_symbol_326.isNull()) {
					A_symbol_333 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_333 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_323 = A_symbol_333;
			} catch (InvalidValueException e) {
				rightA_symbol_323 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_333 = rightA_symbol_323;
			DomainType static_A_symbol_323 = valueFactory.typeOf(A_symbol_325);
			LibraryBinaryOperation dynamic_A_symbol_323 = (LibraryBinaryOperation)static_A_symbol_323.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_323 = dynamic_A_symbol_323.evaluate(evaluator, T_Boolean, A_symbol_325, A_symbol_333);
			return A_symbol_323;
		}
	}
}

