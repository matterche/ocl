/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedOperationImpl.java,v 1.1.2.2 2010/01/30 07:49:15 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeBinding;
import org.eclipse.ocl.library.OCLTypeParameter;
import org.eclipse.ocl.library.impl.OCLConcreteTypeImpl;
import org.eclipse.ocl.library.impl.OCLElementImpl;
import org.eclipse.ocl.library.merged.MergedOperation;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merged Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedOperationImpl#getPost <em>Post</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedOperationImpl#getPre <em>Pre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MergedOperationImpl extends OCLElementImpl implements MergedOperation {
	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionInOCL<?, ?>> post;

	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionInOCL<?, ?>> pre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergedOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLMergedLibraryPackage.Literals.MERGED_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionInOCL<?, ?>> getPost() {
		if (post == null) {
			post = new EObjectResolvingEList<ExpressionInOCL<?, ?>>(ExpressionInOCL.class, this, OCLMergedLibraryPackage.MERGED_OPERATION__POST);
		}
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionInOCL<?, ?>> getPre() {
		if (pre == null) {
			pre = new EObjectResolvingEList<ExpressionInOCL<?, ?>>(ExpressionInOCL.class, this, OCLMergedLibraryPackage.MERGED_OPERATION__PRE);
		}
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract ExpressionInOCL<?, ?> getBody();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<OCLParameter> getParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract OCLType getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<OCLTypeBinding> getTypeBinding() {
		return OCLConcreteTypeImpl.noTypeBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<OCLTypeParameter> getTypeParameter() {
		return OCLConcreteTypeImpl.noTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract boolean isStatic();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void setBody(ExpressionInOCL<?, ?> body);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_OPERATION__POST:
				return getPost();
			case OCLMergedLibraryPackage.MERGED_OPERATION__PRE:
				return getPre();
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
			case OCLMergedLibraryPackage.MERGED_OPERATION__POST:
				getPost().clear();
				getPost().addAll((Collection<? extends ExpressionInOCL<?, ?>>)newValue);
				return;
			case OCLMergedLibraryPackage.MERGED_OPERATION__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends ExpressionInOCL<?, ?>>)newValue);
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
			case OCLMergedLibraryPackage.MERGED_OPERATION__POST:
				getPost().clear();
				return;
			case OCLMergedLibraryPackage.MERGED_OPERATION__PRE:
				getPre().clear();
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
			case OCLMergedLibraryPackage.MERGED_OPERATION__POST:
				return post != null && !post.isEmpty();
			case OCLMergedLibraryPackage.MERGED_OPERATION__PRE:
				return pre != null && !pre.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MergedOperationImpl
