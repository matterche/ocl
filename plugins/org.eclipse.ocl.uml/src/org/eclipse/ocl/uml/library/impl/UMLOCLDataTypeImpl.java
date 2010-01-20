/**
 * <copyright>
 * </copyright>
 *
 * $Id: UMLOCLDataTypeImpl.java,v 1.1.2.2 2010/01/20 16:57:22 ewillink Exp $
 */
package org.eclipse.ocl.uml.library.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.library.impl.OCLDataTypeImpl;

import org.eclipse.ocl.uml.library.UMLLibraryPackage;
import org.eclipse.ocl.uml.library.UMLOCLDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UMLOCL Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UMLOCLDataTypeImpl extends OCLDataTypeImpl implements UMLOCLDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLOCLDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLLibraryPackage.Literals.UMLOCL_DATA_TYPE;
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
		s.append("<uml> ");
		s.append(super.toString());
		return s.toString();
	}

} //UMLOCLDataTypeImpl
