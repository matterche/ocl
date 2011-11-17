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
		
		TemplateSignature symbol_27 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()!
		TypeTemplateParameter symbol_28 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_29 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2
		
		
		Class symbol_30 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		ClassifierType symbol_31 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}
		TemplateSignature symbol_32 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}!
		TypeTemplateParameter symbol_33 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_34 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T
		
		
		ClassifierType symbol_35 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}
		TemplateSignature symbol_36 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}!
		TypeTemplateParameter symbol_37 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_38 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T
		TypeTemplateParameter symbol_39 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_40 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?E
		
		Property symbol_41 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}!elementType // ocl::CollectionClassifier::elementType http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}!elementType
		
		CollectionType symbol_42 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
		TemplateSignature symbol_43 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!
		TypeTemplateParameter symbol_44 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_45 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
		
		TemplateSignature symbol_46 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_47 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_48 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_49 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_50 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_51 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_52 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!
		TypeTemplateParameter symbol_53 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_54 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
		
		TemplateSignature symbol_55 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()!
		TypeTemplateParameter symbol_56 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_57 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2
		
		TemplateSignature symbol_58 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!
		TypeTemplateParameter symbol_59 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_60 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
		
		TemplateSignature symbol_61 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)!
		TypeTemplateParameter symbol_62 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_63 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)?Tacc
		
		TemplateSignature symbol_64 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!
		TypeTemplateParameter symbol_65 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_66 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
		
		
		Class symbol_67 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration
		
		ClassifierType symbol_68 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}
		TemplateSignature symbol_69 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}!
		TypeTemplateParameter symbol_70 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_71 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T
		
		Property symbol_72 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}!ownedLiteral // ocl::EnumerationClassifier::ownedLiteral http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}!ownedLiteral
		
		Class symbol_73 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		
		CollectionType symbol_74 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}
		TemplateSignature symbol_75 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!
		TypeTemplateParameter symbol_76 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_77 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T
		
		TemplateSignature symbol_78 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_79 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_80 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_81 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_82 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_83 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		
		CollectionType symbol_84 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}
		TemplateSignature symbol_85 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}!
		TypeTemplateParameter symbol_86 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_87 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T
		
		
		AnyType symbol_88 = PivotFactory.eINSTANCE.createAnyType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		TemplateSignature symbol_89 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])!
		TypeTemplateParameter symbol_90 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_91 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT
		
		TemplateSignature symbol_92 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])!
		TypeTemplateParameter symbol_93 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_94 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T
		
		TemplateSignature symbol_95 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])!
		TypeTemplateParameter symbol_96 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_97 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T
		
		
		Class symbol_98 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		
		Class symbol_99 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		TemplateSignature symbol_100 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()!
		TypeTemplateParameter symbol_101 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_102 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()?U
		
		TemplateSignature symbol_103 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()!
		TypeTemplateParameter symbol_104 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_105 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U
		
		
		InvalidType symbol_106 = PivotFactory.eINSTANCE.createInvalidType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
		Property symbol_107 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!oclBadProperty // ocl::OclInvalid::oclBadProperty http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!oclBadProperty
		
		Class symbol_108 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		Class symbol_109 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		
		SelfType symbol_110 = PivotFactory.eINSTANCE.createSelfType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
		
		Class symbol_111 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
		
		Class symbol_112 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		
		Class symbol_113 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		
		VoidType symbol_114 = PivotFactory.eINSTANCE.createVoidType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		
		CollectionType symbol_115 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}
		TemplateSignature symbol_116 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!
		TypeTemplateParameter symbol_117 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_118 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
		
		TemplateSignature symbol_119 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_120 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_121 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_122 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_123 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_124 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		
		OrderedSetType symbol_125 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
		TemplateSignature symbol_126 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!
		TypeTemplateParameter symbol_127 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_128 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
		
		TemplateSignature symbol_129 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()!
		TypeTemplateParameter symbol_130 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_131 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2
		
		
		SequenceType symbol_132 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
		TemplateSignature symbol_133 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!
		TypeTemplateParameter symbol_134 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_135 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
		
		TemplateSignature symbol_136 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()!
		TypeTemplateParameter symbol_137 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_138 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2
		
		
		SetType symbol_139 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
		TemplateSignature symbol_140 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!
		TypeTemplateParameter symbol_141 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_142 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
		
		TemplateSignature symbol_143 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()!
		TypeTemplateParameter symbol_144 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_145 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2
		
		
		CollectionType symbol_146 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
		TemplateSignature symbol_147 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!
		TypeTemplateParameter symbol_148 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_149 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T
		
		
		Package symbol_150 = PivotFactory.eINSTANCE.createPackage(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0
		LambdaType symbol_151 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		
		LambdaType symbol_152 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		
		LambdaType symbol_153 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_154 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_155 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_156 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_157 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_158 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_159 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_160 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_161 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_162 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_163 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_164 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_165 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_166 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_167 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
		
		LambdaType symbol_168 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_169 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_170 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_171 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
		
		LambdaType symbol_172 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		
		LambdaType symbol_173 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		
		LambdaType symbol_174 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		
		LambdaType symbol_175 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		
		LambdaType symbol_176 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		
		LambdaType symbol_177 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		
		LambdaType symbol_178 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		TupleType symbol_179 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_180 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_181 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		TupleType symbol_182 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_183 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_184 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		TupleType symbol_185 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_186 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_187 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		TupleType symbol_188 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_189 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_190 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		ClassifierType symbol_191 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		
		ClassifierType symbol_192 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		
		ClassifierType symbol_193 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		
		ClassifierType symbol_194 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		
		ClassifierType symbol_195 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		
		ClassifierType symbol_196 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		
		ClassifierType symbol_197 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		
		ClassifierType symbol_198 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()?U]
		
		ClassifierType symbol_199 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		
		ClassifierType symbol_200 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		
		ClassifierType symbol_201 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		
		ClassifierType symbol_202 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		
		ClassifierType symbol_203 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		BagType symbol_204 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		BagType symbol_205 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		BagType symbol_206 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		BagType symbol_207 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		ClassifierType symbol_208 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		ClassifierType symbol_209 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_210 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		
		CollectionType symbol_211 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_212 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_213 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		CollectionType symbol_214 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		CollectionType symbol_215 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		CollectionType symbol_216 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_217 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_218 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		
		CollectionType symbol_219 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
		
		CollectionType symbol_220 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		
		CollectionType symbol_221 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		
		CollectionType symbol_222 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_223 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_224 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_225 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		CollectionType symbol_226 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_227 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_228 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_229 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		
		CollectionType symbol_230 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_231 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_232 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_233 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_234 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_235 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_236 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_237 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_238 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		CollectionType symbol_239 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_240 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_241 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_242 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		ClassifierType symbol_243 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_244 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_245 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_246 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		CollectionType symbol_247 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		CollectionType symbol_248 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		CollectionType symbol_249 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_250 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_251 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_252 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_253 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_254 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_255 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_256 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_257 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_258 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_259 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_260 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_261 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_262 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_263 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_264 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_265 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_266 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_267 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_268 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_269 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_270 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_271 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_272 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_273 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[String]
		
		CollectionType symbol_274 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		CollectionType symbol_275 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_276 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_277 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_278 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_279 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_280 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_281 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_282 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_283 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		
		CollectionType symbol_284 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_285 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_286 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		CollectionType symbol_287 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_288 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[String]
		
		CollectionType symbol_289 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_290 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		CollectionType symbol_291 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		
		CollectionType symbol_292 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_293 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_294 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_295 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_296 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_297 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		CollectionType symbol_298 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_299 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		OrderedSetType symbol_300 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		OrderedSetType symbol_301 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		OrderedSetType symbol_302 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		OrderedSetType symbol_303 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		OrderedSetType symbol_304 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		SequenceType symbol_305 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
		
		SequenceType symbol_306 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		SequenceType symbol_307 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		
		SequenceType symbol_308 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		SequenceType symbol_309 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		SequenceType symbol_310 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		SetType symbol_311 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		SetType symbol_312 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		SetType symbol_313 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		SetType symbol_314 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		SetType symbol_315 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		SetType symbol_316 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		SetType symbol_317 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		SetType symbol_318 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_319 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_320 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_321 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		CollectionType symbol_322 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		CollectionType symbol_323 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_324 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		CollectionType symbol_325 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_326 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_327 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_328 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_329 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_330 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_331 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_332 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_333 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_334 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_335 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_336 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_337 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_338 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_339 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_340 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_341 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_342 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_343 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_344 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_345 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_346 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_347 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_348 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_349 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		AnyType symbol_350 = PivotFactory.eINSTANCE.createAnyType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		
		

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
		symbol_11.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Boolean::<>()
			Operation symbol_351 = PivotFactory.eINSTANCE.createOperation(); // Boolean!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_351.setName("<>");
			symbol_351.setType(symbol_11);  // Boolean
			
			Parameter symbol_352 = PivotFactory.eINSTANCE.createParameter(); // Boolean!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_352.setName("object2");
			symbol_352.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_351.getOwnedParameters().add(symbol_352);
			symbol_351.setPrecedence(symbol_6);
			symbol_351.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_351.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_351);
		}
		{	// ocl::Boolean::=()
			Operation symbol_353 = PivotFactory.eINSTANCE.createOperation(); // Boolean!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_353.setName("=");
			symbol_353.setType(symbol_11);  // Boolean
			
			Parameter symbol_354 = PivotFactory.eINSTANCE.createParameter(); // Boolean!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_354.setName("object2");
			symbol_354.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_353.getOwnedParameters().add(symbol_354);
			symbol_353.setPrecedence(symbol_6);
			symbol_353.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_353.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_353);
		}
		{	// ocl::Boolean::allInstances()
			Operation symbol_355 = PivotFactory.eINSTANCE.createOperation(); // Boolean!allInstances()
			symbol_355.setName("allInstances");
			symbol_355.setType(symbol_316);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_355.setIsStatic(true);
			symbol_355.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation");
			symbol_355.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_355);
		}
		{	// ocl::Boolean::and()
			Operation symbol_356 = PivotFactory.eINSTANCE.createOperation(); // Boolean!and(Boolean)
			symbol_356.setName("and");
			symbol_356.setType(symbol_11);  // Boolean
			
			Parameter symbol_357 = PivotFactory.eINSTANCE.createParameter(); // Boolean!and(Boolean)!b
			symbol_357.setName("b");
			symbol_357.setType(symbol_11);  // Boolean
			
			symbol_356.getOwnedParameters().add(symbol_357);
			symbol_356.setPrecedence(symbol_7);
			symbol_356.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanAndOperation");
			symbol_356.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_356);
		}
		{	// ocl::Boolean::implies()
			Operation symbol_358 = PivotFactory.eINSTANCE.createOperation(); // Boolean!implies(Boolean)
			symbol_358.setName("implies");
			symbol_358.setType(symbol_11);  // Boolean
			
			Parameter symbol_359 = PivotFactory.eINSTANCE.createParameter(); // Boolean!implies(Boolean)!b
			symbol_359.setName("b");
			symbol_359.setType(symbol_11);  // Boolean
			
			symbol_358.getOwnedParameters().add(symbol_359);
			symbol_358.setPrecedence(symbol_10);
			symbol_358.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation");
			symbol_358.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_358);
		}
		{	// ocl::Boolean::not()
			Operation symbol_360 = PivotFactory.eINSTANCE.createOperation(); // Boolean!not()
			symbol_360.setName("not");
			symbol_360.setType(symbol_11);  // Boolean
			
			symbol_360.setPrecedence(symbol_2);
			symbol_360.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanNotOperation");
			symbol_360.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_360);
		}
		{	// ocl::Boolean::or()
			Operation symbol_361 = PivotFactory.eINSTANCE.createOperation(); // Boolean!or(Boolean)
			symbol_361.setName("or");
			symbol_361.setType(symbol_11);  // Boolean
			
			Parameter symbol_362 = PivotFactory.eINSTANCE.createParameter(); // Boolean!or(Boolean)!b
			symbol_362.setName("b");
			symbol_362.setType(symbol_11);  // Boolean
			
			symbol_361.getOwnedParameters().add(symbol_362);
			symbol_361.setPrecedence(symbol_8);
			symbol_361.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanOrOperation");
			symbol_361.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_361);
		}
		{	// ocl::Boolean::toString()
			Operation symbol_363 = PivotFactory.eINSTANCE.createOperation(); // Boolean!toString()
			symbol_363.setName("toString");
			symbol_363.setType(symbol_14);  // String
			
			symbol_363.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_363.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_363);
		}
		{	// ocl::Boolean::xor()
			Operation symbol_364 = PivotFactory.eINSTANCE.createOperation(); // Boolean!xor(Boolean)
			symbol_364.setName("xor");
			symbol_364.setType(symbol_11);  // Boolean
			
			Parameter symbol_365 = PivotFactory.eINSTANCE.createParameter(); // Boolean!xor(Boolean)!b
			symbol_365.setName("b");
			symbol_365.setType(symbol_11);  // Boolean
			
			symbol_364.getOwnedParameters().add(symbol_365);
			symbol_364.setPrecedence(symbol_9);
			symbol_364.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanXorOperation");
			symbol_364.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_364);
		}
		symbol_0.getOwnedTypes().add(symbol_11); // Boolean
		//
		// ocl::Integer Integer
		//
		symbol_12.setName("Integer");
		symbol_12.getSuperClasses().add(symbol_13); // Real
		{	// ocl::Integer::*()
			Operation symbol_366 = PivotFactory.eINSTANCE.createOperation(); // Integer!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_366.setName("*");
			symbol_366.setType(symbol_12);  // Integer
			
			Parameter symbol_367 = PivotFactory.eINSTANCE.createParameter(); // Integer!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_367.setName("i");
			symbol_367.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_366.getOwnedParameters().add(symbol_367);
			symbol_366.setPrecedence(symbol_3);
			symbol_366.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericTimesOperation");
			symbol_366.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_366);
		}
		{	// ocl::Integer::+()
			Operation symbol_368 = PivotFactory.eINSTANCE.createOperation(); // Integer!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_368.setName("+");
			symbol_368.setType(symbol_12);  // Integer
			
			Parameter symbol_369 = PivotFactory.eINSTANCE.createParameter(); // Integer!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_369.setName("i");
			symbol_369.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_368.getOwnedParameters().add(symbol_369);
			symbol_368.setPrecedence(symbol_4);
			symbol_368.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerPlusOperation");
			symbol_368.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerPlusOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_368);
		}
		{	// ocl::Integer::-()
			Operation symbol_370 = PivotFactory.eINSTANCE.createOperation(); // Integer!-()
			symbol_370.setName("-");
			symbol_370.setType(symbol_12);  // Integer
			
			symbol_370.setPrecedence(symbol_2);
			symbol_370.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericNegateOperation");
			symbol_370.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_370);
		}
		{	// ocl::Integer::-()
			Operation symbol_371 = PivotFactory.eINSTANCE.createOperation(); // Integer!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_371.setName("-");
			symbol_371.setType(symbol_12);  // Integer
			
			Parameter symbol_372 = PivotFactory.eINSTANCE.createParameter(); // Integer!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_372.setName("i");
			symbol_372.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_371.getOwnedParameters().add(symbol_372);
			symbol_371.setPrecedence(symbol_4);
			symbol_371.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerMinusOperation");
			symbol_371.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerMinusOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_371);
		}
		{	// ocl::Integer::/()
			Operation symbol_373 = PivotFactory.eINSTANCE.createOperation(); // Integer!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_373.setName("/");
			symbol_373.setType(symbol_13);  // Real
			
			Parameter symbol_374 = PivotFactory.eINSTANCE.createParameter(); // Integer!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_374.setName("i");
			symbol_374.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_373.getOwnedParameters().add(symbol_374);
			symbol_373.setPrecedence(symbol_3);
			symbol_373.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivideOperation");
			symbol_373.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_373);
		}
		{	// ocl::Integer::abs()
			Operation symbol_375 = PivotFactory.eINSTANCE.createOperation(); // Integer!abs()
			symbol_375.setName("abs");
			symbol_375.setType(symbol_12);  // Integer
			
			symbol_375.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericAbsOperation");
			symbol_375.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_375);
		}
		{	// ocl::Integer::compareTo()
			Operation symbol_376 = PivotFactory.eINSTANCE.createOperation(); // Integer!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_376.setName("compareTo");
			symbol_376.setType(symbol_12);  // Integer
			
			Parameter symbol_377 = PivotFactory.eINSTANCE.createParameter(); // Integer!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_377.setName("that");
			symbol_377.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_376.getOwnedParameters().add(symbol_377);
			symbol_376.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation");
			symbol_376.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_376);
		}
		{	// ocl::Integer::div()
			Operation symbol_378 = PivotFactory.eINSTANCE.createOperation(); // Integer!div(Integer)
			symbol_378.setName("div");
			symbol_378.setType(symbol_12);  // Integer
			
			Parameter symbol_379 = PivotFactory.eINSTANCE.createParameter(); // Integer!div(Integer)!i
			symbol_379.setName("i");
			symbol_379.setType(symbol_12);  // Integer
			
			symbol_378.getOwnedParameters().add(symbol_379);
			symbol_378.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivOperation");
			symbol_378.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_378);
		}
		{	// ocl::Integer::max()
			Operation symbol_380 = PivotFactory.eINSTANCE.createOperation(); // Integer!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_380.setName("max");
			symbol_380.setType(symbol_12);  // Integer
			
			Parameter symbol_381 = PivotFactory.eINSTANCE.createParameter(); // Integer!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_381.setName("i");
			symbol_381.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_380.getOwnedParameters().add(symbol_381);
			symbol_380.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMaxOperation");
			symbol_380.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_380);
		}
		{	// ocl::Integer::min()
			Operation symbol_382 = PivotFactory.eINSTANCE.createOperation(); // Integer!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_382.setName("min");
			symbol_382.setType(symbol_12);  // Integer
			
			Parameter symbol_383 = PivotFactory.eINSTANCE.createParameter(); // Integer!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_383.setName("i");
			symbol_383.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_382.getOwnedParameters().add(symbol_383);
			symbol_382.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMinOperation");
			symbol_382.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_382);
		}
		{	// ocl::Integer::mod()
			Operation symbol_384 = PivotFactory.eINSTANCE.createOperation(); // Integer!mod(Integer)
			symbol_384.setName("mod");
			symbol_384.setType(symbol_12);  // Integer
			
			Parameter symbol_385 = PivotFactory.eINSTANCE.createParameter(); // Integer!mod(Integer)!i
			symbol_385.setName("i");
			symbol_385.setType(symbol_12);  // Integer
			
			symbol_384.getOwnedParameters().add(symbol_385);
			symbol_384.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericModOperation");
			symbol_384.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_384);
		}
		{	// ocl::Integer::toString()
			Operation symbol_386 = PivotFactory.eINSTANCE.createOperation(); // Integer!toString()
			symbol_386.setName("toString");
			symbol_386.setType(symbol_14);  // String
			
			symbol_386.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_386.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_386);
		}
		symbol_0.getOwnedTypes().add(symbol_12); // Integer
		//
		// ocl::Real Real
		//
		symbol_13.setName("Real");
		symbol_13.getSuperClasses().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		symbol_13.getSuperClasses().add(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		{	// ocl::Real::*()
			Operation symbol_387 = PivotFactory.eINSTANCE.createOperation(); // Real!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_387.setName("*");
			symbol_387.setType(symbol_13);  // Real
			
			Parameter symbol_388 = PivotFactory.eINSTANCE.createParameter(); // Real!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_388.setName("r");
			symbol_388.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_387.getOwnedParameters().add(symbol_388);
			symbol_387.setPrecedence(symbol_3);
			symbol_387.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericTimesOperation");
			symbol_387.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_387);
		}
		{	// ocl::Real::+()
			Operation symbol_389 = PivotFactory.eINSTANCE.createOperation(); // Real!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_389.setName("+");
			symbol_389.setType(symbol_13);  // Real
			
			Parameter symbol_390 = PivotFactory.eINSTANCE.createParameter(); // Real!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_390.setName("r");
			symbol_390.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_389.getOwnedParameters().add(symbol_390);
			symbol_389.setPrecedence(symbol_4);
			symbol_389.setImplementationClass("org.eclipse.ocl.examples.library.real.RealPlusOperation");
			symbol_389.setImplementation(org.eclipse.ocl.examples.library.real.RealPlusOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_389);
		}
		{	// ocl::Real::-()
			Operation symbol_391 = PivotFactory.eINSTANCE.createOperation(); // Real!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_391.setName("-");
			symbol_391.setType(symbol_13);  // Real
			
			Parameter symbol_392 = PivotFactory.eINSTANCE.createParameter(); // Real!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_392.setName("r");
			symbol_392.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_391.getOwnedParameters().add(symbol_392);
			symbol_391.setPrecedence(symbol_4);
			symbol_391.setImplementationClass("org.eclipse.ocl.examples.library.real.RealMinusOperation");
			symbol_391.setImplementation(org.eclipse.ocl.examples.library.real.RealMinusOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_391);
		}
		{	// ocl::Real::-()
			Operation symbol_393 = PivotFactory.eINSTANCE.createOperation(); // Real!-()
			symbol_393.setName("-");
			symbol_393.setType(symbol_13);  // Real
			
			symbol_393.setPrecedence(symbol_2);
			symbol_393.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericNegateOperation");
			symbol_393.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_393);
		}
		{	// ocl::Real::/()
			Operation symbol_394 = PivotFactory.eINSTANCE.createOperation(); // Real!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_394.setName("/");
			symbol_394.setType(symbol_13);  // Real
			
			Parameter symbol_395 = PivotFactory.eINSTANCE.createParameter(); // Real!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_395.setName("r");
			symbol_395.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_394.getOwnedParameters().add(symbol_395);
			symbol_394.setPrecedence(symbol_3);
			symbol_394.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivideOperation");
			symbol_394.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_394);
		}
		{	// ocl::Real::<()
			Operation symbol_396 = PivotFactory.eINSTANCE.createOperation(); // Real!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_396.setName("<");
			symbol_396.setType(symbol_11);  // Boolean
			
			Parameter symbol_397 = PivotFactory.eINSTANCE.createParameter(); // Real!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_397.setName("r");
			symbol_397.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_396.getOwnedParameters().add(symbol_397);
			symbol_396.setPrecedence(symbol_5);
			symbol_396.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation");
			symbol_396.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_396);
		}
		{	// ocl::Real::<=()
			Operation symbol_398 = PivotFactory.eINSTANCE.createOperation(); // Real!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_398.setName("<=");
			symbol_398.setType(symbol_11);  // Boolean
			
			Parameter symbol_399 = PivotFactory.eINSTANCE.createParameter(); // Real!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_399.setName("r");
			symbol_399.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_398.getOwnedParameters().add(symbol_399);
			symbol_398.setPrecedence(symbol_5);
			symbol_398.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation");
			symbol_398.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_398);
		}
		{	// ocl::Real::<>()
			Operation symbol_400 = PivotFactory.eINSTANCE.createOperation(); // Real!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_400.setName("<>");
			symbol_400.setType(symbol_11);  // Boolean
			
			Parameter symbol_401 = PivotFactory.eINSTANCE.createParameter(); // Real!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_401.setName("object2");
			symbol_401.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_400.getOwnedParameters().add(symbol_401);
			symbol_400.setPrecedence(symbol_6);
			symbol_400.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_400.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_400);
		}
		{	// ocl::Real::=()
			Operation symbol_402 = PivotFactory.eINSTANCE.createOperation(); // Real!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_402.setName("=");
			symbol_402.setType(symbol_11);  // Boolean
			
			Parameter symbol_403 = PivotFactory.eINSTANCE.createParameter(); // Real!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_403.setName("object2");
			symbol_403.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_402.getOwnedParameters().add(symbol_403);
			symbol_402.setPrecedence(symbol_6);
			symbol_402.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_402.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_402);
		}
		{	// ocl::Real::>()
			Operation symbol_404 = PivotFactory.eINSTANCE.createOperation(); // Real!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_404.setName(">");
			symbol_404.setType(symbol_11);  // Boolean
			
			Parameter symbol_405 = PivotFactory.eINSTANCE.createParameter(); // Real!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_405.setName("r");
			symbol_405.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_404.getOwnedParameters().add(symbol_405);
			symbol_404.setPrecedence(symbol_5);
			symbol_404.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation");
			symbol_404.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_404);
		}
		{	// ocl::Real::>=()
			Operation symbol_406 = PivotFactory.eINSTANCE.createOperation(); // Real!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_406.setName(">=");
			symbol_406.setType(symbol_11);  // Boolean
			
			Parameter symbol_407 = PivotFactory.eINSTANCE.createParameter(); // Real!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_407.setName("r");
			symbol_407.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_406.getOwnedParameters().add(symbol_407);
			symbol_406.setPrecedence(symbol_5);
			symbol_406.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation");
			symbol_406.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_406);
		}
		{	// ocl::Real::abs()
			Operation symbol_408 = PivotFactory.eINSTANCE.createOperation(); // Real!abs()
			symbol_408.setName("abs");
			symbol_408.setType(symbol_13);  // Real
			
			symbol_408.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericAbsOperation");
			symbol_408.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_408);
		}
		{	// ocl::Real::compareTo()
			Operation symbol_409 = PivotFactory.eINSTANCE.createOperation(); // Real!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_409.setName("compareTo");
			symbol_409.setType(symbol_12);  // Integer
			
			Parameter symbol_410 = PivotFactory.eINSTANCE.createParameter(); // Real!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_410.setName("that");
			symbol_410.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_409.getOwnedParameters().add(symbol_410);
			symbol_409.setImplementationClass("org.eclipse.ocl.examples.library.real.RealCompareToOperation");
			symbol_409.setImplementation(org.eclipse.ocl.examples.library.real.RealCompareToOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_409);
		}
		{	// ocl::Real::floor()
			Operation symbol_411 = PivotFactory.eINSTANCE.createOperation(); // Real!floor()
			symbol_411.setName("floor");
			symbol_411.setType(symbol_12);  // Integer
			
			symbol_411.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericFloorOperation");
			symbol_411.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_411);
		}
		{	// ocl::Real::max()
			Operation symbol_412 = PivotFactory.eINSTANCE.createOperation(); // Real!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_412.setName("max");
			symbol_412.setType(symbol_13);  // Real
			
			Parameter symbol_413 = PivotFactory.eINSTANCE.createParameter(); // Real!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_413.setName("r");
			symbol_413.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_412.getOwnedParameters().add(symbol_413);
			symbol_412.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMaxOperation");
			symbol_412.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_412);
		}
		{	// ocl::Real::min()
			Operation symbol_414 = PivotFactory.eINSTANCE.createOperation(); // Real!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_414.setName("min");
			symbol_414.setType(symbol_13);  // Real
			
			Parameter symbol_415 = PivotFactory.eINSTANCE.createParameter(); // Real!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_415.setName("r");
			symbol_415.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_414.getOwnedParameters().add(symbol_415);
			symbol_414.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMinOperation");
			symbol_414.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_414);
		}
		{	// ocl::Real::round()
			Operation symbol_416 = PivotFactory.eINSTANCE.createOperation(); // Real!round()
			symbol_416.setName("round");
			symbol_416.setType(symbol_12);  // Integer
			
			symbol_416.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericRoundOperation");
			symbol_416.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_416);
		}
		{	// ocl::Real::toString()
			Operation symbol_417 = PivotFactory.eINSTANCE.createOperation(); // Real!toString()
			symbol_417.setName("toString");
			symbol_417.setType(symbol_14);  // String
			
			symbol_417.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_417.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_417);
		}
		symbol_0.getOwnedTypes().add(symbol_13); // Real
		//
		// ocl::String String
		//
		symbol_14.setName("String");
		symbol_14.getSuperClasses().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		symbol_14.getSuperClasses().add(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		{	// ocl::String::+()
			Operation symbol_418 = PivotFactory.eINSTANCE.createOperation(); // String!+(String)
			symbol_418.setName("+");
			symbol_418.setType(symbol_14);  // String
			
			Parameter symbol_419 = PivotFactory.eINSTANCE.createParameter(); // String!+(String)!s
			symbol_419.setName("s");
			symbol_419.setType(symbol_14);  // String
			
			symbol_418.getOwnedParameters().add(symbol_419);
			symbol_418.setPrecedence(symbol_4);
			symbol_418.setImplementationClass("org.eclipse.ocl.examples.library.string.StringConcatOperation");
			symbol_418.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_418);
		}
		{	// ocl::String::<()
			Operation symbol_420 = PivotFactory.eINSTANCE.createOperation(); // String!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_420.setName("<");
			symbol_420.setType(symbol_11);  // Boolean
			
			Parameter symbol_421 = PivotFactory.eINSTANCE.createParameter(); // String!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_421.setName("s");
			symbol_421.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_420.getOwnedParameters().add(symbol_421);
			symbol_420.setPrecedence(symbol_5);
			symbol_420.setImplementationClass("org.eclipse.ocl.examples.library.string.StringLessThanOperation");
			symbol_420.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_420);
		}
		{	// ocl::String::<=()
			Operation symbol_422 = PivotFactory.eINSTANCE.createOperation(); // String!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_422.setName("<=");
			symbol_422.setType(symbol_11);  // Boolean
			
			Parameter symbol_423 = PivotFactory.eINSTANCE.createParameter(); // String!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_423.setName("s");
			symbol_423.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_422.getOwnedParameters().add(symbol_423);
			symbol_422.setPrecedence(symbol_5);
			symbol_422.setImplementationClass("org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation");
			symbol_422.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_422);
		}
		{	// ocl::String::<>()
			Operation symbol_424 = PivotFactory.eINSTANCE.createOperation(); // String!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_424.setName("<>");
			symbol_424.setType(symbol_11);  // Boolean
			
			Parameter symbol_425 = PivotFactory.eINSTANCE.createParameter(); // String!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_425.setName("object2");
			symbol_425.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_424.getOwnedParameters().add(symbol_425);
			symbol_424.setPrecedence(symbol_6);
			symbol_424.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_424.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_424);
		}
		{	// ocl::String::=()
			Operation symbol_426 = PivotFactory.eINSTANCE.createOperation(); // String!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_426.setName("=");
			symbol_426.setType(symbol_11);  // Boolean
			
			Parameter symbol_427 = PivotFactory.eINSTANCE.createParameter(); // String!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_427.setName("object2");
			symbol_427.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_426.getOwnedParameters().add(symbol_427);
			symbol_426.setPrecedence(symbol_6);
			symbol_426.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_426.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_426);
		}
		{	// ocl::String::>()
			Operation symbol_428 = PivotFactory.eINSTANCE.createOperation(); // String!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_428.setName(">");
			symbol_428.setType(symbol_11);  // Boolean
			
			Parameter symbol_429 = PivotFactory.eINSTANCE.createParameter(); // String!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_429.setName("s");
			symbol_429.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_428.getOwnedParameters().add(symbol_429);
			symbol_428.setPrecedence(symbol_5);
			symbol_428.setImplementationClass("org.eclipse.ocl.examples.library.string.StringGreaterThanOperation");
			symbol_428.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_428);
		}
		{	// ocl::String::>=()
			Operation symbol_430 = PivotFactory.eINSTANCE.createOperation(); // String!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_430.setName(">=");
			symbol_430.setType(symbol_11);  // Boolean
			
			Parameter symbol_431 = PivotFactory.eINSTANCE.createParameter(); // String!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_431.setName("s");
			symbol_431.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_430.getOwnedParameters().add(symbol_431);
			symbol_430.setPrecedence(symbol_5);
			symbol_430.setImplementationClass("org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation");
			symbol_430.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_430);
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
			symbol_14.getOwnedOperations().add(symbol_432);
		}
		{	// ocl::String::characters()
			Operation symbol_434 = PivotFactory.eINSTANCE.createOperation(); // String!characters()
			symbol_434.setName("characters");
			symbol_434.setType(symbol_305);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
			
			symbol_434.setImplementationClass("org.eclipse.ocl.examples.library.string.StringCharactersOperation");
			symbol_434.setImplementation(org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_434);
		}
		{	// ocl::String::compareTo()
			Operation symbol_435 = PivotFactory.eINSTANCE.createOperation(); // String!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_435.setName("compareTo");
			symbol_435.setType(symbol_12);  // Integer
			
			Parameter symbol_436 = PivotFactory.eINSTANCE.createParameter(); // String!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_436.setName("that");
			symbol_436.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_435.getOwnedParameters().add(symbol_436);
			symbol_435.setImplementationClass("org.eclipse.ocl.examples.library.string.StringCompareToOperation");
			symbol_435.setImplementation(org.eclipse.ocl.examples.library.string.StringCompareToOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_435);
		}
		{	// ocl::String::concat()
			Operation symbol_437 = PivotFactory.eINSTANCE.createOperation(); // String!concat(String)
			symbol_437.setName("concat");
			symbol_437.setType(symbol_14);  // String
			
			Parameter symbol_438 = PivotFactory.eINSTANCE.createParameter(); // String!concat(String)!s
			symbol_438.setName("s");
			symbol_438.setType(symbol_14);  // String
			
			symbol_437.getOwnedParameters().add(symbol_438);
			symbol_437.setImplementationClass("org.eclipse.ocl.examples.library.string.StringConcatOperation");
			symbol_437.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_437);
		}
		{	// ocl::String::equalsIgnoreCase()
			Operation symbol_439 = PivotFactory.eINSTANCE.createOperation(); // String!equalsIgnoreCase(String)
			symbol_439.setName("equalsIgnoreCase");
			symbol_439.setType(symbol_11);  // Boolean
			
			Parameter symbol_440 = PivotFactory.eINSTANCE.createParameter(); // String!equalsIgnoreCase(String)!s
			symbol_440.setName("s");
			symbol_440.setType(symbol_14);  // String
			
			symbol_439.getOwnedParameters().add(symbol_440);
			symbol_439.setImplementationClass("org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation");
			symbol_439.setImplementation(org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_439);
		}
		{	// ocl::String::indexOf()
			Operation symbol_441 = PivotFactory.eINSTANCE.createOperation(); // String!indexOf(String)
			symbol_441.setName("indexOf");
			symbol_441.setType(symbol_12);  // Integer
			
			Parameter symbol_442 = PivotFactory.eINSTANCE.createParameter(); // String!indexOf(String)!s
			symbol_442.setName("s");
			symbol_442.setType(symbol_14);  // String
			
			symbol_441.getOwnedParameters().add(symbol_442);
			symbol_441.setImplementationClass("org.eclipse.ocl.examples.library.string.StringIndexOfOperation");
			symbol_441.setImplementation(org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_441);
		}
		{	// ocl::String::size()
			Operation symbol_443 = PivotFactory.eINSTANCE.createOperation(); // String!size()
			symbol_443.setName("size");
			symbol_443.setType(symbol_12);  // Integer
			
			symbol_443.setImplementationClass("org.eclipse.ocl.examples.library.string.StringSizeOperation");
			symbol_443.setImplementation(org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_443);
		}
		{	// ocl::String::substring()
			Operation symbol_444 = PivotFactory.eINSTANCE.createOperation(); // String!substring(Integer,Integer)
			symbol_444.setName("substring");
			symbol_444.setType(symbol_14);  // String
			
			Parameter symbol_445 = PivotFactory.eINSTANCE.createParameter(); // String!substring(Integer,Integer)!lower
			symbol_445.setName("lower");
			symbol_445.setType(symbol_12);  // Integer
			
			symbol_444.getOwnedParameters().add(symbol_445);
			Parameter symbol_446 = PivotFactory.eINSTANCE.createParameter(); // String!substring(Integer,Integer)!upper
			symbol_446.setName("upper");
			symbol_446.setType(symbol_12);  // Integer
			
			symbol_444.getOwnedParameters().add(symbol_446);
			symbol_444.setImplementationClass("org.eclipse.ocl.examples.library.string.StringSubstringOperation");
			symbol_444.setImplementation(org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_444);
		}
		{	// ocl::String::toBoolean()
			Operation symbol_447 = PivotFactory.eINSTANCE.createOperation(); // String!toBoolean()
			symbol_447.setName("toBoolean");
			symbol_447.setType(symbol_11);  // Boolean
			
			symbol_447.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToBooleanOperation");
			symbol_447.setImplementation(org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_447);
		}
		{	// ocl::String::toInteger()
			Operation symbol_448 = PivotFactory.eINSTANCE.createOperation(); // String!toInteger()
			symbol_448.setName("toInteger");
			symbol_448.setType(symbol_12);  // Integer
			
			symbol_448.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToIntegerOperation");
			symbol_448.setImplementation(org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_448);
		}
		{	// ocl::String::toLower()
			Operation symbol_449 = PivotFactory.eINSTANCE.createOperation(); // String!toLower()
			symbol_449.setName("toLower");
			symbol_449.setType(symbol_14);  // String
			
			symbol_449.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation");
			symbol_449.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_449);
		}
		{	// ocl::String::toLowerCase()
			Operation symbol_450 = PivotFactory.eINSTANCE.createOperation(); // String!toLowerCase()
			symbol_450.setName("toLowerCase");
			symbol_450.setType(symbol_14);  // String
			
			symbol_450.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation");
			symbol_450.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_450);
		}
		{	// ocl::String::toReal()
			Operation symbol_451 = PivotFactory.eINSTANCE.createOperation(); // String!toReal()
			symbol_451.setName("toReal");
			symbol_451.setType(symbol_13);  // Real
			
			symbol_451.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToRealOperation");
			symbol_451.setImplementation(org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_451);
		}
		{	// ocl::String::toString()
			Operation symbol_452 = PivotFactory.eINSTANCE.createOperation(); // String!toString()
			symbol_452.setName("toString");
			symbol_452.setType(symbol_14);  // String
			
			symbol_452.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_452.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_452);
		}
		{	// ocl::String::toUpper()
			Operation symbol_453 = PivotFactory.eINSTANCE.createOperation(); // String!toUpper()
			symbol_453.setName("toUpper");
			symbol_453.setType(symbol_14);  // String
			
			symbol_453.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation");
			symbol_453.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_453);
		}
		{	// ocl::String::toUpperCase()
			Operation symbol_454 = PivotFactory.eINSTANCE.createOperation(); // String!toUpperCase()
			symbol_454.setName("toUpperCase");
			symbol_454.setType(symbol_14);  // String
			
			symbol_454.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation");
			symbol_454.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_454);
		}
		symbol_0.getOwnedTypes().add(symbol_14); // String
		//
		// ocl::UnlimitedNatural UnlimitedNatural
		//
		symbol_15.setName("UnlimitedNatural");
		symbol_15.getSuperClasses().add(symbol_12); // Integer
		{	// ocl::UnlimitedNatural::oclAsType()
			Operation symbol_455 = PivotFactory.eINSTANCE.createOperation(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])
			symbol_18.setName("TT");
			symbol_17.setOwnedParameteredElement(symbol_18);
			symbol_16.getOwnedParameters().add(symbol_17);
			
			symbol_455.setOwnedTemplateSignature(symbol_16);
			symbol_455.setName("oclAsType");
			symbol_455.setType(symbol_18);  // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT
			
			Parameter symbol_456 = PivotFactory.eINSTANCE.createParameter(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])!type
			symbol_456.setName("type");
			symbol_456.setType(symbol_191);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
			
			symbol_455.getOwnedParameters().add(symbol_456);
			symbol_455.setImplementationClass("org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation");
			symbol_455.setImplementation(org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_455);
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
		symbol_19.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
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
		symbol_23.getSuperClasses().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		symbol_23.getSuperClasses().add(symbol_275); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		{	// ocl::Bag::<>()
			Operation symbol_457 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_457.setName("<>");
			symbol_457.setType(symbol_11);  // Boolean
			
			Parameter symbol_458 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_458.setName("object2");
			symbol_458.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_457.getOwnedParameters().add(symbol_458);
			symbol_457.setPrecedence(symbol_6);
			symbol_457.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_457.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_23.getOwnedOperations().add(symbol_457);
		}
		{	// ocl::Bag::=()
			Operation symbol_459 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_459.setName("=");
			symbol_459.setType(symbol_11);  // Boolean
			
			Parameter symbol_460 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_460.setName("object2");
			symbol_460.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_459.getOwnedParameters().add(symbol_460);
			symbol_459.setPrecedence(symbol_6);
			symbol_459.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_459.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_23.getOwnedOperations().add(symbol_459);
		}
		{	// ocl::Bag::excluding()
			Operation symbol_461 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_461.setName("excluding");
			symbol_461.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_462 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_462.setName("object");
			symbol_462.setType(symbol_88);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_461.getOwnedParameters().add(symbol_462);
			symbol_461.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_461.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_23.getOwnedOperations().add(symbol_461);
		}
		{	// ocl::Bag::flatten()
			Operation symbol_463 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()
			symbol_29.setName("T2");
			symbol_28.setOwnedParameteredElement(symbol_29);
			symbol_27.getOwnedParameters().add(symbol_28);
			
			symbol_463.setOwnedTemplateSignature(symbol_27);
			symbol_463.setName("flatten");
			symbol_463.setType(symbol_204);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
			
			symbol_463.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_463.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_23.getOwnedOperations().add(symbol_463);
		}
		{	// ocl::Bag::including()
			Operation symbol_464 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!including(T)
			symbol_464.setName("including");
			symbol_464.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_465 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!including(T)!object
			symbol_465.setName("object");
			symbol_465.setType(symbol_26);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_464.getOwnedParameters().add(symbol_465);
			symbol_464.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_464.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_23.getOwnedOperations().add(symbol_464);
		}
		{	// ocl::Bag::reject()
			Iteration symbol_466 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)
			symbol_466.setName("reject");
			symbol_466.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_467 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)!i
			symbol_467.setName("i");
			symbol_467.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			symbol_466.getOwnedIterators().add(symbol_467);
			Parameter symbol_468 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)!body
			symbol_468.setName("body");
			symbol_468.setType(symbol_151);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
			
			symbol_466.getOwnedParameters().add(symbol_468);
			symbol_466.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_466.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_23.getOwnedOperations().add(symbol_466);
		}
		{	// ocl::Bag::select()
			Iteration symbol_469 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)
			symbol_469.setName("select");
			symbol_469.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_470 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)!i
			symbol_470.setName("i");
			symbol_470.setType(symbol_26); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			symbol_469.getOwnedIterators().add(symbol_470);
			Parameter symbol_471 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)!body
			symbol_471.setName("body");
			symbol_471.setType(symbol_152);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
			
			symbol_469.getOwnedParameters().add(symbol_471);
			symbol_469.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_469.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_23.getOwnedOperations().add(symbol_469);
		}
		symbol_0.getOwnedTypes().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
		//
		// ocl::Class http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		//
		symbol_30.setName("Class");
		symbol_30.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Class::oclType()
			Operation symbol_472 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class!oclType()
			symbol_472.setName("oclType");
			symbol_472.setType(symbol_208);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_472.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_472.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_30.getOwnedOperations().add(symbol_472);
		}
		symbol_0.getOwnedTypes().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		//
		// ocl::ClassClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}
		//
		symbol_31.setName("ClassClassifier");
		symbol_31.setInstanceType(symbol_34);
		symbol_34.setName("T");
		symbol_33.setOwnedParameteredElement(symbol_34);
		symbol_32.getOwnedParameters().add(symbol_33);
		
		symbol_31.setOwnedTemplateSignature(symbol_32);
		symbol_31.getSuperClasses().add(symbol_192); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		symbol_0.getOwnedTypes().add(symbol_31); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}
		//
		// ocl::CollectionClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}
		//
		symbol_35.setName("CollectionClassifier");
		symbol_35.setInstanceType(symbol_38);
		symbol_38.setName("T");
		symbol_37.setOwnedParameteredElement(symbol_38);
		symbol_36.getOwnedParameters().add(symbol_37);
		symbol_40.setName("E");
		symbol_39.setOwnedParameteredElement(symbol_40);
		symbol_36.getOwnedParameters().add(symbol_39);
		
		symbol_35.setOwnedTemplateSignature(symbol_36);
		symbol_35.getSuperClasses().add(symbol_193); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		{ // ocl::CollectionClassifier::elementType
			symbol_41.setName("elementType");
			symbol_41.setType(symbol_40);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?E
			
			symbol_41.setIsResolveProxies(true);
			symbol_41.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionClassifierElementTypeProperty");
			symbol_41.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionClassifierElementTypeProperty.INSTANCE);
			symbol_35.getOwnedAttributes().add(symbol_41);
		}
		symbol_0.getOwnedTypes().add(symbol_35); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}
		//
		// ocl::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
		//
		symbol_42.setName("Collection");
		symbol_42.setElementType(symbol_45);
		symbol_45.setName("T");
		symbol_44.setOwnedParameteredElement(symbol_45);
		symbol_43.getOwnedParameters().add(symbol_44);
		
		symbol_42.setOwnedTemplateSignature(symbol_43);
		symbol_42.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Collection::<>()
			Operation symbol_473 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_473.setName("<>");
			symbol_473.setType(symbol_11);  // Boolean
			
			Parameter symbol_474 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_474.setName("object2");
			symbol_474.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_473.getOwnedParameters().add(symbol_474);
			symbol_473.setPrecedence(symbol_6);
			symbol_473.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_473.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_473);
		}
		{	// ocl::Collection::=()
			Operation symbol_475 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_475.setName("=");
			symbol_475.setType(symbol_11);  // Boolean
			
			Parameter symbol_476 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_476.setName("object2");
			symbol_476.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_475.getOwnedParameters().add(symbol_476);
			symbol_475.setPrecedence(symbol_6);
			symbol_475.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_475.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_475);
		}
		{	// ocl::Collection::any()
			Iteration symbol_477 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)
			symbol_477.setName("any");
			symbol_477.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			Parameter symbol_478 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)!i
			symbol_478.setName("i");
			symbol_478.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_477.getOwnedIterators().add(symbol_478);
			Parameter symbol_479 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)!body
			symbol_479.setName("body");
			symbol_479.setType(symbol_156);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_477.getOwnedParameters().add(symbol_479);
			symbol_477.setImplementationClass("org.eclipse.ocl.examples.library.iterator.AnyIteration");
			symbol_477.setImplementation(org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_477);
		}
		{	// ocl::Collection::asBag()
			Operation symbol_480 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asBag()
			symbol_480.setName("asBag");
			symbol_480.setType(symbol_205);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_480.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation");
			symbol_480.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_480);
		}
		{	// ocl::Collection::asOrderedSet()
			Operation symbol_481 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asOrderedSet()
			symbol_481.setName("asOrderedSet");
			symbol_481.setType(symbol_300);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_481.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation");
			symbol_481.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_481);
		}
		{	// ocl::Collection::asSequence()
			Operation symbol_482 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asSequence()
			symbol_482.setName("asSequence");
			symbol_482.setType(symbol_306);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_482.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation");
			symbol_482.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_482);
		}
		{	// ocl::Collection::asSet()
			Operation symbol_483 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asSet()
			symbol_483.setName("asSet");
			symbol_483.setType(symbol_313);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_483.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation");
			symbol_483.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_483);
		}
		{	// ocl::Collection::collect()
			Iteration symbol_484 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)
			symbol_48.setName("V");
			symbol_47.setOwnedParameteredElement(symbol_48);
			symbol_46.getOwnedParameters().add(symbol_47);
			
			symbol_484.setOwnedTemplateSignature(symbol_46);
			symbol_484.setName("collect");
			symbol_484.setType(symbol_217);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_485 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!i
			symbol_485.setName("i");
			symbol_485.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_484.getOwnedIterators().add(symbol_485);
			Parameter symbol_486 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!body
			symbol_486.setName("body");
			symbol_486.setType(symbol_162);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
			
			symbol_484.getOwnedParameters().add(symbol_486);
			symbol_484.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_484.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_484);
		}
		{	// ocl::Collection::collectNested()
			Iteration symbol_487 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)
			symbol_51.setName("V");
			symbol_50.setOwnedParameteredElement(symbol_51);
			symbol_49.getOwnedParameters().add(symbol_50);
			
			symbol_487.setOwnedTemplateSignature(symbol_49);
			symbol_487.setName("collectNested");
			symbol_487.setType(symbol_42);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_488 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_488.setName("i");
			symbol_488.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_487.getOwnedIterators().add(symbol_488);
			Parameter symbol_489 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_489.setName("body");
			symbol_489.setType(symbol_161);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
			
			symbol_487.getOwnedParameters().add(symbol_489);
			symbol_487.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_487.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_487);
		}
		{	// ocl::Collection::count()
			Operation symbol_490 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!count(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_490.setName("count");
			symbol_490.setType(symbol_12);  // Integer
			
			Parameter symbol_491 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!count(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_491.setName("object");
			symbol_491.setType(symbol_88);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_490.getOwnedParameters().add(symbol_491);
			symbol_490.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionCountOperation");
			symbol_490.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_490);
		}
		{	// ocl::Collection::excludes()
			Operation symbol_492 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_492.setName("excludes");
			symbol_492.setType(symbol_11);  // Boolean
			
			Parameter symbol_493 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_493.setName("object");
			symbol_493.setType(symbol_88);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_492.getOwnedParameters().add(symbol_493);
			symbol_492.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation");
			symbol_492.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_492);
		}
		{	// ocl::Collection::excludesAll()
			Operation symbol_494 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_54.setName("T2");
			symbol_53.setOwnedParameteredElement(symbol_54);
			symbol_52.getOwnedParameters().add(symbol_53);
			
			symbol_494.setOwnedTemplateSignature(symbol_52);
			symbol_494.setName("excludesAll");
			symbol_494.setType(symbol_11);  // Boolean
			
			Parameter symbol_495 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_495.setName("c2");
			symbol_495.setType(symbol_218);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			symbol_494.getOwnedParameters().add(symbol_495);
			symbol_494.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation");
			symbol_494.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_494);
		}
		{	// ocl::Collection::excluding()
			Operation symbol_496 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_496.setName("excluding");
			symbol_496.setType(symbol_42);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_497 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_497.setName("object");
			symbol_497.setType(symbol_88);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_496.getOwnedParameters().add(symbol_497);
			symbol_496.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_496.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_496);
		}
		{	// ocl::Collection::exists()
			Iteration symbol_498 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)
			symbol_498.setName("exists");
			symbol_498.setType(symbol_11);  // Boolean
			
			Parameter symbol_499 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)!i
			symbol_499.setName("i");
			symbol_499.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_498.getOwnedIterators().add(symbol_499);
			Parameter symbol_500 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)!body
			symbol_500.setName("body");
			symbol_500.setType(symbol_155);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_498.getOwnedParameters().add(symbol_500);
			symbol_498.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ExistsIteration");
			symbol_498.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_498);
		}
		{	// ocl::Collection::exists()
			Iteration symbol_501 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)
			symbol_501.setName("exists");
			symbol_501.setType(symbol_11);  // Boolean
			
			Parameter symbol_502 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!i
			symbol_502.setName("i");
			symbol_502.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_501.getOwnedIterators().add(symbol_502);
			Parameter symbol_503 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!j
			symbol_503.setName("j");
			symbol_503.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_501.getOwnedIterators().add(symbol_503);
			Parameter symbol_504 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!body
			symbol_504.setName("body");
			symbol_504.setType(symbol_153);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_501.getOwnedParameters().add(symbol_504);
			symbol_501.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ExistsIteration");
			symbol_501.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_501);
		}
		{	// ocl::Collection::flatten()
			Operation symbol_505 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()
			symbol_57.setName("T2");
			symbol_56.setOwnedParameteredElement(symbol_57);
			symbol_55.getOwnedParameters().add(symbol_56);
			
			symbol_505.setOwnedTemplateSignature(symbol_55);
			symbol_505.setName("flatten");
			symbol_505.setType(symbol_219);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
			
			symbol_505.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_505.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_505);
		}
		{	// ocl::Collection::forAll()
			Iteration symbol_506 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)
			symbol_506.setName("forAll");
			symbol_506.setType(symbol_11);  // Boolean
			
			Parameter symbol_507 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)!i
			symbol_507.setName("i");
			symbol_507.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_506.getOwnedIterators().add(symbol_507);
			Parameter symbol_508 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)!body
			symbol_508.setName("body");
			symbol_508.setType(symbol_159);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_506.getOwnedParameters().add(symbol_508);
			symbol_506.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ForAllIteration");
			symbol_506.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_506);
		}
		{	// ocl::Collection::forAll()
			Iteration symbol_509 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)
			symbol_509.setName("forAll");
			symbol_509.setType(symbol_11);  // Boolean
			
			Parameter symbol_510 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!j
			symbol_510.setName("j");
			symbol_510.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_509.getOwnedIterators().add(symbol_510);
			Parameter symbol_511 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!i
			symbol_511.setName("i");
			symbol_511.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_509.getOwnedIterators().add(symbol_511);
			Parameter symbol_512 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!body
			symbol_512.setName("body");
			symbol_512.setType(symbol_154);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_509.getOwnedParameters().add(symbol_512);
			symbol_509.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ForAllIteration");
			symbol_509.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_509);
		}
		{	// ocl::Collection::includes()
			Operation symbol_513 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_513.setName("includes");
			symbol_513.setType(symbol_11);  // Boolean
			
			Parameter symbol_514 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_514.setName("object");
			symbol_514.setType(symbol_88);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_513.getOwnedParameters().add(symbol_514);
			symbol_513.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation");
			symbol_513.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_513);
		}
		{	// ocl::Collection::includesAll()
			Operation symbol_515 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_60.setName("T2");
			symbol_59.setOwnedParameteredElement(symbol_60);
			symbol_58.getOwnedParameters().add(symbol_59);
			
			symbol_515.setOwnedTemplateSignature(symbol_58);
			symbol_515.setName("includesAll");
			symbol_515.setType(symbol_11);  // Boolean
			
			Parameter symbol_516 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_516.setName("c2");
			symbol_516.setType(symbol_220);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			symbol_515.getOwnedParameters().add(symbol_516);
			symbol_515.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation");
			symbol_515.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_515);
		}
		{	// ocl::Collection::including()
			Operation symbol_517 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!including(T)
			symbol_517.setName("including");
			symbol_517.setType(symbol_42);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_518 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!including(T)!object
			symbol_518.setName("object");
			symbol_518.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_517.getOwnedParameters().add(symbol_518);
			symbol_517.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_517.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_517);
		}
		{	// ocl::Collection::isEmpty()
			Operation symbol_519 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isEmpty()
			symbol_519.setName("isEmpty");
			symbol_519.setType(symbol_11);  // Boolean
			
			symbol_519.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation");
			symbol_519.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_519);
		}
		{	// ocl::Collection::isUnique()
			Iteration symbol_520 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_520.setName("isUnique");
			symbol_520.setType(symbol_11);  // Boolean
			
			Parameter symbol_521 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_521.setName("i");
			symbol_521.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_520.getOwnedIterators().add(symbol_521);
			Parameter symbol_522 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_522.setName("body");
			symbol_522.setType(symbol_163);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_520.getOwnedParameters().add(symbol_522);
			symbol_520.setImplementationClass("org.eclipse.ocl.examples.library.iterator.IsUniqueIteration");
			symbol_520.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_520);
		}
		{	// ocl::Collection::iterate()
			Iteration symbol_523 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)
			symbol_63.setName("Tacc");
			symbol_62.setOwnedParameteredElement(symbol_63);
			symbol_61.getOwnedParameters().add(symbol_62);
			
			symbol_523.setOwnedTemplateSignature(symbol_61);
			symbol_523.setName("iterate");
			symbol_523.setType(symbol_63);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)?Tacc
			
			Parameter symbol_524 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)!i
			symbol_524.setName("i");
			symbol_524.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_523.getOwnedIterators().add(symbol_524);
			Parameter symbol_525 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)!acc
			symbol_525.setName("acc");
			symbol_525.setType(symbol_63); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)?Tacc
			symbol_523.getOwnedAccumulators().add(symbol_525);
			symbol_523.setImplementationClass("org.eclipse.ocl.examples.library.iterator.IterateIteration");
			symbol_523.setImplementation(org.eclipse.ocl.examples.library.iterator.IterateIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_523);
		}
		{	// ocl::Collection::max()
			Operation symbol_526 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!max()
			symbol_526.setName("max");
			symbol_526.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_526.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionMaxOperation");
			symbol_526.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_526);
		}
		{	// ocl::Collection::min()
			Operation symbol_527 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!min()
			symbol_527.setName("min");
			symbol_527.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_527.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionMinOperation");
			symbol_527.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_527);
		}
		{	// ocl::Collection::notEmpty()
			Operation symbol_528 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!notEmpty()
			symbol_528.setName("notEmpty");
			symbol_528.setType(symbol_11);  // Boolean
			
			symbol_528.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation");
			symbol_528.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_528);
		}
		{	// ocl::Collection::oclType()
			Operation symbol_529 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!oclType()
			symbol_529.setName("oclType");
			symbol_529.setType(symbol_209);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_529.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_529.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_529);
		}
		{	// ocl::Collection::one()
			Iteration symbol_530 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)
			symbol_530.setName("one");
			symbol_530.setType(symbol_11);  // Boolean
			
			Parameter symbol_531 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)!i
			symbol_531.setName("i");
			symbol_531.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_530.getOwnedIterators().add(symbol_531);
			Parameter symbol_532 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)!body
			symbol_532.setName("body");
			symbol_532.setType(symbol_158);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_530.getOwnedParameters().add(symbol_532);
			symbol_530.setImplementationClass("org.eclipse.ocl.examples.library.iterator.OneIteration");
			symbol_530.setImplementation(org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_530);
		}
		{	// ocl::Collection::product()
			Operation symbol_533 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_66.setName("T2");
			symbol_65.setOwnedParameteredElement(symbol_66);
			symbol_64.getOwnedParameters().add(symbol_65);
			
			symbol_533.setOwnedTemplateSignature(symbol_64);
			symbol_533.setName("product");
			symbol_533.setType(symbol_311);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
			
			Parameter symbol_534 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_534.setName("c2");
			symbol_534.setType(symbol_221);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			symbol_533.getOwnedParameters().add(symbol_534);
			symbol_533.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionProductOperation");
			symbol_533.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_533);
		}
		{	// ocl::Collection::reject()
			Iteration symbol_535 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)
			symbol_535.setName("reject");
			symbol_535.setType(symbol_42);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_536 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)!i
			symbol_536.setName("i");
			symbol_536.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_535.getOwnedIterators().add(symbol_536);
			Parameter symbol_537 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)!body
			symbol_537.setName("body");
			symbol_537.setType(symbol_160);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_535.getOwnedParameters().add(symbol_537);
			symbol_535.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_535.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_535);
		}
		{	// ocl::Collection::select()
			Iteration symbol_538 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)
			symbol_538.setName("select");
			symbol_538.setType(symbol_42);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_539 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)!i
			symbol_539.setName("i");
			symbol_539.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_538.getOwnedIterators().add(symbol_539);
			Parameter symbol_540 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)!body
			symbol_540.setName("body");
			symbol_540.setType(symbol_157);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_538.getOwnedParameters().add(symbol_540);
			symbol_538.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_538.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_538);
		}
		{	// ocl::Collection::size()
			Operation symbol_541 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!size()
			symbol_541.setName("size");
			symbol_541.setType(symbol_12);  // Integer
			
			symbol_541.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionSizeOperation");
			symbol_541.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_541);
		}
		{	// ocl::Collection::sortedBy()
			Iteration symbol_542 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_542.setName("sortedBy");
			symbol_542.setType(symbol_289);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			Parameter symbol_543 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_543.setName("i");
			symbol_543.setType(symbol_45); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_542.getOwnedIterators().add(symbol_543);
			Parameter symbol_544 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_544.setName("body");
			symbol_544.setType(symbol_164);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_542.getOwnedParameters().add(symbol_544);
			symbol_542.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_542.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_542);
		}
		{	// ocl::Collection::sum()
			Operation symbol_545 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sum()
			symbol_545.setName("sum");
			symbol_545.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_545.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionSumOperation");
			symbol_545.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_545);
		}
		symbol_0.getOwnedTypes().add(symbol_42); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
		//
		// ocl::Enumeration http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration
		//
		symbol_67.setName("Enumeration");
		symbol_67.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Enumeration::allInstances()
			Operation symbol_546 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration!allInstances()
			symbol_546.setName("allInstances");
			symbol_546.setType(symbol_316);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_546.setIsStatic(true);
			symbol_546.setImplementationClass("org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation");
			symbol_546.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_546);
		}
		{	// ocl::Enumeration::oclType()
			Operation symbol_547 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration!oclType()
			symbol_547.setName("oclType");
			symbol_547.setType(symbol_243);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_547.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_547.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_547);
		}
		symbol_0.getOwnedTypes().add(symbol_67); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration
		//
		// ocl::EnumerationClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}
		//
		symbol_68.setName("EnumerationClassifier");
		symbol_68.setInstanceType(symbol_71);
		symbol_71.setName("T");
		symbol_70.setOwnedParameteredElement(symbol_71);
		symbol_69.getOwnedParameters().add(symbol_70);
		
		symbol_68.setOwnedTemplateSignature(symbol_69);
		symbol_68.getSuperClasses().add(symbol_194); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		{ // ocl::EnumerationClassifier::ownedLiteral
			symbol_72.setName("ownedLiteral");
			symbol_72.setType(symbol_301);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
			
			symbol_72.setIsResolveProxies(true);
			symbol_72.setImplementationClass("org.eclipse.ocl.examples.library.enumeration.EnumerationClassifierOwnedLiteralProperty");
			symbol_72.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationClassifierOwnedLiteralProperty.INSTANCE);
			symbol_68.getOwnedAttributes().add(symbol_72);
		}
		symbol_0.getOwnedTypes().add(symbol_68); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}
		//
		// ocl::EnumerationLiteral http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		//
		symbol_73.setName("EnumerationLiteral");
		symbol_73.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_0.getOwnedTypes().add(symbol_73); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		//
		// ocl::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}
		//
		symbol_74.setName("NonOrderedCollection");
		symbol_74.setElementType(symbol_77);
		symbol_77.setName("T");
		symbol_76.setOwnedParameteredElement(symbol_77);
		symbol_75.getOwnedParameters().add(symbol_76);
		
		symbol_74.setOwnedTemplateSignature(symbol_75);
		symbol_74.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		{	// ocl::NonOrderedCollection::closure()
			Iteration symbol_548 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_548.setName("closure");
			symbol_548.setType(symbol_314);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			Parameter symbol_549 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!i
			symbol_549.setName("i");
			symbol_549.setType(symbol_77); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T
			symbol_548.getOwnedIterators().add(symbol_549);
			Parameter symbol_550 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!body
			symbol_550.setName("body");
			symbol_550.setType(symbol_167);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
			
			symbol_548.getOwnedParameters().add(symbol_550);
			symbol_548.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ClosureIteration");
			symbol_548.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_74.getOwnedOperations().add(symbol_548);
		}
		{	// ocl::NonOrderedCollection::collect()
			Iteration symbol_551 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)
			symbol_80.setName("V");
			symbol_79.setOwnedParameteredElement(symbol_80);
			symbol_78.getOwnedParameters().add(symbol_79);
			
			symbol_551.setOwnedTemplateSignature(symbol_78);
			symbol_551.setName("collect");
			symbol_551.setType(symbol_206);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_552 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)!i
			symbol_552.setName("i");
			symbol_552.setType(symbol_77); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T
			symbol_551.getOwnedIterators().add(symbol_552);
			Parameter symbol_553 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)!body
			symbol_553.setName("body");
			symbol_553.setType(symbol_166);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
			
			symbol_551.getOwnedParameters().add(symbol_553);
			symbol_551.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_551.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_74.getOwnedOperations().add(symbol_551);
		}
		{	// ocl::NonOrderedCollection::collectNested()
			Iteration symbol_554 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)
			symbol_83.setName("V");
			symbol_82.setOwnedParameteredElement(symbol_83);
			symbol_81.getOwnedParameters().add(symbol_82);
			
			symbol_554.setOwnedTemplateSignature(symbol_81);
			symbol_554.setName("collectNested");
			symbol_554.setType(symbol_207);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			Parameter symbol_555 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_555.setName("i");
			symbol_555.setType(symbol_77); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T
			symbol_554.getOwnedIterators().add(symbol_555);
			Parameter symbol_556 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_556.setName("body");
			symbol_556.setType(symbol_165);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
			
			symbol_554.getOwnedParameters().add(symbol_556);
			symbol_554.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_554.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_74.getOwnedOperations().add(symbol_554);
		}
		{	// ocl::NonOrderedCollection::intersection()
			Operation symbol_557 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[T])
			symbol_557.setName("intersection");
			symbol_557.setType(symbol_207);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			Parameter symbol_558 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[T])!bag
			symbol_558.setName("bag");
			symbol_558.setType(symbol_207);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			symbol_557.getOwnedParameters().add(symbol_558);
			symbol_557.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_557.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_74.getOwnedOperations().add(symbol_557);
		}
		{	// ocl::NonOrderedCollection::intersection()
			Operation symbol_559 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_559.setName("intersection");
			symbol_559.setType(symbol_314);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			Parameter symbol_560 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!s
			symbol_560.setName("s");
			symbol_560.setType(symbol_314);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			symbol_559.getOwnedParameters().add(symbol_560);
			symbol_559.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_559.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_74.getOwnedOperations().add(symbol_559);
		}
		{	// ocl::NonOrderedCollection::union()
			Operation symbol_561 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[T])
			symbol_561.setName("union");
			symbol_561.setType(symbol_207);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			Parameter symbol_562 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[T])!bag
			symbol_562.setName("bag");
			symbol_562.setType(symbol_207);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			symbol_561.getOwnedParameters().add(symbol_562);
			symbol_561.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_561.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_74.getOwnedOperations().add(symbol_561);
		}
		{	// ocl::NonOrderedCollection::union()
			Operation symbol_563 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_563.setName("union");
			symbol_563.setType(symbol_314);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			Parameter symbol_564 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!s
			symbol_564.setName("s");
			symbol_564.setType(symbol_314);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			symbol_563.getOwnedParameters().add(symbol_564);
			symbol_563.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_563.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_74.getOwnedOperations().add(symbol_563);
		}
		symbol_0.getOwnedTypes().add(symbol_74); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}
		//
		// ocl::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}
		//
		symbol_84.setName("NonUniqueCollection");
		symbol_84.setElementType(symbol_87);
		symbol_87.setName("T");
		symbol_86.setOwnedParameteredElement(symbol_87);
		symbol_85.getOwnedParameters().add(symbol_86);
		
		symbol_84.setOwnedTemplateSignature(symbol_85);
		symbol_84.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		{	// ocl::NonUniqueCollection::sortedBy()
			Iteration symbol_565 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_565.setName("sortedBy");
			symbol_565.setType(symbol_307);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
			
			Parameter symbol_566 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_566.setName("i");
			symbol_566.setType(symbol_87); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T
			symbol_565.getOwnedIterators().add(symbol_566);
			Parameter symbol_567 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_567.setName("body");
			symbol_567.setType(symbol_168);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_565.getOwnedParameters().add(symbol_567);
			symbol_565.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_565.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_84.getOwnedOperations().add(symbol_565);
		}
		symbol_0.getOwnedTypes().add(symbol_84); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}
		//
		// ocl::OclAny http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_88.setName("OclAny");
		{	// ocl::OclAny::<>()
			Operation symbol_568 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_568.setName("<>");
			symbol_568.setType(symbol_11);  // Boolean
			
			Parameter symbol_569 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_569.setName("object2");
			symbol_569.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_568.getOwnedParameters().add(symbol_569);
			symbol_568.setPrecedence(symbol_6);
			symbol_568.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_568.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_88.getOwnedOperations().add(symbol_568);
		}
		{	// ocl::OclAny::=()
			Operation symbol_570 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_570.setName("=");
			symbol_570.setType(symbol_11);  // Boolean
			
			Parameter symbol_571 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_571.setName("object2");
			symbol_571.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_570.getOwnedParameters().add(symbol_571);
			symbol_570.setPrecedence(symbol_6);
			symbol_570.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_570.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_88.getOwnedOperations().add(symbol_570);
		}
		{	// ocl::OclAny::oclAsSet()
			Operation symbol_572 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsSet()
			symbol_572.setName("oclAsSet");
			symbol_572.setType(symbol_316);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_572.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation");
			symbol_572.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
			symbol_88.getOwnedOperations().add(symbol_572);
		}
		{	// ocl::OclAny::oclAsType()
			Operation symbol_573 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])
			symbol_91.setName("TT");
			symbol_90.setOwnedParameteredElement(symbol_91);
			symbol_89.getOwnedParameters().add(symbol_90);
			
			symbol_573.setOwnedTemplateSignature(symbol_89);
			symbol_573.setName("oclAsType");
			symbol_573.setType(symbol_91);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT
			
			Parameter symbol_574 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])!type
			symbol_574.setName("type");
			symbol_574.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
			
			symbol_573.getOwnedParameters().add(symbol_574);
			symbol_573.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation");
			symbol_573.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE);
			symbol_88.getOwnedOperations().add(symbol_573);
		}
		{	// ocl::OclAny::oclIsInState()
			Operation symbol_575 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInState(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState)
			symbol_575.setName("oclIsInState");
			symbol_575.setType(symbol_11);  // Boolean
			
			Parameter symbol_576 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInState(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState)!statespec
			symbol_576.setName("statespec");
			symbol_576.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
			
			symbol_575.getOwnedParameters().add(symbol_576);
			symbol_575.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation");
			symbol_575.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE);
			symbol_88.getOwnedOperations().add(symbol_575);
		}
		{	// ocl::OclAny::oclIsInvalid()
			Operation symbol_577 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInvalid()
			symbol_577.setName("oclIsInvalid");
			symbol_577.setType(symbol_11);  // Boolean
			
			symbol_577.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation");
			symbol_577.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
			symbol_88.getOwnedOperations().add(symbol_577);
		}
		{	// ocl::OclAny::oclIsKindOf()
			Operation symbol_578 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])
			symbol_94.setName("T");
			symbol_93.setOwnedParameteredElement(symbol_94);
			symbol_92.getOwnedParameters().add(symbol_93);
			
			symbol_578.setOwnedTemplateSignature(symbol_92);
			symbol_578.setName("oclIsKindOf");
			symbol_578.setType(symbol_11);  // Boolean
			
			Parameter symbol_579 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])!type
			symbol_579.setName("type");
			symbol_579.setType(symbol_196);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
			
			symbol_578.getOwnedParameters().add(symbol_579);
			symbol_578.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation");
			symbol_578.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
			symbol_88.getOwnedOperations().add(symbol_578);
		}
		{	// ocl::OclAny::oclIsNew()
			Operation symbol_580 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsNew()
			symbol_580.setName("oclIsNew");
			symbol_580.setType(symbol_11);  // Boolean
			
			symbol_580.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_580.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_88.getOwnedOperations().add(symbol_580);
		}
		{	// ocl::OclAny::oclIsTypeOf()
			Operation symbol_581 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])
			symbol_97.setName("T");
			symbol_96.setOwnedParameteredElement(symbol_97);
			symbol_95.getOwnedParameters().add(symbol_96);
			
			symbol_581.setOwnedTemplateSignature(symbol_95);
			symbol_581.setName("oclIsTypeOf");
			symbol_581.setType(symbol_11);  // Boolean
			
			Parameter symbol_582 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])!type
			symbol_582.setName("type");
			symbol_582.setType(symbol_197);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
			
			symbol_581.getOwnedParameters().add(symbol_582);
			symbol_581.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation");
			symbol_581.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
			symbol_88.getOwnedOperations().add(symbol_581);
		}
		{	// ocl::OclAny::oclIsUndefined()
			Operation symbol_583 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsUndefined()
			symbol_583.setName("oclIsUndefined");
			symbol_583.setType(symbol_11);  // Boolean
			
			symbol_583.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation");
			symbol_583.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
			symbol_88.getOwnedOperations().add(symbol_583);
		}
		{	// ocl::OclAny::oclType()
			Operation symbol_584 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclType()
			symbol_584.setName("oclType");
			symbol_584.setType(symbol_203);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_584.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_584.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_88.getOwnedOperations().add(symbol_584);
		}
		symbol_0.getOwnedTypes().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::OclComparable http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		//
		symbol_98.setName("OclComparable");
		symbol_98.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclComparable::compareTo()
			Operation symbol_585 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_585.setName("compareTo");
			symbol_585.setType(symbol_12);  // Integer
			
			Parameter symbol_586 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable!compareTo(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_586.setName("that");
			symbol_586.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_585.getOwnedParameters().add(symbol_586);
			symbol_98.getOwnedOperations().add(symbol_585);
		}
		symbol_0.getOwnedTypes().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclComparable
		//
		// ocl::OclElement http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		//
		symbol_99.setName("OclElement");
		symbol_99.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclElement::allInstances()
			Operation symbol_587 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!allInstances()
			symbol_587.setName("allInstances");
			symbol_587.setType(symbol_316);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_587.setIsStatic(true);
			symbol_587.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation");
			symbol_587.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_587);
		}
		{	// ocl::OclElement::oclContainer()
			Operation symbol_588 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()
			symbol_102.setName("U");
			symbol_101.setOwnedParameteredElement(symbol_102);
			symbol_100.getOwnedParameters().add(symbol_101);
			
			symbol_588.setOwnedTemplateSignature(symbol_100);
			symbol_588.setName("oclContainer");
			symbol_588.setType(symbol_198);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()?U]
			
			symbol_588.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation");
			symbol_588.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_588);
		}
		{	// ocl::OclElement::oclContents()
			Operation symbol_589 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()
			symbol_105.setName("U");
			symbol_104.setOwnedParameteredElement(symbol_105);
			symbol_103.getOwnedParameters().add(symbol_104);
			
			symbol_589.setOwnedTemplateSignature(symbol_103);
			symbol_589.setName("oclContents");
			symbol_589.setType(symbol_312);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
			
			symbol_589.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation");
			symbol_589.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_589);
		}
		symbol_0.getOwnedTypes().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		//
		// ocl::OclInvalid http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
		//
		symbol_106.setName("OclInvalid");
		symbol_106.getSuperClasses().add(symbol_114); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		{ // ocl::OclInvalid::oclBadProperty
			symbol_107.setName("oclBadProperty");
			symbol_107.setType(symbol_106);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
			
			symbol_107.setIsResolveProxies(true);
			symbol_106.getOwnedAttributes().add(symbol_107);
		}
		{	// ocl::OclInvalid::<>()
			Operation symbol_590 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_590.setName("<>");
			symbol_590.setType(symbol_11);  // Boolean
			
			Parameter symbol_591 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_591.setName("object2");
			symbol_591.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_590.getOwnedParameters().add(symbol_591);
			symbol_590.setPrecedence(symbol_6);
			symbol_590.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_590.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_106.getOwnedOperations().add(symbol_590);
		}
		{	// ocl::OclInvalid::=()
			Operation symbol_592 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_592.setName("=");
			symbol_592.setType(symbol_11);  // Boolean
			
			Parameter symbol_593 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_593.setName("object2");
			symbol_593.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_592.getOwnedParameters().add(symbol_593);
			symbol_592.setPrecedence(symbol_6);
			symbol_592.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_592.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_106.getOwnedOperations().add(symbol_592);
		}
		{	// ocl::OclInvalid::allInstances()
			Operation symbol_594 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!allInstances()
			symbol_594.setName("allInstances");
			symbol_594.setType(symbol_316);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_594.setIsStatic(true);
			symbol_594.setImplementationClass("org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation");
			symbol_594.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
			symbol_106.getOwnedOperations().add(symbol_594);
		}
		{	// ocl::OclInvalid::oclBadOperation()
			Operation symbol_595 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!oclBadOperation()
			symbol_595.setName("oclBadOperation");
			symbol_595.setType(symbol_106);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
			
			symbol_106.getOwnedOperations().add(symbol_595);
		}
		{	// ocl::OclInvalid::toString()
			Operation symbol_596 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!toString()
			symbol_596.setName("toString");
			symbol_596.setType(symbol_14);  // String
			
			symbol_596.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_596.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_106.getOwnedOperations().add(symbol_596);
		}
		symbol_0.getOwnedTypes().add(symbol_106); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
		//
		// ocl::OclLambda http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		//
		symbol_108.setName("OclLambda");
		symbol_108.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_0.getOwnedTypes().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		//
		// ocl::OclMessage http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		//
		symbol_109.setName("OclMessage");
		symbol_109.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclMessage::hasReturned()
			Operation symbol_597 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!hasReturned()
			symbol_597.setName("hasReturned");
			symbol_597.setType(symbol_11);  // Boolean
			
			symbol_597.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_597.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_597);
		}
		{	// ocl::OclMessage::isOperationCall()
			Operation symbol_598 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!isOperationCall()
			symbol_598.setName("isOperationCall");
			symbol_598.setType(symbol_11);  // Boolean
			
			symbol_598.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_598.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_598);
		}
		{	// ocl::OclMessage::isSignalSent()
			Operation symbol_599 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!isSignalSent()
			symbol_599.setName("isSignalSent");
			symbol_599.setType(symbol_11);  // Boolean
			
			symbol_599.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_599.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_599);
		}
		{	// ocl::OclMessage::result()
			Operation symbol_600 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!result()
			symbol_600.setName("result");
			symbol_600.setType(symbol_88);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_600.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_600.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_600);
		}
		symbol_0.getOwnedTypes().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		//
		// ocl::OclSelf http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
		//
		symbol_110.setName("OclSelf");
		symbol_110.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_0.getOwnedTypes().add(symbol_110); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
		//
		// ocl::OclState http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
		//
		symbol_111.setName("OclState");
		symbol_111.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_0.getOwnedTypes().add(symbol_111); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
		//
		// ocl::OclSummable http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		//
		symbol_112.setName("OclSummable");
		symbol_112.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclSummable::sum()
			Operation symbol_601 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable!sum(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_601.setName("sum");
			symbol_601.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			Parameter symbol_602 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable!sum(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!that
			symbol_602.setName("that");
			symbol_602.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_601.getOwnedParameters().add(symbol_602);
			symbol_112.getOwnedOperations().add(symbol_601);
		}
		{	// ocl::OclSummable::zero()
			Operation symbol_603 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable!zero()
			symbol_603.setName("zero");
			symbol_603.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_112.getOwnedOperations().add(symbol_603);
		}
		symbol_0.getOwnedTypes().add(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSummable
		//
		// ocl::OclTuple http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		//
		symbol_113.setName("OclTuple");
		symbol_113.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclTuple::<>()
			Operation symbol_604 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_604.setName("<>");
			symbol_604.setType(symbol_11);  // Boolean
			
			Parameter symbol_605 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_605.setName("object2");
			symbol_605.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_604.getOwnedParameters().add(symbol_605);
			symbol_604.setPrecedence(symbol_6);
			symbol_604.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_604.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_113.getOwnedOperations().add(symbol_604);
		}
		{	// ocl::OclTuple::=()
			Operation symbol_606 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_606.setName("=");
			symbol_606.setType(symbol_11);  // Boolean
			
			Parameter symbol_607 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_607.setName("object2");
			symbol_607.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_606.getOwnedParameters().add(symbol_607);
			symbol_606.setPrecedence(symbol_6);
			symbol_606.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_606.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_113.getOwnedOperations().add(symbol_606);
		}
		symbol_0.getOwnedTypes().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		//
		// ocl::OclVoid http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		//
		symbol_114.setName("OclVoid");
		symbol_114.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclVoid::<>()
			Operation symbol_608 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_608.setName("<>");
			symbol_608.setType(symbol_11);  // Boolean
			
			Parameter symbol_609 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_609.setName("object2");
			symbol_609.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_608.getOwnedParameters().add(symbol_609);
			symbol_608.setPrecedence(symbol_6);
			symbol_608.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_608.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_608);
		}
		{	// ocl::OclVoid::=()
			Operation symbol_610 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_610.setName("=");
			symbol_610.setType(symbol_11);  // Boolean
			
			Parameter symbol_611 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_611.setName("object2");
			symbol_611.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_610.getOwnedParameters().add(symbol_611);
			symbol_610.setPrecedence(symbol_6);
			symbol_610.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_610.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_610);
		}
		{	// ocl::OclVoid::allInstances()
			Operation symbol_612 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!allInstances()
			symbol_612.setName("allInstances");
			symbol_612.setType(symbol_316);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_612.setIsStatic(true);
			symbol_612.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation");
			symbol_612.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_612);
		}
		{	// ocl::OclVoid::and()
			Operation symbol_613 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!and(Boolean)
			symbol_613.setName("and");
			symbol_613.setType(symbol_11);  // Boolean
			
			Parameter symbol_614 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!and(Boolean)!b
			symbol_614.setName("b");
			symbol_614.setType(symbol_11);  // Boolean
			
			symbol_613.getOwnedParameters().add(symbol_614);
			symbol_613.setPrecedence(symbol_7);
			symbol_613.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation");
			symbol_613.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_613);
		}
		{	// ocl::OclVoid::implies()
			Operation symbol_615 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!implies(Boolean)
			symbol_615.setName("implies");
			symbol_615.setType(symbol_11);  // Boolean
			
			Parameter symbol_616 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!implies(Boolean)!b
			symbol_616.setName("b");
			symbol_616.setType(symbol_11);  // Boolean
			
			symbol_615.getOwnedParameters().add(symbol_616);
			symbol_615.setPrecedence(symbol_10);
			symbol_615.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation");
			symbol_615.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_615);
		}
		{	// ocl::OclVoid::or()
			Operation symbol_617 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!or(Boolean)
			symbol_617.setName("or");
			symbol_617.setType(symbol_11);  // Boolean
			
			Parameter symbol_618 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!or(Boolean)!b
			symbol_618.setName("b");
			symbol_618.setType(symbol_11);  // Boolean
			
			symbol_617.getOwnedParameters().add(symbol_618);
			symbol_617.setPrecedence(symbol_8);
			symbol_617.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation");
			symbol_617.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_617);
		}
		{	// ocl::OclVoid::toString()
			Operation symbol_619 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!toString()
			symbol_619.setName("toString");
			symbol_619.setType(symbol_14);  // String
			
			symbol_619.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_619.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_619);
		}
		symbol_0.getOwnedTypes().add(symbol_114); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		//
		// ocl::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}
		//
		symbol_115.setName("OrderedCollection");
		symbol_115.setElementType(symbol_118);
		symbol_118.setName("T");
		symbol_117.setOwnedParameteredElement(symbol_118);
		symbol_116.getOwnedParameters().add(symbol_117);
		
		symbol_115.setOwnedTemplateSignature(symbol_116);
		symbol_115.getSuperClasses().add(symbol_233); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		{	// ocl::OrderedCollection::at()
			Operation symbol_620 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!at(Integer)
			symbol_620.setName("at");
			symbol_620.setType(symbol_118);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
			
			Parameter symbol_621 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!at(Integer)!index
			symbol_621.setName("index");
			symbol_621.setType(symbol_12);  // Integer
			
			symbol_620.getOwnedParameters().add(symbol_621);
			symbol_620.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation");
			symbol_620.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_620);
		}
		{	// ocl::OrderedCollection::closure()
			Iteration symbol_622 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])
			symbol_622.setName("closure");
			symbol_622.setType(symbol_302);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
			
			Parameter symbol_623 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])!i
			symbol_623.setName("i");
			symbol_623.setType(symbol_118); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
			symbol_622.getOwnedIterators().add(symbol_623);
			Parameter symbol_624 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])!body
			symbol_624.setName("body");
			symbol_624.setType(symbol_171);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
			
			symbol_622.getOwnedParameters().add(symbol_624);
			symbol_622.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ClosureIteration");
			symbol_622.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_622);
		}
		{	// ocl::OrderedCollection::collect()
			Iteration symbol_625 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)
			symbol_121.setName("V");
			symbol_120.setOwnedParameteredElement(symbol_121);
			symbol_119.getOwnedParameters().add(symbol_120);
			
			symbol_625.setOwnedTemplateSignature(symbol_119);
			symbol_625.setName("collect");
			symbol_625.setType(symbol_308);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_626 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)!i
			symbol_626.setName("i");
			symbol_626.setType(symbol_118); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
			symbol_625.getOwnedIterators().add(symbol_626);
			Parameter symbol_627 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)!body
			symbol_627.setName("body");
			symbol_627.setType(symbol_170);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
			
			symbol_625.getOwnedParameters().add(symbol_627);
			symbol_625.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_625.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_625);
		}
		{	// ocl::OrderedCollection::collectNested()
			Iteration symbol_628 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)
			symbol_124.setName("V");
			symbol_123.setOwnedParameteredElement(symbol_124);
			symbol_122.getOwnedParameters().add(symbol_123);
			
			symbol_628.setOwnedTemplateSignature(symbol_122);
			symbol_628.setName("collectNested");
			symbol_628.setType(symbol_309);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
			
			Parameter symbol_629 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_629.setName("i");
			symbol_629.setType(symbol_118); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
			symbol_628.getOwnedIterators().add(symbol_629);
			Parameter symbol_630 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_630.setName("body");
			symbol_630.setType(symbol_169);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
			
			symbol_628.getOwnedParameters().add(symbol_630);
			symbol_628.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_628.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_628);
		}
		{	// ocl::OrderedCollection::first()
			Operation symbol_631 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!first()
			symbol_631.setName("first");
			symbol_631.setType(symbol_118);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
			
			symbol_631.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation");
			symbol_631.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_631);
		}
		{	// ocl::OrderedCollection::indexOf()
			Operation symbol_632 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!indexOf(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_632.setName("indexOf");
			symbol_632.setType(symbol_12);  // Integer
			
			Parameter symbol_633 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!indexOf(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!obj
			symbol_633.setName("obj");
			symbol_633.setType(symbol_88);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_632.getOwnedParameters().add(symbol_633);
			symbol_632.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation");
			symbol_632.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_632);
		}
		{	// ocl::OrderedCollection::last()
			Operation symbol_634 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!last()
			symbol_634.setName("last");
			symbol_634.setType(symbol_118);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
			
			symbol_634.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation");
			symbol_634.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_634);
		}
		{	// ocl::OrderedCollection::reverse()
			Operation symbol_635 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!reverse()
			symbol_635.setName("reverse");
			symbol_635.setType(symbol_115);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}
			
			symbol_635.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_635.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_635);
		}
		symbol_0.getOwnedTypes().add(symbol_115); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}
		//
		// ocl::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
		//
		symbol_125.setName("OrderedSet");
		symbol_125.setElementType(symbol_128);
		symbol_128.setName("T");
		symbol_127.setOwnedParameteredElement(symbol_128);
		symbol_126.getOwnedParameters().add(symbol_127);
		
		symbol_125.setOwnedTemplateSignature(symbol_126);
		symbol_125.getSuperClasses().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_125.getSuperClasses().add(symbol_345); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		{	// ocl::OrderedSet::-()
			Operation symbol_636 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_636.setName("-");
			symbol_636.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_637 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_637.setName("s");
			symbol_637.setType(symbol_315);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			symbol_636.getOwnedParameters().add(symbol_637);
			symbol_636.setPrecedence(symbol_4);
			symbol_636.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_636.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_636);
		}
		{	// ocl::OrderedSet::<>()
			Operation symbol_638 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_638.setName("<>");
			symbol_638.setType(symbol_11);  // Boolean
			
			Parameter symbol_639 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_639.setName("object2");
			symbol_639.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_638.getOwnedParameters().add(symbol_639);
			symbol_638.setPrecedence(symbol_6);
			symbol_638.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_638.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_638);
		}
		{	// ocl::OrderedSet::=()
			Operation symbol_640 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_640.setName("=");
			symbol_640.setType(symbol_11);  // Boolean
			
			Parameter symbol_641 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_641.setName("object2");
			symbol_641.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_640.getOwnedParameters().add(symbol_641);
			symbol_640.setPrecedence(symbol_6);
			symbol_640.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_640.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_640);
		}
		{	// ocl::OrderedSet::append()
			Operation symbol_642 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!append(T)
			symbol_642.setName("append");
			symbol_642.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_643 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!append(T)!object
			symbol_643.setName("object");
			symbol_643.setType(symbol_128);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_642.getOwnedParameters().add(symbol_643);
			symbol_642.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation");
			symbol_642.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_642);
		}
		{	// ocl::OrderedSet::excluding()
			Operation symbol_644 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_644.setName("excluding");
			symbol_644.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_645 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_645.setName("object");
			symbol_645.setType(symbol_88);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_644.getOwnedParameters().add(symbol_645);
			symbol_644.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_644.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_644);
		}
		{	// ocl::OrderedSet::flatten()
			Operation symbol_646 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()
			symbol_131.setName("T2");
			symbol_130.setOwnedParameteredElement(symbol_131);
			symbol_129.getOwnedParameters().add(symbol_130);
			
			symbol_646.setOwnedTemplateSignature(symbol_129);
			symbol_646.setName("flatten");
			symbol_646.setType(symbol_303);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
			
			symbol_646.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_646.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_646);
		}
		{	// ocl::OrderedSet::including()
			Operation symbol_647 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!including(T)
			symbol_647.setName("including");
			symbol_647.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_648 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!including(T)!object
			symbol_648.setName("object");
			symbol_648.setType(symbol_128);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_647.getOwnedParameters().add(symbol_648);
			symbol_647.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_647.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_647);
		}
		{	// ocl::OrderedSet::insertAt()
			Operation symbol_649 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)
			symbol_649.setName("insertAt");
			symbol_649.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_650 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)!index
			symbol_650.setName("index");
			symbol_650.setType(symbol_12);  // Integer
			
			symbol_649.getOwnedParameters().add(symbol_650);
			Parameter symbol_651 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)!object
			symbol_651.setName("object");
			symbol_651.setType(symbol_128);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_649.getOwnedParameters().add(symbol_651);
			symbol_649.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation");
			symbol_649.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_649);
		}
		{	// ocl::OrderedSet::intersection()
			Operation symbol_652 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_652.setName("intersection");
			symbol_652.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_653 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!o
			symbol_653.setName("o");
			symbol_653.setType(symbol_317);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
			
			symbol_652.getOwnedParameters().add(symbol_653);
			symbol_652.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_652.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_652);
		}
		{	// ocl::OrderedSet::prepend()
			Operation symbol_654 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!prepend(T)
			symbol_654.setName("prepend");
			symbol_654.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_655 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!prepend(T)!object
			symbol_655.setName("object");
			symbol_655.setType(symbol_128);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_654.getOwnedParameters().add(symbol_655);
			symbol_654.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation");
			symbol_654.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_654);
		}
		{	// ocl::OrderedSet::reject()
			Iteration symbol_656 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)
			symbol_656.setName("reject");
			symbol_656.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_657 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)!i
			symbol_657.setName("i");
			symbol_657.setType(symbol_128); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			symbol_656.getOwnedIterators().add(symbol_657);
			Parameter symbol_658 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)!body
			symbol_658.setName("body");
			symbol_658.setType(symbol_172);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
			
			symbol_656.getOwnedParameters().add(symbol_658);
			symbol_656.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_656.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_656);
		}
		{	// ocl::OrderedSet::reverse()
			Operation symbol_659 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reverse()
			symbol_659.setName("reverse");
			symbol_659.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			symbol_659.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_659.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_659);
		}
		{	// ocl::OrderedSet::select()
			Iteration symbol_660 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)
			symbol_660.setName("select");
			symbol_660.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_661 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)!i
			symbol_661.setName("i");
			symbol_661.setType(symbol_128); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			symbol_660.getOwnedIterators().add(symbol_661);
			Parameter symbol_662 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)!body
			symbol_662.setName("body");
			symbol_662.setType(symbol_173);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
			
			symbol_660.getOwnedParameters().add(symbol_662);
			symbol_660.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_660.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_660);
		}
		{	// ocl::OrderedSet::subOrderedSet()
			Operation symbol_663 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)
			symbol_663.setName("subOrderedSet");
			symbol_663.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_664 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)!lower
			symbol_664.setName("lower");
			symbol_664.setType(symbol_12);  // Integer
			
			symbol_663.getOwnedParameters().add(symbol_664);
			Parameter symbol_665 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)!upper
			symbol_665.setName("upper");
			symbol_665.setType(symbol_12);  // Integer
			
			symbol_663.getOwnedParameters().add(symbol_665);
			symbol_663.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation");
			symbol_663.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_663);
		}
		{	// ocl::OrderedSet::symmetricDifference()
			Operation symbol_666 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_666.setName("symmetricDifference");
			symbol_666.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_667 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_667.setName("s");
			symbol_667.setType(symbol_315);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			symbol_666.getOwnedParameters().add(symbol_667);
			symbol_666.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation");
			symbol_666.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_666);
		}
		{	// ocl::OrderedSet::union()
			Operation symbol_668 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T})
			symbol_668.setName("union");
			symbol_668.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_669 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T})!o
			symbol_669.setName("o");
			symbol_669.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			symbol_668.getOwnedParameters().add(symbol_669);
			symbol_668.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_668.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_668);
		}
		{	// ocl::OrderedSet::union()
			Operation symbol_670 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_670.setName("union");
			symbol_670.setType(symbol_317);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
			
			Parameter symbol_671 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!s
			symbol_671.setName("s");
			symbol_671.setType(symbol_317);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
			
			symbol_670.getOwnedParameters().add(symbol_671);
			symbol_670.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_670.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_670);
		}
		symbol_0.getOwnedTypes().add(symbol_125); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
		//
		// ocl::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
		//
		symbol_132.setName("Sequence");
		symbol_132.setElementType(symbol_135);
		symbol_135.setName("T");
		symbol_134.setOwnedParameteredElement(symbol_135);
		symbol_133.getOwnedParameters().add(symbol_134);
		
		symbol_132.setOwnedTemplateSignature(symbol_133);
		symbol_132.getSuperClasses().add(symbol_298); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		symbol_132.getSuperClasses().add(symbol_287); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		{	// ocl::Sequence::<>()
			Operation symbol_672 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_672.setName("<>");
			symbol_672.setType(symbol_11);  // Boolean
			
			Parameter symbol_673 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_673.setName("object2");
			symbol_673.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_672.getOwnedParameters().add(symbol_673);
			symbol_672.setPrecedence(symbol_6);
			symbol_672.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_672.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_672);
		}
		{	// ocl::Sequence::=()
			Operation symbol_674 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_674.setName("=");
			symbol_674.setType(symbol_11);  // Boolean
			
			Parameter symbol_675 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_675.setName("object2");
			symbol_675.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_674.getOwnedParameters().add(symbol_675);
			symbol_674.setPrecedence(symbol_6);
			symbol_674.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_674.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_674);
		}
		{	// ocl::Sequence::append()
			Operation symbol_676 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!append(T)
			symbol_676.setName("append");
			symbol_676.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_677 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!append(T)!object
			symbol_677.setName("object");
			symbol_677.setType(symbol_135);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_676.getOwnedParameters().add(symbol_677);
			symbol_676.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation");
			symbol_676.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_676);
		}
		{	// ocl::Sequence::excluding()
			Operation symbol_678 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_678.setName("excluding");
			symbol_678.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_679 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_679.setName("object");
			symbol_679.setType(symbol_88);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_678.getOwnedParameters().add(symbol_679);
			symbol_678.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_678.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_678);
		}
		{	// ocl::Sequence::flatten()
			Operation symbol_680 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()
			symbol_138.setName("T2");
			symbol_137.setOwnedParameteredElement(symbol_138);
			symbol_136.getOwnedParameters().add(symbol_137);
			
			symbol_680.setOwnedTemplateSignature(symbol_136);
			symbol_680.setName("flatten");
			symbol_680.setType(symbol_310);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
			
			symbol_680.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_680.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_680);
		}
		{	// ocl::Sequence::including()
			Operation symbol_681 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!including(T)
			symbol_681.setName("including");
			symbol_681.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_682 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!including(T)!object
			symbol_682.setName("object");
			symbol_682.setType(symbol_135);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_681.getOwnedParameters().add(symbol_682);
			symbol_681.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_681.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_681);
		}
		{	// ocl::Sequence::insertAt()
			Operation symbol_683 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)
			symbol_683.setName("insertAt");
			symbol_683.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_684 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)!index
			symbol_684.setName("index");
			symbol_684.setType(symbol_12);  // Integer
			
			symbol_683.getOwnedParameters().add(symbol_684);
			Parameter symbol_685 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)!object
			symbol_685.setName("object");
			symbol_685.setType(symbol_135);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_683.getOwnedParameters().add(symbol_685);
			symbol_683.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation");
			symbol_683.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_683);
		}
		{	// ocl::Sequence::prepend()
			Operation symbol_686 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!prepend(T)
			symbol_686.setName("prepend");
			symbol_686.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_687 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!prepend(T)!object
			symbol_687.setName("object");
			symbol_687.setType(symbol_135);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_686.getOwnedParameters().add(symbol_687);
			symbol_686.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation");
			symbol_686.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_686);
		}
		{	// ocl::Sequence::reject()
			Iteration symbol_688 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)
			symbol_688.setName("reject");
			symbol_688.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_689 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)!i
			symbol_689.setName("i");
			symbol_689.setType(symbol_135); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			symbol_688.getOwnedIterators().add(symbol_689);
			Parameter symbol_690 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)!body
			symbol_690.setName("body");
			symbol_690.setType(symbol_174);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
			
			symbol_688.getOwnedParameters().add(symbol_690);
			symbol_688.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_688.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_688);
		}
		{	// ocl::Sequence::reverse()
			Operation symbol_691 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reverse()
			symbol_691.setName("reverse");
			symbol_691.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			symbol_691.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_691.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_691);
		}
		{	// ocl::Sequence::select()
			Iteration symbol_692 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)
			symbol_692.setName("select");
			symbol_692.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_693 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)!i
			symbol_693.setName("i");
			symbol_693.setType(symbol_135); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			symbol_692.getOwnedIterators().add(symbol_693);
			Parameter symbol_694 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)!body
			symbol_694.setName("body");
			symbol_694.setType(symbol_175);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
			
			symbol_692.getOwnedParameters().add(symbol_694);
			symbol_692.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_692.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_692);
		}
		{	// ocl::Sequence::subSequence()
			Operation symbol_695 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)
			symbol_695.setName("subSequence");
			symbol_695.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_696 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)!lower
			symbol_696.setName("lower");
			symbol_696.setType(symbol_12);  // Integer
			
			symbol_695.getOwnedParameters().add(symbol_696);
			Parameter symbol_697 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)!upper
			symbol_697.setName("upper");
			symbol_697.setType(symbol_12);  // Integer
			
			symbol_695.getOwnedParameters().add(symbol_697);
			symbol_695.setImplementationClass("org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation");
			symbol_695.setImplementation(org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_695);
		}
		{	// ocl::Sequence::union()
			Operation symbol_698 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T})
			symbol_698.setName("union");
			symbol_698.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_699 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T})!s
			symbol_699.setName("s");
			symbol_699.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			symbol_698.getOwnedParameters().add(symbol_699);
			symbol_698.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_698.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_698);
		}
		symbol_0.getOwnedTypes().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
		//
		// ocl::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
		//
		symbol_139.setName("Set");
		symbol_139.setElementType(symbol_142);
		symbol_142.setName("T");
		symbol_141.setOwnedParameteredElement(symbol_142);
		symbol_140.getOwnedParameters().add(symbol_141);
		
		symbol_139.setOwnedTemplateSignature(symbol_140);
		symbol_139.getSuperClasses().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		symbol_139.getSuperClasses().add(symbol_348); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		{	// ocl::Set::-()
			Operation symbol_700 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_700.setName("-");
			symbol_700.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_701 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_701.setName("s");
			symbol_701.setType(symbol_315);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			symbol_700.getOwnedParameters().add(symbol_701);
			symbol_700.setPrecedence(symbol_4);
			symbol_700.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_700.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_700);
		}
		{	// ocl::Set::<>()
			Operation symbol_702 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_702.setName("<>");
			symbol_702.setType(symbol_11);  // Boolean
			
			Parameter symbol_703 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_703.setName("object2");
			symbol_703.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_702.getOwnedParameters().add(symbol_703);
			symbol_702.setPrecedence(symbol_6);
			symbol_702.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_702.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_702);
		}
		{	// ocl::Set::=()
			Operation symbol_704 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_704.setName("=");
			symbol_704.setType(symbol_11);  // Boolean
			
			Parameter symbol_705 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_705.setName("object2");
			symbol_705.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_704.getOwnedParameters().add(symbol_705);
			symbol_704.setPrecedence(symbol_6);
			symbol_704.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_704.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_704);
		}
		{	// ocl::Set::excluding()
			Operation symbol_706 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_706.setName("excluding");
			symbol_706.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_707 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_707.setName("object");
			symbol_707.setType(symbol_88);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_706.getOwnedParameters().add(symbol_707);
			symbol_706.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_706.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_706);
		}
		{	// ocl::Set::flatten()
			Operation symbol_708 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()
			symbol_145.setName("T2");
			symbol_144.setOwnedParameteredElement(symbol_145);
			symbol_143.getOwnedParameters().add(symbol_144);
			
			symbol_708.setOwnedTemplateSignature(symbol_143);
			symbol_708.setName("flatten");
			symbol_708.setType(symbol_318);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
			
			symbol_708.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_708.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_708);
		}
		{	// ocl::Set::including()
			Operation symbol_709 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!including(T)
			symbol_709.setName("including");
			symbol_709.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_710 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!including(T)!object
			symbol_710.setName("object");
			symbol_710.setType(symbol_142);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			symbol_709.getOwnedParameters().add(symbol_710);
			symbol_709.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_709.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_709);
		}
		{	// ocl::Set::intersection()
			Operation symbol_711 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T})
			symbol_711.setName("intersection");
			symbol_711.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_712 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T})!s
			symbol_712.setName("s");
			symbol_712.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			symbol_711.getOwnedParameters().add(symbol_712);
			symbol_711.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_711.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_711);
		}
		{	// ocl::Set::reject()
			Iteration symbol_713 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)
			symbol_713.setName("reject");
			symbol_713.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_714 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)!i
			symbol_714.setName("i");
			symbol_714.setType(symbol_142); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			symbol_713.getOwnedIterators().add(symbol_714);
			Parameter symbol_715 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)!body
			symbol_715.setName("body");
			symbol_715.setType(symbol_176);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
			
			symbol_713.getOwnedParameters().add(symbol_715);
			symbol_713.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_713.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_713);
		}
		{	// ocl::Set::select()
			Iteration symbol_716 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)
			symbol_716.setName("select");
			symbol_716.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_717 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)!i
			symbol_717.setName("i");
			symbol_717.setType(symbol_142); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			symbol_716.getOwnedIterators().add(symbol_717);
			Parameter symbol_718 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)!body
			symbol_718.setName("body");
			symbol_718.setType(symbol_177);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
			
			symbol_716.getOwnedParameters().add(symbol_718);
			symbol_716.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_716.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_716);
		}
		{	// ocl::Set::symmetricDifference()
			Operation symbol_719 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_719.setName("symmetricDifference");
			symbol_719.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_720 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_720.setName("s");
			symbol_720.setType(symbol_315);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			symbol_719.getOwnedParameters().add(symbol_720);
			symbol_719.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation");
			symbol_719.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_719);
		}
		symbol_0.getOwnedTypes().add(symbol_139); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
		//
		// ocl::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
		//
		symbol_146.setName("UniqueCollection");
		symbol_146.setElementType(symbol_149);
		symbol_149.setName("T");
		symbol_148.setOwnedParameteredElement(symbol_149);
		symbol_147.getOwnedParameters().add(symbol_148);
		
		symbol_146.setOwnedTemplateSignature(symbol_147);
		symbol_146.getSuperClasses().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		{	// ocl::UniqueCollection::sortedBy()
			Iteration symbol_721 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_721.setName("sortedBy");
			symbol_721.setType(symbol_304);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			Parameter symbol_722 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_722.setName("i");
			symbol_722.setType(symbol_149); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T
			symbol_721.getOwnedIterators().add(symbol_722);
			Parameter symbol_723 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_723.setName("body");
			symbol_723.setType(symbol_178);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_721.getOwnedParameters().add(symbol_723);
			symbol_721.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_721.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_146.getOwnedOperations().add(symbol_721);
		}
		symbol_0.getOwnedTypes().add(symbol_146); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
		//
		// ocl::$$ http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0
		//
		symbol_150.setName("$$");
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		symbol_151.setName("Lambda");
		symbol_151.setContextType(symbol_26);
		symbol_151.setResultType(symbol_11);
		symbol_151.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_151); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		symbol_152.setName("Lambda");
		symbol_152.setContextType(symbol_26);
		symbol_152.setResultType(symbol_11);
		symbol_152.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_152); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_153.setName("Lambda");
		symbol_153.setContextType(symbol_45);
		symbol_153.setResultType(symbol_11);
		symbol_153.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_153); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_154.setName("Lambda");
		symbol_154.setContextType(symbol_45);
		symbol_154.setResultType(symbol_11);
		symbol_154.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_154); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_155.setName("Lambda");
		symbol_155.setContextType(symbol_45);
		symbol_155.setResultType(symbol_11);
		symbol_155.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_155); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_156.setName("Lambda");
		symbol_156.setContextType(symbol_45);
		symbol_156.setResultType(symbol_11);
		symbol_156.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_156); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_157.setName("Lambda");
		symbol_157.setContextType(symbol_45);
		symbol_157.setResultType(symbol_11);
		symbol_157.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_157); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_158.setName("Lambda");
		symbol_158.setContextType(symbol_45);
		symbol_158.setResultType(symbol_11);
		symbol_158.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_158); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_159.setName("Lambda");
		symbol_159.setContextType(symbol_45);
		symbol_159.setResultType(symbol_11);
		symbol_159.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_159); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_160.setName("Lambda");
		symbol_160.setContextType(symbol_45);
		symbol_160.setResultType(symbol_11);
		symbol_160.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_160); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_161.setName("Lambda");
		symbol_161.setContextType(symbol_45);
		symbol_161.setResultType(symbol_51);
		symbol_161.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_161); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_162.setName("Lambda");
		symbol_162.setContextType(symbol_45);
		symbol_162.setResultType(symbol_48);
		symbol_162.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_162); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_163.setName("Lambda");
		symbol_163.setContextType(symbol_45);
		symbol_163.setResultType(symbol_88);
		symbol_163.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_163); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_164.setName("Lambda");
		symbol_164.setContextType(symbol_45);
		symbol_164.setResultType(symbol_88);
		symbol_164.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_164); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_165.setName("Lambda");
		symbol_165.setContextType(symbol_77);
		symbol_165.setResultType(symbol_83);
		symbol_165.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_165); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_166.setName("Lambda");
		symbol_166.setContextType(symbol_77);
		symbol_166.setResultType(symbol_80);
		symbol_166.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_166); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
		//
		symbol_167.setName("Lambda");
		symbol_167.setContextType(symbol_77);
		symbol_167.setResultType(symbol_314);
		symbol_167.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_167); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_168.setName("Lambda");
		symbol_168.setContextType(symbol_87);
		symbol_168.setResultType(symbol_88);
		symbol_168.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_168); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_169.setName("Lambda");
		symbol_169.setContextType(symbol_118);
		symbol_169.setResultType(symbol_124);
		symbol_169.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_169); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_170.setName("Lambda");
		symbol_170.setContextType(symbol_118);
		symbol_170.setResultType(symbol_121);
		symbol_170.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_170); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
		//
		symbol_171.setName("Lambda");
		symbol_171.setContextType(symbol_118);
		symbol_171.setResultType(symbol_302);
		symbol_171.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_171); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		symbol_172.setName("Lambda");
		symbol_172.setContextType(symbol_128);
		symbol_172.setResultType(symbol_11);
		symbol_172.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_172); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		symbol_173.setName("Lambda");
		symbol_173.setContextType(symbol_128);
		symbol_173.setResultType(symbol_11);
		symbol_173.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_173); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		symbol_174.setName("Lambda");
		symbol_174.setContextType(symbol_135);
		symbol_174.setResultType(symbol_11);
		symbol_174.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_174); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		symbol_175.setName("Lambda");
		symbol_175.setContextType(symbol_135);
		symbol_175.setResultType(symbol_11);
		symbol_175.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_175); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		symbol_176.setName("Lambda");
		symbol_176.setContextType(symbol_142);
		symbol_176.setResultType(symbol_11);
		symbol_176.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_176); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		symbol_177.setName("Lambda");
		symbol_177.setContextType(symbol_142);
		symbol_177.setResultType(symbol_11);
		symbol_177.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_177); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_178.setName("Lambda");
		symbol_178.setContextType(symbol_149);
		symbol_178.setResultType(symbol_88);
		symbol_178.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_150.getOwnedTypes().add(symbol_178); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_179.setName("Tuple");
		symbol_179.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_180.setName("first");
			symbol_180.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_180.setIsResolveProxies(true);
			symbol_179.getOwnedAttributes().add(symbol_180);
		}
		{ // ocl::$$::Tuple::second
			symbol_181.setName("second");
			symbol_181.setType(symbol_66);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_181.setIsResolveProxies(true);
			symbol_179.getOwnedAttributes().add(symbol_181);
		}
		symbol_150.getOwnedTypes().add(symbol_179); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_182.setName("Tuple");
		symbol_182.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_183.setName("first");
			symbol_183.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_183.setIsResolveProxies(true);
			symbol_182.getOwnedAttributes().add(symbol_183);
		}
		{ // ocl::$$::Tuple::second
			symbol_184.setName("second");
			symbol_184.setType(symbol_66);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_184.setIsResolveProxies(true);
			symbol_182.getOwnedAttributes().add(symbol_184);
		}
		symbol_150.getOwnedTypes().add(symbol_182); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_185.setName("Tuple");
		symbol_185.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_186.setName("first");
			symbol_186.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_186.setIsResolveProxies(true);
			symbol_185.getOwnedAttributes().add(symbol_186);
		}
		{ // ocl::$$::Tuple::second
			symbol_187.setName("second");
			symbol_187.setType(symbol_66);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_187.setIsResolveProxies(true);
			symbol_185.getOwnedAttributes().add(symbol_187);
		}
		symbol_150.getOwnedTypes().add(symbol_185); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_188.setName("Tuple");
		symbol_188.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_189.setName("first");
			symbol_189.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_189.setIsResolveProxies(true);
			symbol_188.getOwnedAttributes().add(symbol_189);
		}
		{ // ocl::$$::Tuple::second
			symbol_190.setName("second");
			symbol_190.setType(symbol_66);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_190.setIsResolveProxies(true);
			symbol_188.getOwnedAttributes().add(symbol_190);
		}
		symbol_150.getOwnedTypes().add(symbol_188); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		//
		symbol_191.setName("AnyClassifier");
		symbol_191.setInstanceType(symbol_18);
		symbol_191.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_724 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_724.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_725 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_725.setFormal(symbol_21);	
				symbol_725.setActual(symbol_18);	
				symbol_724.getParameterSubstitutions().add(symbol_725);
			}
			symbol_191.getTemplateBindings().add(symbol_724);
		}
		symbol_191.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_191); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		//
		symbol_192.setName("AnyClassifier");
		symbol_192.setInstanceType(symbol_34);
		symbol_192.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_726 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_726.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_727 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_727.setFormal(symbol_21);	
				symbol_727.setActual(symbol_34);	
				symbol_726.getParameterSubstitutions().add(symbol_727);
			}
			symbol_192.getTemplateBindings().add(symbol_726);
		}
		symbol_192.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_192); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		//
		symbol_193.setName("AnyClassifier");
		symbol_193.setInstanceType(symbol_38);
		symbol_193.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_728 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_728.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_729 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_729.setFormal(symbol_21);	
				symbol_729.setActual(symbol_38);	
				symbol_728.getParameterSubstitutions().add(symbol_729);
			}
			symbol_193.getTemplateBindings().add(symbol_728);
		}
		symbol_193.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_193); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		//
		symbol_194.setName("AnyClassifier");
		symbol_194.setInstanceType(symbol_71);
		symbol_194.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_730 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_730.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_731 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_731.setFormal(symbol_21);	
				symbol_731.setActual(symbol_71);	
				symbol_730.getParameterSubstitutions().add(symbol_731);
			}
			symbol_194.getTemplateBindings().add(symbol_730);
		}
		symbol_194.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_194); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		//
		symbol_195.setName("AnyClassifier");
		symbol_195.setInstanceType(symbol_91);
		symbol_195.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_732 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_732.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_733 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_733.setFormal(symbol_21);	
				symbol_733.setActual(symbol_91);	
				symbol_732.getParameterSubstitutions().add(symbol_733);
			}
			symbol_195.getTemplateBindings().add(symbol_732);
		}
		symbol_195.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_195); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[TT])?TT]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		//
		symbol_196.setName("AnyClassifier");
		symbol_196.setInstanceType(symbol_94);
		symbol_196.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_734 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_734.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_735 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_735.setFormal(symbol_21);	
				symbol_735.setActual(symbol_94);	
				symbol_734.getParameterSubstitutions().add(symbol_735);
			}
			symbol_196.getTemplateBindings().add(symbol_734);
		}
		symbol_196.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_196); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		//
		symbol_197.setName("AnyClassifier");
		symbol_197.setInstanceType(symbol_97);
		symbol_197.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_736 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_736.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_737 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_737.setFormal(symbol_21);	
				symbol_737.setActual(symbol_97);	
				symbol_736.getParameterSubstitutions().add(symbol_737);
			}
			symbol_197.getTemplateBindings().add(symbol_736);
		}
		symbol_197.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_197); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[T])?T]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()?U]
		//
		symbol_198.setName("AnyClassifier");
		symbol_198.setInstanceType(symbol_102);
		symbol_198.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_738 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_738.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_739 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_739.setFormal(symbol_21);	
				symbol_739.setActual(symbol_102);	
				symbol_738.getParameterSubstitutions().add(symbol_739);
			}
			symbol_198.getTemplateBindings().add(symbol_738);
		}
		symbol_198.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_198); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()?U]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		symbol_199.setName("AnyClassifier");
		symbol_199.setInstanceType(symbol_105);
		symbol_199.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_740 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_740.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_741 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_741.setFormal(symbol_21);	
				symbol_741.setActual(symbol_105);	
				symbol_740.getParameterSubstitutions().add(symbol_741);
			}
			symbol_199.getTemplateBindings().add(symbol_740);
		}
		symbol_199.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_199); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		symbol_200.setName("AnyClassifier");
		symbol_200.setInstanceType(symbol_105);
		symbol_200.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_742 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_742.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_743 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_743.setFormal(symbol_21);	
				symbol_743.setActual(symbol_105);	
				symbol_742.getParameterSubstitutions().add(symbol_743);
			}
			symbol_200.getTemplateBindings().add(symbol_742);
		}
		symbol_200.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_200); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		symbol_201.setName("AnyClassifier");
		symbol_201.setInstanceType(symbol_105);
		symbol_201.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_744 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_744.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_745 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_745.setFormal(symbol_21);	
				symbol_745.setActual(symbol_105);	
				symbol_744.getParameterSubstitutions().add(symbol_745);
			}
			symbol_201.getTemplateBindings().add(symbol_744);
		}
		symbol_201.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_201); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		symbol_202.setName("AnyClassifier");
		symbol_202.setInstanceType(symbol_105);
		symbol_202.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_746 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_746.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_747 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_747.setFormal(symbol_21);	
				symbol_747.setActual(symbol_105);	
				symbol_746.getParameterSubstitutions().add(symbol_747);
			}
			symbol_202.getTemplateBindings().add(symbol_746);
		}
		symbol_202.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_202); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		// ocl::$$::AnyClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_203.setName("AnyClassifier");
		symbol_203.setInstanceType(symbol_110);
		symbol_203.setUnspecializedElement(symbol_19);
		{
			TemplateBinding symbol_748 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_748.setSignature(symbol_20);
			{
				TemplateParameterSubstitution symbol_749 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_749.setFormal(symbol_21);	
				symbol_749.setActual(symbol_110);	
				symbol_748.getParameterSubstitutions().add(symbol_749);
			}
			symbol_203.getTemplateBindings().add(symbol_748);
		}
		symbol_203.getSuperClasses().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_150.getOwnedTypes().add(symbol_203); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		symbol_204.setName("Bag");
		symbol_204.setElementType(symbol_29);
		symbol_204.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_750 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_750.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_751 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_751.setFormal(symbol_25);	
				symbol_751.setActual(symbol_29);	
				symbol_750.getParameterSubstitutions().add(symbol_751);
			}
			symbol_204.getTemplateBindings().add(symbol_750);
		}
		symbol_204.getSuperClasses().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		symbol_204.getSuperClasses().add(symbol_274); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		symbol_150.getOwnedTypes().add(symbol_204); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_205.setName("Bag");
		symbol_205.setElementType(symbol_45);
		symbol_205.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_752 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_752.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_753 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_753.setFormal(symbol_25);	
				symbol_753.setActual(symbol_45);	
				symbol_752.getParameterSubstitutions().add(symbol_753);
			}
			symbol_205.getTemplateBindings().add(symbol_752);
		}
		symbol_205.getSuperClasses().add(symbol_250); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_205.getSuperClasses().add(symbol_276); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_205); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_206.setName("Bag");
		symbol_206.setElementType(symbol_80);
		symbol_206.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_754 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_754.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_755 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_755.setFormal(symbol_25);	
				symbol_755.setActual(symbol_80);	
				symbol_754.getParameterSubstitutions().add(symbol_755);
			}
			symbol_206.getTemplateBindings().add(symbol_754);
		}
		symbol_206.getSuperClasses().add(symbol_251); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_206.getSuperClasses().add(symbol_277); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_150.getOwnedTypes().add(symbol_206); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_207.setName("Bag");
		symbol_207.setElementType(symbol_77);
		symbol_207.setUnspecializedElement(symbol_23);
		{
			TemplateBinding symbol_756 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_756.setSignature(symbol_24);
			{
				TemplateParameterSubstitution symbol_757 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_757.setFormal(symbol_25);	
				symbol_757.setActual(symbol_77);	
				symbol_756.getParameterSubstitutions().add(symbol_757);
			}
			symbol_207.getTemplateBindings().add(symbol_756);
		}
		symbol_207.getSuperClasses().add(symbol_252); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_207.getSuperClasses().add(symbol_282); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_207); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::ClassClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_208.setName("ClassClassifier");
		symbol_208.setInstanceType(symbol_110);
		symbol_208.setUnspecializedElement(symbol_31);
		{
			TemplateBinding symbol_758 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_758.setSignature(symbol_32);
			{
				TemplateParameterSubstitution symbol_759 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_759.setFormal(symbol_33);	
				symbol_759.setActual(symbol_110);	
				symbol_758.getParameterSubstitutions().add(symbol_759);
			}
			symbol_208.getTemplateBindings().add(symbol_758);
		}
		symbol_208.getSuperClasses().add(symbol_203); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_208); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::CollectionClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_209.setName("CollectionClassifier");
		symbol_209.setInstanceType(symbol_110);
		symbol_209.setUnspecializedElement(symbol_35);
		{
			TemplateBinding symbol_760 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_760.setSignature(symbol_36);
			{
				TemplateParameterSubstitution symbol_761 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_761.setFormal(symbol_39);	
				symbol_761.setActual(symbol_45);	
				symbol_760.getParameterSubstitutions().add(symbol_761);
			}{
				TemplateParameterSubstitution symbol_762 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_762.setFormal(symbol_37);	
				symbol_762.setActual(symbol_110);	
				symbol_760.getParameterSubstitutions().add(symbol_762);
			}
			symbol_209.getTemplateBindings().add(symbol_760);
		}
		symbol_209.getSuperClasses().add(symbol_203); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_209); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		//
		symbol_210.setName("Collection");
		symbol_210.setElementType(symbol_14);
		symbol_210.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_763 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_763.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_764 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_764.setFormal(symbol_44);	
				symbol_764.setActual(symbol_14);	
				symbol_763.getParameterSubstitutions().add(symbol_764);
			}
			symbol_210.getTemplateBindings().add(symbol_763);
		}
		symbol_210.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_210); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_211.setName("Collection");
		symbol_211.setElementType(symbol_179);
		symbol_211.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_765 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_765.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_766 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_766.setFormal(symbol_44);	
				symbol_766.setActual(symbol_179);	
				symbol_765.getParameterSubstitutions().add(symbol_766);
			}
			symbol_211.getTemplateBindings().add(symbol_765);
		}
		symbol_211.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_211); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_212.setName("Collection");
		symbol_212.setElementType(symbol_179);
		symbol_212.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_767 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_767.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_768 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_768.setFormal(symbol_44);	
				symbol_768.setActual(symbol_179);	
				symbol_767.getParameterSubstitutions().add(symbol_768);
			}
			symbol_212.getTemplateBindings().add(symbol_767);
		}
		symbol_212.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_212); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_213.setName("Collection");
		symbol_213.setElementType(symbol_201);
		symbol_213.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_769 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_769.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_770 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_770.setFormal(symbol_44);	
				symbol_770.setActual(symbol_201);	
				symbol_769.getParameterSubstitutions().add(symbol_770);
			}
			symbol_213.getTemplateBindings().add(symbol_769);
		}
		symbol_213.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_213); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_214.setName("Collection");
		symbol_214.setElementType(symbol_201);
		symbol_214.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_771 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_771.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_772 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_772.setFormal(symbol_44);	
				symbol_772.setActual(symbol_201);	
				symbol_771.getParameterSubstitutions().add(symbol_772);
			}
			symbol_214.getTemplateBindings().add(symbol_771);
		}
		symbol_214.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_214); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		symbol_215.setName("Collection");
		symbol_215.setElementType(symbol_29);
		symbol_215.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_773 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_773.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_774 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_774.setFormal(symbol_44);	
				symbol_774.setActual(symbol_29);	
				symbol_773.getParameterSubstitutions().add(symbol_774);
			}
			symbol_215.getTemplateBindings().add(symbol_773);
		}
		symbol_215.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_216.setName("Collection");
		symbol_216.setElementType(symbol_26);
		symbol_216.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_775 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_775.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_776 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_776.setFormal(symbol_44);	
				symbol_776.setActual(symbol_26);	
				symbol_775.getParameterSubstitutions().add(symbol_776);
			}
			symbol_216.getTemplateBindings().add(symbol_775);
		}
		symbol_216.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_217.setName("Collection");
		symbol_217.setElementType(symbol_48);
		symbol_217.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_777 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_777.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_778 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_778.setFormal(symbol_44);	
				symbol_778.setActual(symbol_48);	
				symbol_777.getParameterSubstitutions().add(symbol_778);
			}
			symbol_217.getTemplateBindings().add(symbol_777);
		}
		symbol_217.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_217); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		symbol_218.setName("Collection");
		symbol_218.setElementType(symbol_54);
		symbol_218.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_779 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_779.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_780 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_780.setFormal(symbol_44);	
				symbol_780.setActual(symbol_54);	
				symbol_779.getParameterSubstitutions().add(symbol_780);
			}
			symbol_218.getTemplateBindings().add(symbol_779);
		}
		symbol_218.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_218); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
		//
		symbol_219.setName("Collection");
		symbol_219.setElementType(symbol_57);
		symbol_219.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_781 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_781.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_782 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_782.setFormal(symbol_44);	
				symbol_782.setActual(symbol_57);	
				symbol_781.getParameterSubstitutions().add(symbol_782);
			}
			symbol_219.getTemplateBindings().add(symbol_781);
		}
		symbol_219.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		symbol_220.setName("Collection");
		symbol_220.setElementType(symbol_60);
		symbol_220.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_783 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_783.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_784 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_784.setFormal(symbol_44);	
				symbol_784.setActual(symbol_60);	
				symbol_783.getParameterSubstitutions().add(symbol_784);
			}
			symbol_220.getTemplateBindings().add(symbol_783);
		}
		symbol_220.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_220); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		symbol_221.setName("Collection");
		symbol_221.setElementType(symbol_66);
		symbol_221.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_785 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_785.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_786 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_786.setFormal(symbol_44);	
				symbol_786.setActual(symbol_66);	
				symbol_785.getParameterSubstitutions().add(symbol_786);
			}
			symbol_221.getTemplateBindings().add(symbol_785);
		}
		symbol_221.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_221); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_222.setName("Collection");
		symbol_222.setElementType(symbol_45);
		symbol_222.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_787 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_787.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_788 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_788.setFormal(symbol_44);	
				symbol_788.setActual(symbol_45);	
				symbol_787.getParameterSubstitutions().add(symbol_788);
			}
			symbol_222.getTemplateBindings().add(symbol_787);
		}
		symbol_222.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_222); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_223.setName("Collection");
		symbol_223.setElementType(symbol_45);
		symbol_223.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_789 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_789.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_790 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_790.setFormal(symbol_44);	
				symbol_790.setActual(symbol_45);	
				symbol_789.getParameterSubstitutions().add(symbol_790);
			}
			symbol_223.getTemplateBindings().add(symbol_789);
		}
		symbol_223.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_224.setName("Collection");
		symbol_224.setElementType(symbol_45);
		symbol_224.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_791 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_791.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_792 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_792.setFormal(symbol_44);	
				symbol_792.setActual(symbol_45);	
				symbol_791.getParameterSubstitutions().add(symbol_792);
			}
			symbol_224.getTemplateBindings().add(symbol_791);
		}
		symbol_224.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_224); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_225.setName("Collection");
		symbol_225.setElementType(symbol_73);
		symbol_225.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_793 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_793.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_794 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_794.setFormal(symbol_44);	
				symbol_794.setActual(symbol_73);	
				symbol_793.getParameterSubstitutions().add(symbol_794);
			}
			symbol_225.getTemplateBindings().add(symbol_793);
		}
		symbol_225.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_225); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_226.setName("Collection");
		symbol_226.setElementType(symbol_80);
		symbol_226.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_795 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_795.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_796 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_796.setFormal(symbol_44);	
				symbol_796.setActual(symbol_80);	
				symbol_795.getParameterSubstitutions().add(symbol_796);
			}
			symbol_226.getTemplateBindings().add(symbol_795);
		}
		symbol_226.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_226); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_227.setName("Collection");
		symbol_227.setElementType(symbol_77);
		symbol_227.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_797 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_797.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_798 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_798.setFormal(symbol_44);	
				symbol_798.setActual(symbol_77);	
				symbol_797.getParameterSubstitutions().add(symbol_798);
			}
			symbol_227.getTemplateBindings().add(symbol_797);
		}
		symbol_227.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_228.setName("Collection");
		symbol_228.setElementType(symbol_77);
		symbol_228.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_799 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_799.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_800 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_800.setFormal(symbol_44);	
				symbol_800.setActual(symbol_77);	
				symbol_799.getParameterSubstitutions().add(symbol_800);
			}
			symbol_228.getTemplateBindings().add(symbol_799);
		}
		symbol_228.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		symbol_229.setName("Collection");
		symbol_229.setElementType(symbol_87);
		symbol_229.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_801 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_801.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_802 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_802.setFormal(symbol_44);	
				symbol_802.setActual(symbol_87);	
				symbol_801.getParameterSubstitutions().add(symbol_802);
			}
			symbol_229.getTemplateBindings().add(symbol_801);
		}
		symbol_229.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_230.setName("Collection");
		symbol_230.setElementType(symbol_88);
		symbol_230.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_803 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_803.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_804 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_804.setFormal(symbol_44);	
				symbol_804.setActual(symbol_88);	
				symbol_803.getParameterSubstitutions().add(symbol_804);
			}
			symbol_230.getTemplateBindings().add(symbol_803);
		}
		symbol_230.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_231.setName("Collection");
		symbol_231.setElementType(symbol_110);
		symbol_231.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_805 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_805.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_806 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_806.setFormal(symbol_44);	
				symbol_806.setActual(symbol_110);	
				symbol_805.getParameterSubstitutions().add(symbol_806);
			}
			symbol_231.getTemplateBindings().add(symbol_805);
		}
		symbol_231.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_232.setName("Collection");
		symbol_232.setElementType(symbol_121);
		symbol_232.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_807 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_807.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_808 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_808.setFormal(symbol_44);	
				symbol_808.setActual(symbol_121);	
				symbol_807.getParameterSubstitutions().add(symbol_808);
			}
			symbol_232.getTemplateBindings().add(symbol_807);
		}
		symbol_232.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_233.setName("Collection");
		symbol_233.setElementType(symbol_118);
		symbol_233.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_809 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_809.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_810 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_810.setFormal(symbol_44);	
				symbol_810.setActual(symbol_118);	
				symbol_809.getParameterSubstitutions().add(symbol_810);
			}
			symbol_233.getTemplateBindings().add(symbol_809);
		}
		symbol_233.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_233); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_234.setName("Collection");
		symbol_234.setElementType(symbol_118);
		symbol_234.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_811 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_811.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_812 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_812.setFormal(symbol_44);	
				symbol_812.setActual(symbol_118);	
				symbol_811.getParameterSubstitutions().add(symbol_812);
			}
			symbol_234.getTemplateBindings().add(symbol_811);
		}
		symbol_234.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_234); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_235.setName("Collection");
		symbol_235.setElementType(symbol_131);
		symbol_235.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_813 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_813.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_814 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_814.setFormal(symbol_44);	
				symbol_814.setActual(symbol_131);	
				symbol_813.getParameterSubstitutions().add(symbol_814);
			}
			symbol_235.getTemplateBindings().add(symbol_813);
		}
		symbol_235.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_236.setName("Collection");
		symbol_236.setElementType(symbol_128);
		symbol_236.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_815 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_815.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_816 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_816.setFormal(symbol_44);	
				symbol_816.setActual(symbol_128);	
				symbol_815.getParameterSubstitutions().add(symbol_816);
			}
			symbol_236.getTemplateBindings().add(symbol_815);
		}
		symbol_236.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_237.setName("Collection");
		symbol_237.setElementType(symbol_128);
		symbol_237.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_817 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_817.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_818 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_818.setFormal(symbol_44);	
				symbol_818.setActual(symbol_128);	
				symbol_817.getParameterSubstitutions().add(symbol_818);
			}
			symbol_237.getTemplateBindings().add(symbol_817);
		}
		symbol_237.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_238.setName("Collection");
		symbol_238.setElementType(symbol_138);
		symbol_238.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_819 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_819.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_820 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_820.setFormal(symbol_44);	
				symbol_820.setActual(symbol_138);	
				symbol_819.getParameterSubstitutions().add(symbol_820);
			}
			symbol_238.getTemplateBindings().add(symbol_819);
		}
		symbol_238.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_239.setName("Collection");
		symbol_239.setElementType(symbol_135);
		symbol_239.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_821 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_821.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_822 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_822.setFormal(symbol_44);	
				symbol_822.setActual(symbol_135);	
				symbol_821.getParameterSubstitutions().add(symbol_822);
			}
			symbol_239.getTemplateBindings().add(symbol_821);
		}
		symbol_239.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_240.setName("Collection");
		symbol_240.setElementType(symbol_145);
		symbol_240.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_823 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_823.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_824 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_824.setFormal(symbol_44);	
				symbol_824.setActual(symbol_145);	
				symbol_823.getParameterSubstitutions().add(symbol_824);
			}
			symbol_240.getTemplateBindings().add(symbol_823);
		}
		symbol_240.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_240); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_241.setName("Collection");
		symbol_241.setElementType(symbol_142);
		symbol_241.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_825 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_825.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_826 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_826.setFormal(symbol_44);	
				symbol_826.setActual(symbol_142);	
				symbol_825.getParameterSubstitutions().add(symbol_826);
			}
			symbol_241.getTemplateBindings().add(symbol_825);
		}
		symbol_241.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_242.setName("Collection");
		symbol_242.setElementType(symbol_149);
		symbol_242.setUnspecializedElement(symbol_42);
		{
			TemplateBinding symbol_827 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_827.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_828 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_828.setFormal(symbol_44);	
				symbol_828.setActual(symbol_149);	
				symbol_827.getParameterSubstitutions().add(symbol_828);
			}
			symbol_242.getTemplateBindings().add(symbol_827);
		}
		symbol_242.getSuperClasses().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_150.getOwnedTypes().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::EnumerationClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_243.setName("EnumerationClassifier");
		symbol_243.setInstanceType(symbol_110);
		symbol_243.setUnspecializedElement(symbol_68);
		{
			TemplateBinding symbol_829 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_829.setSignature(symbol_69);
			{
				TemplateParameterSubstitution symbol_830 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_830.setFormal(symbol_70);	
				symbol_830.setActual(symbol_110);	
				symbol_829.getParameterSubstitutions().add(symbol_830);
			}
			symbol_243.getTemplateBindings().add(symbol_829);
		}
		symbol_243.getSuperClasses().add(symbol_203); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_243); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_244.setName("NonOrderedCollection");
		symbol_244.setElementType(symbol_188);
		symbol_244.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_831 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_831.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_832 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_832.setFormal(symbol_76);	
				symbol_832.setActual(symbol_182);	
				symbol_831.getParameterSubstitutions().add(symbol_832);
			}
			symbol_244.getTemplateBindings().add(symbol_831);
		}
		symbol_244.getSuperClasses().add(symbol_211); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_150.getOwnedTypes().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_245.setName("NonOrderedCollection");
		symbol_245.setElementType(symbol_188);
		symbol_245.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_833 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_833.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_834 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_834.setFormal(symbol_76);	
				symbol_834.setActual(symbol_182);	
				symbol_833.getParameterSubstitutions().add(symbol_834);
			}
			symbol_245.getTemplateBindings().add(symbol_833);
		}
		symbol_245.getSuperClasses().add(symbol_211); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_150.getOwnedTypes().add(symbol_245); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_246.setName("NonOrderedCollection");
		symbol_246.setElementType(symbol_202);
		symbol_246.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_835 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_835.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_836 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_836.setFormal(symbol_76);	
				symbol_836.setActual(symbol_199);	
				symbol_835.getParameterSubstitutions().add(symbol_836);
			}
			symbol_246.getTemplateBindings().add(symbol_835);
		}
		symbol_246.getSuperClasses().add(symbol_214); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		symbol_150.getOwnedTypes().add(symbol_246); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_247.setName("NonOrderedCollection");
		symbol_247.setElementType(symbol_202);
		symbol_247.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_837 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_837.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_838 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_838.setFormal(symbol_76);	
				symbol_838.setActual(symbol_199);	
				symbol_837.getParameterSubstitutions().add(symbol_838);
			}
			symbol_247.getTemplateBindings().add(symbol_837);
		}
		symbol_247.getSuperClasses().add(symbol_214); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		symbol_150.getOwnedTypes().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		symbol_248.setName("NonOrderedCollection");
		symbol_248.setElementType(symbol_29);
		symbol_248.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_839 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_839.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_840 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_840.setFormal(symbol_76);	
				symbol_840.setActual(symbol_29);	
				symbol_839.getParameterSubstitutions().add(symbol_840);
			}
			symbol_248.getTemplateBindings().add(symbol_839);
		}
		symbol_248.getSuperClasses().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		symbol_150.getOwnedTypes().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_249.setName("NonOrderedCollection");
		symbol_249.setElementType(symbol_26);
		symbol_249.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_841 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_841.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_842 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_842.setFormal(symbol_76);	
				symbol_842.setActual(symbol_26);	
				symbol_841.getParameterSubstitutions().add(symbol_842);
			}
			symbol_249.getTemplateBindings().add(symbol_841);
		}
		symbol_249.getSuperClasses().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		symbol_150.getOwnedTypes().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_250.setName("NonOrderedCollection");
		symbol_250.setElementType(symbol_45);
		symbol_250.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_843 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_843.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_844 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_844.setFormal(symbol_76);	
				symbol_844.setActual(symbol_45);	
				symbol_843.getParameterSubstitutions().add(symbol_844);
			}
			symbol_250.getTemplateBindings().add(symbol_843);
		}
		symbol_250.getSuperClasses().add(symbol_224); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_250); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_251.setName("NonOrderedCollection");
		symbol_251.setElementType(symbol_80);
		symbol_251.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_845 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_845.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_846 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_846.setFormal(symbol_76);	
				symbol_846.setActual(symbol_80);	
				symbol_845.getParameterSubstitutions().add(symbol_846);
			}
			symbol_251.getTemplateBindings().add(symbol_845);
		}
		symbol_251.getSuperClasses().add(symbol_226); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_150.getOwnedTypes().add(symbol_251); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_252.setName("NonOrderedCollection");
		symbol_252.setElementType(symbol_77);
		symbol_252.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_847 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_847.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_848 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_848.setFormal(symbol_76);	
				symbol_848.setActual(symbol_77);	
				symbol_847.getParameterSubstitutions().add(symbol_848);
			}
			symbol_252.getTemplateBindings().add(symbol_847);
		}
		symbol_252.getSuperClasses().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_252); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_253.setName("NonOrderedCollection");
		symbol_253.setElementType(symbol_77);
		symbol_253.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_849 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_849.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_850 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_850.setFormal(symbol_76);	
				symbol_850.setActual(symbol_77);	
				symbol_849.getParameterSubstitutions().add(symbol_850);
			}
			symbol_253.getTemplateBindings().add(symbol_849);
		}
		symbol_253.getSuperClasses().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_253); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_254.setName("NonOrderedCollection");
		symbol_254.setElementType(symbol_77);
		symbol_254.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_851 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_851.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_852 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_852.setFormal(symbol_76);	
				symbol_852.setActual(symbol_77);	
				symbol_851.getParameterSubstitutions().add(symbol_852);
			}
			symbol_254.getTemplateBindings().add(symbol_851);
		}
		symbol_254.getSuperClasses().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_254); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_255.setName("NonOrderedCollection");
		symbol_255.setElementType(symbol_77);
		symbol_255.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_853 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_853.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_854 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_854.setFormal(symbol_76);	
				symbol_854.setActual(symbol_77);	
				symbol_853.getParameterSubstitutions().add(symbol_854);
			}
			symbol_255.getTemplateBindings().add(symbol_853);
		}
		symbol_255.getSuperClasses().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_255); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_256.setName("NonOrderedCollection");
		symbol_256.setElementType(symbol_77);
		symbol_256.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_855 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_855.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_856 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_856.setFormal(symbol_76);	
				symbol_856.setActual(symbol_77);	
				symbol_855.getParameterSubstitutions().add(symbol_856);
			}
			symbol_256.getTemplateBindings().add(symbol_855);
		}
		symbol_256.getSuperClasses().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_256); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_257.setName("NonOrderedCollection");
		symbol_257.setElementType(symbol_77);
		symbol_257.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_857 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_857.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_858 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_858.setFormal(symbol_76);	
				symbol_858.setActual(symbol_77);	
				symbol_857.getParameterSubstitutions().add(symbol_858);
			}
			symbol_257.getTemplateBindings().add(symbol_857);
		}
		symbol_257.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_257); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_258.setName("NonOrderedCollection");
		symbol_258.setElementType(symbol_88);
		symbol_258.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_859 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_859.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_860 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_860.setFormal(symbol_76);	
				symbol_860.setActual(symbol_88);	
				symbol_859.getParameterSubstitutions().add(symbol_860);
			}
			symbol_258.getTemplateBindings().add(symbol_859);
		}
		symbol_258.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_150.getOwnedTypes().add(symbol_258); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_259.setName("NonOrderedCollection");
		symbol_259.setElementType(symbol_88);
		symbol_259.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_861 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_861.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_862 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_862.setFormal(symbol_76);	
				symbol_862.setActual(symbol_88);	
				symbol_861.getParameterSubstitutions().add(symbol_862);
			}
			symbol_259.getTemplateBindings().add(symbol_861);
		}
		symbol_259.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_150.getOwnedTypes().add(symbol_259); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_260.setName("NonOrderedCollection");
		symbol_260.setElementType(symbol_88);
		symbol_260.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_863 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_863.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_864 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_864.setFormal(symbol_76);	
				symbol_864.setActual(symbol_88);	
				symbol_863.getParameterSubstitutions().add(symbol_864);
			}
			symbol_260.getTemplateBindings().add(symbol_863);
		}
		symbol_260.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_150.getOwnedTypes().add(symbol_260); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_261.setName("NonOrderedCollection");
		symbol_261.setElementType(symbol_88);
		symbol_261.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_865 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_865.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_866 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_866.setFormal(symbol_76);	
				symbol_866.setActual(symbol_88);	
				symbol_865.getParameterSubstitutions().add(symbol_866);
			}
			symbol_261.getTemplateBindings().add(symbol_865);
		}
		symbol_261.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_150.getOwnedTypes().add(symbol_261); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_262.setName("NonOrderedCollection");
		symbol_262.setElementType(symbol_110);
		symbol_262.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_867 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_867.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_868 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_868.setFormal(symbol_76);	
				symbol_868.setActual(symbol_110);	
				symbol_867.getParameterSubstitutions().add(symbol_868);
			}
			symbol_262.getTemplateBindings().add(symbol_867);
		}
		symbol_262.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_262); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_263.setName("NonOrderedCollection");
		symbol_263.setElementType(symbol_110);
		symbol_263.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_869 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_869.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_870 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_870.setFormal(symbol_76);	
				symbol_870.setActual(symbol_110);	
				symbol_869.getParameterSubstitutions().add(symbol_870);
			}
			symbol_263.getTemplateBindings().add(symbol_869);
		}
		symbol_263.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_263); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_264.setName("NonOrderedCollection");
		symbol_264.setElementType(symbol_110);
		symbol_264.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_871 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_871.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_872 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_872.setFormal(symbol_76);	
				symbol_872.setActual(symbol_110);	
				symbol_871.getParameterSubstitutions().add(symbol_872);
			}
			symbol_264.getTemplateBindings().add(symbol_871);
		}
		symbol_264.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_264); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_265.setName("NonOrderedCollection");
		symbol_265.setElementType(symbol_110);
		symbol_265.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_873 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_873.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_874 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_874.setFormal(symbol_76);	
				symbol_874.setActual(symbol_110);	
				symbol_873.getParameterSubstitutions().add(symbol_874);
			}
			symbol_265.getTemplateBindings().add(symbol_873);
		}
		symbol_265.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_265); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_266.setName("NonOrderedCollection");
		symbol_266.setElementType(symbol_110);
		symbol_266.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_875 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_875.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_876 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_876.setFormal(symbol_76);	
				symbol_876.setActual(symbol_110);	
				symbol_875.getParameterSubstitutions().add(symbol_876);
			}
			symbol_266.getTemplateBindings().add(symbol_875);
		}
		symbol_266.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_266); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_267.setName("NonOrderedCollection");
		symbol_267.setElementType(symbol_110);
		symbol_267.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_877 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_877.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_878 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_878.setFormal(symbol_76);	
				symbol_878.setActual(symbol_110);	
				symbol_877.getParameterSubstitutions().add(symbol_878);
			}
			symbol_267.getTemplateBindings().add(symbol_877);
		}
		symbol_267.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_267); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_268.setName("NonOrderedCollection");
		symbol_268.setElementType(symbol_128);
		symbol_268.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_879 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_879.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_880 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_880.setFormal(symbol_76);	
				symbol_880.setActual(symbol_128);	
				symbol_879.getParameterSubstitutions().add(symbol_880);
			}
			symbol_268.getTemplateBindings().add(symbol_879);
		}
		symbol_268.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_150.getOwnedTypes().add(symbol_268); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_269.setName("NonOrderedCollection");
		symbol_269.setElementType(symbol_128);
		symbol_269.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_881 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_881.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_882 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_882.setFormal(symbol_76);	
				symbol_882.setActual(symbol_128);	
				symbol_881.getParameterSubstitutions().add(symbol_882);
			}
			symbol_269.getTemplateBindings().add(symbol_881);
		}
		symbol_269.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_150.getOwnedTypes().add(symbol_269); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_270.setName("NonOrderedCollection");
		symbol_270.setElementType(symbol_128);
		symbol_270.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_883 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_883.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_884 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_884.setFormal(symbol_76);	
				symbol_884.setActual(symbol_128);	
				symbol_883.getParameterSubstitutions().add(symbol_884);
			}
			symbol_270.getTemplateBindings().add(symbol_883);
		}
		symbol_270.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_150.getOwnedTypes().add(symbol_270); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_271.setName("NonOrderedCollection");
		symbol_271.setElementType(symbol_145);
		symbol_271.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_885 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_885.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_886 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_886.setFormal(symbol_76);	
				symbol_886.setActual(symbol_145);	
				symbol_885.getParameterSubstitutions().add(symbol_886);
			}
			symbol_271.getTemplateBindings().add(symbol_885);
		}
		symbol_271.getSuperClasses().add(symbol_240); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		symbol_150.getOwnedTypes().add(symbol_271); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_272.setName("NonOrderedCollection");
		symbol_272.setElementType(symbol_142);
		symbol_272.setUnspecializedElement(symbol_74);
		{
			TemplateBinding symbol_887 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_887.setSignature(symbol_75);
			{
				TemplateParameterSubstitution symbol_888 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_888.setFormal(symbol_76);	
				symbol_888.setActual(symbol_142);	
				symbol_887.getParameterSubstitutions().add(symbol_888);
			}
			symbol_272.getTemplateBindings().add(symbol_887);
		}
		symbol_272.getSuperClasses().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		symbol_150.getOwnedTypes().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[String]
		//
		symbol_273.setName("NonUniqueCollection");
		symbol_273.setElementType(symbol_14);
		symbol_273.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_889 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_889.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_890 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_890.setFormal(symbol_86);	
				symbol_890.setActual(symbol_14);	
				symbol_889.getParameterSubstitutions().add(symbol_890);
			}
			symbol_273.getTemplateBindings().add(symbol_889);
		}
		symbol_273.getSuperClasses().add(symbol_210); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		symbol_150.getOwnedTypes().add(symbol_273); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[String]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		symbol_274.setName("NonUniqueCollection");
		symbol_274.setElementType(symbol_29);
		symbol_274.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_891 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_891.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_892 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_892.setFormal(symbol_86);	
				symbol_892.setActual(symbol_29);	
				symbol_891.getParameterSubstitutions().add(symbol_892);
			}
			symbol_274.getTemplateBindings().add(symbol_891);
		}
		symbol_274.getSuperClasses().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		symbol_150.getOwnedTypes().add(symbol_274); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_275.setName("NonUniqueCollection");
		symbol_275.setElementType(symbol_26);
		symbol_275.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_893 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_893.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_894 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_894.setFormal(symbol_86);	
				symbol_894.setActual(symbol_26);	
				symbol_893.getParameterSubstitutions().add(symbol_894);
			}
			symbol_275.getTemplateBindings().add(symbol_893);
		}
		symbol_275.getSuperClasses().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		symbol_150.getOwnedTypes().add(symbol_275); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_276.setName("NonUniqueCollection");
		symbol_276.setElementType(symbol_45);
		symbol_276.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_895 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_895.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_896 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_896.setFormal(symbol_86);	
				symbol_896.setActual(symbol_45);	
				symbol_895.getParameterSubstitutions().add(symbol_896);
			}
			symbol_276.getTemplateBindings().add(symbol_895);
		}
		symbol_276.getSuperClasses().add(symbol_224); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_276); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_277.setName("NonUniqueCollection");
		symbol_277.setElementType(symbol_80);
		symbol_277.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_897 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_897.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_898 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_898.setFormal(symbol_86);	
				symbol_898.setActual(symbol_80);	
				symbol_897.getParameterSubstitutions().add(symbol_898);
			}
			symbol_277.getTemplateBindings().add(symbol_897);
		}
		symbol_277.getSuperClasses().add(symbol_226); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_150.getOwnedTypes().add(symbol_277); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_278.setName("NonUniqueCollection");
		symbol_278.setElementType(symbol_77);
		symbol_278.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_899 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_899.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_900 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_900.setFormal(symbol_86);	
				symbol_900.setActual(symbol_77);	
				symbol_899.getParameterSubstitutions().add(symbol_900);
			}
			symbol_278.getTemplateBindings().add(symbol_899);
		}
		symbol_278.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_278); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_279.setName("NonUniqueCollection");
		symbol_279.setElementType(symbol_77);
		symbol_279.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_901 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_901.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_902 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_902.setFormal(symbol_86);	
				symbol_902.setActual(symbol_77);	
				symbol_901.getParameterSubstitutions().add(symbol_902);
			}
			symbol_279.getTemplateBindings().add(symbol_901);
		}
		symbol_279.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_279); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_280.setName("NonUniqueCollection");
		symbol_280.setElementType(symbol_77);
		symbol_280.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_903 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_903.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_904 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_904.setFormal(symbol_86);	
				symbol_904.setActual(symbol_77);	
				symbol_903.getParameterSubstitutions().add(symbol_904);
			}
			symbol_280.getTemplateBindings().add(symbol_903);
		}
		symbol_280.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_280); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_281.setName("NonUniqueCollection");
		symbol_281.setElementType(symbol_77);
		symbol_281.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_905 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_905.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_906 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_906.setFormal(symbol_86);	
				symbol_906.setActual(symbol_77);	
				symbol_905.getParameterSubstitutions().add(symbol_906);
			}
			symbol_281.getTemplateBindings().add(symbol_905);
		}
		symbol_281.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_281); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_282.setName("NonUniqueCollection");
		symbol_282.setElementType(symbol_77);
		symbol_282.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_907 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_907.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_908 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_908.setFormal(symbol_86);	
				symbol_908.setActual(symbol_77);	
				symbol_907.getParameterSubstitutions().add(symbol_908);
			}
			symbol_282.getTemplateBindings().add(symbol_907);
		}
		symbol_282.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_282); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		symbol_283.setName("NonUniqueCollection");
		symbol_283.setElementType(symbol_87);
		symbol_283.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_909 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_909.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_910 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_910.setFormal(symbol_86);	
				symbol_910.setActual(symbol_87);	
				symbol_909.getParameterSubstitutions().add(symbol_910);
			}
			symbol_283.getTemplateBindings().add(symbol_909);
		}
		symbol_283.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_283); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_284.setName("NonUniqueCollection");
		symbol_284.setElementType(symbol_121);
		symbol_284.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_911 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_911.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_912 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_912.setFormal(symbol_86);	
				symbol_912.setActual(symbol_121);	
				symbol_911.getParameterSubstitutions().add(symbol_912);
			}
			symbol_284.getTemplateBindings().add(symbol_911);
		}
		symbol_284.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_150.getOwnedTypes().add(symbol_284); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_285.setName("NonUniqueCollection");
		symbol_285.setElementType(symbol_118);
		symbol_285.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_913 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_913.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_914 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_914.setFormal(symbol_86);	
				symbol_914.setActual(symbol_118);	
				symbol_913.getParameterSubstitutions().add(symbol_914);
			}
			symbol_285.getTemplateBindings().add(symbol_913);
		}
		symbol_285.getSuperClasses().add(symbol_233); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_285); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_286.setName("NonUniqueCollection");
		symbol_286.setElementType(symbol_138);
		symbol_286.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_915 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_915.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_916 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_916.setFormal(symbol_86);	
				symbol_916.setActual(symbol_138);	
				symbol_915.getParameterSubstitutions().add(symbol_916);
			}
			symbol_286.getTemplateBindings().add(symbol_915);
		}
		symbol_286.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		symbol_150.getOwnedTypes().add(symbol_286); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_287.setName("NonUniqueCollection");
		symbol_287.setElementType(symbol_135);
		symbol_287.setUnspecializedElement(symbol_84);
		{
			TemplateBinding symbol_917 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_917.setSignature(symbol_85);
			{
				TemplateParameterSubstitution symbol_918 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_918.setFormal(symbol_86);	
				symbol_918.setActual(symbol_135);	
				symbol_917.getParameterSubstitutions().add(symbol_918);
			}
			symbol_287.getTemplateBindings().add(symbol_917);
		}
		symbol_287.getSuperClasses().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		symbol_150.getOwnedTypes().add(symbol_287); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[String]
		//
		symbol_288.setName("OrderedCollection");
		symbol_288.setElementType(symbol_14);
		symbol_288.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_919 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_919.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_920 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_920.setFormal(symbol_117);	
				symbol_920.setActual(symbol_14);	
				symbol_919.getParameterSubstitutions().add(symbol_920);
			}
			symbol_288.getTemplateBindings().add(symbol_919);
		}
		symbol_288.getSuperClasses().add(symbol_210); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		symbol_150.getOwnedTypes().add(symbol_288); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[String]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_289.setName("OrderedCollection");
		symbol_289.setElementType(symbol_45);
		symbol_289.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_921 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_921.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_922 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_922.setFormal(symbol_117);	
				symbol_922.setActual(symbol_45);	
				symbol_921.getParameterSubstitutions().add(symbol_922);
			}
			symbol_289.getTemplateBindings().add(symbol_921);
		}
		symbol_289.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_289); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_290.setName("OrderedCollection");
		symbol_290.setElementType(symbol_73);
		symbol_290.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_923 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_923.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_924 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_924.setFormal(symbol_117);	
				symbol_924.setActual(symbol_73);	
				symbol_923.getParameterSubstitutions().add(symbol_924);
			}
			symbol_290.getTemplateBindings().add(symbol_923);
		}
		symbol_290.getSuperClasses().add(symbol_225); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		symbol_150.getOwnedTypes().add(symbol_290); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		symbol_291.setName("OrderedCollection");
		symbol_291.setElementType(symbol_87);
		symbol_291.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_925 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_925.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_926 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_926.setFormal(symbol_117);	
				symbol_926.setActual(symbol_87);	
				symbol_925.getParameterSubstitutions().add(symbol_926);
			}
			symbol_291.getTemplateBindings().add(symbol_925);
		}
		symbol_291.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_292.setName("OrderedCollection");
		symbol_292.setElementType(symbol_121);
		symbol_292.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_927 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_927.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_928 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_928.setFormal(symbol_117);	
				symbol_928.setActual(symbol_121);	
				symbol_927.getParameterSubstitutions().add(symbol_928);
			}
			symbol_292.getTemplateBindings().add(symbol_927);
		}
		symbol_292.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_150.getOwnedTypes().add(symbol_292); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_293.setName("OrderedCollection");
		symbol_293.setElementType(symbol_118);
		symbol_293.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_929 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_929.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_930 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_930.setFormal(symbol_117);	
				symbol_930.setActual(symbol_118);	
				symbol_929.getParameterSubstitutions().add(symbol_930);
			}
			symbol_293.getTemplateBindings().add(symbol_929);
		}
		symbol_293.getSuperClasses().add(symbol_234); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_294.setName("OrderedCollection");
		symbol_294.setElementType(symbol_118);
		symbol_294.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_931 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_931.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_932 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_932.setFormal(symbol_117);	
				symbol_932.setActual(symbol_118);	
				symbol_931.getParameterSubstitutions().add(symbol_932);
			}
			symbol_294.getTemplateBindings().add(symbol_931);
		}
		symbol_294.getSuperClasses().add(symbol_234); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_295.setName("OrderedCollection");
		symbol_295.setElementType(symbol_131);
		symbol_295.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_933 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_933.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_934 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_934.setFormal(symbol_117);	
				symbol_934.setActual(symbol_131);	
				symbol_933.getParameterSubstitutions().add(symbol_934);
			}
			symbol_295.getTemplateBindings().add(symbol_933);
		}
		symbol_295.getSuperClasses().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		symbol_150.getOwnedTypes().add(symbol_295); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_296.setName("OrderedCollection");
		symbol_296.setElementType(symbol_128);
		symbol_296.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_935 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_935.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_936 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_936.setFormal(symbol_117);	
				symbol_936.setActual(symbol_128);	
				symbol_935.getParameterSubstitutions().add(symbol_936);
			}
			symbol_296.getTemplateBindings().add(symbol_935);
		}
		symbol_296.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_150.getOwnedTypes().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_297.setName("OrderedCollection");
		symbol_297.setElementType(symbol_138);
		symbol_297.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_937 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_937.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_938 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_938.setFormal(symbol_117);	
				symbol_938.setActual(symbol_138);	
				symbol_937.getParameterSubstitutions().add(symbol_938);
			}
			symbol_297.getTemplateBindings().add(symbol_937);
		}
		symbol_297.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		symbol_150.getOwnedTypes().add(symbol_297); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_298.setName("OrderedCollection");
		symbol_298.setElementType(symbol_135);
		symbol_298.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_939 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_939.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_940 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_940.setFormal(symbol_117);	
				symbol_940.setActual(symbol_135);	
				symbol_939.getParameterSubstitutions().add(symbol_940);
			}
			symbol_298.getTemplateBindings().add(symbol_939);
		}
		symbol_298.getSuperClasses().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		symbol_150.getOwnedTypes().add(symbol_298); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_299.setName("OrderedCollection");
		symbol_299.setElementType(symbol_149);
		symbol_299.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_941 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_941.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_942 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_942.setFormal(symbol_117);	
				symbol_942.setActual(symbol_149);	
				symbol_941.getParameterSubstitutions().add(symbol_942);
			}
			symbol_299.getTemplateBindings().add(symbol_941);
		}
		symbol_299.getSuperClasses().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_300.setName("OrderedSet");
		symbol_300.setElementType(symbol_45);
		symbol_300.setUnspecializedElement(symbol_125);
		{
			TemplateBinding symbol_943 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_943.setSignature(symbol_126);
			{
				TemplateParameterSubstitution symbol_944 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_944.setFormal(symbol_127);	
				symbol_944.setActual(symbol_45);	
				symbol_943.getParameterSubstitutions().add(symbol_944);
			}
			symbol_300.getTemplateBindings().add(symbol_943);
		}
		symbol_300.getSuperClasses().add(symbol_289); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_300.getSuperClasses().add(symbol_323); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_300); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_301.setName("OrderedSet");
		symbol_301.setElementType(symbol_73);
		symbol_301.setUnspecializedElement(symbol_125);
		{
			TemplateBinding symbol_945 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_945.setSignature(symbol_126);
			{
				TemplateParameterSubstitution symbol_946 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_946.setFormal(symbol_127);	
				symbol_946.setActual(symbol_73);	
				symbol_945.getParameterSubstitutions().add(symbol_946);
			}
			symbol_301.getTemplateBindings().add(symbol_945);
		}
		symbol_301.getSuperClasses().add(symbol_290); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		symbol_301.getSuperClasses().add(symbol_324); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		symbol_150.getOwnedTypes().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_302.setName("OrderedSet");
		symbol_302.setElementType(symbol_118);
		symbol_302.setUnspecializedElement(symbol_125);
		{
			TemplateBinding symbol_947 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_947.setSignature(symbol_126);
			{
				TemplateParameterSubstitution symbol_948 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_948.setFormal(symbol_127);	
				symbol_948.setActual(symbol_118);	
				symbol_947.getParameterSubstitutions().add(symbol_948);
			}
			symbol_302.getTemplateBindings().add(symbol_947);
		}
		symbol_302.getSuperClasses().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_302.getSuperClasses().add(symbol_342); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_302); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_303.setName("OrderedSet");
		symbol_303.setElementType(symbol_131);
		symbol_303.setUnspecializedElement(symbol_125);
		{
			TemplateBinding symbol_949 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_949.setSignature(symbol_126);
			{
				TemplateParameterSubstitution symbol_950 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_950.setFormal(symbol_127);	
				symbol_950.setActual(symbol_131);	
				symbol_949.getParameterSubstitutions().add(symbol_950);
			}
			symbol_303.getTemplateBindings().add(symbol_949);
		}
		symbol_303.getSuperClasses().add(symbol_295); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		symbol_303.getSuperClasses().add(symbol_343); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		symbol_150.getOwnedTypes().add(symbol_303); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_304.setName("OrderedSet");
		symbol_304.setElementType(symbol_149);
		symbol_304.setUnspecializedElement(symbol_125);
		{
			TemplateBinding symbol_951 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_951.setSignature(symbol_126);
			{
				TemplateParameterSubstitution symbol_952 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_952.setFormal(symbol_127);	
				symbol_952.setActual(symbol_149);	
				symbol_951.getParameterSubstitutions().add(symbol_952);
			}
			symbol_304.getTemplateBindings().add(symbol_951);
		}
		symbol_304.getSuperClasses().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_304.getSuperClasses().add(symbol_349); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_304); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
		//
		symbol_305.setName("Sequence");
		symbol_305.setElementType(symbol_14);
		symbol_305.setUnspecializedElement(symbol_132);
		{
			TemplateBinding symbol_953 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_953.setSignature(symbol_133);
			{
				TemplateParameterSubstitution symbol_954 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_954.setFormal(symbol_134);	
				symbol_954.setActual(symbol_14);	
				symbol_953.getParameterSubstitutions().add(symbol_954);
			}
			symbol_305.getTemplateBindings().add(symbol_953);
		}
		symbol_305.getSuperClasses().add(symbol_288); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[String]
		symbol_305.getSuperClasses().add(symbol_273); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[String]
		symbol_150.getOwnedTypes().add(symbol_305); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_306.setName("Sequence");
		symbol_306.setElementType(symbol_45);
		symbol_306.setUnspecializedElement(symbol_132);
		{
			TemplateBinding symbol_955 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_955.setSignature(symbol_133);
			{
				TemplateParameterSubstitution symbol_956 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_956.setFormal(symbol_134);	
				symbol_956.setActual(symbol_45);	
				symbol_955.getParameterSubstitutions().add(symbol_956);
			}
			symbol_306.getTemplateBindings().add(symbol_955);
		}
		symbol_306.getSuperClasses().add(symbol_289); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_306.getSuperClasses().add(symbol_276); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_306); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		symbol_307.setName("Sequence");
		symbol_307.setElementType(symbol_87);
		symbol_307.setUnspecializedElement(symbol_132);
		{
			TemplateBinding symbol_957 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_957.setSignature(symbol_133);
			{
				TemplateParameterSubstitution symbol_958 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_958.setFormal(symbol_134);	
				symbol_958.setActual(symbol_87);	
				symbol_957.getParameterSubstitutions().add(symbol_958);
			}
			symbol_307.getTemplateBindings().add(symbol_957);
		}
		symbol_307.getSuperClasses().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		symbol_307.getSuperClasses().add(symbol_283); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_307); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_308.setName("Sequence");
		symbol_308.setElementType(symbol_121);
		symbol_308.setUnspecializedElement(symbol_132);
		{
			TemplateBinding symbol_959 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_959.setSignature(symbol_133);
			{
				TemplateParameterSubstitution symbol_960 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_960.setFormal(symbol_134);	
				symbol_960.setActual(symbol_121);	
				symbol_959.getParameterSubstitutions().add(symbol_960);
			}
			symbol_308.getTemplateBindings().add(symbol_959);
		}
		symbol_308.getSuperClasses().add(symbol_292); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_308.getSuperClasses().add(symbol_284); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_150.getOwnedTypes().add(symbol_308); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_309.setName("Sequence");
		symbol_309.setElementType(symbol_118);
		symbol_309.setUnspecializedElement(symbol_132);
		{
			TemplateBinding symbol_961 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_961.setSignature(symbol_133);
			{
				TemplateParameterSubstitution symbol_962 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_962.setFormal(symbol_134);	
				symbol_962.setActual(symbol_118);	
				symbol_961.getParameterSubstitutions().add(symbol_962);
			}
			symbol_309.getTemplateBindings().add(symbol_961);
		}
		symbol_309.getSuperClasses().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_309.getSuperClasses().add(symbol_285); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_309); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_310.setName("Sequence");
		symbol_310.setElementType(symbol_138);
		symbol_310.setUnspecializedElement(symbol_132);
		{
			TemplateBinding symbol_963 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_963.setSignature(symbol_133);
			{
				TemplateParameterSubstitution symbol_964 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_964.setFormal(symbol_134);	
				symbol_964.setActual(symbol_138);	
				symbol_963.getParameterSubstitutions().add(symbol_964);
			}
			symbol_310.getTemplateBindings().add(symbol_963);
		}
		symbol_310.getSuperClasses().add(symbol_297); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		symbol_310.getSuperClasses().add(symbol_286); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		symbol_150.getOwnedTypes().add(symbol_310); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_311.setName("Set");
		symbol_311.setElementType(symbol_188);
		symbol_311.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_965 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_965.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_966 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_966.setFormal(symbol_141);	
				symbol_966.setActual(symbol_182);	
				symbol_965.getParameterSubstitutions().add(symbol_966);
			}
			symbol_311.getTemplateBindings().add(symbol_965);
		}
		symbol_311.getSuperClasses().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_311.getSuperClasses().add(symbol_320); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_150.getOwnedTypes().add(symbol_311); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_312.setName("Set");
		symbol_312.setElementType(symbol_202);
		symbol_312.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_967 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_967.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_968 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_968.setFormal(symbol_141);	
				symbol_968.setActual(symbol_199);	
				symbol_967.getParameterSubstitutions().add(symbol_968);
			}
			symbol_312.getTemplateBindings().add(symbol_967);
		}
		symbol_312.getSuperClasses().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		symbol_312.getSuperClasses().add(symbol_322); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		symbol_150.getOwnedTypes().add(symbol_312); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_313.setName("Set");
		symbol_313.setElementType(symbol_45);
		symbol_313.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_969 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_969.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_970 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_970.setFormal(symbol_141);	
				symbol_970.setActual(symbol_45);	
				symbol_969.getParameterSubstitutions().add(symbol_970);
			}
			symbol_313.getTemplateBindings().add(symbol_969);
		}
		symbol_313.getSuperClasses().add(symbol_250); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_313.getSuperClasses().add(symbol_323); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_313); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_314.setName("Set");
		symbol_314.setElementType(symbol_77);
		symbol_314.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_971 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_971.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_972 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_972.setFormal(symbol_141);	
				symbol_972.setActual(symbol_77);	
				symbol_971.getParameterSubstitutions().add(symbol_972);
			}
			symbol_314.getTemplateBindings().add(symbol_971);
		}
		symbol_314.getSuperClasses().add(symbol_257); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_314.getSuperClasses().add(symbol_329); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_314); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_315.setName("Set");
		symbol_315.setElementType(symbol_88);
		symbol_315.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_973 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_973.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_974 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_974.setFormal(symbol_141);	
				symbol_974.setActual(symbol_88);	
				symbol_973.getParameterSubstitutions().add(symbol_974);
			}
			symbol_315.getTemplateBindings().add(symbol_973);
		}
		symbol_315.getSuperClasses().add(symbol_260); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_315.getSuperClasses().add(symbol_333); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_150.getOwnedTypes().add(symbol_315); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_316.setName("Set");
		symbol_316.setElementType(symbol_110);
		symbol_316.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_975 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_975.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_976 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_976.setFormal(symbol_141);	
				symbol_976.setActual(symbol_110);	
				symbol_975.getParameterSubstitutions().add(symbol_976);
			}
			symbol_316.getTemplateBindings().add(symbol_975);
		}
		symbol_316.getSuperClasses().add(symbol_264); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_316.getSuperClasses().add(symbol_336); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_316); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_317.setName("Set");
		symbol_317.setElementType(symbol_128);
		symbol_317.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_977 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_977.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_978 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_978.setFormal(symbol_141);	
				symbol_978.setActual(symbol_128);	
				symbol_977.getParameterSubstitutions().add(symbol_978);
			}
			symbol_317.getTemplateBindings().add(symbol_977);
		}
		symbol_317.getSuperClasses().add(symbol_270); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_317.getSuperClasses().add(symbol_346); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_150.getOwnedTypes().add(symbol_317); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_318.setName("Set");
		symbol_318.setElementType(symbol_145);
		symbol_318.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_979 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_979.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_980 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_980.setFormal(symbol_141);	
				symbol_980.setActual(symbol_145);	
				symbol_979.getParameterSubstitutions().add(symbol_980);
			}
			symbol_318.getTemplateBindings().add(symbol_979);
		}
		symbol_318.getSuperClasses().add(symbol_271); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		symbol_318.getSuperClasses().add(symbol_347); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		symbol_150.getOwnedTypes().add(symbol_318); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_319.setName("UniqueCollection");
		symbol_319.setElementType(symbol_188);
		symbol_319.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_981 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_981.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_982 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_982.setFormal(symbol_148);	
				symbol_982.setActual(symbol_182);	
				symbol_981.getParameterSubstitutions().add(symbol_982);
			}
			symbol_319.getTemplateBindings().add(symbol_981);
		}
		symbol_319.getSuperClasses().add(symbol_211); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_150.getOwnedTypes().add(symbol_319); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_320.setName("UniqueCollection");
		symbol_320.setElementType(symbol_188);
		symbol_320.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_983 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_983.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_984 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_984.setFormal(symbol_148);	
				symbol_984.setActual(symbol_182);	
				symbol_983.getParameterSubstitutions().add(symbol_984);
			}
			symbol_320.getTemplateBindings().add(symbol_983);
		}
		symbol_320.getSuperClasses().add(symbol_211); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_150.getOwnedTypes().add(symbol_320); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_321.setName("UniqueCollection");
		symbol_321.setElementType(symbol_202);
		symbol_321.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_985 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_985.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_986 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_986.setFormal(symbol_148);	
				symbol_986.setActual(symbol_199);	
				symbol_985.getParameterSubstitutions().add(symbol_986);
			}
			symbol_321.getTemplateBindings().add(symbol_985);
		}
		symbol_321.getSuperClasses().add(symbol_214); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		symbol_150.getOwnedTypes().add(symbol_321); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_322.setName("UniqueCollection");
		symbol_322.setElementType(symbol_202);
		symbol_322.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_987 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_987.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_988 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_988.setFormal(symbol_148);	
				symbol_988.setActual(symbol_199);	
				symbol_987.getParameterSubstitutions().add(symbol_988);
			}
			symbol_322.getTemplateBindings().add(symbol_987);
		}
		symbol_322.getSuperClasses().add(symbol_214); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		symbol_150.getOwnedTypes().add(symbol_322); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!AnyClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_323.setName("UniqueCollection");
		symbol_323.setElementType(symbol_45);
		symbol_323.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_989 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_989.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_990 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_990.setFormal(symbol_148);	
				symbol_990.setActual(symbol_45);	
				symbol_989.getParameterSubstitutions().add(symbol_990);
			}
			symbol_323.getTemplateBindings().add(symbol_989);
		}
		symbol_323.getSuperClasses().add(symbol_224); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_323); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_324.setName("UniqueCollection");
		symbol_324.setElementType(symbol_73);
		symbol_324.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_991 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_991.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_992 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_992.setFormal(symbol_148);	
				symbol_992.setActual(symbol_73);	
				symbol_991.getParameterSubstitutions().add(symbol_992);
			}
			symbol_324.getTemplateBindings().add(symbol_991);
		}
		symbol_324.getSuperClasses().add(symbol_225); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		symbol_150.getOwnedTypes().add(symbol_324); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_325.setName("UniqueCollection");
		symbol_325.setElementType(symbol_77);
		symbol_325.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_993 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_993.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_994 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_994.setFormal(symbol_148);	
				symbol_994.setActual(symbol_77);	
				symbol_993.getParameterSubstitutions().add(symbol_994);
			}
			symbol_325.getTemplateBindings().add(symbol_993);
		}
		symbol_325.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_325); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_326.setName("UniqueCollection");
		symbol_326.setElementType(symbol_77);
		symbol_326.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_995 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_995.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_996 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_996.setFormal(symbol_148);	
				symbol_996.setActual(symbol_77);	
				symbol_995.getParameterSubstitutions().add(symbol_996);
			}
			symbol_326.getTemplateBindings().add(symbol_995);
		}
		symbol_326.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_326); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_327.setName("UniqueCollection");
		symbol_327.setElementType(symbol_77);
		symbol_327.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_997 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_997.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_998 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_998.setFormal(symbol_148);	
				symbol_998.setActual(symbol_77);	
				symbol_997.getParameterSubstitutions().add(symbol_998);
			}
			symbol_327.getTemplateBindings().add(symbol_997);
		}
		symbol_327.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_327); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_328.setName("UniqueCollection");
		symbol_328.setElementType(symbol_77);
		symbol_328.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_999 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_999.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1000 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1000.setFormal(symbol_148);	
				symbol_1000.setActual(symbol_77);	
				symbol_999.getParameterSubstitutions().add(symbol_1000);
			}
			symbol_328.getTemplateBindings().add(symbol_999);
		}
		symbol_328.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_328); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_329.setName("UniqueCollection");
		symbol_329.setElementType(symbol_77);
		symbol_329.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1001 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1001.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1002 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1002.setFormal(symbol_148);	
				symbol_1002.setActual(symbol_77);	
				symbol_1001.getParameterSubstitutions().add(symbol_1002);
			}
			symbol_329.getTemplateBindings().add(symbol_1001);
		}
		symbol_329.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_329); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_330.setName("UniqueCollection");
		symbol_330.setElementType(symbol_77);
		symbol_330.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1003 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1003.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1004 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1004.setFormal(symbol_148);	
				symbol_1004.setActual(symbol_77);	
				symbol_1003.getParameterSubstitutions().add(symbol_1004);
			}
			symbol_330.getTemplateBindings().add(symbol_1003);
		}
		symbol_330.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_330); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_331.setName("UniqueCollection");
		symbol_331.setElementType(symbol_88);
		symbol_331.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1005 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1005.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1006 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1006.setFormal(symbol_148);	
				symbol_1006.setActual(symbol_88);	
				symbol_1005.getParameterSubstitutions().add(symbol_1006);
			}
			symbol_331.getTemplateBindings().add(symbol_1005);
		}
		symbol_331.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_150.getOwnedTypes().add(symbol_331); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_332.setName("UniqueCollection");
		symbol_332.setElementType(symbol_88);
		symbol_332.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1007 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1007.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1008 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1008.setFormal(symbol_148);	
				symbol_1008.setActual(symbol_88);	
				symbol_1007.getParameterSubstitutions().add(symbol_1008);
			}
			symbol_332.getTemplateBindings().add(symbol_1007);
		}
		symbol_332.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_150.getOwnedTypes().add(symbol_332); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_333.setName("UniqueCollection");
		symbol_333.setElementType(symbol_88);
		symbol_333.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1009 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1009.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1010 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1010.setFormal(symbol_148);	
				symbol_1010.setActual(symbol_88);	
				symbol_1009.getParameterSubstitutions().add(symbol_1010);
			}
			symbol_333.getTemplateBindings().add(symbol_1009);
		}
		symbol_333.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_150.getOwnedTypes().add(symbol_333); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_334.setName("UniqueCollection");
		symbol_334.setElementType(symbol_88);
		symbol_334.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1011 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1011.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1012 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1012.setFormal(symbol_148);	
				symbol_1012.setActual(symbol_88);	
				symbol_1011.getParameterSubstitutions().add(symbol_1012);
			}
			symbol_334.getTemplateBindings().add(symbol_1011);
		}
		symbol_334.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_150.getOwnedTypes().add(symbol_334); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_335.setName("UniqueCollection");
		symbol_335.setElementType(symbol_110);
		symbol_335.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1013 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1013.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1014 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1014.setFormal(symbol_148);	
				symbol_1014.setActual(symbol_110);	
				symbol_1013.getParameterSubstitutions().add(symbol_1014);
			}
			symbol_335.getTemplateBindings().add(symbol_1013);
		}
		symbol_335.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_335); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_336.setName("UniqueCollection");
		symbol_336.setElementType(symbol_110);
		symbol_336.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1015 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1015.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1016 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1016.setFormal(symbol_148);	
				symbol_1016.setActual(symbol_110);	
				symbol_1015.getParameterSubstitutions().add(symbol_1016);
			}
			symbol_336.getTemplateBindings().add(symbol_1015);
		}
		symbol_336.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_336); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_337.setName("UniqueCollection");
		symbol_337.setElementType(symbol_110);
		symbol_337.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1017 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1017.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1018 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1018.setFormal(symbol_148);	
				symbol_1018.setActual(symbol_110);	
				symbol_1017.getParameterSubstitutions().add(symbol_1018);
			}
			symbol_337.getTemplateBindings().add(symbol_1017);
		}
		symbol_337.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_337); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_338.setName("UniqueCollection");
		symbol_338.setElementType(symbol_110);
		symbol_338.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1019 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1019.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1020 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1020.setFormal(symbol_148);	
				symbol_1020.setActual(symbol_110);	
				symbol_1019.getParameterSubstitutions().add(symbol_1020);
			}
			symbol_338.getTemplateBindings().add(symbol_1019);
		}
		symbol_338.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_338); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_339.setName("UniqueCollection");
		symbol_339.setElementType(symbol_110);
		symbol_339.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1021 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1021.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1022 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1022.setFormal(symbol_148);	
				symbol_1022.setActual(symbol_110);	
				symbol_1021.getParameterSubstitutions().add(symbol_1022);
			}
			symbol_339.getTemplateBindings().add(symbol_1021);
		}
		symbol_339.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_339); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_340.setName("UniqueCollection");
		symbol_340.setElementType(symbol_110);
		symbol_340.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1023 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1023.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1024 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1024.setFormal(symbol_148);	
				symbol_1024.setActual(symbol_110);	
				symbol_1023.getParameterSubstitutions().add(symbol_1024);
			}
			symbol_340.getTemplateBindings().add(symbol_1023);
		}
		symbol_340.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_150.getOwnedTypes().add(symbol_340); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_341.setName("UniqueCollection");
		symbol_341.setElementType(symbol_118);
		symbol_341.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1025 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1025.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1026 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1026.setFormal(symbol_148);	
				symbol_1026.setActual(symbol_118);	
				symbol_1025.getParameterSubstitutions().add(symbol_1026);
			}
			symbol_341.getTemplateBindings().add(symbol_1025);
		}
		symbol_341.getSuperClasses().add(symbol_233); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_341); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_342.setName("UniqueCollection");
		symbol_342.setElementType(symbol_118);
		symbol_342.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1027 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1027.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1028 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1028.setFormal(symbol_148);	
				symbol_1028.setActual(symbol_118);	
				symbol_1027.getParameterSubstitutions().add(symbol_1028);
			}
			symbol_342.getTemplateBindings().add(symbol_1027);
		}
		symbol_342.getSuperClasses().add(symbol_234); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_342); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_343.setName("UniqueCollection");
		symbol_343.setElementType(symbol_131);
		symbol_343.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1029 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1029.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1030 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1030.setFormal(symbol_148);	
				symbol_1030.setActual(symbol_131);	
				symbol_1029.getParameterSubstitutions().add(symbol_1030);
			}
			symbol_343.getTemplateBindings().add(symbol_1029);
		}
		symbol_343.getSuperClasses().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		symbol_150.getOwnedTypes().add(symbol_343); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_344.setName("UniqueCollection");
		symbol_344.setElementType(symbol_128);
		symbol_344.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1031 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1031.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1032 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1032.setFormal(symbol_148);	
				symbol_1032.setActual(symbol_128);	
				symbol_1031.getParameterSubstitutions().add(symbol_1032);
			}
			symbol_344.getTemplateBindings().add(symbol_1031);
		}
		symbol_344.getSuperClasses().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_150.getOwnedTypes().add(symbol_344); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_345.setName("UniqueCollection");
		symbol_345.setElementType(symbol_128);
		symbol_345.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1033 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1033.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1034 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1034.setFormal(symbol_148);	
				symbol_1034.setActual(symbol_128);	
				symbol_1033.getParameterSubstitutions().add(symbol_1034);
			}
			symbol_345.getTemplateBindings().add(symbol_1033);
		}
		symbol_345.getSuperClasses().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_150.getOwnedTypes().add(symbol_345); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_346.setName("UniqueCollection");
		symbol_346.setElementType(symbol_128);
		symbol_346.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1035 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1035.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1036 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1036.setFormal(symbol_148);	
				symbol_1036.setActual(symbol_128);	
				symbol_1035.getParameterSubstitutions().add(symbol_1036);
			}
			symbol_346.getTemplateBindings().add(symbol_1035);
		}
		symbol_346.getSuperClasses().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_150.getOwnedTypes().add(symbol_346); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_347.setName("UniqueCollection");
		symbol_347.setElementType(symbol_145);
		symbol_347.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1037 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1037.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1038 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1038.setFormal(symbol_148);	
				symbol_1038.setActual(symbol_145);	
				symbol_1037.getParameterSubstitutions().add(symbol_1038);
			}
			symbol_347.getTemplateBindings().add(symbol_1037);
		}
		symbol_347.getSuperClasses().add(symbol_240); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		symbol_150.getOwnedTypes().add(symbol_347); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_348.setName("UniqueCollection");
		symbol_348.setElementType(symbol_142);
		symbol_348.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1039 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1039.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1040 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1040.setFormal(symbol_148);	
				symbol_1040.setActual(symbol_142);	
				symbol_1039.getParameterSubstitutions().add(symbol_1040);
			}
			symbol_348.getTemplateBindings().add(symbol_1039);
		}
		symbol_348.getSuperClasses().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		symbol_150.getOwnedTypes().add(symbol_348); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_349.setName("UniqueCollection");
		symbol_349.setElementType(symbol_149);
		symbol_349.setUnspecializedElement(symbol_146);
		{
			TemplateBinding symbol_1041 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1041.setSignature(symbol_147);
			{
				TemplateParameterSubstitution symbol_1042 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1042.setFormal(symbol_148);	
				symbol_1042.setActual(symbol_149);	
				symbol_1041.getParameterSubstitutions().add(symbol_1042);
			}
			symbol_349.getTemplateBindings().add(symbol_1041);
		}
		symbol_349.getSuperClasses().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_150.getOwnedTypes().add(symbol_349); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::$$ http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		//
		symbol_350.setName("$$");
		symbol_150.getOwnedTypes().add(symbol_350); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		symbol_0.getNestedPackages().add(symbol_150);
		return symbol_0;
	}
}
