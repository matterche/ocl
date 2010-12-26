/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: ObjectValueImpl.java,v 1.1.2.1 2010/12/26 15:21:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import org.eclipse.ocl.examples.pivot.values.ObjectValue;



public class ObjectValueImpl extends AbstractValue implements ObjectValue
{
	protected final Object object;
	
	public ObjectValueImpl(Object object) {
		this.object = object;
	}

//	@Override
//	public ObjectValue<E> asObjectValue() {
//		return this;
//	}

	public Object getObject() {
		return object;
	}

	@Override
	public String toString() {
		return object.toString();
	}
}
