/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * This code is auto-generated
 * from: /org.eclipse.ocl.examples.library/model/OCL-2.4.oclstdlib
 * by: org.eclipse.ocl.examples.build.acceleo.GenerateOCLstdlib
 * defined by: org.eclipse.ocl.examples.build.acceleo.generateOCLstdlib.mtl
 * invoked by: org.eclipse.ocl.examples.build.utilities.OCLstdlibCodeGenerator
 * from: org.eclipse.ocl.examples.build.GenerateOCLstdlibModel.mwe2
 *
 * Do not edit it.
 *
 * $Id$
 */
package	org.eclipse.ocl.examples.pivot.model;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.ocl.examples.pivot.*;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.library.StandardLibraryContribution;

/**
 * This is the http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib Standard Library
 * auto-generated from /org.eclipse.ocl.examples.library/model/OCL-2.4.oclstdlib.
 * It facilitates efficient library loading without the overheads of model reading.
 * <p>
 * This Standard Library may be registered as the definition of a Standard Library for
 * the OCL evaluation framework by invoking {@link #install}.
 * <p>
 * The Standard Library is normally activated when the MetaModelManager attempts
 * to locate a library type when its default Standard Library URI is the same
 * as this Standard Library.
 */
@SuppressWarnings("nls")
public class OCLstdlib extends XMLResourceImpl
{
	/**
	 *	The static package-of-types pivot model of the Standard Library.
	 */
	private static OCLstdlib INSTANCE = null;
	
	/**
	 *	The URI of this Standard Library.
	 */
	public static final String STDLIB_URI = "http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib";

	/**
	 * Install this library in the {@link StandardLibraryContribution#REGISTRY}.
	 * This method may be invoked by standalone applications to replicate
	 * the registration that should appear as a standard_library plugin
	 * extension when running within Eclipse. 
	 */
	public static OCLstdlib getDefault() {
		if (INSTANCE == null) {
			INSTANCE = new OCLstdlib();
		}
		return INSTANCE;
	}

	/**
	 * Install this library in the {@link StandardLibraryContribution#REGISTRY}.
	 * This method may be invoked by standalone applications to replicate
	 * the registration that should appear as a standard_library plugin
	 * extension when running within Eclipse. 
	 */
	public static void install() {
		StandardLibraryContribution.REGISTRY.put(STDLIB_URI, new Loader());
	}

	/**
	 * Unnstall this library from the {@link StandardLibraryContribution#REGISTRY}.
	 * This method may be invoked by standalone applications to release the library
	 * resources for garbage collection and memory leakage detection. 
	 */
	public static void uninstall() {
		StandardLibraryContribution.REGISTRY.remove(STDLIB_URI);
		INSTANCE = null;
	}
	
	/**
	 * The Loader shares the Standard Library instance whenever this default library
	 * is loaded from the registry of Standard Libraries populated by the standard_library 
	 * extension point.
	 */
	public static class Loader implements StandardLibraryContribution
	{
		public StandardLibraryContribution getContribution() {
			return this;
		}
		
		public Resource getResource() {
			return getDefault();
		}
	}
	
	private OCLstdlib() {
		super(URI.createURI(STDLIB_URI));
		getContents().add(create());
	}

	/**
	 *	Create and return a package-of-packages-of-types pivot model of the OCL standard library.
	 *  This static definition auto-generated from /org.eclipse.ocl.examples.library/model/OCL-2.4.oclstdlib
	 *  is used as the default when no overriding copy is registered. 
	 */
	public static Library create()
	{
		Library symbol_0 = PivotFactory.eINSTANCE.createLibrary(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib
		Precedence symbol_1 = PivotFactory.eINSTANCE.createPrecedence(); // NAVIGATION
		Precedence symbol_2 = PivotFactory.eINSTANCE.createPrecedence(); // UNARY
		Precedence symbol_3 = PivotFactory.eINSTANCE.createPrecedence(); // MULTIPLICATIVE
		Precedence symbol_4 = PivotFactory.eINSTANCE.createPrecedence(); // ADDITIVE
		Precedence symbol_5 = PivotFactory.eINSTANCE.createPrecedence(); // RELATIONAL
		Precedence symbol_6 = PivotFactory.eINSTANCE.createPrecedence(); // EQUALITY
		Precedence symbol_7 = PivotFactory.eINSTANCE.createPrecedence(); // AND
		Precedence symbol_8 = PivotFactory.eINSTANCE.createPrecedence(); // OR
		Precedence symbol_9 = PivotFactory.eINSTANCE.createPrecedence(); // XOR
		Precedence symbol_10 = PivotFactory.eINSTANCE.createPrecedence(); // IMPLIES
		PrimitiveType symbol_11 = PivotFactory.eINSTANCE.createPrimitiveType(); // Boolean
		
		PrimitiveType symbol_12 = PivotFactory.eINSTANCE.createPrimitiveType(); // Integer
		
		PrimitiveType symbol_13 = PivotFactory.eINSTANCE.createPrimitiveType(); // Real
		
		PrimitiveType symbol_14 = PivotFactory.eINSTANCE.createPrimitiveType(); // String
		
		PrimitiveType symbol_15 = PivotFactory.eINSTANCE.createPrimitiveType(); // UnlimitedNatural
		TemplateSignature symbol_16 = PivotFactory.eINSTANCE.createTemplateSignature(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])!
		TypeTemplateParameter symbol_17 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_18 = PivotFactory.eINSTANCE.createClass(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT
		
		
		ClassifierType symbol_19 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier{T}
		TemplateSignature symbol_20 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier{T}!
		TypeTemplateParameter symbol_21 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_22 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier{T}?T
		
		
		BagType symbol_23 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
		TemplateSignature symbol_24 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!
		TypeTemplateParameter symbol_25 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_26 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
		
		TemplateSignature symbol_27 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_28 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_29 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_30 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_31 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_32 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_33 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()!
		TypeTemplateParameter symbol_34 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_35 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2
		
		
		Class symbol_36 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		ClassifierType symbol_37 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}
		TemplateSignature symbol_38 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}!
		TypeTemplateParameter symbol_39 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_40 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T
		
		
		ClassifierType symbol_41 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}
		TemplateSignature symbol_42 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}!
		TypeTemplateParameter symbol_43 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_44 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T
		TypeTemplateParameter symbol_45 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_46 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?E
		
		Property symbol_47 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}!elementType // ocl::CollectionClassifier::elementType http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}!elementType
		
		CollectionType symbol_48 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
		TemplateSignature symbol_49 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!
		TypeTemplateParameter symbol_50 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_51 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
		
		TemplateSignature symbol_52 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_53 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_54 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_55 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_56 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_57 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_58 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!
		TypeTemplateParameter symbol_59 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_60 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
		
		TemplateSignature symbol_61 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()!
		TypeTemplateParameter symbol_62 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_63 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2
		
		TemplateSignature symbol_64 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!
		TypeTemplateParameter symbol_65 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_66 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
		
		TemplateSignature symbol_67 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)!
		TypeTemplateParameter symbol_68 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_69 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
		
		TemplateSignature symbol_70 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!
		TypeTemplateParameter symbol_71 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_72 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
		
		
		Class symbol_73 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration
		
		ClassifierType symbol_74 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}
		TemplateSignature symbol_75 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}!
		TypeTemplateParameter symbol_76 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_77 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T
		
		Property symbol_78 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}!ownedLiteral // ocl::EnumerationClassifier::ownedLiteral http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}!ownedLiteral
		
		Class symbol_79 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		
		AnyType symbol_80 = PivotFactory.eINSTANCE.createAnyType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		TemplateSignature symbol_81 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])!
		TypeTemplateParameter symbol_82 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_83 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT
		
		TemplateSignature symbol_84 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])!
		TypeTemplateParameter symbol_85 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_86 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T
		
		TemplateSignature symbol_87 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])!
		TypeTemplateParameter symbol_88 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_89 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T
		
		
		Class symbol_90 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		
		Class symbol_91 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		
		InvalidType symbol_92 = PivotFactory.eINSTANCE.createInvalidType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
		Property symbol_93 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!oclBadProperty // ocl::OclInvalid::oclBadProperty http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!oclBadProperty
		
		Class symbol_94 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		Class symbol_95 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		
		SelfType symbol_96 = PivotFactory.eINSTANCE.createSelfType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
		
		Class symbol_97 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
		
		Class symbol_98 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		
		Class symbol_99 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		
		Class symbol_100 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		VoidType symbol_101 = PivotFactory.eINSTANCE.createVoidType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		
		OrderedSetType symbol_102 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
		TemplateSignature symbol_103 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!
		TypeTemplateParameter symbol_104 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_105 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
		
		TemplateSignature symbol_106 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()!
		TypeTemplateParameter symbol_107 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_108 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2
		
		
		SequenceType symbol_109 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
		TemplateSignature symbol_110 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!
		TypeTemplateParameter symbol_111 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_112 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
		
		TemplateSignature symbol_113 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_114 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_115 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_116 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_117 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_118 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_119 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()!
		TypeTemplateParameter symbol_120 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_121 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2
		
		
		SetType symbol_122 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
		TemplateSignature symbol_123 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!
		TypeTemplateParameter symbol_124 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_125 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
		
		TemplateSignature symbol_126 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()!
		TypeTemplateParameter symbol_127 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_128 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2
		
		
		Class symbol_129 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Type
		
		CollectionType symbol_130 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
		TemplateSignature symbol_131 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!
		TypeTemplateParameter symbol_132 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_133 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T
		
		
		Package symbol_134 = PivotFactory.eINSTANCE.createPackage(); // u_r_i:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0
		LambdaType symbol_135 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		
		LambdaType symbol_136 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		
		LambdaType symbol_137 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_138 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_139 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_140 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
		
		LambdaType symbol_141 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_142 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_143 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_144 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_145 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_146 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_147 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_148 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_149 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_150 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_151 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
		
		LambdaType symbol_152 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_153 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_154 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		
		LambdaType symbol_155 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		
		LambdaType symbol_156 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_157 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		
		LambdaType symbol_158 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		
		LambdaType symbol_159 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_160 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
		
		LambdaType symbol_161 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_162 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_163 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		
		LambdaType symbol_164 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		
		LambdaType symbol_165 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_166 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		TupleType symbol_167 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_168 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_169 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		TupleType symbol_170 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_171 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_172 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		TupleType symbol_173 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_174 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_175 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		TupleType symbol_176 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_177 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_178 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		ClassifierType symbol_179 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		
		ClassifierType symbol_180 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		
		ClassifierType symbol_181 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		
		ClassifierType symbol_182 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		
		ClassifierType symbol_183 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		
		ClassifierType symbol_184 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		
		ClassifierType symbol_185 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		
		ClassifierType symbol_186 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		
		ClassifierType symbol_187 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		
		ClassifierType symbol_188 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		ClassifierType symbol_189 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		
		BagType symbol_190 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		BagType symbol_191 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		BagType symbol_192 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		
		BagType symbol_193 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		BagType symbol_194 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		BagType symbol_195 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		BagType symbol_196 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		BagType symbol_197 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		BagType symbol_198 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		BagType symbol_199 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		BagType symbol_200 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_201 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_202 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_203 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_204 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_205 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_206 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		BagType symbol_207 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		BagType symbol_208 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		BagType symbol_209 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		BagType symbol_210 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		ClassifierType symbol_211 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		
		ClassifierType symbol_212 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		ClassifierType symbol_213 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		
		ClassifierType symbol_214 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_215 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Integer]
		
		CollectionType symbol_216 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		
		CollectionType symbol_217 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_218 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_219 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_220 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		CollectionType symbol_221 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_222 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_223 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_224 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_225 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		
		CollectionType symbol_226 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
		
		CollectionType symbol_227 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		
		CollectionType symbol_228 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		
		CollectionType symbol_229 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_230 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_231 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_232 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		CollectionType symbol_233 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_234 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_235 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_236 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_237 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		CollectionType symbol_238 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_239 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_240 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_241 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_242 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_243 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		CollectionType symbol_244 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_245 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_246 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_247 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_248 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_249 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		CollectionType symbol_250 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		ClassifierType symbol_251 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		OrderedSetType symbol_252 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		OrderedSetType symbol_253 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		OrderedSetType symbol_254 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		OrderedSetType symbol_255 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		OrderedSetType symbol_256 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		OrderedSetType symbol_257 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		SequenceType symbol_258 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[Integer]
		
		SequenceType symbol_259 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
		
		SequenceType symbol_260 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		SequenceType symbol_261 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		SequenceType symbol_262 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		SequenceType symbol_263 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		SequenceType symbol_264 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		SequenceType symbol_265 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		
		SequenceType symbol_266 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		SequenceType symbol_267 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		SequenceType symbol_268 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		SequenceType symbol_269 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		SequenceType symbol_270 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		SetType symbol_271 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		SetType symbol_272 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		SetType symbol_273 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		SetType symbol_274 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		SetType symbol_275 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		SetType symbol_276 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		SetType symbol_277 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		SetType symbol_278 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		CollectionType symbol_279 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_280 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_281 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_282 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_283 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_284 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_285 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_286 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		CollectionType symbol_287 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_288 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		CollectionType symbol_289 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_290 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_291 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_292 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_293 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_294 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_295 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_296 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_297 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_298 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_299 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_300 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_301 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		CollectionType symbol_302 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		AnyType symbol_303 = PivotFactory.eINSTANCE.createAnyType(); // u_r_i:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		
		

		symbol_0.setName("ocl");
		symbol_0.setNsPrefix("ocl");
		symbol_0.setNsURI("http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib");
		symbol_1.setName("NAVIGATION");
		symbol_1.setAssociativity(AssociativityKind.LEFT);
		
		symbol_0.getOwnedPrecedences().add(symbol_1);
		symbol_2.setName("UNARY");
		symbol_2.setAssociativity(AssociativityKind.LEFT);
		
		symbol_0.getOwnedPrecedences().add(symbol_2);
		symbol_3.setName("MULTIPLICATIVE");
		symbol_3.setAssociativity(AssociativityKind.LEFT);
		
		symbol_0.getOwnedPrecedences().add(symbol_3);
		symbol_4.setName("ADDITIVE");
		symbol_4.setAssociativity(AssociativityKind.LEFT);
		
		symbol_0.getOwnedPrecedences().add(symbol_4);
		symbol_5.setName("RELATIONAL");
		symbol_5.setAssociativity(AssociativityKind.LEFT);
		
		symbol_0.getOwnedPrecedences().add(symbol_5);
		symbol_6.setName("EQUALITY");
		symbol_6.setAssociativity(AssociativityKind.LEFT);
		
		symbol_0.getOwnedPrecedences().add(symbol_6);
		symbol_7.setName("AND");
		symbol_7.setAssociativity(AssociativityKind.LEFT);
		
		symbol_0.getOwnedPrecedences().add(symbol_7);
		symbol_8.setName("OR");
		symbol_8.setAssociativity(AssociativityKind.LEFT);
		
		symbol_0.getOwnedPrecedences().add(symbol_8);
		symbol_9.setName("XOR");
		symbol_9.setAssociativity(AssociativityKind.LEFT);
		
		symbol_0.getOwnedPrecedences().add(symbol_9);
		symbol_10.setName("IMPLIES");
		symbol_10.setAssociativity(AssociativityKind.LEFT);
		
		symbol_0.getOwnedPrecedences().add(symbol_10);
		//
		// ocl::Boolean Boolean
		//
		symbol_11.setName("Boolean");
		symbol_11.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Boolean::<>()
			Operation symbol_304 = PivotFactory.eINSTANCE.createOperation(); // Boolean!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_304.setName("<>");
			symbol_304.setType(symbol_11);  // Boolean
			
			Parameter symbol_305 = PivotFactory.eINSTANCE.createParameter(); // Boolean!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_305.setName("object2");
			symbol_305.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_304.getOwnedParameters().add(symbol_305);
			symbol_304.setPrecedence(symbol_6);
			symbol_304.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_304.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_306 = PivotFactory.eINSTANCE.createComment();
				symbol_306.setBody("Returns oclText[true] if the logical value of oclText[self] is the not same as the numeric value of object2, oclText[false] otherwise.");
				symbol_304.getOwnedComments().add(symbol_306);
			}
			
			symbol_11.getOwnedOperations().add(symbol_304);
		}
		{	// ocl::Boolean::=()
			Operation symbol_307 = PivotFactory.eINSTANCE.createOperation(); // Boolean!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_307.setName("=");
			symbol_307.setType(symbol_11);  // Boolean
			
			Parameter symbol_308 = PivotFactory.eINSTANCE.createParameter(); // Boolean!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_308.setName("object2");
			symbol_308.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_307.getOwnedParameters().add(symbol_308);
			symbol_307.setPrecedence(symbol_6);
			symbol_307.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_307.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_309 = PivotFactory.eINSTANCE.createComment();
				symbol_309.setBody("Returns oclText[true] if the logical value of oclText[self] is the same as the numeric value of object2, oclText[false] otherwise.");
				symbol_307.getOwnedComments().add(symbol_309);
			}
			
			symbol_11.getOwnedOperations().add(symbol_307);
		}
		{	// ocl::Boolean::allInstances()
			Operation symbol_310 = PivotFactory.eINSTANCE.createOperation(); // Boolean!allInstances()
			symbol_310.setName("allInstances");
			symbol_310.setType(symbol_275);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_310.setIsStatic(true);
			symbol_310.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation");
			symbol_310.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
			{
				Comment symbol_311 = PivotFactory.eINSTANCE.createComment();
				symbol_311.setBody("Returns oclText[Set{false, true}].");
				symbol_310.getOwnedComments().add(symbol_311);
			}
			
			symbol_11.getOwnedOperations().add(symbol_310);
		}
		{	// ocl::Boolean::and()
			Operation symbol_312 = PivotFactory.eINSTANCE.createOperation(); // Boolean!and(Boolean)
			symbol_312.setName("and");
			symbol_312.setType(symbol_11);  // Boolean
			
			Parameter symbol_313 = PivotFactory.eINSTANCE.createParameter(); // Boolean!and(Boolean)!b
			symbol_313.setName("b");
			symbol_313.setType(symbol_11);  // Boolean
			
			
			symbol_312.getOwnedParameters().add(symbol_313);
			symbol_312.setPrecedence(symbol_7);
			symbol_312.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanAndOperation");
			symbol_312.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE);
			{
				Comment symbol_314 = PivotFactory.eINSTANCE.createComment();
				symbol_314.setBody("True if both b1 and b are oclText[true].");
				symbol_312.getOwnedComments().add(symbol_314);
			}
			
			symbol_11.getOwnedOperations().add(symbol_312);
		}
		{	// ocl::Boolean::implies()
			Operation symbol_315 = PivotFactory.eINSTANCE.createOperation(); // Boolean!implies(Boolean)
			symbol_315.setName("implies");
			symbol_315.setType(symbol_11);  // Boolean
			
			Parameter symbol_316 = PivotFactory.eINSTANCE.createParameter(); // Boolean!implies(Boolean)!b
			symbol_316.setName("b");
			symbol_316.setType(symbol_11);  // Boolean
			
			
			symbol_315.getOwnedParameters().add(symbol_316);
			symbol_315.setPrecedence(symbol_10);
			symbol_315.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation");
			symbol_315.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE);
			{
				Comment symbol_317 = PivotFactory.eINSTANCE.createComment();
				symbol_317.setBody("True if oclText[self] is oclText[false], or if oclText[self] is oclText[true] and b is oclText[true].");
				symbol_315.getOwnedComments().add(symbol_317);
			}
			
			symbol_11.getOwnedOperations().add(symbol_315);
		}
		{	// ocl::Boolean::not()
			Operation symbol_318 = PivotFactory.eINSTANCE.createOperation(); // Boolean!not()
			symbol_318.setName("not");
			symbol_318.setType(symbol_11);  // Boolean
			
			symbol_318.setPrecedence(symbol_2);
			symbol_318.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanNotOperation");
			symbol_318.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
			{
				Comment symbol_319 = PivotFactory.eINSTANCE.createComment();
				symbol_319.setBody("True if oclText[self] is oclText[false].");
				symbol_318.getOwnedComments().add(symbol_319);
			}
			
			symbol_11.getOwnedOperations().add(symbol_318);
		}
		{	// ocl::Boolean::or()
			Operation symbol_320 = PivotFactory.eINSTANCE.createOperation(); // Boolean!or(Boolean)
			symbol_320.setName("or");
			symbol_320.setType(symbol_11);  // Boolean
			
			Parameter symbol_321 = PivotFactory.eINSTANCE.createParameter(); // Boolean!or(Boolean)!b
			symbol_321.setName("b");
			symbol_321.setType(symbol_11);  // Boolean
			
			
			symbol_320.getOwnedParameters().add(symbol_321);
			symbol_320.setPrecedence(symbol_8);
			symbol_320.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanOrOperation");
			symbol_320.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE);
			{
				Comment symbol_322 = PivotFactory.eINSTANCE.createComment();
				symbol_322.setBody("True if either oclText[self] or b is oclText[true].");
				symbol_320.getOwnedComments().add(symbol_322);
			}
			
			symbol_11.getOwnedOperations().add(symbol_320);
		}
		{	// ocl::Boolean::toString()
			Operation symbol_323 = PivotFactory.eINSTANCE.createOperation(); // Boolean!toString()
			symbol_323.setName("toString");
			symbol_323.setType(symbol_14);  // String
			
			symbol_323.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_323.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_324 = PivotFactory.eINSTANCE.createComment();
				symbol_324.setBody("Converts oclText[self] to a string value.");
				symbol_323.getOwnedComments().add(symbol_324);
			}
			
			symbol_11.getOwnedOperations().add(symbol_323);
		}
		{	// ocl::Boolean::xor()
			Operation symbol_325 = PivotFactory.eINSTANCE.createOperation(); // Boolean!xor(Boolean)
			symbol_325.setName("xor");
			symbol_325.setType(symbol_11);  // Boolean
			
			Parameter symbol_326 = PivotFactory.eINSTANCE.createParameter(); // Boolean!xor(Boolean)!b
			symbol_326.setName("b");
			symbol_326.setType(symbol_11);  // Boolean
			
			
			symbol_325.getOwnedParameters().add(symbol_326);
			symbol_325.setPrecedence(symbol_9);
			symbol_325.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanXorOperation");
			symbol_325.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE);
			{
				Comment symbol_327 = PivotFactory.eINSTANCE.createComment();
				symbol_327.setBody("True if either oclText[self] or b is oclText[true], but not both.");
				symbol_325.getOwnedComments().add(symbol_327);
			}
			
			symbol_11.getOwnedOperations().add(symbol_325);
		}
		{
			Comment symbol_328 = PivotFactory.eINSTANCE.createComment();
			symbol_328.setBody("The standard type Boolean represents the common true/false values.\nBoolean is itself an instance of the metatype PrimitiveType (from UML).");
			symbol_11.getOwnedComments().add(symbol_328);
		}
		
		symbol_0.getOwnedTypes().add(symbol_11); // Boolean
		//
		// ocl::Integer Integer
		//
		symbol_12.setName("Integer");
		symbol_12.getSuperClasses().add(symbol_13); // Real
		{	// ocl::Integer::*()
			Operation symbol_329 = PivotFactory.eINSTANCE.createOperation(); // Integer!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_329.setName("*");
			symbol_329.setType(symbol_12);  // Integer
			
			Parameter symbol_330 = PivotFactory.eINSTANCE.createParameter(); // Integer!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_330.setName("i");
			symbol_330.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_329.getOwnedParameters().add(symbol_330);
			symbol_329.setPrecedence(symbol_3);
			symbol_329.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericTimesOperation");
			symbol_329.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			{
				Comment symbol_331 = PivotFactory.eINSTANCE.createComment();
				symbol_331.setBody("The value of the multiplication of oclText[self] and i.");
				symbol_329.getOwnedComments().add(symbol_331);
			}
			
			symbol_12.getOwnedOperations().add(symbol_329);
		}
		{	// ocl::Integer::+()
			Operation symbol_332 = PivotFactory.eINSTANCE.createOperation(); // Integer!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_332.setName("+");
			symbol_332.setType(symbol_12);  // Integer
			
			Parameter symbol_333 = PivotFactory.eINSTANCE.createParameter(); // Integer!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_333.setName("i");
			symbol_333.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_332.getOwnedParameters().add(symbol_333);
			symbol_332.setPrecedence(symbol_4);
			symbol_332.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerPlusOperation");
			symbol_332.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerPlusOperation.INSTANCE);
			{
				Comment symbol_334 = PivotFactory.eINSTANCE.createComment();
				symbol_334.setBody("The value of the addition of oclText[self] and i.");
				symbol_332.getOwnedComments().add(symbol_334);
			}
			
			symbol_12.getOwnedOperations().add(symbol_332);
		}
		{	// ocl::Integer::-()
			Operation symbol_335 = PivotFactory.eINSTANCE.createOperation(); // Integer!-()
			symbol_335.setName("-");
			symbol_335.setType(symbol_12);  // Integer
			
			symbol_335.setPrecedence(symbol_2);
			symbol_335.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericNegateOperation");
			symbol_335.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			{
				Comment symbol_336 = PivotFactory.eINSTANCE.createComment();
				symbol_336.setBody("The negative value of oclText[self].");
				symbol_335.getOwnedComments().add(symbol_336);
			}
			
			symbol_12.getOwnedOperations().add(symbol_335);
		}
		{	// ocl::Integer::-()
			Operation symbol_337 = PivotFactory.eINSTANCE.createOperation(); // Integer!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_337.setName("-");
			symbol_337.setType(symbol_12);  // Integer
			
			Parameter symbol_338 = PivotFactory.eINSTANCE.createParameter(); // Integer!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_338.setName("i");
			symbol_338.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_337.getOwnedParameters().add(symbol_338);
			symbol_337.setPrecedence(symbol_4);
			symbol_337.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerMinusOperation");
			symbol_337.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerMinusOperation.INSTANCE);
			{
				Comment symbol_339 = PivotFactory.eINSTANCE.createComment();
				symbol_339.setBody("The value of the subtraction of i from oclText[self].");
				symbol_337.getOwnedComments().add(symbol_339);
			}
			
			symbol_12.getOwnedOperations().add(symbol_337);
		}
		{	// ocl::Integer::/()
			Operation symbol_340 = PivotFactory.eINSTANCE.createOperation(); // Integer!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_340.setName("/");
			symbol_340.setType(symbol_13);  // Real
			
			Parameter symbol_341 = PivotFactory.eINSTANCE.createParameter(); // Integer!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_341.setName("i");
			symbol_341.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_340.getOwnedParameters().add(symbol_341);
			symbol_340.setPrecedence(symbol_3);
			symbol_340.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivideOperation");
			symbol_340.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			{
				Comment symbol_342 = PivotFactory.eINSTANCE.createComment();
				symbol_342.setBody("The value of oclText[self] divided by i.\nEvaluates to oclText[invalid] if r is equal to zero.");
				symbol_340.getOwnedComments().add(symbol_342);
			}
			
			symbol_12.getOwnedOperations().add(symbol_340);
		}
		{	// ocl::Integer::abs()
			Operation symbol_343 = PivotFactory.eINSTANCE.createOperation(); // Integer!abs()
			symbol_343.setName("abs");
			symbol_343.setType(symbol_12);  // Integer
			
			symbol_343.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericAbsOperation");
			symbol_343.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			{
				Comment symbol_344 = PivotFactory.eINSTANCE.createComment();
				symbol_344.setBody("The absolute value of oclText[self].");
				symbol_343.getOwnedComments().add(symbol_344);
			}
			
			symbol_12.getOwnedOperations().add(symbol_343);
		}
		{	// ocl::Integer::compareTo()
			Operation symbol_345 = PivotFactory.eINSTANCE.createOperation(); // Integer!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_345.setName("compareTo");
			symbol_345.setType(symbol_12);  // Integer
			
			Parameter symbol_346 = PivotFactory.eINSTANCE.createParameter(); // Integer!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_346.setName("that");
			symbol_346.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_345.getOwnedParameters().add(symbol_346);
			symbol_345.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation");
			symbol_345.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation.INSTANCE);
			{
				Comment symbol_347 = PivotFactory.eINSTANCE.createComment();
				symbol_347.setBody("The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
				symbol_345.getOwnedComments().add(symbol_347);
			}
			
			symbol_12.getOwnedOperations().add(symbol_345);
		}
		{	// ocl::Integer::div()
			Operation symbol_348 = PivotFactory.eINSTANCE.createOperation(); // Integer!div(Integer)
			symbol_348.setName("div");
			symbol_348.setType(symbol_12);  // Integer
			
			Parameter symbol_349 = PivotFactory.eINSTANCE.createParameter(); // Integer!div(Integer)!i
			symbol_349.setName("i");
			symbol_349.setType(symbol_12);  // Integer
			
			
			symbol_348.getOwnedParameters().add(symbol_349);
			symbol_348.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivOperation");
			symbol_348.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE);
			{
				Comment symbol_350 = PivotFactory.eINSTANCE.createComment();
				symbol_350.setBody("The number of times that i fits completely within oclText[self].");
				symbol_348.getOwnedComments().add(symbol_350);
			}
			
			symbol_12.getOwnedOperations().add(symbol_348);
		}
		{	// ocl::Integer::max()
			Operation symbol_351 = PivotFactory.eINSTANCE.createOperation(); // Integer!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_351.setName("max");
			symbol_351.setType(symbol_12);  // Integer
			
			Parameter symbol_352 = PivotFactory.eINSTANCE.createParameter(); // Integer!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_352.setName("i");
			symbol_352.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_351.getOwnedParameters().add(symbol_352);
			symbol_351.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMaxOperation");
			symbol_351.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			{
				Comment symbol_353 = PivotFactory.eINSTANCE.createComment();
				symbol_353.setBody("The maximum of oclText[self] an i.");
				symbol_351.getOwnedComments().add(symbol_353);
			}
			
			symbol_12.getOwnedOperations().add(symbol_351);
		}
		{	// ocl::Integer::min()
			Operation symbol_354 = PivotFactory.eINSTANCE.createOperation(); // Integer!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_354.setName("min");
			symbol_354.setType(symbol_12);  // Integer
			
			Parameter symbol_355 = PivotFactory.eINSTANCE.createParameter(); // Integer!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_355.setName("i");
			symbol_355.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_354.getOwnedParameters().add(symbol_355);
			symbol_354.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMinOperation");
			symbol_354.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			{
				Comment symbol_356 = PivotFactory.eINSTANCE.createComment();
				symbol_356.setBody("The minimum of oclText[self] an i.");
				symbol_354.getOwnedComments().add(symbol_356);
			}
			
			symbol_12.getOwnedOperations().add(symbol_354);
		}
		{	// ocl::Integer::mod()
			Operation symbol_357 = PivotFactory.eINSTANCE.createOperation(); // Integer!mod(Integer)
			symbol_357.setName("mod");
			symbol_357.setType(symbol_12);  // Integer
			
			Parameter symbol_358 = PivotFactory.eINSTANCE.createParameter(); // Integer!mod(Integer)!i
			symbol_358.setName("i");
			symbol_358.setType(symbol_12);  // Integer
			
			
			symbol_357.getOwnedParameters().add(symbol_358);
			symbol_357.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericModOperation");
			symbol_357.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE);
			{
				Comment symbol_359 = PivotFactory.eINSTANCE.createComment();
				symbol_359.setBody("The result is oclText[self] modulo i.");
				symbol_357.getOwnedComments().add(symbol_359);
			}
			
			symbol_12.getOwnedOperations().add(symbol_357);
		}
		{	// ocl::Integer::toString()
			Operation symbol_360 = PivotFactory.eINSTANCE.createOperation(); // Integer!toString()
			symbol_360.setName("toString");
			symbol_360.setType(symbol_14);  // String
			
			symbol_360.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_360.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_361 = PivotFactory.eINSTANCE.createComment();
				symbol_361.setBody("Converts oclText[self] to a string value.");
				symbol_360.getOwnedComments().add(symbol_361);
			}
			
			symbol_12.getOwnedOperations().add(symbol_360);
		}
		{
			Comment symbol_362 = PivotFactory.eINSTANCE.createComment();
			symbol_362.setBody("The standard type Integer represents the mathematical concept of integer.\nNote that UnlimitedNatural is a subclass of Integer, so for each parameter of type Integer,\nyou can use an unlimited natural as the actual parameter.\nInteger is itself an instance of the metatype PrimitiveType (from UML).");
			symbol_12.getOwnedComments().add(symbol_362);
		}
		
		symbol_0.getOwnedTypes().add(symbol_12); // Integer
		//
		// ocl::Real Real
		//
		symbol_13.setName("Real");
		symbol_13.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		symbol_13.getSuperClasses().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		{	// ocl::Real::*()
			Operation symbol_363 = PivotFactory.eINSTANCE.createOperation(); // Real!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_363.setName("*");
			symbol_363.setType(symbol_13);  // Real
			
			Parameter symbol_364 = PivotFactory.eINSTANCE.createParameter(); // Real!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_364.setName("r");
			symbol_364.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_363.getOwnedParameters().add(symbol_364);
			symbol_363.setPrecedence(symbol_3);
			symbol_363.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericTimesOperation");
			symbol_363.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			{
				Comment symbol_365 = PivotFactory.eINSTANCE.createComment();
				symbol_365.setBody("The value of the multiplication of oclText[self] and r.");
				symbol_363.getOwnedComments().add(symbol_365);
			}
			
			symbol_13.getOwnedOperations().add(symbol_363);
		}
		{	// ocl::Real::+()
			Operation symbol_366 = PivotFactory.eINSTANCE.createOperation(); // Real!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_366.setName("+");
			symbol_366.setType(symbol_13);  // Real
			
			Parameter symbol_367 = PivotFactory.eINSTANCE.createParameter(); // Real!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_367.setName("r");
			symbol_367.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_366.getOwnedParameters().add(symbol_367);
			symbol_366.setPrecedence(symbol_4);
			symbol_366.setImplementationClass("org.eclipse.ocl.examples.library.real.RealPlusOperation");
			symbol_366.setImplementation(org.eclipse.ocl.examples.library.real.RealPlusOperation.INSTANCE);
			{
				Comment symbol_368 = PivotFactory.eINSTANCE.createComment();
				symbol_368.setBody("The value of the addition of oclText[self] and r.");
				symbol_366.getOwnedComments().add(symbol_368);
			}
			
			symbol_13.getOwnedOperations().add(symbol_366);
		}
		{	// ocl::Real::-()
			Operation symbol_369 = PivotFactory.eINSTANCE.createOperation(); // Real!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_369.setName("-");
			symbol_369.setType(symbol_13);  // Real
			
			Parameter symbol_370 = PivotFactory.eINSTANCE.createParameter(); // Real!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_370.setName("r");
			symbol_370.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_369.getOwnedParameters().add(symbol_370);
			symbol_369.setPrecedence(symbol_4);
			symbol_369.setImplementationClass("org.eclipse.ocl.examples.library.real.RealMinusOperation");
			symbol_369.setImplementation(org.eclipse.ocl.examples.library.real.RealMinusOperation.INSTANCE);
			{
				Comment symbol_371 = PivotFactory.eINSTANCE.createComment();
				symbol_371.setBody("The value of the subtraction of r from oclText[self].");
				symbol_369.getOwnedComments().add(symbol_371);
			}
			
			symbol_13.getOwnedOperations().add(symbol_369);
		}
		{	// ocl::Real::-()
			Operation symbol_372 = PivotFactory.eINSTANCE.createOperation(); // Real!-()
			symbol_372.setName("-");
			symbol_372.setType(symbol_13);  // Real
			
			symbol_372.setPrecedence(symbol_2);
			symbol_372.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericNegateOperation");
			symbol_372.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			{
				Comment symbol_373 = PivotFactory.eINSTANCE.createComment();
				symbol_373.setBody("The negative value of oclText[self].");
				symbol_372.getOwnedComments().add(symbol_373);
			}
			
			symbol_13.getOwnedOperations().add(symbol_372);
		}
		{	// ocl::Real::/()
			Operation symbol_374 = PivotFactory.eINSTANCE.createOperation(); // Real!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_374.setName("/");
			symbol_374.setType(symbol_13);  // Real
			
			Parameter symbol_375 = PivotFactory.eINSTANCE.createParameter(); // Real!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_375.setName("r");
			symbol_375.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_374.getOwnedParameters().add(symbol_375);
			symbol_374.setPrecedence(symbol_3);
			symbol_374.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivideOperation");
			symbol_374.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			{
				Comment symbol_376 = PivotFactory.eINSTANCE.createComment();
				symbol_376.setBody("The value of oclText[self] divided by r. Evaluates to oclText[invalid] if r is equal to zero.");
				symbol_374.getOwnedComments().add(symbol_376);
			}
			
			symbol_13.getOwnedOperations().add(symbol_374);
		}
		{	// ocl::Real::<()
			Operation symbol_377 = PivotFactory.eINSTANCE.createOperation(); // Real!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_377.setName("<");
			symbol_377.setType(symbol_11);  // Boolean
			
			Parameter symbol_378 = PivotFactory.eINSTANCE.createParameter(); // Real!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_378.setName("r");
			symbol_378.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_377.getOwnedParameters().add(symbol_378);
			symbol_377.setPrecedence(symbol_5);
			symbol_377.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation");
			symbol_377.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE);
			{
				Comment symbol_379 = PivotFactory.eINSTANCE.createComment();
				symbol_379.setBody("True if oclText[self] is less than r.");
				symbol_377.getOwnedComments().add(symbol_379);
			}
			
			symbol_13.getOwnedOperations().add(symbol_377);
		}
		{	// ocl::Real::<=()
			Operation symbol_380 = PivotFactory.eINSTANCE.createOperation(); // Real!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_380.setName("<=");
			symbol_380.setType(symbol_11);  // Boolean
			
			Parameter symbol_381 = PivotFactory.eINSTANCE.createParameter(); // Real!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_381.setName("r");
			symbol_381.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_380.getOwnedParameters().add(symbol_381);
			symbol_380.setPrecedence(symbol_5);
			symbol_380.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation");
			symbol_380.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE);
			{
				Comment symbol_382 = PivotFactory.eINSTANCE.createComment();
				symbol_382.setBody("True if oclText[self] is less than or equal to r.");
				symbol_380.getOwnedComments().add(symbol_382);
			}
			
			symbol_13.getOwnedOperations().add(symbol_380);
		}
		{	// ocl::Real::<>()
			Operation symbol_383 = PivotFactory.eINSTANCE.createOperation(); // Real!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_383.setName("<>");
			symbol_383.setType(symbol_11);  // Boolean
			
			Parameter symbol_384 = PivotFactory.eINSTANCE.createParameter(); // Real!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_384.setName("object2");
			symbol_384.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_383.getOwnedParameters().add(symbol_384);
			symbol_383.setPrecedence(symbol_6);
			symbol_383.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_383.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_385 = PivotFactory.eINSTANCE.createComment();
				symbol_385.setBody("Returns oclText[true] if the numeric value of oclText[self] is the not the same as the numeric value of object2, oclText[false] otherwise.");
				symbol_383.getOwnedComments().add(symbol_385);
			}
			
			symbol_13.getOwnedOperations().add(symbol_383);
		}
		{	// ocl::Real::=()
			Operation symbol_386 = PivotFactory.eINSTANCE.createOperation(); // Real!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_386.setName("=");
			symbol_386.setType(symbol_11);  // Boolean
			
			Parameter symbol_387 = PivotFactory.eINSTANCE.createParameter(); // Real!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_387.setName("object2");
			symbol_387.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_386.getOwnedParameters().add(symbol_387);
			symbol_386.setPrecedence(symbol_6);
			symbol_386.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_386.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_388 = PivotFactory.eINSTANCE.createComment();
				symbol_388.setBody("Returns oclText[true] if the numeric value of oclText[self] is the same as the numeric value of object2, oclText[false] otherwise.");
				symbol_386.getOwnedComments().add(symbol_388);
			}
			
			symbol_13.getOwnedOperations().add(symbol_386);
		}
		{	// ocl::Real::>()
			Operation symbol_389 = PivotFactory.eINSTANCE.createOperation(); // Real!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_389.setName(">");
			symbol_389.setType(symbol_11);  // Boolean
			
			Parameter symbol_390 = PivotFactory.eINSTANCE.createParameter(); // Real!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_390.setName("r");
			symbol_390.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_389.getOwnedParameters().add(symbol_390);
			symbol_389.setPrecedence(symbol_5);
			symbol_389.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation");
			symbol_389.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE);
			{
				Comment symbol_391 = PivotFactory.eINSTANCE.createComment();
				symbol_391.setBody("True if oclText[self] is greater than r.");
				symbol_389.getOwnedComments().add(symbol_391);
			}
			
			symbol_13.getOwnedOperations().add(symbol_389);
		}
		{	// ocl::Real::>=()
			Operation symbol_392 = PivotFactory.eINSTANCE.createOperation(); // Real!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_392.setName(">=");
			symbol_392.setType(symbol_11);  // Boolean
			
			Parameter symbol_393 = PivotFactory.eINSTANCE.createParameter(); // Real!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_393.setName("r");
			symbol_393.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_392.getOwnedParameters().add(symbol_393);
			symbol_392.setPrecedence(symbol_5);
			symbol_392.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation");
			symbol_392.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE);
			{
				Comment symbol_394 = PivotFactory.eINSTANCE.createComment();
				symbol_394.setBody("True if oclText[self] is greater than or equal to r.");
				symbol_392.getOwnedComments().add(symbol_394);
			}
			
			symbol_13.getOwnedOperations().add(symbol_392);
		}
		{	// ocl::Real::abs()
			Operation symbol_395 = PivotFactory.eINSTANCE.createOperation(); // Real!abs()
			symbol_395.setName("abs");
			symbol_395.setType(symbol_13);  // Real
			
			symbol_395.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericAbsOperation");
			symbol_395.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			{
				Comment symbol_396 = PivotFactory.eINSTANCE.createComment();
				symbol_396.setBody("The absolute value of oclText[self].");
				symbol_395.getOwnedComments().add(symbol_396);
			}
			
			symbol_13.getOwnedOperations().add(symbol_395);
		}
		{	// ocl::Real::compareTo()
			Operation symbol_397 = PivotFactory.eINSTANCE.createOperation(); // Real!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_397.setName("compareTo");
			symbol_397.setType(symbol_12);  // Integer
			
			Parameter symbol_398 = PivotFactory.eINSTANCE.createParameter(); // Real!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_398.setName("that");
			symbol_398.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_397.getOwnedParameters().add(symbol_398);
			symbol_397.setImplementationClass("org.eclipse.ocl.examples.library.real.RealCompareToOperation");
			symbol_397.setImplementation(org.eclipse.ocl.examples.library.real.RealCompareToOperation.INSTANCE);
			{
				Comment symbol_399 = PivotFactory.eINSTANCE.createComment();
				symbol_399.setBody("The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
				symbol_397.getOwnedComments().add(symbol_399);
			}
			
			symbol_13.getOwnedOperations().add(symbol_397);
		}
		{	// ocl::Real::floor()
			Operation symbol_400 = PivotFactory.eINSTANCE.createOperation(); // Real!floor()
			symbol_400.setName("floor");
			symbol_400.setType(symbol_12);  // Integer
			
			symbol_400.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericFloorOperation");
			symbol_400.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
			{
				Comment symbol_401 = PivotFactory.eINSTANCE.createComment();
				symbol_401.setBody("The largest integer that is less than or equal to oclText[self].");
				symbol_400.getOwnedComments().add(symbol_401);
			}
			
			symbol_13.getOwnedOperations().add(symbol_400);
		}
		{	// ocl::Real::max()
			Operation symbol_402 = PivotFactory.eINSTANCE.createOperation(); // Real!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_402.setName("max");
			symbol_402.setType(symbol_13);  // Real
			
			Parameter symbol_403 = PivotFactory.eINSTANCE.createParameter(); // Real!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_403.setName("r");
			symbol_403.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_402.getOwnedParameters().add(symbol_403);
			symbol_402.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMaxOperation");
			symbol_402.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			{
				Comment symbol_404 = PivotFactory.eINSTANCE.createComment();
				symbol_404.setBody("The maximum of oclText[self] and r.");
				symbol_402.getOwnedComments().add(symbol_404);
			}
			
			symbol_13.getOwnedOperations().add(symbol_402);
		}
		{	// ocl::Real::min()
			Operation symbol_405 = PivotFactory.eINSTANCE.createOperation(); // Real!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_405.setName("min");
			symbol_405.setType(symbol_13);  // Real
			
			Parameter symbol_406 = PivotFactory.eINSTANCE.createParameter(); // Real!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_406.setName("r");
			symbol_406.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_405.getOwnedParameters().add(symbol_406);
			symbol_405.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMinOperation");
			symbol_405.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			{
				Comment symbol_407 = PivotFactory.eINSTANCE.createComment();
				symbol_407.setBody("The minimum of oclText[self] and r.");
				symbol_405.getOwnedComments().add(symbol_407);
			}
			
			symbol_13.getOwnedOperations().add(symbol_405);
		}
		{	// ocl::Real::round()
			Operation symbol_408 = PivotFactory.eINSTANCE.createOperation(); // Real!round()
			symbol_408.setName("round");
			symbol_408.setType(symbol_12);  // Integer
			
			symbol_408.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericRoundOperation");
			symbol_408.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
			{
				Comment symbol_409 = PivotFactory.eINSTANCE.createComment();
				symbol_409.setBody("The integer that is closest to oclText[self]. When there are two such integers, the largest one.");
				symbol_408.getOwnedComments().add(symbol_409);
			}
			
			symbol_13.getOwnedOperations().add(symbol_408);
		}
		{	// ocl::Real::toString()
			Operation symbol_410 = PivotFactory.eINSTANCE.createOperation(); // Real!toString()
			symbol_410.setName("toString");
			symbol_410.setType(symbol_14);  // String
			
			symbol_410.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_410.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_411 = PivotFactory.eINSTANCE.createComment();
				symbol_411.setBody("Converts oclText[self] to a string value.");
				symbol_410.getOwnedComments().add(symbol_411);
			}
			
			symbol_13.getOwnedOperations().add(symbol_410);
		}
		{
			Comment symbol_412 = PivotFactory.eINSTANCE.createComment();
			symbol_412.setBody("The standard type Real represents the mathematical concept of real.\nNote that UnlimitedNatural is a subclass of Integer and that Integer is a subclass of Real,\nso for each parameter of type Real, you can use an unlimited natural or an integer as the actual parameter.\nReal is itself an instance of the metatype PrimitiveType (from UML).");
			symbol_13.getOwnedComments().add(symbol_412);
		}
		
		symbol_0.getOwnedTypes().add(symbol_13); // Real
		//
		// ocl::String String
		//
		symbol_14.setName("String");
		symbol_14.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		symbol_14.getSuperClasses().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		{	// ocl::String::+()
			Operation symbol_413 = PivotFactory.eINSTANCE.createOperation(); // String!+(String)
			symbol_413.setName("+");
			symbol_413.setType(symbol_14);  // String
			
			Parameter symbol_414 = PivotFactory.eINSTANCE.createParameter(); // String!+(String)!s
			symbol_414.setName("s");
			symbol_414.setType(symbol_14);  // String
			
			
			symbol_413.getOwnedParameters().add(symbol_414);
			symbol_413.setPrecedence(symbol_4);
			symbol_413.setImplementationClass("org.eclipse.ocl.examples.library.string.StringConcatOperation");
			symbol_413.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			{
				Comment symbol_415 = PivotFactory.eINSTANCE.createComment();
				symbol_415.setBody("The concatenation of oclText[self] and s.");
				symbol_413.getOwnedComments().add(symbol_415);
			}
			
			symbol_14.getOwnedOperations().add(symbol_413);
		}
		{	// ocl::String::<()
			Operation symbol_416 = PivotFactory.eINSTANCE.createOperation(); // String!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_416.setName("<");
			symbol_416.setType(symbol_11);  // Boolean
			
			Parameter symbol_417 = PivotFactory.eINSTANCE.createParameter(); // String!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_417.setName("s");
			symbol_417.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_416.getOwnedParameters().add(symbol_417);
			symbol_416.setPrecedence(symbol_5);
			symbol_416.setImplementationClass("org.eclipse.ocl.examples.library.string.StringLessThanOperation");
			symbol_416.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
			{
				Comment symbol_418 = PivotFactory.eINSTANCE.createComment();
				symbol_418.setBody("True if oclText[self] is less than s, using the locale defined by looking up oclLocale in the current environment.");
				symbol_416.getOwnedComments().add(symbol_418);
			}
			
			symbol_14.getOwnedOperations().add(symbol_416);
		}
		{	// ocl::String::<=()
			Operation symbol_419 = PivotFactory.eINSTANCE.createOperation(); // String!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_419.setName("<=");
			symbol_419.setType(symbol_11);  // Boolean
			
			Parameter symbol_420 = PivotFactory.eINSTANCE.createParameter(); // String!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_420.setName("s");
			symbol_420.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_419.getOwnedParameters().add(symbol_420);
			symbol_419.setPrecedence(symbol_5);
			symbol_419.setImplementationClass("org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation");
			symbol_419.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
			{
				Comment symbol_421 = PivotFactory.eINSTANCE.createComment();
				symbol_421.setBody("True if oclText[self] is less than or equal to s, using the locale defined by looking up oclLocale in the current environment.");
				symbol_419.getOwnedComments().add(symbol_421);
			}
			
			symbol_14.getOwnedOperations().add(symbol_419);
		}
		{	// ocl::String::<>()
			Operation symbol_422 = PivotFactory.eINSTANCE.createOperation(); // String!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_422.setName("<>");
			symbol_422.setType(symbol_11);  // Boolean
			
			Parameter symbol_423 = PivotFactory.eINSTANCE.createParameter(); // String!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_423.setName("object2");
			symbol_423.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_422.getOwnedParameters().add(symbol_423);
			symbol_422.setPrecedence(symbol_6);
			symbol_422.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_422.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_14.getOwnedOperations().add(symbol_422);
		}
		{	// ocl::String::=()
			Operation symbol_424 = PivotFactory.eINSTANCE.createOperation(); // String!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_424.setName("=");
			symbol_424.setType(symbol_11);  // Boolean
			
			Parameter symbol_425 = PivotFactory.eINSTANCE.createParameter(); // String!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_425.setName("object2");
			symbol_425.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_424.getOwnedParameters().add(symbol_425);
			symbol_424.setPrecedence(symbol_6);
			symbol_424.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_424.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			
			symbol_14.getOwnedOperations().add(symbol_424);
		}
		{	// ocl::String::>()
			Operation symbol_426 = PivotFactory.eINSTANCE.createOperation(); // String!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_426.setName(">");
			symbol_426.setType(symbol_11);  // Boolean
			
			Parameter symbol_427 = PivotFactory.eINSTANCE.createParameter(); // String!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_427.setName("s");
			symbol_427.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_426.getOwnedParameters().add(symbol_427);
			symbol_426.setPrecedence(symbol_5);
			symbol_426.setImplementationClass("org.eclipse.ocl.examples.library.string.StringGreaterThanOperation");
			symbol_426.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
			{
				Comment symbol_428 = PivotFactory.eINSTANCE.createComment();
				symbol_428.setBody("True if oclText[self] is greater than s, using the locale defined by looking up oclLocale in the current environment.");
				symbol_426.getOwnedComments().add(symbol_428);
			}
			
			symbol_14.getOwnedOperations().add(symbol_426);
		}
		{	// ocl::String::>=()
			Operation symbol_429 = PivotFactory.eINSTANCE.createOperation(); // String!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_429.setName(">=");
			symbol_429.setType(symbol_11);  // Boolean
			
			Parameter symbol_430 = PivotFactory.eINSTANCE.createParameter(); // String!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_430.setName("s");
			symbol_430.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_429.getOwnedParameters().add(symbol_430);
			symbol_429.setPrecedence(symbol_5);
			symbol_429.setImplementationClass("org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation");
			symbol_429.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
			{
				Comment symbol_431 = PivotFactory.eINSTANCE.createComment();
				symbol_431.setBody("True if oclText[self] is greater than or equal to s, using the locale defined by looking up oclLocale in the current environment.");
				symbol_429.getOwnedComments().add(symbol_431);
			}
			
			symbol_14.getOwnedOperations().add(symbol_429);
		}
		{	// ocl::String::at()
			Operation symbol_432 = PivotFactory.eINSTANCE.createOperation(); // String!at(Integer)
			symbol_432.setName("at");
			symbol_432.setType(symbol_14);  // String
			
			Parameter symbol_433 = PivotFactory.eINSTANCE.createParameter(); // String!at(Integer)!i
			symbol_433.setName("i");
			symbol_433.setType(symbol_12);  // Integer
			
			
			symbol_432.getOwnedParameters().add(symbol_433);
			symbol_432.setImplementationClass("org.eclipse.ocl.examples.library.string.StringAtOperation");
			symbol_432.setImplementation(org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE);
			{
				Comment symbol_434 = PivotFactory.eINSTANCE.createComment();
				symbol_434.setBody("Queries the character at position i in oclText[self].");
				symbol_432.getOwnedComments().add(symbol_434);
			}
			
			symbol_14.getOwnedOperations().add(symbol_432);
		}
		{	// ocl::String::characters()
			Operation symbol_435 = PivotFactory.eINSTANCE.createOperation(); // String!characters()
			symbol_435.setName("characters");
			symbol_435.setType(symbol_259);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
			
			symbol_435.setImplementationClass("org.eclipse.ocl.examples.library.string.StringCharactersOperation");
			symbol_435.setImplementation(org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
			{
				Comment symbol_436 = PivotFactory.eINSTANCE.createComment();
				symbol_436.setBody("Obtains the characters of oclText[self] as a sequence.");
				symbol_435.getOwnedComments().add(symbol_436);
			}
			
			symbol_14.getOwnedOperations().add(symbol_435);
		}
		{	// ocl::String::compareTo()
			Operation symbol_437 = PivotFactory.eINSTANCE.createOperation(); // String!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_437.setName("compareTo");
			symbol_437.setType(symbol_12);  // Integer
			
			Parameter symbol_438 = PivotFactory.eINSTANCE.createParameter(); // String!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_438.setName("that");
			symbol_438.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_437.getOwnedParameters().add(symbol_438);
			symbol_437.setImplementationClass("org.eclipse.ocl.examples.library.string.StringCompareToOperation");
			symbol_437.setImplementation(org.eclipse.ocl.examples.library.string.StringCompareToOperation.INSTANCE);
			{
				Comment symbol_439 = PivotFactory.eINSTANCE.createComment();
				symbol_439.setBody("The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
				symbol_437.getOwnedComments().add(symbol_439);
			}
			
			symbol_14.getOwnedOperations().add(symbol_437);
		}
		{	// ocl::String::concat()
			Operation symbol_440 = PivotFactory.eINSTANCE.createOperation(); // String!concat(String)
			symbol_440.setName("concat");
			symbol_440.setType(symbol_14);  // String
			
			Parameter symbol_441 = PivotFactory.eINSTANCE.createParameter(); // String!concat(String)!s
			symbol_441.setName("s");
			symbol_441.setType(symbol_14);  // String
			
			
			symbol_440.getOwnedParameters().add(symbol_441);
			symbol_440.setImplementationClass("org.eclipse.ocl.examples.library.string.StringConcatOperation");
			symbol_440.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			{
				Comment symbol_442 = PivotFactory.eINSTANCE.createComment();
				symbol_442.setBody("The concatenation of oclText[self] and s.");
				symbol_440.getOwnedComments().add(symbol_442);
			}
			
			symbol_14.getOwnedOperations().add(symbol_440);
		}
		{	// ocl::String::equalsIgnoreCase()
			Operation symbol_443 = PivotFactory.eINSTANCE.createOperation(); // String!equalsIgnoreCase(String)
			symbol_443.setName("equalsIgnoreCase");
			symbol_443.setType(symbol_11);  // Boolean
			
			Parameter symbol_444 = PivotFactory.eINSTANCE.createParameter(); // String!equalsIgnoreCase(String)!s
			symbol_444.setName("s");
			symbol_444.setType(symbol_14);  // String
			
			
			symbol_443.getOwnedParameters().add(symbol_444);
			symbol_443.setImplementationClass("org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation");
			symbol_443.setImplementation(org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
			{
				Comment symbol_445 = PivotFactory.eINSTANCE.createComment();
				symbol_445.setBody("Queries whether s and oclText[self] are equivalent under case-insensitive collation.");
				symbol_443.getOwnedComments().add(symbol_445);
			}
			
			symbol_14.getOwnedOperations().add(symbol_443);
		}
		{	// ocl::String::indexOf()
			Operation symbol_446 = PivotFactory.eINSTANCE.createOperation(); // String!indexOf(String)
			symbol_446.setName("indexOf");
			symbol_446.setType(symbol_12);  // Integer
			
			Parameter symbol_447 = PivotFactory.eINSTANCE.createParameter(); // String!indexOf(String)!s
			symbol_447.setName("s");
			symbol_447.setType(symbol_14);  // String
			
			
			symbol_446.getOwnedParameters().add(symbol_447);
			symbol_446.setImplementationClass("org.eclipse.ocl.examples.library.string.StringIndexOfOperation");
			symbol_446.setImplementation(org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE);
			{
				Comment symbol_448 = PivotFactory.eINSTANCE.createComment();
				symbol_448.setBody("Queries the index in oclText[self] at which s is a substring of oclText[self], or zero if s is not a substring of oclText[self].\nThe empty string is considered to be a substring of every string but the empty string, at index 1.\nNo string is a substring of the empty string.");
				symbol_446.getOwnedComments().add(symbol_448);
			}
			
			symbol_14.getOwnedOperations().add(symbol_446);
		}
		{	// ocl::String::size()
			Operation symbol_449 = PivotFactory.eINSTANCE.createOperation(); // String!size()
			symbol_449.setName("size");
			symbol_449.setType(symbol_12);  // Integer
			
			symbol_449.setImplementationClass("org.eclipse.ocl.examples.library.string.StringSizeOperation");
			symbol_449.setImplementation(org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
			{
				Comment symbol_450 = PivotFactory.eINSTANCE.createComment();
				symbol_450.setBody("The number of characters in oclText[self].");
				symbol_449.getOwnedComments().add(symbol_450);
			}
			
			symbol_14.getOwnedOperations().add(symbol_449);
		}
		{	// ocl::String::substring()
			Operation symbol_451 = PivotFactory.eINSTANCE.createOperation(); // String!substring(Integer,Integer)
			symbol_451.setName("substring");
			symbol_451.setType(symbol_14);  // String
			
			Parameter symbol_452 = PivotFactory.eINSTANCE.createParameter(); // String!substring(Integer,Integer)!lower
			symbol_452.setName("lower");
			symbol_452.setType(symbol_12);  // Integer
			
			
			symbol_451.getOwnedParameters().add(symbol_452);
			Parameter symbol_453 = PivotFactory.eINSTANCE.createParameter(); // String!substring(Integer,Integer)!upper
			symbol_453.setName("upper");
			symbol_453.setType(symbol_12);  // Integer
			
			
			symbol_451.getOwnedParameters().add(symbol_453);
			symbol_451.setImplementationClass("org.eclipse.ocl.examples.library.string.StringSubstringOperation");
			symbol_451.setImplementation(org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
			{
				Comment symbol_454 = PivotFactory.eINSTANCE.createComment();
				symbol_454.setBody("The sub-string of oclText[self] starting at character number lower, up to and including character number upper. Character numbers run from 1 to self.size().");
				symbol_451.getOwnedComments().add(symbol_454);
			}
			
			symbol_14.getOwnedOperations().add(symbol_451);
		}
		{	// ocl::String::toBoolean()
			Operation symbol_455 = PivotFactory.eINSTANCE.createOperation(); // String!toBoolean()
			symbol_455.setName("toBoolean");
			symbol_455.setType(symbol_11);  // Boolean
			
			symbol_455.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToBooleanOperation");
			symbol_455.setImplementation(org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
			{
				Comment symbol_456 = PivotFactory.eINSTANCE.createComment();
				symbol_456.setBody("Converts oclText[self] to a boolean value.");
				symbol_455.getOwnedComments().add(symbol_456);
			}
			
			symbol_14.getOwnedOperations().add(symbol_455);
		}
		{	// ocl::String::toInteger()
			Operation symbol_457 = PivotFactory.eINSTANCE.createOperation(); // String!toInteger()
			symbol_457.setName("toInteger");
			symbol_457.setType(symbol_12);  // Integer
			
			symbol_457.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToIntegerOperation");
			symbol_457.setImplementation(org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
			{
				Comment symbol_458 = PivotFactory.eINSTANCE.createComment();
				symbol_458.setBody("Converts oclText[self] to an Integer value.");
				symbol_457.getOwnedComments().add(symbol_458);
			}
			
			symbol_14.getOwnedOperations().add(symbol_457);
		}
		{	// ocl::String::toLower()
			Operation symbol_459 = PivotFactory.eINSTANCE.createOperation(); // String!toLower()
			symbol_459.setName("toLower");
			symbol_459.setType(symbol_14);  // String
			
			symbol_459.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation");
			symbol_459.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			{
				Comment symbol_460 = PivotFactory.eINSTANCE.createComment();
				symbol_460.setBody("This is a deprecated variant of toLowerCase() preserving compatibility with traditional Eclipse OCL behaviour.");
				symbol_459.getOwnedComments().add(symbol_460);
			}
			
			symbol_14.getOwnedOperations().add(symbol_459);
		}
		{	// ocl::String::toLowerCase()
			Operation symbol_461 = PivotFactory.eINSTANCE.createOperation(); // String!toLowerCase()
			symbol_461.setName("toLowerCase");
			symbol_461.setType(symbol_14);  // String
			
			symbol_461.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation");
			symbol_461.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			{
				Comment symbol_462 = PivotFactory.eINSTANCE.createComment();
				symbol_462.setBody("Converts oclText[self] to lower case, using the locale defined by looking up oclLocale in the current environment.\nOtherwise, returns the same string as oclText[self].");
				symbol_461.getOwnedComments().add(symbol_462);
			}
			
			symbol_14.getOwnedOperations().add(symbol_461);
		}
		{	// ocl::String::toReal()
			Operation symbol_463 = PivotFactory.eINSTANCE.createOperation(); // String!toReal()
			symbol_463.setName("toReal");
			symbol_463.setType(symbol_13);  // Real
			
			symbol_463.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToRealOperation");
			symbol_463.setImplementation(org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
			{
				Comment symbol_464 = PivotFactory.eINSTANCE.createComment();
				symbol_464.setBody("Converts oclText[self] to a Real value.");
				symbol_463.getOwnedComments().add(symbol_464);
			}
			
			symbol_14.getOwnedOperations().add(symbol_463);
		}
		{	// ocl::String::toString()
			Operation symbol_465 = PivotFactory.eINSTANCE.createOperation(); // String!toString()
			symbol_465.setName("toString");
			symbol_465.setType(symbol_14);  // String
			
			symbol_465.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_465.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_466 = PivotFactory.eINSTANCE.createComment();
				symbol_466.setBody("Returns oclText[self].");
				symbol_465.getOwnedComments().add(symbol_466);
			}
			
			symbol_14.getOwnedOperations().add(symbol_465);
		}
		{	// ocl::String::toUpper()
			Operation symbol_467 = PivotFactory.eINSTANCE.createOperation(); // String!toUpper()
			symbol_467.setName("toUpper");
			symbol_467.setType(symbol_14);  // String
			
			symbol_467.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation");
			symbol_467.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			{
				Comment symbol_468 = PivotFactory.eINSTANCE.createComment();
				symbol_468.setBody("This is a deprecated variant of toUpperCase() preserving compatibility with traditional Eclipse OCL behaviour.");
				symbol_467.getOwnedComments().add(symbol_468);
			}
			
			symbol_14.getOwnedOperations().add(symbol_467);
		}
		{	// ocl::String::toUpperCase()
			Operation symbol_469 = PivotFactory.eINSTANCE.createOperation(); // String!toUpperCase()
			symbol_469.setName("toUpperCase");
			symbol_469.setType(symbol_14);  // String
			
			symbol_469.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation");
			symbol_469.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			{
				Comment symbol_470 = PivotFactory.eINSTANCE.createComment();
				symbol_470.setBody("Converts oclText[self] to upper case, using the locale defined by looking up oclLocale in the current environment.\nOtherwise, returns the same string as oclText[self].");
				symbol_469.getOwnedComments().add(symbol_470);
			}
			
			symbol_14.getOwnedOperations().add(symbol_469);
		}
		{
			Comment symbol_471 = PivotFactory.eINSTANCE.createComment();
			symbol_471.setBody("The standard type String represents strings, which can be both ASCII or Unicode.\nString is itself an instance of the metatype PrimitiveType (from UML).");
			symbol_14.getOwnedComments().add(symbol_471);
		}
		
		symbol_0.getOwnedTypes().add(symbol_14); // String
		//
		// ocl::UnlimitedNatural UnlimitedNatural
		//
		symbol_15.setName("UnlimitedNatural");
		symbol_15.getSuperClasses().add(symbol_12); // Integer
		{	// ocl::UnlimitedNatural::oclAsType()
			Operation symbol_472 = PivotFactory.eINSTANCE.createOperation(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])
			symbol_18.setName("TT");
			symbol_17.setOwnedParameteredElement(symbol_18);
			symbol_16.getOwnedParameters().add(symbol_17);
			
			symbol_472.setOwnedTemplateSignature(symbol_16);
			symbol_472.setName("oclAsType");
			symbol_472.setType(symbol_18);  // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT
			
			Parameter symbol_473 = PivotFactory.eINSTANCE.createParameter(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])!type
			symbol_473.setName("type");
			symbol_473.setType(symbol_179);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
			
			
			symbol_472.getOwnedParameters().add(symbol_473);
			symbol_472.setImplementationClass("org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation");
			symbol_472.setImplementation(org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation.INSTANCE);
			{
				Comment symbol_474 = PivotFactory.eINSTANCE.createComment();
				symbol_474.setBody("Evaluates to oclText[self], where oclText[self] is of the type identified by T.\nThe type T may be any classifier defined in the UML model;\nif the actual type of oclText[self] at evaluation time does not conform to T,\nthen the oclAsType operation evaluates to oclText[invalid].\n\nThe standard behavior is redefined for UnlimitedNatural. Numeric values may be converted to\nReal or Integer, but the e[unlimited] value may not.\nConversion of e[unlimited] to Real or Integer returns oclText[invalid].");
				symbol_472.getOwnedComments().add(symbol_474);
			}
			
			symbol_15.getOwnedOperations().add(symbol_472);
		}
		{
			Comment symbol_475 = PivotFactory.eINSTANCE.createComment();
			symbol_475.setBody("The standard type UnlimitedNatural is used to encode the non-negative values of a multiplicity specification.\nThis includes a special e[unlimited] value (*) that encodes the upper value of  a multiplicity specification.\nUnlimitedNatural is itself an instance of the metatype UnlimitedNaturalType.\n\nNote that although UnlimitedNatural is a subclass of Integer, the e[unlimited] value cannot be represented as an Integer.\nAny use of the e[unlimited] value as an integer or real is replaced by the oclText[invalid] value.");
			symbol_15.getOwnedComments().add(symbol_475);
		}
		
		symbol_0.getOwnedTypes().add(symbol_15); // UnlimitedNatural
		//
		// ocl::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier{T}
		//
		symbol_19.setName("AnyClassifier");
		symbol_19.setInstanceType(symbol_22);
		symbol_22.setName("T");
		symbol_21.setOwnedParameteredElement(symbol_22);
		symbol_20.getOwnedParameters().add(symbol_21);
		
		symbol_19.setOwnedTemplateSignature(symbol_20);
		symbol_19.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_19.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_0.getOwnedTypes().add(symbol_19); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier{T}
		//
		// ocl::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
		//
		symbol_23.setName("Bag");
		symbol_23.setElementType(symbol_26);
		symbol_26.setName("T");
		symbol_25.setOwnedParameteredElement(symbol_26);
		symbol_24.getOwnedParameters().add(symbol_25);
		
		symbol_23.setOwnedTemplateSignature(symbol_24);
		symbol_23.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		{	// ocl::Bag::<>()
			Operation symbol_476 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_476.setName("<>");
			symbol_476.setType(symbol_11);  // Boolean
			
			Parameter symbol_477 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_477.setName("object2");
			symbol_477.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_476.getOwnedParameters().add(symbol_477);
			symbol_476.setPrecedence(symbol_6);
			symbol_476.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_476.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_23.getOwnedOperations().add(symbol_476);
		}
		{	// ocl::Bag::=()
			Operation symbol_478 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_478.setName("=");
			symbol_478.setType(symbol_11);  // Boolean
			
			Parameter symbol_479 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_479.setName("object2");
			symbol_479.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_478.getOwnedParameters().add(symbol_479);
			symbol_478.setPrecedence(symbol_6);
			symbol_478.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_478.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_480 = PivotFactory.eINSTANCE.createComment();
				symbol_480.setBody("True if oclText[self] and bag contain the same elements, the same number of times.");
				symbol_478.getOwnedComments().add(symbol_480);
			}
			
			symbol_23.getOwnedOperations().add(symbol_478);
		}
		{	// ocl::Bag::closure()
			Iteration symbol_481 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_481.setName("closure");
			symbol_481.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			Parameter symbol_482 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!i
			symbol_482.setName("i");
			symbol_482.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_481.getOwnedIterators().add(symbol_482);
			Parameter symbol_483 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!body
			symbol_483.setName("body");
			symbol_483.setType(symbol_140);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
			
			
			symbol_481.getOwnedParameters().add(symbol_483);
			symbol_481.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ClosureIteration");
			symbol_481.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			{
				Comment symbol_484 = PivotFactory.eINSTANCE.createComment();
				symbol_484.setBody("The closure of applying body transitively to every distinct element of the source collection.");
				symbol_481.getOwnedComments().add(symbol_484);
			}
			
			symbol_23.getOwnedOperations().add(symbol_481);
		}
		{	// ocl::Bag::collect()
			Iteration symbol_485 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)
			symbol_29.setName("V");
			symbol_28.setOwnedParameteredElement(symbol_29);
			symbol_27.getOwnedParameters().add(symbol_28);
			
			symbol_485.setOwnedTemplateSignature(symbol_27);
			symbol_485.setName("collect");
			symbol_485.setType(symbol_192);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_486 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)!i
			symbol_486.setName("i");
			symbol_486.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_485.getOwnedIterators().add(symbol_486);
			Parameter symbol_487 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)!body
			symbol_487.setName("body");
			symbol_487.setType(symbol_138);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V
			
			
			symbol_485.getOwnedParameters().add(symbol_487);
			symbol_485.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_485.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			
			symbol_23.getOwnedOperations().add(symbol_485);
		}
		{	// ocl::Bag::collectNested()
			Iteration symbol_488 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)
			symbol_32.setName("V");
			symbol_31.setOwnedParameteredElement(symbol_32);
			symbol_30.getOwnedParameters().add(symbol_31);
			
			symbol_488.setOwnedTemplateSignature(symbol_30);
			symbol_488.setName("collectNested");
			symbol_488.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_489 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_489.setName("i");
			symbol_489.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_488.getOwnedIterators().add(symbol_489);
			Parameter symbol_490 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_490.setName("body");
			symbol_490.setType(symbol_137);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)?V
			
			
			symbol_488.getOwnedParameters().add(symbol_490);
			symbol_488.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_488.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			{
				Comment symbol_491 = PivotFactory.eINSTANCE.createComment();
				symbol_491.setBody("The Bag of elements which results from applying body to every member of the source nonordered collection.");
				symbol_488.getOwnedComments().add(symbol_491);
			}
			
			symbol_23.getOwnedOperations().add(symbol_488);
		}
		{	// ocl::Bag::excluding()
			Operation symbol_492 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_492.setName("excluding");
			symbol_492.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_493 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_493.setName("object");
			symbol_493.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_492.getOwnedParameters().add(symbol_493);
			symbol_492.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_492.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_494 = PivotFactory.eINSTANCE.createComment();
				symbol_494.setBody("The bag containing all elements of oclText[self] apart from all occurrences of object.");
				symbol_492.getOwnedComments().add(symbol_494);
			}
			
			symbol_23.getOwnedOperations().add(symbol_492);
		}
		{	// ocl::Bag::flatten()
			Operation symbol_495 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()
			symbol_35.setName("T2");
			symbol_34.setOwnedParameteredElement(symbol_35);
			symbol_33.getOwnedParameters().add(symbol_34);
			
			symbol_495.setOwnedTemplateSignature(symbol_33);
			symbol_495.setName("flatten");
			symbol_495.setType(symbol_193);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
			
			symbol_495.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_495.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			{
				Comment symbol_496 = PivotFactory.eINSTANCE.createComment();
				symbol_496.setBody("Redefines the Collection operation. If the element type is not a collection type, this results in the same bag as oclText[self].\nIf the element type is a collection type, the result is the bag containing all the elements of all the recursively flattened elements of oclText[self].");
				symbol_495.getOwnedComments().add(symbol_496);
			}
			
			symbol_23.getOwnedOperations().add(symbol_495);
		}
		{	// ocl::Bag::including()
			Operation symbol_497 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!including(T)
			symbol_497.setName("including");
			symbol_497.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_498 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!including(T)!object
			symbol_498.setName("object");
			symbol_498.setType(symbol_26);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			
			symbol_497.getOwnedParameters().add(symbol_498);
			symbol_497.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_497.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_499 = PivotFactory.eINSTANCE.createComment();
				symbol_499.setBody("The bag containing all elements of oclText[self] plus object.");
				symbol_497.getOwnedComments().add(symbol_499);
			}
			
			symbol_23.getOwnedOperations().add(symbol_497);
		}
		{	// ocl::Bag::intersection()
			Operation symbol_500 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_500.setName("intersection");
			symbol_500.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_501 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!bag
			symbol_501.setName("bag");
			symbol_501.setType(symbol_223);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			
			symbol_500.getOwnedParameters().add(symbol_501);
			symbol_500.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_500.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			{
				Comment symbol_502 = PivotFactory.eINSTANCE.createComment();
				symbol_502.setBody("The intersection of oclText[self] and bag; the bag of all elements that are in both oclText[self] and s.");
				symbol_500.getOwnedComments().add(symbol_502);
			}
			
			symbol_23.getOwnedOperations().add(symbol_500);
		}
		{	// ocl::Bag::intersection()
			Operation symbol_503 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])
			symbol_503.setName("intersection");
			symbol_503.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			Parameter symbol_504 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])!s
			symbol_504.setName("s");
			symbol_504.setType(symbol_281);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			
			symbol_503.getOwnedParameters().add(symbol_504);
			symbol_503.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_503.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			{
				Comment symbol_505 = PivotFactory.eINSTANCE.createComment();
				symbol_505.setBody("The intersection of oclText[self] and s; the set of all elements that are in both oclText[self] and s.");
				symbol_503.getOwnedComments().add(symbol_505);
			}
			
			symbol_23.getOwnedOperations().add(symbol_503);
		}
		{	// ocl::Bag::reject()
			Iteration symbol_506 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)
			symbol_506.setName("reject");
			symbol_506.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_507 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)!i
			symbol_507.setName("i");
			symbol_507.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_506.getOwnedIterators().add(symbol_507);
			Parameter symbol_508 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)!body
			symbol_508.setName("body");
			symbol_508.setType(symbol_135);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
			
			
			symbol_506.getOwnedParameters().add(symbol_508);
			symbol_506.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_506.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_509 = PivotFactory.eINSTANCE.createComment();
				symbol_509.setBody("The sub-bag of the source bag for which body is oclText[false].\n\noclCode[self->reject(iterator | body) = self->select(iterator | not body)].");
				symbol_506.getOwnedComments().add(symbol_509);
			}
			
			symbol_23.getOwnedOperations().add(symbol_506);
		}
		{	// ocl::Bag::select()
			Iteration symbol_510 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)
			symbol_510.setName("select");
			symbol_510.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_511 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)!i
			symbol_511.setName("i");
			symbol_511.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_510.getOwnedIterators().add(symbol_511);
			Parameter symbol_512 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)!body
			symbol_512.setName("body");
			symbol_512.setType(symbol_136);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
			
			
			symbol_510.getOwnedParameters().add(symbol_512);
			symbol_510.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_510.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_513 = PivotFactory.eINSTANCE.createComment();
				symbol_513.setBody("The sub-bag of the source bag for which body is oclText[true].\n\noclCode[self->select(iterator | body) =\nself->iterate(iterator; result : Bag<T> = Bag{} |\nif body then result->including(iterator)\nelse result\nendif)]");
				symbol_510.getOwnedComments().add(symbol_513);
			}
			
			symbol_23.getOwnedOperations().add(symbol_510);
		}
		{	// ocl::Bag::sortedBy()
			Iteration symbol_514 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_514.setName("sortedBy");
			symbol_514.setType(symbol_260);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			Parameter symbol_515 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_515.setName("i");
			symbol_515.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_514.getOwnedIterators().add(symbol_515);
			Parameter symbol_516 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_516.setName("body");
			symbol_516.setType(symbol_139);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_514.getOwnedParameters().add(symbol_516);
			symbol_514.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_514.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_517 = PivotFactory.eINSTANCE.createComment();
				symbol_517.setBody("Results in the Sequence containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
				symbol_514.getOwnedComments().add(symbol_517);
			}
			
			symbol_23.getOwnedOperations().add(symbol_514);
		}
		{	// ocl::Bag::union()
			Operation symbol_518 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_518.setName("union");
			symbol_518.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_519 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!bag
			symbol_519.setName("bag");
			symbol_519.setType(symbol_223);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			
			symbol_518.getOwnedParameters().add(symbol_519);
			symbol_518.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_518.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_520 = PivotFactory.eINSTANCE.createComment();
				symbol_520.setBody("The union of oclText[self] and bag; the bag of all elements that are in oclText[self] and all elements that are in bag.");
				symbol_518.getOwnedComments().add(symbol_520);
			}
			
			symbol_23.getOwnedOperations().add(symbol_518);
		}
		{	// ocl::Bag::union()
			Operation symbol_521 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])
			symbol_521.setName("union");
			symbol_521.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			Parameter symbol_522 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])!s
			symbol_522.setName("s");
			symbol_522.setType(symbol_281);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			
			symbol_521.getOwnedParameters().add(symbol_522);
			symbol_521.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_521.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_523 = PivotFactory.eINSTANCE.createComment();
				symbol_523.setBody("The union of oclText[self] and s; the set of all elements that are in oclText[self] and all elements that are in s.");
				symbol_521.getOwnedComments().add(symbol_523);
			}
			
			symbol_23.getOwnedOperations().add(symbol_521);
		}
		{
			Comment symbol_524 = PivotFactory.eINSTANCE.createComment();
			symbol_524.setBody("A bag is a collection with duplicates allowed. That is, one object can be an element of a bag many times.\nThere is no ordering defined on the elements in a bag.\nBag is itself an instance of the metatype BagType.");
			symbol_23.getOwnedComments().add(symbol_524);
		}
		
		symbol_0.getOwnedTypes().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
		//
		// ocl::Class http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		//
		symbol_36.setName("Class");
		symbol_36.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Class::oclType()
			Operation symbol_525 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class!oclType()
			symbol_525.setName("oclType");
			symbol_525.setType(symbol_212);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_525.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_525.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			{
				Comment symbol_526 = PivotFactory.eINSTANCE.createComment();
				symbol_526.setBody("Evaluates to the type of which self is an instance.");
				symbol_525.getOwnedComments().add(symbol_526);
			}
			
			symbol_36.getOwnedOperations().add(symbol_525);
		}
		
		symbol_0.getOwnedTypes().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		//
		// ocl::ClassClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}
		//
		symbol_37.setName("ClassClassifier");
		symbol_37.setInstanceType(symbol_40);
		symbol_40.setName("T");
		symbol_39.setOwnedParameteredElement(symbol_40);
		symbol_38.getOwnedParameters().add(symbol_39);
		
		symbol_37.setOwnedTemplateSignature(symbol_38);
		symbol_37.getSuperClasses().add(symbol_180); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		
		symbol_0.getOwnedTypes().add(symbol_37); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}
		//
		// ocl::CollectionClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}
		//
		symbol_41.setName("CollectionClassifier");
		symbol_41.setInstanceType(symbol_44);
		symbol_44.setName("T");
		symbol_43.setOwnedParameteredElement(symbol_44);
		symbol_42.getOwnedParameters().add(symbol_43);
		symbol_46.setName("E");
		symbol_45.setOwnedParameteredElement(symbol_46);
		symbol_42.getOwnedParameters().add(symbol_45);
		
		symbol_41.setOwnedTemplateSignature(symbol_42);
		symbol_41.getSuperClasses().add(symbol_181); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		{ // ocl::CollectionClassifier::elementType
			symbol_47.setName("elementType");
			symbol_47.setType(symbol_46);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?E
			
			symbol_47.setIsResolveProxies(true);
			symbol_47.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionClassifierElementTypeProperty");
			symbol_47.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionClassifierElementTypeProperty.INSTANCE);
			{
				Comment symbol_527 = PivotFactory.eINSTANCE.createComment();
				symbol_527.setBody("Evaluates to the type of the collection elements.");
				symbol_47.getOwnedComments().add(symbol_527);
			}
			
			symbol_41.getOwnedAttributes().add(symbol_47);
		}
		
		symbol_0.getOwnedTypes().add(symbol_41); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}
		//
		// ocl::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
		//
		symbol_48.setName("Collection");
		symbol_48.setElementType(symbol_51);
		symbol_51.setName("T");
		symbol_50.setOwnedParameteredElement(symbol_51);
		symbol_49.getOwnedParameters().add(symbol_50);
		
		symbol_48.setOwnedTemplateSignature(symbol_49);
		symbol_48.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Collection::<>()
			Operation symbol_528 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_528.setName("<>");
			symbol_528.setType(symbol_11);  // Boolean
			
			Parameter symbol_529 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_529.setName("object2");
			symbol_529.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_528.getOwnedParameters().add(symbol_529);
			symbol_528.setPrecedence(symbol_6);
			symbol_528.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_528.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_530 = PivotFactory.eINSTANCE.createComment();
				symbol_530.setBody("True if c is not equal to oclText[self].");
				symbol_528.getOwnedComments().add(symbol_530);
			}
			
			symbol_48.getOwnedOperations().add(symbol_528);
		}
		{	// ocl::Collection::=()
			Operation symbol_531 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_531.setName("=");
			symbol_531.setType(symbol_11);  // Boolean
			
			Parameter symbol_532 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_532.setName("object2");
			symbol_532.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_531.getOwnedParameters().add(symbol_532);
			symbol_531.setPrecedence(symbol_6);
			symbol_531.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_531.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_533 = PivotFactory.eINSTANCE.createComment();
				symbol_533.setBody("True if c is a collection of the same kind as oclText[self] and contains the same elements in the same quantities and in the same order,\nin the case of an ordered collection type.");
				symbol_531.getOwnedComments().add(symbol_533);
			}
			
			symbol_48.getOwnedOperations().add(symbol_531);
		}
		{	// ocl::Collection::any()
			Iteration symbol_534 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)
			symbol_534.setName("any");
			symbol_534.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			Parameter symbol_535 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)!i
			symbol_535.setName("i");
			symbol_535.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_534.getOwnedIterators().add(symbol_535);
			Parameter symbol_536 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)!body
			symbol_536.setName("body");
			symbol_536.setType(symbol_143);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_534.getOwnedParameters().add(symbol_536);
			symbol_534.setImplementationClass("org.eclipse.ocl.examples.library.iterator.AnyIteration");
			symbol_534.setImplementation(org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE);
			{
				Comment symbol_537 = PivotFactory.eINSTANCE.createComment();
				symbol_537.setBody("Returns any element in the source collection for which body evaluates to oclText[true].\nIf there is more than one element for which body is oclText[true], one of them is returned.\nThere must be at least one element fulfilling body, otherwise the result of this IteratorExp is oclText[null].");
				symbol_534.getOwnedComments().add(symbol_537);
			}
			
			symbol_48.getOwnedOperations().add(symbol_534);
		}
		{	// ocl::Collection::asBag()
			Operation symbol_538 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asBag()
			symbol_538.setName("asBag");
			symbol_538.setType(symbol_198);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_538.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation");
			symbol_538.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
			{
				Comment symbol_539 = PivotFactory.eINSTANCE.createComment();
				symbol_539.setBody("The Bag that contains all the elements from oclText[self].");
				symbol_538.getOwnedComments().add(symbol_539);
			}
			
			symbol_48.getOwnedOperations().add(symbol_538);
		}
		{	// ocl::Collection::asOrderedSet()
			Operation symbol_540 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asOrderedSet()
			symbol_540.setName("asOrderedSet");
			symbol_540.setType(symbol_252);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_540.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation");
			symbol_540.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
			{
				Comment symbol_541 = PivotFactory.eINSTANCE.createComment();
				symbol_541.setBody("An OrderedSet that contains all the elements from oclText[self], with duplicates removed,\nin an order dependent on the particular concrete collection type.");
				symbol_540.getOwnedComments().add(symbol_541);
			}
			
			symbol_48.getOwnedOperations().add(symbol_540);
		}
		{	// ocl::Collection::asSequence()
			Operation symbol_542 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asSequence()
			symbol_542.setName("asSequence");
			symbol_542.setType(symbol_261);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_542.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation");
			symbol_542.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
			{
				Comment symbol_543 = PivotFactory.eINSTANCE.createComment();
				symbol_543.setBody("Sequence that contains all the elements from oclText[self], in an order dependent on the particular concrete collection type.");
				symbol_542.getOwnedComments().add(symbol_543);
			}
			
			symbol_48.getOwnedOperations().add(symbol_542);
		}
		{	// ocl::Collection::asSet()
			Operation symbol_544 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asSet()
			symbol_544.setName("asSet");
			symbol_544.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_544.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation");
			symbol_544.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
			{
				Comment symbol_545 = PivotFactory.eINSTANCE.createComment();
				symbol_545.setBody("The Set containing all the elements from oclText[self], with duplicates removed.");
				symbol_544.getOwnedComments().add(symbol_545);
			}
			
			symbol_48.getOwnedOperations().add(symbol_544);
		}
		{	// ocl::Collection::collect()
			Iteration symbol_546 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)
			symbol_54.setName("V");
			symbol_53.setOwnedParameteredElement(symbol_54);
			symbol_52.getOwnedParameters().add(symbol_53);
			
			symbol_546.setOwnedTemplateSignature(symbol_52);
			symbol_546.setName("collect");
			symbol_546.setType(symbol_224);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_547 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!i
			symbol_547.setName("i");
			symbol_547.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_546.getOwnedIterators().add(symbol_547);
			Parameter symbol_548 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!body
			symbol_548.setName("body");
			symbol_548.setType(symbol_150);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
			
			
			symbol_546.getOwnedParameters().add(symbol_548);
			symbol_546.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_546.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			{
				Comment symbol_549 = PivotFactory.eINSTANCE.createComment();
				symbol_549.setBody("The Collection of elements that results from applying body to every member of the source set.\nThe result is flattened. Notice that this is based on collectNested, which can be of different type depending on the type of source.\ncollectNested is defined individually for each subclass of CollectionType.");
				symbol_546.getOwnedComments().add(symbol_549);
			}
			
			symbol_48.getOwnedOperations().add(symbol_546);
		}
		{	// ocl::Collection::collectNested()
			Iteration symbol_550 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)
			symbol_57.setName("V");
			symbol_56.setOwnedParameteredElement(symbol_57);
			symbol_55.getOwnedParameters().add(symbol_56);
			
			symbol_550.setOwnedTemplateSignature(symbol_55);
			symbol_550.setName("collectNested");
			symbol_550.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_551 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_551.setName("i");
			symbol_551.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_550.getOwnedIterators().add(symbol_551);
			Parameter symbol_552 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_552.setName("body");
			symbol_552.setType(symbol_149);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
			
			
			symbol_550.getOwnedParameters().add(symbol_552);
			symbol_550.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_550.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			{
				Comment symbol_553 = PivotFactory.eINSTANCE.createComment();
				symbol_553.setBody("The Collection of elements which results from applying body to every member of the source collection.");
				symbol_550.getOwnedComments().add(symbol_553);
			}
			
			symbol_48.getOwnedOperations().add(symbol_550);
		}
		{	// ocl::Collection::count()
			Operation symbol_554 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!count(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_554.setName("count");
			symbol_554.setType(symbol_12);  // Integer
			
			Parameter symbol_555 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!count(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_555.setName("object");
			symbol_555.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_554.getOwnedParameters().add(symbol_555);
			symbol_554.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionCountOperation");
			symbol_554.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE);
			{
				Comment symbol_556 = PivotFactory.eINSTANCE.createComment();
				symbol_556.setBody("The number of times that object occurs in the collection oclText[self].");
				symbol_554.getOwnedComments().add(symbol_556);
			}
			
			symbol_48.getOwnedOperations().add(symbol_554);
		}
		{	// ocl::Collection::excludes()
			Operation symbol_557 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_557.setName("excludes");
			symbol_557.setType(symbol_11);  // Boolean
			
			Parameter symbol_558 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_558.setName("object");
			symbol_558.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_557.getOwnedParameters().add(symbol_558);
			symbol_557.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation");
			symbol_557.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE);
			{
				Comment symbol_559 = PivotFactory.eINSTANCE.createComment();
				symbol_559.setBody("True if object is not an element of oclText[self], oclText[false] otherwise.");
				symbol_557.getOwnedComments().add(symbol_559);
			}
			
			symbol_48.getOwnedOperations().add(symbol_557);
		}
		{	// ocl::Collection::excludesAll()
			Operation symbol_560 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_60.setName("T2");
			symbol_59.setOwnedParameteredElement(symbol_60);
			symbol_58.getOwnedParameters().add(symbol_59);
			
			symbol_560.setOwnedTemplateSignature(symbol_58);
			symbol_560.setName("excludesAll");
			symbol_560.setType(symbol_11);  // Boolean
			
			Parameter symbol_561 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_561.setName("c2");
			symbol_561.setType(symbol_225);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			
			symbol_560.getOwnedParameters().add(symbol_561);
			symbol_560.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation");
			symbol_560.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE);
			{
				Comment symbol_562 = PivotFactory.eINSTANCE.createComment();
				symbol_562.setBody("Does oclText[self] contain none of the elements of c2 ?");
				symbol_560.getOwnedComments().add(symbol_562);
			}
			
			symbol_48.getOwnedOperations().add(symbol_560);
		}
		{	// ocl::Collection::excluding()
			Operation symbol_563 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_563.setName("excluding");
			symbol_563.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_564 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_564.setName("object");
			symbol_564.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_563.getOwnedParameters().add(symbol_564);
			symbol_563.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_563.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_565 = PivotFactory.eINSTANCE.createComment();
				symbol_565.setBody("The collection containing all elements of oclText[self] apart from object.");
				symbol_563.getOwnedComments().add(symbol_565);
			}
			
			symbol_48.getOwnedOperations().add(symbol_563);
		}
		{	// ocl::Collection::exists()
			Iteration symbol_566 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)
			symbol_566.setName("exists");
			symbol_566.setType(symbol_11);  // Boolean
			
			Parameter symbol_567 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)!i
			symbol_567.setName("i");
			symbol_567.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_566.getOwnedIterators().add(symbol_567);
			Parameter symbol_568 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)!body
			symbol_568.setName("body");
			symbol_568.setType(symbol_146);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_566.getOwnedParameters().add(symbol_568);
			symbol_566.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ExistsIteration");
			symbol_566.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			{
				Comment symbol_569 = PivotFactory.eINSTANCE.createComment();
				symbol_569.setBody("Results in oclText[true] if body evaluates to oclText[true] for at least one element in the source collection.");
				symbol_566.getOwnedComments().add(symbol_569);
			}
			
			symbol_48.getOwnedOperations().add(symbol_566);
		}
		{	// ocl::Collection::exists()
			Iteration symbol_570 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)
			symbol_570.setName("exists");
			symbol_570.setType(symbol_11);  // Boolean
			
			Parameter symbol_571 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!i
			symbol_571.setName("i");
			symbol_571.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_570.getOwnedIterators().add(symbol_571);
			Parameter symbol_572 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!j
			symbol_572.setName("j");
			symbol_572.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_570.getOwnedIterators().add(symbol_572);
			Parameter symbol_573 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!body
			symbol_573.setName("body");
			symbol_573.setType(symbol_144);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_570.getOwnedParameters().add(symbol_573);
			symbol_570.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ExistsIteration");
			symbol_570.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			
			symbol_48.getOwnedOperations().add(symbol_570);
		}
		{	// ocl::Collection::flatten()
			Operation symbol_574 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()
			symbol_63.setName("T2");
			symbol_62.setOwnedParameteredElement(symbol_63);
			symbol_61.getOwnedParameters().add(symbol_62);
			
			symbol_574.setOwnedTemplateSignature(symbol_61);
			symbol_574.setName("flatten");
			symbol_574.setType(symbol_226);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
			
			symbol_574.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_574.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			{
				Comment symbol_575 = PivotFactory.eINSTANCE.createComment();
				symbol_575.setBody("If the element type is not a collection type, this results in the same collection as oclText[self].\nIf the element type is a collection type, the result is a collection containing all the elements of all the recursively flattened elements of oclText[self].");
				symbol_574.getOwnedComments().add(symbol_575);
			}
			
			symbol_48.getOwnedOperations().add(symbol_574);
		}
		{	// ocl::Collection::forAll()
			Iteration symbol_576 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)
			symbol_576.setName("forAll");
			symbol_576.setType(symbol_11);  // Boolean
			
			Parameter symbol_577 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)!i
			symbol_577.setName("i");
			symbol_577.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_576.getOwnedIterators().add(symbol_577);
			Parameter symbol_578 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)!body
			symbol_578.setName("body");
			symbol_578.setType(symbol_141);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_576.getOwnedParameters().add(symbol_578);
			symbol_576.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ForAllIteration");
			symbol_576.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			{
				Comment symbol_579 = PivotFactory.eINSTANCE.createComment();
				symbol_579.setBody("Results in oclText[true] if the body expression evaluates to oclText[true] for each element in the source collection; otherwise, result is oclText[false].");
				symbol_576.getOwnedComments().add(symbol_579);
			}
			
			symbol_48.getOwnedOperations().add(symbol_576);
		}
		{	// ocl::Collection::forAll()
			Iteration symbol_580 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)
			symbol_580.setName("forAll");
			symbol_580.setType(symbol_11);  // Boolean
			
			Parameter symbol_581 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!j
			symbol_581.setName("j");
			symbol_581.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_580.getOwnedIterators().add(symbol_581);
			Parameter symbol_582 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!i
			symbol_582.setName("i");
			symbol_582.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_580.getOwnedIterators().add(symbol_582);
			Parameter symbol_583 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!body
			symbol_583.setName("body");
			symbol_583.setType(symbol_148);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_580.getOwnedParameters().add(symbol_583);
			symbol_580.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ForAllIteration");
			symbol_580.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			
			symbol_48.getOwnedOperations().add(symbol_580);
		}
		{	// ocl::Collection::includes()
			Operation symbol_584 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_584.setName("includes");
			symbol_584.setType(symbol_11);  // Boolean
			
			Parameter symbol_585 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_585.setName("object");
			symbol_585.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_584.getOwnedParameters().add(symbol_585);
			symbol_584.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation");
			symbol_584.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE);
			{
				Comment symbol_586 = PivotFactory.eINSTANCE.createComment();
				symbol_586.setBody("True if object is an element of oclText[self], oclText[false] otherwise.");
				symbol_584.getOwnedComments().add(symbol_586);
			}
			
			symbol_48.getOwnedOperations().add(symbol_584);
		}
		{	// ocl::Collection::includesAll()
			Operation symbol_587 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_66.setName("T2");
			symbol_65.setOwnedParameteredElement(symbol_66);
			symbol_64.getOwnedParameters().add(symbol_65);
			
			symbol_587.setOwnedTemplateSignature(symbol_64);
			symbol_587.setName("includesAll");
			symbol_587.setType(symbol_11);  // Boolean
			
			Parameter symbol_588 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_588.setName("c2");
			symbol_588.setType(symbol_227);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			
			symbol_587.getOwnedParameters().add(symbol_588);
			symbol_587.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation");
			symbol_587.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE);
			{
				Comment symbol_589 = PivotFactory.eINSTANCE.createComment();
				symbol_589.setBody("Does oclText[self] contain all the elements of c2 ?");
				symbol_587.getOwnedComments().add(symbol_589);
			}
			
			symbol_48.getOwnedOperations().add(symbol_587);
		}
		{	// ocl::Collection::including()
			Operation symbol_590 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!including(T)
			symbol_590.setName("including");
			symbol_590.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_591 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!including(T)!object
			symbol_591.setName("object");
			symbol_591.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			
			symbol_590.getOwnedParameters().add(symbol_591);
			symbol_590.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_590.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_592 = PivotFactory.eINSTANCE.createComment();
				symbol_592.setBody("The collection containing all elements of oclText[self] plus object.");
				symbol_590.getOwnedComments().add(symbol_592);
			}
			
			symbol_48.getOwnedOperations().add(symbol_590);
		}
		{	// ocl::Collection::isEmpty()
			Operation symbol_593 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isEmpty()
			symbol_593.setName("isEmpty");
			symbol_593.setType(symbol_11);  // Boolean
			
			symbol_593.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation");
			symbol_593.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
			{
				Comment symbol_594 = PivotFactory.eINSTANCE.createComment();
				symbol_594.setBody("Is oclText[self] the empty collection?\n\nNote: oclText[null->isEmpty()] returns oclText[true] in virtue of the implicit casting from oclText[null] to oclText[Bag{}].");
				symbol_593.getOwnedComments().add(symbol_594);
			}
			
			symbol_48.getOwnedOperations().add(symbol_593);
		}
		{	// ocl::Collection::isUnique()
			Iteration symbol_595 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_595.setName("isUnique");
			symbol_595.setType(symbol_11);  // Boolean
			
			Parameter symbol_596 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_596.setName("i");
			symbol_596.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_595.getOwnedIterators().add(symbol_596);
			Parameter symbol_597 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_597.setName("body");
			symbol_597.setType(symbol_153);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_595.getOwnedParameters().add(symbol_597);
			symbol_595.setImplementationClass("org.eclipse.ocl.examples.library.iterator.IsUniqueIteration");
			symbol_595.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			{
				Comment symbol_598 = PivotFactory.eINSTANCE.createComment();
				symbol_598.setBody("Results in oclText[true] if body evaluates to a different value for each element in the source collection; otherwise, result is oclText[false].");
				symbol_595.getOwnedComments().add(symbol_598);
			}
			
			symbol_48.getOwnedOperations().add(symbol_595);
		}
		{	// ocl::Collection::iterate()
			Iteration symbol_599 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)
			symbol_69.setName("Tacc");
			symbol_68.setOwnedParameteredElement(symbol_69);
			symbol_67.getOwnedParameters().add(symbol_68);
			
			symbol_599.setOwnedTemplateSignature(symbol_67);
			symbol_599.setName("iterate");
			symbol_599.setType(symbol_69);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
			
			Parameter symbol_600 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)!i
			symbol_600.setName("i");
			symbol_600.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_599.getOwnedIterators().add(symbol_600);
			Parameter symbol_601 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)!acc
			symbol_601.setName("acc");
			symbol_601.setType(symbol_69); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
			
			symbol_599.getOwnedAccumulators().add(symbol_601);
			Parameter symbol_602 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)!body
			symbol_602.setName("body");
			symbol_602.setType(symbol_151);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
			
			
			symbol_599.getOwnedParameters().add(symbol_602);
			symbol_599.setImplementationClass("org.eclipse.ocl.examples.library.iterator.IterateIteration");
			symbol_599.setImplementation(org.eclipse.ocl.examples.library.iterator.IterateIteration.INSTANCE);
			
			symbol_48.getOwnedOperations().add(symbol_599);
		}
		{	// ocl::Collection::max()
			Operation symbol_603 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!max()
			symbol_603.setName("max");
			symbol_603.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_603.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionMaxOperation");
			symbol_603.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
			{
				Comment symbol_604 = PivotFactory.eINSTANCE.createComment();
				symbol_604.setBody("The element with the maximum value of all elements in oclText[self].\nElements must be of a type supporting the max operation.\nThe max operation - supported by the elements - must take one parameter of type T and be both associative and commutative.\nUnlimitedNatural, Integer and Real fulfill this condition.");
				symbol_603.getOwnedComments().add(symbol_604);
			}
			
			symbol_48.getOwnedOperations().add(symbol_603);
		}
		{	// ocl::Collection::min()
			Operation symbol_605 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!min()
			symbol_605.setName("min");
			symbol_605.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_605.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionMinOperation");
			symbol_605.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
			{
				Comment symbol_606 = PivotFactory.eINSTANCE.createComment();
				symbol_606.setBody("The element with the minimum value of all elements in oclText[self].\nElements must be of a type supporting the min operation.\nThe min operation - supported by the elements - must take one parameter of type T and be both associative and commutative.\nUnlimitedNatural, Integer and Real fulfill this condition.");
				symbol_605.getOwnedComments().add(symbol_606);
			}
			
			symbol_48.getOwnedOperations().add(symbol_605);
		}
		{	// ocl::Collection::notEmpty()
			Operation symbol_607 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!notEmpty()
			symbol_607.setName("notEmpty");
			symbol_607.setType(symbol_11);  // Boolean
			
			symbol_607.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation");
			symbol_607.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
			{
				Comment symbol_608 = PivotFactory.eINSTANCE.createComment();
				symbol_608.setBody("Is oclText[self] not the empty collection?\n\noclText[null->notEmpty()] returns oclText[false] in virtue of the implicit casting from oclText[null] to oclText[Bag{}].");
				symbol_607.getOwnedComments().add(symbol_608);
			}
			
			symbol_48.getOwnedOperations().add(symbol_607);
		}
		{	// ocl::Collection::oclType()
			Operation symbol_609 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!oclType()
			symbol_609.setName("oclType");
			symbol_609.setType(symbol_214);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_609.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_609.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			{
				Comment symbol_610 = PivotFactory.eINSTANCE.createComment();
				symbol_610.setBody("Evaluates to the type of which oclText[self] is an instance.");
				symbol_609.getOwnedComments().add(symbol_610);
			}
			
			symbol_48.getOwnedOperations().add(symbol_609);
		}
		{	// ocl::Collection::one()
			Iteration symbol_611 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)
			symbol_611.setName("one");
			symbol_611.setType(symbol_11);  // Boolean
			
			Parameter symbol_612 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)!i
			symbol_612.setName("i");
			symbol_612.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_611.getOwnedIterators().add(symbol_612);
			Parameter symbol_613 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)!body
			symbol_613.setName("body");
			symbol_613.setType(symbol_142);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_611.getOwnedParameters().add(symbol_613);
			symbol_611.setImplementationClass("org.eclipse.ocl.examples.library.iterator.OneIteration");
			symbol_611.setImplementation(org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE);
			{
				Comment symbol_614 = PivotFactory.eINSTANCE.createComment();
				symbol_614.setBody("Results in oclText[true] if there is exactly one element in the source collection for which body is oclText[true].");
				symbol_611.getOwnedComments().add(symbol_614);
			}
			
			symbol_48.getOwnedOperations().add(symbol_611);
		}
		{	// ocl::Collection::product()
			Operation symbol_615 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_72.setName("T2");
			symbol_71.setOwnedParameteredElement(symbol_72);
			symbol_70.getOwnedParameters().add(symbol_71);
			
			symbol_615.setOwnedTemplateSignature(symbol_70);
			symbol_615.setName("product");
			symbol_615.setType(symbol_271);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
			
			Parameter symbol_616 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_616.setName("c2");
			symbol_616.setType(symbol_228);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			
			symbol_615.getOwnedParameters().add(symbol_616);
			symbol_615.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionProductOperation");
			symbol_615.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE);
			{
				Comment symbol_617 = PivotFactory.eINSTANCE.createComment();
				symbol_617.setBody("The cartesian product operation of oclText[self] and c2.");
				symbol_615.getOwnedComments().add(symbol_617);
			}
			
			symbol_48.getOwnedOperations().add(symbol_615);
		}
		{	// ocl::Collection::reject()
			Iteration symbol_618 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)
			symbol_618.setName("reject");
			symbol_618.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_619 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)!i
			symbol_619.setName("i");
			symbol_619.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_618.getOwnedIterators().add(symbol_619);
			Parameter symbol_620 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)!body
			symbol_620.setName("body");
			symbol_620.setType(symbol_145);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_618.getOwnedParameters().add(symbol_620);
			symbol_618.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_618.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_621 = PivotFactory.eINSTANCE.createComment();
				symbol_621.setBody("The sub-collection of the source collection for which body is oclText[false].");
				symbol_618.getOwnedComments().add(symbol_621);
			}
			
			symbol_48.getOwnedOperations().add(symbol_618);
		}
		{	// ocl::Collection::select()
			Iteration symbol_622 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)
			symbol_622.setName("select");
			symbol_622.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_623 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)!i
			symbol_623.setName("i");
			symbol_623.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_622.getOwnedIterators().add(symbol_623);
			Parameter symbol_624 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)!body
			symbol_624.setName("body");
			symbol_624.setType(symbol_147);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_622.getOwnedParameters().add(symbol_624);
			symbol_622.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_622.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_625 = PivotFactory.eINSTANCE.createComment();
				symbol_625.setBody("The sub-collection of the source collection for which body is oclText[true].");
				symbol_622.getOwnedComments().add(symbol_625);
			}
			
			symbol_48.getOwnedOperations().add(symbol_622);
		}
		{	// ocl::Collection::size()
			Operation symbol_626 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!size()
			symbol_626.setName("size");
			symbol_626.setType(symbol_12);  // Integer
			
			symbol_626.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionSizeOperation");
			symbol_626.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
			{
				Comment symbol_627 = PivotFactory.eINSTANCE.createComment();
				symbol_627.setBody("The number of elements in the collection oclText[self].");
				symbol_626.getOwnedComments().add(symbol_627);
			}
			
			symbol_48.getOwnedOperations().add(symbol_626);
		}
		{	// ocl::Collection::sortedBy()
			Iteration symbol_628 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_628.setName("sortedBy");
			symbol_628.setType(symbol_261);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			Parameter symbol_629 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_629.setName("i");
			symbol_629.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_628.getOwnedIterators().add(symbol_629);
			Parameter symbol_630 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_630.setName("body");
			symbol_630.setType(symbol_152);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_628.getOwnedParameters().add(symbol_630);
			symbol_628.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_628.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_631 = PivotFactory.eINSTANCE.createComment();
				symbol_631.setBody("Results in the Collection containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
				symbol_628.getOwnedComments().add(symbol_631);
			}
			
			symbol_48.getOwnedOperations().add(symbol_628);
		}
		{	// ocl::Collection::sum()
			Operation symbol_632 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sum()
			symbol_632.setName("sum");
			symbol_632.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_632.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionSumOperation");
			symbol_632.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
			{
				Comment symbol_633 = PivotFactory.eINSTANCE.createComment();
				symbol_633.setBody("The addition of all elements in oclText[self].\nElements must be of an oclText[OclSummable] type to provide the zero() and sum() operations.\nThe e[sum] operation must be both associative: a.sum(b).sum(c) = a.sum(b.sum(c)), and commutative: a.sum(b) = b.sum(a).\nUnlimitedNatural, Integer and Real fulfill this condition.\n\nIf the e[sum] operation is not both associative and commutative, the e[sum] expression is not well-formed,\nwhich may result in unpredictable results during evaluation.\nIf an implementation is able to detect a lack of associativity or commutativity,\nthe implementation may bypass the evaluation and return an oclText[invalid] result.");
				symbol_632.getOwnedComments().add(symbol_633);
			}
			
			symbol_48.getOwnedOperations().add(symbol_632);
		}
		{
			Comment symbol_634 = PivotFactory.eINSTANCE.createComment();
			symbol_634.setBody("Collection is the abstract supertype of all collection types in the OCL Standard Library.\nEach occurrence of an object in a collection is called an element.\nIf an object occurs twice in a collection, there are two elements.\n\nThis sub clause defines the properties on Collections that have identical semantics for all collection subtypes.\nSome operations may be defined within the subtype as well,\nwhich means that there is an additional postcondition or a more specialized return value.\nCollection is itself an instance of the metatype CollectionType.\n\nThe definition of several common operations is different for each subtype.\nThese operations are not mentioned in this sub clause.\n\nThe semantics of the collection operations is given in the form of a postcondition that uses the IterateExp of the IteratorExp construct.\nThe semantics of those constructs is defined in Clause 10 (\u00E2\u20AC\u0153Semantics Described using UML\u00E2\u20AC\uFFFD).\nIn several cases the postcondition refers to other collection operations,\nwhich in turn are defined in terms of the IterateExp or IteratorExp constructs.\n\nWell-formedness rules\n\n[1] A collection cannot contain oclText[invalid] values.\n\ncontext Collection\ninv: self->forAll(not oclIsInvalid())");
			symbol_48.getOwnedComments().add(symbol_634);
		}
		
		symbol_0.getOwnedTypes().add(symbol_48); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
		//
		// ocl::Enumeration http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration
		//
		symbol_73.setName("Enumeration");
		symbol_73.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Enumeration::allInstances()
			Operation symbol_635 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration!allInstances()
			symbol_635.setName("allInstances");
			symbol_635.setType(symbol_275);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_635.setIsStatic(true);
			symbol_635.setImplementationClass("org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation");
			symbol_635.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
			{
				Comment symbol_636 = PivotFactory.eINSTANCE.createComment();
				symbol_636.setBody("Return a set of all enumeration values of oclText[self].");
				symbol_635.getOwnedComments().add(symbol_636);
			}
			
			symbol_73.getOwnedOperations().add(symbol_635);
		}
		{	// ocl::Enumeration::oclType()
			Operation symbol_637 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration!oclType()
			symbol_637.setName("oclType");
			symbol_637.setType(symbol_251);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_637.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_637.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			{
				Comment symbol_638 = PivotFactory.eINSTANCE.createComment();
				symbol_638.setBody("Evaluates to the type of which oclText[self] is an instance.");
				symbol_637.getOwnedComments().add(symbol_638);
			}
			
			symbol_73.getOwnedOperations().add(symbol_637);
		}
		{
			Comment symbol_639 = PivotFactory.eINSTANCE.createComment();
			symbol_639.setBody("The Enumeration type is the type of an OrderedSet of EnumerationLiteral.");
			symbol_73.getOwnedComments().add(symbol_639);
		}
		
		symbol_0.getOwnedTypes().add(symbol_73); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration
		//
		// ocl::EnumerationClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}
		//
		symbol_74.setName("EnumerationClassifier");
		symbol_74.setInstanceType(symbol_77);
		symbol_77.setName("T");
		symbol_76.setOwnedParameteredElement(symbol_77);
		symbol_75.getOwnedParameters().add(symbol_76);
		
		symbol_74.setOwnedTemplateSignature(symbol_75);
		symbol_74.getSuperClasses().add(symbol_182); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		{ // ocl::EnumerationClassifier::ownedLiteral
			symbol_78.setName("ownedLiteral");
			symbol_78.setType(symbol_253);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
			
			symbol_78.setIsResolveProxies(true);
			symbol_78.setImplementationClass("org.eclipse.ocl.examples.library.enumeration.EnumerationClassifierOwnedLiteralProperty");
			symbol_78.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationClassifierOwnedLiteralProperty.INSTANCE);
			{
				Comment symbol_640 = PivotFactory.eINSTANCE.createComment();
				symbol_640.setBody("Evaluates to the literals of the enumeration.");
				symbol_78.getOwnedComments().add(symbol_640);
			}
			
			symbol_74.getOwnedAttributes().add(symbol_78);
		}
		{
			Comment symbol_641 = PivotFactory.eINSTANCE.createComment();
			symbol_641.setBody("The standard type EnumerationClassifier represents the metatype of an Enumeration.");
			symbol_74.getOwnedComments().add(symbol_641);
		}
		
		symbol_0.getOwnedTypes().add(symbol_74); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}
		//
		// ocl::EnumerationLiteral http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		//
		symbol_79.setName("EnumerationLiteral");
		symbol_79.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{
			Comment symbol_642 = PivotFactory.eINSTANCE.createComment();
			symbol_642.setBody("The standard type EnumerationLiteral represents a named constant value of an Enumeration.");
			symbol_79.getOwnedComments().add(symbol_642);
		}
		
		symbol_0.getOwnedTypes().add(symbol_79); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		//
		// ocl::OclAny http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_80.setName("OclAny");
		{	// ocl::OclAny::<>()
			Operation symbol_643 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_643.setName("<>");
			symbol_643.setType(symbol_11);  // Boolean
			
			Parameter symbol_644 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_644.setName("object2");
			symbol_644.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_643.getOwnedParameters().add(symbol_644);
			symbol_643.setPrecedence(symbol_6);
			symbol_643.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_643.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_645 = PivotFactory.eINSTANCE.createComment();
				symbol_645.setBody("True if oclText[self] is a different object from object2. Infix operator.");
				symbol_643.getOwnedComments().add(symbol_645);
			}
			
			symbol_80.getOwnedOperations().add(symbol_643);
		}
		{	// ocl::OclAny::=()
			Operation symbol_646 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_646.setName("=");
			symbol_646.setType(symbol_11);  // Boolean
			
			Parameter symbol_647 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_647.setName("object2");
			symbol_647.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_646.getOwnedParameters().add(symbol_647);
			symbol_646.setPrecedence(symbol_6);
			symbol_646.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_646.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_648 = PivotFactory.eINSTANCE.createComment();
				symbol_648.setBody("True if oclText[self] is the same object as object2. Infix operator.");
				symbol_646.getOwnedComments().add(symbol_648);
			}
			
			symbol_80.getOwnedOperations().add(symbol_646);
		}
		{	// ocl::OclAny::oclAsSet()
			Operation symbol_649 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsSet()
			symbol_649.setName("oclAsSet");
			symbol_649.setType(symbol_275);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_649.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation");
			symbol_649.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
			{
				Comment symbol_650 = PivotFactory.eINSTANCE.createComment();
				symbol_650.setBody("Returns a Set with oclText[self] as the sole content, unless oclText[self] is oclText[null] in which case returns an empty set,");
				symbol_649.getOwnedComments().add(symbol_650);
			}
			
			symbol_80.getOwnedOperations().add(symbol_649);
		}
		{	// ocl::OclAny::oclAsType()
			Operation symbol_651 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])
			symbol_83.setName("TT");
			symbol_82.setOwnedParameteredElement(symbol_83);
			symbol_81.getOwnedParameters().add(symbol_82);
			
			symbol_651.setOwnedTemplateSignature(symbol_81);
			symbol_651.setName("oclAsType");
			symbol_651.setType(symbol_83);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT
			
			Parameter symbol_652 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])!type
			symbol_652.setName("type");
			symbol_652.setType(symbol_183);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
			
			
			symbol_651.getOwnedParameters().add(symbol_652);
			symbol_651.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation");
			symbol_651.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE);
			{
				Comment symbol_653 = PivotFactory.eINSTANCE.createComment();
				symbol_653.setBody("Evaluates to oclText[self], where oclText[self] is of the type identified by T.\nThe type T may be any classifier defined in the UML model;\nif the actual type of oclText[self] at evaluation time does not conform to T,\nthen the oclAsType operation evaluates to oclText[invalid].\n\nIn the case of feature redefinition, casting an object to a supertype of its actual type\ndoes not access the supertype\u00E2\u20AC\u2122s definition of the feature;\naccording to the semantics of redefinition, the redefined feature simply does not exist for the object.\nHowever, when casting to a supertype, any features additionally defined by the subtype are suppressed.");
				symbol_651.getOwnedComments().add(symbol_653);
			}
			
			symbol_80.getOwnedOperations().add(symbol_651);
		}
		{	// ocl::OclAny::oclIsInState()
			Operation symbol_654 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInState(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState)
			symbol_654.setName("oclIsInState");
			symbol_654.setType(symbol_11);  // Boolean
			
			Parameter symbol_655 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInState(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState)!statespec
			symbol_655.setName("statespec");
			symbol_655.setType(symbol_97);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
			
			
			symbol_654.getOwnedParameters().add(symbol_655);
			symbol_654.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation");
			symbol_654.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE);
			{
				Comment symbol_656 = PivotFactory.eINSTANCE.createComment();
				symbol_656.setBody("Evaluates to oclText[true] if the oclText[self] is in the state indentified by statespec.");
				symbol_654.getOwnedComments().add(symbol_656);
			}
			
			symbol_80.getOwnedOperations().add(symbol_654);
		}
		{	// ocl::OclAny::oclIsInvalid()
			Operation symbol_657 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInvalid()
			symbol_657.setName("oclIsInvalid");
			symbol_657.setType(symbol_11);  // Boolean
			
			symbol_657.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation");
			symbol_657.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
			{
				Comment symbol_658 = PivotFactory.eINSTANCE.createComment();
				symbol_658.setBody("Evaluates to oclText[true] if the oclText[self] is equal to OclInvalid.");
				symbol_657.getOwnedComments().add(symbol_658);
			}
			
			symbol_80.getOwnedOperations().add(symbol_657);
		}
		{	// ocl::OclAny::oclIsKindOf()
			Operation symbol_659 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])
			symbol_86.setName("T");
			symbol_85.setOwnedParameteredElement(symbol_86);
			symbol_84.getOwnedParameters().add(symbol_85);
			
			symbol_659.setOwnedTemplateSignature(symbol_84);
			symbol_659.setName("oclIsKindOf");
			symbol_659.setType(symbol_11);  // Boolean
			
			Parameter symbol_660 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])!type
			symbol_660.setName("type");
			symbol_660.setType(symbol_184);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
			
			
			symbol_659.getOwnedParameters().add(symbol_660);
			symbol_659.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation");
			symbol_659.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
			{
				Comment symbol_661 = PivotFactory.eINSTANCE.createComment();
				symbol_661.setBody("Evaluates to oclText[true] if the type of oclText[self] conforms to t.\nThat is, oclText[self] is of type t or a subtype of t.");
				symbol_659.getOwnedComments().add(symbol_661);
			}
			
			symbol_80.getOwnedOperations().add(symbol_659);
		}
		{	// ocl::OclAny::oclIsNew()
			Operation symbol_662 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsNew()
			symbol_662.setName("oclIsNew");
			symbol_662.setType(symbol_11);  // Boolean
			
			symbol_662.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_662.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_663 = PivotFactory.eINSTANCE.createComment();
				symbol_663.setBody("Can only be used in a postcondition.\nEvaluates to oclText[true] if the oclText[self] is created during performing the operation (for instance, it didn\u00E2\u20AC\u2122t exist at precondition time).");
				symbol_662.getOwnedComments().add(symbol_663);
			}
			
			symbol_80.getOwnedOperations().add(symbol_662);
		}
		{	// ocl::OclAny::oclIsTypeOf()
			Operation symbol_664 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])
			symbol_89.setName("T");
			symbol_88.setOwnedParameteredElement(symbol_89);
			symbol_87.getOwnedParameters().add(symbol_88);
			
			symbol_664.setOwnedTemplateSignature(symbol_87);
			symbol_664.setName("oclIsTypeOf");
			symbol_664.setType(symbol_11);  // Boolean
			
			Parameter symbol_665 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])!type
			symbol_665.setName("type");
			symbol_665.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
			
			
			symbol_664.getOwnedParameters().add(symbol_665);
			symbol_664.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation");
			symbol_664.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
			{
				Comment symbol_666 = PivotFactory.eINSTANCE.createComment();
				symbol_666.setBody("Evaluates to oclText[true] if oclText[self] is of the type t but not a subtype of t");
				symbol_664.getOwnedComments().add(symbol_666);
			}
			
			symbol_80.getOwnedOperations().add(symbol_664);
		}
		{	// ocl::OclAny::oclIsUndefined()
			Operation symbol_667 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsUndefined()
			symbol_667.setName("oclIsUndefined");
			symbol_667.setType(symbol_11);  // Boolean
			
			symbol_667.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation");
			symbol_667.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
			{
				Comment symbol_668 = PivotFactory.eINSTANCE.createComment();
				symbol_668.setBody("Evaluates to oclText[true] if the oclText[self] is equal to oclText[invalid] or equal to oclText[null].");
				symbol_667.getOwnedComments().add(symbol_668);
			}
			
			symbol_80.getOwnedOperations().add(symbol_667);
		}
		{	// ocl::OclAny::oclType()
			Operation symbol_669 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclType()
			symbol_669.setName("oclType");
			symbol_669.setType(symbol_188);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_669.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_669.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			{
				Comment symbol_670 = PivotFactory.eINSTANCE.createComment();
				symbol_670.setBody("Evaluates to the type of which oclText[self] is an instance.");
				symbol_669.getOwnedComments().add(symbol_670);
			}
			
			symbol_80.getOwnedOperations().add(symbol_669);
		}
		{
			Comment symbol_671 = PivotFactory.eINSTANCE.createComment();
			symbol_671.setBody("All types in the UML model and the primitive and collection types in the OCL standard library conforms to the type OclAny.\nConceptually, OclAny behaves as a supertype for all the types.\nFeatures of OclAny are available on each object in all OCL expressions.\nOclAny is itself an instance of the metatype AnyType.\n\nAll classes in a UML model inherit all operations defined on OclAny.\nTo avoid name conflicts between properties in the model and the properties inherited from OclAny,\nall names on the properties of OclAny start with \u00E2\u20AC\u02DCocl.\u00E2\u20AC\u2122\nAlthough theoretically there may still be name conflicts, they can be avoided.\nOne can also use qualification by OclAny (name of the type) to explicitly refer to the OclAny properties.\n\nOperations of OclAny, where the instance of OclAny is called object.");
			symbol_80.getOwnedComments().add(symbol_671);
		}
		
		symbol_0.getOwnedTypes().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::OclComparable http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		//
		symbol_90.setName("OclComparable");
		symbol_90.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclComparable::compareTo()
			Operation symbol_672 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_672.setName("compareTo");
			symbol_672.setType(symbol_12);  // Integer
			
			Parameter symbol_673 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_673.setName("that");
			symbol_673.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_672.getOwnedParameters().add(symbol_673);
			{
				Comment symbol_674 = PivotFactory.eINSTANCE.createComment();
				symbol_674.setBody("Return -ve, 0, +ve according to whether self is less than, equal to , or greater than that.\n\nThe compareTo operation should be commutative.");
				symbol_672.getOwnedComments().add(symbol_674);
			}
			
			symbol_90.getOwnedOperations().add(symbol_672);
		}
		{
			Comment symbol_675 = PivotFactory.eINSTANCE.createComment();
			symbol_675.setBody("The type OclComparable defines the compareTo operation used by the sortedBy iteration. Only types that provide a derived\ncompareTo implementation may be sorted.");
			symbol_90.getOwnedComments().add(symbol_675);
		}
		
		symbol_0.getOwnedTypes().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		//
		// ocl::OclElement http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		//
		symbol_91.setName("OclElement");
		symbol_91.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclElement::allInstances()
			Operation symbol_676 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!allInstances()
			symbol_676.setName("allInstances");
			symbol_676.setType(symbol_275);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_676.setIsStatic(true);
			symbol_676.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation");
			symbol_676.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
			{
				Comment symbol_677 = PivotFactory.eINSTANCE.createComment();
				symbol_677.setBody("Return a set of all instances of the type and derived types of self.");
				symbol_676.getOwnedComments().add(symbol_677);
			}
			
			symbol_91.getOwnedOperations().add(symbol_676);
		}
		{	// ocl::OclElement::oclContainer()
			Operation symbol_678 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer()
			symbol_678.setName("oclContainer");
			symbol_678.setType(symbol_91);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
			
			symbol_678.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation");
			symbol_678.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation.INSTANCE);
			{
				Comment symbol_679 = PivotFactory.eINSTANCE.createComment();
				symbol_679.setBody("Returns the object for which self is a composed content or null if there is no such object.");
				symbol_678.getOwnedComments().add(symbol_679);
			}
			
			symbol_91.getOwnedOperations().add(symbol_678);
		}
		{	// ocl::OclElement::oclContents()
			Operation symbol_680 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents()
			symbol_680.setName("oclContents");
			symbol_680.setType(symbol_274);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
			
			symbol_680.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation");
			symbol_680.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation.INSTANCE);
			{
				Comment symbol_681 = PivotFactory.eINSTANCE.createComment();
				symbol_681.setBody("Returns the composed contents of self.");
				symbol_680.getOwnedComments().add(symbol_681);
			}
			
			symbol_91.getOwnedOperations().add(symbol_680);
		}
		{
			Comment symbol_682 = PivotFactory.eINSTANCE.createComment();
			symbol_682.setBody("The type OclElement is the implicit supertype of any user-defined type that has no explicit supertypes. Operations defined\nfor OclElement are therefore applicable to all user-defined types.");
			symbol_91.getOwnedComments().add(symbol_682);
		}
		
		symbol_0.getOwnedTypes().add(symbol_91); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		//
		// ocl::OclInvalid http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
		//
		symbol_92.setName("OclInvalid");
		symbol_92.getSuperClasses().add(symbol_101); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		{ // ocl::OclInvalid::oclBadProperty
			symbol_93.setName("oclBadProperty");
			symbol_93.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
			
			symbol_93.setIsResolveProxies(true);
			
			symbol_92.getOwnedAttributes().add(symbol_93);
		}
		{	// ocl::OclInvalid::<>()
			Operation symbol_683 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_683.setName("<>");
			symbol_683.setType(symbol_11);  // Boolean
			
			Parameter symbol_684 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_684.setName("object2");
			symbol_684.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_683.getOwnedParameters().add(symbol_684);
			symbol_683.setPrecedence(symbol_6);
			symbol_683.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_683.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_685 = PivotFactory.eINSTANCE.createComment();
				symbol_685.setBody("Returns oclText[invalid].");
				symbol_683.getOwnedComments().add(symbol_685);
			}
			
			symbol_92.getOwnedOperations().add(symbol_683);
		}
		{	// ocl::OclInvalid::=()
			Operation symbol_686 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_686.setName("=");
			symbol_686.setType(symbol_11);  // Boolean
			
			Parameter symbol_687 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_687.setName("object2");
			symbol_687.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_686.getOwnedParameters().add(symbol_687);
			symbol_686.setPrecedence(symbol_6);
			symbol_686.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_686.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_688 = PivotFactory.eINSTANCE.createComment();
				symbol_688.setBody("Returns oclText[invalid].");
				symbol_686.getOwnedComments().add(symbol_688);
			}
			
			symbol_92.getOwnedOperations().add(symbol_686);
		}
		{	// ocl::OclInvalid::allInstances()
			Operation symbol_689 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!allInstances()
			symbol_689.setName("allInstances");
			symbol_689.setType(symbol_275);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_689.setIsStatic(true);
			symbol_689.setImplementationClass("org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation");
			symbol_689.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
			{
				Comment symbol_690 = PivotFactory.eINSTANCE.createComment();
				symbol_690.setBody("Returns oclText[invalid].");
				symbol_689.getOwnedComments().add(symbol_690);
			}
			
			symbol_92.getOwnedOperations().add(symbol_689);
		}
		{	// ocl::OclInvalid::oclBadOperation()
			Operation symbol_691 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!oclBadOperation()
			symbol_691.setName("oclBadOperation");
			symbol_691.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
			
			
			symbol_92.getOwnedOperations().add(symbol_691);
		}
		{	// ocl::OclInvalid::toString()
			Operation symbol_692 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!toString()
			symbol_692.setName("toString");
			symbol_692.setType(symbol_14);  // String
			
			symbol_692.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_692.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_693 = PivotFactory.eINSTANCE.createComment();
				symbol_693.setBody("Returns \'invalid\'.");
				symbol_692.getOwnedComments().add(symbol_693);
			}
			
			symbol_92.getOwnedOperations().add(symbol_692);
		}
		{
			Comment symbol_694 = PivotFactory.eINSTANCE.createComment();
			symbol_694.setBody("The type OclInvalid is a type that conforms to all other types.\nIt has one single instance, identified as  oclText[invalid].\nAny property call applied on invalid results in oclText[invalid], except for the operations oclIsUndefined() and oclIsInvalid().\nOclInvalid is itself an instance of the metatype InvalidType.");
			symbol_92.getOwnedComments().add(symbol_694);
		}
		
		symbol_0.getOwnedTypes().add(symbol_92); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
		//
		// ocl::OclLambda http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		//
		symbol_94.setName("OclLambda");
		symbol_94.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{
			Comment symbol_695 = PivotFactory.eINSTANCE.createComment();
			symbol_695.setBody("The type OclLambda is the implicit supertype of all Lambda types. The operations defined for OclLambda\ntherefore apply to all lambda expressions.");
			symbol_94.getOwnedComments().add(symbol_695);
		}
		
		symbol_0.getOwnedTypes().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		//
		// ocl::OclMessage http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		//
		symbol_95.setName("OclMessage");
		symbol_95.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclMessage::hasReturned()
			Operation symbol_696 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!hasReturned()
			symbol_696.setName("hasReturned");
			symbol_696.setType(symbol_11);  // Boolean
			
			symbol_696.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_696.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_697 = PivotFactory.eINSTANCE.createComment();
				symbol_697.setBody("True if type of template parameter is an operation call, and the called operation has returned a value.\nThis implies the fact that the message has been sent. False in all other cases.");
				symbol_696.getOwnedComments().add(symbol_697);
			}
			
			symbol_95.getOwnedOperations().add(symbol_696);
		}
		{	// ocl::OclMessage::isOperationCall()
			Operation symbol_698 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!isOperationCall()
			symbol_698.setName("isOperationCall");
			symbol_698.setType(symbol_11);  // Boolean
			
			symbol_698.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_698.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_699 = PivotFactory.eINSTANCE.createComment();
				symbol_699.setBody("Returns oclText[true] if the OclMessage represents the sending of a UML Operation call.");
				symbol_698.getOwnedComments().add(symbol_699);
			}
			
			symbol_95.getOwnedOperations().add(symbol_698);
		}
		{	// ocl::OclMessage::isSignalSent()
			Operation symbol_700 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!isSignalSent()
			symbol_700.setName("isSignalSent");
			symbol_700.setType(symbol_11);  // Boolean
			
			symbol_700.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_700.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_701 = PivotFactory.eINSTANCE.createComment();
				symbol_701.setBody("Returns oclText[true] if the OclMessage represents the sending of a UML Signal.");
				symbol_700.getOwnedComments().add(symbol_701);
			}
			
			symbol_95.getOwnedOperations().add(symbol_700);
		}
		{	// ocl::OclMessage::result()
			Operation symbol_702 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!result()
			symbol_702.setName("result");
			symbol_702.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_702.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_702.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_703 = PivotFactory.eINSTANCE.createComment();
				symbol_703.setBody("Returns the result of the called operation, if type of template parameter is an operation call,\nand the called operation has returned a value. Otherwise the oclText[invalid] value is returned.");
				symbol_702.getOwnedComments().add(symbol_703);
			}
			
			symbol_95.getOwnedOperations().add(symbol_702);
		}
		{
			Comment symbol_704 = PivotFactory.eINSTANCE.createComment();
			symbol_704.setBody("OclMessage\nThis sub clause contains the definition of the standard type OclMessage.\nAs defined in this sub clause, each ocl message type is actually a template type with one parameter.\n\u00E2\u20AC\u02DCT\u00E2\u20AC\u2122 denotes the parameter.\nA concrete ocl message type is created by substituting an operation or signal for the T.\n\nThe predefined type OclMessage is an instance of MessageType.\nEvery OclMessage is fully determined by either the operation, or signal given as parameter.\nNote that there is conceptually an undefined (infinite) number of these types,\nas each is determined by a different operation or signal.\nThese types are unnamed. Every type has as attributes the name of the operation or signal,\nand either all formal parameters of the operation, or all attributes of the signal.\nOclMessage is itself an instance of the metatype MessageType.\n\nOclMessage has a number of predefined operations, as shown in the OCL Standard Library.");
			symbol_95.getOwnedComments().add(symbol_704);
		}
		
		symbol_0.getOwnedTypes().add(symbol_95); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		//
		// ocl::OclSelf http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
		//
		symbol_96.setName("OclSelf");
		symbol_96.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{
			Comment symbol_705 = PivotFactory.eINSTANCE.createComment();
			symbol_705.setBody("The pseudo-type OclSelf denotes the statically determinate type of oclText[self] in Operation\nand Iteration signatures. Instances of OclSelf are never created.");
			symbol_96.getOwnedComments().add(symbol_705);
		}
		
		symbol_0.getOwnedTypes().add(symbol_96); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
		//
		// ocl::OclState http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
		//
		symbol_97.setName("OclState");
		symbol_97.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_0.getOwnedTypes().add(symbol_97); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
		//
		// ocl::OclSummable http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		//
		symbol_98.setName("OclSummable");
		symbol_98.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclSummable::sum()
			Operation symbol_706 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable!sum(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_706.setName("sum");
			symbol_706.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			Parameter symbol_707 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable!sum(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_707.setName("that");
			symbol_707.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_706.getOwnedParameters().add(symbol_707);
			{
				Comment symbol_708 = PivotFactory.eINSTANCE.createComment();
				symbol_708.setBody("Return the sum of self and that.\n\nThe sum operation should be associative.");
				symbol_706.getOwnedComments().add(symbol_708);
			}
			
			symbol_98.getOwnedOperations().add(symbol_706);
		}
		{	// ocl::OclSummable::zero()
			Operation symbol_709 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable!zero()
			symbol_709.setName("zero");
			symbol_709.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			{
				Comment symbol_710 = PivotFactory.eINSTANCE.createComment();
				symbol_710.setBody("Return the \'zero\' value of self to initialize a summation.\n\nzero().sum(self) = self.");
				symbol_709.getOwnedComments().add(symbol_710);
			}
			
			symbol_98.getOwnedOperations().add(symbol_709);
		}
		{
			Comment symbol_711 = PivotFactory.eINSTANCE.createComment();
			symbol_711.setBody("The type OclSummable defines the sum and zero operations used by the Collection::sum iteration. Only types that provide derived\nsum and zero implementations may be summed.");
			symbol_98.getOwnedComments().add(symbol_711);
		}
		
		symbol_0.getOwnedTypes().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		//
		// ocl::OclTuple http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		//
		symbol_99.setName("OclTuple");
		symbol_99.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclTuple::<>()
			Operation symbol_712 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_712.setName("<>");
			symbol_712.setType(symbol_11);  // Boolean
			
			Parameter symbol_713 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_713.setName("object2");
			symbol_713.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_712.getOwnedParameters().add(symbol_713);
			symbol_712.setPrecedence(symbol_6);
			symbol_712.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_712.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_99.getOwnedOperations().add(symbol_712);
		}
		{	// ocl::OclTuple::=()
			Operation symbol_714 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_714.setName("=");
			symbol_714.setType(symbol_11);  // Boolean
			
			Parameter symbol_715 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_715.setName("object2");
			symbol_715.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_714.getOwnedParameters().add(symbol_715);
			symbol_714.setPrecedence(symbol_6);
			symbol_714.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_714.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			
			symbol_99.getOwnedOperations().add(symbol_714);
		}
		{
			Comment symbol_716 = PivotFactory.eINSTANCE.createComment();
			symbol_716.setBody("The type OclTuple is the implicit supertype of all Tuple types. The operations defined for OclTuple\ntherefore apply to all tuples.");
			symbol_99.getOwnedComments().add(symbol_716);
		}
		
		symbol_0.getOwnedTypes().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		//
		// ocl::OclType http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		//
		symbol_100.setName("OclType");
		symbol_100.getSuperClasses().add(symbol_91); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		{	// ocl::OclType::conformsTo()
			Operation symbol_717 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType!conformsTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType)
			symbol_717.setName("conformsTo");
			symbol_717.setType(symbol_11);  // Boolean
			
			Parameter symbol_718 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType!conformsTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType)!type2
			symbol_718.setName("type2");
			symbol_718.setType(symbol_100);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
			
			
			symbol_717.getOwnedParameters().add(symbol_718);
			symbol_717.setImplementationClass("org.eclipse.ocl.examples.library.classifier.OclTypeConformsToOperation");
			symbol_717.setImplementation(org.eclipse.ocl.examples.library.classifier.OclTypeConformsToOperation.INSTANCE);
			{
				Comment symbol_719 = PivotFactory.eINSTANCE.createComment();
				symbol_719.setBody("Returns true if type2 conforms to self.");
				symbol_717.getOwnedComments().add(symbol_719);
			}
			
			symbol_100.getOwnedOperations().add(symbol_717);
		}
		{
			Comment symbol_720 = PivotFactory.eINSTANCE.createComment();
			symbol_720.setBody("The type OclType is the implicit supertype of any UML type. Operations defined\nfor OclType are therefore applicable to all UML types.");
			symbol_100.getOwnedComments().add(symbol_720);
		}
		
		symbol_0.getOwnedTypes().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		//
		// ocl::OclVoid http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		//
		symbol_101.setName("OclVoid");
		symbol_101.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclVoid::<>()
			Operation symbol_721 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_721.setName("<>");
			symbol_721.setType(symbol_11);  // Boolean
			
			Parameter symbol_722 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_722.setName("object2");
			symbol_722.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_721.getOwnedParameters().add(symbol_722);
			symbol_721.setPrecedence(symbol_6);
			symbol_721.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_721.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_101.getOwnedOperations().add(symbol_721);
		}
		{	// ocl::OclVoid::=()
			Operation symbol_723 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_723.setName("=");
			symbol_723.setType(symbol_11);  // Boolean
			
			Parameter symbol_724 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_724.setName("object2");
			symbol_724.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_723.getOwnedParameters().add(symbol_724);
			symbol_723.setPrecedence(symbol_6);
			symbol_723.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_723.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_725 = PivotFactory.eINSTANCE.createComment();
				symbol_725.setBody("Redefines the OclAny operation, returning oclText[true] if object is oclText[null], oclText[invalid]\nif object is oclText[invalid], oclText[false] otherwise.");
				symbol_723.getOwnedComments().add(symbol_725);
			}
			
			symbol_101.getOwnedOperations().add(symbol_723);
		}
		{	// ocl::OclVoid::allInstances()
			Operation symbol_726 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!allInstances()
			symbol_726.setName("allInstances");
			symbol_726.setType(symbol_275);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_726.setIsStatic(true);
			symbol_726.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation");
			symbol_726.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
			{
				Comment symbol_727 = PivotFactory.eINSTANCE.createComment();
				symbol_727.setBody("Returns oclText[Set{null}].");
				symbol_726.getOwnedComments().add(symbol_727);
			}
			
			symbol_101.getOwnedOperations().add(symbol_726);
		}
		{	// ocl::OclVoid::and()
			Operation symbol_728 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!and(Boolean)
			symbol_728.setName("and");
			symbol_728.setType(symbol_11);  // Boolean
			
			Parameter symbol_729 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!and(Boolean)!b
			symbol_729.setName("b");
			symbol_729.setType(symbol_11);  // Boolean
			
			
			symbol_728.getOwnedParameters().add(symbol_729);
			symbol_728.setPrecedence(symbol_7);
			symbol_728.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation");
			symbol_728.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE);
			
			symbol_101.getOwnedOperations().add(symbol_728);
		}
		{	// ocl::OclVoid::implies()
			Operation symbol_730 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!implies(Boolean)
			symbol_730.setName("implies");
			symbol_730.setType(symbol_11);  // Boolean
			
			Parameter symbol_731 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!implies(Boolean)!b
			symbol_731.setName("b");
			symbol_731.setType(symbol_11);  // Boolean
			
			
			symbol_730.getOwnedParameters().add(symbol_731);
			symbol_730.setPrecedence(symbol_10);
			symbol_730.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation");
			symbol_730.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE);
			
			symbol_101.getOwnedOperations().add(symbol_730);
		}
		{	// ocl::OclVoid::or()
			Operation symbol_732 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!or(Boolean)
			symbol_732.setName("or");
			symbol_732.setType(symbol_11);  // Boolean
			
			Parameter symbol_733 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!or(Boolean)!b
			symbol_733.setName("b");
			symbol_733.setType(symbol_11);  // Boolean
			
			
			symbol_732.getOwnedParameters().add(symbol_733);
			symbol_732.setPrecedence(symbol_8);
			symbol_732.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation");
			symbol_732.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE);
			
			symbol_101.getOwnedOperations().add(symbol_732);
		}
		{	// ocl::OclVoid::toString()
			Operation symbol_734 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!toString()
			symbol_734.setName("toString");
			symbol_734.setType(symbol_14);  // String
			
			symbol_734.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_734.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_735 = PivotFactory.eINSTANCE.createComment();
				symbol_735.setBody("Returns oclText[null].");
				symbol_734.getOwnedComments().add(symbol_735);
			}
			
			symbol_101.getOwnedOperations().add(symbol_734);
		}
		{
			Comment symbol_736 = PivotFactory.eINSTANCE.createComment();
			symbol_736.setBody("The type OclVoid is a type that conforms to all other types except OclInvalid.\nIt has one single instance, identified as oclText[null], that corresponds with the UML LiteralNull value specification.\nAny property call applied on oclText[null] results in oclText[invalid], except for the\noclIsUndefined(), oclIsInvalid(), =(OclAny) and <>(OclAny) operations.\nHowever, by virtue of the implicit conversion to a collection literal,\nan expression evaluating to oclText[null] can be used as source of collection operations (such as \u00E2\u20AC\u02DCisEmpty\u00E2\u20AC\u2122).\nIf the source is the oclText[null] literal, it is implicitly converted to Bag{}.\n\nOclVoid is itself an instance of the metatype VoidType.");
			symbol_101.getOwnedComments().add(symbol_736);
		}
		
		symbol_0.getOwnedTypes().add(symbol_101); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		//
		// ocl::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
		//
		symbol_102.setName("OrderedSet");
		symbol_102.setElementType(symbol_105);
		symbol_105.setName("T");
		symbol_104.setOwnedParameteredElement(symbol_105);
		symbol_103.getOwnedParameters().add(symbol_104);
		
		symbol_102.setOwnedTemplateSignature(symbol_103);
		symbol_102.getSuperClasses().add(symbol_264); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_102.getSuperClasses().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		{	// ocl::OrderedSet::-()
			Operation symbol_737 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_737.setName("-");
			symbol_737.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_738 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_738.setName("s");
			symbol_738.setType(symbol_287);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			
			symbol_737.getOwnedParameters().add(symbol_738);
			symbol_737.setPrecedence(symbol_4);
			symbol_737.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_737.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			{
				Comment symbol_739 = PivotFactory.eINSTANCE.createComment();
				symbol_739.setBody("The elements of oclText[self], which are not in s.");
				symbol_737.getOwnedComments().add(symbol_739);
			}
			
			symbol_102.getOwnedOperations().add(symbol_737);
		}
		{	// ocl::OrderedSet::<>()
			Operation symbol_740 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_740.setName("<>");
			symbol_740.setType(symbol_11);  // Boolean
			
			Parameter symbol_741 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_741.setName("object2");
			symbol_741.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_740.getOwnedParameters().add(symbol_741);
			symbol_740.setPrecedence(symbol_6);
			symbol_740.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_740.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_102.getOwnedOperations().add(symbol_740);
		}
		{	// ocl::OrderedSet::=()
			Operation symbol_742 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_742.setName("=");
			symbol_742.setType(symbol_11);  // Boolean
			
			Parameter symbol_743 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_743.setName("object2");
			symbol_743.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_742.getOwnedParameters().add(symbol_743);
			symbol_742.setPrecedence(symbol_6);
			symbol_742.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_742.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			
			symbol_102.getOwnedOperations().add(symbol_742);
		}
		{	// ocl::OrderedSet::append()
			Operation symbol_744 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!append(T)
			symbol_744.setName("append");
			symbol_744.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_745 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!append(T)!object
			symbol_745.setName("object");
			symbol_745.setType(symbol_105);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			
			symbol_744.getOwnedParameters().add(symbol_745);
			symbol_744.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation");
			symbol_744.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			{
				Comment symbol_746 = PivotFactory.eINSTANCE.createComment();
				symbol_746.setBody("The set of elements, consisting of all elements of oclText[self], followed by object.");
				symbol_744.getOwnedComments().add(symbol_746);
			}
			
			symbol_102.getOwnedOperations().add(symbol_744);
		}
		{	// ocl::OrderedSet::excluding()
			Operation symbol_747 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_747.setName("excluding");
			symbol_747.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_748 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_748.setName("object");
			symbol_748.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_747.getOwnedParameters().add(symbol_748);
			symbol_747.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_747.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_749 = PivotFactory.eINSTANCE.createComment();
				symbol_749.setBody("The ordered set  containing all elements of oclText[self] apart from object.\n\nThe order of the remaining elements is not changed.");
				symbol_747.getOwnedComments().add(symbol_749);
			}
			
			symbol_102.getOwnedOperations().add(symbol_747);
		}
		{	// ocl::OrderedSet::flatten()
			Operation symbol_750 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()
			symbol_108.setName("T2");
			symbol_107.setOwnedParameteredElement(symbol_108);
			symbol_106.getOwnedParameters().add(symbol_107);
			
			symbol_750.setOwnedTemplateSignature(symbol_106);
			symbol_750.setName("flatten");
			symbol_750.setType(symbol_254);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
			
			symbol_750.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_750.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			
			symbol_102.getOwnedOperations().add(symbol_750);
		}
		{	// ocl::OrderedSet::including()
			Operation symbol_751 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!including(T)
			symbol_751.setName("including");
			symbol_751.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_752 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!including(T)!object
			symbol_752.setName("object");
			symbol_752.setType(symbol_105);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			
			symbol_751.getOwnedParameters().add(symbol_752);
			symbol_751.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_751.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_753 = PivotFactory.eINSTANCE.createComment();
				symbol_753.setBody("The ordered set containing all elements of oclText[self] plus object added as the last element if not already present.");
				symbol_751.getOwnedComments().add(symbol_753);
			}
			
			symbol_102.getOwnedOperations().add(symbol_751);
		}
		{	// ocl::OrderedSet::insertAt()
			Operation symbol_754 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)
			symbol_754.setName("insertAt");
			symbol_754.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_755 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)!index
			symbol_755.setName("index");
			symbol_755.setType(symbol_12);  // Integer
			
			
			symbol_754.getOwnedParameters().add(symbol_755);
			Parameter symbol_756 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)!object
			symbol_756.setName("object");
			symbol_756.setType(symbol_105);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			
			symbol_754.getOwnedParameters().add(symbol_756);
			symbol_754.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation");
			symbol_754.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			{
				Comment symbol_757 = PivotFactory.eINSTANCE.createComment();
				symbol_757.setBody("The ordered set consisting of oclText[self] with object present at position index.");
				symbol_754.getOwnedComments().add(symbol_757);
			}
			
			symbol_102.getOwnedOperations().add(symbol_754);
		}
		{	// ocl::OrderedSet::intersection()
			Operation symbol_758 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_758.setName("intersection");
			symbol_758.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_759 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!o
			symbol_759.setName("o");
			symbol_759.setType(symbol_276);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
			
			
			symbol_758.getOwnedParameters().add(symbol_759);
			symbol_758.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_758.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			
			symbol_102.getOwnedOperations().add(symbol_758);
		}
		{	// ocl::OrderedSet::prepend()
			Operation symbol_760 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!prepend(T)
			symbol_760.setName("prepend");
			symbol_760.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_761 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!prepend(T)!object
			symbol_761.setName("object");
			symbol_761.setType(symbol_105);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			
			symbol_760.getOwnedParameters().add(symbol_761);
			symbol_760.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation");
			symbol_760.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			{
				Comment symbol_762 = PivotFactory.eINSTANCE.createComment();
				symbol_762.setBody("The sequence consisting of object, followed by all elements in oclText[self].");
				symbol_760.getOwnedComments().add(symbol_762);
			}
			
			symbol_102.getOwnedOperations().add(symbol_760);
		}
		{	// ocl::OrderedSet::reject()
			Iteration symbol_763 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)
			symbol_763.setName("reject");
			symbol_763.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_764 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)!i
			symbol_764.setName("i");
			symbol_764.setType(symbol_105); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_763.getOwnedIterators().add(symbol_764);
			Parameter symbol_765 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)!body
			symbol_765.setName("body");
			symbol_765.setType(symbol_154);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
			
			
			symbol_763.getOwnedParameters().add(symbol_765);
			symbol_763.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_763.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_766 = PivotFactory.eINSTANCE.createComment();
				symbol_766.setBody("The ordered set of the source ordered set for which body is oclText[false].");
				symbol_763.getOwnedComments().add(symbol_766);
			}
			
			symbol_102.getOwnedOperations().add(symbol_763);
		}
		{	// ocl::OrderedSet::reverse()
			Operation symbol_767 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reverse()
			symbol_767.setName("reverse");
			symbol_767.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			symbol_767.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_767.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			{
				Comment symbol_768 = PivotFactory.eINSTANCE.createComment();
				symbol_768.setBody("The ordered set of elements with same elements but with the opposite order.");
				symbol_767.getOwnedComments().add(symbol_768);
			}
			
			symbol_102.getOwnedOperations().add(symbol_767);
		}
		{	// ocl::OrderedSet::select()
			Iteration symbol_769 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)
			symbol_769.setName("select");
			symbol_769.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_770 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)!i
			symbol_770.setName("i");
			symbol_770.setType(symbol_105); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_769.getOwnedIterators().add(symbol_770);
			Parameter symbol_771 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)!body
			symbol_771.setName("body");
			symbol_771.setType(symbol_155);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
			
			
			symbol_769.getOwnedParameters().add(symbol_771);
			symbol_769.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_769.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_772 = PivotFactory.eINSTANCE.createComment();
				symbol_772.setBody("The ordered set of the source ordered set for which body is oclText[true]");
				symbol_769.getOwnedComments().add(symbol_772);
			}
			
			symbol_102.getOwnedOperations().add(symbol_769);
		}
		{	// ocl::OrderedSet::sortedBy()
			Iteration symbol_773 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_773.setName("sortedBy");
			symbol_773.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_774 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_774.setName("i");
			symbol_774.setType(symbol_105); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_773.getOwnedIterators().add(symbol_774);
			Parameter symbol_775 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_775.setName("body");
			symbol_775.setType(symbol_156);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_773.getOwnedParameters().add(symbol_775);
			symbol_773.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_773.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_776 = PivotFactory.eINSTANCE.createComment();
				symbol_776.setBody("Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
				symbol_773.getOwnedComments().add(symbol_776);
			}
			
			symbol_102.getOwnedOperations().add(symbol_773);
		}
		{	// ocl::OrderedSet::subOrderedSet()
			Operation symbol_777 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)
			symbol_777.setName("subOrderedSet");
			symbol_777.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_778 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)!lower
			symbol_778.setName("lower");
			symbol_778.setType(symbol_12);  // Integer
			
			
			symbol_777.getOwnedParameters().add(symbol_778);
			Parameter symbol_779 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)!upper
			symbol_779.setName("upper");
			symbol_779.setType(symbol_12);  // Integer
			
			
			symbol_777.getOwnedParameters().add(symbol_779);
			symbol_777.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation");
			symbol_777.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE);
			{
				Comment symbol_780 = PivotFactory.eINSTANCE.createComment();
				symbol_780.setBody("The sub-set of oclText[self] starting at number lower, up to and including element number upper.");
				symbol_777.getOwnedComments().add(symbol_780);
			}
			
			symbol_102.getOwnedOperations().add(symbol_777);
		}
		{	// ocl::OrderedSet::union()
			Operation symbol_781 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[T])
			symbol_781.setName("union");
			symbol_781.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_782 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[T])!o
			symbol_782.setName("o");
			symbol_782.setType(symbol_264);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
			
			
			symbol_781.getOwnedParameters().add(symbol_782);
			symbol_781.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_781.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_783 = PivotFactory.eINSTANCE.createComment();
				symbol_783.setBody("The ordered set consisting of all elements in oclText[self] and all elements in o.");
				symbol_781.getOwnedComments().add(symbol_783);
			}
			
			symbol_102.getOwnedOperations().add(symbol_781);
		}
		{
			Comment symbol_784 = PivotFactory.eINSTANCE.createComment();
			symbol_784.setBody("The OrderedSet is a Set, the elements of which are ordered.\nIt contains no duplicates. OrderedSet is itself an instance of the metatype OrderedSetType.\nAn OrderedSet is not a subtype of Set, neither a subtype of Sequence.\nThe common supertype of Sets and OrderedSets is Collection.");
			symbol_102.getOwnedComments().add(symbol_784);
		}
		
		symbol_0.getOwnedTypes().add(symbol_102); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
		//
		// ocl::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
		//
		symbol_109.setName("Sequence");
		symbol_109.setElementType(symbol_112);
		symbol_112.setName("T");
		symbol_111.setOwnedParameteredElement(symbol_112);
		symbol_110.getOwnedParameters().add(symbol_111);
		
		symbol_109.setOwnedTemplateSignature(symbol_110);
		symbol_109.getSuperClasses().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		{	// ocl::Sequence::<>()
			Operation symbol_785 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_785.setName("<>");
			symbol_785.setType(symbol_11);  // Boolean
			
			Parameter symbol_786 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_786.setName("object2");
			symbol_786.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_785.getOwnedParameters().add(symbol_786);
			symbol_785.setPrecedence(symbol_6);
			symbol_785.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_785.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_109.getOwnedOperations().add(symbol_785);
		}
		{	// ocl::Sequence::=()
			Operation symbol_787 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_787.setName("=");
			symbol_787.setType(symbol_11);  // Boolean
			
			Parameter symbol_788 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_788.setName("object2");
			symbol_788.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_787.getOwnedParameters().add(symbol_788);
			symbol_787.setPrecedence(symbol_6);
			symbol_787.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_787.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_789 = PivotFactory.eINSTANCE.createComment();
				symbol_789.setBody("True if oclText[self] contains the same elements as s in the same order.");
				symbol_787.getOwnedComments().add(symbol_789);
			}
			
			symbol_109.getOwnedOperations().add(symbol_787);
		}
		{	// ocl::Sequence::append()
			Operation symbol_790 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!append(T)
			symbol_790.setName("append");
			symbol_790.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_791 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!append(T)!object
			symbol_791.setName("object");
			symbol_791.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			
			symbol_790.getOwnedParameters().add(symbol_791);
			symbol_790.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation");
			symbol_790.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			{
				Comment symbol_792 = PivotFactory.eINSTANCE.createComment();
				symbol_792.setBody("The sequence of elements, consisting of all elements of oclText[self], followed by object.");
				symbol_790.getOwnedComments().add(symbol_792);
			}
			
			symbol_109.getOwnedOperations().add(symbol_790);
		}
		{	// ocl::Sequence::at()
			Operation symbol_793 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!at(Integer)
			symbol_793.setName("at");
			symbol_793.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			Parameter symbol_794 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!at(Integer)!index
			symbol_794.setName("index");
			symbol_794.setType(symbol_12);  // Integer
			
			
			symbol_793.getOwnedParameters().add(symbol_794);
			symbol_793.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation");
			symbol_793.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE);
			{
				Comment symbol_795 = PivotFactory.eINSTANCE.createComment();
				symbol_795.setBody("The i-th element of sequence.");
				symbol_793.getOwnedComments().add(symbol_795);
			}
			
			symbol_109.getOwnedOperations().add(symbol_793);
		}
		{	// ocl::Sequence::closure()
			Iteration symbol_796 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])
			symbol_796.setName("closure");
			symbol_796.setType(symbol_255);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
			
			Parameter symbol_797 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])!i
			symbol_797.setName("i");
			symbol_797.setType(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_796.getOwnedIterators().add(symbol_797);
			Parameter symbol_798 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])!body
			symbol_798.setName("body");
			symbol_798.setType(symbol_160);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
			
			
			symbol_796.getOwnedParameters().add(symbol_798);
			symbol_796.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ClosureIteration");
			symbol_796.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			{
				Comment symbol_799 = PivotFactory.eINSTANCE.createComment();
				symbol_799.setBody("The closure of applying body transitively to every distinct element of the source collection.");
				symbol_796.getOwnedComments().add(symbol_799);
			}
			
			symbol_109.getOwnedOperations().add(symbol_796);
		}
		{	// ocl::Sequence::collect()
			Iteration symbol_800 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)
			symbol_115.setName("V");
			symbol_114.setOwnedParameteredElement(symbol_115);
			symbol_113.getOwnedParameters().add(symbol_114);
			
			symbol_800.setOwnedTemplateSignature(symbol_113);
			symbol_800.setName("collect");
			symbol_800.setType(symbol_265);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_801 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)!i
			symbol_801.setName("i");
			symbol_801.setType(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_800.getOwnedIterators().add(symbol_801);
			Parameter symbol_802 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)!body
			symbol_802.setName("body");
			symbol_802.setType(symbol_162);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V
			
			
			symbol_800.getOwnedParameters().add(symbol_802);
			symbol_800.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_800.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			
			symbol_109.getOwnedOperations().add(symbol_800);
		}
		{	// ocl::Sequence::collectNested()
			Iteration symbol_803 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)
			symbol_118.setName("V");
			symbol_117.setOwnedParameteredElement(symbol_118);
			symbol_116.getOwnedParameters().add(symbol_117);
			
			symbol_803.setOwnedTemplateSignature(symbol_116);
			symbol_803.setName("collectNested");
			symbol_803.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_804 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_804.setName("i");
			symbol_804.setType(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_803.getOwnedIterators().add(symbol_804);
			Parameter symbol_805 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_805.setName("body");
			symbol_805.setType(symbol_161);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)?V
			
			
			symbol_803.getOwnedParameters().add(symbol_805);
			symbol_803.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_803.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			{
				Comment symbol_806 = PivotFactory.eINSTANCE.createComment();
				symbol_806.setBody("The sequence of elements that results from applying body to every member of the source ordered collection.");
				symbol_803.getOwnedComments().add(symbol_806);
			}
			
			symbol_109.getOwnedOperations().add(symbol_803);
		}
		{	// ocl::Sequence::excluding()
			Operation symbol_807 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_807.setName("excluding");
			symbol_807.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_808 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_808.setName("object");
			symbol_808.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_807.getOwnedParameters().add(symbol_808);
			symbol_807.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_807.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_809 = PivotFactory.eINSTANCE.createComment();
				symbol_809.setBody("The sequence containing all elements of oclText[self] apart from all occurrences of object.\n\nThe order of the remaining elements is not changed.");
				symbol_807.getOwnedComments().add(symbol_809);
			}
			
			symbol_109.getOwnedOperations().add(symbol_807);
		}
		{	// ocl::Sequence::first()
			Operation symbol_810 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!first()
			symbol_810.setName("first");
			symbol_810.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_810.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation");
			symbol_810.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
			{
				Comment symbol_811 = PivotFactory.eINSTANCE.createComment();
				symbol_811.setBody("The first element in oclText[self].");
				symbol_810.getOwnedComments().add(symbol_811);
			}
			
			symbol_109.getOwnedOperations().add(symbol_810);
		}
		{	// ocl::Sequence::flatten()
			Operation symbol_812 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()
			symbol_121.setName("T2");
			symbol_120.setOwnedParameteredElement(symbol_121);
			symbol_119.getOwnedParameters().add(symbol_120);
			
			symbol_812.setOwnedTemplateSignature(symbol_119);
			symbol_812.setName("flatten");
			symbol_812.setType(symbol_266);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
			
			symbol_812.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_812.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			{
				Comment symbol_813 = PivotFactory.eINSTANCE.createComment();
				symbol_813.setBody("Redefines the Collection operation. If the element type is not a collection type, this results in the same sequence as oclText[self].\nIf the element type is a collection type, the result is the sequence containing all the elements\nof all the recursively flattened elements of oclText[self]. The order of the elements is partial.");
				symbol_812.getOwnedComments().add(symbol_813);
			}
			
			symbol_109.getOwnedOperations().add(symbol_812);
		}
		{	// ocl::Sequence::including()
			Operation symbol_814 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!including(T)
			symbol_814.setName("including");
			symbol_814.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_815 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!including(T)!object
			symbol_815.setName("object");
			symbol_815.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			
			symbol_814.getOwnedParameters().add(symbol_815);
			symbol_814.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_814.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_816 = PivotFactory.eINSTANCE.createComment();
				symbol_816.setBody("The sequence containing all elements of oclText[self] plus object added as the last element.");
				symbol_814.getOwnedComments().add(symbol_816);
			}
			
			symbol_109.getOwnedOperations().add(symbol_814);
		}
		{	// ocl::Sequence::indexOf()
			Operation symbol_817 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!indexOf(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_817.setName("indexOf");
			symbol_817.setType(symbol_12);  // Integer
			
			Parameter symbol_818 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!indexOf(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!obj
			symbol_818.setName("obj");
			symbol_818.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_817.getOwnedParameters().add(symbol_818);
			symbol_817.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation");
			symbol_817.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE);
			{
				Comment symbol_819 = PivotFactory.eINSTANCE.createComment();
				symbol_819.setBody("The index of object obj in the ordered collection.");
				symbol_817.getOwnedComments().add(symbol_819);
			}
			
			symbol_109.getOwnedOperations().add(symbol_817);
		}
		{	// ocl::Sequence::insertAt()
			Operation symbol_820 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)
			symbol_820.setName("insertAt");
			symbol_820.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_821 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)!index
			symbol_821.setName("index");
			symbol_821.setType(symbol_12);  // Integer
			
			
			symbol_820.getOwnedParameters().add(symbol_821);
			Parameter symbol_822 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)!object
			symbol_822.setName("object");
			symbol_822.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			
			symbol_820.getOwnedParameters().add(symbol_822);
			symbol_820.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation");
			symbol_820.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			{
				Comment symbol_823 = PivotFactory.eINSTANCE.createComment();
				symbol_823.setBody("The sequence consisting of oclText[self] with object inserted at position index.");
				symbol_820.getOwnedComments().add(symbol_823);
			}
			
			symbol_109.getOwnedOperations().add(symbol_820);
		}
		{	// ocl::Sequence::last()
			Operation symbol_824 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!last()
			symbol_824.setName("last");
			symbol_824.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_824.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation");
			symbol_824.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
			{
				Comment symbol_825 = PivotFactory.eINSTANCE.createComment();
				symbol_825.setBody("The last element in oclText[self].");
				symbol_824.getOwnedComments().add(symbol_825);
			}
			
			symbol_109.getOwnedOperations().add(symbol_824);
		}
		{	// ocl::Sequence::prepend()
			Operation symbol_826 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!prepend(T)
			symbol_826.setName("prepend");
			symbol_826.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_827 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!prepend(T)!object
			symbol_827.setName("object");
			symbol_827.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			
			symbol_826.getOwnedParameters().add(symbol_827);
			symbol_826.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation");
			symbol_826.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			{
				Comment symbol_828 = PivotFactory.eINSTANCE.createComment();
				symbol_828.setBody("The sequence consisting of object, followed by all elements in oclText[self].");
				symbol_826.getOwnedComments().add(symbol_828);
			}
			
			symbol_109.getOwnedOperations().add(symbol_826);
		}
		{	// ocl::Sequence::reject()
			Iteration symbol_829 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)
			symbol_829.setName("reject");
			symbol_829.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_830 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)!i
			symbol_830.setName("i");
			symbol_830.setType(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_829.getOwnedIterators().add(symbol_830);
			Parameter symbol_831 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)!body
			symbol_831.setName("body");
			symbol_831.setType(symbol_157);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
			
			
			symbol_829.getOwnedParameters().add(symbol_831);
			symbol_829.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_829.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_832 = PivotFactory.eINSTANCE.createComment();
				symbol_832.setBody("The subsequence of the source sequence for which body is oclText[false].");
				symbol_829.getOwnedComments().add(symbol_832);
			}
			
			symbol_109.getOwnedOperations().add(symbol_829);
		}
		{	// ocl::Sequence::reverse()
			Operation symbol_833 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reverse()
			symbol_833.setName("reverse");
			symbol_833.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			symbol_833.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_833.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			{
				Comment symbol_834 = PivotFactory.eINSTANCE.createComment();
				symbol_834.setBody("The sequence containing the same elements but with the opposite order.");
				symbol_833.getOwnedComments().add(symbol_834);
			}
			
			symbol_109.getOwnedOperations().add(symbol_833);
		}
		{	// ocl::Sequence::select()
			Iteration symbol_835 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)
			symbol_835.setName("select");
			symbol_835.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_836 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)!i
			symbol_836.setName("i");
			symbol_836.setType(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_835.getOwnedIterators().add(symbol_836);
			Parameter symbol_837 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)!body
			symbol_837.setName("body");
			symbol_837.setType(symbol_158);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
			
			
			symbol_835.getOwnedParameters().add(symbol_837);
			symbol_835.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_835.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_838 = PivotFactory.eINSTANCE.createComment();
				symbol_838.setBody("The subsequence of the source sequence for which body is oclText[true].");
				symbol_835.getOwnedComments().add(symbol_838);
			}
			
			symbol_109.getOwnedOperations().add(symbol_835);
		}
		{	// ocl::Sequence::sortedBy()
			Iteration symbol_839 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_839.setName("sortedBy");
			symbol_839.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_840 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_840.setName("i");
			symbol_840.setType(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_839.getOwnedIterators().add(symbol_840);
			Parameter symbol_841 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_841.setName("body");
			symbol_841.setType(symbol_159);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_839.getOwnedParameters().add(symbol_841);
			symbol_839.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_839.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_842 = PivotFactory.eINSTANCE.createComment();
				symbol_842.setBody("Results in the Sequence containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
				symbol_839.getOwnedComments().add(symbol_842);
			}
			
			symbol_109.getOwnedOperations().add(symbol_839);
		}
		{	// ocl::Sequence::subSequence()
			Operation symbol_843 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)
			symbol_843.setName("subSequence");
			symbol_843.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_844 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)!lower
			symbol_844.setName("lower");
			symbol_844.setType(symbol_12);  // Integer
			
			
			symbol_843.getOwnedParameters().add(symbol_844);
			Parameter symbol_845 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)!upper
			symbol_845.setName("upper");
			symbol_845.setType(symbol_12);  // Integer
			
			
			symbol_843.getOwnedParameters().add(symbol_845);
			symbol_843.setImplementationClass("org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation");
			symbol_843.setImplementation(org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE);
			{
				Comment symbol_846 = PivotFactory.eINSTANCE.createComment();
				symbol_846.setBody("The sub-sequence of oclText[self] starting at number lower, up to and including element number upper.");
				symbol_843.getOwnedComments().add(symbol_846);
			}
			
			symbol_109.getOwnedOperations().add(symbol_843);
		}
		{	// ocl::Sequence::union()
			Operation symbol_847 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T})
			symbol_847.setName("union");
			symbol_847.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_848 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T})!s
			symbol_848.setName("s");
			symbol_848.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			
			symbol_847.getOwnedParameters().add(symbol_848);
			symbol_847.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_847.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_849 = PivotFactory.eINSTANCE.createComment();
				symbol_849.setBody("The sequence consisting of all elements in oclText[self], followed by all elements in s.");
				symbol_847.getOwnedComments().add(symbol_849);
			}
			
			symbol_109.getOwnedOperations().add(symbol_847);
		}
		{
			Comment symbol_850 = PivotFactory.eINSTANCE.createComment();
			symbol_850.setBody("A sequence is a collection where the elements are ordered.\nAn element may be part of a sequence more than once.\nSequence is itself an instance of the metatype SequenceType.\nA Sentence is not a subtype of Bag.\nThe common supertype of Sentence and Bags is Collection.");
			symbol_109.getOwnedComments().add(symbol_850);
		}
		
		symbol_0.getOwnedTypes().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
		//
		// ocl::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
		//
		symbol_122.setName("Set");
		symbol_122.setElementType(symbol_125);
		symbol_125.setName("T");
		symbol_124.setOwnedParameteredElement(symbol_125);
		symbol_123.getOwnedParameters().add(symbol_124);
		
		symbol_122.setOwnedTemplateSignature(symbol_123);
		symbol_122.getSuperClasses().add(symbol_208); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		symbol_122.getSuperClasses().add(symbol_300); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		{	// ocl::Set::-()
			Operation symbol_851 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_851.setName("-");
			symbol_851.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_852 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_852.setName("s");
			symbol_852.setType(symbol_287);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			
			symbol_851.getOwnedParameters().add(symbol_852);
			symbol_851.setPrecedence(symbol_4);
			symbol_851.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_851.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			{
				Comment symbol_853 = PivotFactory.eINSTANCE.createComment();
				symbol_853.setBody("The elements of oclText[self], which are not in s.");
				symbol_851.getOwnedComments().add(symbol_853);
			}
			
			symbol_122.getOwnedOperations().add(symbol_851);
		}
		{	// ocl::Set::<>()
			Operation symbol_854 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_854.setName("<>");
			symbol_854.setType(symbol_11);  // Boolean
			
			Parameter symbol_855 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_855.setName("object2");
			symbol_855.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_854.getOwnedParameters().add(symbol_855);
			symbol_854.setPrecedence(symbol_6);
			symbol_854.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_854.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_122.getOwnedOperations().add(symbol_854);
		}
		{	// ocl::Set::=()
			Operation symbol_856 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_856.setName("=");
			symbol_856.setType(symbol_11);  // Boolean
			
			Parameter symbol_857 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_857.setName("object2");
			symbol_857.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_856.getOwnedParameters().add(symbol_857);
			symbol_856.setPrecedence(symbol_6);
			symbol_856.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_856.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_858 = PivotFactory.eINSTANCE.createComment();
				symbol_858.setBody("Evaluates to oclText[true] if oclText[self] and s contain the same elements.");
				symbol_856.getOwnedComments().add(symbol_858);
			}
			
			symbol_122.getOwnedOperations().add(symbol_856);
		}
		{	// ocl::Set::excluding()
			Operation symbol_859 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_859.setName("excluding");
			symbol_859.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_860 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_860.setName("object");
			symbol_860.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_859.getOwnedParameters().add(symbol_860);
			symbol_859.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_859.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_861 = PivotFactory.eINSTANCE.createComment();
				symbol_861.setBody("The set containing all elements of oclText[self] without object.");
				symbol_859.getOwnedComments().add(symbol_861);
			}
			
			symbol_122.getOwnedOperations().add(symbol_859);
		}
		{	// ocl::Set::flatten()
			Operation symbol_862 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()
			symbol_128.setName("T2");
			symbol_127.setOwnedParameteredElement(symbol_128);
			symbol_126.getOwnedParameters().add(symbol_127);
			
			symbol_862.setOwnedTemplateSignature(symbol_126);
			symbol_862.setName("flatten");
			symbol_862.setType(symbol_277);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
			
			symbol_862.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_862.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			{
				Comment symbol_863 = PivotFactory.eINSTANCE.createComment();
				symbol_863.setBody("Redefines the Collection operation. If the element type is not a collection type, this results in the same set as oclText[self].\nIf the element type is a collection type, the result is the set containing all the elements of all the recursively flattened elements of oclText[self].");
				symbol_862.getOwnedComments().add(symbol_863);
			}
			
			symbol_122.getOwnedOperations().add(symbol_862);
		}
		{	// ocl::Set::including()
			Operation symbol_864 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!including(T)
			symbol_864.setName("including");
			symbol_864.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_865 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!including(T)!object
			symbol_865.setName("object");
			symbol_865.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			
			symbol_864.getOwnedParameters().add(symbol_865);
			symbol_864.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_864.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_866 = PivotFactory.eINSTANCE.createComment();
				symbol_866.setBody("The set containing all elements of oclText[self] plus object.");
				symbol_864.getOwnedComments().add(symbol_866);
			}
			
			symbol_122.getOwnedOperations().add(symbol_864);
		}
		{	// ocl::Set::intersection()
			Operation symbol_867 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T})
			symbol_867.setName("intersection");
			symbol_867.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_868 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T})!s
			symbol_868.setName("s");
			symbol_868.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			
			symbol_867.getOwnedParameters().add(symbol_868);
			symbol_867.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_867.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			{
				Comment symbol_869 = PivotFactory.eINSTANCE.createComment();
				symbol_869.setBody("The intersection of oclText[self] and s (i.e., the set of all elements that are in both oclText[self] and s).");
				symbol_867.getOwnedComments().add(symbol_869);
			}
			
			symbol_122.getOwnedOperations().add(symbol_867);
		}
		{	// ocl::Set::reject()
			Iteration symbol_870 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)
			symbol_870.setName("reject");
			symbol_870.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_871 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)!i
			symbol_871.setName("i");
			symbol_871.setType(symbol_125); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			symbol_870.getOwnedIterators().add(symbol_871);
			Parameter symbol_872 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)!body
			symbol_872.setName("body");
			symbol_872.setType(symbol_163);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
			
			
			symbol_870.getOwnedParameters().add(symbol_872);
			symbol_870.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_870.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_873 = PivotFactory.eINSTANCE.createComment();
				symbol_873.setBody("The subset of the source set for which body is oclText[false].");
				symbol_870.getOwnedComments().add(symbol_873);
			}
			
			symbol_122.getOwnedOperations().add(symbol_870);
		}
		{	// ocl::Set::select()
			Iteration symbol_874 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)
			symbol_874.setName("select");
			symbol_874.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_875 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)!i
			symbol_875.setName("i");
			symbol_875.setType(symbol_125); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			symbol_874.getOwnedIterators().add(symbol_875);
			Parameter symbol_876 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)!body
			symbol_876.setName("body");
			symbol_876.setType(symbol_164);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
			
			
			symbol_874.getOwnedParameters().add(symbol_876);
			symbol_874.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_874.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_877 = PivotFactory.eINSTANCE.createComment();
				symbol_877.setBody("The subset of set for which expr is oclText[true].");
				symbol_874.getOwnedComments().add(symbol_877);
			}
			
			symbol_122.getOwnedOperations().add(symbol_874);
		}
		{	// ocl::Set::sortedBy()
			Iteration symbol_878 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_878.setName("sortedBy");
			symbol_878.setType(symbol_256);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
			
			Parameter symbol_879 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_879.setName("i");
			symbol_879.setType(symbol_125); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			symbol_878.getOwnedIterators().add(symbol_879);
			Parameter symbol_880 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_880.setName("body");
			symbol_880.setType(symbol_165);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_878.getOwnedParameters().add(symbol_880);
			symbol_878.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_878.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_881 = PivotFactory.eINSTANCE.createComment();
				symbol_881.setBody("Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
				symbol_878.getOwnedComments().add(symbol_881);
			}
			
			symbol_122.getOwnedOperations().add(symbol_878);
		}
		{	// ocl::Set::union()
			Operation symbol_882 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_882.setName("union");
			symbol_882.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_883 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!s
			symbol_883.setName("s");
			symbol_883.setType(symbol_248);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
			
			
			symbol_882.getOwnedParameters().add(symbol_883);
			symbol_882.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_882.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_884 = PivotFactory.eINSTANCE.createComment();
				symbol_884.setBody("The set consisting of all elements in oclText[self] and all elements in s.");
				symbol_882.getOwnedComments().add(symbol_884);
			}
			
			symbol_122.getOwnedOperations().add(symbol_882);
		}
		
		symbol_0.getOwnedTypes().add(symbol_122); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
		//
		// ocl::Type http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Type
		//
		symbol_129.setName("Type");
		symbol_129.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		{	// ocl::Type::xyzzyx()
			Operation symbol_885 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Type!xyzzyx()
			symbol_885.setName("xyzzyx");
			symbol_885.setType(symbol_11);  // Boolean
			
			symbol_885.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_885.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			
			symbol_129.getOwnedOperations().add(symbol_885);
		}
		
		symbol_0.getOwnedTypes().add(symbol_129); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Type
		//
		// ocl::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
		//
		symbol_130.setName("UniqueCollection");
		symbol_130.setElementType(symbol_133);
		symbol_133.setName("T");
		symbol_132.setOwnedParameteredElement(symbol_133);
		symbol_131.getOwnedParameters().add(symbol_132);
		
		symbol_130.setOwnedTemplateSignature(symbol_131);
		symbol_130.getSuperClasses().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		{	// ocl::UniqueCollection::-()
			Operation symbol_886 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_886.setName("-");
			symbol_886.setType(symbol_130);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
			
			Parameter symbol_887 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_887.setName("s");
			symbol_887.setType(symbol_287);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			
			symbol_886.getOwnedParameters().add(symbol_887);
			symbol_886.setPrecedence(symbol_4);
			symbol_886.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_886.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			{
				Comment symbol_888 = PivotFactory.eINSTANCE.createComment();
				symbol_888.setBody("The elements of oclText[self], which are not in s.");
				symbol_886.getOwnedComments().add(symbol_888);
			}
			
			symbol_130.getOwnedOperations().add(symbol_886);
		}
		{	// ocl::UniqueCollection::sortedBy()
			Iteration symbol_889 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_889.setName("sortedBy");
			symbol_889.setType(symbol_257);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			Parameter symbol_890 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_890.setName("i");
			symbol_890.setType(symbol_133); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T
			
			symbol_889.getOwnedIterators().add(symbol_890);
			Parameter symbol_891 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_891.setName("body");
			symbol_891.setType(symbol_166);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_889.getOwnedParameters().add(symbol_891);
			symbol_889.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_889.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_892 = PivotFactory.eINSTANCE.createComment();
				symbol_892.setBody("Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
				symbol_889.getOwnedComments().add(symbol_892);
			}
			
			symbol_130.getOwnedOperations().add(symbol_889);
		}
		{	// ocl::UniqueCollection::symmetricDifference()
			Operation symbol_893 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_893.setName("symmetricDifference");
			symbol_893.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			Parameter symbol_894 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_894.setName("s");
			symbol_894.setType(symbol_287);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			
			symbol_893.getOwnedParameters().add(symbol_894);
			symbol_893.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation");
			symbol_893.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			{
				Comment symbol_895 = PivotFactory.eINSTANCE.createComment();
				symbol_895.setBody("The set containing all the elements that are in oclText[self] or s, but not in both.");
				symbol_893.getOwnedComments().add(symbol_895);
			}
			
			symbol_130.getOwnedOperations().add(symbol_893);
		}
		{	// ocl::UniqueCollection::union()
			Operation symbol_896 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_896.setName("union");
			symbol_896.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			Parameter symbol_897 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!s
			symbol_897.setName("s");
			symbol_897.setType(symbol_249);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			
			symbol_896.getOwnedParameters().add(symbol_897);
			symbol_896.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_896.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_898 = PivotFactory.eINSTANCE.createComment();
				symbol_898.setBody("The set consisting of all elements in oclText[self] and all elements in s.");
				symbol_896.getOwnedComments().add(symbol_898);
			}
			
			symbol_130.getOwnedOperations().add(symbol_896);
		}
		{
			Comment symbol_899 = PivotFactory.eINSTANCE.createComment();
			symbol_899.setBody("The UniqueCollection type provides the shared functionality of the OrderedSet and Set\ncollections for which the elements are unique.\nThe common supertype of UniqueCollection is Collection.");
			symbol_130.getOwnedComments().add(symbol_899);
		}
		
		symbol_0.getOwnedTypes().add(symbol_130); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
		//
		// ocl::$$ u_r_i:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0
		//
		symbol_134.setName("$$");
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		symbol_135.setName("Lambda");
		symbol_135.setContextType(symbol_26);
		symbol_135.setResultType(symbol_11);
		symbol_135.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_135); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		symbol_136.setName("Lambda");
		symbol_136.setContextType(symbol_26);
		symbol_136.setResultType(symbol_11);
		symbol_136.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_136); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_137.setName("Lambda");
		symbol_137.setContextType(symbol_26);
		symbol_137.setResultType(symbol_32);
		symbol_137.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_137); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_138.setName("Lambda");
		symbol_138.setContextType(symbol_26);
		symbol_138.setResultType(symbol_29);
		symbol_138.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_138); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_139.setName("Lambda");
		symbol_139.setContextType(symbol_26);
		symbol_139.setResultType(symbol_80);
		symbol_139.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_139); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
		//
		symbol_140.setName("Lambda");
		symbol_140.setContextType(symbol_26);
		symbol_140.setResultType(symbol_272);
		symbol_140.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_140); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_141.setName("Lambda");
		symbol_141.setContextType(symbol_51);
		symbol_141.setResultType(symbol_11);
		symbol_141.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_141); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_142.setName("Lambda");
		symbol_142.setContextType(symbol_51);
		symbol_142.setResultType(symbol_11);
		symbol_142.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_142); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_143.setName("Lambda");
		symbol_143.setContextType(symbol_51);
		symbol_143.setResultType(symbol_11);
		symbol_143.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_143); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_144.setName("Lambda");
		symbol_144.setContextType(symbol_51);
		symbol_144.setResultType(symbol_11);
		symbol_144.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_144); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_145.setName("Lambda");
		symbol_145.setContextType(symbol_51);
		symbol_145.setResultType(symbol_11);
		symbol_145.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_145); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_146.setName("Lambda");
		symbol_146.setContextType(symbol_51);
		symbol_146.setResultType(symbol_11);
		symbol_146.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_146); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_147.setName("Lambda");
		symbol_147.setContextType(symbol_51);
		symbol_147.setResultType(symbol_11);
		symbol_147.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_147); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_148.setName("Lambda");
		symbol_148.setContextType(symbol_51);
		symbol_148.setResultType(symbol_11);
		symbol_148.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_148); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_149.setName("Lambda");
		symbol_149.setContextType(symbol_51);
		symbol_149.setResultType(symbol_57);
		symbol_149.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_149); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_150.setName("Lambda");
		symbol_150.setContextType(symbol_51);
		symbol_150.setResultType(symbol_54);
		symbol_150.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_150); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
		//
		symbol_151.setName("Lambda");
		symbol_151.setContextType(symbol_51);
		symbol_151.setResultType(symbol_69);
		symbol_151.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_151); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_152.setName("Lambda");
		symbol_152.setContextType(symbol_51);
		symbol_152.setResultType(symbol_80);
		symbol_152.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_152); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_153.setName("Lambda");
		symbol_153.setContextType(symbol_51);
		symbol_153.setResultType(symbol_80);
		symbol_153.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_153); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		symbol_154.setName("Lambda");
		symbol_154.setContextType(symbol_105);
		symbol_154.setResultType(symbol_11);
		symbol_154.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_154); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		symbol_155.setName("Lambda");
		symbol_155.setContextType(symbol_105);
		symbol_155.setResultType(symbol_11);
		symbol_155.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_155); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_156.setName("Lambda");
		symbol_156.setContextType(symbol_105);
		symbol_156.setResultType(symbol_80);
		symbol_156.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_156); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		symbol_157.setName("Lambda");
		symbol_157.setContextType(symbol_112);
		symbol_157.setResultType(symbol_11);
		symbol_157.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_157); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		symbol_158.setName("Lambda");
		symbol_158.setContextType(symbol_112);
		symbol_158.setResultType(symbol_11);
		symbol_158.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_158); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_159.setName("Lambda");
		symbol_159.setContextType(symbol_112);
		symbol_159.setResultType(symbol_80);
		symbol_159.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_159); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
		//
		symbol_160.setName("Lambda");
		symbol_160.setContextType(symbol_112);
		symbol_160.setResultType(symbol_255);
		symbol_160.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_160); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_161.setName("Lambda");
		symbol_161.setContextType(symbol_112);
		symbol_161.setResultType(symbol_118);
		symbol_161.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_161); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_162.setName("Lambda");
		symbol_162.setContextType(symbol_112);
		symbol_162.setResultType(symbol_115);
		symbol_162.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_162); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		symbol_163.setName("Lambda");
		symbol_163.setContextType(symbol_125);
		symbol_163.setResultType(symbol_11);
		symbol_163.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_163); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		symbol_164.setName("Lambda");
		symbol_164.setContextType(symbol_125);
		symbol_164.setResultType(symbol_11);
		symbol_164.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_164); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_165.setName("Lambda");
		symbol_165.setContextType(symbol_125);
		symbol_165.setResultType(symbol_80);
		symbol_165.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_165); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_166.setName("Lambda");
		symbol_166.setContextType(symbol_133);
		symbol_166.setResultType(symbol_80);
		symbol_166.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_134.getOwnedTypes().add(symbol_166); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_167.setName("Tuple");
		symbol_167.getSuperClasses().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_168.setName("first");
			symbol_168.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_168.setIsResolveProxies(true);
			
			symbol_167.getOwnedAttributes().add(symbol_168);
		}
		{ // ocl::$$::Tuple::second
			symbol_169.setName("second");
			symbol_169.setType(symbol_72);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_169.setIsResolveProxies(true);
			
			symbol_167.getOwnedAttributes().add(symbol_169);
		}
		
		symbol_134.getOwnedTypes().add(symbol_167); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_170.setName("Tuple");
		symbol_170.getSuperClasses().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_171.setName("first");
			symbol_171.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_171.setIsResolveProxies(true);
			
			symbol_170.getOwnedAttributes().add(symbol_171);
		}
		{ // ocl::$$::Tuple::second
			symbol_172.setName("second");
			symbol_172.setType(symbol_72);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_172.setIsResolveProxies(true);
			
			symbol_170.getOwnedAttributes().add(symbol_172);
		}
		
		symbol_134.getOwnedTypes().add(symbol_170); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_173.setName("Tuple");
		symbol_173.getSuperClasses().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_174.setName("first");
			symbol_174.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_174.setIsResolveProxies(true);
			
			symbol_173.getOwnedAttributes().add(symbol_174);
		}
		{ // ocl::$$::Tuple::second
			symbol_175.setName("second");
			symbol_175.setType(symbol_72);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_175.setIsResolveProxies(true);
			
			symbol_173.getOwnedAttributes().add(symbol_175);
		}
		
		symbol_134.getOwnedTypes().add(symbol_173); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_176.setName("Tuple");
		symbol_176.getSuperClasses().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_177.setName("first");
			symbol_177.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_177.setIsResolveProxies(true);
			
			symbol_176.getOwnedAttributes().add(symbol_177);
		}
		{ // ocl::$$::Tuple::second
			symbol_178.setName("second");
			symbol_178.setType(symbol_72);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_178.setIsResolveProxies(true);
			
			symbol_176.getOwnedAttributes().add(symbol_178);
		}
		
		symbol_134.getOwnedTypes().add(symbol_176); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		//
		symbol_179.setName("AnyClassifier");
		symbol_179.setInstanceType(symbol_18);
		symbol_179.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_900 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_900.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_901 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_901.setFormal(symbol_21);	
				symbol_901.setActual(symbol_18);	
				symbol_900.getParameterSubstitutions().add(symbol_901);
			}
			symbol_179.getTemplateBindings().add(symbol_900);
		}
		symbol_179.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_179.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_134.getOwnedTypes().add(symbol_179); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		//
		symbol_180.setName("AnyClassifier");
		symbol_180.setInstanceType(symbol_40);
		symbol_180.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_902 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_902.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_903 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_903.setFormal(symbol_21);	
				symbol_903.setActual(symbol_40);	
				symbol_902.getParameterSubstitutions().add(symbol_903);
			}
			symbol_180.getTemplateBindings().add(symbol_902);
		}
		symbol_180.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_180.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_134.getOwnedTypes().add(symbol_180); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		//
		symbol_181.setName("AnyClassifier");
		symbol_181.setInstanceType(symbol_44);
		symbol_181.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_904 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_904.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_905 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_905.setFormal(symbol_21);	
				symbol_905.setActual(symbol_44);	
				symbol_904.getParameterSubstitutions().add(symbol_905);
			}
			symbol_181.getTemplateBindings().add(symbol_904);
		}
		symbol_181.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_181.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_134.getOwnedTypes().add(symbol_181); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		//
		symbol_182.setName("AnyClassifier");
		symbol_182.setInstanceType(symbol_77);
		symbol_182.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_906 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_906.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_907 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_907.setFormal(symbol_21);	
				symbol_907.setActual(symbol_77);	
				symbol_906.getParameterSubstitutions().add(symbol_907);
			}
			symbol_182.getTemplateBindings().add(symbol_906);
		}
		symbol_182.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_182.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_134.getOwnedTypes().add(symbol_182); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		//
		symbol_183.setName("AnyClassifier");
		symbol_183.setInstanceType(symbol_83);
		symbol_183.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_908 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_908.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_909 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_909.setFormal(symbol_21);	
				symbol_909.setActual(symbol_83);	
				symbol_908.getParameterSubstitutions().add(symbol_909);
			}
			symbol_183.getTemplateBindings().add(symbol_908);
		}
		symbol_183.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_183.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_134.getOwnedTypes().add(symbol_183); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		//
		symbol_184.setName("AnyClassifier");
		symbol_184.setInstanceType(symbol_86);
		symbol_184.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_910 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_910.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_911 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_911.setFormal(symbol_21);	
				symbol_911.setActual(symbol_86);	
				symbol_910.getParameterSubstitutions().add(symbol_911);
			}
			symbol_184.getTemplateBindings().add(symbol_910);
		}
		symbol_184.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_184.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_134.getOwnedTypes().add(symbol_184); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		//
		symbol_185.setName("AnyClassifier");
		symbol_185.setInstanceType(symbol_89);
		symbol_185.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_912 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_912.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_913 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_913.setFormal(symbol_21);	
				symbol_913.setActual(symbol_89);	
				symbol_912.getParameterSubstitutions().add(symbol_913);
			}
			symbol_185.getTemplateBindings().add(symbol_912);
		}
		symbol_185.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_185.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_134.getOwnedTypes().add(symbol_185); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		//
		symbol_186.setName("AnyClassifier");
		symbol_186.setInstanceType(symbol_92);
		symbol_186.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_914 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_914.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_915 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_915.setFormal(symbol_21);	
				symbol_915.setActual(symbol_92);	
				symbol_914.getParameterSubstitutions().add(symbol_915);
			}
			symbol_186.getTemplateBindings().add(symbol_914);
		}
		symbol_186.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_186.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_134.getOwnedTypes().add(symbol_186); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		//
		symbol_187.setName("AnyClassifier");
		symbol_187.setInstanceType(symbol_92);
		symbol_187.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_916 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_916.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_917 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_917.setFormal(symbol_21);	
				symbol_917.setActual(symbol_92);	
				symbol_916.getParameterSubstitutions().add(symbol_917);
			}
			symbol_187.getTemplateBindings().add(symbol_916);
		}
		symbol_187.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_187.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_134.getOwnedTypes().add(symbol_187); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_188.setName("AnyClassifier");
		symbol_188.setInstanceType(symbol_96);
		symbol_188.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_918 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_918.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_919 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_919.setFormal(symbol_21);	
				symbol_919.setActual(symbol_96);	
				symbol_918.getParameterSubstitutions().add(symbol_919);
			}
			symbol_188.getTemplateBindings().add(symbol_918);
		}
		symbol_188.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_188.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_134.getOwnedTypes().add(symbol_188); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		//
		symbol_189.setName("AnyClassifier");
		symbol_189.setInstanceType(symbol_101);
		symbol_189.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_920 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_920.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_921 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_921.setFormal(symbol_21);	
				symbol_921.setActual(symbol_101);	
				symbol_920.getParameterSubstitutions().add(symbol_921);
			}
			symbol_189.getTemplateBindings().add(symbol_920);
		}
		symbol_189.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_189.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_134.getOwnedTypes().add(symbol_189); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_190.setName("Bag");
		symbol_190.setElementType(symbol_176);
		symbol_190.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_922 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_922.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_923 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_923.setFormal(symbol_25);	
				symbol_923.setActual(symbol_167);	
				symbol_922.getParameterSubstitutions().add(symbol_923);
			}
			symbol_190.getTemplateBindings().add(symbol_922);
		}
		symbol_190.getSuperClasses().add(symbol_217); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_134.getOwnedTypes().add(symbol_190); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_191.setName("Bag");
		symbol_191.setElementType(symbol_176);
		symbol_191.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_924 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_924.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_925 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_925.setFormal(symbol_25);	
				symbol_925.setActual(symbol_167);	
				symbol_924.getParameterSubstitutions().add(symbol_925);
			}
			symbol_191.getTemplateBindings().add(symbol_924);
		}
		symbol_191.getSuperClasses().add(symbol_217); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_134.getOwnedTypes().add(symbol_191); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_192.setName("Bag");
		symbol_192.setElementType(symbol_29);
		symbol_192.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_926 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_926.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_927 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_927.setFormal(symbol_25);	
				symbol_927.setActual(symbol_29);	
				symbol_926.getParameterSubstitutions().add(symbol_927);
			}
			symbol_192.getTemplateBindings().add(symbol_926);
		}
		symbol_192.getSuperClasses().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		
		symbol_134.getOwnedTypes().add(symbol_192); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		symbol_193.setName("Bag");
		symbol_193.setElementType(symbol_35);
		symbol_193.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_928 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_928.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_929 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_929.setFormal(symbol_25);	
				symbol_929.setActual(symbol_35);	
				symbol_928.getParameterSubstitutions().add(symbol_929);
			}
			symbol_193.getTemplateBindings().add(symbol_928);
		}
		symbol_193.getSuperClasses().add(symbol_220); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		symbol_134.getOwnedTypes().add(symbol_193); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_194.setName("Bag");
		symbol_194.setElementType(symbol_26);
		symbol_194.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_930 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_930.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_931 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_931.setFormal(symbol_25);	
				symbol_931.setActual(symbol_26);	
				symbol_930.getParameterSubstitutions().add(symbol_931);
			}
			symbol_194.getTemplateBindings().add(symbol_930);
		}
		symbol_194.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_194); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_195.setName("Bag");
		symbol_195.setElementType(symbol_26);
		symbol_195.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_932 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_932.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_933 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_933.setFormal(symbol_25);	
				symbol_933.setActual(symbol_26);	
				symbol_932.getParameterSubstitutions().add(symbol_933);
			}
			symbol_195.getTemplateBindings().add(symbol_932);
		}
		symbol_195.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_195); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_196.setName("Bag");
		symbol_196.setElementType(symbol_26);
		symbol_196.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_934 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_934.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_935 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_935.setFormal(symbol_25);	
				symbol_935.setActual(symbol_26);	
				symbol_934.getParameterSubstitutions().add(symbol_935);
			}
			symbol_196.getTemplateBindings().add(symbol_934);
		}
		symbol_196.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_196); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_197.setName("Bag");
		symbol_197.setElementType(symbol_26);
		symbol_197.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_936 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_936.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_937 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_937.setFormal(symbol_25);	
				symbol_937.setActual(symbol_26);	
				symbol_936.getParameterSubstitutions().add(symbol_937);
			}
			symbol_197.getTemplateBindings().add(symbol_936);
		}
		symbol_197.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_197); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_198.setName("Bag");
		symbol_198.setElementType(symbol_51);
		symbol_198.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_938 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_938.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_939 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_939.setFormal(symbol_25);	
				symbol_939.setActual(symbol_51);	
				symbol_938.getParameterSubstitutions().add(symbol_939);
			}
			symbol_198.getTemplateBindings().add(symbol_938);
		}
		symbol_198.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_198); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		symbol_199.setName("Bag");
		symbol_199.setElementType(symbol_91);
		symbol_199.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_940 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_940.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_941 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_941.setFormal(symbol_25);	
				symbol_941.setActual(symbol_91);	
				symbol_940.getParameterSubstitutions().add(symbol_941);
			}
			symbol_199.getTemplateBindings().add(symbol_940);
		}
		symbol_199.getSuperClasses().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		symbol_134.getOwnedTypes().add(symbol_199); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_200.setName("Bag");
		symbol_200.setElementType(symbol_96);
		symbol_200.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_942 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_942.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_943 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_943.setFormal(symbol_25);	
				symbol_943.setActual(symbol_96);	
				symbol_942.getParameterSubstitutions().add(symbol_943);
			}
			symbol_200.getTemplateBindings().add(symbol_942);
		}
		symbol_200.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_200); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_201.setName("Bag");
		symbol_201.setElementType(symbol_96);
		symbol_201.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_944 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_944.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_945 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_945.setFormal(symbol_25);	
				symbol_945.setActual(symbol_96);	
				symbol_944.getParameterSubstitutions().add(symbol_945);
			}
			symbol_201.getTemplateBindings().add(symbol_944);
		}
		symbol_201.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_201); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_202.setName("Bag");
		symbol_202.setElementType(symbol_96);
		symbol_202.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_946 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_946.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_947 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_947.setFormal(symbol_25);	
				symbol_947.setActual(symbol_96);	
				symbol_946.getParameterSubstitutions().add(symbol_947);
			}
			symbol_202.getTemplateBindings().add(symbol_946);
		}
		symbol_202.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_202); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_203.setName("Bag");
		symbol_203.setElementType(symbol_96);
		symbol_203.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_948 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_948.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_949 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_949.setFormal(symbol_25);	
				symbol_949.setActual(symbol_96);	
				symbol_948.getParameterSubstitutions().add(symbol_949);
			}
			symbol_203.getTemplateBindings().add(symbol_948);
		}
		symbol_203.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_203); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_204.setName("Bag");
		symbol_204.setElementType(symbol_96);
		symbol_204.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_950 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_950.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_951 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_951.setFormal(symbol_25);	
				symbol_951.setActual(symbol_96);	
				symbol_950.getParameterSubstitutions().add(symbol_951);
			}
			symbol_204.getTemplateBindings().add(symbol_950);
		}
		symbol_204.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_204); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_205.setName("Bag");
		symbol_205.setElementType(symbol_96);
		symbol_205.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_952 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_952.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_953 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_953.setFormal(symbol_25);	
				symbol_953.setActual(symbol_96);	
				symbol_952.getParameterSubstitutions().add(symbol_953);
			}
			symbol_205.getTemplateBindings().add(symbol_952);
		}
		symbol_205.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_205); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_206.setName("Bag");
		symbol_206.setElementType(symbol_105);
		symbol_206.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_954 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_954.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_955 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_955.setFormal(symbol_25);	
				symbol_955.setActual(symbol_105);	
				symbol_954.getParameterSubstitutions().add(symbol_955);
			}
			symbol_206.getTemplateBindings().add(symbol_954);
		}
		symbol_206.getSuperClasses().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_206); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_207.setName("Bag");
		symbol_207.setElementType(symbol_128);
		symbol_207.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_956 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_956.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_957 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_957.setFormal(symbol_25);	
				symbol_957.setActual(symbol_128);	
				symbol_956.getParameterSubstitutions().add(symbol_957);
			}
			symbol_207.getTemplateBindings().add(symbol_956);
		}
		symbol_207.getSuperClasses().add(symbol_246); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		symbol_134.getOwnedTypes().add(symbol_207); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_208.setName("Bag");
		symbol_208.setElementType(symbol_125);
		symbol_208.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_958 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_958.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_959 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_959.setFormal(symbol_25);	
				symbol_959.setActual(symbol_125);	
				symbol_958.getParameterSubstitutions().add(symbol_959);
			}
			symbol_208.getTemplateBindings().add(symbol_958);
		}
		symbol_208.getSuperClasses().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_208); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_209.setName("Bag");
		symbol_209.setElementType(symbol_133);
		symbol_209.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_960 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_960.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_961 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_961.setFormal(symbol_25);	
				symbol_961.setActual(symbol_133);	
				symbol_960.getParameterSubstitutions().add(symbol_961);
			}
			symbol_209.getTemplateBindings().add(symbol_960);
		}
		symbol_209.getSuperClasses().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_209); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_210.setName("Bag");
		symbol_210.setElementType(symbol_133);
		symbol_210.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_962 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_962.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_963 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_963.setFormal(symbol_25);	
				symbol_963.setActual(symbol_133);	
				symbol_962.getParameterSubstitutions().add(symbol_963);
			}
			symbol_210.getTemplateBindings().add(symbol_962);
		}
		symbol_210.getSuperClasses().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_210); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::ClassClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		//
		symbol_211.setName("ClassClassifier");
		symbol_211.setInstanceType(symbol_92);
		symbol_211.setUnspecializedElement(symbol_37);
		{
			TemplateBinding symbol_964 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_964.setSignature(symbol_38);
			{
				TemplateParameterSubstitution symbol_965 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_965.setFormal(symbol_39);	
				symbol_965.setActual(symbol_92);	
				symbol_964.getParameterSubstitutions().add(symbol_965);
			}
			symbol_211.getTemplateBindings().add(symbol_964);
		}
		symbol_211.getSuperClasses().add(symbol_187); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		
		symbol_134.getOwnedTypes().add(symbol_211); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		//
		// ocl::$$::ClassClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_212.setName("ClassClassifier");
		symbol_212.setInstanceType(symbol_96);
		symbol_212.setUnspecializedElement(symbol_37);
		{
			TemplateBinding symbol_966 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_966.setSignature(symbol_38);
			{
				TemplateParameterSubstitution symbol_967 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_967.setFormal(symbol_39);	
				symbol_967.setActual(symbol_96);	
				symbol_966.getParameterSubstitutions().add(symbol_967);
			}
			symbol_212.getTemplateBindings().add(symbol_966);
		}
		symbol_212.getSuperClasses().add(symbol_188); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_212); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::ClassClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		//
		symbol_213.setName("ClassClassifier");
		symbol_213.setInstanceType(symbol_101);
		symbol_213.setUnspecializedElement(symbol_37);
		{
			TemplateBinding symbol_968 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_968.setSignature(symbol_38);
			{
				TemplateParameterSubstitution symbol_969 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_969.setFormal(symbol_39);	
				symbol_969.setActual(symbol_101);	
				symbol_968.getParameterSubstitutions().add(symbol_969);
			}
			symbol_213.getTemplateBindings().add(symbol_968);
		}
		symbol_213.getSuperClasses().add(symbol_189); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		
		symbol_134.getOwnedTypes().add(symbol_213); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		//
		// ocl::$$::CollectionClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_214.setName("CollectionClassifier");
		symbol_214.setInstanceType(symbol_96);
		symbol_214.setUnspecializedElement(symbol_41);
		{
			TemplateBinding symbol_970 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_970.setSignature(symbol_42);
			{
				TemplateParameterSubstitution symbol_971 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_971.setFormal(symbol_45);	
				symbol_971.setActual(symbol_51);	
				symbol_970.getParameterSubstitutions().add(symbol_971);
			}{
				TemplateParameterSubstitution symbol_972 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_972.setFormal(symbol_43);	
				symbol_972.setActual(symbol_96);	
				symbol_970.getParameterSubstitutions().add(symbol_972);
			}
			symbol_214.getTemplateBindings().add(symbol_970);
		}
		symbol_214.getSuperClasses().add(symbol_188); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_214); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Integer]
		//
		symbol_215.setName("Collection");
		symbol_215.setElementType(symbol_12);
		symbol_215.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_973 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_973.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_974 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_974.setFormal(symbol_50);	
				symbol_974.setActual(symbol_12);	
				symbol_973.getParameterSubstitutions().add(symbol_974);
			}
			symbol_215.getTemplateBindings().add(symbol_973);
		}
		symbol_215.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Integer]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		//
		symbol_216.setName("Collection");
		symbol_216.setElementType(symbol_14);
		symbol_216.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_975 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_975.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_976 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_976.setFormal(symbol_50);	
				symbol_976.setActual(symbol_14);	
				symbol_975.getParameterSubstitutions().add(symbol_976);
			}
			symbol_216.getTemplateBindings().add(symbol_975);
		}
		symbol_216.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_217.setName("Collection");
		symbol_217.setElementType(symbol_170);
		symbol_217.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_977 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_977.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_978 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_978.setFormal(symbol_50);	
				symbol_978.setActual(symbol_170);	
				symbol_977.getParameterSubstitutions().add(symbol_978);
			}
			symbol_217.getTemplateBindings().add(symbol_977);
		}
		symbol_217.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_217); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_218.setName("Collection");
		symbol_218.setElementType(symbol_170);
		symbol_218.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_979 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_979.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_980 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_980.setFormal(symbol_50);	
				symbol_980.setActual(symbol_170);	
				symbol_979.getParameterSubstitutions().add(symbol_980);
			}
			symbol_218.getTemplateBindings().add(symbol_979);
		}
		symbol_218.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_218); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_219.setName("Collection");
		symbol_219.setElementType(symbol_29);
		symbol_219.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_981 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_981.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_982 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_982.setFormal(symbol_50);	
				symbol_982.setActual(symbol_29);	
				symbol_981.getParameterSubstitutions().add(symbol_982);
			}
			symbol_219.getTemplateBindings().add(symbol_981);
		}
		symbol_219.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		symbol_220.setName("Collection");
		symbol_220.setElementType(symbol_35);
		symbol_220.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_983 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_983.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_984 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_984.setFormal(symbol_50);	
				symbol_984.setActual(symbol_35);	
				symbol_983.getParameterSubstitutions().add(symbol_984);
			}
			symbol_220.getTemplateBindings().add(symbol_983);
		}
		symbol_220.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_220); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_221.setName("Collection");
		symbol_221.setElementType(symbol_26);
		symbol_221.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_985 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_985.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_986 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_986.setFormal(symbol_50);	
				symbol_986.setActual(symbol_26);	
				symbol_985.getParameterSubstitutions().add(symbol_986);
			}
			symbol_221.getTemplateBindings().add(symbol_985);
		}
		symbol_221.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_221); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_222.setName("Collection");
		symbol_222.setElementType(symbol_26);
		symbol_222.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_987 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_987.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_988 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_988.setFormal(symbol_50);	
				symbol_988.setActual(symbol_26);	
				symbol_987.getParameterSubstitutions().add(symbol_988);
			}
			symbol_222.getTemplateBindings().add(symbol_987);
		}
		symbol_222.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_222); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_223.setName("Collection");
		symbol_223.setElementType(symbol_26);
		symbol_223.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_989 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_989.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_990 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_990.setFormal(symbol_50);	
				symbol_990.setActual(symbol_26);	
				symbol_989.getParameterSubstitutions().add(symbol_990);
			}
			symbol_223.getTemplateBindings().add(symbol_989);
		}
		symbol_223.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_224.setName("Collection");
		symbol_224.setElementType(symbol_54);
		symbol_224.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_991 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_991.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_992 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_992.setFormal(symbol_50);	
				symbol_992.setActual(symbol_54);	
				symbol_991.getParameterSubstitutions().add(symbol_992);
			}
			symbol_224.getTemplateBindings().add(symbol_991);
		}
		symbol_224.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_224); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		symbol_225.setName("Collection");
		symbol_225.setElementType(symbol_60);
		symbol_225.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_993 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_993.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_994 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_994.setFormal(symbol_50);	
				symbol_994.setActual(symbol_60);	
				symbol_993.getParameterSubstitutions().add(symbol_994);
			}
			symbol_225.getTemplateBindings().add(symbol_993);
		}
		symbol_225.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_225); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
		//
		symbol_226.setName("Collection");
		symbol_226.setElementType(symbol_63);
		symbol_226.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_995 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_995.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_996 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_996.setFormal(symbol_50);	
				symbol_996.setActual(symbol_63);	
				symbol_995.getParameterSubstitutions().add(symbol_996);
			}
			symbol_226.getTemplateBindings().add(symbol_995);
		}
		symbol_226.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_226); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		symbol_227.setName("Collection");
		symbol_227.setElementType(symbol_66);
		symbol_227.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_997 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_997.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_998 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_998.setFormal(symbol_50);	
				symbol_998.setActual(symbol_66);	
				symbol_997.getParameterSubstitutions().add(symbol_998);
			}
			symbol_227.getTemplateBindings().add(symbol_997);
		}
		symbol_227.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		symbol_228.setName("Collection");
		symbol_228.setElementType(symbol_72);
		symbol_228.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_999 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_999.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1000 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1000.setFormal(symbol_50);	
				symbol_1000.setActual(symbol_72);	
				symbol_999.getParameterSubstitutions().add(symbol_1000);
			}
			symbol_228.getTemplateBindings().add(symbol_999);
		}
		symbol_228.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_229.setName("Collection");
		symbol_229.setElementType(symbol_51);
		symbol_229.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1001 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1001.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1002 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1002.setFormal(symbol_50);	
				symbol_1002.setActual(symbol_51);	
				symbol_1001.getParameterSubstitutions().add(symbol_1002);
			}
			symbol_229.getTemplateBindings().add(symbol_1001);
		}
		symbol_229.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_230.setName("Collection");
		symbol_230.setElementType(symbol_51);
		symbol_230.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1003 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1003.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1004 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1004.setFormal(symbol_50);	
				symbol_1004.setActual(symbol_51);	
				symbol_1003.getParameterSubstitutions().add(symbol_1004);
			}
			symbol_230.getTemplateBindings().add(symbol_1003);
		}
		symbol_230.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_231.setName("Collection");
		symbol_231.setElementType(symbol_51);
		symbol_231.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1005 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1005.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1006 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1006.setFormal(symbol_50);	
				symbol_1006.setActual(symbol_51);	
				symbol_1005.getParameterSubstitutions().add(symbol_1006);
			}
			symbol_231.getTemplateBindings().add(symbol_1005);
		}
		symbol_231.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_232.setName("Collection");
		symbol_232.setElementType(symbol_79);
		symbol_232.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1007 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1007.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1008 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1008.setFormal(symbol_50);	
				symbol_1008.setActual(symbol_79);	
				symbol_1007.getParameterSubstitutions().add(symbol_1008);
			}
			symbol_232.getTemplateBindings().add(symbol_1007);
		}
		symbol_232.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_233.setName("Collection");
		symbol_233.setElementType(symbol_80);
		symbol_233.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1009 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1009.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1010 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1010.setFormal(symbol_50);	
				symbol_1010.setActual(symbol_80);	
				symbol_1009.getParameterSubstitutions().add(symbol_1010);
			}
			symbol_233.getTemplateBindings().add(symbol_1009);
		}
		symbol_233.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_233); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_234.setName("Collection");
		symbol_234.setElementType(symbol_80);
		symbol_234.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1011 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1011.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1012 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1012.setFormal(symbol_50);	
				symbol_1012.setActual(symbol_80);	
				symbol_1011.getParameterSubstitutions().add(symbol_1012);
			}
			symbol_234.getTemplateBindings().add(symbol_1011);
		}
		symbol_234.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_234); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_235.setName("Collection");
		symbol_235.setElementType(symbol_80);
		symbol_235.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1013 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1013.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1014 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1014.setFormal(symbol_50);	
				symbol_1014.setActual(symbol_80);	
				symbol_1013.getParameterSubstitutions().add(symbol_1014);
			}
			symbol_235.getTemplateBindings().add(symbol_1013);
		}
		symbol_235.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_236.setName("Collection");
		symbol_236.setElementType(symbol_80);
		symbol_236.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1015 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1015.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1016 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1016.setFormal(symbol_50);	
				symbol_1016.setActual(symbol_80);	
				symbol_1015.getParameterSubstitutions().add(symbol_1016);
			}
			symbol_236.getTemplateBindings().add(symbol_1015);
		}
		symbol_236.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		symbol_237.setName("Collection");
		symbol_237.setElementType(symbol_91);
		symbol_237.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1017 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1017.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1018 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1018.setFormal(symbol_50);	
				symbol_1018.setActual(symbol_91);	
				symbol_1017.getParameterSubstitutions().add(symbol_1018);
			}
			symbol_237.getTemplateBindings().add(symbol_1017);
		}
		symbol_237.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_238.setName("Collection");
		symbol_238.setElementType(symbol_96);
		symbol_238.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1019 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1019.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1020 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1020.setFormal(symbol_50);	
				symbol_1020.setActual(symbol_96);	
				symbol_1019.getParameterSubstitutions().add(symbol_1020);
			}
			symbol_238.getTemplateBindings().add(symbol_1019);
		}
		symbol_238.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_239.setName("Collection");
		symbol_239.setElementType(symbol_108);
		symbol_239.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1021 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1021.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1022 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1022.setFormal(symbol_50);	
				symbol_1022.setActual(symbol_108);	
				symbol_1021.getParameterSubstitutions().add(symbol_1022);
			}
			symbol_239.getTemplateBindings().add(symbol_1021);
		}
		symbol_239.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_240.setName("Collection");
		symbol_240.setElementType(symbol_105);
		symbol_240.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1023 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1023.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1024 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1024.setFormal(symbol_50);	
				symbol_1024.setActual(symbol_105);	
				symbol_1023.getParameterSubstitutions().add(symbol_1024);
			}
			symbol_240.getTemplateBindings().add(symbol_1023);
		}
		symbol_240.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_240); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_241.setName("Collection");
		symbol_241.setElementType(symbol_105);
		symbol_241.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1025 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1025.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1026 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1026.setFormal(symbol_50);	
				symbol_1026.setActual(symbol_105);	
				symbol_1025.getParameterSubstitutions().add(symbol_1026);
			}
			symbol_241.getTemplateBindings().add(symbol_1025);
		}
		symbol_241.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_242.setName("Collection");
		symbol_242.setElementType(symbol_115);
		symbol_242.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1027 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1027.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1028 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1028.setFormal(symbol_50);	
				symbol_1028.setActual(symbol_115);	
				symbol_1027.getParameterSubstitutions().add(symbol_1028);
			}
			symbol_242.getTemplateBindings().add(symbol_1027);
		}
		symbol_242.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_243.setName("Collection");
		symbol_243.setElementType(symbol_121);
		symbol_243.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1029 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1029.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1030 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1030.setFormal(symbol_50);	
				symbol_1030.setActual(symbol_121);	
				symbol_1029.getParameterSubstitutions().add(symbol_1030);
			}
			symbol_243.getTemplateBindings().add(symbol_1029);
		}
		symbol_243.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_243); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_244.setName("Collection");
		symbol_244.setElementType(symbol_112);
		symbol_244.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1031 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1031.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1032 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1032.setFormal(symbol_50);	
				symbol_1032.setActual(symbol_112);	
				symbol_1031.getParameterSubstitutions().add(symbol_1032);
			}
			symbol_244.getTemplateBindings().add(symbol_1031);
		}
		symbol_244.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_245.setName("Collection");
		symbol_245.setElementType(symbol_112);
		symbol_245.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1033 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1033.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1034 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1034.setFormal(symbol_50);	
				symbol_1034.setActual(symbol_112);	
				symbol_1033.getParameterSubstitutions().add(symbol_1034);
			}
			symbol_245.getTemplateBindings().add(symbol_1033);
		}
		symbol_245.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_245); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_246.setName("Collection");
		symbol_246.setElementType(symbol_128);
		symbol_246.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1035 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1035.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1036 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1036.setFormal(symbol_50);	
				symbol_1036.setActual(symbol_128);	
				symbol_1035.getParameterSubstitutions().add(symbol_1036);
			}
			symbol_246.getTemplateBindings().add(symbol_1035);
		}
		symbol_246.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_246); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_247.setName("Collection");
		symbol_247.setElementType(symbol_125);
		symbol_247.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1037 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1037.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1038 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1038.setFormal(symbol_50);	
				symbol_1038.setActual(symbol_125);	
				symbol_1037.getParameterSubstitutions().add(symbol_1038);
			}
			symbol_247.getTemplateBindings().add(symbol_1037);
		}
		symbol_247.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_248.setName("Collection");
		symbol_248.setElementType(symbol_125);
		symbol_248.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1039 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1039.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1040 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1040.setFormal(symbol_50);	
				symbol_1040.setActual(symbol_125);	
				symbol_1039.getParameterSubstitutions().add(symbol_1040);
			}
			symbol_248.getTemplateBindings().add(symbol_1039);
		}
		symbol_248.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_249.setName("Collection");
		symbol_249.setElementType(symbol_133);
		symbol_249.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1041 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1041.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1042 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1042.setFormal(symbol_50);	
				symbol_1042.setActual(symbol_133);	
				symbol_1041.getParameterSubstitutions().add(symbol_1042);
			}
			symbol_249.getTemplateBindings().add(symbol_1041);
		}
		symbol_249.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_250.setName("Collection");
		symbol_250.setElementType(symbol_133);
		symbol_250.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1043 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1043.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1044 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1044.setFormal(symbol_50);	
				symbol_1044.setActual(symbol_133);	
				symbol_1043.getParameterSubstitutions().add(symbol_1044);
			}
			symbol_250.getTemplateBindings().add(symbol_1043);
		}
		symbol_250.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_250); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::EnumerationClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_251.setName("EnumerationClassifier");
		symbol_251.setInstanceType(symbol_96);
		symbol_251.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_1045 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1045.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_1046 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1046.setFormal(symbol_76);	
				symbol_1046.setActual(symbol_96);	
				symbol_1045.getParameterSubstitutions().add(symbol_1046);
			}
			symbol_251.getTemplateBindings().add(symbol_1045);
		}
		symbol_251.getSuperClasses().add(symbol_188); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_251); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_252.setName("OrderedSet");
		symbol_252.setElementType(symbol_51);
		symbol_252.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_1047 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1047.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_1048 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1048.setFormal(symbol_104);	
				symbol_1048.setActual(symbol_51);	
				symbol_1047.getParameterSubstitutions().add(symbol_1048);
			}
			symbol_252.getTemplateBindings().add(symbol_1047);
		}
		symbol_252.getSuperClasses().add(symbol_261); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_252.getSuperClasses().add(symbol_285); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_252); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_253.setName("OrderedSet");
		symbol_253.setElementType(symbol_79);
		symbol_253.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_1049 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1049.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_1050 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1050.setFormal(symbol_104);	
				symbol_1050.setActual(symbol_79);	
				symbol_1049.getParameterSubstitutions().add(symbol_1050);
			}
			symbol_253.getTemplateBindings().add(symbol_1049);
		}
		symbol_253.getSuperClasses().add(symbol_262); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		symbol_253.getSuperClasses().add(symbol_286); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		symbol_134.getOwnedTypes().add(symbol_253); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_254.setName("OrderedSet");
		symbol_254.setElementType(symbol_108);
		symbol_254.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_1051 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1051.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_1052 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1052.setFormal(symbol_104);	
				symbol_1052.setActual(symbol_108);	
				symbol_1051.getParameterSubstitutions().add(symbol_1052);
			}
			symbol_254.getTemplateBindings().add(symbol_1051);
		}
		symbol_254.getSuperClasses().add(symbol_263); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		symbol_254.getSuperClasses().add(symbol_295); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		symbol_134.getOwnedTypes().add(symbol_254); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_255.setName("OrderedSet");
		symbol_255.setElementType(symbol_112);
		symbol_255.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_1053 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1053.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_1054 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1054.setFormal(symbol_104);	
				symbol_1054.setActual(symbol_112);	
				symbol_1053.getParameterSubstitutions().add(symbol_1054);
			}
			symbol_255.getTemplateBindings().add(symbol_1053);
		}
		symbol_255.getSuperClasses().add(symbol_267); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		symbol_255.getSuperClasses().add(symbol_298); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_255); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_256.setName("OrderedSet");
		symbol_256.setElementType(symbol_125);
		symbol_256.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_1055 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1055.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_1056 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1056.setFormal(symbol_104);	
				symbol_1056.setActual(symbol_125);	
				symbol_1055.getParameterSubstitutions().add(symbol_1056);
			}
			symbol_256.getTemplateBindings().add(symbol_1055);
		}
		symbol_256.getSuperClasses().add(symbol_269); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		symbol_256.getSuperClasses().add(symbol_300); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_256); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_257.setName("OrderedSet");
		symbol_257.setElementType(symbol_133);
		symbol_257.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_1057 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1057.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_1058 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1058.setFormal(symbol_104);	
				symbol_1058.setActual(symbol_133);	
				symbol_1057.getParameterSubstitutions().add(symbol_1058);
			}
			symbol_257.getTemplateBindings().add(symbol_1057);
		}
		symbol_257.getSuperClasses().add(symbol_270); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_257.getSuperClasses().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_257); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[Integer]
		//
		symbol_258.setName("Sequence");
		symbol_258.setElementType(symbol_12);
		symbol_258.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1059 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1059.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1060 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1060.setFormal(symbol_111);	
				symbol_1060.setActual(symbol_12);	
				symbol_1059.getParameterSubstitutions().add(symbol_1060);
			}
			symbol_258.getTemplateBindings().add(symbol_1059);
		}
		symbol_258.getSuperClasses().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Integer]
		
		symbol_134.getOwnedTypes().add(symbol_258); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[Integer]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
		//
		symbol_259.setName("Sequence");
		symbol_259.setElementType(symbol_14);
		symbol_259.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1061 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1061.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1062 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1062.setFormal(symbol_111);	
				symbol_1062.setActual(symbol_14);	
				symbol_1061.getParameterSubstitutions().add(symbol_1062);
			}
			symbol_259.getTemplateBindings().add(symbol_1061);
		}
		symbol_259.getSuperClasses().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		
		symbol_134.getOwnedTypes().add(symbol_259); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_260.setName("Sequence");
		symbol_260.setElementType(symbol_26);
		symbol_260.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1063 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1063.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1064 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1064.setFormal(symbol_111);	
				symbol_1064.setActual(symbol_26);	
				symbol_1063.getParameterSubstitutions().add(symbol_1064);
			}
			symbol_260.getTemplateBindings().add(symbol_1063);
		}
		symbol_260.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_260); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_261.setName("Sequence");
		symbol_261.setElementType(symbol_51);
		symbol_261.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1065 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1065.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1066 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1066.setFormal(symbol_111);	
				symbol_1066.setActual(symbol_51);	
				symbol_1065.getParameterSubstitutions().add(symbol_1066);
			}
			symbol_261.getTemplateBindings().add(symbol_1065);
		}
		symbol_261.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_261); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_262.setName("Sequence");
		symbol_262.setElementType(symbol_79);
		symbol_262.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1067 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1067.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1068 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1068.setFormal(symbol_111);	
				symbol_1068.setActual(symbol_79);	
				symbol_1067.getParameterSubstitutions().add(symbol_1068);
			}
			symbol_262.getTemplateBindings().add(symbol_1067);
		}
		symbol_262.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		symbol_134.getOwnedTypes().add(symbol_262); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_263.setName("Sequence");
		symbol_263.setElementType(symbol_108);
		symbol_263.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1069 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1069.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1070 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1070.setFormal(symbol_111);	
				symbol_1070.setActual(symbol_108);	
				symbol_1069.getParameterSubstitutions().add(symbol_1070);
			}
			symbol_263.getTemplateBindings().add(symbol_1069);
		}
		symbol_263.getSuperClasses().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		symbol_134.getOwnedTypes().add(symbol_263); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_264.setName("Sequence");
		symbol_264.setElementType(symbol_105);
		symbol_264.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1071 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1071.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1072 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1072.setFormal(symbol_111);	
				symbol_1072.setActual(symbol_105);	
				symbol_1071.getParameterSubstitutions().add(symbol_1072);
			}
			symbol_264.getTemplateBindings().add(symbol_1071);
		}
		symbol_264.getSuperClasses().add(symbol_240); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_264); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_265.setName("Sequence");
		symbol_265.setElementType(symbol_115);
		symbol_265.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1073 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1073.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1074 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1074.setFormal(symbol_111);	
				symbol_1074.setActual(symbol_115);	
				symbol_1073.getParameterSubstitutions().add(symbol_1074);
			}
			symbol_265.getTemplateBindings().add(symbol_1073);
		}
		symbol_265.getSuperClasses().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		
		symbol_134.getOwnedTypes().add(symbol_265); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_266.setName("Sequence");
		symbol_266.setElementType(symbol_121);
		symbol_266.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1075 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1075.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1076 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1076.setFormal(symbol_111);	
				symbol_1076.setActual(symbol_121);	
				symbol_1075.getParameterSubstitutions().add(symbol_1076);
			}
			symbol_266.getTemplateBindings().add(symbol_1075);
		}
		symbol_266.getSuperClasses().add(symbol_243); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		symbol_134.getOwnedTypes().add(symbol_266); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_267.setName("Sequence");
		symbol_267.setElementType(symbol_112);
		symbol_267.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1077 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1077.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1078 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1078.setFormal(symbol_111);	
				symbol_1078.setActual(symbol_112);	
				symbol_1077.getParameterSubstitutions().add(symbol_1078);
			}
			symbol_267.getTemplateBindings().add(symbol_1077);
		}
		symbol_267.getSuperClasses().add(symbol_245); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_267); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_268.setName("Sequence");
		symbol_268.setElementType(symbol_112);
		symbol_268.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1079 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1079.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1080 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1080.setFormal(symbol_111);	
				symbol_1080.setActual(symbol_112);	
				symbol_1079.getParameterSubstitutions().add(symbol_1080);
			}
			symbol_268.getTemplateBindings().add(symbol_1079);
		}
		symbol_268.getSuperClasses().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_268); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_269.setName("Sequence");
		symbol_269.setElementType(symbol_125);
		symbol_269.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1081 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1081.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1082 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1082.setFormal(symbol_111);	
				symbol_1082.setActual(symbol_125);	
				symbol_1081.getParameterSubstitutions().add(symbol_1082);
			}
			symbol_269.getTemplateBindings().add(symbol_1081);
		}
		symbol_269.getSuperClasses().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_269); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_270.setName("Sequence");
		symbol_270.setElementType(symbol_133);
		symbol_270.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1083 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1083.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1084 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1084.setFormal(symbol_111);	
				symbol_1084.setActual(symbol_133);	
				symbol_1083.getParameterSubstitutions().add(symbol_1084);
			}
			symbol_270.getTemplateBindings().add(symbol_1083);
		}
		symbol_270.getSuperClasses().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_270); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_271.setName("Set");
		symbol_271.setElementType(symbol_176);
		symbol_271.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1085 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1085.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1086 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1086.setFormal(symbol_124);	
				symbol_1086.setActual(symbol_167);	
				symbol_1085.getParameterSubstitutions().add(symbol_1086);
			}
			symbol_271.getTemplateBindings().add(symbol_1085);
		}
		symbol_271.getSuperClasses().add(symbol_191); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_271.getSuperClasses().add(symbol_279); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_134.getOwnedTypes().add(symbol_271); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_272.setName("Set");
		symbol_272.setElementType(symbol_26);
		symbol_272.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1087 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1087.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1088 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1088.setFormal(symbol_124);	
				symbol_1088.setActual(symbol_26);	
				symbol_1087.getParameterSubstitutions().add(symbol_1088);
			}
			symbol_272.getTemplateBindings().add(symbol_1087);
		}
		symbol_272.getSuperClasses().add(symbol_196); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		symbol_272.getSuperClasses().add(symbol_284); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_273.setName("Set");
		symbol_273.setElementType(symbol_51);
		symbol_273.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1089 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1089.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1090 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1090.setFormal(symbol_124);	
				symbol_1090.setActual(symbol_51);	
				symbol_1089.getParameterSubstitutions().add(symbol_1090);
			}
			symbol_273.getTemplateBindings().add(symbol_1089);
		}
		symbol_273.getSuperClasses().add(symbol_198); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_273.getSuperClasses().add(symbol_285); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_273); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		symbol_274.setName("Set");
		symbol_274.setElementType(symbol_91);
		symbol_274.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1091 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1091.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1092 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1092.setFormal(symbol_124);	
				symbol_1092.setActual(symbol_91);	
				symbol_1091.getParameterSubstitutions().add(symbol_1092);
			}
			symbol_274.getTemplateBindings().add(symbol_1091);
		}
		symbol_274.getSuperClasses().add(symbol_199); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		symbol_274.getSuperClasses().add(symbol_288); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		symbol_134.getOwnedTypes().add(symbol_274); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_275.setName("Set");
		symbol_275.setElementType(symbol_96);
		symbol_275.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1093 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1093.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1094 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1094.setFormal(symbol_124);	
				symbol_1094.setActual(symbol_96);	
				symbol_1093.getParameterSubstitutions().add(symbol_1094);
			}
			symbol_275.getTemplateBindings().add(symbol_1093);
		}
		symbol_275.getSuperClasses().add(symbol_200); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_275.getSuperClasses().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_275); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_276.setName("Set");
		symbol_276.setElementType(symbol_105);
		symbol_276.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1095 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1095.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1096 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1096.setFormal(symbol_124);	
				symbol_1096.setActual(symbol_105);	
				symbol_1095.getParameterSubstitutions().add(symbol_1096);
			}
			symbol_276.getTemplateBindings().add(symbol_1095);
		}
		symbol_276.getSuperClasses().add(symbol_206); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_276.getSuperClasses().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_276); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_277.setName("Set");
		symbol_277.setElementType(symbol_128);
		symbol_277.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1097 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1097.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1098 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1098.setFormal(symbol_124);	
				symbol_1098.setActual(symbol_128);	
				symbol_1097.getParameterSubstitutions().add(symbol_1098);
			}
			symbol_277.getTemplateBindings().add(symbol_1097);
		}
		symbol_277.getSuperClasses().add(symbol_207); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		symbol_277.getSuperClasses().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		symbol_134.getOwnedTypes().add(symbol_277); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_278.setName("Set");
		symbol_278.setElementType(symbol_133);
		symbol_278.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1099 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1099.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1100 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1100.setFormal(symbol_124);	
				symbol_1100.setActual(symbol_133);	
				symbol_1099.getParameterSubstitutions().add(symbol_1100);
			}
			symbol_278.getTemplateBindings().add(symbol_1099);
		}
		symbol_278.getSuperClasses().add(symbol_209); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_278.getSuperClasses().add(symbol_302); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_278); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_279.setName("UniqueCollection");
		symbol_279.setElementType(symbol_176);
		symbol_279.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1101 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1101.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1102 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1102.setFormal(symbol_132);	
				symbol_1102.setActual(symbol_167);	
				symbol_1101.getParameterSubstitutions().add(symbol_1102);
			}
			symbol_279.getTemplateBindings().add(symbol_1101);
		}
		symbol_279.getSuperClasses().add(symbol_217); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_134.getOwnedTypes().add(symbol_279); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_280.setName("UniqueCollection");
		symbol_280.setElementType(symbol_176);
		symbol_280.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1103 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1103.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1104 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1104.setFormal(symbol_132);	
				symbol_1104.setActual(symbol_167);	
				symbol_1103.getParameterSubstitutions().add(symbol_1104);
			}
			symbol_280.getTemplateBindings().add(symbol_1103);
		}
		symbol_280.getSuperClasses().add(symbol_217); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_134.getOwnedTypes().add(symbol_280); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_281.setName("UniqueCollection");
		symbol_281.setElementType(symbol_26);
		symbol_281.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1105 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1105.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1106 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1106.setFormal(symbol_132);	
				symbol_1106.setActual(symbol_26);	
				symbol_1105.getParameterSubstitutions().add(symbol_1106);
			}
			symbol_281.getTemplateBindings().add(symbol_1105);
		}
		symbol_281.getSuperClasses().add(symbol_222); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_281); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_282.setName("UniqueCollection");
		symbol_282.setElementType(symbol_26);
		symbol_282.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1107 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1107.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1108 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1108.setFormal(symbol_132);	
				symbol_1108.setActual(symbol_26);	
				symbol_1107.getParameterSubstitutions().add(symbol_1108);
			}
			symbol_282.getTemplateBindings().add(symbol_1107);
		}
		symbol_282.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_282); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_283.setName("UniqueCollection");
		symbol_283.setElementType(symbol_26);
		symbol_283.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1109 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1109.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1110 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1110.setFormal(symbol_132);	
				symbol_1110.setActual(symbol_26);	
				symbol_1109.getParameterSubstitutions().add(symbol_1110);
			}
			symbol_283.getTemplateBindings().add(symbol_1109);
		}
		symbol_283.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_283); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_284.setName("UniqueCollection");
		symbol_284.setElementType(symbol_26);
		symbol_284.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1111 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1111.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1112 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1112.setFormal(symbol_132);	
				symbol_1112.setActual(symbol_26);	
				symbol_1111.getParameterSubstitutions().add(symbol_1112);
			}
			symbol_284.getTemplateBindings().add(symbol_1111);
		}
		symbol_284.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_284); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_285.setName("UniqueCollection");
		symbol_285.setElementType(symbol_51);
		symbol_285.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1113 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1113.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1114 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1114.setFormal(symbol_132);	
				symbol_1114.setActual(symbol_51);	
				symbol_1113.getParameterSubstitutions().add(symbol_1114);
			}
			symbol_285.getTemplateBindings().add(symbol_1113);
		}
		symbol_285.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_285); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_286.setName("UniqueCollection");
		symbol_286.setElementType(symbol_79);
		symbol_286.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1115 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1115.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1116 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1116.setFormal(symbol_132);	
				symbol_1116.setActual(symbol_79);	
				symbol_1115.getParameterSubstitutions().add(symbol_1116);
			}
			symbol_286.getTemplateBindings().add(symbol_1115);
		}
		symbol_286.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		symbol_134.getOwnedTypes().add(symbol_286); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_287.setName("UniqueCollection");
		symbol_287.setElementType(symbol_80);
		symbol_287.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1117 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1117.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1118 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1118.setFormal(symbol_132);	
				symbol_1118.setActual(symbol_80);	
				symbol_1117.getParameterSubstitutions().add(symbol_1118);
			}
			symbol_287.getTemplateBindings().add(symbol_1117);
		}
		symbol_287.getSuperClasses().add(symbol_234); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		symbol_134.getOwnedTypes().add(symbol_287); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		symbol_288.setName("UniqueCollection");
		symbol_288.setElementType(symbol_91);
		symbol_288.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1119 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1119.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1120 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1120.setFormal(symbol_132);	
				symbol_1120.setActual(symbol_91);	
				symbol_1119.getParameterSubstitutions().add(symbol_1120);
			}
			symbol_288.getTemplateBindings().add(symbol_1119);
		}
		symbol_288.getSuperClasses().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		symbol_134.getOwnedTypes().add(symbol_288); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_289.setName("UniqueCollection");
		symbol_289.setElementType(symbol_96);
		symbol_289.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1121 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1121.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1122 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1122.setFormal(symbol_132);	
				symbol_1122.setActual(symbol_96);	
				symbol_1121.getParameterSubstitutions().add(symbol_1122);
			}
			symbol_289.getTemplateBindings().add(symbol_1121);
		}
		symbol_289.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_289); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_290.setName("UniqueCollection");
		symbol_290.setElementType(symbol_96);
		symbol_290.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1123 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1123.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1124 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1124.setFormal(symbol_132);	
				symbol_1124.setActual(symbol_96);	
				symbol_1123.getParameterSubstitutions().add(symbol_1124);
			}
			symbol_290.getTemplateBindings().add(symbol_1123);
		}
		symbol_290.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_290); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_291.setName("UniqueCollection");
		symbol_291.setElementType(symbol_96);
		symbol_291.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1125 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1125.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1126 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1126.setFormal(symbol_132);	
				symbol_1126.setActual(symbol_96);	
				symbol_1125.getParameterSubstitutions().add(symbol_1126);
			}
			symbol_291.getTemplateBindings().add(symbol_1125);
		}
		symbol_291.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_292.setName("UniqueCollection");
		symbol_292.setElementType(symbol_96);
		symbol_292.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1127 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1127.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1128 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1128.setFormal(symbol_132);	
				symbol_1128.setActual(symbol_96);	
				symbol_1127.getParameterSubstitutions().add(symbol_1128);
			}
			symbol_292.getTemplateBindings().add(symbol_1127);
		}
		symbol_292.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_292); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_293.setName("UniqueCollection");
		symbol_293.setElementType(symbol_96);
		symbol_293.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1129 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1129.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1130 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1130.setFormal(symbol_132);	
				symbol_1130.setActual(symbol_96);	
				symbol_1129.getParameterSubstitutions().add(symbol_1130);
			}
			symbol_293.getTemplateBindings().add(symbol_1129);
		}
		symbol_293.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_294.setName("UniqueCollection");
		symbol_294.setElementType(symbol_96);
		symbol_294.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1131 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1131.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1132 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1132.setFormal(symbol_132);	
				symbol_1132.setActual(symbol_96);	
				symbol_1131.getParameterSubstitutions().add(symbol_1132);
			}
			symbol_294.getTemplateBindings().add(symbol_1131);
		}
		symbol_294.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_295.setName("UniqueCollection");
		symbol_295.setElementType(symbol_108);
		symbol_295.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1133 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1133.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1134 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1134.setFormal(symbol_132);	
				symbol_1134.setActual(symbol_108);	
				symbol_1133.getParameterSubstitutions().add(symbol_1134);
			}
			symbol_295.getTemplateBindings().add(symbol_1133);
		}
		symbol_295.getSuperClasses().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		symbol_134.getOwnedTypes().add(symbol_295); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_296.setName("UniqueCollection");
		symbol_296.setElementType(symbol_105);
		symbol_296.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1135 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1135.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1136 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1136.setFormal(symbol_132);	
				symbol_1136.setActual(symbol_105);	
				symbol_1135.getParameterSubstitutions().add(symbol_1136);
			}
			symbol_296.getTemplateBindings().add(symbol_1135);
		}
		symbol_296.getSuperClasses().add(symbol_240); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_297.setName("UniqueCollection");
		symbol_297.setElementType(symbol_112);
		symbol_297.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1137 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1137.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1138 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1138.setFormal(symbol_132);	
				symbol_1138.setActual(symbol_112);	
				symbol_1137.getParameterSubstitutions().add(symbol_1138);
			}
			symbol_297.getTemplateBindings().add(symbol_1137);
		}
		symbol_297.getSuperClasses().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_297); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_298.setName("UniqueCollection");
		symbol_298.setElementType(symbol_112);
		symbol_298.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1139 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1139.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1140 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1140.setFormal(symbol_132);	
				symbol_1140.setActual(symbol_112);	
				symbol_1139.getParameterSubstitutions().add(symbol_1140);
			}
			symbol_298.getTemplateBindings().add(symbol_1139);
		}
		symbol_298.getSuperClasses().add(symbol_245); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_298); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_299.setName("UniqueCollection");
		symbol_299.setElementType(symbol_128);
		symbol_299.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1141 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1141.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1142 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1142.setFormal(symbol_132);	
				symbol_1142.setActual(symbol_128);	
				symbol_1141.getParameterSubstitutions().add(symbol_1142);
			}
			symbol_299.getTemplateBindings().add(symbol_1141);
		}
		symbol_299.getSuperClasses().add(symbol_246); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		symbol_134.getOwnedTypes().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_300.setName("UniqueCollection");
		symbol_300.setElementType(symbol_125);
		symbol_300.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1143 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1143.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1144 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1144.setFormal(symbol_132);	
				symbol_1144.setActual(symbol_125);	
				symbol_1143.getParameterSubstitutions().add(symbol_1144);
			}
			symbol_300.getTemplateBindings().add(symbol_1143);
		}
		symbol_300.getSuperClasses().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_300); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_301.setName("UniqueCollection");
		symbol_301.setElementType(symbol_133);
		symbol_301.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1145 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1145.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1146 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1146.setFormal(symbol_132);	
				symbol_1146.setActual(symbol_133);	
				symbol_1145.getParameterSubstitutions().add(symbol_1146);
			}
			symbol_301.getTemplateBindings().add(symbol_1145);
		}
		symbol_301.getSuperClasses().add(symbol_250); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_302.setName("UniqueCollection");
		symbol_302.setElementType(symbol_133);
		symbol_302.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1147 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1147.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1148 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1148.setFormal(symbol_132);	
				symbol_1148.setActual(symbol_133);	
				symbol_1147.getParameterSubstitutions().add(symbol_1148);
			}
			symbol_302.getTemplateBindings().add(symbol_1147);
		}
		symbol_302.getSuperClasses().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_302); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::$$ u_r_i:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		//
		symbol_303.setName("$$");
		
		symbol_134.getOwnedTypes().add(symbol_303); // u_r_i:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		
		symbol_0.getNestedPackages().add(symbol_134);
		return symbol_0;
	}
}
