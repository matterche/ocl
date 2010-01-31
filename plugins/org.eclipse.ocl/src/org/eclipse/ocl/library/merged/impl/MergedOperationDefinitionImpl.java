/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedOperationDefinitionImpl.java,v 1.1.2.3 2010/01/31 22:23:46 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.features.AbstractOperation;
import org.eclipse.ocl.library.merged.MergedOperationDefinition;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merged Operation Definition</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedOperationDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedOperationDefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedOperationDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedOperationDefinitionImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MergedOperationDefinitionImpl extends MergedOperationImpl implements MergedOperationDefinition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLParameter> parameter;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OCLType type;

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
	protected MergedOperationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLMergedLibraryPackage.Literals.MERGED_OPERATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<OCLParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<OCLParameter>(OCLParameter.class, this, OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLType getTypeGen() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (OCLType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__TYPE, oldType, type));
			}
		}
		return type;
	}
	@Override
	public OCLType getType() {
		return getTypeGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OCLType newType) {
		OCLType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__BODY, oldBody, body));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__BODY, oldBody, body));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__NAME:
				return getName();
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__PARAMETER:
				return getParameter();
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__BODY:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends OCLParameter>)newValue);
				return;
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__TYPE:
				setType((OCLType)newValue);
				return;
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__BODY:
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
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__PARAMETER:
				getParameter().clear();
				return;
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__TYPE:
				setType((OCLType)null);
				return;
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__BODY:
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
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__TYPE:
				return type != null;
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}
	
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(
			EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor,
			Object sourceVal, OperationCallExp<C, O> operationCall) {
		if (AbstractOperation.isUndefined(sourceVal)) {
			return AbstractOperation.createInvalid(null, "Undefined source: " + this); //$NON-NLS-1$
		}
		@SuppressWarnings("unchecked")
		ExpressionInOCL<C, PM> body = (ExpressionInOCL<C, PM>) getBody();
		if (body == null) {
			return AbstractOperation.createInvalid(null, "Undefined body: " + this); //$NON-NLS-1$
		}
		EList<OCLExpression<C>> args = operationCall.getArgument();
		int iMax = args.size();
		List<OCLParameter> parameters = getParameter();
		if (iMax != parameters.size()) {
			return AbstractOperation.createInvalid(null, "Mismatching parameters: " + this); //$NON-NLS-1$
		}
		Map<String, Object> envVals = new HashMap<String, Object>();
		envVals.put(Environment.SELF_VARIABLE_NAME, sourceVal);
		for (int i = 0; i < iMax; i++) {
			OCLParameter param = parameters.get(i);
			Object argVal = evaluationVisitor.visitArgument(operationCall, i);
			envVals.put(param.getName(), argVal);
		}
		Object result = evaluationVisitor.visitBody(body.getBodyExpression(), envVals);
		return result;
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
		appendQualifiedName(s);
		s.append("(");
		int iMax = parameter != null ? parameter.size() : 0;
		for (int i = 0; i < iMax; i++) {
			if (i > 0) {
				s.append(",");
			}
			parameter.get(i).appendName(s);
			s.append(" : ");
			parameter.get(i).getType().appendQualifiedName(s);
		}
		s.append(") : ");
		if (type != null) {
			type.appendQualifiedName(s);
		}
		return s.toString();
	}

	@Override
	public boolean isStatic() {
		return false;
	}
} //MergedOperationDefinitionImpl
