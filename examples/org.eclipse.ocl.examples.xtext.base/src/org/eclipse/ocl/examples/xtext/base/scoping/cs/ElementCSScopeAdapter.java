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
 * $Id: ElementCSScopeAdapter.java,v 1.1.2.2 2010/10/05 17:42:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootCS;
import org.eclipse.ocl.examples.xtext.base.scope.RootCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.AbstractScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;

/**
 * An ElementCSScopeAdapter provides the basic behaviour for a family of derived
 * classes that provide additional scope/environment behaviour for corresponding
 * CS elements.
 *
 * @param <T>
 */
public abstract class ElementCSScopeAdapter<CS extends ElementCS> extends AbstractScopeAdapter<CS> implements ScopeCSAdapter
{
	public static String getText(ElementCS csElement) {
		NodeAdapter nodeAdapter = NodeUtil.getNodeAdapter(csElement);
		if (nodeAdapter == null) {
			return null;
		}
		CompositeNode compositeNode = nodeAdapter.getParserNode();
		if (compositeNode == null) {
			return null;
		}
		String string = null;
		StringBuffer s = null;
		for (LeafNode leaf : compositeNode.getLeafNodes()) {
			if (!leaf.isHidden()) {
				String text = leaf.getText();
				if (s != null) {
					s.append(text);
				}
				else if (string != null) {
					s = new StringBuffer();
					s.append(string);
					s.append(text);
				}
				else {
					string = text;
				}
			}
		}
		return s != null ? s.toString() : string;
	}
	
	protected final RootCSScopeAdapter root;
	protected long unresolveableModificationCount = -1;
	
	protected ElementCSScopeAdapter(CS csElement) {
		this(getScopeCSAdapter(csElement.eContainer()), csElement);
	}

	protected ElementCSScopeAdapter(ScopeCSAdapter parent, CS target) {
		super(parent, target);
		this.root = parent != null ? parent.getRootScopeAdapter() : null;	// Seems to be null on Outline refresh ?? thread conflict ??
		assert (root != null) || (target instanceof RootCS);
	}	

	public RootCSScopeAdapter getRootScopeAdapter() {
		return root;
	}

	public PivotManager getPivotManager() {
		Resource csResource = target.eResource();
		CS2PivotResourceAdapter cs2PivotResourceAdapter = CS2PivotResourceAdapter.findAdapter(csResource);
		if (cs2PivotResourceAdapter == null) {
			return null;
		}
		PivotManager pivotManager = cs2PivotResourceAdapter.getPivotManager();
		return pivotManager;
	}

	public final String getMoniker() {
		return CS2Moniker.toString(target);
	}

	/**
	 * Return the source text of the target node.
	 * @return
	 */
	public String getText() {
		return ElementCSScopeAdapter.getText(target);
	}
	
	public boolean isUnresolvable() {
		return (root == null) || (unresolveableModificationCount >= root.getModificationCount());
	}

	public void setUnresolvable() {
		if (root != null) {
			unresolveableModificationCount = root.getModificationCount();
		}
	}

	@Override
	public String toString() {
		return String.valueOf(getMoniker());
	}
}
