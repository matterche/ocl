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
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.StringValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * TypedMultiplicityElementBodies provides the Java implementation bodies of OCL-defined TypedMultiplicityElement operations and properties.
 */
@SuppressWarnings("nls")
public class TypedMultiplicityElementBodies
{

	/** 
	 * Implementation of the TypedMultiplicityElement::CompatibleBody '' <body>.
	 */
	public static class _CompatibleBody_body_ extends AbstractBinaryOperation
	{
		public static _CompatibleBody_body_ INSTANCE = new _CompatibleBody_body_();
	
		/*
		let bodyType : Type = bodySpecification.type
	in
	  if bodyType.oclIsKindOf(CollectionType)
	  then
	    let
	      bodyCollectionType : CollectionType = bodyType.oclAsType(CollectionType)
	    in
	      let bodyElementType : Type = bodyCollectionType.elementType
	      in
	        bodyElementType.conformsTo(self.type) and self.isOrdered =
	        (
	          bodyCollectionType.conformsTo(OrderedSet(OclAny)) or
	          bodyCollectionType.conformsTo(Sequence(OclAny))
	        ) and self.isUnique =
	        (
	          bodyCollectionType.conformsTo(OrderedSet(OclAny)) or
	          bodyCollectionType.conformsTo(Set(OclAny))
	        )
	  else bodyType.conformsTo(self.type)
	  endif
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self, final Value bodySpecification) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_OclAny_oclIsKindOf = OCLstdlibTables.Operations._OclAny__oclIsKindOf;
			final Value T_ClassClassifier_Pivot_ecore__pivot__CollectionType_ = valueFactory.createTypeValue(PivotTables.Types._CollectionType);
			final ExecutorOperation O_Boolean_and = OCLstdlibTables.Operations._Boolean__and;
			final ExecutorOperation O_OclType_conformsTo = OCLstdlibTables.Operations._OclType__conformsTo;
			final ExecutorType T_Pivot_ecore__pivot__Type = PivotTables.Types._Type;
			final ExecutorProperty P_TypedElement_type = PivotTables.Properties._TypedElement__type;
			final LibraryProperty IP_TypedElement_type = P_TypedElement_type.getImplementation();
			final ExecutorOperation O_Boolean__eq_ = OCLstdlibTables.Operations._Boolean___eq_;
			final ExecutorProperty P_MultiplicityElement_isOrdered = PivotTables.Properties._MultiplicityElement__isOrdered;
			final LibraryProperty IP_MultiplicityElement_isOrdered = P_MultiplicityElement_isOrdered.getImplementation();
			final ExecutorOperation O_Boolean_or = OCLstdlibTables.Operations._Boolean__or;
			final Value T_CollectionClassifier_OrderedSet_OclAny__OclAny_ = valueFactory.createTypeValue(OCLstdlibTables.Types._OrderedSet);
			final Value T_CollectionClassifier_Sequence_OclAny__OclAny_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Sequence);
			final ExecutorProperty P_MultiplicityElement_isUnique = PivotTables.Properties._MultiplicityElement__isUnique;
			final LibraryProperty IP_MultiplicityElement_isUnique = P_MultiplicityElement_isUnique.getImplementation();
			final Value T_CollectionClassifier_Set_OclAny__OclAny_ = valueFactory.createTypeValue(OCLstdlibTables.Types._Set);
			final ExecutorProperty P_CollectionType_elementType = PivotTables.Properties._CollectionType__elementType;
			final LibraryProperty IP_CollectionType_elementType = P_CollectionType_elementType.getImplementation();
			final ExecutorType T_Pivot_ecore__pivot__CollectionType = PivotTables.Types._CollectionType;
			final ExecutorOperation O_OclAny_oclAsType = OCLstdlibTables.Operations._OclAny__oclAsType;
			
			
			Value A_symbol_95 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, bodySpecification, P_TypedElement_type);
			
			final Value V_bodyType = A_symbol_95;
				
				DomainType static_A_symbol_96 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_96 = (LibraryBinaryOperation)static_A_symbol_96.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_96 = dynamic_A_symbol_96.evaluate(evaluator, T_Boolean, V_bodyType, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
			Value A_symbol_97;
			if (A_symbol_96.isTrue()) {
				
				DomainType static_A_symbol_98 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_98 = (LibraryBinaryOperation)static_A_symbol_98.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_98 = dynamic_A_symbol_98.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, V_bodyType, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				final Value V_bodyCollectionType = A_symbol_98;
				
				Value A_symbol_99 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_bodyCollectionType, P_CollectionType_elementType);
				
				final Value V_bodyElementType = A_symbol_99;
				Value leftA_symbol_100;
				try {
					Value leftA_symbol_101;
					try {
						
						
						Value A_symbol_102 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
						
						DomainType static_A_symbol_103 = valueFactory.typeOf(V_bodyElementType);
						LibraryBinaryOperation dynamic_A_symbol_103 = (LibraryBinaryOperation)static_A_symbol_103.lookupImplementation(standardLibrary, O_OclType_conformsTo);
						Value A_symbol_103 = dynamic_A_symbol_103.evaluate(evaluator, T_Boolean, V_bodyElementType, A_symbol_102);
						leftA_symbol_101 = A_symbol_103;
					} catch (InvalidValueException e) {
						leftA_symbol_101 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_103 = leftA_symbol_101;
					Value rightA_symbol_101;
					try {
						Value leftA_symbol_104;
						try {
							
							Value A_symbol_105 = IP_MultiplicityElement_isOrdered.evaluate(evaluator, T_Boolean, self, P_MultiplicityElement_isOrdered);
							
							leftA_symbol_104 = A_symbol_105;
						} catch (InvalidValueException e) {
							leftA_symbol_104 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_105 = leftA_symbol_104;
						Value rightA_symbol_104;
						try {
							Value leftA_symbol_106;
							try {
								
								DomainType static_A_symbol_107 = valueFactory.typeOf(V_bodyCollectionType);
								LibraryBinaryOperation dynamic_A_symbol_107 = (LibraryBinaryOperation)static_A_symbol_107.lookupImplementation(standardLibrary, O_OclType_conformsTo);
								Value A_symbol_107 = dynamic_A_symbol_107.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_OrderedSet_OclAny__OclAny_);
								leftA_symbol_106 = A_symbol_107;
							} catch (InvalidValueException e) {
								leftA_symbol_106 = valueFactory.createInvalidValue(e);
							}
							Value A_symbol_107 = leftA_symbol_106;
							Value rightA_symbol_106;
							try {
								
								DomainType static_A_symbol_108 = valueFactory.typeOf(V_bodyCollectionType);
								LibraryBinaryOperation dynamic_A_symbol_108 = (LibraryBinaryOperation)static_A_symbol_108.lookupImplementation(standardLibrary, O_OclType_conformsTo);
								Value A_symbol_108 = dynamic_A_symbol_108.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_Sequence_OclAny__OclAny_);
								rightA_symbol_106 = A_symbol_108;
							} catch (InvalidValueException e) {
								rightA_symbol_106 = valueFactory.createInvalidValue(e);
							}
							Value A_symbol_108 = rightA_symbol_106;
							DomainType static_A_symbol_106 = valueFactory.typeOf(A_symbol_107);
							LibraryBinaryOperation dynamic_A_symbol_106 = (LibraryBinaryOperation)static_A_symbol_106.lookupImplementation(standardLibrary, O_Boolean_or);
							Value A_symbol_106 = dynamic_A_symbol_106.evaluate(evaluator, T_Boolean, A_symbol_107, A_symbol_108);
							rightA_symbol_104 = A_symbol_106;
						} catch (InvalidValueException e) {
							rightA_symbol_104 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_106 = rightA_symbol_104;
						DomainType static_A_symbol_104 = valueFactory.typeOf(A_symbol_105, A_symbol_106);
						LibraryBinaryOperation dynamic_A_symbol_104 = (LibraryBinaryOperation)static_A_symbol_104.lookupImplementation(standardLibrary, O_Boolean__eq_);
						Value A_symbol_104 = dynamic_A_symbol_104.evaluate(evaluator, T_Boolean, A_symbol_105, A_symbol_106);
						rightA_symbol_101 = A_symbol_104;
					} catch (InvalidValueException e) {
						rightA_symbol_101 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_104 = rightA_symbol_101;
					DomainType static_A_symbol_101 = valueFactory.typeOf(A_symbol_103);
					LibraryBinaryOperation dynamic_A_symbol_101 = (LibraryBinaryOperation)static_A_symbol_101.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_101 = dynamic_A_symbol_101.evaluate(evaluator, T_Boolean, A_symbol_103, A_symbol_104);
					leftA_symbol_100 = A_symbol_101;
				} catch (InvalidValueException e) {
					leftA_symbol_100 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_101 = leftA_symbol_100;
				Value rightA_symbol_100;
				try {
					Value leftA_symbol_109;
					try {
						
						Value A_symbol_110 = IP_MultiplicityElement_isUnique.evaluate(evaluator, T_Boolean, self, P_MultiplicityElement_isUnique);
						
						leftA_symbol_109 = A_symbol_110;
					} catch (InvalidValueException e) {
						leftA_symbol_109 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_110 = leftA_symbol_109;
					Value rightA_symbol_109;
					try {
						Value leftA_symbol_111;
						try {
							
							DomainType static_A_symbol_112 = valueFactory.typeOf(V_bodyCollectionType);
							LibraryBinaryOperation dynamic_A_symbol_112 = (LibraryBinaryOperation)static_A_symbol_112.lookupImplementation(standardLibrary, O_OclType_conformsTo);
							Value A_symbol_112 = dynamic_A_symbol_112.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_OrderedSet_OclAny__OclAny_);
							leftA_symbol_111 = A_symbol_112;
						} catch (InvalidValueException e) {
							leftA_symbol_111 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_112 = leftA_symbol_111;
						Value rightA_symbol_111;
						try {
							
							DomainType static_A_symbol_113 = valueFactory.typeOf(V_bodyCollectionType);
							LibraryBinaryOperation dynamic_A_symbol_113 = (LibraryBinaryOperation)static_A_symbol_113.lookupImplementation(standardLibrary, O_OclType_conformsTo);
							Value A_symbol_113 = dynamic_A_symbol_113.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_Set_OclAny__OclAny_);
							rightA_symbol_111 = A_symbol_113;
						} catch (InvalidValueException e) {
							rightA_symbol_111 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_113 = rightA_symbol_111;
						DomainType static_A_symbol_111 = valueFactory.typeOf(A_symbol_112);
						LibraryBinaryOperation dynamic_A_symbol_111 = (LibraryBinaryOperation)static_A_symbol_111.lookupImplementation(standardLibrary, O_Boolean_or);
						Value A_symbol_111 = dynamic_A_symbol_111.evaluate(evaluator, T_Boolean, A_symbol_112, A_symbol_113);
						rightA_symbol_109 = A_symbol_111;
					} catch (InvalidValueException e) {
						rightA_symbol_109 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_111 = rightA_symbol_109;
					DomainType static_A_symbol_109 = valueFactory.typeOf(A_symbol_110, A_symbol_111);
					LibraryBinaryOperation dynamic_A_symbol_109 = (LibraryBinaryOperation)static_A_symbol_109.lookupImplementation(standardLibrary, O_Boolean__eq_);
					Value A_symbol_109 = dynamic_A_symbol_109.evaluate(evaluator, T_Boolean, A_symbol_110, A_symbol_111);
					rightA_symbol_100 = A_symbol_109;
				} catch (InvalidValueException e) {
					rightA_symbol_100 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_109 = rightA_symbol_100;
				DomainType static_A_symbol_100 = valueFactory.typeOf(A_symbol_101);
				LibraryBinaryOperation dynamic_A_symbol_100 = (LibraryBinaryOperation)static_A_symbol_100.lookupImplementation(standardLibrary, O_Boolean_and);
				Value A_symbol_100 = dynamic_A_symbol_100.evaluate(evaluator, T_Boolean, A_symbol_101, A_symbol_109);
				final Value A_symbol_114 = A_symbol_100;
				final Value A_symbol_115 = A_symbol_114;
				A_symbol_97 = A_symbol_115;
			}
			else if (A_symbol_96.isFalse()) {
				
				
				Value A_symbol_116 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_117 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_117 = (LibraryBinaryOperation)static_A_symbol_117.lookupImplementation(standardLibrary, O_OclType_conformsTo);
				Value A_symbol_117 = dynamic_A_symbol_117.evaluate(evaluator, T_Boolean, V_bodyType, A_symbol_116);
				A_symbol_97 = A_symbol_117;
			}
			else if (A_symbol_96.isNull()) {
				A_symbol_97 = valueFactory.throwInvalidValueException("null if condition");
			}
			else {
				A_symbol_97 = valueFactory.throwInvalidValueException("invalid if condition");
			}
			final Value A_symbol_118 = A_symbol_97;
			return A_symbol_118;
		}
	}

	/** 
	 * Implementation of the TypedMultiplicityElement::makeParameter '' <body>.
	 */
	public static class _makeParameter_body_ extends AbstractUnaryOperation
	{
		public static _makeParameter_body_ INSTANCE = new _makeParameter_body_();
	
		/*
		Parameter{name = 'name'}
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final StringValue S_name = valueFactory.stringValueOf("name");
			
			ObjectValue A_symbol_119 = PivotTables.Types._Parameter.createInstance(valueFactory);
			
			P_NamedElement_name.setValue(A_symbol_119, S_name);
			
			return A_symbol_119;
		}
	}
}

