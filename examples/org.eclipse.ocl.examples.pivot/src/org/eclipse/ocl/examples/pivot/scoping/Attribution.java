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
 * $Id: Attribution.java,v 1.4 2011/04/20 19:02:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.scoping;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * An Attribution provides a helper to assist in evaluating the inheriteed or synthesized attributes
 * of a type. All helpers are static and stateless, although some may maintain state using an Adapter on the
 * target element.
 * 
 * The REGISTRY maintains the helpsers for each type. Missing entries may be lazily populated by following the
 * primary superclasses until an entry is found.
 *
 * @param <T>
 */
public interface Attribution
{	
	/**
	 * The per-classifier registry of attributions.
	 */
	public static Map<EClassifier, Attribution> REGISTRY = new HashMap<EClassifier, Attribution>();

	/**
	 * Add the local lookup contributions to a view of an Environment.
	 * <p>
	 * The EnvironmentView contains the lookup matching criteria such as a specific name and
	 * accumulates candidate results.
	 * <p>
	 * The input ScopeView identifies the CST node and the containment of the CST child from which
	 * the lookup is made allowing derived implementations to present the alternative environments
	 * specified as the <i>Inherited Attributes</i> in the OCL Specification.
	 * <p>
	 * The returned ScopeView identifies an outer scope in which the lookup may be continued if the
	 * local candidate results are not suitable.
	 * 
	 * @param environmentView the EnvironmentView to compute
	 * @param scopeView the access selectivity to be applied by the lookup
	 * @return an outer ScopeView in which to continue the lookup, or null if none
	 */
	ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView);
}
