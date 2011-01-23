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
 * $Id: OCLstdlibCSResource.java,v 1.1.2.3 2011/01/23 15:42:29 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclstdlib.utilities;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
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
	public PivotManager createPivotManager() {
		return new PivotManager.NoDefaultLibrary();
	}
}
