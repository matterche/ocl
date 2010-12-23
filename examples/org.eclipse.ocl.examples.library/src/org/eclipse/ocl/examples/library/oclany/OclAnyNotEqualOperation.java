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
 * $Id: OclAnyNotEqualOperation.java,v 1.1.2.2 2010/12/23 19:24:49 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.Value;


/**
 * OclAnyNotEqualOperation realises the OCLAny::<>() library operation.
 * 
 * @since 3.1
 */
public class OclAnyNotEqualOperation extends OclAnyEqualOperation
{
	public static final OclAnyNotEqualOperation INSTANCE = new OclAnyNotEqualOperation();

	@Override
	public BooleanValue evaluate(Value left, Value right) {
		return BooleanValue.valueOfNot(super.evaluate(left, right));
	}
}
