/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLConstraintOperationImpl.java,v 1.1.2.5 2010/01/20 16:57:26 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLConstraintOperation;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Constraint Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLConstraintOperationImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLConstraintOperationImpl#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLConstraintOperationImpl extends OCLOperationImpl implements OCLConstraintOperation {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected ExpressionInOCL<?, ?> specification;
	/**
	 * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final String STEREOTYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected String stereotype = STEREOTYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLConstraintOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_CONSTRAINT_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOCL<?, ?> getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(ExpressionInOCL<?, ?> newSpecification) {
		ExpressionInOCL<?, ?> oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_CONSTRAINT_OPERATION__SPECIFICATION, oldSpecification, specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(String newStereotype) {
		String oldStereotype = stereotype;
		stereotype = newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.OCL_CONSTRAINT_OPERATION__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_CONSTRAINT_OPERATION__SPECIFICATION:
				return getSpecification();
			case LibraryPackage.OCL_CONSTRAINT_OPERATION__STEREOTYPE:
				return getStereotype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LibraryPackage.OCL_CONSTRAINT_OPERATION__SPECIFICATION:
				setSpecification((ExpressionInOCL<?, ?>)newValue);
				return;
			case LibraryPackage.OCL_CONSTRAINT_OPERATION__STEREOTYPE:
				setStereotype((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LibraryPackage.OCL_CONSTRAINT_OPERATION__SPECIFICATION:
				setSpecification((ExpressionInOCL<?, ?>)null);
				return;
			case LibraryPackage.OCL_CONSTRAINT_OPERATION__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LibraryPackage.OCL_CONSTRAINT_OPERATION__SPECIFICATION:
				return specification != null;
			case LibraryPackage.OCL_CONSTRAINT_OPERATION__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
		}
		return super.eIsSet(featureID);
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
		s.append("<");
		s.append(stereotype); 
		s.append("> ");
		s.append(super.toString());
		return s.toString();
	}

	@Override
	public Object evaluate(
			EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> evaluationVisitor,
			Object source, OperationCallExp<?, ?> operationCall)
			throws Exception {
		OCLExpression<?> expression = specification.getBodyExpression();
		return expression.accept(evaluationVisitor);
	}

} //OCLConstraintOperationImpl
