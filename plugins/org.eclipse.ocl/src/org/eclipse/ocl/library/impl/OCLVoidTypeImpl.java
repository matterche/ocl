/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLVoidTypeImpl.java,v 1.1.2.3 2010/01/30 07:49:26 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLVoidType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Void Type</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OCLVoidTypeImpl extends OCLConcreteTypeImpl implements OCLVoidType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLVoidTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_VOID_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean conformsTo(OCLType type) {
		return !(type instanceof OCLInvalidType);
	}

} //OCLVoidTypeImpl
