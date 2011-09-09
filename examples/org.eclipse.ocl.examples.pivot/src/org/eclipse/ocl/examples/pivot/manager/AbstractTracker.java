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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.util.EcoreUtil;

public abstract class AbstractTracker<T extends Notifier> implements MetaModelManagedAdapter
	{
		public static void uninstall(MetaModelManager metaModelManager, Notifier value) {
			if (value != null) {
				Adapter tracker = EcoreUtil.getAdapter(value.eAdapters(), metaModelManager);
				if (tracker != null) {
					((AbstractTracker<?>)tracker).dispose();
//					metaModelManager.debugRemoveAdapter(tracker);
				}
			}
		}
		
		protected MetaModelManager metaModelManager;
		protected T target;
		private boolean disposed = false;
//		private int debugCount;
		
		protected AbstractTracker(MetaModelManager metaModelManager, T target) {
			this.metaModelManager = metaModelManager;
			this.target = target;
			metaModelManager.addListener(this);
//			debugCount = metaModelManager.debugAddAdapter(this);
			target.eAdapters().add(this);
//			System.out.println(debugCount + ": ctor " + target + " " + metaModelManager);
		}		

		public void dispose() {
			if (target != null) {
				target.eAdapters().remove(this);
			}
			disposed = true;
		}

		public T getTarget() {
			return target;
		}

		MetaModelManager getTypeCaches() {
			return metaModelManager;
		}

		public boolean isAdapterFor(MetaModelManager metaModelManager) {
			return this.metaModelManager == metaModelManager;
		}
		
		public final boolean isAdapterForType(Object type) {
			return type == metaModelManager;
		}
		
		protected boolean isDisposed() {
			return disposed;
		}

		public void metaModelManagerDisposed(MetaModelManager metaModelManager) {
			dispose();
		}

		public void setTarget(Notifier newTarget) {
			assert target == newTarget;
		}

		@Override
		public String toString() {
			return String.valueOf(target);
		}

		public void unsetTarget(Notifier oldTarget) {
//			System.out.println(debugCount + ": unset " + oldTarget + " " + metaModelManager);
			assert target == oldTarget;
			target = null;
		}
	}