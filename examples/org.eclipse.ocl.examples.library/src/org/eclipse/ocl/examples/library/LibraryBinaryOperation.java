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
 * $Id: LibraryBinaryOperation.java,v 1.1.2.1 2010/10/01 13:28:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.library;

/**
 * @since 3.1
 */
public interface LibraryBinaryOperation extends LibraryOperation {
	/**
	 * Return the result of evaluating the operation on left and right arguments.
	 * An invalid return may be indicated by throwing an exception returning Java null or OCL invalid.
	 *
	 * @param left left argument
	 * @param right argument
	 * @return the evaluated value
	 */
	Object evaluate(Object left, Object right);
}
