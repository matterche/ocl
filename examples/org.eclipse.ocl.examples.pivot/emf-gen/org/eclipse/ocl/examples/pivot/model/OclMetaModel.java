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
 * from: model/Pivot.ecore
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
 * auto-generated from model/Pivot.ecore.
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
		Property symbol_2 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!NamedElement // Pivot.ecore::pivot::Annotation::NamedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!NamedElement
		Property symbol_3 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!ownedContent // Pivot.ecore::pivot::Annotation::ownedContent http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!ownedContent
		Property symbol_4 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!ownedDetail // Pivot.ecore::pivot::Annotation::ownedDetail http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!ownedDetail
		Property symbol_5 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!reference // Pivot.ecore::pivot::Annotation::reference http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!reference
		
		Class symbol_6 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AnyType
		
		Class symbol_7 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
		Property symbol_8 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass!AssociationClassCallExp // Pivot.ecore::pivot::AssociationClass::AssociationClassCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass!AssociationClassCallExp
		Property symbol_9 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass!unownedAttribute // Pivot.ecore::pivot::AssociationClass::unownedAttribute http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass!unownedAttribute
		
		Class symbol_10 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
		Property symbol_11 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp!referredAssociationClass // Pivot.ecore::pivot::AssociationClassCallExp::referredAssociationClass http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp!referredAssociationClass
		
		Enumeration symbol_12 = PivotFactory.eINSTANCE.createEnumeration(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
		
		Class symbol_13 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!BagType
		
		PrimitiveType symbol_14 = standardLibrary.getBooleanType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
		Class symbol_15 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp
		Property symbol_16 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp!booleanSymbol // Pivot.ecore::pivot::BooleanLiteralExp::booleanSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp!booleanSymbol
		
		Class symbol_17 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		Property symbol_18 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp!implicit // Pivot.ecore::pivot::CallExp::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp!implicit
		Property symbol_19 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp!source // Pivot.ecore::pivot::CallExp::source http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp!source
		
		Class symbol_20 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
		Property symbol_21 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction!MessageExp // Pivot.ecore::pivot::CallOperationAction::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction!MessageExp
		Property symbol_22 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction!operation // Pivot.ecore::pivot::CallOperationAction::operation http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction!operation
		
		Class symbol_23 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		Property symbol_24 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class!isAbstract // Pivot.ecore::pivot::Class::isAbstract http://www.eclipse.org/ocl/3.1.0/Pivot!Class!isAbstract
		Property symbol_25 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class!isInterface // Pivot.ecore::pivot::Class::isInterface http://www.eclipse.org/ocl/3.1.0/Pivot!Class!isInterface
		
		Class symbol_26 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
		Property symbol_27 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType!instanceType // Pivot.ecore::pivot::ClassifierType::instanceType http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType!instanceType
		
		Class symbol_28 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
		Property symbol_29 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem!item // Pivot.ecore::pivot::CollectionItem::item http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem!item
		
		Enumeration symbol_30 = PivotFactory.eINSTANCE.createEnumeration(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
		
		Class symbol_31 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp
		Property symbol_32 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp!kind // Pivot.ecore::pivot::CollectionLiteralExp::kind http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp!kind
		Property symbol_33 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp!part // Pivot.ecore::pivot::CollectionLiteralExp::part http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp!part
		
		Class symbol_34 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		Property symbol_35 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart!CollectionLiteralExp // Pivot.ecore::pivot::CollectionLiteralPart::CollectionLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart!CollectionLiteralExp
		
		Class symbol_36 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
		Property symbol_37 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange!first // Pivot.ecore::pivot::CollectionRange::first http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange!first
		Property symbol_38 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange!last // Pivot.ecore::pivot::CollectionRange::last http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange!last
		
		Class symbol_39 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		Property symbol_40 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType!elementType // Pivot.ecore::pivot::CollectionType::elementType http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType!elementType
		
		Class symbol_41 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
		Property symbol_42 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!Element // Pivot.ecore::pivot::Comment::Element http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!Element
		Property symbol_43 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!annotatedElement // Pivot.ecore::pivot::Comment::annotatedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!annotatedElement
		Property symbol_44 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!body // Pivot.ecore::pivot::Comment::body http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!body
		
		Class symbol_45 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
		Property symbol_46 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!constrainedElement // Pivot.ecore::pivot::Constraint::constrainedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!constrainedElement
		Property symbol_47 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!context // Pivot.ecore::pivot::Constraint::context http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!context
		Property symbol_48 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!isCallable // Pivot.ecore::pivot::Constraint::isCallable http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!isCallable
		Property symbol_49 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!specification // Pivot.ecore::pivot::Constraint::specification http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!specification
		Property symbol_50 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!stereotype // Pivot.ecore::pivot::Constraint::stereotype http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!stereotype
		
		Class symbol_51 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorExp
		Property symbol_52 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorExp!part // Pivot.ecore::pivot::ConstructorExp::part http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorExp!part
		
		Class symbol_53 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorPart
		Property symbol_54 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorPart!ConstructorExp // Pivot.ecore::pivot::ConstructorPart::ConstructorExp http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorPart!ConstructorExp
		Property symbol_55 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorPart!initExpression // Pivot.ecore::pivot::ConstructorPart::initExpression http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorPart!initExpression
		Property symbol_56 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorPart!referredProperty // Pivot.ecore::pivot::ConstructorPart::referredProperty http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorPart!referredProperty
		
		Class symbol_57 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		Property symbol_58 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!behavioralType // Pivot.ecore::pivot::DataType::behavioralType http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!behavioralType
		Property symbol_59 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!isSerializable // Pivot.ecore::pivot::DataType::isSerializable http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!isSerializable
		
		Class symbol_60 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
		Property symbol_61 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!Annotation // Pivot.ecore::pivot::Detail::Annotation http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!Annotation
		Property symbol_62 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!value // Pivot.ecore::pivot::Detail::value http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!value
		
		Class symbol_63 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		Property symbol_64 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Annotation // Pivot.ecore::pivot::Element::Annotation http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Annotation
		Property symbol_65 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Comment // Pivot.ecore::pivot::Element::Comment http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Comment
		Property symbol_66 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Constraint // Pivot.ecore::pivot::Element::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Constraint
		Property symbol_67 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!ownedComment // Pivot.ecore::pivot::Element::ownedComment http://www.eclipse.org/ocl/3.1.0/Pivot!Element!ownedComment
		
		Class symbol_68 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
		Property symbol_69 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp!referredEnumLiteral // Pivot.ecore::pivot::EnumLiteralExp::referredEnumLiteral http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp!referredEnumLiteral
		
		Class symbol_70 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
		Property symbol_71 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration!ownedLiteral // Pivot.ecore::pivot::Enumeration::ownedLiteral http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration!ownedLiteral
		
		Class symbol_72 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
		Property symbol_73 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!EnumLiteralExp // Pivot.ecore::pivot::EnumerationLiteral::EnumLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!EnumLiteralExp
		Property symbol_74 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!enumeration // Pivot.ecore::pivot::EnumerationLiteral::enumeration http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!enumeration
		Property symbol_75 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!value // Pivot.ecore::pivot::EnumerationLiteral::value http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!value
		
		Class symbol_76 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
		Property symbol_77 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!bodyExpression // Pivot.ecore::pivot::ExpressionInOcl::bodyExpression http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!bodyExpression
		Property symbol_78 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!contextVariable // Pivot.ecore::pivot::ExpressionInOcl::contextVariable http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!contextVariable
		Property symbol_79 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!messageExpression // Pivot.ecore::pivot::ExpressionInOcl::messageExpression http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!messageExpression
		Property symbol_80 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!parameterVariable // Pivot.ecore::pivot::ExpressionInOcl::parameterVariable http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!parameterVariable
		Property symbol_81 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!resultVariable // Pivot.ecore::pivot::ExpressionInOcl::resultVariable http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!resultVariable
		
		Class symbol_82 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		Property symbol_83 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementation // Pivot.ecore::pivot::Feature::implementation http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementation
		Property symbol_84 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementationClass // Pivot.ecore::pivot::Feature::implementationClass http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementationClass
		
		Class symbol_85 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		Property symbol_86 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp!isPre // Pivot.ecore::pivot::FeatureCallExp::isPre http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp!isPre
		
		Class symbol_87 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
		Property symbol_88 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!condition // Pivot.ecore::pivot::IfExp::condition http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!condition
		Property symbol_89 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!elseExpression // Pivot.ecore::pivot::IfExp::elseExpression http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!elseExpression
		Property symbol_90 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!thenExpression // Pivot.ecore::pivot::IfExp::thenExpression http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!thenExpression
		
		DataType symbol_91 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Int
		
		PrimitiveType symbol_92 = standardLibrary.getIntegerType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
		Class symbol_93 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp
		Property symbol_94 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp!integerSymbol // Pivot.ecore::pivot::IntegerLiteralExp::integerSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp!integerSymbol
		
		Class symbol_95 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidLiteralExp
		
		Class symbol_96 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidType
		
		Class symbol_97 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
		Property symbol_98 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp!result // Pivot.ecore::pivot::IterateExp::result http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp!result
		
		Class symbol_99 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
		Property symbol_100 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!LoopExp // Pivot.ecore::pivot::Iteration::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!LoopExp
		Property symbol_101 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedAccumulator // Pivot.ecore::pivot::Iteration::ownedAccumulator http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedAccumulator
		Property symbol_102 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedIterator // Pivot.ecore::pivot::Iteration::ownedIterator http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedIterator
		
		Class symbol_103 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IteratorExp
		
		Class symbol_104 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
		Property symbol_105 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!contextType // Pivot.ecore::pivot::LambdaType::contextType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!contextType
		Property symbol_106 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!parameterType // Pivot.ecore::pivot::LambdaType::parameterType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!parameterType
		Property symbol_107 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!resultType // Pivot.ecore::pivot::LambdaType::resultType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!resultType
		
		Class symbol_108 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
		Property symbol_109 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!in // Pivot.ecore::pivot::LetExp::in http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!in
		Property symbol_110 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!variable // Pivot.ecore::pivot::LetExp::variable http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!variable
		
		Class symbol_111 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Library
		
		DataType symbol_112 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LibraryFeature
		
		Class symbol_113 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		
		Class symbol_114 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		Property symbol_115 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!body // Pivot.ecore::pivot::LoopExp::body http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!body
		Property symbol_116 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!iterator // Pivot.ecore::pivot::LoopExp::iterator http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!iterator
		Property symbol_117 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!referredIteration // Pivot.ecore::pivot::LoopExp::referredIteration http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!referredIteration
		
		Class symbol_118 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
		Property symbol_119 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!argument // Pivot.ecore::pivot::MessageExp::argument http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!argument
		Property symbol_120 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!calledOperation // Pivot.ecore::pivot::MessageExp::calledOperation http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!calledOperation
		Property symbol_121 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!sentSignal // Pivot.ecore::pivot::MessageExp::sentSignal http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!sentSignal
		Property symbol_122 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!target // Pivot.ecore::pivot::MessageExp::target http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!target
		
		Class symbol_123 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
		Property symbol_124 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredOperation // Pivot.ecore::pivot::MessageType::referredOperation http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredOperation
		Property symbol_125 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredSignal // Pivot.ecore::pivot::MessageType::referredSignal http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredSignal
		
		Class symbol_126 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		Property symbol_127 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isOrdered // Pivot.ecore::pivot::MultiplicityElement::isOrdered http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isOrdered
		Property symbol_128 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isUnique // Pivot.ecore::pivot::MultiplicityElement::isUnique http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isUnique
		Property symbol_129 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!lower // Pivot.ecore::pivot::MultiplicityElement::lower http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!lower
		Property symbol_130 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!upper // Pivot.ecore::pivot::MultiplicityElement::upper http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!upper
		
		Class symbol_131 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		
		Class symbol_132 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		Property symbol_133 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!isStatic // Pivot.ecore::pivot::NamedElement::isStatic http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!isStatic
		Property symbol_134 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!name // Pivot.ecore::pivot::NamedElement::name http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!name
		Property symbol_135 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedAnnotation // Pivot.ecore::pivot::NamedElement::ownedAnnotation http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedAnnotation
		Property symbol_136 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedRule // Pivot.ecore::pivot::NamedElement::ownedRule http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedRule
		
		Class symbol_137 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		
		Class symbol_138 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		Property symbol_139 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!navigationSource // Pivot.ecore::pivot::NavigationCallExp::navigationSource http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!navigationSource
		Property symbol_140 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!qualifier // Pivot.ecore::pivot::NavigationCallExp::qualifier http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!qualifier
		
		Class symbol_141 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NullLiteralExp
		
		Class symbol_142 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		
		DataType symbol_143 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Object
		
		Class symbol_144 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		Property symbol_145 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CallExp // Pivot.ecore::pivot::OclExpression::CallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CallExp
		Property symbol_146 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionItem // Pivot.ecore::pivot::OclExpression::CollectionItem http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionItem
		Property symbol_147 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionRange // Pivot.ecore::pivot::OclExpression::CollectionRange http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionRange
		Property symbol_148 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!ConstructorPart // Pivot.ecore::pivot::OclExpression::ConstructorPart http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!ConstructorPart
		Property symbol_149 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!ExpressionInOcl // Pivot.ecore::pivot::OclExpression::ExpressionInOcl http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!ExpressionInOcl
		Property symbol_150 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!IfExp // Pivot.ecore::pivot::OclExpression::IfExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!IfExp
		Property symbol_151 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LetExp // Pivot.ecore::pivot::OclExpression::LetExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LetExp
		Property symbol_152 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LoopExp // Pivot.ecore::pivot::OclExpression::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LoopExp
		Property symbol_153 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!MessageExp // Pivot.ecore::pivot::OclExpression::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!MessageExp
		Property symbol_154 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!NavigationCallExp // Pivot.ecore::pivot::OclExpression::NavigationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!NavigationCallExp
		Property symbol_155 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!OperationCallExp // Pivot.ecore::pivot::OclExpression::OperationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!OperationCallExp
		Property symbol_156 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!TupleLiteralPart // Pivot.ecore::pivot::OclExpression::TupleLiteralPart http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!TupleLiteralPart
		Property symbol_157 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!Variable // Pivot.ecore::pivot::OclExpression::Variable http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!Variable
		
		Class symbol_158 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		Property symbol_159 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!body // Pivot.ecore::pivot::OpaqueExpression::body http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!body
		Property symbol_160 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!language // Pivot.ecore::pivot::OpaqueExpression::language http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!language
		Property symbol_161 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!message // Pivot.ecore::pivot::OpaqueExpression::message http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!message
		Property symbol_162 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!valueExpression // Pivot.ecore::pivot::OpaqueExpression::valueExpression http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!valueExpression
		
		Class symbol_163 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		Property symbol_164 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!CallOperationAction // Pivot.ecore::pivot::Operation::CallOperationAction http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!CallOperationAction
		Property symbol_165 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!MessageType // Pivot.ecore::pivot::Operation::MessageType http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!MessageType
		Property symbol_166 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!OperationCallExp // Pivot.ecore::pivot::Operation::OperationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!OperationCallExp
		Property symbol_167 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!class // Pivot.ecore::pivot::Operation::class http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!class
		Property symbol_168 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!ownedParameter // Pivot.ecore::pivot::Operation::ownedParameter http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!ownedParameter
		Property symbol_169 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!owningType // Pivot.ecore::pivot::Operation::owningType http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!owningType
		Property symbol_170 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!precedence // Pivot.ecore::pivot::Operation::precedence http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!precedence
		Property symbol_171 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!raisedException // Pivot.ecore::pivot::Operation::raisedException http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!raisedException
		
		Class symbol_172 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
		Property symbol_173 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!argument // Pivot.ecore::pivot::OperationCallExp::argument http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!argument
		Property symbol_174 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!referredOperation // Pivot.ecore::pivot::OperationCallExp::referredOperation http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!referredOperation
		
		Class symbol_175 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationTemplateParameter
		
		Class symbol_176 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OrderedSetType
		
		Class symbol_177 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		Property symbol_178 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestedPackage // Pivot.ecore::pivot::Package::nestedPackage http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestedPackage
		Property symbol_179 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestingPackage // Pivot.ecore::pivot::Package::nestingPackage http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestingPackage
		Property symbol_180 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsPrefix // Pivot.ecore::pivot::Package::nsPrefix http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsPrefix
		Property symbol_181 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsURI // Pivot.ecore::pivot::Package::nsURI http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsURI
		Property symbol_182 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedPrecedence // Pivot.ecore::pivot::Package::ownedPrecedence http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedPrecedence
		Property symbol_183 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedType // Pivot.ecore::pivot::Package::ownedType http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedType
		
		Class symbol_184 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PackageableElement
		
		Class symbol_185 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
		Property symbol_186 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Iteration // Pivot.ecore::pivot::Parameter::Iteration http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Iteration
		Property symbol_187 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Variable // Pivot.ecore::pivot::Parameter::Variable http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Variable
		Property symbol_188 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!operation // Pivot.ecore::pivot::Parameter::operation http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!operation
		
		Class symbol_189 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		Property symbol_190 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameter // Pivot.ecore::pivot::ParameterableElement::TemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameter
		Property symbol_191 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameterSubstitution // Pivot.ecore::pivot::ParameterableElement::TemplateParameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameterSubstitution
		Property symbol_192 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!owningTemplateParameter // Pivot.ecore::pivot::ParameterableElement::owningTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!owningTemplateParameter
		Property symbol_193 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!templateParameter // Pivot.ecore::pivot::ParameterableElement::templateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!templateParameter
		
		Class symbol_194 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Pivotable
		
		Class symbol_195 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
		Property symbol_196 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Operation // Pivot.ecore::pivot::Precedence::Operation http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Operation
		Property symbol_197 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Package // Pivot.ecore::pivot::Precedence::Package http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Package
		Property symbol_198 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!associativity // Pivot.ecore::pivot::Precedence::associativity http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!associativity
		Property symbol_199 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!order // Pivot.ecore::pivot::Precedence::order http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!order
		
		Class symbol_200 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		
		Class symbol_201 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveType
		
		Class symbol_202 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
		Property symbol_203 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!ConstructorPart // Pivot.ecore::pivot::Property::ConstructorPart http://www.eclipse.org/ocl/3.1.0/Pivot!Property!ConstructorPart
		Property symbol_204 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!NavigationCallExp // Pivot.ecore::pivot::Property::NavigationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!Property!NavigationCallExp
		Property symbol_205 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!Property // Pivot.ecore::pivot::Property::Property http://www.eclipse.org/ocl/3.1.0/Pivot!Property!Property
		Property symbol_206 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!PropertyCallExp // Pivot.ecore::pivot::Property::PropertyCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!Property!PropertyCallExp
		Property symbol_207 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!association // Pivot.ecore::pivot::Property::association http://www.eclipse.org/ocl/3.1.0/Pivot!Property!association
		Property symbol_208 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!class // Pivot.ecore::pivot::Property::class http://www.eclipse.org/ocl/3.1.0/Pivot!Property!class
		Property symbol_209 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!default // Pivot.ecore::pivot::Property::default http://www.eclipse.org/ocl/3.1.0/Pivot!Property!default
		Property symbol_210 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!implicit // Pivot.ecore::pivot::Property::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!Property!implicit
		Property symbol_211 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isComposite // Pivot.ecore::pivot::Property::isComposite http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isComposite
		Property symbol_212 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isDerived // Pivot.ecore::pivot::Property::isDerived http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isDerived
		Property symbol_213 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isID // Pivot.ecore::pivot::Property::isID http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isID
		Property symbol_214 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isReadOnly // Pivot.ecore::pivot::Property::isReadOnly http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isReadOnly
		Property symbol_215 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isResolveProxies // Pivot.ecore::pivot::Property::isResolveProxies http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isResolveProxies
		Property symbol_216 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isTransient // Pivot.ecore::pivot::Property::isTransient http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isTransient
		Property symbol_217 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isUnsettable // Pivot.ecore::pivot::Property::isUnsettable http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isUnsettable
		Property symbol_218 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isVolatile // Pivot.ecore::pivot::Property::isVolatile http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isVolatile
		Property symbol_219 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!keys // Pivot.ecore::pivot::Property::keys http://www.eclipse.org/ocl/3.1.0/Pivot!Property!keys
		Property symbol_220 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!opposite // Pivot.ecore::pivot::Property::opposite http://www.eclipse.org/ocl/3.1.0/Pivot!Property!opposite
		Property symbol_221 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!owningType // Pivot.ecore::pivot::Property::owningType http://www.eclipse.org/ocl/3.1.0/Pivot!Property!owningType
		
		Class symbol_222 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
		Property symbol_223 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp!referredProperty // Pivot.ecore::pivot::PropertyCallExp::referredProperty http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp!referredProperty
		
		PrimitiveType symbol_224 = standardLibrary.getRealType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Real
		Class symbol_225 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp
		Property symbol_226 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp!realSymbol // Pivot.ecore::pivot::RealLiteralExp::realSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp!realSymbol
		
		Class symbol_227 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SelfType
		
		Class symbol_228 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
		Property symbol_229 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!MessageExp // Pivot.ecore::pivot::SendSignalAction::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!MessageExp
		Property symbol_230 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!signal // Pivot.ecore::pivot::SendSignalAction::signal http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!signal
		
		Class symbol_231 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SequenceType
		
		Class symbol_232 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SetType
		
		Class symbol_233 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
		Property symbol_234 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!MessageType // Pivot.ecore::pivot::Signal::MessageType http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!MessageType
		Property symbol_235 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!SendSignalAction // Pivot.ecore::pivot::Signal::SendSignalAction http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!SendSignalAction
		
		Class symbol_236 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!State
		Property symbol_237 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!State!StateExp // Pivot.ecore::pivot::State::StateExp http://www.eclipse.org/ocl/3.1.0/Pivot!State!StateExp
		
		Class symbol_238 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
		Property symbol_239 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp!referredState // Pivot.ecore::pivot::StateExp::referredState http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp!referredState
		
		PrimitiveType symbol_240 = standardLibrary.getStringType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!String
		Class symbol_241 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp
		Property symbol_242 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp!stringSymbol // Pivot.ecore::pivot::StringLiteralExp::stringSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp!stringSymbol
		
		Class symbol_243 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
		Property symbol_244 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!boundElement // Pivot.ecore::pivot::TemplateBinding::boundElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!boundElement
		Property symbol_245 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!parameterSubstitution // Pivot.ecore::pivot::TemplateBinding::parameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!parameterSubstitution
		Property symbol_246 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!signature // Pivot.ecore::pivot::TemplateBinding::signature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!signature
		
		Class symbol_247 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		Property symbol_248 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateParameterSubstitution // Pivot.ecore::pivot::TemplateParameter::TemplateParameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateParameterSubstitution
		Property symbol_249 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateSignature // Pivot.ecore::pivot::TemplateParameter::TemplateSignature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateSignature
		Property symbol_250 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!default // Pivot.ecore::pivot::TemplateParameter::default http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!default
		Property symbol_251 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedDefault // Pivot.ecore::pivot::TemplateParameter::ownedDefault http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedDefault
		Property symbol_252 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedParameteredElement // Pivot.ecore::pivot::TemplateParameter::ownedParameteredElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedParameteredElement
		Property symbol_253 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!parameteredElement // Pivot.ecore::pivot::TemplateParameter::parameteredElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!parameteredElement
		Property symbol_254 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!signature // Pivot.ecore::pivot::TemplateParameter::signature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!signature
		
		Class symbol_255 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
		Property symbol_256 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!actual // Pivot.ecore::pivot::TemplateParameterSubstitution::actual http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!actual
		Property symbol_257 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!formal // Pivot.ecore::pivot::TemplateParameterSubstitution::formal http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!formal
		Property symbol_258 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!ownedActual // Pivot.ecore::pivot::TemplateParameterSubstitution::ownedActual http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!ownedActual
		Property symbol_259 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!templateBinding // Pivot.ecore::pivot::TemplateParameterSubstitution::templateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!templateBinding
		
		Class symbol_260 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType
		Property symbol_261 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType!specification // Pivot.ecore::pivot::TemplateParameterType::specification http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType!specification
		
		Class symbol_262 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
		Property symbol_263 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!TemplateBinding // Pivot.ecore::pivot::TemplateSignature::TemplateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!TemplateBinding
		Property symbol_264 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!ownedParameter // Pivot.ecore::pivot::TemplateSignature::ownedParameter http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!ownedParameter
		Property symbol_265 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!parameter // Pivot.ecore::pivot::TemplateSignature::parameter http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!parameter
		Property symbol_266 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!template // Pivot.ecore::pivot::TemplateSignature::template http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!template
		
		Class symbol_267 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		Property symbol_268 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!ownedTemplateSignature // Pivot.ecore::pivot::TemplateableElement::ownedTemplateSignature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!ownedTemplateSignature
		Property symbol_269 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!templateBinding // Pivot.ecore::pivot::TemplateableElement::templateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!templateBinding
		Property symbol_270 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!unspecializedElement // Pivot.ecore::pivot::TemplateableElement::unspecializedElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!unspecializedElement
		
		DataType symbol_271 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Throwable
		
		Class symbol_272 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
		Property symbol_273 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp!part // Pivot.ecore::pivot::TupleLiteralExp::part http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp!part
		
		Class symbol_274 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
		Property symbol_275 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!TupleLiteralExp // Pivot.ecore::pivot::TupleLiteralPart::TupleLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!TupleLiteralExp
		Property symbol_276 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!initExpression // Pivot.ecore::pivot::TupleLiteralPart::initExpression http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!initExpression
		
		Class symbol_277 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleType
		
		Class symbol_278 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		Property symbol_279 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ClassifierType // Pivot.ecore::pivot::Type::ClassifierType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ClassifierType
		Property symbol_280 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!CollectionType // Pivot.ecore::pivot::Type::CollectionType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!CollectionType
		Property symbol_281 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!DataType // Pivot.ecore::pivot::Type::DataType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!DataType
		Property symbol_282 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!LambdaType // Pivot.ecore::pivot::Type::LambdaType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!LambdaType
		Property symbol_283 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Operation // Pivot.ecore::pivot::Type::Operation http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Operation
		Property symbol_284 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Type // Pivot.ecore::pivot::Type::Type http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Type
		Property symbol_285 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeExp // Pivot.ecore::pivot::Type::TypeExp http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeExp
		Property symbol_286 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeTemplateParameter // Pivot.ecore::pivot::Type::TypeTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeTemplateParameter
		Property symbol_287 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypedElement // Pivot.ecore::pivot::Type::TypedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypedElement
		Property symbol_288 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!UnspecifiedType // Pivot.ecore::pivot::Type::UnspecifiedType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!UnspecifiedType
		Property symbol_289 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!instanceClassName // Pivot.ecore::pivot::Type::instanceClassName http://www.eclipse.org/ocl/3.1.0/Pivot!Type!instanceClassName
		Property symbol_290 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedAttribute // Pivot.ecore::pivot::Type::ownedAttribute http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedAttribute
		Property symbol_291 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedOperation // Pivot.ecore::pivot::Type::ownedOperation http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedOperation
		Property symbol_292 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!package // Pivot.ecore::pivot::Type::package http://www.eclipse.org/ocl/3.1.0/Pivot!Type!package
		Property symbol_293 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!superClass // Pivot.ecore::pivot::Type::superClass http://www.eclipse.org/ocl/3.1.0/Pivot!Type!superClass
		
		Class symbol_294 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
		Property symbol_295 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp!referredType // Pivot.ecore::pivot::TypeExp::referredType http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp!referredType
		
		Class symbol_296 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
		Property symbol_297 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!allowSubstitutable // Pivot.ecore::pivot::TypeTemplateParameter::allowSubstitutable http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!allowSubstitutable
		Property symbol_298 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!constrainingType // Pivot.ecore::pivot::TypeTemplateParameter::constrainingType http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!constrainingType
		
		Class symbol_299 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		Property symbol_300 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement!type // Pivot.ecore::pivot::TypedElement::type http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement!type
		
		Class symbol_301 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		
		PrimitiveType symbol_302 = standardLibrary.getUnlimitedNaturalType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
		Class symbol_303 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp
		Property symbol_304 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp!unlimitedNaturalSymbol // Pivot.ecore::pivot::UnlimitedNaturalLiteralExp::unlimitedNaturalSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp!unlimitedNaturalSymbol
		
		Class symbol_305 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
		Property symbol_306 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!lowerBound // Pivot.ecore::pivot::UnspecifiedType::lowerBound http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!lowerBound
		Property symbol_307 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!upperBound // Pivot.ecore::pivot::UnspecifiedType::upperBound http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!upperBound
		
		Class symbol_308 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedValueExp
		
		Class symbol_309 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		Property symbol_310 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!Constraint // Pivot.ecore::pivot::ValueSpecification::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!Constraint
		
		Class symbol_311 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
		Property symbol_312 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!ExpressionInOcl // Pivot.ecore::pivot::Variable::ExpressionInOcl http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!ExpressionInOcl
		Property symbol_313 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!IterateExp // Pivot.ecore::pivot::Variable::IterateExp http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!IterateExp
		Property symbol_314 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LetExp // Pivot.ecore::pivot::Variable::LetExp http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LetExp
		Property symbol_315 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LoopExp // Pivot.ecore::pivot::Variable::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LoopExp
		Property symbol_316 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!implicit // Pivot.ecore::pivot::Variable::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!implicit
		Property symbol_317 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!initExpression // Pivot.ecore::pivot::Variable::initExpression http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!initExpression
		Property symbol_318 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!representedParameter // Pivot.ecore::pivot::Variable::representedParameter http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!representedParameter
		
		Class symbol_319 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		Property symbol_320 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration!VariableExp // Pivot.ecore::pivot::VariableDeclaration::VariableExp http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration!VariableExp
		
		Class symbol_321 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
		Property symbol_322 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!implicit // Pivot.ecore::pivot::VariableExp::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!implicit
		Property symbol_323 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!referredVariable // Pivot.ecore::pivot::VariableExp::referredVariable http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!referredVariable
		
		Class symbol_324 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		
		Class symbol_325 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}
		TemplateSignature symbol_326 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}!
		TypeTemplateParameter symbol_327 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_328 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}?R
		TypeTemplateParameter symbol_329 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_330 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}?C
		
		
		Class symbol_331 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VoidType
		

		symbol_0.setName("pivot");
		symbol_0.setNsPrefix("pivot");
		symbol_0.setNsURI("http://www.eclipse.org/ocl/3.1.0/Pivot");
		//
		// Pivot.ecore::pivot::Annotation http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
		//
		symbol_1.setName("Annotation");
		symbol_1.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::Annotation::NamedElement
			symbol_2.setName("NamedElement");
			symbol_2.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
			symbol_2.setLower(BigInteger.valueOf(0));
			
			symbol_2.setImplicit(true);
			symbol_2.setIsResolveProxies(true);
			symbol_2.setOpposite(symbol_135);
			
			symbol_1.getOwnedAttributes().add(symbol_2);
		}
		{ // Pivot.ecore::pivot::Annotation::ownedContent
			symbol_3.setName("ownedContent");
			symbol_3.setType(symbol_63);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_3.setLower(BigInteger.valueOf(0));
			symbol_3.setUpper(BigInteger.valueOf(-1));
			symbol_3.setIsOrdered(true);
			
			symbol_3.setIsComposite(true);
			symbol_3.setIsResolveProxies(true);
			
			symbol_1.getOwnedAttributes().add(symbol_3);
		}
		{ // Pivot.ecore::pivot::Annotation::ownedDetail
			symbol_4.setName("ownedDetail");
			symbol_4.setType(symbol_60);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
			symbol_4.setLower(BigInteger.valueOf(0));
			symbol_4.setUpper(BigInteger.valueOf(-1));
			symbol_4.setIsOrdered(true);
			
			symbol_4.setIsComposite(true);
			symbol_4.setIsResolveProxies(true);
			symbol_4.setOpposite(symbol_61);
			
			symbol_1.getOwnedAttributes().add(symbol_4);
		}
		{ // Pivot.ecore::pivot::Annotation::reference
			symbol_5.setName("reference");
			symbol_5.setType(symbol_63);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_5.setLower(BigInteger.valueOf(0));
			symbol_5.setUpper(BigInteger.valueOf(-1));
			symbol_5.setIsOrdered(true);
			
			symbol_5.setIsResolveProxies(true);
			symbol_5.setOpposite(symbol_64);
			
			symbol_1.getOwnedAttributes().add(symbol_5);
		}
		
		symbol_0.getOwnedTypes().add(symbol_1); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
		//
		// Pivot.ecore::pivot::AnyType http://www.eclipse.org/ocl/3.1.0/Pivot!AnyType
		//
		symbol_6.setName("AnyType");
		symbol_6.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		
		symbol_0.getOwnedTypes().add(symbol_6); // http://www.eclipse.org/ocl/3.1.0/Pivot!AnyType
		//
		// Pivot.ecore::pivot::AssociationClass http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
		//
		symbol_7.setName("AssociationClass");
		symbol_7.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		{ // Pivot.ecore::pivot::AssociationClass::AssociationClassCallExp
			symbol_8.setName("AssociationClassCallExp");
			symbol_8.setType(symbol_10);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
			symbol_8.setLower(BigInteger.valueOf(0));
			symbol_8.setUpper(BigInteger.valueOf(-1));
			
			symbol_8.setImplicit(true);
			symbol_8.setIsResolveProxies(true);
			symbol_8.setOpposite(symbol_11);
			
			symbol_7.getOwnedAttributes().add(symbol_8);
		}
		{ // Pivot.ecore::pivot::AssociationClass::unownedAttribute
			symbol_9.setName("unownedAttribute");
			symbol_9.setType(symbol_202);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_9.setLower(BigInteger.valueOf(0));
			symbol_9.setUpper(BigInteger.valueOf(-1));
			
			symbol_9.setIsResolveProxies(true);
			symbol_9.setOpposite(symbol_207);
			
			symbol_7.getOwnedAttributes().add(symbol_9);
		}
		
		symbol_0.getOwnedTypes().add(symbol_7); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
		//
		// Pivot.ecore::pivot::AssociationClassCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
		//
		symbol_10.setName("AssociationClassCallExp");
		symbol_10.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		{ // Pivot.ecore::pivot::AssociationClassCallExp::referredAssociationClass
			symbol_11.setName("referredAssociationClass");
			symbol_11.setType(symbol_7);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
			symbol_11.setLower(BigInteger.valueOf(0));
			
			symbol_11.setIsResolveProxies(true);
			symbol_11.setOpposite(symbol_8);
			
			symbol_10.getOwnedAttributes().add(symbol_11);
		}
		
		symbol_0.getOwnedTypes().add(symbol_10); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
		//
		// Pivot.ecore::pivot::AssociativityKind http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
		//
		symbol_12.setName("AssociativityKind");
		{
			EnumerationLiteral symbol_332 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::AssociativityKind::Left http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind!Left
			symbol_332.setName("Left");
			symbol_12.getOwnedLiterals().add(symbol_332);
			EnumerationLiteral symbol_333 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::AssociativityKind::Right http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind!Right
			symbol_333.setName("Right");
			symbol_12.getOwnedLiterals().add(symbol_333);
		}
		
		symbol_0.getOwnedTypes().add(symbol_12); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
		//
		// Pivot.ecore::pivot::BagType http://www.eclipse.org/ocl/3.1.0/Pivot!BagType
		//
		symbol_13.setName("BagType");
		symbol_13.getSuperClasses().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		
		symbol_0.getOwnedTypes().add(symbol_13); // http://www.eclipse.org/ocl/3.1.0/Pivot!BagType
		//
		// Pivot.ecore::pivot::BooleanLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp
		//
		symbol_15.setName("BooleanLiteralExp");
		symbol_15.getSuperClasses().add(symbol_200); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		{ // Pivot.ecore::pivot::BooleanLiteralExp::booleanSymbol
			symbol_16.setName("booleanSymbol");
			symbol_16.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_16.setIsResolveProxies(true);
			symbol_16.setIsUnsettable(true);
			
			symbol_15.getOwnedAttributes().add(symbol_16);
		}
		
		symbol_0.getOwnedTypes().add(symbol_15); // http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp
		//
		// Pivot.ecore::pivot::CallExp http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		//
		symbol_17.setName("CallExp");
		symbol_17.getSuperClasses().add(symbol_144); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::CallExp::implicit
			symbol_18.setName("implicit");
			symbol_18.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_18.setLower(BigInteger.valueOf(0));
			
			symbol_18.setIsResolveProxies(true);
			
			symbol_17.getOwnedAttributes().add(symbol_18);
		}
		{ // Pivot.ecore::pivot::CallExp::source
			symbol_19.setName("source");
			symbol_19.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_19.setLower(BigInteger.valueOf(0));
			
			symbol_19.setIsComposite(true);
			symbol_19.setIsResolveProxies(true);
			symbol_19.setOpposite(symbol_145);
			
			symbol_17.getOwnedAttributes().add(symbol_19);
		}
		
		symbol_0.getOwnedTypes().add(symbol_17); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		//
		// Pivot.ecore::pivot::CallOperationAction http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
		//
		symbol_20.setName("CallOperationAction");
		symbol_20.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::CallOperationAction::MessageExp
			symbol_21.setName("MessageExp");
			symbol_21.setType(symbol_118);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
			symbol_21.setLower(BigInteger.valueOf(0));
			
			symbol_21.setImplicit(true);
			symbol_21.setIsResolveProxies(true);
			symbol_21.setOpposite(symbol_120);
			
			symbol_20.getOwnedAttributes().add(symbol_21);
		}
		{ // Pivot.ecore::pivot::CallOperationAction::operation
			symbol_22.setName("operation");
			symbol_22.setType(symbol_163);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			
			symbol_22.setIsResolveProxies(true);
			symbol_22.setOpposite(symbol_164);
			
			symbol_20.getOwnedAttributes().add(symbol_22);
		}
		
		symbol_0.getOwnedTypes().add(symbol_20); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
		//
		// Pivot.ecore::pivot::Class http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		//
		symbol_23.setName("Class");
		symbol_23.getSuperClasses().add(symbol_278); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		symbol_23.getSuperClasses().add(symbol_137); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		{ // Pivot.ecore::pivot::Class::isAbstract
			symbol_24.setName("isAbstract");
			symbol_24.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_24.setIsResolveProxies(true);
			{
				Comment symbol_334 = PivotFactory.eINSTANCE.createComment();
				symbol_334.setBody("True when a class is abstract.");
				symbol_24.getOwnedComments().add(symbol_334);
			}
			
			symbol_23.getOwnedAttributes().add(symbol_24);
		}
		{ // Pivot.ecore::pivot::Class::isInterface
			symbol_25.setName("isInterface");
			symbol_25.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_25.setIsResolveProxies(true);
			
			symbol_23.getOwnedAttributes().add(symbol_25);
		}
		{
			Comment symbol_335 = PivotFactory.eINSTANCE.createComment();
			symbol_335.setBody("A class is a type that has objects as its instances.");
			symbol_23.getOwnedComments().add(symbol_335);
		}
		
		symbol_0.getOwnedTypes().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		//
		// Pivot.ecore::pivot::ClassifierType http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
		//
		symbol_26.setName("ClassifierType");
		symbol_26.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // Pivot.ecore::pivot::ClassifierType::instanceType
			symbol_27.setName("instanceType");
			symbol_27.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_27.setIsResolveProxies(true);
			symbol_27.setOpposite(symbol_279);
			
			symbol_26.getOwnedAttributes().add(symbol_27);
		}
		
		symbol_0.getOwnedTypes().add(symbol_26); // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
		//
		// Pivot.ecore::pivot::CollectionItem http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
		//
		symbol_28.setName("CollectionItem");
		symbol_28.getSuperClasses().add(symbol_34); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		{ // Pivot.ecore::pivot::CollectionItem::item
			symbol_29.setName("item");
			symbol_29.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_29.setIsComposite(true);
			symbol_29.setIsResolveProxies(true);
			symbol_29.setOpposite(symbol_146);
			
			symbol_28.getOwnedAttributes().add(symbol_29);
		}
		
		symbol_0.getOwnedTypes().add(symbol_28); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
		//
		// Pivot.ecore::pivot::CollectionKind http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
		//
		symbol_30.setName("CollectionKind");
		{
			EnumerationLiteral symbol_336 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::CollectionKind::Collection http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Collection
			symbol_336.setName("Collection");
			symbol_30.getOwnedLiterals().add(symbol_336);
			EnumerationLiteral symbol_337 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::CollectionKind::Set http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Set
			symbol_337.setName("Set");
			symbol_30.getOwnedLiterals().add(symbol_337);
			EnumerationLiteral symbol_338 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::CollectionKind::OrderedSet http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!OrderedSet
			symbol_338.setName("OrderedSet");
			symbol_30.getOwnedLiterals().add(symbol_338);
			EnumerationLiteral symbol_339 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::CollectionKind::Bag http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Bag
			symbol_339.setName("Bag");
			symbol_30.getOwnedLiterals().add(symbol_339);
			EnumerationLiteral symbol_340 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::CollectionKind::Sequence http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Sequence
			symbol_340.setName("Sequence");
			symbol_30.getOwnedLiterals().add(symbol_340);
		}
		
		symbol_0.getOwnedTypes().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
		//
		// Pivot.ecore::pivot::CollectionLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp
		//
		symbol_31.setName("CollectionLiteralExp");
		symbol_31.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		{ // Pivot.ecore::pivot::CollectionLiteralExp::kind
			symbol_32.setName("kind");
			symbol_32.setType(symbol_30);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
			
			symbol_32.setIsResolveProxies(true);
			
			symbol_31.getOwnedAttributes().add(symbol_32);
		}
		{ // Pivot.ecore::pivot::CollectionLiteralExp::part
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
		// Pivot.ecore::pivot::CollectionLiteralPart http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		//
		symbol_34.setName("CollectionLiteralPart");
		symbol_34.getSuperClasses().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		{ // Pivot.ecore::pivot::CollectionLiteralPart::CollectionLiteralExp
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
		// Pivot.ecore::pivot::CollectionRange http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
		//
		symbol_36.setName("CollectionRange");
		symbol_36.getSuperClasses().add(symbol_34); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		{ // Pivot.ecore::pivot::CollectionRange::first
			symbol_37.setName("first");
			symbol_37.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_37.setIsComposite(true);
			symbol_37.setIsResolveProxies(true);
			symbol_37.setOpposite(symbol_147);
			
			symbol_36.getOwnedAttributes().add(symbol_37);
		}
		{ // Pivot.ecore::pivot::CollectionRange::last
			symbol_38.setName("last");
			symbol_38.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_38.setIsComposite(true);
			symbol_38.setIsResolveProxies(true);
			
			symbol_36.getOwnedAttributes().add(symbol_38);
		}
		
		symbol_0.getOwnedTypes().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
		//
		// Pivot.ecore::pivot::CollectionType http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		//
		symbol_39.setName("CollectionType");
		symbol_39.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // Pivot.ecore::pivot::CollectionType::elementType
			symbol_40.setName("elementType");
			symbol_40.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_40.setIsResolveProxies(true);
			symbol_40.setOpposite(symbol_280);
			
			symbol_39.getOwnedAttributes().add(symbol_40);
		}
		
		symbol_0.getOwnedTypes().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		//
		// Pivot.ecore::pivot::Comment http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
		//
		symbol_41.setName("Comment");
		symbol_41.getSuperClasses().add(symbol_63); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::Comment::Element
			symbol_42.setName("Element");
			symbol_42.setType(symbol_63);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_42.setLower(BigInteger.valueOf(0));
			
			symbol_42.setImplicit(true);
			symbol_42.setIsResolveProxies(true);
			symbol_42.setOpposite(symbol_67);
			
			symbol_41.getOwnedAttributes().add(symbol_42);
		}
		{ // Pivot.ecore::pivot::Comment::annotatedElement
			symbol_43.setName("annotatedElement");
			symbol_43.setType(symbol_63);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_43.setLower(BigInteger.valueOf(0));
			symbol_43.setUpper(BigInteger.valueOf(-1));
			
			symbol_43.setIsResolveProxies(true);
			symbol_43.setOpposite(symbol_65);
			{
				Comment symbol_341 = PivotFactory.eINSTANCE.createComment();
				symbol_341.setBody("References the Element(s) being commented.");
				symbol_43.getOwnedComments().add(symbol_341);
			}
			
			symbol_41.getOwnedAttributes().add(symbol_43);
		}
		{ // Pivot.ecore::pivot::Comment::body
			symbol_44.setName("body");
			symbol_44.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_44.setLower(BigInteger.valueOf(0));
			
			symbol_44.setIsResolveProxies(true);
			{
				Comment symbol_342 = PivotFactory.eINSTANCE.createComment();
				symbol_342.setBody("Specifies a string that is the comment.");
				symbol_44.getOwnedComments().add(symbol_342);
			}
			
			symbol_41.getOwnedAttributes().add(symbol_44);
		}
		{
			Comment symbol_343 = PivotFactory.eINSTANCE.createComment();
			symbol_343.setBody("A comment is a textual annotation that can be attached to a set of elements.");
			symbol_41.getOwnedComments().add(symbol_343);
		}
		
		symbol_0.getOwnedTypes().add(symbol_41); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
		//
		// Pivot.ecore::pivot::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
		//
		symbol_45.setName("Constraint");
		symbol_45.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::Constraint::constrainedElement
			symbol_46.setName("constrainedElement");
			symbol_46.setType(symbol_63);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_46.setLower(BigInteger.valueOf(0));
			symbol_46.setUpper(BigInteger.valueOf(-1));
			symbol_46.setIsOrdered(true);
			
			symbol_46.setIsResolveProxies(true);
			symbol_46.setOpposite(symbol_66);
			{
				Comment symbol_344 = PivotFactory.eINSTANCE.createComment();
				symbol_344.setBody("The ordered set of Elements referenced by this Constraint.");
				symbol_46.getOwnedComments().add(symbol_344);
			}
			
			symbol_45.getOwnedAttributes().add(symbol_46);
		}
		{ // Pivot.ecore::pivot::Constraint::context
			symbol_47.setName("context");
			symbol_47.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
			symbol_47.setLower(BigInteger.valueOf(0));
			
			symbol_47.setIsResolveProxies(true);
			symbol_47.setOpposite(symbol_136);
			
			symbol_45.getOwnedAttributes().add(symbol_47);
		}
		{ // Pivot.ecore::pivot::Constraint::isCallable
			symbol_48.setName("isCallable");
			symbol_48.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_48.setIsResolveProxies(true);
			
			symbol_45.getOwnedAttributes().add(symbol_48);
		}
		{ // Pivot.ecore::pivot::Constraint::specification
			symbol_49.setName("specification");
			symbol_49.setType(symbol_309);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
			
			symbol_49.setIsComposite(true);
			symbol_49.setIsResolveProxies(true);
			symbol_49.setOpposite(symbol_310);
			{
				Comment symbol_345 = PivotFactory.eINSTANCE.createComment();
				symbol_345.setBody("A condition that must be true when evaluated in order for the constraint to be satisfied.");
				symbol_49.getOwnedComments().add(symbol_345);
			}
			
			symbol_45.getOwnedAttributes().add(symbol_49);
		}
		{ // Pivot.ecore::pivot::Constraint::stereotype
			symbol_50.setName("stereotype");
			symbol_50.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_50.setLower(BigInteger.valueOf(0));
			
			symbol_50.setIsResolveProxies(true);
			
			symbol_45.getOwnedAttributes().add(symbol_50);
		}
		{
			Comment symbol_346 = PivotFactory.eINSTANCE.createComment();
			symbol_346.setBody("A constraint is a condition or restriction expressed in natural language text or in a machine readable language for the purpose of declaring some of the semantics of an element.");
			symbol_45.getOwnedComments().add(symbol_346);
		}
		
		symbol_0.getOwnedTypes().add(symbol_45); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
		//
		// Pivot.ecore::pivot::ConstructorExp http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorExp
		//
		symbol_51.setName("ConstructorExp");
		symbol_51.getSuperClasses().add(symbol_144); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::ConstructorExp::part
			symbol_52.setName("part");
			symbol_52.setType(symbol_53);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorPart
			symbol_52.setLower(BigInteger.valueOf(0));
			symbol_52.setUpper(BigInteger.valueOf(-1));
			symbol_52.setIsOrdered(true);
			
			symbol_52.setIsComposite(true);
			symbol_52.setIsResolveProxies(true);
			symbol_52.setOpposite(symbol_54);
			
			symbol_51.getOwnedAttributes().add(symbol_52);
		}
		
		symbol_0.getOwnedTypes().add(symbol_51); // http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorExp
		//
		// Pivot.ecore::pivot::ConstructorPart http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorPart
		//
		symbol_53.setName("ConstructorPart");
		symbol_53.getSuperClasses().add(symbol_63); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::ConstructorPart::ConstructorExp
			symbol_54.setName("ConstructorExp");
			symbol_54.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorExp
			symbol_54.setLower(BigInteger.valueOf(0));
			
			symbol_54.setImplicit(true);
			symbol_54.setIsResolveProxies(true);
			symbol_54.setOpposite(symbol_52);
			
			symbol_53.getOwnedAttributes().add(symbol_54);
		}
		{ // Pivot.ecore::pivot::ConstructorPart::initExpression
			symbol_55.setName("initExpression");
			symbol_55.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_55.setIsComposite(true);
			symbol_55.setIsResolveProxies(true);
			symbol_55.setOpposite(symbol_148);
			
			symbol_53.getOwnedAttributes().add(symbol_55);
		}
		{ // Pivot.ecore::pivot::ConstructorPart::referredProperty
			symbol_56.setName("referredProperty");
			symbol_56.setType(symbol_202);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			
			symbol_56.setIsResolveProxies(true);
			symbol_56.setOpposite(symbol_203);
			
			symbol_53.getOwnedAttributes().add(symbol_56);
		}
		
		symbol_0.getOwnedTypes().add(symbol_53); // http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorPart
		//
		// Pivot.ecore::pivot::DataType http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		//
		symbol_57.setName("DataType");
		symbol_57.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		{ // Pivot.ecore::pivot::DataType::behavioralType
			symbol_58.setName("behavioralType");
			symbol_58.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_58.setLower(BigInteger.valueOf(0));
			
			symbol_58.setIsResolveProxies(true);
			symbol_58.setOpposite(symbol_281);
			
			symbol_57.getOwnedAttributes().add(symbol_58);
		}
		{ // Pivot.ecore::pivot::DataType::isSerializable
			symbol_59.setName("isSerializable");
			symbol_59.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_59.setIsResolveProxies(true);
			
			symbol_57.getOwnedAttributes().add(symbol_59);
		}
		{
			Comment symbol_347 = PivotFactory.eINSTANCE.createComment();
			symbol_347.setBody("DataType is an abstract class that acts as a common superclass for different kinds of data types.");
			symbol_57.getOwnedComments().add(symbol_347);
		}
		
		symbol_0.getOwnedTypes().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		//
		// Pivot.ecore::pivot::Detail http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
		//
		symbol_60.setName("Detail");
		symbol_60.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::Detail::Annotation
			symbol_61.setName("Annotation");
			symbol_61.setType(symbol_1);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
			symbol_61.setLower(BigInteger.valueOf(0));
			
			symbol_61.setImplicit(true);
			symbol_61.setIsResolveProxies(true);
			symbol_61.setOpposite(symbol_4);
			
			symbol_60.getOwnedAttributes().add(symbol_61);
		}
		{ // Pivot.ecore::pivot::Detail::value
			symbol_62.setName("value");
			symbol_62.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_62.setUpper(BigInteger.valueOf(-1));
			
			symbol_62.setIsResolveProxies(true);
			
			symbol_60.getOwnedAttributes().add(symbol_62);
		}
		
		symbol_0.getOwnedTypes().add(symbol_60); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
		//
		// Pivot.ecore::pivot::Element http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		//
		symbol_63.setName("Element");
		symbol_63.getSuperClasses().add(symbol_324); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		{ // Pivot.ecore::pivot::Element::Annotation
			symbol_64.setName("Annotation");
			symbol_64.setType(symbol_1);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
			symbol_64.setLower(BigInteger.valueOf(0));
			symbol_64.setUpper(BigInteger.valueOf(-1));
			
			symbol_64.setImplicit(true);
			symbol_64.setIsResolveProxies(true);
			
			symbol_63.getOwnedAttributes().add(symbol_64);
		}
		{ // Pivot.ecore::pivot::Element::Comment
			symbol_65.setName("Comment");
			symbol_65.setType(symbol_41);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
			symbol_65.setLower(BigInteger.valueOf(0));
			symbol_65.setUpper(BigInteger.valueOf(-1));
			
			symbol_65.setImplicit(true);
			symbol_65.setIsResolveProxies(true);
			symbol_65.setOpposite(symbol_43);
			
			symbol_63.getOwnedAttributes().add(symbol_65);
		}
		{ // Pivot.ecore::pivot::Element::Constraint
			symbol_66.setName("Constraint");
			symbol_66.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_66.setLower(BigInteger.valueOf(0));
			symbol_66.setUpper(BigInteger.valueOf(-1));
			
			symbol_66.setImplicit(true);
			symbol_66.setIsResolveProxies(true);
			symbol_66.setOpposite(symbol_46);
			
			symbol_63.getOwnedAttributes().add(symbol_66);
		}
		{ // Pivot.ecore::pivot::Element::ownedComment
			symbol_67.setName("ownedComment");
			symbol_67.setType(symbol_41);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
			symbol_67.setLower(BigInteger.valueOf(0));
			symbol_67.setUpper(BigInteger.valueOf(-1));
			
			symbol_67.setIsComposite(true);
			symbol_67.setIsResolveProxies(true);
			symbol_67.setOpposite(symbol_42);
			{
				Comment symbol_348 = PivotFactory.eINSTANCE.createComment();
				symbol_348.setBody("The Comments owned by this element.");
				symbol_67.getOwnedComments().add(symbol_348);
			}
			
			symbol_63.getOwnedAttributes().add(symbol_67);
		}
		{	// Pivot.ecore::pivot::Element::allOwnedElements()
			Operation symbol_349 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!allOwnedElements()
			symbol_349.setName("allOwnedElements");
			symbol_349.setType(symbol_63);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_349.setLower(BigInteger.valueOf(0));
			symbol_349.setUpper(BigInteger.valueOf(-1));
			
			
			symbol_63.getOwnedOperations().add(symbol_349);
		}
		{
			Comment symbol_350 = PivotFactory.eINSTANCE.createComment();
			symbol_350.setBody("An element is a constituent of a model.");
			symbol_63.getOwnedComments().add(symbol_350);
		}
		
		symbol_0.getOwnedTypes().add(symbol_63); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		//
		// Pivot.ecore::pivot::EnumLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
		//
		symbol_68.setName("EnumLiteralExp");
		symbol_68.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		{ // Pivot.ecore::pivot::EnumLiteralExp::referredEnumLiteral
			symbol_69.setName("referredEnumLiteral");
			symbol_69.setType(symbol_72);  // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
			symbol_69.setLower(BigInteger.valueOf(0));
			
			symbol_69.setIsResolveProxies(true);
			symbol_69.setOpposite(symbol_73);
			
			symbol_68.getOwnedAttributes().add(symbol_69);
		}
		
		symbol_0.getOwnedTypes().add(symbol_68); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
		//
		// Pivot.ecore::pivot::Enumeration http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
		//
		symbol_70.setName("Enumeration");
		symbol_70.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // Pivot.ecore::pivot::Enumeration::ownedLiteral
			symbol_71.setName("ownedLiteral");
			symbol_71.setType(symbol_72);  // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
			symbol_71.setLower(BigInteger.valueOf(0));
			symbol_71.setUpper(BigInteger.valueOf(-1));
			symbol_71.setIsOrdered(true);
			
			symbol_71.setIsComposite(true);
			symbol_71.setIsResolveProxies(true);
			symbol_71.setOpposite(symbol_74);
			{
				Comment symbol_351 = PivotFactory.eINSTANCE.createComment();
				symbol_351.setBody("The ordered set of literals for this Enumeration.");
				symbol_71.getOwnedComments().add(symbol_351);
			}
			
			symbol_70.getOwnedAttributes().add(symbol_71);
		}
		{
			Comment symbol_352 = PivotFactory.eINSTANCE.createComment();
			symbol_352.setBody("An enumeration defines a set of literals that can be used as its values.");
			symbol_70.getOwnedComments().add(symbol_352);
		}
		
		symbol_0.getOwnedTypes().add(symbol_70); // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
		//
		// Pivot.ecore::pivot::EnumerationLiteral http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
		//
		symbol_72.setName("EnumerationLiteral");
		symbol_72.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::EnumerationLiteral::EnumLiteralExp
			symbol_73.setName("EnumLiteralExp");
			symbol_73.setType(symbol_68);  // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
			symbol_73.setLower(BigInteger.valueOf(0));
			symbol_73.setUpper(BigInteger.valueOf(-1));
			
			symbol_73.setImplicit(true);
			symbol_73.setIsResolveProxies(true);
			symbol_73.setOpposite(symbol_69);
			
			symbol_72.getOwnedAttributes().add(symbol_73);
		}
		{ // Pivot.ecore::pivot::EnumerationLiteral::enumeration
			symbol_74.setName("enumeration");
			symbol_74.setType(symbol_70);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
			symbol_74.setLower(BigInteger.valueOf(0));
			
			symbol_74.setIsResolveProxies(true);
			symbol_74.setOpposite(symbol_71);
			{
				Comment symbol_353 = PivotFactory.eINSTANCE.createComment();
				symbol_353.setBody("The Enumeration that this EnumerationLiteral is a member of.");
				symbol_74.getOwnedComments().add(symbol_353);
			}
			
			symbol_72.getOwnedAttributes().add(symbol_74);
		}
		{ // Pivot.ecore::pivot::EnumerationLiteral::value
			symbol_75.setName("value");
			symbol_75.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			symbol_75.setLower(BigInteger.valueOf(0));
			
			symbol_75.setIsResolveProxies(true);
			
			symbol_72.getOwnedAttributes().add(symbol_75);
		}
		{
			Comment symbol_354 = PivotFactory.eINSTANCE.createComment();
			symbol_354.setBody("An enumeration literal is a value of an enumeration.");
			symbol_72.getOwnedComments().add(symbol_354);
		}
		
		symbol_0.getOwnedTypes().add(symbol_72); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
		//
		// Pivot.ecore::pivot::ExpressionInOcl http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
		//
		symbol_76.setName("ExpressionInOcl");
		symbol_76.getSuperClasses().add(symbol_158); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		{ // Pivot.ecore::pivot::ExpressionInOcl::bodyExpression
			symbol_77.setName("bodyExpression");
			symbol_77.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_77.setIsComposite(true);
			symbol_77.setIsResolveProxies(true);
			symbol_77.setOpposite(symbol_149);
			
			symbol_76.getOwnedAttributes().add(symbol_77);
		}
		{ // Pivot.ecore::pivot::ExpressionInOcl::contextVariable
			symbol_78.setName("contextVariable");
			symbol_78.setType(symbol_311);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_78.setLower(BigInteger.valueOf(0));
			
			symbol_78.setIsComposite(true);
			symbol_78.setIsResolveProxies(true);
			symbol_78.setOpposite(symbol_312);
			
			symbol_76.getOwnedAttributes().add(symbol_78);
		}
		{ // Pivot.ecore::pivot::ExpressionInOcl::messageExpression
			symbol_79.setName("messageExpression");
			symbol_79.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_79.setLower(BigInteger.valueOf(0));
			
			symbol_79.setIsComposite(true);
			symbol_79.setIsResolveProxies(true);
			
			symbol_76.getOwnedAttributes().add(symbol_79);
		}
		{ // Pivot.ecore::pivot::ExpressionInOcl::parameterVariable
			symbol_80.setName("parameterVariable");
			symbol_80.setType(symbol_311);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_80.setLower(BigInteger.valueOf(0));
			symbol_80.setUpper(BigInteger.valueOf(-1));
			symbol_80.setIsOrdered(true);
			
			symbol_80.setIsComposite(true);
			symbol_80.setIsResolveProxies(true);
			
			symbol_76.getOwnedAttributes().add(symbol_80);
		}
		{ // Pivot.ecore::pivot::ExpressionInOcl::resultVariable
			symbol_81.setName("resultVariable");
			symbol_81.setType(symbol_311);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_81.setLower(BigInteger.valueOf(0));
			
			symbol_81.setIsComposite(true);
			symbol_81.setIsResolveProxies(true);
			
			symbol_76.getOwnedAttributes().add(symbol_81);
		}
		
		symbol_0.getOwnedTypes().add(symbol_76); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
		//
		// Pivot.ecore::pivot::Feature http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		//
		symbol_82.setName("Feature");
		symbol_82.getSuperClasses().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		{ // Pivot.ecore::pivot::Feature::implementation
			symbol_83.setName("implementation");
			symbol_83.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LibraryFeature
			symbol_83.setLower(BigInteger.valueOf(0));
			
			symbol_83.setIsResolveProxies(true);
			symbol_83.setIsTransient(true);
			
			symbol_82.getOwnedAttributes().add(symbol_83);
		}
		{ // Pivot.ecore::pivot::Feature::implementationClass
			symbol_84.setName("implementationClass");
			symbol_84.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_84.setLower(BigInteger.valueOf(0));
			
			symbol_84.setIsResolveProxies(true);
			
			symbol_82.getOwnedAttributes().add(symbol_84);
		}
		
		symbol_0.getOwnedTypes().add(symbol_82); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		//
		// Pivot.ecore::pivot::FeatureCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		//
		symbol_85.setName("FeatureCallExp");
		symbol_85.getSuperClasses().add(symbol_17); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		{ // Pivot.ecore::pivot::FeatureCallExp::isPre
			symbol_86.setName("isPre");
			symbol_86.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_86.setIsResolveProxies(true);
			
			symbol_85.getOwnedAttributes().add(symbol_86);
		}
		
		symbol_0.getOwnedTypes().add(symbol_85); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		//
		// Pivot.ecore::pivot::IfExp http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
		//
		symbol_87.setName("IfExp");
		symbol_87.getSuperClasses().add(symbol_144); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::IfExp::condition
			symbol_88.setName("condition");
			symbol_88.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_88.setIsComposite(true);
			symbol_88.setIsResolveProxies(true);
			
			symbol_87.getOwnedAttributes().add(symbol_88);
		}
		{ // Pivot.ecore::pivot::IfExp::elseExpression
			symbol_89.setName("elseExpression");
			symbol_89.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_89.setIsComposite(true);
			symbol_89.setIsResolveProxies(true);
			
			symbol_87.getOwnedAttributes().add(symbol_89);
		}
		{ // Pivot.ecore::pivot::IfExp::thenExpression
			symbol_90.setName("thenExpression");
			symbol_90.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_90.setIsComposite(true);
			symbol_90.setIsResolveProxies(true);
			symbol_90.setOpposite(symbol_150);
			
			symbol_87.getOwnedAttributes().add(symbol_90);
		}
		
		symbol_0.getOwnedTypes().add(symbol_87); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
		//
		// Pivot.ecore::pivot::Int http://www.eclipse.org/ocl/3.1.0/Pivot!Int
		//
		symbol_91.setName("Int");
		symbol_91.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_91); // http://www.eclipse.org/ocl/3.1.0/Pivot!Int
		//
		// Pivot.ecore::pivot::IntegerLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp
		//
		symbol_93.setName("IntegerLiteralExp");
		symbol_93.getSuperClasses().add(symbol_142); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		{ // Pivot.ecore::pivot::IntegerLiteralExp::integerSymbol
			symbol_94.setName("integerSymbol");
			symbol_94.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_94.setIsResolveProxies(true);
			
			symbol_93.getOwnedAttributes().add(symbol_94);
		}
		
		symbol_0.getOwnedTypes().add(symbol_93); // http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp
		//
		// Pivot.ecore::pivot::InvalidLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidLiteralExp
		//
		symbol_95.setName("InvalidLiteralExp");
		symbol_95.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		
		symbol_0.getOwnedTypes().add(symbol_95); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidLiteralExp
		//
		// Pivot.ecore::pivot::InvalidType http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidType
		//
		symbol_96.setName("InvalidType");
		symbol_96.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		
		symbol_0.getOwnedTypes().add(symbol_96); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidType
		//
		// Pivot.ecore::pivot::IterateExp http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
		//
		symbol_97.setName("IterateExp");
		symbol_97.getSuperClasses().add(symbol_114); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		{ // Pivot.ecore::pivot::IterateExp::result
			symbol_98.setName("result");
			symbol_98.setType(symbol_311);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_98.setLower(BigInteger.valueOf(0));
			symbol_98.setIsOrdered(true);
			
			symbol_98.setIsComposite(true);
			symbol_98.setIsResolveProxies(true);
			symbol_98.setOpposite(symbol_313);
			
			symbol_97.getOwnedAttributes().add(symbol_98);
		}
		
		symbol_0.getOwnedTypes().add(symbol_97); // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
		//
		// Pivot.ecore::pivot::Iteration http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
		//
		symbol_99.setName("Iteration");
		symbol_99.getSuperClasses().add(symbol_163); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		{ // Pivot.ecore::pivot::Iteration::LoopExp
			symbol_100.setName("LoopExp");
			symbol_100.setType(symbol_114);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
			symbol_100.setLower(BigInteger.valueOf(0));
			symbol_100.setUpper(BigInteger.valueOf(-1));
			
			symbol_100.setImplicit(true);
			symbol_100.setIsResolveProxies(true);
			symbol_100.setOpposite(symbol_117);
			
			symbol_99.getOwnedAttributes().add(symbol_100);
		}
		{ // Pivot.ecore::pivot::Iteration::ownedAccumulator
			symbol_101.setName("ownedAccumulator");
			symbol_101.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_101.setLower(BigInteger.valueOf(0));
			symbol_101.setUpper(BigInteger.valueOf(-1));
			
			symbol_101.setIsComposite(true);
			symbol_101.setIsResolveProxies(true);
			symbol_101.setOpposite(symbol_186);
			
			symbol_99.getOwnedAttributes().add(symbol_101);
		}
		{ // Pivot.ecore::pivot::Iteration::ownedIterator
			symbol_102.setName("ownedIterator");
			symbol_102.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_102.setLower(BigInteger.valueOf(0));
			symbol_102.setUpper(BigInteger.valueOf(-1));
			
			symbol_102.setIsComposite(true);
			symbol_102.setIsResolveProxies(true);
			
			symbol_99.getOwnedAttributes().add(symbol_102);
		}
		
		symbol_0.getOwnedTypes().add(symbol_99); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
		//
		// Pivot.ecore::pivot::IteratorExp http://www.eclipse.org/ocl/3.1.0/Pivot!IteratorExp
		//
		symbol_103.setName("IteratorExp");
		symbol_103.getSuperClasses().add(symbol_114); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		
		symbol_0.getOwnedTypes().add(symbol_103); // http://www.eclipse.org/ocl/3.1.0/Pivot!IteratorExp
		//
		// Pivot.ecore::pivot::LambdaType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
		//
		symbol_104.setName("LambdaType");
		symbol_104.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // Pivot.ecore::pivot::LambdaType::contextType
			symbol_105.setName("contextType");
			symbol_105.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_105.setIsResolveProxies(true);
			
			symbol_104.getOwnedAttributes().add(symbol_105);
		}
		{ // Pivot.ecore::pivot::LambdaType::parameterType
			symbol_106.setName("parameterType");
			symbol_106.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_106.setLower(BigInteger.valueOf(0));
			symbol_106.setUpper(BigInteger.valueOf(-1));
			
			symbol_106.setIsResolveProxies(true);
			
			symbol_104.getOwnedAttributes().add(symbol_106);
		}
		{ // Pivot.ecore::pivot::LambdaType::resultType
			symbol_107.setName("resultType");
			symbol_107.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_107.setIsResolveProxies(true);
			symbol_107.setOpposite(symbol_282);
			
			symbol_104.getOwnedAttributes().add(symbol_107);
		}
		
		symbol_0.getOwnedTypes().add(symbol_104); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
		//
		// Pivot.ecore::pivot::LetExp http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
		//
		symbol_108.setName("LetExp");
		symbol_108.getSuperClasses().add(symbol_144); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::LetExp::in
			symbol_109.setName("in");
			symbol_109.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_109.setIsComposite(true);
			symbol_109.setIsResolveProxies(true);
			symbol_109.setOpposite(symbol_151);
			
			symbol_108.getOwnedAttributes().add(symbol_109);
		}
		{ // Pivot.ecore::pivot::LetExp::variable
			symbol_110.setName("variable");
			symbol_110.setType(symbol_311);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			
			symbol_110.setIsComposite(true);
			symbol_110.setIsResolveProxies(true);
			symbol_110.setOpposite(symbol_314);
			
			symbol_108.getOwnedAttributes().add(symbol_110);
		}
		
		symbol_0.getOwnedTypes().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
		//
		// Pivot.ecore::pivot::Library http://www.eclipse.org/ocl/3.1.0/Pivot!Library
		//
		symbol_111.setName("Library");
		symbol_111.getSuperClasses().add(symbol_177); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		
		symbol_0.getOwnedTypes().add(symbol_111); // http://www.eclipse.org/ocl/3.1.0/Pivot!Library
		//
		// Pivot.ecore::pivot::LibraryFeature http://www.eclipse.org/ocl/3.1.0/Pivot!LibraryFeature
		//
		symbol_112.setName("LibraryFeature");
		symbol_112.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_112); // http://www.eclipse.org/ocl/3.1.0/Pivot!LibraryFeature
		//
		// Pivot.ecore::pivot::LiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		//
		symbol_113.setName("LiteralExp");
		symbol_113.getSuperClasses().add(symbol_144); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		
		symbol_0.getOwnedTypes().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		//
		// Pivot.ecore::pivot::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		//
		symbol_114.setName("LoopExp");
		symbol_114.getSuperClasses().add(symbol_17); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		{ // Pivot.ecore::pivot::LoopExp::body
			symbol_115.setName("body");
			symbol_115.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_115.setIsComposite(true);
			symbol_115.setIsResolveProxies(true);
			symbol_115.setOpposite(symbol_152);
			
			symbol_114.getOwnedAttributes().add(symbol_115);
		}
		{ // Pivot.ecore::pivot::LoopExp::iterator
			symbol_116.setName("iterator");
			symbol_116.setType(symbol_311);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_116.setLower(BigInteger.valueOf(0));
			symbol_116.setUpper(BigInteger.valueOf(-1));
			symbol_116.setIsOrdered(true);
			
			symbol_116.setIsComposite(true);
			symbol_116.setIsResolveProxies(true);
			symbol_116.setOpposite(symbol_315);
			
			symbol_114.getOwnedAttributes().add(symbol_116);
		}
		{ // Pivot.ecore::pivot::LoopExp::referredIteration
			symbol_117.setName("referredIteration");
			symbol_117.setType(symbol_99);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
			symbol_117.setLower(BigInteger.valueOf(0));
			
			symbol_117.setIsResolveProxies(true);
			symbol_117.setOpposite(symbol_100);
			
			symbol_114.getOwnedAttributes().add(symbol_117);
		}
		
		symbol_0.getOwnedTypes().add(symbol_114); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		//
		// Pivot.ecore::pivot::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
		//
		symbol_118.setName("MessageExp");
		symbol_118.getSuperClasses().add(symbol_144); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::MessageExp::argument
			symbol_119.setName("argument");
			symbol_119.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_119.setLower(BigInteger.valueOf(0));
			symbol_119.setUpper(BigInteger.valueOf(-1));
			symbol_119.setIsOrdered(true);
			
			symbol_119.setIsComposite(true);
			symbol_119.setIsResolveProxies(true);
			
			symbol_118.getOwnedAttributes().add(symbol_119);
		}
		{ // Pivot.ecore::pivot::MessageExp::calledOperation
			symbol_120.setName("calledOperation");
			symbol_120.setType(symbol_20);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
			symbol_120.setLower(BigInteger.valueOf(0));
			
			symbol_120.setIsComposite(true);
			symbol_120.setIsResolveProxies(true);
			symbol_120.setOpposite(symbol_21);
			
			symbol_118.getOwnedAttributes().add(symbol_120);
		}
		{ // Pivot.ecore::pivot::MessageExp::sentSignal
			symbol_121.setName("sentSignal");
			symbol_121.setType(symbol_228);  // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
			symbol_121.setLower(BigInteger.valueOf(0));
			
			symbol_121.setIsComposite(true);
			symbol_121.setIsResolveProxies(true);
			symbol_121.setOpposite(symbol_229);
			
			symbol_118.getOwnedAttributes().add(symbol_121);
		}
		{ // Pivot.ecore::pivot::MessageExp::target
			symbol_122.setName("target");
			symbol_122.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_122.setIsComposite(true);
			symbol_122.setIsResolveProxies(true);
			symbol_122.setOpposite(symbol_153);
			
			symbol_118.getOwnedAttributes().add(symbol_122);
		}
		
		symbol_0.getOwnedTypes().add(symbol_118); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
		//
		// Pivot.ecore::pivot::MessageType http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
		//
		symbol_123.setName("MessageType");
		symbol_123.getSuperClasses().add(symbol_278); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		{ // Pivot.ecore::pivot::MessageType::referredOperation
			symbol_124.setName("referredOperation");
			symbol_124.setType(symbol_163);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_124.setLower(BigInteger.valueOf(0));
			
			symbol_124.setIsResolveProxies(true);
			symbol_124.setOpposite(symbol_165);
			
			symbol_123.getOwnedAttributes().add(symbol_124);
		}
		{ // Pivot.ecore::pivot::MessageType::referredSignal
			symbol_125.setName("referredSignal");
			symbol_125.setType(symbol_233);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
			symbol_125.setLower(BigInteger.valueOf(0));
			
			symbol_125.setIsResolveProxies(true);
			symbol_125.setOpposite(symbol_234);
			
			symbol_123.getOwnedAttributes().add(symbol_125);
		}
		
		symbol_0.getOwnedTypes().add(symbol_123); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
		//
		// Pivot.ecore::pivot::MultiplicityElement http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		//
		symbol_126.setName("MultiplicityElement");
		symbol_126.getSuperClasses().add(symbol_63); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::MultiplicityElement::isOrdered
			symbol_127.setName("isOrdered");
			symbol_127.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_127.setIsResolveProxies(true);
			{
				Comment symbol_355 = PivotFactory.eINSTANCE.createComment();
				symbol_355.setBody("For a multivalued multiplicity, this attribute specifies whether the values in an instantiation of this element are sequentially ordered.");
				symbol_127.getOwnedComments().add(symbol_355);
			}
			
			symbol_126.getOwnedAttributes().add(symbol_127);
		}
		{ // Pivot.ecore::pivot::MultiplicityElement::isUnique
			symbol_128.setName("isUnique");
			symbol_128.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_128.setIsResolveProxies(true);
			{
				Comment symbol_356 = PivotFactory.eINSTANCE.createComment();
				symbol_356.setBody("For a multivalued multiplicity, this attributes specifies whether the values in an instantiation of this element are unique.");
				symbol_128.getOwnedComments().add(symbol_356);
			}
			
			symbol_126.getOwnedAttributes().add(symbol_128);
		}
		{ // Pivot.ecore::pivot::MultiplicityElement::lower
			symbol_129.setName("lower");
			symbol_129.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			symbol_129.setLower(BigInteger.valueOf(0));
			
			symbol_129.setIsResolveProxies(true);
			{
				Comment symbol_357 = PivotFactory.eINSTANCE.createComment();
				symbol_357.setBody("Specifies the lower bound of the multiplicity interval.");
				symbol_129.getOwnedComments().add(symbol_357);
			}
			
			symbol_126.getOwnedAttributes().add(symbol_129);
		}
		{ // Pivot.ecore::pivot::MultiplicityElement::upper
			symbol_130.setName("upper");
			symbol_130.setType(symbol_302);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			symbol_130.setLower(BigInteger.valueOf(0));
			
			symbol_130.setIsResolveProxies(true);
			{
				Comment symbol_358 = PivotFactory.eINSTANCE.createComment();
				symbol_358.setBody("Specifies the upper bound of the multiplicity interval.");
				symbol_130.getOwnedComments().add(symbol_358);
			}
			
			symbol_126.getOwnedAttributes().add(symbol_130);
		}
		{	// Pivot.ecore::pivot::MultiplicityElement::includesCardinality()
			Operation symbol_359 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesCardinality(http://www.eclipse.org/ocl/3.1.0/Pivot!Integer)
			symbol_359.setName("includesCardinality");
			symbol_359.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_360 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesCardinality(http://www.eclipse.org/ocl/3.1.0/Pivot!Integer)!C
			symbol_360.setName("C");
			symbol_360.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			
			symbol_359.getOwnedParameters().add(symbol_360);
			{
				Comment symbol_361 = PivotFactory.eINSTANCE.createComment();
				symbol_361.setBody("The query includesCardinality() checks whether the specified cardinality is valid for this multiplicity.");
				symbol_359.getOwnedComments().add(symbol_361);
			}
			
			symbol_126.getOwnedOperations().add(symbol_359);
		}
		{	// Pivot.ecore::pivot::MultiplicityElement::includesMultiplicity()
			Operation symbol_362 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesMultiplicity(http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement)
			symbol_362.setName("includesMultiplicity");
			symbol_362.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_363 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesMultiplicity(http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement)!M
			symbol_363.setName("M");
			symbol_363.setType(symbol_126);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
			
			
			symbol_362.getOwnedParameters().add(symbol_363);
			{
				Comment symbol_364 = PivotFactory.eINSTANCE.createComment();
				symbol_364.setBody("The query includesMultiplicity() checks whether this multiplicity includes all the cardinalities allowed by the specified multiplicity.");
				symbol_362.getOwnedComments().add(symbol_364);
			}
			
			symbol_126.getOwnedOperations().add(symbol_362);
		}
		{	// Pivot.ecore::pivot::MultiplicityElement::isMultivalued()
			Operation symbol_365 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isMultivalued()
			symbol_365.setName("isMultivalued");
			symbol_365.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			{
				Comment symbol_366 = PivotFactory.eINSTANCE.createComment();
				symbol_366.setBody("The query isMultivalued() checks whether this multiplicity has an upper bound greater than one.");
				symbol_365.getOwnedComments().add(symbol_366);
			}
			
			symbol_126.getOwnedOperations().add(symbol_365);
		}
		{	// Pivot.ecore::pivot::MultiplicityElement::lowerBound()
			Operation symbol_367 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!lowerBound()
			symbol_367.setName("lowerBound");
			symbol_367.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			{
				Comment symbol_368 = PivotFactory.eINSTANCE.createComment();
				symbol_368.setBody("The query lowerBound() returns the lower bound of the multiplicity as an integer.");
				symbol_367.getOwnedComments().add(symbol_368);
			}
			
			symbol_126.getOwnedOperations().add(symbol_367);
		}
		{	// Pivot.ecore::pivot::MultiplicityElement::upperBound()
			Operation symbol_369 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!upperBound()
			symbol_369.setName("upperBound");
			symbol_369.setType(symbol_302);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			
			{
				Comment symbol_370 = PivotFactory.eINSTANCE.createComment();
				symbol_370.setBody("The query upperBound() returns the upper bound of the multiplicity for a bounded multiplicity as an unlimited natural.");
				symbol_369.getOwnedComments().add(symbol_370);
			}
			
			symbol_126.getOwnedOperations().add(symbol_369);
		}
		{
			Comment symbol_371 = PivotFactory.eINSTANCE.createComment();
			symbol_371.setBody("A multiplicity is a definition of an inclusive interval of non-negative integers beginning with a lower bound and ending with a (possibly infinite) upper bound. A multiplicity element embeds this information to specify the allowable cardinalities for an instantiation of this element.");
			symbol_126.getOwnedComments().add(symbol_371);
		}
		
		symbol_0.getOwnedTypes().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		//
		// Pivot.ecore::pivot::Nameable http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		//
		symbol_131.setName("Nameable");
		symbol_131.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_131); // http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		//
		// Pivot.ecore::pivot::NamedElement http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		//
		symbol_132.setName("NamedElement");
		symbol_132.getSuperClasses().add(symbol_63); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		symbol_132.getSuperClasses().add(symbol_131); // http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		{ // Pivot.ecore::pivot::NamedElement::isStatic
			symbol_133.setName("isStatic");
			symbol_133.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_133.setIsResolveProxies(true);
			
			symbol_132.getOwnedAttributes().add(symbol_133);
		}
		{ // Pivot.ecore::pivot::NamedElement::name
			symbol_134.setName("name");
			symbol_134.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_134.setLower(BigInteger.valueOf(0));
			
			symbol_134.setIsResolveProxies(true);
			{
				Comment symbol_372 = PivotFactory.eINSTANCE.createComment();
				symbol_372.setBody("The name of the NamedElement.");
				symbol_134.getOwnedComments().add(symbol_372);
			}
			
			symbol_132.getOwnedAttributes().add(symbol_134);
		}
		{ // Pivot.ecore::pivot::NamedElement::ownedAnnotation
			symbol_135.setName("ownedAnnotation");
			symbol_135.setType(symbol_1);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
			symbol_135.setLower(BigInteger.valueOf(0));
			symbol_135.setUpper(BigInteger.valueOf(-1));
			symbol_135.setIsOrdered(true);
			
			symbol_135.setIsComposite(true);
			symbol_135.setIsResolveProxies(true);
			symbol_135.setOpposite(symbol_2);
			
			symbol_132.getOwnedAttributes().add(symbol_135);
		}
		{ // Pivot.ecore::pivot::NamedElement::ownedRule
			symbol_136.setName("ownedRule");
			symbol_136.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_136.setLower(BigInteger.valueOf(0));
			symbol_136.setUpper(BigInteger.valueOf(-1));
			symbol_136.setIsOrdered(true);
			
			symbol_136.setIsComposite(true);
			symbol_136.setIsResolveProxies(true);
			symbol_136.setOpposite(symbol_47);
			
			symbol_132.getOwnedAttributes().add(symbol_136);
		}
		{
			Comment symbol_373 = PivotFactory.eINSTANCE.createComment();
			symbol_373.setBody("A named element represents an element with a name.");
			symbol_132.getOwnedComments().add(symbol_373);
		}
		
		symbol_0.getOwnedTypes().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		//
		// Pivot.ecore::pivot::Namespace http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		//
		symbol_137.setName("Namespace");
		symbol_137.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		
		symbol_0.getOwnedTypes().add(symbol_137); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		//
		// Pivot.ecore::pivot::NavigationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		//
		symbol_138.setName("NavigationCallExp");
		symbol_138.getSuperClasses().add(symbol_85); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		{ // Pivot.ecore::pivot::NavigationCallExp::navigationSource
			symbol_139.setName("navigationSource");
			symbol_139.setType(symbol_202);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_139.setLower(BigInteger.valueOf(0));
			symbol_139.setIsOrdered(true);
			
			symbol_139.setIsResolveProxies(true);
			symbol_139.setOpposite(symbol_204);
			
			symbol_138.getOwnedAttributes().add(symbol_139);
		}
		{ // Pivot.ecore::pivot::NavigationCallExp::qualifier
			symbol_140.setName("qualifier");
			symbol_140.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_140.setLower(BigInteger.valueOf(0));
			symbol_140.setUpper(BigInteger.valueOf(-1));
			symbol_140.setIsOrdered(true);
			
			symbol_140.setIsResolveProxies(true);
			symbol_140.setOpposite(symbol_154);
			
			symbol_138.getOwnedAttributes().add(symbol_140);
		}
		
		symbol_0.getOwnedTypes().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		//
		// Pivot.ecore::pivot::NullLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!NullLiteralExp
		//
		symbol_141.setName("NullLiteralExp");
		symbol_141.getSuperClasses().add(symbol_200); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		
		symbol_0.getOwnedTypes().add(symbol_141); // http://www.eclipse.org/ocl/3.1.0/Pivot!NullLiteralExp
		//
		// Pivot.ecore::pivot::NumericLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		//
		symbol_142.setName("NumericLiteralExp");
		symbol_142.getSuperClasses().add(symbol_200); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		
		symbol_0.getOwnedTypes().add(symbol_142); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		//
		// Pivot.ecore::pivot::Object http://www.eclipse.org/ocl/3.1.0/Pivot!Object
		//
		symbol_143.setName("Object");
		symbol_143.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_143); // http://www.eclipse.org/ocl/3.1.0/Pivot!Object
		//
		// Pivot.ecore::pivot::OclExpression http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		//
		symbol_144.setName("OclExpression");
		symbol_144.getSuperClasses().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		{ // Pivot.ecore::pivot::OclExpression::CallExp
			symbol_145.setName("CallExp");
			symbol_145.setType(symbol_17);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
			symbol_145.setLower(BigInteger.valueOf(0));
			
			symbol_145.setImplicit(true);
			symbol_145.setIsResolveProxies(true);
			symbol_145.setOpposite(symbol_19);
			
			symbol_144.getOwnedAttributes().add(symbol_145);
		}
		{ // Pivot.ecore::pivot::OclExpression::CollectionItem
			symbol_146.setName("CollectionItem");
			symbol_146.setType(symbol_28);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
			symbol_146.setLower(BigInteger.valueOf(0));
			
			symbol_146.setImplicit(true);
			symbol_146.setIsResolveProxies(true);
			symbol_146.setOpposite(symbol_29);
			
			symbol_144.getOwnedAttributes().add(symbol_146);
		}
		{ // Pivot.ecore::pivot::OclExpression::CollectionRange
			symbol_147.setName("CollectionRange");
			symbol_147.setType(symbol_36);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
			symbol_147.setLower(BigInteger.valueOf(0));
			symbol_147.setUpper(BigInteger.valueOf(-1));
			
			symbol_147.setImplicit(true);
			symbol_147.setIsResolveProxies(true);
			
			symbol_144.getOwnedAttributes().add(symbol_147);
		}
		{ // Pivot.ecore::pivot::OclExpression::ConstructorPart
			symbol_148.setName("ConstructorPart");
			symbol_148.setType(symbol_53);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorPart
			symbol_148.setLower(BigInteger.valueOf(0));
			
			symbol_148.setImplicit(true);
			symbol_148.setIsResolveProxies(true);
			symbol_148.setOpposite(symbol_55);
			
			symbol_144.getOwnedAttributes().add(symbol_148);
		}
		{ // Pivot.ecore::pivot::OclExpression::ExpressionInOcl
			symbol_149.setName("ExpressionInOcl");
			symbol_149.setType(symbol_76);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
			symbol_149.setLower(BigInteger.valueOf(0));
			symbol_149.setUpper(BigInteger.valueOf(-1));
			
			symbol_149.setImplicit(true);
			symbol_149.setIsResolveProxies(true);
			
			symbol_144.getOwnedAttributes().add(symbol_149);
		}
		{ // Pivot.ecore::pivot::OclExpression::IfExp
			symbol_150.setName("IfExp");
			symbol_150.setType(symbol_87);  // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
			symbol_150.setLower(BigInteger.valueOf(0));
			symbol_150.setUpper(BigInteger.valueOf(-1));
			
			symbol_150.setImplicit(true);
			symbol_150.setIsResolveProxies(true);
			
			symbol_144.getOwnedAttributes().add(symbol_150);
		}
		{ // Pivot.ecore::pivot::OclExpression::LetExp
			symbol_151.setName("LetExp");
			symbol_151.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
			symbol_151.setLower(BigInteger.valueOf(0));
			
			symbol_151.setImplicit(true);
			symbol_151.setIsResolveProxies(true);
			symbol_151.setOpposite(symbol_109);
			
			symbol_144.getOwnedAttributes().add(symbol_151);
		}
		{ // Pivot.ecore::pivot::OclExpression::LoopExp
			symbol_152.setName("LoopExp");
			symbol_152.setType(symbol_114);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
			symbol_152.setLower(BigInteger.valueOf(0));
			
			symbol_152.setImplicit(true);
			symbol_152.setIsResolveProxies(true);
			symbol_152.setOpposite(symbol_115);
			
			symbol_144.getOwnedAttributes().add(symbol_152);
		}
		{ // Pivot.ecore::pivot::OclExpression::MessageExp
			symbol_153.setName("MessageExp");
			symbol_153.setType(symbol_118);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
			symbol_153.setLower(BigInteger.valueOf(0));
			symbol_153.setUpper(BigInteger.valueOf(-1));
			
			symbol_153.setImplicit(true);
			symbol_153.setIsResolveProxies(true);
			
			symbol_144.getOwnedAttributes().add(symbol_153);
		}
		{ // Pivot.ecore::pivot::OclExpression::NavigationCallExp
			symbol_154.setName("NavigationCallExp");
			symbol_154.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
			symbol_154.setLower(BigInteger.valueOf(0));
			symbol_154.setUpper(BigInteger.valueOf(-1));
			
			symbol_154.setImplicit(true);
			symbol_154.setIsResolveProxies(true);
			symbol_154.setOpposite(symbol_140);
			
			symbol_144.getOwnedAttributes().add(symbol_154);
		}
		{ // Pivot.ecore::pivot::OclExpression::OperationCallExp
			symbol_155.setName("OperationCallExp");
			symbol_155.setType(symbol_172);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
			symbol_155.setLower(BigInteger.valueOf(0));
			
			symbol_155.setImplicit(true);
			symbol_155.setIsResolveProxies(true);
			symbol_155.setOpposite(symbol_173);
			
			symbol_144.getOwnedAttributes().add(symbol_155);
		}
		{ // Pivot.ecore::pivot::OclExpression::TupleLiteralPart
			symbol_156.setName("TupleLiteralPart");
			symbol_156.setType(symbol_274);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
			symbol_156.setLower(BigInteger.valueOf(0));
			
			symbol_156.setImplicit(true);
			symbol_156.setIsResolveProxies(true);
			symbol_156.setOpposite(symbol_276);
			
			symbol_144.getOwnedAttributes().add(symbol_156);
		}
		{ // Pivot.ecore::pivot::OclExpression::Variable
			symbol_157.setName("Variable");
			symbol_157.setType(symbol_311);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_157.setLower(BigInteger.valueOf(0));
			
			symbol_157.setImplicit(true);
			symbol_157.setIsResolveProxies(true);
			symbol_157.setOpposite(symbol_317);
			
			symbol_144.getOwnedAttributes().add(symbol_157);
		}
		
		symbol_0.getOwnedTypes().add(symbol_144); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		//
		// Pivot.ecore::pivot::OpaqueExpression http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		//
		symbol_158.setName("OpaqueExpression");
		symbol_158.getSuperClasses().add(symbol_309); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		{ // Pivot.ecore::pivot::OpaqueExpression::body
			symbol_159.setName("body");
			symbol_159.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_159.setLower(BigInteger.valueOf(0));
			symbol_159.setUpper(BigInteger.valueOf(-1));
			symbol_159.setIsOrdered(true);
			symbol_159.setIsUnique(false);
			
			symbol_159.setIsResolveProxies(true);
			{
				Comment symbol_374 = PivotFactory.eINSTANCE.createComment();
				symbol_374.setBody("The text of the expression, possibly in multiple languages.");
				symbol_159.getOwnedComments().add(symbol_374);
			}
			
			symbol_158.getOwnedAttributes().add(symbol_159);
		}
		{ // Pivot.ecore::pivot::OpaqueExpression::language
			symbol_160.setName("language");
			symbol_160.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_160.setLower(BigInteger.valueOf(0));
			symbol_160.setUpper(BigInteger.valueOf(-1));
			symbol_160.setIsOrdered(true);
			
			symbol_160.setIsResolveProxies(true);
			{
				Comment symbol_375 = PivotFactory.eINSTANCE.createComment();
				symbol_375.setBody("Specifies the languages in which the expression is stated. The interpretation of the expression body depends on the languages. If the languages are unspecified, they might be implicit from the expression body or the context. Languages are matched to body strings by order.");
				symbol_160.getOwnedComments().add(symbol_375);
			}
			
			symbol_158.getOwnedAttributes().add(symbol_160);
		}
		{ // Pivot.ecore::pivot::OpaqueExpression::message
			symbol_161.setName("message");
			symbol_161.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_161.setLower(BigInteger.valueOf(0));
			symbol_161.setUpper(BigInteger.valueOf(-1));
			symbol_161.setIsOrdered(true);
			symbol_161.setIsUnique(false);
			
			symbol_161.setIsResolveProxies(true);
			
			symbol_158.getOwnedAttributes().add(symbol_161);
		}
		{ // Pivot.ecore::pivot::OpaqueExpression::valueExpression
			symbol_162.setName("valueExpression");
			symbol_162.setType(symbol_76);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
			symbol_162.setLower(BigInteger.valueOf(0));
			
			symbol_162.setIsResolveProxies(true);
			symbol_162.setIsTransient(true);
			
			symbol_158.getOwnedAttributes().add(symbol_162);
		}
		{
			Comment symbol_376 = PivotFactory.eINSTANCE.createComment();
			symbol_376.setBody("An opaque expression is an uninterpreted textual statement that denotes a (possibly empty) set of values when evaluated in a context.");
			symbol_158.getOwnedComments().add(symbol_376);
		}
		
		symbol_0.getOwnedTypes().add(symbol_158); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		//
		// Pivot.ecore::pivot::Operation http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		//
		symbol_163.setName("Operation");
		symbol_163.getSuperClasses().add(symbol_82); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		symbol_163.getSuperClasses().add(symbol_137); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		symbol_163.getSuperClasses().add(symbol_267); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		symbol_163.getSuperClasses().add(symbol_189); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // Pivot.ecore::pivot::Operation::CallOperationAction
			symbol_164.setName("CallOperationAction");
			symbol_164.setType(symbol_20);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
			symbol_164.setLower(BigInteger.valueOf(0));
			symbol_164.setUpper(BigInteger.valueOf(-1));
			
			symbol_164.setImplicit(true);
			symbol_164.setIsResolveProxies(true);
			symbol_164.setOpposite(symbol_22);
			
			symbol_163.getOwnedAttributes().add(symbol_164);
		}
		{ // Pivot.ecore::pivot::Operation::MessageType
			symbol_165.setName("MessageType");
			symbol_165.setType(symbol_123);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
			symbol_165.setLower(BigInteger.valueOf(0));
			symbol_165.setUpper(BigInteger.valueOf(-1));
			
			symbol_165.setImplicit(true);
			symbol_165.setIsResolveProxies(true);
			symbol_165.setOpposite(symbol_124);
			
			symbol_163.getOwnedAttributes().add(symbol_165);
		}
		{ // Pivot.ecore::pivot::Operation::OperationCallExp
			symbol_166.setName("OperationCallExp");
			symbol_166.setType(symbol_172);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
			symbol_166.setLower(BigInteger.valueOf(0));
			symbol_166.setUpper(BigInteger.valueOf(-1));
			
			symbol_166.setImplicit(true);
			symbol_166.setIsResolveProxies(true);
			symbol_166.setOpposite(symbol_174);
			
			symbol_163.getOwnedAttributes().add(symbol_166);
		}
		{ // Pivot.ecore::pivot::Operation::class
			symbol_167.setName("class");
			symbol_167.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
			symbol_167.setLower(BigInteger.valueOf(0));
			
			symbol_167.setIsReadOnly(true);
			symbol_167.setIsResolveProxies(true);
			symbol_167.setIsTransient(true);
			symbol_167.setIsVolatile(true);
			{
				Comment symbol_377 = PivotFactory.eINSTANCE.createComment();
				symbol_377.setBody("The class that owns the operation.");
				symbol_167.getOwnedComments().add(symbol_377);
			}
			
			symbol_163.getOwnedAttributes().add(symbol_167);
		}
		{ // Pivot.ecore::pivot::Operation::ownedParameter
			symbol_168.setName("ownedParameter");
			symbol_168.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_168.setLower(BigInteger.valueOf(0));
			symbol_168.setUpper(BigInteger.valueOf(-1));
			symbol_168.setIsOrdered(true);
			
			symbol_168.setIsComposite(true);
			symbol_168.setIsResolveProxies(true);
			symbol_168.setOpposite(symbol_188);
			{
				Comment symbol_378 = PivotFactory.eINSTANCE.createComment();
				symbol_378.setBody("The parameters to the operation.");
				symbol_168.getOwnedComments().add(symbol_378);
			}
			
			symbol_163.getOwnedAttributes().add(symbol_168);
		}
		{ // Pivot.ecore::pivot::Operation::owningType
			symbol_169.setName("owningType");
			symbol_169.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_169.setLower(BigInteger.valueOf(0));
			
			symbol_169.setIsResolveProxies(true);
			symbol_169.setOpposite(symbol_291);
			
			symbol_163.getOwnedAttributes().add(symbol_169);
		}
		{ // Pivot.ecore::pivot::Operation::precedence
			symbol_170.setName("precedence");
			symbol_170.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
			symbol_170.setLower(BigInteger.valueOf(0));
			
			symbol_170.setIsResolveProxies(true);
			symbol_170.setOpposite(symbol_196);
			
			symbol_163.getOwnedAttributes().add(symbol_170);
		}
		{ // Pivot.ecore::pivot::Operation::raisedException
			symbol_171.setName("raisedException");
			symbol_171.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_171.setLower(BigInteger.valueOf(0));
			symbol_171.setUpper(BigInteger.valueOf(-1));
			
			symbol_171.setIsResolveProxies(true);
			symbol_171.setOpposite(symbol_283);
			{
				Comment symbol_379 = PivotFactory.eINSTANCE.createComment();
				symbol_379.setBody("The exceptions that are declared as possible during an invocation of the operation.");
				symbol_171.getOwnedComments().add(symbol_379);
			}
			
			symbol_163.getOwnedAttributes().add(symbol_171);
		}
		{
			Comment symbol_380 = PivotFactory.eINSTANCE.createComment();
			symbol_380.setBody("An operation is owned by a class and may be invoked in the context of objects that are instances of that class. It is a typed element and a multiplicity element.\r\nOperation specializes TemplateableElement in order to support specification of template operations and bound operations. Operation specializes ParameterableElement to specify that an operation can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.");
			symbol_163.getOwnedComments().add(symbol_380);
		}
		
		symbol_0.getOwnedTypes().add(symbol_163); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		//
		// Pivot.ecore::pivot::OperationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
		//
		symbol_172.setName("OperationCallExp");
		symbol_172.getSuperClasses().add(symbol_85); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		{ // Pivot.ecore::pivot::OperationCallExp::argument
			symbol_173.setName("argument");
			symbol_173.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_173.setLower(BigInteger.valueOf(0));
			symbol_173.setUpper(BigInteger.valueOf(-1));
			symbol_173.setIsOrdered(true);
			
			symbol_173.setIsComposite(true);
			symbol_173.setIsResolveProxies(true);
			symbol_173.setOpposite(symbol_155);
			
			symbol_172.getOwnedAttributes().add(symbol_173);
		}
		{ // Pivot.ecore::pivot::OperationCallExp::referredOperation
			symbol_174.setName("referredOperation");
			symbol_174.setType(symbol_163);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_174.setLower(BigInteger.valueOf(0));
			
			symbol_174.setIsResolveProxies(true);
			symbol_174.setOpposite(symbol_166);
			
			symbol_172.getOwnedAttributes().add(symbol_174);
		}
		
		symbol_0.getOwnedTypes().add(symbol_172); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
		//
		// Pivot.ecore::pivot::OperationTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!OperationTemplateParameter
		//
		symbol_175.setName("OperationTemplateParameter");
		symbol_175.getSuperClasses().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		{
			Comment symbol_381 = PivotFactory.eINSTANCE.createComment();
			symbol_381.setBody("An operation template parameter exposes an operation as a formal parameter for a template.");
			symbol_175.getOwnedComments().add(symbol_381);
		}
		
		symbol_0.getOwnedTypes().add(symbol_175); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationTemplateParameter
		//
		// Pivot.ecore::pivot::OrderedSetType http://www.eclipse.org/ocl/3.1.0/Pivot!OrderedSetType
		//
		symbol_176.setName("OrderedSetType");
		symbol_176.getSuperClasses().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		
		symbol_0.getOwnedTypes().add(symbol_176); // http://www.eclipse.org/ocl/3.1.0/Pivot!OrderedSetType
		//
		// Pivot.ecore::pivot::Package http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		//
		symbol_177.setName("Package");
		symbol_177.getSuperClasses().add(symbol_137); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		symbol_177.getSuperClasses().add(symbol_267); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		{ // Pivot.ecore::pivot::Package::nestedPackage
			symbol_178.setName("nestedPackage");
			symbol_178.setType(symbol_177);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_178.setLower(BigInteger.valueOf(0));
			symbol_178.setUpper(BigInteger.valueOf(-1));
			
			symbol_178.setIsComposite(true);
			symbol_178.setIsResolveProxies(true);
			symbol_178.setOpposite(symbol_179);
			{
				Comment symbol_382 = PivotFactory.eINSTANCE.createComment();
				symbol_382.setBody("The set of contained packages.");
				symbol_178.getOwnedComments().add(symbol_382);
			}
			
			symbol_177.getOwnedAttributes().add(symbol_178);
		}
		{ // Pivot.ecore::pivot::Package::nestingPackage
			symbol_179.setName("nestingPackage");
			symbol_179.setType(symbol_177);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_179.setLower(BigInteger.valueOf(0));
			
			symbol_179.setIsResolveProxies(true);
			symbol_179.setOpposite(symbol_178);
			{
				Comment symbol_383 = PivotFactory.eINSTANCE.createComment();
				symbol_383.setBody("The containing package.");
				symbol_179.getOwnedComments().add(symbol_383);
			}
			
			symbol_177.getOwnedAttributes().add(symbol_179);
		}
		{ // Pivot.ecore::pivot::Package::nsPrefix
			symbol_180.setName("nsPrefix");
			symbol_180.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_180.setLower(BigInteger.valueOf(0));
			
			symbol_180.setIsResolveProxies(true);
			
			symbol_177.getOwnedAttributes().add(symbol_180);
		}
		{ // Pivot.ecore::pivot::Package::nsURI
			symbol_181.setName("nsURI");
			symbol_181.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_181.setLower(BigInteger.valueOf(0));
			
			symbol_181.setIsResolveProxies(true);
			
			symbol_177.getOwnedAttributes().add(symbol_181);
		}
		{ // Pivot.ecore::pivot::Package::ownedPrecedence
			symbol_182.setName("ownedPrecedence");
			symbol_182.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
			symbol_182.setLower(BigInteger.valueOf(0));
			symbol_182.setUpper(BigInteger.valueOf(-1));
			symbol_182.setIsOrdered(true);
			
			symbol_182.setIsComposite(true);
			symbol_182.setIsResolveProxies(true);
			symbol_182.setOpposite(symbol_197);
			
			symbol_177.getOwnedAttributes().add(symbol_182);
		}
		{ // Pivot.ecore::pivot::Package::ownedType
			symbol_183.setName("ownedType");
			symbol_183.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_183.setLower(BigInteger.valueOf(0));
			symbol_183.setUpper(BigInteger.valueOf(-1));
			
			symbol_183.setIsComposite(true);
			symbol_183.setIsResolveProxies(true);
			symbol_183.setOpposite(symbol_292);
			{
				Comment symbol_384 = PivotFactory.eINSTANCE.createComment();
				symbol_384.setBody("The set of contained types.");
				symbol_183.getOwnedComments().add(symbol_384);
			}
			
			symbol_177.getOwnedAttributes().add(symbol_183);
		}
		{
			Comment symbol_385 = PivotFactory.eINSTANCE.createComment();
			symbol_385.setBody("A package is a container for types and other packages.\r\nPackage specializes TemplateableElement and PackageableElement specializes ParameterableElement to specify that a package can be used as a template and a PackageableElement as a template parameter.");
			symbol_177.getOwnedComments().add(symbol_385);
		}
		
		symbol_0.getOwnedTypes().add(symbol_177); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		//
		// Pivot.ecore::pivot::PackageableElement http://www.eclipse.org/ocl/3.1.0/Pivot!PackageableElement
		//
		symbol_184.setName("PackageableElement");
		symbol_184.getSuperClasses().add(symbol_189); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{
			Comment symbol_386 = PivotFactory.eINSTANCE.createComment();
			symbol_386.setBody("Packageable elements are able to serve as a template parameter.");
			symbol_184.getOwnedComments().add(symbol_386);
		}
		
		symbol_0.getOwnedTypes().add(symbol_184); // http://www.eclipse.org/ocl/3.1.0/Pivot!PackageableElement
		//
		// Pivot.ecore::pivot::Parameter http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
		//
		symbol_185.setName("Parameter");
		symbol_185.getSuperClasses().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		symbol_185.getSuperClasses().add(symbol_319); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		{ // Pivot.ecore::pivot::Parameter::Iteration
			symbol_186.setName("Iteration");
			symbol_186.setType(symbol_99);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
			symbol_186.setLower(BigInteger.valueOf(0));
			symbol_186.setUpper(BigInteger.valueOf(-1));
			
			symbol_186.setImplicit(true);
			symbol_186.setIsResolveProxies(true);
			
			symbol_185.getOwnedAttributes().add(symbol_186);
		}
		{ // Pivot.ecore::pivot::Parameter::Variable
			symbol_187.setName("Variable");
			symbol_187.setType(symbol_311);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_187.setLower(BigInteger.valueOf(0));
			symbol_187.setUpper(BigInteger.valueOf(-1));
			
			symbol_187.setImplicit(true);
			symbol_187.setIsResolveProxies(true);
			symbol_187.setOpposite(symbol_318);
			
			symbol_185.getOwnedAttributes().add(symbol_187);
		}
		{ // Pivot.ecore::pivot::Parameter::operation
			symbol_188.setName("operation");
			symbol_188.setType(symbol_163);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_188.setLower(BigInteger.valueOf(0));
			
			symbol_188.setIsResolveProxies(true);
			symbol_188.setOpposite(symbol_168);
			{
				Comment symbol_387 = PivotFactory.eINSTANCE.createComment();
				symbol_387.setBody("The operation that owns the parameter.");
				symbol_188.getOwnedComments().add(symbol_387);
			}
			
			symbol_185.getOwnedAttributes().add(symbol_188);
		}
		{
			Comment symbol_388 = PivotFactory.eINSTANCE.createComment();
			symbol_388.setBody("A parameter is a typed element that represents a parameter of an operation.");
			symbol_185.getOwnedComments().add(symbol_388);
		}
		
		symbol_0.getOwnedTypes().add(symbol_185); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
		//
		// Pivot.ecore::pivot::ParameterableElement http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		//
		symbol_189.setName("ParameterableElement");
		symbol_189.getSuperClasses().add(symbol_63); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::ParameterableElement::TemplateParameter
			symbol_190.setName("TemplateParameter");
			symbol_190.setType(symbol_247);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_190.setLower(BigInteger.valueOf(0));
			symbol_190.setUpper(BigInteger.valueOf(-1));
			
			symbol_190.setImplicit(true);
			symbol_190.setIsResolveProxies(true);
			
			symbol_189.getOwnedAttributes().add(symbol_190);
		}
		{ // Pivot.ecore::pivot::ParameterableElement::TemplateParameterSubstitution
			symbol_191.setName("TemplateParameterSubstitution");
			symbol_191.setType(symbol_255);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
			symbol_191.setLower(BigInteger.valueOf(0));
			symbol_191.setUpper(BigInteger.valueOf(-1));
			
			symbol_191.setImplicit(true);
			symbol_191.setIsResolveProxies(true);
			
			symbol_189.getOwnedAttributes().add(symbol_191);
		}
		{ // Pivot.ecore::pivot::ParameterableElement::owningTemplateParameter
			symbol_192.setName("owningTemplateParameter");
			symbol_192.setType(symbol_247);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_192.setLower(BigInteger.valueOf(0));
			
			symbol_192.setIsResolveProxies(true);
			symbol_192.setOpposite(symbol_252);
			{
				Comment symbol_389 = PivotFactory.eINSTANCE.createComment();
				symbol_389.setBody("The formal template parameter that owns this element.");
				symbol_192.getOwnedComments().add(symbol_389);
			}
			
			symbol_189.getOwnedAttributes().add(symbol_192);
		}
		{ // Pivot.ecore::pivot::ParameterableElement::templateParameter
			symbol_193.setName("templateParameter");
			symbol_193.setType(symbol_247);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_193.setLower(BigInteger.valueOf(0));
			
			symbol_193.setIsResolveProxies(true);
			symbol_193.setOpposite(symbol_253);
			{
				Comment symbol_390 = PivotFactory.eINSTANCE.createComment();
				symbol_390.setBody("The template parameter that exposes this element as a formal parameter.");
				symbol_193.getOwnedComments().add(symbol_390);
			}
			
			symbol_189.getOwnedAttributes().add(symbol_193);
		}
		{	// Pivot.ecore::pivot::ParameterableElement::isCompatibleWith()
			Operation symbol_391 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!isCompatibleWith(http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement)
			symbol_391.setName("isCompatibleWith");
			symbol_391.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_392 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!isCompatibleWith(http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement)!p
			symbol_392.setName("p");
			symbol_392.setType(symbol_189);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			
			
			symbol_391.getOwnedParameters().add(symbol_392);
			
			symbol_189.getOwnedOperations().add(symbol_391);
		}
		{	// Pivot.ecore::pivot::ParameterableElement::isTemplateParameter()
			Operation symbol_393 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!isTemplateParameter()
			symbol_393.setName("isTemplateParameter");
			symbol_393.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			{
				Comment symbol_394 = PivotFactory.eINSTANCE.createComment();
				symbol_394.setBody("The query isTemplateParameter() determines if this parameterable element is exposed as a formal template parameter.");
				symbol_393.getOwnedComments().add(symbol_394);
			}
			
			symbol_189.getOwnedOperations().add(symbol_393);
		}
		{
			Comment symbol_395 = PivotFactory.eINSTANCE.createComment();
			symbol_395.setBody("A parameterable element is an element that can be exposed as a formal template parameter for a template, or specified as an actual parameter in a binding of a template.");
			symbol_189.getOwnedComments().add(symbol_395);
		}
		
		symbol_0.getOwnedTypes().add(symbol_189); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		//
		// Pivot.ecore::pivot::Pivotable http://www.eclipse.org/ocl/3.1.0/Pivot!Pivotable
		//
		symbol_194.setName("Pivotable");
		symbol_194.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_194); // http://www.eclipse.org/ocl/3.1.0/Pivot!Pivotable
		//
		// Pivot.ecore::pivot::Precedence http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
		//
		symbol_195.setName("Precedence");
		symbol_195.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::Precedence::Operation
			symbol_196.setName("Operation");
			symbol_196.setType(symbol_163);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_196.setLower(BigInteger.valueOf(0));
			symbol_196.setUpper(BigInteger.valueOf(-1));
			
			symbol_196.setImplicit(true);
			symbol_196.setIsResolveProxies(true);
			symbol_196.setOpposite(symbol_170);
			
			symbol_195.getOwnedAttributes().add(symbol_196);
		}
		{ // Pivot.ecore::pivot::Precedence::Package
			symbol_197.setName("Package");
			symbol_197.setType(symbol_177);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_197.setLower(BigInteger.valueOf(0));
			
			symbol_197.setImplicit(true);
			symbol_197.setIsResolveProxies(true);
			symbol_197.setOpposite(symbol_182);
			
			symbol_195.getOwnedAttributes().add(symbol_197);
		}
		{ // Pivot.ecore::pivot::Precedence::associativity
			symbol_198.setName("associativity");
			symbol_198.setType(symbol_12);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
			symbol_198.setLower(BigInteger.valueOf(0));
			
			symbol_198.setIsResolveProxies(true);
			
			symbol_195.getOwnedAttributes().add(symbol_198);
		}
		{ // Pivot.ecore::pivot::Precedence::order
			symbol_199.setName("order");
			symbol_199.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_199.setIsDerived(true);
			symbol_199.setIsResolveProxies(true);
			symbol_199.setIsTransient(true);
			symbol_199.setIsVolatile(true);
			
			symbol_195.getOwnedAttributes().add(symbol_199);
		}
		
		symbol_0.getOwnedTypes().add(symbol_195); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
		//
		// Pivot.ecore::pivot::PrimitiveLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		//
		symbol_200.setName("PrimitiveLiteralExp");
		symbol_200.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		
		symbol_0.getOwnedTypes().add(symbol_200); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		//
		// Pivot.ecore::pivot::PrimitiveType http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveType
		//
		symbol_201.setName("PrimitiveType");
		symbol_201.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{
			Comment symbol_396 = PivotFactory.eINSTANCE.createComment();
			symbol_396.setBody("A primitive type is a data type implemented by the underlying infrastructure and made available for modeling.");
			symbol_201.getOwnedComments().add(symbol_396);
		}
		
		symbol_0.getOwnedTypes().add(symbol_201); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveType
		//
		// Pivot.ecore::pivot::Property http://www.eclipse.org/ocl/3.1.0/Pivot!Property
		//
		symbol_202.setName("Property");
		symbol_202.getSuperClasses().add(symbol_82); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		symbol_202.getSuperClasses().add(symbol_189); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // Pivot.ecore::pivot::Property::ConstructorPart
			symbol_203.setName("ConstructorPart");
			symbol_203.setType(symbol_53);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ConstructorPart
			symbol_203.setLower(BigInteger.valueOf(0));
			symbol_203.setUpper(BigInteger.valueOf(-1));
			
			symbol_203.setImplicit(true);
			symbol_203.setIsResolveProxies(true);
			symbol_203.setOpposite(symbol_56);
			
			symbol_202.getOwnedAttributes().add(symbol_203);
		}
		{ // Pivot.ecore::pivot::Property::NavigationCallExp
			symbol_204.setName("NavigationCallExp");
			symbol_204.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
			symbol_204.setLower(BigInteger.valueOf(0));
			symbol_204.setUpper(BigInteger.valueOf(-1));
			
			symbol_204.setImplicit(true);
			symbol_204.setIsResolveProxies(true);
			symbol_204.setOpposite(symbol_139);
			
			symbol_202.getOwnedAttributes().add(symbol_204);
		}
		{ // Pivot.ecore::pivot::Property::Property
			symbol_205.setName("Property");
			symbol_205.setType(symbol_202);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_205.setLower(BigInteger.valueOf(0));
			symbol_205.setUpper(BigInteger.valueOf(-1));
			
			symbol_205.setImplicit(true);
			symbol_205.setIsResolveProxies(true);
			
			symbol_202.getOwnedAttributes().add(symbol_205);
		}
		{ // Pivot.ecore::pivot::Property::PropertyCallExp
			symbol_206.setName("PropertyCallExp");
			symbol_206.setType(symbol_222);  // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
			symbol_206.setLower(BigInteger.valueOf(0));
			symbol_206.setUpper(BigInteger.valueOf(-1));
			
			symbol_206.setImplicit(true);
			symbol_206.setIsResolveProxies(true);
			symbol_206.setOpposite(symbol_223);
			
			symbol_202.getOwnedAttributes().add(symbol_206);
		}
		{ // Pivot.ecore::pivot::Property::association
			symbol_207.setName("association");
			symbol_207.setType(symbol_7);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
			symbol_207.setLower(BigInteger.valueOf(0));
			
			symbol_207.setIsResolveProxies(true);
			symbol_207.setOpposite(symbol_9);
			
			symbol_202.getOwnedAttributes().add(symbol_207);
		}
		{ // Pivot.ecore::pivot::Property::class
			symbol_208.setName("class");
			symbol_208.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
			symbol_208.setLower(BigInteger.valueOf(0));
			
			symbol_208.setIsReadOnly(true);
			symbol_208.setIsResolveProxies(true);
			symbol_208.setIsTransient(true);
			symbol_208.setIsVolatile(true);
			{
				Comment symbol_397 = PivotFactory.eINSTANCE.createComment();
				symbol_397.setBody("The class that owns the property, and of which the property is an attribute.");
				symbol_208.getOwnedComments().add(symbol_397);
			}
			
			symbol_202.getOwnedAttributes().add(symbol_208);
		}
		{ // Pivot.ecore::pivot::Property::default
			symbol_209.setName("default");
			symbol_209.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_209.setLower(BigInteger.valueOf(0));
			
			symbol_209.setIsResolveProxies(true);
			{
				Comment symbol_398 = PivotFactory.eINSTANCE.createComment();
				symbol_398.setBody("A string that is evaluated to give a default value for the attribute when an object of the owning class is instantiated.");
				symbol_209.getOwnedComments().add(symbol_398);
			}
			
			symbol_202.getOwnedAttributes().add(symbol_209);
		}
		{ // Pivot.ecore::pivot::Property::implicit
			symbol_210.setName("implicit");
			symbol_210.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_210.setLower(BigInteger.valueOf(0));
			
			symbol_210.setIsResolveProxies(true);
			
			symbol_202.getOwnedAttributes().add(symbol_210);
		}
		{ // Pivot.ecore::pivot::Property::isComposite
			symbol_211.setName("isComposite");
			symbol_211.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_211.setIsResolveProxies(true);
			{
				Comment symbol_399 = PivotFactory.eINSTANCE.createComment();
				symbol_399.setBody("If isComposite is true, the object containing the attribute is a container for the object or value contained in the attribute.");
				symbol_211.getOwnedComments().add(symbol_399);
			}
			
			symbol_202.getOwnedAttributes().add(symbol_211);
		}
		{ // Pivot.ecore::pivot::Property::isDerived
			symbol_212.setName("isDerived");
			symbol_212.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_212.setIsResolveProxies(true);
			{
				Comment symbol_400 = PivotFactory.eINSTANCE.createComment();
				symbol_400.setBody("If isDerived is true, the value of the attribute is derived from information elsewhere.");
				symbol_212.getOwnedComments().add(symbol_400);
			}
			
			symbol_202.getOwnedAttributes().add(symbol_212);
		}
		{ // Pivot.ecore::pivot::Property::isID
			symbol_213.setName("isID");
			symbol_213.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_213.setIsResolveProxies(true);
			
			symbol_202.getOwnedAttributes().add(symbol_213);
		}
		{ // Pivot.ecore::pivot::Property::isReadOnly
			symbol_214.setName("isReadOnly");
			symbol_214.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_214.setIsResolveProxies(true);
			{
				Comment symbol_401 = PivotFactory.eINSTANCE.createComment();
				symbol_401.setBody("If isReadOnly is true, the attribute may not be written to after initialization.");
				symbol_214.getOwnedComments().add(symbol_401);
			}
			
			symbol_202.getOwnedAttributes().add(symbol_214);
		}
		{ // Pivot.ecore::pivot::Property::isResolveProxies
			symbol_215.setName("isResolveProxies");
			symbol_215.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_215.setIsResolveProxies(true);
			
			symbol_202.getOwnedAttributes().add(symbol_215);
		}
		{ // Pivot.ecore::pivot::Property::isTransient
			symbol_216.setName("isTransient");
			symbol_216.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_216.setIsResolveProxies(true);
			
			symbol_202.getOwnedAttributes().add(symbol_216);
		}
		{ // Pivot.ecore::pivot::Property::isUnsettable
			symbol_217.setName("isUnsettable");
			symbol_217.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_217.setIsResolveProxies(true);
			
			symbol_202.getOwnedAttributes().add(symbol_217);
		}
		{ // Pivot.ecore::pivot::Property::isVolatile
			symbol_218.setName("isVolatile");
			symbol_218.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_218.setIsResolveProxies(true);
			
			symbol_202.getOwnedAttributes().add(symbol_218);
		}
		{ // Pivot.ecore::pivot::Property::keys
			symbol_219.setName("keys");
			symbol_219.setType(symbol_202);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_219.setLower(BigInteger.valueOf(0));
			symbol_219.setUpper(BigInteger.valueOf(-1));
			
			symbol_219.setIsResolveProxies(true);
			
			symbol_202.getOwnedAttributes().add(symbol_219);
		}
		{ // Pivot.ecore::pivot::Property::opposite
			symbol_220.setName("opposite");
			symbol_220.setType(symbol_202);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_220.setLower(BigInteger.valueOf(0));
			
			symbol_220.setIsResolveProxies(true);
			symbol_220.setOpposite(symbol_205);
			{
				Comment symbol_402 = PivotFactory.eINSTANCE.createComment();
				symbol_402.setBody("Two attributes attr1 and attr2 of two objects o1 and o2 (which may be the same object) may be paired with each other so that o1.attr1 refers to o2 if and only if o2.attr2 refers to o1. In such a case attr1 is the opposite of attr2 and attr2 is the opposite of attr1.");
				symbol_220.getOwnedComments().add(symbol_402);
			}
			
			symbol_202.getOwnedAttributes().add(symbol_220);
		}
		{ // Pivot.ecore::pivot::Property::owningType
			symbol_221.setName("owningType");
			symbol_221.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_221.setLower(BigInteger.valueOf(0));
			
			symbol_221.setIsResolveProxies(true);
			symbol_221.setOpposite(symbol_290);
			
			symbol_202.getOwnedAttributes().add(symbol_221);
		}
		{	// Pivot.ecore::pivot::Property::isAttribute()
			Operation symbol_403 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isAttribute(http://www.eclipse.org/ocl/3.1.0/Pivot!Property)
			symbol_403.setName("isAttribute");
			symbol_403.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_404 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isAttribute(http://www.eclipse.org/ocl/3.1.0/Pivot!Property)!p
			symbol_404.setName("p");
			symbol_404.setType(symbol_202);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			
			
			symbol_403.getOwnedParameters().add(symbol_404);
			
			symbol_202.getOwnedOperations().add(symbol_403);
		}
		{
			Comment symbol_405 = PivotFactory.eINSTANCE.createComment();
			symbol_405.setBody("A property is a typed element that represents an attribute of a class.\r\nProperty specializes ParameterableElement to specify that a property can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.");
			symbol_202.getOwnedComments().add(symbol_405);
		}
		
		symbol_0.getOwnedTypes().add(symbol_202); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
		//
		// Pivot.ecore::pivot::PropertyCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
		//
		symbol_222.setName("PropertyCallExp");
		symbol_222.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		{ // Pivot.ecore::pivot::PropertyCallExp::referredProperty
			symbol_223.setName("referredProperty");
			symbol_223.setType(symbol_202);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_223.setLower(BigInteger.valueOf(0));
			
			symbol_223.setIsResolveProxies(true);
			symbol_223.setOpposite(symbol_206);
			
			symbol_222.getOwnedAttributes().add(symbol_223);
		}
		
		symbol_0.getOwnedTypes().add(symbol_222); // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
		//
		// Pivot.ecore::pivot::RealLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp
		//
		symbol_225.setName("RealLiteralExp");
		symbol_225.getSuperClasses().add(symbol_142); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		{ // Pivot.ecore::pivot::RealLiteralExp::realSymbol
			symbol_226.setName("realSymbol");
			symbol_226.setType(symbol_224);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Real
			
			symbol_226.setIsResolveProxies(true);
			
			symbol_225.getOwnedAttributes().add(symbol_226);
		}
		
		symbol_0.getOwnedTypes().add(symbol_225); // http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp
		//
		// Pivot.ecore::pivot::SelfType http://www.eclipse.org/ocl/3.1.0/Pivot!SelfType
		//
		symbol_227.setName("SelfType");
		symbol_227.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		
		symbol_0.getOwnedTypes().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/Pivot!SelfType
		//
		// Pivot.ecore::pivot::SendSignalAction http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
		//
		symbol_228.setName("SendSignalAction");
		symbol_228.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::SendSignalAction::MessageExp
			symbol_229.setName("MessageExp");
			symbol_229.setType(symbol_118);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
			symbol_229.setLower(BigInteger.valueOf(0));
			
			symbol_229.setImplicit(true);
			symbol_229.setIsResolveProxies(true);
			symbol_229.setOpposite(symbol_121);
			
			symbol_228.getOwnedAttributes().add(symbol_229);
		}
		{ // Pivot.ecore::pivot::SendSignalAction::signal
			symbol_230.setName("signal");
			symbol_230.setType(symbol_233);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
			
			symbol_230.setIsResolveProxies(true);
			symbol_230.setOpposite(symbol_235);
			
			symbol_228.getOwnedAttributes().add(symbol_230);
		}
		
		symbol_0.getOwnedTypes().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
		//
		// Pivot.ecore::pivot::SequenceType http://www.eclipse.org/ocl/3.1.0/Pivot!SequenceType
		//
		symbol_231.setName("SequenceType");
		symbol_231.getSuperClasses().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		
		symbol_0.getOwnedTypes().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/Pivot!SequenceType
		//
		// Pivot.ecore::pivot::SetType http://www.eclipse.org/ocl/3.1.0/Pivot!SetType
		//
		symbol_232.setName("SetType");
		symbol_232.getSuperClasses().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		
		symbol_0.getOwnedTypes().add(symbol_232); // http://www.eclipse.org/ocl/3.1.0/Pivot!SetType
		//
		// Pivot.ecore::pivot::Signal http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
		//
		symbol_233.setName("Signal");
		symbol_233.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::Signal::MessageType
			symbol_234.setName("MessageType");
			symbol_234.setType(symbol_123);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
			symbol_234.setLower(BigInteger.valueOf(0));
			symbol_234.setUpper(BigInteger.valueOf(-1));
			
			symbol_234.setImplicit(true);
			symbol_234.setIsResolveProxies(true);
			symbol_234.setOpposite(symbol_125);
			
			symbol_233.getOwnedAttributes().add(symbol_234);
		}
		{ // Pivot.ecore::pivot::Signal::SendSignalAction
			symbol_235.setName("SendSignalAction");
			symbol_235.setType(symbol_228);  // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
			symbol_235.setLower(BigInteger.valueOf(0));
			symbol_235.setUpper(BigInteger.valueOf(-1));
			
			symbol_235.setImplicit(true);
			symbol_235.setIsResolveProxies(true);
			symbol_235.setOpposite(symbol_230);
			
			symbol_233.getOwnedAttributes().add(symbol_235);
		}
		
		symbol_0.getOwnedTypes().add(symbol_233); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
		//
		// Pivot.ecore::pivot::State http://www.eclipse.org/ocl/3.1.0/Pivot!State
		//
		symbol_236.setName("State");
		symbol_236.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::State::StateExp
			symbol_237.setName("StateExp");
			symbol_237.setType(symbol_238);  // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
			symbol_237.setLower(BigInteger.valueOf(0));
			symbol_237.setUpper(BigInteger.valueOf(-1));
			
			symbol_237.setImplicit(true);
			symbol_237.setIsResolveProxies(true);
			symbol_237.setOpposite(symbol_239);
			
			symbol_236.getOwnedAttributes().add(symbol_237);
		}
		
		symbol_0.getOwnedTypes().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/Pivot!State
		//
		// Pivot.ecore::pivot::StateExp http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
		//
		symbol_238.setName("StateExp");
		symbol_238.getSuperClasses().add(symbol_144); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::StateExp::referredState
			symbol_239.setName("referredState");
			symbol_239.setType(symbol_236);  // http://www.eclipse.org/ocl/3.1.0/Pivot!State
			symbol_239.setLower(BigInteger.valueOf(0));
			
			symbol_239.setIsResolveProxies(true);
			symbol_239.setOpposite(symbol_237);
			
			symbol_238.getOwnedAttributes().add(symbol_239);
		}
		
		symbol_0.getOwnedTypes().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
		//
		// Pivot.ecore::pivot::StringLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp
		//
		symbol_241.setName("StringLiteralExp");
		symbol_241.getSuperClasses().add(symbol_200); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		{ // Pivot.ecore::pivot::StringLiteralExp::stringSymbol
			symbol_242.setName("stringSymbol");
			symbol_242.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			
			symbol_242.setIsResolveProxies(true);
			
			symbol_241.getOwnedAttributes().add(symbol_242);
		}
		
		symbol_0.getOwnedTypes().add(symbol_241); // http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp
		//
		// Pivot.ecore::pivot::TemplateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
		//
		symbol_243.setName("TemplateBinding");
		symbol_243.getSuperClasses().add(symbol_63); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::TemplateBinding::boundElement
			symbol_244.setName("boundElement");
			symbol_244.setType(symbol_267);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
			
			symbol_244.setIsResolveProxies(true);
			symbol_244.setOpposite(symbol_269);
			{
				Comment symbol_406 = PivotFactory.eINSTANCE.createComment();
				symbol_406.setBody("The element that is bound by this binding.");
				symbol_244.getOwnedComments().add(symbol_406);
			}
			
			symbol_243.getOwnedAttributes().add(symbol_244);
		}
		{ // Pivot.ecore::pivot::TemplateBinding::parameterSubstitution
			symbol_245.setName("parameterSubstitution");
			symbol_245.setType(symbol_255);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
			symbol_245.setLower(BigInteger.valueOf(0));
			symbol_245.setUpper(BigInteger.valueOf(-1));
			
			symbol_245.setIsComposite(true);
			symbol_245.setIsResolveProxies(true);
			symbol_245.setOpposite(symbol_259);
			{
				Comment symbol_407 = PivotFactory.eINSTANCE.createComment();
				symbol_407.setBody("The parameter substitutions owned by this template binding.");
				symbol_245.getOwnedComments().add(symbol_407);
			}
			
			symbol_243.getOwnedAttributes().add(symbol_245);
		}
		{ // Pivot.ecore::pivot::TemplateBinding::signature
			symbol_246.setName("signature");
			symbol_246.setType(symbol_262);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			
			symbol_246.setIsResolveProxies(true);
			symbol_246.setOpposite(symbol_263);
			{
				Comment symbol_408 = PivotFactory.eINSTANCE.createComment();
				symbol_408.setBody("The template signature for the template that is the target of the binding.");
				symbol_246.getOwnedComments().add(symbol_408);
			}
			
			symbol_243.getOwnedAttributes().add(symbol_246);
		}
		{
			Comment symbol_409 = PivotFactory.eINSTANCE.createComment();
			symbol_409.setBody("A template binding represents a relationship between a templateable element and a template. A template binding specifies the substitutions of actual parameters for the formal parameters of the template.");
			symbol_243.getOwnedComments().add(symbol_409);
		}
		
		symbol_0.getOwnedTypes().add(symbol_243); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
		//
		// Pivot.ecore::pivot::TemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		//
		symbol_247.setName("TemplateParameter");
		symbol_247.getSuperClasses().add(symbol_63); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::TemplateParameter::TemplateParameterSubstitution
			symbol_248.setName("TemplateParameterSubstitution");
			symbol_248.setType(symbol_255);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
			symbol_248.setLower(BigInteger.valueOf(0));
			symbol_248.setUpper(BigInteger.valueOf(-1));
			
			symbol_248.setImplicit(true);
			symbol_248.setIsResolveProxies(true);
			symbol_248.setOpposite(symbol_257);
			
			symbol_247.getOwnedAttributes().add(symbol_248);
		}
		{ // Pivot.ecore::pivot::TemplateParameter::TemplateSignature
			symbol_249.setName("TemplateSignature");
			symbol_249.setType(symbol_262);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			symbol_249.setLower(BigInteger.valueOf(0));
			symbol_249.setUpper(BigInteger.valueOf(-1));
			
			symbol_249.setImplicit(true);
			symbol_249.setIsResolveProxies(true);
			symbol_249.setOpposite(symbol_265);
			
			symbol_247.getOwnedAttributes().add(symbol_249);
		}
		{ // Pivot.ecore::pivot::TemplateParameter::default
			symbol_250.setName("default");
			symbol_250.setType(symbol_189);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_250.setLower(BigInteger.valueOf(0));
			
			symbol_250.setIsResolveProxies(true);
			{
				Comment symbol_410 = PivotFactory.eINSTANCE.createComment();
				symbol_410.setBody("The element that is the default for this formal template parameter.");
				symbol_250.getOwnedComments().add(symbol_410);
			}
			
			symbol_247.getOwnedAttributes().add(symbol_250);
		}
		{ // Pivot.ecore::pivot::TemplateParameter::ownedDefault
			symbol_251.setName("ownedDefault");
			symbol_251.setType(symbol_189);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_251.setLower(BigInteger.valueOf(0));
			
			symbol_251.setIsComposite(true);
			symbol_251.setIsResolveProxies(true);
			symbol_251.setOpposite(symbol_190);
			{
				Comment symbol_411 = PivotFactory.eINSTANCE.createComment();
				symbol_411.setBody("The element that is owned by this template parameter for the purpose of providing a default.");
				symbol_251.getOwnedComments().add(symbol_411);
			}
			
			symbol_247.getOwnedAttributes().add(symbol_251);
		}
		{ // Pivot.ecore::pivot::TemplateParameter::ownedParameteredElement
			symbol_252.setName("ownedParameteredElement");
			symbol_252.setType(symbol_189);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_252.setLower(BigInteger.valueOf(0));
			
			symbol_252.setIsComposite(true);
			symbol_252.setIsResolveProxies(true);
			symbol_252.setOpposite(symbol_192);
			{
				Comment symbol_412 = PivotFactory.eINSTANCE.createComment();
				symbol_412.setBody("The element that is owned by this template parameter.");
				symbol_252.getOwnedComments().add(symbol_412);
			}
			
			symbol_247.getOwnedAttributes().add(symbol_252);
		}
		{ // Pivot.ecore::pivot::TemplateParameter::parameteredElement
			symbol_253.setName("parameteredElement");
			symbol_253.setType(symbol_189);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			
			symbol_253.setIsResolveProxies(true);
			symbol_253.setOpposite(symbol_193);
			{
				Comment symbol_413 = PivotFactory.eINSTANCE.createComment();
				symbol_413.setBody("The element exposed by this template parameter.");
				symbol_253.getOwnedComments().add(symbol_413);
			}
			
			symbol_247.getOwnedAttributes().add(symbol_253);
		}
		{ // Pivot.ecore::pivot::TemplateParameter::signature
			symbol_254.setName("signature");
			symbol_254.setType(symbol_262);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			
			symbol_254.setIsResolveProxies(true);
			symbol_254.setOpposite(symbol_264);
			{
				Comment symbol_414 = PivotFactory.eINSTANCE.createComment();
				symbol_414.setBody("The template signature that owns this template parameter.");
				symbol_254.getOwnedComments().add(symbol_414);
			}
			
			symbol_247.getOwnedAttributes().add(symbol_254);
		}
		{
			Comment symbol_415 = PivotFactory.eINSTANCE.createComment();
			symbol_415.setBody("A template parameter exposes a parameterable element as a formal template parameter of a template.");
			symbol_247.getOwnedComments().add(symbol_415);
		}
		
		symbol_0.getOwnedTypes().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		//
		// Pivot.ecore::pivot::TemplateParameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
		//
		symbol_255.setName("TemplateParameterSubstitution");
		symbol_255.getSuperClasses().add(symbol_63); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::TemplateParameterSubstitution::actual
			symbol_256.setName("actual");
			symbol_256.setType(symbol_189);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			
			symbol_256.setIsResolveProxies(true);
			{
				Comment symbol_416 = PivotFactory.eINSTANCE.createComment();
				symbol_416.setBody("The element that is the actual parameter for this substitution.");
				symbol_256.getOwnedComments().add(symbol_416);
			}
			
			symbol_255.getOwnedAttributes().add(symbol_256);
		}
		{ // Pivot.ecore::pivot::TemplateParameterSubstitution::formal
			symbol_257.setName("formal");
			symbol_257.setType(symbol_247);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			
			symbol_257.setIsResolveProxies(true);
			symbol_257.setOpposite(symbol_248);
			{
				Comment symbol_417 = PivotFactory.eINSTANCE.createComment();
				symbol_417.setBody("The formal template parameter that is associated with this substitution.");
				symbol_257.getOwnedComments().add(symbol_417);
			}
			
			symbol_255.getOwnedAttributes().add(symbol_257);
		}
		{ // Pivot.ecore::pivot::TemplateParameterSubstitution::ownedActual
			symbol_258.setName("ownedActual");
			symbol_258.setType(symbol_189);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_258.setLower(BigInteger.valueOf(0));
			
			symbol_258.setIsComposite(true);
			symbol_258.setIsResolveProxies(true);
			symbol_258.setOpposite(symbol_191);
			{
				Comment symbol_418 = PivotFactory.eINSTANCE.createComment();
				symbol_418.setBody("The actual parameter that is owned by this substitution.");
				symbol_258.getOwnedComments().add(symbol_418);
			}
			
			symbol_255.getOwnedAttributes().add(symbol_258);
		}
		{ // Pivot.ecore::pivot::TemplateParameterSubstitution::templateBinding
			symbol_259.setName("templateBinding");
			symbol_259.setType(symbol_243);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
			
			symbol_259.setIsResolveProxies(true);
			symbol_259.setOpposite(symbol_245);
			{
				Comment symbol_419 = PivotFactory.eINSTANCE.createComment();
				symbol_419.setBody("The optional bindings from this element to templates.");
				symbol_259.getOwnedComments().add(symbol_419);
			}
			
			symbol_255.getOwnedAttributes().add(symbol_259);
		}
		{
			Comment symbol_420 = PivotFactory.eINSTANCE.createComment();
			symbol_420.setBody("A template parameter substitution relates the actual parameter to a formal template parameter as part of a template binding.");
			symbol_255.getOwnedComments().add(symbol_420);
		}
		
		symbol_0.getOwnedTypes().add(symbol_255); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
		//
		// Pivot.ecore::pivot::TemplateParameterType http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType
		//
		symbol_260.setName("TemplateParameterType");
		symbol_260.getSuperClasses().add(symbol_278); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		{ // Pivot.ecore::pivot::TemplateParameterType::specification
			symbol_261.setName("specification");
			symbol_261.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_261.setLower(BigInteger.valueOf(0));
			
			symbol_261.setIsResolveProxies(true);
			
			symbol_260.getOwnedAttributes().add(symbol_261);
		}
		
		symbol_0.getOwnedTypes().add(symbol_260); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType
		//
		// Pivot.ecore::pivot::TemplateSignature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
		//
		symbol_262.setName("TemplateSignature");
		symbol_262.getSuperClasses().add(symbol_63); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::TemplateSignature::TemplateBinding
			symbol_263.setName("TemplateBinding");
			symbol_263.setType(symbol_243);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
			symbol_263.setLower(BigInteger.valueOf(0));
			symbol_263.setUpper(BigInteger.valueOf(-1));
			
			symbol_263.setImplicit(true);
			symbol_263.setIsResolveProxies(true);
			symbol_263.setOpposite(symbol_246);
			
			symbol_262.getOwnedAttributes().add(symbol_263);
		}
		{ // Pivot.ecore::pivot::TemplateSignature::ownedParameter
			symbol_264.setName("ownedParameter");
			symbol_264.setType(symbol_247);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_264.setLower(BigInteger.valueOf(0));
			symbol_264.setUpper(BigInteger.valueOf(-1));
			symbol_264.setIsOrdered(true);
			
			symbol_264.setIsComposite(true);
			symbol_264.setIsResolveProxies(true);
			symbol_264.setOpposite(symbol_254);
			{
				Comment symbol_421 = PivotFactory.eINSTANCE.createComment();
				symbol_421.setBody("The formal template parameters that are owned by this template signature.");
				symbol_264.getOwnedComments().add(symbol_421);
			}
			
			symbol_262.getOwnedAttributes().add(symbol_264);
		}
		{ // Pivot.ecore::pivot::TemplateSignature::parameter
			symbol_265.setName("parameter");
			symbol_265.setType(symbol_247);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_265.setUpper(BigInteger.valueOf(-1));
			symbol_265.setIsOrdered(true);
			
			symbol_265.setIsResolveProxies(true);
			symbol_265.setOpposite(symbol_249);
			{
				Comment symbol_422 = PivotFactory.eINSTANCE.createComment();
				symbol_422.setBody("The ordered set of all formal template parameters for this template signature.");
				symbol_265.getOwnedComments().add(symbol_422);
			}
			
			symbol_262.getOwnedAttributes().add(symbol_265);
		}
		{ // Pivot.ecore::pivot::TemplateSignature::template
			symbol_266.setName("template");
			symbol_266.setType(symbol_267);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
			
			symbol_266.setIsResolveProxies(true);
			symbol_266.setOpposite(symbol_268);
			{
				Comment symbol_423 = PivotFactory.eINSTANCE.createComment();
				symbol_423.setBody("The element that owns this template signature.");
				symbol_266.getOwnedComments().add(symbol_423);
			}
			
			symbol_262.getOwnedAttributes().add(symbol_266);
		}
		{
			Comment symbol_424 = PivotFactory.eINSTANCE.createComment();
			symbol_424.setBody("A template signature bundles the set of formal template parameters for a templated element.");
			symbol_262.getOwnedComments().add(symbol_424);
		}
		
		symbol_0.getOwnedTypes().add(symbol_262); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
		//
		// Pivot.ecore::pivot::TemplateableElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		//
		symbol_267.setName("TemplateableElement");
		symbol_267.getSuperClasses().add(symbol_63); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::TemplateableElement::ownedTemplateSignature
			symbol_268.setName("ownedTemplateSignature");
			symbol_268.setType(symbol_262);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			symbol_268.setLower(BigInteger.valueOf(0));
			
			symbol_268.setIsComposite(true);
			symbol_268.setIsResolveProxies(true);
			symbol_268.setOpposite(symbol_266);
			{
				Comment symbol_425 = PivotFactory.eINSTANCE.createComment();
				symbol_425.setBody("The optional template signature specifying the formal template parameters.");
				symbol_268.getOwnedComments().add(symbol_425);
			}
			
			symbol_267.getOwnedAttributes().add(symbol_268);
		}
		{ // Pivot.ecore::pivot::TemplateableElement::templateBinding
			symbol_269.setName("templateBinding");
			symbol_269.setType(symbol_243);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
			symbol_269.setLower(BigInteger.valueOf(0));
			symbol_269.setUpper(BigInteger.valueOf(-1));
			
			symbol_269.setIsComposite(true);
			symbol_269.setIsResolveProxies(true);
			symbol_269.setOpposite(symbol_244);
			{
				Comment symbol_426 = PivotFactory.eINSTANCE.createComment();
				symbol_426.setBody("The optional bindings from this element to templates.");
				symbol_269.getOwnedComments().add(symbol_426);
			}
			
			symbol_267.getOwnedAttributes().add(symbol_269);
		}
		{ // Pivot.ecore::pivot::TemplateableElement::unspecializedElement
			symbol_270.setName("unspecializedElement");
			symbol_270.setType(symbol_267);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
			symbol_270.setLower(BigInteger.valueOf(0));
			
			symbol_270.setIsTransient(true);
			
			symbol_267.getOwnedAttributes().add(symbol_270);
		}
		{	// Pivot.ecore::pivot::TemplateableElement::isTemplate()
			Operation symbol_427 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!isTemplate()
			symbol_427.setName("isTemplate");
			symbol_427.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			{
				Comment symbol_428 = PivotFactory.eINSTANCE.createComment();
				symbol_428.setBody("The query isTemplate() returns whether this templateable element is actually a template.");
				symbol_427.getOwnedComments().add(symbol_428);
			}
			
			symbol_267.getOwnedOperations().add(symbol_427);
		}
		{	// Pivot.ecore::pivot::TemplateableElement::parameterableElements()
			Operation symbol_429 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!parameterableElements()
			symbol_429.setName("parameterableElements");
			symbol_429.setType(symbol_189);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_429.setLower(BigInteger.valueOf(0));
			symbol_429.setUpper(BigInteger.valueOf(-1));
			
			{
				Comment symbol_430 = PivotFactory.eINSTANCE.createComment();
				symbol_430.setBody("The query parameterableElements() returns the set of elements that may be used as the parametered elements for a template parameter of this templateable element. By default, this set includes all the owned elements. Subclasses may override this operation if they choose to restrict the set of parameterable elements.");
				symbol_429.getOwnedComments().add(symbol_430);
			}
			
			symbol_267.getOwnedOperations().add(symbol_429);
		}
		{
			Comment symbol_431 = PivotFactory.eINSTANCE.createComment();
			symbol_431.setBody("A templateable element is an element that can optionally be defined as a template and bound to other templates.");
			symbol_267.getOwnedComments().add(symbol_431);
		}
		
		symbol_0.getOwnedTypes().add(symbol_267); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		//
		// Pivot.ecore::pivot::Throwable http://www.eclipse.org/ocl/3.1.0/Pivot!Throwable
		//
		symbol_271.setName("Throwable");
		symbol_271.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_271); // http://www.eclipse.org/ocl/3.1.0/Pivot!Throwable
		//
		// Pivot.ecore::pivot::TupleLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
		//
		symbol_272.setName("TupleLiteralExp");
		symbol_272.getSuperClasses().add(symbol_113); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		{ // Pivot.ecore::pivot::TupleLiteralExp::part
			symbol_273.setName("part");
			symbol_273.setType(symbol_274);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
			symbol_273.setLower(BigInteger.valueOf(0));
			symbol_273.setUpper(BigInteger.valueOf(-1));
			symbol_273.setIsOrdered(true);
			
			symbol_273.setIsComposite(true);
			symbol_273.setIsResolveProxies(true);
			symbol_273.setOpposite(symbol_275);
			
			symbol_272.getOwnedAttributes().add(symbol_273);
		}
		
		symbol_0.getOwnedTypes().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
		//
		// Pivot.ecore::pivot::TupleLiteralPart http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
		//
		symbol_274.setName("TupleLiteralPart");
		symbol_274.getSuperClasses().add(symbol_319); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		{ // Pivot.ecore::pivot::TupleLiteralPart::TupleLiteralExp
			symbol_275.setName("TupleLiteralExp");
			symbol_275.setType(symbol_272);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
			symbol_275.setLower(BigInteger.valueOf(0));
			
			symbol_275.setImplicit(true);
			symbol_275.setIsResolveProxies(true);
			symbol_275.setOpposite(symbol_273);
			
			symbol_274.getOwnedAttributes().add(symbol_275);
		}
		{ // Pivot.ecore::pivot::TupleLiteralPart::initExpression
			symbol_276.setName("initExpression");
			symbol_276.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_276.setLower(BigInteger.valueOf(0));
			
			symbol_276.setIsComposite(true);
			symbol_276.setIsResolveProxies(true);
			symbol_276.setOpposite(symbol_156);
			
			symbol_274.getOwnedAttributes().add(symbol_276);
		}
		
		symbol_0.getOwnedTypes().add(symbol_274); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
		//
		// Pivot.ecore::pivot::TupleType http://www.eclipse.org/ocl/3.1.0/Pivot!TupleType
		//
		symbol_277.setName("TupleType");
		symbol_277.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		
		symbol_0.getOwnedTypes().add(symbol_277); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleType
		//
		// Pivot.ecore::pivot::Type http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		//
		symbol_278.setName("Type");
		symbol_278.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		symbol_278.getSuperClasses().add(symbol_267); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		symbol_278.getSuperClasses().add(symbol_189); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // Pivot.ecore::pivot::Type::ClassifierType
			symbol_279.setName("ClassifierType");
			symbol_279.setType(symbol_26);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
			symbol_279.setLower(BigInteger.valueOf(0));
			symbol_279.setUpper(BigInteger.valueOf(-1));
			
			symbol_279.setImplicit(true);
			symbol_279.setIsResolveProxies(true);
			symbol_279.setOpposite(symbol_27);
			
			symbol_278.getOwnedAttributes().add(symbol_279);
		}
		{ // Pivot.ecore::pivot::Type::CollectionType
			symbol_280.setName("CollectionType");
			symbol_280.setType(symbol_39);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
			symbol_280.setLower(BigInteger.valueOf(0));
			symbol_280.setUpper(BigInteger.valueOf(-1));
			
			symbol_280.setImplicit(true);
			symbol_280.setIsResolveProxies(true);
			symbol_280.setOpposite(symbol_40);
			
			symbol_278.getOwnedAttributes().add(symbol_280);
		}
		{ // Pivot.ecore::pivot::Type::DataType
			symbol_281.setName("DataType");
			symbol_281.setType(symbol_57);  // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
			symbol_281.setLower(BigInteger.valueOf(0));
			symbol_281.setUpper(BigInteger.valueOf(-1));
			
			symbol_281.setImplicit(true);
			symbol_281.setIsResolveProxies(true);
			symbol_281.setOpposite(symbol_58);
			
			symbol_278.getOwnedAttributes().add(symbol_281);
		}
		{ // Pivot.ecore::pivot::Type::LambdaType
			symbol_282.setName("LambdaType");
			symbol_282.setType(symbol_104);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
			symbol_282.setLower(BigInteger.valueOf(0));
			symbol_282.setUpper(BigInteger.valueOf(-1));
			
			symbol_282.setImplicit(true);
			symbol_282.setIsResolveProxies(true);
			
			symbol_278.getOwnedAttributes().add(symbol_282);
		}
		{ // Pivot.ecore::pivot::Type::Operation
			symbol_283.setName("Operation");
			symbol_283.setType(symbol_163);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_283.setLower(BigInteger.valueOf(0));
			symbol_283.setUpper(BigInteger.valueOf(-1));
			
			symbol_283.setImplicit(true);
			symbol_283.setIsResolveProxies(true);
			symbol_283.setOpposite(symbol_171);
			
			symbol_278.getOwnedAttributes().add(symbol_283);
		}
		{ // Pivot.ecore::pivot::Type::Type
			symbol_284.setName("Type");
			symbol_284.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_284.setLower(BigInteger.valueOf(0));
			symbol_284.setUpper(BigInteger.valueOf(-1));
			
			symbol_284.setImplicit(true);
			symbol_284.setIsResolveProxies(true);
			symbol_284.setOpposite(symbol_293);
			
			symbol_278.getOwnedAttributes().add(symbol_284);
		}
		{ // Pivot.ecore::pivot::Type::TypeExp
			symbol_285.setName("TypeExp");
			symbol_285.setType(symbol_294);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
			symbol_285.setLower(BigInteger.valueOf(0));
			symbol_285.setUpper(BigInteger.valueOf(-1));
			
			symbol_285.setImplicit(true);
			symbol_285.setIsResolveProxies(true);
			symbol_285.setOpposite(symbol_295);
			
			symbol_278.getOwnedAttributes().add(symbol_285);
		}
		{ // Pivot.ecore::pivot::Type::TypeTemplateParameter
			symbol_286.setName("TypeTemplateParameter");
			symbol_286.setType(symbol_296);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
			symbol_286.setLower(BigInteger.valueOf(0));
			symbol_286.setUpper(BigInteger.valueOf(-1));
			
			symbol_286.setImplicit(true);
			symbol_286.setIsResolveProxies(true);
			symbol_286.setOpposite(symbol_298);
			
			symbol_278.getOwnedAttributes().add(symbol_286);
		}
		{ // Pivot.ecore::pivot::Type::TypedElement
			symbol_287.setName("TypedElement");
			symbol_287.setType(symbol_299);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
			symbol_287.setLower(BigInteger.valueOf(0));
			symbol_287.setUpper(BigInteger.valueOf(-1));
			
			symbol_287.setImplicit(true);
			symbol_287.setIsResolveProxies(true);
			symbol_287.setOpposite(symbol_300);
			
			symbol_278.getOwnedAttributes().add(symbol_287);
		}
		{ // Pivot.ecore::pivot::Type::UnspecifiedType
			symbol_288.setName("UnspecifiedType");
			symbol_288.setType(symbol_305);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
			symbol_288.setLower(BigInteger.valueOf(0));
			symbol_288.setUpper(BigInteger.valueOf(-1));
			
			symbol_288.setImplicit(true);
			symbol_288.setIsResolveProxies(true);
			
			symbol_278.getOwnedAttributes().add(symbol_288);
		}
		{ // Pivot.ecore::pivot::Type::instanceClassName
			symbol_289.setName("instanceClassName");
			symbol_289.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_289.setLower(BigInteger.valueOf(0));
			
			symbol_289.setIsResolveProxies(true);
			
			symbol_278.getOwnedAttributes().add(symbol_289);
		}
		{ // Pivot.ecore::pivot::Type::ownedAttribute
			symbol_290.setName("ownedAttribute");
			symbol_290.setType(symbol_202);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_290.setLower(BigInteger.valueOf(0));
			symbol_290.setUpper(BigInteger.valueOf(-1));
			symbol_290.setIsOrdered(true);
			
			symbol_290.setIsComposite(true);
			symbol_290.setIsResolveProxies(true);
			symbol_290.setOpposite(symbol_221);
			
			symbol_278.getOwnedAttributes().add(symbol_290);
		}
		{ // Pivot.ecore::pivot::Type::ownedOperation
			symbol_291.setName("ownedOperation");
			symbol_291.setType(symbol_163);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_291.setLower(BigInteger.valueOf(0));
			symbol_291.setUpper(BigInteger.valueOf(-1));
			symbol_291.setIsOrdered(true);
			
			symbol_291.setIsComposite(true);
			symbol_291.setIsResolveProxies(true);
			symbol_291.setOpposite(symbol_169);
			
			symbol_278.getOwnedAttributes().add(symbol_291);
		}
		{ // Pivot.ecore::pivot::Type::package
			symbol_292.setName("package");
			symbol_292.setType(symbol_177);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_292.setLower(BigInteger.valueOf(0));
			
			symbol_292.setIsResolveProxies(true);
			symbol_292.setOpposite(symbol_183);
			{
				Comment symbol_432 = PivotFactory.eINSTANCE.createComment();
				symbol_432.setBody("Specifies the owning package of this classifier, if any.");
				symbol_292.getOwnedComments().add(symbol_432);
			}
			
			symbol_278.getOwnedAttributes().add(symbol_292);
		}
		{ // Pivot.ecore::pivot::Type::superClass
			symbol_293.setName("superClass");
			symbol_293.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_293.setLower(BigInteger.valueOf(0));
			symbol_293.setUpper(BigInteger.valueOf(-1));
			symbol_293.setIsOrdered(true);
			
			symbol_293.setIsResolveProxies(true);
			symbol_293.setOpposite(symbol_284);
			
			symbol_278.getOwnedAttributes().add(symbol_293);
		}
		{
			Comment symbol_433 = PivotFactory.eINSTANCE.createComment();
			symbol_433.setBody("A type is a named element that is used as the type for a typed element. A type can be contained in a package.\r\nType is defined to be a kind of templateable element so that a type can be parameterized. It is also defined to be a kind of parameterable element so that a type can be a formal template parameter.");
			symbol_278.getOwnedComments().add(symbol_433);
		}
		
		symbol_0.getOwnedTypes().add(symbol_278); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		//
		// Pivot.ecore::pivot::TypeExp http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
		//
		symbol_294.setName("TypeExp");
		symbol_294.getSuperClasses().add(symbol_144); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::TypeExp::referredType
			symbol_295.setName("referredType");
			symbol_295.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_295.setLower(BigInteger.valueOf(0));
			
			symbol_295.setIsResolveProxies(true);
			symbol_295.setOpposite(symbol_285);
			
			symbol_294.getOwnedAttributes().add(symbol_295);
		}
		
		symbol_0.getOwnedTypes().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
		//
		// Pivot.ecore::pivot::TypeTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
		//
		symbol_296.setName("TypeTemplateParameter");
		symbol_296.getSuperClasses().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		{ // Pivot.ecore::pivot::TypeTemplateParameter::allowSubstitutable
			symbol_297.setName("allowSubstitutable");
			symbol_297.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_297.setIsResolveProxies(true);
			{
				Comment symbol_434 = PivotFactory.eINSTANCE.createComment();
				symbol_434.setBody("Constrains the required relationship between an actual parameter and the parameteredElement for this formal parameter.");
				symbol_297.getOwnedComments().add(symbol_434);
			}
			
			symbol_296.getOwnedAttributes().add(symbol_297);
		}
		{ // Pivot.ecore::pivot::TypeTemplateParameter::constrainingType
			symbol_298.setName("constrainingType");
			symbol_298.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_298.setLower(BigInteger.valueOf(0));
			symbol_298.setUpper(BigInteger.valueOf(-1));
			
			symbol_298.setIsResolveProxies(true);
			symbol_298.setOpposite(symbol_286);
			{
				Comment symbol_435 = PivotFactory.eINSTANCE.createComment();
				symbol_435.setBody("The classifiers that constrain the argument that can be used for the parameter. If the allowSubstitutable attribute is true, then any classifier that is compatible with this constraining classifier can be substituted; otherwise, it must be either this classifier or one of its subclasses. If this property is empty, there are no constraints on the classifier that can be used as an argument.");
				symbol_298.getOwnedComments().add(symbol_435);
			}
			
			symbol_296.getOwnedAttributes().add(symbol_298);
		}
		{
			Comment symbol_436 = PivotFactory.eINSTANCE.createComment();
			symbol_436.setBody("A type template parameter exposes a type as a formal template parameter.");
			symbol_296.getOwnedComments().add(symbol_436);
		}
		
		symbol_0.getOwnedTypes().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
		//
		// Pivot.ecore::pivot::TypedElement http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		//
		symbol_299.setName("TypedElement");
		symbol_299.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::TypedElement::type
			symbol_300.setName("type");
			symbol_300.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_300.setLower(BigInteger.valueOf(0));
			
			symbol_300.setIsResolveProxies(true);
			symbol_300.setOpposite(symbol_287);
			{
				Comment symbol_437 = PivotFactory.eINSTANCE.createComment();
				symbol_437.setBody("The type of the TypedElement.");
				symbol_300.getOwnedComments().add(symbol_437);
			}
			
			symbol_299.getOwnedAttributes().add(symbol_300);
		}
		{
			Comment symbol_438 = PivotFactory.eINSTANCE.createComment();
			symbol_438.setBody("A typed element is a kind of named element that represents an element with a type.");
			symbol_299.getOwnedComments().add(symbol_438);
		}
		
		symbol_0.getOwnedTypes().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		//
		// Pivot.ecore::pivot::TypedMultiplicityElement http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		//
		symbol_301.setName("TypedMultiplicityElement");
		symbol_301.getSuperClasses().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		symbol_301.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		{	// Pivot.ecore::pivot::TypedMultiplicityElement::CompatibleBody()
			Operation symbol_439 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement!CompatibleBody(http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification)
			symbol_439.setName("CompatibleBody");
			symbol_439.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_440 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement!CompatibleBody(http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification)!bodySpecification
			symbol_440.setName("bodySpecification");
			symbol_440.setType(symbol_309);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
			
			
			symbol_439.getOwnedParameters().add(symbol_440);
			
			symbol_301.getOwnedOperations().add(symbol_439);
		}
		{	// Pivot.ecore::pivot::TypedMultiplicityElement::makeParameter()
			Operation symbol_441 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement!makeParameter()
			symbol_441.setName("makeParameter");
			symbol_441.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			
			
			symbol_301.getOwnedOperations().add(symbol_441);
		}
		
		symbol_0.getOwnedTypes().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		//
		// Pivot.ecore::pivot::UnlimitedNaturalLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp
		//
		symbol_303.setName("UnlimitedNaturalLiteralExp");
		symbol_303.getSuperClasses().add(symbol_142); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		{ // Pivot.ecore::pivot::UnlimitedNaturalLiteralExp::unlimitedNaturalSymbol
			symbol_304.setName("unlimitedNaturalSymbol");
			symbol_304.setType(symbol_302);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			
			symbol_304.setIsResolveProxies(true);
			
			symbol_303.getOwnedAttributes().add(symbol_304);
		}
		
		symbol_0.getOwnedTypes().add(symbol_303); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp
		//
		// Pivot.ecore::pivot::UnspecifiedType http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
		//
		symbol_305.setName("UnspecifiedType");
		symbol_305.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		{ // Pivot.ecore::pivot::UnspecifiedType::lowerBound
			symbol_306.setName("lowerBound");
			symbol_306.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_306.setIsResolveProxies(true);
			
			symbol_305.getOwnedAttributes().add(symbol_306);
		}
		{ // Pivot.ecore::pivot::UnspecifiedType::upperBound
			symbol_307.setName("upperBound");
			symbol_307.setType(symbol_278);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_307.setIsResolveProxies(true);
			symbol_307.setOpposite(symbol_288);
			
			symbol_305.getOwnedAttributes().add(symbol_307);
		}
		
		symbol_0.getOwnedTypes().add(symbol_305); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
		//
		// Pivot.ecore::pivot::UnspecifiedValueExp http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedValueExp
		//
		symbol_308.setName("UnspecifiedValueExp");
		symbol_308.getSuperClasses().add(symbol_144); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		
		symbol_0.getOwnedTypes().add(symbol_308); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedValueExp
		//
		// Pivot.ecore::pivot::ValueSpecification http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		//
		symbol_309.setName("ValueSpecification");
		symbol_309.getSuperClasses().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		symbol_309.getSuperClasses().add(symbol_189); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // Pivot.ecore::pivot::ValueSpecification::Constraint
			symbol_310.setName("Constraint");
			symbol_310.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_310.setLower(BigInteger.valueOf(0));
			
			symbol_310.setImplicit(true);
			symbol_310.setIsResolveProxies(true);
			symbol_310.setOpposite(symbol_49);
			
			symbol_309.getOwnedAttributes().add(symbol_310);
		}
		{	// Pivot.ecore::pivot::ValueSpecification::booleanValue()
			Operation symbol_442 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!booleanValue()
			symbol_442.setName("booleanValue");
			symbol_442.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			{
				Comment symbol_443 = PivotFactory.eINSTANCE.createComment();
				symbol_443.setBody("The query booleanValue() gives a single Boolean value when one can be computed.");
				symbol_442.getOwnedComments().add(symbol_443);
			}
			
			symbol_309.getOwnedOperations().add(symbol_442);
		}
		{	// Pivot.ecore::pivot::ValueSpecification::integerValue()
			Operation symbol_444 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!integerValue()
			symbol_444.setName("integerValue");
			symbol_444.setType(symbol_92);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			{
				Comment symbol_445 = PivotFactory.eINSTANCE.createComment();
				symbol_445.setBody("The query integerValue() gives a single Integer value when one can be computed.");
				symbol_444.getOwnedComments().add(symbol_445);
			}
			
			symbol_309.getOwnedOperations().add(symbol_444);
		}
		{	// Pivot.ecore::pivot::ValueSpecification::isComputable()
			Operation symbol_446 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!isComputable()
			symbol_446.setName("isComputable");
			symbol_446.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			{
				Comment symbol_447 = PivotFactory.eINSTANCE.createComment();
				symbol_447.setBody("The query isComputable() determines whether a value specification can be computed in a model. This operation cannot be fully defined in OCL. A conforming implementation is expected to deliver true for this operation for all value specifications that it can compute, and to compute all of those for which the operation is true. A conforming implementation is expected to be able to compute the value of all literals.");
				symbol_446.getOwnedComments().add(symbol_447);
			}
			
			symbol_309.getOwnedOperations().add(symbol_446);
		}
		{	// Pivot.ecore::pivot::ValueSpecification::isNull()
			Operation symbol_448 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!isNull()
			symbol_448.setName("isNull");
			symbol_448.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			{
				Comment symbol_449 = PivotFactory.eINSTANCE.createComment();
				symbol_449.setBody("The query isNull() returns true when it can be computed that the value is null.");
				symbol_448.getOwnedComments().add(symbol_449);
			}
			
			symbol_309.getOwnedOperations().add(symbol_448);
		}
		{	// Pivot.ecore::pivot::ValueSpecification::stringValue()
			Operation symbol_450 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!stringValue()
			symbol_450.setName("stringValue");
			symbol_450.setType(symbol_240);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			
			{
				Comment symbol_451 = PivotFactory.eINSTANCE.createComment();
				symbol_451.setBody("The query stringValue() gives a single String value when one can be computed.");
				symbol_450.getOwnedComments().add(symbol_451);
			}
			
			symbol_309.getOwnedOperations().add(symbol_450);
		}
		{	// Pivot.ecore::pivot::ValueSpecification::unlimitedValue()
			Operation symbol_452 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!unlimitedValue()
			symbol_452.setName("unlimitedValue");
			symbol_452.setType(symbol_302);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			
			{
				Comment symbol_453 = PivotFactory.eINSTANCE.createComment();
				symbol_453.setBody("The query unlimitedValue() gives a single UnlimitedNatural value when one can be computed.");
				symbol_452.getOwnedComments().add(symbol_453);
			}
			
			symbol_309.getOwnedOperations().add(symbol_452);
		}
		{
			Comment symbol_454 = PivotFactory.eINSTANCE.createComment();
			symbol_454.setBody("A value specification is the specification of a (possibly empty) set of instances, including both objects and data values.\r\nValueSpecification specializes ParameterableElement to specify that a value specification can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.");
			symbol_309.getOwnedComments().add(symbol_454);
		}
		
		symbol_0.getOwnedTypes().add(symbol_309); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		//
		// Pivot.ecore::pivot::Variable http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
		//
		symbol_311.setName("Variable");
		symbol_311.getSuperClasses().add(symbol_319); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		{ // Pivot.ecore::pivot::Variable::ExpressionInOcl
			symbol_312.setName("ExpressionInOcl");
			symbol_312.setType(symbol_76);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
			symbol_312.setLower(BigInteger.valueOf(0));
			symbol_312.setUpper(BigInteger.valueOf(-1));
			
			symbol_312.setImplicit(true);
			symbol_312.setIsResolveProxies(true);
			
			symbol_311.getOwnedAttributes().add(symbol_312);
		}
		{ // Pivot.ecore::pivot::Variable::IterateExp
			symbol_313.setName("IterateExp");
			symbol_313.setType(symbol_97);  // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
			symbol_313.setLower(BigInteger.valueOf(0));
			
			symbol_313.setImplicit(true);
			symbol_313.setIsResolveProxies(true);
			symbol_313.setOpposite(symbol_98);
			
			symbol_311.getOwnedAttributes().add(symbol_313);
		}
		{ // Pivot.ecore::pivot::Variable::LetExp
			symbol_314.setName("LetExp");
			symbol_314.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
			symbol_314.setLower(BigInteger.valueOf(0));
			
			symbol_314.setImplicit(true);
			symbol_314.setIsResolveProxies(true);
			symbol_314.setOpposite(symbol_110);
			
			symbol_311.getOwnedAttributes().add(symbol_314);
		}
		{ // Pivot.ecore::pivot::Variable::LoopExp
			symbol_315.setName("LoopExp");
			symbol_315.setType(symbol_114);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
			symbol_315.setLower(BigInteger.valueOf(0));
			
			symbol_315.setImplicit(true);
			symbol_315.setIsResolveProxies(true);
			symbol_315.setOpposite(symbol_116);
			
			symbol_311.getOwnedAttributes().add(symbol_315);
		}
		{ // Pivot.ecore::pivot::Variable::implicit
			symbol_316.setName("implicit");
			symbol_316.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_316.setLower(BigInteger.valueOf(0));
			
			symbol_316.setIsResolveProxies(true);
			
			symbol_311.getOwnedAttributes().add(symbol_316);
		}
		{ // Pivot.ecore::pivot::Variable::initExpression
			symbol_317.setName("initExpression");
			symbol_317.setType(symbol_144);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_317.setLower(BigInteger.valueOf(0));
			
			symbol_317.setIsComposite(true);
			symbol_317.setIsResolveProxies(true);
			symbol_317.setOpposite(symbol_157);
			
			symbol_311.getOwnedAttributes().add(symbol_317);
		}
		{ // Pivot.ecore::pivot::Variable::representedParameter
			symbol_318.setName("representedParameter");
			symbol_318.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_318.setLower(BigInteger.valueOf(0));
			
			symbol_318.setIsResolveProxies(true);
			symbol_318.setOpposite(symbol_187);
			
			symbol_311.getOwnedAttributes().add(symbol_318);
		}
		
		symbol_0.getOwnedTypes().add(symbol_311); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
		//
		// Pivot.ecore::pivot::VariableDeclaration http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		//
		symbol_319.setName("VariableDeclaration");
		symbol_319.getSuperClasses().add(symbol_299); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		{ // Pivot.ecore::pivot::VariableDeclaration::VariableExp
			symbol_320.setName("VariableExp");
			symbol_320.setType(symbol_321);  // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
			symbol_320.setLower(BigInteger.valueOf(0));
			symbol_320.setUpper(BigInteger.valueOf(-1));
			
			symbol_320.setImplicit(true);
			symbol_320.setIsResolveProxies(true);
			symbol_320.setOpposite(symbol_323);
			
			symbol_319.getOwnedAttributes().add(symbol_320);
		}
		
		symbol_0.getOwnedTypes().add(symbol_319); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		//
		// Pivot.ecore::pivot::VariableExp http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
		//
		symbol_321.setName("VariableExp");
		symbol_321.getSuperClasses().add(symbol_144); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::VariableExp::implicit
			symbol_322.setName("implicit");
			symbol_322.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_322.setLower(BigInteger.valueOf(0));
			
			symbol_322.setIsResolveProxies(true);
			
			symbol_321.getOwnedAttributes().add(symbol_322);
		}
		{ // Pivot.ecore::pivot::VariableExp::referredVariable
			symbol_323.setName("referredVariable");
			symbol_323.setType(symbol_319);  // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
			symbol_323.setLower(BigInteger.valueOf(0));
			
			symbol_323.setIsResolveProxies(true);
			symbol_323.setOpposite(symbol_320);
			
			symbol_321.getOwnedAttributes().add(symbol_323);
		}
		
		symbol_0.getOwnedTypes().add(symbol_321); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
		//
		// Pivot.ecore::pivot::Visitable http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		//
		symbol_324.setName("Visitable");
		symbol_324.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_324); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		//
		// Pivot.ecore::pivot::Visitor http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}
		//
		symbol_325.setName("Visitor");
		symbol_328.setName("R");
		symbol_327.setOwnedParameteredElement(symbol_328);
		symbol_326.getOwnedParameters().add(symbol_327);
		symbol_330.setName("C");
		symbol_329.setOwnedParameteredElement(symbol_330);
		symbol_326.getOwnedParameters().add(symbol_329);
		
		symbol_325.setOwnedTemplateSignature(symbol_326);
		symbol_325.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_325); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}
		//
		// Pivot.ecore::pivot::VoidType http://www.eclipse.org/ocl/3.1.0/Pivot!VoidType
		//
		symbol_331.setName("VoidType");
		symbol_331.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		
		symbol_0.getOwnedTypes().add(symbol_331); // http://www.eclipse.org/ocl/3.1.0/Pivot!VoidType

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
