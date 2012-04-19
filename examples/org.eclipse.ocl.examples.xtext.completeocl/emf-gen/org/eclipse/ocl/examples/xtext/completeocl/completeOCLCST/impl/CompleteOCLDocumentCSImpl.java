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
 * $Id: CompleteOCLDocumentCSImpl.java,v 1.3 2011/05/20 15:26:50 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.LibraryCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.impl.PackageCSImpl;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS;
import org.eclipse.ocl.examples.xtext.completeocl.util.CompleteOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLDocumentCSImpl#getOwnedImport <em>Owned Import</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLDocumentCSImpl#getOwnedLibrary <em>Owned Library</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLDocumentCSImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLDocumentCSImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.impl.CompleteOCLDocumentCSImpl#getOwnedInclude <em>Owned Include</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompleteOCLDocumentCSImpl extends PackageCSImpl implements CompleteOCLDocumentCS {
	/**
	 * The cached value of the '{@link #getOwnedImport() <em>Owned Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportCS> ownedImport;

	/**
	 * The cached value of the '{@link #getOwnedLibrary() <em>Owned Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<LibraryCS> ownedLibrary;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageDeclarationCS> packages;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextDeclCS> contexts;

	/**
	 * The cached value of the '{@link #getOwnedInclude() <em>Owned Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<IncludeCS> ownedInclude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteOCLDocumentCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteOCLCSTPackage.Literals.COMPLETE_OCL_DOCUMENT_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportCS> getOwnedImport()
	{
		if (ownedImport == null)
		{
			ownedImport = new EObjectContainmentEList<ImportCS>(ImportCS.class, this, CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_IMPORT);
		}
		return ownedImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LibraryCS> getOwnedLibrary()
	{
		if (ownedLibrary == null)
		{
			ownedLibrary = new EObjectContainmentEList<LibraryCS>(LibraryCS.class, this, CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_LIBRARY);
		}
		return ownedLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageDeclarationCS> getPackages() {
		if (packages == null)
		{
			packages = new EObjectContainmentEList<PackageDeclarationCS>(PackageDeclarationCS.class, this, CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextDeclCS> getContexts() {
		if (contexts == null)
		{
			contexts = new EObjectContainmentEList<ContextDeclCS>(ContextDeclCS.class, this, CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeCS> getOwnedInclude()
	{
		if (ownedInclude == null)
		{
			ownedInclude = new EObjectContainmentEList<IncludeCS>(IncludeCS.class, this, CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_INCLUDE);
		}
		return ownedInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_IMPORT:
				return ((InternalEList<?>)getOwnedImport()).basicRemove(otherEnd, msgs);
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_LIBRARY:
				return ((InternalEList<?>)getOwnedLibrary()).basicRemove(otherEnd, msgs);
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__CONTEXTS:
				return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_INCLUDE:
				return ((InternalEList<?>)getOwnedInclude()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_IMPORT:
				return getOwnedImport();
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_LIBRARY:
				return getOwnedLibrary();
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__PACKAGES:
				return getPackages();
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__CONTEXTS:
				return getContexts();
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_INCLUDE:
				return getOwnedInclude();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_IMPORT:
				getOwnedImport().clear();
				getOwnedImport().addAll((Collection<? extends ImportCS>)newValue);
				return;
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_LIBRARY:
				getOwnedLibrary().clear();
				getOwnedLibrary().addAll((Collection<? extends LibraryCS>)newValue);
				return;
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends PackageDeclarationCS>)newValue);
				return;
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends ContextDeclCS>)newValue);
				return;
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_INCLUDE:
				getOwnedInclude().clear();
				getOwnedInclude().addAll((Collection<? extends IncludeCS>)newValue);
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
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_IMPORT:
				getOwnedImport().clear();
				return;
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_LIBRARY:
				getOwnedLibrary().clear();
				return;
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__PACKAGES:
				getPackages().clear();
				return;
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__CONTEXTS:
				getContexts().clear();
				return;
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_INCLUDE:
				getOwnedInclude().clear();
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
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_IMPORT:
				return ownedImport != null && !ownedImport.isEmpty();
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_LIBRARY:
				return ownedLibrary != null && !ownedLibrary.isEmpty();
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__PACKAGES:
				return packages != null && !packages.isEmpty();
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_INCLUDE:
				return ownedInclude != null && !ownedInclude.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == RootCS.class)
		{
			switch (derivedFeatureID)
			{
				case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_IMPORT: return BaseCSTPackage.ROOT_CS__OWNED_IMPORT;
				case CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_LIBRARY: return BaseCSTPackage.ROOT_CS__OWNED_LIBRARY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == RootCS.class)
		{
			switch (baseFeatureID)
			{
				case BaseCSTPackage.ROOT_CS__OWNED_IMPORT: return CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_IMPORT;
				case BaseCSTPackage.ROOT_CS__OWNED_LIBRARY: return CompleteOCLCSTPackage.COMPLETE_OCL_DOCUMENT_CS__OWNED_LIBRARY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(BaseCSVisitor<R> visitor) {
		return (R) visitor.getAdapter(CompleteOCLCSVisitor.class).visitCompleteOCLDocumentCS(this);
	}
} //DocumentCSImpl
