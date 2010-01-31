/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryTernaryOperation.java,v 1.1.2.1 2010/01/31 08:43:25 ewillink Exp $
 */
package org.eclipse.ocl.library;

/**
 * @since 3.0
 */
public interface LibraryTernaryOperation extends LibraryOperation {
	/**
	 * Return the result of evaluating the operation on source with arg1 and arg2.
	 * An invalid return may be indicated by throwing an exception returning Java null or OCL invalid.
	 *
	 * @param source source argument
	 * @param arg1 first argument
	 * @param arg2 second argument
	 * @return the evaluated value
	 */
	Object evaluate(Object source, Object arg1, Object arg2);
}
