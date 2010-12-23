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
 * $Id: SetMinusOperation.java,v 1.1.2.3 2010/12/23 19:24:48 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.SetValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * SetMinusOperation realises the Set::-() library operation.
 * 
 * @since 3.1
 */
public class SetMinusOperation extends AbstractCollectionPairedOperation
{
	public static final SetMinusOperation INSTANCE = new SetMinusOperation();

	@Override
	protected Value evaluateCollection(CollectionValue sourceVal, CollectionValue argVal) {
		if (!(sourceVal instanceof SetValue)) {
			return null;
		}
		if (!(argVal instanceof SetValue)) {
			return null;
		}
		return ((SetValue)sourceVal).minus((SetValue)argVal);
	}
}
