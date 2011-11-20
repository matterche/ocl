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
		
		VoidType symbol_100 = PivotFactory.eINSTANCE.createVoidType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		
		OrderedSetType symbol_101 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
		TemplateSignature symbol_102 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!
		TypeTemplateParameter symbol_103 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_104 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
		
		TemplateSignature symbol_105 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()!
		TypeTemplateParameter symbol_106 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_107 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2
		
		
		SequenceType symbol_108 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
		TemplateSignature symbol_109 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!
		TypeTemplateParameter symbol_110 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_111 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
		
		TemplateSignature symbol_112 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_113 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_114 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_115 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_116 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_117 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_118 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()!
		TypeTemplateParameter symbol_119 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_120 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2
		
		
		SetType symbol_121 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
		TemplateSignature symbol_122 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!
		TypeTemplateParameter symbol_123 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_124 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
		
		TemplateSignature symbol_125 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()!
		TypeTemplateParameter symbol_126 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_127 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2
		
		
		CollectionType symbol_128 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
		TemplateSignature symbol_129 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!
		TypeTemplateParameter symbol_130 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_131 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T
		
		
		Package symbol_132 = PivotFactory.eINSTANCE.createPackage(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0
		LambdaType symbol_133 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		
		LambdaType symbol_134 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		
		LambdaType symbol_135 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_136 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_137 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_138 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
		
		LambdaType symbol_139 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_140 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_141 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_142 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_143 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_144 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_145 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_146 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_147 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_148 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_149 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
		
		LambdaType symbol_150 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_151 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_152 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		
		LambdaType symbol_153 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		
		LambdaType symbol_154 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_155 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		
		LambdaType symbol_156 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		
		LambdaType symbol_157 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_158 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
		
		LambdaType symbol_159 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_160 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_161 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		
		LambdaType symbol_162 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		
		LambdaType symbol_163 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_164 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		TupleType symbol_165 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_166 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_167 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		TupleType symbol_168 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_169 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_170 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		TupleType symbol_171 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_172 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_173 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		TupleType symbol_174 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_175 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_176 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		ClassifierType symbol_177 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		
		ClassifierType symbol_178 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		
		ClassifierType symbol_179 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		
		ClassifierType symbol_180 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		
		ClassifierType symbol_181 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		
		ClassifierType symbol_182 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		
		ClassifierType symbol_183 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		
		ClassifierType symbol_184 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		
		ClassifierType symbol_185 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		
		ClassifierType symbol_186 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		ClassifierType symbol_187 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		
		BagType symbol_188 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		BagType symbol_189 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		BagType symbol_190 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		
		BagType symbol_191 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		BagType symbol_192 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		BagType symbol_193 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		BagType symbol_194 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		BagType symbol_195 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		BagType symbol_196 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		BagType symbol_197 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		BagType symbol_198 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_199 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_200 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_201 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_202 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_203 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_204 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		BagType symbol_205 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		BagType symbol_206 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		BagType symbol_207 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		BagType symbol_208 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		ClassifierType symbol_209 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		
		ClassifierType symbol_210 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		ClassifierType symbol_211 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		
		ClassifierType symbol_212 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_213 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Integer]
		
		CollectionType symbol_214 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		
		CollectionType symbol_215 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_216 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_217 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_218 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		CollectionType symbol_219 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_220 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_221 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_222 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_223 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		
		CollectionType symbol_224 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
		
		CollectionType symbol_225 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		
		CollectionType symbol_226 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		
		CollectionType symbol_227 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_228 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_229 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_230 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		CollectionType symbol_231 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_232 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_233 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_234 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_235 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		CollectionType symbol_236 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_237 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_238 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_239 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_240 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_241 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		CollectionType symbol_242 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_243 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_244 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_245 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_246 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_247 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		CollectionType symbol_248 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		ClassifierType symbol_249 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		OrderedSetType symbol_250 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		OrderedSetType symbol_251 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		OrderedSetType symbol_252 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		OrderedSetType symbol_253 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		OrderedSetType symbol_254 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		OrderedSetType symbol_255 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		SequenceType symbol_256 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[Integer]
		
		SequenceType symbol_257 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
		
		SequenceType symbol_258 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		SequenceType symbol_259 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		SequenceType symbol_260 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		SequenceType symbol_261 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		SequenceType symbol_262 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		SequenceType symbol_263 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		
		SequenceType symbol_264 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		SequenceType symbol_265 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		SequenceType symbol_266 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		SequenceType symbol_267 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		SequenceType symbol_268 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		SetType symbol_269 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		SetType symbol_270 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		SetType symbol_271 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		SetType symbol_272 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		SetType symbol_273 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		SetType symbol_274 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		SetType symbol_275 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		SetType symbol_276 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		CollectionType symbol_277 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_278 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_279 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_280 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_281 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_282 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_283 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_284 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		CollectionType symbol_285 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_286 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		CollectionType symbol_287 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_288 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_289 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_290 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_291 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_292 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_293 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_294 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_295 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_296 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_297 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_298 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_299 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		CollectionType symbol_300 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		AnyType symbol_301 = PivotFactory.eINSTANCE.createAnyType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		
		

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
			Operation symbol_302 = PivotFactory.eINSTANCE.createOperation(); // Boolean!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_302.setName("<>");
			symbol_302.setType(symbol_11);  // Boolean
			
			Parameter symbol_303 = PivotFactory.eINSTANCE.createParameter(); // Boolean!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_303.setName("object2");
			symbol_303.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_302.getOwnedParameters().add(symbol_303);
			symbol_302.setPrecedence(symbol_6);
			symbol_302.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_302.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_304 = PivotFactory.eINSTANCE.createComment();
				symbol_304.setBody("Returns oclText[true] if the logical value of oclText[self] is the not same as the numeric value of object2, oclText[false] otherwise.");
				symbol_302.getOwnedComments().add(symbol_304);
			}
			
			symbol_11.getOwnedOperations().add(symbol_302);
		}
		{	// ocl::Boolean::=()
			Operation symbol_305 = PivotFactory.eINSTANCE.createOperation(); // Boolean!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_305.setName("=");
			symbol_305.setType(symbol_11);  // Boolean
			
			Parameter symbol_306 = PivotFactory.eINSTANCE.createParameter(); // Boolean!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_306.setName("object2");
			symbol_306.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_305.getOwnedParameters().add(symbol_306);
			symbol_305.setPrecedence(symbol_6);
			symbol_305.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_305.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_307 = PivotFactory.eINSTANCE.createComment();
				symbol_307.setBody("Returns oclText[true] if the logical value of oclText[self] is the same as the numeric value of object2, oclText[false] otherwise.");
				symbol_305.getOwnedComments().add(symbol_307);
			}
			
			symbol_11.getOwnedOperations().add(symbol_305);
		}
		{	// ocl::Boolean::allInstances()
			Operation symbol_308 = PivotFactory.eINSTANCE.createOperation(); // Boolean!allInstances()
			symbol_308.setName("allInstances");
			symbol_308.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_308.setIsStatic(true);
			symbol_308.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation");
			symbol_308.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
			{
				Comment symbol_309 = PivotFactory.eINSTANCE.createComment();
				symbol_309.setBody("Returns oclText[Set{false, true}].");
				symbol_308.getOwnedComments().add(symbol_309);
			}
			
			symbol_11.getOwnedOperations().add(symbol_308);
		}
		{	// ocl::Boolean::and()
			Operation symbol_310 = PivotFactory.eINSTANCE.createOperation(); // Boolean!and(Boolean)
			symbol_310.setName("and");
			symbol_310.setType(symbol_11);  // Boolean
			
			Parameter symbol_311 = PivotFactory.eINSTANCE.createParameter(); // Boolean!and(Boolean)!b
			symbol_311.setName("b");
			symbol_311.setType(symbol_11);  // Boolean
			
			
			symbol_310.getOwnedParameters().add(symbol_311);
			symbol_310.setPrecedence(symbol_7);
			symbol_310.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanAndOperation");
			symbol_310.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE);
			{
				Comment symbol_312 = PivotFactory.eINSTANCE.createComment();
				symbol_312.setBody("True if both b1 and b are oclText[true].");
				symbol_310.getOwnedComments().add(symbol_312);
			}
			
			symbol_11.getOwnedOperations().add(symbol_310);
		}
		{	// ocl::Boolean::implies()
			Operation symbol_313 = PivotFactory.eINSTANCE.createOperation(); // Boolean!implies(Boolean)
			symbol_313.setName("implies");
			symbol_313.setType(symbol_11);  // Boolean
			
			Parameter symbol_314 = PivotFactory.eINSTANCE.createParameter(); // Boolean!implies(Boolean)!b
			symbol_314.setName("b");
			symbol_314.setType(symbol_11);  // Boolean
			
			
			symbol_313.getOwnedParameters().add(symbol_314);
			symbol_313.setPrecedence(symbol_10);
			symbol_313.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation");
			symbol_313.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE);
			{
				Comment symbol_315 = PivotFactory.eINSTANCE.createComment();
				symbol_315.setBody("True if oclText[self] is oclText[false], or if oclText[self] is oclText[true] and b is oclText[true].");
				symbol_313.getOwnedComments().add(symbol_315);
			}
			
			symbol_11.getOwnedOperations().add(symbol_313);
		}
		{	// ocl::Boolean::not()
			Operation symbol_316 = PivotFactory.eINSTANCE.createOperation(); // Boolean!not()
			symbol_316.setName("not");
			symbol_316.setType(symbol_11);  // Boolean
			
			symbol_316.setPrecedence(symbol_2);
			symbol_316.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanNotOperation");
			symbol_316.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
			{
				Comment symbol_317 = PivotFactory.eINSTANCE.createComment();
				symbol_317.setBody("True if oclText[self] is oclText[false].");
				symbol_316.getOwnedComments().add(symbol_317);
			}
			
			symbol_11.getOwnedOperations().add(symbol_316);
		}
		{	// ocl::Boolean::or()
			Operation symbol_318 = PivotFactory.eINSTANCE.createOperation(); // Boolean!or(Boolean)
			symbol_318.setName("or");
			symbol_318.setType(symbol_11);  // Boolean
			
			Parameter symbol_319 = PivotFactory.eINSTANCE.createParameter(); // Boolean!or(Boolean)!b
			symbol_319.setName("b");
			symbol_319.setType(symbol_11);  // Boolean
			
			
			symbol_318.getOwnedParameters().add(symbol_319);
			symbol_318.setPrecedence(symbol_8);
			symbol_318.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanOrOperation");
			symbol_318.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE);
			{
				Comment symbol_320 = PivotFactory.eINSTANCE.createComment();
				symbol_320.setBody("True if either oclText[self] or b is oclText[true].");
				symbol_318.getOwnedComments().add(symbol_320);
			}
			
			symbol_11.getOwnedOperations().add(symbol_318);
		}
		{	// ocl::Boolean::toString()
			Operation symbol_321 = PivotFactory.eINSTANCE.createOperation(); // Boolean!toString()
			symbol_321.setName("toString");
			symbol_321.setType(symbol_14);  // String
			
			symbol_321.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_321.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_322 = PivotFactory.eINSTANCE.createComment();
				symbol_322.setBody("Converts oclText[self] to a string value.");
				symbol_321.getOwnedComments().add(symbol_322);
			}
			
			symbol_11.getOwnedOperations().add(symbol_321);
		}
		{	// ocl::Boolean::xor()
			Operation symbol_323 = PivotFactory.eINSTANCE.createOperation(); // Boolean!xor(Boolean)
			symbol_323.setName("xor");
			symbol_323.setType(symbol_11);  // Boolean
			
			Parameter symbol_324 = PivotFactory.eINSTANCE.createParameter(); // Boolean!xor(Boolean)!b
			symbol_324.setName("b");
			symbol_324.setType(symbol_11);  // Boolean
			
			
			symbol_323.getOwnedParameters().add(symbol_324);
			symbol_323.setPrecedence(symbol_9);
			symbol_323.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanXorOperation");
			symbol_323.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE);
			{
				Comment symbol_325 = PivotFactory.eINSTANCE.createComment();
				symbol_325.setBody("True if either oclText[self] or b is oclText[true], but not both.");
				symbol_323.getOwnedComments().add(symbol_325);
			}
			
			symbol_11.getOwnedOperations().add(symbol_323);
		}
		{
			Comment symbol_326 = PivotFactory.eINSTANCE.createComment();
			symbol_326.setBody("The standard type Boolean represents the common true/false values.\nBoolean is itself an instance of the metatype PrimitiveType (from UML).");
			symbol_11.getOwnedComments().add(symbol_326);
		}
		
		symbol_0.getOwnedTypes().add(symbol_11); // Boolean
		//
		// ocl::Integer Integer
		//
		symbol_12.setName("Integer");
		symbol_12.getSuperClasses().add(symbol_13); // Real
		{	// ocl::Integer::*()
			Operation symbol_327 = PivotFactory.eINSTANCE.createOperation(); // Integer!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_327.setName("*");
			symbol_327.setType(symbol_12);  // Integer
			
			Parameter symbol_328 = PivotFactory.eINSTANCE.createParameter(); // Integer!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_328.setName("i");
			symbol_328.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_327.getOwnedParameters().add(symbol_328);
			symbol_327.setPrecedence(symbol_3);
			symbol_327.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericTimesOperation");
			symbol_327.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			{
				Comment symbol_329 = PivotFactory.eINSTANCE.createComment();
				symbol_329.setBody("The value of the multiplication of oclText[self] and i.");
				symbol_327.getOwnedComments().add(symbol_329);
			}
			
			symbol_12.getOwnedOperations().add(symbol_327);
		}
		{	// ocl::Integer::+()
			Operation symbol_330 = PivotFactory.eINSTANCE.createOperation(); // Integer!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_330.setName("+");
			symbol_330.setType(symbol_12);  // Integer
			
			Parameter symbol_331 = PivotFactory.eINSTANCE.createParameter(); // Integer!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_331.setName("i");
			symbol_331.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_330.getOwnedParameters().add(symbol_331);
			symbol_330.setPrecedence(symbol_4);
			symbol_330.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerPlusOperation");
			symbol_330.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerPlusOperation.INSTANCE);
			{
				Comment symbol_332 = PivotFactory.eINSTANCE.createComment();
				symbol_332.setBody("The value of the addition of oclText[self] and i.");
				symbol_330.getOwnedComments().add(symbol_332);
			}
			
			symbol_12.getOwnedOperations().add(symbol_330);
		}
		{	// ocl::Integer::-()
			Operation symbol_333 = PivotFactory.eINSTANCE.createOperation(); // Integer!-()
			symbol_333.setName("-");
			symbol_333.setType(symbol_12);  // Integer
			
			symbol_333.setPrecedence(symbol_2);
			symbol_333.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericNegateOperation");
			symbol_333.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			{
				Comment symbol_334 = PivotFactory.eINSTANCE.createComment();
				symbol_334.setBody("The negative value of oclText[self].");
				symbol_333.getOwnedComments().add(symbol_334);
			}
			
			symbol_12.getOwnedOperations().add(symbol_333);
		}
		{	// ocl::Integer::-()
			Operation symbol_335 = PivotFactory.eINSTANCE.createOperation(); // Integer!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_335.setName("-");
			symbol_335.setType(symbol_12);  // Integer
			
			Parameter symbol_336 = PivotFactory.eINSTANCE.createParameter(); // Integer!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_336.setName("i");
			symbol_336.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_335.getOwnedParameters().add(symbol_336);
			symbol_335.setPrecedence(symbol_4);
			symbol_335.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerMinusOperation");
			symbol_335.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerMinusOperation.INSTANCE);
			{
				Comment symbol_337 = PivotFactory.eINSTANCE.createComment();
				symbol_337.setBody("The value of the subtraction of i from oclText[self].");
				symbol_335.getOwnedComments().add(symbol_337);
			}
			
			symbol_12.getOwnedOperations().add(symbol_335);
		}
		{	// ocl::Integer::/()
			Operation symbol_338 = PivotFactory.eINSTANCE.createOperation(); // Integer!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_338.setName("/");
			symbol_338.setType(symbol_13);  // Real
			
			Parameter symbol_339 = PivotFactory.eINSTANCE.createParameter(); // Integer!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_339.setName("i");
			symbol_339.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_338.getOwnedParameters().add(symbol_339);
			symbol_338.setPrecedence(symbol_3);
			symbol_338.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivideOperation");
			symbol_338.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			{
				Comment symbol_340 = PivotFactory.eINSTANCE.createComment();
				symbol_340.setBody("The value of oclText[self] divided by i.\nEvaluates to oclText[invalid] if r is equal to zero.");
				symbol_338.getOwnedComments().add(symbol_340);
			}
			
			symbol_12.getOwnedOperations().add(symbol_338);
		}
		{	// ocl::Integer::abs()
			Operation symbol_341 = PivotFactory.eINSTANCE.createOperation(); // Integer!abs()
			symbol_341.setName("abs");
			symbol_341.setType(symbol_12);  // Integer
			
			symbol_341.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericAbsOperation");
			symbol_341.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			{
				Comment symbol_342 = PivotFactory.eINSTANCE.createComment();
				symbol_342.setBody("The absolute value of oclText[self].");
				symbol_341.getOwnedComments().add(symbol_342);
			}
			
			symbol_12.getOwnedOperations().add(symbol_341);
		}
		{	// ocl::Integer::compareTo()
			Operation symbol_343 = PivotFactory.eINSTANCE.createOperation(); // Integer!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_343.setName("compareTo");
			symbol_343.setType(symbol_12);  // Integer
			
			Parameter symbol_344 = PivotFactory.eINSTANCE.createParameter(); // Integer!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_344.setName("that");
			symbol_344.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_343.getOwnedParameters().add(symbol_344);
			symbol_343.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation");
			symbol_343.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation.INSTANCE);
			{
				Comment symbol_345 = PivotFactory.eINSTANCE.createComment();
				symbol_345.setBody("The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
				symbol_343.getOwnedComments().add(symbol_345);
			}
			
			symbol_12.getOwnedOperations().add(symbol_343);
		}
		{	// ocl::Integer::div()
			Operation symbol_346 = PivotFactory.eINSTANCE.createOperation(); // Integer!div(Integer)
			symbol_346.setName("div");
			symbol_346.setType(symbol_12);  // Integer
			
			Parameter symbol_347 = PivotFactory.eINSTANCE.createParameter(); // Integer!div(Integer)!i
			symbol_347.setName("i");
			symbol_347.setType(symbol_12);  // Integer
			
			
			symbol_346.getOwnedParameters().add(symbol_347);
			symbol_346.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivOperation");
			symbol_346.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE);
			{
				Comment symbol_348 = PivotFactory.eINSTANCE.createComment();
				symbol_348.setBody("The number of times that i fits completely within oclText[self].");
				symbol_346.getOwnedComments().add(symbol_348);
			}
			
			symbol_12.getOwnedOperations().add(symbol_346);
		}
		{	// ocl::Integer::max()
			Operation symbol_349 = PivotFactory.eINSTANCE.createOperation(); // Integer!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_349.setName("max");
			symbol_349.setType(symbol_12);  // Integer
			
			Parameter symbol_350 = PivotFactory.eINSTANCE.createParameter(); // Integer!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_350.setName("i");
			symbol_350.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_349.getOwnedParameters().add(symbol_350);
			symbol_349.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMaxOperation");
			symbol_349.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			{
				Comment symbol_351 = PivotFactory.eINSTANCE.createComment();
				symbol_351.setBody("The maximum of oclText[self] an i.");
				symbol_349.getOwnedComments().add(symbol_351);
			}
			
			symbol_12.getOwnedOperations().add(symbol_349);
		}
		{	// ocl::Integer::min()
			Operation symbol_352 = PivotFactory.eINSTANCE.createOperation(); // Integer!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_352.setName("min");
			symbol_352.setType(symbol_12);  // Integer
			
			Parameter symbol_353 = PivotFactory.eINSTANCE.createParameter(); // Integer!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_353.setName("i");
			symbol_353.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_352.getOwnedParameters().add(symbol_353);
			symbol_352.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMinOperation");
			symbol_352.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			{
				Comment symbol_354 = PivotFactory.eINSTANCE.createComment();
				symbol_354.setBody("The minimum of oclText[self] an i.");
				symbol_352.getOwnedComments().add(symbol_354);
			}
			
			symbol_12.getOwnedOperations().add(symbol_352);
		}
		{	// ocl::Integer::mod()
			Operation symbol_355 = PivotFactory.eINSTANCE.createOperation(); // Integer!mod(Integer)
			symbol_355.setName("mod");
			symbol_355.setType(symbol_12);  // Integer
			
			Parameter symbol_356 = PivotFactory.eINSTANCE.createParameter(); // Integer!mod(Integer)!i
			symbol_356.setName("i");
			symbol_356.setType(symbol_12);  // Integer
			
			
			symbol_355.getOwnedParameters().add(symbol_356);
			symbol_355.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericModOperation");
			symbol_355.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE);
			{
				Comment symbol_357 = PivotFactory.eINSTANCE.createComment();
				symbol_357.setBody("The result is oclText[self] modulo i.");
				symbol_355.getOwnedComments().add(symbol_357);
			}
			
			symbol_12.getOwnedOperations().add(symbol_355);
		}
		{	// ocl::Integer::toString()
			Operation symbol_358 = PivotFactory.eINSTANCE.createOperation(); // Integer!toString()
			symbol_358.setName("toString");
			symbol_358.setType(symbol_14);  // String
			
			symbol_358.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_358.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_359 = PivotFactory.eINSTANCE.createComment();
				symbol_359.setBody("Converts oclText[self] to a string value.");
				symbol_358.getOwnedComments().add(symbol_359);
			}
			
			symbol_12.getOwnedOperations().add(symbol_358);
		}
		{
			Comment symbol_360 = PivotFactory.eINSTANCE.createComment();
			symbol_360.setBody("The standard type Integer represents the mathematical concept of integer.\nNote that UnlimitedNatural is a subclass of Integer, so for each parameter of type Integer,\nyou can use an unlimited natural as the actual parameter.\nInteger is itself an instance of the metatype PrimitiveType (from UML).");
			symbol_12.getOwnedComments().add(symbol_360);
		}
		
		symbol_0.getOwnedTypes().add(symbol_12); // Integer
		//
		// ocl::Real Real
		//
		symbol_13.setName("Real");
		symbol_13.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		symbol_13.getSuperClasses().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		{	// ocl::Real::*()
			Operation symbol_361 = PivotFactory.eINSTANCE.createOperation(); // Real!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_361.setName("*");
			symbol_361.setType(symbol_13);  // Real
			
			Parameter symbol_362 = PivotFactory.eINSTANCE.createParameter(); // Real!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_362.setName("r");
			symbol_362.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_361.getOwnedParameters().add(symbol_362);
			symbol_361.setPrecedence(symbol_3);
			symbol_361.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericTimesOperation");
			symbol_361.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			{
				Comment symbol_363 = PivotFactory.eINSTANCE.createComment();
				symbol_363.setBody("The value of the multiplication of oclText[self] and r.");
				symbol_361.getOwnedComments().add(symbol_363);
			}
			
			symbol_13.getOwnedOperations().add(symbol_361);
		}
		{	// ocl::Real::+()
			Operation symbol_364 = PivotFactory.eINSTANCE.createOperation(); // Real!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_364.setName("+");
			symbol_364.setType(symbol_13);  // Real
			
			Parameter symbol_365 = PivotFactory.eINSTANCE.createParameter(); // Real!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_365.setName("r");
			symbol_365.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_364.getOwnedParameters().add(symbol_365);
			symbol_364.setPrecedence(symbol_4);
			symbol_364.setImplementationClass("org.eclipse.ocl.examples.library.real.RealPlusOperation");
			symbol_364.setImplementation(org.eclipse.ocl.examples.library.real.RealPlusOperation.INSTANCE);
			{
				Comment symbol_366 = PivotFactory.eINSTANCE.createComment();
				symbol_366.setBody("The value of the addition of oclText[self] and r.");
				symbol_364.getOwnedComments().add(symbol_366);
			}
			
			symbol_13.getOwnedOperations().add(symbol_364);
		}
		{	// ocl::Real::-()
			Operation symbol_367 = PivotFactory.eINSTANCE.createOperation(); // Real!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_367.setName("-");
			symbol_367.setType(symbol_13);  // Real
			
			Parameter symbol_368 = PivotFactory.eINSTANCE.createParameter(); // Real!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_368.setName("r");
			symbol_368.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_367.getOwnedParameters().add(symbol_368);
			symbol_367.setPrecedence(symbol_4);
			symbol_367.setImplementationClass("org.eclipse.ocl.examples.library.real.RealMinusOperation");
			symbol_367.setImplementation(org.eclipse.ocl.examples.library.real.RealMinusOperation.INSTANCE);
			{
				Comment symbol_369 = PivotFactory.eINSTANCE.createComment();
				symbol_369.setBody("The value of the subtraction of r from oclText[self].");
				symbol_367.getOwnedComments().add(symbol_369);
			}
			
			symbol_13.getOwnedOperations().add(symbol_367);
		}
		{	// ocl::Real::-()
			Operation symbol_370 = PivotFactory.eINSTANCE.createOperation(); // Real!-()
			symbol_370.setName("-");
			symbol_370.setType(symbol_13);  // Real
			
			symbol_370.setPrecedence(symbol_2);
			symbol_370.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericNegateOperation");
			symbol_370.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			{
				Comment symbol_371 = PivotFactory.eINSTANCE.createComment();
				symbol_371.setBody("The negative value of oclText[self].");
				symbol_370.getOwnedComments().add(symbol_371);
			}
			
			symbol_13.getOwnedOperations().add(symbol_370);
		}
		{	// ocl::Real::/()
			Operation symbol_372 = PivotFactory.eINSTANCE.createOperation(); // Real!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_372.setName("/");
			symbol_372.setType(symbol_13);  // Real
			
			Parameter symbol_373 = PivotFactory.eINSTANCE.createParameter(); // Real!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_373.setName("r");
			symbol_373.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_372.getOwnedParameters().add(symbol_373);
			symbol_372.setPrecedence(symbol_3);
			symbol_372.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivideOperation");
			symbol_372.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			{
				Comment symbol_374 = PivotFactory.eINSTANCE.createComment();
				symbol_374.setBody("The value of oclText[self] divided by r. Evaluates to oclText[invalid] if r is equal to zero.");
				symbol_372.getOwnedComments().add(symbol_374);
			}
			
			symbol_13.getOwnedOperations().add(symbol_372);
		}
		{	// ocl::Real::<()
			Operation symbol_375 = PivotFactory.eINSTANCE.createOperation(); // Real!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_375.setName("<");
			symbol_375.setType(symbol_11);  // Boolean
			
			Parameter symbol_376 = PivotFactory.eINSTANCE.createParameter(); // Real!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_376.setName("r");
			symbol_376.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_375.getOwnedParameters().add(symbol_376);
			symbol_375.setPrecedence(symbol_5);
			symbol_375.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation");
			symbol_375.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE);
			{
				Comment symbol_377 = PivotFactory.eINSTANCE.createComment();
				symbol_377.setBody("True if oclText[self] is less than r.");
				symbol_375.getOwnedComments().add(symbol_377);
			}
			
			symbol_13.getOwnedOperations().add(symbol_375);
		}
		{	// ocl::Real::<=()
			Operation symbol_378 = PivotFactory.eINSTANCE.createOperation(); // Real!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_378.setName("<=");
			symbol_378.setType(symbol_11);  // Boolean
			
			Parameter symbol_379 = PivotFactory.eINSTANCE.createParameter(); // Real!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_379.setName("r");
			symbol_379.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_378.getOwnedParameters().add(symbol_379);
			symbol_378.setPrecedence(symbol_5);
			symbol_378.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation");
			symbol_378.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE);
			{
				Comment symbol_380 = PivotFactory.eINSTANCE.createComment();
				symbol_380.setBody("True if oclText[self] is less than or equal to r.");
				symbol_378.getOwnedComments().add(symbol_380);
			}
			
			symbol_13.getOwnedOperations().add(symbol_378);
		}
		{	// ocl::Real::<>()
			Operation symbol_381 = PivotFactory.eINSTANCE.createOperation(); // Real!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_381.setName("<>");
			symbol_381.setType(symbol_11);  // Boolean
			
			Parameter symbol_382 = PivotFactory.eINSTANCE.createParameter(); // Real!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_382.setName("object2");
			symbol_382.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_381.getOwnedParameters().add(symbol_382);
			symbol_381.setPrecedence(symbol_6);
			symbol_381.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_381.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_383 = PivotFactory.eINSTANCE.createComment();
				symbol_383.setBody("Returns oclText[true] if the numeric value of oclText[self] is the not the same as the numeric value of object2, oclText[false] otherwise.");
				symbol_381.getOwnedComments().add(symbol_383);
			}
			
			symbol_13.getOwnedOperations().add(symbol_381);
		}
		{	// ocl::Real::=()
			Operation symbol_384 = PivotFactory.eINSTANCE.createOperation(); // Real!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_384.setName("=");
			symbol_384.setType(symbol_11);  // Boolean
			
			Parameter symbol_385 = PivotFactory.eINSTANCE.createParameter(); // Real!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_385.setName("object2");
			symbol_385.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_384.getOwnedParameters().add(symbol_385);
			symbol_384.setPrecedence(symbol_6);
			symbol_384.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_384.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_386 = PivotFactory.eINSTANCE.createComment();
				symbol_386.setBody("Returns oclText[true] if the numeric value of oclText[self] is the same as the numeric value of object2, oclText[false] otherwise.");
				symbol_384.getOwnedComments().add(symbol_386);
			}
			
			symbol_13.getOwnedOperations().add(symbol_384);
		}
		{	// ocl::Real::>()
			Operation symbol_387 = PivotFactory.eINSTANCE.createOperation(); // Real!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_387.setName(">");
			symbol_387.setType(symbol_11);  // Boolean
			
			Parameter symbol_388 = PivotFactory.eINSTANCE.createParameter(); // Real!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_388.setName("r");
			symbol_388.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_387.getOwnedParameters().add(symbol_388);
			symbol_387.setPrecedence(symbol_5);
			symbol_387.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation");
			symbol_387.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE);
			{
				Comment symbol_389 = PivotFactory.eINSTANCE.createComment();
				symbol_389.setBody("True if oclText[self] is greater than r.");
				symbol_387.getOwnedComments().add(symbol_389);
			}
			
			symbol_13.getOwnedOperations().add(symbol_387);
		}
		{	// ocl::Real::>=()
			Operation symbol_390 = PivotFactory.eINSTANCE.createOperation(); // Real!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_390.setName(">=");
			symbol_390.setType(symbol_11);  // Boolean
			
			Parameter symbol_391 = PivotFactory.eINSTANCE.createParameter(); // Real!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_391.setName("r");
			symbol_391.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_390.getOwnedParameters().add(symbol_391);
			symbol_390.setPrecedence(symbol_5);
			symbol_390.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation");
			symbol_390.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE);
			{
				Comment symbol_392 = PivotFactory.eINSTANCE.createComment();
				symbol_392.setBody("True if oclText[self] is greater than or equal to r.");
				symbol_390.getOwnedComments().add(symbol_392);
			}
			
			symbol_13.getOwnedOperations().add(symbol_390);
		}
		{	// ocl::Real::abs()
			Operation symbol_393 = PivotFactory.eINSTANCE.createOperation(); // Real!abs()
			symbol_393.setName("abs");
			symbol_393.setType(symbol_13);  // Real
			
			symbol_393.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericAbsOperation");
			symbol_393.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			{
				Comment symbol_394 = PivotFactory.eINSTANCE.createComment();
				symbol_394.setBody("The absolute value of oclText[self].");
				symbol_393.getOwnedComments().add(symbol_394);
			}
			
			symbol_13.getOwnedOperations().add(symbol_393);
		}
		{	// ocl::Real::compareTo()
			Operation symbol_395 = PivotFactory.eINSTANCE.createOperation(); // Real!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_395.setName("compareTo");
			symbol_395.setType(symbol_12);  // Integer
			
			Parameter symbol_396 = PivotFactory.eINSTANCE.createParameter(); // Real!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_396.setName("that");
			symbol_396.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_395.getOwnedParameters().add(symbol_396);
			symbol_395.setImplementationClass("org.eclipse.ocl.examples.library.real.RealCompareToOperation");
			symbol_395.setImplementation(org.eclipse.ocl.examples.library.real.RealCompareToOperation.INSTANCE);
			{
				Comment symbol_397 = PivotFactory.eINSTANCE.createComment();
				symbol_397.setBody("The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
				symbol_395.getOwnedComments().add(symbol_397);
			}
			
			symbol_13.getOwnedOperations().add(symbol_395);
		}
		{	// ocl::Real::floor()
			Operation symbol_398 = PivotFactory.eINSTANCE.createOperation(); // Real!floor()
			symbol_398.setName("floor");
			symbol_398.setType(symbol_12);  // Integer
			
			symbol_398.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericFloorOperation");
			symbol_398.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
			{
				Comment symbol_399 = PivotFactory.eINSTANCE.createComment();
				symbol_399.setBody("The largest integer that is less than or equal to oclText[self].");
				symbol_398.getOwnedComments().add(symbol_399);
			}
			
			symbol_13.getOwnedOperations().add(symbol_398);
		}
		{	// ocl::Real::max()
			Operation symbol_400 = PivotFactory.eINSTANCE.createOperation(); // Real!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_400.setName("max");
			symbol_400.setType(symbol_13);  // Real
			
			Parameter symbol_401 = PivotFactory.eINSTANCE.createParameter(); // Real!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_401.setName("r");
			symbol_401.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_400.getOwnedParameters().add(symbol_401);
			symbol_400.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMaxOperation");
			symbol_400.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			{
				Comment symbol_402 = PivotFactory.eINSTANCE.createComment();
				symbol_402.setBody("The maximum of oclText[self] and r.");
				symbol_400.getOwnedComments().add(symbol_402);
			}
			
			symbol_13.getOwnedOperations().add(symbol_400);
		}
		{	// ocl::Real::min()
			Operation symbol_403 = PivotFactory.eINSTANCE.createOperation(); // Real!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_403.setName("min");
			symbol_403.setType(symbol_13);  // Real
			
			Parameter symbol_404 = PivotFactory.eINSTANCE.createParameter(); // Real!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_404.setName("r");
			symbol_404.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_403.getOwnedParameters().add(symbol_404);
			symbol_403.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMinOperation");
			symbol_403.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			{
				Comment symbol_405 = PivotFactory.eINSTANCE.createComment();
				symbol_405.setBody("The minimum of oclText[self] and r.");
				symbol_403.getOwnedComments().add(symbol_405);
			}
			
			symbol_13.getOwnedOperations().add(symbol_403);
		}
		{	// ocl::Real::round()
			Operation symbol_406 = PivotFactory.eINSTANCE.createOperation(); // Real!round()
			symbol_406.setName("round");
			symbol_406.setType(symbol_12);  // Integer
			
			symbol_406.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericRoundOperation");
			symbol_406.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
			{
				Comment symbol_407 = PivotFactory.eINSTANCE.createComment();
				symbol_407.setBody("The integer that is closest to oclText[self]. When there are two such integers, the largest one.");
				symbol_406.getOwnedComments().add(symbol_407);
			}
			
			symbol_13.getOwnedOperations().add(symbol_406);
		}
		{	// ocl::Real::toString()
			Operation symbol_408 = PivotFactory.eINSTANCE.createOperation(); // Real!toString()
			symbol_408.setName("toString");
			symbol_408.setType(symbol_14);  // String
			
			symbol_408.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_408.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_409 = PivotFactory.eINSTANCE.createComment();
				symbol_409.setBody("Converts oclText[self] to a string value.");
				symbol_408.getOwnedComments().add(symbol_409);
			}
			
			symbol_13.getOwnedOperations().add(symbol_408);
		}
		{
			Comment symbol_410 = PivotFactory.eINSTANCE.createComment();
			symbol_410.setBody("The standard type Real represents the mathematical concept of real.\nNote that UnlimitedNatural is a subclass of Integer and that Integer is a subclass of Real,\nso for each parameter of type Real, you can use an unlimited natural or an integer as the actual parameter.\nReal is itself an instance of the metatype PrimitiveType (from UML).");
			symbol_13.getOwnedComments().add(symbol_410);
		}
		
		symbol_0.getOwnedTypes().add(symbol_13); // Real
		//
		// ocl::String String
		//
		symbol_14.setName("String");
		symbol_14.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		symbol_14.getSuperClasses().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		{	// ocl::String::+()
			Operation symbol_411 = PivotFactory.eINSTANCE.createOperation(); // String!+(String)
			symbol_411.setName("+");
			symbol_411.setType(symbol_14);  // String
			
			Parameter symbol_412 = PivotFactory.eINSTANCE.createParameter(); // String!+(String)!s
			symbol_412.setName("s");
			symbol_412.setType(symbol_14);  // String
			
			
			symbol_411.getOwnedParameters().add(symbol_412);
			symbol_411.setPrecedence(symbol_4);
			symbol_411.setImplementationClass("org.eclipse.ocl.examples.library.string.StringConcatOperation");
			symbol_411.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			{
				Comment symbol_413 = PivotFactory.eINSTANCE.createComment();
				symbol_413.setBody("The concatenation of oclText[self] and s.");
				symbol_411.getOwnedComments().add(symbol_413);
			}
			
			symbol_14.getOwnedOperations().add(symbol_411);
		}
		{	// ocl::String::<()
			Operation symbol_414 = PivotFactory.eINSTANCE.createOperation(); // String!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_414.setName("<");
			symbol_414.setType(symbol_11);  // Boolean
			
			Parameter symbol_415 = PivotFactory.eINSTANCE.createParameter(); // String!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_415.setName("s");
			symbol_415.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_414.getOwnedParameters().add(symbol_415);
			symbol_414.setPrecedence(symbol_5);
			symbol_414.setImplementationClass("org.eclipse.ocl.examples.library.string.StringLessThanOperation");
			symbol_414.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
			{
				Comment symbol_416 = PivotFactory.eINSTANCE.createComment();
				symbol_416.setBody("True if oclText[self] is less than s, using the locale defined by looking up oclLocale in the current environment.");
				symbol_414.getOwnedComments().add(symbol_416);
			}
			
			symbol_14.getOwnedOperations().add(symbol_414);
		}
		{	// ocl::String::<=()
			Operation symbol_417 = PivotFactory.eINSTANCE.createOperation(); // String!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_417.setName("<=");
			symbol_417.setType(symbol_11);  // Boolean
			
			Parameter symbol_418 = PivotFactory.eINSTANCE.createParameter(); // String!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_418.setName("s");
			symbol_418.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_417.getOwnedParameters().add(symbol_418);
			symbol_417.setPrecedence(symbol_5);
			symbol_417.setImplementationClass("org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation");
			symbol_417.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
			{
				Comment symbol_419 = PivotFactory.eINSTANCE.createComment();
				symbol_419.setBody("True if oclText[self] is less than or equal to s, using the locale defined by looking up oclLocale in the current environment.");
				symbol_417.getOwnedComments().add(symbol_419);
			}
			
			symbol_14.getOwnedOperations().add(symbol_417);
		}
		{	// ocl::String::<>()
			Operation symbol_420 = PivotFactory.eINSTANCE.createOperation(); // String!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_420.setName("<>");
			symbol_420.setType(symbol_11);  // Boolean
			
			Parameter symbol_421 = PivotFactory.eINSTANCE.createParameter(); // String!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_421.setName("object2");
			symbol_421.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_420.getOwnedParameters().add(symbol_421);
			symbol_420.setPrecedence(symbol_6);
			symbol_420.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_420.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_14.getOwnedOperations().add(symbol_420);
		}
		{	// ocl::String::=()
			Operation symbol_422 = PivotFactory.eINSTANCE.createOperation(); // String!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_422.setName("=");
			symbol_422.setType(symbol_11);  // Boolean
			
			Parameter symbol_423 = PivotFactory.eINSTANCE.createParameter(); // String!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_423.setName("object2");
			symbol_423.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_422.getOwnedParameters().add(symbol_423);
			symbol_422.setPrecedence(symbol_6);
			symbol_422.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_422.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			
			symbol_14.getOwnedOperations().add(symbol_422);
		}
		{	// ocl::String::>()
			Operation symbol_424 = PivotFactory.eINSTANCE.createOperation(); // String!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_424.setName(">");
			symbol_424.setType(symbol_11);  // Boolean
			
			Parameter symbol_425 = PivotFactory.eINSTANCE.createParameter(); // String!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_425.setName("s");
			symbol_425.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_424.getOwnedParameters().add(symbol_425);
			symbol_424.setPrecedence(symbol_5);
			symbol_424.setImplementationClass("org.eclipse.ocl.examples.library.string.StringGreaterThanOperation");
			symbol_424.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
			{
				Comment symbol_426 = PivotFactory.eINSTANCE.createComment();
				symbol_426.setBody("True if oclText[self] is greater than s, using the locale defined by looking up oclLocale in the current environment.");
				symbol_424.getOwnedComments().add(symbol_426);
			}
			
			symbol_14.getOwnedOperations().add(symbol_424);
		}
		{	// ocl::String::>=()
			Operation symbol_427 = PivotFactory.eINSTANCE.createOperation(); // String!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_427.setName(">=");
			symbol_427.setType(symbol_11);  // Boolean
			
			Parameter symbol_428 = PivotFactory.eINSTANCE.createParameter(); // String!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_428.setName("s");
			symbol_428.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_427.getOwnedParameters().add(symbol_428);
			symbol_427.setPrecedence(symbol_5);
			symbol_427.setImplementationClass("org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation");
			symbol_427.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
			{
				Comment symbol_429 = PivotFactory.eINSTANCE.createComment();
				symbol_429.setBody("True if oclText[self] is greater than or equal to s, using the locale defined by looking up oclLocale in the current environment.");
				symbol_427.getOwnedComments().add(symbol_429);
			}
			
			symbol_14.getOwnedOperations().add(symbol_427);
		}
		{	// ocl::String::at()
			Operation symbol_430 = PivotFactory.eINSTANCE.createOperation(); // String!at(Integer)
			symbol_430.setName("at");
			symbol_430.setType(symbol_14);  // String
			
			Parameter symbol_431 = PivotFactory.eINSTANCE.createParameter(); // String!at(Integer)!i
			symbol_431.setName("i");
			symbol_431.setType(symbol_12);  // Integer
			
			
			symbol_430.getOwnedParameters().add(symbol_431);
			symbol_430.setImplementationClass("org.eclipse.ocl.examples.library.string.StringAtOperation");
			symbol_430.setImplementation(org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE);
			{
				Comment symbol_432 = PivotFactory.eINSTANCE.createComment();
				symbol_432.setBody("Queries the character at position i in oclText[self].");
				symbol_430.getOwnedComments().add(symbol_432);
			}
			
			symbol_14.getOwnedOperations().add(symbol_430);
		}
		{	// ocl::String::characters()
			Operation symbol_433 = PivotFactory.eINSTANCE.createOperation(); // String!characters()
			symbol_433.setName("characters");
			symbol_433.setType(symbol_257);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
			
			symbol_433.setImplementationClass("org.eclipse.ocl.examples.library.string.StringCharactersOperation");
			symbol_433.setImplementation(org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
			{
				Comment symbol_434 = PivotFactory.eINSTANCE.createComment();
				symbol_434.setBody("Obtains the characters of oclText[self] as a sequence.");
				symbol_433.getOwnedComments().add(symbol_434);
			}
			
			symbol_14.getOwnedOperations().add(symbol_433);
		}
		{	// ocl::String::compareTo()
			Operation symbol_435 = PivotFactory.eINSTANCE.createOperation(); // String!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_435.setName("compareTo");
			symbol_435.setType(symbol_12);  // Integer
			
			Parameter symbol_436 = PivotFactory.eINSTANCE.createParameter(); // String!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_436.setName("that");
			symbol_436.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_435.getOwnedParameters().add(symbol_436);
			symbol_435.setImplementationClass("org.eclipse.ocl.examples.library.string.StringCompareToOperation");
			symbol_435.setImplementation(org.eclipse.ocl.examples.library.string.StringCompareToOperation.INSTANCE);
			{
				Comment symbol_437 = PivotFactory.eINSTANCE.createComment();
				symbol_437.setBody("The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
				symbol_435.getOwnedComments().add(symbol_437);
			}
			
			symbol_14.getOwnedOperations().add(symbol_435);
		}
		{	// ocl::String::concat()
			Operation symbol_438 = PivotFactory.eINSTANCE.createOperation(); // String!concat(String)
			symbol_438.setName("concat");
			symbol_438.setType(symbol_14);  // String
			
			Parameter symbol_439 = PivotFactory.eINSTANCE.createParameter(); // String!concat(String)!s
			symbol_439.setName("s");
			symbol_439.setType(symbol_14);  // String
			
			
			symbol_438.getOwnedParameters().add(symbol_439);
			symbol_438.setImplementationClass("org.eclipse.ocl.examples.library.string.StringConcatOperation");
			symbol_438.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			{
				Comment symbol_440 = PivotFactory.eINSTANCE.createComment();
				symbol_440.setBody("The concatenation of oclText[self] and s.");
				symbol_438.getOwnedComments().add(symbol_440);
			}
			
			symbol_14.getOwnedOperations().add(symbol_438);
		}
		{	// ocl::String::equalsIgnoreCase()
			Operation symbol_441 = PivotFactory.eINSTANCE.createOperation(); // String!equalsIgnoreCase(String)
			symbol_441.setName("equalsIgnoreCase");
			symbol_441.setType(symbol_11);  // Boolean
			
			Parameter symbol_442 = PivotFactory.eINSTANCE.createParameter(); // String!equalsIgnoreCase(String)!s
			symbol_442.setName("s");
			symbol_442.setType(symbol_14);  // String
			
			
			symbol_441.getOwnedParameters().add(symbol_442);
			symbol_441.setImplementationClass("org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation");
			symbol_441.setImplementation(org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
			{
				Comment symbol_443 = PivotFactory.eINSTANCE.createComment();
				symbol_443.setBody("Queries whether s and oclText[self] are equivalent under case-insensitive collation.");
				symbol_441.getOwnedComments().add(symbol_443);
			}
			
			symbol_14.getOwnedOperations().add(symbol_441);
		}
		{	// ocl::String::indexOf()
			Operation symbol_444 = PivotFactory.eINSTANCE.createOperation(); // String!indexOf(String)
			symbol_444.setName("indexOf");
			symbol_444.setType(symbol_12);  // Integer
			
			Parameter symbol_445 = PivotFactory.eINSTANCE.createParameter(); // String!indexOf(String)!s
			symbol_445.setName("s");
			symbol_445.setType(symbol_14);  // String
			
			
			symbol_444.getOwnedParameters().add(symbol_445);
			symbol_444.setImplementationClass("org.eclipse.ocl.examples.library.string.StringIndexOfOperation");
			symbol_444.setImplementation(org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE);
			{
				Comment symbol_446 = PivotFactory.eINSTANCE.createComment();
				symbol_446.setBody("Queries the index in oclText[self] at which s is a substring of oclText[self], or zero if s is not a substring of oclText[self].\nThe empty string is considered to be a substring of every string but the empty string, at index 1.\nNo string is a substring of the empty string.");
				symbol_444.getOwnedComments().add(symbol_446);
			}
			
			symbol_14.getOwnedOperations().add(symbol_444);
		}
		{	// ocl::String::size()
			Operation symbol_447 = PivotFactory.eINSTANCE.createOperation(); // String!size()
			symbol_447.setName("size");
			symbol_447.setType(symbol_12);  // Integer
			
			symbol_447.setImplementationClass("org.eclipse.ocl.examples.library.string.StringSizeOperation");
			symbol_447.setImplementation(org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
			{
				Comment symbol_448 = PivotFactory.eINSTANCE.createComment();
				symbol_448.setBody("The number of characters in oclText[self].");
				symbol_447.getOwnedComments().add(symbol_448);
			}
			
			symbol_14.getOwnedOperations().add(symbol_447);
		}
		{	// ocl::String::substring()
			Operation symbol_449 = PivotFactory.eINSTANCE.createOperation(); // String!substring(Integer,Integer)
			symbol_449.setName("substring");
			symbol_449.setType(symbol_14);  // String
			
			Parameter symbol_450 = PivotFactory.eINSTANCE.createParameter(); // String!substring(Integer,Integer)!lower
			symbol_450.setName("lower");
			symbol_450.setType(symbol_12);  // Integer
			
			
			symbol_449.getOwnedParameters().add(symbol_450);
			Parameter symbol_451 = PivotFactory.eINSTANCE.createParameter(); // String!substring(Integer,Integer)!upper
			symbol_451.setName("upper");
			symbol_451.setType(symbol_12);  // Integer
			
			
			symbol_449.getOwnedParameters().add(symbol_451);
			symbol_449.setImplementationClass("org.eclipse.ocl.examples.library.string.StringSubstringOperation");
			symbol_449.setImplementation(org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
			{
				Comment symbol_452 = PivotFactory.eINSTANCE.createComment();
				symbol_452.setBody("The sub-string of oclText[self] starting at character number lower, up to and including character number upper. Character numbers run from 1 to self.size().");
				symbol_449.getOwnedComments().add(symbol_452);
			}
			
			symbol_14.getOwnedOperations().add(symbol_449);
		}
		{	// ocl::String::toBoolean()
			Operation symbol_453 = PivotFactory.eINSTANCE.createOperation(); // String!toBoolean()
			symbol_453.setName("toBoolean");
			symbol_453.setType(symbol_11);  // Boolean
			
			symbol_453.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToBooleanOperation");
			symbol_453.setImplementation(org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
			{
				Comment symbol_454 = PivotFactory.eINSTANCE.createComment();
				symbol_454.setBody("Converts oclText[self] to a boolean value.");
				symbol_453.getOwnedComments().add(symbol_454);
			}
			
			symbol_14.getOwnedOperations().add(symbol_453);
		}
		{	// ocl::String::toInteger()
			Operation symbol_455 = PivotFactory.eINSTANCE.createOperation(); // String!toInteger()
			symbol_455.setName("toInteger");
			symbol_455.setType(symbol_12);  // Integer
			
			symbol_455.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToIntegerOperation");
			symbol_455.setImplementation(org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
			{
				Comment symbol_456 = PivotFactory.eINSTANCE.createComment();
				symbol_456.setBody("Converts oclText[self] to an Integer value.");
				symbol_455.getOwnedComments().add(symbol_456);
			}
			
			symbol_14.getOwnedOperations().add(symbol_455);
		}
		{	// ocl::String::toLower()
			Operation symbol_457 = PivotFactory.eINSTANCE.createOperation(); // String!toLower()
			symbol_457.setName("toLower");
			symbol_457.setType(symbol_14);  // String
			
			symbol_457.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation");
			symbol_457.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			{
				Comment symbol_458 = PivotFactory.eINSTANCE.createComment();
				symbol_458.setBody("This is a deprecated variant of toLowerCase() preserving compatibility with traditional Eclipse OCL behaviour.");
				symbol_457.getOwnedComments().add(symbol_458);
			}
			
			symbol_14.getOwnedOperations().add(symbol_457);
		}
		{	// ocl::String::toLowerCase()
			Operation symbol_459 = PivotFactory.eINSTANCE.createOperation(); // String!toLowerCase()
			symbol_459.setName("toLowerCase");
			symbol_459.setType(symbol_14);  // String
			
			symbol_459.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation");
			symbol_459.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			{
				Comment symbol_460 = PivotFactory.eINSTANCE.createComment();
				symbol_460.setBody("Converts oclText[self] to lower case, using the locale defined by looking up oclLocale in the current environment.\nOtherwise, returns the same string as oclText[self].");
				symbol_459.getOwnedComments().add(symbol_460);
			}
			
			symbol_14.getOwnedOperations().add(symbol_459);
		}
		{	// ocl::String::toReal()
			Operation symbol_461 = PivotFactory.eINSTANCE.createOperation(); // String!toReal()
			symbol_461.setName("toReal");
			symbol_461.setType(symbol_13);  // Real
			
			symbol_461.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToRealOperation");
			symbol_461.setImplementation(org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
			{
				Comment symbol_462 = PivotFactory.eINSTANCE.createComment();
				symbol_462.setBody("Converts oclText[self] to a Real value.");
				symbol_461.getOwnedComments().add(symbol_462);
			}
			
			symbol_14.getOwnedOperations().add(symbol_461);
		}
		{	// ocl::String::toString()
			Operation symbol_463 = PivotFactory.eINSTANCE.createOperation(); // String!toString()
			symbol_463.setName("toString");
			symbol_463.setType(symbol_14);  // String
			
			symbol_463.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_463.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_464 = PivotFactory.eINSTANCE.createComment();
				symbol_464.setBody("Returns oclText[self].");
				symbol_463.getOwnedComments().add(symbol_464);
			}
			
			symbol_14.getOwnedOperations().add(symbol_463);
		}
		{	// ocl::String::toUpper()
			Operation symbol_465 = PivotFactory.eINSTANCE.createOperation(); // String!toUpper()
			symbol_465.setName("toUpper");
			symbol_465.setType(symbol_14);  // String
			
			symbol_465.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation");
			symbol_465.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			{
				Comment symbol_466 = PivotFactory.eINSTANCE.createComment();
				symbol_466.setBody("This is a deprecated variant of toUpperCase() preserving compatibility with traditional Eclipse OCL behaviour.");
				symbol_465.getOwnedComments().add(symbol_466);
			}
			
			symbol_14.getOwnedOperations().add(symbol_465);
		}
		{	// ocl::String::toUpperCase()
			Operation symbol_467 = PivotFactory.eINSTANCE.createOperation(); // String!toUpperCase()
			symbol_467.setName("toUpperCase");
			symbol_467.setType(symbol_14);  // String
			
			symbol_467.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation");
			symbol_467.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			{
				Comment symbol_468 = PivotFactory.eINSTANCE.createComment();
				symbol_468.setBody("Converts oclText[self] to upper case, using the locale defined by looking up oclLocale in the current environment.\nOtherwise, returns the same string as oclText[self].");
				symbol_467.getOwnedComments().add(symbol_468);
			}
			
			symbol_14.getOwnedOperations().add(symbol_467);
		}
		{
			Comment symbol_469 = PivotFactory.eINSTANCE.createComment();
			symbol_469.setBody("The standard type String represents strings, which can be both ASCII or Unicode.\nString is itself an instance of the metatype PrimitiveType (from UML).");
			symbol_14.getOwnedComments().add(symbol_469);
		}
		
		symbol_0.getOwnedTypes().add(symbol_14); // String
		//
		// ocl::UnlimitedNatural UnlimitedNatural
		//
		symbol_15.setName("UnlimitedNatural");
		symbol_15.getSuperClasses().add(symbol_12); // Integer
		{	// ocl::UnlimitedNatural::oclAsType()
			Operation symbol_470 = PivotFactory.eINSTANCE.createOperation(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])
			symbol_18.setName("TT");
			symbol_17.setOwnedParameteredElement(symbol_18);
			symbol_16.getOwnedParameters().add(symbol_17);
			
			symbol_470.setOwnedTemplateSignature(symbol_16);
			symbol_470.setName("oclAsType");
			symbol_470.setType(symbol_18);  // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT
			
			Parameter symbol_471 = PivotFactory.eINSTANCE.createParameter(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])!type
			symbol_471.setName("type");
			symbol_471.setType(symbol_177);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
			
			
			symbol_470.getOwnedParameters().add(symbol_471);
			symbol_470.setImplementationClass("org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation");
			symbol_470.setImplementation(org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation.INSTANCE);
			{
				Comment symbol_472 = PivotFactory.eINSTANCE.createComment();
				symbol_472.setBody("Evaluates to oclText[self], where oclText[self] is of the type identified by T.\nThe type T may be any classifier defined in the UML model;\nif the actual type of oclText[self] at evaluation time does not conform to T,\nthen the oclAsType operation evaluates to oclText[invalid].\n\nThe standard behavior is redefined for UnlimitedNatural. Numeric values may be converted to\nReal or Integer, but the e[unlimited] value may not.\nConversion of e[unlimited] to Real or Integer returns oclText[invalid].");
				symbol_470.getOwnedComments().add(symbol_472);
			}
			
			symbol_15.getOwnedOperations().add(symbol_470);
		}
		{
			Comment symbol_473 = PivotFactory.eINSTANCE.createComment();
			symbol_473.setBody("The standard type UnlimitedNatural is used to encode the non-negative values of a multiplicity specification.\nThis includes a special e[unlimited] value (*) that encodes the upper value of  a multiplicity specification.\nUnlimitedNatural is itself an instance of the metatype UnlimitedNaturalType.\n\nNote that although UnlimitedNatural is a subclass of Integer, the e[unlimited] value cannot be represented as an Integer.\nAny use of the e[unlimited] value as an integer or real is replaced by the oclText[invalid] value.");
			symbol_15.getOwnedComments().add(symbol_473);
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
		symbol_23.getSuperClasses().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		{	// ocl::Bag::<>()
			Operation symbol_474 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_474.setName("<>");
			symbol_474.setType(symbol_11);  // Boolean
			
			Parameter symbol_475 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_475.setName("object2");
			symbol_475.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_474.getOwnedParameters().add(symbol_475);
			symbol_474.setPrecedence(symbol_6);
			symbol_474.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_474.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_23.getOwnedOperations().add(symbol_474);
		}
		{	// ocl::Bag::=()
			Operation symbol_476 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_476.setName("=");
			symbol_476.setType(symbol_11);  // Boolean
			
			Parameter symbol_477 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_477.setName("object2");
			symbol_477.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_476.getOwnedParameters().add(symbol_477);
			symbol_476.setPrecedence(symbol_6);
			symbol_476.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_476.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_478 = PivotFactory.eINSTANCE.createComment();
				symbol_478.setBody("True if oclText[self] and bag contain the same elements, the same number of times.");
				symbol_476.getOwnedComments().add(symbol_478);
			}
			
			symbol_23.getOwnedOperations().add(symbol_476);
		}
		{	// ocl::Bag::closure()
			Iteration symbol_479 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_479.setName("closure");
			symbol_479.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			Parameter symbol_480 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!i
			symbol_480.setName("i");
			symbol_480.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_479.getOwnedIterators().add(symbol_480);
			Parameter symbol_481 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!body
			symbol_481.setName("body");
			symbol_481.setType(symbol_138);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
			
			
			symbol_479.getOwnedParameters().add(symbol_481);
			symbol_479.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ClosureIteration");
			symbol_479.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			{
				Comment symbol_482 = PivotFactory.eINSTANCE.createComment();
				symbol_482.setBody("The closure of applying body transitively to every distinct element of the source collection.");
				symbol_479.getOwnedComments().add(symbol_482);
			}
			
			symbol_23.getOwnedOperations().add(symbol_479);
		}
		{	// ocl::Bag::collect()
			Iteration symbol_483 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)
			symbol_29.setName("V");
			symbol_28.setOwnedParameteredElement(symbol_29);
			symbol_27.getOwnedParameters().add(symbol_28);
			
			symbol_483.setOwnedTemplateSignature(symbol_27);
			symbol_483.setName("collect");
			symbol_483.setType(symbol_190);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_484 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)!i
			symbol_484.setName("i");
			symbol_484.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_483.getOwnedIterators().add(symbol_484);
			Parameter symbol_485 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)!body
			symbol_485.setName("body");
			symbol_485.setType(symbol_136);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V
			
			
			symbol_483.getOwnedParameters().add(symbol_485);
			symbol_483.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_483.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			
			symbol_23.getOwnedOperations().add(symbol_483);
		}
		{	// ocl::Bag::collectNested()
			Iteration symbol_486 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)
			symbol_32.setName("V");
			symbol_31.setOwnedParameteredElement(symbol_32);
			symbol_30.getOwnedParameters().add(symbol_31);
			
			symbol_486.setOwnedTemplateSignature(symbol_30);
			symbol_486.setName("collectNested");
			symbol_486.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_487 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_487.setName("i");
			symbol_487.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_486.getOwnedIterators().add(symbol_487);
			Parameter symbol_488 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_488.setName("body");
			symbol_488.setType(symbol_135);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)?V
			
			
			symbol_486.getOwnedParameters().add(symbol_488);
			symbol_486.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_486.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			{
				Comment symbol_489 = PivotFactory.eINSTANCE.createComment();
				symbol_489.setBody("The Bag of elements which results from applying body to every member of the source nonordered collection.");
				symbol_486.getOwnedComments().add(symbol_489);
			}
			
			symbol_23.getOwnedOperations().add(symbol_486);
		}
		{	// ocl::Bag::excluding()
			Operation symbol_490 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_490.setName("excluding");
			symbol_490.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_491 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_491.setName("object");
			symbol_491.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_490.getOwnedParameters().add(symbol_491);
			symbol_490.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_490.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_492 = PivotFactory.eINSTANCE.createComment();
				symbol_492.setBody("The bag containing all elements of oclText[self] apart from all occurrences of object.");
				symbol_490.getOwnedComments().add(symbol_492);
			}
			
			symbol_23.getOwnedOperations().add(symbol_490);
		}
		{	// ocl::Bag::flatten()
			Operation symbol_493 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()
			symbol_35.setName("T2");
			symbol_34.setOwnedParameteredElement(symbol_35);
			symbol_33.getOwnedParameters().add(symbol_34);
			
			symbol_493.setOwnedTemplateSignature(symbol_33);
			symbol_493.setName("flatten");
			symbol_493.setType(symbol_191);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
			
			symbol_493.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_493.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			{
				Comment symbol_494 = PivotFactory.eINSTANCE.createComment();
				symbol_494.setBody("Redefines the Collection operation. If the element type is not a collection type, this results in the same bag as oclText[self].\nIf the element type is a collection type, the result is the bag containing all the elements of all the recursively flattened elements of oclText[self].");
				symbol_493.getOwnedComments().add(symbol_494);
			}
			
			symbol_23.getOwnedOperations().add(symbol_493);
		}
		{	// ocl::Bag::including()
			Operation symbol_495 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!including(T)
			symbol_495.setName("including");
			symbol_495.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_496 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!including(T)!object
			symbol_496.setName("object");
			symbol_496.setType(symbol_26);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			
			symbol_495.getOwnedParameters().add(symbol_496);
			symbol_495.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_495.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_497 = PivotFactory.eINSTANCE.createComment();
				symbol_497.setBody("The bag containing all elements of oclText[self] plus object.");
				symbol_495.getOwnedComments().add(symbol_497);
			}
			
			symbol_23.getOwnedOperations().add(symbol_495);
		}
		{	// ocl::Bag::intersection()
			Operation symbol_498 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_498.setName("intersection");
			symbol_498.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_499 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!bag
			symbol_499.setName("bag");
			symbol_499.setType(symbol_219);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			
			symbol_498.getOwnedParameters().add(symbol_499);
			symbol_498.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_498.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			{
				Comment symbol_500 = PivotFactory.eINSTANCE.createComment();
				symbol_500.setBody("The intersection of oclText[self] and bag; the bag of all elements that are in both oclText[self] and s.");
				symbol_498.getOwnedComments().add(symbol_500);
			}
			
			symbol_23.getOwnedOperations().add(symbol_498);
		}
		{	// ocl::Bag::intersection()
			Operation symbol_501 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])
			symbol_501.setName("intersection");
			symbol_501.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			Parameter symbol_502 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])!s
			symbol_502.setName("s");
			symbol_502.setType(symbol_279);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			
			symbol_501.getOwnedParameters().add(symbol_502);
			symbol_501.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_501.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			{
				Comment symbol_503 = PivotFactory.eINSTANCE.createComment();
				symbol_503.setBody("The intersection of oclText[self] and s; the set of all elements that are in both oclText[self] and s.");
				symbol_501.getOwnedComments().add(symbol_503);
			}
			
			symbol_23.getOwnedOperations().add(symbol_501);
		}
		{	// ocl::Bag::reject()
			Iteration symbol_504 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)
			symbol_504.setName("reject");
			symbol_504.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_505 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)!i
			symbol_505.setName("i");
			symbol_505.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_504.getOwnedIterators().add(symbol_505);
			Parameter symbol_506 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)!body
			symbol_506.setName("body");
			symbol_506.setType(symbol_134);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
			
			
			symbol_504.getOwnedParameters().add(symbol_506);
			symbol_504.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_504.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_507 = PivotFactory.eINSTANCE.createComment();
				symbol_507.setBody("The sub-bag of the source bag for which body is oclText[false].\n\noclCode[self->reject(iterator | body) = self->select(iterator | not body)].");
				symbol_504.getOwnedComments().add(symbol_507);
			}
			
			symbol_23.getOwnedOperations().add(symbol_504);
		}
		{	// ocl::Bag::select()
			Iteration symbol_508 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)
			symbol_508.setName("select");
			symbol_508.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_509 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)!i
			symbol_509.setName("i");
			symbol_509.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_508.getOwnedIterators().add(symbol_509);
			Parameter symbol_510 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)!body
			symbol_510.setName("body");
			symbol_510.setType(symbol_133);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
			
			
			symbol_508.getOwnedParameters().add(symbol_510);
			symbol_508.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_508.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_511 = PivotFactory.eINSTANCE.createComment();
				symbol_511.setBody("The sub-bag of the source bag for which body is oclText[true].\n\noclCode[self->select(iterator | body) =\nself->iterate(iterator; result : Bag<T> = Bag{} |\nif body then result->including(iterator)\nelse result\nendif)]");
				symbol_508.getOwnedComments().add(symbol_511);
			}
			
			symbol_23.getOwnedOperations().add(symbol_508);
		}
		{	// ocl::Bag::sortedBy()
			Iteration symbol_512 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_512.setName("sortedBy");
			symbol_512.setType(symbol_258);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			Parameter symbol_513 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_513.setName("i");
			symbol_513.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_512.getOwnedIterators().add(symbol_513);
			Parameter symbol_514 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_514.setName("body");
			symbol_514.setType(symbol_137);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_512.getOwnedParameters().add(symbol_514);
			symbol_512.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_512.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_515 = PivotFactory.eINSTANCE.createComment();
				symbol_515.setBody("Results in the Sequence containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
				symbol_512.getOwnedComments().add(symbol_515);
			}
			
			symbol_23.getOwnedOperations().add(symbol_512);
		}
		{	// ocl::Bag::union()
			Operation symbol_516 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_516.setName("union");
			symbol_516.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_517 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!bag
			symbol_517.setName("bag");
			symbol_517.setType(symbol_219);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			
			symbol_516.getOwnedParameters().add(symbol_517);
			symbol_516.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_516.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_518 = PivotFactory.eINSTANCE.createComment();
				symbol_518.setBody("The union of oclText[self] and bag; the bag of all elements that are in oclText[self] and all elements that are in bag.");
				symbol_516.getOwnedComments().add(symbol_518);
			}
			
			symbol_23.getOwnedOperations().add(symbol_516);
		}
		{	// ocl::Bag::union()
			Operation symbol_519 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])
			symbol_519.setName("union");
			symbol_519.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			Parameter symbol_520 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])!s
			symbol_520.setName("s");
			symbol_520.setType(symbol_279);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			
			symbol_519.getOwnedParameters().add(symbol_520);
			symbol_519.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_519.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_521 = PivotFactory.eINSTANCE.createComment();
				symbol_521.setBody("The union of oclText[self] and s; the set of all elements that are in oclText[self] and all elements that are in s.");
				symbol_519.getOwnedComments().add(symbol_521);
			}
			
			symbol_23.getOwnedOperations().add(symbol_519);
		}
		{
			Comment symbol_522 = PivotFactory.eINSTANCE.createComment();
			symbol_522.setBody("A bag is a collection with duplicates allowed. That is, one object can be an element of a bag many times.\nThere is no ordering defined on the elements in a bag.\nBag is itself an instance of the metatype BagType.");
			symbol_23.getOwnedComments().add(symbol_522);
		}
		
		symbol_0.getOwnedTypes().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
		//
		// ocl::Class http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		//
		symbol_36.setName("Class");
		symbol_36.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Class::oclType()
			Operation symbol_523 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class!oclType()
			symbol_523.setName("oclType");
			symbol_523.setType(symbol_210);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_523.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_523.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			{
				Comment symbol_524 = PivotFactory.eINSTANCE.createComment();
				symbol_524.setBody("Evaluates to the type of which self is an instance.");
				symbol_523.getOwnedComments().add(symbol_524);
			}
			
			symbol_36.getOwnedOperations().add(symbol_523);
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
		symbol_37.getSuperClasses().add(symbol_178); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		
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
		symbol_41.getSuperClasses().add(symbol_179); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		{ // ocl::CollectionClassifier::elementType
			symbol_47.setName("elementType");
			symbol_47.setType(symbol_46);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?E
			
			symbol_47.setIsResolveProxies(true);
			symbol_47.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionClassifierElementTypeProperty");
			symbol_47.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionClassifierElementTypeProperty.INSTANCE);
			{
				Comment symbol_525 = PivotFactory.eINSTANCE.createComment();
				symbol_525.setBody("Evaluates to the type of the collection elements.");
				symbol_47.getOwnedComments().add(symbol_525);
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
			Operation symbol_526 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_526.setName("<>");
			symbol_526.setType(symbol_11);  // Boolean
			
			Parameter symbol_527 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_527.setName("object2");
			symbol_527.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_526.getOwnedParameters().add(symbol_527);
			symbol_526.setPrecedence(symbol_6);
			symbol_526.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_526.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_528 = PivotFactory.eINSTANCE.createComment();
				symbol_528.setBody("True if c is not equal to oclText[self].");
				symbol_526.getOwnedComments().add(symbol_528);
			}
			
			symbol_48.getOwnedOperations().add(symbol_526);
		}
		{	// ocl::Collection::=()
			Operation symbol_529 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_529.setName("=");
			symbol_529.setType(symbol_11);  // Boolean
			
			Parameter symbol_530 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_530.setName("object2");
			symbol_530.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_529.getOwnedParameters().add(symbol_530);
			symbol_529.setPrecedence(symbol_6);
			symbol_529.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_529.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_531 = PivotFactory.eINSTANCE.createComment();
				symbol_531.setBody("True if c is a collection of the same kind as oclText[self] and contains the same elements in the same quantities and in the same order,\nin the case of an ordered collection type.");
				symbol_529.getOwnedComments().add(symbol_531);
			}
			
			symbol_48.getOwnedOperations().add(symbol_529);
		}
		{	// ocl::Collection::any()
			Iteration symbol_532 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)
			symbol_532.setName("any");
			symbol_532.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			Parameter symbol_533 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)!i
			symbol_533.setName("i");
			symbol_533.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_532.getOwnedIterators().add(symbol_533);
			Parameter symbol_534 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)!body
			symbol_534.setName("body");
			symbol_534.setType(symbol_140);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_532.getOwnedParameters().add(symbol_534);
			symbol_532.setImplementationClass("org.eclipse.ocl.examples.library.iterator.AnyIteration");
			symbol_532.setImplementation(org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE);
			{
				Comment symbol_535 = PivotFactory.eINSTANCE.createComment();
				symbol_535.setBody("Returns any element in the source collection for which body evaluates to oclText[true].\nIf there is more than one element for which body is oclText[true], one of them is returned.\nThere must be at least one element fulfilling body, otherwise the result of this IteratorExp is oclText[null].");
				symbol_532.getOwnedComments().add(symbol_535);
			}
			
			symbol_48.getOwnedOperations().add(symbol_532);
		}
		{	// ocl::Collection::asBag()
			Operation symbol_536 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asBag()
			symbol_536.setName("asBag");
			symbol_536.setType(symbol_196);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_536.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation");
			symbol_536.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
			{
				Comment symbol_537 = PivotFactory.eINSTANCE.createComment();
				symbol_537.setBody("The Bag that contains all the elements from oclText[self].");
				symbol_536.getOwnedComments().add(symbol_537);
			}
			
			symbol_48.getOwnedOperations().add(symbol_536);
		}
		{	// ocl::Collection::asOrderedSet()
			Operation symbol_538 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asOrderedSet()
			symbol_538.setName("asOrderedSet");
			symbol_538.setType(symbol_250);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_538.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation");
			symbol_538.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
			{
				Comment symbol_539 = PivotFactory.eINSTANCE.createComment();
				symbol_539.setBody("An OrderedSet that contains all the elements from oclText[self], with duplicates removed,\nin an order dependent on the particular concrete collection type.");
				symbol_538.getOwnedComments().add(symbol_539);
			}
			
			symbol_48.getOwnedOperations().add(symbol_538);
		}
		{	// ocl::Collection::asSequence()
			Operation symbol_540 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asSequence()
			symbol_540.setName("asSequence");
			symbol_540.setType(symbol_259);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_540.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation");
			symbol_540.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
			{
				Comment symbol_541 = PivotFactory.eINSTANCE.createComment();
				symbol_541.setBody("Sequence that contains all the elements from oclText[self], in an order dependent on the particular concrete collection type.");
				symbol_540.getOwnedComments().add(symbol_541);
			}
			
			symbol_48.getOwnedOperations().add(symbol_540);
		}
		{	// ocl::Collection::asSet()
			Operation symbol_542 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asSet()
			symbol_542.setName("asSet");
			symbol_542.setType(symbol_271);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_542.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation");
			symbol_542.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
			{
				Comment symbol_543 = PivotFactory.eINSTANCE.createComment();
				symbol_543.setBody("The Set containing all the elements from oclText[self], with duplicates removed.");
				symbol_542.getOwnedComments().add(symbol_543);
			}
			
			symbol_48.getOwnedOperations().add(symbol_542);
		}
		{	// ocl::Collection::collect()
			Iteration symbol_544 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)
			symbol_54.setName("V");
			symbol_53.setOwnedParameteredElement(symbol_54);
			symbol_52.getOwnedParameters().add(symbol_53);
			
			symbol_544.setOwnedTemplateSignature(symbol_52);
			symbol_544.setName("collect");
			symbol_544.setType(symbol_222);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_545 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!i
			symbol_545.setName("i");
			symbol_545.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_544.getOwnedIterators().add(symbol_545);
			Parameter symbol_546 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!body
			symbol_546.setName("body");
			symbol_546.setType(symbol_148);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
			
			
			symbol_544.getOwnedParameters().add(symbol_546);
			symbol_544.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_544.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			{
				Comment symbol_547 = PivotFactory.eINSTANCE.createComment();
				symbol_547.setBody("The Collection of elements that results from applying body to every member of the source set.\nThe result is flattened. Notice that this is based on collectNested, which can be of different type depending on the type of source.\ncollectNested is defined individually for each subclass of CollectionType.");
				symbol_544.getOwnedComments().add(symbol_547);
			}
			
			symbol_48.getOwnedOperations().add(symbol_544);
		}
		{	// ocl::Collection::collectNested()
			Iteration symbol_548 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)
			symbol_57.setName("V");
			symbol_56.setOwnedParameteredElement(symbol_57);
			symbol_55.getOwnedParameters().add(symbol_56);
			
			symbol_548.setOwnedTemplateSignature(symbol_55);
			symbol_548.setName("collectNested");
			symbol_548.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_549 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_549.setName("i");
			symbol_549.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_548.getOwnedIterators().add(symbol_549);
			Parameter symbol_550 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_550.setName("body");
			symbol_550.setType(symbol_147);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
			
			
			symbol_548.getOwnedParameters().add(symbol_550);
			symbol_548.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_548.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			{
				Comment symbol_551 = PivotFactory.eINSTANCE.createComment();
				symbol_551.setBody("The Collection of elements which results from applying body to every member of the source collection.");
				symbol_548.getOwnedComments().add(symbol_551);
			}
			
			symbol_48.getOwnedOperations().add(symbol_548);
		}
		{	// ocl::Collection::count()
			Operation symbol_552 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!count(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_552.setName("count");
			symbol_552.setType(symbol_12);  // Integer
			
			Parameter symbol_553 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!count(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_553.setName("object");
			symbol_553.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_552.getOwnedParameters().add(symbol_553);
			symbol_552.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionCountOperation");
			symbol_552.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE);
			{
				Comment symbol_554 = PivotFactory.eINSTANCE.createComment();
				symbol_554.setBody("The number of times that object occurs in the collection oclText[self].");
				symbol_552.getOwnedComments().add(symbol_554);
			}
			
			symbol_48.getOwnedOperations().add(symbol_552);
		}
		{	// ocl::Collection::excludes()
			Operation symbol_555 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_555.setName("excludes");
			symbol_555.setType(symbol_11);  // Boolean
			
			Parameter symbol_556 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_556.setName("object");
			symbol_556.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_555.getOwnedParameters().add(symbol_556);
			symbol_555.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation");
			symbol_555.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE);
			{
				Comment symbol_557 = PivotFactory.eINSTANCE.createComment();
				symbol_557.setBody("True if object is not an element of oclText[self], oclText[false] otherwise.");
				symbol_555.getOwnedComments().add(symbol_557);
			}
			
			symbol_48.getOwnedOperations().add(symbol_555);
		}
		{	// ocl::Collection::excludesAll()
			Operation symbol_558 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_60.setName("T2");
			symbol_59.setOwnedParameteredElement(symbol_60);
			symbol_58.getOwnedParameters().add(symbol_59);
			
			symbol_558.setOwnedTemplateSignature(symbol_58);
			symbol_558.setName("excludesAll");
			symbol_558.setType(symbol_11);  // Boolean
			
			Parameter symbol_559 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_559.setName("c2");
			symbol_559.setType(symbol_223);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			
			symbol_558.getOwnedParameters().add(symbol_559);
			symbol_558.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation");
			symbol_558.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE);
			{
				Comment symbol_560 = PivotFactory.eINSTANCE.createComment();
				symbol_560.setBody("Does oclText[self] contain none of the elements of c2 ?");
				symbol_558.getOwnedComments().add(symbol_560);
			}
			
			symbol_48.getOwnedOperations().add(symbol_558);
		}
		{	// ocl::Collection::excluding()
			Operation symbol_561 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_561.setName("excluding");
			symbol_561.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_562 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_562.setName("object");
			symbol_562.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_561.getOwnedParameters().add(symbol_562);
			symbol_561.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_561.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_563 = PivotFactory.eINSTANCE.createComment();
				symbol_563.setBody("The collection containing all elements of oclText[self] apart from object.");
				symbol_561.getOwnedComments().add(symbol_563);
			}
			
			symbol_48.getOwnedOperations().add(symbol_561);
		}
		{	// ocl::Collection::exists()
			Iteration symbol_564 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)
			symbol_564.setName("exists");
			symbol_564.setType(symbol_11);  // Boolean
			
			Parameter symbol_565 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)!i
			symbol_565.setName("i");
			symbol_565.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_564.getOwnedIterators().add(symbol_565);
			Parameter symbol_566 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)!body
			symbol_566.setName("body");
			symbol_566.setType(symbol_142);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_564.getOwnedParameters().add(symbol_566);
			symbol_564.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ExistsIteration");
			symbol_564.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			{
				Comment symbol_567 = PivotFactory.eINSTANCE.createComment();
				symbol_567.setBody("Results in oclText[true] if body evaluates to oclText[true] for at least one element in the source collection.");
				symbol_564.getOwnedComments().add(symbol_567);
			}
			
			symbol_48.getOwnedOperations().add(symbol_564);
		}
		{	// ocl::Collection::exists()
			Iteration symbol_568 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)
			symbol_568.setName("exists");
			symbol_568.setType(symbol_11);  // Boolean
			
			Parameter symbol_569 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!i
			symbol_569.setName("i");
			symbol_569.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_568.getOwnedIterators().add(symbol_569);
			Parameter symbol_570 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!j
			symbol_570.setName("j");
			symbol_570.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_568.getOwnedIterators().add(symbol_570);
			Parameter symbol_571 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!body
			symbol_571.setName("body");
			symbol_571.setType(symbol_144);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_568.getOwnedParameters().add(symbol_571);
			symbol_568.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ExistsIteration");
			symbol_568.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			
			symbol_48.getOwnedOperations().add(symbol_568);
		}
		{	// ocl::Collection::flatten()
			Operation symbol_572 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()
			symbol_63.setName("T2");
			symbol_62.setOwnedParameteredElement(symbol_63);
			symbol_61.getOwnedParameters().add(symbol_62);
			
			symbol_572.setOwnedTemplateSignature(symbol_61);
			symbol_572.setName("flatten");
			symbol_572.setType(symbol_224);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
			
			symbol_572.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_572.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			{
				Comment symbol_573 = PivotFactory.eINSTANCE.createComment();
				symbol_573.setBody("If the element type is not a collection type, this results in the same collection as oclText[self].\nIf the element type is a collection type, the result is a collection containing all the elements of all the recursively flattened elements of oclText[self].");
				symbol_572.getOwnedComments().add(symbol_573);
			}
			
			symbol_48.getOwnedOperations().add(symbol_572);
		}
		{	// ocl::Collection::forAll()
			Iteration symbol_574 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)
			symbol_574.setName("forAll");
			symbol_574.setType(symbol_11);  // Boolean
			
			Parameter symbol_575 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)!i
			symbol_575.setName("i");
			symbol_575.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_574.getOwnedIterators().add(symbol_575);
			Parameter symbol_576 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)!body
			symbol_576.setName("body");
			symbol_576.setType(symbol_145);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_574.getOwnedParameters().add(symbol_576);
			symbol_574.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ForAllIteration");
			symbol_574.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			{
				Comment symbol_577 = PivotFactory.eINSTANCE.createComment();
				symbol_577.setBody("Results in oclText[true] if the body expression evaluates to oclText[true] for each element in the source collection; otherwise, result is oclText[false].");
				symbol_574.getOwnedComments().add(symbol_577);
			}
			
			symbol_48.getOwnedOperations().add(symbol_574);
		}
		{	// ocl::Collection::forAll()
			Iteration symbol_578 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)
			symbol_578.setName("forAll");
			symbol_578.setType(symbol_11);  // Boolean
			
			Parameter symbol_579 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!j
			symbol_579.setName("j");
			symbol_579.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_578.getOwnedIterators().add(symbol_579);
			Parameter symbol_580 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!i
			symbol_580.setName("i");
			symbol_580.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_578.getOwnedIterators().add(symbol_580);
			Parameter symbol_581 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!body
			symbol_581.setName("body");
			symbol_581.setType(symbol_146);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_578.getOwnedParameters().add(symbol_581);
			symbol_578.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ForAllIteration");
			symbol_578.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			
			symbol_48.getOwnedOperations().add(symbol_578);
		}
		{	// ocl::Collection::includes()
			Operation symbol_582 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_582.setName("includes");
			symbol_582.setType(symbol_11);  // Boolean
			
			Parameter symbol_583 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_583.setName("object");
			symbol_583.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_582.getOwnedParameters().add(symbol_583);
			symbol_582.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation");
			symbol_582.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE);
			{
				Comment symbol_584 = PivotFactory.eINSTANCE.createComment();
				symbol_584.setBody("True if object is an element of oclText[self], oclText[false] otherwise.");
				symbol_582.getOwnedComments().add(symbol_584);
			}
			
			symbol_48.getOwnedOperations().add(symbol_582);
		}
		{	// ocl::Collection::includesAll()
			Operation symbol_585 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_66.setName("T2");
			symbol_65.setOwnedParameteredElement(symbol_66);
			symbol_64.getOwnedParameters().add(symbol_65);
			
			symbol_585.setOwnedTemplateSignature(symbol_64);
			symbol_585.setName("includesAll");
			symbol_585.setType(symbol_11);  // Boolean
			
			Parameter symbol_586 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_586.setName("c2");
			symbol_586.setType(symbol_225);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			
			symbol_585.getOwnedParameters().add(symbol_586);
			symbol_585.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation");
			symbol_585.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE);
			{
				Comment symbol_587 = PivotFactory.eINSTANCE.createComment();
				symbol_587.setBody("Does oclText[self] contain all the elements of c2 ?");
				symbol_585.getOwnedComments().add(symbol_587);
			}
			
			symbol_48.getOwnedOperations().add(symbol_585);
		}
		{	// ocl::Collection::including()
			Operation symbol_588 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!including(T)
			symbol_588.setName("including");
			symbol_588.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_589 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!including(T)!object
			symbol_589.setName("object");
			symbol_589.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			
			symbol_588.getOwnedParameters().add(symbol_589);
			symbol_588.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_588.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_590 = PivotFactory.eINSTANCE.createComment();
				symbol_590.setBody("The collection containing all elements of oclText[self] plus object.");
				symbol_588.getOwnedComments().add(symbol_590);
			}
			
			symbol_48.getOwnedOperations().add(symbol_588);
		}
		{	// ocl::Collection::isEmpty()
			Operation symbol_591 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isEmpty()
			symbol_591.setName("isEmpty");
			symbol_591.setType(symbol_11);  // Boolean
			
			symbol_591.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation");
			symbol_591.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
			{
				Comment symbol_592 = PivotFactory.eINSTANCE.createComment();
				symbol_592.setBody("Is oclText[self] the empty collection?\n\nNote: oclText[null->isEmpty()] returns oclText[true] in virtue of the implicit casting from oclText[null] to oclText[Bag{}].");
				symbol_591.getOwnedComments().add(symbol_592);
			}
			
			symbol_48.getOwnedOperations().add(symbol_591);
		}
		{	// ocl::Collection::isUnique()
			Iteration symbol_593 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_593.setName("isUnique");
			symbol_593.setType(symbol_11);  // Boolean
			
			Parameter symbol_594 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_594.setName("i");
			symbol_594.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_593.getOwnedIterators().add(symbol_594);
			Parameter symbol_595 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_595.setName("body");
			symbol_595.setType(symbol_151);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_593.getOwnedParameters().add(symbol_595);
			symbol_593.setImplementationClass("org.eclipse.ocl.examples.library.iterator.IsUniqueIteration");
			symbol_593.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			{
				Comment symbol_596 = PivotFactory.eINSTANCE.createComment();
				symbol_596.setBody("Results in oclText[true] if body evaluates to a different value for each element in the source collection; otherwise, result is oclText[false].");
				symbol_593.getOwnedComments().add(symbol_596);
			}
			
			symbol_48.getOwnedOperations().add(symbol_593);
		}
		{	// ocl::Collection::iterate()
			Iteration symbol_597 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)
			symbol_69.setName("Tacc");
			symbol_68.setOwnedParameteredElement(symbol_69);
			symbol_67.getOwnedParameters().add(symbol_68);
			
			symbol_597.setOwnedTemplateSignature(symbol_67);
			symbol_597.setName("iterate");
			symbol_597.setType(symbol_69);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
			
			Parameter symbol_598 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)!i
			symbol_598.setName("i");
			symbol_598.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_597.getOwnedIterators().add(symbol_598);
			Parameter symbol_599 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)!acc
			symbol_599.setName("acc");
			symbol_599.setType(symbol_69); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
			
			symbol_597.getOwnedAccumulators().add(symbol_599);
			Parameter symbol_600 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)!body
			symbol_600.setName("body");
			symbol_600.setType(symbol_149);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
			
			
			symbol_597.getOwnedParameters().add(symbol_600);
			symbol_597.setImplementationClass("org.eclipse.ocl.examples.library.iterator.IterateIteration");
			symbol_597.setImplementation(org.eclipse.ocl.examples.library.iterator.IterateIteration.INSTANCE);
			
			symbol_48.getOwnedOperations().add(symbol_597);
		}
		{	// ocl::Collection::max()
			Operation symbol_601 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!max()
			symbol_601.setName("max");
			symbol_601.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_601.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionMaxOperation");
			symbol_601.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
			{
				Comment symbol_602 = PivotFactory.eINSTANCE.createComment();
				symbol_602.setBody("The element with the maximum value of all elements in oclText[self].\nElements must be of a type supporting the max operation.\nThe max operation - supported by the elements - must take one parameter of type T and be both associative and commutative.\nUnlimitedNatural, Integer and Real fulfill this condition.");
				symbol_601.getOwnedComments().add(symbol_602);
			}
			
			symbol_48.getOwnedOperations().add(symbol_601);
		}
		{	// ocl::Collection::min()
			Operation symbol_603 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!min()
			symbol_603.setName("min");
			symbol_603.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_603.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionMinOperation");
			symbol_603.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
			{
				Comment symbol_604 = PivotFactory.eINSTANCE.createComment();
				symbol_604.setBody("The element with the minimum value of all elements in oclText[self].\nElements must be of a type supporting the min operation.\nThe min operation - supported by the elements - must take one parameter of type T and be both associative and commutative.\nUnlimitedNatural, Integer and Real fulfill this condition.");
				symbol_603.getOwnedComments().add(symbol_604);
			}
			
			symbol_48.getOwnedOperations().add(symbol_603);
		}
		{	// ocl::Collection::notEmpty()
			Operation symbol_605 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!notEmpty()
			symbol_605.setName("notEmpty");
			symbol_605.setType(symbol_11);  // Boolean
			
			symbol_605.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation");
			symbol_605.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
			{
				Comment symbol_606 = PivotFactory.eINSTANCE.createComment();
				symbol_606.setBody("Is oclText[self] not the empty collection?\n\noclText[null->notEmpty()] returns oclText[false] in virtue of the implicit casting from oclText[null] to oclText[Bag{}].");
				symbol_605.getOwnedComments().add(symbol_606);
			}
			
			symbol_48.getOwnedOperations().add(symbol_605);
		}
		{	// ocl::Collection::oclType()
			Operation symbol_607 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!oclType()
			symbol_607.setName("oclType");
			symbol_607.setType(symbol_212);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_607.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_607.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			{
				Comment symbol_608 = PivotFactory.eINSTANCE.createComment();
				symbol_608.setBody("Evaluates to the type of which oclText[self] is an instance.");
				symbol_607.getOwnedComments().add(symbol_608);
			}
			
			symbol_48.getOwnedOperations().add(symbol_607);
		}
		{	// ocl::Collection::one()
			Iteration symbol_609 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)
			symbol_609.setName("one");
			symbol_609.setType(symbol_11);  // Boolean
			
			Parameter symbol_610 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)!i
			symbol_610.setName("i");
			symbol_610.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_609.getOwnedIterators().add(symbol_610);
			Parameter symbol_611 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)!body
			symbol_611.setName("body");
			symbol_611.setType(symbol_141);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_609.getOwnedParameters().add(symbol_611);
			symbol_609.setImplementationClass("org.eclipse.ocl.examples.library.iterator.OneIteration");
			symbol_609.setImplementation(org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE);
			{
				Comment symbol_612 = PivotFactory.eINSTANCE.createComment();
				symbol_612.setBody("Results in oclText[true] if there is exactly one element in the source collection for which body is oclText[true].");
				symbol_609.getOwnedComments().add(symbol_612);
			}
			
			symbol_48.getOwnedOperations().add(symbol_609);
		}
		{	// ocl::Collection::product()
			Operation symbol_613 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_72.setName("T2");
			symbol_71.setOwnedParameteredElement(symbol_72);
			symbol_70.getOwnedParameters().add(symbol_71);
			
			symbol_613.setOwnedTemplateSignature(symbol_70);
			symbol_613.setName("product");
			symbol_613.setType(symbol_269);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
			
			Parameter symbol_614 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_614.setName("c2");
			symbol_614.setType(symbol_226);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			
			symbol_613.getOwnedParameters().add(symbol_614);
			symbol_613.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionProductOperation");
			symbol_613.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE);
			{
				Comment symbol_615 = PivotFactory.eINSTANCE.createComment();
				symbol_615.setBody("The cartesian product operation of oclText[self] and c2.");
				symbol_613.getOwnedComments().add(symbol_615);
			}
			
			symbol_48.getOwnedOperations().add(symbol_613);
		}
		{	// ocl::Collection::reject()
			Iteration symbol_616 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)
			symbol_616.setName("reject");
			symbol_616.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_617 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)!i
			symbol_617.setName("i");
			symbol_617.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_616.getOwnedIterators().add(symbol_617);
			Parameter symbol_618 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)!body
			symbol_618.setName("body");
			symbol_618.setType(symbol_143);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_616.getOwnedParameters().add(symbol_618);
			symbol_616.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_616.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_619 = PivotFactory.eINSTANCE.createComment();
				symbol_619.setBody("The sub-collection of the source collection for which body is oclText[false].");
				symbol_616.getOwnedComments().add(symbol_619);
			}
			
			symbol_48.getOwnedOperations().add(symbol_616);
		}
		{	// ocl::Collection::select()
			Iteration symbol_620 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)
			symbol_620.setName("select");
			symbol_620.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_621 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)!i
			symbol_621.setName("i");
			symbol_621.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_620.getOwnedIterators().add(symbol_621);
			Parameter symbol_622 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)!body
			symbol_622.setName("body");
			symbol_622.setType(symbol_139);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_620.getOwnedParameters().add(symbol_622);
			symbol_620.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_620.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_623 = PivotFactory.eINSTANCE.createComment();
				symbol_623.setBody("The sub-collection of the source collection for which body is oclText[true].");
				symbol_620.getOwnedComments().add(symbol_623);
			}
			
			symbol_48.getOwnedOperations().add(symbol_620);
		}
		{	// ocl::Collection::size()
			Operation symbol_624 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!size()
			symbol_624.setName("size");
			symbol_624.setType(symbol_12);  // Integer
			
			symbol_624.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionSizeOperation");
			symbol_624.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
			{
				Comment symbol_625 = PivotFactory.eINSTANCE.createComment();
				symbol_625.setBody("The number of elements in the collection oclText[self].");
				symbol_624.getOwnedComments().add(symbol_625);
			}
			
			symbol_48.getOwnedOperations().add(symbol_624);
		}
		{	// ocl::Collection::sortedBy()
			Iteration symbol_626 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_626.setName("sortedBy");
			symbol_626.setType(symbol_259);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			Parameter symbol_627 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_627.setName("i");
			symbol_627.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_626.getOwnedIterators().add(symbol_627);
			Parameter symbol_628 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_628.setName("body");
			symbol_628.setType(symbol_150);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_626.getOwnedParameters().add(symbol_628);
			symbol_626.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_626.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_629 = PivotFactory.eINSTANCE.createComment();
				symbol_629.setBody("Results in the Collection containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
				symbol_626.getOwnedComments().add(symbol_629);
			}
			
			symbol_48.getOwnedOperations().add(symbol_626);
		}
		{	// ocl::Collection::sum()
			Operation symbol_630 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sum()
			symbol_630.setName("sum");
			symbol_630.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_630.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionSumOperation");
			symbol_630.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
			{
				Comment symbol_631 = PivotFactory.eINSTANCE.createComment();
				symbol_631.setBody("The addition of all elements in oclText[self].\nElements must be of an oclText[OclSummable] type to provide the zero() and sum() operations.\nThe e[sum] operation must be both associative: a.sum(b).sum(c) = a.sum(b.sum(c)), and commutative: a.sum(b) = b.sum(a).\nUnlimitedNatural, Integer and Real fulfill this condition.\n\nIf the e[sum] operation is not both associative and commutative, the e[sum] expression is not well-formed,\nwhich may result in unpredictable results during evaluation.\nIf an implementation is able to detect a lack of associativity or commutativity,\nthe implementation may bypass the evaluation and return an oclText[invalid] result.");
				symbol_630.getOwnedComments().add(symbol_631);
			}
			
			symbol_48.getOwnedOperations().add(symbol_630);
		}
		{
			Comment symbol_632 = PivotFactory.eINSTANCE.createComment();
			symbol_632.setBody("Collection is the abstract supertype of all collection types in the OCL Standard Library.\nEach occurrence of an object in a collection is called an element.\nIf an object occurs twice in a collection, there are two elements.\n\nThis sub clause defines the properties on Collections that have identical semantics for all collection subtypes.\nSome operations may be defined within the subtype as well,\nwhich means that there is an additional postcondition or a more specialized return value.\nCollection is itself an instance of the metatype CollectionType.\n\nThe definition of several common operations is different for each subtype.\nThese operations are not mentioned in this sub clause.\n\nThe semantics of the collection operations is given in the form of a postcondition that uses the IterateExp of the IteratorExp construct.\nThe semantics of those constructs is defined in Clause 10 (\u00E2\u20AC\u0153Semantics Described using UML\u00E2\u20AC\uFFFD).\nIn several cases the postcondition refers to other collection operations,\nwhich in turn are defined in terms of the IterateExp or IteratorExp constructs.\n\nWell-formedness rules\n\n[1] A collection cannot contain oclText[invalid] values.\n\ncontext Collection\ninv: self->forAll(not oclIsInvalid())");
			symbol_48.getOwnedComments().add(symbol_632);
		}
		
		symbol_0.getOwnedTypes().add(symbol_48); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
		//
		// ocl::Enumeration http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration
		//
		symbol_73.setName("Enumeration");
		symbol_73.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Enumeration::allInstances()
			Operation symbol_633 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration!allInstances()
			symbol_633.setName("allInstances");
			symbol_633.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_633.setIsStatic(true);
			symbol_633.setImplementationClass("org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation");
			symbol_633.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
			{
				Comment symbol_634 = PivotFactory.eINSTANCE.createComment();
				symbol_634.setBody("Return a set of all enumeration values of oclText[self].");
				symbol_633.getOwnedComments().add(symbol_634);
			}
			
			symbol_73.getOwnedOperations().add(symbol_633);
		}
		{	// ocl::Enumeration::oclType()
			Operation symbol_635 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration!oclType()
			symbol_635.setName("oclType");
			symbol_635.setType(symbol_249);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_635.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_635.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			{
				Comment symbol_636 = PivotFactory.eINSTANCE.createComment();
				symbol_636.setBody("Evaluates to the type of which oclText[self] is an instance.");
				symbol_635.getOwnedComments().add(symbol_636);
			}
			
			symbol_73.getOwnedOperations().add(symbol_635);
		}
		{
			Comment symbol_637 = PivotFactory.eINSTANCE.createComment();
			symbol_637.setBody("The Enumeration type is the type of an OrderedSet of EnumerationLiteral.");
			symbol_73.getOwnedComments().add(symbol_637);
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
		symbol_74.getSuperClasses().add(symbol_180); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		{ // ocl::EnumerationClassifier::ownedLiteral
			symbol_78.setName("ownedLiteral");
			symbol_78.setType(symbol_251);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
			
			symbol_78.setIsResolveProxies(true);
			symbol_78.setImplementationClass("org.eclipse.ocl.examples.library.enumeration.EnumerationClassifierOwnedLiteralProperty");
			symbol_78.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationClassifierOwnedLiteralProperty.INSTANCE);
			{
				Comment symbol_638 = PivotFactory.eINSTANCE.createComment();
				symbol_638.setBody("Evaluates to the literals of the enumeration.");
				symbol_78.getOwnedComments().add(symbol_638);
			}
			
			symbol_74.getOwnedAttributes().add(symbol_78);
		}
		{
			Comment symbol_639 = PivotFactory.eINSTANCE.createComment();
			symbol_639.setBody("The standard type EnumerationClassifier represents the metatype of an Enumeration.");
			symbol_74.getOwnedComments().add(symbol_639);
		}
		
		symbol_0.getOwnedTypes().add(symbol_74); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}
		//
		// ocl::EnumerationLiteral http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		//
		symbol_79.setName("EnumerationLiteral");
		symbol_79.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{
			Comment symbol_640 = PivotFactory.eINSTANCE.createComment();
			symbol_640.setBody("The standard type EnumerationLiteral represents a named constant value of an Enumeration.");
			symbol_79.getOwnedComments().add(symbol_640);
		}
		
		symbol_0.getOwnedTypes().add(symbol_79); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		//
		// ocl::OclAny http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_80.setName("OclAny");
		{	// ocl::OclAny::<>()
			Operation symbol_641 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_641.setName("<>");
			symbol_641.setType(symbol_11);  // Boolean
			
			Parameter symbol_642 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_642.setName("object2");
			symbol_642.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_641.getOwnedParameters().add(symbol_642);
			symbol_641.setPrecedence(symbol_6);
			symbol_641.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_641.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_643 = PivotFactory.eINSTANCE.createComment();
				symbol_643.setBody("True if oclText[self] is a different object from object2. Infix operator.");
				symbol_641.getOwnedComments().add(symbol_643);
			}
			
			symbol_80.getOwnedOperations().add(symbol_641);
		}
		{	// ocl::OclAny::=()
			Operation symbol_644 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_644.setName("=");
			symbol_644.setType(symbol_11);  // Boolean
			
			Parameter symbol_645 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_645.setName("object2");
			symbol_645.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_644.getOwnedParameters().add(symbol_645);
			symbol_644.setPrecedence(symbol_6);
			symbol_644.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_644.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_646 = PivotFactory.eINSTANCE.createComment();
				symbol_646.setBody("True if oclText[self] is the same object as object2. Infix operator.");
				symbol_644.getOwnedComments().add(symbol_646);
			}
			
			symbol_80.getOwnedOperations().add(symbol_644);
		}
		{	// ocl::OclAny::oclAsSet()
			Operation symbol_647 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsSet()
			symbol_647.setName("oclAsSet");
			symbol_647.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_647.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation");
			symbol_647.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
			{
				Comment symbol_648 = PivotFactory.eINSTANCE.createComment();
				symbol_648.setBody("Returns a Set with oclText[self] as the sole content, unless oclText[self] is oclText[null] in which case returns an empty set,");
				symbol_647.getOwnedComments().add(symbol_648);
			}
			
			symbol_80.getOwnedOperations().add(symbol_647);
		}
		{	// ocl::OclAny::oclAsType()
			Operation symbol_649 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])
			symbol_83.setName("TT");
			symbol_82.setOwnedParameteredElement(symbol_83);
			symbol_81.getOwnedParameters().add(symbol_82);
			
			symbol_649.setOwnedTemplateSignature(symbol_81);
			symbol_649.setName("oclAsType");
			symbol_649.setType(symbol_83);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT
			
			Parameter symbol_650 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])!type
			symbol_650.setName("type");
			symbol_650.setType(symbol_181);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
			
			
			symbol_649.getOwnedParameters().add(symbol_650);
			symbol_649.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation");
			symbol_649.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE);
			{
				Comment symbol_651 = PivotFactory.eINSTANCE.createComment();
				symbol_651.setBody("Evaluates to oclText[self], where oclText[self] is of the type identified by T.\nThe type T may be any classifier defined in the UML model;\nif the actual type of oclText[self] at evaluation time does not conform to T,\nthen the oclAsType operation evaluates to oclText[invalid].\n\nIn the case of feature redefinition, casting an object to a supertype of its actual type\ndoes not access the supertype\u00E2\u20AC\u2122s definition of the feature;\naccording to the semantics of redefinition, the redefined feature simply does not exist for the object.\nHowever, when casting to a supertype, any features additionally defined by the subtype are suppressed.");
				symbol_649.getOwnedComments().add(symbol_651);
			}
			
			symbol_80.getOwnedOperations().add(symbol_649);
		}
		{	// ocl::OclAny::oclIsInState()
			Operation symbol_652 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInState(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState)
			symbol_652.setName("oclIsInState");
			symbol_652.setType(symbol_11);  // Boolean
			
			Parameter symbol_653 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInState(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState)!statespec
			symbol_653.setName("statespec");
			symbol_653.setType(symbol_97);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
			
			
			symbol_652.getOwnedParameters().add(symbol_653);
			symbol_652.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation");
			symbol_652.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE);
			{
				Comment symbol_654 = PivotFactory.eINSTANCE.createComment();
				symbol_654.setBody("Evaluates to oclText[true] if the oclText[self] is in the state indentified by statespec.");
				symbol_652.getOwnedComments().add(symbol_654);
			}
			
			symbol_80.getOwnedOperations().add(symbol_652);
		}
		{	// ocl::OclAny::oclIsInvalid()
			Operation symbol_655 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInvalid()
			symbol_655.setName("oclIsInvalid");
			symbol_655.setType(symbol_11);  // Boolean
			
			symbol_655.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation");
			symbol_655.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
			{
				Comment symbol_656 = PivotFactory.eINSTANCE.createComment();
				symbol_656.setBody("Evaluates to oclText[true] if the oclText[self] is equal to OclInvalid.");
				symbol_655.getOwnedComments().add(symbol_656);
			}
			
			symbol_80.getOwnedOperations().add(symbol_655);
		}
		{	// ocl::OclAny::oclIsKindOf()
			Operation symbol_657 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])
			symbol_86.setName("T");
			symbol_85.setOwnedParameteredElement(symbol_86);
			symbol_84.getOwnedParameters().add(symbol_85);
			
			symbol_657.setOwnedTemplateSignature(symbol_84);
			symbol_657.setName("oclIsKindOf");
			symbol_657.setType(symbol_11);  // Boolean
			
			Parameter symbol_658 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])!type
			symbol_658.setName("type");
			symbol_658.setType(symbol_182);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
			
			
			symbol_657.getOwnedParameters().add(symbol_658);
			symbol_657.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation");
			symbol_657.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
			{
				Comment symbol_659 = PivotFactory.eINSTANCE.createComment();
				symbol_659.setBody("Evaluates to oclText[true] if the type of oclText[self] conforms to t.\nThat is, oclText[self] is of type t or a subtype of t.");
				symbol_657.getOwnedComments().add(symbol_659);
			}
			
			symbol_80.getOwnedOperations().add(symbol_657);
		}
		{	// ocl::OclAny::oclIsNew()
			Operation symbol_660 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsNew()
			symbol_660.setName("oclIsNew");
			symbol_660.setType(symbol_11);  // Boolean
			
			symbol_660.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_660.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_661 = PivotFactory.eINSTANCE.createComment();
				symbol_661.setBody("Can only be used in a postcondition.\nEvaluates to oclText[true] if the oclText[self] is created during performing the operation (for instance, it didn\u00E2\u20AC\u2122t exist at precondition time).");
				symbol_660.getOwnedComments().add(symbol_661);
			}
			
			symbol_80.getOwnedOperations().add(symbol_660);
		}
		{	// ocl::OclAny::oclIsTypeOf()
			Operation symbol_662 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])
			symbol_89.setName("T");
			symbol_88.setOwnedParameteredElement(symbol_89);
			symbol_87.getOwnedParameters().add(symbol_88);
			
			symbol_662.setOwnedTemplateSignature(symbol_87);
			symbol_662.setName("oclIsTypeOf");
			symbol_662.setType(symbol_11);  // Boolean
			
			Parameter symbol_663 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])!type
			symbol_663.setName("type");
			symbol_663.setType(symbol_183);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
			
			
			symbol_662.getOwnedParameters().add(symbol_663);
			symbol_662.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation");
			symbol_662.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
			{
				Comment symbol_664 = PivotFactory.eINSTANCE.createComment();
				symbol_664.setBody("Evaluates to oclText[true] if oclText[self] is of the type t but not a subtype of t");
				symbol_662.getOwnedComments().add(symbol_664);
			}
			
			symbol_80.getOwnedOperations().add(symbol_662);
		}
		{	// ocl::OclAny::oclIsUndefined()
			Operation symbol_665 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsUndefined()
			symbol_665.setName("oclIsUndefined");
			symbol_665.setType(symbol_11);  // Boolean
			
			symbol_665.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation");
			symbol_665.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
			{
				Comment symbol_666 = PivotFactory.eINSTANCE.createComment();
				symbol_666.setBody("Evaluates to oclText[true] if the oclText[self] is equal to oclText[invalid] or equal to oclText[null].");
				symbol_665.getOwnedComments().add(symbol_666);
			}
			
			symbol_80.getOwnedOperations().add(symbol_665);
		}
		{	// ocl::OclAny::oclType()
			Operation symbol_667 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclType()
			symbol_667.setName("oclType");
			symbol_667.setType(symbol_186);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_667.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_667.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			{
				Comment symbol_668 = PivotFactory.eINSTANCE.createComment();
				symbol_668.setBody("Evaluates to the type of which oclText[self] is an instance.");
				symbol_667.getOwnedComments().add(symbol_668);
			}
			
			symbol_80.getOwnedOperations().add(symbol_667);
		}
		{
			Comment symbol_669 = PivotFactory.eINSTANCE.createComment();
			symbol_669.setBody("All types in the UML model and the primitive and collection types in the OCL standard library conforms to the type OclAny.\nConceptually, OclAny behaves as a supertype for all the types.\nFeatures of OclAny are available on each object in all OCL expressions.\nOclAny is itself an instance of the metatype AnyType.\n\nAll classes in a UML model inherit all operations defined on OclAny.\nTo avoid name conflicts between properties in the model and the properties inherited from OclAny,\nall names on the properties of OclAny start with \u00E2\u20AC\u02DCocl.\u00E2\u20AC\u2122\nAlthough theoretically there may still be name conflicts, they can be avoided.\nOne can also use qualification by OclAny (name of the type) to explicitly refer to the OclAny properties.\n\nOperations of OclAny, where the instance of OclAny is called object.");
			symbol_80.getOwnedComments().add(symbol_669);
		}
		
		symbol_0.getOwnedTypes().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::OclComparable http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		//
		symbol_90.setName("OclComparable");
		symbol_90.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclComparable::compareTo()
			Operation symbol_670 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_670.setName("compareTo");
			symbol_670.setType(symbol_12);  // Integer
			
			Parameter symbol_671 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_671.setName("that");
			symbol_671.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_670.getOwnedParameters().add(symbol_671);
			{
				Comment symbol_672 = PivotFactory.eINSTANCE.createComment();
				symbol_672.setBody("Return -ve, 0, +ve according to whether self is less than, equal to , or greater than that.\n\nThe compareTo operation should be commutative.");
				symbol_670.getOwnedComments().add(symbol_672);
			}
			
			symbol_90.getOwnedOperations().add(symbol_670);
		}
		{
			Comment symbol_673 = PivotFactory.eINSTANCE.createComment();
			symbol_673.setBody("The type OclComparable defines the compareTo operation used by the sortedBy iteration. Only types that provide a derived\ncompareTo implementation may be sorted.");
			symbol_90.getOwnedComments().add(symbol_673);
		}
		
		symbol_0.getOwnedTypes().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		//
		// ocl::OclElement http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		//
		symbol_91.setName("OclElement");
		symbol_91.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclElement::allInstances()
			Operation symbol_674 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!allInstances()
			symbol_674.setName("allInstances");
			symbol_674.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_674.setIsStatic(true);
			symbol_674.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation");
			symbol_674.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
			{
				Comment symbol_675 = PivotFactory.eINSTANCE.createComment();
				symbol_675.setBody("Return a set of all instances of the type and derived types of self.");
				symbol_674.getOwnedComments().add(symbol_675);
			}
			
			symbol_91.getOwnedOperations().add(symbol_674);
		}
		{	// ocl::OclElement::oclContainer()
			Operation symbol_676 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer()
			symbol_676.setName("oclContainer");
			symbol_676.setType(symbol_91);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
			
			symbol_676.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation");
			symbol_676.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation.INSTANCE);
			{
				Comment symbol_677 = PivotFactory.eINSTANCE.createComment();
				symbol_677.setBody("Returns the object for which self is a composed content or null if there is no such object.");
				symbol_676.getOwnedComments().add(symbol_677);
			}
			
			symbol_91.getOwnedOperations().add(symbol_676);
		}
		{	// ocl::OclElement::oclContents()
			Operation symbol_678 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents()
			symbol_678.setName("oclContents");
			symbol_678.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
			
			symbol_678.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation");
			symbol_678.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation.INSTANCE);
			{
				Comment symbol_679 = PivotFactory.eINSTANCE.createComment();
				symbol_679.setBody("Returns the composed contents of self.");
				symbol_678.getOwnedComments().add(symbol_679);
			}
			
			symbol_91.getOwnedOperations().add(symbol_678);
		}
		{
			Comment symbol_680 = PivotFactory.eINSTANCE.createComment();
			symbol_680.setBody("The type OclElement is the implicit supertype of any user-defined type that has no explicit supertypes. Operations defined\nfor OclElement are therefore applicable to all user-defined types.");
			symbol_91.getOwnedComments().add(symbol_680);
		}
		
		symbol_0.getOwnedTypes().add(symbol_91); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		//
		// ocl::OclInvalid http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
		//
		symbol_92.setName("OclInvalid");
		symbol_92.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		{ // ocl::OclInvalid::oclBadProperty
			symbol_93.setName("oclBadProperty");
			symbol_93.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
			
			symbol_93.setIsResolveProxies(true);
			
			symbol_92.getOwnedAttributes().add(symbol_93);
		}
		{	// ocl::OclInvalid::<>()
			Operation symbol_681 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_681.setName("<>");
			symbol_681.setType(symbol_11);  // Boolean
			
			Parameter symbol_682 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_682.setName("object2");
			symbol_682.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_681.getOwnedParameters().add(symbol_682);
			symbol_681.setPrecedence(symbol_6);
			symbol_681.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_681.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_683 = PivotFactory.eINSTANCE.createComment();
				symbol_683.setBody("Returns oclText[invalid].");
				symbol_681.getOwnedComments().add(symbol_683);
			}
			
			symbol_92.getOwnedOperations().add(symbol_681);
		}
		{	// ocl::OclInvalid::=()
			Operation symbol_684 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_684.setName("=");
			symbol_684.setType(symbol_11);  // Boolean
			
			Parameter symbol_685 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_685.setName("object2");
			symbol_685.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_684.getOwnedParameters().add(symbol_685);
			symbol_684.setPrecedence(symbol_6);
			symbol_684.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_684.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_686 = PivotFactory.eINSTANCE.createComment();
				symbol_686.setBody("Returns oclText[invalid].");
				symbol_684.getOwnedComments().add(symbol_686);
			}
			
			symbol_92.getOwnedOperations().add(symbol_684);
		}
		{	// ocl::OclInvalid::allInstances()
			Operation symbol_687 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!allInstances()
			symbol_687.setName("allInstances");
			symbol_687.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_687.setIsStatic(true);
			symbol_687.setImplementationClass("org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation");
			symbol_687.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
			{
				Comment symbol_688 = PivotFactory.eINSTANCE.createComment();
				symbol_688.setBody("Returns oclText[invalid].");
				symbol_687.getOwnedComments().add(symbol_688);
			}
			
			symbol_92.getOwnedOperations().add(symbol_687);
		}
		{	// ocl::OclInvalid::oclBadOperation()
			Operation symbol_689 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!oclBadOperation()
			symbol_689.setName("oclBadOperation");
			symbol_689.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
			
			
			symbol_92.getOwnedOperations().add(symbol_689);
		}
		{	// ocl::OclInvalid::toString()
			Operation symbol_690 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!toString()
			symbol_690.setName("toString");
			symbol_690.setType(symbol_14);  // String
			
			symbol_690.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_690.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_691 = PivotFactory.eINSTANCE.createComment();
				symbol_691.setBody("Returns \'invalid\'.");
				symbol_690.getOwnedComments().add(symbol_691);
			}
			
			symbol_92.getOwnedOperations().add(symbol_690);
		}
		{
			Comment symbol_692 = PivotFactory.eINSTANCE.createComment();
			symbol_692.setBody("The type OclInvalid is a type that conforms to all other types.\nIt has one single instance, identified as  oclText[invalid].\nAny property call applied on invalid results in oclText[invalid], except for the operations oclIsUndefined() and oclIsInvalid().\nOclInvalid is itself an instance of the metatype InvalidType.");
			symbol_92.getOwnedComments().add(symbol_692);
		}
		
		symbol_0.getOwnedTypes().add(symbol_92); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
		//
		// ocl::OclLambda http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		//
		symbol_94.setName("OclLambda");
		symbol_94.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{
			Comment symbol_693 = PivotFactory.eINSTANCE.createComment();
			symbol_693.setBody("The type OclLambda is the implicit supertype of all Lambda types. The operations defined for OclLambda\ntherefore apply to all lambda expressions.");
			symbol_94.getOwnedComments().add(symbol_693);
		}
		
		symbol_0.getOwnedTypes().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		//
		// ocl::OclMessage http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		//
		symbol_95.setName("OclMessage");
		symbol_95.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclMessage::hasReturned()
			Operation symbol_694 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!hasReturned()
			symbol_694.setName("hasReturned");
			symbol_694.setType(symbol_11);  // Boolean
			
			symbol_694.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_694.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_695 = PivotFactory.eINSTANCE.createComment();
				symbol_695.setBody("True if type of template parameter is an operation call, and the called operation has returned a value.\nThis implies the fact that the message has been sent. False in all other cases.");
				symbol_694.getOwnedComments().add(symbol_695);
			}
			
			symbol_95.getOwnedOperations().add(symbol_694);
		}
		{	// ocl::OclMessage::isOperationCall()
			Operation symbol_696 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!isOperationCall()
			symbol_696.setName("isOperationCall");
			symbol_696.setType(symbol_11);  // Boolean
			
			symbol_696.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_696.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_697 = PivotFactory.eINSTANCE.createComment();
				symbol_697.setBody("Returns oclText[true] if the OclMessage represents the sending of a UML Operation call.");
				symbol_696.getOwnedComments().add(symbol_697);
			}
			
			symbol_95.getOwnedOperations().add(symbol_696);
		}
		{	// ocl::OclMessage::isSignalSent()
			Operation symbol_698 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!isSignalSent()
			symbol_698.setName("isSignalSent");
			symbol_698.setType(symbol_11);  // Boolean
			
			symbol_698.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_698.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_699 = PivotFactory.eINSTANCE.createComment();
				symbol_699.setBody("Returns oclText[true] if the OclMessage represents the sending of a UML Signal.");
				symbol_698.getOwnedComments().add(symbol_699);
			}
			
			symbol_95.getOwnedOperations().add(symbol_698);
		}
		{	// ocl::OclMessage::result()
			Operation symbol_700 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!result()
			symbol_700.setName("result");
			symbol_700.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_700.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_700.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_701 = PivotFactory.eINSTANCE.createComment();
				symbol_701.setBody("Returns the result of the called operation, if type of template parameter is an operation call,\nand the called operation has returned a value. Otherwise the oclText[invalid] value is returned.");
				symbol_700.getOwnedComments().add(symbol_701);
			}
			
			symbol_95.getOwnedOperations().add(symbol_700);
		}
		{
			Comment symbol_702 = PivotFactory.eINSTANCE.createComment();
			symbol_702.setBody("OclMessage\nThis sub clause contains the definition of the standard type OclMessage.\nAs defined in this sub clause, each ocl message type is actually a template type with one parameter.\n\u00E2\u20AC\u02DCT\u00E2\u20AC\u2122 denotes the parameter.\nA concrete ocl message type is created by substituting an operation or signal for the T.\n\nThe predefined type OclMessage is an instance of MessageType.\nEvery OclMessage is fully determined by either the operation, or signal given as parameter.\nNote that there is conceptually an undefined (infinite) number of these types,\nas each is determined by a different operation or signal.\nThese types are unnamed. Every type has as attributes the name of the operation or signal,\nand either all formal parameters of the operation, or all attributes of the signal.\nOclMessage is itself an instance of the metatype MessageType.\n\nOclMessage has a number of predefined operations, as shown in the OCL Standard Library.");
			symbol_95.getOwnedComments().add(symbol_702);
		}
		
		symbol_0.getOwnedTypes().add(symbol_95); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		//
		// ocl::OclSelf http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
		//
		symbol_96.setName("OclSelf");
		symbol_96.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{
			Comment symbol_703 = PivotFactory.eINSTANCE.createComment();
			symbol_703.setBody("The pseudo-type OclSelf denotes the statically determinate type of oclText[self] in Operation\nand Iteration signatures. Instances of OclSelf are never created.");
			symbol_96.getOwnedComments().add(symbol_703);
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
			Operation symbol_704 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable!sum(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_704.setName("sum");
			symbol_704.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			Parameter symbol_705 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable!sum(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_705.setName("that");
			symbol_705.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_704.getOwnedParameters().add(symbol_705);
			{
				Comment symbol_706 = PivotFactory.eINSTANCE.createComment();
				symbol_706.setBody("Return the sum of self and that.\n\nThe sum operation should be associative.");
				symbol_704.getOwnedComments().add(symbol_706);
			}
			
			symbol_98.getOwnedOperations().add(symbol_704);
		}
		{	// ocl::OclSummable::zero()
			Operation symbol_707 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable!zero()
			symbol_707.setName("zero");
			symbol_707.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			{
				Comment symbol_708 = PivotFactory.eINSTANCE.createComment();
				symbol_708.setBody("Return the \'zero\' value of self to initialize a summation.\n\nzero().sum(self) = self.");
				symbol_707.getOwnedComments().add(symbol_708);
			}
			
			symbol_98.getOwnedOperations().add(symbol_707);
		}
		{
			Comment symbol_709 = PivotFactory.eINSTANCE.createComment();
			symbol_709.setBody("The type OclSummable defines the sum and zero operations used by the Collection::sum iteration. Only types that provide derived\nsum and zero implementations may be summed.");
			symbol_98.getOwnedComments().add(symbol_709);
		}
		
		symbol_0.getOwnedTypes().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		//
		// ocl::OclTuple http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		//
		symbol_99.setName("OclTuple");
		symbol_99.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclTuple::<>()
			Operation symbol_710 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_710.setName("<>");
			symbol_710.setType(symbol_11);  // Boolean
			
			Parameter symbol_711 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_711.setName("object2");
			symbol_711.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_710.getOwnedParameters().add(symbol_711);
			symbol_710.setPrecedence(symbol_6);
			symbol_710.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_710.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_99.getOwnedOperations().add(symbol_710);
		}
		{	// ocl::OclTuple::=()
			Operation symbol_712 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_712.setName("=");
			symbol_712.setType(symbol_11);  // Boolean
			
			Parameter symbol_713 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_713.setName("object2");
			symbol_713.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_712.getOwnedParameters().add(symbol_713);
			symbol_712.setPrecedence(symbol_6);
			symbol_712.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_712.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			
			symbol_99.getOwnedOperations().add(symbol_712);
		}
		{
			Comment symbol_714 = PivotFactory.eINSTANCE.createComment();
			symbol_714.setBody("The type OclTuple is the implicit supertype of all Tuple types. The operations defined for OclTuple\ntherefore apply to all tuples.");
			symbol_99.getOwnedComments().add(symbol_714);
		}
		
		symbol_0.getOwnedTypes().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		//
		// ocl::OclVoid http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		//
		symbol_100.setName("OclVoid");
		symbol_100.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclVoid::<>()
			Operation symbol_715 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_715.setName("<>");
			symbol_715.setType(symbol_11);  // Boolean
			
			Parameter symbol_716 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_716.setName("object2");
			symbol_716.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_715.getOwnedParameters().add(symbol_716);
			symbol_715.setPrecedence(symbol_6);
			symbol_715.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_715.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_100.getOwnedOperations().add(symbol_715);
		}
		{	// ocl::OclVoid::=()
			Operation symbol_717 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_717.setName("=");
			symbol_717.setType(symbol_11);  // Boolean
			
			Parameter symbol_718 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_718.setName("object2");
			symbol_718.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_717.getOwnedParameters().add(symbol_718);
			symbol_717.setPrecedence(symbol_6);
			symbol_717.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_717.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_719 = PivotFactory.eINSTANCE.createComment();
				symbol_719.setBody("Redefines the OclAny operation, returning oclText[true] if object is oclText[null], oclText[invalid]\nif object is oclText[invalid], oclText[false] otherwise.");
				symbol_717.getOwnedComments().add(symbol_719);
			}
			
			symbol_100.getOwnedOperations().add(symbol_717);
		}
		{	// ocl::OclVoid::allInstances()
			Operation symbol_720 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!allInstances()
			symbol_720.setName("allInstances");
			symbol_720.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_720.setIsStatic(true);
			symbol_720.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation");
			symbol_720.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
			{
				Comment symbol_721 = PivotFactory.eINSTANCE.createComment();
				symbol_721.setBody("Returns oclText[Set{null}].");
				symbol_720.getOwnedComments().add(symbol_721);
			}
			
			symbol_100.getOwnedOperations().add(symbol_720);
		}
		{	// ocl::OclVoid::and()
			Operation symbol_722 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!and(Boolean)
			symbol_722.setName("and");
			symbol_722.setType(symbol_11);  // Boolean
			
			Parameter symbol_723 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!and(Boolean)!b
			symbol_723.setName("b");
			symbol_723.setType(symbol_11);  // Boolean
			
			
			symbol_722.getOwnedParameters().add(symbol_723);
			symbol_722.setPrecedence(symbol_7);
			symbol_722.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation");
			symbol_722.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE);
			
			symbol_100.getOwnedOperations().add(symbol_722);
		}
		{	// ocl::OclVoid::implies()
			Operation symbol_724 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!implies(Boolean)
			symbol_724.setName("implies");
			symbol_724.setType(symbol_11);  // Boolean
			
			Parameter symbol_725 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!implies(Boolean)!b
			symbol_725.setName("b");
			symbol_725.setType(symbol_11);  // Boolean
			
			
			symbol_724.getOwnedParameters().add(symbol_725);
			symbol_724.setPrecedence(symbol_10);
			symbol_724.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation");
			symbol_724.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE);
			
			symbol_100.getOwnedOperations().add(symbol_724);
		}
		{	// ocl::OclVoid::or()
			Operation symbol_726 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!or(Boolean)
			symbol_726.setName("or");
			symbol_726.setType(symbol_11);  // Boolean
			
			Parameter symbol_727 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!or(Boolean)!b
			symbol_727.setName("b");
			symbol_727.setType(symbol_11);  // Boolean
			
			
			symbol_726.getOwnedParameters().add(symbol_727);
			symbol_726.setPrecedence(symbol_8);
			symbol_726.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation");
			symbol_726.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE);
			
			symbol_100.getOwnedOperations().add(symbol_726);
		}
		{	// ocl::OclVoid::toString()
			Operation symbol_728 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!toString()
			symbol_728.setName("toString");
			symbol_728.setType(symbol_14);  // String
			
			symbol_728.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_728.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_729 = PivotFactory.eINSTANCE.createComment();
				symbol_729.setBody("Returns oclText[null].");
				symbol_728.getOwnedComments().add(symbol_729);
			}
			
			symbol_100.getOwnedOperations().add(symbol_728);
		}
		{
			Comment symbol_730 = PivotFactory.eINSTANCE.createComment();
			symbol_730.setBody("The type OclVoid is a type that conforms to all other types except OclInvalid.\nIt has one single instance, identified as oclText[null], that corresponds with the UML LiteralNull value specification.\nAny property call applied on oclText[null] results in oclText[invalid], except for the\noclIsUndefined(), oclIsInvalid(), =(OclAny) and <>(OclAny) operations.\nHowever, by virtue of the implicit conversion to a collection literal,\nan expression evaluating to oclText[null] can be used as source of collection operations (such as \u00E2\u20AC\u02DCisEmpty\u00E2\u20AC\u2122).\nIf the source is the oclText[null] literal, it is implicitly converted to Bag{}.\n\nOclVoid is itself an instance of the metatype VoidType.");
			symbol_100.getOwnedComments().add(symbol_730);
		}
		
		symbol_0.getOwnedTypes().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		//
		// ocl::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
		//
		symbol_101.setName("OrderedSet");
		symbol_101.setElementType(symbol_104);
		symbol_104.setName("T");
		symbol_103.setOwnedParameteredElement(symbol_104);
		symbol_102.getOwnedParameters().add(symbol_103);
		
		symbol_101.setOwnedTemplateSignature(symbol_102);
		symbol_101.getSuperClasses().add(symbol_262); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_101.getSuperClasses().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		{	// ocl::OrderedSet::-()
			Operation symbol_731 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_731.setName("-");
			symbol_731.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_732 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_732.setName("s");
			symbol_732.setType(symbol_285);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			
			symbol_731.getOwnedParameters().add(symbol_732);
			symbol_731.setPrecedence(symbol_4);
			symbol_731.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_731.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			{
				Comment symbol_733 = PivotFactory.eINSTANCE.createComment();
				symbol_733.setBody("The elements of oclText[self], which are not in s.");
				symbol_731.getOwnedComments().add(symbol_733);
			}
			
			symbol_101.getOwnedOperations().add(symbol_731);
		}
		{	// ocl::OrderedSet::<>()
			Operation symbol_734 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_734.setName("<>");
			symbol_734.setType(symbol_11);  // Boolean
			
			Parameter symbol_735 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_735.setName("object2");
			symbol_735.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_734.getOwnedParameters().add(symbol_735);
			symbol_734.setPrecedence(symbol_6);
			symbol_734.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_734.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_101.getOwnedOperations().add(symbol_734);
		}
		{	// ocl::OrderedSet::=()
			Operation symbol_736 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_736.setName("=");
			symbol_736.setType(symbol_11);  // Boolean
			
			Parameter symbol_737 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_737.setName("object2");
			symbol_737.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_736.getOwnedParameters().add(symbol_737);
			symbol_736.setPrecedence(symbol_6);
			symbol_736.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_736.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			
			symbol_101.getOwnedOperations().add(symbol_736);
		}
		{	// ocl::OrderedSet::append()
			Operation symbol_738 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!append(T)
			symbol_738.setName("append");
			symbol_738.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_739 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!append(T)!object
			symbol_739.setName("object");
			symbol_739.setType(symbol_104);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			
			symbol_738.getOwnedParameters().add(symbol_739);
			symbol_738.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation");
			symbol_738.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			{
				Comment symbol_740 = PivotFactory.eINSTANCE.createComment();
				symbol_740.setBody("The set of elements, consisting of all elements of oclText[self], followed by object.");
				symbol_738.getOwnedComments().add(symbol_740);
			}
			
			symbol_101.getOwnedOperations().add(symbol_738);
		}
		{	// ocl::OrderedSet::excluding()
			Operation symbol_741 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_741.setName("excluding");
			symbol_741.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_742 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_742.setName("object");
			symbol_742.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_741.getOwnedParameters().add(symbol_742);
			symbol_741.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_741.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_743 = PivotFactory.eINSTANCE.createComment();
				symbol_743.setBody("The ordered set  containing all elements of oclText[self] apart from object.\n\nThe order of the remaining elements is not changed.");
				symbol_741.getOwnedComments().add(symbol_743);
			}
			
			symbol_101.getOwnedOperations().add(symbol_741);
		}
		{	// ocl::OrderedSet::flatten()
			Operation symbol_744 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()
			symbol_107.setName("T2");
			symbol_106.setOwnedParameteredElement(symbol_107);
			symbol_105.getOwnedParameters().add(symbol_106);
			
			symbol_744.setOwnedTemplateSignature(symbol_105);
			symbol_744.setName("flatten");
			symbol_744.setType(symbol_252);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
			
			symbol_744.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_744.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			
			symbol_101.getOwnedOperations().add(symbol_744);
		}
		{	// ocl::OrderedSet::including()
			Operation symbol_745 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!including(T)
			symbol_745.setName("including");
			symbol_745.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_746 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!including(T)!object
			symbol_746.setName("object");
			symbol_746.setType(symbol_104);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			
			symbol_745.getOwnedParameters().add(symbol_746);
			symbol_745.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_745.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_747 = PivotFactory.eINSTANCE.createComment();
				symbol_747.setBody("The ordered set containing all elements of oclText[self] plus object added as the last element if not already present.");
				symbol_745.getOwnedComments().add(symbol_747);
			}
			
			symbol_101.getOwnedOperations().add(symbol_745);
		}
		{	// ocl::OrderedSet::insertAt()
			Operation symbol_748 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)
			symbol_748.setName("insertAt");
			symbol_748.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_749 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)!index
			symbol_749.setName("index");
			symbol_749.setType(symbol_12);  // Integer
			
			
			symbol_748.getOwnedParameters().add(symbol_749);
			Parameter symbol_750 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)!object
			symbol_750.setName("object");
			symbol_750.setType(symbol_104);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			
			symbol_748.getOwnedParameters().add(symbol_750);
			symbol_748.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation");
			symbol_748.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			{
				Comment symbol_751 = PivotFactory.eINSTANCE.createComment();
				symbol_751.setBody("The ordered set consisting of oclText[self] with object present at position index.");
				symbol_748.getOwnedComments().add(symbol_751);
			}
			
			symbol_101.getOwnedOperations().add(symbol_748);
		}
		{	// ocl::OrderedSet::intersection()
			Operation symbol_752 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_752.setName("intersection");
			symbol_752.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_753 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!o
			symbol_753.setName("o");
			symbol_753.setType(symbol_274);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
			
			
			symbol_752.getOwnedParameters().add(symbol_753);
			symbol_752.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_752.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			
			symbol_101.getOwnedOperations().add(symbol_752);
		}
		{	// ocl::OrderedSet::prepend()
			Operation symbol_754 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!prepend(T)
			symbol_754.setName("prepend");
			symbol_754.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_755 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!prepend(T)!object
			symbol_755.setName("object");
			symbol_755.setType(symbol_104);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			
			symbol_754.getOwnedParameters().add(symbol_755);
			symbol_754.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation");
			symbol_754.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			{
				Comment symbol_756 = PivotFactory.eINSTANCE.createComment();
				symbol_756.setBody("The sequence consisting of object, followed by all elements in oclText[self].");
				symbol_754.getOwnedComments().add(symbol_756);
			}
			
			symbol_101.getOwnedOperations().add(symbol_754);
		}
		{	// ocl::OrderedSet::reject()
			Iteration symbol_757 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)
			symbol_757.setName("reject");
			symbol_757.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_758 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)!i
			symbol_758.setName("i");
			symbol_758.setType(symbol_104); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_757.getOwnedIterators().add(symbol_758);
			Parameter symbol_759 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)!body
			symbol_759.setName("body");
			symbol_759.setType(symbol_152);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
			
			
			symbol_757.getOwnedParameters().add(symbol_759);
			symbol_757.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_757.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_760 = PivotFactory.eINSTANCE.createComment();
				symbol_760.setBody("The ordered set of the source ordered set for which body is oclText[false].");
				symbol_757.getOwnedComments().add(symbol_760);
			}
			
			symbol_101.getOwnedOperations().add(symbol_757);
		}
		{	// ocl::OrderedSet::reverse()
			Operation symbol_761 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reverse()
			symbol_761.setName("reverse");
			symbol_761.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			symbol_761.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_761.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			{
				Comment symbol_762 = PivotFactory.eINSTANCE.createComment();
				symbol_762.setBody("The ordered set of elements with same elements but with the opposite order.");
				symbol_761.getOwnedComments().add(symbol_762);
			}
			
			symbol_101.getOwnedOperations().add(symbol_761);
		}
		{	// ocl::OrderedSet::select()
			Iteration symbol_763 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)
			symbol_763.setName("select");
			symbol_763.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_764 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)!i
			symbol_764.setName("i");
			symbol_764.setType(symbol_104); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_763.getOwnedIterators().add(symbol_764);
			Parameter symbol_765 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)!body
			symbol_765.setName("body");
			symbol_765.setType(symbol_153);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
			
			
			symbol_763.getOwnedParameters().add(symbol_765);
			symbol_763.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_763.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_766 = PivotFactory.eINSTANCE.createComment();
				symbol_766.setBody("The ordered set of the source ordered set for which body is oclText[true]");
				symbol_763.getOwnedComments().add(symbol_766);
			}
			
			symbol_101.getOwnedOperations().add(symbol_763);
		}
		{	// ocl::OrderedSet::sortedBy()
			Iteration symbol_767 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_767.setName("sortedBy");
			symbol_767.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_768 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_768.setName("i");
			symbol_768.setType(symbol_104); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_767.getOwnedIterators().add(symbol_768);
			Parameter symbol_769 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_769.setName("body");
			symbol_769.setType(symbol_154);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_767.getOwnedParameters().add(symbol_769);
			symbol_767.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_767.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_770 = PivotFactory.eINSTANCE.createComment();
				symbol_770.setBody("Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
				symbol_767.getOwnedComments().add(symbol_770);
			}
			
			symbol_101.getOwnedOperations().add(symbol_767);
		}
		{	// ocl::OrderedSet::subOrderedSet()
			Operation symbol_771 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)
			symbol_771.setName("subOrderedSet");
			symbol_771.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_772 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)!lower
			symbol_772.setName("lower");
			symbol_772.setType(symbol_12);  // Integer
			
			
			symbol_771.getOwnedParameters().add(symbol_772);
			Parameter symbol_773 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)!upper
			symbol_773.setName("upper");
			symbol_773.setType(symbol_12);  // Integer
			
			
			symbol_771.getOwnedParameters().add(symbol_773);
			symbol_771.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation");
			symbol_771.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE);
			{
				Comment symbol_774 = PivotFactory.eINSTANCE.createComment();
				symbol_774.setBody("The sub-set of oclText[self] starting at number lower, up to and including element number upper.");
				symbol_771.getOwnedComments().add(symbol_774);
			}
			
			symbol_101.getOwnedOperations().add(symbol_771);
		}
		{	// ocl::OrderedSet::union()
			Operation symbol_775 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[T])
			symbol_775.setName("union");
			symbol_775.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_776 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[T])!o
			symbol_776.setName("o");
			symbol_776.setType(symbol_262);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
			
			
			symbol_775.getOwnedParameters().add(symbol_776);
			symbol_775.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_775.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_777 = PivotFactory.eINSTANCE.createComment();
				symbol_777.setBody("The ordered set consisting of all elements in oclText[self] and all elements in o.");
				symbol_775.getOwnedComments().add(symbol_777);
			}
			
			symbol_101.getOwnedOperations().add(symbol_775);
		}
		{
			Comment symbol_778 = PivotFactory.eINSTANCE.createComment();
			symbol_778.setBody("The OrderedSet is a Set, the elements of which are ordered.\nIt contains no duplicates. OrderedSet is itself an instance of the metatype OrderedSetType.\nAn OrderedSet is not a subtype of Set, neither a subtype of Sequence.\nThe common supertype of Sets and OrderedSets is Collection.");
			symbol_101.getOwnedComments().add(symbol_778);
		}
		
		symbol_0.getOwnedTypes().add(symbol_101); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
		//
		// ocl::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
		//
		symbol_108.setName("Sequence");
		symbol_108.setElementType(symbol_111);
		symbol_111.setName("T");
		symbol_110.setOwnedParameteredElement(symbol_111);
		symbol_109.getOwnedParameters().add(symbol_110);
		
		symbol_108.setOwnedTemplateSignature(symbol_109);
		symbol_108.getSuperClasses().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		{	// ocl::Sequence::<>()
			Operation symbol_779 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_779.setName("<>");
			symbol_779.setType(symbol_11);  // Boolean
			
			Parameter symbol_780 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_780.setName("object2");
			symbol_780.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_779.getOwnedParameters().add(symbol_780);
			symbol_779.setPrecedence(symbol_6);
			symbol_779.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_779.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_108.getOwnedOperations().add(symbol_779);
		}
		{	// ocl::Sequence::=()
			Operation symbol_781 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_781.setName("=");
			symbol_781.setType(symbol_11);  // Boolean
			
			Parameter symbol_782 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_782.setName("object2");
			symbol_782.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_781.getOwnedParameters().add(symbol_782);
			symbol_781.setPrecedence(symbol_6);
			symbol_781.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_781.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_783 = PivotFactory.eINSTANCE.createComment();
				symbol_783.setBody("True if oclText[self] contains the same elements as s in the same order.");
				symbol_781.getOwnedComments().add(symbol_783);
			}
			
			symbol_108.getOwnedOperations().add(symbol_781);
		}
		{	// ocl::Sequence::append()
			Operation symbol_784 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!append(T)
			symbol_784.setName("append");
			symbol_784.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_785 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!append(T)!object
			symbol_785.setName("object");
			symbol_785.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			
			symbol_784.getOwnedParameters().add(symbol_785);
			symbol_784.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation");
			symbol_784.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			{
				Comment symbol_786 = PivotFactory.eINSTANCE.createComment();
				symbol_786.setBody("The sequence of elements, consisting of all elements of oclText[self], followed by object.");
				symbol_784.getOwnedComments().add(symbol_786);
			}
			
			symbol_108.getOwnedOperations().add(symbol_784);
		}
		{	// ocl::Sequence::at()
			Operation symbol_787 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!at(Integer)
			symbol_787.setName("at");
			symbol_787.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			Parameter symbol_788 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!at(Integer)!index
			symbol_788.setName("index");
			symbol_788.setType(symbol_12);  // Integer
			
			
			symbol_787.getOwnedParameters().add(symbol_788);
			symbol_787.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation");
			symbol_787.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE);
			{
				Comment symbol_789 = PivotFactory.eINSTANCE.createComment();
				symbol_789.setBody("The i-th element of sequence.");
				symbol_787.getOwnedComments().add(symbol_789);
			}
			
			symbol_108.getOwnedOperations().add(symbol_787);
		}
		{	// ocl::Sequence::closure()
			Iteration symbol_790 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])
			symbol_790.setName("closure");
			symbol_790.setType(symbol_253);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
			
			Parameter symbol_791 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])!i
			symbol_791.setName("i");
			symbol_791.setType(symbol_111); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_790.getOwnedIterators().add(symbol_791);
			Parameter symbol_792 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])!body
			symbol_792.setName("body");
			symbol_792.setType(symbol_158);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
			
			
			symbol_790.getOwnedParameters().add(symbol_792);
			symbol_790.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ClosureIteration");
			symbol_790.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			{
				Comment symbol_793 = PivotFactory.eINSTANCE.createComment();
				symbol_793.setBody("The closure of applying body transitively to every distinct element of the source collection.");
				symbol_790.getOwnedComments().add(symbol_793);
			}
			
			symbol_108.getOwnedOperations().add(symbol_790);
		}
		{	// ocl::Sequence::collect()
			Iteration symbol_794 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)
			symbol_114.setName("V");
			symbol_113.setOwnedParameteredElement(symbol_114);
			symbol_112.getOwnedParameters().add(symbol_113);
			
			symbol_794.setOwnedTemplateSignature(symbol_112);
			symbol_794.setName("collect");
			symbol_794.setType(symbol_263);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_795 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)!i
			symbol_795.setName("i");
			symbol_795.setType(symbol_111); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_794.getOwnedIterators().add(symbol_795);
			Parameter symbol_796 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)!body
			symbol_796.setName("body");
			symbol_796.setType(symbol_160);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V
			
			
			symbol_794.getOwnedParameters().add(symbol_796);
			symbol_794.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_794.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			
			symbol_108.getOwnedOperations().add(symbol_794);
		}
		{	// ocl::Sequence::collectNested()
			Iteration symbol_797 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)
			symbol_117.setName("V");
			symbol_116.setOwnedParameteredElement(symbol_117);
			symbol_115.getOwnedParameters().add(symbol_116);
			
			symbol_797.setOwnedTemplateSignature(symbol_115);
			symbol_797.setName("collectNested");
			symbol_797.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_798 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_798.setName("i");
			symbol_798.setType(symbol_111); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_797.getOwnedIterators().add(symbol_798);
			Parameter symbol_799 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_799.setName("body");
			symbol_799.setType(symbol_159);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)?V
			
			
			symbol_797.getOwnedParameters().add(symbol_799);
			symbol_797.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_797.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			{
				Comment symbol_800 = PivotFactory.eINSTANCE.createComment();
				symbol_800.setBody("The sequence of elements that results from applying body to every member of the source ordered collection.");
				symbol_797.getOwnedComments().add(symbol_800);
			}
			
			symbol_108.getOwnedOperations().add(symbol_797);
		}
		{	// ocl::Sequence::excluding()
			Operation symbol_801 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_801.setName("excluding");
			symbol_801.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_802 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_802.setName("object");
			symbol_802.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_801.getOwnedParameters().add(symbol_802);
			symbol_801.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_801.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_803 = PivotFactory.eINSTANCE.createComment();
				symbol_803.setBody("The sequence containing all elements of oclText[self] apart from all occurrences of object.\n\nThe order of the remaining elements is not changed.");
				symbol_801.getOwnedComments().add(symbol_803);
			}
			
			symbol_108.getOwnedOperations().add(symbol_801);
		}
		{	// ocl::Sequence::first()
			Operation symbol_804 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!first()
			symbol_804.setName("first");
			symbol_804.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_804.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation");
			symbol_804.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
			{
				Comment symbol_805 = PivotFactory.eINSTANCE.createComment();
				symbol_805.setBody("The first element in oclText[self].");
				symbol_804.getOwnedComments().add(symbol_805);
			}
			
			symbol_108.getOwnedOperations().add(symbol_804);
		}
		{	// ocl::Sequence::flatten()
			Operation symbol_806 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()
			symbol_120.setName("T2");
			symbol_119.setOwnedParameteredElement(symbol_120);
			symbol_118.getOwnedParameters().add(symbol_119);
			
			symbol_806.setOwnedTemplateSignature(symbol_118);
			symbol_806.setName("flatten");
			symbol_806.setType(symbol_264);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
			
			symbol_806.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_806.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			{
				Comment symbol_807 = PivotFactory.eINSTANCE.createComment();
				symbol_807.setBody("Redefines the Collection operation. If the element type is not a collection type, this results in the same sequence as oclText[self].\nIf the element type is a collection type, the result is the sequence containing all the elements\nof all the recursively flattened elements of oclText[self]. The order of the elements is partial.");
				symbol_806.getOwnedComments().add(symbol_807);
			}
			
			symbol_108.getOwnedOperations().add(symbol_806);
		}
		{	// ocl::Sequence::including()
			Operation symbol_808 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!including(T)
			symbol_808.setName("including");
			symbol_808.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_809 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!including(T)!object
			symbol_809.setName("object");
			symbol_809.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			
			symbol_808.getOwnedParameters().add(symbol_809);
			symbol_808.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_808.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_810 = PivotFactory.eINSTANCE.createComment();
				symbol_810.setBody("The sequence containing all elements of oclText[self] plus object added as the last element.");
				symbol_808.getOwnedComments().add(symbol_810);
			}
			
			symbol_108.getOwnedOperations().add(symbol_808);
		}
		{	// ocl::Sequence::indexOf()
			Operation symbol_811 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!indexOf(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_811.setName("indexOf");
			symbol_811.setType(symbol_12);  // Integer
			
			Parameter symbol_812 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!indexOf(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!obj
			symbol_812.setName("obj");
			symbol_812.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_811.getOwnedParameters().add(symbol_812);
			symbol_811.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation");
			symbol_811.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE);
			{
				Comment symbol_813 = PivotFactory.eINSTANCE.createComment();
				symbol_813.setBody("The index of object obj in the ordered collection.");
				symbol_811.getOwnedComments().add(symbol_813);
			}
			
			symbol_108.getOwnedOperations().add(symbol_811);
		}
		{	// ocl::Sequence::insertAt()
			Operation symbol_814 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)
			symbol_814.setName("insertAt");
			symbol_814.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_815 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)!index
			symbol_815.setName("index");
			symbol_815.setType(symbol_12);  // Integer
			
			
			symbol_814.getOwnedParameters().add(symbol_815);
			Parameter symbol_816 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)!object
			symbol_816.setName("object");
			symbol_816.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			
			symbol_814.getOwnedParameters().add(symbol_816);
			symbol_814.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation");
			symbol_814.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			{
				Comment symbol_817 = PivotFactory.eINSTANCE.createComment();
				symbol_817.setBody("The sequence consisting of oclText[self] with object inserted at position index.");
				symbol_814.getOwnedComments().add(symbol_817);
			}
			
			symbol_108.getOwnedOperations().add(symbol_814);
		}
		{	// ocl::Sequence::last()
			Operation symbol_818 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!last()
			symbol_818.setName("last");
			symbol_818.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_818.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation");
			symbol_818.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
			{
				Comment symbol_819 = PivotFactory.eINSTANCE.createComment();
				symbol_819.setBody("The last element in oclText[self].");
				symbol_818.getOwnedComments().add(symbol_819);
			}
			
			symbol_108.getOwnedOperations().add(symbol_818);
		}
		{	// ocl::Sequence::prepend()
			Operation symbol_820 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!prepend(T)
			symbol_820.setName("prepend");
			symbol_820.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_821 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!prepend(T)!object
			symbol_821.setName("object");
			symbol_821.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			
			symbol_820.getOwnedParameters().add(symbol_821);
			symbol_820.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation");
			symbol_820.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			{
				Comment symbol_822 = PivotFactory.eINSTANCE.createComment();
				symbol_822.setBody("The sequence consisting of object, followed by all elements in oclText[self].");
				symbol_820.getOwnedComments().add(symbol_822);
			}
			
			symbol_108.getOwnedOperations().add(symbol_820);
		}
		{	// ocl::Sequence::reject()
			Iteration symbol_823 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)
			symbol_823.setName("reject");
			symbol_823.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_824 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)!i
			symbol_824.setName("i");
			symbol_824.setType(symbol_111); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_823.getOwnedIterators().add(symbol_824);
			Parameter symbol_825 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)!body
			symbol_825.setName("body");
			symbol_825.setType(symbol_156);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
			
			
			symbol_823.getOwnedParameters().add(symbol_825);
			symbol_823.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_823.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_826 = PivotFactory.eINSTANCE.createComment();
				symbol_826.setBody("The subsequence of the source sequence for which body is oclText[false].");
				symbol_823.getOwnedComments().add(symbol_826);
			}
			
			symbol_108.getOwnedOperations().add(symbol_823);
		}
		{	// ocl::Sequence::reverse()
			Operation symbol_827 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reverse()
			symbol_827.setName("reverse");
			symbol_827.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			symbol_827.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_827.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			{
				Comment symbol_828 = PivotFactory.eINSTANCE.createComment();
				symbol_828.setBody("The sequence containing the same elements but with the opposite order.");
				symbol_827.getOwnedComments().add(symbol_828);
			}
			
			symbol_108.getOwnedOperations().add(symbol_827);
		}
		{	// ocl::Sequence::select()
			Iteration symbol_829 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)
			symbol_829.setName("select");
			symbol_829.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_830 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)!i
			symbol_830.setName("i");
			symbol_830.setType(symbol_111); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_829.getOwnedIterators().add(symbol_830);
			Parameter symbol_831 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)!body
			symbol_831.setName("body");
			symbol_831.setType(symbol_155);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
			
			
			symbol_829.getOwnedParameters().add(symbol_831);
			symbol_829.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_829.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_832 = PivotFactory.eINSTANCE.createComment();
				symbol_832.setBody("The subsequence of the source sequence for which body is oclText[true].");
				symbol_829.getOwnedComments().add(symbol_832);
			}
			
			symbol_108.getOwnedOperations().add(symbol_829);
		}
		{	// ocl::Sequence::sortedBy()
			Iteration symbol_833 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_833.setName("sortedBy");
			symbol_833.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_834 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_834.setName("i");
			symbol_834.setType(symbol_111); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_833.getOwnedIterators().add(symbol_834);
			Parameter symbol_835 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_835.setName("body");
			symbol_835.setType(symbol_157);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_833.getOwnedParameters().add(symbol_835);
			symbol_833.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_833.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_836 = PivotFactory.eINSTANCE.createComment();
				symbol_836.setBody("Results in the Sequence containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
				symbol_833.getOwnedComments().add(symbol_836);
			}
			
			symbol_108.getOwnedOperations().add(symbol_833);
		}
		{	// ocl::Sequence::subSequence()
			Operation symbol_837 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)
			symbol_837.setName("subSequence");
			symbol_837.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_838 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)!lower
			symbol_838.setName("lower");
			symbol_838.setType(symbol_12);  // Integer
			
			
			symbol_837.getOwnedParameters().add(symbol_838);
			Parameter symbol_839 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)!upper
			symbol_839.setName("upper");
			symbol_839.setType(symbol_12);  // Integer
			
			
			symbol_837.getOwnedParameters().add(symbol_839);
			symbol_837.setImplementationClass("org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation");
			symbol_837.setImplementation(org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE);
			{
				Comment symbol_840 = PivotFactory.eINSTANCE.createComment();
				symbol_840.setBody("The sub-sequence of oclText[self] starting at number lower, up to and including element number upper.");
				symbol_837.getOwnedComments().add(symbol_840);
			}
			
			symbol_108.getOwnedOperations().add(symbol_837);
		}
		{	// ocl::Sequence::union()
			Operation symbol_841 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T})
			symbol_841.setName("union");
			symbol_841.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_842 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T})!s
			symbol_842.setName("s");
			symbol_842.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			
			symbol_841.getOwnedParameters().add(symbol_842);
			symbol_841.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_841.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_843 = PivotFactory.eINSTANCE.createComment();
				symbol_843.setBody("The sequence consisting of all elements in oclText[self], followed by all elements in s.");
				symbol_841.getOwnedComments().add(symbol_843);
			}
			
			symbol_108.getOwnedOperations().add(symbol_841);
		}
		{
			Comment symbol_844 = PivotFactory.eINSTANCE.createComment();
			symbol_844.setBody("A sequence is a collection where the elements are ordered.\nAn element may be part of a sequence more than once.\nSequence is itself an instance of the metatype SequenceType.\nA Sentence is not a subtype of Bag.\nThe common supertype of Sentence and Bags is Collection.");
			symbol_108.getOwnedComments().add(symbol_844);
		}
		
		symbol_0.getOwnedTypes().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
		//
		// ocl::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
		//
		symbol_121.setName("Set");
		symbol_121.setElementType(symbol_124);
		symbol_124.setName("T");
		symbol_123.setOwnedParameteredElement(symbol_124);
		symbol_122.getOwnedParameters().add(symbol_123);
		
		symbol_121.setOwnedTemplateSignature(symbol_122);
		symbol_121.getSuperClasses().add(symbol_206); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		symbol_121.getSuperClasses().add(symbol_298); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		{	// ocl::Set::-()
			Operation symbol_845 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_845.setName("-");
			symbol_845.setType(symbol_121);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_846 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_846.setName("s");
			symbol_846.setType(symbol_285);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			
			symbol_845.getOwnedParameters().add(symbol_846);
			symbol_845.setPrecedence(symbol_4);
			symbol_845.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_845.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			{
				Comment symbol_847 = PivotFactory.eINSTANCE.createComment();
				symbol_847.setBody("The elements of oclText[self], which are not in s.");
				symbol_845.getOwnedComments().add(symbol_847);
			}
			
			symbol_121.getOwnedOperations().add(symbol_845);
		}
		{	// ocl::Set::<>()
			Operation symbol_848 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_848.setName("<>");
			symbol_848.setType(symbol_11);  // Boolean
			
			Parameter symbol_849 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_849.setName("object2");
			symbol_849.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_848.getOwnedParameters().add(symbol_849);
			symbol_848.setPrecedence(symbol_6);
			symbol_848.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_848.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_121.getOwnedOperations().add(symbol_848);
		}
		{	// ocl::Set::=()
			Operation symbol_850 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_850.setName("=");
			symbol_850.setType(symbol_11);  // Boolean
			
			Parameter symbol_851 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_851.setName("object2");
			symbol_851.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_850.getOwnedParameters().add(symbol_851);
			symbol_850.setPrecedence(symbol_6);
			symbol_850.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_850.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_852 = PivotFactory.eINSTANCE.createComment();
				symbol_852.setBody("Evaluates to oclText[true] if oclText[self] and s contain the same elements.");
				symbol_850.getOwnedComments().add(symbol_852);
			}
			
			symbol_121.getOwnedOperations().add(symbol_850);
		}
		{	// ocl::Set::excluding()
			Operation symbol_853 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_853.setName("excluding");
			symbol_853.setType(symbol_121);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_854 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_854.setName("object");
			symbol_854.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_853.getOwnedParameters().add(symbol_854);
			symbol_853.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_853.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_855 = PivotFactory.eINSTANCE.createComment();
				symbol_855.setBody("The set containing all elements of oclText[self] without object.");
				symbol_853.getOwnedComments().add(symbol_855);
			}
			
			symbol_121.getOwnedOperations().add(symbol_853);
		}
		{	// ocl::Set::flatten()
			Operation symbol_856 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()
			symbol_127.setName("T2");
			symbol_126.setOwnedParameteredElement(symbol_127);
			symbol_125.getOwnedParameters().add(symbol_126);
			
			symbol_856.setOwnedTemplateSignature(symbol_125);
			symbol_856.setName("flatten");
			symbol_856.setType(symbol_275);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
			
			symbol_856.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_856.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			{
				Comment symbol_857 = PivotFactory.eINSTANCE.createComment();
				symbol_857.setBody("Redefines the Collection operation. If the element type is not a collection type, this results in the same set as oclText[self].\nIf the element type is a collection type, the result is the set containing all the elements of all the recursively flattened elements of oclText[self].");
				symbol_856.getOwnedComments().add(symbol_857);
			}
			
			symbol_121.getOwnedOperations().add(symbol_856);
		}
		{	// ocl::Set::including()
			Operation symbol_858 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!including(T)
			symbol_858.setName("including");
			symbol_858.setType(symbol_121);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_859 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!including(T)!object
			symbol_859.setName("object");
			symbol_859.setType(symbol_124);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			
			symbol_858.getOwnedParameters().add(symbol_859);
			symbol_858.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_858.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_860 = PivotFactory.eINSTANCE.createComment();
				symbol_860.setBody("The set containing all elements of oclText[self] plus object.");
				symbol_858.getOwnedComments().add(symbol_860);
			}
			
			symbol_121.getOwnedOperations().add(symbol_858);
		}
		{	// ocl::Set::intersection()
			Operation symbol_861 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T})
			symbol_861.setName("intersection");
			symbol_861.setType(symbol_121);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_862 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T})!s
			symbol_862.setName("s");
			symbol_862.setType(symbol_121);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			
			symbol_861.getOwnedParameters().add(symbol_862);
			symbol_861.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_861.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			{
				Comment symbol_863 = PivotFactory.eINSTANCE.createComment();
				symbol_863.setBody("The intersection of oclText[self] and s (i.e., the set of all elements that are in both oclText[self] and s).");
				symbol_861.getOwnedComments().add(symbol_863);
			}
			
			symbol_121.getOwnedOperations().add(symbol_861);
		}
		{	// ocl::Set::reject()
			Iteration symbol_864 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)
			symbol_864.setName("reject");
			symbol_864.setType(symbol_121);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_865 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)!i
			symbol_865.setName("i");
			symbol_865.setType(symbol_124); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			symbol_864.getOwnedIterators().add(symbol_865);
			Parameter symbol_866 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)!body
			symbol_866.setName("body");
			symbol_866.setType(symbol_162);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
			
			
			symbol_864.getOwnedParameters().add(symbol_866);
			symbol_864.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_864.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_867 = PivotFactory.eINSTANCE.createComment();
				symbol_867.setBody("The subset of the source set for which body is oclText[false].");
				symbol_864.getOwnedComments().add(symbol_867);
			}
			
			symbol_121.getOwnedOperations().add(symbol_864);
		}
		{	// ocl::Set::select()
			Iteration symbol_868 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)
			symbol_868.setName("select");
			symbol_868.setType(symbol_121);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_869 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)!i
			symbol_869.setName("i");
			symbol_869.setType(symbol_124); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			symbol_868.getOwnedIterators().add(symbol_869);
			Parameter symbol_870 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)!body
			symbol_870.setName("body");
			symbol_870.setType(symbol_161);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
			
			
			symbol_868.getOwnedParameters().add(symbol_870);
			symbol_868.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_868.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_871 = PivotFactory.eINSTANCE.createComment();
				symbol_871.setBody("The subset of set for which expr is oclText[true].");
				symbol_868.getOwnedComments().add(symbol_871);
			}
			
			symbol_121.getOwnedOperations().add(symbol_868);
		}
		{	// ocl::Set::sortedBy()
			Iteration symbol_872 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_872.setName("sortedBy");
			symbol_872.setType(symbol_254);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
			
			Parameter symbol_873 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_873.setName("i");
			symbol_873.setType(symbol_124); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			symbol_872.getOwnedIterators().add(symbol_873);
			Parameter symbol_874 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_874.setName("body");
			symbol_874.setType(symbol_163);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_872.getOwnedParameters().add(symbol_874);
			symbol_872.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_872.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_875 = PivotFactory.eINSTANCE.createComment();
				symbol_875.setBody("Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
				symbol_872.getOwnedComments().add(symbol_875);
			}
			
			symbol_121.getOwnedOperations().add(symbol_872);
		}
		{	// ocl::Set::union()
			Operation symbol_876 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_876.setName("union");
			symbol_876.setType(symbol_121);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_877 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!s
			symbol_877.setName("s");
			symbol_877.setType(symbol_246);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
			
			
			symbol_876.getOwnedParameters().add(symbol_877);
			symbol_876.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_876.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_878 = PivotFactory.eINSTANCE.createComment();
				symbol_878.setBody("The set consisting of all elements in oclText[self] and all elements in s.");
				symbol_876.getOwnedComments().add(symbol_878);
			}
			
			symbol_121.getOwnedOperations().add(symbol_876);
		}
		
		symbol_0.getOwnedTypes().add(symbol_121); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
		//
		// ocl::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
		//
		symbol_128.setName("UniqueCollection");
		symbol_128.setElementType(symbol_131);
		symbol_131.setName("T");
		symbol_130.setOwnedParameteredElement(symbol_131);
		symbol_129.getOwnedParameters().add(symbol_130);
		
		symbol_128.setOwnedTemplateSignature(symbol_129);
		symbol_128.getSuperClasses().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		{	// ocl::UniqueCollection::-()
			Operation symbol_879 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_879.setName("-");
			symbol_879.setType(symbol_128);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
			
			Parameter symbol_880 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_880.setName("s");
			symbol_880.setType(symbol_285);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			
			symbol_879.getOwnedParameters().add(symbol_880);
			symbol_879.setPrecedence(symbol_4);
			symbol_879.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_879.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			{
				Comment symbol_881 = PivotFactory.eINSTANCE.createComment();
				symbol_881.setBody("The elements of oclText[self], which are not in s.");
				symbol_879.getOwnedComments().add(symbol_881);
			}
			
			symbol_128.getOwnedOperations().add(symbol_879);
		}
		{	// ocl::UniqueCollection::sortedBy()
			Iteration symbol_882 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_882.setName("sortedBy");
			symbol_882.setType(symbol_255);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			Parameter symbol_883 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_883.setName("i");
			symbol_883.setType(symbol_131); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T
			
			symbol_882.getOwnedIterators().add(symbol_883);
			Parameter symbol_884 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_884.setName("body");
			symbol_884.setType(symbol_164);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_882.getOwnedParameters().add(symbol_884);
			symbol_882.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_882.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_885 = PivotFactory.eINSTANCE.createComment();
				symbol_885.setBody("Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
				symbol_882.getOwnedComments().add(symbol_885);
			}
			
			symbol_128.getOwnedOperations().add(symbol_882);
		}
		{	// ocl::UniqueCollection::symmetricDifference()
			Operation symbol_886 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_886.setName("symmetricDifference");
			symbol_886.setType(symbol_276);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			Parameter symbol_887 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_887.setName("s");
			symbol_887.setType(symbol_285);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			
			symbol_886.getOwnedParameters().add(symbol_887);
			symbol_886.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation");
			symbol_886.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			{
				Comment symbol_888 = PivotFactory.eINSTANCE.createComment();
				symbol_888.setBody("The set containing all the elements that are in oclText[self] or s, but not in both.");
				symbol_886.getOwnedComments().add(symbol_888);
			}
			
			symbol_128.getOwnedOperations().add(symbol_886);
		}
		{	// ocl::UniqueCollection::union()
			Operation symbol_889 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_889.setName("union");
			symbol_889.setType(symbol_276);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			Parameter symbol_890 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!s
			symbol_890.setName("s");
			symbol_890.setType(symbol_248);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			
			symbol_889.getOwnedParameters().add(symbol_890);
			symbol_889.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_889.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_891 = PivotFactory.eINSTANCE.createComment();
				symbol_891.setBody("The set consisting of all elements in oclText[self] and all elements in s.");
				symbol_889.getOwnedComments().add(symbol_891);
			}
			
			symbol_128.getOwnedOperations().add(symbol_889);
		}
		{
			Comment symbol_892 = PivotFactory.eINSTANCE.createComment();
			symbol_892.setBody("The UniqueCollection type provides the shared functionality of the OrderedSet and Set\ncollections for which the elements are unique.\nThe common supertype of UniqueCollection is Collection.");
			symbol_128.getOwnedComments().add(symbol_892);
		}
		
		symbol_0.getOwnedTypes().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
		//
		// ocl::$$ http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0
		//
		symbol_132.setName("$$");
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		symbol_133.setName("Lambda");
		symbol_133.setContextType(symbol_26);
		symbol_133.setResultType(symbol_11);
		symbol_133.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_133); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		symbol_134.setName("Lambda");
		symbol_134.setContextType(symbol_26);
		symbol_134.setResultType(symbol_11);
		symbol_134.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_134); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_135.setName("Lambda");
		symbol_135.setContextType(symbol_26);
		symbol_135.setResultType(symbol_32);
		symbol_135.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_135); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_136.setName("Lambda");
		symbol_136.setContextType(symbol_26);
		symbol_136.setResultType(symbol_29);
		symbol_136.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_136); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_137.setName("Lambda");
		symbol_137.setContextType(symbol_26);
		symbol_137.setResultType(symbol_80);
		symbol_137.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_137); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
		//
		symbol_138.setName("Lambda");
		symbol_138.setContextType(symbol_26);
		symbol_138.setResultType(symbol_270);
		symbol_138.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_138); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_139.setName("Lambda");
		symbol_139.setContextType(symbol_51);
		symbol_139.setResultType(symbol_11);
		symbol_139.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_139); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_140.setName("Lambda");
		symbol_140.setContextType(symbol_51);
		symbol_140.setResultType(symbol_11);
		symbol_140.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_140); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_141.setName("Lambda");
		symbol_141.setContextType(symbol_51);
		symbol_141.setResultType(symbol_11);
		symbol_141.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_141); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_142.setName("Lambda");
		symbol_142.setContextType(symbol_51);
		symbol_142.setResultType(symbol_11);
		symbol_142.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_142); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_143.setName("Lambda");
		symbol_143.setContextType(symbol_51);
		symbol_143.setResultType(symbol_11);
		symbol_143.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_143); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_144.setName("Lambda");
		symbol_144.setContextType(symbol_51);
		symbol_144.setResultType(symbol_11);
		symbol_144.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_144); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_145.setName("Lambda");
		symbol_145.setContextType(symbol_51);
		symbol_145.setResultType(symbol_11);
		symbol_145.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_145); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_146.setName("Lambda");
		symbol_146.setContextType(symbol_51);
		symbol_146.setResultType(symbol_11);
		symbol_146.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_146); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_147.setName("Lambda");
		symbol_147.setContextType(symbol_51);
		symbol_147.setResultType(symbol_57);
		symbol_147.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_147); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_148.setName("Lambda");
		symbol_148.setContextType(symbol_51);
		symbol_148.setResultType(symbol_54);
		symbol_148.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_148); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
		//
		symbol_149.setName("Lambda");
		symbol_149.setContextType(symbol_51);
		symbol_149.setResultType(symbol_69);
		symbol_149.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_149); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_150.setName("Lambda");
		symbol_150.setContextType(symbol_51);
		symbol_150.setResultType(symbol_80);
		symbol_150.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_150); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_151.setName("Lambda");
		symbol_151.setContextType(symbol_51);
		symbol_151.setResultType(symbol_80);
		symbol_151.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_151); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		symbol_152.setName("Lambda");
		symbol_152.setContextType(symbol_104);
		symbol_152.setResultType(symbol_11);
		symbol_152.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_152); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		symbol_153.setName("Lambda");
		symbol_153.setContextType(symbol_104);
		symbol_153.setResultType(symbol_11);
		symbol_153.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_153); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_154.setName("Lambda");
		symbol_154.setContextType(symbol_104);
		symbol_154.setResultType(symbol_80);
		symbol_154.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_154); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		symbol_155.setName("Lambda");
		symbol_155.setContextType(symbol_111);
		symbol_155.setResultType(symbol_11);
		symbol_155.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_155); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		symbol_156.setName("Lambda");
		symbol_156.setContextType(symbol_111);
		symbol_156.setResultType(symbol_11);
		symbol_156.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_156); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_157.setName("Lambda");
		symbol_157.setContextType(symbol_111);
		symbol_157.setResultType(symbol_80);
		symbol_157.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_157); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
		//
		symbol_158.setName("Lambda");
		symbol_158.setContextType(symbol_111);
		symbol_158.setResultType(symbol_253);
		symbol_158.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_158); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_159.setName("Lambda");
		symbol_159.setContextType(symbol_111);
		symbol_159.setResultType(symbol_117);
		symbol_159.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_159); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_160.setName("Lambda");
		symbol_160.setContextType(symbol_111);
		symbol_160.setResultType(symbol_114);
		symbol_160.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_160); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		symbol_161.setName("Lambda");
		symbol_161.setContextType(symbol_124);
		symbol_161.setResultType(symbol_11);
		symbol_161.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_161); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		symbol_162.setName("Lambda");
		symbol_162.setContextType(symbol_124);
		symbol_162.setResultType(symbol_11);
		symbol_162.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_162); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_163.setName("Lambda");
		symbol_163.setContextType(symbol_124);
		symbol_163.setResultType(symbol_80);
		symbol_163.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_163); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_164.setName("Lambda");
		symbol_164.setContextType(symbol_131);
		symbol_164.setResultType(symbol_80);
		symbol_164.getSuperClasses().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		symbol_132.getOwnedTypes().add(symbol_164); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_165.setName("Tuple");
		symbol_165.getSuperClasses().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_166.setName("first");
			symbol_166.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_166.setIsResolveProxies(true);
			
			symbol_165.getOwnedAttributes().add(symbol_166);
		}
		{ // ocl::$$::Tuple::second
			symbol_167.setName("second");
			symbol_167.setType(symbol_72);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_167.setIsResolveProxies(true);
			
			symbol_165.getOwnedAttributes().add(symbol_167);
		}
		
		symbol_132.getOwnedTypes().add(symbol_165); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_168.setName("Tuple");
		symbol_168.getSuperClasses().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_169.setName("first");
			symbol_169.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_169.setIsResolveProxies(true);
			
			symbol_168.getOwnedAttributes().add(symbol_169);
		}
		{ // ocl::$$::Tuple::second
			symbol_170.setName("second");
			symbol_170.setType(symbol_72);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_170.setIsResolveProxies(true);
			
			symbol_168.getOwnedAttributes().add(symbol_170);
		}
		
		symbol_132.getOwnedTypes().add(symbol_168); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_171.setName("Tuple");
		symbol_171.getSuperClasses().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_172.setName("first");
			symbol_172.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_172.setIsResolveProxies(true);
			
			symbol_171.getOwnedAttributes().add(symbol_172);
		}
		{ // ocl::$$::Tuple::second
			symbol_173.setName("second");
			symbol_173.setType(symbol_72);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_173.setIsResolveProxies(true);
			
			symbol_171.getOwnedAttributes().add(symbol_173);
		}
		
		symbol_132.getOwnedTypes().add(symbol_171); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_174.setName("Tuple");
		symbol_174.getSuperClasses().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_175.setName("first");
			symbol_175.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_175.setIsResolveProxies(true);
			
			symbol_174.getOwnedAttributes().add(symbol_175);
		}
		{ // ocl::$$::Tuple::second
			symbol_176.setName("second");
			symbol_176.setType(symbol_72);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_176.setIsResolveProxies(true);
			
			symbol_174.getOwnedAttributes().add(symbol_176);
		}
		
		symbol_132.getOwnedTypes().add(symbol_174); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		//
		symbol_177.setName("AnyClassifier");
		symbol_177.setInstanceType(symbol_18);
		symbol_177.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_893 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_893.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_894 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_894.setFormal(symbol_21);	
				symbol_894.setActual(symbol_18);	
				symbol_893.getParameterSubstitutions().add(symbol_894);
			}
			symbol_177.getTemplateBindings().add(symbol_893);
		}
		symbol_177.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		symbol_132.getOwnedTypes().add(symbol_177); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		//
		symbol_178.setName("AnyClassifier");
		symbol_178.setInstanceType(symbol_40);
		symbol_178.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_895 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_895.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_896 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_896.setFormal(symbol_21);	
				symbol_896.setActual(symbol_40);	
				symbol_895.getParameterSubstitutions().add(symbol_896);
			}
			symbol_178.getTemplateBindings().add(symbol_895);
		}
		symbol_178.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		symbol_132.getOwnedTypes().add(symbol_178); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		//
		symbol_179.setName("AnyClassifier");
		symbol_179.setInstanceType(symbol_44);
		symbol_179.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_897 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_897.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_898 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_898.setFormal(symbol_21);	
				symbol_898.setActual(symbol_44);	
				symbol_897.getParameterSubstitutions().add(symbol_898);
			}
			symbol_179.getTemplateBindings().add(symbol_897);
		}
		symbol_179.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		symbol_132.getOwnedTypes().add(symbol_179); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		//
		symbol_180.setName("AnyClassifier");
		symbol_180.setInstanceType(symbol_77);
		symbol_180.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_899 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_899.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_900 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_900.setFormal(symbol_21);	
				symbol_900.setActual(symbol_77);	
				symbol_899.getParameterSubstitutions().add(symbol_900);
			}
			symbol_180.getTemplateBindings().add(symbol_899);
		}
		symbol_180.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		symbol_132.getOwnedTypes().add(symbol_180); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		//
		symbol_181.setName("AnyClassifier");
		symbol_181.setInstanceType(symbol_83);
		symbol_181.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_901 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_901.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_902 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_902.setFormal(symbol_21);	
				symbol_902.setActual(symbol_83);	
				symbol_901.getParameterSubstitutions().add(symbol_902);
			}
			symbol_181.getTemplateBindings().add(symbol_901);
		}
		symbol_181.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		symbol_132.getOwnedTypes().add(symbol_181); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		//
		symbol_182.setName("AnyClassifier");
		symbol_182.setInstanceType(symbol_86);
		symbol_182.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_903 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_903.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_904 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_904.setFormal(symbol_21);	
				symbol_904.setActual(symbol_86);	
				symbol_903.getParameterSubstitutions().add(symbol_904);
			}
			symbol_182.getTemplateBindings().add(symbol_903);
		}
		symbol_182.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		symbol_132.getOwnedTypes().add(symbol_182); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		//
		symbol_183.setName("AnyClassifier");
		symbol_183.setInstanceType(symbol_89);
		symbol_183.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_905 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_905.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_906 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_906.setFormal(symbol_21);	
				symbol_906.setActual(symbol_89);	
				symbol_905.getParameterSubstitutions().add(symbol_906);
			}
			symbol_183.getTemplateBindings().add(symbol_905);
		}
		symbol_183.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		symbol_132.getOwnedTypes().add(symbol_183); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		//
		symbol_184.setName("AnyClassifier");
		symbol_184.setInstanceType(symbol_92);
		symbol_184.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_907 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_907.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_908 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_908.setFormal(symbol_21);	
				symbol_908.setActual(symbol_92);	
				symbol_907.getParameterSubstitutions().add(symbol_908);
			}
			symbol_184.getTemplateBindings().add(symbol_907);
		}
		symbol_184.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		symbol_132.getOwnedTypes().add(symbol_184); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		//
		symbol_185.setName("AnyClassifier");
		symbol_185.setInstanceType(symbol_92);
		symbol_185.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_909 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_909.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_910 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_910.setFormal(symbol_21);	
				symbol_910.setActual(symbol_92);	
				symbol_909.getParameterSubstitutions().add(symbol_910);
			}
			symbol_185.getTemplateBindings().add(symbol_909);
		}
		symbol_185.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		symbol_132.getOwnedTypes().add(symbol_185); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_186.setName("AnyClassifier");
		symbol_186.setInstanceType(symbol_96);
		symbol_186.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_911 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_911.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_912 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_912.setFormal(symbol_21);	
				symbol_912.setActual(symbol_96);	
				symbol_911.getParameterSubstitutions().add(symbol_912);
			}
			symbol_186.getTemplateBindings().add(symbol_911);
		}
		symbol_186.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		symbol_132.getOwnedTypes().add(symbol_186); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		//
		symbol_187.setName("AnyClassifier");
		symbol_187.setInstanceType(symbol_100);
		symbol_187.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_913 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_913.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_914 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_914.setFormal(symbol_21);	
				symbol_914.setActual(symbol_100);	
				symbol_913.getParameterSubstitutions().add(symbol_914);
			}
			symbol_187.getTemplateBindings().add(symbol_913);
		}
		symbol_187.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		symbol_132.getOwnedTypes().add(symbol_187); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_188.setName("Bag");
		symbol_188.setElementType(symbol_174);
		symbol_188.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_915 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_915.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_916 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_916.setFormal(symbol_25);	
				symbol_916.setActual(symbol_168);	
				symbol_915.getParameterSubstitutions().add(symbol_916);
			}
			symbol_188.getTemplateBindings().add(symbol_915);
		}
		symbol_188.getSuperClasses().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_132.getOwnedTypes().add(symbol_188); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_189.setName("Bag");
		symbol_189.setElementType(symbol_174);
		symbol_189.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_917 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_917.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_918 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_918.setFormal(symbol_25);	
				symbol_918.setActual(symbol_168);	
				symbol_917.getParameterSubstitutions().add(symbol_918);
			}
			symbol_189.getTemplateBindings().add(symbol_917);
		}
		symbol_189.getSuperClasses().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_132.getOwnedTypes().add(symbol_189); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_190.setName("Bag");
		symbol_190.setElementType(symbol_29);
		symbol_190.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_919 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_919.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_920 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_920.setFormal(symbol_25);	
				symbol_920.setActual(symbol_29);	
				symbol_919.getParameterSubstitutions().add(symbol_920);
			}
			symbol_190.getTemplateBindings().add(symbol_919);
		}
		symbol_190.getSuperClasses().add(symbol_217); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		
		symbol_132.getOwnedTypes().add(symbol_190); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		symbol_191.setName("Bag");
		symbol_191.setElementType(symbol_35);
		symbol_191.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_921 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_921.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_922 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_922.setFormal(symbol_25);	
				symbol_922.setActual(symbol_35);	
				symbol_921.getParameterSubstitutions().add(symbol_922);
			}
			symbol_191.getTemplateBindings().add(symbol_921);
		}
		symbol_191.getSuperClasses().add(symbol_218); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		symbol_132.getOwnedTypes().add(symbol_191); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_192.setName("Bag");
		symbol_192.setElementType(symbol_26);
		symbol_192.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_923 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_923.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_924 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_924.setFormal(symbol_25);	
				symbol_924.setActual(symbol_26);	
				symbol_923.getParameterSubstitutions().add(symbol_924);
			}
			symbol_192.getTemplateBindings().add(symbol_923);
		}
		symbol_192.getSuperClasses().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_192); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_193.setName("Bag");
		symbol_193.setElementType(symbol_26);
		symbol_193.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_925 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_925.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_926 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_926.setFormal(symbol_25);	
				symbol_926.setActual(symbol_26);	
				symbol_925.getParameterSubstitutions().add(symbol_926);
			}
			symbol_193.getTemplateBindings().add(symbol_925);
		}
		symbol_193.getSuperClasses().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_193); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_194.setName("Bag");
		symbol_194.setElementType(symbol_26);
		symbol_194.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_927 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_927.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_928 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_928.setFormal(symbol_25);	
				symbol_928.setActual(symbol_26);	
				symbol_927.getParameterSubstitutions().add(symbol_928);
			}
			symbol_194.getTemplateBindings().add(symbol_927);
		}
		symbol_194.getSuperClasses().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_194); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_195.setName("Bag");
		symbol_195.setElementType(symbol_26);
		symbol_195.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_929 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_929.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_930 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_930.setFormal(symbol_25);	
				symbol_930.setActual(symbol_26);	
				symbol_929.getParameterSubstitutions().add(symbol_930);
			}
			symbol_195.getTemplateBindings().add(symbol_929);
		}
		symbol_195.getSuperClasses().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_195); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_196.setName("Bag");
		symbol_196.setElementType(symbol_51);
		symbol_196.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_931 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_931.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_932 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_932.setFormal(symbol_25);	
				symbol_932.setActual(symbol_51);	
				symbol_931.getParameterSubstitutions().add(symbol_932);
			}
			symbol_196.getTemplateBindings().add(symbol_931);
		}
		symbol_196.getSuperClasses().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_196); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		symbol_197.setName("Bag");
		symbol_197.setElementType(symbol_91);
		symbol_197.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_933 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_933.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_934 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_934.setFormal(symbol_25);	
				symbol_934.setActual(symbol_91);	
				symbol_933.getParameterSubstitutions().add(symbol_934);
			}
			symbol_197.getTemplateBindings().add(symbol_933);
		}
		symbol_197.getSuperClasses().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		symbol_132.getOwnedTypes().add(symbol_197); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_198.setName("Bag");
		symbol_198.setElementType(symbol_96);
		symbol_198.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_935 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_935.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_936 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_936.setFormal(symbol_25);	
				symbol_936.setActual(symbol_96);	
				symbol_935.getParameterSubstitutions().add(symbol_936);
			}
			symbol_198.getTemplateBindings().add(symbol_935);
		}
		symbol_198.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_198); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_199.setName("Bag");
		symbol_199.setElementType(symbol_96);
		symbol_199.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_937 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_937.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_938 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_938.setFormal(symbol_25);	
				symbol_938.setActual(symbol_96);	
				symbol_937.getParameterSubstitutions().add(symbol_938);
			}
			symbol_199.getTemplateBindings().add(symbol_937);
		}
		symbol_199.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_199); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_200.setName("Bag");
		symbol_200.setElementType(symbol_96);
		symbol_200.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_939 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_939.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_940 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_940.setFormal(symbol_25);	
				symbol_940.setActual(symbol_96);	
				symbol_939.getParameterSubstitutions().add(symbol_940);
			}
			symbol_200.getTemplateBindings().add(symbol_939);
		}
		symbol_200.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_200); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_201.setName("Bag");
		symbol_201.setElementType(symbol_96);
		symbol_201.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_941 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_941.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_942 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_942.setFormal(symbol_25);	
				symbol_942.setActual(symbol_96);	
				symbol_941.getParameterSubstitutions().add(symbol_942);
			}
			symbol_201.getTemplateBindings().add(symbol_941);
		}
		symbol_201.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_201); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_202.setName("Bag");
		symbol_202.setElementType(symbol_96);
		symbol_202.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_943 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_943.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_944 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_944.setFormal(symbol_25);	
				symbol_944.setActual(symbol_96);	
				symbol_943.getParameterSubstitutions().add(symbol_944);
			}
			symbol_202.getTemplateBindings().add(symbol_943);
		}
		symbol_202.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_202); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_203.setName("Bag");
		symbol_203.setElementType(symbol_96);
		symbol_203.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_945 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_945.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_946 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_946.setFormal(symbol_25);	
				symbol_946.setActual(symbol_96);	
				symbol_945.getParameterSubstitutions().add(symbol_946);
			}
			symbol_203.getTemplateBindings().add(symbol_945);
		}
		symbol_203.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_203); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_204.setName("Bag");
		symbol_204.setElementType(symbol_104);
		symbol_204.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_947 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_947.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_948 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_948.setFormal(symbol_25);	
				symbol_948.setActual(symbol_104);	
				symbol_947.getParameterSubstitutions().add(symbol_948);
			}
			symbol_204.getTemplateBindings().add(symbol_947);
		}
		symbol_204.getSuperClasses().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_204); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_205.setName("Bag");
		symbol_205.setElementType(symbol_127);
		symbol_205.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_949 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_949.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_950 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_950.setFormal(symbol_25);	
				symbol_950.setActual(symbol_127);	
				symbol_949.getParameterSubstitutions().add(symbol_950);
			}
			symbol_205.getTemplateBindings().add(symbol_949);
		}
		symbol_205.getSuperClasses().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		symbol_132.getOwnedTypes().add(symbol_205); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_206.setName("Bag");
		symbol_206.setElementType(symbol_124);
		symbol_206.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_951 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_951.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_952 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_952.setFormal(symbol_25);	
				symbol_952.setActual(symbol_124);	
				symbol_951.getParameterSubstitutions().add(symbol_952);
			}
			symbol_206.getTemplateBindings().add(symbol_951);
		}
		symbol_206.getSuperClasses().add(symbol_246); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_206); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_207.setName("Bag");
		symbol_207.setElementType(symbol_131);
		symbol_207.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_953 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_953.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_954 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_954.setFormal(symbol_25);	
				symbol_954.setActual(symbol_131);	
				symbol_953.getParameterSubstitutions().add(symbol_954);
			}
			symbol_207.getTemplateBindings().add(symbol_953);
		}
		symbol_207.getSuperClasses().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_207); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_208.setName("Bag");
		symbol_208.setElementType(symbol_131);
		symbol_208.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_955 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_955.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_956 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_956.setFormal(symbol_25);	
				symbol_956.setActual(symbol_131);	
				symbol_955.getParameterSubstitutions().add(symbol_956);
			}
			symbol_208.getTemplateBindings().add(symbol_955);
		}
		symbol_208.getSuperClasses().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_208); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::ClassClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		//
		symbol_209.setName("ClassClassifier");
		symbol_209.setInstanceType(symbol_92);
		symbol_209.setUnspecializedElement(symbol_37);
		{
			TemplateBinding symbol_957 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_957.setSignature(symbol_38);
			{
				TemplateParameterSubstitution symbol_958 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_958.setFormal(symbol_39);	
				symbol_958.setActual(symbol_92);	
				symbol_957.getParameterSubstitutions().add(symbol_958);
			}
			symbol_209.getTemplateBindings().add(symbol_957);
		}
		symbol_209.getSuperClasses().add(symbol_185); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		
		symbol_132.getOwnedTypes().add(symbol_209); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid]
		//
		// ocl::$$::ClassClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_210.setName("ClassClassifier");
		symbol_210.setInstanceType(symbol_96);
		symbol_210.setUnspecializedElement(symbol_37);
		{
			TemplateBinding symbol_959 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_959.setSignature(symbol_38);
			{
				TemplateParameterSubstitution symbol_960 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_960.setFormal(symbol_39);	
				symbol_960.setActual(symbol_96);	
				symbol_959.getParameterSubstitutions().add(symbol_960);
			}
			symbol_210.getTemplateBindings().add(symbol_959);
		}
		symbol_210.getSuperClasses().add(symbol_186); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_210); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::ClassClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		//
		symbol_211.setName("ClassClassifier");
		symbol_211.setInstanceType(symbol_100);
		symbol_211.setUnspecializedElement(symbol_37);
		{
			TemplateBinding symbol_961 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_961.setSignature(symbol_38);
			{
				TemplateParameterSubstitution symbol_962 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_962.setFormal(symbol_39);	
				symbol_962.setActual(symbol_100);	
				symbol_961.getParameterSubstitutions().add(symbol_962);
			}
			symbol_211.getTemplateBindings().add(symbol_961);
		}
		symbol_211.getSuperClasses().add(symbol_187); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		
		symbol_132.getOwnedTypes().add(symbol_211); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		//
		// ocl::$$::CollectionClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_212.setName("CollectionClassifier");
		symbol_212.setInstanceType(symbol_96);
		symbol_212.setUnspecializedElement(symbol_41);
		{
			TemplateBinding symbol_963 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_963.setSignature(symbol_42);
			{
				TemplateParameterSubstitution symbol_964 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_964.setFormal(symbol_45);	
				symbol_964.setActual(symbol_51);	
				symbol_963.getParameterSubstitutions().add(symbol_964);
			}{
				TemplateParameterSubstitution symbol_965 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_965.setFormal(symbol_43);	
				symbol_965.setActual(symbol_96);	
				symbol_963.getParameterSubstitutions().add(symbol_965);
			}
			symbol_212.getTemplateBindings().add(symbol_963);
		}
		symbol_212.getSuperClasses().add(symbol_186); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_212); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Integer]
		//
		symbol_213.setName("Collection");
		symbol_213.setElementType(symbol_12);
		symbol_213.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_966 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_966.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_967 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_967.setFormal(symbol_50);	
				symbol_967.setActual(symbol_12);	
				symbol_966.getParameterSubstitutions().add(symbol_967);
			}
			symbol_213.getTemplateBindings().add(symbol_966);
		}
		symbol_213.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_213); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Integer]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		//
		symbol_214.setName("Collection");
		symbol_214.setElementType(symbol_14);
		symbol_214.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_968 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_968.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_969 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_969.setFormal(symbol_50);	
				symbol_969.setActual(symbol_14);	
				symbol_968.getParameterSubstitutions().add(symbol_969);
			}
			symbol_214.getTemplateBindings().add(symbol_968);
		}
		symbol_214.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_214); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_215.setName("Collection");
		symbol_215.setElementType(symbol_171);
		symbol_215.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_970 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_970.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_971 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_971.setFormal(symbol_50);	
				symbol_971.setActual(symbol_171);	
				symbol_970.getParameterSubstitutions().add(symbol_971);
			}
			symbol_215.getTemplateBindings().add(symbol_970);
		}
		symbol_215.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_216.setName("Collection");
		symbol_216.setElementType(symbol_171);
		symbol_216.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_972 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_972.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_973 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_973.setFormal(symbol_50);	
				symbol_973.setActual(symbol_171);	
				symbol_972.getParameterSubstitutions().add(symbol_973);
			}
			symbol_216.getTemplateBindings().add(symbol_972);
		}
		symbol_216.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_217.setName("Collection");
		symbol_217.setElementType(symbol_29);
		symbol_217.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_974 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_974.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_975 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_975.setFormal(symbol_50);	
				symbol_975.setActual(symbol_29);	
				symbol_974.getParameterSubstitutions().add(symbol_975);
			}
			symbol_217.getTemplateBindings().add(symbol_974);
		}
		symbol_217.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_217); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		symbol_218.setName("Collection");
		symbol_218.setElementType(symbol_35);
		symbol_218.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_976 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_976.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_977 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_977.setFormal(symbol_50);	
				symbol_977.setActual(symbol_35);	
				symbol_976.getParameterSubstitutions().add(symbol_977);
			}
			symbol_218.getTemplateBindings().add(symbol_976);
		}
		symbol_218.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_218); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_219.setName("Collection");
		symbol_219.setElementType(symbol_26);
		symbol_219.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_978 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_978.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_979 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_979.setFormal(symbol_50);	
				symbol_979.setActual(symbol_26);	
				symbol_978.getParameterSubstitutions().add(symbol_979);
			}
			symbol_219.getTemplateBindings().add(symbol_978);
		}
		symbol_219.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_220.setName("Collection");
		symbol_220.setElementType(symbol_26);
		symbol_220.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_980 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_980.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_981 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_981.setFormal(symbol_50);	
				symbol_981.setActual(symbol_26);	
				symbol_980.getParameterSubstitutions().add(symbol_981);
			}
			symbol_220.getTemplateBindings().add(symbol_980);
		}
		symbol_220.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_220); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_221.setName("Collection");
		symbol_221.setElementType(symbol_26);
		symbol_221.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_982 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_982.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_983 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_983.setFormal(symbol_50);	
				symbol_983.setActual(symbol_26);	
				symbol_982.getParameterSubstitutions().add(symbol_983);
			}
			symbol_221.getTemplateBindings().add(symbol_982);
		}
		symbol_221.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_221); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_222.setName("Collection");
		symbol_222.setElementType(symbol_54);
		symbol_222.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_984 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_984.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_985 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_985.setFormal(symbol_50);	
				symbol_985.setActual(symbol_54);	
				symbol_984.getParameterSubstitutions().add(symbol_985);
			}
			symbol_222.getTemplateBindings().add(symbol_984);
		}
		symbol_222.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_222); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		symbol_223.setName("Collection");
		symbol_223.setElementType(symbol_60);
		symbol_223.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_986 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_986.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_987 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_987.setFormal(symbol_50);	
				symbol_987.setActual(symbol_60);	
				symbol_986.getParameterSubstitutions().add(symbol_987);
			}
			symbol_223.getTemplateBindings().add(symbol_986);
		}
		symbol_223.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
		//
		symbol_224.setName("Collection");
		symbol_224.setElementType(symbol_63);
		symbol_224.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_988 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_988.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_989 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_989.setFormal(symbol_50);	
				symbol_989.setActual(symbol_63);	
				symbol_988.getParameterSubstitutions().add(symbol_989);
			}
			symbol_224.getTemplateBindings().add(symbol_988);
		}
		symbol_224.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_224); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		symbol_225.setName("Collection");
		symbol_225.setElementType(symbol_66);
		symbol_225.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_990 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_990.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_991 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_991.setFormal(symbol_50);	
				symbol_991.setActual(symbol_66);	
				symbol_990.getParameterSubstitutions().add(symbol_991);
			}
			symbol_225.getTemplateBindings().add(symbol_990);
		}
		symbol_225.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_225); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		symbol_226.setName("Collection");
		symbol_226.setElementType(symbol_72);
		symbol_226.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_992 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_992.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_993 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_993.setFormal(symbol_50);	
				symbol_993.setActual(symbol_72);	
				symbol_992.getParameterSubstitutions().add(symbol_993);
			}
			symbol_226.getTemplateBindings().add(symbol_992);
		}
		symbol_226.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_226); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_227.setName("Collection");
		symbol_227.setElementType(symbol_51);
		symbol_227.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_994 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_994.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_995 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_995.setFormal(symbol_50);	
				symbol_995.setActual(symbol_51);	
				symbol_994.getParameterSubstitutions().add(symbol_995);
			}
			symbol_227.getTemplateBindings().add(symbol_994);
		}
		symbol_227.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_228.setName("Collection");
		symbol_228.setElementType(symbol_51);
		symbol_228.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_996 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_996.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_997 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_997.setFormal(symbol_50);	
				symbol_997.setActual(symbol_51);	
				symbol_996.getParameterSubstitutions().add(symbol_997);
			}
			symbol_228.getTemplateBindings().add(symbol_996);
		}
		symbol_228.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_229.setName("Collection");
		symbol_229.setElementType(symbol_51);
		symbol_229.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_998 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_998.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_999 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_999.setFormal(symbol_50);	
				symbol_999.setActual(symbol_51);	
				symbol_998.getParameterSubstitutions().add(symbol_999);
			}
			symbol_229.getTemplateBindings().add(symbol_998);
		}
		symbol_229.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_230.setName("Collection");
		symbol_230.setElementType(symbol_79);
		symbol_230.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1000 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1000.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1001 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1001.setFormal(symbol_50);	
				symbol_1001.setActual(symbol_79);	
				symbol_1000.getParameterSubstitutions().add(symbol_1001);
			}
			symbol_230.getTemplateBindings().add(symbol_1000);
		}
		symbol_230.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_231.setName("Collection");
		symbol_231.setElementType(symbol_80);
		symbol_231.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1002 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1002.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1003 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1003.setFormal(symbol_50);	
				symbol_1003.setActual(symbol_80);	
				symbol_1002.getParameterSubstitutions().add(symbol_1003);
			}
			symbol_231.getTemplateBindings().add(symbol_1002);
		}
		symbol_231.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_232.setName("Collection");
		symbol_232.setElementType(symbol_80);
		symbol_232.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1004 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1004.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1005 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1005.setFormal(symbol_50);	
				symbol_1005.setActual(symbol_80);	
				symbol_1004.getParameterSubstitutions().add(symbol_1005);
			}
			symbol_232.getTemplateBindings().add(symbol_1004);
		}
		symbol_232.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_233.setName("Collection");
		symbol_233.setElementType(symbol_80);
		symbol_233.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1006 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1006.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1007 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1007.setFormal(symbol_50);	
				symbol_1007.setActual(symbol_80);	
				symbol_1006.getParameterSubstitutions().add(symbol_1007);
			}
			symbol_233.getTemplateBindings().add(symbol_1006);
		}
		symbol_233.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_233); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_234.setName("Collection");
		symbol_234.setElementType(symbol_80);
		symbol_234.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1008 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1008.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1009 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1009.setFormal(symbol_50);	
				symbol_1009.setActual(symbol_80);	
				symbol_1008.getParameterSubstitutions().add(symbol_1009);
			}
			symbol_234.getTemplateBindings().add(symbol_1008);
		}
		symbol_234.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_234); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		symbol_235.setName("Collection");
		symbol_235.setElementType(symbol_91);
		symbol_235.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1010 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1010.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1011 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1011.setFormal(symbol_50);	
				symbol_1011.setActual(symbol_91);	
				symbol_1010.getParameterSubstitutions().add(symbol_1011);
			}
			symbol_235.getTemplateBindings().add(symbol_1010);
		}
		symbol_235.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_236.setName("Collection");
		symbol_236.setElementType(symbol_96);
		symbol_236.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1012 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1012.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1013 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1013.setFormal(symbol_50);	
				symbol_1013.setActual(symbol_96);	
				symbol_1012.getParameterSubstitutions().add(symbol_1013);
			}
			symbol_236.getTemplateBindings().add(symbol_1012);
		}
		symbol_236.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_237.setName("Collection");
		symbol_237.setElementType(symbol_107);
		symbol_237.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1014 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1014.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1015 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1015.setFormal(symbol_50);	
				symbol_1015.setActual(symbol_107);	
				symbol_1014.getParameterSubstitutions().add(symbol_1015);
			}
			symbol_237.getTemplateBindings().add(symbol_1014);
		}
		symbol_237.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_238.setName("Collection");
		symbol_238.setElementType(symbol_104);
		symbol_238.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1016 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1016.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1017 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1017.setFormal(symbol_50);	
				symbol_1017.setActual(symbol_104);	
				symbol_1016.getParameterSubstitutions().add(symbol_1017);
			}
			symbol_238.getTemplateBindings().add(symbol_1016);
		}
		symbol_238.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_239.setName("Collection");
		symbol_239.setElementType(symbol_104);
		symbol_239.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1018 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1018.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1019 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1019.setFormal(symbol_50);	
				symbol_1019.setActual(symbol_104);	
				symbol_1018.getParameterSubstitutions().add(symbol_1019);
			}
			symbol_239.getTemplateBindings().add(symbol_1018);
		}
		symbol_239.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_240.setName("Collection");
		symbol_240.setElementType(symbol_114);
		symbol_240.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1020 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1020.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1021 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1021.setFormal(symbol_50);	
				symbol_1021.setActual(symbol_114);	
				symbol_1020.getParameterSubstitutions().add(symbol_1021);
			}
			symbol_240.getTemplateBindings().add(symbol_1020);
		}
		symbol_240.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_240); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_241.setName("Collection");
		symbol_241.setElementType(symbol_120);
		symbol_241.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1022 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1022.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1023 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1023.setFormal(symbol_50);	
				symbol_1023.setActual(symbol_120);	
				symbol_1022.getParameterSubstitutions().add(symbol_1023);
			}
			symbol_241.getTemplateBindings().add(symbol_1022);
		}
		symbol_241.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_242.setName("Collection");
		symbol_242.setElementType(symbol_111);
		symbol_242.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1024 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1024.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1025 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1025.setFormal(symbol_50);	
				symbol_1025.setActual(symbol_111);	
				symbol_1024.getParameterSubstitutions().add(symbol_1025);
			}
			symbol_242.getTemplateBindings().add(symbol_1024);
		}
		symbol_242.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_243.setName("Collection");
		symbol_243.setElementType(symbol_111);
		symbol_243.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1026 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1026.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1027 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1027.setFormal(symbol_50);	
				symbol_1027.setActual(symbol_111);	
				symbol_1026.getParameterSubstitutions().add(symbol_1027);
			}
			symbol_243.getTemplateBindings().add(symbol_1026);
		}
		symbol_243.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_243); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_244.setName("Collection");
		symbol_244.setElementType(symbol_127);
		symbol_244.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1028 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1028.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1029 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1029.setFormal(symbol_50);	
				symbol_1029.setActual(symbol_127);	
				symbol_1028.getParameterSubstitutions().add(symbol_1029);
			}
			symbol_244.getTemplateBindings().add(symbol_1028);
		}
		symbol_244.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_245.setName("Collection");
		symbol_245.setElementType(symbol_124);
		symbol_245.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1030 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1030.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1031 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1031.setFormal(symbol_50);	
				symbol_1031.setActual(symbol_124);	
				symbol_1030.getParameterSubstitutions().add(symbol_1031);
			}
			symbol_245.getTemplateBindings().add(symbol_1030);
		}
		symbol_245.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_245); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_246.setName("Collection");
		symbol_246.setElementType(symbol_124);
		symbol_246.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1032 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1032.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1033 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1033.setFormal(symbol_50);	
				symbol_1033.setActual(symbol_124);	
				symbol_1032.getParameterSubstitutions().add(symbol_1033);
			}
			symbol_246.getTemplateBindings().add(symbol_1032);
		}
		symbol_246.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_246); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_247.setName("Collection");
		symbol_247.setElementType(symbol_131);
		symbol_247.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1034 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1034.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1035 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1035.setFormal(symbol_50);	
				symbol_1035.setActual(symbol_131);	
				symbol_1034.getParameterSubstitutions().add(symbol_1035);
			}
			symbol_247.getTemplateBindings().add(symbol_1034);
		}
		symbol_247.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_248.setName("Collection");
		symbol_248.setElementType(symbol_131);
		symbol_248.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_1036 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1036.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1037 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1037.setFormal(symbol_50);	
				symbol_1037.setActual(symbol_131);	
				symbol_1036.getParameterSubstitutions().add(symbol_1037);
			}
			symbol_248.getTemplateBindings().add(symbol_1036);
		}
		symbol_248.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_132.getOwnedTypes().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::EnumerationClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_249.setName("EnumerationClassifier");
		symbol_249.setInstanceType(symbol_96);
		symbol_249.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_1038 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1038.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_1039 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1039.setFormal(symbol_76);	
				symbol_1039.setActual(symbol_96);	
				symbol_1038.getParameterSubstitutions().add(symbol_1039);
			}
			symbol_249.getTemplateBindings().add(symbol_1038);
		}
		symbol_249.getSuperClasses().add(symbol_186); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_250.setName("OrderedSet");
		symbol_250.setElementType(symbol_51);
		symbol_250.setUnspecializedElement(symbol_101);
		{
			TemplateBinding symbol_1040 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1040.setSignature(symbol_102);
			{
				TemplateParameterSubstitution symbol_1041 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1041.setFormal(symbol_103);	
				symbol_1041.setActual(symbol_51);	
				symbol_1040.getParameterSubstitutions().add(symbol_1041);
			}
			symbol_250.getTemplateBindings().add(symbol_1040);
		}
		symbol_250.getSuperClasses().add(symbol_259); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_250.getSuperClasses().add(symbol_283); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_250); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_251.setName("OrderedSet");
		symbol_251.setElementType(symbol_79);
		symbol_251.setUnspecializedElement(symbol_101);
		{
			TemplateBinding symbol_1042 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1042.setSignature(symbol_102);
			{
				TemplateParameterSubstitution symbol_1043 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1043.setFormal(symbol_103);	
				symbol_1043.setActual(symbol_79);	
				symbol_1042.getParameterSubstitutions().add(symbol_1043);
			}
			symbol_251.getTemplateBindings().add(symbol_1042);
		}
		symbol_251.getSuperClasses().add(symbol_260); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		symbol_251.getSuperClasses().add(symbol_284); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		symbol_132.getOwnedTypes().add(symbol_251); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_252.setName("OrderedSet");
		symbol_252.setElementType(symbol_107);
		symbol_252.setUnspecializedElement(symbol_101);
		{
			TemplateBinding symbol_1044 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1044.setSignature(symbol_102);
			{
				TemplateParameterSubstitution symbol_1045 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1045.setFormal(symbol_103);	
				symbol_1045.setActual(symbol_107);	
				symbol_1044.getParameterSubstitutions().add(symbol_1045);
			}
			symbol_252.getTemplateBindings().add(symbol_1044);
		}
		symbol_252.getSuperClasses().add(symbol_261); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		symbol_252.getSuperClasses().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		symbol_132.getOwnedTypes().add(symbol_252); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_253.setName("OrderedSet");
		symbol_253.setElementType(symbol_111);
		symbol_253.setUnspecializedElement(symbol_101);
		{
			TemplateBinding symbol_1046 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1046.setSignature(symbol_102);
			{
				TemplateParameterSubstitution symbol_1047 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1047.setFormal(symbol_103);	
				symbol_1047.setActual(symbol_111);	
				symbol_1046.getParameterSubstitutions().add(symbol_1047);
			}
			symbol_253.getTemplateBindings().add(symbol_1046);
		}
		symbol_253.getSuperClasses().add(symbol_265); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		symbol_253.getSuperClasses().add(symbol_295); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_253); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_254.setName("OrderedSet");
		symbol_254.setElementType(symbol_124);
		symbol_254.setUnspecializedElement(symbol_101);
		{
			TemplateBinding symbol_1048 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1048.setSignature(symbol_102);
			{
				TemplateParameterSubstitution symbol_1049 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1049.setFormal(symbol_103);	
				symbol_1049.setActual(symbol_124);	
				symbol_1048.getParameterSubstitutions().add(symbol_1049);
			}
			symbol_254.getTemplateBindings().add(symbol_1048);
		}
		symbol_254.getSuperClasses().add(symbol_267); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		symbol_254.getSuperClasses().add(symbol_298); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_254); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_255.setName("OrderedSet");
		symbol_255.setElementType(symbol_131);
		symbol_255.setUnspecializedElement(symbol_101);
		{
			TemplateBinding symbol_1050 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1050.setSignature(symbol_102);
			{
				TemplateParameterSubstitution symbol_1051 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1051.setFormal(symbol_103);	
				symbol_1051.setActual(symbol_131);	
				symbol_1050.getParameterSubstitutions().add(symbol_1051);
			}
			symbol_255.getTemplateBindings().add(symbol_1050);
		}
		symbol_255.getSuperClasses().add(symbol_268); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_255.getSuperClasses().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_255); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[Integer]
		//
		symbol_256.setName("Sequence");
		symbol_256.setElementType(symbol_12);
		symbol_256.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1052 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1052.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1053 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1053.setFormal(symbol_110);	
				symbol_1053.setActual(symbol_12);	
				symbol_1052.getParameterSubstitutions().add(symbol_1053);
			}
			symbol_256.getTemplateBindings().add(symbol_1052);
		}
		symbol_256.getSuperClasses().add(symbol_213); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Integer]
		
		symbol_132.getOwnedTypes().add(symbol_256); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[Integer]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
		//
		symbol_257.setName("Sequence");
		symbol_257.setElementType(symbol_14);
		symbol_257.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1054 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1054.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1055 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1055.setFormal(symbol_110);	
				symbol_1055.setActual(symbol_14);	
				symbol_1054.getParameterSubstitutions().add(symbol_1055);
			}
			symbol_257.getTemplateBindings().add(symbol_1054);
		}
		symbol_257.getSuperClasses().add(symbol_214); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		
		symbol_132.getOwnedTypes().add(symbol_257); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_258.setName("Sequence");
		symbol_258.setElementType(symbol_26);
		symbol_258.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1056 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1056.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1057 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1057.setFormal(symbol_110);	
				symbol_1057.setActual(symbol_26);	
				symbol_1056.getParameterSubstitutions().add(symbol_1057);
			}
			symbol_258.getTemplateBindings().add(symbol_1056);
		}
		symbol_258.getSuperClasses().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_258); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_259.setName("Sequence");
		symbol_259.setElementType(symbol_51);
		symbol_259.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1058 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1058.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1059 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1059.setFormal(symbol_110);	
				symbol_1059.setActual(symbol_51);	
				symbol_1058.getParameterSubstitutions().add(symbol_1059);
			}
			symbol_259.getTemplateBindings().add(symbol_1058);
		}
		symbol_259.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_259); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_260.setName("Sequence");
		symbol_260.setElementType(symbol_79);
		symbol_260.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1060 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1060.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1061 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1061.setFormal(symbol_110);	
				symbol_1061.setActual(symbol_79);	
				symbol_1060.getParameterSubstitutions().add(symbol_1061);
			}
			symbol_260.getTemplateBindings().add(symbol_1060);
		}
		symbol_260.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		symbol_132.getOwnedTypes().add(symbol_260); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_261.setName("Sequence");
		symbol_261.setElementType(symbol_107);
		symbol_261.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1062 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1062.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1063 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1063.setFormal(symbol_110);	
				symbol_1063.setActual(symbol_107);	
				symbol_1062.getParameterSubstitutions().add(symbol_1063);
			}
			symbol_261.getTemplateBindings().add(symbol_1062);
		}
		symbol_261.getSuperClasses().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		symbol_132.getOwnedTypes().add(symbol_261); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_262.setName("Sequence");
		symbol_262.setElementType(symbol_104);
		symbol_262.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1064 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1064.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1065 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1065.setFormal(symbol_110);	
				symbol_1065.setActual(symbol_104);	
				symbol_1064.getParameterSubstitutions().add(symbol_1065);
			}
			symbol_262.getTemplateBindings().add(symbol_1064);
		}
		symbol_262.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_262); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_263.setName("Sequence");
		symbol_263.setElementType(symbol_114);
		symbol_263.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1066 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1066.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1067 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1067.setFormal(symbol_110);	
				symbol_1067.setActual(symbol_114);	
				symbol_1066.getParameterSubstitutions().add(symbol_1067);
			}
			symbol_263.getTemplateBindings().add(symbol_1066);
		}
		symbol_263.getSuperClasses().add(symbol_240); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		
		symbol_132.getOwnedTypes().add(symbol_263); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_264.setName("Sequence");
		symbol_264.setElementType(symbol_120);
		symbol_264.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1068 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1068.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1069 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1069.setFormal(symbol_110);	
				symbol_1069.setActual(symbol_120);	
				symbol_1068.getParameterSubstitutions().add(symbol_1069);
			}
			symbol_264.getTemplateBindings().add(symbol_1068);
		}
		symbol_264.getSuperClasses().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		symbol_132.getOwnedTypes().add(symbol_264); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_265.setName("Sequence");
		symbol_265.setElementType(symbol_111);
		symbol_265.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1070 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1070.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1071 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1071.setFormal(symbol_110);	
				symbol_1071.setActual(symbol_111);	
				symbol_1070.getParameterSubstitutions().add(symbol_1071);
			}
			symbol_265.getTemplateBindings().add(symbol_1070);
		}
		symbol_265.getSuperClasses().add(symbol_243); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_265); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_266.setName("Sequence");
		symbol_266.setElementType(symbol_111);
		symbol_266.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1072 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1072.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1073 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1073.setFormal(symbol_110);	
				symbol_1073.setActual(symbol_111);	
				symbol_1072.getParameterSubstitutions().add(symbol_1073);
			}
			symbol_266.getTemplateBindings().add(symbol_1072);
		}
		symbol_266.getSuperClasses().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_266); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_267.setName("Sequence");
		symbol_267.setElementType(symbol_124);
		symbol_267.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1074 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1074.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1075 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1075.setFormal(symbol_110);	
				symbol_1075.setActual(symbol_124);	
				symbol_1074.getParameterSubstitutions().add(symbol_1075);
			}
			symbol_267.getTemplateBindings().add(symbol_1074);
		}
		symbol_267.getSuperClasses().add(symbol_246); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_267); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_268.setName("Sequence");
		symbol_268.setElementType(symbol_131);
		symbol_268.setUnspecializedElement(symbol_108);
		{
			TemplateBinding symbol_1076 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1076.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_1077 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1077.setFormal(symbol_110);	
				symbol_1077.setActual(symbol_131);	
				symbol_1076.getParameterSubstitutions().add(symbol_1077);
			}
			symbol_268.getTemplateBindings().add(symbol_1076);
		}
		symbol_268.getSuperClasses().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_268); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_269.setName("Set");
		symbol_269.setElementType(symbol_174);
		symbol_269.setUnspecializedElement(symbol_121);
		{
			TemplateBinding symbol_1078 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1078.setSignature(symbol_122);
			{
				TemplateParameterSubstitution symbol_1079 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1079.setFormal(symbol_123);	
				symbol_1079.setActual(symbol_168);	
				symbol_1078.getParameterSubstitutions().add(symbol_1079);
			}
			symbol_269.getTemplateBindings().add(symbol_1078);
		}
		symbol_269.getSuperClasses().add(symbol_189); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_269.getSuperClasses().add(symbol_278); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_132.getOwnedTypes().add(symbol_269); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_270.setName("Set");
		symbol_270.setElementType(symbol_26);
		symbol_270.setUnspecializedElement(symbol_121);
		{
			TemplateBinding symbol_1080 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1080.setSignature(symbol_122);
			{
				TemplateParameterSubstitution symbol_1081 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1081.setFormal(symbol_123);	
				symbol_1081.setActual(symbol_26);	
				symbol_1080.getParameterSubstitutions().add(symbol_1081);
			}
			symbol_270.getTemplateBindings().add(symbol_1080);
		}
		symbol_270.getSuperClasses().add(symbol_194); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		symbol_270.getSuperClasses().add(symbol_281); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_270); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_271.setName("Set");
		symbol_271.setElementType(symbol_51);
		symbol_271.setUnspecializedElement(symbol_121);
		{
			TemplateBinding symbol_1082 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1082.setSignature(symbol_122);
			{
				TemplateParameterSubstitution symbol_1083 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1083.setFormal(symbol_123);	
				symbol_1083.setActual(symbol_51);	
				symbol_1082.getParameterSubstitutions().add(symbol_1083);
			}
			symbol_271.getTemplateBindings().add(symbol_1082);
		}
		symbol_271.getSuperClasses().add(symbol_196); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_271.getSuperClasses().add(symbol_283); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_271); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		symbol_272.setName("Set");
		symbol_272.setElementType(symbol_91);
		symbol_272.setUnspecializedElement(symbol_121);
		{
			TemplateBinding symbol_1084 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1084.setSignature(symbol_122);
			{
				TemplateParameterSubstitution symbol_1085 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1085.setFormal(symbol_123);	
				symbol_1085.setActual(symbol_91);	
				symbol_1084.getParameterSubstitutions().add(symbol_1085);
			}
			symbol_272.getTemplateBindings().add(symbol_1084);
		}
		symbol_272.getSuperClasses().add(symbol_197); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		symbol_272.getSuperClasses().add(symbol_286); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		symbol_132.getOwnedTypes().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_273.setName("Set");
		symbol_273.setElementType(symbol_96);
		symbol_273.setUnspecializedElement(symbol_121);
		{
			TemplateBinding symbol_1086 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1086.setSignature(symbol_122);
			{
				TemplateParameterSubstitution symbol_1087 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1087.setFormal(symbol_123);	
				symbol_1087.setActual(symbol_96);	
				symbol_1086.getParameterSubstitutions().add(symbol_1087);
			}
			symbol_273.getTemplateBindings().add(symbol_1086);
		}
		symbol_273.getSuperClasses().add(symbol_198); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_273.getSuperClasses().add(symbol_288); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_273); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_274.setName("Set");
		symbol_274.setElementType(symbol_104);
		symbol_274.setUnspecializedElement(symbol_121);
		{
			TemplateBinding symbol_1088 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1088.setSignature(symbol_122);
			{
				TemplateParameterSubstitution symbol_1089 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1089.setFormal(symbol_123);	
				symbol_1089.setActual(symbol_104);	
				symbol_1088.getParameterSubstitutions().add(symbol_1089);
			}
			symbol_274.getTemplateBindings().add(symbol_1088);
		}
		symbol_274.getSuperClasses().add(symbol_204); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_274.getSuperClasses().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_274); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_275.setName("Set");
		symbol_275.setElementType(symbol_127);
		symbol_275.setUnspecializedElement(symbol_121);
		{
			TemplateBinding symbol_1090 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1090.setSignature(symbol_122);
			{
				TemplateParameterSubstitution symbol_1091 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1091.setFormal(symbol_123);	
				symbol_1091.setActual(symbol_127);	
				symbol_1090.getParameterSubstitutions().add(symbol_1091);
			}
			symbol_275.getTemplateBindings().add(symbol_1090);
		}
		symbol_275.getSuperClasses().add(symbol_205); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		symbol_275.getSuperClasses().add(symbol_297); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		symbol_132.getOwnedTypes().add(symbol_275); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_276.setName("Set");
		symbol_276.setElementType(symbol_131);
		symbol_276.setUnspecializedElement(symbol_121);
		{
			TemplateBinding symbol_1092 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1092.setSignature(symbol_122);
			{
				TemplateParameterSubstitution symbol_1093 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1093.setFormal(symbol_123);	
				symbol_1093.setActual(symbol_131);	
				symbol_1092.getParameterSubstitutions().add(symbol_1093);
			}
			symbol_276.getTemplateBindings().add(symbol_1092);
		}
		symbol_276.getSuperClasses().add(symbol_207); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_276.getSuperClasses().add(symbol_300); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_276); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_277.setName("UniqueCollection");
		symbol_277.setElementType(symbol_174);
		symbol_277.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1094 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1094.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1095 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1095.setFormal(symbol_130);	
				symbol_1095.setActual(symbol_168);	
				symbol_1094.getParameterSubstitutions().add(symbol_1095);
			}
			symbol_277.getTemplateBindings().add(symbol_1094);
		}
		symbol_277.getSuperClasses().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_132.getOwnedTypes().add(symbol_277); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_278.setName("UniqueCollection");
		symbol_278.setElementType(symbol_174);
		symbol_278.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1096 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1096.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1097 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1097.setFormal(symbol_130);	
				symbol_1097.setActual(symbol_168);	
				symbol_1096.getParameterSubstitutions().add(symbol_1097);
			}
			symbol_278.getTemplateBindings().add(symbol_1096);
		}
		symbol_278.getSuperClasses().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_132.getOwnedTypes().add(symbol_278); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_279.setName("UniqueCollection");
		symbol_279.setElementType(symbol_26);
		symbol_279.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1098 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1098.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1099 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1099.setFormal(symbol_130);	
				symbol_1099.setActual(symbol_26);	
				symbol_1098.getParameterSubstitutions().add(symbol_1099);
			}
			symbol_279.getTemplateBindings().add(symbol_1098);
		}
		symbol_279.getSuperClasses().add(symbol_220); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_279); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_280.setName("UniqueCollection");
		symbol_280.setElementType(symbol_26);
		symbol_280.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1100 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1100.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1101 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1101.setFormal(symbol_130);	
				symbol_1101.setActual(symbol_26);	
				symbol_1100.getParameterSubstitutions().add(symbol_1101);
			}
			symbol_280.getTemplateBindings().add(symbol_1100);
		}
		symbol_280.getSuperClasses().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_280); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_281.setName("UniqueCollection");
		symbol_281.setElementType(symbol_26);
		symbol_281.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1102 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1102.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1103 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1103.setFormal(symbol_130);	
				symbol_1103.setActual(symbol_26);	
				symbol_1102.getParameterSubstitutions().add(symbol_1103);
			}
			symbol_281.getTemplateBindings().add(symbol_1102);
		}
		symbol_281.getSuperClasses().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_281); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_282.setName("UniqueCollection");
		symbol_282.setElementType(symbol_26);
		symbol_282.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1104 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1104.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1105 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1105.setFormal(symbol_130);	
				symbol_1105.setActual(symbol_26);	
				symbol_1104.getParameterSubstitutions().add(symbol_1105);
			}
			symbol_282.getTemplateBindings().add(symbol_1104);
		}
		symbol_282.getSuperClasses().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_282); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_283.setName("UniqueCollection");
		symbol_283.setElementType(symbol_51);
		symbol_283.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1106 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1106.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1107 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1107.setFormal(symbol_130);	
				symbol_1107.setActual(symbol_51);	
				symbol_1106.getParameterSubstitutions().add(symbol_1107);
			}
			symbol_283.getTemplateBindings().add(symbol_1106);
		}
		symbol_283.getSuperClasses().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_283); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_284.setName("UniqueCollection");
		symbol_284.setElementType(symbol_79);
		symbol_284.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1108 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1108.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1109 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1109.setFormal(symbol_130);	
				symbol_1109.setActual(symbol_79);	
				symbol_1108.getParameterSubstitutions().add(symbol_1109);
			}
			symbol_284.getTemplateBindings().add(symbol_1108);
		}
		symbol_284.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		symbol_132.getOwnedTypes().add(symbol_284); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_285.setName("UniqueCollection");
		symbol_285.setElementType(symbol_80);
		symbol_285.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1110 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1110.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1111 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1111.setFormal(symbol_130);	
				symbol_1111.setActual(symbol_80);	
				symbol_1110.getParameterSubstitutions().add(symbol_1111);
			}
			symbol_285.getTemplateBindings().add(symbol_1110);
		}
		symbol_285.getSuperClasses().add(symbol_234); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		symbol_132.getOwnedTypes().add(symbol_285); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		symbol_286.setName("UniqueCollection");
		symbol_286.setElementType(symbol_91);
		symbol_286.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1112 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1112.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1113 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1113.setFormal(symbol_130);	
				symbol_1113.setActual(symbol_91);	
				symbol_1112.getParameterSubstitutions().add(symbol_1113);
			}
			symbol_286.getTemplateBindings().add(symbol_1112);
		}
		symbol_286.getSuperClasses().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		symbol_132.getOwnedTypes().add(symbol_286); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_287.setName("UniqueCollection");
		symbol_287.setElementType(symbol_96);
		symbol_287.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1114 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1114.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1115 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1115.setFormal(symbol_130);	
				symbol_1115.setActual(symbol_96);	
				symbol_1114.getParameterSubstitutions().add(symbol_1115);
			}
			symbol_287.getTemplateBindings().add(symbol_1114);
		}
		symbol_287.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_287); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_288.setName("UniqueCollection");
		symbol_288.setElementType(symbol_96);
		symbol_288.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1116 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1116.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1117 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1117.setFormal(symbol_130);	
				symbol_1117.setActual(symbol_96);	
				symbol_1116.getParameterSubstitutions().add(symbol_1117);
			}
			symbol_288.getTemplateBindings().add(symbol_1116);
		}
		symbol_288.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_288); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_289.setName("UniqueCollection");
		symbol_289.setElementType(symbol_96);
		symbol_289.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1118 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1118.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1119 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1119.setFormal(symbol_130);	
				symbol_1119.setActual(symbol_96);	
				symbol_1118.getParameterSubstitutions().add(symbol_1119);
			}
			symbol_289.getTemplateBindings().add(symbol_1118);
		}
		symbol_289.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_289); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_290.setName("UniqueCollection");
		symbol_290.setElementType(symbol_96);
		symbol_290.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1120 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1120.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1121 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1121.setFormal(symbol_130);	
				symbol_1121.setActual(symbol_96);	
				symbol_1120.getParameterSubstitutions().add(symbol_1121);
			}
			symbol_290.getTemplateBindings().add(symbol_1120);
		}
		symbol_290.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_290); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_291.setName("UniqueCollection");
		symbol_291.setElementType(symbol_96);
		symbol_291.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1122 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1122.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1123 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1123.setFormal(symbol_130);	
				symbol_1123.setActual(symbol_96);	
				symbol_1122.getParameterSubstitutions().add(symbol_1123);
			}
			symbol_291.getTemplateBindings().add(symbol_1122);
		}
		symbol_291.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_292.setName("UniqueCollection");
		symbol_292.setElementType(symbol_96);
		symbol_292.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1124 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1124.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1125 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1125.setFormal(symbol_130);	
				symbol_1125.setActual(symbol_96);	
				symbol_1124.getParameterSubstitutions().add(symbol_1125);
			}
			symbol_292.getTemplateBindings().add(symbol_1124);
		}
		symbol_292.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_132.getOwnedTypes().add(symbol_292); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_293.setName("UniqueCollection");
		symbol_293.setElementType(symbol_107);
		symbol_293.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1126 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1126.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1127 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1127.setFormal(symbol_130);	
				symbol_1127.setActual(symbol_107);	
				symbol_1126.getParameterSubstitutions().add(symbol_1127);
			}
			symbol_293.getTemplateBindings().add(symbol_1126);
		}
		symbol_293.getSuperClasses().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		symbol_132.getOwnedTypes().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_294.setName("UniqueCollection");
		symbol_294.setElementType(symbol_104);
		symbol_294.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1128 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1128.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1129 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1129.setFormal(symbol_130);	
				symbol_1129.setActual(symbol_104);	
				symbol_1128.getParameterSubstitutions().add(symbol_1129);
			}
			symbol_294.getTemplateBindings().add(symbol_1128);
		}
		symbol_294.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_295.setName("UniqueCollection");
		symbol_295.setElementType(symbol_111);
		symbol_295.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1130 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1130.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1131 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1131.setFormal(symbol_130);	
				symbol_1131.setActual(symbol_111);	
				symbol_1130.getParameterSubstitutions().add(symbol_1131);
			}
			symbol_295.getTemplateBindings().add(symbol_1130);
		}
		symbol_295.getSuperClasses().add(symbol_243); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_295); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_296.setName("UniqueCollection");
		symbol_296.setElementType(symbol_111);
		symbol_296.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1132 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1132.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1133 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1133.setFormal(symbol_130);	
				symbol_1133.setActual(symbol_111);	
				symbol_1132.getParameterSubstitutions().add(symbol_1133);
			}
			symbol_296.getTemplateBindings().add(symbol_1132);
		}
		symbol_296.getSuperClasses().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_297.setName("UniqueCollection");
		symbol_297.setElementType(symbol_127);
		symbol_297.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1134 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1134.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1135 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1135.setFormal(symbol_130);	
				symbol_1135.setActual(symbol_127);	
				symbol_1134.getParameterSubstitutions().add(symbol_1135);
			}
			symbol_297.getTemplateBindings().add(symbol_1134);
		}
		symbol_297.getSuperClasses().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		symbol_132.getOwnedTypes().add(symbol_297); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_298.setName("UniqueCollection");
		symbol_298.setElementType(symbol_124);
		symbol_298.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1136 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1136.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1137 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1137.setFormal(symbol_130);	
				symbol_1137.setActual(symbol_124);	
				symbol_1136.getParameterSubstitutions().add(symbol_1137);
			}
			symbol_298.getTemplateBindings().add(symbol_1136);
		}
		symbol_298.getSuperClasses().add(symbol_245); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_298); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_299.setName("UniqueCollection");
		symbol_299.setElementType(symbol_131);
		symbol_299.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1138 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1138.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1139 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1139.setFormal(symbol_130);	
				symbol_1139.setActual(symbol_131);	
				symbol_1138.getParameterSubstitutions().add(symbol_1139);
			}
			symbol_299.getTemplateBindings().add(symbol_1138);
		}
		symbol_299.getSuperClasses().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_300.setName("UniqueCollection");
		symbol_300.setElementType(symbol_131);
		symbol_300.setUnspecializedElement(symbol_128);
		{
			TemplateBinding symbol_1140 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1140.setSignature(symbol_129);
			{
				TemplateParameterSubstitution symbol_1141 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1141.setFormal(symbol_130);	
				symbol_1141.setActual(symbol_131);	
				symbol_1140.getParameterSubstitutions().add(symbol_1141);
			}
			symbol_300.getTemplateBindings().add(symbol_1140);
		}
		symbol_300.getSuperClasses().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_132.getOwnedTypes().add(symbol_300); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::$$ http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		//
		symbol_301.setName("$$");
		
		symbol_132.getOwnedTypes().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		
		symbol_0.getNestedPackages().add(symbol_132);
		return symbol_0;
	}
}
