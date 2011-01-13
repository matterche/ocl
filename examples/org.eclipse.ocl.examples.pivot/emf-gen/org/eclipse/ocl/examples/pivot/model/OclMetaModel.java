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
 * from: /org.eclipse.ocl.examples.pivot/model/pivot.ecore
 * by: org.eclipse.ocl.examples.build.acceleo.GenerateOclMetaModel.java
 * defined by: org.eclipse.ocl.examples.build.acceleo.generateOclMetaModel.mtl
 * invoked by: org.eclipse.ocl.examples.build.utilities.OclMetaModelCodeGenerator.java
 * from: org.eclipse.ocl.examples.build.GenerateOclMetaModel.mwe2
 *
 * Do not edit it.
 *
 * $Id: OclMetaModel.java,v 1.1.2.6 2011/01/13 19:15:40 ewillink Exp $
 */
package	org.eclipse.ocl.examples.pivot.model;

import java.math.BigInteger;

import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.ocl.examples.pivot.*;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * This is the http://www.eclipse.org/ocl/3.1.0/Pivot Pivot Model of the Pivot Model
 * auto-generated from /org.eclipse.ocl.examples.pivot/model/pivot.ecore.
 * It facilitates efficient model loading without the overheads of model reading.
 */
@SuppressWarnings("nls")
public class OclMetaModel extends XMLResourceImpl
{
	/**
	 *	Create and return a pivot model of the Pivot Model.
	 */
	public static Package create(StandardLibrary standardLibrary)
	{
		Package symbol_1 = PivotFactory.eINSTANCE.createPackage(); // pivot
		Class symbol_2 = PivotFactory.eINSTANCE.createClass(); // pivot|Annotation
		
		Class symbol_3 = PivotFactory.eINSTANCE.createClass(); // pivot|AnyType
		
		Class symbol_4 = PivotFactory.eINSTANCE.createClass(); // pivot|AssociationClass
		
		Class symbol_5 = PivotFactory.eINSTANCE.createClass(); // pivot|AssociationClassCallExp
		
		Class symbol_6 = PivotFactory.eINSTANCE.createClass(); // pivot|AssociativityKind
		
		Class symbol_7 = PivotFactory.eINSTANCE.createClass(); // pivot|BagType
		
		PrimitiveType symbol_8 = standardLibrary.getBooleanType(); // pivot|Boolean
		Class symbol_9 = PivotFactory.eINSTANCE.createClass(); // pivot|BooleanLiteralExp
		
		Class symbol_10 = PivotFactory.eINSTANCE.createClass(); // pivot|CallExp
		
		Class symbol_11 = PivotFactory.eINSTANCE.createClass(); // pivot|CallOperationAction
		
		Class symbol_12 = PivotFactory.eINSTANCE.createClass(); // pivot|CallableImplementation
		
		Class symbol_13 = PivotFactory.eINSTANCE.createClass(); // pivot|Class
		
		Class symbol_14 = PivotFactory.eINSTANCE.createClass(); // pivot|CollectionItem
		
		Class symbol_15 = PivotFactory.eINSTANCE.createClass(); // pivot|CollectionKind
		
		Class symbol_16 = PivotFactory.eINSTANCE.createClass(); // pivot|CollectionLiteralExp
		
		Class symbol_17 = PivotFactory.eINSTANCE.createClass(); // pivot|CollectionLiteralPart
		
		Class symbol_18 = PivotFactory.eINSTANCE.createClass(); // pivot|CollectionRange
		
		Class symbol_19 = PivotFactory.eINSTANCE.createClass(); // pivot|CollectionType
		
		Class symbol_20 = PivotFactory.eINSTANCE.createClass(); // pivot|Comment
		
		Class symbol_21 = PivotFactory.eINSTANCE.createClass(); // pivot|CompleteEnvironment
		
		Class symbol_22 = PivotFactory.eINSTANCE.createClass(); // pivot|CompleteIteration
		
		Class symbol_23 = PivotFactory.eINSTANCE.createClass(); // pivot|CompleteOperation
		
		Class symbol_24 = PivotFactory.eINSTANCE.createClass(); // pivot|CompletePackage
		
		Class symbol_25 = PivotFactory.eINSTANCE.createClass(); // pivot|CompleteProperty
		
		Class symbol_26 = PivotFactory.eINSTANCE.createClass(); // pivot|CompleteType
		
		Class symbol_27 = PivotFactory.eINSTANCE.createClass(); // pivot|Constraint
		
		Class symbol_28 = PivotFactory.eINSTANCE.createClass(); // pivot|DataType
		
		Class symbol_29 = PivotFactory.eINSTANCE.createClass(); // pivot|Detail
		
		Class symbol_30 = PivotFactory.eINSTANCE.createClass(); // pivot|Element
		
		Class symbol_31 = PivotFactory.eINSTANCE.createClass(); // pivot|EnumLiteralExp
		
		Class symbol_32 = PivotFactory.eINSTANCE.createClass(); // pivot|Enumeration
		
		Class symbol_33 = PivotFactory.eINSTANCE.createClass(); // pivot|EnumerationLiteral
		
		Class symbol_34 = PivotFactory.eINSTANCE.createClass(); // pivot|ExpressionInOcl
		
		Class symbol_35 = PivotFactory.eINSTANCE.createClass(); // pivot|Feature
		
		Class symbol_36 = PivotFactory.eINSTANCE.createClass(); // pivot|FeatureCallExp
		
		Class symbol_37 = PivotFactory.eINSTANCE.createClass(); // pivot|IfExp
		
		Class symbol_38 = PivotFactory.eINSTANCE.createClass(); // pivot|ImplementableElement
		
		Class symbol_39 = PivotFactory.eINSTANCE.createClass(); // pivot|Int
		
		PrimitiveType symbol_40 = standardLibrary.getIntegerType(); // pivot|Integer
		Class symbol_41 = PivotFactory.eINSTANCE.createClass(); // pivot|IntegerLiteralExp
		
		Class symbol_42 = PivotFactory.eINSTANCE.createClass(); // pivot|InvalidLiteralExp
		
		Class symbol_43 = PivotFactory.eINSTANCE.createClass(); // pivot|InvalidType
		
		Class symbol_44 = PivotFactory.eINSTANCE.createClass(); // pivot|IterateExp
		
		Class symbol_45 = PivotFactory.eINSTANCE.createClass(); // pivot|Iteration
		
		Class symbol_46 = PivotFactory.eINSTANCE.createClass(); // pivot|IteratorExp
		
		Class symbol_47 = PivotFactory.eINSTANCE.createClass(); // pivot|LetExp
		
		Class symbol_48 = PivotFactory.eINSTANCE.createClass(); // pivot|Library
		
		Class symbol_49 = PivotFactory.eINSTANCE.createClass(); // pivot|LiteralExp
		
		Class symbol_50 = PivotFactory.eINSTANCE.createClass(); // pivot|LoopExp
		
		Class symbol_51 = PivotFactory.eINSTANCE.createClass(); // pivot|MessageExp
		
		Class symbol_52 = PivotFactory.eINSTANCE.createClass(); // pivot|MessageType
		
		Class symbol_53 = PivotFactory.eINSTANCE.createClass(); // pivot|MonikeredElement
		
		Class symbol_54 = PivotFactory.eINSTANCE.createClass(); // pivot|MultiplicityElement
		
		Class symbol_55 = PivotFactory.eINSTANCE.createClass(); // pivot|Nameable
		
		Class symbol_56 = PivotFactory.eINSTANCE.createClass(); // pivot|NamedElement
		
		Class symbol_57 = PivotFactory.eINSTANCE.createClass(); // pivot|Namespace
		
		Class symbol_58 = PivotFactory.eINSTANCE.createClass(); // pivot|NavigationCallExp
		
		Class symbol_59 = PivotFactory.eINSTANCE.createClass(); // pivot|NullLiteralExp
		
		Class symbol_60 = PivotFactory.eINSTANCE.createClass(); // pivot|NumericLiteralExp
		
		Class symbol_61 = PivotFactory.eINSTANCE.createClass(); // pivot|Object
		
		Class symbol_62 = PivotFactory.eINSTANCE.createClass(); // pivot|OclExpression
		
		Class symbol_63 = PivotFactory.eINSTANCE.createClass(); // pivot|OpaqueExpression
		
		Class symbol_64 = PivotFactory.eINSTANCE.createClass(); // pivot|Operation
		
		Class symbol_65 = PivotFactory.eINSTANCE.createClass(); // pivot|OperationCallExp
		
		Class symbol_66 = PivotFactory.eINSTANCE.createClass(); // pivot|OperationTemplateParameter
		
		Class symbol_67 = PivotFactory.eINSTANCE.createClass(); // pivot|OrderedSetType
		
		Class symbol_68 = PivotFactory.eINSTANCE.createClass(); // pivot|Package
		
		Class symbol_69 = PivotFactory.eINSTANCE.createClass(); // pivot|PackageableElement
		
		Class symbol_70 = PivotFactory.eINSTANCE.createClass(); // pivot|Parameter
		
		Class symbol_71 = PivotFactory.eINSTANCE.createClass(); // pivot|ParameterableElement
		
		Class symbol_72 = PivotFactory.eINSTANCE.createClass(); // pivot|Pivotable
		
		Class symbol_73 = PivotFactory.eINSTANCE.createClass(); // pivot|Precedence
		
		Class symbol_74 = PivotFactory.eINSTANCE.createClass(); // pivot|PrimitiveLiteralExp
		
		Class symbol_75 = PivotFactory.eINSTANCE.createClass(); // pivot|PrimitiveType
		
		Class symbol_76 = PivotFactory.eINSTANCE.createClass(); // pivot|Property
		
		Class symbol_77 = PivotFactory.eINSTANCE.createClass(); // pivot|PropertyCallExp
		
		PrimitiveType symbol_78 = standardLibrary.getRealType(); // pivot|Real
		Class symbol_79 = PivotFactory.eINSTANCE.createClass(); // pivot|RealLiteralExp
		
		Class symbol_80 = PivotFactory.eINSTANCE.createClass(); // pivot|SendSignalAction
		
		Class symbol_81 = PivotFactory.eINSTANCE.createClass(); // pivot|SequenceType
		
		Class symbol_82 = PivotFactory.eINSTANCE.createClass(); // pivot|SetType
		
		Class symbol_83 = PivotFactory.eINSTANCE.createClass(); // pivot|Signal
		
		Class symbol_84 = PivotFactory.eINSTANCE.createClass(); // pivot|State
		
		Class symbol_85 = PivotFactory.eINSTANCE.createClass(); // pivot|StateExp
		
		PrimitiveType symbol_86 = standardLibrary.getStringType(); // pivot|String
		Class symbol_87 = PivotFactory.eINSTANCE.createClass(); // pivot|StringLiteralExp
		
		Class symbol_88 = PivotFactory.eINSTANCE.createClass(); // pivot|TemplateBinding
		
		Class symbol_89 = PivotFactory.eINSTANCE.createClass(); // pivot|TemplateParameter
		
		Class symbol_90 = PivotFactory.eINSTANCE.createClass(); // pivot|TemplateParameterSubstitution
		
		Class symbol_91 = PivotFactory.eINSTANCE.createClass(); // pivot|TemplateParameterType
		
		Class symbol_92 = PivotFactory.eINSTANCE.createClass(); // pivot|TemplateSignature
		
		Class symbol_93 = PivotFactory.eINSTANCE.createClass(); // pivot|TemplateableElement
		
		Class symbol_94 = PivotFactory.eINSTANCE.createClass(); // pivot|Throwable
		
		Class symbol_95 = PivotFactory.eINSTANCE.createClass(); // pivot|TupleLiteralExp
		
		Class symbol_96 = PivotFactory.eINSTANCE.createClass(); // pivot|TupleLiteralPart
		
		Class symbol_97 = PivotFactory.eINSTANCE.createClass(); // pivot|TupleType
		
		Class symbol_98 = PivotFactory.eINSTANCE.createClass(); // pivot|Type
		
		Class symbol_99 = PivotFactory.eINSTANCE.createClass(); // pivot|TypeExp
		
		Class symbol_100 = PivotFactory.eINSTANCE.createClass(); // pivot|TypeTemplateParameter
		
		Class symbol_101 = PivotFactory.eINSTANCE.createClass(); // pivot|TypedElement
		
		Class symbol_102 = PivotFactory.eINSTANCE.createClass(); // pivot|TypedMultiplicityElement
		
		PrimitiveType symbol_103 = standardLibrary.getUnlimitedNaturalType(); // pivot|UnlimitedNatural
		Class symbol_104 = PivotFactory.eINSTANCE.createClass(); // pivot|UnlimitedNaturalLiteralExp
		
		Class symbol_105 = PivotFactory.eINSTANCE.createClass(); // pivot|UnspecifiedValueExp
		
		Class symbol_106 = PivotFactory.eINSTANCE.createClass(); // pivot|ValueSpecification
		
		Class symbol_107 = PivotFactory.eINSTANCE.createClass(); // pivot|Variable
		
		Class symbol_108 = PivotFactory.eINSTANCE.createClass(); // pivot|VariableDeclaration
		
		Class symbol_109 = PivotFactory.eINSTANCE.createClass(); // pivot|VariableExp
		
		Class symbol_110 = PivotFactory.eINSTANCE.createClass(); // pivot|Visitable
		
		Class symbol_111 = PivotFactory.eINSTANCE.createClass(); // pivot|Visitor{R,C}
		TemplateSignature symbol_112 = PivotFactory.eINSTANCE.createTemplateSignature(); // pivot|Visitor{R,C}|
		TypeTemplateParameter symbol_113 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_114 = PivotFactory.eINSTANCE.createClass(); // pivot|Visitor{R,C}?R
		TypeTemplateParameter symbol_115 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_116 = PivotFactory.eINSTANCE.createClass(); // pivot|Visitor{R,C}?C
		
		
		Class symbol_117 = PivotFactory.eINSTANCE.createClass(); // pivot|VoidType
		

		symbol_1.setName("pivot");
		symbol_1.setNsPrefix("pivot");
		symbol_1.setNsURI("http://www.eclipse.org/ocl/3.1.0/Pivot");
		//
		// pivot.ecore::pivot::Annotation pivot|Annotation
		//
		symbol_2.setName("Annotation");
		symbol_2.getSuperClasses().add(symbol_56);
		{ // pivot.ecore::pivot::Annotation::ownedContent pivot|Annotation|ownedContent
			Property symbol_118 = PivotFactory.eINSTANCE.createProperty();
			symbol_118.setName("ownedContent");
			symbol_118.setType(symbol_30);  // pivot|Element
			symbol_118.setLower(BigInteger.valueOf(0));
			symbol_118.setUpper(BigInteger.valueOf(-1));
			symbol_118.setIsOrdered(true);
			
			symbol_118.setIsComposite(true);
			symbol_118.setIsResolveProxies(true);
			symbol_2.getOwnedAttributes().add(symbol_118);
		}
		{ // pivot.ecore::pivot::Annotation::ownedDetail pivot|Annotation|ownedDetail
			Property symbol_119 = PivotFactory.eINSTANCE.createProperty();
			symbol_119.setName("ownedDetail");
			symbol_119.setType(symbol_29);  // pivot|Detail
			symbol_119.setLower(BigInteger.valueOf(0));
			symbol_119.setUpper(BigInteger.valueOf(-1));
			symbol_119.setIsOrdered(true);
			
			symbol_119.setIsComposite(true);
			symbol_119.setIsResolveProxies(true);
			symbol_2.getOwnedAttributes().add(symbol_119);
		}
		{ // pivot.ecore::pivot::Annotation::reference pivot|Annotation|reference
			Property symbol_120 = PivotFactory.eINSTANCE.createProperty();
			symbol_120.setName("reference");
			symbol_120.setType(symbol_30);  // pivot|Element
			symbol_120.setLower(BigInteger.valueOf(0));
			symbol_120.setUpper(BigInteger.valueOf(-1));
			symbol_120.setIsOrdered(true);
			
			symbol_120.setIsResolveProxies(true);
			symbol_2.getOwnedAttributes().add(symbol_120);
		}
		symbol_1.getOwnedTypes().add(symbol_2);
		//
		// pivot.ecore::pivot::AnyType pivot|AnyType
		//
		symbol_3.setName("AnyType");
		symbol_3.getSuperClasses().add(symbol_13);
		symbol_1.getOwnedTypes().add(symbol_3);
		//
		// pivot.ecore::pivot::AssociationClass pivot|AssociationClass
		//
		symbol_4.setName("AssociationClass");
		symbol_4.getSuperClasses().add(symbol_13);
		{ // pivot.ecore::pivot::AssociationClass::unownedAttribute pivot|AssociationClass|unownedAttribute
			Property symbol_121 = PivotFactory.eINSTANCE.createProperty();
			symbol_121.setName("unownedAttribute");
			symbol_121.setType(symbol_76);  // pivot|Property
			symbol_121.setLower(BigInteger.valueOf(0));
			symbol_121.setUpper(BigInteger.valueOf(-1));
			
			symbol_121.setIsResolveProxies(true);
			symbol_4.getOwnedAttributes().add(symbol_121);
		}
		symbol_1.getOwnedTypes().add(symbol_4);
		//
		// pivot.ecore::pivot::AssociationClassCallExp pivot|AssociationClassCallExp
		//
		symbol_5.setName("AssociationClassCallExp");
		symbol_5.getSuperClasses().add(symbol_58);
		{ // pivot.ecore::pivot::AssociationClassCallExp::referredAssociationClass pivot|AssociationClassCallExp|referredAssociationClass
			Property symbol_122 = PivotFactory.eINSTANCE.createProperty();
			symbol_122.setName("referredAssociationClass");
			symbol_122.setType(symbol_4);  // pivot|AssociationClass
			symbol_122.setLower(BigInteger.valueOf(0));
			
			symbol_122.setIsResolveProxies(true);
			symbol_5.getOwnedAttributes().add(symbol_122);
		}
		symbol_1.getOwnedTypes().add(symbol_5);
		//
		// pivot.ecore::pivot::AssociativityKind pivot|AssociativityKind
		//
		symbol_6.setName("AssociativityKind");
		symbol_1.getOwnedTypes().add(symbol_6);
		//
		// pivot.ecore::pivot::BagType pivot|BagType
		//
		symbol_7.setName("BagType");
		symbol_7.getSuperClasses().add(symbol_19);
		symbol_1.getOwnedTypes().add(symbol_7);
		//
		// pivot.ecore::pivot::BooleanLiteralExp pivot|BooleanLiteralExp
		//
		symbol_9.setName("BooleanLiteralExp");
		symbol_9.getSuperClasses().add(symbol_74);
		{ // pivot.ecore::pivot::BooleanLiteralExp::booleanSymbol pivot|BooleanLiteralExp|booleanSymbol
			Property symbol_123 = PivotFactory.eINSTANCE.createProperty();
			symbol_123.setName("booleanSymbol");
			symbol_123.setType(symbol_8);  // pivot|Boolean
			
			symbol_123.setIsResolveProxies(true);
			symbol_123.setIsUnsettable(true);
			symbol_9.getOwnedAttributes().add(symbol_123);
		}
		symbol_1.getOwnedTypes().add(symbol_9);
		//
		// pivot.ecore::pivot::CallExp pivot|CallExp
		//
		symbol_10.setName("CallExp");
		symbol_10.getSuperClasses().add(symbol_62);
		{ // pivot.ecore::pivot::CallExp::implicit pivot|CallExp|implicit
			Property symbol_124 = PivotFactory.eINSTANCE.createProperty();
			symbol_124.setName("implicit");
			symbol_124.setType(symbol_8);  // pivot|Boolean
			symbol_124.setLower(BigInteger.valueOf(0));
			
			symbol_124.setIsResolveProxies(true);
			symbol_10.getOwnedAttributes().add(symbol_124);
		}
		{ // pivot.ecore::pivot::CallExp::source pivot|CallExp|source
			Property symbol_125 = PivotFactory.eINSTANCE.createProperty();
			symbol_125.setName("source");
			symbol_125.setType(symbol_62);  // pivot|OclExpression
			symbol_125.setLower(BigInteger.valueOf(0));
			
			symbol_125.setIsComposite(true);
			symbol_125.setIsResolveProxies(true);
			symbol_10.getOwnedAttributes().add(symbol_125);
		}
		symbol_1.getOwnedTypes().add(symbol_10);
		//
		// pivot.ecore::pivot::CallOperationAction pivot|CallOperationAction
		//
		symbol_11.setName("CallOperationAction");
		symbol_11.getSuperClasses().add(symbol_56);
		{ // pivot.ecore::pivot::CallOperationAction::operation pivot|CallOperationAction|operation
			Property symbol_126 = PivotFactory.eINSTANCE.createProperty();
			symbol_126.setName("operation");
			symbol_126.setType(symbol_64);  // pivot|Operation
			
			symbol_126.setIsResolveProxies(true);
			symbol_11.getOwnedAttributes().add(symbol_126);
		}
		symbol_1.getOwnedTypes().add(symbol_11);
		//
		// pivot.ecore::pivot::CallableImplementation pivot|CallableImplementation
		//
		symbol_12.setName("CallableImplementation");
		symbol_1.getOwnedTypes().add(symbol_12);
		//
		// pivot.ecore::pivot::Class pivot|Class
		//
		symbol_13.setName("Class");
		symbol_13.getSuperClasses().add(symbol_57);
		symbol_13.getSuperClasses().add(symbol_98);
		{ // pivot.ecore::pivot::Class::isAbstract pivot|Class|isAbstract
			Property symbol_127 = PivotFactory.eINSTANCE.createProperty();
			symbol_127.setName("isAbstract");
			symbol_127.setType(symbol_8);  // pivot|Boolean
			
			symbol_127.setIsResolveProxies(true);
			symbol_13.getOwnedAttributes().add(symbol_127);
		}
		{ // pivot.ecore::pivot::Class::isInterface pivot|Class|isInterface
			Property symbol_128 = PivotFactory.eINSTANCE.createProperty();
			symbol_128.setName("isInterface");
			symbol_128.setType(symbol_8);  // pivot|Boolean
			
			symbol_128.setIsResolveProxies(true);
			symbol_13.getOwnedAttributes().add(symbol_128);
		}
		{ // pivot.ecore::pivot::Class::ownedAttribute pivot|Class|ownedAttribute
			Property symbol_129 = PivotFactory.eINSTANCE.createProperty();
			symbol_129.setName("ownedAttribute");
			symbol_129.setType(symbol_76);  // pivot|Property
			symbol_129.setLower(BigInteger.valueOf(0));
			symbol_129.setUpper(BigInteger.valueOf(-1));
			symbol_129.setIsOrdered(true);
			
			symbol_129.setIsComposite(true);
			symbol_129.setIsResolveProxies(true);
			symbol_13.getOwnedAttributes().add(symbol_129);
		}
		{ // pivot.ecore::pivot::Class::ownedOperation pivot|Class|ownedOperation
			Property symbol_130 = PivotFactory.eINSTANCE.createProperty();
			symbol_130.setName("ownedOperation");
			symbol_130.setType(symbol_64);  // pivot|Operation
			symbol_130.setLower(BigInteger.valueOf(0));
			symbol_130.setUpper(BigInteger.valueOf(-1));
			symbol_130.setIsOrdered(true);
			
			symbol_130.setIsComposite(true);
			symbol_130.setIsResolveProxies(true);
			symbol_13.getOwnedAttributes().add(symbol_130);
		}
		{ // pivot.ecore::pivot::Class::subClass pivot|Class|subClass
			Property symbol_131 = PivotFactory.eINSTANCE.createProperty();
			symbol_131.setName("subClass");
			symbol_131.setType(symbol_13);  // pivot|Class
			symbol_131.setLower(BigInteger.valueOf(0));
			symbol_131.setUpper(BigInteger.valueOf(-1));
			
			symbol_131.setIsTransient(true);
			symbol_13.getOwnedAttributes().add(symbol_131);
		}
		{ // pivot.ecore::pivot::Class::superClass pivot|Class|superClass
			Property symbol_132 = PivotFactory.eINSTANCE.createProperty();
			symbol_132.setName("superClass");
			symbol_132.setType(symbol_13);  // pivot|Class
			symbol_132.setLower(BigInteger.valueOf(0));
			symbol_132.setUpper(BigInteger.valueOf(-1));
			
			symbol_132.setIsResolveProxies(true);
			symbol_13.getOwnedAttributes().add(symbol_132);
		}
		symbol_1.getOwnedTypes().add(symbol_13);
		//
		// pivot.ecore::pivot::CollectionItem pivot|CollectionItem
		//
		symbol_14.setName("CollectionItem");
		symbol_14.getSuperClasses().add(symbol_17);
		{ // pivot.ecore::pivot::CollectionItem::item pivot|CollectionItem|item
			Property symbol_133 = PivotFactory.eINSTANCE.createProperty();
			symbol_133.setName("item");
			symbol_133.setType(symbol_62);  // pivot|OclExpression
			
			symbol_133.setIsComposite(true);
			symbol_133.setIsResolveProxies(true);
			symbol_14.getOwnedAttributes().add(symbol_133);
		}
		symbol_1.getOwnedTypes().add(symbol_14);
		//
		// pivot.ecore::pivot::CollectionKind pivot|CollectionKind
		//
		symbol_15.setName("CollectionKind");
		symbol_1.getOwnedTypes().add(symbol_15);
		//
		// pivot.ecore::pivot::CollectionLiteralExp pivot|CollectionLiteralExp
		//
		symbol_16.setName("CollectionLiteralExp");
		symbol_16.getSuperClasses().add(symbol_49);
		{ // pivot.ecore::pivot::CollectionLiteralExp::kind pivot|CollectionLiteralExp|kind
			Property symbol_134 = PivotFactory.eINSTANCE.createProperty();
			symbol_134.setName("kind");
			symbol_134.setType(symbol_15);  // pivot|CollectionKind
			
			symbol_134.setIsResolveProxies(true);
			symbol_16.getOwnedAttributes().add(symbol_134);
		}
		{ // pivot.ecore::pivot::CollectionLiteralExp::part pivot|CollectionLiteralExp|part
			Property symbol_135 = PivotFactory.eINSTANCE.createProperty();
			symbol_135.setName("part");
			symbol_135.setType(symbol_17);  // pivot|CollectionLiteralPart
			symbol_135.setLower(BigInteger.valueOf(0));
			symbol_135.setUpper(BigInteger.valueOf(-1));
			symbol_135.setIsOrdered(true);
			
			symbol_135.setIsComposite(true);
			symbol_135.setIsResolveProxies(true);
			symbol_16.getOwnedAttributes().add(symbol_135);
		}
		symbol_1.getOwnedTypes().add(symbol_16);
		//
		// pivot.ecore::pivot::CollectionLiteralPart pivot|CollectionLiteralPart
		//
		symbol_17.setName("CollectionLiteralPart");
		symbol_17.getSuperClasses().add(symbol_101);
		symbol_1.getOwnedTypes().add(symbol_17);
		//
		// pivot.ecore::pivot::CollectionRange pivot|CollectionRange
		//
		symbol_18.setName("CollectionRange");
		symbol_18.getSuperClasses().add(symbol_17);
		{ // pivot.ecore::pivot::CollectionRange::first pivot|CollectionRange|first
			Property symbol_136 = PivotFactory.eINSTANCE.createProperty();
			symbol_136.setName("first");
			symbol_136.setType(symbol_62);  // pivot|OclExpression
			
			symbol_136.setIsComposite(true);
			symbol_136.setIsResolveProxies(true);
			symbol_18.getOwnedAttributes().add(symbol_136);
		}
		{ // pivot.ecore::pivot::CollectionRange::last pivot|CollectionRange|last
			Property symbol_137 = PivotFactory.eINSTANCE.createProperty();
			symbol_137.setName("last");
			symbol_137.setType(symbol_62);  // pivot|OclExpression
			
			symbol_137.setIsComposite(true);
			symbol_137.setIsResolveProxies(true);
			symbol_18.getOwnedAttributes().add(symbol_137);
		}
		symbol_1.getOwnedTypes().add(symbol_18);
		//
		// pivot.ecore::pivot::CollectionType pivot|CollectionType
		//
		symbol_19.setName("CollectionType");
		symbol_19.getSuperClasses().add(symbol_28);
		{ // pivot.ecore::pivot::CollectionType::elementType pivot|CollectionType|elementType
			Property symbol_138 = PivotFactory.eINSTANCE.createProperty();
			symbol_138.setName("elementType");
			symbol_138.setType(symbol_98);  // pivot|Type
			
			symbol_138.setIsResolveProxies(true);
			symbol_19.getOwnedAttributes().add(symbol_138);
		}
		symbol_1.getOwnedTypes().add(symbol_19);
		//
		// pivot.ecore::pivot::Comment pivot|Comment
		//
		symbol_20.setName("Comment");
		symbol_20.getSuperClasses().add(symbol_30);
		{ // pivot.ecore::pivot::Comment::annotatedElement pivot|Comment|annotatedElement
			Property symbol_139 = PivotFactory.eINSTANCE.createProperty();
			symbol_139.setName("annotatedElement");
			symbol_139.setType(symbol_30);  // pivot|Element
			symbol_139.setLower(BigInteger.valueOf(0));
			symbol_139.setUpper(BigInteger.valueOf(-1));
			
			symbol_139.setIsResolveProxies(true);
			symbol_20.getOwnedAttributes().add(symbol_139);
		}
		{ // pivot.ecore::pivot::Comment::body pivot|Comment|body
			Property symbol_140 = PivotFactory.eINSTANCE.createProperty();
			symbol_140.setName("body");
			symbol_140.setType(symbol_86);  // pivot|String
			symbol_140.setLower(BigInteger.valueOf(0));
			
			symbol_140.setIsResolveProxies(true);
			symbol_20.getOwnedAttributes().add(symbol_140);
		}
		symbol_1.getOwnedTypes().add(symbol_20);
		//
		// pivot.ecore::pivot::CompleteEnvironment pivot|CompleteEnvironment
		//
		symbol_21.setName("CompleteEnvironment");
		symbol_21.getSuperClasses().add(symbol_68);
		{	// pivot.ecore::pivot::CompleteEnvironment::getCompleteIteration() pivot|CompleteEnvironment|getCompleteIteration(pivot|Iteration)
			Operation symbol_141 = PivotFactory.eINSTANCE.createOperation();
			symbol_141.setName("getCompleteIteration");
			symbol_141.setType(symbol_22);  // pivot|CompleteIteration
			
			Parameter symbol_142 = PivotFactory.eINSTANCE.createParameter();
			symbol_142.setName("model");
			symbol_142.setType(symbol_45);  // pivot|Iteration
			
			symbol_141.getOwnedParameters().add(symbol_142);
			symbol_21.getOwnedOperations().add(symbol_141);
		}
		{	// pivot.ecore::pivot::CompleteEnvironment::getCompleteOperation() pivot|CompleteEnvironment|getCompleteOperation(pivot|Operation)
			Operation symbol_143 = PivotFactory.eINSTANCE.createOperation();
			symbol_143.setName("getCompleteOperation");
			symbol_143.setType(symbol_23);  // pivot|CompleteOperation
			
			Parameter symbol_144 = PivotFactory.eINSTANCE.createParameter();
			symbol_144.setName("model");
			symbol_144.setType(symbol_64);  // pivot|Operation
			
			symbol_143.getOwnedParameters().add(symbol_144);
			symbol_21.getOwnedOperations().add(symbol_143);
		}
		{	// pivot.ecore::pivot::CompleteEnvironment::getCompletePackage() pivot|CompleteEnvironment|getCompletePackage(pivot|Package)
			Operation symbol_145 = PivotFactory.eINSTANCE.createOperation();
			symbol_145.setName("getCompletePackage");
			symbol_145.setType(symbol_24);  // pivot|CompletePackage
			
			Parameter symbol_146 = PivotFactory.eINSTANCE.createParameter();
			symbol_146.setName("model");
			symbol_146.setType(symbol_68);  // pivot|Package
			
			symbol_145.getOwnedParameters().add(symbol_146);
			symbol_21.getOwnedOperations().add(symbol_145);
		}
		{	// pivot.ecore::pivot::CompleteEnvironment::getCompleteProperty() pivot|CompleteEnvironment|getCompleteProperty(pivot|Property)
			Operation symbol_147 = PivotFactory.eINSTANCE.createOperation();
			symbol_147.setName("getCompleteProperty");
			symbol_147.setType(symbol_25);  // pivot|CompleteProperty
			
			Parameter symbol_148 = PivotFactory.eINSTANCE.createParameter();
			symbol_148.setName("model");
			symbol_148.setType(symbol_76);  // pivot|Property
			
			symbol_147.getOwnedParameters().add(symbol_148);
			symbol_21.getOwnedOperations().add(symbol_147);
		}
		{	// pivot.ecore::pivot::CompleteEnvironment::getCompleteType() pivot|CompleteEnvironment|getCompleteType(pivot|Type)
			Operation symbol_149 = PivotFactory.eINSTANCE.createOperation();
			symbol_149.setName("getCompleteType");
			symbol_149.setType(symbol_26);  // pivot|CompleteType
			
			Parameter symbol_150 = PivotFactory.eINSTANCE.createParameter();
			symbol_150.setName("model");
			symbol_150.setType(symbol_98);  // pivot|Type
			
			symbol_149.getOwnedParameters().add(symbol_150);
			symbol_21.getOwnedOperations().add(symbol_149);
		}
		symbol_1.getOwnedTypes().add(symbol_21);
		//
		// pivot.ecore::pivot::CompleteIteration pivot|CompleteIteration
		//
		symbol_22.setName("CompleteIteration");
		symbol_22.getSuperClasses().add(symbol_45);
		{ // pivot.ecore::pivot::CompleteIteration::completeAccumulator pivot|CompleteIteration|completeAccumulator
			Property symbol_151 = PivotFactory.eINSTANCE.createProperty();
			symbol_151.setName("completeAccumulator");
			symbol_151.setType(symbol_70);  // pivot|Parameter
			symbol_151.setLower(BigInteger.valueOf(0));
			symbol_151.setUpper(BigInteger.valueOf(-1));
			
			symbol_151.setIsDerived(true);
			symbol_151.setIsReadOnly(true);
			symbol_151.setIsResolveProxies(true);
			symbol_151.setIsVolatile(true);
			symbol_22.getOwnedAttributes().add(symbol_151);
		}
		{ // pivot.ecore::pivot::CompleteIteration::completeEnvironment pivot|CompleteIteration|completeEnvironment
			Property symbol_152 = PivotFactory.eINSTANCE.createProperty();
			symbol_152.setName("completeEnvironment");
			symbol_152.setType(symbol_21);  // pivot|CompleteEnvironment
			
			symbol_152.setIsResolveProxies(true);
			symbol_22.getOwnedAttributes().add(symbol_152);
		}
		{ // pivot.ecore::pivot::CompleteIteration::completeIterator pivot|CompleteIteration|completeIterator
			Property symbol_153 = PivotFactory.eINSTANCE.createProperty();
			symbol_153.setName("completeIterator");
			symbol_153.setType(symbol_70);  // pivot|Parameter
			symbol_153.setLower(BigInteger.valueOf(0));
			symbol_153.setUpper(BigInteger.valueOf(-1));
			
			symbol_153.setIsDerived(true);
			symbol_153.setIsReadOnly(true);
			symbol_153.setIsResolveProxies(true);
			symbol_153.setIsVolatile(true);
			symbol_22.getOwnedAttributes().add(symbol_153);
		}
		{ // pivot.ecore::pivot::CompleteIteration::completeParameter pivot|CompleteIteration|completeParameter
			Property symbol_154 = PivotFactory.eINSTANCE.createProperty();
			symbol_154.setName("completeParameter");
			symbol_154.setType(symbol_70);  // pivot|Parameter
			symbol_154.setLower(BigInteger.valueOf(0));
			symbol_154.setUpper(BigInteger.valueOf(-1));
			
			symbol_154.setIsDerived(true);
			symbol_154.setIsReadOnly(true);
			symbol_154.setIsResolveProxies(true);
			symbol_154.setIsVolatile(true);
			symbol_22.getOwnedAttributes().add(symbol_154);
		}
		{ // pivot.ecore::pivot::CompleteIteration::model pivot|CompleteIteration|model
			Property symbol_155 = PivotFactory.eINSTANCE.createProperty();
			symbol_155.setName("model");
			symbol_155.setType(symbol_45);  // pivot|Iteration
			
			symbol_155.setIsResolveProxies(true);
			symbol_22.getOwnedAttributes().add(symbol_155);
		}
		symbol_1.getOwnedTypes().add(symbol_22);
		//
		// pivot.ecore::pivot::CompleteOperation pivot|CompleteOperation
		//
		symbol_23.setName("CompleteOperation");
		symbol_23.getSuperClasses().add(symbol_64);
		{ // pivot.ecore::pivot::CompleteOperation::completeEnvironment pivot|CompleteOperation|completeEnvironment
			Property symbol_156 = PivotFactory.eINSTANCE.createProperty();
			symbol_156.setName("completeEnvironment");
			symbol_156.setType(symbol_21);  // pivot|CompleteEnvironment
			
			symbol_156.setIsResolveProxies(true);
			symbol_23.getOwnedAttributes().add(symbol_156);
		}
		{ // pivot.ecore::pivot::CompleteOperation::completeParameter pivot|CompleteOperation|completeParameter
			Property symbol_157 = PivotFactory.eINSTANCE.createProperty();
			symbol_157.setName("completeParameter");
			symbol_157.setType(symbol_70);  // pivot|Parameter
			symbol_157.setLower(BigInteger.valueOf(0));
			symbol_157.setUpper(BigInteger.valueOf(-1));
			
			symbol_157.setIsDerived(true);
			symbol_157.setIsReadOnly(true);
			symbol_157.setIsResolveProxies(true);
			symbol_157.setIsVolatile(true);
			symbol_23.getOwnedAttributes().add(symbol_157);
		}
		{ // pivot.ecore::pivot::CompleteOperation::model pivot|CompleteOperation|model
			Property symbol_158 = PivotFactory.eINSTANCE.createProperty();
			symbol_158.setName("model");
			symbol_158.setType(symbol_64);  // pivot|Operation
			
			symbol_158.setIsResolveProxies(true);
			symbol_23.getOwnedAttributes().add(symbol_158);
		}
		symbol_1.getOwnedTypes().add(symbol_23);
		//
		// pivot.ecore::pivot::CompletePackage pivot|CompletePackage
		//
		symbol_24.setName("CompletePackage");
		symbol_24.getSuperClasses().add(symbol_68);
		{ // pivot.ecore::pivot::CompletePackage::completeEnvironment pivot|CompletePackage|completeEnvironment
			Property symbol_159 = PivotFactory.eINSTANCE.createProperty();
			symbol_159.setName("completeEnvironment");
			symbol_159.setType(symbol_21);  // pivot|CompleteEnvironment
			
			symbol_159.setIsResolveProxies(true);
			symbol_24.getOwnedAttributes().add(symbol_159);
		}
		{ // pivot.ecore::pivot::CompletePackage::completePackage pivot|CompletePackage|completePackage
			Property symbol_160 = PivotFactory.eINSTANCE.createProperty();
			symbol_160.setName("completePackage");
			symbol_160.setType(symbol_24);  // pivot|CompletePackage
			symbol_160.setLower(BigInteger.valueOf(0));
			symbol_160.setUpper(BigInteger.valueOf(-1));
			
			symbol_160.setIsDerived(true);
			symbol_160.setIsReadOnly(true);
			symbol_160.setIsResolveProxies(true);
			symbol_160.setIsVolatile(true);
			symbol_24.getOwnedAttributes().add(symbol_160);
		}
		{ // pivot.ecore::pivot::CompletePackage::completeType pivot|CompletePackage|completeType
			Property symbol_161 = PivotFactory.eINSTANCE.createProperty();
			symbol_161.setName("completeType");
			symbol_161.setType(symbol_26);  // pivot|CompleteType
			symbol_161.setLower(BigInteger.valueOf(0));
			symbol_161.setUpper(BigInteger.valueOf(-1));
			
			symbol_161.setIsDerived(true);
			symbol_161.setIsReadOnly(true);
			symbol_161.setIsResolveProxies(true);
			symbol_161.setIsVolatile(true);
			symbol_24.getOwnedAttributes().add(symbol_161);
		}
		{ // pivot.ecore::pivot::CompletePackage::model pivot|CompletePackage|model
			Property symbol_162 = PivotFactory.eINSTANCE.createProperty();
			symbol_162.setName("model");
			symbol_162.setType(symbol_68);  // pivot|Package
			
			symbol_162.setIsResolveProxies(true);
			symbol_24.getOwnedAttributes().add(symbol_162);
		}
		symbol_1.getOwnedTypes().add(symbol_24);
		//
		// pivot.ecore::pivot::CompleteProperty pivot|CompleteProperty
		//
		symbol_25.setName("CompleteProperty");
		symbol_25.getSuperClasses().add(symbol_76);
		{ // pivot.ecore::pivot::CompleteProperty::completeEnvironment pivot|CompleteProperty|completeEnvironment
			Property symbol_163 = PivotFactory.eINSTANCE.createProperty();
			symbol_163.setName("completeEnvironment");
			symbol_163.setType(symbol_21);  // pivot|CompleteEnvironment
			
			symbol_163.setIsResolveProxies(true);
			symbol_25.getOwnedAttributes().add(symbol_163);
		}
		{ // pivot.ecore::pivot::CompleteProperty::model pivot|CompleteProperty|model
			Property symbol_164 = PivotFactory.eINSTANCE.createProperty();
			symbol_164.setName("model");
			symbol_164.setType(symbol_76);  // pivot|Property
			
			symbol_164.setIsResolveProxies(true);
			symbol_25.getOwnedAttributes().add(symbol_164);
		}
		symbol_1.getOwnedTypes().add(symbol_25);
		//
		// pivot.ecore::pivot::CompleteType pivot|CompleteType
		//
		symbol_26.setName("CompleteType");
		symbol_26.getSuperClasses().add(symbol_13);
		{ // pivot.ecore::pivot::CompleteType::completeEnvironment pivot|CompleteType|completeEnvironment
			Property symbol_165 = PivotFactory.eINSTANCE.createProperty();
			symbol_165.setName("completeEnvironment");
			symbol_165.setType(symbol_21);  // pivot|CompleteEnvironment
			
			symbol_165.setIsResolveProxies(true);
			symbol_26.getOwnedAttributes().add(symbol_165);
		}
		{ // pivot.ecore::pivot::CompleteType::completeOperation pivot|CompleteType|completeOperation
			Property symbol_166 = PivotFactory.eINSTANCE.createProperty();
			symbol_166.setName("completeOperation");
			symbol_166.setType(symbol_23);  // pivot|CompleteOperation
			symbol_166.setLower(BigInteger.valueOf(0));
			symbol_166.setUpper(BigInteger.valueOf(-1));
			
			symbol_166.setIsDerived(true);
			symbol_166.setIsReadOnly(true);
			symbol_166.setIsResolveProxies(true);
			symbol_166.setIsVolatile(true);
			symbol_26.getOwnedAttributes().add(symbol_166);
		}
		{ // pivot.ecore::pivot::CompleteType::completeProperty pivot|CompleteType|completeProperty
			Property symbol_167 = PivotFactory.eINSTANCE.createProperty();
			symbol_167.setName("completeProperty");
			symbol_167.setType(symbol_25);  // pivot|CompleteProperty
			symbol_167.setLower(BigInteger.valueOf(0));
			symbol_167.setUpper(BigInteger.valueOf(-1));
			
			symbol_167.setIsDerived(true);
			symbol_167.setIsReadOnly(true);
			symbol_167.setIsResolveProxies(true);
			symbol_167.setIsVolatile(true);
			symbol_26.getOwnedAttributes().add(symbol_167);
		}
		{ // pivot.ecore::pivot::CompleteType::completeSuperType pivot|CompleteType|completeSuperType
			Property symbol_168 = PivotFactory.eINSTANCE.createProperty();
			symbol_168.setName("completeSuperType");
			symbol_168.setType(symbol_26);  // pivot|CompleteType
			symbol_168.setLower(BigInteger.valueOf(0));
			symbol_168.setUpper(BigInteger.valueOf(-1));
			
			symbol_168.setIsDerived(true);
			symbol_168.setIsReadOnly(true);
			symbol_168.setIsResolveProxies(true);
			symbol_168.setIsVolatile(true);
			symbol_26.getOwnedAttributes().add(symbol_168);
		}
		{ // pivot.ecore::pivot::CompleteType::model pivot|CompleteType|model
			Property symbol_169 = PivotFactory.eINSTANCE.createProperty();
			symbol_169.setName("model");
			symbol_169.setType(symbol_98);  // pivot|Type
			
			symbol_169.setIsResolveProxies(true);
			symbol_26.getOwnedAttributes().add(symbol_169);
		}
		{	// pivot.ecore::pivot::CompleteType::conformsTo() pivot|CompleteType|conformsTo(pivot|CompleteType)
			Operation symbol_170 = PivotFactory.eINSTANCE.createOperation();
			symbol_170.setName("conformsTo");
			symbol_170.setType(symbol_8);  // pivot|Boolean
			
			Parameter symbol_171 = PivotFactory.eINSTANCE.createParameter();
			symbol_171.setName("aType");
			symbol_171.setType(symbol_26);  // pivot|CompleteType
			
			symbol_170.getOwnedParameters().add(symbol_171);
			symbol_26.getOwnedOperations().add(symbol_170);
		}
		{	// pivot.ecore::pivot::CompleteType::getCompleteIterations() pivot|CompleteType|getCompleteIterations(pivot|String)
			Operation symbol_172 = PivotFactory.eINSTANCE.createOperation();
			symbol_172.setName("getCompleteIterations");
			symbol_172.setType(symbol_22);  // pivot|CompleteIteration
			symbol_172.setLower(BigInteger.valueOf(0));
			symbol_172.setUpper(BigInteger.valueOf(-1));
			
			Parameter symbol_173 = PivotFactory.eINSTANCE.createParameter();
			symbol_173.setName("name");
			symbol_173.setType(symbol_86);  // pivot|String
			
			symbol_172.getOwnedParameters().add(symbol_173);
			symbol_26.getOwnedOperations().add(symbol_172);
		}
		{	// pivot.ecore::pivot::CompleteType::getCompleteOperations() pivot|CompleteType|getCompleteOperations(pivot|String)
			Operation symbol_174 = PivotFactory.eINSTANCE.createOperation();
			symbol_174.setName("getCompleteOperations");
			symbol_174.setType(symbol_23);  // pivot|CompleteOperation
			symbol_174.setLower(BigInteger.valueOf(0));
			symbol_174.setUpper(BigInteger.valueOf(-1));
			
			Parameter symbol_175 = PivotFactory.eINSTANCE.createParameter();
			symbol_175.setName("name");
			symbol_175.setType(symbol_86);  // pivot|String
			
			symbol_174.getOwnedParameters().add(symbol_175);
			symbol_26.getOwnedOperations().add(symbol_174);
		}
		{	// pivot.ecore::pivot::CompleteType::getDynamicIteration() pivot|CompleteType|getDynamicIteration(pivot|CompleteIteration)
			Operation symbol_176 = PivotFactory.eINSTANCE.createOperation();
			symbol_176.setName("getDynamicIteration");
			symbol_176.setType(symbol_22);  // pivot|CompleteIteration
			
			Parameter symbol_177 = PivotFactory.eINSTANCE.createParameter();
			symbol_177.setName("staticOperation");
			symbol_177.setType(symbol_22);  // pivot|CompleteIteration
			
			symbol_176.getOwnedParameters().add(symbol_177);
			symbol_26.getOwnedOperations().add(symbol_176);
		}
		{	// pivot.ecore::pivot::CompleteType::getDynamicOperation() pivot|CompleteType|getDynamicOperation(pivot|CompleteOperation)
			Operation symbol_178 = PivotFactory.eINSTANCE.createOperation();
			symbol_178.setName("getDynamicOperation");
			symbol_178.setType(symbol_23);  // pivot|CompleteOperation
			
			Parameter symbol_179 = PivotFactory.eINSTANCE.createParameter();
			symbol_179.setName("staticOperation");
			symbol_179.setType(symbol_23);  // pivot|CompleteOperation
			
			symbol_178.getOwnedParameters().add(symbol_179);
			symbol_26.getOwnedOperations().add(symbol_178);
		}
		symbol_1.getOwnedTypes().add(symbol_26);
		//
		// pivot.ecore::pivot::Constraint pivot|Constraint
		//
		symbol_27.setName("Constraint");
		symbol_27.getSuperClasses().add(symbol_56);
		{ // pivot.ecore::pivot::Constraint::constrainedElement pivot|Constraint|constrainedElement
			Property symbol_180 = PivotFactory.eINSTANCE.createProperty();
			symbol_180.setName("constrainedElement");
			symbol_180.setType(symbol_30);  // pivot|Element
			symbol_180.setLower(BigInteger.valueOf(0));
			symbol_180.setUpper(BigInteger.valueOf(-1));
			symbol_180.setIsOrdered(true);
			
			symbol_180.setIsResolveProxies(true);
			symbol_27.getOwnedAttributes().add(symbol_180);
		}
		{ // pivot.ecore::pivot::Constraint::context pivot|Constraint|context
			Property symbol_181 = PivotFactory.eINSTANCE.createProperty();
			symbol_181.setName("context");
			symbol_181.setType(symbol_56);  // pivot|NamedElement
			symbol_181.setLower(BigInteger.valueOf(0));
			
			symbol_181.setIsResolveProxies(true);
			symbol_27.getOwnedAttributes().add(symbol_181);
		}
		{ // pivot.ecore::pivot::Constraint::specification pivot|Constraint|specification
			Property symbol_182 = PivotFactory.eINSTANCE.createProperty();
			symbol_182.setName("specification");
			symbol_182.setType(symbol_106);  // pivot|ValueSpecification
			
			symbol_182.setIsComposite(true);
			symbol_182.setIsResolveProxies(true);
			symbol_27.getOwnedAttributes().add(symbol_182);
		}
		{ // pivot.ecore::pivot::Constraint::stereotype pivot|Constraint|stereotype
			Property symbol_183 = PivotFactory.eINSTANCE.createProperty();
			symbol_183.setName("stereotype");
			symbol_183.setType(symbol_86);  // pivot|String
			symbol_183.setLower(BigInteger.valueOf(0));
			
			symbol_183.setIsResolveProxies(true);
			symbol_27.getOwnedAttributes().add(symbol_183);
		}
		symbol_1.getOwnedTypes().add(symbol_27);
		//
		// pivot.ecore::pivot::DataType pivot|DataType
		//
		symbol_28.setName("DataType");
		symbol_28.getSuperClasses().add(symbol_13);
		{ // pivot.ecore::pivot::DataType::isSerializable pivot|DataType|isSerializable
			Property symbol_184 = PivotFactory.eINSTANCE.createProperty();
			symbol_184.setName("isSerializable");
			symbol_184.setType(symbol_8);  // pivot|Boolean
			
			symbol_184.setIsResolveProxies(true);
			symbol_28.getOwnedAttributes().add(symbol_184);
		}
		symbol_1.getOwnedTypes().add(symbol_28);
		//
		// pivot.ecore::pivot::Detail pivot|Detail
		//
		symbol_29.setName("Detail");
		symbol_29.getSuperClasses().add(symbol_56);
		{ // pivot.ecore::pivot::Detail::value pivot|Detail|value
			Property symbol_185 = PivotFactory.eINSTANCE.createProperty();
			symbol_185.setName("value");
			symbol_185.setType(symbol_86);  // pivot|String
			symbol_185.setUpper(BigInteger.valueOf(-1));
			
			symbol_185.setIsResolveProxies(true);
			symbol_29.getOwnedAttributes().add(symbol_185);
		}
		symbol_1.getOwnedTypes().add(symbol_29);
		//
		// pivot.ecore::pivot::Element pivot|Element
		//
		symbol_30.setName("Element");
		symbol_30.getSuperClasses().add(symbol_110);
		{ // pivot.ecore::pivot::Element::ownedComment pivot|Element|ownedComment
			Property symbol_186 = PivotFactory.eINSTANCE.createProperty();
			symbol_186.setName("ownedComment");
			symbol_186.setType(symbol_20);  // pivot|Comment
			symbol_186.setLower(BigInteger.valueOf(0));
			symbol_186.setUpper(BigInteger.valueOf(-1));
			
			symbol_186.setIsComposite(true);
			symbol_186.setIsResolveProxies(true);
			symbol_30.getOwnedAttributes().add(symbol_186);
		}
		symbol_1.getOwnedTypes().add(symbol_30);
		//
		// pivot.ecore::pivot::EnumLiteralExp pivot|EnumLiteralExp
		//
		symbol_31.setName("EnumLiteralExp");
		symbol_31.getSuperClasses().add(symbol_49);
		{ // pivot.ecore::pivot::EnumLiteralExp::referredEnumLiteral pivot|EnumLiteralExp|referredEnumLiteral
			Property symbol_187 = PivotFactory.eINSTANCE.createProperty();
			symbol_187.setName("referredEnumLiteral");
			symbol_187.setType(symbol_33);  // pivot|EnumerationLiteral
			symbol_187.setLower(BigInteger.valueOf(0));
			
			symbol_187.setIsResolveProxies(true);
			symbol_31.getOwnedAttributes().add(symbol_187);
		}
		symbol_1.getOwnedTypes().add(symbol_31);
		//
		// pivot.ecore::pivot::Enumeration pivot|Enumeration
		//
		symbol_32.setName("Enumeration");
		symbol_32.getSuperClasses().add(symbol_28);
		{ // pivot.ecore::pivot::Enumeration::ownedLiteral pivot|Enumeration|ownedLiteral
			Property symbol_188 = PivotFactory.eINSTANCE.createProperty();
			symbol_188.setName("ownedLiteral");
			symbol_188.setType(symbol_33);  // pivot|EnumerationLiteral
			symbol_188.setLower(BigInteger.valueOf(0));
			symbol_188.setUpper(BigInteger.valueOf(-1));
			symbol_188.setIsOrdered(true);
			
			symbol_188.setIsComposite(true);
			symbol_188.setIsResolveProxies(true);
			symbol_32.getOwnedAttributes().add(symbol_188);
		}
		symbol_1.getOwnedTypes().add(symbol_32);
		//
		// pivot.ecore::pivot::EnumerationLiteral pivot|EnumerationLiteral
		//
		symbol_33.setName("EnumerationLiteral");
		symbol_33.getSuperClasses().add(symbol_56);
		{ // pivot.ecore::pivot::EnumerationLiteral::enumeration pivot|EnumerationLiteral|enumeration
			Property symbol_189 = PivotFactory.eINSTANCE.createProperty();
			symbol_189.setName("enumeration");
			symbol_189.setType(symbol_32);  // pivot|Enumeration
			symbol_189.setLower(BigInteger.valueOf(0));
			
			symbol_189.setIsResolveProxies(true);
			symbol_33.getOwnedAttributes().add(symbol_189);
		}
		{ // pivot.ecore::pivot::EnumerationLiteral::value pivot|EnumerationLiteral|value
			Property symbol_190 = PivotFactory.eINSTANCE.createProperty();
			symbol_190.setName("value");
			symbol_190.setType(symbol_40);  // pivot|Integer
			symbol_190.setLower(BigInteger.valueOf(0));
			
			symbol_190.setIsResolveProxies(true);
			symbol_33.getOwnedAttributes().add(symbol_190);
		}
		symbol_1.getOwnedTypes().add(symbol_33);
		//
		// pivot.ecore::pivot::ExpressionInOcl pivot|ExpressionInOcl
		//
		symbol_34.setName("ExpressionInOcl");
		symbol_34.getSuperClasses().add(symbol_63);
		{ // pivot.ecore::pivot::ExpressionInOcl::bodyExpression pivot|ExpressionInOcl|bodyExpression
			Property symbol_191 = PivotFactory.eINSTANCE.createProperty();
			symbol_191.setName("bodyExpression");
			symbol_191.setType(symbol_62);  // pivot|OclExpression
			
			symbol_191.setIsComposite(true);
			symbol_191.setIsResolveProxies(true);
			symbol_34.getOwnedAttributes().add(symbol_191);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::contextVariable pivot|ExpressionInOcl|contextVariable
			Property symbol_192 = PivotFactory.eINSTANCE.createProperty();
			symbol_192.setName("contextVariable");
			symbol_192.setType(symbol_107);  // pivot|Variable
			symbol_192.setLower(BigInteger.valueOf(0));
			
			symbol_192.setIsComposite(true);
			symbol_192.setIsResolveProxies(true);
			symbol_34.getOwnedAttributes().add(symbol_192);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::parameterVariable pivot|ExpressionInOcl|parameterVariable
			Property symbol_193 = PivotFactory.eINSTANCE.createProperty();
			symbol_193.setName("parameterVariable");
			symbol_193.setType(symbol_107);  // pivot|Variable
			symbol_193.setLower(BigInteger.valueOf(0));
			symbol_193.setUpper(BigInteger.valueOf(-1));
			symbol_193.setIsOrdered(true);
			
			symbol_193.setIsComposite(true);
			symbol_193.setIsResolveProxies(true);
			symbol_34.getOwnedAttributes().add(symbol_193);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::resultVariable pivot|ExpressionInOcl|resultVariable
			Property symbol_194 = PivotFactory.eINSTANCE.createProperty();
			symbol_194.setName("resultVariable");
			symbol_194.setType(symbol_107);  // pivot|Variable
			symbol_194.setLower(BigInteger.valueOf(0));
			
			symbol_194.setIsComposite(true);
			symbol_194.setIsResolveProxies(true);
			symbol_34.getOwnedAttributes().add(symbol_194);
		}
		symbol_1.getOwnedTypes().add(symbol_34);
		//
		// pivot.ecore::pivot::Feature pivot|Feature
		//
		symbol_35.setName("Feature");
		symbol_35.getSuperClasses().add(symbol_56);
		symbol_35.getSuperClasses().add(symbol_102);
		{ // pivot.ecore::pivot::Feature::featuringClass pivot|Feature|featuringClass
			Property symbol_195 = PivotFactory.eINSTANCE.createProperty();
			symbol_195.setName("featuringClass");
			symbol_195.setType(symbol_13);  // pivot|Class
			symbol_195.setLower(BigInteger.valueOf(0));
			
			symbol_195.setIsDerived(true);
			symbol_195.setIsReadOnly(true);
			symbol_195.setIsTransient(true);
			symbol_195.setIsVolatile(true);
			symbol_35.getOwnedAttributes().add(symbol_195);
		}
		symbol_1.getOwnedTypes().add(symbol_35);
		//
		// pivot.ecore::pivot::FeatureCallExp pivot|FeatureCallExp
		//
		symbol_36.setName("FeatureCallExp");
		symbol_36.getSuperClasses().add(symbol_10);
		{ // pivot.ecore::pivot::FeatureCallExp::isPre pivot|FeatureCallExp|isPre
			Property symbol_196 = PivotFactory.eINSTANCE.createProperty();
			symbol_196.setName("isPre");
			symbol_196.setType(symbol_8);  // pivot|Boolean
			
			symbol_196.setIsResolveProxies(true);
			symbol_36.getOwnedAttributes().add(symbol_196);
		}
		symbol_1.getOwnedTypes().add(symbol_36);
		//
		// pivot.ecore::pivot::IfExp pivot|IfExp
		//
		symbol_37.setName("IfExp");
		symbol_37.getSuperClasses().add(symbol_62);
		{ // pivot.ecore::pivot::IfExp::condition pivot|IfExp|condition
			Property symbol_197 = PivotFactory.eINSTANCE.createProperty();
			symbol_197.setName("condition");
			symbol_197.setType(symbol_62);  // pivot|OclExpression
			
			symbol_197.setIsComposite(true);
			symbol_197.setIsResolveProxies(true);
			symbol_37.getOwnedAttributes().add(symbol_197);
		}
		{ // pivot.ecore::pivot::IfExp::elseExpression pivot|IfExp|elseExpression
			Property symbol_198 = PivotFactory.eINSTANCE.createProperty();
			symbol_198.setName("elseExpression");
			symbol_198.setType(symbol_62);  // pivot|OclExpression
			
			symbol_198.setIsComposite(true);
			symbol_198.setIsResolveProxies(true);
			symbol_37.getOwnedAttributes().add(symbol_198);
		}
		{ // pivot.ecore::pivot::IfExp::thenExpression pivot|IfExp|thenExpression
			Property symbol_199 = PivotFactory.eINSTANCE.createProperty();
			symbol_199.setName("thenExpression");
			symbol_199.setType(symbol_62);  // pivot|OclExpression
			
			symbol_199.setIsComposite(true);
			symbol_199.setIsResolveProxies(true);
			symbol_37.getOwnedAttributes().add(symbol_199);
		}
		symbol_1.getOwnedTypes().add(symbol_37);
		//
		// pivot.ecore::pivot::ImplementableElement pivot|ImplementableElement
		//
		symbol_38.setName("ImplementableElement");
		{ // pivot.ecore::pivot::ImplementableElement::implementation pivot|ImplementableElement|implementation
			Property symbol_200 = PivotFactory.eINSTANCE.createProperty();
			symbol_200.setName("implementation");
			symbol_200.setType(symbol_12);  // pivot|CallableImplementation
			symbol_200.setLower(BigInteger.valueOf(0));
			
			symbol_200.setIsResolveProxies(true);
			symbol_200.setIsTransient(true);
			symbol_38.getOwnedAttributes().add(symbol_200);
		}
		{ // pivot.ecore::pivot::ImplementableElement::implementationClass pivot|ImplementableElement|implementationClass
			Property symbol_201 = PivotFactory.eINSTANCE.createProperty();
			symbol_201.setName("implementationClass");
			symbol_201.setType(symbol_86);  // pivot|String
			symbol_201.setLower(BigInteger.valueOf(0));
			
			symbol_201.setIsResolveProxies(true);
			symbol_38.getOwnedAttributes().add(symbol_201);
		}
		symbol_1.getOwnedTypes().add(symbol_38);
		//
		// pivot.ecore::pivot::Int pivot|Int
		//
		symbol_39.setName("Int");
		symbol_1.getOwnedTypes().add(symbol_39);
		//
		// pivot.ecore::pivot::IntegerLiteralExp pivot|IntegerLiteralExp
		//
		symbol_41.setName("IntegerLiteralExp");
		symbol_41.getSuperClasses().add(symbol_60);
		{ // pivot.ecore::pivot::IntegerLiteralExp::integerSymbol pivot|IntegerLiteralExp|integerSymbol
			Property symbol_202 = PivotFactory.eINSTANCE.createProperty();
			symbol_202.setName("integerSymbol");
			symbol_202.setType(symbol_40);  // pivot|Integer
			
			symbol_202.setIsResolveProxies(true);
			symbol_41.getOwnedAttributes().add(symbol_202);
		}
		symbol_1.getOwnedTypes().add(symbol_41);
		//
		// pivot.ecore::pivot::InvalidLiteralExp pivot|InvalidLiteralExp
		//
		symbol_42.setName("InvalidLiteralExp");
		symbol_42.getSuperClasses().add(symbol_49);
		{ // pivot.ecore::pivot::InvalidLiteralExp::expression pivot|InvalidLiteralExp|expression
			Property symbol_203 = PivotFactory.eINSTANCE.createProperty();
			symbol_203.setName("expression");
			symbol_203.setType(symbol_62);  // pivot|OclExpression
			symbol_203.setLower(BigInteger.valueOf(0));
			
			symbol_203.setIsResolveProxies(true);
			symbol_42.getOwnedAttributes().add(symbol_203);
		}
		{ // pivot.ecore::pivot::InvalidLiteralExp::object pivot|InvalidLiteralExp|object
			Property symbol_204 = PivotFactory.eINSTANCE.createProperty();
			symbol_204.setName("object");
			symbol_204.setType(symbol_61);  // pivot|Object
			symbol_204.setLower(BigInteger.valueOf(0));
			
			symbol_204.setIsResolveProxies(true);
			symbol_42.getOwnedAttributes().add(symbol_204);
		}
		{ // pivot.ecore::pivot::InvalidLiteralExp::reason pivot|InvalidLiteralExp|reason
			Property symbol_205 = PivotFactory.eINSTANCE.createProperty();
			symbol_205.setName("reason");
			symbol_205.setType(symbol_86);  // pivot|String
			symbol_205.setLower(BigInteger.valueOf(0));
			
			symbol_205.setIsResolveProxies(true);
			symbol_42.getOwnedAttributes().add(symbol_205);
		}
		{ // pivot.ecore::pivot::InvalidLiteralExp::throwable pivot|InvalidLiteralExp|throwable
			Property symbol_206 = PivotFactory.eINSTANCE.createProperty();
			symbol_206.setName("throwable");
			symbol_206.setType(symbol_94);  // pivot|Throwable
			symbol_206.setLower(BigInteger.valueOf(0));
			
			symbol_206.setIsResolveProxies(true);
			symbol_42.getOwnedAttributes().add(symbol_206);
		}
		symbol_1.getOwnedTypes().add(symbol_42);
		//
		// pivot.ecore::pivot::InvalidType pivot|InvalidType
		//
		symbol_43.setName("InvalidType");
		symbol_43.getSuperClasses().add(symbol_13);
		symbol_1.getOwnedTypes().add(symbol_43);
		//
		// pivot.ecore::pivot::IterateExp pivot|IterateExp
		//
		symbol_44.setName("IterateExp");
		symbol_44.getSuperClasses().add(symbol_50);
		{ // pivot.ecore::pivot::IterateExp::result pivot|IterateExp|result
			Property symbol_207 = PivotFactory.eINSTANCE.createProperty();
			symbol_207.setName("result");
			symbol_207.setType(symbol_107);  // pivot|Variable
			symbol_207.setLower(BigInteger.valueOf(0));
			symbol_207.setIsOrdered(true);
			
			symbol_207.setIsComposite(true);
			symbol_207.setIsResolveProxies(true);
			symbol_44.getOwnedAttributes().add(symbol_207);
		}
		symbol_1.getOwnedTypes().add(symbol_44);
		//
		// pivot.ecore::pivot::Iteration pivot|Iteration
		//
		symbol_45.setName("Iteration");
		symbol_45.getSuperClasses().add(symbol_64);
		{ // pivot.ecore::pivot::Iteration::ownedAccumulator pivot|Iteration|ownedAccumulator
			Property symbol_208 = PivotFactory.eINSTANCE.createProperty();
			symbol_208.setName("ownedAccumulator");
			symbol_208.setType(symbol_70);  // pivot|Parameter
			symbol_208.setLower(BigInteger.valueOf(0));
			symbol_208.setUpper(BigInteger.valueOf(-1));
			
			symbol_208.setIsComposite(true);
			symbol_208.setIsResolveProxies(true);
			symbol_45.getOwnedAttributes().add(symbol_208);
		}
		{ // pivot.ecore::pivot::Iteration::ownedIterator pivot|Iteration|ownedIterator
			Property symbol_209 = PivotFactory.eINSTANCE.createProperty();
			symbol_209.setName("ownedIterator");
			symbol_209.setType(symbol_70);  // pivot|Parameter
			symbol_209.setLower(BigInteger.valueOf(0));
			symbol_209.setUpper(BigInteger.valueOf(-1));
			
			symbol_209.setIsComposite(true);
			symbol_209.setIsResolveProxies(true);
			symbol_45.getOwnedAttributes().add(symbol_209);
		}
		symbol_1.getOwnedTypes().add(symbol_45);
		//
		// pivot.ecore::pivot::IteratorExp pivot|IteratorExp
		//
		symbol_46.setName("IteratorExp");
		symbol_46.getSuperClasses().add(symbol_50);
		symbol_1.getOwnedTypes().add(symbol_46);
		//
		// pivot.ecore::pivot::LetExp pivot|LetExp
		//
		symbol_47.setName("LetExp");
		symbol_47.getSuperClasses().add(symbol_62);
		{ // pivot.ecore::pivot::LetExp::in pivot|LetExp|in
			Property symbol_210 = PivotFactory.eINSTANCE.createProperty();
			symbol_210.setName("in");
			symbol_210.setType(symbol_62);  // pivot|OclExpression
			
			symbol_210.setIsComposite(true);
			symbol_210.setIsResolveProxies(true);
			symbol_47.getOwnedAttributes().add(symbol_210);
		}
		{ // pivot.ecore::pivot::LetExp::variable pivot|LetExp|variable
			Property symbol_211 = PivotFactory.eINSTANCE.createProperty();
			symbol_211.setName("variable");
			symbol_211.setType(symbol_107);  // pivot|Variable
			
			symbol_211.setIsComposite(true);
			symbol_211.setIsResolveProxies(true);
			symbol_47.getOwnedAttributes().add(symbol_211);
		}
		symbol_1.getOwnedTypes().add(symbol_47);
		//
		// pivot.ecore::pivot::Library pivot|Library
		//
		symbol_48.setName("Library");
		symbol_48.getSuperClasses().add(symbol_68);
		symbol_1.getOwnedTypes().add(symbol_48);
		//
		// pivot.ecore::pivot::LiteralExp pivot|LiteralExp
		//
		symbol_49.setName("LiteralExp");
		symbol_49.getSuperClasses().add(symbol_62);
		symbol_1.getOwnedTypes().add(symbol_49);
		//
		// pivot.ecore::pivot::LoopExp pivot|LoopExp
		//
		symbol_50.setName("LoopExp");
		symbol_50.getSuperClasses().add(symbol_10);
		{ // pivot.ecore::pivot::LoopExp::body pivot|LoopExp|body
			Property symbol_212 = PivotFactory.eINSTANCE.createProperty();
			symbol_212.setName("body");
			symbol_212.setType(symbol_62);  // pivot|OclExpression
			
			symbol_212.setIsComposite(true);
			symbol_212.setIsResolveProxies(true);
			symbol_50.getOwnedAttributes().add(symbol_212);
		}
		{ // pivot.ecore::pivot::LoopExp::iterator pivot|LoopExp|iterator
			Property symbol_213 = PivotFactory.eINSTANCE.createProperty();
			symbol_213.setName("iterator");
			symbol_213.setType(symbol_107);  // pivot|Variable
			symbol_213.setLower(BigInteger.valueOf(0));
			symbol_213.setUpper(BigInteger.valueOf(-1));
			symbol_213.setIsOrdered(true);
			
			symbol_213.setIsComposite(true);
			symbol_213.setIsResolveProxies(true);
			symbol_50.getOwnedAttributes().add(symbol_213);
		}
		{ // pivot.ecore::pivot::LoopExp::referredIteration pivot|LoopExp|referredIteration
			Property symbol_214 = PivotFactory.eINSTANCE.createProperty();
			symbol_214.setName("referredIteration");
			symbol_214.setType(symbol_45);  // pivot|Iteration
			symbol_214.setLower(BigInteger.valueOf(0));
			
			symbol_214.setIsResolveProxies(true);
			symbol_50.getOwnedAttributes().add(symbol_214);
		}
		symbol_1.getOwnedTypes().add(symbol_50);
		//
		// pivot.ecore::pivot::MessageExp pivot|MessageExp
		//
		symbol_51.setName("MessageExp");
		symbol_51.getSuperClasses().add(symbol_62);
		{ // pivot.ecore::pivot::MessageExp::argument pivot|MessageExp|argument
			Property symbol_215 = PivotFactory.eINSTANCE.createProperty();
			symbol_215.setName("argument");
			symbol_215.setType(symbol_62);  // pivot|OclExpression
			symbol_215.setLower(BigInteger.valueOf(0));
			symbol_215.setUpper(BigInteger.valueOf(-1));
			
			symbol_215.setIsComposite(true);
			symbol_215.setIsResolveProxies(true);
			symbol_51.getOwnedAttributes().add(symbol_215);
		}
		{ // pivot.ecore::pivot::MessageExp::calledOperation pivot|MessageExp|calledOperation
			Property symbol_216 = PivotFactory.eINSTANCE.createProperty();
			symbol_216.setName("calledOperation");
			symbol_216.setType(symbol_11);  // pivot|CallOperationAction
			symbol_216.setLower(BigInteger.valueOf(0));
			
			symbol_216.setIsComposite(true);
			symbol_216.setIsResolveProxies(true);
			symbol_51.getOwnedAttributes().add(symbol_216);
		}
		{ // pivot.ecore::pivot::MessageExp::sentSignal pivot|MessageExp|sentSignal
			Property symbol_217 = PivotFactory.eINSTANCE.createProperty();
			symbol_217.setName("sentSignal");
			symbol_217.setType(symbol_80);  // pivot|SendSignalAction
			symbol_217.setLower(BigInteger.valueOf(0));
			
			symbol_217.setIsComposite(true);
			symbol_217.setIsResolveProxies(true);
			symbol_51.getOwnedAttributes().add(symbol_217);
		}
		{ // pivot.ecore::pivot::MessageExp::target pivot|MessageExp|target
			Property symbol_218 = PivotFactory.eINSTANCE.createProperty();
			symbol_218.setName("target");
			symbol_218.setType(symbol_62);  // pivot|OclExpression
			
			symbol_218.setIsComposite(true);
			symbol_218.setIsResolveProxies(true);
			symbol_51.getOwnedAttributes().add(symbol_218);
		}
		symbol_1.getOwnedTypes().add(symbol_51);
		//
		// pivot.ecore::pivot::MessageType pivot|MessageType
		//
		symbol_52.setName("MessageType");
		symbol_52.getSuperClasses().add(symbol_98);
		{ // pivot.ecore::pivot::MessageType::referredOperation pivot|MessageType|referredOperation
			Property symbol_219 = PivotFactory.eINSTANCE.createProperty();
			symbol_219.setName("referredOperation");
			symbol_219.setType(symbol_64);  // pivot|Operation
			symbol_219.setLower(BigInteger.valueOf(0));
			
			symbol_219.setIsResolveProxies(true);
			symbol_52.getOwnedAttributes().add(symbol_219);
		}
		{ // pivot.ecore::pivot::MessageType::referredSignal pivot|MessageType|referredSignal
			Property symbol_220 = PivotFactory.eINSTANCE.createProperty();
			symbol_220.setName("referredSignal");
			symbol_220.setType(symbol_83);  // pivot|Signal
			symbol_220.setLower(BigInteger.valueOf(0));
			
			symbol_220.setIsResolveProxies(true);
			symbol_52.getOwnedAttributes().add(symbol_220);
		}
		symbol_1.getOwnedTypes().add(symbol_52);
		//
		// pivot.ecore::pivot::MonikeredElement pivot|MonikeredElement
		//
		symbol_53.setName("MonikeredElement");
		symbol_53.getSuperClasses().add(symbol_30);
		{ // pivot.ecore::pivot::MonikeredElement::moniker pivot|MonikeredElement|moniker
			Property symbol_221 = PivotFactory.eINSTANCE.createProperty();
			symbol_221.setName("moniker");
			symbol_221.setType(symbol_86);  // pivot|String
			
			symbol_221.setIsDerived(true);
			symbol_221.setIsResolveProxies(true);
			symbol_221.setIsTransient(true);
			symbol_221.setIsVolatile(true);
			symbol_53.getOwnedAttributes().add(symbol_221);
		}
		{	// pivot.ecore::pivot::MonikeredElement::hasMoniker() pivot|MonikeredElement|hasMoniker()
			Operation symbol_222 = PivotFactory.eINSTANCE.createOperation();
			symbol_222.setName("hasMoniker");
			symbol_222.setType(symbol_8);  // pivot|Boolean
			
			symbol_53.getOwnedOperations().add(symbol_222);
		}
		symbol_1.getOwnedTypes().add(symbol_53);
		//
		// pivot.ecore::pivot::MultiplicityElement pivot|MultiplicityElement
		//
		symbol_54.setName("MultiplicityElement");
		symbol_54.getSuperClasses().add(symbol_53);
		{ // pivot.ecore::pivot::MultiplicityElement::isOrdered pivot|MultiplicityElement|isOrdered
			Property symbol_223 = PivotFactory.eINSTANCE.createProperty();
			symbol_223.setName("isOrdered");
			symbol_223.setType(symbol_8);  // pivot|Boolean
			
			symbol_223.setIsResolveProxies(true);
			symbol_54.getOwnedAttributes().add(symbol_223);
		}
		{ // pivot.ecore::pivot::MultiplicityElement::isUnique pivot|MultiplicityElement|isUnique
			Property symbol_224 = PivotFactory.eINSTANCE.createProperty();
			symbol_224.setName("isUnique");
			symbol_224.setType(symbol_8);  // pivot|Boolean
			
			symbol_224.setIsResolveProxies(true);
			symbol_54.getOwnedAttributes().add(symbol_224);
		}
		{ // pivot.ecore::pivot::MultiplicityElement::lower pivot|MultiplicityElement|lower
			Property symbol_225 = PivotFactory.eINSTANCE.createProperty();
			symbol_225.setName("lower");
			symbol_225.setType(symbol_40);  // pivot|Integer
			symbol_225.setLower(BigInteger.valueOf(0));
			
			symbol_225.setIsResolveProxies(true);
			symbol_54.getOwnedAttributes().add(symbol_225);
		}
		{ // pivot.ecore::pivot::MultiplicityElement::upper pivot|MultiplicityElement|upper
			Property symbol_226 = PivotFactory.eINSTANCE.createProperty();
			symbol_226.setName("upper");
			symbol_226.setType(symbol_103);  // pivot|UnlimitedNatural
			symbol_226.setLower(BigInteger.valueOf(0));
			
			symbol_226.setIsResolveProxies(true);
			symbol_54.getOwnedAttributes().add(symbol_226);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::includesCardinality() pivot|MultiplicityElement|includesCardinality(pivot|Integer)
			Operation symbol_227 = PivotFactory.eINSTANCE.createOperation();
			symbol_227.setName("includesCardinality");
			symbol_227.setType(symbol_8);  // pivot|Boolean
			
			Parameter symbol_228 = PivotFactory.eINSTANCE.createParameter();
			symbol_228.setName("C");
			symbol_228.setType(symbol_40);  // pivot|Integer
			
			symbol_227.getOwnedParameters().add(symbol_228);
			symbol_54.getOwnedOperations().add(symbol_227);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::includesMultiplicity() pivot|MultiplicityElement|includesMultiplicity(pivot|MultiplicityElement)
			Operation symbol_229 = PivotFactory.eINSTANCE.createOperation();
			symbol_229.setName("includesMultiplicity");
			symbol_229.setType(symbol_8);  // pivot|Boolean
			
			Parameter symbol_230 = PivotFactory.eINSTANCE.createParameter();
			symbol_230.setName("M");
			symbol_230.setType(symbol_54);  // pivot|MultiplicityElement
			
			symbol_229.getOwnedParameters().add(symbol_230);
			symbol_54.getOwnedOperations().add(symbol_229);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::isMultivalued() pivot|MultiplicityElement|isMultivalued()
			Operation symbol_231 = PivotFactory.eINSTANCE.createOperation();
			symbol_231.setName("isMultivalued");
			symbol_231.setType(symbol_8);  // pivot|Boolean
			
			symbol_54.getOwnedOperations().add(symbol_231);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::lowerBound() pivot|MultiplicityElement|lowerBound()
			Operation symbol_232 = PivotFactory.eINSTANCE.createOperation();
			symbol_232.setName("lowerBound");
			symbol_232.setType(symbol_40);  // pivot|Integer
			
			symbol_54.getOwnedOperations().add(symbol_232);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::upperBound() pivot|MultiplicityElement|upperBound()
			Operation symbol_233 = PivotFactory.eINSTANCE.createOperation();
			symbol_233.setName("upperBound");
			symbol_233.setType(symbol_103);  // pivot|UnlimitedNatural
			
			symbol_54.getOwnedOperations().add(symbol_233);
		}
		symbol_1.getOwnedTypes().add(symbol_54);
		//
		// pivot.ecore::pivot::Nameable pivot|Nameable
		//
		symbol_55.setName("Nameable");
		symbol_1.getOwnedTypes().add(symbol_55);
		//
		// pivot.ecore::pivot::NamedElement pivot|NamedElement
		//
		symbol_56.setName("NamedElement");
		symbol_56.getSuperClasses().add(symbol_53);
		symbol_56.getSuperClasses().add(symbol_55);
		{ // pivot.ecore::pivot::NamedElement::isStatic pivot|NamedElement|isStatic
			Property symbol_234 = PivotFactory.eINSTANCE.createProperty();
			symbol_234.setName("isStatic");
			symbol_234.setType(symbol_8);  // pivot|Boolean
			
			symbol_234.setIsResolveProxies(true);
			symbol_56.getOwnedAttributes().add(symbol_234);
		}
		{ // pivot.ecore::pivot::NamedElement::name pivot|NamedElement|name
			Property symbol_235 = PivotFactory.eINSTANCE.createProperty();
			symbol_235.setName("name");
			symbol_235.setType(symbol_86);  // pivot|String
			symbol_235.setLower(BigInteger.valueOf(0));
			
			symbol_235.setIsResolveProxies(true);
			symbol_56.getOwnedAttributes().add(symbol_235);
		}
		{ // pivot.ecore::pivot::NamedElement::ownedAnnotation pivot|NamedElement|ownedAnnotation
			Property symbol_236 = PivotFactory.eINSTANCE.createProperty();
			symbol_236.setName("ownedAnnotation");
			symbol_236.setType(symbol_2);  // pivot|Annotation
			symbol_236.setLower(BigInteger.valueOf(0));
			symbol_236.setUpper(BigInteger.valueOf(-1));
			symbol_236.setIsOrdered(true);
			
			symbol_236.setIsComposite(true);
			symbol_236.setIsResolveProxies(true);
			symbol_56.getOwnedAttributes().add(symbol_236);
		}
		{ // pivot.ecore::pivot::NamedElement::ownedRule pivot|NamedElement|ownedRule
			Property symbol_237 = PivotFactory.eINSTANCE.createProperty();
			symbol_237.setName("ownedRule");
			symbol_237.setType(symbol_27);  // pivot|Constraint
			symbol_237.setLower(BigInteger.valueOf(0));
			symbol_237.setUpper(BigInteger.valueOf(-1));
			
			symbol_237.setIsComposite(true);
			symbol_237.setIsResolveProxies(true);
			symbol_56.getOwnedAttributes().add(symbol_237);
		}
		symbol_1.getOwnedTypes().add(symbol_56);
		//
		// pivot.ecore::pivot::Namespace pivot|Namespace
		//
		symbol_57.setName("Namespace");
		symbol_57.getSuperClasses().add(symbol_56);
		symbol_1.getOwnedTypes().add(symbol_57);
		//
		// pivot.ecore::pivot::NavigationCallExp pivot|NavigationCallExp
		//
		symbol_58.setName("NavigationCallExp");
		symbol_58.getSuperClasses().add(symbol_36);
		{ // pivot.ecore::pivot::NavigationCallExp::navigationSource pivot|NavigationCallExp|navigationSource
			Property symbol_238 = PivotFactory.eINSTANCE.createProperty();
			symbol_238.setName("navigationSource");
			symbol_238.setType(symbol_76);  // pivot|Property
			symbol_238.setLower(BigInteger.valueOf(0));
			symbol_238.setIsOrdered(true);
			
			symbol_238.setIsResolveProxies(true);
			symbol_58.getOwnedAttributes().add(symbol_238);
		}
		{ // pivot.ecore::pivot::NavigationCallExp::qualifier pivot|NavigationCallExp|qualifier
			Property symbol_239 = PivotFactory.eINSTANCE.createProperty();
			symbol_239.setName("qualifier");
			symbol_239.setType(symbol_62);  // pivot|OclExpression
			symbol_239.setLower(BigInteger.valueOf(0));
			symbol_239.setUpper(BigInteger.valueOf(-1));
			symbol_239.setIsOrdered(true);
			
			symbol_239.setIsResolveProxies(true);
			symbol_58.getOwnedAttributes().add(symbol_239);
		}
		symbol_1.getOwnedTypes().add(symbol_58);
		//
		// pivot.ecore::pivot::NullLiteralExp pivot|NullLiteralExp
		//
		symbol_59.setName("NullLiteralExp");
		symbol_59.getSuperClasses().add(symbol_74);
		symbol_1.getOwnedTypes().add(symbol_59);
		//
		// pivot.ecore::pivot::NumericLiteralExp pivot|NumericLiteralExp
		//
		symbol_60.setName("NumericLiteralExp");
		symbol_60.getSuperClasses().add(symbol_74);
		symbol_1.getOwnedTypes().add(symbol_60);
		//
		// pivot.ecore::pivot::Object pivot|Object
		//
		symbol_61.setName("Object");
		symbol_1.getOwnedTypes().add(symbol_61);
		//
		// pivot.ecore::pivot::OclExpression pivot|OclExpression
		//
		symbol_62.setName("OclExpression");
		symbol_62.getSuperClasses().add(symbol_101);
		symbol_1.getOwnedTypes().add(symbol_62);
		//
		// pivot.ecore::pivot::OpaqueExpression pivot|OpaqueExpression
		//
		symbol_63.setName("OpaqueExpression");
		symbol_63.getSuperClasses().add(symbol_106);
		{ // pivot.ecore::pivot::OpaqueExpression::body pivot|OpaqueExpression|body
			Property symbol_240 = PivotFactory.eINSTANCE.createProperty();
			symbol_240.setName("body");
			symbol_240.setType(symbol_86);  // pivot|String
			symbol_240.setLower(BigInteger.valueOf(0));
			symbol_240.setUpper(BigInteger.valueOf(-1));
			symbol_240.setIsOrdered(true);
			symbol_240.setIsUnique(false);
			
			symbol_240.setIsResolveProxies(true);
			symbol_63.getOwnedAttributes().add(symbol_240);
		}
		{ // pivot.ecore::pivot::OpaqueExpression::language pivot|OpaqueExpression|language
			Property symbol_241 = PivotFactory.eINSTANCE.createProperty();
			symbol_241.setName("language");
			symbol_241.setType(symbol_86);  // pivot|String
			symbol_241.setLower(BigInteger.valueOf(0));
			symbol_241.setUpper(BigInteger.valueOf(-1));
			symbol_241.setIsOrdered(true);
			
			symbol_241.setIsResolveProxies(true);
			symbol_63.getOwnedAttributes().add(symbol_241);
		}
		symbol_1.getOwnedTypes().add(symbol_63);
		//
		// pivot.ecore::pivot::Operation pivot|Operation
		//
		symbol_64.setName("Operation");
		symbol_64.getSuperClasses().add(symbol_38);
		symbol_64.getSuperClasses().add(symbol_35);
		symbol_64.getSuperClasses().add(symbol_93);
		symbol_64.getSuperClasses().add(symbol_57);
		symbol_64.getSuperClasses().add(symbol_71);
		symbol_64.getSuperClasses().add(symbol_54);
		symbol_64.getSuperClasses().add(symbol_101);
		{ // pivot.ecore::pivot::Operation::class pivot|Operation|class
			Property symbol_242 = PivotFactory.eINSTANCE.createProperty();
			symbol_242.setName("class");
			symbol_242.setType(symbol_13);  // pivot|Class
			symbol_242.setLower(BigInteger.valueOf(0));
			
			symbol_242.setIsResolveProxies(true);
			symbol_64.getOwnedAttributes().add(symbol_242);
		}
		{ // pivot.ecore::pivot::Operation::ownedParameter pivot|Operation|ownedParameter
			Property symbol_243 = PivotFactory.eINSTANCE.createProperty();
			symbol_243.setName("ownedParameter");
			symbol_243.setType(symbol_70);  // pivot|Parameter
			symbol_243.setLower(BigInteger.valueOf(0));
			symbol_243.setUpper(BigInteger.valueOf(-1));
			symbol_243.setIsOrdered(true);
			
			symbol_243.setIsComposite(true);
			symbol_243.setIsResolveProxies(true);
			symbol_64.getOwnedAttributes().add(symbol_243);
		}
		{ // pivot.ecore::pivot::Operation::precedence pivot|Operation|precedence
			Property symbol_244 = PivotFactory.eINSTANCE.createProperty();
			symbol_244.setName("precedence");
			symbol_244.setType(symbol_73);  // pivot|Precedence
			symbol_244.setLower(BigInteger.valueOf(0));
			
			symbol_244.setIsResolveProxies(true);
			symbol_64.getOwnedAttributes().add(symbol_244);
		}
		{ // pivot.ecore::pivot::Operation::raisedException pivot|Operation|raisedException
			Property symbol_245 = PivotFactory.eINSTANCE.createProperty();
			symbol_245.setName("raisedException");
			symbol_245.setType(symbol_98);  // pivot|Type
			symbol_245.setLower(BigInteger.valueOf(0));
			symbol_245.setUpper(BigInteger.valueOf(-1));
			
			symbol_245.setIsResolveProxies(true);
			symbol_64.getOwnedAttributes().add(symbol_245);
		}
		symbol_1.getOwnedTypes().add(symbol_64);
		//
		// pivot.ecore::pivot::OperationCallExp pivot|OperationCallExp
		//
		symbol_65.setName("OperationCallExp");
		symbol_65.getSuperClasses().add(symbol_36);
		{ // pivot.ecore::pivot::OperationCallExp::argument pivot|OperationCallExp|argument
			Property symbol_246 = PivotFactory.eINSTANCE.createProperty();
			symbol_246.setName("argument");
			symbol_246.setType(symbol_62);  // pivot|OclExpression
			symbol_246.setLower(BigInteger.valueOf(0));
			symbol_246.setUpper(BigInteger.valueOf(-1));
			symbol_246.setIsOrdered(true);
			
			symbol_246.setIsComposite(true);
			symbol_246.setIsResolveProxies(true);
			symbol_65.getOwnedAttributes().add(symbol_246);
		}
		{ // pivot.ecore::pivot::OperationCallExp::referredOperation pivot|OperationCallExp|referredOperation
			Property symbol_247 = PivotFactory.eINSTANCE.createProperty();
			symbol_247.setName("referredOperation");
			symbol_247.setType(symbol_64);  // pivot|Operation
			symbol_247.setLower(BigInteger.valueOf(0));
			
			symbol_247.setIsResolveProxies(true);
			symbol_65.getOwnedAttributes().add(symbol_247);
		}
		symbol_1.getOwnedTypes().add(symbol_65);
		//
		// pivot.ecore::pivot::OperationTemplateParameter pivot|OperationTemplateParameter
		//
		symbol_66.setName("OperationTemplateParameter");
		symbol_66.getSuperClasses().add(symbol_89);
		symbol_1.getOwnedTypes().add(symbol_66);
		//
		// pivot.ecore::pivot::OrderedSetType pivot|OrderedSetType
		//
		symbol_67.setName("OrderedSetType");
		symbol_67.getSuperClasses().add(symbol_19);
		symbol_1.getOwnedTypes().add(symbol_67);
		//
		// pivot.ecore::pivot::Package pivot|Package
		//
		symbol_68.setName("Package");
		symbol_68.getSuperClasses().add(symbol_93);
		symbol_68.getSuperClasses().add(symbol_57);
		{ // pivot.ecore::pivot::Package::nestedPackage pivot|Package|nestedPackage
			Property symbol_248 = PivotFactory.eINSTANCE.createProperty();
			symbol_248.setName("nestedPackage");
			symbol_248.setType(symbol_68);  // pivot|Package
			symbol_248.setLower(BigInteger.valueOf(0));
			symbol_248.setUpper(BigInteger.valueOf(-1));
			
			symbol_248.setIsComposite(true);
			symbol_248.setIsResolveProxies(true);
			symbol_68.getOwnedAttributes().add(symbol_248);
		}
		{ // pivot.ecore::pivot::Package::nestingPackage pivot|Package|nestingPackage
			Property symbol_249 = PivotFactory.eINSTANCE.createProperty();
			symbol_249.setName("nestingPackage");
			symbol_249.setType(symbol_68);  // pivot|Package
			symbol_249.setLower(BigInteger.valueOf(0));
			
			symbol_249.setIsResolveProxies(true);
			symbol_68.getOwnedAttributes().add(symbol_249);
		}
		{ // pivot.ecore::pivot::Package::nsPrefix pivot|Package|nsPrefix
			Property symbol_250 = PivotFactory.eINSTANCE.createProperty();
			symbol_250.setName("nsPrefix");
			symbol_250.setType(symbol_86);  // pivot|String
			symbol_250.setLower(BigInteger.valueOf(0));
			
			symbol_250.setIsResolveProxies(true);
			symbol_68.getOwnedAttributes().add(symbol_250);
		}
		{ // pivot.ecore::pivot::Package::nsURI pivot|Package|nsURI
			Property symbol_251 = PivotFactory.eINSTANCE.createProperty();
			symbol_251.setName("nsURI");
			symbol_251.setType(symbol_86);  // pivot|String
			symbol_251.setLower(BigInteger.valueOf(0));
			
			symbol_251.setIsResolveProxies(true);
			symbol_68.getOwnedAttributes().add(symbol_251);
		}
		{ // pivot.ecore::pivot::Package::ownedPrecedence pivot|Package|ownedPrecedence
			Property symbol_252 = PivotFactory.eINSTANCE.createProperty();
			symbol_252.setName("ownedPrecedence");
			symbol_252.setType(symbol_73);  // pivot|Precedence
			symbol_252.setLower(BigInteger.valueOf(0));
			symbol_252.setUpper(BigInteger.valueOf(-1));
			
			symbol_252.setIsComposite(true);
			symbol_252.setIsResolveProxies(true);
			symbol_68.getOwnedAttributes().add(symbol_252);
		}
		{ // pivot.ecore::pivot::Package::ownedType pivot|Package|ownedType
			Property symbol_253 = PivotFactory.eINSTANCE.createProperty();
			symbol_253.setName("ownedType");
			symbol_253.setType(symbol_98);  // pivot|Type
			symbol_253.setLower(BigInteger.valueOf(0));
			symbol_253.setUpper(BigInteger.valueOf(-1));
			
			symbol_253.setIsComposite(true);
			symbol_253.setIsResolveProxies(true);
			symbol_68.getOwnedAttributes().add(symbol_253);
		}
		symbol_1.getOwnedTypes().add(symbol_68);
		//
		// pivot.ecore::pivot::PackageableElement pivot|PackageableElement
		//
		symbol_69.setName("PackageableElement");
		symbol_69.getSuperClasses().add(symbol_71);
		symbol_1.getOwnedTypes().add(symbol_69);
		//
		// pivot.ecore::pivot::Parameter pivot|Parameter
		//
		symbol_70.setName("Parameter");
		symbol_70.getSuperClasses().add(symbol_108);
		symbol_70.getSuperClasses().add(symbol_102);
		{ // pivot.ecore::pivot::Parameter::operation pivot|Parameter|operation
			Property symbol_254 = PivotFactory.eINSTANCE.createProperty();
			symbol_254.setName("operation");
			symbol_254.setType(symbol_64);  // pivot|Operation
			symbol_254.setLower(BigInteger.valueOf(0));
			
			symbol_254.setIsResolveProxies(true);
			symbol_70.getOwnedAttributes().add(symbol_254);
		}
		symbol_1.getOwnedTypes().add(symbol_70);
		//
		// pivot.ecore::pivot::ParameterableElement pivot|ParameterableElement
		//
		symbol_71.setName("ParameterableElement");
		symbol_71.getSuperClasses().add(symbol_53);
		{ // pivot.ecore::pivot::ParameterableElement::owningTemplateParameter pivot|ParameterableElement|owningTemplateParameter
			Property symbol_255 = PivotFactory.eINSTANCE.createProperty();
			symbol_255.setName("owningTemplateParameter");
			symbol_255.setType(symbol_89);  // pivot|TemplateParameter
			symbol_255.setLower(BigInteger.valueOf(0));
			
			symbol_255.setIsResolveProxies(true);
			symbol_71.getOwnedAttributes().add(symbol_255);
		}
		{ // pivot.ecore::pivot::ParameterableElement::templateParameter pivot|ParameterableElement|templateParameter
			Property symbol_256 = PivotFactory.eINSTANCE.createProperty();
			symbol_256.setName("templateParameter");
			symbol_256.setType(symbol_89);  // pivot|TemplateParameter
			symbol_256.setLower(BigInteger.valueOf(0));
			
			symbol_256.setIsResolveProxies(true);
			symbol_71.getOwnedAttributes().add(symbol_256);
		}
		{	// pivot.ecore::pivot::ParameterableElement::isTemplateParameter() pivot|ParameterableElement|isTemplateParameter()
			Operation symbol_257 = PivotFactory.eINSTANCE.createOperation();
			symbol_257.setName("isTemplateParameter");
			symbol_257.setType(symbol_8);  // pivot|Boolean
			
			symbol_71.getOwnedOperations().add(symbol_257);
		}
		symbol_1.getOwnedTypes().add(symbol_71);
		//
		// pivot.ecore::pivot::Pivotable pivot|Pivotable
		//
		symbol_72.setName("Pivotable");
		symbol_1.getOwnedTypes().add(symbol_72);
		//
		// pivot.ecore::pivot::Precedence pivot|Precedence
		//
		symbol_73.setName("Precedence");
		symbol_73.getSuperClasses().add(symbol_56);
		{ // pivot.ecore::pivot::Precedence::associativity pivot|Precedence|associativity
			Property symbol_258 = PivotFactory.eINSTANCE.createProperty();
			symbol_258.setName("associativity");
			symbol_258.setType(symbol_6);  // pivot|AssociativityKind
			symbol_258.setLower(BigInteger.valueOf(0));
			
			symbol_258.setIsResolveProxies(true);
			symbol_73.getOwnedAttributes().add(symbol_258);
		}
		{ // pivot.ecore::pivot::Precedence::order pivot|Precedence|order
			Property symbol_259 = PivotFactory.eINSTANCE.createProperty();
			symbol_259.setName("order");
			symbol_259.setType(symbol_40);  // pivot|Integer
			
			symbol_259.setIsDerived(true);
			symbol_259.setIsResolveProxies(true);
			symbol_259.setIsVolatile(true);
			symbol_73.getOwnedAttributes().add(symbol_259);
		}
		symbol_1.getOwnedTypes().add(symbol_73);
		//
		// pivot.ecore::pivot::PrimitiveLiteralExp pivot|PrimitiveLiteralExp
		//
		symbol_74.setName("PrimitiveLiteralExp");
		symbol_74.getSuperClasses().add(symbol_49);
		symbol_1.getOwnedTypes().add(symbol_74);
		//
		// pivot.ecore::pivot::PrimitiveType pivot|PrimitiveType
		//
		symbol_75.setName("PrimitiveType");
		symbol_75.getSuperClasses().add(symbol_28);
		symbol_1.getOwnedTypes().add(symbol_75);
		//
		// pivot.ecore::pivot::Property pivot|Property
		//
		symbol_76.setName("Property");
		symbol_76.getSuperClasses().add(symbol_38);
		symbol_76.getSuperClasses().add(symbol_35);
		symbol_76.getSuperClasses().add(symbol_71);
		symbol_76.getSuperClasses().add(symbol_54);
		symbol_76.getSuperClasses().add(symbol_101);
		{ // pivot.ecore::pivot::Property::association pivot|Property|association
			Property symbol_260 = PivotFactory.eINSTANCE.createProperty();
			symbol_260.setName("association");
			symbol_260.setType(symbol_4);  // pivot|AssociationClass
			symbol_260.setLower(BigInteger.valueOf(0));
			
			symbol_260.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_260);
		}
		{ // pivot.ecore::pivot::Property::class pivot|Property|class
			Property symbol_261 = PivotFactory.eINSTANCE.createProperty();
			symbol_261.setName("class");
			symbol_261.setType(symbol_13);  // pivot|Class
			symbol_261.setLower(BigInteger.valueOf(0));
			
			symbol_261.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_261);
		}
		{ // pivot.ecore::pivot::Property::default pivot|Property|default
			Property symbol_262 = PivotFactory.eINSTANCE.createProperty();
			symbol_262.setName("default");
			symbol_262.setType(symbol_86);  // pivot|String
			symbol_262.setLower(BigInteger.valueOf(0));
			
			symbol_262.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_262);
		}
		{ // pivot.ecore::pivot::Property::isComposite pivot|Property|isComposite
			Property symbol_263 = PivotFactory.eINSTANCE.createProperty();
			symbol_263.setName("isComposite");
			symbol_263.setType(symbol_8);  // pivot|Boolean
			
			symbol_263.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_263);
		}
		{ // pivot.ecore::pivot::Property::isDerived pivot|Property|isDerived
			Property symbol_264 = PivotFactory.eINSTANCE.createProperty();
			symbol_264.setName("isDerived");
			symbol_264.setType(symbol_8);  // pivot|Boolean
			
			symbol_264.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_264);
		}
		{ // pivot.ecore::pivot::Property::isID pivot|Property|isID
			Property symbol_265 = PivotFactory.eINSTANCE.createProperty();
			symbol_265.setName("isID");
			symbol_265.setType(symbol_8);  // pivot|Boolean
			
			symbol_265.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_265);
		}
		{ // pivot.ecore::pivot::Property::isReadOnly pivot|Property|isReadOnly
			Property symbol_266 = PivotFactory.eINSTANCE.createProperty();
			symbol_266.setName("isReadOnly");
			symbol_266.setType(symbol_8);  // pivot|Boolean
			
			symbol_266.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_266);
		}
		{ // pivot.ecore::pivot::Property::isResolveProxies pivot|Property|isResolveProxies
			Property symbol_267 = PivotFactory.eINSTANCE.createProperty();
			symbol_267.setName("isResolveProxies");
			symbol_267.setType(symbol_8);  // pivot|Boolean
			
			symbol_267.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_267);
		}
		{ // pivot.ecore::pivot::Property::isTransient pivot|Property|isTransient
			Property symbol_268 = PivotFactory.eINSTANCE.createProperty();
			symbol_268.setName("isTransient");
			symbol_268.setType(symbol_8);  // pivot|Boolean
			
			symbol_268.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_268);
		}
		{ // pivot.ecore::pivot::Property::isUnsettable pivot|Property|isUnsettable
			Property symbol_269 = PivotFactory.eINSTANCE.createProperty();
			symbol_269.setName("isUnsettable");
			symbol_269.setType(symbol_8);  // pivot|Boolean
			
			symbol_269.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_269);
		}
		{ // pivot.ecore::pivot::Property::isVolatile pivot|Property|isVolatile
			Property symbol_270 = PivotFactory.eINSTANCE.createProperty();
			symbol_270.setName("isVolatile");
			symbol_270.setType(symbol_8);  // pivot|Boolean
			
			symbol_270.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_270);
		}
		{ // pivot.ecore::pivot::Property::keys pivot|Property|keys
			Property symbol_271 = PivotFactory.eINSTANCE.createProperty();
			symbol_271.setName("keys");
			symbol_271.setType(symbol_76);  // pivot|Property
			symbol_271.setLower(BigInteger.valueOf(0));
			symbol_271.setUpper(BigInteger.valueOf(-1));
			
			symbol_271.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_271);
		}
		{ // pivot.ecore::pivot::Property::opposite pivot|Property|opposite
			Property symbol_272 = PivotFactory.eINSTANCE.createProperty();
			symbol_272.setName("opposite");
			symbol_272.setType(symbol_76);  // pivot|Property
			symbol_272.setLower(BigInteger.valueOf(0));
			
			symbol_272.setIsResolveProxies(true);
			symbol_76.getOwnedAttributes().add(symbol_272);
		}
		symbol_1.getOwnedTypes().add(symbol_76);
		//
		// pivot.ecore::pivot::PropertyCallExp pivot|PropertyCallExp
		//
		symbol_77.setName("PropertyCallExp");
		symbol_77.getSuperClasses().add(symbol_58);
		{ // pivot.ecore::pivot::PropertyCallExp::referredProperty pivot|PropertyCallExp|referredProperty
			Property symbol_273 = PivotFactory.eINSTANCE.createProperty();
			symbol_273.setName("referredProperty");
			symbol_273.setType(symbol_76);  // pivot|Property
			symbol_273.setLower(BigInteger.valueOf(0));
			
			symbol_273.setIsResolveProxies(true);
			symbol_77.getOwnedAttributes().add(symbol_273);
		}
		symbol_1.getOwnedTypes().add(symbol_77);
		//
		// pivot.ecore::pivot::RealLiteralExp pivot|RealLiteralExp
		//
		symbol_79.setName("RealLiteralExp");
		symbol_79.getSuperClasses().add(symbol_60);
		{ // pivot.ecore::pivot::RealLiteralExp::realSymbol pivot|RealLiteralExp|realSymbol
			Property symbol_274 = PivotFactory.eINSTANCE.createProperty();
			symbol_274.setName("realSymbol");
			symbol_274.setType(symbol_78);  // pivot|Real
			
			symbol_274.setIsResolveProxies(true);
			symbol_79.getOwnedAttributes().add(symbol_274);
		}
		symbol_1.getOwnedTypes().add(symbol_79);
		//
		// pivot.ecore::pivot::SendSignalAction pivot|SendSignalAction
		//
		symbol_80.setName("SendSignalAction");
		symbol_80.getSuperClasses().add(symbol_56);
		{ // pivot.ecore::pivot::SendSignalAction::signal pivot|SendSignalAction|signal
			Property symbol_275 = PivotFactory.eINSTANCE.createProperty();
			symbol_275.setName("signal");
			symbol_275.setType(symbol_83);  // pivot|Signal
			
			symbol_275.setIsResolveProxies(true);
			symbol_80.getOwnedAttributes().add(symbol_275);
		}
		symbol_1.getOwnedTypes().add(symbol_80);
		//
		// pivot.ecore::pivot::SequenceType pivot|SequenceType
		//
		symbol_81.setName("SequenceType");
		symbol_81.getSuperClasses().add(symbol_19);
		symbol_1.getOwnedTypes().add(symbol_81);
		//
		// pivot.ecore::pivot::SetType pivot|SetType
		//
		symbol_82.setName("SetType");
		symbol_82.getSuperClasses().add(symbol_19);
		symbol_1.getOwnedTypes().add(symbol_82);
		//
		// pivot.ecore::pivot::Signal pivot|Signal
		//
		symbol_83.setName("Signal");
		symbol_83.getSuperClasses().add(symbol_56);
		symbol_1.getOwnedTypes().add(symbol_83);
		//
		// pivot.ecore::pivot::State pivot|State
		//
		symbol_84.setName("State");
		symbol_84.getSuperClasses().add(symbol_56);
		symbol_1.getOwnedTypes().add(symbol_84);
		//
		// pivot.ecore::pivot::StateExp pivot|StateExp
		//
		symbol_85.setName("StateExp");
		symbol_85.getSuperClasses().add(symbol_62);
		{ // pivot.ecore::pivot::StateExp::referredState pivot|StateExp|referredState
			Property symbol_276 = PivotFactory.eINSTANCE.createProperty();
			symbol_276.setName("referredState");
			symbol_276.setType(symbol_84);  // pivot|State
			symbol_276.setLower(BigInteger.valueOf(0));
			
			symbol_276.setIsResolveProxies(true);
			symbol_85.getOwnedAttributes().add(symbol_276);
		}
		symbol_1.getOwnedTypes().add(symbol_85);
		//
		// pivot.ecore::pivot::StringLiteralExp pivot|StringLiteralExp
		//
		symbol_87.setName("StringLiteralExp");
		symbol_87.getSuperClasses().add(symbol_74);
		{ // pivot.ecore::pivot::StringLiteralExp::stringSymbol pivot|StringLiteralExp|stringSymbol
			Property symbol_277 = PivotFactory.eINSTANCE.createProperty();
			symbol_277.setName("stringSymbol");
			symbol_277.setType(symbol_86);  // pivot|String
			
			symbol_277.setIsResolveProxies(true);
			symbol_87.getOwnedAttributes().add(symbol_277);
		}
		symbol_1.getOwnedTypes().add(symbol_87);
		//
		// pivot.ecore::pivot::TemplateBinding pivot|TemplateBinding
		//
		symbol_88.setName("TemplateBinding");
		symbol_88.getSuperClasses().add(symbol_30);
		{ // pivot.ecore::pivot::TemplateBinding::boundElement pivot|TemplateBinding|boundElement
			Property symbol_278 = PivotFactory.eINSTANCE.createProperty();
			symbol_278.setName("boundElement");
			symbol_278.setType(symbol_93);  // pivot|TemplateableElement
			
			symbol_278.setIsResolveProxies(true);
			symbol_88.getOwnedAttributes().add(symbol_278);
		}
		{ // pivot.ecore::pivot::TemplateBinding::parameterSubstitution pivot|TemplateBinding|parameterSubstitution
			Property symbol_279 = PivotFactory.eINSTANCE.createProperty();
			symbol_279.setName("parameterSubstitution");
			symbol_279.setType(symbol_90);  // pivot|TemplateParameterSubstitution
			symbol_279.setLower(BigInteger.valueOf(0));
			symbol_279.setUpper(BigInteger.valueOf(-1));
			
			symbol_279.setIsComposite(true);
			symbol_279.setIsResolveProxies(true);
			symbol_88.getOwnedAttributes().add(symbol_279);
		}
		{ // pivot.ecore::pivot::TemplateBinding::signature pivot|TemplateBinding|signature
			Property symbol_280 = PivotFactory.eINSTANCE.createProperty();
			symbol_280.setName("signature");
			symbol_280.setType(symbol_92);  // pivot|TemplateSignature
			
			symbol_280.setIsResolveProxies(true);
			symbol_88.getOwnedAttributes().add(symbol_280);
		}
		symbol_1.getOwnedTypes().add(symbol_88);
		//
		// pivot.ecore::pivot::TemplateParameter pivot|TemplateParameter
		//
		symbol_89.setName("TemplateParameter");
		symbol_89.getSuperClasses().add(symbol_30);
		{ // pivot.ecore::pivot::TemplateParameter::default pivot|TemplateParameter|default
			Property symbol_281 = PivotFactory.eINSTANCE.createProperty();
			symbol_281.setName("default");
			symbol_281.setType(symbol_71);  // pivot|ParameterableElement
			symbol_281.setLower(BigInteger.valueOf(0));
			
			symbol_281.setIsResolveProxies(true);
			symbol_89.getOwnedAttributes().add(symbol_281);
		}
		{ // pivot.ecore::pivot::TemplateParameter::ownedDefault pivot|TemplateParameter|ownedDefault
			Property symbol_282 = PivotFactory.eINSTANCE.createProperty();
			symbol_282.setName("ownedDefault");
			symbol_282.setType(symbol_71);  // pivot|ParameterableElement
			symbol_282.setLower(BigInteger.valueOf(0));
			
			symbol_282.setIsComposite(true);
			symbol_282.setIsResolveProxies(true);
			symbol_89.getOwnedAttributes().add(symbol_282);
		}
		{ // pivot.ecore::pivot::TemplateParameter::ownedParameteredElement pivot|TemplateParameter|ownedParameteredElement
			Property symbol_283 = PivotFactory.eINSTANCE.createProperty();
			symbol_283.setName("ownedParameteredElement");
			symbol_283.setType(symbol_71);  // pivot|ParameterableElement
			symbol_283.setLower(BigInteger.valueOf(0));
			
			symbol_283.setIsComposite(true);
			symbol_283.setIsResolveProxies(true);
			symbol_89.getOwnedAttributes().add(symbol_283);
		}
		{ // pivot.ecore::pivot::TemplateParameter::parameteredElement pivot|TemplateParameter|parameteredElement
			Property symbol_284 = PivotFactory.eINSTANCE.createProperty();
			symbol_284.setName("parameteredElement");
			symbol_284.setType(symbol_71);  // pivot|ParameterableElement
			
			symbol_284.setIsResolveProxies(true);
			symbol_89.getOwnedAttributes().add(symbol_284);
		}
		{ // pivot.ecore::pivot::TemplateParameter::signature pivot|TemplateParameter|signature
			Property symbol_285 = PivotFactory.eINSTANCE.createProperty();
			symbol_285.setName("signature");
			symbol_285.setType(symbol_92);  // pivot|TemplateSignature
			
			symbol_285.setIsResolveProxies(true);
			symbol_89.getOwnedAttributes().add(symbol_285);
		}
		symbol_1.getOwnedTypes().add(symbol_89);
		//
		// pivot.ecore::pivot::TemplateParameterSubstitution pivot|TemplateParameterSubstitution
		//
		symbol_90.setName("TemplateParameterSubstitution");
		symbol_90.getSuperClasses().add(symbol_30);
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::actual pivot|TemplateParameterSubstitution|actual
			Property symbol_286 = PivotFactory.eINSTANCE.createProperty();
			symbol_286.setName("actual");
			symbol_286.setType(symbol_71);  // pivot|ParameterableElement
			
			symbol_286.setIsResolveProxies(true);
			symbol_90.getOwnedAttributes().add(symbol_286);
		}
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::formal pivot|TemplateParameterSubstitution|formal
			Property symbol_287 = PivotFactory.eINSTANCE.createProperty();
			symbol_287.setName("formal");
			symbol_287.setType(symbol_89);  // pivot|TemplateParameter
			
			symbol_287.setIsResolveProxies(true);
			symbol_90.getOwnedAttributes().add(symbol_287);
		}
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::ownedActual pivot|TemplateParameterSubstitution|ownedActual
			Property symbol_288 = PivotFactory.eINSTANCE.createProperty();
			symbol_288.setName("ownedActual");
			symbol_288.setType(symbol_71);  // pivot|ParameterableElement
			symbol_288.setLower(BigInteger.valueOf(0));
			
			symbol_288.setIsComposite(true);
			symbol_288.setIsResolveProxies(true);
			symbol_90.getOwnedAttributes().add(symbol_288);
		}
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::templateBinding pivot|TemplateParameterSubstitution|templateBinding
			Property symbol_289 = PivotFactory.eINSTANCE.createProperty();
			symbol_289.setName("templateBinding");
			symbol_289.setType(symbol_88);  // pivot|TemplateBinding
			
			symbol_289.setIsResolveProxies(true);
			symbol_90.getOwnedAttributes().add(symbol_289);
		}
		symbol_1.getOwnedTypes().add(symbol_90);
		//
		// pivot.ecore::pivot::TemplateParameterType pivot|TemplateParameterType
		//
		symbol_91.setName("TemplateParameterType");
		symbol_91.getSuperClasses().add(symbol_98);
		{ // pivot.ecore::pivot::TemplateParameterType::specification pivot|TemplateParameterType|specification
			Property symbol_290 = PivotFactory.eINSTANCE.createProperty();
			symbol_290.setName("specification");
			symbol_290.setType(symbol_86);  // pivot|String
			symbol_290.setLower(BigInteger.valueOf(0));
			
			symbol_290.setIsResolveProxies(true);
			symbol_91.getOwnedAttributes().add(symbol_290);
		}
		symbol_1.getOwnedTypes().add(symbol_91);
		//
		// pivot.ecore::pivot::TemplateSignature pivot|TemplateSignature
		//
		symbol_92.setName("TemplateSignature");
		symbol_92.getSuperClasses().add(symbol_53);
		{ // pivot.ecore::pivot::TemplateSignature::ownedParameter pivot|TemplateSignature|ownedParameter
			Property symbol_291 = PivotFactory.eINSTANCE.createProperty();
			symbol_291.setName("ownedParameter");
			symbol_291.setType(symbol_89);  // pivot|TemplateParameter
			symbol_291.setLower(BigInteger.valueOf(0));
			symbol_291.setUpper(BigInteger.valueOf(-1));
			symbol_291.setIsOrdered(true);
			
			symbol_291.setIsComposite(true);
			symbol_291.setIsResolveProxies(true);
			symbol_92.getOwnedAttributes().add(symbol_291);
		}
		{ // pivot.ecore::pivot::TemplateSignature::parameter pivot|TemplateSignature|parameter
			Property symbol_292 = PivotFactory.eINSTANCE.createProperty();
			symbol_292.setName("parameter");
			symbol_292.setType(symbol_89);  // pivot|TemplateParameter
			symbol_292.setUpper(BigInteger.valueOf(-1));
			symbol_292.setIsOrdered(true);
			
			symbol_292.setIsResolveProxies(true);
			symbol_92.getOwnedAttributes().add(symbol_292);
		}
		{ // pivot.ecore::pivot::TemplateSignature::template pivot|TemplateSignature|template
			Property symbol_293 = PivotFactory.eINSTANCE.createProperty();
			symbol_293.setName("template");
			symbol_293.setType(symbol_93);  // pivot|TemplateableElement
			
			symbol_293.setIsResolveProxies(true);
			symbol_92.getOwnedAttributes().add(symbol_293);
		}
		symbol_1.getOwnedTypes().add(symbol_92);
		//
		// pivot.ecore::pivot::TemplateableElement pivot|TemplateableElement
		//
		symbol_93.setName("TemplateableElement");
		symbol_93.getSuperClasses().add(symbol_53);
		{ // pivot.ecore::pivot::TemplateableElement::ownedTemplateSignature pivot|TemplateableElement|ownedTemplateSignature
			Property symbol_294 = PivotFactory.eINSTANCE.createProperty();
			symbol_294.setName("ownedTemplateSignature");
			symbol_294.setType(symbol_92);  // pivot|TemplateSignature
			symbol_294.setLower(BigInteger.valueOf(0));
			
			symbol_294.setIsComposite(true);
			symbol_294.setIsResolveProxies(true);
			symbol_93.getOwnedAttributes().add(symbol_294);
		}
		{ // pivot.ecore::pivot::TemplateableElement::templateBinding pivot|TemplateableElement|templateBinding
			Property symbol_295 = PivotFactory.eINSTANCE.createProperty();
			symbol_295.setName("templateBinding");
			symbol_295.setType(symbol_88);  // pivot|TemplateBinding
			symbol_295.setLower(BigInteger.valueOf(0));
			symbol_295.setUpper(BigInteger.valueOf(-1));
			
			symbol_295.setIsComposite(true);
			symbol_295.setIsResolveProxies(true);
			symbol_93.getOwnedAttributes().add(symbol_295);
		}
		{	// pivot.ecore::pivot::TemplateableElement::isTemplate() pivot|TemplateableElement|isTemplate()
			Operation symbol_296 = PivotFactory.eINSTANCE.createOperation();
			symbol_296.setName("isTemplate");
			symbol_296.setType(symbol_8);  // pivot|Boolean
			
			symbol_93.getOwnedOperations().add(symbol_296);
		}
		{	// pivot.ecore::pivot::TemplateableElement::parameterableElements() pivot|TemplateableElement|parameterableElements()
			Operation symbol_297 = PivotFactory.eINSTANCE.createOperation();
			symbol_297.setName("parameterableElements");
			symbol_297.setType(symbol_71);  // pivot|ParameterableElement
			symbol_297.setLower(BigInteger.valueOf(0));
			symbol_297.setUpper(BigInteger.valueOf(-1));
			
			symbol_93.getOwnedOperations().add(symbol_297);
		}
		symbol_1.getOwnedTypes().add(symbol_93);
		//
		// pivot.ecore::pivot::Throwable pivot|Throwable
		//
		symbol_94.setName("Throwable");
		symbol_1.getOwnedTypes().add(symbol_94);
		//
		// pivot.ecore::pivot::TupleLiteralExp pivot|TupleLiteralExp
		//
		symbol_95.setName("TupleLiteralExp");
		symbol_95.getSuperClasses().add(symbol_49);
		{ // pivot.ecore::pivot::TupleLiteralExp::part pivot|TupleLiteralExp|part
			Property symbol_298 = PivotFactory.eINSTANCE.createProperty();
			symbol_298.setName("part");
			symbol_298.setType(symbol_96);  // pivot|TupleLiteralPart
			symbol_298.setLower(BigInteger.valueOf(0));
			symbol_298.setUpper(BigInteger.valueOf(-1));
			symbol_298.setIsOrdered(true);
			
			symbol_298.setIsComposite(true);
			symbol_298.setIsResolveProxies(true);
			symbol_95.getOwnedAttributes().add(symbol_298);
		}
		symbol_1.getOwnedTypes().add(symbol_95);
		//
		// pivot.ecore::pivot::TupleLiteralPart pivot|TupleLiteralPart
		//
		symbol_96.setName("TupleLiteralPart");
		symbol_96.getSuperClasses().add(symbol_108);
		{ // pivot.ecore::pivot::TupleLiteralPart::initExpression pivot|TupleLiteralPart|initExpression
			Property symbol_299 = PivotFactory.eINSTANCE.createProperty();
			symbol_299.setName("initExpression");
			symbol_299.setType(symbol_62);  // pivot|OclExpression
			symbol_299.setLower(BigInteger.valueOf(0));
			
			symbol_299.setIsComposite(true);
			symbol_299.setIsResolveProxies(true);
			symbol_96.getOwnedAttributes().add(symbol_299);
		}
		symbol_1.getOwnedTypes().add(symbol_96);
		//
		// pivot.ecore::pivot::TupleType pivot|TupleType
		//
		symbol_97.setName("TupleType");
		symbol_97.getSuperClasses().add(symbol_28);
		symbol_1.getOwnedTypes().add(symbol_97);
		//
		// pivot.ecore::pivot::Type pivot|Type
		//
		symbol_98.setName("Type");
		symbol_98.getSuperClasses().add(symbol_56);
		symbol_98.getSuperClasses().add(symbol_93);
		symbol_98.getSuperClasses().add(symbol_71);
		{ // pivot.ecore::pivot::Type::instanceClassName pivot|Type|instanceClassName
			Property symbol_300 = PivotFactory.eINSTANCE.createProperty();
			symbol_300.setName("instanceClassName");
			symbol_300.setType(symbol_86);  // pivot|String
			symbol_300.setLower(BigInteger.valueOf(0));
			
			symbol_300.setIsResolveProxies(true);
			symbol_98.getOwnedAttributes().add(symbol_300);
		}
		{ // pivot.ecore::pivot::Type::package pivot|Type|package
			Property symbol_301 = PivotFactory.eINSTANCE.createProperty();
			symbol_301.setName("package");
			symbol_301.setType(symbol_68);  // pivot|Package
			symbol_301.setLower(BigInteger.valueOf(0));
			
			symbol_301.setIsResolveProxies(true);
			symbol_98.getOwnedAttributes().add(symbol_301);
		}
		symbol_1.getOwnedTypes().add(symbol_98);
		//
		// pivot.ecore::pivot::TypeExp pivot|TypeExp
		//
		symbol_99.setName("TypeExp");
		symbol_99.getSuperClasses().add(symbol_62);
		{ // pivot.ecore::pivot::TypeExp::referredType pivot|TypeExp|referredType
			Property symbol_302 = PivotFactory.eINSTANCE.createProperty();
			symbol_302.setName("referredType");
			symbol_302.setType(symbol_98);  // pivot|Type
			symbol_302.setLower(BigInteger.valueOf(0));
			
			symbol_302.setIsResolveProxies(true);
			symbol_99.getOwnedAttributes().add(symbol_302);
		}
		symbol_1.getOwnedTypes().add(symbol_99);
		//
		// pivot.ecore::pivot::TypeTemplateParameter pivot|TypeTemplateParameter
		//
		symbol_100.setName("TypeTemplateParameter");
		symbol_100.getSuperClasses().add(symbol_89);
		{ // pivot.ecore::pivot::TypeTemplateParameter::allowSubstitutable pivot|TypeTemplateParameter|allowSubstitutable
			Property symbol_303 = PivotFactory.eINSTANCE.createProperty();
			symbol_303.setName("allowSubstitutable");
			symbol_303.setType(symbol_8);  // pivot|Boolean
			
			symbol_303.setIsResolveProxies(true);
			symbol_100.getOwnedAttributes().add(symbol_303);
		}
		{ // pivot.ecore::pivot::TypeTemplateParameter::constrainingType pivot|TypeTemplateParameter|constrainingType
			Property symbol_304 = PivotFactory.eINSTANCE.createProperty();
			symbol_304.setName("constrainingType");
			symbol_304.setType(symbol_98);  // pivot|Type
			symbol_304.setLower(BigInteger.valueOf(0));
			symbol_304.setUpper(BigInteger.valueOf(-1));
			
			symbol_304.setIsResolveProxies(true);
			symbol_100.getOwnedAttributes().add(symbol_304);
		}
		symbol_1.getOwnedTypes().add(symbol_100);
		//
		// pivot.ecore::pivot::TypedElement pivot|TypedElement
		//
		symbol_101.setName("TypedElement");
		symbol_101.getSuperClasses().add(symbol_56);
		{ // pivot.ecore::pivot::TypedElement::type pivot|TypedElement|type
			Property symbol_305 = PivotFactory.eINSTANCE.createProperty();
			symbol_305.setName("type");
			symbol_305.setType(symbol_98);  // pivot|Type
			symbol_305.setLower(BigInteger.valueOf(0));
			
			symbol_305.setIsResolveProxies(true);
			symbol_101.getOwnedAttributes().add(symbol_305);
		}
		symbol_1.getOwnedTypes().add(symbol_101);
		//
		// pivot.ecore::pivot::TypedMultiplicityElement pivot|TypedMultiplicityElement
		//
		symbol_102.setName("TypedMultiplicityElement");
		symbol_102.getSuperClasses().add(symbol_54);
		symbol_102.getSuperClasses().add(symbol_101);
		symbol_1.getOwnedTypes().add(symbol_102);
		//
		// pivot.ecore::pivot::UnlimitedNaturalLiteralExp pivot|UnlimitedNaturalLiteralExp
		//
		symbol_104.setName("UnlimitedNaturalLiteralExp");
		symbol_104.getSuperClasses().add(symbol_60);
		{ // pivot.ecore::pivot::UnlimitedNaturalLiteralExp::unlimitedNaturalSymbol pivot|UnlimitedNaturalLiteralExp|unlimitedNaturalSymbol
			Property symbol_306 = PivotFactory.eINSTANCE.createProperty();
			symbol_306.setName("unlimitedNaturalSymbol");
			symbol_306.setType(symbol_103);  // pivot|UnlimitedNatural
			
			symbol_306.setIsResolveProxies(true);
			symbol_104.getOwnedAttributes().add(symbol_306);
		}
		symbol_1.getOwnedTypes().add(symbol_104);
		//
		// pivot.ecore::pivot::UnspecifiedValueExp pivot|UnspecifiedValueExp
		//
		symbol_105.setName("UnspecifiedValueExp");
		symbol_105.getSuperClasses().add(symbol_62);
		symbol_1.getOwnedTypes().add(symbol_105);
		//
		// pivot.ecore::pivot::ValueSpecification pivot|ValueSpecification
		//
		symbol_106.setName("ValueSpecification");
		symbol_106.getSuperClasses().add(symbol_71);
		symbol_106.getSuperClasses().add(symbol_101);
		{	// pivot.ecore::pivot::ValueSpecification::booleanValue() pivot|ValueSpecification|booleanValue()
			Operation symbol_307 = PivotFactory.eINSTANCE.createOperation();
			symbol_307.setName("booleanValue");
			symbol_307.setType(symbol_8);  // pivot|Boolean
			
			symbol_106.getOwnedOperations().add(symbol_307);
		}
		{	// pivot.ecore::pivot::ValueSpecification::integerValue() pivot|ValueSpecification|integerValue()
			Operation symbol_308 = PivotFactory.eINSTANCE.createOperation();
			symbol_308.setName("integerValue");
			symbol_308.setType(symbol_40);  // pivot|Integer
			
			symbol_106.getOwnedOperations().add(symbol_308);
		}
		{	// pivot.ecore::pivot::ValueSpecification::isComputable() pivot|ValueSpecification|isComputable()
			Operation symbol_309 = PivotFactory.eINSTANCE.createOperation();
			symbol_309.setName("isComputable");
			symbol_309.setType(symbol_8);  // pivot|Boolean
			
			symbol_106.getOwnedOperations().add(symbol_309);
		}
		{	// pivot.ecore::pivot::ValueSpecification::isNull() pivot|ValueSpecification|isNull()
			Operation symbol_310 = PivotFactory.eINSTANCE.createOperation();
			symbol_310.setName("isNull");
			symbol_310.setType(symbol_8);  // pivot|Boolean
			
			symbol_106.getOwnedOperations().add(symbol_310);
		}
		{	// pivot.ecore::pivot::ValueSpecification::stringValue() pivot|ValueSpecification|stringValue()
			Operation symbol_311 = PivotFactory.eINSTANCE.createOperation();
			symbol_311.setName("stringValue");
			symbol_311.setType(symbol_86);  // pivot|String
			
			symbol_106.getOwnedOperations().add(symbol_311);
		}
		{	// pivot.ecore::pivot::ValueSpecification::unlimitedValue() pivot|ValueSpecification|unlimitedValue()
			Operation symbol_312 = PivotFactory.eINSTANCE.createOperation();
			symbol_312.setName("unlimitedValue");
			symbol_312.setType(symbol_103);  // pivot|UnlimitedNatural
			
			symbol_106.getOwnedOperations().add(symbol_312);
		}
		symbol_1.getOwnedTypes().add(symbol_106);
		//
		// pivot.ecore::pivot::Variable pivot|Variable
		//
		symbol_107.setName("Variable");
		symbol_107.getSuperClasses().add(symbol_108);
		{ // pivot.ecore::pivot::Variable::implicit pivot|Variable|implicit
			Property symbol_313 = PivotFactory.eINSTANCE.createProperty();
			symbol_313.setName("implicit");
			symbol_313.setType(symbol_8);  // pivot|Boolean
			symbol_313.setLower(BigInteger.valueOf(0));
			
			symbol_313.setIsResolveProxies(true);
			symbol_107.getOwnedAttributes().add(symbol_313);
		}
		{ // pivot.ecore::pivot::Variable::initExpression pivot|Variable|initExpression
			Property symbol_314 = PivotFactory.eINSTANCE.createProperty();
			symbol_314.setName("initExpression");
			symbol_314.setType(symbol_62);  // pivot|OclExpression
			symbol_314.setLower(BigInteger.valueOf(0));
			
			symbol_314.setIsComposite(true);
			symbol_314.setIsResolveProxies(true);
			symbol_107.getOwnedAttributes().add(symbol_314);
		}
		{ // pivot.ecore::pivot::Variable::representedParameter pivot|Variable|representedParameter
			Property symbol_315 = PivotFactory.eINSTANCE.createProperty();
			symbol_315.setName("representedParameter");
			symbol_315.setType(symbol_70);  // pivot|Parameter
			symbol_315.setLower(BigInteger.valueOf(0));
			
			symbol_315.setIsResolveProxies(true);
			symbol_107.getOwnedAttributes().add(symbol_315);
		}
		symbol_1.getOwnedTypes().add(symbol_107);
		//
		// pivot.ecore::pivot::VariableDeclaration pivot|VariableDeclaration
		//
		symbol_108.setName("VariableDeclaration");
		symbol_108.getSuperClasses().add(symbol_101);
		symbol_1.getOwnedTypes().add(symbol_108);
		//
		// pivot.ecore::pivot::VariableExp pivot|VariableExp
		//
		symbol_109.setName("VariableExp");
		symbol_109.getSuperClasses().add(symbol_62);
		{ // pivot.ecore::pivot::VariableExp::implicit pivot|VariableExp|implicit
			Property symbol_316 = PivotFactory.eINSTANCE.createProperty();
			symbol_316.setName("implicit");
			symbol_316.setType(symbol_8);  // pivot|Boolean
			symbol_316.setLower(BigInteger.valueOf(0));
			
			symbol_316.setIsResolveProxies(true);
			symbol_109.getOwnedAttributes().add(symbol_316);
		}
		{ // pivot.ecore::pivot::VariableExp::referredVariable pivot|VariableExp|referredVariable
			Property symbol_317 = PivotFactory.eINSTANCE.createProperty();
			symbol_317.setName("referredVariable");
			symbol_317.setType(symbol_108);  // pivot|VariableDeclaration
			symbol_317.setLower(BigInteger.valueOf(0));
			
			symbol_317.setIsResolveProxies(true);
			symbol_109.getOwnedAttributes().add(symbol_317);
		}
		symbol_1.getOwnedTypes().add(symbol_109);
		//
		// pivot.ecore::pivot::Visitable pivot|Visitable
		//
		symbol_110.setName("Visitable");
		symbol_1.getOwnedTypes().add(symbol_110);
		//
		// pivot.ecore::pivot::Visitor pivot|Visitor{R,C}
		//
		symbol_111.setName("Visitor");
		symbol_114.setName("R");
		symbol_113.setOwnedParameteredElement(symbol_114);
		symbol_112.getOwnedParameters().add(symbol_113);
		symbol_116.setName("C");
		symbol_115.setOwnedParameteredElement(symbol_116);
		symbol_112.getOwnedParameters().add(symbol_115);
		
		symbol_111.setOwnedTemplateSignature(symbol_112);
		symbol_1.getOwnedTypes().add(symbol_111);
		//
		// pivot.ecore::pivot::VoidType pivot|VoidType
		//
		symbol_117.setName("VoidType");
		symbol_117.getSuperClasses().add(symbol_13);
		symbol_1.getOwnedTypes().add(symbol_117);

		Class elementClass = (Class) PivotUtil.getNamedElement(symbol_1.getOwnedTypes(), "Element");
		elementClass.getSuperClasses().clear();
		elementClass.getSuperClasses().add(standardLibrary.getClassifierType());
		
		return symbol_1;
	}
}
