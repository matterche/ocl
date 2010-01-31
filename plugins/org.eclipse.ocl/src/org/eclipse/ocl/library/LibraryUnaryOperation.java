/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryUnaryOperation.java,v 1.1.2.1 2010/01/31 08:43:25 ewillink Exp $
 */
package org.eclipse.ocl.library;

/**
 * @since 3.0
 */
public interface LibraryUnaryOperation extends LibraryOperation {
	/**
	 * Return the result of evaluating the operation on an argument.
	 * An invalid return may be indicated by throwing an exception returning Java null or OCL invalid.
	 *
	 * @param argument the argument
	 * @return the evaluated value
	 */
	Object evaluate(Object argument);
}
