/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.HashSet;
import java.util.Set;

/**
 * LiveInstances assists in debugging memory leaks by reporting creation/deletion/exuistence of selected class instances.
 */
public class LiveInstances<T>
{
	protected final Class<T> liveClass;
	private Set<T> instances = new HashSet<T>();
	
	public LiveInstances(Class<T> liveClass) {
		this.liveClass = liveClass;
	}

	public void add(T anInstance) {
		instances.add(anInstance);
		System.out.println(Thread.currentThread().getName() + " Add " + liveClass.getSimpleName() + "@" + Integer.toHexString(anInstance.hashCode()));		
	}

	public void remove(T anInstance) {
		instances.remove(anInstance);
		System.out.println(Thread.currentThread().getName() + " Remove " + liveClass.getSimpleName() + "@" + Integer.toHexString(anInstance.hashCode()));		
	}

	public void show() {
		if (instances.isEmpty()) {
			System.out.println("No " + liveClass.getSimpleName() + " instances live");		
		}
		else {
			StringBuffer s = new StringBuffer();
			s.append("Live instances of " + liveClass.getSimpleName());
			for (T instance : instances) {
				s.append("\n\t");
				s.append("@" + Integer.toHexString(instance.hashCode()));
			}
			System.out.println(s.toString());		
		}
	}
}