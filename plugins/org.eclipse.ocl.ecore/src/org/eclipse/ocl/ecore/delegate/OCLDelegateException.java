package org.eclipse.ocl.ecore.delegate;

/**
 * @since 3.0
 */
public class OCLDelegateException extends org.eclipse.ocl.common.internal.delegate.OCLDelegateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OCLDelegateException(String message) {
		super(message, null);
	}

	public OCLDelegateException(String message, Exception cause) {
		super(message, cause);
	}
}
