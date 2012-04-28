/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST;

import org.eclipse.ocl.examples.xtext.base.baseCST.TypedElementCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Feature CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefFeatureCS#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage#getDefFeatureCS()
 * @model abstract="true"
 * @generated
 */
public interface DefFeatureCS extends TypedElementCS
{

	/**
	 * Returns the value of the '<em><b>Def</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' container reference.
	 * @see #setDef(DefCS)
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage#getDefFeatureCS_Def()
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS#getFeature
	 * @model opposite="feature" resolveProxies="false" transient="false"
	 * @generated
	 */
	DefCS getDef();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefFeatureCS#getDef <em>Def</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' container reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(DefCS value);

} // DefFeatureCS
