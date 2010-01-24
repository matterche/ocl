/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedMetaModelOperationImpl.java,v 1.1.2.1 2010/01/24 07:41:13 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.OCLMetaModelOperation;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLType;

import org.eclipse.ocl.library.merged.MergedMetaModelOperation;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merged Meta Model Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedMetaModelOperationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedMetaModelOperationImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MergedMetaModelOperationImpl extends MergedOperationImpl implements MergedMetaModelOperation {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected OCLMetaModelOperation operation;

	/**
	 * This is true if the Operation reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operationESet;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected ExpressionInOCL<?, ?> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergedMetaModelOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLMergedLibraryPackage.Literals.MERGED_META_MODEL_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLMetaModelOperation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (OCLMetaModelOperation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLMetaModelOperation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(OCLMetaModelOperation newOperation) {
		OCLMetaModelOperation oldOperation = operation;
		operation = newOperation;
		boolean oldOperationESet = operationESet;
		operationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__OPERATION, oldOperation, operation, !oldOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperation() {
		OCLMetaModelOperation oldOperation = operation;
		boolean oldOperationESet = operationESet;
		operation = null;
		operationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__OPERATION, oldOperation, null, oldOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperation() {
		return operationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOCL<?, ?> getBodyGen() {
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject)body;
			body = (ExpressionInOCL<?, ?>)eResolveProxy(oldBody);
			if (body != oldBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__BODY, oldBody, body));
			}
		}
		return body;
	}
	@Override
	public ExpressionInOCL<?, ?> getBody() {
		return getBodyGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOCL<?, ?> basicGetBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyGen(ExpressionInOCL<?, ?> newBody) {
		ExpressionInOCL<?, ?> oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__BODY, oldBody, body));
	}
	@Override
	public void setBody(ExpressionInOCL<?, ?> newBody) {
		setBodyGen(newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__BODY:
				if (resolve) return getBody();
				return basicGetBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__OPERATION:
				setOperation((OCLMetaModelOperation)newValue);
				return;
			case OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__BODY:
				setBody((ExpressionInOCL<?, ?>)newValue);
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
			case OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__OPERATION:
				unsetOperation();
				return;
			case OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__BODY:
				setBody((ExpressionInOCL<?, ?>)null);
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
			case OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__OPERATION:
				return isSetOperation();
			case OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getName() {
		return operation != null ? operation.getName() : null;
	}

	@Override
	public EList<OCLParameter> getParameter() {
		return operation != null ? operation.getParameter() : null;
	}

	@Override
	public OCLType getType() {
		return operation != null ? operation.getType() : null;
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
		s.append("<merged> ");
		s.append(operation);
		return s.toString();
	}
	
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(
			EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor,
			Object sourceVal, OperationCallExp<C, O> operationCall) {
		throw new UnsupportedOperationException();
	}
} //MergedMetaModelOperationImpl
