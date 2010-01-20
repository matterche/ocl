/**
 * <copyright>
 * </copyright>
 *
 * $Id: UMLOCLPropertyImpl.java,v 1.1.2.2 2010/01/20 16:57:22 ewillink Exp $
 */
package org.eclipse.ocl.uml.library.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.library.impl.OCLMetaModelPropertyImpl;

import org.eclipse.ocl.uml.library.UMLLibraryPackage;
import org.eclipse.ocl.uml.library.UMLOCLProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UMLOCL Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UMLOCLPropertyImpl extends OCLMetaModelPropertyImpl implements UMLOCLProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLOCLPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLLibraryPackage.Literals.UMLOCL_PROPERTY;
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

} //UMLOCLPropertyImpl
