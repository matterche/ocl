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
 * $Id: ObjectValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;


public class ObjectValue extends AbstractValue
{
	public static ObjectValue valueOf(Object object) {
		return new ObjectValue(object);
	}

	protected final Object object;
	
	public ObjectValue(Object object) {
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
