/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: NumericGreaterThanEqualOperation.java,v 1.2 2011/01/24 19:56:31 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

/**
 * GreaterThanEqualOperation realises the >() library operation.
 */
public class OclComparableGreaterThanOperation extends OclComparableComparisonOperation
{
	public static final OclComparableGreaterThanOperation INSTANCE = new OclComparableGreaterThanOperation();

	@Override
	protected boolean getResultValue(Integer comparison) {
		return comparison > 0;
	}
}
