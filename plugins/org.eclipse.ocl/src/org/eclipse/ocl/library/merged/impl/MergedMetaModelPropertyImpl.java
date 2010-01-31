/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedMetaModelPropertyImpl.java,v 1.1.2.3 2010/01/31 22:23:46 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.features.AbstractOperation;
import org.eclipse.ocl.library.merged.MergedMetaModelProperty;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;
import org.eclipse.ocl.library.merged.OCLMetaModelProperty;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merged Meta Model Property</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedMetaModelPropertyImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MergedMetaModelPropertyImpl extends MergedPropertyImpl implements MergedMetaModelProperty {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected OCLMetaModelProperty property;

	/**
	 * This is true if the Property reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propertyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergedMetaModelPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLMergedLibraryPackage.Literals.MERGED_META_MODEL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLMetaModelProperty getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (OCLMetaModelProperty)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLMergedLibraryPackage.MERGED_META_MODEL_PROPERTY__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLMetaModelProperty basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(OCLMetaModelProperty newProperty) {
		OCLMetaModelProperty oldProperty = property;
		property = newProperty;
		boolean oldPropertyESet = propertyESet;
		propertyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_META_MODEL_PROPERTY__PROPERTY, oldProperty, property, !oldPropertyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProperty() {
		OCLMetaModelProperty oldProperty = property;
		boolean oldPropertyESet = propertyESet;
		property = null;
		propertyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCLMergedLibraryPackage.MERGED_META_MODEL_PROPERTY__PROPERTY, oldProperty, null, oldPropertyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProperty() {
		return propertyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_META_MODEL_PROPERTY__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
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
			case OCLMergedLibraryPackage.MERGED_META_MODEL_PROPERTY__PROPERTY:
				setProperty((OCLMetaModelProperty)newValue);
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
			case OCLMergedLibraryPackage.MERGED_META_MODEL_PROPERTY__PROPERTY:
				unsetProperty();
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
			case OCLMergedLibraryPackage.MERGED_META_MODEL_PROPERTY__PROPERTY:
				return isSetProperty();
		}
		return super.eIsSet(featureID);
	}

	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(
			EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor,
			Object sourceVal, PropertyCallExp<C, P> propertyCall) {
		if (AbstractOperation.isUndefined(sourceVal)) {
			return null;
		}
		@SuppressWarnings("unchecked")
		ExpressionInOCL<C, PM> body = (ExpressionInOCL<C, PM>) getDerive();
		if (body == null) {
			@SuppressWarnings("unchecked")
			ExpressionInOCL<C, PM> init = (ExpressionInOCL<C, PM>) getInit();
			body = init;
		}
		if (body != null) {
			Map<String, Object> envVals = new HashMap<String, Object>();
			envVals.put(Environment.SELF_VARIABLE_NAME, sourceVal);
			return evaluationVisitor.visitBody(body.getBodyExpression(), envVals);
		}
		else {
			return property.evaluate(evaluationVisitor, sourceVal, propertyCall);
		}
	}

	@Override
	public String getName() {
		return property != null ? property.getName() : null;
	}

	@Override
	public OCLType getType() {
		return property != null ? property.getResolvedType(null) : null;
	}

} //MergedMetaModelPropertyImpl
