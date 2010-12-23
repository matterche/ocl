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
 * $Id: ElementValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import org.eclipse.ocl.examples.pivot.Element;

public class ElementValue<E extends Element> extends AbstractValue
{
	public static <E extends Element> ElementValue<E> valueOf(E element) {
		return new ElementValue<E>(element);
	}

	protected final E element;
	
	protected ElementValue(E element) {
		this.element = element;
	}

//	@Override
//	public ElementValue<E> asElementValue() {
//		return this;
//	}

	public E getElement() {
		return element;
	}

	@Override
	public String toString() {
		return element.toString();
	}
}
