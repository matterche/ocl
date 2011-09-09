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

	public OclMetaModel(StandardLibrary standardLibrary, String name, String nsURI) {
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
	public static Package create(StandardLibrary standardLibrary)
	{
		Package symbol_1 = PivotFactory.eINSTANCE.createPackage(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Class symbol_2 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_3 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Annotation::NamedElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_4 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Annotation::ownedContent org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_5 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Annotation::ownedDetail org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_6 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Annotation::reference org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_7 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_8 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_9 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::AssociationClass::AssociationClassCallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_10 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::AssociationClass::unownedAttribute org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_11 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_12 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::AssociationClassCallExp::referredAssociationClass org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Enumeration symbol_13 = PivotFactory.eINSTANCE.createEnumeration(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_14 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		PrimitiveType symbol_15 = standardLibrary.getBooleanType(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Class symbol_16 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_17 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::BooleanLiteralExp::booleanSymbol org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_18 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_19 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::CallExp::implicit org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_20 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::CallExp::source org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_21 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_22 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::CallOperationAction::MessageExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_23 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::CallOperationAction::operation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		DataType symbol_24 = PivotFactory.eINSTANCE.createDataType(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_25 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_26 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Class::Class org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_27 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Class::isAbstract org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_28 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Class::isInterface org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_29 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Class::ownedAttribute org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_30 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Class::ownedOperation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_31 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Class::subClass org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_32 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Class::superClass org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_33 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_34 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::ClassifierType::instanceType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_35 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_36 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::CollectionItem::item org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Enumeration symbol_37 = PivotFactory.eINSTANCE.createEnumeration(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_38 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_39 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::CollectionLiteralExp::kind org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_40 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::CollectionLiteralExp::part org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_41 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_42 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::CollectionLiteralPart::CollectionLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_43 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_44 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::CollectionRange::first org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_45 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::CollectionRange::last org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_46 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_47 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::CollectionType::elementType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_48 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_49 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Comment::Element org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_50 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Comment::annotatedElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_51 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Comment::body org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_52 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_53 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Constraint::NamedElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_54 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Constraint::constrainedElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_55 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Constraint::context org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_56 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Constraint::isCallable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_57 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Constraint::specification org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_58 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Constraint::stereotype org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_59 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_60 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::DataType::behavioralType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_61 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::DataType::isSerializable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_62 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_63 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Detail::Annotation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_64 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Detail::value org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_65 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_66 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Element::Annotation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_67 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Element::Comment org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_68 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Element::Constraint org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_69 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Element::ownedComment org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_70 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_71 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::EnumLiteralExp::referredEnumLiteral org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_72 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_73 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Enumeration::ownedLiteral org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_74 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_75 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::EnumerationLiteral::EnumLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_76 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::EnumerationLiteral::enumeration org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_77 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::EnumerationLiteral::value org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_78 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_79 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::ExpressionInOcl::bodyExpression org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_80 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::ExpressionInOcl::contextVariable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_81 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::ExpressionInOcl::messageExpression org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_82 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::ExpressionInOcl::parameterVariable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_83 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::ExpressionInOcl::resultVariable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_84 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_85 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Feature::implementation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_86 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Feature::implementationClass org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_87 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_88 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::FeatureCallExp::isPre org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_89 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_90 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::IfExp::condition org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_91 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::IfExp::elseExpression org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_92 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::IfExp::thenExpression org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		DataType symbol_93 = PivotFactory.eINSTANCE.createDataType(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		PrimitiveType symbol_94 = standardLibrary.getIntegerType(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Class symbol_95 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_96 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::IntegerLiteralExp::integerSymbol org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_97 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_98 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_99 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_100 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::IterateExp::result org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_101 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_102 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Iteration::LoopExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_103 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Iteration::ownedAccumulator org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_104 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Iteration::ownedIterator org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_105 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_106 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_107 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::LambdaType::contextType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_108 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::LambdaType::parameterType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_109 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::LambdaType::resultType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_110 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_111 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::LetExp::in org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_112 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::LetExp::variable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_113 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_114 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_115 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_116 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::LoopExp::body org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_117 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::LoopExp::iterator org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_118 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::LoopExp::referredIteration org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_119 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_120 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::MessageExp::argument org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_121 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::MessageExp::calledOperation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_122 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::MessageExp::sentSignal org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_123 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::MessageExp::target org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_124 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_125 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::MessageType::referredOperation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_126 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::MessageType::referredSignal org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_127 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_128 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::MultiplicityElement::isOrdered org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_129 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::MultiplicityElement::isUnique org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_130 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::MultiplicityElement::lower org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_131 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::MultiplicityElement::upper org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_132 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_133 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_134 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::NamedElement::Constraint org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_135 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::NamedElement::isStatic org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_136 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::NamedElement::name org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_137 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::NamedElement::ownedAnnotation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_138 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::NamedElement::ownedRule org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_139 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_140 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_141 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::NavigationCallExp::navigationSource org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_142 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::NavigationCallExp::qualifier org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_143 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_144 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		DataType symbol_145 = PivotFactory.eINSTANCE.createDataType(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_146 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_147 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OclExpression::CallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_148 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OclExpression::CollectionItem org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_149 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OclExpression::CollectionRange org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_150 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OclExpression::ExpressionInOcl org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_151 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OclExpression::IfExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_152 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OclExpression::LetExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_153 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OclExpression::LoopExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_154 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OclExpression::MessageExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_155 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OclExpression::NavigationCallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_156 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OclExpression::OperationCallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_157 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OclExpression::TupleLiteralPart org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_158 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OclExpression::Variable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_159 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_160 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OpaqueExpression::body org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_161 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OpaqueExpression::language org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_162 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OpaqueExpression::message org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_163 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OpaqueExpression::valueExpression org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_164 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_165 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Operation::CallOperationAction org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_166 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Operation::MessageType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_167 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Operation::OperationCallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_168 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Operation::class org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_169 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Operation::ownedParameter org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_170 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Operation::precedence org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_171 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Operation::raisedException org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_172 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_173 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OperationCallExp::argument org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_174 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::OperationCallExp::referredOperation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_175 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_176 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_177 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_178 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Package::nestedPackage org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_179 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Package::nestingPackage org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_180 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Package::nsPrefix org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_181 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Package::nsURI org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_182 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Package::ownedPrecedence org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_183 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Package::ownedType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_184 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_185 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_186 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Parameter::Iteration org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_187 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Parameter::Variable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_188 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Parameter::operation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_189 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_190 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::ParameterableElement::TemplateParameter org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_191 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::ParameterableElement::TemplateParameterSubstitution org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_192 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::ParameterableElement::owningTemplateParameter org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_193 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::ParameterableElement::templateParameter org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_194 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_195 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_196 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Precedence::Operation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_197 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Precedence::Package org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_198 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Precedence::associativity org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_199 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Precedence::order org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_200 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_201 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_202 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_203 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::NavigationCallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_204 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::Property org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_205 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::PropertyCallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_206 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::association org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_207 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::class org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_208 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::default org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_209 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::implicit org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_210 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::isComposite org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_211 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::isDerived org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_212 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::isID org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_213 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::isReadOnly org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_214 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::isResolveProxies org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_215 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::isTransient org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_216 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::isUnsettable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_217 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::isVolatile org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_218 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::keys org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_219 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Property::opposite org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_220 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_221 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::PropertyCallExp::referredProperty org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		PrimitiveType symbol_222 = standardLibrary.getRealType(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Class symbol_223 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_224 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::RealLiteralExp::realSymbol org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_225 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_226 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_227 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::SendSignalAction::MessageExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_228 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::SendSignalAction::signal org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_229 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_230 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_231 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_232 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Signal::MessageType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_233 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Signal::SendSignalAction org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_234 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_235 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::State::StateExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_236 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_237 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::StateExp::referredState org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		PrimitiveType symbol_238 = standardLibrary.getStringType(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Class symbol_239 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_240 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::StringLiteralExp::stringSymbol org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_241 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_242 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateBinding::boundElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_243 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateBinding::parameterSubstitution org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_244 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateBinding::signature org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_245 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_246 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateParameter::TemplateParameterSubstitution org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_247 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateParameter::TemplateSignature org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_248 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateParameter::default org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_249 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateParameter::ownedDefault org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_250 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateParameter::ownedParameteredElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_251 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateParameter::parameteredElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_252 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateParameter::signature org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_253 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_254 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateParameterSubstitution::actual org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_255 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateParameterSubstitution::formal org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_256 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateParameterSubstitution::ownedActual org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_257 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateParameterSubstitution::templateBinding org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_258 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_259 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateParameterType::specification org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_260 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_261 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateSignature::TemplateBinding org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_262 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateSignature::ownedParameter org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_263 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateSignature::parameter org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_264 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateSignature::template org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_265 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_266 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateableElement::ownedTemplateSignature org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_267 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateableElement::templateBinding org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_268 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TemplateableElement::unspecializedElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		DataType symbol_269 = PivotFactory.eINSTANCE.createDataType(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_270 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_271 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TupleLiteralExp::part org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_272 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_273 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TupleLiteralPart::TupleLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_274 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TupleLiteralPart::initExpression org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_275 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_276 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_277 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Type::ClassifierType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_278 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Type::CollectionType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_279 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Type::DataType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_280 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Type::LambdaType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_281 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Type::Operation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_282 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Type::TypeExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_283 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Type::TypeTemplateParameter org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_284 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Type::TypedElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_285 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Type::UnspecifiedType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_286 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Type::instanceClassName org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_287 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Type::package org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_288 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_289 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TypeExp::referredType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_290 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_291 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TypeTemplateParameter::allowSubstitutable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_292 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TypeTemplateParameter::constrainingType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_293 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_294 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::TypedElement::type org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_295 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		PrimitiveType symbol_296 = standardLibrary.getUnlimitedNaturalType(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Class symbol_297 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_298 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::UnlimitedNaturalLiteralExp::unlimitedNaturalSymbol org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_299 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_300 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::UnspecifiedType::lowerBound org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_301 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::UnspecifiedType::upperBound org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_302 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_303 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_304 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::ValueSpecification::Constraint org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_305 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_306 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Variable::ExpressionInOcl org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_307 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Variable::IterateExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_308 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Variable::LetExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_309 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Variable::LoopExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_310 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Variable::implicit org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_311 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Variable::initExpression org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_312 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::Variable::representedParameter org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_313 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_314 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::VariableDeclaration::VariableExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_315 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_316 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::VariableExp::implicit org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		Property symbol_317 = PivotFactory.eINSTANCE.createProperty(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false)) // pivot.ecore::pivot::VariableExp::referredVariable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_318 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		Class symbol_319 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		TemplateSignature symbol_320 = PivotFactory.eINSTANCE.createTemplateSignature(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		TypeTemplateParameter symbol_321 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_322 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		TypeTemplateParameter symbol_323 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_324 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		
		
		Class symbol_325 = PivotFactory.eINSTANCE.createClass(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		

		symbol_1.setName("pivot");
		symbol_1.setNsPrefix("pivot");
		symbol_1.setNsURI("http://www.eclipse.org/ocl/3.1.0/Pivot");
		//
		// pivot.ecore::pivot::Annotation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_2.setName("Annotation");
		symbol_2.getSuperClasses().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Annotation::NamedElement
			symbol_3.setName("NamedElement");
			symbol_3.setType(symbol_133);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_3.setLower(BigInteger.valueOf(0));
			
			symbol_3.setImplicit(true);
			symbol_3.setIsResolveProxies(true);
			symbol_3.setOpposite(symbol_137);
			symbol_2.getOwnedAttributes().add(symbol_3);
		}
		{ // pivot.ecore::pivot::Annotation::ownedContent
			symbol_4.setName("ownedContent");
			symbol_4.setType(symbol_65);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_4.setLower(BigInteger.valueOf(0));
			symbol_4.setUpper(BigInteger.valueOf(-1));
			symbol_4.setIsOrdered(true);
			
			symbol_4.setIsComposite(true);
			symbol_4.setIsResolveProxies(true);
			symbol_2.getOwnedAttributes().add(symbol_4);
		}
		{ // pivot.ecore::pivot::Annotation::ownedDetail
			symbol_5.setName("ownedDetail");
			symbol_5.setType(symbol_62);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_5.setLower(BigInteger.valueOf(0));
			symbol_5.setUpper(BigInteger.valueOf(-1));
			symbol_5.setIsOrdered(true);
			
			symbol_5.setIsComposite(true);
			symbol_5.setIsResolveProxies(true);
			symbol_5.setOpposite(symbol_63);
			symbol_2.getOwnedAttributes().add(symbol_5);
		}
		{ // pivot.ecore::pivot::Annotation::reference
			symbol_6.setName("reference");
			symbol_6.setType(symbol_65);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_6.setLower(BigInteger.valueOf(0));
			symbol_6.setUpper(BigInteger.valueOf(-1));
			symbol_6.setIsOrdered(true);
			
			symbol_6.setIsResolveProxies(true);
			symbol_6.setOpposite(symbol_66);
			symbol_2.getOwnedAttributes().add(symbol_6);
		}
		symbol_1.getOwnedTypes().add(symbol_2); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::AnyType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_7.setName("AnyType");
		symbol_7.getSuperClasses().add(symbol_25); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_7); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::AssociationClass org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_8.setName("AssociationClass");
		symbol_8.getSuperClasses().add(symbol_25); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::AssociationClass::AssociationClassCallExp
			symbol_9.setName("AssociationClassCallExp");
			symbol_9.setType(symbol_11);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_9.setLower(BigInteger.valueOf(0));
			symbol_9.setUpper(BigInteger.valueOf(-1));
			
			symbol_9.setImplicit(true);
			symbol_9.setIsResolveProxies(true);
			symbol_9.setOpposite(symbol_12);
			symbol_8.getOwnedAttributes().add(symbol_9);
		}
		{ // pivot.ecore::pivot::AssociationClass::unownedAttribute
			symbol_10.setName("unownedAttribute");
			symbol_10.setType(symbol_202);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_10.setLower(BigInteger.valueOf(0));
			symbol_10.setUpper(BigInteger.valueOf(-1));
			
			symbol_10.setIsResolveProxies(true);
			symbol_10.setOpposite(symbol_206);
			symbol_8.getOwnedAttributes().add(symbol_10);
		}
		symbol_1.getOwnedTypes().add(symbol_8); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::AssociationClassCallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_11.setName("AssociationClassCallExp");
		symbol_11.getSuperClasses().add(symbol_140); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::AssociationClassCallExp::referredAssociationClass
			symbol_12.setName("referredAssociationClass");
			symbol_12.setType(symbol_8);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_12.setLower(BigInteger.valueOf(0));
			
			symbol_12.setIsResolveProxies(true);
			symbol_12.setOpposite(symbol_9);
			symbol_11.getOwnedAttributes().add(symbol_12);
		}
		symbol_1.getOwnedTypes().add(symbol_11); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::AssociativityKind org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_13.setName("AssociativityKind");
		{
			EnumerationLiteral symbol_326 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::AssociativityKind::Left org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_326.setName("Left");
			symbol_13.getOwnedLiterals().add(symbol_326);
			EnumerationLiteral symbol_327 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::AssociativityKind::Right org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_327.setName("Right");
			symbol_13.getOwnedLiterals().add(symbol_327);
		}
		
		symbol_1.getOwnedTypes().add(symbol_13); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::BagType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_14.setName("BagType");
		symbol_14.getSuperClasses().add(symbol_46); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_14); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::BooleanLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_16.setName("BooleanLiteralExp");
		symbol_16.getSuperClasses().add(symbol_200); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::BooleanLiteralExp::booleanSymbol
			symbol_17.setName("booleanSymbol");
			symbol_17.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_17.setIsResolveProxies(true);
			symbol_17.setIsUnsettable(true);
			symbol_16.getOwnedAttributes().add(symbol_17);
		}
		symbol_1.getOwnedTypes().add(symbol_16); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::CallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_18.setName("CallExp");
		symbol_18.getSuperClasses().add(symbol_146); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::CallExp::implicit
			symbol_19.setName("implicit");
			symbol_19.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_19.setLower(BigInteger.valueOf(0));
			
			symbol_19.setIsResolveProxies(true);
			symbol_18.getOwnedAttributes().add(symbol_19);
		}
		{ // pivot.ecore::pivot::CallExp::source
			symbol_20.setName("source");
			symbol_20.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_20.setLower(BigInteger.valueOf(0));
			
			symbol_20.setIsComposite(true);
			symbol_20.setIsResolveProxies(true);
			symbol_20.setOpposite(symbol_147);
			symbol_18.getOwnedAttributes().add(symbol_20);
		}
		symbol_1.getOwnedTypes().add(symbol_18); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::CallOperationAction org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_21.setName("CallOperationAction");
		symbol_21.getSuperClasses().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::CallOperationAction::MessageExp
			symbol_22.setName("MessageExp");
			symbol_22.setType(symbol_119);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_22.setLower(BigInteger.valueOf(0));
			
			symbol_22.setImplicit(true);
			symbol_22.setIsResolveProxies(true);
			symbol_22.setOpposite(symbol_121);
			symbol_21.getOwnedAttributes().add(symbol_22);
		}
		{ // pivot.ecore::pivot::CallOperationAction::operation
			symbol_23.setName("operation");
			symbol_23.setType(symbol_164);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_23.setIsResolveProxies(true);
			symbol_23.setOpposite(symbol_165);
			symbol_21.getOwnedAttributes().add(symbol_23);
		}
		symbol_1.getOwnedTypes().add(symbol_21); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::CallableImplementation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_24.setName("CallableImplementation");
		symbol_24.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_24); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Class org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_25.setName("Class");
		symbol_25.getSuperClasses().add(symbol_276); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_25.getSuperClasses().add(symbol_139); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Class::Class
			symbol_26.setName("Class");
			symbol_26.setType(symbol_25);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_26.setLower(BigInteger.valueOf(0));
			symbol_26.setUpper(BigInteger.valueOf(-1));
			
			symbol_26.setImplicit(true);
			symbol_26.setIsResolveProxies(true);
			symbol_26.setOpposite(symbol_32);
			symbol_25.getOwnedAttributes().add(symbol_26);
		}
		{ // pivot.ecore::pivot::Class::isAbstract
			symbol_27.setName("isAbstract");
			symbol_27.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_27.setIsResolveProxies(true);
			symbol_25.getOwnedAttributes().add(symbol_27);
		}
		{ // pivot.ecore::pivot::Class::isInterface
			symbol_28.setName("isInterface");
			symbol_28.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_28.setIsResolveProxies(true);
			symbol_25.getOwnedAttributes().add(symbol_28);
		}
		{ // pivot.ecore::pivot::Class::ownedAttribute
			symbol_29.setName("ownedAttribute");
			symbol_29.setType(symbol_202);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_29.setLower(BigInteger.valueOf(0));
			symbol_29.setUpper(BigInteger.valueOf(-1));
			symbol_29.setIsOrdered(true);
			
			symbol_29.setIsComposite(true);
			symbol_29.setIsResolveProxies(true);
			symbol_29.setOpposite(symbol_207);
			symbol_25.getOwnedAttributes().add(symbol_29);
		}
		{ // pivot.ecore::pivot::Class::ownedOperation
			symbol_30.setName("ownedOperation");
			symbol_30.setType(symbol_164);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_30.setLower(BigInteger.valueOf(0));
			symbol_30.setUpper(BigInteger.valueOf(-1));
			symbol_30.setIsOrdered(true);
			
			symbol_30.setIsComposite(true);
			symbol_30.setIsResolveProxies(true);
			symbol_30.setOpposite(symbol_168);
			symbol_25.getOwnedAttributes().add(symbol_30);
		}
		{ // pivot.ecore::pivot::Class::subClass
			symbol_31.setName("subClass");
			symbol_31.setType(symbol_25);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_31.setLower(BigInteger.valueOf(0));
			symbol_31.setUpper(BigInteger.valueOf(-1));
			
			symbol_31.setIsTransient(true);
			symbol_25.getOwnedAttributes().add(symbol_31);
		}
		{ // pivot.ecore::pivot::Class::superClass
			symbol_32.setName("superClass");
			symbol_32.setType(symbol_25);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_32.setLower(BigInteger.valueOf(0));
			symbol_32.setUpper(BigInteger.valueOf(-1));
			
			symbol_32.setIsResolveProxies(true);
			symbol_32.setOpposite(symbol_26);
			symbol_25.getOwnedAttributes().add(symbol_32);
		}
		symbol_1.getOwnedTypes().add(symbol_25); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::ClassifierType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_33.setName("ClassifierType");
		symbol_33.getSuperClasses().add(symbol_59); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::ClassifierType::instanceType
			symbol_34.setName("instanceType");
			symbol_34.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_34.setIsResolveProxies(true);
			symbol_34.setOpposite(symbol_277);
			symbol_33.getOwnedAttributes().add(symbol_34);
		}
		symbol_1.getOwnedTypes().add(symbol_33); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::CollectionItem org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_35.setName("CollectionItem");
		symbol_35.getSuperClasses().add(symbol_41); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::CollectionItem::item
			symbol_36.setName("item");
			symbol_36.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_36.setIsComposite(true);
			symbol_36.setIsResolveProxies(true);
			symbol_36.setOpposite(symbol_148);
			symbol_35.getOwnedAttributes().add(symbol_36);
		}
		symbol_1.getOwnedTypes().add(symbol_35); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::CollectionKind org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_37.setName("CollectionKind");
		{
			EnumerationLiteral symbol_328 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::Collection org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_328.setName("Collection");
			symbol_37.getOwnedLiterals().add(symbol_328);
			EnumerationLiteral symbol_329 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::Set org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_329.setName("Set");
			symbol_37.getOwnedLiterals().add(symbol_329);
			EnumerationLiteral symbol_330 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::OrderedSet org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_330.setName("OrderedSet");
			symbol_37.getOwnedLiterals().add(symbol_330);
			EnumerationLiteral symbol_331 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::Bag org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_331.setName("Bag");
			symbol_37.getOwnedLiterals().add(symbol_331);
			EnumerationLiteral symbol_332 = PivotFactory.eINSTANCE.createEnumerationLiteral(); // pivot.ecore::pivot::CollectionKind::Sequence org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_332.setName("Sequence");
			symbol_37.getOwnedLiterals().add(symbol_332);
		}
		
		symbol_1.getOwnedTypes().add(symbol_37); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::CollectionLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_38.setName("CollectionLiteralExp");
		symbol_38.getSuperClasses().add(symbol_114); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::CollectionLiteralExp::kind
			symbol_39.setName("kind");
			symbol_39.setType(symbol_37);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_39.setIsResolveProxies(true);
			symbol_38.getOwnedAttributes().add(symbol_39);
		}
		{ // pivot.ecore::pivot::CollectionLiteralExp::part
			symbol_40.setName("part");
			symbol_40.setType(symbol_41);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_40.setLower(BigInteger.valueOf(0));
			symbol_40.setUpper(BigInteger.valueOf(-1));
			symbol_40.setIsOrdered(true);
			
			symbol_40.setIsComposite(true);
			symbol_40.setIsResolveProxies(true);
			symbol_40.setOpposite(symbol_42);
			symbol_38.getOwnedAttributes().add(symbol_40);
		}
		symbol_1.getOwnedTypes().add(symbol_38); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::CollectionLiteralPart org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_41.setName("CollectionLiteralPart");
		symbol_41.getSuperClasses().add(symbol_293); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::CollectionLiteralPart::CollectionLiteralExp
			symbol_42.setName("CollectionLiteralExp");
			symbol_42.setType(symbol_38);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_42.setLower(BigInteger.valueOf(0));
			
			symbol_42.setImplicit(true);
			symbol_42.setIsResolveProxies(true);
			symbol_42.setOpposite(symbol_40);
			symbol_41.getOwnedAttributes().add(symbol_42);
		}
		symbol_1.getOwnedTypes().add(symbol_41); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::CollectionRange org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_43.setName("CollectionRange");
		symbol_43.getSuperClasses().add(symbol_41); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::CollectionRange::first
			symbol_44.setName("first");
			symbol_44.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_44.setIsComposite(true);
			symbol_44.setIsResolveProxies(true);
			symbol_44.setOpposite(symbol_149);
			symbol_43.getOwnedAttributes().add(symbol_44);
		}
		{ // pivot.ecore::pivot::CollectionRange::last
			symbol_45.setName("last");
			symbol_45.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_45.setIsComposite(true);
			symbol_45.setIsResolveProxies(true);
			symbol_43.getOwnedAttributes().add(symbol_45);
		}
		symbol_1.getOwnedTypes().add(symbol_43); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::CollectionType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_46.setName("CollectionType");
		symbol_46.getSuperClasses().add(symbol_59); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::CollectionType::elementType
			symbol_47.setName("elementType");
			symbol_47.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_47.setIsResolveProxies(true);
			symbol_47.setOpposite(symbol_278);
			symbol_46.getOwnedAttributes().add(symbol_47);
		}
		symbol_1.getOwnedTypes().add(symbol_46); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Comment org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_48.setName("Comment");
		symbol_48.getSuperClasses().add(symbol_65); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Comment::Element
			symbol_49.setName("Element");
			symbol_49.setType(symbol_65);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_49.setLower(BigInteger.valueOf(0));
			
			symbol_49.setImplicit(true);
			symbol_49.setIsResolveProxies(true);
			symbol_49.setOpposite(symbol_69);
			symbol_48.getOwnedAttributes().add(symbol_49);
		}
		{ // pivot.ecore::pivot::Comment::annotatedElement
			symbol_50.setName("annotatedElement");
			symbol_50.setType(symbol_65);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_50.setLower(BigInteger.valueOf(0));
			symbol_50.setUpper(BigInteger.valueOf(-1));
			
			symbol_50.setIsResolveProxies(true);
			symbol_50.setOpposite(symbol_67);
			symbol_48.getOwnedAttributes().add(symbol_50);
		}
		{ // pivot.ecore::pivot::Comment::body
			symbol_51.setName("body");
			symbol_51.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_51.setLower(BigInteger.valueOf(0));
			
			symbol_51.setIsResolveProxies(true);
			symbol_48.getOwnedAttributes().add(symbol_51);
		}
		symbol_1.getOwnedTypes().add(symbol_48); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Constraint org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_52.setName("Constraint");
		symbol_52.getSuperClasses().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Constraint::NamedElement
			symbol_53.setName("NamedElement");
			symbol_53.setType(symbol_133);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_53.setLower(BigInteger.valueOf(0));
			
			symbol_53.setImplicit(true);
			symbol_53.setIsResolveProxies(true);
			symbol_53.setOpposite(symbol_138);
			symbol_52.getOwnedAttributes().add(symbol_53);
		}
		{ // pivot.ecore::pivot::Constraint::constrainedElement
			symbol_54.setName("constrainedElement");
			symbol_54.setType(symbol_65);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_54.setLower(BigInteger.valueOf(0));
			symbol_54.setUpper(BigInteger.valueOf(-1));
			symbol_54.setIsOrdered(true);
			
			symbol_54.setIsResolveProxies(true);
			symbol_54.setOpposite(symbol_68);
			symbol_52.getOwnedAttributes().add(symbol_54);
		}
		{ // pivot.ecore::pivot::Constraint::context
			symbol_55.setName("context");
			symbol_55.setType(symbol_133);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_55.setLower(BigInteger.valueOf(0));
			
			symbol_55.setIsResolveProxies(true);
			symbol_55.setOpposite(symbol_134);
			symbol_52.getOwnedAttributes().add(symbol_55);
		}
		{ // pivot.ecore::pivot::Constraint::isCallable
			symbol_56.setName("isCallable");
			symbol_56.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_56.setIsResolveProxies(true);
			symbol_52.getOwnedAttributes().add(symbol_56);
		}
		{ // pivot.ecore::pivot::Constraint::specification
			symbol_57.setName("specification");
			symbol_57.setType(symbol_303);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_57.setIsComposite(true);
			symbol_57.setIsResolveProxies(true);
			symbol_57.setOpposite(symbol_304);
			symbol_52.getOwnedAttributes().add(symbol_57);
		}
		{ // pivot.ecore::pivot::Constraint::stereotype
			symbol_58.setName("stereotype");
			symbol_58.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_58.setLower(BigInteger.valueOf(0));
			
			symbol_58.setIsResolveProxies(true);
			symbol_52.getOwnedAttributes().add(symbol_58);
		}
		symbol_1.getOwnedTypes().add(symbol_52); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::DataType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_59.setName("DataType");
		symbol_59.getSuperClasses().add(symbol_25); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::DataType::behavioralType
			symbol_60.setName("behavioralType");
			symbol_60.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_60.setLower(BigInteger.valueOf(0));
			
			symbol_60.setIsResolveProxies(true);
			symbol_60.setOpposite(symbol_279);
			symbol_59.getOwnedAttributes().add(symbol_60);
		}
		{ // pivot.ecore::pivot::DataType::isSerializable
			symbol_61.setName("isSerializable");
			symbol_61.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_61.setIsResolveProxies(true);
			symbol_59.getOwnedAttributes().add(symbol_61);
		}
		symbol_1.getOwnedTypes().add(symbol_59); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Detail org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_62.setName("Detail");
		symbol_62.getSuperClasses().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Detail::Annotation
			symbol_63.setName("Annotation");
			symbol_63.setType(symbol_2);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_63.setLower(BigInteger.valueOf(0));
			
			symbol_63.setImplicit(true);
			symbol_63.setIsResolveProxies(true);
			symbol_63.setOpposite(symbol_5);
			symbol_62.getOwnedAttributes().add(symbol_63);
		}
		{ // pivot.ecore::pivot::Detail::value
			symbol_64.setName("value");
			symbol_64.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_64.setUpper(BigInteger.valueOf(-1));
			
			symbol_64.setIsResolveProxies(true);
			symbol_62.getOwnedAttributes().add(symbol_64);
		}
		symbol_1.getOwnedTypes().add(symbol_62); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Element org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_65.setName("Element");
		symbol_65.getSuperClasses().add(symbol_318); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Element::Annotation
			symbol_66.setName("Annotation");
			symbol_66.setType(symbol_2);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_66.setLower(BigInteger.valueOf(0));
			symbol_66.setUpper(BigInteger.valueOf(-1));
			
			symbol_66.setImplicit(true);
			symbol_66.setIsResolveProxies(true);
			symbol_65.getOwnedAttributes().add(symbol_66);
		}
		{ // pivot.ecore::pivot::Element::Comment
			symbol_67.setName("Comment");
			symbol_67.setType(symbol_48);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_67.setLower(BigInteger.valueOf(0));
			symbol_67.setUpper(BigInteger.valueOf(-1));
			
			symbol_67.setImplicit(true);
			symbol_67.setIsResolveProxies(true);
			symbol_67.setOpposite(symbol_50);
			symbol_65.getOwnedAttributes().add(symbol_67);
		}
		{ // pivot.ecore::pivot::Element::Constraint
			symbol_68.setName("Constraint");
			symbol_68.setType(symbol_52);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_68.setLower(BigInteger.valueOf(0));
			symbol_68.setUpper(BigInteger.valueOf(-1));
			
			symbol_68.setImplicit(true);
			symbol_68.setIsResolveProxies(true);
			symbol_68.setOpposite(symbol_54);
			symbol_65.getOwnedAttributes().add(symbol_68);
		}
		{ // pivot.ecore::pivot::Element::ownedComment
			symbol_69.setName("ownedComment");
			symbol_69.setType(symbol_48);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_69.setLower(BigInteger.valueOf(0));
			symbol_69.setUpper(BigInteger.valueOf(-1));
			
			symbol_69.setIsComposite(true);
			symbol_69.setIsResolveProxies(true);
			symbol_69.setOpposite(symbol_49);
			symbol_65.getOwnedAttributes().add(symbol_69);
		}
		symbol_1.getOwnedTypes().add(symbol_65); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::EnumLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_70.setName("EnumLiteralExp");
		symbol_70.getSuperClasses().add(symbol_114); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::EnumLiteralExp::referredEnumLiteral
			symbol_71.setName("referredEnumLiteral");
			symbol_71.setType(symbol_74);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_71.setLower(BigInteger.valueOf(0));
			
			symbol_71.setIsResolveProxies(true);
			symbol_71.setOpposite(symbol_75);
			symbol_70.getOwnedAttributes().add(symbol_71);
		}
		symbol_1.getOwnedTypes().add(symbol_70); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Enumeration org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_72.setName("Enumeration");
		symbol_72.getSuperClasses().add(symbol_59); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Enumeration::ownedLiteral
			symbol_73.setName("ownedLiteral");
			symbol_73.setType(symbol_74);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_73.setLower(BigInteger.valueOf(0));
			symbol_73.setUpper(BigInteger.valueOf(-1));
			symbol_73.setIsOrdered(true);
			
			symbol_73.setIsComposite(true);
			symbol_73.setIsResolveProxies(true);
			symbol_73.setOpposite(symbol_76);
			symbol_72.getOwnedAttributes().add(symbol_73);
		}
		symbol_1.getOwnedTypes().add(symbol_72); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::EnumerationLiteral org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_74.setName("EnumerationLiteral");
		symbol_74.getSuperClasses().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::EnumerationLiteral::EnumLiteralExp
			symbol_75.setName("EnumLiteralExp");
			symbol_75.setType(symbol_70);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_75.setLower(BigInteger.valueOf(0));
			symbol_75.setUpper(BigInteger.valueOf(-1));
			
			symbol_75.setImplicit(true);
			symbol_75.setIsResolveProxies(true);
			symbol_75.setOpposite(symbol_71);
			symbol_74.getOwnedAttributes().add(symbol_75);
		}
		{ // pivot.ecore::pivot::EnumerationLiteral::enumeration
			symbol_76.setName("enumeration");
			symbol_76.setType(symbol_72);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_76.setLower(BigInteger.valueOf(0));
			
			symbol_76.setIsResolveProxies(true);
			symbol_76.setOpposite(symbol_73);
			symbol_74.getOwnedAttributes().add(symbol_76);
		}
		{ // pivot.ecore::pivot::EnumerationLiteral::value
			symbol_77.setName("value");
			symbol_77.setType(symbol_94);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_77.setLower(BigInteger.valueOf(0));
			
			symbol_77.setIsResolveProxies(true);
			symbol_74.getOwnedAttributes().add(symbol_77);
		}
		symbol_1.getOwnedTypes().add(symbol_74); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::ExpressionInOcl org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_78.setName("ExpressionInOcl");
		symbol_78.getSuperClasses().add(symbol_159); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::ExpressionInOcl::bodyExpression
			symbol_79.setName("bodyExpression");
			symbol_79.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_79.setIsComposite(true);
			symbol_79.setIsResolveProxies(true);
			symbol_79.setOpposite(symbol_150);
			symbol_78.getOwnedAttributes().add(symbol_79);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::contextVariable
			symbol_80.setName("contextVariable");
			symbol_80.setType(symbol_305);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_80.setLower(BigInteger.valueOf(0));
			
			symbol_80.setIsComposite(true);
			symbol_80.setIsResolveProxies(true);
			symbol_78.getOwnedAttributes().add(symbol_80);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::messageExpression
			symbol_81.setName("messageExpression");
			symbol_81.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_81.setLower(BigInteger.valueOf(0));
			
			symbol_81.setIsComposite(true);
			symbol_81.setIsResolveProxies(true);
			symbol_78.getOwnedAttributes().add(symbol_81);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::parameterVariable
			symbol_82.setName("parameterVariable");
			symbol_82.setType(symbol_305);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_82.setLower(BigInteger.valueOf(0));
			symbol_82.setUpper(BigInteger.valueOf(-1));
			symbol_82.setIsOrdered(true);
			
			symbol_82.setIsComposite(true);
			symbol_82.setIsResolveProxies(true);
			symbol_78.getOwnedAttributes().add(symbol_82);
		}
		{ // pivot.ecore::pivot::ExpressionInOcl::resultVariable
			symbol_83.setName("resultVariable");
			symbol_83.setType(symbol_305);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_83.setLower(BigInteger.valueOf(0));
			
			symbol_83.setIsComposite(true);
			symbol_83.setIsResolveProxies(true);
			symbol_83.setOpposite(symbol_306);
			symbol_78.getOwnedAttributes().add(symbol_83);
		}
		symbol_1.getOwnedTypes().add(symbol_78); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Feature org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_84.setName("Feature");
		symbol_84.getSuperClasses().add(symbol_295); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Feature::implementation
			symbol_85.setName("implementation");
			symbol_85.setType(symbol_24);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_85.setLower(BigInteger.valueOf(0));
			
			symbol_85.setIsResolveProxies(true);
			symbol_85.setIsTransient(true);
			symbol_84.getOwnedAttributes().add(symbol_85);
		}
		{ // pivot.ecore::pivot::Feature::implementationClass
			symbol_86.setName("implementationClass");
			symbol_86.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_86.setLower(BigInteger.valueOf(0));
			
			symbol_86.setIsResolveProxies(true);
			symbol_84.getOwnedAttributes().add(symbol_86);
		}
		symbol_1.getOwnedTypes().add(symbol_84); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::FeatureCallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_87.setName("FeatureCallExp");
		symbol_87.getSuperClasses().add(symbol_18); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::FeatureCallExp::isPre
			symbol_88.setName("isPre");
			symbol_88.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_88.setIsResolveProxies(true);
			symbol_87.getOwnedAttributes().add(symbol_88);
		}
		symbol_1.getOwnedTypes().add(symbol_87); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::IfExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_89.setName("IfExp");
		symbol_89.getSuperClasses().add(symbol_146); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::IfExp::condition
			symbol_90.setName("condition");
			symbol_90.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_90.setIsComposite(true);
			symbol_90.setIsResolveProxies(true);
			symbol_89.getOwnedAttributes().add(symbol_90);
		}
		{ // pivot.ecore::pivot::IfExp::elseExpression
			symbol_91.setName("elseExpression");
			symbol_91.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_91.setIsComposite(true);
			symbol_91.setIsResolveProxies(true);
			symbol_91.setOpposite(symbol_151);
			symbol_89.getOwnedAttributes().add(symbol_91);
		}
		{ // pivot.ecore::pivot::IfExp::thenExpression
			symbol_92.setName("thenExpression");
			symbol_92.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_92.setIsComposite(true);
			symbol_92.setIsResolveProxies(true);
			symbol_89.getOwnedAttributes().add(symbol_92);
		}
		symbol_1.getOwnedTypes().add(symbol_89); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Int org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_93.setName("Int");
		symbol_93.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_93); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::IntegerLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_95.setName("IntegerLiteralExp");
		symbol_95.getSuperClasses().add(symbol_144); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::IntegerLiteralExp::integerSymbol
			symbol_96.setName("integerSymbol");
			symbol_96.setType(symbol_94);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_96.setIsResolveProxies(true);
			symbol_95.getOwnedAttributes().add(symbol_96);
		}
		symbol_1.getOwnedTypes().add(symbol_95); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::InvalidLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_97.setName("InvalidLiteralExp");
		symbol_97.getSuperClasses().add(symbol_114); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_97); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::InvalidType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_98.setName("InvalidType");
		symbol_98.getSuperClasses().add(symbol_25); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_98); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::IterateExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_99.setName("IterateExp");
		symbol_99.getSuperClasses().add(symbol_115); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::IterateExp::result
			symbol_100.setName("result");
			symbol_100.setType(symbol_305);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_100.setLower(BigInteger.valueOf(0));
			symbol_100.setIsOrdered(true);
			
			symbol_100.setIsComposite(true);
			symbol_100.setIsResolveProxies(true);
			symbol_100.setOpposite(symbol_307);
			symbol_99.getOwnedAttributes().add(symbol_100);
		}
		symbol_1.getOwnedTypes().add(symbol_99); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Iteration org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_101.setName("Iteration");
		symbol_101.getSuperClasses().add(symbol_164); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Iteration::LoopExp
			symbol_102.setName("LoopExp");
			symbol_102.setType(symbol_115);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_102.setLower(BigInteger.valueOf(0));
			symbol_102.setUpper(BigInteger.valueOf(-1));
			
			symbol_102.setImplicit(true);
			symbol_102.setIsResolveProxies(true);
			symbol_102.setOpposite(symbol_118);
			symbol_101.getOwnedAttributes().add(symbol_102);
		}
		{ // pivot.ecore::pivot::Iteration::ownedAccumulator
			symbol_103.setName("ownedAccumulator");
			symbol_103.setType(symbol_185);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_103.setLower(BigInteger.valueOf(0));
			symbol_103.setUpper(BigInteger.valueOf(-1));
			
			symbol_103.setIsComposite(true);
			symbol_103.setIsResolveProxies(true);
			symbol_101.getOwnedAttributes().add(symbol_103);
		}
		{ // pivot.ecore::pivot::Iteration::ownedIterator
			symbol_104.setName("ownedIterator");
			symbol_104.setType(symbol_185);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_104.setLower(BigInteger.valueOf(0));
			symbol_104.setUpper(BigInteger.valueOf(-1));
			
			symbol_104.setIsComposite(true);
			symbol_104.setIsResolveProxies(true);
			symbol_104.setOpposite(symbol_186);
			symbol_101.getOwnedAttributes().add(symbol_104);
		}
		symbol_1.getOwnedTypes().add(symbol_101); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::IteratorExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_105.setName("IteratorExp");
		symbol_105.getSuperClasses().add(symbol_115); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_105); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::LambdaType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_106.setName("LambdaType");
		symbol_106.getSuperClasses().add(symbol_59); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::LambdaType::contextType
			symbol_107.setName("contextType");
			symbol_107.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_107.setIsResolveProxies(true);
			symbol_107.setOpposite(symbol_280);
			symbol_106.getOwnedAttributes().add(symbol_107);
		}
		{ // pivot.ecore::pivot::LambdaType::parameterType
			symbol_108.setName("parameterType");
			symbol_108.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_108.setLower(BigInteger.valueOf(0));
			symbol_108.setUpper(BigInteger.valueOf(-1));
			
			symbol_108.setIsResolveProxies(true);
			symbol_106.getOwnedAttributes().add(symbol_108);
		}
		{ // pivot.ecore::pivot::LambdaType::resultType
			symbol_109.setName("resultType");
			symbol_109.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_109.setIsResolveProxies(true);
			symbol_106.getOwnedAttributes().add(symbol_109);
		}
		symbol_1.getOwnedTypes().add(symbol_106); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::LetExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_110.setName("LetExp");
		symbol_110.getSuperClasses().add(symbol_146); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::LetExp::in
			symbol_111.setName("in");
			symbol_111.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_111.setIsComposite(true);
			symbol_111.setIsResolveProxies(true);
			symbol_111.setOpposite(symbol_152);
			symbol_110.getOwnedAttributes().add(symbol_111);
		}
		{ // pivot.ecore::pivot::LetExp::variable
			symbol_112.setName("variable");
			symbol_112.setType(symbol_305);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_112.setIsComposite(true);
			symbol_112.setIsResolveProxies(true);
			symbol_112.setOpposite(symbol_308);
			symbol_110.getOwnedAttributes().add(symbol_112);
		}
		symbol_1.getOwnedTypes().add(symbol_110); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Library org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_113.setName("Library");
		symbol_113.getSuperClasses().add(symbol_177); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_113); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::LiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_114.setName("LiteralExp");
		symbol_114.getSuperClasses().add(symbol_146); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_114); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::LoopExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_115.setName("LoopExp");
		symbol_115.getSuperClasses().add(symbol_18); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::LoopExp::body
			symbol_116.setName("body");
			symbol_116.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_116.setIsComposite(true);
			symbol_116.setIsResolveProxies(true);
			symbol_116.setOpposite(symbol_153);
			symbol_115.getOwnedAttributes().add(symbol_116);
		}
		{ // pivot.ecore::pivot::LoopExp::iterator
			symbol_117.setName("iterator");
			symbol_117.setType(symbol_305);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_117.setLower(BigInteger.valueOf(0));
			symbol_117.setUpper(BigInteger.valueOf(-1));
			symbol_117.setIsOrdered(true);
			
			symbol_117.setIsComposite(true);
			symbol_117.setIsResolveProxies(true);
			symbol_117.setOpposite(symbol_309);
			symbol_115.getOwnedAttributes().add(symbol_117);
		}
		{ // pivot.ecore::pivot::LoopExp::referredIteration
			symbol_118.setName("referredIteration");
			symbol_118.setType(symbol_101);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_118.setLower(BigInteger.valueOf(0));
			
			symbol_118.setIsResolveProxies(true);
			symbol_118.setOpposite(symbol_102);
			symbol_115.getOwnedAttributes().add(symbol_118);
		}
		symbol_1.getOwnedTypes().add(symbol_115); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::MessageExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_119.setName("MessageExp");
		symbol_119.getSuperClasses().add(symbol_146); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::MessageExp::argument
			symbol_120.setName("argument");
			symbol_120.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_120.setLower(BigInteger.valueOf(0));
			symbol_120.setUpper(BigInteger.valueOf(-1));
			symbol_120.setIsOrdered(true);
			
			symbol_120.setIsComposite(true);
			symbol_120.setIsResolveProxies(true);
			symbol_119.getOwnedAttributes().add(symbol_120);
		}
		{ // pivot.ecore::pivot::MessageExp::calledOperation
			symbol_121.setName("calledOperation");
			symbol_121.setType(symbol_21);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_121.setLower(BigInteger.valueOf(0));
			
			symbol_121.setIsComposite(true);
			symbol_121.setIsResolveProxies(true);
			symbol_121.setOpposite(symbol_22);
			symbol_119.getOwnedAttributes().add(symbol_121);
		}
		{ // pivot.ecore::pivot::MessageExp::sentSignal
			symbol_122.setName("sentSignal");
			symbol_122.setType(symbol_226);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_122.setLower(BigInteger.valueOf(0));
			
			symbol_122.setIsComposite(true);
			symbol_122.setIsResolveProxies(true);
			symbol_122.setOpposite(symbol_227);
			symbol_119.getOwnedAttributes().add(symbol_122);
		}
		{ // pivot.ecore::pivot::MessageExp::target
			symbol_123.setName("target");
			symbol_123.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_123.setIsComposite(true);
			symbol_123.setIsResolveProxies(true);
			symbol_123.setOpposite(symbol_154);
			symbol_119.getOwnedAttributes().add(symbol_123);
		}
		symbol_1.getOwnedTypes().add(symbol_119); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::MessageType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_124.setName("MessageType");
		symbol_124.getSuperClasses().add(symbol_276); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::MessageType::referredOperation
			symbol_125.setName("referredOperation");
			symbol_125.setType(symbol_164);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_125.setLower(BigInteger.valueOf(0));
			
			symbol_125.setIsResolveProxies(true);
			symbol_125.setOpposite(symbol_166);
			symbol_124.getOwnedAttributes().add(symbol_125);
		}
		{ // pivot.ecore::pivot::MessageType::referredSignal
			symbol_126.setName("referredSignal");
			symbol_126.setType(symbol_231);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_126.setLower(BigInteger.valueOf(0));
			
			symbol_126.setIsResolveProxies(true);
			symbol_126.setOpposite(symbol_232);
			symbol_124.getOwnedAttributes().add(symbol_126);
		}
		symbol_1.getOwnedTypes().add(symbol_124); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::MultiplicityElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_127.setName("MultiplicityElement");
		symbol_127.getSuperClasses().add(symbol_65); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::MultiplicityElement::isOrdered
			symbol_128.setName("isOrdered");
			symbol_128.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_128.setIsResolveProxies(true);
			symbol_127.getOwnedAttributes().add(symbol_128);
		}
		{ // pivot.ecore::pivot::MultiplicityElement::isUnique
			symbol_129.setName("isUnique");
			symbol_129.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_129.setIsResolveProxies(true);
			symbol_127.getOwnedAttributes().add(symbol_129);
		}
		{ // pivot.ecore::pivot::MultiplicityElement::lower
			symbol_130.setName("lower");
			symbol_130.setType(symbol_94);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_130.setLower(BigInteger.valueOf(0));
			
			symbol_130.setIsResolveProxies(true);
			symbol_127.getOwnedAttributes().add(symbol_130);
		}
		{ // pivot.ecore::pivot::MultiplicityElement::upper
			symbol_131.setName("upper");
			symbol_131.setType(symbol_296);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_131.setLower(BigInteger.valueOf(0));
			
			symbol_131.setIsResolveProxies(true);
			symbol_127.getOwnedAttributes().add(symbol_131);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::includesCardinality()
			Operation symbol_333 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_333.setName("includesCardinality");
			symbol_333.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			Parameter symbol_334 = PivotFactory.eINSTANCE.createParameter(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_334.setName("C");
			symbol_334.setType(symbol_94);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_333.getOwnedParameters().add(symbol_334);
			symbol_127.getOwnedOperations().add(symbol_333);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::includesMultiplicity()
			Operation symbol_335 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_335.setName("includesMultiplicity");
			symbol_335.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			Parameter symbol_336 = PivotFactory.eINSTANCE.createParameter(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_336.setName("M");
			symbol_336.setType(symbol_127);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_335.getOwnedParameters().add(symbol_336);
			symbol_127.getOwnedOperations().add(symbol_335);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::isMultivalued()
			Operation symbol_337 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_337.setName("isMultivalued");
			symbol_337.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_127.getOwnedOperations().add(symbol_337);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::lowerBound()
			Operation symbol_338 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_338.setName("lowerBound");
			symbol_338.setType(symbol_94);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_127.getOwnedOperations().add(symbol_338);
		}
		{	// pivot.ecore::pivot::MultiplicityElement::upperBound()
			Operation symbol_339 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_339.setName("upperBound");
			symbol_339.setType(symbol_296);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_127.getOwnedOperations().add(symbol_339);
		}
		symbol_1.getOwnedTypes().add(symbol_127); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Nameable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_132.setName("Nameable");
		symbol_132.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_132); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::NamedElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_133.setName("NamedElement");
		symbol_133.getSuperClasses().add(symbol_65); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_133.getSuperClasses().add(symbol_132); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::NamedElement::Constraint
			symbol_134.setName("Constraint");
			symbol_134.setType(symbol_52);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_134.setLower(BigInteger.valueOf(0));
			symbol_134.setUpper(BigInteger.valueOf(-1));
			
			symbol_134.setImplicit(true);
			symbol_134.setIsResolveProxies(true);
			symbol_134.setOpposite(symbol_55);
			symbol_133.getOwnedAttributes().add(symbol_134);
		}
		{ // pivot.ecore::pivot::NamedElement::isStatic
			symbol_135.setName("isStatic");
			symbol_135.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_135.setIsResolveProxies(true);
			symbol_133.getOwnedAttributes().add(symbol_135);
		}
		{ // pivot.ecore::pivot::NamedElement::name
			symbol_136.setName("name");
			symbol_136.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_136.setLower(BigInteger.valueOf(0));
			
			symbol_136.setIsResolveProxies(true);
			symbol_133.getOwnedAttributes().add(symbol_136);
		}
		{ // pivot.ecore::pivot::NamedElement::ownedAnnotation
			symbol_137.setName("ownedAnnotation");
			symbol_137.setType(symbol_2);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_137.setLower(BigInteger.valueOf(0));
			symbol_137.setUpper(BigInteger.valueOf(-1));
			symbol_137.setIsOrdered(true);
			
			symbol_137.setIsComposite(true);
			symbol_137.setIsResolveProxies(true);
			symbol_137.setOpposite(symbol_3);
			symbol_133.getOwnedAttributes().add(symbol_137);
		}
		{ // pivot.ecore::pivot::NamedElement::ownedRule
			symbol_138.setName("ownedRule");
			symbol_138.setType(symbol_52);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_138.setLower(BigInteger.valueOf(0));
			symbol_138.setUpper(BigInteger.valueOf(-1));
			symbol_138.setIsOrdered(true);
			
			symbol_138.setIsComposite(true);
			symbol_138.setIsResolveProxies(true);
			symbol_138.setOpposite(symbol_53);
			symbol_133.getOwnedAttributes().add(symbol_138);
		}
		symbol_1.getOwnedTypes().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Namespace org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_139.setName("Namespace");
		symbol_139.getSuperClasses().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_139); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::NavigationCallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_140.setName("NavigationCallExp");
		symbol_140.getSuperClasses().add(symbol_87); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::NavigationCallExp::navigationSource
			symbol_141.setName("navigationSource");
			symbol_141.setType(symbol_202);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_141.setLower(BigInteger.valueOf(0));
			symbol_141.setIsOrdered(true);
			
			symbol_141.setIsResolveProxies(true);
			symbol_141.setOpposite(symbol_203);
			symbol_140.getOwnedAttributes().add(symbol_141);
		}
		{ // pivot.ecore::pivot::NavigationCallExp::qualifier
			symbol_142.setName("qualifier");
			symbol_142.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_142.setLower(BigInteger.valueOf(0));
			symbol_142.setUpper(BigInteger.valueOf(-1));
			symbol_142.setIsOrdered(true);
			
			symbol_142.setIsResolveProxies(true);
			symbol_142.setOpposite(symbol_155);
			symbol_140.getOwnedAttributes().add(symbol_142);
		}
		symbol_1.getOwnedTypes().add(symbol_140); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::NullLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_143.setName("NullLiteralExp");
		symbol_143.getSuperClasses().add(symbol_200); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_143); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::NumericLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_144.setName("NumericLiteralExp");
		symbol_144.getSuperClasses().add(symbol_200); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_144); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Object org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_145.setName("Object");
		symbol_145.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_145); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::OclExpression org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_146.setName("OclExpression");
		symbol_146.getSuperClasses().add(symbol_293); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::OclExpression::CallExp
			symbol_147.setName("CallExp");
			symbol_147.setType(symbol_18);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_147.setLower(BigInteger.valueOf(0));
			
			symbol_147.setImplicit(true);
			symbol_147.setIsResolveProxies(true);
			symbol_147.setOpposite(symbol_20);
			symbol_146.getOwnedAttributes().add(symbol_147);
		}
		{ // pivot.ecore::pivot::OclExpression::CollectionItem
			symbol_148.setName("CollectionItem");
			symbol_148.setType(symbol_35);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_148.setLower(BigInteger.valueOf(0));
			
			symbol_148.setImplicit(true);
			symbol_148.setIsResolveProxies(true);
			symbol_148.setOpposite(symbol_36);
			symbol_146.getOwnedAttributes().add(symbol_148);
		}
		{ // pivot.ecore::pivot::OclExpression::CollectionRange
			symbol_149.setName("CollectionRange");
			symbol_149.setType(symbol_43);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_149.setLower(BigInteger.valueOf(0));
			symbol_149.setUpper(BigInteger.valueOf(-1));
			
			symbol_149.setImplicit(true);
			symbol_149.setIsResolveProxies(true);
			symbol_146.getOwnedAttributes().add(symbol_149);
		}
		{ // pivot.ecore::pivot::OclExpression::ExpressionInOcl
			symbol_150.setName("ExpressionInOcl");
			symbol_150.setType(symbol_78);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_150.setLower(BigInteger.valueOf(0));
			symbol_150.setUpper(BigInteger.valueOf(-1));
			
			symbol_150.setImplicit(true);
			symbol_150.setIsResolveProxies(true);
			symbol_146.getOwnedAttributes().add(symbol_150);
		}
		{ // pivot.ecore::pivot::OclExpression::IfExp
			symbol_151.setName("IfExp");
			symbol_151.setType(symbol_89);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_151.setLower(BigInteger.valueOf(0));
			symbol_151.setUpper(BigInteger.valueOf(-1));
			
			symbol_151.setImplicit(true);
			symbol_151.setIsResolveProxies(true);
			symbol_146.getOwnedAttributes().add(symbol_151);
		}
		{ // pivot.ecore::pivot::OclExpression::LetExp
			symbol_152.setName("LetExp");
			symbol_152.setType(symbol_110);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_152.setLower(BigInteger.valueOf(0));
			
			symbol_152.setImplicit(true);
			symbol_152.setIsResolveProxies(true);
			symbol_152.setOpposite(symbol_111);
			symbol_146.getOwnedAttributes().add(symbol_152);
		}
		{ // pivot.ecore::pivot::OclExpression::LoopExp
			symbol_153.setName("LoopExp");
			symbol_153.setType(symbol_115);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_153.setLower(BigInteger.valueOf(0));
			
			symbol_153.setImplicit(true);
			symbol_153.setIsResolveProxies(true);
			symbol_153.setOpposite(symbol_116);
			symbol_146.getOwnedAttributes().add(symbol_153);
		}
		{ // pivot.ecore::pivot::OclExpression::MessageExp
			symbol_154.setName("MessageExp");
			symbol_154.setType(symbol_119);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_154.setLower(BigInteger.valueOf(0));
			symbol_154.setUpper(BigInteger.valueOf(-1));
			
			symbol_154.setImplicit(true);
			symbol_154.setIsResolveProxies(true);
			symbol_146.getOwnedAttributes().add(symbol_154);
		}
		{ // pivot.ecore::pivot::OclExpression::NavigationCallExp
			symbol_155.setName("NavigationCallExp");
			symbol_155.setType(symbol_140);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_155.setLower(BigInteger.valueOf(0));
			symbol_155.setUpper(BigInteger.valueOf(-1));
			
			symbol_155.setImplicit(true);
			symbol_155.setIsResolveProxies(true);
			symbol_155.setOpposite(symbol_142);
			symbol_146.getOwnedAttributes().add(symbol_155);
		}
		{ // pivot.ecore::pivot::OclExpression::OperationCallExp
			symbol_156.setName("OperationCallExp");
			symbol_156.setType(symbol_172);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_156.setLower(BigInteger.valueOf(0));
			
			symbol_156.setImplicit(true);
			symbol_156.setIsResolveProxies(true);
			symbol_156.setOpposite(symbol_173);
			symbol_146.getOwnedAttributes().add(symbol_156);
		}
		{ // pivot.ecore::pivot::OclExpression::TupleLiteralPart
			symbol_157.setName("TupleLiteralPart");
			symbol_157.setType(symbol_272);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_157.setLower(BigInteger.valueOf(0));
			
			symbol_157.setImplicit(true);
			symbol_157.setIsResolveProxies(true);
			symbol_157.setOpposite(symbol_274);
			symbol_146.getOwnedAttributes().add(symbol_157);
		}
		{ // pivot.ecore::pivot::OclExpression::Variable
			symbol_158.setName("Variable");
			symbol_158.setType(symbol_305);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_158.setLower(BigInteger.valueOf(0));
			
			symbol_158.setImplicit(true);
			symbol_158.setIsResolveProxies(true);
			symbol_158.setOpposite(symbol_311);
			symbol_146.getOwnedAttributes().add(symbol_158);
		}
		symbol_1.getOwnedTypes().add(symbol_146); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::OpaqueExpression org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_159.setName("OpaqueExpression");
		symbol_159.getSuperClasses().add(symbol_303); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::OpaqueExpression::body
			symbol_160.setName("body");
			symbol_160.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_160.setLower(BigInteger.valueOf(0));
			symbol_160.setUpper(BigInteger.valueOf(-1));
			symbol_160.setIsOrdered(true);
			symbol_160.setIsUnique(false);
			
			symbol_160.setIsResolveProxies(true);
			symbol_159.getOwnedAttributes().add(symbol_160);
		}
		{ // pivot.ecore::pivot::OpaqueExpression::language
			symbol_161.setName("language");
			symbol_161.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_161.setLower(BigInteger.valueOf(0));
			symbol_161.setUpper(BigInteger.valueOf(-1));
			symbol_161.setIsOrdered(true);
			
			symbol_161.setIsResolveProxies(true);
			symbol_159.getOwnedAttributes().add(symbol_161);
		}
		{ // pivot.ecore::pivot::OpaqueExpression::message
			symbol_162.setName("message");
			symbol_162.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_162.setLower(BigInteger.valueOf(0));
			symbol_162.setUpper(BigInteger.valueOf(-1));
			symbol_162.setIsOrdered(true);
			symbol_162.setIsUnique(false);
			
			symbol_162.setIsResolveProxies(true);
			symbol_159.getOwnedAttributes().add(symbol_162);
		}
		{ // pivot.ecore::pivot::OpaqueExpression::valueExpression
			symbol_163.setName("valueExpression");
			symbol_163.setType(symbol_78);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_163.setLower(BigInteger.valueOf(0));
			
			symbol_163.setIsResolveProxies(true);
			symbol_163.setIsTransient(true);
			symbol_159.getOwnedAttributes().add(symbol_163);
		}
		symbol_1.getOwnedTypes().add(symbol_159); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Operation org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_164.setName("Operation");
		symbol_164.getSuperClasses().add(symbol_84); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_164.getSuperClasses().add(symbol_189); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_164.getSuperClasses().add(symbol_139); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_164.getSuperClasses().add(symbol_265); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Operation::CallOperationAction
			symbol_165.setName("CallOperationAction");
			symbol_165.setType(symbol_21);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_165.setLower(BigInteger.valueOf(0));
			symbol_165.setUpper(BigInteger.valueOf(-1));
			
			symbol_165.setImplicit(true);
			symbol_165.setIsResolveProxies(true);
			symbol_165.setOpposite(symbol_23);
			symbol_164.getOwnedAttributes().add(symbol_165);
		}
		{ // pivot.ecore::pivot::Operation::MessageType
			symbol_166.setName("MessageType");
			symbol_166.setType(symbol_124);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_166.setLower(BigInteger.valueOf(0));
			symbol_166.setUpper(BigInteger.valueOf(-1));
			
			symbol_166.setImplicit(true);
			symbol_166.setIsResolveProxies(true);
			symbol_166.setOpposite(symbol_125);
			symbol_164.getOwnedAttributes().add(symbol_166);
		}
		{ // pivot.ecore::pivot::Operation::OperationCallExp
			symbol_167.setName("OperationCallExp");
			symbol_167.setType(symbol_172);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_167.setLower(BigInteger.valueOf(0));
			symbol_167.setUpper(BigInteger.valueOf(-1));
			
			symbol_167.setImplicit(true);
			symbol_167.setIsResolveProxies(true);
			symbol_167.setOpposite(symbol_174);
			symbol_164.getOwnedAttributes().add(symbol_167);
		}
		{ // pivot.ecore::pivot::Operation::class
			symbol_168.setName("class");
			symbol_168.setType(symbol_25);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_168.setLower(BigInteger.valueOf(0));
			
			symbol_168.setIsResolveProxies(true);
			symbol_168.setOpposite(symbol_30);
			symbol_164.getOwnedAttributes().add(symbol_168);
		}
		{ // pivot.ecore::pivot::Operation::ownedParameter
			symbol_169.setName("ownedParameter");
			symbol_169.setType(symbol_185);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_169.setLower(BigInteger.valueOf(0));
			symbol_169.setUpper(BigInteger.valueOf(-1));
			symbol_169.setIsOrdered(true);
			
			symbol_169.setIsComposite(true);
			symbol_169.setIsResolveProxies(true);
			symbol_169.setOpposite(symbol_188);
			symbol_164.getOwnedAttributes().add(symbol_169);
		}
		{ // pivot.ecore::pivot::Operation::precedence
			symbol_170.setName("precedence");
			symbol_170.setType(symbol_195);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_170.setLower(BigInteger.valueOf(0));
			
			symbol_170.setIsResolveProxies(true);
			symbol_170.setOpposite(symbol_196);
			symbol_164.getOwnedAttributes().add(symbol_170);
		}
		{ // pivot.ecore::pivot::Operation::raisedException
			symbol_171.setName("raisedException");
			symbol_171.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_171.setLower(BigInteger.valueOf(0));
			symbol_171.setUpper(BigInteger.valueOf(-1));
			
			symbol_171.setIsResolveProxies(true);
			symbol_171.setOpposite(symbol_281);
			symbol_164.getOwnedAttributes().add(symbol_171);
		}
		symbol_1.getOwnedTypes().add(symbol_164); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::OperationCallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_172.setName("OperationCallExp");
		symbol_172.getSuperClasses().add(symbol_87); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::OperationCallExp::argument
			symbol_173.setName("argument");
			symbol_173.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_173.setLower(BigInteger.valueOf(0));
			symbol_173.setUpper(BigInteger.valueOf(-1));
			symbol_173.setIsOrdered(true);
			
			symbol_173.setIsComposite(true);
			symbol_173.setIsResolveProxies(true);
			symbol_173.setOpposite(symbol_156);
			symbol_172.getOwnedAttributes().add(symbol_173);
		}
		{ // pivot.ecore::pivot::OperationCallExp::referredOperation
			symbol_174.setName("referredOperation");
			symbol_174.setType(symbol_164);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_174.setLower(BigInteger.valueOf(0));
			
			symbol_174.setIsResolveProxies(true);
			symbol_174.setOpposite(symbol_167);
			symbol_172.getOwnedAttributes().add(symbol_174);
		}
		symbol_1.getOwnedTypes().add(symbol_172); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::OperationTemplateParameter org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_175.setName("OperationTemplateParameter");
		symbol_175.getSuperClasses().add(symbol_245); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_175); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::OrderedSetType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_176.setName("OrderedSetType");
		symbol_176.getSuperClasses().add(symbol_46); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_176); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Package org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_177.setName("Package");
		symbol_177.getSuperClasses().add(symbol_139); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_177.getSuperClasses().add(symbol_265); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Package::nestedPackage
			symbol_178.setName("nestedPackage");
			symbol_178.setType(symbol_177);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_178.setLower(BigInteger.valueOf(0));
			symbol_178.setUpper(BigInteger.valueOf(-1));
			
			symbol_178.setIsComposite(true);
			symbol_178.setIsResolveProxies(true);
			symbol_178.setOpposite(symbol_179);
			symbol_177.getOwnedAttributes().add(symbol_178);
		}
		{ // pivot.ecore::pivot::Package::nestingPackage
			symbol_179.setName("nestingPackage");
			symbol_179.setType(symbol_177);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_179.setLower(BigInteger.valueOf(0));
			
			symbol_179.setIsResolveProxies(true);
			symbol_179.setOpposite(symbol_178);
			symbol_177.getOwnedAttributes().add(symbol_179);
		}
		{ // pivot.ecore::pivot::Package::nsPrefix
			symbol_180.setName("nsPrefix");
			symbol_180.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_180.setLower(BigInteger.valueOf(0));
			
			symbol_180.setIsResolveProxies(true);
			symbol_177.getOwnedAttributes().add(symbol_180);
		}
		{ // pivot.ecore::pivot::Package::nsURI
			symbol_181.setName("nsURI");
			symbol_181.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_181.setLower(BigInteger.valueOf(0));
			
			symbol_181.setIsResolveProxies(true);
			symbol_177.getOwnedAttributes().add(symbol_181);
		}
		{ // pivot.ecore::pivot::Package::ownedPrecedence
			symbol_182.setName("ownedPrecedence");
			symbol_182.setType(symbol_195);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_182.setLower(BigInteger.valueOf(0));
			symbol_182.setUpper(BigInteger.valueOf(-1));
			symbol_182.setIsOrdered(true);
			
			symbol_182.setIsComposite(true);
			symbol_182.setIsResolveProxies(true);
			symbol_182.setOpposite(symbol_197);
			symbol_177.getOwnedAttributes().add(symbol_182);
		}
		{ // pivot.ecore::pivot::Package::ownedType
			symbol_183.setName("ownedType");
			symbol_183.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_183.setLower(BigInteger.valueOf(0));
			symbol_183.setUpper(BigInteger.valueOf(-1));
			
			symbol_183.setIsComposite(true);
			symbol_183.setIsResolveProxies(true);
			symbol_183.setOpposite(symbol_287);
			symbol_177.getOwnedAttributes().add(symbol_183);
		}
		symbol_1.getOwnedTypes().add(symbol_177); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::PackageableElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_184.setName("PackageableElement");
		symbol_184.getSuperClasses().add(symbol_189); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_184); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Parameter org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_185.setName("Parameter");
		symbol_185.getSuperClasses().add(symbol_295); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_185.getSuperClasses().add(symbol_313); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Parameter::Iteration
			symbol_186.setName("Iteration");
			symbol_186.setType(symbol_101);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_186.setLower(BigInteger.valueOf(0));
			symbol_186.setUpper(BigInteger.valueOf(-1));
			
			symbol_186.setImplicit(true);
			symbol_186.setIsResolveProxies(true);
			symbol_185.getOwnedAttributes().add(symbol_186);
		}
		{ // pivot.ecore::pivot::Parameter::Variable
			symbol_187.setName("Variable");
			symbol_187.setType(symbol_305);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_187.setLower(BigInteger.valueOf(0));
			symbol_187.setUpper(BigInteger.valueOf(-1));
			
			symbol_187.setImplicit(true);
			symbol_187.setIsResolveProxies(true);
			symbol_187.setOpposite(symbol_312);
			symbol_185.getOwnedAttributes().add(symbol_187);
		}
		{ // pivot.ecore::pivot::Parameter::operation
			symbol_188.setName("operation");
			symbol_188.setType(symbol_164);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_188.setLower(BigInteger.valueOf(0));
			
			symbol_188.setIsResolveProxies(true);
			symbol_188.setOpposite(symbol_169);
			symbol_185.getOwnedAttributes().add(symbol_188);
		}
		symbol_1.getOwnedTypes().add(symbol_185); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::ParameterableElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_189.setName("ParameterableElement");
		symbol_189.getSuperClasses().add(symbol_65); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::ParameterableElement::TemplateParameter
			symbol_190.setName("TemplateParameter");
			symbol_190.setType(symbol_245);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_190.setLower(BigInteger.valueOf(0));
			symbol_190.setUpper(BigInteger.valueOf(-1));
			
			symbol_190.setImplicit(true);
			symbol_190.setIsResolveProxies(true);
			symbol_189.getOwnedAttributes().add(symbol_190);
		}
		{ // pivot.ecore::pivot::ParameterableElement::TemplateParameterSubstitution
			symbol_191.setName("TemplateParameterSubstitution");
			symbol_191.setType(symbol_253);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_191.setLower(BigInteger.valueOf(0));
			symbol_191.setUpper(BigInteger.valueOf(-1));
			
			symbol_191.setImplicit(true);
			symbol_191.setIsResolveProxies(true);
			symbol_189.getOwnedAttributes().add(symbol_191);
		}
		{ // pivot.ecore::pivot::ParameterableElement::owningTemplateParameter
			symbol_192.setName("owningTemplateParameter");
			symbol_192.setType(symbol_245);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_192.setLower(BigInteger.valueOf(0));
			
			symbol_192.setIsResolveProxies(true);
			symbol_192.setOpposite(symbol_250);
			symbol_189.getOwnedAttributes().add(symbol_192);
		}
		{ // pivot.ecore::pivot::ParameterableElement::templateParameter
			symbol_193.setName("templateParameter");
			symbol_193.setType(symbol_245);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_193.setLower(BigInteger.valueOf(0));
			
			symbol_193.setIsResolveProxies(true);
			symbol_193.setOpposite(symbol_251);
			symbol_189.getOwnedAttributes().add(symbol_193);
		}
		{	// pivot.ecore::pivot::ParameterableElement::isTemplateParameter()
			Operation symbol_340 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_340.setName("isTemplateParameter");
			symbol_340.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_189.getOwnedOperations().add(symbol_340);
		}
		symbol_1.getOwnedTypes().add(symbol_189); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Pivotable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_194.setName("Pivotable");
		symbol_194.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_194); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Precedence org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_195.setName("Precedence");
		symbol_195.getSuperClasses().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Precedence::Operation
			symbol_196.setName("Operation");
			symbol_196.setType(symbol_164);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_196.setLower(BigInteger.valueOf(0));
			symbol_196.setUpper(BigInteger.valueOf(-1));
			
			symbol_196.setImplicit(true);
			symbol_196.setIsResolveProxies(true);
			symbol_196.setOpposite(symbol_170);
			symbol_195.getOwnedAttributes().add(symbol_196);
		}
		{ // pivot.ecore::pivot::Precedence::Package
			symbol_197.setName("Package");
			symbol_197.setType(symbol_177);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_197.setLower(BigInteger.valueOf(0));
			
			symbol_197.setImplicit(true);
			symbol_197.setIsResolveProxies(true);
			symbol_197.setOpposite(symbol_182);
			symbol_195.getOwnedAttributes().add(symbol_197);
		}
		{ // pivot.ecore::pivot::Precedence::associativity
			symbol_198.setName("associativity");
			symbol_198.setType(symbol_13);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_198.setLower(BigInteger.valueOf(0));
			
			symbol_198.setIsResolveProxies(true);
			symbol_195.getOwnedAttributes().add(symbol_198);
		}
		{ // pivot.ecore::pivot::Precedence::order
			symbol_199.setName("order");
			symbol_199.setType(symbol_94);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_199.setIsDerived(true);
			symbol_199.setIsResolveProxies(true);
			symbol_199.setIsVolatile(true);
			symbol_195.getOwnedAttributes().add(symbol_199);
		}
		symbol_1.getOwnedTypes().add(symbol_195); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::PrimitiveLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_200.setName("PrimitiveLiteralExp");
		symbol_200.getSuperClasses().add(symbol_114); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_200); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::PrimitiveType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_201.setName("PrimitiveType");
		symbol_201.getSuperClasses().add(symbol_59); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_201); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Property org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_202.setName("Property");
		symbol_202.getSuperClasses().add(symbol_84); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_202.getSuperClasses().add(symbol_189); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Property::NavigationCallExp
			symbol_203.setName("NavigationCallExp");
			symbol_203.setType(symbol_140);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_203.setLower(BigInteger.valueOf(0));
			symbol_203.setUpper(BigInteger.valueOf(-1));
			
			symbol_203.setImplicit(true);
			symbol_203.setIsResolveProxies(true);
			symbol_203.setOpposite(symbol_141);
			symbol_202.getOwnedAttributes().add(symbol_203);
		}
		{ // pivot.ecore::pivot::Property::Property
			symbol_204.setName("Property");
			symbol_204.setType(symbol_202);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_204.setLower(BigInteger.valueOf(0));
			symbol_204.setUpper(BigInteger.valueOf(-1));
			
			symbol_204.setImplicit(true);
			symbol_204.setIsResolveProxies(true);
			symbol_202.getOwnedAttributes().add(symbol_204);
		}
		{ // pivot.ecore::pivot::Property::PropertyCallExp
			symbol_205.setName("PropertyCallExp");
			symbol_205.setType(symbol_220);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_205.setLower(BigInteger.valueOf(0));
			symbol_205.setUpper(BigInteger.valueOf(-1));
			
			symbol_205.setImplicit(true);
			symbol_205.setIsResolveProxies(true);
			symbol_205.setOpposite(symbol_221);
			symbol_202.getOwnedAttributes().add(symbol_205);
		}
		{ // pivot.ecore::pivot::Property::association
			symbol_206.setName("association");
			symbol_206.setType(symbol_8);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_206.setLower(BigInteger.valueOf(0));
			
			symbol_206.setIsResolveProxies(true);
			symbol_206.setOpposite(symbol_10);
			symbol_202.getOwnedAttributes().add(symbol_206);
		}
		{ // pivot.ecore::pivot::Property::class
			symbol_207.setName("class");
			symbol_207.setType(symbol_25);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_207.setLower(BigInteger.valueOf(0));
			
			symbol_207.setIsResolveProxies(true);
			symbol_207.setOpposite(symbol_29);
			symbol_202.getOwnedAttributes().add(symbol_207);
		}
		{ // pivot.ecore::pivot::Property::default
			symbol_208.setName("default");
			symbol_208.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_208.setLower(BigInteger.valueOf(0));
			
			symbol_208.setIsResolveProxies(true);
			symbol_202.getOwnedAttributes().add(symbol_208);
		}
		{ // pivot.ecore::pivot::Property::implicit
			symbol_209.setName("implicit");
			symbol_209.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_209.setLower(BigInteger.valueOf(0));
			
			symbol_209.setIsResolveProxies(true);
			symbol_202.getOwnedAttributes().add(symbol_209);
		}
		{ // pivot.ecore::pivot::Property::isComposite
			symbol_210.setName("isComposite");
			symbol_210.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_210.setIsResolveProxies(true);
			symbol_202.getOwnedAttributes().add(symbol_210);
		}
		{ // pivot.ecore::pivot::Property::isDerived
			symbol_211.setName("isDerived");
			symbol_211.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_211.setIsResolveProxies(true);
			symbol_202.getOwnedAttributes().add(symbol_211);
		}
		{ // pivot.ecore::pivot::Property::isID
			symbol_212.setName("isID");
			symbol_212.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_212.setIsResolveProxies(true);
			symbol_202.getOwnedAttributes().add(symbol_212);
		}
		{ // pivot.ecore::pivot::Property::isReadOnly
			symbol_213.setName("isReadOnly");
			symbol_213.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_213.setIsResolveProxies(true);
			symbol_202.getOwnedAttributes().add(symbol_213);
		}
		{ // pivot.ecore::pivot::Property::isResolveProxies
			symbol_214.setName("isResolveProxies");
			symbol_214.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_214.setIsResolveProxies(true);
			symbol_202.getOwnedAttributes().add(symbol_214);
		}
		{ // pivot.ecore::pivot::Property::isTransient
			symbol_215.setName("isTransient");
			symbol_215.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_215.setIsResolveProxies(true);
			symbol_202.getOwnedAttributes().add(symbol_215);
		}
		{ // pivot.ecore::pivot::Property::isUnsettable
			symbol_216.setName("isUnsettable");
			symbol_216.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_216.setIsResolveProxies(true);
			symbol_202.getOwnedAttributes().add(symbol_216);
		}
		{ // pivot.ecore::pivot::Property::isVolatile
			symbol_217.setName("isVolatile");
			symbol_217.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_217.setIsResolveProxies(true);
			symbol_202.getOwnedAttributes().add(symbol_217);
		}
		{ // pivot.ecore::pivot::Property::keys
			symbol_218.setName("keys");
			symbol_218.setType(symbol_202);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_218.setLower(BigInteger.valueOf(0));
			symbol_218.setUpper(BigInteger.valueOf(-1));
			
			symbol_218.setIsResolveProxies(true);
			symbol_218.setOpposite(symbol_204);
			symbol_202.getOwnedAttributes().add(symbol_218);
		}
		{ // pivot.ecore::pivot::Property::opposite
			symbol_219.setName("opposite");
			symbol_219.setType(symbol_202);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_219.setLower(BigInteger.valueOf(0));
			
			symbol_219.setIsResolveProxies(true);
			symbol_202.getOwnedAttributes().add(symbol_219);
		}
		symbol_1.getOwnedTypes().add(symbol_202); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::PropertyCallExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_220.setName("PropertyCallExp");
		symbol_220.getSuperClasses().add(symbol_140); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::PropertyCallExp::referredProperty
			symbol_221.setName("referredProperty");
			symbol_221.setType(symbol_202);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_221.setLower(BigInteger.valueOf(0));
			
			symbol_221.setIsResolveProxies(true);
			symbol_221.setOpposite(symbol_205);
			symbol_220.getOwnedAttributes().add(symbol_221);
		}
		symbol_1.getOwnedTypes().add(symbol_220); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::RealLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_223.setName("RealLiteralExp");
		symbol_223.getSuperClasses().add(symbol_144); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::RealLiteralExp::realSymbol
			symbol_224.setName("realSymbol");
			symbol_224.setType(symbol_222);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_224.setIsResolveProxies(true);
			symbol_223.getOwnedAttributes().add(symbol_224);
		}
		symbol_1.getOwnedTypes().add(symbol_223); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::SelfType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_225.setName("SelfType");
		symbol_225.getSuperClasses().add(symbol_25); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_225); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::SendSignalAction org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_226.setName("SendSignalAction");
		symbol_226.getSuperClasses().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::SendSignalAction::MessageExp
			symbol_227.setName("MessageExp");
			symbol_227.setType(symbol_119);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_227.setLower(BigInteger.valueOf(0));
			
			symbol_227.setImplicit(true);
			symbol_227.setIsResolveProxies(true);
			symbol_227.setOpposite(symbol_122);
			symbol_226.getOwnedAttributes().add(symbol_227);
		}
		{ // pivot.ecore::pivot::SendSignalAction::signal
			symbol_228.setName("signal");
			symbol_228.setType(symbol_231);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_228.setIsResolveProxies(true);
			symbol_228.setOpposite(symbol_233);
			symbol_226.getOwnedAttributes().add(symbol_228);
		}
		symbol_1.getOwnedTypes().add(symbol_226); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::SequenceType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_229.setName("SequenceType");
		symbol_229.getSuperClasses().add(symbol_46); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_229); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::SetType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_230.setName("SetType");
		symbol_230.getSuperClasses().add(symbol_46); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_230); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Signal org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_231.setName("Signal");
		symbol_231.getSuperClasses().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Signal::MessageType
			symbol_232.setName("MessageType");
			symbol_232.setType(symbol_124);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_232.setLower(BigInteger.valueOf(0));
			symbol_232.setUpper(BigInteger.valueOf(-1));
			
			symbol_232.setImplicit(true);
			symbol_232.setIsResolveProxies(true);
			symbol_232.setOpposite(symbol_126);
			symbol_231.getOwnedAttributes().add(symbol_232);
		}
		{ // pivot.ecore::pivot::Signal::SendSignalAction
			symbol_233.setName("SendSignalAction");
			symbol_233.setType(symbol_226);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_233.setLower(BigInteger.valueOf(0));
			symbol_233.setUpper(BigInteger.valueOf(-1));
			
			symbol_233.setImplicit(true);
			symbol_233.setIsResolveProxies(true);
			symbol_233.setOpposite(symbol_228);
			symbol_231.getOwnedAttributes().add(symbol_233);
		}
		symbol_1.getOwnedTypes().add(symbol_231); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::State org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_234.setName("State");
		symbol_234.getSuperClasses().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::State::StateExp
			symbol_235.setName("StateExp");
			symbol_235.setType(symbol_236);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_235.setLower(BigInteger.valueOf(0));
			symbol_235.setUpper(BigInteger.valueOf(-1));
			
			symbol_235.setImplicit(true);
			symbol_235.setIsResolveProxies(true);
			symbol_235.setOpposite(symbol_237);
			symbol_234.getOwnedAttributes().add(symbol_235);
		}
		symbol_1.getOwnedTypes().add(symbol_234); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::StateExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_236.setName("StateExp");
		symbol_236.getSuperClasses().add(symbol_146); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::StateExp::referredState
			symbol_237.setName("referredState");
			symbol_237.setType(symbol_234);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_237.setLower(BigInteger.valueOf(0));
			
			symbol_237.setIsResolveProxies(true);
			symbol_237.setOpposite(symbol_235);
			symbol_236.getOwnedAttributes().add(symbol_237);
		}
		symbol_1.getOwnedTypes().add(symbol_236); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::StringLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_239.setName("StringLiteralExp");
		symbol_239.getSuperClasses().add(symbol_200); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::StringLiteralExp::stringSymbol
			symbol_240.setName("stringSymbol");
			symbol_240.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_240.setIsResolveProxies(true);
			symbol_239.getOwnedAttributes().add(symbol_240);
		}
		symbol_1.getOwnedTypes().add(symbol_239); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TemplateBinding org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_241.setName("TemplateBinding");
		symbol_241.getSuperClasses().add(symbol_65); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::TemplateBinding::boundElement
			symbol_242.setName("boundElement");
			symbol_242.setType(symbol_265);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_242.setIsResolveProxies(true);
			symbol_242.setOpposite(symbol_267);
			symbol_241.getOwnedAttributes().add(symbol_242);
		}
		{ // pivot.ecore::pivot::TemplateBinding::parameterSubstitution
			symbol_243.setName("parameterSubstitution");
			symbol_243.setType(symbol_253);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_243.setLower(BigInteger.valueOf(0));
			symbol_243.setUpper(BigInteger.valueOf(-1));
			
			symbol_243.setIsComposite(true);
			symbol_243.setIsResolveProxies(true);
			symbol_243.setOpposite(symbol_257);
			symbol_241.getOwnedAttributes().add(symbol_243);
		}
		{ // pivot.ecore::pivot::TemplateBinding::signature
			symbol_244.setName("signature");
			symbol_244.setType(symbol_260);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_244.setIsResolveProxies(true);
			symbol_244.setOpposite(symbol_261);
			symbol_241.getOwnedAttributes().add(symbol_244);
		}
		symbol_1.getOwnedTypes().add(symbol_241); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TemplateParameter org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_245.setName("TemplateParameter");
		symbol_245.getSuperClasses().add(symbol_65); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::TemplateParameter::TemplateParameterSubstitution
			symbol_246.setName("TemplateParameterSubstitution");
			symbol_246.setType(symbol_253);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_246.setLower(BigInteger.valueOf(0));
			symbol_246.setUpper(BigInteger.valueOf(-1));
			
			symbol_246.setImplicit(true);
			symbol_246.setIsResolveProxies(true);
			symbol_246.setOpposite(symbol_255);
			symbol_245.getOwnedAttributes().add(symbol_246);
		}
		{ // pivot.ecore::pivot::TemplateParameter::TemplateSignature
			symbol_247.setName("TemplateSignature");
			symbol_247.setType(symbol_260);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_247.setLower(BigInteger.valueOf(0));
			symbol_247.setUpper(BigInteger.valueOf(-1));
			
			symbol_247.setImplicit(true);
			symbol_247.setIsResolveProxies(true);
			symbol_247.setOpposite(symbol_263);
			symbol_245.getOwnedAttributes().add(symbol_247);
		}
		{ // pivot.ecore::pivot::TemplateParameter::default
			symbol_248.setName("default");
			symbol_248.setType(symbol_189);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_248.setLower(BigInteger.valueOf(0));
			
			symbol_248.setIsResolveProxies(true);
			symbol_245.getOwnedAttributes().add(symbol_248);
		}
		{ // pivot.ecore::pivot::TemplateParameter::ownedDefault
			symbol_249.setName("ownedDefault");
			symbol_249.setType(symbol_189);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_249.setLower(BigInteger.valueOf(0));
			
			symbol_249.setIsComposite(true);
			symbol_249.setIsResolveProxies(true);
			symbol_249.setOpposite(symbol_190);
			symbol_245.getOwnedAttributes().add(symbol_249);
		}
		{ // pivot.ecore::pivot::TemplateParameter::ownedParameteredElement
			symbol_250.setName("ownedParameteredElement");
			symbol_250.setType(symbol_189);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_250.setLower(BigInteger.valueOf(0));
			
			symbol_250.setIsComposite(true);
			symbol_250.setIsResolveProxies(true);
			symbol_250.setOpposite(symbol_192);
			symbol_245.getOwnedAttributes().add(symbol_250);
		}
		{ // pivot.ecore::pivot::TemplateParameter::parameteredElement
			symbol_251.setName("parameteredElement");
			symbol_251.setType(symbol_189);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_251.setIsResolveProxies(true);
			symbol_251.setOpposite(symbol_193);
			symbol_245.getOwnedAttributes().add(symbol_251);
		}
		{ // pivot.ecore::pivot::TemplateParameter::signature
			symbol_252.setName("signature");
			symbol_252.setType(symbol_260);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_252.setIsResolveProxies(true);
			symbol_252.setOpposite(symbol_262);
			symbol_245.getOwnedAttributes().add(symbol_252);
		}
		symbol_1.getOwnedTypes().add(symbol_245); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TemplateParameterSubstitution org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_253.setName("TemplateParameterSubstitution");
		symbol_253.getSuperClasses().add(symbol_65); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::actual
			symbol_254.setName("actual");
			symbol_254.setType(symbol_189);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_254.setIsResolveProxies(true);
			symbol_253.getOwnedAttributes().add(symbol_254);
		}
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::formal
			symbol_255.setName("formal");
			symbol_255.setType(symbol_245);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_255.setIsResolveProxies(true);
			symbol_255.setOpposite(symbol_246);
			symbol_253.getOwnedAttributes().add(symbol_255);
		}
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::ownedActual
			symbol_256.setName("ownedActual");
			symbol_256.setType(symbol_189);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_256.setLower(BigInteger.valueOf(0));
			
			symbol_256.setIsComposite(true);
			symbol_256.setIsResolveProxies(true);
			symbol_256.setOpposite(symbol_191);
			symbol_253.getOwnedAttributes().add(symbol_256);
		}
		{ // pivot.ecore::pivot::TemplateParameterSubstitution::templateBinding
			symbol_257.setName("templateBinding");
			symbol_257.setType(symbol_241);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_257.setIsResolveProxies(true);
			symbol_257.setOpposite(symbol_243);
			symbol_253.getOwnedAttributes().add(symbol_257);
		}
		symbol_1.getOwnedTypes().add(symbol_253); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TemplateParameterType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_258.setName("TemplateParameterType");
		symbol_258.getSuperClasses().add(symbol_276); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::TemplateParameterType::specification
			symbol_259.setName("specification");
			symbol_259.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_259.setLower(BigInteger.valueOf(0));
			
			symbol_259.setIsResolveProxies(true);
			symbol_258.getOwnedAttributes().add(symbol_259);
		}
		symbol_1.getOwnedTypes().add(symbol_258); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TemplateSignature org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_260.setName("TemplateSignature");
		symbol_260.getSuperClasses().add(symbol_65); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::TemplateSignature::TemplateBinding
			symbol_261.setName("TemplateBinding");
			symbol_261.setType(symbol_241);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_261.setLower(BigInteger.valueOf(0));
			symbol_261.setUpper(BigInteger.valueOf(-1));
			
			symbol_261.setImplicit(true);
			symbol_261.setIsResolveProxies(true);
			symbol_261.setOpposite(symbol_244);
			symbol_260.getOwnedAttributes().add(symbol_261);
		}
		{ // pivot.ecore::pivot::TemplateSignature::ownedParameter
			symbol_262.setName("ownedParameter");
			symbol_262.setType(symbol_245);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_262.setLower(BigInteger.valueOf(0));
			symbol_262.setUpper(BigInteger.valueOf(-1));
			symbol_262.setIsOrdered(true);
			
			symbol_262.setIsComposite(true);
			symbol_262.setIsResolveProxies(true);
			symbol_262.setOpposite(symbol_252);
			symbol_260.getOwnedAttributes().add(symbol_262);
		}
		{ // pivot.ecore::pivot::TemplateSignature::parameter
			symbol_263.setName("parameter");
			symbol_263.setType(symbol_245);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_263.setUpper(BigInteger.valueOf(-1));
			symbol_263.setIsOrdered(true);
			
			symbol_263.setIsResolveProxies(true);
			symbol_263.setOpposite(symbol_247);
			symbol_260.getOwnedAttributes().add(symbol_263);
		}
		{ // pivot.ecore::pivot::TemplateSignature::template
			symbol_264.setName("template");
			symbol_264.setType(symbol_265);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_264.setIsResolveProxies(true);
			symbol_264.setOpposite(symbol_266);
			symbol_260.getOwnedAttributes().add(symbol_264);
		}
		symbol_1.getOwnedTypes().add(symbol_260); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TemplateableElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_265.setName("TemplateableElement");
		symbol_265.getSuperClasses().add(symbol_65); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::TemplateableElement::ownedTemplateSignature
			symbol_266.setName("ownedTemplateSignature");
			symbol_266.setType(symbol_260);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_266.setLower(BigInteger.valueOf(0));
			
			symbol_266.setIsComposite(true);
			symbol_266.setIsResolveProxies(true);
			symbol_266.setOpposite(symbol_264);
			symbol_265.getOwnedAttributes().add(symbol_266);
		}
		{ // pivot.ecore::pivot::TemplateableElement::templateBinding
			symbol_267.setName("templateBinding");
			symbol_267.setType(symbol_241);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_267.setLower(BigInteger.valueOf(0));
			symbol_267.setUpper(BigInteger.valueOf(-1));
			
			symbol_267.setIsComposite(true);
			symbol_267.setIsResolveProxies(true);
			symbol_267.setOpposite(symbol_242);
			symbol_265.getOwnedAttributes().add(symbol_267);
		}
		{ // pivot.ecore::pivot::TemplateableElement::unspecializedElement
			symbol_268.setName("unspecializedElement");
			symbol_268.setType(symbol_265);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_268.setLower(BigInteger.valueOf(0));
			
			symbol_268.setIsTransient(true);
			symbol_265.getOwnedAttributes().add(symbol_268);
		}
		{	// pivot.ecore::pivot::TemplateableElement::isTemplate()
			Operation symbol_341 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_341.setName("isTemplate");
			symbol_341.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_265.getOwnedOperations().add(symbol_341);
		}
		{	// pivot.ecore::pivot::TemplateableElement::parameterableElements()
			Operation symbol_342 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_342.setName("parameterableElements");
			symbol_342.setType(symbol_189);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_342.setLower(BigInteger.valueOf(0));
			symbol_342.setUpper(BigInteger.valueOf(-1));
			
			symbol_265.getOwnedOperations().add(symbol_342);
		}
		symbol_1.getOwnedTypes().add(symbol_265); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Throwable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_269.setName("Throwable");
		symbol_269.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_269); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TupleLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_270.setName("TupleLiteralExp");
		symbol_270.getSuperClasses().add(symbol_114); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::TupleLiteralExp::part
			symbol_271.setName("part");
			symbol_271.setType(symbol_272);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_271.setLower(BigInteger.valueOf(0));
			symbol_271.setUpper(BigInteger.valueOf(-1));
			symbol_271.setIsOrdered(true);
			
			symbol_271.setIsComposite(true);
			symbol_271.setIsResolveProxies(true);
			symbol_271.setOpposite(symbol_273);
			symbol_270.getOwnedAttributes().add(symbol_271);
		}
		symbol_1.getOwnedTypes().add(symbol_270); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TupleLiteralPart org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_272.setName("TupleLiteralPart");
		symbol_272.getSuperClasses().add(symbol_313); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::TupleLiteralPart::TupleLiteralExp
			symbol_273.setName("TupleLiteralExp");
			symbol_273.setType(symbol_270);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_273.setLower(BigInteger.valueOf(0));
			
			symbol_273.setImplicit(true);
			symbol_273.setIsResolveProxies(true);
			symbol_273.setOpposite(symbol_271);
			symbol_272.getOwnedAttributes().add(symbol_273);
		}
		{ // pivot.ecore::pivot::TupleLiteralPart::initExpression
			symbol_274.setName("initExpression");
			symbol_274.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_274.setLower(BigInteger.valueOf(0));
			
			symbol_274.setIsComposite(true);
			symbol_274.setIsResolveProxies(true);
			symbol_274.setOpposite(symbol_157);
			symbol_272.getOwnedAttributes().add(symbol_274);
		}
		symbol_1.getOwnedTypes().add(symbol_272); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TupleType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_275.setName("TupleType");
		symbol_275.getSuperClasses().add(symbol_59); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_275); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Type org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_276.setName("Type");
		symbol_276.getSuperClasses().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_276.getSuperClasses().add(symbol_189); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_276.getSuperClasses().add(symbol_265); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Type::ClassifierType
			symbol_277.setName("ClassifierType");
			symbol_277.setType(symbol_33);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_277.setLower(BigInteger.valueOf(0));
			symbol_277.setUpper(BigInteger.valueOf(-1));
			
			symbol_277.setImplicit(true);
			symbol_277.setIsResolveProxies(true);
			symbol_277.setOpposite(symbol_34);
			symbol_276.getOwnedAttributes().add(symbol_277);
		}
		{ // pivot.ecore::pivot::Type::CollectionType
			symbol_278.setName("CollectionType");
			symbol_278.setType(symbol_46);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_278.setLower(BigInteger.valueOf(0));
			symbol_278.setUpper(BigInteger.valueOf(-1));
			
			symbol_278.setImplicit(true);
			symbol_278.setIsResolveProxies(true);
			symbol_278.setOpposite(symbol_47);
			symbol_276.getOwnedAttributes().add(symbol_278);
		}
		{ // pivot.ecore::pivot::Type::DataType
			symbol_279.setName("DataType");
			symbol_279.setType(symbol_59);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_279.setLower(BigInteger.valueOf(0));
			symbol_279.setUpper(BigInteger.valueOf(-1));
			
			symbol_279.setImplicit(true);
			symbol_279.setIsResolveProxies(true);
			symbol_279.setOpposite(symbol_60);
			symbol_276.getOwnedAttributes().add(symbol_279);
		}
		{ // pivot.ecore::pivot::Type::LambdaType
			symbol_280.setName("LambdaType");
			symbol_280.setType(symbol_106);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_280.setLower(BigInteger.valueOf(0));
			symbol_280.setUpper(BigInteger.valueOf(-1));
			
			symbol_280.setImplicit(true);
			symbol_280.setIsResolveProxies(true);
			symbol_276.getOwnedAttributes().add(symbol_280);
		}
		{ // pivot.ecore::pivot::Type::Operation
			symbol_281.setName("Operation");
			symbol_281.setType(symbol_164);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_281.setLower(BigInteger.valueOf(0));
			symbol_281.setUpper(BigInteger.valueOf(-1));
			
			symbol_281.setImplicit(true);
			symbol_281.setIsResolveProxies(true);
			symbol_281.setOpposite(symbol_171);
			symbol_276.getOwnedAttributes().add(symbol_281);
		}
		{ // pivot.ecore::pivot::Type::TypeExp
			symbol_282.setName("TypeExp");
			symbol_282.setType(symbol_288);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_282.setLower(BigInteger.valueOf(0));
			symbol_282.setUpper(BigInteger.valueOf(-1));
			
			symbol_282.setImplicit(true);
			symbol_282.setIsResolveProxies(true);
			symbol_282.setOpposite(symbol_289);
			symbol_276.getOwnedAttributes().add(symbol_282);
		}
		{ // pivot.ecore::pivot::Type::TypeTemplateParameter
			symbol_283.setName("TypeTemplateParameter");
			symbol_283.setType(symbol_290);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_283.setLower(BigInteger.valueOf(0));
			symbol_283.setUpper(BigInteger.valueOf(-1));
			
			symbol_283.setImplicit(true);
			symbol_283.setIsResolveProxies(true);
			symbol_283.setOpposite(symbol_292);
			symbol_276.getOwnedAttributes().add(symbol_283);
		}
		{ // pivot.ecore::pivot::Type::TypedElement
			symbol_284.setName("TypedElement");
			symbol_284.setType(symbol_293);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_284.setLower(BigInteger.valueOf(0));
			symbol_284.setUpper(BigInteger.valueOf(-1));
			
			symbol_284.setImplicit(true);
			symbol_284.setIsResolveProxies(true);
			symbol_284.setOpposite(symbol_294);
			symbol_276.getOwnedAttributes().add(symbol_284);
		}
		{ // pivot.ecore::pivot::Type::UnspecifiedType
			symbol_285.setName("UnspecifiedType");
			symbol_285.setType(symbol_299);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_285.setLower(BigInteger.valueOf(0));
			symbol_285.setUpper(BigInteger.valueOf(-1));
			
			symbol_285.setImplicit(true);
			symbol_285.setIsResolveProxies(true);
			symbol_276.getOwnedAttributes().add(symbol_285);
		}
		{ // pivot.ecore::pivot::Type::instanceClassName
			symbol_286.setName("instanceClassName");
			symbol_286.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_286.setLower(BigInteger.valueOf(0));
			
			symbol_286.setIsResolveProxies(true);
			symbol_276.getOwnedAttributes().add(symbol_286);
		}
		{ // pivot.ecore::pivot::Type::package
			symbol_287.setName("package");
			symbol_287.setType(symbol_177);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_287.setLower(BigInteger.valueOf(0));
			
			symbol_287.setIsResolveProxies(true);
			symbol_287.setOpposite(symbol_183);
			symbol_276.getOwnedAttributes().add(symbol_287);
		}
		symbol_1.getOwnedTypes().add(symbol_276); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TypeExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_288.setName("TypeExp");
		symbol_288.getSuperClasses().add(symbol_146); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::TypeExp::referredType
			symbol_289.setName("referredType");
			symbol_289.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_289.setLower(BigInteger.valueOf(0));
			
			symbol_289.setIsResolveProxies(true);
			symbol_289.setOpposite(symbol_282);
			symbol_288.getOwnedAttributes().add(symbol_289);
		}
		symbol_1.getOwnedTypes().add(symbol_288); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TypeTemplateParameter org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_290.setName("TypeTemplateParameter");
		symbol_290.getSuperClasses().add(symbol_245); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::TypeTemplateParameter::allowSubstitutable
			symbol_291.setName("allowSubstitutable");
			symbol_291.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_291.setIsResolveProxies(true);
			symbol_290.getOwnedAttributes().add(symbol_291);
		}
		{ // pivot.ecore::pivot::TypeTemplateParameter::constrainingType
			symbol_292.setName("constrainingType");
			symbol_292.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_292.setLower(BigInteger.valueOf(0));
			symbol_292.setUpper(BigInteger.valueOf(-1));
			
			symbol_292.setIsResolveProxies(true);
			symbol_292.setOpposite(symbol_283);
			symbol_290.getOwnedAttributes().add(symbol_292);
		}
		symbol_1.getOwnedTypes().add(symbol_290); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TypedElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_293.setName("TypedElement");
		symbol_293.getSuperClasses().add(symbol_133); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::TypedElement::type
			symbol_294.setName("type");
			symbol_294.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_294.setLower(BigInteger.valueOf(0));
			
			symbol_294.setIsResolveProxies(true);
			symbol_294.setOpposite(symbol_284);
			symbol_293.getOwnedAttributes().add(symbol_294);
		}
		symbol_1.getOwnedTypes().add(symbol_293); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::TypedMultiplicityElement org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_295.setName("TypedMultiplicityElement");
		symbol_295.getSuperClasses().add(symbol_127); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_295.getSuperClasses().add(symbol_293); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_295); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::UnlimitedNaturalLiteralExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_297.setName("UnlimitedNaturalLiteralExp");
		symbol_297.getSuperClasses().add(symbol_144); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::UnlimitedNaturalLiteralExp::unlimitedNaturalSymbol
			symbol_298.setName("unlimitedNaturalSymbol");
			symbol_298.setType(symbol_296);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_298.setIsResolveProxies(true);
			symbol_297.getOwnedAttributes().add(symbol_298);
		}
		symbol_1.getOwnedTypes().add(symbol_297); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::UnspecifiedType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_299.setName("UnspecifiedType");
		symbol_299.getSuperClasses().add(symbol_25); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::UnspecifiedType::lowerBound
			symbol_300.setName("lowerBound");
			symbol_300.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_300.setIsResolveProxies(true);
			symbol_299.getOwnedAttributes().add(symbol_300);
		}
		{ // pivot.ecore::pivot::UnspecifiedType::upperBound
			symbol_301.setName("upperBound");
			symbol_301.setType(symbol_276);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_301.setIsResolveProxies(true);
			symbol_301.setOpposite(symbol_285);
			symbol_299.getOwnedAttributes().add(symbol_301);
		}
		symbol_1.getOwnedTypes().add(symbol_299); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::UnspecifiedValueExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_302.setName("UnspecifiedValueExp");
		symbol_302.getSuperClasses().add(symbol_146); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_302); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::ValueSpecification org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_303.setName("ValueSpecification");
		symbol_303.getSuperClasses().add(symbol_189); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_303.getSuperClasses().add(symbol_293); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::ValueSpecification::Constraint
			symbol_304.setName("Constraint");
			symbol_304.setType(symbol_52);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_304.setLower(BigInteger.valueOf(0));
			
			symbol_304.setImplicit(true);
			symbol_304.setIsResolveProxies(true);
			symbol_304.setOpposite(symbol_57);
			symbol_303.getOwnedAttributes().add(symbol_304);
		}
		{	// pivot.ecore::pivot::ValueSpecification::booleanValue()
			Operation symbol_343 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_343.setName("booleanValue");
			symbol_343.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_303.getOwnedOperations().add(symbol_343);
		}
		{	// pivot.ecore::pivot::ValueSpecification::integerValue()
			Operation symbol_344 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_344.setName("integerValue");
			symbol_344.setType(symbol_94);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_303.getOwnedOperations().add(symbol_344);
		}
		{	// pivot.ecore::pivot::ValueSpecification::isComputable()
			Operation symbol_345 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_345.setName("isComputable");
			symbol_345.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_303.getOwnedOperations().add(symbol_345);
		}
		{	// pivot.ecore::pivot::ValueSpecification::isNull()
			Operation symbol_346 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_346.setName("isNull");
			symbol_346.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_303.getOwnedOperations().add(symbol_346);
		}
		{	// pivot.ecore::pivot::ValueSpecification::stringValue()
			Operation symbol_347 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_347.setName("stringValue");
			symbol_347.setType(symbol_238);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_303.getOwnedOperations().add(symbol_347);
		}
		{	// pivot.ecore::pivot::ValueSpecification::unlimitedValue()
			Operation symbol_348 = PivotFactory.eINSTANCE.createOperation(); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_348.setName("unlimitedValue");
			symbol_348.setType(symbol_296);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			
			symbol_303.getOwnedOperations().add(symbol_348);
		}
		symbol_1.getOwnedTypes().add(symbol_303); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Variable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_305.setName("Variable");
		symbol_305.getSuperClasses().add(symbol_313); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::Variable::ExpressionInOcl
			symbol_306.setName("ExpressionInOcl");
			symbol_306.setType(symbol_78);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_306.setLower(BigInteger.valueOf(0));
			symbol_306.setUpper(BigInteger.valueOf(-1));
			
			symbol_306.setImplicit(true);
			symbol_306.setIsResolveProxies(true);
			symbol_305.getOwnedAttributes().add(symbol_306);
		}
		{ // pivot.ecore::pivot::Variable::IterateExp
			symbol_307.setName("IterateExp");
			symbol_307.setType(symbol_99);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_307.setLower(BigInteger.valueOf(0));
			
			symbol_307.setImplicit(true);
			symbol_307.setIsResolveProxies(true);
			symbol_307.setOpposite(symbol_100);
			symbol_305.getOwnedAttributes().add(symbol_307);
		}
		{ // pivot.ecore::pivot::Variable::LetExp
			symbol_308.setName("LetExp");
			symbol_308.setType(symbol_110);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_308.setLower(BigInteger.valueOf(0));
			
			symbol_308.setImplicit(true);
			symbol_308.setIsResolveProxies(true);
			symbol_308.setOpposite(symbol_112);
			symbol_305.getOwnedAttributes().add(symbol_308);
		}
		{ // pivot.ecore::pivot::Variable::LoopExp
			symbol_309.setName("LoopExp");
			symbol_309.setType(symbol_115);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_309.setLower(BigInteger.valueOf(0));
			
			symbol_309.setImplicit(true);
			symbol_309.setIsResolveProxies(true);
			symbol_309.setOpposite(symbol_117);
			symbol_305.getOwnedAttributes().add(symbol_309);
		}
		{ // pivot.ecore::pivot::Variable::implicit
			symbol_310.setName("implicit");
			symbol_310.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_310.setLower(BigInteger.valueOf(0));
			
			symbol_310.setIsResolveProxies(true);
			symbol_305.getOwnedAttributes().add(symbol_310);
		}
		{ // pivot.ecore::pivot::Variable::initExpression
			symbol_311.setName("initExpression");
			symbol_311.setType(symbol_146);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_311.setLower(BigInteger.valueOf(0));
			
			symbol_311.setIsComposite(true);
			symbol_311.setIsResolveProxies(true);
			symbol_311.setOpposite(symbol_158);
			symbol_305.getOwnedAttributes().add(symbol_311);
		}
		{ // pivot.ecore::pivot::Variable::representedParameter
			symbol_312.setName("representedParameter");
			symbol_312.setType(symbol_185);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_312.setLower(BigInteger.valueOf(0));
			
			symbol_312.setIsResolveProxies(true);
			symbol_312.setOpposite(symbol_187);
			symbol_305.getOwnedAttributes().add(symbol_312);
		}
		symbol_1.getOwnedTypes().add(symbol_305); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::VariableDeclaration org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_313.setName("VariableDeclaration");
		symbol_313.getSuperClasses().add(symbol_293); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::VariableDeclaration::VariableExp
			symbol_314.setName("VariableExp");
			symbol_314.setType(symbol_315);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_314.setLower(BigInteger.valueOf(0));
			symbol_314.setUpper(BigInteger.valueOf(-1));
			
			symbol_314.setImplicit(true);
			symbol_314.setIsResolveProxies(true);
			symbol_314.setOpposite(symbol_317);
			symbol_313.getOwnedAttributes().add(symbol_314);
		}
		symbol_1.getOwnedTypes().add(symbol_313); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::VariableExp org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_315.setName("VariableExp");
		symbol_315.getSuperClasses().add(symbol_146); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		{ // pivot.ecore::pivot::VariableExp::implicit
			symbol_316.setName("implicit");
			symbol_316.setType(symbol_15);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_316.setLower(BigInteger.valueOf(0));
			
			symbol_316.setIsResolveProxies(true);
			symbol_315.getOwnedAttributes().add(symbol_316);
		}
		{ // pivot.ecore::pivot::VariableExp::referredVariable
			symbol_317.setName("referredVariable");
			symbol_317.setType(symbol_313);  // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
			symbol_317.setLower(BigInteger.valueOf(0));
			
			symbol_317.setIsResolveProxies(true);
			symbol_317.setOpposite(symbol_314);
			symbol_315.getOwnedAttributes().add(symbol_317);
		}
		symbol_1.getOwnedTypes().add(symbol_315); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Visitable org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_318.setName("Visitable");
		symbol_318.getSuperClasses().add(standardLibrary.getOclElementType());
		symbol_1.getOwnedTypes().add(symbol_318); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::Visitor org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
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
		symbol_1.getOwnedTypes().add(symbol_319); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		// pivot.ecore::pivot::VoidType org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		//
		symbol_325.setName("VoidType");
		symbol_325.getSuperClasses().add(symbol_25); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))
		symbol_1.getOwnedTypes().add(symbol_325); // org.eclipse.emf.ecore.impl.DynamicEObjectImpl@17f1494 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@202952 (name: OclInvalid_Class) (instanceClassName: null) (abstract: false, interface: false))

		Class elementClass = (Class) PivotUtil.getNamedElement(symbol_1.getOwnedTypes(), "Element");
		elementClass.getSuperClasses().clear();
		for (Type pivotClass : symbol_1.getOwnedTypes()) {
			if (pivotClass instanceof Enumeration) {
				List<Class> superClasses = ((Enumeration) pivotClass).getSuperClasses();
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
