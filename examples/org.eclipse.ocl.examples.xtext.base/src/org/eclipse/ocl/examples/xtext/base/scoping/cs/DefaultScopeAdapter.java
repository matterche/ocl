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
 * $Id: DefaultScopeAdapter.java,v 1.1.2.3 2010/12/11 10:45:32 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.RootScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.AbstractScopeAdapter;

/**
 * Scopes that are accidentally empty; a debugging aid.
 */
public class DefaultScopeAdapter extends AbstractScopeAdapter<EObject>
{
	private static final Logger logger = Logger.getLogger(DefaultScopeAdapter.class);

	public DefaultScopeAdapter(PivotManager pivotManager, EObject eObject) {
		super(pivotManager, null, eObject);
		logger.warn("Using DefaultScopeAdapter for '" + eObject.eClass().getName() + "'");
	}

	public RootScopeAdapter getRootScopeAdapter() {
		return null;
	}
}
