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
 * $Id: LambdaTypeCSScopeAdapter.java,v 1.1 2011/02/15 10:36:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.ocl.examples.xtext.base.baseCST.LambdaTypeCS;

public class LambdaTypeCSScopeAdapter extends ElementCSScopeAdapter<LambdaTypeCS>
{
	public static final LambdaTypeCSScopeAdapter INSTANCE = new LambdaTypeCSScopeAdapter();
}
