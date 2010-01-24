/**
 * <copyright>
 * </copyright>
 *
 * $Id: UMLOCLPropertyImpl.java,v 1.1.2.3 2010/01/24 07:40:39 ewillink Exp $
 */
package org.eclipse.ocl.uml.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.PropertyCallExp;
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

	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(
			EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor,
			Object source, PropertyCallExp<C, P> propertyCall) {
		EObject eObject = (EObject) source;
		EStructuralFeature eFeature = (EStructuralFeature) metaModelElement;
		return eObject.eGet(eFeature);
	}
} //UMLOCLPropertyImpl
