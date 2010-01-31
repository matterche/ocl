/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedLibraryIterationImpl.java,v 1.1.2.1 2010/01/31 22:23:46 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.library.LibraryIteration;
import org.eclipse.ocl.library.OCLLibraryIteration;
import org.eclipse.ocl.library.merged.MergedLibraryIteration;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merged Library Iteration</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.impl.MergedLibraryIterationImpl#getIteration <em>Iteration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MergedLibraryIterationImpl extends MergedIterationImpl implements MergedLibraryIteration {
	/**
	 * The cached value of the '{@link #getIteration() <em>Iteration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteration()
	 * @generated
	 * @ordered
	 */
	protected OCLLibraryIteration iteration;

	/**
	 * This is true if the Iteration reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iterationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergedLibraryIterationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCLMergedLibraryPackage.Literals.MERGED_LIBRARY_ITERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLLibraryIteration getIteration() {
		if (iteration != null && iteration.eIsProxy()) {
			InternalEObject oldIteration = (InternalEObject)iteration;
			iteration = (OCLLibraryIteration)eResolveProxy(oldIteration);
			if (iteration != oldIteration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCLMergedLibraryPackage.MERGED_LIBRARY_ITERATION__ITERATION, oldIteration, iteration));
			}
		}
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLLibraryIteration basicGetIteration() {
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteration(OCLLibraryIteration newIteration) {
		OCLLibraryIteration oldIteration = iteration;
		iteration = newIteration;
		boolean oldIterationESet = iterationESet;
		iterationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCLMergedLibraryPackage.MERGED_LIBRARY_ITERATION__ITERATION, oldIteration, iteration, !oldIterationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIteration() {
		OCLLibraryIteration oldIteration = iteration;
		boolean oldIterationESet = iterationESet;
		iteration = null;
		iterationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCLMergedLibraryPackage.MERGED_LIBRARY_ITERATION__ITERATION, oldIteration, null, oldIterationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIteration() {
		return iterationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCLMergedLibraryPackage.MERGED_LIBRARY_ITERATION__ITERATION:
				if (resolve) return getIteration();
				return basicGetIteration();
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
			case OCLMergedLibraryPackage.MERGED_LIBRARY_ITERATION__ITERATION:
				setIteration((OCLLibraryIteration)newValue);
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
			case OCLMergedLibraryPackage.MERGED_LIBRARY_ITERATION__ITERATION:
				unsetIteration();
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
			case OCLMergedLibraryPackage.MERGED_LIBRARY_ITERATION__ITERATION:
				return isSetIteration();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getName() {
		return iteration != null ? iteration.getName() : null;
	}

	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(
			EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor,
			Object sourceVal, IteratorExp<C, PM> iteratorExp) {
		LibraryIteration libraryIteration = iteration.getLibraryIteration();
		return libraryIteration.evaluate(evaluationVisitor, sourceVal, iteratorExp);
	}
} //MergedLibraryIterationImpl
