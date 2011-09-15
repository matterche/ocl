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
 * $Id: CallableImplementation.java,v 1.3 2011/02/21 08:37:53 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.library;

import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;

/**
 */
public interface LibraryFeature
{
	/**
	 * Return a validator for a CallExp using this feature. May return null for no validator.
	 * 
	 * Validation occurs during analysis with the pivot model using facilities that are not needed
	 * for evaluation. This method enables a pivot-unaware evaluation plugin to load a validator
	 * from a pivot-aware plugin without imposing a pivot dependency.
	 * 
	 * @param standardLibrary a context to assist in class loading.
	 * @return
	 */
	LibraryValidator getValidator(DomainStandardLibrary standardLibrary);
}
