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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;

abstract class ClassTracker extends AbstractTracker<org.eclipse.ocl.examples.pivot.Class>
{
	protected ClassTracker(TypeCaches typeCaches, org.eclipse.ocl.examples.pivot.Class target) {
		super(typeCaches, target);
		for (Operation pivotOperation : target.getOwnedOperations()) {
			typeCaches.addOperation(pivotOperation);
		}
		for (Property pivotProperty : target.getOwnedAttributes()) {
			typeCaches.addProperty(pivotProperty);
		}
	}		

	@Override
	public void dispose() {
		if (target != null) {
			typeCaches.removeClass(target);
			target.eAdapters().remove(this);
		}
	}

	abstract org.eclipse.ocl.examples.pivot.Class getPrimaryClass();

	public void notifyChanged(Notification notification) {
		int eventType = notification.getEventType();
		Object feature = notification.getFeature();
		if (feature == PivotPackage.Literals.CLASS__OWNED_OPERATION) {
			switch (eventType) {
				case Notification.ADD: {
					Object value = notification.getNewValue();
					typeCaches.addOperation((Operation)value);
					break;
				}
				case Notification.ADD_MANY: {
					@SuppressWarnings("unchecked")
					List<Object> values = (List<Object>)notification.getNewValue();
					for (Object value : values) {
						typeCaches.addOperation((Operation)value);
					}
					break;
				}
				case Notification.REMOVE: {
					Object value = notification.getOldValue();
					typeCaches.removeOperation((Operation)value);
					break;
				}
				case Notification.REMOVE_MANY: {
					@SuppressWarnings("unchecked")
					List<Object> values = (List<Object>)notification.getOldValue();
					for (Object value : values) {
						typeCaches.removeOperation((Operation)value);
					}
					break;
				}
			}
		}
		else if (feature == PivotPackage.Literals.CLASS__OWNED_ATTRIBUTE) {
			switch (eventType) {
				case Notification.ADD: {
					Object value = notification.getNewValue();
					typeCaches.addProperty((Property)value);
					break;
				}
				case Notification.ADD_MANY: {
					@SuppressWarnings("unchecked")
					List<Object> values = (List<Object>)notification.getNewValue();
					for (Object value : values) {
						typeCaches.addProperty((Property)value);
					}
					break;
				}
				case Notification.REMOVE: {
					Object value = notification.getOldValue();
					typeCaches.removeProperty((Property)value);
					break;
				}
				case Notification.REMOVE_MANY: {
					@SuppressWarnings("unchecked")
					List<Object> values = (List<Object>)notification.getOldValue();
					for (Object value : values) {
						typeCaches.removeProperty((Property)value);
					}
					break;
				}
			}
		}
	}
}