/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: ElementValueImpl.java,v 1.5 2011/03/12 13:21:46 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import org.eclipse.ocl.examples.domain.values.ElementValue;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.domain.values.impl.AbstractObjectValue;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

public class ElementValueImpl extends AbstractObjectValue<Element> implements ElementValue
{
	protected Type type = null;

	public ElementValueImpl(ValueFactory valueFactory, Element element) {
		super(valueFactory, element);
	}

	@Override
	public Element asElement() {
		return object;
	}

	@Override
	public ElementValue asElementValue() {
		return this;
	}

	public Element getElement() {
		return object;
	}

	public Type getType() {
		if (type == null) {
			MetaModelManager metaModelManager = (MetaModelManager)valueFactory.getStandardLibrary();
			String metaClassName = object.eClass().getName();
			type = metaModelManager.getPivotType(metaClassName);
		}
		return type;
	}
}
