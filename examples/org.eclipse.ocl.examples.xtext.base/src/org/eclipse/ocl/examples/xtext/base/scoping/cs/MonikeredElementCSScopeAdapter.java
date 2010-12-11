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
 * $Id: MonikeredElementCSScopeAdapter.java,v 1.1.2.2 2010/12/11 10:45:32 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.MonikeredElementCS;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;

/**
 * A ModelElementCSScopeAdapter provides the basic behaviour for a family of derived
 * classes that provide additional scope/environment behaviour for corresponding
 * CS elements and pivot element counterparts.
 *
 * @param <T>
 */
public abstract class MonikeredElementCSScopeAdapter<CS extends MonikeredElementCS, P extends MonikeredElement> extends ModelElementCSScopeAdapter<CS, P>
{	
	/**
	 * Creates an instance.
	 * @param parent 
	 */
	protected MonikeredElementCSScopeAdapter(PivotManager pivotManager, CS csElement, Class<P> pivotClass) {
		super(pivotManager, csElement, pivotClass);
	}
	
	protected MonikeredElementCSScopeAdapter(PivotManager pivotManager, EObject csParent, CS csElement, Class<P> pivotClass) {
		super(pivotManager, csParent, csElement, pivotClass);
	}

	public final String getMoniker() {
		return CS2Moniker.toString(target);
	}

	@Override
	public String toString() {
		return String.valueOf(getMoniker());
	}
}
