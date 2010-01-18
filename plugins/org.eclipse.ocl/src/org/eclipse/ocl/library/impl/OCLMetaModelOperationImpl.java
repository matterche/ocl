/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLMetaModelOperationImpl.java,v 1.1.2.4 2010/01/18 08:57:53 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLMetaModelOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Meta Model Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OCLMetaModelOperationImpl extends OCLOperationImpl implements OCLMetaModelOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLMetaModelOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_META_MODEL_OPERATION;
	}

	@Override
	public EObject evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> evaluationVisitor, Object source, OperationCallExp<?, ?> operationCall) throws Exception {
		throw new UnsupportedOperationException(getClass().getName() + ".evaluate"); //$NON-NLS-1$
	}

} //OCLMetaModelOperationImpl
