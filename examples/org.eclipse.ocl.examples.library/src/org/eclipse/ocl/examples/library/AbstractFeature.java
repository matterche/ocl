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
 * $Id: AbstractFeature.java,v 1.1.2.4 2010/12/23 19:24:49 ewillink Exp $
 */
package org.eclipse.ocl.examples.library;

import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * @since 3.1
 */
public abstract class AbstractFeature implements LibraryFeature
{
	public static CollectionValue convertToCollection(Value object) {
		if (object.isInvalid()) {
			return null;
		}
		else if (object.isNull()) {
			return null;
		}
		else if (object instanceof CollectionValue) {
			return (CollectionValue)object;
		}
		else {
//			Set<Object> sourceSet = new SetValue();
//			sourceSet.add(object);
			return null;
		}
	}
}
