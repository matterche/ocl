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
 * $Id: SequenceSubSequenceOperation.java,v 1.1.2.2 2010/10/05 17:29:59 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.ocl.examples.pivot.values.CollectionUtil;

/**
 * SequenceSubSequenceOperation realises the OrderedSet::subSequence() library operation.
 * 
 * @since 3.1
 */
public class SequenceSubSequenceOperation extends AbstractOrderedCollectionTernaryOperation
{
	public static final SequenceSubSequenceOperation INSTANCE = new SequenceSubSequenceOperation();

	@Override
	protected Object evaluateCollection(Collection<?> sourceVal, Object argVal1, Object argVal2) {
		if (!(argVal1 instanceof BigInteger)) {
			return null;
		}
		if (!(argVal2 instanceof BigInteger)) {
			return null;
		}
		return CollectionUtil.subSequence(sourceVal, ((BigInteger)argVal1).intValue(), ((BigInteger)argVal2).intValue());
	}
}
