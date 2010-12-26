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
 * $Id: SetSymmetricDifferenceOperation.java,v 1.1.2.4 2010/12/26 15:20:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.SetValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * SetSymmetricDifferenceOperation realises the Set::symmetricDifference() library operation.
 * 
 * @since 3.1
 */
public class SetSymmetricDifferenceOperation extends AbstractCollectionPairedOperation
{
	public static final SetSymmetricDifferenceOperation INSTANCE = new SetSymmetricDifferenceOperation();

	@Override
	protected Value evaluateCollection(CollectionValue sourceVal, CollectionValue argVal) {
		SetValue leftSetValue = sourceVal.asSetValue();
		if (leftSetValue == null) {
			return createInvalidValue(sourceVal, null, "non-set symmetricDifference source", null);
		}
		SetValue rightSetValue = argVal.asSetValue();
		if (rightSetValue == null) {
			return createInvalidValue(sourceVal, null, "non-set symmetricDifference argument", null);
		}
		else if (rightSetValue.isInvalid()) {
			return rightSetValue;
		}		
		return leftSetValue.symmetricDifference((SetValue)argVal);
	}
}
