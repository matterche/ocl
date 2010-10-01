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
 * from: /org.eclipse.ocl.examples.library/model/OCL.oclstdlib
 * by: org.eclipse.ocl.examples.build.acceleo.GenerateOCLstdlib
 * defined by: org.eclipse.ocl.examples.build.acceleo.generateOCLstdlib.mtl
 * invoked by: org.eclipse.ocl.examples.build.utilities.OCLstdlibCodeGenerator
 * from: org.eclipse.ocl.examples.build.GenerateOCLstdlibModel.mwe2
 *
 * Do not edit it.
 *
 * $Id: OCLstdlib.java,v 1.1.2.1 2010/10/01 13:28:37 ewillink Exp $
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

@SuppressWarnings("nls")
public class OCLstdlib extends XMLResourceImpl
{
	/**
	 *	The static package-of-packages-of-types pivot model of the OCL standard library.
	 */
	public static final OCLstdlib INSTANCE = new OCLstdlib();
	
	/**
	 * The Loader shares the OCL standard library instance whenever this default library
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
		super(URI.createURI("http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib"));
		getContents().add(create());
		PivotAliasCreator.refreshPackageAliases(this);
		PivotManager.setMonikerAsID(Collections.singletonList(this));
	}

	/**
	 *	Create and return a package-of-packages-of-types pivot model of the OCL standard library.
	 *  This static definition auto-generated from /org.eclipse.ocl.examples.library/model/OCL.oclstdlib
	 *  is used as the default when no overriding copy is registered. 
	 */
	public static Package create()
	{
		Package symbol_1 = PivotFactory.eINSTANCE.createPackage(); // lib
		Precedence symbol_2 = PivotFactory.eINSTANCE.createPrecedence(); // OR
		Precedence symbol_3 = PivotFactory.eINSTANCE.createPrecedence(); // IMPLIES
		Precedence symbol_4 = PivotFactory.eINSTANCE.createPrecedence(); // XOR
		Precedence symbol_5 = PivotFactory.eINSTANCE.createPrecedence(); // EQUALITY
		Precedence symbol_6 = PivotFactory.eINSTANCE.createPrecedence(); // MULTIPLICATIVE
		Precedence symbol_7 = PivotFactory.eINSTANCE.createPrecedence(); // AND
		Precedence symbol_8 = PivotFactory.eINSTANCE.createPrecedence(); // ADDITIVE
		Precedence symbol_9 = PivotFactory.eINSTANCE.createPrecedence(); // UNARY
		Precedence symbol_10 = PivotFactory.eINSTANCE.createPrecedence(); // RELATIONAL
		Precedence symbol_11 = PivotFactory.eINSTANCE.createPrecedence(); // NAVIGATION
		Package symbol_12 = PivotFactory.eINSTANCE.createPackage(); // oclM1
		Class symbol_13 = PivotFactory.eINSTANCE.createClass(); // oclM1.Bag{T}
		TemplateSignature symbol_14 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Bag{T}.
		TypeTemplateParameter symbol_15 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_16 = PivotFactory.eINSTANCE.createClass(); // oclM1.Bag{T}.T
		
		
		Class symbol_17 = PivotFactory.eINSTANCE.createClass(); // oclM1.Boolean
		
		Class symbol_18 = PivotFactory.eINSTANCE.createClass(); // oclM1.Classifier
		
		Class symbol_19 = PivotFactory.eINSTANCE.createClass(); // oclM1.Collection{T}
		TemplateSignature symbol_20 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Collection{T}.
		TypeTemplateParameter symbol_21 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_22 = PivotFactory.eINSTANCE.createClass(); // oclM1.Collection{T}.T
		
		
		Class symbol_23 = PivotFactory.eINSTANCE.createClass(); // oclM1.Enumeration
		
		Class symbol_24 = PivotFactory.eINSTANCE.createClass(); // oclM1.Integer
		
		Class symbol_25 = PivotFactory.eINSTANCE.createClass(); // oclM1.NonOrderedCollection{T}
		TemplateSignature symbol_26 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.NonOrderedCollection{T}.
		TypeTemplateParameter symbol_27 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_28 = PivotFactory.eINSTANCE.createClass(); // oclM1.NonOrderedCollection{T}.T
		
		
		Class symbol_29 = PivotFactory.eINSTANCE.createClass(); // oclM1.NonUniqueCollection{T}
		TemplateSignature symbol_30 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.NonUniqueCollection{T}.
		TypeTemplateParameter symbol_31 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_32 = PivotFactory.eINSTANCE.createClass(); // oclM1.NonUniqueCollection{T}.T
		
		
		Class symbol_33 = PivotFactory.eINSTANCE.createClass(); // oclM1.OclAny
		
		Class symbol_34 = PivotFactory.eINSTANCE.createClass(); // oclM1.OclInvalid
		
		Class symbol_35 = PivotFactory.eINSTANCE.createClass(); // oclM1.OclMessage
		
		Class symbol_36 = PivotFactory.eINSTANCE.createClass(); // oclM1.OclState
		
		Class symbol_37 = PivotFactory.eINSTANCE.createClass(); // oclM1.OclTuple
		
		Class symbol_38 = PivotFactory.eINSTANCE.createClass(); // oclM1.OclVoid
		
		Class symbol_39 = PivotFactory.eINSTANCE.createClass(); // oclM1.OrderedCollection{T}
		TemplateSignature symbol_40 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.OrderedCollection{T}.
		TypeTemplateParameter symbol_41 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_42 = PivotFactory.eINSTANCE.createClass(); // oclM1.OrderedCollection{T}.T
		
		
		Class symbol_43 = PivotFactory.eINSTANCE.createClass(); // oclM1.OrderedSet{T}
		TemplateSignature symbol_44 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.OrderedSet{T}.
		TypeTemplateParameter symbol_45 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_46 = PivotFactory.eINSTANCE.createClass(); // oclM1.OrderedSet{T}.T
		
		
		Class symbol_47 = PivotFactory.eINSTANCE.createClass(); // oclM1.Real
		
		Class symbol_48 = PivotFactory.eINSTANCE.createClass(); // oclM1.Sequence{T}
		TemplateSignature symbol_49 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Sequence{T}.
		TypeTemplateParameter symbol_50 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_51 = PivotFactory.eINSTANCE.createClass(); // oclM1.Sequence{T}.T
		
		
		Class symbol_52 = PivotFactory.eINSTANCE.createClass(); // oclM1.Set{T}
		TemplateSignature symbol_53 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Set{T}.
		TypeTemplateParameter symbol_54 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_55 = PivotFactory.eINSTANCE.createClass(); // oclM1.Set{T}.T
		
		
		Class symbol_56 = PivotFactory.eINSTANCE.createClass(); // oclM1.String
		
		Class symbol_57 = PivotFactory.eINSTANCE.createClass(); // oclM1.Tuple{T1,T2}
		TemplateSignature symbol_58 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Tuple{T1,T2}.
		TypeTemplateParameter symbol_59 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_60 = PivotFactory.eINSTANCE.createClass(); // oclM1.Tuple{T1,T2}.T1
		TypeTemplateParameter symbol_61 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_62 = PivotFactory.eINSTANCE.createClass(); // oclM1.Tuple{T1,T2}.T2
		
		
		Class symbol_63 = PivotFactory.eINSTANCE.createClass(); // oclM1.UniqueCollection{T}
		TemplateSignature symbol_64 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.UniqueCollection{T}.
		TypeTemplateParameter symbol_65 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_66 = PivotFactory.eINSTANCE.createClass(); // oclM1.UniqueCollection{T}.T
		
		
		Class symbol_67 = PivotFactory.eINSTANCE.createClass(); // oclM1.UnlimitedNatural
		
		
		Package symbol_68 = PivotFactory.eINSTANCE.createPackage(); // oclM2
		Class symbol_69 = PivotFactory.eINSTANCE.createClass(); // oclM2.Class{T}
		TemplateSignature symbol_70 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM2.Class{T}.
		TypeTemplateParameter symbol_71 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_72 = PivotFactory.eINSTANCE.createClass(); // oclM2.Class{T}.T
		
		
		

		symbol_1.setName("lib");
		symbol_2.setName("OR");
		symbol_2.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_2);
		symbol_3.setName("IMPLIES");
		symbol_3.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_3);
		symbol_4.setName("XOR");
		symbol_4.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_4);
		symbol_5.setName("EQUALITY");
		symbol_5.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_5);
		symbol_6.setName("MULTIPLICATIVE");
		symbol_6.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_6);
		symbol_7.setName("AND");
		symbol_7.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_7);
		symbol_8.setName("ADDITIVE");
		symbol_8.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_8);
		symbol_9.setName("UNARY");
		symbol_9.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_9);
		symbol_10.setName("RELATIONAL");
		symbol_10.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_10);
		symbol_11.setName("NAVIGATION");
		symbol_11.setAssociativity(AssociativityKind.LEFT);
		symbol_1.getOwnedPrecedences().add(symbol_11);
		//
		// lib::oclM1
		//
		symbol_12.setName("oclM1");
		//
		// lib::oclM1::Bag
		//
		symbol_13.setName("Bag");
		symbol_16.setName("T");
		symbol_15.setOwnedParameteredElement(symbol_16);
		symbol_14.getOwnedParameters().add(symbol_15);
		
		symbol_13.setOwnedTemplateSignature(symbol_14);
		symbol_13.getSuperClasses().add(symbol_29);
		symbol_13.getSuperClasses().add(symbol_25);
		{	// lib::oclM1::Bag::<>() oclM1.Bag{T}.<>(oclM1.Bag{T})
			Operation symbol_73 = PivotFactory.eINSTANCE.createOperation();
			symbol_73.setName("<>");
			symbol_73.setType(symbol_17);
			Parameter symbol_74 = PivotFactory.eINSTANCE.createParameter();
			symbol_74.setName("bag");
			symbol_74.setType(symbol_13);
			symbol_73.getOwnedParameters().add(symbol_74);
			symbol_73.setPrecedence(symbol_5);
			symbol_73.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEqualOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_73);
		}
		{	// lib::oclM1::Bag::=() oclM1.Bag{T}.=(oclM1.Bag{T})
			Operation symbol_75 = PivotFactory.eINSTANCE.createOperation();
			symbol_75.setName("=");
			symbol_75.setType(symbol_17);
			Parameter symbol_76 = PivotFactory.eINSTANCE.createParameter();
			symbol_76.setName("bag");
			symbol_76.setType(symbol_13);
			symbol_75.getOwnedParameters().add(symbol_76);
			symbol_75.setPrecedence(symbol_5);
			symbol_75.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionEqualOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_75);
		}
		{	// lib::oclM1::Bag::excluding() oclM1.Bag{T}.excluding(oclM1.OclAny)
			Operation symbol_77 = PivotFactory.eINSTANCE.createOperation();
			symbol_77.setName("excluding");
			symbol_77.setType(symbol_13);
			Parameter symbol_78 = PivotFactory.eINSTANCE.createParameter();
			symbol_78.setName("object");
			symbol_78.setType(symbol_33);
			symbol_77.getOwnedParameters().add(symbol_78);
			symbol_77.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_77);
		}
		{	// lib::oclM1::Bag::flatten() oclM1.Bag{T}.flatten{T2}()
			Operation symbol_79 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_80 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Bag{T}.flatten{T2}().
			TypeTemplateParameter symbol_81 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_82 = PivotFactory.eINSTANCE.createClass(); // oclM1.Bag{T}.flatten{T2}().T2
			
			symbol_82.setName("T2");
			symbol_81.setOwnedParameteredElement(symbol_82);
			symbol_80.getOwnedParameters().add(symbol_81);
			
			symbol_79.setOwnedTemplateSignature(symbol_80);
			symbol_79.setName("flatten");
			symbol_79.setType(symbol_13);
			symbol_79.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_79);
		}
		{	// lib::oclM1::Bag::including() oclM1.Bag{T}.including(oclM1.Bag{T}.T)
			Operation symbol_83 = PivotFactory.eINSTANCE.createOperation();
			symbol_83.setName("including");
			symbol_83.setType(symbol_13);
			Parameter symbol_84 = PivotFactory.eINSTANCE.createParameter();
			symbol_84.setName("object");
			symbol_84.setType(symbol_16);
			symbol_83.getOwnedParameters().add(symbol_84);
			symbol_83.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_83);
		}
		{	// lib::oclM1::Bag::reject() oclM1.Bag{T}.reject(oclM1.Bag{T}.T)
			Iterator symbol_85 = PivotFactory.eINSTANCE.createIterator();
			symbol_85.setName("reject");
			symbol_85.setType(symbol_13);
			Parameter symbol_86 = PivotFactory.eINSTANCE.createParameter();
			symbol_86.setName("i");
			symbol_86.setType(symbol_16);
			symbol_85.getOwnedIterators().add(symbol_86);
			symbol_85.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_85);
		}
		{	// lib::oclM1::Bag::select() oclM1.Bag{T}.select(oclM1.Bag{T}.T)
			Iterator symbol_87 = PivotFactory.eINSTANCE.createIterator();
			symbol_87.setName("select");
			symbol_87.setType(symbol_13);
			Parameter symbol_88 = PivotFactory.eINSTANCE.createParameter();
			symbol_88.setName("i");
			symbol_88.setType(symbol_16);
			symbol_87.getOwnedIterators().add(symbol_88);
			symbol_87.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_13.getOwnedOperations().add(symbol_87);
		}
		symbol_12.getOwnedTypes().add(symbol_13);
		//
		// lib::oclM1::Boolean
		//
		symbol_17.setName("Boolean");
		symbol_17.getSuperClasses().add(symbol_33);
		{	// lib::oclM1::Boolean::<>() oclM1.Boolean.<>(oclM1.Boolean)
			Operation symbol_89 = PivotFactory.eINSTANCE.createOperation();
			symbol_89.setName("<>");
			symbol_89.setType(symbol_17);
			Parameter symbol_90 = PivotFactory.eINSTANCE.createParameter();
			symbol_90.setName("object2");
			symbol_90.setType(symbol_17);
			symbol_89.getOwnedParameters().add(symbol_90);
			symbol_89.setPrecedence(symbol_5);
			symbol_89.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanNotEqualOperation.INSTANCE);
			symbol_17.getOwnedOperations().add(symbol_89);
		}
		{	// lib::oclM1::Boolean::=() oclM1.Boolean.=(oclM1.Boolean)
			Operation symbol_91 = PivotFactory.eINSTANCE.createOperation();
			symbol_91.setName("=");
			symbol_91.setType(symbol_17);
			Parameter symbol_92 = PivotFactory.eINSTANCE.createParameter();
			symbol_92.setName("object2");
			symbol_92.setType(symbol_17);
			symbol_91.getOwnedParameters().add(symbol_92);
			symbol_91.setPrecedence(symbol_5);
			symbol_91.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanEqualOperation.INSTANCE);
			symbol_17.getOwnedOperations().add(symbol_91);
		}
		{	// lib::oclM1::Boolean::allInstances() oclM1.Boolean.allInstances()
			Operation symbol_93 = PivotFactory.eINSTANCE.createOperation();
			symbol_93.setName("allInstances");
			symbol_93.setType(symbol_52);
			symbol_93.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
			symbol_17.getOwnedOperations().add(symbol_93);
		}
		{	// lib::oclM1::Boolean::and() oclM1.Boolean.and(oclM1.Boolean)
			Operation symbol_94 = PivotFactory.eINSTANCE.createOperation();
			symbol_94.setName("and");
			symbol_94.setType(symbol_17);
			Parameter symbol_95 = PivotFactory.eINSTANCE.createParameter();
			symbol_95.setName("b");
			symbol_95.setType(symbol_17);
			symbol_94.getOwnedParameters().add(symbol_95);
			symbol_94.setPrecedence(symbol_7);
			symbol_94.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE);
			symbol_17.getOwnedOperations().add(symbol_94);
		}
		{	// lib::oclM1::Boolean::implies() oclM1.Boolean.implies(oclM1.Boolean)
			Operation symbol_96 = PivotFactory.eINSTANCE.createOperation();
			symbol_96.setName("implies");
			symbol_96.setType(symbol_17);
			Parameter symbol_97 = PivotFactory.eINSTANCE.createParameter();
			symbol_97.setName("b");
			symbol_97.setType(symbol_17);
			symbol_96.getOwnedParameters().add(symbol_97);
			symbol_96.setPrecedence(symbol_3);
			symbol_96.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE);
			symbol_17.getOwnedOperations().add(symbol_96);
		}
		{	// lib::oclM1::Boolean::not() oclM1.Boolean.not()
			Operation symbol_98 = PivotFactory.eINSTANCE.createOperation();
			symbol_98.setName("not");
			symbol_98.setType(symbol_17);
			symbol_98.setPrecedence(symbol_9);
			symbol_98.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
			symbol_17.getOwnedOperations().add(symbol_98);
		}
		{	// lib::oclM1::Boolean::or() oclM1.Boolean.or(oclM1.Boolean)
			Operation symbol_99 = PivotFactory.eINSTANCE.createOperation();
			symbol_99.setName("or");
			symbol_99.setType(symbol_17);
			Parameter symbol_100 = PivotFactory.eINSTANCE.createParameter();
			symbol_100.setName("b");
			symbol_100.setType(symbol_17);
			symbol_99.getOwnedParameters().add(symbol_100);
			symbol_99.setPrecedence(symbol_2);
			symbol_99.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE);
			symbol_17.getOwnedOperations().add(symbol_99);
		}
		{	// lib::oclM1::Boolean::toString() oclM1.Boolean.toString()
			Operation symbol_101 = PivotFactory.eINSTANCE.createOperation();
			symbol_101.setName("toString");
			symbol_101.setType(symbol_56);
			symbol_101.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_17.getOwnedOperations().add(symbol_101);
		}
		{	// lib::oclM1::Boolean::xor() oclM1.Boolean.xor(oclM1.Boolean)
			Operation symbol_102 = PivotFactory.eINSTANCE.createOperation();
			symbol_102.setName("xor");
			symbol_102.setType(symbol_17);
			Parameter symbol_103 = PivotFactory.eINSTANCE.createParameter();
			symbol_103.setName("b");
			symbol_103.setType(symbol_17);
			symbol_102.getOwnedParameters().add(symbol_103);
			symbol_102.setPrecedence(symbol_4);
			symbol_102.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE);
			symbol_17.getOwnedOperations().add(symbol_102);
		}
		symbol_12.getOwnedTypes().add(symbol_17);
		//
		// lib::oclM1::Classifier
		//
		symbol_18.setName("Classifier");
		symbol_18.getSuperClasses().add(symbol_33);
		{	// lib::oclM1::Classifier::allInstances() oclM1.Classifier.allInstances()
			Operation symbol_104 = PivotFactory.eINSTANCE.createOperation();
			symbol_104.setName("allInstances");
			symbol_104.setType(symbol_52);
			symbol_104.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
			symbol_18.getOwnedOperations().add(symbol_104);
		}
		symbol_12.getOwnedTypes().add(symbol_18);
		//
		// lib::oclM1::Collection
		//
		symbol_19.setName("Collection");
		symbol_22.setName("T");
		symbol_21.setOwnedParameteredElement(symbol_22);
		symbol_20.getOwnedParameters().add(symbol_21);
		
		symbol_19.setOwnedTemplateSignature(symbol_20);
		symbol_19.getSuperClasses().add(symbol_33);
		{	// lib::oclM1::Collection::->() oclM1.Collection{T}.->{T}(oclM1.OclAny)
			Operation symbol_105 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_106 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Collection{T}.->{T}(oclM1.OclAny).
			TypeTemplateParameter symbol_107 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_108 = PivotFactory.eINSTANCE.createClass(); // oclM1.Collection{T}.->{T}(oclM1.OclAny).T
			
			symbol_108.setName("T");
			symbol_107.setOwnedParameteredElement(symbol_108);
			symbol_106.getOwnedParameters().add(symbol_107);
			
			symbol_105.setOwnedTemplateSignature(symbol_106);
			symbol_105.setName("->");
			symbol_105.setType(symbol_22);
			Parameter symbol_109 = PivotFactory.eINSTANCE.createParameter();
			symbol_109.setName("object2");
			symbol_109.setType(symbol_33);
			symbol_105.getOwnedParameters().add(symbol_109);
			symbol_105.setPrecedence(symbol_11);
			symbol_105.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_105);
		}
		{	// lib::oclM1::Collection::<>() oclM1.Collection{T}.<>(oclM1.Collection{T})
			Operation symbol_110 = PivotFactory.eINSTANCE.createOperation();
			symbol_110.setName("<>");
			symbol_110.setType(symbol_17);
			Parameter symbol_111 = PivotFactory.eINSTANCE.createParameter();
			symbol_111.setName("c");
			symbol_111.setType(symbol_19);
			symbol_110.getOwnedParameters().add(symbol_111);
			symbol_110.setPrecedence(symbol_5);
			symbol_110.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEqualOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_110);
		}
		{	// lib::oclM1::Collection::=() oclM1.Collection{T}.=(oclM1.Collection{T})
			Operation symbol_112 = PivotFactory.eINSTANCE.createOperation();
			symbol_112.setName("=");
			symbol_112.setType(symbol_17);
			Parameter symbol_113 = PivotFactory.eINSTANCE.createParameter();
			symbol_113.setName("c");
			symbol_113.setType(symbol_19);
			symbol_112.getOwnedParameters().add(symbol_113);
			symbol_112.setPrecedence(symbol_5);
			symbol_112.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionEqualOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_112);
		}
		{	// lib::oclM1::Collection::any() oclM1.Collection{T}.any(oclM1.Collection{T}.T)
			Iterator symbol_114 = PivotFactory.eINSTANCE.createIterator();
			symbol_114.setName("any");
			symbol_114.setType(symbol_22);
			Parameter symbol_115 = PivotFactory.eINSTANCE.createParameter();
			symbol_115.setName("i");
			symbol_115.setType(symbol_22);
			symbol_114.getOwnedIterators().add(symbol_115);
			symbol_114.setImplementation(org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_114);
		}
		{	// lib::oclM1::Collection::asBag() oclM1.Collection{T}.asBag()
			Operation symbol_116 = PivotFactory.eINSTANCE.createOperation();
			symbol_116.setName("asBag");
			symbol_116.setType(symbol_13);
			symbol_116.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_116);
		}
		{	// lib::oclM1::Collection::asOrderedSet() oclM1.Collection{T}.asOrderedSet()
			Operation symbol_117 = PivotFactory.eINSTANCE.createOperation();
			symbol_117.setName("asOrderedSet");
			symbol_117.setType(symbol_43);
			symbol_117.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_117);
		}
		{	// lib::oclM1::Collection::asSequence() oclM1.Collection{T}.asSequence()
			Operation symbol_118 = PivotFactory.eINSTANCE.createOperation();
			symbol_118.setName("asSequence");
			symbol_118.setType(symbol_48);
			symbol_118.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_118);
		}
		{	// lib::oclM1::Collection::asSet() oclM1.Collection{T}.asSet()
			Operation symbol_119 = PivotFactory.eINSTANCE.createOperation();
			symbol_119.setName("asSet");
			symbol_119.setType(symbol_52);
			symbol_119.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_119);
		}
		{	// lib::oclM1::Collection::collect() oclM1.Collection{T}.collect(oclM1.Collection{T}.T)
			Iterator symbol_120 = PivotFactory.eINSTANCE.createIterator();
			symbol_120.setName("collect");
			symbol_120.setType(symbol_19);
			Parameter symbol_121 = PivotFactory.eINSTANCE.createParameter();
			symbol_121.setName("i");
			symbol_121.setType(symbol_22);
			symbol_120.getOwnedIterators().add(symbol_121);
			symbol_120.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_120);
		}
		{	// lib::oclM1::Collection::collectNested() oclM1.Collection{T}.collectNested(oclM1.Collection{T}.T)
			Iterator symbol_122 = PivotFactory.eINSTANCE.createIterator();
			symbol_122.setName("collectNested");
			symbol_122.setType(symbol_19);
			Parameter symbol_123 = PivotFactory.eINSTANCE.createParameter();
			symbol_123.setName("i");
			symbol_123.setType(symbol_22);
			symbol_122.getOwnedIterators().add(symbol_123);
			symbol_122.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_122);
		}
		{	// lib::oclM1::Collection::count() oclM1.Collection{T}.count(oclM1.OclAny)
			Operation symbol_124 = PivotFactory.eINSTANCE.createOperation();
			symbol_124.setName("count");
			symbol_124.setType(symbol_24);
			Parameter symbol_125 = PivotFactory.eINSTANCE.createParameter();
			symbol_125.setName("object");
			symbol_125.setType(symbol_33);
			symbol_124.getOwnedParameters().add(symbol_125);
			symbol_124.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_124);
		}
		{	// lib::oclM1::Collection::excludes() oclM1.Collection{T}.excludes(oclM1.OclAny)
			Operation symbol_126 = PivotFactory.eINSTANCE.createOperation();
			symbol_126.setName("excludes");
			symbol_126.setType(symbol_17);
			Parameter symbol_127 = PivotFactory.eINSTANCE.createParameter();
			symbol_127.setName("object");
			symbol_127.setType(symbol_33);
			symbol_126.getOwnedParameters().add(symbol_127);
			symbol_126.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_126);
		}
		{	// lib::oclM1::Collection::excludesAll() oclM1.Collection{T}.excludesAll{T2}(oclM1.Collection{T})
			Operation symbol_128 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_129 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Collection{T}.excludesAll{T2}(oclM1.Collection{T}).
			TypeTemplateParameter symbol_130 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_131 = PivotFactory.eINSTANCE.createClass(); // oclM1.Collection{T}.excludesAll{T2}(oclM1.Collection{T}).T2
			
			symbol_131.setName("T2");
			symbol_130.setOwnedParameteredElement(symbol_131);
			symbol_129.getOwnedParameters().add(symbol_130);
			
			symbol_128.setOwnedTemplateSignature(symbol_129);
			symbol_128.setName("excludesAll");
			symbol_128.setType(symbol_17);
			Parameter symbol_132 = PivotFactory.eINSTANCE.createParameter();
			symbol_132.setName("c2");
			symbol_132.setType(symbol_19);
			symbol_128.getOwnedParameters().add(symbol_132);
			symbol_128.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_128);
		}
		{	// lib::oclM1::Collection::excluding() oclM1.Collection{T}.excluding(oclM1.OclAny)
			Operation symbol_133 = PivotFactory.eINSTANCE.createOperation();
			symbol_133.setName("excluding");
			symbol_133.setType(symbol_19);
			Parameter symbol_134 = PivotFactory.eINSTANCE.createParameter();
			symbol_134.setName("object");
			symbol_134.setType(symbol_33);
			symbol_133.getOwnedParameters().add(symbol_134);
			symbol_133.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_133);
		}
		{	// lib::oclM1::Collection::exists() oclM1.Collection{T}.exists(oclM1.Collection{T}.T)
			Iterator symbol_135 = PivotFactory.eINSTANCE.createIterator();
			symbol_135.setName("exists");
			symbol_135.setType(symbol_17);
			Parameter symbol_136 = PivotFactory.eINSTANCE.createParameter();
			symbol_136.setName("i");
			symbol_136.setType(symbol_22);
			symbol_135.getOwnedIterators().add(symbol_136);
			symbol_135.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_135);
		}
		{	// lib::oclM1::Collection::exists() oclM1.Collection{T}.exists(oclM1.Collection{T}.T;oclM1.Collection{T}.T)
			Iterator symbol_137 = PivotFactory.eINSTANCE.createIterator();
			symbol_137.setName("exists");
			symbol_137.setType(symbol_17);
			Parameter symbol_138 = PivotFactory.eINSTANCE.createParameter();
			symbol_138.setName("i");
			symbol_138.setType(symbol_22);
			symbol_137.getOwnedIterators().add(symbol_138);
			Parameter symbol_139 = PivotFactory.eINSTANCE.createParameter();
			symbol_139.setName("j");
			symbol_139.setType(symbol_22);
			symbol_137.getOwnedIterators().add(symbol_139);
			symbol_137.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_137);
		}
		{	// lib::oclM1::Collection::flatten() oclM1.Collection{T}.flatten{T2}()
			Operation symbol_140 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_141 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Collection{T}.flatten{T2}().
			TypeTemplateParameter symbol_142 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_143 = PivotFactory.eINSTANCE.createClass(); // oclM1.Collection{T}.flatten{T2}().T2
			
			symbol_143.setName("T2");
			symbol_142.setOwnedParameteredElement(symbol_143);
			symbol_141.getOwnedParameters().add(symbol_142);
			
			symbol_140.setOwnedTemplateSignature(symbol_141);
			symbol_140.setName("flatten");
			symbol_140.setType(symbol_19);
			symbol_140.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_140);
		}
		{	// lib::oclM1::Collection::forAll() oclM1.Collection{T}.forAll(oclM1.Collection{T}.T)
			Iterator symbol_144 = PivotFactory.eINSTANCE.createIterator();
			symbol_144.setName("forAll");
			symbol_144.setType(symbol_17);
			Parameter symbol_145 = PivotFactory.eINSTANCE.createParameter();
			symbol_145.setName("i");
			symbol_145.setType(symbol_22);
			symbol_144.getOwnedIterators().add(symbol_145);
			symbol_144.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_144);
		}
		{	// lib::oclM1::Collection::forAll() oclM1.Collection{T}.forAll(oclM1.Collection{T}.T;oclM1.Collection{T}.T)
			Iterator symbol_146 = PivotFactory.eINSTANCE.createIterator();
			symbol_146.setName("forAll");
			symbol_146.setType(symbol_17);
			Parameter symbol_147 = PivotFactory.eINSTANCE.createParameter();
			symbol_147.setName("i");
			symbol_147.setType(symbol_22);
			symbol_146.getOwnedIterators().add(symbol_147);
			Parameter symbol_148 = PivotFactory.eINSTANCE.createParameter();
			symbol_148.setName("j");
			symbol_148.setType(symbol_22);
			symbol_146.getOwnedIterators().add(symbol_148);
			symbol_146.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_146);
		}
		{	// lib::oclM1::Collection::includes() oclM1.Collection{T}.includes(oclM1.OclAny)
			Operation symbol_149 = PivotFactory.eINSTANCE.createOperation();
			symbol_149.setName("includes");
			symbol_149.setType(symbol_17);
			Parameter symbol_150 = PivotFactory.eINSTANCE.createParameter();
			symbol_150.setName("object");
			symbol_150.setType(symbol_33);
			symbol_149.getOwnedParameters().add(symbol_150);
			symbol_149.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_149);
		}
		{	// lib::oclM1::Collection::includesAll() oclM1.Collection{T}.includesAll{T2}(oclM1.Collection{T})
			Operation symbol_151 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_152 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Collection{T}.includesAll{T2}(oclM1.Collection{T}).
			TypeTemplateParameter symbol_153 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_154 = PivotFactory.eINSTANCE.createClass(); // oclM1.Collection{T}.includesAll{T2}(oclM1.Collection{T}).T2
			
			symbol_154.setName("T2");
			symbol_153.setOwnedParameteredElement(symbol_154);
			symbol_152.getOwnedParameters().add(symbol_153);
			
			symbol_151.setOwnedTemplateSignature(symbol_152);
			symbol_151.setName("includesAll");
			symbol_151.setType(symbol_17);
			Parameter symbol_155 = PivotFactory.eINSTANCE.createParameter();
			symbol_155.setName("c2");
			symbol_155.setType(symbol_19);
			symbol_151.getOwnedParameters().add(symbol_155);
			symbol_151.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_151);
		}
		{	// lib::oclM1::Collection::including() oclM1.Collection{T}.including(oclM1.Collection{T}.T)
			Operation symbol_156 = PivotFactory.eINSTANCE.createOperation();
			symbol_156.setName("including");
			symbol_156.setType(symbol_19);
			Parameter symbol_157 = PivotFactory.eINSTANCE.createParameter();
			symbol_157.setName("object");
			symbol_157.setType(symbol_22);
			symbol_156.getOwnedParameters().add(symbol_157);
			symbol_156.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_156);
		}
		{	// lib::oclM1::Collection::isEmpty() oclM1.Collection{T}.isEmpty()
			Operation symbol_158 = PivotFactory.eINSTANCE.createOperation();
			symbol_158.setName("isEmpty");
			symbol_158.setType(symbol_17);
			symbol_158.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_158);
		}
		{	// lib::oclM1::Collection::isUnique() oclM1.Collection{T}.isUnique(oclM1.Collection{T}.T)
			Iterator symbol_159 = PivotFactory.eINSTANCE.createIterator();
			symbol_159.setName("isUnique");
			symbol_159.setType(symbol_17);
			Parameter symbol_160 = PivotFactory.eINSTANCE.createParameter();
			symbol_160.setName("i");
			symbol_160.setType(symbol_22);
			symbol_159.getOwnedIterators().add(symbol_160);
			symbol_159.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_159);
		}
		{	// lib::oclM1::Collection::iterate() oclM1.Collection{T}.iterate{Tacc}(oclM1.Collection{T}.T;Tacc)
			Iterate symbol_161 = PivotFactory.eINSTANCE.createIterate();
			TemplateSignature symbol_162 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Collection{T}.iterate{Tacc}(oclM1.Collection{T}.T;Tacc).
			TypeTemplateParameter symbol_163 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_164 = PivotFactory.eINSTANCE.createClass(); // oclM1.Collection{T}.iterate{Tacc}(oclM1.Collection{T}.T;Tacc).Tacc
			
			symbol_164.setName("Tacc");
			symbol_163.setOwnedParameteredElement(symbol_164);
			symbol_162.getOwnedParameters().add(symbol_163);
			
			symbol_161.setOwnedTemplateSignature(symbol_162);
			symbol_161.setName("iterate");
			symbol_161.setType(symbol_164);
			Parameter symbol_165 = PivotFactory.eINSTANCE.createParameter();
			symbol_165.setName("i");
			symbol_165.setType(symbol_22);
			symbol_161.getOwnedIterators().add(symbol_165);
			Parameter symbol_166 = PivotFactory.eINSTANCE.createParameter();
			symbol_166.setName("acc");
			symbol_166.setType(symbol_164);
			symbol_161.getOwnedAccumulators().add(symbol_166);
			symbol_161.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_161);
		}
		{	// lib::oclM1::Collection::max() oclM1.Collection{T}.max()
			Operation symbol_167 = PivotFactory.eINSTANCE.createOperation();
			symbol_167.setName("max");
			symbol_167.setType(symbol_22);
			symbol_167.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_167);
		}
		{	// lib::oclM1::Collection::min() oclM1.Collection{T}.min()
			Operation symbol_168 = PivotFactory.eINSTANCE.createOperation();
			symbol_168.setName("min");
			symbol_168.setType(symbol_22);
			symbol_168.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_168);
		}
		{	// lib::oclM1::Collection::notEmpty() oclM1.Collection{T}.notEmpty()
			Operation symbol_169 = PivotFactory.eINSTANCE.createOperation();
			symbol_169.setName("notEmpty");
			symbol_169.setType(symbol_17);
			symbol_169.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_169);
		}
		{	// lib::oclM1::Collection::one() oclM1.Collection{T}.one(oclM1.Collection{T}.T)
			Iterator symbol_170 = PivotFactory.eINSTANCE.createIterator();
			symbol_170.setName("one");
			symbol_170.setType(symbol_17);
			Parameter symbol_171 = PivotFactory.eINSTANCE.createParameter();
			symbol_171.setName("i");
			symbol_171.setType(symbol_22);
			symbol_170.getOwnedIterators().add(symbol_171);
			symbol_170.setImplementation(org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_170);
		}
		{	// lib::oclM1::Collection::product() oclM1.Collection{T}.product{T2}(oclM1.Collection{T})
			Operation symbol_172 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_173 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Collection{T}.product{T2}(oclM1.Collection{T}).
			TypeTemplateParameter symbol_174 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_175 = PivotFactory.eINSTANCE.createClass(); // oclM1.Collection{T}.product{T2}(oclM1.Collection{T}).T2
			
			symbol_175.setName("T2");
			symbol_174.setOwnedParameteredElement(symbol_175);
			symbol_173.getOwnedParameters().add(symbol_174);
			
			symbol_172.setOwnedTemplateSignature(symbol_173);
			symbol_172.setName("product");
			symbol_172.setType(symbol_52);
			Parameter symbol_176 = PivotFactory.eINSTANCE.createParameter();
			symbol_176.setName("c2");
			symbol_176.setType(symbol_19);
			symbol_172.getOwnedParameters().add(symbol_176);
			symbol_172.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_172);
		}
		{	// lib::oclM1::Collection::reject() oclM1.Collection{T}.reject(oclM1.Collection{T}.T)
			Iterator symbol_177 = PivotFactory.eINSTANCE.createIterator();
			symbol_177.setName("reject");
			symbol_177.setType(symbol_19);
			Parameter symbol_178 = PivotFactory.eINSTANCE.createParameter();
			symbol_178.setName("i");
			symbol_178.setType(symbol_22);
			symbol_177.getOwnedIterators().add(symbol_178);
			symbol_177.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_177);
		}
		{	// lib::oclM1::Collection::select() oclM1.Collection{T}.select(oclM1.Collection{T}.T)
			Iterator symbol_179 = PivotFactory.eINSTANCE.createIterator();
			symbol_179.setName("select");
			symbol_179.setType(symbol_19);
			Parameter symbol_180 = PivotFactory.eINSTANCE.createParameter();
			symbol_180.setName("i");
			symbol_180.setType(symbol_22);
			symbol_179.getOwnedIterators().add(symbol_180);
			symbol_179.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_179);
		}
		{	// lib::oclM1::Collection::size() oclM1.Collection{T}.size()
			Operation symbol_181 = PivotFactory.eINSTANCE.createOperation();
			symbol_181.setName("size");
			symbol_181.setType(symbol_24);
			symbol_181.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_181);
		}
		{	// lib::oclM1::Collection::sortedBy() oclM1.Collection{T}.sortedBy(oclM1.Collection{T}.T)
			Iterator symbol_182 = PivotFactory.eINSTANCE.createIterator();
			symbol_182.setName("sortedBy");
			symbol_182.setType(symbol_39);
			Parameter symbol_183 = PivotFactory.eINSTANCE.createParameter();
			symbol_183.setName("i");
			symbol_183.setType(symbol_22);
			symbol_182.getOwnedIterators().add(symbol_183);
			symbol_182.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_182);
		}
		{	// lib::oclM1::Collection::sum() oclM1.Collection{T}.sum()
			Operation symbol_184 = PivotFactory.eINSTANCE.createOperation();
			symbol_184.setName("sum");
			symbol_184.setType(symbol_22);
			symbol_184.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
			symbol_19.getOwnedOperations().add(symbol_184);
		}
		symbol_12.getOwnedTypes().add(symbol_19);
		//
		// lib::oclM1::Enumeration
		//
		symbol_23.setName("Enumeration");
		symbol_23.getSuperClasses().add(symbol_33);
		{	// lib::oclM1::Enumeration::allInstances() oclM1.Enumeration.allInstances()
			Operation symbol_185 = PivotFactory.eINSTANCE.createOperation();
			symbol_185.setName("allInstances");
			symbol_185.setType(symbol_52);
			symbol_185.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
			symbol_23.getOwnedOperations().add(symbol_185);
		}
		symbol_12.getOwnedTypes().add(symbol_23);
		//
		// lib::oclM1::Integer
		//
		symbol_24.setName("Integer");
		symbol_24.getSuperClasses().add(symbol_47);
		{	// lib::oclM1::Integer::*() oclM1.Integer.*(oclM1.Integer)
			Operation symbol_186 = PivotFactory.eINSTANCE.createOperation();
			symbol_186.setName("*");
			symbol_186.setType(symbol_24);
			Parameter symbol_187 = PivotFactory.eINSTANCE.createParameter();
			symbol_187.setName("i");
			symbol_187.setType(symbol_24);
			symbol_186.getOwnedParameters().add(symbol_187);
			symbol_186.setPrecedence(symbol_6);
			symbol_186.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_24.getOwnedOperations().add(symbol_186);
		}
		{	// lib::oclM1::Integer::+() oclM1.Integer.+(oclM1.Integer)
			Operation symbol_188 = PivotFactory.eINSTANCE.createOperation();
			symbol_188.setName("+");
			symbol_188.setType(symbol_24);
			Parameter symbol_189 = PivotFactory.eINSTANCE.createParameter();
			symbol_189.setName("i");
			symbol_189.setType(symbol_24);
			symbol_188.getOwnedParameters().add(symbol_189);
			symbol_188.setPrecedence(symbol_8);
			symbol_188.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericPlusOperation.INSTANCE);
			symbol_24.getOwnedOperations().add(symbol_188);
		}
		{	// lib::oclM1::Integer::-() oclM1.Integer.-()
			Operation symbol_190 = PivotFactory.eINSTANCE.createOperation();
			symbol_190.setName("-");
			symbol_190.setType(symbol_24);
			symbol_190.setPrecedence(symbol_9);
			symbol_190.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_24.getOwnedOperations().add(symbol_190);
		}
		{	// lib::oclM1::Integer::-() oclM1.Integer.-(oclM1.Integer)
			Operation symbol_191 = PivotFactory.eINSTANCE.createOperation();
			symbol_191.setName("-");
			symbol_191.setType(symbol_24);
			Parameter symbol_192 = PivotFactory.eINSTANCE.createParameter();
			symbol_192.setName("i");
			symbol_192.setType(symbol_24);
			symbol_191.getOwnedParameters().add(symbol_192);
			symbol_191.setPrecedence(symbol_8);
			symbol_191.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinusOperation.INSTANCE);
			symbol_24.getOwnedOperations().add(symbol_191);
		}
		{	// lib::oclM1::Integer::/() oclM1.Integer./(oclM1.Integer)
			Operation symbol_193 = PivotFactory.eINSTANCE.createOperation();
			symbol_193.setName("/");
			symbol_193.setType(symbol_47);
			Parameter symbol_194 = PivotFactory.eINSTANCE.createParameter();
			symbol_194.setName("i");
			symbol_194.setType(symbol_24);
			symbol_193.getOwnedParameters().add(symbol_194);
			symbol_193.setPrecedence(symbol_6);
			symbol_193.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_24.getOwnedOperations().add(symbol_193);
		}
		{	// lib::oclM1::Integer::abs() oclM1.Integer.abs()
			Operation symbol_195 = PivotFactory.eINSTANCE.createOperation();
			symbol_195.setName("abs");
			symbol_195.setType(symbol_24);
			symbol_195.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_24.getOwnedOperations().add(symbol_195);
		}
		{	// lib::oclM1::Integer::div() oclM1.Integer.div(oclM1.Integer)
			Operation symbol_196 = PivotFactory.eINSTANCE.createOperation();
			symbol_196.setName("div");
			symbol_196.setType(symbol_24);
			Parameter symbol_197 = PivotFactory.eINSTANCE.createParameter();
			symbol_197.setName("i");
			symbol_197.setType(symbol_24);
			symbol_196.getOwnedParameters().add(symbol_197);
			symbol_196.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE);
			symbol_24.getOwnedOperations().add(symbol_196);
		}
		{	// lib::oclM1::Integer::max() oclM1.Integer.max(oclM1.Integer)
			Operation symbol_198 = PivotFactory.eINSTANCE.createOperation();
			symbol_198.setName("max");
			symbol_198.setType(symbol_24);
			Parameter symbol_199 = PivotFactory.eINSTANCE.createParameter();
			symbol_199.setName("i");
			symbol_199.setType(symbol_24);
			symbol_198.getOwnedParameters().add(symbol_199);
			symbol_198.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_24.getOwnedOperations().add(symbol_198);
		}
		{	// lib::oclM1::Integer::min() oclM1.Integer.min(oclM1.Integer)
			Operation symbol_200 = PivotFactory.eINSTANCE.createOperation();
			symbol_200.setName("min");
			symbol_200.setType(symbol_24);
			Parameter symbol_201 = PivotFactory.eINSTANCE.createParameter();
			symbol_201.setName("i");
			symbol_201.setType(symbol_24);
			symbol_200.getOwnedParameters().add(symbol_201);
			symbol_200.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_24.getOwnedOperations().add(symbol_200);
		}
		{	// lib::oclM1::Integer::mod() oclM1.Integer.mod(oclM1.Integer)
			Operation symbol_202 = PivotFactory.eINSTANCE.createOperation();
			symbol_202.setName("mod");
			symbol_202.setType(symbol_24);
			Parameter symbol_203 = PivotFactory.eINSTANCE.createParameter();
			symbol_203.setName("i");
			symbol_203.setType(symbol_24);
			symbol_202.getOwnedParameters().add(symbol_203);
			symbol_202.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE);
			symbol_24.getOwnedOperations().add(symbol_202);
		}
		{	// lib::oclM1::Integer::toString() oclM1.Integer.toString()
			Operation symbol_204 = PivotFactory.eINSTANCE.createOperation();
			symbol_204.setName("toString");
			symbol_204.setType(symbol_56);
			symbol_204.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_24.getOwnedOperations().add(symbol_204);
		}
		symbol_12.getOwnedTypes().add(symbol_24);
		//
		// lib::oclM1::NonOrderedCollection
		//
		symbol_25.setName("NonOrderedCollection");
		symbol_28.setName("T");
		symbol_27.setOwnedParameteredElement(symbol_28);
		symbol_26.getOwnedParameters().add(symbol_27);
		
		symbol_25.setOwnedTemplateSignature(symbol_26);
		symbol_25.getSuperClasses().add(symbol_19);
		{	// lib::oclM1::NonOrderedCollection::closure() oclM1.NonOrderedCollection{T}.closure(oclM1.NonOrderedCollection{T}.T)
			Iterator symbol_205 = PivotFactory.eINSTANCE.createIterator();
			symbol_205.setName("closure");
			symbol_205.setType(symbol_52);
			Parameter symbol_206 = PivotFactory.eINSTANCE.createParameter();
			symbol_206.setName("i");
			symbol_206.setType(symbol_28);
			symbol_205.getOwnedIterators().add(symbol_206);
			symbol_205.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_25.getOwnedOperations().add(symbol_205);
		}
		{	// lib::oclM1::NonOrderedCollection::collect() oclM1.NonOrderedCollection{T}.collect(oclM1.NonOrderedCollection{T}.T)
			Iterator symbol_207 = PivotFactory.eINSTANCE.createIterator();
			symbol_207.setName("collect");
			symbol_207.setType(symbol_13);
			Parameter symbol_208 = PivotFactory.eINSTANCE.createParameter();
			symbol_208.setName("i");
			symbol_208.setType(symbol_28);
			symbol_207.getOwnedIterators().add(symbol_208);
			symbol_207.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_25.getOwnedOperations().add(symbol_207);
		}
		{	// lib::oclM1::NonOrderedCollection::collectNested() oclM1.NonOrderedCollection{T}.collectNested(oclM1.NonOrderedCollection{T}.T)
			Iterator symbol_209 = PivotFactory.eINSTANCE.createIterator();
			symbol_209.setName("collectNested");
			symbol_209.setType(symbol_13);
			Parameter symbol_210 = PivotFactory.eINSTANCE.createParameter();
			symbol_210.setName("i");
			symbol_210.setType(symbol_28);
			symbol_209.getOwnedIterators().add(symbol_210);
			symbol_209.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_25.getOwnedOperations().add(symbol_209);
		}
		{	// lib::oclM1::NonOrderedCollection::intersection() oclM1.NonOrderedCollection{T}.intersection(oclM1.Bag{T})
			Operation symbol_211 = PivotFactory.eINSTANCE.createOperation();
			symbol_211.setName("intersection");
			symbol_211.setType(symbol_13);
			Parameter symbol_212 = PivotFactory.eINSTANCE.createParameter();
			symbol_212.setName("bag");
			symbol_212.setType(symbol_13);
			symbol_211.getOwnedParameters().add(symbol_212);
			symbol_211.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_25.getOwnedOperations().add(symbol_211);
		}
		{	// lib::oclM1::NonOrderedCollection::intersection() oclM1.NonOrderedCollection{T}.intersection(oclM1.Set{T})
			Operation symbol_213 = PivotFactory.eINSTANCE.createOperation();
			symbol_213.setName("intersection");
			symbol_213.setType(symbol_52);
			Parameter symbol_214 = PivotFactory.eINSTANCE.createParameter();
			symbol_214.setName("s");
			symbol_214.setType(symbol_52);
			symbol_213.getOwnedParameters().add(symbol_214);
			symbol_213.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_25.getOwnedOperations().add(symbol_213);
		}
		{	// lib::oclM1::NonOrderedCollection::union() oclM1.NonOrderedCollection{T}.union(oclM1.Bag{T})
			Operation symbol_215 = PivotFactory.eINSTANCE.createOperation();
			symbol_215.setName("union");
			symbol_215.setType(symbol_13);
			Parameter symbol_216 = PivotFactory.eINSTANCE.createParameter();
			symbol_216.setName("bag");
			symbol_216.setType(symbol_13);
			symbol_215.getOwnedParameters().add(symbol_216);
			symbol_215.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_25.getOwnedOperations().add(symbol_215);
		}
		{	// lib::oclM1::NonOrderedCollection::union() oclM1.NonOrderedCollection{T}.union(oclM1.Set{T})
			Operation symbol_217 = PivotFactory.eINSTANCE.createOperation();
			symbol_217.setName("union");
			symbol_217.setType(symbol_52);
			Parameter symbol_218 = PivotFactory.eINSTANCE.createParameter();
			symbol_218.setName("s");
			symbol_218.setType(symbol_52);
			symbol_217.getOwnedParameters().add(symbol_218);
			symbol_217.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_25.getOwnedOperations().add(symbol_217);
		}
		symbol_12.getOwnedTypes().add(symbol_25);
		//
		// lib::oclM1::NonUniqueCollection
		//
		symbol_29.setName("NonUniqueCollection");
		symbol_32.setName("T");
		symbol_31.setOwnedParameteredElement(symbol_32);
		symbol_30.getOwnedParameters().add(symbol_31);
		
		symbol_29.setOwnedTemplateSignature(symbol_30);
		symbol_29.getSuperClasses().add(symbol_19);
		{	// lib::oclM1::NonUniqueCollection::sortedBy() oclM1.NonUniqueCollection{T}.sortedBy(oclM1.NonUniqueCollection{T}.T)
			Iterator symbol_219 = PivotFactory.eINSTANCE.createIterator();
			symbol_219.setName("sortedBy");
			symbol_219.setType(symbol_48);
			Parameter symbol_220 = PivotFactory.eINSTANCE.createParameter();
			symbol_220.setName("i");
			symbol_220.setType(symbol_32);
			symbol_219.getOwnedIterators().add(symbol_220);
			symbol_219.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_29.getOwnedOperations().add(symbol_219);
		}
		symbol_12.getOwnedTypes().add(symbol_29);
		//
		// lib::oclM1::OclAny
		//
		symbol_33.setName("OclAny");
		{	// lib::oclM1::OclAny::.() oclM1.OclAny..{T}(oclM1.OclAny)
			Operation symbol_221 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_222 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.OclAny..{T}(oclM1.OclAny).
			TypeTemplateParameter symbol_223 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_224 = PivotFactory.eINSTANCE.createClass(); // oclM1.OclAny..{T}(oclM1.OclAny).T
			
			symbol_224.setName("T");
			symbol_223.setOwnedParameteredElement(symbol_224);
			symbol_222.getOwnedParameters().add(symbol_223);
			
			symbol_221.setOwnedTemplateSignature(symbol_222);
			symbol_221.setName(".");
			symbol_221.setType(symbol_224);
			Parameter symbol_225 = PivotFactory.eINSTANCE.createParameter();
			symbol_225.setName("object2");
			symbol_225.setType(symbol_33);
			symbol_221.getOwnedParameters().add(symbol_225);
			symbol_221.setPrecedence(symbol_11);
			symbol_221.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_33.getOwnedOperations().add(symbol_221);
		}
		{	// lib::oclM1::OclAny::<>() oclM1.OclAny.<>(oclM1.OclAny)
			Operation symbol_226 = PivotFactory.eINSTANCE.createOperation();
			symbol_226.setName("<>");
			symbol_226.setType(symbol_17);
			Parameter symbol_227 = PivotFactory.eINSTANCE.createParameter();
			symbol_227.setName("object2");
			symbol_227.setType(symbol_33);
			symbol_226.getOwnedParameters().add(symbol_227);
			symbol_226.setPrecedence(symbol_5);
			symbol_226.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_33.getOwnedOperations().add(symbol_226);
		}
		{	// lib::oclM1::OclAny::=() oclM1.OclAny.=(oclM1.OclAny)
			Operation symbol_228 = PivotFactory.eINSTANCE.createOperation();
			symbol_228.setName("=");
			symbol_228.setType(symbol_17);
			Parameter symbol_229 = PivotFactory.eINSTANCE.createParameter();
			symbol_229.setName("object2");
			symbol_229.setType(symbol_33);
			symbol_228.getOwnedParameters().add(symbol_229);
			symbol_228.setPrecedence(symbol_5);
			symbol_228.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_33.getOwnedOperations().add(symbol_228);
		}
		{	// lib::oclM1::OclAny::oclAsSet() oclM1.OclAny.oclAsSet()
			Operation symbol_230 = PivotFactory.eINSTANCE.createOperation();
			symbol_230.setName("oclAsSet");
			symbol_230.setType(symbol_19);
			symbol_230.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
			symbol_33.getOwnedOperations().add(symbol_230);
		}
		{	// lib::oclM1::OclAny::oclAsType() oclM1.OclAny.oclAsType{T}(oclM2.Class{T})
			Operation symbol_231 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_232 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.OclAny.oclAsType{T}(oclM2.Class{T}).
			TypeTemplateParameter symbol_233 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_234 = PivotFactory.eINSTANCE.createClass(); // oclM1.OclAny.oclAsType{T}(oclM2.Class{T}).T
			
			symbol_234.setName("T");
			symbol_233.setOwnedParameteredElement(symbol_234);
			symbol_232.getOwnedParameters().add(symbol_233);
			
			symbol_231.setOwnedTemplateSignature(symbol_232);
			symbol_231.setName("oclAsType");
			symbol_231.setType(symbol_234);
			Parameter symbol_235 = PivotFactory.eINSTANCE.createParameter();
			symbol_235.setName("type");
			symbol_235.setType(symbol_69);
			symbol_231.getOwnedParameters().add(symbol_235);
			symbol_231.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE);
			symbol_33.getOwnedOperations().add(symbol_231);
		}
		{	// lib::oclM1::OclAny::oclIsInState() oclM1.OclAny.oclIsInState(oclM1.OclState)
			Operation symbol_236 = PivotFactory.eINSTANCE.createOperation();
			symbol_236.setName("oclIsInState");
			symbol_236.setType(symbol_17);
			Parameter symbol_237 = PivotFactory.eINSTANCE.createParameter();
			symbol_237.setName("statespec");
			symbol_237.setType(symbol_36);
			symbol_236.getOwnedParameters().add(symbol_237);
			symbol_236.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE);
			symbol_33.getOwnedOperations().add(symbol_236);
		}
		{	// lib::oclM1::OclAny::oclIsInvalid() oclM1.OclAny.oclIsInvalid()
			Operation symbol_238 = PivotFactory.eINSTANCE.createOperation();
			symbol_238.setName("oclIsInvalid");
			symbol_238.setType(symbol_17);
			symbol_238.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
			symbol_33.getOwnedOperations().add(symbol_238);
		}
		{	// lib::oclM1::OclAny::oclIsKindOf() oclM1.OclAny.oclIsKindOf{T}(oclM2.Class{T})
			Operation symbol_239 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_240 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.OclAny.oclIsKindOf{T}(oclM2.Class{T}).
			TypeTemplateParameter symbol_241 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_242 = PivotFactory.eINSTANCE.createClass(); // oclM1.OclAny.oclIsKindOf{T}(oclM2.Class{T}).T
			
			symbol_242.setName("T");
			symbol_241.setOwnedParameteredElement(symbol_242);
			symbol_240.getOwnedParameters().add(symbol_241);
			
			symbol_239.setOwnedTemplateSignature(symbol_240);
			symbol_239.setName("oclIsKindOf");
			symbol_239.setType(symbol_17);
			Parameter symbol_243 = PivotFactory.eINSTANCE.createParameter();
			symbol_243.setName("type");
			symbol_243.setType(symbol_69);
			symbol_239.getOwnedParameters().add(symbol_243);
			symbol_239.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
			symbol_33.getOwnedOperations().add(symbol_239);
		}
		{	// lib::oclM1::OclAny::oclIsNew() oclM1.OclAny.oclIsNew()
			Operation symbol_244 = PivotFactory.eINSTANCE.createOperation();
			symbol_244.setName("oclIsNew");
			symbol_244.setType(symbol_17);
			symbol_244.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_33.getOwnedOperations().add(symbol_244);
		}
		{	// lib::oclM1::OclAny::oclIsTypeOf() oclM1.OclAny.oclIsTypeOf{T}(oclM2.Class{T})
			Operation symbol_245 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_246 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.OclAny.oclIsTypeOf{T}(oclM2.Class{T}).
			TypeTemplateParameter symbol_247 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_248 = PivotFactory.eINSTANCE.createClass(); // oclM1.OclAny.oclIsTypeOf{T}(oclM2.Class{T}).T
			
			symbol_248.setName("T");
			symbol_247.setOwnedParameteredElement(symbol_248);
			symbol_246.getOwnedParameters().add(symbol_247);
			
			symbol_245.setOwnedTemplateSignature(symbol_246);
			symbol_245.setName("oclIsTypeOf");
			symbol_245.setType(symbol_17);
			Parameter symbol_249 = PivotFactory.eINSTANCE.createParameter();
			symbol_249.setName("type");
			symbol_249.setType(symbol_69);
			symbol_245.getOwnedParameters().add(symbol_249);
			symbol_245.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
			symbol_33.getOwnedOperations().add(symbol_245);
		}
		{	// lib::oclM1::OclAny::oclIsUndefined() oclM1.OclAny.oclIsUndefined()
			Operation symbol_250 = PivotFactory.eINSTANCE.createOperation();
			symbol_250.setName("oclIsUndefined");
			symbol_250.setType(symbol_17);
			symbol_250.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
			symbol_33.getOwnedOperations().add(symbol_250);
		}
		{	// lib::oclM1::OclAny::oclType() oclM1.OclAny.oclType{T}()
			Operation symbol_251 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_252 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.OclAny.oclType{T}().
			TypeTemplateParameter symbol_253 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_254 = PivotFactory.eINSTANCE.createClass(); // oclM1.OclAny.oclType{T}().T
			
			symbol_254.setName("T");
			symbol_253.setOwnedParameteredElement(symbol_254);
			symbol_252.getOwnedParameters().add(symbol_253);
			
			symbol_251.setOwnedTemplateSignature(symbol_252);
			symbol_251.setName("oclType");
			symbol_251.setType(symbol_69);
			symbol_251.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_33.getOwnedOperations().add(symbol_251);
		}
		symbol_12.getOwnedTypes().add(symbol_33);
		//
		// lib::oclM1::OclInvalid
		//
		symbol_34.setName("OclInvalid");
		symbol_34.getSuperClasses().add(symbol_38);
		{	// lib::oclM1::OclInvalid::<>() oclM1.OclInvalid.<>(oclM1.OclInvalid)
			Operation symbol_255 = PivotFactory.eINSTANCE.createOperation();
			symbol_255.setName("<>");
			symbol_255.setType(symbol_17);
			Parameter symbol_256 = PivotFactory.eINSTANCE.createParameter();
			symbol_256.setName("object2");
			symbol_256.setType(symbol_34);
			symbol_255.getOwnedParameters().add(symbol_256);
			symbol_255.setPrecedence(symbol_5);
			symbol_255.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidNotEqualOperation.INSTANCE);
			symbol_34.getOwnedOperations().add(symbol_255);
		}
		{	// lib::oclM1::OclInvalid::=() oclM1.OclInvalid.=(oclM1.OclInvalid)
			Operation symbol_257 = PivotFactory.eINSTANCE.createOperation();
			symbol_257.setName("=");
			symbol_257.setType(symbol_17);
			Parameter symbol_258 = PivotFactory.eINSTANCE.createParameter();
			symbol_258.setName("object2");
			symbol_258.setType(symbol_34);
			symbol_257.getOwnedParameters().add(symbol_258);
			symbol_257.setPrecedence(symbol_5);
			symbol_257.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidEqualOperation.INSTANCE);
			symbol_34.getOwnedOperations().add(symbol_257);
		}
		{	// lib::oclM1::OclInvalid::allInstances() oclM1.OclInvalid.allInstances()
			Operation symbol_259 = PivotFactory.eINSTANCE.createOperation();
			symbol_259.setName("allInstances");
			symbol_259.setType(symbol_52);
			symbol_259.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
			symbol_34.getOwnedOperations().add(symbol_259);
		}
		symbol_12.getOwnedTypes().add(symbol_34);
		//
		// lib::oclM1::OclMessage
		//
		symbol_35.setName("OclMessage");
		symbol_35.getSuperClasses().add(symbol_33);
		{	// lib::oclM1::OclMessage::hasReturned() oclM1.OclMessage.hasReturned()
			Operation symbol_260 = PivotFactory.eINSTANCE.createOperation();
			symbol_260.setName("hasReturned");
			symbol_260.setType(symbol_17);
			symbol_260.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_35.getOwnedOperations().add(symbol_260);
		}
		{	// lib::oclM1::OclMessage::isOperationCall() oclM1.OclMessage.isOperationCall()
			Operation symbol_261 = PivotFactory.eINSTANCE.createOperation();
			symbol_261.setName("isOperationCall");
			symbol_261.setType(symbol_17);
			symbol_261.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_35.getOwnedOperations().add(symbol_261);
		}
		{	// lib::oclM1::OclMessage::isSignalSent() oclM1.OclMessage.isSignalSent()
			Operation symbol_262 = PivotFactory.eINSTANCE.createOperation();
			symbol_262.setName("isSignalSent");
			symbol_262.setType(symbol_17);
			symbol_262.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_35.getOwnedOperations().add(symbol_262);
		}
		{	// lib::oclM1::OclMessage::result() oclM1.OclMessage.result()
			Operation symbol_263 = PivotFactory.eINSTANCE.createOperation();
			symbol_263.setName("result");
			symbol_263.setType(symbol_33);
			symbol_263.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_35.getOwnedOperations().add(symbol_263);
		}
		symbol_12.getOwnedTypes().add(symbol_35);
		//
		// lib::oclM1::OclState
		//
		symbol_36.setName("OclState");
		symbol_36.getSuperClasses().add(symbol_33);
		symbol_12.getOwnedTypes().add(symbol_36);
		//
		// lib::oclM1::OclTuple
		//
		symbol_37.setName("OclTuple");
		symbol_37.getSuperClasses().add(symbol_33);
		{	// lib::oclM1::OclTuple::<>() oclM1.OclTuple.<>(oclM1.OclTuple)
			Operation symbol_264 = PivotFactory.eINSTANCE.createOperation();
			symbol_264.setName("<>");
			symbol_264.setType(symbol_17);
			Parameter symbol_265 = PivotFactory.eINSTANCE.createParameter();
			symbol_265.setName("object2");
			symbol_265.setType(symbol_37);
			symbol_264.getOwnedParameters().add(symbol_265);
			symbol_264.setPrecedence(symbol_5);
			symbol_264.setImplementation(org.eclipse.ocl.examples.library.tuple.TupleNotEqualOperation.INSTANCE);
			symbol_37.getOwnedOperations().add(symbol_264);
		}
		{	// lib::oclM1::OclTuple::=() oclM1.OclTuple.=(oclM1.OclTuple)
			Operation symbol_266 = PivotFactory.eINSTANCE.createOperation();
			symbol_266.setName("=");
			symbol_266.setType(symbol_17);
			Parameter symbol_267 = PivotFactory.eINSTANCE.createParameter();
			symbol_267.setName("object2");
			symbol_267.setType(symbol_37);
			symbol_266.getOwnedParameters().add(symbol_267);
			symbol_266.setPrecedence(symbol_5);
			symbol_266.setImplementation(org.eclipse.ocl.examples.library.tuple.TupleEqualOperation.INSTANCE);
			symbol_37.getOwnedOperations().add(symbol_266);
		}
		symbol_12.getOwnedTypes().add(symbol_37);
		//
		// lib::oclM1::OclVoid
		//
		symbol_38.setName("OclVoid");
		symbol_38.getSuperClasses().add(symbol_33);
		{	// lib::oclM1::OclVoid::<>() oclM1.OclVoid.<>(oclM1.OclVoid)
			Operation symbol_268 = PivotFactory.eINSTANCE.createOperation();
			symbol_268.setName("<>");
			symbol_268.setType(symbol_17);
			Parameter symbol_269 = PivotFactory.eINSTANCE.createParameter();
			symbol_269.setName("object2");
			symbol_269.setType(symbol_38);
			symbol_268.getOwnedParameters().add(symbol_269);
			symbol_268.setPrecedence(symbol_5);
			symbol_268.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidNotEqualOperation.INSTANCE);
			symbol_38.getOwnedOperations().add(symbol_268);
		}
		{	// lib::oclM1::OclVoid::=() oclM1.OclVoid.=(oclM1.OclVoid)
			Operation symbol_270 = PivotFactory.eINSTANCE.createOperation();
			symbol_270.setName("=");
			symbol_270.setType(symbol_17);
			Parameter symbol_271 = PivotFactory.eINSTANCE.createParameter();
			symbol_271.setName("object2");
			symbol_271.setType(symbol_38);
			symbol_270.getOwnedParameters().add(symbol_271);
			symbol_270.setPrecedence(symbol_5);
			symbol_270.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidEqualOperation.INSTANCE);
			symbol_38.getOwnedOperations().add(symbol_270);
		}
		{	// lib::oclM1::OclVoid::allInstances() oclM1.OclVoid.allInstances()
			Operation symbol_272 = PivotFactory.eINSTANCE.createOperation();
			symbol_272.setName("allInstances");
			symbol_272.setType(symbol_52);
			symbol_272.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
			symbol_38.getOwnedOperations().add(symbol_272);
		}
		{	// lib::oclM1::OclVoid::and() oclM1.OclVoid.and(oclM1.Boolean)
			Operation symbol_273 = PivotFactory.eINSTANCE.createOperation();
			symbol_273.setName("and");
			symbol_273.setType(symbol_17);
			Parameter symbol_274 = PivotFactory.eINSTANCE.createParameter();
			symbol_274.setName("b");
			symbol_274.setType(symbol_17);
			symbol_273.getOwnedParameters().add(symbol_274);
			symbol_273.setPrecedence(symbol_7);
			symbol_273.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE);
			symbol_38.getOwnedOperations().add(symbol_273);
		}
		{	// lib::oclM1::OclVoid::implies() oclM1.OclVoid.implies(oclM1.Boolean)
			Operation symbol_275 = PivotFactory.eINSTANCE.createOperation();
			symbol_275.setName("implies");
			symbol_275.setType(symbol_17);
			Parameter symbol_276 = PivotFactory.eINSTANCE.createParameter();
			symbol_276.setName("b");
			symbol_276.setType(symbol_17);
			symbol_275.getOwnedParameters().add(symbol_276);
			symbol_275.setPrecedence(symbol_3);
			symbol_275.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE);
			symbol_38.getOwnedOperations().add(symbol_275);
		}
		{	// lib::oclM1::OclVoid::or() oclM1.OclVoid.or(oclM1.Boolean)
			Operation symbol_277 = PivotFactory.eINSTANCE.createOperation();
			symbol_277.setName("or");
			symbol_277.setType(symbol_17);
			Parameter symbol_278 = PivotFactory.eINSTANCE.createParameter();
			symbol_278.setName("b");
			symbol_278.setType(symbol_17);
			symbol_277.getOwnedParameters().add(symbol_278);
			symbol_277.setPrecedence(symbol_2);
			symbol_277.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE);
			symbol_38.getOwnedOperations().add(symbol_277);
		}
		symbol_12.getOwnedTypes().add(symbol_38);
		//
		// lib::oclM1::OrderedCollection
		//
		symbol_39.setName("OrderedCollection");
		symbol_42.setName("T");
		symbol_41.setOwnedParameteredElement(symbol_42);
		symbol_40.getOwnedParameters().add(symbol_41);
		
		symbol_39.setOwnedTemplateSignature(symbol_40);
		symbol_39.getSuperClasses().add(symbol_19);
		{	// lib::oclM1::OrderedCollection::at() oclM1.OrderedCollection{T}.at(oclM1.Integer)
			Operation symbol_279 = PivotFactory.eINSTANCE.createOperation();
			symbol_279.setName("at");
			symbol_279.setType(symbol_42);
			Parameter symbol_280 = PivotFactory.eINSTANCE.createParameter();
			symbol_280.setName("index");
			symbol_280.setType(symbol_24);
			symbol_279.getOwnedParameters().add(symbol_280);
			symbol_279.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE);
			symbol_39.getOwnedOperations().add(symbol_279);
		}
		{	// lib::oclM1::OrderedCollection::closure() oclM1.OrderedCollection{T}.closure(oclM1.OrderedCollection{T}.T)
			Iterator symbol_281 = PivotFactory.eINSTANCE.createIterator();
			symbol_281.setName("closure");
			symbol_281.setType(symbol_43);
			Parameter symbol_282 = PivotFactory.eINSTANCE.createParameter();
			symbol_282.setName("i");
			symbol_282.setType(symbol_42);
			symbol_281.getOwnedIterators().add(symbol_282);
			symbol_281.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_39.getOwnedOperations().add(symbol_281);
		}
		{	// lib::oclM1::OrderedCollection::collect() oclM1.OrderedCollection{T}.collect(oclM1.OrderedCollection{T}.T)
			Iterator symbol_283 = PivotFactory.eINSTANCE.createIterator();
			symbol_283.setName("collect");
			symbol_283.setType(symbol_48);
			Parameter symbol_284 = PivotFactory.eINSTANCE.createParameter();
			symbol_284.setName("i");
			symbol_284.setType(symbol_42);
			symbol_283.getOwnedIterators().add(symbol_284);
			symbol_283.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_39.getOwnedOperations().add(symbol_283);
		}
		{	// lib::oclM1::OrderedCollection::collectNested() oclM1.OrderedCollection{T}.collectNested(oclM1.OrderedCollection{T}.T)
			Iterator symbol_285 = PivotFactory.eINSTANCE.createIterator();
			symbol_285.setName("collectNested");
			symbol_285.setType(symbol_48);
			Parameter symbol_286 = PivotFactory.eINSTANCE.createParameter();
			symbol_286.setName("i");
			symbol_286.setType(symbol_42);
			symbol_285.getOwnedIterators().add(symbol_286);
			symbol_285.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_39.getOwnedOperations().add(symbol_285);
		}
		{	// lib::oclM1::OrderedCollection::first() oclM1.OrderedCollection{T}.first()
			Operation symbol_287 = PivotFactory.eINSTANCE.createOperation();
			symbol_287.setName("first");
			symbol_287.setType(symbol_42);
			symbol_287.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
			symbol_39.getOwnedOperations().add(symbol_287);
		}
		{	// lib::oclM1::OrderedCollection::indexOf() oclM1.OrderedCollection{T}.indexOf(oclM1.OclAny)
			Operation symbol_288 = PivotFactory.eINSTANCE.createOperation();
			symbol_288.setName("indexOf");
			symbol_288.setType(symbol_24);
			Parameter symbol_289 = PivotFactory.eINSTANCE.createParameter();
			symbol_289.setName("obj");
			symbol_289.setType(symbol_33);
			symbol_288.getOwnedParameters().add(symbol_289);
			symbol_288.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE);
			symbol_39.getOwnedOperations().add(symbol_288);
		}
		{	// lib::oclM1::OrderedCollection::last() oclM1.OrderedCollection{T}.last()
			Operation symbol_290 = PivotFactory.eINSTANCE.createOperation();
			symbol_290.setName("last");
			symbol_290.setType(symbol_42);
			symbol_290.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
			symbol_39.getOwnedOperations().add(symbol_290);
		}
		{	// lib::oclM1::OrderedCollection::reverse() oclM1.OrderedCollection{T}.reverse()
			Operation symbol_291 = PivotFactory.eINSTANCE.createOperation();
			symbol_291.setName("reverse");
			symbol_291.setType(symbol_39);
			symbol_291.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_39.getOwnedOperations().add(symbol_291);
		}
		symbol_12.getOwnedTypes().add(symbol_39);
		//
		// lib::oclM1::OrderedSet
		//
		symbol_43.setName("OrderedSet");
		symbol_46.setName("T");
		symbol_45.setOwnedParameteredElement(symbol_46);
		symbol_44.getOwnedParameters().add(symbol_45);
		
		symbol_43.setOwnedTemplateSignature(symbol_44);
		symbol_43.getSuperClasses().add(symbol_63);
		symbol_43.getSuperClasses().add(symbol_39);
		{	// lib::oclM1::OrderedSet::-() oclM1.OrderedSet{T}.-(oclM1.Set{T})
			Operation symbol_292 = PivotFactory.eINSTANCE.createOperation();
			symbol_292.setName("-");
			symbol_292.setType(symbol_43);
			Parameter symbol_293 = PivotFactory.eINSTANCE.createParameter();
			symbol_293.setName("s");
			symbol_293.setType(symbol_52);
			symbol_292.getOwnedParameters().add(symbol_293);
			symbol_292.setPrecedence(symbol_8);
			symbol_292.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_292);
		}
		{	// lib::oclM1::OrderedSet::<>() oclM1.OrderedSet{T}.<>(oclM1.OrderedSet{T})
			Operation symbol_294 = PivotFactory.eINSTANCE.createOperation();
			symbol_294.setName("<>");
			symbol_294.setType(symbol_17);
			Parameter symbol_295 = PivotFactory.eINSTANCE.createParameter();
			symbol_295.setName("o");
			symbol_295.setType(symbol_43);
			symbol_294.getOwnedParameters().add(symbol_295);
			symbol_294.setPrecedence(symbol_5);
			symbol_294.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEqualOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_294);
		}
		{	// lib::oclM1::OrderedSet::=() oclM1.OrderedSet{T}.=(oclM1.OrderedSet{T})
			Operation symbol_296 = PivotFactory.eINSTANCE.createOperation();
			symbol_296.setName("=");
			symbol_296.setType(symbol_17);
			Parameter symbol_297 = PivotFactory.eINSTANCE.createParameter();
			symbol_297.setName("o");
			symbol_297.setType(symbol_43);
			symbol_296.getOwnedParameters().add(symbol_297);
			symbol_296.setPrecedence(symbol_5);
			symbol_296.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionEqualOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_296);
		}
		{	// lib::oclM1::OrderedSet::append() oclM1.OrderedSet{T}.append(oclM1.OrderedSet{T}.T)
			Operation symbol_298 = PivotFactory.eINSTANCE.createOperation();
			symbol_298.setName("append");
			symbol_298.setType(symbol_43);
			Parameter symbol_299 = PivotFactory.eINSTANCE.createParameter();
			symbol_299.setName("object");
			symbol_299.setType(symbol_46);
			symbol_298.getOwnedParameters().add(symbol_299);
			symbol_298.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_298);
		}
		{	// lib::oclM1::OrderedSet::excluding() oclM1.OrderedSet{T}.excluding(oclM1.OclAny)
			Operation symbol_300 = PivotFactory.eINSTANCE.createOperation();
			symbol_300.setName("excluding");
			symbol_300.setType(symbol_43);
			Parameter symbol_301 = PivotFactory.eINSTANCE.createParameter();
			symbol_301.setName("object");
			symbol_301.setType(symbol_33);
			symbol_300.getOwnedParameters().add(symbol_301);
			symbol_300.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_300);
		}
		{	// lib::oclM1::OrderedSet::including() oclM1.OrderedSet{T}.including(oclM1.OrderedSet{T}.T)
			Operation symbol_302 = PivotFactory.eINSTANCE.createOperation();
			symbol_302.setName("including");
			symbol_302.setType(symbol_43);
			Parameter symbol_303 = PivotFactory.eINSTANCE.createParameter();
			symbol_303.setName("object");
			symbol_303.setType(symbol_46);
			symbol_302.getOwnedParameters().add(symbol_303);
			symbol_302.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_302);
		}
		{	// lib::oclM1::OrderedSet::insertAt() oclM1.OrderedSet{T}.insertAt(oclM1.Integer,oclM1.OrderedSet{T}.T)
			Operation symbol_304 = PivotFactory.eINSTANCE.createOperation();
			symbol_304.setName("insertAt");
			symbol_304.setType(symbol_43);
			Parameter symbol_305 = PivotFactory.eINSTANCE.createParameter();
			symbol_305.setName("index");
			symbol_305.setType(symbol_24);
			symbol_304.getOwnedParameters().add(symbol_305);
			Parameter symbol_306 = PivotFactory.eINSTANCE.createParameter();
			symbol_306.setName("object");
			symbol_306.setType(symbol_46);
			symbol_304.getOwnedParameters().add(symbol_306);
			symbol_304.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_304);
		}
		{	// lib::oclM1::OrderedSet::intersection() oclM1.OrderedSet{T}.intersection(oclM1.Set{T})
			Operation symbol_307 = PivotFactory.eINSTANCE.createOperation();
			symbol_307.setName("intersection");
			symbol_307.setType(symbol_43);
			Parameter symbol_308 = PivotFactory.eINSTANCE.createParameter();
			symbol_308.setName("o");
			symbol_308.setType(symbol_52);
			symbol_307.getOwnedParameters().add(symbol_308);
			symbol_307.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_307);
		}
		{	// lib::oclM1::OrderedSet::prepend() oclM1.OrderedSet{T}.prepend(oclM1.OrderedSet{T}.T)
			Operation symbol_309 = PivotFactory.eINSTANCE.createOperation();
			symbol_309.setName("prepend");
			symbol_309.setType(symbol_43);
			Parameter symbol_310 = PivotFactory.eINSTANCE.createParameter();
			symbol_310.setName("object");
			symbol_310.setType(symbol_46);
			symbol_309.getOwnedParameters().add(symbol_310);
			symbol_309.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_309);
		}
		{	// lib::oclM1::OrderedSet::reject() oclM1.OrderedSet{T}.reject(oclM1.OrderedSet{T}.T)
			Iterator symbol_311 = PivotFactory.eINSTANCE.createIterator();
			symbol_311.setName("reject");
			symbol_311.setType(symbol_43);
			Parameter symbol_312 = PivotFactory.eINSTANCE.createParameter();
			symbol_312.setName("i");
			symbol_312.setType(symbol_46);
			symbol_311.getOwnedIterators().add(symbol_312);
			symbol_311.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_311);
		}
		{	// lib::oclM1::OrderedSet::reverse() oclM1.OrderedSet{T}.reverse()
			Operation symbol_313 = PivotFactory.eINSTANCE.createOperation();
			symbol_313.setName("reverse");
			symbol_313.setType(symbol_43);
			symbol_313.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_313);
		}
		{	// lib::oclM1::OrderedSet::select() oclM1.OrderedSet{T}.select(oclM1.OrderedSet{T}.T)
			Iterator symbol_314 = PivotFactory.eINSTANCE.createIterator();
			symbol_314.setName("select");
			symbol_314.setType(symbol_43);
			Parameter symbol_315 = PivotFactory.eINSTANCE.createParameter();
			symbol_315.setName("i");
			symbol_315.setType(symbol_46);
			symbol_314.getOwnedIterators().add(symbol_315);
			symbol_314.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_314);
		}
		{	// lib::oclM1::OrderedSet::subOrderedSet() oclM1.OrderedSet{T}.subOrderedSet(oclM1.Integer,oclM1.Integer)
			Operation symbol_316 = PivotFactory.eINSTANCE.createOperation();
			symbol_316.setName("subOrderedSet");
			symbol_316.setType(symbol_43);
			Parameter symbol_317 = PivotFactory.eINSTANCE.createParameter();
			symbol_317.setName("lower");
			symbol_317.setType(symbol_24);
			symbol_316.getOwnedParameters().add(symbol_317);
			Parameter symbol_318 = PivotFactory.eINSTANCE.createParameter();
			symbol_318.setName("upper");
			symbol_318.setType(symbol_24);
			symbol_316.getOwnedParameters().add(symbol_318);
			symbol_316.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_316);
		}
		{	// lib::oclM1::OrderedSet::symmetricDifference() oclM1.OrderedSet{T}.symmetricDifference(oclM1.Set{T})
			Operation symbol_319 = PivotFactory.eINSTANCE.createOperation();
			symbol_319.setName("symmetricDifference");
			symbol_319.setType(symbol_43);
			Parameter symbol_320 = PivotFactory.eINSTANCE.createParameter();
			symbol_320.setName("s");
			symbol_320.setType(symbol_52);
			symbol_319.getOwnedParameters().add(symbol_320);
			symbol_319.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_319);
		}
		{	// lib::oclM1::OrderedSet::union() oclM1.OrderedSet{T}.union(oclM1.OrderedSet{T})
			Operation symbol_321 = PivotFactory.eINSTANCE.createOperation();
			symbol_321.setName("union");
			symbol_321.setType(symbol_43);
			Parameter symbol_322 = PivotFactory.eINSTANCE.createParameter();
			symbol_322.setName("o");
			symbol_322.setType(symbol_43);
			symbol_321.getOwnedParameters().add(symbol_322);
			symbol_321.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_321);
		}
		{	// lib::oclM1::OrderedSet::union() oclM1.OrderedSet{T}.union(oclM1.Set{T})
			Operation symbol_323 = PivotFactory.eINSTANCE.createOperation();
			symbol_323.setName("union");
			symbol_323.setType(symbol_52);
			Parameter symbol_324 = PivotFactory.eINSTANCE.createParameter();
			symbol_324.setName("s");
			symbol_324.setType(symbol_52);
			symbol_323.getOwnedParameters().add(symbol_324);
			symbol_323.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_43.getOwnedOperations().add(symbol_323);
		}
		symbol_12.getOwnedTypes().add(symbol_43);
		//
		// lib::oclM1::Real
		//
		symbol_47.setName("Real");
		symbol_47.getSuperClasses().add(symbol_33);
		{	// lib::oclM1::Real::*() oclM1.Real.*(oclM1.Real)
			Operation symbol_325 = PivotFactory.eINSTANCE.createOperation();
			symbol_325.setName("*");
			symbol_325.setType(symbol_47);
			Parameter symbol_326 = PivotFactory.eINSTANCE.createParameter();
			symbol_326.setName("r");
			symbol_326.setType(symbol_47);
			symbol_325.getOwnedParameters().add(symbol_326);
			symbol_325.setPrecedence(symbol_6);
			symbol_325.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_325);
		}
		{	// lib::oclM1::Real::+() oclM1.Real.+(oclM1.Real)
			Operation symbol_327 = PivotFactory.eINSTANCE.createOperation();
			symbol_327.setName("+");
			symbol_327.setType(symbol_47);
			Parameter symbol_328 = PivotFactory.eINSTANCE.createParameter();
			symbol_328.setName("r");
			symbol_328.setType(symbol_47);
			symbol_327.getOwnedParameters().add(symbol_328);
			symbol_327.setPrecedence(symbol_8);
			symbol_327.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericPlusOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_327);
		}
		{	// lib::oclM1::Real::-() oclM1.Real.-(oclM1.Real)
			Operation symbol_329 = PivotFactory.eINSTANCE.createOperation();
			symbol_329.setName("-");
			symbol_329.setType(symbol_47);
			Parameter symbol_330 = PivotFactory.eINSTANCE.createParameter();
			symbol_330.setName("r");
			symbol_330.setType(symbol_47);
			symbol_329.getOwnedParameters().add(symbol_330);
			symbol_329.setPrecedence(symbol_8);
			symbol_329.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinusOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_329);
		}
		{	// lib::oclM1::Real::-() oclM1.Real.-()
			Operation symbol_331 = PivotFactory.eINSTANCE.createOperation();
			symbol_331.setName("-");
			symbol_331.setType(symbol_47);
			symbol_331.setPrecedence(symbol_9);
			symbol_331.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_331);
		}
		{	// lib::oclM1::Real::/() oclM1.Real./(oclM1.Real)
			Operation symbol_332 = PivotFactory.eINSTANCE.createOperation();
			symbol_332.setName("/");
			symbol_332.setType(symbol_47);
			Parameter symbol_333 = PivotFactory.eINSTANCE.createParameter();
			symbol_333.setName("r");
			symbol_333.setType(symbol_47);
			symbol_332.getOwnedParameters().add(symbol_333);
			symbol_332.setPrecedence(symbol_6);
			symbol_332.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_332);
		}
		{	// lib::oclM1::Real::<() oclM1.Real.<(oclM1.Real)
			Operation symbol_334 = PivotFactory.eINSTANCE.createOperation();
			symbol_334.setName("<");
			symbol_334.setType(symbol_17);
			Parameter symbol_335 = PivotFactory.eINSTANCE.createParameter();
			symbol_335.setName("r");
			symbol_335.setType(symbol_47);
			symbol_334.getOwnedParameters().add(symbol_335);
			symbol_334.setPrecedence(symbol_10);
			symbol_334.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_334);
		}
		{	// lib::oclM1::Real::<=() oclM1.Real.<=(oclM1.Real)
			Operation symbol_336 = PivotFactory.eINSTANCE.createOperation();
			symbol_336.setName("<=");
			symbol_336.setType(symbol_17);
			Parameter symbol_337 = PivotFactory.eINSTANCE.createParameter();
			symbol_337.setName("r");
			symbol_337.setType(symbol_47);
			symbol_336.getOwnedParameters().add(symbol_337);
			symbol_336.setPrecedence(symbol_10);
			symbol_336.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_336);
		}
		{	// lib::oclM1::Real::<>() oclM1.Real.<>(oclM1.Real)
			Operation symbol_338 = PivotFactory.eINSTANCE.createOperation();
			symbol_338.setName("<>");
			symbol_338.setType(symbol_17);
			Parameter symbol_339 = PivotFactory.eINSTANCE.createParameter();
			symbol_339.setName("object2");
			symbol_339.setType(symbol_47);
			symbol_338.getOwnedParameters().add(symbol_339);
			symbol_338.setPrecedence(symbol_5);
			symbol_338.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNotEqualOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_338);
		}
		{	// lib::oclM1::Real::=() oclM1.Real.=(oclM1.Real)
			Operation symbol_340 = PivotFactory.eINSTANCE.createOperation();
			symbol_340.setName("=");
			symbol_340.setType(symbol_17);
			Parameter symbol_341 = PivotFactory.eINSTANCE.createParameter();
			symbol_341.setName("object2");
			symbol_341.setType(symbol_47);
			symbol_340.getOwnedParameters().add(symbol_341);
			symbol_340.setPrecedence(symbol_5);
			symbol_340.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericEqualOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_340);
		}
		{	// lib::oclM1::Real::>() oclM1.Real.>(oclM1.Real)
			Operation symbol_342 = PivotFactory.eINSTANCE.createOperation();
			symbol_342.setName(">");
			symbol_342.setType(symbol_17);
			Parameter symbol_343 = PivotFactory.eINSTANCE.createParameter();
			symbol_343.setName("r");
			symbol_343.setType(symbol_47);
			symbol_342.getOwnedParameters().add(symbol_343);
			symbol_342.setPrecedence(symbol_10);
			symbol_342.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_342);
		}
		{	// lib::oclM1::Real::>=() oclM1.Real.>=(oclM1.Real)
			Operation symbol_344 = PivotFactory.eINSTANCE.createOperation();
			symbol_344.setName(">=");
			symbol_344.setType(symbol_17);
			Parameter symbol_345 = PivotFactory.eINSTANCE.createParameter();
			symbol_345.setName("r");
			symbol_345.setType(symbol_47);
			symbol_344.getOwnedParameters().add(symbol_345);
			symbol_344.setPrecedence(symbol_10);
			symbol_344.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_344);
		}
		{	// lib::oclM1::Real::abs() oclM1.Real.abs()
			Operation symbol_346 = PivotFactory.eINSTANCE.createOperation();
			symbol_346.setName("abs");
			symbol_346.setType(symbol_47);
			symbol_346.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_346);
		}
		{	// lib::oclM1::Real::floor() oclM1.Real.floor()
			Operation symbol_347 = PivotFactory.eINSTANCE.createOperation();
			symbol_347.setName("floor");
			symbol_347.setType(symbol_24);
			symbol_347.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_347);
		}
		{	// lib::oclM1::Real::max() oclM1.Real.max(oclM1.Real)
			Operation symbol_348 = PivotFactory.eINSTANCE.createOperation();
			symbol_348.setName("max");
			symbol_348.setType(symbol_47);
			Parameter symbol_349 = PivotFactory.eINSTANCE.createParameter();
			symbol_349.setName("r");
			symbol_349.setType(symbol_47);
			symbol_348.getOwnedParameters().add(symbol_349);
			symbol_348.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_348);
		}
		{	// lib::oclM1::Real::min() oclM1.Real.min(oclM1.Real)
			Operation symbol_350 = PivotFactory.eINSTANCE.createOperation();
			symbol_350.setName("min");
			symbol_350.setType(symbol_47);
			Parameter symbol_351 = PivotFactory.eINSTANCE.createParameter();
			symbol_351.setName("r");
			symbol_351.setType(symbol_47);
			symbol_350.getOwnedParameters().add(symbol_351);
			symbol_350.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_350);
		}
		{	// lib::oclM1::Real::oclAsType() oclM1.Real.oclAsType{T}(oclM2.Class{T})
			Operation symbol_352 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_353 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Real.oclAsType{T}(oclM2.Class{T}).
			TypeTemplateParameter symbol_354 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_355 = PivotFactory.eINSTANCE.createClass(); // oclM1.Real.oclAsType{T}(oclM2.Class{T}).T
			
			symbol_355.setName("T");
			symbol_354.setOwnedParameteredElement(symbol_355);
			symbol_353.getOwnedParameters().add(symbol_354);
			
			symbol_352.setOwnedTemplateSignature(symbol_353);
			symbol_352.setName("oclAsType");
			symbol_352.setType(symbol_355);
			Parameter symbol_356 = PivotFactory.eINSTANCE.createParameter();
			symbol_356.setName("type");
			symbol_356.setType(symbol_69);
			symbol_352.getOwnedParameters().add(symbol_356);
			symbol_352.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericOclAsTypeOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_352);
		}
		{	// lib::oclM1::Real::round() oclM1.Real.round()
			Operation symbol_357 = PivotFactory.eINSTANCE.createOperation();
			symbol_357.setName("round");
			symbol_357.setType(symbol_24);
			symbol_357.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_357);
		}
		{	// lib::oclM1::Real::toString() oclM1.Real.toString()
			Operation symbol_358 = PivotFactory.eINSTANCE.createOperation();
			symbol_358.setName("toString");
			symbol_358.setType(symbol_56);
			symbol_358.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_47.getOwnedOperations().add(symbol_358);
		}
		symbol_12.getOwnedTypes().add(symbol_47);
		//
		// lib::oclM1::Sequence
		//
		symbol_48.setName("Sequence");
		symbol_51.setName("T");
		symbol_50.setOwnedParameteredElement(symbol_51);
		symbol_49.getOwnedParameters().add(symbol_50);
		
		symbol_48.setOwnedTemplateSignature(symbol_49);
		symbol_48.getSuperClasses().add(symbol_29);
		symbol_48.getSuperClasses().add(symbol_39);
		{	// lib::oclM1::Sequence::<>() oclM1.Sequence{T}.<>(oclM1.Sequence{T})
			Operation symbol_359 = PivotFactory.eINSTANCE.createOperation();
			symbol_359.setName("<>");
			symbol_359.setType(symbol_17);
			Parameter symbol_360 = PivotFactory.eINSTANCE.createParameter();
			symbol_360.setName("s");
			symbol_360.setType(symbol_48);
			symbol_359.getOwnedParameters().add(symbol_360);
			symbol_359.setPrecedence(symbol_5);
			symbol_359.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEqualOperation.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_359);
		}
		{	// lib::oclM1::Sequence::=() oclM1.Sequence{T}.=(oclM1.Sequence{T})
			Operation symbol_361 = PivotFactory.eINSTANCE.createOperation();
			symbol_361.setName("=");
			symbol_361.setType(symbol_17);
			Parameter symbol_362 = PivotFactory.eINSTANCE.createParameter();
			symbol_362.setName("s");
			symbol_362.setType(symbol_48);
			symbol_361.getOwnedParameters().add(symbol_362);
			symbol_361.setPrecedence(symbol_5);
			symbol_361.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionEqualOperation.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_361);
		}
		{	// lib::oclM1::Sequence::append() oclM1.Sequence{T}.append(oclM1.Sequence{T}.T)
			Operation symbol_363 = PivotFactory.eINSTANCE.createOperation();
			symbol_363.setName("append");
			symbol_363.setType(symbol_48);
			Parameter symbol_364 = PivotFactory.eINSTANCE.createParameter();
			symbol_364.setName("object");
			symbol_364.setType(symbol_51);
			symbol_363.getOwnedParameters().add(symbol_364);
			symbol_363.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_363);
		}
		{	// lib::oclM1::Sequence::excluding() oclM1.Sequence{T}.excluding(oclM1.OclAny)
			Operation symbol_365 = PivotFactory.eINSTANCE.createOperation();
			symbol_365.setName("excluding");
			symbol_365.setType(symbol_48);
			Parameter symbol_366 = PivotFactory.eINSTANCE.createParameter();
			symbol_366.setName("object");
			symbol_366.setType(symbol_33);
			symbol_365.getOwnedParameters().add(symbol_366);
			symbol_365.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_365);
		}
		{	// lib::oclM1::Sequence::flatten() oclM1.Sequence{T}.flatten{T2}()
			Operation symbol_367 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_368 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Sequence{T}.flatten{T2}().
			TypeTemplateParameter symbol_369 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_370 = PivotFactory.eINSTANCE.createClass(); // oclM1.Sequence{T}.flatten{T2}().T2
			
			symbol_370.setName("T2");
			symbol_369.setOwnedParameteredElement(symbol_370);
			symbol_368.getOwnedParameters().add(symbol_369);
			
			symbol_367.setOwnedTemplateSignature(symbol_368);
			symbol_367.setName("flatten");
			symbol_367.setType(symbol_48);
			symbol_367.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_367);
		}
		{	// lib::oclM1::Sequence::including() oclM1.Sequence{T}.including(oclM1.Sequence{T}.T)
			Operation symbol_371 = PivotFactory.eINSTANCE.createOperation();
			symbol_371.setName("including");
			symbol_371.setType(symbol_48);
			Parameter symbol_372 = PivotFactory.eINSTANCE.createParameter();
			symbol_372.setName("object");
			symbol_372.setType(symbol_51);
			symbol_371.getOwnedParameters().add(symbol_372);
			symbol_371.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_371);
		}
		{	// lib::oclM1::Sequence::insertAt() oclM1.Sequence{T}.insertAt(oclM1.Integer,oclM1.Sequence{T}.T)
			Operation symbol_373 = PivotFactory.eINSTANCE.createOperation();
			symbol_373.setName("insertAt");
			symbol_373.setType(symbol_48);
			Parameter symbol_374 = PivotFactory.eINSTANCE.createParameter();
			symbol_374.setName("index");
			symbol_374.setType(symbol_24);
			symbol_373.getOwnedParameters().add(symbol_374);
			Parameter symbol_375 = PivotFactory.eINSTANCE.createParameter();
			symbol_375.setName("object");
			symbol_375.setType(symbol_51);
			symbol_373.getOwnedParameters().add(symbol_375);
			symbol_373.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_373);
		}
		{	// lib::oclM1::Sequence::prepend() oclM1.Sequence{T}.prepend(oclM1.Sequence{T}.T)
			Operation symbol_376 = PivotFactory.eINSTANCE.createOperation();
			symbol_376.setName("prepend");
			symbol_376.setType(symbol_48);
			Parameter symbol_377 = PivotFactory.eINSTANCE.createParameter();
			symbol_377.setName("object");
			symbol_377.setType(symbol_51);
			symbol_376.getOwnedParameters().add(symbol_377);
			symbol_376.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_376);
		}
		{	// lib::oclM1::Sequence::reject() oclM1.Sequence{T}.reject(oclM1.Sequence{T}.T)
			Iterator symbol_378 = PivotFactory.eINSTANCE.createIterator();
			symbol_378.setName("reject");
			symbol_378.setType(symbol_48);
			Parameter symbol_379 = PivotFactory.eINSTANCE.createParameter();
			symbol_379.setName("i");
			symbol_379.setType(symbol_51);
			symbol_378.getOwnedIterators().add(symbol_379);
			symbol_378.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_378);
		}
		{	// lib::oclM1::Sequence::reverse() oclM1.Sequence{T}.reverse()
			Operation symbol_380 = PivotFactory.eINSTANCE.createOperation();
			symbol_380.setName("reverse");
			symbol_380.setType(symbol_48);
			symbol_380.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_380);
		}
		{	// lib::oclM1::Sequence::select() oclM1.Sequence{T}.select(oclM1.Sequence{T}.T)
			Iterator symbol_381 = PivotFactory.eINSTANCE.createIterator();
			symbol_381.setName("select");
			symbol_381.setType(symbol_48);
			Parameter symbol_382 = PivotFactory.eINSTANCE.createParameter();
			symbol_382.setName("i");
			symbol_382.setType(symbol_51);
			symbol_381.getOwnedIterators().add(symbol_382);
			symbol_381.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_381);
		}
		{	// lib::oclM1::Sequence::subSequence() oclM1.Sequence{T}.subSequence(oclM1.Integer,oclM1.Integer)
			Operation symbol_383 = PivotFactory.eINSTANCE.createOperation();
			symbol_383.setName("subSequence");
			symbol_383.setType(symbol_48);
			Parameter symbol_384 = PivotFactory.eINSTANCE.createParameter();
			symbol_384.setName("lower");
			symbol_384.setType(symbol_24);
			symbol_383.getOwnedParameters().add(symbol_384);
			Parameter symbol_385 = PivotFactory.eINSTANCE.createParameter();
			symbol_385.setName("upper");
			symbol_385.setType(symbol_24);
			symbol_383.getOwnedParameters().add(symbol_385);
			symbol_383.setImplementation(org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_383);
		}
		{	// lib::oclM1::Sequence::union() oclM1.Sequence{T}.union(oclM1.Sequence{T})
			Operation symbol_386 = PivotFactory.eINSTANCE.createOperation();
			symbol_386.setName("union");
			symbol_386.setType(symbol_48);
			Parameter symbol_387 = PivotFactory.eINSTANCE.createParameter();
			symbol_387.setName("s");
			symbol_387.setType(symbol_48);
			symbol_386.getOwnedParameters().add(symbol_387);
			symbol_386.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_48.getOwnedOperations().add(symbol_386);
		}
		symbol_12.getOwnedTypes().add(symbol_48);
		//
		// lib::oclM1::Set
		//
		symbol_52.setName("Set");
		symbol_55.setName("T");
		symbol_54.setOwnedParameteredElement(symbol_55);
		symbol_53.getOwnedParameters().add(symbol_54);
		
		symbol_52.setOwnedTemplateSignature(symbol_53);
		symbol_52.getSuperClasses().add(symbol_63);
		symbol_52.getSuperClasses().add(symbol_25);
		{	// lib::oclM1::Set::-() oclM1.Set{T}.-(oclM1.Set{T})
			Operation symbol_388 = PivotFactory.eINSTANCE.createOperation();
			symbol_388.setName("-");
			symbol_388.setType(symbol_52);
			Parameter symbol_389 = PivotFactory.eINSTANCE.createParameter();
			symbol_389.setName("s");
			symbol_389.setType(symbol_52);
			symbol_388.getOwnedParameters().add(symbol_389);
			symbol_388.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_52.getOwnedOperations().add(symbol_388);
		}
		{	// lib::oclM1::Set::<>() oclM1.Set{T}.<>(oclM1.Set{T})
			Operation symbol_390 = PivotFactory.eINSTANCE.createOperation();
			symbol_390.setName("<>");
			symbol_390.setType(symbol_17);
			Parameter symbol_391 = PivotFactory.eINSTANCE.createParameter();
			symbol_391.setName("s");
			symbol_391.setType(symbol_52);
			symbol_390.getOwnedParameters().add(symbol_391);
			symbol_390.setPrecedence(symbol_5);
			symbol_390.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEqualOperation.INSTANCE);
			symbol_52.getOwnedOperations().add(symbol_390);
		}
		{	// lib::oclM1::Set::=() oclM1.Set{T}.=(oclM1.Set{T})
			Operation symbol_392 = PivotFactory.eINSTANCE.createOperation();
			symbol_392.setName("=");
			symbol_392.setType(symbol_17);
			Parameter symbol_393 = PivotFactory.eINSTANCE.createParameter();
			symbol_393.setName("s");
			symbol_393.setType(symbol_52);
			symbol_392.getOwnedParameters().add(symbol_393);
			symbol_392.setPrecedence(symbol_5);
			symbol_392.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionEqualOperation.INSTANCE);
			symbol_52.getOwnedOperations().add(symbol_392);
		}
		{	// lib::oclM1::Set::excluding() oclM1.Set{T}.excluding(oclM1.OclAny)
			Operation symbol_394 = PivotFactory.eINSTANCE.createOperation();
			symbol_394.setName("excluding");
			symbol_394.setType(symbol_52);
			Parameter symbol_395 = PivotFactory.eINSTANCE.createParameter();
			symbol_395.setName("object");
			symbol_395.setType(symbol_33);
			symbol_394.getOwnedParameters().add(symbol_395);
			symbol_394.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_52.getOwnedOperations().add(symbol_394);
		}
		{	// lib::oclM1::Set::flatten() oclM1.Set{T}.flatten{T2}()
			Operation symbol_396 = PivotFactory.eINSTANCE.createOperation();
			TemplateSignature symbol_397 = PivotFactory.eINSTANCE.createTemplateSignature(); // oclM1.Set{T}.flatten{T2}().
			TypeTemplateParameter symbol_398 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			Class symbol_399 = PivotFactory.eINSTANCE.createClass(); // oclM1.Set{T}.flatten{T2}().T2
			
			symbol_399.setName("T2");
			symbol_398.setOwnedParameteredElement(symbol_399);
			symbol_397.getOwnedParameters().add(symbol_398);
			
			symbol_396.setOwnedTemplateSignature(symbol_397);
			symbol_396.setName("flatten");
			symbol_396.setType(symbol_52);
			symbol_396.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_52.getOwnedOperations().add(symbol_396);
		}
		{	// lib::oclM1::Set::including() oclM1.Set{T}.including(oclM1.Set{T}.T)
			Operation symbol_400 = PivotFactory.eINSTANCE.createOperation();
			symbol_400.setName("including");
			symbol_400.setType(symbol_52);
			Parameter symbol_401 = PivotFactory.eINSTANCE.createParameter();
			symbol_401.setName("object");
			symbol_401.setType(symbol_55);
			symbol_400.getOwnedParameters().add(symbol_401);
			symbol_400.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_52.getOwnedOperations().add(symbol_400);
		}
		{	// lib::oclM1::Set::intersection() oclM1.Set{T}.intersection(oclM1.Set{T})
			Operation symbol_402 = PivotFactory.eINSTANCE.createOperation();
			symbol_402.setName("intersection");
			symbol_402.setType(symbol_52);
			Parameter symbol_403 = PivotFactory.eINSTANCE.createParameter();
			symbol_403.setName("s");
			symbol_403.setType(symbol_52);
			symbol_402.getOwnedParameters().add(symbol_403);
			symbol_402.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_52.getOwnedOperations().add(symbol_402);
		}
		{	// lib::oclM1::Set::reject() oclM1.Set{T}.reject(oclM1.Set{T}.T)
			Iterator symbol_404 = PivotFactory.eINSTANCE.createIterator();
			symbol_404.setName("reject");
			symbol_404.setType(symbol_52);
			Parameter symbol_405 = PivotFactory.eINSTANCE.createParameter();
			symbol_405.setName("i");
			symbol_405.setType(symbol_55);
			symbol_404.getOwnedIterators().add(symbol_405);
			symbol_404.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_52.getOwnedOperations().add(symbol_404);
		}
		{	// lib::oclM1::Set::select() oclM1.Set{T}.select(oclM1.Set{T}.T)
			Iterator symbol_406 = PivotFactory.eINSTANCE.createIterator();
			symbol_406.setName("select");
			symbol_406.setType(symbol_52);
			Parameter symbol_407 = PivotFactory.eINSTANCE.createParameter();
			symbol_407.setName("i");
			symbol_407.setType(symbol_55);
			symbol_406.getOwnedIterators().add(symbol_407);
			symbol_406.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_52.getOwnedOperations().add(symbol_406);
		}
		{	// lib::oclM1::Set::symmetricDifference() oclM1.Set{T}.symmetricDifference(oclM1.Set{T})
			Operation symbol_408 = PivotFactory.eINSTANCE.createOperation();
			symbol_408.setName("symmetricDifference");
			symbol_408.setType(symbol_52);
			Parameter symbol_409 = PivotFactory.eINSTANCE.createParameter();
			symbol_409.setName("s");
			symbol_409.setType(symbol_52);
			symbol_408.getOwnedParameters().add(symbol_409);
			symbol_408.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_52.getOwnedOperations().add(symbol_408);
		}
		symbol_12.getOwnedTypes().add(symbol_52);
		//
		// lib::oclM1::String
		//
		symbol_56.setName("String");
		symbol_56.getSuperClasses().add(symbol_33);
		{	// lib::oclM1::String::+() oclM1.String.+(oclM1.String)
			Operation symbol_410 = PivotFactory.eINSTANCE.createOperation();
			symbol_410.setName("+");
			symbol_410.setType(symbol_56);
			Parameter symbol_411 = PivotFactory.eINSTANCE.createParameter();
			symbol_411.setName("s");
			symbol_411.setType(symbol_56);
			symbol_410.getOwnedParameters().add(symbol_411);
			symbol_410.setPrecedence(symbol_8);
			symbol_410.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_410);
		}
		{	// lib::oclM1::String::<() oclM1.String.<(oclM1.String)
			Operation symbol_412 = PivotFactory.eINSTANCE.createOperation();
			symbol_412.setName("<");
			symbol_412.setType(symbol_17);
			Parameter symbol_413 = PivotFactory.eINSTANCE.createParameter();
			symbol_413.setName("s");
			symbol_413.setType(symbol_56);
			symbol_412.getOwnedParameters().add(symbol_413);
			symbol_412.setPrecedence(symbol_10);
			symbol_412.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_412);
		}
		{	// lib::oclM1::String::<=() oclM1.String.<=(oclM1.String)
			Operation symbol_414 = PivotFactory.eINSTANCE.createOperation();
			symbol_414.setName("<=");
			symbol_414.setType(symbol_17);
			Parameter symbol_415 = PivotFactory.eINSTANCE.createParameter();
			symbol_415.setName("s");
			symbol_415.setType(symbol_56);
			symbol_414.getOwnedParameters().add(symbol_415);
			symbol_414.setPrecedence(symbol_10);
			symbol_414.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_414);
		}
		{	// lib::oclM1::String::<>() oclM1.String.<>(oclM1.String)
			Operation symbol_416 = PivotFactory.eINSTANCE.createOperation();
			symbol_416.setName("<>");
			symbol_416.setType(symbol_17);
			Parameter symbol_417 = PivotFactory.eINSTANCE.createParameter();
			symbol_417.setName("object2");
			symbol_417.setType(symbol_56);
			symbol_416.getOwnedParameters().add(symbol_417);
			symbol_416.setPrecedence(symbol_5);
			symbol_416.setImplementation(org.eclipse.ocl.examples.library.string.StringNotEqualOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_416);
		}
		{	// lib::oclM1::String::=() oclM1.String.=(oclM1.String)
			Operation symbol_418 = PivotFactory.eINSTANCE.createOperation();
			symbol_418.setName("=");
			symbol_418.setType(symbol_17);
			Parameter symbol_419 = PivotFactory.eINSTANCE.createParameter();
			symbol_419.setName("object2");
			symbol_419.setType(symbol_56);
			symbol_418.getOwnedParameters().add(symbol_419);
			symbol_418.setPrecedence(symbol_5);
			symbol_418.setImplementation(org.eclipse.ocl.examples.library.string.StringEqualOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_418);
		}
		{	// lib::oclM1::String::>() oclM1.String.>(oclM1.String)
			Operation symbol_420 = PivotFactory.eINSTANCE.createOperation();
			symbol_420.setName(">");
			symbol_420.setType(symbol_17);
			Parameter symbol_421 = PivotFactory.eINSTANCE.createParameter();
			symbol_421.setName("s");
			symbol_421.setType(symbol_56);
			symbol_420.getOwnedParameters().add(symbol_421);
			symbol_420.setPrecedence(symbol_10);
			symbol_420.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_420);
		}
		{	// lib::oclM1::String::>=() oclM1.String.>=(oclM1.String)
			Operation symbol_422 = PivotFactory.eINSTANCE.createOperation();
			symbol_422.setName(">=");
			symbol_422.setType(symbol_17);
			Parameter symbol_423 = PivotFactory.eINSTANCE.createParameter();
			symbol_423.setName("s");
			symbol_423.setType(symbol_56);
			symbol_422.getOwnedParameters().add(symbol_423);
			symbol_422.setPrecedence(symbol_10);
			symbol_422.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_422);
		}
		{	// lib::oclM1::String::at() oclM1.String.at(oclM1.Integer)
			Operation symbol_424 = PivotFactory.eINSTANCE.createOperation();
			symbol_424.setName("at");
			symbol_424.setType(symbol_56);
			Parameter symbol_425 = PivotFactory.eINSTANCE.createParameter();
			symbol_425.setName("i");
			symbol_425.setType(symbol_24);
			symbol_424.getOwnedParameters().add(symbol_425);
			symbol_424.setImplementation(org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_424);
		}
		{	// lib::oclM1::String::characters() oclM1.String.characters()
			Operation symbol_426 = PivotFactory.eINSTANCE.createOperation();
			symbol_426.setName("characters");
			symbol_426.setType(symbol_48);
			symbol_426.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_426);
		}
		{	// lib::oclM1::String::concat() oclM1.String.concat(oclM1.String)
			Operation symbol_427 = PivotFactory.eINSTANCE.createOperation();
			symbol_427.setName("concat");
			symbol_427.setType(symbol_56);
			Parameter symbol_428 = PivotFactory.eINSTANCE.createParameter();
			symbol_428.setName("s");
			symbol_428.setType(symbol_56);
			symbol_427.getOwnedParameters().add(symbol_428);
			symbol_427.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_427);
		}
		{	// lib::oclM1::String::equalsIgnoreCase() oclM1.String.equalsIgnoreCase(oclM1.String)
			Operation symbol_429 = PivotFactory.eINSTANCE.createOperation();
			symbol_429.setName("equalsIgnoreCase");
			symbol_429.setType(symbol_17);
			Parameter symbol_430 = PivotFactory.eINSTANCE.createParameter();
			symbol_430.setName("s");
			symbol_430.setType(symbol_56);
			symbol_429.getOwnedParameters().add(symbol_430);
			symbol_429.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_429);
		}
		{	// lib::oclM1::String::indexOf() oclM1.String.indexOf(oclM1.String)
			Operation symbol_431 = PivotFactory.eINSTANCE.createOperation();
			symbol_431.setName("indexOf");
			symbol_431.setType(symbol_24);
			Parameter symbol_432 = PivotFactory.eINSTANCE.createParameter();
			symbol_432.setName("s");
			symbol_432.setType(symbol_56);
			symbol_431.getOwnedParameters().add(symbol_432);
			symbol_431.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_431);
		}
		{	// lib::oclM1::String::size() oclM1.String.size()
			Operation symbol_433 = PivotFactory.eINSTANCE.createOperation();
			symbol_433.setName("size");
			symbol_433.setType(symbol_24);
			symbol_433.setImplementation(org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_433);
		}
		{	// lib::oclM1::String::substring() oclM1.String.substring(oclM1.Integer,oclM1.Integer)
			Operation symbol_434 = PivotFactory.eINSTANCE.createOperation();
			symbol_434.setName("substring");
			symbol_434.setType(symbol_56);
			Parameter symbol_435 = PivotFactory.eINSTANCE.createParameter();
			symbol_435.setName("lower");
			symbol_435.setType(symbol_24);
			symbol_434.getOwnedParameters().add(symbol_435);
			Parameter symbol_436 = PivotFactory.eINSTANCE.createParameter();
			symbol_436.setName("upper");
			symbol_436.setType(symbol_24);
			symbol_434.getOwnedParameters().add(symbol_436);
			symbol_434.setImplementation(org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_434);
		}
		{	// lib::oclM1::String::toBoolean() oclM1.String.toBoolean()
			Operation symbol_437 = PivotFactory.eINSTANCE.createOperation();
			symbol_437.setName("toBoolean");
			symbol_437.setType(symbol_17);
			symbol_437.setImplementation(org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_437);
		}
		{	// lib::oclM1::String::toInteger() oclM1.String.toInteger()
			Operation symbol_438 = PivotFactory.eINSTANCE.createOperation();
			symbol_438.setName("toInteger");
			symbol_438.setType(symbol_24);
			symbol_438.setImplementation(org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_438);
		}
		{	// lib::oclM1::String::toLowerCase() oclM1.String.toLowerCase()
			Operation symbol_439 = PivotFactory.eINSTANCE.createOperation();
			symbol_439.setName("toLowerCase");
			symbol_439.setType(symbol_56);
			symbol_439.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_439);
		}
		{	// lib::oclM1::String::toReal() oclM1.String.toReal()
			Operation symbol_440 = PivotFactory.eINSTANCE.createOperation();
			symbol_440.setName("toReal");
			symbol_440.setType(symbol_47);
			symbol_440.setImplementation(org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_440);
		}
		{	// lib::oclM1::String::toUpperCase() oclM1.String.toUpperCase()
			Operation symbol_441 = PivotFactory.eINSTANCE.createOperation();
			symbol_441.setName("toUpperCase");
			symbol_441.setType(symbol_56);
			symbol_441.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			symbol_56.getOwnedOperations().add(symbol_441);
		}
		symbol_12.getOwnedTypes().add(symbol_56);
		//
		// lib::oclM1::Tuple
		//
		symbol_57.setName("Tuple");
		symbol_60.setName("T1");
		symbol_59.setOwnedParameteredElement(symbol_60);
		symbol_58.getOwnedParameters().add(symbol_59);
		symbol_62.setName("T2");
		symbol_61.setOwnedParameteredElement(symbol_62);
		symbol_58.getOwnedParameters().add(symbol_61);
		
		symbol_57.setOwnedTemplateSignature(symbol_58);
		symbol_57.getSuperClasses().add(symbol_37);
		{ // lib::oclM1::Tuple::first oclM1.Tuple{T1,T2}.first
			Property symbol_442 = PivotFactory.eINSTANCE.createProperty();
			symbol_442.setName("first");
			symbol_442.setType(symbol_60);
			symbol_442.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_57.getOwnedAttributes().add(symbol_442);
		}
		{ // lib::oclM1::Tuple::second oclM1.Tuple{T1,T2}.second
			Property symbol_443 = PivotFactory.eINSTANCE.createProperty();
			symbol_443.setName("second");
			symbol_443.setType(symbol_62);
			symbol_443.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_57.getOwnedAttributes().add(symbol_443);
		}
		symbol_12.getOwnedTypes().add(symbol_57);
		//
		// lib::oclM1::UniqueCollection
		//
		symbol_63.setName("UniqueCollection");
		symbol_66.setName("T");
		symbol_65.setOwnedParameteredElement(symbol_66);
		symbol_64.getOwnedParameters().add(symbol_65);
		
		symbol_63.setOwnedTemplateSignature(symbol_64);
		symbol_63.getSuperClasses().add(symbol_19);
		{	// lib::oclM1::UniqueCollection::sortedBy() oclM1.UniqueCollection{T}.sortedBy(oclM1.UniqueCollection{T}.T)
			Iterator symbol_444 = PivotFactory.eINSTANCE.createIterator();
			symbol_444.setName("sortedBy");
			symbol_444.setType(symbol_43);
			Parameter symbol_445 = PivotFactory.eINSTANCE.createParameter();
			symbol_445.setName("i");
			symbol_445.setType(symbol_66);
			symbol_444.getOwnedIterators().add(symbol_445);
			symbol_444.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_63.getOwnedOperations().add(symbol_444);
		}
		symbol_12.getOwnedTypes().add(symbol_63);
		//
		// lib::oclM1::UnlimitedNatural
		//
		symbol_67.setName("UnlimitedNatural");
		symbol_67.getSuperClasses().add(symbol_24);
		symbol_12.getOwnedTypes().add(symbol_67);
		symbol_1.getNestedPackages().add(symbol_12);
		//
		// lib::oclM2
		//
		symbol_68.setName("oclM2");
		//
		// lib::oclM2::Class
		//
		symbol_69.setName("Class");
		symbol_72.setName("T");
		symbol_71.setOwnedParameteredElement(symbol_72);
		symbol_70.getOwnedParameters().add(symbol_71);
		
		symbol_69.setOwnedTemplateSignature(symbol_70);
		symbol_69.getSuperClasses().add(symbol_18);
		symbol_68.getOwnedTypes().add(symbol_69);
		symbol_1.getNestedPackages().add(symbol_68);
		return symbol_1;
	}
}
