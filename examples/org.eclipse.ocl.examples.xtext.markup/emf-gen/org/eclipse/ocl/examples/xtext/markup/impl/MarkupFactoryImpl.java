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
package org.eclipse.ocl.examples.xtext.markup.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.ocl.examples.xtext.markup.*;
import org.eclipse.ocl.examples.xtext.markup.CompoundElement;
import org.eclipse.ocl.examples.xtext.markup.FigElement;
import org.eclipse.ocl.examples.xtext.markup.FigRefElement;
import org.eclipse.ocl.examples.xtext.markup.FontElement;
import org.eclipse.ocl.examples.xtext.markup.Markup;
import org.eclipse.ocl.examples.xtext.markup.MarkupElement;
import org.eclipse.ocl.examples.xtext.markup.MarkupFactory;
import org.eclipse.ocl.examples.xtext.markup.MarkupPackage;
import org.eclipse.ocl.examples.xtext.markup.NewLineElement;
import org.eclipse.ocl.examples.xtext.markup.TextElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkupFactoryImpl extends EFactoryImpl implements MarkupFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MarkupFactory init() {
		try {
			MarkupFactory theMarkupFactory = (MarkupFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ocl/3.2.0/Markup"); 
			if (theMarkupFactory != null) {
				return theMarkupFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MarkupFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MarkupPackage.COMPOUND_ELEMENT: return createCompoundElement();
			case MarkupPackage.FONT_ELEMENT: return createFontElement();
			case MarkupPackage.FIG_ELEMENT: return createFigElement();
			case MarkupPackage.FIG_REF_ELEMENT: return createFigRefElement();
			case MarkupPackage.MARKUP: return createMarkup();
			case MarkupPackage.MARKUP_ELEMENT: return createMarkupElement();
			case MarkupPackage.NEW_LINE_ELEMENT: return createNewLineElement();
			case MarkupPackage.NULL_ELEMENT: return createNullElement();
			case MarkupPackage.OCL_ELEMENT: return createOclElement();
			case MarkupPackage.TEXT_ELEMENT: return createTextElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundElement createCompoundElement() {
		CompoundElementImpl compoundElement = new CompoundElementImpl();
		return compoundElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontElement createFontElement() {
		FontElementImpl fontElement = new FontElementImpl();
		return fontElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigElement createFigElement() {
		FigElementImpl figElement = new FigElementImpl();
		return figElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigRefElement createFigRefElement() {
		FigRefElementImpl figRefElement = new FigRefElementImpl();
		return figRefElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markup createMarkup() {
		MarkupImpl markup = new MarkupImpl();
		return markup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupElement createMarkupElement() {
		MarkupElementImpl markupElement = new MarkupElementImpl();
		return markupElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewLineElement createNewLineElement() {
		NewLineElementImpl newLineElement = new NewLineElementImpl();
		return newLineElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullElement createNullElement() {
		NullElementImpl nullElement = new NullElementImpl();
		return nullElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclElement createOclElement() {
		OclElementImpl oclElement = new OclElementImpl();
		return oclElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextElement createTextElement() {
		TextElementImpl textElement = new TextElementImpl();
		return textElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupPackage getMarkupPackage() {
		return (MarkupPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MarkupPackage getPackage() {
		return MarkupPackage.eINSTANCE;
	}

} //MarkupFactoryImpl
