/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: OCLstdlib.java,v 1.1.2.12 2011/01/07 12:19:56 ewillink Exp $
 */
package	org.eclipse.ocl.examples.library.oclstdlib;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.ocl.examples.pivot.*;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.library.StandardLibraryContribution;
import org.eclipse.ocl.examples.pivot.utilities.PivotAliasCreator;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;

/**
 * This is the http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib Standard Library
 * auto-generated from /org.eclipse.ocl.examples.library/model/OCL-2.4.oclstdlib.
 * It facilitates efficient library loading without the overheads of model reading.
 * <p>
 * This Standard Library may be registered as the definition of a Standard Library for
 * the OCL evaluation framework by invoking {@link #install}.
 * <p>
 * The Standard Library is normally activated when the PivotManager attempts
 * to locate a library type when its default Standard Library URI is the same
 * as this Standard Library.
 */
@SuppressWarnings("nls")
public class OCLstdlib extends XMLResourceImpl
{
	/**
	 *	The static package-of-types pivot model of the Standard Library.
	 */
	public static final OCLstdlib INSTANCE = new OCLstdlib();
	
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
	public static void install() {
		StandardLibraryContribution.REGISTRY.put(STDLIB_URI, new Loader());
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
			return INSTANCE;
		}
	}
	
	private OCLstdlib() {
		super(URI.createURI(STDLIB_URI));
		getContents().add(create());
		PivotAliasCreator.refreshPackageAliases(this);
		PivotManager.setMonikerAsID(Collections.singletonList(this));
	}

	/**
	 *	Create and return a package-of-packages-of-types pivot model of the OCL standard library.
	 *  This static definition auto-generated from /org.eclipse.ocl.examples.library/model/OCL-2.4.oclstdlib
	 *  is used as the default when no overriding copy is registered. 
	 */
	public static Library create()
	{
		Library symbol_1 = PivotFactory.eINSTANCE.createLibrary(); // ocl
		Precedence symbol_2 = PivotFactory.eINSTANCE.createPrecedence(); // UNARY
		Precedence symbol_3 = PivotFactory.eINSTANCE.createPrecedence(); // IMPLIES
		Precedence symbol_4 = PivotFactory.eINSTANCE.createPrecedence(); // OR
		Precedence symbol_5 = PivotFactory.eINSTANCE.createPrecedence(); // MULTIPLICATIVE
		Precedence symbol_6 = PivotFactory.eINSTANCE.createPrecedence(); // EQUALITY
		Precedence symbol_7 = PivotFactory.eINSTANCE.createPrecedence(); // RELATIONAL
		Precedence symbol_8 = PivotFactory.eINSTANCE.createPrecedence(); // ADDITIVE
		Precedence symbol_9 = PivotFactory.eINSTANCE.createPrecedence(); // NAVIGATION
		Precedence symbol_10 = PivotFactory.eINSTANCE.createPrecedence(); // AND
		Precedence symbol_11 = PivotFactory.eINSTANCE.createPrecedence(); // XOR
		BagType symbol_12 = PivotFactory.eINSTANCE.createBagType(); // ocl|Bag{T}
		TemplateSignature symbol_13 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Bag{T}|
		TypeTemplateParameter symbol_14 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_15 = PivotFactory.eINSTANCE.createClass(); // ocl|Bag{T}?T
		
		TemplateSignature symbol_16 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Bag{T}|flatten{T2}()|
		TypeTemplateParameter symbol_17 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_18 = PivotFactory.eINSTANCE.createClass(); // ocl|Bag{T}|flatten{T2}()?T2
		
		
		PrimitiveType symbol_19 = PivotFactory.eINSTANCE.createPrimitiveType(); // Boolean
		
		Class symbol_20 = PivotFactory.eINSTANCE.createClass(); // ocl|Classifier
		
		CollectionType symbol_21 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection{T}
		TemplateSignature symbol_22 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Collection{T}|
		TypeTemplateParameter symbol_23 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_24 = PivotFactory.eINSTANCE.createClass(); // ocl|Collection{T}?T
		
		TemplateSignature symbol_25 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Collection{T}|excludesAll{T2}(ocl|Collection[T2])|
		TypeTemplateParameter symbol_26 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_27 = PivotFactory.eINSTANCE.createClass(); // ocl|Collection{T}|excludesAll{T2}(ocl|Collection[T2])?T2
		
		TemplateSignature symbol_28 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Collection{T}|flatten{T2}()|
		TypeTemplateParameter symbol_29 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_30 = PivotFactory.eINSTANCE.createClass(); // ocl|Collection{T}|flatten{T2}()?T2
		
		TemplateSignature symbol_31 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Collection{T}|includesAll{T2}(ocl|Collection[T2])|
		TypeTemplateParameter symbol_32 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_33 = PivotFactory.eINSTANCE.createClass(); // ocl|Collection{T}|includesAll{T2}(ocl|Collection[T2])?T2
		
		TemplateSignature symbol_34 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Collection{T}|iterate{Tacc}(ocl|Collection{T}?T;Tacc)|
		TypeTemplateParameter symbol_35 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_36 = PivotFactory.eINSTANCE.createClass(); // ocl|Collection{T}|iterate{Tacc}(ocl|Collection{T}?T;Tacc)?Tacc
		
		TemplateSignature symbol_37 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Collection{T}|product{T2}(ocl|Collection[T2])|
		TypeTemplateParameter symbol_38 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_39 = PivotFactory.eINSTANCE.createClass(); // ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2
		
		
		Class symbol_40 = PivotFactory.eINSTANCE.createClass(); // ocl|Enumeration
		
		PrimitiveType symbol_41 = PivotFactory.eINSTANCE.createPrimitiveType(); // Integer
		
		CollectionType symbol_42 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection{T}
		TemplateSignature symbol_43 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|NonOrderedCollection{T}|
		TypeTemplateParameter symbol_44 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_45 = PivotFactory.eINSTANCE.createClass(); // ocl|NonOrderedCollection{T}?T
		
		
		CollectionType symbol_46 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonUniqueCollection{T}
		TemplateSignature symbol_47 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|NonUniqueCollection{T}|
		TypeTemplateParameter symbol_48 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_49 = PivotFactory.eINSTANCE.createClass(); // ocl|NonUniqueCollection{T}?T
		
		
		AnyType symbol_50 = PivotFactory.eINSTANCE.createAnyType(); // ocl|OclAny
		TemplateSignature symbol_51 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|OclAny|oclAsType{T}(ocl|Classifier)|
		TypeTemplateParameter symbol_52 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_53 = PivotFactory.eINSTANCE.createClass(); // ocl|OclAny|oclAsType{T}(ocl|Classifier)?T
		
		
		InvalidType symbol_54 = PivotFactory.eINSTANCE.createInvalidType(); // ocl|OclInvalid
		
		Class symbol_55 = PivotFactory.eINSTANCE.createClass(); // ocl|OclMessage
		
		Class symbol_56 = PivotFactory.eINSTANCE.createClass(); // ocl|OclState
		
		Class symbol_57 = PivotFactory.eINSTANCE.createClass(); // ocl|OclTuple
		
		VoidType symbol_58 = PivotFactory.eINSTANCE.createVoidType(); // ocl|OclVoid
		
		CollectionType symbol_59 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection{T}
		TemplateSignature symbol_60 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|OrderedCollection{T}|
		TypeTemplateParameter symbol_61 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_62 = PivotFactory.eINSTANCE.createClass(); // ocl|OrderedCollection{T}?T
		
		
		OrderedSetType symbol_63 = PivotFactory.eINSTANCE.createOrderedSetType(); // ocl|OrderedSet{T}
		TemplateSignature symbol_64 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|OrderedSet{T}|
		TypeTemplateParameter symbol_65 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_66 = PivotFactory.eINSTANCE.createClass(); // ocl|OrderedSet{T}?T
		
		
		PrimitiveType symbol_67 = PivotFactory.eINSTANCE.createPrimitiveType(); // Real
		TemplateSignature symbol_68 = PivotFactory.eINSTANCE.createTemplateSignature(); // Real|oclAsType{T}(ocl|Classifier)|
		TypeTemplateParameter symbol_69 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_70 = PivotFactory.eINSTANCE.createClass(); // Real|oclAsType{T}(ocl|Classifier)?T
		
		
		SequenceType symbol_71 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence{T}
		TemplateSignature symbol_72 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Sequence{T}|
		TypeTemplateParameter symbol_73 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_74 = PivotFactory.eINSTANCE.createClass(); // ocl|Sequence{T}?T
		
		TemplateSignature symbol_75 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Sequence{T}|flatten{T2}()|
		TypeTemplateParameter symbol_76 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_77 = PivotFactory.eINSTANCE.createClass(); // ocl|Sequence{T}|flatten{T2}()?T2
		
		
		SetType symbol_78 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set{T}
		TemplateSignature symbol_79 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Set{T}|
		TypeTemplateParameter symbol_80 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_81 = PivotFactory.eINSTANCE.createClass(); // ocl|Set{T}?T
		
		TemplateSignature symbol_82 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Set{T}|flatten{T2}()|
		TypeTemplateParameter symbol_83 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_84 = PivotFactory.eINSTANCE.createClass(); // ocl|Set{T}|flatten{T2}()?T2
		
		
		PrimitiveType symbol_85 = PivotFactory.eINSTANCE.createPrimitiveType(); // String
		
		Class symbol_86 = PivotFactory.eINSTANCE.createClass(); // ocl|Tuple{T1,T2}
		TemplateSignature symbol_87 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Tuple{T1,T2}|
		TypeTemplateParameter symbol_88 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_89 = PivotFactory.eINSTANCE.createClass(); // ocl|Tuple{T1,T2}?T1
		TypeTemplateParameter symbol_90 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_91 = PivotFactory.eINSTANCE.createClass(); // ocl|Tuple{T1,T2}?T2
		
		
		CollectionType symbol_92 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection{T}
		TemplateSignature symbol_93 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|UniqueCollection{T}|
		TypeTemplateParameter symbol_94 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_95 = PivotFactory.eINSTANCE.createClass(); // ocl|UniqueCollection{T}?T
		
		
		PrimitiveType symbol_96 = PivotFactory.eINSTANCE.createPrimitiveType(); // UnlimitedNatural
		
		Package symbol_97 = PivotFactory.eINSTANCE.createPackage(); // ocl|orphanage
		BagType symbol_98 = PivotFactory.eINSTANCE.createBagType(); // ocl|Bag[ocl|NonOrderedCollection{T}?T]
		
		BagType symbol_99 = PivotFactory.eINSTANCE.createBagType(); // ocl|Bag[ocl|Bag{T}|flatten{T2}()?T2]
		
		BagType symbol_100 = PivotFactory.eINSTANCE.createBagType(); // ocl|Bag[ocl|Bag{T}?T]
		
		BagType symbol_101 = PivotFactory.eINSTANCE.createBagType(); // ocl|Bag[ocl|Collection{T}?T]
		
		CollectionType symbol_102 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Collection{T}|flatten{T2}()?T2]
		
		CollectionType symbol_103 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Bag{T}|flatten{T2}()?T2]
		
		CollectionType symbol_104 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Bag{T}?T]
		
		CollectionType symbol_105 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|OrderedSet{T}?T]
		
		CollectionType symbol_106 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Collection{T}|excludesAll{T2}(ocl|Collection[T2])?T2]
		
		CollectionType symbol_107 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Set{T}|flatten{T2}()?T2]
		
		CollectionType symbol_108 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|NonOrderedCollection{T}?T]
		
		CollectionType symbol_109 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]
		
		CollectionType symbol_110 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Collection{T}?T]
		
		CollectionType symbol_111 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]]
		
		CollectionType symbol_112 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|OrderedCollection{T}?T]
		
		CollectionType symbol_113 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Classifier]
		
		CollectionType symbol_114 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Enumeration]
		
		CollectionType symbol_115 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Collection{T}|includesAll{T2}(ocl|Collection[T2])?T2]
		
		CollectionType symbol_116 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|OclVoid]
		
		CollectionType symbol_117 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|NonUniqueCollection{T}?T]
		
		CollectionType symbol_118 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Set{T}?T]
		
		CollectionType symbol_119 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Sequence{T}|flatten{T2}()?T2]
		
		CollectionType symbol_120 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|OclInvalid]
		
		CollectionType symbol_121 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[Boolean]
		
		CollectionType symbol_122 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Sequence{T}?T]
		
		CollectionType symbol_123 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[String]
		
		CollectionType symbol_124 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|OclAny]
		
		CollectionType symbol_125 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|UniqueCollection{T}?T]
		
		CollectionType symbol_126 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|Bag{T}?T]
		
		CollectionType symbol_127 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[Boolean]
		
		CollectionType symbol_128 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]]
		
		CollectionType symbol_129 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|NonOrderedCollection{T}?T]
		
		CollectionType symbol_130 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|Collection{T}?T]
		
		CollectionType symbol_131 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|Set{T}?T]
		
		CollectionType symbol_132 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|Set{T}|flatten{T2}()?T2]
		
		CollectionType symbol_133 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|OrderedSet{T}?T]
		
		CollectionType symbol_134 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|Enumeration]
		
		CollectionType symbol_135 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|Bag{T}|flatten{T2}()?T2]
		
		CollectionType symbol_136 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|OclInvalid]
		
		CollectionType symbol_137 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|OclAny]
		
		CollectionType symbol_138 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|Classifier]
		
		CollectionType symbol_139 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|OclVoid]
		
		CollectionType symbol_140 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonUniqueCollection[String]
		
		CollectionType symbol_141 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonUniqueCollection[ocl|NonOrderedCollection{T}?T]
		
		CollectionType symbol_142 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonUniqueCollection[ocl|Sequence{T}?T]
		
		CollectionType symbol_143 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonUniqueCollection[ocl|Sequence{T}|flatten{T2}()?T2]
		
		CollectionType symbol_144 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonUniqueCollection[ocl|NonUniqueCollection{T}?T]
		
		CollectionType symbol_145 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonUniqueCollection[ocl|Bag{T}?T]
		
		CollectionType symbol_146 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonUniqueCollection[ocl|Collection{T}?T]
		
		CollectionType symbol_147 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonUniqueCollection[ocl|Bag{T}|flatten{T2}()?T2]
		
		CollectionType symbol_148 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonUniqueCollection[ocl|OrderedCollection{T}?T]
		
		CollectionType symbol_149 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection[ocl|Collection{T}?T]
		
		CollectionType symbol_150 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection[ocl|OrderedSet{T}?T]
		
		CollectionType symbol_151 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection[String]
		
		CollectionType symbol_152 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection[ocl|UniqueCollection{T}?T]
		
		CollectionType symbol_153 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection[ocl|Sequence{T}|flatten{T2}()?T2]
		
		CollectionType symbol_154 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection[ocl|Sequence{T}?T]
		
		CollectionType symbol_155 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection[ocl|NonUniqueCollection{T}?T]
		
		CollectionType symbol_156 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection[ocl|OrderedCollection{T}?T]
		
		OrderedSetType symbol_157 = PivotFactory.eINSTANCE.createOrderedSetType(); // ocl|OrderedSet[ocl|OrderedSet{T}?T]
		
		OrderedSetType symbol_158 = PivotFactory.eINSTANCE.createOrderedSetType(); // ocl|OrderedSet[ocl|Collection{T}?T]
		
		OrderedSetType symbol_159 = PivotFactory.eINSTANCE.createOrderedSetType(); // ocl|OrderedSet[ocl|OrderedCollection{T}?T]
		
		OrderedSetType symbol_160 = PivotFactory.eINSTANCE.createOrderedSetType(); // ocl|OrderedSet[ocl|UniqueCollection{T}?T]
		
		SequenceType symbol_161 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence[ocl|Collection{T}?T]
		
		SequenceType symbol_162 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence[ocl|OrderedCollection{T}?T]
		
		SequenceType symbol_163 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence[String]
		
		SequenceType symbol_164 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence[ocl|Sequence{T}?T]
		
		SequenceType symbol_165 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence[ocl|NonUniqueCollection{T}?T]
		
		SequenceType symbol_166 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence[ocl|Sequence{T}|flatten{T2}()?T2]
		
		SetType symbol_167 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|OrderedSet{T}?T]
		
		SetType symbol_168 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Collection{T}?T]
		
		SetType symbol_169 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Classifier]
		
		SetType symbol_170 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[Boolean]
		
		SetType symbol_171 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|NonOrderedCollection{T}?T]
		
		SetType symbol_172 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Set{T}?T]
		
		SetType symbol_173 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|OclVoid]
		
		SetType symbol_174 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]]
		
		SetType symbol_175 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Set{T}|flatten{T2}()?T2]
		
		SetType symbol_176 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Enumeration]
		
		SetType symbol_177 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|OclAny]
		
		SetType symbol_178 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|OclInvalid]
		
		Class symbol_179 = PivotFactory.eINSTANCE.createClass(); // ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]
		
		CollectionType symbol_180 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|OclInvalid]
		
		CollectionType symbol_181 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]]
		
		CollectionType symbol_182 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|Enumeration]
		
		CollectionType symbol_183 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|OclVoid]
		
		CollectionType symbol_184 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[Boolean]
		
		CollectionType symbol_185 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|Collection{T}?T]
		
		CollectionType symbol_186 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|Set{T}?T]
		
		CollectionType symbol_187 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|NonOrderedCollection{T}?T]
		
		CollectionType symbol_188 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|Classifier]
		
		CollectionType symbol_189 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|UniqueCollection{T}?T]
		
		CollectionType symbol_190 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|OrderedSet{T}?T]
		
		CollectionType symbol_191 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|Set{T}|flatten{T2}()?T2]
		
		CollectionType symbol_192 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|OclAny]
		
		CollectionType symbol_193 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|OrderedCollection{T}?T]
		
		

		symbol_1.setName("ocl");
		symbol_1.setNsPrefix("ocl");
		symbol_1.setNsURI("http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib");
		symbol_2.setName("UNARY");
		symbol_2.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_2);
		symbol_3.setName("IMPLIES");
		symbol_3.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_3);
		symbol_4.setName("OR");
		symbol_4.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_4);
		symbol_5.setName("MULTIPLICATIVE");
		symbol_5.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_5);
		symbol_6.setName("EQUALITY");
		symbol_6.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_6);
		symbol_7.setName("RELATIONAL");
		symbol_7.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_7);
		symbol_8.setName("ADDITIVE");
		symbol_8.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_8);
		symbol_9.setName("NAVIGATION");
		symbol_9.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_9);
		symbol_10.setName("AND");
		symbol_10.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_10);
		symbol_11.setName("XOR");
		symbol_11.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_11);
		//
		// ocl::Bag ocl|Bag{T}
		//
		symbol_12.setName("Bag");
		symbol_12.setElementType(symbol_58);
		symbol_15.setName("T");
		symbol_14.setOwnedParameteredElement(symbol_15);
		symbol_13.getOwnedParameters().add(symbol_14);
		
		symbol_12.setOwnedTemplateSignature(symbol_13);
		symbol_12.getSuperClasses().add(symbol_145);
		symbol_12.getSuperClasses().add(symbol_126);
		{	// ocl::Bag::<>() ocl|Bag{T}|<>(ocl|OclAny)
			Operation symbol_194 = PivotFactory.eINSTANCE.createOperation();
			symbol_194.setName("<>");
			symbol_194.setType(symbol_19);  // Boolean
			Parameter symbol_195 = PivotFactory.eINSTANCE.createParameter();
			symbol_195.setName("object2");
			symbol_195.setType(symbol_50);  // ocl|OclAny
			symbol_194.getOwnedParameters().add(symbol_195);
			symbol_194.setPrecedence(symbol_6);
			symbol_194.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_194);
		}
		{	// ocl::Bag::=() ocl|Bag{T}|=(ocl|OclAny)
			Operation symbol_196 = PivotFactory.eINSTANCE.createOperation();
			symbol_196.setName("=");
			symbol_196.setType(symbol_19);  // Boolean
			Parameter symbol_197 = PivotFactory.eINSTANCE.createParameter();
			symbol_197.setName("object2");
			symbol_197.setType(symbol_50);  // ocl|OclAny
			symbol_196.getOwnedParameters().add(symbol_197);
			symbol_196.setPrecedence(symbol_6);
			symbol_196.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_196);
		}
		{	// ocl::Bag::excluding() ocl|Bag{T}|excluding(ocl|OclAny)
			Operation symbol_198 = PivotFactory.eINSTANCE.createOperation();
			symbol_198.setName("excluding");
			symbol_198.setType(symbol_100);  // ocl|Bag[ocl|Bag{T}?T]
			Parameter symbol_199 = PivotFactory.eINSTANCE.createParameter();
			symbol_199.setName("object");
			symbol_199.setType(symbol_50);  // ocl|OclAny
			symbol_198.getOwnedParameters().add(symbol_199);
			symbol_198.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_198);
		}
		{	// ocl::Bag::flatten() ocl|Bag{T}|flatten{T2}()
			Operation symbol_200 = PivotFactory.eINSTANCE.createOperation();
			symbol_18.setName("T2");
			symbol_17.setOwnedParameteredElement(symbol_18);
			symbol_16.getOwnedParameters().add(symbol_17);
			
			symbol_200.setOwnedTemplateSignature(symbol_16);
			symbol_200.setName("flatten");
			symbol_200.setType(symbol_99);  // ocl|Bag[ocl|Bag{T}|flatten{T2}()?T2]
			symbol_200.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_200);
		}
		{	// ocl::Bag::including() ocl|Bag{T}|including(ocl|Bag{T}?T)
			Operation symbol_201 = PivotFactory.eINSTANCE.createOperation();
			symbol_201.setName("including");
			symbol_201.setType(symbol_100);  // ocl|Bag[ocl|Bag{T}?T]
			Parameter symbol_202 = PivotFactory.eINSTANCE.createParameter();
			symbol_202.setName("object");
			symbol_202.setType(symbol_15);  // ocl|Bag{T}?T
			symbol_201.getOwnedParameters().add(symbol_202);
			symbol_201.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_201);
		}
		{	// ocl::Bag::reject() ocl|Bag{T}|reject(ocl|Bag{T}?T)
			Iteration symbol_203 = PivotFactory.eINSTANCE.createIteration();
			symbol_203.setName("reject");
			symbol_203.setType(symbol_100);  // ocl|Bag[ocl|Bag{T}?T]
			Parameter symbol_204 = PivotFactory.eINSTANCE.createParameter();
			symbol_204.setName("i");
			symbol_204.setType(symbol_15);  // ocl|Bag{T}?T
			symbol_203.getOwnedIterators().add(symbol_204);
			symbol_203.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_203);
		}
		{	// ocl::Bag::select() ocl|Bag{T}|select(ocl|Bag{T}?T)
			Iteration symbol_205 = PivotFactory.eINSTANCE.createIteration();
			symbol_205.setName("select");
			symbol_205.setType(symbol_100);  // ocl|Bag[ocl|Bag{T}?T]
			Parameter symbol_206 = PivotFactory.eINSTANCE.createParameter();
			symbol_206.setName("i");
			symbol_206.setType(symbol_15);  // ocl|Bag{T}?T
			symbol_205.getOwnedIterators().add(symbol_206);
			symbol_205.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_205);
		}
		symbol_1.getOwnedTypes().add(symbol_12);
		//
		// ocl::Boolean Boolean
		//
		symbol_19.setName("Boolean");
		symbol_19.getSuperClasses().add(symbol_50);
		{	// ocl::Boolean::<>() Boolean|<>(ocl|OclAny)
			Operation symbol_207 = PivotFactory.eINSTANCE.createOperation();
			symbol_207.setName("<>");
			symbol_207.setType(symbol_19);  // Boolean
			Parameter symbol_208 = PivotFactory.eINSTANCE.createParameter();
			symbol_208.setName("object2");
			symbol_208.setType(symbol_50);  // ocl|OclAny
			symbol_207.getOwnedParameters().add(symbol_208);
			symbol_207.setPrecedence(symbol_6);
			symbol_207.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_207);
		}
		{	// ocl::Boolean::=() Boolean|=(ocl|OclAny)
			Operation symbol_209 = PivotFactory.eINSTANCE.createOperation();
			symbol_209.setName("=");
			symbol_209.setType(symbol_19);  // Boolean
			Parameter symbol_210 = PivotFactory.eINSTANCE.createParameter();
			symbol_210.setName("object2");
			symbol_210.setType(symbol_50);  // ocl|OclAny
			symbol_209.getOwnedParameters().add(symbol_210);
			symbol_209.setPrecedence(symbol_6);
			symbol_209.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_209);
		}
		{	// ocl::Boolean::allInstances() Boolean|allInstances()
			Operation symbol_211 = PivotFactory.eINSTANCE.createOperation();
			symbol_211.setName("allInstances");
			symbol_211.setType(symbol_170);  // ocl|Set[Boolean]
			symbol_211.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_211);
		}
		{	// ocl::Boolean::and() Boolean|and(Boolean)
			Operation symbol_212 = PivotFactory.eINSTANCE.createOperation();
			symbol_212.setName("and");
			symbol_212.setType(symbol_19);  // Boolean
			Parameter symbol_213 = PivotFactory.eINSTANCE.createParameter();
			symbol_213.setName("b");
			symbol_213.setType(symbol_19);  // Boolean
			symbol_212.getOwnedParameters().add(symbol_213);
			symbol_212.setPrecedence(symbol_10);
			symbol_212.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_212);
		}
		{	// ocl::Boolean::implies() Boolean|implies(Boolean)
			Operation symbol_214 = PivotFactory.eINSTANCE.createOperation();
			symbol_214.setName("implies");
			symbol_214.setType(symbol_19);  // Boolean
			Parameter symbol_215 = PivotFactory.eINSTANCE.createParameter();
			symbol_215.setName("b");
			symbol_215.setType(symbol_19);  // Boolean
			symbol_214.getOwnedParameters().add(symbol_215);
			symbol_214.setPrecedence(symbol_3);
			symbol_214.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_214);
		}
		{	// ocl::Boolean::not() Boolean|not()
			Operation symbol_216 = PivotFactory.eINSTANCE.createOperation();
			symbol_216.setName("not");
			symbol_216.setType(symbol_19);  // Boolean
			symbol_216.setPrecedence(symbol_2);
			symbol_216.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_216);
		}
		{	// ocl::Boolean::or() Boolean|or(Boolean)
			Operation symbol_217 = PivotFactory.eINSTANCE.createOperation();
			symbol_217.setName("or");
			symbol_217.setType(symbol_19);  // Boolean
			Parameter symbol_218 = PivotFactory.eINSTANCE.createParameter();
			symbol_218.setName("b");
			symbol_218.setType(symbol_19);  // Boolean
			symbol_217.getOwnedParameters().add(symbol_218);
			symbol_217.setPrecedence(symbol_4);
			symbol_217.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_217);
		}
		{	// ocl::Boolean::toString() Boolean|toString()
			Operation symbol_219 = PivotFactory.eINSTANCE.createOperation();
			symbol_219.setName("toString");
			symbol_219.setType(symbol_85);  // String
			symbol_219.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_219);
		}
		{	// ocl::Boolean::xor() Boolean|xor(Boolean)
			Operation symbol_220 = PivotFactory.eINSTANCE.createOperation();
			symbol_220.setName("xor");
			symbol_220.setType(symbol_19);  // Boolean
			Parameter symbol_221 = PivotFactory.eINSTANCE.createParameter();
			symbol_221.setName("b");
			symbol_221.setType(symbol_19);  // Boolean
			symbol_220.getOwnedParameters().add(symbol_221);
			symbol_220.setPrecedence(symbol_11);
			symbol_220.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_220);
		}
		symbol_1.getOwnedTypes().add(symbol_19);
		//
		// ocl::Classifier ocl|Classifier
		//
		symbol_20.setName("Classifier");
		symbol_20.getSuperClasses().add(symbol_50);
		{	// ocl::Classifier::allInstances() ocl|Classifier|allInstances()
			Operation symbol_222 = PivotFactory.eINSTANCE.createOperation();
			symbol_222.setName("allInstances");
			symbol_222.setType(symbol_169);  // ocl|Set[ocl|Classifier]
			symbol_222.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
			symbol_20.getOwnedOperations().add(symbol_222);
		}
		symbol_1.getOwnedTypes().add(symbol_20);
		//
		// ocl::Collection ocl|Collection{T}
		//
		symbol_21.setName("Collection");
		symbol_21.setElementType(symbol_58);
		symbol_24.setName("T");
		symbol_23.setOwnedParameteredElement(symbol_24);
		symbol_22.getOwnedParameters().add(symbol_23);
		
		symbol_21.setOwnedTemplateSignature(symbol_22);
		symbol_21.getSuperClasses().add(symbol_50);
		{	// ocl::Collection::<>() ocl|Collection{T}|<>(ocl|OclAny)
			Operation symbol_223 = PivotFactory.eINSTANCE.createOperation();
			symbol_223.setName("<>");
			symbol_223.setType(symbol_19);  // Boolean
			Parameter symbol_224 = PivotFactory.eINSTANCE.createParameter();
			symbol_224.setName("object2");
			symbol_224.setType(symbol_50);  // ocl|OclAny
			symbol_223.getOwnedParameters().add(symbol_224);
			symbol_223.setPrecedence(symbol_6);
			symbol_223.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_223);
		}
		{	// ocl::Collection::=() ocl|Collection{T}|=(ocl|OclAny)
			Operation symbol_225 = PivotFactory.eINSTANCE.createOperation();
			symbol_225.setName("=");
			symbol_225.setType(symbol_19);  // Boolean
			Parameter symbol_226 = PivotFactory.eINSTANCE.createParameter();
			symbol_226.setName("object2");
			symbol_226.setType(symbol_50);  // ocl|OclAny
			symbol_225.getOwnedParameters().add(symbol_226);
			symbol_225.setPrecedence(symbol_6);
			symbol_225.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_225);
		}
		{	// ocl::Collection::any() ocl|Collection{T}|any(ocl|Collection{T}?T)
			Iteration symbol_227 = PivotFactory.eINSTANCE.createIteration();
			symbol_227.setName("any");
			symbol_227.setType(symbol_24);  // ocl|Collection{T}?T
			Parameter symbol_228 = PivotFactory.eINSTANCE.createParameter();
			symbol_228.setName("i");
			symbol_228.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_227.getOwnedIterators().add(symbol_228);
			symbol_227.setImplementation(org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_227);
		}
		{	// ocl::Collection::asBag() ocl|Collection{T}|asBag()
			Operation symbol_229 = PivotFactory.eINSTANCE.createOperation();
			symbol_229.setName("asBag");
			symbol_229.setType(symbol_101);  // ocl|Bag[ocl|Collection{T}?T]
			symbol_229.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_229);
		}
		{	// ocl::Collection::asOrderedSet() ocl|Collection{T}|asOrderedSet()
			Operation symbol_230 = PivotFactory.eINSTANCE.createOperation();
			symbol_230.setName("asOrderedSet");
			symbol_230.setType(symbol_158);  // ocl|OrderedSet[ocl|Collection{T}?T]
			symbol_230.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_230);
		}
		{	// ocl::Collection::asSequence() ocl|Collection{T}|asSequence()
			Operation symbol_231 = PivotFactory.eINSTANCE.createOperation();
			symbol_231.setName("asSequence");
			symbol_231.setType(symbol_161);  // ocl|Sequence[ocl|Collection{T}?T]
			symbol_231.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_231);
		}
		{	// ocl::Collection::asSet() ocl|Collection{T}|asSet()
			Operation symbol_232 = PivotFactory.eINSTANCE.createOperation();
			symbol_232.setName("asSet");
			symbol_232.setType(symbol_168);  // ocl|Set[ocl|Collection{T}?T]
			symbol_232.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_232);
		}
		{	// ocl::Collection::collect() ocl|Collection{T}|collect(ocl|Collection{T}?T)
			Iteration symbol_233 = PivotFactory.eINSTANCE.createIteration();
			symbol_233.setName("collect");
			symbol_233.setType(symbol_110);  // ocl|Collection[ocl|Collection{T}?T]
			Parameter symbol_234 = PivotFactory.eINSTANCE.createParameter();
			symbol_234.setName("i");
			symbol_234.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_233.getOwnedIterators().add(symbol_234);
			symbol_233.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_233);
		}
		{	// ocl::Collection::collectNested() ocl|Collection{T}|collectNested(ocl|Collection{T}?T)
			Iteration symbol_235 = PivotFactory.eINSTANCE.createIteration();
			symbol_235.setName("collectNested");
			symbol_235.setType(symbol_110);  // ocl|Collection[ocl|Collection{T}?T]
			Parameter symbol_236 = PivotFactory.eINSTANCE.createParameter();
			symbol_236.setName("i");
			symbol_236.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_235.getOwnedIterators().add(symbol_236);
			symbol_235.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_235);
		}
		{	// ocl::Collection::count() ocl|Collection{T}|count(ocl|OclAny)
			Operation symbol_237 = PivotFactory.eINSTANCE.createOperation();
			symbol_237.setName("count");
			symbol_237.setType(symbol_41);  // Integer
			Parameter symbol_238 = PivotFactory.eINSTANCE.createParameter();
			symbol_238.setName("object");
			symbol_238.setType(symbol_50);  // ocl|OclAny
			symbol_237.getOwnedParameters().add(symbol_238);
			symbol_237.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_237);
		}
		{	// ocl::Collection::excludes() ocl|Collection{T}|excludes(ocl|OclAny)
			Operation symbol_239 = PivotFactory.eINSTANCE.createOperation();
			symbol_239.setName("excludes");
			symbol_239.setType(symbol_19);  // Boolean
			Parameter symbol_240 = PivotFactory.eINSTANCE.createParameter();
			symbol_240.setName("object");
			symbol_240.setType(symbol_50);  // ocl|OclAny
			symbol_239.getOwnedParameters().add(symbol_240);
			symbol_239.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_239);
		}
		{	// ocl::Collection::excludesAll() ocl|Collection{T}|excludesAll{T2}(ocl|Collection[T2])
			Operation symbol_241 = PivotFactory.eINSTANCE.createOperation();
			symbol_27.setName("T2");
			symbol_26.setOwnedParameteredElement(symbol_27);
			symbol_25.getOwnedParameters().add(symbol_26);
			
			symbol_241.setOwnedTemplateSignature(symbol_25);
			symbol_241.setName("excludesAll");
			symbol_241.setType(symbol_19);  // Boolean
			Parameter symbol_242 = PivotFactory.eINSTANCE.createParameter();
			symbol_242.setName("c2");
			symbol_242.setType(symbol_106);  // ocl|Collection[ocl|Collection{T}|excludesAll{T2}(ocl|Collection[T2])?T2]
			symbol_241.getOwnedParameters().add(symbol_242);
			symbol_241.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_241);
		}
		{	// ocl::Collection::excluding() ocl|Collection{T}|excluding(ocl|OclAny)
			Operation symbol_243 = PivotFactory.eINSTANCE.createOperation();
			symbol_243.setName("excluding");
			symbol_243.setType(symbol_110);  // ocl|Collection[ocl|Collection{T}?T]
			Parameter symbol_244 = PivotFactory.eINSTANCE.createParameter();
			symbol_244.setName("object");
			symbol_244.setType(symbol_50);  // ocl|OclAny
			symbol_243.getOwnedParameters().add(symbol_244);
			symbol_243.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_243);
		}
		{	// ocl::Collection::exists() ocl|Collection{T}|exists(ocl|Collection{T}?T)
			Iteration symbol_245 = PivotFactory.eINSTANCE.createIteration();
			symbol_245.setName("exists");
			symbol_245.setType(symbol_19);  // Boolean
			Parameter symbol_246 = PivotFactory.eINSTANCE.createParameter();
			symbol_246.setName("i");
			symbol_246.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_245.getOwnedIterators().add(symbol_246);
			symbol_245.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_245);
		}
		{	// ocl::Collection::exists() ocl|Collection{T}|exists(ocl|Collection{T}?T,T)
			Iteration symbol_247 = PivotFactory.eINSTANCE.createIteration();
			symbol_247.setName("exists");
			symbol_247.setType(symbol_19);  // Boolean
			Parameter symbol_248 = PivotFactory.eINSTANCE.createParameter();
			symbol_248.setName("i");
			symbol_248.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_247.getOwnedIterators().add(symbol_248);
			Parameter symbol_249 = PivotFactory.eINSTANCE.createParameter();
			symbol_249.setName("j");
			symbol_249.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_247.getOwnedIterators().add(symbol_249);
			symbol_247.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_247);
		}
		{	// ocl::Collection::flatten() ocl|Collection{T}|flatten{T2}()
			Operation symbol_250 = PivotFactory.eINSTANCE.createOperation();
			symbol_30.setName("T2");
			symbol_29.setOwnedParameteredElement(symbol_30);
			symbol_28.getOwnedParameters().add(symbol_29);
			
			symbol_250.setOwnedTemplateSignature(symbol_28);
			symbol_250.setName("flatten");
			symbol_250.setType(symbol_102);  // ocl|Collection[ocl|Collection{T}|flatten{T2}()?T2]
			symbol_250.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_250);
		}
		{	// ocl::Collection::forAll() ocl|Collection{T}|forAll(ocl|Collection{T}?T)
			Iteration symbol_251 = PivotFactory.eINSTANCE.createIteration();
			symbol_251.setName("forAll");
			symbol_251.setType(symbol_19);  // Boolean
			Parameter symbol_252 = PivotFactory.eINSTANCE.createParameter();
			symbol_252.setName("i");
			symbol_252.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_251.getOwnedIterators().add(symbol_252);
			symbol_251.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_251);
		}
		{	// ocl::Collection::forAll() ocl|Collection{T}|forAll(ocl|Collection{T}?T,T)
			Iteration symbol_253 = PivotFactory.eINSTANCE.createIteration();
			symbol_253.setName("forAll");
			symbol_253.setType(symbol_19);  // Boolean
			Parameter symbol_254 = PivotFactory.eINSTANCE.createParameter();
			symbol_254.setName("i");
			symbol_254.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_253.getOwnedIterators().add(symbol_254);
			Parameter symbol_255 = PivotFactory.eINSTANCE.createParameter();
			symbol_255.setName("j");
			symbol_255.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_253.getOwnedIterators().add(symbol_255);
			symbol_253.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_253);
		}
		{	// ocl::Collection::includes() ocl|Collection{T}|includes(ocl|OclAny)
			Operation symbol_256 = PivotFactory.eINSTANCE.createOperation();
			symbol_256.setName("includes");
			symbol_256.setType(symbol_19);  // Boolean
			Parameter symbol_257 = PivotFactory.eINSTANCE.createParameter();
			symbol_257.setName("object");
			symbol_257.setType(symbol_50);  // ocl|OclAny
			symbol_256.getOwnedParameters().add(symbol_257);
			symbol_256.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_256);
		}
		{	// ocl::Collection::includesAll() ocl|Collection{T}|includesAll{T2}(ocl|Collection[T2])
			Operation symbol_258 = PivotFactory.eINSTANCE.createOperation();
			symbol_33.setName("T2");
			symbol_32.setOwnedParameteredElement(symbol_33);
			symbol_31.getOwnedParameters().add(symbol_32);
			
			symbol_258.setOwnedTemplateSignature(symbol_31);
			symbol_258.setName("includesAll");
			symbol_258.setType(symbol_19);  // Boolean
			Parameter symbol_259 = PivotFactory.eINSTANCE.createParameter();
			symbol_259.setName("c2");
			symbol_259.setType(symbol_115);  // ocl|Collection[ocl|Collection{T}|includesAll{T2}(ocl|Collection[T2])?T2]
			symbol_258.getOwnedParameters().add(symbol_259);
			symbol_258.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_258);
		}
		{	// ocl::Collection::including() ocl|Collection{T}|including(ocl|Collection{T}?T)
			Operation symbol_260 = PivotFactory.eINSTANCE.createOperation();
			symbol_260.setName("including");
			symbol_260.setType(symbol_110);  // ocl|Collection[ocl|Collection{T}?T]
			Parameter symbol_261 = PivotFactory.eINSTANCE.createParameter();
			symbol_261.setName("object");
			symbol_261.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_260.getOwnedParameters().add(symbol_261);
			symbol_260.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_260);
		}
		{	// ocl::Collection::isEmpty() ocl|Collection{T}|isEmpty()
			Operation symbol_262 = PivotFactory.eINSTANCE.createOperation();
			symbol_262.setName("isEmpty");
			symbol_262.setType(symbol_19);  // Boolean
			symbol_262.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_262);
		}
		{	// ocl::Collection::isUnique() ocl|Collection{T}|isUnique(ocl|Collection{T}?T)
			Iteration symbol_263 = PivotFactory.eINSTANCE.createIteration();
			symbol_263.setName("isUnique");
			symbol_263.setType(symbol_19);  // Boolean
			Parameter symbol_264 = PivotFactory.eINSTANCE.createParameter();
			symbol_264.setName("i");
			symbol_264.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_263.getOwnedIterators().add(symbol_264);
			symbol_263.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_263);
		}
		{	// ocl::Collection::iterate() ocl|Collection{T}|iterate{Tacc}(ocl|Collection{T}?T;Tacc)
			Iteration symbol_265 = PivotFactory.eINSTANCE.createIteration();
			symbol_36.setName("Tacc");
			symbol_35.setOwnedParameteredElement(symbol_36);
			symbol_34.getOwnedParameters().add(symbol_35);
			
			symbol_265.setOwnedTemplateSignature(symbol_34);
			symbol_265.setName("iterate");
			symbol_265.setType(symbol_36);  // ocl|Collection{T}|iterate{Tacc}(ocl|Collection{T}?T;Tacc)?Tacc
			Parameter symbol_266 = PivotFactory.eINSTANCE.createParameter();
			symbol_266.setName("i");
			symbol_266.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_265.getOwnedIterators().add(symbol_266);
			Parameter symbol_267 = PivotFactory.eINSTANCE.createParameter();
			symbol_267.setName("acc");
			symbol_267.setType(symbol_36);  // ocl|Collection{T}|iterate{Tacc}(ocl|Collection{T}?T;Tacc)?Tacc
			symbol_265.getOwnedAccumulators().add(symbol_267);
			symbol_265.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_265);
		}
		{	// ocl::Collection::max() ocl|Collection{T}|max()
			Operation symbol_268 = PivotFactory.eINSTANCE.createOperation();
			symbol_268.setName("max");
			symbol_268.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_268.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_268);
		}
		{	// ocl::Collection::min() ocl|Collection{T}|min()
			Operation symbol_269 = PivotFactory.eINSTANCE.createOperation();
			symbol_269.setName("min");
			symbol_269.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_269.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_269);
		}
		{	// ocl::Collection::notEmpty() ocl|Collection{T}|notEmpty()
			Operation symbol_270 = PivotFactory.eINSTANCE.createOperation();
			symbol_270.setName("notEmpty");
			symbol_270.setType(symbol_19);  // Boolean
			symbol_270.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_270);
		}
		{	// ocl::Collection::one() ocl|Collection{T}|one(ocl|Collection{T}?T)
			Iteration symbol_271 = PivotFactory.eINSTANCE.createIteration();
			symbol_271.setName("one");
			symbol_271.setType(symbol_19);  // Boolean
			Parameter symbol_272 = PivotFactory.eINSTANCE.createParameter();
			symbol_272.setName("i");
			symbol_272.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_271.getOwnedIterators().add(symbol_272);
			symbol_271.setImplementation(org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_271);
		}
		{	// ocl::Collection::product() ocl|Collection{T}|product{T2}(ocl|Collection[T2])
			Operation symbol_273 = PivotFactory.eINSTANCE.createOperation();
			symbol_39.setName("T2");
			symbol_38.setOwnedParameteredElement(symbol_39);
			symbol_37.getOwnedParameters().add(symbol_38);
			
			symbol_273.setOwnedTemplateSignature(symbol_37);
			symbol_273.setName("product");
			symbol_273.setType(symbol_174);  // ocl|Set[ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]]
			Parameter symbol_274 = PivotFactory.eINSTANCE.createParameter();
			symbol_274.setName("c2");
			symbol_274.setType(symbol_109);  // ocl|Collection[ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]
			symbol_273.getOwnedParameters().add(symbol_274);
			symbol_273.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_273);
		}
		{	// ocl::Collection::reject() ocl|Collection{T}|reject(ocl|Collection{T}?T)
			Iteration symbol_275 = PivotFactory.eINSTANCE.createIteration();
			symbol_275.setName("reject");
			symbol_275.setType(symbol_110);  // ocl|Collection[ocl|Collection{T}?T]
			Parameter symbol_276 = PivotFactory.eINSTANCE.createParameter();
			symbol_276.setName("i");
			symbol_276.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_275.getOwnedIterators().add(symbol_276);
			symbol_275.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_275);
		}
		{	// ocl::Collection::select() ocl|Collection{T}|select(ocl|Collection{T}?T)
			Iteration symbol_277 = PivotFactory.eINSTANCE.createIteration();
			symbol_277.setName("select");
			symbol_277.setType(symbol_110);  // ocl|Collection[ocl|Collection{T}?T]
			Parameter symbol_278 = PivotFactory.eINSTANCE.createParameter();
			symbol_278.setName("i");
			symbol_278.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_277.getOwnedIterators().add(symbol_278);
			symbol_277.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_277);
		}
		{	// ocl::Collection::size() ocl|Collection{T}|size()
			Operation symbol_279 = PivotFactory.eINSTANCE.createOperation();
			symbol_279.setName("size");
			symbol_279.setType(symbol_41);  // Integer
			symbol_279.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_279);
		}
		{	// ocl::Collection::sortedBy() ocl|Collection{T}|sortedBy(ocl|Collection{T}?T)
			Iteration symbol_280 = PivotFactory.eINSTANCE.createIteration();
			symbol_280.setName("sortedBy");
			symbol_280.setType(symbol_149);  // ocl|OrderedCollection[ocl|Collection{T}?T]
			Parameter symbol_281 = PivotFactory.eINSTANCE.createParameter();
			symbol_281.setName("i");
			symbol_281.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_280.getOwnedIterators().add(symbol_281);
			symbol_280.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_280);
		}
		{	// ocl::Collection::sum() ocl|Collection{T}|sum()
			Operation symbol_282 = PivotFactory.eINSTANCE.createOperation();
			symbol_282.setName("sum");
			symbol_282.setType(symbol_24);  // ocl|Collection{T}?T
			symbol_282.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_282);
		}
		symbol_1.getOwnedTypes().add(symbol_21);
		//
		// ocl::Enumeration ocl|Enumeration
		//
		symbol_40.setName("Enumeration");
		symbol_40.getSuperClasses().add(symbol_50);
		{	// ocl::Enumeration::allInstances() ocl|Enumeration|allInstances()
			Operation symbol_283 = PivotFactory.eINSTANCE.createOperation();
			symbol_283.setName("allInstances");
			symbol_283.setType(symbol_176);  // ocl|Set[ocl|Enumeration]
			symbol_283.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
			symbol_40.getOwnedOperations().add(symbol_283);
		}
		symbol_1.getOwnedTypes().add(symbol_40);
		//
		// ocl::Integer Integer
		//
		symbol_41.setName("Integer");
		symbol_41.getSuperClasses().add(symbol_67);
		{	// ocl::Integer::*() Integer|*(Integer)
			Operation symbol_284 = PivotFactory.eINSTANCE.createOperation();
			symbol_284.setName("*");
			symbol_284.setType(symbol_41);  // Integer
			Parameter symbol_285 = PivotFactory.eINSTANCE.createParameter();
			symbol_285.setName("i");
			symbol_285.setType(symbol_41);  // Integer
			symbol_284.getOwnedParameters().add(symbol_285);
			symbol_284.setPrecedence(symbol_5);
			symbol_284.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_284);
		}
		{	// ocl::Integer::+() Integer|+(Integer)
			Operation symbol_286 = PivotFactory.eINSTANCE.createOperation();
			symbol_286.setName("+");
			symbol_286.setType(symbol_41);  // Integer
			Parameter symbol_287 = PivotFactory.eINSTANCE.createParameter();
			symbol_287.setName("i");
			symbol_287.setType(symbol_41);  // Integer
			symbol_286.getOwnedParameters().add(symbol_287);
			symbol_286.setPrecedence(symbol_8);
			symbol_286.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericPlusOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_286);
		}
		{	// ocl::Integer::-() Integer|-()
			Operation symbol_288 = PivotFactory.eINSTANCE.createOperation();
			symbol_288.setName("-");
			symbol_288.setType(symbol_41);  // Integer
			symbol_288.setPrecedence(symbol_2);
			symbol_288.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_288);
		}
		{	// ocl::Integer::-() Integer|-(Integer)
			Operation symbol_289 = PivotFactory.eINSTANCE.createOperation();
			symbol_289.setName("-");
			symbol_289.setType(symbol_41);  // Integer
			Parameter symbol_290 = PivotFactory.eINSTANCE.createParameter();
			symbol_290.setName("i");
			symbol_290.setType(symbol_41);  // Integer
			symbol_289.getOwnedParameters().add(symbol_290);
			symbol_289.setPrecedence(symbol_8);
			symbol_289.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinusOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_289);
		}
		{	// ocl::Integer::/() Integer|/(Integer)
			Operation symbol_291 = PivotFactory.eINSTANCE.createOperation();
			symbol_291.setName("/");
			symbol_291.setType(symbol_67);  // Real
			Parameter symbol_292 = PivotFactory.eINSTANCE.createParameter();
			symbol_292.setName("i");
			symbol_292.setType(symbol_41);  // Integer
			symbol_291.getOwnedParameters().add(symbol_292);
			symbol_291.setPrecedence(symbol_5);
			symbol_291.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_291);
		}
		{	// ocl::Integer::abs() Integer|abs()
			Operation symbol_293 = PivotFactory.eINSTANCE.createOperation();
			symbol_293.setName("abs");
			symbol_293.setType(symbol_41);  // Integer
			symbol_293.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_293);
		}
		{	// ocl::Integer::div() Integer|div(Integer)
			Operation symbol_294 = PivotFactory.eINSTANCE.createOperation();
			symbol_294.setName("div");
			symbol_294.setType(symbol_41);  // Integer
			Parameter symbol_295 = PivotFactory.eINSTANCE.createParameter();
			symbol_295.setName("i");
			symbol_295.setType(symbol_41);  // Integer
			symbol_294.getOwnedParameters().add(symbol_295);
			symbol_294.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_294);
		}
		{	// ocl::Integer::max() Integer|max(Integer)
			Operation symbol_296 = PivotFactory.eINSTANCE.createOperation();
			symbol_296.setName("max");
			symbol_296.setType(symbol_41);  // Integer
			Parameter symbol_297 = PivotFactory.eINSTANCE.createParameter();
			symbol_297.setName("i");
			symbol_297.setType(symbol_41);  // Integer
			symbol_296.getOwnedParameters().add(symbol_297);
			symbol_296.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_296);
		}
		{	// ocl::Integer::min() Integer|min(Integer)
			Operation symbol_298 = PivotFactory.eINSTANCE.createOperation();
			symbol_298.setName("min");
			symbol_298.setType(symbol_41);  // Integer
			Parameter symbol_299 = PivotFactory.eINSTANCE.createParameter();
			symbol_299.setName("i");
			symbol_299.setType(symbol_41);  // Integer
			symbol_298.getOwnedParameters().add(symbol_299);
			symbol_298.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_298);
		}
		{	// ocl::Integer::mod() Integer|mod(Integer)
			Operation symbol_300 = PivotFactory.eINSTANCE.createOperation();
			symbol_300.setName("mod");
			symbol_300.setType(symbol_41);  // Integer
			Parameter symbol_301 = PivotFactory.eINSTANCE.createParameter();
			symbol_301.setName("i");
			symbol_301.setType(symbol_41);  // Integer
			symbol_300.getOwnedParameters().add(symbol_301);
			symbol_300.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_300);
		}
		{	// ocl::Integer::toString() Integer|toString()
			Operation symbol_302 = PivotFactory.eINSTANCE.createOperation();
			symbol_302.setName("toString");
			symbol_302.setType(symbol_85);  // String
			symbol_302.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_302);
		}
		symbol_1.getOwnedTypes().add(symbol_41);
		//
		// ocl::NonOrderedCollection ocl|NonOrderedCollection{T}
		//
		symbol_42.setName("NonOrderedCollection");
		symbol_42.setElementType(symbol_58);
		symbol_45.setName("T");
		symbol_44.setOwnedParameteredElement(symbol_45);
		symbol_43.getOwnedParameters().add(symbol_44);
		
		symbol_42.setOwnedTemplateSignature(symbol_43);
		symbol_42.getSuperClasses().add(symbol_108);
		{	// ocl::NonOrderedCollection::closure() ocl|NonOrderedCollection{T}|closure(ocl|NonOrderedCollection{T}?T)
			Iteration symbol_303 = PivotFactory.eINSTANCE.createIteration();
			symbol_303.setName("closure");
			symbol_303.setType(symbol_171);  // ocl|Set[ocl|NonOrderedCollection{T}?T]
			Parameter symbol_304 = PivotFactory.eINSTANCE.createParameter();
			symbol_304.setName("i");
			symbol_304.setType(symbol_45);  // ocl|NonOrderedCollection{T}?T
			symbol_303.getOwnedIterators().add(symbol_304);
			symbol_303.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_303);
		}
		{	// ocl::NonOrderedCollection::collect() ocl|NonOrderedCollection{T}|collect(ocl|NonOrderedCollection{T}?T)
			Iteration symbol_305 = PivotFactory.eINSTANCE.createIteration();
			symbol_305.setName("collect");
			symbol_305.setType(symbol_98);  // ocl|Bag[ocl|NonOrderedCollection{T}?T]
			Parameter symbol_306 = PivotFactory.eINSTANCE.createParameter();
			symbol_306.setName("i");
			symbol_306.setType(symbol_45);  // ocl|NonOrderedCollection{T}?T
			symbol_305.getOwnedIterators().add(symbol_306);
			symbol_305.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_305);
		}
		{	// ocl::NonOrderedCollection::collectNested() ocl|NonOrderedCollection{T}|collectNested(ocl|NonOrderedCollection{T}?T)
			Iteration symbol_307 = PivotFactory.eINSTANCE.createIteration();
			symbol_307.setName("collectNested");
			symbol_307.setType(symbol_98);  // ocl|Bag[ocl|NonOrderedCollection{T}?T]
			Parameter symbol_308 = PivotFactory.eINSTANCE.createParameter();
			symbol_308.setName("i");
			symbol_308.setType(symbol_45);  // ocl|NonOrderedCollection{T}?T
			symbol_307.getOwnedIterators().add(symbol_308);
			symbol_307.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_307);
		}
		{	// ocl::NonOrderedCollection::intersection() ocl|NonOrderedCollection{T}|intersection(ocl|Bag[ocl|NonOrderedCollection{T}?T])
			Operation symbol_309 = PivotFactory.eINSTANCE.createOperation();
			symbol_309.setName("intersection");
			symbol_309.setType(symbol_98);  // ocl|Bag[ocl|NonOrderedCollection{T}?T]
			Parameter symbol_310 = PivotFactory.eINSTANCE.createParameter();
			symbol_310.setName("bag");
			symbol_310.setType(symbol_98);  // ocl|Bag[ocl|NonOrderedCollection{T}?T]
			symbol_309.getOwnedParameters().add(symbol_310);
			symbol_309.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_309);
		}
		{	// ocl::NonOrderedCollection::intersection() ocl|NonOrderedCollection{T}|intersection(ocl|Set[ocl|NonOrderedCollection{T}?T])
			Operation symbol_311 = PivotFactory.eINSTANCE.createOperation();
			symbol_311.setName("intersection");
			symbol_311.setType(symbol_171);  // ocl|Set[ocl|NonOrderedCollection{T}?T]
			Parameter symbol_312 = PivotFactory.eINSTANCE.createParameter();
			symbol_312.setName("s");
			symbol_312.setType(symbol_171);  // ocl|Set[ocl|NonOrderedCollection{T}?T]
			symbol_311.getOwnedParameters().add(symbol_312);
			symbol_311.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_311);
		}
		{	// ocl::NonOrderedCollection::union() ocl|NonOrderedCollection{T}|union(ocl|Bag[ocl|NonOrderedCollection{T}?T])
			Operation symbol_313 = PivotFactory.eINSTANCE.createOperation();
			symbol_313.setName("union");
			symbol_313.setType(symbol_98);  // ocl|Bag[ocl|NonOrderedCollection{T}?T]
			Parameter symbol_314 = PivotFactory.eINSTANCE.createParameter();
			symbol_314.setName("bag");
			symbol_314.setType(symbol_98);  // ocl|Bag[ocl|NonOrderedCollection{T}?T]
			symbol_313.getOwnedParameters().add(symbol_314);
			symbol_313.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_313);
		}
		{	// ocl::NonOrderedCollection::union() ocl|NonOrderedCollection{T}|union(ocl|Set[ocl|NonOrderedCollection{T}?T])
			Operation symbol_315 = PivotFactory.eINSTANCE.createOperation();
			symbol_315.setName("union");
			symbol_315.setType(symbol_171);  // ocl|Set[ocl|NonOrderedCollection{T}?T]
			Parameter symbol_316 = PivotFactory.eINSTANCE.createParameter();
			symbol_316.setName("s");
			symbol_316.setType(symbol_171);  // ocl|Set[ocl|NonOrderedCollection{T}?T]
			symbol_315.getOwnedParameters().add(symbol_316);
			symbol_315.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_315);
		}
		symbol_1.getOwnedTypes().add(symbol_42);
		//
		// ocl::NonUniqueCollection ocl|NonUniqueCollection{T}
		//
		symbol_46.setName("NonUniqueCollection");
		symbol_46.setElementType(symbol_58);
		symbol_49.setName("T");
		symbol_48.setOwnedParameteredElement(symbol_49);
		symbol_47.getOwnedParameters().add(symbol_48);
		
		symbol_46.setOwnedTemplateSignature(symbol_47);
		symbol_46.getSuperClasses().add(symbol_117);
		{	// ocl::NonUniqueCollection::sortedBy() ocl|NonUniqueCollection{T}|sortedBy(ocl|NonUniqueCollection{T}?T)
			Iteration symbol_317 = PivotFactory.eINSTANCE.createIteration();
			symbol_317.setName("sortedBy");
			symbol_317.setType(symbol_165);  // ocl|Sequence[ocl|NonUniqueCollection{T}?T]
			Parameter symbol_318 = PivotFactory.eINSTANCE.createParameter();
			symbol_318.setName("i");
			symbol_318.setType(symbol_49);  // ocl|NonUniqueCollection{T}?T
			symbol_317.getOwnedIterators().add(symbol_318);
			symbol_317.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_46.getOwnedOperations().add(symbol_317);
		}
		symbol_1.getOwnedTypes().add(symbol_46);
		//
		// ocl::OclAny ocl|OclAny
		//
		symbol_50.setName("OclAny");
		{	// ocl::OclAny::<>() ocl|OclAny|<>(ocl|OclAny)
			Operation symbol_319 = PivotFactory.eINSTANCE.createOperation();
			symbol_319.setName("<>");
			symbol_319.setType(symbol_19);  // Boolean
			Parameter symbol_320 = PivotFactory.eINSTANCE.createParameter();
			symbol_320.setName("object2");
			symbol_320.setType(symbol_50);  // ocl|OclAny
			symbol_319.getOwnedParameters().add(symbol_320);
			symbol_319.setPrecedence(symbol_6);
			symbol_319.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_319);
		}
		{	// ocl::OclAny::=() ocl|OclAny|=(ocl|OclAny)
			Operation symbol_321 = PivotFactory.eINSTANCE.createOperation();
			symbol_321.setName("=");
			symbol_321.setType(symbol_19);  // Boolean
			Parameter symbol_322 = PivotFactory.eINSTANCE.createParameter();
			symbol_322.setName("object2");
			symbol_322.setType(symbol_50);  // ocl|OclAny
			symbol_321.getOwnedParameters().add(symbol_322);
			symbol_321.setPrecedence(symbol_6);
			symbol_321.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_321);
		}
		{	// ocl::OclAny::oclAsSet() ocl|OclAny|oclAsSet()
			Operation symbol_323 = PivotFactory.eINSTANCE.createOperation();
			symbol_323.setName("oclAsSet");
			symbol_323.setType(symbol_177);  // ocl|Set[ocl|OclAny]
			symbol_323.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_323);
		}
		{	// ocl::OclAny::oclAsType() ocl|OclAny|oclAsType{T}(ocl|Classifier)
			Operation symbol_324 = PivotFactory.eINSTANCE.createOperation();
			symbol_53.setName("T");
			symbol_52.setOwnedParameteredElement(symbol_53);
			symbol_51.getOwnedParameters().add(symbol_52);
			
			symbol_324.setOwnedTemplateSignature(symbol_51);
			symbol_324.setName("oclAsType");
			symbol_324.setType(symbol_53);  // ocl|OclAny|oclAsType{T}(ocl|Classifier)?T
			Parameter symbol_325 = PivotFactory.eINSTANCE.createParameter();
			symbol_325.setName("type");
			symbol_325.setType(symbol_20);  // ocl|Classifier
			symbol_324.getOwnedParameters().add(symbol_325);
			symbol_324.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_324);
		}
		{	// ocl::OclAny::oclIsInState() ocl|OclAny|oclIsInState(ocl|OclState)
			Operation symbol_326 = PivotFactory.eINSTANCE.createOperation();
			symbol_326.setName("oclIsInState");
			symbol_326.setType(symbol_19);  // Boolean
			Parameter symbol_327 = PivotFactory.eINSTANCE.createParameter();
			symbol_327.setName("statespec");
			symbol_327.setType(symbol_56);  // ocl|OclState
			symbol_326.getOwnedParameters().add(symbol_327);
			symbol_326.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_326);
		}
		{	// ocl::OclAny::oclIsInvalid() ocl|OclAny|oclIsInvalid()
			Operation symbol_328 = PivotFactory.eINSTANCE.createOperation();
			symbol_328.setName("oclIsInvalid");
			symbol_328.setType(symbol_19);  // Boolean
			symbol_328.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_328);
		}
		{	// ocl::OclAny::oclIsKindOf() ocl|OclAny|oclIsKindOf(ocl|Classifier)
			Operation symbol_329 = PivotFactory.eINSTANCE.createOperation();
			symbol_329.setName("oclIsKindOf");
			symbol_329.setType(symbol_19);  // Boolean
			Parameter symbol_330 = PivotFactory.eINSTANCE.createParameter();
			symbol_330.setName("type");
			symbol_330.setType(symbol_20);  // ocl|Classifier
			symbol_329.getOwnedParameters().add(symbol_330);
			symbol_329.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_329);
		}
		{	// ocl::OclAny::oclIsNew() ocl|OclAny|oclIsNew()
			Operation symbol_331 = PivotFactory.eINSTANCE.createOperation();
			symbol_331.setName("oclIsNew");
			symbol_331.setType(symbol_19);  // Boolean
			symbol_331.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_331);
		}
		{	// ocl::OclAny::oclIsTypeOf() ocl|OclAny|oclIsTypeOf(ocl|Classifier)
			Operation symbol_332 = PivotFactory.eINSTANCE.createOperation();
			symbol_332.setName("oclIsTypeOf");
			symbol_332.setType(symbol_19);  // Boolean
			Parameter symbol_333 = PivotFactory.eINSTANCE.createParameter();
			symbol_333.setName("type");
			symbol_333.setType(symbol_20);  // ocl|Classifier
			symbol_332.getOwnedParameters().add(symbol_333);
			symbol_332.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_332);
		}
		{	// ocl::OclAny::oclIsUndefined() ocl|OclAny|oclIsUndefined()
			Operation symbol_334 = PivotFactory.eINSTANCE.createOperation();
			symbol_334.setName("oclIsUndefined");
			symbol_334.setType(symbol_19);  // Boolean
			symbol_334.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_334);
		}
		{	// ocl::OclAny::oclType() ocl|OclAny|oclType()
			Operation symbol_335 = PivotFactory.eINSTANCE.createOperation();
			symbol_335.setName("oclType");
			symbol_335.setType(symbol_20);  // ocl|Classifier
			symbol_335.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_335);
		}
		symbol_1.getOwnedTypes().add(symbol_50);
		//
		// ocl::OclInvalid ocl|OclInvalid
		//
		symbol_54.setName("OclInvalid");
		symbol_54.getSuperClasses().add(symbol_58);
		{	// ocl::OclInvalid::<>() ocl|OclInvalid|<>(ocl|OclAny)
			Operation symbol_336 = PivotFactory.eINSTANCE.createOperation();
			symbol_336.setName("<>");
			symbol_336.setType(symbol_19);  // Boolean
			Parameter symbol_337 = PivotFactory.eINSTANCE.createParameter();
			symbol_337.setName("object2");
			symbol_337.setType(symbol_50);  // ocl|OclAny
			symbol_336.getOwnedParameters().add(symbol_337);
			symbol_336.setPrecedence(symbol_6);
			symbol_336.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_336);
		}
		{	// ocl::OclInvalid::=() ocl|OclInvalid|=(ocl|OclAny)
			Operation symbol_338 = PivotFactory.eINSTANCE.createOperation();
			symbol_338.setName("=");
			symbol_338.setType(symbol_19);  // Boolean
			Parameter symbol_339 = PivotFactory.eINSTANCE.createParameter();
			symbol_339.setName("object2");
			symbol_339.setType(symbol_50);  // ocl|OclAny
			symbol_338.getOwnedParameters().add(symbol_339);
			symbol_338.setPrecedence(symbol_6);
			symbol_338.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_338);
		}
		{	// ocl::OclInvalid::allInstances() ocl|OclInvalid|allInstances()
			Operation symbol_340 = PivotFactory.eINSTANCE.createOperation();
			symbol_340.setName("allInstances");
			symbol_340.setType(symbol_178);  // ocl|Set[ocl|OclInvalid]
			symbol_340.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_340);
		}
		{	// ocl::OclInvalid::toString() ocl|OclInvalid|toString()
			Operation symbol_341 = PivotFactory.eINSTANCE.createOperation();
			symbol_341.setName("toString");
			symbol_341.setType(symbol_85);  // String
			symbol_341.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_341);
		}
		symbol_1.getOwnedTypes().add(symbol_54);
		//
		// ocl::OclMessage ocl|OclMessage
		//
		symbol_55.setName("OclMessage");
		symbol_55.getSuperClasses().add(symbol_50);
		{	// ocl::OclMessage::hasReturned() ocl|OclMessage|hasReturned()
			Operation symbol_342 = PivotFactory.eINSTANCE.createOperation();
			symbol_342.setName("hasReturned");
			symbol_342.setType(symbol_19);  // Boolean
			symbol_342.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_55.getOwnedOperations().add(symbol_342);
		}
		{	// ocl::OclMessage::isOperationCall() ocl|OclMessage|isOperationCall()
			Operation symbol_343 = PivotFactory.eINSTANCE.createOperation();
			symbol_343.setName("isOperationCall");
			symbol_343.setType(symbol_19);  // Boolean
			symbol_343.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_55.getOwnedOperations().add(symbol_343);
		}
		{	// ocl::OclMessage::isSignalSent() ocl|OclMessage|isSignalSent()
			Operation symbol_344 = PivotFactory.eINSTANCE.createOperation();
			symbol_344.setName("isSignalSent");
			symbol_344.setType(symbol_19);  // Boolean
			symbol_344.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_55.getOwnedOperations().add(symbol_344);
		}
		{	// ocl::OclMessage::result() ocl|OclMessage|result()
			Operation symbol_345 = PivotFactory.eINSTANCE.createOperation();
			symbol_345.setName("result");
			symbol_345.setType(symbol_50);  // ocl|OclAny
			symbol_345.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_55.getOwnedOperations().add(symbol_345);
		}
		symbol_1.getOwnedTypes().add(symbol_55);
		//
		// ocl::OclState ocl|OclState
		//
		symbol_56.setName("OclState");
		symbol_56.getSuperClasses().add(symbol_50);
		symbol_1.getOwnedTypes().add(symbol_56);
		//
		// ocl::OclTuple ocl|OclTuple
		//
		symbol_57.setName("OclTuple");
		symbol_57.getSuperClasses().add(symbol_50);
		{	// ocl::OclTuple::<>() ocl|OclTuple|<>(ocl|OclAny)
			Operation symbol_346 = PivotFactory.eINSTANCE.createOperation();
			symbol_346.setName("<>");
			symbol_346.setType(symbol_19);  // Boolean
			Parameter symbol_347 = PivotFactory.eINSTANCE.createParameter();
			symbol_347.setName("object2");
			symbol_347.setType(symbol_50);  // ocl|OclAny
			symbol_346.getOwnedParameters().add(symbol_347);
			symbol_346.setPrecedence(symbol_6);
			symbol_346.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_57.getOwnedOperations().add(symbol_346);
		}
		{	// ocl::OclTuple::=() ocl|OclTuple|=(ocl|OclAny)
			Operation symbol_348 = PivotFactory.eINSTANCE.createOperation();
			symbol_348.setName("=");
			symbol_348.setType(symbol_19);  // Boolean
			Parameter symbol_349 = PivotFactory.eINSTANCE.createParameter();
			symbol_349.setName("object2");
			symbol_349.setType(symbol_50);  // ocl|OclAny
			symbol_348.getOwnedParameters().add(symbol_349);
			symbol_348.setPrecedence(symbol_6);
			symbol_348.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_57.getOwnedOperations().add(symbol_348);
		}
		symbol_1.getOwnedTypes().add(symbol_57);
		//
		// ocl::OclVoid ocl|OclVoid
		//
		symbol_58.setName("OclVoid");
		symbol_58.getSuperClasses().add(symbol_50);
		{	// ocl::OclVoid::<>() ocl|OclVoid|<>(ocl|OclAny)
			Operation symbol_350 = PivotFactory.eINSTANCE.createOperation();
			symbol_350.setName("<>");
			symbol_350.setType(symbol_19);  // Boolean
			Parameter symbol_351 = PivotFactory.eINSTANCE.createParameter();
			symbol_351.setName("object2");
			symbol_351.setType(symbol_50);  // ocl|OclAny
			symbol_350.getOwnedParameters().add(symbol_351);
			symbol_350.setPrecedence(symbol_6);
			symbol_350.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_350);
		}
		{	// ocl::OclVoid::=() ocl|OclVoid|=(ocl|OclAny)
			Operation symbol_352 = PivotFactory.eINSTANCE.createOperation();
			symbol_352.setName("=");
			symbol_352.setType(symbol_19);  // Boolean
			Parameter symbol_353 = PivotFactory.eINSTANCE.createParameter();
			symbol_353.setName("object2");
			symbol_353.setType(symbol_50);  // ocl|OclAny
			symbol_352.getOwnedParameters().add(symbol_353);
			symbol_352.setPrecedence(symbol_6);
			symbol_352.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_352);
		}
		{	// ocl::OclVoid::allInstances() ocl|OclVoid|allInstances()
			Operation symbol_354 = PivotFactory.eINSTANCE.createOperation();
			symbol_354.setName("allInstances");
			symbol_354.setType(symbol_173);  // ocl|Set[ocl|OclVoid]
			symbol_354.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_354);
		}
		{	// ocl::OclVoid::and() ocl|OclVoid|and(Boolean)
			Operation symbol_355 = PivotFactory.eINSTANCE.createOperation();
			symbol_355.setName("and");
			symbol_355.setType(symbol_19);  // Boolean
			Parameter symbol_356 = PivotFactory.eINSTANCE.createParameter();
			symbol_356.setName("b");
			symbol_356.setType(symbol_19);  // Boolean
			symbol_355.getOwnedParameters().add(symbol_356);
			symbol_355.setPrecedence(symbol_10);
			symbol_355.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_355);
		}
		{	// ocl::OclVoid::implies() ocl|OclVoid|implies(Boolean)
			Operation symbol_357 = PivotFactory.eINSTANCE.createOperation();
			symbol_357.setName("implies");
			symbol_357.setType(symbol_19);  // Boolean
			Parameter symbol_358 = PivotFactory.eINSTANCE.createParameter();
			symbol_358.setName("b");
			symbol_358.setType(symbol_19);  // Boolean
			symbol_357.getOwnedParameters().add(symbol_358);
			symbol_357.setPrecedence(symbol_3);
			symbol_357.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_357);
		}
		{	// ocl::OclVoid::or() ocl|OclVoid|or(Boolean)
			Operation symbol_359 = PivotFactory.eINSTANCE.createOperation();
			symbol_359.setName("or");
			symbol_359.setType(symbol_19);  // Boolean
			Parameter symbol_360 = PivotFactory.eINSTANCE.createParameter();
			symbol_360.setName("b");
			symbol_360.setType(symbol_19);  // Boolean
			symbol_359.getOwnedParameters().add(symbol_360);
			symbol_359.setPrecedence(symbol_4);
			symbol_359.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_359);
		}
		{	// ocl::OclVoid::toString() ocl|OclVoid|toString()
			Operation symbol_361 = PivotFactory.eINSTANCE.createOperation();
			symbol_361.setName("toString");
			symbol_361.setType(symbol_85);  // String
			symbol_361.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_361);
		}
		symbol_1.getOwnedTypes().add(symbol_58);
		//
		// ocl::OrderedCollection ocl|OrderedCollection{T}
		//
		symbol_59.setName("OrderedCollection");
		symbol_59.setElementType(symbol_58);
		symbol_62.setName("T");
		symbol_61.setOwnedParameteredElement(symbol_62);
		symbol_60.getOwnedParameters().add(symbol_61);
		
		symbol_59.setOwnedTemplateSignature(symbol_60);
		symbol_59.getSuperClasses().add(symbol_112);
		{	// ocl::OrderedCollection::at() ocl|OrderedCollection{T}|at(Integer)
			Operation symbol_362 = PivotFactory.eINSTANCE.createOperation();
			symbol_362.setName("at");
			symbol_362.setType(symbol_62);  // ocl|OrderedCollection{T}?T
			Parameter symbol_363 = PivotFactory.eINSTANCE.createParameter();
			symbol_363.setName("index");
			symbol_363.setType(symbol_41);  // Integer
			symbol_362.getOwnedParameters().add(symbol_363);
			symbol_362.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_362);
		}
		{	// ocl::OrderedCollection::closure() ocl|OrderedCollection{T}|closure(ocl|OrderedCollection{T}?T)
			Iteration symbol_364 = PivotFactory.eINSTANCE.createIteration();
			symbol_364.setName("closure");
			symbol_364.setType(symbol_159);  // ocl|OrderedSet[ocl|OrderedCollection{T}?T]
			Parameter symbol_365 = PivotFactory.eINSTANCE.createParameter();
			symbol_365.setName("i");
			symbol_365.setType(symbol_62);  // ocl|OrderedCollection{T}?T
			symbol_364.getOwnedIterators().add(symbol_365);
			symbol_364.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_364);
		}
		{	// ocl::OrderedCollection::collect() ocl|OrderedCollection{T}|collect(ocl|OrderedCollection{T}?T)
			Iteration symbol_366 = PivotFactory.eINSTANCE.createIteration();
			symbol_366.setName("collect");
			symbol_366.setType(symbol_162);  // ocl|Sequence[ocl|OrderedCollection{T}?T]
			Parameter symbol_367 = PivotFactory.eINSTANCE.createParameter();
			symbol_367.setName("i");
			symbol_367.setType(symbol_62);  // ocl|OrderedCollection{T}?T
			symbol_366.getOwnedIterators().add(symbol_367);
			symbol_366.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_366);
		}
		{	// ocl::OrderedCollection::collectNested() ocl|OrderedCollection{T}|collectNested(ocl|OrderedCollection{T}?T)
			Iteration symbol_368 = PivotFactory.eINSTANCE.createIteration();
			symbol_368.setName("collectNested");
			symbol_368.setType(symbol_162);  // ocl|Sequence[ocl|OrderedCollection{T}?T]
			Parameter symbol_369 = PivotFactory.eINSTANCE.createParameter();
			symbol_369.setName("i");
			symbol_369.setType(symbol_62);  // ocl|OrderedCollection{T}?T
			symbol_368.getOwnedIterators().add(symbol_369);
			symbol_368.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_368);
		}
		{	// ocl::OrderedCollection::first() ocl|OrderedCollection{T}|first()
			Operation symbol_370 = PivotFactory.eINSTANCE.createOperation();
			symbol_370.setName("first");
			symbol_370.setType(symbol_62);  // ocl|OrderedCollection{T}?T
			symbol_370.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_370);
		}
		{	// ocl::OrderedCollection::indexOf() ocl|OrderedCollection{T}|indexOf(ocl|OclAny)
			Operation symbol_371 = PivotFactory.eINSTANCE.createOperation();
			symbol_371.setName("indexOf");
			symbol_371.setType(symbol_41);  // Integer
			Parameter symbol_372 = PivotFactory.eINSTANCE.createParameter();
			symbol_372.setName("obj");
			symbol_372.setType(symbol_50);  // ocl|OclAny
			symbol_371.getOwnedParameters().add(symbol_372);
			symbol_371.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_371);
		}
		{	// ocl::OrderedCollection::last() ocl|OrderedCollection{T}|last()
			Operation symbol_373 = PivotFactory.eINSTANCE.createOperation();
			symbol_373.setName("last");
			symbol_373.setType(symbol_62);  // ocl|OrderedCollection{T}?T
			symbol_373.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_373);
		}
		{	// ocl::OrderedCollection::reverse() ocl|OrderedCollection{T}|reverse()
			Operation symbol_374 = PivotFactory.eINSTANCE.createOperation();
			symbol_374.setName("reverse");
			symbol_374.setType(symbol_156);  // ocl|OrderedCollection[ocl|OrderedCollection{T}?T]
			symbol_374.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_374);
		}
		symbol_1.getOwnedTypes().add(symbol_59);
		//
		// ocl::OrderedSet ocl|OrderedSet{T}
		//
		symbol_63.setName("OrderedSet");
		symbol_63.setElementType(symbol_58);
		symbol_66.setName("T");
		symbol_65.setOwnedParameteredElement(symbol_66);
		symbol_64.getOwnedParameters().add(symbol_65);
		
		symbol_63.setOwnedTemplateSignature(symbol_64);
		symbol_63.getSuperClasses().add(symbol_150);
		symbol_63.getSuperClasses().add(symbol_190);
		{	// ocl::OrderedSet::-() ocl|OrderedSet{T}|-(ocl|Set[ocl|OrderedSet{T}?T])
			Operation symbol_375 = PivotFactory.eINSTANCE.createOperation();
			symbol_375.setName("-");
			symbol_375.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			Parameter symbol_376 = PivotFactory.eINSTANCE.createParameter();
			symbol_376.setName("s");
			symbol_376.setType(symbol_167);  // ocl|Set[ocl|OrderedSet{T}?T]
			symbol_375.getOwnedParameters().add(symbol_376);
			symbol_375.setPrecedence(symbol_8);
			symbol_375.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_375);
		}
		{	// ocl::OrderedSet::<>() ocl|OrderedSet{T}|<>(ocl|OclAny)
			Operation symbol_377 = PivotFactory.eINSTANCE.createOperation();
			symbol_377.setName("<>");
			symbol_377.setType(symbol_19);  // Boolean
			Parameter symbol_378 = PivotFactory.eINSTANCE.createParameter();
			symbol_378.setName("object2");
			symbol_378.setType(symbol_50);  // ocl|OclAny
			symbol_377.getOwnedParameters().add(symbol_378);
			symbol_377.setPrecedence(symbol_6);
			symbol_377.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_377);
		}
		{	// ocl::OrderedSet::=() ocl|OrderedSet{T}|=(ocl|OclAny)
			Operation symbol_379 = PivotFactory.eINSTANCE.createOperation();
			symbol_379.setName("=");
			symbol_379.setType(symbol_19);  // Boolean
			Parameter symbol_380 = PivotFactory.eINSTANCE.createParameter();
			symbol_380.setName("object2");
			symbol_380.setType(symbol_50);  // ocl|OclAny
			symbol_379.getOwnedParameters().add(symbol_380);
			symbol_379.setPrecedence(symbol_6);
			symbol_379.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_379);
		}
		{	// ocl::OrderedSet::append() ocl|OrderedSet{T}|append(ocl|OrderedSet{T}?T)
			Operation symbol_381 = PivotFactory.eINSTANCE.createOperation();
			symbol_381.setName("append");
			symbol_381.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			Parameter symbol_382 = PivotFactory.eINSTANCE.createParameter();
			symbol_382.setName("object");
			symbol_382.setType(symbol_66);  // ocl|OrderedSet{T}?T
			symbol_381.getOwnedParameters().add(symbol_382);
			symbol_381.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_381);
		}
		{	// ocl::OrderedSet::excluding() ocl|OrderedSet{T}|excluding(ocl|OclAny)
			Operation symbol_383 = PivotFactory.eINSTANCE.createOperation();
			symbol_383.setName("excluding");
			symbol_383.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			Parameter symbol_384 = PivotFactory.eINSTANCE.createParameter();
			symbol_384.setName("object");
			symbol_384.setType(symbol_50);  // ocl|OclAny
			symbol_383.getOwnedParameters().add(symbol_384);
			symbol_383.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_383);
		}
		{	// ocl::OrderedSet::including() ocl|OrderedSet{T}|including(ocl|OrderedSet{T}?T)
			Operation symbol_385 = PivotFactory.eINSTANCE.createOperation();
			symbol_385.setName("including");
			symbol_385.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			Parameter symbol_386 = PivotFactory.eINSTANCE.createParameter();
			symbol_386.setName("object");
			symbol_386.setType(symbol_66);  // ocl|OrderedSet{T}?T
			symbol_385.getOwnedParameters().add(symbol_386);
			symbol_385.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_385);
		}
		{	// ocl::OrderedSet::insertAt() ocl|OrderedSet{T}|insertAt(Integer,ocl|OrderedSet{T}?T)
			Operation symbol_387 = PivotFactory.eINSTANCE.createOperation();
			symbol_387.setName("insertAt");
			symbol_387.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			Parameter symbol_388 = PivotFactory.eINSTANCE.createParameter();
			symbol_388.setName("index");
			symbol_388.setType(symbol_41);  // Integer
			symbol_387.getOwnedParameters().add(symbol_388);
			Parameter symbol_389 = PivotFactory.eINSTANCE.createParameter();
			symbol_389.setName("object");
			symbol_389.setType(symbol_66);  // ocl|OrderedSet{T}?T
			symbol_387.getOwnedParameters().add(symbol_389);
			symbol_387.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_387);
		}
		{	// ocl::OrderedSet::intersection() ocl|OrderedSet{T}|intersection(ocl|Set[ocl|OrderedSet{T}?T])
			Operation symbol_390 = PivotFactory.eINSTANCE.createOperation();
			symbol_390.setName("intersection");
			symbol_390.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			Parameter symbol_391 = PivotFactory.eINSTANCE.createParameter();
			symbol_391.setName("o");
			symbol_391.setType(symbol_167);  // ocl|Set[ocl|OrderedSet{T}?T]
			symbol_390.getOwnedParameters().add(symbol_391);
			symbol_390.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_390);
		}
		{	// ocl::OrderedSet::prepend() ocl|OrderedSet{T}|prepend(ocl|OrderedSet{T}?T)
			Operation symbol_392 = PivotFactory.eINSTANCE.createOperation();
			symbol_392.setName("prepend");
			symbol_392.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			Parameter symbol_393 = PivotFactory.eINSTANCE.createParameter();
			symbol_393.setName("object");
			symbol_393.setType(symbol_66);  // ocl|OrderedSet{T}?T
			symbol_392.getOwnedParameters().add(symbol_393);
			symbol_392.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_392);
		}
		{	// ocl::OrderedSet::reject() ocl|OrderedSet{T}|reject(ocl|OrderedSet{T}?T)
			Iteration symbol_394 = PivotFactory.eINSTANCE.createIteration();
			symbol_394.setName("reject");
			symbol_394.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			Parameter symbol_395 = PivotFactory.eINSTANCE.createParameter();
			symbol_395.setName("i");
			symbol_395.setType(symbol_66);  // ocl|OrderedSet{T}?T
			symbol_394.getOwnedIterators().add(symbol_395);
			symbol_394.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_394);
		}
		{	// ocl::OrderedSet::reverse() ocl|OrderedSet{T}|reverse()
			Operation symbol_396 = PivotFactory.eINSTANCE.createOperation();
			symbol_396.setName("reverse");
			symbol_396.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			symbol_396.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_396);
		}
		{	// ocl::OrderedSet::select() ocl|OrderedSet{T}|select(ocl|OrderedSet{T}?T)
			Iteration symbol_397 = PivotFactory.eINSTANCE.createIteration();
			symbol_397.setName("select");
			symbol_397.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			Parameter symbol_398 = PivotFactory.eINSTANCE.createParameter();
			symbol_398.setName("i");
			symbol_398.setType(symbol_66);  // ocl|OrderedSet{T}?T
			symbol_397.getOwnedIterators().add(symbol_398);
			symbol_397.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_397);
		}
		{	// ocl::OrderedSet::subOrderedSet() ocl|OrderedSet{T}|subOrderedSet(Integer,Integer)
			Operation symbol_399 = PivotFactory.eINSTANCE.createOperation();
			symbol_399.setName("subOrderedSet");
			symbol_399.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			Parameter symbol_400 = PivotFactory.eINSTANCE.createParameter();
			symbol_400.setName("lower");
			symbol_400.setType(symbol_41);  // Integer
			symbol_399.getOwnedParameters().add(symbol_400);
			Parameter symbol_401 = PivotFactory.eINSTANCE.createParameter();
			symbol_401.setName("upper");
			symbol_401.setType(symbol_41);  // Integer
			symbol_399.getOwnedParameters().add(symbol_401);
			symbol_399.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_399);
		}
		{	// ocl::OrderedSet::symmetricDifference() ocl|OrderedSet{T}|symmetricDifference(ocl|Set[ocl|OrderedSet{T}?T])
			Operation symbol_402 = PivotFactory.eINSTANCE.createOperation();
			symbol_402.setName("symmetricDifference");
			symbol_402.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			Parameter symbol_403 = PivotFactory.eINSTANCE.createParameter();
			symbol_403.setName("s");
			symbol_403.setType(symbol_167);  // ocl|Set[ocl|OrderedSet{T}?T]
			symbol_402.getOwnedParameters().add(symbol_403);
			symbol_402.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_402);
		}
		{	// ocl::OrderedSet::union() ocl|OrderedSet{T}|union(ocl|OrderedSet[ocl|OrderedSet{T}?T])
			Operation symbol_404 = PivotFactory.eINSTANCE.createOperation();
			symbol_404.setName("union");
			symbol_404.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			Parameter symbol_405 = PivotFactory.eINSTANCE.createParameter();
			symbol_405.setName("o");
			symbol_405.setType(symbol_157);  // ocl|OrderedSet[ocl|OrderedSet{T}?T]
			symbol_404.getOwnedParameters().add(symbol_405);
			symbol_404.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_404);
		}
		{	// ocl::OrderedSet::union() ocl|OrderedSet{T}|union(ocl|Set[ocl|OrderedSet{T}?T])
			Operation symbol_406 = PivotFactory.eINSTANCE.createOperation();
			symbol_406.setName("union");
			symbol_406.setType(symbol_167);  // ocl|Set[ocl|OrderedSet{T}?T]
			Parameter symbol_407 = PivotFactory.eINSTANCE.createParameter();
			symbol_407.setName("s");
			symbol_407.setType(symbol_167);  // ocl|Set[ocl|OrderedSet{T}?T]
			symbol_406.getOwnedParameters().add(symbol_407);
			symbol_406.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_406);
		}
		symbol_1.getOwnedTypes().add(symbol_63);
		//
		// ocl::Real Real
		//
		symbol_67.setName("Real");
		symbol_67.getSuperClasses().add(symbol_50);
		{	// ocl::Real::*() Real|*(Real)
			Operation symbol_408 = PivotFactory.eINSTANCE.createOperation();
			symbol_408.setName("*");
			symbol_408.setType(symbol_67);  // Real
			Parameter symbol_409 = PivotFactory.eINSTANCE.createParameter();
			symbol_409.setName("r");
			symbol_409.setType(symbol_67);  // Real
			symbol_408.getOwnedParameters().add(symbol_409);
			symbol_408.setPrecedence(symbol_5);
			symbol_408.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_408);
		}
		{	// ocl::Real::+() Real|+(Real)
			Operation symbol_410 = PivotFactory.eINSTANCE.createOperation();
			symbol_410.setName("+");
			symbol_410.setType(symbol_67);  // Real
			Parameter symbol_411 = PivotFactory.eINSTANCE.createParameter();
			symbol_411.setName("r");
			symbol_411.setType(symbol_67);  // Real
			symbol_410.getOwnedParameters().add(symbol_411);
			symbol_410.setPrecedence(symbol_8);
			symbol_410.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericPlusOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_410);
		}
		{	// ocl::Real::-() Real|-(Real)
			Operation symbol_412 = PivotFactory.eINSTANCE.createOperation();
			symbol_412.setName("-");
			symbol_412.setType(symbol_67);  // Real
			Parameter symbol_413 = PivotFactory.eINSTANCE.createParameter();
			symbol_413.setName("r");
			symbol_413.setType(symbol_67);  // Real
			symbol_412.getOwnedParameters().add(symbol_413);
			symbol_412.setPrecedence(symbol_8);
			symbol_412.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinusOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_412);
		}
		{	// ocl::Real::-() Real|-()
			Operation symbol_414 = PivotFactory.eINSTANCE.createOperation();
			symbol_414.setName("-");
			symbol_414.setType(symbol_67);  // Real
			symbol_414.setPrecedence(symbol_2);
			symbol_414.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_414);
		}
		{	// ocl::Real::/() Real|/(Real)
			Operation symbol_415 = PivotFactory.eINSTANCE.createOperation();
			symbol_415.setName("/");
			symbol_415.setType(symbol_67);  // Real
			Parameter symbol_416 = PivotFactory.eINSTANCE.createParameter();
			symbol_416.setName("r");
			symbol_416.setType(symbol_67);  // Real
			symbol_415.getOwnedParameters().add(symbol_416);
			symbol_415.setPrecedence(symbol_5);
			symbol_415.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_415);
		}
		{	// ocl::Real::<() Real|<(Real)
			Operation symbol_417 = PivotFactory.eINSTANCE.createOperation();
			symbol_417.setName("<");
			symbol_417.setType(symbol_19);  // Boolean
			Parameter symbol_418 = PivotFactory.eINSTANCE.createParameter();
			symbol_418.setName("r");
			symbol_418.setType(symbol_67);  // Real
			symbol_417.getOwnedParameters().add(symbol_418);
			symbol_417.setPrecedence(symbol_7);
			symbol_417.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_417);
		}
		{	// ocl::Real::<=() Real|<=(Real)
			Operation symbol_419 = PivotFactory.eINSTANCE.createOperation();
			symbol_419.setName("<=");
			symbol_419.setType(symbol_19);  // Boolean
			Parameter symbol_420 = PivotFactory.eINSTANCE.createParameter();
			symbol_420.setName("r");
			symbol_420.setType(symbol_67);  // Real
			symbol_419.getOwnedParameters().add(symbol_420);
			symbol_419.setPrecedence(symbol_7);
			symbol_419.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_419);
		}
		{	// ocl::Real::<>() Real|<>(ocl|OclAny)
			Operation symbol_421 = PivotFactory.eINSTANCE.createOperation();
			symbol_421.setName("<>");
			symbol_421.setType(symbol_19);  // Boolean
			Parameter symbol_422 = PivotFactory.eINSTANCE.createParameter();
			symbol_422.setName("object2");
			symbol_422.setType(symbol_50);  // ocl|OclAny
			symbol_421.getOwnedParameters().add(symbol_422);
			symbol_421.setPrecedence(symbol_6);
			symbol_421.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_421);
		}
		{	// ocl::Real::=() Real|=(ocl|OclAny)
			Operation symbol_423 = PivotFactory.eINSTANCE.createOperation();
			symbol_423.setName("=");
			symbol_423.setType(symbol_19);  // Boolean
			Parameter symbol_424 = PivotFactory.eINSTANCE.createParameter();
			symbol_424.setName("object2");
			symbol_424.setType(symbol_50);  // ocl|OclAny
			symbol_423.getOwnedParameters().add(symbol_424);
			symbol_423.setPrecedence(symbol_6);
			symbol_423.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_423);
		}
		{	// ocl::Real::>() Real|>(Real)
			Operation symbol_425 = PivotFactory.eINSTANCE.createOperation();
			symbol_425.setName(">");
			symbol_425.setType(symbol_19);  // Boolean
			Parameter symbol_426 = PivotFactory.eINSTANCE.createParameter();
			symbol_426.setName("r");
			symbol_426.setType(symbol_67);  // Real
			symbol_425.getOwnedParameters().add(symbol_426);
			symbol_425.setPrecedence(symbol_7);
			symbol_425.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_425);
		}
		{	// ocl::Real::>=() Real|>=(Real)
			Operation symbol_427 = PivotFactory.eINSTANCE.createOperation();
			symbol_427.setName(">=");
			symbol_427.setType(symbol_19);  // Boolean
			Parameter symbol_428 = PivotFactory.eINSTANCE.createParameter();
			symbol_428.setName("r");
			symbol_428.setType(symbol_67);  // Real
			symbol_427.getOwnedParameters().add(symbol_428);
			symbol_427.setPrecedence(symbol_7);
			symbol_427.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_427);
		}
		{	// ocl::Real::abs() Real|abs()
			Operation symbol_429 = PivotFactory.eINSTANCE.createOperation();
			symbol_429.setName("abs");
			symbol_429.setType(symbol_67);  // Real
			symbol_429.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_429);
		}
		{	// ocl::Real::floor() Real|floor()
			Operation symbol_430 = PivotFactory.eINSTANCE.createOperation();
			symbol_430.setName("floor");
			symbol_430.setType(symbol_41);  // Integer
			symbol_430.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_430);
		}
		{	// ocl::Real::max() Real|max(Real)
			Operation symbol_431 = PivotFactory.eINSTANCE.createOperation();
			symbol_431.setName("max");
			symbol_431.setType(symbol_67);  // Real
			Parameter symbol_432 = PivotFactory.eINSTANCE.createParameter();
			symbol_432.setName("r");
			symbol_432.setType(symbol_67);  // Real
			symbol_431.getOwnedParameters().add(symbol_432);
			symbol_431.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_431);
		}
		{	// ocl::Real::min() Real|min(Real)
			Operation symbol_433 = PivotFactory.eINSTANCE.createOperation();
			symbol_433.setName("min");
			symbol_433.setType(symbol_67);  // Real
			Parameter symbol_434 = PivotFactory.eINSTANCE.createParameter();
			symbol_434.setName("r");
			symbol_434.setType(symbol_67);  // Real
			symbol_433.getOwnedParameters().add(symbol_434);
			symbol_433.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_433);
		}
		{	// ocl::Real::oclAsType() Real|oclAsType{T}(ocl|Classifier)
			Operation symbol_435 = PivotFactory.eINSTANCE.createOperation();
			symbol_70.setName("T");
			symbol_69.setOwnedParameteredElement(symbol_70);
			symbol_68.getOwnedParameters().add(symbol_69);
			
			symbol_435.setOwnedTemplateSignature(symbol_68);
			symbol_435.setName("oclAsType");
			symbol_435.setType(symbol_70);  // Real|oclAsType{T}(ocl|Classifier)?T
			Parameter symbol_436 = PivotFactory.eINSTANCE.createParameter();
			symbol_436.setName("type");
			symbol_436.setType(symbol_20);  // ocl|Classifier
			symbol_435.getOwnedParameters().add(symbol_436);
			symbol_435.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericOclAsTypeOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_435);
		}
		{	// ocl::Real::round() Real|round()
			Operation symbol_437 = PivotFactory.eINSTANCE.createOperation();
			symbol_437.setName("round");
			symbol_437.setType(symbol_41);  // Integer
			symbol_437.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_437);
		}
		{	// ocl::Real::toString() Real|toString()
			Operation symbol_438 = PivotFactory.eINSTANCE.createOperation();
			symbol_438.setName("toString");
			symbol_438.setType(symbol_85);  // String
			symbol_438.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_438);
		}
		symbol_1.getOwnedTypes().add(symbol_67);
		//
		// ocl::Sequence ocl|Sequence{T}
		//
		symbol_71.setName("Sequence");
		symbol_71.setElementType(symbol_58);
		symbol_74.setName("T");
		symbol_73.setOwnedParameteredElement(symbol_74);
		symbol_72.getOwnedParameters().add(symbol_73);
		
		symbol_71.setOwnedTemplateSignature(symbol_72);
		symbol_71.getSuperClasses().add(symbol_142);
		symbol_71.getSuperClasses().add(symbol_154);
		{	// ocl::Sequence::<>() ocl|Sequence{T}|<>(ocl|OclAny)
			Operation symbol_439 = PivotFactory.eINSTANCE.createOperation();
			symbol_439.setName("<>");
			symbol_439.setType(symbol_19);  // Boolean
			Parameter symbol_440 = PivotFactory.eINSTANCE.createParameter();
			symbol_440.setName("object2");
			symbol_440.setType(symbol_50);  // ocl|OclAny
			symbol_439.getOwnedParameters().add(symbol_440);
			symbol_439.setPrecedence(symbol_6);
			symbol_439.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_439);
		}
		{	// ocl::Sequence::=() ocl|Sequence{T}|=(ocl|OclAny)
			Operation symbol_441 = PivotFactory.eINSTANCE.createOperation();
			symbol_441.setName("=");
			symbol_441.setType(symbol_19);  // Boolean
			Parameter symbol_442 = PivotFactory.eINSTANCE.createParameter();
			symbol_442.setName("object2");
			symbol_442.setType(symbol_50);  // ocl|OclAny
			symbol_441.getOwnedParameters().add(symbol_442);
			symbol_441.setPrecedence(symbol_6);
			symbol_441.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_441);
		}
		{	// ocl::Sequence::append() ocl|Sequence{T}|append(ocl|Sequence{T}?T)
			Operation symbol_443 = PivotFactory.eINSTANCE.createOperation();
			symbol_443.setName("append");
			symbol_443.setType(symbol_164);  // ocl|Sequence[ocl|Sequence{T}?T]
			Parameter symbol_444 = PivotFactory.eINSTANCE.createParameter();
			symbol_444.setName("object");
			symbol_444.setType(symbol_74);  // ocl|Sequence{T}?T
			symbol_443.getOwnedParameters().add(symbol_444);
			symbol_443.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_443);
		}
		{	// ocl::Sequence::excluding() ocl|Sequence{T}|excluding(ocl|OclAny)
			Operation symbol_445 = PivotFactory.eINSTANCE.createOperation();
			symbol_445.setName("excluding");
			symbol_445.setType(symbol_164);  // ocl|Sequence[ocl|Sequence{T}?T]
			Parameter symbol_446 = PivotFactory.eINSTANCE.createParameter();
			symbol_446.setName("object");
			symbol_446.setType(symbol_50);  // ocl|OclAny
			symbol_445.getOwnedParameters().add(symbol_446);
			symbol_445.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_445);
		}
		{	// ocl::Sequence::flatten() ocl|Sequence{T}|flatten{T2}()
			Operation symbol_447 = PivotFactory.eINSTANCE.createOperation();
			symbol_77.setName("T2");
			symbol_76.setOwnedParameteredElement(symbol_77);
			symbol_75.getOwnedParameters().add(symbol_76);
			
			symbol_447.setOwnedTemplateSignature(symbol_75);
			symbol_447.setName("flatten");
			symbol_447.setType(symbol_166);  // ocl|Sequence[ocl|Sequence{T}|flatten{T2}()?T2]
			symbol_447.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_447);
		}
		{	// ocl::Sequence::including() ocl|Sequence{T}|including(ocl|Sequence{T}?T)
			Operation symbol_448 = PivotFactory.eINSTANCE.createOperation();
			symbol_448.setName("including");
			symbol_448.setType(symbol_164);  // ocl|Sequence[ocl|Sequence{T}?T]
			Parameter symbol_449 = PivotFactory.eINSTANCE.createParameter();
			symbol_449.setName("object");
			symbol_449.setType(symbol_74);  // ocl|Sequence{T}?T
			symbol_448.getOwnedParameters().add(symbol_449);
			symbol_448.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_448);
		}
		{	// ocl::Sequence::insertAt() ocl|Sequence{T}|insertAt(Integer,ocl|Sequence{T}?T)
			Operation symbol_450 = PivotFactory.eINSTANCE.createOperation();
			symbol_450.setName("insertAt");
			symbol_450.setType(symbol_164);  // ocl|Sequence[ocl|Sequence{T}?T]
			Parameter symbol_451 = PivotFactory.eINSTANCE.createParameter();
			symbol_451.setName("index");
			symbol_451.setType(symbol_41);  // Integer
			symbol_450.getOwnedParameters().add(symbol_451);
			Parameter symbol_452 = PivotFactory.eINSTANCE.createParameter();
			symbol_452.setName("object");
			symbol_452.setType(symbol_74);  // ocl|Sequence{T}?T
			symbol_450.getOwnedParameters().add(symbol_452);
			symbol_450.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_450);
		}
		{	// ocl::Sequence::prepend() ocl|Sequence{T}|prepend(ocl|Sequence{T}?T)
			Operation symbol_453 = PivotFactory.eINSTANCE.createOperation();
			symbol_453.setName("prepend");
			symbol_453.setType(symbol_164);  // ocl|Sequence[ocl|Sequence{T}?T]
			Parameter symbol_454 = PivotFactory.eINSTANCE.createParameter();
			symbol_454.setName("object");
			symbol_454.setType(symbol_74);  // ocl|Sequence{T}?T
			symbol_453.getOwnedParameters().add(symbol_454);
			symbol_453.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_453);
		}
		{	// ocl::Sequence::reject() ocl|Sequence{T}|reject(ocl|Sequence{T}?T)
			Iteration symbol_455 = PivotFactory.eINSTANCE.createIteration();
			symbol_455.setName("reject");
			symbol_455.setType(symbol_164);  // ocl|Sequence[ocl|Sequence{T}?T]
			Parameter symbol_456 = PivotFactory.eINSTANCE.createParameter();
			symbol_456.setName("i");
			symbol_456.setType(symbol_74);  // ocl|Sequence{T}?T
			symbol_455.getOwnedIterators().add(symbol_456);
			symbol_455.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_455);
		}
		{	// ocl::Sequence::reverse() ocl|Sequence{T}|reverse()
			Operation symbol_457 = PivotFactory.eINSTANCE.createOperation();
			symbol_457.setName("reverse");
			symbol_457.setType(symbol_164);  // ocl|Sequence[ocl|Sequence{T}?T]
			symbol_457.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_457);
		}
		{	// ocl::Sequence::select() ocl|Sequence{T}|select(ocl|Sequence{T}?T)
			Iteration symbol_458 = PivotFactory.eINSTANCE.createIteration();
			symbol_458.setName("select");
			symbol_458.setType(symbol_164);  // ocl|Sequence[ocl|Sequence{T}?T]
			Parameter symbol_459 = PivotFactory.eINSTANCE.createParameter();
			symbol_459.setName("i");
			symbol_459.setType(symbol_74);  // ocl|Sequence{T}?T
			symbol_458.getOwnedIterators().add(symbol_459);
			symbol_458.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_458);
		}
		{	// ocl::Sequence::subSequence() ocl|Sequence{T}|subSequence(Integer,Integer)
			Operation symbol_460 = PivotFactory.eINSTANCE.createOperation();
			symbol_460.setName("subSequence");
			symbol_460.setType(symbol_164);  // ocl|Sequence[ocl|Sequence{T}?T]
			Parameter symbol_461 = PivotFactory.eINSTANCE.createParameter();
			symbol_461.setName("lower");
			symbol_461.setType(symbol_41);  // Integer
			symbol_460.getOwnedParameters().add(symbol_461);
			Parameter symbol_462 = PivotFactory.eINSTANCE.createParameter();
			symbol_462.setName("upper");
			symbol_462.setType(symbol_41);  // Integer
			symbol_460.getOwnedParameters().add(symbol_462);
			symbol_460.setImplementation(org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_460);
		}
		{	// ocl::Sequence::union() ocl|Sequence{T}|union(ocl|Sequence[ocl|Sequence{T}?T])
			Operation symbol_463 = PivotFactory.eINSTANCE.createOperation();
			symbol_463.setName("union");
			symbol_463.setType(symbol_164);  // ocl|Sequence[ocl|Sequence{T}?T]
			Parameter symbol_464 = PivotFactory.eINSTANCE.createParameter();
			symbol_464.setName("s");
			symbol_464.setType(symbol_164);  // ocl|Sequence[ocl|Sequence{T}?T]
			symbol_463.getOwnedParameters().add(symbol_464);
			symbol_463.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_463);
		}
		symbol_1.getOwnedTypes().add(symbol_71);
		//
		// ocl::Set ocl|Set{T}
		//
		symbol_78.setName("Set");
		symbol_78.setElementType(symbol_58);
		symbol_81.setName("T");
		symbol_80.setOwnedParameteredElement(symbol_81);
		symbol_79.getOwnedParameters().add(symbol_80);
		
		symbol_78.setOwnedTemplateSignature(symbol_79);
		symbol_78.getSuperClasses().add(symbol_131);
		symbol_78.getSuperClasses().add(symbol_186);
		{	// ocl::Set::-() ocl|Set{T}|-(ocl|Set[ocl|OclAny])
			Operation symbol_465 = PivotFactory.eINSTANCE.createOperation();
			symbol_465.setName("-");
			symbol_465.setType(symbol_172);  // ocl|Set[ocl|Set{T}?T]
			Parameter symbol_466 = PivotFactory.eINSTANCE.createParameter();
			symbol_466.setName("s");
			symbol_466.setType(symbol_177);  // ocl|Set[ocl|OclAny]
			symbol_465.getOwnedParameters().add(symbol_466);
			symbol_465.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_465);
		}
		{	// ocl::Set::<>() ocl|Set{T}|<>(ocl|OclAny)
			Operation symbol_467 = PivotFactory.eINSTANCE.createOperation();
			symbol_467.setName("<>");
			symbol_467.setType(symbol_19);  // Boolean
			Parameter symbol_468 = PivotFactory.eINSTANCE.createParameter();
			symbol_468.setName("object2");
			symbol_468.setType(symbol_50);  // ocl|OclAny
			symbol_467.getOwnedParameters().add(symbol_468);
			symbol_467.setPrecedence(symbol_6);
			symbol_467.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_467);
		}
		{	// ocl::Set::=() ocl|Set{T}|=(ocl|OclAny)
			Operation symbol_469 = PivotFactory.eINSTANCE.createOperation();
			symbol_469.setName("=");
			symbol_469.setType(symbol_19);  // Boolean
			Parameter symbol_470 = PivotFactory.eINSTANCE.createParameter();
			symbol_470.setName("object2");
			symbol_470.setType(symbol_50);  // ocl|OclAny
			symbol_469.getOwnedParameters().add(symbol_470);
			symbol_469.setPrecedence(symbol_6);
			symbol_469.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_469);
		}
		{	// ocl::Set::excluding() ocl|Set{T}|excluding(ocl|OclAny)
			Operation symbol_471 = PivotFactory.eINSTANCE.createOperation();
			symbol_471.setName("excluding");
			symbol_471.setType(symbol_172);  // ocl|Set[ocl|Set{T}?T]
			Parameter symbol_472 = PivotFactory.eINSTANCE.createParameter();
			symbol_472.setName("object");
			symbol_472.setType(symbol_50);  // ocl|OclAny
			symbol_471.getOwnedParameters().add(symbol_472);
			symbol_471.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_471);
		}
		{	// ocl::Set::flatten() ocl|Set{T}|flatten{T2}()
			Operation symbol_473 = PivotFactory.eINSTANCE.createOperation();
			symbol_84.setName("T2");
			symbol_83.setOwnedParameteredElement(symbol_84);
			symbol_82.getOwnedParameters().add(symbol_83);
			
			symbol_473.setOwnedTemplateSignature(symbol_82);
			symbol_473.setName("flatten");
			symbol_473.setType(symbol_175);  // ocl|Set[ocl|Set{T}|flatten{T2}()?T2]
			symbol_473.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_473);
		}
		{	// ocl::Set::including() ocl|Set{T}|including(ocl|Set{T}?T)
			Operation symbol_474 = PivotFactory.eINSTANCE.createOperation();
			symbol_474.setName("including");
			symbol_474.setType(symbol_172);  // ocl|Set[ocl|Set{T}?T]
			Parameter symbol_475 = PivotFactory.eINSTANCE.createParameter();
			symbol_475.setName("object");
			symbol_475.setType(symbol_81);  // ocl|Set{T}?T
			symbol_474.getOwnedParameters().add(symbol_475);
			symbol_474.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_474);
		}
		{	// ocl::Set::intersection() ocl|Set{T}|intersection(ocl|Set[ocl|Set{T}?T])
			Operation symbol_476 = PivotFactory.eINSTANCE.createOperation();
			symbol_476.setName("intersection");
			symbol_476.setType(symbol_172);  // ocl|Set[ocl|Set{T}?T]
			Parameter symbol_477 = PivotFactory.eINSTANCE.createParameter();
			symbol_477.setName("s");
			symbol_477.setType(symbol_172);  // ocl|Set[ocl|Set{T}?T]
			symbol_476.getOwnedParameters().add(symbol_477);
			symbol_476.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_476);
		}
		{	// ocl::Set::reject() ocl|Set{T}|reject(ocl|Set{T}?T)
			Iteration symbol_478 = PivotFactory.eINSTANCE.createIteration();
			symbol_478.setName("reject");
			symbol_478.setType(symbol_172);  // ocl|Set[ocl|Set{T}?T]
			Parameter symbol_479 = PivotFactory.eINSTANCE.createParameter();
			symbol_479.setName("i");
			symbol_479.setType(symbol_81);  // ocl|Set{T}?T
			symbol_478.getOwnedIterators().add(symbol_479);
			symbol_478.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_478);
		}
		{	// ocl::Set::select() ocl|Set{T}|select(ocl|Set{T}?T)
			Iteration symbol_480 = PivotFactory.eINSTANCE.createIteration();
			symbol_480.setName("select");
			symbol_480.setType(symbol_172);  // ocl|Set[ocl|Set{T}?T]
			Parameter symbol_481 = PivotFactory.eINSTANCE.createParameter();
			symbol_481.setName("i");
			symbol_481.setType(symbol_81);  // ocl|Set{T}?T
			symbol_480.getOwnedIterators().add(symbol_481);
			symbol_480.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_480);
		}
		{	// ocl::Set::symmetricDifference() ocl|Set{T}|symmetricDifference(ocl|Set[ocl|OclAny])
			Operation symbol_482 = PivotFactory.eINSTANCE.createOperation();
			symbol_482.setName("symmetricDifference");
			symbol_482.setType(symbol_172);  // ocl|Set[ocl|Set{T}?T]
			Parameter symbol_483 = PivotFactory.eINSTANCE.createParameter();
			symbol_483.setName("s");
			symbol_483.setType(symbol_177);  // ocl|Set[ocl|OclAny]
			symbol_482.getOwnedParameters().add(symbol_483);
			symbol_482.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_482);
		}
		symbol_1.getOwnedTypes().add(symbol_78);
		//
		// ocl::String String
		//
		symbol_85.setName("String");
		symbol_85.getSuperClasses().add(symbol_50);
		{	// ocl::String::+() String|+(String)
			Operation symbol_484 = PivotFactory.eINSTANCE.createOperation();
			symbol_484.setName("+");
			symbol_484.setType(symbol_85);  // String
			Parameter symbol_485 = PivotFactory.eINSTANCE.createParameter();
			symbol_485.setName("s");
			symbol_485.setType(symbol_85);  // String
			symbol_484.getOwnedParameters().add(symbol_485);
			symbol_484.setPrecedence(symbol_8);
			symbol_484.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_484);
		}
		{	// ocl::String::<() String|<(String)
			Operation symbol_486 = PivotFactory.eINSTANCE.createOperation();
			symbol_486.setName("<");
			symbol_486.setType(symbol_19);  // Boolean
			Parameter symbol_487 = PivotFactory.eINSTANCE.createParameter();
			symbol_487.setName("s");
			symbol_487.setType(symbol_85);  // String
			symbol_486.getOwnedParameters().add(symbol_487);
			symbol_486.setPrecedence(symbol_7);
			symbol_486.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_486);
		}
		{	// ocl::String::<=() String|<=(String)
			Operation symbol_488 = PivotFactory.eINSTANCE.createOperation();
			symbol_488.setName("<=");
			symbol_488.setType(symbol_19);  // Boolean
			Parameter symbol_489 = PivotFactory.eINSTANCE.createParameter();
			symbol_489.setName("s");
			symbol_489.setType(symbol_85);  // String
			symbol_488.getOwnedParameters().add(symbol_489);
			symbol_488.setPrecedence(symbol_7);
			symbol_488.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_488);
		}
		{	// ocl::String::<>() String|<>(ocl|OclAny)
			Operation symbol_490 = PivotFactory.eINSTANCE.createOperation();
			symbol_490.setName("<>");
			symbol_490.setType(symbol_19);  // Boolean
			Parameter symbol_491 = PivotFactory.eINSTANCE.createParameter();
			symbol_491.setName("object2");
			symbol_491.setType(symbol_50);  // ocl|OclAny
			symbol_490.getOwnedParameters().add(symbol_491);
			symbol_490.setPrecedence(symbol_6);
			symbol_490.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_490);
		}
		{	// ocl::String::=() String|=(ocl|OclAny)
			Operation symbol_492 = PivotFactory.eINSTANCE.createOperation();
			symbol_492.setName("=");
			symbol_492.setType(symbol_19);  // Boolean
			Parameter symbol_493 = PivotFactory.eINSTANCE.createParameter();
			symbol_493.setName("object2");
			symbol_493.setType(symbol_50);  // ocl|OclAny
			symbol_492.getOwnedParameters().add(symbol_493);
			symbol_492.setPrecedence(symbol_6);
			symbol_492.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_492);
		}
		{	// ocl::String::>() String|>(String)
			Operation symbol_494 = PivotFactory.eINSTANCE.createOperation();
			symbol_494.setName(">");
			symbol_494.setType(symbol_19);  // Boolean
			Parameter symbol_495 = PivotFactory.eINSTANCE.createParameter();
			symbol_495.setName("s");
			symbol_495.setType(symbol_85);  // String
			symbol_494.getOwnedParameters().add(symbol_495);
			symbol_494.setPrecedence(symbol_7);
			symbol_494.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_494);
		}
		{	// ocl::String::>=() String|>=(String)
			Operation symbol_496 = PivotFactory.eINSTANCE.createOperation();
			symbol_496.setName(">=");
			symbol_496.setType(symbol_19);  // Boolean
			Parameter symbol_497 = PivotFactory.eINSTANCE.createParameter();
			symbol_497.setName("s");
			symbol_497.setType(symbol_85);  // String
			symbol_496.getOwnedParameters().add(symbol_497);
			symbol_496.setPrecedence(symbol_7);
			symbol_496.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_496);
		}
		{	// ocl::String::at() String|at(Integer)
			Operation symbol_498 = PivotFactory.eINSTANCE.createOperation();
			symbol_498.setName("at");
			symbol_498.setType(symbol_85);  // String
			Parameter symbol_499 = PivotFactory.eINSTANCE.createParameter();
			symbol_499.setName("i");
			symbol_499.setType(symbol_41);  // Integer
			symbol_498.getOwnedParameters().add(symbol_499);
			symbol_498.setImplementation(org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_498);
		}
		{	// ocl::String::characters() String|characters()
			Operation symbol_500 = PivotFactory.eINSTANCE.createOperation();
			symbol_500.setName("characters");
			symbol_500.setType(symbol_163);  // ocl|Sequence[String]
			symbol_500.setImplementation(org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_500);
		}
		{	// ocl::String::concat() String|concat(String)
			Operation symbol_501 = PivotFactory.eINSTANCE.createOperation();
			symbol_501.setName("concat");
			symbol_501.setType(symbol_85);  // String
			Parameter symbol_502 = PivotFactory.eINSTANCE.createParameter();
			symbol_502.setName("s");
			symbol_502.setType(symbol_85);  // String
			symbol_501.getOwnedParameters().add(symbol_502);
			symbol_501.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_501);
		}
		{	// ocl::String::equalsIgnoreCase() String|equalsIgnoreCase(String)
			Operation symbol_503 = PivotFactory.eINSTANCE.createOperation();
			symbol_503.setName("equalsIgnoreCase");
			symbol_503.setType(symbol_19);  // Boolean
			Parameter symbol_504 = PivotFactory.eINSTANCE.createParameter();
			symbol_504.setName("s");
			symbol_504.setType(symbol_85);  // String
			symbol_503.getOwnedParameters().add(symbol_504);
			symbol_503.setImplementation(org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_503);
		}
		{	// ocl::String::indexOf() String|indexOf(String)
			Operation symbol_505 = PivotFactory.eINSTANCE.createOperation();
			symbol_505.setName("indexOf");
			symbol_505.setType(symbol_41);  // Integer
			Parameter symbol_506 = PivotFactory.eINSTANCE.createParameter();
			symbol_506.setName("s");
			symbol_506.setType(symbol_85);  // String
			symbol_505.getOwnedParameters().add(symbol_506);
			symbol_505.setImplementation(org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_505);
		}
		{	// ocl::String::size() String|size()
			Operation symbol_507 = PivotFactory.eINSTANCE.createOperation();
			symbol_507.setName("size");
			symbol_507.setType(symbol_41);  // Integer
			symbol_507.setImplementation(org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_507);
		}
		{	// ocl::String::substring() String|substring(Integer,Integer)
			Operation symbol_508 = PivotFactory.eINSTANCE.createOperation();
			symbol_508.setName("substring");
			symbol_508.setType(symbol_85);  // String
			Parameter symbol_509 = PivotFactory.eINSTANCE.createParameter();
			symbol_509.setName("lower");
			symbol_509.setType(symbol_41);  // Integer
			symbol_508.getOwnedParameters().add(symbol_509);
			Parameter symbol_510 = PivotFactory.eINSTANCE.createParameter();
			symbol_510.setName("upper");
			symbol_510.setType(symbol_41);  // Integer
			symbol_508.getOwnedParameters().add(symbol_510);
			symbol_508.setImplementation(org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_508);
		}
		{	// ocl::String::toBoolean() String|toBoolean()
			Operation symbol_511 = PivotFactory.eINSTANCE.createOperation();
			symbol_511.setName("toBoolean");
			symbol_511.setType(symbol_19);  // Boolean
			symbol_511.setImplementation(org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_511);
		}
		{	// ocl::String::toInteger() String|toInteger()
			Operation symbol_512 = PivotFactory.eINSTANCE.createOperation();
			symbol_512.setName("toInteger");
			symbol_512.setType(symbol_41);  // Integer
			symbol_512.setImplementation(org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_512);
		}
		{	// ocl::String::toLowerCase() String|toLowerCase()
			Operation symbol_513 = PivotFactory.eINSTANCE.createOperation();
			symbol_513.setName("toLowerCase");
			symbol_513.setType(symbol_85);  // String
			symbol_513.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_513);
		}
		{	// ocl::String::toReal() String|toReal()
			Operation symbol_514 = PivotFactory.eINSTANCE.createOperation();
			symbol_514.setName("toReal");
			symbol_514.setType(symbol_67);  // Real
			symbol_514.setImplementation(org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_514);
		}
		{	// ocl::String::toString() String|toString()
			Operation symbol_515 = PivotFactory.eINSTANCE.createOperation();
			symbol_515.setName("toString");
			symbol_515.setType(symbol_85);  // String
			symbol_515.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_515);
		}
		{	// ocl::String::toUpperCase() String|toUpperCase()
			Operation symbol_516 = PivotFactory.eINSTANCE.createOperation();
			symbol_516.setName("toUpperCase");
			symbol_516.setType(symbol_85);  // String
			symbol_516.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_516);
		}
		symbol_1.getOwnedTypes().add(symbol_85);
		//
		// ocl::Tuple ocl|Tuple{T1,T2}
		//
		symbol_86.setName("Tuple");
		symbol_89.setName("T1");
		symbol_88.setOwnedParameteredElement(symbol_89);
		symbol_87.getOwnedParameters().add(symbol_88);
		symbol_91.setName("T2");
		symbol_90.setOwnedParameteredElement(symbol_91);
		symbol_87.getOwnedParameters().add(symbol_90);
		
		symbol_86.setOwnedTemplateSignature(symbol_87);
		symbol_86.getSuperClasses().add(symbol_57);
		{ // ocl::Tuple::first ocl|Tuple{T1,T2}|first
			Property symbol_517 = PivotFactory.eINSTANCE.createProperty();
			symbol_517.setName("first");
			symbol_517.setType(symbol_89);  // ocl|Tuple{T1,T2}?T1
			symbol_517.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_86.getOwnedAttributes().add(symbol_517);
		}
		{ // ocl::Tuple::second ocl|Tuple{T1,T2}|second
			Property symbol_518 = PivotFactory.eINSTANCE.createProperty();
			symbol_518.setName("second");
			symbol_518.setType(symbol_91);  // ocl|Tuple{T1,T2}?T2
			symbol_518.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_86.getOwnedAttributes().add(symbol_518);
		}
		symbol_1.getOwnedTypes().add(symbol_86);
		//
		// ocl::UniqueCollection ocl|UniqueCollection{T}
		//
		symbol_92.setName("UniqueCollection");
		symbol_92.setElementType(symbol_58);
		symbol_95.setName("T");
		symbol_94.setOwnedParameteredElement(symbol_95);
		symbol_93.getOwnedParameters().add(symbol_94);
		
		symbol_92.setOwnedTemplateSignature(symbol_93);
		symbol_92.getSuperClasses().add(symbol_125);
		{	// ocl::UniqueCollection::sortedBy() ocl|UniqueCollection{T}|sortedBy(ocl|UniqueCollection{T}?T)
			Iteration symbol_519 = PivotFactory.eINSTANCE.createIteration();
			symbol_519.setName("sortedBy");
			symbol_519.setType(symbol_160);  // ocl|OrderedSet[ocl|UniqueCollection{T}?T]
			Parameter symbol_520 = PivotFactory.eINSTANCE.createParameter();
			symbol_520.setName("i");
			symbol_520.setType(symbol_95);  // ocl|UniqueCollection{T}?T
			symbol_519.getOwnedIterators().add(symbol_520);
			symbol_519.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_92.getOwnedOperations().add(symbol_519);
		}
		symbol_1.getOwnedTypes().add(symbol_92);
		//
		// ocl::UnlimitedNatural UnlimitedNatural
		//
		symbol_96.setName("UnlimitedNatural");
		symbol_96.getSuperClasses().add(symbol_41);
		symbol_1.getOwnedTypes().add(symbol_96);
		//
		// ocl::orphanage
		//
		symbol_97.setName("orphanage");
		//
		// ocl::orphanage::Bag ocl|Bag[ocl|NonOrderedCollection{T}?T]
		//
		symbol_98.setName("Bag");
		symbol_98.setElementType(symbol_45);
		{
			TemplateBinding symbol_521 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_521.setSignature(symbol_13);
			{
				TemplateParameterSubstitution symbol_522 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_522.setFormal(symbol_14);	
				symbol_522.setActual(symbol_45);	
				symbol_521.getParameterSubstitutions().add(symbol_522);
			}
			symbol_98.getTemplateBindings().add(symbol_521);
		}
		symbol_98.getSuperClasses().add(symbol_129);
		symbol_98.getSuperClasses().add(symbol_141);
		symbol_97.getOwnedTypes().add(symbol_98);
		//
		// ocl::orphanage::Bag ocl|Bag[ocl|Bag{T}|flatten{T2}()?T2]
		//
		symbol_99.setName("Bag");
		symbol_99.setElementType(symbol_18);
		{
			TemplateBinding symbol_523 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_523.setSignature(symbol_13);
			{
				TemplateParameterSubstitution symbol_524 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_524.setFormal(symbol_14);	
				symbol_524.setActual(symbol_18);	
				symbol_523.getParameterSubstitutions().add(symbol_524);
			}
			symbol_99.getTemplateBindings().add(symbol_523);
		}
		symbol_99.getSuperClasses().add(symbol_147);
		symbol_99.getSuperClasses().add(symbol_135);
		symbol_97.getOwnedTypes().add(symbol_99);
		//
		// ocl::orphanage::Bag ocl|Bag[ocl|Bag{T}?T]
		//
		symbol_100.setName("Bag");
		symbol_100.setElementType(symbol_15);
		{
			TemplateBinding symbol_525 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_525.setSignature(symbol_13);
			{
				TemplateParameterSubstitution symbol_526 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_526.setFormal(symbol_14);	
				symbol_526.setActual(symbol_15);	
				symbol_525.getParameterSubstitutions().add(symbol_526);
			}
			symbol_100.getTemplateBindings().add(symbol_525);
		}
		symbol_100.getSuperClasses().add(symbol_145);
		symbol_100.getSuperClasses().add(symbol_126);
		symbol_97.getOwnedTypes().add(symbol_100);
		//
		// ocl::orphanage::Bag ocl|Bag[ocl|Collection{T}?T]
		//
		symbol_101.setName("Bag");
		symbol_101.setElementType(symbol_24);
		{
			TemplateBinding symbol_527 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_527.setSignature(symbol_13);
			{
				TemplateParameterSubstitution symbol_528 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_528.setFormal(symbol_14);	
				symbol_528.setActual(symbol_24);	
				symbol_527.getParameterSubstitutions().add(symbol_528);
			}
			symbol_101.getTemplateBindings().add(symbol_527);
		}
		symbol_101.getSuperClasses().add(symbol_146);
		symbol_101.getSuperClasses().add(symbol_130);
		symbol_97.getOwnedTypes().add(symbol_101);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Collection{T}|flatten{T2}()?T2]
		//
		symbol_102.setName("Collection");
		symbol_102.setElementType(symbol_30);
		{
			TemplateBinding symbol_529 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_529.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_530 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_530.setFormal(symbol_23);	
				symbol_530.setActual(symbol_30);	
				symbol_529.getParameterSubstitutions().add(symbol_530);
			}
			symbol_102.getTemplateBindings().add(symbol_529);
		}
		symbol_102.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_102);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Bag{T}|flatten{T2}()?T2]
		//
		symbol_103.setName("Collection");
		symbol_103.setElementType(symbol_18);
		{
			TemplateBinding symbol_531 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_531.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_532 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_532.setFormal(symbol_23);	
				symbol_532.setActual(symbol_18);	
				symbol_531.getParameterSubstitutions().add(symbol_532);
			}
			symbol_103.getTemplateBindings().add(symbol_531);
		}
		symbol_103.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_103);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Bag{T}?T]
		//
		symbol_104.setName("Collection");
		symbol_104.setElementType(symbol_15);
		{
			TemplateBinding symbol_533 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_533.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_534 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_534.setFormal(symbol_23);	
				symbol_534.setActual(symbol_15);	
				symbol_533.getParameterSubstitutions().add(symbol_534);
			}
			symbol_104.getTemplateBindings().add(symbol_533);
		}
		symbol_104.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_104);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|OrderedSet{T}?T]
		//
		symbol_105.setName("Collection");
		symbol_105.setElementType(symbol_66);
		{
			TemplateBinding symbol_535 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_535.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_536 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_536.setFormal(symbol_23);	
				symbol_536.setActual(symbol_66);	
				symbol_535.getParameterSubstitutions().add(symbol_536);
			}
			symbol_105.getTemplateBindings().add(symbol_535);
		}
		symbol_105.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_105);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Collection{T}|excludesAll{T2}(ocl|Collection[T2])?T2]
		//
		symbol_106.setName("Collection");
		symbol_106.setElementType(symbol_27);
		{
			TemplateBinding symbol_537 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_537.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_538 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_538.setFormal(symbol_23);	
				symbol_538.setActual(symbol_27);	
				symbol_537.getParameterSubstitutions().add(symbol_538);
			}
			symbol_106.getTemplateBindings().add(symbol_537);
		}
		symbol_106.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_106);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Set{T}|flatten{T2}()?T2]
		//
		symbol_107.setName("Collection");
		symbol_107.setElementType(symbol_84);
		{
			TemplateBinding symbol_539 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_539.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_540 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_540.setFormal(symbol_23);	
				symbol_540.setActual(symbol_84);	
				symbol_539.getParameterSubstitutions().add(symbol_540);
			}
			symbol_107.getTemplateBindings().add(symbol_539);
		}
		symbol_107.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_107);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|NonOrderedCollection{T}?T]
		//
		symbol_108.setName("Collection");
		symbol_108.setElementType(symbol_45);
		{
			TemplateBinding symbol_541 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_541.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_542 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_542.setFormal(symbol_23);	
				symbol_542.setActual(symbol_45);	
				symbol_541.getParameterSubstitutions().add(symbol_542);
			}
			symbol_108.getTemplateBindings().add(symbol_541);
		}
		symbol_108.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_108);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]
		//
		symbol_109.setName("Collection");
		symbol_109.setElementType(symbol_39);
		{
			TemplateBinding symbol_543 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_543.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_544 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_544.setFormal(symbol_23);	
				symbol_544.setActual(symbol_39);	
				symbol_543.getParameterSubstitutions().add(symbol_544);
			}
			symbol_109.getTemplateBindings().add(symbol_543);
		}
		symbol_109.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_109);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Collection{T}?T]
		//
		symbol_110.setName("Collection");
		symbol_110.setElementType(symbol_24);
		{
			TemplateBinding symbol_545 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_545.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_546 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_546.setFormal(symbol_23);	
				symbol_546.setActual(symbol_24);	
				symbol_545.getParameterSubstitutions().add(symbol_546);
			}
			symbol_110.getTemplateBindings().add(symbol_545);
		}
		symbol_110.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_110);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]]
		//
		symbol_111.setName("Collection");
		symbol_111.setElementType(symbol_179);
		{
			TemplateBinding symbol_547 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_547.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_548 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_548.setFormal(symbol_23);	
				symbol_548.setActual(symbol_179);	
				symbol_547.getParameterSubstitutions().add(symbol_548);
			}
			symbol_111.getTemplateBindings().add(symbol_547);
		}
		symbol_111.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_111);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|OrderedCollection{T}?T]
		//
		symbol_112.setName("Collection");
		symbol_112.setElementType(symbol_62);
		{
			TemplateBinding symbol_549 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_549.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_550 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_550.setFormal(symbol_23);	
				symbol_550.setActual(symbol_62);	
				symbol_549.getParameterSubstitutions().add(symbol_550);
			}
			symbol_112.getTemplateBindings().add(symbol_549);
		}
		symbol_112.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_112);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Classifier]
		//
		symbol_113.setName("Collection");
		symbol_113.setElementType(symbol_20);
		{
			TemplateBinding symbol_551 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_551.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_552 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_552.setFormal(symbol_23);	
				symbol_552.setActual(symbol_20);	
				symbol_551.getParameterSubstitutions().add(symbol_552);
			}
			symbol_113.getTemplateBindings().add(symbol_551);
		}
		symbol_113.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_113);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Enumeration]
		//
		symbol_114.setName("Collection");
		symbol_114.setElementType(symbol_40);
		{
			TemplateBinding symbol_553 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_553.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_554 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_554.setFormal(symbol_23);	
				symbol_554.setActual(symbol_40);	
				symbol_553.getParameterSubstitutions().add(symbol_554);
			}
			symbol_114.getTemplateBindings().add(symbol_553);
		}
		symbol_114.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_114);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Collection{T}|includesAll{T2}(ocl|Collection[T2])?T2]
		//
		symbol_115.setName("Collection");
		symbol_115.setElementType(symbol_33);
		{
			TemplateBinding symbol_555 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_555.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_556 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_556.setFormal(symbol_23);	
				symbol_556.setActual(symbol_33);	
				symbol_555.getParameterSubstitutions().add(symbol_556);
			}
			symbol_115.getTemplateBindings().add(symbol_555);
		}
		symbol_115.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_115);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|OclVoid]
		//
		symbol_116.setName("Collection");
		symbol_116.setElementType(symbol_58);
		{
			TemplateBinding symbol_557 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_557.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_558 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_558.setFormal(symbol_23);	
				symbol_558.setActual(symbol_58);	
				symbol_557.getParameterSubstitutions().add(symbol_558);
			}
			symbol_116.getTemplateBindings().add(symbol_557);
		}
		symbol_116.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_116);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|NonUniqueCollection{T}?T]
		//
		symbol_117.setName("Collection");
		symbol_117.setElementType(symbol_49);
		{
			TemplateBinding symbol_559 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_559.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_560 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_560.setFormal(symbol_23);	
				symbol_560.setActual(symbol_49);	
				symbol_559.getParameterSubstitutions().add(symbol_560);
			}
			symbol_117.getTemplateBindings().add(symbol_559);
		}
		symbol_117.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_117);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Set{T}?T]
		//
		symbol_118.setName("Collection");
		symbol_118.setElementType(symbol_81);
		{
			TemplateBinding symbol_561 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_561.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_562 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_562.setFormal(symbol_23);	
				symbol_562.setActual(symbol_81);	
				symbol_561.getParameterSubstitutions().add(symbol_562);
			}
			symbol_118.getTemplateBindings().add(symbol_561);
		}
		symbol_118.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_118);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Sequence{T}|flatten{T2}()?T2]
		//
		symbol_119.setName("Collection");
		symbol_119.setElementType(symbol_77);
		{
			TemplateBinding symbol_563 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_563.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_564 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_564.setFormal(symbol_23);	
				symbol_564.setActual(symbol_77);	
				symbol_563.getParameterSubstitutions().add(symbol_564);
			}
			symbol_119.getTemplateBindings().add(symbol_563);
		}
		symbol_119.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_119);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|OclInvalid]
		//
		symbol_120.setName("Collection");
		symbol_120.setElementType(symbol_54);
		{
			TemplateBinding symbol_565 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_565.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_566 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_566.setFormal(symbol_23);	
				symbol_566.setActual(symbol_54);	
				symbol_565.getParameterSubstitutions().add(symbol_566);
			}
			symbol_120.getTemplateBindings().add(symbol_565);
		}
		symbol_120.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_120);
		//
		// ocl::orphanage::Collection ocl|Collection[Boolean]
		//
		symbol_121.setName("Collection");
		symbol_121.setElementType(symbol_19);
		{
			TemplateBinding symbol_567 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_567.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_568 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_568.setFormal(symbol_23);	
				symbol_568.setActual(symbol_19);	
				symbol_567.getParameterSubstitutions().add(symbol_568);
			}
			symbol_121.getTemplateBindings().add(symbol_567);
		}
		symbol_121.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_121);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Sequence{T}?T]
		//
		symbol_122.setName("Collection");
		symbol_122.setElementType(symbol_74);
		{
			TemplateBinding symbol_569 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_569.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_570 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_570.setFormal(symbol_23);	
				symbol_570.setActual(symbol_74);	
				symbol_569.getParameterSubstitutions().add(symbol_570);
			}
			symbol_122.getTemplateBindings().add(symbol_569);
		}
		symbol_122.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_122);
		//
		// ocl::orphanage::Collection ocl|Collection[String]
		//
		symbol_123.setName("Collection");
		symbol_123.setElementType(symbol_85);
		{
			TemplateBinding symbol_571 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_571.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_572 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_572.setFormal(symbol_23);	
				symbol_572.setActual(symbol_85);	
				symbol_571.getParameterSubstitutions().add(symbol_572);
			}
			symbol_123.getTemplateBindings().add(symbol_571);
		}
		symbol_123.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_123);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|OclAny]
		//
		symbol_124.setName("Collection");
		symbol_124.setElementType(symbol_50);
		{
			TemplateBinding symbol_573 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_573.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_574 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_574.setFormal(symbol_23);	
				symbol_574.setActual(symbol_50);	
				symbol_573.getParameterSubstitutions().add(symbol_574);
			}
			symbol_124.getTemplateBindings().add(symbol_573);
		}
		symbol_124.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_124);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|UniqueCollection{T}?T]
		//
		symbol_125.setName("Collection");
		symbol_125.setElementType(symbol_95);
		{
			TemplateBinding symbol_575 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_575.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_576 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_576.setFormal(symbol_23);	
				symbol_576.setActual(symbol_95);	
				symbol_575.getParameterSubstitutions().add(symbol_576);
			}
			symbol_125.getTemplateBindings().add(symbol_575);
		}
		symbol_125.getSuperClasses().add(symbol_50);
		symbol_97.getOwnedTypes().add(symbol_125);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|Bag{T}?T]
		//
		symbol_126.setName("NonOrderedCollection");
		symbol_126.setElementType(symbol_15);
		{
			TemplateBinding symbol_577 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_577.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_578 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_578.setFormal(symbol_44);	
				symbol_578.setActual(symbol_15);	
				symbol_577.getParameterSubstitutions().add(symbol_578);
			}
			symbol_126.getTemplateBindings().add(symbol_577);
		}
		symbol_126.getSuperClasses().add(symbol_104);
		symbol_97.getOwnedTypes().add(symbol_126);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[Boolean]
		//
		symbol_127.setName("NonOrderedCollection");
		symbol_127.setElementType(symbol_19);
		{
			TemplateBinding symbol_579 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_579.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_580 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_580.setFormal(symbol_44);	
				symbol_580.setActual(symbol_19);	
				symbol_579.getParameterSubstitutions().add(symbol_580);
			}
			symbol_127.getTemplateBindings().add(symbol_579);
		}
		symbol_127.getSuperClasses().add(symbol_121);
		symbol_97.getOwnedTypes().add(symbol_127);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]]
		//
		symbol_128.setName("NonOrderedCollection");
		symbol_128.setElementType(symbol_179);
		{
			TemplateBinding symbol_581 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_581.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_582 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_582.setFormal(symbol_44);	
				symbol_582.setActual(symbol_179);	
				symbol_581.getParameterSubstitutions().add(symbol_582);
			}
			symbol_128.getTemplateBindings().add(symbol_581);
		}
		symbol_128.getSuperClasses().add(symbol_111);
		symbol_97.getOwnedTypes().add(symbol_128);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|NonOrderedCollection{T}?T]
		//
		symbol_129.setName("NonOrderedCollection");
		symbol_129.setElementType(symbol_45);
		{
			TemplateBinding symbol_583 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_583.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_584 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_584.setFormal(symbol_44);	
				symbol_584.setActual(symbol_45);	
				symbol_583.getParameterSubstitutions().add(symbol_584);
			}
			symbol_129.getTemplateBindings().add(symbol_583);
		}
		symbol_129.getSuperClasses().add(symbol_108);
		symbol_97.getOwnedTypes().add(symbol_129);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|Collection{T}?T]
		//
		symbol_130.setName("NonOrderedCollection");
		symbol_130.setElementType(symbol_24);
		{
			TemplateBinding symbol_585 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_585.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_586 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_586.setFormal(symbol_44);	
				symbol_586.setActual(symbol_24);	
				symbol_585.getParameterSubstitutions().add(symbol_586);
			}
			symbol_130.getTemplateBindings().add(symbol_585);
		}
		symbol_130.getSuperClasses().add(symbol_110);
		symbol_97.getOwnedTypes().add(symbol_130);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|Set{T}?T]
		//
		symbol_131.setName("NonOrderedCollection");
		symbol_131.setElementType(symbol_81);
		{
			TemplateBinding symbol_587 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_587.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_588 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_588.setFormal(symbol_44);	
				symbol_588.setActual(symbol_81);	
				symbol_587.getParameterSubstitutions().add(symbol_588);
			}
			symbol_131.getTemplateBindings().add(symbol_587);
		}
		symbol_131.getSuperClasses().add(symbol_118);
		symbol_97.getOwnedTypes().add(symbol_131);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|Set{T}|flatten{T2}()?T2]
		//
		symbol_132.setName("NonOrderedCollection");
		symbol_132.setElementType(symbol_84);
		{
			TemplateBinding symbol_589 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_589.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_590 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_590.setFormal(symbol_44);	
				symbol_590.setActual(symbol_84);	
				symbol_589.getParameterSubstitutions().add(symbol_590);
			}
			symbol_132.getTemplateBindings().add(symbol_589);
		}
		symbol_132.getSuperClasses().add(symbol_107);
		symbol_97.getOwnedTypes().add(symbol_132);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|OrderedSet{T}?T]
		//
		symbol_133.setName("NonOrderedCollection");
		symbol_133.setElementType(symbol_66);
		{
			TemplateBinding symbol_591 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_591.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_592 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_592.setFormal(symbol_44);	
				symbol_592.setActual(symbol_66);	
				symbol_591.getParameterSubstitutions().add(symbol_592);
			}
			symbol_133.getTemplateBindings().add(symbol_591);
		}
		symbol_133.getSuperClasses().add(symbol_105);
		symbol_97.getOwnedTypes().add(symbol_133);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|Enumeration]
		//
		symbol_134.setName("NonOrderedCollection");
		symbol_134.setElementType(symbol_40);
		{
			TemplateBinding symbol_593 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_593.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_594 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_594.setFormal(symbol_44);	
				symbol_594.setActual(symbol_40);	
				symbol_593.getParameterSubstitutions().add(symbol_594);
			}
			symbol_134.getTemplateBindings().add(symbol_593);
		}
		symbol_134.getSuperClasses().add(symbol_114);
		symbol_97.getOwnedTypes().add(symbol_134);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|Bag{T}|flatten{T2}()?T2]
		//
		symbol_135.setName("NonOrderedCollection");
		symbol_135.setElementType(symbol_18);
		{
			TemplateBinding symbol_595 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_595.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_596 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_596.setFormal(symbol_44);	
				symbol_596.setActual(symbol_18);	
				symbol_595.getParameterSubstitutions().add(symbol_596);
			}
			symbol_135.getTemplateBindings().add(symbol_595);
		}
		symbol_135.getSuperClasses().add(symbol_103);
		symbol_97.getOwnedTypes().add(symbol_135);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|OclInvalid]
		//
		symbol_136.setName("NonOrderedCollection");
		symbol_136.setElementType(symbol_54);
		{
			TemplateBinding symbol_597 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_597.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_598 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_598.setFormal(symbol_44);	
				symbol_598.setActual(symbol_54);	
				symbol_597.getParameterSubstitutions().add(symbol_598);
			}
			symbol_136.getTemplateBindings().add(symbol_597);
		}
		symbol_136.getSuperClasses().add(symbol_120);
		symbol_97.getOwnedTypes().add(symbol_136);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|OclAny]
		//
		symbol_137.setName("NonOrderedCollection");
		symbol_137.setElementType(symbol_50);
		{
			TemplateBinding symbol_599 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_599.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_600 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_600.setFormal(symbol_44);	
				symbol_600.setActual(symbol_50);	
				symbol_599.getParameterSubstitutions().add(symbol_600);
			}
			symbol_137.getTemplateBindings().add(symbol_599);
		}
		symbol_137.getSuperClasses().add(symbol_124);
		symbol_97.getOwnedTypes().add(symbol_137);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|Classifier]
		//
		symbol_138.setName("NonOrderedCollection");
		symbol_138.setElementType(symbol_20);
		{
			TemplateBinding symbol_601 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_601.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_602 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_602.setFormal(symbol_44);	
				symbol_602.setActual(symbol_20);	
				symbol_601.getParameterSubstitutions().add(symbol_602);
			}
			symbol_138.getTemplateBindings().add(symbol_601);
		}
		symbol_138.getSuperClasses().add(symbol_113);
		symbol_97.getOwnedTypes().add(symbol_138);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|OclVoid]
		//
		symbol_139.setName("NonOrderedCollection");
		symbol_139.setElementType(symbol_58);
		{
			TemplateBinding symbol_603 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_603.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_604 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_604.setFormal(symbol_44);	
				symbol_604.setActual(symbol_58);	
				symbol_603.getParameterSubstitutions().add(symbol_604);
			}
			symbol_139.getTemplateBindings().add(symbol_603);
		}
		symbol_139.getSuperClasses().add(symbol_116);
		symbol_97.getOwnedTypes().add(symbol_139);
		//
		// ocl::orphanage::NonUniqueCollection ocl|NonUniqueCollection[String]
		//
		symbol_140.setName("NonUniqueCollection");
		symbol_140.setElementType(symbol_85);
		{
			TemplateBinding symbol_605 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_605.setSignature(symbol_47);
			{
				TemplateParameterSubstitution symbol_606 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_606.setFormal(symbol_48);	
				symbol_606.setActual(symbol_85);	
				symbol_605.getParameterSubstitutions().add(symbol_606);
			}
			symbol_140.getTemplateBindings().add(symbol_605);
		}
		symbol_140.getSuperClasses().add(symbol_123);
		symbol_97.getOwnedTypes().add(symbol_140);
		//
		// ocl::orphanage::NonUniqueCollection ocl|NonUniqueCollection[ocl|NonOrderedCollection{T}?T]
		//
		symbol_141.setName("NonUniqueCollection");
		symbol_141.setElementType(symbol_45);
		{
			TemplateBinding symbol_607 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_607.setSignature(symbol_47);
			{
				TemplateParameterSubstitution symbol_608 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_608.setFormal(symbol_48);	
				symbol_608.setActual(symbol_45);	
				symbol_607.getParameterSubstitutions().add(symbol_608);
			}
			symbol_141.getTemplateBindings().add(symbol_607);
		}
		symbol_141.getSuperClasses().add(symbol_108);
		symbol_97.getOwnedTypes().add(symbol_141);
		//
		// ocl::orphanage::NonUniqueCollection ocl|NonUniqueCollection[ocl|Sequence{T}?T]
		//
		symbol_142.setName("NonUniqueCollection");
		symbol_142.setElementType(symbol_74);
		{
			TemplateBinding symbol_609 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_609.setSignature(symbol_47);
			{
				TemplateParameterSubstitution symbol_610 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_610.setFormal(symbol_48);	
				symbol_610.setActual(symbol_74);	
				symbol_609.getParameterSubstitutions().add(symbol_610);
			}
			symbol_142.getTemplateBindings().add(symbol_609);
		}
		symbol_142.getSuperClasses().add(symbol_122);
		symbol_97.getOwnedTypes().add(symbol_142);
		//
		// ocl::orphanage::NonUniqueCollection ocl|NonUniqueCollection[ocl|Sequence{T}|flatten{T2}()?T2]
		//
		symbol_143.setName("NonUniqueCollection");
		symbol_143.setElementType(symbol_77);
		{
			TemplateBinding symbol_611 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_611.setSignature(symbol_47);
			{
				TemplateParameterSubstitution symbol_612 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_612.setFormal(symbol_48);	
				symbol_612.setActual(symbol_77);	
				symbol_611.getParameterSubstitutions().add(symbol_612);
			}
			symbol_143.getTemplateBindings().add(symbol_611);
		}
		symbol_143.getSuperClasses().add(symbol_119);
		symbol_97.getOwnedTypes().add(symbol_143);
		//
		// ocl::orphanage::NonUniqueCollection ocl|NonUniqueCollection[ocl|NonUniqueCollection{T}?T]
		//
		symbol_144.setName("NonUniqueCollection");
		symbol_144.setElementType(symbol_49);
		{
			TemplateBinding symbol_613 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_613.setSignature(symbol_47);
			{
				TemplateParameterSubstitution symbol_614 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_614.setFormal(symbol_48);	
				symbol_614.setActual(symbol_49);	
				symbol_613.getParameterSubstitutions().add(symbol_614);
			}
			symbol_144.getTemplateBindings().add(symbol_613);
		}
		symbol_144.getSuperClasses().add(symbol_117);
		symbol_97.getOwnedTypes().add(symbol_144);
		//
		// ocl::orphanage::NonUniqueCollection ocl|NonUniqueCollection[ocl|Bag{T}?T]
		//
		symbol_145.setName("NonUniqueCollection");
		symbol_145.setElementType(symbol_15);
		{
			TemplateBinding symbol_615 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_615.setSignature(symbol_47);
			{
				TemplateParameterSubstitution symbol_616 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_616.setFormal(symbol_48);	
				symbol_616.setActual(symbol_15);	
				symbol_615.getParameterSubstitutions().add(symbol_616);
			}
			symbol_145.getTemplateBindings().add(symbol_615);
		}
		symbol_145.getSuperClasses().add(symbol_104);
		symbol_97.getOwnedTypes().add(symbol_145);
		//
		// ocl::orphanage::NonUniqueCollection ocl|NonUniqueCollection[ocl|Collection{T}?T]
		//
		symbol_146.setName("NonUniqueCollection");
		symbol_146.setElementType(symbol_24);
		{
			TemplateBinding symbol_617 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_617.setSignature(symbol_47);
			{
				TemplateParameterSubstitution symbol_618 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_618.setFormal(symbol_48);	
				symbol_618.setActual(symbol_24);	
				symbol_617.getParameterSubstitutions().add(symbol_618);
			}
			symbol_146.getTemplateBindings().add(symbol_617);
		}
		symbol_146.getSuperClasses().add(symbol_110);
		symbol_97.getOwnedTypes().add(symbol_146);
		//
		// ocl::orphanage::NonUniqueCollection ocl|NonUniqueCollection[ocl|Bag{T}|flatten{T2}()?T2]
		//
		symbol_147.setName("NonUniqueCollection");
		symbol_147.setElementType(symbol_18);
		{
			TemplateBinding symbol_619 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_619.setSignature(symbol_47);
			{
				TemplateParameterSubstitution symbol_620 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_620.setFormal(symbol_48);	
				symbol_620.setActual(symbol_18);	
				symbol_619.getParameterSubstitutions().add(symbol_620);
			}
			symbol_147.getTemplateBindings().add(symbol_619);
		}
		symbol_147.getSuperClasses().add(symbol_103);
		symbol_97.getOwnedTypes().add(symbol_147);
		//
		// ocl::orphanage::NonUniqueCollection ocl|NonUniqueCollection[ocl|OrderedCollection{T}?T]
		//
		symbol_148.setName("NonUniqueCollection");
		symbol_148.setElementType(symbol_62);
		{
			TemplateBinding symbol_621 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_621.setSignature(symbol_47);
			{
				TemplateParameterSubstitution symbol_622 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_622.setFormal(symbol_48);	
				symbol_622.setActual(symbol_62);	
				symbol_621.getParameterSubstitutions().add(symbol_622);
			}
			symbol_148.getTemplateBindings().add(symbol_621);
		}
		symbol_148.getSuperClasses().add(symbol_112);
		symbol_97.getOwnedTypes().add(symbol_148);
		//
		// ocl::orphanage::OrderedCollection ocl|OrderedCollection[ocl|Collection{T}?T]
		//
		symbol_149.setName("OrderedCollection");
		symbol_149.setElementType(symbol_24);
		{
			TemplateBinding symbol_623 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_623.setSignature(symbol_60);
			{
				TemplateParameterSubstitution symbol_624 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_624.setFormal(symbol_61);	
				symbol_624.setActual(symbol_24);	
				symbol_623.getParameterSubstitutions().add(symbol_624);
			}
			symbol_149.getTemplateBindings().add(symbol_623);
		}
		symbol_149.getSuperClasses().add(symbol_110);
		symbol_97.getOwnedTypes().add(symbol_149);
		//
		// ocl::orphanage::OrderedCollection ocl|OrderedCollection[ocl|OrderedSet{T}?T]
		//
		symbol_150.setName("OrderedCollection");
		symbol_150.setElementType(symbol_66);
		{
			TemplateBinding symbol_625 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_625.setSignature(symbol_60);
			{
				TemplateParameterSubstitution symbol_626 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_626.setFormal(symbol_61);	
				symbol_626.setActual(symbol_66);	
				symbol_625.getParameterSubstitutions().add(symbol_626);
			}
			symbol_150.getTemplateBindings().add(symbol_625);
		}
		symbol_150.getSuperClasses().add(symbol_105);
		symbol_97.getOwnedTypes().add(symbol_150);
		//
		// ocl::orphanage::OrderedCollection ocl|OrderedCollection[String]
		//
		symbol_151.setName("OrderedCollection");
		symbol_151.setElementType(symbol_85);
		{
			TemplateBinding symbol_627 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_627.setSignature(symbol_60);
			{
				TemplateParameterSubstitution symbol_628 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_628.setFormal(symbol_61);	
				symbol_628.setActual(symbol_85);	
				symbol_627.getParameterSubstitutions().add(symbol_628);
			}
			symbol_151.getTemplateBindings().add(symbol_627);
		}
		symbol_151.getSuperClasses().add(symbol_123);
		symbol_97.getOwnedTypes().add(symbol_151);
		//
		// ocl::orphanage::OrderedCollection ocl|OrderedCollection[ocl|UniqueCollection{T}?T]
		//
		symbol_152.setName("OrderedCollection");
		symbol_152.setElementType(symbol_95);
		{
			TemplateBinding symbol_629 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_629.setSignature(symbol_60);
			{
				TemplateParameterSubstitution symbol_630 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_630.setFormal(symbol_61);	
				symbol_630.setActual(symbol_95);	
				symbol_629.getParameterSubstitutions().add(symbol_630);
			}
			symbol_152.getTemplateBindings().add(symbol_629);
		}
		symbol_152.getSuperClasses().add(symbol_125);
		symbol_97.getOwnedTypes().add(symbol_152);
		//
		// ocl::orphanage::OrderedCollection ocl|OrderedCollection[ocl|Sequence{T}|flatten{T2}()?T2]
		//
		symbol_153.setName("OrderedCollection");
		symbol_153.setElementType(symbol_77);
		{
			TemplateBinding symbol_631 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_631.setSignature(symbol_60);
			{
				TemplateParameterSubstitution symbol_632 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_632.setFormal(symbol_61);	
				symbol_632.setActual(symbol_77);	
				symbol_631.getParameterSubstitutions().add(symbol_632);
			}
			symbol_153.getTemplateBindings().add(symbol_631);
		}
		symbol_153.getSuperClasses().add(symbol_119);
		symbol_97.getOwnedTypes().add(symbol_153);
		//
		// ocl::orphanage::OrderedCollection ocl|OrderedCollection[ocl|Sequence{T}?T]
		//
		symbol_154.setName("OrderedCollection");
		symbol_154.setElementType(symbol_74);
		{
			TemplateBinding symbol_633 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_633.setSignature(symbol_60);
			{
				TemplateParameterSubstitution symbol_634 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_634.setFormal(symbol_61);	
				symbol_634.setActual(symbol_74);	
				symbol_633.getParameterSubstitutions().add(symbol_634);
			}
			symbol_154.getTemplateBindings().add(symbol_633);
		}
		symbol_154.getSuperClasses().add(symbol_122);
		symbol_97.getOwnedTypes().add(symbol_154);
		//
		// ocl::orphanage::OrderedCollection ocl|OrderedCollection[ocl|NonUniqueCollection{T}?T]
		//
		symbol_155.setName("OrderedCollection");
		symbol_155.setElementType(symbol_49);
		{
			TemplateBinding symbol_635 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_635.setSignature(symbol_60);
			{
				TemplateParameterSubstitution symbol_636 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_636.setFormal(symbol_61);	
				symbol_636.setActual(symbol_49);	
				symbol_635.getParameterSubstitutions().add(symbol_636);
			}
			symbol_155.getTemplateBindings().add(symbol_635);
		}
		symbol_155.getSuperClasses().add(symbol_117);
		symbol_97.getOwnedTypes().add(symbol_155);
		//
		// ocl::orphanage::OrderedCollection ocl|OrderedCollection[ocl|OrderedCollection{T}?T]
		//
		symbol_156.setName("OrderedCollection");
		symbol_156.setElementType(symbol_62);
		{
			TemplateBinding symbol_637 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_637.setSignature(symbol_60);
			{
				TemplateParameterSubstitution symbol_638 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_638.setFormal(symbol_61);	
				symbol_638.setActual(symbol_62);	
				symbol_637.getParameterSubstitutions().add(symbol_638);
			}
			symbol_156.getTemplateBindings().add(symbol_637);
		}
		symbol_156.getSuperClasses().add(symbol_112);
		symbol_97.getOwnedTypes().add(symbol_156);
		//
		// ocl::orphanage::OrderedSet ocl|OrderedSet[ocl|OrderedSet{T}?T]
		//
		symbol_157.setName("OrderedSet");
		symbol_157.setElementType(symbol_66);
		{
			TemplateBinding symbol_639 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_639.setSignature(symbol_64);
			{
				TemplateParameterSubstitution symbol_640 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_640.setFormal(symbol_65);	
				symbol_640.setActual(symbol_66);	
				symbol_639.getParameterSubstitutions().add(symbol_640);
			}
			symbol_157.getTemplateBindings().add(symbol_639);
		}
		symbol_157.getSuperClasses().add(symbol_150);
		symbol_157.getSuperClasses().add(symbol_190);
		symbol_97.getOwnedTypes().add(symbol_157);
		//
		// ocl::orphanage::OrderedSet ocl|OrderedSet[ocl|Collection{T}?T]
		//
		symbol_158.setName("OrderedSet");
		symbol_158.setElementType(symbol_24);
		{
			TemplateBinding symbol_641 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_641.setSignature(symbol_64);
			{
				TemplateParameterSubstitution symbol_642 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_642.setFormal(symbol_65);	
				symbol_642.setActual(symbol_24);	
				symbol_641.getParameterSubstitutions().add(symbol_642);
			}
			symbol_158.getTemplateBindings().add(symbol_641);
		}
		symbol_158.getSuperClasses().add(symbol_149);
		symbol_158.getSuperClasses().add(symbol_185);
		symbol_97.getOwnedTypes().add(symbol_158);
		//
		// ocl::orphanage::OrderedSet ocl|OrderedSet[ocl|OrderedCollection{T}?T]
		//
		symbol_159.setName("OrderedSet");
		symbol_159.setElementType(symbol_62);
		{
			TemplateBinding symbol_643 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_643.setSignature(symbol_64);
			{
				TemplateParameterSubstitution symbol_644 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_644.setFormal(symbol_65);	
				symbol_644.setActual(symbol_62);	
				symbol_643.getParameterSubstitutions().add(symbol_644);
			}
			symbol_159.getTemplateBindings().add(symbol_643);
		}
		symbol_159.getSuperClasses().add(symbol_156);
		symbol_159.getSuperClasses().add(symbol_193);
		symbol_97.getOwnedTypes().add(symbol_159);
		//
		// ocl::orphanage::OrderedSet ocl|OrderedSet[ocl|UniqueCollection{T}?T]
		//
		symbol_160.setName("OrderedSet");
		symbol_160.setElementType(symbol_95);
		{
			TemplateBinding symbol_645 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_645.setSignature(symbol_64);
			{
				TemplateParameterSubstitution symbol_646 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_646.setFormal(symbol_65);	
				symbol_646.setActual(symbol_95);	
				symbol_645.getParameterSubstitutions().add(symbol_646);
			}
			symbol_160.getTemplateBindings().add(symbol_645);
		}
		symbol_160.getSuperClasses().add(symbol_189);
		symbol_160.getSuperClasses().add(symbol_152);
		symbol_97.getOwnedTypes().add(symbol_160);
		//
		// ocl::orphanage::Sequence ocl|Sequence[ocl|Collection{T}?T]
		//
		symbol_161.setName("Sequence");
		symbol_161.setElementType(symbol_24);
		{
			TemplateBinding symbol_647 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_647.setSignature(symbol_72);
			{
				TemplateParameterSubstitution symbol_648 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_648.setFormal(symbol_73);	
				symbol_648.setActual(symbol_24);	
				symbol_647.getParameterSubstitutions().add(symbol_648);
			}
			symbol_161.getTemplateBindings().add(symbol_647);
		}
		symbol_161.getSuperClasses().add(symbol_149);
		symbol_161.getSuperClasses().add(symbol_146);
		symbol_97.getOwnedTypes().add(symbol_161);
		//
		// ocl::orphanage::Sequence ocl|Sequence[ocl|OrderedCollection{T}?T]
		//
		symbol_162.setName("Sequence");
		symbol_162.setElementType(symbol_62);
		{
			TemplateBinding symbol_649 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_649.setSignature(symbol_72);
			{
				TemplateParameterSubstitution symbol_650 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_650.setFormal(symbol_73);	
				symbol_650.setActual(symbol_62);	
				symbol_649.getParameterSubstitutions().add(symbol_650);
			}
			symbol_162.getTemplateBindings().add(symbol_649);
		}
		symbol_162.getSuperClasses().add(symbol_156);
		symbol_162.getSuperClasses().add(symbol_148);
		symbol_97.getOwnedTypes().add(symbol_162);
		//
		// ocl::orphanage::Sequence ocl|Sequence[String]
		//
		symbol_163.setName("Sequence");
		symbol_163.setElementType(symbol_85);
		{
			TemplateBinding symbol_651 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_651.setSignature(symbol_72);
			{
				TemplateParameterSubstitution symbol_652 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_652.setFormal(symbol_73);	
				symbol_652.setActual(symbol_85);	
				symbol_651.getParameterSubstitutions().add(symbol_652);
			}
			symbol_163.getTemplateBindings().add(symbol_651);
		}
		symbol_163.getSuperClasses().add(symbol_140);
		symbol_163.getSuperClasses().add(symbol_151);
		symbol_97.getOwnedTypes().add(symbol_163);
		//
		// ocl::orphanage::Sequence ocl|Sequence[ocl|Sequence{T}?T]
		//
		symbol_164.setName("Sequence");
		symbol_164.setElementType(symbol_74);
		{
			TemplateBinding symbol_653 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_653.setSignature(symbol_72);
			{
				TemplateParameterSubstitution symbol_654 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_654.setFormal(symbol_73);	
				symbol_654.setActual(symbol_74);	
				symbol_653.getParameterSubstitutions().add(symbol_654);
			}
			symbol_164.getTemplateBindings().add(symbol_653);
		}
		symbol_164.getSuperClasses().add(symbol_142);
		symbol_164.getSuperClasses().add(symbol_154);
		symbol_97.getOwnedTypes().add(symbol_164);
		//
		// ocl::orphanage::Sequence ocl|Sequence[ocl|NonUniqueCollection{T}?T]
		//
		symbol_165.setName("Sequence");
		symbol_165.setElementType(symbol_49);
		{
			TemplateBinding symbol_655 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_655.setSignature(symbol_72);
			{
				TemplateParameterSubstitution symbol_656 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_656.setFormal(symbol_73);	
				symbol_656.setActual(symbol_49);	
				symbol_655.getParameterSubstitutions().add(symbol_656);
			}
			symbol_165.getTemplateBindings().add(symbol_655);
		}
		symbol_165.getSuperClasses().add(symbol_155);
		symbol_165.getSuperClasses().add(symbol_144);
		symbol_97.getOwnedTypes().add(symbol_165);
		//
		// ocl::orphanage::Sequence ocl|Sequence[ocl|Sequence{T}|flatten{T2}()?T2]
		//
		symbol_166.setName("Sequence");
		symbol_166.setElementType(symbol_77);
		{
			TemplateBinding symbol_657 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_657.setSignature(symbol_72);
			{
				TemplateParameterSubstitution symbol_658 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_658.setFormal(symbol_73);	
				symbol_658.setActual(symbol_77);	
				symbol_657.getParameterSubstitutions().add(symbol_658);
			}
			symbol_166.getTemplateBindings().add(symbol_657);
		}
		symbol_166.getSuperClasses().add(symbol_143);
		symbol_166.getSuperClasses().add(symbol_153);
		symbol_97.getOwnedTypes().add(symbol_166);
		//
		// ocl::orphanage::Set ocl|Set[ocl|OrderedSet{T}?T]
		//
		symbol_167.setName("Set");
		symbol_167.setElementType(symbol_66);
		{
			TemplateBinding symbol_659 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_659.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_660 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_660.setFormal(symbol_80);	
				symbol_660.setActual(symbol_66);	
				symbol_659.getParameterSubstitutions().add(symbol_660);
			}
			symbol_167.getTemplateBindings().add(symbol_659);
		}
		symbol_167.getSuperClasses().add(symbol_190);
		symbol_167.getSuperClasses().add(symbol_133);
		symbol_97.getOwnedTypes().add(symbol_167);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Collection{T}?T]
		//
		symbol_168.setName("Set");
		symbol_168.setElementType(symbol_24);
		{
			TemplateBinding symbol_661 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_661.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_662 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_662.setFormal(symbol_80);	
				symbol_662.setActual(symbol_24);	
				symbol_661.getParameterSubstitutions().add(symbol_662);
			}
			symbol_168.getTemplateBindings().add(symbol_661);
		}
		symbol_168.getSuperClasses().add(symbol_185);
		symbol_168.getSuperClasses().add(symbol_130);
		symbol_97.getOwnedTypes().add(symbol_168);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Classifier]
		//
		symbol_169.setName("Set");
		symbol_169.setElementType(symbol_20);
		{
			TemplateBinding symbol_663 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_663.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_664 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_664.setFormal(symbol_80);	
				symbol_664.setActual(symbol_20);	
				symbol_663.getParameterSubstitutions().add(symbol_664);
			}
			symbol_169.getTemplateBindings().add(symbol_663);
		}
		symbol_169.getSuperClasses().add(symbol_188);
		symbol_169.getSuperClasses().add(symbol_138);
		symbol_97.getOwnedTypes().add(symbol_169);
		//
		// ocl::orphanage::Set ocl|Set[Boolean]
		//
		symbol_170.setName("Set");
		symbol_170.setElementType(symbol_19);
		{
			TemplateBinding symbol_665 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_665.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_666 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_666.setFormal(symbol_80);	
				symbol_666.setActual(symbol_19);	
				symbol_665.getParameterSubstitutions().add(symbol_666);
			}
			symbol_170.getTemplateBindings().add(symbol_665);
		}
		symbol_170.getSuperClasses().add(symbol_127);
		symbol_170.getSuperClasses().add(symbol_184);
		symbol_97.getOwnedTypes().add(symbol_170);
		//
		// ocl::orphanage::Set ocl|Set[ocl|NonOrderedCollection{T}?T]
		//
		symbol_171.setName("Set");
		symbol_171.setElementType(symbol_45);
		{
			TemplateBinding symbol_667 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_667.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_668 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_668.setFormal(symbol_80);	
				symbol_668.setActual(symbol_45);	
				symbol_667.getParameterSubstitutions().add(symbol_668);
			}
			symbol_171.getTemplateBindings().add(symbol_667);
		}
		symbol_171.getSuperClasses().add(symbol_129);
		symbol_171.getSuperClasses().add(symbol_187);
		symbol_97.getOwnedTypes().add(symbol_171);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Set{T}?T]
		//
		symbol_172.setName("Set");
		symbol_172.setElementType(symbol_81);
		{
			TemplateBinding symbol_669 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_669.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_670 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_670.setFormal(symbol_80);	
				symbol_670.setActual(symbol_81);	
				symbol_669.getParameterSubstitutions().add(symbol_670);
			}
			symbol_172.getTemplateBindings().add(symbol_669);
		}
		symbol_172.getSuperClasses().add(symbol_131);
		symbol_172.getSuperClasses().add(symbol_186);
		symbol_97.getOwnedTypes().add(symbol_172);
		//
		// ocl::orphanage::Set ocl|Set[ocl|OclVoid]
		//
		symbol_173.setName("Set");
		symbol_173.setElementType(symbol_58);
		{
			TemplateBinding symbol_671 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_671.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_672 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_672.setFormal(symbol_80);	
				symbol_672.setActual(symbol_58);	
				symbol_671.getParameterSubstitutions().add(symbol_672);
			}
			symbol_173.getTemplateBindings().add(symbol_671);
		}
		symbol_173.getSuperClasses().add(symbol_139);
		symbol_173.getSuperClasses().add(symbol_183);
		symbol_97.getOwnedTypes().add(symbol_173);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]]
		//
		symbol_174.setName("Set");
		symbol_174.setElementType(symbol_179);
		{
			TemplateBinding symbol_673 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_673.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_674 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_674.setFormal(symbol_80);	
				symbol_674.setActual(symbol_179);	
				symbol_673.getParameterSubstitutions().add(symbol_674);
			}
			symbol_174.getTemplateBindings().add(symbol_673);
		}
		symbol_174.getSuperClasses().add(symbol_181);
		symbol_174.getSuperClasses().add(symbol_128);
		symbol_97.getOwnedTypes().add(symbol_174);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Set{T}|flatten{T2}()?T2]
		//
		symbol_175.setName("Set");
		symbol_175.setElementType(symbol_84);
		{
			TemplateBinding symbol_675 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_675.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_676 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_676.setFormal(symbol_80);	
				symbol_676.setActual(symbol_84);	
				symbol_675.getParameterSubstitutions().add(symbol_676);
			}
			symbol_175.getTemplateBindings().add(symbol_675);
		}
		symbol_175.getSuperClasses().add(symbol_132);
		symbol_175.getSuperClasses().add(symbol_191);
		symbol_97.getOwnedTypes().add(symbol_175);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Enumeration]
		//
		symbol_176.setName("Set");
		symbol_176.setElementType(symbol_40);
		{
			TemplateBinding symbol_677 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_677.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_678 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_678.setFormal(symbol_80);	
				symbol_678.setActual(symbol_40);	
				symbol_677.getParameterSubstitutions().add(symbol_678);
			}
			symbol_176.getTemplateBindings().add(symbol_677);
		}
		symbol_176.getSuperClasses().add(symbol_182);
		symbol_176.getSuperClasses().add(symbol_134);
		symbol_97.getOwnedTypes().add(symbol_176);
		//
		// ocl::orphanage::Set ocl|Set[ocl|OclAny]
		//
		symbol_177.setName("Set");
		symbol_177.setElementType(symbol_50);
		{
			TemplateBinding symbol_679 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_679.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_680 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_680.setFormal(symbol_80);	
				symbol_680.setActual(symbol_50);	
				symbol_679.getParameterSubstitutions().add(symbol_680);
			}
			symbol_177.getTemplateBindings().add(symbol_679);
		}
		symbol_177.getSuperClasses().add(symbol_192);
		symbol_177.getSuperClasses().add(symbol_137);
		symbol_97.getOwnedTypes().add(symbol_177);
		//
		// ocl::orphanage::Set ocl|Set[ocl|OclInvalid]
		//
		symbol_178.setName("Set");
		symbol_178.setElementType(symbol_54);
		{
			TemplateBinding symbol_681 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_681.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_682 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_682.setFormal(symbol_80);	
				symbol_682.setActual(symbol_54);	
				symbol_681.getParameterSubstitutions().add(symbol_682);
			}
			symbol_178.getTemplateBindings().add(symbol_681);
		}
		symbol_178.getSuperClasses().add(symbol_136);
		symbol_178.getSuperClasses().add(symbol_180);
		symbol_97.getOwnedTypes().add(symbol_178);
		//
		// ocl::orphanage::Tuple ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]
		//
		symbol_179.setName("Tuple");
		{
			TemplateBinding symbol_683 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_683.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_684 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_684.setFormal(symbol_90);	
				symbol_684.setActual(symbol_39);	
				symbol_683.getParameterSubstitutions().add(symbol_684);
			}{
				TemplateParameterSubstitution symbol_685 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_685.setFormal(symbol_88);	
				symbol_685.setActual(symbol_24);	
				symbol_683.getParameterSubstitutions().add(symbol_685);
			}
			symbol_179.getTemplateBindings().add(symbol_683);
		}
		symbol_179.getSuperClasses().add(symbol_57);
		symbol_97.getOwnedTypes().add(symbol_179);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|OclInvalid]
		//
		symbol_180.setName("UniqueCollection");
		symbol_180.setElementType(symbol_54);
		{
			TemplateBinding symbol_686 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_686.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_687 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_687.setFormal(symbol_94);	
				symbol_687.setActual(symbol_54);	
				symbol_686.getParameterSubstitutions().add(symbol_687);
			}
			symbol_180.getTemplateBindings().add(symbol_686);
		}
		symbol_180.getSuperClasses().add(symbol_120);
		symbol_97.getOwnedTypes().add(symbol_180);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]]
		//
		symbol_181.setName("UniqueCollection");
		symbol_181.setElementType(symbol_179);
		{
			TemplateBinding symbol_688 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_688.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_689 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_689.setFormal(symbol_94);	
				symbol_689.setActual(symbol_179);	
				symbol_688.getParameterSubstitutions().add(symbol_689);
			}
			symbol_181.getTemplateBindings().add(symbol_688);
		}
		symbol_181.getSuperClasses().add(symbol_111);
		symbol_97.getOwnedTypes().add(symbol_181);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|Enumeration]
		//
		symbol_182.setName("UniqueCollection");
		symbol_182.setElementType(symbol_40);
		{
			TemplateBinding symbol_690 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_690.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_691 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_691.setFormal(symbol_94);	
				symbol_691.setActual(symbol_40);	
				symbol_690.getParameterSubstitutions().add(symbol_691);
			}
			symbol_182.getTemplateBindings().add(symbol_690);
		}
		symbol_182.getSuperClasses().add(symbol_114);
		symbol_97.getOwnedTypes().add(symbol_182);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|OclVoid]
		//
		symbol_183.setName("UniqueCollection");
		symbol_183.setElementType(symbol_58);
		{
			TemplateBinding symbol_692 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_692.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_693 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_693.setFormal(symbol_94);	
				symbol_693.setActual(symbol_58);	
				symbol_692.getParameterSubstitutions().add(symbol_693);
			}
			symbol_183.getTemplateBindings().add(symbol_692);
		}
		symbol_183.getSuperClasses().add(symbol_116);
		symbol_97.getOwnedTypes().add(symbol_183);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[Boolean]
		//
		symbol_184.setName("UniqueCollection");
		symbol_184.setElementType(symbol_19);
		{
			TemplateBinding symbol_694 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_694.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_695 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_695.setFormal(symbol_94);	
				symbol_695.setActual(symbol_19);	
				symbol_694.getParameterSubstitutions().add(symbol_695);
			}
			symbol_184.getTemplateBindings().add(symbol_694);
		}
		symbol_184.getSuperClasses().add(symbol_121);
		symbol_97.getOwnedTypes().add(symbol_184);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|Collection{T}?T]
		//
		symbol_185.setName("UniqueCollection");
		symbol_185.setElementType(symbol_24);
		{
			TemplateBinding symbol_696 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_696.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_697 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_697.setFormal(symbol_94);	
				symbol_697.setActual(symbol_24);	
				symbol_696.getParameterSubstitutions().add(symbol_697);
			}
			symbol_185.getTemplateBindings().add(symbol_696);
		}
		symbol_185.getSuperClasses().add(symbol_110);
		symbol_97.getOwnedTypes().add(symbol_185);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|Set{T}?T]
		//
		symbol_186.setName("UniqueCollection");
		symbol_186.setElementType(symbol_81);
		{
			TemplateBinding symbol_698 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_698.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_699 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_699.setFormal(symbol_94);	
				symbol_699.setActual(symbol_81);	
				symbol_698.getParameterSubstitutions().add(symbol_699);
			}
			symbol_186.getTemplateBindings().add(symbol_698);
		}
		symbol_186.getSuperClasses().add(symbol_118);
		symbol_97.getOwnedTypes().add(symbol_186);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|NonOrderedCollection{T}?T]
		//
		symbol_187.setName("UniqueCollection");
		symbol_187.setElementType(symbol_45);
		{
			TemplateBinding symbol_700 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_700.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_701 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_701.setFormal(symbol_94);	
				symbol_701.setActual(symbol_45);	
				symbol_700.getParameterSubstitutions().add(symbol_701);
			}
			symbol_187.getTemplateBindings().add(symbol_700);
		}
		symbol_187.getSuperClasses().add(symbol_108);
		symbol_97.getOwnedTypes().add(symbol_187);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|Classifier]
		//
		symbol_188.setName("UniqueCollection");
		symbol_188.setElementType(symbol_20);
		{
			TemplateBinding symbol_702 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_702.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_703 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_703.setFormal(symbol_94);	
				symbol_703.setActual(symbol_20);	
				symbol_702.getParameterSubstitutions().add(symbol_703);
			}
			symbol_188.getTemplateBindings().add(symbol_702);
		}
		symbol_188.getSuperClasses().add(symbol_113);
		symbol_97.getOwnedTypes().add(symbol_188);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|UniqueCollection{T}?T]
		//
		symbol_189.setName("UniqueCollection");
		symbol_189.setElementType(symbol_95);
		{
			TemplateBinding symbol_704 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_704.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_705 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_705.setFormal(symbol_94);	
				symbol_705.setActual(symbol_95);	
				symbol_704.getParameterSubstitutions().add(symbol_705);
			}
			symbol_189.getTemplateBindings().add(symbol_704);
		}
		symbol_189.getSuperClasses().add(symbol_125);
		symbol_97.getOwnedTypes().add(symbol_189);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|OrderedSet{T}?T]
		//
		symbol_190.setName("UniqueCollection");
		symbol_190.setElementType(symbol_66);
		{
			TemplateBinding symbol_706 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_706.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_707 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_707.setFormal(symbol_94);	
				symbol_707.setActual(symbol_66);	
				symbol_706.getParameterSubstitutions().add(symbol_707);
			}
			symbol_190.getTemplateBindings().add(symbol_706);
		}
		symbol_190.getSuperClasses().add(symbol_105);
		symbol_97.getOwnedTypes().add(symbol_190);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|Set{T}|flatten{T2}()?T2]
		//
		symbol_191.setName("UniqueCollection");
		symbol_191.setElementType(symbol_84);
		{
			TemplateBinding symbol_708 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_708.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_709 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_709.setFormal(symbol_94);	
				symbol_709.setActual(symbol_84);	
				symbol_708.getParameterSubstitutions().add(symbol_709);
			}
			symbol_191.getTemplateBindings().add(symbol_708);
		}
		symbol_191.getSuperClasses().add(symbol_107);
		symbol_97.getOwnedTypes().add(symbol_191);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|OclAny]
		//
		symbol_192.setName("UniqueCollection");
		symbol_192.setElementType(symbol_50);
		{
			TemplateBinding symbol_710 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_710.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_711 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_711.setFormal(symbol_94);	
				symbol_711.setActual(symbol_50);	
				symbol_710.getParameterSubstitutions().add(symbol_711);
			}
			symbol_192.getTemplateBindings().add(symbol_710);
		}
		symbol_192.getSuperClasses().add(symbol_124);
		symbol_97.getOwnedTypes().add(symbol_192);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|OrderedCollection{T}?T]
		//
		symbol_193.setName("UniqueCollection");
		symbol_193.setElementType(symbol_62);
		{
			TemplateBinding symbol_712 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_712.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_713 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_713.setFormal(symbol_94);	
				symbol_713.setActual(symbol_62);	
				symbol_712.getParameterSubstitutions().add(symbol_713);
			}
			symbol_193.getTemplateBindings().add(symbol_712);
		}
		symbol_193.getSuperClasses().add(symbol_112);
		symbol_97.getOwnedTypes().add(symbol_193);
		symbol_1.getNestedPackages().add(symbol_97);
		return symbol_1;
	}
}
