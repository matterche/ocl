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
package org.eclipse.ocl.examples.xtext.markup.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.ocl.examples.xtext.markup.*;
import org.eclipse.ocl.examples.xtext.markup.CompoundElement;
import org.eclipse.ocl.examples.xtext.markup.FigElement;
import org.eclipse.ocl.examples.xtext.markup.FigRefElement;
import org.eclipse.ocl.examples.xtext.markup.FontElement;
import org.eclipse.ocl.examples.xtext.markup.Markup;
import org.eclipse.ocl.examples.xtext.markup.MarkupElement;
import org.eclipse.ocl.examples.xtext.markup.MarkupPackage;
import org.eclipse.ocl.examples.xtext.markup.NewLineElement;
import org.eclipse.ocl.examples.xtext.markup.TextElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.examples.xtext.markup.MarkupPackage
 * @generated
 */
public class MarkupSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MarkupPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupSwitch() {
		if (modelPackage == null) {
			modelPackage = MarkupPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MarkupPackage.COMPOUND_ELEMENT: {
				CompoundElement compoundElement = (CompoundElement)theEObject;
				T result = caseCompoundElement(compoundElement);
				if (result == null) result = caseMarkupElement(compoundElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkupPackage.FONT_ELEMENT: {
				FontElement fontElement = (FontElement)theEObject;
				T result = caseFontElement(fontElement);
				if (result == null) result = caseCompoundElement(fontElement);
				if (result == null) result = caseMarkupElement(fontElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkupPackage.FIG_ELEMENT: {
				FigElement figElement = (FigElement)theEObject;
				T result = caseFigElement(figElement);
				if (result == null) result = caseMarkupElement(figElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkupPackage.FIG_REF_ELEMENT: {
				FigRefElement figRefElement = (FigRefElement)theEObject;
				T result = caseFigRefElement(figRefElement);
				if (result == null) result = caseMarkupElement(figRefElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkupPackage.MARKUP: {
				Markup markup = (Markup)theEObject;
				T result = caseMarkup(markup);
				if (result == null) result = caseCompoundElement(markup);
				if (result == null) result = caseMarkupElement(markup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkupPackage.MARKUP_ELEMENT: {
				MarkupElement markupElement = (MarkupElement)theEObject;
				T result = caseMarkupElement(markupElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkupPackage.NEW_LINE_ELEMENT: {
				NewLineElement newLineElement = (NewLineElement)theEObject;
				T result = caseNewLineElement(newLineElement);
				if (result == null) result = caseMarkupElement(newLineElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkupPackage.NULL_ELEMENT: {
				NullElement nullElement = (NullElement)theEObject;
				T result = caseNullElement(nullElement);
				if (result == null) result = caseCompoundElement(nullElement);
				if (result == null) result = caseMarkupElement(nullElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkupPackage.OCL_ELEMENT: {
				OclElement oclElement = (OclElement)theEObject;
				T result = caseOclElement(oclElement);
				if (result == null) result = caseCompoundElement(oclElement);
				if (result == null) result = caseMarkupElement(oclElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MarkupPackage.TEXT_ELEMENT: {
				TextElement textElement = (TextElement)theEObject;
				T result = caseTextElement(textElement);
				if (result == null) result = caseMarkupElement(textElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundElement(CompoundElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontElement(FontElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fig Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fig Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigElement(FigElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fig Ref Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fig Ref Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigRefElement(FigRefElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkup(Markup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupElement(MarkupElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Line Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Line Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewLineElement(NewLineElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullElement(NullElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOclElement(OclElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextElement(TextElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MarkupSwitch
