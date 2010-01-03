/*
 * Copyright (c) 2005, 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LibraryResourceFactoryImpl.java,v 1.1.2.1 2010/01/03 22:53:50 ewillink Exp $
 */
package org.eclipse.ocl.library.util;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.LibraryResourceImpl.uml.internal.resource.UMLResourceImpl
 * @generated
 * @since 3.0
 */
public class LibraryResourceFactoryImpl
		extends ResourceFactoryImpl
		implements LibraryResource.Factory {

	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResourceGen(URI uri) {
		LibraryResource result = new LibraryResourceImpl(uri);
		result.setEncoding(LibraryResource.DEFAULT_ENCODING);
		return result;
	}

	@Override
	public Resource createResource(URI uri) {
		LibraryResource resource = (LibraryResource) createResourceGen(uri);

		resource.setXMIVersion("2.1"); //$NON-NLS-1$

		Map<Object, Object> defaultLoadOptions = resource.getDefaultLoadOptions();

		defaultLoadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
//		defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
//		defaultLoadOptions.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);
//		defaultLoadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		Map<Object, Object> defaultSaveOptions = resource.getDefaultSaveOptions();

//		defaultSaveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		defaultSaveOptions.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		defaultSaveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);

/*		defaultSaveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION,
			new XMLTypeInfo() {

				public boolean shouldSaveType(EClass objectType,
						EClassifier featureType, EStructuralFeature feature) {
					return objectType != featureType
						&& objectType != XMLTypePackage.Literals.ANY_TYPE;
				}

				public boolean shouldSaveType(EClass objectType,
						EClass featureType, EStructuralFeature feature) {
					return objectType != featureType;
				}
			}); */
		
		// Avoid relative paths from workspace resources to plugin resources.
		defaultSaveOptions.put(XMLResource.OPTION_URI_HANDLER,
			new URIHandlerImpl.PlatformSchemeAware());
		
		return resource;
	}

} // UMLResourceFactoryImpl
