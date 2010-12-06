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
 * $Id: PivotFragmentProvider.java,v 1.1.2.2 2010/12/06 18:14:19 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclstdlib;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.xtext.resource.DefaultFragmentProvider;


public class PivotFragmentProvider extends DefaultFragmentProvider
{
	@Override
	public EObject getEObject(Resource resource, String fragment, Fallback fallback) {
		if (!fragment.startsWith("/")) {	// //.. fragments are CS URIs, relative framents are pivot URIs
			CS2PivotResourceAdapter converter = CS2PivotResourceAdapter.findAdapter(resource);
			if (converter != null) {
				Resource pivotResource = converter.getPivotResource(resource);
				if (pivotResource != null) {
					EObject eObject = pivotResource.getEObject(fragment);
					if (eObject != null) {
						return eObject;
					}
				}
			}
		}
		return super.getEObject(resource, fragment, fallback);
	}
}
