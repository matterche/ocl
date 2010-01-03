/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LibraryResourceImpl.java,v 1.1.2.1 2010/01/03 22:53:50 ewillink Exp $
 */
package org.eclipse.ocl.library.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.LibraryResourceFactoryImpl.uml.internal.resource.UMLResourceFactoryImpl
 * @since 3.0
 */
public class LibraryResourceImpl
		extends XMIResourceImpl
		implements LibraryResource {

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public LibraryResourceImpl(URI uri) {
		super(uri);
	}

//	@Override
//	protected XMLLoad createXMLLoad() {
//		return new UMLLoadImpl(createXMLHelper());
//	}

	@Override
	protected boolean useIDAttributes() {
		return false;
	}

	@Override
	protected boolean useUUIDs() {
		return true;
	}

} //UMLResourceImpl
