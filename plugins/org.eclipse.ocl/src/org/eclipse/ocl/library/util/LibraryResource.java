/*
 * Copyright (c) 2005, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 156879, 204200
 *
 * $Id: LibraryResource.java,v 1.1.2.1 2010/01/03 22:53:50 ewillink Exp $
 */
package org.eclipse.ocl.library.util;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.XMIResource;

/**
 * <!-- begin-user-doc -->
 * The resource associated with the '<em><b>uml</b></em>' package.
 * <!-- end-user-doc -->
 * @since 3.0
 */
public interface LibraryResource
		extends XMIResource {

	/**
	 * <!-- begin-user-doc -->
	 * The factory for '<em><b>uml</b></em>' resources.
	 * <!-- end-user-doc -->
	 */
	public interface Factory
			extends Resource.Factory {

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final Factory INSTANCE = new LibraryResourceFactoryImpl();

	}

	/**
	 * <!-- begin-user-doc -->
	 * The file extension for '<em><b>uml</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FILE_EXTENSION = "oclstdlib"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * The default encoding for '<em><b>uml</b></em>' resources.
	 * <!-- end-user-doc -->
	 */
	public static final String DEFAULT_ENCODING = "UTF-8"; //$NON-NLS-1$

//	String LIBRARY_FILE_EXTENSION = "library." + FILE_EXTENSION; //$NON-NLS-1$

	String LIBRARIES_PATHMAP = "pathmap://OCL_LIBRARIES/"; //$NON-NLS-1$

	String OCL_STANDARD_LIBRARY_URI = LIBRARIES_PATHMAP + "OCL." + FILE_EXTENSION; //$NON-NLS-1$

//	String UML_2_0_0_CONTENT_TYPE_IDENTIFIER = "org.eclipse.uml2.uml_2_0_0"; //$NON-NLS-1$
	
//	String UML_2_1_0_CONTENT_TYPE_IDENTIFIER = "org.eclipse.uml2.uml_2_1_0"; //$NON-NLS-1$

//	String UML_CONTENT_TYPE_IDENTIFIER = "org.eclipse.uml2.uml_3_0_0"; //$NON-NLS-1$

} // UMLResource
