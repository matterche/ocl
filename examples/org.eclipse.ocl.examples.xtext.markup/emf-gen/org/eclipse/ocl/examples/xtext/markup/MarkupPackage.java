/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.xtext.markup;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.examples.xtext.markup.MarkupFactory
 * @model kind="package"
 * @generated
 */
public interface MarkupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "markup";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ocl/3.2.0/Markup";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "markup";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkupPackage eINSTANCE = org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.MarkupElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getMarkupElement()
	 * @generated
	 */
	int MARKUP_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ELEMENT__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ELEMENT__UNIQUE_ID = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.CompoundElementImpl <em>Compound Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.CompoundElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getCompoundElement()
	 * @generated
	 */
	int COMPOUND_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT__OWNER = MARKUP_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT__UNIQUE_ID = MARKUP_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT__ELEMENTS = MARKUP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT_FEATURE_COUNT = MARKUP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FontElementImpl <em>Font Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.FontElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFontElement()
	 * @generated
	 */
	int FONT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ELEMENT__OWNER = COMPOUND_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ELEMENT__UNIQUE_ID = COMPOUND_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ELEMENT__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ELEMENT__FONT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Font Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ELEMENT_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FigElementImpl <em>Fig Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.FigElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFigElement()
	 * @generated
	 */
	int FIG_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIG_ELEMENT__OWNER = MARKUP_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIG_ELEMENT__UNIQUE_ID = MARKUP_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIG_ELEMENT__ID = MARKUP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIG_ELEMENT__SRC = MARKUP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIG_ELEMENT__ALT = MARKUP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIG_ELEMENT__DEF = MARKUP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fig Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIG_ELEMENT_FEATURE_COUNT = MARKUP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FigRefElementImpl <em>Fig Ref Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.FigRefElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFigRefElement()
	 * @generated
	 */
	int FIG_REF_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIG_REF_ELEMENT__OWNER = MARKUP_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIG_REF_ELEMENT__UNIQUE_ID = MARKUP_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIG_REF_ELEMENT__REF = MARKUP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fig Ref Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIG_REF_ELEMENT_FEATURE_COUNT = MARKUP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.MarkupImpl <em>Markup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getMarkup()
	 * @generated
	 */
	int MARKUP = 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP__OWNER = COMPOUND_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP__UNIQUE_ID = COMPOUND_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Markup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.NewLineElementImpl <em>New Line Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.NewLineElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getNewLineElement()
	 * @generated
	 */
	int NEW_LINE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_LINE_ELEMENT__OWNER = MARKUP_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_LINE_ELEMENT__UNIQUE_ID = MARKUP_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_LINE_ELEMENT__TEXT = MARKUP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Line Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_LINE_ELEMENT_FEATURE_COUNT = MARKUP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.NullElementImpl <em>Null Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.NullElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getNullElement()
	 * @generated
	 */
	int NULL_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_ELEMENT__OWNER = COMPOUND_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_ELEMENT__UNIQUE_ID = COMPOUND_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_ELEMENT__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Null Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_ELEMENT_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.OclElementImpl <em>Ocl Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.OclElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getOclElement()
	 * @generated
	 */
	int OCL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ELEMENT__OWNER = COMPOUND_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ELEMENT__UNIQUE_ID = COMPOUND_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ELEMENT__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Ocl Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ELEMENT_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.TextElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__OWNER = MARKUP_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__UNIQUE_ID = MARKUP_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__TEXT = MARKUP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = MARKUP_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.CompoundElement <em>Compound Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.CompoundElement
	 * @generated
	 */
	EClass getCompoundElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.examples.xtext.markup.CompoundElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.CompoundElement#getElements()
	 * @see #getCompoundElement()
	 * @generated
	 */
	EReference getCompoundElement_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.FontElement <em>Font Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FontElement
	 * @generated
	 */
	EClass getFontElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FontElement#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FontElement#getFont()
	 * @see #getFontElement()
	 * @generated
	 */
	EAttribute getFontElement_Font();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.FigElement <em>Fig Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fig Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigElement
	 * @generated
	 */
	EClass getFigElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FigElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigElement#getId()
	 * @see #getFigElement()
	 * @generated
	 */
	EAttribute getFigElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FigElement#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigElement#getSrc()
	 * @see #getFigElement()
	 * @generated
	 */
	EAttribute getFigElement_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FigElement#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigElement#getAlt()
	 * @see #getFigElement()
	 * @generated
	 */
	EAttribute getFigElement_Alt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FigElement#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Def</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigElement#getDef()
	 * @see #getFigElement()
	 * @generated
	 */
	EAttribute getFigElement_Def();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.FigRefElement <em>Fig Ref Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fig Ref Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigRefElement
	 * @generated
	 */
	EClass getFigRefElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.xtext.markup.FigRefElement#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigRefElement#getRef()
	 * @see #getFigRefElement()
	 * @generated
	 */
	EReference getFigRefElement_Ref();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.Markup <em>Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.Markup
	 * @generated
	 */
	EClass getMarkup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.MarkupElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.MarkupElement
	 * @generated
	 */
	EClass getMarkupElement();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.examples.xtext.markup.MarkupElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.MarkupElement#getOwner()
	 * @see #getMarkupElement()
	 * @generated
	 */
	EReference getMarkupElement_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.MarkupElement#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.MarkupElement#getUniqueId()
	 * @see #getMarkupElement()
	 * @generated
	 */
	EAttribute getMarkupElement_UniqueId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.NewLineElement <em>New Line Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Line Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.NewLineElement
	 * @generated
	 */
	EClass getNewLineElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.NewLineElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.NewLineElement#getText()
	 * @see #getNewLineElement()
	 * @generated
	 */
	EAttribute getNewLineElement_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.NullElement <em>Null Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.NullElement
	 * @generated
	 */
	EClass getNullElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.OclElement <em>Ocl Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.OclElement
	 * @generated
	 */
	EClass getOclElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.ocl.examples.xtext.markup.TextElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.TextElement#getText()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MarkupFactory getMarkupFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.CompoundElementImpl <em>Compound Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.CompoundElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getCompoundElement()
		 * @generated
		 */
		EClass COMPOUND_ELEMENT = eINSTANCE.getCompoundElement();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_ELEMENT__ELEMENTS = eINSTANCE.getCompoundElement_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FontElementImpl <em>Font Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.FontElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFontElement()
		 * @generated
		 */
		EClass FONT_ELEMENT = eINSTANCE.getFontElement();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_ELEMENT__FONT = eINSTANCE.getFontElement_Font();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FigElementImpl <em>Fig Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.FigElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFigElement()
		 * @generated
		 */
		EClass FIG_ELEMENT = eINSTANCE.getFigElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIG_ELEMENT__ID = eINSTANCE.getFigElement_Id();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIG_ELEMENT__SRC = eINSTANCE.getFigElement_Src();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIG_ELEMENT__ALT = eINSTANCE.getFigElement_Alt();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIG_ELEMENT__DEF = eINSTANCE.getFigElement_Def();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FigRefElementImpl <em>Fig Ref Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.FigRefElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFigRefElement()
		 * @generated
		 */
		EClass FIG_REF_ELEMENT = eINSTANCE.getFigRefElement();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIG_REF_ELEMENT__REF = eINSTANCE.getFigRefElement_Ref();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.MarkupImpl <em>Markup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getMarkup()
		 * @generated
		 */
		EClass MARKUP = eINSTANCE.getMarkup();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.MarkupElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getMarkupElement()
		 * @generated
		 */
		EClass MARKUP_ELEMENT = eINSTANCE.getMarkupElement();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKUP_ELEMENT__OWNER = eINSTANCE.getMarkupElement_Owner();

		/**
		 * The meta object literal for the '<em><b>Unique Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKUP_ELEMENT__UNIQUE_ID = eINSTANCE.getMarkupElement_UniqueId();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.NewLineElementImpl <em>New Line Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.NewLineElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getNewLineElement()
		 * @generated
		 */
		EClass NEW_LINE_ELEMENT = eINSTANCE.getNewLineElement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_LINE_ELEMENT__TEXT = eINSTANCE.getNewLineElement_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.NullElementImpl <em>Null Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.NullElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getNullElement()
		 * @generated
		 */
		EClass NULL_ELEMENT = eINSTANCE.getNullElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.OclElementImpl <em>Ocl Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.OclElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getOclElement()
		 * @generated
		 */
		EClass OCL_ELEMENT = eINSTANCE.getOclElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.TextElementImpl <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.TextElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__TEXT = eINSTANCE.getTextElement_Text();

	}

} //MarkupPackage
