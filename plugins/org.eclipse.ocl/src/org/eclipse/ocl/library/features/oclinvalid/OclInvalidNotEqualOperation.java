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
 * $Id: OclInvalidNotEqualOperation.java,v 1.1.2.1 2010/01/31 22:23:49 ewillink Exp $
 */
package org.eclipse.ocl.library.features.oclinvalid;

/**
 * OcInvalidNotEqualOperation realises the OclInvalid::<>() library operation.
 * 
 * @since 3.0
 */
public class OclInvalidNotEqualOperation extends OclInvalidEqualOperation
{
	@Override
	public Boolean evaluate(Object left, Object right) {
		return !super.evaluate(left, right);
	}
}
