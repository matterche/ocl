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
 * $Id$
 */
package	org.eclipse.ocl.examples.pivot.model;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.ocl.examples.pivot.*;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.manager.PivotStandardLibrary;
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
	 *	The URI of this Standard Library.
	 */
	public static final String PIVOT_URI = "http://www.eclipse.org/ocl/3.1.0/Pivot";

	public OclMetaModel(PivotStandardLibrary standardLibrary, String name, String nsURI) {
		super(URI.createURI(PIVOT_URI));
		Package metaModel = create(standardLibrary);
		getContents().add(metaModel);
		if (name != null) {
			metaModel.setName(name);
		}
		if (nsURI != null) {
			metaModel.setNsURI(nsURI);
		}
	}
	
	/**
	 *	Create and return a pivot model of the Pivot Model.
	 */
	public static Package create(PivotStandardLibrary standardLibrary)
	{
		Package symbol_0 = PivotFactory.eINSTANCE.createPackage(); // http://www.eclipse.org/ocl/3.1.0/Pivot
		Class symbol_1 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
		Property symbol_2 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!NamedElement // pivot.ecore::pivot::Annotation::NamedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!NamedElement
		Property symbol_3 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!ownedContent // pivot.ecore::pivot::Annotation::ownedContent http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!ownedContent
		Property symbol_4 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!ownedDetail // pivot.ecore::pivot::Annotation::ownedDetail http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!ownedDetail
		Property symbol_5 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!reference // pivot.ecore::pivot::Annotation::reference http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!reference
		
		Class symbol_6 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AnyType
		
		Class symbol_7 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
		Property symbol_8 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass!AssociationClassCallExp // pivot.ecore::pivot::AssociationClass::AssociationClassCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass!AssociationClassCallExp
		Property symbol_9 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass!unownedAttribute // pivot.ecore::pivot::AssociationClass::unownedAttribute http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass!unownedAttribute
		
		Class symbol_10 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
		Property symbol_11 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp!referredAssociationClass // pivot.ecore::pivot::AssociationClassCallExp::referredAssociationClass http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp!referredAssociationClass
		
		Enumeration symbol_12 = PivotFactory.eINSTANCE.createEnumeration(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
		
		Class symbol_13 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!BagType
		
		PrimitiveType symbol_14 = standardLibrary.getBooleanType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
		Class symbol_15 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp
		Property symbol_16 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp!booleanSymbol // pivot.ecore::pivot::BooleanLiteralExp::booleanSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp!booleanSymbol
		
		Class symbol_17 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		Property symbol_18 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp!implicit // pivot.ecore::pivot::CallExp::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp!implicit
		Property symbol_19 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp!source // pivot.ecore::pivot::CallExp::source http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp!source
		
		Class symbol_20 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
		Property symbol_21 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction!MessageExp // pivot.ecore::pivot::CallOperationAction::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction!MessageExp
		Property symbol_22 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction!operation // pivot.ecore::pivot::CallOperationAction::operation http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction!operation
		
		Class symbol_23 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		Property symbol_24 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class!isAbstract // pivot.ecore::pivot::Class::isAbstract http://www.eclipse.org/ocl/3.1.0/Pivot!Class!isAbstract
		Property symbol_25 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class!isInterface // pivot.ecore::pivot::Class::isInterface http://www.eclipse.org/ocl/3.1.0/Pivot!Class!isInterface
		
		Class symbol_26 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
		Property symbol_27 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType!instanceType // pivot.ecore::pivot::ClassifierType::instanceType http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType!instanceType
		
		Class symbol_28 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
		Property symbol_29 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem!item // pivot.ecore::pivot::CollectionItem::item http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem!item
		
		Enumeration symbol_30 = PivotFactory.eINSTANCE.createEnumeration(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
		
		Class symbol_31 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp
		Property symbol_32 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp!kind // pivot.ecore::pivot::CollectionLiteralExp::kind http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp!kind
		Property symbol_33 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp!part // pivot.ecore::pivot::CollectionLiteralExp::part http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp!part
		
		Class symbol_34 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		Property symbol_35 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart!CollectionLiteralExp // pivot.ecore::pivot::CollectionLiteralPart::CollectionLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart!CollectionLiteralExp
		
		Class symbol_36 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
		Property symbol_37 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange!first // pivot.ecore::pivot::CollectionRange::first http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange!first
		Property symbol_38 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange!last // pivot.ecore::pivot::CollectionRange::last http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange!last
		
		Class symbol_39 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		Property symbol_40 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType!elementType // pivot.ecore::pivot::CollectionType::elementType http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType!elementType
		
		Class symbol_41 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
		Property symbol_42 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!Element // pivot.ecore::pivot::Comment::Element http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!Element
		Property symbol_43 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!annotatedElement // pivot.ecore::pivot::Comment::annotatedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!annotatedElement
		Property symbol_44 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!body // pivot.ecore::pivot::Comment::body http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!body
		
		Class symbol_45 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
		Property symbol_46 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!NamedElement // pivot.ecore::pivot::Constraint::NamedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!NamedElement
		Property symbol_47 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!constrainedElement // pivot.ecore::pivot::Constraint::constrainedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!constrainedElement
		Property symbol_48 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!context // pivot.ecore::pivot::Constraint::context http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!context
		Property symbol_49 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!isCallable // pivot.ecore::pivot::Constraint::isCallable http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!isCallable
		Property symbol_50 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!specification // pivot.ecore::pivot::Constraint::specification http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!specification
		Property symbol_51 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!stereotype // pivot.ecore::pivot::Constraint::stereotype http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!stereotype
		
		Class symbol_52 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		Property symbol_53 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!behavioralType // pivot.ecore::pivot::DataType::behavioralType http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!behavioralType
		Property symbol_54 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!isSerializable // pivot.ecore::pivot::DataType::isSerializable http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!isSerializable
		
		Class symbol_55 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
		Property symbol_56 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!Annotation // pivot.ecore::pivot::Detail::Annotation http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!Annotation
		Property symbol_57 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!value // pivot.ecore::pivot::Detail::value http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!value
		
		Class symbol_58 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		Property symbol_59 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Annotation // pivot.ecore::pivot::Element::Annotation http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Annotation
		Property symbol_60 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Comment // pivot.ecore::pivot::Element::Comment http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Comment
		Property symbol_61 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Constraint // pivot.ecore::pivot::Element::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Constraint
		Property symbol_62 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!ownedComment // pivot.ecore::pivot::Element::ownedComment http://www.eclipse.org/ocl/3.1.0/Pivot!Element!ownedComment
		
		Class symbol_63 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
		Property symbol_64 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp!referredEnumLiteral // pivot.ecore::pivot::EnumLiteralExp::referredEnumLiteral http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp!referredEnumLiteral
		
		Class symbol_65 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
		Property symbol_66 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration!ownedLiteral // pivot.ecore::pivot::Enumeration::ownedLiteral http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration!ownedLiteral
		
		Class symbol_67 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
		Property symbol_68 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!EnumLiteralExp // pivot.ecore::pivot::EnumerationLiteral::EnumLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!EnumLiteralExp
		Property symbol_69 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!enumeration // pivot.ecore::pivot::EnumerationLiteral::enumeration http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!enumeration
		Property symbol_70 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!value // pivot.ecore::pivot::EnumerationLiteral::value http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!value
		
		Class symbol_71 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
		Property symbol_72 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!bodyExpression // pivot.ecore::pivot::ExpressionInOcl::bodyExpression http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!bodyExpression
		Property symbol_73 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!contextVariable // pivot.ecore::pivot::ExpressionInOcl::contextVariable http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!contextVariable
		Property symbol_74 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!messageExpression // pivot.ecore::pivot::ExpressionInOcl::messageExpression http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!messageExpression
		Property symbol_75 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!parameterVariable // pivot.ecore::pivot::ExpressionInOcl::parameterVariable http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!parameterVariable
		Property symbol_76 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!resultVariable // pivot.ecore::pivot::ExpressionInOcl::resultVariable http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!resultVariable
		
		Class symbol_77 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		Property symbol_78 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementation // pivot.ecore::pivot::Feature::implementation http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementation
		Property symbol_79 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementationClass // pivot.ecore::pivot::Feature::implementationClass http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementationClass
		
		Class symbol_80 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		Property symbol_81 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp!isPre // pivot.ecore::pivot::FeatureCallExp::isPre http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp!isPre
		
		Class symbol_82 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
		Property symbol_83 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!condition // pivot.ecore::pivot::IfExp::condition http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!condition
		Property symbol_84 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!elseExpression // pivot.ecore::pivot::IfExp::elseExpression http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!elseExpression
		Property symbol_85 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!thenExpression // pivot.ecore::pivot::IfExp::thenExpression http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!thenExpression
		
		DataType symbol_86 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Int
		
		PrimitiveType symbol_87 = standardLibrary.getIntegerType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
		Class symbol_88 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp
		Property symbol_89 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp!integerSymbol // pivot.ecore::pivot::IntegerLiteralExp::integerSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp!integerSymbol
		
		Class symbol_90 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidLiteralExp
		
		Class symbol_91 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidType
		
		Class symbol_92 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
		Property symbol_93 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp!result // pivot.ecore::pivot::IterateExp::result http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp!result
		
		Class symbol_94 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
		Property symbol_95 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!LoopExp // pivot.ecore::pivot::Iteration::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!LoopExp
		Property symbol_96 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedAccumulator // pivot.ecore::pivot::Iteration::ownedAccumulator http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedAccumulator
		Property symbol_97 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedIterator // pivot.ecore::pivot::Iteration::ownedIterator http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedIterator
		
		Class symbol_98 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IteratorExp
		
		Class symbol_99 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
		Property symbol_100 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!contextType // pivot.ecore::pivot::LambdaType::contextType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!contextType
		Property symbol_101 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!parameterType // pivot.ecore::pivot::LambdaType::parameterType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!parameterType
		Property symbol_102 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!resultType // pivot.ecore::pivot::LambdaType::resultType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!resultType
		
		Class symbol_103 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
		Property symbol_104 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!in // pivot.ecore::pivot::LetExp::in http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!in
		Property symbol_105 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!variable // pivot.ecore::pivot::LetExp::variable http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!variable
		
		Class symbol_106 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Library
		
		DataType symbol_107 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LibraryFeature
		
		Class symbol_108 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		
		Class symbol_109 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		Property symbol_110 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!body // pivot.ecore::pivot::LoopExp::body http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!body
		Property symbol_111 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!iterator // pivot.ecore::pivot::LoopExp::iterator http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!iterator
		Property symbol_112 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!referredIteration // pivot.ecore::pivot::LoopExp::referredIteration http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!referredIteration
		
		Class symbol_113 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
		Property symbol_114 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!argument // pivot.ecore::pivot::MessageExp::argument http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!argument
		Property symbol_115 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!calledOperation // pivot.ecore::pivot::MessageExp::calledOperation http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!calledOperation
		Property symbol_116 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!sentSignal // pivot.ecore::pivot::MessageExp::sentSignal http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!sentSignal
		Property symbol_117 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!target // pivot.ecore::pivot::MessageExp::target http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!target
		
		Class symbol_118 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
		Property symbol_119 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredOperation // pivot.ecore::pivot::MessageType::referredOperation http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredOperation
		Property symbol_120 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredSignal // pivot.ecore::pivot::MessageType::referredSignal http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredSignal
		
		Class symbol_121 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		Property symbol_122 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isOrdered // pivot.ecore::pivot::MultiplicityElement::isOrdered http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isOrdered
		Property symbol_123 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isUnique // pivot.ecore::pivot::MultiplicityElement::isUnique http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isUnique
		Property symbol_124 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!lower // pivot.ecore::pivot::MultiplicityElement::lower http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!lower
		Property symbol_125 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!upper // pivot.ecore::pivot::MultiplicityElement::upper http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!upper
		
		Class symbol_126 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		
		Class symbol_127 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		Property symbol_128 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!Constraint // pivot.ecore::pivot::NamedElement::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!Constraint
		Property symbol_129 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!isStatic // pivot.ecore::pivot::NamedElement::isStatic http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!isStatic
		Property symbol_130 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!name // pivot.ecore::pivot::NamedElement::name http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!name
		Property symbol_131 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedAnnotation // pivot.ecore::pivot::NamedElement::ownedAnnotation http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedAnnotation
		Property symbol_132 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedRule // pivot.ecore::pivot::NamedElement::ownedRule http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedRule
		
		Class symbol_133 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		
		Class symbol_134 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		Property symbol_135 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!navigationSource // pivot.ecore::pivot::NavigationCallExp::navigationSource http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!navigationSource
		Property symbol_136 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!qualifier // pivot.ecore::pivot::NavigationCallExp::qualifier http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!qualifier
		
		Class symbol_137 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NullLiteralExp
		
		Class symbol_138 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		
		DataType symbol_139 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Object
		
		Class symbol_140 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		Property symbol_141 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CallExp // pivot.ecore::pivot::OclExpression::CallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CallExp
		Property symbol_142 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionItem // pivot.ecore::pivot::OclExpression::CollectionItem http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionItem
		Property symbol_143 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionRange // pivot.ecore::pivot::OclExpression::CollectionRange http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionRange
		Property symbol_144 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!ExpressionInOcl // pivot.ecore::pivot::OclExpression::ExpressionInOcl http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!ExpressionInOcl
		Property symbol_145 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!IfExp // pivot.ecore::pivot::OclExpression::IfExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!IfExp
		Property symbol_146 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LetExp // pivot.ecore::pivot::OclExpression::LetExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LetExp
		Property symbol_147 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LoopExp // pivot.ecore::pivot::OclExpression::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LoopExp
		Property symbol_148 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!MessageExp // pivot.ecore::pivot::OclExpression::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!MessageExp
		Property symbol_149 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!NavigationCallExp // pivot.ecore::pivot::OclExpression::NavigationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!NavigationCallExp
		Property symbol_150 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!OperationCallExp // pivot.ecore::pivot::OclExpression::OperationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!OperationCallExp
		Property symbol_151 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!TupleLiteralPart // pivot.ecore::pivot::OclExpression::TupleLiteralPart http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!TupleLiteralPart
		Property symbol_152 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!Variable // pivot.ecore::pivot::OclExpression::Variable http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!Variable
		
		Class symbol_153 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		Property symbol_154 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!body // pivot.ecore::pivot::OpaqueExpression::body http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!body
		Property symbol_155 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!language // pivot.ecore::pivot::OpaqueExpression::language http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!language
		Property symbol_156 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!message // pivot.ecore::pivot::OpaqueExpression::message http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!message
		Property symbol_157 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!valueExpression // pivot.ecore::pivot::OpaqueExpression::valueExpression http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!valueExpression
		
		Class symbol_158 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		Property symbol_159 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!CallOperationAction // pivot.ecore::pivot::Operation::CallOperationAction http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!CallOperationAction
		Property symbol_160 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!MessageType // pivot.ecore::pivot::Operation::MessageType http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!MessageType
		Property symbol_161 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!OperationCallExp // pivot.ecore::pivot::Operation::OperationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!OperationCallExp
		Property symbol_162 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!class // pivot.ecore::pivot::Operation::class http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!class
		Property symbol_163 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!ownedParameter // pivot.ecore::pivot::Operation::ownedParameter http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!ownedParameter
		Property symbol_164 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!owningType // pivot.ecore::pivot::Operation::owningType http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!owningType
		Property symbol_165 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!precedence // pivot.ecore::pivot::Operation::precedence http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!precedence
		Property symbol_166 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!raisedException // pivot.ecore::pivot::Operation::raisedException http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!raisedException
		
		Class symbol_167 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
		Property symbol_168 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!argument // pivot.ecore::pivot::OperationCallExp::argument http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!argument
		Property symbol_169 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!referredOperation // pivot.ecore::pivot::OperationCallExp::referredOperation http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!referredOperation
		
		Class symbol_170 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationTemplateParameter
		
		Class symbol_171 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OrderedSetType
		
		Class symbol_172 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		Property symbol_173 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestedPackage // pivot.ecore::pivot::Package::nestedPackage http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestedPackage
		Property symbol_174 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestingPackage // pivot.ecore::pivot::Package::nestingPackage http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestingPackage
		Property symbol_175 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsPrefix // pivot.ecore::pivot::Package::nsPrefix http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsPrefix
		Property symbol_176 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsURI // pivot.ecore::pivot::Package::nsURI http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsURI
		Property symbol_177 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedPrecedence // pivot.ecore::pivot::Package::ownedPrecedence http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedPrecedence
		Property symbol_178 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedType // pivot.ecore::pivot::Package::ownedType http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedType
		
		Class symbol_179 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PackageableElement
		
		Class symbol_180 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
		Property symbol_181 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Iteration // pivot.ecore::pivot::Parameter::Iteration http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Iteration
		Property symbol_182 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Variable // pivot.ecore::pivot::Parameter::Variable http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Variable
		Property symbol_183 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!operation // pivot.ecore::pivot::Parameter::operation http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!operation
		
		Class symbol_184 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		Property symbol_185 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameter // pivot.ecore::pivot::ParameterableElement::TemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameter
		Property symbol_186 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameterSubstitution // pivot.ecore::pivot::ParameterableElement::TemplateParameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameterSubstitution
		Property symbol_187 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!owningTemplateParameter // pivot.ecore::pivot::ParameterableElement::owningTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!owningTemplateParameter
		Property symbol_188 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!templateParameter // pivot.ecore::pivot::ParameterableElement::templateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!templateParameter
		
		Class symbol_189 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Pivotable
		
		Class symbol_190 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
		Property symbol_191 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Operation // pivot.ecore::pivot::Precedence::Operation http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Operation
		Property symbol_192 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Package // pivot.ecore::pivot::Precedence::Package http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Package
		Property symbol_193 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!associativity // pivot.ecore::pivot::Precedence::associativity http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!associativity
		Property symbol_194 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!order // pivot.ecore::pivot::Precedence::order http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!order
		
		Class symbol_195 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		
		Class symbol_196 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveType
		
		Class symbol_197 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
		Property symbol_198 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!NavigationCallExp // pivot.ecore::pivot::Property::NavigationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!Property!NavigationCallExp
		Property symbol_199 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!Property // pivot.ecore::pivot::Property::Property http://www.eclipse.org/ocl/3.1.0/Pivot!Property!Property
		Property symbol_200 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!PropertyCallExp // pivot.ecore::pivot::Property::PropertyCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!Property!PropertyCallExp
		Property symbol_201 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!association // pivot.ecore::pivot::Property::association http://www.eclipse.org/ocl/3.1.0/Pivot!Property!association
		Property symbol_202 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!class // pivot.ecore::pivot::Property::class http://www.eclipse.org/ocl/3.1.0/Pivot!Property!class
		Property symbol_203 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!default // pivot.ecore::pivot::Property::default http://www.eclipse.org/ocl/3.1.0/Pivot!Property!default
		Property symbol_204 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!implicit // pivot.ecore::pivot::Property::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!Property!implicit
		Property symbol_205 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isComposite // pivot.ecore::pivot::Property::isComposite http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isComposite
		Property symbol_206 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isDerived // pivot.ecore::pivot::Property::isDerived http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isDerived
		Property symbol_207 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isID // pivot.ecore::pivot::Property::isID http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isID
		Property symbol_208 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isReadOnly // pivot.ecore::pivot::Property::isReadOnly http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isReadOnly
		Property symbol_209 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isResolveProxies // pivot.ecore::pivot::Property::isResolveProxies http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isResolveProxies
		Property symbol_210 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isTransient // pivot.ecore::pivot::Property::isTransient http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isTransient
		Property symbol_211 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isUnsettable // pivot.ecore::pivot::Property::isUnsettable http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isUnsettable
		Property symbol_212 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isVolatile // pivot.ecore::pivot::Property::isVolatile http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isVolatile
		Property symbol_213 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!keys // pivot.ecore::pivot::Property::keys http://www.eclipse.org/ocl/3.1.0/Pivot!Property!keys
		Property symbol_214 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!opposite // pivot.ecore::pivot::Property::opposite http://www.eclipse.org/ocl/3.1.0/Pivot!Property!opposite
		Property symbol_215 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!owningType // pivot.ecore::pivot::Property::owningType http://www.eclipse.org/ocl/3.1.0/Pivot!Property!owningType
		
		Class symbol_216 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
		Property symbol_217 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp!referredProperty // pivot.ecore::pivot::PropertyCallExp::referredProperty http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp!referredProperty
		
		PrimitiveType symbol_218 = standardLibrary.getRealType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Real
		Class symbol_219 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp
		Property symbol_220 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp!realSymbol // pivot.ecore::pivot::RealLiteralExp::realSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp!realSymbol
		
		Class symbol_221 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SelfType
		
		Class symbol_222 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
		Property symbol_223 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!MessageExp // pivot.ecore::pivot::SendSignalAction::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!MessageExp
		Property symbol_224 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!signal // pivot.ecore::pivot::SendSignalAction::signal http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!signal
		
		Class symbol_225 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SequenceType
		
		Class symbol_226 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SetType
		
		Class symbol_227 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
		Property symbol_228 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!MessageType // pivot.ecore::pivot::Signal::MessageType http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!MessageType
		Property symbol_229 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!SendSignalAction // pivot.ecore::pivot::Signal::SendSignalAction http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!SendSignalAction
		
		Class symbol_230 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!State
		Property symbol_231 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!State!StateExp // pivot.ecore::pivot::State::StateExp http://www.eclipse.org/ocl/3.1.0/Pivot!State!StateExp
		
		Class symbol_232 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
		Property symbol_233 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp!referredState // pivot.ecore::pivot::StateExp::referredState http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp!referredState
		
		PrimitiveType symbol_234 = standardLibrary.getStringType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!String
		Class symbol_235 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp
		Property symbol_236 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp!stringSymbol // pivot.ecore::pivot::StringLiteralExp::stringSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp!stringSymbol
		
		Class symbol_237 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
		Property symbol_238 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!boundElement // pivot.ecore::pivot::TemplateBinding::boundElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!boundElement
		Property symbol_239 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!parameterSubstitution // pivot.ecore::pivot::TemplateBinding::parameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!parameterSubstitution
		Property symbol_240 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!signature // pivot.ecore::pivot::TemplateBinding::signature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!signature
		
		Class symbol_241 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		Property symbol_242 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateParameterSubstitution // pivot.ecore::pivot::TemplateParameter::TemplateParameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateParameterSubstitution
		Property symbol_243 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateSignature // pivot.ecore::pivot::TemplateParameter::TemplateSignature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateSignature
		Property symbol_244 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!default // pivot.ecore::pivot::TemplateParameter::default http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!default
		Property symbol_245 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedDefault // pivot.ecore::pivot::TemplateParameter::ownedDefault http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedDefault
		Property symbol_246 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedParameteredElement // pivot.ecore::pivot::TemplateParameter::ownedParameteredElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedParameteredElement
		Property symbol_247 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!parameteredElement // pivot.ecore::pivot::TemplateParameter::parameteredElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!parameteredElement
		Property symbol_248 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!signature // pivot.ecore::pivot::TemplateParameter::signature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!signature
		
		Class symbol_249 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
		Property symbol_250 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!actual // pivot.ecore::pivot::TemplateParameterSubstitution::actual http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!actual
		Property symbol_251 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!formal // pivot.ecore::pivot::TemplateParameterSubstitution::formal http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!formal
		Property symbol_252 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!ownedActual // pivot.ecore::pivot::TemplateParameterSubstitution::ownedActual http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!ownedActual
		Property symbol_253 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!templateBinding // pivot.ecore::pivot::TemplateParameterSubstitution::templateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!templateBinding
		
		Class symbol_254 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType
		Property symbol_255 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType!specification // pivot.ecore::pivot::TemplateParameterType::specification http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType!specification
		
		Class symbol_256 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
		Property symbol_257 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!TemplateBinding // pivot.ecore::pivot::TemplateSignature::TemplateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!TemplateBinding
		Property symbol_258 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!ownedParameter // pivot.ecore::pivot::TemplateSignature::ownedParameter http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!ownedParameter
		Property symbol_259 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!parameter // pivot.ecore::pivot::TemplateSignature::parameter http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!parameter
		Property symbol_260 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!template // pivot.ecore::pivot::TemplateSignature::template http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!template
		
		Class symbol_261 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		Property symbol_262 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!ownedTemplateSignature // pivot.ecore::pivot::TemplateableElement::ownedTemplateSignature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!ownedTemplateSignature
		Property symbol_263 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!templateBinding // pivot.ecore::pivot::TemplateableElement::templateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!templateBinding
		Property symbol_264 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!unspecializedElement // pivot.ecore::pivot::TemplateableElement::unspecializedElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!unspecializedElement
		
		DataType symbol_265 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Throwable
		
		Class symbol_266 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
		Property symbol_267 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp!part // pivot.ecore::pivot::TupleLiteralExp::part http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp!part
		
		Class symbol_268 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
		Property symbol_269 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!TupleLiteralExp // pivot.ecore::pivot::TupleLiteralPart::TupleLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!TupleLiteralExp
		Property symbol_270 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!initExpression // pivot.ecore::pivot::TupleLiteralPart::initExpression http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!initExpression
		
		Class symbol_271 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleType
		
		Class symbol_272 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		Property symbol_273 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ClassifierType // pivot.ecore::pivot::Type::ClassifierType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ClassifierType
		Property symbol_274 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!CollectionType // pivot.ecore::pivot::Type::CollectionType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!CollectionType
		Property symbol_275 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!DataType // pivot.ecore::pivot::Type::DataType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!DataType
		Property symbol_276 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!LambdaType // pivot.ecore::pivot::Type::LambdaType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!LambdaType
		Property symbol_277 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Operation // pivot.ecore::pivot::Type::Operation http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Operation
		Property symbol_278 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Type // pivot.ecore::pivot::Type::Type http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Type
		Property symbol_279 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeExp // pivot.ecore::pivot::Type::TypeExp http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeExp
		Property symbol_280 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeTemplateParameter // pivot.ecore::pivot::Type::TypeTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeTemplateParameter
		Property symbol_281 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypedElement // pivot.ecore::pivot::Type::TypedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypedElement
		Property symbol_282 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!UnspecifiedType // pivot.ecore::pivot::Type::UnspecifiedType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!UnspecifiedType
		Property symbol_283 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!instanceClassName // pivot.ecore::pivot::Type::instanceClassName http://www.eclipse.org/ocl/3.1.0/Pivot!Type!instanceClassName
		Property symbol_284 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedAttribute // pivot.ecore::pivot::Type::ownedAttribute http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedAttribute
		Property symbol_285 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedOperation // pivot.ecore::pivot::Type::ownedOperation http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedOperation
		Property symbol_286 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!package // pivot.ecore::pivot::Type::package http://www.eclipse.org/ocl/3.1.0/Pivot!Type!package
		Property symbol_287 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!superClass // pivot.ecore::pivot::Type::superClass http://www.eclipse.org/ocl/3.1.0/Pivot!Type!superClass
		
		Class symbol_288 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
		Property symbol_289 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp!referredType // pivot.ecore::pivot::TypeExp::referredType http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp!referredType
		
		Class symbol_290 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
		Property symbol_291 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!allowSubstitutable // pivot.ecore::pivot::TypeTemplateParameter::allowSubstitutable http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!allowSubstitutable
		Property symbol_292 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!constrainingType // pivot.ecore::pivot::TypeTemplateParameter::constrainingType http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!constrainingType
		
		Class symbol_293 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		Property symbol_294 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement!type // pivot.ecore::pivot::TypedElement::type http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement!type
		
		Class symbol_295 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		
		PrimitiveType symbol_296 = standardLibrary.getUnlimitedNaturalType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
		Class symbol_297 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp
		Property symbol_298 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp!unlimitedNaturalSymbol // pivot.ecore::pivot::UnlimitedNaturalLiteralExp::unlimitedNaturalSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp!unlimitedNaturalSymbol
		
		Class symbol_299 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
		Property symbol_300 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!lowerBound // pivot.ecore::pivot::UnspecifiedType::lowerBound http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!lowerBound
		Property symbol_301 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!upperBound // pivot.ecore::pivot::UnspecifiedType::upperBound http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!upperBound
		
		Class symbol_302 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedValueExp
		
		Class symbol_303 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		Property symbol_304 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!Constraint // pivot.ecore::pivot::ValueSpecification::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!Constraint
		
		Class symbol_305 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
		Property symbol_306 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!ExpressionInOcl // pivot.ecore::pivot::Variable::ExpressionInOcl http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!ExpressionInOcl
		Property symbol_307 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!IterateExp // pivot.ecore::pivot::Variable::IterateExp http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!IterateExp
		Property symbol_308 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LetExp // pivot.ecore::pivot::Variable::LetExp http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LetExp
		Property symbol_309 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LoopExp // pivot.ecore::pivot::Variable::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LoopExp
		Property symbol_310 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!implicit // pivot.ecore::pivot::Variable::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!implicit
		Property symbol_311 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!initExpression // pivot.ecore::pivot::Variable::initExpression http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!initExpression
		Property symbol_312 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!representedParameter // pivot.ecore::pivot::Variable::representedParameter http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!representedParameter
		
		Class symbol_313 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		Property symbol_314 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration!VariableExp // pivot.ecore::pivot::VariableDeclaration::VariableExp http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration!VariableExp
		
		Class symbol_315 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
		Property symbol_316 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!implicit // pivot.ecore::pivot::VariableExp::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!implicit
		Property symbol_317 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!referredVariable // pivot.ecore::pivot::VariableExp::referredVariable http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!referredVariable
		
		Class symbol_318 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		
		Class symbol_319 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}
		TemplateSignature symbol_320 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}!
		TypeTemplateParameter symbol_321 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_322 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}?R
		TypeTemplateParameter symbol_323 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_324 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}?C
		
		
		Class symbol_325 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VoidType
		

		symbol_0.setName("pivot");
		symbol_0.setNsPrefix("pivot");
		symbol_0.setNsURI("http://www.eclipse.org/ocl/3.1.0/Pivot");
		//
		// pivot.ecore::pivot::Annotation http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
		//
		symbol_1.setName("Annotation");
		symbol_1.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::Annotation::NamedElement
			symbol_2.setName("NamedElement");
			symbol_2.setType(symbol_127);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
			symbol_2.setLower(BigInteger.valueOf(0));
			
			symbol_2.setImplicit(true);
			symbol_2.setIsResolveProxies(true);
			symbol_2.setOpposite(symbol_131);
			symbol_1.getOwnedAttributes().add(symbol_2);
		}
		{ // pivot.ecore::pivot::Annotation::ownedContent
			symbol_3.setName("ownedContent");
			symbol_3.setType(symbol_58);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_3.setLower(BigInteger.valueOf(0));
			symbol_3.setUpper(BigInteger.valueOf(-1));
			symbol_3.setIsOrdered(true);
			
			symbol_3.setIsComposite(true);
			symbol_3.setIsResolveProxies(true);
			symbol_1.getOwnedAttributes().add(symbol_3);
		}
		{ // pivot.ecore::pivot::Annotation::ownedDetail
			symbol_4.setName("ownedDetail");
			symbol_4.setType(symbol_55);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
			symbol_4.setLower(BigInteger.valueOf(0));
			symbol_4.setUpper(BigInteger.valueOf(-1));
			symbol_4.setIsOrdered(true);
			
			symbol_4.setIsComposite(true);
			symbol_4.setIsResolveProxies(true);
			symbol_4.setOpposite(symbol_56);
			symbol_1.getOwnedAttributes().add(symbol_4);
		}
		{ // pivot.ecore::pivot::Annotation::reference
			symbol_5.setName("reference");
			symbol_5.setType(symbol_58);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_5.setLower(BigInteger.valueOf(0));
			symbol_5.setUpper(BigInteger.valueOf(-1));
			symbol_5.setIsOrdered(true);
			
			symbol_5.setIsResolveProxies(true);
			symbol_5.setOpposite(symbol_59);
			symbol_1.getOwnedAttributes().add(symbol_5);
		}
		symbol_0.getOwnedTypes().add(symbol_1); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
		//
		// pivot.ecore::pivot::AnyType http://www.eclipse.org/ocl/3.1.0/Pivot!AnyType
		//
		symbol_6.setName("AnyType");
		symbol_6.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		symbol_0.getOwnedTypes().add(symbol_6); // http://www.eclipse.org/ocl/3.1.0/Pivot!AnyType
		//
		// pivot.ecore::pivot::AssociationClass http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
		//
		symbol_7.setName("AssociationClass");
		symbol_7.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		{ // pivot.ecore::pivot::AssociationClass::AssociationClassCallExp
			symbol_8.setName("AssociationClassCallExp");
			symbol_8.setType(symbol_10);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
			symbol_8.setLower(BigInteger.valueOf(0));
			symbol_8.setUpper(BigInteger.valueOf(-1));
			
			symbol_8.setImplicit(true);
			symbol_8.setIsResolveProxies(true);
			symbol_8.setOpposite(symbol_11);
			symbol_7.getOwnedAttributes().add(symbol_8);
		}
		{ // pivot.ecore::pivot::AssociationClass::unownedAttribute
			symbol_9.setName("unownedAttribute");
			symbol_9.setType(symbol_197);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_9.setLower(BigInteger.valueOf(0));
			symbol_9.setUpper(BigInteger.valueOf(-1));
			
			symbol_9.setIsResolveProxies(true);
			symbol_9.setOpposite(symbol_201);
			symbol_7.getOwnedAttributes().add(symbol_9);
		}
		symbol_0.getOwnedTypes().add(symbol_7); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
		//
		// pivot.ecore::pivot::AssociationClassCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
		//
		symbol_10.setName("AssociationClassCallExp");
		symbol_10.getSuperClasses().add(symbol_134); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		{ // pivot.ecore::pivot::AssociationClassCallExp::referredAssociationClass
			symbol_11.setName("referredAssociationClass");
			symbol_11.setType(symbol_7);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
			symbol_11.setLower(BigInteger.valueOf(0));
			
			symbol_11.setIsResolveProxies(true);
			symbol_11.setOpposite(symbol_8);
			symbol_10.getOwnedAttributes().add(symbol_11);
		}
		symbol_0.getOwnedTypes().add(symbol_10); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
		//
		// pivot.ecore::pivot::AssociativityKind http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
		//
		symbol_12.setName("AssociativityKind");
		{
			EnumerationLiteral symbol_326 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::AssociativityKind::Left http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind!Left
			symbol_326.setName("Left");
			symbol_12.getOwnedLiterals().add(symbol_326);
			EnumerationLiteral symbol_327 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::AssociativityKind::Right http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind!Right
			symbol_327.setName("Right");
			symbol_12.getOwnedLiterals().add(symbol_327);
		}
		
		symbol_0.getOwnedTypes().add(symbol_12); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
		//
		// pivot.ecore::pivot::BagType http://www.eclipse.org/ocl/3.1.0/Pivot!BagType
		//
		symbol_13.setName("BagType");
		symbol_13.getSuperClasses().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		symbol_0.getOwnedTypes().add(symbol_13); // http://www.eclipse.org/ocl/3.1.0/Pivot!BagType
		//
		// pivot.ecore::pivot::BooleanLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp
		//
		symbol_15.setName("BooleanLiteralExp");
		symbol_15.getSuperClasses().add(symbol_195); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		{ // pivot.ecore::pivot::BooleanLiteralExp::booleanSymbol
			symbol_16.setName("booleanSymbol");
			symbol_16.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_16.setIsResolveProxies(true);
			symbol_16.setIsUnsettable(true);
			symbol_15.getOwnedAttributes().add(symbol_16);
		}
		symbol_0.getOwnedTypes().add(symbol_15); // http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp
		//
		// pivot.ecore::pivot::CallExp http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		//
		symbol_17.setName("CallExp");
		symbol_17.getSuperClasses().add(symbol_140); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::CallExp::implicit
			symbol_18.setName("implicit");
			symbol_18.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_18.setLower(BigInteger.valueOf(0));
			
			symbol_18.setIsResolveProxies(true);
			symbol_17.getOwnedAttributes().add(symbol_18);
		}
		{ // pivot.ecore::pivot::CallExp::source
			symbol_19.setName("source");
			symbol_19.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_19.setLower(BigInteger.valueOf(0));
			
			symbol_19.setIsComposite(true);
			symbol_19.setIsResolveProxies(true);
			symbol_19.setOpposite(symbol_141);
			symbol_17.getOwnedAttributes().add(symbol_19);
		}
		symbol_0.getOwnedTypes().add(symbol_17); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		//
		// pivot.ecore::pivot::CallOperationAction http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
		//
		symbol_20.setName("CallOperationAction");
		symbol_20.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::CallOperationAction::MessageExp
			symbol_21.setName("MessageExp");
			symbol_21.setType(symbol_113);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
			symbol_21.setLower(BigInteger.valueOf(0));
			
			symbol_21.setImplicit(true);
			symbol_21.setIsResolveProxies(true);
			symbol_21.setOpposite(symbol_115);
			symbol_20.getOwnedAttributes().add(symbol_21);
		}
		{ // pivot.ecore::pivot::CallOperationAction::operation
			symbol_22.setName("operation");
			symbol_22.setType(symbol_158);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			
			symbol_22.setIsResolveProxies(true);
			symbol_22.setOpposite(symbol_159);
			symbol_20.getOwnedAttributes().add(symbol_22);
		}
		symbol_0.getOwnedTypes().add(symbol_20); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
		//
		// pivot.ecore::pivot::Class http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		//
		symbol_23.setName("Class");
		symbol_23.getSuperClasses().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		symbol_23.getSuperClasses().add(symbol_133); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		{ // pivot.ecore::pivot::Class::isAbstract
			symbol_24.setName("isAbstract");
			symbol_24.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_24.setIsResolveProxies(true);
			symbol_23.getOwnedAttributes().add(symbol_24);
		}
		{ // pivot.ecore::pivot::Class::isInterface
			symbol_25.setName("isInterface");
			symbol_25.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_25.setIsResolveProxies(true);
			symbol_23.getOwnedAttributes().add(symbol_25);
		}
		symbol_0.getOwnedTypes().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		//
		// pivot.ecore::pivot::ClassifierType http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
		//
		symbol_26.setName("ClassifierType");
		symbol_26.getSuperClasses().add(symbol_52); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // pivot.ecore::pivot::ClassifierType::instanceType
			symbol_27.setName("instanceType");
			symbol_27.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_27.setIsResolveProxies(true);
			symbol_27.setOpposite(symbol_273);
			symbol_26.getOwnedAttributes().add(symbol_27);
		}
		symbol_0.getOwnedTypes().add(symbol_26); // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
		//
		// pivot.ecore::pivot::CollectionItem http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
		//
		symbol_28.setName("CollectionItem");
		symbol_28.getSuperClasses().add(symbol_34); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		{ // pivot.ecore::pivot::CollectionItem::item
			symbol_29.setName("item");
			symbol_29.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_29.setIsComposite(true);
			symbol_29.setIsResolveProxies(true);
			symbol_29.setOpposite(symbol_142);
			symbol_28.getOwnedAttributes().add(symbol_29);
		}
		symbol_0.getOwnedTypes().add(symbol_28); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
		//
		// pivot.ecore::pivot::CollectionKind http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
		//
		symbol_30.setName("CollectionKind");
		{
			EnumerationLiteral symbol_328 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::Collection http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Collection
			symbol_328.setName("Collection");
			symbol_30.getOwnedLiterals().add(symbol_328);
			EnumerationLiteral symbol_329 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::Set http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Set
			symbol_329.setName("Set");
			symbol_30.getOwnedLiterals().add(symbol_329);
			EnumerationLiteral symbol_330 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::OrderedSet http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!OrderedSet
			symbol_330.setName("OrderedSet");
			symbol_30.getOwnedLiterals().add(symbol_330);
			EnumerationLiteral symbol_331 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::Bag http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Bag
			symbol_331.setName("Bag");
			symbol_30.getOwnedLiterals().add(symbol_331);
			EnumerationLiteral symbol_332 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::Sequence http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Sequence
			symbol_332.setName("Sequence");
			symbol_30.getOwnedLiterals().add(symbol_332);
		}
		
		symbol_0.getOwnedTypes().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
		//
		// pivot.ecore::pivot::CollectionLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp
		//
		symbol_31.setName("CollectionLiteralExp");
		symbol_31.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		{ // pivot.ecore::pivot::CollectionLiteralExp::kind
			symbol_32.setName("kind");
			symbol_32.setType(symbol_30);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
			
			symbol_32.setIsResolveProxies(true);
			symbol_31.getOwnedAttributes().add(symbol_32);
		}
		{ // pivot.ecore::pivot::CollectionLiteralExp::part
			symbol_33.setName("part");
			symbol_33.setType(symbol_34);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
			symbol_33.setLower(BigInteger.valueOf(0));
			symbol_33.setUpper(BigInteger.valueOf(-1));
			symbol_33.setIsOrdered(true);
			
			symbol_33.setIsComposite(true);
			symbol_33.setIsResolveProxies(true);
			symbol_33.setOpposite(symbol_35);
			symbol_31.getOwnedAttributes().add(symbol_33);
		}
		symbol_0.getOwnedTypes().add(symbol_31); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp
		//
		// pivot.ecore::pivot::CollectionLiteralPart http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		//
		symbol_34.setName("CollectionLiteralPart");
		symbol_34.getSuperClasses().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		{ // pivot.ecore::pivot::CollectionLiteralPart::CollectionLiteralExp
			symbol_35.setName("CollectionLiteralExp");
			symbol_35.setType(symbol_31);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp
			symbol_35.setLower(BigInteger.valueOf(0));
			
			symbol_35.setImplicit(true);
			symbol_35.setIsResolveProxies(true);
			symbol_35.setOpposite(symbol_33);
			symbol_34.getOwnedAttributes().add(symbol_35);
		}
		symbol_0.getOwnedTypes().add(symbol_34); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		//
		// pivot.ecore::pivot::CollectionRange http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
		//
		symbol_36.setName("CollectionRange");
		symbol_36.getSuperClasses().add(symbol_34); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		{ // pivot.ecore::pivot::CollectionRange::first
			symbol_37.setName("first");
			symbol_37.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_37.setIsComposite(true);
			symbol_37.setIsResolveProxies(true);
			symbol_36.getOwnedAttributes().add(symbol_37);
		}
		{ // pivot.ecore::pivot::CollectionRange::last
			symbol_38.setName("last");
			symbol_38.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_38.setIsComposite(true);
			symbol_38.setIsResolveProxies(true);
			symbol_38.setOpposite(symbol_143);
			symbol_36.getOwnedAttributes().add(symbol_38);
		}
		symbol_0.getOwnedTypes().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
		//
		// pivot.ecore::pivot::CollectionType http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		//
		symbol_39.setName("CollectionType");
		symbol_39.getSuperClasses().add(symbol_52); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // pivot.ecore::pivot::CollectionType::elementType
			symbol_40.setName("elementType");
			symbol_40.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_40.setIsResolveProxies(true);
			symbol_40.setOpposite(symbol_274);
			symbol_39.getOwnedAttributes().add(symbol_40);
		}
		symbol_0.getOwnedTypes().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		//
		// pivot.ecore::pivot::Comment http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
		//
		symbol_41.setName("Comment");
		symbol_41.getSuperClasses().add(symbol_58); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::Comment::Element
			symbol_42.setName("Element");
			symbol_42.setType(symbol_58);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_42.setLower(BigInteger.valueOf(0));
			
			symbol_42.setImplicit(true);
			symbol_42.setIsResolveProxies(true);
			symbol_42.setOpposite(symbol_62);
			symbol_41.getOwnedAttributes().add(symbol_42);
		}
		{ // pivot.ecore::pivot::Comment::annotatedElement
			symbol_43.setName("annotatedElement");
			symbol_43.setType(symbol_58);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_43.setLower(BigInteger.valueOf(0));
			symbol_43.setUpper(BigInteger.valueOf(-1));
			
			symbol_43.setIsResolveProxies(true);
			symbol_43.setOpposite(symbol_60);
			symbol_41.getOwnedAttributes().add(symbol_43);
		}
		{ // pivot.ecore::pivot::Comment::body
			symbol_44.setName("body");
			symbol_44.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_44.setLower(BigInteger.valueOf(0));
			
			symbol_44.setIsResolveProxies(true);
			symbol_41.getOwnedAttributes().add(symbol_44);
		}
		symbol_0.getOwnedTypes().add(symbol_41); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
		//
		// pivot.ecore::pivot::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
		//
		symbol_45.setName("Constraint");
		symbol_45.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::Constraint::NamedElement
			symbol_46.setName("NamedElement");
			symbol_46.setType(symbol_127);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
			symbol_46.setLower(BigInteger.valueOf(0));
			
			symbol_46.setImplicit(true);
			symbol_46.setIsResolveProxies(true);
			symbol_46.setOpposite(symbol_132);
			symbol_45.getOwnedAttributes().add(symbol_46);
		}
		{ // pivot.ecore::pivot::Constraint::constrainedElement
			symbol_47.setName("constrainedElement");
			symbol_47.setType(symbol_58);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_47.setLower(BigInteger.valueOf(0));
			symbol_47.setUpper(BigInteger.valueOf(-1));
			symbol_47.setIsOrdered(true);
			
			symbol_47.setIsResolveProxies(true);
			symbol_47.setOpposite(symbol_61);
			symbol_45.getOwnedAttributes().add(symbol_47);
		}
		{ // pivot.ecore::pivot::Constraint::context
			symbol_48.setName("context");
			symbol_48.setType(symbol_127);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
			symbol_48.setLower(BigInteger.valueOf(0));
			
			symbol_48.setIsResolveProxies(true);
			symbol_48.setOpposite(symbol_128);
			symbol_45.getOwnedAttributes().add(symbol_48);
		}
		{ // pivot.ecore::pivot::Constraint::isCallable
			symbol_49.setName("isCallable");
			symbol_49.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_49.setIsResolveProxies(true);
			symbol_45.getOwnedAttributes().add(symbol_49);
		}
		{ // pivot.ecore::pivot::Constraint::specification
			symbol_50.setName("specification");
			symbol_50.setType(symbol_303);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
			
			symbol_50.setIsComposite(true);
			symbol_50.setIsResolveProxies(true);
			symbol_50.setOpposite(symbol_304);
			symbol_45.getOwnedAttributes().add(symbol_50);
		}
		{ // pivot.ecore::pivot::Constraint::stereotype
			symbol_51.setName("stereotype");
			symbol_51.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_51.setLower(BigInteger.valueOf(0));
			
			symbol_51.setIsResolveProxies(true);
			symbol_45.getOwnedAttributes().add(symbol_51);
		}
		symbol_0.getOwnedTypes().add(symbol_45); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
		//
		// pivot.ecore::pivot::DataType http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		//
		symbol_52.setName("DataType");
		symbol_52.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		{ // pivot.ecore::pivot::DataType::behavioralType
			symbol_53.setName("behavioralType");
			symbol_53.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_53.setLower(BigInteger.valueOf(0));
			
			symbol_53.setIsResolveProxies(true);
			symbol_53.setOpposite(symbol_275);
			symbol_52.getOwnedAttributes().add(symbol_53);
		}
		{ // pivot.ecore::pivot::DataType::isSerializable
			symbol_54.setName("isSerializable");
			symbol_54.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_54.setIsResolveProxies(true);
			symbol_52.getOwnedAttributes().add(symbol_54);
		}
		symbol_0.getOwnedTypes().add(symbol_52); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		//
		// pivot.ecore::pivot::Detail http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
		//
		symbol_55.setName("Detail");
		symbol_55.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::Detail::Annotation
			symbol_56.setName("Annotation");
			symbol_56.setType(symbol_1);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
			symbol_56.setLower(BigInteger.valueOf(0));
			
			symbol_56.setImplicit(true);
			symbol_56.setIsResolveProxies(true);
			symbol_56.setOpposite(symbol_4);
			symbol_55.getOwnedAttributes().add(symbol_56);
		}
		{ // pivot.ecore::pivot::Detail::value
			symbol_57.setName("value");
			symbol_57.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_57.setUpper(BigInteger.valueOf(-1));
			
			symbol_57.setIsResolveProxies(true);
			symbol_55.getOwnedAttributes().add(symbol_57);
		}
		symbol_0.getOwnedTypes().add(symbol_55); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
		//
		// pivot.ecore::pivot::Element http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		//
		symbol_58.setName("Element");
		symbol_58.getSuperClasses().add(symbol_318); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		{ // pivot.ecore::pivot::Element::Annotation
			symbol_59.setName("Annotation");
			symbol_59.setType(symbol_1);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
			symbol_59.setLower(BigInteger.valueOf(0));
			symbol_59.setUpper(BigInteger.valueOf(-1));
			
			symbol_59.setImplicit(true);
			symbol_59.setIsResolveProxies(true);
			symbol_58.getOwnedAttributes().add(symbol_59);
		}
		{ // pivot.ecore::pivot::Element::Comment
			symbol_60.setName("Comment");
			symbol_60.setType(symbol_41);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
			symbol_60.setLower(BigInteger.valueOf(0));
			symbol_60.setUpper(BigInteger.valueOf(-1));
			
			symbol_60.setImplicit(true);
			symbol_60.setIsResolveProxies(true);
			symbol_60.setOpposite(symbol_43);
			symbol_58.getOwnedAttributes().add(symbol_60);
		}
		{ // pivot.ecore::pivot::Element::Constraint
			symbol_61.setName("Constraint");
			symbol_61.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_61.setLower(BigInteger.valueOf(0));
			symbol_61.setUpper(BigInteger.valueOf(-1));
			
			symbol_61.setImplicit(true);
			symbol_61.setIsResolveProxies(true);
			symbol_61.setOpposite(symbol_47);
			symbol_58.getOwnedAttributes().add(symbol_61);
		}
		{ // pivot.ecore::pivot::Element::ownedComment
			symbol_62.setName("ownedComment");
			symbol_62.setType(symbol_41);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
			symbol_62.setLower(BigInteger.valueOf(0));
			symbol_62.setUpper(BigInteger.valueOf(-1));
			
			symbol_62.setIsComposite(true);
			symbol_62.setIsResolveProxies(true);
			symbol_62.setOpposite(symbol_42);
			symbol_58.getOwnedAttributes().add(symbol_62);
		}
		symbol_0.getOwnedTypes().add(symbol_58); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		//
		// pivot.ecore::pivot::EnumLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
		//
		symbol_63.setName("EnumLiteralExp");
		symbol_63.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		{ // pivot.ecore::pivot::EnumLiteralExp::referredEnumLiteral
			symbol_64.setName("referredEnumLiteral");
			symbol_64.setType(symbol_67);  // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
			symbol_64.setLower(BigInteger.valueOf(0));
			
			symbol_64.setIsResolveProxies(true);
			symbol_64.setOpposite(symbol_68);
			symbol_63.getOwnedAttributes().add(symbol_64);
		}
		symbol_0.getOwnedTypes().add(symbol_63); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
		//
		// pivot.ecore::pivot::Enumeration http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
		//
		symbol_65.setName("Enumeration");
		symbol_65.getSuperClasses().add(symbol_52); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // pivot.ecore::pivot::Enumeration::ownedLiteral
			symbol_66.setName("ownedLiteral");
			symbol_66.setType(symbol_67);  // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
			symbol_66.setLower(BigInteger.valueOf(0));
			symbol_66.setUpper(BigInteger.valueOf(-1));
			symbol_66.setIsOrdered(true);
			
			symbol_66.setIsComposite(true);
			symbol_66.setIsResolveProxies(true);
			symbol_66.setOpposite(symbol_69);
			symbol_65.getOwnedAttributes().add(symbol_66);
		}
		symbol_0.getOwnedTypes().add(symbol_65); // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
		//
		// pivot.ecore::pivot::EnumerationLiteral http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
		//
		symbol_67.setName("EnumerationLiteral");
		symbol_67.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::EnumerationLiteral::EnumLiteralExp
			symbol_68.setName("EnumLiteralExp");
			symbol_68.setType(symbol_63);  // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
			symbol_68.setLower(BigInteger.valueOf(0));
			symbol_68.setUpper(BigInteger.valueOf(-1));
			
			symbol_68.setImplicit(true);
			symbol_68.setIsResolveProxies(true);
			symbol_68.setOpposite(symbol_64);
			symbol_67.getOwnedAttributes().add(symbol_68);
		}
		{ // pivot.ecore::pivot::EnumerationLiteral::enumeration
			symbol_69.setName("enumeration");
			symbol_69.setType(symbol_65);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
			symbol_69.setLower(BigInteger.valueOf(0));
			
			symbol_69.setIsResolveProxies(true);
			symbol_69.setOpposite(symbol_66);
			symbol_67.getOwnedAttributes().add(symbol_69);
		}
		{ // pivot.ecore::pivot::EnumerationLiteral::value
			symbol_70.setName("value");
			symbol_70.setType(symbol_87);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			symbol_70.setLower(BigInteger.valueOf(0));
			
			symbol_70.setIsResolveProxies(true);
			symbol_67.getOwnedAttributes().add(symbol_70);
		}
		symbol_0.getOwnedTypes().add(symbol_67); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
		//
		// pivot.ecore::pivot::ExpressionInOcl http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
		//
		symbol_71.setName("ExpressionInOcl");
		symbol_71.getSuperClasses().add(symbol_153); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		{ // pivot.ecore::pivot::ExpressionInOcl::bodyExpression
			symbol_72.setName("bodyExpression");
			symbol_72.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_72.setIsComposite(true);
			symbol_72.setIsResolveProxies(true);
			symbol_71.getOwnedAttributes().add(symbol_72);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::contextVariable
			symbol_73.setName("contextVariable");
			symbol_73.setType(symbol_305);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_73.setLower(BigInteger.valueOf(0));
			
			symbol_73.setIsComposite(true);
			symbol_73.setIsResolveProxies(true);
			symbol_73.setOpposite(symbol_306);
			symbol_71.getOwnedAttributes().add(symbol_73);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::messageExpression
			symbol_74.setName("messageExpression");
			symbol_74.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_74.setLower(BigInteger.valueOf(0));
			
			symbol_74.setIsComposite(true);
			symbol_74.setIsResolveProxies(true);
			symbol_74.setOpposite(symbol_144);
			symbol_71.getOwnedAttributes().add(symbol_74);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::parameterVariable
			symbol_75.setName("parameterVariable");
			symbol_75.setType(symbol_305);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_75.setLower(BigInteger.valueOf(0));
			symbol_75.setUpper(BigInteger.valueOf(-1));
			symbol_75.setIsOrdered(true);
			
			symbol_75.setIsComposite(true);
			symbol_75.setIsResolveProxies(true);
			symbol_71.getOwnedAttributes().add(symbol_75);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::resultVariable
			symbol_76.setName("resultVariable");
			symbol_76.setType(symbol_305);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_76.setLower(BigInteger.valueOf(0));
			
			symbol_76.setIsComposite(true);
			symbol_76.setIsResolveProxies(true);
			symbol_71.getOwnedAttributes().add(symbol_76);
		}
		symbol_0.getOwnedTypes().add(symbol_71); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
		//
		// pivot.ecore::pivot::Feature http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		//
		symbol_77.setName("Feature");
		symbol_77.getSuperClasses().add(symbol_295); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		{ // pivot.ecore::pivot::Feature::implementation
			symbol_78.setName("implementation");
			symbol_78.setType(symbol_107);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LibraryFeature
			symbol_78.setLower(BigInteger.valueOf(0));
			
			symbol_78.setIsResolveProxies(true);
			symbol_78.setIsTransient(true);
			symbol_77.getOwnedAttributes().add(symbol_78);
		}
		{ // pivot.ecore::pivot::Feature::implementationClass
			symbol_79.setName("implementationClass");
			symbol_79.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_79.setLower(BigInteger.valueOf(0));
			
			symbol_79.setIsResolveProxies(true);
			symbol_77.getOwnedAttributes().add(symbol_79);
		}
		symbol_0.getOwnedTypes().add(symbol_77); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		//
		// pivot.ecore::pivot::FeatureCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		//
		symbol_80.setName("FeatureCallExp");
		symbol_80.getSuperClasses().add(symbol_17); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		{ // pivot.ecore::pivot::FeatureCallExp::isPre
			symbol_81.setName("isPre");
			symbol_81.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_81.setIsResolveProxies(true);
			symbol_80.getOwnedAttributes().add(symbol_81);
		}
		symbol_0.getOwnedTypes().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		//
		// pivot.ecore::pivot::IfExp http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
		//
		symbol_82.setName("IfExp");
		symbol_82.getSuperClasses().add(symbol_140); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::IfExp::condition
			symbol_83.setName("condition");
			symbol_83.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_83.setIsComposite(true);
			symbol_83.setIsResolveProxies(true);
			symbol_82.getOwnedAttributes().add(symbol_83);
		}
		{ // pivot.ecore::pivot::IfExp::elseExpression
			symbol_84.setName("elseExpression");
			symbol_84.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_84.setIsComposite(true);
			symbol_84.setIsResolveProxies(true);
			symbol_84.setOpposite(symbol_145);
			symbol_82.getOwnedAttributes().add(symbol_84);
		}
		{ // pivot.ecore::pivot::IfExp::thenExpression
			symbol_85.setName("thenExpression");
			symbol_85.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_85.setIsComposite(true);
			symbol_85.setIsResolveProxies(true);
			symbol_82.getOwnedAttributes().add(symbol_85);
		}
		symbol_0.getOwnedTypes().add(symbol_82); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
		//
		// pivot.ecore::pivot::Int http://www.eclipse.org/ocl/3.1.0/Pivot!Int
		//
		symbol_86.setName("Int");
		symbol_86.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_0.getOwnedTypes().add(symbol_86); // http://www.eclipse.org/ocl/3.1.0/Pivot!Int
		//
		// pivot.ecore::pivot::IntegerLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp
		//
		symbol_88.setName("IntegerLiteralExp");
		symbol_88.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		{ // pivot.ecore::pivot::IntegerLiteralExp::integerSymbol
			symbol_89.setName("integerSymbol");
			symbol_89.setType(symbol_87);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_89.setIsResolveProxies(true);
			symbol_88.getOwnedAttributes().add(symbol_89);
		}
		symbol_0.getOwnedTypes().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp
		//
		// pivot.ecore::pivot::InvalidLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidLiteralExp
		//
		symbol_90.setName("InvalidLiteralExp");
		symbol_90.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		symbol_0.getOwnedTypes().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidLiteralExp
		//
		// pivot.ecore::pivot::InvalidType http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidType
		//
		symbol_91.setName("InvalidType");
		symbol_91.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		symbol_0.getOwnedTypes().add(symbol_91); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidType
		//
		// pivot.ecore::pivot::IterateExp http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
		//
		symbol_92.setName("IterateExp");
		symbol_92.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		{ // pivot.ecore::pivot::IterateExp::result
			symbol_93.setName("result");
			symbol_93.setType(symbol_305);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_93.setLower(BigInteger.valueOf(0));
			symbol_93.setIsOrdered(true);
			
			symbol_93.setIsComposite(true);
			symbol_93.setIsResolveProxies(true);
			symbol_93.setOpposite(symbol_307);
			symbol_92.getOwnedAttributes().add(symbol_93);
		}
		symbol_0.getOwnedTypes().add(symbol_92); // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
		//
		// pivot.ecore::pivot::Iteration http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
		//
		symbol_94.setName("Iteration");
		symbol_94.getSuperClasses().add(symbol_158); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		{ // pivot.ecore::pivot::Iteration::LoopExp
			symbol_95.setName("LoopExp");
			symbol_95.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
			symbol_95.setLower(BigInteger.valueOf(0));
			symbol_95.setUpper(BigInteger.valueOf(-1));
			
			symbol_95.setImplicit(true);
			symbol_95.setIsResolveProxies(true);
			symbol_95.setOpposite(symbol_112);
			symbol_94.getOwnedAttributes().add(symbol_95);
		}
		{ // pivot.ecore::pivot::Iteration::ownedAccumulator
			symbol_96.setName("ownedAccumulator");
			symbol_96.setType(symbol_180);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_96.setLower(BigInteger.valueOf(0));
			symbol_96.setUpper(BigInteger.valueOf(-1));
			
			symbol_96.setIsComposite(true);
			symbol_96.setIsResolveProxies(true);
			symbol_96.setOpposite(symbol_181);
			symbol_94.getOwnedAttributes().add(symbol_96);
		}
		{ // pivot.ecore::pivot::Iteration::ownedIterator
			symbol_97.setName("ownedIterator");
			symbol_97.setType(symbol_180);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_97.setLower(BigInteger.valueOf(0));
			symbol_97.setUpper(BigInteger.valueOf(-1));
			
			symbol_97.setIsComposite(true);
			symbol_97.setIsResolveProxies(true);
			symbol_94.getOwnedAttributes().add(symbol_97);
		}
		symbol_0.getOwnedTypes().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
		//
		// pivot.ecore::pivot::IteratorExp http://www.eclipse.org/ocl/3.1.0/Pivot!IteratorExp
		//
		symbol_98.setName("IteratorExp");
		symbol_98.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		symbol_0.getOwnedTypes().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/Pivot!IteratorExp
		//
		// pivot.ecore::pivot::LambdaType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
		//
		symbol_99.setName("LambdaType");
		symbol_99.getSuperClasses().add(symbol_52); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // pivot.ecore::pivot::LambdaType::contextType
			symbol_100.setName("contextType");
			symbol_100.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_100.setIsResolveProxies(true);
			symbol_99.getOwnedAttributes().add(symbol_100);
		}
		{ // pivot.ecore::pivot::LambdaType::parameterType
			symbol_101.setName("parameterType");
			symbol_101.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_101.setLower(BigInteger.valueOf(0));
			symbol_101.setUpper(BigInteger.valueOf(-1));
			
			symbol_101.setIsResolveProxies(true);
			symbol_101.setOpposite(symbol_276);
			symbol_99.getOwnedAttributes().add(symbol_101);
		}
		{ // pivot.ecore::pivot::LambdaType::resultType
			symbol_102.setName("resultType");
			symbol_102.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_102.setIsResolveProxies(true);
			symbol_99.getOwnedAttributes().add(symbol_102);
		}
		symbol_0.getOwnedTypes().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
		//
		// pivot.ecore::pivot::LetExp http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
		//
		symbol_103.setName("LetExp");
		symbol_103.getSuperClasses().add(symbol_140); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::LetExp::in
			symbol_104.setName("in");
			symbol_104.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_104.setIsComposite(true);
			symbol_104.setIsResolveProxies(true);
			symbol_104.setOpposite(symbol_146);
			symbol_103.getOwnedAttributes().add(symbol_104);
		}
		{ // pivot.ecore::pivot::LetExp::variable
			symbol_105.setName("variable");
			symbol_105.setType(symbol_305);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			
			symbol_105.setIsComposite(true);
			symbol_105.setIsResolveProxies(true);
			symbol_105.setOpposite(symbol_308);
			symbol_103.getOwnedAttributes().add(symbol_105);
		}
		symbol_0.getOwnedTypes().add(symbol_103); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
		//
		// pivot.ecore::pivot::Library http://www.eclipse.org/ocl/3.1.0/Pivot!Library
		//
		symbol_106.setName("Library");
		symbol_106.getSuperClasses().add(symbol_172); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		symbol_0.getOwnedTypes().add(symbol_106); // http://www.eclipse.org/ocl/3.1.0/Pivot!Library
		//
		// pivot.ecore::pivot::LibraryFeature http://www.eclipse.org/ocl/3.1.0/Pivot!LibraryFeature
		//
		symbol_107.setName("LibraryFeature");
		symbol_107.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_0.getOwnedTypes().add(symbol_107); // http://www.eclipse.org/ocl/3.1.0/Pivot!LibraryFeature
		//
		// pivot.ecore::pivot::LiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		//
		symbol_108.setName("LiteralExp");
		symbol_108.getSuperClasses().add(symbol_140); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		symbol_0.getOwnedTypes().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		//
		// pivot.ecore::pivot::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		//
		symbol_109.setName("LoopExp");
		symbol_109.getSuperClasses().add(symbol_17); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		{ // pivot.ecore::pivot::LoopExp::body
			symbol_110.setName("body");
			symbol_110.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_110.setIsComposite(true);
			symbol_110.setIsResolveProxies(true);
			symbol_110.setOpposite(symbol_147);
			symbol_109.getOwnedAttributes().add(symbol_110);
		}
		{ // pivot.ecore::pivot::LoopExp::iterator
			symbol_111.setName("iterator");
			symbol_111.setType(symbol_305);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_111.setLower(BigInteger.valueOf(0));
			symbol_111.setUpper(BigInteger.valueOf(-1));
			symbol_111.setIsOrdered(true);
			
			symbol_111.setIsComposite(true);
			symbol_111.setIsResolveProxies(true);
			symbol_111.setOpposite(symbol_309);
			symbol_109.getOwnedAttributes().add(symbol_111);
		}
		{ // pivot.ecore::pivot::LoopExp::referredIteration
			symbol_112.setName("referredIteration");
			symbol_112.setType(symbol_94);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
			symbol_112.setLower(BigInteger.valueOf(0));
			
			symbol_112.setIsResolveProxies(true);
			symbol_112.setOpposite(symbol_95);
			symbol_109.getOwnedAttributes().add(symbol_112);
		}
		symbol_0.getOwnedTypes().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		//
		// pivot.ecore::pivot::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
		//
		symbol_113.setName("MessageExp");
		symbol_113.getSuperClasses().add(symbol_140); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::MessageExp::argument
			symbol_114.setName("argument");
			symbol_114.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_114.setLower(BigInteger.valueOf(0));
			symbol_114.setUpper(BigInteger.valueOf(-1));
			symbol_114.setIsOrdered(true);
			
			symbol_114.setIsComposite(true);
			symbol_114.setIsResolveProxies(true);
			symbol_113.getOwnedAttributes().add(symbol_114);
		}
		{ // pivot.ecore::pivot::MessageExp::calledOperation
			symbol_115.setName("calledOperation");
			symbol_115.setType(symbol_20);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
			symbol_115.setLower(BigInteger.valueOf(0));
			
			symbol_115.setIsComposite(true);
			symbol_115.setIsResolveProxies(true);
			symbol_115.setOpposite(symbol_21);
			symbol_113.getOwnedAttributes().add(symbol_115);
		}
		{ // pivot.ecore::pivot::MessageExp::sentSignal
			symbol_116.setName("sentSignal");
			symbol_116.setType(symbol_222);  // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
			symbol_116.setLower(BigInteger.valueOf(0));
			
			symbol_116.setIsComposite(true);
			symbol_116.setIsResolveProxies(true);
			symbol_116.setOpposite(symbol_223);
			symbol_113.getOwnedAttributes().add(symbol_116);
		}
		{ // pivot.ecore::pivot::MessageExp::target
			symbol_117.setName("target");
			symbol_117.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_117.setIsComposite(true);
			symbol_117.setIsResolveProxies(true);
			symbol_117.setOpposite(symbol_148);
			symbol_113.getOwnedAttributes().add(symbol_117);
		}
		symbol_0.getOwnedTypes().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
		//
		// pivot.ecore::pivot::MessageType http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
		//
		symbol_118.setName("MessageType");
		symbol_118.getSuperClasses().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		{ // pivot.ecore::pivot::MessageType::referredOperation
			symbol_119.setName("referredOperation");
			symbol_119.setType(symbol_158);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_119.setLower(BigInteger.valueOf(0));
			
			symbol_119.setIsResolveProxies(true);
			symbol_119.setOpposite(symbol_160);
			symbol_118.getOwnedAttributes().add(symbol_119);
		}
		{ // pivot.ecore::pivot::MessageType::referredSignal
			symbol_120.setName("referredSignal");
			symbol_120.setType(symbol_227);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
			symbol_120.setLower(BigInteger.valueOf(0));
			
			symbol_120.setIsResolveProxies(true);
			symbol_120.setOpposite(symbol_228);
			symbol_118.getOwnedAttributes().add(symbol_120);
		}
		symbol_0.getOwnedTypes().add(symbol_118); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
		//
		// pivot.ecore::pivot::MultiplicityElement http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		//
		symbol_121.setName("MultiplicityElement");
		symbol_121.getSuperClasses().add(symbol_58); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::MultiplicityElement::isOrdered
			symbol_122.setName("isOrdered");
			symbol_122.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_122.setIsResolveProxies(true);
			symbol_121.getOwnedAttributes().add(symbol_122);
		}
		{ // pivot.ecore::pivot::MultiplicityElement::isUnique
			symbol_123.setName("isUnique");
			symbol_123.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_123.setIsResolveProxies(true);
			symbol_121.getOwnedAttributes().add(symbol_123);
		}
		{ // pivot.ecore::pivot::MultiplicityElement::lower
			symbol_124.setName("lower");
			symbol_124.setType(symbol_87);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			symbol_124.setLower(BigInteger.valueOf(0));
			
			symbol_124.setIsResolveProxies(true);
			symbol_121.getOwnedAttributes().add(symbol_124);
		}
		{ // pivot.ecore::pivot::MultiplicityElement::upper
			symbol_125.setName("upper");
			symbol_125.setType(symbol_296);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			symbol_125.setLower(BigInteger.valueOf(0));
			
			symbol_125.setIsResolveProxies(true);
			symbol_121.getOwnedAttributes().add(symbol_125);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::includesCardinality()
			Operation symbol_333 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesCardinality(http://www.eclipse.org/ocl/3.1.0/Pivot!Integer)
			symbol_333.setName("includesCardinality");
			symbol_333.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_334 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesCardinality(http://www.eclipse.org/ocl/3.1.0/Pivot!Integer)!C
			symbol_334.setName("C");
			symbol_334.setType(symbol_87);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_333.getOwnedParameters().add(symbol_334);
			symbol_121.getOwnedOperations().add(symbol_333);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::includesMultiplicity()
			Operation symbol_335 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesMultiplicity(http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement)
			symbol_335.setName("includesMultiplicity");
			symbol_335.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_336 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesMultiplicity(http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement)!M
			symbol_336.setName("M");
			symbol_336.setType(symbol_121);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
			
			symbol_335.getOwnedParameters().add(symbol_336);
			symbol_121.getOwnedOperations().add(symbol_335);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::isMultivalued()
			Operation symbol_337 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isMultivalued()
			symbol_337.setName("isMultivalued");
			symbol_337.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_121.getOwnedOperations().add(symbol_337);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::lowerBound()
			Operation symbol_338 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!lowerBound()
			symbol_338.setName("lowerBound");
			symbol_338.setType(symbol_87);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_121.getOwnedOperations().add(symbol_338);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::upperBound()
			Operation symbol_339 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!upperBound()
			symbol_339.setName("upperBound");
			symbol_339.setType(symbol_296);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			
			symbol_121.getOwnedOperations().add(symbol_339);
		}
		symbol_0.getOwnedTypes().add(symbol_121); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		//
		// pivot.ecore::pivot::Nameable http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		//
		symbol_126.setName("Nameable");
		symbol_126.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_0.getOwnedTypes().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		//
		// pivot.ecore::pivot::NamedElement http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		//
		symbol_127.setName("NamedElement");
		symbol_127.getSuperClasses().add(symbol_58); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		symbol_127.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		{ // pivot.ecore::pivot::NamedElement::Constraint
			symbol_128.setName("Constraint");
			symbol_128.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_128.setLower(BigInteger.valueOf(0));
			symbol_128.setUpper(BigInteger.valueOf(-1));
			
			symbol_128.setImplicit(true);
			symbol_128.setIsResolveProxies(true);
			symbol_128.setOpposite(symbol_48);
			symbol_127.getOwnedAttributes().add(symbol_128);
		}
		{ // pivot.ecore::pivot::NamedElement::isStatic
			symbol_129.setName("isStatic");
			symbol_129.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_129.setIsResolveProxies(true);
			symbol_127.getOwnedAttributes().add(symbol_129);
		}
		{ // pivot.ecore::pivot::NamedElement::name
			symbol_130.setName("name");
			symbol_130.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_130.setLower(BigInteger.valueOf(0));
			
			symbol_130.setIsResolveProxies(true);
			symbol_127.getOwnedAttributes().add(symbol_130);
		}
		{ // pivot.ecore::pivot::NamedElement::ownedAnnotation
			symbol_131.setName("ownedAnnotation");
			symbol_131.setType(symbol_1);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
			symbol_131.setLower(BigInteger.valueOf(0));
			symbol_131.setUpper(BigInteger.valueOf(-1));
			symbol_131.setIsOrdered(true);
			
			symbol_131.setIsComposite(true);
			symbol_131.setIsResolveProxies(true);
			symbol_131.setOpposite(symbol_2);
			symbol_127.getOwnedAttributes().add(symbol_131);
		}
		{ // pivot.ecore::pivot::NamedElement::ownedRule
			symbol_132.setName("ownedRule");
			symbol_132.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_132.setLower(BigInteger.valueOf(0));
			symbol_132.setUpper(BigInteger.valueOf(-1));
			symbol_132.setIsOrdered(true);
			
			symbol_132.setIsComposite(true);
			symbol_132.setIsResolveProxies(true);
			symbol_132.setOpposite(symbol_46);
			symbol_127.getOwnedAttributes().add(symbol_132);
		}
		symbol_0.getOwnedTypes().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		//
		// pivot.ecore::pivot::Namespace http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		//
		symbol_133.setName("Namespace");
		symbol_133.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		symbol_0.getOwnedTypes().add(symbol_133); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		//
		// pivot.ecore::pivot::NavigationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		//
		symbol_134.setName("NavigationCallExp");
		symbol_134.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		{ // pivot.ecore::pivot::NavigationCallExp::navigationSource
			symbol_135.setName("navigationSource");
			symbol_135.setType(symbol_197);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_135.setLower(BigInteger.valueOf(0));
			symbol_135.setIsOrdered(true);
			
			symbol_135.setIsResolveProxies(true);
			symbol_135.setOpposite(symbol_198);
			symbol_134.getOwnedAttributes().add(symbol_135);
		}
		{ // pivot.ecore::pivot::NavigationCallExp::qualifier
			symbol_136.setName("qualifier");
			symbol_136.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_136.setLower(BigInteger.valueOf(0));
			symbol_136.setUpper(BigInteger.valueOf(-1));
			symbol_136.setIsOrdered(true);
			
			symbol_136.setIsResolveProxies(true);
			symbol_136.setOpposite(symbol_149);
			symbol_134.getOwnedAttributes().add(symbol_136);
		}
		symbol_0.getOwnedTypes().add(symbol_134); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		//
		// pivot.ecore::pivot::NullLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!NullLiteralExp
		//
		symbol_137.setName("NullLiteralExp");
		symbol_137.getSuperClasses().add(symbol_195); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		symbol_0.getOwnedTypes().add(symbol_137); // http://www.eclipse.org/ocl/3.1.0/Pivot!NullLiteralExp
		//
		// pivot.ecore::pivot::NumericLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		//
		symbol_138.setName("NumericLiteralExp");
		symbol_138.getSuperClasses().add(symbol_195); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		symbol_0.getOwnedTypes().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		//
		// pivot.ecore::pivot::Object http://www.eclipse.org/ocl/3.1.0/Pivot!Object
		//
		symbol_139.setName("Object");
		symbol_139.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_0.getOwnedTypes().add(symbol_139); // http://www.eclipse.org/ocl/3.1.0/Pivot!Object
		//
		// pivot.ecore::pivot::OclExpression http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		//
		symbol_140.setName("OclExpression");
		symbol_140.getSuperClasses().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		{ // pivot.ecore::pivot::OclExpression::CallExp
			symbol_141.setName("CallExp");
			symbol_141.setType(symbol_17);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
			symbol_141.setLower(BigInteger.valueOf(0));
			
			symbol_141.setImplicit(true);
			symbol_141.setIsResolveProxies(true);
			symbol_141.setOpposite(symbol_19);
			symbol_140.getOwnedAttributes().add(symbol_141);
		}
		{ // pivot.ecore::pivot::OclExpression::CollectionItem
			symbol_142.setName("CollectionItem");
			symbol_142.setType(symbol_28);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
			symbol_142.setLower(BigInteger.valueOf(0));
			
			symbol_142.setImplicit(true);
			symbol_142.setIsResolveProxies(true);
			symbol_142.setOpposite(symbol_29);
			symbol_140.getOwnedAttributes().add(symbol_142);
		}
		{ // pivot.ecore::pivot::OclExpression::CollectionRange
			symbol_143.setName("CollectionRange");
			symbol_143.setType(symbol_36);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
			symbol_143.setLower(BigInteger.valueOf(0));
			symbol_143.setUpper(BigInteger.valueOf(-1));
			
			symbol_143.setImplicit(true);
			symbol_143.setIsResolveProxies(true);
			symbol_140.getOwnedAttributes().add(symbol_143);
		}
		{ // pivot.ecore::pivot::OclExpression::ExpressionInOcl
			symbol_144.setName("ExpressionInOcl");
			symbol_144.setType(symbol_71);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
			symbol_144.setLower(BigInteger.valueOf(0));
			symbol_144.setUpper(BigInteger.valueOf(-1));
			
			symbol_144.setImplicit(true);
			symbol_144.setIsResolveProxies(true);
			symbol_140.getOwnedAttributes().add(symbol_144);
		}
		{ // pivot.ecore::pivot::OclExpression::IfExp
			symbol_145.setName("IfExp");
			symbol_145.setType(symbol_82);  // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
			symbol_145.setLower(BigInteger.valueOf(0));
			symbol_145.setUpper(BigInteger.valueOf(-1));
			
			symbol_145.setImplicit(true);
			symbol_145.setIsResolveProxies(true);
			symbol_140.getOwnedAttributes().add(symbol_145);
		}
		{ // pivot.ecore::pivot::OclExpression::LetExp
			symbol_146.setName("LetExp");
			symbol_146.setType(symbol_103);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
			symbol_146.setLower(BigInteger.valueOf(0));
			
			symbol_146.setImplicit(true);
			symbol_146.setIsResolveProxies(true);
			symbol_146.setOpposite(symbol_104);
			symbol_140.getOwnedAttributes().add(symbol_146);
		}
		{ // pivot.ecore::pivot::OclExpression::LoopExp
			symbol_147.setName("LoopExp");
			symbol_147.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
			symbol_147.setLower(BigInteger.valueOf(0));
			
			symbol_147.setImplicit(true);
			symbol_147.setIsResolveProxies(true);
			symbol_147.setOpposite(symbol_110);
			symbol_140.getOwnedAttributes().add(symbol_147);
		}
		{ // pivot.ecore::pivot::OclExpression::MessageExp
			symbol_148.setName("MessageExp");
			symbol_148.setType(symbol_113);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
			symbol_148.setLower(BigInteger.valueOf(0));
			symbol_148.setUpper(BigInteger.valueOf(-1));
			
			symbol_148.setImplicit(true);
			symbol_148.setIsResolveProxies(true);
			symbol_140.getOwnedAttributes().add(symbol_148);
		}
		{ // pivot.ecore::pivot::OclExpression::NavigationCallExp
			symbol_149.setName("NavigationCallExp");
			symbol_149.setType(symbol_134);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
			symbol_149.setLower(BigInteger.valueOf(0));
			symbol_149.setUpper(BigInteger.valueOf(-1));
			
			symbol_149.setImplicit(true);
			symbol_149.setIsResolveProxies(true);
			symbol_149.setOpposite(symbol_136);
			symbol_140.getOwnedAttributes().add(symbol_149);
		}
		{ // pivot.ecore::pivot::OclExpression::OperationCallExp
			symbol_150.setName("OperationCallExp");
			symbol_150.setType(symbol_167);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
			symbol_150.setLower(BigInteger.valueOf(0));
			
			symbol_150.setImplicit(true);
			symbol_150.setIsResolveProxies(true);
			symbol_150.setOpposite(symbol_168);
			symbol_140.getOwnedAttributes().add(symbol_150);
		}
		{ // pivot.ecore::pivot::OclExpression::TupleLiteralPart
			symbol_151.setName("TupleLiteralPart");
			symbol_151.setType(symbol_268);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
			symbol_151.setLower(BigInteger.valueOf(0));
			
			symbol_151.setImplicit(true);
			symbol_151.setIsResolveProxies(true);
			symbol_151.setOpposite(symbol_270);
			symbol_140.getOwnedAttributes().add(symbol_151);
		}
		{ // pivot.ecore::pivot::OclExpression::Variable
			symbol_152.setName("Variable");
			symbol_152.setType(symbol_305);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_152.setLower(BigInteger.valueOf(0));
			
			symbol_152.setImplicit(true);
			symbol_152.setIsResolveProxies(true);
			symbol_152.setOpposite(symbol_311);
			symbol_140.getOwnedAttributes().add(symbol_152);
		}
		symbol_0.getOwnedTypes().add(symbol_140); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		//
		// pivot.ecore::pivot::OpaqueExpression http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		//
		symbol_153.setName("OpaqueExpression");
		symbol_153.getSuperClasses().add(symbol_303); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		{ // pivot.ecore::pivot::OpaqueExpression::body
			symbol_154.setName("body");
			symbol_154.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_154.setLower(BigInteger.valueOf(0));
			symbol_154.setUpper(BigInteger.valueOf(-1));
			symbol_154.setIsOrdered(true);
			symbol_154.setIsUnique(false);
			
			symbol_154.setIsResolveProxies(true);
			symbol_153.getOwnedAttributes().add(symbol_154);
		}
		{ // pivot.ecore::pivot::OpaqueExpression::language
			symbol_155.setName("language");
			symbol_155.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_155.setLower(BigInteger.valueOf(0));
			symbol_155.setUpper(BigInteger.valueOf(-1));
			symbol_155.setIsOrdered(true);
			
			symbol_155.setIsResolveProxies(true);
			symbol_153.getOwnedAttributes().add(symbol_155);
		}
		{ // pivot.ecore::pivot::OpaqueExpression::message
			symbol_156.setName("message");
			symbol_156.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_156.setLower(BigInteger.valueOf(0));
			symbol_156.setUpper(BigInteger.valueOf(-1));
			symbol_156.setIsOrdered(true);
			symbol_156.setIsUnique(false);
			
			symbol_156.setIsResolveProxies(true);
			symbol_153.getOwnedAttributes().add(symbol_156);
		}
		{ // pivot.ecore::pivot::OpaqueExpression::valueExpression
			symbol_157.setName("valueExpression");
			symbol_157.setType(symbol_71);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
			symbol_157.setLower(BigInteger.valueOf(0));
			
			symbol_157.setIsResolveProxies(true);
			symbol_157.setIsTransient(true);
			symbol_153.getOwnedAttributes().add(symbol_157);
		}
		symbol_0.getOwnedTypes().add(symbol_153); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		//
		// pivot.ecore::pivot::Operation http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		//
		symbol_158.setName("Operation");
		symbol_158.getSuperClasses().add(symbol_77); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		symbol_158.getSuperClasses().add(symbol_133); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		symbol_158.getSuperClasses().add(symbol_261); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		symbol_158.getSuperClasses().add(symbol_184); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // pivot.ecore::pivot::Operation::CallOperationAction
			symbol_159.setName("CallOperationAction");
			symbol_159.setType(symbol_20);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
			symbol_159.setLower(BigInteger.valueOf(0));
			symbol_159.setUpper(BigInteger.valueOf(-1));
			
			symbol_159.setImplicit(true);
			symbol_159.setIsResolveProxies(true);
			symbol_159.setOpposite(symbol_22);
			symbol_158.getOwnedAttributes().add(symbol_159);
		}
		{ // pivot.ecore::pivot::Operation::MessageType
			symbol_160.setName("MessageType");
			symbol_160.setType(symbol_118);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
			symbol_160.setLower(BigInteger.valueOf(0));
			symbol_160.setUpper(BigInteger.valueOf(-1));
			
			symbol_160.setImplicit(true);
			symbol_160.setIsResolveProxies(true);
			symbol_160.setOpposite(symbol_119);
			symbol_158.getOwnedAttributes().add(symbol_160);
		}
		{ // pivot.ecore::pivot::Operation::OperationCallExp
			symbol_161.setName("OperationCallExp");
			symbol_161.setType(symbol_167);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
			symbol_161.setLower(BigInteger.valueOf(0));
			symbol_161.setUpper(BigInteger.valueOf(-1));
			
			symbol_161.setImplicit(true);
			symbol_161.setIsResolveProxies(true);
			symbol_161.setOpposite(symbol_169);
			symbol_158.getOwnedAttributes().add(symbol_161);
		}
		{ // pivot.ecore::pivot::Operation::class
			symbol_162.setName("class");
			symbol_162.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
			symbol_162.setLower(BigInteger.valueOf(0));
			
			symbol_162.setIsReadOnly(true);
			symbol_162.setIsResolveProxies(true);
			symbol_162.setIsTransient(true);
			symbol_162.setIsVolatile(true);
			symbol_158.getOwnedAttributes().add(symbol_162);
		}
		{ // pivot.ecore::pivot::Operation::ownedParameter
			symbol_163.setName("ownedParameter");
			symbol_163.setType(symbol_180);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_163.setLower(BigInteger.valueOf(0));
			symbol_163.setUpper(BigInteger.valueOf(-1));
			symbol_163.setIsOrdered(true);
			
			symbol_163.setIsComposite(true);
			symbol_163.setIsResolveProxies(true);
			symbol_163.setOpposite(symbol_183);
			symbol_158.getOwnedAttributes().add(symbol_163);
		}
		{ // pivot.ecore::pivot::Operation::owningType
			symbol_164.setName("owningType");
			symbol_164.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_164.setLower(BigInteger.valueOf(0));
			
			symbol_164.setIsResolveProxies(true);
			symbol_164.setOpposite(symbol_285);
			symbol_158.getOwnedAttributes().add(symbol_164);
		}
		{ // pivot.ecore::pivot::Operation::precedence
			symbol_165.setName("precedence");
			symbol_165.setType(symbol_190);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
			symbol_165.setLower(BigInteger.valueOf(0));
			
			symbol_165.setIsResolveProxies(true);
			symbol_165.setOpposite(symbol_191);
			symbol_158.getOwnedAttributes().add(symbol_165);
		}
		{ // pivot.ecore::pivot::Operation::raisedException
			symbol_166.setName("raisedException");
			symbol_166.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_166.setLower(BigInteger.valueOf(0));
			symbol_166.setUpper(BigInteger.valueOf(-1));
			
			symbol_166.setIsResolveProxies(true);
			symbol_166.setOpposite(symbol_277);
			symbol_158.getOwnedAttributes().add(symbol_166);
		}
		symbol_0.getOwnedTypes().add(symbol_158); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		//
		// pivot.ecore::pivot::OperationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
		//
		symbol_167.setName("OperationCallExp");
		symbol_167.getSuperClasses().add(symbol_80); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		{ // pivot.ecore::pivot::OperationCallExp::argument
			symbol_168.setName("argument");
			symbol_168.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_168.setLower(BigInteger.valueOf(0));
			symbol_168.setUpper(BigInteger.valueOf(-1));
			symbol_168.setIsOrdered(true);
			
			symbol_168.setIsComposite(true);
			symbol_168.setIsResolveProxies(true);
			symbol_168.setOpposite(symbol_150);
			symbol_167.getOwnedAttributes().add(symbol_168);
		}
		{ // pivot.ecore::pivot::OperationCallExp::referredOperation
			symbol_169.setName("referredOperation");
			symbol_169.setType(symbol_158);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_169.setLower(BigInteger.valueOf(0));
			
			symbol_169.setIsResolveProxies(true);
			symbol_169.setOpposite(symbol_161);
			symbol_167.getOwnedAttributes().add(symbol_169);
		}
		symbol_0.getOwnedTypes().add(symbol_167); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
		//
		// pivot.ecore::pivot::OperationTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!OperationTemplateParameter
		//
		symbol_170.setName("OperationTemplateParameter");
		symbol_170.getSuperClasses().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		symbol_0.getOwnedTypes().add(symbol_170); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationTemplateParameter
		//
		// pivot.ecore::pivot::OrderedSetType http://www.eclipse.org/ocl/3.1.0/Pivot!OrderedSetType
		//
		symbol_171.setName("OrderedSetType");
		symbol_171.getSuperClasses().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		symbol_0.getOwnedTypes().add(symbol_171); // http://www.eclipse.org/ocl/3.1.0/Pivot!OrderedSetType
		//
		// pivot.ecore::pivot::Package http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		//
		symbol_172.setName("Package");
		symbol_172.getSuperClasses().add(symbol_133); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		symbol_172.getSuperClasses().add(symbol_261); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		{ // pivot.ecore::pivot::Package::nestedPackage
			symbol_173.setName("nestedPackage");
			symbol_173.setType(symbol_172);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_173.setLower(BigInteger.valueOf(0));
			symbol_173.setUpper(BigInteger.valueOf(-1));
			
			symbol_173.setIsComposite(true);
			symbol_173.setIsResolveProxies(true);
			symbol_173.setOpposite(symbol_174);
			symbol_172.getOwnedAttributes().add(symbol_173);
		}
		{ // pivot.ecore::pivot::Package::nestingPackage
			symbol_174.setName("nestingPackage");
			symbol_174.setType(symbol_172);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_174.setLower(BigInteger.valueOf(0));
			
			symbol_174.setIsResolveProxies(true);
			symbol_174.setOpposite(symbol_173);
			symbol_172.getOwnedAttributes().add(symbol_174);
		}
		{ // pivot.ecore::pivot::Package::nsPrefix
			symbol_175.setName("nsPrefix");
			symbol_175.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_175.setLower(BigInteger.valueOf(0));
			
			symbol_175.setIsResolveProxies(true);
			symbol_172.getOwnedAttributes().add(symbol_175);
		}
		{ // pivot.ecore::pivot::Package::nsURI
			symbol_176.setName("nsURI");
			symbol_176.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_176.setLower(BigInteger.valueOf(0));
			
			symbol_176.setIsResolveProxies(true);
			symbol_172.getOwnedAttributes().add(symbol_176);
		}
		{ // pivot.ecore::pivot::Package::ownedPrecedence
			symbol_177.setName("ownedPrecedence");
			symbol_177.setType(symbol_190);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
			symbol_177.setLower(BigInteger.valueOf(0));
			symbol_177.setUpper(BigInteger.valueOf(-1));
			symbol_177.setIsOrdered(true);
			
			symbol_177.setIsComposite(true);
			symbol_177.setIsResolveProxies(true);
			symbol_177.setOpposite(symbol_192);
			symbol_172.getOwnedAttributes().add(symbol_177);
		}
		{ // pivot.ecore::pivot::Package::ownedType
			symbol_178.setName("ownedType");
			symbol_178.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_178.setLower(BigInteger.valueOf(0));
			symbol_178.setUpper(BigInteger.valueOf(-1));
			
			symbol_178.setIsComposite(true);
			symbol_178.setIsResolveProxies(true);
			symbol_178.setOpposite(symbol_286);
			symbol_172.getOwnedAttributes().add(symbol_178);
		}
		symbol_0.getOwnedTypes().add(symbol_172); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		//
		// pivot.ecore::pivot::PackageableElement http://www.eclipse.org/ocl/3.1.0/Pivot!PackageableElement
		//
		symbol_179.setName("PackageableElement");
		symbol_179.getSuperClasses().add(symbol_184); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		symbol_0.getOwnedTypes().add(symbol_179); // http://www.eclipse.org/ocl/3.1.0/Pivot!PackageableElement
		//
		// pivot.ecore::pivot::Parameter http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
		//
		symbol_180.setName("Parameter");
		symbol_180.getSuperClasses().add(symbol_295); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		symbol_180.getSuperClasses().add(symbol_313); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		{ // pivot.ecore::pivot::Parameter::Iteration
			symbol_181.setName("Iteration");
			symbol_181.setType(symbol_94);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
			symbol_181.setLower(BigInteger.valueOf(0));
			symbol_181.setUpper(BigInteger.valueOf(-1));
			
			symbol_181.setImplicit(true);
			symbol_181.setIsResolveProxies(true);
			symbol_180.getOwnedAttributes().add(symbol_181);
		}
		{ // pivot.ecore::pivot::Parameter::Variable
			symbol_182.setName("Variable");
			symbol_182.setType(symbol_305);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_182.setLower(BigInteger.valueOf(0));
			symbol_182.setUpper(BigInteger.valueOf(-1));
			
			symbol_182.setImplicit(true);
			symbol_182.setIsResolveProxies(true);
			symbol_182.setOpposite(symbol_312);
			symbol_180.getOwnedAttributes().add(symbol_182);
		}
		{ // pivot.ecore::pivot::Parameter::operation
			symbol_183.setName("operation");
			symbol_183.setType(symbol_158);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_183.setLower(BigInteger.valueOf(0));
			
			symbol_183.setIsResolveProxies(true);
			symbol_183.setOpposite(symbol_163);
			symbol_180.getOwnedAttributes().add(symbol_183);
		}
		symbol_0.getOwnedTypes().add(symbol_180); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
		//
		// pivot.ecore::pivot::ParameterableElement http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		//
		symbol_184.setName("ParameterableElement");
		symbol_184.getSuperClasses().add(symbol_58); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::ParameterableElement::TemplateParameter
			symbol_185.setName("TemplateParameter");
			symbol_185.setType(symbol_241);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_185.setLower(BigInteger.valueOf(0));
			symbol_185.setUpper(BigInteger.valueOf(-1));
			
			symbol_185.setImplicit(true);
			symbol_185.setIsResolveProxies(true);
			symbol_184.getOwnedAttributes().add(symbol_185);
		}
		{ // pivot.ecore::pivot::ParameterableElement::TemplateParameterSubstitution
			symbol_186.setName("TemplateParameterSubstitution");
			symbol_186.setType(symbol_249);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
			symbol_186.setLower(BigInteger.valueOf(0));
			symbol_186.setUpper(BigInteger.valueOf(-1));
			
			symbol_186.setImplicit(true);
			symbol_186.setIsResolveProxies(true);
			symbol_184.getOwnedAttributes().add(symbol_186);
		}
		{ // pivot.ecore::pivot::ParameterableElement::owningTemplateParameter
			symbol_187.setName("owningTemplateParameter");
			symbol_187.setType(symbol_241);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_187.setLower(BigInteger.valueOf(0));
			
			symbol_187.setIsResolveProxies(true);
			symbol_187.setOpposite(symbol_246);
			symbol_184.getOwnedAttributes().add(symbol_187);
		}
		{ // pivot.ecore::pivot::ParameterableElement::templateParameter
			symbol_188.setName("templateParameter");
			symbol_188.setType(symbol_241);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_188.setLower(BigInteger.valueOf(0));
			
			symbol_188.setIsResolveProxies(true);
			symbol_188.setOpposite(symbol_247);
			symbol_184.getOwnedAttributes().add(symbol_188);
		}
		{	// pivot.ecore::pivot::ParameterableElement::isTemplateParameter()
			Operation symbol_340 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!isTemplateParameter()
			symbol_340.setName("isTemplateParameter");
			symbol_340.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_184.getOwnedOperations().add(symbol_340);
		}
		symbol_0.getOwnedTypes().add(symbol_184); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		//
		// pivot.ecore::pivot::Pivotable http://www.eclipse.org/ocl/3.1.0/Pivot!Pivotable
		//
		symbol_189.setName("Pivotable");
		symbol_189.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_0.getOwnedTypes().add(symbol_189); // http://www.eclipse.org/ocl/3.1.0/Pivot!Pivotable
		//
		// pivot.ecore::pivot::Precedence http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
		//
		symbol_190.setName("Precedence");
		symbol_190.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::Precedence::Operation
			symbol_191.setName("Operation");
			symbol_191.setType(symbol_158);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_191.setLower(BigInteger.valueOf(0));
			symbol_191.setUpper(BigInteger.valueOf(-1));
			
			symbol_191.setImplicit(true);
			symbol_191.setIsResolveProxies(true);
			symbol_191.setOpposite(symbol_165);
			symbol_190.getOwnedAttributes().add(symbol_191);
		}
		{ // pivot.ecore::pivot::Precedence::Package
			symbol_192.setName("Package");
			symbol_192.setType(symbol_172);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_192.setLower(BigInteger.valueOf(0));
			
			symbol_192.setImplicit(true);
			symbol_192.setIsResolveProxies(true);
			symbol_192.setOpposite(symbol_177);
			symbol_190.getOwnedAttributes().add(symbol_192);
		}
		{ // pivot.ecore::pivot::Precedence::associativity
			symbol_193.setName("associativity");
			symbol_193.setType(symbol_12);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
			symbol_193.setLower(BigInteger.valueOf(0));
			
			symbol_193.setIsResolveProxies(true);
			symbol_190.getOwnedAttributes().add(symbol_193);
		}
		{ // pivot.ecore::pivot::Precedence::order
			symbol_194.setName("order");
			symbol_194.setType(symbol_87);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_194.setIsDerived(true);
			symbol_194.setIsResolveProxies(true);
			symbol_194.setIsTransient(true);
			symbol_194.setIsVolatile(true);
			symbol_190.getOwnedAttributes().add(symbol_194);
		}
		symbol_0.getOwnedTypes().add(symbol_190); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
		//
		// pivot.ecore::pivot::PrimitiveLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		//
		symbol_195.setName("PrimitiveLiteralExp");
		symbol_195.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		symbol_0.getOwnedTypes().add(symbol_195); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		//
		// pivot.ecore::pivot::PrimitiveType http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveType
		//
		symbol_196.setName("PrimitiveType");
		symbol_196.getSuperClasses().add(symbol_52); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		symbol_0.getOwnedTypes().add(symbol_196); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveType
		//
		// pivot.ecore::pivot::Property http://www.eclipse.org/ocl/3.1.0/Pivot!Property
		//
		symbol_197.setName("Property");
		symbol_197.getSuperClasses().add(symbol_77); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		symbol_197.getSuperClasses().add(symbol_184); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // pivot.ecore::pivot::Property::NavigationCallExp
			symbol_198.setName("NavigationCallExp");
			symbol_198.setType(symbol_134);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
			symbol_198.setLower(BigInteger.valueOf(0));
			symbol_198.setUpper(BigInteger.valueOf(-1));
			
			symbol_198.setImplicit(true);
			symbol_198.setIsResolveProxies(true);
			symbol_198.setOpposite(symbol_135);
			symbol_197.getOwnedAttributes().add(symbol_198);
		}
		{ // pivot.ecore::pivot::Property::Property
			symbol_199.setName("Property");
			symbol_199.setType(symbol_197);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_199.setLower(BigInteger.valueOf(0));
			symbol_199.setUpper(BigInteger.valueOf(-1));
			
			symbol_199.setImplicit(true);
			symbol_199.setIsResolveProxies(true);
			symbol_197.getOwnedAttributes().add(symbol_199);
		}
		{ // pivot.ecore::pivot::Property::PropertyCallExp
			symbol_200.setName("PropertyCallExp");
			symbol_200.setType(symbol_216);  // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
			symbol_200.setLower(BigInteger.valueOf(0));
			symbol_200.setUpper(BigInteger.valueOf(-1));
			
			symbol_200.setImplicit(true);
			symbol_200.setIsResolveProxies(true);
			symbol_200.setOpposite(symbol_217);
			symbol_197.getOwnedAttributes().add(symbol_200);
		}
		{ // pivot.ecore::pivot::Property::association
			symbol_201.setName("association");
			symbol_201.setType(symbol_7);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
			symbol_201.setLower(BigInteger.valueOf(0));
			
			symbol_201.setIsResolveProxies(true);
			symbol_201.setOpposite(symbol_9);
			symbol_197.getOwnedAttributes().add(symbol_201);
		}
		{ // pivot.ecore::pivot::Property::class
			symbol_202.setName("class");
			symbol_202.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
			symbol_202.setLower(BigInteger.valueOf(0));
			
			symbol_202.setIsReadOnly(true);
			symbol_202.setIsResolveProxies(true);
			symbol_202.setIsTransient(true);
			symbol_202.setIsVolatile(true);
			symbol_197.getOwnedAttributes().add(symbol_202);
		}
		{ // pivot.ecore::pivot::Property::default
			symbol_203.setName("default");
			symbol_203.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_203.setLower(BigInteger.valueOf(0));
			
			symbol_203.setIsResolveProxies(true);
			symbol_197.getOwnedAttributes().add(symbol_203);
		}
		{ // pivot.ecore::pivot::Property::implicit
			symbol_204.setName("implicit");
			symbol_204.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_204.setLower(BigInteger.valueOf(0));
			
			symbol_204.setIsResolveProxies(true);
			symbol_197.getOwnedAttributes().add(symbol_204);
		}
		{ // pivot.ecore::pivot::Property::isComposite
			symbol_205.setName("isComposite");
			symbol_205.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_205.setIsResolveProxies(true);
			symbol_197.getOwnedAttributes().add(symbol_205);
		}
		{ // pivot.ecore::pivot::Property::isDerived
			symbol_206.setName("isDerived");
			symbol_206.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_206.setIsResolveProxies(true);
			symbol_197.getOwnedAttributes().add(symbol_206);
		}
		{ // pivot.ecore::pivot::Property::isID
			symbol_207.setName("isID");
			symbol_207.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_207.setIsResolveProxies(true);
			symbol_197.getOwnedAttributes().add(symbol_207);
		}
		{ // pivot.ecore::pivot::Property::isReadOnly
			symbol_208.setName("isReadOnly");
			symbol_208.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_208.setIsResolveProxies(true);
			symbol_197.getOwnedAttributes().add(symbol_208);
		}
		{ // pivot.ecore::pivot::Property::isResolveProxies
			symbol_209.setName("isResolveProxies");
			symbol_209.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_209.setIsResolveProxies(true);
			symbol_197.getOwnedAttributes().add(symbol_209);
		}
		{ // pivot.ecore::pivot::Property::isTransient
			symbol_210.setName("isTransient");
			symbol_210.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_210.setIsResolveProxies(true);
			symbol_197.getOwnedAttributes().add(symbol_210);
		}
		{ // pivot.ecore::pivot::Property::isUnsettable
			symbol_211.setName("isUnsettable");
			symbol_211.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_211.setIsResolveProxies(true);
			symbol_197.getOwnedAttributes().add(symbol_211);
		}
		{ // pivot.ecore::pivot::Property::isVolatile
			symbol_212.setName("isVolatile");
			symbol_212.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_212.setIsResolveProxies(true);
			symbol_197.getOwnedAttributes().add(symbol_212);
		}
		{ // pivot.ecore::pivot::Property::keys
			symbol_213.setName("keys");
			symbol_213.setType(symbol_197);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_213.setLower(BigInteger.valueOf(0));
			symbol_213.setUpper(BigInteger.valueOf(-1));
			
			symbol_213.setIsResolveProxies(true);
			symbol_197.getOwnedAttributes().add(symbol_213);
		}
		{ // pivot.ecore::pivot::Property::opposite
			symbol_214.setName("opposite");
			symbol_214.setType(symbol_197);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_214.setLower(BigInteger.valueOf(0));
			
			symbol_214.setIsResolveProxies(true);
			symbol_214.setOpposite(symbol_199);
			symbol_197.getOwnedAttributes().add(symbol_214);
		}
		{ // pivot.ecore::pivot::Property::owningType
			symbol_215.setName("owningType");
			symbol_215.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_215.setLower(BigInteger.valueOf(0));
			
			symbol_215.setIsResolveProxies(true);
			symbol_215.setOpposite(symbol_284);
			symbol_197.getOwnedAttributes().add(symbol_215);
		}
		symbol_0.getOwnedTypes().add(symbol_197); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
		//
		// pivot.ecore::pivot::PropertyCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
		//
		symbol_216.setName("PropertyCallExp");
		symbol_216.getSuperClasses().add(symbol_134); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		{ // pivot.ecore::pivot::PropertyCallExp::referredProperty
			symbol_217.setName("referredProperty");
			symbol_217.setType(symbol_197);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_217.setLower(BigInteger.valueOf(0));
			
			symbol_217.setIsResolveProxies(true);
			symbol_217.setOpposite(symbol_200);
			symbol_216.getOwnedAttributes().add(symbol_217);
		}
		symbol_0.getOwnedTypes().add(symbol_216); // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
		//
		// pivot.ecore::pivot::RealLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp
		//
		symbol_219.setName("RealLiteralExp");
		symbol_219.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		{ // pivot.ecore::pivot::RealLiteralExp::realSymbol
			symbol_220.setName("realSymbol");
			symbol_220.setType(symbol_218);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Real
			
			symbol_220.setIsResolveProxies(true);
			symbol_219.getOwnedAttributes().add(symbol_220);
		}
		symbol_0.getOwnedTypes().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp
		//
		// pivot.ecore::pivot::SelfType http://www.eclipse.org/ocl/3.1.0/Pivot!SelfType
		//
		symbol_221.setName("SelfType");
		symbol_221.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		symbol_0.getOwnedTypes().add(symbol_221); // http://www.eclipse.org/ocl/3.1.0/Pivot!SelfType
		//
		// pivot.ecore::pivot::SendSignalAction http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
		//
		symbol_222.setName("SendSignalAction");
		symbol_222.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::SendSignalAction::MessageExp
			symbol_223.setName("MessageExp");
			symbol_223.setType(symbol_113);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
			symbol_223.setLower(BigInteger.valueOf(0));
			
			symbol_223.setImplicit(true);
			symbol_223.setIsResolveProxies(true);
			symbol_223.setOpposite(symbol_116);
			symbol_222.getOwnedAttributes().add(symbol_223);
		}
		{ // pivot.ecore::pivot::SendSignalAction::signal
			symbol_224.setName("signal");
			symbol_224.setType(symbol_227);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
			
			symbol_224.setIsResolveProxies(true);
			symbol_224.setOpposite(symbol_229);
			symbol_222.getOwnedAttributes().add(symbol_224);
		}
		symbol_0.getOwnedTypes().add(symbol_222); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
		//
		// pivot.ecore::pivot::SequenceType http://www.eclipse.org/ocl/3.1.0/Pivot!SequenceType
		//
		symbol_225.setName("SequenceType");
		symbol_225.getSuperClasses().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		symbol_0.getOwnedTypes().add(symbol_225); // http://www.eclipse.org/ocl/3.1.0/Pivot!SequenceType
		//
		// pivot.ecore::pivot::SetType http://www.eclipse.org/ocl/3.1.0/Pivot!SetType
		//
		symbol_226.setName("SetType");
		symbol_226.getSuperClasses().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		symbol_0.getOwnedTypes().add(symbol_226); // http://www.eclipse.org/ocl/3.1.0/Pivot!SetType
		//
		// pivot.ecore::pivot::Signal http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
		//
		symbol_227.setName("Signal");
		symbol_227.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::Signal::MessageType
			symbol_228.setName("MessageType");
			symbol_228.setType(symbol_118);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
			symbol_228.setLower(BigInteger.valueOf(0));
			symbol_228.setUpper(BigInteger.valueOf(-1));
			
			symbol_228.setImplicit(true);
			symbol_228.setIsResolveProxies(true);
			symbol_228.setOpposite(symbol_120);
			symbol_227.getOwnedAttributes().add(symbol_228);
		}
		{ // pivot.ecore::pivot::Signal::SendSignalAction
			symbol_229.setName("SendSignalAction");
			symbol_229.setType(symbol_222);  // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
			symbol_229.setLower(BigInteger.valueOf(0));
			symbol_229.setUpper(BigInteger.valueOf(-1));
			
			symbol_229.setImplicit(true);
			symbol_229.setIsResolveProxies(true);
			symbol_229.setOpposite(symbol_224);
			symbol_227.getOwnedAttributes().add(symbol_229);
		}
		symbol_0.getOwnedTypes().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
		//
		// pivot.ecore::pivot::State http://www.eclipse.org/ocl/3.1.0/Pivot!State
		//
		symbol_230.setName("State");
		symbol_230.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::State::StateExp
			symbol_231.setName("StateExp");
			symbol_231.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
			symbol_231.setLower(BigInteger.valueOf(0));
			symbol_231.setUpper(BigInteger.valueOf(-1));
			
			symbol_231.setImplicit(true);
			symbol_231.setIsResolveProxies(true);
			symbol_231.setOpposite(symbol_233);
			symbol_230.getOwnedAttributes().add(symbol_231);
		}
		symbol_0.getOwnedTypes().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/Pivot!State
		//
		// pivot.ecore::pivot::StateExp http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
		//
		symbol_232.setName("StateExp");
		symbol_232.getSuperClasses().add(symbol_140); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::StateExp::referredState
			symbol_233.setName("referredState");
			symbol_233.setType(symbol_230);  // http://www.eclipse.org/ocl/3.1.0/Pivot!State
			symbol_233.setLower(BigInteger.valueOf(0));
			
			symbol_233.setIsResolveProxies(true);
			symbol_233.setOpposite(symbol_231);
			symbol_232.getOwnedAttributes().add(symbol_233);
		}
		symbol_0.getOwnedTypes().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
		//
		// pivot.ecore::pivot::StringLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp
		//
		symbol_235.setName("StringLiteralExp");
		symbol_235.getSuperClasses().add(symbol_195); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		{ // pivot.ecore::pivot::StringLiteralExp::stringSymbol
			symbol_236.setName("stringSymbol");
			symbol_236.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			
			symbol_236.setIsResolveProxies(true);
			symbol_235.getOwnedAttributes().add(symbol_236);
		}
		symbol_0.getOwnedTypes().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp
		//
		// pivot.ecore::pivot::TemplateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
		//
		symbol_237.setName("TemplateBinding");
		symbol_237.getSuperClasses().add(symbol_58); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::TemplateBinding::boundElement
			symbol_238.setName("boundElement");
			symbol_238.setType(symbol_261);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
			
			symbol_238.setIsResolveProxies(true);
			symbol_238.setOpposite(symbol_263);
			symbol_237.getOwnedAttributes().add(symbol_238);
		}
		{ // pivot.ecore::pivot::TemplateBinding::parameterSubstitution
			symbol_239.setName("parameterSubstitution");
			symbol_239.setType(symbol_249);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
			symbol_239.setLower(BigInteger.valueOf(0));
			symbol_239.setUpper(BigInteger.valueOf(-1));
			
			symbol_239.setIsComposite(true);
			symbol_239.setIsResolveProxies(true);
			symbol_239.setOpposite(symbol_253);
			symbol_237.getOwnedAttributes().add(symbol_239);
		}
		{ // pivot.ecore::pivot::TemplateBinding::signature
			symbol_240.setName("signature");
			symbol_240.setType(symbol_256);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			
			symbol_240.setIsResolveProxies(true);
			symbol_240.setOpposite(symbol_257);
			symbol_237.getOwnedAttributes().add(symbol_240);
		}
		symbol_0.getOwnedTypes().add(symbol_237); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
		//
		// pivot.ecore::pivot::TemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		//
		symbol_241.setName("TemplateParameter");
		symbol_241.getSuperClasses().add(symbol_58); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::TemplateParameter::TemplateParameterSubstitution
			symbol_242.setName("TemplateParameterSubstitution");
			symbol_242.setType(symbol_249);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
			symbol_242.setLower(BigInteger.valueOf(0));
			symbol_242.setUpper(BigInteger.valueOf(-1));
			
			symbol_242.setImplicit(true);
			symbol_242.setIsResolveProxies(true);
			symbol_242.setOpposite(symbol_251);
			symbol_241.getOwnedAttributes().add(symbol_242);
		}
		{ // pivot.ecore::pivot::TemplateParameter::TemplateSignature
			symbol_243.setName("TemplateSignature");
			symbol_243.setType(symbol_256);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			symbol_243.setLower(BigInteger.valueOf(0));
			symbol_243.setUpper(BigInteger.valueOf(-1));
			
			symbol_243.setImplicit(true);
			symbol_243.setIsResolveProxies(true);
			symbol_243.setOpposite(symbol_259);
			symbol_241.getOwnedAttributes().add(symbol_243);
		}
		{ // pivot.ecore::pivot::TemplateParameter::default
			symbol_244.setName("default");
			symbol_244.setType(symbol_184);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_244.setLower(BigInteger.valueOf(0));
			
			symbol_244.setIsResolveProxies(true);
			symbol_244.setOpposite(symbol_185);
			symbol_241.getOwnedAttributes().add(symbol_244);
		}
		{ // pivot.ecore::pivot::TemplateParameter::ownedDefault
			symbol_245.setName("ownedDefault");
			symbol_245.setType(symbol_184);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_245.setLower(BigInteger.valueOf(0));
			
			symbol_245.setIsComposite(true);
			symbol_245.setIsResolveProxies(true);
			symbol_241.getOwnedAttributes().add(symbol_245);
		}
		{ // pivot.ecore::pivot::TemplateParameter::ownedParameteredElement
			symbol_246.setName("ownedParameteredElement");
			symbol_246.setType(symbol_184);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_246.setLower(BigInteger.valueOf(0));
			
			symbol_246.setIsComposite(true);
			symbol_246.setIsResolveProxies(true);
			symbol_246.setOpposite(symbol_187);
			symbol_241.getOwnedAttributes().add(symbol_246);
		}
		{ // pivot.ecore::pivot::TemplateParameter::parameteredElement
			symbol_247.setName("parameteredElement");
			symbol_247.setType(symbol_184);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			
			symbol_247.setIsResolveProxies(true);
			symbol_247.setOpposite(symbol_188);
			symbol_241.getOwnedAttributes().add(symbol_247);
		}
		{ // pivot.ecore::pivot::TemplateParameter::signature
			symbol_248.setName("signature");
			symbol_248.setType(symbol_256);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			
			symbol_248.setIsResolveProxies(true);
			symbol_248.setOpposite(symbol_258);
			symbol_241.getOwnedAttributes().add(symbol_248);
		}
		symbol_0.getOwnedTypes().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		//
		// pivot.ecore::pivot::TemplateParameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
		//
		symbol_249.setName("TemplateParameterSubstitution");
		symbol_249.getSuperClasses().add(symbol_58); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::actual
			symbol_250.setName("actual");
			symbol_250.setType(symbol_184);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			
			symbol_250.setIsResolveProxies(true);
			symbol_250.setOpposite(symbol_186);
			symbol_249.getOwnedAttributes().add(symbol_250);
		}
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::formal
			symbol_251.setName("formal");
			symbol_251.setType(symbol_241);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			
			symbol_251.setIsResolveProxies(true);
			symbol_251.setOpposite(symbol_242);
			symbol_249.getOwnedAttributes().add(symbol_251);
		}
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::ownedActual
			symbol_252.setName("ownedActual");
			symbol_252.setType(symbol_184);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_252.setLower(BigInteger.valueOf(0));
			
			symbol_252.setIsComposite(true);
			symbol_252.setIsResolveProxies(true);
			symbol_249.getOwnedAttributes().add(symbol_252);
		}
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::templateBinding
			symbol_253.setName("templateBinding");
			symbol_253.setType(symbol_237);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
			
			symbol_253.setIsResolveProxies(true);
			symbol_253.setOpposite(symbol_239);
			symbol_249.getOwnedAttributes().add(symbol_253);
		}
		symbol_0.getOwnedTypes().add(symbol_249); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
		//
		// pivot.ecore::pivot::TemplateParameterType http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType
		//
		symbol_254.setName("TemplateParameterType");
		symbol_254.getSuperClasses().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		{ // pivot.ecore::pivot::TemplateParameterType::specification
			symbol_255.setName("specification");
			symbol_255.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_255.setLower(BigInteger.valueOf(0));
			
			symbol_255.setIsResolveProxies(true);
			symbol_254.getOwnedAttributes().add(symbol_255);
		}
		symbol_0.getOwnedTypes().add(symbol_254); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType
		//
		// pivot.ecore::pivot::TemplateSignature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
		//
		symbol_256.setName("TemplateSignature");
		symbol_256.getSuperClasses().add(symbol_58); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::TemplateSignature::TemplateBinding
			symbol_257.setName("TemplateBinding");
			symbol_257.setType(symbol_237);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
			symbol_257.setLower(BigInteger.valueOf(0));
			symbol_257.setUpper(BigInteger.valueOf(-1));
			
			symbol_257.setImplicit(true);
			symbol_257.setIsResolveProxies(true);
			symbol_257.setOpposite(symbol_240);
			symbol_256.getOwnedAttributes().add(symbol_257);
		}
		{ // pivot.ecore::pivot::TemplateSignature::ownedParameter
			symbol_258.setName("ownedParameter");
			symbol_258.setType(symbol_241);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_258.setLower(BigInteger.valueOf(0));
			symbol_258.setUpper(BigInteger.valueOf(-1));
			symbol_258.setIsOrdered(true);
			
			symbol_258.setIsComposite(true);
			symbol_258.setIsResolveProxies(true);
			symbol_258.setOpposite(symbol_248);
			symbol_256.getOwnedAttributes().add(symbol_258);
		}
		{ // pivot.ecore::pivot::TemplateSignature::parameter
			symbol_259.setName("parameter");
			symbol_259.setType(symbol_241);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_259.setUpper(BigInteger.valueOf(-1));
			symbol_259.setIsOrdered(true);
			
			symbol_259.setIsResolveProxies(true);
			symbol_259.setOpposite(symbol_243);
			symbol_256.getOwnedAttributes().add(symbol_259);
		}
		{ // pivot.ecore::pivot::TemplateSignature::template
			symbol_260.setName("template");
			symbol_260.setType(symbol_261);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
			
			symbol_260.setIsResolveProxies(true);
			symbol_260.setOpposite(symbol_262);
			symbol_256.getOwnedAttributes().add(symbol_260);
		}
		symbol_0.getOwnedTypes().add(symbol_256); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
		//
		// pivot.ecore::pivot::TemplateableElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		//
		symbol_261.setName("TemplateableElement");
		symbol_261.getSuperClasses().add(symbol_58); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::TemplateableElement::ownedTemplateSignature
			symbol_262.setName("ownedTemplateSignature");
			symbol_262.setType(symbol_256);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			symbol_262.setLower(BigInteger.valueOf(0));
			
			symbol_262.setIsComposite(true);
			symbol_262.setIsResolveProxies(true);
			symbol_262.setOpposite(symbol_260);
			symbol_261.getOwnedAttributes().add(symbol_262);
		}
		{ // pivot.ecore::pivot::TemplateableElement::templateBinding
			symbol_263.setName("templateBinding");
			symbol_263.setType(symbol_237);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
			symbol_263.setLower(BigInteger.valueOf(0));
			symbol_263.setUpper(BigInteger.valueOf(-1));
			
			symbol_263.setIsComposite(true);
			symbol_263.setIsResolveProxies(true);
			symbol_263.setOpposite(symbol_238);
			symbol_261.getOwnedAttributes().add(symbol_263);
		}
		{ // pivot.ecore::pivot::TemplateableElement::unspecializedElement
			symbol_264.setName("unspecializedElement");
			symbol_264.setType(symbol_261);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
			symbol_264.setLower(BigInteger.valueOf(0));
			
			symbol_264.setIsTransient(true);
			symbol_261.getOwnedAttributes().add(symbol_264);
		}
		{	// pivot.ecore::pivot::TemplateableElement::isTemplate()
			Operation symbol_341 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!isTemplate()
			symbol_341.setName("isTemplate");
			symbol_341.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_261.getOwnedOperations().add(symbol_341);
		}
		{	// pivot.ecore::pivot::TemplateableElement::parameterableElements()
			Operation symbol_342 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!parameterableElements()
			symbol_342.setName("parameterableElements");
			symbol_342.setType(symbol_184);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_342.setLower(BigInteger.valueOf(0));
			symbol_342.setUpper(BigInteger.valueOf(-1));
			
			symbol_261.getOwnedOperations().add(symbol_342);
		}
		symbol_0.getOwnedTypes().add(symbol_261); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		//
		// pivot.ecore::pivot::Throwable http://www.eclipse.org/ocl/3.1.0/Pivot!Throwable
		//
		symbol_265.setName("Throwable");
		symbol_265.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_0.getOwnedTypes().add(symbol_265); // http://www.eclipse.org/ocl/3.1.0/Pivot!Throwable
		//
		// pivot.ecore::pivot::TupleLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
		//
		symbol_266.setName("TupleLiteralExp");
		symbol_266.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		{ // pivot.ecore::pivot::TupleLiteralExp::part
			symbol_267.setName("part");
			symbol_267.setType(symbol_268);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
			symbol_267.setLower(BigInteger.valueOf(0));
			symbol_267.setUpper(BigInteger.valueOf(-1));
			symbol_267.setIsOrdered(true);
			
			symbol_267.setIsComposite(true);
			symbol_267.setIsResolveProxies(true);
			symbol_267.setOpposite(symbol_269);
			symbol_266.getOwnedAttributes().add(symbol_267);
		}
		symbol_0.getOwnedTypes().add(symbol_266); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
		//
		// pivot.ecore::pivot::TupleLiteralPart http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
		//
		symbol_268.setName("TupleLiteralPart");
		symbol_268.getSuperClasses().add(symbol_313); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		{ // pivot.ecore::pivot::TupleLiteralPart::TupleLiteralExp
			symbol_269.setName("TupleLiteralExp");
			symbol_269.setType(symbol_266);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
			symbol_269.setLower(BigInteger.valueOf(0));
			
			symbol_269.setImplicit(true);
			symbol_269.setIsResolveProxies(true);
			symbol_269.setOpposite(symbol_267);
			symbol_268.getOwnedAttributes().add(symbol_269);
		}
		{ // pivot.ecore::pivot::TupleLiteralPart::initExpression
			symbol_270.setName("initExpression");
			symbol_270.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_270.setLower(BigInteger.valueOf(0));
			
			symbol_270.setIsComposite(true);
			symbol_270.setIsResolveProxies(true);
			symbol_270.setOpposite(symbol_151);
			symbol_268.getOwnedAttributes().add(symbol_270);
		}
		symbol_0.getOwnedTypes().add(symbol_268); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
		//
		// pivot.ecore::pivot::TupleType http://www.eclipse.org/ocl/3.1.0/Pivot!TupleType
		//
		symbol_271.setName("TupleType");
		symbol_271.getSuperClasses().add(symbol_52); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		symbol_0.getOwnedTypes().add(symbol_271); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleType
		//
		// pivot.ecore::pivot::Type http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		//
		symbol_272.setName("Type");
		symbol_272.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		symbol_272.getSuperClasses().add(symbol_261); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		symbol_272.getSuperClasses().add(symbol_184); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // pivot.ecore::pivot::Type::ClassifierType
			symbol_273.setName("ClassifierType");
			symbol_273.setType(symbol_26);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
			symbol_273.setLower(BigInteger.valueOf(0));
			symbol_273.setUpper(BigInteger.valueOf(-1));
			
			symbol_273.setImplicit(true);
			symbol_273.setIsResolveProxies(true);
			symbol_273.setOpposite(symbol_27);
			symbol_272.getOwnedAttributes().add(symbol_273);
		}
		{ // pivot.ecore::pivot::Type::CollectionType
			symbol_274.setName("CollectionType");
			symbol_274.setType(symbol_39);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
			symbol_274.setLower(BigInteger.valueOf(0));
			symbol_274.setUpper(BigInteger.valueOf(-1));
			
			symbol_274.setImplicit(true);
			symbol_274.setIsResolveProxies(true);
			symbol_274.setOpposite(symbol_40);
			symbol_272.getOwnedAttributes().add(symbol_274);
		}
		{ // pivot.ecore::pivot::Type::DataType
			symbol_275.setName("DataType");
			symbol_275.setType(symbol_52);  // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
			symbol_275.setLower(BigInteger.valueOf(0));
			symbol_275.setUpper(BigInteger.valueOf(-1));
			
			symbol_275.setImplicit(true);
			symbol_275.setIsResolveProxies(true);
			symbol_275.setOpposite(symbol_53);
			symbol_272.getOwnedAttributes().add(symbol_275);
		}
		{ // pivot.ecore::pivot::Type::LambdaType
			symbol_276.setName("LambdaType");
			symbol_276.setType(symbol_99);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
			symbol_276.setLower(BigInteger.valueOf(0));
			symbol_276.setUpper(BigInteger.valueOf(-1));
			
			symbol_276.setImplicit(true);
			symbol_276.setIsResolveProxies(true);
			symbol_272.getOwnedAttributes().add(symbol_276);
		}
		{ // pivot.ecore::pivot::Type::Operation
			symbol_277.setName("Operation");
			symbol_277.setType(symbol_158);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_277.setLower(BigInteger.valueOf(0));
			symbol_277.setUpper(BigInteger.valueOf(-1));
			
			symbol_277.setImplicit(true);
			symbol_277.setIsResolveProxies(true);
			symbol_277.setOpposite(symbol_166);
			symbol_272.getOwnedAttributes().add(symbol_277);
		}
		{ // pivot.ecore::pivot::Type::Type
			symbol_278.setName("Type");
			symbol_278.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_278.setLower(BigInteger.valueOf(0));
			symbol_278.setUpper(BigInteger.valueOf(-1));
			
			symbol_278.setImplicit(true);
			symbol_278.setIsResolveProxies(true);
			symbol_278.setOpposite(symbol_287);
			symbol_272.getOwnedAttributes().add(symbol_278);
		}
		{ // pivot.ecore::pivot::Type::TypeExp
			symbol_279.setName("TypeExp");
			symbol_279.setType(symbol_288);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
			symbol_279.setLower(BigInteger.valueOf(0));
			symbol_279.setUpper(BigInteger.valueOf(-1));
			
			symbol_279.setImplicit(true);
			symbol_279.setIsResolveProxies(true);
			symbol_279.setOpposite(symbol_289);
			symbol_272.getOwnedAttributes().add(symbol_279);
		}
		{ // pivot.ecore::pivot::Type::TypeTemplateParameter
			symbol_280.setName("TypeTemplateParameter");
			symbol_280.setType(symbol_290);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
			symbol_280.setLower(BigInteger.valueOf(0));
			symbol_280.setUpper(BigInteger.valueOf(-1));
			
			symbol_280.setImplicit(true);
			symbol_280.setIsResolveProxies(true);
			symbol_280.setOpposite(symbol_292);
			symbol_272.getOwnedAttributes().add(symbol_280);
		}
		{ // pivot.ecore::pivot::Type::TypedElement
			symbol_281.setName("TypedElement");
			symbol_281.setType(symbol_293);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
			symbol_281.setLower(BigInteger.valueOf(0));
			symbol_281.setUpper(BigInteger.valueOf(-1));
			
			symbol_281.setImplicit(true);
			symbol_281.setIsResolveProxies(true);
			symbol_281.setOpposite(symbol_294);
			symbol_272.getOwnedAttributes().add(symbol_281);
		}
		{ // pivot.ecore::pivot::Type::UnspecifiedType
			symbol_282.setName("UnspecifiedType");
			symbol_282.setType(symbol_299);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
			symbol_282.setLower(BigInteger.valueOf(0));
			symbol_282.setUpper(BigInteger.valueOf(-1));
			
			symbol_282.setImplicit(true);
			symbol_282.setIsResolveProxies(true);
			symbol_272.getOwnedAttributes().add(symbol_282);
		}
		{ // pivot.ecore::pivot::Type::instanceClassName
			symbol_283.setName("instanceClassName");
			symbol_283.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_283.setLower(BigInteger.valueOf(0));
			
			symbol_283.setIsResolveProxies(true);
			symbol_272.getOwnedAttributes().add(symbol_283);
		}
		{ // pivot.ecore::pivot::Type::ownedAttribute
			symbol_284.setName("ownedAttribute");
			symbol_284.setType(symbol_197);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_284.setLower(BigInteger.valueOf(0));
			symbol_284.setUpper(BigInteger.valueOf(-1));
			symbol_284.setIsOrdered(true);
			
			symbol_284.setIsComposite(true);
			symbol_284.setIsResolveProxies(true);
			symbol_284.setOpposite(symbol_215);
			symbol_272.getOwnedAttributes().add(symbol_284);
		}
		{ // pivot.ecore::pivot::Type::ownedOperation
			symbol_285.setName("ownedOperation");
			symbol_285.setType(symbol_158);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_285.setLower(BigInteger.valueOf(0));
			symbol_285.setUpper(BigInteger.valueOf(-1));
			symbol_285.setIsOrdered(true);
			
			symbol_285.setIsComposite(true);
			symbol_285.setIsResolveProxies(true);
			symbol_285.setOpposite(symbol_164);
			symbol_272.getOwnedAttributes().add(symbol_285);
		}
		{ // pivot.ecore::pivot::Type::package
			symbol_286.setName("package");
			symbol_286.setType(symbol_172);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_286.setLower(BigInteger.valueOf(0));
			
			symbol_286.setIsResolveProxies(true);
			symbol_286.setOpposite(symbol_178);
			symbol_272.getOwnedAttributes().add(symbol_286);
		}
		{ // pivot.ecore::pivot::Type::superClass
			symbol_287.setName("superClass");
			symbol_287.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_287.setLower(BigInteger.valueOf(0));
			symbol_287.setUpper(BigInteger.valueOf(-1));
			symbol_287.setIsOrdered(true);
			
			symbol_287.setIsResolveProxies(true);
			symbol_287.setOpposite(symbol_278);
			symbol_272.getOwnedAttributes().add(symbol_287);
		}
		symbol_0.getOwnedTypes().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		//
		// pivot.ecore::pivot::TypeExp http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
		//
		symbol_288.setName("TypeExp");
		symbol_288.getSuperClasses().add(symbol_140); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::TypeExp::referredType
			symbol_289.setName("referredType");
			symbol_289.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_289.setLower(BigInteger.valueOf(0));
			
			symbol_289.setIsResolveProxies(true);
			symbol_289.setOpposite(symbol_279);
			symbol_288.getOwnedAttributes().add(symbol_289);
		}
		symbol_0.getOwnedTypes().add(symbol_288); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
		//
		// pivot.ecore::pivot::TypeTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
		//
		symbol_290.setName("TypeTemplateParameter");
		symbol_290.getSuperClasses().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		{ // pivot.ecore::pivot::TypeTemplateParameter::allowSubstitutable
			symbol_291.setName("allowSubstitutable");
			symbol_291.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_291.setIsResolveProxies(true);
			symbol_290.getOwnedAttributes().add(symbol_291);
		}
		{ // pivot.ecore::pivot::TypeTemplateParameter::constrainingType
			symbol_292.setName("constrainingType");
			symbol_292.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_292.setLower(BigInteger.valueOf(0));
			symbol_292.setUpper(BigInteger.valueOf(-1));
			
			symbol_292.setIsResolveProxies(true);
			symbol_292.setOpposite(symbol_280);
			symbol_290.getOwnedAttributes().add(symbol_292);
		}
		symbol_0.getOwnedTypes().add(symbol_290); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
		//
		// pivot.ecore::pivot::TypedElement http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		//
		symbol_293.setName("TypedElement");
		symbol_293.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::TypedElement::type
			symbol_294.setName("type");
			symbol_294.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_294.setLower(BigInteger.valueOf(0));
			
			symbol_294.setIsResolveProxies(true);
			symbol_294.setOpposite(symbol_281);
			symbol_293.getOwnedAttributes().add(symbol_294);
		}
		symbol_0.getOwnedTypes().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		//
		// pivot.ecore::pivot::TypedMultiplicityElement http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		//
		symbol_295.setName("TypedMultiplicityElement");
		symbol_295.getSuperClasses().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		symbol_295.getSuperClasses().add(symbol_121); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		symbol_0.getOwnedTypes().add(symbol_295); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		//
		// pivot.ecore::pivot::UnlimitedNaturalLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp
		//
		symbol_297.setName("UnlimitedNaturalLiteralExp");
		symbol_297.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		{ // pivot.ecore::pivot::UnlimitedNaturalLiteralExp::unlimitedNaturalSymbol
			symbol_298.setName("unlimitedNaturalSymbol");
			symbol_298.setType(symbol_296);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			
			symbol_298.setIsResolveProxies(true);
			symbol_297.getOwnedAttributes().add(symbol_298);
		}
		symbol_0.getOwnedTypes().add(symbol_297); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp
		//
		// pivot.ecore::pivot::UnspecifiedType http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
		//
		symbol_299.setName("UnspecifiedType");
		symbol_299.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		{ // pivot.ecore::pivot::UnspecifiedType::lowerBound
			symbol_300.setName("lowerBound");
			symbol_300.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_300.setIsResolveProxies(true);
			symbol_300.setOpposite(symbol_282);
			symbol_299.getOwnedAttributes().add(symbol_300);
		}
		{ // pivot.ecore::pivot::UnspecifiedType::upperBound
			symbol_301.setName("upperBound");
			symbol_301.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_301.setIsResolveProxies(true);
			symbol_299.getOwnedAttributes().add(symbol_301);
		}
		symbol_0.getOwnedTypes().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
		//
		// pivot.ecore::pivot::UnspecifiedValueExp http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedValueExp
		//
		symbol_302.setName("UnspecifiedValueExp");
		symbol_302.getSuperClasses().add(symbol_140); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		symbol_0.getOwnedTypes().add(symbol_302); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedValueExp
		//
		// pivot.ecore::pivot::ValueSpecification http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		//
		symbol_303.setName("ValueSpecification");
		symbol_303.getSuperClasses().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		symbol_303.getSuperClasses().add(symbol_184); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // pivot.ecore::pivot::ValueSpecification::Constraint
			symbol_304.setName("Constraint");
			symbol_304.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_304.setLower(BigInteger.valueOf(0));
			
			symbol_304.setImplicit(true);
			symbol_304.setIsResolveProxies(true);
			symbol_304.setOpposite(symbol_50);
			symbol_303.getOwnedAttributes().add(symbol_304);
		}
		{	// pivot.ecore::pivot::ValueSpecification::booleanValue()
			Operation symbol_343 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!booleanValue()
			symbol_343.setName("booleanValue");
			symbol_343.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_303.getOwnedOperations().add(symbol_343);
		}
		{	// pivot.ecore::pivot::ValueSpecification::integerValue()
			Operation symbol_344 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!integerValue()
			symbol_344.setName("integerValue");
			symbol_344.setType(symbol_87);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_303.getOwnedOperations().add(symbol_344);
		}
		{	// pivot.ecore::pivot::ValueSpecification::isComputable()
			Operation symbol_345 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!isComputable()
			symbol_345.setName("isComputable");
			symbol_345.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_303.getOwnedOperations().add(symbol_345);
		}
		{	// pivot.ecore::pivot::ValueSpecification::isNull()
			Operation symbol_346 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!isNull()
			symbol_346.setName("isNull");
			symbol_346.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_303.getOwnedOperations().add(symbol_346);
		}
		{	// pivot.ecore::pivot::ValueSpecification::stringValue()
			Operation symbol_347 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!stringValue()
			symbol_347.setName("stringValue");
			symbol_347.setType(symbol_234);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			
			symbol_303.getOwnedOperations().add(symbol_347);
		}
		{	// pivot.ecore::pivot::ValueSpecification::unlimitedValue()
			Operation symbol_348 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!unlimitedValue()
			symbol_348.setName("unlimitedValue");
			symbol_348.setType(symbol_296);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			
			symbol_303.getOwnedOperations().add(symbol_348);
		}
		symbol_0.getOwnedTypes().add(symbol_303); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		//
		// pivot.ecore::pivot::Variable http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
		//
		symbol_305.setName("Variable");
		symbol_305.getSuperClasses().add(symbol_313); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		{ // pivot.ecore::pivot::Variable::ExpressionInOcl
			symbol_306.setName("ExpressionInOcl");
			symbol_306.setType(symbol_71);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
			symbol_306.setLower(BigInteger.valueOf(0));
			symbol_306.setUpper(BigInteger.valueOf(-1));
			
			symbol_306.setImplicit(true);
			symbol_306.setIsResolveProxies(true);
			symbol_305.getOwnedAttributes().add(symbol_306);
		}
		{ // pivot.ecore::pivot::Variable::IterateExp
			symbol_307.setName("IterateExp");
			symbol_307.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
			symbol_307.setLower(BigInteger.valueOf(0));
			
			symbol_307.setImplicit(true);
			symbol_307.setIsResolveProxies(true);
			symbol_307.setOpposite(symbol_93);
			symbol_305.getOwnedAttributes().add(symbol_307);
		}
		{ // pivot.ecore::pivot::Variable::LetExp
			symbol_308.setName("LetExp");
			symbol_308.setType(symbol_103);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
			symbol_308.setLower(BigInteger.valueOf(0));
			
			symbol_308.setImplicit(true);
			symbol_308.setIsResolveProxies(true);
			symbol_308.setOpposite(symbol_105);
			symbol_305.getOwnedAttributes().add(symbol_308);
		}
		{ // pivot.ecore::pivot::Variable::LoopExp
			symbol_309.setName("LoopExp");
			symbol_309.setType(symbol_109);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
			symbol_309.setLower(BigInteger.valueOf(0));
			
			symbol_309.setImplicit(true);
			symbol_309.setIsResolveProxies(true);
			symbol_309.setOpposite(symbol_111);
			symbol_305.getOwnedAttributes().add(symbol_309);
		}
		{ // pivot.ecore::pivot::Variable::implicit
			symbol_310.setName("implicit");
			symbol_310.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_310.setLower(BigInteger.valueOf(0));
			
			symbol_310.setIsResolveProxies(true);
			symbol_305.getOwnedAttributes().add(symbol_310);
		}
		{ // pivot.ecore::pivot::Variable::initExpression
			symbol_311.setName("initExpression");
			symbol_311.setType(symbol_140);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_311.setLower(BigInteger.valueOf(0));
			
			symbol_311.setIsComposite(true);
			symbol_311.setIsResolveProxies(true);
			symbol_311.setOpposite(symbol_152);
			symbol_305.getOwnedAttributes().add(symbol_311);
		}
		{ // pivot.ecore::pivot::Variable::representedParameter
			symbol_312.setName("representedParameter");
			symbol_312.setType(symbol_180);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_312.setLower(BigInteger.valueOf(0));
			
			symbol_312.setIsResolveProxies(true);
			symbol_312.setOpposite(symbol_182);
			symbol_305.getOwnedAttributes().add(symbol_312);
		}
		symbol_0.getOwnedTypes().add(symbol_305); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
		//
		// pivot.ecore::pivot::VariableDeclaration http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		//
		symbol_313.setName("VariableDeclaration");
		symbol_313.getSuperClasses().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		{ // pivot.ecore::pivot::VariableDeclaration::VariableExp
			symbol_314.setName("VariableExp");
			symbol_314.setType(symbol_315);  // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
			symbol_314.setLower(BigInteger.valueOf(0));
			symbol_314.setUpper(BigInteger.valueOf(-1));
			
			symbol_314.setImplicit(true);
			symbol_314.setIsResolveProxies(true);
			symbol_314.setOpposite(symbol_317);
			symbol_313.getOwnedAttributes().add(symbol_314);
		}
		symbol_0.getOwnedTypes().add(symbol_313); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		//
		// pivot.ecore::pivot::VariableExp http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
		//
		symbol_315.setName("VariableExp");
		symbol_315.getSuperClasses().add(symbol_140); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::VariableExp::implicit
			symbol_316.setName("implicit");
			symbol_316.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_316.setLower(BigInteger.valueOf(0));
			
			symbol_316.setIsResolveProxies(true);
			symbol_315.getOwnedAttributes().add(symbol_316);
		}
		{ // pivot.ecore::pivot::VariableExp::referredVariable
			symbol_317.setName("referredVariable");
			symbol_317.setType(symbol_313);  // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
			symbol_317.setLower(BigInteger.valueOf(0));
			
			symbol_317.setIsResolveProxies(true);
			symbol_317.setOpposite(symbol_314);
			symbol_315.getOwnedAttributes().add(symbol_317);
		}
		symbol_0.getOwnedTypes().add(symbol_315); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
		//
		// pivot.ecore::pivot::Visitable http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		//
		symbol_318.setName("Visitable");
		symbol_318.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_0.getOwnedTypes().add(symbol_318); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		//
		// pivot.ecore::pivot::Visitor http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}
		//
		symbol_319.setName("Visitor");
		symbol_322.setName("R");
		symbol_321.setOwnedParameteredElement(symbol_322);
		symbol_320.getOwnedParameters().add(symbol_321);
		symbol_324.setName("C");
		symbol_323.setOwnedParameteredElement(symbol_324);
		symbol_320.getOwnedParameters().add(symbol_323);
		
		symbol_319.setOwnedTemplateSignature(symbol_320);
		symbol_319.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_0.getOwnedTypes().add(symbol_319); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}
		//
		// pivot.ecore::pivot::VoidType http://www.eclipse.org/ocl/3.1.0/Pivot!VoidType
		//
		symbol_325.setName("VoidType");
		symbol_325.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		symbol_0.getOwnedTypes().add(symbol_325); // http://www.eclipse.org/ocl/3.1.0/Pivot!VoidType

		Class elementClass = (Class) PivotUtil.getNamedElement(symbol_0.getOwnedTypes(), "Element");
		elementClass.getSuperClasses().clear();
		elementClass.getSuperClasses().add(standardLibrary.getOclElementType());
		for (Type pivotClass : symbol_0.getOwnedTypes()) {
			if (pivotClass instanceof Enumeration) {
				List<Type> superClasses = ((Enumeration) pivotClass).getSuperClasses();
				if (superClasses.isEmpty()) {
					superClasses.add(standardLibrary.getEnumerationType());
				}
			}
//			else if (pivotClass instanceof Class) {
//				List<Class> superClasses = ((Class) pivotClass).getSuperClasses();
//				if (superClasses.isEmpty()) {
//					superClasses.add(standardLibrary.getClassifierType());
//				}
//			}
		}
		
		return symbol_0;
	}
}
