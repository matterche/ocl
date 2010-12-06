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
 * $Id: OCLstdlib.java,v 1.1.2.3 2010/12/06 17:13:33 ewillink Exp $
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
		Precedence symbol_2 = PivotFactory.eINSTANCE.createPrecedence(); // IMPLIES
		Precedence symbol_3 = PivotFactory.eINSTANCE.createPrecedence(); // MULTIPLICATIVE
		Precedence symbol_4 = PivotFactory.eINSTANCE.createPrecedence(); // UNARY
		Precedence symbol_5 = PivotFactory.eINSTANCE.createPrecedence(); // OR
		Precedence symbol_6 = PivotFactory.eINSTANCE.createPrecedence(); // EQUALITY
		Precedence symbol_7 = PivotFactory.eINSTANCE.createPrecedence(); // RELATIONAL
		Precedence symbol_8 = PivotFactory.eINSTANCE.createPrecedence(); // AND
		Precedence symbol_9 = PivotFactory.eINSTANCE.createPrecedence(); // XOR
		Precedence symbol_10 = PivotFactory.eINSTANCE.createPrecedence(); // ADDITIVE
		Precedence symbol_11 = PivotFactory.eINSTANCE.createPrecedence(); // NAVIGATION
		Package symbol_12 = PivotFactory.eINSTANCE.createPackage(); // ocl.orphanage
		Class symbol_13 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Bag[stdlib24.Bag{T}?T]
		
		Class symbol_14 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Bag[stdlib24.Collection{T}?T]
		
		Class symbol_15 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Bag[stdlib24.NonOrderedCollection{T}?T]
		
		Class symbol_16 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Bag[stdlib24.Bag{T}.flatten{T2}()?T2]
		
		Class symbol_17 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection[stdlib24.Collection{T}.excludesAll{T2}(stdlib24.Collection[T2])?T2]
		
		Class symbol_18 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection[stdlib24.NonUniqueCollection{T}?T]
		
		Class symbol_19 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection[stdlib24.Collection{T}?T]
		
		Class symbol_20 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection[stdlib24.UniqueCollection{T}?T]
		
		Class symbol_21 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection[stdlib24.Collection{T}.product{T2}(stdlib24.Collection[T2])?T2]
		
		Class symbol_22 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection[stdlib24.OclAny]
		
		Class symbol_23 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection[stdlib24.Collection{T}.includesAll{T2}(stdlib24.Collection[T2])?T2]
		
		Class symbol_24 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection[stdlib24.NonOrderedCollection{T}?T]
		
		Class symbol_25 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection[stdlib24.Collection{T}.flatten{T2}()?T2]
		
		Class symbol_26 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection[stdlib24.OrderedCollection{T}?T]
		
		Class symbol_27 = PivotFactory.eINSTANCE.createClass(); // stdlib24.NonOrderedCollection[stdlib24.Bag{T}?T]
		
		Class symbol_28 = PivotFactory.eINSTANCE.createClass(); // stdlib24.NonOrderedCollection[stdlib24.Set{T}?T]
		
		Class symbol_29 = PivotFactory.eINSTANCE.createClass(); // stdlib24.NonUniqueCollection[stdlib24.Sequence{T}?T]
		
		Class symbol_30 = PivotFactory.eINSTANCE.createClass(); // stdlib24.NonUniqueCollection[stdlib24.Bag{T}?T]
		
		Class symbol_31 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OrderedCollection[stdlib24.Collection{T}?T]
		
		Class symbol_32 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OrderedCollection[stdlib24.OrderedCollection{T}?T]
		
		Class symbol_33 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OrderedCollection[stdlib24.Sequence{T}?T]
		
		Class symbol_34 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OrderedCollection[stdlib24.OrderedSet{T}?T]
		
		Class symbol_35 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OrderedSet[stdlib24.OrderedSet{T}?T]
		
		Class symbol_36 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OrderedSet[stdlib24.UniqueCollection{T}?T]
		
		Class symbol_37 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OrderedSet[stdlib24.Collection{T}?T]
		
		Class symbol_38 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OrderedSet[stdlib24.OrderedCollection{T}?T]
		
		Class symbol_39 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Sequence[stdlib24.OrderedCollection{T}?T]
		
		Class symbol_40 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Sequence[stdlib24.Collection{T}?T]
		
		Class symbol_41 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Sequence[stdlib24.String]
		
		Class symbol_42 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Sequence[stdlib24.NonUniqueCollection{T}?T]
		
		Class symbol_43 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Sequence[stdlib24.Sequence{T}.flatten{T2}()?T2]
		
		Class symbol_44 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Sequence[stdlib24.Sequence{T}?T]
		
		Class symbol_45 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set[stdlib24.Collection{T}?T]
		
		Class symbol_46 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set[stdlib24.Set{T}.flatten{T2}()?T2]
		
		Class symbol_47 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set[stdlib24.Classifier]
		
		Class symbol_48 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set[stdlib24.Tuple[stdlib24.Collection{T}?T,stdlib24.Collection{T}.product{T2}(stdlib24.Collection[T2])?T2]]
		
		Class symbol_49 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set[stdlib24.OclVoid]
		
		Class symbol_50 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set[stdlib24.NonOrderedCollection{T}?T]
		
		Class symbol_51 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set[stdlib24.Set{T}?T]
		
		Class symbol_52 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set[stdlib24.OclAny]
		
		Class symbol_53 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set[stdlib24.OrderedSet{T}?T]
		
		Class symbol_54 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set[stdlib24.Enumeration]
		
		Class symbol_55 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set[stdlib24.OclInvalid]
		
		Class symbol_56 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set[stdlib24.Boolean]
		
		Class symbol_57 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Tuple[stdlib24.Collection{T}?T,stdlib24.Collection{T}.product{T2}(stdlib24.Collection[T2])?T2]
		
		Class symbol_58 = PivotFactory.eINSTANCE.createClass(); // stdlib24.UniqueCollection[stdlib24.Set{T}?T]
		
		Class symbol_59 = PivotFactory.eINSTANCE.createClass(); // stdlib24.UniqueCollection[stdlib24.OrderedSet{T}?T]
		
		
		Package symbol_60 = PivotFactory.eINSTANCE.createPackage(); // stdlib24
		Class symbol_61 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Bag{T}
		TemplateSignature symbol_62 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Bag{T}.
		TypeTemplateParameter symbol_63 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_64 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Bag{T}?T
		
		TemplateSignature symbol_65 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Bag{T}.flatten{T2}().
		TypeTemplateParameter symbol_66 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_67 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Bag{T}.flatten{T2}()?T2
		
		
		Class symbol_68 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Boolean
		
		Class symbol_69 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Classifier
		
		Class symbol_70 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection{T}
		TemplateSignature symbol_71 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Collection{T}.
		TypeTemplateParameter symbol_72 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_73 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection{T}?T
		
		TemplateSignature symbol_74 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Collection{T}.excludesAll{T2}(stdlib24.Collection[T2]).
		TypeTemplateParameter symbol_75 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_76 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection{T}.excludesAll{T2}(stdlib24.Collection[T2])?T2
		
		TemplateSignature symbol_77 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Collection{T}.flatten{T2}().
		TypeTemplateParameter symbol_78 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_79 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection{T}.flatten{T2}()?T2
		
		TemplateSignature symbol_80 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Collection{T}.includesAll{T2}(stdlib24.Collection[T2]).
		TypeTemplateParameter symbol_81 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_82 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection{T}.includesAll{T2}(stdlib24.Collection[T2])?T2
		
		TemplateSignature symbol_83 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Collection{T}.iterate{Tacc}(stdlib24.Collection{T}?T;Tacc).
		TypeTemplateParameter symbol_84 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_85 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection{T}.iterate{Tacc}(stdlib24.Collection{T}?T;Tacc)?Tacc
		
		TemplateSignature symbol_86 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Collection{T}.product{T2}(stdlib24.Collection[T2]).
		TypeTemplateParameter symbol_87 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_88 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Collection{T}.product{T2}(stdlib24.Collection[T2])?T2
		
		
		Class symbol_89 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Enumeration
		
		Class symbol_90 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Integer
		
		Class symbol_91 = PivotFactory.eINSTANCE.createClass(); // stdlib24.NonOrderedCollection{T}
		TemplateSignature symbol_92 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.NonOrderedCollection{T}.
		TypeTemplateParameter symbol_93 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_94 = PivotFactory.eINSTANCE.createClass(); // stdlib24.NonOrderedCollection{T}?T
		
		
		Class symbol_95 = PivotFactory.eINSTANCE.createClass(); // stdlib24.NonUniqueCollection{T}
		TemplateSignature symbol_96 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.NonUniqueCollection{T}.
		TypeTemplateParameter symbol_97 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_98 = PivotFactory.eINSTANCE.createClass(); // stdlib24.NonUniqueCollection{T}?T
		
		
		Class symbol_99 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OclAny
		TemplateSignature symbol_100 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.OclAny.oclAsType{T}(stdlib24.Classifier).
		TypeTemplateParameter symbol_101 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_102 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OclAny.oclAsType{T}(stdlib24.Classifier)?T
		
		
		Class symbol_103 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OclInvalid
		
		Class symbol_104 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OclMessage
		
		Class symbol_105 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OclState
		
		Class symbol_106 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OclTuple
		
		Class symbol_107 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OclVoid
		
		Class symbol_108 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OrderedCollection{T}
		TemplateSignature symbol_109 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.OrderedCollection{T}.
		TypeTemplateParameter symbol_110 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_111 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OrderedCollection{T}?T
		
		
		Class symbol_112 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OrderedSet{T}
		TemplateSignature symbol_113 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.OrderedSet{T}.
		TypeTemplateParameter symbol_114 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_115 = PivotFactory.eINSTANCE.createClass(); // stdlib24.OrderedSet{T}?T
		
		
		Class symbol_116 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Real
		TemplateSignature symbol_117 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Real.oclAsType{T}(stdlib24.Classifier).
		TypeTemplateParameter symbol_118 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_119 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Real.oclAsType{T}(stdlib24.Classifier)?T
		
		
		Class symbol_120 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Sequence{T}
		TemplateSignature symbol_121 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Sequence{T}.
		TypeTemplateParameter symbol_122 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_123 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Sequence{T}?T
		
		TemplateSignature symbol_124 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Sequence{T}.flatten{T2}().
		TypeTemplateParameter symbol_125 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_126 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Sequence{T}.flatten{T2}()?T2
		
		
		Class symbol_127 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set{T}
		TemplateSignature symbol_128 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Set{T}.
		TypeTemplateParameter symbol_129 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_130 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set{T}?T
		
		TemplateSignature symbol_131 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Set{T}.flatten{T2}().
		TypeTemplateParameter symbol_132 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_133 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Set{T}.flatten{T2}()?T2
		
		
		Class symbol_134 = PivotFactory.eINSTANCE.createClass(); // stdlib24.String
		
		Class symbol_135 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Tuple{T1,T2}
		TemplateSignature symbol_136 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.Tuple{T1,T2}.
		TypeTemplateParameter symbol_137 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_138 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Tuple{T1,T2}?T1
		TypeTemplateParameter symbol_139 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_140 = PivotFactory.eINSTANCE.createClass(); // stdlib24.Tuple{T1,T2}?T2
		
		
		Class symbol_141 = PivotFactory.eINSTANCE.createClass(); // stdlib24.UniqueCollection{T}
		TemplateSignature symbol_142 = PivotFactory.eINSTANCE.createTemplateSignature(); // stdlib24.UniqueCollection{T}.
		TypeTemplateParameter symbol_143 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_144 = PivotFactory.eINSTANCE.createClass(); // stdlib24.UniqueCollection{T}?T
		
		
		Class symbol_145 = PivotFactory.eINSTANCE.createClass(); // stdlib24.UnlimitedNatural
		
		

		symbol_1.setName("ocl");
		symbol_1.setNsPrefix("ocllib");
		symbol_1.setNsURI("http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib/lib");
		symbol_2.setName("IMPLIES");
		symbol_2.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_2);
		symbol_3.setName("MULTIPLICATIVE");
		symbol_3.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_3);
		symbol_4.setName("UNARY");
		symbol_4.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_4);
		symbol_5.setName("OR");
		symbol_5.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_5);
		symbol_6.setName("EQUALITY");
		symbol_6.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_6);
		symbol_7.setName("RELATIONAL");
		symbol_7.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_7);
		symbol_8.setName("AND");
		symbol_8.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_8);
		symbol_9.setName("XOR");
		symbol_9.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_9);
		symbol_10.setName("ADDITIVE");
		symbol_10.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_10);
		symbol_11.setName("NAVIGATION");
		symbol_11.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_11);
		//
		// ocl::orphanage
		//
		symbol_12.setName("orphanage");
		//
		// ocl::orphanage::Bag stdlib24.Bag[stdlib24.Bag{T}?T]
		//
		symbol_13.setName("Bag");
		{
			TemplateBinding symbol_146 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_146.setSignature(symbol_62);
			{
				TemplateParameterSubstitution symbol_147 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_147.setFormal(symbol_63);	
				symbol_147.setActual(symbol_64);	
				symbol_146.getParameterSubstitutions().add(symbol_147);
			}
			symbol_13.getTemplateBindings().add(symbol_146);
		}
		symbol_12.getOwnedTypes().add(symbol_13);
		//
		// ocl::orphanage::Bag stdlib24.Bag[stdlib24.Collection{T}?T]
		//
		symbol_14.setName("Bag");
		{
			TemplateBinding symbol_148 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_148.setSignature(symbol_62);
			{
				TemplateParameterSubstitution symbol_149 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_149.setFormal(symbol_63);	
				symbol_149.setActual(symbol_73);	
				symbol_148.getParameterSubstitutions().add(symbol_149);
			}
			symbol_14.getTemplateBindings().add(symbol_148);
		}
		symbol_12.getOwnedTypes().add(symbol_14);
		//
		// ocl::orphanage::Bag stdlib24.Bag[stdlib24.NonOrderedCollection{T}?T]
		//
		symbol_15.setName("Bag");
		{
			TemplateBinding symbol_150 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_150.setSignature(symbol_62);
			{
				TemplateParameterSubstitution symbol_151 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_151.setFormal(symbol_63);	
				symbol_151.setActual(symbol_94);	
				symbol_150.getParameterSubstitutions().add(symbol_151);
			}
			symbol_15.getTemplateBindings().add(symbol_150);
		}
		symbol_12.getOwnedTypes().add(symbol_15);
		//
		// ocl::orphanage::Bag stdlib24.Bag[stdlib24.Bag{T}.flatten{T2}()?T2]
		//
		symbol_16.setName("Bag");
		{
			TemplateBinding symbol_152 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_152.setSignature(symbol_62);
			{
				TemplateParameterSubstitution symbol_153 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_153.setFormal(symbol_63);	
				symbol_153.setActual(symbol_67);	
				symbol_152.getParameterSubstitutions().add(symbol_153);
			}
			symbol_16.getTemplateBindings().add(symbol_152);
		}
		symbol_12.getOwnedTypes().add(symbol_16);
		//
		// ocl::orphanage::Collection stdlib24.Collection[stdlib24.Collection{T}.excludesAll{T2}(stdlib24.Collection[T2])?T2]
		//
		symbol_17.setName("Collection");
		{
			TemplateBinding symbol_154 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_154.setSignature(symbol_71);
			{
				TemplateParameterSubstitution symbol_155 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_155.setFormal(symbol_72);	
				symbol_155.setActual(symbol_76);	
				symbol_154.getParameterSubstitutions().add(symbol_155);
			}
			symbol_17.getTemplateBindings().add(symbol_154);
		}
		symbol_12.getOwnedTypes().add(symbol_17);
		//
		// ocl::orphanage::Collection stdlib24.Collection[stdlib24.NonUniqueCollection{T}?T]
		//
		symbol_18.setName("Collection");
		{
			TemplateBinding symbol_156 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_156.setSignature(symbol_71);
			{
				TemplateParameterSubstitution symbol_157 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_157.setFormal(symbol_72);	
				symbol_157.setActual(symbol_98);	
				symbol_156.getParameterSubstitutions().add(symbol_157);
			}
			symbol_18.getTemplateBindings().add(symbol_156);
		}
		symbol_12.getOwnedTypes().add(symbol_18);
		//
		// ocl::orphanage::Collection stdlib24.Collection[stdlib24.Collection{T}?T]
		//
		symbol_19.setName("Collection");
		{
			TemplateBinding symbol_158 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_158.setSignature(symbol_71);
			{
				TemplateParameterSubstitution symbol_159 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_159.setFormal(symbol_72);	
				symbol_159.setActual(symbol_73);	
				symbol_158.getParameterSubstitutions().add(symbol_159);
			}
			symbol_19.getTemplateBindings().add(symbol_158);
		}
		symbol_12.getOwnedTypes().add(symbol_19);
		//
		// ocl::orphanage::Collection stdlib24.Collection[stdlib24.UniqueCollection{T}?T]
		//
		symbol_20.setName("Collection");
		{
			TemplateBinding symbol_160 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_160.setSignature(symbol_71);
			{
				TemplateParameterSubstitution symbol_161 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_161.setFormal(symbol_72);	
				symbol_161.setActual(symbol_144);	
				symbol_160.getParameterSubstitutions().add(symbol_161);
			}
			symbol_20.getTemplateBindings().add(symbol_160);
		}
		symbol_12.getOwnedTypes().add(symbol_20);
		//
		// ocl::orphanage::Collection stdlib24.Collection[stdlib24.Collection{T}.product{T2}(stdlib24.Collection[T2])?T2]
		//
		symbol_21.setName("Collection");
		{
			TemplateBinding symbol_162 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_162.setSignature(symbol_71);
			{
				TemplateParameterSubstitution symbol_163 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_163.setFormal(symbol_72);	
				symbol_163.setActual(symbol_88);	
				symbol_162.getParameterSubstitutions().add(symbol_163);
			}
			symbol_21.getTemplateBindings().add(symbol_162);
		}
		symbol_12.getOwnedTypes().add(symbol_21);
		//
		// ocl::orphanage::Collection stdlib24.Collection[stdlib24.OclAny]
		//
		symbol_22.setName("Collection");
		{
			TemplateBinding symbol_164 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_164.setSignature(symbol_71);
			{
				TemplateParameterSubstitution symbol_165 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_165.setFormal(symbol_72);	
				symbol_165.setActual(symbol_99);	
				symbol_164.getParameterSubstitutions().add(symbol_165);
			}
			symbol_22.getTemplateBindings().add(symbol_164);
		}
		symbol_12.getOwnedTypes().add(symbol_22);
		//
		// ocl::orphanage::Collection stdlib24.Collection[stdlib24.Collection{T}.includesAll{T2}(stdlib24.Collection[T2])?T2]
		//
		symbol_23.setName("Collection");
		{
			TemplateBinding symbol_166 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_166.setSignature(symbol_71);
			{
				TemplateParameterSubstitution symbol_167 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_167.setFormal(symbol_72);	
				symbol_167.setActual(symbol_82);	
				symbol_166.getParameterSubstitutions().add(symbol_167);
			}
			symbol_23.getTemplateBindings().add(symbol_166);
		}
		symbol_12.getOwnedTypes().add(symbol_23);
		//
		// ocl::orphanage::Collection stdlib24.Collection[stdlib24.NonOrderedCollection{T}?T]
		//
		symbol_24.setName("Collection");
		{
			TemplateBinding symbol_168 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_168.setSignature(symbol_71);
			{
				TemplateParameterSubstitution symbol_169 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_169.setFormal(symbol_72);	
				symbol_169.setActual(symbol_94);	
				symbol_168.getParameterSubstitutions().add(symbol_169);
			}
			symbol_24.getTemplateBindings().add(symbol_168);
		}
		symbol_12.getOwnedTypes().add(symbol_24);
		//
		// ocl::orphanage::Collection stdlib24.Collection[stdlib24.Collection{T}.flatten{T2}()?T2]
		//
		symbol_25.setName("Collection");
		{
			TemplateBinding symbol_170 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_170.setSignature(symbol_71);
			{
				TemplateParameterSubstitution symbol_171 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_171.setFormal(symbol_72);	
				symbol_171.setActual(symbol_79);	
				symbol_170.getParameterSubstitutions().add(symbol_171);
			}
			symbol_25.getTemplateBindings().add(symbol_170);
		}
		symbol_12.getOwnedTypes().add(symbol_25);
		//
		// ocl::orphanage::Collection stdlib24.Collection[stdlib24.OrderedCollection{T}?T]
		//
		symbol_26.setName("Collection");
		{
			TemplateBinding symbol_172 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_172.setSignature(symbol_71);
			{
				TemplateParameterSubstitution symbol_173 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_173.setFormal(symbol_72);	
				symbol_173.setActual(symbol_111);	
				symbol_172.getParameterSubstitutions().add(symbol_173);
			}
			symbol_26.getTemplateBindings().add(symbol_172);
		}
		symbol_12.getOwnedTypes().add(symbol_26);
		//
		// ocl::orphanage::NonOrderedCollection stdlib24.NonOrderedCollection[stdlib24.Bag{T}?T]
		//
		symbol_27.setName("NonOrderedCollection");
		{
			TemplateBinding symbol_174 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_174.setSignature(symbol_92);
			{
				TemplateParameterSubstitution symbol_175 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_175.setFormal(symbol_93);	
				symbol_175.setActual(symbol_64);	
				symbol_174.getParameterSubstitutions().add(symbol_175);
			}
			symbol_27.getTemplateBindings().add(symbol_174);
		}
		symbol_12.getOwnedTypes().add(symbol_27);
		//
		// ocl::orphanage::NonOrderedCollection stdlib24.NonOrderedCollection[stdlib24.Set{T}?T]
		//
		symbol_28.setName("NonOrderedCollection");
		{
			TemplateBinding symbol_176 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_176.setSignature(symbol_92);
			{
				TemplateParameterSubstitution symbol_177 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_177.setFormal(symbol_93);	
				symbol_177.setActual(symbol_130);	
				symbol_176.getParameterSubstitutions().add(symbol_177);
			}
			symbol_28.getTemplateBindings().add(symbol_176);
		}
		symbol_12.getOwnedTypes().add(symbol_28);
		//
		// ocl::orphanage::NonUniqueCollection stdlib24.NonUniqueCollection[stdlib24.Sequence{T}?T]
		//
		symbol_29.setName("NonUniqueCollection");
		{
			TemplateBinding symbol_178 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_178.setSignature(symbol_96);
			{
				TemplateParameterSubstitution symbol_179 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_179.setFormal(symbol_97);	
				symbol_179.setActual(symbol_123);	
				symbol_178.getParameterSubstitutions().add(symbol_179);
			}
			symbol_29.getTemplateBindings().add(symbol_178);
		}
		symbol_12.getOwnedTypes().add(symbol_29);
		//
		// ocl::orphanage::NonUniqueCollection stdlib24.NonUniqueCollection[stdlib24.Bag{T}?T]
		//
		symbol_30.setName("NonUniqueCollection");
		{
			TemplateBinding symbol_180 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_180.setSignature(symbol_96);
			{
				TemplateParameterSubstitution symbol_181 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_181.setFormal(symbol_97);	
				symbol_181.setActual(symbol_64);	
				symbol_180.getParameterSubstitutions().add(symbol_181);
			}
			symbol_30.getTemplateBindings().add(symbol_180);
		}
		symbol_12.getOwnedTypes().add(symbol_30);
		//
		// ocl::orphanage::OrderedCollection stdlib24.OrderedCollection[stdlib24.Collection{T}?T]
		//
		symbol_31.setName("OrderedCollection");
		{
			TemplateBinding symbol_182 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_182.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_183 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_183.setFormal(symbol_110);	
				symbol_183.setActual(symbol_73);	
				symbol_182.getParameterSubstitutions().add(symbol_183);
			}
			symbol_31.getTemplateBindings().add(symbol_182);
		}
		symbol_12.getOwnedTypes().add(symbol_31);
		//
		// ocl::orphanage::OrderedCollection stdlib24.OrderedCollection[stdlib24.OrderedCollection{T}?T]
		//
		symbol_32.setName("OrderedCollection");
		{
			TemplateBinding symbol_184 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_184.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_185 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_185.setFormal(symbol_110);	
				symbol_185.setActual(symbol_111);	
				symbol_184.getParameterSubstitutions().add(symbol_185);
			}
			symbol_32.getTemplateBindings().add(symbol_184);
		}
		symbol_12.getOwnedTypes().add(symbol_32);
		//
		// ocl::orphanage::OrderedCollection stdlib24.OrderedCollection[stdlib24.Sequence{T}?T]
		//
		symbol_33.setName("OrderedCollection");
		{
			TemplateBinding symbol_186 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_186.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_187 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_187.setFormal(symbol_110);	
				symbol_187.setActual(symbol_123);	
				symbol_186.getParameterSubstitutions().add(symbol_187);
			}
			symbol_33.getTemplateBindings().add(symbol_186);
		}
		symbol_12.getOwnedTypes().add(symbol_33);
		//
		// ocl::orphanage::OrderedCollection stdlib24.OrderedCollection[stdlib24.OrderedSet{T}?T]
		//
		symbol_34.setName("OrderedCollection");
		{
			TemplateBinding symbol_188 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_188.setSignature(symbol_109);
			{
				TemplateParameterSubstitution symbol_189 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_189.setFormal(symbol_110);	
				symbol_189.setActual(symbol_115);	
				symbol_188.getParameterSubstitutions().add(symbol_189);
			}
			symbol_34.getTemplateBindings().add(symbol_188);
		}
		symbol_12.getOwnedTypes().add(symbol_34);
		//
		// ocl::orphanage::OrderedSet stdlib24.OrderedSet[stdlib24.OrderedSet{T}?T]
		//
		symbol_35.setName("OrderedSet");
		{
			TemplateBinding symbol_190 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_190.setSignature(symbol_113);
			{
				TemplateParameterSubstitution symbol_191 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_191.setFormal(symbol_114);	
				symbol_191.setActual(symbol_115);	
				symbol_190.getParameterSubstitutions().add(symbol_191);
			}
			symbol_35.getTemplateBindings().add(symbol_190);
		}
		symbol_12.getOwnedTypes().add(symbol_35);
		//
		// ocl::orphanage::OrderedSet stdlib24.OrderedSet[stdlib24.UniqueCollection{T}?T]
		//
		symbol_36.setName("OrderedSet");
		{
			TemplateBinding symbol_192 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_192.setSignature(symbol_113);
			{
				TemplateParameterSubstitution symbol_193 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_193.setFormal(symbol_114);	
				symbol_193.setActual(symbol_144);	
				symbol_192.getParameterSubstitutions().add(symbol_193);
			}
			symbol_36.getTemplateBindings().add(symbol_192);
		}
		symbol_12.getOwnedTypes().add(symbol_36);
		//
		// ocl::orphanage::OrderedSet stdlib24.OrderedSet[stdlib24.Collection{T}?T]
		//
		symbol_37.setName("OrderedSet");
		{
			TemplateBinding symbol_194 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_194.setSignature(symbol_113);
			{
				TemplateParameterSubstitution symbol_195 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_195.setFormal(symbol_114);	
				symbol_195.setActual(symbol_73);	
				symbol_194.getParameterSubstitutions().add(symbol_195);
			}
			symbol_37.getTemplateBindings().add(symbol_194);
		}
		symbol_12.getOwnedTypes().add(symbol_37);
		//
		// ocl::orphanage::OrderedSet stdlib24.OrderedSet[stdlib24.OrderedCollection{T}?T]
		//
		symbol_38.setName("OrderedSet");
		{
			TemplateBinding symbol_196 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_196.setSignature(symbol_113);
			{
				TemplateParameterSubstitution symbol_197 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_197.setFormal(symbol_114);	
				symbol_197.setActual(symbol_111);	
				symbol_196.getParameterSubstitutions().add(symbol_197);
			}
			symbol_38.getTemplateBindings().add(symbol_196);
		}
		symbol_12.getOwnedTypes().add(symbol_38);
		//
		// ocl::orphanage::Sequence stdlib24.Sequence[stdlib24.OrderedCollection{T}?T]
		//
		symbol_39.setName("Sequence");
		{
			TemplateBinding symbol_198 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_198.setSignature(symbol_121);
			{
				TemplateParameterSubstitution symbol_199 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_199.setFormal(symbol_122);	
				symbol_199.setActual(symbol_111);	
				symbol_198.getParameterSubstitutions().add(symbol_199);
			}
			symbol_39.getTemplateBindings().add(symbol_198);
		}
		symbol_12.getOwnedTypes().add(symbol_39);
		//
		// ocl::orphanage::Sequence stdlib24.Sequence[stdlib24.Collection{T}?T]
		//
		symbol_40.setName("Sequence");
		{
			TemplateBinding symbol_200 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_200.setSignature(symbol_121);
			{
				TemplateParameterSubstitution symbol_201 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_201.setFormal(symbol_122);	
				symbol_201.setActual(symbol_73);	
				symbol_200.getParameterSubstitutions().add(symbol_201);
			}
			symbol_40.getTemplateBindings().add(symbol_200);
		}
		symbol_12.getOwnedTypes().add(symbol_40);
		//
		// ocl::orphanage::Sequence stdlib24.Sequence[stdlib24.String]
		//
		symbol_41.setName("Sequence");
		{
			TemplateBinding symbol_202 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_202.setSignature(symbol_121);
			{
				TemplateParameterSubstitution symbol_203 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_203.setFormal(symbol_122);	
				symbol_203.setActual(symbol_134);	
				symbol_202.getParameterSubstitutions().add(symbol_203);
			}
			symbol_41.getTemplateBindings().add(symbol_202);
		}
		symbol_12.getOwnedTypes().add(symbol_41);
		//
		// ocl::orphanage::Sequence stdlib24.Sequence[stdlib24.NonUniqueCollection{T}?T]
		//
		symbol_42.setName("Sequence");
		{
			TemplateBinding symbol_204 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_204.setSignature(symbol_121);
			{
				TemplateParameterSubstitution symbol_205 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_205.setFormal(symbol_122);	
				symbol_205.setActual(symbol_98);	
				symbol_204.getParameterSubstitutions().add(symbol_205);
			}
			symbol_42.getTemplateBindings().add(symbol_204);
		}
		symbol_12.getOwnedTypes().add(symbol_42);
		//
		// ocl::orphanage::Sequence stdlib24.Sequence[stdlib24.Sequence{T}.flatten{T2}()?T2]
		//
		symbol_43.setName("Sequence");
		{
			TemplateBinding symbol_206 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_206.setSignature(symbol_121);
			{
				TemplateParameterSubstitution symbol_207 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_207.setFormal(symbol_122);	
				symbol_207.setActual(symbol_126);	
				symbol_206.getParameterSubstitutions().add(symbol_207);
			}
			symbol_43.getTemplateBindings().add(symbol_206);
		}
		symbol_12.getOwnedTypes().add(symbol_43);
		//
		// ocl::orphanage::Sequence stdlib24.Sequence[stdlib24.Sequence{T}?T]
		//
		symbol_44.setName("Sequence");
		{
			TemplateBinding symbol_208 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_208.setSignature(symbol_121);
			{
				TemplateParameterSubstitution symbol_209 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_209.setFormal(symbol_122);	
				symbol_209.setActual(symbol_123);	
				symbol_208.getParameterSubstitutions().add(symbol_209);
			}
			symbol_44.getTemplateBindings().add(symbol_208);
		}
		symbol_12.getOwnedTypes().add(symbol_44);
		//
		// ocl::orphanage::Set stdlib24.Set[stdlib24.Collection{T}?T]
		//
		symbol_45.setName("Set");
		{
			TemplateBinding symbol_210 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_210.setSignature(symbol_128);
			{
				TemplateParameterSubstitution symbol_211 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_211.setFormal(symbol_129);	
				symbol_211.setActual(symbol_73);	
				symbol_210.getParameterSubstitutions().add(symbol_211);
			}
			symbol_45.getTemplateBindings().add(symbol_210);
		}
		symbol_12.getOwnedTypes().add(symbol_45);
		//
		// ocl::orphanage::Set stdlib24.Set[stdlib24.Set{T}.flatten{T2}()?T2]
		//
		symbol_46.setName("Set");
		{
			TemplateBinding symbol_212 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_212.setSignature(symbol_128);
			{
				TemplateParameterSubstitution symbol_213 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_213.setFormal(symbol_129);	
				symbol_213.setActual(symbol_133);	
				symbol_212.getParameterSubstitutions().add(symbol_213);
			}
			symbol_46.getTemplateBindings().add(symbol_212);
		}
		symbol_12.getOwnedTypes().add(symbol_46);
		//
		// ocl::orphanage::Set stdlib24.Set[stdlib24.Classifier]
		//
		symbol_47.setName("Set");
		{
			TemplateBinding symbol_214 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_214.setSignature(symbol_128);
			{
				TemplateParameterSubstitution symbol_215 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_215.setFormal(symbol_129);	
				symbol_215.setActual(symbol_69);	
				symbol_214.getParameterSubstitutions().add(symbol_215);
			}
			symbol_47.getTemplateBindings().add(symbol_214);
		}
		symbol_12.getOwnedTypes().add(symbol_47);
		//
		// ocl::orphanage::Set stdlib24.Set[stdlib24.Tuple[stdlib24.Collection{T}?T,stdlib24.Collection{T}.product{T2}(stdlib24.Collection[T2])?T2]]
		//
		symbol_48.setName("Set");
		{
			TemplateBinding symbol_216 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_216.setSignature(symbol_128);
			{
				TemplateParameterSubstitution symbol_217 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_217.setFormal(symbol_129);	
				symbol_217.setActual(symbol_57);	
				symbol_216.getParameterSubstitutions().add(symbol_217);
			}
			symbol_48.getTemplateBindings().add(symbol_216);
		}
		symbol_12.getOwnedTypes().add(symbol_48);
		//
		// ocl::orphanage::Set stdlib24.Set[stdlib24.OclVoid]
		//
		symbol_49.setName("Set");
		{
			TemplateBinding symbol_218 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_218.setSignature(symbol_128);
			{
				TemplateParameterSubstitution symbol_219 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_219.setFormal(symbol_129);	
				symbol_219.setActual(symbol_107);	
				symbol_218.getParameterSubstitutions().add(symbol_219);
			}
			symbol_49.getTemplateBindings().add(symbol_218);
		}
		symbol_12.getOwnedTypes().add(symbol_49);
		//
		// ocl::orphanage::Set stdlib24.Set[stdlib24.NonOrderedCollection{T}?T]
		//
		symbol_50.setName("Set");
		{
			TemplateBinding symbol_220 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_220.setSignature(symbol_128);
			{
				TemplateParameterSubstitution symbol_221 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_221.setFormal(symbol_129);	
				symbol_221.setActual(symbol_94);	
				symbol_220.getParameterSubstitutions().add(symbol_221);
			}
			symbol_50.getTemplateBindings().add(symbol_220);
		}
		symbol_12.getOwnedTypes().add(symbol_50);
		//
		// ocl::orphanage::Set stdlib24.Set[stdlib24.Set{T}?T]
		//
		symbol_51.setName("Set");
		{
			TemplateBinding symbol_222 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_222.setSignature(symbol_128);
			{
				TemplateParameterSubstitution symbol_223 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_223.setFormal(symbol_129);	
				symbol_223.setActual(symbol_130);	
				symbol_222.getParameterSubstitutions().add(symbol_223);
			}
			symbol_51.getTemplateBindings().add(symbol_222);
		}
		symbol_12.getOwnedTypes().add(symbol_51);
		//
		// ocl::orphanage::Set stdlib24.Set[stdlib24.OclAny]
		//
		symbol_52.setName("Set");
		{
			TemplateBinding symbol_224 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_224.setSignature(symbol_128);
			{
				TemplateParameterSubstitution symbol_225 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_225.setFormal(symbol_129);	
				symbol_225.setActual(symbol_99);	
				symbol_224.getParameterSubstitutions().add(symbol_225);
			}
			symbol_52.getTemplateBindings().add(symbol_224);
		}
		symbol_12.getOwnedTypes().add(symbol_52);
		//
		// ocl::orphanage::Set stdlib24.Set[stdlib24.OrderedSet{T}?T]
		//
		symbol_53.setName("Set");
		{
			TemplateBinding symbol_226 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_226.setSignature(symbol_128);
			{
				TemplateParameterSubstitution symbol_227 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_227.setFormal(symbol_129);	
				symbol_227.setActual(symbol_115);	
				symbol_226.getParameterSubstitutions().add(symbol_227);
			}
			symbol_53.getTemplateBindings().add(symbol_226);
		}
		symbol_12.getOwnedTypes().add(symbol_53);
		//
		// ocl::orphanage::Set stdlib24.Set[stdlib24.Enumeration]
		//
		symbol_54.setName("Set");
		{
			TemplateBinding symbol_228 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_228.setSignature(symbol_128);
			{
				TemplateParameterSubstitution symbol_229 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_229.setFormal(symbol_129);	
				symbol_229.setActual(symbol_89);	
				symbol_228.getParameterSubstitutions().add(symbol_229);
			}
			symbol_54.getTemplateBindings().add(symbol_228);
		}
		symbol_12.getOwnedTypes().add(symbol_54);
		//
		// ocl::orphanage::Set stdlib24.Set[stdlib24.OclInvalid]
		//
		symbol_55.setName("Set");
		{
			TemplateBinding symbol_230 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_230.setSignature(symbol_128);
			{
				TemplateParameterSubstitution symbol_231 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_231.setFormal(symbol_129);	
				symbol_231.setActual(symbol_103);	
				symbol_230.getParameterSubstitutions().add(symbol_231);
			}
			symbol_55.getTemplateBindings().add(symbol_230);
		}
		symbol_12.getOwnedTypes().add(symbol_55);
		//
		// ocl::orphanage::Set stdlib24.Set[stdlib24.Boolean]
		//
		symbol_56.setName("Set");
		{
			TemplateBinding symbol_232 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_232.setSignature(symbol_128);
			{
				TemplateParameterSubstitution symbol_233 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_233.setFormal(symbol_129);	
				symbol_233.setActual(symbol_68);	
				symbol_232.getParameterSubstitutions().add(symbol_233);
			}
			symbol_56.getTemplateBindings().add(symbol_232);
		}
		symbol_12.getOwnedTypes().add(symbol_56);
		//
		// ocl::orphanage::Tuple stdlib24.Tuple[stdlib24.Collection{T}?T,stdlib24.Collection{T}.product{T2}(stdlib24.Collection[T2])?T2]
		//
		symbol_57.setName("Tuple");
		{
			TemplateBinding symbol_234 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_234.setSignature(symbol_136);
			{
				TemplateParameterSubstitution symbol_235 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_235.setFormal(symbol_139);	
				symbol_235.setActual(symbol_88);	
				symbol_234.getParameterSubstitutions().add(symbol_235);
			}{
				TemplateParameterSubstitution symbol_236 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_236.setFormal(symbol_137);	
				symbol_236.setActual(symbol_73);	
				symbol_234.getParameterSubstitutions().add(symbol_236);
			}
			symbol_57.getTemplateBindings().add(symbol_234);
		}
		symbol_12.getOwnedTypes().add(symbol_57);
		//
		// ocl::orphanage::UniqueCollection stdlib24.UniqueCollection[stdlib24.Set{T}?T]
		//
		symbol_58.setName("UniqueCollection");
		{
			TemplateBinding symbol_237 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_237.setSignature(symbol_142);
			{
				TemplateParameterSubstitution symbol_238 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_238.setFormal(symbol_143);	
				symbol_238.setActual(symbol_130);	
				symbol_237.getParameterSubstitutions().add(symbol_238);
			}
			symbol_58.getTemplateBindings().add(symbol_237);
		}
		symbol_12.getOwnedTypes().add(symbol_58);
		//
		// ocl::orphanage::UniqueCollection stdlib24.UniqueCollection[stdlib24.OrderedSet{T}?T]
		//
		symbol_59.setName("UniqueCollection");
		{
			TemplateBinding symbol_239 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_239.setSignature(symbol_142);
			{
				TemplateParameterSubstitution symbol_240 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_240.setFormal(symbol_143);	
				symbol_240.setActual(symbol_115);	
				symbol_239.getParameterSubstitutions().add(symbol_240);
			}
			symbol_59.getTemplateBindings().add(symbol_239);
		}
		symbol_12.getOwnedTypes().add(symbol_59);
		symbol_1.getNestedPackages().add(symbol_12);
		//
		// ocl::stdlib24
		//
		symbol_60.setName("stdlib24");
		symbol_60.setNsPrefix("ocl");
		symbol_60.setNsURI("http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib");
		//
		// ocl::stdlib24::Bag stdlib24.Bag{T}
		//
		symbol_61.setName("Bag");
		symbol_64.setName("T");
		symbol_63.setOwnedParameteredElement(symbol_64);
		symbol_62.getOwnedParameters().add(symbol_63);
		
		symbol_61.setOwnedTemplateSignature(symbol_62);
		symbol_61.getSuperClasses().add(symbol_30);
		symbol_61.getSuperClasses().add(symbol_27);
		{	// ocl::stdlib24::Bag::<>() stdlib24.Bag{T}.<>(stdlib24.OclAny)
			Operation symbol_241 = PivotFactory.eINSTANCE.createOperation();
			symbol_241.setName("<>");
			symbol_241.setType(symbol_68);
			Parameter symbol_242 = PivotFactory.eINSTANCE.createParameter();
			symbol_242.setName("bag");
			symbol_242.setType(symbol_99);
			symbol_242.setIteratorKind(IteratorKind.PARAMETER);
			symbol_241.getOwnedParameters().add(symbol_242);
			symbol_241.setPrecedence(symbol_6);
			symbol_241.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEqualOperation.INSTANCE);
			symbol_61.getOwnedOperations().add(symbol_241);
		}
		{	// ocl::stdlib24::Bag::=() stdlib24.Bag{T}.=(stdlib24.OclAny)
			Operation symbol_243 = PivotFactory.eINSTANCE.createOperation();
			symbol_243.setName("=");
			symbol_243.setType(symbol_68);
			Parameter symbol_244 = PivotFactory.eINSTANCE.createParameter();
			symbol_244.setName("bag");
			symbol_244.setType(symbol_99);
			symbol_244.setIteratorKind(IteratorKind.PARAMETER);
			symbol_243.getOwnedParameters().add(symbol_244);
			symbol_243.setPrecedence(symbol_6);
			symbol_243.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionEqualOperation.INSTANCE);
			symbol_61.getOwnedOperations().add(symbol_243);
		}
		{	// ocl::stdlib24::Bag::excluding() stdlib24.Bag{T}.excluding(stdlib24.OclAny)
			Operation symbol_245 = PivotFactory.eINSTANCE.createOperation();
			symbol_245.setName("excluding");
			symbol_245.setType(symbol_13);
			Parameter symbol_246 = PivotFactory.eINSTANCE.createParameter();
			symbol_246.setName("object");
			symbol_246.setType(symbol_99);
			symbol_246.setIteratorKind(IteratorKind.PARAMETER);
			symbol_245.getOwnedParameters().add(symbol_246);
			symbol_245.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_61.getOwnedOperations().add(symbol_245);
		}
		{	// ocl::stdlib24::Bag::flatten() stdlib24.Bag{T}.flatten{T2}()
			Operation symbol_247 = PivotFactory.eINSTANCE.createOperation();
			symbol_67.setName("T2");
			symbol_66.setOwnedParameteredElement(symbol_67);
			symbol_65.getOwnedParameters().add(symbol_66);
			
			symbol_247.setOwnedTemplateSignature(symbol_65);
			symbol_247.setName("flatten");
			symbol_247.setType(symbol_16);
			symbol_247.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_61.getOwnedOperations().add(symbol_247);
		}
		{	// ocl::stdlib24::Bag::including() stdlib24.Bag{T}.including(stdlib24.Bag{T}?T)
			Operation symbol_248 = PivotFactory.eINSTANCE.createOperation();
			symbol_248.setName("including");
			symbol_248.setType(symbol_13);
			Parameter symbol_249 = PivotFactory.eINSTANCE.createParameter();
			symbol_249.setName("object");
			symbol_249.setType(symbol_64);
			symbol_249.setIteratorKind(IteratorKind.PARAMETER);
			symbol_248.getOwnedParameters().add(symbol_249);
			symbol_248.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_61.getOwnedOperations().add(symbol_248);
		}
		{	// ocl::stdlib24::Bag::reject() stdlib24.Bag{T}.reject(stdlib24.Bag{T}?T)
			Operation symbol_250 = PivotFactory.eINSTANCE.createOperation();
			symbol_250.setName("reject");
			symbol_250.setType(symbol_13);
			Parameter symbol_251 = PivotFactory.eINSTANCE.createParameter();
			symbol_251.setName("i");
			symbol_251.setType(symbol_64);
			symbol_251.setIteratorKind(IteratorKind.ITERATOR);
			symbol_250.getOwnedParameters().add(symbol_251);
			symbol_250.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_61.getOwnedOperations().add(symbol_250);
		}
		{	// ocl::stdlib24::Bag::select() stdlib24.Bag{T}.select(stdlib24.Bag{T}?T)
			Operation symbol_252 = PivotFactory.eINSTANCE.createOperation();
			symbol_252.setName("select");
			symbol_252.setType(symbol_13);
			Parameter symbol_253 = PivotFactory.eINSTANCE.createParameter();
			symbol_253.setName("i");
			symbol_253.setType(symbol_64);
			symbol_253.setIteratorKind(IteratorKind.ITERATOR);
			symbol_252.getOwnedParameters().add(symbol_253);
			symbol_252.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_61.getOwnedOperations().add(symbol_252);
		}
		symbol_60.getOwnedTypes().add(symbol_61);
		//
		// ocl::stdlib24::Boolean stdlib24.Boolean
		//
		symbol_68.setName("Boolean");
		symbol_68.setPrimitive(Boolean.TRUE);
		symbol_68.getSuperClasses().add(symbol_99);
		{	// ocl::stdlib24::Boolean::<>() stdlib24.Boolean.<>(stdlib24.OclAny)
			Operation symbol_254 = PivotFactory.eINSTANCE.createOperation();
			symbol_254.setName("<>");
			symbol_254.setType(symbol_68);
			Parameter symbol_255 = PivotFactory.eINSTANCE.createParameter();
			symbol_255.setName("object2");
			symbol_255.setType(symbol_99);
			symbol_255.setIteratorKind(IteratorKind.PARAMETER);
			symbol_254.getOwnedParameters().add(symbol_255);
			symbol_254.setPrecedence(symbol_6);
			symbol_254.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanNotEqualOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_254);
		}
		{	// ocl::stdlib24::Boolean::=() stdlib24.Boolean.=(stdlib24.OclAny)
			Operation symbol_256 = PivotFactory.eINSTANCE.createOperation();
			symbol_256.setName("=");
			symbol_256.setType(symbol_68);
			Parameter symbol_257 = PivotFactory.eINSTANCE.createParameter();
			symbol_257.setName("object2");
			symbol_257.setType(symbol_99);
			symbol_257.setIteratorKind(IteratorKind.PARAMETER);
			symbol_256.getOwnedParameters().add(symbol_257);
			symbol_256.setPrecedence(symbol_6);
			symbol_256.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanEqualOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_256);
		}
		{	// ocl::stdlib24::Boolean::allInstances() stdlib24.Boolean.allInstances()
			Operation symbol_258 = PivotFactory.eINSTANCE.createOperation();
			symbol_258.setName("allInstances");
			symbol_258.setType(symbol_56);
			symbol_258.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_258);
		}
		{	// ocl::stdlib24::Boolean::and() stdlib24.Boolean.and(stdlib24.Boolean)
			Operation symbol_259 = PivotFactory.eINSTANCE.createOperation();
			symbol_259.setName("and");
			symbol_259.setType(symbol_68);
			Parameter symbol_260 = PivotFactory.eINSTANCE.createParameter();
			symbol_260.setName("b");
			symbol_260.setType(symbol_68);
			symbol_260.setIteratorKind(IteratorKind.PARAMETER);
			symbol_259.getOwnedParameters().add(symbol_260);
			symbol_259.setPrecedence(symbol_8);
			symbol_259.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_259);
		}
		{	// ocl::stdlib24::Boolean::implies() stdlib24.Boolean.implies(stdlib24.Boolean)
			Operation symbol_261 = PivotFactory.eINSTANCE.createOperation();
			symbol_261.setName("implies");
			symbol_261.setType(symbol_68);
			Parameter symbol_262 = PivotFactory.eINSTANCE.createParameter();
			symbol_262.setName("b");
			symbol_262.setType(symbol_68);
			symbol_262.setIteratorKind(IteratorKind.PARAMETER);
			symbol_261.getOwnedParameters().add(symbol_262);
			symbol_261.setPrecedence(symbol_2);
			symbol_261.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_261);
		}
		{	// ocl::stdlib24::Boolean::not() stdlib24.Boolean.not()
			Operation symbol_263 = PivotFactory.eINSTANCE.createOperation();
			symbol_263.setName("not");
			symbol_263.setType(symbol_68);
			symbol_263.setPrecedence(symbol_4);
			symbol_263.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_263);
		}
		{	// ocl::stdlib24::Boolean::or() stdlib24.Boolean.or(stdlib24.Boolean)
			Operation symbol_264 = PivotFactory.eINSTANCE.createOperation();
			symbol_264.setName("or");
			symbol_264.setType(symbol_68);
			Parameter symbol_265 = PivotFactory.eINSTANCE.createParameter();
			symbol_265.setName("b");
			symbol_265.setType(symbol_68);
			symbol_265.setIteratorKind(IteratorKind.PARAMETER);
			symbol_264.getOwnedParameters().add(symbol_265);
			symbol_264.setPrecedence(symbol_5);
			symbol_264.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_264);
		}
		{	// ocl::stdlib24::Boolean::toString() stdlib24.Boolean.toString()
			Operation symbol_266 = PivotFactory.eINSTANCE.createOperation();
			symbol_266.setName("toString");
			symbol_266.setType(symbol_134);
			symbol_266.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_266);
		}
		{	// ocl::stdlib24::Boolean::xor() stdlib24.Boolean.xor(stdlib24.Boolean)
			Operation symbol_267 = PivotFactory.eINSTANCE.createOperation();
			symbol_267.setName("xor");
			symbol_267.setType(symbol_68);
			Parameter symbol_268 = PivotFactory.eINSTANCE.createParameter();
			symbol_268.setName("b");
			symbol_268.setType(symbol_68);
			symbol_268.setIteratorKind(IteratorKind.PARAMETER);
			symbol_267.getOwnedParameters().add(symbol_268);
			symbol_267.setPrecedence(symbol_9);
			symbol_267.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_267);
		}
		symbol_60.getOwnedTypes().add(symbol_68);
		//
		// ocl::stdlib24::Classifier stdlib24.Classifier
		//
		symbol_69.setName("Classifier");
		symbol_69.getSuperClasses().add(symbol_99);
		{	// ocl::stdlib24::Classifier::allInstances() stdlib24.Classifier.allInstances()
			Operation symbol_269 = PivotFactory.eINSTANCE.createOperation();
			symbol_269.setName("allInstances");
			symbol_269.setType(symbol_47);
			symbol_269.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
			symbol_69.getOwnedOperations().add(symbol_269);
		}
		symbol_60.getOwnedTypes().add(symbol_69);
		//
		// ocl::stdlib24::Collection stdlib24.Collection{T}
		//
		symbol_70.setName("Collection");
		symbol_73.setName("T");
		symbol_72.setOwnedParameteredElement(symbol_73);
		symbol_71.getOwnedParameters().add(symbol_72);
		
		symbol_70.setOwnedTemplateSignature(symbol_71);
		symbol_70.getSuperClasses().add(symbol_99);
		{	// ocl::stdlib24::Collection::<>() stdlib24.Collection{T}.<>(stdlib24.OclAny)
			Operation symbol_270 = PivotFactory.eINSTANCE.createOperation();
			symbol_270.setName("<>");
			symbol_270.setType(symbol_68);
			Parameter symbol_271 = PivotFactory.eINSTANCE.createParameter();
			symbol_271.setName("c");
			symbol_271.setType(symbol_99);
			symbol_271.setIteratorKind(IteratorKind.PARAMETER);
			symbol_270.getOwnedParameters().add(symbol_271);
			symbol_270.setPrecedence(symbol_6);
			symbol_270.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEqualOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_270);
		}
		{	// ocl::stdlib24::Collection::=() stdlib24.Collection{T}.=(stdlib24.OclAny)
			Operation symbol_272 = PivotFactory.eINSTANCE.createOperation();
			symbol_272.setName("=");
			symbol_272.setType(symbol_68);
			Parameter symbol_273 = PivotFactory.eINSTANCE.createParameter();
			symbol_273.setName("c");
			symbol_273.setType(symbol_99);
			symbol_273.setIteratorKind(IteratorKind.PARAMETER);
			symbol_272.getOwnedParameters().add(symbol_273);
			symbol_272.setPrecedence(symbol_6);
			symbol_272.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionEqualOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_272);
		}
		{	// ocl::stdlib24::Collection::any() stdlib24.Collection{T}.any(stdlib24.Collection{T}?T)
			Operation symbol_274 = PivotFactory.eINSTANCE.createOperation();
			symbol_274.setName("any");
			symbol_274.setType(symbol_73);
			Parameter symbol_275 = PivotFactory.eINSTANCE.createParameter();
			symbol_275.setName("i");
			symbol_275.setType(symbol_73);
			symbol_275.setIteratorKind(IteratorKind.ITERATOR);
			symbol_274.getOwnedParameters().add(symbol_275);
			symbol_274.setImplementation(org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_274);
		}
		{	// ocl::stdlib24::Collection::asBag() stdlib24.Collection{T}.asBag()
			Operation symbol_276 = PivotFactory.eINSTANCE.createOperation();
			symbol_276.setName("asBag");
			symbol_276.setType(symbol_14);
			symbol_276.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_276);
		}
		{	// ocl::stdlib24::Collection::asOrderedSet() stdlib24.Collection{T}.asOrderedSet()
			Operation symbol_277 = PivotFactory.eINSTANCE.createOperation();
			symbol_277.setName("asOrderedSet");
			symbol_277.setType(symbol_37);
			symbol_277.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_277);
		}
		{	// ocl::stdlib24::Collection::asSequence() stdlib24.Collection{T}.asSequence()
			Operation symbol_278 = PivotFactory.eINSTANCE.createOperation();
			symbol_278.setName("asSequence");
			symbol_278.setType(symbol_40);
			symbol_278.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_278);
		}
		{	// ocl::stdlib24::Collection::asSet() stdlib24.Collection{T}.asSet()
			Operation symbol_279 = PivotFactory.eINSTANCE.createOperation();
			symbol_279.setName("asSet");
			symbol_279.setType(symbol_45);
			symbol_279.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_279);
		}
		{	// ocl::stdlib24::Collection::collect() stdlib24.Collection{T}.collect(stdlib24.Collection{T}?T)
			Operation symbol_280 = PivotFactory.eINSTANCE.createOperation();
			symbol_280.setName("collect");
			symbol_280.setType(symbol_19);
			Parameter symbol_281 = PivotFactory.eINSTANCE.createParameter();
			symbol_281.setName("i");
			symbol_281.setType(symbol_73);
			symbol_281.setIteratorKind(IteratorKind.ITERATOR);
			symbol_280.getOwnedParameters().add(symbol_281);
			symbol_280.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_280);
		}
		{	// ocl::stdlib24::Collection::collectNested() stdlib24.Collection{T}.collectNested(stdlib24.Collection{T}?T)
			Operation symbol_282 = PivotFactory.eINSTANCE.createOperation();
			symbol_282.setName("collectNested");
			symbol_282.setType(symbol_19);
			Parameter symbol_283 = PivotFactory.eINSTANCE.createParameter();
			symbol_283.setName("i");
			symbol_283.setType(symbol_73);
			symbol_283.setIteratorKind(IteratorKind.ITERATOR);
			symbol_282.getOwnedParameters().add(symbol_283);
			symbol_282.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_282);
		}
		{	// ocl::stdlib24::Collection::count() stdlib24.Collection{T}.count(stdlib24.OclAny)
			Operation symbol_284 = PivotFactory.eINSTANCE.createOperation();
			symbol_284.setName("count");
			symbol_284.setType(symbol_90);
			Parameter symbol_285 = PivotFactory.eINSTANCE.createParameter();
			symbol_285.setName("object");
			symbol_285.setType(symbol_99);
			symbol_285.setIteratorKind(IteratorKind.PARAMETER);
			symbol_284.getOwnedParameters().add(symbol_285);
			symbol_284.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_284);
		}
		{	// ocl::stdlib24::Collection::excludes() stdlib24.Collection{T}.excludes(stdlib24.OclAny)
			Operation symbol_286 = PivotFactory.eINSTANCE.createOperation();
			symbol_286.setName("excludes");
			symbol_286.setType(symbol_68);
			Parameter symbol_287 = PivotFactory.eINSTANCE.createParameter();
			symbol_287.setName("object");
			symbol_287.setType(symbol_99);
			symbol_287.setIteratorKind(IteratorKind.PARAMETER);
			symbol_286.getOwnedParameters().add(symbol_287);
			symbol_286.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_286);
		}
		{	// ocl::stdlib24::Collection::excludesAll() stdlib24.Collection{T}.excludesAll{T2}(stdlib24.Collection[T2])
			Operation symbol_288 = PivotFactory.eINSTANCE.createOperation();
			symbol_76.setName("T2");
			symbol_75.setOwnedParameteredElement(symbol_76);
			symbol_74.getOwnedParameters().add(symbol_75);
			
			symbol_288.setOwnedTemplateSignature(symbol_74);
			symbol_288.setName("excludesAll");
			symbol_288.setType(symbol_68);
			Parameter symbol_289 = PivotFactory.eINSTANCE.createParameter();
			symbol_289.setName("c2");
			symbol_289.setType(symbol_17);
			symbol_289.setIteratorKind(IteratorKind.PARAMETER);
			symbol_288.getOwnedParameters().add(symbol_289);
			symbol_288.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_288);
		}
		{	// ocl::stdlib24::Collection::excluding() stdlib24.Collection{T}.excluding(stdlib24.OclAny)
			Operation symbol_290 = PivotFactory.eINSTANCE.createOperation();
			symbol_290.setName("excluding");
			symbol_290.setType(symbol_19);
			Parameter symbol_291 = PivotFactory.eINSTANCE.createParameter();
			symbol_291.setName("object");
			symbol_291.setType(symbol_99);
			symbol_291.setIteratorKind(IteratorKind.PARAMETER);
			symbol_290.getOwnedParameters().add(symbol_291);
			symbol_290.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_290);
		}
		{	// ocl::stdlib24::Collection::exists() stdlib24.Collection{T}.exists(stdlib24.Collection{T}?T)
			Operation symbol_292 = PivotFactory.eINSTANCE.createOperation();
			symbol_292.setName("exists");
			symbol_292.setType(symbol_68);
			Parameter symbol_293 = PivotFactory.eINSTANCE.createParameter();
			symbol_293.setName("i");
			symbol_293.setType(symbol_73);
			symbol_293.setIteratorKind(IteratorKind.ITERATOR);
			symbol_292.getOwnedParameters().add(symbol_293);
			symbol_292.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_292);
		}
		{	// ocl::stdlib24::Collection::exists() stdlib24.Collection{T}.exists(stdlib24.Collection{T}?T;T)
			Operation symbol_294 = PivotFactory.eINSTANCE.createOperation();
			symbol_294.setName("exists");
			symbol_294.setType(symbol_68);
			Parameter symbol_295 = PivotFactory.eINSTANCE.createParameter();
			symbol_295.setName("i");
			symbol_295.setType(symbol_73);
			symbol_295.setIteratorKind(IteratorKind.ITERATOR);
			symbol_294.getOwnedParameters().add(symbol_295);
			Parameter symbol_296 = PivotFactory.eINSTANCE.createParameter();
			symbol_296.setName("j");
			symbol_296.setType(symbol_73);
			symbol_296.setIteratorKind(IteratorKind.ITERATOR);
			symbol_294.getOwnedParameters().add(symbol_296);
			symbol_294.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_294);
		}
		{	// ocl::stdlib24::Collection::flatten() stdlib24.Collection{T}.flatten{T2}()
			Operation symbol_297 = PivotFactory.eINSTANCE.createOperation();
			symbol_79.setName("T2");
			symbol_78.setOwnedParameteredElement(symbol_79);
			symbol_77.getOwnedParameters().add(symbol_78);
			
			symbol_297.setOwnedTemplateSignature(symbol_77);
			symbol_297.setName("flatten");
			symbol_297.setType(symbol_25);
			symbol_297.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_297);
		}
		{	// ocl::stdlib24::Collection::forAll() stdlib24.Collection{T}.forAll(stdlib24.Collection{T}?T)
			Operation symbol_298 = PivotFactory.eINSTANCE.createOperation();
			symbol_298.setName("forAll");
			symbol_298.setType(symbol_68);
			Parameter symbol_299 = PivotFactory.eINSTANCE.createParameter();
			symbol_299.setName("i");
			symbol_299.setType(symbol_73);
			symbol_299.setIteratorKind(IteratorKind.ITERATOR);
			symbol_298.getOwnedParameters().add(symbol_299);
			symbol_298.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_298);
		}
		{	// ocl::stdlib24::Collection::forAll() stdlib24.Collection{T}.forAll(stdlib24.Collection{T}?T;T)
			Operation symbol_300 = PivotFactory.eINSTANCE.createOperation();
			symbol_300.setName("forAll");
			symbol_300.setType(symbol_68);
			Parameter symbol_301 = PivotFactory.eINSTANCE.createParameter();
			symbol_301.setName("i");
			symbol_301.setType(symbol_73);
			symbol_301.setIteratorKind(IteratorKind.ITERATOR);
			symbol_300.getOwnedParameters().add(symbol_301);
			Parameter symbol_302 = PivotFactory.eINSTANCE.createParameter();
			symbol_302.setName("j");
			symbol_302.setType(symbol_73);
			symbol_302.setIteratorKind(IteratorKind.ITERATOR);
			symbol_300.getOwnedParameters().add(symbol_302);
			symbol_300.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_300);
		}
		{	// ocl::stdlib24::Collection::includes() stdlib24.Collection{T}.includes(stdlib24.OclAny)
			Operation symbol_303 = PivotFactory.eINSTANCE.createOperation();
			symbol_303.setName("includes");
			symbol_303.setType(symbol_68);
			Parameter symbol_304 = PivotFactory.eINSTANCE.createParameter();
			symbol_304.setName("object");
			symbol_304.setType(symbol_99);
			symbol_304.setIteratorKind(IteratorKind.PARAMETER);
			symbol_303.getOwnedParameters().add(symbol_304);
			symbol_303.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_303);
		}
		{	// ocl::stdlib24::Collection::includesAll() stdlib24.Collection{T}.includesAll{T2}(stdlib24.Collection[T2])
			Operation symbol_305 = PivotFactory.eINSTANCE.createOperation();
			symbol_82.setName("T2");
			symbol_81.setOwnedParameteredElement(symbol_82);
			symbol_80.getOwnedParameters().add(symbol_81);
			
			symbol_305.setOwnedTemplateSignature(symbol_80);
			symbol_305.setName("includesAll");
			symbol_305.setType(symbol_68);
			Parameter symbol_306 = PivotFactory.eINSTANCE.createParameter();
			symbol_306.setName("c2");
			symbol_306.setType(symbol_23);
			symbol_306.setIteratorKind(IteratorKind.PARAMETER);
			symbol_305.getOwnedParameters().add(symbol_306);
			symbol_305.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_305);
		}
		{	// ocl::stdlib24::Collection::including() stdlib24.Collection{T}.including(stdlib24.Collection{T}?T)
			Operation symbol_307 = PivotFactory.eINSTANCE.createOperation();
			symbol_307.setName("including");
			symbol_307.setType(symbol_19);
			Parameter symbol_308 = PivotFactory.eINSTANCE.createParameter();
			symbol_308.setName("object");
			symbol_308.setType(symbol_73);
			symbol_308.setIteratorKind(IteratorKind.PARAMETER);
			symbol_307.getOwnedParameters().add(symbol_308);
			symbol_307.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_307);
		}
		{	// ocl::stdlib24::Collection::isEmpty() stdlib24.Collection{T}.isEmpty()
			Operation symbol_309 = PivotFactory.eINSTANCE.createOperation();
			symbol_309.setName("isEmpty");
			symbol_309.setType(symbol_68);
			symbol_309.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_309);
		}
		{	// ocl::stdlib24::Collection::isUnique() stdlib24.Collection{T}.isUnique(stdlib24.Collection{T}?T)
			Operation symbol_310 = PivotFactory.eINSTANCE.createOperation();
			symbol_310.setName("isUnique");
			symbol_310.setType(symbol_68);
			Parameter symbol_311 = PivotFactory.eINSTANCE.createParameter();
			symbol_311.setName("i");
			symbol_311.setType(symbol_73);
			symbol_311.setIteratorKind(IteratorKind.ITERATOR);
			symbol_310.getOwnedParameters().add(symbol_311);
			symbol_310.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_310);
		}
		{	// ocl::stdlib24::Collection::iterate() stdlib24.Collection{T}.iterate{Tacc}(stdlib24.Collection{T}?T;Tacc)
			Operation symbol_312 = PivotFactory.eINSTANCE.createOperation();
			symbol_85.setName("Tacc");
			symbol_84.setOwnedParameteredElement(symbol_85);
			symbol_83.getOwnedParameters().add(symbol_84);
			
			symbol_312.setOwnedTemplateSignature(symbol_83);
			symbol_312.setName("iterate");
			symbol_312.setType(symbol_85);
			Parameter symbol_313 = PivotFactory.eINSTANCE.createParameter();
			symbol_313.setName("i");
			symbol_313.setType(symbol_73);
			symbol_313.setIteratorKind(IteratorKind.ITERATOR);
			symbol_312.getOwnedParameters().add(symbol_313);
			Parameter symbol_314 = PivotFactory.eINSTANCE.createParameter();
			symbol_314.setName("acc");
			symbol_314.setType(symbol_85);
			symbol_314.setIteratorKind(IteratorKind.ACCUMULATOR);
			symbol_312.getOwnedParameters().add(symbol_314);
			symbol_312.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_312);
		}
		{	// ocl::stdlib24::Collection::max() stdlib24.Collection{T}.max()
			Operation symbol_315 = PivotFactory.eINSTANCE.createOperation();
			symbol_315.setName("max");
			symbol_315.setType(symbol_73);
			symbol_315.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_315);
		}
		{	// ocl::stdlib24::Collection::min() stdlib24.Collection{T}.min()
			Operation symbol_316 = PivotFactory.eINSTANCE.createOperation();
			symbol_316.setName("min");
			symbol_316.setType(symbol_73);
			symbol_316.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_316);
		}
		{	// ocl::stdlib24::Collection::notEmpty() stdlib24.Collection{T}.notEmpty()
			Operation symbol_317 = PivotFactory.eINSTANCE.createOperation();
			symbol_317.setName("notEmpty");
			symbol_317.setType(symbol_68);
			symbol_317.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_317);
		}
		{	// ocl::stdlib24::Collection::one() stdlib24.Collection{T}.one(stdlib24.Collection{T}?T)
			Operation symbol_318 = PivotFactory.eINSTANCE.createOperation();
			symbol_318.setName("one");
			symbol_318.setType(symbol_68);
			Parameter symbol_319 = PivotFactory.eINSTANCE.createParameter();
			symbol_319.setName("i");
			symbol_319.setType(symbol_73);
			symbol_319.setIteratorKind(IteratorKind.ITERATOR);
			symbol_318.getOwnedParameters().add(symbol_319);
			symbol_318.setImplementation(org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_318);
		}
		{	// ocl::stdlib24::Collection::product() stdlib24.Collection{T}.product{T2}(stdlib24.Collection[T2])
			Operation symbol_320 = PivotFactory.eINSTANCE.createOperation();
			symbol_88.setName("T2");
			symbol_87.setOwnedParameteredElement(symbol_88);
			symbol_86.getOwnedParameters().add(symbol_87);
			
			symbol_320.setOwnedTemplateSignature(symbol_86);
			symbol_320.setName("product");
			symbol_320.setType(symbol_48);
			Parameter symbol_321 = PivotFactory.eINSTANCE.createParameter();
			symbol_321.setName("c2");
			symbol_321.setType(symbol_21);
			symbol_321.setIteratorKind(IteratorKind.PARAMETER);
			symbol_320.getOwnedParameters().add(symbol_321);
			symbol_320.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_320);
		}
		{	// ocl::stdlib24::Collection::reject() stdlib24.Collection{T}.reject(stdlib24.Collection{T}?T)
			Operation symbol_322 = PivotFactory.eINSTANCE.createOperation();
			symbol_322.setName("reject");
			symbol_322.setType(symbol_19);
			Parameter symbol_323 = PivotFactory.eINSTANCE.createParameter();
			symbol_323.setName("i");
			symbol_323.setType(symbol_73);
			symbol_323.setIteratorKind(IteratorKind.ITERATOR);
			symbol_322.getOwnedParameters().add(symbol_323);
			symbol_322.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_322);
		}
		{	// ocl::stdlib24::Collection::select() stdlib24.Collection{T}.select(stdlib24.Collection{T}?T)
			Operation symbol_324 = PivotFactory.eINSTANCE.createOperation();
			symbol_324.setName("select");
			symbol_324.setType(symbol_19);
			Parameter symbol_325 = PivotFactory.eINSTANCE.createParameter();
			symbol_325.setName("i");
			symbol_325.setType(symbol_73);
			symbol_325.setIteratorKind(IteratorKind.ITERATOR);
			symbol_324.getOwnedParameters().add(symbol_325);
			symbol_324.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_324);
		}
		{	// ocl::stdlib24::Collection::size() stdlib24.Collection{T}.size()
			Operation symbol_326 = PivotFactory.eINSTANCE.createOperation();
			symbol_326.setName("size");
			symbol_326.setType(symbol_90);
			symbol_326.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_326);
		}
		{	// ocl::stdlib24::Collection::sortedBy() stdlib24.Collection{T}.sortedBy(stdlib24.Collection{T}?T)
			Operation symbol_327 = PivotFactory.eINSTANCE.createOperation();
			symbol_327.setName("sortedBy");
			symbol_327.setType(symbol_31);
			Parameter symbol_328 = PivotFactory.eINSTANCE.createParameter();
			symbol_328.setName("i");
			symbol_328.setType(symbol_73);
			symbol_328.setIteratorKind(IteratorKind.ITERATOR);
			symbol_327.getOwnedParameters().add(symbol_328);
			symbol_327.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_327);
		}
		{	// ocl::stdlib24::Collection::sum() stdlib24.Collection{T}.sum()
			Operation symbol_329 = PivotFactory.eINSTANCE.createOperation();
			symbol_329.setName("sum");
			symbol_329.setType(symbol_73);
			symbol_329.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
			symbol_70.getOwnedOperations().add(symbol_329);
		}
		symbol_60.getOwnedTypes().add(symbol_70);
		//
		// ocl::stdlib24::Enumeration stdlib24.Enumeration
		//
		symbol_89.setName("Enumeration");
		symbol_89.getSuperClasses().add(symbol_99);
		{	// ocl::stdlib24::Enumeration::allInstances() stdlib24.Enumeration.allInstances()
			Operation symbol_330 = PivotFactory.eINSTANCE.createOperation();
			symbol_330.setName("allInstances");
			symbol_330.setType(symbol_54);
			symbol_330.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
			symbol_89.getOwnedOperations().add(symbol_330);
		}
		symbol_60.getOwnedTypes().add(symbol_89);
		//
		// ocl::stdlib24::Integer stdlib24.Integer
		//
		symbol_90.setName("Integer");
		symbol_90.setPrimitive(Boolean.TRUE);
		symbol_90.getSuperClasses().add(symbol_116);
		{	// ocl::stdlib24::Integer::*() stdlib24.Integer.*(stdlib24.Integer)
			Operation symbol_331 = PivotFactory.eINSTANCE.createOperation();
			symbol_331.setName("*");
			symbol_331.setType(symbol_90);
			Parameter symbol_332 = PivotFactory.eINSTANCE.createParameter();
			symbol_332.setName("i");
			symbol_332.setType(symbol_90);
			symbol_332.setIteratorKind(IteratorKind.PARAMETER);
			symbol_331.getOwnedParameters().add(symbol_332);
			symbol_331.setPrecedence(symbol_3);
			symbol_331.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_331);
		}
		{	// ocl::stdlib24::Integer::+() stdlib24.Integer.+(stdlib24.Integer)
			Operation symbol_333 = PivotFactory.eINSTANCE.createOperation();
			symbol_333.setName("+");
			symbol_333.setType(symbol_90);
			Parameter symbol_334 = PivotFactory.eINSTANCE.createParameter();
			symbol_334.setName("i");
			symbol_334.setType(symbol_90);
			symbol_334.setIteratorKind(IteratorKind.PARAMETER);
			symbol_333.getOwnedParameters().add(symbol_334);
			symbol_333.setPrecedence(symbol_10);
			symbol_333.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericPlusOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_333);
		}
		{	// ocl::stdlib24::Integer::-() stdlib24.Integer.-()
			Operation symbol_335 = PivotFactory.eINSTANCE.createOperation();
			symbol_335.setName("-");
			symbol_335.setType(symbol_90);
			symbol_335.setPrecedence(symbol_4);
			symbol_335.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_335);
		}
		{	// ocl::stdlib24::Integer::-() stdlib24.Integer.-(stdlib24.Integer)
			Operation symbol_336 = PivotFactory.eINSTANCE.createOperation();
			symbol_336.setName("-");
			symbol_336.setType(symbol_90);
			Parameter symbol_337 = PivotFactory.eINSTANCE.createParameter();
			symbol_337.setName("i");
			symbol_337.setType(symbol_90);
			symbol_337.setIteratorKind(IteratorKind.PARAMETER);
			symbol_336.getOwnedParameters().add(symbol_337);
			symbol_336.setPrecedence(symbol_10);
			symbol_336.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinusOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_336);
		}
		{	// ocl::stdlib24::Integer::/() stdlib24.Integer./(stdlib24.Integer)
			Operation symbol_338 = PivotFactory.eINSTANCE.createOperation();
			symbol_338.setName("/");
			symbol_338.setType(symbol_116);
			Parameter symbol_339 = PivotFactory.eINSTANCE.createParameter();
			symbol_339.setName("i");
			symbol_339.setType(symbol_90);
			symbol_339.setIteratorKind(IteratorKind.PARAMETER);
			symbol_338.getOwnedParameters().add(symbol_339);
			symbol_338.setPrecedence(symbol_3);
			symbol_338.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_338);
		}
		{	// ocl::stdlib24::Integer::abs() stdlib24.Integer.abs()
			Operation symbol_340 = PivotFactory.eINSTANCE.createOperation();
			symbol_340.setName("abs");
			symbol_340.setType(symbol_90);
			symbol_340.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_340);
		}
		{	// ocl::stdlib24::Integer::div() stdlib24.Integer.div(stdlib24.Integer)
			Operation symbol_341 = PivotFactory.eINSTANCE.createOperation();
			symbol_341.setName("div");
			symbol_341.setType(symbol_90);
			Parameter symbol_342 = PivotFactory.eINSTANCE.createParameter();
			symbol_342.setName("i");
			symbol_342.setType(symbol_90);
			symbol_342.setIteratorKind(IteratorKind.PARAMETER);
			symbol_341.getOwnedParameters().add(symbol_342);
			symbol_341.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_341);
		}
		{	// ocl::stdlib24::Integer::max() stdlib24.Integer.max(stdlib24.Integer)
			Operation symbol_343 = PivotFactory.eINSTANCE.createOperation();
			symbol_343.setName("max");
			symbol_343.setType(symbol_90);
			Parameter symbol_344 = PivotFactory.eINSTANCE.createParameter();
			symbol_344.setName("i");
			symbol_344.setType(symbol_90);
			symbol_344.setIteratorKind(IteratorKind.PARAMETER);
			symbol_343.getOwnedParameters().add(symbol_344);
			symbol_343.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_343);
		}
		{	// ocl::stdlib24::Integer::min() stdlib24.Integer.min(stdlib24.Integer)
			Operation symbol_345 = PivotFactory.eINSTANCE.createOperation();
			symbol_345.setName("min");
			symbol_345.setType(symbol_90);
			Parameter symbol_346 = PivotFactory.eINSTANCE.createParameter();
			symbol_346.setName("i");
			symbol_346.setType(symbol_90);
			symbol_346.setIteratorKind(IteratorKind.PARAMETER);
			symbol_345.getOwnedParameters().add(symbol_346);
			symbol_345.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_345);
		}
		{	// ocl::stdlib24::Integer::mod() stdlib24.Integer.mod(stdlib24.Integer)
			Operation symbol_347 = PivotFactory.eINSTANCE.createOperation();
			symbol_347.setName("mod");
			symbol_347.setType(symbol_90);
			Parameter symbol_348 = PivotFactory.eINSTANCE.createParameter();
			symbol_348.setName("i");
			symbol_348.setType(symbol_90);
			symbol_348.setIteratorKind(IteratorKind.PARAMETER);
			symbol_347.getOwnedParameters().add(symbol_348);
			symbol_347.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_347);
		}
		{	// ocl::stdlib24::Integer::toString() stdlib24.Integer.toString()
			Operation symbol_349 = PivotFactory.eINSTANCE.createOperation();
			symbol_349.setName("toString");
			symbol_349.setType(symbol_134);
			symbol_349.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_90.getOwnedOperations().add(symbol_349);
		}
		symbol_60.getOwnedTypes().add(symbol_90);
		//
		// ocl::stdlib24::NonOrderedCollection stdlib24.NonOrderedCollection{T}
		//
		symbol_91.setName("NonOrderedCollection");
		symbol_94.setName("T");
		symbol_93.setOwnedParameteredElement(symbol_94);
		symbol_92.getOwnedParameters().add(symbol_93);
		
		symbol_91.setOwnedTemplateSignature(symbol_92);
		symbol_91.getSuperClasses().add(symbol_24);
		{	// ocl::stdlib24::NonOrderedCollection::closure() stdlib24.NonOrderedCollection{T}.closure(stdlib24.NonOrderedCollection{T}?T)
			Operation symbol_350 = PivotFactory.eINSTANCE.createOperation();
			symbol_350.setName("closure");
			symbol_350.setType(symbol_50);
			Parameter symbol_351 = PivotFactory.eINSTANCE.createParameter();
			symbol_351.setName("i");
			symbol_351.setType(symbol_94);
			symbol_351.setIteratorKind(IteratorKind.ITERATOR);
			symbol_350.getOwnedParameters().add(symbol_351);
			symbol_350.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_91.getOwnedOperations().add(symbol_350);
		}
		{	// ocl::stdlib24::NonOrderedCollection::collect() stdlib24.NonOrderedCollection{T}.collect(stdlib24.NonOrderedCollection{T}?T)
			Operation symbol_352 = PivotFactory.eINSTANCE.createOperation();
			symbol_352.setName("collect");
			symbol_352.setType(symbol_15);
			Parameter symbol_353 = PivotFactory.eINSTANCE.createParameter();
			symbol_353.setName("i");
			symbol_353.setType(symbol_94);
			symbol_353.setIteratorKind(IteratorKind.ITERATOR);
			symbol_352.getOwnedParameters().add(symbol_353);
			symbol_352.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_91.getOwnedOperations().add(symbol_352);
		}
		{	// ocl::stdlib24::NonOrderedCollection::collectNested() stdlib24.NonOrderedCollection{T}.collectNested(stdlib24.NonOrderedCollection{T}?T)
			Operation symbol_354 = PivotFactory.eINSTANCE.createOperation();
			symbol_354.setName("collectNested");
			symbol_354.setType(symbol_15);
			Parameter symbol_355 = PivotFactory.eINSTANCE.createParameter();
			symbol_355.setName("i");
			symbol_355.setType(symbol_94);
			symbol_355.setIteratorKind(IteratorKind.ITERATOR);
			symbol_354.getOwnedParameters().add(symbol_355);
			symbol_354.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_91.getOwnedOperations().add(symbol_354);
		}
		{	// ocl::stdlib24::NonOrderedCollection::intersection() stdlib24.NonOrderedCollection{T}.intersection(stdlib24.Bag[stdlib24.NonOrderedCollection{T}?T])
			Operation symbol_356 = PivotFactory.eINSTANCE.createOperation();
			symbol_356.setName("intersection");
			symbol_356.setType(symbol_15);
			Parameter symbol_357 = PivotFactory.eINSTANCE.createParameter();
			symbol_357.setName("bag");
			symbol_357.setType(symbol_15);
			symbol_357.setIteratorKind(IteratorKind.PARAMETER);
			symbol_356.getOwnedParameters().add(symbol_357);
			symbol_356.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_91.getOwnedOperations().add(symbol_356);
		}
		{	// ocl::stdlib24::NonOrderedCollection::intersection() stdlib24.NonOrderedCollection{T}.intersection(stdlib24.Set[stdlib24.NonOrderedCollection{T}?T])
			Operation symbol_358 = PivotFactory.eINSTANCE.createOperation();
			symbol_358.setName("intersection");
			symbol_358.setType(symbol_50);
			Parameter symbol_359 = PivotFactory.eINSTANCE.createParameter();
			symbol_359.setName("s");
			symbol_359.setType(symbol_50);
			symbol_359.setIteratorKind(IteratorKind.PARAMETER);
			symbol_358.getOwnedParameters().add(symbol_359);
			symbol_358.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_91.getOwnedOperations().add(symbol_358);
		}
		{	// ocl::stdlib24::NonOrderedCollection::union() stdlib24.NonOrderedCollection{T}.union(stdlib24.Bag[stdlib24.NonOrderedCollection{T}?T])
			Operation symbol_360 = PivotFactory.eINSTANCE.createOperation();
			symbol_360.setName("union");
			symbol_360.setType(symbol_15);
			Parameter symbol_361 = PivotFactory.eINSTANCE.createParameter();
			symbol_361.setName("bag");
			symbol_361.setType(symbol_15);
			symbol_361.setIteratorKind(IteratorKind.PARAMETER);
			symbol_360.getOwnedParameters().add(symbol_361);
			symbol_360.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_91.getOwnedOperations().add(symbol_360);
		}
		{	// ocl::stdlib24::NonOrderedCollection::union() stdlib24.NonOrderedCollection{T}.union(stdlib24.Set[stdlib24.NonOrderedCollection{T}?T])
			Operation symbol_362 = PivotFactory.eINSTANCE.createOperation();
			symbol_362.setName("union");
			symbol_362.setType(symbol_50);
			Parameter symbol_363 = PivotFactory.eINSTANCE.createParameter();
			symbol_363.setName("s");
			symbol_363.setType(symbol_50);
			symbol_363.setIteratorKind(IteratorKind.PARAMETER);
			symbol_362.getOwnedParameters().add(symbol_363);
			symbol_362.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_91.getOwnedOperations().add(symbol_362);
		}
		symbol_60.getOwnedTypes().add(symbol_91);
		//
		// ocl::stdlib24::NonUniqueCollection stdlib24.NonUniqueCollection{T}
		//
		symbol_95.setName("NonUniqueCollection");
		symbol_98.setName("T");
		symbol_97.setOwnedParameteredElement(symbol_98);
		symbol_96.getOwnedParameters().add(symbol_97);
		
		symbol_95.setOwnedTemplateSignature(symbol_96);
		symbol_95.getSuperClasses().add(symbol_18);
		{	// ocl::stdlib24::NonUniqueCollection::sortedBy() stdlib24.NonUniqueCollection{T}.sortedBy(stdlib24.NonUniqueCollection{T}?T)
			Operation symbol_364 = PivotFactory.eINSTANCE.createOperation();
			symbol_364.setName("sortedBy");
			symbol_364.setType(symbol_42);
			Parameter symbol_365 = PivotFactory.eINSTANCE.createParameter();
			symbol_365.setName("i");
			symbol_365.setType(symbol_98);
			symbol_365.setIteratorKind(IteratorKind.ITERATOR);
			symbol_364.getOwnedParameters().add(symbol_365);
			symbol_364.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_364);
		}
		symbol_60.getOwnedTypes().add(symbol_95);
		//
		// ocl::stdlib24::OclAny stdlib24.OclAny
		//
		symbol_99.setName("OclAny");
		{	// ocl::stdlib24::OclAny::<>() stdlib24.OclAny.<>(stdlib24.OclAny)
			Operation symbol_366 = PivotFactory.eINSTANCE.createOperation();
			symbol_366.setName("<>");
			symbol_366.setType(symbol_68);
			Parameter symbol_367 = PivotFactory.eINSTANCE.createParameter();
			symbol_367.setName("object2");
			symbol_367.setType(symbol_99);
			symbol_367.setIteratorKind(IteratorKind.PARAMETER);
			symbol_366.getOwnedParameters().add(symbol_367);
			symbol_366.setPrecedence(symbol_6);
			symbol_366.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_366);
		}
		{	// ocl::stdlib24::OclAny::=() stdlib24.OclAny.=(stdlib24.OclAny)
			Operation symbol_368 = PivotFactory.eINSTANCE.createOperation();
			symbol_368.setName("=");
			symbol_368.setType(symbol_68);
			Parameter symbol_369 = PivotFactory.eINSTANCE.createParameter();
			symbol_369.setName("object2");
			symbol_369.setType(symbol_99);
			symbol_369.setIteratorKind(IteratorKind.PARAMETER);
			symbol_368.getOwnedParameters().add(symbol_369);
			symbol_368.setPrecedence(symbol_6);
			symbol_368.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_368);
		}
		{	// ocl::stdlib24::OclAny::oclAsSet() stdlib24.OclAny.oclAsSet()
			Operation symbol_370 = PivotFactory.eINSTANCE.createOperation();
			symbol_370.setName("oclAsSet");
			symbol_370.setType(symbol_22);
			symbol_370.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_370);
		}
		{	// ocl::stdlib24::OclAny::oclAsType() stdlib24.OclAny.oclAsType{T}(stdlib24.Classifier)
			Operation symbol_371 = PivotFactory.eINSTANCE.createOperation();
			symbol_102.setName("T");
			symbol_101.setOwnedParameteredElement(symbol_102);
			symbol_100.getOwnedParameters().add(symbol_101);
			
			symbol_371.setOwnedTemplateSignature(symbol_100);
			symbol_371.setName("oclAsType");
			symbol_371.setType(symbol_102);
			Parameter symbol_372 = PivotFactory.eINSTANCE.createParameter();
			symbol_372.setName("type");
			symbol_372.setType(symbol_69);
			symbol_372.setIteratorKind(IteratorKind.PARAMETER);
			symbol_371.getOwnedParameters().add(symbol_372);
			symbol_371.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_371);
		}
		{	// ocl::stdlib24::OclAny::oclIsInState() stdlib24.OclAny.oclIsInState(stdlib24.OclState)
			Operation symbol_373 = PivotFactory.eINSTANCE.createOperation();
			symbol_373.setName("oclIsInState");
			symbol_373.setType(symbol_68);
			Parameter symbol_374 = PivotFactory.eINSTANCE.createParameter();
			symbol_374.setName("statespec");
			symbol_374.setType(symbol_105);
			symbol_374.setIteratorKind(IteratorKind.PARAMETER);
			symbol_373.getOwnedParameters().add(symbol_374);
			symbol_373.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_373);
		}
		{	// ocl::stdlib24::OclAny::oclIsInvalid() stdlib24.OclAny.oclIsInvalid()
			Operation symbol_375 = PivotFactory.eINSTANCE.createOperation();
			symbol_375.setName("oclIsInvalid");
			symbol_375.setType(symbol_68);
			symbol_375.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_375);
		}
		{	// ocl::stdlib24::OclAny::oclIsKindOf() stdlib24.OclAny.oclIsKindOf(stdlib24.Classifier)
			Operation symbol_376 = PivotFactory.eINSTANCE.createOperation();
			symbol_376.setName("oclIsKindOf");
			symbol_376.setType(symbol_68);
			Parameter symbol_377 = PivotFactory.eINSTANCE.createParameter();
			symbol_377.setName("type");
			symbol_377.setType(symbol_69);
			symbol_377.setIteratorKind(IteratorKind.PARAMETER);
			symbol_376.getOwnedParameters().add(symbol_377);
			symbol_376.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_376);
		}
		{	// ocl::stdlib24::OclAny::oclIsNew() stdlib24.OclAny.oclIsNew()
			Operation symbol_378 = PivotFactory.eINSTANCE.createOperation();
			symbol_378.setName("oclIsNew");
			symbol_378.setType(symbol_68);
			symbol_378.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_378);
		}
		{	// ocl::stdlib24::OclAny::oclIsTypeOf() stdlib24.OclAny.oclIsTypeOf(stdlib24.Classifier)
			Operation symbol_379 = PivotFactory.eINSTANCE.createOperation();
			symbol_379.setName("oclIsTypeOf");
			symbol_379.setType(symbol_68);
			Parameter symbol_380 = PivotFactory.eINSTANCE.createParameter();
			symbol_380.setName("type");
			symbol_380.setType(symbol_69);
			symbol_380.setIteratorKind(IteratorKind.PARAMETER);
			symbol_379.getOwnedParameters().add(symbol_380);
			symbol_379.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_379);
		}
		{	// ocl::stdlib24::OclAny::oclIsUndefined() stdlib24.OclAny.oclIsUndefined()
			Operation symbol_381 = PivotFactory.eINSTANCE.createOperation();
			symbol_381.setName("oclIsUndefined");
			symbol_381.setType(symbol_68);
			symbol_381.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_381);
		}
		{	// ocl::stdlib24::OclAny::oclType() stdlib24.OclAny.oclType()
			Operation symbol_382 = PivotFactory.eINSTANCE.createOperation();
			symbol_382.setName("oclType");
			symbol_382.setType(symbol_69);
			symbol_382.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_99.getOwnedOperations().add(symbol_382);
		}
		symbol_60.getOwnedTypes().add(symbol_99);
		//
		// ocl::stdlib24::OclInvalid stdlib24.OclInvalid
		//
		symbol_103.setName("OclInvalid");
		symbol_103.getSuperClasses().add(symbol_107);
		{	// ocl::stdlib24::OclInvalid::<>() stdlib24.OclInvalid.<>(stdlib24.OclAny)
			Operation symbol_383 = PivotFactory.eINSTANCE.createOperation();
			symbol_383.setName("<>");
			symbol_383.setType(symbol_68);
			Parameter symbol_384 = PivotFactory.eINSTANCE.createParameter();
			symbol_384.setName("object2");
			symbol_384.setType(symbol_99);
			symbol_384.setIteratorKind(IteratorKind.PARAMETER);
			symbol_383.getOwnedParameters().add(symbol_384);
			symbol_383.setPrecedence(symbol_6);
			symbol_383.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidNotEqualOperation.INSTANCE);
			symbol_103.getOwnedOperations().add(symbol_383);
		}
		{	// ocl::stdlib24::OclInvalid::=() stdlib24.OclInvalid.=(stdlib24.OclAny)
			Operation symbol_385 = PivotFactory.eINSTANCE.createOperation();
			symbol_385.setName("=");
			symbol_385.setType(symbol_68);
			Parameter symbol_386 = PivotFactory.eINSTANCE.createParameter();
			symbol_386.setName("object2");
			symbol_386.setType(symbol_99);
			symbol_386.setIteratorKind(IteratorKind.PARAMETER);
			symbol_385.getOwnedParameters().add(symbol_386);
			symbol_385.setPrecedence(symbol_6);
			symbol_385.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidEqualOperation.INSTANCE);
			symbol_103.getOwnedOperations().add(symbol_385);
		}
		{	// ocl::stdlib24::OclInvalid::allInstances() stdlib24.OclInvalid.allInstances()
			Operation symbol_387 = PivotFactory.eINSTANCE.createOperation();
			symbol_387.setName("allInstances");
			symbol_387.setType(symbol_55);
			symbol_387.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
			symbol_103.getOwnedOperations().add(symbol_387);
		}
		symbol_60.getOwnedTypes().add(symbol_103);
		//
		// ocl::stdlib24::OclMessage stdlib24.OclMessage
		//
		symbol_104.setName("OclMessage");
		symbol_104.getSuperClasses().add(symbol_99);
		{	// ocl::stdlib24::OclMessage::hasReturned() stdlib24.OclMessage.hasReturned()
			Operation symbol_388 = PivotFactory.eINSTANCE.createOperation();
			symbol_388.setName("hasReturned");
			symbol_388.setType(symbol_68);
			symbol_388.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_104.getOwnedOperations().add(symbol_388);
		}
		{	// ocl::stdlib24::OclMessage::isOperationCall() stdlib24.OclMessage.isOperationCall()
			Operation symbol_389 = PivotFactory.eINSTANCE.createOperation();
			symbol_389.setName("isOperationCall");
			symbol_389.setType(symbol_68);
			symbol_389.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_104.getOwnedOperations().add(symbol_389);
		}
		{	// ocl::stdlib24::OclMessage::isSignalSent() stdlib24.OclMessage.isSignalSent()
			Operation symbol_390 = PivotFactory.eINSTANCE.createOperation();
			symbol_390.setName("isSignalSent");
			symbol_390.setType(symbol_68);
			symbol_390.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_104.getOwnedOperations().add(symbol_390);
		}
		{	// ocl::stdlib24::OclMessage::result() stdlib24.OclMessage.result()
			Operation symbol_391 = PivotFactory.eINSTANCE.createOperation();
			symbol_391.setName("result");
			symbol_391.setType(symbol_99);
			symbol_391.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_104.getOwnedOperations().add(symbol_391);
		}
		symbol_60.getOwnedTypes().add(symbol_104);
		//
		// ocl::stdlib24::OclState stdlib24.OclState
		//
		symbol_105.setName("OclState");
		symbol_105.getSuperClasses().add(symbol_99);
		symbol_60.getOwnedTypes().add(symbol_105);
		//
		// ocl::stdlib24::OclTuple stdlib24.OclTuple
		//
		symbol_106.setName("OclTuple");
		symbol_106.getSuperClasses().add(symbol_99);
		{	// ocl::stdlib24::OclTuple::<>() stdlib24.OclTuple.<>(stdlib24.OclAny)
			Operation symbol_392 = PivotFactory.eINSTANCE.createOperation();
			symbol_392.setName("<>");
			symbol_392.setType(symbol_68);
			Parameter symbol_393 = PivotFactory.eINSTANCE.createParameter();
			symbol_393.setName("object2");
			symbol_393.setType(symbol_99);
			symbol_393.setIteratorKind(IteratorKind.PARAMETER);
			symbol_392.getOwnedParameters().add(symbol_393);
			symbol_392.setPrecedence(symbol_6);
			symbol_392.setImplementation(org.eclipse.ocl.examples.library.tuple.TupleNotEqualOperation.INSTANCE);
			symbol_106.getOwnedOperations().add(symbol_392);
		}
		{	// ocl::stdlib24::OclTuple::=() stdlib24.OclTuple.=(stdlib24.OclAny)
			Operation symbol_394 = PivotFactory.eINSTANCE.createOperation();
			symbol_394.setName("=");
			symbol_394.setType(symbol_68);
			Parameter symbol_395 = PivotFactory.eINSTANCE.createParameter();
			symbol_395.setName("object2");
			symbol_395.setType(symbol_99);
			symbol_395.setIteratorKind(IteratorKind.PARAMETER);
			symbol_394.getOwnedParameters().add(symbol_395);
			symbol_394.setPrecedence(symbol_6);
			symbol_394.setImplementation(org.eclipse.ocl.examples.library.tuple.TupleEqualOperation.INSTANCE);
			symbol_106.getOwnedOperations().add(symbol_394);
		}
		symbol_60.getOwnedTypes().add(symbol_106);
		//
		// ocl::stdlib24::OclVoid stdlib24.OclVoid
		//
		symbol_107.setName("OclVoid");
		symbol_107.getSuperClasses().add(symbol_99);
		{	// ocl::stdlib24::OclVoid::<>() stdlib24.OclVoid.<>(stdlib24.OclAny)
			Operation symbol_396 = PivotFactory.eINSTANCE.createOperation();
			symbol_396.setName("<>");
			symbol_396.setType(symbol_68);
			Parameter symbol_397 = PivotFactory.eINSTANCE.createParameter();
			symbol_397.setName("object2");
			symbol_397.setType(symbol_99);
			symbol_397.setIteratorKind(IteratorKind.PARAMETER);
			symbol_396.getOwnedParameters().add(symbol_397);
			symbol_396.setPrecedence(symbol_6);
			symbol_396.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidNotEqualOperation.INSTANCE);
			symbol_107.getOwnedOperations().add(symbol_396);
		}
		{	// ocl::stdlib24::OclVoid::=() stdlib24.OclVoid.=(stdlib24.OclAny)
			Operation symbol_398 = PivotFactory.eINSTANCE.createOperation();
			symbol_398.setName("=");
			symbol_398.setType(symbol_68);
			Parameter symbol_399 = PivotFactory.eINSTANCE.createParameter();
			symbol_399.setName("object2");
			symbol_399.setType(symbol_99);
			symbol_399.setIteratorKind(IteratorKind.PARAMETER);
			symbol_398.getOwnedParameters().add(symbol_399);
			symbol_398.setPrecedence(symbol_6);
			symbol_398.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidEqualOperation.INSTANCE);
			symbol_107.getOwnedOperations().add(symbol_398);
		}
		{	// ocl::stdlib24::OclVoid::allInstances() stdlib24.OclVoid.allInstances()
			Operation symbol_400 = PivotFactory.eINSTANCE.createOperation();
			symbol_400.setName("allInstances");
			symbol_400.setType(symbol_49);
			symbol_400.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
			symbol_107.getOwnedOperations().add(symbol_400);
		}
		{	// ocl::stdlib24::OclVoid::and() stdlib24.OclVoid.and(stdlib24.Boolean)
			Operation symbol_401 = PivotFactory.eINSTANCE.createOperation();
			symbol_401.setName("and");
			symbol_401.setType(symbol_68);
			Parameter symbol_402 = PivotFactory.eINSTANCE.createParameter();
			symbol_402.setName("b");
			symbol_402.setType(symbol_68);
			symbol_402.setIteratorKind(IteratorKind.PARAMETER);
			symbol_401.getOwnedParameters().add(symbol_402);
			symbol_401.setPrecedence(symbol_8);
			symbol_401.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE);
			symbol_107.getOwnedOperations().add(symbol_401);
		}
		{	// ocl::stdlib24::OclVoid::implies() stdlib24.OclVoid.implies(stdlib24.Boolean)
			Operation symbol_403 = PivotFactory.eINSTANCE.createOperation();
			symbol_403.setName("implies");
			symbol_403.setType(symbol_68);
			Parameter symbol_404 = PivotFactory.eINSTANCE.createParameter();
			symbol_404.setName("b");
			symbol_404.setType(symbol_68);
			symbol_404.setIteratorKind(IteratorKind.PARAMETER);
			symbol_403.getOwnedParameters().add(symbol_404);
			symbol_403.setPrecedence(symbol_2);
			symbol_403.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE);
			symbol_107.getOwnedOperations().add(symbol_403);
		}
		{	// ocl::stdlib24::OclVoid::or() stdlib24.OclVoid.or(stdlib24.Boolean)
			Operation symbol_405 = PivotFactory.eINSTANCE.createOperation();
			symbol_405.setName("or");
			symbol_405.setType(symbol_68);
			Parameter symbol_406 = PivotFactory.eINSTANCE.createParameter();
			symbol_406.setName("b");
			symbol_406.setType(symbol_68);
			symbol_406.setIteratorKind(IteratorKind.PARAMETER);
			symbol_405.getOwnedParameters().add(symbol_406);
			symbol_405.setPrecedence(symbol_5);
			symbol_405.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE);
			symbol_107.getOwnedOperations().add(symbol_405);
		}
		symbol_60.getOwnedTypes().add(symbol_107);
		//
		// ocl::stdlib24::OrderedCollection stdlib24.OrderedCollection{T}
		//
		symbol_108.setName("OrderedCollection");
		symbol_111.setName("T");
		symbol_110.setOwnedParameteredElement(symbol_111);
		symbol_109.getOwnedParameters().add(symbol_110);
		
		symbol_108.setOwnedTemplateSignature(symbol_109);
		symbol_108.getSuperClasses().add(symbol_26);
		{	// ocl::stdlib24::OrderedCollection::at() stdlib24.OrderedCollection{T}.at(stdlib24.Integer)
			Operation symbol_407 = PivotFactory.eINSTANCE.createOperation();
			symbol_407.setName("at");
			symbol_407.setType(symbol_111);
			Parameter symbol_408 = PivotFactory.eINSTANCE.createParameter();
			symbol_408.setName("index");
			symbol_408.setType(symbol_90);
			symbol_408.setIteratorKind(IteratorKind.PARAMETER);
			symbol_407.getOwnedParameters().add(symbol_408);
			symbol_407.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE);
			symbol_108.getOwnedOperations().add(symbol_407);
		}
		{	// ocl::stdlib24::OrderedCollection::closure() stdlib24.OrderedCollection{T}.closure(stdlib24.OrderedCollection{T}?T)
			Operation symbol_409 = PivotFactory.eINSTANCE.createOperation();
			symbol_409.setName("closure");
			symbol_409.setType(symbol_38);
			Parameter symbol_410 = PivotFactory.eINSTANCE.createParameter();
			symbol_410.setName("i");
			symbol_410.setType(symbol_111);
			symbol_410.setIteratorKind(IteratorKind.ITERATOR);
			symbol_409.getOwnedParameters().add(symbol_410);
			symbol_409.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_108.getOwnedOperations().add(symbol_409);
		}
		{	// ocl::stdlib24::OrderedCollection::collect() stdlib24.OrderedCollection{T}.collect(stdlib24.OrderedCollection{T}?T)
			Operation symbol_411 = PivotFactory.eINSTANCE.createOperation();
			symbol_411.setName("collect");
			symbol_411.setType(symbol_39);
			Parameter symbol_412 = PivotFactory.eINSTANCE.createParameter();
			symbol_412.setName("i");
			symbol_412.setType(symbol_111);
			symbol_412.setIteratorKind(IteratorKind.ITERATOR);
			symbol_411.getOwnedParameters().add(symbol_412);
			symbol_411.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_108.getOwnedOperations().add(symbol_411);
		}
		{	// ocl::stdlib24::OrderedCollection::collectNested() stdlib24.OrderedCollection{T}.collectNested(stdlib24.OrderedCollection{T}?T)
			Operation symbol_413 = PivotFactory.eINSTANCE.createOperation();
			symbol_413.setName("collectNested");
			symbol_413.setType(symbol_39);
			Parameter symbol_414 = PivotFactory.eINSTANCE.createParameter();
			symbol_414.setName("i");
			symbol_414.setType(symbol_111);
			symbol_414.setIteratorKind(IteratorKind.ITERATOR);
			symbol_413.getOwnedParameters().add(symbol_414);
			symbol_413.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_108.getOwnedOperations().add(symbol_413);
		}
		{	// ocl::stdlib24::OrderedCollection::first() stdlib24.OrderedCollection{T}.first()
			Operation symbol_415 = PivotFactory.eINSTANCE.createOperation();
			symbol_415.setName("first");
			symbol_415.setType(symbol_111);
			symbol_415.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
			symbol_108.getOwnedOperations().add(symbol_415);
		}
		{	// ocl::stdlib24::OrderedCollection::indexOf() stdlib24.OrderedCollection{T}.indexOf(stdlib24.OclAny)
			Operation symbol_416 = PivotFactory.eINSTANCE.createOperation();
			symbol_416.setName("indexOf");
			symbol_416.setType(symbol_90);
			Parameter symbol_417 = PivotFactory.eINSTANCE.createParameter();
			symbol_417.setName("obj");
			symbol_417.setType(symbol_99);
			symbol_417.setIteratorKind(IteratorKind.PARAMETER);
			symbol_416.getOwnedParameters().add(symbol_417);
			symbol_416.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE);
			symbol_108.getOwnedOperations().add(symbol_416);
		}
		{	// ocl::stdlib24::OrderedCollection::last() stdlib24.OrderedCollection{T}.last()
			Operation symbol_418 = PivotFactory.eINSTANCE.createOperation();
			symbol_418.setName("last");
			symbol_418.setType(symbol_111);
			symbol_418.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
			symbol_108.getOwnedOperations().add(symbol_418);
		}
		{	// ocl::stdlib24::OrderedCollection::reverse() stdlib24.OrderedCollection{T}.reverse()
			Operation symbol_419 = PivotFactory.eINSTANCE.createOperation();
			symbol_419.setName("reverse");
			symbol_419.setType(symbol_32);
			symbol_419.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_108.getOwnedOperations().add(symbol_419);
		}
		symbol_60.getOwnedTypes().add(symbol_108);
		//
		// ocl::stdlib24::OrderedSet stdlib24.OrderedSet{T}
		//
		symbol_112.setName("OrderedSet");
		symbol_115.setName("T");
		symbol_114.setOwnedParameteredElement(symbol_115);
		symbol_113.getOwnedParameters().add(symbol_114);
		
		symbol_112.setOwnedTemplateSignature(symbol_113);
		symbol_112.getSuperClasses().add(symbol_59);
		symbol_112.getSuperClasses().add(symbol_34);
		{	// ocl::stdlib24::OrderedSet::-() stdlib24.OrderedSet{T}.-(stdlib24.Set[stdlib24.OrderedSet{T}?T])
			Operation symbol_420 = PivotFactory.eINSTANCE.createOperation();
			symbol_420.setName("-");
			symbol_420.setType(symbol_35);
			Parameter symbol_421 = PivotFactory.eINSTANCE.createParameter();
			symbol_421.setName("s");
			symbol_421.setType(symbol_53);
			symbol_421.setIteratorKind(IteratorKind.PARAMETER);
			symbol_420.getOwnedParameters().add(symbol_421);
			symbol_420.setPrecedence(symbol_10);
			symbol_420.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_420);
		}
		{	// ocl::stdlib24::OrderedSet::<>() stdlib24.OrderedSet{T}.<>(stdlib24.OclAny)
			Operation symbol_422 = PivotFactory.eINSTANCE.createOperation();
			symbol_422.setName("<>");
			symbol_422.setType(symbol_68);
			Parameter symbol_423 = PivotFactory.eINSTANCE.createParameter();
			symbol_423.setName("o");
			symbol_423.setType(symbol_99);
			symbol_423.setIteratorKind(IteratorKind.PARAMETER);
			symbol_422.getOwnedParameters().add(symbol_423);
			symbol_422.setPrecedence(symbol_6);
			symbol_422.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEqualOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_422);
		}
		{	// ocl::stdlib24::OrderedSet::=() stdlib24.OrderedSet{T}.=(stdlib24.OclAny)
			Operation symbol_424 = PivotFactory.eINSTANCE.createOperation();
			symbol_424.setName("=");
			symbol_424.setType(symbol_68);
			Parameter symbol_425 = PivotFactory.eINSTANCE.createParameter();
			symbol_425.setName("o");
			symbol_425.setType(symbol_99);
			symbol_425.setIteratorKind(IteratorKind.PARAMETER);
			symbol_424.getOwnedParameters().add(symbol_425);
			symbol_424.setPrecedence(symbol_6);
			symbol_424.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionEqualOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_424);
		}
		{	// ocl::stdlib24::OrderedSet::append() stdlib24.OrderedSet{T}.append(stdlib24.OrderedSet{T}?T)
			Operation symbol_426 = PivotFactory.eINSTANCE.createOperation();
			symbol_426.setName("append");
			symbol_426.setType(symbol_35);
			Parameter symbol_427 = PivotFactory.eINSTANCE.createParameter();
			symbol_427.setName("object");
			symbol_427.setType(symbol_115);
			symbol_427.setIteratorKind(IteratorKind.PARAMETER);
			symbol_426.getOwnedParameters().add(symbol_427);
			symbol_426.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_426);
		}
		{	// ocl::stdlib24::OrderedSet::excluding() stdlib24.OrderedSet{T}.excluding(stdlib24.OclAny)
			Operation symbol_428 = PivotFactory.eINSTANCE.createOperation();
			symbol_428.setName("excluding");
			symbol_428.setType(symbol_35);
			Parameter symbol_429 = PivotFactory.eINSTANCE.createParameter();
			symbol_429.setName("object");
			symbol_429.setType(symbol_99);
			symbol_429.setIteratorKind(IteratorKind.PARAMETER);
			symbol_428.getOwnedParameters().add(symbol_429);
			symbol_428.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_428);
		}
		{	// ocl::stdlib24::OrderedSet::including() stdlib24.OrderedSet{T}.including(stdlib24.OrderedSet{T}?T)
			Operation symbol_430 = PivotFactory.eINSTANCE.createOperation();
			symbol_430.setName("including");
			symbol_430.setType(symbol_35);
			Parameter symbol_431 = PivotFactory.eINSTANCE.createParameter();
			symbol_431.setName("object");
			symbol_431.setType(symbol_115);
			symbol_431.setIteratorKind(IteratorKind.PARAMETER);
			symbol_430.getOwnedParameters().add(symbol_431);
			symbol_430.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_430);
		}
		{	// ocl::stdlib24::OrderedSet::insertAt() stdlib24.OrderedSet{T}.insertAt(stdlib24.Integer,stdlib24.OrderedSet{T}?T)
			Operation symbol_432 = PivotFactory.eINSTANCE.createOperation();
			symbol_432.setName("insertAt");
			symbol_432.setType(symbol_35);
			Parameter symbol_433 = PivotFactory.eINSTANCE.createParameter();
			symbol_433.setName("index");
			symbol_433.setType(symbol_90);
			symbol_433.setIteratorKind(IteratorKind.PARAMETER);
			symbol_432.getOwnedParameters().add(symbol_433);
			Parameter symbol_434 = PivotFactory.eINSTANCE.createParameter();
			symbol_434.setName("object");
			symbol_434.setType(symbol_115);
			symbol_434.setIteratorKind(IteratorKind.PARAMETER);
			symbol_432.getOwnedParameters().add(symbol_434);
			symbol_432.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_432);
		}
		{	// ocl::stdlib24::OrderedSet::intersection() stdlib24.OrderedSet{T}.intersection(stdlib24.Set[stdlib24.OrderedSet{T}?T])
			Operation symbol_435 = PivotFactory.eINSTANCE.createOperation();
			symbol_435.setName("intersection");
			symbol_435.setType(symbol_35);
			Parameter symbol_436 = PivotFactory.eINSTANCE.createParameter();
			symbol_436.setName("o");
			symbol_436.setType(symbol_53);
			symbol_436.setIteratorKind(IteratorKind.PARAMETER);
			symbol_435.getOwnedParameters().add(symbol_436);
			symbol_435.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_435);
		}
		{	// ocl::stdlib24::OrderedSet::prepend() stdlib24.OrderedSet{T}.prepend(stdlib24.OrderedSet{T}?T)
			Operation symbol_437 = PivotFactory.eINSTANCE.createOperation();
			symbol_437.setName("prepend");
			symbol_437.setType(symbol_35);
			Parameter symbol_438 = PivotFactory.eINSTANCE.createParameter();
			symbol_438.setName("object");
			symbol_438.setType(symbol_115);
			symbol_438.setIteratorKind(IteratorKind.PARAMETER);
			symbol_437.getOwnedParameters().add(symbol_438);
			symbol_437.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_437);
		}
		{	// ocl::stdlib24::OrderedSet::reject() stdlib24.OrderedSet{T}.reject(stdlib24.OrderedSet{T}?T)
			Operation symbol_439 = PivotFactory.eINSTANCE.createOperation();
			symbol_439.setName("reject");
			symbol_439.setType(symbol_35);
			Parameter symbol_440 = PivotFactory.eINSTANCE.createParameter();
			symbol_440.setName("i");
			symbol_440.setType(symbol_115);
			symbol_440.setIteratorKind(IteratorKind.ITERATOR);
			symbol_439.getOwnedParameters().add(symbol_440);
			symbol_439.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_439);
		}
		{	// ocl::stdlib24::OrderedSet::reverse() stdlib24.OrderedSet{T}.reverse()
			Operation symbol_441 = PivotFactory.eINSTANCE.createOperation();
			symbol_441.setName("reverse");
			symbol_441.setType(symbol_35);
			symbol_441.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_441);
		}
		{	// ocl::stdlib24::OrderedSet::select() stdlib24.OrderedSet{T}.select(stdlib24.OrderedSet{T}?T)
			Operation symbol_442 = PivotFactory.eINSTANCE.createOperation();
			symbol_442.setName("select");
			symbol_442.setType(symbol_35);
			Parameter symbol_443 = PivotFactory.eINSTANCE.createParameter();
			symbol_443.setName("i");
			symbol_443.setType(symbol_115);
			symbol_443.setIteratorKind(IteratorKind.ITERATOR);
			symbol_442.getOwnedParameters().add(symbol_443);
			symbol_442.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_442);
		}
		{	// ocl::stdlib24::OrderedSet::subOrderedSet() stdlib24.OrderedSet{T}.subOrderedSet(stdlib24.Integer,stdlib24.Integer)
			Operation symbol_444 = PivotFactory.eINSTANCE.createOperation();
			symbol_444.setName("subOrderedSet");
			symbol_444.setType(symbol_35);
			Parameter symbol_445 = PivotFactory.eINSTANCE.createParameter();
			symbol_445.setName("lower");
			symbol_445.setType(symbol_90);
			symbol_445.setIteratorKind(IteratorKind.PARAMETER);
			symbol_444.getOwnedParameters().add(symbol_445);
			Parameter symbol_446 = PivotFactory.eINSTANCE.createParameter();
			symbol_446.setName("upper");
			symbol_446.setType(symbol_90);
			symbol_446.setIteratorKind(IteratorKind.PARAMETER);
			symbol_444.getOwnedParameters().add(symbol_446);
			symbol_444.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_444);
		}
		{	// ocl::stdlib24::OrderedSet::symmetricDifference() stdlib24.OrderedSet{T}.symmetricDifference(stdlib24.Set[stdlib24.OrderedSet{T}?T])
			Operation symbol_447 = PivotFactory.eINSTANCE.createOperation();
			symbol_447.setName("symmetricDifference");
			symbol_447.setType(symbol_35);
			Parameter symbol_448 = PivotFactory.eINSTANCE.createParameter();
			symbol_448.setName("s");
			symbol_448.setType(symbol_53);
			symbol_448.setIteratorKind(IteratorKind.PARAMETER);
			symbol_447.getOwnedParameters().add(symbol_448);
			symbol_447.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_447);
		}
		{	// ocl::stdlib24::OrderedSet::union() stdlib24.OrderedSet{T}.union(stdlib24.OrderedSet[stdlib24.OrderedSet{T}?T])
			Operation symbol_449 = PivotFactory.eINSTANCE.createOperation();
			symbol_449.setName("union");
			symbol_449.setType(symbol_35);
			Parameter symbol_450 = PivotFactory.eINSTANCE.createParameter();
			symbol_450.setName("o");
			symbol_450.setType(symbol_35);
			symbol_450.setIteratorKind(IteratorKind.PARAMETER);
			symbol_449.getOwnedParameters().add(symbol_450);
			symbol_449.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_449);
		}
		{	// ocl::stdlib24::OrderedSet::union() stdlib24.OrderedSet{T}.union(stdlib24.Set[stdlib24.OrderedSet{T}?T])
			Operation symbol_451 = PivotFactory.eINSTANCE.createOperation();
			symbol_451.setName("union");
			symbol_451.setType(symbol_53);
			Parameter symbol_452 = PivotFactory.eINSTANCE.createParameter();
			symbol_452.setName("s");
			symbol_452.setType(symbol_53);
			symbol_452.setIteratorKind(IteratorKind.PARAMETER);
			symbol_451.getOwnedParameters().add(symbol_452);
			symbol_451.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_112.getOwnedOperations().add(symbol_451);
		}
		symbol_60.getOwnedTypes().add(symbol_112);
		//
		// ocl::stdlib24::Real stdlib24.Real
		//
		symbol_116.setName("Real");
		symbol_116.setPrimitive(Boolean.TRUE);
		symbol_116.getSuperClasses().add(symbol_99);
		{	// ocl::stdlib24::Real::*() stdlib24.Real.*(stdlib24.Real)
			Operation symbol_453 = PivotFactory.eINSTANCE.createOperation();
			symbol_453.setName("*");
			symbol_453.setType(symbol_116);
			Parameter symbol_454 = PivotFactory.eINSTANCE.createParameter();
			symbol_454.setName("r");
			symbol_454.setType(symbol_116);
			symbol_454.setIteratorKind(IteratorKind.PARAMETER);
			symbol_453.getOwnedParameters().add(symbol_454);
			symbol_453.setPrecedence(symbol_3);
			symbol_453.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_453);
		}
		{	// ocl::stdlib24::Real::+() stdlib24.Real.+(stdlib24.Real)
			Operation symbol_455 = PivotFactory.eINSTANCE.createOperation();
			symbol_455.setName("+");
			symbol_455.setType(symbol_116);
			Parameter symbol_456 = PivotFactory.eINSTANCE.createParameter();
			symbol_456.setName("r");
			symbol_456.setType(symbol_116);
			symbol_456.setIteratorKind(IteratorKind.PARAMETER);
			symbol_455.getOwnedParameters().add(symbol_456);
			symbol_455.setPrecedence(symbol_10);
			symbol_455.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericPlusOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_455);
		}
		{	// ocl::stdlib24::Real::-() stdlib24.Real.-(stdlib24.Real)
			Operation symbol_457 = PivotFactory.eINSTANCE.createOperation();
			symbol_457.setName("-");
			symbol_457.setType(symbol_116);
			Parameter symbol_458 = PivotFactory.eINSTANCE.createParameter();
			symbol_458.setName("r");
			symbol_458.setType(symbol_116);
			symbol_458.setIteratorKind(IteratorKind.PARAMETER);
			symbol_457.getOwnedParameters().add(symbol_458);
			symbol_457.setPrecedence(symbol_10);
			symbol_457.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinusOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_457);
		}
		{	// ocl::stdlib24::Real::-() stdlib24.Real.-()
			Operation symbol_459 = PivotFactory.eINSTANCE.createOperation();
			symbol_459.setName("-");
			symbol_459.setType(symbol_116);
			symbol_459.setPrecedence(symbol_4);
			symbol_459.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_459);
		}
		{	// ocl::stdlib24::Real::/() stdlib24.Real./(stdlib24.Real)
			Operation symbol_460 = PivotFactory.eINSTANCE.createOperation();
			symbol_460.setName("/");
			symbol_460.setType(symbol_116);
			Parameter symbol_461 = PivotFactory.eINSTANCE.createParameter();
			symbol_461.setName("r");
			symbol_461.setType(symbol_116);
			symbol_461.setIteratorKind(IteratorKind.PARAMETER);
			symbol_460.getOwnedParameters().add(symbol_461);
			symbol_460.setPrecedence(symbol_3);
			symbol_460.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_460);
		}
		{	// ocl::stdlib24::Real::<() stdlib24.Real.<(stdlib24.Real)
			Operation symbol_462 = PivotFactory.eINSTANCE.createOperation();
			symbol_462.setName("<");
			symbol_462.setType(symbol_68);
			Parameter symbol_463 = PivotFactory.eINSTANCE.createParameter();
			symbol_463.setName("r");
			symbol_463.setType(symbol_116);
			symbol_463.setIteratorKind(IteratorKind.PARAMETER);
			symbol_462.getOwnedParameters().add(symbol_463);
			symbol_462.setPrecedence(symbol_7);
			symbol_462.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_462);
		}
		{	// ocl::stdlib24::Real::<=() stdlib24.Real.<=(stdlib24.Real)
			Operation symbol_464 = PivotFactory.eINSTANCE.createOperation();
			symbol_464.setName("<=");
			symbol_464.setType(symbol_68);
			Parameter symbol_465 = PivotFactory.eINSTANCE.createParameter();
			symbol_465.setName("r");
			symbol_465.setType(symbol_116);
			symbol_465.setIteratorKind(IteratorKind.PARAMETER);
			symbol_464.getOwnedParameters().add(symbol_465);
			symbol_464.setPrecedence(symbol_7);
			symbol_464.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_464);
		}
		{	// ocl::stdlib24::Real::<>() stdlib24.Real.<>(stdlib24.OclAny)
			Operation symbol_466 = PivotFactory.eINSTANCE.createOperation();
			symbol_466.setName("<>");
			symbol_466.setType(symbol_68);
			Parameter symbol_467 = PivotFactory.eINSTANCE.createParameter();
			symbol_467.setName("object2");
			symbol_467.setType(symbol_99);
			symbol_467.setIteratorKind(IteratorKind.PARAMETER);
			symbol_466.getOwnedParameters().add(symbol_467);
			symbol_466.setPrecedence(symbol_6);
			symbol_466.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNotEqualOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_466);
		}
		{	// ocl::stdlib24::Real::=() stdlib24.Real.=(stdlib24.OclAny)
			Operation symbol_468 = PivotFactory.eINSTANCE.createOperation();
			symbol_468.setName("=");
			symbol_468.setType(symbol_68);
			Parameter symbol_469 = PivotFactory.eINSTANCE.createParameter();
			symbol_469.setName("object2");
			symbol_469.setType(symbol_99);
			symbol_469.setIteratorKind(IteratorKind.PARAMETER);
			symbol_468.getOwnedParameters().add(symbol_469);
			symbol_468.setPrecedence(symbol_6);
			symbol_468.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericEqualOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_468);
		}
		{	// ocl::stdlib24::Real::>() stdlib24.Real.>(stdlib24.Real)
			Operation symbol_470 = PivotFactory.eINSTANCE.createOperation();
			symbol_470.setName(">");
			symbol_470.setType(symbol_68);
			Parameter symbol_471 = PivotFactory.eINSTANCE.createParameter();
			symbol_471.setName("r");
			symbol_471.setType(symbol_116);
			symbol_471.setIteratorKind(IteratorKind.PARAMETER);
			symbol_470.getOwnedParameters().add(symbol_471);
			symbol_470.setPrecedence(symbol_7);
			symbol_470.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_470);
		}
		{	// ocl::stdlib24::Real::>=() stdlib24.Real.>=(stdlib24.Real)
			Operation symbol_472 = PivotFactory.eINSTANCE.createOperation();
			symbol_472.setName(">=");
			symbol_472.setType(symbol_68);
			Parameter symbol_473 = PivotFactory.eINSTANCE.createParameter();
			symbol_473.setName("r");
			symbol_473.setType(symbol_116);
			symbol_473.setIteratorKind(IteratorKind.PARAMETER);
			symbol_472.getOwnedParameters().add(symbol_473);
			symbol_472.setPrecedence(symbol_7);
			symbol_472.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_472);
		}
		{	// ocl::stdlib24::Real::abs() stdlib24.Real.abs()
			Operation symbol_474 = PivotFactory.eINSTANCE.createOperation();
			symbol_474.setName("abs");
			symbol_474.setType(symbol_116);
			symbol_474.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_474);
		}
		{	// ocl::stdlib24::Real::floor() stdlib24.Real.floor()
			Operation symbol_475 = PivotFactory.eINSTANCE.createOperation();
			symbol_475.setName("floor");
			symbol_475.setType(symbol_90);
			symbol_475.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_475);
		}
		{	// ocl::stdlib24::Real::max() stdlib24.Real.max(stdlib24.Real)
			Operation symbol_476 = PivotFactory.eINSTANCE.createOperation();
			symbol_476.setName("max");
			symbol_476.setType(symbol_116);
			Parameter symbol_477 = PivotFactory.eINSTANCE.createParameter();
			symbol_477.setName("r");
			symbol_477.setType(symbol_116);
			symbol_477.setIteratorKind(IteratorKind.PARAMETER);
			symbol_476.getOwnedParameters().add(symbol_477);
			symbol_476.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_476);
		}
		{	// ocl::stdlib24::Real::min() stdlib24.Real.min(stdlib24.Real)
			Operation symbol_478 = PivotFactory.eINSTANCE.createOperation();
			symbol_478.setName("min");
			symbol_478.setType(symbol_116);
			Parameter symbol_479 = PivotFactory.eINSTANCE.createParameter();
			symbol_479.setName("r");
			symbol_479.setType(symbol_116);
			symbol_479.setIteratorKind(IteratorKind.PARAMETER);
			symbol_478.getOwnedParameters().add(symbol_479);
			symbol_478.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_478);
		}
		{	// ocl::stdlib24::Real::oclAsType() stdlib24.Real.oclAsType{T}(stdlib24.Classifier)
			Operation symbol_480 = PivotFactory.eINSTANCE.createOperation();
			symbol_119.setName("T");
			symbol_118.setOwnedParameteredElement(symbol_119);
			symbol_117.getOwnedParameters().add(symbol_118);
			
			symbol_480.setOwnedTemplateSignature(symbol_117);
			symbol_480.setName("oclAsType");
			symbol_480.setType(symbol_119);
			Parameter symbol_481 = PivotFactory.eINSTANCE.createParameter();
			symbol_481.setName("type");
			symbol_481.setType(symbol_69);
			symbol_481.setIteratorKind(IteratorKind.PARAMETER);
			symbol_480.getOwnedParameters().add(symbol_481);
			symbol_480.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericOclAsTypeOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_480);
		}
		{	// ocl::stdlib24::Real::round() stdlib24.Real.round()
			Operation symbol_482 = PivotFactory.eINSTANCE.createOperation();
			symbol_482.setName("round");
			symbol_482.setType(symbol_90);
			symbol_482.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_482);
		}
		{	// ocl::stdlib24::Real::toString() stdlib24.Real.toString()
			Operation symbol_483 = PivotFactory.eINSTANCE.createOperation();
			symbol_483.setName("toString");
			symbol_483.setType(symbol_134);
			symbol_483.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_116.getOwnedOperations().add(symbol_483);
		}
		symbol_60.getOwnedTypes().add(symbol_116);
		//
		// ocl::stdlib24::Sequence stdlib24.Sequence{T}
		//
		symbol_120.setName("Sequence");
		symbol_123.setName("T");
		symbol_122.setOwnedParameteredElement(symbol_123);
		symbol_121.getOwnedParameters().add(symbol_122);
		
		symbol_120.setOwnedTemplateSignature(symbol_121);
		symbol_120.getSuperClasses().add(symbol_29);
		symbol_120.getSuperClasses().add(symbol_33);
		{	// ocl::stdlib24::Sequence::<>() stdlib24.Sequence{T}.<>(stdlib24.OclAny)
			Operation symbol_484 = PivotFactory.eINSTANCE.createOperation();
			symbol_484.setName("<>");
			symbol_484.setType(symbol_68);
			Parameter symbol_485 = PivotFactory.eINSTANCE.createParameter();
			symbol_485.setName("s");
			symbol_485.setType(symbol_99);
			symbol_485.setIteratorKind(IteratorKind.PARAMETER);
			symbol_484.getOwnedParameters().add(symbol_485);
			symbol_484.setPrecedence(symbol_6);
			symbol_484.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEqualOperation.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_484);
		}
		{	// ocl::stdlib24::Sequence::=() stdlib24.Sequence{T}.=(stdlib24.OclAny)
			Operation symbol_486 = PivotFactory.eINSTANCE.createOperation();
			symbol_486.setName("=");
			symbol_486.setType(symbol_68);
			Parameter symbol_487 = PivotFactory.eINSTANCE.createParameter();
			symbol_487.setName("s");
			symbol_487.setType(symbol_99);
			symbol_487.setIteratorKind(IteratorKind.PARAMETER);
			symbol_486.getOwnedParameters().add(symbol_487);
			symbol_486.setPrecedence(symbol_6);
			symbol_486.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionEqualOperation.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_486);
		}
		{	// ocl::stdlib24::Sequence::append() stdlib24.Sequence{T}.append(stdlib24.Sequence{T}?T)
			Operation symbol_488 = PivotFactory.eINSTANCE.createOperation();
			symbol_488.setName("append");
			symbol_488.setType(symbol_44);
			Parameter symbol_489 = PivotFactory.eINSTANCE.createParameter();
			symbol_489.setName("object");
			symbol_489.setType(symbol_123);
			symbol_489.setIteratorKind(IteratorKind.PARAMETER);
			symbol_488.getOwnedParameters().add(symbol_489);
			symbol_488.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_488);
		}
		{	// ocl::stdlib24::Sequence::excluding() stdlib24.Sequence{T}.excluding(stdlib24.OclAny)
			Operation symbol_490 = PivotFactory.eINSTANCE.createOperation();
			symbol_490.setName("excluding");
			symbol_490.setType(symbol_44);
			Parameter symbol_491 = PivotFactory.eINSTANCE.createParameter();
			symbol_491.setName("object");
			symbol_491.setType(symbol_99);
			symbol_491.setIteratorKind(IteratorKind.PARAMETER);
			symbol_490.getOwnedParameters().add(symbol_491);
			symbol_490.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_490);
		}
		{	// ocl::stdlib24::Sequence::flatten() stdlib24.Sequence{T}.flatten{T2}()
			Operation symbol_492 = PivotFactory.eINSTANCE.createOperation();
			symbol_126.setName("T2");
			symbol_125.setOwnedParameteredElement(symbol_126);
			symbol_124.getOwnedParameters().add(symbol_125);
			
			symbol_492.setOwnedTemplateSignature(symbol_124);
			symbol_492.setName("flatten");
			symbol_492.setType(symbol_43);
			symbol_492.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_492);
		}
		{	// ocl::stdlib24::Sequence::including() stdlib24.Sequence{T}.including(stdlib24.Sequence{T}?T)
			Operation symbol_493 = PivotFactory.eINSTANCE.createOperation();
			symbol_493.setName("including");
			symbol_493.setType(symbol_44);
			Parameter symbol_494 = PivotFactory.eINSTANCE.createParameter();
			symbol_494.setName("object");
			symbol_494.setType(symbol_123);
			symbol_494.setIteratorKind(IteratorKind.PARAMETER);
			symbol_493.getOwnedParameters().add(symbol_494);
			symbol_493.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_493);
		}
		{	// ocl::stdlib24::Sequence::insertAt() stdlib24.Sequence{T}.insertAt(stdlib24.Integer,stdlib24.Sequence{T}?T)
			Operation symbol_495 = PivotFactory.eINSTANCE.createOperation();
			symbol_495.setName("insertAt");
			symbol_495.setType(symbol_44);
			Parameter symbol_496 = PivotFactory.eINSTANCE.createParameter();
			symbol_496.setName("index");
			symbol_496.setType(symbol_90);
			symbol_496.setIteratorKind(IteratorKind.PARAMETER);
			symbol_495.getOwnedParameters().add(symbol_496);
			Parameter symbol_497 = PivotFactory.eINSTANCE.createParameter();
			symbol_497.setName("object");
			symbol_497.setType(symbol_123);
			symbol_497.setIteratorKind(IteratorKind.PARAMETER);
			symbol_495.getOwnedParameters().add(symbol_497);
			symbol_495.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_495);
		}
		{	// ocl::stdlib24::Sequence::prepend() stdlib24.Sequence{T}.prepend(stdlib24.Sequence{T}?T)
			Operation symbol_498 = PivotFactory.eINSTANCE.createOperation();
			symbol_498.setName("prepend");
			symbol_498.setType(symbol_44);
			Parameter symbol_499 = PivotFactory.eINSTANCE.createParameter();
			symbol_499.setName("object");
			symbol_499.setType(symbol_123);
			symbol_499.setIteratorKind(IteratorKind.PARAMETER);
			symbol_498.getOwnedParameters().add(symbol_499);
			symbol_498.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_498);
		}
		{	// ocl::stdlib24::Sequence::reject() stdlib24.Sequence{T}.reject(stdlib24.Sequence{T}?T)
			Operation symbol_500 = PivotFactory.eINSTANCE.createOperation();
			symbol_500.setName("reject");
			symbol_500.setType(symbol_44);
			Parameter symbol_501 = PivotFactory.eINSTANCE.createParameter();
			symbol_501.setName("i");
			symbol_501.setType(symbol_123);
			symbol_501.setIteratorKind(IteratorKind.ITERATOR);
			symbol_500.getOwnedParameters().add(symbol_501);
			symbol_500.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_500);
		}
		{	// ocl::stdlib24::Sequence::reverse() stdlib24.Sequence{T}.reverse()
			Operation symbol_502 = PivotFactory.eINSTANCE.createOperation();
			symbol_502.setName("reverse");
			symbol_502.setType(symbol_44);
			symbol_502.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_502);
		}
		{	// ocl::stdlib24::Sequence::select() stdlib24.Sequence{T}.select(stdlib24.Sequence{T}?T)
			Operation symbol_503 = PivotFactory.eINSTANCE.createOperation();
			symbol_503.setName("select");
			symbol_503.setType(symbol_44);
			Parameter symbol_504 = PivotFactory.eINSTANCE.createParameter();
			symbol_504.setName("i");
			symbol_504.setType(symbol_123);
			symbol_504.setIteratorKind(IteratorKind.ITERATOR);
			symbol_503.getOwnedParameters().add(symbol_504);
			symbol_503.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_503);
		}
		{	// ocl::stdlib24::Sequence::subSequence() stdlib24.Sequence{T}.subSequence(stdlib24.Integer,stdlib24.Integer)
			Operation symbol_505 = PivotFactory.eINSTANCE.createOperation();
			symbol_505.setName("subSequence");
			symbol_505.setType(symbol_44);
			Parameter symbol_506 = PivotFactory.eINSTANCE.createParameter();
			symbol_506.setName("lower");
			symbol_506.setType(symbol_90);
			symbol_506.setIteratorKind(IteratorKind.PARAMETER);
			symbol_505.getOwnedParameters().add(symbol_506);
			Parameter symbol_507 = PivotFactory.eINSTANCE.createParameter();
			symbol_507.setName("upper");
			symbol_507.setType(symbol_90);
			symbol_507.setIteratorKind(IteratorKind.PARAMETER);
			symbol_505.getOwnedParameters().add(symbol_507);
			symbol_505.setImplementation(org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_505);
		}
		{	// ocl::stdlib24::Sequence::union() stdlib24.Sequence{T}.union(stdlib24.Sequence[stdlib24.Sequence{T}?T])
			Operation symbol_508 = PivotFactory.eINSTANCE.createOperation();
			symbol_508.setName("union");
			symbol_508.setType(symbol_44);
			Parameter symbol_509 = PivotFactory.eINSTANCE.createParameter();
			symbol_509.setName("s");
			symbol_509.setType(symbol_44);
			symbol_509.setIteratorKind(IteratorKind.PARAMETER);
			symbol_508.getOwnedParameters().add(symbol_509);
			symbol_508.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_120.getOwnedOperations().add(symbol_508);
		}
		symbol_60.getOwnedTypes().add(symbol_120);
		//
		// ocl::stdlib24::Set stdlib24.Set{T}
		//
		symbol_127.setName("Set");
		symbol_130.setName("T");
		symbol_129.setOwnedParameteredElement(symbol_130);
		symbol_128.getOwnedParameters().add(symbol_129);
		
		symbol_127.setOwnedTemplateSignature(symbol_128);
		symbol_127.getSuperClasses().add(symbol_28);
		symbol_127.getSuperClasses().add(symbol_58);
		{	// ocl::stdlib24::Set::-() stdlib24.Set{T}.-(stdlib24.Set[stdlib24.OclAny])
			Operation symbol_510 = PivotFactory.eINSTANCE.createOperation();
			symbol_510.setName("-");
			symbol_510.setType(symbol_51);
			Parameter symbol_511 = PivotFactory.eINSTANCE.createParameter();
			symbol_511.setName("s");
			symbol_511.setType(symbol_52);
			symbol_511.setIteratorKind(IteratorKind.PARAMETER);
			symbol_510.getOwnedParameters().add(symbol_511);
			symbol_510.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_510);
		}
		{	// ocl::stdlib24::Set::<>() stdlib24.Set{T}.<>(stdlib24.OclAny)
			Operation symbol_512 = PivotFactory.eINSTANCE.createOperation();
			symbol_512.setName("<>");
			symbol_512.setType(symbol_68);
			Parameter symbol_513 = PivotFactory.eINSTANCE.createParameter();
			symbol_513.setName("s");
			symbol_513.setType(symbol_99);
			symbol_513.setIteratorKind(IteratorKind.PARAMETER);
			symbol_512.getOwnedParameters().add(symbol_513);
			symbol_512.setPrecedence(symbol_6);
			symbol_512.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEqualOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_512);
		}
		{	// ocl::stdlib24::Set::=() stdlib24.Set{T}.=(stdlib24.OclAny)
			Operation symbol_514 = PivotFactory.eINSTANCE.createOperation();
			symbol_514.setName("=");
			symbol_514.setType(symbol_68);
			Parameter symbol_515 = PivotFactory.eINSTANCE.createParameter();
			symbol_515.setName("s");
			symbol_515.setType(symbol_99);
			symbol_515.setIteratorKind(IteratorKind.PARAMETER);
			symbol_514.getOwnedParameters().add(symbol_515);
			symbol_514.setPrecedence(symbol_6);
			symbol_514.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionEqualOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_514);
		}
		{	// ocl::stdlib24::Set::excluding() stdlib24.Set{T}.excluding(stdlib24.OclAny)
			Operation symbol_516 = PivotFactory.eINSTANCE.createOperation();
			symbol_516.setName("excluding");
			symbol_516.setType(symbol_51);
			Parameter symbol_517 = PivotFactory.eINSTANCE.createParameter();
			symbol_517.setName("object");
			symbol_517.setType(symbol_99);
			symbol_517.setIteratorKind(IteratorKind.PARAMETER);
			symbol_516.getOwnedParameters().add(symbol_517);
			symbol_516.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_516);
		}
		{	// ocl::stdlib24::Set::flatten() stdlib24.Set{T}.flatten{T2}()
			Operation symbol_518 = PivotFactory.eINSTANCE.createOperation();
			symbol_133.setName("T2");
			symbol_132.setOwnedParameteredElement(symbol_133);
			symbol_131.getOwnedParameters().add(symbol_132);
			
			symbol_518.setOwnedTemplateSignature(symbol_131);
			symbol_518.setName("flatten");
			symbol_518.setType(symbol_46);
			symbol_518.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_518);
		}
		{	// ocl::stdlib24::Set::including() stdlib24.Set{T}.including(stdlib24.Set{T}?T)
			Operation symbol_519 = PivotFactory.eINSTANCE.createOperation();
			symbol_519.setName("including");
			symbol_519.setType(symbol_51);
			Parameter symbol_520 = PivotFactory.eINSTANCE.createParameter();
			symbol_520.setName("object");
			symbol_520.setType(symbol_130);
			symbol_520.setIteratorKind(IteratorKind.PARAMETER);
			symbol_519.getOwnedParameters().add(symbol_520);
			symbol_519.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_519);
		}
		{	// ocl::stdlib24::Set::intersection() stdlib24.Set{T}.intersection(stdlib24.Set[stdlib24.Set{T}?T])
			Operation symbol_521 = PivotFactory.eINSTANCE.createOperation();
			symbol_521.setName("intersection");
			symbol_521.setType(symbol_51);
			Parameter symbol_522 = PivotFactory.eINSTANCE.createParameter();
			symbol_522.setName("s");
			symbol_522.setType(symbol_51);
			symbol_522.setIteratorKind(IteratorKind.PARAMETER);
			symbol_521.getOwnedParameters().add(symbol_522);
			symbol_521.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_521);
		}
		{	// ocl::stdlib24::Set::reject() stdlib24.Set{T}.reject(stdlib24.Set{T}?T)
			Operation symbol_523 = PivotFactory.eINSTANCE.createOperation();
			symbol_523.setName("reject");
			symbol_523.setType(symbol_51);
			Parameter symbol_524 = PivotFactory.eINSTANCE.createParameter();
			symbol_524.setName("i");
			symbol_524.setType(symbol_130);
			symbol_524.setIteratorKind(IteratorKind.ITERATOR);
			symbol_523.getOwnedParameters().add(symbol_524);
			symbol_523.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_523);
		}
		{	// ocl::stdlib24::Set::select() stdlib24.Set{T}.select(stdlib24.Set{T}?T)
			Operation symbol_525 = PivotFactory.eINSTANCE.createOperation();
			symbol_525.setName("select");
			symbol_525.setType(symbol_51);
			Parameter symbol_526 = PivotFactory.eINSTANCE.createParameter();
			symbol_526.setName("i");
			symbol_526.setType(symbol_130);
			symbol_526.setIteratorKind(IteratorKind.ITERATOR);
			symbol_525.getOwnedParameters().add(symbol_526);
			symbol_525.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_525);
		}
		{	// ocl::stdlib24::Set::symmetricDifference() stdlib24.Set{T}.symmetricDifference(stdlib24.Set[stdlib24.OclAny])
			Operation symbol_527 = PivotFactory.eINSTANCE.createOperation();
			symbol_527.setName("symmetricDifference");
			symbol_527.setType(symbol_51);
			Parameter symbol_528 = PivotFactory.eINSTANCE.createParameter();
			symbol_528.setName("s");
			symbol_528.setType(symbol_52);
			symbol_528.setIteratorKind(IteratorKind.PARAMETER);
			symbol_527.getOwnedParameters().add(symbol_528);
			symbol_527.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_527);
		}
		symbol_60.getOwnedTypes().add(symbol_127);
		//
		// ocl::stdlib24::String stdlib24.String
		//
		symbol_134.setName("String");
		symbol_134.setPrimitive(Boolean.TRUE);
		symbol_134.getSuperClasses().add(symbol_99);
		{	// ocl::stdlib24::String::+() stdlib24.String.+(stdlib24.String)
			Operation symbol_529 = PivotFactory.eINSTANCE.createOperation();
			symbol_529.setName("+");
			symbol_529.setType(symbol_134);
			Parameter symbol_530 = PivotFactory.eINSTANCE.createParameter();
			symbol_530.setName("s");
			symbol_530.setType(symbol_134);
			symbol_530.setIteratorKind(IteratorKind.PARAMETER);
			symbol_529.getOwnedParameters().add(symbol_530);
			symbol_529.setPrecedence(symbol_10);
			symbol_529.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_529);
		}
		{	// ocl::stdlib24::String::<() stdlib24.String.<(stdlib24.String)
			Operation symbol_531 = PivotFactory.eINSTANCE.createOperation();
			symbol_531.setName("<");
			symbol_531.setType(symbol_68);
			Parameter symbol_532 = PivotFactory.eINSTANCE.createParameter();
			symbol_532.setName("s");
			symbol_532.setType(symbol_134);
			symbol_532.setIteratorKind(IteratorKind.PARAMETER);
			symbol_531.getOwnedParameters().add(symbol_532);
			symbol_531.setPrecedence(symbol_7);
			symbol_531.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_531);
		}
		{	// ocl::stdlib24::String::<=() stdlib24.String.<=(stdlib24.String)
			Operation symbol_533 = PivotFactory.eINSTANCE.createOperation();
			symbol_533.setName("<=");
			symbol_533.setType(symbol_68);
			Parameter symbol_534 = PivotFactory.eINSTANCE.createParameter();
			symbol_534.setName("s");
			symbol_534.setType(symbol_134);
			symbol_534.setIteratorKind(IteratorKind.PARAMETER);
			symbol_533.getOwnedParameters().add(symbol_534);
			symbol_533.setPrecedence(symbol_7);
			symbol_533.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_533);
		}
		{	// ocl::stdlib24::String::<>() stdlib24.String.<>(stdlib24.OclAny)
			Operation symbol_535 = PivotFactory.eINSTANCE.createOperation();
			symbol_535.setName("<>");
			symbol_535.setType(symbol_68);
			Parameter symbol_536 = PivotFactory.eINSTANCE.createParameter();
			symbol_536.setName("object2");
			symbol_536.setType(symbol_99);
			symbol_536.setIteratorKind(IteratorKind.PARAMETER);
			symbol_535.getOwnedParameters().add(symbol_536);
			symbol_535.setPrecedence(symbol_6);
			symbol_535.setImplementation(org.eclipse.ocl.examples.library.string.StringNotEqualOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_535);
		}
		{	// ocl::stdlib24::String::=() stdlib24.String.=(stdlib24.OclAny)
			Operation symbol_537 = PivotFactory.eINSTANCE.createOperation();
			symbol_537.setName("=");
			symbol_537.setType(symbol_68);
			Parameter symbol_538 = PivotFactory.eINSTANCE.createParameter();
			symbol_538.setName("object2");
			symbol_538.setType(symbol_99);
			symbol_538.setIteratorKind(IteratorKind.PARAMETER);
			symbol_537.getOwnedParameters().add(symbol_538);
			symbol_537.setPrecedence(symbol_6);
			symbol_537.setImplementation(org.eclipse.ocl.examples.library.string.StringEqualOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_537);
		}
		{	// ocl::stdlib24::String::>() stdlib24.String.>(stdlib24.String)
			Operation symbol_539 = PivotFactory.eINSTANCE.createOperation();
			symbol_539.setName(">");
			symbol_539.setType(symbol_68);
			Parameter symbol_540 = PivotFactory.eINSTANCE.createParameter();
			symbol_540.setName("s");
			symbol_540.setType(symbol_134);
			symbol_540.setIteratorKind(IteratorKind.PARAMETER);
			symbol_539.getOwnedParameters().add(symbol_540);
			symbol_539.setPrecedence(symbol_7);
			symbol_539.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_539);
		}
		{	// ocl::stdlib24::String::>=() stdlib24.String.>=(stdlib24.String)
			Operation symbol_541 = PivotFactory.eINSTANCE.createOperation();
			symbol_541.setName(">=");
			symbol_541.setType(symbol_68);
			Parameter symbol_542 = PivotFactory.eINSTANCE.createParameter();
			symbol_542.setName("s");
			symbol_542.setType(symbol_134);
			symbol_542.setIteratorKind(IteratorKind.PARAMETER);
			symbol_541.getOwnedParameters().add(symbol_542);
			symbol_541.setPrecedence(symbol_7);
			symbol_541.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_541);
		}
		{	// ocl::stdlib24::String::at() stdlib24.String.at(stdlib24.Integer)
			Operation symbol_543 = PivotFactory.eINSTANCE.createOperation();
			symbol_543.setName("at");
			symbol_543.setType(symbol_134);
			Parameter symbol_544 = PivotFactory.eINSTANCE.createParameter();
			symbol_544.setName("i");
			symbol_544.setType(symbol_90);
			symbol_544.setIteratorKind(IteratorKind.PARAMETER);
			symbol_543.getOwnedParameters().add(symbol_544);
			symbol_543.setImplementation(org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_543);
		}
		{	// ocl::stdlib24::String::characters() stdlib24.String.characters()
			Operation symbol_545 = PivotFactory.eINSTANCE.createOperation();
			symbol_545.setName("characters");
			symbol_545.setType(symbol_41);
			symbol_545.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_545);
		}
		{	// ocl::stdlib24::String::concat() stdlib24.String.concat(stdlib24.String)
			Operation symbol_546 = PivotFactory.eINSTANCE.createOperation();
			symbol_546.setName("concat");
			symbol_546.setType(symbol_134);
			Parameter symbol_547 = PivotFactory.eINSTANCE.createParameter();
			symbol_547.setName("s");
			symbol_547.setType(symbol_134);
			symbol_547.setIteratorKind(IteratorKind.PARAMETER);
			symbol_546.getOwnedParameters().add(symbol_547);
			symbol_546.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_546);
		}
		{	// ocl::stdlib24::String::equalsIgnoreCase() stdlib24.String.equalsIgnoreCase(stdlib24.String)
			Operation symbol_548 = PivotFactory.eINSTANCE.createOperation();
			symbol_548.setName("equalsIgnoreCase");
			symbol_548.setType(symbol_68);
			Parameter symbol_549 = PivotFactory.eINSTANCE.createParameter();
			symbol_549.setName("s");
			symbol_549.setType(symbol_134);
			symbol_549.setIteratorKind(IteratorKind.PARAMETER);
			symbol_548.getOwnedParameters().add(symbol_549);
			symbol_548.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_548);
		}
		{	// ocl::stdlib24::String::indexOf() stdlib24.String.indexOf(stdlib24.String)
			Operation symbol_550 = PivotFactory.eINSTANCE.createOperation();
			symbol_550.setName("indexOf");
			symbol_550.setType(symbol_90);
			Parameter symbol_551 = PivotFactory.eINSTANCE.createParameter();
			symbol_551.setName("s");
			symbol_551.setType(symbol_134);
			symbol_551.setIteratorKind(IteratorKind.PARAMETER);
			symbol_550.getOwnedParameters().add(symbol_551);
			symbol_550.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_550);
		}
		{	// ocl::stdlib24::String::size() stdlib24.String.size()
			Operation symbol_552 = PivotFactory.eINSTANCE.createOperation();
			symbol_552.setName("size");
			symbol_552.setType(symbol_90);
			symbol_552.setImplementation(org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_552);
		}
		{	// ocl::stdlib24::String::substring() stdlib24.String.substring(stdlib24.Integer,stdlib24.Integer)
			Operation symbol_553 = PivotFactory.eINSTANCE.createOperation();
			symbol_553.setName("substring");
			symbol_553.setType(symbol_134);
			Parameter symbol_554 = PivotFactory.eINSTANCE.createParameter();
			symbol_554.setName("lower");
			symbol_554.setType(symbol_90);
			symbol_554.setIteratorKind(IteratorKind.PARAMETER);
			symbol_553.getOwnedParameters().add(symbol_554);
			Parameter symbol_555 = PivotFactory.eINSTANCE.createParameter();
			symbol_555.setName("upper");
			symbol_555.setType(symbol_90);
			symbol_555.setIteratorKind(IteratorKind.PARAMETER);
			symbol_553.getOwnedParameters().add(symbol_555);
			symbol_553.setImplementation(org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_553);
		}
		{	// ocl::stdlib24::String::toBoolean() stdlib24.String.toBoolean()
			Operation symbol_556 = PivotFactory.eINSTANCE.createOperation();
			symbol_556.setName("toBoolean");
			symbol_556.setType(symbol_68);
			symbol_556.setImplementation(org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_556);
		}
		{	// ocl::stdlib24::String::toInteger() stdlib24.String.toInteger()
			Operation symbol_557 = PivotFactory.eINSTANCE.createOperation();
			symbol_557.setName("toInteger");
			symbol_557.setType(symbol_90);
			symbol_557.setImplementation(org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_557);
		}
		{	// ocl::stdlib24::String::toLowerCase() stdlib24.String.toLowerCase()
			Operation symbol_558 = PivotFactory.eINSTANCE.createOperation();
			symbol_558.setName("toLowerCase");
			symbol_558.setType(symbol_134);
			symbol_558.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_558);
		}
		{	// ocl::stdlib24::String::toReal() stdlib24.String.toReal()
			Operation symbol_559 = PivotFactory.eINSTANCE.createOperation();
			symbol_559.setName("toReal");
			symbol_559.setType(symbol_116);
			symbol_559.setImplementation(org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_559);
		}
		{	// ocl::stdlib24::String::toUpperCase() stdlib24.String.toUpperCase()
			Operation symbol_560 = PivotFactory.eINSTANCE.createOperation();
			symbol_560.setName("toUpperCase");
			symbol_560.setType(symbol_134);
			symbol_560.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			symbol_134.getOwnedOperations().add(symbol_560);
		}
		symbol_60.getOwnedTypes().add(symbol_134);
		//
		// ocl::stdlib24::Tuple stdlib24.Tuple{T1,T2}
		//
		symbol_135.setName("Tuple");
		symbol_138.setName("T1");
		symbol_137.setOwnedParameteredElement(symbol_138);
		symbol_136.getOwnedParameters().add(symbol_137);
		symbol_140.setName("T2");
		symbol_139.setOwnedParameteredElement(symbol_140);
		symbol_136.getOwnedParameters().add(symbol_139);
		
		symbol_135.setOwnedTemplateSignature(symbol_136);
		symbol_135.getSuperClasses().add(symbol_106);
		{ // ocl::stdlib24::Tuple::first stdlib24.Tuple{T1,T2}.first
			Property symbol_561 = PivotFactory.eINSTANCE.createProperty();
			symbol_561.setName("first");
			symbol_561.setType(symbol_138);
			symbol_561.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_135.getOwnedAttributes().add(symbol_561);
		}
		{ // ocl::stdlib24::Tuple::second stdlib24.Tuple{T1,T2}.second
			Property symbol_562 = PivotFactory.eINSTANCE.createProperty();
			symbol_562.setName("second");
			symbol_562.setType(symbol_140);
			symbol_562.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_135.getOwnedAttributes().add(symbol_562);
		}
		symbol_60.getOwnedTypes().add(symbol_135);
		//
		// ocl::stdlib24::UniqueCollection stdlib24.UniqueCollection{T}
		//
		symbol_141.setName("UniqueCollection");
		symbol_144.setName("T");
		symbol_143.setOwnedParameteredElement(symbol_144);
		symbol_142.getOwnedParameters().add(symbol_143);
		
		symbol_141.setOwnedTemplateSignature(symbol_142);
		symbol_141.getSuperClasses().add(symbol_20);
		{	// ocl::stdlib24::UniqueCollection::sortedBy() stdlib24.UniqueCollection{T}.sortedBy(stdlib24.UniqueCollection{T}?T)
			Operation symbol_563 = PivotFactory.eINSTANCE.createOperation();
			symbol_563.setName("sortedBy");
			symbol_563.setType(symbol_36);
			Parameter symbol_564 = PivotFactory.eINSTANCE.createParameter();
			symbol_564.setName("i");
			symbol_564.setType(symbol_144);
			symbol_564.setIteratorKind(IteratorKind.ITERATOR);
			symbol_563.getOwnedParameters().add(symbol_564);
			symbol_563.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_141.getOwnedOperations().add(symbol_563);
		}
		symbol_60.getOwnedTypes().add(symbol_141);
		//
		// ocl::stdlib24::UnlimitedNatural stdlib24.UnlimitedNatural
		//
		symbol_145.setName("UnlimitedNatural");
		symbol_145.setPrimitive(Boolean.TRUE);
		symbol_145.getSuperClasses().add(symbol_90);
		symbol_60.getOwnedTypes().add(symbol_145);
		symbol_1.getNestedPackages().add(symbol_60);
		return symbol_1;
	}
}
