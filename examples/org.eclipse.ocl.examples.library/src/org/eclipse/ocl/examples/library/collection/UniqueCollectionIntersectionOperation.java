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
 * $Id: UniqueCollectionIntersectionOperation.java,v 1.1.2.5 2011/01/08 15:34:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

/**
 * UniqueCollectionIntersectionOperation realises the UniqueCollection::intersection() library operation.
 * 
 * @since 3.1
 */
public class UniqueCollectionIntersectionOperation extends AbstractCollectionPairedOperation
{
	public static final UniqueCollectionIntersectionOperation INSTANCE = new UniqueCollectionIntersectionOperation();

	@Override
	protected CollectionValue evaluateCollection(ValueFactory valueFactory, CollectionValue sourceVal, CollectionValue argVal) {
		return sourceVal.intersection(argVal);
	}
}