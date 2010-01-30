/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLInvalidTypeImpl.java,v 1.1.2.3 2010/01/30 07:49:30 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Invalid Type</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OCLInvalidTypeImpl extends OCLConcreteTypeImpl implements OCLInvalidType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLInvalidTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_INVALID_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean conformsTo(OCLType type) {
		return true;
	}
} //OCLInvalidTypeImpl
