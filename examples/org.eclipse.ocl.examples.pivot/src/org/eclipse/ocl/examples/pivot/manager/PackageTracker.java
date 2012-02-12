/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.pivot.manager;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;

/**
 * A PackageTracker adapts a Package to keep the overall managed meta-model in tune with any changes.
 */
public abstract class PackageTracker implements Adapter.Internal
{	
	protected final PackageManager packageManager;
	protected final org.eclipse.ocl.examples.pivot.Package target;

	protected PackageTracker(PackageManager packageManager, org.eclipse.ocl.examples.pivot.Package target) {
		this.packageManager = packageManager;
		this.target = target;
		target.eAdapters().add(this);
		packageManager.addPackageTracker(target, this);
	}

	private void addedType(Object pivotType) {
		if (pivotType instanceof Type) {
			getPackageServer().addType((Type)pivotType);
		}
	}

	public void dispose() {
		packageManager.removePackageTracker(this);
		target.eAdapters().remove(this);
	}

	public MetaModelManager getMetaModelManager() {
		return packageManager.getMetaModelManager();
	}

	public PackageManager getPackageManager() {
		return packageManager;
	}

	/**
	 * Return the PackageServer supervising this package merge.
	 */
	public abstract PackageServer getPackageServer();

	/**
	 * Return the primary Package of this package merge.
	 */
	org.eclipse.ocl.examples.pivot.Package getPrimaryPackage() {
		PackageServer packageServer = getPackageServer();
		return packageServer != null ? packageServer.getTarget() : null;
	}

	public org.eclipse.ocl.examples.pivot.Package getTarget() {
		return target;
	}

	/**
	 * Return the TypeTracker for pivotType, creating it if necessary.
	 */
	abstract TypeTracker getTypeTracker(Type pivotType);

	protected void initContents(PackageServer packageServer) {
		for (Type pivotType : target.getOwnedType()) {
			packageServer.addType(pivotType);
		}
		for (org.eclipse.ocl.examples.pivot.Package nestedPackage : target.getNestedPackage()) {
			packageServer.addNestedPackage(nestedPackage);
		}
	}		

	public boolean isAdapterForType(Object type) {
		return packageManager == type;
	}

	public void notifyChanged(Notification notification) {
		int eventType = notification.getEventType();
		Object feature = notification.getFeature();
		if (feature == PivotPackage.Literals.PACKAGE__OWNED_TYPE) {
			switch (eventType) {
				case Notification.ADD: {
					addedType(notification.getNewValue());
					break;
				}
				case Notification.ADD_MANY: {
					@SuppressWarnings("unchecked")
					List<Object> values = (List<Object>)notification.getNewValue();
					for (Object value : values) {
						addedType(value);
					}
					break;
				}
				case Notification.REMOVE: {
					removedType(notification.getOldValue());
					break;
				}
				case Notification.REMOVE_MANY: {
					@SuppressWarnings("unchecked")
					List<Object> values = (List<Object>)notification.getOldValue();
					for (Object value : values) {
						removedType(value);
					}
					break;
				}
			}
		}
		else if (feature == PivotPackage.Literals.PACKAGE__NESTED_PACKAGE) {
			PackageServer packageServer = getPackageServer();
			switch (eventType) {
				case Notification.ADD: {
					packageServer.addedNestedPackage(notification.getNewValue());
					break;
				}
				case Notification.ADD_MANY: {
					@SuppressWarnings("unchecked")
					List<Object> values = (List<Object>)notification.getNewValue();
					for (Object value : values) {
						packageServer.addedNestedPackage(value);
					}
					break;
				}
				case Notification.REMOVE: {
					packageServer.removedNestedPackage(notification.getOldValue());
					break;
				}
				case Notification.REMOVE_MANY: {
					@SuppressWarnings("unchecked")
					List<Object> values = (List<Object>)notification.getOldValue();
					for (Object value : values) {
						packageServer.removedNestedPackage(value);
					}
					break;
				}
			}
		}
	}

	private void removedType(Object pivotType) {
		if (pivotType instanceof Type) {
			TypeTracker typeTracker = packageManager.getMetaModelManager().findTypeTracker((Type)pivotType);
			if (typeTracker != null) {
				TypeServer typeServer = typeTracker.getTypeServer();
				typeServer.removedType((Type)pivotType);
			}
		}
	}

	public void setTarget(Notifier newTarget) {
		assert target == newTarget;
	}

	@Override
	public String toString() {
		return String.valueOf(target);
	}

	public void unsetTarget(Notifier oldTarget) {
		assert target == oldTarget;
//		target = null;
	}
}