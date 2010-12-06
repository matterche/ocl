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
 * $Id: OCLstdlibCSResource.java,v 1.1.2.1 2010/12/06 18:14:19 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclstdlib.utilities;

import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.utilities.CS2PivotResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource;
import org.eclipse.ocl.examples.xtext.oclstdlib.cs2pivot.OCLstdlibCS2Pivot;

public class OCLstdlibCSResource extends EssentialOCLCSResource
{
	@Override
	public CS2Pivot createCS2Pivot(
			Map<? extends Resource, ? extends Resource> cs2pivotResourceMap,
			PivotManager pivotManager) {
		return new OCLstdlibCS2Pivot(cs2pivotResourceMap, pivotManager);
	}

	@Override
	public NotificationChain basicSetResourceSet(ResourceSet resourceSet,
			NotificationChain notifications) {
		if (resourceSet != null) {
			PivotManager pivotManager =  new PivotManager.NoDefaultLibrary();
			CS2PivotResourceSetAdapter.getAdapter(resourceSet, pivotManager);
		}
		return super.basicSetResourceSet(resourceSet, notifications);
	}
}
