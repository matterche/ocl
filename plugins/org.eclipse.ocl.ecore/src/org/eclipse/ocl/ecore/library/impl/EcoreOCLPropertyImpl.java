/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreOCLPropertyImpl.java,v 1.1.2.2 2010/01/20 16:57:28 ewillink Exp $
 */
package org.eclipse.ocl.ecore.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.ecore.library.EcoreLibraryPackage;
import org.eclipse.ocl.ecore.library.EcoreOCLProperty;
import org.eclipse.ocl.expressions.PropertyCallExp;

import org.eclipse.ocl.library.impl.OCLMetaModelPropertyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore OCL Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EcoreOCLPropertyImpl extends OCLMetaModelPropertyImpl implements EcoreOCLProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreOCLPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreLibraryPackage.Literals.ECORE_OCL_PROPERTY;
	}

	@Override
	public Object evaluate(
			EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> evaluationVisitor,
			Object source, PropertyCallExp<?, ?> propertyCall) {
		EObject eObject = (EObject) source;
		EStructuralFeature eFeature = (EStructuralFeature) metaModelElement;
		return eObject.eGet(eFeature);
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

} //EcoreOCLPropertyImpl
