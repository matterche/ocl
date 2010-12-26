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
 *xx
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
 * $Id: OCLstdlib.java,v 1.1.2.9 2010/12/26 15:20:29 ewillink Exp $
 */
package	org.eclipse.ocl.examples.library.oclstdlib;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.ocl.examples.pivot.*;
import org.eclipse.ocl.examples.pivot.Class;
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
	 *	The static package-of-packages-of-types pivot model of the Standard Library.
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
	public static Package create()
	{
		Package symbol_1 = PivotFactory.eINSTANCE.createPackage(); // ocl
		Precedence symbol_2 = PivotFactory.eINSTANCE.createPrecedence(); // NAVIGATION
		Precedence symbol_3 = PivotFactory.eINSTANCE.createPrecedence(); // ADDITIVE
		Precedence symbol_4 = PivotFactory.eINSTANCE.createPrecedence(); // XOR
		Precedence symbol_5 = PivotFactory.eINSTANCE.createPrecedence(); // OR
		Precedence symbol_6 = PivotFactory.eINSTANCE.createPrecedence(); // UNARY
		Precedence symbol_7 = PivotFactory.eINSTANCE.createPrecedence(); // IMPLIES
		Precedence symbol_8 = PivotFactory.eINSTANCE.createPrecedence(); // RELATIONAL
		Precedence symbol_9 = PivotFactory.eINSTANCE.createPrecedence(); // AND
		Precedence symbol_10 = PivotFactory.eINSTANCE.createPrecedence(); // EQUALITY
		Precedence symbol_11 = PivotFactory.eINSTANCE.createPrecedence(); // MULTIPLICATIVE
		BagType symbol_12 = PivotFactory.eINSTANCE.createBagType(); // ocl|Bag{T}
		TemplateSignature symbol_13 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Bag{T}|
		TypeTemplateParameter symbol_14 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_15 = PivotFactory.eINSTANCE.createClass(); // ocl|Bag{T}?T
		
		TemplateSignature symbol_16 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Bag{T}|flatten{T2}()|
		TypeTemplateParameter symbol_17 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_18 = PivotFactory.eINSTANCE.createClass(); // ocl|Bag{T}|flatten{T2}()?T2
		
		
		PrimitiveType symbol_19 = PivotFactory.eINSTANCE.createPrimitiveType(); // ocl|Boolean
		
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
		
		PrimitiveType symbol_41 = PivotFactory.eINSTANCE.createPrimitiveType(); // ocl|Integer
		
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
		
		
		PrimitiveType symbol_67 = PivotFactory.eINSTANCE.createPrimitiveType(); // ocl|Real
		TemplateSignature symbol_68 = PivotFactory.eINSTANCE.createTemplateSignature(); // ocl|Real|oclAsType{T}(ocl|Classifier)|
		TypeTemplateParameter symbol_69 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_70 = PivotFactory.eINSTANCE.createClass(); // ocl|Real|oclAsType{T}(ocl|Classifier)?T
		
		
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
		
		
		PrimitiveType symbol_85 = PivotFactory.eINSTANCE.createPrimitiveType(); // ocl|String
		
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
		
		
		PrimitiveType symbol_96 = PivotFactory.eINSTANCE.createPrimitiveType(); // ocl|UnlimitedNatural
		
		Package symbol_97 = PivotFactory.eINSTANCE.createPackage(); // ocl|orphanage
		BagType symbol_98 = PivotFactory.eINSTANCE.createBagType(); // ocl|Bag[ocl|Collection{T}?T]
		
		BagType symbol_99 = PivotFactory.eINSTANCE.createBagType(); // ocl|Bag[ocl|Bag{T}|flatten{T2}()?T2]
		
		BagType symbol_100 = PivotFactory.eINSTANCE.createBagType(); // ocl|Bag[ocl|NonOrderedCollection{T}?T]
		
		BagType symbol_101 = PivotFactory.eINSTANCE.createBagType(); // ocl|Bag[ocl|Bag{T}?T]
		
		CollectionType symbol_102 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Collection{T}?T]
		
		CollectionType symbol_103 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|UniqueCollection{T}?T]
		
		CollectionType symbol_104 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]
		
		CollectionType symbol_105 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Collection{T}|includesAll{T2}(ocl|Collection[T2])?T2]
		
		CollectionType symbol_106 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Collection{T}|excludesAll{T2}(ocl|Collection[T2])?T2]
		
		CollectionType symbol_107 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|NonUniqueCollection{T}?T]
		
		CollectionType symbol_108 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|Collection{T}|flatten{T2}()?T2]
		
		CollectionType symbol_109 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|NonOrderedCollection{T}?T]
		
		CollectionType symbol_110 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|Collection[ocl|OrderedCollection{T}?T]
		
		CollectionType symbol_111 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|Set{T}?T]
		
		CollectionType symbol_112 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonOrderedCollection[ocl|Bag{T}?T]
		
		CollectionType symbol_113 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonUniqueCollection[ocl|Bag{T}?T]
		
		CollectionType symbol_114 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|NonUniqueCollection[ocl|Sequence{T}?T]
		
		CollectionType symbol_115 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection[ocl|Collection{T}?T]
		
		CollectionType symbol_116 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection[ocl|OrderedSet{T}?T]
		
		CollectionType symbol_117 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection[ocl|OrderedCollection{T}?T]
		
		CollectionType symbol_118 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|OrderedCollection[ocl|Sequence{T}?T]
		
		OrderedSetType symbol_119 = PivotFactory.eINSTANCE.createOrderedSetType(); // ocl|OrderedSet[ocl|OrderedSet{T}?T]
		
		OrderedSetType symbol_120 = PivotFactory.eINSTANCE.createOrderedSetType(); // ocl|OrderedSet[ocl|OrderedCollection{T}?T]
		
		OrderedSetType symbol_121 = PivotFactory.eINSTANCE.createOrderedSetType(); // ocl|OrderedSet[ocl|Collection{T}?T]
		
		OrderedSetType symbol_122 = PivotFactory.eINSTANCE.createOrderedSetType(); // ocl|OrderedSet[ocl|UniqueCollection{T}?T]
		
		SequenceType symbol_123 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence[ocl|NonUniqueCollection{T}?T]
		
		SequenceType symbol_124 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence[ocl|Collection{T}?T]
		
		SequenceType symbol_125 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence[ocl|String]
		
		SequenceType symbol_126 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence[ocl|OrderedCollection{T}?T]
		
		SequenceType symbol_127 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence[ocl|Sequence{T}?T]
		
		SequenceType symbol_128 = PivotFactory.eINSTANCE.createSequenceType(); // ocl|Sequence[ocl|Sequence{T}|flatten{T2}()?T2]
		
		SetType symbol_129 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Boolean]
		
		SetType symbol_130 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Classifier]
		
		SetType symbol_131 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]]
		
		SetType symbol_132 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|NonOrderedCollection{T}?T]
		
		SetType symbol_133 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Collection{T}?T]
		
		SetType symbol_134 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Set{T}?T]
		
		SetType symbol_135 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|OclVoid]
		
		SetType symbol_136 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|OclAny]
		
		SetType symbol_137 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Enumeration]
		
		SetType symbol_138 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|Set{T}|flatten{T2}()?T2]
		
		SetType symbol_139 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|OrderedSet{T}?T]
		
		SetType symbol_140 = PivotFactory.eINSTANCE.createSetType(); // ocl|Set[ocl|OclInvalid]
		
		Class symbol_141 = PivotFactory.eINSTANCE.createClass(); // ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]
		
		CollectionType symbol_142 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|OrderedSet{T}?T]
		
		CollectionType symbol_143 = PivotFactory.eINSTANCE.createCollectionType(); // ocl|UniqueCollection[ocl|Set{T}?T]
		
		

		symbol_1.setName("ocl");
		symbol_1.setNsPrefix("ocl");
		symbol_1.setNsURI("http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib");
		symbol_2.setName("NAVIGATION");
		symbol_2.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_2);
		symbol_3.setName("ADDITIVE");
		symbol_3.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_3);
		symbol_4.setName("XOR");
		symbol_4.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_4);
		symbol_5.setName("OR");
		symbol_5.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_5);
		symbol_6.setName("UNARY");
		symbol_6.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_6);
		symbol_7.setName("IMPLIES");
		symbol_7.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_7);
		symbol_8.setName("RELATIONAL");
		symbol_8.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_8);
		symbol_9.setName("AND");
		symbol_9.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_9);
		symbol_10.setName("EQUALITY");
		symbol_10.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_10);
		symbol_11.setName("MULTIPLICATIVE");
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
		symbol_12.getSuperClasses().add(symbol_113);
		symbol_12.getSuperClasses().add(symbol_112);
		{	// ocl::Bag::<>() ocl|Bag{T}|<>(ocl|OclAny)
			Operation symbol_144 = PivotFactory.eINSTANCE.createOperation();
			symbol_144.setName("<>");
			symbol_144.setType(symbol_19);
			Parameter symbol_145 = PivotFactory.eINSTANCE.createParameter();
			symbol_145.setName("object2");
			symbol_145.setType(symbol_50);
			symbol_144.getOwnedParameters().add(symbol_145);
			symbol_144.setPrecedence(symbol_10);
			symbol_144.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_144);
		}
		{	// ocl::Bag::=() ocl|Bag{T}|=(ocl|OclAny)
			Operation symbol_146 = PivotFactory.eINSTANCE.createOperation();
			symbol_146.setName("=");
			symbol_146.setType(symbol_19);
			Parameter symbol_147 = PivotFactory.eINSTANCE.createParameter();
			symbol_147.setName("object2");
			symbol_147.setType(symbol_50);
			symbol_146.getOwnedParameters().add(symbol_147);
			symbol_146.setPrecedence(symbol_10);
			symbol_146.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_146);
		}
		{	// ocl::Bag::excluding() ocl|Bag{T}|excluding(ocl|OclAny)
			Operation symbol_148 = PivotFactory.eINSTANCE.createOperation();
			symbol_148.setName("excluding");
			symbol_148.setType(symbol_101);
			Parameter symbol_149 = PivotFactory.eINSTANCE.createParameter();
			symbol_149.setName("object");
			symbol_149.setType(symbol_50);
			symbol_148.getOwnedParameters().add(symbol_149);
			symbol_148.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_148);
		}
		{	// ocl::Bag::flatten() ocl|Bag{T}|flatten{T2}()
			Operation symbol_150 = PivotFactory.eINSTANCE.createOperation();
			symbol_18.setName("T2");
			symbol_17.setOwnedParameteredElement(symbol_18);
			symbol_16.getOwnedParameters().add(symbol_17);
			
			symbol_150.setOwnedTemplateSignature(symbol_16);
			symbol_150.setName("flatten");
			symbol_150.setType(symbol_99);
			symbol_150.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_150);
		}
		{	// ocl::Bag::including() ocl|Bag{T}|including(ocl|Bag{T}?T)
			Operation symbol_151 = PivotFactory.eINSTANCE.createOperation();
			symbol_151.setName("including");
			symbol_151.setType(symbol_101);
			Parameter symbol_152 = PivotFactory.eINSTANCE.createParameter();
			symbol_152.setName("object");
			symbol_152.setType(symbol_15);
			symbol_151.getOwnedParameters().add(symbol_152);
			symbol_151.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_151);
		}
		{	// ocl::Bag::reject() ocl|Bag{T}|reject(ocl|Bag{T}?T)
			Iteration symbol_153 = PivotFactory.eINSTANCE.createIteration();
			symbol_153.setName("reject");
			symbol_153.setType(symbol_101);
			Parameter symbol_154 = PivotFactory.eINSTANCE.createParameter();
			symbol_154.setName("i");
			symbol_154.setType(symbol_15);
			symbol_153.getOwnedIterators().add(symbol_154);
			symbol_153.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_153);
		}
		{	// ocl::Bag::select() ocl|Bag{T}|select(ocl|Bag{T}?T)
			Iteration symbol_155 = PivotFactory.eINSTANCE.createIteration();
			symbol_155.setName("select");
			symbol_155.setType(symbol_101);
			Parameter symbol_156 = PivotFactory.eINSTANCE.createParameter();
			symbol_156.setName("i");
			symbol_156.setType(symbol_15);
			symbol_155.getOwnedIterators().add(symbol_156);
			symbol_155.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_12.getOwnedOperations().add(symbol_155);
		}
		symbol_1.getOwnedTypes().add(symbol_12);
		//
		// ocl::Boolean ocl|Boolean
		//
		symbol_19.setName("Boolean");
		symbol_19.getSuperClasses().add(symbol_50);
		{	// ocl::Boolean::<>() ocl|Boolean|<>(ocl|OclAny)
			Operation symbol_157 = PivotFactory.eINSTANCE.createOperation();
			symbol_157.setName("<>");
			symbol_157.setType(symbol_19);
			Parameter symbol_158 = PivotFactory.eINSTANCE.createParameter();
			symbol_158.setName("object2");
			symbol_158.setType(symbol_50);
			symbol_157.getOwnedParameters().add(symbol_158);
			symbol_157.setPrecedence(symbol_10);
			symbol_157.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_157);
		}
		{	// ocl::Boolean::=() ocl|Boolean|=(ocl|OclAny)
			Operation symbol_159 = PivotFactory.eINSTANCE.createOperation();
			symbol_159.setName("=");
			symbol_159.setType(symbol_19);
			Parameter symbol_160 = PivotFactory.eINSTANCE.createParameter();
			symbol_160.setName("object2");
			symbol_160.setType(symbol_50);
			symbol_159.getOwnedParameters().add(symbol_160);
			symbol_159.setPrecedence(symbol_10);
			symbol_159.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_159);
		}
		{	// ocl::Boolean::allInstances() ocl|Boolean|allInstances()
			Operation symbol_161 = PivotFactory.eINSTANCE.createOperation();
			symbol_161.setName("allInstances");
			symbol_161.setType(symbol_129);
			symbol_161.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_161);
		}
		{	// ocl::Boolean::and() ocl|Boolean|and(ocl|Boolean)
			Operation symbol_162 = PivotFactory.eINSTANCE.createOperation();
			symbol_162.setName("and");
			symbol_162.setType(symbol_19);
			Parameter symbol_163 = PivotFactory.eINSTANCE.createParameter();
			symbol_163.setName("b");
			symbol_163.setType(symbol_19);
			symbol_162.getOwnedParameters().add(symbol_163);
			symbol_162.setPrecedence(symbol_9);
			symbol_162.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_162);
		}
		{	// ocl::Boolean::implies() ocl|Boolean|implies(ocl|Boolean)
			Operation symbol_164 = PivotFactory.eINSTANCE.createOperation();
			symbol_164.setName("implies");
			symbol_164.setType(symbol_19);
			Parameter symbol_165 = PivotFactory.eINSTANCE.createParameter();
			symbol_165.setName("b");
			symbol_165.setType(symbol_19);
			symbol_164.getOwnedParameters().add(symbol_165);
			symbol_164.setPrecedence(symbol_7);
			symbol_164.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_164);
		}
		{	// ocl::Boolean::not() ocl|Boolean|not()
			Operation symbol_166 = PivotFactory.eINSTANCE.createOperation();
			symbol_166.setName("not");
			symbol_166.setType(symbol_19);
			symbol_166.setPrecedence(symbol_6);
			symbol_166.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_166);
		}
		{	// ocl::Boolean::or() ocl|Boolean|or(ocl|Boolean)
			Operation symbol_167 = PivotFactory.eINSTANCE.createOperation();
			symbol_167.setName("or");
			symbol_167.setType(symbol_19);
			Parameter symbol_168 = PivotFactory.eINSTANCE.createParameter();
			symbol_168.setName("b");
			symbol_168.setType(symbol_19);
			symbol_167.getOwnedParameters().add(symbol_168);
			symbol_167.setPrecedence(symbol_5);
			symbol_167.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_167);
		}
		{	// ocl::Boolean::toString() ocl|Boolean|toString()
			Operation symbol_169 = PivotFactory.eINSTANCE.createOperation();
			symbol_169.setName("toString");
			symbol_169.setType(symbol_85);
			symbol_169.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_169);
		}
		{	// ocl::Boolean::xor() ocl|Boolean|xor(ocl|Boolean)
			Operation symbol_170 = PivotFactory.eINSTANCE.createOperation();
			symbol_170.setName("xor");
			symbol_170.setType(symbol_19);
			Parameter symbol_171 = PivotFactory.eINSTANCE.createParameter();
			symbol_171.setName("b");
			symbol_171.setType(symbol_19);
			symbol_170.getOwnedParameters().add(symbol_171);
			symbol_170.setPrecedence(symbol_4);
			symbol_170.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_170);
		}
		symbol_1.getOwnedTypes().add(symbol_19);
		//
		// ocl::Classifier ocl|Classifier
		//
		symbol_20.setName("Classifier");
		symbol_20.getSuperClasses().add(symbol_50);
		{	// ocl::Classifier::allInstances() ocl|Classifier|allInstances()
			Operation symbol_172 = PivotFactory.eINSTANCE.createOperation();
			symbol_172.setName("allInstances");
			symbol_172.setType(symbol_130);
			symbol_172.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
			symbol_20.getOwnedOperations().add(symbol_172);
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
			Operation symbol_173 = PivotFactory.eINSTANCE.createOperation();
			symbol_173.setName("<>");
			symbol_173.setType(symbol_19);
			Parameter symbol_174 = PivotFactory.eINSTANCE.createParameter();
			symbol_174.setName("object2");
			symbol_174.setType(symbol_50);
			symbol_173.getOwnedParameters().add(symbol_174);
			symbol_173.setPrecedence(symbol_10);
			symbol_173.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_173);
		}
		{	// ocl::Collection::=() ocl|Collection{T}|=(ocl|OclAny)
			Operation symbol_175 = PivotFactory.eINSTANCE.createOperation();
			symbol_175.setName("=");
			symbol_175.setType(symbol_19);
			Parameter symbol_176 = PivotFactory.eINSTANCE.createParameter();
			symbol_176.setName("object2");
			symbol_176.setType(symbol_50);
			symbol_175.getOwnedParameters().add(symbol_176);
			symbol_175.setPrecedence(symbol_10);
			symbol_175.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_175);
		}
		{	// ocl::Collection::any() ocl|Collection{T}|any(ocl|Collection{T}?T)
			Iteration symbol_177 = PivotFactory.eINSTANCE.createIteration();
			symbol_177.setName("any");
			symbol_177.setType(symbol_24);
			Parameter symbol_178 = PivotFactory.eINSTANCE.createParameter();
			symbol_178.setName("i");
			symbol_178.setType(symbol_24);
			symbol_177.getOwnedIterators().add(symbol_178);
			symbol_177.setImplementation(org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_177);
		}
		{	// ocl::Collection::asBag() ocl|Collection{T}|asBag()
			Operation symbol_179 = PivotFactory.eINSTANCE.createOperation();
			symbol_179.setName("asBag");
			symbol_179.setType(symbol_98);
			symbol_179.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_179);
		}
		{	// ocl::Collection::asOrderedSet() ocl|Collection{T}|asOrderedSet()
			Operation symbol_180 = PivotFactory.eINSTANCE.createOperation();
			symbol_180.setName("asOrderedSet");
			symbol_180.setType(symbol_121);
			symbol_180.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_180);
		}
		{	// ocl::Collection::asSequence() ocl|Collection{T}|asSequence()
			Operation symbol_181 = PivotFactory.eINSTANCE.createOperation();
			symbol_181.setName("asSequence");
			symbol_181.setType(symbol_124);
			symbol_181.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_181);
		}
		{	// ocl::Collection::asSet() ocl|Collection{T}|asSet()
			Operation symbol_182 = PivotFactory.eINSTANCE.createOperation();
			symbol_182.setName("asSet");
			symbol_182.setType(symbol_133);
			symbol_182.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_182);
		}
		{	// ocl::Collection::collect() ocl|Collection{T}|collect(ocl|Collection{T}?T)
			Iteration symbol_183 = PivotFactory.eINSTANCE.createIteration();
			symbol_183.setName("collect");
			symbol_183.setType(symbol_102);
			Parameter symbol_184 = PivotFactory.eINSTANCE.createParameter();
			symbol_184.setName("i");
			symbol_184.setType(symbol_24);
			symbol_183.getOwnedIterators().add(symbol_184);
			symbol_183.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_183);
		}
		{	// ocl::Collection::collectNested() ocl|Collection{T}|collectNested(ocl|Collection{T}?T)
			Iteration symbol_185 = PivotFactory.eINSTANCE.createIteration();
			symbol_185.setName("collectNested");
			symbol_185.setType(symbol_102);
			Parameter symbol_186 = PivotFactory.eINSTANCE.createParameter();
			symbol_186.setName("i");
			symbol_186.setType(symbol_24);
			symbol_185.getOwnedIterators().add(symbol_186);
			symbol_185.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_185);
		}
		{	// ocl::Collection::count() ocl|Collection{T}|count(ocl|OclAny)
			Operation symbol_187 = PivotFactory.eINSTANCE.createOperation();
			symbol_187.setName("count");
			symbol_187.setType(symbol_41);
			Parameter symbol_188 = PivotFactory.eINSTANCE.createParameter();
			symbol_188.setName("object");
			symbol_188.setType(symbol_50);
			symbol_187.getOwnedParameters().add(symbol_188);
			symbol_187.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_187);
		}
		{	// ocl::Collection::excludes() ocl|Collection{T}|excludes(ocl|OclAny)
			Operation symbol_189 = PivotFactory.eINSTANCE.createOperation();
			symbol_189.setName("excludes");
			symbol_189.setType(symbol_19);
			Parameter symbol_190 = PivotFactory.eINSTANCE.createParameter();
			symbol_190.setName("object");
			symbol_190.setType(symbol_50);
			symbol_189.getOwnedParameters().add(symbol_190);
			symbol_189.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_189);
		}
		{	// ocl::Collection::excludesAll() ocl|Collection{T}|excludesAll{T2}(ocl|Collection[T2])
			Operation symbol_191 = PivotFactory.eINSTANCE.createOperation();
			symbol_27.setName("T2");
			symbol_26.setOwnedParameteredElement(symbol_27);
			symbol_25.getOwnedParameters().add(symbol_26);
			
			symbol_191.setOwnedTemplateSignature(symbol_25);
			symbol_191.setName("excludesAll");
			symbol_191.setType(symbol_19);
			Parameter symbol_192 = PivotFactory.eINSTANCE.createParameter();
			symbol_192.setName("c2");
			symbol_192.setType(symbol_106);
			symbol_191.getOwnedParameters().add(symbol_192);
			symbol_191.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_191);
		}
		{	// ocl::Collection::excluding() ocl|Collection{T}|excluding(ocl|OclAny)
			Operation symbol_193 = PivotFactory.eINSTANCE.createOperation();
			symbol_193.setName("excluding");
			symbol_193.setType(symbol_102);
			Parameter symbol_194 = PivotFactory.eINSTANCE.createParameter();
			symbol_194.setName("object");
			symbol_194.setType(symbol_50);
			symbol_193.getOwnedParameters().add(symbol_194);
			symbol_193.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_193);
		}
		{	// ocl::Collection::exists() ocl|Collection{T}|exists(ocl|Collection{T}?T)
			Iteration symbol_195 = PivotFactory.eINSTANCE.createIteration();
			symbol_195.setName("exists");
			symbol_195.setType(symbol_19);
			Parameter symbol_196 = PivotFactory.eINSTANCE.createParameter();
			symbol_196.setName("i");
			symbol_196.setType(symbol_24);
			symbol_195.getOwnedIterators().add(symbol_196);
			symbol_195.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_195);
		}
		{	// ocl::Collection::exists() ocl|Collection{T}|exists(ocl|Collection{T}?T,T)
			Iteration symbol_197 = PivotFactory.eINSTANCE.createIteration();
			symbol_197.setName("exists");
			symbol_197.setType(symbol_19);
			Parameter symbol_198 = PivotFactory.eINSTANCE.createParameter();
			symbol_198.setName("j");
			symbol_198.setType(symbol_24);
			symbol_197.getOwnedIterators().add(symbol_198);
			Parameter symbol_199 = PivotFactory.eINSTANCE.createParameter();
			symbol_199.setName("i");
			symbol_199.setType(symbol_24);
			symbol_197.getOwnedIterators().add(symbol_199);
			symbol_197.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_197);
		}
		{	// ocl::Collection::flatten() ocl|Collection{T}|flatten{T2}()
			Operation symbol_200 = PivotFactory.eINSTANCE.createOperation();
			symbol_30.setName("T2");
			symbol_29.setOwnedParameteredElement(symbol_30);
			symbol_28.getOwnedParameters().add(symbol_29);
			
			symbol_200.setOwnedTemplateSignature(symbol_28);
			symbol_200.setName("flatten");
			symbol_200.setType(symbol_108);
			symbol_200.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_200);
		}
		{	// ocl::Collection::forAll() ocl|Collection{T}|forAll(ocl|Collection{T}?T)
			Iteration symbol_201 = PivotFactory.eINSTANCE.createIteration();
			symbol_201.setName("forAll");
			symbol_201.setType(symbol_19);
			Parameter symbol_202 = PivotFactory.eINSTANCE.createParameter();
			symbol_202.setName("i");
			symbol_202.setType(symbol_24);
			symbol_201.getOwnedIterators().add(symbol_202);
			symbol_201.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_201);
		}
		{	// ocl::Collection::forAll() ocl|Collection{T}|forAll(ocl|Collection{T}?T,T)
			Iteration symbol_203 = PivotFactory.eINSTANCE.createIteration();
			symbol_203.setName("forAll");
			symbol_203.setType(symbol_19);
			Parameter symbol_204 = PivotFactory.eINSTANCE.createParameter();
			symbol_204.setName("j");
			symbol_204.setType(symbol_24);
			symbol_203.getOwnedIterators().add(symbol_204);
			Parameter symbol_205 = PivotFactory.eINSTANCE.createParameter();
			symbol_205.setName("i");
			symbol_205.setType(symbol_24);
			symbol_203.getOwnedIterators().add(symbol_205);
			symbol_203.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_203);
		}
		{	// ocl::Collection::includes() ocl|Collection{T}|includes(ocl|OclAny)
			Operation symbol_206 = PivotFactory.eINSTANCE.createOperation();
			symbol_206.setName("includes");
			symbol_206.setType(symbol_19);
			Parameter symbol_207 = PivotFactory.eINSTANCE.createParameter();
			symbol_207.setName("object");
			symbol_207.setType(symbol_50);
			symbol_206.getOwnedParameters().add(symbol_207);
			symbol_206.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_206);
		}
		{	// ocl::Collection::includesAll() ocl|Collection{T}|includesAll{T2}(ocl|Collection[T2])
			Operation symbol_208 = PivotFactory.eINSTANCE.createOperation();
			symbol_33.setName("T2");
			symbol_32.setOwnedParameteredElement(symbol_33);
			symbol_31.getOwnedParameters().add(symbol_32);
			
			symbol_208.setOwnedTemplateSignature(symbol_31);
			symbol_208.setName("includesAll");
			symbol_208.setType(symbol_19);
			Parameter symbol_209 = PivotFactory.eINSTANCE.createParameter();
			symbol_209.setName("c2");
			symbol_209.setType(symbol_105);
			symbol_208.getOwnedParameters().add(symbol_209);
			symbol_208.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_208);
		}
		{	// ocl::Collection::including() ocl|Collection{T}|including(ocl|Collection{T}?T)
			Operation symbol_210 = PivotFactory.eINSTANCE.createOperation();
			symbol_210.setName("including");
			symbol_210.setType(symbol_102);
			Parameter symbol_211 = PivotFactory.eINSTANCE.createParameter();
			symbol_211.setName("object");
			symbol_211.setType(symbol_24);
			symbol_210.getOwnedParameters().add(symbol_211);
			symbol_210.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_210);
		}
		{	// ocl::Collection::isEmpty() ocl|Collection{T}|isEmpty()
			Operation symbol_212 = PivotFactory.eINSTANCE.createOperation();
			symbol_212.setName("isEmpty");
			symbol_212.setType(symbol_19);
			symbol_212.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_212);
		}
		{	// ocl::Collection::isUnique() ocl|Collection{T}|isUnique(ocl|Collection{T}?T)
			Iteration symbol_213 = PivotFactory.eINSTANCE.createIteration();
			symbol_213.setName("isUnique");
			symbol_213.setType(symbol_19);
			Parameter symbol_214 = PivotFactory.eINSTANCE.createParameter();
			symbol_214.setName("i");
			symbol_214.setType(symbol_24);
			symbol_213.getOwnedIterators().add(symbol_214);
			symbol_213.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_213);
		}
		{	// ocl::Collection::iterate() ocl|Collection{T}|iterate{Tacc}(ocl|Collection{T}?T;Tacc)
			Iteration symbol_215 = PivotFactory.eINSTANCE.createIteration();
			symbol_36.setName("Tacc");
			symbol_35.setOwnedParameteredElement(symbol_36);
			symbol_34.getOwnedParameters().add(symbol_35);
			
			symbol_215.setOwnedTemplateSignature(symbol_34);
			symbol_215.setName("iterate");
			symbol_215.setType(symbol_36);
			Parameter symbol_216 = PivotFactory.eINSTANCE.createParameter();
			symbol_216.setName("i");
			symbol_216.setType(symbol_24);
			symbol_215.getOwnedIterators().add(symbol_216);
			Parameter symbol_217 = PivotFactory.eINSTANCE.createParameter();
			symbol_217.setName("acc");
			symbol_217.setType(symbol_36);
			symbol_215.getOwnedAccumulators().add(symbol_217);
			symbol_215.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_215);
		}
		{	// ocl::Collection::max() ocl|Collection{T}|max()
			Operation symbol_218 = PivotFactory.eINSTANCE.createOperation();
			symbol_218.setName("max");
			symbol_218.setType(symbol_24);
			symbol_218.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_218);
		}
		{	// ocl::Collection::min() ocl|Collection{T}|min()
			Operation symbol_219 = PivotFactory.eINSTANCE.createOperation();
			symbol_219.setName("min");
			symbol_219.setType(symbol_24);
			symbol_219.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_219);
		}
		{	// ocl::Collection::notEmpty() ocl|Collection{T}|notEmpty()
			Operation symbol_220 = PivotFactory.eINSTANCE.createOperation();
			symbol_220.setName("notEmpty");
			symbol_220.setType(symbol_19);
			symbol_220.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_220);
		}
		{	// ocl::Collection::one() ocl|Collection{T}|one(ocl|Collection{T}?T)
			Iteration symbol_221 = PivotFactory.eINSTANCE.createIteration();
			symbol_221.setName("one");
			symbol_221.setType(symbol_19);
			Parameter symbol_222 = PivotFactory.eINSTANCE.createParameter();
			symbol_222.setName("i");
			symbol_222.setType(symbol_24);
			symbol_221.getOwnedIterators().add(symbol_222);
			symbol_221.setImplementation(org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_221);
		}
		{	// ocl::Collection::product() ocl|Collection{T}|product{T2}(ocl|Collection[T2])
			Operation symbol_223 = PivotFactory.eINSTANCE.createOperation();
			symbol_39.setName("T2");
			symbol_38.setOwnedParameteredElement(symbol_39);
			symbol_37.getOwnedParameters().add(symbol_38);
			
			symbol_223.setOwnedTemplateSignature(symbol_37);
			symbol_223.setName("product");
			symbol_223.setType(symbol_131);
			Parameter symbol_224 = PivotFactory.eINSTANCE.createParameter();
			symbol_224.setName("c2");
			symbol_224.setType(symbol_104);
			symbol_223.getOwnedParameters().add(symbol_224);
			symbol_223.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_223);
		}
		{	// ocl::Collection::reject() ocl|Collection{T}|reject(ocl|Collection{T}?T)
			Iteration symbol_225 = PivotFactory.eINSTANCE.createIteration();
			symbol_225.setName("reject");
			symbol_225.setType(symbol_102);
			Parameter symbol_226 = PivotFactory.eINSTANCE.createParameter();
			symbol_226.setName("i");
			symbol_226.setType(symbol_24);
			symbol_225.getOwnedIterators().add(symbol_226);
			symbol_225.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_225);
		}
		{	// ocl::Collection::select() ocl|Collection{T}|select(ocl|Collection{T}?T)
			Iteration symbol_227 = PivotFactory.eINSTANCE.createIteration();
			symbol_227.setName("select");
			symbol_227.setType(symbol_102);
			Parameter symbol_228 = PivotFactory.eINSTANCE.createParameter();
			symbol_228.setName("i");
			symbol_228.setType(symbol_24);
			symbol_227.getOwnedIterators().add(symbol_228);
			symbol_227.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_227);
		}
		{	// ocl::Collection::size() ocl|Collection{T}|size()
			Operation symbol_229 = PivotFactory.eINSTANCE.createOperation();
			symbol_229.setName("size");
			symbol_229.setType(symbol_41);
			symbol_229.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_229);
		}
		{	// ocl::Collection::sortedBy() ocl|Collection{T}|sortedBy(ocl|Collection{T}?T)
			Iteration symbol_230 = PivotFactory.eINSTANCE.createIteration();
			symbol_230.setName("sortedBy");
			symbol_230.setType(symbol_115);
			Parameter symbol_231 = PivotFactory.eINSTANCE.createParameter();
			symbol_231.setName("i");
			symbol_231.setType(symbol_24);
			symbol_230.getOwnedIterators().add(symbol_231);
			symbol_230.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_230);
		}
		{	// ocl::Collection::sum() ocl|Collection{T}|sum()
			Operation symbol_232 = PivotFactory.eINSTANCE.createOperation();
			symbol_232.setName("sum");
			symbol_232.setType(symbol_24);
			symbol_232.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
			symbol_21.getOwnedOperations().add(symbol_232);
		}
		symbol_1.getOwnedTypes().add(symbol_21);
		//
		// ocl::Enumeration ocl|Enumeration
		//
		symbol_40.setName("Enumeration");
		symbol_40.getSuperClasses().add(symbol_50);
		{	// ocl::Enumeration::allInstances() ocl|Enumeration|allInstances()
			Operation symbol_233 = PivotFactory.eINSTANCE.createOperation();
			symbol_233.setName("allInstances");
			symbol_233.setType(symbol_137);
			symbol_233.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
			symbol_40.getOwnedOperations().add(symbol_233);
		}
		symbol_1.getOwnedTypes().add(symbol_40);
		//
		// ocl::Integer ocl|Integer
		//
		symbol_41.setName("Integer");
		symbol_41.getSuperClasses().add(symbol_67);
		{	// ocl::Integer::*() ocl|Integer|*(ocl|Integer)
			Operation symbol_234 = PivotFactory.eINSTANCE.createOperation();
			symbol_234.setName("*");
			symbol_234.setType(symbol_41);
			Parameter symbol_235 = PivotFactory.eINSTANCE.createParameter();
			symbol_235.setName("i");
			symbol_235.setType(symbol_41);
			symbol_234.getOwnedParameters().add(symbol_235);
			symbol_234.setPrecedence(symbol_11);
			symbol_234.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_234);
		}
		{	// ocl::Integer::+() ocl|Integer|+(ocl|Integer)
			Operation symbol_236 = PivotFactory.eINSTANCE.createOperation();
			symbol_236.setName("+");
			symbol_236.setType(symbol_41);
			Parameter symbol_237 = PivotFactory.eINSTANCE.createParameter();
			symbol_237.setName("i");
			symbol_237.setType(symbol_41);
			symbol_236.getOwnedParameters().add(symbol_237);
			symbol_236.setPrecedence(symbol_3);
			symbol_236.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericPlusOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_236);
		}
		{	// ocl::Integer::-() ocl|Integer|-()
			Operation symbol_238 = PivotFactory.eINSTANCE.createOperation();
			symbol_238.setName("-");
			symbol_238.setType(symbol_41);
			symbol_238.setPrecedence(symbol_6);
			symbol_238.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_238);
		}
		{	// ocl::Integer::-() ocl|Integer|-(ocl|Integer)
			Operation symbol_239 = PivotFactory.eINSTANCE.createOperation();
			symbol_239.setName("-");
			symbol_239.setType(symbol_41);
			Parameter symbol_240 = PivotFactory.eINSTANCE.createParameter();
			symbol_240.setName("i");
			symbol_240.setType(symbol_41);
			symbol_239.getOwnedParameters().add(symbol_240);
			symbol_239.setPrecedence(symbol_3);
			symbol_239.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinusOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_239);
		}
		{	// ocl::Integer::/() ocl|Integer|/(ocl|Integer)
			Operation symbol_241 = PivotFactory.eINSTANCE.createOperation();
			symbol_241.setName("/");
			symbol_241.setType(symbol_67);
			Parameter symbol_242 = PivotFactory.eINSTANCE.createParameter();
			symbol_242.setName("i");
			symbol_242.setType(symbol_41);
			symbol_241.getOwnedParameters().add(symbol_242);
			symbol_241.setPrecedence(symbol_11);
			symbol_241.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_241);
		}
		{	// ocl::Integer::abs() ocl|Integer|abs()
			Operation symbol_243 = PivotFactory.eINSTANCE.createOperation();
			symbol_243.setName("abs");
			symbol_243.setType(symbol_41);
			symbol_243.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_243);
		}
		{	// ocl::Integer::div() ocl|Integer|div(ocl|Integer)
			Operation symbol_244 = PivotFactory.eINSTANCE.createOperation();
			symbol_244.setName("div");
			symbol_244.setType(symbol_41);
			Parameter symbol_245 = PivotFactory.eINSTANCE.createParameter();
			symbol_245.setName("i");
			symbol_245.setType(symbol_41);
			symbol_244.getOwnedParameters().add(symbol_245);
			symbol_244.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_244);
		}
		{	// ocl::Integer::max() ocl|Integer|max(ocl|Integer)
			Operation symbol_246 = PivotFactory.eINSTANCE.createOperation();
			symbol_246.setName("max");
			symbol_246.setType(symbol_41);
			Parameter symbol_247 = PivotFactory.eINSTANCE.createParameter();
			symbol_247.setName("i");
			symbol_247.setType(symbol_41);
			symbol_246.getOwnedParameters().add(symbol_247);
			symbol_246.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_246);
		}
		{	// ocl::Integer::min() ocl|Integer|min(ocl|Integer)
			Operation symbol_248 = PivotFactory.eINSTANCE.createOperation();
			symbol_248.setName("min");
			symbol_248.setType(symbol_41);
			Parameter symbol_249 = PivotFactory.eINSTANCE.createParameter();
			symbol_249.setName("i");
			symbol_249.setType(symbol_41);
			symbol_248.getOwnedParameters().add(symbol_249);
			symbol_248.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_248);
		}
		{	// ocl::Integer::mod() ocl|Integer|mod(ocl|Integer)
			Operation symbol_250 = PivotFactory.eINSTANCE.createOperation();
			symbol_250.setName("mod");
			symbol_250.setType(symbol_41);
			Parameter symbol_251 = PivotFactory.eINSTANCE.createParameter();
			symbol_251.setName("i");
			symbol_251.setType(symbol_41);
			symbol_250.getOwnedParameters().add(symbol_251);
			symbol_250.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_250);
		}
		{	// ocl::Integer::toString() ocl|Integer|toString()
			Operation symbol_252 = PivotFactory.eINSTANCE.createOperation();
			symbol_252.setName("toString");
			symbol_252.setType(symbol_85);
			symbol_252.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_41.getOwnedOperations().add(symbol_252);
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
		symbol_42.getSuperClasses().add(symbol_109);
		{	// ocl::NonOrderedCollection::closure() ocl|NonOrderedCollection{T}|closure(ocl|NonOrderedCollection{T}?T)
			Iteration symbol_253 = PivotFactory.eINSTANCE.createIteration();
			symbol_253.setName("closure");
			symbol_253.setType(symbol_132);
			Parameter symbol_254 = PivotFactory.eINSTANCE.createParameter();
			symbol_254.setName("i");
			symbol_254.setType(symbol_45);
			symbol_253.getOwnedIterators().add(symbol_254);
			symbol_253.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_253);
		}
		{	// ocl::NonOrderedCollection::collect() ocl|NonOrderedCollection{T}|collect(ocl|NonOrderedCollection{T}?T)
			Iteration symbol_255 = PivotFactory.eINSTANCE.createIteration();
			symbol_255.setName("collect");
			symbol_255.setType(symbol_100);
			Parameter symbol_256 = PivotFactory.eINSTANCE.createParameter();
			symbol_256.setName("i");
			symbol_256.setType(symbol_45);
			symbol_255.getOwnedIterators().add(symbol_256);
			symbol_255.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_255);
		}
		{	// ocl::NonOrderedCollection::collectNested() ocl|NonOrderedCollection{T}|collectNested(ocl|NonOrderedCollection{T}?T)
			Iteration symbol_257 = PivotFactory.eINSTANCE.createIteration();
			symbol_257.setName("collectNested");
			symbol_257.setType(symbol_100);
			Parameter symbol_258 = PivotFactory.eINSTANCE.createParameter();
			symbol_258.setName("i");
			symbol_258.setType(symbol_45);
			symbol_257.getOwnedIterators().add(symbol_258);
			symbol_257.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_257);
		}
		{	// ocl::NonOrderedCollection::intersection() ocl|NonOrderedCollection{T}|intersection(ocl|Bag[ocl|NonOrderedCollection{T}?T])
			Operation symbol_259 = PivotFactory.eINSTANCE.createOperation();
			symbol_259.setName("intersection");
			symbol_259.setType(symbol_100);
			Parameter symbol_260 = PivotFactory.eINSTANCE.createParameter();
			symbol_260.setName("bag");
			symbol_260.setType(symbol_100);
			symbol_259.getOwnedParameters().add(symbol_260);
			symbol_259.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_259);
		}
		{	// ocl::NonOrderedCollection::intersection() ocl|NonOrderedCollection{T}|intersection(ocl|Set[ocl|NonOrderedCollection{T}?T])
			Operation symbol_261 = PivotFactory.eINSTANCE.createOperation();
			symbol_261.setName("intersection");
			symbol_261.setType(symbol_132);
			Parameter symbol_262 = PivotFactory.eINSTANCE.createParameter();
			symbol_262.setName("s");
			symbol_262.setType(symbol_132);
			symbol_261.getOwnedParameters().add(symbol_262);
			symbol_261.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_261);
		}
		{	// ocl::NonOrderedCollection::union() ocl|NonOrderedCollection{T}|union(ocl|Bag[ocl|NonOrderedCollection{T}?T])
			Operation symbol_263 = PivotFactory.eINSTANCE.createOperation();
			symbol_263.setName("union");
			symbol_263.setType(symbol_100);
			Parameter symbol_264 = PivotFactory.eINSTANCE.createParameter();
			symbol_264.setName("bag");
			symbol_264.setType(symbol_100);
			symbol_263.getOwnedParameters().add(symbol_264);
			symbol_263.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_263);
		}
		{	// ocl::NonOrderedCollection::union() ocl|NonOrderedCollection{T}|union(ocl|Set[ocl|NonOrderedCollection{T}?T])
			Operation symbol_265 = PivotFactory.eINSTANCE.createOperation();
			symbol_265.setName("union");
			symbol_265.setType(symbol_132);
			Parameter symbol_266 = PivotFactory.eINSTANCE.createParameter();
			symbol_266.setName("s");
			symbol_266.setType(symbol_132);
			symbol_265.getOwnedParameters().add(symbol_266);
			symbol_265.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_42.getOwnedOperations().add(symbol_265);
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
		symbol_46.getSuperClasses().add(symbol_107);
		{	// ocl::NonUniqueCollection::sortedBy() ocl|NonUniqueCollection{T}|sortedBy(ocl|NonUniqueCollection{T}?T)
			Iteration symbol_267 = PivotFactory.eINSTANCE.createIteration();
			symbol_267.setName("sortedBy");
			symbol_267.setType(symbol_123);
			Parameter symbol_268 = PivotFactory.eINSTANCE.createParameter();
			symbol_268.setName("i");
			symbol_268.setType(symbol_49);
			symbol_267.getOwnedIterators().add(symbol_268);
			symbol_267.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_46.getOwnedOperations().add(symbol_267);
		}
		symbol_1.getOwnedTypes().add(symbol_46);
		//
		// ocl::OclAny ocl|OclAny
		//
		symbol_50.setName("OclAny");
		{	// ocl::OclAny::<>() ocl|OclAny|<>(ocl|OclAny)
			Operation symbol_269 = PivotFactory.eINSTANCE.createOperation();
			symbol_269.setName("<>");
			symbol_269.setType(symbol_19);
			Parameter symbol_270 = PivotFactory.eINSTANCE.createParameter();
			symbol_270.setName("object2");
			symbol_270.setType(symbol_50);
			symbol_269.getOwnedParameters().add(symbol_270);
			symbol_269.setPrecedence(symbol_10);
			symbol_269.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_269);
		}
		{	// ocl::OclAny::=() ocl|OclAny|=(ocl|OclAny)
			Operation symbol_271 = PivotFactory.eINSTANCE.createOperation();
			symbol_271.setName("=");
			symbol_271.setType(symbol_19);
			Parameter symbol_272 = PivotFactory.eINSTANCE.createParameter();
			symbol_272.setName("object2");
			symbol_272.setType(symbol_50);
			symbol_271.getOwnedParameters().add(symbol_272);
			symbol_271.setPrecedence(symbol_10);
			symbol_271.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_271);
		}
		{	// ocl::OclAny::oclAsSet() ocl|OclAny|oclAsSet()
			Operation symbol_273 = PivotFactory.eINSTANCE.createOperation();
			symbol_273.setName("oclAsSet");
			symbol_273.setType(symbol_136);
			symbol_273.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_273);
		}
		{	// ocl::OclAny::oclAsType() ocl|OclAny|oclAsType{T}(ocl|Classifier)
			Operation symbol_274 = PivotFactory.eINSTANCE.createOperation();
			symbol_53.setName("T");
			symbol_52.setOwnedParameteredElement(symbol_53);
			symbol_51.getOwnedParameters().add(symbol_52);
			
			symbol_274.setOwnedTemplateSignature(symbol_51);
			symbol_274.setName("oclAsType");
			symbol_274.setType(symbol_53);
			Parameter symbol_275 = PivotFactory.eINSTANCE.createParameter();
			symbol_275.setName("type");
			symbol_275.setType(symbol_20);
			symbol_274.getOwnedParameters().add(symbol_275);
			symbol_274.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_274);
		}
		{	// ocl::OclAny::oclIsInState() ocl|OclAny|oclIsInState(ocl|OclState)
			Operation symbol_276 = PivotFactory.eINSTANCE.createOperation();
			symbol_276.setName("oclIsInState");
			symbol_276.setType(symbol_19);
			Parameter symbol_277 = PivotFactory.eINSTANCE.createParameter();
			symbol_277.setName("statespec");
			symbol_277.setType(symbol_56);
			symbol_276.getOwnedParameters().add(symbol_277);
			symbol_276.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_276);
		}
		{	// ocl::OclAny::oclIsInvalid() ocl|OclAny|oclIsInvalid()
			Operation symbol_278 = PivotFactory.eINSTANCE.createOperation();
			symbol_278.setName("oclIsInvalid");
			symbol_278.setType(symbol_19);
			symbol_278.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_278);
		}
		{	// ocl::OclAny::oclIsKindOf() ocl|OclAny|oclIsKindOf(ocl|Classifier)
			Operation symbol_279 = PivotFactory.eINSTANCE.createOperation();
			symbol_279.setName("oclIsKindOf");
			symbol_279.setType(symbol_19);
			Parameter symbol_280 = PivotFactory.eINSTANCE.createParameter();
			symbol_280.setName("type");
			symbol_280.setType(symbol_20);
			symbol_279.getOwnedParameters().add(symbol_280);
			symbol_279.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_279);
		}
		{	// ocl::OclAny::oclIsNew() ocl|OclAny|oclIsNew()
			Operation symbol_281 = PivotFactory.eINSTANCE.createOperation();
			symbol_281.setName("oclIsNew");
			symbol_281.setType(symbol_19);
			symbol_281.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_281);
		}
		{	// ocl::OclAny::oclIsTypeOf() ocl|OclAny|oclIsTypeOf(ocl|Classifier)
			Operation symbol_282 = PivotFactory.eINSTANCE.createOperation();
			symbol_282.setName("oclIsTypeOf");
			symbol_282.setType(symbol_19);
			Parameter symbol_283 = PivotFactory.eINSTANCE.createParameter();
			symbol_283.setName("type");
			symbol_283.setType(symbol_20);
			symbol_282.getOwnedParameters().add(symbol_283);
			symbol_282.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_282);
		}
		{	// ocl::OclAny::oclIsUndefined() ocl|OclAny|oclIsUndefined()
			Operation symbol_284 = PivotFactory.eINSTANCE.createOperation();
			symbol_284.setName("oclIsUndefined");
			symbol_284.setType(symbol_19);
			symbol_284.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_284);
		}
		{	// ocl::OclAny::oclType() ocl|OclAny|oclType()
			Operation symbol_285 = PivotFactory.eINSTANCE.createOperation();
			symbol_285.setName("oclType");
			symbol_285.setType(symbol_20);
			symbol_285.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_50.getOwnedOperations().add(symbol_285);
		}
		symbol_1.getOwnedTypes().add(symbol_50);
		//
		// ocl::OclInvalid ocl|OclInvalid
		//
		symbol_54.setName("OclInvalid");
		symbol_54.getSuperClasses().add(symbol_58);
		{	// ocl::OclInvalid::<>() ocl|OclInvalid|<>(ocl|OclAny)
			Operation symbol_286 = PivotFactory.eINSTANCE.createOperation();
			symbol_286.setName("<>");
			symbol_286.setType(symbol_19);
			Parameter symbol_287 = PivotFactory.eINSTANCE.createParameter();
			symbol_287.setName("object2");
			symbol_287.setType(symbol_50);
			symbol_286.getOwnedParameters().add(symbol_287);
			symbol_286.setPrecedence(symbol_10);
			symbol_286.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_286);
		}
		{	// ocl::OclInvalid::=() ocl|OclInvalid|=(ocl|OclAny)
			Operation symbol_288 = PivotFactory.eINSTANCE.createOperation();
			symbol_288.setName("=");
			symbol_288.setType(symbol_19);
			Parameter symbol_289 = PivotFactory.eINSTANCE.createParameter();
			symbol_289.setName("object2");
			symbol_289.setType(symbol_50);
			symbol_288.getOwnedParameters().add(symbol_289);
			symbol_288.setPrecedence(symbol_10);
			symbol_288.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_288);
		}
		{	// ocl::OclInvalid::allInstances() ocl|OclInvalid|allInstances()
			Operation symbol_290 = PivotFactory.eINSTANCE.createOperation();
			symbol_290.setName("allInstances");
			symbol_290.setType(symbol_140);
			symbol_290.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_290);
		}
		symbol_1.getOwnedTypes().add(symbol_54);
		//
		// ocl::OclMessage ocl|OclMessage
		//
		symbol_55.setName("OclMessage");
		symbol_55.getSuperClasses().add(symbol_50);
		{	// ocl::OclMessage::hasReturned() ocl|OclMessage|hasReturned()
			Operation symbol_291 = PivotFactory.eINSTANCE.createOperation();
			symbol_291.setName("hasReturned");
			symbol_291.setType(symbol_19);
			symbol_291.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_55.getOwnedOperations().add(symbol_291);
		}
		{	// ocl::OclMessage::isOperationCall() ocl|OclMessage|isOperationCall()
			Operation symbol_292 = PivotFactory.eINSTANCE.createOperation();
			symbol_292.setName("isOperationCall");
			symbol_292.setType(symbol_19);
			symbol_292.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_55.getOwnedOperations().add(symbol_292);
		}
		{	// ocl::OclMessage::isSignalSent() ocl|OclMessage|isSignalSent()
			Operation symbol_293 = PivotFactory.eINSTANCE.createOperation();
			symbol_293.setName("isSignalSent");
			symbol_293.setType(symbol_19);
			symbol_293.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_55.getOwnedOperations().add(symbol_293);
		}
		{	// ocl::OclMessage::result() ocl|OclMessage|result()
			Operation symbol_294 = PivotFactory.eINSTANCE.createOperation();
			symbol_294.setName("result");
			symbol_294.setType(symbol_50);
			symbol_294.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_55.getOwnedOperations().add(symbol_294);
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
			Operation symbol_295 = PivotFactory.eINSTANCE.createOperation();
			symbol_295.setName("<>");
			symbol_295.setType(symbol_19);
			Parameter symbol_296 = PivotFactory.eINSTANCE.createParameter();
			symbol_296.setName("object2");
			symbol_296.setType(symbol_50);
			symbol_295.getOwnedParameters().add(symbol_296);
			symbol_295.setPrecedence(symbol_10);
			symbol_295.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_57.getOwnedOperations().add(symbol_295);
		}
		{	// ocl::OclTuple::=() ocl|OclTuple|=(ocl|OclAny)
			Operation symbol_297 = PivotFactory.eINSTANCE.createOperation();
			symbol_297.setName("=");
			symbol_297.setType(symbol_19);
			Parameter symbol_298 = PivotFactory.eINSTANCE.createParameter();
			symbol_298.setName("object2");
			symbol_298.setType(symbol_50);
			symbol_297.getOwnedParameters().add(symbol_298);
			symbol_297.setPrecedence(symbol_10);
			symbol_297.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_57.getOwnedOperations().add(symbol_297);
		}
		symbol_1.getOwnedTypes().add(symbol_57);
		//
		// ocl::OclVoid ocl|OclVoid
		//
		symbol_58.setName("OclVoid");
		symbol_58.getSuperClasses().add(symbol_50);
		{	// ocl::OclVoid::<>() ocl|OclVoid|<>(ocl|OclAny)
			Operation symbol_299 = PivotFactory.eINSTANCE.createOperation();
			symbol_299.setName("<>");
			symbol_299.setType(symbol_19);
			Parameter symbol_300 = PivotFactory.eINSTANCE.createParameter();
			symbol_300.setName("object2");
			symbol_300.setType(symbol_50);
			symbol_299.getOwnedParameters().add(symbol_300);
			symbol_299.setPrecedence(symbol_10);
			symbol_299.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_299);
		}
		{	// ocl::OclVoid::=() ocl|OclVoid|=(ocl|OclAny)
			Operation symbol_301 = PivotFactory.eINSTANCE.createOperation();
			symbol_301.setName("=");
			symbol_301.setType(symbol_19);
			Parameter symbol_302 = PivotFactory.eINSTANCE.createParameter();
			symbol_302.setName("object2");
			symbol_302.setType(symbol_50);
			symbol_301.getOwnedParameters().add(symbol_302);
			symbol_301.setPrecedence(symbol_10);
			symbol_301.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_301);
		}
		{	// ocl::OclVoid::allInstances() ocl|OclVoid|allInstances()
			Operation symbol_303 = PivotFactory.eINSTANCE.createOperation();
			symbol_303.setName("allInstances");
			symbol_303.setType(symbol_135);
			symbol_303.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_303);
		}
		{	// ocl::OclVoid::and() ocl|OclVoid|and(ocl|Boolean)
			Operation symbol_304 = PivotFactory.eINSTANCE.createOperation();
			symbol_304.setName("and");
			symbol_304.setType(symbol_19);
			Parameter symbol_305 = PivotFactory.eINSTANCE.createParameter();
			symbol_305.setName("b");
			symbol_305.setType(symbol_19);
			symbol_304.getOwnedParameters().add(symbol_305);
			symbol_304.setPrecedence(symbol_9);
			symbol_304.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_304);
		}
		{	// ocl::OclVoid::implies() ocl|OclVoid|implies(ocl|Boolean)
			Operation symbol_306 = PivotFactory.eINSTANCE.createOperation();
			symbol_306.setName("implies");
			symbol_306.setType(symbol_19);
			Parameter symbol_307 = PivotFactory.eINSTANCE.createParameter();
			symbol_307.setName("b");
			symbol_307.setType(symbol_19);
			symbol_306.getOwnedParameters().add(symbol_307);
			symbol_306.setPrecedence(symbol_7);
			symbol_306.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_306);
		}
		{	// ocl::OclVoid::or() ocl|OclVoid|or(ocl|Boolean)
			Operation symbol_308 = PivotFactory.eINSTANCE.createOperation();
			symbol_308.setName("or");
			symbol_308.setType(symbol_19);
			Parameter symbol_309 = PivotFactory.eINSTANCE.createParameter();
			symbol_309.setName("b");
			symbol_309.setType(symbol_19);
			symbol_308.getOwnedParameters().add(symbol_309);
			symbol_308.setPrecedence(symbol_5);
			symbol_308.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE);
			symbol_58.getOwnedOperations().add(symbol_308);
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
		symbol_59.getSuperClasses().add(symbol_110);
		{	// ocl::OrderedCollection::at() ocl|OrderedCollection{T}|at(ocl|Integer)
			Operation symbol_310 = PivotFactory.eINSTANCE.createOperation();
			symbol_310.setName("at");
			symbol_310.setType(symbol_62);
			Parameter symbol_311 = PivotFactory.eINSTANCE.createParameter();
			symbol_311.setName("index");
			symbol_311.setType(symbol_41);
			symbol_310.getOwnedParameters().add(symbol_311);
			symbol_310.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_310);
		}
		{	// ocl::OrderedCollection::closure() ocl|OrderedCollection{T}|closure(ocl|OrderedCollection{T}?T)
			Iteration symbol_312 = PivotFactory.eINSTANCE.createIteration();
			symbol_312.setName("closure");
			symbol_312.setType(symbol_120);
			Parameter symbol_313 = PivotFactory.eINSTANCE.createParameter();
			symbol_313.setName("i");
			symbol_313.setType(symbol_62);
			symbol_312.getOwnedIterators().add(symbol_313);
			symbol_312.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_312);
		}
		{	// ocl::OrderedCollection::collect() ocl|OrderedCollection{T}|collect(ocl|OrderedCollection{T}?T)
			Iteration symbol_314 = PivotFactory.eINSTANCE.createIteration();
			symbol_314.setName("collect");
			symbol_314.setType(symbol_126);
			Parameter symbol_315 = PivotFactory.eINSTANCE.createParameter();
			symbol_315.setName("i");
			symbol_315.setType(symbol_62);
			symbol_314.getOwnedIterators().add(symbol_315);
			symbol_314.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_314);
		}
		{	// ocl::OrderedCollection::collectNested() ocl|OrderedCollection{T}|collectNested(ocl|OrderedCollection{T}?T)
			Iteration symbol_316 = PivotFactory.eINSTANCE.createIteration();
			symbol_316.setName("collectNested");
			symbol_316.setType(symbol_126);
			Parameter symbol_317 = PivotFactory.eINSTANCE.createParameter();
			symbol_317.setName("i");
			symbol_317.setType(symbol_62);
			symbol_316.getOwnedIterators().add(symbol_317);
			symbol_316.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_316);
		}
		{	// ocl::OrderedCollection::first() ocl|OrderedCollection{T}|first()
			Operation symbol_318 = PivotFactory.eINSTANCE.createOperation();
			symbol_318.setName("first");
			symbol_318.setType(symbol_62);
			symbol_318.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_318);
		}
		{	// ocl::OrderedCollection::indexOf() ocl|OrderedCollection{T}|indexOf(ocl|OclAny)
			Operation symbol_319 = PivotFactory.eINSTANCE.createOperation();
			symbol_319.setName("indexOf");
			symbol_319.setType(symbol_41);
			Parameter symbol_320 = PivotFactory.eINSTANCE.createParameter();
			symbol_320.setName("obj");
			symbol_320.setType(symbol_50);
			symbol_319.getOwnedParameters().add(symbol_320);
			symbol_319.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_319);
		}
		{	// ocl::OrderedCollection::last() ocl|OrderedCollection{T}|last()
			Operation symbol_321 = PivotFactory.eINSTANCE.createOperation();
			symbol_321.setName("last");
			symbol_321.setType(symbol_62);
			symbol_321.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_321);
		}
		{	// ocl::OrderedCollection::reverse() ocl|OrderedCollection{T}|reverse()
			Operation symbol_322 = PivotFactory.eINSTANCE.createOperation();
			symbol_322.setName("reverse");
			symbol_322.setType(symbol_117);
			symbol_322.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_59.getOwnedOperations().add(symbol_322);
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
		symbol_63.getSuperClasses().add(symbol_142);
		symbol_63.getSuperClasses().add(symbol_116);
		{	// ocl::OrderedSet::-() ocl|OrderedSet{T}|-(ocl|Set[ocl|OrderedSet{T}?T])
			Operation symbol_323 = PivotFactory.eINSTANCE.createOperation();
			symbol_323.setName("-");
			symbol_323.setType(symbol_119);
			Parameter symbol_324 = PivotFactory.eINSTANCE.createParameter();
			symbol_324.setName("s");
			symbol_324.setType(symbol_139);
			symbol_323.getOwnedParameters().add(symbol_324);
			symbol_323.setPrecedence(symbol_3);
			symbol_323.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_323);
		}
		{	// ocl::OrderedSet::<>() ocl|OrderedSet{T}|<>(ocl|OclAny)
			Operation symbol_325 = PivotFactory.eINSTANCE.createOperation();
			symbol_325.setName("<>");
			symbol_325.setType(symbol_19);
			Parameter symbol_326 = PivotFactory.eINSTANCE.createParameter();
			symbol_326.setName("object2");
			symbol_326.setType(symbol_50);
			symbol_325.getOwnedParameters().add(symbol_326);
			symbol_325.setPrecedence(symbol_10);
			symbol_325.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_325);
		}
		{	// ocl::OrderedSet::=() ocl|OrderedSet{T}|=(ocl|OclAny)
			Operation symbol_327 = PivotFactory.eINSTANCE.createOperation();
			symbol_327.setName("=");
			symbol_327.setType(symbol_19);
			Parameter symbol_328 = PivotFactory.eINSTANCE.createParameter();
			symbol_328.setName("object2");
			symbol_328.setType(symbol_50);
			symbol_327.getOwnedParameters().add(symbol_328);
			symbol_327.setPrecedence(symbol_10);
			symbol_327.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_327);
		}
		{	// ocl::OrderedSet::append() ocl|OrderedSet{T}|append(ocl|OrderedSet{T}?T)
			Operation symbol_329 = PivotFactory.eINSTANCE.createOperation();
			symbol_329.setName("append");
			symbol_329.setType(symbol_119);
			Parameter symbol_330 = PivotFactory.eINSTANCE.createParameter();
			symbol_330.setName("object");
			symbol_330.setType(symbol_66);
			symbol_329.getOwnedParameters().add(symbol_330);
			symbol_329.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_329);
		}
		{	// ocl::OrderedSet::excluding() ocl|OrderedSet{T}|excluding(ocl|OclAny)
			Operation symbol_331 = PivotFactory.eINSTANCE.createOperation();
			symbol_331.setName("excluding");
			symbol_331.setType(symbol_119);
			Parameter symbol_332 = PivotFactory.eINSTANCE.createParameter();
			symbol_332.setName("object");
			symbol_332.setType(symbol_50);
			symbol_331.getOwnedParameters().add(symbol_332);
			symbol_331.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_331);
		}
		{	// ocl::OrderedSet::including() ocl|OrderedSet{T}|including(ocl|OrderedSet{T}?T)
			Operation symbol_333 = PivotFactory.eINSTANCE.createOperation();
			symbol_333.setName("including");
			symbol_333.setType(symbol_119);
			Parameter symbol_334 = PivotFactory.eINSTANCE.createParameter();
			symbol_334.setName("object");
			symbol_334.setType(symbol_66);
			symbol_333.getOwnedParameters().add(symbol_334);
			symbol_333.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_333);
		}
		{	// ocl::OrderedSet::insertAt() ocl|OrderedSet{T}|insertAt(ocl|Integer,ocl|OrderedSet{T}?T)
			Operation symbol_335 = PivotFactory.eINSTANCE.createOperation();
			symbol_335.setName("insertAt");
			symbol_335.setType(symbol_119);
			Parameter symbol_336 = PivotFactory.eINSTANCE.createParameter();
			symbol_336.setName("index");
			symbol_336.setType(symbol_41);
			symbol_335.getOwnedParameters().add(symbol_336);
			Parameter symbol_337 = PivotFactory.eINSTANCE.createParameter();
			symbol_337.setName("object");
			symbol_337.setType(symbol_66);
			symbol_335.getOwnedParameters().add(symbol_337);
			symbol_335.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_335);
		}
		{	// ocl::OrderedSet::intersection() ocl|OrderedSet{T}|intersection(ocl|Set[ocl|OrderedSet{T}?T])
			Operation symbol_338 = PivotFactory.eINSTANCE.createOperation();
			symbol_338.setName("intersection");
			symbol_338.setType(symbol_119);
			Parameter symbol_339 = PivotFactory.eINSTANCE.createParameter();
			symbol_339.setName("o");
			symbol_339.setType(symbol_139);
			symbol_338.getOwnedParameters().add(symbol_339);
			symbol_338.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_338);
		}
		{	// ocl::OrderedSet::prepend() ocl|OrderedSet{T}|prepend(ocl|OrderedSet{T}?T)
			Operation symbol_340 = PivotFactory.eINSTANCE.createOperation();
			symbol_340.setName("prepend");
			symbol_340.setType(symbol_119);
			Parameter symbol_341 = PivotFactory.eINSTANCE.createParameter();
			symbol_341.setName("object");
			symbol_341.setType(symbol_66);
			symbol_340.getOwnedParameters().add(symbol_341);
			symbol_340.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_340);
		}
		{	// ocl::OrderedSet::reject() ocl|OrderedSet{T}|reject(ocl|OrderedSet{T}?T)
			Iteration symbol_342 = PivotFactory.eINSTANCE.createIteration();
			symbol_342.setName("reject");
			symbol_342.setType(symbol_119);
			Parameter symbol_343 = PivotFactory.eINSTANCE.createParameter();
			symbol_343.setName("i");
			symbol_343.setType(symbol_66);
			symbol_342.getOwnedIterators().add(symbol_343);
			symbol_342.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_342);
		}
		{	// ocl::OrderedSet::reverse() ocl|OrderedSet{T}|reverse()
			Operation symbol_344 = PivotFactory.eINSTANCE.createOperation();
			symbol_344.setName("reverse");
			symbol_344.setType(symbol_119);
			symbol_344.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_344);
		}
		{	// ocl::OrderedSet::select() ocl|OrderedSet{T}|select(ocl|OrderedSet{T}?T)
			Iteration symbol_345 = PivotFactory.eINSTANCE.createIteration();
			symbol_345.setName("select");
			symbol_345.setType(symbol_119);
			Parameter symbol_346 = PivotFactory.eINSTANCE.createParameter();
			symbol_346.setName("i");
			symbol_346.setType(symbol_66);
			symbol_345.getOwnedIterators().add(symbol_346);
			symbol_345.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_345);
		}
		{	// ocl::OrderedSet::subOrderedSet() ocl|OrderedSet{T}|subOrderedSet(ocl|Integer,ocl|Integer)
			Operation symbol_347 = PivotFactory.eINSTANCE.createOperation();
			symbol_347.setName("subOrderedSet");
			symbol_347.setType(symbol_119);
			Parameter symbol_348 = PivotFactory.eINSTANCE.createParameter();
			symbol_348.setName("lower");
			symbol_348.setType(symbol_41);
			symbol_347.getOwnedParameters().add(symbol_348);
			Parameter symbol_349 = PivotFactory.eINSTANCE.createParameter();
			symbol_349.setName("upper");
			symbol_349.setType(symbol_41);
			symbol_347.getOwnedParameters().add(symbol_349);
			symbol_347.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_347);
		}
		{	// ocl::OrderedSet::symmetricDifference() ocl|OrderedSet{T}|symmetricDifference(ocl|Set[ocl|OrderedSet{T}?T])
			Operation symbol_350 = PivotFactory.eINSTANCE.createOperation();
			symbol_350.setName("symmetricDifference");
			symbol_350.setType(symbol_119);
			Parameter symbol_351 = PivotFactory.eINSTANCE.createParameter();
			symbol_351.setName("s");
			symbol_351.setType(symbol_139);
			symbol_350.getOwnedParameters().add(symbol_351);
			symbol_350.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_350);
		}
		{	// ocl::OrderedSet::union() ocl|OrderedSet{T}|union(ocl|OrderedSet[ocl|OrderedSet{T}?T])
			Operation symbol_352 = PivotFactory.eINSTANCE.createOperation();
			symbol_352.setName("union");
			symbol_352.setType(symbol_119);
			Parameter symbol_353 = PivotFactory.eINSTANCE.createParameter();
			symbol_353.setName("o");
			symbol_353.setType(symbol_119);
			symbol_352.getOwnedParameters().add(symbol_353);
			symbol_352.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_352);
		}
		{	// ocl::OrderedSet::union() ocl|OrderedSet{T}|union(ocl|Set[ocl|OrderedSet{T}?T])
			Operation symbol_354 = PivotFactory.eINSTANCE.createOperation();
			symbol_354.setName("union");
			symbol_354.setType(symbol_139);
			Parameter symbol_355 = PivotFactory.eINSTANCE.createParameter();
			symbol_355.setName("s");
			symbol_355.setType(symbol_139);
			symbol_354.getOwnedParameters().add(symbol_355);
			symbol_354.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_354);
		}
		symbol_1.getOwnedTypes().add(symbol_63);
		//
		// ocl::Real ocl|Real
		//
		symbol_67.setName("Real");
		symbol_67.getSuperClasses().add(symbol_50);
		{	// ocl::Real::*() ocl|Real|*(ocl|Real)
			Operation symbol_356 = PivotFactory.eINSTANCE.createOperation();
			symbol_356.setName("*");
			symbol_356.setType(symbol_67);
			Parameter symbol_357 = PivotFactory.eINSTANCE.createParameter();
			symbol_357.setName("r");
			symbol_357.setType(symbol_67);
			symbol_356.getOwnedParameters().add(symbol_357);
			symbol_356.setPrecedence(symbol_11);
			symbol_356.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_356);
		}
		{	// ocl::Real::+() ocl|Real|+(ocl|Real)
			Operation symbol_358 = PivotFactory.eINSTANCE.createOperation();
			symbol_358.setName("+");
			symbol_358.setType(symbol_67);
			Parameter symbol_359 = PivotFactory.eINSTANCE.createParameter();
			symbol_359.setName("r");
			symbol_359.setType(symbol_67);
			symbol_358.getOwnedParameters().add(symbol_359);
			symbol_358.setPrecedence(symbol_3);
			symbol_358.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericPlusOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_358);
		}
		{	// ocl::Real::-() ocl|Real|-(ocl|Real)
			Operation symbol_360 = PivotFactory.eINSTANCE.createOperation();
			symbol_360.setName("-");
			symbol_360.setType(symbol_67);
			Parameter symbol_361 = PivotFactory.eINSTANCE.createParameter();
			symbol_361.setName("r");
			symbol_361.setType(symbol_67);
			symbol_360.getOwnedParameters().add(symbol_361);
			symbol_360.setPrecedence(symbol_3);
			symbol_360.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinusOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_360);
		}
		{	// ocl::Real::-() ocl|Real|-()
			Operation symbol_362 = PivotFactory.eINSTANCE.createOperation();
			symbol_362.setName("-");
			symbol_362.setType(symbol_67);
			symbol_362.setPrecedence(symbol_6);
			symbol_362.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_362);
		}
		{	// ocl::Real::/() ocl|Real|/(ocl|Real)
			Operation symbol_363 = PivotFactory.eINSTANCE.createOperation();
			symbol_363.setName("/");
			symbol_363.setType(symbol_67);
			Parameter symbol_364 = PivotFactory.eINSTANCE.createParameter();
			symbol_364.setName("r");
			symbol_364.setType(symbol_67);
			symbol_363.getOwnedParameters().add(symbol_364);
			symbol_363.setPrecedence(symbol_11);
			symbol_363.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_363);
		}
		{	// ocl::Real::<() ocl|Real|<(ocl|Real)
			Operation symbol_365 = PivotFactory.eINSTANCE.createOperation();
			symbol_365.setName("<");
			symbol_365.setType(symbol_19);
			Parameter symbol_366 = PivotFactory.eINSTANCE.createParameter();
			symbol_366.setName("r");
			symbol_366.setType(symbol_67);
			symbol_365.getOwnedParameters().add(symbol_366);
			symbol_365.setPrecedence(symbol_8);
			symbol_365.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_365);
		}
		{	// ocl::Real::<=() ocl|Real|<=(ocl|Real)
			Operation symbol_367 = PivotFactory.eINSTANCE.createOperation();
			symbol_367.setName("<=");
			symbol_367.setType(symbol_19);
			Parameter symbol_368 = PivotFactory.eINSTANCE.createParameter();
			symbol_368.setName("r");
			symbol_368.setType(symbol_67);
			symbol_367.getOwnedParameters().add(symbol_368);
			symbol_367.setPrecedence(symbol_8);
			symbol_367.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_367);
		}
		{	// ocl::Real::<>() ocl|Real|<>(ocl|OclAny)
			Operation symbol_369 = PivotFactory.eINSTANCE.createOperation();
			symbol_369.setName("<>");
			symbol_369.setType(symbol_19);
			Parameter symbol_370 = PivotFactory.eINSTANCE.createParameter();
			symbol_370.setName("object2");
			symbol_370.setType(symbol_50);
			symbol_369.getOwnedParameters().add(symbol_370);
			symbol_369.setPrecedence(symbol_10);
			symbol_369.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_369);
		}
		{	// ocl::Real::=() ocl|Real|=(ocl|OclAny)
			Operation symbol_371 = PivotFactory.eINSTANCE.createOperation();
			symbol_371.setName("=");
			symbol_371.setType(symbol_19);
			Parameter symbol_372 = PivotFactory.eINSTANCE.createParameter();
			symbol_372.setName("object2");
			symbol_372.setType(symbol_50);
			symbol_371.getOwnedParameters().add(symbol_372);
			symbol_371.setPrecedence(symbol_10);
			symbol_371.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_371);
		}
		{	// ocl::Real::>() ocl|Real|>(ocl|Real)
			Operation symbol_373 = PivotFactory.eINSTANCE.createOperation();
			symbol_373.setName(">");
			symbol_373.setType(symbol_19);
			Parameter symbol_374 = PivotFactory.eINSTANCE.createParameter();
			symbol_374.setName("r");
			symbol_374.setType(symbol_67);
			symbol_373.getOwnedParameters().add(symbol_374);
			symbol_373.setPrecedence(symbol_8);
			symbol_373.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_373);
		}
		{	// ocl::Real::>=() ocl|Real|>=(ocl|Real)
			Operation symbol_375 = PivotFactory.eINSTANCE.createOperation();
			symbol_375.setName(">=");
			symbol_375.setType(symbol_19);
			Parameter symbol_376 = PivotFactory.eINSTANCE.createParameter();
			symbol_376.setName("r");
			symbol_376.setType(symbol_67);
			symbol_375.getOwnedParameters().add(symbol_376);
			symbol_375.setPrecedence(symbol_8);
			symbol_375.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_375);
		}
		{	// ocl::Real::abs() ocl|Real|abs()
			Operation symbol_377 = PivotFactory.eINSTANCE.createOperation();
			symbol_377.setName("abs");
			symbol_377.setType(symbol_67);
			symbol_377.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_377);
		}
		{	// ocl::Real::floor() ocl|Real|floor()
			Operation symbol_378 = PivotFactory.eINSTANCE.createOperation();
			symbol_378.setName("floor");
			symbol_378.setType(symbol_41);
			symbol_378.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_378);
		}
		{	// ocl::Real::max() ocl|Real|max(ocl|Real)
			Operation symbol_379 = PivotFactory.eINSTANCE.createOperation();
			symbol_379.setName("max");
			symbol_379.setType(symbol_67);
			Parameter symbol_380 = PivotFactory.eINSTANCE.createParameter();
			symbol_380.setName("r");
			symbol_380.setType(symbol_67);
			symbol_379.getOwnedParameters().add(symbol_380);
			symbol_379.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_379);
		}
		{	// ocl::Real::min() ocl|Real|min(ocl|Real)
			Operation symbol_381 = PivotFactory.eINSTANCE.createOperation();
			symbol_381.setName("min");
			symbol_381.setType(symbol_67);
			Parameter symbol_382 = PivotFactory.eINSTANCE.createParameter();
			symbol_382.setName("r");
			symbol_382.setType(symbol_67);
			symbol_381.getOwnedParameters().add(symbol_382);
			symbol_381.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_381);
		}
		{	// ocl::Real::oclAsType() ocl|Real|oclAsType{T}(ocl|Classifier)
			Operation symbol_383 = PivotFactory.eINSTANCE.createOperation();
			symbol_70.setName("T");
			symbol_69.setOwnedParameteredElement(symbol_70);
			symbol_68.getOwnedParameters().add(symbol_69);
			
			symbol_383.setOwnedTemplateSignature(symbol_68);
			symbol_383.setName("oclAsType");
			symbol_383.setType(symbol_70);
			Parameter symbol_384 = PivotFactory.eINSTANCE.createParameter();
			symbol_384.setName("type");
			symbol_384.setType(symbol_20);
			symbol_383.getOwnedParameters().add(symbol_384);
			symbol_383.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericOclAsTypeOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_383);
		}
		{	// ocl::Real::round() ocl|Real|round()
			Operation symbol_385 = PivotFactory.eINSTANCE.createOperation();
			symbol_385.setName("round");
			symbol_385.setType(symbol_41);
			symbol_385.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_385);
		}
		{	// ocl::Real::toString() ocl|Real|toString()
			Operation symbol_386 = PivotFactory.eINSTANCE.createOperation();
			symbol_386.setName("toString");
			symbol_386.setType(symbol_85);
			symbol_386.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_67.getOwnedOperations().add(symbol_386);
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
		symbol_71.getSuperClasses().add(symbol_118);
		symbol_71.getSuperClasses().add(symbol_114);
		{	// ocl::Sequence::<>() ocl|Sequence{T}|<>(ocl|OclAny)
			Operation symbol_387 = PivotFactory.eINSTANCE.createOperation();
			symbol_387.setName("<>");
			symbol_387.setType(symbol_19);
			Parameter symbol_388 = PivotFactory.eINSTANCE.createParameter();
			symbol_388.setName("object2");
			symbol_388.setType(symbol_50);
			symbol_387.getOwnedParameters().add(symbol_388);
			symbol_387.setPrecedence(symbol_10);
			symbol_387.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_387);
		}
		{	// ocl::Sequence::=() ocl|Sequence{T}|=(ocl|OclAny)
			Operation symbol_389 = PivotFactory.eINSTANCE.createOperation();
			symbol_389.setName("=");
			symbol_389.setType(symbol_19);
			Parameter symbol_390 = PivotFactory.eINSTANCE.createParameter();
			symbol_390.setName("object2");
			symbol_390.setType(symbol_50);
			symbol_389.getOwnedParameters().add(symbol_390);
			symbol_389.setPrecedence(symbol_10);
			symbol_389.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_389);
		}
		{	// ocl::Sequence::append() ocl|Sequence{T}|append(ocl|Sequence{T}?T)
			Operation symbol_391 = PivotFactory.eINSTANCE.createOperation();
			symbol_391.setName("append");
			symbol_391.setType(symbol_127);
			Parameter symbol_392 = PivotFactory.eINSTANCE.createParameter();
			symbol_392.setName("object");
			symbol_392.setType(symbol_74);
			symbol_391.getOwnedParameters().add(symbol_392);
			symbol_391.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_391);
		}
		{	// ocl::Sequence::excluding() ocl|Sequence{T}|excluding(ocl|OclAny)
			Operation symbol_393 = PivotFactory.eINSTANCE.createOperation();
			symbol_393.setName("excluding");
			symbol_393.setType(symbol_127);
			Parameter symbol_394 = PivotFactory.eINSTANCE.createParameter();
			symbol_394.setName("object");
			symbol_394.setType(symbol_50);
			symbol_393.getOwnedParameters().add(symbol_394);
			symbol_393.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_393);
		}
		{	// ocl::Sequence::flatten() ocl|Sequence{T}|flatten{T2}()
			Operation symbol_395 = PivotFactory.eINSTANCE.createOperation();
			symbol_77.setName("T2");
			symbol_76.setOwnedParameteredElement(symbol_77);
			symbol_75.getOwnedParameters().add(symbol_76);
			
			symbol_395.setOwnedTemplateSignature(symbol_75);
			symbol_395.setName("flatten");
			symbol_395.setType(symbol_128);
			symbol_395.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_395);
		}
		{	// ocl::Sequence::including() ocl|Sequence{T}|including(ocl|Sequence{T}?T)
			Operation symbol_396 = PivotFactory.eINSTANCE.createOperation();
			symbol_396.setName("including");
			symbol_396.setType(symbol_127);
			Parameter symbol_397 = PivotFactory.eINSTANCE.createParameter();
			symbol_397.setName("object");
			symbol_397.setType(symbol_74);
			symbol_396.getOwnedParameters().add(symbol_397);
			symbol_396.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_396);
		}
		{	// ocl::Sequence::insertAt() ocl|Sequence{T}|insertAt(ocl|Integer,ocl|Sequence{T}?T)
			Operation symbol_398 = PivotFactory.eINSTANCE.createOperation();
			symbol_398.setName("insertAt");
			symbol_398.setType(symbol_127);
			Parameter symbol_399 = PivotFactory.eINSTANCE.createParameter();
			symbol_399.setName("index");
			symbol_399.setType(symbol_41);
			symbol_398.getOwnedParameters().add(symbol_399);
			Parameter symbol_400 = PivotFactory.eINSTANCE.createParameter();
			symbol_400.setName("object");
			symbol_400.setType(symbol_74);
			symbol_398.getOwnedParameters().add(symbol_400);
			symbol_398.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_398);
		}
		{	// ocl::Sequence::prepend() ocl|Sequence{T}|prepend(ocl|Sequence{T}?T)
			Operation symbol_401 = PivotFactory.eINSTANCE.createOperation();
			symbol_401.setName("prepend");
			symbol_401.setType(symbol_127);
			Parameter symbol_402 = PivotFactory.eINSTANCE.createParameter();
			symbol_402.setName("object");
			symbol_402.setType(symbol_74);
			symbol_401.getOwnedParameters().add(symbol_402);
			symbol_401.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_401);
		}
		{	// ocl::Sequence::reject() ocl|Sequence{T}|reject(ocl|Sequence{T}?T)
			Iteration symbol_403 = PivotFactory.eINSTANCE.createIteration();
			symbol_403.setName("reject");
			symbol_403.setType(symbol_127);
			Parameter symbol_404 = PivotFactory.eINSTANCE.createParameter();
			symbol_404.setName("i");
			symbol_404.setType(symbol_74);
			symbol_403.getOwnedIterators().add(symbol_404);
			symbol_403.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_403);
		}
		{	// ocl::Sequence::reverse() ocl|Sequence{T}|reverse()
			Operation symbol_405 = PivotFactory.eINSTANCE.createOperation();
			symbol_405.setName("reverse");
			symbol_405.setType(symbol_127);
			symbol_405.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_405);
		}
		{	// ocl::Sequence::select() ocl|Sequence{T}|select(ocl|Sequence{T}?T)
			Iteration symbol_406 = PivotFactory.eINSTANCE.createIteration();
			symbol_406.setName("select");
			symbol_406.setType(symbol_127);
			Parameter symbol_407 = PivotFactory.eINSTANCE.createParameter();
			symbol_407.setName("i");
			symbol_407.setType(symbol_74);
			symbol_406.getOwnedIterators().add(symbol_407);
			symbol_406.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_406);
		}
		{	// ocl::Sequence::subSequence() ocl|Sequence{T}|subSequence(ocl|Integer,ocl|Integer)
			Operation symbol_408 = PivotFactory.eINSTANCE.createOperation();
			symbol_408.setName("subSequence");
			symbol_408.setType(symbol_127);
			Parameter symbol_409 = PivotFactory.eINSTANCE.createParameter();
			symbol_409.setName("lower");
			symbol_409.setType(symbol_41);
			symbol_408.getOwnedParameters().add(symbol_409);
			Parameter symbol_410 = PivotFactory.eINSTANCE.createParameter();
			symbol_410.setName("upper");
			symbol_410.setType(symbol_41);
			symbol_408.getOwnedParameters().add(symbol_410);
			symbol_408.setImplementation(org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_408);
		}
		{	// ocl::Sequence::union() ocl|Sequence{T}|union(ocl|Sequence[ocl|Sequence{T}?T])
			Operation symbol_411 = PivotFactory.eINSTANCE.createOperation();
			symbol_411.setName("union");
			symbol_411.setType(symbol_127);
			Parameter symbol_412 = PivotFactory.eINSTANCE.createParameter();
			symbol_412.setName("s");
			symbol_412.setType(symbol_127);
			symbol_411.getOwnedParameters().add(symbol_412);
			symbol_411.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_71.getOwnedOperations().add(symbol_411);
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
		symbol_78.getSuperClasses().add(symbol_143);
		symbol_78.getSuperClasses().add(symbol_111);
		{	// ocl::Set::-() ocl|Set{T}|-(ocl|Set[ocl|OclAny])
			Operation symbol_413 = PivotFactory.eINSTANCE.createOperation();
			symbol_413.setName("-");
			symbol_413.setType(symbol_134);
			Parameter symbol_414 = PivotFactory.eINSTANCE.createParameter();
			symbol_414.setName("s");
			symbol_414.setType(symbol_136);
			symbol_413.getOwnedParameters().add(symbol_414);
			symbol_413.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_413);
		}
		{	// ocl::Set::<>() ocl|Set{T}|<>(ocl|OclAny)
			Operation symbol_415 = PivotFactory.eINSTANCE.createOperation();
			symbol_415.setName("<>");
			symbol_415.setType(symbol_19);
			Parameter symbol_416 = PivotFactory.eINSTANCE.createParameter();
			symbol_416.setName("object2");
			symbol_416.setType(symbol_50);
			symbol_415.getOwnedParameters().add(symbol_416);
			symbol_415.setPrecedence(symbol_10);
			symbol_415.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_415);
		}
		{	// ocl::Set::=() ocl|Set{T}|=(ocl|OclAny)
			Operation symbol_417 = PivotFactory.eINSTANCE.createOperation();
			symbol_417.setName("=");
			symbol_417.setType(symbol_19);
			Parameter symbol_418 = PivotFactory.eINSTANCE.createParameter();
			symbol_418.setName("object2");
			symbol_418.setType(symbol_50);
			symbol_417.getOwnedParameters().add(symbol_418);
			symbol_417.setPrecedence(symbol_10);
			symbol_417.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_417);
		}
		{	// ocl::Set::excluding() ocl|Set{T}|excluding(ocl|OclAny)
			Operation symbol_419 = PivotFactory.eINSTANCE.createOperation();
			symbol_419.setName("excluding");
			symbol_419.setType(symbol_134);
			Parameter symbol_420 = PivotFactory.eINSTANCE.createParameter();
			symbol_420.setName("object");
			symbol_420.setType(symbol_50);
			symbol_419.getOwnedParameters().add(symbol_420);
			symbol_419.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_419);
		}
		{	// ocl::Set::flatten() ocl|Set{T}|flatten{T2}()
			Operation symbol_421 = PivotFactory.eINSTANCE.createOperation();
			symbol_84.setName("T2");
			symbol_83.setOwnedParameteredElement(symbol_84);
			symbol_82.getOwnedParameters().add(symbol_83);
			
			symbol_421.setOwnedTemplateSignature(symbol_82);
			symbol_421.setName("flatten");
			symbol_421.setType(symbol_138);
			symbol_421.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_421);
		}
		{	// ocl::Set::including() ocl|Set{T}|including(ocl|Set{T}?T)
			Operation symbol_422 = PivotFactory.eINSTANCE.createOperation();
			symbol_422.setName("including");
			symbol_422.setType(symbol_134);
			Parameter symbol_423 = PivotFactory.eINSTANCE.createParameter();
			symbol_423.setName("object");
			symbol_423.setType(symbol_81);
			symbol_422.getOwnedParameters().add(symbol_423);
			symbol_422.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_422);
		}
		{	// ocl::Set::intersection() ocl|Set{T}|intersection(ocl|Set[ocl|Set{T}?T])
			Operation symbol_424 = PivotFactory.eINSTANCE.createOperation();
			symbol_424.setName("intersection");
			symbol_424.setType(symbol_134);
			Parameter symbol_425 = PivotFactory.eINSTANCE.createParameter();
			symbol_425.setName("s");
			symbol_425.setType(symbol_134);
			symbol_424.getOwnedParameters().add(symbol_425);
			symbol_424.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_424);
		}
		{	// ocl::Set::reject() ocl|Set{T}|reject(ocl|Set{T}?T)
			Iteration symbol_426 = PivotFactory.eINSTANCE.createIteration();
			symbol_426.setName("reject");
			symbol_426.setType(symbol_134);
			Parameter symbol_427 = PivotFactory.eINSTANCE.createParameter();
			symbol_427.setName("i");
			symbol_427.setType(symbol_81);
			symbol_426.getOwnedIterators().add(symbol_427);
			symbol_426.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_426);
		}
		{	// ocl::Set::select() ocl|Set{T}|select(ocl|Set{T}?T)
			Iteration symbol_428 = PivotFactory.eINSTANCE.createIteration();
			symbol_428.setName("select");
			symbol_428.setType(symbol_134);
			Parameter symbol_429 = PivotFactory.eINSTANCE.createParameter();
			symbol_429.setName("i");
			symbol_429.setType(symbol_81);
			symbol_428.getOwnedIterators().add(symbol_429);
			symbol_428.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_428);
		}
		{	// ocl::Set::symmetricDifference() ocl|Set{T}|symmetricDifference(ocl|Set[ocl|OclAny])
			Operation symbol_430 = PivotFactory.eINSTANCE.createOperation();
			symbol_430.setName("symmetricDifference");
			symbol_430.setType(symbol_134);
			Parameter symbol_431 = PivotFactory.eINSTANCE.createParameter();
			symbol_431.setName("s");
			symbol_431.setType(symbol_136);
			symbol_430.getOwnedParameters().add(symbol_431);
			symbol_430.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_430);
		}
		symbol_1.getOwnedTypes().add(symbol_78);
		//
		// ocl::String ocl|String
		//
		symbol_85.setName("String");
		symbol_85.getSuperClasses().add(symbol_50);
		{	// ocl::String::+() ocl|String|+(ocl|String)
			Operation symbol_432 = PivotFactory.eINSTANCE.createOperation();
			symbol_432.setName("+");
			symbol_432.setType(symbol_85);
			Parameter symbol_433 = PivotFactory.eINSTANCE.createParameter();
			symbol_433.setName("s");
			symbol_433.setType(symbol_85);
			symbol_432.getOwnedParameters().add(symbol_433);
			symbol_432.setPrecedence(symbol_3);
			symbol_432.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_432);
		}
		{	// ocl::String::<() ocl|String|<(ocl|String)
			Operation symbol_434 = PivotFactory.eINSTANCE.createOperation();
			symbol_434.setName("<");
			symbol_434.setType(symbol_19);
			Parameter symbol_435 = PivotFactory.eINSTANCE.createParameter();
			symbol_435.setName("s");
			symbol_435.setType(symbol_85);
			symbol_434.getOwnedParameters().add(symbol_435);
			symbol_434.setPrecedence(symbol_8);
			symbol_434.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_434);
		}
		{	// ocl::String::<=() ocl|String|<=(ocl|String)
			Operation symbol_436 = PivotFactory.eINSTANCE.createOperation();
			symbol_436.setName("<=");
			symbol_436.setType(symbol_19);
			Parameter symbol_437 = PivotFactory.eINSTANCE.createParameter();
			symbol_437.setName("s");
			symbol_437.setType(symbol_85);
			symbol_436.getOwnedParameters().add(symbol_437);
			symbol_436.setPrecedence(symbol_8);
			symbol_436.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_436);
		}
		{	// ocl::String::<>() ocl|String|<>(ocl|OclAny)
			Operation symbol_438 = PivotFactory.eINSTANCE.createOperation();
			symbol_438.setName("<>");
			symbol_438.setType(symbol_19);
			Parameter symbol_439 = PivotFactory.eINSTANCE.createParameter();
			symbol_439.setName("object2");
			symbol_439.setType(symbol_50);
			symbol_438.getOwnedParameters().add(symbol_439);
			symbol_438.setPrecedence(symbol_10);
			symbol_438.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_438);
		}
		{	// ocl::String::=() ocl|String|=(ocl|OclAny)
			Operation symbol_440 = PivotFactory.eINSTANCE.createOperation();
			symbol_440.setName("=");
			symbol_440.setType(symbol_19);
			Parameter symbol_441 = PivotFactory.eINSTANCE.createParameter();
			symbol_441.setName("object2");
			symbol_441.setType(symbol_50);
			symbol_440.getOwnedParameters().add(symbol_441);
			symbol_440.setPrecedence(symbol_10);
			symbol_440.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_440);
		}
		{	// ocl::String::>() ocl|String|>(ocl|String)
			Operation symbol_442 = PivotFactory.eINSTANCE.createOperation();
			symbol_442.setName(">");
			symbol_442.setType(symbol_19);
			Parameter symbol_443 = PivotFactory.eINSTANCE.createParameter();
			symbol_443.setName("s");
			symbol_443.setType(symbol_85);
			symbol_442.getOwnedParameters().add(symbol_443);
			symbol_442.setPrecedence(symbol_8);
			symbol_442.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_442);
		}
		{	// ocl::String::>=() ocl|String|>=(ocl|String)
			Operation symbol_444 = PivotFactory.eINSTANCE.createOperation();
			symbol_444.setName(">=");
			symbol_444.setType(symbol_19);
			Parameter symbol_445 = PivotFactory.eINSTANCE.createParameter();
			symbol_445.setName("s");
			symbol_445.setType(symbol_85);
			symbol_444.getOwnedParameters().add(symbol_445);
			symbol_444.setPrecedence(symbol_8);
			symbol_444.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_444);
		}
		{	// ocl::String::at() ocl|String|at(ocl|Integer)
			Operation symbol_446 = PivotFactory.eINSTANCE.createOperation();
			symbol_446.setName("at");
			symbol_446.setType(symbol_85);
			Parameter symbol_447 = PivotFactory.eINSTANCE.createParameter();
			symbol_447.setName("i");
			symbol_447.setType(symbol_41);
			symbol_446.getOwnedParameters().add(symbol_447);
			symbol_446.setImplementation(org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_446);
		}
		{	// ocl::String::characters() ocl|String|characters()
			Operation symbol_448 = PivotFactory.eINSTANCE.createOperation();
			symbol_448.setName("characters");
			symbol_448.setType(symbol_125);
			symbol_448.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_448);
		}
		{	// ocl::String::concat() ocl|String|concat(ocl|String)
			Operation symbol_449 = PivotFactory.eINSTANCE.createOperation();
			symbol_449.setName("concat");
			symbol_449.setType(symbol_85);
			Parameter symbol_450 = PivotFactory.eINSTANCE.createParameter();
			symbol_450.setName("s");
			symbol_450.setType(symbol_85);
			symbol_449.getOwnedParameters().add(symbol_450);
			symbol_449.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_449);
		}
		{	// ocl::String::equalsIgnoreCase() ocl|String|equalsIgnoreCase(ocl|String)
			Operation symbol_451 = PivotFactory.eINSTANCE.createOperation();
			symbol_451.setName("equalsIgnoreCase");
			symbol_451.setType(symbol_19);
			Parameter symbol_452 = PivotFactory.eINSTANCE.createParameter();
			symbol_452.setName("s");
			symbol_452.setType(symbol_85);
			symbol_451.getOwnedParameters().add(symbol_452);
			symbol_451.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_451);
		}
		{	// ocl::String::indexOf() ocl|String|indexOf(ocl|String)
			Operation symbol_453 = PivotFactory.eINSTANCE.createOperation();
			symbol_453.setName("indexOf");
			symbol_453.setType(symbol_41);
			Parameter symbol_454 = PivotFactory.eINSTANCE.createParameter();
			symbol_454.setName("s");
			symbol_454.setType(symbol_85);
			symbol_453.getOwnedParameters().add(symbol_454);
			symbol_453.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_453);
		}
		{	// ocl::String::size() ocl|String|size()
			Operation symbol_455 = PivotFactory.eINSTANCE.createOperation();
			symbol_455.setName("size");
			symbol_455.setType(symbol_41);
			symbol_455.setImplementation(org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_455);
		}
		{	// ocl::String::substring() ocl|String|substring(ocl|Integer,ocl|Integer)
			Operation symbol_456 = PivotFactory.eINSTANCE.createOperation();
			symbol_456.setName("substring");
			symbol_456.setType(symbol_85);
			Parameter symbol_457 = PivotFactory.eINSTANCE.createParameter();
			symbol_457.setName("lower");
			symbol_457.setType(symbol_41);
			symbol_456.getOwnedParameters().add(symbol_457);
			Parameter symbol_458 = PivotFactory.eINSTANCE.createParameter();
			symbol_458.setName("upper");
			symbol_458.setType(symbol_41);
			symbol_456.getOwnedParameters().add(symbol_458);
			symbol_456.setImplementation(org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_456);
		}
		{	// ocl::String::toBoolean() ocl|String|toBoolean()
			Operation symbol_459 = PivotFactory.eINSTANCE.createOperation();
			symbol_459.setName("toBoolean");
			symbol_459.setType(symbol_19);
			symbol_459.setImplementation(org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_459);
		}
		{	// ocl::String::toInteger() ocl|String|toInteger()
			Operation symbol_460 = PivotFactory.eINSTANCE.createOperation();
			symbol_460.setName("toInteger");
			symbol_460.setType(symbol_41);
			symbol_460.setImplementation(org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_460);
		}
		{	// ocl::String::toLowerCase() ocl|String|toLowerCase()
			Operation symbol_461 = PivotFactory.eINSTANCE.createOperation();
			symbol_461.setName("toLowerCase");
			symbol_461.setType(symbol_85);
			symbol_461.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_461);
		}
		{	// ocl::String::toReal() ocl|String|toReal()
			Operation symbol_462 = PivotFactory.eINSTANCE.createOperation();
			symbol_462.setName("toReal");
			symbol_462.setType(symbol_67);
			symbol_462.setImplementation(org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_462);
		}
		{	// ocl::String::toUpperCase() ocl|String|toUpperCase()
			Operation symbol_463 = PivotFactory.eINSTANCE.createOperation();
			symbol_463.setName("toUpperCase");
			symbol_463.setType(symbol_85);
			symbol_463.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_463);
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
			Property symbol_464 = PivotFactory.eINSTANCE.createProperty();
			symbol_464.setName("first");
			symbol_464.setType(symbol_89);
			symbol_464.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_86.getOwnedAttributes().add(symbol_464);
		}
		{ // ocl::Tuple::second ocl|Tuple{T1,T2}|second
			Property symbol_465 = PivotFactory.eINSTANCE.createProperty();
			symbol_465.setName("second");
			symbol_465.setType(symbol_91);
			symbol_465.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_86.getOwnedAttributes().add(symbol_465);
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
		symbol_92.getSuperClasses().add(symbol_103);
		{	// ocl::UniqueCollection::sortedBy() ocl|UniqueCollection{T}|sortedBy(ocl|UniqueCollection{T}?T)
			Iteration symbol_466 = PivotFactory.eINSTANCE.createIteration();
			symbol_466.setName("sortedBy");
			symbol_466.setType(symbol_122);
			Parameter symbol_467 = PivotFactory.eINSTANCE.createParameter();
			symbol_467.setName("i");
			symbol_467.setType(symbol_95);
			symbol_466.getOwnedIterators().add(symbol_467);
			symbol_466.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_92.getOwnedOperations().add(symbol_466);
		}
		symbol_1.getOwnedTypes().add(symbol_92);
		//
		// ocl::UnlimitedNatural ocl|UnlimitedNatural
		//
		symbol_96.setName("UnlimitedNatural");
		symbol_96.getSuperClasses().add(symbol_41);
		symbol_1.getOwnedTypes().add(symbol_96);
		//
		// ocl::orphanage
		//
		symbol_97.setName("orphanage");
		//
		// ocl::orphanage::Bag ocl|Bag[ocl|Collection{T}?T]
		//
		symbol_98.setName("Bag");
		symbol_98.setElementType(symbol_58);
		{
			TemplateBinding symbol_468 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_468.setSignature(symbol_13);
			{
				TemplateParameterSubstitution symbol_469 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_469.setFormal(symbol_14);	
				symbol_469.setActual(symbol_24);	
				symbol_468.getParameterSubstitutions().add(symbol_469);
			}
			symbol_98.getTemplateBindings().add(symbol_468);
		}
		symbol_97.getOwnedTypes().add(symbol_98);
		//
		// ocl::orphanage::Bag ocl|Bag[ocl|Bag{T}|flatten{T2}()?T2]
		//
		symbol_99.setName("Bag");
		symbol_99.setElementType(symbol_58);
		{
			TemplateBinding symbol_470 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_470.setSignature(symbol_13);
			{
				TemplateParameterSubstitution symbol_471 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_471.setFormal(symbol_14);	
				symbol_471.setActual(symbol_18);	
				symbol_470.getParameterSubstitutions().add(symbol_471);
			}
			symbol_99.getTemplateBindings().add(symbol_470);
		}
		symbol_97.getOwnedTypes().add(symbol_99);
		//
		// ocl::orphanage::Bag ocl|Bag[ocl|NonOrderedCollection{T}?T]
		//
		symbol_100.setName("Bag");
		symbol_100.setElementType(symbol_58);
		{
			TemplateBinding symbol_472 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_472.setSignature(symbol_13);
			{
				TemplateParameterSubstitution symbol_473 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_473.setFormal(symbol_14);	
				symbol_473.setActual(symbol_45);	
				symbol_472.getParameterSubstitutions().add(symbol_473);
			}
			symbol_100.getTemplateBindings().add(symbol_472);
		}
		symbol_97.getOwnedTypes().add(symbol_100);
		//
		// ocl::orphanage::Bag ocl|Bag[ocl|Bag{T}?T]
		//
		symbol_101.setName("Bag");
		symbol_101.setElementType(symbol_58);
		{
			TemplateBinding symbol_474 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_474.setSignature(symbol_13);
			{
				TemplateParameterSubstitution symbol_475 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_475.setFormal(symbol_14);	
				symbol_475.setActual(symbol_15);	
				symbol_474.getParameterSubstitutions().add(symbol_475);
			}
			symbol_101.getTemplateBindings().add(symbol_474);
		}
		symbol_97.getOwnedTypes().add(symbol_101);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Collection{T}?T]
		//
		symbol_102.setName("Collection");
		symbol_102.setElementType(symbol_58);
		{
			TemplateBinding symbol_476 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_476.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_477 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_477.setFormal(symbol_23);	
				symbol_477.setActual(symbol_24);	
				symbol_476.getParameterSubstitutions().add(symbol_477);
			}
			symbol_102.getTemplateBindings().add(symbol_476);
		}
		symbol_97.getOwnedTypes().add(symbol_102);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|UniqueCollection{T}?T]
		//
		symbol_103.setName("Collection");
		symbol_103.setElementType(symbol_58);
		{
			TemplateBinding symbol_478 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_478.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_479 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_479.setFormal(symbol_23);	
				symbol_479.setActual(symbol_95);	
				symbol_478.getParameterSubstitutions().add(symbol_479);
			}
			symbol_103.getTemplateBindings().add(symbol_478);
		}
		symbol_97.getOwnedTypes().add(symbol_103);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]
		//
		symbol_104.setName("Collection");
		symbol_104.setElementType(symbol_58);
		{
			TemplateBinding symbol_480 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_480.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_481 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_481.setFormal(symbol_23);	
				symbol_481.setActual(symbol_39);	
				symbol_480.getParameterSubstitutions().add(symbol_481);
			}
			symbol_104.getTemplateBindings().add(symbol_480);
		}
		symbol_97.getOwnedTypes().add(symbol_104);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Collection{T}|includesAll{T2}(ocl|Collection[T2])?T2]
		//
		symbol_105.setName("Collection");
		symbol_105.setElementType(symbol_58);
		{
			TemplateBinding symbol_482 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_482.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_483 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_483.setFormal(symbol_23);	
				symbol_483.setActual(symbol_33);	
				symbol_482.getParameterSubstitutions().add(symbol_483);
			}
			symbol_105.getTemplateBindings().add(symbol_482);
		}
		symbol_97.getOwnedTypes().add(symbol_105);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Collection{T}|excludesAll{T2}(ocl|Collection[T2])?T2]
		//
		symbol_106.setName("Collection");
		symbol_106.setElementType(symbol_58);
		{
			TemplateBinding symbol_484 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_484.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_485 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_485.setFormal(symbol_23);	
				symbol_485.setActual(symbol_27);	
				symbol_484.getParameterSubstitutions().add(symbol_485);
			}
			symbol_106.getTemplateBindings().add(symbol_484);
		}
		symbol_97.getOwnedTypes().add(symbol_106);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|NonUniqueCollection{T}?T]
		//
		symbol_107.setName("Collection");
		symbol_107.setElementType(symbol_58);
		{
			TemplateBinding symbol_486 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_486.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_487 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_487.setFormal(symbol_23);	
				symbol_487.setActual(symbol_49);	
				symbol_486.getParameterSubstitutions().add(symbol_487);
			}
			symbol_107.getTemplateBindings().add(symbol_486);
		}
		symbol_97.getOwnedTypes().add(symbol_107);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|Collection{T}|flatten{T2}()?T2]
		//
		symbol_108.setName("Collection");
		symbol_108.setElementType(symbol_58);
		{
			TemplateBinding symbol_488 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_488.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_489 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_489.setFormal(symbol_23);	
				symbol_489.setActual(symbol_30);	
				symbol_488.getParameterSubstitutions().add(symbol_489);
			}
			symbol_108.getTemplateBindings().add(symbol_488);
		}
		symbol_97.getOwnedTypes().add(symbol_108);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|NonOrderedCollection{T}?T]
		//
		symbol_109.setName("Collection");
		symbol_109.setElementType(symbol_58);
		{
			TemplateBinding symbol_490 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_490.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_491 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_491.setFormal(symbol_23);	
				symbol_491.setActual(symbol_45);	
				symbol_490.getParameterSubstitutions().add(symbol_491);
			}
			symbol_109.getTemplateBindings().add(symbol_490);
		}
		symbol_97.getOwnedTypes().add(symbol_109);
		//
		// ocl::orphanage::Collection ocl|Collection[ocl|OrderedCollection{T}?T]
		//
		symbol_110.setName("Collection");
		symbol_110.setElementType(symbol_58);
		{
			TemplateBinding symbol_492 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_492.setSignature(symbol_22);
			{
				TemplateParameterSubstitution symbol_493 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_493.setFormal(symbol_23);	
				symbol_493.setActual(symbol_62);	
				symbol_492.getParameterSubstitutions().add(symbol_493);
			}
			symbol_110.getTemplateBindings().add(symbol_492);
		}
		symbol_97.getOwnedTypes().add(symbol_110);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|Set{T}?T]
		//
		symbol_111.setName("NonOrderedCollection");
		symbol_111.setElementType(symbol_58);
		{
			TemplateBinding symbol_494 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_494.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_495 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_495.setFormal(symbol_44);	
				symbol_495.setActual(symbol_81);	
				symbol_494.getParameterSubstitutions().add(symbol_495);
			}
			symbol_111.getTemplateBindings().add(symbol_494);
		}
		symbol_97.getOwnedTypes().add(symbol_111);
		//
		// ocl::orphanage::NonOrderedCollection ocl|NonOrderedCollection[ocl|Bag{T}?T]
		//
		symbol_112.setName("NonOrderedCollection");
		symbol_112.setElementType(symbol_58);
		{
			TemplateBinding symbol_496 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_496.setSignature(symbol_43);
			{
				TemplateParameterSubstitution symbol_497 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_497.setFormal(symbol_44);	
				symbol_497.setActual(symbol_15);	
				symbol_496.getParameterSubstitutions().add(symbol_497);
			}
			symbol_112.getTemplateBindings().add(symbol_496);
		}
		symbol_97.getOwnedTypes().add(symbol_112);
		//
		// ocl::orphanage::NonUniqueCollection ocl|NonUniqueCollection[ocl|Bag{T}?T]
		//
		symbol_113.setName("NonUniqueCollection");
		symbol_113.setElementType(symbol_58);
		{
			TemplateBinding symbol_498 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_498.setSignature(symbol_47);
			{
				TemplateParameterSubstitution symbol_499 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_499.setFormal(symbol_48);	
				symbol_499.setActual(symbol_15);	
				symbol_498.getParameterSubstitutions().add(symbol_499);
			}
			symbol_113.getTemplateBindings().add(symbol_498);
		}
		symbol_97.getOwnedTypes().add(symbol_113);
		//
		// ocl::orphanage::NonUniqueCollection ocl|NonUniqueCollection[ocl|Sequence{T}?T]
		//
		symbol_114.setName("NonUniqueCollection");
		symbol_114.setElementType(symbol_58);
		{
			TemplateBinding symbol_500 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_500.setSignature(symbol_47);
			{
				TemplateParameterSubstitution symbol_501 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_501.setFormal(symbol_48);	
				symbol_501.setActual(symbol_74);	
				symbol_500.getParameterSubstitutions().add(symbol_501);
			}
			symbol_114.getTemplateBindings().add(symbol_500);
		}
		symbol_97.getOwnedTypes().add(symbol_114);
		//
		// ocl::orphanage::OrderedCollection ocl|OrderedCollection[ocl|Collection{T}?T]
		//
		symbol_115.setName("OrderedCollection");
		symbol_115.setElementType(symbol_58);
		{
			TemplateBinding symbol_502 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_502.setSignature(symbol_60);
			{
				TemplateParameterSubstitution symbol_503 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_503.setFormal(symbol_61);	
				symbol_503.setActual(symbol_24);	
				symbol_502.getParameterSubstitutions().add(symbol_503);
			}
			symbol_115.getTemplateBindings().add(symbol_502);
		}
		symbol_97.getOwnedTypes().add(symbol_115);
		//
		// ocl::orphanage::OrderedCollection ocl|OrderedCollection[ocl|OrderedSet{T}?T]
		//
		symbol_116.setName("OrderedCollection");
		symbol_116.setElementType(symbol_58);
		{
			TemplateBinding symbol_504 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_504.setSignature(symbol_60);
			{
				TemplateParameterSubstitution symbol_505 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_505.setFormal(symbol_61);	
				symbol_505.setActual(symbol_66);	
				symbol_504.getParameterSubstitutions().add(symbol_505);
			}
			symbol_116.getTemplateBindings().add(symbol_504);
		}
		symbol_97.getOwnedTypes().add(symbol_116);
		//
		// ocl::orphanage::OrderedCollection ocl|OrderedCollection[ocl|OrderedCollection{T}?T]
		//
		symbol_117.setName("OrderedCollection");
		symbol_117.setElementType(symbol_58);
		{
			TemplateBinding symbol_506 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_506.setSignature(symbol_60);
			{
				TemplateParameterSubstitution symbol_507 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_507.setFormal(symbol_61);	
				symbol_507.setActual(symbol_62);	
				symbol_506.getParameterSubstitutions().add(symbol_507);
			}
			symbol_117.getTemplateBindings().add(symbol_506);
		}
		symbol_97.getOwnedTypes().add(symbol_117);
		//
		// ocl::orphanage::OrderedCollection ocl|OrderedCollection[ocl|Sequence{T}?T]
		//
		symbol_118.setName("OrderedCollection");
		symbol_118.setElementType(symbol_58);
		{
			TemplateBinding symbol_508 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_508.setSignature(symbol_60);
			{
				TemplateParameterSubstitution symbol_509 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_509.setFormal(symbol_61);	
				symbol_509.setActual(symbol_74);	
				symbol_508.getParameterSubstitutions().add(symbol_509);
			}
			symbol_118.getTemplateBindings().add(symbol_508);
		}
		symbol_97.getOwnedTypes().add(symbol_118);
		//
		// ocl::orphanage::OrderedSet ocl|OrderedSet[ocl|OrderedSet{T}?T]
		//
		symbol_119.setName("OrderedSet");
		symbol_119.setElementType(symbol_58);
		{
			TemplateBinding symbol_510 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_510.setSignature(symbol_64);
			{
				TemplateParameterSubstitution symbol_511 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_511.setFormal(symbol_65);	
				symbol_511.setActual(symbol_66);	
				symbol_510.getParameterSubstitutions().add(symbol_511);
			}
			symbol_119.getTemplateBindings().add(symbol_510);
		}
		symbol_97.getOwnedTypes().add(symbol_119);
		//
		// ocl::orphanage::OrderedSet ocl|OrderedSet[ocl|OrderedCollection{T}?T]
		//
		symbol_120.setName("OrderedSet");
		symbol_120.setElementType(symbol_58);
		{
			TemplateBinding symbol_512 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_512.setSignature(symbol_64);
			{
				TemplateParameterSubstitution symbol_513 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_513.setFormal(symbol_65);	
				symbol_513.setActual(symbol_62);	
				symbol_512.getParameterSubstitutions().add(symbol_513);
			}
			symbol_120.getTemplateBindings().add(symbol_512);
		}
		symbol_97.getOwnedTypes().add(symbol_120);
		//
		// ocl::orphanage::OrderedSet ocl|OrderedSet[ocl|Collection{T}?T]
		//
		symbol_121.setName("OrderedSet");
		symbol_121.setElementType(symbol_58);
		{
			TemplateBinding symbol_514 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_514.setSignature(symbol_64);
			{
				TemplateParameterSubstitution symbol_515 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_515.setFormal(symbol_65);	
				symbol_515.setActual(symbol_24);	
				symbol_514.getParameterSubstitutions().add(symbol_515);
			}
			symbol_121.getTemplateBindings().add(symbol_514);
		}
		symbol_97.getOwnedTypes().add(symbol_121);
		//
		// ocl::orphanage::OrderedSet ocl|OrderedSet[ocl|UniqueCollection{T}?T]
		//
		symbol_122.setName("OrderedSet");
		symbol_122.setElementType(symbol_58);
		{
			TemplateBinding symbol_516 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_516.setSignature(symbol_64);
			{
				TemplateParameterSubstitution symbol_517 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_517.setFormal(symbol_65);	
				symbol_517.setActual(symbol_95);	
				symbol_516.getParameterSubstitutions().add(symbol_517);
			}
			symbol_122.getTemplateBindings().add(symbol_516);
		}
		symbol_97.getOwnedTypes().add(symbol_122);
		//
		// ocl::orphanage::Sequence ocl|Sequence[ocl|NonUniqueCollection{T}?T]
		//
		symbol_123.setName("Sequence");
		symbol_123.setElementType(symbol_58);
		{
			TemplateBinding symbol_518 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_518.setSignature(symbol_72);
			{
				TemplateParameterSubstitution symbol_519 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_519.setFormal(symbol_73);	
				symbol_519.setActual(symbol_49);	
				symbol_518.getParameterSubstitutions().add(symbol_519);
			}
			symbol_123.getTemplateBindings().add(symbol_518);
		}
		symbol_97.getOwnedTypes().add(symbol_123);
		//
		// ocl::orphanage::Sequence ocl|Sequence[ocl|Collection{T}?T]
		//
		symbol_124.setName("Sequence");
		symbol_124.setElementType(symbol_58);
		{
			TemplateBinding symbol_520 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_520.setSignature(symbol_72);
			{
				TemplateParameterSubstitution symbol_521 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_521.setFormal(symbol_73);	
				symbol_521.setActual(symbol_24);	
				symbol_520.getParameterSubstitutions().add(symbol_521);
			}
			symbol_124.getTemplateBindings().add(symbol_520);
		}
		symbol_97.getOwnedTypes().add(symbol_124);
		//
		// ocl::orphanage::Sequence ocl|Sequence[ocl|String]
		//
		symbol_125.setName("Sequence");
		symbol_125.setElementType(symbol_58);
		{
			TemplateBinding symbol_522 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_522.setSignature(symbol_72);
			{
				TemplateParameterSubstitution symbol_523 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_523.setFormal(symbol_73);	
				symbol_523.setActual(symbol_85);	
				symbol_522.getParameterSubstitutions().add(symbol_523);
			}
			symbol_125.getTemplateBindings().add(symbol_522);
		}
		symbol_97.getOwnedTypes().add(symbol_125);
		//
		// ocl::orphanage::Sequence ocl|Sequence[ocl|OrderedCollection{T}?T]
		//
		symbol_126.setName("Sequence");
		symbol_126.setElementType(symbol_58);
		{
			TemplateBinding symbol_524 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_524.setSignature(symbol_72);
			{
				TemplateParameterSubstitution symbol_525 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_525.setFormal(symbol_73);	
				symbol_525.setActual(symbol_62);	
				symbol_524.getParameterSubstitutions().add(symbol_525);
			}
			symbol_126.getTemplateBindings().add(symbol_524);
		}
		symbol_97.getOwnedTypes().add(symbol_126);
		//
		// ocl::orphanage::Sequence ocl|Sequence[ocl|Sequence{T}?T]
		//
		symbol_127.setName("Sequence");
		symbol_127.setElementType(symbol_58);
		{
			TemplateBinding symbol_526 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_526.setSignature(symbol_72);
			{
				TemplateParameterSubstitution symbol_527 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_527.setFormal(symbol_73);	
				symbol_527.setActual(symbol_74);	
				symbol_526.getParameterSubstitutions().add(symbol_527);
			}
			symbol_127.getTemplateBindings().add(symbol_526);
		}
		symbol_97.getOwnedTypes().add(symbol_127);
		//
		// ocl::orphanage::Sequence ocl|Sequence[ocl|Sequence{T}|flatten{T2}()?T2]
		//
		symbol_128.setName("Sequence");
		symbol_128.setElementType(symbol_58);
		{
			TemplateBinding symbol_528 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_528.setSignature(symbol_72);
			{
				TemplateParameterSubstitution symbol_529 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_529.setFormal(symbol_73);	
				symbol_529.setActual(symbol_77);	
				symbol_528.getParameterSubstitutions().add(symbol_529);
			}
			symbol_128.getTemplateBindings().add(symbol_528);
		}
		symbol_97.getOwnedTypes().add(symbol_128);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Boolean]
		//
		symbol_129.setName("Set");
		symbol_129.setElementType(symbol_58);
		{
			TemplateBinding symbol_530 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_530.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_531 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_531.setFormal(symbol_80);	
				symbol_531.setActual(symbol_19);	
				symbol_530.getParameterSubstitutions().add(symbol_531);
			}
			symbol_129.getTemplateBindings().add(symbol_530);
		}
		symbol_97.getOwnedTypes().add(symbol_129);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Classifier]
		//
		symbol_130.setName("Set");
		symbol_130.setElementType(symbol_58);
		{
			TemplateBinding symbol_532 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_532.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_533 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_533.setFormal(symbol_80);	
				symbol_533.setActual(symbol_20);	
				symbol_532.getParameterSubstitutions().add(symbol_533);
			}
			symbol_130.getTemplateBindings().add(symbol_532);
		}
		symbol_97.getOwnedTypes().add(symbol_130);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]]
		//
		symbol_131.setName("Set");
		symbol_131.setElementType(symbol_58);
		{
			TemplateBinding symbol_534 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_534.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_535 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_535.setFormal(symbol_80);	
				symbol_535.setActual(symbol_141);	
				symbol_534.getParameterSubstitutions().add(symbol_535);
			}
			symbol_131.getTemplateBindings().add(symbol_534);
		}
		symbol_97.getOwnedTypes().add(symbol_131);
		//
		// ocl::orphanage::Set ocl|Set[ocl|NonOrderedCollection{T}?T]
		//
		symbol_132.setName("Set");
		symbol_132.setElementType(symbol_58);
		{
			TemplateBinding symbol_536 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_536.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_537 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_537.setFormal(symbol_80);	
				symbol_537.setActual(symbol_45);	
				symbol_536.getParameterSubstitutions().add(symbol_537);
			}
			symbol_132.getTemplateBindings().add(symbol_536);
		}
		symbol_97.getOwnedTypes().add(symbol_132);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Collection{T}?T]
		//
		symbol_133.setName("Set");
		symbol_133.setElementType(symbol_58);
		{
			TemplateBinding symbol_538 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_538.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_539 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_539.setFormal(symbol_80);	
				symbol_539.setActual(symbol_24);	
				symbol_538.getParameterSubstitutions().add(symbol_539);
			}
			symbol_133.getTemplateBindings().add(symbol_538);
		}
		symbol_97.getOwnedTypes().add(symbol_133);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Set{T}?T]
		//
		symbol_134.setName("Set");
		symbol_134.setElementType(symbol_58);
		{
			TemplateBinding symbol_540 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_540.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_541 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_541.setFormal(symbol_80);	
				symbol_541.setActual(symbol_81);	
				symbol_540.getParameterSubstitutions().add(symbol_541);
			}
			symbol_134.getTemplateBindings().add(symbol_540);
		}
		symbol_97.getOwnedTypes().add(symbol_134);
		//
		// ocl::orphanage::Set ocl|Set[ocl|OclVoid]
		//
		symbol_135.setName("Set");
		symbol_135.setElementType(symbol_58);
		{
			TemplateBinding symbol_542 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_542.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_543 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_543.setFormal(symbol_80);	
				symbol_543.setActual(symbol_58);	
				symbol_542.getParameterSubstitutions().add(symbol_543);
			}
			symbol_135.getTemplateBindings().add(symbol_542);
		}
		symbol_97.getOwnedTypes().add(symbol_135);
		//
		// ocl::orphanage::Set ocl|Set[ocl|OclAny]
		//
		symbol_136.setName("Set");
		symbol_136.setElementType(symbol_58);
		{
			TemplateBinding symbol_544 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_544.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_545 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_545.setFormal(symbol_80);	
				symbol_545.setActual(symbol_50);	
				symbol_544.getParameterSubstitutions().add(symbol_545);
			}
			symbol_136.getTemplateBindings().add(symbol_544);
		}
		symbol_97.getOwnedTypes().add(symbol_136);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Enumeration]
		//
		symbol_137.setName("Set");
		symbol_137.setElementType(symbol_58);
		{
			TemplateBinding symbol_546 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_546.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_547 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_547.setFormal(symbol_80);	
				symbol_547.setActual(symbol_40);	
				symbol_546.getParameterSubstitutions().add(symbol_547);
			}
			symbol_137.getTemplateBindings().add(symbol_546);
		}
		symbol_97.getOwnedTypes().add(symbol_137);
		//
		// ocl::orphanage::Set ocl|Set[ocl|Set{T}|flatten{T2}()?T2]
		//
		symbol_138.setName("Set");
		symbol_138.setElementType(symbol_58);
		{
			TemplateBinding symbol_548 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_548.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_549 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_549.setFormal(symbol_80);	
				symbol_549.setActual(symbol_84);	
				symbol_548.getParameterSubstitutions().add(symbol_549);
			}
			symbol_138.getTemplateBindings().add(symbol_548);
		}
		symbol_97.getOwnedTypes().add(symbol_138);
		//
		// ocl::orphanage::Set ocl|Set[ocl|OrderedSet{T}?T]
		//
		symbol_139.setName("Set");
		symbol_139.setElementType(symbol_58);
		{
			TemplateBinding symbol_550 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_550.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_551 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_551.setFormal(symbol_80);	
				symbol_551.setActual(symbol_66);	
				symbol_550.getParameterSubstitutions().add(symbol_551);
			}
			symbol_139.getTemplateBindings().add(symbol_550);
		}
		symbol_97.getOwnedTypes().add(symbol_139);
		//
		// ocl::orphanage::Set ocl|Set[ocl|OclInvalid]
		//
		symbol_140.setName("Set");
		symbol_140.setElementType(symbol_58);
		{
			TemplateBinding symbol_552 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_552.setSignature(symbol_79);
			{
				TemplateParameterSubstitution symbol_553 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_553.setFormal(symbol_80);	
				symbol_553.setActual(symbol_54);	
				symbol_552.getParameterSubstitutions().add(symbol_553);
			}
			symbol_140.getTemplateBindings().add(symbol_552);
		}
		symbol_97.getOwnedTypes().add(symbol_140);
		//
		// ocl::orphanage::Tuple ocl|Tuple[ocl|Collection{T}?T,ocl|Collection{T}|product{T2}(ocl|Collection[T2])?T2]
		//
		symbol_141.setName("Tuple");
		{
			TemplateBinding symbol_554 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_554.setSignature(symbol_87);
			{
				TemplateParameterSubstitution symbol_555 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_555.setFormal(symbol_90);	
				symbol_555.setActual(symbol_39);	
				symbol_554.getParameterSubstitutions().add(symbol_555);
			}{
				TemplateParameterSubstitution symbol_556 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_556.setFormal(symbol_88);	
				symbol_556.setActual(symbol_24);	
				symbol_554.getParameterSubstitutions().add(symbol_556);
			}
			symbol_141.getTemplateBindings().add(symbol_554);
		}
		symbol_97.getOwnedTypes().add(symbol_141);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|OrderedSet{T}?T]
		//
		symbol_142.setName("UniqueCollection");
		symbol_142.setElementType(symbol_58);
		{
			TemplateBinding symbol_557 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_557.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_558 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_558.setFormal(symbol_94);	
				symbol_558.setActual(symbol_66);	
				symbol_557.getParameterSubstitutions().add(symbol_558);
			}
			symbol_142.getTemplateBindings().add(symbol_557);
		}
		symbol_97.getOwnedTypes().add(symbol_142);
		//
		// ocl::orphanage::UniqueCollection ocl|UniqueCollection[ocl|Set{T}?T]
		//
		symbol_143.setName("UniqueCollection");
		symbol_143.setElementType(symbol_58);
		{
			TemplateBinding symbol_559 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_559.setSignature(symbol_93);
			{
				TemplateParameterSubstitution symbol_560 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_560.setFormal(symbol_94);	
				symbol_560.setActual(symbol_81);	
				symbol_559.getParameterSubstitutions().add(symbol_560);
			}
			symbol_143.getTemplateBindings().add(symbol_559);
		}
		symbol_97.getOwnedTypes().add(symbol_143);
		symbol_1.getNestedPackages().add(symbol_97);
		return symbol_1;
	}
}
