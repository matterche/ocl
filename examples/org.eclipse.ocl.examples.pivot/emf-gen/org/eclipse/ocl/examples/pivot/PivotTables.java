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
package org.eclipse.ocl.examples.pivot;

import org.eclipse.ocl.examples.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.examples.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.examples.library.ecore.EcoreLibraryProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorFragment;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorSpecializedType;
import org.eclipse.ocl.examples.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.examples.library.executor.ExecutorTypeParameter;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;

/**
 * PivotTables provides the dispatch tables for the pivot for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class PivotTables
{
	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(PivotPackage.eINSTANCE);

	public static final ExecutorStandardLibrary LIBRARY = new ExecutorStandardLibrary(PACKAGE); 

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
	    public static final EcoreExecutorType _Annotation = new EcoreExecutorType(PivotPackage.Literals.ANNOTATION, PACKAGE, 0);
	    public static final EcoreExecutorType _AnyType = new EcoreExecutorType(PivotPackage.Literals.ANY_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _AssociationClass = new EcoreExecutorType(PivotPackage.Literals.ASSOCIATION_CLASS, PACKAGE, 0);
	    public static final EcoreExecutorType _AssociationClassCallExp = new EcoreExecutorType(PivotPackage.Literals.ASSOCIATION_CLASS_CALL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _AssociativityKind = new EcoreExecutorType("AssociativityKind", PACKAGE, 0);
	    public static final EcoreExecutorType _BagType = new EcoreExecutorType(PivotPackage.Literals.BAG_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _Boolean = OCLstdlibTables.Types._Boolean;
	    public static final EcoreExecutorType _BooleanLiteralExp = new EcoreExecutorType(PivotPackage.Literals.BOOLEAN_LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _CallExp = new EcoreExecutorType(PivotPackage.Literals.CALL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _CallOperationAction = new EcoreExecutorType(PivotPackage.Literals.CALL_OPERATION_ACTION, PACKAGE, 0);
	    public static final EcoreExecutorType _Class = OCLstdlibTables.Types._Class;
	    public static final EcoreExecutorType _ClassifierType = new EcoreExecutorType(PivotPackage.Literals.CLASSIFIER_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _CollectionItem = new EcoreExecutorType(PivotPackage.Literals.COLLECTION_ITEM, PACKAGE, 0);
	    public static final EcoreExecutorType _CollectionKind = new EcoreExecutorType("CollectionKind", PACKAGE, 0);
	    public static final EcoreExecutorType _CollectionLiteralExp = new EcoreExecutorType(PivotPackage.Literals.COLLECTION_LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _CollectionLiteralPart = new EcoreExecutorType(PivotPackage.Literals.COLLECTION_LITERAL_PART, PACKAGE, 0);
	    public static final EcoreExecutorType _CollectionRange = new EcoreExecutorType(PivotPackage.Literals.COLLECTION_RANGE, PACKAGE, 0);
	    public static final EcoreExecutorType _CollectionType = new EcoreExecutorType(PivotPackage.Literals.COLLECTION_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _Comment = new EcoreExecutorType(PivotPackage.Literals.COMMENT, PACKAGE, 0);
	    public static final EcoreExecutorType _Constraint = new EcoreExecutorType(PivotPackage.Literals.CONSTRAINT, PACKAGE, 0);
	    public static final EcoreExecutorType _ConstructorExp = new EcoreExecutorType(PivotPackage.Literals.CONSTRUCTOR_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _ConstructorPart = new EcoreExecutorType(PivotPackage.Literals.CONSTRUCTOR_PART, PACKAGE, 0);
	    public static final EcoreExecutorType _DataType = new EcoreExecutorType(PivotPackage.Literals.DATA_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _Detail = new EcoreExecutorType(PivotPackage.Literals.DETAIL, PACKAGE, 0);
	    public static final EcoreExecutorType _Element = new EcoreExecutorType(PivotPackage.Literals.ELEMENT, PACKAGE, 0);
	    public static final EcoreExecutorType _EnumLiteralExp = new EcoreExecutorType(PivotPackage.Literals.ENUM_LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _Enumeration = OCLstdlibTables.Types._Enumeration;
	    public static final EcoreExecutorType _EnumerationLiteral = OCLstdlibTables.Types._EnumerationLiteral;
	    public static final EcoreExecutorType _ExpressionInOcl = new EcoreExecutorType(PivotPackage.Literals.EXPRESSION_IN_OCL, PACKAGE, 0);
	    public static final EcoreExecutorType _Feature = new EcoreExecutorType(PivotPackage.Literals.FEATURE, PACKAGE, 0);
	    public static final EcoreExecutorType _FeatureCallExp = new EcoreExecutorType(PivotPackage.Literals.FEATURE_CALL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _IfExp = new EcoreExecutorType(PivotPackage.Literals.IF_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _Int = new EcoreExecutorType("Int", PACKAGE, 0);
	    public static final EcoreExecutorType _Integer = OCLstdlibTables.Types._Integer;
	    public static final EcoreExecutorType _IntegerLiteralExp = new EcoreExecutorType(PivotPackage.Literals.INTEGER_LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _InvalidLiteralExp = new EcoreExecutorType(PivotPackage.Literals.INVALID_LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _InvalidType = new EcoreExecutorType(PivotPackage.Literals.INVALID_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _IterateExp = new EcoreExecutorType(PivotPackage.Literals.ITERATE_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _Iteration = new EcoreExecutorType(PivotPackage.Literals.ITERATION, PACKAGE, 0);
	    public static final EcoreExecutorType _IteratorExp = new EcoreExecutorType(PivotPackage.Literals.ITERATOR_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _LambdaType = new EcoreExecutorType(PivotPackage.Literals.LAMBDA_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _LetExp = new EcoreExecutorType(PivotPackage.Literals.LET_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _Library = new EcoreExecutorType(PivotPackage.Literals.LIBRARY, PACKAGE, 0);
	    public static final EcoreExecutorType _LibraryFeature = new EcoreExecutorType("LibraryFeature", PACKAGE, 0);
	    public static final EcoreExecutorType _LiteralExp = new EcoreExecutorType(PivotPackage.Literals.LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _LoopExp = new EcoreExecutorType(PivotPackage.Literals.LOOP_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _MessageExp = new EcoreExecutorType(PivotPackage.Literals.MESSAGE_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _MessageType = new EcoreExecutorType(PivotPackage.Literals.MESSAGE_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _MultiplicityElement = new EcoreExecutorType(PivotPackage.Literals.MULTIPLICITY_ELEMENT, PACKAGE, 0);
	    public static final EcoreExecutorType _Nameable = new EcoreExecutorType(PivotPackage.Literals.NAMEABLE, PACKAGE, 0);
	    public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(PivotPackage.Literals.NAMED_ELEMENT, PACKAGE, 0);
	    public static final EcoreExecutorType _Namespace = new EcoreExecutorType(PivotPackage.Literals.NAMESPACE, PACKAGE, 0);
	    public static final EcoreExecutorType _NavigationCallExp = new EcoreExecutorType(PivotPackage.Literals.NAVIGATION_CALL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _NullLiteralExp = new EcoreExecutorType(PivotPackage.Literals.NULL_LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _NumericLiteralExp = new EcoreExecutorType(PivotPackage.Literals.NUMERIC_LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _Object = new EcoreExecutorType("Object", PACKAGE, 0);
	    public static final EcoreExecutorType _OclExpression = new EcoreExecutorType(PivotPackage.Literals.OCL_EXPRESSION, PACKAGE, 0);
	    public static final EcoreExecutorType _OpaqueExpression = new EcoreExecutorType(PivotPackage.Literals.OPAQUE_EXPRESSION, PACKAGE, 0);
	    public static final EcoreExecutorType _Operation = new EcoreExecutorType(PivotPackage.Literals.OPERATION, PACKAGE, 0);
	    public static final EcoreExecutorType _OperationCallExp = new EcoreExecutorType(PivotPackage.Literals.OPERATION_CALL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _OperationTemplateParameter = new EcoreExecutorType(PivotPackage.Literals.OPERATION_TEMPLATE_PARAMETER, PACKAGE, 0);
	    public static final EcoreExecutorType _OrderedSetType = new EcoreExecutorType(PivotPackage.Literals.ORDERED_SET_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _Package = new EcoreExecutorType(PivotPackage.Literals.PACKAGE, PACKAGE, 0);
	    public static final EcoreExecutorType _PackageableElement = new EcoreExecutorType(PivotPackage.Literals.PACKAGEABLE_ELEMENT, PACKAGE, 0);
	    public static final EcoreExecutorType _Parameter = new EcoreExecutorType(PivotPackage.Literals.PARAMETER, PACKAGE, 0);
	    public static final EcoreExecutorType _ParameterableElement = new EcoreExecutorType(PivotPackage.Literals.PARAMETERABLE_ELEMENT, PACKAGE, 0);
	    public static final EcoreExecutorType _Pivotable = new EcoreExecutorType(PivotPackage.Literals.PIVOTABLE, PACKAGE, 0);
	    public static final EcoreExecutorType _Precedence = new EcoreExecutorType(PivotPackage.Literals.PRECEDENCE, PACKAGE, 0);
	    public static final EcoreExecutorType _PrimitiveLiteralExp = new EcoreExecutorType(PivotPackage.Literals.PRIMITIVE_LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _PrimitiveType = new EcoreExecutorType(PivotPackage.Literals.PRIMITIVE_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _Property = new EcoreExecutorType(PivotPackage.Literals.PROPERTY, PACKAGE, 0);
	    public static final EcoreExecutorType _PropertyCallExp = new EcoreExecutorType(PivotPackage.Literals.PROPERTY_CALL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _Real = OCLstdlibTables.Types._Real;
	    public static final EcoreExecutorType _RealLiteralExp = new EcoreExecutorType(PivotPackage.Literals.REAL_LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _SelfType = new EcoreExecutorType(PivotPackage.Literals.SELF_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _SendSignalAction = new EcoreExecutorType(PivotPackage.Literals.SEND_SIGNAL_ACTION, PACKAGE, 0);
	    public static final EcoreExecutorType _SequenceType = new EcoreExecutorType(PivotPackage.Literals.SEQUENCE_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _SetType = new EcoreExecutorType(PivotPackage.Literals.SET_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _Signal = new EcoreExecutorType(PivotPackage.Literals.SIGNAL, PACKAGE, 0);
	    public static final EcoreExecutorType _State = new EcoreExecutorType(PivotPackage.Literals.STATE, PACKAGE, 0);
	    public static final EcoreExecutorType _StateExp = new EcoreExecutorType(PivotPackage.Literals.STATE_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _String = OCLstdlibTables.Types._String;
	    public static final EcoreExecutorType _StringLiteralExp = new EcoreExecutorType(PivotPackage.Literals.STRING_LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _TemplateBinding = new EcoreExecutorType(PivotPackage.Literals.TEMPLATE_BINDING, PACKAGE, 0);
	    public static final EcoreExecutorType _TemplateParameter = new EcoreExecutorType(PivotPackage.Literals.TEMPLATE_PARAMETER, PACKAGE, 0);
	    public static final EcoreExecutorType _TemplateParameterSubstitution = new EcoreExecutorType(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION, PACKAGE, 0);
	    public static final EcoreExecutorType _TemplateParameterType = new EcoreExecutorType(PivotPackage.Literals.TEMPLATE_PARAMETER_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _TemplateSignature = new EcoreExecutorType(PivotPackage.Literals.TEMPLATE_SIGNATURE, PACKAGE, 0);
	    public static final EcoreExecutorType _TemplateableElement = new EcoreExecutorType(PivotPackage.Literals.TEMPLATEABLE_ELEMENT, PACKAGE, 0);
	    public static final EcoreExecutorType _Throwable = new EcoreExecutorType("Throwable", PACKAGE, 0);
	    public static final EcoreExecutorType _TupleLiteralExp = new EcoreExecutorType(PivotPackage.Literals.TUPLE_LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _TupleLiteralPart = new EcoreExecutorType(PivotPackage.Literals.TUPLE_LITERAL_PART, PACKAGE, 0);
	    public static final EcoreExecutorType _TupleType = new EcoreExecutorType(PivotPackage.Literals.TUPLE_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _Type = OCLstdlibTables.Types._Type;
	    public static final EcoreExecutorType _TypeExp = new EcoreExecutorType(PivotPackage.Literals.TYPE_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _TypeTemplateParameter = new EcoreExecutorType(PivotPackage.Literals.TYPE_TEMPLATE_PARAMETER, PACKAGE, 0);
	    public static final EcoreExecutorType _TypedElement = new EcoreExecutorType(PivotPackage.Literals.TYPED_ELEMENT, PACKAGE, 0);
	    public static final EcoreExecutorType _TypedMultiplicityElement = new EcoreExecutorType(PivotPackage.Literals.TYPED_MULTIPLICITY_ELEMENT, PACKAGE, 0);
	    public static final EcoreExecutorType _UnlimitedNatural = OCLstdlibTables.Types._UnlimitedNatural;
	    public static final EcoreExecutorType _UnlimitedNaturalLiteralExp = new EcoreExecutorType(PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _UnspecifiedType = new EcoreExecutorType(PivotPackage.Literals.UNSPECIFIED_TYPE, PACKAGE, 0);
	    public static final EcoreExecutorType _UnspecifiedValueExp = new EcoreExecutorType(PivotPackage.Literals.UNSPECIFIED_VALUE_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _ValueSpecification = new EcoreExecutorType(PivotPackage.Literals.VALUE_SPECIFICATION, PACKAGE, 0);
	    public static final EcoreExecutorType _Variable = new EcoreExecutorType(PivotPackage.Literals.VARIABLE, PACKAGE, 0);
	    public static final EcoreExecutorType _VariableDeclaration = new EcoreExecutorType(PivotPackage.Literals.VARIABLE_DECLARATION, PACKAGE, 0);
	    public static final EcoreExecutorType _VariableExp = new EcoreExecutorType(PivotPackage.Literals.VARIABLE_EXP, PACKAGE, 0);
	    public static final EcoreExecutorType _Visitable = new EcoreExecutorType(PivotPackage.Literals.VISITABLE, PACKAGE, 0);
	    private static final ExecutorTypeParameter _Visitor_R = new ExecutorTypeParameter("R");
	    private static final ExecutorTypeParameter _Visitor_C = new ExecutorTypeParameter("C");
	    public static final EcoreExecutorType _Visitor = new EcoreExecutorType(PivotPackage.Literals.VISITOR, PACKAGE, 0, _Visitor_R, _Visitor_C);
	    public static final EcoreExecutorType _VoidType = new EcoreExecutorType(PivotPackage.Literals.VOID_TYPE, PACKAGE, 0);
	
		private static final EcoreExecutorType[] types = {
		    _Annotation,
		    _AnyType,
		    _AssociationClass,
		    _AssociationClassCallExp,
		    _AssociativityKind,
		    _BagType,
		    _Boolean,
		    _BooleanLiteralExp,
		    _CallExp,
		    _CallOperationAction,
		    _Class,
		    _ClassifierType,
		    _CollectionItem,
		    _CollectionKind,
		    _CollectionLiteralExp,
		    _CollectionLiteralPart,
		    _CollectionRange,
		    _CollectionType,
		    _Comment,
		    _Constraint,
		    _ConstructorExp,
		    _ConstructorPart,
		    _DataType,
		    _Detail,
		    _Element,
		    _EnumLiteralExp,
		    _Enumeration,
		    _EnumerationLiteral,
		    _ExpressionInOcl,
		    _Feature,
		    _FeatureCallExp,
		    _IfExp,
		    _Int,
		    _Integer,
		    _IntegerLiteralExp,
		    _InvalidLiteralExp,
		    _InvalidType,
		    _IterateExp,
		    _Iteration,
		    _IteratorExp,
		    _LambdaType,
		    _LetExp,
		    _Library,
		    _LibraryFeature,
		    _LiteralExp,
		    _LoopExp,
		    _MessageExp,
		    _MessageType,
		    _MultiplicityElement,
		    _Nameable,
		    _NamedElement,
		    _Namespace,
		    _NavigationCallExp,
		    _NullLiteralExp,
		    _NumericLiteralExp,
		    _Object,
		    _OclExpression,
		    _OpaqueExpression,
		    _Operation,
		    _OperationCallExp,
		    _OperationTemplateParameter,
		    _OrderedSetType,
		    _Package,
		    _PackageableElement,
		    _Parameter,
		    _ParameterableElement,
		    _Pivotable,
		    _Precedence,
		    _PrimitiveLiteralExp,
		    _PrimitiveType,
		    _Property,
		    _PropertyCallExp,
		    _Real,
		    _RealLiteralExp,
		    _SelfType,
		    _SendSignalAction,
		    _SequenceType,
		    _SetType,
		    _Signal,
		    _State,
		    _StateExp,
		    _String,
		    _StringLiteralExp,
		    _TemplateBinding,
		    _TemplateParameter,
		    _TemplateParameterSubstitution,
		    _TemplateParameterType,
		    _TemplateSignature,
		    _TemplateableElement,
		    _Throwable,
		    _TupleLiteralExp,
		    _TupleLiteralPart,
		    _TupleType,
		    _Type,
		    _TypeExp,
		    _TypeTemplateParameter,
		    _TypedElement,
		    _TypedMultiplicityElement,
		    _UnlimitedNatural,
		    _UnlimitedNaturalLiteralExp,
		    _UnspecifiedType,
		    _UnspecifiedValueExp,
		    _ValueSpecification,
		    _Variable,
		    _VariableDeclaration,
		    _VariableExp,
		    _Visitable,
		    _Visitor,
		    _VoidType
		};
	
		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(types);
			TypeFragments.init();
			FragmentOperations.init();
			FragmentProperties.init();
		}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		public static final ExecutorFragment _Annotation__Annotation = new ExecutorFragment(Types._Annotation, PivotTables.Types._Annotation);
		public static final ExecutorFragment _Annotation__Element = new ExecutorFragment(Types._Annotation, PivotTables.Types._Element);
		public static final ExecutorFragment _Annotation__Nameable = new ExecutorFragment(Types._Annotation, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Annotation__NamedElement = new ExecutorFragment(Types._Annotation, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Annotation__OclAny = new ExecutorFragment(Types._Annotation, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Annotation__OclElement = new ExecutorFragment(Types._Annotation, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Annotation__Visitable = new ExecutorFragment(Types._Annotation, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _AnyType__AnyType = new ExecutorFragment(Types._AnyType, PivotTables.Types._AnyType);
		public static final ExecutorFragment _AnyType__Class = new ExecutorFragment(Types._AnyType, PivotTables.Types._Class);
		public static final ExecutorFragment _AnyType__Element = new ExecutorFragment(Types._AnyType, PivotTables.Types._Element);
		public static final ExecutorFragment _AnyType__Nameable = new ExecutorFragment(Types._AnyType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _AnyType__NamedElement = new ExecutorFragment(Types._AnyType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _AnyType__Namespace = new ExecutorFragment(Types._AnyType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _AnyType__OclAny = new ExecutorFragment(Types._AnyType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _AnyType__OclElement = new ExecutorFragment(Types._AnyType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _AnyType__ParameterableElement = new ExecutorFragment(Types._AnyType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _AnyType__TemplateableElement = new ExecutorFragment(Types._AnyType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _AnyType__Type = new ExecutorFragment(Types._AnyType, PivotTables.Types._Type);
		public static final ExecutorFragment _AnyType__Visitable = new ExecutorFragment(Types._AnyType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _AssociationClass__AssociationClass = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._AssociationClass);
		public static final ExecutorFragment _AssociationClass__Class = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._Class);
		public static final ExecutorFragment _AssociationClass__Element = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._Element);
		public static final ExecutorFragment _AssociationClass__Nameable = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._Nameable);
		public static final ExecutorFragment _AssociationClass__NamedElement = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _AssociationClass__Namespace = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._Namespace);
		public static final ExecutorFragment _AssociationClass__OclAny = new ExecutorFragment(Types._AssociationClass, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _AssociationClass__OclElement = new ExecutorFragment(Types._AssociationClass, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _AssociationClass__ParameterableElement = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _AssociationClass__TemplateableElement = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _AssociationClass__Type = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._Type);
		public static final ExecutorFragment _AssociationClass__Visitable = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _AssociationClassCallExp__AssociationClassCallExp = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._AssociationClassCallExp);
		public static final ExecutorFragment _AssociationClassCallExp__CallExp = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._CallExp);
		public static final ExecutorFragment _AssociationClassCallExp__Element = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._Element);
		public static final ExecutorFragment _AssociationClassCallExp__FeatureCallExp = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._FeatureCallExp);
		public static final ExecutorFragment _AssociationClassCallExp__Nameable = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _AssociationClassCallExp__NamedElement = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _AssociationClassCallExp__NavigationCallExp = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._NavigationCallExp);
		public static final ExecutorFragment _AssociationClassCallExp__OclAny = new ExecutorFragment(Types._AssociationClassCallExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _AssociationClassCallExp__OclElement = new ExecutorFragment(Types._AssociationClassCallExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _AssociationClassCallExp__OclExpression = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _AssociationClassCallExp__TypedElement = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _AssociationClassCallExp__Visitable = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _AssociativityKind__AssociativityKind = new ExecutorFragment(Types._AssociativityKind, PivotTables.Types._AssociativityKind);
		
		public static final ExecutorFragment _BagType__BagType = new ExecutorFragment(Types._BagType, PivotTables.Types._BagType);
		public static final ExecutorFragment _BagType__Class = new ExecutorFragment(Types._BagType, PivotTables.Types._Class);
		public static final ExecutorFragment _BagType__CollectionType = new ExecutorFragment(Types._BagType, PivotTables.Types._CollectionType);
		public static final ExecutorFragment _BagType__DataType = new ExecutorFragment(Types._BagType, PivotTables.Types._DataType);
		public static final ExecutorFragment _BagType__Element = new ExecutorFragment(Types._BagType, PivotTables.Types._Element);
		public static final ExecutorFragment _BagType__Nameable = new ExecutorFragment(Types._BagType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _BagType__NamedElement = new ExecutorFragment(Types._BagType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _BagType__Namespace = new ExecutorFragment(Types._BagType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _BagType__OclAny = new ExecutorFragment(Types._BagType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _BagType__OclElement = new ExecutorFragment(Types._BagType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _BagType__ParameterableElement = new ExecutorFragment(Types._BagType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _BagType__TemplateableElement = new ExecutorFragment(Types._BagType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _BagType__Type = new ExecutorFragment(Types._BagType, PivotTables.Types._Type);
		public static final ExecutorFragment _BagType__Visitable = new ExecutorFragment(Types._BagType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Boolean__Boolean = new ExecutorFragment(Types._Boolean, PivotTables.Types._Boolean);
		
		public static final ExecutorFragment _BooleanLiteralExp__BooleanLiteralExp = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._BooleanLiteralExp);
		public static final ExecutorFragment _BooleanLiteralExp__Element = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _BooleanLiteralExp__LiteralExp = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _BooleanLiteralExp__Nameable = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _BooleanLiteralExp__NamedElement = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _BooleanLiteralExp__OclAny = new ExecutorFragment(Types._BooleanLiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _BooleanLiteralExp__OclElement = new ExecutorFragment(Types._BooleanLiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _BooleanLiteralExp__OclExpression = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _BooleanLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		public static final ExecutorFragment _BooleanLiteralExp__TypedElement = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _BooleanLiteralExp__Visitable = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _CallExp__CallExp = new ExecutorFragment(Types._CallExp, PivotTables.Types._CallExp);
		public static final ExecutorFragment _CallExp__Element = new ExecutorFragment(Types._CallExp, PivotTables.Types._Element);
		public static final ExecutorFragment _CallExp__Nameable = new ExecutorFragment(Types._CallExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _CallExp__NamedElement = new ExecutorFragment(Types._CallExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _CallExp__OclAny = new ExecutorFragment(Types._CallExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _CallExp__OclElement = new ExecutorFragment(Types._CallExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _CallExp__OclExpression = new ExecutorFragment(Types._CallExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _CallExp__TypedElement = new ExecutorFragment(Types._CallExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _CallExp__Visitable = new ExecutorFragment(Types._CallExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _CallOperationAction__CallOperationAction = new ExecutorFragment(Types._CallOperationAction, PivotTables.Types._CallOperationAction);
		public static final ExecutorFragment _CallOperationAction__Element = new ExecutorFragment(Types._CallOperationAction, PivotTables.Types._Element);
		public static final ExecutorFragment _CallOperationAction__Nameable = new ExecutorFragment(Types._CallOperationAction, PivotTables.Types._Nameable);
		public static final ExecutorFragment _CallOperationAction__NamedElement = new ExecutorFragment(Types._CallOperationAction, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _CallOperationAction__OclAny = new ExecutorFragment(Types._CallOperationAction, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _CallOperationAction__OclElement = new ExecutorFragment(Types._CallOperationAction, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _CallOperationAction__Visitable = new ExecutorFragment(Types._CallOperationAction, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Class__Class = new ExecutorFragment(Types._Class, PivotTables.Types._Class);
		public static final ExecutorFragment _Class__Element = new ExecutorFragment(Types._Class, PivotTables.Types._Element);
		public static final ExecutorFragment _Class__Nameable = new ExecutorFragment(Types._Class, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Class__NamedElement = new ExecutorFragment(Types._Class, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Class__Namespace = new ExecutorFragment(Types._Class, PivotTables.Types._Namespace);
		public static final ExecutorFragment _Class__OclAny = new ExecutorFragment(Types._Class, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Class__OclElement = new ExecutorFragment(Types._Class, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Class__ParameterableElement = new ExecutorFragment(Types._Class, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _Class__TemplateableElement = new ExecutorFragment(Types._Class, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _Class__Type = new ExecutorFragment(Types._Class, PivotTables.Types._Type);
		public static final ExecutorFragment _Class__Visitable = new ExecutorFragment(Types._Class, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _ClassifierType__Class = new ExecutorFragment(Types._ClassifierType, PivotTables.Types._Class);
		public static final ExecutorFragment _ClassifierType__ClassifierType = new ExecutorFragment(Types._ClassifierType, PivotTables.Types._ClassifierType);
		public static final ExecutorFragment _ClassifierType__DataType = new ExecutorFragment(Types._ClassifierType, PivotTables.Types._DataType);
		public static final ExecutorFragment _ClassifierType__Element = new ExecutorFragment(Types._ClassifierType, PivotTables.Types._Element);
		public static final ExecutorFragment _ClassifierType__Nameable = new ExecutorFragment(Types._ClassifierType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _ClassifierType__NamedElement = new ExecutorFragment(Types._ClassifierType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _ClassifierType__Namespace = new ExecutorFragment(Types._ClassifierType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _ClassifierType__OclAny = new ExecutorFragment(Types._ClassifierType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _ClassifierType__OclElement = new ExecutorFragment(Types._ClassifierType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _ClassifierType__ParameterableElement = new ExecutorFragment(Types._ClassifierType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _ClassifierType__TemplateableElement = new ExecutorFragment(Types._ClassifierType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _ClassifierType__Type = new ExecutorFragment(Types._ClassifierType, PivotTables.Types._Type);
		public static final ExecutorFragment _ClassifierType__Visitable = new ExecutorFragment(Types._ClassifierType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _CollectionItem__CollectionItem = new ExecutorFragment(Types._CollectionItem, PivotTables.Types._CollectionItem);
		public static final ExecutorFragment _CollectionItem__CollectionLiteralPart = new ExecutorFragment(Types._CollectionItem, PivotTables.Types._CollectionLiteralPart);
		public static final ExecutorFragment _CollectionItem__Element = new ExecutorFragment(Types._CollectionItem, PivotTables.Types._Element);
		public static final ExecutorFragment _CollectionItem__Nameable = new ExecutorFragment(Types._CollectionItem, PivotTables.Types._Nameable);
		public static final ExecutorFragment _CollectionItem__NamedElement = new ExecutorFragment(Types._CollectionItem, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _CollectionItem__OclAny = new ExecutorFragment(Types._CollectionItem, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _CollectionItem__OclElement = new ExecutorFragment(Types._CollectionItem, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _CollectionItem__TypedElement = new ExecutorFragment(Types._CollectionItem, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _CollectionItem__Visitable = new ExecutorFragment(Types._CollectionItem, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _CollectionKind__CollectionKind = new ExecutorFragment(Types._CollectionKind, PivotTables.Types._CollectionKind);
		
		public static final ExecutorFragment _CollectionLiteralExp__CollectionLiteralExp = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._CollectionLiteralExp);
		public static final ExecutorFragment _CollectionLiteralExp__Element = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _CollectionLiteralExp__LiteralExp = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _CollectionLiteralExp__Nameable = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _CollectionLiteralExp__NamedElement = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _CollectionLiteralExp__OclAny = new ExecutorFragment(Types._CollectionLiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _CollectionLiteralExp__OclElement = new ExecutorFragment(Types._CollectionLiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _CollectionLiteralExp__OclExpression = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _CollectionLiteralExp__TypedElement = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _CollectionLiteralExp__Visitable = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _CollectionLiteralPart__CollectionLiteralPart = new ExecutorFragment(Types._CollectionLiteralPart, PivotTables.Types._CollectionLiteralPart);
		public static final ExecutorFragment _CollectionLiteralPart__Element = new ExecutorFragment(Types._CollectionLiteralPart, PivotTables.Types._Element);
		public static final ExecutorFragment _CollectionLiteralPart__Nameable = new ExecutorFragment(Types._CollectionLiteralPart, PivotTables.Types._Nameable);
		public static final ExecutorFragment _CollectionLiteralPart__NamedElement = new ExecutorFragment(Types._CollectionLiteralPart, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _CollectionLiteralPart__OclAny = new ExecutorFragment(Types._CollectionLiteralPart, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _CollectionLiteralPart__OclElement = new ExecutorFragment(Types._CollectionLiteralPart, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _CollectionLiteralPart__TypedElement = new ExecutorFragment(Types._CollectionLiteralPart, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _CollectionLiteralPart__Visitable = new ExecutorFragment(Types._CollectionLiteralPart, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _CollectionRange__CollectionLiteralPart = new ExecutorFragment(Types._CollectionRange, PivotTables.Types._CollectionLiteralPart);
		public static final ExecutorFragment _CollectionRange__CollectionRange = new ExecutorFragment(Types._CollectionRange, PivotTables.Types._CollectionRange);
		public static final ExecutorFragment _CollectionRange__Element = new ExecutorFragment(Types._CollectionRange, PivotTables.Types._Element);
		public static final ExecutorFragment _CollectionRange__Nameable = new ExecutorFragment(Types._CollectionRange, PivotTables.Types._Nameable);
		public static final ExecutorFragment _CollectionRange__NamedElement = new ExecutorFragment(Types._CollectionRange, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _CollectionRange__OclAny = new ExecutorFragment(Types._CollectionRange, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _CollectionRange__OclElement = new ExecutorFragment(Types._CollectionRange, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _CollectionRange__TypedElement = new ExecutorFragment(Types._CollectionRange, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _CollectionRange__Visitable = new ExecutorFragment(Types._CollectionRange, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _CollectionType__Class = new ExecutorFragment(Types._CollectionType, PivotTables.Types._Class);
		public static final ExecutorFragment _CollectionType__CollectionType = new ExecutorFragment(Types._CollectionType, PivotTables.Types._CollectionType);
		public static final ExecutorFragment _CollectionType__DataType = new ExecutorFragment(Types._CollectionType, PivotTables.Types._DataType);
		public static final ExecutorFragment _CollectionType__Element = new ExecutorFragment(Types._CollectionType, PivotTables.Types._Element);
		public static final ExecutorFragment _CollectionType__Nameable = new ExecutorFragment(Types._CollectionType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _CollectionType__NamedElement = new ExecutorFragment(Types._CollectionType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _CollectionType__Namespace = new ExecutorFragment(Types._CollectionType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _CollectionType__OclAny = new ExecutorFragment(Types._CollectionType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _CollectionType__OclElement = new ExecutorFragment(Types._CollectionType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _CollectionType__ParameterableElement = new ExecutorFragment(Types._CollectionType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _CollectionType__TemplateableElement = new ExecutorFragment(Types._CollectionType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _CollectionType__Type = new ExecutorFragment(Types._CollectionType, PivotTables.Types._Type);
		public static final ExecutorFragment _CollectionType__Visitable = new ExecutorFragment(Types._CollectionType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Comment__Comment = new ExecutorFragment(Types._Comment, PivotTables.Types._Comment);
		public static final ExecutorFragment _Comment__Element = new ExecutorFragment(Types._Comment, PivotTables.Types._Element);
		public static final ExecutorFragment _Comment__OclAny = new ExecutorFragment(Types._Comment, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Comment__OclElement = new ExecutorFragment(Types._Comment, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Comment__Visitable = new ExecutorFragment(Types._Comment, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Constraint__Constraint = new ExecutorFragment(Types._Constraint, PivotTables.Types._Constraint);
		public static final ExecutorFragment _Constraint__Element = new ExecutorFragment(Types._Constraint, PivotTables.Types._Element);
		public static final ExecutorFragment _Constraint__Nameable = new ExecutorFragment(Types._Constraint, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Constraint__NamedElement = new ExecutorFragment(Types._Constraint, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Constraint__OclAny = new ExecutorFragment(Types._Constraint, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Constraint__OclElement = new ExecutorFragment(Types._Constraint, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Constraint__Visitable = new ExecutorFragment(Types._Constraint, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _ConstructorExp__ConstructorExp = new ExecutorFragment(Types._ConstructorExp, PivotTables.Types._ConstructorExp);
		public static final ExecutorFragment _ConstructorExp__Element = new ExecutorFragment(Types._ConstructorExp, PivotTables.Types._Element);
		public static final ExecutorFragment _ConstructorExp__Nameable = new ExecutorFragment(Types._ConstructorExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _ConstructorExp__NamedElement = new ExecutorFragment(Types._ConstructorExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _ConstructorExp__OclAny = new ExecutorFragment(Types._ConstructorExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _ConstructorExp__OclElement = new ExecutorFragment(Types._ConstructorExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _ConstructorExp__OclExpression = new ExecutorFragment(Types._ConstructorExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _ConstructorExp__TypedElement = new ExecutorFragment(Types._ConstructorExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _ConstructorExp__Visitable = new ExecutorFragment(Types._ConstructorExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _ConstructorPart__ConstructorPart = new ExecutorFragment(Types._ConstructorPart, PivotTables.Types._ConstructorPart);
		public static final ExecutorFragment _ConstructorPart__Element = new ExecutorFragment(Types._ConstructorPart, PivotTables.Types._Element);
		public static final ExecutorFragment _ConstructorPart__OclAny = new ExecutorFragment(Types._ConstructorPart, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _ConstructorPart__OclElement = new ExecutorFragment(Types._ConstructorPart, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _ConstructorPart__Visitable = new ExecutorFragment(Types._ConstructorPart, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _DataType__Class = new ExecutorFragment(Types._DataType, PivotTables.Types._Class);
		public static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, PivotTables.Types._DataType);
		public static final ExecutorFragment _DataType__Element = new ExecutorFragment(Types._DataType, PivotTables.Types._Element);
		public static final ExecutorFragment _DataType__Nameable = new ExecutorFragment(Types._DataType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _DataType__NamedElement = new ExecutorFragment(Types._DataType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _DataType__Namespace = new ExecutorFragment(Types._DataType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _DataType__ParameterableElement = new ExecutorFragment(Types._DataType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _DataType__TemplateableElement = new ExecutorFragment(Types._DataType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _DataType__Type = new ExecutorFragment(Types._DataType, PivotTables.Types._Type);
		public static final ExecutorFragment _DataType__Visitable = new ExecutorFragment(Types._DataType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Detail__Detail = new ExecutorFragment(Types._Detail, PivotTables.Types._Detail);
		public static final ExecutorFragment _Detail__Element = new ExecutorFragment(Types._Detail, PivotTables.Types._Element);
		public static final ExecutorFragment _Detail__Nameable = new ExecutorFragment(Types._Detail, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Detail__NamedElement = new ExecutorFragment(Types._Detail, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Detail__OclAny = new ExecutorFragment(Types._Detail, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Detail__OclElement = new ExecutorFragment(Types._Detail, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Detail__Visitable = new ExecutorFragment(Types._Detail, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Element__Element = new ExecutorFragment(Types._Element, PivotTables.Types._Element);
		public static final ExecutorFragment _Element__OclAny = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Element__OclElement = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Element__Visitable = new ExecutorFragment(Types._Element, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _EnumLiteralExp__Element = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _EnumLiteralExp__EnumLiteralExp = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._EnumLiteralExp);
		public static final ExecutorFragment _EnumLiteralExp__LiteralExp = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _EnumLiteralExp__Nameable = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _EnumLiteralExp__NamedElement = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _EnumLiteralExp__OclAny = new ExecutorFragment(Types._EnumLiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _EnumLiteralExp__OclElement = new ExecutorFragment(Types._EnumLiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _EnumLiteralExp__OclExpression = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _EnumLiteralExp__TypedElement = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _EnumLiteralExp__Visitable = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Enumeration__Class = new ExecutorFragment(Types._Enumeration, PivotTables.Types._Class);
		public static final ExecutorFragment _Enumeration__DataType = new ExecutorFragment(Types._Enumeration, PivotTables.Types._DataType);
		public static final ExecutorFragment _Enumeration__Element = new ExecutorFragment(Types._Enumeration, PivotTables.Types._Element);
		public static final ExecutorFragment _Enumeration__Enumeration = new ExecutorFragment(Types._Enumeration, PivotTables.Types._Enumeration);
		public static final ExecutorFragment _Enumeration__Nameable = new ExecutorFragment(Types._Enumeration, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Enumeration__NamedElement = new ExecutorFragment(Types._Enumeration, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Enumeration__Namespace = new ExecutorFragment(Types._Enumeration, PivotTables.Types._Namespace);
		public static final ExecutorFragment _Enumeration__OclAny = new ExecutorFragment(Types._Enumeration, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Enumeration__OclElement = new ExecutorFragment(Types._Enumeration, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Enumeration__ParameterableElement = new ExecutorFragment(Types._Enumeration, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _Enumeration__TemplateableElement = new ExecutorFragment(Types._Enumeration, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _Enumeration__Type = new ExecutorFragment(Types._Enumeration, PivotTables.Types._Type);
		public static final ExecutorFragment _Enumeration__Visitable = new ExecutorFragment(Types._Enumeration, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _EnumerationLiteral__Element = new ExecutorFragment(Types._EnumerationLiteral, PivotTables.Types._Element);
		public static final ExecutorFragment _EnumerationLiteral__EnumerationLiteral = new ExecutorFragment(Types._EnumerationLiteral, PivotTables.Types._EnumerationLiteral);
		public static final ExecutorFragment _EnumerationLiteral__Nameable = new ExecutorFragment(Types._EnumerationLiteral, PivotTables.Types._Nameable);
		public static final ExecutorFragment _EnumerationLiteral__NamedElement = new ExecutorFragment(Types._EnumerationLiteral, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _EnumerationLiteral__OclAny = new ExecutorFragment(Types._EnumerationLiteral, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _EnumerationLiteral__OclElement = new ExecutorFragment(Types._EnumerationLiteral, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _EnumerationLiteral__Visitable = new ExecutorFragment(Types._EnumerationLiteral, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _ExpressionInOcl__Element = new ExecutorFragment(Types._ExpressionInOcl, PivotTables.Types._Element);
		public static final ExecutorFragment _ExpressionInOcl__ExpressionInOcl = new ExecutorFragment(Types._ExpressionInOcl, PivotTables.Types._ExpressionInOcl);
		public static final ExecutorFragment _ExpressionInOcl__Nameable = new ExecutorFragment(Types._ExpressionInOcl, PivotTables.Types._Nameable);
		public static final ExecutorFragment _ExpressionInOcl__NamedElement = new ExecutorFragment(Types._ExpressionInOcl, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _ExpressionInOcl__OclAny = new ExecutorFragment(Types._ExpressionInOcl, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _ExpressionInOcl__OclElement = new ExecutorFragment(Types._ExpressionInOcl, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _ExpressionInOcl__OpaqueExpression = new ExecutorFragment(Types._ExpressionInOcl, PivotTables.Types._OpaqueExpression);
		public static final ExecutorFragment _ExpressionInOcl__ParameterableElement = new ExecutorFragment(Types._ExpressionInOcl, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _ExpressionInOcl__TypedElement = new ExecutorFragment(Types._ExpressionInOcl, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _ExpressionInOcl__ValueSpecification = new ExecutorFragment(Types._ExpressionInOcl, PivotTables.Types._ValueSpecification);
		public static final ExecutorFragment _ExpressionInOcl__Visitable = new ExecutorFragment(Types._ExpressionInOcl, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Feature__Element = new ExecutorFragment(Types._Feature, PivotTables.Types._Element);
		public static final ExecutorFragment _Feature__Feature = new ExecutorFragment(Types._Feature, PivotTables.Types._Feature);
		public static final ExecutorFragment _Feature__MultiplicityElement = new ExecutorFragment(Types._Feature, PivotTables.Types._MultiplicityElement);
		public static final ExecutorFragment _Feature__Nameable = new ExecutorFragment(Types._Feature, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Feature__NamedElement = new ExecutorFragment(Types._Feature, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Feature__OclAny = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Feature__OclElement = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Feature__TypedElement = new ExecutorFragment(Types._Feature, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _Feature__TypedMultiplicityElement = new ExecutorFragment(Types._Feature, PivotTables.Types._TypedMultiplicityElement);
		public static final ExecutorFragment _Feature__Visitable = new ExecutorFragment(Types._Feature, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _FeatureCallExp__CallExp = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._CallExp);
		public static final ExecutorFragment _FeatureCallExp__Element = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._Element);
		public static final ExecutorFragment _FeatureCallExp__FeatureCallExp = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._FeatureCallExp);
		public static final ExecutorFragment _FeatureCallExp__Nameable = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _FeatureCallExp__NamedElement = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _FeatureCallExp__OclAny = new ExecutorFragment(Types._FeatureCallExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _FeatureCallExp__OclElement = new ExecutorFragment(Types._FeatureCallExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _FeatureCallExp__OclExpression = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _FeatureCallExp__TypedElement = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _FeatureCallExp__Visitable = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _IfExp__Element = new ExecutorFragment(Types._IfExp, PivotTables.Types._Element);
		public static final ExecutorFragment _IfExp__IfExp = new ExecutorFragment(Types._IfExp, PivotTables.Types._IfExp);
		public static final ExecutorFragment _IfExp__Nameable = new ExecutorFragment(Types._IfExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _IfExp__NamedElement = new ExecutorFragment(Types._IfExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _IfExp__OclAny = new ExecutorFragment(Types._IfExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _IfExp__OclElement = new ExecutorFragment(Types._IfExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _IfExp__OclExpression = new ExecutorFragment(Types._IfExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _IfExp__TypedElement = new ExecutorFragment(Types._IfExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _IfExp__Visitable = new ExecutorFragment(Types._IfExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Int__Int = new ExecutorFragment(Types._Int, PivotTables.Types._Int);
		
		public static final ExecutorFragment _Integer__Integer = new ExecutorFragment(Types._Integer, PivotTables.Types._Integer);
		
		public static final ExecutorFragment _IntegerLiteralExp__Element = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _IntegerLiteralExp__IntegerLiteralExp = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._IntegerLiteralExp);
		public static final ExecutorFragment _IntegerLiteralExp__LiteralExp = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _IntegerLiteralExp__Nameable = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _IntegerLiteralExp__NamedElement = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _IntegerLiteralExp__NumericLiteralExp = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._NumericLiteralExp);
		public static final ExecutorFragment _IntegerLiteralExp__OclAny = new ExecutorFragment(Types._IntegerLiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _IntegerLiteralExp__OclElement = new ExecutorFragment(Types._IntegerLiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _IntegerLiteralExp__OclExpression = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _IntegerLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		public static final ExecutorFragment _IntegerLiteralExp__TypedElement = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _IntegerLiteralExp__Visitable = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _InvalidLiteralExp__Element = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _InvalidLiteralExp__InvalidLiteralExp = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._InvalidLiteralExp);
		public static final ExecutorFragment _InvalidLiteralExp__LiteralExp = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _InvalidLiteralExp__Nameable = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _InvalidLiteralExp__NamedElement = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _InvalidLiteralExp__OclAny = new ExecutorFragment(Types._InvalidLiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _InvalidLiteralExp__OclElement = new ExecutorFragment(Types._InvalidLiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _InvalidLiteralExp__OclExpression = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _InvalidLiteralExp__TypedElement = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _InvalidLiteralExp__Visitable = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _InvalidType__Class = new ExecutorFragment(Types._InvalidType, PivotTables.Types._Class);
		public static final ExecutorFragment _InvalidType__Element = new ExecutorFragment(Types._InvalidType, PivotTables.Types._Element);
		public static final ExecutorFragment _InvalidType__InvalidType = new ExecutorFragment(Types._InvalidType, PivotTables.Types._InvalidType);
		public static final ExecutorFragment _InvalidType__Nameable = new ExecutorFragment(Types._InvalidType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _InvalidType__NamedElement = new ExecutorFragment(Types._InvalidType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _InvalidType__Namespace = new ExecutorFragment(Types._InvalidType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _InvalidType__OclAny = new ExecutorFragment(Types._InvalidType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _InvalidType__OclElement = new ExecutorFragment(Types._InvalidType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _InvalidType__ParameterableElement = new ExecutorFragment(Types._InvalidType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _InvalidType__TemplateableElement = new ExecutorFragment(Types._InvalidType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _InvalidType__Type = new ExecutorFragment(Types._InvalidType, PivotTables.Types._Type);
		public static final ExecutorFragment _InvalidType__Visitable = new ExecutorFragment(Types._InvalidType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _IterateExp__CallExp = new ExecutorFragment(Types._IterateExp, PivotTables.Types._CallExp);
		public static final ExecutorFragment _IterateExp__Element = new ExecutorFragment(Types._IterateExp, PivotTables.Types._Element);
		public static final ExecutorFragment _IterateExp__IterateExp = new ExecutorFragment(Types._IterateExp, PivotTables.Types._IterateExp);
		public static final ExecutorFragment _IterateExp__LoopExp = new ExecutorFragment(Types._IterateExp, PivotTables.Types._LoopExp);
		public static final ExecutorFragment _IterateExp__Nameable = new ExecutorFragment(Types._IterateExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _IterateExp__NamedElement = new ExecutorFragment(Types._IterateExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _IterateExp__OclAny = new ExecutorFragment(Types._IterateExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _IterateExp__OclElement = new ExecutorFragment(Types._IterateExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _IterateExp__OclExpression = new ExecutorFragment(Types._IterateExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _IterateExp__TypedElement = new ExecutorFragment(Types._IterateExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _IterateExp__Visitable = new ExecutorFragment(Types._IterateExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Iteration__Element = new ExecutorFragment(Types._Iteration, PivotTables.Types._Element);
		public static final ExecutorFragment _Iteration__Feature = new ExecutorFragment(Types._Iteration, PivotTables.Types._Feature);
		public static final ExecutorFragment _Iteration__Iteration = new ExecutorFragment(Types._Iteration, PivotTables.Types._Iteration);
		public static final ExecutorFragment _Iteration__MultiplicityElement = new ExecutorFragment(Types._Iteration, PivotTables.Types._MultiplicityElement);
		public static final ExecutorFragment _Iteration__Nameable = new ExecutorFragment(Types._Iteration, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Iteration__NamedElement = new ExecutorFragment(Types._Iteration, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Iteration__Namespace = new ExecutorFragment(Types._Iteration, PivotTables.Types._Namespace);
		public static final ExecutorFragment _Iteration__OclAny = new ExecutorFragment(Types._Iteration, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Iteration__OclElement = new ExecutorFragment(Types._Iteration, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Iteration__Operation = new ExecutorFragment(Types._Iteration, PivotTables.Types._Operation);
		public static final ExecutorFragment _Iteration__ParameterableElement = new ExecutorFragment(Types._Iteration, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _Iteration__TemplateableElement = new ExecutorFragment(Types._Iteration, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _Iteration__TypedElement = new ExecutorFragment(Types._Iteration, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _Iteration__TypedMultiplicityElement = new ExecutorFragment(Types._Iteration, PivotTables.Types._TypedMultiplicityElement);
		public static final ExecutorFragment _Iteration__Visitable = new ExecutorFragment(Types._Iteration, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _IteratorExp__CallExp = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._CallExp);
		public static final ExecutorFragment _IteratorExp__Element = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._Element);
		public static final ExecutorFragment _IteratorExp__IteratorExp = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._IteratorExp);
		public static final ExecutorFragment _IteratorExp__LoopExp = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._LoopExp);
		public static final ExecutorFragment _IteratorExp__Nameable = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _IteratorExp__NamedElement = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _IteratorExp__OclAny = new ExecutorFragment(Types._IteratorExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _IteratorExp__OclElement = new ExecutorFragment(Types._IteratorExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _IteratorExp__OclExpression = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _IteratorExp__TypedElement = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _IteratorExp__Visitable = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _LambdaType__Class = new ExecutorFragment(Types._LambdaType, PivotTables.Types._Class);
		public static final ExecutorFragment _LambdaType__DataType = new ExecutorFragment(Types._LambdaType, PivotTables.Types._DataType);
		public static final ExecutorFragment _LambdaType__Element = new ExecutorFragment(Types._LambdaType, PivotTables.Types._Element);
		public static final ExecutorFragment _LambdaType__LambdaType = new ExecutorFragment(Types._LambdaType, PivotTables.Types._LambdaType);
		public static final ExecutorFragment _LambdaType__Nameable = new ExecutorFragment(Types._LambdaType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _LambdaType__NamedElement = new ExecutorFragment(Types._LambdaType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _LambdaType__Namespace = new ExecutorFragment(Types._LambdaType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _LambdaType__OclAny = new ExecutorFragment(Types._LambdaType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _LambdaType__OclElement = new ExecutorFragment(Types._LambdaType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _LambdaType__ParameterableElement = new ExecutorFragment(Types._LambdaType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _LambdaType__TemplateableElement = new ExecutorFragment(Types._LambdaType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _LambdaType__Type = new ExecutorFragment(Types._LambdaType, PivotTables.Types._Type);
		public static final ExecutorFragment _LambdaType__Visitable = new ExecutorFragment(Types._LambdaType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _LetExp__Element = new ExecutorFragment(Types._LetExp, PivotTables.Types._Element);
		public static final ExecutorFragment _LetExp__LetExp = new ExecutorFragment(Types._LetExp, PivotTables.Types._LetExp);
		public static final ExecutorFragment _LetExp__Nameable = new ExecutorFragment(Types._LetExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _LetExp__NamedElement = new ExecutorFragment(Types._LetExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _LetExp__OclAny = new ExecutorFragment(Types._LetExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _LetExp__OclElement = new ExecutorFragment(Types._LetExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _LetExp__OclExpression = new ExecutorFragment(Types._LetExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _LetExp__TypedElement = new ExecutorFragment(Types._LetExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _LetExp__Visitable = new ExecutorFragment(Types._LetExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Library__Element = new ExecutorFragment(Types._Library, PivotTables.Types._Element);
		public static final ExecutorFragment _Library__Library = new ExecutorFragment(Types._Library, PivotTables.Types._Library);
		public static final ExecutorFragment _Library__Nameable = new ExecutorFragment(Types._Library, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Library__NamedElement = new ExecutorFragment(Types._Library, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Library__Namespace = new ExecutorFragment(Types._Library, PivotTables.Types._Namespace);
		public static final ExecutorFragment _Library__OclAny = new ExecutorFragment(Types._Library, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Library__OclElement = new ExecutorFragment(Types._Library, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Library__Package = new ExecutorFragment(Types._Library, PivotTables.Types._Package);
		public static final ExecutorFragment _Library__TemplateableElement = new ExecutorFragment(Types._Library, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _Library__Visitable = new ExecutorFragment(Types._Library, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _LibraryFeature__LibraryFeature = new ExecutorFragment(Types._LibraryFeature, PivotTables.Types._LibraryFeature);
		
		public static final ExecutorFragment _LiteralExp__Element = new ExecutorFragment(Types._LiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _LiteralExp__LiteralExp = new ExecutorFragment(Types._LiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _LiteralExp__Nameable = new ExecutorFragment(Types._LiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _LiteralExp__NamedElement = new ExecutorFragment(Types._LiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _LiteralExp__OclAny = new ExecutorFragment(Types._LiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _LiteralExp__OclElement = new ExecutorFragment(Types._LiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _LiteralExp__OclExpression = new ExecutorFragment(Types._LiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _LiteralExp__TypedElement = new ExecutorFragment(Types._LiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _LiteralExp__Visitable = new ExecutorFragment(Types._LiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _LoopExp__CallExp = new ExecutorFragment(Types._LoopExp, PivotTables.Types._CallExp);
		public static final ExecutorFragment _LoopExp__Element = new ExecutorFragment(Types._LoopExp, PivotTables.Types._Element);
		public static final ExecutorFragment _LoopExp__LoopExp = new ExecutorFragment(Types._LoopExp, PivotTables.Types._LoopExp);
		public static final ExecutorFragment _LoopExp__Nameable = new ExecutorFragment(Types._LoopExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _LoopExp__NamedElement = new ExecutorFragment(Types._LoopExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _LoopExp__OclAny = new ExecutorFragment(Types._LoopExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _LoopExp__OclElement = new ExecutorFragment(Types._LoopExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _LoopExp__OclExpression = new ExecutorFragment(Types._LoopExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _LoopExp__TypedElement = new ExecutorFragment(Types._LoopExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _LoopExp__Visitable = new ExecutorFragment(Types._LoopExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _MessageExp__Element = new ExecutorFragment(Types._MessageExp, PivotTables.Types._Element);
		public static final ExecutorFragment _MessageExp__MessageExp = new ExecutorFragment(Types._MessageExp, PivotTables.Types._MessageExp);
		public static final ExecutorFragment _MessageExp__Nameable = new ExecutorFragment(Types._MessageExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _MessageExp__NamedElement = new ExecutorFragment(Types._MessageExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _MessageExp__OclAny = new ExecutorFragment(Types._MessageExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _MessageExp__OclElement = new ExecutorFragment(Types._MessageExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _MessageExp__OclExpression = new ExecutorFragment(Types._MessageExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _MessageExp__TypedElement = new ExecutorFragment(Types._MessageExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _MessageExp__Visitable = new ExecutorFragment(Types._MessageExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _MessageType__Element = new ExecutorFragment(Types._MessageType, PivotTables.Types._Element);
		public static final ExecutorFragment _MessageType__MessageType = new ExecutorFragment(Types._MessageType, PivotTables.Types._MessageType);
		public static final ExecutorFragment _MessageType__Nameable = new ExecutorFragment(Types._MessageType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _MessageType__NamedElement = new ExecutorFragment(Types._MessageType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _MessageType__OclAny = new ExecutorFragment(Types._MessageType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _MessageType__OclElement = new ExecutorFragment(Types._MessageType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _MessageType__ParameterableElement = new ExecutorFragment(Types._MessageType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _MessageType__TemplateableElement = new ExecutorFragment(Types._MessageType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _MessageType__Type = new ExecutorFragment(Types._MessageType, PivotTables.Types._Type);
		public static final ExecutorFragment _MessageType__Visitable = new ExecutorFragment(Types._MessageType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _MultiplicityElement__Element = new ExecutorFragment(Types._MultiplicityElement, PivotTables.Types._Element);
		public static final ExecutorFragment _MultiplicityElement__MultiplicityElement = new ExecutorFragment(Types._MultiplicityElement, PivotTables.Types._MultiplicityElement);
		public static final ExecutorFragment _MultiplicityElement__OclAny = new ExecutorFragment(Types._MultiplicityElement, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _MultiplicityElement__OclElement = new ExecutorFragment(Types._MultiplicityElement, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _MultiplicityElement__Visitable = new ExecutorFragment(Types._MultiplicityElement, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Nameable__Nameable = new ExecutorFragment(Types._Nameable, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Nameable__OclAny = new ExecutorFragment(Types._Nameable, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Nameable__OclElement = new ExecutorFragment(Types._Nameable, OCLstdlibTables.Types._OclElement);
		
		public static final ExecutorFragment _NamedElement__Element = new ExecutorFragment(Types._NamedElement, PivotTables.Types._Element);
		public static final ExecutorFragment _NamedElement__Nameable = new ExecutorFragment(Types._NamedElement, PivotTables.Types._Nameable);
		public static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _NamedElement__Visitable = new ExecutorFragment(Types._NamedElement, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Namespace__Element = new ExecutorFragment(Types._Namespace, PivotTables.Types._Element);
		public static final ExecutorFragment _Namespace__Nameable = new ExecutorFragment(Types._Namespace, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Namespace__NamedElement = new ExecutorFragment(Types._Namespace, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Namespace__Namespace = new ExecutorFragment(Types._Namespace, PivotTables.Types._Namespace);
		public static final ExecutorFragment _Namespace__OclAny = new ExecutorFragment(Types._Namespace, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Namespace__OclElement = new ExecutorFragment(Types._Namespace, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Namespace__Visitable = new ExecutorFragment(Types._Namespace, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _NavigationCallExp__CallExp = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._CallExp);
		public static final ExecutorFragment _NavigationCallExp__Element = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._Element);
		public static final ExecutorFragment _NavigationCallExp__FeatureCallExp = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._FeatureCallExp);
		public static final ExecutorFragment _NavigationCallExp__Nameable = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _NavigationCallExp__NamedElement = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _NavigationCallExp__NavigationCallExp = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._NavigationCallExp);
		public static final ExecutorFragment _NavigationCallExp__OclAny = new ExecutorFragment(Types._NavigationCallExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _NavigationCallExp__OclElement = new ExecutorFragment(Types._NavigationCallExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _NavigationCallExp__OclExpression = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _NavigationCallExp__TypedElement = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _NavigationCallExp__Visitable = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _NullLiteralExp__Element = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _NullLiteralExp__LiteralExp = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _NullLiteralExp__Nameable = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _NullLiteralExp__NamedElement = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _NullLiteralExp__NullLiteralExp = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._NullLiteralExp);
		public static final ExecutorFragment _NullLiteralExp__OclAny = new ExecutorFragment(Types._NullLiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _NullLiteralExp__OclElement = new ExecutorFragment(Types._NullLiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _NullLiteralExp__OclExpression = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _NullLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		public static final ExecutorFragment _NullLiteralExp__TypedElement = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _NullLiteralExp__Visitable = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _NumericLiteralExp__Element = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _NumericLiteralExp__LiteralExp = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _NumericLiteralExp__Nameable = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _NumericLiteralExp__NamedElement = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _NumericLiteralExp__NumericLiteralExp = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._NumericLiteralExp);
		public static final ExecutorFragment _NumericLiteralExp__OclAny = new ExecutorFragment(Types._NumericLiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _NumericLiteralExp__OclElement = new ExecutorFragment(Types._NumericLiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _NumericLiteralExp__OclExpression = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _NumericLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		public static final ExecutorFragment _NumericLiteralExp__TypedElement = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _NumericLiteralExp__Visitable = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Object__Object = new ExecutorFragment(Types._Object, PivotTables.Types._Object);
		
		public static final ExecutorFragment _OclExpression__Element = new ExecutorFragment(Types._OclExpression, PivotTables.Types._Element);
		public static final ExecutorFragment _OclExpression__Nameable = new ExecutorFragment(Types._OclExpression, PivotTables.Types._Nameable);
		public static final ExecutorFragment _OclExpression__NamedElement = new ExecutorFragment(Types._OclExpression, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _OclExpression__OclAny = new ExecutorFragment(Types._OclExpression, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OclExpression__OclElement = new ExecutorFragment(Types._OclExpression, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _OclExpression__OclExpression = new ExecutorFragment(Types._OclExpression, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _OclExpression__TypedElement = new ExecutorFragment(Types._OclExpression, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _OclExpression__Visitable = new ExecutorFragment(Types._OclExpression, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _OpaqueExpression__Element = new ExecutorFragment(Types._OpaqueExpression, PivotTables.Types._Element);
		public static final ExecutorFragment _OpaqueExpression__Nameable = new ExecutorFragment(Types._OpaqueExpression, PivotTables.Types._Nameable);
		public static final ExecutorFragment _OpaqueExpression__NamedElement = new ExecutorFragment(Types._OpaqueExpression, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _OpaqueExpression__OclAny = new ExecutorFragment(Types._OpaqueExpression, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OpaqueExpression__OclElement = new ExecutorFragment(Types._OpaqueExpression, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _OpaqueExpression__OpaqueExpression = new ExecutorFragment(Types._OpaqueExpression, PivotTables.Types._OpaqueExpression);
		public static final ExecutorFragment _OpaqueExpression__ParameterableElement = new ExecutorFragment(Types._OpaqueExpression, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _OpaqueExpression__TypedElement = new ExecutorFragment(Types._OpaqueExpression, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _OpaqueExpression__ValueSpecification = new ExecutorFragment(Types._OpaqueExpression, PivotTables.Types._ValueSpecification);
		public static final ExecutorFragment _OpaqueExpression__Visitable = new ExecutorFragment(Types._OpaqueExpression, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Operation__Element = new ExecutorFragment(Types._Operation, PivotTables.Types._Element);
		public static final ExecutorFragment _Operation__Feature = new ExecutorFragment(Types._Operation, PivotTables.Types._Feature);
		public static final ExecutorFragment _Operation__MultiplicityElement = new ExecutorFragment(Types._Operation, PivotTables.Types._MultiplicityElement);
		public static final ExecutorFragment _Operation__Nameable = new ExecutorFragment(Types._Operation, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Operation__NamedElement = new ExecutorFragment(Types._Operation, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Operation__Namespace = new ExecutorFragment(Types._Operation, PivotTables.Types._Namespace);
		public static final ExecutorFragment _Operation__OclAny = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Operation__OclElement = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Operation__Operation = new ExecutorFragment(Types._Operation, PivotTables.Types._Operation);
		public static final ExecutorFragment _Operation__ParameterableElement = new ExecutorFragment(Types._Operation, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _Operation__TemplateableElement = new ExecutorFragment(Types._Operation, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _Operation__TypedElement = new ExecutorFragment(Types._Operation, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _Operation__TypedMultiplicityElement = new ExecutorFragment(Types._Operation, PivotTables.Types._TypedMultiplicityElement);
		public static final ExecutorFragment _Operation__Visitable = new ExecutorFragment(Types._Operation, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _OperationCallExp__CallExp = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._CallExp);
		public static final ExecutorFragment _OperationCallExp__Element = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._Element);
		public static final ExecutorFragment _OperationCallExp__FeatureCallExp = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._FeatureCallExp);
		public static final ExecutorFragment _OperationCallExp__Nameable = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _OperationCallExp__NamedElement = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _OperationCallExp__OclAny = new ExecutorFragment(Types._OperationCallExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OperationCallExp__OclElement = new ExecutorFragment(Types._OperationCallExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _OperationCallExp__OclExpression = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _OperationCallExp__OperationCallExp = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._OperationCallExp);
		public static final ExecutorFragment _OperationCallExp__TypedElement = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _OperationCallExp__Visitable = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _OperationTemplateParameter__Element = new ExecutorFragment(Types._OperationTemplateParameter, PivotTables.Types._Element);
		public static final ExecutorFragment _OperationTemplateParameter__OclAny = new ExecutorFragment(Types._OperationTemplateParameter, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OperationTemplateParameter__OclElement = new ExecutorFragment(Types._OperationTemplateParameter, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _OperationTemplateParameter__OperationTemplateParameter = new ExecutorFragment(Types._OperationTemplateParameter, PivotTables.Types._OperationTemplateParameter);
		public static final ExecutorFragment _OperationTemplateParameter__TemplateParameter = new ExecutorFragment(Types._OperationTemplateParameter, PivotTables.Types._TemplateParameter);
		public static final ExecutorFragment _OperationTemplateParameter__Visitable = new ExecutorFragment(Types._OperationTemplateParameter, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _OrderedSetType__Class = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._Class);
		public static final ExecutorFragment _OrderedSetType__CollectionType = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._CollectionType);
		public static final ExecutorFragment _OrderedSetType__DataType = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._DataType);
		public static final ExecutorFragment _OrderedSetType__Element = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._Element);
		public static final ExecutorFragment _OrderedSetType__Nameable = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _OrderedSetType__NamedElement = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _OrderedSetType__Namespace = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _OrderedSetType__OclAny = new ExecutorFragment(Types._OrderedSetType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OrderedSetType__OclElement = new ExecutorFragment(Types._OrderedSetType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _OrderedSetType__OrderedSetType = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._OrderedSetType);
		public static final ExecutorFragment _OrderedSetType__ParameterableElement = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _OrderedSetType__TemplateableElement = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _OrderedSetType__Type = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._Type);
		public static final ExecutorFragment _OrderedSetType__Visitable = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Package__Element = new ExecutorFragment(Types._Package, PivotTables.Types._Element);
		public static final ExecutorFragment _Package__Nameable = new ExecutorFragment(Types._Package, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Package__NamedElement = new ExecutorFragment(Types._Package, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Package__Namespace = new ExecutorFragment(Types._Package, PivotTables.Types._Namespace);
		public static final ExecutorFragment _Package__OclAny = new ExecutorFragment(Types._Package, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Package__OclElement = new ExecutorFragment(Types._Package, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Package__Package = new ExecutorFragment(Types._Package, PivotTables.Types._Package);
		public static final ExecutorFragment _Package__TemplateableElement = new ExecutorFragment(Types._Package, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _Package__Visitable = new ExecutorFragment(Types._Package, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _PackageableElement__Element = new ExecutorFragment(Types._PackageableElement, PivotTables.Types._Element);
		public static final ExecutorFragment _PackageableElement__OclAny = new ExecutorFragment(Types._PackageableElement, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _PackageableElement__OclElement = new ExecutorFragment(Types._PackageableElement, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _PackageableElement__PackageableElement = new ExecutorFragment(Types._PackageableElement, PivotTables.Types._PackageableElement);
		public static final ExecutorFragment _PackageableElement__ParameterableElement = new ExecutorFragment(Types._PackageableElement, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _PackageableElement__Visitable = new ExecutorFragment(Types._PackageableElement, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Parameter__Element = new ExecutorFragment(Types._Parameter, PivotTables.Types._Element);
		public static final ExecutorFragment _Parameter__MultiplicityElement = new ExecutorFragment(Types._Parameter, PivotTables.Types._MultiplicityElement);
		public static final ExecutorFragment _Parameter__Nameable = new ExecutorFragment(Types._Parameter, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Parameter__NamedElement = new ExecutorFragment(Types._Parameter, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Parameter__OclAny = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Parameter__OclElement = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Parameter__Parameter = new ExecutorFragment(Types._Parameter, PivotTables.Types._Parameter);
		public static final ExecutorFragment _Parameter__TypedElement = new ExecutorFragment(Types._Parameter, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _Parameter__TypedMultiplicityElement = new ExecutorFragment(Types._Parameter, PivotTables.Types._TypedMultiplicityElement);
		public static final ExecutorFragment _Parameter__VariableDeclaration = new ExecutorFragment(Types._Parameter, PivotTables.Types._VariableDeclaration);
		public static final ExecutorFragment _Parameter__Visitable = new ExecutorFragment(Types._Parameter, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _ParameterableElement__Element = new ExecutorFragment(Types._ParameterableElement, PivotTables.Types._Element);
		public static final ExecutorFragment _ParameterableElement__OclAny = new ExecutorFragment(Types._ParameterableElement, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _ParameterableElement__OclElement = new ExecutorFragment(Types._ParameterableElement, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _ParameterableElement__ParameterableElement = new ExecutorFragment(Types._ParameterableElement, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _ParameterableElement__Visitable = new ExecutorFragment(Types._ParameterableElement, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Pivotable__OclAny = new ExecutorFragment(Types._Pivotable, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Pivotable__OclElement = new ExecutorFragment(Types._Pivotable, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Pivotable__Pivotable = new ExecutorFragment(Types._Pivotable, PivotTables.Types._Pivotable);
		
		public static final ExecutorFragment _Precedence__Element = new ExecutorFragment(Types._Precedence, PivotTables.Types._Element);
		public static final ExecutorFragment _Precedence__Nameable = new ExecutorFragment(Types._Precedence, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Precedence__NamedElement = new ExecutorFragment(Types._Precedence, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Precedence__OclAny = new ExecutorFragment(Types._Precedence, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Precedence__OclElement = new ExecutorFragment(Types._Precedence, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Precedence__Precedence = new ExecutorFragment(Types._Precedence, PivotTables.Types._Precedence);
		public static final ExecutorFragment _Precedence__Visitable = new ExecutorFragment(Types._Precedence, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _PrimitiveLiteralExp__Element = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _PrimitiveLiteralExp__LiteralExp = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _PrimitiveLiteralExp__Nameable = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _PrimitiveLiteralExp__NamedElement = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _PrimitiveLiteralExp__OclAny = new ExecutorFragment(Types._PrimitiveLiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _PrimitiveLiteralExp__OclElement = new ExecutorFragment(Types._PrimitiveLiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _PrimitiveLiteralExp__OclExpression = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _PrimitiveLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		public static final ExecutorFragment _PrimitiveLiteralExp__TypedElement = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _PrimitiveLiteralExp__Visitable = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _PrimitiveType__Class = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._Class);
		public static final ExecutorFragment _PrimitiveType__DataType = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._DataType);
		public static final ExecutorFragment _PrimitiveType__Element = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._Element);
		public static final ExecutorFragment _PrimitiveType__Nameable = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _PrimitiveType__NamedElement = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _PrimitiveType__Namespace = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _PrimitiveType__OclAny = new ExecutorFragment(Types._PrimitiveType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _PrimitiveType__OclElement = new ExecutorFragment(Types._PrimitiveType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _PrimitiveType__ParameterableElement = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _PrimitiveType__PrimitiveType = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._PrimitiveType);
		public static final ExecutorFragment _PrimitiveType__TemplateableElement = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _PrimitiveType__Type = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._Type);
		public static final ExecutorFragment _PrimitiveType__Visitable = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Property__Element = new ExecutorFragment(Types._Property, PivotTables.Types._Element);
		public static final ExecutorFragment _Property__Feature = new ExecutorFragment(Types._Property, PivotTables.Types._Feature);
		public static final ExecutorFragment _Property__MultiplicityElement = new ExecutorFragment(Types._Property, PivotTables.Types._MultiplicityElement);
		public static final ExecutorFragment _Property__Nameable = new ExecutorFragment(Types._Property, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Property__NamedElement = new ExecutorFragment(Types._Property, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Property__OclAny = new ExecutorFragment(Types._Property, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Property__OclElement = new ExecutorFragment(Types._Property, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Property__ParameterableElement = new ExecutorFragment(Types._Property, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _Property__Property = new ExecutorFragment(Types._Property, PivotTables.Types._Property);
		public static final ExecutorFragment _Property__TypedElement = new ExecutorFragment(Types._Property, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _Property__TypedMultiplicityElement = new ExecutorFragment(Types._Property, PivotTables.Types._TypedMultiplicityElement);
		public static final ExecutorFragment _Property__Visitable = new ExecutorFragment(Types._Property, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _PropertyCallExp__CallExp = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._CallExp);
		public static final ExecutorFragment _PropertyCallExp__Element = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._Element);
		public static final ExecutorFragment _PropertyCallExp__FeatureCallExp = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._FeatureCallExp);
		public static final ExecutorFragment _PropertyCallExp__Nameable = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _PropertyCallExp__NamedElement = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _PropertyCallExp__NavigationCallExp = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._NavigationCallExp);
		public static final ExecutorFragment _PropertyCallExp__OclAny = new ExecutorFragment(Types._PropertyCallExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _PropertyCallExp__OclElement = new ExecutorFragment(Types._PropertyCallExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _PropertyCallExp__OclExpression = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _PropertyCallExp__PropertyCallExp = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._PropertyCallExp);
		public static final ExecutorFragment _PropertyCallExp__TypedElement = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _PropertyCallExp__Visitable = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Real__Real = new ExecutorFragment(Types._Real, PivotTables.Types._Real);
		
		public static final ExecutorFragment _RealLiteralExp__Element = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _RealLiteralExp__LiteralExp = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _RealLiteralExp__Nameable = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _RealLiteralExp__NamedElement = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _RealLiteralExp__NumericLiteralExp = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._NumericLiteralExp);
		public static final ExecutorFragment _RealLiteralExp__OclAny = new ExecutorFragment(Types._RealLiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _RealLiteralExp__OclElement = new ExecutorFragment(Types._RealLiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _RealLiteralExp__OclExpression = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _RealLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		public static final ExecutorFragment _RealLiteralExp__RealLiteralExp = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._RealLiteralExp);
		public static final ExecutorFragment _RealLiteralExp__TypedElement = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _RealLiteralExp__Visitable = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _SelfType__Class = new ExecutorFragment(Types._SelfType, PivotTables.Types._Class);
		public static final ExecutorFragment _SelfType__Element = new ExecutorFragment(Types._SelfType, PivotTables.Types._Element);
		public static final ExecutorFragment _SelfType__Nameable = new ExecutorFragment(Types._SelfType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _SelfType__NamedElement = new ExecutorFragment(Types._SelfType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _SelfType__Namespace = new ExecutorFragment(Types._SelfType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _SelfType__OclAny = new ExecutorFragment(Types._SelfType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _SelfType__OclElement = new ExecutorFragment(Types._SelfType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _SelfType__ParameterableElement = new ExecutorFragment(Types._SelfType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _SelfType__SelfType = new ExecutorFragment(Types._SelfType, PivotTables.Types._SelfType);
		public static final ExecutorFragment _SelfType__TemplateableElement = new ExecutorFragment(Types._SelfType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _SelfType__Type = new ExecutorFragment(Types._SelfType, PivotTables.Types._Type);
		public static final ExecutorFragment _SelfType__Visitable = new ExecutorFragment(Types._SelfType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _SendSignalAction__Element = new ExecutorFragment(Types._SendSignalAction, PivotTables.Types._Element);
		public static final ExecutorFragment _SendSignalAction__Nameable = new ExecutorFragment(Types._SendSignalAction, PivotTables.Types._Nameable);
		public static final ExecutorFragment _SendSignalAction__NamedElement = new ExecutorFragment(Types._SendSignalAction, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _SendSignalAction__OclAny = new ExecutorFragment(Types._SendSignalAction, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _SendSignalAction__OclElement = new ExecutorFragment(Types._SendSignalAction, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _SendSignalAction__SendSignalAction = new ExecutorFragment(Types._SendSignalAction, PivotTables.Types._SendSignalAction);
		public static final ExecutorFragment _SendSignalAction__Visitable = new ExecutorFragment(Types._SendSignalAction, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _SequenceType__Class = new ExecutorFragment(Types._SequenceType, PivotTables.Types._Class);
		public static final ExecutorFragment _SequenceType__CollectionType = new ExecutorFragment(Types._SequenceType, PivotTables.Types._CollectionType);
		public static final ExecutorFragment _SequenceType__DataType = new ExecutorFragment(Types._SequenceType, PivotTables.Types._DataType);
		public static final ExecutorFragment _SequenceType__Element = new ExecutorFragment(Types._SequenceType, PivotTables.Types._Element);
		public static final ExecutorFragment _SequenceType__Nameable = new ExecutorFragment(Types._SequenceType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _SequenceType__NamedElement = new ExecutorFragment(Types._SequenceType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _SequenceType__Namespace = new ExecutorFragment(Types._SequenceType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _SequenceType__OclAny = new ExecutorFragment(Types._SequenceType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _SequenceType__OclElement = new ExecutorFragment(Types._SequenceType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _SequenceType__ParameterableElement = new ExecutorFragment(Types._SequenceType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _SequenceType__SequenceType = new ExecutorFragment(Types._SequenceType, PivotTables.Types._SequenceType);
		public static final ExecutorFragment _SequenceType__TemplateableElement = new ExecutorFragment(Types._SequenceType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _SequenceType__Type = new ExecutorFragment(Types._SequenceType, PivotTables.Types._Type);
		public static final ExecutorFragment _SequenceType__Visitable = new ExecutorFragment(Types._SequenceType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _SetType__Class = new ExecutorFragment(Types._SetType, PivotTables.Types._Class);
		public static final ExecutorFragment _SetType__CollectionType = new ExecutorFragment(Types._SetType, PivotTables.Types._CollectionType);
		public static final ExecutorFragment _SetType__DataType = new ExecutorFragment(Types._SetType, PivotTables.Types._DataType);
		public static final ExecutorFragment _SetType__Element = new ExecutorFragment(Types._SetType, PivotTables.Types._Element);
		public static final ExecutorFragment _SetType__Nameable = new ExecutorFragment(Types._SetType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _SetType__NamedElement = new ExecutorFragment(Types._SetType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _SetType__Namespace = new ExecutorFragment(Types._SetType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _SetType__OclAny = new ExecutorFragment(Types._SetType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _SetType__OclElement = new ExecutorFragment(Types._SetType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _SetType__ParameterableElement = new ExecutorFragment(Types._SetType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _SetType__SetType = new ExecutorFragment(Types._SetType, PivotTables.Types._SetType);
		public static final ExecutorFragment _SetType__TemplateableElement = new ExecutorFragment(Types._SetType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _SetType__Type = new ExecutorFragment(Types._SetType, PivotTables.Types._Type);
		public static final ExecutorFragment _SetType__Visitable = new ExecutorFragment(Types._SetType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Signal__Element = new ExecutorFragment(Types._Signal, PivotTables.Types._Element);
		public static final ExecutorFragment _Signal__Nameable = new ExecutorFragment(Types._Signal, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Signal__NamedElement = new ExecutorFragment(Types._Signal, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Signal__OclAny = new ExecutorFragment(Types._Signal, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Signal__OclElement = new ExecutorFragment(Types._Signal, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Signal__Signal = new ExecutorFragment(Types._Signal, PivotTables.Types._Signal);
		public static final ExecutorFragment _Signal__Visitable = new ExecutorFragment(Types._Signal, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _State__Element = new ExecutorFragment(Types._State, PivotTables.Types._Element);
		public static final ExecutorFragment _State__Nameable = new ExecutorFragment(Types._State, PivotTables.Types._Nameable);
		public static final ExecutorFragment _State__NamedElement = new ExecutorFragment(Types._State, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _State__OclAny = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _State__OclElement = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _State__State = new ExecutorFragment(Types._State, PivotTables.Types._State);
		public static final ExecutorFragment _State__Visitable = new ExecutorFragment(Types._State, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _StateExp__Element = new ExecutorFragment(Types._StateExp, PivotTables.Types._Element);
		public static final ExecutorFragment _StateExp__Nameable = new ExecutorFragment(Types._StateExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _StateExp__NamedElement = new ExecutorFragment(Types._StateExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _StateExp__OclAny = new ExecutorFragment(Types._StateExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _StateExp__OclElement = new ExecutorFragment(Types._StateExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _StateExp__OclExpression = new ExecutorFragment(Types._StateExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _StateExp__StateExp = new ExecutorFragment(Types._StateExp, PivotTables.Types._StateExp);
		public static final ExecutorFragment _StateExp__TypedElement = new ExecutorFragment(Types._StateExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _StateExp__Visitable = new ExecutorFragment(Types._StateExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _String__String = new ExecutorFragment(Types._String, PivotTables.Types._String);
		
		public static final ExecutorFragment _StringLiteralExp__Element = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _StringLiteralExp__LiteralExp = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _StringLiteralExp__Nameable = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _StringLiteralExp__NamedElement = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _StringLiteralExp__OclAny = new ExecutorFragment(Types._StringLiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _StringLiteralExp__OclElement = new ExecutorFragment(Types._StringLiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _StringLiteralExp__OclExpression = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _StringLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		public static final ExecutorFragment _StringLiteralExp__StringLiteralExp = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._StringLiteralExp);
		public static final ExecutorFragment _StringLiteralExp__TypedElement = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _StringLiteralExp__Visitable = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _TemplateBinding__Element = new ExecutorFragment(Types._TemplateBinding, PivotTables.Types._Element);
		public static final ExecutorFragment _TemplateBinding__OclAny = new ExecutorFragment(Types._TemplateBinding, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TemplateBinding__OclElement = new ExecutorFragment(Types._TemplateBinding, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TemplateBinding__TemplateBinding = new ExecutorFragment(Types._TemplateBinding, PivotTables.Types._TemplateBinding);
		public static final ExecutorFragment _TemplateBinding__Visitable = new ExecutorFragment(Types._TemplateBinding, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _TemplateParameter__Element = new ExecutorFragment(Types._TemplateParameter, PivotTables.Types._Element);
		public static final ExecutorFragment _TemplateParameter__OclAny = new ExecutorFragment(Types._TemplateParameter, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TemplateParameter__OclElement = new ExecutorFragment(Types._TemplateParameter, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TemplateParameter__TemplateParameter = new ExecutorFragment(Types._TemplateParameter, PivotTables.Types._TemplateParameter);
		public static final ExecutorFragment _TemplateParameter__Visitable = new ExecutorFragment(Types._TemplateParameter, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _TemplateParameterSubstitution__Element = new ExecutorFragment(Types._TemplateParameterSubstitution, PivotTables.Types._Element);
		public static final ExecutorFragment _TemplateParameterSubstitution__OclAny = new ExecutorFragment(Types._TemplateParameterSubstitution, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TemplateParameterSubstitution__OclElement = new ExecutorFragment(Types._TemplateParameterSubstitution, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TemplateParameterSubstitution__TemplateParameterSubstitution = new ExecutorFragment(Types._TemplateParameterSubstitution, PivotTables.Types._TemplateParameterSubstitution);
		public static final ExecutorFragment _TemplateParameterSubstitution__Visitable = new ExecutorFragment(Types._TemplateParameterSubstitution, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _TemplateParameterType__Element = new ExecutorFragment(Types._TemplateParameterType, PivotTables.Types._Element);
		public static final ExecutorFragment _TemplateParameterType__Nameable = new ExecutorFragment(Types._TemplateParameterType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _TemplateParameterType__NamedElement = new ExecutorFragment(Types._TemplateParameterType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _TemplateParameterType__OclAny = new ExecutorFragment(Types._TemplateParameterType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TemplateParameterType__OclElement = new ExecutorFragment(Types._TemplateParameterType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TemplateParameterType__ParameterableElement = new ExecutorFragment(Types._TemplateParameterType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _TemplateParameterType__TemplateParameterType = new ExecutorFragment(Types._TemplateParameterType, PivotTables.Types._TemplateParameterType);
		public static final ExecutorFragment _TemplateParameterType__TemplateableElement = new ExecutorFragment(Types._TemplateParameterType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _TemplateParameterType__Type = new ExecutorFragment(Types._TemplateParameterType, PivotTables.Types._Type);
		public static final ExecutorFragment _TemplateParameterType__Visitable = new ExecutorFragment(Types._TemplateParameterType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _TemplateSignature__Element = new ExecutorFragment(Types._TemplateSignature, PivotTables.Types._Element);
		public static final ExecutorFragment _TemplateSignature__OclAny = new ExecutorFragment(Types._TemplateSignature, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TemplateSignature__OclElement = new ExecutorFragment(Types._TemplateSignature, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TemplateSignature__TemplateSignature = new ExecutorFragment(Types._TemplateSignature, PivotTables.Types._TemplateSignature);
		public static final ExecutorFragment _TemplateSignature__Visitable = new ExecutorFragment(Types._TemplateSignature, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _TemplateableElement__Element = new ExecutorFragment(Types._TemplateableElement, PivotTables.Types._Element);
		public static final ExecutorFragment _TemplateableElement__OclAny = new ExecutorFragment(Types._TemplateableElement, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TemplateableElement__OclElement = new ExecutorFragment(Types._TemplateableElement, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TemplateableElement__TemplateableElement = new ExecutorFragment(Types._TemplateableElement, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _TemplateableElement__Visitable = new ExecutorFragment(Types._TemplateableElement, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Throwable__Throwable = new ExecutorFragment(Types._Throwable, PivotTables.Types._Throwable);
		
		public static final ExecutorFragment _TupleLiteralExp__Element = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _TupleLiteralExp__LiteralExp = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _TupleLiteralExp__Nameable = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _TupleLiteralExp__NamedElement = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _TupleLiteralExp__OclAny = new ExecutorFragment(Types._TupleLiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TupleLiteralExp__OclElement = new ExecutorFragment(Types._TupleLiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TupleLiteralExp__OclExpression = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _TupleLiteralExp__TupleLiteralExp = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._TupleLiteralExp);
		public static final ExecutorFragment _TupleLiteralExp__TypedElement = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _TupleLiteralExp__Visitable = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _TupleLiteralPart__Element = new ExecutorFragment(Types._TupleLiteralPart, PivotTables.Types._Element);
		public static final ExecutorFragment _TupleLiteralPart__Nameable = new ExecutorFragment(Types._TupleLiteralPart, PivotTables.Types._Nameable);
		public static final ExecutorFragment _TupleLiteralPart__NamedElement = new ExecutorFragment(Types._TupleLiteralPart, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _TupleLiteralPart__OclAny = new ExecutorFragment(Types._TupleLiteralPart, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TupleLiteralPart__OclElement = new ExecutorFragment(Types._TupleLiteralPart, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TupleLiteralPart__TupleLiteralPart = new ExecutorFragment(Types._TupleLiteralPart, PivotTables.Types._TupleLiteralPart);
		public static final ExecutorFragment _TupleLiteralPart__TypedElement = new ExecutorFragment(Types._TupleLiteralPart, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _TupleLiteralPart__VariableDeclaration = new ExecutorFragment(Types._TupleLiteralPart, PivotTables.Types._VariableDeclaration);
		public static final ExecutorFragment _TupleLiteralPart__Visitable = new ExecutorFragment(Types._TupleLiteralPart, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _TupleType__Class = new ExecutorFragment(Types._TupleType, PivotTables.Types._Class);
		public static final ExecutorFragment _TupleType__DataType = new ExecutorFragment(Types._TupleType, PivotTables.Types._DataType);
		public static final ExecutorFragment _TupleType__Element = new ExecutorFragment(Types._TupleType, PivotTables.Types._Element);
		public static final ExecutorFragment _TupleType__Nameable = new ExecutorFragment(Types._TupleType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _TupleType__NamedElement = new ExecutorFragment(Types._TupleType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _TupleType__Namespace = new ExecutorFragment(Types._TupleType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _TupleType__OclAny = new ExecutorFragment(Types._TupleType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TupleType__OclElement = new ExecutorFragment(Types._TupleType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TupleType__ParameterableElement = new ExecutorFragment(Types._TupleType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _TupleType__TemplateableElement = new ExecutorFragment(Types._TupleType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _TupleType__TupleType = new ExecutorFragment(Types._TupleType, PivotTables.Types._TupleType);
		public static final ExecutorFragment _TupleType__Type = new ExecutorFragment(Types._TupleType, PivotTables.Types._Type);
		public static final ExecutorFragment _TupleType__Visitable = new ExecutorFragment(Types._TupleType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Type__Element = new ExecutorFragment(Types._Type, PivotTables.Types._Element);
		public static final ExecutorFragment _Type__Nameable = new ExecutorFragment(Types._Type, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Type__NamedElement = new ExecutorFragment(Types._Type, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Type__OclAny = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Type__OclElement = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Type__ParameterableElement = new ExecutorFragment(Types._Type, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _Type__TemplateableElement = new ExecutorFragment(Types._Type, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _Type__Type = new ExecutorFragment(Types._Type, PivotTables.Types._Type);
		public static final ExecutorFragment _Type__Visitable = new ExecutorFragment(Types._Type, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _TypeExp__Element = new ExecutorFragment(Types._TypeExp, PivotTables.Types._Element);
		public static final ExecutorFragment _TypeExp__Nameable = new ExecutorFragment(Types._TypeExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _TypeExp__NamedElement = new ExecutorFragment(Types._TypeExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _TypeExp__OclAny = new ExecutorFragment(Types._TypeExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TypeExp__OclElement = new ExecutorFragment(Types._TypeExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TypeExp__OclExpression = new ExecutorFragment(Types._TypeExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _TypeExp__TypeExp = new ExecutorFragment(Types._TypeExp, PivotTables.Types._TypeExp);
		public static final ExecutorFragment _TypeExp__TypedElement = new ExecutorFragment(Types._TypeExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _TypeExp__Visitable = new ExecutorFragment(Types._TypeExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _TypeTemplateParameter__Element = new ExecutorFragment(Types._TypeTemplateParameter, PivotTables.Types._Element);
		public static final ExecutorFragment _TypeTemplateParameter__OclAny = new ExecutorFragment(Types._TypeTemplateParameter, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TypeTemplateParameter__OclElement = new ExecutorFragment(Types._TypeTemplateParameter, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TypeTemplateParameter__TemplateParameter = new ExecutorFragment(Types._TypeTemplateParameter, PivotTables.Types._TemplateParameter);
		public static final ExecutorFragment _TypeTemplateParameter__TypeTemplateParameter = new ExecutorFragment(Types._TypeTemplateParameter, PivotTables.Types._TypeTemplateParameter);
		public static final ExecutorFragment _TypeTemplateParameter__Visitable = new ExecutorFragment(Types._TypeTemplateParameter, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _TypedElement__Element = new ExecutorFragment(Types._TypedElement, PivotTables.Types._Element);
		public static final ExecutorFragment _TypedElement__Nameable = new ExecutorFragment(Types._TypedElement, PivotTables.Types._Nameable);
		public static final ExecutorFragment _TypedElement__NamedElement = new ExecutorFragment(Types._TypedElement, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _TypedElement__OclAny = new ExecutorFragment(Types._TypedElement, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TypedElement__OclElement = new ExecutorFragment(Types._TypedElement, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TypedElement__TypedElement = new ExecutorFragment(Types._TypedElement, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _TypedElement__Visitable = new ExecutorFragment(Types._TypedElement, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _TypedMultiplicityElement__Element = new ExecutorFragment(Types._TypedMultiplicityElement, PivotTables.Types._Element);
		public static final ExecutorFragment _TypedMultiplicityElement__MultiplicityElement = new ExecutorFragment(Types._TypedMultiplicityElement, PivotTables.Types._MultiplicityElement);
		public static final ExecutorFragment _TypedMultiplicityElement__Nameable = new ExecutorFragment(Types._TypedMultiplicityElement, PivotTables.Types._Nameable);
		public static final ExecutorFragment _TypedMultiplicityElement__NamedElement = new ExecutorFragment(Types._TypedMultiplicityElement, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _TypedMultiplicityElement__OclAny = new ExecutorFragment(Types._TypedMultiplicityElement, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _TypedMultiplicityElement__OclElement = new ExecutorFragment(Types._TypedMultiplicityElement, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _TypedMultiplicityElement__TypedElement = new ExecutorFragment(Types._TypedMultiplicityElement, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _TypedMultiplicityElement__TypedMultiplicityElement = new ExecutorFragment(Types._TypedMultiplicityElement, PivotTables.Types._TypedMultiplicityElement);
		public static final ExecutorFragment _TypedMultiplicityElement__Visitable = new ExecutorFragment(Types._TypedMultiplicityElement, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _UnlimitedNatural__UnlimitedNatural = new ExecutorFragment(Types._UnlimitedNatural, PivotTables.Types._UnlimitedNatural);
		
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__Element = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._Element);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__LiteralExp = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._LiteralExp);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__Nameable = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__NamedElement = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__NumericLiteralExp = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._NumericLiteralExp);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__OclAny = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__OclElement = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__OclExpression = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__TypedElement = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._UnlimitedNaturalLiteralExp);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__Visitable = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _UnspecifiedType__Class = new ExecutorFragment(Types._UnspecifiedType, PivotTables.Types._Class);
		public static final ExecutorFragment _UnspecifiedType__Element = new ExecutorFragment(Types._UnspecifiedType, PivotTables.Types._Element);
		public static final ExecutorFragment _UnspecifiedType__Nameable = new ExecutorFragment(Types._UnspecifiedType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _UnspecifiedType__NamedElement = new ExecutorFragment(Types._UnspecifiedType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _UnspecifiedType__Namespace = new ExecutorFragment(Types._UnspecifiedType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _UnspecifiedType__OclAny = new ExecutorFragment(Types._UnspecifiedType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _UnspecifiedType__OclElement = new ExecutorFragment(Types._UnspecifiedType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _UnspecifiedType__ParameterableElement = new ExecutorFragment(Types._UnspecifiedType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _UnspecifiedType__TemplateableElement = new ExecutorFragment(Types._UnspecifiedType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _UnspecifiedType__Type = new ExecutorFragment(Types._UnspecifiedType, PivotTables.Types._Type);
		public static final ExecutorFragment _UnspecifiedType__UnspecifiedType = new ExecutorFragment(Types._UnspecifiedType, PivotTables.Types._UnspecifiedType);
		public static final ExecutorFragment _UnspecifiedType__Visitable = new ExecutorFragment(Types._UnspecifiedType, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _UnspecifiedValueExp__Element = new ExecutorFragment(Types._UnspecifiedValueExp, PivotTables.Types._Element);
		public static final ExecutorFragment _UnspecifiedValueExp__Nameable = new ExecutorFragment(Types._UnspecifiedValueExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _UnspecifiedValueExp__NamedElement = new ExecutorFragment(Types._UnspecifiedValueExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _UnspecifiedValueExp__OclAny = new ExecutorFragment(Types._UnspecifiedValueExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _UnspecifiedValueExp__OclElement = new ExecutorFragment(Types._UnspecifiedValueExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _UnspecifiedValueExp__OclExpression = new ExecutorFragment(Types._UnspecifiedValueExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _UnspecifiedValueExp__TypedElement = new ExecutorFragment(Types._UnspecifiedValueExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _UnspecifiedValueExp__UnspecifiedValueExp = new ExecutorFragment(Types._UnspecifiedValueExp, PivotTables.Types._UnspecifiedValueExp);
		public static final ExecutorFragment _UnspecifiedValueExp__Visitable = new ExecutorFragment(Types._UnspecifiedValueExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _ValueSpecification__Element = new ExecutorFragment(Types._ValueSpecification, PivotTables.Types._Element);
		public static final ExecutorFragment _ValueSpecification__Nameable = new ExecutorFragment(Types._ValueSpecification, PivotTables.Types._Nameable);
		public static final ExecutorFragment _ValueSpecification__NamedElement = new ExecutorFragment(Types._ValueSpecification, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _ValueSpecification__OclAny = new ExecutorFragment(Types._ValueSpecification, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _ValueSpecification__OclElement = new ExecutorFragment(Types._ValueSpecification, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _ValueSpecification__ParameterableElement = new ExecutorFragment(Types._ValueSpecification, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _ValueSpecification__TypedElement = new ExecutorFragment(Types._ValueSpecification, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _ValueSpecification__ValueSpecification = new ExecutorFragment(Types._ValueSpecification, PivotTables.Types._ValueSpecification);
		public static final ExecutorFragment _ValueSpecification__Visitable = new ExecutorFragment(Types._ValueSpecification, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Variable__Element = new ExecutorFragment(Types._Variable, PivotTables.Types._Element);
		public static final ExecutorFragment _Variable__Nameable = new ExecutorFragment(Types._Variable, PivotTables.Types._Nameable);
		public static final ExecutorFragment _Variable__NamedElement = new ExecutorFragment(Types._Variable, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _Variable__OclAny = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Variable__OclElement = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Variable__TypedElement = new ExecutorFragment(Types._Variable, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _Variable__Variable = new ExecutorFragment(Types._Variable, PivotTables.Types._Variable);
		public static final ExecutorFragment _Variable__VariableDeclaration = new ExecutorFragment(Types._Variable, PivotTables.Types._VariableDeclaration);
		public static final ExecutorFragment _Variable__Visitable = new ExecutorFragment(Types._Variable, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _VariableDeclaration__Element = new ExecutorFragment(Types._VariableDeclaration, PivotTables.Types._Element);
		public static final ExecutorFragment _VariableDeclaration__Nameable = new ExecutorFragment(Types._VariableDeclaration, PivotTables.Types._Nameable);
		public static final ExecutorFragment _VariableDeclaration__NamedElement = new ExecutorFragment(Types._VariableDeclaration, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _VariableDeclaration__OclAny = new ExecutorFragment(Types._VariableDeclaration, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _VariableDeclaration__OclElement = new ExecutorFragment(Types._VariableDeclaration, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _VariableDeclaration__TypedElement = new ExecutorFragment(Types._VariableDeclaration, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _VariableDeclaration__VariableDeclaration = new ExecutorFragment(Types._VariableDeclaration, PivotTables.Types._VariableDeclaration);
		public static final ExecutorFragment _VariableDeclaration__Visitable = new ExecutorFragment(Types._VariableDeclaration, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _VariableExp__Element = new ExecutorFragment(Types._VariableExp, PivotTables.Types._Element);
		public static final ExecutorFragment _VariableExp__Nameable = new ExecutorFragment(Types._VariableExp, PivotTables.Types._Nameable);
		public static final ExecutorFragment _VariableExp__NamedElement = new ExecutorFragment(Types._VariableExp, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _VariableExp__OclAny = new ExecutorFragment(Types._VariableExp, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _VariableExp__OclElement = new ExecutorFragment(Types._VariableExp, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _VariableExp__OclExpression = new ExecutorFragment(Types._VariableExp, PivotTables.Types._OclExpression);
		public static final ExecutorFragment _VariableExp__TypedElement = new ExecutorFragment(Types._VariableExp, PivotTables.Types._TypedElement);
		public static final ExecutorFragment _VariableExp__VariableExp = new ExecutorFragment(Types._VariableExp, PivotTables.Types._VariableExp);
		public static final ExecutorFragment _VariableExp__Visitable = new ExecutorFragment(Types._VariableExp, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Visitable__OclAny = new ExecutorFragment(Types._Visitable, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Visitable__OclElement = new ExecutorFragment(Types._Visitable, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Visitable__Visitable = new ExecutorFragment(Types._Visitable, PivotTables.Types._Visitable);
		
		public static final ExecutorFragment _Visitor__OclAny = new ExecutorFragment(Types._Visitor, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Visitor__OclElement = new ExecutorFragment(Types._Visitor, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Visitor__Visitor = new ExecutorFragment(Types._Visitor, PivotTables.Types._Visitor);
		
		public static final ExecutorFragment _VoidType__Class = new ExecutorFragment(Types._VoidType, PivotTables.Types._Class);
		public static final ExecutorFragment _VoidType__Element = new ExecutorFragment(Types._VoidType, PivotTables.Types._Element);
		public static final ExecutorFragment _VoidType__Nameable = new ExecutorFragment(Types._VoidType, PivotTables.Types._Nameable);
		public static final ExecutorFragment _VoidType__NamedElement = new ExecutorFragment(Types._VoidType, PivotTables.Types._NamedElement);
		public static final ExecutorFragment _VoidType__Namespace = new ExecutorFragment(Types._VoidType, PivotTables.Types._Namespace);
		public static final ExecutorFragment _VoidType__OclAny = new ExecutorFragment(Types._VoidType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _VoidType__OclElement = new ExecutorFragment(Types._VoidType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _VoidType__ParameterableElement = new ExecutorFragment(Types._VoidType, PivotTables.Types._ParameterableElement);
		public static final ExecutorFragment _VoidType__TemplateableElement = new ExecutorFragment(Types._VoidType, PivotTables.Types._TemplateableElement);
		public static final ExecutorFragment _VoidType__Type = new ExecutorFragment(Types._VoidType, PivotTables.Types._Type);
		public static final ExecutorFragment _VoidType__Visitable = new ExecutorFragment(Types._VoidType, PivotTables.Types._Visitable);
		public static final ExecutorFragment _VoidType__VoidType = new ExecutorFragment(Types._VoidType, PivotTables.Types._VoidType);
		
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 */
	public static class Operations {
		public static final ExecutorOperation _Boolean___lt__gt_ = new ExecutorOperation("<>",
			Types._Boolean, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Boolean___eq_ = new ExecutorOperation("=",
			Types._Boolean, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Boolean__allInstances = new ExecutorOperation("allInstances",
			Types._Boolean, 2, org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__and = new ExecutorOperation("and",
			Types._Boolean, 3, org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE,
				OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _Boolean__implies = new ExecutorOperation("implies",
			Types._Boolean, 4, org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE,
				OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _Boolean__not = new ExecutorOperation("not",
			Types._Boolean, 5, org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__or = new ExecutorOperation("or",
			Types._Boolean, 6, org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE,
				OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _Boolean__toString = new ExecutorOperation("toString",
			Types._Boolean, 7, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__xor = new ExecutorOperation("xor",
			Types._Boolean, 8, org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE,
				OCLstdlibTables.Types._Boolean);
	
		public static final ExecutorOperation _Class__oclType = new ExecutorOperation("oclType",
			Types._Class, 0, org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
	
		public static final ExecutorOperation _Element__allOwnedElements = new ExecutorOperation("allOwnedElements",
			Types._Element, 0, org.eclipse.ocl.examples.pivot.bodies.ElementBodies._allOwnedElements_body_.INSTANCE);
	
		public static final ExecutorOperation _Enumeration__allInstances = new ExecutorOperation("allInstances",
			Types._Enumeration, 0, org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _Enumeration__oclType = new ExecutorOperation("oclType",
			Types._Enumeration, 1, org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
	
		public static final ExecutorOperation _Integer___mul_ = new ExecutorOperation("*",
			Types._Integer, 0, org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer___add_ = new ExecutorOperation("+",
			Types._Integer, 1, org.eclipse.ocl.examples.library.integer.IntegerPlusOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__0__sub_ = new ExecutorOperation("-",
			Types._Integer, 2, org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
		public static final ExecutorOperation _Integer__1__sub_ = new ExecutorOperation("-",
			Types._Integer, 3, org.eclipse.ocl.examples.library.integer.IntegerMinusOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer___div_ = new ExecutorOperation("/",
			Types._Integer, 4, org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__abs = new ExecutorOperation("abs",
			Types._Integer, 5, org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
		public static final ExecutorOperation _Integer__compareTo = new ExecutorOperation("compareTo",
			Types._Integer, 6, org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__div = new ExecutorOperation("div",
			Types._Integer, 7, org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE,
				OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _Integer__max = new ExecutorOperation("max",
			Types._Integer, 8, org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__min = new ExecutorOperation("min",
			Types._Integer, 9, org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__mod = new ExecutorOperation("mod",
			Types._Integer, 10, org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE,
				OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _Integer__toString = new ExecutorOperation("toString",
			Types._Integer, 11, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _MultiplicityElement__includesCardinality = new ExecutorOperation("includesCardinality",
			Types._MultiplicityElement, 0, null,
				PivotTables.Types._Integer);
		public static final ExecutorOperation _MultiplicityElement__includesMultiplicity = new ExecutorOperation("includesMultiplicity",
			Types._MultiplicityElement, 1, null,
				PivotTables.Types._MultiplicityElement);
		public static final ExecutorOperation _MultiplicityElement__isMultivalued = new ExecutorOperation("isMultivalued",
			Types._MultiplicityElement, 2, null);
		public static final ExecutorOperation _MultiplicityElement__lowerBound = new ExecutorOperation("lowerBound",
			Types._MultiplicityElement, 3, null);
		public static final ExecutorOperation _MultiplicityElement__upperBound = new ExecutorOperation("upperBound",
			Types._MultiplicityElement, 4, null);
	
		public static final ExecutorOperation _ParameterableElement__isCompatibleWith = new ExecutorOperation("isCompatibleWith",
			Types._ParameterableElement, 0, org.eclipse.ocl.examples.pivot.bodies.ParameterableElementBodies._isCompatibleWith_body_.INSTANCE,
				PivotTables.Types._ParameterableElement);
		public static final ExecutorOperation _ParameterableElement__isTemplateParameter = new ExecutorOperation("isTemplateParameter",
			Types._ParameterableElement, 1, null);
	
		public static final ExecutorOperation _Property__isAttribute = new ExecutorOperation("isAttribute",
			Types._Property, 0, org.eclipse.ocl.examples.pivot.bodies.PropertyBodies._isAttribute_body_.INSTANCE,
				PivotTables.Types._Property);
	
		public static final ExecutorOperation _Real___mul_ = new ExecutorOperation("*",
			Types._Real, 0, org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___add_ = new ExecutorOperation("+",
			Types._Real, 1, org.eclipse.ocl.examples.library.real.RealPlusOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__1__sub_ = new ExecutorOperation("-",
			Types._Real, 2, org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
		public static final ExecutorOperation _Real__0__sub_ = new ExecutorOperation("-",
			Types._Real, 3, org.eclipse.ocl.examples.library.real.RealMinusOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___div_ = new ExecutorOperation("/",
			Types._Real, 4, org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___lt_ = new ExecutorOperation("<",
			Types._Real, 5, org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___lt__eq_ = new ExecutorOperation("<=",
			Types._Real, 6, org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___lt__gt_ = new ExecutorOperation("<>",
			Types._Real, 7, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___eq_ = new ExecutorOperation("=",
			Types._Real, 8, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___gt_ = new ExecutorOperation(">",
			Types._Real, 9, org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___gt__eq_ = new ExecutorOperation(">=",
			Types._Real, 10, org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__abs = new ExecutorOperation("abs",
			Types._Real, 11, org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
		public static final ExecutorOperation _Real__compareTo = new ExecutorOperation("compareTo",
			Types._Real, 12, org.eclipse.ocl.examples.library.real.RealCompareToOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__floor = new ExecutorOperation("floor",
			Types._Real, 13, org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
		public static final ExecutorOperation _Real__max = new ExecutorOperation("max",
			Types._Real, 14, org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__min = new ExecutorOperation("min",
			Types._Real, 15, org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__round = new ExecutorOperation("round",
			Types._Real, 16, org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
		public static final ExecutorOperation _Real__toString = new ExecutorOperation("toString",
			Types._Real, 17, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _String___add_ = new ExecutorOperation("+",
			Types._String, 0, org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String___lt_ = new ExecutorOperation("<",
			Types._String, 1, org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___lt__eq_ = new ExecutorOperation("<=",
			Types._String, 2, org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___lt__gt_ = new ExecutorOperation("<>",
			Types._String, 3, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___eq_ = new ExecutorOperation("=",
			Types._String, 4, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___gt_ = new ExecutorOperation(">",
			Types._String, 5, org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___gt__eq_ = new ExecutorOperation(">=",
			Types._String, 6, org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String__at = new ExecutorOperation("at",
			Types._String, 7, org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE,
				OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _String__characters = new ExecutorOperation("characters",
			Types._String, 8, org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
		public static final ExecutorOperation _String__compareTo = new ExecutorOperation("compareTo",
			Types._String, 9, org.eclipse.ocl.examples.library.string.StringCompareToOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String__concat = new ExecutorOperation("concat",
			Types._String, 10, org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__equalsIgnoreCase = new ExecutorOperation("equalsIgnoreCase",
			Types._String, 11, org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__indexOf = new ExecutorOperation("indexOf",
			Types._String, 12, org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__size = new ExecutorOperation("size",
			Types._String, 13, org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
		public static final ExecutorOperation _String__substring = new ExecutorOperation("substring",
			Types._String, 14, org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE,
				OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _String__toBoolean = new ExecutorOperation("toBoolean",
			Types._String, 15, org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
		public static final ExecutorOperation _String__toInteger = new ExecutorOperation("toInteger",
			Types._String, 16, org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
		public static final ExecutorOperation _String__toLower = new ExecutorOperation("toLower",
			Types._String, 17, org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toLowerCase = new ExecutorOperation("toLowerCase",
			Types._String, 18, org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toReal = new ExecutorOperation("toReal",
			Types._String, 19, org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
		public static final ExecutorOperation _String__toString = new ExecutorOperation("toString",
			Types._String, 20, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final ExecutorOperation _String__toUpper = new ExecutorOperation("toUpper",
			Types._String, 21, org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toUpperCase = new ExecutorOperation("toUpperCase",
			Types._String, 22, org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
	
		public static final ExecutorOperation _TemplateableElement__isTemplate = new ExecutorOperation("isTemplate",
			Types._TemplateableElement, 0, null);
		public static final ExecutorOperation _TemplateableElement__parameterableElements = new ExecutorOperation("parameterableElements",
			Types._TemplateableElement, 1, null);
	
		public static final ExecutorOperation _TypedMultiplicityElement__CompatibleBody = new ExecutorOperation("CompatibleBody",
			Types._TypedMultiplicityElement, 0, org.eclipse.ocl.examples.pivot.bodies.TypedMultiplicityElementBodies._CompatibleBody_body_.INSTANCE,
				PivotTables.Types._ValueSpecification);
		public static final ExecutorOperation _TypedMultiplicityElement__makeParameter = new ExecutorOperation("makeParameter",
			Types._TypedMultiplicityElement, 1, org.eclipse.ocl.examples.pivot.bodies.TypedMultiplicityElementBodies._makeParameter_body_.INSTANCE);
	
		public static final ExecutorTypeParameter __UnlimitedNatural__oclAsType_TT = new ExecutorTypeParameter("TT");
		public static final ExecutorOperation _UnlimitedNatural__oclAsType = new ExecutorOperation("oclAsType",
			Types._UnlimitedNatural, 0, org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation.INSTANCE,
				new ExecutorSpecializedType("AnyClassifier", OCLstdlibTables.Operations.__UnlimitedNatural__oclAsType_TT));
	
		public static final ExecutorOperation _ValueSpecification__booleanValue = new ExecutorOperation("booleanValue",
			Types._ValueSpecification, 0, null);
		public static final ExecutorOperation _ValueSpecification__integerValue = new ExecutorOperation("integerValue",
			Types._ValueSpecification, 1, null);
		public static final ExecutorOperation _ValueSpecification__isComputable = new ExecutorOperation("isComputable",
			Types._ValueSpecification, 2, null);
		public static final ExecutorOperation _ValueSpecification__isNull = new ExecutorOperation("isNull",
			Types._ValueSpecification, 3, null);
		public static final ExecutorOperation _ValueSpecification__stringValue = new ExecutorOperation("stringValue",
			Types._ValueSpecification, 4, null);
		public static final ExecutorOperation _ValueSpecification__unlimitedValue = new ExecutorOperation("unlimitedValue",
			Types._ValueSpecification, 5, null);
	}

	/**
	 *	The property descriptors for each property of each type.
	 */
	public static class Properties {
		public static final ExecutorProperty _Annotation__NamedElement = new ExecutorProperty("NamedElement", Types._Annotation, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.NAMED_ELEMENT__OWNED_ANNOTATION));
		public static final ExecutorProperty _Annotation__ownedContent = new ExecutorProperty("ownedContent", Types._Annotation, 1, new EcoreLibraryProperty(PivotPackage.Literals.ANNOTATION__OWNED_CONTENT));
		public static final ExecutorProperty _Annotation__ownedDetail = new ExecutorProperty("ownedDetail", Types._Annotation, 2, new EcoreLibraryProperty(PivotPackage.Literals.ANNOTATION__OWNED_DETAIL));
		public static final ExecutorProperty _Annotation__reference = new ExecutorProperty("reference", Types._Annotation, 3, new EcoreLibraryProperty(PivotPackage.Literals.ANNOTATION__REFERENCE));
	
		public static final ExecutorProperty _AssociationClass__AssociationClassCallExp = new ExecutorProperty("AssociationClassCallExp", Types._AssociationClass, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS));
		public static final ExecutorProperty _AssociationClass__unownedAttribute = new ExecutorProperty("unownedAttribute", Types._AssociationClass, 1, new EcoreLibraryProperty(PivotPackage.Literals.ASSOCIATION_CLASS__UNOWNED_ATTRIBUTE));
	
		public static final ExecutorProperty _AssociationClassCallExp__referredAssociationClass = new ExecutorProperty("referredAssociationClass", Types._AssociationClassCallExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS));
	
		public static final ExecutorProperty _BooleanLiteralExp__booleanSymbol = new ExecutorProperty("booleanSymbol", Types._BooleanLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL));
	
		public static final ExecutorProperty _CallExp__implicit = new ExecutorProperty("implicit", Types._CallExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.CALL_EXP__IMPLICIT));
		public static final ExecutorProperty _CallExp__source = new ExecutorProperty("source", Types._CallExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.CALL_EXP__SOURCE));
	
		public static final ExecutorProperty _CallOperationAction__MessageExp = new ExecutorProperty("MessageExp", Types._CallOperationAction, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_EXP__CALLED_OPERATION));
		public static final ExecutorProperty _CallOperationAction__operation = new ExecutorProperty("operation", Types._CallOperationAction, 1, new EcoreLibraryProperty(PivotPackage.Literals.CALL_OPERATION_ACTION__OPERATION));
	
		public static final ExecutorProperty _Class__isAbstract = new ExecutorProperty("isAbstract", Types._Class, 0, new EcoreLibraryProperty(PivotPackage.Literals.CLASS__IS_ABSTRACT));
		public static final ExecutorProperty _Class__isInterface = new ExecutorProperty("isInterface", Types._Class, 1, new EcoreLibraryProperty(PivotPackage.Literals.CLASS__IS_INTERFACE));
	
		public static final ExecutorProperty _ClassifierType__instanceType = new ExecutorProperty("instanceType", Types._ClassifierType, 0, new EcoreLibraryProperty(PivotPackage.Literals.CLASSIFIER_TYPE__INSTANCE_TYPE));
	
		public static final ExecutorProperty _CollectionItem__item = new ExecutorProperty("item", Types._CollectionItem, 0, new EcoreLibraryProperty(PivotPackage.Literals.COLLECTION_ITEM__ITEM));
	
		public static final ExecutorProperty _CollectionLiteralExp__kind = new ExecutorProperty("kind", Types._CollectionLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.COLLECTION_LITERAL_EXP__KIND));
		public static final ExecutorProperty _CollectionLiteralExp__part = new ExecutorProperty("part", Types._CollectionLiteralExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.COLLECTION_LITERAL_EXP__PART));
	
		public static final ExecutorProperty _CollectionLiteralPart__CollectionLiteralExp = new ExecutorProperty("CollectionLiteralExp", Types._CollectionLiteralPart, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COLLECTION_LITERAL_EXP__PART));
	
		public static final ExecutorProperty _CollectionRange__first = new ExecutorProperty("first", Types._CollectionRange, 0, new EcoreLibraryProperty(PivotPackage.Literals.COLLECTION_RANGE__FIRST));
		public static final ExecutorProperty _CollectionRange__last = new ExecutorProperty("last", Types._CollectionRange, 1, new EcoreLibraryProperty(PivotPackage.Literals.COLLECTION_RANGE__LAST));
	
		public static final ExecutorProperty _CollectionType__elementType = new ExecutorProperty("elementType", Types._CollectionType, 0, new EcoreLibraryProperty(PivotPackage.Literals.COLLECTION_TYPE__ELEMENT_TYPE));
	
		public static final ExecutorProperty _Comment__Element = new ExecutorProperty("Element", Types._Comment, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ELEMENT__OWNED_COMMENT));
		public static final ExecutorProperty _Comment__annotatedElement = new ExecutorProperty("annotatedElement", Types._Comment, 1, new EcoreLibraryProperty(PivotPackage.Literals.COMMENT__ANNOTATED_ELEMENT));
		public static final ExecutorProperty _Comment__body = new ExecutorProperty("body", Types._Comment, 2, new EcoreLibraryProperty(PivotPackage.Literals.COMMENT__BODY));
	
		public static final ExecutorProperty _Constraint__constrainedElement = new ExecutorProperty("constrainedElement", Types._Constraint, 0, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRAINT__CONSTRAINED_ELEMENT));
		public static final ExecutorProperty _Constraint__context = new ExecutorProperty("context", Types._Constraint, 1, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRAINT__CONTEXT));
		public static final ExecutorProperty _Constraint__isCallable = new ExecutorProperty("isCallable", Types._Constraint, 2, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRAINT__IS_CALLABLE));
		public static final ExecutorProperty _Constraint__specification = new ExecutorProperty("specification", Types._Constraint, 3, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRAINT__SPECIFICATION));
		public static final ExecutorProperty _Constraint__stereotype = new ExecutorProperty("stereotype", Types._Constraint, 4, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRAINT__STEREOTYPE));
	
		public static final ExecutorProperty _ConstructorExp__part = new ExecutorProperty("part", Types._ConstructorExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRUCTOR_EXP__PART));
	
		public static final ExecutorProperty _ConstructorPart__ConstructorExp = new ExecutorProperty("ConstructorExp", Types._ConstructorPart, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONSTRUCTOR_EXP__PART));
		public static final ExecutorProperty _ConstructorPart__initExpression = new ExecutorProperty("initExpression", Types._ConstructorPart, 1, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRUCTOR_PART__INIT_EXPRESSION));
		public static final ExecutorProperty _ConstructorPart__referredProperty = new ExecutorProperty("referredProperty", Types._ConstructorPart, 2, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRUCTOR_PART__REFERRED_PROPERTY));
	
		public static final ExecutorProperty _DataType__behavioralType = new ExecutorProperty("behavioralType", Types._DataType, 0, new EcoreLibraryProperty(PivotPackage.Literals.DATA_TYPE__BEHAVIORAL_TYPE));
		public static final ExecutorProperty _DataType__isSerializable = new ExecutorProperty("isSerializable", Types._DataType, 1, new EcoreLibraryProperty(PivotPackage.Literals.DATA_TYPE__IS_SERIALIZABLE));
	
		public static final ExecutorProperty _Detail__Annotation = new ExecutorProperty("Annotation", Types._Detail, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ANNOTATION__OWNED_DETAIL));
		public static final ExecutorProperty _Detail__value = new ExecutorProperty("value", Types._Detail, 1, new EcoreLibraryProperty(PivotPackage.Literals.DETAIL__VALUE));
	
		public static final ExecutorProperty _Element__Comment = new ExecutorProperty("Comment", Types._Element, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COMMENT__ANNOTATED_ELEMENT));
		public static final ExecutorProperty _Element__Constraint = new ExecutorProperty("Constraint", Types._Element, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONSTRAINT__CONSTRAINED_ELEMENT));
		public static final ExecutorProperty _Element__ownedComment = new ExecutorProperty("ownedComment", Types._Element, 2, new EcoreLibraryProperty(PivotPackage.Literals.ELEMENT__OWNED_COMMENT));
	
		public static final ExecutorProperty _EnumLiteralExp__referredEnumLiteral = new ExecutorProperty("referredEnumLiteral", Types._EnumLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL));
	
		public static final ExecutorProperty _Enumeration__ownedLiteral = new ExecutorProperty("ownedLiteral", Types._Enumeration, 0, new EcoreLibraryProperty(PivotPackage.Literals.ENUMERATION__OWNED_LITERAL));
	
		public static final ExecutorProperty _EnumerationLiteral__EnumLiteralExp = new ExecutorProperty("EnumLiteralExp", Types._EnumerationLiteral, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL));
		public static final ExecutorProperty _EnumerationLiteral__enumeration = new ExecutorProperty("enumeration", Types._EnumerationLiteral, 1, new EcoreLibraryProperty(PivotPackage.Literals.ENUMERATION_LITERAL__ENUMERATION));
		public static final ExecutorProperty _EnumerationLiteral__value = new ExecutorProperty("value", Types._EnumerationLiteral, 2, new EcoreLibraryProperty(PivotPackage.Literals.ENUMERATION_LITERAL__VALUE));
	
		public static final ExecutorProperty _ExpressionInOcl__bodyExpression = new ExecutorProperty("bodyExpression", Types._ExpressionInOcl, 0, new EcoreLibraryProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION));
		public static final ExecutorProperty _ExpressionInOcl__contextVariable = new ExecutorProperty("contextVariable", Types._ExpressionInOcl, 1, new EcoreLibraryProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__CONTEXT_VARIABLE));
		public static final ExecutorProperty _ExpressionInOcl__messageExpression = new ExecutorProperty("messageExpression", Types._ExpressionInOcl, 2, new EcoreLibraryProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__MESSAGE_EXPRESSION));
		public static final ExecutorProperty _ExpressionInOcl__parameterVariable = new ExecutorProperty("parameterVariable", Types._ExpressionInOcl, 3, new EcoreLibraryProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__PARAMETER_VARIABLE));
		public static final ExecutorProperty _ExpressionInOcl__resultVariable = new ExecutorProperty("resultVariable", Types._ExpressionInOcl, 4, new EcoreLibraryProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__RESULT_VARIABLE));
	
		public static final ExecutorProperty _Feature__implementation = new ExecutorProperty("implementation", Types._Feature, 0, new EcoreLibraryProperty(PivotPackage.Literals.FEATURE__IMPLEMENTATION));
		public static final ExecutorProperty _Feature__implementationClass = new ExecutorProperty("implementationClass", Types._Feature, 1, new EcoreLibraryProperty(PivotPackage.Literals.FEATURE__IMPLEMENTATION_CLASS));
	
		public static final ExecutorProperty _FeatureCallExp__isPre = new ExecutorProperty("isPre", Types._FeatureCallExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.FEATURE_CALL_EXP__IS_PRE));
	
		public static final ExecutorProperty _IfExp__condition = new ExecutorProperty("condition", Types._IfExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.IF_EXP__CONDITION));
		public static final ExecutorProperty _IfExp__elseExpression = new ExecutorProperty("elseExpression", Types._IfExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.IF_EXP__ELSE_EXPRESSION));
		public static final ExecutorProperty _IfExp__thenExpression = new ExecutorProperty("thenExpression", Types._IfExp, 2, new EcoreLibraryProperty(PivotPackage.Literals.IF_EXP__THEN_EXPRESSION));
	
		public static final ExecutorProperty _IntegerLiteralExp__integerSymbol = new ExecutorProperty("integerSymbol", Types._IntegerLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.INTEGER_LITERAL_EXP__INTEGER_SYMBOL));
	
		public static final ExecutorProperty _IterateExp__result = new ExecutorProperty("result", Types._IterateExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.ITERATE_EXP__RESULT));
	
		public static final ExecutorProperty _Iteration__LoopExp = new ExecutorProperty("LoopExp", Types._Iteration, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LOOP_EXP__REFERRED_ITERATION));
		public static final ExecutorProperty _Iteration__ownedAccumulator = new ExecutorProperty("ownedAccumulator", Types._Iteration, 1, new EcoreLibraryProperty(PivotPackage.Literals.ITERATION__OWNED_ACCUMULATOR));
		public static final ExecutorProperty _Iteration__ownedIterator = new ExecutorProperty("ownedIterator", Types._Iteration, 2, new EcoreLibraryProperty(PivotPackage.Literals.ITERATION__OWNED_ITERATOR));
	
		public static final ExecutorProperty _LambdaType__contextType = new ExecutorProperty("contextType", Types._LambdaType, 0, new EcoreLibraryProperty(PivotPackage.Literals.LAMBDA_TYPE__CONTEXT_TYPE));
		public static final ExecutorProperty _LambdaType__parameterType = new ExecutorProperty("parameterType", Types._LambdaType, 1, new EcoreLibraryProperty(PivotPackage.Literals.LAMBDA_TYPE__PARAMETER_TYPE));
		public static final ExecutorProperty _LambdaType__resultType = new ExecutorProperty("resultType", Types._LambdaType, 2, new EcoreLibraryProperty(PivotPackage.Literals.LAMBDA_TYPE__RESULT_TYPE));
	
		public static final ExecutorProperty _LetExp__in = new ExecutorProperty("in", Types._LetExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.LET_EXP__IN));
		public static final ExecutorProperty _LetExp__variable = new ExecutorProperty("variable", Types._LetExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.LET_EXP__VARIABLE));
	
		public static final ExecutorProperty _LoopExp__body = new ExecutorProperty("body", Types._LoopExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.LOOP_EXP__BODY));
		public static final ExecutorProperty _LoopExp__iterator = new ExecutorProperty("iterator", Types._LoopExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.LOOP_EXP__ITERATOR));
		public static final ExecutorProperty _LoopExp__referredIteration = new ExecutorProperty("referredIteration", Types._LoopExp, 2, new EcoreLibraryProperty(PivotPackage.Literals.LOOP_EXP__REFERRED_ITERATION));
	
		public static final ExecutorProperty _MessageExp__argument = new ExecutorProperty("argument", Types._MessageExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.MESSAGE_EXP__ARGUMENT));
		public static final ExecutorProperty _MessageExp__calledOperation = new ExecutorProperty("calledOperation", Types._MessageExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.MESSAGE_EXP__CALLED_OPERATION));
		public static final ExecutorProperty _MessageExp__sentSignal = new ExecutorProperty("sentSignal", Types._MessageExp, 2, new EcoreLibraryProperty(PivotPackage.Literals.MESSAGE_EXP__SENT_SIGNAL));
		public static final ExecutorProperty _MessageExp__target = new ExecutorProperty("target", Types._MessageExp, 3, new EcoreLibraryProperty(PivotPackage.Literals.MESSAGE_EXP__TARGET));
	
		public static final ExecutorProperty _MessageType__referredOperation = new ExecutorProperty("referredOperation", Types._MessageType, 0, new EcoreLibraryProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_OPERATION));
		public static final ExecutorProperty _MessageType__referredSignal = new ExecutorProperty("referredSignal", Types._MessageType, 1, new EcoreLibraryProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_SIGNAL));
	
		public static final ExecutorProperty _MultiplicityElement__isOrdered = new ExecutorProperty("isOrdered", Types._MultiplicityElement, 0, new EcoreLibraryProperty(PivotPackage.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED));
		public static final ExecutorProperty _MultiplicityElement__isUnique = new ExecutorProperty("isUnique", Types._MultiplicityElement, 1, new EcoreLibraryProperty(PivotPackage.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE));
		public static final ExecutorProperty _MultiplicityElement__lower = new ExecutorProperty("lower", Types._MultiplicityElement, 2, new EcoreLibraryProperty(PivotPackage.Literals.MULTIPLICITY_ELEMENT__LOWER));
		public static final ExecutorProperty _MultiplicityElement__upper = new ExecutorProperty("upper", Types._MultiplicityElement, 3, new EcoreLibraryProperty(PivotPackage.Literals.MULTIPLICITY_ELEMENT__UPPER));
	
		public static final ExecutorProperty _NamedElement__isStatic = new ExecutorProperty("isStatic", Types._NamedElement, 0, new EcoreLibraryProperty(PivotPackage.Literals.NAMED_ELEMENT__IS_STATIC));
		public static final ExecutorProperty _NamedElement__name = new ExecutorProperty("name", Types._NamedElement, 1, new EcoreLibraryProperty(PivotPackage.Literals.NAMED_ELEMENT__NAME));
		public static final ExecutorProperty _NamedElement__ownedAnnotation = new ExecutorProperty("ownedAnnotation", Types._NamedElement, 2, new EcoreLibraryProperty(PivotPackage.Literals.NAMED_ELEMENT__OWNED_ANNOTATION));
		public static final ExecutorProperty _NamedElement__ownedRule = new ExecutorProperty("ownedRule", Types._NamedElement, 3, new EcoreLibraryProperty(PivotPackage.Literals.NAMED_ELEMENT__OWNED_RULE));
	
		public static final ExecutorProperty _NavigationCallExp__navigationSource = new ExecutorProperty("navigationSource", Types._NavigationCallExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__NAVIGATION_SOURCE));
		public static final ExecutorProperty _NavigationCallExp__qualifier = new ExecutorProperty("qualifier", Types._NavigationCallExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__QUALIFIER));
	
		public static final ExecutorProperty _OclExpression__CallExp = new ExecutorProperty("CallExp", Types._OclExpression, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CALL_EXP__SOURCE));
		public static final ExecutorProperty _OclExpression__CollectionItem = new ExecutorProperty("CollectionItem", Types._OclExpression, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COLLECTION_ITEM__ITEM));
		public static final ExecutorProperty _OclExpression__ConstructorPart = new ExecutorProperty("ConstructorPart", Types._OclExpression, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONSTRUCTOR_PART__INIT_EXPRESSION));
		public static final ExecutorProperty _OclExpression__LetExp = new ExecutorProperty("LetExp", Types._OclExpression, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LET_EXP__IN));
		public static final ExecutorProperty _OclExpression__LoopExp = new ExecutorProperty("LoopExp", Types._OclExpression, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LOOP_EXP__BODY));
		public static final ExecutorProperty _OclExpression__NavigationCallExp = new ExecutorProperty("NavigationCallExp", Types._OclExpression, 5, new EcoreLibraryOppositeProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__QUALIFIER));
		public static final ExecutorProperty _OclExpression__OperationCallExp = new ExecutorProperty("OperationCallExp", Types._OclExpression, 6, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT));
		public static final ExecutorProperty _OclExpression__TupleLiteralPart = new ExecutorProperty("TupleLiteralPart", Types._OclExpression, 7, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TUPLE_LITERAL_PART__INIT_EXPRESSION));
		public static final ExecutorProperty _OclExpression__Variable = new ExecutorProperty("Variable", Types._OclExpression, 8, new EcoreLibraryOppositeProperty(PivotPackage.Literals.VARIABLE__INIT_EXPRESSION));
	
		public static final ExecutorProperty _OpaqueExpression__body = new ExecutorProperty("body", Types._OpaqueExpression, 0, new EcoreLibraryProperty(PivotPackage.Literals.OPAQUE_EXPRESSION__BODY));
		public static final ExecutorProperty _OpaqueExpression__language = new ExecutorProperty("language", Types._OpaqueExpression, 1, new EcoreLibraryProperty(PivotPackage.Literals.OPAQUE_EXPRESSION__LANGUAGE));
		public static final ExecutorProperty _OpaqueExpression__message = new ExecutorProperty("message", Types._OpaqueExpression, 2, new EcoreLibraryProperty(PivotPackage.Literals.OPAQUE_EXPRESSION__MESSAGE));
		public static final ExecutorProperty _OpaqueExpression__valueExpression = new ExecutorProperty("valueExpression", Types._OpaqueExpression, 3, new EcoreLibraryProperty(PivotPackage.Literals.OPAQUE_EXPRESSION__VALUE_EXPRESSION));
	
		public static final ExecutorProperty _Operation__CallOperationAction = new ExecutorProperty("CallOperationAction", Types._Operation, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CALL_OPERATION_ACTION__OPERATION));
		public static final ExecutorProperty _Operation__MessageType = new ExecutorProperty("MessageType", Types._Operation, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_OPERATION));
		public static final ExecutorProperty _Operation__OperationCallExp = new ExecutorProperty("OperationCallExp", Types._Operation, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION_CALL_EXP__REFERRED_OPERATION));
		public static final ExecutorProperty _Operation__class = new ExecutorProperty("class", Types._Operation, 3, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION__CLASS));
		public static final ExecutorProperty _Operation__ownedParameter = new ExecutorProperty("ownedParameter", Types._Operation, 4, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION__OWNED_PARAMETER));
		public static final ExecutorProperty _Operation__owningType = new ExecutorProperty("owningType", Types._Operation, 5, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION__OWNING_TYPE));
		public static final ExecutorProperty _Operation__precedence = new ExecutorProperty("precedence", Types._Operation, 6, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION__PRECEDENCE));
		public static final ExecutorProperty _Operation__raisedException = new ExecutorProperty("raisedException", Types._Operation, 7, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION__RAISED_EXCEPTION));
	
		public static final ExecutorProperty _OperationCallExp__argument = new ExecutorProperty("argument", Types._OperationCallExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT));
		public static final ExecutorProperty _OperationCallExp__referredOperation = new ExecutorProperty("referredOperation", Types._OperationCallExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION_CALL_EXP__REFERRED_OPERATION));
	
		public static final ExecutorProperty _Package__nestedPackage = new ExecutorProperty("nestedPackage", Types._Package, 0, new EcoreLibraryProperty(PivotPackage.Literals.PACKAGE__NESTED_PACKAGE));
		public static final ExecutorProperty _Package__nestingPackage = new ExecutorProperty("nestingPackage", Types._Package, 1, new EcoreLibraryProperty(PivotPackage.Literals.PACKAGE__NESTING_PACKAGE));
		public static final ExecutorProperty _Package__nsPrefix = new ExecutorProperty("nsPrefix", Types._Package, 2, new EcoreLibraryProperty(PivotPackage.Literals.PACKAGE__NS_PREFIX));
		public static final ExecutorProperty _Package__nsURI = new ExecutorProperty("nsURI", Types._Package, 3, new EcoreLibraryProperty(PivotPackage.Literals.PACKAGE__NS_URI));
		public static final ExecutorProperty _Package__ownedPrecedence = new ExecutorProperty("ownedPrecedence", Types._Package, 4, new EcoreLibraryProperty(PivotPackage.Literals.PACKAGE__OWNED_PRECEDENCE));
		public static final ExecutorProperty _Package__ownedType = new ExecutorProperty("ownedType", Types._Package, 5, new EcoreLibraryProperty(PivotPackage.Literals.PACKAGE__OWNED_TYPE));
	
		public static final ExecutorProperty _Parameter__Variable = new ExecutorProperty("Variable", Types._Parameter, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.VARIABLE__REPRESENTED_PARAMETER));
		public static final ExecutorProperty _Parameter__operation = new ExecutorProperty("operation", Types._Parameter, 1, new EcoreLibraryProperty(PivotPackage.Literals.PARAMETER__OPERATION));
	
		public static final ExecutorProperty _ParameterableElement__owningTemplateParameter = new ExecutorProperty("owningTemplateParameter", Types._ParameterableElement, 0, new EcoreLibraryProperty(PivotPackage.Literals.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER));
		public static final ExecutorProperty _ParameterableElement__templateParameter = new ExecutorProperty("templateParameter", Types._ParameterableElement, 1, new EcoreLibraryProperty(PivotPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER));
	
		public static final ExecutorProperty _Precedence__Operation = new ExecutorProperty("Operation", Types._Precedence, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION__PRECEDENCE));
		public static final ExecutorProperty _Precedence__Package = new ExecutorProperty("Package", Types._Precedence, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PACKAGE__OWNED_PRECEDENCE));
		public static final ExecutorProperty _Precedence__associativity = new ExecutorProperty("associativity", Types._Precedence, 2, new EcoreLibraryProperty(PivotPackage.Literals.PRECEDENCE__ASSOCIATIVITY));
		public static final ExecutorProperty _Precedence__order = new ExecutorProperty("order", Types._Precedence, 3, new EcoreLibraryProperty(PivotPackage.Literals.PRECEDENCE__ORDER));
	
		public static final ExecutorProperty _Property__ConstructorPart = new ExecutorProperty("ConstructorPart", Types._Property, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONSTRUCTOR_PART__REFERRED_PROPERTY));
		public static final ExecutorProperty _Property__NavigationCallExp = new ExecutorProperty("NavigationCallExp", Types._Property, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__NAVIGATION_SOURCE));
		public static final ExecutorProperty _Property__PropertyCallExp = new ExecutorProperty("PropertyCallExp", Types._Property, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PROPERTY_CALL_EXP__REFERRED_PROPERTY));
		public static final ExecutorProperty _Property__association = new ExecutorProperty("association", Types._Property, 3, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__ASSOCIATION));
		public static final ExecutorProperty _Property__class = new ExecutorProperty("class", Types._Property, 4, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__CLASS));
		public static final ExecutorProperty _Property__default = new ExecutorProperty("default", Types._Property, 5, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__DEFAULT));
		public static final ExecutorProperty _Property__implicit = new ExecutorProperty("implicit", Types._Property, 6, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IMPLICIT));
		public static final ExecutorProperty _Property__isComposite = new ExecutorProperty("isComposite", Types._Property, 7, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_COMPOSITE));
		public static final ExecutorProperty _Property__isDerived = new ExecutorProperty("isDerived", Types._Property, 8, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_DERIVED));
		public static final ExecutorProperty _Property__isID = new ExecutorProperty("isID", Types._Property, 9, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_ID));
		public static final ExecutorProperty _Property__isReadOnly = new ExecutorProperty("isReadOnly", Types._Property, 10, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_READ_ONLY));
		public static final ExecutorProperty _Property__isResolveProxies = new ExecutorProperty("isResolveProxies", Types._Property, 11, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_RESOLVE_PROXIES));
		public static final ExecutorProperty _Property__isTransient = new ExecutorProperty("isTransient", Types._Property, 12, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_TRANSIENT));
		public static final ExecutorProperty _Property__isUnsettable = new ExecutorProperty("isUnsettable", Types._Property, 13, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_UNSETTABLE));
		public static final ExecutorProperty _Property__isVolatile = new ExecutorProperty("isVolatile", Types._Property, 14, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_VOLATILE));
		public static final ExecutorProperty _Property__keys = new ExecutorProperty("keys", Types._Property, 15, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__KEYS));
		public static final ExecutorProperty _Property__opposite = new ExecutorProperty("opposite", Types._Property, 16, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__OPPOSITE));
		public static final ExecutorProperty _Property__owningType = new ExecutorProperty("owningType", Types._Property, 17, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__OWNING_TYPE));
	
		public static final ExecutorProperty _PropertyCallExp__referredProperty = new ExecutorProperty("referredProperty", Types._PropertyCallExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY_CALL_EXP__REFERRED_PROPERTY));
	
		public static final ExecutorProperty _RealLiteralExp__realSymbol = new ExecutorProperty("realSymbol", Types._RealLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.REAL_LITERAL_EXP__REAL_SYMBOL));
	
		public static final ExecutorProperty _SendSignalAction__MessageExp = new ExecutorProperty("MessageExp", Types._SendSignalAction, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_EXP__SENT_SIGNAL));
		public static final ExecutorProperty _SendSignalAction__signal = new ExecutorProperty("signal", Types._SendSignalAction, 1, new EcoreLibraryProperty(PivotPackage.Literals.SEND_SIGNAL_ACTION__SIGNAL));
	
		public static final ExecutorProperty _Signal__MessageType = new ExecutorProperty("MessageType", Types._Signal, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_SIGNAL));
		public static final ExecutorProperty _Signal__SendSignalAction = new ExecutorProperty("SendSignalAction", Types._Signal, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.SEND_SIGNAL_ACTION__SIGNAL));
	
		public static final ExecutorProperty _State__StateExp = new ExecutorProperty("StateExp", Types._State, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.STATE_EXP__REFERRED_STATE));
	
		public static final ExecutorProperty _StateExp__referredState = new ExecutorProperty("referredState", Types._StateExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.STATE_EXP__REFERRED_STATE));
	
		public static final ExecutorProperty _StringLiteralExp__stringSymbol = new ExecutorProperty("stringSymbol", Types._StringLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.STRING_LITERAL_EXP__STRING_SYMBOL));
	
		public static final ExecutorProperty _TemplateBinding__boundElement = new ExecutorProperty("boundElement", Types._TemplateBinding, 0, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_BINDING__BOUND_ELEMENT));
		public static final ExecutorProperty _TemplateBinding__parameterSubstitution = new ExecutorProperty("parameterSubstitution", Types._TemplateBinding, 1, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION));
		public static final ExecutorProperty _TemplateBinding__signature = new ExecutorProperty("signature", Types._TemplateBinding, 2, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_BINDING__SIGNATURE));
	
		public static final ExecutorProperty _TemplateParameter__TemplateParameterSubstitution = new ExecutorProperty("TemplateParameterSubstitution", Types._TemplateParameter, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL));
		public static final ExecutorProperty _TemplateParameter__TemplateSignature = new ExecutorProperty("TemplateSignature", Types._TemplateParameter, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TEMPLATE_SIGNATURE__PARAMETER));
		public static final ExecutorProperty _TemplateParameter__default = new ExecutorProperty("default", Types._TemplateParameter, 2, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__DEFAULT));
		public static final ExecutorProperty _TemplateParameter__ownedDefault = new ExecutorProperty("ownedDefault", Types._TemplateParameter, 3, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT));
		public static final ExecutorProperty _TemplateParameter__ownedParameteredElement = new ExecutorProperty("ownedParameteredElement", Types._TemplateParameter, 4, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT));
		public static final ExecutorProperty _TemplateParameter__parameteredElement = new ExecutorProperty("parameteredElement", Types._TemplateParameter, 5, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT));
		public static final ExecutorProperty _TemplateParameter__signature = new ExecutorProperty("signature", Types._TemplateParameter, 6, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__SIGNATURE));
	
		public static final ExecutorProperty _TemplateParameterSubstitution__actual = new ExecutorProperty("actual", Types._TemplateParameterSubstitution, 0, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL));
		public static final ExecutorProperty _TemplateParameterSubstitution__formal = new ExecutorProperty("formal", Types._TemplateParameterSubstitution, 1, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL));
		public static final ExecutorProperty _TemplateParameterSubstitution__ownedActual = new ExecutorProperty("ownedActual", Types._TemplateParameterSubstitution, 2, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL));
		public static final ExecutorProperty _TemplateParameterSubstitution__templateBinding = new ExecutorProperty("templateBinding", Types._TemplateParameterSubstitution, 3, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING));
	
		public static final ExecutorProperty _TemplateParameterType__specification = new ExecutorProperty("specification", Types._TemplateParameterType, 0, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_TYPE__SPECIFICATION));
	
		public static final ExecutorProperty _TemplateSignature__TemplateBinding = new ExecutorProperty("TemplateBinding", Types._TemplateSignature, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TEMPLATE_BINDING__SIGNATURE));
		public static final ExecutorProperty _TemplateSignature__ownedParameter = new ExecutorProperty("ownedParameter", Types._TemplateSignature, 1, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER));
		public static final ExecutorProperty _TemplateSignature__parameter = new ExecutorProperty("parameter", Types._TemplateSignature, 2, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_SIGNATURE__PARAMETER));
		public static final ExecutorProperty _TemplateSignature__template = new ExecutorProperty("template", Types._TemplateSignature, 3, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_SIGNATURE__TEMPLATE));
	
		public static final ExecutorProperty _TemplateableElement__ownedTemplateSignature = new ExecutorProperty("ownedTemplateSignature", Types._TemplateableElement, 0, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE));
		public static final ExecutorProperty _TemplateableElement__templateBinding = new ExecutorProperty("templateBinding", Types._TemplateableElement, 1, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING));
		public static final ExecutorProperty _TemplateableElement__unspecializedElement = new ExecutorProperty("unspecializedElement", Types._TemplateableElement, 2, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__UNSPECIALIZED_ELEMENT));
	
		public static final ExecutorProperty _TupleLiteralExp__part = new ExecutorProperty("part", Types._TupleLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.TUPLE_LITERAL_EXP__PART));
	
		public static final ExecutorProperty _TupleLiteralPart__TupleLiteralExp = new ExecutorProperty("TupleLiteralExp", Types._TupleLiteralPart, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TUPLE_LITERAL_EXP__PART));
		public static final ExecutorProperty _TupleLiteralPart__initExpression = new ExecutorProperty("initExpression", Types._TupleLiteralPart, 1, new EcoreLibraryProperty(PivotPackage.Literals.TUPLE_LITERAL_PART__INIT_EXPRESSION));
	
		public static final ExecutorProperty _Type__ClassifierType = new ExecutorProperty("ClassifierType", Types._Type, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CLASSIFIER_TYPE__INSTANCE_TYPE));
		public static final ExecutorProperty _Type__CollectionType = new ExecutorProperty("CollectionType", Types._Type, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COLLECTION_TYPE__ELEMENT_TYPE));
		public static final ExecutorProperty _Type__DataType = new ExecutorProperty("DataType", Types._Type, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.DATA_TYPE__BEHAVIORAL_TYPE));
		public static final ExecutorProperty _Type__Operation = new ExecutorProperty("Operation", Types._Type, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION__RAISED_EXCEPTION));
		public static final ExecutorProperty _Type__Type = new ExecutorProperty("Type", Types._Type, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TYPE__SUPER_CLASS));
		public static final ExecutorProperty _Type__TypeExp = new ExecutorProperty("TypeExp", Types._Type, 5, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TYPE_EXP__REFERRED_TYPE));
		public static final ExecutorProperty _Type__TypeTemplateParameter = new ExecutorProperty("TypeTemplateParameter", Types._Type, 6, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TYPE_TEMPLATE_PARAMETER__CONSTRAINING_TYPE));
		public static final ExecutorProperty _Type__TypedElement = new ExecutorProperty("TypedElement", Types._Type, 7, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TYPED_ELEMENT__TYPE));
		public static final ExecutorProperty _Type__instanceClassName = new ExecutorProperty("instanceClassName", Types._Type, 8, new EcoreLibraryProperty(PivotPackage.Literals.TYPE__INSTANCE_CLASS_NAME));
		public static final ExecutorProperty _Type__ownedAttribute = new ExecutorProperty("ownedAttribute", Types._Type, 9, new EcoreLibraryProperty(PivotPackage.Literals.TYPE__OWNED_ATTRIBUTE));
		public static final ExecutorProperty _Type__ownedOperation = new ExecutorProperty("ownedOperation", Types._Type, 10, new EcoreLibraryProperty(PivotPackage.Literals.TYPE__OWNED_OPERATION));
		public static final ExecutorProperty _Type__package = new ExecutorProperty("package", Types._Type, 11, new EcoreLibraryProperty(PivotPackage.Literals.TYPE__PACKAGE));
		public static final ExecutorProperty _Type__superClass = new ExecutorProperty("superClass", Types._Type, 12, new EcoreLibraryProperty(PivotPackage.Literals.TYPE__SUPER_CLASS));
	
		public static final ExecutorProperty _TypeExp__referredType = new ExecutorProperty("referredType", Types._TypeExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.TYPE_EXP__REFERRED_TYPE));
	
		public static final ExecutorProperty _TypeTemplateParameter__allowSubstitutable = new ExecutorProperty("allowSubstitutable", Types._TypeTemplateParameter, 0, new EcoreLibraryProperty(PivotPackage.Literals.TYPE_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE));
		public static final ExecutorProperty _TypeTemplateParameter__constrainingType = new ExecutorProperty("constrainingType", Types._TypeTemplateParameter, 1, new EcoreLibraryProperty(PivotPackage.Literals.TYPE_TEMPLATE_PARAMETER__CONSTRAINING_TYPE));
	
		public static final ExecutorProperty _TypedElement__type = new ExecutorProperty("type", Types._TypedElement, 0, new EcoreLibraryProperty(PivotPackage.Literals.TYPED_ELEMENT__TYPE));
	
		public static final ExecutorProperty _UnlimitedNaturalLiteralExp__unlimitedNaturalSymbol = new ExecutorProperty("unlimitedNaturalSymbol", Types._UnlimitedNaturalLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL));
	
		public static final ExecutorProperty _UnspecifiedType__lowerBound = new ExecutorProperty("lowerBound", Types._UnspecifiedType, 0, new EcoreLibraryProperty(PivotPackage.Literals.UNSPECIFIED_TYPE__LOWER_BOUND));
		public static final ExecutorProperty _UnspecifiedType__upperBound = new ExecutorProperty("upperBound", Types._UnspecifiedType, 1, new EcoreLibraryProperty(PivotPackage.Literals.UNSPECIFIED_TYPE__UPPER_BOUND));
	
		public static final ExecutorProperty _ValueSpecification__Constraint = new ExecutorProperty("Constraint", Types._ValueSpecification, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONSTRAINT__SPECIFICATION));
	
		public static final ExecutorProperty _Variable__IterateExp = new ExecutorProperty("IterateExp", Types._Variable, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ITERATE_EXP__RESULT));
		public static final ExecutorProperty _Variable__LetExp = new ExecutorProperty("LetExp", Types._Variable, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LET_EXP__VARIABLE));
		public static final ExecutorProperty _Variable__LoopExp = new ExecutorProperty("LoopExp", Types._Variable, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LOOP_EXP__ITERATOR));
		public static final ExecutorProperty _Variable__implicit = new ExecutorProperty("implicit", Types._Variable, 3, new EcoreLibraryProperty(PivotPackage.Literals.VARIABLE__IMPLICIT));
		public static final ExecutorProperty _Variable__initExpression = new ExecutorProperty("initExpression", Types._Variable, 4, new EcoreLibraryProperty(PivotPackage.Literals.VARIABLE__INIT_EXPRESSION));
		public static final ExecutorProperty _Variable__representedParameter = new ExecutorProperty("representedParameter", Types._Variable, 5, new EcoreLibraryProperty(PivotPackage.Literals.VARIABLE__REPRESENTED_PARAMETER));
	
		public static final ExecutorProperty _VariableDeclaration__VariableExp = new ExecutorProperty("VariableExp", Types._VariableDeclaration, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.VARIABLE_EXP__REFERRED_VARIABLE));
	
		public static final ExecutorProperty _VariableExp__implicit = new ExecutorProperty("implicit", Types._VariableExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.VARIABLE_EXP__IMPLICIT));
		public static final ExecutorProperty _VariableExp__referredVariable = new ExecutorProperty("referredVariable", Types._VariableExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.VARIABLE_EXP__REFERRED_VARIABLE));
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		private static final ExecutorFragment[] _Annotation =
		{
		    Fragments._Annotation__OclAny /* 0 */,
		    Fragments._Annotation__OclElement /* 1 */,
		    Fragments._Annotation__Visitable /* 2 */,
		    Fragments._Annotation__Nameable /* 2 */,
		    Fragments._Annotation__Element /* 3 */,
		    Fragments._Annotation__NamedElement /* 4 */,
		    Fragments._Annotation__Annotation /* 5 */
		};
		private static final int[] __Annotation = { 1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _AnyType =
		{
		    Fragments._AnyType__OclAny /* 0 */,
		    Fragments._AnyType__OclElement /* 1 */,
		    Fragments._AnyType__Visitable /* 2 */,
		    Fragments._AnyType__Nameable /* 2 */,
		    Fragments._AnyType__Element /* 3 */,
		    Fragments._AnyType__TemplateableElement /* 4 */,
		    Fragments._AnyType__NamedElement /* 4 */,
		    Fragments._AnyType__ParameterableElement /* 4 */,
		    Fragments._AnyType__Namespace /* 5 */,
		    Fragments._AnyType__Type /* 5 */,
		    Fragments._AnyType__Class /* 6 */,
		    Fragments._AnyType__AnyType /* 7 */
		};
		private static final int[] __AnyType = { 1,1,2,1,3,2,1,1 };
	
		private static final ExecutorFragment[] _AssociationClass =
		{
		    Fragments._AssociationClass__OclAny /* 0 */,
		    Fragments._AssociationClass__OclElement /* 1 */,
		    Fragments._AssociationClass__Visitable /* 2 */,
		    Fragments._AssociationClass__Nameable /* 2 */,
		    Fragments._AssociationClass__Element /* 3 */,
		    Fragments._AssociationClass__TemplateableElement /* 4 */,
		    Fragments._AssociationClass__NamedElement /* 4 */,
		    Fragments._AssociationClass__ParameterableElement /* 4 */,
		    Fragments._AssociationClass__Namespace /* 5 */,
		    Fragments._AssociationClass__Type /* 5 */,
		    Fragments._AssociationClass__Class /* 6 */,
		    Fragments._AssociationClass__AssociationClass /* 7 */
		};
		private static final int[] __AssociationClass = { 1,1,2,1,3,2,1,1 };
	
		private static final ExecutorFragment[] _AssociationClassCallExp =
		{
		    Fragments._AssociationClassCallExp__OclAny /* 0 */,
		    Fragments._AssociationClassCallExp__OclElement /* 1 */,
		    Fragments._AssociationClassCallExp__Visitable /* 2 */,
		    Fragments._AssociationClassCallExp__Nameable /* 2 */,
		    Fragments._AssociationClassCallExp__Element /* 3 */,
		    Fragments._AssociationClassCallExp__NamedElement /* 4 */,
		    Fragments._AssociationClassCallExp__TypedElement /* 5 */,
		    Fragments._AssociationClassCallExp__OclExpression /* 6 */,
		    Fragments._AssociationClassCallExp__CallExp /* 7 */,
		    Fragments._AssociationClassCallExp__FeatureCallExp /* 8 */,
		    Fragments._AssociationClassCallExp__NavigationCallExp /* 9 */,
		    Fragments._AssociationClassCallExp__AssociationClassCallExp /* 10 */
		};
		private static final int[] __AssociationClassCallExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _AssociativityKind =
		{
		    Fragments._AssociativityKind__AssociativityKind /* 0 */
		};
		private static final int[] __AssociativityKind = { 1 };
	
		private static final ExecutorFragment[] _BagType =
		{
		    Fragments._BagType__OclAny /* 0 */,
		    Fragments._BagType__OclElement /* 1 */,
		    Fragments._BagType__Visitable /* 2 */,
		    Fragments._BagType__Nameable /* 2 */,
		    Fragments._BagType__Element /* 3 */,
		    Fragments._BagType__NamedElement /* 4 */,
		    Fragments._BagType__ParameterableElement /* 4 */,
		    Fragments._BagType__TemplateableElement /* 4 */,
		    Fragments._BagType__Type /* 5 */,
		    Fragments._BagType__Namespace /* 5 */,
		    Fragments._BagType__Class /* 6 */,
		    Fragments._BagType__DataType /* 7 */,
		    Fragments._BagType__CollectionType /* 8 */,
		    Fragments._BagType__BagType /* 9 */
		};
		private static final int[] __BagType = { 1,1,2,1,3,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _BooleanLiteralExp =
		{
		    Fragments._BooleanLiteralExp__OclAny /* 0 */,
		    Fragments._BooleanLiteralExp__OclElement /* 1 */,
		    Fragments._BooleanLiteralExp__Visitable /* 2 */,
		    Fragments._BooleanLiteralExp__Nameable /* 2 */,
		    Fragments._BooleanLiteralExp__Element /* 3 */,
		    Fragments._BooleanLiteralExp__NamedElement /* 4 */,
		    Fragments._BooleanLiteralExp__TypedElement /* 5 */,
		    Fragments._BooleanLiteralExp__OclExpression /* 6 */,
		    Fragments._BooleanLiteralExp__LiteralExp /* 7 */,
		    Fragments._BooleanLiteralExp__PrimitiveLiteralExp /* 8 */,
		    Fragments._BooleanLiteralExp__BooleanLiteralExp /* 9 */
		};
		private static final int[] __BooleanLiteralExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _CallExp =
		{
		    Fragments._CallExp__OclAny /* 0 */,
		    Fragments._CallExp__OclElement /* 1 */,
		    Fragments._CallExp__Visitable /* 2 */,
		    Fragments._CallExp__Nameable /* 2 */,
		    Fragments._CallExp__Element /* 3 */,
		    Fragments._CallExp__NamedElement /* 4 */,
		    Fragments._CallExp__TypedElement /* 5 */,
		    Fragments._CallExp__OclExpression /* 6 */,
		    Fragments._CallExp__CallExp /* 7 */
		};
		private static final int[] __CallExp = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _CallOperationAction =
		{
		    Fragments._CallOperationAction__OclAny /* 0 */,
		    Fragments._CallOperationAction__OclElement /* 1 */,
		    Fragments._CallOperationAction__Visitable /* 2 */,
		    Fragments._CallOperationAction__Nameable /* 2 */,
		    Fragments._CallOperationAction__Element /* 3 */,
		    Fragments._CallOperationAction__NamedElement /* 4 */,
		    Fragments._CallOperationAction__CallOperationAction /* 5 */
		};
		private static final int[] __CallOperationAction = { 1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _Class =
		{
		    Fragments._Class__OclAny /* 0 */,
		    Fragments._Class__OclElement /* 1 */,
		    Fragments._Class__Visitable /* 2 */,
		    Fragments._Class__Nameable /* 2 */,
		    Fragments._Class__Element /* 3 */,
		    Fragments._Class__TemplateableElement /* 4 */,
		    Fragments._Class__NamedElement /* 4 */,
		    Fragments._Class__ParameterableElement /* 4 */,
		    Fragments._Class__Namespace /* 5 */,
		    Fragments._Class__Type /* 5 */,
		    Fragments._Class__Class /* 6 */
		};
		private static final int[] __Class = { 1,1,2,1,3,2,1 };
	
		private static final ExecutorFragment[] _ClassifierType =
		{
		    Fragments._ClassifierType__OclAny /* 0 */,
		    Fragments._ClassifierType__OclElement /* 1 */,
		    Fragments._ClassifierType__Visitable /* 2 */,
		    Fragments._ClassifierType__Nameable /* 2 */,
		    Fragments._ClassifierType__Element /* 3 */,
		    Fragments._ClassifierType__NamedElement /* 4 */,
		    Fragments._ClassifierType__ParameterableElement /* 4 */,
		    Fragments._ClassifierType__TemplateableElement /* 4 */,
		    Fragments._ClassifierType__Type /* 5 */,
		    Fragments._ClassifierType__Namespace /* 5 */,
		    Fragments._ClassifierType__Class /* 6 */,
		    Fragments._ClassifierType__DataType /* 7 */,
		    Fragments._ClassifierType__ClassifierType /* 8 */
		};
		private static final int[] __ClassifierType = { 1,1,2,1,3,2,1,1,1 };
	
		private static final ExecutorFragment[] _CollectionItem =
		{
		    Fragments._CollectionItem__OclAny /* 0 */,
		    Fragments._CollectionItem__OclElement /* 1 */,
		    Fragments._CollectionItem__Visitable /* 2 */,
		    Fragments._CollectionItem__Nameable /* 2 */,
		    Fragments._CollectionItem__Element /* 3 */,
		    Fragments._CollectionItem__NamedElement /* 4 */,
		    Fragments._CollectionItem__TypedElement /* 5 */,
		    Fragments._CollectionItem__CollectionLiteralPart /* 6 */,
		    Fragments._CollectionItem__CollectionItem /* 7 */
		};
		private static final int[] __CollectionItem = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _CollectionKind =
		{
		    Fragments._CollectionKind__CollectionKind /* 0 */
		};
		private static final int[] __CollectionKind = { 1 };
	
		private static final ExecutorFragment[] _CollectionLiteralExp =
		{
		    Fragments._CollectionLiteralExp__OclAny /* 0 */,
		    Fragments._CollectionLiteralExp__OclElement /* 1 */,
		    Fragments._CollectionLiteralExp__Visitable /* 2 */,
		    Fragments._CollectionLiteralExp__Nameable /* 2 */,
		    Fragments._CollectionLiteralExp__Element /* 3 */,
		    Fragments._CollectionLiteralExp__NamedElement /* 4 */,
		    Fragments._CollectionLiteralExp__TypedElement /* 5 */,
		    Fragments._CollectionLiteralExp__OclExpression /* 6 */,
		    Fragments._CollectionLiteralExp__LiteralExp /* 7 */,
		    Fragments._CollectionLiteralExp__CollectionLiteralExp /* 8 */
		};
		private static final int[] __CollectionLiteralExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _CollectionLiteralPart =
		{
		    Fragments._CollectionLiteralPart__OclAny /* 0 */,
		    Fragments._CollectionLiteralPart__OclElement /* 1 */,
		    Fragments._CollectionLiteralPart__Visitable /* 2 */,
		    Fragments._CollectionLiteralPart__Nameable /* 2 */,
		    Fragments._CollectionLiteralPart__Element /* 3 */,
		    Fragments._CollectionLiteralPart__NamedElement /* 4 */,
		    Fragments._CollectionLiteralPart__TypedElement /* 5 */,
		    Fragments._CollectionLiteralPart__CollectionLiteralPart /* 6 */
		};
		private static final int[] __CollectionLiteralPart = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _CollectionRange =
		{
		    Fragments._CollectionRange__OclAny /* 0 */,
		    Fragments._CollectionRange__OclElement /* 1 */,
		    Fragments._CollectionRange__Visitable /* 2 */,
		    Fragments._CollectionRange__Nameable /* 2 */,
		    Fragments._CollectionRange__Element /* 3 */,
		    Fragments._CollectionRange__NamedElement /* 4 */,
		    Fragments._CollectionRange__TypedElement /* 5 */,
		    Fragments._CollectionRange__CollectionLiteralPart /* 6 */,
		    Fragments._CollectionRange__CollectionRange /* 7 */
		};
		private static final int[] __CollectionRange = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _CollectionType =
		{
		    Fragments._CollectionType__OclAny /* 0 */,
		    Fragments._CollectionType__OclElement /* 1 */,
		    Fragments._CollectionType__Visitable /* 2 */,
		    Fragments._CollectionType__Nameable /* 2 */,
		    Fragments._CollectionType__Element /* 3 */,
		    Fragments._CollectionType__NamedElement /* 4 */,
		    Fragments._CollectionType__ParameterableElement /* 4 */,
		    Fragments._CollectionType__TemplateableElement /* 4 */,
		    Fragments._CollectionType__Type /* 5 */,
		    Fragments._CollectionType__Namespace /* 5 */,
		    Fragments._CollectionType__Class /* 6 */,
		    Fragments._CollectionType__DataType /* 7 */,
		    Fragments._CollectionType__CollectionType /* 8 */
		};
		private static final int[] __CollectionType = { 1,1,2,1,3,2,1,1,1 };
	
		private static final ExecutorFragment[] _Comment =
		{
		    Fragments._Comment__OclAny /* 0 */,
		    Fragments._Comment__OclElement /* 1 */,
		    Fragments._Comment__Visitable /* 2 */,
		    Fragments._Comment__Element /* 3 */,
		    Fragments._Comment__Comment /* 4 */
		};
		private static final int[] __Comment = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Constraint =
		{
		    Fragments._Constraint__OclAny /* 0 */,
		    Fragments._Constraint__OclElement /* 1 */,
		    Fragments._Constraint__Visitable /* 2 */,
		    Fragments._Constraint__Nameable /* 2 */,
		    Fragments._Constraint__Element /* 3 */,
		    Fragments._Constraint__NamedElement /* 4 */,
		    Fragments._Constraint__Constraint /* 5 */
		};
		private static final int[] __Constraint = { 1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _ConstructorExp =
		{
		    Fragments._ConstructorExp__OclAny /* 0 */,
		    Fragments._ConstructorExp__OclElement /* 1 */,
		    Fragments._ConstructorExp__Visitable /* 2 */,
		    Fragments._ConstructorExp__Nameable /* 2 */,
		    Fragments._ConstructorExp__Element /* 3 */,
		    Fragments._ConstructorExp__NamedElement /* 4 */,
		    Fragments._ConstructorExp__TypedElement /* 5 */,
		    Fragments._ConstructorExp__OclExpression /* 6 */,
		    Fragments._ConstructorExp__ConstructorExp /* 7 */
		};
		private static final int[] __ConstructorExp = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _ConstructorPart =
		{
		    Fragments._ConstructorPart__OclAny /* 0 */,
		    Fragments._ConstructorPart__OclElement /* 1 */,
		    Fragments._ConstructorPart__Visitable /* 2 */,
		    Fragments._ConstructorPart__Element /* 3 */,
		    Fragments._ConstructorPart__ConstructorPart /* 4 */
		};
		private static final int[] __ConstructorPart = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _DataType =
		{
		    Fragments._DataType__OclAny /* 0 */,
		    Fragments._DataType__OclElement /* 1 */,
		    Fragments._DataType__Visitable /* 2 */,
		    Fragments._DataType__Nameable /* 2 */,
		    Fragments._DataType__Element /* 3 */,
		    Fragments._DataType__TemplateableElement /* 4 */,
		    Fragments._DataType__NamedElement /* 4 */,
		    Fragments._DataType__ParameterableElement /* 4 */,
		    Fragments._DataType__Namespace /* 5 */,
		    Fragments._DataType__Type /* 5 */,
		    Fragments._DataType__Class /* 6 */,
		    Fragments._DataType__DataType /* 7 */
		};
		private static final int[] __DataType = { 1,1,2,1,3,2,1,1 };
	
		private static final ExecutorFragment[] _Detail =
		{
		    Fragments._Detail__OclAny /* 0 */,
		    Fragments._Detail__OclElement /* 1 */,
		    Fragments._Detail__Visitable /* 2 */,
		    Fragments._Detail__Nameable /* 2 */,
		    Fragments._Detail__Element /* 3 */,
		    Fragments._Detail__NamedElement /* 4 */,
		    Fragments._Detail__Detail /* 5 */
		};
		private static final int[] __Detail = { 1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _Element =
		{
		    Fragments._Element__OclAny /* 0 */,
		    Fragments._Element__OclElement /* 1 */,
		    Fragments._Element__Visitable /* 2 */,
		    Fragments._Element__Element /* 3 */
		};
		private static final int[] __Element = { 1,1,1,1 };
	
		private static final ExecutorFragment[] _EnumLiteralExp =
		{
		    Fragments._EnumLiteralExp__OclAny /* 0 */,
		    Fragments._EnumLiteralExp__OclElement /* 1 */,
		    Fragments._EnumLiteralExp__Visitable /* 2 */,
		    Fragments._EnumLiteralExp__Nameable /* 2 */,
		    Fragments._EnumLiteralExp__Element /* 3 */,
		    Fragments._EnumLiteralExp__NamedElement /* 4 */,
		    Fragments._EnumLiteralExp__TypedElement /* 5 */,
		    Fragments._EnumLiteralExp__OclExpression /* 6 */,
		    Fragments._EnumLiteralExp__LiteralExp /* 7 */,
		    Fragments._EnumLiteralExp__EnumLiteralExp /* 8 */
		};
		private static final int[] __EnumLiteralExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Enumeration =
		{
		    Fragments._Enumeration__OclAny /* 0 */,
		    Fragments._Enumeration__OclElement /* 1 */,
		    Fragments._Enumeration__Visitable /* 2 */,
		    Fragments._Enumeration__Nameable /* 2 */,
		    Fragments._Enumeration__Element /* 3 */,
		    Fragments._Enumeration__NamedElement /* 4 */,
		    Fragments._Enumeration__ParameterableElement /* 4 */,
		    Fragments._Enumeration__TemplateableElement /* 4 */,
		    Fragments._Enumeration__Type /* 5 */,
		    Fragments._Enumeration__Namespace /* 5 */,
		    Fragments._Enumeration__Class /* 6 */,
		    Fragments._Enumeration__DataType /* 7 */,
		    Fragments._Enumeration__Enumeration /* 8 */
		};
		private static final int[] __Enumeration = { 1,1,2,1,3,2,1,1,1 };
	
		private static final ExecutorFragment[] _EnumerationLiteral =
		{
		    Fragments._EnumerationLiteral__OclAny /* 0 */,
		    Fragments._EnumerationLiteral__OclElement /* 1 */,
		    Fragments._EnumerationLiteral__Visitable /* 2 */,
		    Fragments._EnumerationLiteral__Nameable /* 2 */,
		    Fragments._EnumerationLiteral__Element /* 3 */,
		    Fragments._EnumerationLiteral__NamedElement /* 4 */,
		    Fragments._EnumerationLiteral__EnumerationLiteral /* 5 */
		};
		private static final int[] __EnumerationLiteral = { 1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _ExpressionInOcl =
		{
		    Fragments._ExpressionInOcl__OclAny /* 0 */,
		    Fragments._ExpressionInOcl__OclElement /* 1 */,
		    Fragments._ExpressionInOcl__Visitable /* 2 */,
		    Fragments._ExpressionInOcl__Nameable /* 2 */,
		    Fragments._ExpressionInOcl__Element /* 3 */,
		    Fragments._ExpressionInOcl__NamedElement /* 4 */,
		    Fragments._ExpressionInOcl__ParameterableElement /* 4 */,
		    Fragments._ExpressionInOcl__TypedElement /* 5 */,
		    Fragments._ExpressionInOcl__ValueSpecification /* 6 */,
		    Fragments._ExpressionInOcl__OpaqueExpression /* 7 */,
		    Fragments._ExpressionInOcl__ExpressionInOcl /* 8 */
		};
		private static final int[] __ExpressionInOcl = { 1,1,2,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _Feature =
		{
		    Fragments._Feature__OclAny /* 0 */,
		    Fragments._Feature__OclElement /* 1 */,
		    Fragments._Feature__Visitable /* 2 */,
		    Fragments._Feature__Nameable /* 2 */,
		    Fragments._Feature__Element /* 3 */,
		    Fragments._Feature__MultiplicityElement /* 4 */,
		    Fragments._Feature__NamedElement /* 4 */,
		    Fragments._Feature__TypedElement /* 5 */,
		    Fragments._Feature__TypedMultiplicityElement /* 6 */,
		    Fragments._Feature__Feature /* 7 */
		};
		private static final int[] __Feature = { 1,1,2,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _FeatureCallExp =
		{
		    Fragments._FeatureCallExp__OclAny /* 0 */,
		    Fragments._FeatureCallExp__OclElement /* 1 */,
		    Fragments._FeatureCallExp__Visitable /* 2 */,
		    Fragments._FeatureCallExp__Nameable /* 2 */,
		    Fragments._FeatureCallExp__Element /* 3 */,
		    Fragments._FeatureCallExp__NamedElement /* 4 */,
		    Fragments._FeatureCallExp__TypedElement /* 5 */,
		    Fragments._FeatureCallExp__OclExpression /* 6 */,
		    Fragments._FeatureCallExp__CallExp /* 7 */,
		    Fragments._FeatureCallExp__FeatureCallExp /* 8 */
		};
		private static final int[] __FeatureCallExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _IfExp =
		{
		    Fragments._IfExp__OclAny /* 0 */,
		    Fragments._IfExp__OclElement /* 1 */,
		    Fragments._IfExp__Visitable /* 2 */,
		    Fragments._IfExp__Nameable /* 2 */,
		    Fragments._IfExp__Element /* 3 */,
		    Fragments._IfExp__NamedElement /* 4 */,
		    Fragments._IfExp__TypedElement /* 5 */,
		    Fragments._IfExp__OclExpression /* 6 */,
		    Fragments._IfExp__IfExp /* 7 */
		};
		private static final int[] __IfExp = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _IntegerLiteralExp =
		{
		    Fragments._IntegerLiteralExp__OclAny /* 0 */,
		    Fragments._IntegerLiteralExp__OclElement /* 1 */,
		    Fragments._IntegerLiteralExp__Visitable /* 2 */,
		    Fragments._IntegerLiteralExp__Nameable /* 2 */,
		    Fragments._IntegerLiteralExp__Element /* 3 */,
		    Fragments._IntegerLiteralExp__NamedElement /* 4 */,
		    Fragments._IntegerLiteralExp__TypedElement /* 5 */,
		    Fragments._IntegerLiteralExp__OclExpression /* 6 */,
		    Fragments._IntegerLiteralExp__LiteralExp /* 7 */,
		    Fragments._IntegerLiteralExp__PrimitiveLiteralExp /* 8 */,
		    Fragments._IntegerLiteralExp__NumericLiteralExp /* 9 */,
		    Fragments._IntegerLiteralExp__IntegerLiteralExp /* 10 */
		};
		private static final int[] __IntegerLiteralExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _InvalidLiteralExp =
		{
		    Fragments._InvalidLiteralExp__OclAny /* 0 */,
		    Fragments._InvalidLiteralExp__OclElement /* 1 */,
		    Fragments._InvalidLiteralExp__Visitable /* 2 */,
		    Fragments._InvalidLiteralExp__Nameable /* 2 */,
		    Fragments._InvalidLiteralExp__Element /* 3 */,
		    Fragments._InvalidLiteralExp__NamedElement /* 4 */,
		    Fragments._InvalidLiteralExp__TypedElement /* 5 */,
		    Fragments._InvalidLiteralExp__OclExpression /* 6 */,
		    Fragments._InvalidLiteralExp__LiteralExp /* 7 */,
		    Fragments._InvalidLiteralExp__InvalidLiteralExp /* 8 */
		};
		private static final int[] __InvalidLiteralExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _InvalidType =
		{
		    Fragments._InvalidType__OclAny /* 0 */,
		    Fragments._InvalidType__OclElement /* 1 */,
		    Fragments._InvalidType__Visitable /* 2 */,
		    Fragments._InvalidType__Nameable /* 2 */,
		    Fragments._InvalidType__Element /* 3 */,
		    Fragments._InvalidType__TemplateableElement /* 4 */,
		    Fragments._InvalidType__NamedElement /* 4 */,
		    Fragments._InvalidType__ParameterableElement /* 4 */,
		    Fragments._InvalidType__Namespace /* 5 */,
		    Fragments._InvalidType__Type /* 5 */,
		    Fragments._InvalidType__Class /* 6 */,
		    Fragments._InvalidType__InvalidType /* 7 */
		};
		private static final int[] __InvalidType = { 1,1,2,1,3,2,1,1 };
	
		private static final ExecutorFragment[] _IterateExp =
		{
		    Fragments._IterateExp__OclAny /* 0 */,
		    Fragments._IterateExp__OclElement /* 1 */,
		    Fragments._IterateExp__Visitable /* 2 */,
		    Fragments._IterateExp__Nameable /* 2 */,
		    Fragments._IterateExp__Element /* 3 */,
		    Fragments._IterateExp__NamedElement /* 4 */,
		    Fragments._IterateExp__TypedElement /* 5 */,
		    Fragments._IterateExp__OclExpression /* 6 */,
		    Fragments._IterateExp__CallExp /* 7 */,
		    Fragments._IterateExp__LoopExp /* 8 */,
		    Fragments._IterateExp__IterateExp /* 9 */
		};
		private static final int[] __IterateExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Iteration =
		{
		    Fragments._Iteration__OclAny /* 0 */,
		    Fragments._Iteration__OclElement /* 1 */,
		    Fragments._Iteration__Visitable /* 2 */,
		    Fragments._Iteration__Nameable /* 2 */,
		    Fragments._Iteration__Element /* 3 */,
		    Fragments._Iteration__NamedElement /* 4 */,
		    Fragments._Iteration__ParameterableElement /* 4 */,
		    Fragments._Iteration__MultiplicityElement /* 4 */,
		    Fragments._Iteration__TemplateableElement /* 4 */,
		    Fragments._Iteration__TypedElement /* 5 */,
		    Fragments._Iteration__Namespace /* 5 */,
		    Fragments._Iteration__TypedMultiplicityElement /* 6 */,
		    Fragments._Iteration__Feature /* 7 */,
		    Fragments._Iteration__Operation /* 8 */,
		    Fragments._Iteration__Iteration /* 9 */
		};
		private static final int[] __Iteration = { 1,1,2,1,4,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _IteratorExp =
		{
		    Fragments._IteratorExp__OclAny /* 0 */,
		    Fragments._IteratorExp__OclElement /* 1 */,
		    Fragments._IteratorExp__Visitable /* 2 */,
		    Fragments._IteratorExp__Nameable /* 2 */,
		    Fragments._IteratorExp__Element /* 3 */,
		    Fragments._IteratorExp__NamedElement /* 4 */,
		    Fragments._IteratorExp__TypedElement /* 5 */,
		    Fragments._IteratorExp__OclExpression /* 6 */,
		    Fragments._IteratorExp__CallExp /* 7 */,
		    Fragments._IteratorExp__LoopExp /* 8 */,
		    Fragments._IteratorExp__IteratorExp /* 9 */
		};
		private static final int[] __IteratorExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _LambdaType =
		{
		    Fragments._LambdaType__OclAny /* 0 */,
		    Fragments._LambdaType__OclElement /* 1 */,
		    Fragments._LambdaType__Visitable /* 2 */,
		    Fragments._LambdaType__Nameable /* 2 */,
		    Fragments._LambdaType__Element /* 3 */,
		    Fragments._LambdaType__NamedElement /* 4 */,
		    Fragments._LambdaType__ParameterableElement /* 4 */,
		    Fragments._LambdaType__TemplateableElement /* 4 */,
		    Fragments._LambdaType__Type /* 5 */,
		    Fragments._LambdaType__Namespace /* 5 */,
		    Fragments._LambdaType__Class /* 6 */,
		    Fragments._LambdaType__DataType /* 7 */,
		    Fragments._LambdaType__LambdaType /* 8 */
		};
		private static final int[] __LambdaType = { 1,1,2,1,3,2,1,1,1 };
	
		private static final ExecutorFragment[] _LetExp =
		{
		    Fragments._LetExp__OclAny /* 0 */,
		    Fragments._LetExp__OclElement /* 1 */,
		    Fragments._LetExp__Visitable /* 2 */,
		    Fragments._LetExp__Nameable /* 2 */,
		    Fragments._LetExp__Element /* 3 */,
		    Fragments._LetExp__NamedElement /* 4 */,
		    Fragments._LetExp__TypedElement /* 5 */,
		    Fragments._LetExp__OclExpression /* 6 */,
		    Fragments._LetExp__LetExp /* 7 */
		};
		private static final int[] __LetExp = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Library =
		{
		    Fragments._Library__OclAny /* 0 */,
		    Fragments._Library__OclElement /* 1 */,
		    Fragments._Library__Visitable /* 2 */,
		    Fragments._Library__Nameable /* 2 */,
		    Fragments._Library__Element /* 3 */,
		    Fragments._Library__TemplateableElement /* 4 */,
		    Fragments._Library__NamedElement /* 4 */,
		    Fragments._Library__Namespace /* 5 */,
		    Fragments._Library__Package /* 6 */,
		    Fragments._Library__Library /* 7 */
		};
		private static final int[] __Library = { 1,1,2,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _LibraryFeature =
		{
		    Fragments._LibraryFeature__LibraryFeature /* 0 */
		};
		private static final int[] __LibraryFeature = { 1 };
	
		private static final ExecutorFragment[] _LiteralExp =
		{
		    Fragments._LiteralExp__OclAny /* 0 */,
		    Fragments._LiteralExp__OclElement /* 1 */,
		    Fragments._LiteralExp__Visitable /* 2 */,
		    Fragments._LiteralExp__Nameable /* 2 */,
		    Fragments._LiteralExp__Element /* 3 */,
		    Fragments._LiteralExp__NamedElement /* 4 */,
		    Fragments._LiteralExp__TypedElement /* 5 */,
		    Fragments._LiteralExp__OclExpression /* 6 */,
		    Fragments._LiteralExp__LiteralExp /* 7 */
		};
		private static final int[] __LiteralExp = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _LoopExp =
		{
		    Fragments._LoopExp__OclAny /* 0 */,
		    Fragments._LoopExp__OclElement /* 1 */,
		    Fragments._LoopExp__Visitable /* 2 */,
		    Fragments._LoopExp__Nameable /* 2 */,
		    Fragments._LoopExp__Element /* 3 */,
		    Fragments._LoopExp__NamedElement /* 4 */,
		    Fragments._LoopExp__TypedElement /* 5 */,
		    Fragments._LoopExp__OclExpression /* 6 */,
		    Fragments._LoopExp__CallExp /* 7 */,
		    Fragments._LoopExp__LoopExp /* 8 */
		};
		private static final int[] __LoopExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _MessageExp =
		{
		    Fragments._MessageExp__OclAny /* 0 */,
		    Fragments._MessageExp__OclElement /* 1 */,
		    Fragments._MessageExp__Visitable /* 2 */,
		    Fragments._MessageExp__Nameable /* 2 */,
		    Fragments._MessageExp__Element /* 3 */,
		    Fragments._MessageExp__NamedElement /* 4 */,
		    Fragments._MessageExp__TypedElement /* 5 */,
		    Fragments._MessageExp__OclExpression /* 6 */,
		    Fragments._MessageExp__MessageExp /* 7 */
		};
		private static final int[] __MessageExp = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _MessageType =
		{
		    Fragments._MessageType__OclAny /* 0 */,
		    Fragments._MessageType__OclElement /* 1 */,
		    Fragments._MessageType__Visitable /* 2 */,
		    Fragments._MessageType__Nameable /* 2 */,
		    Fragments._MessageType__Element /* 3 */,
		    Fragments._MessageType__TemplateableElement /* 4 */,
		    Fragments._MessageType__NamedElement /* 4 */,
		    Fragments._MessageType__ParameterableElement /* 4 */,
		    Fragments._MessageType__Type /* 5 */,
		    Fragments._MessageType__MessageType /* 6 */
		};
		private static final int[] __MessageType = { 1,1,2,1,3,1,1 };
	
		private static final ExecutorFragment[] _MultiplicityElement =
		{
		    Fragments._MultiplicityElement__OclAny /* 0 */,
		    Fragments._MultiplicityElement__OclElement /* 1 */,
		    Fragments._MultiplicityElement__Visitable /* 2 */,
		    Fragments._MultiplicityElement__Element /* 3 */,
		    Fragments._MultiplicityElement__MultiplicityElement /* 4 */
		};
		private static final int[] __MultiplicityElement = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Nameable =
		{
		    Fragments._Nameable__OclAny /* 0 */,
		    Fragments._Nameable__OclElement /* 1 */,
		    Fragments._Nameable__Nameable /* 2 */
		};
		private static final int[] __Nameable = { 1,1,1 };
	
		private static final ExecutorFragment[] _NamedElement =
		{
		    Fragments._NamedElement__OclAny /* 0 */,
		    Fragments._NamedElement__OclElement /* 1 */,
		    Fragments._NamedElement__Visitable /* 2 */,
		    Fragments._NamedElement__Nameable /* 2 */,
		    Fragments._NamedElement__Element /* 3 */,
		    Fragments._NamedElement__NamedElement /* 4 */
		};
		private static final int[] __NamedElement = { 1,1,2,1,1 };
	
		private static final ExecutorFragment[] _Namespace =
		{
		    Fragments._Namespace__OclAny /* 0 */,
		    Fragments._Namespace__OclElement /* 1 */,
		    Fragments._Namespace__Visitable /* 2 */,
		    Fragments._Namespace__Nameable /* 2 */,
		    Fragments._Namespace__Element /* 3 */,
		    Fragments._Namespace__NamedElement /* 4 */,
		    Fragments._Namespace__Namespace /* 5 */
		};
		private static final int[] __Namespace = { 1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _NavigationCallExp =
		{
		    Fragments._NavigationCallExp__OclAny /* 0 */,
		    Fragments._NavigationCallExp__OclElement /* 1 */,
		    Fragments._NavigationCallExp__Visitable /* 2 */,
		    Fragments._NavigationCallExp__Nameable /* 2 */,
		    Fragments._NavigationCallExp__Element /* 3 */,
		    Fragments._NavigationCallExp__NamedElement /* 4 */,
		    Fragments._NavigationCallExp__TypedElement /* 5 */,
		    Fragments._NavigationCallExp__OclExpression /* 6 */,
		    Fragments._NavigationCallExp__CallExp /* 7 */,
		    Fragments._NavigationCallExp__FeatureCallExp /* 8 */,
		    Fragments._NavigationCallExp__NavigationCallExp /* 9 */
		};
		private static final int[] __NavigationCallExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _NullLiteralExp =
		{
		    Fragments._NullLiteralExp__OclAny /* 0 */,
		    Fragments._NullLiteralExp__OclElement /* 1 */,
		    Fragments._NullLiteralExp__Visitable /* 2 */,
		    Fragments._NullLiteralExp__Nameable /* 2 */,
		    Fragments._NullLiteralExp__Element /* 3 */,
		    Fragments._NullLiteralExp__NamedElement /* 4 */,
		    Fragments._NullLiteralExp__TypedElement /* 5 */,
		    Fragments._NullLiteralExp__OclExpression /* 6 */,
		    Fragments._NullLiteralExp__LiteralExp /* 7 */,
		    Fragments._NullLiteralExp__PrimitiveLiteralExp /* 8 */,
		    Fragments._NullLiteralExp__NullLiteralExp /* 9 */
		};
		private static final int[] __NullLiteralExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _NumericLiteralExp =
		{
		    Fragments._NumericLiteralExp__OclAny /* 0 */,
		    Fragments._NumericLiteralExp__OclElement /* 1 */,
		    Fragments._NumericLiteralExp__Visitable /* 2 */,
		    Fragments._NumericLiteralExp__Nameable /* 2 */,
		    Fragments._NumericLiteralExp__Element /* 3 */,
		    Fragments._NumericLiteralExp__NamedElement /* 4 */,
		    Fragments._NumericLiteralExp__TypedElement /* 5 */,
		    Fragments._NumericLiteralExp__OclExpression /* 6 */,
		    Fragments._NumericLiteralExp__LiteralExp /* 7 */,
		    Fragments._NumericLiteralExp__PrimitiveLiteralExp /* 8 */,
		    Fragments._NumericLiteralExp__NumericLiteralExp /* 9 */
		};
		private static final int[] __NumericLiteralExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Object =
		{
		    Fragments._Object__Object /* 0 */
		};
		private static final int[] __Object = { 1 };
	
		private static final ExecutorFragment[] _OclExpression =
		{
		    Fragments._OclExpression__OclAny /* 0 */,
		    Fragments._OclExpression__OclElement /* 1 */,
		    Fragments._OclExpression__Visitable /* 2 */,
		    Fragments._OclExpression__Nameable /* 2 */,
		    Fragments._OclExpression__Element /* 3 */,
		    Fragments._OclExpression__NamedElement /* 4 */,
		    Fragments._OclExpression__TypedElement /* 5 */,
		    Fragments._OclExpression__OclExpression /* 6 */
		};
		private static final int[] __OclExpression = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _OpaqueExpression =
		{
		    Fragments._OpaqueExpression__OclAny /* 0 */,
		    Fragments._OpaqueExpression__OclElement /* 1 */,
		    Fragments._OpaqueExpression__Visitable /* 2 */,
		    Fragments._OpaqueExpression__Nameable /* 2 */,
		    Fragments._OpaqueExpression__Element /* 3 */,
		    Fragments._OpaqueExpression__NamedElement /* 4 */,
		    Fragments._OpaqueExpression__ParameterableElement /* 4 */,
		    Fragments._OpaqueExpression__TypedElement /* 5 */,
		    Fragments._OpaqueExpression__ValueSpecification /* 6 */,
		    Fragments._OpaqueExpression__OpaqueExpression /* 7 */
		};
		private static final int[] __OpaqueExpression = { 1,1,2,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _Operation =
		{
		    Fragments._Operation__OclAny /* 0 */,
		    Fragments._Operation__OclElement /* 1 */,
		    Fragments._Operation__Visitable /* 2 */,
		    Fragments._Operation__Nameable /* 2 */,
		    Fragments._Operation__Element /* 3 */,
		    Fragments._Operation__NamedElement /* 4 */,
		    Fragments._Operation__ParameterableElement /* 4 */,
		    Fragments._Operation__MultiplicityElement /* 4 */,
		    Fragments._Operation__TemplateableElement /* 4 */,
		    Fragments._Operation__TypedElement /* 5 */,
		    Fragments._Operation__Namespace /* 5 */,
		    Fragments._Operation__TypedMultiplicityElement /* 6 */,
		    Fragments._Operation__Feature /* 7 */,
		    Fragments._Operation__Operation /* 8 */
		};
		private static final int[] __Operation = { 1,1,2,1,4,2,1,1,1 };
	
		private static final ExecutorFragment[] _OperationCallExp =
		{
		    Fragments._OperationCallExp__OclAny /* 0 */,
		    Fragments._OperationCallExp__OclElement /* 1 */,
		    Fragments._OperationCallExp__Visitable /* 2 */,
		    Fragments._OperationCallExp__Nameable /* 2 */,
		    Fragments._OperationCallExp__Element /* 3 */,
		    Fragments._OperationCallExp__NamedElement /* 4 */,
		    Fragments._OperationCallExp__TypedElement /* 5 */,
		    Fragments._OperationCallExp__OclExpression /* 6 */,
		    Fragments._OperationCallExp__CallExp /* 7 */,
		    Fragments._OperationCallExp__FeatureCallExp /* 8 */,
		    Fragments._OperationCallExp__OperationCallExp /* 9 */
		};
		private static final int[] __OperationCallExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _OperationTemplateParameter =
		{
		    Fragments._OperationTemplateParameter__OclAny /* 0 */,
		    Fragments._OperationTemplateParameter__OclElement /* 1 */,
		    Fragments._OperationTemplateParameter__Visitable /* 2 */,
		    Fragments._OperationTemplateParameter__Element /* 3 */,
		    Fragments._OperationTemplateParameter__TemplateParameter /* 4 */,
		    Fragments._OperationTemplateParameter__OperationTemplateParameter /* 5 */
		};
		private static final int[] __OperationTemplateParameter = { 1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _OrderedSetType =
		{
		    Fragments._OrderedSetType__OclAny /* 0 */,
		    Fragments._OrderedSetType__OclElement /* 1 */,
		    Fragments._OrderedSetType__Visitable /* 2 */,
		    Fragments._OrderedSetType__Nameable /* 2 */,
		    Fragments._OrderedSetType__Element /* 3 */,
		    Fragments._OrderedSetType__NamedElement /* 4 */,
		    Fragments._OrderedSetType__ParameterableElement /* 4 */,
		    Fragments._OrderedSetType__TemplateableElement /* 4 */,
		    Fragments._OrderedSetType__Type /* 5 */,
		    Fragments._OrderedSetType__Namespace /* 5 */,
		    Fragments._OrderedSetType__Class /* 6 */,
		    Fragments._OrderedSetType__DataType /* 7 */,
		    Fragments._OrderedSetType__CollectionType /* 8 */,
		    Fragments._OrderedSetType__OrderedSetType /* 9 */
		};
		private static final int[] __OrderedSetType = { 1,1,2,1,3,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _Package =
		{
		    Fragments._Package__OclAny /* 0 */,
		    Fragments._Package__OclElement /* 1 */,
		    Fragments._Package__Visitable /* 2 */,
		    Fragments._Package__Nameable /* 2 */,
		    Fragments._Package__Element /* 3 */,
		    Fragments._Package__TemplateableElement /* 4 */,
		    Fragments._Package__NamedElement /* 4 */,
		    Fragments._Package__Namespace /* 5 */,
		    Fragments._Package__Package /* 6 */
		};
		private static final int[] __Package = { 1,1,2,1,2,1,1 };
	
		private static final ExecutorFragment[] _PackageableElement =
		{
		    Fragments._PackageableElement__OclAny /* 0 */,
		    Fragments._PackageableElement__OclElement /* 1 */,
		    Fragments._PackageableElement__Visitable /* 2 */,
		    Fragments._PackageableElement__Element /* 3 */,
		    Fragments._PackageableElement__ParameterableElement /* 4 */,
		    Fragments._PackageableElement__PackageableElement /* 5 */
		};
		private static final int[] __PackageableElement = { 1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Parameter =
		{
		    Fragments._Parameter__OclAny /* 0 */,
		    Fragments._Parameter__OclElement /* 1 */,
		    Fragments._Parameter__Visitable /* 2 */,
		    Fragments._Parameter__Nameable /* 2 */,
		    Fragments._Parameter__Element /* 3 */,
		    Fragments._Parameter__MultiplicityElement /* 4 */,
		    Fragments._Parameter__NamedElement /* 4 */,
		    Fragments._Parameter__TypedElement /* 5 */,
		    Fragments._Parameter__VariableDeclaration /* 6 */,
		    Fragments._Parameter__TypedMultiplicityElement /* 6 */,
		    Fragments._Parameter__Parameter /* 7 */
		};
		private static final int[] __Parameter = { 1,1,2,1,2,1,2,1 };
	
		private static final ExecutorFragment[] _ParameterableElement =
		{
		    Fragments._ParameterableElement__OclAny /* 0 */,
		    Fragments._ParameterableElement__OclElement /* 1 */,
		    Fragments._ParameterableElement__Visitable /* 2 */,
		    Fragments._ParameterableElement__Element /* 3 */,
		    Fragments._ParameterableElement__ParameterableElement /* 4 */
		};
		private static final int[] __ParameterableElement = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Pivotable =
		{
		    Fragments._Pivotable__OclAny /* 0 */,
		    Fragments._Pivotable__OclElement /* 1 */,
		    Fragments._Pivotable__Pivotable /* 2 */
		};
		private static final int[] __Pivotable = { 1,1,1 };
	
		private static final ExecutorFragment[] _Precedence =
		{
		    Fragments._Precedence__OclAny /* 0 */,
		    Fragments._Precedence__OclElement /* 1 */,
		    Fragments._Precedence__Visitable /* 2 */,
		    Fragments._Precedence__Nameable /* 2 */,
		    Fragments._Precedence__Element /* 3 */,
		    Fragments._Precedence__NamedElement /* 4 */,
		    Fragments._Precedence__Precedence /* 5 */
		};
		private static final int[] __Precedence = { 1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _PrimitiveLiteralExp =
		{
		    Fragments._PrimitiveLiteralExp__OclAny /* 0 */,
		    Fragments._PrimitiveLiteralExp__OclElement /* 1 */,
		    Fragments._PrimitiveLiteralExp__Visitable /* 2 */,
		    Fragments._PrimitiveLiteralExp__Nameable /* 2 */,
		    Fragments._PrimitiveLiteralExp__Element /* 3 */,
		    Fragments._PrimitiveLiteralExp__NamedElement /* 4 */,
		    Fragments._PrimitiveLiteralExp__TypedElement /* 5 */,
		    Fragments._PrimitiveLiteralExp__OclExpression /* 6 */,
		    Fragments._PrimitiveLiteralExp__LiteralExp /* 7 */,
		    Fragments._PrimitiveLiteralExp__PrimitiveLiteralExp /* 8 */
		};
		private static final int[] __PrimitiveLiteralExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _PrimitiveType =
		{
		    Fragments._PrimitiveType__OclAny /* 0 */,
		    Fragments._PrimitiveType__OclElement /* 1 */,
		    Fragments._PrimitiveType__Visitable /* 2 */,
		    Fragments._PrimitiveType__Nameable /* 2 */,
		    Fragments._PrimitiveType__Element /* 3 */,
		    Fragments._PrimitiveType__NamedElement /* 4 */,
		    Fragments._PrimitiveType__ParameterableElement /* 4 */,
		    Fragments._PrimitiveType__TemplateableElement /* 4 */,
		    Fragments._PrimitiveType__Type /* 5 */,
		    Fragments._PrimitiveType__Namespace /* 5 */,
		    Fragments._PrimitiveType__Class /* 6 */,
		    Fragments._PrimitiveType__DataType /* 7 */,
		    Fragments._PrimitiveType__PrimitiveType /* 8 */
		};
		private static final int[] __PrimitiveType = { 1,1,2,1,3,2,1,1,1 };
	
		private static final ExecutorFragment[] _Property =
		{
		    Fragments._Property__OclAny /* 0 */,
		    Fragments._Property__OclElement /* 1 */,
		    Fragments._Property__Visitable /* 2 */,
		    Fragments._Property__Nameable /* 2 */,
		    Fragments._Property__Element /* 3 */,
		    Fragments._Property__MultiplicityElement /* 4 */,
		    Fragments._Property__NamedElement /* 4 */,
		    Fragments._Property__ParameterableElement /* 4 */,
		    Fragments._Property__TypedElement /* 5 */,
		    Fragments._Property__TypedMultiplicityElement /* 6 */,
		    Fragments._Property__Feature /* 7 */,
		    Fragments._Property__Property /* 8 */
		};
		private static final int[] __Property = { 1,1,2,1,3,1,1,1,1 };
	
		private static final ExecutorFragment[] _PropertyCallExp =
		{
		    Fragments._PropertyCallExp__OclAny /* 0 */,
		    Fragments._PropertyCallExp__OclElement /* 1 */,
		    Fragments._PropertyCallExp__Visitable /* 2 */,
		    Fragments._PropertyCallExp__Nameable /* 2 */,
		    Fragments._PropertyCallExp__Element /* 3 */,
		    Fragments._PropertyCallExp__NamedElement /* 4 */,
		    Fragments._PropertyCallExp__TypedElement /* 5 */,
		    Fragments._PropertyCallExp__OclExpression /* 6 */,
		    Fragments._PropertyCallExp__CallExp /* 7 */,
		    Fragments._PropertyCallExp__FeatureCallExp /* 8 */,
		    Fragments._PropertyCallExp__NavigationCallExp /* 9 */,
		    Fragments._PropertyCallExp__PropertyCallExp /* 10 */
		};
		private static final int[] __PropertyCallExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _RealLiteralExp =
		{
		    Fragments._RealLiteralExp__OclAny /* 0 */,
		    Fragments._RealLiteralExp__OclElement /* 1 */,
		    Fragments._RealLiteralExp__Visitable /* 2 */,
		    Fragments._RealLiteralExp__Nameable /* 2 */,
		    Fragments._RealLiteralExp__Element /* 3 */,
		    Fragments._RealLiteralExp__NamedElement /* 4 */,
		    Fragments._RealLiteralExp__TypedElement /* 5 */,
		    Fragments._RealLiteralExp__OclExpression /* 6 */,
		    Fragments._RealLiteralExp__LiteralExp /* 7 */,
		    Fragments._RealLiteralExp__PrimitiveLiteralExp /* 8 */,
		    Fragments._RealLiteralExp__NumericLiteralExp /* 9 */,
		    Fragments._RealLiteralExp__RealLiteralExp /* 10 */
		};
		private static final int[] __RealLiteralExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _SelfType =
		{
		    Fragments._SelfType__OclAny /* 0 */,
		    Fragments._SelfType__OclElement /* 1 */,
		    Fragments._SelfType__Visitable /* 2 */,
		    Fragments._SelfType__Nameable /* 2 */,
		    Fragments._SelfType__Element /* 3 */,
		    Fragments._SelfType__TemplateableElement /* 4 */,
		    Fragments._SelfType__NamedElement /* 4 */,
		    Fragments._SelfType__ParameterableElement /* 4 */,
		    Fragments._SelfType__Namespace /* 5 */,
		    Fragments._SelfType__Type /* 5 */,
		    Fragments._SelfType__Class /* 6 */,
		    Fragments._SelfType__SelfType /* 7 */
		};
		private static final int[] __SelfType = { 1,1,2,1,3,2,1,1 };
	
		private static final ExecutorFragment[] _SendSignalAction =
		{
		    Fragments._SendSignalAction__OclAny /* 0 */,
		    Fragments._SendSignalAction__OclElement /* 1 */,
		    Fragments._SendSignalAction__Visitable /* 2 */,
		    Fragments._SendSignalAction__Nameable /* 2 */,
		    Fragments._SendSignalAction__Element /* 3 */,
		    Fragments._SendSignalAction__NamedElement /* 4 */,
		    Fragments._SendSignalAction__SendSignalAction /* 5 */
		};
		private static final int[] __SendSignalAction = { 1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _SequenceType =
		{
		    Fragments._SequenceType__OclAny /* 0 */,
		    Fragments._SequenceType__OclElement /* 1 */,
		    Fragments._SequenceType__Visitable /* 2 */,
		    Fragments._SequenceType__Nameable /* 2 */,
		    Fragments._SequenceType__Element /* 3 */,
		    Fragments._SequenceType__NamedElement /* 4 */,
		    Fragments._SequenceType__ParameterableElement /* 4 */,
		    Fragments._SequenceType__TemplateableElement /* 4 */,
		    Fragments._SequenceType__Type /* 5 */,
		    Fragments._SequenceType__Namespace /* 5 */,
		    Fragments._SequenceType__Class /* 6 */,
		    Fragments._SequenceType__DataType /* 7 */,
		    Fragments._SequenceType__CollectionType /* 8 */,
		    Fragments._SequenceType__SequenceType /* 9 */
		};
		private static final int[] __SequenceType = { 1,1,2,1,3,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _SetType =
		{
		    Fragments._SetType__OclAny /* 0 */,
		    Fragments._SetType__OclElement /* 1 */,
		    Fragments._SetType__Visitable /* 2 */,
		    Fragments._SetType__Nameable /* 2 */,
		    Fragments._SetType__Element /* 3 */,
		    Fragments._SetType__NamedElement /* 4 */,
		    Fragments._SetType__ParameterableElement /* 4 */,
		    Fragments._SetType__TemplateableElement /* 4 */,
		    Fragments._SetType__Type /* 5 */,
		    Fragments._SetType__Namespace /* 5 */,
		    Fragments._SetType__Class /* 6 */,
		    Fragments._SetType__DataType /* 7 */,
		    Fragments._SetType__CollectionType /* 8 */,
		    Fragments._SetType__SetType /* 9 */
		};
		private static final int[] __SetType = { 1,1,2,1,3,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _Signal =
		{
		    Fragments._Signal__OclAny /* 0 */,
		    Fragments._Signal__OclElement /* 1 */,
		    Fragments._Signal__Visitable /* 2 */,
		    Fragments._Signal__Nameable /* 2 */,
		    Fragments._Signal__Element /* 3 */,
		    Fragments._Signal__NamedElement /* 4 */,
		    Fragments._Signal__Signal /* 5 */
		};
		private static final int[] __Signal = { 1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _State =
		{
		    Fragments._State__OclAny /* 0 */,
		    Fragments._State__OclElement /* 1 */,
		    Fragments._State__Visitable /* 2 */,
		    Fragments._State__Nameable /* 2 */,
		    Fragments._State__Element /* 3 */,
		    Fragments._State__NamedElement /* 4 */,
		    Fragments._State__State /* 5 */
		};
		private static final int[] __State = { 1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _StateExp =
		{
		    Fragments._StateExp__OclAny /* 0 */,
		    Fragments._StateExp__OclElement /* 1 */,
		    Fragments._StateExp__Visitable /* 2 */,
		    Fragments._StateExp__Nameable /* 2 */,
		    Fragments._StateExp__Element /* 3 */,
		    Fragments._StateExp__NamedElement /* 4 */,
		    Fragments._StateExp__TypedElement /* 5 */,
		    Fragments._StateExp__OclExpression /* 6 */,
		    Fragments._StateExp__StateExp /* 7 */
		};
		private static final int[] __StateExp = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _StringLiteralExp =
		{
		    Fragments._StringLiteralExp__OclAny /* 0 */,
		    Fragments._StringLiteralExp__OclElement /* 1 */,
		    Fragments._StringLiteralExp__Visitable /* 2 */,
		    Fragments._StringLiteralExp__Nameable /* 2 */,
		    Fragments._StringLiteralExp__Element /* 3 */,
		    Fragments._StringLiteralExp__NamedElement /* 4 */,
		    Fragments._StringLiteralExp__TypedElement /* 5 */,
		    Fragments._StringLiteralExp__OclExpression /* 6 */,
		    Fragments._StringLiteralExp__LiteralExp /* 7 */,
		    Fragments._StringLiteralExp__PrimitiveLiteralExp /* 8 */,
		    Fragments._StringLiteralExp__StringLiteralExp /* 9 */
		};
		private static final int[] __StringLiteralExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TemplateBinding =
		{
		    Fragments._TemplateBinding__OclAny /* 0 */,
		    Fragments._TemplateBinding__OclElement /* 1 */,
		    Fragments._TemplateBinding__Visitable /* 2 */,
		    Fragments._TemplateBinding__Element /* 3 */,
		    Fragments._TemplateBinding__TemplateBinding /* 4 */
		};
		private static final int[] __TemplateBinding = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TemplateParameter =
		{
		    Fragments._TemplateParameter__OclAny /* 0 */,
		    Fragments._TemplateParameter__OclElement /* 1 */,
		    Fragments._TemplateParameter__Visitable /* 2 */,
		    Fragments._TemplateParameter__Element /* 3 */,
		    Fragments._TemplateParameter__TemplateParameter /* 4 */
		};
		private static final int[] __TemplateParameter = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TemplateParameterSubstitution =
		{
		    Fragments._TemplateParameterSubstitution__OclAny /* 0 */,
		    Fragments._TemplateParameterSubstitution__OclElement /* 1 */,
		    Fragments._TemplateParameterSubstitution__Visitable /* 2 */,
		    Fragments._TemplateParameterSubstitution__Element /* 3 */,
		    Fragments._TemplateParameterSubstitution__TemplateParameterSubstitution /* 4 */
		};
		private static final int[] __TemplateParameterSubstitution = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TemplateParameterType =
		{
		    Fragments._TemplateParameterType__OclAny /* 0 */,
		    Fragments._TemplateParameterType__OclElement /* 1 */,
		    Fragments._TemplateParameterType__Visitable /* 2 */,
		    Fragments._TemplateParameterType__Nameable /* 2 */,
		    Fragments._TemplateParameterType__Element /* 3 */,
		    Fragments._TemplateParameterType__TemplateableElement /* 4 */,
		    Fragments._TemplateParameterType__NamedElement /* 4 */,
		    Fragments._TemplateParameterType__ParameterableElement /* 4 */,
		    Fragments._TemplateParameterType__Type /* 5 */,
		    Fragments._TemplateParameterType__TemplateParameterType /* 6 */
		};
		private static final int[] __TemplateParameterType = { 1,1,2,1,3,1,1 };
	
		private static final ExecutorFragment[] _TemplateSignature =
		{
		    Fragments._TemplateSignature__OclAny /* 0 */,
		    Fragments._TemplateSignature__OclElement /* 1 */,
		    Fragments._TemplateSignature__Visitable /* 2 */,
		    Fragments._TemplateSignature__Element /* 3 */,
		    Fragments._TemplateSignature__TemplateSignature /* 4 */
		};
		private static final int[] __TemplateSignature = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TemplateableElement =
		{
		    Fragments._TemplateableElement__OclAny /* 0 */,
		    Fragments._TemplateableElement__OclElement /* 1 */,
		    Fragments._TemplateableElement__Visitable /* 2 */,
		    Fragments._TemplateableElement__Element /* 3 */,
		    Fragments._TemplateableElement__TemplateableElement /* 4 */
		};
		private static final int[] __TemplateableElement = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Throwable =
		{
		    Fragments._Throwable__Throwable /* 0 */
		};
		private static final int[] __Throwable = { 1 };
	
		private static final ExecutorFragment[] _TupleLiteralExp =
		{
		    Fragments._TupleLiteralExp__OclAny /* 0 */,
		    Fragments._TupleLiteralExp__OclElement /* 1 */,
		    Fragments._TupleLiteralExp__Visitable /* 2 */,
		    Fragments._TupleLiteralExp__Nameable /* 2 */,
		    Fragments._TupleLiteralExp__Element /* 3 */,
		    Fragments._TupleLiteralExp__NamedElement /* 4 */,
		    Fragments._TupleLiteralExp__TypedElement /* 5 */,
		    Fragments._TupleLiteralExp__OclExpression /* 6 */,
		    Fragments._TupleLiteralExp__LiteralExp /* 7 */,
		    Fragments._TupleLiteralExp__TupleLiteralExp /* 8 */
		};
		private static final int[] __TupleLiteralExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TupleLiteralPart =
		{
		    Fragments._TupleLiteralPart__OclAny /* 0 */,
		    Fragments._TupleLiteralPart__OclElement /* 1 */,
		    Fragments._TupleLiteralPart__Visitable /* 2 */,
		    Fragments._TupleLiteralPart__Nameable /* 2 */,
		    Fragments._TupleLiteralPart__Element /* 3 */,
		    Fragments._TupleLiteralPart__NamedElement /* 4 */,
		    Fragments._TupleLiteralPart__TypedElement /* 5 */,
		    Fragments._TupleLiteralPart__VariableDeclaration /* 6 */,
		    Fragments._TupleLiteralPart__TupleLiteralPart /* 7 */
		};
		private static final int[] __TupleLiteralPart = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TupleType =
		{
		    Fragments._TupleType__OclAny /* 0 */,
		    Fragments._TupleType__OclElement /* 1 */,
		    Fragments._TupleType__Visitable /* 2 */,
		    Fragments._TupleType__Nameable /* 2 */,
		    Fragments._TupleType__Element /* 3 */,
		    Fragments._TupleType__NamedElement /* 4 */,
		    Fragments._TupleType__ParameterableElement /* 4 */,
		    Fragments._TupleType__TemplateableElement /* 4 */,
		    Fragments._TupleType__Type /* 5 */,
		    Fragments._TupleType__Namespace /* 5 */,
		    Fragments._TupleType__Class /* 6 */,
		    Fragments._TupleType__DataType /* 7 */,
		    Fragments._TupleType__TupleType /* 8 */
		};
		private static final int[] __TupleType = { 1,1,2,1,3,2,1,1,1 };
	
		private static final ExecutorFragment[] _Type =
		{
		    Fragments._Type__OclAny /* 0 */,
		    Fragments._Type__OclElement /* 1 */,
		    Fragments._Type__Visitable /* 2 */,
		    Fragments._Type__Nameable /* 2 */,
		    Fragments._Type__Element /* 3 */,
		    Fragments._Type__TemplateableElement /* 4 */,
		    Fragments._Type__NamedElement /* 4 */,
		    Fragments._Type__ParameterableElement /* 4 */,
		    Fragments._Type__Type /* 5 */
		};
		private static final int[] __Type = { 1,1,2,1,3,1 };
	
		private static final ExecutorFragment[] _TypeExp =
		{
		    Fragments._TypeExp__OclAny /* 0 */,
		    Fragments._TypeExp__OclElement /* 1 */,
		    Fragments._TypeExp__Visitable /* 2 */,
		    Fragments._TypeExp__Nameable /* 2 */,
		    Fragments._TypeExp__Element /* 3 */,
		    Fragments._TypeExp__NamedElement /* 4 */,
		    Fragments._TypeExp__TypedElement /* 5 */,
		    Fragments._TypeExp__OclExpression /* 6 */,
		    Fragments._TypeExp__TypeExp /* 7 */
		};
		private static final int[] __TypeExp = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TypeTemplateParameter =
		{
		    Fragments._TypeTemplateParameter__OclAny /* 0 */,
		    Fragments._TypeTemplateParameter__OclElement /* 1 */,
		    Fragments._TypeTemplateParameter__Visitable /* 2 */,
		    Fragments._TypeTemplateParameter__Element /* 3 */,
		    Fragments._TypeTemplateParameter__TemplateParameter /* 4 */,
		    Fragments._TypeTemplateParameter__TypeTemplateParameter /* 5 */
		};
		private static final int[] __TypeTemplateParameter = { 1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TypedElement =
		{
		    Fragments._TypedElement__OclAny /* 0 */,
		    Fragments._TypedElement__OclElement /* 1 */,
		    Fragments._TypedElement__Visitable /* 2 */,
		    Fragments._TypedElement__Nameable /* 2 */,
		    Fragments._TypedElement__Element /* 3 */,
		    Fragments._TypedElement__NamedElement /* 4 */,
		    Fragments._TypedElement__TypedElement /* 5 */
		};
		private static final int[] __TypedElement = { 1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _TypedMultiplicityElement =
		{
		    Fragments._TypedMultiplicityElement__OclAny /* 0 */,
		    Fragments._TypedMultiplicityElement__OclElement /* 1 */,
		    Fragments._TypedMultiplicityElement__Visitable /* 2 */,
		    Fragments._TypedMultiplicityElement__Nameable /* 2 */,
		    Fragments._TypedMultiplicityElement__Element /* 3 */,
		    Fragments._TypedMultiplicityElement__MultiplicityElement /* 4 */,
		    Fragments._TypedMultiplicityElement__NamedElement /* 4 */,
		    Fragments._TypedMultiplicityElement__TypedElement /* 5 */,
		    Fragments._TypedMultiplicityElement__TypedMultiplicityElement /* 6 */
		};
		private static final int[] __TypedMultiplicityElement = { 1,1,2,1,2,1,1 };
	
		private static final ExecutorFragment[] _UnlimitedNaturalLiteralExp =
		{
		    Fragments._UnlimitedNaturalLiteralExp__OclAny /* 0 */,
		    Fragments._UnlimitedNaturalLiteralExp__OclElement /* 1 */,
		    Fragments._UnlimitedNaturalLiteralExp__Visitable /* 2 */,
		    Fragments._UnlimitedNaturalLiteralExp__Nameable /* 2 */,
		    Fragments._UnlimitedNaturalLiteralExp__Element /* 3 */,
		    Fragments._UnlimitedNaturalLiteralExp__NamedElement /* 4 */,
		    Fragments._UnlimitedNaturalLiteralExp__TypedElement /* 5 */,
		    Fragments._UnlimitedNaturalLiteralExp__OclExpression /* 6 */,
		    Fragments._UnlimitedNaturalLiteralExp__LiteralExp /* 7 */,
		    Fragments._UnlimitedNaturalLiteralExp__PrimitiveLiteralExp /* 8 */,
		    Fragments._UnlimitedNaturalLiteralExp__NumericLiteralExp /* 9 */,
		    Fragments._UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp /* 10 */
		};
		private static final int[] __UnlimitedNaturalLiteralExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _UnspecifiedType =
		{
		    Fragments._UnspecifiedType__OclAny /* 0 */,
		    Fragments._UnspecifiedType__OclElement /* 1 */,
		    Fragments._UnspecifiedType__Visitable /* 2 */,
		    Fragments._UnspecifiedType__Nameable /* 2 */,
		    Fragments._UnspecifiedType__Element /* 3 */,
		    Fragments._UnspecifiedType__TemplateableElement /* 4 */,
		    Fragments._UnspecifiedType__NamedElement /* 4 */,
		    Fragments._UnspecifiedType__ParameterableElement /* 4 */,
		    Fragments._UnspecifiedType__Namespace /* 5 */,
		    Fragments._UnspecifiedType__Type /* 5 */,
		    Fragments._UnspecifiedType__Class /* 6 */,
		    Fragments._UnspecifiedType__UnspecifiedType /* 7 */
		};
		private static final int[] __UnspecifiedType = { 1,1,2,1,3,2,1,1 };
	
		private static final ExecutorFragment[] _UnspecifiedValueExp =
		{
		    Fragments._UnspecifiedValueExp__OclAny /* 0 */,
		    Fragments._UnspecifiedValueExp__OclElement /* 1 */,
		    Fragments._UnspecifiedValueExp__Visitable /* 2 */,
		    Fragments._UnspecifiedValueExp__Nameable /* 2 */,
		    Fragments._UnspecifiedValueExp__Element /* 3 */,
		    Fragments._UnspecifiedValueExp__NamedElement /* 4 */,
		    Fragments._UnspecifiedValueExp__TypedElement /* 5 */,
		    Fragments._UnspecifiedValueExp__OclExpression /* 6 */,
		    Fragments._UnspecifiedValueExp__UnspecifiedValueExp /* 7 */
		};
		private static final int[] __UnspecifiedValueExp = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _ValueSpecification =
		{
		    Fragments._ValueSpecification__OclAny /* 0 */,
		    Fragments._ValueSpecification__OclElement /* 1 */,
		    Fragments._ValueSpecification__Visitable /* 2 */,
		    Fragments._ValueSpecification__Nameable /* 2 */,
		    Fragments._ValueSpecification__Element /* 3 */,
		    Fragments._ValueSpecification__NamedElement /* 4 */,
		    Fragments._ValueSpecification__ParameterableElement /* 4 */,
		    Fragments._ValueSpecification__TypedElement /* 5 */,
		    Fragments._ValueSpecification__ValueSpecification /* 6 */
		};
		private static final int[] __ValueSpecification = { 1,1,2,1,2,1,1 };
	
		private static final ExecutorFragment[] _Variable =
		{
		    Fragments._Variable__OclAny /* 0 */,
		    Fragments._Variable__OclElement /* 1 */,
		    Fragments._Variable__Visitable /* 2 */,
		    Fragments._Variable__Nameable /* 2 */,
		    Fragments._Variable__Element /* 3 */,
		    Fragments._Variable__NamedElement /* 4 */,
		    Fragments._Variable__TypedElement /* 5 */,
		    Fragments._Variable__VariableDeclaration /* 6 */,
		    Fragments._Variable__Variable /* 7 */
		};
		private static final int[] __Variable = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _VariableDeclaration =
		{
		    Fragments._VariableDeclaration__OclAny /* 0 */,
		    Fragments._VariableDeclaration__OclElement /* 1 */,
		    Fragments._VariableDeclaration__Visitable /* 2 */,
		    Fragments._VariableDeclaration__Nameable /* 2 */,
		    Fragments._VariableDeclaration__Element /* 3 */,
		    Fragments._VariableDeclaration__NamedElement /* 4 */,
		    Fragments._VariableDeclaration__TypedElement /* 5 */,
		    Fragments._VariableDeclaration__VariableDeclaration /* 6 */
		};
		private static final int[] __VariableDeclaration = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _VariableExp =
		{
		    Fragments._VariableExp__OclAny /* 0 */,
		    Fragments._VariableExp__OclElement /* 1 */,
		    Fragments._VariableExp__Visitable /* 2 */,
		    Fragments._VariableExp__Nameable /* 2 */,
		    Fragments._VariableExp__Element /* 3 */,
		    Fragments._VariableExp__NamedElement /* 4 */,
		    Fragments._VariableExp__TypedElement /* 5 */,
		    Fragments._VariableExp__OclExpression /* 6 */,
		    Fragments._VariableExp__VariableExp /* 7 */
		};
		private static final int[] __VariableExp = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Visitable =
		{
		    Fragments._Visitable__OclAny /* 0 */,
		    Fragments._Visitable__OclElement /* 1 */,
		    Fragments._Visitable__Visitable /* 2 */
		};
		private static final int[] __Visitable = { 1,1,1 };
	
		private static final ExecutorFragment[] _Visitor =
		{
		    Fragments._Visitor__OclAny /* 0 */,
		    Fragments._Visitor__OclElement /* 1 */,
		    Fragments._Visitor__Visitor /* 2 */
		};
		private static final int[] __Visitor = { 1,1,1 };
	
		private static final ExecutorFragment[] _VoidType =
		{
		    Fragments._VoidType__OclAny /* 0 */,
		    Fragments._VoidType__OclElement /* 1 */,
		    Fragments._VoidType__Visitable /* 2 */,
		    Fragments._VoidType__Nameable /* 2 */,
		    Fragments._VoidType__Element /* 3 */,
		    Fragments._VoidType__TemplateableElement /* 4 */,
		    Fragments._VoidType__NamedElement /* 4 */,
		    Fragments._VoidType__ParameterableElement /* 4 */,
		    Fragments._VoidType__Namespace /* 5 */,
		    Fragments._VoidType__Type /* 5 */,
		    Fragments._VoidType__Class /* 6 */,
		    Fragments._VoidType__VoidType /* 7 */
		};
		private static final int[] __VoidType = { 1,1,2,1,3,2,1,1 };
	
		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Annotation.initFragments(_Annotation, __Annotation);
			Types._AnyType.initFragments(_AnyType, __AnyType);
			Types._AssociationClass.initFragments(_AssociationClass, __AssociationClass);
			Types._AssociationClassCallExp.initFragments(_AssociationClassCallExp, __AssociationClassCallExp);
			Types._AssociativityKind.initFragments(_AssociativityKind, __AssociativityKind);
			Types._BagType.initFragments(_BagType, __BagType);
			Types._BooleanLiteralExp.initFragments(_BooleanLiteralExp, __BooleanLiteralExp);
			Types._CallExp.initFragments(_CallExp, __CallExp);
			Types._CallOperationAction.initFragments(_CallOperationAction, __CallOperationAction);
			Types._Class.initFragments(_Class, __Class, PivotPackage.Literals.CLASS);
			Types._ClassifierType.initFragments(_ClassifierType, __ClassifierType);
			Types._CollectionItem.initFragments(_CollectionItem, __CollectionItem);
			Types._CollectionKind.initFragments(_CollectionKind, __CollectionKind);
			Types._CollectionLiteralExp.initFragments(_CollectionLiteralExp, __CollectionLiteralExp);
			Types._CollectionLiteralPart.initFragments(_CollectionLiteralPart, __CollectionLiteralPart);
			Types._CollectionRange.initFragments(_CollectionRange, __CollectionRange);
			Types._CollectionType.initFragments(_CollectionType, __CollectionType);
			Types._Comment.initFragments(_Comment, __Comment);
			Types._Constraint.initFragments(_Constraint, __Constraint);
			Types._ConstructorExp.initFragments(_ConstructorExp, __ConstructorExp);
			Types._ConstructorPart.initFragments(_ConstructorPart, __ConstructorPart);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._Detail.initFragments(_Detail, __Detail);
			Types._Element.initFragments(_Element, __Element);
			Types._EnumLiteralExp.initFragments(_EnumLiteralExp, __EnumLiteralExp);
			Types._Enumeration.initFragments(_Enumeration, __Enumeration, PivotPackage.Literals.ENUMERATION);
			Types._EnumerationLiteral.initFragments(_EnumerationLiteral, __EnumerationLiteral, PivotPackage.Literals.ENUMERATION_LITERAL);
			Types._ExpressionInOcl.initFragments(_ExpressionInOcl, __ExpressionInOcl);
			Types._Feature.initFragments(_Feature, __Feature);
			Types._FeatureCallExp.initFragments(_FeatureCallExp, __FeatureCallExp);
			Types._IfExp.initFragments(_IfExp, __IfExp);
			Types._IntegerLiteralExp.initFragments(_IntegerLiteralExp, __IntegerLiteralExp);
			Types._InvalidLiteralExp.initFragments(_InvalidLiteralExp, __InvalidLiteralExp);
			Types._InvalidType.initFragments(_InvalidType, __InvalidType);
			Types._IterateExp.initFragments(_IterateExp, __IterateExp);
			Types._Iteration.initFragments(_Iteration, __Iteration);
			Types._IteratorExp.initFragments(_IteratorExp, __IteratorExp);
			Types._LambdaType.initFragments(_LambdaType, __LambdaType);
			Types._LetExp.initFragments(_LetExp, __LetExp);
			Types._Library.initFragments(_Library, __Library);
			Types._LibraryFeature.initFragments(_LibraryFeature, __LibraryFeature);
			Types._LiteralExp.initFragments(_LiteralExp, __LiteralExp);
			Types._LoopExp.initFragments(_LoopExp, __LoopExp);
			Types._MessageExp.initFragments(_MessageExp, __MessageExp);
			Types._MessageType.initFragments(_MessageType, __MessageType);
			Types._MultiplicityElement.initFragments(_MultiplicityElement, __MultiplicityElement);
			Types._Nameable.initFragments(_Nameable, __Nameable);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Namespace.initFragments(_Namespace, __Namespace);
			Types._NavigationCallExp.initFragments(_NavigationCallExp, __NavigationCallExp);
			Types._NullLiteralExp.initFragments(_NullLiteralExp, __NullLiteralExp);
			Types._NumericLiteralExp.initFragments(_NumericLiteralExp, __NumericLiteralExp);
			Types._Object.initFragments(_Object, __Object);
			Types._OclExpression.initFragments(_OclExpression, __OclExpression);
			Types._OpaqueExpression.initFragments(_OpaqueExpression, __OpaqueExpression);
			Types._Operation.initFragments(_Operation, __Operation);
			Types._OperationCallExp.initFragments(_OperationCallExp, __OperationCallExp);
			Types._OperationTemplateParameter.initFragments(_OperationTemplateParameter, __OperationTemplateParameter);
			Types._OrderedSetType.initFragments(_OrderedSetType, __OrderedSetType);
			Types._Package.initFragments(_Package, __Package);
			Types._PackageableElement.initFragments(_PackageableElement, __PackageableElement);
			Types._Parameter.initFragments(_Parameter, __Parameter);
			Types._ParameterableElement.initFragments(_ParameterableElement, __ParameterableElement);
			Types._Pivotable.initFragments(_Pivotable, __Pivotable);
			Types._Precedence.initFragments(_Precedence, __Precedence);
			Types._PrimitiveLiteralExp.initFragments(_PrimitiveLiteralExp, __PrimitiveLiteralExp);
			Types._PrimitiveType.initFragments(_PrimitiveType, __PrimitiveType);
			Types._Property.initFragments(_Property, __Property);
			Types._PropertyCallExp.initFragments(_PropertyCallExp, __PropertyCallExp);
			Types._RealLiteralExp.initFragments(_RealLiteralExp, __RealLiteralExp);
			Types._SelfType.initFragments(_SelfType, __SelfType);
			Types._SendSignalAction.initFragments(_SendSignalAction, __SendSignalAction);
			Types._SequenceType.initFragments(_SequenceType, __SequenceType);
			Types._SetType.initFragments(_SetType, __SetType);
			Types._Signal.initFragments(_Signal, __Signal);
			Types._State.initFragments(_State, __State);
			Types._StateExp.initFragments(_StateExp, __StateExp);
			Types._StringLiteralExp.initFragments(_StringLiteralExp, __StringLiteralExp);
			Types._TemplateBinding.initFragments(_TemplateBinding, __TemplateBinding);
			Types._TemplateParameter.initFragments(_TemplateParameter, __TemplateParameter);
			Types._TemplateParameterSubstitution.initFragments(_TemplateParameterSubstitution, __TemplateParameterSubstitution);
			Types._TemplateParameterType.initFragments(_TemplateParameterType, __TemplateParameterType);
			Types._TemplateSignature.initFragments(_TemplateSignature, __TemplateSignature);
			Types._TemplateableElement.initFragments(_TemplateableElement, __TemplateableElement);
			Types._Throwable.initFragments(_Throwable, __Throwable);
			Types._TupleLiteralExp.initFragments(_TupleLiteralExp, __TupleLiteralExp);
			Types._TupleLiteralPart.initFragments(_TupleLiteralPart, __TupleLiteralPart);
			Types._TupleType.initFragments(_TupleType, __TupleType);
			Types._Type.initFragments(_Type, __Type, PivotPackage.Literals.TYPE);
			Types._TypeExp.initFragments(_TypeExp, __TypeExp);
			Types._TypeTemplateParameter.initFragments(_TypeTemplateParameter, __TypeTemplateParameter);
			Types._TypedElement.initFragments(_TypedElement, __TypedElement);
			Types._TypedMultiplicityElement.initFragments(_TypedMultiplicityElement, __TypedMultiplicityElement);
			Types._UnlimitedNaturalLiteralExp.initFragments(_UnlimitedNaturalLiteralExp, __UnlimitedNaturalLiteralExp);
			Types._UnspecifiedType.initFragments(_UnspecifiedType, __UnspecifiedType);
			Types._UnspecifiedValueExp.initFragments(_UnspecifiedValueExp, __UnspecifiedValueExp);
			Types._ValueSpecification.initFragments(_ValueSpecification, __ValueSpecification);
			Types._Variable.initFragments(_Variable, __Variable);
			Types._VariableDeclaration.initFragments(_VariableDeclaration, __VariableDeclaration);
			Types._VariableExp.initFragments(_VariableExp, __VariableExp);
			Types._Visitable.initFragments(_Visitable, __Visitable);
			Types._Visitor.initFragments(_Visitor, __Visitor);
			Types._VoidType.initFragments(_VoidType, __VoidType);
		}
	
		public static void init() {}
	}
	

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		private static final ExecutorOperation[] _Annotation__Annotation = {};
		private static final ExecutorOperation[] _Annotation__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Annotation__Nameable = {};
		private static final ExecutorOperation[] _Annotation__NamedElement = {};
		private static final ExecutorOperation[] _Annotation__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Annotation__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Annotation__Visitable = {};
	
		private static final ExecutorOperation[] _AnyType__AnyType = {};
		private static final ExecutorOperation[] _AnyType__Class = {};
		private static final ExecutorOperation[] _AnyType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _AnyType__Nameable = {};
		private static final ExecutorOperation[] _AnyType__NamedElement = {};
		private static final ExecutorOperation[] _AnyType__Namespace = {};
		private static final ExecutorOperation[] _AnyType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _AnyType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _AnyType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _AnyType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _AnyType__Type = {};
		private static final ExecutorOperation[] _AnyType__Visitable = {};
	
		private static final ExecutorOperation[] _AssociationClass__AssociationClass = {};
		private static final ExecutorOperation[] _AssociationClass__Class = {};
		private static final ExecutorOperation[] _AssociationClass__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _AssociationClass__Nameable = {};
		private static final ExecutorOperation[] _AssociationClass__NamedElement = {};
		private static final ExecutorOperation[] _AssociationClass__Namespace = {};
		private static final ExecutorOperation[] _AssociationClass__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _AssociationClass__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _AssociationClass__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _AssociationClass__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _AssociationClass__Type = {};
		private static final ExecutorOperation[] _AssociationClass__Visitable = {};
	
		private static final ExecutorOperation[] _AssociationClassCallExp__AssociationClassCallExp = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__CallExp = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _AssociationClassCallExp__FeatureCallExp = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__Nameable = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__NamedElement = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__NavigationCallExp = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _AssociationClassCallExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _AssociationClassCallExp__OclExpression = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__TypedElement = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__Visitable = {};
	
		private static final ExecutorOperation[] _AssociativityKind__AssociativityKind = {};
	
		private static final ExecutorOperation[] _BagType__BagType = {};
		private static final ExecutorOperation[] _BagType__Class = {};
		private static final ExecutorOperation[] _BagType__CollectionType = {};
		private static final ExecutorOperation[] _BagType__DataType = {};
		private static final ExecutorOperation[] _BagType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _BagType__Nameable = {};
		private static final ExecutorOperation[] _BagType__NamedElement = {};
		private static final ExecutorOperation[] _BagType__Namespace = {};
		private static final ExecutorOperation[] _BagType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _BagType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _BagType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _BagType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _BagType__Type = {};
		private static final ExecutorOperation[] _BagType__Visitable = {};
	
		private static final ExecutorOperation[] _BooleanLiteralExp__BooleanLiteralExp = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _BooleanLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _BooleanLiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _BooleanLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _CallExp__CallExp = {};
		private static final ExecutorOperation[] _CallExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _CallExp__Nameable = {};
		private static final ExecutorOperation[] _CallExp__NamedElement = {};
		private static final ExecutorOperation[] _CallExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CallExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _CallExp__OclExpression = {};
		private static final ExecutorOperation[] _CallExp__TypedElement = {};
		private static final ExecutorOperation[] _CallExp__Visitable = {};
	
		private static final ExecutorOperation[] _CallOperationAction__CallOperationAction = {};
		private static final ExecutorOperation[] _CallOperationAction__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _CallOperationAction__Nameable = {};
		private static final ExecutorOperation[] _CallOperationAction__NamedElement = {};
		private static final ExecutorOperation[] _CallOperationAction__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CallOperationAction__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _CallOperationAction__Visitable = {};
	
		private static final ExecutorOperation[] _Class__Class = {};
		private static final ExecutorOperation[] _Class__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Class__Nameable = {};
		private static final ExecutorOperation[] _Class__NamedElement = {};
		private static final ExecutorOperation[] _Class__Namespace = {};
		private static final ExecutorOperation[] _Class__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Class__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Class__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _Class__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Class__Type = {};
		private static final ExecutorOperation[] _Class__Visitable = {};
	
		private static final ExecutorOperation[] _ClassifierType__ClassifierType = {};
		private static final ExecutorOperation[] _ClassifierType__Class = {};
		private static final ExecutorOperation[] _ClassifierType__DataType = {};
		private static final ExecutorOperation[] _ClassifierType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _ClassifierType__Nameable = {};
		private static final ExecutorOperation[] _ClassifierType__NamedElement = {};
		private static final ExecutorOperation[] _ClassifierType__Namespace = {};
		private static final ExecutorOperation[] _ClassifierType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _ClassifierType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _ClassifierType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _ClassifierType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _ClassifierType__Type = {};
		private static final ExecutorOperation[] _ClassifierType__Visitable = {};
	
		private static final ExecutorOperation[] _CollectionItem__CollectionItem = {};
		private static final ExecutorOperation[] _CollectionItem__CollectionLiteralPart = {};
		private static final ExecutorOperation[] _CollectionItem__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _CollectionItem__Nameable = {};
		private static final ExecutorOperation[] _CollectionItem__NamedElement = {};
		private static final ExecutorOperation[] _CollectionItem__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CollectionItem__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _CollectionItem__TypedElement = {};
		private static final ExecutorOperation[] _CollectionItem__Visitable = {};
	
		private static final ExecutorOperation[] _CollectionKind__CollectionKind = {};
	
		private static final ExecutorOperation[] _CollectionLiteralExp__CollectionLiteralExp = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _CollectionLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CollectionLiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _CollectionLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _CollectionLiteralPart__CollectionLiteralPart = {};
		private static final ExecutorOperation[] _CollectionLiteralPart__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _CollectionLiteralPart__Nameable = {};
		private static final ExecutorOperation[] _CollectionLiteralPart__NamedElement = {};
		private static final ExecutorOperation[] _CollectionLiteralPart__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CollectionLiteralPart__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _CollectionLiteralPart__TypedElement = {};
		private static final ExecutorOperation[] _CollectionLiteralPart__Visitable = {};
	
		private static final ExecutorOperation[] _CollectionRange__CollectionRange = {};
		private static final ExecutorOperation[] _CollectionRange__CollectionLiteralPart = {};
		private static final ExecutorOperation[] _CollectionRange__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _CollectionRange__Nameable = {};
		private static final ExecutorOperation[] _CollectionRange__NamedElement = {};
		private static final ExecutorOperation[] _CollectionRange__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CollectionRange__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _CollectionRange__TypedElement = {};
		private static final ExecutorOperation[] _CollectionRange__Visitable = {};
	
		private static final ExecutorOperation[] _CollectionType__CollectionType = {};
		private static final ExecutorOperation[] _CollectionType__Class = {};
		private static final ExecutorOperation[] _CollectionType__DataType = {};
		private static final ExecutorOperation[] _CollectionType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _CollectionType__Nameable = {};
		private static final ExecutorOperation[] _CollectionType__NamedElement = {};
		private static final ExecutorOperation[] _CollectionType__Namespace = {};
		private static final ExecutorOperation[] _CollectionType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CollectionType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _CollectionType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _CollectionType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _CollectionType__Type = {};
		private static final ExecutorOperation[] _CollectionType__Visitable = {};
	
		private static final ExecutorOperation[] _Comment__Comment = {};
		private static final ExecutorOperation[] _Comment__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Comment__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Comment__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Comment__Visitable = {};
	
		private static final ExecutorOperation[] _Constraint__Constraint = {};
		private static final ExecutorOperation[] _Constraint__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Constraint__Nameable = {};
		private static final ExecutorOperation[] _Constraint__NamedElement = {};
		private static final ExecutorOperation[] _Constraint__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Constraint__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Constraint__Visitable = {};
	
		private static final ExecutorOperation[] _ConstructorExp__ConstructorExp = {};
		private static final ExecutorOperation[] _ConstructorExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _ConstructorExp__Nameable = {};
		private static final ExecutorOperation[] _ConstructorExp__NamedElement = {};
		private static final ExecutorOperation[] _ConstructorExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _ConstructorExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _ConstructorExp__OclExpression = {};
		private static final ExecutorOperation[] _ConstructorExp__TypedElement = {};
		private static final ExecutorOperation[] _ConstructorExp__Visitable = {};
	
		private static final ExecutorOperation[] _ConstructorPart__ConstructorPart = {};
		private static final ExecutorOperation[] _ConstructorPart__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _ConstructorPart__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _ConstructorPart__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _ConstructorPart__Visitable = {};
	
		private static final ExecutorOperation[] _DataType__DataType = {};
		private static final ExecutorOperation[] _DataType__Class = {};
		private static final ExecutorOperation[] _DataType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _DataType__Nameable = {};
		private static final ExecutorOperation[] _DataType__NamedElement = {};
		private static final ExecutorOperation[] _DataType__Namespace = {};
		private static final ExecutorOperation[] _DataType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _DataType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _DataType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _DataType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _DataType__Type = {};
		private static final ExecutorOperation[] _DataType__Visitable = {};
	
		private static final ExecutorOperation[] _Detail__Detail = {};
		private static final ExecutorOperation[] _Detail__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Detail__Nameable = {};
		private static final ExecutorOperation[] _Detail__NamedElement = {};
		private static final ExecutorOperation[] _Detail__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Detail__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Detail__Visitable = {};
	
		private static final ExecutorOperation[] _Element__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Element__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Element__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Element__Visitable = {};
	
		private static final ExecutorOperation[] _EnumLiteralExp__EnumLiteralExp = {};
		private static final ExecutorOperation[] _EnumLiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _EnumLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _EnumLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _EnumLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _EnumLiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _EnumLiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _EnumLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _EnumLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _EnumLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _Enumeration__Enumeration = {};
		private static final ExecutorOperation[] _Enumeration__Class = {};
		private static final ExecutorOperation[] _Enumeration__DataType = {};
		private static final ExecutorOperation[] _Enumeration__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Enumeration__Nameable = {};
		private static final ExecutorOperation[] _Enumeration__NamedElement = {};
		private static final ExecutorOperation[] _Enumeration__Namespace = {};
		private static final ExecutorOperation[] _Enumeration__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Enumeration__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Enumeration__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _Enumeration__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Enumeration__Type = {};
		private static final ExecutorOperation[] _Enumeration__Visitable = {};
	
		private static final ExecutorOperation[] _EnumerationLiteral__EnumerationLiteral = {};
		private static final ExecutorOperation[] _EnumerationLiteral__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _EnumerationLiteral__Nameable = {};
		private static final ExecutorOperation[] _EnumerationLiteral__NamedElement = {};
		private static final ExecutorOperation[] _EnumerationLiteral__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _EnumerationLiteral__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _EnumerationLiteral__Visitable = {};
	
		private static final ExecutorOperation[] _ExpressionInOcl__ExpressionInOcl = {};
		private static final ExecutorOperation[] _ExpressionInOcl__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _ExpressionInOcl__Nameable = {};
		private static final ExecutorOperation[] _ExpressionInOcl__NamedElement = {};
		private static final ExecutorOperation[] _ExpressionInOcl__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _ExpressionInOcl__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _ExpressionInOcl__OpaqueExpression = {};
		private static final ExecutorOperation[] _ExpressionInOcl__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _ExpressionInOcl__TypedElement = {};
		private static final ExecutorOperation[] _ExpressionInOcl__ValueSpecification = {
		    PivotTables.Operations._ValueSpecification__booleanValue /* booleanValue() */,
		    PivotTables.Operations._ValueSpecification__integerValue /* integerValue() */,
		    PivotTables.Operations._ValueSpecification__isComputable /* isComputable() */,
		    PivotTables.Operations._ValueSpecification__isNull /* isNull() */,
		    PivotTables.Operations._ValueSpecification__stringValue /* stringValue() */,
		    PivotTables.Operations._ValueSpecification__unlimitedValue /* unlimitedValue() */
		};
		private static final ExecutorOperation[] _ExpressionInOcl__Visitable = {};
	
		private static final ExecutorOperation[] _Feature__Feature = {};
		private static final ExecutorOperation[] _Feature__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Feature__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _Feature__Nameable = {};
		private static final ExecutorOperation[] _Feature__NamedElement = {};
		private static final ExecutorOperation[] _Feature__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Feature__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Feature__TypedElement = {};
		private static final ExecutorOperation[] _Feature__TypedMultiplicityElement = {
		    PivotTables.Operations._TypedMultiplicityElement__CompatibleBody /* CompatibleBody(ValueSpecification) */,
		    PivotTables.Operations._TypedMultiplicityElement__makeParameter /* makeParameter() */
		};
		private static final ExecutorOperation[] _Feature__Visitable = {};
	
		private static final ExecutorOperation[] _FeatureCallExp__FeatureCallExp = {};
		private static final ExecutorOperation[] _FeatureCallExp__CallExp = {};
		private static final ExecutorOperation[] _FeatureCallExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _FeatureCallExp__Nameable = {};
		private static final ExecutorOperation[] _FeatureCallExp__NamedElement = {};
		private static final ExecutorOperation[] _FeatureCallExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _FeatureCallExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _FeatureCallExp__OclExpression = {};
		private static final ExecutorOperation[] _FeatureCallExp__TypedElement = {};
		private static final ExecutorOperation[] _FeatureCallExp__Visitable = {};
	
		private static final ExecutorOperation[] _IfExp__IfExp = {};
		private static final ExecutorOperation[] _IfExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _IfExp__Nameable = {};
		private static final ExecutorOperation[] _IfExp__NamedElement = {};
		private static final ExecutorOperation[] _IfExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _IfExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _IfExp__OclExpression = {};
		private static final ExecutorOperation[] _IfExp__TypedElement = {};
		private static final ExecutorOperation[] _IfExp__Visitable = {};
	
		private static final ExecutorOperation[] _IntegerLiteralExp__IntegerLiteralExp = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _IntegerLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__NumericLiteralExp = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _IntegerLiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _IntegerLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _InvalidLiteralExp__InvalidLiteralExp = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _InvalidLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _InvalidLiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _InvalidLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _InvalidType__InvalidType = {};
		private static final ExecutorOperation[] _InvalidType__Class = {};
		private static final ExecutorOperation[] _InvalidType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _InvalidType__Nameable = {};
		private static final ExecutorOperation[] _InvalidType__NamedElement = {};
		private static final ExecutorOperation[] _InvalidType__Namespace = {};
		private static final ExecutorOperation[] _InvalidType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _InvalidType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _InvalidType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _InvalidType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _InvalidType__Type = {};
		private static final ExecutorOperation[] _InvalidType__Visitable = {};
	
		private static final ExecutorOperation[] _IterateExp__IterateExp = {};
		private static final ExecutorOperation[] _IterateExp__CallExp = {};
		private static final ExecutorOperation[] _IterateExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _IterateExp__LoopExp = {};
		private static final ExecutorOperation[] _IterateExp__Nameable = {};
		private static final ExecutorOperation[] _IterateExp__NamedElement = {};
		private static final ExecutorOperation[] _IterateExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _IterateExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _IterateExp__OclExpression = {};
		private static final ExecutorOperation[] _IterateExp__TypedElement = {};
		private static final ExecutorOperation[] _IterateExp__Visitable = {};
	
		private static final ExecutorOperation[] _Iteration__Iteration = {};
		private static final ExecutorOperation[] _Iteration__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Iteration__Feature = {};
		private static final ExecutorOperation[] _Iteration__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _Iteration__Nameable = {};
		private static final ExecutorOperation[] _Iteration__NamedElement = {};
		private static final ExecutorOperation[] _Iteration__Namespace = {};
		private static final ExecutorOperation[] _Iteration__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Iteration__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Iteration__Operation = {};
		private static final ExecutorOperation[] _Iteration__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _Iteration__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Iteration__TypedElement = {};
		private static final ExecutorOperation[] _Iteration__TypedMultiplicityElement = {
		    PivotTables.Operations._TypedMultiplicityElement__CompatibleBody /* CompatibleBody(ValueSpecification) */,
		    PivotTables.Operations._TypedMultiplicityElement__makeParameter /* makeParameter() */
		};
		private static final ExecutorOperation[] _Iteration__Visitable = {};
	
		private static final ExecutorOperation[] _IteratorExp__IteratorExp = {};
		private static final ExecutorOperation[] _IteratorExp__CallExp = {};
		private static final ExecutorOperation[] _IteratorExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _IteratorExp__LoopExp = {};
		private static final ExecutorOperation[] _IteratorExp__Nameable = {};
		private static final ExecutorOperation[] _IteratorExp__NamedElement = {};
		private static final ExecutorOperation[] _IteratorExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _IteratorExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _IteratorExp__OclExpression = {};
		private static final ExecutorOperation[] _IteratorExp__TypedElement = {};
		private static final ExecutorOperation[] _IteratorExp__Visitable = {};
	
		private static final ExecutorOperation[] _LambdaType__LambdaType = {};
		private static final ExecutorOperation[] _LambdaType__Class = {};
		private static final ExecutorOperation[] _LambdaType__DataType = {};
		private static final ExecutorOperation[] _LambdaType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _LambdaType__Nameable = {};
		private static final ExecutorOperation[] _LambdaType__NamedElement = {};
		private static final ExecutorOperation[] _LambdaType__Namespace = {};
		private static final ExecutorOperation[] _LambdaType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _LambdaType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _LambdaType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _LambdaType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _LambdaType__Type = {};
		private static final ExecutorOperation[] _LambdaType__Visitable = {};
	
		private static final ExecutorOperation[] _LetExp__LetExp = {};
		private static final ExecutorOperation[] _LetExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _LetExp__Nameable = {};
		private static final ExecutorOperation[] _LetExp__NamedElement = {};
		private static final ExecutorOperation[] _LetExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _LetExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _LetExp__OclExpression = {};
		private static final ExecutorOperation[] _LetExp__TypedElement = {};
		private static final ExecutorOperation[] _LetExp__Visitable = {};
	
		private static final ExecutorOperation[] _Library__Library = {};
		private static final ExecutorOperation[] _Library__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Library__Nameable = {};
		private static final ExecutorOperation[] _Library__NamedElement = {};
		private static final ExecutorOperation[] _Library__Namespace = {};
		private static final ExecutorOperation[] _Library__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Library__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Library__Package = {};
		private static final ExecutorOperation[] _Library__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Library__Visitable = {};
	
		private static final ExecutorOperation[] _LibraryFeature__LibraryFeature = {};
	
		private static final ExecutorOperation[] _LiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _LiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _LiteralExp__Nameable = {};
		private static final ExecutorOperation[] _LiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _LiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _LiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _LiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _LiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _LiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _LoopExp__LoopExp = {};
		private static final ExecutorOperation[] _LoopExp__CallExp = {};
		private static final ExecutorOperation[] _LoopExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _LoopExp__Nameable = {};
		private static final ExecutorOperation[] _LoopExp__NamedElement = {};
		private static final ExecutorOperation[] _LoopExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _LoopExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _LoopExp__OclExpression = {};
		private static final ExecutorOperation[] _LoopExp__TypedElement = {};
		private static final ExecutorOperation[] _LoopExp__Visitable = {};
	
		private static final ExecutorOperation[] _MessageExp__MessageExp = {};
		private static final ExecutorOperation[] _MessageExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _MessageExp__Nameable = {};
		private static final ExecutorOperation[] _MessageExp__NamedElement = {};
		private static final ExecutorOperation[] _MessageExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _MessageExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _MessageExp__OclExpression = {};
		private static final ExecutorOperation[] _MessageExp__TypedElement = {};
		private static final ExecutorOperation[] _MessageExp__Visitable = {};
	
		private static final ExecutorOperation[] _MessageType__MessageType = {};
		private static final ExecutorOperation[] _MessageType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _MessageType__Nameable = {};
		private static final ExecutorOperation[] _MessageType__NamedElement = {};
		private static final ExecutorOperation[] _MessageType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _MessageType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _MessageType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _MessageType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _MessageType__Type = {};
		private static final ExecutorOperation[] _MessageType__Visitable = {};
	
		private static final ExecutorOperation[] _MultiplicityElement__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _MultiplicityElement__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _MultiplicityElement__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _MultiplicityElement__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _MultiplicityElement__Visitable = {};
	
		private static final ExecutorOperation[] _Nameable__Nameable = {};
		private static final ExecutorOperation[] _Nameable__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Nameable__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
	
		private static final ExecutorOperation[] _NamedElement__NamedElement = {};
		private static final ExecutorOperation[] _NamedElement__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _NamedElement__Nameable = {};
		private static final ExecutorOperation[] _NamedElement__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _NamedElement__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _NamedElement__Visitable = {};
	
		private static final ExecutorOperation[] _Namespace__Namespace = {};
		private static final ExecutorOperation[] _Namespace__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Namespace__Nameable = {};
		private static final ExecutorOperation[] _Namespace__NamedElement = {};
		private static final ExecutorOperation[] _Namespace__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Namespace__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Namespace__Visitable = {};
	
		private static final ExecutorOperation[] _NavigationCallExp__NavigationCallExp = {};
		private static final ExecutorOperation[] _NavigationCallExp__CallExp = {};
		private static final ExecutorOperation[] _NavigationCallExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _NavigationCallExp__FeatureCallExp = {};
		private static final ExecutorOperation[] _NavigationCallExp__Nameable = {};
		private static final ExecutorOperation[] _NavigationCallExp__NamedElement = {};
		private static final ExecutorOperation[] _NavigationCallExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _NavigationCallExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _NavigationCallExp__OclExpression = {};
		private static final ExecutorOperation[] _NavigationCallExp__TypedElement = {};
		private static final ExecutorOperation[] _NavigationCallExp__Visitable = {};
	
		private static final ExecutorOperation[] _NullLiteralExp__NullLiteralExp = {};
		private static final ExecutorOperation[] _NullLiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _NullLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _NullLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _NullLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _NullLiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _NullLiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _NullLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _NullLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _NullLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _NullLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _NumericLiteralExp__NumericLiteralExp = {};
		private static final ExecutorOperation[] _NumericLiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _NumericLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _NumericLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _NumericLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _NumericLiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _NumericLiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _NumericLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _NumericLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _NumericLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _NumericLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _Object__Object = {};
	
		private static final ExecutorOperation[] _OclExpression__OclExpression = {};
		private static final ExecutorOperation[] _OclExpression__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _OclExpression__Nameable = {};
		private static final ExecutorOperation[] _OclExpression__NamedElement = {};
		private static final ExecutorOperation[] _OclExpression__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OclExpression__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _OclExpression__TypedElement = {};
		private static final ExecutorOperation[] _OclExpression__Visitable = {};
	
		private static final ExecutorOperation[] _OpaqueExpression__OpaqueExpression = {};
		private static final ExecutorOperation[] _OpaqueExpression__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _OpaqueExpression__Nameable = {};
		private static final ExecutorOperation[] _OpaqueExpression__NamedElement = {};
		private static final ExecutorOperation[] _OpaqueExpression__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OpaqueExpression__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _OpaqueExpression__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _OpaqueExpression__TypedElement = {};
		private static final ExecutorOperation[] _OpaqueExpression__ValueSpecification = {
		    PivotTables.Operations._ValueSpecification__booleanValue /* booleanValue() */,
		    PivotTables.Operations._ValueSpecification__integerValue /* integerValue() */,
		    PivotTables.Operations._ValueSpecification__isComputable /* isComputable() */,
		    PivotTables.Operations._ValueSpecification__isNull /* isNull() */,
		    PivotTables.Operations._ValueSpecification__stringValue /* stringValue() */,
		    PivotTables.Operations._ValueSpecification__unlimitedValue /* unlimitedValue() */
		};
		private static final ExecutorOperation[] _OpaqueExpression__Visitable = {};
	
		private static final ExecutorOperation[] _Operation__Operation = {};
		private static final ExecutorOperation[] _Operation__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Operation__Feature = {};
		private static final ExecutorOperation[] _Operation__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _Operation__Nameable = {};
		private static final ExecutorOperation[] _Operation__NamedElement = {};
		private static final ExecutorOperation[] _Operation__Namespace = {};
		private static final ExecutorOperation[] _Operation__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Operation__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Operation__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _Operation__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Operation__TypedElement = {};
		private static final ExecutorOperation[] _Operation__TypedMultiplicityElement = {
		    PivotTables.Operations._TypedMultiplicityElement__CompatibleBody /* CompatibleBody(ValueSpecification) */,
		    PivotTables.Operations._TypedMultiplicityElement__makeParameter /* makeParameter() */
		};
		private static final ExecutorOperation[] _Operation__Visitable = {};
	
		private static final ExecutorOperation[] _OperationCallExp__OperationCallExp = {};
		private static final ExecutorOperation[] _OperationCallExp__CallExp = {};
		private static final ExecutorOperation[] _OperationCallExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _OperationCallExp__FeatureCallExp = {};
		private static final ExecutorOperation[] _OperationCallExp__Nameable = {};
		private static final ExecutorOperation[] _OperationCallExp__NamedElement = {};
		private static final ExecutorOperation[] _OperationCallExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OperationCallExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _OperationCallExp__OclExpression = {};
		private static final ExecutorOperation[] _OperationCallExp__TypedElement = {};
		private static final ExecutorOperation[] _OperationCallExp__Visitable = {};
	
		private static final ExecutorOperation[] _OperationTemplateParameter__OperationTemplateParameter = {};
		private static final ExecutorOperation[] _OperationTemplateParameter__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _OperationTemplateParameter__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OperationTemplateParameter__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _OperationTemplateParameter__TemplateParameter = {};
		private static final ExecutorOperation[] _OperationTemplateParameter__Visitable = {};
	
		private static final ExecutorOperation[] _OrderedSetType__OrderedSetType = {};
		private static final ExecutorOperation[] _OrderedSetType__Class = {};
		private static final ExecutorOperation[] _OrderedSetType__CollectionType = {};
		private static final ExecutorOperation[] _OrderedSetType__DataType = {};
		private static final ExecutorOperation[] _OrderedSetType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _OrderedSetType__Nameable = {};
		private static final ExecutorOperation[] _OrderedSetType__NamedElement = {};
		private static final ExecutorOperation[] _OrderedSetType__Namespace = {};
		private static final ExecutorOperation[] _OrderedSetType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OrderedSetType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _OrderedSetType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _OrderedSetType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _OrderedSetType__Type = {};
		private static final ExecutorOperation[] _OrderedSetType__Visitable = {};
	
		private static final ExecutorOperation[] _Package__Package = {};
		private static final ExecutorOperation[] _Package__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Package__Nameable = {};
		private static final ExecutorOperation[] _Package__NamedElement = {};
		private static final ExecutorOperation[] _Package__Namespace = {};
		private static final ExecutorOperation[] _Package__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Package__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Package__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Package__Visitable = {};
	
		private static final ExecutorOperation[] _PackageableElement__PackageableElement = {};
		private static final ExecutorOperation[] _PackageableElement__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _PackageableElement__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _PackageableElement__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _PackageableElement__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _PackageableElement__Visitable = {};
	
		private static final ExecutorOperation[] _Parameter__Parameter = {};
		private static final ExecutorOperation[] _Parameter__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Parameter__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _Parameter__Nameable = {};
		private static final ExecutorOperation[] _Parameter__NamedElement = {};
		private static final ExecutorOperation[] _Parameter__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Parameter__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Parameter__TypedElement = {};
		private static final ExecutorOperation[] _Parameter__TypedMultiplicityElement = {
		    PivotTables.Operations._TypedMultiplicityElement__CompatibleBody /* CompatibleBody(ValueSpecification) */,
		    PivotTables.Operations._TypedMultiplicityElement__makeParameter /* makeParameter() */
		};
		private static final ExecutorOperation[] _Parameter__VariableDeclaration = {};
		private static final ExecutorOperation[] _Parameter__Visitable = {};
	
		private static final ExecutorOperation[] _ParameterableElement__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _ParameterableElement__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _ParameterableElement__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _ParameterableElement__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _ParameterableElement__Visitable = {};
	
		private static final ExecutorOperation[] _Pivotable__Pivotable = {};
		private static final ExecutorOperation[] _Pivotable__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Pivotable__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
	
		private static final ExecutorOperation[] _Precedence__Precedence = {};
		private static final ExecutorOperation[] _Precedence__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Precedence__Nameable = {};
		private static final ExecutorOperation[] _Precedence__NamedElement = {};
		private static final ExecutorOperation[] _Precedence__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Precedence__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Precedence__Visitable = {};
	
		private static final ExecutorOperation[] _PrimitiveLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _PrimitiveType__PrimitiveType = {};
		private static final ExecutorOperation[] _PrimitiveType__Class = {};
		private static final ExecutorOperation[] _PrimitiveType__DataType = {};
		private static final ExecutorOperation[] _PrimitiveType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _PrimitiveType__Nameable = {};
		private static final ExecutorOperation[] _PrimitiveType__NamedElement = {};
		private static final ExecutorOperation[] _PrimitiveType__Namespace = {};
		private static final ExecutorOperation[] _PrimitiveType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _PrimitiveType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _PrimitiveType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _PrimitiveType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _PrimitiveType__Type = {};
		private static final ExecutorOperation[] _PrimitiveType__Visitable = {};
	
		private static final ExecutorOperation[] _Property__Property = {
		    PivotTables.Operations._Property__isAttribute /* isAttribute(Property) */
		};
		private static final ExecutorOperation[] _Property__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Property__Feature = {};
		private static final ExecutorOperation[] _Property__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _Property__Nameable = {};
		private static final ExecutorOperation[] _Property__NamedElement = {};
		private static final ExecutorOperation[] _Property__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Property__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Property__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _Property__TypedElement = {};
		private static final ExecutorOperation[] _Property__TypedMultiplicityElement = {
		    PivotTables.Operations._TypedMultiplicityElement__CompatibleBody /* CompatibleBody(ValueSpecification) */,
		    PivotTables.Operations._TypedMultiplicityElement__makeParameter /* makeParameter() */
		};
		private static final ExecutorOperation[] _Property__Visitable = {};
	
		private static final ExecutorOperation[] _PropertyCallExp__PropertyCallExp = {};
		private static final ExecutorOperation[] _PropertyCallExp__CallExp = {};
		private static final ExecutorOperation[] _PropertyCallExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _PropertyCallExp__FeatureCallExp = {};
		private static final ExecutorOperation[] _PropertyCallExp__Nameable = {};
		private static final ExecutorOperation[] _PropertyCallExp__NamedElement = {};
		private static final ExecutorOperation[] _PropertyCallExp__NavigationCallExp = {};
		private static final ExecutorOperation[] _PropertyCallExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _PropertyCallExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _PropertyCallExp__OclExpression = {};
		private static final ExecutorOperation[] _PropertyCallExp__TypedElement = {};
		private static final ExecutorOperation[] _PropertyCallExp__Visitable = {};
	
		private static final ExecutorOperation[] _RealLiteralExp__RealLiteralExp = {};
		private static final ExecutorOperation[] _RealLiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _RealLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _RealLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _RealLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _RealLiteralExp__NumericLiteralExp = {};
		private static final ExecutorOperation[] _RealLiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _RealLiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _RealLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _RealLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _RealLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _RealLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _SelfType__SelfType = {};
		private static final ExecutorOperation[] _SelfType__Class = {};
		private static final ExecutorOperation[] _SelfType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _SelfType__Nameable = {};
		private static final ExecutorOperation[] _SelfType__NamedElement = {};
		private static final ExecutorOperation[] _SelfType__Namespace = {};
		private static final ExecutorOperation[] _SelfType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _SelfType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _SelfType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _SelfType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _SelfType__Type = {};
		private static final ExecutorOperation[] _SelfType__Visitable = {};
	
		private static final ExecutorOperation[] _SendSignalAction__SendSignalAction = {};
		private static final ExecutorOperation[] _SendSignalAction__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _SendSignalAction__Nameable = {};
		private static final ExecutorOperation[] _SendSignalAction__NamedElement = {};
		private static final ExecutorOperation[] _SendSignalAction__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _SendSignalAction__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _SendSignalAction__Visitable = {};
	
		private static final ExecutorOperation[] _SequenceType__SequenceType = {};
		private static final ExecutorOperation[] _SequenceType__Class = {};
		private static final ExecutorOperation[] _SequenceType__CollectionType = {};
		private static final ExecutorOperation[] _SequenceType__DataType = {};
		private static final ExecutorOperation[] _SequenceType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _SequenceType__Nameable = {};
		private static final ExecutorOperation[] _SequenceType__NamedElement = {};
		private static final ExecutorOperation[] _SequenceType__Namespace = {};
		private static final ExecutorOperation[] _SequenceType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _SequenceType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _SequenceType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _SequenceType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _SequenceType__Type = {};
		private static final ExecutorOperation[] _SequenceType__Visitable = {};
	
		private static final ExecutorOperation[] _SetType__SetType = {};
		private static final ExecutorOperation[] _SetType__Class = {};
		private static final ExecutorOperation[] _SetType__CollectionType = {};
		private static final ExecutorOperation[] _SetType__DataType = {};
		private static final ExecutorOperation[] _SetType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _SetType__Nameable = {};
		private static final ExecutorOperation[] _SetType__NamedElement = {};
		private static final ExecutorOperation[] _SetType__Namespace = {};
		private static final ExecutorOperation[] _SetType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _SetType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _SetType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _SetType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _SetType__Type = {};
		private static final ExecutorOperation[] _SetType__Visitable = {};
	
		private static final ExecutorOperation[] _Signal__Signal = {};
		private static final ExecutorOperation[] _Signal__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Signal__Nameable = {};
		private static final ExecutorOperation[] _Signal__NamedElement = {};
		private static final ExecutorOperation[] _Signal__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Signal__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Signal__Visitable = {};
	
		private static final ExecutorOperation[] _State__State = {};
		private static final ExecutorOperation[] _State__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _State__Nameable = {};
		private static final ExecutorOperation[] _State__NamedElement = {};
		private static final ExecutorOperation[] _State__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _State__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _State__Visitable = {};
	
		private static final ExecutorOperation[] _StateExp__StateExp = {};
		private static final ExecutorOperation[] _StateExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _StateExp__Nameable = {};
		private static final ExecutorOperation[] _StateExp__NamedElement = {};
		private static final ExecutorOperation[] _StateExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _StateExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _StateExp__OclExpression = {};
		private static final ExecutorOperation[] _StateExp__TypedElement = {};
		private static final ExecutorOperation[] _StateExp__Visitable = {};
	
		private static final ExecutorOperation[] _StringLiteralExp__StringLiteralExp = {};
		private static final ExecutorOperation[] _StringLiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _StringLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _StringLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _StringLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _StringLiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _StringLiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _StringLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _StringLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _StringLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _StringLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _TemplateBinding__TemplateBinding = {};
		private static final ExecutorOperation[] _TemplateBinding__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TemplateBinding__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TemplateBinding__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TemplateBinding__Visitable = {};
	
		private static final ExecutorOperation[] _TemplateParameter__TemplateParameter = {};
		private static final ExecutorOperation[] _TemplateParameter__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TemplateParameter__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TemplateParameter__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TemplateParameter__Visitable = {};
	
		private static final ExecutorOperation[] _TemplateParameterSubstitution__TemplateParameterSubstitution = {};
		private static final ExecutorOperation[] _TemplateParameterSubstitution__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TemplateParameterSubstitution__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TemplateParameterSubstitution__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TemplateParameterSubstitution__Visitable = {};
	
		private static final ExecutorOperation[] _TemplateParameterType__TemplateParameterType = {};
		private static final ExecutorOperation[] _TemplateParameterType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TemplateParameterType__Nameable = {};
		private static final ExecutorOperation[] _TemplateParameterType__NamedElement = {};
		private static final ExecutorOperation[] _TemplateParameterType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TemplateParameterType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TemplateParameterType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _TemplateParameterType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _TemplateParameterType__Type = {};
		private static final ExecutorOperation[] _TemplateParameterType__Visitable = {};
	
		private static final ExecutorOperation[] _TemplateSignature__TemplateSignature = {};
		private static final ExecutorOperation[] _TemplateSignature__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TemplateSignature__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TemplateSignature__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TemplateSignature__Visitable = {};
	
		private static final ExecutorOperation[] _TemplateableElement__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _TemplateableElement__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TemplateableElement__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TemplateableElement__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TemplateableElement__Visitable = {};
	
		private static final ExecutorOperation[] _Throwable__Throwable = {};
	
		private static final ExecutorOperation[] _TupleLiteralExp__TupleLiteralExp = {};
		private static final ExecutorOperation[] _TupleLiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TupleLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _TupleLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _TupleLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _TupleLiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TupleLiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TupleLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _TupleLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _TupleLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _TupleLiteralPart__TupleLiteralPart = {};
		private static final ExecutorOperation[] _TupleLiteralPart__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TupleLiteralPart__Nameable = {};
		private static final ExecutorOperation[] _TupleLiteralPart__NamedElement = {};
		private static final ExecutorOperation[] _TupleLiteralPart__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TupleLiteralPart__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TupleLiteralPart__TypedElement = {};
		private static final ExecutorOperation[] _TupleLiteralPart__VariableDeclaration = {};
		private static final ExecutorOperation[] _TupleLiteralPart__Visitable = {};
	
		private static final ExecutorOperation[] _TupleType__TupleType = {};
		private static final ExecutorOperation[] _TupleType__Class = {};
		private static final ExecutorOperation[] _TupleType__DataType = {};
		private static final ExecutorOperation[] _TupleType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TupleType__Nameable = {};
		private static final ExecutorOperation[] _TupleType__NamedElement = {};
		private static final ExecutorOperation[] _TupleType__Namespace = {};
		private static final ExecutorOperation[] _TupleType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TupleType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TupleType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _TupleType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _TupleType__Type = {};
		private static final ExecutorOperation[] _TupleType__Visitable = {};
	
		private static final ExecutorOperation[] _Type__Type = {};
		private static final ExecutorOperation[] _Type__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Type__Nameable = {};
		private static final ExecutorOperation[] _Type__NamedElement = {};
		private static final ExecutorOperation[] _Type__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Type__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Type__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _Type__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Type__Visitable = {};
	
		private static final ExecutorOperation[] _TypeExp__TypeExp = {};
		private static final ExecutorOperation[] _TypeExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TypeExp__Nameable = {};
		private static final ExecutorOperation[] _TypeExp__NamedElement = {};
		private static final ExecutorOperation[] _TypeExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TypeExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TypeExp__OclExpression = {};
		private static final ExecutorOperation[] _TypeExp__TypedElement = {};
		private static final ExecutorOperation[] _TypeExp__Visitable = {};
	
		private static final ExecutorOperation[] _TypeTemplateParameter__TypeTemplateParameter = {};
		private static final ExecutorOperation[] _TypeTemplateParameter__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TypeTemplateParameter__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TypeTemplateParameter__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TypeTemplateParameter__TemplateParameter = {};
		private static final ExecutorOperation[] _TypeTemplateParameter__Visitable = {};
	
		private static final ExecutorOperation[] _TypedElement__TypedElement = {};
		private static final ExecutorOperation[] _TypedElement__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TypedElement__Nameable = {};
		private static final ExecutorOperation[] _TypedElement__NamedElement = {};
		private static final ExecutorOperation[] _TypedElement__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TypedElement__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TypedElement__Visitable = {};
	
		private static final ExecutorOperation[] _TypedMultiplicityElement__TypedMultiplicityElement = {
		    PivotTables.Operations._TypedMultiplicityElement__CompatibleBody /* CompatibleBody(ValueSpecification) */,
		    PivotTables.Operations._TypedMultiplicityElement__makeParameter /* makeParameter() */
		};
		private static final ExecutorOperation[] _TypedMultiplicityElement__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _TypedMultiplicityElement__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _TypedMultiplicityElement__Nameable = {};
		private static final ExecutorOperation[] _TypedMultiplicityElement__NamedElement = {};
		private static final ExecutorOperation[] _TypedMultiplicityElement__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TypedMultiplicityElement__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _TypedMultiplicityElement__TypedElement = {};
		private static final ExecutorOperation[] _TypedMultiplicityElement__Visitable = {};
	
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__NumericLiteralExp = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _UnspecifiedType__UnspecifiedType = {};
		private static final ExecutorOperation[] _UnspecifiedType__Class = {};
		private static final ExecutorOperation[] _UnspecifiedType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _UnspecifiedType__Nameable = {};
		private static final ExecutorOperation[] _UnspecifiedType__NamedElement = {};
		private static final ExecutorOperation[] _UnspecifiedType__Namespace = {};
		private static final ExecutorOperation[] _UnspecifiedType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _UnspecifiedType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _UnspecifiedType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _UnspecifiedType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _UnspecifiedType__Type = {};
		private static final ExecutorOperation[] _UnspecifiedType__Visitable = {};
	
		private static final ExecutorOperation[] _UnspecifiedValueExp__UnspecifiedValueExp = {};
		private static final ExecutorOperation[] _UnspecifiedValueExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _UnspecifiedValueExp__Nameable = {};
		private static final ExecutorOperation[] _UnspecifiedValueExp__NamedElement = {};
		private static final ExecutorOperation[] _UnspecifiedValueExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _UnspecifiedValueExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _UnspecifiedValueExp__OclExpression = {};
		private static final ExecutorOperation[] _UnspecifiedValueExp__TypedElement = {};
		private static final ExecutorOperation[] _UnspecifiedValueExp__Visitable = {};
	
		private static final ExecutorOperation[] _ValueSpecification__ValueSpecification = {
		    PivotTables.Operations._ValueSpecification__booleanValue /* booleanValue() */,
		    PivotTables.Operations._ValueSpecification__integerValue /* integerValue() */,
		    PivotTables.Operations._ValueSpecification__isComputable /* isComputable() */,
		    PivotTables.Operations._ValueSpecification__isNull /* isNull() */,
		    PivotTables.Operations._ValueSpecification__stringValue /* stringValue() */,
		    PivotTables.Operations._ValueSpecification__unlimitedValue /* unlimitedValue() */
		};
		private static final ExecutorOperation[] _ValueSpecification__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _ValueSpecification__Nameable = {};
		private static final ExecutorOperation[] _ValueSpecification__NamedElement = {};
		private static final ExecutorOperation[] _ValueSpecification__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _ValueSpecification__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _ValueSpecification__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _ValueSpecification__TypedElement = {};
		private static final ExecutorOperation[] _ValueSpecification__Visitable = {};
	
		private static final ExecutorOperation[] _Variable__Variable = {};
		private static final ExecutorOperation[] _Variable__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _Variable__Nameable = {};
		private static final ExecutorOperation[] _Variable__NamedElement = {};
		private static final ExecutorOperation[] _Variable__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Variable__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Variable__TypedElement = {};
		private static final ExecutorOperation[] _Variable__VariableDeclaration = {};
		private static final ExecutorOperation[] _Variable__Visitable = {};
	
		private static final ExecutorOperation[] _VariableDeclaration__VariableDeclaration = {};
		private static final ExecutorOperation[] _VariableDeclaration__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _VariableDeclaration__Nameable = {};
		private static final ExecutorOperation[] _VariableDeclaration__NamedElement = {};
		private static final ExecutorOperation[] _VariableDeclaration__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _VariableDeclaration__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _VariableDeclaration__TypedElement = {};
		private static final ExecutorOperation[] _VariableDeclaration__Visitable = {};
	
		private static final ExecutorOperation[] _VariableExp__VariableExp = {};
		private static final ExecutorOperation[] _VariableExp__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _VariableExp__Nameable = {};
		private static final ExecutorOperation[] _VariableExp__NamedElement = {};
		private static final ExecutorOperation[] _VariableExp__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _VariableExp__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _VariableExp__OclExpression = {};
		private static final ExecutorOperation[] _VariableExp__TypedElement = {};
		private static final ExecutorOperation[] _VariableExp__Visitable = {};
	
		private static final ExecutorOperation[] _Visitable__Visitable = {};
		private static final ExecutorOperation[] _Visitable__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Visitable__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
	
		private static final ExecutorOperation[] _Visitor__Visitor = {};
		private static final ExecutorOperation[] _Visitor__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Visitor__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
	
		private static final ExecutorOperation[] _VoidType__VoidType = {};
		private static final ExecutorOperation[] _VoidType__Class = {};
		private static final ExecutorOperation[] _VoidType__Element = {
		    PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */
		};
		private static final ExecutorOperation[] _VoidType__Nameable = {};
		private static final ExecutorOperation[] _VoidType__NamedElement = {};
		private static final ExecutorOperation[] _VoidType__Namespace = {};
		private static final ExecutorOperation[] _VoidType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _VoidType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _VoidType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _VoidType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _VoidType__Type = {};
		private static final ExecutorOperation[] _VoidType__Visitable = {};
	
		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Annotation__Annotation.initOperations(_Annotation__Annotation);
			Fragments._Annotation__Element.initOperations(_Annotation__Element);
			Fragments._Annotation__Nameable.initOperations(_Annotation__Nameable);
			Fragments._Annotation__NamedElement.initOperations(_Annotation__NamedElement);
			Fragments._Annotation__OclAny.initOperations(_Annotation__OclAny);
			Fragments._Annotation__OclElement.initOperations(_Annotation__OclElement);
			Fragments._Annotation__Visitable.initOperations(_Annotation__Visitable);
	
			Fragments._AnyType__AnyType.initOperations(_AnyType__AnyType);
			Fragments._AnyType__Class.initOperations(_AnyType__Class);
			Fragments._AnyType__Element.initOperations(_AnyType__Element);
			Fragments._AnyType__Nameable.initOperations(_AnyType__Nameable);
			Fragments._AnyType__NamedElement.initOperations(_AnyType__NamedElement);
			Fragments._AnyType__Namespace.initOperations(_AnyType__Namespace);
			Fragments._AnyType__OclAny.initOperations(_AnyType__OclAny);
			Fragments._AnyType__OclElement.initOperations(_AnyType__OclElement);
			Fragments._AnyType__ParameterableElement.initOperations(_AnyType__ParameterableElement);
			Fragments._AnyType__TemplateableElement.initOperations(_AnyType__TemplateableElement);
			Fragments._AnyType__Type.initOperations(_AnyType__Type);
			Fragments._AnyType__Visitable.initOperations(_AnyType__Visitable);
	
			Fragments._AssociationClass__AssociationClass.initOperations(_AssociationClass__AssociationClass);
			Fragments._AssociationClass__Class.initOperations(_AssociationClass__Class);
			Fragments._AssociationClass__Element.initOperations(_AssociationClass__Element);
			Fragments._AssociationClass__Nameable.initOperations(_AssociationClass__Nameable);
			Fragments._AssociationClass__NamedElement.initOperations(_AssociationClass__NamedElement);
			Fragments._AssociationClass__Namespace.initOperations(_AssociationClass__Namespace);
			Fragments._AssociationClass__OclAny.initOperations(_AssociationClass__OclAny);
			Fragments._AssociationClass__OclElement.initOperations(_AssociationClass__OclElement);
			Fragments._AssociationClass__ParameterableElement.initOperations(_AssociationClass__ParameterableElement);
			Fragments._AssociationClass__TemplateableElement.initOperations(_AssociationClass__TemplateableElement);
			Fragments._AssociationClass__Type.initOperations(_AssociationClass__Type);
			Fragments._AssociationClass__Visitable.initOperations(_AssociationClass__Visitable);
	
			Fragments._AssociationClassCallExp__AssociationClassCallExp.initOperations(_AssociationClassCallExp__AssociationClassCallExp);
			Fragments._AssociationClassCallExp__CallExp.initOperations(_AssociationClassCallExp__CallExp);
			Fragments._AssociationClassCallExp__Element.initOperations(_AssociationClassCallExp__Element);
			Fragments._AssociationClassCallExp__FeatureCallExp.initOperations(_AssociationClassCallExp__FeatureCallExp);
			Fragments._AssociationClassCallExp__Nameable.initOperations(_AssociationClassCallExp__Nameable);
			Fragments._AssociationClassCallExp__NamedElement.initOperations(_AssociationClassCallExp__NamedElement);
			Fragments._AssociationClassCallExp__NavigationCallExp.initOperations(_AssociationClassCallExp__NavigationCallExp);
			Fragments._AssociationClassCallExp__OclAny.initOperations(_AssociationClassCallExp__OclAny);
			Fragments._AssociationClassCallExp__OclElement.initOperations(_AssociationClassCallExp__OclElement);
			Fragments._AssociationClassCallExp__OclExpression.initOperations(_AssociationClassCallExp__OclExpression);
			Fragments._AssociationClassCallExp__TypedElement.initOperations(_AssociationClassCallExp__TypedElement);
			Fragments._AssociationClassCallExp__Visitable.initOperations(_AssociationClassCallExp__Visitable);
	
			Fragments._AssociativityKind__AssociativityKind.initOperations(_AssociativityKind__AssociativityKind);
	
			Fragments._BagType__BagType.initOperations(_BagType__BagType);
			Fragments._BagType__Class.initOperations(_BagType__Class);
			Fragments._BagType__CollectionType.initOperations(_BagType__CollectionType);
			Fragments._BagType__DataType.initOperations(_BagType__DataType);
			Fragments._BagType__Element.initOperations(_BagType__Element);
			Fragments._BagType__Nameable.initOperations(_BagType__Nameable);
			Fragments._BagType__NamedElement.initOperations(_BagType__NamedElement);
			Fragments._BagType__Namespace.initOperations(_BagType__Namespace);
			Fragments._BagType__OclAny.initOperations(_BagType__OclAny);
			Fragments._BagType__OclElement.initOperations(_BagType__OclElement);
			Fragments._BagType__ParameterableElement.initOperations(_BagType__ParameterableElement);
			Fragments._BagType__TemplateableElement.initOperations(_BagType__TemplateableElement);
			Fragments._BagType__Type.initOperations(_BagType__Type);
			Fragments._BagType__Visitable.initOperations(_BagType__Visitable);
	
	
			Fragments._BooleanLiteralExp__BooleanLiteralExp.initOperations(_BooleanLiteralExp__BooleanLiteralExp);
			Fragments._BooleanLiteralExp__Element.initOperations(_BooleanLiteralExp__Element);
			Fragments._BooleanLiteralExp__LiteralExp.initOperations(_BooleanLiteralExp__LiteralExp);
			Fragments._BooleanLiteralExp__Nameable.initOperations(_BooleanLiteralExp__Nameable);
			Fragments._BooleanLiteralExp__NamedElement.initOperations(_BooleanLiteralExp__NamedElement);
			Fragments._BooleanLiteralExp__OclAny.initOperations(_BooleanLiteralExp__OclAny);
			Fragments._BooleanLiteralExp__OclElement.initOperations(_BooleanLiteralExp__OclElement);
			Fragments._BooleanLiteralExp__OclExpression.initOperations(_BooleanLiteralExp__OclExpression);
			Fragments._BooleanLiteralExp__PrimitiveLiteralExp.initOperations(_BooleanLiteralExp__PrimitiveLiteralExp);
			Fragments._BooleanLiteralExp__TypedElement.initOperations(_BooleanLiteralExp__TypedElement);
			Fragments._BooleanLiteralExp__Visitable.initOperations(_BooleanLiteralExp__Visitable);
	
			Fragments._CallExp__CallExp.initOperations(_CallExp__CallExp);
			Fragments._CallExp__Element.initOperations(_CallExp__Element);
			Fragments._CallExp__Nameable.initOperations(_CallExp__Nameable);
			Fragments._CallExp__NamedElement.initOperations(_CallExp__NamedElement);
			Fragments._CallExp__OclAny.initOperations(_CallExp__OclAny);
			Fragments._CallExp__OclElement.initOperations(_CallExp__OclElement);
			Fragments._CallExp__OclExpression.initOperations(_CallExp__OclExpression);
			Fragments._CallExp__TypedElement.initOperations(_CallExp__TypedElement);
			Fragments._CallExp__Visitable.initOperations(_CallExp__Visitable);
	
			Fragments._CallOperationAction__CallOperationAction.initOperations(_CallOperationAction__CallOperationAction);
			Fragments._CallOperationAction__Element.initOperations(_CallOperationAction__Element);
			Fragments._CallOperationAction__Nameable.initOperations(_CallOperationAction__Nameable);
			Fragments._CallOperationAction__NamedElement.initOperations(_CallOperationAction__NamedElement);
			Fragments._CallOperationAction__OclAny.initOperations(_CallOperationAction__OclAny);
			Fragments._CallOperationAction__OclElement.initOperations(_CallOperationAction__OclElement);
			Fragments._CallOperationAction__Visitable.initOperations(_CallOperationAction__Visitable);
	
			Fragments._Class__Class.initOperations(_Class__Class);
			Fragments._Class__Element.initOperations(_Class__Element);
			Fragments._Class__Nameable.initOperations(_Class__Nameable);
			Fragments._Class__NamedElement.initOperations(_Class__NamedElement);
			Fragments._Class__Namespace.initOperations(_Class__Namespace);
			Fragments._Class__OclAny.initOperations(_Class__OclAny);
			Fragments._Class__OclElement.initOperations(_Class__OclElement);
			Fragments._Class__ParameterableElement.initOperations(_Class__ParameterableElement);
			Fragments._Class__TemplateableElement.initOperations(_Class__TemplateableElement);
			Fragments._Class__Type.initOperations(_Class__Type);
			Fragments._Class__Visitable.initOperations(_Class__Visitable);
	
			Fragments._ClassifierType__Class.initOperations(_ClassifierType__Class);
			Fragments._ClassifierType__ClassifierType.initOperations(_ClassifierType__ClassifierType);
			Fragments._ClassifierType__DataType.initOperations(_ClassifierType__DataType);
			Fragments._ClassifierType__Element.initOperations(_ClassifierType__Element);
			Fragments._ClassifierType__Nameable.initOperations(_ClassifierType__Nameable);
			Fragments._ClassifierType__NamedElement.initOperations(_ClassifierType__NamedElement);
			Fragments._ClassifierType__Namespace.initOperations(_ClassifierType__Namespace);
			Fragments._ClassifierType__OclAny.initOperations(_ClassifierType__OclAny);
			Fragments._ClassifierType__OclElement.initOperations(_ClassifierType__OclElement);
			Fragments._ClassifierType__ParameterableElement.initOperations(_ClassifierType__ParameterableElement);
			Fragments._ClassifierType__TemplateableElement.initOperations(_ClassifierType__TemplateableElement);
			Fragments._ClassifierType__Type.initOperations(_ClassifierType__Type);
			Fragments._ClassifierType__Visitable.initOperations(_ClassifierType__Visitable);
	
			Fragments._CollectionItem__CollectionItem.initOperations(_CollectionItem__CollectionItem);
			Fragments._CollectionItem__CollectionLiteralPart.initOperations(_CollectionItem__CollectionLiteralPart);
			Fragments._CollectionItem__Element.initOperations(_CollectionItem__Element);
			Fragments._CollectionItem__Nameable.initOperations(_CollectionItem__Nameable);
			Fragments._CollectionItem__NamedElement.initOperations(_CollectionItem__NamedElement);
			Fragments._CollectionItem__OclAny.initOperations(_CollectionItem__OclAny);
			Fragments._CollectionItem__OclElement.initOperations(_CollectionItem__OclElement);
			Fragments._CollectionItem__TypedElement.initOperations(_CollectionItem__TypedElement);
			Fragments._CollectionItem__Visitable.initOperations(_CollectionItem__Visitable);
	
			Fragments._CollectionKind__CollectionKind.initOperations(_CollectionKind__CollectionKind);
	
			Fragments._CollectionLiteralExp__CollectionLiteralExp.initOperations(_CollectionLiteralExp__CollectionLiteralExp);
			Fragments._CollectionLiteralExp__Element.initOperations(_CollectionLiteralExp__Element);
			Fragments._CollectionLiteralExp__LiteralExp.initOperations(_CollectionLiteralExp__LiteralExp);
			Fragments._CollectionLiteralExp__Nameable.initOperations(_CollectionLiteralExp__Nameable);
			Fragments._CollectionLiteralExp__NamedElement.initOperations(_CollectionLiteralExp__NamedElement);
			Fragments._CollectionLiteralExp__OclAny.initOperations(_CollectionLiteralExp__OclAny);
			Fragments._CollectionLiteralExp__OclElement.initOperations(_CollectionLiteralExp__OclElement);
			Fragments._CollectionLiteralExp__OclExpression.initOperations(_CollectionLiteralExp__OclExpression);
			Fragments._CollectionLiteralExp__TypedElement.initOperations(_CollectionLiteralExp__TypedElement);
			Fragments._CollectionLiteralExp__Visitable.initOperations(_CollectionLiteralExp__Visitable);
	
			Fragments._CollectionLiteralPart__CollectionLiteralPart.initOperations(_CollectionLiteralPart__CollectionLiteralPart);
			Fragments._CollectionLiteralPart__Element.initOperations(_CollectionLiteralPart__Element);
			Fragments._CollectionLiteralPart__Nameable.initOperations(_CollectionLiteralPart__Nameable);
			Fragments._CollectionLiteralPart__NamedElement.initOperations(_CollectionLiteralPart__NamedElement);
			Fragments._CollectionLiteralPart__OclAny.initOperations(_CollectionLiteralPart__OclAny);
			Fragments._CollectionLiteralPart__OclElement.initOperations(_CollectionLiteralPart__OclElement);
			Fragments._CollectionLiteralPart__TypedElement.initOperations(_CollectionLiteralPart__TypedElement);
			Fragments._CollectionLiteralPart__Visitable.initOperations(_CollectionLiteralPart__Visitable);
	
			Fragments._CollectionRange__CollectionLiteralPart.initOperations(_CollectionRange__CollectionLiteralPart);
			Fragments._CollectionRange__CollectionRange.initOperations(_CollectionRange__CollectionRange);
			Fragments._CollectionRange__Element.initOperations(_CollectionRange__Element);
			Fragments._CollectionRange__Nameable.initOperations(_CollectionRange__Nameable);
			Fragments._CollectionRange__NamedElement.initOperations(_CollectionRange__NamedElement);
			Fragments._CollectionRange__OclAny.initOperations(_CollectionRange__OclAny);
			Fragments._CollectionRange__OclElement.initOperations(_CollectionRange__OclElement);
			Fragments._CollectionRange__TypedElement.initOperations(_CollectionRange__TypedElement);
			Fragments._CollectionRange__Visitable.initOperations(_CollectionRange__Visitable);
	
			Fragments._CollectionType__Class.initOperations(_CollectionType__Class);
			Fragments._CollectionType__CollectionType.initOperations(_CollectionType__CollectionType);
			Fragments._CollectionType__DataType.initOperations(_CollectionType__DataType);
			Fragments._CollectionType__Element.initOperations(_CollectionType__Element);
			Fragments._CollectionType__Nameable.initOperations(_CollectionType__Nameable);
			Fragments._CollectionType__NamedElement.initOperations(_CollectionType__NamedElement);
			Fragments._CollectionType__Namespace.initOperations(_CollectionType__Namespace);
			Fragments._CollectionType__OclAny.initOperations(_CollectionType__OclAny);
			Fragments._CollectionType__OclElement.initOperations(_CollectionType__OclElement);
			Fragments._CollectionType__ParameterableElement.initOperations(_CollectionType__ParameterableElement);
			Fragments._CollectionType__TemplateableElement.initOperations(_CollectionType__TemplateableElement);
			Fragments._CollectionType__Type.initOperations(_CollectionType__Type);
			Fragments._CollectionType__Visitable.initOperations(_CollectionType__Visitable);
	
			Fragments._Comment__Comment.initOperations(_Comment__Comment);
			Fragments._Comment__Element.initOperations(_Comment__Element);
			Fragments._Comment__OclAny.initOperations(_Comment__OclAny);
			Fragments._Comment__OclElement.initOperations(_Comment__OclElement);
			Fragments._Comment__Visitable.initOperations(_Comment__Visitable);
	
			Fragments._Constraint__Constraint.initOperations(_Constraint__Constraint);
			Fragments._Constraint__Element.initOperations(_Constraint__Element);
			Fragments._Constraint__Nameable.initOperations(_Constraint__Nameable);
			Fragments._Constraint__NamedElement.initOperations(_Constraint__NamedElement);
			Fragments._Constraint__OclAny.initOperations(_Constraint__OclAny);
			Fragments._Constraint__OclElement.initOperations(_Constraint__OclElement);
			Fragments._Constraint__Visitable.initOperations(_Constraint__Visitable);
	
			Fragments._ConstructorExp__ConstructorExp.initOperations(_ConstructorExp__ConstructorExp);
			Fragments._ConstructorExp__Element.initOperations(_ConstructorExp__Element);
			Fragments._ConstructorExp__Nameable.initOperations(_ConstructorExp__Nameable);
			Fragments._ConstructorExp__NamedElement.initOperations(_ConstructorExp__NamedElement);
			Fragments._ConstructorExp__OclAny.initOperations(_ConstructorExp__OclAny);
			Fragments._ConstructorExp__OclElement.initOperations(_ConstructorExp__OclElement);
			Fragments._ConstructorExp__OclExpression.initOperations(_ConstructorExp__OclExpression);
			Fragments._ConstructorExp__TypedElement.initOperations(_ConstructorExp__TypedElement);
			Fragments._ConstructorExp__Visitable.initOperations(_ConstructorExp__Visitable);
	
			Fragments._ConstructorPart__ConstructorPart.initOperations(_ConstructorPart__ConstructorPart);
			Fragments._ConstructorPart__Element.initOperations(_ConstructorPart__Element);
			Fragments._ConstructorPart__OclAny.initOperations(_ConstructorPart__OclAny);
			Fragments._ConstructorPart__OclElement.initOperations(_ConstructorPart__OclElement);
			Fragments._ConstructorPart__Visitable.initOperations(_ConstructorPart__Visitable);
	
			Fragments._DataType__Class.initOperations(_DataType__Class);
			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__Element.initOperations(_DataType__Element);
			Fragments._DataType__Nameable.initOperations(_DataType__Nameable);
			Fragments._DataType__NamedElement.initOperations(_DataType__NamedElement);
			Fragments._DataType__Namespace.initOperations(_DataType__Namespace);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);
			Fragments._DataType__ParameterableElement.initOperations(_DataType__ParameterableElement);
			Fragments._DataType__TemplateableElement.initOperations(_DataType__TemplateableElement);
			Fragments._DataType__Type.initOperations(_DataType__Type);
			Fragments._DataType__Visitable.initOperations(_DataType__Visitable);
	
			Fragments._Detail__Detail.initOperations(_Detail__Detail);
			Fragments._Detail__Element.initOperations(_Detail__Element);
			Fragments._Detail__Nameable.initOperations(_Detail__Nameable);
			Fragments._Detail__NamedElement.initOperations(_Detail__NamedElement);
			Fragments._Detail__OclAny.initOperations(_Detail__OclAny);
			Fragments._Detail__OclElement.initOperations(_Detail__OclElement);
			Fragments._Detail__Visitable.initOperations(_Detail__Visitable);
	
			Fragments._Element__Element.initOperations(_Element__Element);
			Fragments._Element__OclAny.initOperations(_Element__OclAny);
			Fragments._Element__OclElement.initOperations(_Element__OclElement);
			Fragments._Element__Visitable.initOperations(_Element__Visitable);
	
			Fragments._EnumLiteralExp__Element.initOperations(_EnumLiteralExp__Element);
			Fragments._EnumLiteralExp__EnumLiteralExp.initOperations(_EnumLiteralExp__EnumLiteralExp);
			Fragments._EnumLiteralExp__LiteralExp.initOperations(_EnumLiteralExp__LiteralExp);
			Fragments._EnumLiteralExp__Nameable.initOperations(_EnumLiteralExp__Nameable);
			Fragments._EnumLiteralExp__NamedElement.initOperations(_EnumLiteralExp__NamedElement);
			Fragments._EnumLiteralExp__OclAny.initOperations(_EnumLiteralExp__OclAny);
			Fragments._EnumLiteralExp__OclElement.initOperations(_EnumLiteralExp__OclElement);
			Fragments._EnumLiteralExp__OclExpression.initOperations(_EnumLiteralExp__OclExpression);
			Fragments._EnumLiteralExp__TypedElement.initOperations(_EnumLiteralExp__TypedElement);
			Fragments._EnumLiteralExp__Visitable.initOperations(_EnumLiteralExp__Visitable);
	
			Fragments._Enumeration__Class.initOperations(_Enumeration__Class);
			Fragments._Enumeration__DataType.initOperations(_Enumeration__DataType);
			Fragments._Enumeration__Element.initOperations(_Enumeration__Element);
			Fragments._Enumeration__Enumeration.initOperations(_Enumeration__Enumeration);
			Fragments._Enumeration__Nameable.initOperations(_Enumeration__Nameable);
			Fragments._Enumeration__NamedElement.initOperations(_Enumeration__NamedElement);
			Fragments._Enumeration__Namespace.initOperations(_Enumeration__Namespace);
			Fragments._Enumeration__OclAny.initOperations(_Enumeration__OclAny);
			Fragments._Enumeration__OclElement.initOperations(_Enumeration__OclElement);
			Fragments._Enumeration__ParameterableElement.initOperations(_Enumeration__ParameterableElement);
			Fragments._Enumeration__TemplateableElement.initOperations(_Enumeration__TemplateableElement);
			Fragments._Enumeration__Type.initOperations(_Enumeration__Type);
			Fragments._Enumeration__Visitable.initOperations(_Enumeration__Visitable);
	
			Fragments._EnumerationLiteral__Element.initOperations(_EnumerationLiteral__Element);
			Fragments._EnumerationLiteral__EnumerationLiteral.initOperations(_EnumerationLiteral__EnumerationLiteral);
			Fragments._EnumerationLiteral__Nameable.initOperations(_EnumerationLiteral__Nameable);
			Fragments._EnumerationLiteral__NamedElement.initOperations(_EnumerationLiteral__NamedElement);
			Fragments._EnumerationLiteral__OclAny.initOperations(_EnumerationLiteral__OclAny);
			Fragments._EnumerationLiteral__OclElement.initOperations(_EnumerationLiteral__OclElement);
			Fragments._EnumerationLiteral__Visitable.initOperations(_EnumerationLiteral__Visitable);
	
			Fragments._ExpressionInOcl__Element.initOperations(_ExpressionInOcl__Element);
			Fragments._ExpressionInOcl__ExpressionInOcl.initOperations(_ExpressionInOcl__ExpressionInOcl);
			Fragments._ExpressionInOcl__Nameable.initOperations(_ExpressionInOcl__Nameable);
			Fragments._ExpressionInOcl__NamedElement.initOperations(_ExpressionInOcl__NamedElement);
			Fragments._ExpressionInOcl__OclAny.initOperations(_ExpressionInOcl__OclAny);
			Fragments._ExpressionInOcl__OclElement.initOperations(_ExpressionInOcl__OclElement);
			Fragments._ExpressionInOcl__OpaqueExpression.initOperations(_ExpressionInOcl__OpaqueExpression);
			Fragments._ExpressionInOcl__ParameterableElement.initOperations(_ExpressionInOcl__ParameterableElement);
			Fragments._ExpressionInOcl__TypedElement.initOperations(_ExpressionInOcl__TypedElement);
			Fragments._ExpressionInOcl__ValueSpecification.initOperations(_ExpressionInOcl__ValueSpecification);
			Fragments._ExpressionInOcl__Visitable.initOperations(_ExpressionInOcl__Visitable);
	
			Fragments._Feature__Element.initOperations(_Feature__Element);
			Fragments._Feature__Feature.initOperations(_Feature__Feature);
			Fragments._Feature__MultiplicityElement.initOperations(_Feature__MultiplicityElement);
			Fragments._Feature__Nameable.initOperations(_Feature__Nameable);
			Fragments._Feature__NamedElement.initOperations(_Feature__NamedElement);
			Fragments._Feature__OclAny.initOperations(_Feature__OclAny);
			Fragments._Feature__OclElement.initOperations(_Feature__OclElement);
			Fragments._Feature__TypedElement.initOperations(_Feature__TypedElement);
			Fragments._Feature__TypedMultiplicityElement.initOperations(_Feature__TypedMultiplicityElement);
			Fragments._Feature__Visitable.initOperations(_Feature__Visitable);
	
			Fragments._FeatureCallExp__CallExp.initOperations(_FeatureCallExp__CallExp);
			Fragments._FeatureCallExp__Element.initOperations(_FeatureCallExp__Element);
			Fragments._FeatureCallExp__FeatureCallExp.initOperations(_FeatureCallExp__FeatureCallExp);
			Fragments._FeatureCallExp__Nameable.initOperations(_FeatureCallExp__Nameable);
			Fragments._FeatureCallExp__NamedElement.initOperations(_FeatureCallExp__NamedElement);
			Fragments._FeatureCallExp__OclAny.initOperations(_FeatureCallExp__OclAny);
			Fragments._FeatureCallExp__OclElement.initOperations(_FeatureCallExp__OclElement);
			Fragments._FeatureCallExp__OclExpression.initOperations(_FeatureCallExp__OclExpression);
			Fragments._FeatureCallExp__TypedElement.initOperations(_FeatureCallExp__TypedElement);
			Fragments._FeatureCallExp__Visitable.initOperations(_FeatureCallExp__Visitable);
	
			Fragments._IfExp__Element.initOperations(_IfExp__Element);
			Fragments._IfExp__IfExp.initOperations(_IfExp__IfExp);
			Fragments._IfExp__Nameable.initOperations(_IfExp__Nameable);
			Fragments._IfExp__NamedElement.initOperations(_IfExp__NamedElement);
			Fragments._IfExp__OclAny.initOperations(_IfExp__OclAny);
			Fragments._IfExp__OclElement.initOperations(_IfExp__OclElement);
			Fragments._IfExp__OclExpression.initOperations(_IfExp__OclExpression);
			Fragments._IfExp__TypedElement.initOperations(_IfExp__TypedElement);
			Fragments._IfExp__Visitable.initOperations(_IfExp__Visitable);
	
	
	
			Fragments._IntegerLiteralExp__Element.initOperations(_IntegerLiteralExp__Element);
			Fragments._IntegerLiteralExp__IntegerLiteralExp.initOperations(_IntegerLiteralExp__IntegerLiteralExp);
			Fragments._IntegerLiteralExp__LiteralExp.initOperations(_IntegerLiteralExp__LiteralExp);
			Fragments._IntegerLiteralExp__Nameable.initOperations(_IntegerLiteralExp__Nameable);
			Fragments._IntegerLiteralExp__NamedElement.initOperations(_IntegerLiteralExp__NamedElement);
			Fragments._IntegerLiteralExp__NumericLiteralExp.initOperations(_IntegerLiteralExp__NumericLiteralExp);
			Fragments._IntegerLiteralExp__OclAny.initOperations(_IntegerLiteralExp__OclAny);
			Fragments._IntegerLiteralExp__OclElement.initOperations(_IntegerLiteralExp__OclElement);
			Fragments._IntegerLiteralExp__OclExpression.initOperations(_IntegerLiteralExp__OclExpression);
			Fragments._IntegerLiteralExp__PrimitiveLiteralExp.initOperations(_IntegerLiteralExp__PrimitiveLiteralExp);
			Fragments._IntegerLiteralExp__TypedElement.initOperations(_IntegerLiteralExp__TypedElement);
			Fragments._IntegerLiteralExp__Visitable.initOperations(_IntegerLiteralExp__Visitable);
	
			Fragments._InvalidLiteralExp__Element.initOperations(_InvalidLiteralExp__Element);
			Fragments._InvalidLiteralExp__InvalidLiteralExp.initOperations(_InvalidLiteralExp__InvalidLiteralExp);
			Fragments._InvalidLiteralExp__LiteralExp.initOperations(_InvalidLiteralExp__LiteralExp);
			Fragments._InvalidLiteralExp__Nameable.initOperations(_InvalidLiteralExp__Nameable);
			Fragments._InvalidLiteralExp__NamedElement.initOperations(_InvalidLiteralExp__NamedElement);
			Fragments._InvalidLiteralExp__OclAny.initOperations(_InvalidLiteralExp__OclAny);
			Fragments._InvalidLiteralExp__OclElement.initOperations(_InvalidLiteralExp__OclElement);
			Fragments._InvalidLiteralExp__OclExpression.initOperations(_InvalidLiteralExp__OclExpression);
			Fragments._InvalidLiteralExp__TypedElement.initOperations(_InvalidLiteralExp__TypedElement);
			Fragments._InvalidLiteralExp__Visitable.initOperations(_InvalidLiteralExp__Visitable);
	
			Fragments._InvalidType__Class.initOperations(_InvalidType__Class);
			Fragments._InvalidType__Element.initOperations(_InvalidType__Element);
			Fragments._InvalidType__InvalidType.initOperations(_InvalidType__InvalidType);
			Fragments._InvalidType__Nameable.initOperations(_InvalidType__Nameable);
			Fragments._InvalidType__NamedElement.initOperations(_InvalidType__NamedElement);
			Fragments._InvalidType__Namespace.initOperations(_InvalidType__Namespace);
			Fragments._InvalidType__OclAny.initOperations(_InvalidType__OclAny);
			Fragments._InvalidType__OclElement.initOperations(_InvalidType__OclElement);
			Fragments._InvalidType__ParameterableElement.initOperations(_InvalidType__ParameterableElement);
			Fragments._InvalidType__TemplateableElement.initOperations(_InvalidType__TemplateableElement);
			Fragments._InvalidType__Type.initOperations(_InvalidType__Type);
			Fragments._InvalidType__Visitable.initOperations(_InvalidType__Visitable);
	
			Fragments._IterateExp__CallExp.initOperations(_IterateExp__CallExp);
			Fragments._IterateExp__Element.initOperations(_IterateExp__Element);
			Fragments._IterateExp__IterateExp.initOperations(_IterateExp__IterateExp);
			Fragments._IterateExp__LoopExp.initOperations(_IterateExp__LoopExp);
			Fragments._IterateExp__Nameable.initOperations(_IterateExp__Nameable);
			Fragments._IterateExp__NamedElement.initOperations(_IterateExp__NamedElement);
			Fragments._IterateExp__OclAny.initOperations(_IterateExp__OclAny);
			Fragments._IterateExp__OclElement.initOperations(_IterateExp__OclElement);
			Fragments._IterateExp__OclExpression.initOperations(_IterateExp__OclExpression);
			Fragments._IterateExp__TypedElement.initOperations(_IterateExp__TypedElement);
			Fragments._IterateExp__Visitable.initOperations(_IterateExp__Visitable);
	
			Fragments._Iteration__Element.initOperations(_Iteration__Element);
			Fragments._Iteration__Feature.initOperations(_Iteration__Feature);
			Fragments._Iteration__Iteration.initOperations(_Iteration__Iteration);
			Fragments._Iteration__MultiplicityElement.initOperations(_Iteration__MultiplicityElement);
			Fragments._Iteration__Nameable.initOperations(_Iteration__Nameable);
			Fragments._Iteration__NamedElement.initOperations(_Iteration__NamedElement);
			Fragments._Iteration__Namespace.initOperations(_Iteration__Namespace);
			Fragments._Iteration__OclAny.initOperations(_Iteration__OclAny);
			Fragments._Iteration__OclElement.initOperations(_Iteration__OclElement);
			Fragments._Iteration__Operation.initOperations(_Iteration__Operation);
			Fragments._Iteration__ParameterableElement.initOperations(_Iteration__ParameterableElement);
			Fragments._Iteration__TemplateableElement.initOperations(_Iteration__TemplateableElement);
			Fragments._Iteration__TypedElement.initOperations(_Iteration__TypedElement);
			Fragments._Iteration__TypedMultiplicityElement.initOperations(_Iteration__TypedMultiplicityElement);
			Fragments._Iteration__Visitable.initOperations(_Iteration__Visitable);
	
			Fragments._IteratorExp__CallExp.initOperations(_IteratorExp__CallExp);
			Fragments._IteratorExp__Element.initOperations(_IteratorExp__Element);
			Fragments._IteratorExp__IteratorExp.initOperations(_IteratorExp__IteratorExp);
			Fragments._IteratorExp__LoopExp.initOperations(_IteratorExp__LoopExp);
			Fragments._IteratorExp__Nameable.initOperations(_IteratorExp__Nameable);
			Fragments._IteratorExp__NamedElement.initOperations(_IteratorExp__NamedElement);
			Fragments._IteratorExp__OclAny.initOperations(_IteratorExp__OclAny);
			Fragments._IteratorExp__OclElement.initOperations(_IteratorExp__OclElement);
			Fragments._IteratorExp__OclExpression.initOperations(_IteratorExp__OclExpression);
			Fragments._IteratorExp__TypedElement.initOperations(_IteratorExp__TypedElement);
			Fragments._IteratorExp__Visitable.initOperations(_IteratorExp__Visitable);
	
			Fragments._LambdaType__Class.initOperations(_LambdaType__Class);
			Fragments._LambdaType__DataType.initOperations(_LambdaType__DataType);
			Fragments._LambdaType__Element.initOperations(_LambdaType__Element);
			Fragments._LambdaType__LambdaType.initOperations(_LambdaType__LambdaType);
			Fragments._LambdaType__Nameable.initOperations(_LambdaType__Nameable);
			Fragments._LambdaType__NamedElement.initOperations(_LambdaType__NamedElement);
			Fragments._LambdaType__Namespace.initOperations(_LambdaType__Namespace);
			Fragments._LambdaType__OclAny.initOperations(_LambdaType__OclAny);
			Fragments._LambdaType__OclElement.initOperations(_LambdaType__OclElement);
			Fragments._LambdaType__ParameterableElement.initOperations(_LambdaType__ParameterableElement);
			Fragments._LambdaType__TemplateableElement.initOperations(_LambdaType__TemplateableElement);
			Fragments._LambdaType__Type.initOperations(_LambdaType__Type);
			Fragments._LambdaType__Visitable.initOperations(_LambdaType__Visitable);
	
			Fragments._LetExp__Element.initOperations(_LetExp__Element);
			Fragments._LetExp__LetExp.initOperations(_LetExp__LetExp);
			Fragments._LetExp__Nameable.initOperations(_LetExp__Nameable);
			Fragments._LetExp__NamedElement.initOperations(_LetExp__NamedElement);
			Fragments._LetExp__OclAny.initOperations(_LetExp__OclAny);
			Fragments._LetExp__OclElement.initOperations(_LetExp__OclElement);
			Fragments._LetExp__OclExpression.initOperations(_LetExp__OclExpression);
			Fragments._LetExp__TypedElement.initOperations(_LetExp__TypedElement);
			Fragments._LetExp__Visitable.initOperations(_LetExp__Visitable);
	
			Fragments._Library__Element.initOperations(_Library__Element);
			Fragments._Library__Library.initOperations(_Library__Library);
			Fragments._Library__Nameable.initOperations(_Library__Nameable);
			Fragments._Library__NamedElement.initOperations(_Library__NamedElement);
			Fragments._Library__Namespace.initOperations(_Library__Namespace);
			Fragments._Library__OclAny.initOperations(_Library__OclAny);
			Fragments._Library__OclElement.initOperations(_Library__OclElement);
			Fragments._Library__Package.initOperations(_Library__Package);
			Fragments._Library__TemplateableElement.initOperations(_Library__TemplateableElement);
			Fragments._Library__Visitable.initOperations(_Library__Visitable);
	
			Fragments._LibraryFeature__LibraryFeature.initOperations(_LibraryFeature__LibraryFeature);
	
			Fragments._LiteralExp__Element.initOperations(_LiteralExp__Element);
			Fragments._LiteralExp__LiteralExp.initOperations(_LiteralExp__LiteralExp);
			Fragments._LiteralExp__Nameable.initOperations(_LiteralExp__Nameable);
			Fragments._LiteralExp__NamedElement.initOperations(_LiteralExp__NamedElement);
			Fragments._LiteralExp__OclAny.initOperations(_LiteralExp__OclAny);
			Fragments._LiteralExp__OclElement.initOperations(_LiteralExp__OclElement);
			Fragments._LiteralExp__OclExpression.initOperations(_LiteralExp__OclExpression);
			Fragments._LiteralExp__TypedElement.initOperations(_LiteralExp__TypedElement);
			Fragments._LiteralExp__Visitable.initOperations(_LiteralExp__Visitable);
	
			Fragments._LoopExp__CallExp.initOperations(_LoopExp__CallExp);
			Fragments._LoopExp__Element.initOperations(_LoopExp__Element);
			Fragments._LoopExp__LoopExp.initOperations(_LoopExp__LoopExp);
			Fragments._LoopExp__Nameable.initOperations(_LoopExp__Nameable);
			Fragments._LoopExp__NamedElement.initOperations(_LoopExp__NamedElement);
			Fragments._LoopExp__OclAny.initOperations(_LoopExp__OclAny);
			Fragments._LoopExp__OclElement.initOperations(_LoopExp__OclElement);
			Fragments._LoopExp__OclExpression.initOperations(_LoopExp__OclExpression);
			Fragments._LoopExp__TypedElement.initOperations(_LoopExp__TypedElement);
			Fragments._LoopExp__Visitable.initOperations(_LoopExp__Visitable);
	
			Fragments._MessageExp__Element.initOperations(_MessageExp__Element);
			Fragments._MessageExp__MessageExp.initOperations(_MessageExp__MessageExp);
			Fragments._MessageExp__Nameable.initOperations(_MessageExp__Nameable);
			Fragments._MessageExp__NamedElement.initOperations(_MessageExp__NamedElement);
			Fragments._MessageExp__OclAny.initOperations(_MessageExp__OclAny);
			Fragments._MessageExp__OclElement.initOperations(_MessageExp__OclElement);
			Fragments._MessageExp__OclExpression.initOperations(_MessageExp__OclExpression);
			Fragments._MessageExp__TypedElement.initOperations(_MessageExp__TypedElement);
			Fragments._MessageExp__Visitable.initOperations(_MessageExp__Visitable);
	
			Fragments._MessageType__Element.initOperations(_MessageType__Element);
			Fragments._MessageType__MessageType.initOperations(_MessageType__MessageType);
			Fragments._MessageType__Nameable.initOperations(_MessageType__Nameable);
			Fragments._MessageType__NamedElement.initOperations(_MessageType__NamedElement);
			Fragments._MessageType__OclAny.initOperations(_MessageType__OclAny);
			Fragments._MessageType__OclElement.initOperations(_MessageType__OclElement);
			Fragments._MessageType__ParameterableElement.initOperations(_MessageType__ParameterableElement);
			Fragments._MessageType__TemplateableElement.initOperations(_MessageType__TemplateableElement);
			Fragments._MessageType__Type.initOperations(_MessageType__Type);
			Fragments._MessageType__Visitable.initOperations(_MessageType__Visitable);
	
			Fragments._MultiplicityElement__Element.initOperations(_MultiplicityElement__Element);
			Fragments._MultiplicityElement__MultiplicityElement.initOperations(_MultiplicityElement__MultiplicityElement);
			Fragments._MultiplicityElement__OclAny.initOperations(_MultiplicityElement__OclAny);
			Fragments._MultiplicityElement__OclElement.initOperations(_MultiplicityElement__OclElement);
			Fragments._MultiplicityElement__Visitable.initOperations(_MultiplicityElement__Visitable);
	
			Fragments._Nameable__Nameable.initOperations(_Nameable__Nameable);
			Fragments._Nameable__OclAny.initOperations(_Nameable__OclAny);
			Fragments._Nameable__OclElement.initOperations(_Nameable__OclElement);
	
			Fragments._NamedElement__Element.initOperations(_NamedElement__Element);
			Fragments._NamedElement__Nameable.initOperations(_NamedElement__Nameable);
			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);
			Fragments._NamedElement__Visitable.initOperations(_NamedElement__Visitable);
	
			Fragments._Namespace__Element.initOperations(_Namespace__Element);
			Fragments._Namespace__Nameable.initOperations(_Namespace__Nameable);
			Fragments._Namespace__NamedElement.initOperations(_Namespace__NamedElement);
			Fragments._Namespace__Namespace.initOperations(_Namespace__Namespace);
			Fragments._Namespace__OclAny.initOperations(_Namespace__OclAny);
			Fragments._Namespace__OclElement.initOperations(_Namespace__OclElement);
			Fragments._Namespace__Visitable.initOperations(_Namespace__Visitable);
	
			Fragments._NavigationCallExp__CallExp.initOperations(_NavigationCallExp__CallExp);
			Fragments._NavigationCallExp__Element.initOperations(_NavigationCallExp__Element);
			Fragments._NavigationCallExp__FeatureCallExp.initOperations(_NavigationCallExp__FeatureCallExp);
			Fragments._NavigationCallExp__Nameable.initOperations(_NavigationCallExp__Nameable);
			Fragments._NavigationCallExp__NamedElement.initOperations(_NavigationCallExp__NamedElement);
			Fragments._NavigationCallExp__NavigationCallExp.initOperations(_NavigationCallExp__NavigationCallExp);
			Fragments._NavigationCallExp__OclAny.initOperations(_NavigationCallExp__OclAny);
			Fragments._NavigationCallExp__OclElement.initOperations(_NavigationCallExp__OclElement);
			Fragments._NavigationCallExp__OclExpression.initOperations(_NavigationCallExp__OclExpression);
			Fragments._NavigationCallExp__TypedElement.initOperations(_NavigationCallExp__TypedElement);
			Fragments._NavigationCallExp__Visitable.initOperations(_NavigationCallExp__Visitable);
	
			Fragments._NullLiteralExp__Element.initOperations(_NullLiteralExp__Element);
			Fragments._NullLiteralExp__LiteralExp.initOperations(_NullLiteralExp__LiteralExp);
			Fragments._NullLiteralExp__Nameable.initOperations(_NullLiteralExp__Nameable);
			Fragments._NullLiteralExp__NamedElement.initOperations(_NullLiteralExp__NamedElement);
			Fragments._NullLiteralExp__NullLiteralExp.initOperations(_NullLiteralExp__NullLiteralExp);
			Fragments._NullLiteralExp__OclAny.initOperations(_NullLiteralExp__OclAny);
			Fragments._NullLiteralExp__OclElement.initOperations(_NullLiteralExp__OclElement);
			Fragments._NullLiteralExp__OclExpression.initOperations(_NullLiteralExp__OclExpression);
			Fragments._NullLiteralExp__PrimitiveLiteralExp.initOperations(_NullLiteralExp__PrimitiveLiteralExp);
			Fragments._NullLiteralExp__TypedElement.initOperations(_NullLiteralExp__TypedElement);
			Fragments._NullLiteralExp__Visitable.initOperations(_NullLiteralExp__Visitable);
	
			Fragments._NumericLiteralExp__Element.initOperations(_NumericLiteralExp__Element);
			Fragments._NumericLiteralExp__LiteralExp.initOperations(_NumericLiteralExp__LiteralExp);
			Fragments._NumericLiteralExp__Nameable.initOperations(_NumericLiteralExp__Nameable);
			Fragments._NumericLiteralExp__NamedElement.initOperations(_NumericLiteralExp__NamedElement);
			Fragments._NumericLiteralExp__NumericLiteralExp.initOperations(_NumericLiteralExp__NumericLiteralExp);
			Fragments._NumericLiteralExp__OclAny.initOperations(_NumericLiteralExp__OclAny);
			Fragments._NumericLiteralExp__OclElement.initOperations(_NumericLiteralExp__OclElement);
			Fragments._NumericLiteralExp__OclExpression.initOperations(_NumericLiteralExp__OclExpression);
			Fragments._NumericLiteralExp__PrimitiveLiteralExp.initOperations(_NumericLiteralExp__PrimitiveLiteralExp);
			Fragments._NumericLiteralExp__TypedElement.initOperations(_NumericLiteralExp__TypedElement);
			Fragments._NumericLiteralExp__Visitable.initOperations(_NumericLiteralExp__Visitable);
	
			Fragments._Object__Object.initOperations(_Object__Object);
	
			Fragments._OclExpression__Element.initOperations(_OclExpression__Element);
			Fragments._OclExpression__Nameable.initOperations(_OclExpression__Nameable);
			Fragments._OclExpression__NamedElement.initOperations(_OclExpression__NamedElement);
			Fragments._OclExpression__OclAny.initOperations(_OclExpression__OclAny);
			Fragments._OclExpression__OclElement.initOperations(_OclExpression__OclElement);
			Fragments._OclExpression__OclExpression.initOperations(_OclExpression__OclExpression);
			Fragments._OclExpression__TypedElement.initOperations(_OclExpression__TypedElement);
			Fragments._OclExpression__Visitable.initOperations(_OclExpression__Visitable);
	
			Fragments._OpaqueExpression__Element.initOperations(_OpaqueExpression__Element);
			Fragments._OpaqueExpression__Nameable.initOperations(_OpaqueExpression__Nameable);
			Fragments._OpaqueExpression__NamedElement.initOperations(_OpaqueExpression__NamedElement);
			Fragments._OpaqueExpression__OclAny.initOperations(_OpaqueExpression__OclAny);
			Fragments._OpaqueExpression__OclElement.initOperations(_OpaqueExpression__OclElement);
			Fragments._OpaqueExpression__OpaqueExpression.initOperations(_OpaqueExpression__OpaqueExpression);
			Fragments._OpaqueExpression__ParameterableElement.initOperations(_OpaqueExpression__ParameterableElement);
			Fragments._OpaqueExpression__TypedElement.initOperations(_OpaqueExpression__TypedElement);
			Fragments._OpaqueExpression__ValueSpecification.initOperations(_OpaqueExpression__ValueSpecification);
			Fragments._OpaqueExpression__Visitable.initOperations(_OpaqueExpression__Visitable);
	
			Fragments._Operation__Element.initOperations(_Operation__Element);
			Fragments._Operation__Feature.initOperations(_Operation__Feature);
			Fragments._Operation__MultiplicityElement.initOperations(_Operation__MultiplicityElement);
			Fragments._Operation__Nameable.initOperations(_Operation__Nameable);
			Fragments._Operation__NamedElement.initOperations(_Operation__NamedElement);
			Fragments._Operation__Namespace.initOperations(_Operation__Namespace);
			Fragments._Operation__OclAny.initOperations(_Operation__OclAny);
			Fragments._Operation__OclElement.initOperations(_Operation__OclElement);
			Fragments._Operation__Operation.initOperations(_Operation__Operation);
			Fragments._Operation__ParameterableElement.initOperations(_Operation__ParameterableElement);
			Fragments._Operation__TemplateableElement.initOperations(_Operation__TemplateableElement);
			Fragments._Operation__TypedElement.initOperations(_Operation__TypedElement);
			Fragments._Operation__TypedMultiplicityElement.initOperations(_Operation__TypedMultiplicityElement);
			Fragments._Operation__Visitable.initOperations(_Operation__Visitable);
	
			Fragments._OperationCallExp__CallExp.initOperations(_OperationCallExp__CallExp);
			Fragments._OperationCallExp__Element.initOperations(_OperationCallExp__Element);
			Fragments._OperationCallExp__FeatureCallExp.initOperations(_OperationCallExp__FeatureCallExp);
			Fragments._OperationCallExp__Nameable.initOperations(_OperationCallExp__Nameable);
			Fragments._OperationCallExp__NamedElement.initOperations(_OperationCallExp__NamedElement);
			Fragments._OperationCallExp__OclAny.initOperations(_OperationCallExp__OclAny);
			Fragments._OperationCallExp__OclElement.initOperations(_OperationCallExp__OclElement);
			Fragments._OperationCallExp__OclExpression.initOperations(_OperationCallExp__OclExpression);
			Fragments._OperationCallExp__OperationCallExp.initOperations(_OperationCallExp__OperationCallExp);
			Fragments._OperationCallExp__TypedElement.initOperations(_OperationCallExp__TypedElement);
			Fragments._OperationCallExp__Visitable.initOperations(_OperationCallExp__Visitable);
	
			Fragments._OperationTemplateParameter__Element.initOperations(_OperationTemplateParameter__Element);
			Fragments._OperationTemplateParameter__OclAny.initOperations(_OperationTemplateParameter__OclAny);
			Fragments._OperationTemplateParameter__OclElement.initOperations(_OperationTemplateParameter__OclElement);
			Fragments._OperationTemplateParameter__OperationTemplateParameter.initOperations(_OperationTemplateParameter__OperationTemplateParameter);
			Fragments._OperationTemplateParameter__TemplateParameter.initOperations(_OperationTemplateParameter__TemplateParameter);
			Fragments._OperationTemplateParameter__Visitable.initOperations(_OperationTemplateParameter__Visitable);
	
			Fragments._OrderedSetType__Class.initOperations(_OrderedSetType__Class);
			Fragments._OrderedSetType__CollectionType.initOperations(_OrderedSetType__CollectionType);
			Fragments._OrderedSetType__DataType.initOperations(_OrderedSetType__DataType);
			Fragments._OrderedSetType__Element.initOperations(_OrderedSetType__Element);
			Fragments._OrderedSetType__Nameable.initOperations(_OrderedSetType__Nameable);
			Fragments._OrderedSetType__NamedElement.initOperations(_OrderedSetType__NamedElement);
			Fragments._OrderedSetType__Namespace.initOperations(_OrderedSetType__Namespace);
			Fragments._OrderedSetType__OclAny.initOperations(_OrderedSetType__OclAny);
			Fragments._OrderedSetType__OclElement.initOperations(_OrderedSetType__OclElement);
			Fragments._OrderedSetType__OrderedSetType.initOperations(_OrderedSetType__OrderedSetType);
			Fragments._OrderedSetType__ParameterableElement.initOperations(_OrderedSetType__ParameterableElement);
			Fragments._OrderedSetType__TemplateableElement.initOperations(_OrderedSetType__TemplateableElement);
			Fragments._OrderedSetType__Type.initOperations(_OrderedSetType__Type);
			Fragments._OrderedSetType__Visitable.initOperations(_OrderedSetType__Visitable);
	
			Fragments._Package__Element.initOperations(_Package__Element);
			Fragments._Package__Nameable.initOperations(_Package__Nameable);
			Fragments._Package__NamedElement.initOperations(_Package__NamedElement);
			Fragments._Package__Namespace.initOperations(_Package__Namespace);
			Fragments._Package__OclAny.initOperations(_Package__OclAny);
			Fragments._Package__OclElement.initOperations(_Package__OclElement);
			Fragments._Package__Package.initOperations(_Package__Package);
			Fragments._Package__TemplateableElement.initOperations(_Package__TemplateableElement);
			Fragments._Package__Visitable.initOperations(_Package__Visitable);
	
			Fragments._PackageableElement__Element.initOperations(_PackageableElement__Element);
			Fragments._PackageableElement__OclAny.initOperations(_PackageableElement__OclAny);
			Fragments._PackageableElement__OclElement.initOperations(_PackageableElement__OclElement);
			Fragments._PackageableElement__PackageableElement.initOperations(_PackageableElement__PackageableElement);
			Fragments._PackageableElement__ParameterableElement.initOperations(_PackageableElement__ParameterableElement);
			Fragments._PackageableElement__Visitable.initOperations(_PackageableElement__Visitable);
	
			Fragments._Parameter__Element.initOperations(_Parameter__Element);
			Fragments._Parameter__MultiplicityElement.initOperations(_Parameter__MultiplicityElement);
			Fragments._Parameter__Nameable.initOperations(_Parameter__Nameable);
			Fragments._Parameter__NamedElement.initOperations(_Parameter__NamedElement);
			Fragments._Parameter__OclAny.initOperations(_Parameter__OclAny);
			Fragments._Parameter__OclElement.initOperations(_Parameter__OclElement);
			Fragments._Parameter__Parameter.initOperations(_Parameter__Parameter);
			Fragments._Parameter__TypedElement.initOperations(_Parameter__TypedElement);
			Fragments._Parameter__TypedMultiplicityElement.initOperations(_Parameter__TypedMultiplicityElement);
			Fragments._Parameter__VariableDeclaration.initOperations(_Parameter__VariableDeclaration);
			Fragments._Parameter__Visitable.initOperations(_Parameter__Visitable);
	
			Fragments._ParameterableElement__Element.initOperations(_ParameterableElement__Element);
			Fragments._ParameterableElement__OclAny.initOperations(_ParameterableElement__OclAny);
			Fragments._ParameterableElement__OclElement.initOperations(_ParameterableElement__OclElement);
			Fragments._ParameterableElement__ParameterableElement.initOperations(_ParameterableElement__ParameterableElement);
			Fragments._ParameterableElement__Visitable.initOperations(_ParameterableElement__Visitable);
	
			Fragments._Pivotable__OclAny.initOperations(_Pivotable__OclAny);
			Fragments._Pivotable__OclElement.initOperations(_Pivotable__OclElement);
			Fragments._Pivotable__Pivotable.initOperations(_Pivotable__Pivotable);
	
			Fragments._Precedence__Element.initOperations(_Precedence__Element);
			Fragments._Precedence__Nameable.initOperations(_Precedence__Nameable);
			Fragments._Precedence__NamedElement.initOperations(_Precedence__NamedElement);
			Fragments._Precedence__OclAny.initOperations(_Precedence__OclAny);
			Fragments._Precedence__OclElement.initOperations(_Precedence__OclElement);
			Fragments._Precedence__Precedence.initOperations(_Precedence__Precedence);
			Fragments._Precedence__Visitable.initOperations(_Precedence__Visitable);
	
			Fragments._PrimitiveLiteralExp__Element.initOperations(_PrimitiveLiteralExp__Element);
			Fragments._PrimitiveLiteralExp__LiteralExp.initOperations(_PrimitiveLiteralExp__LiteralExp);
			Fragments._PrimitiveLiteralExp__Nameable.initOperations(_PrimitiveLiteralExp__Nameable);
			Fragments._PrimitiveLiteralExp__NamedElement.initOperations(_PrimitiveLiteralExp__NamedElement);
			Fragments._PrimitiveLiteralExp__OclAny.initOperations(_PrimitiveLiteralExp__OclAny);
			Fragments._PrimitiveLiteralExp__OclElement.initOperations(_PrimitiveLiteralExp__OclElement);
			Fragments._PrimitiveLiteralExp__OclExpression.initOperations(_PrimitiveLiteralExp__OclExpression);
			Fragments._PrimitiveLiteralExp__PrimitiveLiteralExp.initOperations(_PrimitiveLiteralExp__PrimitiveLiteralExp);
			Fragments._PrimitiveLiteralExp__TypedElement.initOperations(_PrimitiveLiteralExp__TypedElement);
			Fragments._PrimitiveLiteralExp__Visitable.initOperations(_PrimitiveLiteralExp__Visitable);
	
			Fragments._PrimitiveType__Class.initOperations(_PrimitiveType__Class);
			Fragments._PrimitiveType__DataType.initOperations(_PrimitiveType__DataType);
			Fragments._PrimitiveType__Element.initOperations(_PrimitiveType__Element);
			Fragments._PrimitiveType__Nameable.initOperations(_PrimitiveType__Nameable);
			Fragments._PrimitiveType__NamedElement.initOperations(_PrimitiveType__NamedElement);
			Fragments._PrimitiveType__Namespace.initOperations(_PrimitiveType__Namespace);
			Fragments._PrimitiveType__OclAny.initOperations(_PrimitiveType__OclAny);
			Fragments._PrimitiveType__OclElement.initOperations(_PrimitiveType__OclElement);
			Fragments._PrimitiveType__ParameterableElement.initOperations(_PrimitiveType__ParameterableElement);
			Fragments._PrimitiveType__PrimitiveType.initOperations(_PrimitiveType__PrimitiveType);
			Fragments._PrimitiveType__TemplateableElement.initOperations(_PrimitiveType__TemplateableElement);
			Fragments._PrimitiveType__Type.initOperations(_PrimitiveType__Type);
			Fragments._PrimitiveType__Visitable.initOperations(_PrimitiveType__Visitable);
	
			Fragments._Property__Element.initOperations(_Property__Element);
			Fragments._Property__Feature.initOperations(_Property__Feature);
			Fragments._Property__MultiplicityElement.initOperations(_Property__MultiplicityElement);
			Fragments._Property__Nameable.initOperations(_Property__Nameable);
			Fragments._Property__NamedElement.initOperations(_Property__NamedElement);
			Fragments._Property__OclAny.initOperations(_Property__OclAny);
			Fragments._Property__OclElement.initOperations(_Property__OclElement);
			Fragments._Property__ParameterableElement.initOperations(_Property__ParameterableElement);
			Fragments._Property__Property.initOperations(_Property__Property);
			Fragments._Property__TypedElement.initOperations(_Property__TypedElement);
			Fragments._Property__TypedMultiplicityElement.initOperations(_Property__TypedMultiplicityElement);
			Fragments._Property__Visitable.initOperations(_Property__Visitable);
	
			Fragments._PropertyCallExp__CallExp.initOperations(_PropertyCallExp__CallExp);
			Fragments._PropertyCallExp__Element.initOperations(_PropertyCallExp__Element);
			Fragments._PropertyCallExp__FeatureCallExp.initOperations(_PropertyCallExp__FeatureCallExp);
			Fragments._PropertyCallExp__Nameable.initOperations(_PropertyCallExp__Nameable);
			Fragments._PropertyCallExp__NamedElement.initOperations(_PropertyCallExp__NamedElement);
			Fragments._PropertyCallExp__NavigationCallExp.initOperations(_PropertyCallExp__NavigationCallExp);
			Fragments._PropertyCallExp__OclAny.initOperations(_PropertyCallExp__OclAny);
			Fragments._PropertyCallExp__OclElement.initOperations(_PropertyCallExp__OclElement);
			Fragments._PropertyCallExp__OclExpression.initOperations(_PropertyCallExp__OclExpression);
			Fragments._PropertyCallExp__PropertyCallExp.initOperations(_PropertyCallExp__PropertyCallExp);
			Fragments._PropertyCallExp__TypedElement.initOperations(_PropertyCallExp__TypedElement);
			Fragments._PropertyCallExp__Visitable.initOperations(_PropertyCallExp__Visitable);
	
	
			Fragments._RealLiteralExp__Element.initOperations(_RealLiteralExp__Element);
			Fragments._RealLiteralExp__LiteralExp.initOperations(_RealLiteralExp__LiteralExp);
			Fragments._RealLiteralExp__Nameable.initOperations(_RealLiteralExp__Nameable);
			Fragments._RealLiteralExp__NamedElement.initOperations(_RealLiteralExp__NamedElement);
			Fragments._RealLiteralExp__NumericLiteralExp.initOperations(_RealLiteralExp__NumericLiteralExp);
			Fragments._RealLiteralExp__OclAny.initOperations(_RealLiteralExp__OclAny);
			Fragments._RealLiteralExp__OclElement.initOperations(_RealLiteralExp__OclElement);
			Fragments._RealLiteralExp__OclExpression.initOperations(_RealLiteralExp__OclExpression);
			Fragments._RealLiteralExp__PrimitiveLiteralExp.initOperations(_RealLiteralExp__PrimitiveLiteralExp);
			Fragments._RealLiteralExp__RealLiteralExp.initOperations(_RealLiteralExp__RealLiteralExp);
			Fragments._RealLiteralExp__TypedElement.initOperations(_RealLiteralExp__TypedElement);
			Fragments._RealLiteralExp__Visitable.initOperations(_RealLiteralExp__Visitable);
	
			Fragments._SelfType__Class.initOperations(_SelfType__Class);
			Fragments._SelfType__Element.initOperations(_SelfType__Element);
			Fragments._SelfType__Nameable.initOperations(_SelfType__Nameable);
			Fragments._SelfType__NamedElement.initOperations(_SelfType__NamedElement);
			Fragments._SelfType__Namespace.initOperations(_SelfType__Namespace);
			Fragments._SelfType__OclAny.initOperations(_SelfType__OclAny);
			Fragments._SelfType__OclElement.initOperations(_SelfType__OclElement);
			Fragments._SelfType__ParameterableElement.initOperations(_SelfType__ParameterableElement);
			Fragments._SelfType__SelfType.initOperations(_SelfType__SelfType);
			Fragments._SelfType__TemplateableElement.initOperations(_SelfType__TemplateableElement);
			Fragments._SelfType__Type.initOperations(_SelfType__Type);
			Fragments._SelfType__Visitable.initOperations(_SelfType__Visitable);
	
			Fragments._SendSignalAction__Element.initOperations(_SendSignalAction__Element);
			Fragments._SendSignalAction__Nameable.initOperations(_SendSignalAction__Nameable);
			Fragments._SendSignalAction__NamedElement.initOperations(_SendSignalAction__NamedElement);
			Fragments._SendSignalAction__OclAny.initOperations(_SendSignalAction__OclAny);
			Fragments._SendSignalAction__OclElement.initOperations(_SendSignalAction__OclElement);
			Fragments._SendSignalAction__SendSignalAction.initOperations(_SendSignalAction__SendSignalAction);
			Fragments._SendSignalAction__Visitable.initOperations(_SendSignalAction__Visitable);
	
			Fragments._SequenceType__Class.initOperations(_SequenceType__Class);
			Fragments._SequenceType__CollectionType.initOperations(_SequenceType__CollectionType);
			Fragments._SequenceType__DataType.initOperations(_SequenceType__DataType);
			Fragments._SequenceType__Element.initOperations(_SequenceType__Element);
			Fragments._SequenceType__Nameable.initOperations(_SequenceType__Nameable);
			Fragments._SequenceType__NamedElement.initOperations(_SequenceType__NamedElement);
			Fragments._SequenceType__Namespace.initOperations(_SequenceType__Namespace);
			Fragments._SequenceType__OclAny.initOperations(_SequenceType__OclAny);
			Fragments._SequenceType__OclElement.initOperations(_SequenceType__OclElement);
			Fragments._SequenceType__ParameterableElement.initOperations(_SequenceType__ParameterableElement);
			Fragments._SequenceType__SequenceType.initOperations(_SequenceType__SequenceType);
			Fragments._SequenceType__TemplateableElement.initOperations(_SequenceType__TemplateableElement);
			Fragments._SequenceType__Type.initOperations(_SequenceType__Type);
			Fragments._SequenceType__Visitable.initOperations(_SequenceType__Visitable);
	
			Fragments._SetType__Class.initOperations(_SetType__Class);
			Fragments._SetType__CollectionType.initOperations(_SetType__CollectionType);
			Fragments._SetType__DataType.initOperations(_SetType__DataType);
			Fragments._SetType__Element.initOperations(_SetType__Element);
			Fragments._SetType__Nameable.initOperations(_SetType__Nameable);
			Fragments._SetType__NamedElement.initOperations(_SetType__NamedElement);
			Fragments._SetType__Namespace.initOperations(_SetType__Namespace);
			Fragments._SetType__OclAny.initOperations(_SetType__OclAny);
			Fragments._SetType__OclElement.initOperations(_SetType__OclElement);
			Fragments._SetType__ParameterableElement.initOperations(_SetType__ParameterableElement);
			Fragments._SetType__SetType.initOperations(_SetType__SetType);
			Fragments._SetType__TemplateableElement.initOperations(_SetType__TemplateableElement);
			Fragments._SetType__Type.initOperations(_SetType__Type);
			Fragments._SetType__Visitable.initOperations(_SetType__Visitable);
	
			Fragments._Signal__Element.initOperations(_Signal__Element);
			Fragments._Signal__Nameable.initOperations(_Signal__Nameable);
			Fragments._Signal__NamedElement.initOperations(_Signal__NamedElement);
			Fragments._Signal__OclAny.initOperations(_Signal__OclAny);
			Fragments._Signal__OclElement.initOperations(_Signal__OclElement);
			Fragments._Signal__Signal.initOperations(_Signal__Signal);
			Fragments._Signal__Visitable.initOperations(_Signal__Visitable);
	
			Fragments._State__Element.initOperations(_State__Element);
			Fragments._State__Nameable.initOperations(_State__Nameable);
			Fragments._State__NamedElement.initOperations(_State__NamedElement);
			Fragments._State__OclAny.initOperations(_State__OclAny);
			Fragments._State__OclElement.initOperations(_State__OclElement);
			Fragments._State__State.initOperations(_State__State);
			Fragments._State__Visitable.initOperations(_State__Visitable);
	
			Fragments._StateExp__Element.initOperations(_StateExp__Element);
			Fragments._StateExp__Nameable.initOperations(_StateExp__Nameable);
			Fragments._StateExp__NamedElement.initOperations(_StateExp__NamedElement);
			Fragments._StateExp__OclAny.initOperations(_StateExp__OclAny);
			Fragments._StateExp__OclElement.initOperations(_StateExp__OclElement);
			Fragments._StateExp__OclExpression.initOperations(_StateExp__OclExpression);
			Fragments._StateExp__StateExp.initOperations(_StateExp__StateExp);
			Fragments._StateExp__TypedElement.initOperations(_StateExp__TypedElement);
			Fragments._StateExp__Visitable.initOperations(_StateExp__Visitable);
	
	
			Fragments._StringLiteralExp__Element.initOperations(_StringLiteralExp__Element);
			Fragments._StringLiteralExp__LiteralExp.initOperations(_StringLiteralExp__LiteralExp);
			Fragments._StringLiteralExp__Nameable.initOperations(_StringLiteralExp__Nameable);
			Fragments._StringLiteralExp__NamedElement.initOperations(_StringLiteralExp__NamedElement);
			Fragments._StringLiteralExp__OclAny.initOperations(_StringLiteralExp__OclAny);
			Fragments._StringLiteralExp__OclElement.initOperations(_StringLiteralExp__OclElement);
			Fragments._StringLiteralExp__OclExpression.initOperations(_StringLiteralExp__OclExpression);
			Fragments._StringLiteralExp__PrimitiveLiteralExp.initOperations(_StringLiteralExp__PrimitiveLiteralExp);
			Fragments._StringLiteralExp__StringLiteralExp.initOperations(_StringLiteralExp__StringLiteralExp);
			Fragments._StringLiteralExp__TypedElement.initOperations(_StringLiteralExp__TypedElement);
			Fragments._StringLiteralExp__Visitable.initOperations(_StringLiteralExp__Visitable);
	
			Fragments._TemplateBinding__Element.initOperations(_TemplateBinding__Element);
			Fragments._TemplateBinding__OclAny.initOperations(_TemplateBinding__OclAny);
			Fragments._TemplateBinding__OclElement.initOperations(_TemplateBinding__OclElement);
			Fragments._TemplateBinding__TemplateBinding.initOperations(_TemplateBinding__TemplateBinding);
			Fragments._TemplateBinding__Visitable.initOperations(_TemplateBinding__Visitable);
	
			Fragments._TemplateParameter__Element.initOperations(_TemplateParameter__Element);
			Fragments._TemplateParameter__OclAny.initOperations(_TemplateParameter__OclAny);
			Fragments._TemplateParameter__OclElement.initOperations(_TemplateParameter__OclElement);
			Fragments._TemplateParameter__TemplateParameter.initOperations(_TemplateParameter__TemplateParameter);
			Fragments._TemplateParameter__Visitable.initOperations(_TemplateParameter__Visitable);
	
			Fragments._TemplateParameterSubstitution__Element.initOperations(_TemplateParameterSubstitution__Element);
			Fragments._TemplateParameterSubstitution__OclAny.initOperations(_TemplateParameterSubstitution__OclAny);
			Fragments._TemplateParameterSubstitution__OclElement.initOperations(_TemplateParameterSubstitution__OclElement);
			Fragments._TemplateParameterSubstitution__TemplateParameterSubstitution.initOperations(_TemplateParameterSubstitution__TemplateParameterSubstitution);
			Fragments._TemplateParameterSubstitution__Visitable.initOperations(_TemplateParameterSubstitution__Visitable);
	
			Fragments._TemplateParameterType__Element.initOperations(_TemplateParameterType__Element);
			Fragments._TemplateParameterType__Nameable.initOperations(_TemplateParameterType__Nameable);
			Fragments._TemplateParameterType__NamedElement.initOperations(_TemplateParameterType__NamedElement);
			Fragments._TemplateParameterType__OclAny.initOperations(_TemplateParameterType__OclAny);
			Fragments._TemplateParameterType__OclElement.initOperations(_TemplateParameterType__OclElement);
			Fragments._TemplateParameterType__ParameterableElement.initOperations(_TemplateParameterType__ParameterableElement);
			Fragments._TemplateParameterType__TemplateParameterType.initOperations(_TemplateParameterType__TemplateParameterType);
			Fragments._TemplateParameterType__TemplateableElement.initOperations(_TemplateParameterType__TemplateableElement);
			Fragments._TemplateParameterType__Type.initOperations(_TemplateParameterType__Type);
			Fragments._TemplateParameterType__Visitable.initOperations(_TemplateParameterType__Visitable);
	
			Fragments._TemplateSignature__Element.initOperations(_TemplateSignature__Element);
			Fragments._TemplateSignature__OclAny.initOperations(_TemplateSignature__OclAny);
			Fragments._TemplateSignature__OclElement.initOperations(_TemplateSignature__OclElement);
			Fragments._TemplateSignature__TemplateSignature.initOperations(_TemplateSignature__TemplateSignature);
			Fragments._TemplateSignature__Visitable.initOperations(_TemplateSignature__Visitable);
	
			Fragments._TemplateableElement__Element.initOperations(_TemplateableElement__Element);
			Fragments._TemplateableElement__OclAny.initOperations(_TemplateableElement__OclAny);
			Fragments._TemplateableElement__OclElement.initOperations(_TemplateableElement__OclElement);
			Fragments._TemplateableElement__TemplateableElement.initOperations(_TemplateableElement__TemplateableElement);
			Fragments._TemplateableElement__Visitable.initOperations(_TemplateableElement__Visitable);
	
			Fragments._Throwable__Throwable.initOperations(_Throwable__Throwable);
	
			Fragments._TupleLiteralExp__Element.initOperations(_TupleLiteralExp__Element);
			Fragments._TupleLiteralExp__LiteralExp.initOperations(_TupleLiteralExp__LiteralExp);
			Fragments._TupleLiteralExp__Nameable.initOperations(_TupleLiteralExp__Nameable);
			Fragments._TupleLiteralExp__NamedElement.initOperations(_TupleLiteralExp__NamedElement);
			Fragments._TupleLiteralExp__OclAny.initOperations(_TupleLiteralExp__OclAny);
			Fragments._TupleLiteralExp__OclElement.initOperations(_TupleLiteralExp__OclElement);
			Fragments._TupleLiteralExp__OclExpression.initOperations(_TupleLiteralExp__OclExpression);
			Fragments._TupleLiteralExp__TupleLiteralExp.initOperations(_TupleLiteralExp__TupleLiteralExp);
			Fragments._TupleLiteralExp__TypedElement.initOperations(_TupleLiteralExp__TypedElement);
			Fragments._TupleLiteralExp__Visitable.initOperations(_TupleLiteralExp__Visitable);
	
			Fragments._TupleLiteralPart__Element.initOperations(_TupleLiteralPart__Element);
			Fragments._TupleLiteralPart__Nameable.initOperations(_TupleLiteralPart__Nameable);
			Fragments._TupleLiteralPart__NamedElement.initOperations(_TupleLiteralPart__NamedElement);
			Fragments._TupleLiteralPart__OclAny.initOperations(_TupleLiteralPart__OclAny);
			Fragments._TupleLiteralPart__OclElement.initOperations(_TupleLiteralPart__OclElement);
			Fragments._TupleLiteralPart__TupleLiteralPart.initOperations(_TupleLiteralPart__TupleLiteralPart);
			Fragments._TupleLiteralPart__TypedElement.initOperations(_TupleLiteralPart__TypedElement);
			Fragments._TupleLiteralPart__VariableDeclaration.initOperations(_TupleLiteralPart__VariableDeclaration);
			Fragments._TupleLiteralPart__Visitable.initOperations(_TupleLiteralPart__Visitable);
	
			Fragments._TupleType__Class.initOperations(_TupleType__Class);
			Fragments._TupleType__DataType.initOperations(_TupleType__DataType);
			Fragments._TupleType__Element.initOperations(_TupleType__Element);
			Fragments._TupleType__Nameable.initOperations(_TupleType__Nameable);
			Fragments._TupleType__NamedElement.initOperations(_TupleType__NamedElement);
			Fragments._TupleType__Namespace.initOperations(_TupleType__Namespace);
			Fragments._TupleType__OclAny.initOperations(_TupleType__OclAny);
			Fragments._TupleType__OclElement.initOperations(_TupleType__OclElement);
			Fragments._TupleType__ParameterableElement.initOperations(_TupleType__ParameterableElement);
			Fragments._TupleType__TemplateableElement.initOperations(_TupleType__TemplateableElement);
			Fragments._TupleType__TupleType.initOperations(_TupleType__TupleType);
			Fragments._TupleType__Type.initOperations(_TupleType__Type);
			Fragments._TupleType__Visitable.initOperations(_TupleType__Visitable);
	
			Fragments._Type__Element.initOperations(_Type__Element);
			Fragments._Type__Nameable.initOperations(_Type__Nameable);
			Fragments._Type__NamedElement.initOperations(_Type__NamedElement);
			Fragments._Type__OclAny.initOperations(_Type__OclAny);
			Fragments._Type__OclElement.initOperations(_Type__OclElement);
			Fragments._Type__ParameterableElement.initOperations(_Type__ParameterableElement);
			Fragments._Type__TemplateableElement.initOperations(_Type__TemplateableElement);
			Fragments._Type__Type.initOperations(_Type__Type);
			Fragments._Type__Visitable.initOperations(_Type__Visitable);
	
			Fragments._TypeExp__Element.initOperations(_TypeExp__Element);
			Fragments._TypeExp__Nameable.initOperations(_TypeExp__Nameable);
			Fragments._TypeExp__NamedElement.initOperations(_TypeExp__NamedElement);
			Fragments._TypeExp__OclAny.initOperations(_TypeExp__OclAny);
			Fragments._TypeExp__OclElement.initOperations(_TypeExp__OclElement);
			Fragments._TypeExp__OclExpression.initOperations(_TypeExp__OclExpression);
			Fragments._TypeExp__TypeExp.initOperations(_TypeExp__TypeExp);
			Fragments._TypeExp__TypedElement.initOperations(_TypeExp__TypedElement);
			Fragments._TypeExp__Visitable.initOperations(_TypeExp__Visitable);
	
			Fragments._TypeTemplateParameter__Element.initOperations(_TypeTemplateParameter__Element);
			Fragments._TypeTemplateParameter__OclAny.initOperations(_TypeTemplateParameter__OclAny);
			Fragments._TypeTemplateParameter__OclElement.initOperations(_TypeTemplateParameter__OclElement);
			Fragments._TypeTemplateParameter__TemplateParameter.initOperations(_TypeTemplateParameter__TemplateParameter);
			Fragments._TypeTemplateParameter__TypeTemplateParameter.initOperations(_TypeTemplateParameter__TypeTemplateParameter);
			Fragments._TypeTemplateParameter__Visitable.initOperations(_TypeTemplateParameter__Visitable);
	
			Fragments._TypedElement__Element.initOperations(_TypedElement__Element);
			Fragments._TypedElement__Nameable.initOperations(_TypedElement__Nameable);
			Fragments._TypedElement__NamedElement.initOperations(_TypedElement__NamedElement);
			Fragments._TypedElement__OclAny.initOperations(_TypedElement__OclAny);
			Fragments._TypedElement__OclElement.initOperations(_TypedElement__OclElement);
			Fragments._TypedElement__TypedElement.initOperations(_TypedElement__TypedElement);
			Fragments._TypedElement__Visitable.initOperations(_TypedElement__Visitable);
	
			Fragments._TypedMultiplicityElement__Element.initOperations(_TypedMultiplicityElement__Element);
			Fragments._TypedMultiplicityElement__MultiplicityElement.initOperations(_TypedMultiplicityElement__MultiplicityElement);
			Fragments._TypedMultiplicityElement__Nameable.initOperations(_TypedMultiplicityElement__Nameable);
			Fragments._TypedMultiplicityElement__NamedElement.initOperations(_TypedMultiplicityElement__NamedElement);
			Fragments._TypedMultiplicityElement__OclAny.initOperations(_TypedMultiplicityElement__OclAny);
			Fragments._TypedMultiplicityElement__OclElement.initOperations(_TypedMultiplicityElement__OclElement);
			Fragments._TypedMultiplicityElement__TypedElement.initOperations(_TypedMultiplicityElement__TypedElement);
			Fragments._TypedMultiplicityElement__TypedMultiplicityElement.initOperations(_TypedMultiplicityElement__TypedMultiplicityElement);
			Fragments._TypedMultiplicityElement__Visitable.initOperations(_TypedMultiplicityElement__Visitable);
	
	
			Fragments._UnlimitedNaturalLiteralExp__Element.initOperations(_UnlimitedNaturalLiteralExp__Element);
			Fragments._UnlimitedNaturalLiteralExp__LiteralExp.initOperations(_UnlimitedNaturalLiteralExp__LiteralExp);
			Fragments._UnlimitedNaturalLiteralExp__Nameable.initOperations(_UnlimitedNaturalLiteralExp__Nameable);
			Fragments._UnlimitedNaturalLiteralExp__NamedElement.initOperations(_UnlimitedNaturalLiteralExp__NamedElement);
			Fragments._UnlimitedNaturalLiteralExp__NumericLiteralExp.initOperations(_UnlimitedNaturalLiteralExp__NumericLiteralExp);
			Fragments._UnlimitedNaturalLiteralExp__OclAny.initOperations(_UnlimitedNaturalLiteralExp__OclAny);
			Fragments._UnlimitedNaturalLiteralExp__OclElement.initOperations(_UnlimitedNaturalLiteralExp__OclElement);
			Fragments._UnlimitedNaturalLiteralExp__OclExpression.initOperations(_UnlimitedNaturalLiteralExp__OclExpression);
			Fragments._UnlimitedNaturalLiteralExp__PrimitiveLiteralExp.initOperations(_UnlimitedNaturalLiteralExp__PrimitiveLiteralExp);
			Fragments._UnlimitedNaturalLiteralExp__TypedElement.initOperations(_UnlimitedNaturalLiteralExp__TypedElement);
			Fragments._UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp.initOperations(_UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp);
			Fragments._UnlimitedNaturalLiteralExp__Visitable.initOperations(_UnlimitedNaturalLiteralExp__Visitable);
	
			Fragments._UnspecifiedType__Class.initOperations(_UnspecifiedType__Class);
			Fragments._UnspecifiedType__Element.initOperations(_UnspecifiedType__Element);
			Fragments._UnspecifiedType__Nameable.initOperations(_UnspecifiedType__Nameable);
			Fragments._UnspecifiedType__NamedElement.initOperations(_UnspecifiedType__NamedElement);
			Fragments._UnspecifiedType__Namespace.initOperations(_UnspecifiedType__Namespace);
			Fragments._UnspecifiedType__OclAny.initOperations(_UnspecifiedType__OclAny);
			Fragments._UnspecifiedType__OclElement.initOperations(_UnspecifiedType__OclElement);
			Fragments._UnspecifiedType__ParameterableElement.initOperations(_UnspecifiedType__ParameterableElement);
			Fragments._UnspecifiedType__TemplateableElement.initOperations(_UnspecifiedType__TemplateableElement);
			Fragments._UnspecifiedType__Type.initOperations(_UnspecifiedType__Type);
			Fragments._UnspecifiedType__UnspecifiedType.initOperations(_UnspecifiedType__UnspecifiedType);
			Fragments._UnspecifiedType__Visitable.initOperations(_UnspecifiedType__Visitable);
	
			Fragments._UnspecifiedValueExp__Element.initOperations(_UnspecifiedValueExp__Element);
			Fragments._UnspecifiedValueExp__Nameable.initOperations(_UnspecifiedValueExp__Nameable);
			Fragments._UnspecifiedValueExp__NamedElement.initOperations(_UnspecifiedValueExp__NamedElement);
			Fragments._UnspecifiedValueExp__OclAny.initOperations(_UnspecifiedValueExp__OclAny);
			Fragments._UnspecifiedValueExp__OclElement.initOperations(_UnspecifiedValueExp__OclElement);
			Fragments._UnspecifiedValueExp__OclExpression.initOperations(_UnspecifiedValueExp__OclExpression);
			Fragments._UnspecifiedValueExp__TypedElement.initOperations(_UnspecifiedValueExp__TypedElement);
			Fragments._UnspecifiedValueExp__UnspecifiedValueExp.initOperations(_UnspecifiedValueExp__UnspecifiedValueExp);
			Fragments._UnspecifiedValueExp__Visitable.initOperations(_UnspecifiedValueExp__Visitable);
	
			Fragments._ValueSpecification__Element.initOperations(_ValueSpecification__Element);
			Fragments._ValueSpecification__Nameable.initOperations(_ValueSpecification__Nameable);
			Fragments._ValueSpecification__NamedElement.initOperations(_ValueSpecification__NamedElement);
			Fragments._ValueSpecification__OclAny.initOperations(_ValueSpecification__OclAny);
			Fragments._ValueSpecification__OclElement.initOperations(_ValueSpecification__OclElement);
			Fragments._ValueSpecification__ParameterableElement.initOperations(_ValueSpecification__ParameterableElement);
			Fragments._ValueSpecification__TypedElement.initOperations(_ValueSpecification__TypedElement);
			Fragments._ValueSpecification__ValueSpecification.initOperations(_ValueSpecification__ValueSpecification);
			Fragments._ValueSpecification__Visitable.initOperations(_ValueSpecification__Visitable);
	
			Fragments._Variable__Element.initOperations(_Variable__Element);
			Fragments._Variable__Nameable.initOperations(_Variable__Nameable);
			Fragments._Variable__NamedElement.initOperations(_Variable__NamedElement);
			Fragments._Variable__OclAny.initOperations(_Variable__OclAny);
			Fragments._Variable__OclElement.initOperations(_Variable__OclElement);
			Fragments._Variable__TypedElement.initOperations(_Variable__TypedElement);
			Fragments._Variable__Variable.initOperations(_Variable__Variable);
			Fragments._Variable__VariableDeclaration.initOperations(_Variable__VariableDeclaration);
			Fragments._Variable__Visitable.initOperations(_Variable__Visitable);
	
			Fragments._VariableDeclaration__Element.initOperations(_VariableDeclaration__Element);
			Fragments._VariableDeclaration__Nameable.initOperations(_VariableDeclaration__Nameable);
			Fragments._VariableDeclaration__NamedElement.initOperations(_VariableDeclaration__NamedElement);
			Fragments._VariableDeclaration__OclAny.initOperations(_VariableDeclaration__OclAny);
			Fragments._VariableDeclaration__OclElement.initOperations(_VariableDeclaration__OclElement);
			Fragments._VariableDeclaration__TypedElement.initOperations(_VariableDeclaration__TypedElement);
			Fragments._VariableDeclaration__VariableDeclaration.initOperations(_VariableDeclaration__VariableDeclaration);
			Fragments._VariableDeclaration__Visitable.initOperations(_VariableDeclaration__Visitable);
	
			Fragments._VariableExp__Element.initOperations(_VariableExp__Element);
			Fragments._VariableExp__Nameable.initOperations(_VariableExp__Nameable);
			Fragments._VariableExp__NamedElement.initOperations(_VariableExp__NamedElement);
			Fragments._VariableExp__OclAny.initOperations(_VariableExp__OclAny);
			Fragments._VariableExp__OclElement.initOperations(_VariableExp__OclElement);
			Fragments._VariableExp__OclExpression.initOperations(_VariableExp__OclExpression);
			Fragments._VariableExp__TypedElement.initOperations(_VariableExp__TypedElement);
			Fragments._VariableExp__VariableExp.initOperations(_VariableExp__VariableExp);
			Fragments._VariableExp__Visitable.initOperations(_VariableExp__Visitable);
	
			Fragments._Visitable__OclAny.initOperations(_Visitable__OclAny);
			Fragments._Visitable__OclElement.initOperations(_Visitable__OclElement);
			Fragments._Visitable__Visitable.initOperations(_Visitable__Visitable);
	
			Fragments._Visitor__OclAny.initOperations(_Visitor__OclAny);
			Fragments._Visitor__OclElement.initOperations(_Visitor__OclElement);
			Fragments._Visitor__Visitor.initOperations(_Visitor__Visitor);
	
			Fragments._VoidType__Class.initOperations(_VoidType__Class);
			Fragments._VoidType__Element.initOperations(_VoidType__Element);
			Fragments._VoidType__Nameable.initOperations(_VoidType__Nameable);
			Fragments._VoidType__NamedElement.initOperations(_VoidType__NamedElement);
			Fragments._VoidType__Namespace.initOperations(_VoidType__Namespace);
			Fragments._VoidType__OclAny.initOperations(_VoidType__OclAny);
			Fragments._VoidType__OclElement.initOperations(_VoidType__OclElement);
			Fragments._VoidType__ParameterableElement.initOperations(_VoidType__ParameterableElement);
			Fragments._VoidType__TemplateableElement.initOperations(_VoidType__TemplateableElement);
			Fragments._VoidType__Type.initOperations(_VoidType__Type);
			Fragments._VoidType__Visitable.initOperations(_VoidType__Visitable);
			Fragments._VoidType__VoidType.initOperations(_VoidType__VoidType);
		}
	
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		private static final ExecutorProperty[] _Annotation = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Annotation__NamedElement,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Annotation__ownedContent,
		    PivotTables.Properties._Annotation__ownedDetail,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._Annotation__reference
		};
	
		private static final ExecutorProperty[] _AnyType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _AssociationClass = {
		    PivotTables.Properties._AssociationClass__AssociationClassCallExp,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._AssociationClass__unownedAttribute,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _AssociationClassCallExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._FeatureCallExp__isPre,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NavigationCallExp__navigationSource,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._NavigationCallExp__qualifier,
		    PivotTables.Properties._AssociationClassCallExp__referredAssociationClass,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _AssociativityKind = {};
	
		private static final ExecutorProperty[] _BagType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._CollectionType__elementType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Boolean = {};
	
		private static final ExecutorProperty[] _BooleanLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._BooleanLiteralExp__booleanSymbol,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _CallExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _CallOperationAction = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._CallOperationAction__MessageExp,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._CallOperationAction__operation,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule
		};
	
		private static final ExecutorProperty[] _Class = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _ClassifierType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._ClassifierType__instanceType,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _CollectionItem = {
		    PivotTables.Properties._CollectionLiteralPart__CollectionLiteralExp,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._CollectionItem__item,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _CollectionKind = {};
	
		private static final ExecutorProperty[] _CollectionLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._CollectionLiteralExp__kind,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._CollectionLiteralExp__part,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _CollectionLiteralPart = {
		    PivotTables.Properties._CollectionLiteralPart__CollectionLiteralExp,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _CollectionRange = {
		    PivotTables.Properties._CollectionLiteralPart__CollectionLiteralExp,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._CollectionRange__first,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._CollectionRange__last,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _CollectionType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._CollectionType__elementType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Comment = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Comment__Element,
		    PivotTables.Properties._Comment__annotatedElement,
		    PivotTables.Properties._Comment__body,
		    PivotTables.Properties._Element__ownedComment
		};
	
		private static final ExecutorProperty[] _Constraint = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Constraint__constrainedElement,
		    PivotTables.Properties._Constraint__context,
		    PivotTables.Properties._Constraint__isCallable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._Constraint__specification,
		    PivotTables.Properties._Constraint__stereotype
		};
	
		private static final ExecutorProperty[] _ConstructorExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._ConstructorExp__part,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _ConstructorPart = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._ConstructorPart__ConstructorExp,
		    PivotTables.Properties._ConstructorPart__initExpression,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._ConstructorPart__referredProperty
		};
	
		private static final ExecutorProperty[] _DataType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Detail = {
		    PivotTables.Properties._Detail__Annotation,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._Detail__value
		};
	
		private static final ExecutorProperty[] _Element = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Element__ownedComment
		};
	
		private static final ExecutorProperty[] _EnumLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._EnumLiteralExp__referredEnumLiteral,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Enumeration = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Enumeration__ownedLiteral,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _EnumerationLiteral = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._EnumerationLiteral__EnumLiteralExp,
		    PivotTables.Properties._EnumerationLiteral__enumeration,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._EnumerationLiteral__value
		};
	
		private static final ExecutorProperty[] _ExpressionInOcl = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._ValueSpecification__Constraint,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OpaqueExpression__body,
		    PivotTables.Properties._ExpressionInOcl__bodyExpression,
		    PivotTables.Properties._ExpressionInOcl__contextVariable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._OpaqueExpression__language,
		    PivotTables.Properties._OpaqueExpression__message,
		    PivotTables.Properties._ExpressionInOcl__messageExpression,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._ExpressionInOcl__parameterVariable,
		    PivotTables.Properties._ExpressionInOcl__resultVariable,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._OpaqueExpression__valueExpression
		};
	
		private static final ExecutorProperty[] _Feature = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Feature__implementation,
		    PivotTables.Properties._Feature__implementationClass,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _FeatureCallExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._FeatureCallExp__isPre,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _IfExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._IfExp__condition,
		    PivotTables.Properties._IfExp__elseExpression,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._IfExp__thenExpression,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Int = {};
	
		private static final ExecutorProperty[] _Integer = {};
	
		private static final ExecutorProperty[] _IntegerLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._IntegerLiteralExp__integerSymbol,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _InvalidLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _InvalidType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _IterateExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._LoopExp__body,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._LoopExp__iterator,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._LoopExp__referredIteration,
		    PivotTables.Properties._IterateExp__result,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Iteration = {
		    PivotTables.Properties._Operation__CallOperationAction,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Iteration__LoopExp,
		    PivotTables.Properties._Operation__MessageType,
		    PivotTables.Properties._Operation__OperationCallExp,
		    PivotTables.Properties._Operation__class,
		    PivotTables.Properties._Feature__implementation,
		    PivotTables.Properties._Feature__implementationClass,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._Iteration__ownedAccumulator,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Iteration__ownedIterator,
		    PivotTables.Properties._Operation__ownedParameter,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Operation__owningType,
		    PivotTables.Properties._Operation__precedence,
		    PivotTables.Properties._Operation__raisedException,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._TemplateableElement__unspecializedElement,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _IteratorExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._LoopExp__body,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._LoopExp__iterator,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._LoopExp__referredIteration,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _LambdaType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._LambdaType__contextType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._LambdaType__parameterType,
		    PivotTables.Properties._LambdaType__resultType,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _LetExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._LetExp__in,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._LetExp__variable
		};
	
		private static final ExecutorProperty[] _Library = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._Package__nestedPackage,
		    PivotTables.Properties._Package__nestingPackage,
		    PivotTables.Properties._Package__nsPrefix,
		    PivotTables.Properties._Package__nsURI,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Package__ownedPrecedence,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._Package__ownedType,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _LibraryFeature = {};
	
		private static final ExecutorProperty[] _LiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _LoopExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._LoopExp__body,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._LoopExp__iterator,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._LoopExp__referredIteration,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _MessageExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._MessageExp__argument,
		    PivotTables.Properties._MessageExp__calledOperation,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._MessageExp__sentSignal,
		    PivotTables.Properties._MessageExp__target,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _MessageType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._MessageType__referredOperation,
		    PivotTables.Properties._MessageType__referredSignal,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _MultiplicityElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _Nameable = {};
	
		private static final ExecutorProperty[] _NamedElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule
		};
	
		private static final ExecutorProperty[] _Namespace = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule
		};
	
		private static final ExecutorProperty[] _NavigationCallExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._FeatureCallExp__isPre,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NavigationCallExp__navigationSource,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._NavigationCallExp__qualifier,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _NullLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _NumericLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Object = {};
	
		private static final ExecutorProperty[] _OclExpression = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _OpaqueExpression = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._ValueSpecification__Constraint,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OpaqueExpression__body,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._OpaqueExpression__language,
		    PivotTables.Properties._OpaqueExpression__message,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._OpaqueExpression__valueExpression
		};
	
		private static final ExecutorProperty[] _Operation = {
		    PivotTables.Properties._Operation__CallOperationAction,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Operation__MessageType,
		    PivotTables.Properties._Operation__OperationCallExp,
		    PivotTables.Properties._Operation__class,
		    PivotTables.Properties._Feature__implementation,
		    PivotTables.Properties._Feature__implementationClass,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Operation__ownedParameter,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Operation__owningType,
		    PivotTables.Properties._Operation__precedence,
		    PivotTables.Properties._Operation__raisedException,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._TemplateableElement__unspecializedElement,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _OperationCallExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._OperationCallExp__argument,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._FeatureCallExp__isPre,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._OperationCallExp__referredOperation,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _OperationTemplateParameter = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TemplateParameter__TemplateParameterSubstitution,
		    PivotTables.Properties._TemplateParameter__TemplateSignature,
		    PivotTables.Properties._TemplateParameter__default,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateParameter__ownedDefault,
		    PivotTables.Properties._TemplateParameter__ownedParameteredElement,
		    PivotTables.Properties._TemplateParameter__parameteredElement,
		    PivotTables.Properties._TemplateParameter__signature
		};
	
		private static final ExecutorProperty[] _OrderedSetType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._CollectionType__elementType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Package = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._Package__nestedPackage,
		    PivotTables.Properties._Package__nestingPackage,
		    PivotTables.Properties._Package__nsPrefix,
		    PivotTables.Properties._Package__nsURI,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Package__ownedPrecedence,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._Package__ownedType,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _PackageableElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._ParameterableElement__templateParameter
		};
	
		private static final ExecutorProperty[] _Parameter = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Parameter__Variable,
		    PivotTables.Properties._VariableDeclaration__VariableExp,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._Parameter__operation,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _ParameterableElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._ParameterableElement__templateParameter
		};
	
		private static final ExecutorProperty[] _Pivotable = {};
	
		private static final ExecutorProperty[] _Precedence = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Precedence__Operation,
		    PivotTables.Properties._Precedence__Package,
		    PivotTables.Properties._Precedence__associativity,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._Precedence__order,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule
		};
	
		private static final ExecutorProperty[] _PrimitiveLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _PrimitiveType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Property = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Property__ConstructorPart,
		    PivotTables.Properties._Property__NavigationCallExp,
		    PivotTables.Properties._Property__PropertyCallExp,
		    PivotTables.Properties._Property__association,
		    PivotTables.Properties._Property__class,
		    PivotTables.Properties._Property__default,
		    PivotTables.Properties._Feature__implementation,
		    PivotTables.Properties._Feature__implementationClass,
		    PivotTables.Properties._Property__implicit,
		    PivotTables.Properties._Property__isComposite,
		    PivotTables.Properties._Property__isDerived,
		    PivotTables.Properties._Property__isID,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._Property__isReadOnly,
		    PivotTables.Properties._Property__isResolveProxies,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._Property__isTransient,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._Property__isUnsettable,
		    PivotTables.Properties._Property__isVolatile,
		    PivotTables.Properties._Property__keys,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._Property__opposite,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Property__owningType,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _PropertyCallExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._FeatureCallExp__isPre,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NavigationCallExp__navigationSource,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._NavigationCallExp__qualifier,
		    PivotTables.Properties._PropertyCallExp__referredProperty,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Real = {};
	
		private static final ExecutorProperty[] _RealLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._RealLiteralExp__realSymbol,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _SelfType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _SendSignalAction = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._SendSignalAction__MessageExp,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._SendSignalAction__signal
		};
	
		private static final ExecutorProperty[] _SequenceType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._CollectionType__elementType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _SetType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._CollectionType__elementType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Signal = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Signal__MessageType,
		    PivotTables.Properties._Signal__SendSignalAction,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule
		};
	
		private static final ExecutorProperty[] _State = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._State__StateExp,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule
		};
	
		private static final ExecutorProperty[] _StateExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._StateExp__referredState,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _String = {};
	
		private static final ExecutorProperty[] _StringLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._StringLiteralExp__stringSymbol,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _TemplateBinding = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TemplateBinding__boundElement,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateBinding__parameterSubstitution,
		    PivotTables.Properties._TemplateBinding__signature
		};
	
		private static final ExecutorProperty[] _TemplateParameter = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TemplateParameter__TemplateParameterSubstitution,
		    PivotTables.Properties._TemplateParameter__TemplateSignature,
		    PivotTables.Properties._TemplateParameter__default,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateParameter__ownedDefault,
		    PivotTables.Properties._TemplateParameter__ownedParameteredElement,
		    PivotTables.Properties._TemplateParameter__parameteredElement,
		    PivotTables.Properties._TemplateParameter__signature
		};
	
		private static final ExecutorProperty[] _TemplateParameterSubstitution = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TemplateParameterSubstitution__actual,
		    PivotTables.Properties._TemplateParameterSubstitution__formal,
		    PivotTables.Properties._TemplateParameterSubstitution__ownedActual,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateParameterSubstitution__templateBinding
		};
	
		private static final ExecutorProperty[] _TemplateParameterType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._TemplateParameterType__specification,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _TemplateSignature = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TemplateSignature__TemplateBinding,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateSignature__ownedParameter,
		    PivotTables.Properties._TemplateSignature__parameter,
		    PivotTables.Properties._TemplateSignature__template
		};
	
		private static final ExecutorProperty[] _TemplateableElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Throwable = {};
	
		private static final ExecutorProperty[] _TupleLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TupleLiteralExp__part,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _TupleLiteralPart = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TupleLiteralPart__TupleLiteralExp,
		    PivotTables.Properties._VariableDeclaration__VariableExp,
		    PivotTables.Properties._TupleLiteralPart__initExpression,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _TupleType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Type = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _TypeExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypeExp__referredType,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _TypeTemplateParameter = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TemplateParameter__TemplateParameterSubstitution,
		    PivotTables.Properties._TemplateParameter__TemplateSignature,
		    PivotTables.Properties._TypeTemplateParameter__allowSubstitutable,
		    PivotTables.Properties._TypeTemplateParameter__constrainingType,
		    PivotTables.Properties._TemplateParameter__default,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateParameter__ownedDefault,
		    PivotTables.Properties._TemplateParameter__ownedParameteredElement,
		    PivotTables.Properties._TemplateParameter__parameteredElement,
		    PivotTables.Properties._TemplateParameter__signature
		};
	
		private static final ExecutorProperty[] _TypedElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _TypedMultiplicityElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _UnlimitedNatural = {};
	
		private static final ExecutorProperty[] _UnlimitedNaturalLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._UnlimitedNaturalLiteralExp__unlimitedNaturalSymbol
		};
	
		private static final ExecutorProperty[] _UnspecifiedType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._UnspecifiedType__lowerBound,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement,
		    PivotTables.Properties._UnspecifiedType__upperBound
		};
	
		private static final ExecutorProperty[] _UnspecifiedValueExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _ValueSpecification = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._ValueSpecification__Constraint,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Variable = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Variable__IterateExp,
		    PivotTables.Properties._Variable__LetExp,
		    PivotTables.Properties._Variable__LoopExp,
		    PivotTables.Properties._VariableDeclaration__VariableExp,
		    PivotTables.Properties._Variable__implicit,
		    PivotTables.Properties._Variable__initExpression,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._Variable__representedParameter,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _VariableDeclaration = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._VariableDeclaration__VariableExp,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _VariableExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._OclExpression__ConstructorPart,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._VariableExp__implicit,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._VariableExp__referredVariable,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Visitable = {};
	
		private static final ExecutorProperty[] _Visitor = {};
	
		private static final ExecutorProperty[] _VoidType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__Type,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Type__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Type__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Type__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
	  	 	Fragments._Annotation__Annotation.initProperties(_Annotation);
	  	 	Fragments._AnyType__AnyType.initProperties(_AnyType);
	  	 	Fragments._AssociationClass__AssociationClass.initProperties(_AssociationClass);
	  	 	Fragments._AssociationClassCallExp__AssociationClassCallExp.initProperties(_AssociationClassCallExp);
	  	 	Fragments._AssociativityKind__AssociativityKind.initProperties(_AssociativityKind);
	  	 	Fragments._BagType__BagType.initProperties(_BagType);
	  	 	Fragments._Boolean__Boolean.initProperties(_Boolean);
	  	 	Fragments._BooleanLiteralExp__BooleanLiteralExp.initProperties(_BooleanLiteralExp);
	  	 	Fragments._CallExp__CallExp.initProperties(_CallExp);
	  	 	Fragments._CallOperationAction__CallOperationAction.initProperties(_CallOperationAction);
	  	 	Fragments._Class__Class.initProperties(_Class);
	  	 	Fragments._ClassifierType__ClassifierType.initProperties(_ClassifierType);
	  	 	Fragments._CollectionItem__CollectionItem.initProperties(_CollectionItem);
	  	 	Fragments._CollectionKind__CollectionKind.initProperties(_CollectionKind);
	  	 	Fragments._CollectionLiteralExp__CollectionLiteralExp.initProperties(_CollectionLiteralExp);
	  	 	Fragments._CollectionLiteralPart__CollectionLiteralPart.initProperties(_CollectionLiteralPart);
	  	 	Fragments._CollectionRange__CollectionRange.initProperties(_CollectionRange);
	  	 	Fragments._CollectionType__CollectionType.initProperties(_CollectionType);
	  	 	Fragments._Comment__Comment.initProperties(_Comment);
	  	 	Fragments._Constraint__Constraint.initProperties(_Constraint);
	  	 	Fragments._ConstructorExp__ConstructorExp.initProperties(_ConstructorExp);
	  	 	Fragments._ConstructorPart__ConstructorPart.initProperties(_ConstructorPart);
	  	 	Fragments._DataType__DataType.initProperties(_DataType);
	  	 	Fragments._Detail__Detail.initProperties(_Detail);
	  	 	Fragments._Element__Element.initProperties(_Element);
	  	 	Fragments._EnumLiteralExp__EnumLiteralExp.initProperties(_EnumLiteralExp);
	  	 	Fragments._Enumeration__Enumeration.initProperties(_Enumeration);
	  	 	Fragments._EnumerationLiteral__EnumerationLiteral.initProperties(_EnumerationLiteral);
	  	 	Fragments._ExpressionInOcl__ExpressionInOcl.initProperties(_ExpressionInOcl);
	  	 	Fragments._Feature__Feature.initProperties(_Feature);
	  	 	Fragments._FeatureCallExp__FeatureCallExp.initProperties(_FeatureCallExp);
	  	 	Fragments._IfExp__IfExp.initProperties(_IfExp);
	  	 	Fragments._Int__Int.initProperties(_Int);
	  	 	Fragments._Integer__Integer.initProperties(_Integer);
	  	 	Fragments._IntegerLiteralExp__IntegerLiteralExp.initProperties(_IntegerLiteralExp);
	  	 	Fragments._InvalidLiteralExp__InvalidLiteralExp.initProperties(_InvalidLiteralExp);
	  	 	Fragments._InvalidType__InvalidType.initProperties(_InvalidType);
	  	 	Fragments._IterateExp__IterateExp.initProperties(_IterateExp);
	  	 	Fragments._Iteration__Iteration.initProperties(_Iteration);
	  	 	Fragments._IteratorExp__IteratorExp.initProperties(_IteratorExp);
	  	 	Fragments._LambdaType__LambdaType.initProperties(_LambdaType);
	  	 	Fragments._LetExp__LetExp.initProperties(_LetExp);
	  	 	Fragments._Library__Library.initProperties(_Library);
	  	 	Fragments._LibraryFeature__LibraryFeature.initProperties(_LibraryFeature);
	  	 	Fragments._LiteralExp__LiteralExp.initProperties(_LiteralExp);
	  	 	Fragments._LoopExp__LoopExp.initProperties(_LoopExp);
	  	 	Fragments._MessageExp__MessageExp.initProperties(_MessageExp);
	  	 	Fragments._MessageType__MessageType.initProperties(_MessageType);
	  	 	Fragments._MultiplicityElement__MultiplicityElement.initProperties(_MultiplicityElement);
	  	 	Fragments._Nameable__Nameable.initProperties(_Nameable);
	  	 	Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
	  	 	Fragments._Namespace__Namespace.initProperties(_Namespace);
	  	 	Fragments._NavigationCallExp__NavigationCallExp.initProperties(_NavigationCallExp);
	  	 	Fragments._NullLiteralExp__NullLiteralExp.initProperties(_NullLiteralExp);
	  	 	Fragments._NumericLiteralExp__NumericLiteralExp.initProperties(_NumericLiteralExp);
	  	 	Fragments._Object__Object.initProperties(_Object);
	  	 	Fragments._OclExpression__OclExpression.initProperties(_OclExpression);
	  	 	Fragments._OpaqueExpression__OpaqueExpression.initProperties(_OpaqueExpression);
	  	 	Fragments._Operation__Operation.initProperties(_Operation);
	  	 	Fragments._OperationCallExp__OperationCallExp.initProperties(_OperationCallExp);
	  	 	Fragments._OperationTemplateParameter__OperationTemplateParameter.initProperties(_OperationTemplateParameter);
	  	 	Fragments._OrderedSetType__OrderedSetType.initProperties(_OrderedSetType);
	  	 	Fragments._Package__Package.initProperties(_Package);
	  	 	Fragments._PackageableElement__PackageableElement.initProperties(_PackageableElement);
	  	 	Fragments._Parameter__Parameter.initProperties(_Parameter);
	  	 	Fragments._ParameterableElement__ParameterableElement.initProperties(_ParameterableElement);
	  	 	Fragments._Pivotable__Pivotable.initProperties(_Pivotable);
	  	 	Fragments._Precedence__Precedence.initProperties(_Precedence);
	  	 	Fragments._PrimitiveLiteralExp__PrimitiveLiteralExp.initProperties(_PrimitiveLiteralExp);
	  	 	Fragments._PrimitiveType__PrimitiveType.initProperties(_PrimitiveType);
	  	 	Fragments._Property__Property.initProperties(_Property);
	  	 	Fragments._PropertyCallExp__PropertyCallExp.initProperties(_PropertyCallExp);
	  	 	Fragments._Real__Real.initProperties(_Real);
	  	 	Fragments._RealLiteralExp__RealLiteralExp.initProperties(_RealLiteralExp);
	  	 	Fragments._SelfType__SelfType.initProperties(_SelfType);
	  	 	Fragments._SendSignalAction__SendSignalAction.initProperties(_SendSignalAction);
	  	 	Fragments._SequenceType__SequenceType.initProperties(_SequenceType);
	  	 	Fragments._SetType__SetType.initProperties(_SetType);
	  	 	Fragments._Signal__Signal.initProperties(_Signal);
	  	 	Fragments._State__State.initProperties(_State);
	  	 	Fragments._StateExp__StateExp.initProperties(_StateExp);
	  	 	Fragments._String__String.initProperties(_String);
	  	 	Fragments._StringLiteralExp__StringLiteralExp.initProperties(_StringLiteralExp);
	  	 	Fragments._TemplateBinding__TemplateBinding.initProperties(_TemplateBinding);
	  	 	Fragments._TemplateParameter__TemplateParameter.initProperties(_TemplateParameter);
	  	 	Fragments._TemplateParameterSubstitution__TemplateParameterSubstitution.initProperties(_TemplateParameterSubstitution);
	  	 	Fragments._TemplateParameterType__TemplateParameterType.initProperties(_TemplateParameterType);
	  	 	Fragments._TemplateSignature__TemplateSignature.initProperties(_TemplateSignature);
	  	 	Fragments._TemplateableElement__TemplateableElement.initProperties(_TemplateableElement);
	  	 	Fragments._Throwable__Throwable.initProperties(_Throwable);
	  	 	Fragments._TupleLiteralExp__TupleLiteralExp.initProperties(_TupleLiteralExp);
	  	 	Fragments._TupleLiteralPart__TupleLiteralPart.initProperties(_TupleLiteralPart);
	  	 	Fragments._TupleType__TupleType.initProperties(_TupleType);
	  	 	Fragments._Type__Type.initProperties(_Type);
	  	 	Fragments._TypeExp__TypeExp.initProperties(_TypeExp);
	  	 	Fragments._TypeTemplateParameter__TypeTemplateParameter.initProperties(_TypeTemplateParameter);
	  	 	Fragments._TypedElement__TypedElement.initProperties(_TypedElement);
	  	 	Fragments._TypedMultiplicityElement__TypedMultiplicityElement.initProperties(_TypedMultiplicityElement);
	  	 	Fragments._UnlimitedNatural__UnlimitedNatural.initProperties(_UnlimitedNatural);
	  	 	Fragments._UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp.initProperties(_UnlimitedNaturalLiteralExp);
	  	 	Fragments._UnspecifiedType__UnspecifiedType.initProperties(_UnspecifiedType);
	  	 	Fragments._UnspecifiedValueExp__UnspecifiedValueExp.initProperties(_UnspecifiedValueExp);
	  	 	Fragments._ValueSpecification__ValueSpecification.initProperties(_ValueSpecification);
	  	 	Fragments._Variable__Variable.initProperties(_Variable);
	  	 	Fragments._VariableDeclaration__VariableDeclaration.initProperties(_VariableDeclaration);
	  	 	Fragments._VariableExp__VariableExp.initProperties(_VariableExp);
	  	 	Fragments._Visitable__Visitable.initProperties(_Visitable);
	  	 	Fragments._Visitor__Visitor.initProperties(_Visitor);
	  	 	Fragments._VoidType__VoidType.initProperties(_VoidType);
		}
	
		public static void init() {}
	}
	
	static {
		Types.types[0].getClass();
	}
}

