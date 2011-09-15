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
import org.eclipse.ocl.examples.pivot.utilities.PivotStandardLibrary;
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
		Package symbol_1 = PivotFactory.eINSTANCE.createPackage(); // http://www.eclipse.org/ocl/3.1.0/Pivot
		Class symbol_2 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
		Property symbol_3 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!NamedElement // pivot.ecore::pivot::Annotation::NamedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!NamedElement
		Property symbol_4 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!ownedContent // pivot.ecore::pivot::Annotation::ownedContent http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!ownedContent
		Property symbol_5 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!ownedDetail // pivot.ecore::pivot::Annotation::ownedDetail http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!ownedDetail
		Property symbol_6 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!reference // pivot.ecore::pivot::Annotation::reference http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation!reference
		
		Class symbol_7 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AnyType
		
		Class symbol_8 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
		Property symbol_9 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass!AssociationClassCallExp // pivot.ecore::pivot::AssociationClass::AssociationClassCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass!AssociationClassCallExp
		Property symbol_10 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass!unownedAttribute // pivot.ecore::pivot::AssociationClass::unownedAttribute http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass!unownedAttribute
		
		Class symbol_11 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
		Property symbol_12 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp!referredAssociationClass // pivot.ecore::pivot::AssociationClassCallExp::referredAssociationClass http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp!referredAssociationClass
		
		Enumeration symbol_13 = PivotFactory.eINSTANCE.createEnumeration(); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
		
		Class symbol_14 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!BagType
		
		PrimitiveType symbol_15 = standardLibrary.getBooleanType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
		Class symbol_16 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp
		Property symbol_17 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp!booleanSymbol // pivot.ecore::pivot::BooleanLiteralExp::booleanSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp!booleanSymbol
		
		Class symbol_18 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		Property symbol_19 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp!implicit // pivot.ecore::pivot::CallExp::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp!implicit
		Property symbol_20 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp!source // pivot.ecore::pivot::CallExp::source http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp!source
		
		Class symbol_21 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
		Property symbol_22 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction!MessageExp // pivot.ecore::pivot::CallOperationAction::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction!MessageExp
		Property symbol_23 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction!operation // pivot.ecore::pivot::CallOperationAction::operation http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction!operation
		
		DataType symbol_24 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallableImplementation
		
		Class symbol_25 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		Property symbol_26 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class!isAbstract // pivot.ecore::pivot::Class::isAbstract http://www.eclipse.org/ocl/3.1.0/Pivot!Class!isAbstract
		Property symbol_27 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class!isInterface // pivot.ecore::pivot::Class::isInterface http://www.eclipse.org/ocl/3.1.0/Pivot!Class!isInterface
		
		Class symbol_28 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
		Property symbol_29 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType!instanceType // pivot.ecore::pivot::ClassifierType::instanceType http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType!instanceType
		
		Class symbol_30 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
		Property symbol_31 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem!item // pivot.ecore::pivot::CollectionItem::item http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem!item
		
		Enumeration symbol_32 = PivotFactory.eINSTANCE.createEnumeration(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
		
		Class symbol_33 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp
		Property symbol_34 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp!kind // pivot.ecore::pivot::CollectionLiteralExp::kind http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp!kind
		Property symbol_35 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp!part // pivot.ecore::pivot::CollectionLiteralExp::part http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp!part
		
		Class symbol_36 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		Property symbol_37 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart!CollectionLiteralExp // pivot.ecore::pivot::CollectionLiteralPart::CollectionLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart!CollectionLiteralExp
		
		Class symbol_38 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
		Property symbol_39 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange!first // pivot.ecore::pivot::CollectionRange::first http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange!first
		Property symbol_40 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange!last // pivot.ecore::pivot::CollectionRange::last http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange!last
		
		Class symbol_41 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		Property symbol_42 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType!elementType // pivot.ecore::pivot::CollectionType::elementType http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType!elementType
		
		Class symbol_43 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
		Property symbol_44 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!Element // pivot.ecore::pivot::Comment::Element http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!Element
		Property symbol_45 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!annotatedElement // pivot.ecore::pivot::Comment::annotatedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!annotatedElement
		Property symbol_46 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!body // pivot.ecore::pivot::Comment::body http://www.eclipse.org/ocl/3.1.0/Pivot!Comment!body
		
		Class symbol_47 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
		Property symbol_48 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!NamedElement // pivot.ecore::pivot::Constraint::NamedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!NamedElement
		Property symbol_49 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!constrainedElement // pivot.ecore::pivot::Constraint::constrainedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!constrainedElement
		Property symbol_50 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!context // pivot.ecore::pivot::Constraint::context http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!context
		Property symbol_51 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!isCallable // pivot.ecore::pivot::Constraint::isCallable http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!isCallable
		Property symbol_52 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!specification // pivot.ecore::pivot::Constraint::specification http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!specification
		Property symbol_53 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!stereotype // pivot.ecore::pivot::Constraint::stereotype http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint!stereotype
		
		Class symbol_54 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		Property symbol_55 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!behavioralType // pivot.ecore::pivot::DataType::behavioralType http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!behavioralType
		Property symbol_56 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!isSerializable // pivot.ecore::pivot::DataType::isSerializable http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!isSerializable
		
		Class symbol_57 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
		Property symbol_58 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!Annotation // pivot.ecore::pivot::Detail::Annotation http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!Annotation
		Property symbol_59 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!value // pivot.ecore::pivot::Detail::value http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!value
		
		Class symbol_60 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		Property symbol_61 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Annotation // pivot.ecore::pivot::Element::Annotation http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Annotation
		Property symbol_62 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Comment // pivot.ecore::pivot::Element::Comment http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Comment
		Property symbol_63 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Constraint // pivot.ecore::pivot::Element::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Constraint
		Property symbol_64 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!ownedComment // pivot.ecore::pivot::Element::ownedComment http://www.eclipse.org/ocl/3.1.0/Pivot!Element!ownedComment
		
		Class symbol_65 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
		Property symbol_66 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp!referredEnumLiteral // pivot.ecore::pivot::EnumLiteralExp::referredEnumLiteral http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp!referredEnumLiteral
		
		Class symbol_67 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
		Property symbol_68 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration!ownedLiteral // pivot.ecore::pivot::Enumeration::ownedLiteral http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration!ownedLiteral
		
		Class symbol_69 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
		Property symbol_70 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!EnumLiteralExp // pivot.ecore::pivot::EnumerationLiteral::EnumLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!EnumLiteralExp
		Property symbol_71 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!enumeration // pivot.ecore::pivot::EnumerationLiteral::enumeration http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!enumeration
		Property symbol_72 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!value // pivot.ecore::pivot::EnumerationLiteral::value http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!value
		
		Class symbol_73 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
		Property symbol_74 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!bodyExpression // pivot.ecore::pivot::ExpressionInOcl::bodyExpression http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!bodyExpression
		Property symbol_75 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!contextVariable // pivot.ecore::pivot::ExpressionInOcl::contextVariable http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!contextVariable
		Property symbol_76 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!messageExpression // pivot.ecore::pivot::ExpressionInOcl::messageExpression http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!messageExpression
		Property symbol_77 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!parameterVariable // pivot.ecore::pivot::ExpressionInOcl::parameterVariable http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!parameterVariable
		Property symbol_78 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!resultVariable // pivot.ecore::pivot::ExpressionInOcl::resultVariable http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!resultVariable
		
		Class symbol_79 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		Property symbol_80 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementation // pivot.ecore::pivot::Feature::implementation http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementation
		Property symbol_81 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementationClass // pivot.ecore::pivot::Feature::implementationClass http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementationClass
		
		Class symbol_82 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		Property symbol_83 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp!isPre // pivot.ecore::pivot::FeatureCallExp::isPre http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp!isPre
		
		Class symbol_84 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
		Property symbol_85 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!condition // pivot.ecore::pivot::IfExp::condition http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!condition
		Property symbol_86 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!elseExpression // pivot.ecore::pivot::IfExp::elseExpression http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!elseExpression
		Property symbol_87 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!thenExpression // pivot.ecore::pivot::IfExp::thenExpression http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!thenExpression
		
		DataType symbol_88 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Int
		
		PrimitiveType symbol_89 = standardLibrary.getIntegerType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
		Class symbol_90 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp
		Property symbol_91 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp!integerSymbol // pivot.ecore::pivot::IntegerLiteralExp::integerSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp!integerSymbol
		
		Class symbol_92 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidLiteralExp
		
		Class symbol_93 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidType
		
		Class symbol_94 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
		Property symbol_95 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp!result // pivot.ecore::pivot::IterateExp::result http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp!result
		
		Class symbol_96 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
		Property symbol_97 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!LoopExp // pivot.ecore::pivot::Iteration::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!LoopExp
		Property symbol_98 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedAccumulator // pivot.ecore::pivot::Iteration::ownedAccumulator http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedAccumulator
		Property symbol_99 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedIterator // pivot.ecore::pivot::Iteration::ownedIterator http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedIterator
		
		Class symbol_100 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IteratorExp
		
		Class symbol_101 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
		Property symbol_102 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!contextType // pivot.ecore::pivot::LambdaType::contextType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!contextType
		Property symbol_103 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!parameterType // pivot.ecore::pivot::LambdaType::parameterType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!parameterType
		Property symbol_104 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!resultType // pivot.ecore::pivot::LambdaType::resultType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!resultType
		
		Class symbol_105 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
		Property symbol_106 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!in // pivot.ecore::pivot::LetExp::in http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!in
		Property symbol_107 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!variable // pivot.ecore::pivot::LetExp::variable http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!variable
		
		Class symbol_108 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Library
		
		Class symbol_109 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		
		Class symbol_110 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		Property symbol_111 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!body // pivot.ecore::pivot::LoopExp::body http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!body
		Property symbol_112 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!iterator // pivot.ecore::pivot::LoopExp::iterator http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!iterator
		Property symbol_113 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!referredIteration // pivot.ecore::pivot::LoopExp::referredIteration http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!referredIteration
		
		Class symbol_114 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
		Property symbol_115 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!argument // pivot.ecore::pivot::MessageExp::argument http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!argument
		Property symbol_116 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!calledOperation // pivot.ecore::pivot::MessageExp::calledOperation http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!calledOperation
		Property symbol_117 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!sentSignal // pivot.ecore::pivot::MessageExp::sentSignal http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!sentSignal
		Property symbol_118 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!target // pivot.ecore::pivot::MessageExp::target http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!target
		
		Class symbol_119 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
		Property symbol_120 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredOperation // pivot.ecore::pivot::MessageType::referredOperation http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredOperation
		Property symbol_121 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredSignal // pivot.ecore::pivot::MessageType::referredSignal http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredSignal
		
		Class symbol_122 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		Property symbol_123 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isOrdered // pivot.ecore::pivot::MultiplicityElement::isOrdered http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isOrdered
		Property symbol_124 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isUnique // pivot.ecore::pivot::MultiplicityElement::isUnique http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isUnique
		Property symbol_125 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!lower // pivot.ecore::pivot::MultiplicityElement::lower http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!lower
		Property symbol_126 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!upper // pivot.ecore::pivot::MultiplicityElement::upper http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!upper
		
		Class symbol_127 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		
		Class symbol_128 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		Property symbol_129 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!Constraint // pivot.ecore::pivot::NamedElement::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!Constraint
		Property symbol_130 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!isStatic // pivot.ecore::pivot::NamedElement::isStatic http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!isStatic
		Property symbol_131 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!name // pivot.ecore::pivot::NamedElement::name http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!name
		Property symbol_132 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedAnnotation // pivot.ecore::pivot::NamedElement::ownedAnnotation http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedAnnotation
		Property symbol_133 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedRule // pivot.ecore::pivot::NamedElement::ownedRule http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedRule
		
		Class symbol_134 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		
		Class symbol_135 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		Property symbol_136 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!navigationSource // pivot.ecore::pivot::NavigationCallExp::navigationSource http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!navigationSource
		Property symbol_137 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!qualifier // pivot.ecore::pivot::NavigationCallExp::qualifier http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!qualifier
		
		Class symbol_138 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NullLiteralExp
		
		Class symbol_139 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		
		DataType symbol_140 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Object
		
		Class symbol_141 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		Property symbol_142 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CallExp // pivot.ecore::pivot::OclExpression::CallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CallExp
		Property symbol_143 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionItem // pivot.ecore::pivot::OclExpression::CollectionItem http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionItem
		Property symbol_144 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionRange // pivot.ecore::pivot::OclExpression::CollectionRange http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionRange
		Property symbol_145 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!ExpressionInOcl // pivot.ecore::pivot::OclExpression::ExpressionInOcl http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!ExpressionInOcl
		Property symbol_146 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!IfExp // pivot.ecore::pivot::OclExpression::IfExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!IfExp
		Property symbol_147 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LetExp // pivot.ecore::pivot::OclExpression::LetExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LetExp
		Property symbol_148 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LoopExp // pivot.ecore::pivot::OclExpression::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LoopExp
		Property symbol_149 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!MessageExp // pivot.ecore::pivot::OclExpression::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!MessageExp
		Property symbol_150 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!NavigationCallExp // pivot.ecore::pivot::OclExpression::NavigationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!NavigationCallExp
		Property symbol_151 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!OperationCallExp // pivot.ecore::pivot::OclExpression::OperationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!OperationCallExp
		Property symbol_152 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!TupleLiteralPart // pivot.ecore::pivot::OclExpression::TupleLiteralPart http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!TupleLiteralPart
		Property symbol_153 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!Variable // pivot.ecore::pivot::OclExpression::Variable http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!Variable
		
		Class symbol_154 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		Property symbol_155 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!body // pivot.ecore::pivot::OpaqueExpression::body http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!body
		Property symbol_156 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!language // pivot.ecore::pivot::OpaqueExpression::language http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!language
		Property symbol_157 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!message // pivot.ecore::pivot::OpaqueExpression::message http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!message
		Property symbol_158 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!valueExpression // pivot.ecore::pivot::OpaqueExpression::valueExpression http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!valueExpression
		
		Class symbol_159 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		Property symbol_160 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!CallOperationAction // pivot.ecore::pivot::Operation::CallOperationAction http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!CallOperationAction
		Property symbol_161 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!MessageType // pivot.ecore::pivot::Operation::MessageType http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!MessageType
		Property symbol_162 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!OperationCallExp // pivot.ecore::pivot::Operation::OperationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!OperationCallExp
		Property symbol_163 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!class // pivot.ecore::pivot::Operation::class http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!class
		Property symbol_164 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!ownedParameter // pivot.ecore::pivot::Operation::ownedParameter http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!ownedParameter
		Property symbol_165 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!owningType // pivot.ecore::pivot::Operation::owningType http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!owningType
		Property symbol_166 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!precedence // pivot.ecore::pivot::Operation::precedence http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!precedence
		Property symbol_167 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!raisedException // pivot.ecore::pivot::Operation::raisedException http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!raisedException
		
		Class symbol_168 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
		Property symbol_169 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!argument // pivot.ecore::pivot::OperationCallExp::argument http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!argument
		Property symbol_170 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!referredOperation // pivot.ecore::pivot::OperationCallExp::referredOperation http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!referredOperation
		
		Class symbol_171 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationTemplateParameter
		
		Class symbol_172 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OrderedSetType
		
		Class symbol_173 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		Property symbol_174 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestedPackage // pivot.ecore::pivot::Package::nestedPackage http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestedPackage
		Property symbol_175 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestingPackage // pivot.ecore::pivot::Package::nestingPackage http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestingPackage
		Property symbol_176 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsPrefix // pivot.ecore::pivot::Package::nsPrefix http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsPrefix
		Property symbol_177 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsURI // pivot.ecore::pivot::Package::nsURI http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsURI
		Property symbol_178 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedPrecedence // pivot.ecore::pivot::Package::ownedPrecedence http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedPrecedence
		Property symbol_179 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedType // pivot.ecore::pivot::Package::ownedType http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedType
		
		Class symbol_180 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PackageableElement
		
		Class symbol_181 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
		Property symbol_182 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Iteration // pivot.ecore::pivot::Parameter::Iteration http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Iteration
		Property symbol_183 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Variable // pivot.ecore::pivot::Parameter::Variable http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Variable
		Property symbol_184 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!operation // pivot.ecore::pivot::Parameter::operation http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!operation
		
		Class symbol_185 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		Property symbol_186 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameter // pivot.ecore::pivot::ParameterableElement::TemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameter
		Property symbol_187 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameterSubstitution // pivot.ecore::pivot::ParameterableElement::TemplateParameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameterSubstitution
		Property symbol_188 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!owningTemplateParameter // pivot.ecore::pivot::ParameterableElement::owningTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!owningTemplateParameter
		Property symbol_189 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!templateParameter // pivot.ecore::pivot::ParameterableElement::templateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!templateParameter
		
		Class symbol_190 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Pivotable
		
		Class symbol_191 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
		Property symbol_192 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Operation // pivot.ecore::pivot::Precedence::Operation http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Operation
		Property symbol_193 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Package // pivot.ecore::pivot::Precedence::Package http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Package
		Property symbol_194 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!associativity // pivot.ecore::pivot::Precedence::associativity http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!associativity
		Property symbol_195 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!order // pivot.ecore::pivot::Precedence::order http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!order
		
		Class symbol_196 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		
		Class symbol_197 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveType
		
		Class symbol_198 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
		Property symbol_199 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!NavigationCallExp // pivot.ecore::pivot::Property::NavigationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!Property!NavigationCallExp
		Property symbol_200 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!Property // pivot.ecore::pivot::Property::Property http://www.eclipse.org/ocl/3.1.0/Pivot!Property!Property
		Property symbol_201 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!PropertyCallExp // pivot.ecore::pivot::Property::PropertyCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!Property!PropertyCallExp
		Property symbol_202 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!association // pivot.ecore::pivot::Property::association http://www.eclipse.org/ocl/3.1.0/Pivot!Property!association
		Property symbol_203 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!class // pivot.ecore::pivot::Property::class http://www.eclipse.org/ocl/3.1.0/Pivot!Property!class
		Property symbol_204 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!default // pivot.ecore::pivot::Property::default http://www.eclipse.org/ocl/3.1.0/Pivot!Property!default
		Property symbol_205 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!implicit // pivot.ecore::pivot::Property::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!Property!implicit
		Property symbol_206 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isComposite // pivot.ecore::pivot::Property::isComposite http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isComposite
		Property symbol_207 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isDerived // pivot.ecore::pivot::Property::isDerived http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isDerived
		Property symbol_208 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isID // pivot.ecore::pivot::Property::isID http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isID
		Property symbol_209 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isReadOnly // pivot.ecore::pivot::Property::isReadOnly http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isReadOnly
		Property symbol_210 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isResolveProxies // pivot.ecore::pivot::Property::isResolveProxies http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isResolveProxies
		Property symbol_211 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isTransient // pivot.ecore::pivot::Property::isTransient http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isTransient
		Property symbol_212 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isUnsettable // pivot.ecore::pivot::Property::isUnsettable http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isUnsettable
		Property symbol_213 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isVolatile // pivot.ecore::pivot::Property::isVolatile http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isVolatile
		Property symbol_214 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!keys // pivot.ecore::pivot::Property::keys http://www.eclipse.org/ocl/3.1.0/Pivot!Property!keys
		Property symbol_215 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!opposite // pivot.ecore::pivot::Property::opposite http://www.eclipse.org/ocl/3.1.0/Pivot!Property!opposite
		Property symbol_216 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!owningType // pivot.ecore::pivot::Property::owningType http://www.eclipse.org/ocl/3.1.0/Pivot!Property!owningType
		
		Class symbol_217 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
		Property symbol_218 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp!referredProperty // pivot.ecore::pivot::PropertyCallExp::referredProperty http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp!referredProperty
		
		PrimitiveType symbol_219 = standardLibrary.getRealType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Real
		Class symbol_220 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp
		Property symbol_221 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp!realSymbol // pivot.ecore::pivot::RealLiteralExp::realSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp!realSymbol
		
		Class symbol_222 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SelfType
		
		Class symbol_223 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
		Property symbol_224 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!MessageExp // pivot.ecore::pivot::SendSignalAction::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!MessageExp
		Property symbol_225 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!signal // pivot.ecore::pivot::SendSignalAction::signal http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!signal
		
		Class symbol_226 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SequenceType
		
		Class symbol_227 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SetType
		
		Class symbol_228 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
		Property symbol_229 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!MessageType // pivot.ecore::pivot::Signal::MessageType http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!MessageType
		Property symbol_230 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!SendSignalAction // pivot.ecore::pivot::Signal::SendSignalAction http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!SendSignalAction
		
		Class symbol_231 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!State
		Property symbol_232 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!State!StateExp // pivot.ecore::pivot::State::StateExp http://www.eclipse.org/ocl/3.1.0/Pivot!State!StateExp
		
		Class symbol_233 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
		Property symbol_234 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp!referredState // pivot.ecore::pivot::StateExp::referredState http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp!referredState
		
		PrimitiveType symbol_235 = standardLibrary.getStringType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!String
		Class symbol_236 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp
		Property symbol_237 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp!stringSymbol // pivot.ecore::pivot::StringLiteralExp::stringSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp!stringSymbol
		
		Class symbol_238 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
		Property symbol_239 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!boundElement // pivot.ecore::pivot::TemplateBinding::boundElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!boundElement
		Property symbol_240 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!parameterSubstitution // pivot.ecore::pivot::TemplateBinding::parameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!parameterSubstitution
		Property symbol_241 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!signature // pivot.ecore::pivot::TemplateBinding::signature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!signature
		
		Class symbol_242 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		Property symbol_243 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateParameterSubstitution // pivot.ecore::pivot::TemplateParameter::TemplateParameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateParameterSubstitution
		Property symbol_244 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateSignature // pivot.ecore::pivot::TemplateParameter::TemplateSignature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateSignature
		Property symbol_245 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!default // pivot.ecore::pivot::TemplateParameter::default http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!default
		Property symbol_246 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedDefault // pivot.ecore::pivot::TemplateParameter::ownedDefault http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedDefault
		Property symbol_247 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedParameteredElement // pivot.ecore::pivot::TemplateParameter::ownedParameteredElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedParameteredElement
		Property symbol_248 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!parameteredElement // pivot.ecore::pivot::TemplateParameter::parameteredElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!parameteredElement
		Property symbol_249 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!signature // pivot.ecore::pivot::TemplateParameter::signature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!signature
		
		Class symbol_250 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
		Property symbol_251 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!actual // pivot.ecore::pivot::TemplateParameterSubstitution::actual http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!actual
		Property symbol_252 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!formal // pivot.ecore::pivot::TemplateParameterSubstitution::formal http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!formal
		Property symbol_253 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!ownedActual // pivot.ecore::pivot::TemplateParameterSubstitution::ownedActual http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!ownedActual
		Property symbol_254 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!templateBinding // pivot.ecore::pivot::TemplateParameterSubstitution::templateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!templateBinding
		
		Class symbol_255 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType
		Property symbol_256 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType!specification // pivot.ecore::pivot::TemplateParameterType::specification http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType!specification
		
		Class symbol_257 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
		Property symbol_258 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!TemplateBinding // pivot.ecore::pivot::TemplateSignature::TemplateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!TemplateBinding
		Property symbol_259 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!ownedParameter // pivot.ecore::pivot::TemplateSignature::ownedParameter http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!ownedParameter
		Property symbol_260 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!parameter // pivot.ecore::pivot::TemplateSignature::parameter http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!parameter
		Property symbol_261 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!template // pivot.ecore::pivot::TemplateSignature::template http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!template
		
		Class symbol_262 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		Property symbol_263 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!ownedTemplateSignature // pivot.ecore::pivot::TemplateableElement::ownedTemplateSignature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!ownedTemplateSignature
		Property symbol_264 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!templateBinding // pivot.ecore::pivot::TemplateableElement::templateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!templateBinding
		Property symbol_265 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!unspecializedElement // pivot.ecore::pivot::TemplateableElement::unspecializedElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!unspecializedElement
		
		DataType symbol_266 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Throwable
		
		Class symbol_267 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
		Property symbol_268 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp!part // pivot.ecore::pivot::TupleLiteralExp::part http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp!part
		
		Class symbol_269 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
		Property symbol_270 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!TupleLiteralExp // pivot.ecore::pivot::TupleLiteralPart::TupleLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!TupleLiteralExp
		Property symbol_271 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!initExpression // pivot.ecore::pivot::TupleLiteralPart::initExpression http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!initExpression
		
		Class symbol_272 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleType
		
		Class symbol_273 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		Property symbol_274 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ClassifierType // pivot.ecore::pivot::Type::ClassifierType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ClassifierType
		Property symbol_275 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!CollectionType // pivot.ecore::pivot::Type::CollectionType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!CollectionType
		Property symbol_276 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!DataType // pivot.ecore::pivot::Type::DataType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!DataType
		Property symbol_277 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!LambdaType // pivot.ecore::pivot::Type::LambdaType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!LambdaType
		Property symbol_278 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Operation // pivot.ecore::pivot::Type::Operation http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Operation
		Property symbol_279 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Type // pivot.ecore::pivot::Type::Type http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Type
		Property symbol_280 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeExp // pivot.ecore::pivot::Type::TypeExp http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeExp
		Property symbol_281 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeTemplateParameter // pivot.ecore::pivot::Type::TypeTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeTemplateParameter
		Property symbol_282 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypedElement // pivot.ecore::pivot::Type::TypedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypedElement
		Property symbol_283 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!UnspecifiedType // pivot.ecore::pivot::Type::UnspecifiedType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!UnspecifiedType
		Property symbol_284 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!instanceClassName // pivot.ecore::pivot::Type::instanceClassName http://www.eclipse.org/ocl/3.1.0/Pivot!Type!instanceClassName
		Property symbol_285 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedAttribute // pivot.ecore::pivot::Type::ownedAttribute http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedAttribute
		Property symbol_286 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedOperation // pivot.ecore::pivot::Type::ownedOperation http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedOperation
		Property symbol_287 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!package // pivot.ecore::pivot::Type::package http://www.eclipse.org/ocl/3.1.0/Pivot!Type!package
		Property symbol_288 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!superClass // pivot.ecore::pivot::Type::superClass http://www.eclipse.org/ocl/3.1.0/Pivot!Type!superClass
		
		Class symbol_289 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
		Property symbol_290 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp!referredType // pivot.ecore::pivot::TypeExp::referredType http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp!referredType
		
		Class symbol_291 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
		Property symbol_292 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!allowSubstitutable // pivot.ecore::pivot::TypeTemplateParameter::allowSubstitutable http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!allowSubstitutable
		Property symbol_293 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!constrainingType // pivot.ecore::pivot::TypeTemplateParameter::constrainingType http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!constrainingType
		
		Class symbol_294 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		Property symbol_295 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement!type // pivot.ecore::pivot::TypedElement::type http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement!type
		
		Class symbol_296 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		
		PrimitiveType symbol_297 = standardLibrary.getUnlimitedNaturalType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
		Class symbol_298 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp
		Property symbol_299 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp!unlimitedNaturalSymbol // pivot.ecore::pivot::UnlimitedNaturalLiteralExp::unlimitedNaturalSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp!unlimitedNaturalSymbol
		
		Class symbol_300 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
		Property symbol_301 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!lowerBound // pivot.ecore::pivot::UnspecifiedType::lowerBound http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!lowerBound
		Property symbol_302 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!upperBound // pivot.ecore::pivot::UnspecifiedType::upperBound http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!upperBound
		
		Class symbol_303 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedValueExp
		
		Class symbol_304 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		Property symbol_305 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!Constraint // pivot.ecore::pivot::ValueSpecification::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!Constraint
		
		Class symbol_306 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
		Property symbol_307 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!ExpressionInOcl // pivot.ecore::pivot::Variable::ExpressionInOcl http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!ExpressionInOcl
		Property symbol_308 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!IterateExp // pivot.ecore::pivot::Variable::IterateExp http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!IterateExp
		Property symbol_309 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LetExp // pivot.ecore::pivot::Variable::LetExp http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LetExp
		Property symbol_310 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LoopExp // pivot.ecore::pivot::Variable::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LoopExp
		Property symbol_311 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!implicit // pivot.ecore::pivot::Variable::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!implicit
		Property symbol_312 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!initExpression // pivot.ecore::pivot::Variable::initExpression http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!initExpression
		Property symbol_313 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!representedParameter // pivot.ecore::pivot::Variable::representedParameter http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!representedParameter
		
		Class symbol_314 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		Property symbol_315 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration!VariableExp // pivot.ecore::pivot::VariableDeclaration::VariableExp http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration!VariableExp
		
		Class symbol_316 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
		Property symbol_317 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!implicit // pivot.ecore::pivot::VariableExp::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!implicit
		Property symbol_318 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!referredVariable // pivot.ecore::pivot::VariableExp::referredVariable http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!referredVariable
		
		Class symbol_319 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		
		Class symbol_320 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}
		TemplateSignature symbol_321 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}!
		TypeTemplateParameter symbol_322 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_323 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}?R
		TypeTemplateParameter symbol_324 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_325 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}?C
		
		
		Class symbol_326 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VoidType
		

		symbol_1.setName("pivot");
		symbol_1.setNsPrefix("pivot");
		symbol_1.setNsURI("http://www.eclipse.org/ocl/3.1.0/Pivot");
		//
		// pivot.ecore::pivot::Annotation http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
		//
		symbol_2.setName("Annotation");
		symbol_2.getSuperClasses().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::Annotation::NamedElement
			symbol_3.setName("NamedElement");
			symbol_3.setType(symbol_128);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
			symbol_3.setLower(BigInteger.valueOf(0));
			
			symbol_3.setImplicit(true);
			symbol_3.setIsResolveProxies(true);
			symbol_3.setOpposite(symbol_132);
			symbol_2.getOwnedAttributes().add(symbol_3);
		}
		{ // pivot.ecore::pivot::Annotation::ownedContent
			symbol_4.setName("ownedContent");
			symbol_4.setType(symbol_60);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_4.setLower(BigInteger.valueOf(0));
			symbol_4.setUpper(BigInteger.valueOf(-1));
			symbol_4.setIsOrdered(true);
			
			symbol_4.setIsComposite(true);
			symbol_4.setIsResolveProxies(true);
			symbol_2.getOwnedAttributes().add(symbol_4);
		}
		{ // pivot.ecore::pivot::Annotation::ownedDetail
			symbol_5.setName("ownedDetail");
			symbol_5.setType(symbol_57);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
			symbol_5.setLower(BigInteger.valueOf(0));
			symbol_5.setUpper(BigInteger.valueOf(-1));
			symbol_5.setIsOrdered(true);
			
			symbol_5.setIsComposite(true);
			symbol_5.setIsResolveProxies(true);
			symbol_5.setOpposite(symbol_58);
			symbol_2.getOwnedAttributes().add(symbol_5);
		}
		{ // pivot.ecore::pivot::Annotation::reference
			symbol_6.setName("reference");
			symbol_6.setType(symbol_60);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_6.setLower(BigInteger.valueOf(0));
			symbol_6.setUpper(BigInteger.valueOf(-1));
			symbol_6.setIsOrdered(true);
			
			symbol_6.setIsResolveProxies(true);
			symbol_6.setOpposite(symbol_61);
			symbol_2.getOwnedAttributes().add(symbol_6);
		}
		symbol_1.getOwnedTypes().add(symbol_2); // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
		//
		// pivot.ecore::pivot::AnyType http://www.eclipse.org/ocl/3.1.0/Pivot!AnyType
		//
		symbol_7.setName("AnyType");
		symbol_7.getSuperClasses().add(symbol_25); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		symbol_1.getOwnedTypes().add(symbol_7); // http://www.eclipse.org/ocl/3.1.0/Pivot!AnyType
		//
		// pivot.ecore::pivot::AssociationClass http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
		//
		symbol_8.setName("AssociationClass");
		symbol_8.getSuperClasses().add(symbol_25); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		{ // pivot.ecore::pivot::AssociationClass::AssociationClassCallExp
			symbol_9.setName("AssociationClassCallExp");
			symbol_9.setType(symbol_11);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
			symbol_9.setLower(BigInteger.valueOf(0));
			symbol_9.setUpper(BigInteger.valueOf(-1));
			
			symbol_9.setImplicit(true);
			symbol_9.setIsResolveProxies(true);
			symbol_9.setOpposite(symbol_12);
			symbol_8.getOwnedAttributes().add(symbol_9);
		}
		{ // pivot.ecore::pivot::AssociationClass::unownedAttribute
			symbol_10.setName("unownedAttribute");
			symbol_10.setType(symbol_198);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_10.setLower(BigInteger.valueOf(0));
			symbol_10.setUpper(BigInteger.valueOf(-1));
			
			symbol_10.setIsResolveProxies(true);
			symbol_10.setOpposite(symbol_202);
			symbol_8.getOwnedAttributes().add(symbol_10);
		}
		symbol_1.getOwnedTypes().add(symbol_8); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
		//
		// pivot.ecore::pivot::AssociationClassCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
		//
		symbol_11.setName("AssociationClassCallExp");
		symbol_11.getSuperClasses().add(symbol_135); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		{ // pivot.ecore::pivot::AssociationClassCallExp::referredAssociationClass
			symbol_12.setName("referredAssociationClass");
			symbol_12.setType(symbol_8);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
			symbol_12.setLower(BigInteger.valueOf(0));
			
			symbol_12.setIsResolveProxies(true);
			symbol_12.setOpposite(symbol_9);
			symbol_11.getOwnedAttributes().add(symbol_12);
		}
		symbol_1.getOwnedTypes().add(symbol_11); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
		//
		// pivot.ecore::pivot::AssociativityKind http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
		//
		symbol_13.setName("AssociativityKind");
		{
			EnumerationLiteral symbol_327 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::AssociativityKind::Left http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind!Left
			symbol_327.setName("Left");
			symbol_13.getOwnedLiterals().add(symbol_327);
			EnumerationLiteral symbol_328 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::AssociativityKind::Right http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind!Right
			symbol_328.setName("Right");
			symbol_13.getOwnedLiterals().add(symbol_328);
		}
		
		symbol_1.getOwnedTypes().add(symbol_13); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
		//
		// pivot.ecore::pivot::BagType http://www.eclipse.org/ocl/3.1.0/Pivot!BagType
		//
		symbol_14.setName("BagType");
		symbol_14.getSuperClasses().add(symbol_41); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		symbol_1.getOwnedTypes().add(symbol_14); // http://www.eclipse.org/ocl/3.1.0/Pivot!BagType
		//
		// pivot.ecore::pivot::BooleanLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp
		//
		symbol_16.setName("BooleanLiteralExp");
		symbol_16.getSuperClasses().add(symbol_196); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		{ // pivot.ecore::pivot::BooleanLiteralExp::booleanSymbol
			symbol_17.setName("booleanSymbol");
			symbol_17.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_17.setIsResolveProxies(true);
			symbol_17.setIsUnsettable(true);
			symbol_16.getOwnedAttributes().add(symbol_17);
		}
		symbol_1.getOwnedTypes().add(symbol_16); // http://www.eclipse.org/ocl/3.1.0/Pivot!BooleanLiteralExp
		//
		// pivot.ecore::pivot::CallExp http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		//
		symbol_18.setName("CallExp");
		symbol_18.getSuperClasses().add(symbol_141); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::CallExp::implicit
			symbol_19.setName("implicit");
			symbol_19.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_19.setLower(BigInteger.valueOf(0));
			
			symbol_19.setIsResolveProxies(true);
			symbol_18.getOwnedAttributes().add(symbol_19);
		}
		{ // pivot.ecore::pivot::CallExp::source
			symbol_20.setName("source");
			symbol_20.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_20.setLower(BigInteger.valueOf(0));
			
			symbol_20.setIsComposite(true);
			symbol_20.setIsResolveProxies(true);
			symbol_20.setOpposite(symbol_142);
			symbol_18.getOwnedAttributes().add(symbol_20);
		}
		symbol_1.getOwnedTypes().add(symbol_18); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		//
		// pivot.ecore::pivot::CallOperationAction http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
		//
		symbol_21.setName("CallOperationAction");
		symbol_21.getSuperClasses().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::CallOperationAction::MessageExp
			symbol_22.setName("MessageExp");
			symbol_22.setType(symbol_114);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
			symbol_22.setLower(BigInteger.valueOf(0));
			
			symbol_22.setImplicit(true);
			symbol_22.setIsResolveProxies(true);
			symbol_22.setOpposite(symbol_116);
			symbol_21.getOwnedAttributes().add(symbol_22);
		}
		{ // pivot.ecore::pivot::CallOperationAction::operation
			symbol_23.setName("operation");
			symbol_23.setType(symbol_159);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			
			symbol_23.setIsResolveProxies(true);
			symbol_23.setOpposite(symbol_160);
			symbol_21.getOwnedAttributes().add(symbol_23);
		}
		symbol_1.getOwnedTypes().add(symbol_21); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
		//
		// pivot.ecore::pivot::CallableImplementation http://www.eclipse.org/ocl/3.1.0/Pivot!CallableImplementation
		//
		symbol_24.setName("CallableImplementation");
		symbol_24.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_24); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallableImplementation
		//
		// pivot.ecore::pivot::Class http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		//
		symbol_25.setName("Class");
		symbol_25.getSuperClasses().add(symbol_134); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		symbol_25.getSuperClasses().add(symbol_273); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		{ // pivot.ecore::pivot::Class::isAbstract
			symbol_26.setName("isAbstract");
			symbol_26.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_26.setIsResolveProxies(true);
			symbol_25.getOwnedAttributes().add(symbol_26);
		}
		{ // pivot.ecore::pivot::Class::isInterface
			symbol_27.setName("isInterface");
			symbol_27.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_27.setIsResolveProxies(true);
			symbol_25.getOwnedAttributes().add(symbol_27);
		}
		symbol_1.getOwnedTypes().add(symbol_25); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		//
		// pivot.ecore::pivot::ClassifierType http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
		//
		symbol_28.setName("ClassifierType");
		symbol_28.getSuperClasses().add(symbol_54); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // pivot.ecore::pivot::ClassifierType::instanceType
			symbol_29.setName("instanceType");
			symbol_29.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_29.setIsResolveProxies(true);
			symbol_29.setOpposite(symbol_274);
			symbol_28.getOwnedAttributes().add(symbol_29);
		}
		symbol_1.getOwnedTypes().add(symbol_28); // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
		//
		// pivot.ecore::pivot::CollectionItem http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
		//
		symbol_30.setName("CollectionItem");
		symbol_30.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		{ // pivot.ecore::pivot::CollectionItem::item
			symbol_31.setName("item");
			symbol_31.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_31.setIsComposite(true);
			symbol_31.setIsResolveProxies(true);
			symbol_31.setOpposite(symbol_143);
			symbol_30.getOwnedAttributes().add(symbol_31);
		}
		symbol_1.getOwnedTypes().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
		//
		// pivot.ecore::pivot::CollectionKind http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
		//
		symbol_32.setName("CollectionKind");
		{
			EnumerationLiteral symbol_329 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::Collection http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Collection
			symbol_329.setName("Collection");
			symbol_32.getOwnedLiterals().add(symbol_329);
			EnumerationLiteral symbol_330 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::Set http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Set
			symbol_330.setName("Set");
			symbol_32.getOwnedLiterals().add(symbol_330);
			EnumerationLiteral symbol_331 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::OrderedSet http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!OrderedSet
			symbol_331.setName("OrderedSet");
			symbol_32.getOwnedLiterals().add(symbol_331);
			EnumerationLiteral symbol_332 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::Bag http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Bag
			symbol_332.setName("Bag");
			symbol_32.getOwnedLiterals().add(symbol_332);
			EnumerationLiteral symbol_333 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::Sequence http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Sequence
			symbol_333.setName("Sequence");
			symbol_32.getOwnedLiterals().add(symbol_333);
		}
		
		symbol_1.getOwnedTypes().add(symbol_32); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
		//
		// pivot.ecore::pivot::CollectionLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp
		//
		symbol_33.setName("CollectionLiteralExp");
		symbol_33.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		{ // pivot.ecore::pivot::CollectionLiteralExp::kind
			symbol_34.setName("kind");
			symbol_34.setType(symbol_32);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
			
			symbol_34.setIsResolveProxies(true);
			symbol_33.getOwnedAttributes().add(symbol_34);
		}
		{ // pivot.ecore::pivot::CollectionLiteralExp::part
			symbol_35.setName("part");
			symbol_35.setType(symbol_36);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
			symbol_35.setLower(BigInteger.valueOf(0));
			symbol_35.setUpper(BigInteger.valueOf(-1));
			symbol_35.setIsOrdered(true);
			
			symbol_35.setIsComposite(true);
			symbol_35.setIsResolveProxies(true);
			symbol_35.setOpposite(symbol_37);
			symbol_33.getOwnedAttributes().add(symbol_35);
		}
		symbol_1.getOwnedTypes().add(symbol_33); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp
		//
		// pivot.ecore::pivot::CollectionLiteralPart http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		//
		symbol_36.setName("CollectionLiteralPart");
		symbol_36.getSuperClasses().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		{ // pivot.ecore::pivot::CollectionLiteralPart::CollectionLiteralExp
			symbol_37.setName("CollectionLiteralExp");
			symbol_37.setType(symbol_33);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp
			symbol_37.setLower(BigInteger.valueOf(0));
			
			symbol_37.setImplicit(true);
			symbol_37.setIsResolveProxies(true);
			symbol_37.setOpposite(symbol_35);
			symbol_36.getOwnedAttributes().add(symbol_37);
		}
		symbol_1.getOwnedTypes().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		//
		// pivot.ecore::pivot::CollectionRange http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
		//
		symbol_38.setName("CollectionRange");
		symbol_38.getSuperClasses().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralPart
		{ // pivot.ecore::pivot::CollectionRange::first
			symbol_39.setName("first");
			symbol_39.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_39.setIsComposite(true);
			symbol_39.setIsResolveProxies(true);
			symbol_39.setOpposite(symbol_144);
			symbol_38.getOwnedAttributes().add(symbol_39);
		}
		{ // pivot.ecore::pivot::CollectionRange::last
			symbol_40.setName("last");
			symbol_40.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_40.setIsComposite(true);
			symbol_40.setIsResolveProxies(true);
			symbol_38.getOwnedAttributes().add(symbol_40);
		}
		symbol_1.getOwnedTypes().add(symbol_38); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
		//
		// pivot.ecore::pivot::CollectionType http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		//
		symbol_41.setName("CollectionType");
		symbol_41.getSuperClasses().add(symbol_54); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // pivot.ecore::pivot::CollectionType::elementType
			symbol_42.setName("elementType");
			symbol_42.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_42.setIsResolveProxies(true);
			symbol_42.setOpposite(symbol_275);
			symbol_41.getOwnedAttributes().add(symbol_42);
		}
		symbol_1.getOwnedTypes().add(symbol_41); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		//
		// pivot.ecore::pivot::Comment http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
		//
		symbol_43.setName("Comment");
		symbol_43.getSuperClasses().add(symbol_60); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::Comment::Element
			symbol_44.setName("Element");
			symbol_44.setType(symbol_60);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_44.setLower(BigInteger.valueOf(0));
			
			symbol_44.setImplicit(true);
			symbol_44.setIsResolveProxies(true);
			symbol_44.setOpposite(symbol_64);
			symbol_43.getOwnedAttributes().add(symbol_44);
		}
		{ // pivot.ecore::pivot::Comment::annotatedElement
			symbol_45.setName("annotatedElement");
			symbol_45.setType(symbol_60);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_45.setLower(BigInteger.valueOf(0));
			symbol_45.setUpper(BigInteger.valueOf(-1));
			
			symbol_45.setIsResolveProxies(true);
			symbol_45.setOpposite(symbol_62);
			symbol_43.getOwnedAttributes().add(symbol_45);
		}
		{ // pivot.ecore::pivot::Comment::body
			symbol_46.setName("body");
			symbol_46.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_46.setLower(BigInteger.valueOf(0));
			
			symbol_46.setIsResolveProxies(true);
			symbol_43.getOwnedAttributes().add(symbol_46);
		}
		symbol_1.getOwnedTypes().add(symbol_43); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
		//
		// pivot.ecore::pivot::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
		//
		symbol_47.setName("Constraint");
		symbol_47.getSuperClasses().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::Constraint::NamedElement
			symbol_48.setName("NamedElement");
			symbol_48.setType(symbol_128);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
			symbol_48.setLower(BigInteger.valueOf(0));
			
			symbol_48.setImplicit(true);
			symbol_48.setIsResolveProxies(true);
			symbol_48.setOpposite(symbol_133);
			symbol_47.getOwnedAttributes().add(symbol_48);
		}
		{ // pivot.ecore::pivot::Constraint::constrainedElement
			symbol_49.setName("constrainedElement");
			symbol_49.setType(symbol_60);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_49.setLower(BigInteger.valueOf(0));
			symbol_49.setUpper(BigInteger.valueOf(-1));
			symbol_49.setIsOrdered(true);
			
			symbol_49.setIsResolveProxies(true);
			symbol_49.setOpposite(symbol_63);
			symbol_47.getOwnedAttributes().add(symbol_49);
		}
		{ // pivot.ecore::pivot::Constraint::context
			symbol_50.setName("context");
			symbol_50.setType(symbol_128);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
			symbol_50.setLower(BigInteger.valueOf(0));
			
			symbol_50.setIsResolveProxies(true);
			symbol_50.setOpposite(symbol_129);
			symbol_47.getOwnedAttributes().add(symbol_50);
		}
		{ // pivot.ecore::pivot::Constraint::isCallable
			symbol_51.setName("isCallable");
			symbol_51.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_51.setIsResolveProxies(true);
			symbol_47.getOwnedAttributes().add(symbol_51);
		}
		{ // pivot.ecore::pivot::Constraint::specification
			symbol_52.setName("specification");
			symbol_52.setType(symbol_304);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
			
			symbol_52.setIsComposite(true);
			symbol_52.setIsResolveProxies(true);
			symbol_52.setOpposite(symbol_305);
			symbol_47.getOwnedAttributes().add(symbol_52);
		}
		{ // pivot.ecore::pivot::Constraint::stereotype
			symbol_53.setName("stereotype");
			symbol_53.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_53.setLower(BigInteger.valueOf(0));
			
			symbol_53.setIsResolveProxies(true);
			symbol_47.getOwnedAttributes().add(symbol_53);
		}
		symbol_1.getOwnedTypes().add(symbol_47); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
		//
		// pivot.ecore::pivot::DataType http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		//
		symbol_54.setName("DataType");
		symbol_54.getSuperClasses().add(symbol_25); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		{ // pivot.ecore::pivot::DataType::behavioralType
			symbol_55.setName("behavioralType");
			symbol_55.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_55.setLower(BigInteger.valueOf(0));
			
			symbol_55.setIsResolveProxies(true);
			symbol_55.setOpposite(symbol_276);
			symbol_54.getOwnedAttributes().add(symbol_55);
		}
		{ // pivot.ecore::pivot::DataType::isSerializable
			symbol_56.setName("isSerializable");
			symbol_56.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_56.setIsResolveProxies(true);
			symbol_54.getOwnedAttributes().add(symbol_56);
		}
		symbol_1.getOwnedTypes().add(symbol_54); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		//
		// pivot.ecore::pivot::Detail http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
		//
		symbol_57.setName("Detail");
		symbol_57.getSuperClasses().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::Detail::Annotation
			symbol_58.setName("Annotation");
			symbol_58.setType(symbol_2);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
			symbol_58.setLower(BigInteger.valueOf(0));
			
			symbol_58.setImplicit(true);
			symbol_58.setIsResolveProxies(true);
			symbol_58.setOpposite(symbol_5);
			symbol_57.getOwnedAttributes().add(symbol_58);
		}
		{ // pivot.ecore::pivot::Detail::value
			symbol_59.setName("value");
			symbol_59.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_59.setUpper(BigInteger.valueOf(-1));
			
			symbol_59.setIsResolveProxies(true);
			symbol_57.getOwnedAttributes().add(symbol_59);
		}
		symbol_1.getOwnedTypes().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
		//
		// pivot.ecore::pivot::Element http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		//
		symbol_60.setName("Element");
		symbol_60.getSuperClasses().add(symbol_319); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		{ // pivot.ecore::pivot::Element::Annotation
			symbol_61.setName("Annotation");
			symbol_61.setType(symbol_2);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
			symbol_61.setLower(BigInteger.valueOf(0));
			symbol_61.setUpper(BigInteger.valueOf(-1));
			
			symbol_61.setImplicit(true);
			symbol_61.setIsResolveProxies(true);
			symbol_60.getOwnedAttributes().add(symbol_61);
		}
		{ // pivot.ecore::pivot::Element::Comment
			symbol_62.setName("Comment");
			symbol_62.setType(symbol_43);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
			symbol_62.setLower(BigInteger.valueOf(0));
			symbol_62.setUpper(BigInteger.valueOf(-1));
			
			symbol_62.setImplicit(true);
			symbol_62.setIsResolveProxies(true);
			symbol_62.setOpposite(symbol_45);
			symbol_60.getOwnedAttributes().add(symbol_62);
		}
		{ // pivot.ecore::pivot::Element::Constraint
			symbol_63.setName("Constraint");
			symbol_63.setType(symbol_47);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_63.setLower(BigInteger.valueOf(0));
			symbol_63.setUpper(BigInteger.valueOf(-1));
			
			symbol_63.setImplicit(true);
			symbol_63.setIsResolveProxies(true);
			symbol_63.setOpposite(symbol_49);
			symbol_60.getOwnedAttributes().add(symbol_63);
		}
		{ // pivot.ecore::pivot::Element::ownedComment
			symbol_64.setName("ownedComment");
			symbol_64.setType(symbol_43);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
			symbol_64.setLower(BigInteger.valueOf(0));
			symbol_64.setUpper(BigInteger.valueOf(-1));
			
			symbol_64.setIsComposite(true);
			symbol_64.setIsResolveProxies(true);
			symbol_64.setOpposite(symbol_44);
			symbol_60.getOwnedAttributes().add(symbol_64);
		}
		symbol_1.getOwnedTypes().add(symbol_60); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		//
		// pivot.ecore::pivot::EnumLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
		//
		symbol_65.setName("EnumLiteralExp");
		symbol_65.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		{ // pivot.ecore::pivot::EnumLiteralExp::referredEnumLiteral
			symbol_66.setName("referredEnumLiteral");
			symbol_66.setType(symbol_69);  // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
			symbol_66.setLower(BigInteger.valueOf(0));
			
			symbol_66.setIsResolveProxies(true);
			symbol_66.setOpposite(symbol_70);
			symbol_65.getOwnedAttributes().add(symbol_66);
		}
		symbol_1.getOwnedTypes().add(symbol_65); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
		//
		// pivot.ecore::pivot::Enumeration http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
		//
		symbol_67.setName("Enumeration");
		symbol_67.getSuperClasses().add(symbol_54); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // pivot.ecore::pivot::Enumeration::ownedLiteral
			symbol_68.setName("ownedLiteral");
			symbol_68.setType(symbol_69);  // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
			symbol_68.setLower(BigInteger.valueOf(0));
			symbol_68.setUpper(BigInteger.valueOf(-1));
			symbol_68.setIsOrdered(true);
			
			symbol_68.setIsComposite(true);
			symbol_68.setIsResolveProxies(true);
			symbol_68.setOpposite(symbol_71);
			symbol_67.getOwnedAttributes().add(symbol_68);
		}
		symbol_1.getOwnedTypes().add(symbol_67); // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
		//
		// pivot.ecore::pivot::EnumerationLiteral http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
		//
		symbol_69.setName("EnumerationLiteral");
		symbol_69.getSuperClasses().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::EnumerationLiteral::EnumLiteralExp
			symbol_70.setName("EnumLiteralExp");
			symbol_70.setType(symbol_65);  // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
			symbol_70.setLower(BigInteger.valueOf(0));
			symbol_70.setUpper(BigInteger.valueOf(-1));
			
			symbol_70.setImplicit(true);
			symbol_70.setIsResolveProxies(true);
			symbol_70.setOpposite(symbol_66);
			symbol_69.getOwnedAttributes().add(symbol_70);
		}
		{ // pivot.ecore::pivot::EnumerationLiteral::enumeration
			symbol_71.setName("enumeration");
			symbol_71.setType(symbol_67);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
			symbol_71.setLower(BigInteger.valueOf(0));
			
			symbol_71.setIsResolveProxies(true);
			symbol_71.setOpposite(symbol_68);
			symbol_69.getOwnedAttributes().add(symbol_71);
		}
		{ // pivot.ecore::pivot::EnumerationLiteral::value
			symbol_72.setName("value");
			symbol_72.setType(symbol_89);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			symbol_72.setLower(BigInteger.valueOf(0));
			
			symbol_72.setIsResolveProxies(true);
			symbol_69.getOwnedAttributes().add(symbol_72);
		}
		symbol_1.getOwnedTypes().add(symbol_69); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
		//
		// pivot.ecore::pivot::ExpressionInOcl http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
		//
		symbol_73.setName("ExpressionInOcl");
		symbol_73.getSuperClasses().add(symbol_154); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		{ // pivot.ecore::pivot::ExpressionInOcl::bodyExpression
			symbol_74.setName("bodyExpression");
			symbol_74.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_74.setIsComposite(true);
			symbol_74.setIsResolveProxies(true);
			symbol_74.setOpposite(symbol_145);
			symbol_73.getOwnedAttributes().add(symbol_74);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::contextVariable
			symbol_75.setName("contextVariable");
			symbol_75.setType(symbol_306);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_75.setLower(BigInteger.valueOf(0));
			
			symbol_75.setIsComposite(true);
			symbol_75.setIsResolveProxies(true);
			symbol_75.setOpposite(symbol_307);
			symbol_73.getOwnedAttributes().add(symbol_75);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::messageExpression
			symbol_76.setName("messageExpression");
			symbol_76.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_76.setLower(BigInteger.valueOf(0));
			
			symbol_76.setIsComposite(true);
			symbol_76.setIsResolveProxies(true);
			symbol_73.getOwnedAttributes().add(symbol_76);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::parameterVariable
			symbol_77.setName("parameterVariable");
			symbol_77.setType(symbol_306);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_77.setLower(BigInteger.valueOf(0));
			symbol_77.setUpper(BigInteger.valueOf(-1));
			symbol_77.setIsOrdered(true);
			
			symbol_77.setIsComposite(true);
			symbol_77.setIsResolveProxies(true);
			symbol_73.getOwnedAttributes().add(symbol_77);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::resultVariable
			symbol_78.setName("resultVariable");
			symbol_78.setType(symbol_306);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_78.setLower(BigInteger.valueOf(0));
			
			symbol_78.setIsComposite(true);
			symbol_78.setIsResolveProxies(true);
			symbol_73.getOwnedAttributes().add(symbol_78);
		}
		symbol_1.getOwnedTypes().add(symbol_73); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
		//
		// pivot.ecore::pivot::Feature http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		//
		symbol_79.setName("Feature");
		symbol_79.getSuperClasses().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		{ // pivot.ecore::pivot::Feature::implementation
			symbol_80.setName("implementation");
			symbol_80.setType(symbol_24);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallableImplementation
			symbol_80.setLower(BigInteger.valueOf(0));
			
			symbol_80.setIsResolveProxies(true);
			symbol_80.setIsTransient(true);
			symbol_79.getOwnedAttributes().add(symbol_80);
		}
		{ // pivot.ecore::pivot::Feature::implementationClass
			symbol_81.setName("implementationClass");
			symbol_81.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_81.setLower(BigInteger.valueOf(0));
			
			symbol_81.setIsResolveProxies(true);
			symbol_79.getOwnedAttributes().add(symbol_81);
		}
		symbol_1.getOwnedTypes().add(symbol_79); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		//
		// pivot.ecore::pivot::FeatureCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		//
		symbol_82.setName("FeatureCallExp");
		symbol_82.getSuperClasses().add(symbol_18); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		{ // pivot.ecore::pivot::FeatureCallExp::isPre
			symbol_83.setName("isPre");
			symbol_83.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_83.setIsResolveProxies(true);
			symbol_82.getOwnedAttributes().add(symbol_83);
		}
		symbol_1.getOwnedTypes().add(symbol_82); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		//
		// pivot.ecore::pivot::IfExp http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
		//
		symbol_84.setName("IfExp");
		symbol_84.getSuperClasses().add(symbol_141); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::IfExp::condition
			symbol_85.setName("condition");
			symbol_85.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_85.setIsComposite(true);
			symbol_85.setIsResolveProxies(true);
			symbol_85.setOpposite(symbol_146);
			symbol_84.getOwnedAttributes().add(symbol_85);
		}
		{ // pivot.ecore::pivot::IfExp::elseExpression
			symbol_86.setName("elseExpression");
			symbol_86.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_86.setIsComposite(true);
			symbol_86.setIsResolveProxies(true);
			symbol_84.getOwnedAttributes().add(symbol_86);
		}
		{ // pivot.ecore::pivot::IfExp::thenExpression
			symbol_87.setName("thenExpression");
			symbol_87.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_87.setIsComposite(true);
			symbol_87.setIsResolveProxies(true);
			symbol_84.getOwnedAttributes().add(symbol_87);
		}
		symbol_1.getOwnedTypes().add(symbol_84); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
		//
		// pivot.ecore::pivot::Int http://www.eclipse.org/ocl/3.1.0/Pivot!Int
		//
		symbol_88.setName("Int");
		symbol_88.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_88); // http://www.eclipse.org/ocl/3.1.0/Pivot!Int
		//
		// pivot.ecore::pivot::IntegerLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp
		//
		symbol_90.setName("IntegerLiteralExp");
		symbol_90.getSuperClasses().add(symbol_139); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		{ // pivot.ecore::pivot::IntegerLiteralExp::integerSymbol
			symbol_91.setName("integerSymbol");
			symbol_91.setType(symbol_89);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_91.setIsResolveProxies(true);
			symbol_90.getOwnedAttributes().add(symbol_91);
		}
		symbol_1.getOwnedTypes().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp
		//
		// pivot.ecore::pivot::InvalidLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidLiteralExp
		//
		symbol_92.setName("InvalidLiteralExp");
		symbol_92.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		symbol_1.getOwnedTypes().add(symbol_92); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidLiteralExp
		//
		// pivot.ecore::pivot::InvalidType http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidType
		//
		symbol_93.setName("InvalidType");
		symbol_93.getSuperClasses().add(symbol_25); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		symbol_1.getOwnedTypes().add(symbol_93); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidType
		//
		// pivot.ecore::pivot::IterateExp http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
		//
		symbol_94.setName("IterateExp");
		symbol_94.getSuperClasses().add(symbol_110); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		{ // pivot.ecore::pivot::IterateExp::result
			symbol_95.setName("result");
			symbol_95.setType(symbol_306);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_95.setLower(BigInteger.valueOf(0));
			symbol_95.setIsOrdered(true);
			
			symbol_95.setIsComposite(true);
			symbol_95.setIsResolveProxies(true);
			symbol_95.setOpposite(symbol_308);
			symbol_94.getOwnedAttributes().add(symbol_95);
		}
		symbol_1.getOwnedTypes().add(symbol_94); // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
		//
		// pivot.ecore::pivot::Iteration http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
		//
		symbol_96.setName("Iteration");
		symbol_96.getSuperClasses().add(symbol_159); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		{ // pivot.ecore::pivot::Iteration::LoopExp
			symbol_97.setName("LoopExp");
			symbol_97.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
			symbol_97.setLower(BigInteger.valueOf(0));
			symbol_97.setUpper(BigInteger.valueOf(-1));
			
			symbol_97.setImplicit(true);
			symbol_97.setIsResolveProxies(true);
			symbol_97.setOpposite(symbol_113);
			symbol_96.getOwnedAttributes().add(symbol_97);
		}
		{ // pivot.ecore::pivot::Iteration::ownedAccumulator
			symbol_98.setName("ownedAccumulator");
			symbol_98.setType(symbol_181);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_98.setLower(BigInteger.valueOf(0));
			symbol_98.setUpper(BigInteger.valueOf(-1));
			
			symbol_98.setIsComposite(true);
			symbol_98.setIsResolveProxies(true);
			symbol_96.getOwnedAttributes().add(symbol_98);
		}
		{ // pivot.ecore::pivot::Iteration::ownedIterator
			symbol_99.setName("ownedIterator");
			symbol_99.setType(symbol_181);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_99.setLower(BigInteger.valueOf(0));
			symbol_99.setUpper(BigInteger.valueOf(-1));
			
			symbol_99.setIsComposite(true);
			symbol_99.setIsResolveProxies(true);
			symbol_99.setOpposite(symbol_182);
			symbol_96.getOwnedAttributes().add(symbol_99);
		}
		symbol_1.getOwnedTypes().add(symbol_96); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
		//
		// pivot.ecore::pivot::IteratorExp http://www.eclipse.org/ocl/3.1.0/Pivot!IteratorExp
		//
		symbol_100.setName("IteratorExp");
		symbol_100.getSuperClasses().add(symbol_110); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		symbol_1.getOwnedTypes().add(symbol_100); // http://www.eclipse.org/ocl/3.1.0/Pivot!IteratorExp
		//
		// pivot.ecore::pivot::LambdaType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
		//
		symbol_101.setName("LambdaType");
		symbol_101.getSuperClasses().add(symbol_54); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // pivot.ecore::pivot::LambdaType::contextType
			symbol_102.setName("contextType");
			symbol_102.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_102.setIsResolveProxies(true);
			symbol_101.getOwnedAttributes().add(symbol_102);
		}
		{ // pivot.ecore::pivot::LambdaType::parameterType
			symbol_103.setName("parameterType");
			symbol_103.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_103.setLower(BigInteger.valueOf(0));
			symbol_103.setUpper(BigInteger.valueOf(-1));
			
			symbol_103.setIsResolveProxies(true);
			symbol_101.getOwnedAttributes().add(symbol_103);
		}
		{ // pivot.ecore::pivot::LambdaType::resultType
			symbol_104.setName("resultType");
			symbol_104.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_104.setIsResolveProxies(true);
			symbol_104.setOpposite(symbol_277);
			symbol_101.getOwnedAttributes().add(symbol_104);
		}
		symbol_1.getOwnedTypes().add(symbol_101); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
		//
		// pivot.ecore::pivot::LetExp http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
		//
		symbol_105.setName("LetExp");
		symbol_105.getSuperClasses().add(symbol_141); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::LetExp::in
			symbol_106.setName("in");
			symbol_106.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_106.setIsComposite(true);
			symbol_106.setIsResolveProxies(true);
			symbol_106.setOpposite(symbol_147);
			symbol_105.getOwnedAttributes().add(symbol_106);
		}
		{ // pivot.ecore::pivot::LetExp::variable
			symbol_107.setName("variable");
			symbol_107.setType(symbol_306);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			
			symbol_107.setIsComposite(true);
			symbol_107.setIsResolveProxies(true);
			symbol_107.setOpposite(symbol_309);
			symbol_105.getOwnedAttributes().add(symbol_107);
		}
		symbol_1.getOwnedTypes().add(symbol_105); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
		//
		// pivot.ecore::pivot::Library http://www.eclipse.org/ocl/3.1.0/Pivot!Library
		//
		symbol_108.setName("Library");
		symbol_108.getSuperClasses().add(symbol_173); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		symbol_1.getOwnedTypes().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/Pivot!Library
		//
		// pivot.ecore::pivot::LiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		//
		symbol_109.setName("LiteralExp");
		symbol_109.getSuperClasses().add(symbol_141); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		symbol_1.getOwnedTypes().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		//
		// pivot.ecore::pivot::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		//
		symbol_110.setName("LoopExp");
		symbol_110.getSuperClasses().add(symbol_18); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		{ // pivot.ecore::pivot::LoopExp::body
			symbol_111.setName("body");
			symbol_111.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_111.setIsComposite(true);
			symbol_111.setIsResolveProxies(true);
			symbol_111.setOpposite(symbol_148);
			symbol_110.getOwnedAttributes().add(symbol_111);
		}
		{ // pivot.ecore::pivot::LoopExp::iterator
			symbol_112.setName("iterator");
			symbol_112.setType(symbol_306);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_112.setLower(BigInteger.valueOf(0));
			symbol_112.setUpper(BigInteger.valueOf(-1));
			symbol_112.setIsOrdered(true);
			
			symbol_112.setIsComposite(true);
			symbol_112.setIsResolveProxies(true);
			symbol_112.setOpposite(symbol_310);
			symbol_110.getOwnedAttributes().add(symbol_112);
		}
		{ // pivot.ecore::pivot::LoopExp::referredIteration
			symbol_113.setName("referredIteration");
			symbol_113.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
			symbol_113.setLower(BigInteger.valueOf(0));
			
			symbol_113.setIsResolveProxies(true);
			symbol_113.setOpposite(symbol_97);
			symbol_110.getOwnedAttributes().add(symbol_113);
		}
		symbol_1.getOwnedTypes().add(symbol_110); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		//
		// pivot.ecore::pivot::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
		//
		symbol_114.setName("MessageExp");
		symbol_114.getSuperClasses().add(symbol_141); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::MessageExp::argument
			symbol_115.setName("argument");
			symbol_115.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_115.setLower(BigInteger.valueOf(0));
			symbol_115.setUpper(BigInteger.valueOf(-1));
			symbol_115.setIsOrdered(true);
			
			symbol_115.setIsComposite(true);
			symbol_115.setIsResolveProxies(true);
			symbol_115.setOpposite(symbol_149);
			symbol_114.getOwnedAttributes().add(symbol_115);
		}
		{ // pivot.ecore::pivot::MessageExp::calledOperation
			symbol_116.setName("calledOperation");
			symbol_116.setType(symbol_21);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
			symbol_116.setLower(BigInteger.valueOf(0));
			
			symbol_116.setIsComposite(true);
			symbol_116.setIsResolveProxies(true);
			symbol_116.setOpposite(symbol_22);
			symbol_114.getOwnedAttributes().add(symbol_116);
		}
		{ // pivot.ecore::pivot::MessageExp::sentSignal
			symbol_117.setName("sentSignal");
			symbol_117.setType(symbol_223);  // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
			symbol_117.setLower(BigInteger.valueOf(0));
			
			symbol_117.setIsComposite(true);
			symbol_117.setIsResolveProxies(true);
			symbol_117.setOpposite(symbol_224);
			symbol_114.getOwnedAttributes().add(symbol_117);
		}
		{ // pivot.ecore::pivot::MessageExp::target
			symbol_118.setName("target");
			symbol_118.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_118.setIsComposite(true);
			symbol_118.setIsResolveProxies(true);
			symbol_114.getOwnedAttributes().add(symbol_118);
		}
		symbol_1.getOwnedTypes().add(symbol_114); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
		//
		// pivot.ecore::pivot::MessageType http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
		//
		symbol_119.setName("MessageType");
		symbol_119.getSuperClasses().add(symbol_273); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		{ // pivot.ecore::pivot::MessageType::referredOperation
			symbol_120.setName("referredOperation");
			symbol_120.setType(symbol_159);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_120.setLower(BigInteger.valueOf(0));
			
			symbol_120.setIsResolveProxies(true);
			symbol_120.setOpposite(symbol_161);
			symbol_119.getOwnedAttributes().add(symbol_120);
		}
		{ // pivot.ecore::pivot::MessageType::referredSignal
			symbol_121.setName("referredSignal");
			symbol_121.setType(symbol_228);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
			symbol_121.setLower(BigInteger.valueOf(0));
			
			symbol_121.setIsResolveProxies(true);
			symbol_121.setOpposite(symbol_229);
			symbol_119.getOwnedAttributes().add(symbol_121);
		}
		symbol_1.getOwnedTypes().add(symbol_119); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
		//
		// pivot.ecore::pivot::MultiplicityElement http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		//
		symbol_122.setName("MultiplicityElement");
		symbol_122.getSuperClasses().add(symbol_60); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::MultiplicityElement::isOrdered
			symbol_123.setName("isOrdered");
			symbol_123.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_123.setIsResolveProxies(true);
			symbol_122.getOwnedAttributes().add(symbol_123);
		}
		{ // pivot.ecore::pivot::MultiplicityElement::isUnique
			symbol_124.setName("isUnique");
			symbol_124.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_124.setIsResolveProxies(true);
			symbol_122.getOwnedAttributes().add(symbol_124);
		}
		{ // pivot.ecore::pivot::MultiplicityElement::lower
			symbol_125.setName("lower");
			symbol_125.setType(symbol_89);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			symbol_125.setLower(BigInteger.valueOf(0));
			
			symbol_125.setIsResolveProxies(true);
			symbol_122.getOwnedAttributes().add(symbol_125);
		}
		{ // pivot.ecore::pivot::MultiplicityElement::upper
			symbol_126.setName("upper");
			symbol_126.setType(symbol_297);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			symbol_126.setLower(BigInteger.valueOf(0));
			
			symbol_126.setIsResolveProxies(true);
			symbol_122.getOwnedAttributes().add(symbol_126);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::includesCardinality()
			Operation symbol_334 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesCardinality(http://www.eclipse.org/ocl/3.1.0/Pivot!Integer)
			symbol_334.setName("includesCardinality");
			symbol_334.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_335 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesCardinality(http://www.eclipse.org/ocl/3.1.0/Pivot!Integer)!C
			symbol_335.setName("C");
			symbol_335.setType(symbol_89);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_334.getOwnedParameters().add(symbol_335);
			symbol_122.getOwnedOperations().add(symbol_334);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::includesMultiplicity()
			Operation symbol_336 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesMultiplicity(http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement)
			symbol_336.setName("includesMultiplicity");
			symbol_336.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_337 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesMultiplicity(http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement)!M
			symbol_337.setName("M");
			symbol_337.setType(symbol_122);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
			
			symbol_336.getOwnedParameters().add(symbol_337);
			symbol_122.getOwnedOperations().add(symbol_336);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::isMultivalued()
			Operation symbol_338 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isMultivalued()
			symbol_338.setName("isMultivalued");
			symbol_338.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_122.getOwnedOperations().add(symbol_338);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::lowerBound()
			Operation symbol_339 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!lowerBound()
			symbol_339.setName("lowerBound");
			symbol_339.setType(symbol_89);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_122.getOwnedOperations().add(symbol_339);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::upperBound()
			Operation symbol_340 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!upperBound()
			symbol_340.setName("upperBound");
			symbol_340.setType(symbol_297);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			
			symbol_122.getOwnedOperations().add(symbol_340);
		}
		symbol_1.getOwnedTypes().add(symbol_122); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		//
		// pivot.ecore::pivot::Nameable http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		//
		symbol_127.setName("Nameable");
		symbol_127.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		//
		// pivot.ecore::pivot::NamedElement http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		//
		symbol_128.setName("NamedElement");
		symbol_128.getSuperClasses().add(symbol_60); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		symbol_128.getSuperClasses().add(symbol_127); // http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		{ // pivot.ecore::pivot::NamedElement::Constraint
			symbol_129.setName("Constraint");
			symbol_129.setType(symbol_47);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_129.setLower(BigInteger.valueOf(0));
			symbol_129.setUpper(BigInteger.valueOf(-1));
			
			symbol_129.setImplicit(true);
			symbol_129.setIsResolveProxies(true);
			symbol_129.setOpposite(symbol_50);
			symbol_128.getOwnedAttributes().add(symbol_129);
		}
		{ // pivot.ecore::pivot::NamedElement::isStatic
			symbol_130.setName("isStatic");
			symbol_130.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_130.setIsResolveProxies(true);
			symbol_128.getOwnedAttributes().add(symbol_130);
		}
		{ // pivot.ecore::pivot::NamedElement::name
			symbol_131.setName("name");
			symbol_131.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_131.setLower(BigInteger.valueOf(0));
			
			symbol_131.setIsResolveProxies(true);
			symbol_128.getOwnedAttributes().add(symbol_131);
		}
		{ // pivot.ecore::pivot::NamedElement::ownedAnnotation
			symbol_132.setName("ownedAnnotation");
			symbol_132.setType(symbol_2);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
			symbol_132.setLower(BigInteger.valueOf(0));
			symbol_132.setUpper(BigInteger.valueOf(-1));
			symbol_132.setIsOrdered(true);
			
			symbol_132.setIsComposite(true);
			symbol_132.setIsResolveProxies(true);
			symbol_132.setOpposite(symbol_3);
			symbol_128.getOwnedAttributes().add(symbol_132);
		}
		{ // pivot.ecore::pivot::NamedElement::ownedRule
			symbol_133.setName("ownedRule");
			symbol_133.setType(symbol_47);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_133.setLower(BigInteger.valueOf(0));
			symbol_133.setUpper(BigInteger.valueOf(-1));
			symbol_133.setIsOrdered(true);
			
			symbol_133.setIsComposite(true);
			symbol_133.setIsResolveProxies(true);
			symbol_133.setOpposite(symbol_48);
			symbol_128.getOwnedAttributes().add(symbol_133);
		}
		symbol_1.getOwnedTypes().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		//
		// pivot.ecore::pivot::Namespace http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		//
		symbol_134.setName("Namespace");
		symbol_134.getSuperClasses().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		symbol_1.getOwnedTypes().add(symbol_134); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		//
		// pivot.ecore::pivot::NavigationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		//
		symbol_135.setName("NavigationCallExp");
		symbol_135.getSuperClasses().add(symbol_82); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		{ // pivot.ecore::pivot::NavigationCallExp::navigationSource
			symbol_136.setName("navigationSource");
			symbol_136.setType(symbol_198);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_136.setLower(BigInteger.valueOf(0));
			symbol_136.setIsOrdered(true);
			
			symbol_136.setIsResolveProxies(true);
			symbol_136.setOpposite(symbol_199);
			symbol_135.getOwnedAttributes().add(symbol_136);
		}
		{ // pivot.ecore::pivot::NavigationCallExp::qualifier
			symbol_137.setName("qualifier");
			symbol_137.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_137.setLower(BigInteger.valueOf(0));
			symbol_137.setUpper(BigInteger.valueOf(-1));
			symbol_137.setIsOrdered(true);
			
			symbol_137.setIsResolveProxies(true);
			symbol_137.setOpposite(symbol_150);
			symbol_135.getOwnedAttributes().add(symbol_137);
		}
		symbol_1.getOwnedTypes().add(symbol_135); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		//
		// pivot.ecore::pivot::NullLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!NullLiteralExp
		//
		symbol_138.setName("NullLiteralExp");
		symbol_138.getSuperClasses().add(symbol_196); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		symbol_1.getOwnedTypes().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!NullLiteralExp
		//
		// pivot.ecore::pivot::NumericLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		//
		symbol_139.setName("NumericLiteralExp");
		symbol_139.getSuperClasses().add(symbol_196); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		symbol_1.getOwnedTypes().add(symbol_139); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		//
		// pivot.ecore::pivot::Object http://www.eclipse.org/ocl/3.1.0/Pivot!Object
		//
		symbol_140.setName("Object");
		symbol_140.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_140); // http://www.eclipse.org/ocl/3.1.0/Pivot!Object
		//
		// pivot.ecore::pivot::OclExpression http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		//
		symbol_141.setName("OclExpression");
		symbol_141.getSuperClasses().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		{ // pivot.ecore::pivot::OclExpression::CallExp
			symbol_142.setName("CallExp");
			symbol_142.setType(symbol_18);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
			symbol_142.setLower(BigInteger.valueOf(0));
			
			symbol_142.setImplicit(true);
			symbol_142.setIsResolveProxies(true);
			symbol_142.setOpposite(symbol_20);
			symbol_141.getOwnedAttributes().add(symbol_142);
		}
		{ // pivot.ecore::pivot::OclExpression::CollectionItem
			symbol_143.setName("CollectionItem");
			symbol_143.setType(symbol_30);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
			symbol_143.setLower(BigInteger.valueOf(0));
			
			symbol_143.setImplicit(true);
			symbol_143.setIsResolveProxies(true);
			symbol_143.setOpposite(symbol_31);
			symbol_141.getOwnedAttributes().add(symbol_143);
		}
		{ // pivot.ecore::pivot::OclExpression::CollectionRange
			symbol_144.setName("CollectionRange");
			symbol_144.setType(symbol_38);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
			symbol_144.setLower(BigInteger.valueOf(0));
			symbol_144.setUpper(BigInteger.valueOf(-1));
			
			symbol_144.setImplicit(true);
			symbol_144.setIsResolveProxies(true);
			symbol_141.getOwnedAttributes().add(symbol_144);
		}
		{ // pivot.ecore::pivot::OclExpression::ExpressionInOcl
			symbol_145.setName("ExpressionInOcl");
			symbol_145.setType(symbol_73);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
			symbol_145.setLower(BigInteger.valueOf(0));
			symbol_145.setUpper(BigInteger.valueOf(-1));
			
			symbol_145.setImplicit(true);
			symbol_145.setIsResolveProxies(true);
			symbol_141.getOwnedAttributes().add(symbol_145);
		}
		{ // pivot.ecore::pivot::OclExpression::IfExp
			symbol_146.setName("IfExp");
			symbol_146.setType(symbol_84);  // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
			symbol_146.setLower(BigInteger.valueOf(0));
			symbol_146.setUpper(BigInteger.valueOf(-1));
			
			symbol_146.setImplicit(true);
			symbol_146.setIsResolveProxies(true);
			symbol_141.getOwnedAttributes().add(symbol_146);
		}
		{ // pivot.ecore::pivot::OclExpression::LetExp
			symbol_147.setName("LetExp");
			symbol_147.setType(symbol_105);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
			symbol_147.setLower(BigInteger.valueOf(0));
			
			symbol_147.setImplicit(true);
			symbol_147.setIsResolveProxies(true);
			symbol_147.setOpposite(symbol_106);
			symbol_141.getOwnedAttributes().add(symbol_147);
		}
		{ // pivot.ecore::pivot::OclExpression::LoopExp
			symbol_148.setName("LoopExp");
			symbol_148.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
			symbol_148.setLower(BigInteger.valueOf(0));
			
			symbol_148.setImplicit(true);
			symbol_148.setIsResolveProxies(true);
			symbol_148.setOpposite(symbol_111);
			symbol_141.getOwnedAttributes().add(symbol_148);
		}
		{ // pivot.ecore::pivot::OclExpression::MessageExp
			symbol_149.setName("MessageExp");
			symbol_149.setType(symbol_114);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
			symbol_149.setLower(BigInteger.valueOf(0));
			symbol_149.setUpper(BigInteger.valueOf(-1));
			
			symbol_149.setImplicit(true);
			symbol_149.setIsResolveProxies(true);
			symbol_141.getOwnedAttributes().add(symbol_149);
		}
		{ // pivot.ecore::pivot::OclExpression::NavigationCallExp
			symbol_150.setName("NavigationCallExp");
			symbol_150.setType(symbol_135);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
			symbol_150.setLower(BigInteger.valueOf(0));
			symbol_150.setUpper(BigInteger.valueOf(-1));
			
			symbol_150.setImplicit(true);
			symbol_150.setIsResolveProxies(true);
			symbol_150.setOpposite(symbol_137);
			symbol_141.getOwnedAttributes().add(symbol_150);
		}
		{ // pivot.ecore::pivot::OclExpression::OperationCallExp
			symbol_151.setName("OperationCallExp");
			symbol_151.setType(symbol_168);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
			symbol_151.setLower(BigInteger.valueOf(0));
			
			symbol_151.setImplicit(true);
			symbol_151.setIsResolveProxies(true);
			symbol_151.setOpposite(symbol_169);
			symbol_141.getOwnedAttributes().add(symbol_151);
		}
		{ // pivot.ecore::pivot::OclExpression::TupleLiteralPart
			symbol_152.setName("TupleLiteralPart");
			symbol_152.setType(symbol_269);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
			symbol_152.setLower(BigInteger.valueOf(0));
			
			symbol_152.setImplicit(true);
			symbol_152.setIsResolveProxies(true);
			symbol_152.setOpposite(symbol_271);
			symbol_141.getOwnedAttributes().add(symbol_152);
		}
		{ // pivot.ecore::pivot::OclExpression::Variable
			symbol_153.setName("Variable");
			symbol_153.setType(symbol_306);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_153.setLower(BigInteger.valueOf(0));
			
			symbol_153.setImplicit(true);
			symbol_153.setIsResolveProxies(true);
			symbol_153.setOpposite(symbol_312);
			symbol_141.getOwnedAttributes().add(symbol_153);
		}
		symbol_1.getOwnedTypes().add(symbol_141); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		//
		// pivot.ecore::pivot::OpaqueExpression http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		//
		symbol_154.setName("OpaqueExpression");
		symbol_154.getSuperClasses().add(symbol_304); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		{ // pivot.ecore::pivot::OpaqueExpression::body
			symbol_155.setName("body");
			symbol_155.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_155.setLower(BigInteger.valueOf(0));
			symbol_155.setUpper(BigInteger.valueOf(-1));
			symbol_155.setIsOrdered(true);
			symbol_155.setIsUnique(false);
			
			symbol_155.setIsResolveProxies(true);
			symbol_154.getOwnedAttributes().add(symbol_155);
		}
		{ // pivot.ecore::pivot::OpaqueExpression::language
			symbol_156.setName("language");
			symbol_156.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_156.setLower(BigInteger.valueOf(0));
			symbol_156.setUpper(BigInteger.valueOf(-1));
			symbol_156.setIsOrdered(true);
			
			symbol_156.setIsResolveProxies(true);
			symbol_154.getOwnedAttributes().add(symbol_156);
		}
		{ // pivot.ecore::pivot::OpaqueExpression::message
			symbol_157.setName("message");
			symbol_157.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_157.setLower(BigInteger.valueOf(0));
			symbol_157.setUpper(BigInteger.valueOf(-1));
			symbol_157.setIsOrdered(true);
			symbol_157.setIsUnique(false);
			
			symbol_157.setIsResolveProxies(true);
			symbol_154.getOwnedAttributes().add(symbol_157);
		}
		{ // pivot.ecore::pivot::OpaqueExpression::valueExpression
			symbol_158.setName("valueExpression");
			symbol_158.setType(symbol_73);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
			symbol_158.setLower(BigInteger.valueOf(0));
			
			symbol_158.setIsResolveProxies(true);
			symbol_158.setIsTransient(true);
			symbol_154.getOwnedAttributes().add(symbol_158);
		}
		symbol_1.getOwnedTypes().add(symbol_154); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		//
		// pivot.ecore::pivot::Operation http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		//
		symbol_159.setName("Operation");
		symbol_159.getSuperClasses().add(symbol_262); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		symbol_159.getSuperClasses().add(symbol_185); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		symbol_159.getSuperClasses().add(symbol_134); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		symbol_159.getSuperClasses().add(symbol_79); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		{ // pivot.ecore::pivot::Operation::CallOperationAction
			symbol_160.setName("CallOperationAction");
			symbol_160.setType(symbol_21);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
			symbol_160.setLower(BigInteger.valueOf(0));
			symbol_160.setUpper(BigInteger.valueOf(-1));
			
			symbol_160.setImplicit(true);
			symbol_160.setIsResolveProxies(true);
			symbol_160.setOpposite(symbol_23);
			symbol_159.getOwnedAttributes().add(symbol_160);
		}
		{ // pivot.ecore::pivot::Operation::MessageType
			symbol_161.setName("MessageType");
			symbol_161.setType(symbol_119);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
			symbol_161.setLower(BigInteger.valueOf(0));
			symbol_161.setUpper(BigInteger.valueOf(-1));
			
			symbol_161.setImplicit(true);
			symbol_161.setIsResolveProxies(true);
			symbol_161.setOpposite(symbol_120);
			symbol_159.getOwnedAttributes().add(symbol_161);
		}
		{ // pivot.ecore::pivot::Operation::OperationCallExp
			symbol_162.setName("OperationCallExp");
			symbol_162.setType(symbol_168);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
			symbol_162.setLower(BigInteger.valueOf(0));
			symbol_162.setUpper(BigInteger.valueOf(-1));
			
			symbol_162.setImplicit(true);
			symbol_162.setIsResolveProxies(true);
			symbol_162.setOpposite(symbol_170);
			symbol_159.getOwnedAttributes().add(symbol_162);
		}
		{ // pivot.ecore::pivot::Operation::class
			symbol_163.setName("class");
			symbol_163.setType(symbol_25);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
			symbol_163.setLower(BigInteger.valueOf(0));
			
			symbol_163.setIsReadOnly(true);
			symbol_163.setIsResolveProxies(true);
			symbol_163.setIsTransient(true);
			symbol_163.setIsVolatile(true);
			symbol_159.getOwnedAttributes().add(symbol_163);
		}
		{ // pivot.ecore::pivot::Operation::ownedParameter
			symbol_164.setName("ownedParameter");
			symbol_164.setType(symbol_181);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_164.setLower(BigInteger.valueOf(0));
			symbol_164.setUpper(BigInteger.valueOf(-1));
			symbol_164.setIsOrdered(true);
			
			symbol_164.setIsComposite(true);
			symbol_164.setIsResolveProxies(true);
			symbol_164.setOpposite(symbol_184);
			symbol_159.getOwnedAttributes().add(symbol_164);
		}
		{ // pivot.ecore::pivot::Operation::owningType
			symbol_165.setName("owningType");
			symbol_165.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_165.setLower(BigInteger.valueOf(0));
			
			symbol_165.setIsResolveProxies(true);
			symbol_165.setOpposite(symbol_286);
			symbol_159.getOwnedAttributes().add(symbol_165);
		}
		{ // pivot.ecore::pivot::Operation::precedence
			symbol_166.setName("precedence");
			symbol_166.setType(symbol_191);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
			symbol_166.setLower(BigInteger.valueOf(0));
			
			symbol_166.setIsResolveProxies(true);
			symbol_166.setOpposite(symbol_192);
			symbol_159.getOwnedAttributes().add(symbol_166);
		}
		{ // pivot.ecore::pivot::Operation::raisedException
			symbol_167.setName("raisedException");
			symbol_167.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_167.setLower(BigInteger.valueOf(0));
			symbol_167.setUpper(BigInteger.valueOf(-1));
			
			symbol_167.setIsResolveProxies(true);
			symbol_167.setOpposite(symbol_278);
			symbol_159.getOwnedAttributes().add(symbol_167);
		}
		symbol_1.getOwnedTypes().add(symbol_159); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		//
		// pivot.ecore::pivot::OperationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
		//
		symbol_168.setName("OperationCallExp");
		symbol_168.getSuperClasses().add(symbol_82); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		{ // pivot.ecore::pivot::OperationCallExp::argument
			symbol_169.setName("argument");
			symbol_169.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_169.setLower(BigInteger.valueOf(0));
			symbol_169.setUpper(BigInteger.valueOf(-1));
			symbol_169.setIsOrdered(true);
			
			symbol_169.setIsComposite(true);
			symbol_169.setIsResolveProxies(true);
			symbol_169.setOpposite(symbol_151);
			symbol_168.getOwnedAttributes().add(symbol_169);
		}
		{ // pivot.ecore::pivot::OperationCallExp::referredOperation
			symbol_170.setName("referredOperation");
			symbol_170.setType(symbol_159);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_170.setLower(BigInteger.valueOf(0));
			
			symbol_170.setIsResolveProxies(true);
			symbol_170.setOpposite(symbol_162);
			symbol_168.getOwnedAttributes().add(symbol_170);
		}
		symbol_1.getOwnedTypes().add(symbol_168); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
		//
		// pivot.ecore::pivot::OperationTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!OperationTemplateParameter
		//
		symbol_171.setName("OperationTemplateParameter");
		symbol_171.getSuperClasses().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		symbol_1.getOwnedTypes().add(symbol_171); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationTemplateParameter
		//
		// pivot.ecore::pivot::OrderedSetType http://www.eclipse.org/ocl/3.1.0/Pivot!OrderedSetType
		//
		symbol_172.setName("OrderedSetType");
		symbol_172.getSuperClasses().add(symbol_41); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		symbol_1.getOwnedTypes().add(symbol_172); // http://www.eclipse.org/ocl/3.1.0/Pivot!OrderedSetType
		//
		// pivot.ecore::pivot::Package http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		//
		symbol_173.setName("Package");
		symbol_173.getSuperClasses().add(symbol_262); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		symbol_173.getSuperClasses().add(symbol_134); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		{ // pivot.ecore::pivot::Package::nestedPackage
			symbol_174.setName("nestedPackage");
			symbol_174.setType(symbol_173);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_174.setLower(BigInteger.valueOf(0));
			symbol_174.setUpper(BigInteger.valueOf(-1));
			
			symbol_174.setIsComposite(true);
			symbol_174.setIsResolveProxies(true);
			symbol_174.setOpposite(symbol_175);
			symbol_173.getOwnedAttributes().add(symbol_174);
		}
		{ // pivot.ecore::pivot::Package::nestingPackage
			symbol_175.setName("nestingPackage");
			symbol_175.setType(symbol_173);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_175.setLower(BigInteger.valueOf(0));
			
			symbol_175.setIsResolveProxies(true);
			symbol_175.setOpposite(symbol_174);
			symbol_173.getOwnedAttributes().add(symbol_175);
		}
		{ // pivot.ecore::pivot::Package::nsPrefix
			symbol_176.setName("nsPrefix");
			symbol_176.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_176.setLower(BigInteger.valueOf(0));
			
			symbol_176.setIsResolveProxies(true);
			symbol_173.getOwnedAttributes().add(symbol_176);
		}
		{ // pivot.ecore::pivot::Package::nsURI
			symbol_177.setName("nsURI");
			symbol_177.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_177.setLower(BigInteger.valueOf(0));
			
			symbol_177.setIsResolveProxies(true);
			symbol_173.getOwnedAttributes().add(symbol_177);
		}
		{ // pivot.ecore::pivot::Package::ownedPrecedence
			symbol_178.setName("ownedPrecedence");
			symbol_178.setType(symbol_191);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
			symbol_178.setLower(BigInteger.valueOf(0));
			symbol_178.setUpper(BigInteger.valueOf(-1));
			symbol_178.setIsOrdered(true);
			
			symbol_178.setIsComposite(true);
			symbol_178.setIsResolveProxies(true);
			symbol_178.setOpposite(symbol_193);
			symbol_173.getOwnedAttributes().add(symbol_178);
		}
		{ // pivot.ecore::pivot::Package::ownedType
			symbol_179.setName("ownedType");
			symbol_179.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_179.setLower(BigInteger.valueOf(0));
			symbol_179.setUpper(BigInteger.valueOf(-1));
			
			symbol_179.setIsComposite(true);
			symbol_179.setIsResolveProxies(true);
			symbol_179.setOpposite(symbol_287);
			symbol_173.getOwnedAttributes().add(symbol_179);
		}
		symbol_1.getOwnedTypes().add(symbol_173); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		//
		// pivot.ecore::pivot::PackageableElement http://www.eclipse.org/ocl/3.1.0/Pivot!PackageableElement
		//
		symbol_180.setName("PackageableElement");
		symbol_180.getSuperClasses().add(symbol_185); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		symbol_1.getOwnedTypes().add(symbol_180); // http://www.eclipse.org/ocl/3.1.0/Pivot!PackageableElement
		//
		// pivot.ecore::pivot::Parameter http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
		//
		symbol_181.setName("Parameter");
		symbol_181.getSuperClasses().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		symbol_181.getSuperClasses().add(symbol_314); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		{ // pivot.ecore::pivot::Parameter::Iteration
			symbol_182.setName("Iteration");
			symbol_182.setType(symbol_96);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
			symbol_182.setLower(BigInteger.valueOf(0));
			symbol_182.setUpper(BigInteger.valueOf(-1));
			
			symbol_182.setImplicit(true);
			symbol_182.setIsResolveProxies(true);
			symbol_181.getOwnedAttributes().add(symbol_182);
		}
		{ // pivot.ecore::pivot::Parameter::Variable
			symbol_183.setName("Variable");
			symbol_183.setType(symbol_306);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_183.setLower(BigInteger.valueOf(0));
			symbol_183.setUpper(BigInteger.valueOf(-1));
			
			symbol_183.setImplicit(true);
			symbol_183.setIsResolveProxies(true);
			symbol_183.setOpposite(symbol_313);
			symbol_181.getOwnedAttributes().add(symbol_183);
		}
		{ // pivot.ecore::pivot::Parameter::operation
			symbol_184.setName("operation");
			symbol_184.setType(symbol_159);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_184.setLower(BigInteger.valueOf(0));
			
			symbol_184.setIsResolveProxies(true);
			symbol_184.setOpposite(symbol_164);
			symbol_181.getOwnedAttributes().add(symbol_184);
		}
		symbol_1.getOwnedTypes().add(symbol_181); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
		//
		// pivot.ecore::pivot::ParameterableElement http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		//
		symbol_185.setName("ParameterableElement");
		symbol_185.getSuperClasses().add(symbol_60); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::ParameterableElement::TemplateParameter
			symbol_186.setName("TemplateParameter");
			symbol_186.setType(symbol_242);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_186.setLower(BigInteger.valueOf(0));
			symbol_186.setUpper(BigInteger.valueOf(-1));
			
			symbol_186.setImplicit(true);
			symbol_186.setIsResolveProxies(true);
			symbol_185.getOwnedAttributes().add(symbol_186);
		}
		{ // pivot.ecore::pivot::ParameterableElement::TemplateParameterSubstitution
			symbol_187.setName("TemplateParameterSubstitution");
			symbol_187.setType(symbol_250);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
			symbol_187.setLower(BigInteger.valueOf(0));
			symbol_187.setUpper(BigInteger.valueOf(-1));
			
			symbol_187.setImplicit(true);
			symbol_187.setIsResolveProxies(true);
			symbol_185.getOwnedAttributes().add(symbol_187);
		}
		{ // pivot.ecore::pivot::ParameterableElement::owningTemplateParameter
			symbol_188.setName("owningTemplateParameter");
			symbol_188.setType(symbol_242);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_188.setLower(BigInteger.valueOf(0));
			
			symbol_188.setIsResolveProxies(true);
			symbol_188.setOpposite(symbol_247);
			symbol_185.getOwnedAttributes().add(symbol_188);
		}
		{ // pivot.ecore::pivot::ParameterableElement::templateParameter
			symbol_189.setName("templateParameter");
			symbol_189.setType(symbol_242);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_189.setLower(BigInteger.valueOf(0));
			
			symbol_189.setIsResolveProxies(true);
			symbol_189.setOpposite(symbol_248);
			symbol_185.getOwnedAttributes().add(symbol_189);
		}
		{	// pivot.ecore::pivot::ParameterableElement::isTemplateParameter()
			Operation symbol_341 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!isTemplateParameter()
			symbol_341.setName("isTemplateParameter");
			symbol_341.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_185.getOwnedOperations().add(symbol_341);
		}
		symbol_1.getOwnedTypes().add(symbol_185); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		//
		// pivot.ecore::pivot::Pivotable http://www.eclipse.org/ocl/3.1.0/Pivot!Pivotable
		//
		symbol_190.setName("Pivotable");
		symbol_190.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_190); // http://www.eclipse.org/ocl/3.1.0/Pivot!Pivotable
		//
		// pivot.ecore::pivot::Precedence http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
		//
		symbol_191.setName("Precedence");
		symbol_191.getSuperClasses().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::Precedence::Operation
			symbol_192.setName("Operation");
			symbol_192.setType(symbol_159);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_192.setLower(BigInteger.valueOf(0));
			symbol_192.setUpper(BigInteger.valueOf(-1));
			
			symbol_192.setImplicit(true);
			symbol_192.setIsResolveProxies(true);
			symbol_192.setOpposite(symbol_166);
			symbol_191.getOwnedAttributes().add(symbol_192);
		}
		{ // pivot.ecore::pivot::Precedence::Package
			symbol_193.setName("Package");
			symbol_193.setType(symbol_173);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_193.setLower(BigInteger.valueOf(0));
			
			symbol_193.setImplicit(true);
			symbol_193.setIsResolveProxies(true);
			symbol_193.setOpposite(symbol_178);
			symbol_191.getOwnedAttributes().add(symbol_193);
		}
		{ // pivot.ecore::pivot::Precedence::associativity
			symbol_194.setName("associativity");
			symbol_194.setType(symbol_13);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
			symbol_194.setLower(BigInteger.valueOf(0));
			
			symbol_194.setIsResolveProxies(true);
			symbol_191.getOwnedAttributes().add(symbol_194);
		}
		{ // pivot.ecore::pivot::Precedence::order
			symbol_195.setName("order");
			symbol_195.setType(symbol_89);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_195.setIsDerived(true);
			symbol_195.setIsResolveProxies(true);
			symbol_195.setIsVolatile(true);
			symbol_191.getOwnedAttributes().add(symbol_195);
		}
		symbol_1.getOwnedTypes().add(symbol_191); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
		//
		// pivot.ecore::pivot::PrimitiveLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		//
		symbol_196.setName("PrimitiveLiteralExp");
		symbol_196.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		symbol_1.getOwnedTypes().add(symbol_196); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		//
		// pivot.ecore::pivot::PrimitiveType http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveType
		//
		symbol_197.setName("PrimitiveType");
		symbol_197.getSuperClasses().add(symbol_54); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		symbol_1.getOwnedTypes().add(symbol_197); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveType
		//
		// pivot.ecore::pivot::Property http://www.eclipse.org/ocl/3.1.0/Pivot!Property
		//
		symbol_198.setName("Property");
		symbol_198.getSuperClasses().add(symbol_185); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		symbol_198.getSuperClasses().add(symbol_79); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		{ // pivot.ecore::pivot::Property::NavigationCallExp
			symbol_199.setName("NavigationCallExp");
			symbol_199.setType(symbol_135);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
			symbol_199.setLower(BigInteger.valueOf(0));
			symbol_199.setUpper(BigInteger.valueOf(-1));
			
			symbol_199.setImplicit(true);
			symbol_199.setIsResolveProxies(true);
			symbol_199.setOpposite(symbol_136);
			symbol_198.getOwnedAttributes().add(symbol_199);
		}
		{ // pivot.ecore::pivot::Property::Property
			symbol_200.setName("Property");
			symbol_200.setType(symbol_198);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_200.setLower(BigInteger.valueOf(0));
			symbol_200.setUpper(BigInteger.valueOf(-1));
			
			symbol_200.setImplicit(true);
			symbol_200.setIsResolveProxies(true);
			symbol_198.getOwnedAttributes().add(symbol_200);
		}
		{ // pivot.ecore::pivot::Property::PropertyCallExp
			symbol_201.setName("PropertyCallExp");
			symbol_201.setType(symbol_217);  // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
			symbol_201.setLower(BigInteger.valueOf(0));
			symbol_201.setUpper(BigInteger.valueOf(-1));
			
			symbol_201.setImplicit(true);
			symbol_201.setIsResolveProxies(true);
			symbol_201.setOpposite(symbol_218);
			symbol_198.getOwnedAttributes().add(symbol_201);
		}
		{ // pivot.ecore::pivot::Property::association
			symbol_202.setName("association");
			symbol_202.setType(symbol_8);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
			symbol_202.setLower(BigInteger.valueOf(0));
			
			symbol_202.setIsResolveProxies(true);
			symbol_202.setOpposite(symbol_10);
			symbol_198.getOwnedAttributes().add(symbol_202);
		}
		{ // pivot.ecore::pivot::Property::class
			symbol_203.setName("class");
			symbol_203.setType(symbol_25);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
			symbol_203.setLower(BigInteger.valueOf(0));
			
			symbol_203.setIsReadOnly(true);
			symbol_203.setIsResolveProxies(true);
			symbol_203.setIsTransient(true);
			symbol_203.setIsVolatile(true);
			symbol_198.getOwnedAttributes().add(symbol_203);
		}
		{ // pivot.ecore::pivot::Property::default
			symbol_204.setName("default");
			symbol_204.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_204.setLower(BigInteger.valueOf(0));
			
			symbol_204.setIsResolveProxies(true);
			symbol_198.getOwnedAttributes().add(symbol_204);
		}
		{ // pivot.ecore::pivot::Property::implicit
			symbol_205.setName("implicit");
			symbol_205.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_205.setLower(BigInteger.valueOf(0));
			
			symbol_205.setIsResolveProxies(true);
			symbol_198.getOwnedAttributes().add(symbol_205);
		}
		{ // pivot.ecore::pivot::Property::isComposite
			symbol_206.setName("isComposite");
			symbol_206.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_206.setIsResolveProxies(true);
			symbol_198.getOwnedAttributes().add(symbol_206);
		}
		{ // pivot.ecore::pivot::Property::isDerived
			symbol_207.setName("isDerived");
			symbol_207.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_207.setIsResolveProxies(true);
			symbol_198.getOwnedAttributes().add(symbol_207);
		}
		{ // pivot.ecore::pivot::Property::isID
			symbol_208.setName("isID");
			symbol_208.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_208.setIsResolveProxies(true);
			symbol_198.getOwnedAttributes().add(symbol_208);
		}
		{ // pivot.ecore::pivot::Property::isReadOnly
			symbol_209.setName("isReadOnly");
			symbol_209.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_209.setIsResolveProxies(true);
			symbol_198.getOwnedAttributes().add(symbol_209);
		}
		{ // pivot.ecore::pivot::Property::isResolveProxies
			symbol_210.setName("isResolveProxies");
			symbol_210.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_210.setIsResolveProxies(true);
			symbol_198.getOwnedAttributes().add(symbol_210);
		}
		{ // pivot.ecore::pivot::Property::isTransient
			symbol_211.setName("isTransient");
			symbol_211.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_211.setIsResolveProxies(true);
			symbol_198.getOwnedAttributes().add(symbol_211);
		}
		{ // pivot.ecore::pivot::Property::isUnsettable
			symbol_212.setName("isUnsettable");
			symbol_212.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_212.setIsResolveProxies(true);
			symbol_198.getOwnedAttributes().add(symbol_212);
		}
		{ // pivot.ecore::pivot::Property::isVolatile
			symbol_213.setName("isVolatile");
			symbol_213.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_213.setIsResolveProxies(true);
			symbol_198.getOwnedAttributes().add(symbol_213);
		}
		{ // pivot.ecore::pivot::Property::keys
			symbol_214.setName("keys");
			symbol_214.setType(symbol_198);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_214.setLower(BigInteger.valueOf(0));
			symbol_214.setUpper(BigInteger.valueOf(-1));
			
			symbol_214.setIsResolveProxies(true);
			symbol_214.setOpposite(symbol_200);
			symbol_198.getOwnedAttributes().add(symbol_214);
		}
		{ // pivot.ecore::pivot::Property::opposite
			symbol_215.setName("opposite");
			symbol_215.setType(symbol_198);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_215.setLower(BigInteger.valueOf(0));
			
			symbol_215.setIsResolveProxies(true);
			symbol_198.getOwnedAttributes().add(symbol_215);
		}
		{ // pivot.ecore::pivot::Property::owningType
			symbol_216.setName("owningType");
			symbol_216.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_216.setLower(BigInteger.valueOf(0));
			
			symbol_216.setIsResolveProxies(true);
			symbol_216.setOpposite(symbol_285);
			symbol_198.getOwnedAttributes().add(symbol_216);
		}
		symbol_1.getOwnedTypes().add(symbol_198); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
		//
		// pivot.ecore::pivot::PropertyCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
		//
		symbol_217.setName("PropertyCallExp");
		symbol_217.getSuperClasses().add(symbol_135); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		{ // pivot.ecore::pivot::PropertyCallExp::referredProperty
			symbol_218.setName("referredProperty");
			symbol_218.setType(symbol_198);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_218.setLower(BigInteger.valueOf(0));
			
			symbol_218.setIsResolveProxies(true);
			symbol_218.setOpposite(symbol_201);
			symbol_217.getOwnedAttributes().add(symbol_218);
		}
		symbol_1.getOwnedTypes().add(symbol_217); // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
		//
		// pivot.ecore::pivot::RealLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp
		//
		symbol_220.setName("RealLiteralExp");
		symbol_220.getSuperClasses().add(symbol_139); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		{ // pivot.ecore::pivot::RealLiteralExp::realSymbol
			symbol_221.setName("realSymbol");
			symbol_221.setType(symbol_219);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Real
			
			symbol_221.setIsResolveProxies(true);
			symbol_220.getOwnedAttributes().add(symbol_221);
		}
		symbol_1.getOwnedTypes().add(symbol_220); // http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp
		//
		// pivot.ecore::pivot::SelfType http://www.eclipse.org/ocl/3.1.0/Pivot!SelfType
		//
		symbol_222.setName("SelfType");
		symbol_222.getSuperClasses().add(symbol_25); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		symbol_1.getOwnedTypes().add(symbol_222); // http://www.eclipse.org/ocl/3.1.0/Pivot!SelfType
		//
		// pivot.ecore::pivot::SendSignalAction http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
		//
		symbol_223.setName("SendSignalAction");
		symbol_223.getSuperClasses().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::SendSignalAction::MessageExp
			symbol_224.setName("MessageExp");
			symbol_224.setType(symbol_114);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
			symbol_224.setLower(BigInteger.valueOf(0));
			
			symbol_224.setImplicit(true);
			symbol_224.setIsResolveProxies(true);
			symbol_224.setOpposite(symbol_117);
			symbol_223.getOwnedAttributes().add(symbol_224);
		}
		{ // pivot.ecore::pivot::SendSignalAction::signal
			symbol_225.setName("signal");
			symbol_225.setType(symbol_228);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
			
			symbol_225.setIsResolveProxies(true);
			symbol_225.setOpposite(symbol_230);
			symbol_223.getOwnedAttributes().add(symbol_225);
		}
		symbol_1.getOwnedTypes().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
		//
		// pivot.ecore::pivot::SequenceType http://www.eclipse.org/ocl/3.1.0/Pivot!SequenceType
		//
		symbol_226.setName("SequenceType");
		symbol_226.getSuperClasses().add(symbol_41); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		symbol_1.getOwnedTypes().add(symbol_226); // http://www.eclipse.org/ocl/3.1.0/Pivot!SequenceType
		//
		// pivot.ecore::pivot::SetType http://www.eclipse.org/ocl/3.1.0/Pivot!SetType
		//
		symbol_227.setName("SetType");
		symbol_227.getSuperClasses().add(symbol_41); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		symbol_1.getOwnedTypes().add(symbol_227); // http://www.eclipse.org/ocl/3.1.0/Pivot!SetType
		//
		// pivot.ecore::pivot::Signal http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
		//
		symbol_228.setName("Signal");
		symbol_228.getSuperClasses().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::Signal::MessageType
			symbol_229.setName("MessageType");
			symbol_229.setType(symbol_119);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
			symbol_229.setLower(BigInteger.valueOf(0));
			symbol_229.setUpper(BigInteger.valueOf(-1));
			
			symbol_229.setImplicit(true);
			symbol_229.setIsResolveProxies(true);
			symbol_229.setOpposite(symbol_121);
			symbol_228.getOwnedAttributes().add(symbol_229);
		}
		{ // pivot.ecore::pivot::Signal::SendSignalAction
			symbol_230.setName("SendSignalAction");
			symbol_230.setType(symbol_223);  // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
			symbol_230.setLower(BigInteger.valueOf(0));
			symbol_230.setUpper(BigInteger.valueOf(-1));
			
			symbol_230.setImplicit(true);
			symbol_230.setIsResolveProxies(true);
			symbol_230.setOpposite(symbol_225);
			symbol_228.getOwnedAttributes().add(symbol_230);
		}
		symbol_1.getOwnedTypes().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
		//
		// pivot.ecore::pivot::State http://www.eclipse.org/ocl/3.1.0/Pivot!State
		//
		symbol_231.setName("State");
		symbol_231.getSuperClasses().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::State::StateExp
			symbol_232.setName("StateExp");
			symbol_232.setType(symbol_233);  // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
			symbol_232.setLower(BigInteger.valueOf(0));
			symbol_232.setUpper(BigInteger.valueOf(-1));
			
			symbol_232.setImplicit(true);
			symbol_232.setIsResolveProxies(true);
			symbol_232.setOpposite(symbol_234);
			symbol_231.getOwnedAttributes().add(symbol_232);
		}
		symbol_1.getOwnedTypes().add(symbol_231); // http://www.eclipse.org/ocl/3.1.0/Pivot!State
		//
		// pivot.ecore::pivot::StateExp http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
		//
		symbol_233.setName("StateExp");
		symbol_233.getSuperClasses().add(symbol_141); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::StateExp::referredState
			symbol_234.setName("referredState");
			symbol_234.setType(symbol_231);  // http://www.eclipse.org/ocl/3.1.0/Pivot!State
			symbol_234.setLower(BigInteger.valueOf(0));
			
			symbol_234.setIsResolveProxies(true);
			symbol_234.setOpposite(symbol_232);
			symbol_233.getOwnedAttributes().add(symbol_234);
		}
		symbol_1.getOwnedTypes().add(symbol_233); // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
		//
		// pivot.ecore::pivot::StringLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp
		//
		symbol_236.setName("StringLiteralExp");
		symbol_236.getSuperClasses().add(symbol_196); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		{ // pivot.ecore::pivot::StringLiteralExp::stringSymbol
			symbol_237.setName("stringSymbol");
			symbol_237.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			
			symbol_237.setIsResolveProxies(true);
			symbol_236.getOwnedAttributes().add(symbol_237);
		}
		symbol_1.getOwnedTypes().add(symbol_236); // http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp
		//
		// pivot.ecore::pivot::TemplateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
		//
		symbol_238.setName("TemplateBinding");
		symbol_238.getSuperClasses().add(symbol_60); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::TemplateBinding::boundElement
			symbol_239.setName("boundElement");
			symbol_239.setType(symbol_262);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
			
			symbol_239.setIsResolveProxies(true);
			symbol_239.setOpposite(symbol_264);
			symbol_238.getOwnedAttributes().add(symbol_239);
		}
		{ // pivot.ecore::pivot::TemplateBinding::parameterSubstitution
			symbol_240.setName("parameterSubstitution");
			symbol_240.setType(symbol_250);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
			symbol_240.setLower(BigInteger.valueOf(0));
			symbol_240.setUpper(BigInteger.valueOf(-1));
			
			symbol_240.setIsComposite(true);
			symbol_240.setIsResolveProxies(true);
			symbol_240.setOpposite(symbol_254);
			symbol_238.getOwnedAttributes().add(symbol_240);
		}
		{ // pivot.ecore::pivot::TemplateBinding::signature
			symbol_241.setName("signature");
			symbol_241.setType(symbol_257);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			
			symbol_241.setIsResolveProxies(true);
			symbol_241.setOpposite(symbol_258);
			symbol_238.getOwnedAttributes().add(symbol_241);
		}
		symbol_1.getOwnedTypes().add(symbol_238); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
		//
		// pivot.ecore::pivot::TemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		//
		symbol_242.setName("TemplateParameter");
		symbol_242.getSuperClasses().add(symbol_60); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::TemplateParameter::TemplateParameterSubstitution
			symbol_243.setName("TemplateParameterSubstitution");
			symbol_243.setType(symbol_250);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
			symbol_243.setLower(BigInteger.valueOf(0));
			symbol_243.setUpper(BigInteger.valueOf(-1));
			
			symbol_243.setImplicit(true);
			symbol_243.setIsResolveProxies(true);
			symbol_243.setOpposite(symbol_252);
			symbol_242.getOwnedAttributes().add(symbol_243);
		}
		{ // pivot.ecore::pivot::TemplateParameter::TemplateSignature
			symbol_244.setName("TemplateSignature");
			symbol_244.setType(symbol_257);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			symbol_244.setLower(BigInteger.valueOf(0));
			symbol_244.setUpper(BigInteger.valueOf(-1));
			
			symbol_244.setImplicit(true);
			symbol_244.setIsResolveProxies(true);
			symbol_244.setOpposite(symbol_260);
			symbol_242.getOwnedAttributes().add(symbol_244);
		}
		{ // pivot.ecore::pivot::TemplateParameter::default
			symbol_245.setName("default");
			symbol_245.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_245.setLower(BigInteger.valueOf(0));
			
			symbol_245.setIsResolveProxies(true);
			symbol_242.getOwnedAttributes().add(symbol_245);
		}
		{ // pivot.ecore::pivot::TemplateParameter::ownedDefault
			symbol_246.setName("ownedDefault");
			symbol_246.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_246.setLower(BigInteger.valueOf(0));
			
			symbol_246.setIsComposite(true);
			symbol_246.setIsResolveProxies(true);
			symbol_246.setOpposite(symbol_186);
			symbol_242.getOwnedAttributes().add(symbol_246);
		}
		{ // pivot.ecore::pivot::TemplateParameter::ownedParameteredElement
			symbol_247.setName("ownedParameteredElement");
			symbol_247.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_247.setLower(BigInteger.valueOf(0));
			
			symbol_247.setIsComposite(true);
			symbol_247.setIsResolveProxies(true);
			symbol_247.setOpposite(symbol_188);
			symbol_242.getOwnedAttributes().add(symbol_247);
		}
		{ // pivot.ecore::pivot::TemplateParameter::parameteredElement
			symbol_248.setName("parameteredElement");
			symbol_248.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			
			symbol_248.setIsResolveProxies(true);
			symbol_248.setOpposite(symbol_189);
			symbol_242.getOwnedAttributes().add(symbol_248);
		}
		{ // pivot.ecore::pivot::TemplateParameter::signature
			symbol_249.setName("signature");
			symbol_249.setType(symbol_257);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			
			symbol_249.setIsResolveProxies(true);
			symbol_249.setOpposite(symbol_259);
			symbol_242.getOwnedAttributes().add(symbol_249);
		}
		symbol_1.getOwnedTypes().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		//
		// pivot.ecore::pivot::TemplateParameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
		//
		symbol_250.setName("TemplateParameterSubstitution");
		symbol_250.getSuperClasses().add(symbol_60); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::actual
			symbol_251.setName("actual");
			symbol_251.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			
			symbol_251.setIsResolveProxies(true);
			symbol_250.getOwnedAttributes().add(symbol_251);
		}
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::formal
			symbol_252.setName("formal");
			symbol_252.setType(symbol_242);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			
			symbol_252.setIsResolveProxies(true);
			symbol_252.setOpposite(symbol_243);
			symbol_250.getOwnedAttributes().add(symbol_252);
		}
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::ownedActual
			symbol_253.setName("ownedActual");
			symbol_253.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_253.setLower(BigInteger.valueOf(0));
			
			symbol_253.setIsComposite(true);
			symbol_253.setIsResolveProxies(true);
			symbol_253.setOpposite(symbol_187);
			symbol_250.getOwnedAttributes().add(symbol_253);
		}
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::templateBinding
			symbol_254.setName("templateBinding");
			symbol_254.setType(symbol_238);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
			
			symbol_254.setIsResolveProxies(true);
			symbol_254.setOpposite(symbol_240);
			symbol_250.getOwnedAttributes().add(symbol_254);
		}
		symbol_1.getOwnedTypes().add(symbol_250); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
		//
		// pivot.ecore::pivot::TemplateParameterType http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType
		//
		symbol_255.setName("TemplateParameterType");
		symbol_255.getSuperClasses().add(symbol_273); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		{ // pivot.ecore::pivot::TemplateParameterType::specification
			symbol_256.setName("specification");
			symbol_256.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_256.setLower(BigInteger.valueOf(0));
			
			symbol_256.setIsResolveProxies(true);
			symbol_255.getOwnedAttributes().add(symbol_256);
		}
		symbol_1.getOwnedTypes().add(symbol_255); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType
		//
		// pivot.ecore::pivot::TemplateSignature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
		//
		symbol_257.setName("TemplateSignature");
		symbol_257.getSuperClasses().add(symbol_60); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::TemplateSignature::TemplateBinding
			symbol_258.setName("TemplateBinding");
			symbol_258.setType(symbol_238);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
			symbol_258.setLower(BigInteger.valueOf(0));
			symbol_258.setUpper(BigInteger.valueOf(-1));
			
			symbol_258.setImplicit(true);
			symbol_258.setIsResolveProxies(true);
			symbol_258.setOpposite(symbol_241);
			symbol_257.getOwnedAttributes().add(symbol_258);
		}
		{ // pivot.ecore::pivot::TemplateSignature::ownedParameter
			symbol_259.setName("ownedParameter");
			symbol_259.setType(symbol_242);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_259.setLower(BigInteger.valueOf(0));
			symbol_259.setUpper(BigInteger.valueOf(-1));
			symbol_259.setIsOrdered(true);
			
			symbol_259.setIsComposite(true);
			symbol_259.setIsResolveProxies(true);
			symbol_259.setOpposite(symbol_249);
			symbol_257.getOwnedAttributes().add(symbol_259);
		}
		{ // pivot.ecore::pivot::TemplateSignature::parameter
			symbol_260.setName("parameter");
			symbol_260.setType(symbol_242);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_260.setUpper(BigInteger.valueOf(-1));
			symbol_260.setIsOrdered(true);
			
			symbol_260.setIsResolveProxies(true);
			symbol_260.setOpposite(symbol_244);
			symbol_257.getOwnedAttributes().add(symbol_260);
		}
		{ // pivot.ecore::pivot::TemplateSignature::template
			symbol_261.setName("template");
			symbol_261.setType(symbol_262);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
			
			symbol_261.setIsResolveProxies(true);
			symbol_261.setOpposite(symbol_263);
			symbol_257.getOwnedAttributes().add(symbol_261);
		}
		symbol_1.getOwnedTypes().add(symbol_257); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
		//
		// pivot.ecore::pivot::TemplateableElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		//
		symbol_262.setName("TemplateableElement");
		symbol_262.getSuperClasses().add(symbol_60); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // pivot.ecore::pivot::TemplateableElement::ownedTemplateSignature
			symbol_263.setName("ownedTemplateSignature");
			symbol_263.setType(symbol_257);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			symbol_263.setLower(BigInteger.valueOf(0));
			
			symbol_263.setIsComposite(true);
			symbol_263.setIsResolveProxies(true);
			symbol_263.setOpposite(symbol_261);
			symbol_262.getOwnedAttributes().add(symbol_263);
		}
		{ // pivot.ecore::pivot::TemplateableElement::templateBinding
			symbol_264.setName("templateBinding");
			symbol_264.setType(symbol_238);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
			symbol_264.setLower(BigInteger.valueOf(0));
			symbol_264.setUpper(BigInteger.valueOf(-1));
			
			symbol_264.setIsComposite(true);
			symbol_264.setIsResolveProxies(true);
			symbol_264.setOpposite(symbol_239);
			symbol_262.getOwnedAttributes().add(symbol_264);
		}
		{ // pivot.ecore::pivot::TemplateableElement::unspecializedElement
			symbol_265.setName("unspecializedElement");
			symbol_265.setType(symbol_262);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
			symbol_265.setLower(BigInteger.valueOf(0));
			
			symbol_265.setIsTransient(true);
			symbol_262.getOwnedAttributes().add(symbol_265);
		}
		{	// pivot.ecore::pivot::TemplateableElement::isTemplate()
			Operation symbol_342 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!isTemplate()
			symbol_342.setName("isTemplate");
			symbol_342.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_262.getOwnedOperations().add(symbol_342);
		}
		{	// pivot.ecore::pivot::TemplateableElement::parameterableElements()
			Operation symbol_343 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!parameterableElements()
			symbol_343.setName("parameterableElements");
			symbol_343.setType(symbol_185);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_343.setLower(BigInteger.valueOf(0));
			symbol_343.setUpper(BigInteger.valueOf(-1));
			
			symbol_262.getOwnedOperations().add(symbol_343);
		}
		symbol_1.getOwnedTypes().add(symbol_262); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		//
		// pivot.ecore::pivot::Throwable http://www.eclipse.org/ocl/3.1.0/Pivot!Throwable
		//
		symbol_266.setName("Throwable");
		symbol_266.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_266); // http://www.eclipse.org/ocl/3.1.0/Pivot!Throwable
		//
		// pivot.ecore::pivot::TupleLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
		//
		symbol_267.setName("TupleLiteralExp");
		symbol_267.getSuperClasses().add(symbol_109); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		{ // pivot.ecore::pivot::TupleLiteralExp::part
			symbol_268.setName("part");
			symbol_268.setType(symbol_269);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
			symbol_268.setLower(BigInteger.valueOf(0));
			symbol_268.setUpper(BigInteger.valueOf(-1));
			symbol_268.setIsOrdered(true);
			
			symbol_268.setIsComposite(true);
			symbol_268.setIsResolveProxies(true);
			symbol_268.setOpposite(symbol_270);
			symbol_267.getOwnedAttributes().add(symbol_268);
		}
		symbol_1.getOwnedTypes().add(symbol_267); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
		//
		// pivot.ecore::pivot::TupleLiteralPart http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
		//
		symbol_269.setName("TupleLiteralPart");
		symbol_269.getSuperClasses().add(symbol_314); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		{ // pivot.ecore::pivot::TupleLiteralPart::TupleLiteralExp
			symbol_270.setName("TupleLiteralExp");
			symbol_270.setType(symbol_267);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
			symbol_270.setLower(BigInteger.valueOf(0));
			
			symbol_270.setImplicit(true);
			symbol_270.setIsResolveProxies(true);
			symbol_270.setOpposite(symbol_268);
			symbol_269.getOwnedAttributes().add(symbol_270);
		}
		{ // pivot.ecore::pivot::TupleLiteralPart::initExpression
			symbol_271.setName("initExpression");
			symbol_271.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_271.setLower(BigInteger.valueOf(0));
			
			symbol_271.setIsComposite(true);
			symbol_271.setIsResolveProxies(true);
			symbol_271.setOpposite(symbol_152);
			symbol_269.getOwnedAttributes().add(symbol_271);
		}
		symbol_1.getOwnedTypes().add(symbol_269); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
		//
		// pivot.ecore::pivot::TupleType http://www.eclipse.org/ocl/3.1.0/Pivot!TupleType
		//
		symbol_272.setName("TupleType");
		symbol_272.getSuperClasses().add(symbol_54); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		symbol_1.getOwnedTypes().add(symbol_272); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleType
		//
		// pivot.ecore::pivot::Type http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		//
		symbol_273.setName("Type");
		symbol_273.getSuperClasses().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		symbol_273.getSuperClasses().add(symbol_262); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		symbol_273.getSuperClasses().add(symbol_185); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // pivot.ecore::pivot::Type::ClassifierType
			symbol_274.setName("ClassifierType");
			symbol_274.setType(symbol_28);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
			symbol_274.setLower(BigInteger.valueOf(0));
			symbol_274.setUpper(BigInteger.valueOf(-1));
			
			symbol_274.setImplicit(true);
			symbol_274.setIsResolveProxies(true);
			symbol_274.setOpposite(symbol_29);
			symbol_273.getOwnedAttributes().add(symbol_274);
		}
		{ // pivot.ecore::pivot::Type::CollectionType
			symbol_275.setName("CollectionType");
			symbol_275.setType(symbol_41);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
			symbol_275.setLower(BigInteger.valueOf(0));
			symbol_275.setUpper(BigInteger.valueOf(-1));
			
			symbol_275.setImplicit(true);
			symbol_275.setIsResolveProxies(true);
			symbol_275.setOpposite(symbol_42);
			symbol_273.getOwnedAttributes().add(symbol_275);
		}
		{ // pivot.ecore::pivot::Type::DataType
			symbol_276.setName("DataType");
			symbol_276.setType(symbol_54);  // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
			symbol_276.setLower(BigInteger.valueOf(0));
			symbol_276.setUpper(BigInteger.valueOf(-1));
			
			symbol_276.setImplicit(true);
			symbol_276.setIsResolveProxies(true);
			symbol_276.setOpposite(symbol_55);
			symbol_273.getOwnedAttributes().add(symbol_276);
		}
		{ // pivot.ecore::pivot::Type::LambdaType
			symbol_277.setName("LambdaType");
			symbol_277.setType(symbol_101);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
			symbol_277.setLower(BigInteger.valueOf(0));
			symbol_277.setUpper(BigInteger.valueOf(-1));
			
			symbol_277.setImplicit(true);
			symbol_277.setIsResolveProxies(true);
			symbol_273.getOwnedAttributes().add(symbol_277);
		}
		{ // pivot.ecore::pivot::Type::Operation
			symbol_278.setName("Operation");
			symbol_278.setType(symbol_159);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_278.setLower(BigInteger.valueOf(0));
			symbol_278.setUpper(BigInteger.valueOf(-1));
			
			symbol_278.setImplicit(true);
			symbol_278.setIsResolveProxies(true);
			symbol_278.setOpposite(symbol_167);
			symbol_273.getOwnedAttributes().add(symbol_278);
		}
		{ // pivot.ecore::pivot::Type::Type
			symbol_279.setName("Type");
			symbol_279.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_279.setLower(BigInteger.valueOf(0));
			symbol_279.setUpper(BigInteger.valueOf(-1));
			
			symbol_279.setImplicit(true);
			symbol_279.setIsResolveProxies(true);
			symbol_279.setOpposite(symbol_288);
			symbol_273.getOwnedAttributes().add(symbol_279);
		}
		{ // pivot.ecore::pivot::Type::TypeExp
			symbol_280.setName("TypeExp");
			symbol_280.setType(symbol_289);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
			symbol_280.setLower(BigInteger.valueOf(0));
			symbol_280.setUpper(BigInteger.valueOf(-1));
			
			symbol_280.setImplicit(true);
			symbol_280.setIsResolveProxies(true);
			symbol_280.setOpposite(symbol_290);
			symbol_273.getOwnedAttributes().add(symbol_280);
		}
		{ // pivot.ecore::pivot::Type::TypeTemplateParameter
			symbol_281.setName("TypeTemplateParameter");
			symbol_281.setType(symbol_291);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
			symbol_281.setLower(BigInteger.valueOf(0));
			symbol_281.setUpper(BigInteger.valueOf(-1));
			
			symbol_281.setImplicit(true);
			symbol_281.setIsResolveProxies(true);
			symbol_281.setOpposite(symbol_293);
			symbol_273.getOwnedAttributes().add(symbol_281);
		}
		{ // pivot.ecore::pivot::Type::TypedElement
			symbol_282.setName("TypedElement");
			symbol_282.setType(symbol_294);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
			symbol_282.setLower(BigInteger.valueOf(0));
			symbol_282.setUpper(BigInteger.valueOf(-1));
			
			symbol_282.setImplicit(true);
			symbol_282.setIsResolveProxies(true);
			symbol_282.setOpposite(symbol_295);
			symbol_273.getOwnedAttributes().add(symbol_282);
		}
		{ // pivot.ecore::pivot::Type::UnspecifiedType
			symbol_283.setName("UnspecifiedType");
			symbol_283.setType(symbol_300);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
			symbol_283.setLower(BigInteger.valueOf(0));
			symbol_283.setUpper(BigInteger.valueOf(-1));
			
			symbol_283.setImplicit(true);
			symbol_283.setIsResolveProxies(true);
			symbol_273.getOwnedAttributes().add(symbol_283);
		}
		{ // pivot.ecore::pivot::Type::instanceClassName
			symbol_284.setName("instanceClassName");
			symbol_284.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_284.setLower(BigInteger.valueOf(0));
			
			symbol_284.setIsResolveProxies(true);
			symbol_273.getOwnedAttributes().add(symbol_284);
		}
		{ // pivot.ecore::pivot::Type::ownedAttribute
			symbol_285.setName("ownedAttribute");
			symbol_285.setType(symbol_198);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_285.setLower(BigInteger.valueOf(0));
			symbol_285.setUpper(BigInteger.valueOf(-1));
			symbol_285.setIsOrdered(true);
			
			symbol_285.setIsComposite(true);
			symbol_285.setIsResolveProxies(true);
			symbol_285.setOpposite(symbol_216);
			symbol_273.getOwnedAttributes().add(symbol_285);
		}
		{ // pivot.ecore::pivot::Type::ownedOperation
			symbol_286.setName("ownedOperation");
			symbol_286.setType(symbol_159);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_286.setLower(BigInteger.valueOf(0));
			symbol_286.setUpper(BigInteger.valueOf(-1));
			symbol_286.setIsOrdered(true);
			
			symbol_286.setIsComposite(true);
			symbol_286.setIsResolveProxies(true);
			symbol_286.setOpposite(symbol_165);
			symbol_273.getOwnedAttributes().add(symbol_286);
		}
		{ // pivot.ecore::pivot::Type::package
			symbol_287.setName("package");
			symbol_287.setType(symbol_173);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_287.setLower(BigInteger.valueOf(0));
			
			symbol_287.setIsResolveProxies(true);
			symbol_287.setOpposite(symbol_179);
			symbol_273.getOwnedAttributes().add(symbol_287);
		}
		{ // pivot.ecore::pivot::Type::superClass
			symbol_288.setName("superClass");
			symbol_288.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_288.setLower(BigInteger.valueOf(0));
			symbol_288.setUpper(BigInteger.valueOf(-1));
			symbol_288.setIsOrdered(true);
			
			symbol_288.setIsResolveProxies(true);
			symbol_288.setOpposite(symbol_279);
			symbol_273.getOwnedAttributes().add(symbol_288);
		}
		symbol_1.getOwnedTypes().add(symbol_273); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		//
		// pivot.ecore::pivot::TypeExp http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
		//
		symbol_289.setName("TypeExp");
		symbol_289.getSuperClasses().add(symbol_141); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::TypeExp::referredType
			symbol_290.setName("referredType");
			symbol_290.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_290.setLower(BigInteger.valueOf(0));
			
			symbol_290.setIsResolveProxies(true);
			symbol_290.setOpposite(symbol_280);
			symbol_289.getOwnedAttributes().add(symbol_290);
		}
		symbol_1.getOwnedTypes().add(symbol_289); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
		//
		// pivot.ecore::pivot::TypeTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
		//
		symbol_291.setName("TypeTemplateParameter");
		symbol_291.getSuperClasses().add(symbol_242); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		{ // pivot.ecore::pivot::TypeTemplateParameter::allowSubstitutable
			symbol_292.setName("allowSubstitutable");
			symbol_292.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_292.setIsResolveProxies(true);
			symbol_291.getOwnedAttributes().add(symbol_292);
		}
		{ // pivot.ecore::pivot::TypeTemplateParameter::constrainingType
			symbol_293.setName("constrainingType");
			symbol_293.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_293.setLower(BigInteger.valueOf(0));
			symbol_293.setUpper(BigInteger.valueOf(-1));
			
			symbol_293.setIsResolveProxies(true);
			symbol_293.setOpposite(symbol_281);
			symbol_291.getOwnedAttributes().add(symbol_293);
		}
		symbol_1.getOwnedTypes().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
		//
		// pivot.ecore::pivot::TypedElement http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		//
		symbol_294.setName("TypedElement");
		symbol_294.getSuperClasses().add(symbol_128); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // pivot.ecore::pivot::TypedElement::type
			symbol_295.setName("type");
			symbol_295.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_295.setLower(BigInteger.valueOf(0));
			
			symbol_295.setIsResolveProxies(true);
			symbol_295.setOpposite(symbol_282);
			symbol_294.getOwnedAttributes().add(symbol_295);
		}
		symbol_1.getOwnedTypes().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		//
		// pivot.ecore::pivot::TypedMultiplicityElement http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		//
		symbol_296.setName("TypedMultiplicityElement");
		symbol_296.getSuperClasses().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		symbol_296.getSuperClasses().add(symbol_122); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		symbol_1.getOwnedTypes().add(symbol_296); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		//
		// pivot.ecore::pivot::UnlimitedNaturalLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp
		//
		symbol_298.setName("UnlimitedNaturalLiteralExp");
		symbol_298.getSuperClasses().add(symbol_139); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		{ // pivot.ecore::pivot::UnlimitedNaturalLiteralExp::unlimitedNaturalSymbol
			symbol_299.setName("unlimitedNaturalSymbol");
			symbol_299.setType(symbol_297);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			
			symbol_299.setIsResolveProxies(true);
			symbol_298.getOwnedAttributes().add(symbol_299);
		}
		symbol_1.getOwnedTypes().add(symbol_298); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp
		//
		// pivot.ecore::pivot::UnspecifiedType http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
		//
		symbol_300.setName("UnspecifiedType");
		symbol_300.getSuperClasses().add(symbol_25); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		{ // pivot.ecore::pivot::UnspecifiedType::lowerBound
			symbol_301.setName("lowerBound");
			symbol_301.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_301.setIsResolveProxies(true);
			symbol_301.setOpposite(symbol_283);
			symbol_300.getOwnedAttributes().add(symbol_301);
		}
		{ // pivot.ecore::pivot::UnspecifiedType::upperBound
			symbol_302.setName("upperBound");
			symbol_302.setType(symbol_273);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_302.setIsResolveProxies(true);
			symbol_300.getOwnedAttributes().add(symbol_302);
		}
		symbol_1.getOwnedTypes().add(symbol_300); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
		//
		// pivot.ecore::pivot::UnspecifiedValueExp http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedValueExp
		//
		symbol_303.setName("UnspecifiedValueExp");
		symbol_303.getSuperClasses().add(symbol_141); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		symbol_1.getOwnedTypes().add(symbol_303); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedValueExp
		//
		// pivot.ecore::pivot::ValueSpecification http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		//
		symbol_304.setName("ValueSpecification");
		symbol_304.getSuperClasses().add(symbol_185); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		symbol_304.getSuperClasses().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		{ // pivot.ecore::pivot::ValueSpecification::Constraint
			symbol_305.setName("Constraint");
			symbol_305.setType(symbol_47);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_305.setLower(BigInteger.valueOf(0));
			
			symbol_305.setImplicit(true);
			symbol_305.setIsResolveProxies(true);
			symbol_305.setOpposite(symbol_52);
			symbol_304.getOwnedAttributes().add(symbol_305);
		}
		{	// pivot.ecore::pivot::ValueSpecification::booleanValue()
			Operation symbol_344 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!booleanValue()
			symbol_344.setName("booleanValue");
			symbol_344.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_304.getOwnedOperations().add(symbol_344);
		}
		{	// pivot.ecore::pivot::ValueSpecification::integerValue()
			Operation symbol_345 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!integerValue()
			symbol_345.setName("integerValue");
			symbol_345.setType(symbol_89);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_304.getOwnedOperations().add(symbol_345);
		}
		{	// pivot.ecore::pivot::ValueSpecification::isComputable()
			Operation symbol_346 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!isComputable()
			symbol_346.setName("isComputable");
			symbol_346.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_304.getOwnedOperations().add(symbol_346);
		}
		{	// pivot.ecore::pivot::ValueSpecification::isNull()
			Operation symbol_347 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!isNull()
			symbol_347.setName("isNull");
			symbol_347.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_304.getOwnedOperations().add(symbol_347);
		}
		{	// pivot.ecore::pivot::ValueSpecification::stringValue()
			Operation symbol_348 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!stringValue()
			symbol_348.setName("stringValue");
			symbol_348.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			
			symbol_304.getOwnedOperations().add(symbol_348);
		}
		{	// pivot.ecore::pivot::ValueSpecification::unlimitedValue()
			Operation symbol_349 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!unlimitedValue()
			symbol_349.setName("unlimitedValue");
			symbol_349.setType(symbol_297);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			
			symbol_304.getOwnedOperations().add(symbol_349);
		}
		symbol_1.getOwnedTypes().add(symbol_304); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		//
		// pivot.ecore::pivot::Variable http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
		//
		symbol_306.setName("Variable");
		symbol_306.getSuperClasses().add(symbol_314); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		{ // pivot.ecore::pivot::Variable::ExpressionInOcl
			symbol_307.setName("ExpressionInOcl");
			symbol_307.setType(symbol_73);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
			symbol_307.setLower(BigInteger.valueOf(0));
			symbol_307.setUpper(BigInteger.valueOf(-1));
			
			symbol_307.setImplicit(true);
			symbol_307.setIsResolveProxies(true);
			symbol_306.getOwnedAttributes().add(symbol_307);
		}
		{ // pivot.ecore::pivot::Variable::IterateExp
			symbol_308.setName("IterateExp");
			symbol_308.setType(symbol_94);  // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
			symbol_308.setLower(BigInteger.valueOf(0));
			
			symbol_308.setImplicit(true);
			symbol_308.setIsResolveProxies(true);
			symbol_308.setOpposite(symbol_95);
			symbol_306.getOwnedAttributes().add(symbol_308);
		}
		{ // pivot.ecore::pivot::Variable::LetExp
			symbol_309.setName("LetExp");
			symbol_309.setType(symbol_105);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
			symbol_309.setLower(BigInteger.valueOf(0));
			
			symbol_309.setImplicit(true);
			symbol_309.setIsResolveProxies(true);
			symbol_309.setOpposite(symbol_107);
			symbol_306.getOwnedAttributes().add(symbol_309);
		}
		{ // pivot.ecore::pivot::Variable::LoopExp
			symbol_310.setName("LoopExp");
			symbol_310.setType(symbol_110);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
			symbol_310.setLower(BigInteger.valueOf(0));
			
			symbol_310.setImplicit(true);
			symbol_310.setIsResolveProxies(true);
			symbol_310.setOpposite(symbol_112);
			symbol_306.getOwnedAttributes().add(symbol_310);
		}
		{ // pivot.ecore::pivot::Variable::implicit
			symbol_311.setName("implicit");
			symbol_311.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_311.setLower(BigInteger.valueOf(0));
			
			symbol_311.setIsResolveProxies(true);
			symbol_306.getOwnedAttributes().add(symbol_311);
		}
		{ // pivot.ecore::pivot::Variable::initExpression
			symbol_312.setName("initExpression");
			symbol_312.setType(symbol_141);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_312.setLower(BigInteger.valueOf(0));
			
			symbol_312.setIsComposite(true);
			symbol_312.setIsResolveProxies(true);
			symbol_312.setOpposite(symbol_153);
			symbol_306.getOwnedAttributes().add(symbol_312);
		}
		{ // pivot.ecore::pivot::Variable::representedParameter
			symbol_313.setName("representedParameter");
			symbol_313.setType(symbol_181);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_313.setLower(BigInteger.valueOf(0));
			
			symbol_313.setIsResolveProxies(true);
			symbol_313.setOpposite(symbol_183);
			symbol_306.getOwnedAttributes().add(symbol_313);
		}
		symbol_1.getOwnedTypes().add(symbol_306); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
		//
		// pivot.ecore::pivot::VariableDeclaration http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		//
		symbol_314.setName("VariableDeclaration");
		symbol_314.getSuperClasses().add(symbol_294); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		{ // pivot.ecore::pivot::VariableDeclaration::VariableExp
			symbol_315.setName("VariableExp");
			symbol_315.setType(symbol_316);  // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
			symbol_315.setLower(BigInteger.valueOf(0));
			symbol_315.setUpper(BigInteger.valueOf(-1));
			
			symbol_315.setImplicit(true);
			symbol_315.setIsResolveProxies(true);
			symbol_315.setOpposite(symbol_318);
			symbol_314.getOwnedAttributes().add(symbol_315);
		}
		symbol_1.getOwnedTypes().add(symbol_314); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		//
		// pivot.ecore::pivot::VariableExp http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
		//
		symbol_316.setName("VariableExp");
		symbol_316.getSuperClasses().add(symbol_141); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // pivot.ecore::pivot::VariableExp::implicit
			symbol_317.setName("implicit");
			symbol_317.setType(symbol_15);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_317.setLower(BigInteger.valueOf(0));
			
			symbol_317.setIsResolveProxies(true);
			symbol_316.getOwnedAttributes().add(symbol_317);
		}
		{ // pivot.ecore::pivot::VariableExp::referredVariable
			symbol_318.setName("referredVariable");
			symbol_318.setType(symbol_314);  // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
			symbol_318.setLower(BigInteger.valueOf(0));
			
			symbol_318.setIsResolveProxies(true);
			symbol_318.setOpposite(symbol_315);
			symbol_316.getOwnedAttributes().add(symbol_318);
		}
		symbol_1.getOwnedTypes().add(symbol_316); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
		//
		// pivot.ecore::pivot::Visitable http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		//
		symbol_319.setName("Visitable");
		symbol_319.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_319); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		//
		// pivot.ecore::pivot::Visitor http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}
		//
		symbol_320.setName("Visitor");
		symbol_323.setName("R");
		symbol_322.setOwnedParameteredElement(symbol_323);
		symbol_321.getOwnedParameters().add(symbol_322);
		symbol_325.setName("C");
		symbol_324.setOwnedParameteredElement(symbol_325);
		symbol_321.getOwnedParameters().add(symbol_324);
		
		symbol_320.setOwnedTemplateSignature(symbol_321);
		symbol_320.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_320); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}
		//
		// pivot.ecore::pivot::VoidType http://www.eclipse.org/ocl/3.1.0/Pivot!VoidType
		//
		symbol_326.setName("VoidType");
		symbol_326.getSuperClasses().add(symbol_25); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		symbol_1.getOwnedTypes().add(symbol_326); // http://www.eclipse.org/ocl/3.1.0/Pivot!VoidType

		Class elementClass = (Class) PivotUtil.getNamedElement(symbol_1.getOwnedTypes(), "Element");
		elementClass.getSuperClasses().clear();
		for (Type pivotClass : symbol_1.getOwnedTypes()) {
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
		
		return symbol_1;
	}
}
