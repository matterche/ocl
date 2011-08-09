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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.examples.xtext.markup.MarkupPackage
 * @generated
 */
public interface MarkupFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkupFactory eINSTANCE = org.eclipse.ocl.examples.xtext.markup.impl.MarkupFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Compound Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Element</em>'.
	 * @generated
	 */
	CompoundElement createCompoundElement();

	/**
	 * Returns a new object of class '<em>Font Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font Element</em>'.
	 * @generated
	 */
	FontElement createFontElement();

	/**
	 * Returns a new object of class '<em>Fig Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fig Element</em>'.
	 * @generated
	 */
	FigElement createFigElement();

	/**
	 * Returns a new object of class '<em>Fig Ref Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fig Ref Element</em>'.
	 * @generated
	 */
	FigRefElement createFigRefElement();

	/**
	 * Returns a new object of class '<em>Markup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Markup</em>'.
	 * @generated
	 */
	Markup createMarkup();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	MarkupElement createMarkupElement();

	/**
	 * Returns a new object of class '<em>New Line Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Line Element</em>'.
	 * @generated
	 */
	NewLineElement createNewLineElement();

	/**
	 * Returns a new object of class '<em>Null Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Element</em>'.
	 * @generated
	 */
	NullElement createNullElement();

	/**
	 * Returns a new object of class '<em>Ocl Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocl Element</em>'.
	 * @generated
	 */
	OclElement createOclElement();

	/**
	 * Returns a new object of class '<em>Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Element</em>'.
	 * @generated
	 */
	TextElement createTextElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MarkupPackage getMarkupPackage();

} //MarkupFactory
