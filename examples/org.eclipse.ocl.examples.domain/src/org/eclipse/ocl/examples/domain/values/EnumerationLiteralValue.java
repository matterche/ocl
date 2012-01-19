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
 * $Id: ElementValue.java,v 1.3 2011/03/12 13:21:46 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values;

import org.eclipse.ocl.examples.domain.elements.DomainEnumeration;
import org.eclipse.ocl.examples.domain.elements.DomainEnumerationLiteral;

public interface EnumerationLiteralValue extends ElementValue
{
	DomainEnumerationLiteral getElement();
	String getName();
	DomainEnumeration getType();
}
