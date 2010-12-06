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
 * $Id: BaseCSResource.java,v 1.1.2.1 2010/12/06 17:53:58 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.utilities;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;

public interface BaseCSResource extends Resource
{
	CS2Pivot createCS2Pivot(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap, PivotManager pivotManager);
}
