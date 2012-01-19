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
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self, Value bodySpecification) throws InvalidValueException {
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
			
			
			Value A_symbol_73 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, bodySpecification, P_TypedElement_type);
			
			final Value V_bodyType = A_symbol_73;
				
				DomainType static_A_symbol_74 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_74 = (LibraryBinaryOperation)static_A_symbol_74.lookupImplementation(standardLibrary, O_OclAny_oclIsKindOf);
				Value A_symbol_74 = dynamic_A_symbol_74.evaluate(evaluator, T_Boolean, V_bodyType, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
			Value A_symbol_75;
			if (A_symbol_74.isTrue()) {
				
				DomainType static_A_symbol_76 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_76 = (LibraryBinaryOperation)static_A_symbol_76.lookupImplementation(standardLibrary, O_OclAny_oclAsType);
				Value A_symbol_76 = dynamic_A_symbol_76.evaluate(evaluator, T_Pivot_ecore__pivot__CollectionType, V_bodyType, T_ClassClassifier_Pivot_ecore__pivot__CollectionType_);
				final Value V_bodyCollectionType = A_symbol_76;
				
				Value A_symbol_77 = IP_CollectionType_elementType.evaluate(evaluator, T_Pivot_ecore__pivot__Type, V_bodyCollectionType, P_CollectionType_elementType);
				
				final Value V_bodyElementType = A_symbol_77;
				Value leftA_symbol_78;
				try {
					Value leftA_symbol_79;
					try {
						
						
						Value A_symbol_80 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
						
						DomainType static_A_symbol_81 = valueFactory.typeOf(V_bodyElementType);
						LibraryBinaryOperation dynamic_A_symbol_81 = (LibraryBinaryOperation)static_A_symbol_81.lookupImplementation(standardLibrary, O_OclType_conformsTo);
						Value A_symbol_81 = dynamic_A_symbol_81.evaluate(evaluator, T_Boolean, V_bodyElementType, A_symbol_80);
						leftA_symbol_79 = A_symbol_81;
					} catch (InvalidValueException e) {
						leftA_symbol_79 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_81 = leftA_symbol_79;
					Value rightA_symbol_79;
					try {
						Value leftA_symbol_82;
						try {
							
							Value A_symbol_83 = IP_MultiplicityElement_isOrdered.evaluate(evaluator, T_Boolean, self, P_MultiplicityElement_isOrdered);
							
							leftA_symbol_82 = A_symbol_83;
						} catch (InvalidValueException e) {
							leftA_symbol_82 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_83 = leftA_symbol_82;
						Value rightA_symbol_82;
						try {
							Value leftA_symbol_84;
							try {
								
								DomainType static_A_symbol_85 = valueFactory.typeOf(V_bodyCollectionType);
								LibraryBinaryOperation dynamic_A_symbol_85 = (LibraryBinaryOperation)static_A_symbol_85.lookupImplementation(standardLibrary, O_OclType_conformsTo);
								Value A_symbol_85 = dynamic_A_symbol_85.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_OrderedSet_OclAny__OclAny_);
								leftA_symbol_84 = A_symbol_85;
							} catch (InvalidValueException e) {
								leftA_symbol_84 = valueFactory.createInvalidValue(e);
							}
							Value A_symbol_85 = leftA_symbol_84;
							Value rightA_symbol_84;
							try {
								
								DomainType static_A_symbol_86 = valueFactory.typeOf(V_bodyCollectionType);
								LibraryBinaryOperation dynamic_A_symbol_86 = (LibraryBinaryOperation)static_A_symbol_86.lookupImplementation(standardLibrary, O_OclType_conformsTo);
								Value A_symbol_86 = dynamic_A_symbol_86.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_Sequence_OclAny__OclAny_);
								rightA_symbol_84 = A_symbol_86;
							} catch (InvalidValueException e) {
								rightA_symbol_84 = valueFactory.createInvalidValue(e);
							}
							Value A_symbol_86 = rightA_symbol_84;
							DomainType static_A_symbol_84 = valueFactory.typeOf(A_symbol_85);
							LibraryBinaryOperation dynamic_A_symbol_84 = (LibraryBinaryOperation)static_A_symbol_84.lookupImplementation(standardLibrary, O_Boolean_or);
							Value A_symbol_84 = dynamic_A_symbol_84.evaluate(evaluator, T_Boolean, A_symbol_85, A_symbol_86);
							rightA_symbol_82 = A_symbol_84;
						} catch (InvalidValueException e) {
							rightA_symbol_82 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_84 = rightA_symbol_82;
						DomainType static_A_symbol_82 = valueFactory.typeOf(A_symbol_83, A_symbol_84);
						LibraryBinaryOperation dynamic_A_symbol_82 = (LibraryBinaryOperation)static_A_symbol_82.lookupImplementation(standardLibrary, O_Boolean__eq_);
						Value A_symbol_82 = dynamic_A_symbol_82.evaluate(evaluator, T_Boolean, A_symbol_83, A_symbol_84);
						rightA_symbol_79 = A_symbol_82;
					} catch (InvalidValueException e) {
						rightA_symbol_79 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_82 = rightA_symbol_79;
					DomainType static_A_symbol_79 = valueFactory.typeOf(A_symbol_81);
					LibraryBinaryOperation dynamic_A_symbol_79 = (LibraryBinaryOperation)static_A_symbol_79.lookupImplementation(standardLibrary, O_Boolean_and);
					Value A_symbol_79 = dynamic_A_symbol_79.evaluate(evaluator, T_Boolean, A_symbol_81, A_symbol_82);
					leftA_symbol_78 = A_symbol_79;
				} catch (InvalidValueException e) {
					leftA_symbol_78 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_79 = leftA_symbol_78;
				Value rightA_symbol_78;
				try {
					Value leftA_symbol_87;
					try {
						
						Value A_symbol_88 = IP_MultiplicityElement_isUnique.evaluate(evaluator, T_Boolean, self, P_MultiplicityElement_isUnique);
						
						leftA_symbol_87 = A_symbol_88;
					} catch (InvalidValueException e) {
						leftA_symbol_87 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_88 = leftA_symbol_87;
					Value rightA_symbol_87;
					try {
						Value leftA_symbol_89;
						try {
							
							DomainType static_A_symbol_90 = valueFactory.typeOf(V_bodyCollectionType);
							LibraryBinaryOperation dynamic_A_symbol_90 = (LibraryBinaryOperation)static_A_symbol_90.lookupImplementation(standardLibrary, O_OclType_conformsTo);
							Value A_symbol_90 = dynamic_A_symbol_90.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_OrderedSet_OclAny__OclAny_);
							leftA_symbol_89 = A_symbol_90;
						} catch (InvalidValueException e) {
							leftA_symbol_89 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_90 = leftA_symbol_89;
						Value rightA_symbol_89;
						try {
							
							DomainType static_A_symbol_91 = valueFactory.typeOf(V_bodyCollectionType);
							LibraryBinaryOperation dynamic_A_symbol_91 = (LibraryBinaryOperation)static_A_symbol_91.lookupImplementation(standardLibrary, O_OclType_conformsTo);
							Value A_symbol_91 = dynamic_A_symbol_91.evaluate(evaluator, T_Boolean, V_bodyCollectionType, T_CollectionClassifier_Set_OclAny__OclAny_);
							rightA_symbol_89 = A_symbol_91;
						} catch (InvalidValueException e) {
							rightA_symbol_89 = valueFactory.createInvalidValue(e);
						}
						Value A_symbol_91 = rightA_symbol_89;
						DomainType static_A_symbol_89 = valueFactory.typeOf(A_symbol_90);
						LibraryBinaryOperation dynamic_A_symbol_89 = (LibraryBinaryOperation)static_A_symbol_89.lookupImplementation(standardLibrary, O_Boolean_or);
						Value A_symbol_89 = dynamic_A_symbol_89.evaluate(evaluator, T_Boolean, A_symbol_90, A_symbol_91);
						rightA_symbol_87 = A_symbol_89;
					} catch (InvalidValueException e) {
						rightA_symbol_87 = valueFactory.createInvalidValue(e);
					}
					Value A_symbol_89 = rightA_symbol_87;
					DomainType static_A_symbol_87 = valueFactory.typeOf(A_symbol_88, A_symbol_89);
					LibraryBinaryOperation dynamic_A_symbol_87 = (LibraryBinaryOperation)static_A_symbol_87.lookupImplementation(standardLibrary, O_Boolean__eq_);
					Value A_symbol_87 = dynamic_A_symbol_87.evaluate(evaluator, T_Boolean, A_symbol_88, A_symbol_89);
					rightA_symbol_78 = A_symbol_87;
				} catch (InvalidValueException e) {
					rightA_symbol_78 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_87 = rightA_symbol_78;
				DomainType static_A_symbol_78 = valueFactory.typeOf(A_symbol_79);
				LibraryBinaryOperation dynamic_A_symbol_78 = (LibraryBinaryOperation)static_A_symbol_78.lookupImplementation(standardLibrary, O_Boolean_and);
				Value A_symbol_78 = dynamic_A_symbol_78.evaluate(evaluator, T_Boolean, A_symbol_79, A_symbol_87);
				final Value A_symbol_92 = A_symbol_78;
				final Value A_symbol_93 = A_symbol_92;
				A_symbol_75 = A_symbol_93;
			}
			else if (A_symbol_74.isFalse()) {
				
				
				Value A_symbol_94 = IP_TypedElement_type.evaluate(evaluator, T_Pivot_ecore__pivot__Type, self, P_TypedElement_type);
				
				DomainType static_A_symbol_95 = valueFactory.typeOf(V_bodyType);
				LibraryBinaryOperation dynamic_A_symbol_95 = (LibraryBinaryOperation)static_A_symbol_95.lookupImplementation(standardLibrary, O_OclType_conformsTo);
				Value A_symbol_95 = dynamic_A_symbol_95.evaluate(evaluator, T_Boolean, V_bodyType, A_symbol_94);
				A_symbol_75 = A_symbol_95;
			}
			else if (A_symbol_74.isNull()) {
				A_symbol_75 = valueFactory.throwInvalidValueException("null if condition");
			}
			else {
				A_symbol_75 = valueFactory.throwInvalidValueException("invalid if condition");
			}
			final Value A_symbol_96 = A_symbol_75;
			return A_symbol_96;
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
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ExecutorProperty P_NamedElement_name = PivotTables.Properties._NamedElement__name;
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final StringValue S_name = valueFactory.stringValueOf("name");
			
			ObjectValue A_symbol_97 = PivotTables.Types._Parameter.createInstance(valueFactory);
			
			P_NamedElement_name.setValue(A_symbol_97, S_name);
			
			return A_symbol_97;
		}
	}
}

