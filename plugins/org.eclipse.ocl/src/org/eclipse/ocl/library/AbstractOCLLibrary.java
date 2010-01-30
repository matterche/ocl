/**
 * <copyright>
 *
 * Copyright (c) 2006, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 252600
 *
 * </copyright>
 *
 * $Id: AbstractOCLLibrary.java,v 1.1.2.7 2010/01/30 07:49:21 ewillink Exp $
 */

package org.eclipse.ocl.library;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.impl.OCLRootImpl;
import org.eclipse.ocl.library.merged.MergedLibrary;
import org.eclipse.ocl.library.util.LibraryResource;

/**
 * Implementation of the {@link OCLLibrary} for the Ecore environment.
 * @since 3.0
 */
public abstract class AbstractOCLLibrary extends OCLRootImpl { //implements OCLLibrary {

	/**
	 * Obtains the best available resource factory suitable for serializing
	 * Ecore models.
	 * 
	 * @return the best available Ecore resource factory
	 */
	private static Resource.Factory getEcoreResourceFactory() {
		//        Resource.Factory result;
		//        Object maybeFactory = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(
		//            "ecore"); //$NON-NLS-1$
		//        if (maybeFactory instanceof Resource.Factory.Descriptor) {
		//            result = ((Resource.Factory.Descriptor) maybeFactory).createFactory();
		//        } else if (maybeFactory instanceof Resource.Factory) {
		//            result = (Resource.Factory) maybeFactory;
		//        } else {
		//            maybeFactory = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(
		//                Resource.Factory.Registry.DEFAULT_EXTENSION);
		//            
		//            if (maybeFactory instanceof Resource.Factory.Descriptor) {
		//                result = ((Resource.Factory.Descriptor) maybeFactory).createFactory();
		//            } else if (maybeFactory instanceof Resource.Factory) {
		//                result = (Resource.Factory) maybeFactory;
		//            } else {
		//                result = new ResourceFactoryImpl();
		//            }
		//        }
		//        
		//        return result;
		// TODO: The EcoreResourceImpl should work!
		return new ResourceFactoryImpl() {

			@Override
			public Resource createResource(URI uri) {
				return new ResourceImpl(uri) {

					@Override
					public EObject getEObject(String uriFragment) {
						return super.getEObject(URI.decode(uriFragment));
					}
				};
			}
		};
	}

	private static String initializeResourceFactory(ResourceSet resourceSet) {
		Resource.Factory.Registry resourceFactoryRegistry = resourceSet != null
		? resourceSet.getResourceFactoryRegistry()
		: Resource.Factory.Registry.INSTANCE;
//		resourceFactoryRegistry.getExtensionToFactoryMap().put(
//			"oclstdlib", new LibraryResourceFactoryImpl()); //$NON-NLS-1$
		String oclLocation = System.getProperty("org.eclipse.ocl.resources"); //$NON-NLS-1$
		if (oclLocation == null)
			return "'org.eclipse.ocl.resources' property not defined; use the launch configuration to define it"; //$NON-NLS-1$
		resourceFactoryRegistry.getExtensionToFactoryMap().put(
			LibraryResource.FILE_EXTENSION, LibraryResource.Factory.INSTANCE);
		Map<URI, URI> uriMap = resourceSet != null
			? resourceSet.getURIConverter().getURIMap()
			: URIConverter.URI_MAP;		
		uriMap.put(URI.createURI(LibraryResource.OCL_STANDARD_LIBRARY_URI), URI.createFileURI(oclLocation + "/libraries/OCL.oclstdlib")); //$NON-NLS-1$
		uriMap.put(URI.createURI(LibraryResource.LIBRARIES_PATHMAP), URI.createFileURI(oclLocation + "/libraries/")); //$NON-NLS-1$
		return null;
	}
    
	public AbstractOCLLibrary(String libraryURI) {
		init(libraryURI);
	}
	

 	public List<OCLOperation> getOperations(MergedLibrary mergedLibrary, OCLConcreteType dynamicType, OperationCallExp<?, ?> operationCall) {
		Object referredOperation = operationCall.getReferredOperation();
		if (referredOperation instanceof OCLOperation) {
			return Collections.singletonList((OCLOperation)referredOperation);
		}
		return null;
	}
	
/*	public OCLProperty getProperty(OCLType dynamicType, PropertyCallExp<?, ?> propertyCall) {
		Object referredProperty = propertyCall.getReferredProperty();
		if (referredProperty instanceof OCLProperty) {
			return (OCLProperty)referredProperty;
		}
		return null;
	} */
	
    protected void init(String libraryURI) {
        URI oclstdlibURI = URI.createURI(libraryURI != null ? libraryURI : LibraryResource.OCL_STANDARD_LIBRARY_URI);
        ResourceSet rset = new ResourceSetImpl();
        // Ensure that an EcoreResource factory is registered for the ecore extension.
        // Note that when running standalone, a registration in the global registry is not certain.
        initializeResourceFactory(rset);
//        Resource res = null;
        
        try {
            Resource load = rset.getResource(oclstdlibURI, true);
            
            // transfer the loaded resource contents to a new resource that
            // FIXME    decodes URI fragments when resolving objects 
//            res = getEcoreResourceFactory().createResource(load.getURI());
//            res.getContents().addAll(load.getContents());
            OCLLibrary library = (OCLLibrary) load.getContents().get(0);
            getPackage().addAll(library.getPackage());
            
//            OCL_T = stdlibPackage.getType("T"); //$NON-NLS-1$
//            OCL_T2 = stdlibPackage.getType("T2"); //$NON-NLS-1$
                        
      //      EPackage libraryPackage = LibraryPackage.eINSTANCE;
      //      EPackage.Registry.INSTANCE.put(libraryPackage.getNsURI(), libraryPackage);
            
//            return stdlibPackage;
//        } catch (Exception e) {
            // normal case: the library file isn't there because we are
            //    generating it on the fly.  Let's do that, then
            
//            return build();
        } finally {
//            if (res != null) {
                // don't want this resource to be in a resource set
//                rset.getResources().remove(res);
//            }
        }
    }
}