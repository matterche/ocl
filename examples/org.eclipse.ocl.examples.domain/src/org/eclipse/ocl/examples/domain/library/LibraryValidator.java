/**
 * <copyright>
 *
 * Copyright (c) 2009,2011 E.D.Willink and others.
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
 * $Id: LibraryUnaryOperation.java,v 1.3 2011/02/21 08:37:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.library;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.ocl.examples.domain.elements.DomainCallExp;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;

/**
 * The LibraryValidator defines the behaviour of library-feature-specific validators. An
 * implementation is typically constructed reflectively and return by the library-feature
 * implementation class. Reflective construction is used to avoid the need for evaluation
 * code to depend on the analysis time pivot support.
 */
public interface LibraryValidator
{
	Diagnostic validate(DomainStandardLibrary standardLibrary, DomainCallExp callExp);
}
