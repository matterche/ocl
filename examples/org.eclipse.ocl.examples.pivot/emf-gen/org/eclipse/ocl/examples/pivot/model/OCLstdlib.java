/**
 * <copyright>
 *
 * Copyright (c) 2010,2012 E.D.Willink and others.
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
			INSTANCE = new OCLstdlib(STDLIB_URI, "ocl", "ocl", "http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib");
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
	
	/**
	 *	Construct the standard OCL Standard Library with specified resource URI,
	 *  and package name, prefix and namespace URI. Construction normally occurs
	 *  through the default Loader, but alternate construction may be needed when
	 *	using a custom pivot model that requires a matching library URI.
	 */
	public OCLstdlib(String uri, String name, String nsPrefix, String nsURI) {
		super(URI.createURI(uri));
		getContents().add(create(name, nsPrefix, nsURI));
	}

	/**
	 *	Create and return a package-of-packages-of-types pivot model of the OCL standard library.
	 *  This static definition auto-generated from /org.eclipse.ocl.examples.library/model/OCL-2.4.oclstdlib
	 *  is used as the default when no overriding copy is registered. 
	 */
	public static Library create(String name, String nsPrefix, String nsURI)
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
		
		BagType symbol_206 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
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
		
		SequenceType symbol_269 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		SequenceType symbol_270 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		SequenceType symbol_271 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		SetType symbol_272 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		SetType symbol_273 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		SetType symbol_274 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		SetType symbol_275 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		SetType symbol_276 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
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
		
		CollectionType symbol_299 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_300 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_301 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_302 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		CollectionType symbol_303 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		AnyType symbol_304 = PivotFactory.eINSTANCE.createAnyType(); // u_r_i:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		
		

		symbol_0.setName(name);
		symbol_0.setNsPrefix(nsPrefix);
		symbol_0.setNsURI(nsURI);
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
			Operation symbol_305 = PivotFactory.eINSTANCE.createOperation(); // Boolean!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_305.setName("<>");
			symbol_305.setType(symbol_11);  // Boolean
			
			Parameter symbol_306 = PivotFactory.eINSTANCE.createParameter(); // Boolean!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_306.setName("object2");
			symbol_306.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_305.getOwnedParameters().add(symbol_306);
			symbol_305.setPrecedence(symbol_6);
			symbol_305.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_305.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_307 = PivotFactory.eINSTANCE.createComment();
				symbol_307.setBody("Returns oclText[true] if the logical value of oclText[self] is the not same as the numeric value of object2, oclText[false] otherwise.");
				symbol_305.getOwnedComments().add(symbol_307);
			}
			
			symbol_11.getOwnedOperations().add(symbol_305);
		}
		{	// ocl::Boolean::=()
			Operation symbol_308 = PivotFactory.eINSTANCE.createOperation(); // Boolean!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_308.setName("=");
			symbol_308.setType(symbol_11);  // Boolean
			
			Parameter symbol_309 = PivotFactory.eINSTANCE.createParameter(); // Boolean!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_309.setName("object2");
			symbol_309.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_308.getOwnedParameters().add(symbol_309);
			symbol_308.setPrecedence(symbol_6);
			symbol_308.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_308.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_310 = PivotFactory.eINSTANCE.createComment();
				symbol_310.setBody("Returns oclText[true] if the logical value of oclText[self] is the same as the numeric value of object2, oclText[false] otherwise.");
				symbol_308.getOwnedComments().add(symbol_310);
			}
			
			symbol_11.getOwnedOperations().add(symbol_308);
		}
		{	// ocl::Boolean::allInstances()
			Operation symbol_311 = PivotFactory.eINSTANCE.createOperation(); // Boolean!allInstances()
			symbol_311.setName("allInstances");
			symbol_311.setType(symbol_276);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_311.setIsStatic(true);
			symbol_311.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation");
			symbol_311.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
			{
				Comment symbol_312 = PivotFactory.eINSTANCE.createComment();
				symbol_312.setBody("Returns oclText[Set{false, true}].");
				symbol_311.getOwnedComments().add(symbol_312);
			}
			
			symbol_11.getOwnedOperations().add(symbol_311);
		}
		{	// ocl::Boolean::and()
			Operation symbol_313 = PivotFactory.eINSTANCE.createOperation(); // Boolean!and(Boolean)
			symbol_313.setName("and");
			symbol_313.setType(symbol_11);  // Boolean
			
			Parameter symbol_314 = PivotFactory.eINSTANCE.createParameter(); // Boolean!and(Boolean)!b
			symbol_314.setName("b");
			symbol_314.setType(symbol_11);  // Boolean
			
			
			symbol_313.getOwnedParameters().add(symbol_314);
			symbol_313.setPrecedence(symbol_7);
			symbol_313.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanAndOperation");
			symbol_313.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE);
			{
				Comment symbol_315 = PivotFactory.eINSTANCE.createComment();
				symbol_315.setBody("True if both b1 and b are oclText[true].");
				symbol_313.getOwnedComments().add(symbol_315);
			}
			
			symbol_11.getOwnedOperations().add(symbol_313);
		}
		{	// ocl::Boolean::implies()
			Operation symbol_316 = PivotFactory.eINSTANCE.createOperation(); // Boolean!implies(Boolean)
			symbol_316.setName("implies");
			symbol_316.setType(symbol_11);  // Boolean
			
			Parameter symbol_317 = PivotFactory.eINSTANCE.createParameter(); // Boolean!implies(Boolean)!b
			symbol_317.setName("b");
			symbol_317.setType(symbol_11);  // Boolean
			
			
			symbol_316.getOwnedParameters().add(symbol_317);
			symbol_316.setPrecedence(symbol_10);
			symbol_316.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation");
			symbol_316.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE);
			{
				Comment symbol_318 = PivotFactory.eINSTANCE.createComment();
				symbol_318.setBody("True if oclText[self] is oclText[false], or if oclText[self] is oclText[true] and b is oclText[true].");
				symbol_316.getOwnedComments().add(symbol_318);
			}
			
			symbol_11.getOwnedOperations().add(symbol_316);
		}
		{	// ocl::Boolean::not()
			Operation symbol_319 = PivotFactory.eINSTANCE.createOperation(); // Boolean!not()
			symbol_319.setName("not");
			symbol_319.setType(symbol_11);  // Boolean
			
			symbol_319.setPrecedence(symbol_2);
			symbol_319.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanNotOperation");
			symbol_319.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
			{
				Comment symbol_320 = PivotFactory.eINSTANCE.createComment();
				symbol_320.setBody("True if oclText[self] is oclText[false].");
				symbol_319.getOwnedComments().add(symbol_320);
			}
			
			symbol_11.getOwnedOperations().add(symbol_319);
		}
		{	// ocl::Boolean::or()
			Operation symbol_321 = PivotFactory.eINSTANCE.createOperation(); // Boolean!or(Boolean)
			symbol_321.setName("or");
			symbol_321.setType(symbol_11);  // Boolean
			
			Parameter symbol_322 = PivotFactory.eINSTANCE.createParameter(); // Boolean!or(Boolean)!b
			symbol_322.setName("b");
			symbol_322.setType(symbol_11);  // Boolean
			
			
			symbol_321.getOwnedParameters().add(symbol_322);
			symbol_321.setPrecedence(symbol_8);
			symbol_321.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanOrOperation");
			symbol_321.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE);
			{
				Comment symbol_323 = PivotFactory.eINSTANCE.createComment();
				symbol_323.setBody("True if either oclText[self] or b is oclText[true].");
				symbol_321.getOwnedComments().add(symbol_323);
			}
			
			symbol_11.getOwnedOperations().add(symbol_321);
		}
		{	// ocl::Boolean::toString()
			Operation symbol_324 = PivotFactory.eINSTANCE.createOperation(); // Boolean!toString()
			symbol_324.setName("toString");
			symbol_324.setType(symbol_14);  // String
			
			symbol_324.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_324.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_325 = PivotFactory.eINSTANCE.createComment();
				symbol_325.setBody("Converts oclText[self] to a string value.");
				symbol_324.getOwnedComments().add(symbol_325);
			}
			
			symbol_11.getOwnedOperations().add(symbol_324);
		}
		{	// ocl::Boolean::xor()
			Operation symbol_326 = PivotFactory.eINSTANCE.createOperation(); // Boolean!xor(Boolean)
			symbol_326.setName("xor");
			symbol_326.setType(symbol_11);  // Boolean
			
			Parameter symbol_327 = PivotFactory.eINSTANCE.createParameter(); // Boolean!xor(Boolean)!b
			symbol_327.setName("b");
			symbol_327.setType(symbol_11);  // Boolean
			
			
			symbol_326.getOwnedParameters().add(symbol_327);
			symbol_326.setPrecedence(symbol_9);
			symbol_326.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanXorOperation");
			symbol_326.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE);
			{
				Comment symbol_328 = PivotFactory.eINSTANCE.createComment();
				symbol_328.setBody("True if either oclText[self] or b is oclText[true], but not both.");
				symbol_326.getOwnedComments().add(symbol_328);
			}
			
			symbol_11.getOwnedOperations().add(symbol_326);
		}
		{
			Comment symbol_329 = PivotFactory.eINSTANCE.createComment();
			symbol_329.setBody("The standard type Boolean represents the common true/false values.\nBoolean is itself an instance of the metatype PrimitiveType (from UML).");
			symbol_11.getOwnedComments().add(symbol_329);
		}
		
		symbol_0.getOwnedTypes().add(symbol_11); // Boolean
		//
		// ocl::Integer Integer
		//
		symbol_12.setName("Integer");
		symbol_12.getSuperClasses().add(symbol_13); // Real
		{	// ocl::Integer::*()
			Operation symbol_330 = PivotFactory.eINSTANCE.createOperation(); // Integer!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_330.setName("*");
			symbol_330.setType(symbol_12);  // Integer
			
			Parameter symbol_331 = PivotFactory.eINSTANCE.createParameter(); // Integer!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_331.setName("i");
			symbol_331.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_330.getOwnedParameters().add(symbol_331);
			symbol_330.setPrecedence(symbol_3);
			symbol_330.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericTimesOperation");
			symbol_330.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			{
				Comment symbol_332 = PivotFactory.eINSTANCE.createComment();
				symbol_332.setBody("The value of the multiplication of oclText[self] and i.");
				symbol_330.getOwnedComments().add(symbol_332);
			}
			
			symbol_12.getOwnedOperations().add(symbol_330);
		}
		{	// ocl::Integer::+()
			Operation symbol_333 = PivotFactory.eINSTANCE.createOperation(); // Integer!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_333.setName("+");
			symbol_333.setType(symbol_12);  // Integer
			
			Parameter symbol_334 = PivotFactory.eINSTANCE.createParameter(); // Integer!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_334.setName("i");
			symbol_334.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_333.getOwnedParameters().add(symbol_334);
			symbol_333.setPrecedence(symbol_4);
			symbol_333.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerPlusOperation");
			symbol_333.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerPlusOperation.INSTANCE);
			{
				Comment symbol_335 = PivotFactory.eINSTANCE.createComment();
				symbol_335.setBody("The value of the addition of oclText[self] and i.");
				symbol_333.getOwnedComments().add(symbol_335);
			}
			
			symbol_12.getOwnedOperations().add(symbol_333);
		}
		{	// ocl::Integer::-()
			Operation symbol_336 = PivotFactory.eINSTANCE.createOperation(); // Integer!-()
			symbol_336.setName("-");
			symbol_336.setType(symbol_12);  // Integer
			
			symbol_336.setPrecedence(symbol_2);
			symbol_336.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericNegateOperation");
			symbol_336.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			{
				Comment symbol_337 = PivotFactory.eINSTANCE.createComment();
				symbol_337.setBody("The negative value of oclText[self].");
				symbol_336.getOwnedComments().add(symbol_337);
			}
			
			symbol_12.getOwnedOperations().add(symbol_336);
		}
		{	// ocl::Integer::-()
			Operation symbol_338 = PivotFactory.eINSTANCE.createOperation(); // Integer!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_338.setName("-");
			symbol_338.setType(symbol_12);  // Integer
			
			Parameter symbol_339 = PivotFactory.eINSTANCE.createParameter(); // Integer!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_339.setName("i");
			symbol_339.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_338.getOwnedParameters().add(symbol_339);
			symbol_338.setPrecedence(symbol_4);
			symbol_338.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerMinusOperation");
			symbol_338.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerMinusOperation.INSTANCE);
			{
				Comment symbol_340 = PivotFactory.eINSTANCE.createComment();
				symbol_340.setBody("The value of the subtraction of i from oclText[self].");
				symbol_338.getOwnedComments().add(symbol_340);
			}
			
			symbol_12.getOwnedOperations().add(symbol_338);
		}
		{	// ocl::Integer::/()
			Operation symbol_341 = PivotFactory.eINSTANCE.createOperation(); // Integer!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_341.setName("/");
			symbol_341.setType(symbol_13);  // Real
			
			Parameter symbol_342 = PivotFactory.eINSTANCE.createParameter(); // Integer!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_342.setName("i");
			symbol_342.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_341.getOwnedParameters().add(symbol_342);
			symbol_341.setPrecedence(symbol_3);
			symbol_341.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivideOperation");
			symbol_341.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			{
				Comment symbol_343 = PivotFactory.eINSTANCE.createComment();
				symbol_343.setBody("The value of oclText[self] divided by i.\nEvaluates to oclText[invalid] if r is equal to zero.");
				symbol_341.getOwnedComments().add(symbol_343);
			}
			
			symbol_12.getOwnedOperations().add(symbol_341);
		}
		{	// ocl::Integer::abs()
			Operation symbol_344 = PivotFactory.eINSTANCE.createOperation(); // Integer!abs()
			symbol_344.setName("abs");
			symbol_344.setType(symbol_12);  // Integer
			
			symbol_344.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericAbsOperation");
			symbol_344.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			{
				Comment symbol_345 = PivotFactory.eINSTANCE.createComment();
				symbol_345.setBody("The absolute value of oclText[self].");
				symbol_344.getOwnedComments().add(symbol_345);
			}
			
			symbol_12.getOwnedOperations().add(symbol_344);
		}
		{	// ocl::Integer::compareTo()
			Operation symbol_346 = PivotFactory.eINSTANCE.createOperation(); // Integer!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_346.setName("compareTo");
			symbol_346.setType(symbol_12);  // Integer
			
			Parameter symbol_347 = PivotFactory.eINSTANCE.createParameter(); // Integer!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_347.setName("that");
			symbol_347.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_346.getOwnedParameters().add(symbol_347);
			symbol_346.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation");
			symbol_346.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation.INSTANCE);
			{
				Comment symbol_348 = PivotFactory.eINSTANCE.createComment();
				symbol_348.setBody("The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
				symbol_346.getOwnedComments().add(symbol_348);
			}
			
			symbol_12.getOwnedOperations().add(symbol_346);
		}
		{	// ocl::Integer::div()
			Operation symbol_349 = PivotFactory.eINSTANCE.createOperation(); // Integer!div(Integer)
			symbol_349.setName("div");
			symbol_349.setType(symbol_12);  // Integer
			
			Parameter symbol_350 = PivotFactory.eINSTANCE.createParameter(); // Integer!div(Integer)!i
			symbol_350.setName("i");
			symbol_350.setType(symbol_12);  // Integer
			
			
			symbol_349.getOwnedParameters().add(symbol_350);
			symbol_349.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivOperation");
			symbol_349.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE);
			{
				Comment symbol_351 = PivotFactory.eINSTANCE.createComment();
				symbol_351.setBody("The number of times that i fits completely within oclText[self].");
				symbol_349.getOwnedComments().add(symbol_351);
			}
			
			symbol_12.getOwnedOperations().add(symbol_349);
		}
		{	// ocl::Integer::max()
			Operation symbol_352 = PivotFactory.eINSTANCE.createOperation(); // Integer!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_352.setName("max");
			symbol_352.setType(symbol_12);  // Integer
			
			Parameter symbol_353 = PivotFactory.eINSTANCE.createParameter(); // Integer!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_353.setName("i");
			symbol_353.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_352.getOwnedParameters().add(symbol_353);
			symbol_352.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMaxOperation");
			symbol_352.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			{
				Comment symbol_354 = PivotFactory.eINSTANCE.createComment();
				symbol_354.setBody("The maximum of oclText[self] an i.");
				symbol_352.getOwnedComments().add(symbol_354);
			}
			
			symbol_12.getOwnedOperations().add(symbol_352);
		}
		{	// ocl::Integer::min()
			Operation symbol_355 = PivotFactory.eINSTANCE.createOperation(); // Integer!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_355.setName("min");
			symbol_355.setType(symbol_12);  // Integer
			
			Parameter symbol_356 = PivotFactory.eINSTANCE.createParameter(); // Integer!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_356.setName("i");
			symbol_356.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_355.getOwnedParameters().add(symbol_356);
			symbol_355.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMinOperation");
			symbol_355.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			{
				Comment symbol_357 = PivotFactory.eINSTANCE.createComment();
				symbol_357.setBody("The minimum of oclText[self] an i.");
				symbol_355.getOwnedComments().add(symbol_357);
			}
			
			symbol_12.getOwnedOperations().add(symbol_355);
		}
		{	// ocl::Integer::mod()
			Operation symbol_358 = PivotFactory.eINSTANCE.createOperation(); // Integer!mod(Integer)
			symbol_358.setName("mod");
			symbol_358.setType(symbol_12);  // Integer
			
			Parameter symbol_359 = PivotFactory.eINSTANCE.createParameter(); // Integer!mod(Integer)!i
			symbol_359.setName("i");
			symbol_359.setType(symbol_12);  // Integer
			
			
			symbol_358.getOwnedParameters().add(symbol_359);
			symbol_358.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericModOperation");
			symbol_358.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE);
			{
				Comment symbol_360 = PivotFactory.eINSTANCE.createComment();
				symbol_360.setBody("The result is oclText[self] modulo i.");
				symbol_358.getOwnedComments().add(symbol_360);
			}
			
			symbol_12.getOwnedOperations().add(symbol_358);
		}
		{	// ocl::Integer::toString()
			Operation symbol_361 = PivotFactory.eINSTANCE.createOperation(); // Integer!toString()
			symbol_361.setName("toString");
			symbol_361.setType(symbol_14);  // String
			
			symbol_361.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_361.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_362 = PivotFactory.eINSTANCE.createComment();
				symbol_362.setBody("Converts oclText[self] to a string value.");
				symbol_361.getOwnedComments().add(symbol_362);
			}
			
			symbol_12.getOwnedOperations().add(symbol_361);
		}
		{
			Comment symbol_363 = PivotFactory.eINSTANCE.createComment();
			symbol_363.setBody("The standard type Integer represents the mathematical concept of integer.\nNote that UnlimitedNatural is a subclass of Integer, so for each parameter of type Integer,\nyou can use an unlimited natural as the actual parameter.\nInteger is itself an instance of the metatype PrimitiveType (from UML).");
			symbol_12.getOwnedComments().add(symbol_363);
		}
		
		symbol_0.getOwnedTypes().add(symbol_12); // Integer
		//
		// ocl::Real Real
		//
		symbol_13.setName("Real");
		symbol_13.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		symbol_13.getSuperClasses().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		{	// ocl::Real::*()
			Operation symbol_364 = PivotFactory.eINSTANCE.createOperation(); // Real!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_364.setName("*");
			symbol_364.setType(symbol_13);  // Real
			
			Parameter symbol_365 = PivotFactory.eINSTANCE.createParameter(); // Real!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_365.setName("r");
			symbol_365.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_364.getOwnedParameters().add(symbol_365);
			symbol_364.setPrecedence(symbol_3);
			symbol_364.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericTimesOperation");
			symbol_364.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			{
				Comment symbol_366 = PivotFactory.eINSTANCE.createComment();
				symbol_366.setBody("The value of the multiplication of oclText[self] and r.");
				symbol_364.getOwnedComments().add(symbol_366);
			}
			
			symbol_13.getOwnedOperations().add(symbol_364);
		}
		{	// ocl::Real::+()
			Operation symbol_367 = PivotFactory.eINSTANCE.createOperation(); // Real!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_367.setName("+");
			symbol_367.setType(symbol_13);  // Real
			
			Parameter symbol_368 = PivotFactory.eINSTANCE.createParameter(); // Real!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_368.setName("r");
			symbol_368.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_367.getOwnedParameters().add(symbol_368);
			symbol_367.setPrecedence(symbol_4);
			symbol_367.setImplementationClass("org.eclipse.ocl.examples.library.real.RealPlusOperation");
			symbol_367.setImplementation(org.eclipse.ocl.examples.library.real.RealPlusOperation.INSTANCE);
			{
				Comment symbol_369 = PivotFactory.eINSTANCE.createComment();
				symbol_369.setBody("The value of the addition of oclText[self] and r.");
				symbol_367.getOwnedComments().add(symbol_369);
			}
			
			symbol_13.getOwnedOperations().add(symbol_367);
		}
		{	// ocl::Real::-()
			Operation symbol_370 = PivotFactory.eINSTANCE.createOperation(); // Real!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_370.setName("-");
			symbol_370.setType(symbol_13);  // Real
			
			Parameter symbol_371 = PivotFactory.eINSTANCE.createParameter(); // Real!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_371.setName("r");
			symbol_371.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_370.getOwnedParameters().add(symbol_371);
			symbol_370.setPrecedence(symbol_4);
			symbol_370.setImplementationClass("org.eclipse.ocl.examples.library.real.RealMinusOperation");
			symbol_370.setImplementation(org.eclipse.ocl.examples.library.real.RealMinusOperation.INSTANCE);
			{
				Comment symbol_372 = PivotFactory.eINSTANCE.createComment();
				symbol_372.setBody("The value of the subtraction of r from oclText[self].");
				symbol_370.getOwnedComments().add(symbol_372);
			}
			
			symbol_13.getOwnedOperations().add(symbol_370);
		}
		{	// ocl::Real::-()
			Operation symbol_373 = PivotFactory.eINSTANCE.createOperation(); // Real!-()
			symbol_373.setName("-");
			symbol_373.setType(symbol_13);  // Real
			
			symbol_373.setPrecedence(symbol_2);
			symbol_373.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericNegateOperation");
			symbol_373.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			{
				Comment symbol_374 = PivotFactory.eINSTANCE.createComment();
				symbol_374.setBody("The negative value of oclText[self].");
				symbol_373.getOwnedComments().add(symbol_374);
			}
			
			symbol_13.getOwnedOperations().add(symbol_373);
		}
		{	// ocl::Real::/()
			Operation symbol_375 = PivotFactory.eINSTANCE.createOperation(); // Real!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_375.setName("/");
			symbol_375.setType(symbol_13);  // Real
			
			Parameter symbol_376 = PivotFactory.eINSTANCE.createParameter(); // Real!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_376.setName("r");
			symbol_376.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_375.getOwnedParameters().add(symbol_376);
			symbol_375.setPrecedence(symbol_3);
			symbol_375.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivideOperation");
			symbol_375.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			{
				Comment symbol_377 = PivotFactory.eINSTANCE.createComment();
				symbol_377.setBody("The value of oclText[self] divided by r. Evaluates to oclText[invalid] if r is equal to zero.");
				symbol_375.getOwnedComments().add(symbol_377);
			}
			
			symbol_13.getOwnedOperations().add(symbol_375);
		}
		{	// ocl::Real::<()
			Operation symbol_378 = PivotFactory.eINSTANCE.createOperation(); // Real!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_378.setName("<");
			symbol_378.setType(symbol_11);  // Boolean
			
			Parameter symbol_379 = PivotFactory.eINSTANCE.createParameter(); // Real!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_379.setName("r");
			symbol_379.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_378.getOwnedParameters().add(symbol_379);
			symbol_378.setPrecedence(symbol_5);
			symbol_378.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation");
			symbol_378.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE);
			{
				Comment symbol_380 = PivotFactory.eINSTANCE.createComment();
				symbol_380.setBody("True if oclText[self] is less than r.");
				symbol_378.getOwnedComments().add(symbol_380);
			}
			
			symbol_13.getOwnedOperations().add(symbol_378);
		}
		{	// ocl::Real::<=()
			Operation symbol_381 = PivotFactory.eINSTANCE.createOperation(); // Real!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_381.setName("<=");
			symbol_381.setType(symbol_11);  // Boolean
			
			Parameter symbol_382 = PivotFactory.eINSTANCE.createParameter(); // Real!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_382.setName("r");
			symbol_382.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_381.getOwnedParameters().add(symbol_382);
			symbol_381.setPrecedence(symbol_5);
			symbol_381.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation");
			symbol_381.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE);
			{
				Comment symbol_383 = PivotFactory.eINSTANCE.createComment();
				symbol_383.setBody("True if oclText[self] is less than or equal to r.");
				symbol_381.getOwnedComments().add(symbol_383);
			}
			
			symbol_13.getOwnedOperations().add(symbol_381);
		}
		{	// ocl::Real::<>()
			Operation symbol_384 = PivotFactory.eINSTANCE.createOperation(); // Real!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_384.setName("<>");
			symbol_384.setType(symbol_11);  // Boolean
			
			Parameter symbol_385 = PivotFactory.eINSTANCE.createParameter(); // Real!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_385.setName("object2");
			symbol_385.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_384.getOwnedParameters().add(symbol_385);
			symbol_384.setPrecedence(symbol_6);
			symbol_384.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_384.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_386 = PivotFactory.eINSTANCE.createComment();
				symbol_386.setBody("Returns oclText[true] if the numeric value of oclText[self] is the not the same as the numeric value of object2, oclText[false] otherwise.");
				symbol_384.getOwnedComments().add(symbol_386);
			}
			
			symbol_13.getOwnedOperations().add(symbol_384);
		}
		{	// ocl::Real::=()
			Operation symbol_387 = PivotFactory.eINSTANCE.createOperation(); // Real!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_387.setName("=");
			symbol_387.setType(symbol_11);  // Boolean
			
			Parameter symbol_388 = PivotFactory.eINSTANCE.createParameter(); // Real!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_388.setName("object2");
			symbol_388.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_387.getOwnedParameters().add(symbol_388);
			symbol_387.setPrecedence(symbol_6);
			symbol_387.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_387.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_389 = PivotFactory.eINSTANCE.createComment();
				symbol_389.setBody("Returns oclText[true] if the numeric value of oclText[self] is the same as the numeric value of object2, oclText[false] otherwise.");
				symbol_387.getOwnedComments().add(symbol_389);
			}
			
			symbol_13.getOwnedOperations().add(symbol_387);
		}
		{	// ocl::Real::>()
			Operation symbol_390 = PivotFactory.eINSTANCE.createOperation(); // Real!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_390.setName(">");
			symbol_390.setType(symbol_11);  // Boolean
			
			Parameter symbol_391 = PivotFactory.eINSTANCE.createParameter(); // Real!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_391.setName("r");
			symbol_391.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_390.getOwnedParameters().add(symbol_391);
			symbol_390.setPrecedence(symbol_5);
			symbol_390.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation");
			symbol_390.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE);
			{
				Comment symbol_392 = PivotFactory.eINSTANCE.createComment();
				symbol_392.setBody("True if oclText[self] is greater than r.");
				symbol_390.getOwnedComments().add(symbol_392);
			}
			
			symbol_13.getOwnedOperations().add(symbol_390);
		}
		{	// ocl::Real::>=()
			Operation symbol_393 = PivotFactory.eINSTANCE.createOperation(); // Real!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_393.setName(">=");
			symbol_393.setType(symbol_11);  // Boolean
			
			Parameter symbol_394 = PivotFactory.eINSTANCE.createParameter(); // Real!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_394.setName("r");
			symbol_394.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_393.getOwnedParameters().add(symbol_394);
			symbol_393.setPrecedence(symbol_5);
			symbol_393.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation");
			symbol_393.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE);
			{
				Comment symbol_395 = PivotFactory.eINSTANCE.createComment();
				symbol_395.setBody("True if oclText[self] is greater than or equal to r.");
				symbol_393.getOwnedComments().add(symbol_395);
			}
			
			symbol_13.getOwnedOperations().add(symbol_393);
		}
		{	// ocl::Real::abs()
			Operation symbol_396 = PivotFactory.eINSTANCE.createOperation(); // Real!abs()
			symbol_396.setName("abs");
			symbol_396.setType(symbol_13);  // Real
			
			symbol_396.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericAbsOperation");
			symbol_396.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			{
				Comment symbol_397 = PivotFactory.eINSTANCE.createComment();
				symbol_397.setBody("The absolute value of oclText[self].");
				symbol_396.getOwnedComments().add(symbol_397);
			}
			
			symbol_13.getOwnedOperations().add(symbol_396);
		}
		{	// ocl::Real::compareTo()
			Operation symbol_398 = PivotFactory.eINSTANCE.createOperation(); // Real!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_398.setName("compareTo");
			symbol_398.setType(symbol_12);  // Integer
			
			Parameter symbol_399 = PivotFactory.eINSTANCE.createParameter(); // Real!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_399.setName("that");
			symbol_399.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_398.getOwnedParameters().add(symbol_399);
			symbol_398.setImplementationClass("org.eclipse.ocl.examples.library.real.RealCompareToOperation");
			symbol_398.setImplementation(org.eclipse.ocl.examples.library.real.RealCompareToOperation.INSTANCE);
			{
				Comment symbol_400 = PivotFactory.eINSTANCE.createComment();
				symbol_400.setBody("The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
				symbol_398.getOwnedComments().add(symbol_400);
			}
			
			symbol_13.getOwnedOperations().add(symbol_398);
		}
		{	// ocl::Real::floor()
			Operation symbol_401 = PivotFactory.eINSTANCE.createOperation(); // Real!floor()
			symbol_401.setName("floor");
			symbol_401.setType(symbol_12);  // Integer
			
			symbol_401.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericFloorOperation");
			symbol_401.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
			{
				Comment symbol_402 = PivotFactory.eINSTANCE.createComment();
				symbol_402.setBody("The largest integer that is less than or equal to oclText[self].");
				symbol_401.getOwnedComments().add(symbol_402);
			}
			
			symbol_13.getOwnedOperations().add(symbol_401);
		}
		{	// ocl::Real::max()
			Operation symbol_403 = PivotFactory.eINSTANCE.createOperation(); // Real!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_403.setName("max");
			symbol_403.setType(symbol_13);  // Real
			
			Parameter symbol_404 = PivotFactory.eINSTANCE.createParameter(); // Real!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_404.setName("r");
			symbol_404.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_403.getOwnedParameters().add(symbol_404);
			symbol_403.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMaxOperation");
			symbol_403.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			{
				Comment symbol_405 = PivotFactory.eINSTANCE.createComment();
				symbol_405.setBody("The maximum of oclText[self] and r.");
				symbol_403.getOwnedComments().add(symbol_405);
			}
			
			symbol_13.getOwnedOperations().add(symbol_403);
		}
		{	// ocl::Real::min()
			Operation symbol_406 = PivotFactory.eINSTANCE.createOperation(); // Real!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_406.setName("min");
			symbol_406.setType(symbol_13);  // Real
			
			Parameter symbol_407 = PivotFactory.eINSTANCE.createParameter(); // Real!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_407.setName("r");
			symbol_407.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_406.getOwnedParameters().add(symbol_407);
			symbol_406.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMinOperation");
			symbol_406.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			{
				Comment symbol_408 = PivotFactory.eINSTANCE.createComment();
				symbol_408.setBody("The minimum of oclText[self] and r.");
				symbol_406.getOwnedComments().add(symbol_408);
			}
			
			symbol_13.getOwnedOperations().add(symbol_406);
		}
		{	// ocl::Real::round()
			Operation symbol_409 = PivotFactory.eINSTANCE.createOperation(); // Real!round()
			symbol_409.setName("round");
			symbol_409.setType(symbol_12);  // Integer
			
			symbol_409.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericRoundOperation");
			symbol_409.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
			{
				Comment symbol_410 = PivotFactory.eINSTANCE.createComment();
				symbol_410.setBody("The integer that is closest to oclText[self]. When there are two such integers, the largest one.");
				symbol_409.getOwnedComments().add(symbol_410);
			}
			
			symbol_13.getOwnedOperations().add(symbol_409);
		}
		{	// ocl::Real::toString()
			Operation symbol_411 = PivotFactory.eINSTANCE.createOperation(); // Real!toString()
			symbol_411.setName("toString");
			symbol_411.setType(symbol_14);  // String
			
			symbol_411.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_411.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_412 = PivotFactory.eINSTANCE.createComment();
				symbol_412.setBody("Converts oclText[self] to a string value.");
				symbol_411.getOwnedComments().add(symbol_412);
			}
			
			symbol_13.getOwnedOperations().add(symbol_411);
		}
		{
			Comment symbol_413 = PivotFactory.eINSTANCE.createComment();
			symbol_413.setBody("The standard type Real represents the mathematical concept of real.\nNote that UnlimitedNatural is a subclass of Integer and that Integer is a subclass of Real,\nso for each parameter of type Real, you can use an unlimited natural or an integer as the actual parameter.\nReal is itself an instance of the metatype PrimitiveType (from UML).");
			symbol_13.getOwnedComments().add(symbol_413);
		}
		
		symbol_0.getOwnedTypes().add(symbol_13); // Real
		//
		// ocl::String String
		//
		symbol_14.setName("String");
		symbol_14.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		symbol_14.getSuperClasses().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		{	// ocl::String::+()
			Operation symbol_414 = PivotFactory.eINSTANCE.createOperation(); // String!+(String)
			symbol_414.setName("+");
			symbol_414.setType(symbol_14);  // String
			
			Parameter symbol_415 = PivotFactory.eINSTANCE.createParameter(); // String!+(String)!s
			symbol_415.setName("s");
			symbol_415.setType(symbol_14);  // String
			
			
			symbol_414.getOwnedParameters().add(symbol_415);
			symbol_414.setPrecedence(symbol_4);
			symbol_414.setImplementationClass("org.eclipse.ocl.examples.library.string.StringConcatOperation");
			symbol_414.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			{
				Comment symbol_416 = PivotFactory.eINSTANCE.createComment();
				symbol_416.setBody("The concatenation of oclText[self] and s.");
				symbol_414.getOwnedComments().add(symbol_416);
			}
			
			symbol_14.getOwnedOperations().add(symbol_414);
		}
		{	// ocl::String::<()
			Operation symbol_417 = PivotFactory.eINSTANCE.createOperation(); // String!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_417.setName("<");
			symbol_417.setType(symbol_11);  // Boolean
			
			Parameter symbol_418 = PivotFactory.eINSTANCE.createParameter(); // String!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_418.setName("s");
			symbol_418.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_417.getOwnedParameters().add(symbol_418);
			symbol_417.setPrecedence(symbol_5);
			symbol_417.setImplementationClass("org.eclipse.ocl.examples.library.string.StringLessThanOperation");
			symbol_417.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
			{
				Comment symbol_419 = PivotFactory.eINSTANCE.createComment();
				symbol_419.setBody("True if oclText[self] is less than s, using the locale defined by looking up oclLocale in the current environment.");
				symbol_417.getOwnedComments().add(symbol_419);
			}
			
			symbol_14.getOwnedOperations().add(symbol_417);
		}
		{	// ocl::String::<=()
			Operation symbol_420 = PivotFactory.eINSTANCE.createOperation(); // String!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_420.setName("<=");
			symbol_420.setType(symbol_11);  // Boolean
			
			Parameter symbol_421 = PivotFactory.eINSTANCE.createParameter(); // String!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_421.setName("s");
			symbol_421.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_420.getOwnedParameters().add(symbol_421);
			symbol_420.setPrecedence(symbol_5);
			symbol_420.setImplementationClass("org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation");
			symbol_420.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
			{
				Comment symbol_422 = PivotFactory.eINSTANCE.createComment();
				symbol_422.setBody("True if oclText[self] is less than or equal to s, using the locale defined by looking up oclLocale in the current environment.");
				symbol_420.getOwnedComments().add(symbol_422);
			}
			
			symbol_14.getOwnedOperations().add(symbol_420);
		}
		{	// ocl::String::<>()
			Operation symbol_423 = PivotFactory.eINSTANCE.createOperation(); // String!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_423.setName("<>");
			symbol_423.setType(symbol_11);  // Boolean
			
			Parameter symbol_424 = PivotFactory.eINSTANCE.createParameter(); // String!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_424.setName("object2");
			symbol_424.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_423.getOwnedParameters().add(symbol_424);
			symbol_423.setPrecedence(symbol_6);
			symbol_423.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_423.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_14.getOwnedOperations().add(symbol_423);
		}
		{	// ocl::String::=()
			Operation symbol_425 = PivotFactory.eINSTANCE.createOperation(); // String!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_425.setName("=");
			symbol_425.setType(symbol_11);  // Boolean
			
			Parameter symbol_426 = PivotFactory.eINSTANCE.createParameter(); // String!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_426.setName("object2");
			symbol_426.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_425.getOwnedParameters().add(symbol_426);
			symbol_425.setPrecedence(symbol_6);
			symbol_425.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_425.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			
			symbol_14.getOwnedOperations().add(symbol_425);
		}
		{	// ocl::String::>()
			Operation symbol_427 = PivotFactory.eINSTANCE.createOperation(); // String!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_427.setName(">");
			symbol_427.setType(symbol_11);  // Boolean
			
			Parameter symbol_428 = PivotFactory.eINSTANCE.createParameter(); // String!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_428.setName("s");
			symbol_428.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_427.getOwnedParameters().add(symbol_428);
			symbol_427.setPrecedence(symbol_5);
			symbol_427.setImplementationClass("org.eclipse.ocl.examples.library.string.StringGreaterThanOperation");
			symbol_427.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
			{
				Comment symbol_429 = PivotFactory.eINSTANCE.createComment();
				symbol_429.setBody("True if oclText[self] is greater than s, using the locale defined by looking up oclLocale in the current environment.");
				symbol_427.getOwnedComments().add(symbol_429);
			}
			
			symbol_14.getOwnedOperations().add(symbol_427);
		}
		{	// ocl::String::>=()
			Operation symbol_430 = PivotFactory.eINSTANCE.createOperation(); // String!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_430.setName(">=");
			symbol_430.setType(symbol_11);  // Boolean
			
			Parameter symbol_431 = PivotFactory.eINSTANCE.createParameter(); // String!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_431.setName("s");
			symbol_431.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_430.getOwnedParameters().add(symbol_431);
			symbol_430.setPrecedence(symbol_5);
			symbol_430.setImplementationClass("org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation");
			symbol_430.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
			{
				Comment symbol_432 = PivotFactory.eINSTANCE.createComment();
				symbol_432.setBody("True if oclText[self] is greater than or equal to s, using the locale defined by looking up oclLocale in the current environment.");
				symbol_430.getOwnedComments().add(symbol_432);
			}
			
			symbol_14.getOwnedOperations().add(symbol_430);
		}
		{	// ocl::String::at()
			Operation symbol_433 = PivotFactory.eINSTANCE.createOperation(); // String!at(Integer)
			symbol_433.setName("at");
			symbol_433.setType(symbol_14);  // String
			
			Parameter symbol_434 = PivotFactory.eINSTANCE.createParameter(); // String!at(Integer)!i
			symbol_434.setName("i");
			symbol_434.setType(symbol_12);  // Integer
			
			
			symbol_433.getOwnedParameters().add(symbol_434);
			symbol_433.setImplementationClass("org.eclipse.ocl.examples.library.string.StringAtOperation");
			symbol_433.setImplementation(org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE);
			{
				Comment symbol_435 = PivotFactory.eINSTANCE.createComment();
				symbol_435.setBody("Queries the character at position i in oclText[self].");
				symbol_433.getOwnedComments().add(symbol_435);
			}
			
			symbol_14.getOwnedOperations().add(symbol_433);
		}
		{	// ocl::String::characters()
			Operation symbol_436 = PivotFactory.eINSTANCE.createOperation(); // String!characters()
			symbol_436.setName("characters");
			symbol_436.setType(symbol_259);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
			
			symbol_436.setImplementationClass("org.eclipse.ocl.examples.library.string.StringCharactersOperation");
			symbol_436.setImplementation(org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
			{
				Comment symbol_437 = PivotFactory.eINSTANCE.createComment();
				symbol_437.setBody("Obtains the characters of oclText[self] as a sequence.");
				symbol_436.getOwnedComments().add(symbol_437);
			}
			
			symbol_14.getOwnedOperations().add(symbol_436);
		}
		{	// ocl::String::compareTo()
			Operation symbol_438 = PivotFactory.eINSTANCE.createOperation(); // String!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_438.setName("compareTo");
			symbol_438.setType(symbol_12);  // Integer
			
			Parameter symbol_439 = PivotFactory.eINSTANCE.createParameter(); // String!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_439.setName("that");
			symbol_439.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_438.getOwnedParameters().add(symbol_439);
			symbol_438.setImplementationClass("org.eclipse.ocl.examples.library.string.StringCompareToOperation");
			symbol_438.setImplementation(org.eclipse.ocl.examples.library.string.StringCompareToOperation.INSTANCE);
			{
				Comment symbol_440 = PivotFactory.eINSTANCE.createComment();
				symbol_440.setBody("The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
				symbol_438.getOwnedComments().add(symbol_440);
			}
			
			symbol_14.getOwnedOperations().add(symbol_438);
		}
		{	// ocl::String::concat()
			Operation symbol_441 = PivotFactory.eINSTANCE.createOperation(); // String!concat(String)
			symbol_441.setName("concat");
			symbol_441.setType(symbol_14);  // String
			
			Parameter symbol_442 = PivotFactory.eINSTANCE.createParameter(); // String!concat(String)!s
			symbol_442.setName("s");
			symbol_442.setType(symbol_14);  // String
			
			
			symbol_441.getOwnedParameters().add(symbol_442);
			symbol_441.setImplementationClass("org.eclipse.ocl.examples.library.string.StringConcatOperation");
			symbol_441.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			{
				Comment symbol_443 = PivotFactory.eINSTANCE.createComment();
				symbol_443.setBody("The concatenation of oclText[self] and s.");
				symbol_441.getOwnedComments().add(symbol_443);
			}
			
			symbol_14.getOwnedOperations().add(symbol_441);
		}
		{	// ocl::String::equalsIgnoreCase()
			Operation symbol_444 = PivotFactory.eINSTANCE.createOperation(); // String!equalsIgnoreCase(String)
			symbol_444.setName("equalsIgnoreCase");
			symbol_444.setType(symbol_11);  // Boolean
			
			Parameter symbol_445 = PivotFactory.eINSTANCE.createParameter(); // String!equalsIgnoreCase(String)!s
			symbol_445.setName("s");
			symbol_445.setType(symbol_14);  // String
			
			
			symbol_444.getOwnedParameters().add(symbol_445);
			symbol_444.setImplementationClass("org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation");
			symbol_444.setImplementation(org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
			{
				Comment symbol_446 = PivotFactory.eINSTANCE.createComment();
				symbol_446.setBody("Queries whether s and oclText[self] are equivalent under case-insensitive collation.");
				symbol_444.getOwnedComments().add(symbol_446);
			}
			
			symbol_14.getOwnedOperations().add(symbol_444);
		}
		{	// ocl::String::indexOf()
			Operation symbol_447 = PivotFactory.eINSTANCE.createOperation(); // String!indexOf(String)
			symbol_447.setName("indexOf");
			symbol_447.setType(symbol_12);  // Integer
			
			Parameter symbol_448 = PivotFactory.eINSTANCE.createParameter(); // String!indexOf(String)!s
			symbol_448.setName("s");
			symbol_448.setType(symbol_14);  // String
			
			
			symbol_447.getOwnedParameters().add(symbol_448);
			symbol_447.setImplementationClass("org.eclipse.ocl.examples.library.string.StringIndexOfOperation");
			symbol_447.setImplementation(org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE);
			{
				Comment symbol_449 = PivotFactory.eINSTANCE.createComment();
				symbol_449.setBody("Queries the index in oclText[self] at which s is a substring of oclText[self], or zero if s is not a substring of oclText[self].\nThe empty string is considered to be a substring of every string but the empty string, at index 1.\nNo string is a substring of the empty string.");
				symbol_447.getOwnedComments().add(symbol_449);
			}
			
			symbol_14.getOwnedOperations().add(symbol_447);
		}
		{	// ocl::String::size()
			Operation symbol_450 = PivotFactory.eINSTANCE.createOperation(); // String!size()
			symbol_450.setName("size");
			symbol_450.setType(symbol_12);  // Integer
			
			symbol_450.setImplementationClass("org.eclipse.ocl.examples.library.string.StringSizeOperation");
			symbol_450.setImplementation(org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
			{
				Comment symbol_451 = PivotFactory.eINSTANCE.createComment();
				symbol_451.setBody("The number of characters in oclText[self].");
				symbol_450.getOwnedComments().add(symbol_451);
			}
			
			symbol_14.getOwnedOperations().add(symbol_450);
		}
		{	// ocl::String::substring()
			Operation symbol_452 = PivotFactory.eINSTANCE.createOperation(); // String!substring(Integer,Integer)
			symbol_452.setName("substring");
			symbol_452.setType(symbol_14);  // String
			
			Parameter symbol_453 = PivotFactory.eINSTANCE.createParameter(); // String!substring(Integer,Integer)!lower
			symbol_453.setName("lower");
			symbol_453.setType(symbol_12);  // Integer
			
			
			symbol_452.getOwnedParameters().add(symbol_453);
			Parameter symbol_454 = PivotFactory.eINSTANCE.createParameter(); // String!substring(Integer,Integer)!upper
			symbol_454.setName("upper");
			symbol_454.setType(symbol_12);  // Integer
			
			
			symbol_452.getOwnedParameters().add(symbol_454);
			symbol_452.setImplementationClass("org.eclipse.ocl.examples.library.string.StringSubstringOperation");
			symbol_452.setImplementation(org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
			{
				Comment symbol_455 = PivotFactory.eINSTANCE.createComment();
				symbol_455.setBody("The sub-string of oclText[self] starting at character number lower, up to and including character number upper. Character numbers run from 1 to self.size().");
				symbol_452.getOwnedComments().add(symbol_455);
			}
			
			symbol_14.getOwnedOperations().add(symbol_452);
		}
		{	// ocl::String::toBoolean()
			Operation symbol_456 = PivotFactory.eINSTANCE.createOperation(); // String!toBoolean()
			symbol_456.setName("toBoolean");
			symbol_456.setType(symbol_11);  // Boolean
			
			symbol_456.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToBooleanOperation");
			symbol_456.setImplementation(org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
			{
				Comment symbol_457 = PivotFactory.eINSTANCE.createComment();
				symbol_457.setBody("Converts oclText[self] to a boolean value.");
				symbol_456.getOwnedComments().add(symbol_457);
			}
			
			symbol_14.getOwnedOperations().add(symbol_456);
		}
		{	// ocl::String::toInteger()
			Operation symbol_458 = PivotFactory.eINSTANCE.createOperation(); // String!toInteger()
			symbol_458.setName("toInteger");
			symbol_458.setType(symbol_12);  // Integer
			
			symbol_458.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToIntegerOperation");
			symbol_458.setImplementation(org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
			{
				Comment symbol_459 = PivotFactory.eINSTANCE.createComment();
				symbol_459.setBody("Converts oclText[self] to an Integer value.");
				symbol_458.getOwnedComments().add(symbol_459);
			}
			
			symbol_14.getOwnedOperations().add(symbol_458);
		}
		{	// ocl::String::toLower()
			Operation symbol_460 = PivotFactory.eINSTANCE.createOperation(); // String!toLower()
			symbol_460.setName("toLower");
			symbol_460.setType(symbol_14);  // String
			
			symbol_460.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation");
			symbol_460.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			{
				Comment symbol_461 = PivotFactory.eINSTANCE.createComment();
				symbol_461.setBody("This is a deprecated variant of toLowerCase() preserving compatibility with traditional Eclipse OCL behaviour.");
				symbol_460.getOwnedComments().add(symbol_461);
			}
			
			symbol_14.getOwnedOperations().add(symbol_460);
		}
		{	// ocl::String::toLowerCase()
			Operation symbol_462 = PivotFactory.eINSTANCE.createOperation(); // String!toLowerCase()
			symbol_462.setName("toLowerCase");
			symbol_462.setType(symbol_14);  // String
			
			symbol_462.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation");
			symbol_462.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			{
				Comment symbol_463 = PivotFactory.eINSTANCE.createComment();
				symbol_463.setBody("Converts oclText[self] to lower case, using the locale defined by looking up oclLocale in the current environment.\nOtherwise, returns the same string as oclText[self].");
				symbol_462.getOwnedComments().add(symbol_463);
			}
			
			symbol_14.getOwnedOperations().add(symbol_462);
		}
		{	// ocl::String::toReal()
			Operation symbol_464 = PivotFactory.eINSTANCE.createOperation(); // String!toReal()
			symbol_464.setName("toReal");
			symbol_464.setType(symbol_13);  // Real
			
			symbol_464.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToRealOperation");
			symbol_464.setImplementation(org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
			{
				Comment symbol_465 = PivotFactory.eINSTANCE.createComment();
				symbol_465.setBody("Converts oclText[self] to a Real value.");
				symbol_464.getOwnedComments().add(symbol_465);
			}
			
			symbol_14.getOwnedOperations().add(symbol_464);
		}
		{	// ocl::String::toString()
			Operation symbol_466 = PivotFactory.eINSTANCE.createOperation(); // String!toString()
			symbol_466.setName("toString");
			symbol_466.setType(symbol_14);  // String
			
			symbol_466.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_466.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_467 = PivotFactory.eINSTANCE.createComment();
				symbol_467.setBody("Returns oclText[self].");
				symbol_466.getOwnedComments().add(symbol_467);
			}
			
			symbol_14.getOwnedOperations().add(symbol_466);
		}
		{	// ocl::String::toUpper()
			Operation symbol_468 = PivotFactory.eINSTANCE.createOperation(); // String!toUpper()
			symbol_468.setName("toUpper");
			symbol_468.setType(symbol_14);  // String
			
			symbol_468.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation");
			symbol_468.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			{
				Comment symbol_469 = PivotFactory.eINSTANCE.createComment();
				symbol_469.setBody("This is a deprecated variant of toUpperCase() preserving compatibility with traditional Eclipse OCL behaviour.");
				symbol_468.getOwnedComments().add(symbol_469);
			}
			
			symbol_14.getOwnedOperations().add(symbol_468);
		}
		{	// ocl::String::toUpperCase()
			Operation symbol_470 = PivotFactory.eINSTANCE.createOperation(); // String!toUpperCase()
			symbol_470.setName("toUpperCase");
			symbol_470.setType(symbol_14);  // String
			
			symbol_470.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation");
			symbol_470.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			{
				Comment symbol_471 = PivotFactory.eINSTANCE.createComment();
				symbol_471.setBody("Converts oclText[self] to upper case, using the locale defined by looking up oclLocale in the current environment.\nOtherwise, returns the same string as oclText[self].");
				symbol_470.getOwnedComments().add(symbol_471);
			}
			
			symbol_14.getOwnedOperations().add(symbol_470);
		}
		{
			Comment symbol_472 = PivotFactory.eINSTANCE.createComment();
			symbol_472.setBody("The standard type String represents strings, which can be both ASCII or Unicode.\nString is itself an instance of the metatype PrimitiveType (from UML).");
			symbol_14.getOwnedComments().add(symbol_472);
		}
		
		symbol_0.getOwnedTypes().add(symbol_14); // String
		//
		// ocl::UnlimitedNatural UnlimitedNatural
		//
		symbol_15.setName("UnlimitedNatural");
		symbol_15.getSuperClasses().add(symbol_12); // Integer
		{	// ocl::UnlimitedNatural::oclAsType()
			Operation symbol_473 = PivotFactory.eINSTANCE.createOperation(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])
			symbol_18.setName("TT");
			symbol_17.setOwnedParameteredElement(symbol_18);
			symbol_16.getOwnedParameters().add(symbol_17);
			
			symbol_473.setOwnedTemplateSignature(symbol_16);
			symbol_473.setName("oclAsType");
			symbol_473.setType(symbol_18);  // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT
			
			Parameter symbol_474 = PivotFactory.eINSTANCE.createParameter(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])!type
			symbol_474.setName("type");
			symbol_474.setType(symbol_179);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
			
			
			symbol_473.getOwnedParameters().add(symbol_474);
			symbol_473.setImplementationClass("org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation");
			symbol_473.setImplementation(org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation.INSTANCE);
			{
				Comment symbol_475 = PivotFactory.eINSTANCE.createComment();
				symbol_475.setBody("Evaluates to oclText[self], where oclText[self] is of the type identified by T.\nThe type T may be any classifier defined in the UML model;\nif the actual type of oclText[self] at evaluation time does not conform to T,\nthen the oclAsType operation evaluates to oclText[invalid].\n\nThe standard behavior is redefined for UnlimitedNatural. Numeric values may be converted to\nReal or Integer, but the e[unlimited] value may not.\nConversion of e[unlimited] to Real or Integer returns oclText[invalid].");
				symbol_473.getOwnedComments().add(symbol_475);
			}
			
			symbol_15.getOwnedOperations().add(symbol_473);
		}
		{
			Comment symbol_476 = PivotFactory.eINSTANCE.createComment();
			symbol_476.setBody("The standard type UnlimitedNatural is used to encode the non-negative values of a multiplicity specification.\nThis includes a special e[unlimited] value (*) that encodes the upper value of  a multiplicity specification.\nUnlimitedNatural is itself an instance of the metatype UnlimitedNaturalType.\n\nNote that although UnlimitedNatural is a subclass of Integer, the e[unlimited] value cannot be represented as an Integer.\nAny use of the e[unlimited] value as an integer or real is replaced by the oclText[invalid] value.");
			symbol_15.getOwnedComments().add(symbol_476);
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
			Operation symbol_477 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_477.setName("<>");
			symbol_477.setType(symbol_11);  // Boolean
			
			Parameter symbol_478 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_478.setName("object2");
			symbol_478.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_477.getOwnedParameters().add(symbol_478);
			symbol_477.setPrecedence(symbol_6);
			symbol_477.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_477.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_23.getOwnedOperations().add(symbol_477);
		}
		{	// ocl::Bag::=()
			Operation symbol_479 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_479.setName("=");
			symbol_479.setType(symbol_11);  // Boolean
			
			Parameter symbol_480 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_480.setName("object2");
			symbol_480.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_479.getOwnedParameters().add(symbol_480);
			symbol_479.setPrecedence(symbol_6);
			symbol_479.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_479.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_481 = PivotFactory.eINSTANCE.createComment();
				symbol_481.setBody("True if oclText[self] and bag contain the same elements, the same number of times.");
				symbol_479.getOwnedComments().add(symbol_481);
			}
			
			symbol_23.getOwnedOperations().add(symbol_479);
		}
		{	// ocl::Bag::closure()
			Iteration symbol_482 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_482.setName("closure");
			symbol_482.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			Parameter symbol_483 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!i
			symbol_483.setName("i");
			symbol_483.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_482.getOwnedIterators().add(symbol_483);
			Parameter symbol_484 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!body
			symbol_484.setName("body");
			symbol_484.setType(symbol_140);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
			
			
			symbol_482.getOwnedParameters().add(symbol_484);
			symbol_482.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ClosureIteration");
			symbol_482.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			{
				Comment symbol_485 = PivotFactory.eINSTANCE.createComment();
				symbol_485.setBody("The closure of applying body transitively to every distinct element of the source collection.");
				symbol_482.getOwnedComments().add(symbol_485);
			}
			
			symbol_23.getOwnedOperations().add(symbol_482);
		}
		{	// ocl::Bag::collect()
			Iteration symbol_486 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)
			symbol_29.setName("V");
			symbol_28.setOwnedParameteredElement(symbol_29);
			symbol_27.getOwnedParameters().add(symbol_28);
			
			symbol_486.setOwnedTemplateSignature(symbol_27);
			symbol_486.setName("collect");
			symbol_486.setType(symbol_192);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_487 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)!i
			symbol_487.setName("i");
			symbol_487.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_486.getOwnedIterators().add(symbol_487);
			Parameter symbol_488 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)!body
			symbol_488.setName("body");
			symbol_488.setType(symbol_138);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V
			
			
			symbol_486.getOwnedParameters().add(symbol_488);
			symbol_486.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_486.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			
			symbol_23.getOwnedOperations().add(symbol_486);
		}
		{	// ocl::Bag::collectNested()
			Iteration symbol_489 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)
			symbol_32.setName("V");
			symbol_31.setOwnedParameteredElement(symbol_32);
			symbol_30.getOwnedParameters().add(symbol_31);
			
			symbol_489.setOwnedTemplateSignature(symbol_30);
			symbol_489.setName("collectNested");
			symbol_489.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_490 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_490.setName("i");
			symbol_490.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_489.getOwnedIterators().add(symbol_490);
			Parameter symbol_491 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_491.setName("body");
			symbol_491.setType(symbol_137);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collectNested{V}(T|Lambda~T()V)?V
			
			
			symbol_489.getOwnedParameters().add(symbol_491);
			symbol_489.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_489.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			{
				Comment symbol_492 = PivotFactory.eINSTANCE.createComment();
				symbol_492.setBody("The Bag of elements which results from applying body to every member of the source nonordered collection.");
				symbol_489.getOwnedComments().add(symbol_492);
			}
			
			symbol_23.getOwnedOperations().add(symbol_489);
		}
		{	// ocl::Bag::excluding()
			Operation symbol_493 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_493.setName("excluding");
			symbol_493.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_494 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_494.setName("object");
			symbol_494.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_493.getOwnedParameters().add(symbol_494);
			symbol_493.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_493.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_495 = PivotFactory.eINSTANCE.createComment();
				symbol_495.setBody("The bag containing all elements of oclText[self] apart from all occurrences of object.");
				symbol_493.getOwnedComments().add(symbol_495);
			}
			
			symbol_23.getOwnedOperations().add(symbol_493);
		}
		{	// ocl::Bag::flatten()
			Operation symbol_496 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()
			symbol_35.setName("T2");
			symbol_34.setOwnedParameteredElement(symbol_35);
			symbol_33.getOwnedParameters().add(symbol_34);
			
			symbol_496.setOwnedTemplateSignature(symbol_33);
			symbol_496.setName("flatten");
			symbol_496.setType(symbol_193);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
			
			symbol_496.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_496.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			{
				Comment symbol_497 = PivotFactory.eINSTANCE.createComment();
				symbol_497.setBody("Redefines the Collection operation. If the element type is not a collection type, this results in the same bag as oclText[self].\nIf the element type is a collection type, the result is the bag containing all the elements of all the recursively flattened elements of oclText[self].");
				symbol_496.getOwnedComments().add(symbol_497);
			}
			
			symbol_23.getOwnedOperations().add(symbol_496);
		}
		{	// ocl::Bag::including()
			Operation symbol_498 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!including(T)
			symbol_498.setName("including");
			symbol_498.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_499 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!including(T)!object
			symbol_499.setName("object");
			symbol_499.setType(symbol_26);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			
			symbol_498.getOwnedParameters().add(symbol_499);
			symbol_498.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_498.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_500 = PivotFactory.eINSTANCE.createComment();
				symbol_500.setBody("The bag containing all elements of oclText[self] plus object.");
				symbol_498.getOwnedComments().add(symbol_500);
			}
			
			symbol_23.getOwnedOperations().add(symbol_498);
		}
		{	// ocl::Bag::intersection()
			Operation symbol_501 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_501.setName("intersection");
			symbol_501.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_502 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!bag
			symbol_502.setName("bag");
			symbol_502.setType(symbol_223);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			
			symbol_501.getOwnedParameters().add(symbol_502);
			symbol_501.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation");
			symbol_501.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE);
			{
				Comment symbol_503 = PivotFactory.eINSTANCE.createComment();
				symbol_503.setBody("The intersection of oclText[self] and bag; the bag of all elements that are in both oclText[self] and s.");
				symbol_501.getOwnedComments().add(symbol_503);
			}
			
			symbol_23.getOwnedOperations().add(symbol_501);
		}
		{	// ocl::Bag::intersection()
			Operation symbol_504 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])
			symbol_504.setName("intersection");
			symbol_504.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			Parameter symbol_505 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])!s
			symbol_505.setName("s");
			symbol_505.setType(symbol_284);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			
			symbol_504.getOwnedParameters().add(symbol_505);
			symbol_504.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation");
			symbol_504.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE);
			{
				Comment symbol_506 = PivotFactory.eINSTANCE.createComment();
				symbol_506.setBody("The intersection of oclText[self] and s; the set of all elements that are in both oclText[self] and s.");
				symbol_504.getOwnedComments().add(symbol_506);
			}
			
			symbol_23.getOwnedOperations().add(symbol_504);
		}
		{	// ocl::Bag::reject()
			Iteration symbol_507 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)
			symbol_507.setName("reject");
			symbol_507.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_508 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)!i
			symbol_508.setName("i");
			symbol_508.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_507.getOwnedIterators().add(symbol_508);
			Parameter symbol_509 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)!body
			symbol_509.setName("body");
			symbol_509.setType(symbol_135);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
			
			
			symbol_507.getOwnedParameters().add(symbol_509);
			symbol_507.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_507.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_510 = PivotFactory.eINSTANCE.createComment();
				symbol_510.setBody("The sub-bag of the source bag for which body is oclText[false].\n\noclCode[self->reject(iterator | body) = self->select(iterator | not body)].");
				symbol_507.getOwnedComments().add(symbol_510);
			}
			
			symbol_23.getOwnedOperations().add(symbol_507);
		}
		{	// ocl::Bag::select()
			Iteration symbol_511 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)
			symbol_511.setName("select");
			symbol_511.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_512 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)!i
			symbol_512.setName("i");
			symbol_512.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_511.getOwnedIterators().add(symbol_512);
			Parameter symbol_513 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)!body
			symbol_513.setName("body");
			symbol_513.setType(symbol_136);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
			
			
			symbol_511.getOwnedParameters().add(symbol_513);
			symbol_511.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_511.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_514 = PivotFactory.eINSTANCE.createComment();
				symbol_514.setBody("The sub-bag of the source bag for which body is oclText[true].\n\noclCode[self->select(iterator | body) =\nself->iterate(iterator; result : Bag<T> = Bag{} |\nif body then result->including(iterator)\nelse result\nendif)]");
				symbol_511.getOwnedComments().add(symbol_514);
			}
			
			symbol_23.getOwnedOperations().add(symbol_511);
		}
		{	// ocl::Bag::sortedBy()
			Iteration symbol_515 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_515.setName("sortedBy");
			symbol_515.setType(symbol_260);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			Parameter symbol_516 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_516.setName("i");
			symbol_516.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_515.getOwnedIterators().add(symbol_516);
			Parameter symbol_517 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_517.setName("body");
			symbol_517.setType(symbol_139);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_515.getOwnedParameters().add(symbol_517);
			symbol_515.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_515.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_518 = PivotFactory.eINSTANCE.createComment();
				symbol_518.setBody("Results in the Sequence containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
				symbol_515.getOwnedComments().add(symbol_518);
			}
			
			symbol_23.getOwnedOperations().add(symbol_515);
		}
		{	// ocl::Bag::union()
			Operation symbol_519 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_519.setName("union");
			symbol_519.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_520 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!bag
			symbol_520.setName("bag");
			symbol_520.setType(symbol_223);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			
			symbol_519.getOwnedParameters().add(symbol_520);
			symbol_519.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_519.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_521 = PivotFactory.eINSTANCE.createComment();
				symbol_521.setBody("The union of oclText[self] and bag; the bag of all elements that are in oclText[self] and all elements that are in bag.");
				symbol_519.getOwnedComments().add(symbol_521);
			}
			
			symbol_23.getOwnedOperations().add(symbol_519);
		}
		{	// ocl::Bag::union()
			Operation symbol_522 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])
			symbol_522.setName("union");
			symbol_522.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			Parameter symbol_523 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])!s
			symbol_523.setName("s");
			symbol_523.setType(symbol_284);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
			
			
			symbol_522.getOwnedParameters().add(symbol_523);
			symbol_522.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_522.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_524 = PivotFactory.eINSTANCE.createComment();
				symbol_524.setBody("The union of oclText[self] and s; the set of all elements that are in oclText[self] and all elements that are in s.");
				symbol_522.getOwnedComments().add(symbol_524);
			}
			
			symbol_23.getOwnedOperations().add(symbol_522);
		}
		{
			Comment symbol_525 = PivotFactory.eINSTANCE.createComment();
			symbol_525.setBody("A bag is a collection with duplicates allowed. That is, one object can be an element of a bag many times.\nThere is no ordering defined on the elements in a bag.\nBag is itself an instance of the metatype BagType.");
			symbol_23.getOwnedComments().add(symbol_525);
		}
		
		symbol_0.getOwnedTypes().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
		//
		// ocl::Class http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		//
		symbol_36.setName("Class");
		symbol_36.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Class::oclType()
			Operation symbol_526 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class!oclType()
			symbol_526.setName("oclType");
			symbol_526.setType(symbol_212);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_526.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_526.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			{
				Comment symbol_527 = PivotFactory.eINSTANCE.createComment();
				symbol_527.setBody("Evaluates to the type of which self is an instance.");
				symbol_526.getOwnedComments().add(symbol_527);
			}
			
			symbol_36.getOwnedOperations().add(symbol_526);
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
				Comment symbol_528 = PivotFactory.eINSTANCE.createComment();
				symbol_528.setBody("Evaluates to the type of the collection elements.");
				symbol_47.getOwnedComments().add(symbol_528);
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
			Operation symbol_529 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_529.setName("<>");
			symbol_529.setType(symbol_11);  // Boolean
			
			Parameter symbol_530 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_530.setName("object2");
			symbol_530.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_529.getOwnedParameters().add(symbol_530);
			symbol_529.setPrecedence(symbol_6);
			symbol_529.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_529.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_531 = PivotFactory.eINSTANCE.createComment();
				symbol_531.setBody("True if c is not equal to oclText[self].");
				symbol_529.getOwnedComments().add(symbol_531);
			}
			
			symbol_48.getOwnedOperations().add(symbol_529);
		}
		{	// ocl::Collection::=()
			Operation symbol_532 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_532.setName("=");
			symbol_532.setType(symbol_11);  // Boolean
			
			Parameter symbol_533 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_533.setName("object2");
			symbol_533.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_532.getOwnedParameters().add(symbol_533);
			symbol_532.setPrecedence(symbol_6);
			symbol_532.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_532.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_534 = PivotFactory.eINSTANCE.createComment();
				symbol_534.setBody("True if c is a collection of the same kind as oclText[self] and contains the same elements in the same quantities and in the same order,\nin the case of an ordered collection type.");
				symbol_532.getOwnedComments().add(symbol_534);
			}
			
			symbol_48.getOwnedOperations().add(symbol_532);
		}
		{	// ocl::Collection::any()
			Iteration symbol_535 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)
			symbol_535.setName("any");
			symbol_535.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			Parameter symbol_536 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)!i
			symbol_536.setName("i");
			symbol_536.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_535.getOwnedIterators().add(symbol_536);
			Parameter symbol_537 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)!body
			symbol_537.setName("body");
			symbol_537.setType(symbol_147);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_535.getOwnedParameters().add(symbol_537);
			symbol_535.setImplementationClass("org.eclipse.ocl.examples.library.iterator.AnyIteration");
			symbol_535.setImplementation(org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE);
			{
				Comment symbol_538 = PivotFactory.eINSTANCE.createComment();
				symbol_538.setBody("Returns any element in the source collection for which body evaluates to oclText[true].\nIf there is more than one element for which body is oclText[true], one of them is returned.\nThere must be at least one element fulfilling body, otherwise the result of this IteratorExp is oclText[null].");
				symbol_535.getOwnedComments().add(symbol_538);
			}
			
			symbol_48.getOwnedOperations().add(symbol_535);
		}
		{	// ocl::Collection::asBag()
			Operation symbol_539 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asBag()
			symbol_539.setName("asBag");
			symbol_539.setType(symbol_198);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_539.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation");
			symbol_539.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
			{
				Comment symbol_540 = PivotFactory.eINSTANCE.createComment();
				symbol_540.setBody("The Bag that contains all the elements from oclText[self].");
				symbol_539.getOwnedComments().add(symbol_540);
			}
			
			symbol_48.getOwnedOperations().add(symbol_539);
		}
		{	// ocl::Collection::asOrderedSet()
			Operation symbol_541 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asOrderedSet()
			symbol_541.setName("asOrderedSet");
			symbol_541.setType(symbol_252);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_541.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation");
			symbol_541.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
			{
				Comment symbol_542 = PivotFactory.eINSTANCE.createComment();
				symbol_542.setBody("An OrderedSet that contains all the elements from oclText[self], with duplicates removed,\nin an order dependent on the particular concrete collection type.");
				symbol_541.getOwnedComments().add(symbol_542);
			}
			
			symbol_48.getOwnedOperations().add(symbol_541);
		}
		{	// ocl::Collection::asSequence()
			Operation symbol_543 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asSequence()
			symbol_543.setName("asSequence");
			symbol_543.setType(symbol_261);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_543.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation");
			symbol_543.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
			{
				Comment symbol_544 = PivotFactory.eINSTANCE.createComment();
				symbol_544.setBody("Sequence that contains all the elements from oclText[self], in an order dependent on the particular concrete collection type.");
				symbol_543.getOwnedComments().add(symbol_544);
			}
			
			symbol_48.getOwnedOperations().add(symbol_543);
		}
		{	// ocl::Collection::asSet()
			Operation symbol_545 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asSet()
			symbol_545.setName("asSet");
			symbol_545.setType(symbol_274);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_545.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation");
			symbol_545.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
			{
				Comment symbol_546 = PivotFactory.eINSTANCE.createComment();
				symbol_546.setBody("The Set containing all the elements from oclText[self], with duplicates removed.");
				symbol_545.getOwnedComments().add(symbol_546);
			}
			
			symbol_48.getOwnedOperations().add(symbol_545);
		}
		{	// ocl::Collection::collect()
			Iteration symbol_547 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)
			symbol_54.setName("V");
			symbol_53.setOwnedParameteredElement(symbol_54);
			symbol_52.getOwnedParameters().add(symbol_53);
			
			symbol_547.setOwnedTemplateSignature(symbol_52);
			symbol_547.setName("collect");
			symbol_547.setType(symbol_224);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_548 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!i
			symbol_548.setName("i");
			symbol_548.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_547.getOwnedIterators().add(symbol_548);
			Parameter symbol_549 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!body
			symbol_549.setName("body");
			symbol_549.setType(symbol_150);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
			
			
			symbol_547.getOwnedParameters().add(symbol_549);
			symbol_547.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_547.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			{
				Comment symbol_550 = PivotFactory.eINSTANCE.createComment();
				symbol_550.setBody("The Collection of elements that results from applying body to every member of the source set.\nThe result is flattened. Notice that this is based on collectNested, which can be of different type depending on the type of source.\ncollectNested is defined individually for each subclass of CollectionType.");
				symbol_547.getOwnedComments().add(symbol_550);
			}
			
			symbol_48.getOwnedOperations().add(symbol_547);
		}
		{	// ocl::Collection::collectNested()
			Iteration symbol_551 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)
			symbol_57.setName("V");
			symbol_56.setOwnedParameteredElement(symbol_57);
			symbol_55.getOwnedParameters().add(symbol_56);
			
			symbol_551.setOwnedTemplateSignature(symbol_55);
			symbol_551.setName("collectNested");
			symbol_551.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_552 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_552.setName("i");
			symbol_552.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_551.getOwnedIterators().add(symbol_552);
			Parameter symbol_553 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_553.setName("body");
			symbol_553.setType(symbol_149);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
			
			
			symbol_551.getOwnedParameters().add(symbol_553);
			symbol_551.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_551.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			{
				Comment symbol_554 = PivotFactory.eINSTANCE.createComment();
				symbol_554.setBody("The Collection of elements which results from applying body to every member of the source collection.");
				symbol_551.getOwnedComments().add(symbol_554);
			}
			
			symbol_48.getOwnedOperations().add(symbol_551);
		}
		{	// ocl::Collection::count()
			Operation symbol_555 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!count(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_555.setName("count");
			symbol_555.setType(symbol_12);  // Integer
			
			Parameter symbol_556 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!count(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_556.setName("object");
			symbol_556.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_555.getOwnedParameters().add(symbol_556);
			symbol_555.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionCountOperation");
			symbol_555.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE);
			{
				Comment symbol_557 = PivotFactory.eINSTANCE.createComment();
				symbol_557.setBody("The number of times that object occurs in the collection oclText[self].");
				symbol_555.getOwnedComments().add(symbol_557);
			}
			
			symbol_48.getOwnedOperations().add(symbol_555);
		}
		{	// ocl::Collection::excludes()
			Operation symbol_558 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_558.setName("excludes");
			symbol_558.setType(symbol_11);  // Boolean
			
			Parameter symbol_559 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_559.setName("object");
			symbol_559.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_558.getOwnedParameters().add(symbol_559);
			symbol_558.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation");
			symbol_558.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE);
			{
				Comment symbol_560 = PivotFactory.eINSTANCE.createComment();
				symbol_560.setBody("True if object is not an element of oclText[self], oclText[false] otherwise.");
				symbol_558.getOwnedComments().add(symbol_560);
			}
			
			symbol_48.getOwnedOperations().add(symbol_558);
		}
		{	// ocl::Collection::excludesAll()
			Operation symbol_561 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_60.setName("T2");
			symbol_59.setOwnedParameteredElement(symbol_60);
			symbol_58.getOwnedParameters().add(symbol_59);
			
			symbol_561.setOwnedTemplateSignature(symbol_58);
			symbol_561.setName("excludesAll");
			symbol_561.setType(symbol_11);  // Boolean
			
			Parameter symbol_562 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_562.setName("c2");
			symbol_562.setType(symbol_225);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			
			symbol_561.getOwnedParameters().add(symbol_562);
			symbol_561.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation");
			symbol_561.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE);
			{
				Comment symbol_563 = PivotFactory.eINSTANCE.createComment();
				symbol_563.setBody("Does oclText[self] contain none of the elements of c2 ?");
				symbol_561.getOwnedComments().add(symbol_563);
			}
			
			symbol_48.getOwnedOperations().add(symbol_561);
		}
		{	// ocl::Collection::excluding()
			Operation symbol_564 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_564.setName("excluding");
			symbol_564.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_565 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_565.setName("object");
			symbol_565.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_564.getOwnedParameters().add(symbol_565);
			symbol_564.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_564.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_566 = PivotFactory.eINSTANCE.createComment();
				symbol_566.setBody("The collection containing all elements of oclText[self] apart from object.");
				symbol_564.getOwnedComments().add(symbol_566);
			}
			
			symbol_48.getOwnedOperations().add(symbol_564);
		}
		{	// ocl::Collection::exists()
			Iteration symbol_567 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)
			symbol_567.setName("exists");
			symbol_567.setType(symbol_11);  // Boolean
			
			Parameter symbol_568 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)!i
			symbol_568.setName("i");
			symbol_568.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_567.getOwnedIterators().add(symbol_568);
			Parameter symbol_569 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)!body
			symbol_569.setName("body");
			symbol_569.setType(symbol_141);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_567.getOwnedParameters().add(symbol_569);
			symbol_567.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ExistsIteration");
			symbol_567.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			{
				Comment symbol_570 = PivotFactory.eINSTANCE.createComment();
				symbol_570.setBody("Results in oclText[true] if body evaluates to oclText[true] for at least one element in the source collection.");
				symbol_567.getOwnedComments().add(symbol_570);
			}
			
			symbol_48.getOwnedOperations().add(symbol_567);
		}
		{	// ocl::Collection::exists()
			Iteration symbol_571 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)
			symbol_571.setName("exists");
			symbol_571.setType(symbol_11);  // Boolean
			
			Parameter symbol_572 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!i
			symbol_572.setName("i");
			symbol_572.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_571.getOwnedIterators().add(symbol_572);
			Parameter symbol_573 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!j
			symbol_573.setName("j");
			symbol_573.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_571.getOwnedIterators().add(symbol_573);
			Parameter symbol_574 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!body
			symbol_574.setName("body");
			symbol_574.setType(symbol_148);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_571.getOwnedParameters().add(symbol_574);
			symbol_571.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ExistsIteration");
			symbol_571.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			
			symbol_48.getOwnedOperations().add(symbol_571);
		}
		{	// ocl::Collection::flatten()
			Operation symbol_575 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()
			symbol_63.setName("T2");
			symbol_62.setOwnedParameteredElement(symbol_63);
			symbol_61.getOwnedParameters().add(symbol_62);
			
			symbol_575.setOwnedTemplateSignature(symbol_61);
			symbol_575.setName("flatten");
			symbol_575.setType(symbol_226);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
			
			symbol_575.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_575.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			{
				Comment symbol_576 = PivotFactory.eINSTANCE.createComment();
				symbol_576.setBody("If the element type is not a collection type, this results in the same collection as oclText[self].\nIf the element type is a collection type, the result is a collection containing all the elements of all the recursively flattened elements of oclText[self].");
				symbol_575.getOwnedComments().add(symbol_576);
			}
			
			symbol_48.getOwnedOperations().add(symbol_575);
		}
		{	// ocl::Collection::forAll()
			Iteration symbol_577 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)
			symbol_577.setName("forAll");
			symbol_577.setType(symbol_11);  // Boolean
			
			Parameter symbol_578 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)!i
			symbol_578.setName("i");
			symbol_578.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_577.getOwnedIterators().add(symbol_578);
			Parameter symbol_579 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)!body
			symbol_579.setName("body");
			symbol_579.setType(symbol_144);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_577.getOwnedParameters().add(symbol_579);
			symbol_577.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ForAllIteration");
			symbol_577.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			{
				Comment symbol_580 = PivotFactory.eINSTANCE.createComment();
				symbol_580.setBody("Results in oclText[true] if the body expression evaluates to oclText[true] for each element in the source collection; otherwise, result is oclText[false].");
				symbol_577.getOwnedComments().add(symbol_580);
			}
			
			symbol_48.getOwnedOperations().add(symbol_577);
		}
		{	// ocl::Collection::forAll()
			Iteration symbol_581 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)
			symbol_581.setName("forAll");
			symbol_581.setType(symbol_11);  // Boolean
			
			Parameter symbol_582 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!j
			symbol_582.setName("j");
			symbol_582.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_581.getOwnedIterators().add(symbol_582);
			Parameter symbol_583 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!i
			symbol_583.setName("i");
			symbol_583.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_581.getOwnedIterators().add(symbol_583);
			Parameter symbol_584 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!body
			symbol_584.setName("body");
			symbol_584.setType(symbol_146);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_581.getOwnedParameters().add(symbol_584);
			symbol_581.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ForAllIteration");
			symbol_581.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			
			symbol_48.getOwnedOperations().add(symbol_581);
		}
		{	// ocl::Collection::includes()
			Operation symbol_585 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_585.setName("includes");
			symbol_585.setType(symbol_11);  // Boolean
			
			Parameter symbol_586 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_586.setName("object");
			symbol_586.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_585.getOwnedParameters().add(symbol_586);
			symbol_585.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation");
			symbol_585.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE);
			{
				Comment symbol_587 = PivotFactory.eINSTANCE.createComment();
				symbol_587.setBody("True if object is an element of oclText[self], oclText[false] otherwise.");
				symbol_585.getOwnedComments().add(symbol_587);
			}
			
			symbol_48.getOwnedOperations().add(symbol_585);
		}
		{	// ocl::Collection::includesAll()
			Operation symbol_588 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_66.setName("T2");
			symbol_65.setOwnedParameteredElement(symbol_66);
			symbol_64.getOwnedParameters().add(symbol_65);
			
			symbol_588.setOwnedTemplateSignature(symbol_64);
			symbol_588.setName("includesAll");
			symbol_588.setType(symbol_11);  // Boolean
			
			Parameter symbol_589 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_589.setName("c2");
			symbol_589.setType(symbol_227);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			
			symbol_588.getOwnedParameters().add(symbol_589);
			symbol_588.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation");
			symbol_588.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE);
			{
				Comment symbol_590 = PivotFactory.eINSTANCE.createComment();
				symbol_590.setBody("Does oclText[self] contain all the elements of c2 ?");
				symbol_588.getOwnedComments().add(symbol_590);
			}
			
			symbol_48.getOwnedOperations().add(symbol_588);
		}
		{	// ocl::Collection::including()
			Operation symbol_591 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!including(T)
			symbol_591.setName("including");
			symbol_591.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_592 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!including(T)!object
			symbol_592.setName("object");
			symbol_592.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			
			symbol_591.getOwnedParameters().add(symbol_592);
			symbol_591.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_591.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_593 = PivotFactory.eINSTANCE.createComment();
				symbol_593.setBody("The collection containing all elements of oclText[self] plus object.");
				symbol_591.getOwnedComments().add(symbol_593);
			}
			
			symbol_48.getOwnedOperations().add(symbol_591);
		}
		{	// ocl::Collection::isEmpty()
			Operation symbol_594 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isEmpty()
			symbol_594.setName("isEmpty");
			symbol_594.setType(symbol_11);  // Boolean
			
			symbol_594.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation");
			symbol_594.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
			{
				Comment symbol_595 = PivotFactory.eINSTANCE.createComment();
				symbol_595.setBody("Is oclText[self] the empty collection?\n\nNote: oclText[null->isEmpty()] returns oclText[true] in virtue of the implicit casting from oclText[null] to oclText[Bag{}].");
				symbol_594.getOwnedComments().add(symbol_595);
			}
			
			symbol_48.getOwnedOperations().add(symbol_594);
		}
		{	// ocl::Collection::isUnique()
			Iteration symbol_596 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_596.setName("isUnique");
			symbol_596.setType(symbol_11);  // Boolean
			
			Parameter symbol_597 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_597.setName("i");
			symbol_597.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_596.getOwnedIterators().add(symbol_597);
			Parameter symbol_598 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_598.setName("body");
			symbol_598.setType(symbol_152);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_596.getOwnedParameters().add(symbol_598);
			symbol_596.setImplementationClass("org.eclipse.ocl.examples.library.iterator.IsUniqueIteration");
			symbol_596.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			{
				Comment symbol_599 = PivotFactory.eINSTANCE.createComment();
				symbol_599.setBody("Results in oclText[true] if body evaluates to a different value for each element in the source collection; otherwise, result is oclText[false].");
				symbol_596.getOwnedComments().add(symbol_599);
			}
			
			symbol_48.getOwnedOperations().add(symbol_596);
		}
		{	// ocl::Collection::iterate()
			Iteration symbol_600 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)
			symbol_69.setName("Tacc");
			symbol_68.setOwnedParameteredElement(symbol_69);
			symbol_67.getOwnedParameters().add(symbol_68);
			
			symbol_600.setOwnedTemplateSignature(symbol_67);
			symbol_600.setName("iterate");
			symbol_600.setType(symbol_69);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
			
			Parameter symbol_601 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)!i
			symbol_601.setName("i");
			symbol_601.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_600.getOwnedIterators().add(symbol_601);
			Parameter symbol_602 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)!acc
			symbol_602.setName("acc");
			symbol_602.setType(symbol_69); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
			
			symbol_600.getOwnedAccumulators().add(symbol_602);
			Parameter symbol_603 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)!body
			symbol_603.setName("body");
			symbol_603.setType(symbol_151);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc|Lambda~T()Tacc)?Tacc
			
			
			symbol_600.getOwnedParameters().add(symbol_603);
			symbol_600.setImplementationClass("org.eclipse.ocl.examples.library.iterator.IterateIteration");
			symbol_600.setImplementation(org.eclipse.ocl.examples.library.iterator.IterateIteration.INSTANCE);
			
			symbol_48.getOwnedOperations().add(symbol_600);
		}
		{	// ocl::Collection::max()
			Operation symbol_604 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!max()
			symbol_604.setName("max");
			symbol_604.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_604.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionMaxOperation");
			symbol_604.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
			{
				Comment symbol_605 = PivotFactory.eINSTANCE.createComment();
				symbol_605.setBody("The element with the maximum value of all elements in oclText[self].\nElements must be of a type supporting the max operation.\nThe max operation - supported by the elements - must take one parameter of type T and be both associative and commutative.\nUnlimitedNatural, Integer and Real fulfill this condition.");
				symbol_604.getOwnedComments().add(symbol_605);
			}
			
			symbol_48.getOwnedOperations().add(symbol_604);
		}
		{	// ocl::Collection::min()
			Operation symbol_606 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!min()
			symbol_606.setName("min");
			symbol_606.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_606.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionMinOperation");
			symbol_606.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
			{
				Comment symbol_607 = PivotFactory.eINSTANCE.createComment();
				symbol_607.setBody("The element with the minimum value of all elements in oclText[self].\nElements must be of a type supporting the min operation.\nThe min operation - supported by the elements - must take one parameter of type T and be both associative and commutative.\nUnlimitedNatural, Integer and Real fulfill this condition.");
				symbol_606.getOwnedComments().add(symbol_607);
			}
			
			symbol_48.getOwnedOperations().add(symbol_606);
		}
		{	// ocl::Collection::notEmpty()
			Operation symbol_608 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!notEmpty()
			symbol_608.setName("notEmpty");
			symbol_608.setType(symbol_11);  // Boolean
			
			symbol_608.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation");
			symbol_608.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
			{
				Comment symbol_609 = PivotFactory.eINSTANCE.createComment();
				symbol_609.setBody("Is oclText[self] not the empty collection?\n\noclText[null->notEmpty()] returns oclText[false] in virtue of the implicit casting from oclText[null] to oclText[Bag{}].");
				symbol_608.getOwnedComments().add(symbol_609);
			}
			
			symbol_48.getOwnedOperations().add(symbol_608);
		}
		{	// ocl::Collection::oclType()
			Operation symbol_610 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!oclType()
			symbol_610.setName("oclType");
			symbol_610.setType(symbol_214);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_610.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_610.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			{
				Comment symbol_611 = PivotFactory.eINSTANCE.createComment();
				symbol_611.setBody("Evaluates to the type of which oclText[self] is an instance.");
				symbol_610.getOwnedComments().add(symbol_611);
			}
			
			symbol_48.getOwnedOperations().add(symbol_610);
		}
		{	// ocl::Collection::one()
			Iteration symbol_612 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)
			symbol_612.setName("one");
			symbol_612.setType(symbol_11);  // Boolean
			
			Parameter symbol_613 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)!i
			symbol_613.setName("i");
			symbol_613.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_612.getOwnedIterators().add(symbol_613);
			Parameter symbol_614 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)!body
			symbol_614.setName("body");
			symbol_614.setType(symbol_142);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_612.getOwnedParameters().add(symbol_614);
			symbol_612.setImplementationClass("org.eclipse.ocl.examples.library.iterator.OneIteration");
			symbol_612.setImplementation(org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE);
			{
				Comment symbol_615 = PivotFactory.eINSTANCE.createComment();
				symbol_615.setBody("Results in oclText[true] if there is exactly one element in the source collection for which body is oclText[true].");
				symbol_612.getOwnedComments().add(symbol_615);
			}
			
			symbol_48.getOwnedOperations().add(symbol_612);
		}
		{	// ocl::Collection::product()
			Operation symbol_616 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_72.setName("T2");
			symbol_71.setOwnedParameteredElement(symbol_72);
			symbol_70.getOwnedParameters().add(symbol_71);
			
			symbol_616.setOwnedTemplateSignature(symbol_70);
			symbol_616.setName("product");
			symbol_616.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
			
			Parameter symbol_617 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_617.setName("c2");
			symbol_617.setType(symbol_228);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			
			symbol_616.getOwnedParameters().add(symbol_617);
			symbol_616.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionProductOperation");
			symbol_616.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE);
			{
				Comment symbol_618 = PivotFactory.eINSTANCE.createComment();
				symbol_618.setBody("The cartesian product operation of oclText[self] and c2.");
				symbol_616.getOwnedComments().add(symbol_618);
			}
			
			symbol_48.getOwnedOperations().add(symbol_616);
		}
		{	// ocl::Collection::reject()
			Iteration symbol_619 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)
			symbol_619.setName("reject");
			symbol_619.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_620 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)!i
			symbol_620.setName("i");
			symbol_620.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_619.getOwnedIterators().add(symbol_620);
			Parameter symbol_621 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)!body
			symbol_621.setName("body");
			symbol_621.setType(symbol_145);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_619.getOwnedParameters().add(symbol_621);
			symbol_619.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_619.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_622 = PivotFactory.eINSTANCE.createComment();
				symbol_622.setBody("The sub-collection of the source collection for which body is oclText[false].");
				symbol_619.getOwnedComments().add(symbol_622);
			}
			
			symbol_48.getOwnedOperations().add(symbol_619);
		}
		{	// ocl::Collection::select()
			Iteration symbol_623 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)
			symbol_623.setName("select");
			symbol_623.setType(symbol_48);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_624 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)!i
			symbol_624.setName("i");
			symbol_624.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_623.getOwnedIterators().add(symbol_624);
			Parameter symbol_625 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)!body
			symbol_625.setName("body");
			symbol_625.setType(symbol_143);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			
			symbol_623.getOwnedParameters().add(symbol_625);
			symbol_623.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_623.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_626 = PivotFactory.eINSTANCE.createComment();
				symbol_626.setBody("The sub-collection of the source collection for which body is oclText[true].");
				symbol_623.getOwnedComments().add(symbol_626);
			}
			
			symbol_48.getOwnedOperations().add(symbol_623);
		}
		{	// ocl::Collection::size()
			Operation symbol_627 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!size()
			symbol_627.setName("size");
			symbol_627.setType(symbol_12);  // Integer
			
			symbol_627.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionSizeOperation");
			symbol_627.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
			{
				Comment symbol_628 = PivotFactory.eINSTANCE.createComment();
				symbol_628.setBody("The number of elements in the collection oclText[self].");
				symbol_627.getOwnedComments().add(symbol_628);
			}
			
			symbol_48.getOwnedOperations().add(symbol_627);
		}
		{	// ocl::Collection::sortedBy()
			Iteration symbol_629 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_629.setName("sortedBy");
			symbol_629.setType(symbol_261);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			Parameter symbol_630 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_630.setName("i");
			symbol_630.setType(symbol_51); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_629.getOwnedIterators().add(symbol_630);
			Parameter symbol_631 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_631.setName("body");
			symbol_631.setType(symbol_153);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_629.getOwnedParameters().add(symbol_631);
			symbol_629.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_629.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_632 = PivotFactory.eINSTANCE.createComment();
				symbol_632.setBody("Results in the Collection containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
				symbol_629.getOwnedComments().add(symbol_632);
			}
			
			symbol_48.getOwnedOperations().add(symbol_629);
		}
		{	// ocl::Collection::sum()
			Operation symbol_633 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sum()
			symbol_633.setName("sum");
			symbol_633.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_633.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionSumOperation");
			symbol_633.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
			{
				Comment symbol_634 = PivotFactory.eINSTANCE.createComment();
				symbol_634.setBody("The addition of all elements in oclText[self].\nElements must be of an oclText[OclSummable] type to provide the zero() and sum() operations.\nThe e[sum] operation must be both associative: a.sum(b).sum(c) = a.sum(b.sum(c)), and commutative: a.sum(b) = b.sum(a).\nUnlimitedNatural, Integer and Real fulfill this condition.\n\nIf the e[sum] operation is not both associative and commutative, the e[sum] expression is not well-formed,\nwhich may result in unpredictable results during evaluation.\nIf an implementation is able to detect a lack of associativity or commutativity,\nthe implementation may bypass the evaluation and return an oclText[invalid] result.");
				symbol_633.getOwnedComments().add(symbol_634);
			}
			
			symbol_48.getOwnedOperations().add(symbol_633);
		}
		{
			Comment symbol_635 = PivotFactory.eINSTANCE.createComment();
			symbol_635.setBody("Collection is the abstract supertype of all collection types in the OCL Standard Library.\nEach occurrence of an object in a collection is called an element.\nIf an object occurs twice in a collection, there are two elements.\n\nThis sub clause defines the properties on Collections that have identical semantics for all collection subtypes.\nSome operations may be defined within the subtype as well,\nwhich means that there is an additional postcondition or a more specialized return value.\nCollection is itself an instance of the metatype CollectionType.\n\nThe definition of several common operations is different for each subtype.\nThese operations are not mentioned in this sub clause.\n\nThe semantics of the collection operations is given in the form of a postcondition that uses the IterateExp of the IteratorExp construct.\nThe semantics of those constructs is defined in Clause 10 (\u00E2\u20AC\u0153Semantics Described using UML\u00E2\u20AC\uFFFD).\nIn several cases the postcondition refers to other collection operations,\nwhich in turn are defined in terms of the IterateExp or IteratorExp constructs.\n\nWell-formedness rules\n\n[1] A collection cannot contain oclText[invalid] values.\n\ncontext Collection\ninv: self->forAll(not oclIsInvalid())");
			symbol_48.getOwnedComments().add(symbol_635);
		}
		
		symbol_0.getOwnedTypes().add(symbol_48); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
		//
		// ocl::Enumeration http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration
		//
		symbol_73.setName("Enumeration");
		symbol_73.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Enumeration::allInstances()
			Operation symbol_636 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration!allInstances()
			symbol_636.setName("allInstances");
			symbol_636.setType(symbol_276);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_636.setIsStatic(true);
			symbol_636.setImplementationClass("org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation");
			symbol_636.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
			{
				Comment symbol_637 = PivotFactory.eINSTANCE.createComment();
				symbol_637.setBody("Return a set of all enumeration values of oclText[self].");
				symbol_636.getOwnedComments().add(symbol_637);
			}
			
			symbol_73.getOwnedOperations().add(symbol_636);
		}
		{	// ocl::Enumeration::oclType()
			Operation symbol_638 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration!oclType()
			symbol_638.setName("oclType");
			symbol_638.setType(symbol_251);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_638.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_638.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			{
				Comment symbol_639 = PivotFactory.eINSTANCE.createComment();
				symbol_639.setBody("Evaluates to the type of which oclText[self] is an instance.");
				symbol_638.getOwnedComments().add(symbol_639);
			}
			
			symbol_73.getOwnedOperations().add(symbol_638);
		}
		{
			Comment symbol_640 = PivotFactory.eINSTANCE.createComment();
			symbol_640.setBody("The Enumeration type is the type of an OrderedSet of EnumerationLiteral.");
			symbol_73.getOwnedComments().add(symbol_640);
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
				Comment symbol_641 = PivotFactory.eINSTANCE.createComment();
				symbol_641.setBody("Evaluates to the literals of the enumeration.");
				symbol_78.getOwnedComments().add(symbol_641);
			}
			
			symbol_74.getOwnedAttributes().add(symbol_78);
		}
		{
			Comment symbol_642 = PivotFactory.eINSTANCE.createComment();
			symbol_642.setBody("The standard type EnumerationClassifier represents the metatype of an Enumeration.");
			symbol_74.getOwnedComments().add(symbol_642);
		}
		
		symbol_0.getOwnedTypes().add(symbol_74); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}
		//
		// ocl::EnumerationLiteral http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		//
		symbol_79.setName("EnumerationLiteral");
		symbol_79.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{
			Comment symbol_643 = PivotFactory.eINSTANCE.createComment();
			symbol_643.setBody("The standard type EnumerationLiteral represents a named constant value of an Enumeration.");
			symbol_79.getOwnedComments().add(symbol_643);
		}
		
		symbol_0.getOwnedTypes().add(symbol_79); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		//
		// ocl::OclAny http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_80.setName("OclAny");
		{	// ocl::OclAny::<>()
			Operation symbol_644 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_644.setName("<>");
			symbol_644.setType(symbol_11);  // Boolean
			
			Parameter symbol_645 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_645.setName("object2");
			symbol_645.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_644.getOwnedParameters().add(symbol_645);
			symbol_644.setPrecedence(symbol_6);
			symbol_644.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_644.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_646 = PivotFactory.eINSTANCE.createComment();
				symbol_646.setBody("True if oclText[self] is a different object from object2. Infix operator.");
				symbol_644.getOwnedComments().add(symbol_646);
			}
			
			symbol_80.getOwnedOperations().add(symbol_644);
		}
		{	// ocl::OclAny::=()
			Operation symbol_647 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_647.setName("=");
			symbol_647.setType(symbol_11);  // Boolean
			
			Parameter symbol_648 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_648.setName("object2");
			symbol_648.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_647.getOwnedParameters().add(symbol_648);
			symbol_647.setPrecedence(symbol_6);
			symbol_647.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_647.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_649 = PivotFactory.eINSTANCE.createComment();
				symbol_649.setBody("True if oclText[self] is the same object as object2. Infix operator.");
				symbol_647.getOwnedComments().add(symbol_649);
			}
			
			symbol_80.getOwnedOperations().add(symbol_647);
		}
		{	// ocl::OclAny::oclAsSet()
			Operation symbol_650 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsSet()
			symbol_650.setName("oclAsSet");
			symbol_650.setType(symbol_276);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_650.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation");
			symbol_650.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
			{
				Comment symbol_651 = PivotFactory.eINSTANCE.createComment();
				symbol_651.setBody("Returns a Set with oclText[self] as the sole content, unless oclText[self] is oclText[null] in which case returns an empty set,");
				symbol_650.getOwnedComments().add(symbol_651);
			}
			
			symbol_80.getOwnedOperations().add(symbol_650);
		}
		{	// ocl::OclAny::oclAsType()
			Operation symbol_652 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])
			symbol_83.setName("TT");
			symbol_82.setOwnedParameteredElement(symbol_83);
			symbol_81.getOwnedParameters().add(symbol_82);
			
			symbol_652.setOwnedTemplateSignature(symbol_81);
			symbol_652.setName("oclAsType");
			symbol_652.setType(symbol_83);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT
			
			Parameter symbol_653 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])!type
			symbol_653.setName("type");
			symbol_653.setType(symbol_183);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
			
			
			symbol_652.getOwnedParameters().add(symbol_653);
			symbol_652.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation");
			symbol_652.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE);
			{
				Comment symbol_654 = PivotFactory.eINSTANCE.createComment();
				symbol_654.setBody("Evaluates to oclText[self], where oclText[self] is of the type identified by T.\nThe type T may be any classifier defined in the UML model;\nif the actual type of oclText[self] at evaluation time does not conform to T,\nthen the oclAsType operation evaluates to oclText[invalid].\n\nIn the case of feature redefinition, casting an object to a supertype of its actual type\ndoes not access the supertype\u00E2\u20AC\u2122s definition of the feature;\naccording to the semantics of redefinition, the redefined feature simply does not exist for the object.\nHowever, when casting to a supertype, any features additionally defined by the subtype are suppressed.");
				symbol_652.getOwnedComments().add(symbol_654);
			}
			
			symbol_80.getOwnedOperations().add(symbol_652);
		}
		{	// ocl::OclAny::oclIsInState()
			Operation symbol_655 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInState(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState)
			symbol_655.setName("oclIsInState");
			symbol_655.setType(symbol_11);  // Boolean
			
			Parameter symbol_656 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInState(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState)!statespec
			symbol_656.setName("statespec");
			symbol_656.setType(symbol_97);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
			
			
			symbol_655.getOwnedParameters().add(symbol_656);
			symbol_655.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation");
			symbol_655.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE);
			{
				Comment symbol_657 = PivotFactory.eINSTANCE.createComment();
				symbol_657.setBody("Evaluates to oclText[true] if the oclText[self] is in the state indentified by statespec.");
				symbol_655.getOwnedComments().add(symbol_657);
			}
			
			symbol_80.getOwnedOperations().add(symbol_655);
		}
		{	// ocl::OclAny::oclIsInvalid()
			Operation symbol_658 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInvalid()
			symbol_658.setName("oclIsInvalid");
			symbol_658.setType(symbol_11);  // Boolean
			
			symbol_658.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation");
			symbol_658.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
			{
				Comment symbol_659 = PivotFactory.eINSTANCE.createComment();
				symbol_659.setBody("Evaluates to oclText[true] if the oclText[self] is equal to OclInvalid.");
				symbol_658.getOwnedComments().add(symbol_659);
			}
			
			symbol_80.getOwnedOperations().add(symbol_658);
		}
		{	// ocl::OclAny::oclIsKindOf()
			Operation symbol_660 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])
			symbol_86.setName("T");
			symbol_85.setOwnedParameteredElement(symbol_86);
			symbol_84.getOwnedParameters().add(symbol_85);
			
			symbol_660.setOwnedTemplateSignature(symbol_84);
			symbol_660.setName("oclIsKindOf");
			symbol_660.setType(symbol_11);  // Boolean
			
			Parameter symbol_661 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])!type
			symbol_661.setName("type");
			symbol_661.setType(symbol_184);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
			
			
			symbol_660.getOwnedParameters().add(symbol_661);
			symbol_660.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation");
			symbol_660.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
			{
				Comment symbol_662 = PivotFactory.eINSTANCE.createComment();
				symbol_662.setBody("Evaluates to oclText[true] if the type of oclText[self] conforms to t.\nThat is, oclText[self] is of type t or a subtype of t.");
				symbol_660.getOwnedComments().add(symbol_662);
			}
			
			symbol_80.getOwnedOperations().add(symbol_660);
		}
		{	// ocl::OclAny::oclIsNew()
			Operation symbol_663 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsNew()
			symbol_663.setName("oclIsNew");
			symbol_663.setType(symbol_11);  // Boolean
			
			symbol_663.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_663.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_664 = PivotFactory.eINSTANCE.createComment();
				symbol_664.setBody("Can only be used in a postcondition.\nEvaluates to oclText[true] if the oclText[self] is created during performing the operation (for instance, it didn\u00E2\u20AC\u2122t exist at precondition time).");
				symbol_663.getOwnedComments().add(symbol_664);
			}
			
			symbol_80.getOwnedOperations().add(symbol_663);
		}
		{	// ocl::OclAny::oclIsTypeOf()
			Operation symbol_665 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])
			symbol_89.setName("T");
			symbol_88.setOwnedParameteredElement(symbol_89);
			symbol_87.getOwnedParameters().add(symbol_88);
			
			symbol_665.setOwnedTemplateSignature(symbol_87);
			symbol_665.setName("oclIsTypeOf");
			symbol_665.setType(symbol_11);  // Boolean
			
			Parameter symbol_666 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])!type
			symbol_666.setName("type");
			symbol_666.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
			
			
			symbol_665.getOwnedParameters().add(symbol_666);
			symbol_665.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation");
			symbol_665.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
			{
				Comment symbol_667 = PivotFactory.eINSTANCE.createComment();
				symbol_667.setBody("Evaluates to oclText[true] if oclText[self] is of the type t but not a subtype of t");
				symbol_665.getOwnedComments().add(symbol_667);
			}
			
			symbol_80.getOwnedOperations().add(symbol_665);
		}
		{	// ocl::OclAny::oclIsUndefined()
			Operation symbol_668 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsUndefined()
			symbol_668.setName("oclIsUndefined");
			symbol_668.setType(symbol_11);  // Boolean
			
			symbol_668.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation");
			symbol_668.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
			{
				Comment symbol_669 = PivotFactory.eINSTANCE.createComment();
				symbol_669.setBody("Evaluates to oclText[true] if the oclText[self] is equal to oclText[invalid] or equal to oclText[null].");
				symbol_668.getOwnedComments().add(symbol_669);
			}
			
			symbol_80.getOwnedOperations().add(symbol_668);
		}
		{	// ocl::OclAny::oclType()
			Operation symbol_670 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclType()
			symbol_670.setName("oclType");
			symbol_670.setType(symbol_188);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_670.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_670.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			{
				Comment symbol_671 = PivotFactory.eINSTANCE.createComment();
				symbol_671.setBody("Evaluates to the type of which oclText[self] is an instance.");
				symbol_670.getOwnedComments().add(symbol_671);
			}
			
			symbol_80.getOwnedOperations().add(symbol_670);
		}
		{
			Comment symbol_672 = PivotFactory.eINSTANCE.createComment();
			symbol_672.setBody("All types in the UML model and the primitive and collection types in the OCL standard library conforms to the type OclAny.\nConceptually, OclAny behaves as a supertype for all the types.\nFeatures of OclAny are available on each object in all OCL expressions.\nOclAny is itself an instance of the metatype AnyType.\n\nAll classes in a UML model inherit all operations defined on OclAny.\nTo avoid name conflicts between properties in the model and the properties inherited from OclAny,\nall names on the properties of OclAny start with \u00E2\u20AC\u02DCocl.\u00E2\u20AC\u2122\nAlthough theoretically there may still be name conflicts, they can be avoided.\nOne can also use qualification by OclAny (name of the type) to explicitly refer to the OclAny properties.\n\nOperations of OclAny, where the instance of OclAny is called object.");
			symbol_80.getOwnedComments().add(symbol_672);
		}
		
		symbol_0.getOwnedTypes().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::OclComparable http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		//
		symbol_90.setName("OclComparable");
		symbol_90.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclComparable::compareTo()
			Operation symbol_673 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_673.setName("compareTo");
			symbol_673.setType(symbol_12);  // Integer
			
			Parameter symbol_674 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_674.setName("that");
			symbol_674.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_673.getOwnedParameters().add(symbol_674);
			{
				Comment symbol_675 = PivotFactory.eINSTANCE.createComment();
				symbol_675.setBody("Return -ve, 0, +ve according to whether self is less than, equal to , or greater than that.\n\nThe compareTo operation should be commutative.");
				symbol_673.getOwnedComments().add(symbol_675);
			}
			
			symbol_90.getOwnedOperations().add(symbol_673);
		}
		{
			Comment symbol_676 = PivotFactory.eINSTANCE.createComment();
			symbol_676.setBody("The type OclComparable defines the compareTo operation used by the sortedBy iteration. Only types that provide a derived\ncompareTo implementation may be sorted.");
			symbol_90.getOwnedComments().add(symbol_676);
		}
		
		symbol_0.getOwnedTypes().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		//
		// ocl::OclElement http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		//
		symbol_91.setName("OclElement");
		symbol_91.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclElement::allInstances()
			Operation symbol_677 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!allInstances()
			symbol_677.setName("allInstances");
			symbol_677.setType(symbol_276);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_677.setIsStatic(true);
			symbol_677.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation");
			symbol_677.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
			{
				Comment symbol_678 = PivotFactory.eINSTANCE.createComment();
				symbol_678.setBody("Return a set of all instances of the type and derived types of self.");
				symbol_677.getOwnedComments().add(symbol_678);
			}
			
			symbol_91.getOwnedOperations().add(symbol_677);
		}
		{	// ocl::OclElement::oclContainer()
			Operation symbol_679 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer()
			symbol_679.setName("oclContainer");
			symbol_679.setType(symbol_91);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
			
			symbol_679.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation");
			symbol_679.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation.INSTANCE);
			{
				Comment symbol_680 = PivotFactory.eINSTANCE.createComment();
				symbol_680.setBody("Returns the object for which self is a composed content or null if there is no such object.");
				symbol_679.getOwnedComments().add(symbol_680);
			}
			
			symbol_91.getOwnedOperations().add(symbol_679);
		}
		{	// ocl::OclElement::oclContents()
			Operation symbol_681 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents()
			symbol_681.setName("oclContents");
			symbol_681.setType(symbol_275);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
			
			symbol_681.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation");
			symbol_681.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation.INSTANCE);
			{
				Comment symbol_682 = PivotFactory.eINSTANCE.createComment();
				symbol_682.setBody("Returns the composed contents of self.");
				symbol_681.getOwnedComments().add(symbol_682);
			}
			
			symbol_91.getOwnedOperations().add(symbol_681);
		}
		{
			Comment symbol_683 = PivotFactory.eINSTANCE.createComment();
			symbol_683.setBody("The type OclElement is the implicit supertype of any user-defined type that has no explicit supertypes. Operations defined\nfor OclElement are therefore applicable to all user-defined types.");
			symbol_91.getOwnedComments().add(symbol_683);
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
			Operation symbol_684 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_684.setName("<>");
			symbol_684.setType(symbol_11);  // Boolean
			
			Parameter symbol_685 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_685.setName("object2");
			symbol_685.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_684.getOwnedParameters().add(symbol_685);
			symbol_684.setPrecedence(symbol_6);
			symbol_684.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_684.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			{
				Comment symbol_686 = PivotFactory.eINSTANCE.createComment();
				symbol_686.setBody("Returns oclText[invalid].");
				symbol_684.getOwnedComments().add(symbol_686);
			}
			
			symbol_92.getOwnedOperations().add(symbol_684);
		}
		{	// ocl::OclInvalid::=()
			Operation symbol_687 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_687.setName("=");
			symbol_687.setType(symbol_11);  // Boolean
			
			Parameter symbol_688 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_688.setName("object2");
			symbol_688.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_687.getOwnedParameters().add(symbol_688);
			symbol_687.setPrecedence(symbol_6);
			symbol_687.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_687.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_689 = PivotFactory.eINSTANCE.createComment();
				symbol_689.setBody("Returns oclText[invalid].");
				symbol_687.getOwnedComments().add(symbol_689);
			}
			
			symbol_92.getOwnedOperations().add(symbol_687);
		}
		{	// ocl::OclInvalid::allInstances()
			Operation symbol_690 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!allInstances()
			symbol_690.setName("allInstances");
			symbol_690.setType(symbol_276);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_690.setIsStatic(true);
			symbol_690.setImplementationClass("org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation");
			symbol_690.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
			{
				Comment symbol_691 = PivotFactory.eINSTANCE.createComment();
				symbol_691.setBody("Returns oclText[invalid].");
				symbol_690.getOwnedComments().add(symbol_691);
			}
			
			symbol_92.getOwnedOperations().add(symbol_690);
		}
		{	// ocl::OclInvalid::oclBadOperation()
			Operation symbol_692 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!oclBadOperation()
			symbol_692.setName("oclBadOperation");
			symbol_692.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
			
			
			symbol_92.getOwnedOperations().add(symbol_692);
		}
		{	// ocl::OclInvalid::toString()
			Operation symbol_693 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!toString()
			symbol_693.setName("toString");
			symbol_693.setType(symbol_14);  // String
			
			symbol_693.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_693.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_694 = PivotFactory.eINSTANCE.createComment();
				symbol_694.setBody("Returns \'invalid\'.");
				symbol_693.getOwnedComments().add(symbol_694);
			}
			
			symbol_92.getOwnedOperations().add(symbol_693);
		}
		{
			Comment symbol_695 = PivotFactory.eINSTANCE.createComment();
			symbol_695.setBody("The type OclInvalid is a type that conforms to all other types.\nIt has one single instance, identified as  oclText[invalid].\nAny property call applied on invalid results in oclText[invalid], except for the operations oclIsUndefined() and oclIsInvalid().\nOclInvalid is itself an instance of the metatype InvalidType.");
			symbol_92.getOwnedComments().add(symbol_695);
		}
		
		symbol_0.getOwnedTypes().add(symbol_92); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
		//
		// ocl::OclLambda http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		//
		symbol_94.setName("OclLambda");
		symbol_94.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{
			Comment symbol_696 = PivotFactory.eINSTANCE.createComment();
			symbol_696.setBody("The type OclLambda is the implicit supertype of all Lambda types. The operations defined for OclLambda\ntherefore apply to all lambda expressions.");
			symbol_94.getOwnedComments().add(symbol_696);
		}
		
		symbol_0.getOwnedTypes().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		//
		// ocl::OclMessage http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		//
		symbol_95.setName("OclMessage");
		symbol_95.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclMessage::hasReturned()
			Operation symbol_697 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!hasReturned()
			symbol_697.setName("hasReturned");
			symbol_697.setType(symbol_11);  // Boolean
			
			symbol_697.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_697.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_698 = PivotFactory.eINSTANCE.createComment();
				symbol_698.setBody("True if type of template parameter is an operation call, and the called operation has returned a value.\nThis implies the fact that the message has been sent. False in all other cases.");
				symbol_697.getOwnedComments().add(symbol_698);
			}
			
			symbol_95.getOwnedOperations().add(symbol_697);
		}
		{	// ocl::OclMessage::isOperationCall()
			Operation symbol_699 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!isOperationCall()
			symbol_699.setName("isOperationCall");
			symbol_699.setType(symbol_11);  // Boolean
			
			symbol_699.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_699.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_700 = PivotFactory.eINSTANCE.createComment();
				symbol_700.setBody("Returns oclText[true] if the OclMessage represents the sending of a UML Operation call.");
				symbol_699.getOwnedComments().add(symbol_700);
			}
			
			symbol_95.getOwnedOperations().add(symbol_699);
		}
		{	// ocl::OclMessage::isSignalSent()
			Operation symbol_701 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!isSignalSent()
			symbol_701.setName("isSignalSent");
			symbol_701.setType(symbol_11);  // Boolean
			
			symbol_701.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_701.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_702 = PivotFactory.eINSTANCE.createComment();
				symbol_702.setBody("Returns oclText[true] if the OclMessage represents the sending of a UML Signal.");
				symbol_701.getOwnedComments().add(symbol_702);
			}
			
			symbol_95.getOwnedOperations().add(symbol_701);
		}
		{	// ocl::OclMessage::result()
			Operation symbol_703 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!result()
			symbol_703.setName("result");
			symbol_703.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_703.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_703.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			{
				Comment symbol_704 = PivotFactory.eINSTANCE.createComment();
				symbol_704.setBody("Returns the result of the called operation, if type of template parameter is an operation call,\nand the called operation has returned a value. Otherwise the oclText[invalid] value is returned.");
				symbol_703.getOwnedComments().add(symbol_704);
			}
			
			symbol_95.getOwnedOperations().add(symbol_703);
		}
		{
			Comment symbol_705 = PivotFactory.eINSTANCE.createComment();
			symbol_705.setBody("OclMessage\nThis sub clause contains the definition of the standard type OclMessage.\nAs defined in this sub clause, each ocl message type is actually a template type with one parameter.\n\u00E2\u20AC\u02DCT\u00E2\u20AC\u2122 denotes the parameter.\nA concrete ocl message type is created by substituting an operation or signal for the T.\n\nThe predefined type OclMessage is an instance of MessageType.\nEvery OclMessage is fully determined by either the operation, or signal given as parameter.\nNote that there is conceptually an undefined (infinite) number of these types,\nas each is determined by a different operation or signal.\nThese types are unnamed. Every type has as attributes the name of the operation or signal,\nand either all formal parameters of the operation, or all attributes of the signal.\nOclMessage is itself an instance of the metatype MessageType.\n\nOclMessage has a number of predefined operations, as shown in the OCL Standard Library.");
			symbol_95.getOwnedComments().add(symbol_705);
		}
		
		symbol_0.getOwnedTypes().add(symbol_95); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		//
		// ocl::OclSelf http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
		//
		symbol_96.setName("OclSelf");
		symbol_96.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{
			Comment symbol_706 = PivotFactory.eINSTANCE.createComment();
			symbol_706.setBody("The pseudo-type OclSelf denotes the statically determinate type of oclText[self] in Operation\nand Iteration signatures. Instances of OclSelf are never created.");
			symbol_96.getOwnedComments().add(symbol_706);
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
			Operation symbol_707 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable!sum(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_707.setName("sum");
			symbol_707.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			Parameter symbol_708 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable!sum(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_708.setName("that");
			symbol_708.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_707.getOwnedParameters().add(symbol_708);
			{
				Comment symbol_709 = PivotFactory.eINSTANCE.createComment();
				symbol_709.setBody("Return the sum of self and that.\n\nThe sum operation should be associative.");
				symbol_707.getOwnedComments().add(symbol_709);
			}
			
			symbol_98.getOwnedOperations().add(symbol_707);
		}
		{	// ocl::OclSummable::zero()
			Operation symbol_710 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable!zero()
			symbol_710.setName("zero");
			symbol_710.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			{
				Comment symbol_711 = PivotFactory.eINSTANCE.createComment();
				symbol_711.setBody("Return the \'zero\' value of self to initialize a summation.\n\nzero().sum(self) = self.");
				symbol_710.getOwnedComments().add(symbol_711);
			}
			
			symbol_98.getOwnedOperations().add(symbol_710);
		}
		{
			Comment symbol_712 = PivotFactory.eINSTANCE.createComment();
			symbol_712.setBody("The type OclSummable defines the sum and zero operations used by the Collection::sum iteration. Only types that provide derived\nsum and zero implementations may be summed.");
			symbol_98.getOwnedComments().add(symbol_712);
		}
		
		symbol_0.getOwnedTypes().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		//
		// ocl::OclTuple http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		//
		symbol_99.setName("OclTuple");
		symbol_99.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclTuple::<>()
			Operation symbol_713 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_713.setName("<>");
			symbol_713.setType(symbol_11);  // Boolean
			
			Parameter symbol_714 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_714.setName("object2");
			symbol_714.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_713.getOwnedParameters().add(symbol_714);
			symbol_713.setPrecedence(symbol_6);
			symbol_713.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_713.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_99.getOwnedOperations().add(symbol_713);
		}
		{	// ocl::OclTuple::=()
			Operation symbol_715 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_715.setName("=");
			symbol_715.setType(symbol_11);  // Boolean
			
			Parameter symbol_716 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_716.setName("object2");
			symbol_716.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_715.getOwnedParameters().add(symbol_716);
			symbol_715.setPrecedence(symbol_6);
			symbol_715.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_715.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			
			symbol_99.getOwnedOperations().add(symbol_715);
		}
		{
			Comment symbol_717 = PivotFactory.eINSTANCE.createComment();
			symbol_717.setBody("The type OclTuple is the implicit supertype of all Tuple types. The operations defined for OclTuple\ntherefore apply to all tuples.");
			symbol_99.getOwnedComments().add(symbol_717);
		}
		
		symbol_0.getOwnedTypes().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		//
		// ocl::OclType http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		//
		symbol_100.setName("OclType");
		symbol_100.getSuperClasses().add(symbol_91); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		{	// ocl::OclType::conformsTo()
			Operation symbol_718 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType!conformsTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType)
			symbol_718.setName("conformsTo");
			symbol_718.setType(symbol_11);  // Boolean
			
			Parameter symbol_719 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType!conformsTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType)!type2
			symbol_719.setName("type2");
			symbol_719.setType(symbol_100);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
			
			
			symbol_718.getOwnedParameters().add(symbol_719);
			symbol_718.setImplementationClass("org.eclipse.ocl.examples.library.classifier.OclTypeConformsToOperation");
			symbol_718.setImplementation(org.eclipse.ocl.examples.library.classifier.OclTypeConformsToOperation.INSTANCE);
			{
				Comment symbol_720 = PivotFactory.eINSTANCE.createComment();
				symbol_720.setBody("Returns true if type2 conforms to self.");
				symbol_718.getOwnedComments().add(symbol_720);
			}
			
			symbol_100.getOwnedOperations().add(symbol_718);
		}
		{
			Comment symbol_721 = PivotFactory.eINSTANCE.createComment();
			symbol_721.setBody("The type OclType is the implicit supertype of any UML type. Operations defined\nfor OclType are therefore applicable to all UML types.");
			symbol_100.getOwnedComments().add(symbol_721);
		}
		
		symbol_0.getOwnedTypes().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		//
		// ocl::OclVoid http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		//
		symbol_101.setName("OclVoid");
		symbol_101.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclVoid::<>()
			Operation symbol_722 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_722.setName("<>");
			symbol_722.setType(symbol_11);  // Boolean
			
			Parameter symbol_723 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_723.setName("object2");
			symbol_723.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_722.getOwnedParameters().add(symbol_723);
			symbol_722.setPrecedence(symbol_6);
			symbol_722.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_722.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_101.getOwnedOperations().add(symbol_722);
		}
		{	// ocl::OclVoid::=()
			Operation symbol_724 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_724.setName("=");
			symbol_724.setType(symbol_11);  // Boolean
			
			Parameter symbol_725 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_725.setName("object2");
			symbol_725.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_724.getOwnedParameters().add(symbol_725);
			symbol_724.setPrecedence(symbol_6);
			symbol_724.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_724.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_726 = PivotFactory.eINSTANCE.createComment();
				symbol_726.setBody("Redefines the OclAny operation, returning oclText[true] if object is oclText[null], oclText[invalid]\nif object is oclText[invalid], oclText[false] otherwise.");
				symbol_724.getOwnedComments().add(symbol_726);
			}
			
			symbol_101.getOwnedOperations().add(symbol_724);
		}
		{	// ocl::OclVoid::allInstances()
			Operation symbol_727 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!allInstances()
			symbol_727.setName("allInstances");
			symbol_727.setType(symbol_276);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_727.setIsStatic(true);
			symbol_727.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation");
			symbol_727.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
			{
				Comment symbol_728 = PivotFactory.eINSTANCE.createComment();
				symbol_728.setBody("Returns oclText[Set{null}].");
				symbol_727.getOwnedComments().add(symbol_728);
			}
			
			symbol_101.getOwnedOperations().add(symbol_727);
		}
		{	// ocl::OclVoid::and()
			Operation symbol_729 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!and(Boolean)
			symbol_729.setName("and");
			symbol_729.setType(symbol_11);  // Boolean
			
			Parameter symbol_730 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!and(Boolean)!b
			symbol_730.setName("b");
			symbol_730.setType(symbol_11);  // Boolean
			
			
			symbol_729.getOwnedParameters().add(symbol_730);
			symbol_729.setPrecedence(symbol_7);
			symbol_729.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation");
			symbol_729.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE);
			
			symbol_101.getOwnedOperations().add(symbol_729);
		}
		{	// ocl::OclVoid::implies()
			Operation symbol_731 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!implies(Boolean)
			symbol_731.setName("implies");
			symbol_731.setType(symbol_11);  // Boolean
			
			Parameter symbol_732 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!implies(Boolean)!b
			symbol_732.setName("b");
			symbol_732.setType(symbol_11);  // Boolean
			
			
			symbol_731.getOwnedParameters().add(symbol_732);
			symbol_731.setPrecedence(symbol_10);
			symbol_731.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation");
			symbol_731.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE);
			
			symbol_101.getOwnedOperations().add(symbol_731);
		}
		{	// ocl::OclVoid::or()
			Operation symbol_733 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!or(Boolean)
			symbol_733.setName("or");
			symbol_733.setType(symbol_11);  // Boolean
			
			Parameter symbol_734 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!or(Boolean)!b
			symbol_734.setName("b");
			symbol_734.setType(symbol_11);  // Boolean
			
			
			symbol_733.getOwnedParameters().add(symbol_734);
			symbol_733.setPrecedence(symbol_8);
			symbol_733.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation");
			symbol_733.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE);
			
			symbol_101.getOwnedOperations().add(symbol_733);
		}
		{	// ocl::OclVoid::toString()
			Operation symbol_735 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!toString()
			symbol_735.setName("toString");
			symbol_735.setType(symbol_14);  // String
			
			symbol_735.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_735.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			{
				Comment symbol_736 = PivotFactory.eINSTANCE.createComment();
				symbol_736.setBody("Returns oclText[null].");
				symbol_735.getOwnedComments().add(symbol_736);
			}
			
			symbol_101.getOwnedOperations().add(symbol_735);
		}
		{
			Comment symbol_737 = PivotFactory.eINSTANCE.createComment();
			symbol_737.setBody("The type OclVoid is a type that conforms to all other types except OclInvalid.\nIt has one single instance, identified as oclText[null], that corresponds with the UML LiteralNull value specification.\nAny property call applied on oclText[null] results in oclText[invalid], except for the\noclIsUndefined(), oclIsInvalid(), =(OclAny) and <>(OclAny) operations.\nHowever, by virtue of the implicit conversion to a collection literal,\nan expression evaluating to oclText[null] can be used as source of collection operations (such as \u00E2\u20AC\u02DCisEmpty\u00E2\u20AC\u2122).\nIf the source is the oclText[null] literal, it is implicitly converted to Bag{}.\n\nOclVoid is itself an instance of the metatype VoidType.");
			symbol_101.getOwnedComments().add(symbol_737);
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
			Operation symbol_738 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_738.setName("-");
			symbol_738.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_739 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_739.setName("s");
			symbol_739.setType(symbol_287);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			
			symbol_738.getOwnedParameters().add(symbol_739);
			symbol_738.setPrecedence(symbol_4);
			symbol_738.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_738.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			{
				Comment symbol_740 = PivotFactory.eINSTANCE.createComment();
				symbol_740.setBody("The elements of oclText[self], which are not in s.");
				symbol_738.getOwnedComments().add(symbol_740);
			}
			
			symbol_102.getOwnedOperations().add(symbol_738);
		}
		{	// ocl::OrderedSet::<>()
			Operation symbol_741 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_741.setName("<>");
			symbol_741.setType(symbol_11);  // Boolean
			
			Parameter symbol_742 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_742.setName("object2");
			symbol_742.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_741.getOwnedParameters().add(symbol_742);
			symbol_741.setPrecedence(symbol_6);
			symbol_741.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_741.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_102.getOwnedOperations().add(symbol_741);
		}
		{	// ocl::OrderedSet::=()
			Operation symbol_743 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_743.setName("=");
			symbol_743.setType(symbol_11);  // Boolean
			
			Parameter symbol_744 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_744.setName("object2");
			symbol_744.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_743.getOwnedParameters().add(symbol_744);
			symbol_743.setPrecedence(symbol_6);
			symbol_743.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_743.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			
			symbol_102.getOwnedOperations().add(symbol_743);
		}
		{	// ocl::OrderedSet::append()
			Operation symbol_745 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!append(T)
			symbol_745.setName("append");
			symbol_745.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_746 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!append(T)!object
			symbol_746.setName("object");
			symbol_746.setType(symbol_105);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			
			symbol_745.getOwnedParameters().add(symbol_746);
			symbol_745.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation");
			symbol_745.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			{
				Comment symbol_747 = PivotFactory.eINSTANCE.createComment();
				symbol_747.setBody("The set of elements, consisting of all elements of oclText[self], followed by object.");
				symbol_745.getOwnedComments().add(symbol_747);
			}
			
			symbol_102.getOwnedOperations().add(symbol_745);
		}
		{	// ocl::OrderedSet::excluding()
			Operation symbol_748 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_748.setName("excluding");
			symbol_748.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_749 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_749.setName("object");
			symbol_749.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_748.getOwnedParameters().add(symbol_749);
			symbol_748.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_748.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_750 = PivotFactory.eINSTANCE.createComment();
				symbol_750.setBody("The ordered set  containing all elements of oclText[self] apart from object.\n\nThe order of the remaining elements is not changed.");
				symbol_748.getOwnedComments().add(symbol_750);
			}
			
			symbol_102.getOwnedOperations().add(symbol_748);
		}
		{	// ocl::OrderedSet::flatten()
			Operation symbol_751 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()
			symbol_108.setName("T2");
			symbol_107.setOwnedParameteredElement(symbol_108);
			symbol_106.getOwnedParameters().add(symbol_107);
			
			symbol_751.setOwnedTemplateSignature(symbol_106);
			symbol_751.setName("flatten");
			symbol_751.setType(symbol_254);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
			
			symbol_751.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_751.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			
			symbol_102.getOwnedOperations().add(symbol_751);
		}
		{	// ocl::OrderedSet::including()
			Operation symbol_752 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!including(T)
			symbol_752.setName("including");
			symbol_752.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_753 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!including(T)!object
			symbol_753.setName("object");
			symbol_753.setType(symbol_105);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			
			symbol_752.getOwnedParameters().add(symbol_753);
			symbol_752.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_752.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_754 = PivotFactory.eINSTANCE.createComment();
				symbol_754.setBody("The ordered set containing all elements of oclText[self] plus object added as the last element if not already present.");
				symbol_752.getOwnedComments().add(symbol_754);
			}
			
			symbol_102.getOwnedOperations().add(symbol_752);
		}
		{	// ocl::OrderedSet::insertAt()
			Operation symbol_755 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)
			symbol_755.setName("insertAt");
			symbol_755.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_756 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)!index
			symbol_756.setName("index");
			symbol_756.setType(symbol_12);  // Integer
			
			
			symbol_755.getOwnedParameters().add(symbol_756);
			Parameter symbol_757 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)!object
			symbol_757.setName("object");
			symbol_757.setType(symbol_105);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			
			symbol_755.getOwnedParameters().add(symbol_757);
			symbol_755.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation");
			symbol_755.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			{
				Comment symbol_758 = PivotFactory.eINSTANCE.createComment();
				symbol_758.setBody("The ordered set consisting of oclText[self] with object present at position index.");
				symbol_755.getOwnedComments().add(symbol_758);
			}
			
			symbol_102.getOwnedOperations().add(symbol_755);
		}
		{	// ocl::OrderedSet::intersection()
			Operation symbol_759 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_759.setName("intersection");
			symbol_759.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_760 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!o
			symbol_760.setName("o");
			symbol_760.setType(symbol_241);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
			
			
			symbol_759.getOwnedParameters().add(symbol_760);
			symbol_759.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation");
			symbol_759.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE);
			
			symbol_102.getOwnedOperations().add(symbol_759);
		}
		{	// ocl::OrderedSet::prepend()
			Operation symbol_761 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!prepend(T)
			symbol_761.setName("prepend");
			symbol_761.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_762 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!prepend(T)!object
			symbol_762.setName("object");
			symbol_762.setType(symbol_105);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			
			symbol_761.getOwnedParameters().add(symbol_762);
			symbol_761.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation");
			symbol_761.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			{
				Comment symbol_763 = PivotFactory.eINSTANCE.createComment();
				symbol_763.setBody("The sequence consisting of object, followed by all elements in oclText[self].");
				symbol_761.getOwnedComments().add(symbol_763);
			}
			
			symbol_102.getOwnedOperations().add(symbol_761);
		}
		{	// ocl::OrderedSet::reject()
			Iteration symbol_764 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)
			symbol_764.setName("reject");
			symbol_764.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_765 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)!i
			symbol_765.setName("i");
			symbol_765.setType(symbol_105); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_764.getOwnedIterators().add(symbol_765);
			Parameter symbol_766 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)!body
			symbol_766.setName("body");
			symbol_766.setType(symbol_154);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
			
			
			symbol_764.getOwnedParameters().add(symbol_766);
			symbol_764.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_764.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_767 = PivotFactory.eINSTANCE.createComment();
				symbol_767.setBody("The ordered set of the source ordered set for which body is oclText[false].");
				symbol_764.getOwnedComments().add(symbol_767);
			}
			
			symbol_102.getOwnedOperations().add(symbol_764);
		}
		{	// ocl::OrderedSet::reverse()
			Operation symbol_768 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reverse()
			symbol_768.setName("reverse");
			symbol_768.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			symbol_768.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_768.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			{
				Comment symbol_769 = PivotFactory.eINSTANCE.createComment();
				symbol_769.setBody("The ordered set of elements with same elements but with the opposite order.");
				symbol_768.getOwnedComments().add(symbol_769);
			}
			
			symbol_102.getOwnedOperations().add(symbol_768);
		}
		{	// ocl::OrderedSet::select()
			Iteration symbol_770 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)
			symbol_770.setName("select");
			symbol_770.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_771 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)!i
			symbol_771.setName("i");
			symbol_771.setType(symbol_105); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_770.getOwnedIterators().add(symbol_771);
			Parameter symbol_772 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)!body
			symbol_772.setName("body");
			symbol_772.setType(symbol_155);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
			
			
			symbol_770.getOwnedParameters().add(symbol_772);
			symbol_770.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_770.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_773 = PivotFactory.eINSTANCE.createComment();
				symbol_773.setBody("The ordered set of the source ordered set for which body is oclText[true]");
				symbol_770.getOwnedComments().add(symbol_773);
			}
			
			symbol_102.getOwnedOperations().add(symbol_770);
		}
		{	// ocl::OrderedSet::sortedBy()
			Iteration symbol_774 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_774.setName("sortedBy");
			symbol_774.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_775 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_775.setName("i");
			symbol_775.setType(symbol_105); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_774.getOwnedIterators().add(symbol_775);
			Parameter symbol_776 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_776.setName("body");
			symbol_776.setType(symbol_156);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_774.getOwnedParameters().add(symbol_776);
			symbol_774.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_774.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_777 = PivotFactory.eINSTANCE.createComment();
				symbol_777.setBody("Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
				symbol_774.getOwnedComments().add(symbol_777);
			}
			
			symbol_102.getOwnedOperations().add(symbol_774);
		}
		{	// ocl::OrderedSet::subOrderedSet()
			Operation symbol_778 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)
			symbol_778.setName("subOrderedSet");
			symbol_778.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_779 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)!lower
			symbol_779.setName("lower");
			symbol_779.setType(symbol_12);  // Integer
			
			
			symbol_778.getOwnedParameters().add(symbol_779);
			Parameter symbol_780 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)!upper
			symbol_780.setName("upper");
			symbol_780.setType(symbol_12);  // Integer
			
			
			symbol_778.getOwnedParameters().add(symbol_780);
			symbol_778.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation");
			symbol_778.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE);
			{
				Comment symbol_781 = PivotFactory.eINSTANCE.createComment();
				symbol_781.setBody("The sub-set of oclText[self] starting at number lower, up to and including element number upper.");
				symbol_778.getOwnedComments().add(symbol_781);
			}
			
			symbol_102.getOwnedOperations().add(symbol_778);
		}
		{	// ocl::OrderedSet::union()
			Operation symbol_782 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[T])
			symbol_782.setName("union");
			symbol_782.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_783 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[T])!o
			symbol_783.setName("o");
			symbol_783.setType(symbol_264);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
			
			
			symbol_782.getOwnedParameters().add(symbol_783);
			symbol_782.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_782.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_784 = PivotFactory.eINSTANCE.createComment();
				symbol_784.setBody("The ordered set consisting of all elements in oclText[self] and all elements in o.");
				symbol_782.getOwnedComments().add(symbol_784);
			}
			
			symbol_102.getOwnedOperations().add(symbol_782);
		}
		{
			Comment symbol_785 = PivotFactory.eINSTANCE.createComment();
			symbol_785.setBody("The OrderedSet is a Set, the elements of which are ordered.\nIt contains no duplicates. OrderedSet is itself an instance of the metatype OrderedSetType.\nAn OrderedSet is not a subtype of Set, neither a subtype of Sequence.\nThe common supertype of Sets and OrderedSets is Collection.");
			symbol_102.getOwnedComments().add(symbol_785);
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
			Operation symbol_786 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_786.setName("<>");
			symbol_786.setType(symbol_11);  // Boolean
			
			Parameter symbol_787 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_787.setName("object2");
			symbol_787.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_786.getOwnedParameters().add(symbol_787);
			symbol_786.setPrecedence(symbol_6);
			symbol_786.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_786.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_109.getOwnedOperations().add(symbol_786);
		}
		{	// ocl::Sequence::=()
			Operation symbol_788 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_788.setName("=");
			symbol_788.setType(symbol_11);  // Boolean
			
			Parameter symbol_789 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_789.setName("object2");
			symbol_789.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_788.getOwnedParameters().add(symbol_789);
			symbol_788.setPrecedence(symbol_6);
			symbol_788.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_788.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_790 = PivotFactory.eINSTANCE.createComment();
				symbol_790.setBody("True if oclText[self] contains the same elements as s in the same order.");
				symbol_788.getOwnedComments().add(symbol_790);
			}
			
			symbol_109.getOwnedOperations().add(symbol_788);
		}
		{	// ocl::Sequence::append()
			Operation symbol_791 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!append(T)
			symbol_791.setName("append");
			symbol_791.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_792 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!append(T)!object
			symbol_792.setName("object");
			symbol_792.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			
			symbol_791.getOwnedParameters().add(symbol_792);
			symbol_791.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation");
			symbol_791.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			{
				Comment symbol_793 = PivotFactory.eINSTANCE.createComment();
				symbol_793.setBody("The sequence of elements, consisting of all elements of oclText[self], followed by object.");
				symbol_791.getOwnedComments().add(symbol_793);
			}
			
			symbol_109.getOwnedOperations().add(symbol_791);
		}
		{	// ocl::Sequence::at()
			Operation symbol_794 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!at(Integer)
			symbol_794.setName("at");
			symbol_794.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			Parameter symbol_795 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!at(Integer)!index
			symbol_795.setName("index");
			symbol_795.setType(symbol_12);  // Integer
			
			
			symbol_794.getOwnedParameters().add(symbol_795);
			symbol_794.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation");
			symbol_794.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE);
			{
				Comment symbol_796 = PivotFactory.eINSTANCE.createComment();
				symbol_796.setBody("The i-th element of sequence.");
				symbol_794.getOwnedComments().add(symbol_796);
			}
			
			symbol_109.getOwnedOperations().add(symbol_794);
		}
		{	// ocl::Sequence::closure()
			Iteration symbol_797 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])
			symbol_797.setName("closure");
			symbol_797.setType(symbol_255);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
			
			Parameter symbol_798 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])!i
			symbol_798.setName("i");
			symbol_798.setType(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_797.getOwnedIterators().add(symbol_798);
			Parameter symbol_799 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])!body
			symbol_799.setName("body");
			symbol_799.setType(symbol_160);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
			
			
			symbol_797.getOwnedParameters().add(symbol_799);
			symbol_797.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ClosureIteration");
			symbol_797.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			{
				Comment symbol_800 = PivotFactory.eINSTANCE.createComment();
				symbol_800.setBody("The closure of applying body transitively to every distinct element of the source collection.");
				symbol_797.getOwnedComments().add(symbol_800);
			}
			
			symbol_109.getOwnedOperations().add(symbol_797);
		}
		{	// ocl::Sequence::collect()
			Iteration symbol_801 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)
			symbol_115.setName("V");
			symbol_114.setOwnedParameteredElement(symbol_115);
			symbol_113.getOwnedParameters().add(symbol_114);
			
			symbol_801.setOwnedTemplateSignature(symbol_113);
			symbol_801.setName("collect");
			symbol_801.setType(symbol_265);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_802 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)!i
			symbol_802.setName("i");
			symbol_802.setType(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_801.getOwnedIterators().add(symbol_802);
			Parameter symbol_803 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)!body
			symbol_803.setName("body");
			symbol_803.setType(symbol_162);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collect{V}(T|Lambda~T()V)?V
			
			
			symbol_801.getOwnedParameters().add(symbol_803);
			symbol_801.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_801.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			
			symbol_109.getOwnedOperations().add(symbol_801);
		}
		{	// ocl::Sequence::collectNested()
			Iteration symbol_804 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)
			symbol_118.setName("V");
			symbol_117.setOwnedParameteredElement(symbol_118);
			symbol_116.getOwnedParameters().add(symbol_117);
			
			symbol_804.setOwnedTemplateSignature(symbol_116);
			symbol_804.setName("collectNested");
			symbol_804.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_805 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_805.setName("i");
			symbol_805.setType(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_804.getOwnedIterators().add(symbol_805);
			Parameter symbol_806 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_806.setName("body");
			symbol_806.setType(symbol_161);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!collectNested{V}(T|Lambda~T()V)?V
			
			
			symbol_804.getOwnedParameters().add(symbol_806);
			symbol_804.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_804.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			{
				Comment symbol_807 = PivotFactory.eINSTANCE.createComment();
				symbol_807.setBody("The sequence of elements that results from applying body to every member of the source ordered collection.");
				symbol_804.getOwnedComments().add(symbol_807);
			}
			
			symbol_109.getOwnedOperations().add(symbol_804);
		}
		{	// ocl::Sequence::excluding()
			Operation symbol_808 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_808.setName("excluding");
			symbol_808.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_809 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_809.setName("object");
			symbol_809.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_808.getOwnedParameters().add(symbol_809);
			symbol_808.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_808.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_810 = PivotFactory.eINSTANCE.createComment();
				symbol_810.setBody("The sequence containing all elements of oclText[self] apart from all occurrences of object.\n\nThe order of the remaining elements is not changed.");
				symbol_808.getOwnedComments().add(symbol_810);
			}
			
			symbol_109.getOwnedOperations().add(symbol_808);
		}
		{	// ocl::Sequence::first()
			Operation symbol_811 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!first()
			symbol_811.setName("first");
			symbol_811.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_811.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation");
			symbol_811.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
			{
				Comment symbol_812 = PivotFactory.eINSTANCE.createComment();
				symbol_812.setBody("The first element in oclText[self].");
				symbol_811.getOwnedComments().add(symbol_812);
			}
			
			symbol_109.getOwnedOperations().add(symbol_811);
		}
		{	// ocl::Sequence::flatten()
			Operation symbol_813 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()
			symbol_121.setName("T2");
			symbol_120.setOwnedParameteredElement(symbol_121);
			symbol_119.getOwnedParameters().add(symbol_120);
			
			symbol_813.setOwnedTemplateSignature(symbol_119);
			symbol_813.setName("flatten");
			symbol_813.setType(symbol_266);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
			
			symbol_813.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_813.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			{
				Comment symbol_814 = PivotFactory.eINSTANCE.createComment();
				symbol_814.setBody("Redefines the Collection operation. If the element type is not a collection type, this results in the same sequence as oclText[self].\nIf the element type is a collection type, the result is the sequence containing all the elements\nof all the recursively flattened elements of oclText[self]. The order of the elements is partial.");
				symbol_813.getOwnedComments().add(symbol_814);
			}
			
			symbol_109.getOwnedOperations().add(symbol_813);
		}
		{	// ocl::Sequence::including()
			Operation symbol_815 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!including(T)
			symbol_815.setName("including");
			symbol_815.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_816 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!including(T)!object
			symbol_816.setName("object");
			symbol_816.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			
			symbol_815.getOwnedParameters().add(symbol_816);
			symbol_815.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_815.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_817 = PivotFactory.eINSTANCE.createComment();
				symbol_817.setBody("The sequence containing all elements of oclText[self] plus object added as the last element.");
				symbol_815.getOwnedComments().add(symbol_817);
			}
			
			symbol_109.getOwnedOperations().add(symbol_815);
		}
		{	// ocl::Sequence::indexOf()
			Operation symbol_818 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!indexOf(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_818.setName("indexOf");
			symbol_818.setType(symbol_12);  // Integer
			
			Parameter symbol_819 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!indexOf(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!obj
			symbol_819.setName("obj");
			symbol_819.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_818.getOwnedParameters().add(symbol_819);
			symbol_818.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation");
			symbol_818.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE);
			{
				Comment symbol_820 = PivotFactory.eINSTANCE.createComment();
				symbol_820.setBody("The index of object obj in the ordered collection.");
				symbol_818.getOwnedComments().add(symbol_820);
			}
			
			symbol_109.getOwnedOperations().add(symbol_818);
		}
		{	// ocl::Sequence::insertAt()
			Operation symbol_821 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)
			symbol_821.setName("insertAt");
			symbol_821.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_822 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)!index
			symbol_822.setName("index");
			symbol_822.setType(symbol_12);  // Integer
			
			
			symbol_821.getOwnedParameters().add(symbol_822);
			Parameter symbol_823 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)!object
			symbol_823.setName("object");
			symbol_823.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			
			symbol_821.getOwnedParameters().add(symbol_823);
			symbol_821.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation");
			symbol_821.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			{
				Comment symbol_824 = PivotFactory.eINSTANCE.createComment();
				symbol_824.setBody("The sequence consisting of oclText[self] with object inserted at position index.");
				symbol_821.getOwnedComments().add(symbol_824);
			}
			
			symbol_109.getOwnedOperations().add(symbol_821);
		}
		{	// ocl::Sequence::intersection()
			Operation symbol_825 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_825.setName("intersection");
			symbol_825.setType(symbol_206);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
			
			Parameter symbol_826 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!c
			symbol_826.setName("c");
			symbol_826.setType(symbol_244);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
			
			
			symbol_825.getOwnedParameters().add(symbol_826);
			symbol_825.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation");
			symbol_825.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE);
			{
				Comment symbol_827 = PivotFactory.eINSTANCE.createComment();
				symbol_827.setBody("The intersection of oclText[self] and bag; the bag of all elements that are in both oclText[self] and s.");
				symbol_825.getOwnedComments().add(symbol_827);
			}
			
			symbol_109.getOwnedOperations().add(symbol_825);
		}
		{	// ocl::Sequence::intersection()
			Operation symbol_828 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])
			symbol_828.setName("intersection");
			symbol_828.setType(symbol_255);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
			
			Parameter symbol_829 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[T])!s
			symbol_829.setName("s");
			symbol_829.setType(symbol_297);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
			
			
			symbol_828.getOwnedParameters().add(symbol_829);
			symbol_828.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation");
			symbol_828.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE);
			{
				Comment symbol_830 = PivotFactory.eINSTANCE.createComment();
				symbol_830.setBody("The intersection of oclText[self] and s; the set of all elements that are in both oclText[self] and s.");
				symbol_828.getOwnedComments().add(symbol_830);
			}
			
			symbol_109.getOwnedOperations().add(symbol_828);
		}
		{	// ocl::Sequence::last()
			Operation symbol_831 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!last()
			symbol_831.setName("last");
			symbol_831.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_831.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation");
			symbol_831.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
			{
				Comment symbol_832 = PivotFactory.eINSTANCE.createComment();
				symbol_832.setBody("The last element in oclText[self].");
				symbol_831.getOwnedComments().add(symbol_832);
			}
			
			symbol_109.getOwnedOperations().add(symbol_831);
		}
		{	// ocl::Sequence::prepend()
			Operation symbol_833 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!prepend(T)
			symbol_833.setName("prepend");
			symbol_833.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_834 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!prepend(T)!object
			symbol_834.setName("object");
			symbol_834.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			
			symbol_833.getOwnedParameters().add(symbol_834);
			symbol_833.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation");
			symbol_833.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			{
				Comment symbol_835 = PivotFactory.eINSTANCE.createComment();
				symbol_835.setBody("The sequence consisting of object, followed by all elements in oclText[self].");
				symbol_833.getOwnedComments().add(symbol_835);
			}
			
			symbol_109.getOwnedOperations().add(symbol_833);
		}
		{	// ocl::Sequence::reject()
			Iteration symbol_836 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)
			symbol_836.setName("reject");
			symbol_836.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_837 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)!i
			symbol_837.setName("i");
			symbol_837.setType(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_836.getOwnedIterators().add(symbol_837);
			Parameter symbol_838 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)!body
			symbol_838.setName("body");
			symbol_838.setType(symbol_157);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
			
			
			symbol_836.getOwnedParameters().add(symbol_838);
			symbol_836.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_836.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_839 = PivotFactory.eINSTANCE.createComment();
				symbol_839.setBody("The subsequence of the source sequence for which body is oclText[false].");
				symbol_836.getOwnedComments().add(symbol_839);
			}
			
			symbol_109.getOwnedOperations().add(symbol_836);
		}
		{	// ocl::Sequence::reverse()
			Operation symbol_840 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reverse()
			symbol_840.setName("reverse");
			symbol_840.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			symbol_840.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_840.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			{
				Comment symbol_841 = PivotFactory.eINSTANCE.createComment();
				symbol_841.setBody("The sequence containing the same elements but with the opposite order.");
				symbol_840.getOwnedComments().add(symbol_841);
			}
			
			symbol_109.getOwnedOperations().add(symbol_840);
		}
		{	// ocl::Sequence::select()
			Iteration symbol_842 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)
			symbol_842.setName("select");
			symbol_842.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_843 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)!i
			symbol_843.setName("i");
			symbol_843.setType(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_842.getOwnedIterators().add(symbol_843);
			Parameter symbol_844 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)!body
			symbol_844.setName("body");
			symbol_844.setType(symbol_158);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
			
			
			symbol_842.getOwnedParameters().add(symbol_844);
			symbol_842.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_842.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_845 = PivotFactory.eINSTANCE.createComment();
				symbol_845.setBody("The subsequence of the source sequence for which body is oclText[true].");
				symbol_842.getOwnedComments().add(symbol_845);
			}
			
			symbol_109.getOwnedOperations().add(symbol_842);
		}
		{	// ocl::Sequence::sortedBy()
			Iteration symbol_846 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_846.setName("sortedBy");
			symbol_846.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_847 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_847.setName("i");
			symbol_847.setType(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_846.getOwnedIterators().add(symbol_847);
			Parameter symbol_848 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_848.setName("body");
			symbol_848.setType(symbol_159);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_846.getOwnedParameters().add(symbol_848);
			symbol_846.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_846.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_849 = PivotFactory.eINSTANCE.createComment();
				symbol_849.setBody("Results in the Sequence containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
				symbol_846.getOwnedComments().add(symbol_849);
			}
			
			symbol_109.getOwnedOperations().add(symbol_846);
		}
		{	// ocl::Sequence::subSequence()
			Operation symbol_850 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)
			symbol_850.setName("subSequence");
			symbol_850.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_851 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)!lower
			symbol_851.setName("lower");
			symbol_851.setType(symbol_12);  // Integer
			
			
			symbol_850.getOwnedParameters().add(symbol_851);
			Parameter symbol_852 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)!upper
			symbol_852.setName("upper");
			symbol_852.setType(symbol_12);  // Integer
			
			
			symbol_850.getOwnedParameters().add(symbol_852);
			symbol_850.setImplementationClass("org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation");
			symbol_850.setImplementation(org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE);
			{
				Comment symbol_853 = PivotFactory.eINSTANCE.createComment();
				symbol_853.setBody("The sub-sequence of oclText[self] starting at number lower, up to and including element number upper.");
				symbol_850.getOwnedComments().add(symbol_853);
			}
			
			symbol_109.getOwnedOperations().add(symbol_850);
		}
		{	// ocl::Sequence::union()
			Operation symbol_854 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T})
			symbol_854.setName("union");
			symbol_854.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_855 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T})!s
			symbol_855.setName("s");
			symbol_855.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			
			symbol_854.getOwnedParameters().add(symbol_855);
			symbol_854.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_854.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_856 = PivotFactory.eINSTANCE.createComment();
				symbol_856.setBody("The sequence consisting of all elements in oclText[self], followed by all elements in s.");
				symbol_854.getOwnedComments().add(symbol_856);
			}
			
			symbol_109.getOwnedOperations().add(symbol_854);
		}
		{
			Comment symbol_857 = PivotFactory.eINSTANCE.createComment();
			symbol_857.setBody("A sequence is a collection where the elements are ordered.\nAn element may be part of a sequence more than once.\nSequence is itself an instance of the metatype SequenceType.\nA Sentence is not a subtype of Bag.\nThe common supertype of Sentence and Bags is Collection.");
			symbol_109.getOwnedComments().add(symbol_857);
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
		symbol_122.getSuperClasses().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		{	// ocl::Set::-()
			Operation symbol_858 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_858.setName("-");
			symbol_858.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_859 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_859.setName("s");
			symbol_859.setType(symbol_287);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			
			symbol_858.getOwnedParameters().add(symbol_859);
			symbol_858.setPrecedence(symbol_4);
			symbol_858.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_858.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			{
				Comment symbol_860 = PivotFactory.eINSTANCE.createComment();
				symbol_860.setBody("The elements of oclText[self], which are not in s.");
				symbol_858.getOwnedComments().add(symbol_860);
			}
			
			symbol_122.getOwnedOperations().add(symbol_858);
		}
		{	// ocl::Set::<>()
			Operation symbol_861 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_861.setName("<>");
			symbol_861.setType(symbol_11);  // Boolean
			
			Parameter symbol_862 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_862.setName("object2");
			symbol_862.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_861.getOwnedParameters().add(symbol_862);
			symbol_861.setPrecedence(symbol_6);
			symbol_861.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_861.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			
			symbol_122.getOwnedOperations().add(symbol_861);
		}
		{	// ocl::Set::=()
			Operation symbol_863 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_863.setName("=");
			symbol_863.setType(symbol_11);  // Boolean
			
			Parameter symbol_864 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_864.setName("object2");
			symbol_864.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			
			symbol_863.getOwnedParameters().add(symbol_864);
			symbol_863.setPrecedence(symbol_6);
			symbol_863.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_863.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			{
				Comment symbol_865 = PivotFactory.eINSTANCE.createComment();
				symbol_865.setBody("Evaluates to oclText[true] if oclText[self] and s contain the same elements.");
				symbol_863.getOwnedComments().add(symbol_865);
			}
			
			symbol_122.getOwnedOperations().add(symbol_863);
		}
		{	// ocl::Set::excluding()
			Operation symbol_866 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_866.setName("excluding");
			symbol_866.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_867 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_867.setName("object");
			symbol_867.setType(symbol_80);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_866.getOwnedParameters().add(symbol_867);
			symbol_866.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_866.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			{
				Comment symbol_868 = PivotFactory.eINSTANCE.createComment();
				symbol_868.setBody("The set containing all elements of oclText[self] without object.");
				symbol_866.getOwnedComments().add(symbol_868);
			}
			
			symbol_122.getOwnedOperations().add(symbol_866);
		}
		{	// ocl::Set::flatten()
			Operation symbol_869 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()
			symbol_128.setName("T2");
			symbol_127.setOwnedParameteredElement(symbol_128);
			symbol_126.getOwnedParameters().add(symbol_127);
			
			symbol_869.setOwnedTemplateSignature(symbol_126);
			symbol_869.setName("flatten");
			symbol_869.setType(symbol_277);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
			
			symbol_869.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_869.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			{
				Comment symbol_870 = PivotFactory.eINSTANCE.createComment();
				symbol_870.setBody("Redefines the Collection operation. If the element type is not a collection type, this results in the same set as oclText[self].\nIf the element type is a collection type, the result is the set containing all the elements of all the recursively flattened elements of oclText[self].");
				symbol_869.getOwnedComments().add(symbol_870);
			}
			
			symbol_122.getOwnedOperations().add(symbol_869);
		}
		{	// ocl::Set::including()
			Operation symbol_871 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!including(T)
			symbol_871.setName("including");
			symbol_871.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_872 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!including(T)!object
			symbol_872.setName("object");
			symbol_872.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			
			symbol_871.getOwnedParameters().add(symbol_872);
			symbol_871.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_871.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			{
				Comment symbol_873 = PivotFactory.eINSTANCE.createComment();
				symbol_873.setBody("The set containing all elements of oclText[self] plus object.");
				symbol_871.getOwnedComments().add(symbol_873);
			}
			
			symbol_122.getOwnedOperations().add(symbol_871);
		}
		{	// ocl::Set::intersection()
			Operation symbol_874 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_874.setName("intersection");
			symbol_874.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_875 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!s
			symbol_875.setName("s");
			symbol_875.setType(symbol_247);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
			
			
			symbol_874.getOwnedParameters().add(symbol_875);
			symbol_874.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation");
			symbol_874.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE);
			{
				Comment symbol_876 = PivotFactory.eINSTANCE.createComment();
				symbol_876.setBody("The intersection of oclText[self] and s (i.e., the set of all elements that are in both oclText[self] and s).");
				symbol_874.getOwnedComments().add(symbol_876);
			}
			
			symbol_122.getOwnedOperations().add(symbol_874);
		}
		{	// ocl::Set::reject()
			Iteration symbol_877 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)
			symbol_877.setName("reject");
			symbol_877.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_878 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)!i
			symbol_878.setName("i");
			symbol_878.setType(symbol_125); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			symbol_877.getOwnedIterators().add(symbol_878);
			Parameter symbol_879 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)!body
			symbol_879.setName("body");
			symbol_879.setType(symbol_163);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
			
			
			symbol_877.getOwnedParameters().add(symbol_879);
			symbol_877.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_877.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			{
				Comment symbol_880 = PivotFactory.eINSTANCE.createComment();
				symbol_880.setBody("The subset of the source set for which body is oclText[false].");
				symbol_877.getOwnedComments().add(symbol_880);
			}
			
			symbol_122.getOwnedOperations().add(symbol_877);
		}
		{	// ocl::Set::select()
			Iteration symbol_881 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)
			symbol_881.setName("select");
			symbol_881.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_882 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)!i
			symbol_882.setName("i");
			symbol_882.setType(symbol_125); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			symbol_881.getOwnedIterators().add(symbol_882);
			Parameter symbol_883 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)!body
			symbol_883.setName("body");
			symbol_883.setType(symbol_164);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
			
			
			symbol_881.getOwnedParameters().add(symbol_883);
			symbol_881.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_881.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			{
				Comment symbol_884 = PivotFactory.eINSTANCE.createComment();
				symbol_884.setBody("The subset of set for which expr is oclText[true].");
				symbol_881.getOwnedComments().add(symbol_884);
			}
			
			symbol_122.getOwnedOperations().add(symbol_881);
		}
		{	// ocl::Set::sortedBy()
			Iteration symbol_885 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_885.setName("sortedBy");
			symbol_885.setType(symbol_256);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
			
			Parameter symbol_886 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_886.setName("i");
			symbol_886.setType(symbol_125); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			symbol_885.getOwnedIterators().add(symbol_886);
			Parameter symbol_887 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_887.setName("body");
			symbol_887.setType(symbol_165);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_885.getOwnedParameters().add(symbol_887);
			symbol_885.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_885.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_888 = PivotFactory.eINSTANCE.createComment();
				symbol_888.setBody("Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
				symbol_885.getOwnedComments().add(symbol_888);
			}
			
			symbol_122.getOwnedOperations().add(symbol_885);
		}
		{	// ocl::Set::union()
			Operation symbol_889 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_889.setName("union");
			symbol_889.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_890 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!s
			symbol_890.setName("s");
			symbol_890.setType(symbol_247);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
			
			
			symbol_889.getOwnedParameters().add(symbol_890);
			symbol_889.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_889.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_891 = PivotFactory.eINSTANCE.createComment();
				symbol_891.setBody("The set consisting of all elements in oclText[self] and all elements in s.");
				symbol_889.getOwnedComments().add(symbol_891);
			}
			
			symbol_122.getOwnedOperations().add(symbol_889);
		}
		
		symbol_0.getOwnedTypes().add(symbol_122); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
		//
		// ocl::Type http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Type
		//
		symbol_129.setName("Type");
		symbol_129.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
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
			Operation symbol_892 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_892.setName("-");
			symbol_892.setType(symbol_130);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
			
			Parameter symbol_893 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_893.setName("s");
			symbol_893.setType(symbol_287);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			
			symbol_892.getOwnedParameters().add(symbol_893);
			symbol_892.setPrecedence(symbol_4);
			symbol_892.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_892.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			{
				Comment symbol_894 = PivotFactory.eINSTANCE.createComment();
				symbol_894.setBody("The elements of oclText[self], which are not in s.");
				symbol_892.getOwnedComments().add(symbol_894);
			}
			
			symbol_130.getOwnedOperations().add(symbol_892);
		}
		{	// ocl::UniqueCollection::sortedBy()
			Iteration symbol_895 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_895.setName("sortedBy");
			symbol_895.setType(symbol_257);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			Parameter symbol_896 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_896.setName("i");
			symbol_896.setType(symbol_133); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T
			
			symbol_895.getOwnedIterators().add(symbol_896);
			Parameter symbol_897 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_897.setName("body");
			symbol_897.setType(symbol_166);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			
			symbol_895.getOwnedParameters().add(symbol_897);
			symbol_895.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_895.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			{
				Comment symbol_898 = PivotFactory.eINSTANCE.createComment();
				symbol_898.setBody("Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
				symbol_895.getOwnedComments().add(symbol_898);
			}
			
			symbol_130.getOwnedOperations().add(symbol_895);
		}
		{	// ocl::UniqueCollection::symmetricDifference()
			Operation symbol_899 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_899.setName("symmetricDifference");
			symbol_899.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			Parameter symbol_900 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_900.setName("s");
			symbol_900.setType(symbol_287);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			
			symbol_899.getOwnedParameters().add(symbol_900);
			symbol_899.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation");
			symbol_899.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			{
				Comment symbol_901 = PivotFactory.eINSTANCE.createComment();
				symbol_901.setBody("The set containing all the elements that are in oclText[self] or s, but not in both.");
				symbol_899.getOwnedComments().add(symbol_901);
			}
			
			symbol_130.getOwnedOperations().add(symbol_899);
		}
		{	// ocl::UniqueCollection::union()
			Operation symbol_902 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])
			symbol_902.setName("union");
			symbol_902.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			Parameter symbol_903 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T])!s
			symbol_903.setName("s");
			symbol_903.setType(symbol_249);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			
			symbol_902.getOwnedParameters().add(symbol_903);
			symbol_902.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_902.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			{
				Comment symbol_904 = PivotFactory.eINSTANCE.createComment();
				symbol_904.setBody("The set consisting of all elements in oclText[self] and all elements in s.");
				symbol_902.getOwnedComments().add(symbol_904);
			}
			
			symbol_130.getOwnedOperations().add(symbol_902);
		}
		{
			Comment symbol_905 = PivotFactory.eINSTANCE.createComment();
			symbol_905.setBody("The UniqueCollection type provides the shared functionality of the OrderedSet and Set\ncollections for which the elements are unique.\nThe common supertype of UniqueCollection is Collection.");
			symbol_130.getOwnedComments().add(symbol_905);
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
		symbol_140.setResultType(symbol_273);
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
			TemplateBinding symbol_906 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_906.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_907 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_907.setFormal(symbol_21);	
				symbol_907.setActual(symbol_18);	
				symbol_906.getParameterSubstitutions().add(symbol_907);
			}
			symbol_179.getTemplateBindings().add(symbol_906);
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
			TemplateBinding symbol_908 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_908.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_909 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_909.setFormal(symbol_21);	
				symbol_909.setActual(symbol_40);	
				symbol_908.getParameterSubstitutions().add(symbol_909);
			}
			symbol_180.getTemplateBindings().add(symbol_908);
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
			TemplateBinding symbol_910 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_910.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_911 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_911.setFormal(symbol_21);	
				symbol_911.setActual(symbol_44);	
				symbol_910.getParameterSubstitutions().add(symbol_911);
			}
			symbol_181.getTemplateBindings().add(symbol_910);
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
			TemplateBinding symbol_912 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_912.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_913 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_913.setFormal(symbol_21);	
				symbol_913.setActual(symbol_77);	
				symbol_912.getParameterSubstitutions().add(symbol_913);
			}
			symbol_182.getTemplateBindings().add(symbol_912);
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
			TemplateBinding symbol_914 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_914.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_915 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_915.setFormal(symbol_21);	
				symbol_915.setActual(symbol_83);	
				symbol_914.getParameterSubstitutions().add(symbol_915);
			}
			symbol_183.getTemplateBindings().add(symbol_914);
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
			TemplateBinding symbol_916 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_916.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_917 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_917.setFormal(symbol_21);	
				symbol_917.setActual(symbol_86);	
				symbol_916.getParameterSubstitutions().add(symbol_917);
			}
			symbol_184.getTemplateBindings().add(symbol_916);
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
			TemplateBinding symbol_918 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_918.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_919 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_919.setFormal(symbol_21);	
				symbol_919.setActual(symbol_89);	
				symbol_918.getParameterSubstitutions().add(symbol_919);
			}
			symbol_185.getTemplateBindings().add(symbol_918);
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
			TemplateBinding symbol_920 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_920.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_921 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_921.setFormal(symbol_21);	
				symbol_921.setActual(symbol_92);	
				symbol_920.getParameterSubstitutions().add(symbol_921);
			}
			symbol_186.getTemplateBindings().add(symbol_920);
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
			TemplateBinding symbol_922 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_922.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_923 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_923.setFormal(symbol_21);	
				symbol_923.setActual(symbol_92);	
				symbol_922.getParameterSubstitutions().add(symbol_923);
			}
			symbol_187.getTemplateBindings().add(symbol_922);
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
			TemplateBinding symbol_924 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_924.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_925 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_925.setFormal(symbol_21);	
				symbol_925.setActual(symbol_96);	
				symbol_924.getParameterSubstitutions().add(symbol_925);
			}
			symbol_188.getTemplateBindings().add(symbol_924);
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
			TemplateBinding symbol_926 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_926.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_927 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_927.setFormal(symbol_21);	
				symbol_927.setActual(symbol_101);	
				symbol_926.getParameterSubstitutions().add(symbol_927);
			}
			symbol_189.getTemplateBindings().add(symbol_926);
		}
		symbol_189.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_189.getSuperClasses().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclType
		
		symbol_134.getOwnedTypes().add(symbol_189); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_190.setName("Bag");
		symbol_190.setElementType(symbol_170);
		symbol_190.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_928 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_928.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_929 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_929.setFormal(symbol_25);	
				symbol_929.setActual(symbol_167);	
				symbol_928.getParameterSubstitutions().add(symbol_929);
			}
			symbol_190.getTemplateBindings().add(symbol_928);
		}
		symbol_190.getSuperClasses().add(symbol_218); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_134.getOwnedTypes().add(symbol_190); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_191.setName("Bag");
		symbol_191.setElementType(symbol_170);
		symbol_191.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_930 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_930.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_931 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_931.setFormal(symbol_25);	
				symbol_931.setActual(symbol_167);	
				symbol_930.getParameterSubstitutions().add(symbol_931);
			}
			symbol_191.getTemplateBindings().add(symbol_930);
		}
		symbol_191.getSuperClasses().add(symbol_218); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_134.getOwnedTypes().add(symbol_191); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_192.setName("Bag");
		symbol_192.setElementType(symbol_29);
		symbol_192.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_932 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_932.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_933 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_933.setFormal(symbol_25);	
				symbol_933.setActual(symbol_29);	
				symbol_932.getParameterSubstitutions().add(symbol_933);
			}
			symbol_192.getTemplateBindings().add(symbol_932);
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
			TemplateBinding symbol_934 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_934.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_935 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_935.setFormal(symbol_25);	
				symbol_935.setActual(symbol_35);	
				symbol_934.getParameterSubstitutions().add(symbol_935);
			}
			symbol_193.getTemplateBindings().add(symbol_934);
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
			TemplateBinding symbol_936 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_936.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_937 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_937.setFormal(symbol_25);	
				symbol_937.setActual(symbol_26);	
				symbol_936.getParameterSubstitutions().add(symbol_937);
			}
			symbol_194.getTemplateBindings().add(symbol_936);
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
			TemplateBinding symbol_938 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_938.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_939 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_939.setFormal(symbol_25);	
				symbol_939.setActual(symbol_26);	
				symbol_938.getParameterSubstitutions().add(symbol_939);
			}
			symbol_195.getTemplateBindings().add(symbol_938);
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
			TemplateBinding symbol_940 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_940.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_941 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_941.setFormal(symbol_25);	
				symbol_941.setActual(symbol_26);	
				symbol_940.getParameterSubstitutions().add(symbol_941);
			}
			symbol_196.getTemplateBindings().add(symbol_940);
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
			TemplateBinding symbol_942 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_942.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_943 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_943.setFormal(symbol_25);	
				symbol_943.setActual(symbol_26);	
				symbol_942.getParameterSubstitutions().add(symbol_943);
			}
			symbol_197.getTemplateBindings().add(symbol_942);
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
			TemplateBinding symbol_944 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_944.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_945 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_945.setFormal(symbol_25);	
				symbol_945.setActual(symbol_51);	
				symbol_944.getParameterSubstitutions().add(symbol_945);
			}
			symbol_198.getTemplateBindings().add(symbol_944);
		}
		symbol_198.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_198); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		symbol_199.setName("Bag");
		symbol_199.setElementType(symbol_91);
		symbol_199.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_946 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_946.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_947 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_947.setFormal(symbol_25);	
				symbol_947.setActual(symbol_91);	
				symbol_946.getParameterSubstitutions().add(symbol_947);
			}
			symbol_199.getTemplateBindings().add(symbol_946);
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
			TemplateBinding symbol_948 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_948.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_949 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_949.setFormal(symbol_25);	
				symbol_949.setActual(symbol_96);	
				symbol_948.getParameterSubstitutions().add(symbol_949);
			}
			symbol_200.getTemplateBindings().add(symbol_948);
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
			TemplateBinding symbol_950 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_950.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_951 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_951.setFormal(symbol_25);	
				symbol_951.setActual(symbol_96);	
				symbol_950.getParameterSubstitutions().add(symbol_951);
			}
			symbol_201.getTemplateBindings().add(symbol_950);
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
			TemplateBinding symbol_952 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_952.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_953 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_953.setFormal(symbol_25);	
				symbol_953.setActual(symbol_96);	
				symbol_952.getParameterSubstitutions().add(symbol_953);
			}
			symbol_202.getTemplateBindings().add(symbol_952);
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
			TemplateBinding symbol_954 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_954.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_955 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_955.setFormal(symbol_25);	
				symbol_955.setActual(symbol_96);	
				symbol_954.getParameterSubstitutions().add(symbol_955);
			}
			symbol_203.getTemplateBindings().add(symbol_954);
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
			TemplateBinding symbol_956 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_956.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_957 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_957.setFormal(symbol_25);	
				symbol_957.setActual(symbol_96);	
				symbol_956.getParameterSubstitutions().add(symbol_957);
			}
			symbol_204.getTemplateBindings().add(symbol_956);
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
			TemplateBinding symbol_958 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_958.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_959 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_959.setFormal(symbol_25);	
				symbol_959.setActual(symbol_96);	
				symbol_958.getParameterSubstitutions().add(symbol_959);
			}
			symbol_205.getTemplateBindings().add(symbol_958);
		}
		symbol_205.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_205); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_206.setName("Bag");
		symbol_206.setElementType(symbol_112);
		symbol_206.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_960 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_960.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_961 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_961.setFormal(symbol_25);	
				symbol_961.setActual(symbol_112);	
				symbol_960.getParameterSubstitutions().add(symbol_961);
			}
			symbol_206.getTemplateBindings().add(symbol_960);
		}
		symbol_206.getSuperClasses().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_206); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_207.setName("Bag");
		symbol_207.setElementType(symbol_128);
		symbol_207.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_962 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_962.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_963 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_963.setFormal(symbol_25);	
				symbol_963.setActual(symbol_128);	
				symbol_962.getParameterSubstitutions().add(symbol_963);
			}
			symbol_207.getTemplateBindings().add(symbol_962);
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
			TemplateBinding symbol_964 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_964.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_965 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_965.setFormal(symbol_25);	
				symbol_965.setActual(symbol_125);	
				symbol_964.getParameterSubstitutions().add(symbol_965);
			}
			symbol_208.getTemplateBindings().add(symbol_964);
		}
		symbol_208.getSuperClasses().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_208); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_209.setName("Bag");
		symbol_209.setElementType(symbol_133);
		symbol_209.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_966 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_966.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_967 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_967.setFormal(symbol_25);	
				symbol_967.setActual(symbol_133);	
				symbol_966.getParameterSubstitutions().add(symbol_967);
			}
			symbol_209.getTemplateBindings().add(symbol_966);
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
			TemplateBinding symbol_968 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_968.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_969 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_969.setFormal(symbol_25);	
				symbol_969.setActual(symbol_133);	
				symbol_968.getParameterSubstitutions().add(symbol_969);
			}
			symbol_210.getTemplateBindings().add(symbol_968);
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
			TemplateBinding symbol_970 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_970.setSignature(symbol_38);
			{
				TemplateParameterSubstitution symbol_971 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_971.setFormal(symbol_39);	
				symbol_971.setActual(symbol_92);	
				symbol_970.getParameterSubstitutions().add(symbol_971);
			}
			symbol_211.getTemplateBindings().add(symbol_970);
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
			TemplateBinding symbol_972 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_972.setSignature(symbol_38);
			{
				TemplateParameterSubstitution symbol_973 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_973.setFormal(symbol_39);	
				symbol_973.setActual(symbol_96);	
				symbol_972.getParameterSubstitutions().add(symbol_973);
			}
			symbol_212.getTemplateBindings().add(symbol_972);
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
			TemplateBinding symbol_974 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_974.setSignature(symbol_38);
			{
				TemplateParameterSubstitution symbol_975 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_975.setFormal(symbol_39);	
				symbol_975.setActual(symbol_101);	
				symbol_974.getParameterSubstitutions().add(symbol_975);
			}
			symbol_213.getTemplateBindings().add(symbol_974);
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
			TemplateBinding symbol_976 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_976.setSignature(symbol_42);
			{
				TemplateParameterSubstitution symbol_977 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_977.setFormal(symbol_43);	
				symbol_977.setActual(symbol_96);	
				symbol_976.getParameterSubstitutions().add(symbol_977);
			}{
				TemplateParameterSubstitution symbol_978 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_978.setFormal(symbol_45);	
				symbol_978.setActual(symbol_51);	
				symbol_976.getParameterSubstitutions().add(symbol_978);
			}
			symbol_214.getTemplateBindings().add(symbol_976);
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
			TemplateBinding symbol_979 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_979.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_980 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_980.setFormal(symbol_50);	
				symbol_980.setActual(symbol_12);	
				symbol_979.getParameterSubstitutions().add(symbol_980);
			}
			symbol_215.getTemplateBindings().add(symbol_979);
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
			TemplateBinding symbol_981 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_981.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_982 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_982.setFormal(symbol_50);	
				symbol_982.setActual(symbol_14);	
				symbol_981.getParameterSubstitutions().add(symbol_982);
			}
			symbol_216.getTemplateBindings().add(symbol_981);
		}
		symbol_216.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_217.setName("Collection");
		symbol_217.setElementType(symbol_176);
		symbol_217.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_983 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_983.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_984 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_984.setFormal(symbol_50);	
				symbol_984.setActual(symbol_176);	
				symbol_983.getParameterSubstitutions().add(symbol_984);
			}
			symbol_217.getTemplateBindings().add(symbol_983);
		}
		symbol_217.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		symbol_134.getOwnedTypes().add(symbol_217); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_218.setName("Collection");
		symbol_218.setElementType(symbol_176);
		symbol_218.setUnspecializedElement(symbol_48);
		{
			TemplateBinding symbol_985 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_985.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_986 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_986.setFormal(symbol_50);	
				symbol_986.setActual(symbol_176);	
				symbol_985.getParameterSubstitutions().add(symbol_986);
			}
			symbol_218.getTemplateBindings().add(symbol_985);
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
			TemplateBinding symbol_987 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_987.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_988 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_988.setFormal(symbol_50);	
				symbol_988.setActual(symbol_29);	
				symbol_987.getParameterSubstitutions().add(symbol_988);
			}
			symbol_219.getTemplateBindings().add(symbol_987);
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
			TemplateBinding symbol_989 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_989.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_990 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_990.setFormal(symbol_50);	
				symbol_990.setActual(symbol_35);	
				symbol_989.getParameterSubstitutions().add(symbol_990);
			}
			symbol_220.getTemplateBindings().add(symbol_989);
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
			TemplateBinding symbol_991 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_991.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_992 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_992.setFormal(symbol_50);	
				symbol_992.setActual(symbol_26);	
				symbol_991.getParameterSubstitutions().add(symbol_992);
			}
			symbol_221.getTemplateBindings().add(symbol_991);
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
			TemplateBinding symbol_993 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_993.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_994 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_994.setFormal(symbol_50);	
				symbol_994.setActual(symbol_26);	
				symbol_993.getParameterSubstitutions().add(symbol_994);
			}
			symbol_222.getTemplateBindings().add(symbol_993);
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
			TemplateBinding symbol_995 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_995.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_996 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_996.setFormal(symbol_50);	
				symbol_996.setActual(symbol_26);	
				symbol_995.getParameterSubstitutions().add(symbol_996);
			}
			symbol_223.getTemplateBindings().add(symbol_995);
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
			TemplateBinding symbol_997 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_997.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_998 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_998.setFormal(symbol_50);	
				symbol_998.setActual(symbol_54);	
				symbol_997.getParameterSubstitutions().add(symbol_998);
			}
			symbol_224.getTemplateBindings().add(symbol_997);
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
			TemplateBinding symbol_999 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_999.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1000 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1000.setFormal(symbol_50);	
				symbol_1000.setActual(symbol_60);	
				symbol_999.getParameterSubstitutions().add(symbol_1000);
			}
			symbol_225.getTemplateBindings().add(symbol_999);
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
			TemplateBinding symbol_1001 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1001.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1002 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1002.setFormal(symbol_50);	
				symbol_1002.setActual(symbol_63);	
				symbol_1001.getParameterSubstitutions().add(symbol_1002);
			}
			symbol_226.getTemplateBindings().add(symbol_1001);
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
			TemplateBinding symbol_1003 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1003.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1004 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1004.setFormal(symbol_50);	
				symbol_1004.setActual(symbol_66);	
				symbol_1003.getParameterSubstitutions().add(symbol_1004);
			}
			symbol_227.getTemplateBindings().add(symbol_1003);
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
			TemplateBinding symbol_1005 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1005.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1006 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1006.setFormal(symbol_50);	
				symbol_1006.setActual(symbol_72);	
				symbol_1005.getParameterSubstitutions().add(symbol_1006);
			}
			symbol_228.getTemplateBindings().add(symbol_1005);
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
			TemplateBinding symbol_1007 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1007.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1008 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1008.setFormal(symbol_50);	
				symbol_1008.setActual(symbol_51);	
				symbol_1007.getParameterSubstitutions().add(symbol_1008);
			}
			symbol_229.getTemplateBindings().add(symbol_1007);
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
			TemplateBinding symbol_1009 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1009.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1010 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1010.setFormal(symbol_50);	
				symbol_1010.setActual(symbol_51);	
				symbol_1009.getParameterSubstitutions().add(symbol_1010);
			}
			symbol_230.getTemplateBindings().add(symbol_1009);
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
			TemplateBinding symbol_1011 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1011.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1012 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1012.setFormal(symbol_50);	
				symbol_1012.setActual(symbol_51);	
				symbol_1011.getParameterSubstitutions().add(symbol_1012);
			}
			symbol_231.getTemplateBindings().add(symbol_1011);
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
			TemplateBinding symbol_1013 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1013.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1014 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1014.setFormal(symbol_50);	
				symbol_1014.setActual(symbol_79);	
				symbol_1013.getParameterSubstitutions().add(symbol_1014);
			}
			symbol_232.getTemplateBindings().add(symbol_1013);
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
			TemplateBinding symbol_1015 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1015.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1016 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1016.setFormal(symbol_50);	
				symbol_1016.setActual(symbol_80);	
				symbol_1015.getParameterSubstitutions().add(symbol_1016);
			}
			symbol_233.getTemplateBindings().add(symbol_1015);
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
			TemplateBinding symbol_1017 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1017.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1018 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1018.setFormal(symbol_50);	
				symbol_1018.setActual(symbol_80);	
				symbol_1017.getParameterSubstitutions().add(symbol_1018);
			}
			symbol_234.getTemplateBindings().add(symbol_1017);
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
			TemplateBinding symbol_1019 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1019.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1020 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1020.setFormal(symbol_50);	
				symbol_1020.setActual(symbol_80);	
				symbol_1019.getParameterSubstitutions().add(symbol_1020);
			}
			symbol_235.getTemplateBindings().add(symbol_1019);
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
			TemplateBinding symbol_1021 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1021.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1022 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1022.setFormal(symbol_50);	
				symbol_1022.setActual(symbol_80);	
				symbol_1021.getParameterSubstitutions().add(symbol_1022);
			}
			symbol_236.getTemplateBindings().add(symbol_1021);
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
			TemplateBinding symbol_1023 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1023.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1024 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1024.setFormal(symbol_50);	
				symbol_1024.setActual(symbol_91);	
				symbol_1023.getParameterSubstitutions().add(symbol_1024);
			}
			symbol_237.getTemplateBindings().add(symbol_1023);
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
			TemplateBinding symbol_1025 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1025.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1026 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1026.setFormal(symbol_50);	
				symbol_1026.setActual(symbol_96);	
				symbol_1025.getParameterSubstitutions().add(symbol_1026);
			}
			symbol_238.getTemplateBindings().add(symbol_1025);
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
			TemplateBinding symbol_1027 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1027.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1028 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1028.setFormal(symbol_50);	
				symbol_1028.setActual(symbol_108);	
				symbol_1027.getParameterSubstitutions().add(symbol_1028);
			}
			symbol_239.getTemplateBindings().add(symbol_1027);
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
			TemplateBinding symbol_1029 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1029.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1030 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1030.setFormal(symbol_50);	
				symbol_1030.setActual(symbol_105);	
				symbol_1029.getParameterSubstitutions().add(symbol_1030);
			}
			symbol_240.getTemplateBindings().add(symbol_1029);
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
			TemplateBinding symbol_1031 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1031.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1032 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1032.setFormal(symbol_50);	
				symbol_1032.setActual(symbol_105);	
				symbol_1031.getParameterSubstitutions().add(symbol_1032);
			}
			symbol_241.getTemplateBindings().add(symbol_1031);
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
			TemplateBinding symbol_1033 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1033.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1034 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1034.setFormal(symbol_50);	
				symbol_1034.setActual(symbol_115);	
				symbol_1033.getParameterSubstitutions().add(symbol_1034);
			}
			symbol_242.getTemplateBindings().add(symbol_1033);
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
			TemplateBinding symbol_1035 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1035.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1036 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1036.setFormal(symbol_50);	
				symbol_1036.setActual(symbol_121);	
				symbol_1035.getParameterSubstitutions().add(symbol_1036);
			}
			symbol_243.getTemplateBindings().add(symbol_1035);
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
			TemplateBinding symbol_1037 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1037.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1038 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1038.setFormal(symbol_50);	
				symbol_1038.setActual(symbol_112);	
				symbol_1037.getParameterSubstitutions().add(symbol_1038);
			}
			symbol_244.getTemplateBindings().add(symbol_1037);
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
			TemplateBinding symbol_1039 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1039.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1040 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1040.setFormal(symbol_50);	
				symbol_1040.setActual(symbol_112);	
				symbol_1039.getParameterSubstitutions().add(symbol_1040);
			}
			symbol_245.getTemplateBindings().add(symbol_1039);
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
			TemplateBinding symbol_1041 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1041.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1042 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1042.setFormal(symbol_50);	
				symbol_1042.setActual(symbol_128);	
				symbol_1041.getParameterSubstitutions().add(symbol_1042);
			}
			symbol_246.getTemplateBindings().add(symbol_1041);
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
			TemplateBinding symbol_1043 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1043.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1044 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1044.setFormal(symbol_50);	
				symbol_1044.setActual(symbol_125);	
				symbol_1043.getParameterSubstitutions().add(symbol_1044);
			}
			symbol_247.getTemplateBindings().add(symbol_1043);
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
			TemplateBinding symbol_1045 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1045.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1046 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1046.setFormal(symbol_50);	
				symbol_1046.setActual(symbol_125);	
				symbol_1045.getParameterSubstitutions().add(symbol_1046);
			}
			symbol_248.getTemplateBindings().add(symbol_1045);
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
			TemplateBinding symbol_1047 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1047.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1048 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1048.setFormal(symbol_50);	
				symbol_1048.setActual(symbol_133);	
				symbol_1047.getParameterSubstitutions().add(symbol_1048);
			}
			symbol_249.getTemplateBindings().add(symbol_1047);
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
			TemplateBinding symbol_1049 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1049.setSignature(symbol_49);
			{
				TemplateParameterSubstitution symbol_1050 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1050.setFormal(symbol_50);	
				symbol_1050.setActual(symbol_133);	
				symbol_1049.getParameterSubstitutions().add(symbol_1050);
			}
			symbol_250.getTemplateBindings().add(symbol_1049);
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
			TemplateBinding symbol_1051 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1051.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_1052 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1052.setFormal(symbol_76);	
				symbol_1052.setActual(symbol_96);	
				symbol_1051.getParameterSubstitutions().add(symbol_1052);
			}
			symbol_251.getTemplateBindings().add(symbol_1051);
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
			TemplateBinding symbol_1053 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1053.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_1054 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1054.setFormal(symbol_104);	
				symbol_1054.setActual(symbol_51);	
				symbol_1053.getParameterSubstitutions().add(symbol_1054);
			}
			symbol_252.getTemplateBindings().add(symbol_1053);
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
			TemplateBinding symbol_1055 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1055.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_1056 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1056.setFormal(symbol_104);	
				symbol_1056.setActual(symbol_79);	
				symbol_1055.getParameterSubstitutions().add(symbol_1056);
			}
			symbol_253.getTemplateBindings().add(symbol_1055);
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
			TemplateBinding symbol_1057 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1057.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_1058 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1058.setFormal(symbol_104);	
				symbol_1058.setActual(symbol_108);	
				symbol_1057.getParameterSubstitutions().add(symbol_1058);
			}
			symbol_254.getTemplateBindings().add(symbol_1057);
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
			TemplateBinding symbol_1059 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1059.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_1060 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1060.setFormal(symbol_104);	
				symbol_1060.setActual(symbol_112);	
				symbol_1059.getParameterSubstitutions().add(symbol_1060);
			}
			symbol_255.getTemplateBindings().add(symbol_1059);
		}
		symbol_255.getSuperClasses().add(symbol_269); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		symbol_255.getSuperClasses().add(symbol_298); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_255); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_256.setName("OrderedSet");
		symbol_256.setElementType(symbol_125);
		symbol_256.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_1061 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1061.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_1062 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1062.setFormal(symbol_104);	
				symbol_1062.setActual(symbol_125);	
				symbol_1061.getParameterSubstitutions().add(symbol_1062);
			}
			symbol_256.getTemplateBindings().add(symbol_1061);
		}
		symbol_256.getSuperClasses().add(symbol_270); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		symbol_256.getSuperClasses().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_256); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_257.setName("OrderedSet");
		symbol_257.setElementType(symbol_133);
		symbol_257.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_1063 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1063.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_1064 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1064.setFormal(symbol_104);	
				symbol_1064.setActual(symbol_133);	
				symbol_1063.getParameterSubstitutions().add(symbol_1064);
			}
			symbol_257.getTemplateBindings().add(symbol_1063);
		}
		symbol_257.getSuperClasses().add(symbol_271); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_257.getSuperClasses().add(symbol_302); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_257); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[Integer]
		//
		symbol_258.setName("Sequence");
		symbol_258.setElementType(symbol_12);
		symbol_258.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1065 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1065.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1066 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1066.setFormal(symbol_111);	
				symbol_1066.setActual(symbol_12);	
				symbol_1065.getParameterSubstitutions().add(symbol_1066);
			}
			symbol_258.getTemplateBindings().add(symbol_1065);
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
			TemplateBinding symbol_1067 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1067.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1068 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1068.setFormal(symbol_111);	
				symbol_1068.setActual(symbol_14);	
				symbol_1067.getParameterSubstitutions().add(symbol_1068);
			}
			symbol_259.getTemplateBindings().add(symbol_1067);
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
			TemplateBinding symbol_1069 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1069.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1070 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1070.setFormal(symbol_111);	
				symbol_1070.setActual(symbol_26);	
				symbol_1069.getParameterSubstitutions().add(symbol_1070);
			}
			symbol_260.getTemplateBindings().add(symbol_1069);
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
			TemplateBinding symbol_1071 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1071.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1072 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1072.setFormal(symbol_111);	
				symbol_1072.setActual(symbol_51);	
				symbol_1071.getParameterSubstitutions().add(symbol_1072);
			}
			symbol_261.getTemplateBindings().add(symbol_1071);
		}
		symbol_261.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_261); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_262.setName("Sequence");
		symbol_262.setElementType(symbol_79);
		symbol_262.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1073 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1073.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1074 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1074.setFormal(symbol_111);	
				symbol_1074.setActual(symbol_79);	
				symbol_1073.getParameterSubstitutions().add(symbol_1074);
			}
			symbol_262.getTemplateBindings().add(symbol_1073);
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
			TemplateBinding symbol_1075 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1075.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1076 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1076.setFormal(symbol_111);	
				symbol_1076.setActual(symbol_108);	
				symbol_1075.getParameterSubstitutions().add(symbol_1076);
			}
			symbol_263.getTemplateBindings().add(symbol_1075);
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
			TemplateBinding symbol_1077 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1077.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1078 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1078.setFormal(symbol_111);	
				symbol_1078.setActual(symbol_105);	
				symbol_1077.getParameterSubstitutions().add(symbol_1078);
			}
			symbol_264.getTemplateBindings().add(symbol_1077);
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
			TemplateBinding symbol_1079 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1079.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1080 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1080.setFormal(symbol_111);	
				symbol_1080.setActual(symbol_115);	
				symbol_1079.getParameterSubstitutions().add(symbol_1080);
			}
			symbol_265.getTemplateBindings().add(symbol_1079);
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
			TemplateBinding symbol_1081 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1081.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1082 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1082.setFormal(symbol_111);	
				symbol_1082.setActual(symbol_121);	
				symbol_1081.getParameterSubstitutions().add(symbol_1082);
			}
			symbol_266.getTemplateBindings().add(symbol_1081);
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
			TemplateBinding symbol_1083 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1083.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1084 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1084.setFormal(symbol_111);	
				symbol_1084.setActual(symbol_112);	
				symbol_1083.getParameterSubstitutions().add(symbol_1084);
			}
			symbol_267.getTemplateBindings().add(symbol_1083);
		}
		symbol_267.getSuperClasses().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_267); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_268.setName("Sequence");
		symbol_268.setElementType(symbol_112);
		symbol_268.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1085 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1085.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1086 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1086.setFormal(symbol_111);	
				symbol_1086.setActual(symbol_112);	
				symbol_1085.getParameterSubstitutions().add(symbol_1086);
			}
			symbol_268.getTemplateBindings().add(symbol_1085);
		}
		symbol_268.getSuperClasses().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_268); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_269.setName("Sequence");
		symbol_269.setElementType(symbol_112);
		symbol_269.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1087 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1087.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1088 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1088.setFormal(symbol_111);	
				symbol_1088.setActual(symbol_112);	
				symbol_1087.getParameterSubstitutions().add(symbol_1088);
			}
			symbol_269.getTemplateBindings().add(symbol_1087);
		}
		symbol_269.getSuperClasses().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_269); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_270.setName("Sequence");
		symbol_270.setElementType(symbol_125);
		symbol_270.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1089 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1089.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1090 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1090.setFormal(symbol_111);	
				symbol_1090.setActual(symbol_125);	
				symbol_1089.getParameterSubstitutions().add(symbol_1090);
			}
			symbol_270.getTemplateBindings().add(symbol_1089);
		}
		symbol_270.getSuperClasses().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_270); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_271.setName("Sequence");
		symbol_271.setElementType(symbol_133);
		symbol_271.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_1091 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1091.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_1092 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1092.setFormal(symbol_111);	
				symbol_1092.setActual(symbol_133);	
				symbol_1091.getParameterSubstitutions().add(symbol_1092);
			}
			symbol_271.getTemplateBindings().add(symbol_1091);
		}
		symbol_271.getSuperClasses().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_271); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_272.setName("Set");
		symbol_272.setElementType(symbol_170);
		symbol_272.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1093 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1093.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1094 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1094.setFormal(symbol_124);	
				symbol_1094.setActual(symbol_167);	
				symbol_1093.getParameterSubstitutions().add(symbol_1094);
			}
			symbol_272.getTemplateBindings().add(symbol_1093);
		}
		symbol_272.getSuperClasses().add(symbol_190); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_272.getSuperClasses().add(symbol_279); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_134.getOwnedTypes().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_273.setName("Set");
		symbol_273.setElementType(symbol_26);
		symbol_273.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1095 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1095.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1096 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1096.setFormal(symbol_124);	
				symbol_1096.setActual(symbol_26);	
				symbol_1095.getParameterSubstitutions().add(symbol_1096);
			}
			symbol_273.getTemplateBindings().add(symbol_1095);
		}
		symbol_273.getSuperClasses().add(symbol_194); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		symbol_273.getSuperClasses().add(symbol_283); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_273); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_274.setName("Set");
		symbol_274.setElementType(symbol_51);
		symbol_274.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1097 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1097.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1098 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1098.setFormal(symbol_124);	
				symbol_1098.setActual(symbol_51);	
				symbol_1097.getParameterSubstitutions().add(symbol_1098);
			}
			symbol_274.getTemplateBindings().add(symbol_1097);
		}
		symbol_274.getSuperClasses().add(symbol_198); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_274.getSuperClasses().add(symbol_285); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_274); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		symbol_275.setName("Set");
		symbol_275.setElementType(symbol_91);
		symbol_275.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1099 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1099.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1100 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1100.setFormal(symbol_124);	
				symbol_1100.setActual(symbol_91);	
				symbol_1099.getParameterSubstitutions().add(symbol_1100);
			}
			symbol_275.getTemplateBindings().add(symbol_1099);
		}
		symbol_275.getSuperClasses().add(symbol_199); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		symbol_275.getSuperClasses().add(symbol_288); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		
		symbol_134.getOwnedTypes().add(symbol_275); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_276.setName("Set");
		symbol_276.setElementType(symbol_96);
		symbol_276.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1101 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1101.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1102 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1102.setFormal(symbol_124);	
				symbol_1102.setActual(symbol_96);	
				symbol_1101.getParameterSubstitutions().add(symbol_1102);
			}
			symbol_276.getTemplateBindings().add(symbol_1101);
		}
		symbol_276.getSuperClasses().add(symbol_200); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_276.getSuperClasses().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		symbol_134.getOwnedTypes().add(symbol_276); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_277.setName("Set");
		symbol_277.setElementType(symbol_128);
		symbol_277.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1103 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1103.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1104 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1104.setFormal(symbol_124);	
				symbol_1104.setActual(symbol_128);	
				symbol_1103.getParameterSubstitutions().add(symbol_1104);
			}
			symbol_277.getTemplateBindings().add(symbol_1103);
		}
		symbol_277.getSuperClasses().add(symbol_207); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		symbol_277.getSuperClasses().add(symbol_300); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		symbol_134.getOwnedTypes().add(symbol_277); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_278.setName("Set");
		symbol_278.setElementType(symbol_133);
		symbol_278.setUnspecializedElement(symbol_122);
		{
			TemplateBinding symbol_1105 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1105.setSignature(symbol_123);
			{
				TemplateParameterSubstitution symbol_1106 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1106.setFormal(symbol_124);	
				symbol_1106.setActual(symbol_133);	
				symbol_1105.getParameterSubstitutions().add(symbol_1106);
			}
			symbol_278.getTemplateBindings().add(symbol_1105);
		}
		symbol_278.getSuperClasses().add(symbol_209); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_278.getSuperClasses().add(symbol_303); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_278); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_279.setName("UniqueCollection");
		symbol_279.setElementType(symbol_170);
		symbol_279.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1107 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1107.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1108 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1108.setFormal(symbol_132);	
				symbol_1108.setActual(symbol_167);	
				symbol_1107.getParameterSubstitutions().add(symbol_1108);
			}
			symbol_279.getTemplateBindings().add(symbol_1107);
		}
		symbol_279.getSuperClasses().add(symbol_218); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_134.getOwnedTypes().add(symbol_279); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_280.setName("UniqueCollection");
		symbol_280.setElementType(symbol_170);
		symbol_280.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1109 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1109.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1110 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1110.setFormal(symbol_132);	
				symbol_1110.setActual(symbol_167);	
				symbol_1109.getParameterSubstitutions().add(symbol_1110);
			}
			symbol_280.getTemplateBindings().add(symbol_1109);
		}
		symbol_280.getSuperClasses().add(symbol_218); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		symbol_134.getOwnedTypes().add(symbol_280); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_281.setName("UniqueCollection");
		symbol_281.setElementType(symbol_26);
		symbol_281.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1111 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1111.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1112 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1112.setFormal(symbol_132);	
				symbol_1112.setActual(symbol_26);	
				symbol_1111.getParameterSubstitutions().add(symbol_1112);
			}
			symbol_281.getTemplateBindings().add(symbol_1111);
		}
		symbol_281.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_281); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_282.setName("UniqueCollection");
		symbol_282.setElementType(symbol_26);
		symbol_282.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1113 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1113.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1114 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1114.setFormal(symbol_132);	
				symbol_1114.setActual(symbol_26);	
				symbol_1113.getParameterSubstitutions().add(symbol_1114);
			}
			symbol_282.getTemplateBindings().add(symbol_1113);
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
			TemplateBinding symbol_1115 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1115.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1116 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1116.setFormal(symbol_132);	
				symbol_1116.setActual(symbol_26);	
				symbol_1115.getParameterSubstitutions().add(symbol_1116);
			}
			symbol_283.getTemplateBindings().add(symbol_1115);
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
			TemplateBinding symbol_1117 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1117.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1118 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1118.setFormal(symbol_132);	
				symbol_1118.setActual(symbol_26);	
				symbol_1117.getParameterSubstitutions().add(symbol_1118);
			}
			symbol_284.getTemplateBindings().add(symbol_1117);
		}
		symbol_284.getSuperClasses().add(symbol_222); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_284); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_285.setName("UniqueCollection");
		symbol_285.setElementType(symbol_51);
		symbol_285.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1119 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1119.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1120 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1120.setFormal(symbol_132);	
				symbol_1120.setActual(symbol_51);	
				symbol_1119.getParameterSubstitutions().add(symbol_1120);
			}
			symbol_285.getTemplateBindings().add(symbol_1119);
		}
		symbol_285.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_285); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_286.setName("UniqueCollection");
		symbol_286.setElementType(symbol_79);
		symbol_286.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1121 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1121.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1122 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1122.setFormal(symbol_132);	
				symbol_1122.setActual(symbol_79);	
				symbol_1121.getParameterSubstitutions().add(symbol_1122);
			}
			symbol_286.getTemplateBindings().add(symbol_1121);
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
			TemplateBinding symbol_1123 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1123.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1124 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1124.setFormal(symbol_132);	
				symbol_1124.setActual(symbol_80);	
				symbol_1123.getParameterSubstitutions().add(symbol_1124);
			}
			symbol_287.getTemplateBindings().add(symbol_1123);
		}
		symbol_287.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		symbol_134.getOwnedTypes().add(symbol_287); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement]
		//
		symbol_288.setName("UniqueCollection");
		symbol_288.setElementType(symbol_91);
		symbol_288.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1125 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1125.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1126 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1126.setFormal(symbol_132);	
				symbol_1126.setActual(symbol_91);	
				symbol_1125.getParameterSubstitutions().add(symbol_1126);
			}
			symbol_288.getTemplateBindings().add(symbol_1125);
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
			TemplateBinding symbol_1127 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1127.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1128 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1128.setFormal(symbol_132);	
				symbol_1128.setActual(symbol_96);	
				symbol_1127.getParameterSubstitutions().add(symbol_1128);
			}
			symbol_289.getTemplateBindings().add(symbol_1127);
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
			TemplateBinding symbol_1129 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1129.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1130 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1130.setFormal(symbol_132);	
				symbol_1130.setActual(symbol_96);	
				symbol_1129.getParameterSubstitutions().add(symbol_1130);
			}
			symbol_290.getTemplateBindings().add(symbol_1129);
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
			TemplateBinding symbol_1131 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1131.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1132 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1132.setFormal(symbol_132);	
				symbol_1132.setActual(symbol_96);	
				symbol_1131.getParameterSubstitutions().add(symbol_1132);
			}
			symbol_291.getTemplateBindings().add(symbol_1131);
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
			TemplateBinding symbol_1133 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1133.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1134 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1134.setFormal(symbol_132);	
				symbol_1134.setActual(symbol_96);	
				symbol_1133.getParameterSubstitutions().add(symbol_1134);
			}
			symbol_292.getTemplateBindings().add(symbol_1133);
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
			TemplateBinding symbol_1135 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1135.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1136 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1136.setFormal(symbol_132);	
				symbol_1136.setActual(symbol_96);	
				symbol_1135.getParameterSubstitutions().add(symbol_1136);
			}
			symbol_293.getTemplateBindings().add(symbol_1135);
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
			TemplateBinding symbol_1137 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1137.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1138 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1138.setFormal(symbol_132);	
				symbol_1138.setActual(symbol_96);	
				symbol_1137.getParameterSubstitutions().add(symbol_1138);
			}
			symbol_294.getTemplateBindings().add(symbol_1137);
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
			TemplateBinding symbol_1139 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1139.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1140 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1140.setFormal(symbol_132);	
				symbol_1140.setActual(symbol_108);	
				symbol_1139.getParameterSubstitutions().add(symbol_1140);
			}
			symbol_295.getTemplateBindings().add(symbol_1139);
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
			TemplateBinding symbol_1141 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1141.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1142 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1142.setFormal(symbol_132);	
				symbol_1142.setActual(symbol_105);	
				symbol_1141.getParameterSubstitutions().add(symbol_1142);
			}
			symbol_296.getTemplateBindings().add(symbol_1141);
		}
		symbol_296.getSuperClasses().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_297.setName("UniqueCollection");
		symbol_297.setElementType(symbol_112);
		symbol_297.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1143 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1143.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1144 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1144.setFormal(symbol_132);	
				symbol_1144.setActual(symbol_112);	
				symbol_1143.getParameterSubstitutions().add(symbol_1144);
			}
			symbol_297.getTemplateBindings().add(symbol_1143);
		}
		symbol_297.getSuperClasses().add(symbol_245); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_297); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_298.setName("UniqueCollection");
		symbol_298.setElementType(symbol_112);
		symbol_298.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1145 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1145.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1146 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1146.setFormal(symbol_132);	
				symbol_1146.setActual(symbol_112);	
				symbol_1145.getParameterSubstitutions().add(symbol_1146);
			}
			symbol_298.getTemplateBindings().add(symbol_1145);
		}
		symbol_298.getSuperClasses().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_298); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_299.setName("UniqueCollection");
		symbol_299.setElementType(symbol_112);
		symbol_299.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1147 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1147.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1148 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1148.setFormal(symbol_132);	
				symbol_1148.setActual(symbol_112);	
				symbol_1147.getParameterSubstitutions().add(symbol_1148);
			}
			symbol_299.getTemplateBindings().add(symbol_1147);
		}
		symbol_299.getSuperClasses().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_300.setName("UniqueCollection");
		symbol_300.setElementType(symbol_128);
		symbol_300.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1149 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1149.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1150 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1150.setFormal(symbol_132);	
				symbol_1150.setActual(symbol_128);	
				symbol_1149.getParameterSubstitutions().add(symbol_1150);
			}
			symbol_300.getTemplateBindings().add(symbol_1149);
		}
		symbol_300.getSuperClasses().add(symbol_246); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		symbol_134.getOwnedTypes().add(symbol_300); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_301.setName("UniqueCollection");
		symbol_301.setElementType(symbol_125);
		symbol_301.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1151 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1151.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1152 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1152.setFormal(symbol_132);	
				symbol_1152.setActual(symbol_125);	
				symbol_1151.getParameterSubstitutions().add(symbol_1152);
			}
			symbol_301.getTemplateBindings().add(symbol_1151);
		}
		symbol_301.getSuperClasses().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_302.setName("UniqueCollection");
		symbol_302.setElementType(symbol_133);
		symbol_302.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1153 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1153.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1154 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1154.setFormal(symbol_132);	
				symbol_1154.setActual(symbol_133);	
				symbol_1153.getParameterSubstitutions().add(symbol_1154);
			}
			symbol_302.getTemplateBindings().add(symbol_1153);
		}
		symbol_302.getSuperClasses().add(symbol_250); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_302); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_303.setName("UniqueCollection");
		symbol_303.setElementType(symbol_133);
		symbol_303.setUnspecializedElement(symbol_130);
		{
			TemplateBinding symbol_1155 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1155.setSignature(symbol_131);
			{
				TemplateParameterSubstitution symbol_1156 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1156.setFormal(symbol_132);	
				symbol_1156.setActual(symbol_133);	
				symbol_1155.getParameterSubstitutions().add(symbol_1156);
			}
			symbol_303.getTemplateBindings().add(symbol_1155);
		}
		symbol_303.getSuperClasses().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		symbol_134.getOwnedTypes().add(symbol_303); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::$$ u_r_i:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		//
		symbol_304.setName("$$");
		
		symbol_134.getOwnedTypes().add(symbol_304); // u_r_i:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		
		symbol_0.getNestedPackages().add(symbol_134);
		return symbol_0;
	}
}
