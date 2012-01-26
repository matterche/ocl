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
			
			Value leftA_symbol_143;
			try {
				
				Value A_symbol_144 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_145 = valueFactory.typeOf(A_symbol_144, S_any);
				LibraryBinaryOperation dynamic_A_symbol_145 = (LibraryBinaryOperation)static_A_symbol_145.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_145 = dynamic_A_symbol_145.evaluate(evaluator, T_Boolean, A_symbol_144, S_any);
				leftA_symbol_143 = A_symbol_145;
			} catch (InvalidValueException e) {
				leftA_symbol_143 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_145 = leftA_symbol_143;
			Value rightA_symbol_143;
			try {
				
				Value A_symbol_146 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_147 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_146, P_TypedElement_type);
				
				DomainType static_A_symbol_148 = valueFactory.typeOf(A_symbol_147, S_Boolean);
				LibraryBinaryOperation dynamic_A_symbol_148 = (LibraryBinaryOperation)static_A_symbol_148.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_148 = dynamic_A_symbol_148.evaluate(evaluator, T_Boolean, A_symbol_147, S_Boolean);
				rightA_symbol_143 = A_symbol_148;
			} catch (InvalidValueException e) {
				rightA_symbol_143 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_148 = rightA_symbol_143;
			DomainType static_A_symbol_143 = valueFactory.typeOf(A_symbol_145);
			LibraryBinaryOperation dynamic_A_symbol_143 = (LibraryBinaryOperation)static_A_symbol_143.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_143 = dynamic_A_symbol_143.evaluate(evaluator, T_Boolean, A_symbol_145, A_symbol_148);
			return A_symbol_143;
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
			
			Value leftA_symbol_149;
			try {
				
				Value A_symbol_150 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_151 = valueFactory.typeOf(A_symbol_150, S_any);
				LibraryBinaryOperation dynamic_A_symbol_151 = (LibraryBinaryOperation)static_A_symbol_151.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_151 = dynamic_A_symbol_151.evaluate(evaluator, T_Boolean, A_symbol_150, S_any);
				leftA_symbol_149 = A_symbol_151;
			} catch (InvalidValueException e) {
				leftA_symbol_149 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_151 = leftA_symbol_149;
			Value rightA_symbol_149;
			try {
				
				Value A_symbol_152 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_153 = valueFactory.typeOf(A_symbol_152);
				LibraryUnaryOperation dynamic_A_symbol_153 = (LibraryUnaryOperation)static_A_symbol_153.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_153 = dynamic_A_symbol_153.evaluate(evaluator, T_Integer, A_symbol_152);
				DomainType static_A_symbol_154 = valueFactory.typeOf(A_symbol_153, I_1);
				LibraryBinaryOperation dynamic_A_symbol_154 = (LibraryBinaryOperation)static_A_symbol_154.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_154 = dynamic_A_symbol_154.evaluate(evaluator, T_Boolean, A_symbol_153, I_1);
				rightA_symbol_149 = A_symbol_154;
			} catch (InvalidValueException e) {
				rightA_symbol_149 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_154 = rightA_symbol_149;
			DomainType static_A_symbol_149 = valueFactory.typeOf(A_symbol_151);
			LibraryBinaryOperation dynamic_A_symbol_149 = (LibraryBinaryOperation)static_A_symbol_149.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_149 = dynamic_A_symbol_149.evaluate(evaluator, T_Boolean, A_symbol_151, A_symbol_154);
			return A_symbol_149;
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
			
			Value leftA_symbol_155;
			try {
				
				Value A_symbol_156 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_157 = valueFactory.typeOf(A_symbol_156, S_any);
				LibraryBinaryOperation dynamic_A_symbol_157 = (LibraryBinaryOperation)static_A_symbol_157.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_157 = dynamic_A_symbol_157.evaluate(evaluator, T_Boolean, A_symbol_156, S_any);
				leftA_symbol_155 = A_symbol_157;
			} catch (InvalidValueException e) {
				leftA_symbol_155 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_157 = leftA_symbol_155;
			Value rightA_symbol_155;
			try {
				
				Value A_symbol_158 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_159 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_160 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_159, P_TypedElement_type);
				
				DomainType static_A_symbol_161 = valueFactory.typeOf(A_symbol_160);
				LibraryBinaryOperation dynamic_A_symbol_161 = (LibraryBinaryOperation)static_A_symbol_161.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_161 = dynamic_A_symbol_161.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_160, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_162 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_161, P_CollectionType_elementType);
				
				DomainType static_A_symbol_163 = valueFactory.typeOf(A_symbol_158, A_symbol_162);
				LibraryBinaryOperation dynamic_A_symbol_163 = (LibraryBinaryOperation)static_A_symbol_163.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_163 = dynamic_A_symbol_163.evaluate(evaluator, T_Boolean, A_symbol_158, A_symbol_162);
				rightA_symbol_155 = A_symbol_163;
			} catch (InvalidValueException e) {
				rightA_symbol_155 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_163 = rightA_symbol_155;
			DomainType static_A_symbol_155 = valueFactory.typeOf(A_symbol_157);
			LibraryBinaryOperation dynamic_A_symbol_155 = (LibraryBinaryOperation)static_A_symbol_155.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_155 = dynamic_A_symbol_155.evaluate(evaluator, T_Boolean, A_symbol_157, A_symbol_163);
			return A_symbol_155;
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
			
			Value leftA_symbol_164;
			try {
				
				Value A_symbol_165 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_166 = valueFactory.typeOf(A_symbol_165, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_166 = (LibraryBinaryOperation)static_A_symbol_166.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_166 = dynamic_A_symbol_166.evaluate(evaluator, T_Boolean, A_symbol_165, S_closure);
				leftA_symbol_164 = A_symbol_166;
			} catch (InvalidValueException e) {
				leftA_symbol_164 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_166 = leftA_symbol_164;
			Value rightA_symbol_164;
			try {
				
				Value A_symbol_167 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_168 = valueFactory.typeOf(A_symbol_167);
				LibraryBinaryOperation dynamic_A_symbol_168 = (LibraryBinaryOperation)static_A_symbol_168.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_168 = dynamic_A_symbol_168.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_167, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_169 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_168, P_CollectionType_elementType);
				
				
				Value A_symbol_170 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_171 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_170, P_TypedElement_type);
				
				DomainType static_A_symbol_172 = valueFactory.typeOf(A_symbol_171);
				LibraryBinaryOperation dynamic_A_symbol_172 = (LibraryBinaryOperation)static_A_symbol_172.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_172 = dynamic_A_symbol_172.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_171, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_173 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_172, P_CollectionType_elementType);
				
				DomainType static_A_symbol_174 = valueFactory.typeOf(A_symbol_169, A_symbol_173);
				LibraryBinaryOperation dynamic_A_symbol_174 = (LibraryBinaryOperation)static_A_symbol_174.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_174 = dynamic_A_symbol_174.evaluate(evaluator, T_Boolean, A_symbol_169, A_symbol_173);
				rightA_symbol_164 = A_symbol_174;
			} catch (InvalidValueException e) {
				rightA_symbol_164 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_174 = rightA_symbol_164;
			DomainType static_A_symbol_164 = valueFactory.typeOf(A_symbol_166);
			LibraryBinaryOperation dynamic_A_symbol_164 = (LibraryBinaryOperation)static_A_symbol_164.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_164 = dynamic_A_symbol_164.evaluate(evaluator, T_Boolean, A_symbol_166, A_symbol_174);
			return A_symbol_164;
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
			
			Value leftA_symbol_175;
			try {
				
				Value A_symbol_176 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_177 = valueFactory.typeOf(A_symbol_176, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_177 = (LibraryBinaryOperation)static_A_symbol_177.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_177 = dynamic_A_symbol_177.evaluate(evaluator, T_Boolean, A_symbol_176, S_closure);
				leftA_symbol_175 = A_symbol_177;
			} catch (InvalidValueException e) {
				leftA_symbol_175 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_177 = leftA_symbol_175;
			Value rightA_symbol_175;
			try {
				
				Value A_symbol_178 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_179 = valueFactory.typeOf(A_symbol_178);
				LibraryUnaryOperation dynamic_A_symbol_179 = (LibraryUnaryOperation)static_A_symbol_179.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_179 = dynamic_A_symbol_179.evaluate(evaluator, T_Integer, A_symbol_178);
				DomainType static_A_symbol_180 = valueFactory.typeOf(A_symbol_179, I_1);
				LibraryBinaryOperation dynamic_A_symbol_180 = (LibraryBinaryOperation)static_A_symbol_180.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_180 = dynamic_A_symbol_180.evaluate(evaluator, T_Boolean, A_symbol_179, I_1);
				rightA_symbol_175 = A_symbol_180;
			} catch (InvalidValueException e) {
				rightA_symbol_175 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_180 = rightA_symbol_175;
			DomainType static_A_symbol_175 = valueFactory.typeOf(A_symbol_177);
			LibraryBinaryOperation dynamic_A_symbol_175 = (LibraryBinaryOperation)static_A_symbol_175.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_175 = dynamic_A_symbol_175.evaluate(evaluator, T_Boolean, A_symbol_177, A_symbol_180);
			return A_symbol_175;
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
			
			Value leftA_symbol_181;
			try {
				
				Value A_symbol_182 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_183 = valueFactory.typeOf(A_symbol_182, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_183 = (LibraryBinaryOperation)static_A_symbol_183.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_183 = dynamic_A_symbol_183.evaluate(evaluator, T_Boolean, A_symbol_182, S_closure);
				leftA_symbol_181 = A_symbol_183;
			} catch (InvalidValueException e) {
				leftA_symbol_181 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_183 = leftA_symbol_181;
			Value rightA_symbol_181;
			try {
				
				Value A_symbol_184 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_185 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_184, P_TypedElement_type);
				
				DomainType static_A_symbol_186 = valueFactory.typeOf(A_symbol_185);
				LibraryBinaryOperation dynamic_A_symbol_186 = (LibraryBinaryOperation)static_A_symbol_186.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_186 = dynamic_A_symbol_186.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_185, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_187 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_186, P_CollectionType_elementType);
				
					
					Value A_symbol_188 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_189 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_188, P_TypedElement_type);
					
					DomainType static_A_symbol_190 = valueFactory.typeOf(A_symbol_189);
					LibraryBinaryOperation dynamic_A_symbol_190 = (LibraryBinaryOperation)static_A_symbol_190.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_190 = dynamic_A_symbol_190.evaluate(evaluator, T_Boolean, A_symbol_189, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_191;
				if (A_symbol_190.isTrue()) {
					
					Value A_symbol_192 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_193 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_192, P_TypedElement_type);
					
					DomainType static_A_symbol_194 = valueFactory.typeOf(A_symbol_193);
					LibraryBinaryOperation dynamic_A_symbol_194 = (LibraryBinaryOperation)static_A_symbol_194.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_194 = dynamic_A_symbol_194.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_193, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_195 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_194, P_CollectionType_elementType);
					
					A_symbol_191 = A_symbol_195;
				}
				else if (A_symbol_190.isFalse()) {
					
					Value A_symbol_196 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_197 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_196, P_TypedElement_type);
					
					A_symbol_191 = A_symbol_197;
				}
				else if (A_symbol_190.isNull()) {
					A_symbol_191 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_191 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				DomainType static_A_symbol_198 = valueFactory.typeOf(A_symbol_187, A_symbol_191);
				LibraryBinaryOperation dynamic_A_symbol_198 = (LibraryBinaryOperation)static_A_symbol_198.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_198 = dynamic_A_symbol_198.evaluate(evaluator, T_Boolean, A_symbol_187, A_symbol_191);
				rightA_symbol_181 = A_symbol_198;
			} catch (InvalidValueException e) {
				rightA_symbol_181 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_198 = rightA_symbol_181;
			DomainType static_A_symbol_181 = valueFactory.typeOf(A_symbol_183);
			LibraryBinaryOperation dynamic_A_symbol_181 = (LibraryBinaryOperation)static_A_symbol_181.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_181 = dynamic_A_symbol_181.evaluate(evaluator, T_Boolean, A_symbol_183, A_symbol_198);
			return A_symbol_181;
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
			
			Value leftA_symbol_199;
			try {
				
				Value A_symbol_200 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_201 = valueFactory.typeOf(A_symbol_200, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_201 = (LibraryBinaryOperation)static_A_symbol_201.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_201 = dynamic_A_symbol_201.evaluate(evaluator, T_Boolean, A_symbol_200, S_closure);
				leftA_symbol_199 = A_symbol_201;
			} catch (InvalidValueException e) {
				leftA_symbol_199 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_201 = leftA_symbol_199;
			Value rightA_symbol_199;
			try {
					Value leftA_symbol_202;
					try {
						
						Value A_symbol_203 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_204 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_203, P_TypedElement_type);
						
						DomainType static_A_symbol_205 = valueFactory.typeOf(A_symbol_204);
						LibraryBinaryOperation dynamic_A_symbol_205 = (LibraryBinaryOperation)static_A_symbol_205.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_205 = dynamic_A_symbol_205.evaluate(evaluator, T_Boolean, A_symbol_204, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_202 = A_symbol_205;
					} catch (InvalidValueException e) {
						leftA_symbol_202 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_205 = leftA_symbol_202;
					Value rightA_symbol_202;
					try {
						
						Value A_symbol_206 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_207 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_206, P_TypedElement_type);
						
						DomainType static_A_symbol_208 = valueFactory.typeOf(A_symbol_207);
						LibraryBinaryOperation dynamic_A_symbol_208 = (LibraryBinaryOperation)static_A_symbol_208.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_208 = dynamic_A_symbol_208.evaluate(evaluator, T_Boolean, A_symbol_207, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_202 = A_symbol_208;
					} catch (InvalidValueException e) {
						rightA_symbol_202 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_208 = rightA_symbol_202;
					DomainType static_A_symbol_202 = valueFactory.typeOf(A_symbol_205);
					LibraryBinaryOperation dynamic_A_symbol_202 = (LibraryBinaryOperation)static_A_symbol_202.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_202 = dynamic_A_symbol_202.evaluate(evaluator, T_Boolean, A_symbol_205, A_symbol_208);
				Value A_symbol_209;
				if (A_symbol_202.isTrue()) {
					
					Value A_symbol_210 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_211 = valueFactory.typeOf(A_symbol_210);
					LibraryBinaryOperation dynamic_A_symbol_211 = (LibraryBinaryOperation)static_A_symbol_211.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_211 = dynamic_A_symbol_211.evaluate(evaluator, T_Boolean, A_symbol_210, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_209 = A_symbol_211;
				}
				else if (A_symbol_202.isFalse()) {
					
					Value A_symbol_212 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_213 = valueFactory.typeOf(A_symbol_212);
					LibraryBinaryOperation dynamic_A_symbol_213 = (LibraryBinaryOperation)static_A_symbol_213.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_213 = dynamic_A_symbol_213.evaluate(evaluator, T_Boolean, A_symbol_212, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
					A_symbol_209 = A_symbol_213;
				}
				else if (A_symbol_202.isNull()) {
					A_symbol_209 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_209 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_199 = A_symbol_209;
			} catch (InvalidValueException e) {
				rightA_symbol_199 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_209 = rightA_symbol_199;
			DomainType static_A_symbol_199 = valueFactory.typeOf(A_symbol_201);
			LibraryBinaryOperation dynamic_A_symbol_199 = (LibraryBinaryOperation)static_A_symbol_199.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_199 = dynamic_A_symbol_199.evaluate(evaluator, T_Boolean, A_symbol_201, A_symbol_209);
			return A_symbol_199;
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
			
			Value leftA_symbol_214;
			try {
				
				Value A_symbol_215 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_216 = valueFactory.typeOf(A_symbol_215, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_216 = (LibraryBinaryOperation)static_A_symbol_216.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_216 = dynamic_A_symbol_216.evaluate(evaluator, T_Boolean, A_symbol_215, S_collect);
				leftA_symbol_214 = A_symbol_216;
			} catch (InvalidValueException e) {
				leftA_symbol_214 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_216 = leftA_symbol_214;
			Value rightA_symbol_214;
			try {
				
				Value A_symbol_217 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_218 = valueFactory.typeOf(A_symbol_217);
				LibraryBinaryOperation dynamic_A_symbol_218 = (LibraryBinaryOperation)static_A_symbol_218.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_218 = dynamic_A_symbol_218.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_217, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_219 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_218, P_CollectionType_elementType);
				
				
				Value A_symbol_220 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_221 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_220, P_TypedElement_type);
				
				DomainType static_A_symbol_222 = valueFactory.typeOf(A_symbol_221);
				LibraryBinaryOperation dynamic_A_symbol_222 = (LibraryBinaryOperation)static_A_symbol_222.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_222 = dynamic_A_symbol_222.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_221, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_223 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_222, P_CollectionType_elementType);
				
				DomainType static_A_symbol_224 = valueFactory.typeOf(A_symbol_219, A_symbol_223);
				LibraryBinaryOperation dynamic_A_symbol_224 = (LibraryBinaryOperation)static_A_symbol_224.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_224 = dynamic_A_symbol_224.evaluate(evaluator, T_Boolean, A_symbol_219, A_symbol_223);
				rightA_symbol_214 = A_symbol_224;
			} catch (InvalidValueException e) {
				rightA_symbol_214 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_224 = rightA_symbol_214;
			DomainType static_A_symbol_214 = valueFactory.typeOf(A_symbol_216);
			LibraryBinaryOperation dynamic_A_symbol_214 = (LibraryBinaryOperation)static_A_symbol_214.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_214 = dynamic_A_symbol_214.evaluate(evaluator, T_Boolean, A_symbol_216, A_symbol_224);
			return A_symbol_214;
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
			
			Value leftA_symbol_225;
			try {
				
				Value A_symbol_226 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_227 = valueFactory.typeOf(A_symbol_226, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_227 = (LibraryBinaryOperation)static_A_symbol_227.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_227 = dynamic_A_symbol_227.evaluate(evaluator, T_Boolean, A_symbol_226, S_collect);
				leftA_symbol_225 = A_symbol_227;
			} catch (InvalidValueException e) {
				leftA_symbol_225 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_227 = leftA_symbol_225;
			Value rightA_symbol_225;
			try {
				
				Value A_symbol_228 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_229 = valueFactory.typeOf(A_symbol_228);
				LibraryUnaryOperation dynamic_A_symbol_229 = (LibraryUnaryOperation)static_A_symbol_229.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_229 = dynamic_A_symbol_229.evaluate(evaluator, T_Integer, A_symbol_228);
				DomainType static_A_symbol_230 = valueFactory.typeOf(A_symbol_229, I_1);
				LibraryBinaryOperation dynamic_A_symbol_230 = (LibraryBinaryOperation)static_A_symbol_230.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_230 = dynamic_A_symbol_230.evaluate(evaluator, T_Boolean, A_symbol_229, I_1);
				rightA_symbol_225 = A_symbol_230;
			} catch (InvalidValueException e) {
				rightA_symbol_225 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_230 = rightA_symbol_225;
			DomainType static_A_symbol_225 = valueFactory.typeOf(A_symbol_227);
			LibraryBinaryOperation dynamic_A_symbol_225 = (LibraryBinaryOperation)static_A_symbol_225.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_225 = dynamic_A_symbol_225.evaluate(evaluator, T_Boolean, A_symbol_227, A_symbol_230);
			return A_symbol_225;
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
			
			Value leftA_symbol_231;
			try {
				
				Value A_symbol_232 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_233 = valueFactory.typeOf(A_symbol_232, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_233 = (LibraryBinaryOperation)static_A_symbol_233.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_233 = dynamic_A_symbol_233.evaluate(evaluator, T_Boolean, A_symbol_232, S_collectN___);
				leftA_symbol_231 = A_symbol_233;
			} catch (InvalidValueException e) {
				leftA_symbol_231 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_233 = leftA_symbol_231;
			Value rightA_symbol_231;
			try {
				
				Value A_symbol_234 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_235 = valueFactory.typeOf(A_symbol_234);
				LibraryUnaryOperation dynamic_A_symbol_235 = (LibraryUnaryOperation)static_A_symbol_235.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_235 = dynamic_A_symbol_235.evaluate(evaluator, T_Integer, A_symbol_234);
				DomainType static_A_symbol_236 = valueFactory.typeOf(A_symbol_235, I_1);
				LibraryBinaryOperation dynamic_A_symbol_236 = (LibraryBinaryOperation)static_A_symbol_236.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_236 = dynamic_A_symbol_236.evaluate(evaluator, T_Boolean, A_symbol_235, I_1);
				rightA_symbol_231 = A_symbol_236;
			} catch (InvalidValueException e) {
				rightA_symbol_231 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_236 = rightA_symbol_231;
			DomainType static_A_symbol_231 = valueFactory.typeOf(A_symbol_233);
			LibraryBinaryOperation dynamic_A_symbol_231 = (LibraryBinaryOperation)static_A_symbol_231.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_231 = dynamic_A_symbol_231.evaluate(evaluator, T_Boolean, A_symbol_233, A_symbol_236);
			return A_symbol_231;
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
			
			Value leftA_symbol_237;
			try {
				
				Value A_symbol_238 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_239 = valueFactory.typeOf(A_symbol_238, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_239 = (LibraryBinaryOperation)static_A_symbol_239.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_239 = dynamic_A_symbol_239.evaluate(evaluator, T_Boolean, A_symbol_238, S_collectN___);
				leftA_symbol_237 = A_symbol_239;
			} catch (InvalidValueException e) {
				leftA_symbol_237 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_239 = leftA_symbol_237;
			Value rightA_symbol_237;
			try {
				
				Value A_symbol_240 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_241 = valueFactory.typeOf(A_symbol_240);
				LibraryBinaryOperation dynamic_A_symbol_241 = (LibraryBinaryOperation)static_A_symbol_241.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_241 = dynamic_A_symbol_241.evaluate(evaluator, T_Boolean, A_symbol_240, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
				rightA_symbol_237 = A_symbol_241;
			} catch (InvalidValueException e) {
				rightA_symbol_237 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_241 = rightA_symbol_237;
			DomainType static_A_symbol_237 = valueFactory.typeOf(A_symbol_239);
			LibraryBinaryOperation dynamic_A_symbol_237 = (LibraryBinaryOperation)static_A_symbol_237.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_237 = dynamic_A_symbol_237.evaluate(evaluator, T_Boolean, A_symbol_239, A_symbol_241);
			return A_symbol_237;
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
			
			Value leftA_symbol_242;
			try {
				
				Value A_symbol_243 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_244 = valueFactory.typeOf(A_symbol_243, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_244 = (LibraryBinaryOperation)static_A_symbol_244.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_244 = dynamic_A_symbol_244.evaluate(evaluator, T_Boolean, A_symbol_243, S_collectN___);
				leftA_symbol_242 = A_symbol_244;
			} catch (InvalidValueException e) {
				leftA_symbol_242 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_244 = leftA_symbol_242;
			Value rightA_symbol_242;
			try {
				
				Value A_symbol_245 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_246 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_247 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_246, P_TypedElement_type);
				
				DomainType static_A_symbol_248 = valueFactory.typeOf(A_symbol_245, A_symbol_247);
				LibraryBinaryOperation dynamic_A_symbol_248 = (LibraryBinaryOperation)static_A_symbol_248.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_248 = dynamic_A_symbol_248.evaluate(evaluator, T_Boolean, A_symbol_245, A_symbol_247);
				rightA_symbol_242 = A_symbol_248;
			} catch (InvalidValueException e) {
				rightA_symbol_242 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_248 = rightA_symbol_242;
			DomainType static_A_symbol_242 = valueFactory.typeOf(A_symbol_244);
			LibraryBinaryOperation dynamic_A_symbol_242 = (LibraryBinaryOperation)static_A_symbol_242.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_242 = dynamic_A_symbol_242.evaluate(evaluator, T_Boolean, A_symbol_244, A_symbol_248);
			return A_symbol_242;
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
			
			Value leftA_symbol_249;
			try {
				
				Value A_symbol_250 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_251 = valueFactory.typeOf(A_symbol_250, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_251 = (LibraryBinaryOperation)static_A_symbol_251.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_251 = dynamic_A_symbol_251.evaluate(evaluator, T_Boolean, A_symbol_250, S_collect);
				leftA_symbol_249 = A_symbol_251;
			} catch (InvalidValueException e) {
				leftA_symbol_249 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_251 = leftA_symbol_249;
			Value rightA_symbol_249;
			try {
					Value leftA_symbol_252;
					try {
						
						Value A_symbol_253 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_254 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_253, P_TypedElement_type);
						
						DomainType static_A_symbol_255 = valueFactory.typeOf(A_symbol_254);
						LibraryBinaryOperation dynamic_A_symbol_255 = (LibraryBinaryOperation)static_A_symbol_255.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_255 = dynamic_A_symbol_255.evaluate(evaluator, T_Boolean, A_symbol_254, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_252 = A_symbol_255;
					} catch (InvalidValueException e) {
						leftA_symbol_252 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_255 = leftA_symbol_252;
					Value rightA_symbol_252;
					try {
						
						Value A_symbol_256 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_257 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_256, P_TypedElement_type);
						
						DomainType static_A_symbol_258 = valueFactory.typeOf(A_symbol_257);
						LibraryBinaryOperation dynamic_A_symbol_258 = (LibraryBinaryOperation)static_A_symbol_258.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_258 = dynamic_A_symbol_258.evaluate(evaluator, T_Boolean, A_symbol_257, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_252 = A_symbol_258;
					} catch (InvalidValueException e) {
						rightA_symbol_252 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_258 = rightA_symbol_252;
					DomainType static_A_symbol_252 = valueFactory.typeOf(A_symbol_255);
					LibraryBinaryOperation dynamic_A_symbol_252 = (LibraryBinaryOperation)static_A_symbol_252.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_252 = dynamic_A_symbol_252.evaluate(evaluator, T_Boolean, A_symbol_255, A_symbol_258);
				Value A_symbol_259;
				if (A_symbol_252.isTrue()) {
					
					Value A_symbol_260 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_261 = valueFactory.typeOf(A_symbol_260);
					LibraryBinaryOperation dynamic_A_symbol_261 = (LibraryBinaryOperation)static_A_symbol_261.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_261 = dynamic_A_symbol_261.evaluate(evaluator, T_Boolean, A_symbol_260, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_259 = A_symbol_261;
				}
				else if (A_symbol_252.isFalse()) {
					
					Value A_symbol_262 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_263 = valueFactory.typeOf(A_symbol_262);
					LibraryBinaryOperation dynamic_A_symbol_263 = (LibraryBinaryOperation)static_A_symbol_263.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_263 = dynamic_A_symbol_263.evaluate(evaluator, T_Boolean, A_symbol_262, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
					A_symbol_259 = A_symbol_263;
				}
				else if (A_symbol_252.isNull()) {
					A_symbol_259 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_259 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_249 = A_symbol_259;
			} catch (InvalidValueException e) {
				rightA_symbol_249 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_259 = rightA_symbol_249;
			DomainType static_A_symbol_249 = valueFactory.typeOf(A_symbol_251);
			LibraryBinaryOperation dynamic_A_symbol_249 = (LibraryBinaryOperation)static_A_symbol_249.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_249 = dynamic_A_symbol_249.evaluate(evaluator, T_Boolean, A_symbol_251, A_symbol_259);
			return A_symbol_249;
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
			
			Value leftA_symbol_264;
			try {
				
				Value A_symbol_265 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_266 = valueFactory.typeOf(A_symbol_265, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_266 = (LibraryBinaryOperation)static_A_symbol_266.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_266 = dynamic_A_symbol_266.evaluate(evaluator, T_Boolean, A_symbol_265, S_exists);
				leftA_symbol_264 = A_symbol_266;
			} catch (InvalidValueException e) {
				leftA_symbol_264 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_266 = leftA_symbol_264;
			Value rightA_symbol_264;
			try {
				
				Value A_symbol_267 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_268 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_267, P_TypedElement_type);
				
				DomainType static_A_symbol_269 = valueFactory.typeOf(A_symbol_268, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_269 = (LibraryBinaryOperation)static_A_symbol_269.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_269 = dynamic_A_symbol_269.evaluate(evaluator, T_Boolean, A_symbol_268, T_ClassClassifier_Boolean_);
				rightA_symbol_264 = A_symbol_269;
			} catch (InvalidValueException e) {
				rightA_symbol_264 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_269 = rightA_symbol_264;
			DomainType static_A_symbol_264 = valueFactory.typeOf(A_symbol_266);
			LibraryBinaryOperation dynamic_A_symbol_264 = (LibraryBinaryOperation)static_A_symbol_264.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_264 = dynamic_A_symbol_264.evaluate(evaluator, T_Boolean, A_symbol_266, A_symbol_269);
			return A_symbol_264;
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
			
			Value leftA_symbol_270;
			try {
				
				Value A_symbol_271 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_272 = valueFactory.typeOf(A_symbol_271, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_272 = (LibraryBinaryOperation)static_A_symbol_272.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_272 = dynamic_A_symbol_272.evaluate(evaluator, T_Boolean, A_symbol_271, S_exists);
				leftA_symbol_270 = A_symbol_272;
			} catch (InvalidValueException e) {
				leftA_symbol_270 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_272 = leftA_symbol_270;
			Value rightA_symbol_270;
			try {
				
				Value A_symbol_273 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_274 = valueFactory.typeOf(A_symbol_273, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_274 = (LibraryBinaryOperation)static_A_symbol_274.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_274 = dynamic_A_symbol_274.evaluate(evaluator, T_Boolean, A_symbol_273, T_ClassClassifier_Boolean_);
				rightA_symbol_270 = A_symbol_274;
			} catch (InvalidValueException e) {
				rightA_symbol_270 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_274 = rightA_symbol_270;
			DomainType static_A_symbol_270 = valueFactory.typeOf(A_symbol_272);
			LibraryBinaryOperation dynamic_A_symbol_270 = (LibraryBinaryOperation)static_A_symbol_270.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_270 = dynamic_A_symbol_270.evaluate(evaluator, T_Boolean, A_symbol_272, A_symbol_274);
			return A_symbol_270;
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
			
			Value leftA_symbol_275;
			try {
				
				Value A_symbol_276 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_277 = valueFactory.typeOf(A_symbol_276, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_277 = (LibraryBinaryOperation)static_A_symbol_277.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_277 = dynamic_A_symbol_277.evaluate(evaluator, T_Boolean, A_symbol_276, S_forAll);
				leftA_symbol_275 = A_symbol_277;
			} catch (InvalidValueException e) {
				leftA_symbol_275 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_277 = leftA_symbol_275;
			Value rightA_symbol_275;
			try {
				
				Value A_symbol_278 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_279 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_278, P_TypedElement_type);
				
				DomainType static_A_symbol_280 = valueFactory.typeOf(A_symbol_279, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_280 = (LibraryBinaryOperation)static_A_symbol_280.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_280 = dynamic_A_symbol_280.evaluate(evaluator, T_Boolean, A_symbol_279, T_ClassClassifier_Boolean_);
				rightA_symbol_275 = A_symbol_280;
			} catch (InvalidValueException e) {
				rightA_symbol_275 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_280 = rightA_symbol_275;
			DomainType static_A_symbol_275 = valueFactory.typeOf(A_symbol_277);
			LibraryBinaryOperation dynamic_A_symbol_275 = (LibraryBinaryOperation)static_A_symbol_275.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_275 = dynamic_A_symbol_275.evaluate(evaluator, T_Boolean, A_symbol_277, A_symbol_280);
			return A_symbol_275;
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
			
			Value leftA_symbol_281;
			try {
				
				Value A_symbol_282 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_283 = valueFactory.typeOf(A_symbol_282, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_283 = (LibraryBinaryOperation)static_A_symbol_283.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_283 = dynamic_A_symbol_283.evaluate(evaluator, T_Boolean, A_symbol_282, S_forAll);
				leftA_symbol_281 = A_symbol_283;
			} catch (InvalidValueException e) {
				leftA_symbol_281 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_283 = leftA_symbol_281;
			Value rightA_symbol_281;
			try {
				
				Value A_symbol_284 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_285 = valueFactory.typeOf(A_symbol_284, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_285 = (LibraryBinaryOperation)static_A_symbol_285.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_285 = dynamic_A_symbol_285.evaluate(evaluator, T_Boolean, A_symbol_284, T_ClassClassifier_Boolean_);
				rightA_symbol_281 = A_symbol_285;
			} catch (InvalidValueException e) {
				rightA_symbol_281 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_285 = rightA_symbol_281;
			DomainType static_A_symbol_281 = valueFactory.typeOf(A_symbol_283);
			LibraryBinaryOperation dynamic_A_symbol_281 = (LibraryBinaryOperation)static_A_symbol_281.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_281 = dynamic_A_symbol_281.evaluate(evaluator, T_Boolean, A_symbol_283, A_symbol_285);
			return A_symbol_281;
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
			
			Value leftA_symbol_286;
			try {
				
				Value A_symbol_287 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_288 = valueFactory.typeOf(A_symbol_287, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_288 = (LibraryBinaryOperation)static_A_symbol_288.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_288 = dynamic_A_symbol_288.evaluate(evaluator, T_Boolean, A_symbol_287, S_isUnique);
				leftA_symbol_286 = A_symbol_288;
			} catch (InvalidValueException e) {
				leftA_symbol_286 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_288 = leftA_symbol_286;
			Value rightA_symbol_286;
			try {
				
				Value A_symbol_289 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_290 = valueFactory.typeOf(A_symbol_289);
				LibraryUnaryOperation dynamic_A_symbol_290 = (LibraryUnaryOperation)static_A_symbol_290.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_290 = dynamic_A_symbol_290.evaluate(evaluator, T_Integer, A_symbol_289);
				DomainType static_A_symbol_291 = valueFactory.typeOf(A_symbol_290, I_1);
				LibraryBinaryOperation dynamic_A_symbol_291 = (LibraryBinaryOperation)static_A_symbol_291.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_291 = dynamic_A_symbol_291.evaluate(evaluator, T_Boolean, A_symbol_290, I_1);
				rightA_symbol_286 = A_symbol_291;
			} catch (InvalidValueException e) {
				rightA_symbol_286 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_291 = rightA_symbol_286;
			DomainType static_A_symbol_286 = valueFactory.typeOf(A_symbol_288);
			LibraryBinaryOperation dynamic_A_symbol_286 = (LibraryBinaryOperation)static_A_symbol_286.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_286 = dynamic_A_symbol_286.evaluate(evaluator, T_Boolean, A_symbol_288, A_symbol_291);
			return A_symbol_286;
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
			
			Value leftA_symbol_292;
			try {
				
				Value A_symbol_293 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_294 = valueFactory.typeOf(A_symbol_293, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_294 = (LibraryBinaryOperation)static_A_symbol_294.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_294 = dynamic_A_symbol_294.evaluate(evaluator, T_Boolean, A_symbol_293, S_isUnique);
				leftA_symbol_292 = A_symbol_294;
			} catch (InvalidValueException e) {
				leftA_symbol_292 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_294 = leftA_symbol_292;
			Value rightA_symbol_292;
			try {
				
				Value A_symbol_295 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_296 = valueFactory.typeOf(A_symbol_295, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_296 = (LibraryBinaryOperation)static_A_symbol_296.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_296 = dynamic_A_symbol_296.evaluate(evaluator, T_Boolean, A_symbol_295, T_ClassClassifier_Boolean_);
				rightA_symbol_292 = A_symbol_296;
			} catch (InvalidValueException e) {
				rightA_symbol_292 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_296 = rightA_symbol_292;
			DomainType static_A_symbol_292 = valueFactory.typeOf(A_symbol_294);
			LibraryBinaryOperation dynamic_A_symbol_292 = (LibraryBinaryOperation)static_A_symbol_292.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_292 = dynamic_A_symbol_292.evaluate(evaluator, T_Boolean, A_symbol_294, A_symbol_296);
			return A_symbol_292;
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
			
			
			Value A_symbol_297 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_298 = new AbstractBinaryOperation()
			{
			/*
			type =
			source.type.oclAsType(_'file:/C:/GIT/org.eclipse.ocl/examples/org.eclipse.ocl.examples.pivot/model/Pivot.ecore'::ocl::CollectionType).elementType
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_299 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_1_, P_TypedElement_type);
					
					
					Value A_symbol_300 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
					
					Value A_symbol_301 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_300, P_TypedElement_type);
					
					DomainType static_A_symbol_302 = valueFactory.typeOf(A_symbol_301);
					LibraryBinaryOperation dynamic_A_symbol_302 = (LibraryBinaryOperation)static_A_symbol_302.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_302 = dynamic_A_symbol_302.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_301, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_303 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_302, P_CollectionType_elementType);
					
					DomainType static_A_symbol_304 = valueFactory.typeOf(A_symbol_299, A_symbol_303);
					LibraryBinaryOperation dynamic_A_symbol_304 = (LibraryBinaryOperation)static_A_symbol_304.lookupImplementation(standardLibrary, O_OclAny__eq_);
					Value A_symbol_304 = dynamic_A_symbol_304.evaluate(evaluator, T_Boolean, A_symbol_299, A_symbol_303);
					return A_symbol_304;
				}
			};
			DomainType static_A_symbol_298 = A_symbol_297.getType();
			LibraryIteration dynamic_A_symbol_298 = (LibraryIteration)static_A_symbol_298.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_298 = dynamic_A_symbol_298.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_298 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_298, (CollectionValue)A_symbol_297, acc_A_symbol_298);
			Value A_symbol_298 = dynamic_A_symbol_298.evaluateIteration(manager_A_symbol_298);
			return A_symbol_298;
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
			
			Value leftA_symbol_305;
			try {
				
				Value A_symbol_306 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_307 = valueFactory.typeOf(A_symbol_306, S_one);
				LibraryBinaryOperation dynamic_A_symbol_307 = (LibraryBinaryOperation)static_A_symbol_307.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_307 = dynamic_A_symbol_307.evaluate(evaluator, T_Boolean, A_symbol_306, S_one);
				leftA_symbol_305 = A_symbol_307;
			} catch (InvalidValueException e) {
				leftA_symbol_305 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_307 = leftA_symbol_305;
			Value rightA_symbol_305;
			try {
				
				Value A_symbol_308 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_309 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_308, P_TypedElement_type);
				
				DomainType static_A_symbol_310 = valueFactory.typeOf(A_symbol_309, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_310 = (LibraryBinaryOperation)static_A_symbol_310.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_310 = dynamic_A_symbol_310.evaluate(evaluator, T_Boolean, A_symbol_309, T_ClassClassifier_Boolean_);
				rightA_symbol_305 = A_symbol_310;
			} catch (InvalidValueException e) {
				rightA_symbol_305 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_310 = rightA_symbol_305;
			DomainType static_A_symbol_305 = valueFactory.typeOf(A_symbol_307);
			LibraryBinaryOperation dynamic_A_symbol_305 = (LibraryBinaryOperation)static_A_symbol_305.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_305 = dynamic_A_symbol_305.evaluate(evaluator, T_Boolean, A_symbol_307, A_symbol_310);
			return A_symbol_305;
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
			
			Value leftA_symbol_311;
			try {
				
				Value A_symbol_312 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_313 = valueFactory.typeOf(A_symbol_312, S_one);
				LibraryBinaryOperation dynamic_A_symbol_313 = (LibraryBinaryOperation)static_A_symbol_313.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_313 = dynamic_A_symbol_313.evaluate(evaluator, T_Boolean, A_symbol_312, S_one);
				leftA_symbol_311 = A_symbol_313;
			} catch (InvalidValueException e) {
				leftA_symbol_311 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_313 = leftA_symbol_311;
			Value rightA_symbol_311;
			try {
				
				Value A_symbol_314 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_315 = valueFactory.typeOf(A_symbol_314);
				LibraryUnaryOperation dynamic_A_symbol_315 = (LibraryUnaryOperation)static_A_symbol_315.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_315 = dynamic_A_symbol_315.evaluate(evaluator, T_Integer, A_symbol_314);
				DomainType static_A_symbol_316 = valueFactory.typeOf(A_symbol_315, I_1);
				LibraryBinaryOperation dynamic_A_symbol_316 = (LibraryBinaryOperation)static_A_symbol_316.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_316 = dynamic_A_symbol_316.evaluate(evaluator, T_Boolean, A_symbol_315, I_1);
				rightA_symbol_311 = A_symbol_316;
			} catch (InvalidValueException e) {
				rightA_symbol_311 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_316 = rightA_symbol_311;
			DomainType static_A_symbol_311 = valueFactory.typeOf(A_symbol_313);
			LibraryBinaryOperation dynamic_A_symbol_311 = (LibraryBinaryOperation)static_A_symbol_311.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_311 = dynamic_A_symbol_311.evaluate(evaluator, T_Boolean, A_symbol_313, A_symbol_316);
			return A_symbol_311;
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
			
			Value leftA_symbol_317;
			try {
				
				Value A_symbol_318 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_319 = valueFactory.typeOf(A_symbol_318, S_one);
				LibraryBinaryOperation dynamic_A_symbol_319 = (LibraryBinaryOperation)static_A_symbol_319.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_319 = dynamic_A_symbol_319.evaluate(evaluator, T_Boolean, A_symbol_318, S_one);
				leftA_symbol_317 = A_symbol_319;
			} catch (InvalidValueException e) {
				leftA_symbol_317 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_319 = leftA_symbol_317;
			Value rightA_symbol_317;
			try {
				
				Value A_symbol_320 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_321 = valueFactory.typeOf(A_symbol_320, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_321 = (LibraryBinaryOperation)static_A_symbol_321.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_321 = dynamic_A_symbol_321.evaluate(evaluator, T_Boolean, A_symbol_320, T_ClassClassifier_Boolean_);
				rightA_symbol_317 = A_symbol_321;
			} catch (InvalidValueException e) {
				rightA_symbol_317 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_321 = rightA_symbol_317;
			DomainType static_A_symbol_317 = valueFactory.typeOf(A_symbol_319);
			LibraryBinaryOperation dynamic_A_symbol_317 = (LibraryBinaryOperation)static_A_symbol_317.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_317 = dynamic_A_symbol_317.evaluate(evaluator, T_Boolean, A_symbol_319, A_symbol_321);
			return A_symbol_317;
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
			
			Value leftA_symbol_322;
			try {
				Value leftA_symbol_323;
				try {
					
					Value A_symbol_324 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_325 = valueFactory.typeOf(A_symbol_324, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_325 = (LibraryBinaryOperation)static_A_symbol_325.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_325 = dynamic_A_symbol_325.evaluate(evaluator, T_Boolean, A_symbol_324, S_reject);
					leftA_symbol_323 = A_symbol_325;
				} catch (InvalidValueException e) {
					leftA_symbol_323 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_325 = leftA_symbol_323;
				Value rightA_symbol_323;
				try {
					
					Value A_symbol_326 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_327 = valueFactory.typeOf(A_symbol_326, S_select);
					LibraryBinaryOperation dynamic_A_symbol_327 = (LibraryBinaryOperation)static_A_symbol_327.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_327 = dynamic_A_symbol_327.evaluate(evaluator, T_Boolean, A_symbol_326, S_select);
					rightA_symbol_323 = A_symbol_327;
				} catch (InvalidValueException e) {
					rightA_symbol_323 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_327 = rightA_symbol_323;
				DomainType static_A_symbol_323 = valueFactory.typeOf(A_symbol_325);
				LibraryBinaryOperation dynamic_A_symbol_323 = (LibraryBinaryOperation)static_A_symbol_323.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_323 = dynamic_A_symbol_323.evaluate(evaluator, T_Boolean, A_symbol_325, A_symbol_327);
				leftA_symbol_322 = A_symbol_323;
			} catch (InvalidValueException e) {
				leftA_symbol_322 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_323 = leftA_symbol_322;
			Value rightA_symbol_322;
			try {
				
				Value A_symbol_328 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_329 = valueFactory.typeOf(A_symbol_328);
				LibraryUnaryOperation dynamic_A_symbol_329 = (LibraryUnaryOperation)static_A_symbol_329.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_329 = dynamic_A_symbol_329.evaluate(evaluator, T_Integer, A_symbol_328);
				DomainType static_A_symbol_330 = valueFactory.typeOf(A_symbol_329, I_1);
				LibraryBinaryOperation dynamic_A_symbol_330 = (LibraryBinaryOperation)static_A_symbol_330.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_330 = dynamic_A_symbol_330.evaluate(evaluator, T_Boolean, A_symbol_329, I_1);
				rightA_symbol_322 = A_symbol_330;
			} catch (InvalidValueException e) {
				rightA_symbol_322 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_330 = rightA_symbol_322;
			DomainType static_A_symbol_322 = valueFactory.typeOf(A_symbol_323);
			LibraryBinaryOperation dynamic_A_symbol_322 = (LibraryBinaryOperation)static_A_symbol_322.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_322 = dynamic_A_symbol_322.evaluate(evaluator, T_Boolean, A_symbol_323, A_symbol_330);
			return A_symbol_322;
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
			
			Value leftA_symbol_331;
			try {
				Value leftA_symbol_332;
				try {
					
					Value A_symbol_333 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_334 = valueFactory.typeOf(A_symbol_333, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_334 = (LibraryBinaryOperation)static_A_symbol_334.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_334 = dynamic_A_symbol_334.evaluate(evaluator, T_Boolean, A_symbol_333, S_reject);
					leftA_symbol_332 = A_symbol_334;
				} catch (InvalidValueException e) {
					leftA_symbol_332 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_334 = leftA_symbol_332;
				Value rightA_symbol_332;
				try {
					
					Value A_symbol_335 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_336 = valueFactory.typeOf(A_symbol_335, S_select);
					LibraryBinaryOperation dynamic_A_symbol_336 = (LibraryBinaryOperation)static_A_symbol_336.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_336 = dynamic_A_symbol_336.evaluate(evaluator, T_Boolean, A_symbol_335, S_select);
					rightA_symbol_332 = A_symbol_336;
				} catch (InvalidValueException e) {
					rightA_symbol_332 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_336 = rightA_symbol_332;
				DomainType static_A_symbol_332 = valueFactory.typeOf(A_symbol_334);
				LibraryBinaryOperation dynamic_A_symbol_332 = (LibraryBinaryOperation)static_A_symbol_332.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_332 = dynamic_A_symbol_332.evaluate(evaluator, T_Boolean, A_symbol_334, A_symbol_336);
				leftA_symbol_331 = A_symbol_332;
			} catch (InvalidValueException e) {
				leftA_symbol_331 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_332 = leftA_symbol_331;
			Value rightA_symbol_331;
			try {
				
				Value A_symbol_337 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_338 = valueFactory.typeOf(A_symbol_337, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_338 = (LibraryBinaryOperation)static_A_symbol_338.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_338 = dynamic_A_symbol_338.evaluate(evaluator, T_Boolean, A_symbol_337, T_ClassClassifier_Boolean_);
				rightA_symbol_331 = A_symbol_338;
			} catch (InvalidValueException e) {
				rightA_symbol_331 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_338 = rightA_symbol_331;
			DomainType static_A_symbol_331 = valueFactory.typeOf(A_symbol_332);
			LibraryBinaryOperation dynamic_A_symbol_331 = (LibraryBinaryOperation)static_A_symbol_331.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_331 = dynamic_A_symbol_331.evaluate(evaluator, T_Boolean, A_symbol_332, A_symbol_338);
			return A_symbol_331;
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
			
			Value leftA_symbol_339;
			try {
				Value leftA_symbol_340;
				try {
					
					Value A_symbol_341 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_342 = valueFactory.typeOf(A_symbol_341, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_342 = (LibraryBinaryOperation)static_A_symbol_342.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_342 = dynamic_A_symbol_342.evaluate(evaluator, T_Boolean, A_symbol_341, S_reject);
					leftA_symbol_340 = A_symbol_342;
				} catch (InvalidValueException e) {
					leftA_symbol_340 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_342 = leftA_symbol_340;
				Value rightA_symbol_340;
				try {
					
					Value A_symbol_343 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_344 = valueFactory.typeOf(A_symbol_343, S_select);
					LibraryBinaryOperation dynamic_A_symbol_344 = (LibraryBinaryOperation)static_A_symbol_344.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_344 = dynamic_A_symbol_344.evaluate(evaluator, T_Boolean, A_symbol_343, S_select);
					rightA_symbol_340 = A_symbol_344;
				} catch (InvalidValueException e) {
					rightA_symbol_340 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_344 = rightA_symbol_340;
				DomainType static_A_symbol_340 = valueFactory.typeOf(A_symbol_342);
				LibraryBinaryOperation dynamic_A_symbol_340 = (LibraryBinaryOperation)static_A_symbol_340.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_340 = dynamic_A_symbol_340.evaluate(evaluator, T_Boolean, A_symbol_342, A_symbol_344);
				leftA_symbol_339 = A_symbol_340;
			} catch (InvalidValueException e) {
				leftA_symbol_339 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_340 = leftA_symbol_339;
			Value rightA_symbol_339;
			try {
				
				Value A_symbol_345 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_346 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_347 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_346, P_TypedElement_type);
				
				DomainType static_A_symbol_348 = valueFactory.typeOf(A_symbol_345, A_symbol_347);
				LibraryBinaryOperation dynamic_A_symbol_348 = (LibraryBinaryOperation)static_A_symbol_348.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_348 = dynamic_A_symbol_348.evaluate(evaluator, T_Boolean, A_symbol_345, A_symbol_347);
				rightA_symbol_339 = A_symbol_348;
			} catch (InvalidValueException e) {
				rightA_symbol_339 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_348 = rightA_symbol_339;
			DomainType static_A_symbol_339 = valueFactory.typeOf(A_symbol_340);
			LibraryBinaryOperation dynamic_A_symbol_339 = (LibraryBinaryOperation)static_A_symbol_339.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_339 = dynamic_A_symbol_339.evaluate(evaluator, T_Boolean, A_symbol_340, A_symbol_348);
			return A_symbol_339;
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
			
			Value leftA_symbol_349;
			try {
				
				Value A_symbol_350 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_351 = valueFactory.typeOf(A_symbol_350, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_351 = (LibraryBinaryOperation)static_A_symbol_351.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_351 = dynamic_A_symbol_351.evaluate(evaluator, T_Boolean, A_symbol_350, S_sortedBy);
				leftA_symbol_349 = A_symbol_351;
			} catch (InvalidValueException e) {
				leftA_symbol_349 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_351 = leftA_symbol_349;
			Value rightA_symbol_349;
			try {
				
				Value A_symbol_352 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_353 = valueFactory.typeOf(A_symbol_352);
				LibraryBinaryOperation dynamic_A_symbol_353 = (LibraryBinaryOperation)static_A_symbol_353.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_353 = dynamic_A_symbol_353.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_352, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_354 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_353, P_CollectionType_elementType);
				
				
				Value A_symbol_355 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_356 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_355, P_TypedElement_type);
				
				DomainType static_A_symbol_357 = valueFactory.typeOf(A_symbol_356);
				LibraryBinaryOperation dynamic_A_symbol_357 = (LibraryBinaryOperation)static_A_symbol_357.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_357 = dynamic_A_symbol_357.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_356, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_358 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_357, P_CollectionType_elementType);
				
				DomainType static_A_symbol_359 = valueFactory.typeOf(A_symbol_354, A_symbol_358);
				LibraryBinaryOperation dynamic_A_symbol_359 = (LibraryBinaryOperation)static_A_symbol_359.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_359 = dynamic_A_symbol_359.evaluate(evaluator, T_Boolean, A_symbol_354, A_symbol_358);
				rightA_symbol_349 = A_symbol_359;
			} catch (InvalidValueException e) {
				rightA_symbol_349 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_359 = rightA_symbol_349;
			DomainType static_A_symbol_349 = valueFactory.typeOf(A_symbol_351);
			LibraryBinaryOperation dynamic_A_symbol_349 = (LibraryBinaryOperation)static_A_symbol_349.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_349 = dynamic_A_symbol_349.evaluate(evaluator, T_Boolean, A_symbol_351, A_symbol_359);
			return A_symbol_349;
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
			
			Value leftA_symbol_360;
			try {
				
				Value A_symbol_361 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_362 = valueFactory.typeOf(A_symbol_361, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_362 = (LibraryBinaryOperation)static_A_symbol_362.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_362 = dynamic_A_symbol_362.evaluate(evaluator, T_Boolean, A_symbol_361, S_sortedBy);
				leftA_symbol_360 = A_symbol_362;
			} catch (InvalidValueException e) {
				leftA_symbol_360 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_362 = leftA_symbol_360;
			Value rightA_symbol_360;
			try {
				
				Value A_symbol_363 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_364 = valueFactory.typeOf(A_symbol_363);
				LibraryUnaryOperation dynamic_A_symbol_364 = (LibraryUnaryOperation)static_A_symbol_364.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_364 = dynamic_A_symbol_364.evaluate(evaluator, T_Integer, A_symbol_363);
				DomainType static_A_symbol_365 = valueFactory.typeOf(A_symbol_364, I_1);
				LibraryBinaryOperation dynamic_A_symbol_365 = (LibraryBinaryOperation)static_A_symbol_365.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_365 = dynamic_A_symbol_365.evaluate(evaluator, T_Boolean, A_symbol_364, I_1);
				rightA_symbol_360 = A_symbol_365;
			} catch (InvalidValueException e) {
				rightA_symbol_360 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_365 = rightA_symbol_360;
			DomainType static_A_symbol_360 = valueFactory.typeOf(A_symbol_362);
			LibraryBinaryOperation dynamic_A_symbol_360 = (LibraryBinaryOperation)static_A_symbol_360.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_360 = dynamic_A_symbol_360.evaluate(evaluator, T_Boolean, A_symbol_362, A_symbol_365);
			return A_symbol_360;
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
			
			Value leftA_symbol_366;
			try {
				
				Value A_symbol_367 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_368 = valueFactory.typeOf(A_symbol_367, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_368 = (LibraryBinaryOperation)static_A_symbol_368.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_368 = dynamic_A_symbol_368.evaluate(evaluator, T_Boolean, A_symbol_367, S_sortedBy);
				leftA_symbol_366 = A_symbol_368;
			} catch (InvalidValueException e) {
				leftA_symbol_366 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_368 = leftA_symbol_366;
			Value rightA_symbol_366;
			try {
					Value leftA_symbol_369;
					try {
						
						Value A_symbol_370 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_371 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_370, P_TypedElement_type);
						
						DomainType static_A_symbol_372 = valueFactory.typeOf(A_symbol_371);
						LibraryBinaryOperation dynamic_A_symbol_372 = (LibraryBinaryOperation)static_A_symbol_372.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_372 = dynamic_A_symbol_372.evaluate(evaluator, T_Boolean, A_symbol_371, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_369 = A_symbol_372;
					} catch (InvalidValueException e) {
						leftA_symbol_369 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_372 = leftA_symbol_369;
					Value rightA_symbol_369;
					try {
						
						Value A_symbol_373 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_374 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_373, P_TypedElement_type);
						
						DomainType static_A_symbol_375 = valueFactory.typeOf(A_symbol_374);
						LibraryBinaryOperation dynamic_A_symbol_375 = (LibraryBinaryOperation)static_A_symbol_375.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_375 = dynamic_A_symbol_375.evaluate(evaluator, T_Boolean, A_symbol_374, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
						rightA_symbol_369 = A_symbol_375;
					} catch (InvalidValueException e) {
						rightA_symbol_369 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_375 = rightA_symbol_369;
					DomainType static_A_symbol_369 = valueFactory.typeOf(A_symbol_372);
					LibraryBinaryOperation dynamic_A_symbol_369 = (LibraryBinaryOperation)static_A_symbol_369.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_369 = dynamic_A_symbol_369.evaluate(evaluator, T_Boolean, A_symbol_372, A_symbol_375);
				Value A_symbol_376;
				if (A_symbol_369.isTrue()) {
					
					Value A_symbol_377 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_378 = valueFactory.typeOf(A_symbol_377);
					LibraryBinaryOperation dynamic_A_symbol_378 = (LibraryBinaryOperation)static_A_symbol_378.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_378 = dynamic_A_symbol_378.evaluate(evaluator, T_Boolean, A_symbol_377, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_376 = A_symbol_378;
				}
				else if (A_symbol_369.isFalse()) {
					
					Value A_symbol_379 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_380 = valueFactory.typeOf(A_symbol_379);
					LibraryBinaryOperation dynamic_A_symbol_380 = (LibraryBinaryOperation)static_A_symbol_380.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_380 = dynamic_A_symbol_380.evaluate(evaluator, T_Boolean, A_symbol_379, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_376 = A_symbol_380;
				}
				else if (A_symbol_369.isNull()) {
					A_symbol_376 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_376 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_366 = A_symbol_376;
			} catch (InvalidValueException e) {
				rightA_symbol_366 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_376 = rightA_symbol_366;
			DomainType static_A_symbol_366 = valueFactory.typeOf(A_symbol_368);
			LibraryBinaryOperation dynamic_A_symbol_366 = (LibraryBinaryOperation)static_A_symbol_366.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_366 = dynamic_A_symbol_366.evaluate(evaluator, T_Boolean, A_symbol_368, A_symbol_376);
			return A_symbol_366;
		}
	}
}

