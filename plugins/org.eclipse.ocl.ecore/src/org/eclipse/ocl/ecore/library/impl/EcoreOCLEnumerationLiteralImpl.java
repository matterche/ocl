/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreOCLEnumerationLiteralImpl.java,v 1.1.2.2 2010/01/20 16:57:28 ewillink Exp $
 */
package org.eclipse.ocl.ecore.library.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.ecore.library.EcoreLibraryPackage;
import org.eclipse.ocl.ecore.library.EcoreOCLEnumerationLiteral;

import org.eclipse.ocl.library.impl.OCLEnumerationLiteralImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore OCL Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EcoreOCLEnumerationLiteralImpl extends OCLEnumerationLiteralImpl implements EcoreOCLEnumerationLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreOCLEnumerationLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreLibraryPackage.Literals.ECORE_OCL_ENUMERATION_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer s = new StringBuffer();
		s.append("<ecore> ");
		s.append(super.toString());
		return s.toString();
	}

} //EcoreOCLEnumerationLiteralImpl
