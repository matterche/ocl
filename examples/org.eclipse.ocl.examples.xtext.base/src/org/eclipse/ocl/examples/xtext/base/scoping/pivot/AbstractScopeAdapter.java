/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: AbstractScopeAdapter.java,v 1.1.2.3 2010/12/06 17:53:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeCS;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.RootScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

/**
 * A AbstractScopeAdapter provides the basic behaviour for a family of derived
 * classes that provide additional scope/environment behaviour for corresponding
 * CS elements.
 *
 * @param <T>
 */
public abstract class AbstractScopeAdapter<T extends EObject> implements ScopeAdapter, Adapter.Internal
{	
	private static final Logger logger = Logger.getLogger(AbstractScopeAdapter.class);
	private static Map<EPackage, Switch> switchMap = new HashMap<EPackage, Switch>();

	public static class Factory
	{
		protected void addSwitch(EPackage ePackage, Switch iSwitch) {
			switchMap.put(ePackage, iSwitch);
		}
	}
	public static RootScopeAdapter getDocumentScopeAdapter(EObject context) {
		for (ScopeAdapter scopeAdapter = getScopeAdapter(context); scopeAdapter != null; scopeAdapter = scopeAdapter.getParent()) {
			if (scopeAdapter instanceof RootScopeAdapter) {
				return (RootScopeAdapter) scopeAdapter;
			}
		}
		return null;
	}

	public static ScopeAdapter getScopeAdapter(EObject eObject) {
		if (eObject == null) {
			logger.warn("getScopeAdapter for null");
			return null;
		}
		if (eObject.eIsProxy()) {			// Shouldn't happen, but certainly does during development
			logger.warn("getScopeAdapter for proxy " + eObject);
			return null;
		}
		if (eObject instanceof ModelElementCS) {
			Element pivotElement = ((ModelElementCS)eObject).getPivot();
			if ((pivotElement != null) && (pivotElement.eResource() != null)) {
				eObject = pivotElement;
			}
		}
		EList<Adapter> eAdapters = eObject.eAdapters();
		ScopeAdapter adapter = (ScopeAdapter) EcoreUtil.getAdapter(eAdapters, ScopeAdapter.class);
		if (adapter != null) {
			return adapter;
		}
		EClass eClass = eObject.eClass();
		Switch adapterSwitch = switchMap.get(eClass.getEPackage());
		if (adapterSwitch != null) {
			adapter = adapterSwitch.doInPackageSwitch(eObject);
		}
//		if (adapter != null) {
//			if (adapter.getTarget() == null) {
//				eAdapters.add(adapter);
//			}
			return adapter;
//		}
//		return null;
	}

	public static ScopeCSAdapter getScopeCSAdapter(EObject eObject) {
		if (eObject == null) {
			logger.warn("getScopeAdapter for null");
			return null;
		}
		if (eObject.eIsProxy()) {			// Shouldn't happen, but certainly does during development
			logger.warn("getScopeAdapter for proxy " + eObject);
			return null;
		}
		EList<Adapter> eAdapters = eObject.eAdapters();
		ScopeAdapter adapter = (ScopeAdapter) EcoreUtil.getAdapter(eAdapters, ScopeAdapter.class);
		if (adapter != null) {
			return (ScopeCSAdapter) adapter;
		}
		EClass eClass = eObject.eClass();
		Switch adapterSwitch = switchMap.get(eClass.getEPackage());
		if (adapterSwitch != null) {
			adapter = adapterSwitch.doInPackageSwitch(eObject);
		}
//		if (adapter != null) {
//			if (adapter.getTarget() == null) {
//				eAdapters.add(adapter);
//			}
			return (ScopeCSAdapter) adapter;
//		}
//		return null;
	}
	

	/**
	 * The last notifier set to this adapter.
	 */
	protected final T target;

	protected final ScopeAdapter parent;

	protected AbstractScopeAdapter(ScopeAdapter parent, T target) {
		this.parent = parent;
		this.target = target;
		target.eAdapters().add(this);
	}

	protected void addLibContents(EnvironmentView environmentView, Type libType, ScopeView scopeView) {
		if (libType == null) {
			return;
		}
		environmentView.addElementsOfScope(libType, scopeView);
		if (libType instanceof org.eclipse.ocl.examples.pivot.Class) {
			for (org.eclipse.ocl.examples.pivot.Class superClass : ((org.eclipse.ocl.examples.pivot.Class) libType).getSuperClasses()) {
				addLibContents(environmentView, superClass, scopeView);
			}
		}
	}

	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		return scopeView.getOuterScope();
	}

	public final void computeLookup(EnvironmentView environmentView, EReference targetReference) {
		ScopeView scopeView = getInnerScopeView(targetReference);
		computeLookup(environmentView, scopeView);
	}

	public ScopeView getInnerScopeView(EReference targetReference) {
		return new BaseScopeView(this, null, targetReference);
	}

	public Type getBooleanType() {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getBooleanType();
	}

	public Type getClassifierType() {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getClassifierType();
	}

	public Type getCollectionType() {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getCollectionType();
	}

	public Type getIntegerType() {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getIntegerType();
	}

	public Type getInvalidType() {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getInvalidType();
	}

	public Type getLibraryType(String collectionTypeName, Type elementType) {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getLibraryType(collectionTypeName, Collections.singletonList(elementType));
	}

	public Type getNullType() {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getNullType();
	}

	public Type getOclAnyType() {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getOclAnyType();
	}

	public ScopeView getOuterScopeView(EReference targetReference) {
		ScopeAdapter parent = getParent();
		return new BaseScopeView(parent, target.eContainingFeature(), targetReference);
	}

	public ScopeAdapter getParent() {
		return parent;
	}

	public Type getRealType() {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getRealType();
	}

	public Type getSetType(TypeCS type) {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getSetType();
	}
	
	public ScopeAdapter getSourceScope(EStructuralFeature containmentFeature) {
		throw new UnsupportedOperationException(getClass().getSimpleName() + ".getSourceScope for " + target.eClass().getName()); //$NON-NLS-1$
//		return null;
	}

	public Type getStringType() {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getStringType();
	}

	public Type getSynthesizedType() {
		throw new UnsupportedOperationException(getClass().getSimpleName() + ".getSynthesizedType for " + target.eClass().getName()); //$NON-NLS-1$
//		return null;
	}

	public T getTarget() {
		return target;
	}

	public Type getTupleType() {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getTupleType();
	}

	public Type getUnlimitedNaturalType() {
		PivotManager pivotManager = getPivotManager();
		return pivotManager.getUnlimitedNaturalType();
	}
	
	public boolean isAdapterForType(Object type) {
		return type == ScopeAdapter.class;
	}

	/**
	 * Does nothing; clients may override so that it does something.
	 */
	public void notifyChanged(Notification msg) {
		// Do nothing.
	}

	public void setTarget(Notifier newTarget) {
		assert newTarget == target;
	}

	public void unsetTarget(Notifier oldTarget) {
		throw new UnsupportedOperationException();
	}
}
