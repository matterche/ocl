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
 * $Id: ModelElementCSScopeAdapter.java,v 1.7 2011/05/02 09:31:26 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;

/**
 * A ModelElementCSScopeAdapter provides the basic behaviour for a family of derived
 * classes that provide additional scope/environment behaviour for corresponding
 * CS elements and pivot element counterparts.
 *
 * @param <T>
 */
public abstract class ModelElementCSScopeAdapter<CS extends ModelElementCS, P extends Element> extends ElementCSScopeAdapter<CS>
{	
	protected final Class<CS> csClass;
	protected final Class<P> pivotClass;
	
	/**
	 * Creates an instance.
	 * @param parent 
	 */
	protected ModelElementCSScopeAdapter(CS csElement, Class<P> pivotClass) {
		this(csElement.eContainer(), csElement, pivotClass);
	}
	
	protected ModelElementCSScopeAdapter(EObject csParent, CS csElement, Class<P> pivotClass) {
		this(csParent != null ? getScopeCSAdapter((ElementCS) csParent) : null, csElement, pivotClass);
	}

	@SuppressWarnings("unchecked")
	private ModelElementCSScopeAdapter(ScopeCSAdapter parentScopeAdapter, CS csElement, Class<P> pivotClass) {
		super(parentScopeAdapter, csElement);
		this.csClass = (Class<CS>) csElement.getClass();
		this.pivotClass = pivotClass;
	}

	public P getPivot() {
		Element pivot = target.getPivot();
		if (pivot ==  null) {
			return null;
		}
		if (!pivotClass.isAssignableFrom(pivot.getClass())) {
			throw new ClassCastException(pivot.getClass().getName() + " is not assignable to " + pivotClass.getName());
		}
		@SuppressWarnings("unchecked")
		P castPivot = (P) pivot;
		return castPivot;
	}

	@Override
	public String toString() {
		return CS2Moniker.toString(target);
	}
}
