/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: ImportCSImpl.java,v 1.3 2011/05/20 15:27:24 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.base.baseCST.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.ImportCSImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.ImportCSImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.impl.ImportCSImpl#isAll <em>All</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportCSImpl extends NamedElementCSImpl implements ImportCS {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;
	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace namespace;

	/**
	 * The default value of the '{@link #isAll() <em>All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAll() <em>All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAll()
	 * @generated
	 * @ordered
	 */
	protected boolean all = ALL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaseCSTPackage.Literals.IMPORT_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri()
	{
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri)
	{
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.IMPORT_CS__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (namespace != null && ((EObject)namespace).eIsProxy())
		{
			InternalEObject oldNamespace = (InternalEObject)namespace;
			namespace = (Namespace)eResolveProxy(oldNamespace);
			if (namespace != oldNamespace)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BaseCSTPackage.IMPORT_CS__NAMESPACE, oldNamespace, namespace));
			}
		}
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace)
	{
		Namespace oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.IMPORT_CS__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAll()
	{
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(boolean newAll)
	{
		boolean oldAll = all;
		all = newAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaseCSTPackage.IMPORT_CS__ALL, oldAll, all));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case BaseCSTPackage.IMPORT_CS__URI:
				return getUri();
			case BaseCSTPackage.IMPORT_CS__NAMESPACE:
				if (resolve) return getNamespace();
				return basicGetNamespace();
			case BaseCSTPackage.IMPORT_CS__ALL:
				return isAll();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case BaseCSTPackage.IMPORT_CS__URI:
				setUri((String)newValue);
				return;
			case BaseCSTPackage.IMPORT_CS__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case BaseCSTPackage.IMPORT_CS__ALL:
				setAll((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case BaseCSTPackage.IMPORT_CS__URI:
				setUri(URI_EDEFAULT);
				return;
			case BaseCSTPackage.IMPORT_CS__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case BaseCSTPackage.IMPORT_CS__ALL:
				setAll(ALL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case BaseCSTPackage.IMPORT_CS__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case BaseCSTPackage.IMPORT_CS__NAMESPACE:
				return namespace != null;
			case BaseCSTPackage.IMPORT_CS__ALL:
				return all != ALL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public <R> R accept(BaseCSVisitor<R> visitor) {
		return visitor.visitImportCS(this);
	}
} //ImportCSImpl
