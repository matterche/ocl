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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;

abstract class PackageTracker extends AbstractTracker<org.eclipse.ocl.examples.pivot.Package>
{
	protected PackageTracker(MetaModelManager metaModelManager, org.eclipse.ocl.examples.pivot.Package target) {
		super(metaModelManager, target);
		metaModelManager.addPackageTracker(target, this);
	}

	private void addedType(Object pivotType) {
		if (pivotType instanceof Type) {
			getPackageServer().addType((Type)pivotType);
		}
	}

	@Override
	public void dispose() {
		metaModelManager.removePackageTracker(this);
		super.dispose();
	}

	/**
	 * Return the PackageServer supervising this package merge.
	 */
	abstract PackageServer getPackageServer();

	/**
	 * Return the primary Package of this package merge.
	 */
	org.eclipse.ocl.examples.pivot.Package getPrimaryPackage() {
		PackageServer packageServer = getPackageServer();
		return packageServer != null ? packageServer.getTarget() : null;
	}

	/**
	 * Return the TypeTracker for pivotType, creating it if necessary.
	 */
	abstract TypeTracker getTypeTracker(Type pivotType);

	protected void initContents(PackageServer packageServer) {
		for (Type pivotType : target.getOwnedTypes()) {
			packageServer.addType(pivotType);
		}
		for (org.eclipse.ocl.examples.pivot.Package nestedPackage : target.getNestedPackages()) {
			packageServer.addNestedPackage(nestedPackage);
		}
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
			TypeTracker typeTracker = metaModelManager.findTypeTracker((Type)pivotType);
			if (typeTracker != null) {
				TypeServer typeServer = typeTracker.getTypeServer();
				typeServer.removedType((Type)pivotType);
			}
		}
	}
}