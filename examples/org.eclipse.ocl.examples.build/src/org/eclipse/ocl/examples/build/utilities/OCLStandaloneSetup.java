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
package org.eclipse.ocl.examples.build.utilities;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.ocl.ecore.EcoreEnvironment;
import org.eclipse.ocl.examples.pivot.utilities.PivotResourceFactoryImpl;

/**
 * Initializes OCL support.
 */
public class OCLStandaloneSetup
{
	private Logger log = Logger.getLogger(getClass());

	public OCLStandaloneSetup() {
		log.info("Registering OCL Resources");
//		OCLstdlib.install();
//		PivotPackage.eINSTANCE.getClass();
		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put("pivot", PivotResourceFactoryImpl.INSTANCE);
		URIConverter.URI_MAP.put(URI.createURI(EcoreEnvironment.OCL_STANDARD_LIBRARY_NS_URI), URI.createURI("no-such-protocol://this/does/not/exist", true));
	}
}