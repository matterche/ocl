/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLConstraintOperationImpl.java,v 1.1.2.3 2010/01/03 22:53:50 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLConstraintOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Constraint Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OCLConstraintOperationImpl extends OCLOperationImpl implements OCLConstraintOperation {
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

	@Override
	public EObject evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> evaluationVisitor, OperationCallExp<?, ?> operationCall) throws Exception {
		throw new UnsupportedOperationException(getClass().getName() + ".evaluate"); //$NON-NLS-1$
	}

} //OCLConstraintOperationImpl
