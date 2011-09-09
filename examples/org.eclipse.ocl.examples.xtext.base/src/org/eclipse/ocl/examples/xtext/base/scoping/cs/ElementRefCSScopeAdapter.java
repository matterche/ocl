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
 * $Id$
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementRefCS;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;

/**
 * A ElementRefCSScopeAdapter provides the basic behaviour for a family of derived
 * classes that provide additional scope/environment behaviour for corresponding
 * CS elements and pivot element counterparts.
 *
 * @param <T>
 */
public abstract class ElementRefCSScopeAdapter<CS extends ElementRefCS, P extends Element> extends ElementCSScopeAdapter<CS>
{	
	protected final Class<CS> csClass;
	protected final Class<P> pivotClass;
	
	/**
	 * Creates an instance.
	 * @param parent 
	 */
	protected ElementRefCSScopeAdapter(MetaModelManager metaModelManager, CS csElement, Class<P> pivotClass) {
		this(metaModelManager, csElement.eContainer(), csElement, pivotClass);
	}
	
	protected ElementRefCSScopeAdapter(MetaModelManager metaModelManager, EObject csParent, CS csElement, Class<P> pivotClass) {
		this(metaModelManager, csParent != null ? getScopeCSAdapter((ElementCS) csParent) : null, csElement, pivotClass);
	}

	@SuppressWarnings("unchecked")
	private ElementRefCSScopeAdapter(MetaModelManager metaModelManager, ScopeCSAdapter parentScopeAdapter, CS csElement, Class<P> pivotClass) {
		super(metaModelManager, parentScopeAdapter, csElement);
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
}
