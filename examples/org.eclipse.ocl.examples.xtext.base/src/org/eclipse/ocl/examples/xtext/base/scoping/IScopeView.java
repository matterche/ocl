/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.base.scoping;

import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.xtext.scoping.IScope;

/**
 * An IScopeView merges the Pivot ScopeView access with the Xtext IScope access to provide
 * an Xtext compliant scope that has the required access-from context for pivot
 * resolution.
 */
public interface IScopeView extends ScopeView, IScope
{	
	IScopeView getParent();
}