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
 * $Id: OperationCallExpScopeAdapter.java,v 1.1.2.1 2010/10/01 14:13:02 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Type;

public class OperationCallExpScopeAdapter extends ExpressionScopeAdapter<OperationCallExp>
{
	public OperationCallExpScopeAdapter(OperationCallExp pivotElement) {
		super(pivotElement);
	}
	
	@Override
	public Type getSynthesizedType() {
		Operation referredOperation = target.getReferredOperation();
		return referredOperation != null ? referredOperation.getType() : null;
	}
}
