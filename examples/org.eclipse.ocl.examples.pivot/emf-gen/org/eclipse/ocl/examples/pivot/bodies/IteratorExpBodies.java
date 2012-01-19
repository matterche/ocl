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
				
				Value A_symbol_109 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_110 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_109, P_TypedElement_type);
				
				DomainType static_A_symbol_111 = valueFactory.typeOf(A_symbol_110, S_Boolean);
				LibraryBinaryOperation dynamic_A_symbol_111 = (LibraryBinaryOperation)static_A_symbol_111.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_111 = dynamic_A_symbol_111.evaluate(evaluator, T_Boolean, A_symbol_110, S_Boolean);
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
				
				Value A_symbol_115 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_116 = valueFactory.typeOf(A_symbol_115);
				LibraryUnaryOperation dynamic_A_symbol_116 = (LibraryUnaryOperation)static_A_symbol_116.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_116 = dynamic_A_symbol_116.evaluate(evaluator, T_Integer, A_symbol_115);
				DomainType static_A_symbol_117 = valueFactory.typeOf(A_symbol_116, I_1);
				LibraryBinaryOperation dynamic_A_symbol_117 = (LibraryBinaryOperation)static_A_symbol_117.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_117 = dynamic_A_symbol_117.evaluate(evaluator, T_Boolean, A_symbol_116, I_1);
				rightA_symbol_112 = A_symbol_117;
			} catch (InvalidValueException e) {
				rightA_symbol_112 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_117 = rightA_symbol_112;
			DomainType static_A_symbol_112 = valueFactory.typeOf(A_symbol_114);
			LibraryBinaryOperation dynamic_A_symbol_112 = (LibraryBinaryOperation)static_A_symbol_112.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_112 = dynamic_A_symbol_112.evaluate(evaluator, T_Boolean, A_symbol_114, A_symbol_117);
			return A_symbol_112;
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
			
			Value leftA_symbol_118;
			try {
				
				Value A_symbol_119 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_120 = valueFactory.typeOf(A_symbol_119, S_any);
				LibraryBinaryOperation dynamic_A_symbol_120 = (LibraryBinaryOperation)static_A_symbol_120.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_120 = dynamic_A_symbol_120.evaluate(evaluator, T_Boolean, A_symbol_119, S_any);
				leftA_symbol_118 = A_symbol_120;
			} catch (InvalidValueException e) {
				leftA_symbol_118 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_120 = leftA_symbol_118;
			Value rightA_symbol_118;
			try {
				
				Value A_symbol_121 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_122 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_123 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_122, P_TypedElement_type);
				
				DomainType static_A_symbol_124 = valueFactory.typeOf(A_symbol_123);
				LibraryBinaryOperation dynamic_A_symbol_124 = (LibraryBinaryOperation)static_A_symbol_124.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_124 = dynamic_A_symbol_124.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_123, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_125 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_124, P_CollectionType_elementType);
				
				DomainType static_A_symbol_126 = valueFactory.typeOf(A_symbol_121, A_symbol_125);
				LibraryBinaryOperation dynamic_A_symbol_126 = (LibraryBinaryOperation)static_A_symbol_126.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_126 = dynamic_A_symbol_126.evaluate(evaluator, T_Boolean, A_symbol_121, A_symbol_125);
				rightA_symbol_118 = A_symbol_126;
			} catch (InvalidValueException e) {
				rightA_symbol_118 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_126 = rightA_symbol_118;
			DomainType static_A_symbol_118 = valueFactory.typeOf(A_symbol_120);
			LibraryBinaryOperation dynamic_A_symbol_118 = (LibraryBinaryOperation)static_A_symbol_118.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_118 = dynamic_A_symbol_118.evaluate(evaluator, T_Boolean, A_symbol_120, A_symbol_126);
			return A_symbol_118;
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
			
			Value leftA_symbol_127;
			try {
				
				Value A_symbol_128 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_129 = valueFactory.typeOf(A_symbol_128, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_129 = (LibraryBinaryOperation)static_A_symbol_129.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_129 = dynamic_A_symbol_129.evaluate(evaluator, T_Boolean, A_symbol_128, S_closure);
				leftA_symbol_127 = A_symbol_129;
			} catch (InvalidValueException e) {
				leftA_symbol_127 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_129 = leftA_symbol_127;
			Value rightA_symbol_127;
			try {
				
				Value A_symbol_130 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_131 = valueFactory.typeOf(A_symbol_130);
				LibraryBinaryOperation dynamic_A_symbol_131 = (LibraryBinaryOperation)static_A_symbol_131.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_131 = dynamic_A_symbol_131.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_130, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_132 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_131, P_CollectionType_elementType);
				
				
				Value A_symbol_133 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_134 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_133, P_TypedElement_type);
				
				DomainType static_A_symbol_135 = valueFactory.typeOf(A_symbol_134);
				LibraryBinaryOperation dynamic_A_symbol_135 = (LibraryBinaryOperation)static_A_symbol_135.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_135 = dynamic_A_symbol_135.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_134, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_136 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_135, P_CollectionType_elementType);
				
				DomainType static_A_symbol_137 = valueFactory.typeOf(A_symbol_132, A_symbol_136);
				LibraryBinaryOperation dynamic_A_symbol_137 = (LibraryBinaryOperation)static_A_symbol_137.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_137 = dynamic_A_symbol_137.evaluate(evaluator, T_Boolean, A_symbol_132, A_symbol_136);
				rightA_symbol_127 = A_symbol_137;
			} catch (InvalidValueException e) {
				rightA_symbol_127 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_137 = rightA_symbol_127;
			DomainType static_A_symbol_127 = valueFactory.typeOf(A_symbol_129);
			LibraryBinaryOperation dynamic_A_symbol_127 = (LibraryBinaryOperation)static_A_symbol_127.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_127 = dynamic_A_symbol_127.evaluate(evaluator, T_Boolean, A_symbol_129, A_symbol_137);
			return A_symbol_127;
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
				
				Value A_symbol_141 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_142 = valueFactory.typeOf(A_symbol_141);
				LibraryUnaryOperation dynamic_A_symbol_142 = (LibraryUnaryOperation)static_A_symbol_142.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_142 = dynamic_A_symbol_142.evaluate(evaluator, T_Integer, A_symbol_141);
				DomainType static_A_symbol_143 = valueFactory.typeOf(A_symbol_142, I_1);
				LibraryBinaryOperation dynamic_A_symbol_143 = (LibraryBinaryOperation)static_A_symbol_143.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_143 = dynamic_A_symbol_143.evaluate(evaluator, T_Boolean, A_symbol_142, I_1);
				rightA_symbol_138 = A_symbol_143;
			} catch (InvalidValueException e) {
				rightA_symbol_138 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_143 = rightA_symbol_138;
			DomainType static_A_symbol_138 = valueFactory.typeOf(A_symbol_140);
			LibraryBinaryOperation dynamic_A_symbol_138 = (LibraryBinaryOperation)static_A_symbol_138.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_138 = dynamic_A_symbol_138.evaluate(evaluator, T_Boolean, A_symbol_140, A_symbol_143);
			return A_symbol_138;
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
			
			Value leftA_symbol_144;
			try {
				
				Value A_symbol_145 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_146 = valueFactory.typeOf(A_symbol_145, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_146 = (LibraryBinaryOperation)static_A_symbol_146.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_146 = dynamic_A_symbol_146.evaluate(evaluator, T_Boolean, A_symbol_145, S_closure);
				leftA_symbol_144 = A_symbol_146;
			} catch (InvalidValueException e) {
				leftA_symbol_144 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_146 = leftA_symbol_144;
			Value rightA_symbol_144;
			try {
				
				Value A_symbol_147 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_148 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_147, P_TypedElement_type);
				
				DomainType static_A_symbol_149 = valueFactory.typeOf(A_symbol_148);
				LibraryBinaryOperation dynamic_A_symbol_149 = (LibraryBinaryOperation)static_A_symbol_149.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_149 = dynamic_A_symbol_149.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_148, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_150 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_149, P_CollectionType_elementType);
				
					
					Value A_symbol_151 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_152 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_151, P_TypedElement_type);
					
					DomainType static_A_symbol_153 = valueFactory.typeOf(A_symbol_152);
					LibraryBinaryOperation dynamic_A_symbol_153 = (LibraryBinaryOperation)static_A_symbol_153.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_153 = dynamic_A_symbol_153.evaluate(evaluator, T_Boolean, A_symbol_152, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_154;
				if (A_symbol_153.isTrue()) {
					
					Value A_symbol_155 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_156 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_155, P_TypedElement_type);
					
					DomainType static_A_symbol_157 = valueFactory.typeOf(A_symbol_156);
					LibraryBinaryOperation dynamic_A_symbol_157 = (LibraryBinaryOperation)static_A_symbol_157.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_157 = dynamic_A_symbol_157.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_156, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_158 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_157, P_CollectionType_elementType);
					
					A_symbol_154 = A_symbol_158;
				}
				else if (A_symbol_153.isFalse()) {
					
					Value A_symbol_159 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_160 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_159, P_TypedElement_type);
					
					A_symbol_154 = A_symbol_160;
				}
				else if (A_symbol_153.isNull()) {
					A_symbol_154 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_154 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				DomainType static_A_symbol_161 = valueFactory.typeOf(A_symbol_150, A_symbol_154);
				LibraryBinaryOperation dynamic_A_symbol_161 = (LibraryBinaryOperation)static_A_symbol_161.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_161 = dynamic_A_symbol_161.evaluate(evaluator, T_Boolean, A_symbol_150, A_symbol_154);
				rightA_symbol_144 = A_symbol_161;
			} catch (InvalidValueException e) {
				rightA_symbol_144 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_161 = rightA_symbol_144;
			DomainType static_A_symbol_144 = valueFactory.typeOf(A_symbol_146);
			LibraryBinaryOperation dynamic_A_symbol_144 = (LibraryBinaryOperation)static_A_symbol_144.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_144 = dynamic_A_symbol_144.evaluate(evaluator, T_Boolean, A_symbol_146, A_symbol_161);
			return A_symbol_144;
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
			
			Value leftA_symbol_162;
			try {
				
				Value A_symbol_163 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_164 = valueFactory.typeOf(A_symbol_163, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_164 = (LibraryBinaryOperation)static_A_symbol_164.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_164 = dynamic_A_symbol_164.evaluate(evaluator, T_Boolean, A_symbol_163, S_closure);
				leftA_symbol_162 = A_symbol_164;
			} catch (InvalidValueException e) {
				leftA_symbol_162 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_164 = leftA_symbol_162;
			Value rightA_symbol_162;
			try {
					Value leftA_symbol_165;
					try {
						
						Value A_symbol_166 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_167 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_166, P_TypedElement_type);
						
						DomainType static_A_symbol_168 = valueFactory.typeOf(A_symbol_167);
						LibraryBinaryOperation dynamic_A_symbol_168 = (LibraryBinaryOperation)static_A_symbol_168.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_168 = dynamic_A_symbol_168.evaluate(evaluator, T_Boolean, A_symbol_167, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_165 = A_symbol_168;
					} catch (InvalidValueException e) {
						leftA_symbol_165 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_168 = leftA_symbol_165;
					Value rightA_symbol_165;
					try {
						
						Value A_symbol_169 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_170 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_169, P_TypedElement_type);
						
						DomainType static_A_symbol_171 = valueFactory.typeOf(A_symbol_170);
						LibraryBinaryOperation dynamic_A_symbol_171 = (LibraryBinaryOperation)static_A_symbol_171.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_171 = dynamic_A_symbol_171.evaluate(evaluator, T_Boolean, A_symbol_170, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_165 = A_symbol_171;
					} catch (InvalidValueException e) {
						rightA_symbol_165 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_171 = rightA_symbol_165;
					DomainType static_A_symbol_165 = valueFactory.typeOf(A_symbol_168);
					LibraryBinaryOperation dynamic_A_symbol_165 = (LibraryBinaryOperation)static_A_symbol_165.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_165 = dynamic_A_symbol_165.evaluate(evaluator, T_Boolean, A_symbol_168, A_symbol_171);
				Value A_symbol_172;
				if (A_symbol_165.isTrue()) {
					
					Value A_symbol_173 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_174 = valueFactory.typeOf(A_symbol_173);
					LibraryBinaryOperation dynamic_A_symbol_174 = (LibraryBinaryOperation)static_A_symbol_174.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_174 = dynamic_A_symbol_174.evaluate(evaluator, T_Boolean, A_symbol_173, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_172 = A_symbol_174;
				}
				else if (A_symbol_165.isFalse()) {
					
					Value A_symbol_175 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_176 = valueFactory.typeOf(A_symbol_175);
					LibraryBinaryOperation dynamic_A_symbol_176 = (LibraryBinaryOperation)static_A_symbol_176.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_176 = dynamic_A_symbol_176.evaluate(evaluator, T_Boolean, A_symbol_175, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
					A_symbol_172 = A_symbol_176;
				}
				else if (A_symbol_165.isNull()) {
					A_symbol_172 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_172 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_162 = A_symbol_172;
			} catch (InvalidValueException e) {
				rightA_symbol_162 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_172 = rightA_symbol_162;
			DomainType static_A_symbol_162 = valueFactory.typeOf(A_symbol_164);
			LibraryBinaryOperation dynamic_A_symbol_162 = (LibraryBinaryOperation)static_A_symbol_162.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_162 = dynamic_A_symbol_162.evaluate(evaluator, T_Boolean, A_symbol_164, A_symbol_172);
			return A_symbol_162;
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
			
			Value leftA_symbol_177;
			try {
				
				Value A_symbol_178 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_179 = valueFactory.typeOf(A_symbol_178, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_179 = (LibraryBinaryOperation)static_A_symbol_179.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_179 = dynamic_A_symbol_179.evaluate(evaluator, T_Boolean, A_symbol_178, S_collect);
				leftA_symbol_177 = A_symbol_179;
			} catch (InvalidValueException e) {
				leftA_symbol_177 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_179 = leftA_symbol_177;
			Value rightA_symbol_177;
			try {
				
				Value A_symbol_180 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_181 = valueFactory.typeOf(A_symbol_180);
				LibraryBinaryOperation dynamic_A_symbol_181 = (LibraryBinaryOperation)static_A_symbol_181.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_181 = dynamic_A_symbol_181.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_180, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_182 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_181, P_CollectionType_elementType);
				
				
				Value A_symbol_183 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_184 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_183, P_TypedElement_type);
				
				DomainType static_A_symbol_185 = valueFactory.typeOf(A_symbol_184);
				LibraryBinaryOperation dynamic_A_symbol_185 = (LibraryBinaryOperation)static_A_symbol_185.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_185 = dynamic_A_symbol_185.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_184, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_186 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_185, P_CollectionType_elementType);
				
				DomainType static_A_symbol_187 = valueFactory.typeOf(A_symbol_182, A_symbol_186);
				LibraryBinaryOperation dynamic_A_symbol_187 = (LibraryBinaryOperation)static_A_symbol_187.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_187 = dynamic_A_symbol_187.evaluate(evaluator, T_Boolean, A_symbol_182, A_symbol_186);
				rightA_symbol_177 = A_symbol_187;
			} catch (InvalidValueException e) {
				rightA_symbol_177 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_187 = rightA_symbol_177;
			DomainType static_A_symbol_177 = valueFactory.typeOf(A_symbol_179);
			LibraryBinaryOperation dynamic_A_symbol_177 = (LibraryBinaryOperation)static_A_symbol_177.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_177 = dynamic_A_symbol_177.evaluate(evaluator, T_Boolean, A_symbol_179, A_symbol_187);
			return A_symbol_177;
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
			
			Value leftA_symbol_188;
			try {
				
				Value A_symbol_189 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_190 = valueFactory.typeOf(A_symbol_189, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_190 = (LibraryBinaryOperation)static_A_symbol_190.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_190 = dynamic_A_symbol_190.evaluate(evaluator, T_Boolean, A_symbol_189, S_collect);
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
				
				Value A_symbol_197 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_198 = valueFactory.typeOf(A_symbol_197);
				LibraryUnaryOperation dynamic_A_symbol_198 = (LibraryUnaryOperation)static_A_symbol_198.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_198 = dynamic_A_symbol_198.evaluate(evaluator, T_Integer, A_symbol_197);
				DomainType static_A_symbol_199 = valueFactory.typeOf(A_symbol_198, I_1);
				LibraryBinaryOperation dynamic_A_symbol_199 = (LibraryBinaryOperation)static_A_symbol_199.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_199 = dynamic_A_symbol_199.evaluate(evaluator, T_Boolean, A_symbol_198, I_1);
				rightA_symbol_194 = A_symbol_199;
			} catch (InvalidValueException e) {
				rightA_symbol_194 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_199 = rightA_symbol_194;
			DomainType static_A_symbol_194 = valueFactory.typeOf(A_symbol_196);
			LibraryBinaryOperation dynamic_A_symbol_194 = (LibraryBinaryOperation)static_A_symbol_194.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_194 = dynamic_A_symbol_194.evaluate(evaluator, T_Boolean, A_symbol_196, A_symbol_199);
			return A_symbol_194;
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
			
			Value leftA_symbol_200;
			try {
				
				Value A_symbol_201 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_202 = valueFactory.typeOf(A_symbol_201, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_202 = (LibraryBinaryOperation)static_A_symbol_202.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_202 = dynamic_A_symbol_202.evaluate(evaluator, T_Boolean, A_symbol_201, S_collectN___);
				leftA_symbol_200 = A_symbol_202;
			} catch (InvalidValueException e) {
				leftA_symbol_200 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_202 = leftA_symbol_200;
			Value rightA_symbol_200;
			try {
				
				Value A_symbol_203 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_204 = valueFactory.typeOf(A_symbol_203);
				LibraryBinaryOperation dynamic_A_symbol_204 = (LibraryBinaryOperation)static_A_symbol_204.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_204 = dynamic_A_symbol_204.evaluate(evaluator, T_Boolean, A_symbol_203, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
				rightA_symbol_200 = A_symbol_204;
			} catch (InvalidValueException e) {
				rightA_symbol_200 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_204 = rightA_symbol_200;
			DomainType static_A_symbol_200 = valueFactory.typeOf(A_symbol_202);
			LibraryBinaryOperation dynamic_A_symbol_200 = (LibraryBinaryOperation)static_A_symbol_200.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_200 = dynamic_A_symbol_200.evaluate(evaluator, T_Boolean, A_symbol_202, A_symbol_204);
			return A_symbol_200;
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
			
			Value leftA_symbol_205;
			try {
				
				Value A_symbol_206 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_207 = valueFactory.typeOf(A_symbol_206, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_207 = (LibraryBinaryOperation)static_A_symbol_207.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_207 = dynamic_A_symbol_207.evaluate(evaluator, T_Boolean, A_symbol_206, S_collectN___);
				leftA_symbol_205 = A_symbol_207;
			} catch (InvalidValueException e) {
				leftA_symbol_205 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_207 = leftA_symbol_205;
			Value rightA_symbol_205;
			try {
				
				Value A_symbol_208 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_209 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_210 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_209, P_TypedElement_type);
				
				DomainType static_A_symbol_211 = valueFactory.typeOf(A_symbol_208, A_symbol_210);
				LibraryBinaryOperation dynamic_A_symbol_211 = (LibraryBinaryOperation)static_A_symbol_211.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_211 = dynamic_A_symbol_211.evaluate(evaluator, T_Boolean, A_symbol_208, A_symbol_210);
				rightA_symbol_205 = A_symbol_211;
			} catch (InvalidValueException e) {
				rightA_symbol_205 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_211 = rightA_symbol_205;
			DomainType static_A_symbol_205 = valueFactory.typeOf(A_symbol_207);
			LibraryBinaryOperation dynamic_A_symbol_205 = (LibraryBinaryOperation)static_A_symbol_205.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_205 = dynamic_A_symbol_205.evaluate(evaluator, T_Boolean, A_symbol_207, A_symbol_211);
			return A_symbol_205;
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
			
			Value leftA_symbol_212;
			try {
				
				Value A_symbol_213 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_214 = valueFactory.typeOf(A_symbol_213, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_214 = (LibraryBinaryOperation)static_A_symbol_214.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_214 = dynamic_A_symbol_214.evaluate(evaluator, T_Boolean, A_symbol_213, S_collect);
				leftA_symbol_212 = A_symbol_214;
			} catch (InvalidValueException e) {
				leftA_symbol_212 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_214 = leftA_symbol_212;
			Value rightA_symbol_212;
			try {
					Value leftA_symbol_215;
					try {
						
						Value A_symbol_216 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_217 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_216, P_TypedElement_type);
						
						DomainType static_A_symbol_218 = valueFactory.typeOf(A_symbol_217);
						LibraryBinaryOperation dynamic_A_symbol_218 = (LibraryBinaryOperation)static_A_symbol_218.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_218 = dynamic_A_symbol_218.evaluate(evaluator, T_Boolean, A_symbol_217, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_215 = A_symbol_218;
					} catch (InvalidValueException e) {
						leftA_symbol_215 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_218 = leftA_symbol_215;
					Value rightA_symbol_215;
					try {
						
						Value A_symbol_219 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_220 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_219, P_TypedElement_type);
						
						DomainType static_A_symbol_221 = valueFactory.typeOf(A_symbol_220);
						LibraryBinaryOperation dynamic_A_symbol_221 = (LibraryBinaryOperation)static_A_symbol_221.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_221 = dynamic_A_symbol_221.evaluate(evaluator, T_Boolean, A_symbol_220, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_215 = A_symbol_221;
					} catch (InvalidValueException e) {
						rightA_symbol_215 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_221 = rightA_symbol_215;
					DomainType static_A_symbol_215 = valueFactory.typeOf(A_symbol_218);
					LibraryBinaryOperation dynamic_A_symbol_215 = (LibraryBinaryOperation)static_A_symbol_215.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_215 = dynamic_A_symbol_215.evaluate(evaluator, T_Boolean, A_symbol_218, A_symbol_221);
				Value A_symbol_222;
				if (A_symbol_215.isTrue()) {
					
					Value A_symbol_223 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_224 = valueFactory.typeOf(A_symbol_223);
					LibraryBinaryOperation dynamic_A_symbol_224 = (LibraryBinaryOperation)static_A_symbol_224.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_224 = dynamic_A_symbol_224.evaluate(evaluator, T_Boolean, A_symbol_223, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_222 = A_symbol_224;
				}
				else if (A_symbol_215.isFalse()) {
					
					Value A_symbol_225 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_226 = valueFactory.typeOf(A_symbol_225);
					LibraryBinaryOperation dynamic_A_symbol_226 = (LibraryBinaryOperation)static_A_symbol_226.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_226 = dynamic_A_symbol_226.evaluate(evaluator, T_Boolean, A_symbol_225, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
					A_symbol_222 = A_symbol_226;
				}
				else if (A_symbol_215.isNull()) {
					A_symbol_222 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_222 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_212 = A_symbol_222;
			} catch (InvalidValueException e) {
				rightA_symbol_212 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_222 = rightA_symbol_212;
			DomainType static_A_symbol_212 = valueFactory.typeOf(A_symbol_214);
			LibraryBinaryOperation dynamic_A_symbol_212 = (LibraryBinaryOperation)static_A_symbol_212.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_212 = dynamic_A_symbol_212.evaluate(evaluator, T_Boolean, A_symbol_214, A_symbol_222);
			return A_symbol_212;
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
				
				Value A_symbol_230 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_231 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_230, P_TypedElement_type);
				
				DomainType static_A_symbol_232 = valueFactory.typeOf(A_symbol_231, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_232 = (LibraryBinaryOperation)static_A_symbol_232.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_232 = dynamic_A_symbol_232.evaluate(evaluator, T_Boolean, A_symbol_231, T_ClassClassifier_Boolean_);
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
			
			Value leftA_symbol_233;
			try {
				
				Value A_symbol_234 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_235 = valueFactory.typeOf(A_symbol_234, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_235 = (LibraryBinaryOperation)static_A_symbol_235.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_235 = dynamic_A_symbol_235.evaluate(evaluator, T_Boolean, A_symbol_234, S_exists);
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
				
				Value A_symbol_241 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_242 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_241, P_TypedElement_type);
				
				DomainType static_A_symbol_243 = valueFactory.typeOf(A_symbol_242, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_243 = (LibraryBinaryOperation)static_A_symbol_243.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_243 = dynamic_A_symbol_243.evaluate(evaluator, T_Boolean, A_symbol_242, T_ClassClassifier_Boolean_);
				rightA_symbol_238 = A_symbol_243;
			} catch (InvalidValueException e) {
				rightA_symbol_238 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_243 = rightA_symbol_238;
			DomainType static_A_symbol_238 = valueFactory.typeOf(A_symbol_240);
			LibraryBinaryOperation dynamic_A_symbol_238 = (LibraryBinaryOperation)static_A_symbol_238.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_238 = dynamic_A_symbol_238.evaluate(evaluator, T_Boolean, A_symbol_240, A_symbol_243);
			return A_symbol_238;
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
			
			Value leftA_symbol_244;
			try {
				
				Value A_symbol_245 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_246 = valueFactory.typeOf(A_symbol_245, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_246 = (LibraryBinaryOperation)static_A_symbol_246.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_246 = dynamic_A_symbol_246.evaluate(evaluator, T_Boolean, A_symbol_245, S_forAll);
				leftA_symbol_244 = A_symbol_246;
			} catch (InvalidValueException e) {
				leftA_symbol_244 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_246 = leftA_symbol_244;
			Value rightA_symbol_244;
			try {
				
				Value A_symbol_247 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_248 = valueFactory.typeOf(A_symbol_247, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_248 = (LibraryBinaryOperation)static_A_symbol_248.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_248 = dynamic_A_symbol_248.evaluate(evaluator, T_Boolean, A_symbol_247, T_ClassClassifier_Boolean_);
				rightA_symbol_244 = A_symbol_248;
			} catch (InvalidValueException e) {
				rightA_symbol_244 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_248 = rightA_symbol_244;
			DomainType static_A_symbol_244 = valueFactory.typeOf(A_symbol_246);
			LibraryBinaryOperation dynamic_A_symbol_244 = (LibraryBinaryOperation)static_A_symbol_244.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_244 = dynamic_A_symbol_244.evaluate(evaluator, T_Boolean, A_symbol_246, A_symbol_248);
			return A_symbol_244;
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
				
				Value A_symbol_252 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_253 = valueFactory.typeOf(A_symbol_252);
				LibraryUnaryOperation dynamic_A_symbol_253 = (LibraryUnaryOperation)static_A_symbol_253.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_253 = dynamic_A_symbol_253.evaluate(evaluator, T_Integer, A_symbol_252);
				DomainType static_A_symbol_254 = valueFactory.typeOf(A_symbol_253, I_1);
				LibraryBinaryOperation dynamic_A_symbol_254 = (LibraryBinaryOperation)static_A_symbol_254.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_254 = dynamic_A_symbol_254.evaluate(evaluator, T_Boolean, A_symbol_253, I_1);
				rightA_symbol_249 = A_symbol_254;
			} catch (InvalidValueException e) {
				rightA_symbol_249 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_254 = rightA_symbol_249;
			DomainType static_A_symbol_249 = valueFactory.typeOf(A_symbol_251);
			LibraryBinaryOperation dynamic_A_symbol_249 = (LibraryBinaryOperation)static_A_symbol_249.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_249 = dynamic_A_symbol_249.evaluate(evaluator, T_Boolean, A_symbol_251, A_symbol_254);
			return A_symbol_249;
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
			
			Value leftA_symbol_255;
			try {
				
				Value A_symbol_256 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_257 = valueFactory.typeOf(A_symbol_256, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_257 = (LibraryBinaryOperation)static_A_symbol_257.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_257 = dynamic_A_symbol_257.evaluate(evaluator, T_Boolean, A_symbol_256, S_isUnique);
				leftA_symbol_255 = A_symbol_257;
			} catch (InvalidValueException e) {
				leftA_symbol_255 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_257 = leftA_symbol_255;
			Value rightA_symbol_255;
			try {
				
				Value A_symbol_258 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_259 = valueFactory.typeOf(A_symbol_258, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_259 = (LibraryBinaryOperation)static_A_symbol_259.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_259 = dynamic_A_symbol_259.evaluate(evaluator, T_Boolean, A_symbol_258, T_ClassClassifier_Boolean_);
				rightA_symbol_255 = A_symbol_259;
			} catch (InvalidValueException e) {
				rightA_symbol_255 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_259 = rightA_symbol_255;
			DomainType static_A_symbol_255 = valueFactory.typeOf(A_symbol_257);
			LibraryBinaryOperation dynamic_A_symbol_255 = (LibraryBinaryOperation)static_A_symbol_255.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_255 = dynamic_A_symbol_255.evaluate(evaluator, T_Boolean, A_symbol_257, A_symbol_259);
			return A_symbol_255;
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
			
			
			Value A_symbol_260 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_261 = new AbstractBinaryOperation()
			{
			/*
			type =
			source.type.oclAsType(_'file:/C:/GIT/org.eclipse.ocl/examples/org.eclipse.ocl.examples.pivot/model/Pivot.ecore'::ocl::CollectionType).elementType
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_262 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_1_, P_TypedElement_type);
					
					
					Value A_symbol_263 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
					
					Value A_symbol_264 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_263, P_TypedElement_type);
					
					DomainType static_A_symbol_265 = valueFactory.typeOf(A_symbol_264);
					LibraryBinaryOperation dynamic_A_symbol_265 = (LibraryBinaryOperation)static_A_symbol_265.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_265 = dynamic_A_symbol_265.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_264, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_266 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_265, P_CollectionType_elementType);
					
					DomainType static_A_symbol_267 = valueFactory.typeOf(A_symbol_262, A_symbol_266);
					LibraryBinaryOperation dynamic_A_symbol_267 = (LibraryBinaryOperation)static_A_symbol_267.lookupImplementation(standardLibrary, O_OclAny__eq_);
					Value A_symbol_267 = dynamic_A_symbol_267.evaluate(evaluator, T_Boolean, A_symbol_262, A_symbol_266);
					return A_symbol_267;
				}
			};
			DomainType static_A_symbol_261 = A_symbol_260.getType();
			LibraryIteration dynamic_A_symbol_261 = (LibraryIteration)static_A_symbol_261.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_261 = dynamic_A_symbol_261.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_261 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_261, (CollectionValue)A_symbol_260, acc_A_symbol_261);
			Value A_symbol_261 = dynamic_A_symbol_261.evaluateIteration(manager_A_symbol_261);
			return A_symbol_261;
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
				
				Value A_symbol_271 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_272 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_271, P_TypedElement_type);
				
				DomainType static_A_symbol_273 = valueFactory.typeOf(A_symbol_272, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_273 = (LibraryBinaryOperation)static_A_symbol_273.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_273 = dynamic_A_symbol_273.evaluate(evaluator, T_Boolean, A_symbol_272, T_ClassClassifier_Boolean_);
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
				
				Value A_symbol_277 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_278 = valueFactory.typeOf(A_symbol_277);
				LibraryUnaryOperation dynamic_A_symbol_278 = (LibraryUnaryOperation)static_A_symbol_278.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_278 = dynamic_A_symbol_278.evaluate(evaluator, T_Integer, A_symbol_277);
				DomainType static_A_symbol_279 = valueFactory.typeOf(A_symbol_278, I_1);
				LibraryBinaryOperation dynamic_A_symbol_279 = (LibraryBinaryOperation)static_A_symbol_279.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_279 = dynamic_A_symbol_279.evaluate(evaluator, T_Boolean, A_symbol_278, I_1);
				rightA_symbol_274 = A_symbol_279;
			} catch (InvalidValueException e) {
				rightA_symbol_274 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_279 = rightA_symbol_274;
			DomainType static_A_symbol_274 = valueFactory.typeOf(A_symbol_276);
			LibraryBinaryOperation dynamic_A_symbol_274 = (LibraryBinaryOperation)static_A_symbol_274.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_274 = dynamic_A_symbol_274.evaluate(evaluator, T_Boolean, A_symbol_276, A_symbol_279);
			return A_symbol_274;
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
			
			Value leftA_symbol_280;
			try {
				
				Value A_symbol_281 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_282 = valueFactory.typeOf(A_symbol_281, S_one);
				LibraryBinaryOperation dynamic_A_symbol_282 = (LibraryBinaryOperation)static_A_symbol_282.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_282 = dynamic_A_symbol_282.evaluate(evaluator, T_Boolean, A_symbol_281, S_one);
				leftA_symbol_280 = A_symbol_282;
			} catch (InvalidValueException e) {
				leftA_symbol_280 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_282 = leftA_symbol_280;
			Value rightA_symbol_280;
			try {
				
				Value A_symbol_283 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_284 = valueFactory.typeOf(A_symbol_283, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_284 = (LibraryBinaryOperation)static_A_symbol_284.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_284 = dynamic_A_symbol_284.evaluate(evaluator, T_Boolean, A_symbol_283, T_ClassClassifier_Boolean_);
				rightA_symbol_280 = A_symbol_284;
			} catch (InvalidValueException e) {
				rightA_symbol_280 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_284 = rightA_symbol_280;
			DomainType static_A_symbol_280 = valueFactory.typeOf(A_symbol_282);
			LibraryBinaryOperation dynamic_A_symbol_280 = (LibraryBinaryOperation)static_A_symbol_280.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_280 = dynamic_A_symbol_280.evaluate(evaluator, T_Boolean, A_symbol_282, A_symbol_284);
			return A_symbol_280;
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
			
			Value leftA_symbol_285;
			try {
				Value leftA_symbol_286;
				try {
					
					Value A_symbol_287 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_288 = valueFactory.typeOf(A_symbol_287, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_288 = (LibraryBinaryOperation)static_A_symbol_288.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_288 = dynamic_A_symbol_288.evaluate(evaluator, T_Boolean, A_symbol_287, S_reject);
					leftA_symbol_286 = A_symbol_288;
				} catch (InvalidValueException e) {
					leftA_symbol_286 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_288 = leftA_symbol_286;
				Value rightA_symbol_286;
				try {
					
					Value A_symbol_289 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_290 = valueFactory.typeOf(A_symbol_289, S_select);
					LibraryBinaryOperation dynamic_A_symbol_290 = (LibraryBinaryOperation)static_A_symbol_290.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_290 = dynamic_A_symbol_290.evaluate(evaluator, T_Boolean, A_symbol_289, S_select);
					rightA_symbol_286 = A_symbol_290;
				} catch (InvalidValueException e) {
					rightA_symbol_286 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_290 = rightA_symbol_286;
				DomainType static_A_symbol_286 = valueFactory.typeOf(A_symbol_288);
				LibraryBinaryOperation dynamic_A_symbol_286 = (LibraryBinaryOperation)static_A_symbol_286.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_286 = dynamic_A_symbol_286.evaluate(evaluator, T_Boolean, A_symbol_288, A_symbol_290);
				leftA_symbol_285 = A_symbol_286;
			} catch (InvalidValueException e) {
				leftA_symbol_285 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_286 = leftA_symbol_285;
			Value rightA_symbol_285;
			try {
				
				Value A_symbol_291 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_292 = valueFactory.typeOf(A_symbol_291);
				LibraryUnaryOperation dynamic_A_symbol_292 = (LibraryUnaryOperation)static_A_symbol_292.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_292 = dynamic_A_symbol_292.evaluate(evaluator, T_Integer, A_symbol_291);
				DomainType static_A_symbol_293 = valueFactory.typeOf(A_symbol_292, I_1);
				LibraryBinaryOperation dynamic_A_symbol_293 = (LibraryBinaryOperation)static_A_symbol_293.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_293 = dynamic_A_symbol_293.evaluate(evaluator, T_Boolean, A_symbol_292, I_1);
				rightA_symbol_285 = A_symbol_293;
			} catch (InvalidValueException e) {
				rightA_symbol_285 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_293 = rightA_symbol_285;
			DomainType static_A_symbol_285 = valueFactory.typeOf(A_symbol_286);
			LibraryBinaryOperation dynamic_A_symbol_285 = (LibraryBinaryOperation)static_A_symbol_285.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_285 = dynamic_A_symbol_285.evaluate(evaluator, T_Boolean, A_symbol_286, A_symbol_293);
			return A_symbol_285;
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
			
			Value leftA_symbol_294;
			try {
				Value leftA_symbol_295;
				try {
					
					Value A_symbol_296 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_297 = valueFactory.typeOf(A_symbol_296, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_297 = (LibraryBinaryOperation)static_A_symbol_297.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_297 = dynamic_A_symbol_297.evaluate(evaluator, T_Boolean, A_symbol_296, S_reject);
					leftA_symbol_295 = A_symbol_297;
				} catch (InvalidValueException e) {
					leftA_symbol_295 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_297 = leftA_symbol_295;
				Value rightA_symbol_295;
				try {
					
					Value A_symbol_298 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_299 = valueFactory.typeOf(A_symbol_298, S_select);
					LibraryBinaryOperation dynamic_A_symbol_299 = (LibraryBinaryOperation)static_A_symbol_299.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_299 = dynamic_A_symbol_299.evaluate(evaluator, T_Boolean, A_symbol_298, S_select);
					rightA_symbol_295 = A_symbol_299;
				} catch (InvalidValueException e) {
					rightA_symbol_295 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_299 = rightA_symbol_295;
				DomainType static_A_symbol_295 = valueFactory.typeOf(A_symbol_297);
				LibraryBinaryOperation dynamic_A_symbol_295 = (LibraryBinaryOperation)static_A_symbol_295.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_295 = dynamic_A_symbol_295.evaluate(evaluator, T_Boolean, A_symbol_297, A_symbol_299);
				leftA_symbol_294 = A_symbol_295;
			} catch (InvalidValueException e) {
				leftA_symbol_294 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_295 = leftA_symbol_294;
			Value rightA_symbol_294;
			try {
				
				Value A_symbol_300 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_301 = valueFactory.typeOf(A_symbol_300, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_301 = (LibraryBinaryOperation)static_A_symbol_301.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_301 = dynamic_A_symbol_301.evaluate(evaluator, T_Boolean, A_symbol_300, T_ClassClassifier_Boolean_);
				rightA_symbol_294 = A_symbol_301;
			} catch (InvalidValueException e) {
				rightA_symbol_294 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_301 = rightA_symbol_294;
			DomainType static_A_symbol_294 = valueFactory.typeOf(A_symbol_295);
			LibraryBinaryOperation dynamic_A_symbol_294 = (LibraryBinaryOperation)static_A_symbol_294.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_294 = dynamic_A_symbol_294.evaluate(evaluator, T_Boolean, A_symbol_295, A_symbol_301);
			return A_symbol_294;
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
			
			Value leftA_symbol_302;
			try {
				Value leftA_symbol_303;
				try {
					
					Value A_symbol_304 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_305 = valueFactory.typeOf(A_symbol_304, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_305 = (LibraryBinaryOperation)static_A_symbol_305.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_305 = dynamic_A_symbol_305.evaluate(evaluator, T_Boolean, A_symbol_304, S_reject);
					leftA_symbol_303 = A_symbol_305;
				} catch (InvalidValueException e) {
					leftA_symbol_303 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_305 = leftA_symbol_303;
				Value rightA_symbol_303;
				try {
					
					Value A_symbol_306 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_307 = valueFactory.typeOf(A_symbol_306, S_select);
					LibraryBinaryOperation dynamic_A_symbol_307 = (LibraryBinaryOperation)static_A_symbol_307.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_307 = dynamic_A_symbol_307.evaluate(evaluator, T_Boolean, A_symbol_306, S_select);
					rightA_symbol_303 = A_symbol_307;
				} catch (InvalidValueException e) {
					rightA_symbol_303 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_307 = rightA_symbol_303;
				DomainType static_A_symbol_303 = valueFactory.typeOf(A_symbol_305);
				LibraryBinaryOperation dynamic_A_symbol_303 = (LibraryBinaryOperation)static_A_symbol_303.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_303 = dynamic_A_symbol_303.evaluate(evaluator, T_Boolean, A_symbol_305, A_symbol_307);
				leftA_symbol_302 = A_symbol_303;
			} catch (InvalidValueException e) {
				leftA_symbol_302 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_303 = leftA_symbol_302;
			Value rightA_symbol_302;
			try {
				
				Value A_symbol_308 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_309 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_310 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_309, P_TypedElement_type);
				
				DomainType static_A_symbol_311 = valueFactory.typeOf(A_symbol_308, A_symbol_310);
				LibraryBinaryOperation dynamic_A_symbol_311 = (LibraryBinaryOperation)static_A_symbol_311.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_311 = dynamic_A_symbol_311.evaluate(evaluator, T_Boolean, A_symbol_308, A_symbol_310);
				rightA_symbol_302 = A_symbol_311;
			} catch (InvalidValueException e) {
				rightA_symbol_302 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_311 = rightA_symbol_302;
			DomainType static_A_symbol_302 = valueFactory.typeOf(A_symbol_303);
			LibraryBinaryOperation dynamic_A_symbol_302 = (LibraryBinaryOperation)static_A_symbol_302.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_302 = dynamic_A_symbol_302.evaluate(evaluator, T_Boolean, A_symbol_303, A_symbol_311);
			return A_symbol_302;
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
			
			Value leftA_symbol_312;
			try {
				
				Value A_symbol_313 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_314 = valueFactory.typeOf(A_symbol_313, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_314 = (LibraryBinaryOperation)static_A_symbol_314.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_314 = dynamic_A_symbol_314.evaluate(evaluator, T_Boolean, A_symbol_313, S_sortedBy);
				leftA_symbol_312 = A_symbol_314;
			} catch (InvalidValueException e) {
				leftA_symbol_312 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_314 = leftA_symbol_312;
			Value rightA_symbol_312;
			try {
				
				Value A_symbol_315 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_316 = valueFactory.typeOf(A_symbol_315);
				LibraryBinaryOperation dynamic_A_symbol_316 = (LibraryBinaryOperation)static_A_symbol_316.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_316 = dynamic_A_symbol_316.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_315, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_317 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_316, P_CollectionType_elementType);
				
				
				Value A_symbol_318 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_319 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_318, P_TypedElement_type);
				
				DomainType static_A_symbol_320 = valueFactory.typeOf(A_symbol_319);
				LibraryBinaryOperation dynamic_A_symbol_320 = (LibraryBinaryOperation)static_A_symbol_320.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_320 = dynamic_A_symbol_320.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_319, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_321 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_320, P_CollectionType_elementType);
				
				DomainType static_A_symbol_322 = valueFactory.typeOf(A_symbol_317, A_symbol_321);
				LibraryBinaryOperation dynamic_A_symbol_322 = (LibraryBinaryOperation)static_A_symbol_322.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_322 = dynamic_A_symbol_322.evaluate(evaluator, T_Boolean, A_symbol_317, A_symbol_321);
				rightA_symbol_312 = A_symbol_322;
			} catch (InvalidValueException e) {
				rightA_symbol_312 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_322 = rightA_symbol_312;
			DomainType static_A_symbol_312 = valueFactory.typeOf(A_symbol_314);
			LibraryBinaryOperation dynamic_A_symbol_312 = (LibraryBinaryOperation)static_A_symbol_312.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_312 = dynamic_A_symbol_312.evaluate(evaluator, T_Boolean, A_symbol_314, A_symbol_322);
			return A_symbol_312;
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
				
				Value A_symbol_326 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_327 = valueFactory.typeOf(A_symbol_326);
				LibraryUnaryOperation dynamic_A_symbol_327 = (LibraryUnaryOperation)static_A_symbol_327.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_327 = dynamic_A_symbol_327.evaluate(evaluator, T_Integer, A_symbol_326);
				DomainType static_A_symbol_328 = valueFactory.typeOf(A_symbol_327, I_1);
				LibraryBinaryOperation dynamic_A_symbol_328 = (LibraryBinaryOperation)static_A_symbol_328.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_328 = dynamic_A_symbol_328.evaluate(evaluator, T_Boolean, A_symbol_327, I_1);
				rightA_symbol_323 = A_symbol_328;
			} catch (InvalidValueException e) {
				rightA_symbol_323 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_328 = rightA_symbol_323;
			DomainType static_A_symbol_323 = valueFactory.typeOf(A_symbol_325);
			LibraryBinaryOperation dynamic_A_symbol_323 = (LibraryBinaryOperation)static_A_symbol_323.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_323 = dynamic_A_symbol_323.evaluate(evaluator, T_Boolean, A_symbol_325, A_symbol_328);
			return A_symbol_323;
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
			
			Value leftA_symbol_329;
			try {
				
				Value A_symbol_330 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_331 = valueFactory.typeOf(A_symbol_330, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_331 = (LibraryBinaryOperation)static_A_symbol_331.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_331 = dynamic_A_symbol_331.evaluate(evaluator, T_Boolean, A_symbol_330, S_sortedBy);
				leftA_symbol_329 = A_symbol_331;
			} catch (InvalidValueException e) {
				leftA_symbol_329 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_331 = leftA_symbol_329;
			Value rightA_symbol_329;
			try {
					Value leftA_symbol_332;
					try {
						
						Value A_symbol_333 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_334 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_333, P_TypedElement_type);
						
						DomainType static_A_symbol_335 = valueFactory.typeOf(A_symbol_334);
						LibraryBinaryOperation dynamic_A_symbol_335 = (LibraryBinaryOperation)static_A_symbol_335.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_335 = dynamic_A_symbol_335.evaluate(evaluator, T_Boolean, A_symbol_334, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_332 = A_symbol_335;
					} catch (InvalidValueException e) {
						leftA_symbol_332 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_335 = leftA_symbol_332;
					Value rightA_symbol_332;
					try {
						
						Value A_symbol_336 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_337 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_336, P_TypedElement_type);
						
						DomainType static_A_symbol_338 = valueFactory.typeOf(A_symbol_337);
						LibraryBinaryOperation dynamic_A_symbol_338 = (LibraryBinaryOperation)static_A_symbol_338.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_338 = dynamic_A_symbol_338.evaluate(evaluator, T_Boolean, A_symbol_337, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
						rightA_symbol_332 = A_symbol_338;
					} catch (InvalidValueException e) {
						rightA_symbol_332 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_338 = rightA_symbol_332;
					DomainType static_A_symbol_332 = valueFactory.typeOf(A_symbol_335);
					LibraryBinaryOperation dynamic_A_symbol_332 = (LibraryBinaryOperation)static_A_symbol_332.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_332 = dynamic_A_symbol_332.evaluate(evaluator, T_Boolean, A_symbol_335, A_symbol_338);
				Value A_symbol_339;
				if (A_symbol_332.isTrue()) {
					
					Value A_symbol_340 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_341 = valueFactory.typeOf(A_symbol_340);
					LibraryBinaryOperation dynamic_A_symbol_341 = (LibraryBinaryOperation)static_A_symbol_341.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_341 = dynamic_A_symbol_341.evaluate(evaluator, T_Boolean, A_symbol_340, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_339 = A_symbol_341;
				}
				else if (A_symbol_332.isFalse()) {
					
					Value A_symbol_342 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_343 = valueFactory.typeOf(A_symbol_342);
					LibraryBinaryOperation dynamic_A_symbol_343 = (LibraryBinaryOperation)static_A_symbol_343.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_343 = dynamic_A_symbol_343.evaluate(evaluator, T_Boolean, A_symbol_342, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_339 = A_symbol_343;
				}
				else if (A_symbol_332.isNull()) {
					A_symbol_339 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_339 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_329 = A_symbol_339;
			} catch (InvalidValueException e) {
				rightA_symbol_329 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_339 = rightA_symbol_329;
			DomainType static_A_symbol_329 = valueFactory.typeOf(A_symbol_331);
			LibraryBinaryOperation dynamic_A_symbol_329 = (LibraryBinaryOperation)static_A_symbol_329.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_329 = dynamic_A_symbol_329.evaluate(evaluator, T_Boolean, A_symbol_331, A_symbol_339);
			return A_symbol_329;
		}
	}
}

