/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryBinaryOperation.java,v 1.1.2.1 2010/01/31 08:43:25 ewillink Exp $
 */
package org.eclipse.ocl.library;

/**
 * @since 3.0
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
