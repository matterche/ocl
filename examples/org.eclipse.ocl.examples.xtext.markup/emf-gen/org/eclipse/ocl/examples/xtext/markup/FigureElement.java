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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fig Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getSrc <em>Src</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getDef <em>Def</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getRequiredWidth <em>Required Width</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getRequiredHeight <em>Required Height</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getActualWidth <em>Actual Width</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getActualHeight <em>Actual Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.xtext.markup.MarkupPackage#getFigureElement()
 * @model
 * @generated
 */
public interface FigureElement extends MarkupElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see org.eclipse.ocl.examples.xtext.markup.MarkupPackage#getFigureElement_Id()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.eclipse.ocl.examples.xtext.markup.MarkupPackage#getFigureElement_Src()
	 * @model
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(String)
	 * @see org.eclipse.ocl.examples.xtext.markup.MarkupPackage#getFigureElement_Alt()
	 * @model
	 * @generated
	 */
	String getAlt();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(String value);

	/**
	 * Returns the value of the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' attribute.
	 * @see #setDef(String)
	 * @see org.eclipse.ocl.examples.xtext.markup.MarkupPackage#getFigureElement_Def()
	 * @model id="true"
	 * @generated
	 */
	String getDef();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getDef <em>Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' attribute.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(String value);

	/**
	 * Returns the value of the '<em><b>Required Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Width</em>' attribute.
	 * @see #setRequiredWidth(String)
	 * @see org.eclipse.ocl.examples.xtext.markup.MarkupPackage#getFigureElement_RequiredWidth()
	 * @model
	 * @generated
	 */
	String getRequiredWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getRequiredWidth <em>Required Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Width</em>' attribute.
	 * @see #getRequiredWidth()
	 * @generated
	 */
	void setRequiredWidth(String value);

	/**
	 * Returns the value of the '<em><b>Required Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Height</em>' attribute.
	 * @see #setRequiredHeight(String)
	 * @see org.eclipse.ocl.examples.xtext.markup.MarkupPackage#getFigureElement_RequiredHeight()
	 * @model
	 * @generated
	 */
	String getRequiredHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.xtext.markup.FigureElement#getRequiredHeight <em>Required Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Height</em>' attribute.
	 * @see #getRequiredHeight()
	 * @generated
	 */
	void setRequiredHeight(String value);

	/**
	 * Returns the value of the '<em><b>Actual Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Width</em>' attribute.
	 * @see org.eclipse.ocl.examples.xtext.markup.MarkupPackage#getFigureElement_ActualWidth()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getActualWidth();

	/**
	 * Returns the value of the '<em><b>Actual Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Height</em>' attribute.
	 * @see org.eclipse.ocl.examples.xtext.markup.MarkupPackage#getFigureElement_ActualHeight()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getActualHeight();

} // FigElement
