/**
 * <copyright>
 *
 * Copyright (c) 2009 Eclipse Modeling Project and others.
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
 * $Id: OclAnyNotEqualOperation.java,v 1.1.2.1 2010/01/31 22:23:41 ewillink Exp $
 */
package org.eclipse.ocl.library.features.oclany;

/**
 * OclAnyNotEqualOperation realises the OCLAny::<>() library operation.
 * 
 * @since 3.0
 */
public class OclAnyNotEqualOperation extends OclAnyEqualOperation
{
	@Override
	public Boolean evaluate(Object left, Object right) {
		return !super.evaluate(left, right);
	}
}
