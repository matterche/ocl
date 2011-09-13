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
package	org.eclipse.ocl.examples.library.oclstdlib;

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
		Library symbol_1 = PivotFactory.eINSTANCE.createLibrary(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib
		Precedence symbol_2 = PivotFactory.eINSTANCE.createPrecedence(); // NAVIGATION
		Precedence symbol_3 = PivotFactory.eINSTANCE.createPrecedence(); // UNARY
		Precedence symbol_4 = PivotFactory.eINSTANCE.createPrecedence(); // MULTIPLICATIVE
		Precedence symbol_5 = PivotFactory.eINSTANCE.createPrecedence(); // ADDITIVE
		Precedence symbol_6 = PivotFactory.eINSTANCE.createPrecedence(); // RELATIONAL
		Precedence symbol_7 = PivotFactory.eINSTANCE.createPrecedence(); // EQUALITY
		Precedence symbol_8 = PivotFactory.eINSTANCE.createPrecedence(); // AND
		Precedence symbol_9 = PivotFactory.eINSTANCE.createPrecedence(); // OR
		Precedence symbol_10 = PivotFactory.eINSTANCE.createPrecedence(); // XOR
		Precedence symbol_11 = PivotFactory.eINSTANCE.createPrecedence(); // IMPLIES
		PrimitiveType symbol_12 = PivotFactory.eINSTANCE.createPrimitiveType(); // Boolean
		
		PrimitiveType symbol_13 = PivotFactory.eINSTANCE.createPrimitiveType(); // Integer
		
		PrimitiveType symbol_14 = PivotFactory.eINSTANCE.createPrimitiveType(); // Real
		
		PrimitiveType symbol_15 = PivotFactory.eINSTANCE.createPrimitiveType(); // String
		
		PrimitiveType symbol_16 = PivotFactory.eINSTANCE.createPrimitiveType(); // UnlimitedNatural
		TemplateSignature symbol_17 = PivotFactory.eINSTANCE.createTemplateSignature(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])!
		TypeTemplateParameter symbol_18 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_19 = PivotFactory.eINSTANCE.createClass(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])?TT
		
		
		BagType symbol_20 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
		TemplateSignature symbol_21 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!
		TypeTemplateParameter symbol_22 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_23 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
		
		TemplateSignature symbol_24 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()!
		TypeTemplateParameter symbol_25 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_26 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2
		
		
		Class symbol_27 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		
		ClassifierType symbol_28 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}
		TemplateSignature symbol_29 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}!
		TypeTemplateParameter symbol_30 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_31 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T
		
		
		ClassifierType symbol_32 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier{T}
		TemplateSignature symbol_33 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier{T}!
		TypeTemplateParameter symbol_34 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_35 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier{T}?T
		
		
		ClassifierType symbol_36 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}
		TemplateSignature symbol_37 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}!
		TypeTemplateParameter symbol_38 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_39 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T
		TypeTemplateParameter symbol_40 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_41 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?E
		
		Property symbol_42 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}!elementType // ocl::CollectionClassifier::elementType http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}!elementType
		
		CollectionType symbol_43 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
		TemplateSignature symbol_44 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!
		TypeTemplateParameter symbol_45 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_46 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
		
		TemplateSignature symbol_47 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_48 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_49 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_50 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_51 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_52 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_53 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!
		TypeTemplateParameter symbol_54 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_55 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
		
		TemplateSignature symbol_56 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()!
		TypeTemplateParameter symbol_57 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_58 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2
		
		TemplateSignature symbol_59 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!
		TypeTemplateParameter symbol_60 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_61 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
		
		TemplateSignature symbol_62 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)!
		TypeTemplateParameter symbol_63 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_64 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)?Tacc
		
		TemplateSignature symbol_65 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!
		TypeTemplateParameter symbol_66 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_67 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
		
		
		Class symbol_68 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Comparable
		
		Class symbol_69 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration
		
		ClassifierType symbol_70 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}
		TemplateSignature symbol_71 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}!
		TypeTemplateParameter symbol_72 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_73 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T
		
		Property symbol_74 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}!ownedLiteral // ocl::EnumerationClassifier::ownedLiteral http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}!ownedLiteral
		
		Class symbol_75 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		
		CollectionType symbol_76 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}
		TemplateSignature symbol_77 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!
		TypeTemplateParameter symbol_78 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_79 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T
		
		TemplateSignature symbol_80 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_81 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_82 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_83 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_84 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_85 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		
		CollectionType symbol_86 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}
		TemplateSignature symbol_87 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}!
		TypeTemplateParameter symbol_88 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_89 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T
		
		
		AnyType symbol_90 = PivotFactory.eINSTANCE.createAnyType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		TemplateSignature symbol_91 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])!
		TypeTemplateParameter symbol_92 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_93 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])?TT
		
		TemplateSignature symbol_94 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])!
		TypeTemplateParameter symbol_95 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_96 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])?T
		
		TemplateSignature symbol_97 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])!
		TypeTemplateParameter symbol_98 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_99 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])?T
		
		
		Class symbol_100 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		TemplateSignature symbol_101 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()!
		TypeTemplateParameter symbol_102 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_103 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()?U
		
		TemplateSignature symbol_104 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()!
		TypeTemplateParameter symbol_105 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_106 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U
		
		
		InvalidType symbol_107 = PivotFactory.eINSTANCE.createInvalidType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
		Property symbol_108 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!oclBadProperty // ocl::OclInvalid::oclBadProperty http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!oclBadProperty
		
		Class symbol_109 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		
		Class symbol_110 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		
		SelfType symbol_111 = PivotFactory.eINSTANCE.createSelfType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
		
		Class symbol_112 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
		
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
		
		
		Class symbol_146 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Summable
		
		CollectionType symbol_147 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
		TemplateSignature symbol_148 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!
		TypeTemplateParameter symbol_149 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_150 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T
		
		
		Package symbol_151 = PivotFactory.eINSTANCE.createPackage(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0
		LambdaType symbol_152 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		
		LambdaType symbol_153 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		
		LambdaType symbol_154 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_155 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_156 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_157 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_158 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_159 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_160 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_161 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		
		LambdaType symbol_162 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_163 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_164 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_165 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_166 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_167 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_168 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
		
		LambdaType symbol_169 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		LambdaType symbol_170 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_171 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_172 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
		
		LambdaType symbol_173 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		
		LambdaType symbol_174 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		
		LambdaType symbol_175 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		
		LambdaType symbol_176 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		
		LambdaType symbol_177 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		
		LambdaType symbol_178 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		
		LambdaType symbol_179 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		
		TupleType symbol_180 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_181 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_182 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		TupleType symbol_183 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_184 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_185 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		TupleType symbol_186 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_187 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_188 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		TupleType symbol_189 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		Property symbol_190 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first // ocl::$$::Tuple::first Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!first
		Property symbol_191 = PivotFactory.eINSTANCE.createProperty(); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second // ocl::$$::Tuple::second Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}!second
		
		BagType symbol_192 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		BagType symbol_193 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		BagType symbol_194 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		BagType symbol_195 = PivotFactory.eINSTANCE.createBagType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		ClassifierType symbol_196 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		ClassifierType symbol_197 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])?TT]
		
		ClassifierType symbol_198 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		
		ClassifierType symbol_199 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		
		ClassifierType symbol_200 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		
		ClassifierType symbol_201 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])?TT]
		
		ClassifierType symbol_202 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])?T]
		
		ClassifierType symbol_203 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])?T]
		
		ClassifierType symbol_204 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()?U]
		
		ClassifierType symbol_205 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		
		ClassifierType symbol_206 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		
		ClassifierType symbol_207 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		
		ClassifierType symbol_208 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		
		ClassifierType symbol_209 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		ClassifierType symbol_210 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_211 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		
		CollectionType symbol_212 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_213 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_214 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		CollectionType symbol_215 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_216 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		CollectionType symbol_217 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		CollectionType symbol_218 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_219 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		
		CollectionType symbol_220 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
		
		CollectionType symbol_221 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		
		CollectionType symbol_222 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		
		CollectionType symbol_223 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_224 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_225 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_226 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		CollectionType symbol_227 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_228 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_229 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_230 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		
		CollectionType symbol_231 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_232 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_233 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_234 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_235 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_236 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_237 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_238 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_239 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		CollectionType symbol_240 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_241 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_242 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_243 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		ClassifierType symbol_244 = PivotFactory.eINSTANCE.createClassifierType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_245 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_246 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_247 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		CollectionType symbol_248 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_249 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		CollectionType symbol_250 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		CollectionType symbol_251 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_252 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_253 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_254 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_255 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_256 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_257 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_258 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_259 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_260 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_261 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_262 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_263 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_264 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_265 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_266 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_267 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_268 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_269 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_270 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_271 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_272 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_273 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_274 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[String]
		
		CollectionType symbol_275 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		
		CollectionType symbol_276 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		
		CollectionType symbol_277 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_278 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_279 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_280 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_281 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_282 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_283 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_284 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		
		CollectionType symbol_285 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_286 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_287 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		CollectionType symbol_288 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_289 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[String]
		
		CollectionType symbol_290 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_291 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		CollectionType symbol_292 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		
		CollectionType symbol_293 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_294 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_295 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_296 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_297 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_298 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		CollectionType symbol_299 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		
		CollectionType symbol_300 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		OrderedSetType symbol_301 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		OrderedSetType symbol_302 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		OrderedSetType symbol_303 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		OrderedSetType symbol_304 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		OrderedSetType symbol_305 = PivotFactory.eINSTANCE.createOrderedSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		SequenceType symbol_306 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
		
		SequenceType symbol_307 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		SequenceType symbol_308 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		
		SequenceType symbol_309 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		SequenceType symbol_310 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		SequenceType symbol_311 = PivotFactory.eINSTANCE.createSequenceType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		
		SetType symbol_312 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		SetType symbol_313 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		SetType symbol_314 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		SetType symbol_315 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		SetType symbol_316 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		SetType symbol_317 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		SetType symbol_318 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		SetType symbol_319 = PivotFactory.eINSTANCE.createSetType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_320 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_321 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		
		CollectionType symbol_322 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		CollectionType symbol_323 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		
		CollectionType symbol_324 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		
		CollectionType symbol_325 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		
		CollectionType symbol_326 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_327 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_328 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_329 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_330 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_331 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		
		CollectionType symbol_332 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_333 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_334 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_335 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		
		CollectionType symbol_336 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_337 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_338 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_339 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_340 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_341 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		
		CollectionType symbol_342 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_343 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		
		CollectionType symbol_344 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_345 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_346 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_347 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		
		CollectionType symbol_348 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_349 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		
		CollectionType symbol_350 = PivotFactory.eINSTANCE.createCollectionType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		
		AnyType symbol_351 = PivotFactory.eINSTANCE.createAnyType(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		
		

		symbol_1.setName("ocl");
		symbol_1.setNsPrefix("ocl");
		symbol_1.setNsURI("http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib");
		symbol_2.setName("NAVIGATION");
		symbol_2.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_2);
		symbol_3.setName("UNARY");
		symbol_3.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_3);
		symbol_4.setName("MULTIPLICATIVE");
		symbol_4.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_4);
		symbol_5.setName("ADDITIVE");
		symbol_5.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_5);
		symbol_6.setName("RELATIONAL");
		symbol_6.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_6);
		symbol_7.setName("EQUALITY");
		symbol_7.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_7);
		symbol_8.setName("AND");
		symbol_8.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_8);
		symbol_9.setName("OR");
		symbol_9.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_9);
		symbol_10.setName("XOR");
		symbol_10.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_10);
		symbol_11.setName("IMPLIES");
		symbol_11.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_11);
		//
		// ocl::Boolean Boolean
		//
		symbol_12.setName("Boolean");
		symbol_12.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Boolean::<>()
			Operation symbol_352 = PivotFactory.eINSTANCE.createOperation(); // Boolean!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_352.setName("<>");
			symbol_352.setType(symbol_12);  // Boolean
			
			Parameter symbol_353 = PivotFactory.eINSTANCE.createParameter(); // Boolean!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_353.setName("object2");
			symbol_353.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_352.getOwnedParameters().add(symbol_353);
			symbol_352.setPrecedence(symbol_7);
			symbol_352.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_352.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_352);
		}
		{	// ocl::Boolean::=()
			Operation symbol_354 = PivotFactory.eINSTANCE.createOperation(); // Boolean!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_354.setName("=");
			symbol_354.setType(symbol_12);  // Boolean
			
			Parameter symbol_355 = PivotFactory.eINSTANCE.createParameter(); // Boolean!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_355.setName("object2");
			symbol_355.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_354.getOwnedParameters().add(symbol_355);
			symbol_354.setPrecedence(symbol_7);
			symbol_354.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_354.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_354);
		}
		{	// ocl::Boolean::allInstances()
			Operation symbol_356 = PivotFactory.eINSTANCE.createOperation(); // Boolean!allInstances()
			symbol_356.setName("allInstances");
			symbol_356.setType(symbol_317);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_356.setIsStatic(true);
			symbol_356.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation");
			symbol_356.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_356);
		}
		{	// ocl::Boolean::and()
			Operation symbol_357 = PivotFactory.eINSTANCE.createOperation(); // Boolean!and(Boolean)
			symbol_357.setName("and");
			symbol_357.setType(symbol_12);  // Boolean
			
			Parameter symbol_358 = PivotFactory.eINSTANCE.createParameter(); // Boolean!and(Boolean)!b
			symbol_358.setName("b");
			symbol_358.setType(symbol_12);  // Boolean
			
			symbol_357.getOwnedParameters().add(symbol_358);
			symbol_357.setPrecedence(symbol_8);
			symbol_357.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanAndOperation");
			symbol_357.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_357);
		}
		{	// ocl::Boolean::implies()
			Operation symbol_359 = PivotFactory.eINSTANCE.createOperation(); // Boolean!implies(Boolean)
			symbol_359.setName("implies");
			symbol_359.setType(symbol_12);  // Boolean
			
			Parameter symbol_360 = PivotFactory.eINSTANCE.createParameter(); // Boolean!implies(Boolean)!b
			symbol_360.setName("b");
			symbol_360.setType(symbol_12);  // Boolean
			
			symbol_359.getOwnedParameters().add(symbol_360);
			symbol_359.setPrecedence(symbol_11);
			symbol_359.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation");
			symbol_359.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_359);
		}
		{	// ocl::Boolean::not()
			Operation symbol_361 = PivotFactory.eINSTANCE.createOperation(); // Boolean!not()
			symbol_361.setName("not");
			symbol_361.setType(symbol_12);  // Boolean
			
			symbol_361.setPrecedence(symbol_3);
			symbol_361.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanNotOperation");
			symbol_361.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_361);
		}
		{	// ocl::Boolean::or()
			Operation symbol_362 = PivotFactory.eINSTANCE.createOperation(); // Boolean!or(Boolean)
			symbol_362.setName("or");
			symbol_362.setType(symbol_12);  // Boolean
			
			Parameter symbol_363 = PivotFactory.eINSTANCE.createParameter(); // Boolean!or(Boolean)!b
			symbol_363.setName("b");
			symbol_363.setType(symbol_12);  // Boolean
			
			symbol_362.getOwnedParameters().add(symbol_363);
			symbol_362.setPrecedence(symbol_9);
			symbol_362.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanOrOperation");
			symbol_362.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_362);
		}
		{	// ocl::Boolean::toString()
			Operation symbol_364 = PivotFactory.eINSTANCE.createOperation(); // Boolean!toString()
			symbol_364.setName("toString");
			symbol_364.setType(symbol_15);  // String
			
			symbol_364.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_364.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_364);
		}
		{	// ocl::Boolean::xor()
			Operation symbol_365 = PivotFactory.eINSTANCE.createOperation(); // Boolean!xor(Boolean)
			symbol_365.setName("xor");
			symbol_365.setType(symbol_12);  // Boolean
			
			Parameter symbol_366 = PivotFactory.eINSTANCE.createParameter(); // Boolean!xor(Boolean)!b
			symbol_366.setName("b");
			symbol_366.setType(symbol_12);  // Boolean
			
			symbol_365.getOwnedParameters().add(symbol_366);
			symbol_365.setPrecedence(symbol_10);
			symbol_365.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanXorOperation");
			symbol_365.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_365);
		}
		symbol_1.getOwnedTypes().add(symbol_12); // Boolean
		//
		// ocl::Integer Integer
		//
		symbol_13.setName("Integer");
		symbol_13.getSuperClasses().add(symbol_14); // Real
		{	// ocl::Integer::*()
			Operation symbol_367 = PivotFactory.eINSTANCE.createOperation(); // Integer!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_367.setName("*");
			symbol_367.setType(symbol_13);  // Integer
			
			Parameter symbol_368 = PivotFactory.eINSTANCE.createParameter(); // Integer!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_368.setName("i");
			symbol_368.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_367.getOwnedParameters().add(symbol_368);
			symbol_367.setPrecedence(symbol_4);
			symbol_367.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericTimesOperation");
			symbol_367.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_367);
		}
		{	// ocl::Integer::+()
			Operation symbol_369 = PivotFactory.eINSTANCE.createOperation(); // Integer!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_369.setName("+");
			symbol_369.setType(symbol_13);  // Integer
			
			Parameter symbol_370 = PivotFactory.eINSTANCE.createParameter(); // Integer!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_370.setName("i");
			symbol_370.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_369.getOwnedParameters().add(symbol_370);
			symbol_369.setPrecedence(symbol_5);
			symbol_369.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerPlusOperation");
			symbol_369.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerPlusOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_369);
		}
		{	// ocl::Integer::-()
			Operation symbol_371 = PivotFactory.eINSTANCE.createOperation(); // Integer!-()
			symbol_371.setName("-");
			symbol_371.setType(symbol_13);  // Integer
			
			symbol_371.setPrecedence(symbol_3);
			symbol_371.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericNegateOperation");
			symbol_371.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_371);
		}
		{	// ocl::Integer::-()
			Operation symbol_372 = PivotFactory.eINSTANCE.createOperation(); // Integer!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_372.setName("-");
			symbol_372.setType(symbol_13);  // Integer
			
			Parameter symbol_373 = PivotFactory.eINSTANCE.createParameter(); // Integer!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_373.setName("i");
			symbol_373.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_372.getOwnedParameters().add(symbol_373);
			symbol_372.setPrecedence(symbol_5);
			symbol_372.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerMinusOperation");
			symbol_372.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerMinusOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_372);
		}
		{	// ocl::Integer::/()
			Operation symbol_374 = PivotFactory.eINSTANCE.createOperation(); // Integer!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_374.setName("/");
			symbol_374.setType(symbol_14);  // Real
			
			Parameter symbol_375 = PivotFactory.eINSTANCE.createParameter(); // Integer!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_375.setName("i");
			symbol_375.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_374.getOwnedParameters().add(symbol_375);
			symbol_374.setPrecedence(symbol_4);
			symbol_374.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivideOperation");
			symbol_374.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_374);
		}
		{	// ocl::Integer::abs()
			Operation symbol_376 = PivotFactory.eINSTANCE.createOperation(); // Integer!abs()
			symbol_376.setName("abs");
			symbol_376.setType(symbol_13);  // Integer
			
			symbol_376.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericAbsOperation");
			symbol_376.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_376);
		}
		{	// ocl::Integer::div()
			Operation symbol_377 = PivotFactory.eINSTANCE.createOperation(); // Integer!div(Integer)
			symbol_377.setName("div");
			symbol_377.setType(symbol_13);  // Integer
			
			Parameter symbol_378 = PivotFactory.eINSTANCE.createParameter(); // Integer!div(Integer)!i
			symbol_378.setName("i");
			symbol_378.setType(symbol_13);  // Integer
			
			symbol_377.getOwnedParameters().add(symbol_378);
			symbol_377.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivOperation");
			symbol_377.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_377);
		}
		{	// ocl::Integer::max()
			Operation symbol_379 = PivotFactory.eINSTANCE.createOperation(); // Integer!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_379.setName("max");
			symbol_379.setType(symbol_13);  // Integer
			
			Parameter symbol_380 = PivotFactory.eINSTANCE.createParameter(); // Integer!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_380.setName("i");
			symbol_380.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_379.getOwnedParameters().add(symbol_380);
			symbol_379.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMaxOperation");
			symbol_379.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_379);
		}
		{	// ocl::Integer::min()
			Operation symbol_381 = PivotFactory.eINSTANCE.createOperation(); // Integer!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_381.setName("min");
			symbol_381.setType(symbol_13);  // Integer
			
			Parameter symbol_382 = PivotFactory.eINSTANCE.createParameter(); // Integer!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!i
			symbol_382.setName("i");
			symbol_382.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_381.getOwnedParameters().add(symbol_382);
			symbol_381.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMinOperation");
			symbol_381.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_381);
		}
		{	// ocl::Integer::mod()
			Operation symbol_383 = PivotFactory.eINSTANCE.createOperation(); // Integer!mod(Integer)
			symbol_383.setName("mod");
			symbol_383.setType(symbol_13);  // Integer
			
			Parameter symbol_384 = PivotFactory.eINSTANCE.createParameter(); // Integer!mod(Integer)!i
			symbol_384.setName("i");
			symbol_384.setType(symbol_13);  // Integer
			
			symbol_383.getOwnedParameters().add(symbol_384);
			symbol_383.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericModOperation");
			symbol_383.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_383);
		}
		{	// ocl::Integer::toString()
			Operation symbol_385 = PivotFactory.eINSTANCE.createOperation(); // Integer!toString()
			symbol_385.setName("toString");
			symbol_385.setType(symbol_15);  // String
			
			symbol_385.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_385.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_385);
		}
		symbol_1.getOwnedTypes().add(symbol_13); // Integer
		//
		// ocl::Real Real
		//
		symbol_14.setName("Real");
		symbol_14.getSuperClasses().add(symbol_68); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Comparable
		symbol_14.getSuperClasses().add(symbol_146); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Summable
		{	// ocl::Real::*()
			Operation symbol_386 = PivotFactory.eINSTANCE.createOperation(); // Real!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_386.setName("*");
			symbol_386.setType(symbol_14);  // Real
			
			Parameter symbol_387 = PivotFactory.eINSTANCE.createParameter(); // Real!*(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_387.setName("r");
			symbol_387.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_386.getOwnedParameters().add(symbol_387);
			symbol_386.setPrecedence(symbol_4);
			symbol_386.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericTimesOperation");
			symbol_386.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_386);
		}
		{	// ocl::Real::+()
			Operation symbol_388 = PivotFactory.eINSTANCE.createOperation(); // Real!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_388.setName("+");
			symbol_388.setType(symbol_14);  // Real
			
			Parameter symbol_389 = PivotFactory.eINSTANCE.createParameter(); // Real!+(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_389.setName("r");
			symbol_389.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_388.getOwnedParameters().add(symbol_389);
			symbol_388.setPrecedence(symbol_5);
			symbol_388.setImplementationClass("org.eclipse.ocl.examples.library.real.RealPlusOperation");
			symbol_388.setImplementation(org.eclipse.ocl.examples.library.real.RealPlusOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_388);
		}
		{	// ocl::Real::-()
			Operation symbol_390 = PivotFactory.eINSTANCE.createOperation(); // Real!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_390.setName("-");
			symbol_390.setType(symbol_14);  // Real
			
			Parameter symbol_391 = PivotFactory.eINSTANCE.createParameter(); // Real!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_391.setName("r");
			symbol_391.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_390.getOwnedParameters().add(symbol_391);
			symbol_390.setPrecedence(symbol_5);
			symbol_390.setImplementationClass("org.eclipse.ocl.examples.library.real.RealMinusOperation");
			symbol_390.setImplementation(org.eclipse.ocl.examples.library.real.RealMinusOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_390);
		}
		{	// ocl::Real::-()
			Operation symbol_392 = PivotFactory.eINSTANCE.createOperation(); // Real!-()
			symbol_392.setName("-");
			symbol_392.setType(symbol_14);  // Real
			
			symbol_392.setPrecedence(symbol_3);
			symbol_392.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericNegateOperation");
			symbol_392.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_392);
		}
		{	// ocl::Real::/()
			Operation symbol_393 = PivotFactory.eINSTANCE.createOperation(); // Real!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_393.setName("/");
			symbol_393.setType(symbol_14);  // Real
			
			Parameter symbol_394 = PivotFactory.eINSTANCE.createParameter(); // Real!/(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_394.setName("r");
			symbol_394.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_393.getOwnedParameters().add(symbol_394);
			symbol_393.setPrecedence(symbol_4);
			symbol_393.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivideOperation");
			symbol_393.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_393);
		}
		{	// ocl::Real::<()
			Operation symbol_395 = PivotFactory.eINSTANCE.createOperation(); // Real!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_395.setName("<");
			symbol_395.setType(symbol_12);  // Boolean
			
			Parameter symbol_396 = PivotFactory.eINSTANCE.createParameter(); // Real!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_396.setName("r");
			symbol_396.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_395.getOwnedParameters().add(symbol_396);
			symbol_395.setPrecedence(symbol_6);
			symbol_395.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation");
			symbol_395.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_395);
		}
		{	// ocl::Real::<=()
			Operation symbol_397 = PivotFactory.eINSTANCE.createOperation(); // Real!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_397.setName("<=");
			symbol_397.setType(symbol_12);  // Boolean
			
			Parameter symbol_398 = PivotFactory.eINSTANCE.createParameter(); // Real!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_398.setName("r");
			symbol_398.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_397.getOwnedParameters().add(symbol_398);
			symbol_397.setPrecedence(symbol_6);
			symbol_397.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation");
			symbol_397.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_397);
		}
		{	// ocl::Real::<>()
			Operation symbol_399 = PivotFactory.eINSTANCE.createOperation(); // Real!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_399.setName("<>");
			symbol_399.setType(symbol_12);  // Boolean
			
			Parameter symbol_400 = PivotFactory.eINSTANCE.createParameter(); // Real!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_400.setName("object2");
			symbol_400.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_399.getOwnedParameters().add(symbol_400);
			symbol_399.setPrecedence(symbol_7);
			symbol_399.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_399.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_399);
		}
		{	// ocl::Real::=()
			Operation symbol_401 = PivotFactory.eINSTANCE.createOperation(); // Real!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_401.setName("=");
			symbol_401.setType(symbol_12);  // Boolean
			
			Parameter symbol_402 = PivotFactory.eINSTANCE.createParameter(); // Real!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_402.setName("object2");
			symbol_402.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_401.getOwnedParameters().add(symbol_402);
			symbol_401.setPrecedence(symbol_7);
			symbol_401.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_401.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_401);
		}
		{	// ocl::Real::>()
			Operation symbol_403 = PivotFactory.eINSTANCE.createOperation(); // Real!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_403.setName(">");
			symbol_403.setType(symbol_12);  // Boolean
			
			Parameter symbol_404 = PivotFactory.eINSTANCE.createParameter(); // Real!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_404.setName("r");
			symbol_404.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_403.getOwnedParameters().add(symbol_404);
			symbol_403.setPrecedence(symbol_6);
			symbol_403.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation");
			symbol_403.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_403);
		}
		{	// ocl::Real::>=()
			Operation symbol_405 = PivotFactory.eINSTANCE.createOperation(); // Real!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_405.setName(">=");
			symbol_405.setType(symbol_12);  // Boolean
			
			Parameter symbol_406 = PivotFactory.eINSTANCE.createParameter(); // Real!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_406.setName("r");
			symbol_406.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_405.getOwnedParameters().add(symbol_406);
			symbol_405.setPrecedence(symbol_6);
			symbol_405.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation");
			symbol_405.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_405);
		}
		{	// ocl::Real::abs()
			Operation symbol_407 = PivotFactory.eINSTANCE.createOperation(); // Real!abs()
			symbol_407.setName("abs");
			symbol_407.setType(symbol_14);  // Real
			
			symbol_407.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericAbsOperation");
			symbol_407.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_407);
		}
		{	// ocl::Real::floor()
			Operation symbol_408 = PivotFactory.eINSTANCE.createOperation(); // Real!floor()
			symbol_408.setName("floor");
			symbol_408.setType(symbol_13);  // Integer
			
			symbol_408.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericFloorOperation");
			symbol_408.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_408);
		}
		{	// ocl::Real::max()
			Operation symbol_409 = PivotFactory.eINSTANCE.createOperation(); // Real!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_409.setName("max");
			symbol_409.setType(symbol_14);  // Real
			
			Parameter symbol_410 = PivotFactory.eINSTANCE.createParameter(); // Real!max(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_410.setName("r");
			symbol_410.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_409.getOwnedParameters().add(symbol_410);
			symbol_409.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMaxOperation");
			symbol_409.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_409);
		}
		{	// ocl::Real::min()
			Operation symbol_411 = PivotFactory.eINSTANCE.createOperation(); // Real!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_411.setName("min");
			symbol_411.setType(symbol_14);  // Real
			
			Parameter symbol_412 = PivotFactory.eINSTANCE.createParameter(); // Real!min(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!r
			symbol_412.setName("r");
			symbol_412.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_411.getOwnedParameters().add(symbol_412);
			symbol_411.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMinOperation");
			symbol_411.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_411);
		}
		{	// ocl::Real::round()
			Operation symbol_413 = PivotFactory.eINSTANCE.createOperation(); // Real!round()
			symbol_413.setName("round");
			symbol_413.setType(symbol_13);  // Integer
			
			symbol_413.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericRoundOperation");
			symbol_413.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_413);
		}
		{	// ocl::Real::toString()
			Operation symbol_414 = PivotFactory.eINSTANCE.createOperation(); // Real!toString()
			symbol_414.setName("toString");
			symbol_414.setType(symbol_15);  // String
			
			symbol_414.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_414.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_14.getOwnedOperations().add(symbol_414);
		}
		symbol_1.getOwnedTypes().add(symbol_14); // Real
		//
		// ocl::String String
		//
		symbol_15.setName("String");
		symbol_15.getSuperClasses().add(symbol_68); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Comparable
		symbol_15.getSuperClasses().add(symbol_146); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Summable
		{	// ocl::String::+()
			Operation symbol_415 = PivotFactory.eINSTANCE.createOperation(); // String!+(String)
			symbol_415.setName("+");
			symbol_415.setType(symbol_15);  // String
			
			Parameter symbol_416 = PivotFactory.eINSTANCE.createParameter(); // String!+(String)!s
			symbol_416.setName("s");
			symbol_416.setType(symbol_15);  // String
			
			symbol_415.getOwnedParameters().add(symbol_416);
			symbol_415.setPrecedence(symbol_5);
			symbol_415.setImplementationClass("org.eclipse.ocl.examples.library.string.StringConcatOperation");
			symbol_415.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_415);
		}
		{	// ocl::String::<()
			Operation symbol_417 = PivotFactory.eINSTANCE.createOperation(); // String!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_417.setName("<");
			symbol_417.setType(symbol_12);  // Boolean
			
			Parameter symbol_418 = PivotFactory.eINSTANCE.createParameter(); // String!<(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_418.setName("s");
			symbol_418.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_417.getOwnedParameters().add(symbol_418);
			symbol_417.setPrecedence(symbol_6);
			symbol_417.setImplementationClass("org.eclipse.ocl.examples.library.string.StringLessThanOperation");
			symbol_417.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_417);
		}
		{	// ocl::String::<=()
			Operation symbol_419 = PivotFactory.eINSTANCE.createOperation(); // String!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_419.setName("<=");
			symbol_419.setType(symbol_12);  // Boolean
			
			Parameter symbol_420 = PivotFactory.eINSTANCE.createParameter(); // String!<=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_420.setName("s");
			symbol_420.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_419.getOwnedParameters().add(symbol_420);
			symbol_419.setPrecedence(symbol_6);
			symbol_419.setImplementationClass("org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation");
			symbol_419.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_419);
		}
		{	// ocl::String::<>()
			Operation symbol_421 = PivotFactory.eINSTANCE.createOperation(); // String!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_421.setName("<>");
			symbol_421.setType(symbol_12);  // Boolean
			
			Parameter symbol_422 = PivotFactory.eINSTANCE.createParameter(); // String!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_422.setName("object2");
			symbol_422.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_421.getOwnedParameters().add(symbol_422);
			symbol_421.setPrecedence(symbol_7);
			symbol_421.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_421.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_421);
		}
		{	// ocl::String::=()
			Operation symbol_423 = PivotFactory.eINSTANCE.createOperation(); // String!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_423.setName("=");
			symbol_423.setType(symbol_12);  // Boolean
			
			Parameter symbol_424 = PivotFactory.eINSTANCE.createParameter(); // String!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_424.setName("object2");
			symbol_424.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_423.getOwnedParameters().add(symbol_424);
			symbol_423.setPrecedence(symbol_7);
			symbol_423.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_423.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_423);
		}
		{	// ocl::String::>()
			Operation symbol_425 = PivotFactory.eINSTANCE.createOperation(); // String!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_425.setName(">");
			symbol_425.setType(symbol_12);  // Boolean
			
			Parameter symbol_426 = PivotFactory.eINSTANCE.createParameter(); // String!>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_426.setName("s");
			symbol_426.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_425.getOwnedParameters().add(symbol_426);
			symbol_425.setPrecedence(symbol_6);
			symbol_425.setImplementationClass("org.eclipse.ocl.examples.library.string.StringGreaterThanOperation");
			symbol_425.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_425);
		}
		{	// ocl::String::>=()
			Operation symbol_427 = PivotFactory.eINSTANCE.createOperation(); // String!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_427.setName(">=");
			symbol_427.setType(symbol_12);  // Boolean
			
			Parameter symbol_428 = PivotFactory.eINSTANCE.createParameter(); // String!>=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!s
			symbol_428.setName("s");
			symbol_428.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_427.getOwnedParameters().add(symbol_428);
			symbol_427.setPrecedence(symbol_6);
			symbol_427.setImplementationClass("org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation");
			symbol_427.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_427);
		}
		{	// ocl::String::at()
			Operation symbol_429 = PivotFactory.eINSTANCE.createOperation(); // String!at(Integer)
			symbol_429.setName("at");
			symbol_429.setType(symbol_15);  // String
			
			Parameter symbol_430 = PivotFactory.eINSTANCE.createParameter(); // String!at(Integer)!i
			symbol_430.setName("i");
			symbol_430.setType(symbol_13);  // Integer
			
			symbol_429.getOwnedParameters().add(symbol_430);
			symbol_429.setImplementationClass("org.eclipse.ocl.examples.library.string.StringAtOperation");
			symbol_429.setImplementation(org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_429);
		}
		{	// ocl::String::characters()
			Operation symbol_431 = PivotFactory.eINSTANCE.createOperation(); // String!characters()
			symbol_431.setName("characters");
			symbol_431.setType(symbol_306);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
			
			symbol_431.setImplementationClass("org.eclipse.ocl.examples.library.string.StringCharactersOperation");
			symbol_431.setImplementation(org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_431);
		}
		{	// ocl::String::concat()
			Operation symbol_432 = PivotFactory.eINSTANCE.createOperation(); // String!concat(String)
			symbol_432.setName("concat");
			symbol_432.setType(symbol_15);  // String
			
			Parameter symbol_433 = PivotFactory.eINSTANCE.createParameter(); // String!concat(String)!s
			symbol_433.setName("s");
			symbol_433.setType(symbol_15);  // String
			
			symbol_432.getOwnedParameters().add(symbol_433);
			symbol_432.setImplementationClass("org.eclipse.ocl.examples.library.string.StringConcatOperation");
			symbol_432.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_432);
		}
		{	// ocl::String::equalsIgnoreCase()
			Operation symbol_434 = PivotFactory.eINSTANCE.createOperation(); // String!equalsIgnoreCase(String)
			symbol_434.setName("equalsIgnoreCase");
			symbol_434.setType(symbol_12);  // Boolean
			
			Parameter symbol_435 = PivotFactory.eINSTANCE.createParameter(); // String!equalsIgnoreCase(String)!s
			symbol_435.setName("s");
			symbol_435.setType(symbol_15);  // String
			
			symbol_434.getOwnedParameters().add(symbol_435);
			symbol_434.setImplementationClass("org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation");
			symbol_434.setImplementation(org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_434);
		}
		{	// ocl::String::indexOf()
			Operation symbol_436 = PivotFactory.eINSTANCE.createOperation(); // String!indexOf(String)
			symbol_436.setName("indexOf");
			symbol_436.setType(symbol_13);  // Integer
			
			Parameter symbol_437 = PivotFactory.eINSTANCE.createParameter(); // String!indexOf(String)!s
			symbol_437.setName("s");
			symbol_437.setType(symbol_15);  // String
			
			symbol_436.getOwnedParameters().add(symbol_437);
			symbol_436.setImplementationClass("org.eclipse.ocl.examples.library.string.StringIndexOfOperation");
			symbol_436.setImplementation(org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_436);
		}
		{	// ocl::String::size()
			Operation symbol_438 = PivotFactory.eINSTANCE.createOperation(); // String!size()
			symbol_438.setName("size");
			symbol_438.setType(symbol_13);  // Integer
			
			symbol_438.setImplementationClass("org.eclipse.ocl.examples.library.string.StringSizeOperation");
			symbol_438.setImplementation(org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_438);
		}
		{	// ocl::String::substring()
			Operation symbol_439 = PivotFactory.eINSTANCE.createOperation(); // String!substring(Integer,Integer)
			symbol_439.setName("substring");
			symbol_439.setType(symbol_15);  // String
			
			Parameter symbol_440 = PivotFactory.eINSTANCE.createParameter(); // String!substring(Integer,Integer)!lower
			symbol_440.setName("lower");
			symbol_440.setType(symbol_13);  // Integer
			
			symbol_439.getOwnedParameters().add(symbol_440);
			Parameter symbol_441 = PivotFactory.eINSTANCE.createParameter(); // String!substring(Integer,Integer)!upper
			symbol_441.setName("upper");
			symbol_441.setType(symbol_13);  // Integer
			
			symbol_439.getOwnedParameters().add(symbol_441);
			symbol_439.setImplementationClass("org.eclipse.ocl.examples.library.string.StringSubstringOperation");
			symbol_439.setImplementation(org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_439);
		}
		{	// ocl::String::toBoolean()
			Operation symbol_442 = PivotFactory.eINSTANCE.createOperation(); // String!toBoolean()
			symbol_442.setName("toBoolean");
			symbol_442.setType(symbol_12);  // Boolean
			
			symbol_442.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToBooleanOperation");
			symbol_442.setImplementation(org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_442);
		}
		{	// ocl::String::toInteger()
			Operation symbol_443 = PivotFactory.eINSTANCE.createOperation(); // String!toInteger()
			symbol_443.setName("toInteger");
			symbol_443.setType(symbol_13);  // Integer
			
			symbol_443.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToIntegerOperation");
			symbol_443.setImplementation(org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_443);
		}
		{	// ocl::String::toLower()
			Operation symbol_444 = PivotFactory.eINSTANCE.createOperation(); // String!toLower()
			symbol_444.setName("toLower");
			symbol_444.setType(symbol_15);  // String
			
			symbol_444.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation");
			symbol_444.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_444);
		}
		{	// ocl::String::toLowerCase()
			Operation symbol_445 = PivotFactory.eINSTANCE.createOperation(); // String!toLowerCase()
			symbol_445.setName("toLowerCase");
			symbol_445.setType(symbol_15);  // String
			
			symbol_445.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation");
			symbol_445.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_445);
		}
		{	// ocl::String::toReal()
			Operation symbol_446 = PivotFactory.eINSTANCE.createOperation(); // String!toReal()
			symbol_446.setName("toReal");
			symbol_446.setType(symbol_14);  // Real
			
			symbol_446.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToRealOperation");
			symbol_446.setImplementation(org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_446);
		}
		{	// ocl::String::toString()
			Operation symbol_447 = PivotFactory.eINSTANCE.createOperation(); // String!toString()
			symbol_447.setName("toString");
			symbol_447.setType(symbol_15);  // String
			
			symbol_447.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_447.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_447);
		}
		{	// ocl::String::toUpper()
			Operation symbol_448 = PivotFactory.eINSTANCE.createOperation(); // String!toUpper()
			symbol_448.setName("toUpper");
			symbol_448.setType(symbol_15);  // String
			
			symbol_448.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation");
			symbol_448.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_448);
		}
		{	// ocl::String::toUpperCase()
			Operation symbol_449 = PivotFactory.eINSTANCE.createOperation(); // String!toUpperCase()
			symbol_449.setName("toUpperCase");
			symbol_449.setType(symbol_15);  // String
			
			symbol_449.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation");
			symbol_449.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			symbol_15.getOwnedOperations().add(symbol_449);
		}
		symbol_1.getOwnedTypes().add(symbol_15); // String
		//
		// ocl::UnlimitedNatural UnlimitedNatural
		//
		symbol_16.setName("UnlimitedNatural");
		symbol_16.getSuperClasses().add(symbol_13); // Integer
		{	// ocl::UnlimitedNatural::oclAsType()
			Operation symbol_450 = PivotFactory.eINSTANCE.createOperation(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])
			symbol_19.setName("TT");
			symbol_18.setOwnedParameteredElement(symbol_19);
			symbol_17.getOwnedParameters().add(symbol_18);
			
			symbol_450.setOwnedTemplateSignature(symbol_17);
			symbol_450.setName("oclAsType");
			symbol_450.setType(symbol_19);  // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])?TT
			
			Parameter symbol_451 = PivotFactory.eINSTANCE.createParameter(); // UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])!type
			symbol_451.setName("type");
			symbol_451.setType(symbol_197);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])?TT]
			
			symbol_450.getOwnedParameters().add(symbol_451);
			symbol_450.setImplementationClass("org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation");
			symbol_450.setImplementation(org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation.INSTANCE);
			symbol_16.getOwnedOperations().add(symbol_450);
		}
		symbol_1.getOwnedTypes().add(symbol_16); // UnlimitedNatural
		//
		// ocl::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
		//
		symbol_20.setName("Bag");
		symbol_20.setElementType(symbol_23);
		symbol_23.setName("T");
		symbol_22.setOwnedParameteredElement(symbol_23);
		symbol_21.getOwnedParameters().add(symbol_22);
		
		symbol_20.setOwnedTemplateSignature(symbol_21);
		symbol_20.getSuperClasses().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		symbol_20.getSuperClasses().add(symbol_276); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		{	// ocl::Bag::<>()
			Operation symbol_452 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_452.setName("<>");
			symbol_452.setType(symbol_12);  // Boolean
			
			Parameter symbol_453 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_453.setName("object2");
			symbol_453.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_452.getOwnedParameters().add(symbol_453);
			symbol_452.setPrecedence(symbol_7);
			symbol_452.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_452.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_20.getOwnedOperations().add(symbol_452);
		}
		{	// ocl::Bag::=()
			Operation symbol_454 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_454.setName("=");
			symbol_454.setType(symbol_12);  // Boolean
			
			Parameter symbol_455 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_455.setName("object2");
			symbol_455.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_454.getOwnedParameters().add(symbol_455);
			symbol_454.setPrecedence(symbol_7);
			symbol_454.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_454.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_20.getOwnedOperations().add(symbol_454);
		}
		{	// ocl::Bag::excluding()
			Operation symbol_456 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_456.setName("excluding");
			symbol_456.setType(symbol_20);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_457 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_457.setName("object");
			symbol_457.setType(symbol_90);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_456.getOwnedParameters().add(symbol_457);
			symbol_456.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_456.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_20.getOwnedOperations().add(symbol_456);
		}
		{	// ocl::Bag::flatten()
			Operation symbol_458 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()
			symbol_26.setName("T2");
			symbol_25.setOwnedParameteredElement(symbol_26);
			symbol_24.getOwnedParameters().add(symbol_25);
			
			symbol_458.setOwnedTemplateSignature(symbol_24);
			symbol_458.setName("flatten");
			symbol_458.setType(symbol_192);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
			
			symbol_458.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_458.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_20.getOwnedOperations().add(symbol_458);
		}
		{	// ocl::Bag::including()
			Operation symbol_459 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!including(T)
			symbol_459.setName("including");
			symbol_459.setType(symbol_20);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_460 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!including(T)!object
			symbol_460.setName("object");
			symbol_460.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			
			symbol_459.getOwnedParameters().add(symbol_460);
			symbol_459.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_459.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_20.getOwnedOperations().add(symbol_459);
		}
		{	// ocl::Bag::reject()
			Iteration symbol_461 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)
			symbol_461.setName("reject");
			symbol_461.setType(symbol_20);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_462 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)!i
			symbol_462.setName("i");
			symbol_462.setType(symbol_23); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			symbol_461.getOwnedIterators().add(symbol_462);
			Parameter symbol_463 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!reject(T|Lambda~T()Boolean)!body
			symbol_463.setName("body");
			symbol_463.setType(symbol_153);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
			
			symbol_461.getOwnedParameters().add(symbol_463);
			symbol_461.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_461.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_20.getOwnedOperations().add(symbol_461);
		}
		{	// ocl::Bag::select()
			Iteration symbol_464 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)
			symbol_464.setName("select");
			symbol_464.setType(symbol_20);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
			
			Parameter symbol_465 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)!i
			symbol_465.setName("i");
			symbol_465.setType(symbol_23); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T
			symbol_464.getOwnedIterators().add(symbol_465);
			Parameter symbol_466 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!select(T|Lambda~T()Boolean)!body
			symbol_466.setName("body");
			symbol_466.setType(symbol_152);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
			
			symbol_464.getOwnedParameters().add(symbol_466);
			symbol_464.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_464.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_20.getOwnedOperations().add(symbol_464);
		}
		symbol_1.getOwnedTypes().add(symbol_20); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}
		//
		// ocl::Class http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		//
		symbol_27.setName("Class");
		symbol_27.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Class::oclType()
			Operation symbol_467 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class!oclType()
			symbol_467.setName("oclType");
			symbol_467.setType(symbol_196);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_467.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_467.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_27.getOwnedOperations().add(symbol_467);
		}
		symbol_1.getOwnedTypes().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		//
		// ocl::ClassClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}
		//
		symbol_28.setName("ClassClassifier");
		symbol_28.setInstanceType(symbol_31);
		symbol_31.setName("T");
		symbol_30.setOwnedParameteredElement(symbol_31);
		symbol_29.getOwnedParameters().add(symbol_30);
		
		symbol_28.setOwnedTemplateSignature(symbol_29);
		symbol_28.getSuperClasses().add(symbol_198); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		symbol_1.getOwnedTypes().add(symbol_28); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}
		//
		// ocl::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier{T}
		//
		symbol_32.setName("Classifier");
		symbol_32.setInstanceType(symbol_35);
		symbol_35.setName("T");
		symbol_34.setOwnedParameteredElement(symbol_35);
		symbol_33.getOwnedParameters().add(symbol_34);
		
		symbol_32.setOwnedTemplateSignature(symbol_33);
		symbol_32.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_1.getOwnedTypes().add(symbol_32); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier{T}
		//
		// ocl::CollectionClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}
		//
		symbol_36.setName("CollectionClassifier");
		symbol_36.setInstanceType(symbol_39);
		symbol_39.setName("T");
		symbol_38.setOwnedParameteredElement(symbol_39);
		symbol_37.getOwnedParameters().add(symbol_38);
		symbol_41.setName("E");
		symbol_40.setOwnedParameteredElement(symbol_41);
		symbol_37.getOwnedParameters().add(symbol_40);
		
		symbol_36.setOwnedTemplateSignature(symbol_37);
		symbol_36.getSuperClasses().add(symbol_199); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		{ // ocl::CollectionClassifier::elementType
			symbol_42.setName("elementType");
			symbol_42.setType(symbol_41);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?E
			
			symbol_42.setIsResolveProxies(true);
			symbol_42.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionClassifierElementTypeProperty");
			symbol_42.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionClassifierElementTypeProperty.INSTANCE);
			symbol_36.getOwnedAttributes().add(symbol_42);
		}
		symbol_1.getOwnedTypes().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}
		//
		// ocl::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
		//
		symbol_43.setName("Collection");
		symbol_43.setElementType(symbol_46);
		symbol_46.setName("T");
		symbol_45.setOwnedParameteredElement(symbol_46);
		symbol_44.getOwnedParameters().add(symbol_45);
		
		symbol_43.setOwnedTemplateSignature(symbol_44);
		symbol_43.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Collection::<>()
			Operation symbol_468 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_468.setName("<>");
			symbol_468.setType(symbol_12);  // Boolean
			
			Parameter symbol_469 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_469.setName("object2");
			symbol_469.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_468.getOwnedParameters().add(symbol_469);
			symbol_468.setPrecedence(symbol_7);
			symbol_468.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_468.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_468);
		}
		{	// ocl::Collection::=()
			Operation symbol_470 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_470.setName("=");
			symbol_470.setType(symbol_12);  // Boolean
			
			Parameter symbol_471 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_471.setName("object2");
			symbol_471.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_470.getOwnedParameters().add(symbol_471);
			symbol_470.setPrecedence(symbol_7);
			symbol_470.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_470.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_470);
		}
		{	// ocl::Collection::any()
			Iteration symbol_472 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)
			symbol_472.setName("any");
			symbol_472.setType(symbol_46);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			Parameter symbol_473 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)!i
			symbol_473.setName("i");
			symbol_473.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_472.getOwnedIterators().add(symbol_473);
			Parameter symbol_474 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!any(T|Lambda~T()Boolean)!body
			symbol_474.setName("body");
			symbol_474.setType(symbol_161);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_472.getOwnedParameters().add(symbol_474);
			symbol_472.setImplementationClass("org.eclipse.ocl.examples.library.iterator.AnyIteration");
			symbol_472.setImplementation(org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_472);
		}
		{	// ocl::Collection::asBag()
			Operation symbol_475 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asBag()
			symbol_475.setName("asBag");
			symbol_475.setType(symbol_193);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_475.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation");
			symbol_475.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_475);
		}
		{	// ocl::Collection::asOrderedSet()
			Operation symbol_476 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asOrderedSet()
			symbol_476.setName("asOrderedSet");
			symbol_476.setType(symbol_301);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_476.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation");
			symbol_476.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_476);
		}
		{	// ocl::Collection::asSequence()
			Operation symbol_477 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asSequence()
			symbol_477.setName("asSequence");
			symbol_477.setType(symbol_307);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_477.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation");
			symbol_477.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_477);
		}
		{	// ocl::Collection::asSet()
			Operation symbol_478 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!asSet()
			symbol_478.setName("asSet");
			symbol_478.setType(symbol_314);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_478.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation");
			symbol_478.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_478);
		}
		{	// ocl::Collection::collect()
			Iteration symbol_479 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)
			symbol_49.setName("V");
			symbol_48.setOwnedParameteredElement(symbol_49);
			symbol_47.getOwnedParameters().add(symbol_48);
			
			symbol_479.setOwnedTemplateSignature(symbol_47);
			symbol_479.setName("collect");
			symbol_479.setType(symbol_218);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_480 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!i
			symbol_480.setName("i");
			symbol_480.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_479.getOwnedIterators().add(symbol_480);
			Parameter symbol_481 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)!body
			symbol_481.setName("body");
			symbol_481.setType(symbol_163);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
			
			symbol_479.getOwnedParameters().add(symbol_481);
			symbol_479.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_479.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_479);
		}
		{	// ocl::Collection::collectNested()
			Iteration symbol_482 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)
			symbol_52.setName("V");
			symbol_51.setOwnedParameteredElement(symbol_52);
			symbol_50.getOwnedParameters().add(symbol_51);
			
			symbol_482.setOwnedTemplateSignature(symbol_50);
			symbol_482.setName("collectNested");
			symbol_482.setType(symbol_43);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_483 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_483.setName("i");
			symbol_483.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_482.getOwnedIterators().add(symbol_483);
			Parameter symbol_484 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_484.setName("body");
			symbol_484.setType(symbol_162);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
			
			symbol_482.getOwnedParameters().add(symbol_484);
			symbol_482.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_482.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_482);
		}
		{	// ocl::Collection::count()
			Operation symbol_485 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!count(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_485.setName("count");
			symbol_485.setType(symbol_13);  // Integer
			
			Parameter symbol_486 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!count(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_486.setName("object");
			symbol_486.setType(symbol_90);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_485.getOwnedParameters().add(symbol_486);
			symbol_485.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionCountOperation");
			symbol_485.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_485);
		}
		{	// ocl::Collection::excludes()
			Operation symbol_487 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_487.setName("excludes");
			symbol_487.setType(symbol_12);  // Boolean
			
			Parameter symbol_488 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_488.setName("object");
			symbol_488.setType(symbol_90);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_487.getOwnedParameters().add(symbol_488);
			symbol_487.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation");
			symbol_487.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_487);
		}
		{	// ocl::Collection::excludesAll()
			Operation symbol_489 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_55.setName("T2");
			symbol_54.setOwnedParameteredElement(symbol_55);
			symbol_53.getOwnedParameters().add(symbol_54);
			
			symbol_489.setOwnedTemplateSignature(symbol_53);
			symbol_489.setName("excludesAll");
			symbol_489.setType(symbol_12);  // Boolean
			
			Parameter symbol_490 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_490.setName("c2");
			symbol_490.setType(symbol_219);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			symbol_489.getOwnedParameters().add(symbol_490);
			symbol_489.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation");
			symbol_489.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_489);
		}
		{	// ocl::Collection::excluding()
			Operation symbol_491 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_491.setName("excluding");
			symbol_491.setType(symbol_43);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_492 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_492.setName("object");
			symbol_492.setType(symbol_90);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_491.getOwnedParameters().add(symbol_492);
			symbol_491.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_491.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_491);
		}
		{	// ocl::Collection::exists()
			Iteration symbol_493 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)
			symbol_493.setName("exists");
			symbol_493.setType(symbol_12);  // Boolean
			
			Parameter symbol_494 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)!i
			symbol_494.setName("i");
			symbol_494.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_493.getOwnedIterators().add(symbol_494);
			Parameter symbol_495 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T|Lambda~T()Boolean)!body
			symbol_495.setName("body");
			symbol_495.setType(symbol_158);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_493.getOwnedParameters().add(symbol_495);
			symbol_493.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ExistsIteration");
			symbol_493.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_493);
		}
		{	// ocl::Collection::exists()
			Iteration symbol_496 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)
			symbol_496.setName("exists");
			symbol_496.setType(symbol_12);  // Boolean
			
			Parameter symbol_497 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!i
			symbol_497.setName("i");
			symbol_497.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_496.getOwnedIterators().add(symbol_497);
			Parameter symbol_498 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!j
			symbol_498.setName("j");
			symbol_498.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_496.getOwnedIterators().add(symbol_498);
			Parameter symbol_499 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!exists(T,T|Lambda~T()Boolean)!body
			symbol_499.setName("body");
			symbol_499.setType(symbol_154);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_496.getOwnedParameters().add(symbol_499);
			symbol_496.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ExistsIteration");
			symbol_496.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_496);
		}
		{	// ocl::Collection::flatten()
			Operation symbol_500 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()
			symbol_58.setName("T2");
			symbol_57.setOwnedParameteredElement(symbol_58);
			symbol_56.getOwnedParameters().add(symbol_57);
			
			symbol_500.setOwnedTemplateSignature(symbol_56);
			symbol_500.setName("flatten");
			symbol_500.setType(symbol_220);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
			
			symbol_500.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_500.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_500);
		}
		{	// ocl::Collection::forAll()
			Iteration symbol_501 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)
			symbol_501.setName("forAll");
			symbol_501.setType(symbol_12);  // Boolean
			
			Parameter symbol_502 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)!i
			symbol_502.setName("i");
			symbol_502.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_501.getOwnedIterators().add(symbol_502);
			Parameter symbol_503 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T|Lambda~T()Boolean)!body
			symbol_503.setName("body");
			symbol_503.setType(symbol_155);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_501.getOwnedParameters().add(symbol_503);
			symbol_501.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ForAllIteration");
			symbol_501.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_501);
		}
		{	// ocl::Collection::forAll()
			Iteration symbol_504 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)
			symbol_504.setName("forAll");
			symbol_504.setType(symbol_12);  // Boolean
			
			Parameter symbol_505 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!i
			symbol_505.setName("i");
			symbol_505.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_504.getOwnedIterators().add(symbol_505);
			Parameter symbol_506 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!j
			symbol_506.setName("j");
			symbol_506.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_504.getOwnedIterators().add(symbol_506);
			Parameter symbol_507 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!forAll(T,T|Lambda~T()Boolean)!body
			symbol_507.setName("body");
			symbol_507.setType(symbol_160);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_504.getOwnedParameters().add(symbol_507);
			symbol_504.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ForAllIteration");
			symbol_504.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_504);
		}
		{	// ocl::Collection::includes()
			Operation symbol_508 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_508.setName("includes");
			symbol_508.setType(symbol_12);  // Boolean
			
			Parameter symbol_509 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includes(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_509.setName("object");
			symbol_509.setType(symbol_90);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_508.getOwnedParameters().add(symbol_509);
			symbol_508.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation");
			symbol_508.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_508);
		}
		{	// ocl::Collection::includesAll()
			Operation symbol_510 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_61.setName("T2");
			symbol_60.setOwnedParameteredElement(symbol_61);
			symbol_59.getOwnedParameters().add(symbol_60);
			
			symbol_510.setOwnedTemplateSignature(symbol_59);
			symbol_510.setName("includesAll");
			symbol_510.setType(symbol_12);  // Boolean
			
			Parameter symbol_511 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_511.setName("c2");
			symbol_511.setType(symbol_221);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			symbol_510.getOwnedParameters().add(symbol_511);
			symbol_510.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation");
			symbol_510.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_510);
		}
		{	// ocl::Collection::including()
			Operation symbol_512 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!including(T)
			symbol_512.setName("including");
			symbol_512.setType(symbol_43);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_513 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!including(T)!object
			symbol_513.setName("object");
			symbol_513.setType(symbol_46);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_512.getOwnedParameters().add(symbol_513);
			symbol_512.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_512.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_512);
		}
		{	// ocl::Collection::isEmpty()
			Operation symbol_514 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isEmpty()
			symbol_514.setName("isEmpty");
			symbol_514.setType(symbol_12);  // Boolean
			
			symbol_514.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation");
			symbol_514.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_514);
		}
		{	// ocl::Collection::isUnique()
			Iteration symbol_515 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_515.setName("isUnique");
			symbol_515.setType(symbol_12);  // Boolean
			
			Parameter symbol_516 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_516.setName("i");
			symbol_516.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_515.getOwnedIterators().add(symbol_516);
			Parameter symbol_517 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!isUnique(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_517.setName("body");
			symbol_517.setType(symbol_164);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_515.getOwnedParameters().add(symbol_517);
			symbol_515.setImplementationClass("org.eclipse.ocl.examples.library.iterator.IsUniqueIteration");
			symbol_515.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_515);
		}
		{	// ocl::Collection::iterate()
			Iteration symbol_518 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)
			symbol_64.setName("Tacc");
			symbol_63.setOwnedParameteredElement(symbol_64);
			symbol_62.getOwnedParameters().add(symbol_63);
			
			symbol_518.setOwnedTemplateSignature(symbol_62);
			symbol_518.setName("iterate");
			symbol_518.setType(symbol_64);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)?Tacc
			
			Parameter symbol_519 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)!i
			symbol_519.setName("i");
			symbol_519.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_518.getOwnedIterators().add(symbol_519);
			Parameter symbol_520 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)!acc
			symbol_520.setName("acc");
			symbol_520.setType(symbol_64); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!iterate{Tacc}(T;Tacc)?Tacc
			symbol_518.getOwnedAccumulators().add(symbol_520);
			symbol_518.setImplementationClass("org.eclipse.ocl.examples.library.iterator.IterateIteration");
			symbol_518.setImplementation(org.eclipse.ocl.examples.library.iterator.IterateIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_518);
		}
		{	// ocl::Collection::max()
			Operation symbol_521 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!max()
			symbol_521.setName("max");
			symbol_521.setType(symbol_46);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_521.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionMaxOperation");
			symbol_521.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_521);
		}
		{	// ocl::Collection::min()
			Operation symbol_522 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!min()
			symbol_522.setName("min");
			symbol_522.setType(symbol_46);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_522.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionMinOperation");
			symbol_522.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_522);
		}
		{	// ocl::Collection::notEmpty()
			Operation symbol_523 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!notEmpty()
			symbol_523.setName("notEmpty");
			symbol_523.setType(symbol_12);  // Boolean
			
			symbol_523.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation");
			symbol_523.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_523);
		}
		{	// ocl::Collection::oclType()
			Operation symbol_524 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!oclType()
			symbol_524.setName("oclType");
			symbol_524.setType(symbol_210);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			symbol_524.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_524.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_524);
		}
		{	// ocl::Collection::one()
			Iteration symbol_525 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)
			symbol_525.setName("one");
			symbol_525.setType(symbol_12);  // Boolean
			
			Parameter symbol_526 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)!i
			symbol_526.setName("i");
			symbol_526.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_525.getOwnedIterators().add(symbol_526);
			Parameter symbol_527 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!one(T|Lambda~T()Boolean)!body
			symbol_527.setName("body");
			symbol_527.setType(symbol_159);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_525.getOwnedParameters().add(symbol_527);
			symbol_525.setImplementationClass("org.eclipse.ocl.examples.library.iterator.OneIteration");
			symbol_525.setImplementation(org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_525);
		}
		{	// ocl::Collection::product()
			Operation symbol_528 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])
			symbol_67.setName("T2");
			symbol_66.setOwnedParameteredElement(symbol_67);
			symbol_65.getOwnedParameters().add(symbol_66);
			
			symbol_528.setOwnedTemplateSignature(symbol_65);
			symbol_528.setName("product");
			symbol_528.setType(symbol_312);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
			
			Parameter symbol_529 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])!c2
			symbol_529.setName("c2");
			symbol_529.setType(symbol_222);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
			
			symbol_528.getOwnedParameters().add(symbol_529);
			symbol_528.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionProductOperation");
			symbol_528.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_528);
		}
		{	// ocl::Collection::reject()
			Iteration symbol_530 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)
			symbol_530.setName("reject");
			symbol_530.setType(symbol_43);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_531 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)!i
			symbol_531.setName("i");
			symbol_531.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_530.getOwnedIterators().add(symbol_531);
			Parameter symbol_532 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!reject(T|Lambda~T()Boolean)!body
			symbol_532.setName("body");
			symbol_532.setType(symbol_157);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_530.getOwnedParameters().add(symbol_532);
			symbol_530.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_530.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_530);
		}
		{	// ocl::Collection::select()
			Iteration symbol_533 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)
			symbol_533.setName("select");
			symbol_533.setType(symbol_43);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
			
			Parameter symbol_534 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)!i
			symbol_534.setName("i");
			symbol_534.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_533.getOwnedIterators().add(symbol_534);
			Parameter symbol_535 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!select(T|Lambda~T()Boolean)!body
			symbol_535.setName("body");
			symbol_535.setType(symbol_156);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
			
			symbol_533.getOwnedParameters().add(symbol_535);
			symbol_533.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_533.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_533);
		}
		{	// ocl::Collection::size()
			Operation symbol_536 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!size()
			symbol_536.setName("size");
			symbol_536.setType(symbol_13);  // Integer
			
			symbol_536.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionSizeOperation");
			symbol_536.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_536);
		}
		{	// ocl::Collection::sortedBy()
			Iteration symbol_537 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_537.setName("sortedBy");
			symbol_537.setType(symbol_290);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
			
			Parameter symbol_538 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_538.setName("i");
			symbol_538.setType(symbol_46); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			symbol_537.getOwnedIterators().add(symbol_538);
			Parameter symbol_539 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_539.setName("body");
			symbol_539.setType(symbol_165);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_537.getOwnedParameters().add(symbol_539);
			symbol_537.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_537.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_537);
		}
		{	// ocl::Collection::sum()
			Operation symbol_540 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!sum()
			symbol_540.setName("sum");
			symbol_540.setType(symbol_46);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_540.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionSumOperation");
			symbol_540.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_540);
		}
		symbol_1.getOwnedTypes().add(symbol_43); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}
		//
		// ocl::Comparable http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Comparable
		//
		symbol_68.setName("Comparable");
		symbol_68.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_1.getOwnedTypes().add(symbol_68); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Comparable
		//
		// ocl::Enumeration http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration
		//
		symbol_69.setName("Enumeration");
		symbol_69.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::Enumeration::allInstances()
			Operation symbol_541 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration!allInstances()
			symbol_541.setName("allInstances");
			symbol_541.setType(symbol_317);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_541.setIsStatic(true);
			symbol_541.setImplementationClass("org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation");
			symbol_541.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
			symbol_69.getOwnedOperations().add(symbol_541);
		}
		{	// ocl::Enumeration::oclType()
			Operation symbol_542 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration!oclType()
			symbol_542.setName("oclType");
			symbol_542.setType(symbol_244);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_542.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_542.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_69.getOwnedOperations().add(symbol_542);
		}
		symbol_1.getOwnedTypes().add(symbol_69); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Enumeration
		//
		// ocl::EnumerationClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}
		//
		symbol_70.setName("EnumerationClassifier");
		symbol_70.setInstanceType(symbol_73);
		symbol_73.setName("T");
		symbol_72.setOwnedParameteredElement(symbol_73);
		symbol_71.getOwnedParameters().add(symbol_72);
		
		symbol_70.setOwnedTemplateSignature(symbol_71);
		symbol_70.getSuperClasses().add(symbol_200); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		{ // ocl::EnumerationClassifier::ownedLiteral
			symbol_74.setName("ownedLiteral");
			symbol_74.setType(symbol_302);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
			
			symbol_74.setIsResolveProxies(true);
			symbol_74.setImplementationClass("org.eclipse.ocl.examples.library.enumeration.EnumerationClassifierOwnedLiteralProperty");
			symbol_74.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationClassifierOwnedLiteralProperty.INSTANCE);
			symbol_70.getOwnedAttributes().add(symbol_74);
		}
		symbol_1.getOwnedTypes().add(symbol_70); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}
		//
		// ocl::EnumerationLiteral http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		//
		symbol_75.setName("EnumerationLiteral");
		symbol_75.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_1.getOwnedTypes().add(symbol_75); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral
		//
		// ocl::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}
		//
		symbol_76.setName("NonOrderedCollection");
		symbol_76.setElementType(symbol_79);
		symbol_79.setName("T");
		symbol_78.setOwnedParameteredElement(symbol_79);
		symbol_77.getOwnedParameters().add(symbol_78);
		
		symbol_76.setOwnedTemplateSignature(symbol_77);
		symbol_76.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		{	// ocl::NonOrderedCollection::closure()
			Iteration symbol_543 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_543.setName("closure");
			symbol_543.setType(symbol_315);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			Parameter symbol_544 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!i
			symbol_544.setName("i");
			symbol_544.setType(symbol_79); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T
			symbol_543.getOwnedIterators().add(symbol_544);
			Parameter symbol_545 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!body
			symbol_545.setName("body");
			symbol_545.setType(symbol_168);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
			
			symbol_543.getOwnedParameters().add(symbol_545);
			symbol_543.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ClosureIteration");
			symbol_543.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_76.getOwnedOperations().add(symbol_543);
		}
		{	// ocl::NonOrderedCollection::collect()
			Iteration symbol_546 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)
			symbol_82.setName("V");
			symbol_81.setOwnedParameteredElement(symbol_82);
			symbol_80.getOwnedParameters().add(symbol_81);
			
			symbol_546.setOwnedTemplateSignature(symbol_80);
			symbol_546.setName("collect");
			symbol_546.setType(symbol_194);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_547 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)!i
			symbol_547.setName("i");
			symbol_547.setType(symbol_79); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T
			symbol_546.getOwnedIterators().add(symbol_547);
			Parameter symbol_548 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)!body
			symbol_548.setName("body");
			symbol_548.setType(symbol_167);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
			
			symbol_546.getOwnedParameters().add(symbol_548);
			symbol_546.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_546.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_76.getOwnedOperations().add(symbol_546);
		}
		{	// ocl::NonOrderedCollection::collectNested()
			Iteration symbol_549 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)
			symbol_85.setName("V");
			symbol_84.setOwnedParameteredElement(symbol_85);
			symbol_83.getOwnedParameters().add(symbol_84);
			
			symbol_549.setOwnedTemplateSignature(symbol_83);
			symbol_549.setName("collectNested");
			symbol_549.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			Parameter symbol_550 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_550.setName("i");
			symbol_550.setType(symbol_79); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T
			symbol_549.getOwnedIterators().add(symbol_550);
			Parameter symbol_551 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_551.setName("body");
			symbol_551.setType(symbol_166);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
			
			symbol_549.getOwnedParameters().add(symbol_551);
			symbol_549.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_549.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_76.getOwnedOperations().add(symbol_549);
		}
		{	// ocl::NonOrderedCollection::intersection()
			Operation symbol_552 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[T])
			symbol_552.setName("intersection");
			symbol_552.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			Parameter symbol_553 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[T])!bag
			symbol_553.setName("bag");
			symbol_553.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			symbol_552.getOwnedParameters().add(symbol_553);
			symbol_552.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_552.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_76.getOwnedOperations().add(symbol_552);
		}
		{	// ocl::NonOrderedCollection::intersection()
			Operation symbol_554 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_554.setName("intersection");
			symbol_554.setType(symbol_315);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			Parameter symbol_555 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!s
			symbol_555.setName("s");
			symbol_555.setType(symbol_315);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			symbol_554.getOwnedParameters().add(symbol_555);
			symbol_554.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_554.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_76.getOwnedOperations().add(symbol_554);
		}
		{	// ocl::NonOrderedCollection::union()
			Operation symbol_556 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[T])
			symbol_556.setName("union");
			symbol_556.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			Parameter symbol_557 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[T])!bag
			symbol_557.setName("bag");
			symbol_557.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			symbol_556.getOwnedParameters().add(symbol_557);
			symbol_556.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_556.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_76.getOwnedOperations().add(symbol_556);
		}
		{	// ocl::NonOrderedCollection::union()
			Operation symbol_558 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_558.setName("union");
			symbol_558.setType(symbol_315);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			Parameter symbol_559 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!s
			symbol_559.setName("s");
			symbol_559.setType(symbol_315);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
			
			symbol_558.getOwnedParameters().add(symbol_559);
			symbol_558.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_558.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_76.getOwnedOperations().add(symbol_558);
		}
		symbol_1.getOwnedTypes().add(symbol_76); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}
		//
		// ocl::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}
		//
		symbol_86.setName("NonUniqueCollection");
		symbol_86.setElementType(symbol_89);
		symbol_89.setName("T");
		symbol_88.setOwnedParameteredElement(symbol_89);
		symbol_87.getOwnedParameters().add(symbol_88);
		
		symbol_86.setOwnedTemplateSignature(symbol_87);
		symbol_86.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		{	// ocl::NonUniqueCollection::sortedBy()
			Iteration symbol_560 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_560.setName("sortedBy");
			symbol_560.setType(symbol_308);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
			
			Parameter symbol_561 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_561.setName("i");
			symbol_561.setType(symbol_89); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T
			symbol_560.getOwnedIterators().add(symbol_561);
			Parameter symbol_562 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_562.setName("body");
			symbol_562.setType(symbol_169);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_560.getOwnedParameters().add(symbol_562);
			symbol_560.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_560.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_86.getOwnedOperations().add(symbol_560);
		}
		symbol_1.getOwnedTypes().add(symbol_86); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}
		//
		// ocl::OclAny http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_90.setName("OclAny");
		{	// ocl::OclAny::<>()
			Operation symbol_563 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_563.setName("<>");
			symbol_563.setType(symbol_12);  // Boolean
			
			Parameter symbol_564 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_564.setName("object2");
			symbol_564.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_563.getOwnedParameters().add(symbol_564);
			symbol_563.setPrecedence(symbol_7);
			symbol_563.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_563.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_563);
		}
		{	// ocl::OclAny::=()
			Operation symbol_565 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_565.setName("=");
			symbol_565.setType(symbol_12);  // Boolean
			
			Parameter symbol_566 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_566.setName("object2");
			symbol_566.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_565.getOwnedParameters().add(symbol_566);
			symbol_565.setPrecedence(symbol_7);
			symbol_565.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_565.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_565);
		}
		{	// ocl::OclAny::oclAsSet()
			Operation symbol_567 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsSet()
			symbol_567.setName("oclAsSet");
			symbol_567.setType(symbol_317);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_567.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation");
			symbol_567.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_567);
		}
		{	// ocl::OclAny::oclAsType()
			Operation symbol_568 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])
			symbol_93.setName("TT");
			symbol_92.setOwnedParameteredElement(symbol_93);
			symbol_91.getOwnedParameters().add(symbol_92);
			
			symbol_568.setOwnedTemplateSignature(symbol_91);
			symbol_568.setName("oclAsType");
			symbol_568.setType(symbol_93);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])?TT
			
			Parameter symbol_569 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])!type
			symbol_569.setName("type");
			symbol_569.setType(symbol_201);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])?TT]
			
			symbol_568.getOwnedParameters().add(symbol_569);
			symbol_568.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation");
			symbol_568.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_568);
		}
		{	// ocl::OclAny::oclIsInState()
			Operation symbol_570 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInState(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState)
			symbol_570.setName("oclIsInState");
			symbol_570.setType(symbol_12);  // Boolean
			
			Parameter symbol_571 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInState(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState)!statespec
			symbol_571.setName("statespec");
			symbol_571.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
			
			symbol_570.getOwnedParameters().add(symbol_571);
			symbol_570.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation");
			symbol_570.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_570);
		}
		{	// ocl::OclAny::oclIsInvalid()
			Operation symbol_572 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsInvalid()
			symbol_572.setName("oclIsInvalid");
			symbol_572.setType(symbol_12);  // Boolean
			
			symbol_572.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation");
			symbol_572.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_572);
		}
		{	// ocl::OclAny::oclIsKindOf()
			Operation symbol_573 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])
			symbol_96.setName("T");
			symbol_95.setOwnedParameteredElement(symbol_96);
			symbol_94.getOwnedParameters().add(symbol_95);
			
			symbol_573.setOwnedTemplateSignature(symbol_94);
			symbol_573.setName("oclIsKindOf");
			symbol_573.setType(symbol_12);  // Boolean
			
			Parameter symbol_574 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])!type
			symbol_574.setName("type");
			symbol_574.setType(symbol_202);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])?T]
			
			symbol_573.getOwnedParameters().add(symbol_574);
			symbol_573.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation");
			symbol_573.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_573);
		}
		{	// ocl::OclAny::oclIsNew()
			Operation symbol_575 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsNew()
			symbol_575.setName("oclIsNew");
			symbol_575.setType(symbol_12);  // Boolean
			
			symbol_575.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_575.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_575);
		}
		{	// ocl::OclAny::oclIsTypeOf()
			Operation symbol_576 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])
			symbol_99.setName("T");
			symbol_98.setOwnedParameteredElement(symbol_99);
			symbol_97.getOwnedParameters().add(symbol_98);
			
			symbol_576.setOwnedTemplateSignature(symbol_97);
			symbol_576.setName("oclIsTypeOf");
			symbol_576.setType(symbol_12);  // Boolean
			
			Parameter symbol_577 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])!type
			symbol_577.setName("type");
			symbol_577.setType(symbol_203);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])?T]
			
			symbol_576.getOwnedParameters().add(symbol_577);
			symbol_576.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation");
			symbol_576.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_576);
		}
		{	// ocl::OclAny::oclIsUndefined()
			Operation symbol_578 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsUndefined()
			symbol_578.setName("oclIsUndefined");
			symbol_578.setType(symbol_12);  // Boolean
			
			symbol_578.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation");
			symbol_578.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_578);
		}
		{	// ocl::OclAny::oclType()
			Operation symbol_579 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclType()
			symbol_579.setName("oclType");
			symbol_579.setType(symbol_209);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_579.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_579.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_579);
		}
		symbol_1.getOwnedTypes().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::OclElement http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		//
		symbol_100.setName("OclElement");
		symbol_100.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclElement::allInstances()
			Operation symbol_580 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!allInstances()
			symbol_580.setName("allInstances");
			symbol_580.setType(symbol_317);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_580.setIsStatic(true);
			symbol_580.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation");
			symbol_580.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
			symbol_100.getOwnedOperations().add(symbol_580);
		}
		{	// ocl::OclElement::oclContainer()
			Operation symbol_581 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()
			symbol_103.setName("U");
			symbol_102.setOwnedParameteredElement(symbol_103);
			symbol_101.getOwnedParameters().add(symbol_102);
			
			symbol_581.setOwnedTemplateSignature(symbol_101);
			symbol_581.setName("oclContainer");
			symbol_581.setType(symbol_204);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()?U]
			
			symbol_581.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation");
			symbol_581.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation.INSTANCE);
			symbol_100.getOwnedOperations().add(symbol_581);
		}
		{	// ocl::OclElement::oclContents()
			Operation symbol_582 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()
			symbol_106.setName("U");
			symbol_105.setOwnedParameteredElement(symbol_106);
			symbol_104.getOwnedParameters().add(symbol_105);
			
			symbol_582.setOwnedTemplateSignature(symbol_104);
			symbol_582.setName("oclContents");
			symbol_582.setType(symbol_313);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
			
			symbol_582.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation");
			symbol_582.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation.INSTANCE);
			symbol_100.getOwnedOperations().add(symbol_582);
		}
		symbol_1.getOwnedTypes().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement
		//
		// ocl::OclInvalid http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
		//
		symbol_107.setName("OclInvalid");
		symbol_107.getSuperClasses().add(symbol_114); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		{ // ocl::OclInvalid::oclBadProperty
			symbol_108.setName("oclBadProperty");
			symbol_108.setType(symbol_107);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
			
			symbol_108.setIsResolveProxies(true);
			symbol_107.getOwnedAttributes().add(symbol_108);
		}
		{	// ocl::OclInvalid::<>()
			Operation symbol_583 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_583.setName("<>");
			symbol_583.setType(symbol_12);  // Boolean
			
			Parameter symbol_584 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_584.setName("object2");
			symbol_584.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_583.getOwnedParameters().add(symbol_584);
			symbol_583.setPrecedence(symbol_7);
			symbol_583.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_583.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_107.getOwnedOperations().add(symbol_583);
		}
		{	// ocl::OclInvalid::=()
			Operation symbol_585 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_585.setName("=");
			symbol_585.setType(symbol_12);  // Boolean
			
			Parameter symbol_586 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_586.setName("object2");
			symbol_586.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_585.getOwnedParameters().add(symbol_586);
			symbol_585.setPrecedence(symbol_7);
			symbol_585.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_585.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_107.getOwnedOperations().add(symbol_585);
		}
		{	// ocl::OclInvalid::allInstances()
			Operation symbol_587 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!allInstances()
			symbol_587.setName("allInstances");
			symbol_587.setType(symbol_317);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_587.setIsStatic(true);
			symbol_587.setImplementationClass("org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation");
			symbol_587.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
			symbol_107.getOwnedOperations().add(symbol_587);
		}
		{	// ocl::OclInvalid::oclBadOperation()
			Operation symbol_588 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!oclBadOperation()
			symbol_588.setName("oclBadOperation");
			symbol_588.setType(symbol_107);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
			
			symbol_107.getOwnedOperations().add(symbol_588);
		}
		{	// ocl::OclInvalid::toString()
			Operation symbol_589 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid!toString()
			symbol_589.setName("toString");
			symbol_589.setType(symbol_15);  // String
			
			symbol_589.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_589.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_107.getOwnedOperations().add(symbol_589);
		}
		symbol_1.getOwnedTypes().add(symbol_107); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclInvalid
		//
		// ocl::OclLambda http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		//
		symbol_109.setName("OclLambda");
		symbol_109.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_1.getOwnedTypes().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		//
		// ocl::OclMessage http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		//
		symbol_110.setName("OclMessage");
		symbol_110.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclMessage::hasReturned()
			Operation symbol_590 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!hasReturned()
			symbol_590.setName("hasReturned");
			symbol_590.setType(symbol_12);  // Boolean
			
			symbol_590.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_590.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_110.getOwnedOperations().add(symbol_590);
		}
		{	// ocl::OclMessage::isOperationCall()
			Operation symbol_591 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!isOperationCall()
			symbol_591.setName("isOperationCall");
			symbol_591.setType(symbol_12);  // Boolean
			
			symbol_591.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_591.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_110.getOwnedOperations().add(symbol_591);
		}
		{	// ocl::OclMessage::isSignalSent()
			Operation symbol_592 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!isSignalSent()
			symbol_592.setName("isSignalSent");
			symbol_592.setType(symbol_12);  // Boolean
			
			symbol_592.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_592.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_110.getOwnedOperations().add(symbol_592);
		}
		{	// ocl::OclMessage::result()
			Operation symbol_593 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage!result()
			symbol_593.setName("result");
			symbol_593.setType(symbol_90);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_593.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_593.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_110.getOwnedOperations().add(symbol_593);
		}
		symbol_1.getOwnedTypes().add(symbol_110); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclMessage
		//
		// ocl::OclSelf http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
		//
		symbol_111.setName("OclSelf");
		symbol_111.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_1.getOwnedTypes().add(symbol_111); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
		//
		// ocl::OclState http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
		//
		symbol_112.setName("OclState");
		symbol_112.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_1.getOwnedTypes().add(symbol_112); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclState
		//
		// ocl::OclTuple http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		//
		symbol_113.setName("OclTuple");
		symbol_113.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclTuple::<>()
			Operation symbol_594 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_594.setName("<>");
			symbol_594.setType(symbol_12);  // Boolean
			
			Parameter symbol_595 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_595.setName("object2");
			symbol_595.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_594.getOwnedParameters().add(symbol_595);
			symbol_594.setPrecedence(symbol_7);
			symbol_594.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_594.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_113.getOwnedOperations().add(symbol_594);
		}
		{	// ocl::OclTuple::=()
			Operation symbol_596 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_596.setName("=");
			symbol_596.setType(symbol_12);  // Boolean
			
			Parameter symbol_597 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_597.setName("object2");
			symbol_597.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_596.getOwnedParameters().add(symbol_597);
			symbol_596.setPrecedence(symbol_7);
			symbol_596.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_596.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_113.getOwnedOperations().add(symbol_596);
		}
		symbol_1.getOwnedTypes().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		//
		// ocl::OclVoid http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		//
		symbol_114.setName("OclVoid");
		symbol_114.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		{	// ocl::OclVoid::<>()
			Operation symbol_598 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_598.setName("<>");
			symbol_598.setType(symbol_12);  // Boolean
			
			Parameter symbol_599 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_599.setName("object2");
			symbol_599.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_598.getOwnedParameters().add(symbol_599);
			symbol_598.setPrecedence(symbol_7);
			symbol_598.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_598.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_598);
		}
		{	// ocl::OclVoid::=()
			Operation symbol_600 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_600.setName("=");
			symbol_600.setType(symbol_12);  // Boolean
			
			Parameter symbol_601 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_601.setName("object2");
			symbol_601.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_600.getOwnedParameters().add(symbol_601);
			symbol_600.setPrecedence(symbol_7);
			symbol_600.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_600.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_600);
		}
		{	// ocl::OclVoid::allInstances()
			Operation symbol_602 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!allInstances()
			symbol_602.setName("allInstances");
			symbol_602.setType(symbol_317);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
			
			symbol_602.setIsStatic(true);
			symbol_602.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation");
			symbol_602.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_602);
		}
		{	// ocl::OclVoid::and()
			Operation symbol_603 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!and(Boolean)
			symbol_603.setName("and");
			symbol_603.setType(symbol_12);  // Boolean
			
			Parameter symbol_604 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!and(Boolean)!b
			symbol_604.setName("b");
			symbol_604.setType(symbol_12);  // Boolean
			
			symbol_603.getOwnedParameters().add(symbol_604);
			symbol_603.setPrecedence(symbol_8);
			symbol_603.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation");
			symbol_603.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_603);
		}
		{	// ocl::OclVoid::implies()
			Operation symbol_605 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!implies(Boolean)
			symbol_605.setName("implies");
			symbol_605.setType(symbol_12);  // Boolean
			
			Parameter symbol_606 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!implies(Boolean)!b
			symbol_606.setName("b");
			symbol_606.setType(symbol_12);  // Boolean
			
			symbol_605.getOwnedParameters().add(symbol_606);
			symbol_605.setPrecedence(symbol_11);
			symbol_605.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation");
			symbol_605.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_605);
		}
		{	// ocl::OclVoid::or()
			Operation symbol_607 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!or(Boolean)
			symbol_607.setName("or");
			symbol_607.setType(symbol_12);  // Boolean
			
			Parameter symbol_608 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!or(Boolean)!b
			symbol_608.setName("b");
			symbol_608.setType(symbol_12);  // Boolean
			
			symbol_607.getOwnedParameters().add(symbol_608);
			symbol_607.setPrecedence(symbol_9);
			symbol_607.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation");
			symbol_607.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_607);
		}
		{	// ocl::OclVoid::toString()
			Operation symbol_609 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid!toString()
			symbol_609.setName("toString");
			symbol_609.setType(symbol_15);  // String
			
			symbol_609.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_609.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_114.getOwnedOperations().add(symbol_609);
		}
		symbol_1.getOwnedTypes().add(symbol_114); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclVoid
		//
		// ocl::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}
		//
		symbol_115.setName("OrderedCollection");
		symbol_115.setElementType(symbol_118);
		symbol_118.setName("T");
		symbol_117.setOwnedParameteredElement(symbol_118);
		symbol_116.getOwnedParameters().add(symbol_117);
		
		symbol_115.setOwnedTemplateSignature(symbol_116);
		symbol_115.getSuperClasses().add(symbol_234); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		{	// ocl::OrderedCollection::at()
			Operation symbol_610 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!at(Integer)
			symbol_610.setName("at");
			symbol_610.setType(symbol_118);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
			
			Parameter symbol_611 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!at(Integer)!index
			symbol_611.setName("index");
			symbol_611.setType(symbol_13);  // Integer
			
			symbol_610.getOwnedParameters().add(symbol_611);
			symbol_610.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation");
			symbol_610.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_610);
		}
		{	// ocl::OrderedCollection::closure()
			Iteration symbol_612 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])
			symbol_612.setName("closure");
			symbol_612.setType(symbol_303);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
			
			Parameter symbol_613 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])!i
			symbol_613.setName("i");
			symbol_613.setType(symbol_118); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
			symbol_612.getOwnedIterators().add(symbol_613);
			Parameter symbol_614 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!closure(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T])!body
			symbol_614.setName("body");
			symbol_614.setType(symbol_172);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
			
			symbol_612.getOwnedParameters().add(symbol_614);
			symbol_612.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ClosureIteration");
			symbol_612.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_612);
		}
		{	// ocl::OrderedCollection::collect()
			Iteration symbol_615 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)
			symbol_121.setName("V");
			symbol_120.setOwnedParameteredElement(symbol_121);
			symbol_119.getOwnedParameters().add(symbol_120);
			
			symbol_615.setOwnedTemplateSignature(symbol_119);
			symbol_615.setName("collect");
			symbol_615.setType(symbol_309);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_616 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)!i
			symbol_616.setName("i");
			symbol_616.setType(symbol_118); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
			symbol_615.getOwnedIterators().add(symbol_616);
			Parameter symbol_617 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)!body
			symbol_617.setName("body");
			symbol_617.setType(symbol_171);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
			
			symbol_615.getOwnedParameters().add(symbol_617);
			symbol_615.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_615.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_615);
		}
		{	// ocl::OrderedCollection::collectNested()
			Iteration symbol_618 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)
			symbol_124.setName("V");
			symbol_123.setOwnedParameteredElement(symbol_124);
			symbol_122.getOwnedParameters().add(symbol_123);
			
			symbol_618.setOwnedTemplateSignature(symbol_122);
			symbol_618.setName("collectNested");
			symbol_618.setType(symbol_310);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
			
			Parameter symbol_619 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!i
			symbol_619.setName("i");
			symbol_619.setType(symbol_118); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
			symbol_618.getOwnedIterators().add(symbol_619);
			Parameter symbol_620 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!body
			symbol_620.setName("body");
			symbol_620.setType(symbol_170);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
			
			symbol_618.getOwnedParameters().add(symbol_620);
			symbol_618.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_618.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_618);
		}
		{	// ocl::OrderedCollection::first()
			Operation symbol_621 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!first()
			symbol_621.setName("first");
			symbol_621.setType(symbol_118);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
			
			symbol_621.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation");
			symbol_621.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_621);
		}
		{	// ocl::OrderedCollection::indexOf()
			Operation symbol_622 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!indexOf(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_622.setName("indexOf");
			symbol_622.setType(symbol_13);  // Integer
			
			Parameter symbol_623 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!indexOf(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!obj
			symbol_623.setName("obj");
			symbol_623.setType(symbol_90);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_622.getOwnedParameters().add(symbol_623);
			symbol_622.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation");
			symbol_622.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_622);
		}
		{	// ocl::OrderedCollection::last()
			Operation symbol_624 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!last()
			symbol_624.setName("last");
			symbol_624.setType(symbol_118);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T
			
			symbol_624.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation");
			symbol_624.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_624);
		}
		{	// ocl::OrderedCollection::reverse()
			Operation symbol_625 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!reverse()
			symbol_625.setName("reverse");
			symbol_625.setType(symbol_115);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}
			
			symbol_625.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_625.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_115.getOwnedOperations().add(symbol_625);
		}
		symbol_1.getOwnedTypes().add(symbol_115); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}
		//
		// ocl::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
		//
		symbol_125.setName("OrderedSet");
		symbol_125.setElementType(symbol_128);
		symbol_128.setName("T");
		symbol_127.setOwnedParameteredElement(symbol_128);
		symbol_126.getOwnedParameters().add(symbol_127);
		
		symbol_125.setOwnedTemplateSignature(symbol_126);
		symbol_125.getSuperClasses().add(symbol_297); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_125.getSuperClasses().add(symbol_346); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		{	// ocl::OrderedSet::-()
			Operation symbol_626 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_626.setName("-");
			symbol_626.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_627 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_627.setName("s");
			symbol_627.setType(symbol_316);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			symbol_626.getOwnedParameters().add(symbol_627);
			symbol_626.setPrecedence(symbol_5);
			symbol_626.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_626.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_626);
		}
		{	// ocl::OrderedSet::<>()
			Operation symbol_628 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_628.setName("<>");
			symbol_628.setType(symbol_12);  // Boolean
			
			Parameter symbol_629 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_629.setName("object2");
			symbol_629.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_628.getOwnedParameters().add(symbol_629);
			symbol_628.setPrecedence(symbol_7);
			symbol_628.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_628.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_628);
		}
		{	// ocl::OrderedSet::=()
			Operation symbol_630 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_630.setName("=");
			symbol_630.setType(symbol_12);  // Boolean
			
			Parameter symbol_631 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_631.setName("object2");
			symbol_631.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_630.getOwnedParameters().add(symbol_631);
			symbol_630.setPrecedence(symbol_7);
			symbol_630.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_630.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_630);
		}
		{	// ocl::OrderedSet::append()
			Operation symbol_632 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!append(T)
			symbol_632.setName("append");
			symbol_632.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_633 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!append(T)!object
			symbol_633.setName("object");
			symbol_633.setType(symbol_128);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_632.getOwnedParameters().add(symbol_633);
			symbol_632.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation");
			symbol_632.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_632);
		}
		{	// ocl::OrderedSet::excluding()
			Operation symbol_634 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_634.setName("excluding");
			symbol_634.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_635 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_635.setName("object");
			symbol_635.setType(symbol_90);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_634.getOwnedParameters().add(symbol_635);
			symbol_634.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_634.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_634);
		}
		{	// ocl::OrderedSet::flatten()
			Operation symbol_636 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()
			symbol_131.setName("T2");
			symbol_130.setOwnedParameteredElement(symbol_131);
			symbol_129.getOwnedParameters().add(symbol_130);
			
			symbol_636.setOwnedTemplateSignature(symbol_129);
			symbol_636.setName("flatten");
			symbol_636.setType(symbol_304);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
			
			symbol_636.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_636.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_636);
		}
		{	// ocl::OrderedSet::including()
			Operation symbol_637 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!including(T)
			symbol_637.setName("including");
			symbol_637.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_638 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!including(T)!object
			symbol_638.setName("object");
			symbol_638.setType(symbol_128);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_637.getOwnedParameters().add(symbol_638);
			symbol_637.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_637.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_637);
		}
		{	// ocl::OrderedSet::insertAt()
			Operation symbol_639 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)
			symbol_639.setName("insertAt");
			symbol_639.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_640 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)!index
			symbol_640.setName("index");
			symbol_640.setType(symbol_13);  // Integer
			
			symbol_639.getOwnedParameters().add(symbol_640);
			Parameter symbol_641 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!insertAt(Integer,T)!object
			symbol_641.setName("object");
			symbol_641.setType(symbol_128);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_639.getOwnedParameters().add(symbol_641);
			symbol_639.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation");
			symbol_639.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_639);
		}
		{	// ocl::OrderedSet::intersection()
			Operation symbol_642 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_642.setName("intersection");
			symbol_642.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_643 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!o
			symbol_643.setName("o");
			symbol_643.setType(symbol_318);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
			
			symbol_642.getOwnedParameters().add(symbol_643);
			symbol_642.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_642.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_642);
		}
		{	// ocl::OrderedSet::prepend()
			Operation symbol_644 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!prepend(T)
			symbol_644.setName("prepend");
			symbol_644.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_645 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!prepend(T)!object
			symbol_645.setName("object");
			symbol_645.setType(symbol_128);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			
			symbol_644.getOwnedParameters().add(symbol_645);
			symbol_644.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation");
			symbol_644.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_644);
		}
		{	// ocl::OrderedSet::reject()
			Iteration symbol_646 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)
			symbol_646.setName("reject");
			symbol_646.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_647 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)!i
			symbol_647.setName("i");
			symbol_647.setType(symbol_128); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			symbol_646.getOwnedIterators().add(symbol_647);
			Parameter symbol_648 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reject(T|Lambda~T()Boolean)!body
			symbol_648.setName("body");
			symbol_648.setType(symbol_174);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
			
			symbol_646.getOwnedParameters().add(symbol_648);
			symbol_646.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_646.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_646);
		}
		{	// ocl::OrderedSet::reverse()
			Operation symbol_649 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!reverse()
			symbol_649.setName("reverse");
			symbol_649.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			symbol_649.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_649.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_649);
		}
		{	// ocl::OrderedSet::select()
			Iteration symbol_650 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)
			symbol_650.setName("select");
			symbol_650.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_651 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)!i
			symbol_651.setName("i");
			symbol_651.setType(symbol_128); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T
			symbol_650.getOwnedIterators().add(symbol_651);
			Parameter symbol_652 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!select(T|Lambda~T()Boolean)!body
			symbol_652.setName("body");
			symbol_652.setType(symbol_173);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
			
			symbol_650.getOwnedParameters().add(symbol_652);
			symbol_650.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_650.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_650);
		}
		{	// ocl::OrderedSet::subOrderedSet()
			Operation symbol_653 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)
			symbol_653.setName("subOrderedSet");
			symbol_653.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_654 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)!lower
			symbol_654.setName("lower");
			symbol_654.setType(symbol_13);  // Integer
			
			symbol_653.getOwnedParameters().add(symbol_654);
			Parameter symbol_655 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!subOrderedSet(Integer,Integer)!upper
			symbol_655.setName("upper");
			symbol_655.setType(symbol_13);  // Integer
			
			symbol_653.getOwnedParameters().add(symbol_655);
			symbol_653.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation");
			symbol_653.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_653);
		}
		{	// ocl::OrderedSet::symmetricDifference()
			Operation symbol_656 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_656.setName("symmetricDifference");
			symbol_656.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_657 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_657.setName("s");
			symbol_657.setType(symbol_316);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			symbol_656.getOwnedParameters().add(symbol_657);
			symbol_656.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation");
			symbol_656.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_656);
		}
		{	// ocl::OrderedSet::union()
			Operation symbol_658 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T})
			symbol_658.setName("union");
			symbol_658.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			Parameter symbol_659 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T})!o
			symbol_659.setName("o");
			symbol_659.setType(symbol_125);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
			
			symbol_658.getOwnedParameters().add(symbol_659);
			symbol_658.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_658.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_658);
		}
		{	// ocl::OrderedSet::union()
			Operation symbol_660 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])
			symbol_660.setName("union");
			symbol_660.setType(symbol_318);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
			
			Parameter symbol_661 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T])!s
			symbol_661.setName("s");
			symbol_661.setType(symbol_318);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
			
			symbol_660.getOwnedParameters().add(symbol_661);
			symbol_660.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_660.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_125.getOwnedOperations().add(symbol_660);
		}
		symbol_1.getOwnedTypes().add(symbol_125); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}
		//
		// ocl::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
		//
		symbol_132.setName("Sequence");
		symbol_132.setElementType(symbol_135);
		symbol_135.setName("T");
		symbol_134.setOwnedParameteredElement(symbol_135);
		symbol_133.getOwnedParameters().add(symbol_134);
		
		symbol_132.setOwnedTemplateSignature(symbol_133);
		symbol_132.getSuperClasses().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		symbol_132.getSuperClasses().add(symbol_288); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		{	// ocl::Sequence::<>()
			Operation symbol_662 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_662.setName("<>");
			symbol_662.setType(symbol_12);  // Boolean
			
			Parameter symbol_663 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_663.setName("object2");
			symbol_663.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_662.getOwnedParameters().add(symbol_663);
			symbol_662.setPrecedence(symbol_7);
			symbol_662.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_662.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_662);
		}
		{	// ocl::Sequence::=()
			Operation symbol_664 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_664.setName("=");
			symbol_664.setType(symbol_12);  // Boolean
			
			Parameter symbol_665 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_665.setName("object2");
			symbol_665.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_664.getOwnedParameters().add(symbol_665);
			symbol_664.setPrecedence(symbol_7);
			symbol_664.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_664.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_664);
		}
		{	// ocl::Sequence::append()
			Operation symbol_666 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!append(T)
			symbol_666.setName("append");
			symbol_666.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_667 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!append(T)!object
			symbol_667.setName("object");
			symbol_667.setType(symbol_135);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_666.getOwnedParameters().add(symbol_667);
			symbol_666.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation");
			symbol_666.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_666);
		}
		{	// ocl::Sequence::excluding()
			Operation symbol_668 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_668.setName("excluding");
			symbol_668.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_669 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_669.setName("object");
			symbol_669.setType(symbol_90);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_668.getOwnedParameters().add(symbol_669);
			symbol_668.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_668.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_668);
		}
		{	// ocl::Sequence::flatten()
			Operation symbol_670 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()
			symbol_138.setName("T2");
			symbol_137.setOwnedParameteredElement(symbol_138);
			symbol_136.getOwnedParameters().add(symbol_137);
			
			symbol_670.setOwnedTemplateSignature(symbol_136);
			symbol_670.setName("flatten");
			symbol_670.setType(symbol_311);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
			
			symbol_670.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_670.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_670);
		}
		{	// ocl::Sequence::including()
			Operation symbol_671 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!including(T)
			symbol_671.setName("including");
			symbol_671.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_672 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!including(T)!object
			symbol_672.setName("object");
			symbol_672.setType(symbol_135);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_671.getOwnedParameters().add(symbol_672);
			symbol_671.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_671.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_671);
		}
		{	// ocl::Sequence::insertAt()
			Operation symbol_673 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)
			symbol_673.setName("insertAt");
			symbol_673.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_674 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)!index
			symbol_674.setName("index");
			symbol_674.setType(symbol_13);  // Integer
			
			symbol_673.getOwnedParameters().add(symbol_674);
			Parameter symbol_675 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!insertAt(Integer,T)!object
			symbol_675.setName("object");
			symbol_675.setType(symbol_135);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_673.getOwnedParameters().add(symbol_675);
			symbol_673.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation");
			symbol_673.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_673);
		}
		{	// ocl::Sequence::prepend()
			Operation symbol_676 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!prepend(T)
			symbol_676.setName("prepend");
			symbol_676.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_677 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!prepend(T)!object
			symbol_677.setName("object");
			symbol_677.setType(symbol_135);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			
			symbol_676.getOwnedParameters().add(symbol_677);
			symbol_676.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation");
			symbol_676.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_676);
		}
		{	// ocl::Sequence::reject()
			Iteration symbol_678 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)
			symbol_678.setName("reject");
			symbol_678.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_679 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)!i
			symbol_679.setName("i");
			symbol_679.setType(symbol_135); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			symbol_678.getOwnedIterators().add(symbol_679);
			Parameter symbol_680 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reject(T|Lambda~T()Boolean)!body
			symbol_680.setName("body");
			symbol_680.setType(symbol_176);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
			
			symbol_678.getOwnedParameters().add(symbol_680);
			symbol_678.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_678.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_678);
		}
		{	// ocl::Sequence::reverse()
			Operation symbol_681 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!reverse()
			symbol_681.setName("reverse");
			symbol_681.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			symbol_681.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_681.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_681);
		}
		{	// ocl::Sequence::select()
			Iteration symbol_682 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)
			symbol_682.setName("select");
			symbol_682.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_683 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)!i
			symbol_683.setName("i");
			symbol_683.setType(symbol_135); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T
			symbol_682.getOwnedIterators().add(symbol_683);
			Parameter symbol_684 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!select(T|Lambda~T()Boolean)!body
			symbol_684.setName("body");
			symbol_684.setType(symbol_175);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
			
			symbol_682.getOwnedParameters().add(symbol_684);
			symbol_682.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_682.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_682);
		}
		{	// ocl::Sequence::subSequence()
			Operation symbol_685 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)
			symbol_685.setName("subSequence");
			symbol_685.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_686 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)!lower
			symbol_686.setName("lower");
			symbol_686.setType(symbol_13);  // Integer
			
			symbol_685.getOwnedParameters().add(symbol_686);
			Parameter symbol_687 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!subSequence(Integer,Integer)!upper
			symbol_687.setName("upper");
			symbol_687.setType(symbol_13);  // Integer
			
			symbol_685.getOwnedParameters().add(symbol_687);
			symbol_685.setImplementationClass("org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation");
			symbol_685.setImplementation(org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_685);
		}
		{	// ocl::Sequence::union()
			Operation symbol_688 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T})
			symbol_688.setName("union");
			symbol_688.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			Parameter symbol_689 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!union(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T})!s
			symbol_689.setName("s");
			symbol_689.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
			
			symbol_688.getOwnedParameters().add(symbol_689);
			symbol_688.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_688.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_132.getOwnedOperations().add(symbol_688);
		}
		symbol_1.getOwnedTypes().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}
		//
		// ocl::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
		//
		symbol_139.setName("Set");
		symbol_139.setElementType(symbol_142);
		symbol_142.setName("T");
		symbol_141.setOwnedParameteredElement(symbol_142);
		symbol_140.getOwnedParameters().add(symbol_141);
		
		symbol_139.setOwnedTemplateSignature(symbol_140);
		symbol_139.getSuperClasses().add(symbol_273); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		symbol_139.getSuperClasses().add(symbol_349); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		{	// ocl::Set::-()
			Operation symbol_690 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_690.setName("-");
			symbol_690.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_691 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!-(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_691.setName("s");
			symbol_691.setType(symbol_316);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			symbol_690.getOwnedParameters().add(symbol_691);
			symbol_690.setPrecedence(symbol_5);
			symbol_690.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_690.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_690);
		}
		{	// ocl::Set::<>()
			Operation symbol_692 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_692.setName("<>");
			symbol_692.setType(symbol_12);  // Boolean
			
			Parameter symbol_693 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!<>(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_693.setName("object2");
			symbol_693.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_692.getOwnedParameters().add(symbol_693);
			symbol_692.setPrecedence(symbol_7);
			symbol_692.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_692.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_692);
		}
		{	// ocl::Set::=()
			Operation symbol_694 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)
			symbol_694.setName("=");
			symbol_694.setType(symbol_12);  // Boolean
			
			Parameter symbol_695 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!=(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf)!object2
			symbol_695.setName("object2");
			symbol_695.setType(symbol_111);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf
			
			symbol_694.getOwnedParameters().add(symbol_695);
			symbol_694.setPrecedence(symbol_7);
			symbol_694.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_694.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_694);
		}
		{	// ocl::Set::excluding()
			Operation symbol_696 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_696.setName("excluding");
			symbol_696.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_697 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!excluding(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!object
			symbol_697.setName("object");
			symbol_697.setType(symbol_90);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_696.getOwnedParameters().add(symbol_697);
			symbol_696.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_696.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_696);
		}
		{	// ocl::Set::flatten()
			Operation symbol_698 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()
			symbol_145.setName("T2");
			symbol_144.setOwnedParameteredElement(symbol_145);
			symbol_143.getOwnedParameters().add(symbol_144);
			
			symbol_698.setOwnedTemplateSignature(symbol_143);
			symbol_698.setName("flatten");
			symbol_698.setType(symbol_319);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
			
			symbol_698.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_698.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_698);
		}
		{	// ocl::Set::including()
			Operation symbol_699 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!including(T)
			symbol_699.setName("including");
			symbol_699.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_700 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!including(T)!object
			symbol_700.setName("object");
			symbol_700.setType(symbol_142);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			
			symbol_699.getOwnedParameters().add(symbol_700);
			symbol_699.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_699.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_699);
		}
		{	// ocl::Set::intersection()
			Operation symbol_701 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T})
			symbol_701.setName("intersection");
			symbol_701.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_702 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!intersection(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T})!s
			symbol_702.setName("s");
			symbol_702.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			symbol_701.getOwnedParameters().add(symbol_702);
			symbol_701.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_701.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_701);
		}
		{	// ocl::Set::reject()
			Iteration symbol_703 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)
			symbol_703.setName("reject");
			symbol_703.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_704 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)!i
			symbol_704.setName("i");
			symbol_704.setType(symbol_142); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			symbol_703.getOwnedIterators().add(symbol_704);
			Parameter symbol_705 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!reject(T|Lambda~T()Boolean)!body
			symbol_705.setName("body");
			symbol_705.setType(symbol_177);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
			
			symbol_703.getOwnedParameters().add(symbol_705);
			symbol_703.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_703.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_703);
		}
		{	// ocl::Set::select()
			Iteration symbol_706 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)
			symbol_706.setName("select");
			symbol_706.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_707 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)!i
			symbol_707.setName("i");
			symbol_707.setType(symbol_142); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T
			symbol_706.getOwnedIterators().add(symbol_707);
			Parameter symbol_708 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!select(T|Lambda~T()Boolean)!body
			symbol_708.setName("body");
			symbol_708.setType(symbol_178);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
			
			symbol_706.getOwnedParameters().add(symbol_708);
			symbol_706.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_706.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_706);
		}
		{	// ocl::Set::symmetricDifference()
			Operation symbol_709 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])
			symbol_709.setName("symmetricDifference");
			symbol_709.setType(symbol_139);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
			
			Parameter symbol_710 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!symmetricDifference(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny])!s
			symbol_710.setName("s");
			symbol_710.setType(symbol_316);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
			
			symbol_709.getOwnedParameters().add(symbol_710);
			symbol_709.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation");
			symbol_709.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_139.getOwnedOperations().add(symbol_709);
		}
		symbol_1.getOwnedTypes().add(symbol_139); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}
		//
		// ocl::Summable http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Summable
		//
		symbol_146.setName("Summable");
		symbol_146.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_1.getOwnedTypes().add(symbol_146); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Summable
		//
		// ocl::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
		//
		symbol_147.setName("UniqueCollection");
		symbol_147.setElementType(symbol_150);
		symbol_150.setName("T");
		symbol_149.setOwnedParameteredElement(symbol_150);
		symbol_148.getOwnedParameters().add(symbol_149);
		
		symbol_147.setOwnedTemplateSignature(symbol_148);
		symbol_147.getSuperClasses().add(symbol_243); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		{	// ocl::UniqueCollection::sortedBy()
			Iteration symbol_711 = PivotFactory.eINSTANCE.createIteration(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)
			symbol_711.setName("sortedBy");
			symbol_711.setType(symbol_305);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
			
			Parameter symbol_712 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!i
			symbol_712.setName("i");
			symbol_712.setType(symbol_150); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T
			symbol_711.getOwnedIterators().add(symbol_712);
			Parameter symbol_713 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}!sortedBy(T|Lambda~T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny)!body
			symbol_713.setName("body");
			symbol_713.setType(symbol_179);  // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
			
			symbol_711.getOwnedParameters().add(symbol_713);
			symbol_711.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_711.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_147.getOwnedOperations().add(symbol_711);
		}
		symbol_1.getOwnedTypes().add(symbol_147); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}
		//
		// ocl::$$ http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0
		//
		symbol_151.setName("$$");
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		symbol_152.setName("Lambda");
		symbol_152.setContextType(symbol_23);
		symbol_152.setResultType(symbol_12);
		symbol_152.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_152); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		symbol_153.setName("Lambda");
		symbol_153.setContextType(symbol_23);
		symbol_153.setResultType(symbol_12);
		symbol_153.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_153); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_154.setName("Lambda");
		symbol_154.setContextType(symbol_46);
		symbol_154.setResultType(symbol_12);
		symbol_154.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_154); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_155.setName("Lambda");
		symbol_155.setContextType(symbol_46);
		symbol_155.setResultType(symbol_12);
		symbol_155.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_155); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_156.setName("Lambda");
		symbol_156.setContextType(symbol_46);
		symbol_156.setResultType(symbol_12);
		symbol_156.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_156); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_157.setName("Lambda");
		symbol_157.setContextType(symbol_46);
		symbol_157.setResultType(symbol_12);
		symbol_157.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_157); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_158.setName("Lambda");
		symbol_158.setContextType(symbol_46);
		symbol_158.setResultType(symbol_12);
		symbol_158.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_158); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_159.setName("Lambda");
		symbol_159.setContextType(symbol_46);
		symbol_159.setResultType(symbol_12);
		symbol_159.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_159); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_160.setName("Lambda");
		symbol_160.setContextType(symbol_46);
		symbol_160.setResultType(symbol_12);
		symbol_160.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_160); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		symbol_161.setName("Lambda");
		symbol_161.setContextType(symbol_46);
		symbol_161.setResultType(symbol_12);
		symbol_161.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_161); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_162.setName("Lambda");
		symbol_162.setContextType(symbol_46);
		symbol_162.setResultType(symbol_52);
		symbol_162.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_162); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_163.setName("Lambda");
		symbol_163.setContextType(symbol_46);
		symbol_163.setResultType(symbol_49);
		symbol_163.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_163); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_164.setName("Lambda");
		symbol_164.setContextType(symbol_46);
		symbol_164.setResultType(symbol_90);
		symbol_164.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_164); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_165.setName("Lambda");
		symbol_165.setContextType(symbol_46);
		symbol_165.setResultType(symbol_90);
		symbol_165.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_165); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_166.setName("Lambda");
		symbol_166.setContextType(symbol_79);
		symbol_166.setResultType(symbol_85);
		symbol_166.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_166); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_167.setName("Lambda");
		symbol_167.setContextType(symbol_79);
		symbol_167.setResultType(symbol_82);
		symbol_167.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_167); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
		//
		symbol_168.setName("Lambda");
		symbol_168.setContextType(symbol_79);
		symbol_168.setResultType(symbol_315);
		symbol_168.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_168); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[T]
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_169.setName("Lambda");
		symbol_169.setContextType(symbol_89);
		symbol_169.setResultType(symbol_90);
		symbol_169.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_169); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_170.setName("Lambda");
		symbol_170.setContextType(symbol_118);
		symbol_170.setResultType(symbol_124);
		symbol_170.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_170); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_171.setName("Lambda");
		symbol_171.setContextType(symbol_118);
		symbol_171.setResultType(symbol_121);
		symbol_171.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_171); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
		//
		symbol_172.setName("Lambda");
		symbol_172.setContextType(symbol_118);
		symbol_172.setResultType(symbol_303);
		symbol_172.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_172); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[T]
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		symbol_173.setName("Lambda");
		symbol_173.setContextType(symbol_128);
		symbol_173.setResultType(symbol_12);
		symbol_173.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_173); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		symbol_174.setName("Lambda");
		symbol_174.setContextType(symbol_128);
		symbol_174.setResultType(symbol_12);
		symbol_174.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_174); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		symbol_175.setName("Lambda");
		symbol_175.setContextType(symbol_135);
		symbol_175.setResultType(symbol_12);
		symbol_175.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_175); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		symbol_176.setName("Lambda");
		symbol_176.setContextType(symbol_135);
		symbol_176.setResultType(symbol_12);
		symbol_176.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_176); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		symbol_177.setName("Lambda");
		symbol_177.setContextType(symbol_142);
		symbol_177.setResultType(symbol_12);
		symbol_177.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_177); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		symbol_178.setName("Lambda");
		symbol_178.setContextType(symbol_142);
		symbol_178.setResultType(symbol_12);
		symbol_178.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_178); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T()Boolean
		//
		// ocl::$$::Lambda Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		symbol_179.setName("Lambda");
		symbol_179.setContextType(symbol_150);
		symbol_179.setResultType(symbol_90);
		symbol_179.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclLambda
		symbol_151.getOwnedTypes().add(symbol_179); // Lambda~http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T()http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_180.setName("Tuple");
		symbol_180.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_181.setName("first");
			symbol_181.setType(symbol_46);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_181.setIsResolveProxies(true);
			symbol_180.getOwnedAttributes().add(symbol_181);
		}
		{ // ocl::$$::Tuple::second
			symbol_182.setName("second");
			symbol_182.setType(symbol_67);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_182.setIsResolveProxies(true);
			symbol_180.getOwnedAttributes().add(symbol_182);
		}
		symbol_151.getOwnedTypes().add(symbol_180); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_183.setName("Tuple");
		symbol_183.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_184.setName("first");
			symbol_184.setType(symbol_46);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_184.setIsResolveProxies(true);
			symbol_183.getOwnedAttributes().add(symbol_184);
		}
		{ // ocl::$$::Tuple::second
			symbol_185.setName("second");
			symbol_185.setType(symbol_67);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_185.setIsResolveProxies(true);
			symbol_183.getOwnedAttributes().add(symbol_185);
		}
		symbol_151.getOwnedTypes().add(symbol_183); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_186.setName("Tuple");
		symbol_186.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_187.setName("first");
			symbol_187.setType(symbol_46);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_187.setIsResolveProxies(true);
			symbol_186.getOwnedAttributes().add(symbol_187);
		}
		{ // ocl::$$::Tuple::second
			symbol_188.setName("second");
			symbol_188.setType(symbol_67);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_188.setIsResolveProxies(true);
			symbol_186.getOwnedAttributes().add(symbol_188);
		}
		symbol_151.getOwnedTypes().add(symbol_186); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Tuple Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		symbol_189.setName("Tuple");
		symbol_189.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclTuple
		{ // ocl::$$::Tuple::first
			symbol_190.setName("first");
			symbol_190.setType(symbol_46);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T
			
			symbol_190.setIsResolveProxies(true);
			symbol_189.getOwnedAttributes().add(symbol_190);
		}
		{ // ocl::$$::Tuple::second
			symbol_191.setName("second");
			symbol_191.setType(symbol_67);  // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2
			
			symbol_191.setIsResolveProxies(true);
			symbol_189.getOwnedAttributes().add(symbol_191);
		}
		symbol_151.getOwnedTypes().add(symbol_189); // Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		symbol_192.setName("Bag");
		symbol_192.setElementType(symbol_26);
		symbol_192.setUnspecializedElement(symbol_20);
		{
			TemplateBinding symbol_714 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_714.setSignature(symbol_21);
			{
				TemplateParameterSubstitution symbol_715 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_715.setFormal(symbol_22);	
				symbol_715.setActual(symbol_26);	
				symbol_714.getParameterSubstitutions().add(symbol_715);
			}
			symbol_192.getTemplateBindings().add(symbol_714);
		}
		symbol_192.getSuperClasses().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		symbol_192.getSuperClasses().add(symbol_275); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		symbol_151.getOwnedTypes().add(symbol_192); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_193.setName("Bag");
		symbol_193.setElementType(symbol_46);
		symbol_193.setUnspecializedElement(symbol_20);
		{
			TemplateBinding symbol_716 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_716.setSignature(symbol_21);
			{
				TemplateParameterSubstitution symbol_717 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_717.setFormal(symbol_22);	
				symbol_717.setActual(symbol_46);	
				symbol_716.getParameterSubstitutions().add(symbol_717);
			}
			symbol_193.getTemplateBindings().add(symbol_716);
		}
		symbol_193.getSuperClasses().add(symbol_251); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_193.getSuperClasses().add(symbol_277); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_193); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_194.setName("Bag");
		symbol_194.setElementType(symbol_82);
		symbol_194.setUnspecializedElement(symbol_20);
		{
			TemplateBinding symbol_718 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_718.setSignature(symbol_21);
			{
				TemplateParameterSubstitution symbol_719 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_719.setFormal(symbol_22);	
				symbol_719.setActual(symbol_82);	
				symbol_718.getParameterSubstitutions().add(symbol_719);
			}
			symbol_194.getTemplateBindings().add(symbol_718);
		}
		symbol_194.getSuperClasses().add(symbol_252); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_194.getSuperClasses().add(symbol_278); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_151.getOwnedTypes().add(symbol_194); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Bag http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_195.setName("Bag");
		symbol_195.setElementType(symbol_79);
		symbol_195.setUnspecializedElement(symbol_20);
		{
			TemplateBinding symbol_720 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_720.setSignature(symbol_21);
			{
				TemplateParameterSubstitution symbol_721 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_721.setFormal(symbol_22);	
				symbol_721.setActual(symbol_79);	
				symbol_720.getParameterSubstitutions().add(symbol_721);
			}
			symbol_195.getTemplateBindings().add(symbol_720);
		}
		symbol_195.getSuperClasses().add(symbol_255); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_195.getSuperClasses().add(symbol_282); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_195); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::ClassClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_196.setName("ClassClassifier");
		symbol_196.setInstanceType(symbol_111);
		symbol_196.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_722 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_722.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_723 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_723.setFormal(symbol_30);	
				symbol_723.setActual(symbol_111);	
				symbol_722.getParameterSubstitutions().add(symbol_723);
			}
			symbol_196.getTemplateBindings().add(symbol_722);
		}
		symbol_196.getSuperClasses().add(symbol_209); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_196); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])?TT]
		//
		symbol_197.setName("Classifier");
		symbol_197.setInstanceType(symbol_19);
		symbol_197.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_724 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_724.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_725 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_725.setFormal(symbol_34);	
				symbol_725.setActual(symbol_19);	
				symbol_724.getParameterSubstitutions().add(symbol_725);
			}
			symbol_197.getTemplateBindings().add(symbol_724);
		}
		symbol_197.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_197); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[UnlimitedNatural!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])?TT]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		//
		symbol_198.setName("Classifier");
		symbol_198.setInstanceType(symbol_31);
		symbol_198.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_726 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_726.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_727 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_727.setFormal(symbol_34);	
				symbol_727.setActual(symbol_31);	
				symbol_726.getParameterSubstitutions().add(symbol_727);
			}
			symbol_198.getTemplateBindings().add(symbol_726);
		}
		symbol_198.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_198); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!ClassClassifier{T}?T]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		//
		symbol_199.setName("Classifier");
		symbol_199.setInstanceType(symbol_39);
		symbol_199.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_728 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_728.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_729 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_729.setFormal(symbol_34);	
				symbol_729.setActual(symbol_39);	
				symbol_728.getParameterSubstitutions().add(symbol_729);
			}
			symbol_199.getTemplateBindings().add(symbol_728);
		}
		symbol_199.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_199); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier{T,E}?T]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		//
		symbol_200.setName("Classifier");
		symbol_200.setInstanceType(symbol_73);
		symbol_200.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_730 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_730.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_731 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_731.setFormal(symbol_34);	
				symbol_731.setActual(symbol_73);	
				symbol_730.getParameterSubstitutions().add(symbol_731);
			}
			symbol_200.getTemplateBindings().add(symbol_730);
		}
		symbol_200.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_200); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier{T}?T]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])?TT]
		//
		symbol_201.setName("Classifier");
		symbol_201.setInstanceType(symbol_93);
		symbol_201.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_732 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_732.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_733 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_733.setFormal(symbol_34);	
				symbol_733.setActual(symbol_93);	
				symbol_732.getParameterSubstitutions().add(symbol_733);
			}
			symbol_201.getTemplateBindings().add(symbol_732);
		}
		symbol_201.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_201); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclAsType{TT}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[TT])?TT]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])?T]
		//
		symbol_202.setName("Classifier");
		symbol_202.setInstanceType(symbol_96);
		symbol_202.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_734 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_734.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_735 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_735.setFormal(symbol_34);	
				symbol_735.setActual(symbol_96);	
				symbol_734.getParameterSubstitutions().add(symbol_735);
			}
			symbol_202.getTemplateBindings().add(symbol_734);
		}
		symbol_202.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_202); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsKindOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])?T]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])?T]
		//
		symbol_203.setName("Classifier");
		symbol_203.setInstanceType(symbol_99);
		symbol_203.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_736 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_736.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_737 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_737.setFormal(symbol_34);	
				symbol_737.setActual(symbol_99);	
				symbol_736.getParameterSubstitutions().add(symbol_737);
			}
			symbol_203.getTemplateBindings().add(symbol_736);
		}
		symbol_203.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_203); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny!oclIsTypeOf{T}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[T])?T]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()?U]
		//
		symbol_204.setName("Classifier");
		symbol_204.setInstanceType(symbol_103);
		symbol_204.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_738 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_738.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_739 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_739.setFormal(symbol_34);	
				symbol_739.setActual(symbol_103);	
				symbol_738.getParameterSubstitutions().add(symbol_739);
			}
			symbol_204.getTemplateBindings().add(symbol_738);
		}
		symbol_204.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_204); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContainer{U}()?U]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		symbol_205.setName("Classifier");
		symbol_205.setInstanceType(symbol_106);
		symbol_205.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_740 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_740.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_741 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_741.setFormal(symbol_34);	
				symbol_741.setActual(symbol_106);	
				symbol_740.getParameterSubstitutions().add(symbol_741);
			}
			symbol_205.getTemplateBindings().add(symbol_740);
		}
		symbol_205.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_205); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		symbol_206.setName("Classifier");
		symbol_206.setInstanceType(symbol_106);
		symbol_206.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_742 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_742.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_743 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_743.setFormal(symbol_34);	
				symbol_743.setActual(symbol_106);	
				symbol_742.getParameterSubstitutions().add(symbol_743);
			}
			symbol_206.getTemplateBindings().add(symbol_742);
		}
		symbol_206.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_206); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		symbol_207.setName("Classifier");
		symbol_207.setInstanceType(symbol_106);
		symbol_207.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_744 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_744.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_745 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_745.setFormal(symbol_34);	
				symbol_745.setActual(symbol_106);	
				symbol_744.getParameterSubstitutions().add(symbol_745);
			}
			symbol_207.getTemplateBindings().add(symbol_744);
		}
		symbol_207.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_207); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		symbol_208.setName("Classifier");
		symbol_208.setInstanceType(symbol_106);
		symbol_208.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_746 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_746.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_747 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_747.setFormal(symbol_34);	
				symbol_747.setActual(symbol_106);	
				symbol_746.getParameterSubstitutions().add(symbol_747);
			}
			symbol_208.getTemplateBindings().add(symbol_746);
		}
		symbol_208.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_208); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]
		//
		// ocl::$$::Classifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_209.setName("Classifier");
		symbol_209.setInstanceType(symbol_111);
		symbol_209.setUnspecializedElement(symbol_32);
		{
			TemplateBinding symbol_748 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_748.setSignature(symbol_33);
			{
				TemplateParameterSubstitution symbol_749 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_749.setFormal(symbol_34);	
				symbol_749.setActual(symbol_111);	
				symbol_748.getParameterSubstitutions().add(symbol_749);
			}
			symbol_209.getTemplateBindings().add(symbol_748);
		}
		symbol_209.getSuperClasses().add(symbol_27); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Class
		symbol_151.getOwnedTypes().add(symbol_209); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::CollectionClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_210.setName("CollectionClassifier");
		symbol_210.setInstanceType(symbol_111);
		symbol_210.setUnspecializedElement(symbol_36);
		{
			TemplateBinding symbol_750 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_750.setSignature(symbol_37);
			{
				TemplateParameterSubstitution symbol_751 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_751.setFormal(symbol_38);	
				symbol_751.setActual(symbol_111);	
				symbol_750.getParameterSubstitutions().add(symbol_751);
			}{
				TemplateParameterSubstitution symbol_752 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_752.setFormal(symbol_40);	
				symbol_752.setActual(symbol_46);	
				symbol_750.getParameterSubstitutions().add(symbol_752);
			}
			symbol_210.getTemplateBindings().add(symbol_750);
		}
		symbol_210.getSuperClasses().add(symbol_209); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_210); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!CollectionClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf,http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		//
		symbol_211.setName("Collection");
		symbol_211.setElementType(symbol_15);
		symbol_211.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_753 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_753.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_754 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_754.setFormal(symbol_45);	
				symbol_754.setActual(symbol_15);	
				symbol_753.getParameterSubstitutions().add(symbol_754);
			}
			symbol_211.getTemplateBindings().add(symbol_753);
		}
		symbol_211.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_211); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_212.setName("Collection");
		symbol_212.setElementType(symbol_183);
		symbol_212.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_755 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_755.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_756 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_756.setFormal(symbol_45);	
				symbol_756.setActual(symbol_183);	
				symbol_755.getParameterSubstitutions().add(symbol_756);
			}
			symbol_212.getTemplateBindings().add(symbol_755);
		}
		symbol_212.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_212); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_213.setName("Collection");
		symbol_213.setElementType(symbol_183);
		symbol_213.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_757 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_757.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_758 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_758.setFormal(symbol_45);	
				symbol_758.setActual(symbol_183);	
				symbol_757.getParameterSubstitutions().add(symbol_758);
			}
			symbol_213.getTemplateBindings().add(symbol_757);
		}
		symbol_213.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_213); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		symbol_214.setName("Collection");
		symbol_214.setElementType(symbol_26);
		symbol_214.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_759 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_759.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_760 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_760.setFormal(symbol_45);	
				symbol_760.setActual(symbol_26);	
				symbol_759.getParameterSubstitutions().add(symbol_760);
			}
			symbol_214.getTemplateBindings().add(symbol_759);
		}
		symbol_214.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_214); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_215.setName("Collection");
		symbol_215.setElementType(symbol_23);
		symbol_215.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_761 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_761.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_762 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_762.setFormal(symbol_45);	
				symbol_762.setActual(symbol_23);	
				symbol_761.getParameterSubstitutions().add(symbol_762);
			}
			symbol_215.getTemplateBindings().add(symbol_761);
		}
		symbol_215.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_216.setName("Collection");
		symbol_216.setElementType(symbol_207);
		symbol_216.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_763 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_763.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_764 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_764.setFormal(symbol_45);	
				symbol_764.setActual(symbol_207);	
				symbol_763.getParameterSubstitutions().add(symbol_764);
			}
			symbol_216.getTemplateBindings().add(symbol_763);
		}
		symbol_216.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_217.setName("Collection");
		symbol_217.setElementType(symbol_207);
		symbol_217.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_765 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_765.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_766 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_766.setFormal(symbol_45);	
				symbol_766.setActual(symbol_207);	
				symbol_765.getParameterSubstitutions().add(symbol_766);
			}
			symbol_217.getTemplateBindings().add(symbol_765);
		}
		symbol_217.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_217); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_218.setName("Collection");
		symbol_218.setElementType(symbol_49);
		symbol_218.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_767 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_767.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_768 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_768.setFormal(symbol_45);	
				symbol_768.setActual(symbol_49);	
				symbol_767.getParameterSubstitutions().add(symbol_768);
			}
			symbol_218.getTemplateBindings().add(symbol_767);
		}
		symbol_218.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_218); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		symbol_219.setName("Collection");
		symbol_219.setElementType(symbol_55);
		symbol_219.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_769 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_769.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_770 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_770.setFormal(symbol_45);	
				symbol_770.setActual(symbol_55);	
				symbol_769.getParameterSubstitutions().add(symbol_770);
			}
			symbol_219.getTemplateBindings().add(symbol_769);
		}
		symbol_219.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!excludesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
		//
		symbol_220.setName("Collection");
		symbol_220.setElementType(symbol_58);
		symbol_220.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_771 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_771.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_772 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_772.setFormal(symbol_45);	
				symbol_772.setActual(symbol_58);	
				symbol_771.getParameterSubstitutions().add(symbol_772);
			}
			symbol_220.getTemplateBindings().add(symbol_771);
		}
		symbol_220.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_220); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		symbol_221.setName("Collection");
		symbol_221.setElementType(symbol_61);
		symbol_221.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_773 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_773.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_774 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_774.setFormal(symbol_45);	
				symbol_774.setActual(symbol_61);	
				symbol_773.getParameterSubstitutions().add(symbol_774);
			}
			symbol_221.getTemplateBindings().add(symbol_773);
		}
		symbol_221.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_221); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!includesAll{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		symbol_222.setName("Collection");
		symbol_222.setElementType(symbol_67);
		symbol_222.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_775 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_775.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_776 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_776.setFormal(symbol_45);	
				symbol_776.setActual(symbol_67);	
				symbol_775.getParameterSubstitutions().add(symbol_776);
			}
			symbol_222.getTemplateBindings().add(symbol_775);
		}
		symbol_222.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_222); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_223.setName("Collection");
		symbol_223.setElementType(symbol_46);
		symbol_223.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_777 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_777.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_778 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_778.setFormal(symbol_45);	
				symbol_778.setActual(symbol_46);	
				symbol_777.getParameterSubstitutions().add(symbol_778);
			}
			symbol_223.getTemplateBindings().add(symbol_777);
		}
		symbol_223.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_224.setName("Collection");
		symbol_224.setElementType(symbol_46);
		symbol_224.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_779 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_779.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_780 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_780.setFormal(symbol_45);	
				symbol_780.setActual(symbol_46);	
				symbol_779.getParameterSubstitutions().add(symbol_780);
			}
			symbol_224.getTemplateBindings().add(symbol_779);
		}
		symbol_224.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_224); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_225.setName("Collection");
		symbol_225.setElementType(symbol_46);
		symbol_225.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_781 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_781.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_782 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_782.setFormal(symbol_45);	
				symbol_782.setActual(symbol_46);	
				symbol_781.getParameterSubstitutions().add(symbol_782);
			}
			symbol_225.getTemplateBindings().add(symbol_781);
		}
		symbol_225.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_225); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_226.setName("Collection");
		symbol_226.setElementType(symbol_75);
		symbol_226.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_783 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_783.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_784 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_784.setFormal(symbol_45);	
				symbol_784.setActual(symbol_75);	
				symbol_783.getParameterSubstitutions().add(symbol_784);
			}
			symbol_226.getTemplateBindings().add(symbol_783);
		}
		symbol_226.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_226); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_227.setName("Collection");
		symbol_227.setElementType(symbol_82);
		symbol_227.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_785 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_785.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_786 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_786.setFormal(symbol_45);	
				symbol_786.setActual(symbol_82);	
				symbol_785.getParameterSubstitutions().add(symbol_786);
			}
			symbol_227.getTemplateBindings().add(symbol_785);
		}
		symbol_227.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_228.setName("Collection");
		symbol_228.setElementType(symbol_79);
		symbol_228.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_787 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_787.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_788 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_788.setFormal(symbol_45);	
				symbol_788.setActual(symbol_79);	
				symbol_787.getParameterSubstitutions().add(symbol_788);
			}
			symbol_228.getTemplateBindings().add(symbol_787);
		}
		symbol_228.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_229.setName("Collection");
		symbol_229.setElementType(symbol_79);
		symbol_229.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_789 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_789.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_790 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_790.setFormal(symbol_45);	
				symbol_790.setActual(symbol_79);	
				symbol_789.getParameterSubstitutions().add(symbol_790);
			}
			symbol_229.getTemplateBindings().add(symbol_789);
		}
		symbol_229.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		symbol_230.setName("Collection");
		symbol_230.setElementType(symbol_89);
		symbol_230.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_791 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_791.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_792 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_792.setFormal(symbol_45);	
				symbol_792.setActual(symbol_89);	
				symbol_791.getParameterSubstitutions().add(symbol_792);
			}
			symbol_230.getTemplateBindings().add(symbol_791);
		}
		symbol_230.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_231.setName("Collection");
		symbol_231.setElementType(symbol_90);
		symbol_231.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_793 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_793.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_794 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_794.setFormal(symbol_45);	
				symbol_794.setActual(symbol_90);	
				symbol_793.getParameterSubstitutions().add(symbol_794);
			}
			symbol_231.getTemplateBindings().add(symbol_793);
		}
		symbol_231.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_232.setName("Collection");
		symbol_232.setElementType(symbol_111);
		symbol_232.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_795 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_795.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_796 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_796.setFormal(symbol_45);	
				symbol_796.setActual(symbol_111);	
				symbol_795.getParameterSubstitutions().add(symbol_796);
			}
			symbol_232.getTemplateBindings().add(symbol_795);
		}
		symbol_232.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_233.setName("Collection");
		symbol_233.setElementType(symbol_121);
		symbol_233.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_797 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_797.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_798 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_798.setFormal(symbol_45);	
				symbol_798.setActual(symbol_121);	
				symbol_797.getParameterSubstitutions().add(symbol_798);
			}
			symbol_233.getTemplateBindings().add(symbol_797);
		}
		symbol_233.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_233); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_234.setName("Collection");
		symbol_234.setElementType(symbol_118);
		symbol_234.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_799 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_799.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_800 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_800.setFormal(symbol_45);	
				symbol_800.setActual(symbol_118);	
				symbol_799.getParameterSubstitutions().add(symbol_800);
			}
			symbol_234.getTemplateBindings().add(symbol_799);
		}
		symbol_234.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_234); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_235.setName("Collection");
		symbol_235.setElementType(symbol_118);
		symbol_235.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_801 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_801.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_802 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_802.setFormal(symbol_45);	
				symbol_802.setActual(symbol_118);	
				symbol_801.getParameterSubstitutions().add(symbol_802);
			}
			symbol_235.getTemplateBindings().add(symbol_801);
		}
		symbol_235.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_236.setName("Collection");
		symbol_236.setElementType(symbol_131);
		symbol_236.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_803 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_803.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_804 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_804.setFormal(symbol_45);	
				symbol_804.setActual(symbol_131);	
				symbol_803.getParameterSubstitutions().add(symbol_804);
			}
			symbol_236.getTemplateBindings().add(symbol_803);
		}
		symbol_236.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_237.setName("Collection");
		symbol_237.setElementType(symbol_128);
		symbol_237.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_805 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_805.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_806 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_806.setFormal(symbol_45);	
				symbol_806.setActual(symbol_128);	
				symbol_805.getParameterSubstitutions().add(symbol_806);
			}
			symbol_237.getTemplateBindings().add(symbol_805);
		}
		symbol_237.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_238.setName("Collection");
		symbol_238.setElementType(symbol_128);
		symbol_238.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_807 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_807.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_808 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_808.setFormal(symbol_45);	
				symbol_808.setActual(symbol_128);	
				symbol_807.getParameterSubstitutions().add(symbol_808);
			}
			symbol_238.getTemplateBindings().add(symbol_807);
		}
		symbol_238.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_239.setName("Collection");
		symbol_239.setElementType(symbol_138);
		symbol_239.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_809 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_809.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_810 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_810.setFormal(symbol_45);	
				symbol_810.setActual(symbol_138);	
				symbol_809.getParameterSubstitutions().add(symbol_810);
			}
			symbol_239.getTemplateBindings().add(symbol_809);
		}
		symbol_239.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_240.setName("Collection");
		symbol_240.setElementType(symbol_135);
		symbol_240.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_811 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_811.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_812 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_812.setFormal(symbol_45);	
				symbol_812.setActual(symbol_135);	
				symbol_811.getParameterSubstitutions().add(symbol_812);
			}
			symbol_240.getTemplateBindings().add(symbol_811);
		}
		symbol_240.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_240); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_241.setName("Collection");
		symbol_241.setElementType(symbol_145);
		symbol_241.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_813 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_813.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_814 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_814.setFormal(symbol_45);	
				symbol_814.setActual(symbol_145);	
				symbol_813.getParameterSubstitutions().add(symbol_814);
			}
			symbol_241.getTemplateBindings().add(symbol_813);
		}
		symbol_241.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_242.setName("Collection");
		symbol_242.setElementType(symbol_142);
		symbol_242.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_815 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_815.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_816 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_816.setFormal(symbol_45);	
				symbol_816.setActual(symbol_142);	
				symbol_815.getParameterSubstitutions().add(symbol_816);
			}
			symbol_242.getTemplateBindings().add(symbol_815);
		}
		symbol_242.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::Collection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_243.setName("Collection");
		symbol_243.setElementType(symbol_150);
		symbol_243.setUnspecializedElement(symbol_43);
		{
			TemplateBinding symbol_817 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_817.setSignature(symbol_44);
			{
				TemplateParameterSubstitution symbol_818 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_818.setFormal(symbol_45);	
				symbol_818.setActual(symbol_150);	
				symbol_817.getParameterSubstitutions().add(symbol_818);
			}
			symbol_243.getTemplateBindings().add(symbol_817);
		}
		symbol_243.getSuperClasses().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny
		symbol_151.getOwnedTypes().add(symbol_243); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::EnumerationClassifier http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_244.setName("EnumerationClassifier");
		symbol_244.setInstanceType(symbol_111);
		symbol_244.setUnspecializedElement(symbol_70);
		{
			TemplateBinding symbol_819 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_819.setSignature(symbol_71);
			{
				TemplateParameterSubstitution symbol_820 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_820.setFormal(symbol_72);	
				symbol_820.setActual(symbol_111);	
				symbol_819.getParameterSubstitutions().add(symbol_820);
			}
			symbol_244.getTemplateBindings().add(symbol_819);
		}
		symbol_244.getSuperClasses().add(symbol_209); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_244); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationClassifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_245.setName("NonOrderedCollection");
		symbol_245.setElementType(symbol_189);
		symbol_245.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_821 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_821.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_822 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_822.setFormal(symbol_78);	
				symbol_822.setActual(symbol_180);	
				symbol_821.getParameterSubstitutions().add(symbol_822);
			}
			symbol_245.getTemplateBindings().add(symbol_821);
		}
		symbol_245.getSuperClasses().add(symbol_213); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_151.getOwnedTypes().add(symbol_245); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_246.setName("NonOrderedCollection");
		symbol_246.setElementType(symbol_189);
		symbol_246.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_823 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_823.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_824 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_824.setFormal(symbol_78);	
				symbol_824.setActual(symbol_180);	
				symbol_823.getParameterSubstitutions().add(symbol_824);
			}
			symbol_246.getTemplateBindings().add(symbol_823);
		}
		symbol_246.getSuperClasses().add(symbol_213); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_151.getOwnedTypes().add(symbol_246); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		symbol_247.setName("NonOrderedCollection");
		symbol_247.setElementType(symbol_26);
		symbol_247.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_825 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_825.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_826 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_826.setFormal(symbol_78);	
				symbol_826.setActual(symbol_26);	
				symbol_825.getParameterSubstitutions().add(symbol_826);
			}
			symbol_247.getTemplateBindings().add(symbol_825);
		}
		symbol_247.getSuperClasses().add(symbol_214); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		symbol_151.getOwnedTypes().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_248.setName("NonOrderedCollection");
		symbol_248.setElementType(symbol_23);
		symbol_248.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_827 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_827.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_828 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_828.setFormal(symbol_78);	
				symbol_828.setActual(symbol_23);	
				symbol_827.getParameterSubstitutions().add(symbol_828);
			}
			symbol_248.getTemplateBindings().add(symbol_827);
		}
		symbol_248.getSuperClasses().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		symbol_151.getOwnedTypes().add(symbol_248); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_249.setName("NonOrderedCollection");
		symbol_249.setElementType(symbol_206);
		symbol_249.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_829 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_829.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_830 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_830.setFormal(symbol_78);	
				symbol_830.setActual(symbol_205);	
				symbol_829.getParameterSubstitutions().add(symbol_830);
			}
			symbol_249.getTemplateBindings().add(symbol_829);
		}
		symbol_249.getSuperClasses().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		symbol_151.getOwnedTypes().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_250.setName("NonOrderedCollection");
		symbol_250.setElementType(symbol_206);
		symbol_250.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_831 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_831.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_832 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_832.setFormal(symbol_78);	
				symbol_832.setActual(symbol_205);	
				symbol_831.getParameterSubstitutions().add(symbol_832);
			}
			symbol_250.getTemplateBindings().add(symbol_831);
		}
		symbol_250.getSuperClasses().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		symbol_151.getOwnedTypes().add(symbol_250); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_251.setName("NonOrderedCollection");
		symbol_251.setElementType(symbol_46);
		symbol_251.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_833 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_833.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_834 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_834.setFormal(symbol_78);	
				symbol_834.setActual(symbol_46);	
				symbol_833.getParameterSubstitutions().add(symbol_834);
			}
			symbol_251.getTemplateBindings().add(symbol_833);
		}
		symbol_251.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_251); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_252.setName("NonOrderedCollection");
		symbol_252.setElementType(symbol_82);
		symbol_252.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_835 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_835.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_836 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_836.setFormal(symbol_78);	
				symbol_836.setActual(symbol_82);	
				symbol_835.getParameterSubstitutions().add(symbol_836);
			}
			symbol_252.getTemplateBindings().add(symbol_835);
		}
		symbol_252.getSuperClasses().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_151.getOwnedTypes().add(symbol_252); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_253.setName("NonOrderedCollection");
		symbol_253.setElementType(symbol_79);
		symbol_253.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_837 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_837.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_838 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_838.setFormal(symbol_78);	
				symbol_838.setActual(symbol_79);	
				symbol_837.getParameterSubstitutions().add(symbol_838);
			}
			symbol_253.getTemplateBindings().add(symbol_837);
		}
		symbol_253.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_253); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_254.setName("NonOrderedCollection");
		symbol_254.setElementType(symbol_79);
		symbol_254.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_839 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_839.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_840 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_840.setFormal(symbol_78);	
				symbol_840.setActual(symbol_79);	
				symbol_839.getParameterSubstitutions().add(symbol_840);
			}
			symbol_254.getTemplateBindings().add(symbol_839);
		}
		symbol_254.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_254); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_255.setName("NonOrderedCollection");
		symbol_255.setElementType(symbol_79);
		symbol_255.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_841 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_841.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_842 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_842.setFormal(symbol_78);	
				symbol_842.setActual(symbol_79);	
				symbol_841.getParameterSubstitutions().add(symbol_842);
			}
			symbol_255.getTemplateBindings().add(symbol_841);
		}
		symbol_255.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_255); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_256.setName("NonOrderedCollection");
		symbol_256.setElementType(symbol_79);
		symbol_256.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_843 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_843.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_844 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_844.setFormal(symbol_78);	
				symbol_844.setActual(symbol_79);	
				symbol_843.getParameterSubstitutions().add(symbol_844);
			}
			symbol_256.getTemplateBindings().add(symbol_843);
		}
		symbol_256.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_256); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_257.setName("NonOrderedCollection");
		symbol_257.setElementType(symbol_79);
		symbol_257.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_845 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_845.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_846 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_846.setFormal(symbol_78);	
				symbol_846.setActual(symbol_79);	
				symbol_845.getParameterSubstitutions().add(symbol_846);
			}
			symbol_257.getTemplateBindings().add(symbol_845);
		}
		symbol_257.getSuperClasses().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_257); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_258.setName("NonOrderedCollection");
		symbol_258.setElementType(symbol_79);
		symbol_258.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_847 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_847.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_848 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_848.setFormal(symbol_78);	
				symbol_848.setActual(symbol_79);	
				symbol_847.getParameterSubstitutions().add(symbol_848);
			}
			symbol_258.getTemplateBindings().add(symbol_847);
		}
		symbol_258.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_258); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_259.setName("NonOrderedCollection");
		symbol_259.setElementType(symbol_90);
		symbol_259.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_849 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_849.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_850 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_850.setFormal(symbol_78);	
				symbol_850.setActual(symbol_90);	
				symbol_849.getParameterSubstitutions().add(symbol_850);
			}
			symbol_259.getTemplateBindings().add(symbol_849);
		}
		symbol_259.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_151.getOwnedTypes().add(symbol_259); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_260.setName("NonOrderedCollection");
		symbol_260.setElementType(symbol_90);
		symbol_260.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_851 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_851.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_852 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_852.setFormal(symbol_78);	
				symbol_852.setActual(symbol_90);	
				symbol_851.getParameterSubstitutions().add(symbol_852);
			}
			symbol_260.getTemplateBindings().add(symbol_851);
		}
		symbol_260.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_151.getOwnedTypes().add(symbol_260); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_261.setName("NonOrderedCollection");
		symbol_261.setElementType(symbol_90);
		symbol_261.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_853 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_853.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_854 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_854.setFormal(symbol_78);	
				symbol_854.setActual(symbol_90);	
				symbol_853.getParameterSubstitutions().add(symbol_854);
			}
			symbol_261.getTemplateBindings().add(symbol_853);
		}
		symbol_261.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_151.getOwnedTypes().add(symbol_261); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_262.setName("NonOrderedCollection");
		symbol_262.setElementType(symbol_90);
		symbol_262.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_855 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_855.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_856 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_856.setFormal(symbol_78);	
				symbol_856.setActual(symbol_90);	
				symbol_855.getParameterSubstitutions().add(symbol_856);
			}
			symbol_262.getTemplateBindings().add(symbol_855);
		}
		symbol_262.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_151.getOwnedTypes().add(symbol_262); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_263.setName("NonOrderedCollection");
		symbol_263.setElementType(symbol_111);
		symbol_263.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_857 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_857.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_858 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_858.setFormal(symbol_78);	
				symbol_858.setActual(symbol_111);	
				symbol_857.getParameterSubstitutions().add(symbol_858);
			}
			symbol_263.getTemplateBindings().add(symbol_857);
		}
		symbol_263.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_263); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_264.setName("NonOrderedCollection");
		symbol_264.setElementType(symbol_111);
		symbol_264.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_859 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_859.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_860 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_860.setFormal(symbol_78);	
				symbol_860.setActual(symbol_111);	
				symbol_859.getParameterSubstitutions().add(symbol_860);
			}
			symbol_264.getTemplateBindings().add(symbol_859);
		}
		symbol_264.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_264); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_265.setName("NonOrderedCollection");
		symbol_265.setElementType(symbol_111);
		symbol_265.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_861 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_861.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_862 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_862.setFormal(symbol_78);	
				symbol_862.setActual(symbol_111);	
				symbol_861.getParameterSubstitutions().add(symbol_862);
			}
			symbol_265.getTemplateBindings().add(symbol_861);
		}
		symbol_265.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_265); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_266.setName("NonOrderedCollection");
		symbol_266.setElementType(symbol_111);
		symbol_266.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_863 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_863.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_864 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_864.setFormal(symbol_78);	
				symbol_864.setActual(symbol_111);	
				symbol_863.getParameterSubstitutions().add(symbol_864);
			}
			symbol_266.getTemplateBindings().add(symbol_863);
		}
		symbol_266.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_266); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_267.setName("NonOrderedCollection");
		symbol_267.setElementType(symbol_111);
		symbol_267.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_865 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_865.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_866 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_866.setFormal(symbol_78);	
				symbol_866.setActual(symbol_111);	
				symbol_865.getParameterSubstitutions().add(symbol_866);
			}
			symbol_267.getTemplateBindings().add(symbol_865);
		}
		symbol_267.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_267); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_268.setName("NonOrderedCollection");
		symbol_268.setElementType(symbol_111);
		symbol_268.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_867 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_867.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_868 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_868.setFormal(symbol_78);	
				symbol_868.setActual(symbol_111);	
				symbol_867.getParameterSubstitutions().add(symbol_868);
			}
			symbol_268.getTemplateBindings().add(symbol_867);
		}
		symbol_268.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_268); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_269.setName("NonOrderedCollection");
		symbol_269.setElementType(symbol_128);
		symbol_269.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_869 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_869.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_870 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_870.setFormal(symbol_78);	
				symbol_870.setActual(symbol_128);	
				symbol_869.getParameterSubstitutions().add(symbol_870);
			}
			symbol_269.getTemplateBindings().add(symbol_869);
		}
		symbol_269.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_151.getOwnedTypes().add(symbol_269); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_270.setName("NonOrderedCollection");
		symbol_270.setElementType(symbol_128);
		symbol_270.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_871 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_871.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_872 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_872.setFormal(symbol_78);	
				symbol_872.setActual(symbol_128);	
				symbol_871.getParameterSubstitutions().add(symbol_872);
			}
			symbol_270.getTemplateBindings().add(symbol_871);
		}
		symbol_270.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_151.getOwnedTypes().add(symbol_270); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_271.setName("NonOrderedCollection");
		symbol_271.setElementType(symbol_128);
		symbol_271.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_873 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_873.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_874 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_874.setFormal(symbol_78);	
				symbol_874.setActual(symbol_128);	
				symbol_873.getParameterSubstitutions().add(symbol_874);
			}
			symbol_271.getTemplateBindings().add(symbol_873);
		}
		symbol_271.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_151.getOwnedTypes().add(symbol_271); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_272.setName("NonOrderedCollection");
		symbol_272.setElementType(symbol_145);
		symbol_272.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_875 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_875.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_876 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_876.setFormal(symbol_78);	
				symbol_876.setActual(symbol_145);	
				symbol_875.getParameterSubstitutions().add(symbol_876);
			}
			symbol_272.getTemplateBindings().add(symbol_875);
		}
		symbol_272.getSuperClasses().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		symbol_151.getOwnedTypes().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::NonOrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_273.setName("NonOrderedCollection");
		symbol_273.setElementType(symbol_142);
		symbol_273.setUnspecializedElement(symbol_76);
		{
			TemplateBinding symbol_877 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_877.setSignature(symbol_77);
			{
				TemplateParameterSubstitution symbol_878 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_878.setFormal(symbol_78);	
				symbol_878.setActual(symbol_142);	
				symbol_877.getParameterSubstitutions().add(symbol_878);
			}
			symbol_273.getTemplateBindings().add(symbol_877);
		}
		symbol_273.getSuperClasses().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		symbol_151.getOwnedTypes().add(symbol_273); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[String]
		//
		symbol_274.setName("NonUniqueCollection");
		symbol_274.setElementType(symbol_15);
		symbol_274.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_879 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_879.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_880 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_880.setFormal(symbol_88);	
				symbol_880.setActual(symbol_15);	
				symbol_879.getParameterSubstitutions().add(symbol_880);
			}
			symbol_274.getTemplateBindings().add(symbol_879);
		}
		symbol_274.getSuperClasses().add(symbol_211); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		symbol_151.getOwnedTypes().add(symbol_274); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[String]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		symbol_275.setName("NonUniqueCollection");
		symbol_275.setElementType(symbol_26);
		symbol_275.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_881 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_881.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_882 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_882.setFormal(symbol_88);	
				symbol_882.setActual(symbol_26);	
				symbol_881.getParameterSubstitutions().add(symbol_882);
			}
			symbol_275.getTemplateBindings().add(symbol_881);
		}
		symbol_275.getSuperClasses().add(symbol_214); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		symbol_151.getOwnedTypes().add(symbol_275); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}!flatten{T2}()?T2]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		symbol_276.setName("NonUniqueCollection");
		symbol_276.setElementType(symbol_23);
		symbol_276.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_883 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_883.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_884 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_884.setFormal(symbol_88);	
				symbol_884.setActual(symbol_23);	
				symbol_883.getParameterSubstitutions().add(symbol_884);
			}
			symbol_276.getTemplateBindings().add(symbol_883);
		}
		symbol_276.getSuperClasses().add(symbol_215); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		symbol_151.getOwnedTypes().add(symbol_276); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Bag{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_277.setName("NonUniqueCollection");
		symbol_277.setElementType(symbol_46);
		symbol_277.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_885 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_885.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_886 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_886.setFormal(symbol_88);	
				symbol_886.setActual(symbol_46);	
				symbol_885.getParameterSubstitutions().add(symbol_886);
			}
			symbol_277.getTemplateBindings().add(symbol_885);
		}
		symbol_277.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_277); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_278.setName("NonUniqueCollection");
		symbol_278.setElementType(symbol_82);
		symbol_278.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_887 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_887.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_888 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_888.setFormal(symbol_88);	
				symbol_888.setActual(symbol_82);	
				symbol_887.getParameterSubstitutions().add(symbol_888);
			}
			symbol_278.getTemplateBindings().add(symbol_887);
		}
		symbol_278.getSuperClasses().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_151.getOwnedTypes().add(symbol_278); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_279.setName("NonUniqueCollection");
		symbol_279.setElementType(symbol_79);
		symbol_279.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_889 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_889.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_890 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_890.setFormal(symbol_88);	
				symbol_890.setActual(symbol_79);	
				symbol_889.getParameterSubstitutions().add(symbol_890);
			}
			symbol_279.getTemplateBindings().add(symbol_889);
		}
		symbol_279.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_279); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_280.setName("NonUniqueCollection");
		symbol_280.setElementType(symbol_79);
		symbol_280.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_891 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_891.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_892 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_892.setFormal(symbol_88);	
				symbol_892.setActual(symbol_79);	
				symbol_891.getParameterSubstitutions().add(symbol_892);
			}
			symbol_280.getTemplateBindings().add(symbol_891);
		}
		symbol_280.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_280); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_281.setName("NonUniqueCollection");
		symbol_281.setElementType(symbol_79);
		symbol_281.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_893 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_893.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_894 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_894.setFormal(symbol_88);	
				symbol_894.setActual(symbol_79);	
				symbol_893.getParameterSubstitutions().add(symbol_894);
			}
			symbol_281.getTemplateBindings().add(symbol_893);
		}
		symbol_281.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_281); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_282.setName("NonUniqueCollection");
		symbol_282.setElementType(symbol_79);
		symbol_282.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_895 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_895.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_896 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_896.setFormal(symbol_88);	
				symbol_896.setActual(symbol_79);	
				symbol_895.getParameterSubstitutions().add(symbol_896);
			}
			symbol_282.getTemplateBindings().add(symbol_895);
		}
		symbol_282.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_282); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_283.setName("NonUniqueCollection");
		symbol_283.setElementType(symbol_79);
		symbol_283.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_897 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_897.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_898 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_898.setFormal(symbol_88);	
				symbol_898.setActual(symbol_79);	
				symbol_897.getParameterSubstitutions().add(symbol_898);
			}
			symbol_283.getTemplateBindings().add(symbol_897);
		}
		symbol_283.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_283); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		symbol_284.setName("NonUniqueCollection");
		symbol_284.setElementType(symbol_89);
		symbol_284.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_899 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_899.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_900 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_900.setFormal(symbol_88);	
				symbol_900.setActual(symbol_89);	
				symbol_899.getParameterSubstitutions().add(symbol_900);
			}
			symbol_284.getTemplateBindings().add(symbol_899);
		}
		symbol_284.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_284); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_285.setName("NonUniqueCollection");
		symbol_285.setElementType(symbol_121);
		symbol_285.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_901 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_901.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_902 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_902.setFormal(symbol_88);	
				symbol_902.setActual(symbol_121);	
				symbol_901.getParameterSubstitutions().add(symbol_902);
			}
			symbol_285.getTemplateBindings().add(symbol_901);
		}
		symbol_285.getSuperClasses().add(symbol_233); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_151.getOwnedTypes().add(symbol_285); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_286.setName("NonUniqueCollection");
		symbol_286.setElementType(symbol_118);
		symbol_286.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_903 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_903.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_904 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_904.setFormal(symbol_88);	
				symbol_904.setActual(symbol_118);	
				symbol_903.getParameterSubstitutions().add(symbol_904);
			}
			symbol_286.getTemplateBindings().add(symbol_903);
		}
		symbol_286.getSuperClasses().add(symbol_234); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_286); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_287.setName("NonUniqueCollection");
		symbol_287.setElementType(symbol_138);
		symbol_287.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_905 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_905.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_906 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_906.setFormal(symbol_88);	
				symbol_906.setActual(symbol_138);	
				symbol_905.getParameterSubstitutions().add(symbol_906);
			}
			symbol_287.getTemplateBindings().add(symbol_905);
		}
		symbol_287.getSuperClasses().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		symbol_151.getOwnedTypes().add(symbol_287); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		// ocl::$$::NonUniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_288.setName("NonUniqueCollection");
		symbol_288.setElementType(symbol_135);
		symbol_288.setUnspecializedElement(symbol_86);
		{
			TemplateBinding symbol_907 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_907.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_908 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_908.setFormal(symbol_88);	
				symbol_908.setActual(symbol_135);	
				symbol_907.getParameterSubstitutions().add(symbol_908);
			}
			symbol_288.getTemplateBindings().add(symbol_907);
		}
		symbol_288.getSuperClasses().add(symbol_240); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		symbol_151.getOwnedTypes().add(symbol_288); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[String]
		//
		symbol_289.setName("OrderedCollection");
		symbol_289.setElementType(symbol_15);
		symbol_289.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_909 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_909.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_910 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_910.setFormal(symbol_117);	
				symbol_910.setActual(symbol_15);	
				symbol_909.getParameterSubstitutions().add(symbol_910);
			}
			symbol_289.getTemplateBindings().add(symbol_909);
		}
		symbol_289.getSuperClasses().add(symbol_211); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[String]
		symbol_151.getOwnedTypes().add(symbol_289); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[String]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_290.setName("OrderedCollection");
		symbol_290.setElementType(symbol_46);
		symbol_290.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_911 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_911.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_912 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_912.setFormal(symbol_117);	
				symbol_912.setActual(symbol_46);	
				symbol_911.getParameterSubstitutions().add(symbol_912);
			}
			symbol_290.getTemplateBindings().add(symbol_911);
		}
		symbol_290.getSuperClasses().add(symbol_224); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_290); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_291.setName("OrderedCollection");
		symbol_291.setElementType(symbol_75);
		symbol_291.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_913 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_913.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_914 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_914.setFormal(symbol_117);	
				symbol_914.setActual(symbol_75);	
				symbol_913.getParameterSubstitutions().add(symbol_914);
			}
			symbol_291.getTemplateBindings().add(symbol_913);
		}
		symbol_291.getSuperClasses().add(symbol_226); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		symbol_151.getOwnedTypes().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		symbol_292.setName("OrderedCollection");
		symbol_292.setElementType(symbol_89);
		symbol_292.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_915 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_915.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_916 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_916.setFormal(symbol_117);	
				symbol_916.setActual(symbol_89);	
				symbol_915.getParameterSubstitutions().add(symbol_916);
			}
			symbol_292.getTemplateBindings().add(symbol_915);
		}
		symbol_292.getSuperClasses().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_292); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_293.setName("OrderedCollection");
		symbol_293.setElementType(symbol_121);
		symbol_293.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_917 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_917.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_918 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_918.setFormal(symbol_117);	
				symbol_918.setActual(symbol_121);	
				symbol_917.getParameterSubstitutions().add(symbol_918);
			}
			symbol_293.getTemplateBindings().add(symbol_917);
		}
		symbol_293.getSuperClasses().add(symbol_233); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_151.getOwnedTypes().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_294.setName("OrderedCollection");
		symbol_294.setElementType(symbol_118);
		symbol_294.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_919 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_919.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_920 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_920.setFormal(symbol_117);	
				symbol_920.setActual(symbol_118);	
				symbol_919.getParameterSubstitutions().add(symbol_920);
			}
			symbol_294.getTemplateBindings().add(symbol_919);
		}
		symbol_294.getSuperClasses().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_295.setName("OrderedCollection");
		symbol_295.setElementType(symbol_118);
		symbol_295.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_921 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_921.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_922 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_922.setFormal(symbol_117);	
				symbol_922.setActual(symbol_118);	
				symbol_921.getParameterSubstitutions().add(symbol_922);
			}
			symbol_295.getTemplateBindings().add(symbol_921);
		}
		symbol_295.getSuperClasses().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_295); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_296.setName("OrderedCollection");
		symbol_296.setElementType(symbol_131);
		symbol_296.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_923 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_923.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_924 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_924.setFormal(symbol_117);	
				symbol_924.setActual(symbol_131);	
				symbol_923.getParameterSubstitutions().add(symbol_924);
			}
			symbol_296.getTemplateBindings().add(symbol_923);
		}
		symbol_296.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		symbol_151.getOwnedTypes().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_297.setName("OrderedCollection");
		symbol_297.setElementType(symbol_128);
		symbol_297.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_925 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_925.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_926 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_926.setFormal(symbol_117);	
				symbol_926.setActual(symbol_128);	
				symbol_925.getParameterSubstitutions().add(symbol_926);
			}
			symbol_297.getTemplateBindings().add(symbol_925);
		}
		symbol_297.getSuperClasses().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_151.getOwnedTypes().add(symbol_297); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_298.setName("OrderedCollection");
		symbol_298.setElementType(symbol_138);
		symbol_298.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_927 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_927.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_928 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_928.setFormal(symbol_117);	
				symbol_928.setActual(symbol_138);	
				symbol_927.getParameterSubstitutions().add(symbol_928);
			}
			symbol_298.getTemplateBindings().add(symbol_927);
		}
		symbol_298.getSuperClasses().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		symbol_151.getOwnedTypes().add(symbol_298); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		symbol_299.setName("OrderedCollection");
		symbol_299.setElementType(symbol_135);
		symbol_299.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_929 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_929.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_930 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_930.setFormal(symbol_117);	
				symbol_930.setActual(symbol_135);	
				symbol_929.getParameterSubstitutions().add(symbol_930);
			}
			symbol_299.getTemplateBindings().add(symbol_929);
		}
		symbol_299.getSuperClasses().add(symbol_240); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		symbol_151.getOwnedTypes().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}?T]
		//
		// ocl::$$::OrderedCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_300.setName("OrderedCollection");
		symbol_300.setElementType(symbol_150);
		symbol_300.setUnspecializedElement(symbol_115);
		{
			TemplateBinding symbol_931 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_931.setSignature(symbol_116);
			{
				TemplateParameterSubstitution symbol_932 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_932.setFormal(symbol_117);	
				symbol_932.setActual(symbol_150);	
				symbol_931.getParameterSubstitutions().add(symbol_932);
			}
			symbol_300.getTemplateBindings().add(symbol_931);
		}
		symbol_300.getSuperClasses().add(symbol_243); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_300); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_301.setName("OrderedSet");
		symbol_301.setElementType(symbol_46);
		symbol_301.setUnspecializedElement(symbol_125);
		{
			TemplateBinding symbol_933 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_933.setSignature(symbol_126);
			{
				TemplateParameterSubstitution symbol_934 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_934.setFormal(symbol_127);	
				symbol_934.setActual(symbol_46);	
				symbol_933.getParameterSubstitutions().add(symbol_934);
			}
			symbol_301.getTemplateBindings().add(symbol_933);
		}
		symbol_301.getSuperClasses().add(symbol_290); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_301.getSuperClasses().add(symbol_324); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_302.setName("OrderedSet");
		symbol_302.setElementType(symbol_75);
		symbol_302.setUnspecializedElement(symbol_125);
		{
			TemplateBinding symbol_935 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_935.setSignature(symbol_126);
			{
				TemplateParameterSubstitution symbol_936 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_936.setFormal(symbol_127);	
				symbol_936.setActual(symbol_75);	
				symbol_935.getParameterSubstitutions().add(symbol_936);
			}
			symbol_302.getTemplateBindings().add(symbol_935);
		}
		symbol_302.getSuperClasses().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		symbol_302.getSuperClasses().add(symbol_325); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		symbol_151.getOwnedTypes().add(symbol_302); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_303.setName("OrderedSet");
		symbol_303.setElementType(symbol_118);
		symbol_303.setUnspecializedElement(symbol_125);
		{
			TemplateBinding symbol_937 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_937.setSignature(symbol_126);
			{
				TemplateParameterSubstitution symbol_938 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_938.setFormal(symbol_127);	
				symbol_938.setActual(symbol_118);	
				symbol_937.getParameterSubstitutions().add(symbol_938);
			}
			symbol_303.getTemplateBindings().add(symbol_937);
		}
		symbol_303.getSuperClasses().add(symbol_295); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_303.getSuperClasses().add(symbol_343); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_303); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_304.setName("OrderedSet");
		symbol_304.setElementType(symbol_131);
		symbol_304.setUnspecializedElement(symbol_125);
		{
			TemplateBinding symbol_939 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_939.setSignature(symbol_126);
			{
				TemplateParameterSubstitution symbol_940 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_940.setFormal(symbol_127);	
				symbol_940.setActual(symbol_131);	
				symbol_939.getParameterSubstitutions().add(symbol_940);
			}
			symbol_304.getTemplateBindings().add(symbol_939);
		}
		symbol_304.getSuperClasses().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		symbol_304.getSuperClasses().add(symbol_344); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		symbol_151.getOwnedTypes().add(symbol_304); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::OrderedSet http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_305.setName("OrderedSet");
		symbol_305.setElementType(symbol_150);
		symbol_305.setUnspecializedElement(symbol_125);
		{
			TemplateBinding symbol_941 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_941.setSignature(symbol_126);
			{
				TemplateParameterSubstitution symbol_942 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_942.setFormal(symbol_127);	
				symbol_942.setActual(symbol_150);	
				symbol_941.getParameterSubstitutions().add(symbol_942);
			}
			symbol_305.getTemplateBindings().add(symbol_941);
		}
		symbol_305.getSuperClasses().add(symbol_300); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_305.getSuperClasses().add(symbol_350); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_305); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
		//
		symbol_306.setName("Sequence");
		symbol_306.setElementType(symbol_15);
		symbol_306.setUnspecializedElement(symbol_132);
		{
			TemplateBinding symbol_943 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_943.setSignature(symbol_133);
			{
				TemplateParameterSubstitution symbol_944 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_944.setFormal(symbol_134);	
				symbol_944.setActual(symbol_15);	
				symbol_943.getParameterSubstitutions().add(symbol_944);
			}
			symbol_306.getTemplateBindings().add(symbol_943);
		}
		symbol_306.getSuperClasses().add(symbol_289); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[String]
		symbol_306.getSuperClasses().add(symbol_274); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[String]
		symbol_151.getOwnedTypes().add(symbol_306); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[String]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_307.setName("Sequence");
		symbol_307.setElementType(symbol_46);
		symbol_307.setUnspecializedElement(symbol_132);
		{
			TemplateBinding symbol_945 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_945.setSignature(symbol_133);
			{
				TemplateParameterSubstitution symbol_946 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_946.setFormal(symbol_134);	
				symbol_946.setActual(symbol_46);	
				symbol_945.getParameterSubstitutions().add(symbol_946);
			}
			symbol_307.getTemplateBindings().add(symbol_945);
		}
		symbol_307.getSuperClasses().add(symbol_290); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_307.getSuperClasses().add(symbol_277); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_307); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		symbol_308.setName("Sequence");
		symbol_308.setElementType(symbol_89);
		symbol_308.setUnspecializedElement(symbol_132);
		{
			TemplateBinding symbol_947 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_947.setSignature(symbol_133);
			{
				TemplateParameterSubstitution symbol_948 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_948.setFormal(symbol_134);	
				symbol_948.setActual(symbol_89);	
				symbol_947.getParameterSubstitutions().add(symbol_948);
			}
			symbol_308.getTemplateBindings().add(symbol_947);
		}
		symbol_308.getSuperClasses().add(symbol_292); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		symbol_308.getSuperClasses().add(symbol_284); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_308); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_309.setName("Sequence");
		symbol_309.setElementType(symbol_121);
		symbol_309.setUnspecializedElement(symbol_132);
		{
			TemplateBinding symbol_949 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_949.setSignature(symbol_133);
			{
				TemplateParameterSubstitution symbol_950 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_950.setFormal(symbol_134);	
				symbol_950.setActual(symbol_121);	
				symbol_949.getParameterSubstitutions().add(symbol_950);
			}
			symbol_309.getTemplateBindings().add(symbol_949);
		}
		symbol_309.getSuperClasses().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_309.getSuperClasses().add(symbol_285); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_151.getOwnedTypes().add(symbol_309); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_310.setName("Sequence");
		symbol_310.setElementType(symbol_118);
		symbol_310.setUnspecializedElement(symbol_132);
		{
			TemplateBinding symbol_951 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_951.setSignature(symbol_133);
			{
				TemplateParameterSubstitution symbol_952 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_952.setFormal(symbol_134);	
				symbol_952.setActual(symbol_118);	
				symbol_951.getParameterSubstitutions().add(symbol_952);
			}
			symbol_310.getTemplateBindings().add(symbol_951);
		}
		symbol_310.getSuperClasses().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_310.getSuperClasses().add(symbol_286); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_310); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::Sequence http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_311.setName("Sequence");
		symbol_311.setElementType(symbol_138);
		symbol_311.setUnspecializedElement(symbol_132);
		{
			TemplateBinding symbol_953 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_953.setSignature(symbol_133);
			{
				TemplateParameterSubstitution symbol_954 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_954.setFormal(symbol_134);	
				symbol_954.setActual(symbol_138);	
				symbol_953.getParameterSubstitutions().add(symbol_954);
			}
			symbol_311.getTemplateBindings().add(symbol_953);
		}
		symbol_311.getSuperClasses().add(symbol_298); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		symbol_311.getSuperClasses().add(symbol_287); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonUniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		symbol_151.getOwnedTypes().add(symbol_311); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Sequence{T}!flatten{T2}()?T2]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_312.setName("Set");
		symbol_312.setElementType(symbol_189);
		symbol_312.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_955 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_955.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_956 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_956.setFormal(symbol_141);	
				symbol_956.setActual(symbol_180);	
				symbol_955.getParameterSubstitutions().add(symbol_956);
			}
			symbol_312.getTemplateBindings().add(symbol_955);
		}
		symbol_312.getSuperClasses().add(symbol_245); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_312.getSuperClasses().add(symbol_321); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_151.getOwnedTypes().add(symbol_312); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_313.setName("Set");
		symbol_313.setElementType(symbol_206);
		symbol_313.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_957 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_957.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_958 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_958.setFormal(symbol_141);	
				symbol_958.setActual(symbol_205);	
				symbol_957.getParameterSubstitutions().add(symbol_958);
			}
			symbol_313.getTemplateBindings().add(symbol_957);
		}
		symbol_313.getSuperClasses().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		symbol_313.getSuperClasses().add(symbol_323); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		symbol_151.getOwnedTypes().add(symbol_313); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_314.setName("Set");
		symbol_314.setElementType(symbol_46);
		symbol_314.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_959 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_959.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_960 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_960.setFormal(symbol_141);	
				symbol_960.setActual(symbol_46);	
				symbol_959.getParameterSubstitutions().add(symbol_960);
			}
			symbol_314.getTemplateBindings().add(symbol_959);
		}
		symbol_314.getSuperClasses().add(symbol_251); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_314.getSuperClasses().add(symbol_324); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_314); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_315.setName("Set");
		symbol_315.setElementType(symbol_79);
		symbol_315.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_961 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_961.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_962 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_962.setFormal(symbol_141);	
				symbol_962.setActual(symbol_79);	
				symbol_961.getParameterSubstitutions().add(symbol_962);
			}
			symbol_315.getTemplateBindings().add(symbol_961);
		}
		symbol_315.getSuperClasses().add(symbol_258); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_315.getSuperClasses().add(symbol_326); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_315); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_316.setName("Set");
		symbol_316.setElementType(symbol_90);
		symbol_316.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_963 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_963.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_964 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_964.setFormal(symbol_141);	
				symbol_964.setActual(symbol_90);	
				symbol_963.getParameterSubstitutions().add(symbol_964);
			}
			symbol_316.getTemplateBindings().add(symbol_963);
		}
		symbol_316.getSuperClasses().add(symbol_261); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_316.getSuperClasses().add(symbol_333); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_151.getOwnedTypes().add(symbol_316); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_317.setName("Set");
		symbol_317.setElementType(symbol_111);
		symbol_317.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_965 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_965.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_966 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_966.setFormal(symbol_141);	
				symbol_966.setActual(symbol_111);	
				symbol_965.getParameterSubstitutions().add(symbol_966);
			}
			symbol_317.getTemplateBindings().add(symbol_965);
		}
		symbol_317.getSuperClasses().add(symbol_265); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_317.getSuperClasses().add(symbol_340); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_317); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_318.setName("Set");
		symbol_318.setElementType(symbol_128);
		symbol_318.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_967 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_967.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_968 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_968.setFormal(symbol_141);	
				symbol_968.setActual(symbol_128);	
				symbol_967.getParameterSubstitutions().add(symbol_968);
			}
			symbol_318.getTemplateBindings().add(symbol_967);
		}
		symbol_318.getSuperClasses().add(symbol_269); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_318.getSuperClasses().add(symbol_347); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_151.getOwnedTypes().add(symbol_318); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::Set http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_319.setName("Set");
		symbol_319.setElementType(symbol_145);
		symbol_319.setUnspecializedElement(symbol_139);
		{
			TemplateBinding symbol_969 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_969.setSignature(symbol_140);
			{
				TemplateParameterSubstitution symbol_970 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_970.setFormal(symbol_141);	
				symbol_970.setActual(symbol_145);	
				symbol_969.getParameterSubstitutions().add(symbol_970);
			}
			symbol_319.getTemplateBindings().add(symbol_969);
		}
		symbol_319.getSuperClasses().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		symbol_319.getSuperClasses().add(symbol_348); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		symbol_151.getOwnedTypes().add(symbol_319); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_320.setName("UniqueCollection");
		symbol_320.setElementType(symbol_189);
		symbol_320.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_971 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_971.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_972 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_972.setFormal(symbol_149);	
				symbol_972.setActual(symbol_180);	
				symbol_971.getParameterSubstitutions().add(symbol_972);
			}
			symbol_320.getTemplateBindings().add(symbol_971);
		}
		symbol_320.getSuperClasses().add(symbol_213); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_151.getOwnedTypes().add(symbol_320); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		symbol_321.setName("UniqueCollection");
		symbol_321.setElementType(symbol_189);
		symbol_321.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_973 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_973.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_974 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_974.setFormal(symbol_149);	
				symbol_974.setActual(symbol_180);	
				symbol_973.getParameterSubstitutions().add(symbol_974);
			}
			symbol_321.getTemplateBindings().add(symbol_973);
		}
		symbol_321.getSuperClasses().add(symbol_213); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		symbol_151.getOwnedTypes().add(symbol_321); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[Tuple{first:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T,second:http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}!product{T2}(http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[T2])?T2}]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_322.setName("UniqueCollection");
		symbol_322.setElementType(symbol_206);
		symbol_322.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_975 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_975.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_976 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_976.setFormal(symbol_149);	
				symbol_976.setActual(symbol_205);	
				symbol_975.getParameterSubstitutions().add(symbol_976);
			}
			symbol_322.getTemplateBindings().add(symbol_975);
		}
		symbol_322.getSuperClasses().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		symbol_151.getOwnedTypes().add(symbol_322); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		symbol_323.setName("UniqueCollection");
		symbol_323.setElementType(symbol_206);
		symbol_323.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_977 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_977.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_978 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_978.setFormal(symbol_149);	
				symbol_978.setActual(symbol_205);	
				symbol_977.getParameterSubstitutions().add(symbol_978);
			}
			symbol_323.getTemplateBindings().add(symbol_977);
		}
		symbol_323.getSuperClasses().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		symbol_151.getOwnedTypes().add(symbol_323); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Classifier[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclElement!oclContents{U}()?U]]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		symbol_324.setName("UniqueCollection");
		symbol_324.setElementType(symbol_46);
		symbol_324.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_979 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_979.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_980 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_980.setFormal(symbol_149);	
				symbol_980.setActual(symbol_46);	
				symbol_979.getParameterSubstitutions().add(symbol_980);
			}
			symbol_324.getTemplateBindings().add(symbol_979);
		}
		symbol_324.getSuperClasses().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_324); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		symbol_325.setName("UniqueCollection");
		symbol_325.setElementType(symbol_75);
		symbol_325.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_981 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_981.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_982 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_982.setFormal(symbol_149);	
				symbol_982.setActual(symbol_75);	
				symbol_981.getParameterSubstitutions().add(symbol_982);
			}
			symbol_325.getTemplateBindings().add(symbol_981);
		}
		symbol_325.getSuperClasses().add(symbol_226); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		symbol_151.getOwnedTypes().add(symbol_325); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!EnumerationLiteral]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_326.setName("UniqueCollection");
		symbol_326.setElementType(symbol_79);
		symbol_326.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_983 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_983.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_984 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_984.setFormal(symbol_149);	
				symbol_984.setActual(symbol_79);	
				symbol_983.getParameterSubstitutions().add(symbol_984);
			}
			symbol_326.getTemplateBindings().add(symbol_983);
		}
		symbol_326.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_326); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_327.setName("UniqueCollection");
		symbol_327.setElementType(symbol_79);
		symbol_327.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_985 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_985.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_986 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_986.setFormal(symbol_149);	
				symbol_986.setActual(symbol_79);	
				symbol_985.getParameterSubstitutions().add(symbol_986);
			}
			symbol_327.getTemplateBindings().add(symbol_985);
		}
		symbol_327.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_327); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_328.setName("UniqueCollection");
		symbol_328.setElementType(symbol_79);
		symbol_328.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_987 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_987.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_988 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_988.setFormal(symbol_149);	
				symbol_988.setActual(symbol_79);	
				symbol_987.getParameterSubstitutions().add(symbol_988);
			}
			symbol_328.getTemplateBindings().add(symbol_987);
		}
		symbol_328.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_328); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_329.setName("UniqueCollection");
		symbol_329.setElementType(symbol_79);
		symbol_329.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_989 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_989.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_990 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_990.setFormal(symbol_149);	
				symbol_990.setActual(symbol_79);	
				symbol_989.getParameterSubstitutions().add(symbol_990);
			}
			symbol_329.getTemplateBindings().add(symbol_989);
		}
		symbol_329.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_329); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_330.setName("UniqueCollection");
		symbol_330.setElementType(symbol_79);
		symbol_330.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_991 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_991.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_992 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_992.setFormal(symbol_149);	
				symbol_992.setActual(symbol_79);	
				symbol_991.getParameterSubstitutions().add(symbol_992);
			}
			symbol_330.getTemplateBindings().add(symbol_991);
		}
		symbol_330.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_330); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		symbol_331.setName("UniqueCollection");
		symbol_331.setElementType(symbol_79);
		symbol_331.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_993 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_993.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_994 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_994.setFormal(symbol_149);	
				symbol_994.setActual(symbol_79);	
				symbol_993.getParameterSubstitutions().add(symbol_994);
			}
			symbol_331.getTemplateBindings().add(symbol_993);
		}
		symbol_331.getSuperClasses().add(symbol_229); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_331); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!NonOrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_332.setName("UniqueCollection");
		symbol_332.setElementType(symbol_90);
		symbol_332.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_995 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_995.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_996 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_996.setFormal(symbol_149);	
				symbol_996.setActual(symbol_90);	
				symbol_995.getParameterSubstitutions().add(symbol_996);
			}
			symbol_332.getTemplateBindings().add(symbol_995);
		}
		symbol_332.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_151.getOwnedTypes().add(symbol_332); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_333.setName("UniqueCollection");
		symbol_333.setElementType(symbol_90);
		symbol_333.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_997 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_997.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_998 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_998.setFormal(symbol_149);	
				symbol_998.setActual(symbol_90);	
				symbol_997.getParameterSubstitutions().add(symbol_998);
			}
			symbol_333.getTemplateBindings().add(symbol_997);
		}
		symbol_333.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_151.getOwnedTypes().add(symbol_333); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_334.setName("UniqueCollection");
		symbol_334.setElementType(symbol_90);
		symbol_334.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_999 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_999.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1000 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1000.setFormal(symbol_149);	
				symbol_1000.setActual(symbol_90);	
				symbol_999.getParameterSubstitutions().add(symbol_1000);
			}
			symbol_334.getTemplateBindings().add(symbol_999);
		}
		symbol_334.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_151.getOwnedTypes().add(symbol_334); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		symbol_335.setName("UniqueCollection");
		symbol_335.setElementType(symbol_90);
		symbol_335.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1001 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1001.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1002 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1002.setFormal(symbol_149);	
				symbol_1002.setActual(symbol_90);	
				symbol_1001.getParameterSubstitutions().add(symbol_1002);
			}
			symbol_335.getTemplateBindings().add(symbol_1001);
		}
		symbol_335.getSuperClasses().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		symbol_151.getOwnedTypes().add(symbol_335); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclAny]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_336.setName("UniqueCollection");
		symbol_336.setElementType(symbol_111);
		symbol_336.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1003 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1003.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1004 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1004.setFormal(symbol_149);	
				symbol_1004.setActual(symbol_111);	
				symbol_1003.getParameterSubstitutions().add(symbol_1004);
			}
			symbol_336.getTemplateBindings().add(symbol_1003);
		}
		symbol_336.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_336); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_337.setName("UniqueCollection");
		symbol_337.setElementType(symbol_111);
		symbol_337.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1005 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1005.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1006 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1006.setFormal(symbol_149);	
				symbol_1006.setActual(symbol_111);	
				symbol_1005.getParameterSubstitutions().add(symbol_1006);
			}
			symbol_337.getTemplateBindings().add(symbol_1005);
		}
		symbol_337.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_337); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_338.setName("UniqueCollection");
		symbol_338.setElementType(symbol_111);
		symbol_338.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1007 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1007.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1008 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1008.setFormal(symbol_149);	
				symbol_1008.setActual(symbol_111);	
				symbol_1007.getParameterSubstitutions().add(symbol_1008);
			}
			symbol_338.getTemplateBindings().add(symbol_1007);
		}
		symbol_338.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_338); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_339.setName("UniqueCollection");
		symbol_339.setElementType(symbol_111);
		symbol_339.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1009 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1009.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1010 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1010.setFormal(symbol_149);	
				symbol_1010.setActual(symbol_111);	
				symbol_1009.getParameterSubstitutions().add(symbol_1010);
			}
			symbol_339.getTemplateBindings().add(symbol_1009);
		}
		symbol_339.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_339); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_340.setName("UniqueCollection");
		symbol_340.setElementType(symbol_111);
		symbol_340.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1011 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1011.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1012 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1012.setFormal(symbol_149);	
				symbol_1012.setActual(symbol_111);	
				symbol_1011.getParameterSubstitutions().add(symbol_1012);
			}
			symbol_340.getTemplateBindings().add(symbol_1011);
		}
		symbol_340.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_340); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		symbol_341.setName("UniqueCollection");
		symbol_341.setElementType(symbol_111);
		symbol_341.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1013 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1013.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1014 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1014.setFormal(symbol_149);	
				symbol_1014.setActual(symbol_111);	
				symbol_1013.getParameterSubstitutions().add(symbol_1014);
			}
			symbol_341.getTemplateBindings().add(symbol_1013);
		}
		symbol_341.getSuperClasses().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		symbol_151.getOwnedTypes().add(symbol_341); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OclSelf]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_342.setName("UniqueCollection");
		symbol_342.setElementType(symbol_118);
		symbol_342.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1015 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1015.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1016 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1016.setFormal(symbol_149);	
				symbol_1016.setActual(symbol_118);	
				symbol_1015.getParameterSubstitutions().add(symbol_1016);
			}
			symbol_342.getTemplateBindings().add(symbol_1015);
		}
		symbol_342.getSuperClasses().add(symbol_234); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_342); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		symbol_343.setName("UniqueCollection");
		symbol_343.setElementType(symbol_118);
		symbol_343.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1017 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1017.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1018 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1018.setFormal(symbol_149);	
				symbol_1018.setActual(symbol_118);	
				symbol_1017.getParameterSubstitutions().add(symbol_1018);
			}
			symbol_343.getTemplateBindings().add(symbol_1017);
		}
		symbol_343.getSuperClasses().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_343); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedCollection{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_344.setName("UniqueCollection");
		symbol_344.setElementType(symbol_131);
		symbol_344.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1019 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1019.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1020 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1020.setFormal(symbol_149);	
				symbol_1020.setActual(symbol_131);	
				symbol_1019.getParameterSubstitutions().add(symbol_1020);
			}
			symbol_344.getTemplateBindings().add(symbol_1019);
		}
		symbol_344.getSuperClasses().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		symbol_151.getOwnedTypes().add(symbol_344); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}!flatten{T2}()?T2]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_345.setName("UniqueCollection");
		symbol_345.setElementType(symbol_128);
		symbol_345.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1021 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1021.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1022 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1022.setFormal(symbol_149);	
				symbol_1022.setActual(symbol_128);	
				symbol_1021.getParameterSubstitutions().add(symbol_1022);
			}
			symbol_345.getTemplateBindings().add(symbol_1021);
		}
		symbol_345.getSuperClasses().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_151.getOwnedTypes().add(symbol_345); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_346.setName("UniqueCollection");
		symbol_346.setElementType(symbol_128);
		symbol_346.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1023 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1023.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1024 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1024.setFormal(symbol_149);	
				symbol_1024.setActual(symbol_128);	
				symbol_1023.getParameterSubstitutions().add(symbol_1024);
			}
			symbol_346.getTemplateBindings().add(symbol_1023);
		}
		symbol_346.getSuperClasses().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_151.getOwnedTypes().add(symbol_346); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		symbol_347.setName("UniqueCollection");
		symbol_347.setElementType(symbol_128);
		symbol_347.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1025 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1025.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1026 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1026.setFormal(symbol_149);	
				symbol_1026.setActual(symbol_128);	
				symbol_1025.getParameterSubstitutions().add(symbol_1026);
			}
			symbol_347.getTemplateBindings().add(symbol_1025);
		}
		symbol_347.getSuperClasses().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		symbol_151.getOwnedTypes().add(symbol_347); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!OrderedSet{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		symbol_348.setName("UniqueCollection");
		symbol_348.setElementType(symbol_145);
		symbol_348.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1027 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1027.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1028 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1028.setFormal(symbol_149);	
				symbol_1028.setActual(symbol_145);	
				symbol_1027.getParameterSubstitutions().add(symbol_1028);
			}
			symbol_348.getTemplateBindings().add(symbol_1027);
		}
		symbol_348.getSuperClasses().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		symbol_151.getOwnedTypes().add(symbol_348); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}!flatten{T2}()?T2]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		symbol_349.setName("UniqueCollection");
		symbol_349.setElementType(symbol_142);
		symbol_349.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1029 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1029.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1030 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1030.setFormal(symbol_149);	
				symbol_1030.setActual(symbol_142);	
				symbol_1029.getParameterSubstitutions().add(symbol_1030);
			}
			symbol_349.getTemplateBindings().add(symbol_1029);
		}
		symbol_349.getSuperClasses().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		symbol_151.getOwnedTypes().add(symbol_349); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Set{T}?T]
		//
		// ocl::$$::UniqueCollection http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		symbol_350.setName("UniqueCollection");
		symbol_350.setElementType(symbol_150);
		symbol_350.setUnspecializedElement(symbol_147);
		{
			TemplateBinding symbol_1031 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_1031.setSignature(symbol_148);
			{
				TemplateParameterSubstitution symbol_1032 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_1032.setFormal(symbol_149);	
				symbol_1032.setActual(symbol_150);	
				symbol_1031.getParameterSubstitutions().add(symbol_1032);
			}
			symbol_350.getTemplateBindings().add(symbol_1031);
		}
		symbol_350.getSuperClasses().add(symbol_243); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!Collection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		symbol_151.getOwnedTypes().add(symbol_350); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection[http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib!UniqueCollection{T}?T]
		//
		// ocl::$$::$$ http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		//
		symbol_351.setName("$$");
		symbol_151.getOwnedTypes().add(symbol_351); // http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib@nestedPackage.0!$$
		symbol_1.getNestedPackages().add(symbol_151);
		return symbol_1;
	}
}
