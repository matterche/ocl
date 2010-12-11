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
 * $Id: ModelElementCSScopeAdapter.java,v 1.1.2.2 2010/12/11 10:45:32 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;

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
	protected ModelElementCSScopeAdapter(PivotManager pivotManager, CS csElement, Class<P> pivotClass) {
		this(pivotManager, csElement.eContainer(), csElement, pivotClass);
	}
	
	protected ModelElementCSScopeAdapter(PivotManager pivotManager, EObject csParent, CS csElement, Class<P> pivotClass) {
		this(pivotManager, csParent != null ? getScopeCSAdapter((ElementCS) csParent) : null, csElement, pivotClass);
	}

	@SuppressWarnings("unchecked")
	private ModelElementCSScopeAdapter(PivotManager pivotManager, ScopeCSAdapter parentScopeAdapter, CS csElement, Class<P> pivotClass) {
		super(pivotManager, parentScopeAdapter, csElement);
		this.csClass = (Class<CS>) csElement.getClass();
		this.pivotClass = pivotClass;
	}

	public P getPivot() {
		Element pivot = target.getPivot();
		if (pivot ==  null) {
			return null;
		}
		if (!pivotClass.isAssignableFrom(pivot.getClass())) {
			throw new ClassCastException("Incorrect pivot class");
		}
		@SuppressWarnings("unchecked")
		P castPivot = (P) pivot;
		return castPivot;
	}
}
