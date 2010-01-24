/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreOCLPropertyImpl.java,v 1.1.2.3 2010/01/24 07:40:42 ewillink Exp $
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

	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(
			EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor,
			Object source, PropertyCallExp<C, P> propertyCall) {
		EObject eObject = (EObject) source;
		EStructuralFeature eFeature = (EStructuralFeature) metaModelElement;
		return eObject.eGet(eFeature);
	}
} //EcoreOCLPropertyImpl
