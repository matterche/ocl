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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.utilities.TypeManagedAdapter;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;

public abstract class AbstractTracker<T extends Notifier> implements TypeManagedAdapter
	{
		public static void uninstall(TypeCaches typeCaches, Notifier value) {
			if (value != null) {
				Adapter tracker = EcoreUtil.getAdapter(value.eAdapters(), typeCaches);
				if (tracker != null) {
					((AbstractTracker<?>)tracker).dispose();
//					typeCaches.debugRemoveAdapter(tracker);
				}
			}
		}
		
		protected TypeCaches typeCaches;
		protected T target;
//		private int debugCount;
		
		protected AbstractTracker(TypeCaches typeCaches, T target) {
			this.typeCaches = typeCaches;
			this.target = target;
//			debugCount = typeCaches.debugAddAdapter(this);
			target.eAdapters().add(this);
//			System.out.println(debugCount + ": ctor " + target + " " + typeCaches);
		}		

		public abstract void dispose();

		public T getTarget() {
			return target;
		}

		TypeCaches getTypeCaches() {
			return typeCaches;
		}

		public boolean isAdapterFor(TypeManager typeManager) {
			return typeCaches == typeManager;
		}
		
		public final boolean isAdapterForType(Object type) {
			return type == typeCaches;
		}

		public void setTarget(Notifier newTarget) {
			assert target == newTarget;
		}

		public void unsetTarget(Notifier oldTarget) {
//			System.out.println(debugCount + ": unset " + oldTarget + " " + typeCaches);
			assert target == oldTarget;
			target = null;
		}
	}