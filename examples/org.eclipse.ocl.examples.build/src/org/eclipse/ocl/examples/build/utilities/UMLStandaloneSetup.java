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
 * $Id: UMLStandaloneSetup.java,v 1.3 2011/02/02 18:50:54 ewillink Exp $
 */
package org.eclipse.ocl.examples.build.utilities;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.ocl.examples.pivot.uml.UMLUtils;

/**
 * Initializes UML support.
 */
public class UMLStandaloneSetup extends StandaloneSetup
{
	private Logger log = Logger.getLogger(getClass());

	public UMLStandaloneSetup() {
		log.info("Registering UML Resources");
		UMLUtils.initializeContents(null);
	}

	@Override
	public void setResourceSet(ResourceSet resourceSet) {
		super.setResourceSet(resourceSet);
		if (resourceSet != null) {
			UMLUtils.initializeContents(resourceSet);
		}
	}
}