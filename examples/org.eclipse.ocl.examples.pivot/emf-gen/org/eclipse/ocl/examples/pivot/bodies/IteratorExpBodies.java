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
			
			Value leftA_symbol_80;
			try {
				
				Value A_symbol_81 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_82 = valueFactory.typeOf(A_symbol_81, S_any);
				LibraryBinaryOperation dynamic_A_symbol_82 = (LibraryBinaryOperation)static_A_symbol_82.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_82 = dynamic_A_symbol_82.evaluate(evaluator, T_Boolean, A_symbol_81, S_any);
				leftA_symbol_80 = A_symbol_82;
			} catch (InvalidValueException e) {
				leftA_symbol_80 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_82 = leftA_symbol_80;
			Value rightA_symbol_80;
			try {
				
				Value A_symbol_83 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_84 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_83, P_TypedElement_type);
				
				DomainType static_A_symbol_85 = valueFactory.typeOf(A_symbol_84, S_Boolean);
				LibraryBinaryOperation dynamic_A_symbol_85 = (LibraryBinaryOperation)static_A_symbol_85.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_85 = dynamic_A_symbol_85.evaluate(evaluator, T_Boolean, A_symbol_84, S_Boolean);
				rightA_symbol_80 = A_symbol_85;
			} catch (InvalidValueException e) {
				rightA_symbol_80 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_85 = rightA_symbol_80;
			DomainType static_A_symbol_80 = valueFactory.typeOf(A_symbol_82);
			LibraryBinaryOperation dynamic_A_symbol_80 = (LibraryBinaryOperation)static_A_symbol_80.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_80 = dynamic_A_symbol_80.evaluate(evaluator, T_Boolean, A_symbol_82, A_symbol_85);
			return A_symbol_80;
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
			
			Value leftA_symbol_86;
			try {
				
				Value A_symbol_87 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_88 = valueFactory.typeOf(A_symbol_87, S_any);
				LibraryBinaryOperation dynamic_A_symbol_88 = (LibraryBinaryOperation)static_A_symbol_88.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_88 = dynamic_A_symbol_88.evaluate(evaluator, T_Boolean, A_symbol_87, S_any);
				leftA_symbol_86 = A_symbol_88;
			} catch (InvalidValueException e) {
				leftA_symbol_86 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_88 = leftA_symbol_86;
			Value rightA_symbol_86;
			try {
				
				Value A_symbol_89 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_90 = valueFactory.typeOf(A_symbol_89);
				LibraryUnaryOperation dynamic_A_symbol_90 = (LibraryUnaryOperation)static_A_symbol_90.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_90 = dynamic_A_symbol_90.evaluate(evaluator, T_Integer, A_symbol_89);
				DomainType static_A_symbol_91 = valueFactory.typeOf(A_symbol_90, I_1);
				LibraryBinaryOperation dynamic_A_symbol_91 = (LibraryBinaryOperation)static_A_symbol_91.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_91 = dynamic_A_symbol_91.evaluate(evaluator, T_Boolean, A_symbol_90, I_1);
				rightA_symbol_86 = A_symbol_91;
			} catch (InvalidValueException e) {
				rightA_symbol_86 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_91 = rightA_symbol_86;
			DomainType static_A_symbol_86 = valueFactory.typeOf(A_symbol_88);
			LibraryBinaryOperation dynamic_A_symbol_86 = (LibraryBinaryOperation)static_A_symbol_86.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_86 = dynamic_A_symbol_86.evaluate(evaluator, T_Boolean, A_symbol_88, A_symbol_91);
			return A_symbol_86;
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
				
				Value A_symbol_95 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_96 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_97 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_96, P_TypedElement_type);
				
				DomainType static_A_symbol_98 = valueFactory.typeOf(A_symbol_97);
				LibraryBinaryOperation dynamic_A_symbol_98 = (LibraryBinaryOperation)static_A_symbol_98.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_98 = dynamic_A_symbol_98.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_97, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_99 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_98, P_CollectionType_elementType);
				
				DomainType static_A_symbol_100 = valueFactory.typeOf(A_symbol_95, A_symbol_99);
				LibraryBinaryOperation dynamic_A_symbol_100 = (LibraryBinaryOperation)static_A_symbol_100.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_100 = dynamic_A_symbol_100.evaluate(evaluator, T_Boolean, A_symbol_95, A_symbol_99);
				rightA_symbol_92 = A_symbol_100;
			} catch (InvalidValueException e) {
				rightA_symbol_92 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_100 = rightA_symbol_92;
			DomainType static_A_symbol_92 = valueFactory.typeOf(A_symbol_94);
			LibraryBinaryOperation dynamic_A_symbol_92 = (LibraryBinaryOperation)static_A_symbol_92.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_92 = dynamic_A_symbol_92.evaluate(evaluator, T_Boolean, A_symbol_94, A_symbol_100);
			return A_symbol_92;
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
			
			Value leftA_symbol_101;
			try {
				
				Value A_symbol_102 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_103 = valueFactory.typeOf(A_symbol_102, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_103 = (LibraryBinaryOperation)static_A_symbol_103.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_103 = dynamic_A_symbol_103.evaluate(evaluator, T_Boolean, A_symbol_102, S_closure);
				leftA_symbol_101 = A_symbol_103;
			} catch (InvalidValueException e) {
				leftA_symbol_101 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_103 = leftA_symbol_101;
			Value rightA_symbol_101;
			try {
				
				Value A_symbol_104 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_105 = valueFactory.typeOf(A_symbol_104);
				LibraryBinaryOperation dynamic_A_symbol_105 = (LibraryBinaryOperation)static_A_symbol_105.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_105 = dynamic_A_symbol_105.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_104, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_106 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_105, P_CollectionType_elementType);
				
				
				Value A_symbol_107 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_108 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_107, P_TypedElement_type);
				
				DomainType static_A_symbol_109 = valueFactory.typeOf(A_symbol_108);
				LibraryBinaryOperation dynamic_A_symbol_109 = (LibraryBinaryOperation)static_A_symbol_109.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_109 = dynamic_A_symbol_109.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_108, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_110 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_109, P_CollectionType_elementType);
				
				DomainType static_A_symbol_111 = valueFactory.typeOf(A_symbol_106, A_symbol_110);
				LibraryBinaryOperation dynamic_A_symbol_111 = (LibraryBinaryOperation)static_A_symbol_111.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_111 = dynamic_A_symbol_111.evaluate(evaluator, T_Boolean, A_symbol_106, A_symbol_110);
				rightA_symbol_101 = A_symbol_111;
			} catch (InvalidValueException e) {
				rightA_symbol_101 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_111 = rightA_symbol_101;
			DomainType static_A_symbol_101 = valueFactory.typeOf(A_symbol_103);
			LibraryBinaryOperation dynamic_A_symbol_101 = (LibraryBinaryOperation)static_A_symbol_101.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_101 = dynamic_A_symbol_101.evaluate(evaluator, T_Boolean, A_symbol_103, A_symbol_111);
			return A_symbol_101;
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
			
			Value leftA_symbol_112;
			try {
				
				Value A_symbol_113 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_114 = valueFactory.typeOf(A_symbol_113, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_114 = (LibraryBinaryOperation)static_A_symbol_114.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_114 = dynamic_A_symbol_114.evaluate(evaluator, T_Boolean, A_symbol_113, S_closure);
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
			
			Value leftA_symbol_118;
			try {
				
				Value A_symbol_119 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_120 = valueFactory.typeOf(A_symbol_119, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_120 = (LibraryBinaryOperation)static_A_symbol_120.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_120 = dynamic_A_symbol_120.evaluate(evaluator, T_Boolean, A_symbol_119, S_closure);
				leftA_symbol_118 = A_symbol_120;
			} catch (InvalidValueException e) {
				leftA_symbol_118 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_120 = leftA_symbol_118;
			Value rightA_symbol_118;
			try {
				
				Value A_symbol_121 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_122 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_121, P_TypedElement_type);
				
				DomainType static_A_symbol_123 = valueFactory.typeOf(A_symbol_122);
				LibraryBinaryOperation dynamic_A_symbol_123 = (LibraryBinaryOperation)static_A_symbol_123.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_123 = dynamic_A_symbol_123.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_122, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_124 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_123, P_CollectionType_elementType);
				
					
					Value A_symbol_125 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_126 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_125, P_TypedElement_type);
					
					DomainType static_A_symbol_127 = valueFactory.typeOf(A_symbol_126);
					LibraryBinaryOperation dynamic_A_symbol_127 = (LibraryBinaryOperation)static_A_symbol_127.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_127 = dynamic_A_symbol_127.evaluate(evaluator, T_Boolean, A_symbol_126, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_128;
				if (A_symbol_127.isTrue()) {
					
					Value A_symbol_129 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_130 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_129, P_TypedElement_type);
					
					DomainType static_A_symbol_131 = valueFactory.typeOf(A_symbol_130);
					LibraryBinaryOperation dynamic_A_symbol_131 = (LibraryBinaryOperation)static_A_symbol_131.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_131 = dynamic_A_symbol_131.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_130, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_132 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_131, P_CollectionType_elementType);
					
					A_symbol_128 = A_symbol_132;
				}
				else if (A_symbol_127.isFalse()) {
					
					Value A_symbol_133 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
					
					Value A_symbol_134 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_133, P_TypedElement_type);
					
					A_symbol_128 = A_symbol_134;
				}
				else if (A_symbol_127.isNull()) {
					A_symbol_128 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_128 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				DomainType static_A_symbol_135 = valueFactory.typeOf(A_symbol_124, A_symbol_128);
				LibraryBinaryOperation dynamic_A_symbol_135 = (LibraryBinaryOperation)static_A_symbol_135.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_135 = dynamic_A_symbol_135.evaluate(evaluator, T_Boolean, A_symbol_124, A_symbol_128);
				rightA_symbol_118 = A_symbol_135;
			} catch (InvalidValueException e) {
				rightA_symbol_118 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_135 = rightA_symbol_118;
			DomainType static_A_symbol_118 = valueFactory.typeOf(A_symbol_120);
			LibraryBinaryOperation dynamic_A_symbol_118 = (LibraryBinaryOperation)static_A_symbol_118.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_118 = dynamic_A_symbol_118.evaluate(evaluator, T_Boolean, A_symbol_120, A_symbol_135);
			return A_symbol_118;
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
			
			Value leftA_symbol_136;
			try {
				
				Value A_symbol_137 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_138 = valueFactory.typeOf(A_symbol_137, S_closure);
				LibraryBinaryOperation dynamic_A_symbol_138 = (LibraryBinaryOperation)static_A_symbol_138.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_138 = dynamic_A_symbol_138.evaluate(evaluator, T_Boolean, A_symbol_137, S_closure);
				leftA_symbol_136 = A_symbol_138;
			} catch (InvalidValueException e) {
				leftA_symbol_136 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_138 = leftA_symbol_136;
			Value rightA_symbol_136;
			try {
					Value leftA_symbol_139;
					try {
						
						Value A_symbol_140 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_141 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_140, P_TypedElement_type);
						
						DomainType static_A_symbol_142 = valueFactory.typeOf(A_symbol_141);
						LibraryBinaryOperation dynamic_A_symbol_142 = (LibraryBinaryOperation)static_A_symbol_142.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_142 = dynamic_A_symbol_142.evaluate(evaluator, T_Boolean, A_symbol_141, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_139 = A_symbol_142;
					} catch (InvalidValueException e) {
						leftA_symbol_139 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_142 = leftA_symbol_139;
					Value rightA_symbol_139;
					try {
						
						Value A_symbol_143 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_144 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_143, P_TypedElement_type);
						
						DomainType static_A_symbol_145 = valueFactory.typeOf(A_symbol_144);
						LibraryBinaryOperation dynamic_A_symbol_145 = (LibraryBinaryOperation)static_A_symbol_145.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_145 = dynamic_A_symbol_145.evaluate(evaluator, T_Boolean, A_symbol_144, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_139 = A_symbol_145;
					} catch (InvalidValueException e) {
						rightA_symbol_139 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_145 = rightA_symbol_139;
					DomainType static_A_symbol_139 = valueFactory.typeOf(A_symbol_142);
					LibraryBinaryOperation dynamic_A_symbol_139 = (LibraryBinaryOperation)static_A_symbol_139.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_139 = dynamic_A_symbol_139.evaluate(evaluator, T_Boolean, A_symbol_142, A_symbol_145);
				Value A_symbol_146;
				if (A_symbol_139.isTrue()) {
					
					Value A_symbol_147 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_148 = valueFactory.typeOf(A_symbol_147);
					LibraryBinaryOperation dynamic_A_symbol_148 = (LibraryBinaryOperation)static_A_symbol_148.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_148 = dynamic_A_symbol_148.evaluate(evaluator, T_Boolean, A_symbol_147, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_146 = A_symbol_148;
				}
				else if (A_symbol_139.isFalse()) {
					
					Value A_symbol_149 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_150 = valueFactory.typeOf(A_symbol_149);
					LibraryBinaryOperation dynamic_A_symbol_150 = (LibraryBinaryOperation)static_A_symbol_150.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_150 = dynamic_A_symbol_150.evaluate(evaluator, T_Boolean, A_symbol_149, T_ClassClassifier_Pivot_ecore__pivot__SetType_);
					A_symbol_146 = A_symbol_150;
				}
				else if (A_symbol_139.isNull()) {
					A_symbol_146 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_146 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_136 = A_symbol_146;
			} catch (InvalidValueException e) {
				rightA_symbol_136 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_146 = rightA_symbol_136;
			DomainType static_A_symbol_136 = valueFactory.typeOf(A_symbol_138);
			LibraryBinaryOperation dynamic_A_symbol_136 = (LibraryBinaryOperation)static_A_symbol_136.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_136 = dynamic_A_symbol_136.evaluate(evaluator, T_Boolean, A_symbol_138, A_symbol_146);
			return A_symbol_136;
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
			
			Value leftA_symbol_151;
			try {
				
				Value A_symbol_152 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_153 = valueFactory.typeOf(A_symbol_152, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_153 = (LibraryBinaryOperation)static_A_symbol_153.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_153 = dynamic_A_symbol_153.evaluate(evaluator, T_Boolean, A_symbol_152, S_collect);
				leftA_symbol_151 = A_symbol_153;
			} catch (InvalidValueException e) {
				leftA_symbol_151 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_153 = leftA_symbol_151;
			Value rightA_symbol_151;
			try {
				
				Value A_symbol_154 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_155 = valueFactory.typeOf(A_symbol_154);
				LibraryBinaryOperation dynamic_A_symbol_155 = (LibraryBinaryOperation)static_A_symbol_155.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_155 = dynamic_A_symbol_155.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_154, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_156 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_155, P_CollectionType_elementType);
				
				
				Value A_symbol_157 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_158 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_157, P_TypedElement_type);
				
				DomainType static_A_symbol_159 = valueFactory.typeOf(A_symbol_158);
				LibraryBinaryOperation dynamic_A_symbol_159 = (LibraryBinaryOperation)static_A_symbol_159.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_159 = dynamic_A_symbol_159.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_158, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_160 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_159, P_CollectionType_elementType);
				
				DomainType static_A_symbol_161 = valueFactory.typeOf(A_symbol_156, A_symbol_160);
				LibraryBinaryOperation dynamic_A_symbol_161 = (LibraryBinaryOperation)static_A_symbol_161.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_161 = dynamic_A_symbol_161.evaluate(evaluator, T_Boolean, A_symbol_156, A_symbol_160);
				rightA_symbol_151 = A_symbol_161;
			} catch (InvalidValueException e) {
				rightA_symbol_151 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_161 = rightA_symbol_151;
			DomainType static_A_symbol_151 = valueFactory.typeOf(A_symbol_153);
			LibraryBinaryOperation dynamic_A_symbol_151 = (LibraryBinaryOperation)static_A_symbol_151.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_151 = dynamic_A_symbol_151.evaluate(evaluator, T_Boolean, A_symbol_153, A_symbol_161);
			return A_symbol_151;
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
			
			Value leftA_symbol_162;
			try {
				
				Value A_symbol_163 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_164 = valueFactory.typeOf(A_symbol_163, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_164 = (LibraryBinaryOperation)static_A_symbol_164.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_164 = dynamic_A_symbol_164.evaluate(evaluator, T_Boolean, A_symbol_163, S_collect);
				leftA_symbol_162 = A_symbol_164;
			} catch (InvalidValueException e) {
				leftA_symbol_162 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_164 = leftA_symbol_162;
			Value rightA_symbol_162;
			try {
				
				Value A_symbol_165 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_166 = valueFactory.typeOf(A_symbol_165);
				LibraryUnaryOperation dynamic_A_symbol_166 = (LibraryUnaryOperation)static_A_symbol_166.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_166 = dynamic_A_symbol_166.evaluate(evaluator, T_Integer, A_symbol_165);
				DomainType static_A_symbol_167 = valueFactory.typeOf(A_symbol_166, I_1);
				LibraryBinaryOperation dynamic_A_symbol_167 = (LibraryBinaryOperation)static_A_symbol_167.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_167 = dynamic_A_symbol_167.evaluate(evaluator, T_Boolean, A_symbol_166, I_1);
				rightA_symbol_162 = A_symbol_167;
			} catch (InvalidValueException e) {
				rightA_symbol_162 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_167 = rightA_symbol_162;
			DomainType static_A_symbol_162 = valueFactory.typeOf(A_symbol_164);
			LibraryBinaryOperation dynamic_A_symbol_162 = (LibraryBinaryOperation)static_A_symbol_162.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_162 = dynamic_A_symbol_162.evaluate(evaluator, T_Boolean, A_symbol_164, A_symbol_167);
			return A_symbol_162;
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
			
			Value leftA_symbol_168;
			try {
				
				Value A_symbol_169 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_170 = valueFactory.typeOf(A_symbol_169, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_170 = (LibraryBinaryOperation)static_A_symbol_170.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_170 = dynamic_A_symbol_170.evaluate(evaluator, T_Boolean, A_symbol_169, S_collectN___);
				leftA_symbol_168 = A_symbol_170;
			} catch (InvalidValueException e) {
				leftA_symbol_168 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_170 = leftA_symbol_168;
			Value rightA_symbol_168;
			try {
				
				Value A_symbol_171 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_172 = valueFactory.typeOf(A_symbol_171);
				LibraryUnaryOperation dynamic_A_symbol_172 = (LibraryUnaryOperation)static_A_symbol_172.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_172 = dynamic_A_symbol_172.evaluate(evaluator, T_Integer, A_symbol_171);
				DomainType static_A_symbol_173 = valueFactory.typeOf(A_symbol_172, I_1);
				LibraryBinaryOperation dynamic_A_symbol_173 = (LibraryBinaryOperation)static_A_symbol_173.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_173 = dynamic_A_symbol_173.evaluate(evaluator, T_Boolean, A_symbol_172, I_1);
				rightA_symbol_168 = A_symbol_173;
			} catch (InvalidValueException e) {
				rightA_symbol_168 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_173 = rightA_symbol_168;
			DomainType static_A_symbol_168 = valueFactory.typeOf(A_symbol_170);
			LibraryBinaryOperation dynamic_A_symbol_168 = (LibraryBinaryOperation)static_A_symbol_168.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_168 = dynamic_A_symbol_168.evaluate(evaluator, T_Boolean, A_symbol_170, A_symbol_173);
			return A_symbol_168;
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
			
			Value leftA_symbol_174;
			try {
				
				Value A_symbol_175 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_176 = valueFactory.typeOf(A_symbol_175, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_176 = (LibraryBinaryOperation)static_A_symbol_176.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_176 = dynamic_A_symbol_176.evaluate(evaluator, T_Boolean, A_symbol_175, S_collectN___);
				leftA_symbol_174 = A_symbol_176;
			} catch (InvalidValueException e) {
				leftA_symbol_174 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_176 = leftA_symbol_174;
			Value rightA_symbol_174;
			try {
				
				Value A_symbol_177 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_178 = valueFactory.typeOf(A_symbol_177);
				LibraryBinaryOperation dynamic_A_symbol_178 = (LibraryBinaryOperation)static_A_symbol_178.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_178 = dynamic_A_symbol_178.evaluate(evaluator, T_Boolean, A_symbol_177, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
				rightA_symbol_174 = A_symbol_178;
			} catch (InvalidValueException e) {
				rightA_symbol_174 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_178 = rightA_symbol_174;
			DomainType static_A_symbol_174 = valueFactory.typeOf(A_symbol_176);
			LibraryBinaryOperation dynamic_A_symbol_174 = (LibraryBinaryOperation)static_A_symbol_174.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_174 = dynamic_A_symbol_174.evaluate(evaluator, T_Boolean, A_symbol_176, A_symbol_178);
			return A_symbol_174;
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
			
			Value leftA_symbol_179;
			try {
				
				Value A_symbol_180 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_181 = valueFactory.typeOf(A_symbol_180, S_collectN___);
				LibraryBinaryOperation dynamic_A_symbol_181 = (LibraryBinaryOperation)static_A_symbol_181.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_181 = dynamic_A_symbol_181.evaluate(evaluator, T_Boolean, A_symbol_180, S_collectN___);
				leftA_symbol_179 = A_symbol_181;
			} catch (InvalidValueException e) {
				leftA_symbol_179 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_181 = leftA_symbol_179;
			Value rightA_symbol_179;
			try {
				
				Value A_symbol_182 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_183 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_184 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_183, P_TypedElement_type);
				
				DomainType static_A_symbol_185 = valueFactory.typeOf(A_symbol_182, A_symbol_184);
				LibraryBinaryOperation dynamic_A_symbol_185 = (LibraryBinaryOperation)static_A_symbol_185.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_185 = dynamic_A_symbol_185.evaluate(evaluator, T_Boolean, A_symbol_182, A_symbol_184);
				rightA_symbol_179 = A_symbol_185;
			} catch (InvalidValueException e) {
				rightA_symbol_179 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_185 = rightA_symbol_179;
			DomainType static_A_symbol_179 = valueFactory.typeOf(A_symbol_181);
			LibraryBinaryOperation dynamic_A_symbol_179 = (LibraryBinaryOperation)static_A_symbol_179.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_179 = dynamic_A_symbol_179.evaluate(evaluator, T_Boolean, A_symbol_181, A_symbol_185);
			return A_symbol_179;
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
			
			Value leftA_symbol_186;
			try {
				
				Value A_symbol_187 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_188 = valueFactory.typeOf(A_symbol_187, S_collect);
				LibraryBinaryOperation dynamic_A_symbol_188 = (LibraryBinaryOperation)static_A_symbol_188.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_188 = dynamic_A_symbol_188.evaluate(evaluator, T_Boolean, A_symbol_187, S_collect);
				leftA_symbol_186 = A_symbol_188;
			} catch (InvalidValueException e) {
				leftA_symbol_186 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_188 = leftA_symbol_186;
			Value rightA_symbol_186;
			try {
					Value leftA_symbol_189;
					try {
						
						Value A_symbol_190 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_191 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_190, P_TypedElement_type);
						
						DomainType static_A_symbol_192 = valueFactory.typeOf(A_symbol_191);
						LibraryBinaryOperation dynamic_A_symbol_192 = (LibraryBinaryOperation)static_A_symbol_192.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_192 = dynamic_A_symbol_192.evaluate(evaluator, T_Boolean, A_symbol_191, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_189 = A_symbol_192;
					} catch (InvalidValueException e) {
						leftA_symbol_189 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_192 = leftA_symbol_189;
					Value rightA_symbol_189;
					try {
						
						Value A_symbol_193 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_194 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_193, P_TypedElement_type);
						
						DomainType static_A_symbol_195 = valueFactory.typeOf(A_symbol_194);
						LibraryBinaryOperation dynamic_A_symbol_195 = (LibraryBinaryOperation)static_A_symbol_195.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_195 = dynamic_A_symbol_195.evaluate(evaluator, T_Boolean, A_symbol_194, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
						rightA_symbol_189 = A_symbol_195;
					} catch (InvalidValueException e) {
						rightA_symbol_189 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_195 = rightA_symbol_189;
					DomainType static_A_symbol_189 = valueFactory.typeOf(A_symbol_192);
					LibraryBinaryOperation dynamic_A_symbol_189 = (LibraryBinaryOperation)static_A_symbol_189.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_189 = dynamic_A_symbol_189.evaluate(evaluator, T_Boolean, A_symbol_192, A_symbol_195);
				Value A_symbol_196;
				if (A_symbol_189.isTrue()) {
					
					Value A_symbol_197 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_198 = valueFactory.typeOf(A_symbol_197);
					LibraryBinaryOperation dynamic_A_symbol_198 = (LibraryBinaryOperation)static_A_symbol_198.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_198 = dynamic_A_symbol_198.evaluate(evaluator, T_Boolean, A_symbol_197, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_196 = A_symbol_198;
				}
				else if (A_symbol_189.isFalse()) {
					
					Value A_symbol_199 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_200 = valueFactory.typeOf(A_symbol_199);
					LibraryBinaryOperation dynamic_A_symbol_200 = (LibraryBinaryOperation)static_A_symbol_200.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_200 = dynamic_A_symbol_200.evaluate(evaluator, T_Boolean, A_symbol_199, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
					A_symbol_196 = A_symbol_200;
				}
				else if (A_symbol_189.isNull()) {
					A_symbol_196 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_196 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_186 = A_symbol_196;
			} catch (InvalidValueException e) {
				rightA_symbol_186 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_196 = rightA_symbol_186;
			DomainType static_A_symbol_186 = valueFactory.typeOf(A_symbol_188);
			LibraryBinaryOperation dynamic_A_symbol_186 = (LibraryBinaryOperation)static_A_symbol_186.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_186 = dynamic_A_symbol_186.evaluate(evaluator, T_Boolean, A_symbol_188, A_symbol_196);
			return A_symbol_186;
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
			
			Value leftA_symbol_201;
			try {
				
				Value A_symbol_202 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_203 = valueFactory.typeOf(A_symbol_202, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_203 = (LibraryBinaryOperation)static_A_symbol_203.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_203 = dynamic_A_symbol_203.evaluate(evaluator, T_Boolean, A_symbol_202, S_exists);
				leftA_symbol_201 = A_symbol_203;
			} catch (InvalidValueException e) {
				leftA_symbol_201 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_203 = leftA_symbol_201;
			Value rightA_symbol_201;
			try {
				
				Value A_symbol_204 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_205 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_204, P_TypedElement_type);
				
				DomainType static_A_symbol_206 = valueFactory.typeOf(A_symbol_205, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_206 = (LibraryBinaryOperation)static_A_symbol_206.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_206 = dynamic_A_symbol_206.evaluate(evaluator, T_Boolean, A_symbol_205, T_ClassClassifier_Boolean_);
				rightA_symbol_201 = A_symbol_206;
			} catch (InvalidValueException e) {
				rightA_symbol_201 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_206 = rightA_symbol_201;
			DomainType static_A_symbol_201 = valueFactory.typeOf(A_symbol_203);
			LibraryBinaryOperation dynamic_A_symbol_201 = (LibraryBinaryOperation)static_A_symbol_201.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_201 = dynamic_A_symbol_201.evaluate(evaluator, T_Boolean, A_symbol_203, A_symbol_206);
			return A_symbol_201;
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
			
			Value leftA_symbol_207;
			try {
				
				Value A_symbol_208 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_209 = valueFactory.typeOf(A_symbol_208, S_exists);
				LibraryBinaryOperation dynamic_A_symbol_209 = (LibraryBinaryOperation)static_A_symbol_209.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_209 = dynamic_A_symbol_209.evaluate(evaluator, T_Boolean, A_symbol_208, S_exists);
				leftA_symbol_207 = A_symbol_209;
			} catch (InvalidValueException e) {
				leftA_symbol_207 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_209 = leftA_symbol_207;
			Value rightA_symbol_207;
			try {
				
				Value A_symbol_210 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_211 = valueFactory.typeOf(A_symbol_210, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_211 = (LibraryBinaryOperation)static_A_symbol_211.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_211 = dynamic_A_symbol_211.evaluate(evaluator, T_Boolean, A_symbol_210, T_ClassClassifier_Boolean_);
				rightA_symbol_207 = A_symbol_211;
			} catch (InvalidValueException e) {
				rightA_symbol_207 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_211 = rightA_symbol_207;
			DomainType static_A_symbol_207 = valueFactory.typeOf(A_symbol_209);
			LibraryBinaryOperation dynamic_A_symbol_207 = (LibraryBinaryOperation)static_A_symbol_207.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_207 = dynamic_A_symbol_207.evaluate(evaluator, T_Boolean, A_symbol_209, A_symbol_211);
			return A_symbol_207;
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
			
			Value leftA_symbol_212;
			try {
				
				Value A_symbol_213 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_214 = valueFactory.typeOf(A_symbol_213, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_214 = (LibraryBinaryOperation)static_A_symbol_214.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_214 = dynamic_A_symbol_214.evaluate(evaluator, T_Boolean, A_symbol_213, S_forAll);
				leftA_symbol_212 = A_symbol_214;
			} catch (InvalidValueException e) {
				leftA_symbol_212 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_214 = leftA_symbol_212;
			Value rightA_symbol_212;
			try {
				
				Value A_symbol_215 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_216 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_215, P_TypedElement_type);
				
				DomainType static_A_symbol_217 = valueFactory.typeOf(A_symbol_216, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_217 = (LibraryBinaryOperation)static_A_symbol_217.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_217 = dynamic_A_symbol_217.evaluate(evaluator, T_Boolean, A_symbol_216, T_ClassClassifier_Boolean_);
				rightA_symbol_212 = A_symbol_217;
			} catch (InvalidValueException e) {
				rightA_symbol_212 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_217 = rightA_symbol_212;
			DomainType static_A_symbol_212 = valueFactory.typeOf(A_symbol_214);
			LibraryBinaryOperation dynamic_A_symbol_212 = (LibraryBinaryOperation)static_A_symbol_212.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_212 = dynamic_A_symbol_212.evaluate(evaluator, T_Boolean, A_symbol_214, A_symbol_217);
			return A_symbol_212;
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
			
			Value leftA_symbol_218;
			try {
				
				Value A_symbol_219 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_220 = valueFactory.typeOf(A_symbol_219, S_forAll);
				LibraryBinaryOperation dynamic_A_symbol_220 = (LibraryBinaryOperation)static_A_symbol_220.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_220 = dynamic_A_symbol_220.evaluate(evaluator, T_Boolean, A_symbol_219, S_forAll);
				leftA_symbol_218 = A_symbol_220;
			} catch (InvalidValueException e) {
				leftA_symbol_218 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_220 = leftA_symbol_218;
			Value rightA_symbol_218;
			try {
				
				Value A_symbol_221 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_222 = valueFactory.typeOf(A_symbol_221, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_222 = (LibraryBinaryOperation)static_A_symbol_222.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_222 = dynamic_A_symbol_222.evaluate(evaluator, T_Boolean, A_symbol_221, T_ClassClassifier_Boolean_);
				rightA_symbol_218 = A_symbol_222;
			} catch (InvalidValueException e) {
				rightA_symbol_218 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_222 = rightA_symbol_218;
			DomainType static_A_symbol_218 = valueFactory.typeOf(A_symbol_220);
			LibraryBinaryOperation dynamic_A_symbol_218 = (LibraryBinaryOperation)static_A_symbol_218.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_218 = dynamic_A_symbol_218.evaluate(evaluator, T_Boolean, A_symbol_220, A_symbol_222);
			return A_symbol_218;
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
			
			Value leftA_symbol_223;
			try {
				
				Value A_symbol_224 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_225 = valueFactory.typeOf(A_symbol_224, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_225 = (LibraryBinaryOperation)static_A_symbol_225.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_225 = dynamic_A_symbol_225.evaluate(evaluator, T_Boolean, A_symbol_224, S_isUnique);
				leftA_symbol_223 = A_symbol_225;
			} catch (InvalidValueException e) {
				leftA_symbol_223 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_225 = leftA_symbol_223;
			Value rightA_symbol_223;
			try {
				
				Value A_symbol_226 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_227 = valueFactory.typeOf(A_symbol_226);
				LibraryUnaryOperation dynamic_A_symbol_227 = (LibraryUnaryOperation)static_A_symbol_227.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_227 = dynamic_A_symbol_227.evaluate(evaluator, T_Integer, A_symbol_226);
				DomainType static_A_symbol_228 = valueFactory.typeOf(A_symbol_227, I_1);
				LibraryBinaryOperation dynamic_A_symbol_228 = (LibraryBinaryOperation)static_A_symbol_228.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_228 = dynamic_A_symbol_228.evaluate(evaluator, T_Boolean, A_symbol_227, I_1);
				rightA_symbol_223 = A_symbol_228;
			} catch (InvalidValueException e) {
				rightA_symbol_223 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_228 = rightA_symbol_223;
			DomainType static_A_symbol_223 = valueFactory.typeOf(A_symbol_225);
			LibraryBinaryOperation dynamic_A_symbol_223 = (LibraryBinaryOperation)static_A_symbol_223.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_223 = dynamic_A_symbol_223.evaluate(evaluator, T_Boolean, A_symbol_225, A_symbol_228);
			return A_symbol_223;
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
			
			Value leftA_symbol_229;
			try {
				
				Value A_symbol_230 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_231 = valueFactory.typeOf(A_symbol_230, S_isUnique);
				LibraryBinaryOperation dynamic_A_symbol_231 = (LibraryBinaryOperation)static_A_symbol_231.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_231 = dynamic_A_symbol_231.evaluate(evaluator, T_Boolean, A_symbol_230, S_isUnique);
				leftA_symbol_229 = A_symbol_231;
			} catch (InvalidValueException e) {
				leftA_symbol_229 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_231 = leftA_symbol_229;
			Value rightA_symbol_229;
			try {
				
				Value A_symbol_232 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_233 = valueFactory.typeOf(A_symbol_232, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_233 = (LibraryBinaryOperation)static_A_symbol_233.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_233 = dynamic_A_symbol_233.evaluate(evaluator, T_Boolean, A_symbol_232, T_ClassClassifier_Boolean_);
				rightA_symbol_229 = A_symbol_233;
			} catch (InvalidValueException e) {
				rightA_symbol_229 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_233 = rightA_symbol_229;
			DomainType static_A_symbol_229 = valueFactory.typeOf(A_symbol_231);
			LibraryBinaryOperation dynamic_A_symbol_229 = (LibraryBinaryOperation)static_A_symbol_229.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_229 = dynamic_A_symbol_229.evaluate(evaluator, T_Boolean, A_symbol_231, A_symbol_233);
			return A_symbol_229;
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
			
			
			Value A_symbol_234 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_235 = new AbstractBinaryOperation()
			{
			/*
			type =
			source.type.oclAsType(_'file:/C:/GIT/org.eclipse.ocl/examples/org.eclipse.ocl.examples.pivot/model/Pivot.ecore'::ocl::CollectionType).elementType
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_236 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_1_, P_TypedElement_type);
					
					
					Value A_symbol_237 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
					
					Value A_symbol_238 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_237, P_TypedElement_type);
					
					DomainType static_A_symbol_239 = valueFactory.typeOf(A_symbol_238);
					LibraryBinaryOperation dynamic_A_symbol_239 = (LibraryBinaryOperation)static_A_symbol_239.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
					Value A_symbol_239 = dynamic_A_symbol_239.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_238, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
					Value A_symbol_240 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_239, P_CollectionType_elementType);
					
					DomainType static_A_symbol_241 = valueFactory.typeOf(A_symbol_236, A_symbol_240);
					LibraryBinaryOperation dynamic_A_symbol_241 = (LibraryBinaryOperation)static_A_symbol_241.lookupImplementation(standardLibrary, O_OclAny__eq_);
					Value A_symbol_241 = dynamic_A_symbol_241.evaluate(evaluator, T_Boolean, A_symbol_236, A_symbol_240);
					return A_symbol_241;
				}
			};
			DomainType static_A_symbol_235 = A_symbol_234.getType();
			LibraryIteration dynamic_A_symbol_235 = (LibraryIteration)static_A_symbol_235.lookupImplementation(standardLibrary, O_Collection_forAll);
			Value acc_A_symbol_235 = dynamic_A_symbol_235.createAccumulatorValue(evaluator, T_Boolean, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_235 = new ExecutorSingleIterationManager(evaluator, T_Boolean, body_A_symbol_235, (CollectionValue)A_symbol_234, acc_A_symbol_235);
			Value A_symbol_235 = dynamic_A_symbol_235.evaluateIteration(manager_A_symbol_235);
			return A_symbol_235;
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
			
			Value leftA_symbol_242;
			try {
				
				Value A_symbol_243 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_244 = valueFactory.typeOf(A_symbol_243, S_one);
				LibraryBinaryOperation dynamic_A_symbol_244 = (LibraryBinaryOperation)static_A_symbol_244.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_244 = dynamic_A_symbol_244.evaluate(evaluator, T_Boolean, A_symbol_243, S_one);
				leftA_symbol_242 = A_symbol_244;
			} catch (InvalidValueException e) {
				leftA_symbol_242 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_244 = leftA_symbol_242;
			Value rightA_symbol_242;
			try {
				
				Value A_symbol_245 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_246 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_245, P_TypedElement_type);
				
				DomainType static_A_symbol_247 = valueFactory.typeOf(A_symbol_246, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_247 = (LibraryBinaryOperation)static_A_symbol_247.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_247 = dynamic_A_symbol_247.evaluate(evaluator, T_Boolean, A_symbol_246, T_ClassClassifier_Boolean_);
				rightA_symbol_242 = A_symbol_247;
			} catch (InvalidValueException e) {
				rightA_symbol_242 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_247 = rightA_symbol_242;
			DomainType static_A_symbol_242 = valueFactory.typeOf(A_symbol_244);
			LibraryBinaryOperation dynamic_A_symbol_242 = (LibraryBinaryOperation)static_A_symbol_242.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_242 = dynamic_A_symbol_242.evaluate(evaluator, T_Boolean, A_symbol_244, A_symbol_247);
			return A_symbol_242;
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
			
			Value leftA_symbol_248;
			try {
				
				Value A_symbol_249 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_250 = valueFactory.typeOf(A_symbol_249, S_one);
				LibraryBinaryOperation dynamic_A_symbol_250 = (LibraryBinaryOperation)static_A_symbol_250.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_250 = dynamic_A_symbol_250.evaluate(evaluator, T_Boolean, A_symbol_249, S_one);
				leftA_symbol_248 = A_symbol_250;
			} catch (InvalidValueException e) {
				leftA_symbol_248 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_250 = leftA_symbol_248;
			Value rightA_symbol_248;
			try {
				
				Value A_symbol_251 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_252 = valueFactory.typeOf(A_symbol_251);
				LibraryUnaryOperation dynamic_A_symbol_252 = (LibraryUnaryOperation)static_A_symbol_252.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_252 = dynamic_A_symbol_252.evaluate(evaluator, T_Integer, A_symbol_251);
				DomainType static_A_symbol_253 = valueFactory.typeOf(A_symbol_252, I_1);
				LibraryBinaryOperation dynamic_A_symbol_253 = (LibraryBinaryOperation)static_A_symbol_253.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_253 = dynamic_A_symbol_253.evaluate(evaluator, T_Boolean, A_symbol_252, I_1);
				rightA_symbol_248 = A_symbol_253;
			} catch (InvalidValueException e) {
				rightA_symbol_248 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_253 = rightA_symbol_248;
			DomainType static_A_symbol_248 = valueFactory.typeOf(A_symbol_250);
			LibraryBinaryOperation dynamic_A_symbol_248 = (LibraryBinaryOperation)static_A_symbol_248.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_248 = dynamic_A_symbol_248.evaluate(evaluator, T_Boolean, A_symbol_250, A_symbol_253);
			return A_symbol_248;
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
				
				Value A_symbol_257 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_258 = valueFactory.typeOf(A_symbol_257, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_258 = (LibraryBinaryOperation)static_A_symbol_258.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_258 = dynamic_A_symbol_258.evaluate(evaluator, T_Boolean, A_symbol_257, T_ClassClassifier_Boolean_);
				rightA_symbol_254 = A_symbol_258;
			} catch (InvalidValueException e) {
				rightA_symbol_254 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_258 = rightA_symbol_254;
			DomainType static_A_symbol_254 = valueFactory.typeOf(A_symbol_256);
			LibraryBinaryOperation dynamic_A_symbol_254 = (LibraryBinaryOperation)static_A_symbol_254.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_254 = dynamic_A_symbol_254.evaluate(evaluator, T_Boolean, A_symbol_256, A_symbol_258);
			return A_symbol_254;
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
			
			Value leftA_symbol_259;
			try {
				Value leftA_symbol_260;
				try {
					
					Value A_symbol_261 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_262 = valueFactory.typeOf(A_symbol_261, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_262 = (LibraryBinaryOperation)static_A_symbol_262.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_262 = dynamic_A_symbol_262.evaluate(evaluator, T_Boolean, A_symbol_261, S_reject);
					leftA_symbol_260 = A_symbol_262;
				} catch (InvalidValueException e) {
					leftA_symbol_260 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_262 = leftA_symbol_260;
				Value rightA_symbol_260;
				try {
					
					Value A_symbol_263 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_264 = valueFactory.typeOf(A_symbol_263, S_select);
					LibraryBinaryOperation dynamic_A_symbol_264 = (LibraryBinaryOperation)static_A_symbol_264.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_264 = dynamic_A_symbol_264.evaluate(evaluator, T_Boolean, A_symbol_263, S_select);
					rightA_symbol_260 = A_symbol_264;
				} catch (InvalidValueException e) {
					rightA_symbol_260 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_264 = rightA_symbol_260;
				DomainType static_A_symbol_260 = valueFactory.typeOf(A_symbol_262);
				LibraryBinaryOperation dynamic_A_symbol_260 = (LibraryBinaryOperation)static_A_symbol_260.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_260 = dynamic_A_symbol_260.evaluate(evaluator, T_Boolean, A_symbol_262, A_symbol_264);
				leftA_symbol_259 = A_symbol_260;
			} catch (InvalidValueException e) {
				leftA_symbol_259 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_260 = leftA_symbol_259;
			Value rightA_symbol_259;
			try {
				
				Value A_symbol_265 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_266 = valueFactory.typeOf(A_symbol_265);
				LibraryUnaryOperation dynamic_A_symbol_266 = (LibraryUnaryOperation)static_A_symbol_266.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_266 = dynamic_A_symbol_266.evaluate(evaluator, T_Integer, A_symbol_265);
				DomainType static_A_symbol_267 = valueFactory.typeOf(A_symbol_266, I_1);
				LibraryBinaryOperation dynamic_A_symbol_267 = (LibraryBinaryOperation)static_A_symbol_267.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_267 = dynamic_A_symbol_267.evaluate(evaluator, T_Boolean, A_symbol_266, I_1);
				rightA_symbol_259 = A_symbol_267;
			} catch (InvalidValueException e) {
				rightA_symbol_259 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_267 = rightA_symbol_259;
			DomainType static_A_symbol_259 = valueFactory.typeOf(A_symbol_260);
			LibraryBinaryOperation dynamic_A_symbol_259 = (LibraryBinaryOperation)static_A_symbol_259.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_259 = dynamic_A_symbol_259.evaluate(evaluator, T_Boolean, A_symbol_260, A_symbol_267);
			return A_symbol_259;
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
			
			Value leftA_symbol_268;
			try {
				Value leftA_symbol_269;
				try {
					
					Value A_symbol_270 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_271 = valueFactory.typeOf(A_symbol_270, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_271 = (LibraryBinaryOperation)static_A_symbol_271.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_271 = dynamic_A_symbol_271.evaluate(evaluator, T_Boolean, A_symbol_270, S_reject);
					leftA_symbol_269 = A_symbol_271;
				} catch (InvalidValueException e) {
					leftA_symbol_269 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_271 = leftA_symbol_269;
				Value rightA_symbol_269;
				try {
					
					Value A_symbol_272 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_273 = valueFactory.typeOf(A_symbol_272, S_select);
					LibraryBinaryOperation dynamic_A_symbol_273 = (LibraryBinaryOperation)static_A_symbol_273.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_273 = dynamic_A_symbol_273.evaluate(evaluator, T_Boolean, A_symbol_272, S_select);
					rightA_symbol_269 = A_symbol_273;
				} catch (InvalidValueException e) {
					rightA_symbol_269 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_273 = rightA_symbol_269;
				DomainType static_A_symbol_269 = valueFactory.typeOf(A_symbol_271);
				LibraryBinaryOperation dynamic_A_symbol_269 = (LibraryBinaryOperation)static_A_symbol_269.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_269 = dynamic_A_symbol_269.evaluate(evaluator, T_Boolean, A_symbol_271, A_symbol_273);
				leftA_symbol_268 = A_symbol_269;
			} catch (InvalidValueException e) {
				leftA_symbol_268 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_269 = leftA_symbol_268;
			Value rightA_symbol_268;
			try {
				
				Value A_symbol_274 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_275 = valueFactory.typeOf(A_symbol_274, T_ClassClassifier_Boolean_);
				LibraryBinaryOperation dynamic_A_symbol_275 = (LibraryBinaryOperation)static_A_symbol_275.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_275 = dynamic_A_symbol_275.evaluate(evaluator, T_Boolean, A_symbol_274, T_ClassClassifier_Boolean_);
				rightA_symbol_268 = A_symbol_275;
			} catch (InvalidValueException e) {
				rightA_symbol_268 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_275 = rightA_symbol_268;
			DomainType static_A_symbol_268 = valueFactory.typeOf(A_symbol_269);
			LibraryBinaryOperation dynamic_A_symbol_268 = (LibraryBinaryOperation)static_A_symbol_268.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_268 = dynamic_A_symbol_268.evaluate(evaluator, T_Boolean, A_symbol_269, A_symbol_275);
			return A_symbol_268;
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
			
			Value leftA_symbol_276;
			try {
				Value leftA_symbol_277;
				try {
					
					Value A_symbol_278 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_279 = valueFactory.typeOf(A_symbol_278, S_reject);
					LibraryBinaryOperation dynamic_A_symbol_279 = (LibraryBinaryOperation)static_A_symbol_279.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_279 = dynamic_A_symbol_279.evaluate(evaluator, T_Boolean, A_symbol_278, S_reject);
					leftA_symbol_277 = A_symbol_279;
				} catch (InvalidValueException e) {
					leftA_symbol_277 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_279 = leftA_symbol_277;
				Value rightA_symbol_277;
				try {
					
					Value A_symbol_280 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
					
					DomainType static_A_symbol_281 = valueFactory.typeOf(A_symbol_280, S_select);
					LibraryBinaryOperation dynamic_A_symbol_281 = (LibraryBinaryOperation)static_A_symbol_281.lookupImplementation(standardLibrary, O_String__eq_);
					Value A_symbol_281 = dynamic_A_symbol_281.evaluate(evaluator, T_Boolean, A_symbol_280, S_select);
					rightA_symbol_277 = A_symbol_281;
				} catch (InvalidValueException e) {
					rightA_symbol_277 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_281 = rightA_symbol_277;
				DomainType static_A_symbol_277 = valueFactory.typeOf(A_symbol_279);
				LibraryBinaryOperation dynamic_A_symbol_277 = (LibraryBinaryOperation)static_A_symbol_277.lookupImplementation(standardLibrary, O_Boolean_or);
				Value A_symbol_277 = dynamic_A_symbol_277.evaluate(evaluator, T_Boolean, A_symbol_279, A_symbol_281);
				leftA_symbol_276 = A_symbol_277;
			} catch (InvalidValueException e) {
				leftA_symbol_276 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_277 = leftA_symbol_276;
			Value rightA_symbol_276;
			try {
				
				Value A_symbol_282 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				
				Value A_symbol_283 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
				
				Value A_symbol_284 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_283, P_TypedElement_type);
				
				DomainType static_A_symbol_285 = valueFactory.typeOf(A_symbol_282, A_symbol_284);
				LibraryBinaryOperation dynamic_A_symbol_285 = (LibraryBinaryOperation)static_A_symbol_285.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_285 = dynamic_A_symbol_285.evaluate(evaluator, T_Boolean, A_symbol_282, A_symbol_284);
				rightA_symbol_276 = A_symbol_285;
			} catch (InvalidValueException e) {
				rightA_symbol_276 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_285 = rightA_symbol_276;
			DomainType static_A_symbol_276 = valueFactory.typeOf(A_symbol_277);
			LibraryBinaryOperation dynamic_A_symbol_276 = (LibraryBinaryOperation)static_A_symbol_276.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_276 = dynamic_A_symbol_276.evaluate(evaluator, T_Boolean, A_symbol_277, A_symbol_285);
			return A_symbol_276;
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
			
			Value leftA_symbol_286;
			try {
				
				Value A_symbol_287 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_288 = valueFactory.typeOf(A_symbol_287, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_288 = (LibraryBinaryOperation)static_A_symbol_288.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_288 = dynamic_A_symbol_288.evaluate(evaluator, T_Boolean, A_symbol_287, S_sortedBy);
				leftA_symbol_286 = A_symbol_288;
			} catch (InvalidValueException e) {
				leftA_symbol_286 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_288 = leftA_symbol_286;
			Value rightA_symbol_286;
			try {
				
				Value A_symbol_289 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_290 = valueFactory.typeOf(A_symbol_289);
				LibraryBinaryOperation dynamic_A_symbol_290 = (LibraryBinaryOperation)static_A_symbol_290.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_290 = dynamic_A_symbol_290.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_289, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_291 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_290, P_CollectionType_elementType);
				
				
				Value A_symbol_292 = IP_LoopExp_body.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_LoopExp_body);
				
				Value A_symbol_293 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_292, P_TypedElement_type);
				
				DomainType static_A_symbol_294 = valueFactory.typeOf(A_symbol_293);
				LibraryBinaryOperation dynamic_A_symbol_294 = (LibraryBinaryOperation)static_A_symbol_294.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_294 = dynamic_A_symbol_294.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, A_symbol_293, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				Value A_symbol_295 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_294, P_CollectionType_elementType);
				
				DomainType static_A_symbol_296 = valueFactory.typeOf(A_symbol_291, A_symbol_295);
				LibraryBinaryOperation dynamic_A_symbol_296 = (LibraryBinaryOperation)static_A_symbol_296.lookupImplementation(standardLibrary, O_OclAny__eq_);
				Value A_symbol_296 = dynamic_A_symbol_296.evaluate(evaluator, T_Boolean, A_symbol_291, A_symbol_295);
				rightA_symbol_286 = A_symbol_296;
			} catch (InvalidValueException e) {
				rightA_symbol_286 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_296 = rightA_symbol_286;
			DomainType static_A_symbol_286 = valueFactory.typeOf(A_symbol_288);
			LibraryBinaryOperation dynamic_A_symbol_286 = (LibraryBinaryOperation)static_A_symbol_286.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_286 = dynamic_A_symbol_286.evaluate(evaluator, T_Boolean, A_symbol_288, A_symbol_296);
			return A_symbol_286;
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
			
			Value leftA_symbol_297;
			try {
				
				Value A_symbol_298 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_299 = valueFactory.typeOf(A_symbol_298, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_299 = (LibraryBinaryOperation)static_A_symbol_299.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_299 = dynamic_A_symbol_299.evaluate(evaluator, T_Boolean, A_symbol_298, S_sortedBy);
				leftA_symbol_297 = A_symbol_299;
			} catch (InvalidValueException e) {
				leftA_symbol_297 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_299 = leftA_symbol_297;
			Value rightA_symbol_297;
			try {
				
				Value A_symbol_300 = IP_LoopExp_iterator.evaluate(evaluator, T_OrderedSet_Pivot_ecore__pivot__Variable_, self, P_LoopExp_iterator);
				
				DomainType static_A_symbol_301 = valueFactory.typeOf(A_symbol_300);
				LibraryUnaryOperation dynamic_A_symbol_301 = (LibraryUnaryOperation)static_A_symbol_301.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_301 = dynamic_A_symbol_301.evaluate(evaluator, T_Integer, A_symbol_300);
				DomainType static_A_symbol_302 = valueFactory.typeOf(A_symbol_301, I_1);
				LibraryBinaryOperation dynamic_A_symbol_302 = (LibraryBinaryOperation)static_A_symbol_302.lookupImplementation(standardLibrary, O_Real__eq_);
				Value A_symbol_302 = dynamic_A_symbol_302.evaluate(evaluator, T_Boolean, A_symbol_301, I_1);
				rightA_symbol_297 = A_symbol_302;
			} catch (InvalidValueException e) {
				rightA_symbol_297 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_302 = rightA_symbol_297;
			DomainType static_A_symbol_297 = valueFactory.typeOf(A_symbol_299);
			LibraryBinaryOperation dynamic_A_symbol_297 = (LibraryBinaryOperation)static_A_symbol_297.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_297 = dynamic_A_symbol_297.evaluate(evaluator, T_Boolean, A_symbol_299, A_symbol_302);
			return A_symbol_297;
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
			
			Value leftA_symbol_303;
			try {
				
				Value A_symbol_304 = IP_NamedElement_name.evaluate(evaluator, T_String, self, P_NamedElement_name);
				
				DomainType static_A_symbol_305 = valueFactory.typeOf(A_symbol_304, S_sortedBy);
				LibraryBinaryOperation dynamic_A_symbol_305 = (LibraryBinaryOperation)static_A_symbol_305.lookupImplementation(standardLibrary, O_String__eq_);
				Value A_symbol_305 = dynamic_A_symbol_305.evaluate(evaluator, T_Boolean, A_symbol_304, S_sortedBy);
				leftA_symbol_303 = A_symbol_305;
			} catch (InvalidValueException e) {
				leftA_symbol_303 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_305 = leftA_symbol_303;
			Value rightA_symbol_303;
			try {
					Value leftA_symbol_306;
					try {
						
						Value A_symbol_307 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_308 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_307, P_TypedElement_type);
						
						DomainType static_A_symbol_309 = valueFactory.typeOf(A_symbol_308);
						LibraryBinaryOperation dynamic_A_symbol_309 = (LibraryBinaryOperation)static_A_symbol_309.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_309 = dynamic_A_symbol_309.evaluate(evaluator, T_Boolean, A_symbol_308, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
						leftA_symbol_306 = A_symbol_309;
					} catch (InvalidValueException e) {
						leftA_symbol_306 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_309 = leftA_symbol_306;
					Value rightA_symbol_306;
					try {
						
						Value A_symbol_310 = IP_CallExp_source.evaluate(evaluator, T_Pivot_ecore__pivot__OclExpression, self, P_CallExp_source);
						
						Value A_symbol_311 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, A_symbol_310, P_TypedElement_type);
						
						DomainType static_A_symbol_312 = valueFactory.typeOf(A_symbol_311);
						LibraryBinaryOperation dynamic_A_symbol_312 = (LibraryBinaryOperation)static_A_symbol_312.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
						Value A_symbol_312 = dynamic_A_symbol_312.evaluate(evaluator, T_Boolean, A_symbol_311, T_ClassClassifier_Pivot_ecore__pivot__BagType_);
						rightA_symbol_306 = A_symbol_312;
					} catch (InvalidValueException e) {
						rightA_symbol_306 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_312 = rightA_symbol_306;
					DomainType static_A_symbol_306 = valueFactory.typeOf(A_symbol_309);
					LibraryBinaryOperation dynamic_A_symbol_306 = (LibraryBinaryOperation)static_A_symbol_306.lookupImplementation(standardLibrary, O_Boolean_or);
					Value A_symbol_306 = dynamic_A_symbol_306.evaluate(evaluator, T_Boolean, A_symbol_309, A_symbol_312);
				Value A_symbol_313;
				if (A_symbol_306.isTrue()) {
					
					Value A_symbol_314 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_315 = valueFactory.typeOf(A_symbol_314);
					LibraryBinaryOperation dynamic_A_symbol_315 = (LibraryBinaryOperation)static_A_symbol_315.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_315 = dynamic_A_symbol_315.evaluate(evaluator, T_Boolean, A_symbol_314, T_ClassClassifier_Pivot_ecore__pivot__SequenceType_);
					A_symbol_313 = A_symbol_315;
				}
				else if (A_symbol_306.isFalse()) {
					
					Value A_symbol_316 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
					
					DomainType static_A_symbol_317 = valueFactory.typeOf(A_symbol_316);
					LibraryBinaryOperation dynamic_A_symbol_317 = (LibraryBinaryOperation)static_A_symbol_317.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
					Value A_symbol_317 = dynamic_A_symbol_317.evaluate(evaluator, T_Boolean, A_symbol_316, T_ClassClassifier_Pivot_ecore__pivot__OrderedSetType_);
					A_symbol_313 = A_symbol_317;
				}
				else if (A_symbol_306.isNull()) {
					A_symbol_313 = valueFactory.throwInvalidValueException("null if condition");
				}
				else {
					A_symbol_313 = valueFactory.throwInvalidValueException("invalid if condition");
				}
				rightA_symbol_303 = A_symbol_313;
			} catch (InvalidValueException e) {
				rightA_symbol_303 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_313 = rightA_symbol_303;
			DomainType static_A_symbol_303 = valueFactory.typeOf(A_symbol_305);
			LibraryBinaryOperation dynamic_A_symbol_303 = (LibraryBinaryOperation)static_A_symbol_303.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_303 = dynamic_A_symbol_303.evaluate(evaluator, T_Boolean, A_symbol_305, A_symbol_313);
			return A_symbol_303;
		}
	}
}

