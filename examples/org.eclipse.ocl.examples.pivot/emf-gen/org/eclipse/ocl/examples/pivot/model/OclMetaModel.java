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
		
		Class symbol_51 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		Property symbol_52 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!behavioralType // Pivot.ecore::pivot::DataType::behavioralType http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!behavioralType
		Property symbol_53 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!isSerializable // Pivot.ecore::pivot::DataType::isSerializable http://www.eclipse.org/ocl/3.1.0/Pivot!DataType!isSerializable
		
		Class symbol_54 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
		Property symbol_55 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!Annotation // Pivot.ecore::pivot::Detail::Annotation http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!Annotation
		Property symbol_56 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!value // Pivot.ecore::pivot::Detail::value http://www.eclipse.org/ocl/3.1.0/Pivot!Detail!value
		
		Class symbol_57 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		Property symbol_58 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Annotation // Pivot.ecore::pivot::Element::Annotation http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Annotation
		Property symbol_59 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Comment // Pivot.ecore::pivot::Element::Comment http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Comment
		Property symbol_60 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Constraint // Pivot.ecore::pivot::Element::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!Element!Constraint
		Property symbol_61 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!ownedComment // Pivot.ecore::pivot::Element::ownedComment http://www.eclipse.org/ocl/3.1.0/Pivot!Element!ownedComment
		
		Class symbol_62 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
		Property symbol_63 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp!referredEnumLiteral // Pivot.ecore::pivot::EnumLiteralExp::referredEnumLiteral http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp!referredEnumLiteral
		
		Class symbol_64 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
		Property symbol_65 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration!ownedLiteral // Pivot.ecore::pivot::Enumeration::ownedLiteral http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration!ownedLiteral
		
		Class symbol_66 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
		Property symbol_67 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!EnumLiteralExp // Pivot.ecore::pivot::EnumerationLiteral::EnumLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!EnumLiteralExp
		Property symbol_68 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!enumeration // Pivot.ecore::pivot::EnumerationLiteral::enumeration http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!enumeration
		Property symbol_69 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!value // Pivot.ecore::pivot::EnumerationLiteral::value http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral!value
		
		Class symbol_70 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
		Property symbol_71 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!bodyExpression // Pivot.ecore::pivot::ExpressionInOcl::bodyExpression http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!bodyExpression
		Property symbol_72 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!contextVariable // Pivot.ecore::pivot::ExpressionInOcl::contextVariable http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!contextVariable
		Property symbol_73 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!messageExpression // Pivot.ecore::pivot::ExpressionInOcl::messageExpression http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!messageExpression
		Property symbol_74 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!parameterVariable // Pivot.ecore::pivot::ExpressionInOcl::parameterVariable http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!parameterVariable
		Property symbol_75 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!resultVariable // Pivot.ecore::pivot::ExpressionInOcl::resultVariable http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl!resultVariable
		
		Class symbol_76 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		Property symbol_77 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementation // Pivot.ecore::pivot::Feature::implementation http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementation
		Property symbol_78 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementationClass // Pivot.ecore::pivot::Feature::implementationClass http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementationClass
		
		Class symbol_79 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		Property symbol_80 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp!isPre // Pivot.ecore::pivot::FeatureCallExp::isPre http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp!isPre
		
		Class symbol_81 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
		Property symbol_82 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!condition // Pivot.ecore::pivot::IfExp::condition http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!condition
		Property symbol_83 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!elseExpression // Pivot.ecore::pivot::IfExp::elseExpression http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!elseExpression
		Property symbol_84 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!thenExpression // Pivot.ecore::pivot::IfExp::thenExpression http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp!thenExpression
		
		DataType symbol_85 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Int
		
		PrimitiveType symbol_86 = standardLibrary.getIntegerType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
		Class symbol_87 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp
		Property symbol_88 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp!integerSymbol // Pivot.ecore::pivot::IntegerLiteralExp::integerSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp!integerSymbol
		
		Class symbol_89 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidLiteralExp
		
		Class symbol_90 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidType
		
		Class symbol_91 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
		Property symbol_92 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp!result // Pivot.ecore::pivot::IterateExp::result http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp!result
		
		Class symbol_93 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
		Property symbol_94 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!LoopExp // Pivot.ecore::pivot::Iteration::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!LoopExp
		Property symbol_95 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedAccumulator // Pivot.ecore::pivot::Iteration::ownedAccumulator http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedAccumulator
		Property symbol_96 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedIterator // Pivot.ecore::pivot::Iteration::ownedIterator http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration!ownedIterator
		
		Class symbol_97 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!IteratorExp
		
		Class symbol_98 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
		Property symbol_99 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!contextType // Pivot.ecore::pivot::LambdaType::contextType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!contextType
		Property symbol_100 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!parameterType // Pivot.ecore::pivot::LambdaType::parameterType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!parameterType
		Property symbol_101 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!resultType // Pivot.ecore::pivot::LambdaType::resultType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType!resultType
		
		Class symbol_102 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
		Property symbol_103 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!in // Pivot.ecore::pivot::LetExp::in http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!in
		Property symbol_104 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!variable // Pivot.ecore::pivot::LetExp::variable http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp!variable
		
		Class symbol_105 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Library
		
		DataType symbol_106 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LibraryFeature
		
		Class symbol_107 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		
		Class symbol_108 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		Property symbol_109 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!body // Pivot.ecore::pivot::LoopExp::body http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!body
		Property symbol_110 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!iterator // Pivot.ecore::pivot::LoopExp::iterator http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!iterator
		Property symbol_111 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!referredIteration // Pivot.ecore::pivot::LoopExp::referredIteration http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp!referredIteration
		
		Class symbol_112 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
		Property symbol_113 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!argument // Pivot.ecore::pivot::MessageExp::argument http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!argument
		Property symbol_114 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!calledOperation // Pivot.ecore::pivot::MessageExp::calledOperation http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!calledOperation
		Property symbol_115 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!sentSignal // Pivot.ecore::pivot::MessageExp::sentSignal http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!sentSignal
		Property symbol_116 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!target // Pivot.ecore::pivot::MessageExp::target http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp!target
		
		Class symbol_117 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
		Property symbol_118 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredOperation // Pivot.ecore::pivot::MessageType::referredOperation http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredOperation
		Property symbol_119 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredSignal // Pivot.ecore::pivot::MessageType::referredSignal http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType!referredSignal
		
		Class symbol_120 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		Property symbol_121 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isOrdered // Pivot.ecore::pivot::MultiplicityElement::isOrdered http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isOrdered
		Property symbol_122 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isUnique // Pivot.ecore::pivot::MultiplicityElement::isUnique http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isUnique
		Property symbol_123 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!lower // Pivot.ecore::pivot::MultiplicityElement::lower http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!lower
		Property symbol_124 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!upper // Pivot.ecore::pivot::MultiplicityElement::upper http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!upper
		
		Class symbol_125 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		
		Class symbol_126 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		Property symbol_127 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!isStatic // Pivot.ecore::pivot::NamedElement::isStatic http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!isStatic
		Property symbol_128 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!name // Pivot.ecore::pivot::NamedElement::name http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!name
		Property symbol_129 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedAnnotation // Pivot.ecore::pivot::NamedElement::ownedAnnotation http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedAnnotation
		Property symbol_130 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedRule // Pivot.ecore::pivot::NamedElement::ownedRule http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement!ownedRule
		
		Class symbol_131 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		
		Class symbol_132 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		Property symbol_133 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!navigationSource // Pivot.ecore::pivot::NavigationCallExp::navigationSource http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!navigationSource
		Property symbol_134 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!qualifier // Pivot.ecore::pivot::NavigationCallExp::qualifier http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp!qualifier
		
		Class symbol_135 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NullLiteralExp
		
		Class symbol_136 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		
		DataType symbol_137 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Object
		
		Class symbol_138 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		Property symbol_139 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CallExp // Pivot.ecore::pivot::OclExpression::CallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CallExp
		Property symbol_140 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionItem // Pivot.ecore::pivot::OclExpression::CollectionItem http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionItem
		Property symbol_141 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionRange // Pivot.ecore::pivot::OclExpression::CollectionRange http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!CollectionRange
		Property symbol_142 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!ExpressionInOcl // Pivot.ecore::pivot::OclExpression::ExpressionInOcl http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!ExpressionInOcl
		Property symbol_143 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!IfExp // Pivot.ecore::pivot::OclExpression::IfExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!IfExp
		Property symbol_144 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LetExp // Pivot.ecore::pivot::OclExpression::LetExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LetExp
		Property symbol_145 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LoopExp // Pivot.ecore::pivot::OclExpression::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!LoopExp
		Property symbol_146 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!MessageExp // Pivot.ecore::pivot::OclExpression::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!MessageExp
		Property symbol_147 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!NavigationCallExp // Pivot.ecore::pivot::OclExpression::NavigationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!NavigationCallExp
		Property symbol_148 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!OperationCallExp // Pivot.ecore::pivot::OclExpression::OperationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!OperationCallExp
		Property symbol_149 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!TupleLiteralPart // Pivot.ecore::pivot::OclExpression::TupleLiteralPart http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!TupleLiteralPart
		Property symbol_150 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!Variable // Pivot.ecore::pivot::OclExpression::Variable http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression!Variable
		
		Class symbol_151 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		Property symbol_152 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!body // Pivot.ecore::pivot::OpaqueExpression::body http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!body
		Property symbol_153 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!language // Pivot.ecore::pivot::OpaqueExpression::language http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!language
		Property symbol_154 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!message // Pivot.ecore::pivot::OpaqueExpression::message http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!message
		Property symbol_155 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!valueExpression // Pivot.ecore::pivot::OpaqueExpression::valueExpression http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression!valueExpression
		
		Class symbol_156 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		Property symbol_157 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!CallOperationAction // Pivot.ecore::pivot::Operation::CallOperationAction http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!CallOperationAction
		Property symbol_158 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!MessageType // Pivot.ecore::pivot::Operation::MessageType http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!MessageType
		Property symbol_159 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!OperationCallExp // Pivot.ecore::pivot::Operation::OperationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!OperationCallExp
		Property symbol_160 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!class // Pivot.ecore::pivot::Operation::class http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!class
		Property symbol_161 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!ownedParameter // Pivot.ecore::pivot::Operation::ownedParameter http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!ownedParameter
		Property symbol_162 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!owningType // Pivot.ecore::pivot::Operation::owningType http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!owningType
		Property symbol_163 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!precedence // Pivot.ecore::pivot::Operation::precedence http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!precedence
		Property symbol_164 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!raisedException // Pivot.ecore::pivot::Operation::raisedException http://www.eclipse.org/ocl/3.1.0/Pivot!Operation!raisedException
		
		Class symbol_165 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
		Property symbol_166 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!argument // Pivot.ecore::pivot::OperationCallExp::argument http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!argument
		Property symbol_167 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!referredOperation // Pivot.ecore::pivot::OperationCallExp::referredOperation http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp!referredOperation
		
		Class symbol_168 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationTemplateParameter
		
		Class symbol_169 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!OrderedSetType
		
		Class symbol_170 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		Property symbol_171 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestedPackage // Pivot.ecore::pivot::Package::nestedPackage http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestedPackage
		Property symbol_172 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestingPackage // Pivot.ecore::pivot::Package::nestingPackage http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nestingPackage
		Property symbol_173 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsPrefix // Pivot.ecore::pivot::Package::nsPrefix http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsPrefix
		Property symbol_174 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsURI // Pivot.ecore::pivot::Package::nsURI http://www.eclipse.org/ocl/3.1.0/Pivot!Package!nsURI
		Property symbol_175 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedPrecedence // Pivot.ecore::pivot::Package::ownedPrecedence http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedPrecedence
		Property symbol_176 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedType // Pivot.ecore::pivot::Package::ownedType http://www.eclipse.org/ocl/3.1.0/Pivot!Package!ownedType
		
		Class symbol_177 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PackageableElement
		
		Class symbol_178 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
		Property symbol_179 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Iteration // Pivot.ecore::pivot::Parameter::Iteration http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Iteration
		Property symbol_180 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Variable // Pivot.ecore::pivot::Parameter::Variable http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!Variable
		Property symbol_181 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!operation // Pivot.ecore::pivot::Parameter::operation http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter!operation
		
		Class symbol_182 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		Property symbol_183 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameter // Pivot.ecore::pivot::ParameterableElement::TemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameter
		Property symbol_184 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameterSubstitution // Pivot.ecore::pivot::ParameterableElement::TemplateParameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!TemplateParameterSubstitution
		Property symbol_185 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!owningTemplateParameter // Pivot.ecore::pivot::ParameterableElement::owningTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!owningTemplateParameter
		Property symbol_186 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!templateParameter // Pivot.ecore::pivot::ParameterableElement::templateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!templateParameter
		
		Class symbol_187 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Pivotable
		
		Class symbol_188 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
		Property symbol_189 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Operation // Pivot.ecore::pivot::Precedence::Operation http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Operation
		Property symbol_190 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Package // Pivot.ecore::pivot::Precedence::Package http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!Package
		Property symbol_191 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!associativity // Pivot.ecore::pivot::Precedence::associativity http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!associativity
		Property symbol_192 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!order // Pivot.ecore::pivot::Precedence::order http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence!order
		
		Class symbol_193 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		
		Class symbol_194 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveType
		
		Class symbol_195 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
		Property symbol_196 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!NavigationCallExp // Pivot.ecore::pivot::Property::NavigationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!Property!NavigationCallExp
		Property symbol_197 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!Property // Pivot.ecore::pivot::Property::Property http://www.eclipse.org/ocl/3.1.0/Pivot!Property!Property
		Property symbol_198 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!PropertyCallExp // Pivot.ecore::pivot::Property::PropertyCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!Property!PropertyCallExp
		Property symbol_199 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!association // Pivot.ecore::pivot::Property::association http://www.eclipse.org/ocl/3.1.0/Pivot!Property!association
		Property symbol_200 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!class // Pivot.ecore::pivot::Property::class http://www.eclipse.org/ocl/3.1.0/Pivot!Property!class
		Property symbol_201 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!default // Pivot.ecore::pivot::Property::default http://www.eclipse.org/ocl/3.1.0/Pivot!Property!default
		Property symbol_202 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!implicit // Pivot.ecore::pivot::Property::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!Property!implicit
		Property symbol_203 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isComposite // Pivot.ecore::pivot::Property::isComposite http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isComposite
		Property symbol_204 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isDerived // Pivot.ecore::pivot::Property::isDerived http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isDerived
		Property symbol_205 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isID // Pivot.ecore::pivot::Property::isID http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isID
		Property symbol_206 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isReadOnly // Pivot.ecore::pivot::Property::isReadOnly http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isReadOnly
		Property symbol_207 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isResolveProxies // Pivot.ecore::pivot::Property::isResolveProxies http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isResolveProxies
		Property symbol_208 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isTransient // Pivot.ecore::pivot::Property::isTransient http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isTransient
		Property symbol_209 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isUnsettable // Pivot.ecore::pivot::Property::isUnsettable http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isUnsettable
		Property symbol_210 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isVolatile // Pivot.ecore::pivot::Property::isVolatile http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isVolatile
		Property symbol_211 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!keys // Pivot.ecore::pivot::Property::keys http://www.eclipse.org/ocl/3.1.0/Pivot!Property!keys
		Property symbol_212 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!opposite // Pivot.ecore::pivot::Property::opposite http://www.eclipse.org/ocl/3.1.0/Pivot!Property!opposite
		Property symbol_213 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!owningType // Pivot.ecore::pivot::Property::owningType http://www.eclipse.org/ocl/3.1.0/Pivot!Property!owningType
		
		Class symbol_214 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
		Property symbol_215 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp!referredProperty // Pivot.ecore::pivot::PropertyCallExp::referredProperty http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp!referredProperty
		
		PrimitiveType symbol_216 = standardLibrary.getRealType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Real
		Class symbol_217 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp
		Property symbol_218 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp!realSymbol // Pivot.ecore::pivot::RealLiteralExp::realSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp!realSymbol
		
		Class symbol_219 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SelfType
		
		Class symbol_220 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
		Property symbol_221 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!MessageExp // Pivot.ecore::pivot::SendSignalAction::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!MessageExp
		Property symbol_222 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!signal // Pivot.ecore::pivot::SendSignalAction::signal http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction!signal
		
		Class symbol_223 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SequenceType
		
		Class symbol_224 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!SetType
		
		Class symbol_225 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
		Property symbol_226 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!MessageType // Pivot.ecore::pivot::Signal::MessageType http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!MessageType
		Property symbol_227 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!SendSignalAction // Pivot.ecore::pivot::Signal::SendSignalAction http://www.eclipse.org/ocl/3.1.0/Pivot!Signal!SendSignalAction
		
		Class symbol_228 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!State
		Property symbol_229 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!State!StateExp // Pivot.ecore::pivot::State::StateExp http://www.eclipse.org/ocl/3.1.0/Pivot!State!StateExp
		
		Class symbol_230 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
		Property symbol_231 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp!referredState // Pivot.ecore::pivot::StateExp::referredState http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp!referredState
		
		PrimitiveType symbol_232 = standardLibrary.getStringType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!String
		Class symbol_233 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp
		Property symbol_234 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp!stringSymbol // Pivot.ecore::pivot::StringLiteralExp::stringSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp!stringSymbol
		
		Class symbol_235 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
		Property symbol_236 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!boundElement // Pivot.ecore::pivot::TemplateBinding::boundElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!boundElement
		Property symbol_237 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!parameterSubstitution // Pivot.ecore::pivot::TemplateBinding::parameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!parameterSubstitution
		Property symbol_238 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!signature // Pivot.ecore::pivot::TemplateBinding::signature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding!signature
		
		Class symbol_239 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		Property symbol_240 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateParameterSubstitution // Pivot.ecore::pivot::TemplateParameter::TemplateParameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateParameterSubstitution
		Property symbol_241 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateSignature // Pivot.ecore::pivot::TemplateParameter::TemplateSignature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!TemplateSignature
		Property symbol_242 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!default // Pivot.ecore::pivot::TemplateParameter::default http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!default
		Property symbol_243 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedDefault // Pivot.ecore::pivot::TemplateParameter::ownedDefault http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedDefault
		Property symbol_244 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedParameteredElement // Pivot.ecore::pivot::TemplateParameter::ownedParameteredElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!ownedParameteredElement
		Property symbol_245 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!parameteredElement // Pivot.ecore::pivot::TemplateParameter::parameteredElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!parameteredElement
		Property symbol_246 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!signature // Pivot.ecore::pivot::TemplateParameter::signature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter!signature
		
		Class symbol_247 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
		Property symbol_248 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!actual // Pivot.ecore::pivot::TemplateParameterSubstitution::actual http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!actual
		Property symbol_249 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!formal // Pivot.ecore::pivot::TemplateParameterSubstitution::formal http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!formal
		Property symbol_250 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!ownedActual // Pivot.ecore::pivot::TemplateParameterSubstitution::ownedActual http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!ownedActual
		Property symbol_251 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!templateBinding // Pivot.ecore::pivot::TemplateParameterSubstitution::templateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution!templateBinding
		
		Class symbol_252 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType
		Property symbol_253 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType!specification // Pivot.ecore::pivot::TemplateParameterType::specification http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType!specification
		
		Class symbol_254 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
		Property symbol_255 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!TemplateBinding // Pivot.ecore::pivot::TemplateSignature::TemplateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!TemplateBinding
		Property symbol_256 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!ownedParameter // Pivot.ecore::pivot::TemplateSignature::ownedParameter http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!ownedParameter
		Property symbol_257 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!parameter // Pivot.ecore::pivot::TemplateSignature::parameter http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!parameter
		Property symbol_258 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!template // Pivot.ecore::pivot::TemplateSignature::template http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature!template
		
		Class symbol_259 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		Property symbol_260 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!ownedTemplateSignature // Pivot.ecore::pivot::TemplateableElement::ownedTemplateSignature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!ownedTemplateSignature
		Property symbol_261 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!templateBinding // Pivot.ecore::pivot::TemplateableElement::templateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!templateBinding
		Property symbol_262 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!unspecializedElement // Pivot.ecore::pivot::TemplateableElement::unspecializedElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!unspecializedElement
		
		DataType symbol_263 = PivotFactory.eINSTANCE.createDataType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Throwable
		
		Class symbol_264 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
		Property symbol_265 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp!part // Pivot.ecore::pivot::TupleLiteralExp::part http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp!part
		
		Class symbol_266 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
		Property symbol_267 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!TupleLiteralExp // Pivot.ecore::pivot::TupleLiteralPart::TupleLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!TupleLiteralExp
		Property symbol_268 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!initExpression // Pivot.ecore::pivot::TupleLiteralPart::initExpression http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart!initExpression
		
		Class symbol_269 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleType
		
		Class symbol_270 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		Property symbol_271 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ClassifierType // Pivot.ecore::pivot::Type::ClassifierType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ClassifierType
		Property symbol_272 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!CollectionType // Pivot.ecore::pivot::Type::CollectionType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!CollectionType
		Property symbol_273 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!DataType // Pivot.ecore::pivot::Type::DataType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!DataType
		Property symbol_274 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!LambdaType // Pivot.ecore::pivot::Type::LambdaType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!LambdaType
		Property symbol_275 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Operation // Pivot.ecore::pivot::Type::Operation http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Operation
		Property symbol_276 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Type // Pivot.ecore::pivot::Type::Type http://www.eclipse.org/ocl/3.1.0/Pivot!Type!Type
		Property symbol_277 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeExp // Pivot.ecore::pivot::Type::TypeExp http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeExp
		Property symbol_278 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeTemplateParameter // Pivot.ecore::pivot::Type::TypeTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypeTemplateParameter
		Property symbol_279 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypedElement // Pivot.ecore::pivot::Type::TypedElement http://www.eclipse.org/ocl/3.1.0/Pivot!Type!TypedElement
		Property symbol_280 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!UnspecifiedType // Pivot.ecore::pivot::Type::UnspecifiedType http://www.eclipse.org/ocl/3.1.0/Pivot!Type!UnspecifiedType
		Property symbol_281 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!instanceClassName // Pivot.ecore::pivot::Type::instanceClassName http://www.eclipse.org/ocl/3.1.0/Pivot!Type!instanceClassName
		Property symbol_282 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedAttribute // Pivot.ecore::pivot::Type::ownedAttribute http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedAttribute
		Property symbol_283 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedOperation // Pivot.ecore::pivot::Type::ownedOperation http://www.eclipse.org/ocl/3.1.0/Pivot!Type!ownedOperation
		Property symbol_284 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!package // Pivot.ecore::pivot::Type::package http://www.eclipse.org/ocl/3.1.0/Pivot!Type!package
		Property symbol_285 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type!superClass // Pivot.ecore::pivot::Type::superClass http://www.eclipse.org/ocl/3.1.0/Pivot!Type!superClass
		
		Class symbol_286 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
		Property symbol_287 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp!referredType // Pivot.ecore::pivot::TypeExp::referredType http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp!referredType
		
		Class symbol_288 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
		Property symbol_289 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!allowSubstitutable // Pivot.ecore::pivot::TypeTemplateParameter::allowSubstitutable http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!allowSubstitutable
		Property symbol_290 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!constrainingType // Pivot.ecore::pivot::TypeTemplateParameter::constrainingType http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter!constrainingType
		
		Class symbol_291 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		Property symbol_292 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement!type // Pivot.ecore::pivot::TypedElement::type http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement!type
		
		Class symbol_293 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		
		PrimitiveType symbol_294 = standardLibrary.getUnlimitedNaturalType(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
		Class symbol_295 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp
		Property symbol_296 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp!unlimitedNaturalSymbol // Pivot.ecore::pivot::UnlimitedNaturalLiteralExp::unlimitedNaturalSymbol http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp!unlimitedNaturalSymbol
		
		Class symbol_297 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
		Property symbol_298 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!lowerBound // Pivot.ecore::pivot::UnspecifiedType::lowerBound http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!lowerBound
		Property symbol_299 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!upperBound // Pivot.ecore::pivot::UnspecifiedType::upperBound http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType!upperBound
		
		Class symbol_300 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedValueExp
		
		Class symbol_301 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		Property symbol_302 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!Constraint // Pivot.ecore::pivot::ValueSpecification::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!Constraint
		
		Class symbol_303 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
		Property symbol_304 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!ExpressionInOcl // Pivot.ecore::pivot::Variable::ExpressionInOcl http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!ExpressionInOcl
		Property symbol_305 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!IterateExp // Pivot.ecore::pivot::Variable::IterateExp http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!IterateExp
		Property symbol_306 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LetExp // Pivot.ecore::pivot::Variable::LetExp http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LetExp
		Property symbol_307 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LoopExp // Pivot.ecore::pivot::Variable::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!LoopExp
		Property symbol_308 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!implicit // Pivot.ecore::pivot::Variable::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!implicit
		Property symbol_309 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!initExpression // Pivot.ecore::pivot::Variable::initExpression http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!initExpression
		Property symbol_310 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!representedParameter // Pivot.ecore::pivot::Variable::representedParameter http://www.eclipse.org/ocl/3.1.0/Pivot!Variable!representedParameter
		
		Class symbol_311 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		Property symbol_312 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration!VariableExp // Pivot.ecore::pivot::VariableDeclaration::VariableExp http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration!VariableExp
		
		Class symbol_313 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
		Property symbol_314 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!implicit // Pivot.ecore::pivot::VariableExp::implicit http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!implicit
		Property symbol_315 = PivotFactory.eINSTANCE.createProperty(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!referredVariable // Pivot.ecore::pivot::VariableExp::referredVariable http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp!referredVariable
		
		Class symbol_316 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		
		Class symbol_317 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}
		TemplateSignature symbol_318 = PivotFactory.eINSTANCE.createTemplateSignature(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}!
		TypeTemplateParameter symbol_319 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_320 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}?R
		TypeTemplateParameter symbol_321 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_322 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}?C
		
		
		Class symbol_323 = PivotFactory.eINSTANCE.createClass(); // http://www.eclipse.org/ocl/3.1.0/Pivot!VoidType
		

		symbol_0.setName("pivot");
		symbol_0.setNsPrefix("pivot");
		symbol_0.setNsURI("http://www.eclipse.org/ocl/3.1.0/Pivot");
		//
		// Pivot.ecore::pivot::Annotation http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
		//
		symbol_1.setName("Annotation");
		symbol_1.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::Annotation::NamedElement
			symbol_2.setName("NamedElement");
			symbol_2.setType(symbol_126);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
			symbol_2.setLower(BigInteger.valueOf(0));
			
			symbol_2.setImplicit(true);
			symbol_2.setIsResolveProxies(true);
			symbol_2.setOpposite(symbol_129);
			
			symbol_1.getOwnedAttributes().add(symbol_2);
		}
		{ // Pivot.ecore::pivot::Annotation::ownedContent
			symbol_3.setName("ownedContent");
			symbol_3.setType(symbol_57);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_3.setLower(BigInteger.valueOf(0));
			symbol_3.setUpper(BigInteger.valueOf(-1));
			symbol_3.setIsOrdered(true);
			
			symbol_3.setIsComposite(true);
			symbol_3.setIsResolveProxies(true);
			
			symbol_1.getOwnedAttributes().add(symbol_3);
		}
		{ // Pivot.ecore::pivot::Annotation::ownedDetail
			symbol_4.setName("ownedDetail");
			symbol_4.setType(symbol_54);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
			symbol_4.setLower(BigInteger.valueOf(0));
			symbol_4.setUpper(BigInteger.valueOf(-1));
			symbol_4.setIsOrdered(true);
			
			symbol_4.setIsComposite(true);
			symbol_4.setIsResolveProxies(true);
			symbol_4.setOpposite(symbol_55);
			
			symbol_1.getOwnedAttributes().add(symbol_4);
		}
		{ // Pivot.ecore::pivot::Annotation::reference
			symbol_5.setName("reference");
			symbol_5.setType(symbol_57);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_5.setLower(BigInteger.valueOf(0));
			symbol_5.setUpper(BigInteger.valueOf(-1));
			symbol_5.setIsOrdered(true);
			
			symbol_5.setIsResolveProxies(true);
			symbol_5.setOpposite(symbol_58);
			
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
			symbol_9.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_9.setLower(BigInteger.valueOf(0));
			symbol_9.setUpper(BigInteger.valueOf(-1));
			
			symbol_9.setIsResolveProxies(true);
			symbol_9.setOpposite(symbol_199);
			
			symbol_7.getOwnedAttributes().add(symbol_9);
		}
		
		symbol_0.getOwnedTypes().add(symbol_7); // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
		//
		// Pivot.ecore::pivot::AssociationClassCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClassCallExp
		//
		symbol_10.setName("AssociationClassCallExp");
		symbol_10.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
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
			EnumerationLiteral symbol_324 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::AssociativityKind::Left http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind!Left
			symbol_324.setName("Left");
			symbol_12.getOwnedLiterals().add(symbol_324);
			EnumerationLiteral symbol_325 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::AssociativityKind::Right http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind!Right
			symbol_325.setName("Right");
			symbol_12.getOwnedLiterals().add(symbol_325);
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
		symbol_15.getSuperClasses().add(symbol_193); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
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
		symbol_17.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::CallExp::implicit
			symbol_18.setName("implicit");
			symbol_18.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_18.setLower(BigInteger.valueOf(0));
			
			symbol_18.setIsResolveProxies(true);
			
			symbol_17.getOwnedAttributes().add(symbol_18);
		}
		{ // Pivot.ecore::pivot::CallExp::source
			symbol_19.setName("source");
			symbol_19.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_19.setLower(BigInteger.valueOf(0));
			
			symbol_19.setIsComposite(true);
			symbol_19.setIsResolveProxies(true);
			symbol_19.setOpposite(symbol_139);
			
			symbol_17.getOwnedAttributes().add(symbol_19);
		}
		
		symbol_0.getOwnedTypes().add(symbol_17); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		//
		// Pivot.ecore::pivot::CallOperationAction http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
		//
		symbol_20.setName("CallOperationAction");
		symbol_20.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::CallOperationAction::MessageExp
			symbol_21.setName("MessageExp");
			symbol_21.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
			symbol_21.setLower(BigInteger.valueOf(0));
			
			symbol_21.setImplicit(true);
			symbol_21.setIsResolveProxies(true);
			symbol_21.setOpposite(symbol_114);
			
			symbol_20.getOwnedAttributes().add(symbol_21);
		}
		{ // Pivot.ecore::pivot::CallOperationAction::operation
			symbol_22.setName("operation");
			symbol_22.setType(symbol_156);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			
			symbol_22.setIsResolveProxies(true);
			symbol_22.setOpposite(symbol_157);
			
			symbol_20.getOwnedAttributes().add(symbol_22);
		}
		
		symbol_0.getOwnedTypes().add(symbol_20); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
		//
		// Pivot.ecore::pivot::Class http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		//
		symbol_23.setName("Class");
		symbol_23.getSuperClasses().add(symbol_270); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		symbol_23.getSuperClasses().add(symbol_131); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		{ // Pivot.ecore::pivot::Class::isAbstract
			symbol_24.setName("isAbstract");
			symbol_24.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_24.setIsResolveProxies(true);
			{
				Comment symbol_326 = PivotFactory.eINSTANCE.createComment();
				symbol_326.setBody("True when a class is abstract.");
				symbol_24.getOwnedComments().add(symbol_326);
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
			Comment symbol_327 = PivotFactory.eINSTANCE.createComment();
			symbol_327.setBody("A class is a type that has objects as its instances.");
			symbol_23.getOwnedComments().add(symbol_327);
		}
		
		symbol_0.getOwnedTypes().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		//
		// Pivot.ecore::pivot::ClassifierType http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
		//
		symbol_26.setName("ClassifierType");
		symbol_26.getSuperClasses().add(symbol_51); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // Pivot.ecore::pivot::ClassifierType::instanceType
			symbol_27.setName("instanceType");
			symbol_27.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_27.setIsResolveProxies(true);
			symbol_27.setOpposite(symbol_271);
			
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
			symbol_29.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_29.setIsComposite(true);
			symbol_29.setIsResolveProxies(true);
			symbol_29.setOpposite(symbol_140);
			
			symbol_28.getOwnedAttributes().add(symbol_29);
		}
		
		symbol_0.getOwnedTypes().add(symbol_28); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
		//
		// Pivot.ecore::pivot::CollectionKind http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
		//
		symbol_30.setName("CollectionKind");
		{
			EnumerationLiteral symbol_328 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::CollectionKind::Collection http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Collection
			symbol_328.setName("Collection");
			symbol_30.getOwnedLiterals().add(symbol_328);
			EnumerationLiteral symbol_329 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::CollectionKind::Set http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Set
			symbol_329.setName("Set");
			symbol_30.getOwnedLiterals().add(symbol_329);
			EnumerationLiteral symbol_330 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::CollectionKind::OrderedSet http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!OrderedSet
			symbol_330.setName("OrderedSet");
			symbol_30.getOwnedLiterals().add(symbol_330);
			EnumerationLiteral symbol_331 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::CollectionKind::Bag http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Bag
			symbol_331.setName("Bag");
			symbol_30.getOwnedLiterals().add(symbol_331);
			EnumerationLiteral symbol_332 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // Pivot.ecore::pivot::CollectionKind::Sequence http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind!Sequence
			symbol_332.setName("Sequence");
			symbol_30.getOwnedLiterals().add(symbol_332);
		}
		
		symbol_0.getOwnedTypes().add(symbol_30); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionKind
		//
		// Pivot.ecore::pivot::CollectionLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionLiteralExp
		//
		symbol_31.setName("CollectionLiteralExp");
		symbol_31.getSuperClasses().add(symbol_107); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
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
		symbol_34.getSuperClasses().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
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
			symbol_37.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_37.setIsComposite(true);
			symbol_37.setIsResolveProxies(true);
			
			symbol_36.getOwnedAttributes().add(symbol_37);
		}
		{ // Pivot.ecore::pivot::CollectionRange::last
			symbol_38.setName("last");
			symbol_38.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_38.setIsComposite(true);
			symbol_38.setIsResolveProxies(true);
			symbol_38.setOpposite(symbol_141);
			
			symbol_36.getOwnedAttributes().add(symbol_38);
		}
		
		symbol_0.getOwnedTypes().add(symbol_36); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
		//
		// Pivot.ecore::pivot::CollectionType http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		//
		symbol_39.setName("CollectionType");
		symbol_39.getSuperClasses().add(symbol_51); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // Pivot.ecore::pivot::CollectionType::elementType
			symbol_40.setName("elementType");
			symbol_40.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_40.setIsResolveProxies(true);
			symbol_40.setOpposite(symbol_272);
			
			symbol_39.getOwnedAttributes().add(symbol_40);
		}
		
		symbol_0.getOwnedTypes().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		//
		// Pivot.ecore::pivot::Comment http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
		//
		symbol_41.setName("Comment");
		symbol_41.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::Comment::Element
			symbol_42.setName("Element");
			symbol_42.setType(symbol_57);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_42.setLower(BigInteger.valueOf(0));
			
			symbol_42.setImplicit(true);
			symbol_42.setIsResolveProxies(true);
			symbol_42.setOpposite(symbol_61);
			
			symbol_41.getOwnedAttributes().add(symbol_42);
		}
		{ // Pivot.ecore::pivot::Comment::annotatedElement
			symbol_43.setName("annotatedElement");
			symbol_43.setType(symbol_57);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_43.setLower(BigInteger.valueOf(0));
			symbol_43.setUpper(BigInteger.valueOf(-1));
			
			symbol_43.setIsResolveProxies(true);
			symbol_43.setOpposite(symbol_59);
			{
				Comment symbol_333 = PivotFactory.eINSTANCE.createComment();
				symbol_333.setBody("References the Element(s) being commented.");
				symbol_43.getOwnedComments().add(symbol_333);
			}
			
			symbol_41.getOwnedAttributes().add(symbol_43);
		}
		{ // Pivot.ecore::pivot::Comment::body
			symbol_44.setName("body");
			symbol_44.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_44.setLower(BigInteger.valueOf(0));
			
			symbol_44.setIsResolveProxies(true);
			{
				Comment symbol_334 = PivotFactory.eINSTANCE.createComment();
				symbol_334.setBody("Specifies a string that is the comment.");
				symbol_44.getOwnedComments().add(symbol_334);
			}
			
			symbol_41.getOwnedAttributes().add(symbol_44);
		}
		{
			Comment symbol_335 = PivotFactory.eINSTANCE.createComment();
			symbol_335.setBody("A comment is a textual annotation that can be attached to a set of elements.");
			symbol_41.getOwnedComments().add(symbol_335);
		}
		
		symbol_0.getOwnedTypes().add(symbol_41); // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
		//
		// Pivot.ecore::pivot::Constraint http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
		//
		symbol_45.setName("Constraint");
		symbol_45.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::Constraint::constrainedElement
			symbol_46.setName("constrainedElement");
			symbol_46.setType(symbol_57);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_46.setLower(BigInteger.valueOf(0));
			symbol_46.setUpper(BigInteger.valueOf(-1));
			symbol_46.setIsOrdered(true);
			
			symbol_46.setIsResolveProxies(true);
			symbol_46.setOpposite(symbol_60);
			{
				Comment symbol_336 = PivotFactory.eINSTANCE.createComment();
				symbol_336.setBody("The ordered set of Elements referenced by this Constraint.");
				symbol_46.getOwnedComments().add(symbol_336);
			}
			
			symbol_45.getOwnedAttributes().add(symbol_46);
		}
		{ // Pivot.ecore::pivot::Constraint::context
			symbol_47.setName("context");
			symbol_47.setType(symbol_126);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
			symbol_47.setLower(BigInteger.valueOf(0));
			
			symbol_47.setIsResolveProxies(true);
			symbol_47.setOpposite(symbol_130);
			
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
			symbol_49.setType(symbol_301);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
			
			symbol_49.setIsComposite(true);
			symbol_49.setIsResolveProxies(true);
			symbol_49.setOpposite(symbol_302);
			{
				Comment symbol_337 = PivotFactory.eINSTANCE.createComment();
				symbol_337.setBody("A condition that must be true when evaluated in order for the constraint to be satisfied.");
				symbol_49.getOwnedComments().add(symbol_337);
			}
			
			symbol_45.getOwnedAttributes().add(symbol_49);
		}
		{ // Pivot.ecore::pivot::Constraint::stereotype
			symbol_50.setName("stereotype");
			symbol_50.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_50.setLower(BigInteger.valueOf(0));
			
			symbol_50.setIsResolveProxies(true);
			
			symbol_45.getOwnedAttributes().add(symbol_50);
		}
		{
			Comment symbol_338 = PivotFactory.eINSTANCE.createComment();
			symbol_338.setBody("A constraint is a condition or restriction expressed in natural language text or in a machine readable language for the purpose of declaring some of the semantics of an element.");
			symbol_45.getOwnedComments().add(symbol_338);
		}
		
		symbol_0.getOwnedTypes().add(symbol_45); // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
		//
		// Pivot.ecore::pivot::DataType http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		//
		symbol_51.setName("DataType");
		symbol_51.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		{ // Pivot.ecore::pivot::DataType::behavioralType
			symbol_52.setName("behavioralType");
			symbol_52.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_52.setLower(BigInteger.valueOf(0));
			
			symbol_52.setIsResolveProxies(true);
			symbol_52.setOpposite(symbol_273);
			
			symbol_51.getOwnedAttributes().add(symbol_52);
		}
		{ // Pivot.ecore::pivot::DataType::isSerializable
			symbol_53.setName("isSerializable");
			symbol_53.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_53.setIsResolveProxies(true);
			
			symbol_51.getOwnedAttributes().add(symbol_53);
		}
		{
			Comment symbol_339 = PivotFactory.eINSTANCE.createComment();
			symbol_339.setBody("DataType is an abstract class that acts as a common superclass for different kinds of data types.");
			symbol_51.getOwnedComments().add(symbol_339);
		}
		
		symbol_0.getOwnedTypes().add(symbol_51); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		//
		// Pivot.ecore::pivot::Detail http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
		//
		symbol_54.setName("Detail");
		symbol_54.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::Detail::Annotation
			symbol_55.setName("Annotation");
			symbol_55.setType(symbol_1);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
			symbol_55.setLower(BigInteger.valueOf(0));
			
			symbol_55.setImplicit(true);
			symbol_55.setIsResolveProxies(true);
			symbol_55.setOpposite(symbol_4);
			
			symbol_54.getOwnedAttributes().add(symbol_55);
		}
		{ // Pivot.ecore::pivot::Detail::value
			symbol_56.setName("value");
			symbol_56.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_56.setUpper(BigInteger.valueOf(-1));
			
			symbol_56.setIsResolveProxies(true);
			
			symbol_54.getOwnedAttributes().add(symbol_56);
		}
		
		symbol_0.getOwnedTypes().add(symbol_54); // http://www.eclipse.org/ocl/3.1.0/Pivot!Detail
		//
		// Pivot.ecore::pivot::Element http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		//
		symbol_57.setName("Element");
		symbol_57.getSuperClasses().add(symbol_316); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		{ // Pivot.ecore::pivot::Element::Annotation
			symbol_58.setName("Annotation");
			symbol_58.setType(symbol_1);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
			symbol_58.setLower(BigInteger.valueOf(0));
			symbol_58.setUpper(BigInteger.valueOf(-1));
			
			symbol_58.setImplicit(true);
			symbol_58.setIsResolveProxies(true);
			
			symbol_57.getOwnedAttributes().add(symbol_58);
		}
		{ // Pivot.ecore::pivot::Element::Comment
			symbol_59.setName("Comment");
			symbol_59.setType(symbol_41);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
			symbol_59.setLower(BigInteger.valueOf(0));
			symbol_59.setUpper(BigInteger.valueOf(-1));
			
			symbol_59.setImplicit(true);
			symbol_59.setIsResolveProxies(true);
			symbol_59.setOpposite(symbol_43);
			
			symbol_57.getOwnedAttributes().add(symbol_59);
		}
		{ // Pivot.ecore::pivot::Element::Constraint
			symbol_60.setName("Constraint");
			symbol_60.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_60.setLower(BigInteger.valueOf(0));
			symbol_60.setUpper(BigInteger.valueOf(-1));
			
			symbol_60.setImplicit(true);
			symbol_60.setIsResolveProxies(true);
			symbol_60.setOpposite(symbol_46);
			
			symbol_57.getOwnedAttributes().add(symbol_60);
		}
		{ // Pivot.ecore::pivot::Element::ownedComment
			symbol_61.setName("ownedComment");
			symbol_61.setType(symbol_41);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Comment
			symbol_61.setLower(BigInteger.valueOf(0));
			symbol_61.setUpper(BigInteger.valueOf(-1));
			
			symbol_61.setIsComposite(true);
			symbol_61.setIsResolveProxies(true);
			symbol_61.setOpposite(symbol_42);
			{
				Comment symbol_340 = PivotFactory.eINSTANCE.createComment();
				symbol_340.setBody("The Comments owned by this element.");
				symbol_61.getOwnedComments().add(symbol_340);
			}
			
			symbol_57.getOwnedAttributes().add(symbol_61);
		}
		{	// Pivot.ecore::pivot::Element::allOwnedElements()
			Operation symbol_341 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element!allOwnedElements()
			symbol_341.setName("allOwnedElements");
			symbol_341.setType(symbol_57);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
			symbol_341.setLower(BigInteger.valueOf(0));
			symbol_341.setUpper(BigInteger.valueOf(-1));
			
			
			symbol_57.getOwnedOperations().add(symbol_341);
		}
		{
			Comment symbol_342 = PivotFactory.eINSTANCE.createComment();
			symbol_342.setBody("An element is a constituent of a model.");
			symbol_57.getOwnedComments().add(symbol_342);
		}
		
		symbol_0.getOwnedTypes().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		//
		// Pivot.ecore::pivot::EnumLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
		//
		symbol_62.setName("EnumLiteralExp");
		symbol_62.getSuperClasses().add(symbol_107); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		{ // Pivot.ecore::pivot::EnumLiteralExp::referredEnumLiteral
			symbol_63.setName("referredEnumLiteral");
			symbol_63.setType(symbol_66);  // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
			symbol_63.setLower(BigInteger.valueOf(0));
			
			symbol_63.setIsResolveProxies(true);
			symbol_63.setOpposite(symbol_67);
			
			symbol_62.getOwnedAttributes().add(symbol_63);
		}
		
		symbol_0.getOwnedTypes().add(symbol_62); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
		//
		// Pivot.ecore::pivot::Enumeration http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
		//
		symbol_64.setName("Enumeration");
		symbol_64.getSuperClasses().add(symbol_51); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // Pivot.ecore::pivot::Enumeration::ownedLiteral
			symbol_65.setName("ownedLiteral");
			symbol_65.setType(symbol_66);  // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
			symbol_65.setLower(BigInteger.valueOf(0));
			symbol_65.setUpper(BigInteger.valueOf(-1));
			symbol_65.setIsOrdered(true);
			
			symbol_65.setIsComposite(true);
			symbol_65.setIsResolveProxies(true);
			symbol_65.setOpposite(symbol_68);
			{
				Comment symbol_343 = PivotFactory.eINSTANCE.createComment();
				symbol_343.setBody("The ordered set of literals for this Enumeration.");
				symbol_65.getOwnedComments().add(symbol_343);
			}
			
			symbol_64.getOwnedAttributes().add(symbol_65);
		}
		{
			Comment symbol_344 = PivotFactory.eINSTANCE.createComment();
			symbol_344.setBody("An enumeration defines a set of literals that can be used as its values.");
			symbol_64.getOwnedComments().add(symbol_344);
		}
		
		symbol_0.getOwnedTypes().add(symbol_64); // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
		//
		// Pivot.ecore::pivot::EnumerationLiteral http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
		//
		symbol_66.setName("EnumerationLiteral");
		symbol_66.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::EnumerationLiteral::EnumLiteralExp
			symbol_67.setName("EnumLiteralExp");
			symbol_67.setType(symbol_62);  // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumLiteralExp
			symbol_67.setLower(BigInteger.valueOf(0));
			symbol_67.setUpper(BigInteger.valueOf(-1));
			
			symbol_67.setImplicit(true);
			symbol_67.setIsResolveProxies(true);
			symbol_67.setOpposite(symbol_63);
			
			symbol_66.getOwnedAttributes().add(symbol_67);
		}
		{ // Pivot.ecore::pivot::EnumerationLiteral::enumeration
			symbol_68.setName("enumeration");
			symbol_68.setType(symbol_64);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Enumeration
			symbol_68.setLower(BigInteger.valueOf(0));
			
			symbol_68.setIsResolveProxies(true);
			symbol_68.setOpposite(symbol_65);
			{
				Comment symbol_345 = PivotFactory.eINSTANCE.createComment();
				symbol_345.setBody("The Enumeration that this EnumerationLiteral is a member of.");
				symbol_68.getOwnedComments().add(symbol_345);
			}
			
			symbol_66.getOwnedAttributes().add(symbol_68);
		}
		{ // Pivot.ecore::pivot::EnumerationLiteral::value
			symbol_69.setName("value");
			symbol_69.setType(symbol_86);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			symbol_69.setLower(BigInteger.valueOf(0));
			
			symbol_69.setIsResolveProxies(true);
			
			symbol_66.getOwnedAttributes().add(symbol_69);
		}
		{
			Comment symbol_346 = PivotFactory.eINSTANCE.createComment();
			symbol_346.setBody("An enumeration literal is a value of an enumeration.");
			symbol_66.getOwnedComments().add(symbol_346);
		}
		
		symbol_0.getOwnedTypes().add(symbol_66); // http://www.eclipse.org/ocl/3.1.0/Pivot!EnumerationLiteral
		//
		// Pivot.ecore::pivot::ExpressionInOcl http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
		//
		symbol_70.setName("ExpressionInOcl");
		symbol_70.getSuperClasses().add(symbol_151); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		{ // Pivot.ecore::pivot::ExpressionInOcl::bodyExpression
			symbol_71.setName("bodyExpression");
			symbol_71.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_71.setIsComposite(true);
			symbol_71.setIsResolveProxies(true);
			symbol_71.setOpposite(symbol_142);
			
			symbol_70.getOwnedAttributes().add(symbol_71);
		}
		{ // Pivot.ecore::pivot::ExpressionInOcl::contextVariable
			symbol_72.setName("contextVariable");
			symbol_72.setType(symbol_303);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_72.setLower(BigInteger.valueOf(0));
			
			symbol_72.setIsComposite(true);
			symbol_72.setIsResolveProxies(true);
			
			symbol_70.getOwnedAttributes().add(symbol_72);
		}
		{ // Pivot.ecore::pivot::ExpressionInOcl::messageExpression
			symbol_73.setName("messageExpression");
			symbol_73.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_73.setLower(BigInteger.valueOf(0));
			
			symbol_73.setIsComposite(true);
			symbol_73.setIsResolveProxies(true);
			
			symbol_70.getOwnedAttributes().add(symbol_73);
		}
		{ // Pivot.ecore::pivot::ExpressionInOcl::parameterVariable
			symbol_74.setName("parameterVariable");
			symbol_74.setType(symbol_303);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_74.setLower(BigInteger.valueOf(0));
			symbol_74.setUpper(BigInteger.valueOf(-1));
			symbol_74.setIsOrdered(true);
			
			symbol_74.setIsComposite(true);
			symbol_74.setIsResolveProxies(true);
			
			symbol_70.getOwnedAttributes().add(symbol_74);
		}
		{ // Pivot.ecore::pivot::ExpressionInOcl::resultVariable
			symbol_75.setName("resultVariable");
			symbol_75.setType(symbol_303);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_75.setLower(BigInteger.valueOf(0));
			
			symbol_75.setIsComposite(true);
			symbol_75.setIsResolveProxies(true);
			symbol_75.setOpposite(symbol_304);
			
			symbol_70.getOwnedAttributes().add(symbol_75);
		}
		
		symbol_0.getOwnedTypes().add(symbol_70); // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
		//
		// Pivot.ecore::pivot::Feature http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		//
		symbol_76.setName("Feature");
		symbol_76.getSuperClasses().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		{ // Pivot.ecore::pivot::Feature::implementation
			symbol_77.setName("implementation");
			symbol_77.setType(symbol_106);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LibraryFeature
			symbol_77.setLower(BigInteger.valueOf(0));
			
			symbol_77.setIsResolveProxies(true);
			symbol_77.setIsTransient(true);
			
			symbol_76.getOwnedAttributes().add(symbol_77);
		}
		{ // Pivot.ecore::pivot::Feature::implementationClass
			symbol_78.setName("implementationClass");
			symbol_78.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_78.setLower(BigInteger.valueOf(0));
			
			symbol_78.setIsResolveProxies(true);
			
			symbol_76.getOwnedAttributes().add(symbol_78);
		}
		
		symbol_0.getOwnedTypes().add(symbol_76); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		//
		// Pivot.ecore::pivot::FeatureCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		//
		symbol_79.setName("FeatureCallExp");
		symbol_79.getSuperClasses().add(symbol_17); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		{ // Pivot.ecore::pivot::FeatureCallExp::isPre
			symbol_80.setName("isPre");
			symbol_80.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_80.setIsResolveProxies(true);
			
			symbol_79.getOwnedAttributes().add(symbol_80);
		}
		
		symbol_0.getOwnedTypes().add(symbol_79); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		//
		// Pivot.ecore::pivot::IfExp http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
		//
		symbol_81.setName("IfExp");
		symbol_81.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::IfExp::condition
			symbol_82.setName("condition");
			symbol_82.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_82.setIsComposite(true);
			symbol_82.setIsResolveProxies(true);
			
			symbol_81.getOwnedAttributes().add(symbol_82);
		}
		{ // Pivot.ecore::pivot::IfExp::elseExpression
			symbol_83.setName("elseExpression");
			symbol_83.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_83.setIsComposite(true);
			symbol_83.setIsResolveProxies(true);
			
			symbol_81.getOwnedAttributes().add(symbol_83);
		}
		{ // Pivot.ecore::pivot::IfExp::thenExpression
			symbol_84.setName("thenExpression");
			symbol_84.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_84.setIsComposite(true);
			symbol_84.setIsResolveProxies(true);
			symbol_84.setOpposite(symbol_143);
			
			symbol_81.getOwnedAttributes().add(symbol_84);
		}
		
		symbol_0.getOwnedTypes().add(symbol_81); // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
		//
		// Pivot.ecore::pivot::Int http://www.eclipse.org/ocl/3.1.0/Pivot!Int
		//
		symbol_85.setName("Int");
		symbol_85.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_85); // http://www.eclipse.org/ocl/3.1.0/Pivot!Int
		//
		// Pivot.ecore::pivot::IntegerLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp
		//
		symbol_87.setName("IntegerLiteralExp");
		symbol_87.getSuperClasses().add(symbol_136); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		{ // Pivot.ecore::pivot::IntegerLiteralExp::integerSymbol
			symbol_88.setName("integerSymbol");
			symbol_88.setType(symbol_86);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_88.setIsResolveProxies(true);
			
			symbol_87.getOwnedAttributes().add(symbol_88);
		}
		
		symbol_0.getOwnedTypes().add(symbol_87); // http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp
		//
		// Pivot.ecore::pivot::InvalidLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidLiteralExp
		//
		symbol_89.setName("InvalidLiteralExp");
		symbol_89.getSuperClasses().add(symbol_107); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		
		symbol_0.getOwnedTypes().add(symbol_89); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidLiteralExp
		//
		// Pivot.ecore::pivot::InvalidType http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidType
		//
		symbol_90.setName("InvalidType");
		symbol_90.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		
		symbol_0.getOwnedTypes().add(symbol_90); // http://www.eclipse.org/ocl/3.1.0/Pivot!InvalidType
		//
		// Pivot.ecore::pivot::IterateExp http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
		//
		symbol_91.setName("IterateExp");
		symbol_91.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		{ // Pivot.ecore::pivot::IterateExp::result
			symbol_92.setName("result");
			symbol_92.setType(symbol_303);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_92.setLower(BigInteger.valueOf(0));
			symbol_92.setIsOrdered(true);
			
			symbol_92.setIsComposite(true);
			symbol_92.setIsResolveProxies(true);
			symbol_92.setOpposite(symbol_305);
			
			symbol_91.getOwnedAttributes().add(symbol_92);
		}
		
		symbol_0.getOwnedTypes().add(symbol_91); // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
		//
		// Pivot.ecore::pivot::Iteration http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
		//
		symbol_93.setName("Iteration");
		symbol_93.getSuperClasses().add(symbol_156); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		{ // Pivot.ecore::pivot::Iteration::LoopExp
			symbol_94.setName("LoopExp");
			symbol_94.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
			symbol_94.setLower(BigInteger.valueOf(0));
			symbol_94.setUpper(BigInteger.valueOf(-1));
			
			symbol_94.setImplicit(true);
			symbol_94.setIsResolveProxies(true);
			symbol_94.setOpposite(symbol_111);
			
			symbol_93.getOwnedAttributes().add(symbol_94);
		}
		{ // Pivot.ecore::pivot::Iteration::ownedAccumulator
			symbol_95.setName("ownedAccumulator");
			symbol_95.setType(symbol_178);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_95.setLower(BigInteger.valueOf(0));
			symbol_95.setUpper(BigInteger.valueOf(-1));
			
			symbol_95.setIsComposite(true);
			symbol_95.setIsResolveProxies(true);
			
			symbol_93.getOwnedAttributes().add(symbol_95);
		}
		{ // Pivot.ecore::pivot::Iteration::ownedIterator
			symbol_96.setName("ownedIterator");
			symbol_96.setType(symbol_178);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_96.setLower(BigInteger.valueOf(0));
			symbol_96.setUpper(BigInteger.valueOf(-1));
			
			symbol_96.setIsComposite(true);
			symbol_96.setIsResolveProxies(true);
			symbol_96.setOpposite(symbol_179);
			
			symbol_93.getOwnedAttributes().add(symbol_96);
		}
		
		symbol_0.getOwnedTypes().add(symbol_93); // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
		//
		// Pivot.ecore::pivot::IteratorExp http://www.eclipse.org/ocl/3.1.0/Pivot!IteratorExp
		//
		symbol_97.setName("IteratorExp");
		symbol_97.getSuperClasses().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		
		symbol_0.getOwnedTypes().add(symbol_97); // http://www.eclipse.org/ocl/3.1.0/Pivot!IteratorExp
		//
		// Pivot.ecore::pivot::LambdaType http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
		//
		symbol_98.setName("LambdaType");
		symbol_98.getSuperClasses().add(symbol_51); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{ // Pivot.ecore::pivot::LambdaType::contextType
			symbol_99.setName("contextType");
			symbol_99.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_99.setIsResolveProxies(true);
			
			symbol_98.getOwnedAttributes().add(symbol_99);
		}
		{ // Pivot.ecore::pivot::LambdaType::parameterType
			symbol_100.setName("parameterType");
			symbol_100.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_100.setLower(BigInteger.valueOf(0));
			symbol_100.setUpper(BigInteger.valueOf(-1));
			
			symbol_100.setIsResolveProxies(true);
			symbol_100.setOpposite(symbol_274);
			
			symbol_98.getOwnedAttributes().add(symbol_100);
		}
		{ // Pivot.ecore::pivot::LambdaType::resultType
			symbol_101.setName("resultType");
			symbol_101.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_101.setIsResolveProxies(true);
			
			symbol_98.getOwnedAttributes().add(symbol_101);
		}
		
		symbol_0.getOwnedTypes().add(symbol_98); // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
		//
		// Pivot.ecore::pivot::LetExp http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
		//
		symbol_102.setName("LetExp");
		symbol_102.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::LetExp::in
			symbol_103.setName("in");
			symbol_103.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_103.setIsComposite(true);
			symbol_103.setIsResolveProxies(true);
			symbol_103.setOpposite(symbol_144);
			
			symbol_102.getOwnedAttributes().add(symbol_103);
		}
		{ // Pivot.ecore::pivot::LetExp::variable
			symbol_104.setName("variable");
			symbol_104.setType(symbol_303);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			
			symbol_104.setIsComposite(true);
			symbol_104.setIsResolveProxies(true);
			symbol_104.setOpposite(symbol_306);
			
			symbol_102.getOwnedAttributes().add(symbol_104);
		}
		
		symbol_0.getOwnedTypes().add(symbol_102); // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
		//
		// Pivot.ecore::pivot::Library http://www.eclipse.org/ocl/3.1.0/Pivot!Library
		//
		symbol_105.setName("Library");
		symbol_105.getSuperClasses().add(symbol_170); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		
		symbol_0.getOwnedTypes().add(symbol_105); // http://www.eclipse.org/ocl/3.1.0/Pivot!Library
		//
		// Pivot.ecore::pivot::LibraryFeature http://www.eclipse.org/ocl/3.1.0/Pivot!LibraryFeature
		//
		symbol_106.setName("LibraryFeature");
		symbol_106.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_106); // http://www.eclipse.org/ocl/3.1.0/Pivot!LibraryFeature
		//
		// Pivot.ecore::pivot::LiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		//
		symbol_107.setName("LiteralExp");
		symbol_107.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		
		symbol_0.getOwnedTypes().add(symbol_107); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		//
		// Pivot.ecore::pivot::LoopExp http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		//
		symbol_108.setName("LoopExp");
		symbol_108.getSuperClasses().add(symbol_17); // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
		{ // Pivot.ecore::pivot::LoopExp::body
			symbol_109.setName("body");
			symbol_109.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_109.setIsComposite(true);
			symbol_109.setIsResolveProxies(true);
			symbol_109.setOpposite(symbol_145);
			
			symbol_108.getOwnedAttributes().add(symbol_109);
		}
		{ // Pivot.ecore::pivot::LoopExp::iterator
			symbol_110.setName("iterator");
			symbol_110.setType(symbol_303);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_110.setLower(BigInteger.valueOf(0));
			symbol_110.setUpper(BigInteger.valueOf(-1));
			symbol_110.setIsOrdered(true);
			
			symbol_110.setIsComposite(true);
			symbol_110.setIsResolveProxies(true);
			symbol_110.setOpposite(symbol_307);
			
			symbol_108.getOwnedAttributes().add(symbol_110);
		}
		{ // Pivot.ecore::pivot::LoopExp::referredIteration
			symbol_111.setName("referredIteration");
			symbol_111.setType(symbol_93);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
			symbol_111.setLower(BigInteger.valueOf(0));
			
			symbol_111.setIsResolveProxies(true);
			symbol_111.setOpposite(symbol_94);
			
			symbol_108.getOwnedAttributes().add(symbol_111);
		}
		
		symbol_0.getOwnedTypes().add(symbol_108); // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
		//
		// Pivot.ecore::pivot::MessageExp http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
		//
		symbol_112.setName("MessageExp");
		symbol_112.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::MessageExp::argument
			symbol_113.setName("argument");
			symbol_113.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_113.setLower(BigInteger.valueOf(0));
			symbol_113.setUpper(BigInteger.valueOf(-1));
			symbol_113.setIsOrdered(true);
			
			symbol_113.setIsComposite(true);
			symbol_113.setIsResolveProxies(true);
			
			symbol_112.getOwnedAttributes().add(symbol_113);
		}
		{ // Pivot.ecore::pivot::MessageExp::calledOperation
			symbol_114.setName("calledOperation");
			symbol_114.setType(symbol_20);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
			symbol_114.setLower(BigInteger.valueOf(0));
			
			symbol_114.setIsComposite(true);
			symbol_114.setIsResolveProxies(true);
			symbol_114.setOpposite(symbol_21);
			
			symbol_112.getOwnedAttributes().add(symbol_114);
		}
		{ // Pivot.ecore::pivot::MessageExp::sentSignal
			symbol_115.setName("sentSignal");
			symbol_115.setType(symbol_220);  // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
			symbol_115.setLower(BigInteger.valueOf(0));
			
			symbol_115.setIsComposite(true);
			symbol_115.setIsResolveProxies(true);
			symbol_115.setOpposite(symbol_221);
			
			symbol_112.getOwnedAttributes().add(symbol_115);
		}
		{ // Pivot.ecore::pivot::MessageExp::target
			symbol_116.setName("target");
			symbol_116.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			
			symbol_116.setIsComposite(true);
			symbol_116.setIsResolveProxies(true);
			symbol_116.setOpposite(symbol_146);
			
			symbol_112.getOwnedAttributes().add(symbol_116);
		}
		
		symbol_0.getOwnedTypes().add(symbol_112); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
		//
		// Pivot.ecore::pivot::MessageType http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
		//
		symbol_117.setName("MessageType");
		symbol_117.getSuperClasses().add(symbol_270); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		{ // Pivot.ecore::pivot::MessageType::referredOperation
			symbol_118.setName("referredOperation");
			symbol_118.setType(symbol_156);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_118.setLower(BigInteger.valueOf(0));
			
			symbol_118.setIsResolveProxies(true);
			symbol_118.setOpposite(symbol_158);
			
			symbol_117.getOwnedAttributes().add(symbol_118);
		}
		{ // Pivot.ecore::pivot::MessageType::referredSignal
			symbol_119.setName("referredSignal");
			symbol_119.setType(symbol_225);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
			symbol_119.setLower(BigInteger.valueOf(0));
			
			symbol_119.setIsResolveProxies(true);
			symbol_119.setOpposite(symbol_226);
			
			symbol_117.getOwnedAttributes().add(symbol_119);
		}
		
		symbol_0.getOwnedTypes().add(symbol_117); // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
		//
		// Pivot.ecore::pivot::MultiplicityElement http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		//
		symbol_120.setName("MultiplicityElement");
		symbol_120.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::MultiplicityElement::isOrdered
			symbol_121.setName("isOrdered");
			symbol_121.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_121.setIsResolveProxies(true);
			{
				Comment symbol_347 = PivotFactory.eINSTANCE.createComment();
				symbol_347.setBody("For a multivalued multiplicity, this attribute specifies whether the values in an instantiation of this element are sequentially ordered.");
				symbol_121.getOwnedComments().add(symbol_347);
			}
			
			symbol_120.getOwnedAttributes().add(symbol_121);
		}
		{ // Pivot.ecore::pivot::MultiplicityElement::isUnique
			symbol_122.setName("isUnique");
			symbol_122.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_122.setIsResolveProxies(true);
			{
				Comment symbol_348 = PivotFactory.eINSTANCE.createComment();
				symbol_348.setBody("For a multivalued multiplicity, this attributes specifies whether the values in an instantiation of this element are unique.");
				symbol_122.getOwnedComments().add(symbol_348);
			}
			
			symbol_120.getOwnedAttributes().add(symbol_122);
		}
		{ // Pivot.ecore::pivot::MultiplicityElement::lower
			symbol_123.setName("lower");
			symbol_123.setType(symbol_86);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			symbol_123.setLower(BigInteger.valueOf(0));
			
			symbol_123.setIsResolveProxies(true);
			{
				Comment symbol_349 = PivotFactory.eINSTANCE.createComment();
				symbol_349.setBody("Specifies the lower bound of the multiplicity interval.");
				symbol_123.getOwnedComments().add(symbol_349);
			}
			
			symbol_120.getOwnedAttributes().add(symbol_123);
		}
		{ // Pivot.ecore::pivot::MultiplicityElement::upper
			symbol_124.setName("upper");
			symbol_124.setType(symbol_294);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			symbol_124.setLower(BigInteger.valueOf(0));
			
			symbol_124.setIsResolveProxies(true);
			{
				Comment symbol_350 = PivotFactory.eINSTANCE.createComment();
				symbol_350.setBody("Specifies the upper bound of the multiplicity interval.");
				symbol_124.getOwnedComments().add(symbol_350);
			}
			
			symbol_120.getOwnedAttributes().add(symbol_124);
		}
		{	// Pivot.ecore::pivot::MultiplicityElement::includesCardinality()
			Operation symbol_351 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesCardinality(http://www.eclipse.org/ocl/3.1.0/Pivot!Integer)
			symbol_351.setName("includesCardinality");
			symbol_351.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_352 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesCardinality(http://www.eclipse.org/ocl/3.1.0/Pivot!Integer)!C
			symbol_352.setName("C");
			symbol_352.setType(symbol_86);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			
			symbol_351.getOwnedParameters().add(symbol_352);
			{
				Comment symbol_353 = PivotFactory.eINSTANCE.createComment();
				symbol_353.setBody("The query includesCardinality() checks whether the specified cardinality is valid for this multiplicity.");
				symbol_351.getOwnedComments().add(symbol_353);
			}
			
			symbol_120.getOwnedOperations().add(symbol_351);
		}
		{	// Pivot.ecore::pivot::MultiplicityElement::includesMultiplicity()
			Operation symbol_354 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesMultiplicity(http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement)
			symbol_354.setName("includesMultiplicity");
			symbol_354.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_355 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!includesMultiplicity(http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement)!M
			symbol_355.setName("M");
			symbol_355.setType(symbol_120);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
			
			
			symbol_354.getOwnedParameters().add(symbol_355);
			{
				Comment symbol_356 = PivotFactory.eINSTANCE.createComment();
				symbol_356.setBody("The query includesMultiplicity() checks whether this multiplicity includes all the cardinalities allowed by the specified multiplicity.");
				symbol_354.getOwnedComments().add(symbol_356);
			}
			
			symbol_120.getOwnedOperations().add(symbol_354);
		}
		{	// Pivot.ecore::pivot::MultiplicityElement::isMultivalued()
			Operation symbol_357 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!isMultivalued()
			symbol_357.setName("isMultivalued");
			symbol_357.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			{
				Comment symbol_358 = PivotFactory.eINSTANCE.createComment();
				symbol_358.setBody("The query isMultivalued() checks whether this multiplicity has an upper bound greater than one.");
				symbol_357.getOwnedComments().add(symbol_358);
			}
			
			symbol_120.getOwnedOperations().add(symbol_357);
		}
		{	// Pivot.ecore::pivot::MultiplicityElement::lowerBound()
			Operation symbol_359 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!lowerBound()
			symbol_359.setName("lowerBound");
			symbol_359.setType(symbol_86);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			{
				Comment symbol_360 = PivotFactory.eINSTANCE.createComment();
				symbol_360.setBody("The query lowerBound() returns the lower bound of the multiplicity as an integer.");
				symbol_359.getOwnedComments().add(symbol_360);
			}
			
			symbol_120.getOwnedOperations().add(symbol_359);
		}
		{	// Pivot.ecore::pivot::MultiplicityElement::upperBound()
			Operation symbol_361 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement!upperBound()
			symbol_361.setName("upperBound");
			symbol_361.setType(symbol_294);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			
			{
				Comment symbol_362 = PivotFactory.eINSTANCE.createComment();
				symbol_362.setBody("The query upperBound() returns the upper bound of the multiplicity for a bounded multiplicity as an unlimited natural.");
				symbol_361.getOwnedComments().add(symbol_362);
			}
			
			symbol_120.getOwnedOperations().add(symbol_361);
		}
		{
			Comment symbol_363 = PivotFactory.eINSTANCE.createComment();
			symbol_363.setBody("A multiplicity is a definition of an inclusive interval of non-negative integers beginning with a lower bound and ending with a (possibly infinite) upper bound. A multiplicity element embeds this information to specify the allowable cardinalities for an instantiation of this element.");
			symbol_120.getOwnedComments().add(symbol_363);
		}
		
		symbol_0.getOwnedTypes().add(symbol_120); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		//
		// Pivot.ecore::pivot::Nameable http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		//
		symbol_125.setName("Nameable");
		symbol_125.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_125); // http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		//
		// Pivot.ecore::pivot::NamedElement http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		//
		symbol_126.setName("NamedElement");
		symbol_126.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		symbol_126.getSuperClasses().add(symbol_125); // http://www.eclipse.org/ocl/3.1.0/Pivot!Nameable
		{ // Pivot.ecore::pivot::NamedElement::isStatic
			symbol_127.setName("isStatic");
			symbol_127.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_127.setIsResolveProxies(true);
			
			symbol_126.getOwnedAttributes().add(symbol_127);
		}
		{ // Pivot.ecore::pivot::NamedElement::name
			symbol_128.setName("name");
			symbol_128.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_128.setLower(BigInteger.valueOf(0));
			
			symbol_128.setIsResolveProxies(true);
			{
				Comment symbol_364 = PivotFactory.eINSTANCE.createComment();
				symbol_364.setBody("The name of the NamedElement.");
				symbol_128.getOwnedComments().add(symbol_364);
			}
			
			symbol_126.getOwnedAttributes().add(symbol_128);
		}
		{ // Pivot.ecore::pivot::NamedElement::ownedAnnotation
			symbol_129.setName("ownedAnnotation");
			symbol_129.setType(symbol_1);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Annotation
			symbol_129.setLower(BigInteger.valueOf(0));
			symbol_129.setUpper(BigInteger.valueOf(-1));
			symbol_129.setIsOrdered(true);
			
			symbol_129.setIsComposite(true);
			symbol_129.setIsResolveProxies(true);
			symbol_129.setOpposite(symbol_2);
			
			symbol_126.getOwnedAttributes().add(symbol_129);
		}
		{ // Pivot.ecore::pivot::NamedElement::ownedRule
			symbol_130.setName("ownedRule");
			symbol_130.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_130.setLower(BigInteger.valueOf(0));
			symbol_130.setUpper(BigInteger.valueOf(-1));
			symbol_130.setIsOrdered(true);
			
			symbol_130.setIsComposite(true);
			symbol_130.setIsResolveProxies(true);
			symbol_130.setOpposite(symbol_47);
			
			symbol_126.getOwnedAttributes().add(symbol_130);
		}
		{
			Comment symbol_365 = PivotFactory.eINSTANCE.createComment();
			symbol_365.setBody("A named element represents an element with a name.");
			symbol_126.getOwnedComments().add(symbol_365);
		}
		
		symbol_0.getOwnedTypes().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		//
		// Pivot.ecore::pivot::Namespace http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		//
		symbol_131.setName("Namespace");
		symbol_131.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		
		symbol_0.getOwnedTypes().add(symbol_131); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		//
		// Pivot.ecore::pivot::NavigationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		//
		symbol_132.setName("NavigationCallExp");
		symbol_132.getSuperClasses().add(symbol_79); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		{ // Pivot.ecore::pivot::NavigationCallExp::navigationSource
			symbol_133.setName("navigationSource");
			symbol_133.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_133.setLower(BigInteger.valueOf(0));
			symbol_133.setIsOrdered(true);
			
			symbol_133.setIsResolveProxies(true);
			symbol_133.setOpposite(symbol_196);
			
			symbol_132.getOwnedAttributes().add(symbol_133);
		}
		{ // Pivot.ecore::pivot::NavigationCallExp::qualifier
			symbol_134.setName("qualifier");
			symbol_134.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_134.setLower(BigInteger.valueOf(0));
			symbol_134.setUpper(BigInteger.valueOf(-1));
			symbol_134.setIsOrdered(true);
			
			symbol_134.setIsResolveProxies(true);
			symbol_134.setOpposite(symbol_147);
			
			symbol_132.getOwnedAttributes().add(symbol_134);
		}
		
		symbol_0.getOwnedTypes().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		//
		// Pivot.ecore::pivot::NullLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!NullLiteralExp
		//
		symbol_135.setName("NullLiteralExp");
		symbol_135.getSuperClasses().add(symbol_193); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		
		symbol_0.getOwnedTypes().add(symbol_135); // http://www.eclipse.org/ocl/3.1.0/Pivot!NullLiteralExp
		//
		// Pivot.ecore::pivot::NumericLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		//
		symbol_136.setName("NumericLiteralExp");
		symbol_136.getSuperClasses().add(symbol_193); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		
		symbol_0.getOwnedTypes().add(symbol_136); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		//
		// Pivot.ecore::pivot::Object http://www.eclipse.org/ocl/3.1.0/Pivot!Object
		//
		symbol_137.setName("Object");
		symbol_137.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_137); // http://www.eclipse.org/ocl/3.1.0/Pivot!Object
		//
		// Pivot.ecore::pivot::OclExpression http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		//
		symbol_138.setName("OclExpression");
		symbol_138.getSuperClasses().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		{ // Pivot.ecore::pivot::OclExpression::CallExp
			symbol_139.setName("CallExp");
			symbol_139.setType(symbol_17);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallExp
			symbol_139.setLower(BigInteger.valueOf(0));
			
			symbol_139.setImplicit(true);
			symbol_139.setIsResolveProxies(true);
			symbol_139.setOpposite(symbol_19);
			
			symbol_138.getOwnedAttributes().add(symbol_139);
		}
		{ // Pivot.ecore::pivot::OclExpression::CollectionItem
			symbol_140.setName("CollectionItem");
			symbol_140.setType(symbol_28);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionItem
			symbol_140.setLower(BigInteger.valueOf(0));
			
			symbol_140.setImplicit(true);
			symbol_140.setIsResolveProxies(true);
			symbol_140.setOpposite(symbol_29);
			
			symbol_138.getOwnedAttributes().add(symbol_140);
		}
		{ // Pivot.ecore::pivot::OclExpression::CollectionRange
			symbol_141.setName("CollectionRange");
			symbol_141.setType(symbol_36);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionRange
			symbol_141.setLower(BigInteger.valueOf(0));
			symbol_141.setUpper(BigInteger.valueOf(-1));
			
			symbol_141.setImplicit(true);
			symbol_141.setIsResolveProxies(true);
			
			symbol_138.getOwnedAttributes().add(symbol_141);
		}
		{ // Pivot.ecore::pivot::OclExpression::ExpressionInOcl
			symbol_142.setName("ExpressionInOcl");
			symbol_142.setType(symbol_70);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
			symbol_142.setLower(BigInteger.valueOf(0));
			symbol_142.setUpper(BigInteger.valueOf(-1));
			
			symbol_142.setImplicit(true);
			symbol_142.setIsResolveProxies(true);
			
			symbol_138.getOwnedAttributes().add(symbol_142);
		}
		{ // Pivot.ecore::pivot::OclExpression::IfExp
			symbol_143.setName("IfExp");
			symbol_143.setType(symbol_81);  // http://www.eclipse.org/ocl/3.1.0/Pivot!IfExp
			symbol_143.setLower(BigInteger.valueOf(0));
			symbol_143.setUpper(BigInteger.valueOf(-1));
			
			symbol_143.setImplicit(true);
			symbol_143.setIsResolveProxies(true);
			
			symbol_138.getOwnedAttributes().add(symbol_143);
		}
		{ // Pivot.ecore::pivot::OclExpression::LetExp
			symbol_144.setName("LetExp");
			symbol_144.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
			symbol_144.setLower(BigInteger.valueOf(0));
			
			symbol_144.setImplicit(true);
			symbol_144.setIsResolveProxies(true);
			symbol_144.setOpposite(symbol_103);
			
			symbol_138.getOwnedAttributes().add(symbol_144);
		}
		{ // Pivot.ecore::pivot::OclExpression::LoopExp
			symbol_145.setName("LoopExp");
			symbol_145.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
			symbol_145.setLower(BigInteger.valueOf(0));
			
			symbol_145.setImplicit(true);
			symbol_145.setIsResolveProxies(true);
			symbol_145.setOpposite(symbol_109);
			
			symbol_138.getOwnedAttributes().add(symbol_145);
		}
		{ // Pivot.ecore::pivot::OclExpression::MessageExp
			symbol_146.setName("MessageExp");
			symbol_146.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
			symbol_146.setLower(BigInteger.valueOf(0));
			symbol_146.setUpper(BigInteger.valueOf(-1));
			
			symbol_146.setImplicit(true);
			symbol_146.setIsResolveProxies(true);
			
			symbol_138.getOwnedAttributes().add(symbol_146);
		}
		{ // Pivot.ecore::pivot::OclExpression::NavigationCallExp
			symbol_147.setName("NavigationCallExp");
			symbol_147.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
			symbol_147.setLower(BigInteger.valueOf(0));
			symbol_147.setUpper(BigInteger.valueOf(-1));
			
			symbol_147.setImplicit(true);
			symbol_147.setIsResolveProxies(true);
			symbol_147.setOpposite(symbol_134);
			
			symbol_138.getOwnedAttributes().add(symbol_147);
		}
		{ // Pivot.ecore::pivot::OclExpression::OperationCallExp
			symbol_148.setName("OperationCallExp");
			symbol_148.setType(symbol_165);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
			symbol_148.setLower(BigInteger.valueOf(0));
			
			symbol_148.setImplicit(true);
			symbol_148.setIsResolveProxies(true);
			symbol_148.setOpposite(symbol_166);
			
			symbol_138.getOwnedAttributes().add(symbol_148);
		}
		{ // Pivot.ecore::pivot::OclExpression::TupleLiteralPart
			symbol_149.setName("TupleLiteralPart");
			symbol_149.setType(symbol_266);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
			symbol_149.setLower(BigInteger.valueOf(0));
			
			symbol_149.setImplicit(true);
			symbol_149.setIsResolveProxies(true);
			symbol_149.setOpposite(symbol_268);
			
			symbol_138.getOwnedAttributes().add(symbol_149);
		}
		{ // Pivot.ecore::pivot::OclExpression::Variable
			symbol_150.setName("Variable");
			symbol_150.setType(symbol_303);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_150.setLower(BigInteger.valueOf(0));
			
			symbol_150.setImplicit(true);
			symbol_150.setIsResolveProxies(true);
			symbol_150.setOpposite(symbol_309);
			
			symbol_138.getOwnedAttributes().add(symbol_150);
		}
		
		symbol_0.getOwnedTypes().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		//
		// Pivot.ecore::pivot::OpaqueExpression http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		//
		symbol_151.setName("OpaqueExpression");
		symbol_151.getSuperClasses().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		{ // Pivot.ecore::pivot::OpaqueExpression::body
			symbol_152.setName("body");
			symbol_152.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_152.setLower(BigInteger.valueOf(0));
			symbol_152.setUpper(BigInteger.valueOf(-1));
			symbol_152.setIsOrdered(true);
			symbol_152.setIsUnique(false);
			
			symbol_152.setIsResolveProxies(true);
			{
				Comment symbol_366 = PivotFactory.eINSTANCE.createComment();
				symbol_366.setBody("The text of the expression, possibly in multiple languages.");
				symbol_152.getOwnedComments().add(symbol_366);
			}
			
			symbol_151.getOwnedAttributes().add(symbol_152);
		}
		{ // Pivot.ecore::pivot::OpaqueExpression::language
			symbol_153.setName("language");
			symbol_153.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_153.setLower(BigInteger.valueOf(0));
			symbol_153.setUpper(BigInteger.valueOf(-1));
			symbol_153.setIsOrdered(true);
			
			symbol_153.setIsResolveProxies(true);
			{
				Comment symbol_367 = PivotFactory.eINSTANCE.createComment();
				symbol_367.setBody("Specifies the languages in which the expression is stated. The interpretation of the expression body depends on the languages. If the languages are unspecified, they might be implicit from the expression body or the context. Languages are matched to body strings by order.");
				symbol_153.getOwnedComments().add(symbol_367);
			}
			
			symbol_151.getOwnedAttributes().add(symbol_153);
		}
		{ // Pivot.ecore::pivot::OpaqueExpression::message
			symbol_154.setName("message");
			symbol_154.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_154.setLower(BigInteger.valueOf(0));
			symbol_154.setUpper(BigInteger.valueOf(-1));
			symbol_154.setIsOrdered(true);
			symbol_154.setIsUnique(false);
			
			symbol_154.setIsResolveProxies(true);
			
			symbol_151.getOwnedAttributes().add(symbol_154);
		}
		{ // Pivot.ecore::pivot::OpaqueExpression::valueExpression
			symbol_155.setName("valueExpression");
			symbol_155.setType(symbol_70);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
			symbol_155.setLower(BigInteger.valueOf(0));
			
			symbol_155.setIsResolveProxies(true);
			symbol_155.setIsTransient(true);
			
			symbol_151.getOwnedAttributes().add(symbol_155);
		}
		{
			Comment symbol_368 = PivotFactory.eINSTANCE.createComment();
			symbol_368.setBody("An opaque expression is an uninterpreted textual statement that denotes a (possibly empty) set of values when evaluated in a context.");
			symbol_151.getOwnedComments().add(symbol_368);
		}
		
		symbol_0.getOwnedTypes().add(symbol_151); // http://www.eclipse.org/ocl/3.1.0/Pivot!OpaqueExpression
		//
		// Pivot.ecore::pivot::Operation http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		//
		symbol_156.setName("Operation");
		symbol_156.getSuperClasses().add(symbol_76); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		symbol_156.getSuperClasses().add(symbol_131); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		symbol_156.getSuperClasses().add(symbol_259); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		symbol_156.getSuperClasses().add(symbol_182); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // Pivot.ecore::pivot::Operation::CallOperationAction
			symbol_157.setName("CallOperationAction");
			symbol_157.setType(symbol_20);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CallOperationAction
			symbol_157.setLower(BigInteger.valueOf(0));
			symbol_157.setUpper(BigInteger.valueOf(-1));
			
			symbol_157.setImplicit(true);
			symbol_157.setIsResolveProxies(true);
			symbol_157.setOpposite(symbol_22);
			
			symbol_156.getOwnedAttributes().add(symbol_157);
		}
		{ // Pivot.ecore::pivot::Operation::MessageType
			symbol_158.setName("MessageType");
			symbol_158.setType(symbol_117);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
			symbol_158.setLower(BigInteger.valueOf(0));
			symbol_158.setUpper(BigInteger.valueOf(-1));
			
			symbol_158.setImplicit(true);
			symbol_158.setIsResolveProxies(true);
			symbol_158.setOpposite(symbol_118);
			
			symbol_156.getOwnedAttributes().add(symbol_158);
		}
		{ // Pivot.ecore::pivot::Operation::OperationCallExp
			symbol_159.setName("OperationCallExp");
			symbol_159.setType(symbol_165);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
			symbol_159.setLower(BigInteger.valueOf(0));
			symbol_159.setUpper(BigInteger.valueOf(-1));
			
			symbol_159.setImplicit(true);
			symbol_159.setIsResolveProxies(true);
			symbol_159.setOpposite(symbol_167);
			
			symbol_156.getOwnedAttributes().add(symbol_159);
		}
		{ // Pivot.ecore::pivot::Operation::class
			symbol_160.setName("class");
			symbol_160.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
			symbol_160.setLower(BigInteger.valueOf(0));
			
			symbol_160.setIsReadOnly(true);
			symbol_160.setIsResolveProxies(true);
			symbol_160.setIsTransient(true);
			symbol_160.setIsVolatile(true);
			{
				Comment symbol_369 = PivotFactory.eINSTANCE.createComment();
				symbol_369.setBody("The class that owns the operation.");
				symbol_160.getOwnedComments().add(symbol_369);
			}
			
			symbol_156.getOwnedAttributes().add(symbol_160);
		}
		{ // Pivot.ecore::pivot::Operation::ownedParameter
			symbol_161.setName("ownedParameter");
			symbol_161.setType(symbol_178);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_161.setLower(BigInteger.valueOf(0));
			symbol_161.setUpper(BigInteger.valueOf(-1));
			symbol_161.setIsOrdered(true);
			
			symbol_161.setIsComposite(true);
			symbol_161.setIsResolveProxies(true);
			symbol_161.setOpposite(symbol_181);
			{
				Comment symbol_370 = PivotFactory.eINSTANCE.createComment();
				symbol_370.setBody("The parameters to the operation.");
				symbol_161.getOwnedComments().add(symbol_370);
			}
			
			symbol_156.getOwnedAttributes().add(symbol_161);
		}
		{ // Pivot.ecore::pivot::Operation::owningType
			symbol_162.setName("owningType");
			symbol_162.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_162.setLower(BigInteger.valueOf(0));
			
			symbol_162.setIsResolveProxies(true);
			symbol_162.setOpposite(symbol_283);
			
			symbol_156.getOwnedAttributes().add(symbol_162);
		}
		{ // Pivot.ecore::pivot::Operation::precedence
			symbol_163.setName("precedence");
			symbol_163.setType(symbol_188);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
			symbol_163.setLower(BigInteger.valueOf(0));
			
			symbol_163.setIsResolveProxies(true);
			symbol_163.setOpposite(symbol_189);
			
			symbol_156.getOwnedAttributes().add(symbol_163);
		}
		{ // Pivot.ecore::pivot::Operation::raisedException
			symbol_164.setName("raisedException");
			symbol_164.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_164.setLower(BigInteger.valueOf(0));
			symbol_164.setUpper(BigInteger.valueOf(-1));
			
			symbol_164.setIsResolveProxies(true);
			symbol_164.setOpposite(symbol_275);
			{
				Comment symbol_371 = PivotFactory.eINSTANCE.createComment();
				symbol_371.setBody("The exceptions that are declared as possible during an invocation of the operation.");
				symbol_164.getOwnedComments().add(symbol_371);
			}
			
			symbol_156.getOwnedAttributes().add(symbol_164);
		}
		{
			Comment symbol_372 = PivotFactory.eINSTANCE.createComment();
			symbol_372.setBody("An operation is owned by a class and may be invoked in the context of objects that are instances of that class. It is a typed element and a multiplicity element.\r\nOperation specializes TemplateableElement in order to support specification of template operations and bound operations. Operation specializes ParameterableElement to specify that an operation can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.");
			symbol_156.getOwnedComments().add(symbol_372);
		}
		
		symbol_0.getOwnedTypes().add(symbol_156); // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
		//
		// Pivot.ecore::pivot::OperationCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
		//
		symbol_165.setName("OperationCallExp");
		symbol_165.getSuperClasses().add(symbol_79); // http://www.eclipse.org/ocl/3.1.0/Pivot!FeatureCallExp
		{ // Pivot.ecore::pivot::OperationCallExp::argument
			symbol_166.setName("argument");
			symbol_166.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_166.setLower(BigInteger.valueOf(0));
			symbol_166.setUpper(BigInteger.valueOf(-1));
			symbol_166.setIsOrdered(true);
			
			symbol_166.setIsComposite(true);
			symbol_166.setIsResolveProxies(true);
			symbol_166.setOpposite(symbol_148);
			
			symbol_165.getOwnedAttributes().add(symbol_166);
		}
		{ // Pivot.ecore::pivot::OperationCallExp::referredOperation
			symbol_167.setName("referredOperation");
			symbol_167.setType(symbol_156);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_167.setLower(BigInteger.valueOf(0));
			
			symbol_167.setIsResolveProxies(true);
			symbol_167.setOpposite(symbol_159);
			
			symbol_165.getOwnedAttributes().add(symbol_167);
		}
		
		symbol_0.getOwnedTypes().add(symbol_165); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationCallExp
		//
		// Pivot.ecore::pivot::OperationTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!OperationTemplateParameter
		//
		symbol_168.setName("OperationTemplateParameter");
		symbol_168.getSuperClasses().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		{
			Comment symbol_373 = PivotFactory.eINSTANCE.createComment();
			symbol_373.setBody("An operation template parameter exposes an operation as a formal parameter for a template.");
			symbol_168.getOwnedComments().add(symbol_373);
		}
		
		symbol_0.getOwnedTypes().add(symbol_168); // http://www.eclipse.org/ocl/3.1.0/Pivot!OperationTemplateParameter
		//
		// Pivot.ecore::pivot::OrderedSetType http://www.eclipse.org/ocl/3.1.0/Pivot!OrderedSetType
		//
		symbol_169.setName("OrderedSetType");
		symbol_169.getSuperClasses().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		
		symbol_0.getOwnedTypes().add(symbol_169); // http://www.eclipse.org/ocl/3.1.0/Pivot!OrderedSetType
		//
		// Pivot.ecore::pivot::Package http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		//
		symbol_170.setName("Package");
		symbol_170.getSuperClasses().add(symbol_131); // http://www.eclipse.org/ocl/3.1.0/Pivot!Namespace
		symbol_170.getSuperClasses().add(symbol_259); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		{ // Pivot.ecore::pivot::Package::nestedPackage
			symbol_171.setName("nestedPackage");
			symbol_171.setType(symbol_170);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_171.setLower(BigInteger.valueOf(0));
			symbol_171.setUpper(BigInteger.valueOf(-1));
			
			symbol_171.setIsComposite(true);
			symbol_171.setIsResolveProxies(true);
			symbol_171.setOpposite(symbol_172);
			{
				Comment symbol_374 = PivotFactory.eINSTANCE.createComment();
				symbol_374.setBody("The set of contained packages.");
				symbol_171.getOwnedComments().add(symbol_374);
			}
			
			symbol_170.getOwnedAttributes().add(symbol_171);
		}
		{ // Pivot.ecore::pivot::Package::nestingPackage
			symbol_172.setName("nestingPackage");
			symbol_172.setType(symbol_170);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_172.setLower(BigInteger.valueOf(0));
			
			symbol_172.setIsResolveProxies(true);
			symbol_172.setOpposite(symbol_171);
			{
				Comment symbol_375 = PivotFactory.eINSTANCE.createComment();
				symbol_375.setBody("The containing package.");
				symbol_172.getOwnedComments().add(symbol_375);
			}
			
			symbol_170.getOwnedAttributes().add(symbol_172);
		}
		{ // Pivot.ecore::pivot::Package::nsPrefix
			symbol_173.setName("nsPrefix");
			symbol_173.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_173.setLower(BigInteger.valueOf(0));
			
			symbol_173.setIsResolveProxies(true);
			
			symbol_170.getOwnedAttributes().add(symbol_173);
		}
		{ // Pivot.ecore::pivot::Package::nsURI
			symbol_174.setName("nsURI");
			symbol_174.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_174.setLower(BigInteger.valueOf(0));
			
			symbol_174.setIsResolveProxies(true);
			
			symbol_170.getOwnedAttributes().add(symbol_174);
		}
		{ // Pivot.ecore::pivot::Package::ownedPrecedence
			symbol_175.setName("ownedPrecedence");
			symbol_175.setType(symbol_188);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
			symbol_175.setLower(BigInteger.valueOf(0));
			symbol_175.setUpper(BigInteger.valueOf(-1));
			symbol_175.setIsOrdered(true);
			
			symbol_175.setIsComposite(true);
			symbol_175.setIsResolveProxies(true);
			symbol_175.setOpposite(symbol_190);
			
			symbol_170.getOwnedAttributes().add(symbol_175);
		}
		{ // Pivot.ecore::pivot::Package::ownedType
			symbol_176.setName("ownedType");
			symbol_176.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_176.setLower(BigInteger.valueOf(0));
			symbol_176.setUpper(BigInteger.valueOf(-1));
			
			symbol_176.setIsComposite(true);
			symbol_176.setIsResolveProxies(true);
			symbol_176.setOpposite(symbol_284);
			{
				Comment symbol_376 = PivotFactory.eINSTANCE.createComment();
				symbol_376.setBody("The set of contained types.");
				symbol_176.getOwnedComments().add(symbol_376);
			}
			
			symbol_170.getOwnedAttributes().add(symbol_176);
		}
		{
			Comment symbol_377 = PivotFactory.eINSTANCE.createComment();
			symbol_377.setBody("A package is a container for types and other packages.\r\nPackage specializes TemplateableElement and PackageableElement specializes ParameterableElement to specify that a package can be used as a template and a PackageableElement as a template parameter.");
			symbol_170.getOwnedComments().add(symbol_377);
		}
		
		symbol_0.getOwnedTypes().add(symbol_170); // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
		//
		// Pivot.ecore::pivot::PackageableElement http://www.eclipse.org/ocl/3.1.0/Pivot!PackageableElement
		//
		symbol_177.setName("PackageableElement");
		symbol_177.getSuperClasses().add(symbol_182); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{
			Comment symbol_378 = PivotFactory.eINSTANCE.createComment();
			symbol_378.setBody("Packageable elements are able to serve as a template parameter.");
			symbol_177.getOwnedComments().add(symbol_378);
		}
		
		symbol_0.getOwnedTypes().add(symbol_177); // http://www.eclipse.org/ocl/3.1.0/Pivot!PackageableElement
		//
		// Pivot.ecore::pivot::Parameter http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
		//
		symbol_178.setName("Parameter");
		symbol_178.getSuperClasses().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		symbol_178.getSuperClasses().add(symbol_311); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		{ // Pivot.ecore::pivot::Parameter::Iteration
			symbol_179.setName("Iteration");
			symbol_179.setType(symbol_93);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Iteration
			symbol_179.setLower(BigInteger.valueOf(0));
			symbol_179.setUpper(BigInteger.valueOf(-1));
			
			symbol_179.setImplicit(true);
			symbol_179.setIsResolveProxies(true);
			
			symbol_178.getOwnedAttributes().add(symbol_179);
		}
		{ // Pivot.ecore::pivot::Parameter::Variable
			symbol_180.setName("Variable");
			symbol_180.setType(symbol_303);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
			symbol_180.setLower(BigInteger.valueOf(0));
			symbol_180.setUpper(BigInteger.valueOf(-1));
			
			symbol_180.setImplicit(true);
			symbol_180.setIsResolveProxies(true);
			symbol_180.setOpposite(symbol_310);
			
			symbol_178.getOwnedAttributes().add(symbol_180);
		}
		{ // Pivot.ecore::pivot::Parameter::operation
			symbol_181.setName("operation");
			symbol_181.setType(symbol_156);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_181.setLower(BigInteger.valueOf(0));
			
			symbol_181.setIsResolveProxies(true);
			symbol_181.setOpposite(symbol_161);
			{
				Comment symbol_379 = PivotFactory.eINSTANCE.createComment();
				symbol_379.setBody("The operation that owns the parameter.");
				symbol_181.getOwnedComments().add(symbol_379);
			}
			
			symbol_178.getOwnedAttributes().add(symbol_181);
		}
		{
			Comment symbol_380 = PivotFactory.eINSTANCE.createComment();
			symbol_380.setBody("A parameter is a typed element that represents a parameter of an operation.");
			symbol_178.getOwnedComments().add(symbol_380);
		}
		
		symbol_0.getOwnedTypes().add(symbol_178); // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
		//
		// Pivot.ecore::pivot::ParameterableElement http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		//
		symbol_182.setName("ParameterableElement");
		symbol_182.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::ParameterableElement::TemplateParameter
			symbol_183.setName("TemplateParameter");
			symbol_183.setType(symbol_239);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_183.setLower(BigInteger.valueOf(0));
			symbol_183.setUpper(BigInteger.valueOf(-1));
			
			symbol_183.setImplicit(true);
			symbol_183.setIsResolveProxies(true);
			
			symbol_182.getOwnedAttributes().add(symbol_183);
		}
		{ // Pivot.ecore::pivot::ParameterableElement::TemplateParameterSubstitution
			symbol_184.setName("TemplateParameterSubstitution");
			symbol_184.setType(symbol_247);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
			symbol_184.setLower(BigInteger.valueOf(0));
			symbol_184.setUpper(BigInteger.valueOf(-1));
			
			symbol_184.setImplicit(true);
			symbol_184.setIsResolveProxies(true);
			
			symbol_182.getOwnedAttributes().add(symbol_184);
		}
		{ // Pivot.ecore::pivot::ParameterableElement::owningTemplateParameter
			symbol_185.setName("owningTemplateParameter");
			symbol_185.setType(symbol_239);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_185.setLower(BigInteger.valueOf(0));
			
			symbol_185.setIsResolveProxies(true);
			symbol_185.setOpposite(symbol_244);
			{
				Comment symbol_381 = PivotFactory.eINSTANCE.createComment();
				symbol_381.setBody("The formal template parameter that owns this element.");
				symbol_185.getOwnedComments().add(symbol_381);
			}
			
			symbol_182.getOwnedAttributes().add(symbol_185);
		}
		{ // Pivot.ecore::pivot::ParameterableElement::templateParameter
			symbol_186.setName("templateParameter");
			symbol_186.setType(symbol_239);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_186.setLower(BigInteger.valueOf(0));
			
			symbol_186.setIsResolveProxies(true);
			symbol_186.setOpposite(symbol_245);
			{
				Comment symbol_382 = PivotFactory.eINSTANCE.createComment();
				symbol_382.setBody("The template parameter that exposes this element as a formal parameter.");
				symbol_186.getOwnedComments().add(symbol_382);
			}
			
			symbol_182.getOwnedAttributes().add(symbol_186);
		}
		{	// Pivot.ecore::pivot::ParameterableElement::isCompatibleWith()
			Operation symbol_383 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!isCompatibleWith(http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement)
			symbol_383.setName("isCompatibleWith");
			symbol_383.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_384 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!isCompatibleWith(http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement)!p
			symbol_384.setName("p");
			symbol_384.setType(symbol_182);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			
			
			symbol_383.getOwnedParameters().add(symbol_384);
			
			symbol_182.getOwnedOperations().add(symbol_383);
		}
		{	// Pivot.ecore::pivot::ParameterableElement::isTemplateParameter()
			Operation symbol_385 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement!isTemplateParameter()
			symbol_385.setName("isTemplateParameter");
			symbol_385.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			{
				Comment symbol_386 = PivotFactory.eINSTANCE.createComment();
				symbol_386.setBody("The query isTemplateParameter() determines if this parameterable element is exposed as a formal template parameter.");
				symbol_385.getOwnedComments().add(symbol_386);
			}
			
			symbol_182.getOwnedOperations().add(symbol_385);
		}
		{
			Comment symbol_387 = PivotFactory.eINSTANCE.createComment();
			symbol_387.setBody("A parameterable element is an element that can be exposed as a formal template parameter for a template, or specified as an actual parameter in a binding of a template.");
			symbol_182.getOwnedComments().add(symbol_387);
		}
		
		symbol_0.getOwnedTypes().add(symbol_182); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		//
		// Pivot.ecore::pivot::Pivotable http://www.eclipse.org/ocl/3.1.0/Pivot!Pivotable
		//
		symbol_187.setName("Pivotable");
		symbol_187.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_187); // http://www.eclipse.org/ocl/3.1.0/Pivot!Pivotable
		//
		// Pivot.ecore::pivot::Precedence http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
		//
		symbol_188.setName("Precedence");
		symbol_188.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::Precedence::Operation
			symbol_189.setName("Operation");
			symbol_189.setType(symbol_156);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_189.setLower(BigInteger.valueOf(0));
			symbol_189.setUpper(BigInteger.valueOf(-1));
			
			symbol_189.setImplicit(true);
			symbol_189.setIsResolveProxies(true);
			symbol_189.setOpposite(symbol_163);
			
			symbol_188.getOwnedAttributes().add(symbol_189);
		}
		{ // Pivot.ecore::pivot::Precedence::Package
			symbol_190.setName("Package");
			symbol_190.setType(symbol_170);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_190.setLower(BigInteger.valueOf(0));
			
			symbol_190.setImplicit(true);
			symbol_190.setIsResolveProxies(true);
			symbol_190.setOpposite(symbol_175);
			
			symbol_188.getOwnedAttributes().add(symbol_190);
		}
		{ // Pivot.ecore::pivot::Precedence::associativity
			symbol_191.setName("associativity");
			symbol_191.setType(symbol_12);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociativityKind
			symbol_191.setLower(BigInteger.valueOf(0));
			
			symbol_191.setIsResolveProxies(true);
			
			symbol_188.getOwnedAttributes().add(symbol_191);
		}
		{ // Pivot.ecore::pivot::Precedence::order
			symbol_192.setName("order");
			symbol_192.setType(symbol_86);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			symbol_192.setIsDerived(true);
			symbol_192.setIsResolveProxies(true);
			symbol_192.setIsTransient(true);
			symbol_192.setIsVolatile(true);
			
			symbol_188.getOwnedAttributes().add(symbol_192);
		}
		
		symbol_0.getOwnedTypes().add(symbol_188); // http://www.eclipse.org/ocl/3.1.0/Pivot!Precedence
		//
		// Pivot.ecore::pivot::PrimitiveLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		//
		symbol_193.setName("PrimitiveLiteralExp");
		symbol_193.getSuperClasses().add(symbol_107); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		
		symbol_0.getOwnedTypes().add(symbol_193); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		//
		// Pivot.ecore::pivot::PrimitiveType http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveType
		//
		symbol_194.setName("PrimitiveType");
		symbol_194.getSuperClasses().add(symbol_51); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		{
			Comment symbol_388 = PivotFactory.eINSTANCE.createComment();
			symbol_388.setBody("A primitive type is a data type implemented by the underlying infrastructure and made available for modeling.");
			symbol_194.getOwnedComments().add(symbol_388);
		}
		
		symbol_0.getOwnedTypes().add(symbol_194); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveType
		//
		// Pivot.ecore::pivot::Property http://www.eclipse.org/ocl/3.1.0/Pivot!Property
		//
		symbol_195.setName("Property");
		symbol_195.getSuperClasses().add(symbol_76); // http://www.eclipse.org/ocl/3.1.0/Pivot!Feature
		symbol_195.getSuperClasses().add(symbol_182); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // Pivot.ecore::pivot::Property::NavigationCallExp
			symbol_196.setName("NavigationCallExp");
			symbol_196.setType(symbol_132);  // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
			symbol_196.setLower(BigInteger.valueOf(0));
			symbol_196.setUpper(BigInteger.valueOf(-1));
			
			symbol_196.setImplicit(true);
			symbol_196.setIsResolveProxies(true);
			symbol_196.setOpposite(symbol_133);
			
			symbol_195.getOwnedAttributes().add(symbol_196);
		}
		{ // Pivot.ecore::pivot::Property::Property
			symbol_197.setName("Property");
			symbol_197.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_197.setLower(BigInteger.valueOf(0));
			symbol_197.setUpper(BigInteger.valueOf(-1));
			
			symbol_197.setImplicit(true);
			symbol_197.setIsResolveProxies(true);
			
			symbol_195.getOwnedAttributes().add(symbol_197);
		}
		{ // Pivot.ecore::pivot::Property::PropertyCallExp
			symbol_198.setName("PropertyCallExp");
			symbol_198.setType(symbol_214);  // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
			symbol_198.setLower(BigInteger.valueOf(0));
			symbol_198.setUpper(BigInteger.valueOf(-1));
			
			symbol_198.setImplicit(true);
			symbol_198.setIsResolveProxies(true);
			symbol_198.setOpposite(symbol_215);
			
			symbol_195.getOwnedAttributes().add(symbol_198);
		}
		{ // Pivot.ecore::pivot::Property::association
			symbol_199.setName("association");
			symbol_199.setType(symbol_7);  // http://www.eclipse.org/ocl/3.1.0/Pivot!AssociationClass
			symbol_199.setLower(BigInteger.valueOf(0));
			
			symbol_199.setIsResolveProxies(true);
			symbol_199.setOpposite(symbol_9);
			
			symbol_195.getOwnedAttributes().add(symbol_199);
		}
		{ // Pivot.ecore::pivot::Property::class
			symbol_200.setName("class");
			symbol_200.setType(symbol_23);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
			symbol_200.setLower(BigInteger.valueOf(0));
			
			symbol_200.setIsReadOnly(true);
			symbol_200.setIsResolveProxies(true);
			symbol_200.setIsTransient(true);
			symbol_200.setIsVolatile(true);
			{
				Comment symbol_389 = PivotFactory.eINSTANCE.createComment();
				symbol_389.setBody("The class that owns the property, and of which the property is an attribute.");
				symbol_200.getOwnedComments().add(symbol_389);
			}
			
			symbol_195.getOwnedAttributes().add(symbol_200);
		}
		{ // Pivot.ecore::pivot::Property::default
			symbol_201.setName("default");
			symbol_201.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_201.setLower(BigInteger.valueOf(0));
			
			symbol_201.setIsResolveProxies(true);
			{
				Comment symbol_390 = PivotFactory.eINSTANCE.createComment();
				symbol_390.setBody("A string that is evaluated to give a default value for the attribute when an object of the owning class is instantiated.");
				symbol_201.getOwnedComments().add(symbol_390);
			}
			
			symbol_195.getOwnedAttributes().add(symbol_201);
		}
		{ // Pivot.ecore::pivot::Property::implicit
			symbol_202.setName("implicit");
			symbol_202.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_202.setLower(BigInteger.valueOf(0));
			
			symbol_202.setIsResolveProxies(true);
			
			symbol_195.getOwnedAttributes().add(symbol_202);
		}
		{ // Pivot.ecore::pivot::Property::isComposite
			symbol_203.setName("isComposite");
			symbol_203.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_203.setIsResolveProxies(true);
			{
				Comment symbol_391 = PivotFactory.eINSTANCE.createComment();
				symbol_391.setBody("If isComposite is true, the object containing the attribute is a container for the object or value contained in the attribute.");
				symbol_203.getOwnedComments().add(symbol_391);
			}
			
			symbol_195.getOwnedAttributes().add(symbol_203);
		}
		{ // Pivot.ecore::pivot::Property::isDerived
			symbol_204.setName("isDerived");
			symbol_204.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_204.setIsResolveProxies(true);
			{
				Comment symbol_392 = PivotFactory.eINSTANCE.createComment();
				symbol_392.setBody("If isDerived is true, the value of the attribute is derived from information elsewhere.");
				symbol_204.getOwnedComments().add(symbol_392);
			}
			
			symbol_195.getOwnedAttributes().add(symbol_204);
		}
		{ // Pivot.ecore::pivot::Property::isID
			symbol_205.setName("isID");
			symbol_205.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_205.setIsResolveProxies(true);
			
			symbol_195.getOwnedAttributes().add(symbol_205);
		}
		{ // Pivot.ecore::pivot::Property::isReadOnly
			symbol_206.setName("isReadOnly");
			symbol_206.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_206.setIsResolveProxies(true);
			{
				Comment symbol_393 = PivotFactory.eINSTANCE.createComment();
				symbol_393.setBody("If isReadOnly is true, the attribute may not be written to after initialization.");
				symbol_206.getOwnedComments().add(symbol_393);
			}
			
			symbol_195.getOwnedAttributes().add(symbol_206);
		}
		{ // Pivot.ecore::pivot::Property::isResolveProxies
			symbol_207.setName("isResolveProxies");
			symbol_207.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_207.setIsResolveProxies(true);
			
			symbol_195.getOwnedAttributes().add(symbol_207);
		}
		{ // Pivot.ecore::pivot::Property::isTransient
			symbol_208.setName("isTransient");
			symbol_208.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_208.setIsResolveProxies(true);
			
			symbol_195.getOwnedAttributes().add(symbol_208);
		}
		{ // Pivot.ecore::pivot::Property::isUnsettable
			symbol_209.setName("isUnsettable");
			symbol_209.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_209.setIsResolveProxies(true);
			
			symbol_195.getOwnedAttributes().add(symbol_209);
		}
		{ // Pivot.ecore::pivot::Property::isVolatile
			symbol_210.setName("isVolatile");
			symbol_210.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_210.setIsResolveProxies(true);
			
			symbol_195.getOwnedAttributes().add(symbol_210);
		}
		{ // Pivot.ecore::pivot::Property::keys
			symbol_211.setName("keys");
			symbol_211.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_211.setLower(BigInteger.valueOf(0));
			symbol_211.setUpper(BigInteger.valueOf(-1));
			
			symbol_211.setIsResolveProxies(true);
			
			symbol_195.getOwnedAttributes().add(symbol_211);
		}
		{ // Pivot.ecore::pivot::Property::opposite
			symbol_212.setName("opposite");
			symbol_212.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_212.setLower(BigInteger.valueOf(0));
			
			symbol_212.setIsResolveProxies(true);
			symbol_212.setOpposite(symbol_197);
			{
				Comment symbol_394 = PivotFactory.eINSTANCE.createComment();
				symbol_394.setBody("Two attributes attr1 and attr2 of two objects o1 and o2 (which may be the same object) may be paired with each other so that o1.attr1 refers to o2 if and only if o2.attr2 refers to o1. In such a case attr1 is the opposite of attr2 and attr2 is the opposite of attr1.");
				symbol_212.getOwnedComments().add(symbol_394);
			}
			
			symbol_195.getOwnedAttributes().add(symbol_212);
		}
		{ // Pivot.ecore::pivot::Property::owningType
			symbol_213.setName("owningType");
			symbol_213.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_213.setLower(BigInteger.valueOf(0));
			
			symbol_213.setIsResolveProxies(true);
			symbol_213.setOpposite(symbol_282);
			
			symbol_195.getOwnedAttributes().add(symbol_213);
		}
		{	// Pivot.ecore::pivot::Property::isAttribute()
			Operation symbol_395 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isAttribute(http://www.eclipse.org/ocl/3.1.0/Pivot!Property)
			symbol_395.setName("isAttribute");
			symbol_395.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			Parameter symbol_396 = PivotFactory.eINSTANCE.createParameter(); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property!isAttribute(http://www.eclipse.org/ocl/3.1.0/Pivot!Property)!p
			symbol_396.setName("p");
			symbol_396.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			
			
			symbol_395.getOwnedParameters().add(symbol_396);
			
			symbol_195.getOwnedOperations().add(symbol_395);
		}
		{
			Comment symbol_397 = PivotFactory.eINSTANCE.createComment();
			symbol_397.setBody("A property is a typed element that represents an attribute of a class.\r\nProperty specializes ParameterableElement to specify that a property can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.");
			symbol_195.getOwnedComments().add(symbol_397);
		}
		
		symbol_0.getOwnedTypes().add(symbol_195); // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
		//
		// Pivot.ecore::pivot::PropertyCallExp http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
		//
		symbol_214.setName("PropertyCallExp");
		symbol_214.getSuperClasses().add(symbol_132); // http://www.eclipse.org/ocl/3.1.0/Pivot!NavigationCallExp
		{ // Pivot.ecore::pivot::PropertyCallExp::referredProperty
			symbol_215.setName("referredProperty");
			symbol_215.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_215.setLower(BigInteger.valueOf(0));
			
			symbol_215.setIsResolveProxies(true);
			symbol_215.setOpposite(symbol_198);
			
			symbol_214.getOwnedAttributes().add(symbol_215);
		}
		
		symbol_0.getOwnedTypes().add(symbol_214); // http://www.eclipse.org/ocl/3.1.0/Pivot!PropertyCallExp
		//
		// Pivot.ecore::pivot::RealLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp
		//
		symbol_217.setName("RealLiteralExp");
		symbol_217.getSuperClasses().add(symbol_136); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		{ // Pivot.ecore::pivot::RealLiteralExp::realSymbol
			symbol_218.setName("realSymbol");
			symbol_218.setType(symbol_216);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Real
			
			symbol_218.setIsResolveProxies(true);
			
			symbol_217.getOwnedAttributes().add(symbol_218);
		}
		
		symbol_0.getOwnedTypes().add(symbol_217); // http://www.eclipse.org/ocl/3.1.0/Pivot!RealLiteralExp
		//
		// Pivot.ecore::pivot::SelfType http://www.eclipse.org/ocl/3.1.0/Pivot!SelfType
		//
		symbol_219.setName("SelfType");
		symbol_219.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		
		symbol_0.getOwnedTypes().add(symbol_219); // http://www.eclipse.org/ocl/3.1.0/Pivot!SelfType
		//
		// Pivot.ecore::pivot::SendSignalAction http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
		//
		symbol_220.setName("SendSignalAction");
		symbol_220.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::SendSignalAction::MessageExp
			symbol_221.setName("MessageExp");
			symbol_221.setType(symbol_112);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageExp
			symbol_221.setLower(BigInteger.valueOf(0));
			
			symbol_221.setImplicit(true);
			symbol_221.setIsResolveProxies(true);
			symbol_221.setOpposite(symbol_115);
			
			symbol_220.getOwnedAttributes().add(symbol_221);
		}
		{ // Pivot.ecore::pivot::SendSignalAction::signal
			symbol_222.setName("signal");
			symbol_222.setType(symbol_225);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
			
			symbol_222.setIsResolveProxies(true);
			symbol_222.setOpposite(symbol_227);
			
			symbol_220.getOwnedAttributes().add(symbol_222);
		}
		
		symbol_0.getOwnedTypes().add(symbol_220); // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
		//
		// Pivot.ecore::pivot::SequenceType http://www.eclipse.org/ocl/3.1.0/Pivot!SequenceType
		//
		symbol_223.setName("SequenceType");
		symbol_223.getSuperClasses().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		
		symbol_0.getOwnedTypes().add(symbol_223); // http://www.eclipse.org/ocl/3.1.0/Pivot!SequenceType
		//
		// Pivot.ecore::pivot::SetType http://www.eclipse.org/ocl/3.1.0/Pivot!SetType
		//
		symbol_224.setName("SetType");
		symbol_224.getSuperClasses().add(symbol_39); // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
		
		symbol_0.getOwnedTypes().add(symbol_224); // http://www.eclipse.org/ocl/3.1.0/Pivot!SetType
		//
		// Pivot.ecore::pivot::Signal http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
		//
		symbol_225.setName("Signal");
		symbol_225.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::Signal::MessageType
			symbol_226.setName("MessageType");
			symbol_226.setType(symbol_117);  // http://www.eclipse.org/ocl/3.1.0/Pivot!MessageType
			symbol_226.setLower(BigInteger.valueOf(0));
			symbol_226.setUpper(BigInteger.valueOf(-1));
			
			symbol_226.setImplicit(true);
			symbol_226.setIsResolveProxies(true);
			symbol_226.setOpposite(symbol_119);
			
			symbol_225.getOwnedAttributes().add(symbol_226);
		}
		{ // Pivot.ecore::pivot::Signal::SendSignalAction
			symbol_227.setName("SendSignalAction");
			symbol_227.setType(symbol_220);  // http://www.eclipse.org/ocl/3.1.0/Pivot!SendSignalAction
			symbol_227.setLower(BigInteger.valueOf(0));
			symbol_227.setUpper(BigInteger.valueOf(-1));
			
			symbol_227.setImplicit(true);
			symbol_227.setIsResolveProxies(true);
			symbol_227.setOpposite(symbol_222);
			
			symbol_225.getOwnedAttributes().add(symbol_227);
		}
		
		symbol_0.getOwnedTypes().add(symbol_225); // http://www.eclipse.org/ocl/3.1.0/Pivot!Signal
		//
		// Pivot.ecore::pivot::State http://www.eclipse.org/ocl/3.1.0/Pivot!State
		//
		symbol_228.setName("State");
		symbol_228.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::State::StateExp
			symbol_229.setName("StateExp");
			symbol_229.setType(symbol_230);  // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
			symbol_229.setLower(BigInteger.valueOf(0));
			symbol_229.setUpper(BigInteger.valueOf(-1));
			
			symbol_229.setImplicit(true);
			symbol_229.setIsResolveProxies(true);
			symbol_229.setOpposite(symbol_231);
			
			symbol_228.getOwnedAttributes().add(symbol_229);
		}
		
		symbol_0.getOwnedTypes().add(symbol_228); // http://www.eclipse.org/ocl/3.1.0/Pivot!State
		//
		// Pivot.ecore::pivot::StateExp http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
		//
		symbol_230.setName("StateExp");
		symbol_230.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::StateExp::referredState
			symbol_231.setName("referredState");
			symbol_231.setType(symbol_228);  // http://www.eclipse.org/ocl/3.1.0/Pivot!State
			symbol_231.setLower(BigInteger.valueOf(0));
			
			symbol_231.setIsResolveProxies(true);
			symbol_231.setOpposite(symbol_229);
			
			symbol_230.getOwnedAttributes().add(symbol_231);
		}
		
		symbol_0.getOwnedTypes().add(symbol_230); // http://www.eclipse.org/ocl/3.1.0/Pivot!StateExp
		//
		// Pivot.ecore::pivot::StringLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp
		//
		symbol_233.setName("StringLiteralExp");
		symbol_233.getSuperClasses().add(symbol_193); // http://www.eclipse.org/ocl/3.1.0/Pivot!PrimitiveLiteralExp
		{ // Pivot.ecore::pivot::StringLiteralExp::stringSymbol
			symbol_234.setName("stringSymbol");
			symbol_234.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			
			symbol_234.setIsResolveProxies(true);
			
			symbol_233.getOwnedAttributes().add(symbol_234);
		}
		
		symbol_0.getOwnedTypes().add(symbol_233); // http://www.eclipse.org/ocl/3.1.0/Pivot!StringLiteralExp
		//
		// Pivot.ecore::pivot::TemplateBinding http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
		//
		symbol_235.setName("TemplateBinding");
		symbol_235.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::TemplateBinding::boundElement
			symbol_236.setName("boundElement");
			symbol_236.setType(symbol_259);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
			
			symbol_236.setIsResolveProxies(true);
			symbol_236.setOpposite(symbol_261);
			{
				Comment symbol_398 = PivotFactory.eINSTANCE.createComment();
				symbol_398.setBody("The element that is bound by this binding.");
				symbol_236.getOwnedComments().add(symbol_398);
			}
			
			symbol_235.getOwnedAttributes().add(symbol_236);
		}
		{ // Pivot.ecore::pivot::TemplateBinding::parameterSubstitution
			symbol_237.setName("parameterSubstitution");
			symbol_237.setType(symbol_247);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
			symbol_237.setLower(BigInteger.valueOf(0));
			symbol_237.setUpper(BigInteger.valueOf(-1));
			
			symbol_237.setIsComposite(true);
			symbol_237.setIsResolveProxies(true);
			symbol_237.setOpposite(symbol_251);
			{
				Comment symbol_399 = PivotFactory.eINSTANCE.createComment();
				symbol_399.setBody("The parameter substitutions owned by this template binding.");
				symbol_237.getOwnedComments().add(symbol_399);
			}
			
			symbol_235.getOwnedAttributes().add(symbol_237);
		}
		{ // Pivot.ecore::pivot::TemplateBinding::signature
			symbol_238.setName("signature");
			symbol_238.setType(symbol_254);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			
			symbol_238.setIsResolveProxies(true);
			symbol_238.setOpposite(symbol_255);
			{
				Comment symbol_400 = PivotFactory.eINSTANCE.createComment();
				symbol_400.setBody("The template signature for the template that is the target of the binding.");
				symbol_238.getOwnedComments().add(symbol_400);
			}
			
			symbol_235.getOwnedAttributes().add(symbol_238);
		}
		{
			Comment symbol_401 = PivotFactory.eINSTANCE.createComment();
			symbol_401.setBody("A template binding represents a relationship between a templateable element and a template. A template binding specifies the substitutions of actual parameters for the formal parameters of the template.");
			symbol_235.getOwnedComments().add(symbol_401);
		}
		
		symbol_0.getOwnedTypes().add(symbol_235); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
		//
		// Pivot.ecore::pivot::TemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		//
		symbol_239.setName("TemplateParameter");
		symbol_239.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::TemplateParameter::TemplateParameterSubstitution
			symbol_240.setName("TemplateParameterSubstitution");
			symbol_240.setType(symbol_247);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
			symbol_240.setLower(BigInteger.valueOf(0));
			symbol_240.setUpper(BigInteger.valueOf(-1));
			
			symbol_240.setImplicit(true);
			symbol_240.setIsResolveProxies(true);
			symbol_240.setOpposite(symbol_249);
			
			symbol_239.getOwnedAttributes().add(symbol_240);
		}
		{ // Pivot.ecore::pivot::TemplateParameter::TemplateSignature
			symbol_241.setName("TemplateSignature");
			symbol_241.setType(symbol_254);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			symbol_241.setLower(BigInteger.valueOf(0));
			symbol_241.setUpper(BigInteger.valueOf(-1));
			
			symbol_241.setImplicit(true);
			symbol_241.setIsResolveProxies(true);
			symbol_241.setOpposite(symbol_257);
			
			symbol_239.getOwnedAttributes().add(symbol_241);
		}
		{ // Pivot.ecore::pivot::TemplateParameter::default
			symbol_242.setName("default");
			symbol_242.setType(symbol_182);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_242.setLower(BigInteger.valueOf(0));
			
			symbol_242.setIsResolveProxies(true);
			{
				Comment symbol_402 = PivotFactory.eINSTANCE.createComment();
				symbol_402.setBody("The element that is the default for this formal template parameter.");
				symbol_242.getOwnedComments().add(symbol_402);
			}
			
			symbol_239.getOwnedAttributes().add(symbol_242);
		}
		{ // Pivot.ecore::pivot::TemplateParameter::ownedDefault
			symbol_243.setName("ownedDefault");
			symbol_243.setType(symbol_182);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_243.setLower(BigInteger.valueOf(0));
			
			symbol_243.setIsComposite(true);
			symbol_243.setIsResolveProxies(true);
			symbol_243.setOpposite(symbol_183);
			{
				Comment symbol_403 = PivotFactory.eINSTANCE.createComment();
				symbol_403.setBody("The element that is owned by this template parameter for the purpose of providing a default.");
				symbol_243.getOwnedComments().add(symbol_403);
			}
			
			symbol_239.getOwnedAttributes().add(symbol_243);
		}
		{ // Pivot.ecore::pivot::TemplateParameter::ownedParameteredElement
			symbol_244.setName("ownedParameteredElement");
			symbol_244.setType(symbol_182);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_244.setLower(BigInteger.valueOf(0));
			
			symbol_244.setIsComposite(true);
			symbol_244.setIsResolveProxies(true);
			symbol_244.setOpposite(symbol_185);
			{
				Comment symbol_404 = PivotFactory.eINSTANCE.createComment();
				symbol_404.setBody("The element that is owned by this template parameter.");
				symbol_244.getOwnedComments().add(symbol_404);
			}
			
			symbol_239.getOwnedAttributes().add(symbol_244);
		}
		{ // Pivot.ecore::pivot::TemplateParameter::parameteredElement
			symbol_245.setName("parameteredElement");
			symbol_245.setType(symbol_182);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			
			symbol_245.setIsResolveProxies(true);
			symbol_245.setOpposite(symbol_186);
			{
				Comment symbol_405 = PivotFactory.eINSTANCE.createComment();
				symbol_405.setBody("The element exposed by this template parameter.");
				symbol_245.getOwnedComments().add(symbol_405);
			}
			
			symbol_239.getOwnedAttributes().add(symbol_245);
		}
		{ // Pivot.ecore::pivot::TemplateParameter::signature
			symbol_246.setName("signature");
			symbol_246.setType(symbol_254);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			
			symbol_246.setIsResolveProxies(true);
			symbol_246.setOpposite(symbol_256);
			{
				Comment symbol_406 = PivotFactory.eINSTANCE.createComment();
				symbol_406.setBody("The template signature that owns this template parameter.");
				symbol_246.getOwnedComments().add(symbol_406);
			}
			
			symbol_239.getOwnedAttributes().add(symbol_246);
		}
		{
			Comment symbol_407 = PivotFactory.eINSTANCE.createComment();
			symbol_407.setBody("A template parameter exposes a parameterable element as a formal template parameter of a template.");
			symbol_239.getOwnedComments().add(symbol_407);
		}
		
		symbol_0.getOwnedTypes().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		//
		// Pivot.ecore::pivot::TemplateParameterSubstitution http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
		//
		symbol_247.setName("TemplateParameterSubstitution");
		symbol_247.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::TemplateParameterSubstitution::actual
			symbol_248.setName("actual");
			symbol_248.setType(symbol_182);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			
			symbol_248.setIsResolveProxies(true);
			symbol_248.setOpposite(symbol_184);
			{
				Comment symbol_408 = PivotFactory.eINSTANCE.createComment();
				symbol_408.setBody("The element that is the actual parameter for this substitution.");
				symbol_248.getOwnedComments().add(symbol_408);
			}
			
			symbol_247.getOwnedAttributes().add(symbol_248);
		}
		{ // Pivot.ecore::pivot::TemplateParameterSubstitution::formal
			symbol_249.setName("formal");
			symbol_249.setType(symbol_239);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			
			symbol_249.setIsResolveProxies(true);
			symbol_249.setOpposite(symbol_240);
			{
				Comment symbol_409 = PivotFactory.eINSTANCE.createComment();
				symbol_409.setBody("The formal template parameter that is associated with this substitution.");
				symbol_249.getOwnedComments().add(symbol_409);
			}
			
			symbol_247.getOwnedAttributes().add(symbol_249);
		}
		{ // Pivot.ecore::pivot::TemplateParameterSubstitution::ownedActual
			symbol_250.setName("ownedActual");
			symbol_250.setType(symbol_182);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_250.setLower(BigInteger.valueOf(0));
			
			symbol_250.setIsComposite(true);
			symbol_250.setIsResolveProxies(true);
			{
				Comment symbol_410 = PivotFactory.eINSTANCE.createComment();
				symbol_410.setBody("The actual parameter that is owned by this substitution.");
				symbol_250.getOwnedComments().add(symbol_410);
			}
			
			symbol_247.getOwnedAttributes().add(symbol_250);
		}
		{ // Pivot.ecore::pivot::TemplateParameterSubstitution::templateBinding
			symbol_251.setName("templateBinding");
			symbol_251.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
			
			symbol_251.setIsResolveProxies(true);
			symbol_251.setOpposite(symbol_237);
			{
				Comment symbol_411 = PivotFactory.eINSTANCE.createComment();
				symbol_411.setBody("The optional bindings from this element to templates.");
				symbol_251.getOwnedComments().add(symbol_411);
			}
			
			symbol_247.getOwnedAttributes().add(symbol_251);
		}
		{
			Comment symbol_412 = PivotFactory.eINSTANCE.createComment();
			symbol_412.setBody("A template parameter substitution relates the actual parameter to a formal template parameter as part of a template binding.");
			symbol_247.getOwnedComments().add(symbol_412);
		}
		
		symbol_0.getOwnedTypes().add(symbol_247); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterSubstitution
		//
		// Pivot.ecore::pivot::TemplateParameterType http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType
		//
		symbol_252.setName("TemplateParameterType");
		symbol_252.getSuperClasses().add(symbol_270); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		{ // Pivot.ecore::pivot::TemplateParameterType::specification
			symbol_253.setName("specification");
			symbol_253.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_253.setLower(BigInteger.valueOf(0));
			
			symbol_253.setIsResolveProxies(true);
			
			symbol_252.getOwnedAttributes().add(symbol_253);
		}
		
		symbol_0.getOwnedTypes().add(symbol_252); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameterType
		//
		// Pivot.ecore::pivot::TemplateSignature http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
		//
		symbol_254.setName("TemplateSignature");
		symbol_254.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::TemplateSignature::TemplateBinding
			symbol_255.setName("TemplateBinding");
			symbol_255.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
			symbol_255.setLower(BigInteger.valueOf(0));
			symbol_255.setUpper(BigInteger.valueOf(-1));
			
			symbol_255.setImplicit(true);
			symbol_255.setIsResolveProxies(true);
			symbol_255.setOpposite(symbol_238);
			
			symbol_254.getOwnedAttributes().add(symbol_255);
		}
		{ // Pivot.ecore::pivot::TemplateSignature::ownedParameter
			symbol_256.setName("ownedParameter");
			symbol_256.setType(symbol_239);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_256.setLower(BigInteger.valueOf(0));
			symbol_256.setUpper(BigInteger.valueOf(-1));
			symbol_256.setIsOrdered(true);
			
			symbol_256.setIsComposite(true);
			symbol_256.setIsResolveProxies(true);
			symbol_256.setOpposite(symbol_246);
			{
				Comment symbol_413 = PivotFactory.eINSTANCE.createComment();
				symbol_413.setBody("The formal template parameters that are owned by this template signature.");
				symbol_256.getOwnedComments().add(symbol_413);
			}
			
			symbol_254.getOwnedAttributes().add(symbol_256);
		}
		{ // Pivot.ecore::pivot::TemplateSignature::parameter
			symbol_257.setName("parameter");
			symbol_257.setType(symbol_239);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
			symbol_257.setUpper(BigInteger.valueOf(-1));
			symbol_257.setIsOrdered(true);
			
			symbol_257.setIsResolveProxies(true);
			symbol_257.setOpposite(symbol_241);
			{
				Comment symbol_414 = PivotFactory.eINSTANCE.createComment();
				symbol_414.setBody("The ordered set of all formal template parameters for this template signature.");
				symbol_257.getOwnedComments().add(symbol_414);
			}
			
			symbol_254.getOwnedAttributes().add(symbol_257);
		}
		{ // Pivot.ecore::pivot::TemplateSignature::template
			symbol_258.setName("template");
			symbol_258.setType(symbol_259);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
			
			symbol_258.setIsResolveProxies(true);
			symbol_258.setOpposite(symbol_260);
			{
				Comment symbol_415 = PivotFactory.eINSTANCE.createComment();
				symbol_415.setBody("The element that owns this template signature.");
				symbol_258.getOwnedComments().add(symbol_415);
			}
			
			symbol_254.getOwnedAttributes().add(symbol_258);
		}
		{
			Comment symbol_416 = PivotFactory.eINSTANCE.createComment();
			symbol_416.setBody("A template signature bundles the set of formal template parameters for a templated element.");
			symbol_254.getOwnedComments().add(symbol_416);
		}
		
		symbol_0.getOwnedTypes().add(symbol_254); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
		//
		// Pivot.ecore::pivot::TemplateableElement http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		//
		symbol_259.setName("TemplateableElement");
		symbol_259.getSuperClasses().add(symbol_57); // http://www.eclipse.org/ocl/3.1.0/Pivot!Element
		{ // Pivot.ecore::pivot::TemplateableElement::ownedTemplateSignature
			symbol_260.setName("ownedTemplateSignature");
			symbol_260.setType(symbol_254);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature
			symbol_260.setLower(BigInteger.valueOf(0));
			
			symbol_260.setIsComposite(true);
			symbol_260.setIsResolveProxies(true);
			symbol_260.setOpposite(symbol_258);
			{
				Comment symbol_417 = PivotFactory.eINSTANCE.createComment();
				symbol_417.setBody("The optional template signature specifying the formal template parameters.");
				symbol_260.getOwnedComments().add(symbol_417);
			}
			
			symbol_259.getOwnedAttributes().add(symbol_260);
		}
		{ // Pivot.ecore::pivot::TemplateableElement::templateBinding
			symbol_261.setName("templateBinding");
			symbol_261.setType(symbol_235);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateBinding
			symbol_261.setLower(BigInteger.valueOf(0));
			symbol_261.setUpper(BigInteger.valueOf(-1));
			
			symbol_261.setIsComposite(true);
			symbol_261.setIsResolveProxies(true);
			symbol_261.setOpposite(symbol_236);
			{
				Comment symbol_418 = PivotFactory.eINSTANCE.createComment();
				symbol_418.setBody("The optional bindings from this element to templates.");
				symbol_261.getOwnedComments().add(symbol_418);
			}
			
			symbol_259.getOwnedAttributes().add(symbol_261);
		}
		{ // Pivot.ecore::pivot::TemplateableElement::unspecializedElement
			symbol_262.setName("unspecializedElement");
			symbol_262.setType(symbol_259);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
			symbol_262.setLower(BigInteger.valueOf(0));
			
			symbol_262.setIsTransient(true);
			
			symbol_259.getOwnedAttributes().add(symbol_262);
		}
		{	// Pivot.ecore::pivot::TemplateableElement::isTemplate()
			Operation symbol_419 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!isTemplate()
			symbol_419.setName("isTemplate");
			symbol_419.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			{
				Comment symbol_420 = PivotFactory.eINSTANCE.createComment();
				symbol_420.setBody("The query isTemplate() returns whether this templateable element is actually a template.");
				symbol_419.getOwnedComments().add(symbol_420);
			}
			
			symbol_259.getOwnedOperations().add(symbol_419);
		}
		{	// Pivot.ecore::pivot::TemplateableElement::parameterableElements()
			Operation symbol_421 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement!parameterableElements()
			symbol_421.setName("parameterableElements");
			symbol_421.setType(symbol_182);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
			symbol_421.setLower(BigInteger.valueOf(0));
			symbol_421.setUpper(BigInteger.valueOf(-1));
			
			{
				Comment symbol_422 = PivotFactory.eINSTANCE.createComment();
				symbol_422.setBody("The query parameterableElements() returns the set of elements that may be used as the parametered elements for a template parameter of this templateable element. By default, this set includes all the owned elements. Subclasses may override this operation if they choose to restrict the set of parameterable elements.");
				symbol_421.getOwnedComments().add(symbol_422);
			}
			
			symbol_259.getOwnedOperations().add(symbol_421);
		}
		{
			Comment symbol_423 = PivotFactory.eINSTANCE.createComment();
			symbol_423.setBody("A templateable element is an element that can optionally be defined as a template and bound to other templates.");
			symbol_259.getOwnedComments().add(symbol_423);
		}
		
		symbol_0.getOwnedTypes().add(symbol_259); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		//
		// Pivot.ecore::pivot::Throwable http://www.eclipse.org/ocl/3.1.0/Pivot!Throwable
		//
		symbol_263.setName("Throwable");
		symbol_263.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_263); // http://www.eclipse.org/ocl/3.1.0/Pivot!Throwable
		//
		// Pivot.ecore::pivot::TupleLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
		//
		symbol_264.setName("TupleLiteralExp");
		symbol_264.getSuperClasses().add(symbol_107); // http://www.eclipse.org/ocl/3.1.0/Pivot!LiteralExp
		{ // Pivot.ecore::pivot::TupleLiteralExp::part
			symbol_265.setName("part");
			symbol_265.setType(symbol_266);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
			symbol_265.setLower(BigInteger.valueOf(0));
			symbol_265.setUpper(BigInteger.valueOf(-1));
			symbol_265.setIsOrdered(true);
			
			symbol_265.setIsComposite(true);
			symbol_265.setIsResolveProxies(true);
			symbol_265.setOpposite(symbol_267);
			
			symbol_264.getOwnedAttributes().add(symbol_265);
		}
		
		symbol_0.getOwnedTypes().add(symbol_264); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
		//
		// Pivot.ecore::pivot::TupleLiteralPart http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
		//
		symbol_266.setName("TupleLiteralPart");
		symbol_266.getSuperClasses().add(symbol_311); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		{ // Pivot.ecore::pivot::TupleLiteralPart::TupleLiteralExp
			symbol_267.setName("TupleLiteralExp");
			symbol_267.setType(symbol_264);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralExp
			symbol_267.setLower(BigInteger.valueOf(0));
			
			symbol_267.setImplicit(true);
			symbol_267.setIsResolveProxies(true);
			symbol_267.setOpposite(symbol_265);
			
			symbol_266.getOwnedAttributes().add(symbol_267);
		}
		{ // Pivot.ecore::pivot::TupleLiteralPart::initExpression
			symbol_268.setName("initExpression");
			symbol_268.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_268.setLower(BigInteger.valueOf(0));
			
			symbol_268.setIsComposite(true);
			symbol_268.setIsResolveProxies(true);
			symbol_268.setOpposite(symbol_149);
			
			symbol_266.getOwnedAttributes().add(symbol_268);
		}
		
		symbol_0.getOwnedTypes().add(symbol_266); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleLiteralPart
		//
		// Pivot.ecore::pivot::TupleType http://www.eclipse.org/ocl/3.1.0/Pivot!TupleType
		//
		symbol_269.setName("TupleType");
		symbol_269.getSuperClasses().add(symbol_51); // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
		
		symbol_0.getOwnedTypes().add(symbol_269); // http://www.eclipse.org/ocl/3.1.0/Pivot!TupleType
		//
		// Pivot.ecore::pivot::Type http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		//
		symbol_270.setName("Type");
		symbol_270.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		symbol_270.getSuperClasses().add(symbol_259); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateableElement
		symbol_270.getSuperClasses().add(symbol_182); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // Pivot.ecore::pivot::Type::ClassifierType
			symbol_271.setName("ClassifierType");
			symbol_271.setType(symbol_26);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ClassifierType
			symbol_271.setLower(BigInteger.valueOf(0));
			symbol_271.setUpper(BigInteger.valueOf(-1));
			
			symbol_271.setImplicit(true);
			symbol_271.setIsResolveProxies(true);
			symbol_271.setOpposite(symbol_27);
			
			symbol_270.getOwnedAttributes().add(symbol_271);
		}
		{ // Pivot.ecore::pivot::Type::CollectionType
			symbol_272.setName("CollectionType");
			symbol_272.setType(symbol_39);  // http://www.eclipse.org/ocl/3.1.0/Pivot!CollectionType
			symbol_272.setLower(BigInteger.valueOf(0));
			symbol_272.setUpper(BigInteger.valueOf(-1));
			
			symbol_272.setImplicit(true);
			symbol_272.setIsResolveProxies(true);
			symbol_272.setOpposite(symbol_40);
			
			symbol_270.getOwnedAttributes().add(symbol_272);
		}
		{ // Pivot.ecore::pivot::Type::DataType
			symbol_273.setName("DataType");
			symbol_273.setType(symbol_51);  // http://www.eclipse.org/ocl/3.1.0/Pivot!DataType
			symbol_273.setLower(BigInteger.valueOf(0));
			symbol_273.setUpper(BigInteger.valueOf(-1));
			
			symbol_273.setImplicit(true);
			symbol_273.setIsResolveProxies(true);
			symbol_273.setOpposite(symbol_52);
			
			symbol_270.getOwnedAttributes().add(symbol_273);
		}
		{ // Pivot.ecore::pivot::Type::LambdaType
			symbol_274.setName("LambdaType");
			symbol_274.setType(symbol_98);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LambdaType
			symbol_274.setLower(BigInteger.valueOf(0));
			symbol_274.setUpper(BigInteger.valueOf(-1));
			
			symbol_274.setImplicit(true);
			symbol_274.setIsResolveProxies(true);
			
			symbol_270.getOwnedAttributes().add(symbol_274);
		}
		{ // Pivot.ecore::pivot::Type::Operation
			symbol_275.setName("Operation");
			symbol_275.setType(symbol_156);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_275.setLower(BigInteger.valueOf(0));
			symbol_275.setUpper(BigInteger.valueOf(-1));
			
			symbol_275.setImplicit(true);
			symbol_275.setIsResolveProxies(true);
			symbol_275.setOpposite(symbol_164);
			
			symbol_270.getOwnedAttributes().add(symbol_275);
		}
		{ // Pivot.ecore::pivot::Type::Type
			symbol_276.setName("Type");
			symbol_276.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_276.setLower(BigInteger.valueOf(0));
			symbol_276.setUpper(BigInteger.valueOf(-1));
			
			symbol_276.setImplicit(true);
			symbol_276.setIsResolveProxies(true);
			symbol_276.setOpposite(symbol_285);
			
			symbol_270.getOwnedAttributes().add(symbol_276);
		}
		{ // Pivot.ecore::pivot::Type::TypeExp
			symbol_277.setName("TypeExp");
			symbol_277.setType(symbol_286);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
			symbol_277.setLower(BigInteger.valueOf(0));
			symbol_277.setUpper(BigInteger.valueOf(-1));
			
			symbol_277.setImplicit(true);
			symbol_277.setIsResolveProxies(true);
			symbol_277.setOpposite(symbol_287);
			
			symbol_270.getOwnedAttributes().add(symbol_277);
		}
		{ // Pivot.ecore::pivot::Type::TypeTemplateParameter
			symbol_278.setName("TypeTemplateParameter");
			symbol_278.setType(symbol_288);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
			symbol_278.setLower(BigInteger.valueOf(0));
			symbol_278.setUpper(BigInteger.valueOf(-1));
			
			symbol_278.setImplicit(true);
			symbol_278.setIsResolveProxies(true);
			symbol_278.setOpposite(symbol_290);
			
			symbol_270.getOwnedAttributes().add(symbol_278);
		}
		{ // Pivot.ecore::pivot::Type::TypedElement
			symbol_279.setName("TypedElement");
			symbol_279.setType(symbol_291);  // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
			symbol_279.setLower(BigInteger.valueOf(0));
			symbol_279.setUpper(BigInteger.valueOf(-1));
			
			symbol_279.setImplicit(true);
			symbol_279.setIsResolveProxies(true);
			symbol_279.setOpposite(symbol_292);
			
			symbol_270.getOwnedAttributes().add(symbol_279);
		}
		{ // Pivot.ecore::pivot::Type::UnspecifiedType
			symbol_280.setName("UnspecifiedType");
			symbol_280.setType(symbol_297);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
			symbol_280.setLower(BigInteger.valueOf(0));
			symbol_280.setUpper(BigInteger.valueOf(-1));
			
			symbol_280.setImplicit(true);
			symbol_280.setIsResolveProxies(true);
			
			symbol_270.getOwnedAttributes().add(symbol_280);
		}
		{ // Pivot.ecore::pivot::Type::instanceClassName
			symbol_281.setName("instanceClassName");
			symbol_281.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			symbol_281.setLower(BigInteger.valueOf(0));
			
			symbol_281.setIsResolveProxies(true);
			
			symbol_270.getOwnedAttributes().add(symbol_281);
		}
		{ // Pivot.ecore::pivot::Type::ownedAttribute
			symbol_282.setName("ownedAttribute");
			symbol_282.setType(symbol_195);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Property
			symbol_282.setLower(BigInteger.valueOf(0));
			symbol_282.setUpper(BigInteger.valueOf(-1));
			symbol_282.setIsOrdered(true);
			
			symbol_282.setIsComposite(true);
			symbol_282.setIsResolveProxies(true);
			symbol_282.setOpposite(symbol_213);
			
			symbol_270.getOwnedAttributes().add(symbol_282);
		}
		{ // Pivot.ecore::pivot::Type::ownedOperation
			symbol_283.setName("ownedOperation");
			symbol_283.setType(symbol_156);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Operation
			symbol_283.setLower(BigInteger.valueOf(0));
			symbol_283.setUpper(BigInteger.valueOf(-1));
			symbol_283.setIsOrdered(true);
			
			symbol_283.setIsComposite(true);
			symbol_283.setIsResolveProxies(true);
			symbol_283.setOpposite(symbol_162);
			
			symbol_270.getOwnedAttributes().add(symbol_283);
		}
		{ // Pivot.ecore::pivot::Type::package
			symbol_284.setName("package");
			symbol_284.setType(symbol_170);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Package
			symbol_284.setLower(BigInteger.valueOf(0));
			
			symbol_284.setIsResolveProxies(true);
			symbol_284.setOpposite(symbol_176);
			{
				Comment symbol_424 = PivotFactory.eINSTANCE.createComment();
				symbol_424.setBody("Specifies the owning package of this classifier, if any.");
				symbol_284.getOwnedComments().add(symbol_424);
			}
			
			symbol_270.getOwnedAttributes().add(symbol_284);
		}
		{ // Pivot.ecore::pivot::Type::superClass
			symbol_285.setName("superClass");
			symbol_285.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_285.setLower(BigInteger.valueOf(0));
			symbol_285.setUpper(BigInteger.valueOf(-1));
			symbol_285.setIsOrdered(true);
			
			symbol_285.setIsResolveProxies(true);
			symbol_285.setOpposite(symbol_276);
			
			symbol_270.getOwnedAttributes().add(symbol_285);
		}
		{
			Comment symbol_425 = PivotFactory.eINSTANCE.createComment();
			symbol_425.setBody("A type is a named element that is used as the type for a typed element. A type can be contained in a package.\r\nType is defined to be a kind of templateable element so that a type can be parameterized. It is also defined to be a kind of parameterable element so that a type can be a formal template parameter.");
			symbol_270.getOwnedComments().add(symbol_425);
		}
		
		symbol_0.getOwnedTypes().add(symbol_270); // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
		//
		// Pivot.ecore::pivot::TypeExp http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
		//
		symbol_286.setName("TypeExp");
		symbol_286.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::TypeExp::referredType
			symbol_287.setName("referredType");
			symbol_287.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_287.setLower(BigInteger.valueOf(0));
			
			symbol_287.setIsResolveProxies(true);
			symbol_287.setOpposite(symbol_277);
			
			symbol_286.getOwnedAttributes().add(symbol_287);
		}
		
		symbol_0.getOwnedTypes().add(symbol_286); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeExp
		//
		// Pivot.ecore::pivot::TypeTemplateParameter http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
		//
		symbol_288.setName("TypeTemplateParameter");
		symbol_288.getSuperClasses().add(symbol_239); // http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter
		{ // Pivot.ecore::pivot::TypeTemplateParameter::allowSubstitutable
			symbol_289.setName("allowSubstitutable");
			symbol_289.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			symbol_289.setIsResolveProxies(true);
			{
				Comment symbol_426 = PivotFactory.eINSTANCE.createComment();
				symbol_426.setBody("Constrains the required relationship between an actual parameter and the parameteredElement for this formal parameter.");
				symbol_289.getOwnedComments().add(symbol_426);
			}
			
			symbol_288.getOwnedAttributes().add(symbol_289);
		}
		{ // Pivot.ecore::pivot::TypeTemplateParameter::constrainingType
			symbol_290.setName("constrainingType");
			symbol_290.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_290.setLower(BigInteger.valueOf(0));
			symbol_290.setUpper(BigInteger.valueOf(-1));
			
			symbol_290.setIsResolveProxies(true);
			symbol_290.setOpposite(symbol_278);
			{
				Comment symbol_427 = PivotFactory.eINSTANCE.createComment();
				symbol_427.setBody("The classifiers that constrain the argument that can be used for the parameter. If the allowSubstitutable attribute is true, then any classifier that is compatible with this constraining classifier can be substituted; otherwise, it must be either this classifier or one of its subclasses. If this property is empty, there are no constraints on the classifier that can be used as an argument.");
				symbol_290.getOwnedComments().add(symbol_427);
			}
			
			symbol_288.getOwnedAttributes().add(symbol_290);
		}
		{
			Comment symbol_428 = PivotFactory.eINSTANCE.createComment();
			symbol_428.setBody("A type template parameter exposes a type as a formal template parameter.");
			symbol_288.getOwnedComments().add(symbol_428);
		}
		
		symbol_0.getOwnedTypes().add(symbol_288); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypeTemplateParameter
		//
		// Pivot.ecore::pivot::TypedElement http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		//
		symbol_291.setName("TypedElement");
		symbol_291.getSuperClasses().add(symbol_126); // http://www.eclipse.org/ocl/3.1.0/Pivot!NamedElement
		{ // Pivot.ecore::pivot::TypedElement::type
			symbol_292.setName("type");
			symbol_292.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			symbol_292.setLower(BigInteger.valueOf(0));
			
			symbol_292.setIsResolveProxies(true);
			symbol_292.setOpposite(symbol_279);
			{
				Comment symbol_429 = PivotFactory.eINSTANCE.createComment();
				symbol_429.setBody("The type of the TypedElement.");
				symbol_292.getOwnedComments().add(symbol_429);
			}
			
			symbol_291.getOwnedAttributes().add(symbol_292);
		}
		{
			Comment symbol_430 = PivotFactory.eINSTANCE.createComment();
			symbol_430.setBody("A typed element is a kind of named element that represents an element with a type.");
			symbol_291.getOwnedComments().add(symbol_430);
		}
		
		symbol_0.getOwnedTypes().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		//
		// Pivot.ecore::pivot::TypedMultiplicityElement http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		//
		symbol_293.setName("TypedMultiplicityElement");
		symbol_293.getSuperClasses().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		symbol_293.getSuperClasses().add(symbol_120); // http://www.eclipse.org/ocl/3.1.0/Pivot!MultiplicityElement
		
		symbol_0.getOwnedTypes().add(symbol_293); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedMultiplicityElement
		//
		// Pivot.ecore::pivot::UnlimitedNaturalLiteralExp http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp
		//
		symbol_295.setName("UnlimitedNaturalLiteralExp");
		symbol_295.getSuperClasses().add(symbol_136); // http://www.eclipse.org/ocl/3.1.0/Pivot!NumericLiteralExp
		{ // Pivot.ecore::pivot::UnlimitedNaturalLiteralExp::unlimitedNaturalSymbol
			symbol_296.setName("unlimitedNaturalSymbol");
			symbol_296.setType(symbol_294);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			
			symbol_296.setIsResolveProxies(true);
			
			symbol_295.getOwnedAttributes().add(symbol_296);
		}
		
		symbol_0.getOwnedTypes().add(symbol_295); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNaturalLiteralExp
		//
		// Pivot.ecore::pivot::UnspecifiedType http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
		//
		symbol_297.setName("UnspecifiedType");
		symbol_297.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		{ // Pivot.ecore::pivot::UnspecifiedType::lowerBound
			symbol_298.setName("lowerBound");
			symbol_298.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_298.setIsResolveProxies(true);
			
			symbol_297.getOwnedAttributes().add(symbol_298);
		}
		{ // Pivot.ecore::pivot::UnspecifiedType::upperBound
			symbol_299.setName("upperBound");
			symbol_299.setType(symbol_270);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Type
			
			symbol_299.setIsResolveProxies(true);
			symbol_299.setOpposite(symbol_280);
			
			symbol_297.getOwnedAttributes().add(symbol_299);
		}
		
		symbol_0.getOwnedTypes().add(symbol_297); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedType
		//
		// Pivot.ecore::pivot::UnspecifiedValueExp http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedValueExp
		//
		symbol_300.setName("UnspecifiedValueExp");
		symbol_300.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		
		symbol_0.getOwnedTypes().add(symbol_300); // http://www.eclipse.org/ocl/3.1.0/Pivot!UnspecifiedValueExp
		//
		// Pivot.ecore::pivot::ValueSpecification http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		//
		symbol_301.setName("ValueSpecification");
		symbol_301.getSuperClasses().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		symbol_301.getSuperClasses().add(symbol_182); // http://www.eclipse.org/ocl/3.1.0/Pivot!ParameterableElement
		{ // Pivot.ecore::pivot::ValueSpecification::Constraint
			symbol_302.setName("Constraint");
			symbol_302.setType(symbol_45);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Constraint
			symbol_302.setLower(BigInteger.valueOf(0));
			
			symbol_302.setImplicit(true);
			symbol_302.setIsResolveProxies(true);
			symbol_302.setOpposite(symbol_49);
			
			symbol_301.getOwnedAttributes().add(symbol_302);
		}
		{	// Pivot.ecore::pivot::ValueSpecification::booleanValue()
			Operation symbol_431 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!booleanValue()
			symbol_431.setName("booleanValue");
			symbol_431.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			{
				Comment symbol_432 = PivotFactory.eINSTANCE.createComment();
				symbol_432.setBody("The query booleanValue() gives a single Boolean value when one can be computed.");
				symbol_431.getOwnedComments().add(symbol_432);
			}
			
			symbol_301.getOwnedOperations().add(symbol_431);
		}
		{	// Pivot.ecore::pivot::ValueSpecification::integerValue()
			Operation symbol_433 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!integerValue()
			symbol_433.setName("integerValue");
			symbol_433.setType(symbol_86);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Integer
			
			{
				Comment symbol_434 = PivotFactory.eINSTANCE.createComment();
				symbol_434.setBody("The query integerValue() gives a single Integer value when one can be computed.");
				symbol_433.getOwnedComments().add(symbol_434);
			}
			
			symbol_301.getOwnedOperations().add(symbol_433);
		}
		{	// Pivot.ecore::pivot::ValueSpecification::isComputable()
			Operation symbol_435 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!isComputable()
			symbol_435.setName("isComputable");
			symbol_435.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			{
				Comment symbol_436 = PivotFactory.eINSTANCE.createComment();
				symbol_436.setBody("The query isComputable() determines whether a value specification can be computed in a model. This operation cannot be fully defined in OCL. A conforming implementation is expected to deliver true for this operation for all value specifications that it can compute, and to compute all of those for which the operation is true. A conforming implementation is expected to be able to compute the value of all literals.");
				symbol_435.getOwnedComments().add(symbol_436);
			}
			
			symbol_301.getOwnedOperations().add(symbol_435);
		}
		{	// Pivot.ecore::pivot::ValueSpecification::isNull()
			Operation symbol_437 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!isNull()
			symbol_437.setName("isNull");
			symbol_437.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			
			{
				Comment symbol_438 = PivotFactory.eINSTANCE.createComment();
				symbol_438.setBody("The query isNull() returns true when it can be computed that the value is null.");
				symbol_437.getOwnedComments().add(symbol_438);
			}
			
			symbol_301.getOwnedOperations().add(symbol_437);
		}
		{	// Pivot.ecore::pivot::ValueSpecification::stringValue()
			Operation symbol_439 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!stringValue()
			symbol_439.setName("stringValue");
			symbol_439.setType(symbol_232);  // http://www.eclipse.org/ocl/3.1.0/Pivot!String
			
			{
				Comment symbol_440 = PivotFactory.eINSTANCE.createComment();
				symbol_440.setBody("The query stringValue() gives a single String value when one can be computed.");
				symbol_439.getOwnedComments().add(symbol_440);
			}
			
			symbol_301.getOwnedOperations().add(symbol_439);
		}
		{	// Pivot.ecore::pivot::ValueSpecification::unlimitedValue()
			Operation symbol_441 = PivotFactory.eINSTANCE.createOperation(); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification!unlimitedValue()
			symbol_441.setName("unlimitedValue");
			symbol_441.setType(symbol_294);  // http://www.eclipse.org/ocl/3.1.0/Pivot!UnlimitedNatural
			
			{
				Comment symbol_442 = PivotFactory.eINSTANCE.createComment();
				symbol_442.setBody("The query unlimitedValue() gives a single UnlimitedNatural value when one can be computed.");
				symbol_441.getOwnedComments().add(symbol_442);
			}
			
			symbol_301.getOwnedOperations().add(symbol_441);
		}
		{
			Comment symbol_443 = PivotFactory.eINSTANCE.createComment();
			symbol_443.setBody("A value specification is the specification of a (possibly empty) set of instances, including both objects and data values.\r\nValueSpecification specializes ParameterableElement to specify that a value specification can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.");
			symbol_301.getOwnedComments().add(symbol_443);
		}
		
		symbol_0.getOwnedTypes().add(symbol_301); // http://www.eclipse.org/ocl/3.1.0/Pivot!ValueSpecification
		//
		// Pivot.ecore::pivot::Variable http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
		//
		symbol_303.setName("Variable");
		symbol_303.getSuperClasses().add(symbol_311); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		{ // Pivot.ecore::pivot::Variable::ExpressionInOcl
			symbol_304.setName("ExpressionInOcl");
			symbol_304.setType(symbol_70);  // http://www.eclipse.org/ocl/3.1.0/Pivot!ExpressionInOcl
			symbol_304.setLower(BigInteger.valueOf(0));
			symbol_304.setUpper(BigInteger.valueOf(-1));
			
			symbol_304.setImplicit(true);
			symbol_304.setIsResolveProxies(true);
			
			symbol_303.getOwnedAttributes().add(symbol_304);
		}
		{ // Pivot.ecore::pivot::Variable::IterateExp
			symbol_305.setName("IterateExp");
			symbol_305.setType(symbol_91);  // http://www.eclipse.org/ocl/3.1.0/Pivot!IterateExp
			symbol_305.setLower(BigInteger.valueOf(0));
			
			symbol_305.setImplicit(true);
			symbol_305.setIsResolveProxies(true);
			symbol_305.setOpposite(symbol_92);
			
			symbol_303.getOwnedAttributes().add(symbol_305);
		}
		{ // Pivot.ecore::pivot::Variable::LetExp
			symbol_306.setName("LetExp");
			symbol_306.setType(symbol_102);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LetExp
			symbol_306.setLower(BigInteger.valueOf(0));
			
			symbol_306.setImplicit(true);
			symbol_306.setIsResolveProxies(true);
			symbol_306.setOpposite(symbol_104);
			
			symbol_303.getOwnedAttributes().add(symbol_306);
		}
		{ // Pivot.ecore::pivot::Variable::LoopExp
			symbol_307.setName("LoopExp");
			symbol_307.setType(symbol_108);  // http://www.eclipse.org/ocl/3.1.0/Pivot!LoopExp
			symbol_307.setLower(BigInteger.valueOf(0));
			
			symbol_307.setImplicit(true);
			symbol_307.setIsResolveProxies(true);
			symbol_307.setOpposite(symbol_110);
			
			symbol_303.getOwnedAttributes().add(symbol_307);
		}
		{ // Pivot.ecore::pivot::Variable::implicit
			symbol_308.setName("implicit");
			symbol_308.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_308.setLower(BigInteger.valueOf(0));
			
			symbol_308.setIsResolveProxies(true);
			
			symbol_303.getOwnedAttributes().add(symbol_308);
		}
		{ // Pivot.ecore::pivot::Variable::initExpression
			symbol_309.setName("initExpression");
			symbol_309.setType(symbol_138);  // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
			symbol_309.setLower(BigInteger.valueOf(0));
			
			symbol_309.setIsComposite(true);
			symbol_309.setIsResolveProxies(true);
			symbol_309.setOpposite(symbol_150);
			
			symbol_303.getOwnedAttributes().add(symbol_309);
		}
		{ // Pivot.ecore::pivot::Variable::representedParameter
			symbol_310.setName("representedParameter");
			symbol_310.setType(symbol_178);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Parameter
			symbol_310.setLower(BigInteger.valueOf(0));
			
			symbol_310.setIsResolveProxies(true);
			symbol_310.setOpposite(symbol_180);
			
			symbol_303.getOwnedAttributes().add(symbol_310);
		}
		
		symbol_0.getOwnedTypes().add(symbol_303); // http://www.eclipse.org/ocl/3.1.0/Pivot!Variable
		//
		// Pivot.ecore::pivot::VariableDeclaration http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		//
		symbol_311.setName("VariableDeclaration");
		symbol_311.getSuperClasses().add(symbol_291); // http://www.eclipse.org/ocl/3.1.0/Pivot!TypedElement
		{ // Pivot.ecore::pivot::VariableDeclaration::VariableExp
			symbol_312.setName("VariableExp");
			symbol_312.setType(symbol_313);  // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
			symbol_312.setLower(BigInteger.valueOf(0));
			symbol_312.setUpper(BigInteger.valueOf(-1));
			
			symbol_312.setImplicit(true);
			symbol_312.setIsResolveProxies(true);
			symbol_312.setOpposite(symbol_315);
			
			symbol_311.getOwnedAttributes().add(symbol_312);
		}
		
		symbol_0.getOwnedTypes().add(symbol_311); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
		//
		// Pivot.ecore::pivot::VariableExp http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
		//
		symbol_313.setName("VariableExp");
		symbol_313.getSuperClasses().add(symbol_138); // http://www.eclipse.org/ocl/3.1.0/Pivot!OclExpression
		{ // Pivot.ecore::pivot::VariableExp::implicit
			symbol_314.setName("implicit");
			symbol_314.setType(symbol_14);  // http://www.eclipse.org/ocl/3.1.0/Pivot!Boolean
			symbol_314.setLower(BigInteger.valueOf(0));
			
			symbol_314.setIsResolveProxies(true);
			
			symbol_313.getOwnedAttributes().add(symbol_314);
		}
		{ // Pivot.ecore::pivot::VariableExp::referredVariable
			symbol_315.setName("referredVariable");
			symbol_315.setType(symbol_311);  // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableDeclaration
			symbol_315.setLower(BigInteger.valueOf(0));
			
			symbol_315.setIsResolveProxies(true);
			symbol_315.setOpposite(symbol_312);
			
			symbol_313.getOwnedAttributes().add(symbol_315);
		}
		
		symbol_0.getOwnedTypes().add(symbol_313); // http://www.eclipse.org/ocl/3.1.0/Pivot!VariableExp
		//
		// Pivot.ecore::pivot::Visitable http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		//
		symbol_316.setName("Visitable");
		symbol_316.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_316); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitable
		//
		// Pivot.ecore::pivot::Visitor http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}
		//
		symbol_317.setName("Visitor");
		symbol_320.setName("R");
		symbol_319.setOwnedParameteredElement(symbol_320);
		symbol_318.getOwnedParameters().add(symbol_319);
		symbol_322.setName("C");
		symbol_321.setOwnedParameteredElement(symbol_322);
		symbol_318.getOwnedParameters().add(symbol_321);
		
		symbol_317.setOwnedTemplateSignature(symbol_318);
		symbol_317.getSuperClasses().add(standardLibrary.getOclElementType());
		
		symbol_0.getOwnedTypes().add(symbol_317); // http://www.eclipse.org/ocl/3.1.0/Pivot!Visitor{R,C}
		//
		// Pivot.ecore::pivot::VoidType http://www.eclipse.org/ocl/3.1.0/Pivot!VoidType
		//
		symbol_323.setName("VoidType");
		symbol_323.getSuperClasses().add(symbol_23); // http://www.eclipse.org/ocl/3.1.0/Pivot!Class
		
		symbol_0.getOwnedTypes().add(symbol_323); // http://www.eclipse.org/ocl/3.1.0/Pivot!VoidType

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
