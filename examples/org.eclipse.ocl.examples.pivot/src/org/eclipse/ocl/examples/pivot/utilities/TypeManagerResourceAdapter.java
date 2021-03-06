/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ocl.examples.pivot.utilities;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceAdapter;

/**
 * @Deprecated Use MetaModelManagerResourceAdapter.
 */
@Deprecated
public class TypeManagerResourceAdapter extends MetaModelManagerResourceAdapter
{
	public TypeManagerResourceAdapter(Resource resource, MetaModelManager metaModelManager) {
		super(resource, metaModelManager);
	}		
}