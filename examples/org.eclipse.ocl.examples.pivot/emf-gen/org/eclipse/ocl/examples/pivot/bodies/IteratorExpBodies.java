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
			
			Value leftA_symbol_177;
			try {
				
				Value A_symbol_178 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_179 = valueFactory.typeOf(A_symbol_178, S_any);
				LibraryBinaryOperation dynamic_A_symbol_179 = (LibraryBinaryOperation)static_A_symbol_179.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_179 = dynamic_A_symbol_179.evaluate(evaluator, T_Boolean, A_symbol_178, S_any);
				leftA_symbol_177 = A_symbol_179;
			} catch (InvalidValueException e) {
				leftA_symbol_177 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_179 = leftA_symbol_177;
			Value rightA_symbol_177;
			try {
				
				Value A_symbol_180 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_181 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_180, P_TypedElement_type);
				
				DomainType static_A_symbol_182 = valueFactory.typeOf(A_symbol_181, S_Boolean);
				LibraryBinaryOperation dynamic_A_symbol_182 = (LibraryBinaryOperation)static_A_symbol_182.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_182 = dynamic_A_symbol_182.evaluate(evaluator, T_Boolean, A_symbol_181, S_Boolean);
				rightA_symbol_177 = A_symbol_182;
			} catch (InvalidValueException e) {
				rightA_symbol_177 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_182 = rightA_symbol_177;
			DomainType static_A_symbol_177 = valueFactory.typeOf(A_symbol_179);
			LibraryBinaryOperation dynamic_A_symbol_177 = (LibraryBinaryOperation)static_A_symbol_177.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_177 = dynamic_A_symbol_177.evaluate(evaluator, T_Boolean, A_symbol_179, A_symbol_182);
			return A_symbol_177;
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
			
			Value leftA_symbol_183;
			try {
				
				Value A_symbol_184 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_185 = valueFactory.typeOf(A_symbol_184, S_any);
				LibraryBinaryOperation dynamic_A_symbol_185 = (LibraryBinaryOperation)static_A_symbol_185.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_185 = dynamic_A_symbol_185.evaluate(evaluator, T_Boolean, A_symbol_184, S_any);
				leftA_symbol_183 = A_symbol_185;
			} catch (InvalidValueException e) {
				leftA_symbol_183 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_185 = leftA_symbol_183;
			Value rightA_symbol_183;
			try {
				
				Value A_symbol_186 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_187 = valueFactory.typeOf(A_symbol_186);
				LibraryUnaryOperation dynamic_A_symbol_187 = (LibraryUnaryOperation)static_A_symbol_187.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_187 = dynamic_A_symbol_187.evaluate(evaluator, T_Integer, A_symbol_186);
				DomainType static_A_symbol_188 = valueFactory.typeOf(A_symbol_187, I_1);
				LibraryBinaryOperation dynamic_A_symbol_188 = (LibraryBinaryOperation)static_A_symbol_188.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_188 = dynamic_A_symbol_188.evaluate(evaluator, T_Boolean, A_symbol_187, I_1);
				rightA_symbol_183 = A_symbol_188;
			} catch (InvalidValueException e) {
				rightA_symbol_183 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_188 = rightA_symbol_183;
			DomainType static_A_symbol_183 = valueFactory.typeOf(A_symbol_185);
			LibraryBinaryOperation dynamic_A_symbol_183 = (LibraryBinaryOperation)static_A_symbol_183.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_183 = dynamic_A_symbol_183.evaluate(evaluator, T_Boolean, A_symbol_185, A_symbol_188);
			return A_symbol_183;
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
			
			Value leftA_symbol_189;
			try {
				
				Value A_symbol_190 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_191 = valueFactory.typeOf(A_symbol_190, S_any);
				LibraryBinaryOperation dynamic_A_symbol_191 = (LibraryBinaryOperation)static_A_symbol_191.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_191 = dynamic_A_symbol_191.evaluate(evaluator, T_Boolean, A_symbol_190, S_any);
				leftA_symbol_189 = A_symbol_191;
			} catch (InvalidValueException e) {
				leftA_symbol_189 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_191 = leftA_symbol_189;
			Value rightA_symbol_189;
			try {
				
				Value A_symbol_192 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_193 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_194 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_193, P_TypedElement_type);
				
				DomainType static_A_symbol_195 = valueFactory.typeOf(A_symbol_194);
				LibraryBinaryOperation dynamic_A_symbol_195 = (LibraryBinaryOperation)static_A_symbol_195.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_195 = dynamic_A_symbol_195.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_194, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_196 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_195, P_CollectionType_elementType);
				
				DomainType static_A_symbol_197 = valueFactory.typeOf(A_symbol_192, A_symbol_196);
				LibraryBinaryOperation dynamic_A_symbol_197 = (LibraryBinaryOperation)static_A_symbol_197.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_197 = dynamic_A_symbol_197.evaluate(evaluator, T_Boolean, A_symbol_192, A_symbol_196);
				rightA_symbol_189 = A_symbol_197;
			} catch (InvalidValueException e) {
				rightA_symbol_189 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_197 = rightA_symbol_189;
			DomainType static_A_symbol_189 = valueFactory.typeOf(A_symbol_191);
			LibraryBinaryOperation dynamic_A_symbol_189 = (LibraryBinaryOperation)static_A_symbol_189.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_189 = dynamic_A_symbol_189.evaluate(evaluator, T_Boolean, A_symbol_191, A_symbol_197);
			return A_symbol_189;
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
			
			Value leftA_symbol_198;
			try {
				
				Value A_symbol_199 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_200 = valueFactory.typeOf(A_symbol_199, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_200 = (LibraryBinaryOperation)static_A_symbol_200.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_200 = dynamic_A_symbol_200.evaluate(evaluator, T_Boolean, A_symbol_199, S_closure);
				leftA_symbol_198 = A_symbol_200;
			} catch (InvalidValueException e) {
				leftA_symbol_198 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_200 = leftA_symbol_198;
			Value rightA_symbol_198;
			try {
				
				Value A_symbol_201 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_202 = valueFactory.typeOf(A_symbol_201);
				LibraryBinaryOperation dynamic_A_symbol_202 = (LibraryBinaryOperation)static_A_symbol_202.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_202 = dynamic_A_symbol_202.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_201, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_203 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_202, P_CollectionType_elementType);
				
				
				Value A_symbol_204 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_205 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_204, P_TypedElement_type);
				
				DomainType static_A_symbol_206 = valueFactory.typeOf(A_symbol_205);
				LibraryBinaryOperation dynamic_A_symbol_206 = (LibraryBinaryOperation)static_A_symbol_206.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_206 = dynamic_A_symbol_206.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_205, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_207 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_206, P_CollectionType_elementType);
				
				DomainType static_A_symbol_208 = valueFactory.typeOf(A_symbol_203, A_symbol_207);
				LibraryBinaryOperation dynamic_A_symbol_208 = (LibraryBinaryOperation)static_A_symbol_208.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_208 = dynamic_A_symbol_208.evaluate(evaluator, T_Boolean, A_symbol_203, A_symbol_207);
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
			
			Value leftA_symbol_209;
			try {
				
				Value A_symbol_210 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_211 = valueFactory.typeOf(A_symbol_210, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_211 = (LibraryBinaryOperation)static_A_symbol_211.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_211 = dynamic_A_symbol_211.evaluate(evaluator, T_Boolean, A_symbol_210, S_closure);
				leftA_symbol_209 = A_symbol_211;
			} catch (InvalidValueException e) {
				leftA_symbol_209 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_211 = leftA_symbol_209;
			Value rightA_symbol_209;
			try {
				
				Value A_symbol_212 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_213 = valueFactory.typeOf(A_symbol_212);
				LibraryUnaryOperation dynamic_A_symbol_213 = (LibraryUnaryOperation)static_A_symbol_213.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_213 = dynamic_A_symbol_213.evaluate(evaluator, T_Integer, A_symbol_212);
				DomainType static_A_symbol_214 = valueFactory.typeOf(A_symbol_213, I_1);
				LibraryBinaryOperation dynamic_A_symbol_214 = (LibraryBinaryOperation)static_A_symbol_214.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_214 = dynamic_A_symbol_214.evaluate(evaluator, T_Boolean, A_symbol_213, I_1);
				rightA_symbol_209 = A_symbol_214;
			} catch (InvalidValueException e) {
				rightA_symbol_209 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_214 = rightA_symbol_209;
			DomainType static_A_symbol_209 = valueFactory.typeOf(A_symbol_211);
			LibraryBinaryOperation dynamic_A_symbol_209 = (LibraryBinaryOperation)static_A_symbol_209.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_209 = dynamic_A_symbol_209.evaluate(evaluator, T_Boolean, A_symbol_211, A_symbol_214);
			return A_symbol_209;
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
			
			Value leftA_symbol_215;
			try {
				
				Value A_symbol_216 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_217 = valueFactory.typeOf(A_symbol_216, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_217 = (LibraryBinaryOperation)static_A_symbol_217.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_217 = dynamic_A_symbol_217.evaluate(evaluator, T_Boolean, A_symbol_216, S_closure);
				leftA_symbol_215 = A_symbol_217;
			} catch (InvalidValueException e) {
				leftA_symbol_215 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_217 = leftA_symbol_215;
			Value rightA_symbol_215;
			try {
				
				Value A_symbol_218 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_219 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_218, P_TypedElement_type);
				
				DomainType static_A_symbol_220 = valueFactory.typeOf(A_symbol_219);
				LibraryBinaryOperation dynamic_A_symbol_220 = (LibraryBinaryOperation)static_A_symbol_220.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_220 = dynamic_A_symbol_220.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_219, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_221 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_220, P_CollectionType_elementType);
				
					
					Value A_symbol_222 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_223 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_222, P_TypedElement_type);
					
					DomainType static_A_symbol_224 = valueFactory.typeOf(A_symbol_223);
					LibraryBinaryOperation dynamic_A_symbol_224 = (LibraryBinaryOperation)static_A_symbol_224.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_224 = dynamic_A_symbol_224.evaluate(evaluator, T_Boolean, A_symbol_223, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_225;
				if (A_symbol_224.isTrue()) {
					
					Value A_symbol_226 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_227 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_226, P_TypedElement_type);
					
					DomainType static_A_symbol_228 = valueFactory.typeOf(A_symbol_227);
					LibraryBinaryOperation dynamic_A_symbol_228 = (LibraryBinaryOperation)static_A_symbol_228.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_228 = dynamic_A_symbol_228.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_227, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_229 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_228, P_CollectionType_elementType);
					
					A_symbol_225 = A_symbol_229;
				}
				else if (A_symbol_224.isFalse()) {
					
					Value A_symbol_230 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_231 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_230, P_TypedElement_type);
					
					A_symbol_225 = A_symbol_231;
				}
				else if (A_symbol_224.isNull()) {
					A_symbol_225 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_225 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				DomainType static_A_symbol_232 = valueFactory.typeOf(A_symbol_221, A_symbol_225);
				LibraryBinaryOperation dynamic_A_symbol_232 = (LibraryBinaryOperation)static_A_symbol_232.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_232 = dynamic_A_symbol_232.evaluate(evaluator, T_Boolean, A_symbol_221, A_symbol_225);
				rightA_symbol_215 = A_symbol_232;
			} catch (InvalidValueException e) {
				rightA_symbol_215 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_232 = rightA_symbol_215;
			DomainType static_A_symbol_215 = valueFactory.typeOf(A_symbol_217);
			LibraryBinaryOperation dynamic_A_symbol_215 = (LibraryBinaryOperation)static_A_symbol_215.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_215 = dynamic_A_symbol_215.evaluate(evaluator, T_Boolean, A_symbol_217, A_symbol_232);
			return A_symbol_215;
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
			
			Value leftA_symbol_233;
			try {
				
				Value A_symbol_234 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_235 = valueFactory.typeOf(A_symbol_234, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_235 = (LibraryBinaryOperation)static_A_symbol_235.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_235 = dynamic_A_symbol_235.evaluate(evaluator, T_Boolean, A_symbol_234, S_closure);
				leftA_symbol_233 = A_symbol_235;
			} catch (InvalidValueException e) {
				leftA_symbol_233 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_235 = leftA_symbol_233;
			Value rightA_symbol_233;
			try {
					Value leftA_symbol_236;
					try {
						
						Value A_symbol_237 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_238 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_237, P_TypedElement_type);
						
						DomainType static_A_symbol_239 = valueFactory.typeOf(A_symbol_238);
						LibraryBinaryOperation dynamic_A_symbol_239 = (LibraryBinaryOperation)static_A_symbol_239.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_239 = dynamic_A_symbol_239.evaluate(evaluator, T_Boolean, A_symbol_238, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_236 = A_symbol_239;
					} catch (InvalidValueException e) {
						leftA_symbol_236 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_239 = leftA_symbol_236;
					Value rightA_symbol_236;
					try {
						
						Value A_symbol_240 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_241 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_240, P_TypedElement_type);
						
						DomainType static_A_symbol_242 = valueFactory.typeOf(A_symbol_241);
						LibraryBinaryOperation dynamic_A_symbol_242 = (LibraryBinaryOperation)static_A_symbol_242.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_242 = dynamic_A_symbol_242.evaluate(evaluator, T_Boolean, A_symbol_241, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_236 = A_symbol_242;
					} catch (InvalidValueException e) {
						rightA_symbol_236 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_242 = rightA_symbol_236;
					DomainType static_A_symbol_236 = valueFactory.typeOf(A_symbol_239);
					LibraryBinaryOperation dynamic_A_symbol_236 = (LibraryBinaryOperation)static_A_symbol_236.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_236 = dynamic_A_symbol_236.evaluate(evaluator, T_Boolean, A_symbol_239, A_symbol_242);
				Value A_symbol_243;
				if (A_symbol_236.isTrue()) {
					
					Value A_symbol_244 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_245 = valueFactory.typeOf(A_symbol_244);
					LibraryBinaryOperation dynamic_A_symbol_245 = (LibraryBinaryOperation)static_A_symbol_245.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_245 = dynamic_A_symbol_245.evaluate(evaluator, T_Boolean, A_symbol_244, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_243 = A_symbol_245;
				}
				else if (A_symbol_236.isFalse()) {
					
					Value A_symbol_246 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_247 = valueFactory.typeOf(A_symbol_246);
					LibraryBinaryOperation dynamic_A_symbol_247 = (LibraryBinaryOperation)static_A_symbol_247.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_247 = dynamic_A_symbol_247.evaluate(evaluator, T_Boolean, A_symbol_246, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
					A_symbol_243 = A_symbol_247;
				}
				else if (A_symbol_236.isNull()) {
					A_symbol_243 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_243 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_233 = A_symbol_243;
			} catch (InvalidValueException e) {
				rightA_symbol_233 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_243 = rightA_symbol_233;
			DomainType static_A_symbol_233 = valueFactory.typeOf(A_symbol_235);
			LibraryBinaryOperation dynamic_A_symbol_233 = (LibraryBinaryOperation)static_A_symbol_233.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_233 = dynamic_A_symbol_233.evaluate(evaluator, T_Boolean, A_symbol_235, A_symbol_243);
			return A_symbol_233;
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
			
			Value leftA_symbol_248;
			try {
				
				Value A_symbol_249 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_250 = valueFactory.typeOf(A_symbol_249, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_250 = (LibraryBinaryOperation)static_A_symbol_250.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_250 = dynamic_A_symbol_250.evaluate(evaluator, T_Boolean, A_symbol_249, S_collect);
				leftA_symbol_248 = A_symbol_250;
			} catch (InvalidValueException e) {
				leftA_symbol_248 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_250 = leftA_symbol_248;
			Value rightA_symbol_248;
			try {
				
				Value A_symbol_251 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_252 = valueFactory.typeOf(A_symbol_251);
				LibraryBinaryOperation dynamic_A_symbol_252 = (LibraryBinaryOperation)static_A_symbol_252.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_252 = dynamic_A_symbol_252.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_251, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_253 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_252, P_CollectionType_elementType);
				
				
				Value A_symbol_254 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_255 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_254, P_TypedElement_type);
				
				DomainType static_A_symbol_256 = valueFactory.typeOf(A_symbol_255);
				LibraryBinaryOperation dynamic_A_symbol_256 = (LibraryBinaryOperation)static_A_symbol_256.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_256 = dynamic_A_symbol_256.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_255, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_257 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_256, P_CollectionType_elementType);
				
				DomainType static_A_symbol_258 = valueFactory.typeOf(A_symbol_253, A_symbol_257);
				LibraryBinaryOperation dynamic_A_symbol_258 = (LibraryBinaryOperation)static_A_symbol_258.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_258 = dynamic_A_symbol_258.evaluate(evaluator, T_Boolean, A_symbol_253, A_symbol_257);
				rightA_symbol_248 = A_symbol_258;
			} catch (InvalidValueException e) {
				rightA_symbol_248 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_258 = rightA_symbol_248;
			DomainType static_A_symbol_248 = valueFactory.typeOf(A_symbol_250);
			LibraryBinaryOperation dynamic_A_symbol_248 = (LibraryBinaryOperation)static_A_symbol_248.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_248 = dynamic_A_symbol_248.evaluate(evaluator, T_Boolean, A_symbol_250, A_symbol_258);
			return A_symbol_248;
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
			
			Value leftA_symbol_259;
			try {
				
				Value A_symbol_260 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_261 = valueFactory.typeOf(A_symbol_260, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_261 = (LibraryBinaryOperation)static_A_symbol_261.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_261 = dynamic_A_symbol_261.evaluate(evaluator, T_Boolean, A_symbol_260, S_collect);
				leftA_symbol_259 = A_symbol_261;
			} catch (InvalidValueException e) {
				leftA_symbol_259 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_261 = leftA_symbol_259;
			Value rightA_symbol_259;
			try {
				
				Value A_symbol_262 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_263 = valueFactory.typeOf(A_symbol_262);
				LibraryUnaryOperation dynamic_A_symbol_263 = (LibraryUnaryOperation)static_A_symbol_263.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_263 = dynamic_A_symbol_263.evaluate(evaluator, T_Integer, A_symbol_262);
				DomainType static_A_symbol_264 = valueFactory.typeOf(A_symbol_263, I_1);
				LibraryBinaryOperation dynamic_A_symbol_264 = (LibraryBinaryOperation)static_A_symbol_264.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_264 = dynamic_A_symbol_264.evaluate(evaluator, T_Boolean, A_symbol_263, I_1);
				rightA_symbol_259 = A_symbol_264;
			} catch (InvalidValueException e) {
				rightA_symbol_259 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_264 = rightA_symbol_259;
			DomainType static_A_symbol_259 = valueFactory.typeOf(A_symbol_261);
			LibraryBinaryOperation dynamic_A_symbol_259 = (LibraryBinaryOperation)static_A_symbol_259.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_259 = dynamic_A_symbol_259.evaluate(evaluator, T_Boolean, A_symbol_261, A_symbol_264);
			return A_symbol_259;
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
			
			Value leftA_symbol_265;
			try {
				
				Value A_symbol_266 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_267 = valueFactory.typeOf(A_symbol_266, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_267 = (LibraryBinaryOperation)static_A_symbol_267.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_267 = dynamic_A_symbol_267.evaluate(evaluator, T_Boolean, A_symbol_266, S_collectN___);
				leftA_symbol_265 = A_symbol_267;
			} catch (InvalidValueException e) {
				leftA_symbol_265 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_267 = leftA_symbol_265;
			Value rightA_symbol_265;
			try {
				
				Value A_symbol_268 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_269 = valueFactory.typeOf(A_symbol_268);
				LibraryUnaryOperation dynamic_A_symbol_269 = (LibraryUnaryOperation)static_A_symbol_269.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_269 = dynamic_A_symbol_269.evaluate(evaluator, T_Integer, A_symbol_268);
				DomainType static_A_symbol_270 = valueFactory.typeOf(A_symbol_269, I_1);
				LibraryBinaryOperation dynamic_A_symbol_270 = (LibraryBinaryOperation)static_A_symbol_270.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_270 = dynamic_A_symbol_270.evaluate(evaluator, T_Boolean, A_symbol_269, I_1);
				rightA_symbol_265 = A_symbol_270;
			} catch (InvalidValueException e) {
				rightA_symbol_265 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_270 = rightA_symbol_265;
			DomainType static_A_symbol_265 = valueFactory.typeOf(A_symbol_267);
			LibraryBinaryOperation dynamic_A_symbol_265 = (LibraryBinaryOperation)static_A_symbol_265.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_265 = dynamic_A_symbol_265.evaluate(evaluator, T_Boolean, A_symbol_267, A_symbol_270);
			return A_symbol_265;
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
			
			Value leftA_symbol_271;
			try {
				
				Value A_symbol_272 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_273 = valueFactory.typeOf(A_symbol_272, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_273 = (LibraryBinaryOperation)static_A_symbol_273.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_273 = dynamic_A_symbol_273.evaluate(evaluator, T_Boolean, A_symbol_272, S_collectN___);
				leftA_symbol_271 = A_symbol_273;
			} catch (InvalidValueException e) {
				leftA_symbol_271 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_273 = leftA_symbol_271;
			Value rightA_symbol_271;
			try {
				
				Value A_symbol_274 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_275 = valueFactory.typeOf(A_symbol_274);
				LibraryBinaryOperation dynamic_A_symbol_275 = (LibraryBinaryOperation)static_A_symbol_275.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_275 = dynamic_A_symbol_275.evaluate(evaluator, T_Boolean, A_symbol_274, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
				rightA_symbol_271 = A_symbol_275;
			} catch (InvalidValueException e) {
				rightA_symbol_271 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_275 = rightA_symbol_271;
			DomainType static_A_symbol_271 = valueFactory.typeOf(A_symbol_273);
			LibraryBinaryOperation dynamic_A_symbol_271 = (LibraryBinaryOperation)static_A_symbol_271.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_271 = dynamic_A_symbol_271.evaluate(evaluator, T_Boolean, A_symbol_273, A_symbol_275);
			return A_symbol_271;
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
			
			Value leftA_symbol_276;
			try {
				
				Value A_symbol_277 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_278 = valueFactory.typeOf(A_symbol_277, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_278 = (LibraryBinaryOperation)static_A_symbol_278.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_278 = dynamic_A_symbol_278.evaluate(evaluator, T_Boolean, A_symbol_277, S_collectN___);
				leftA_symbol_276 = A_symbol_278;
			} catch (InvalidValueException e) {
				leftA_symbol_276 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_278 = leftA_symbol_276;
			Value rightA_symbol_276;
			try {
				
				Value A_symbol_279 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_280 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_281 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_280, P_TypedElement_type);
				
				DomainType static_A_symbol_282 = valueFactory.typeOf(A_symbol_279, A_symbol_281);
				LibraryBinaryOperation dynamic_A_symbol_282 = (LibraryBinaryOperation)static_A_symbol_282.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_282 = dynamic_A_symbol_282.evaluate(evaluator, T_Boolean, A_symbol_279, A_symbol_281);
				rightA_symbol_276 = A_symbol_282;
			} catch (InvalidValueException e) {
				rightA_symbol_276 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_282 = rightA_symbol_276;
			DomainType static_A_symbol_276 = valueFactory.typeOf(A_symbol_278);
			LibraryBinaryOperation dynamic_A_symbol_276 = (LibraryBinaryOperation)static_A_symbol_276.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_276 = dynamic_A_symbol_276.evaluate(evaluator, T_Boolean, A_symbol_278, A_symbol_282);
			return A_symbol_276;
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
			
			Value leftA_symbol_283;
			try {
				
				Value A_symbol_284 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_285 = valueFactory.typeOf(A_symbol_284, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_285 = (LibraryBinaryOperation)static_A_symbol_285.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_285 = dynamic_A_symbol_285.evaluate(evaluator, T_Boolean, A_symbol_284, S_collect);
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
						Value A_symbol_292 = dynamic_A_symbol_292.evaluate(evaluator, T_Boolean, A_symbol_291, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
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
					Value A_symbol_297 = dynamic_A_symbol_297.evaluate(evaluator, T_Boolean, A_symbol_296, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
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
			
			Value leftA_symbol_298;
			try {
				
				Value A_symbol_299 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_300 = valueFactory.typeOf(A_symbol_299, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_300 = (LibraryBinaryOperation)static_A_symbol_300.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_300 = dynamic_A_symbol_300.evaluate(evaluator, T_Boolean, A_symbol_299, S_exists);
				leftA_symbol_298 = A_symbol_300;
			} catch (InvalidValueException e) {
				leftA_symbol_298 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_300 = leftA_symbol_298;
			Value rightA_symbol_298;
			try {
				
				Value A_symbol_301 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_302 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_301, P_TypedElement_type);
				
				DomainType static_A_symbol_303 = valueFactory.typeOf(A_symbol_302, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_303 = (LibraryBinaryOperation)static_A_symbol_303.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_303 = dynamic_A_symbol_303.evaluate(evaluator, T_Boolean, A_symbol_302, T_ClassClassifier_Boolean_);
				rightA_symbol_298 = A_symbol_303;
			} catch (InvalidValueException e) {
				rightA_symbol_298 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_303 = rightA_symbol_298;
			DomainType static_A_symbol_298 = valueFactory.typeOf(A_symbol_300);
			LibraryBinaryOperation dynamic_A_symbol_298 = (LibraryBinaryOperation)static_A_symbol_298.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_298 = dynamic_A_symbol_298.evaluate(evaluator, T_Boolean, A_symbol_300, A_symbol_303);
			return A_symbol_298;
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
			
			Value leftA_symbol_304;
			try {
				
				Value A_symbol_305 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_306 = valueFactory.typeOf(A_symbol_305, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_306 = (LibraryBinaryOperation)static_A_symbol_306.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_306 = dynamic_A_symbol_306.evaluate(evaluator, T_Boolean, A_symbol_305, S_exists);
				leftA_symbol_304 = A_symbol_306;
			} catch (InvalidValueException e) {
				leftA_symbol_304 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_306 = leftA_symbol_304;
			Value rightA_symbol_304;
			try {
				
				Value A_symbol_307 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_308 = valueFactory.typeOf(A_symbol_307, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_308 = (LibraryBinaryOperation)static_A_symbol_308.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_308 = dynamic_A_symbol_308.evaluate(evaluator, T_Boolean, A_symbol_307, T_ClassClassifier_Boolean_);
				rightA_symbol_304 = A_symbol_308;
			} catch (InvalidValueException e) {
				rightA_symbol_304 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_308 = rightA_symbol_304;
			DomainType static_A_symbol_304 = valueFactory.typeOf(A_symbol_306);
			LibraryBinaryOperation dynamic_A_symbol_304 = (LibraryBinaryOperation)static_A_symbol_304.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_304 = dynamic_A_symbol_304.evaluate(evaluator, T_Boolean, A_symbol_306, A_symbol_308);
			return A_symbol_304;
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
			
			Value leftA_symbol_309;
			try {
				
				Value A_symbol_310 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_311 = valueFactory.typeOf(A_symbol_310, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_311 = (LibraryBinaryOperation)static_A_symbol_311.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_311 = dynamic_A_symbol_311.evaluate(evaluator, T_Boolean, A_symbol_310, S_forAll);
				leftA_symbol_309 = A_symbol_311;
			} catch (InvalidValueException e) {
				leftA_symbol_309 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_311 = leftA_symbol_309;
			Value rightA_symbol_309;
			try {
				
				Value A_symbol_312 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_313 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_312, P_TypedElement_type);
				
				DomainType static_A_symbol_314 = valueFactory.typeOf(A_symbol_313, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_314 = (LibraryBinaryOperation)static_A_symbol_314.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_314 = dynamic_A_symbol_314.evaluate(evaluator, T_Boolean, A_symbol_313, T_ClassClassifier_Boolean_);
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
			
			Value leftA_symbol_315;
			try {
				
				Value A_symbol_316 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_317 = valueFactory.typeOf(A_symbol_316, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_317 = (LibraryBinaryOperation)static_A_symbol_317.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_317 = dynamic_A_symbol_317.evaluate(evaluator, T_Boolean, A_symbol_316, S_forAll);
				leftA_symbol_315 = A_symbol_317;
			} catch (InvalidValueException e) {
				leftA_symbol_315 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_317 = leftA_symbol_315;
			Value rightA_symbol_315;
			try {
				
				Value A_symbol_318 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_319 = valueFactory.typeOf(A_symbol_318, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_319 = (LibraryBinaryOperation)static_A_symbol_319.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_319 = dynamic_A_symbol_319.evaluate(evaluator, T_Boolean, A_symbol_318, T_ClassClassifier_Boolean_);
				rightA_symbol_315 = A_symbol_319;
			} catch (InvalidValueException e) {
				rightA_symbol_315 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_319 = rightA_symbol_315;
			DomainType static_A_symbol_315 = valueFactory.typeOf(A_symbol_317);
			LibraryBinaryOperation dynamic_A_symbol_315 = (LibraryBinaryOperation)static_A_symbol_315.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_315 = dynamic_A_symbol_315.evaluate(evaluator, T_Boolean, A_symbol_317, A_symbol_319);
			return A_symbol_315;
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
			
			Value leftA_symbol_320;
			try {
				
				Value A_symbol_321 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_322 = valueFactory.typeOf(A_symbol_321, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_322 = (LibraryBinaryOperation)static_A_symbol_322.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_322 = dynamic_A_symbol_322.evaluate(evaluator, T_Boolean, A_symbol_321, S_isUnique);
				leftA_symbol_320 = A_symbol_322;
			} catch (InvalidValueException e) {
				leftA_symbol_320 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_322 = leftA_symbol_320;
			Value rightA_symbol_320;
			try {
				
				Value A_symbol_323 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_324 = valueFactory.typeOf(A_symbol_323);
				LibraryUnaryOperation dynamic_A_symbol_324 = (LibraryUnaryOperation)static_A_symbol_324.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_324 = dynamic_A_symbol_324.evaluate(evaluator, T_Integer, A_symbol_323);
				DomainType static_A_symbol_325 = valueFactory.typeOf(A_symbol_324, I_1);
				LibraryBinaryOperation dynamic_A_symbol_325 = (LibraryBinaryOperation)static_A_symbol_325.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_325 = dynamic_A_symbol_325.evaluate(evaluator, T_Boolean, A_symbol_324, I_1);
				rightA_symbol_320 = A_symbol_325;
			} catch (InvalidValueException e) {
				rightA_symbol_320 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_325 = rightA_symbol_320;
			DomainType static_A_symbol_320 = valueFactory.typeOf(A_symbol_322);
			LibraryBinaryOperation dynamic_A_symbol_320 = (LibraryBinaryOperation)static_A_symbol_320.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_320 = dynamic_A_symbol_320.evaluate(evaluator, T_Boolean, A_symbol_322, A_symbol_325);
			return A_symbol_320;
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
			
			Value leftA_symbol_326;
			try {
				
				Value A_symbol_327 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_328 = valueFactory.typeOf(A_symbol_327, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_328 = (LibraryBinaryOperation)static_A_symbol_328.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_328 = dynamic_A_symbol_328.evaluate(evaluator, T_Boolean, A_symbol_327, S_isUnique);
				leftA_symbol_326 = A_symbol_328;
			} catch (InvalidValueException e) {
				leftA_symbol_326 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_328 = leftA_symbol_326;
			Value rightA_symbol_326;
			try {
				
				Value A_symbol_329 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_330 = valueFactory.typeOf(A_symbol_329, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_330 = (LibraryBinaryOperation)static_A_symbol_330.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_330 = dynamic_A_symbol_330.evaluate(evaluator, T_Boolean, A_symbol_329, T_ClassClassifier_Boolean_);
				rightA_symbol_326 = A_symbol_330;
			} catch (InvalidValueException e) {
				rightA_symbol_326 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_330 = rightA_symbol_326;
			DomainType static_A_symbol_326 = valueFactory.typeOf(A_symbol_328);
			LibraryBinaryOperation dynamic_A_symbol_326 = (LibraryBinaryOperation)static_A_symbol_326.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_326 = dynamic_A_symbol_326.evaluate(evaluator, T_Boolean, A_symbol_328, A_symbol_330);
			return A_symbol_326;
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
			
			
			Value A_symbol_331 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_332 = new AbstractBinaryOperation()
			{
			/*
			type =
			source.type.oclAsType(_'file:/C:/GIT/org.eclipse.ocl/examples/org.eclipse.ocl.examples.pivot/model/Pivot.ecore'::ocl::CollectionType).elementType
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_333 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_1_, P_TypedElement_type);
					
					
					Value A_symbol_334 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
					
					Value A_symbol_335 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_334, P_TypedElement_type);
					
					DomainType static_A_symbol_336 = valueFactory.typeOf(A_symbol_335);
					LibraryBinaryOperation dynamic_A_symbol_336 = (LibraryBinaryOperation)static_A_symbol_336.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_336 = dynamic_A_symbol_336.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_335, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_337 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_336, P_CollectionType_elementType);
					
					DomainType static_A_symbol_338 = valueFactory.typeOf(A_symbol_333, A_symbol_337);
					LibraryBinaryOperation dynamic_A_symbol_338 = (LibraryBinaryOperation)static_A_symbol_338.lookupImplementation(standardLibrary, O_OclAny__eq_);
					Value A_symbol_338 = dynamic_A_symbol_338.evaluate(evaluator, T_Boolean, A_symbol_333, A_symbol_337);
					return A_symbol_338;
				}
			};
			DomainType static_A_symbol_332 = A_symbol_331.getType();
			LibraryIteration dynamic_A_symbol_332 = (LibraryIteration)static_A_symbol_332.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_332 = dynamic_A_symbol_332.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_332 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_332, (CollectionValue)A_symbol_331, acc_A_symbol_332);
			Value A_symbol_332 = dynamic_A_symbol_332.evaluateIteration(manager_A_symbol_332);
			return A_symbol_332;
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
			
			Value leftA_symbol_339;
			try {
				
				Value A_symbol_340 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_341 = valueFactory.typeOf(A_symbol_340, S_one);
				LibraryBinaryOperation dynamic_A_symbol_341 = (LibraryBinaryOperation)static_A_symbol_341.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_341 = dynamic_A_symbol_341.evaluate(evaluator, T_Boolean, A_symbol_340, S_one);
				leftA_symbol_339 = A_symbol_341;
			} catch (InvalidValueException e) {
				leftA_symbol_339 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_341 = leftA_symbol_339;
			Value rightA_symbol_339;
			try {
				
				Value A_symbol_342 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_343 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_342, P_TypedElement_type);
				
				DomainType static_A_symbol_344 = valueFactory.typeOf(A_symbol_343, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_344 = (LibraryBinaryOperation)static_A_symbol_344.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_344 = dynamic_A_symbol_344.evaluate(evaluator, T_Boolean, A_symbol_343, T_ClassClassifier_Boolean_);
				rightA_symbol_339 = A_symbol_344;
			} catch (InvalidValueException e) {
				rightA_symbol_339 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_344 = rightA_symbol_339;
			DomainType static_A_symbol_339 = valueFactory.typeOf(A_symbol_341);
			LibraryBinaryOperation dynamic_A_symbol_339 = (LibraryBinaryOperation)static_A_symbol_339.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_339 = dynamic_A_symbol_339.evaluate(evaluator, T_Boolean, A_symbol_341, A_symbol_344);
			return A_symbol_339;
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
			
			Value leftA_symbol_345;
			try {
				
				Value A_symbol_346 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_347 = valueFactory.typeOf(A_symbol_346, S_one);
				LibraryBinaryOperation dynamic_A_symbol_347 = (LibraryBinaryOperation)static_A_symbol_347.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_347 = dynamic_A_symbol_347.evaluate(evaluator, T_Boolean, A_symbol_346, S_one);
				leftA_symbol_345 = A_symbol_347;
			} catch (InvalidValueException e) {
				leftA_symbol_345 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_347 = leftA_symbol_345;
			Value rightA_symbol_345;
			try {
				
				Value A_symbol_348 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_349 = valueFactory.typeOf(A_symbol_348);
				LibraryUnaryOperation dynamic_A_symbol_349 = (LibraryUnaryOperation)static_A_symbol_349.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_349 = dynamic_A_symbol_349.evaluate(evaluator, T_Integer, A_symbol_348);
				DomainType static_A_symbol_350 = valueFactory.typeOf(A_symbol_349, I_1);
				LibraryBinaryOperation dynamic_A_symbol_350 = (LibraryBinaryOperation)static_A_symbol_350.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_350 = dynamic_A_symbol_350.evaluate(evaluator, T_Boolean, A_symbol_349, I_1);
				rightA_symbol_345 = A_symbol_350;
			} catch (InvalidValueException e) {
				rightA_symbol_345 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_350 = rightA_symbol_345;
			DomainType static_A_symbol_345 = valueFactory.typeOf(A_symbol_347);
			LibraryBinaryOperation dynamic_A_symbol_345 = (LibraryBinaryOperation)static_A_symbol_345.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_345 = dynamic_A_symbol_345.evaluate(evaluator, T_Boolean, A_symbol_347, A_symbol_350);
			return A_symbol_345;
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
			
			Value leftA_symbol_351;
			try {
				
				Value A_symbol_352 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_353 = valueFactory.typeOf(A_symbol_352, S_one);
				LibraryBinaryOperation dynamic_A_symbol_353 = (LibraryBinaryOperation)static_A_symbol_353.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_353 = dynamic_A_symbol_353.evaluate(evaluator, T_Boolean, A_symbol_352, S_one);
				leftA_symbol_351 = A_symbol_353;
			} catch (InvalidValueException e) {
				leftA_symbol_351 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_353 = leftA_symbol_351;
			Value rightA_symbol_351;
			try {
				
				Value A_symbol_354 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_355 = valueFactory.typeOf(A_symbol_354, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_355 = (LibraryBinaryOperation)static_A_symbol_355.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_355 = dynamic_A_symbol_355.evaluate(evaluator, T_Boolean, A_symbol_354, T_ClassClassifier_Boolean_);
				rightA_symbol_351 = A_symbol_355;
			} catch (InvalidValueException e) {
				rightA_symbol_351 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_355 = rightA_symbol_351;
			DomainType static_A_symbol_351 = valueFactory.typeOf(A_symbol_353);
			LibraryBinaryOperation dynamic_A_symbol_351 = (LibraryBinaryOperation)static_A_symbol_351.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_351 = dynamic_A_symbol_351.evaluate(evaluator, T_Boolean, A_symbol_353, A_symbol_355);
			return A_symbol_351;
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
			
			Value leftA_symbol_356;
			try {
				Value leftA_symbol_357;
				try {
					
					Value A_symbol_358 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_359 = valueFactory.typeOf(A_symbol_358, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_359 = (LibraryBinaryOperation)static_A_symbol_359.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_359 = dynamic_A_symbol_359.evaluate(evaluator, T_Boolean, A_symbol_358, S_reject);
					leftA_symbol_357 = A_symbol_359;
				} catch (InvalidValueException e) {
					leftA_symbol_357 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_359 = leftA_symbol_357;
				Value rightA_symbol_357;
				try {
					
					Value A_symbol_360 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_361 = valueFactory.typeOf(A_symbol_360, S_select);
					LibraryBinaryOperation dynamic_A_symbol_361 = (LibraryBinaryOperation)static_A_symbol_361.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_361 = dynamic_A_symbol_361.evaluate(evaluator, T_Boolean, A_symbol_360, S_select);
					rightA_symbol_357 = A_symbol_361;
				} catch (InvalidValueException e) {
					rightA_symbol_357 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_361 = rightA_symbol_357;
				DomainType static_A_symbol_357 = valueFactory.typeOf(A_symbol_359);
				LibraryBinaryOperation dynamic_A_symbol_357 = (LibraryBinaryOperation)static_A_symbol_357.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_357 = dynamic_A_symbol_357.evaluate(evaluator, T_Boolean, A_symbol_359, A_symbol_361);
				leftA_symbol_356 = A_symbol_357;
			} catch (InvalidValueException e) {
				leftA_symbol_356 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_357 = leftA_symbol_356;
			Value rightA_symbol_356;
			try {
				
				Value A_symbol_362 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_363 = valueFactory.typeOf(A_symbol_362);
				LibraryUnaryOperation dynamic_A_symbol_363 = (LibraryUnaryOperation)static_A_symbol_363.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_363 = dynamic_A_symbol_363.evaluate(evaluator, T_Integer, A_symbol_362);
				DomainType static_A_symbol_364 = valueFactory.typeOf(A_symbol_363, I_1);
				LibraryBinaryOperation dynamic_A_symbol_364 = (LibraryBinaryOperation)static_A_symbol_364.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_364 = dynamic_A_symbol_364.evaluate(evaluator, T_Boolean, A_symbol_363, I_1);
				rightA_symbol_356 = A_symbol_364;
			} catch (InvalidValueException e) {
				rightA_symbol_356 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_364 = rightA_symbol_356;
			DomainType static_A_symbol_356 = valueFactory.typeOf(A_symbol_357);
			LibraryBinaryOperation dynamic_A_symbol_356 = (LibraryBinaryOperation)static_A_symbol_356.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_356 = dynamic_A_symbol_356.evaluate(evaluator, T_Boolean, A_symbol_357, A_symbol_364);
			return A_symbol_356;
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
			
			Value leftA_symbol_365;
			try {
				Value leftA_symbol_366;
				try {
					
					Value A_symbol_367 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_368 = valueFactory.typeOf(A_symbol_367, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_368 = (LibraryBinaryOperation)static_A_symbol_368.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_368 = dynamic_A_symbol_368.evaluate(evaluator, T_Boolean, A_symbol_367, S_reject);
					leftA_symbol_366 = A_symbol_368;
				} catch (InvalidValueException e) {
					leftA_symbol_366 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_368 = leftA_symbol_366;
				Value rightA_symbol_366;
				try {
					
					Value A_symbol_369 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_370 = valueFactory.typeOf(A_symbol_369, S_select);
					LibraryBinaryOperation dynamic_A_symbol_370 = (LibraryBinaryOperation)static_A_symbol_370.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_370 = dynamic_A_symbol_370.evaluate(evaluator, T_Boolean, A_symbol_369, S_select);
					rightA_symbol_366 = A_symbol_370;
				} catch (InvalidValueException e) {
					rightA_symbol_366 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_370 = rightA_symbol_366;
				DomainType static_A_symbol_366 = valueFactory.typeOf(A_symbol_368);
				LibraryBinaryOperation dynamic_A_symbol_366 = (LibraryBinaryOperation)static_A_symbol_366.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_366 = dynamic_A_symbol_366.evaluate(evaluator, T_Boolean, A_symbol_368, A_symbol_370);
				leftA_symbol_365 = A_symbol_366;
			} catch (InvalidValueException e) {
				leftA_symbol_365 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_366 = leftA_symbol_365;
			Value rightA_symbol_365;
			try {
				
				Value A_symbol_371 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_372 = valueFactory.typeOf(A_symbol_371, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_372 = (LibraryBinaryOperation)static_A_symbol_372.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_372 = dynamic_A_symbol_372.evaluate(evaluator, T_Boolean, A_symbol_371, T_ClassClassifier_Boolean_);
				rightA_symbol_365 = A_symbol_372;
			} catch (InvalidValueException e) {
				rightA_symbol_365 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_372 = rightA_symbol_365;
			DomainType static_A_symbol_365 = valueFactory.typeOf(A_symbol_366);
			LibraryBinaryOperation dynamic_A_symbol_365 = (LibraryBinaryOperation)static_A_symbol_365.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_365 = dynamic_A_symbol_365.evaluate(evaluator, T_Boolean, A_symbol_366, A_symbol_372);
			return A_symbol_365;
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
			
			Value leftA_symbol_373;
			try {
				Value leftA_symbol_374;
				try {
					
					Value A_symbol_375 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_376 = valueFactory.typeOf(A_symbol_375, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_376 = (LibraryBinaryOperation)static_A_symbol_376.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_376 = dynamic_A_symbol_376.evaluate(evaluator, T_Boolean, A_symbol_375, S_reject);
					leftA_symbol_374 = A_symbol_376;
				} catch (InvalidValueException e) {
					leftA_symbol_374 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_376 = leftA_symbol_374;
				Value rightA_symbol_374;
				try {
					
					Value A_symbol_377 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_378 = valueFactory.typeOf(A_symbol_377, S_select);
					LibraryBinaryOperation dynamic_A_symbol_378 = (LibraryBinaryOperation)static_A_symbol_378.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_378 = dynamic_A_symbol_378.evaluate(evaluator, T_Boolean, A_symbol_377, S_select);
					rightA_symbol_374 = A_symbol_378;
				} catch (InvalidValueException e) {
					rightA_symbol_374 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_378 = rightA_symbol_374;
				DomainType static_A_symbol_374 = valueFactory.typeOf(A_symbol_376);
				LibraryBinaryOperation dynamic_A_symbol_374 = (LibraryBinaryOperation)static_A_symbol_374.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_374 = dynamic_A_symbol_374.evaluate(evaluator, T_Boolean, A_symbol_376, A_symbol_378);
				leftA_symbol_373 = A_symbol_374;
			} catch (InvalidValueException e) {
				leftA_symbol_373 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_374 = leftA_symbol_373;
			Value rightA_symbol_373;
			try {
				
				Value A_symbol_379 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_380 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_381 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_380, P_TypedElement_type);
				
				DomainType static_A_symbol_382 = valueFactory.typeOf(A_symbol_379, A_symbol_381);
				LibraryBinaryOperation dynamic_A_symbol_382 = (LibraryBinaryOperation)static_A_symbol_382.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_382 = dynamic_A_symbol_382.evaluate(evaluator, T_Boolean, A_symbol_379, A_symbol_381);
				rightA_symbol_373 = A_symbol_382;
			} catch (InvalidValueException e) {
				rightA_symbol_373 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_382 = rightA_symbol_373;
			DomainType static_A_symbol_373 = valueFactory.typeOf(A_symbol_374);
			LibraryBinaryOperation dynamic_A_symbol_373 = (LibraryBinaryOperation)static_A_symbol_373.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_373 = dynamic_A_symbol_373.evaluate(evaluator, T_Boolean, A_symbol_374, A_symbol_382);
			return A_symbol_373;
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
			
			Value leftA_symbol_383;
			try {
				
				Value A_symbol_384 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_385 = valueFactory.typeOf(A_symbol_384, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_385 = (LibraryBinaryOperation)static_A_symbol_385.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_385 = dynamic_A_symbol_385.evaluate(evaluator, T_Boolean, A_symbol_384, S_sortedBy);
				leftA_symbol_383 = A_symbol_385;
			} catch (InvalidValueException e) {
				leftA_symbol_383 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_385 = leftA_symbol_383;
			Value rightA_symbol_383;
			try {
				
				Value A_symbol_386 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_387 = valueFactory.typeOf(A_symbol_386);
				LibraryBinaryOperation dynamic_A_symbol_387 = (LibraryBinaryOperation)static_A_symbol_387.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_387 = dynamic_A_symbol_387.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_386, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_388 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_387, P_CollectionType_elementType);
				
				
				Value A_symbol_389 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_390 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_389, P_TypedElement_type);
				
				DomainType static_A_symbol_391 = valueFactory.typeOf(A_symbol_390);
				LibraryBinaryOperation dynamic_A_symbol_391 = (LibraryBinaryOperation)static_A_symbol_391.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_391 = dynamic_A_symbol_391.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_390, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_392 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_391, P_CollectionType_elementType);
				
				DomainType static_A_symbol_393 = valueFactory.typeOf(A_symbol_388, A_symbol_392);
				LibraryBinaryOperation dynamic_A_symbol_393 = (LibraryBinaryOperation)static_A_symbol_393.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_393 = dynamic_A_symbol_393.evaluate(evaluator, T_Boolean, A_symbol_388, A_symbol_392);
				rightA_symbol_383 = A_symbol_393;
			} catch (InvalidValueException e) {
				rightA_symbol_383 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_393 = rightA_symbol_383;
			DomainType static_A_symbol_383 = valueFactory.typeOf(A_symbol_385);
			LibraryBinaryOperation dynamic_A_symbol_383 = (LibraryBinaryOperation)static_A_symbol_383.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_383 = dynamic_A_symbol_383.evaluate(evaluator, T_Boolean, A_symbol_385, A_symbol_393);
			return A_symbol_383;
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
			
			Value leftA_symbol_394;
			try {
				
				Value A_symbol_395 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_396 = valueFactory.typeOf(A_symbol_395, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_396 = (LibraryBinaryOperation)static_A_symbol_396.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_396 = dynamic_A_symbol_396.evaluate(evaluator, T_Boolean, A_symbol_395, S_sortedBy);
				leftA_symbol_394 = A_symbol_396;
			} catch (InvalidValueException e) {
				leftA_symbol_394 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_396 = leftA_symbol_394;
			Value rightA_symbol_394;
			try {
				
				Value A_symbol_397 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_398 = valueFactory.typeOf(A_symbol_397);
				LibraryUnaryOperation dynamic_A_symbol_398 = (LibraryUnaryOperation)static_A_symbol_398.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_398 = dynamic_A_symbol_398.evaluate(evaluator, T_Integer, A_symbol_397);
				DomainType static_A_symbol_399 = valueFactory.typeOf(A_symbol_398, I_1);
				LibraryBinaryOperation dynamic_A_symbol_399 = (LibraryBinaryOperation)static_A_symbol_399.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_399 = dynamic_A_symbol_399.evaluate(evaluator, T_Boolean, A_symbol_398, I_1);
				rightA_symbol_394 = A_symbol_399;
			} catch (InvalidValueException e) {
				rightA_symbol_394 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_399 = rightA_symbol_394;
			DomainType static_A_symbol_394 = valueFactory.typeOf(A_symbol_396);
			LibraryBinaryOperation dynamic_A_symbol_394 = (LibraryBinaryOperation)static_A_symbol_394.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_394 = dynamic_A_symbol_394.evaluate(evaluator, T_Boolean, A_symbol_396, A_symbol_399);
			return A_symbol_394;
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
			
			Value leftA_symbol_400;
			try {
				
				Value A_symbol_401 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_402 = valueFactory.typeOf(A_symbol_401, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_402 = (LibraryBinaryOperation)static_A_symbol_402.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_402 = dynamic_A_symbol_402.evaluate(evaluator, T_Boolean, A_symbol_401, S_sortedBy);
				leftA_symbol_400 = A_symbol_402;
			} catch (InvalidValueException e) {
				leftA_symbol_400 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_402 = leftA_symbol_400;
			Value rightA_symbol_400;
			try {
					Value leftA_symbol_403;
					try {
						
						Value A_symbol_404 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_405 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_404, P_TypedElement_type);
						
						DomainType static_A_symbol_406 = valueFactory.typeOf(A_symbol_405);
						LibraryBinaryOperation dynamic_A_symbol_406 = (LibraryBinaryOperation)static_A_symbol_406.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_406 = dynamic_A_symbol_406.evaluate(evaluator, T_Boolean, A_symbol_405, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_403 = A_symbol_406;
					} catch (InvalidValueException e) {
						leftA_symbol_403 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_406 = leftA_symbol_403;
					Value rightA_symbol_403;
					try {
						
						Value A_symbol_407 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_408 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_407, P_TypedElement_type);
						
						DomainType static_A_symbol_409 = valueFactory.typeOf(A_symbol_408);
						LibraryBinaryOperation dynamic_A_symbol_409 = (LibraryBinaryOperation)static_A_symbol_409.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_409 = dynamic_A_symbol_409.evaluate(evaluator, T_Boolean, A_symbol_408, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
						rightA_symbol_403 = A_symbol_409;
					} catch (InvalidValueException e) {
						rightA_symbol_403 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_409 = rightA_symbol_403;
					DomainType static_A_symbol_403 = valueFactory.typeOf(A_symbol_406);
					LibraryBinaryOperation dynamic_A_symbol_403 = (LibraryBinaryOperation)static_A_symbol_403.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_403 = dynamic_A_symbol_403.evaluate(evaluator, T_Boolean, A_symbol_406, A_symbol_409);
				Value A_symbol_410;
				if (A_symbol_403.isTrue()) {
					
					Value A_symbol_411 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_412 = valueFactory.typeOf(A_symbol_411);
					LibraryBinaryOperation dynamic_A_symbol_412 = (LibraryBinaryOperation)static_A_symbol_412.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_412 = dynamic_A_symbol_412.evaluate(evaluator, T_Boolean, A_symbol_411, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_410 = A_symbol_412;
				}
				else if (A_symbol_403.isFalse()) {
					
					Value A_symbol_413 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_414 = valueFactory.typeOf(A_symbol_413);
					LibraryBinaryOperation dynamic_A_symbol_414 = (LibraryBinaryOperation)static_A_symbol_414.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_414 = dynamic_A_symbol_414.evaluate(evaluator, T_Boolean, A_symbol_413, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_410 = A_symbol_414;
				}
				else if (A_symbol_403.isNull()) {
					A_symbol_410 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_410 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_400 = A_symbol_410;
			} catch (InvalidValueException e) {
				rightA_symbol_400 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_410 = rightA_symbol_400;
			DomainType static_A_symbol_400 = valueFactory.typeOf(A_symbol_402);
			LibraryBinaryOperation dynamic_A_symbol_400 = (LibraryBinaryOperation)static_A_symbol_400.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_400 = dynamic_A_symbol_400.evaluate(evaluator, T_Boolean, A_symbol_402, A_symbol_410);
			return A_symbol_400;
		}
	}
}

