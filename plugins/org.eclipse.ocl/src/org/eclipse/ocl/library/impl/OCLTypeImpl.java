/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLTypeImpl.java,v 1.1.2.8 2010/01/30 07:49:28 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeBinding;
import org.eclipse.ocl.library.OCLTypeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Type</b></em>'.
	 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.impl.OCLTypeImpl#getConforms <em>Conforms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OCLTypeImpl extends OCLElementImpl implements OCLType {
	public static final EList<OCLOperation> noOperations = new BasicEList.UnmodifiableEList<OCLOperation>(0, new Object[]{});
	public static final EList<OCLProperty> noProperties = new BasicEList.UnmodifiableEList<OCLProperty>(0, new Object[]{});
	public static final EList<OCLTypeBinding> noTypeBindings = new BasicEList.UnmodifiableEList<OCLTypeBinding>(0, new Object[]{});
	public static final EList<OCLTypeParameter> noTypeParameters = new BasicEList.UnmodifiableEList<OCLTypeParameter>(0, new Object[]{});
	/**
	 * The cached value of the '{@link #getConforms() <em>Conforms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConforms()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLType> conforms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLType> getConforms() {
		if (conforms == null) {
			conforms = new EObjectResolvingEList<OCLType>(OCLType.class, this, LibraryPackage.OCL_TYPE__CONFORMS);
		}
		return conforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean conformsTo(OCLType type) {
		if (this == type)
			return true;
		if (conforms != null) {
			for (OCLType conform : conforms) {
				if (conform.conformsTo(type)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<OCLOperation> getOperation() {
		return noOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLOperation> getOperations(String name, EList<OCLType> parameterTypes, OCLType contextType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<OCLOperation> getOperations(String name, EList<OCLType> parameterTypes) {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<OCLProperty> getProperty() {
		return noProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLProperty getProperty(String name) {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<OCLTypeBinding> getTypeBinding() {
		return noTypeBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLTypeBinding getTypeBinding(OCLTypeParameter typeParameter) {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<OCLTypeParameter> getTypeParameter() {
		return noTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.OCL_TYPE__CONFORMS:
				return getConforms();
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
			case LibraryPackage.OCL_TYPE__CONFORMS:
				getConforms().clear();
				getConforms().addAll((Collection<? extends OCLType>)newValue);
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
			case LibraryPackage.OCL_TYPE__CONFORMS:
				getConforms().clear();
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
			case LibraryPackage.OCL_TYPE__CONFORMS:
				return conforms != null && !conforms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void appendQualifiedName(StringBuffer s) {
		super.appendQualifiedName(s);
		appendTypeParameterSignature(s, getTypeParameter());
	}

	@Override
	public void appendSignature(StringBuffer s) {
		super.appendSignature(s);
		appendTypeParameterSignature(s, getTypeParameter());
	}

	@Override
	public String getNameSeparator() {
		return "."; //$NON-NLS-1$
	}
} //OCLTypeImpl
