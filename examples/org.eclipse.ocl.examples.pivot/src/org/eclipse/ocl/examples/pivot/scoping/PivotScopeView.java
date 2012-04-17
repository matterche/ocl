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
 * $Id: BaseScopeView.java,v 1.8 2011/05/20 18:26:13 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * ScopeViews support access to some or all of the elements in a scope.
 * Accesses are filtered on the fly since a cache of results does not remain valid
 * for long enough to merit it, with incremental reparsing regularly trashing
 * the CST.
 */
public class PivotScopeView implements ScopeView
{
	/**
     * The <code>NULLSCOPEVIEW</code> to be returned by the most outer scope
     */
    public static final ScopeView NULLSCOPEVIEW = new ScopeView()
    {
		public Attribution getAttribution() {
			return null;
		}

		public EObject getChild() {
			return null;
		}

		public EStructuralFeature getContainmentFeature() {
			return null;
		}

		public ScopeView getParent() {
			return NULLSCOPEVIEW;
		}

		public EObject getTarget() {
			return null;
		}

		public EReference getTargetReference() {
			return null;
		}
    };
	
	protected final MetaModelManager metaModelManager;
	protected final Attribution attribution;					// Attributes helper for the target CST node
	protected final Element target;								// The target CST node
	protected final EObject child;								// Child targeted by containmentFeature, null for child-independent
	protected final EStructuralFeature containmentFeature;		// Selecting child-specific candidates, null for child-independent
	protected final EReference targetReference;					// Selecting permissible candidate types
	private ScopeView parent = null;
	
	public PivotScopeView(MetaModelManager metaModelManager, Element target, Attribution attribution, EObject child, EStructuralFeature containmentFeature, EReference targetReference) {
		this.metaModelManager = metaModelManager;
		this.attribution = attribution;
		this.target = target;
		this.child = child;
		this.containmentFeature = containmentFeature;
		this.targetReference = targetReference;
	}
	
	public Attribution getAttribution() {
		return attribution;
	}

	public EObject getChild() {
		return child;
	}

	public EStructuralFeature getContainmentFeature() {
		return containmentFeature;
	}

	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}

	public ScopeView getParent() {
		if (parent == null) {
			Element aParent = null;
			Attribution parentScope = null;
			if (target instanceof Element) {
				EObject pParent = target.eContainer();
				if (pParent instanceof Element) {
					parentScope = PivotUtil.getAttribution(pParent);
					aParent = (Element) pParent;
				}
			}
			if (parentScope == null) {
				parent = NULLSCOPEVIEW;
			}
			else {
				EStructuralFeature eContainingFeature = target.eContainingFeature();
				parent = new PivotScopeView(metaModelManager, aParent, parentScope, target, eContainingFeature, targetReference);
			}
		}
		return parent;
	}

	public final Element getTarget() {
		return target;
	}

	public EReference getTargetReference() {
		return targetReference;
	}

	@Override
	public String toString() {
		EObject target = getTarget();
		StringBuilder s = new StringBuilder();
		s.append("["); //$NON-NLS-1$
		s.append(target.eClass().getName());
		if (containmentFeature != null) {
			s.append("::"); //$NON-NLS-1$
			s.append(containmentFeature.getName());
		}
		s.append("] "); //$NON-NLS-1$
		s.append(String.valueOf(target));
		return s.toString();
	}
}
