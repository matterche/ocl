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
package org.eclipse.ocl.examples.pivot.multi;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;

public class PackageTracker extends AbstractTracker<org.eclipse.ocl.examples.pivot.Package>
{
	public static PackageTracker install(TypeCaches typeCaches, org.eclipse.ocl.examples.pivot.Package target) {
//		assert target.eAdapters().size() < 4;		// FIXME Debugging
		Adapter tracker = EcoreUtil.getAdapter(target.eAdapters(), typeCaches);
		if (tracker != null) {
			return (PackageTracker)tracker;
		}
		else {
			return new PackageTracker(typeCaches, target);
		}
	}
	
	private PackageTracker(TypeCaches typeCaches, org.eclipse.ocl.examples.pivot.Package target) {
		super(typeCaches, target);
		installPackageContent(target);
	}		

	@Override
	public void dispose() {
		if (target != null) {
			typeCaches.removePackage(target);
		}
		target.eAdapters().remove(this);
	}

	private void installPackageContent(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		for (Type pivotType : pivotPackage.getOwnedTypes()) {
			if (pivotType instanceof org.eclipse.ocl.examples.pivot.Class) {
				typeCaches.addClass((org.eclipse.ocl.examples.pivot.Class)pivotType);
			}
		}
		for (org.eclipse.ocl.examples.pivot.Package nestedPackage : pivotPackage.getNestedPackages()) {
			installPackageContent(nestedPackage);
		}
	}

	public void notifyChanged(Notification notification) {
		int eventType = notification.getEventType();
		Object feature = notification.getFeature();
		if (feature == PivotPackage.Literals.PACKAGE__OWNED_TYPE) {
			switch (eventType) {
				case Notification.ADD: {
					Object value = notification.getNewValue();
					if (value instanceof org.eclipse.ocl.examples.pivot.Class) {
						typeCaches.addClass((org.eclipse.ocl.examples.pivot.Class)value);
					}
					break;
				}
				case Notification.ADD_MANY: {
					@SuppressWarnings("unchecked")
					List<Object> values = (List<Object>)notification.getNewValue();
					for (Object value : values) {
						if (value instanceof org.eclipse.ocl.examples.pivot.Class) {
							typeCaches.addClass((org.eclipse.ocl.examples.pivot.Class)value);
						}
					}
					break;
				}
				case Notification.REMOVE: {
					Object value = notification.getOldValue();
					if (value instanceof org.eclipse.ocl.examples.pivot.Class) {
						uninstall(typeCaches, (org.eclipse.ocl.examples.pivot.Class)value);
						typeCaches.removeClass((org.eclipse.ocl.examples.pivot.Class)value);
					}
					break;
				}
				case Notification.REMOVE_MANY: {
					@SuppressWarnings("unchecked")
					List<Object> values = (List<Object>)notification.getOldValue();
					for (Object value : values) {
						if (value instanceof org.eclipse.ocl.examples.pivot.Class) {
							uninstall(typeCaches, (org.eclipse.ocl.examples.pivot.Class)value);
							typeCaches.removeClass((org.eclipse.ocl.examples.pivot.Class)value);
						}
					}
					break;
				}
			}
		}
		else if (feature == PivotPackage.Literals.PACKAGE__NESTED_PACKAGE) {
			switch (eventType) {
				case Notification.ADD: {
					Object value = notification.getNewValue();
					typeCaches.addPackage((org.eclipse.ocl.examples.pivot.Package)value);
					break;
				}
				case Notification.REMOVE: {
					Object value = notification.getOldValue();
					typeCaches.removePackage((org.eclipse.ocl.examples.pivot.Package)value);
					uninstall(typeCaches, (org.eclipse.ocl.examples.pivot.Package)value);
					break;
				}
			}
		}
	}
}