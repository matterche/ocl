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
	int MARKUP_ELEMENT = 8;

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
	int COMPOUND_ELEMENT = 1;

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
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.BulletElementImpl <em>Bullet Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.BulletElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getBulletElement()
	 * @generated
	 */
	int BULLET_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_ELEMENT__OWNER = COMPOUND_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_ELEMENT__UNIQUE_ID = COMPOUND_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_ELEMENT__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_ELEMENT__LEVEL = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bullet Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULLET_ELEMENT_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FigureElementImpl <em>Figure Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.FigureElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFigureElement()
	 * @generated
	 */
	int FIGURE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ELEMENT__OWNER = MARKUP_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ELEMENT__UNIQUE_ID = MARKUP_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ELEMENT__ID = MARKUP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ELEMENT__SRC = MARKUP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ELEMENT__ALT = MARKUP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ELEMENT__DEF = MARKUP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ELEMENT__REQUIRED_WIDTH = MARKUP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Required Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ELEMENT__REQUIRED_HEIGHT = MARKUP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actual Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ELEMENT__ACTUAL_WIDTH = MARKUP_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Actual Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ELEMENT__ACTUAL_HEIGHT = MARKUP_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Figure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ELEMENT_FEATURE_COUNT = MARKUP_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FigureRefElementImpl <em>Figure Ref Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.FigureRefElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFigureRefElement()
	 * @generated
	 */
	int FIGURE_REF_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF_ELEMENT__OWNER = MARKUP_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF_ELEMENT__UNIQUE_ID = MARKUP_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF_ELEMENT__REF = MARKUP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Figure Ref Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF_ELEMENT_FEATURE_COUNT = MARKUP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FontElementImpl <em>Font Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.FontElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFontElement()
	 * @generated
	 */
	int FONT_ELEMENT = 4;

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
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FootnoteElementImpl <em>Footnote Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.FootnoteElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFootnoteElement()
	 * @generated
	 */
	int FOOTNOTE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_ELEMENT__OWNER = COMPOUND_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_ELEMENT__UNIQUE_ID = COMPOUND_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_ELEMENT__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Footnote Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_ELEMENT_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.HeadingElementImpl <em>Heading Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.HeadingElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getHeadingElement()
	 * @generated
	 */
	int HEADING_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_ELEMENT__OWNER = COMPOUND_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_ELEMENT__UNIQUE_ID = COMPOUND_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_ELEMENT__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_ELEMENT__LEVEL = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heading Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_ELEMENT_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.MarkupImpl <em>Markup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getMarkup()
	 * @generated
	 */
	int MARKUP = 7;

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
	int NEW_LINE_ELEMENT = 9;

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
	int NULL_ELEMENT = 10;

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
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.OclCodeElementImpl <em>Ocl Code Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.OclCodeElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getOclCodeElement()
	 * @generated
	 */
	int OCL_CODE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CODE_ELEMENT__OWNER = COMPOUND_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CODE_ELEMENT__UNIQUE_ID = COMPOUND_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CODE_ELEMENT__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Ocl Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CODE_ELEMENT_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.OclEvalElementImpl <em>Ocl Eval Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.OclEvalElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getOclEvalElement()
	 * @generated
	 */
	int OCL_EVAL_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EVAL_ELEMENT__OWNER = COMPOUND_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EVAL_ELEMENT__UNIQUE_ID = COMPOUND_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EVAL_ELEMENT__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Ocl Eval Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EVAL_ELEMENT_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.OclTextElementImpl <em>Ocl Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.OclTextElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getOclTextElement()
	 * @generated
	 */
	int OCL_TEXT_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TEXT_ELEMENT__OWNER = COMPOUND_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TEXT_ELEMENT__UNIQUE_ID = COMPOUND_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TEXT_ELEMENT__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Ocl Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TEXT_ELEMENT_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.TextElementImpl
	 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 14;

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.BulletElement <em>Bullet Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bullet Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.BulletElement
	 * @generated
	 */
	EClass getBulletElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.BulletElement#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.BulletElement#getLevel()
	 * @see #getBulletElement()
	 * @generated
	 */
	EAttribute getBulletElement_Level();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement <em>Figure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigureElement
	 * @generated
	 */
	EClass getFigureElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigureElement#getId()
	 * @see #getFigureElement()
	 * @generated
	 */
	EAttribute getFigureElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigureElement#getSrc()
	 * @see #getFigureElement()
	 * @generated
	 */
	EAttribute getFigureElement_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigureElement#getAlt()
	 * @see #getFigureElement()
	 * @generated
	 */
	EAttribute getFigureElement_Alt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Def</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigureElement#getDef()
	 * @see #getFigureElement()
	 * @generated
	 */
	EAttribute getFigureElement_Def();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getRequiredWidth <em>Required Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Width</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigureElement#getRequiredWidth()
	 * @see #getFigureElement()
	 * @generated
	 */
	EAttribute getFigureElement_RequiredWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getRequiredHeight <em>Required Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Height</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigureElement#getRequiredHeight()
	 * @see #getFigureElement()
	 * @generated
	 */
	EAttribute getFigureElement_RequiredHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getActualWidth <em>Actual Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Width</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigureElement#getActualWidth()
	 * @see #getFigureElement()
	 * @generated
	 */
	EAttribute getFigureElement_ActualWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getActualHeight <em>Actual Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Height</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigureElement#getActualHeight()
	 * @see #getFigureElement()
	 * @generated
	 */
	EAttribute getFigureElement_ActualHeight();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.FigureRefElement <em>Figure Ref Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Ref Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigureRefElement
	 * @generated
	 */
	EClass getFigureRefElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.examples.xtext.markup.FigureRefElement#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FigureRefElement#getRef()
	 * @see #getFigureRefElement()
	 * @generated
	 */
	EReference getFigureRefElement_Ref();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.FootnoteElement <em>Footnote Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footnote Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.FootnoteElement
	 * @generated
	 */
	EClass getFootnoteElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.HeadingElement <em>Heading Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.HeadingElement
	 * @generated
	 */
	EClass getHeadingElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.examples.xtext.markup.HeadingElement#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.HeadingElement#getLevel()
	 * @see #getHeadingElement()
	 * @generated
	 */
	EAttribute getHeadingElement_Level();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.OclCodeElement <em>Ocl Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Code Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.OclCodeElement
	 * @generated
	 */
	EClass getOclCodeElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.OclEvalElement <em>Ocl Eval Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Eval Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.OclEvalElement
	 * @generated
	 */
	EClass getOclEvalElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.examples.xtext.markup.OclTextElement <em>Ocl Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Text Element</em>'.
	 * @see org.eclipse.ocl.examples.xtext.markup.OclTextElement
	 * @generated
	 */
	EClass getOclTextElement();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.BulletElementImpl <em>Bullet Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.BulletElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getBulletElement()
		 * @generated
		 */
		EClass BULLET_ELEMENT = eINSTANCE.getBulletElement();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULLET_ELEMENT__LEVEL = eINSTANCE.getBulletElement_Level();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FigureElementImpl <em>Figure Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.FigureElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFigureElement()
		 * @generated
		 */
		EClass FIGURE_ELEMENT = eINSTANCE.getFigureElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_ELEMENT__ID = eINSTANCE.getFigureElement_Id();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_ELEMENT__SRC = eINSTANCE.getFigureElement_Src();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_ELEMENT__ALT = eINSTANCE.getFigureElement_Alt();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_ELEMENT__DEF = eINSTANCE.getFigureElement_Def();

		/**
		 * The meta object literal for the '<em><b>Required Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_ELEMENT__REQUIRED_WIDTH = eINSTANCE.getFigureElement_RequiredWidth();

		/**
		 * The meta object literal for the '<em><b>Required Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_ELEMENT__REQUIRED_HEIGHT = eINSTANCE.getFigureElement_RequiredHeight();

		/**
		 * The meta object literal for the '<em><b>Actual Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_ELEMENT__ACTUAL_WIDTH = eINSTANCE.getFigureElement_ActualWidth();

		/**
		 * The meta object literal for the '<em><b>Actual Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_ELEMENT__ACTUAL_HEIGHT = eINSTANCE.getFigureElement_ActualHeight();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FigureRefElementImpl <em>Figure Ref Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.FigureRefElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFigureRefElement()
		 * @generated
		 */
		EClass FIGURE_REF_ELEMENT = eINSTANCE.getFigureRefElement();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE_REF_ELEMENT__REF = eINSTANCE.getFigureRefElement_Ref();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.FootnoteElementImpl <em>Footnote Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.FootnoteElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getFootnoteElement()
		 * @generated
		 */
		EClass FOOTNOTE_ELEMENT = eINSTANCE.getFootnoteElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.HeadingElementImpl <em>Heading Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.HeadingElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getHeadingElement()
		 * @generated
		 */
		EClass HEADING_ELEMENT = eINSTANCE.getHeadingElement();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING_ELEMENT__LEVEL = eINSTANCE.getHeadingElement_Level();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.OclCodeElementImpl <em>Ocl Code Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.OclCodeElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getOclCodeElement()
		 * @generated
		 */
		EClass OCL_CODE_ELEMENT = eINSTANCE.getOclCodeElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.OclEvalElementImpl <em>Ocl Eval Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.OclEvalElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getOclEvalElement()
		 * @generated
		 */
		EClass OCL_EVAL_ELEMENT = eINSTANCE.getOclEvalElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.examples.xtext.markup.impl.OclTextElementImpl <em>Ocl Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.OclTextElementImpl
		 * @see org.eclipse.ocl.examples.xtext.markup.impl.MarkupPackageImpl#getOclTextElement()
		 * @generated
		 */
		EClass OCL_TEXT_ELEMENT = eINSTANCE.getOclTextElement();

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