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
 * $Id: ElementCSImpl.java,v 1.5 2011/01/24 20:59:32 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.base.baseCST.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.ElementCSImpl#getLogicalParent <em>Logical Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementCSImpl extends EObjectImpl implements ElementCS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaseCSTPackage.Literals.ELEMENT_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case BaseCSTPackage.ELEMENT_CS__LOGICAL_PARENT:
				return getLogicalParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case BaseCSTPackage.ELEMENT_CS__LOGICAL_PARENT:
				return getLogicalParent() != null;
		}
		return super.eIsSet(featureID);
	}

	public String getDescription()
	{
		return eClass().getName();
	}

	public ElementCS getLogicalParent()
	{
		return (ElementCS) eContainer();
	}

	@Override
	public String toString() {
		ICompositeNode parserNode = NodeModelUtils.getNode(this);
		if (parserNode != null) {
			return parserNode.getText().trim();
		}
		return CS2Moniker.toString(this);
//		return "<" + eClass().getName() + ">";
	}

	public <R> R accept(BaseCSVisitor<R> visitor) {
		return visitor.visitElementCS(this);
	}
} //ElementCSImpl
