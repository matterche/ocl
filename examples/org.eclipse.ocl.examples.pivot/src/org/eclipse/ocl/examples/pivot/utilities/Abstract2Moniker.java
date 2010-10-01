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
 * $Id: Abstract2Moniker.java,v 1.1.2.1 2010/10/01 13:49:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public class Abstract2Moniker implements PivotConstants
{	
	public static interface Factory {
		Switch create(Abstract2Moniker moniker);
		EPackage getEPackage();
	}
		
	public static interface Switch
	{
		Object doInPackageSwitch(EObject theEObject);

		Object doSwitch(EObject object);
	}

	public class NullSwitch implements Switch
	{
		public Object doInPackageSwitch(EObject theEObject) {
			return doSwitch(theEObject);
		}
		
		public Object doSwitch(EObject theEObject) {
			if (theEObject == null) {
				Logger.getLogger(Abstract2Moniker.class).warn("No moniker support found for <null>"); //$NON-NLS-1$
				s.append("null-<null>"); //$NON-NLS-1$
			}
			else {
				Logger.getLogger(Abstract2Moniker.class).warn("No moniker support found for " + theEObject.eClass().getName()); //$NON-NLS-1$
				s.append("null-"); //$NON-NLS-1$
				s.append(theEObject.eClass().getName());
			}
			return true;
		}
	}
		
	private static Map<EPackage, Factory> factoryMap = new HashMap<EPackage, Factory>();

	private Map<EPackage, Switch> switchMap = new HashMap<EPackage, Switch>();	
	protected StringBuffer s = new StringBuffer();
	
	public static void addFactory(Factory factory) {
		factoryMap.put(factory.getEPackage(), factory);
	}

	public void append(char c) {
		s.append(c);
	}
	
	public void append(int i) {
		s.append(i);
	}
	
	public void append(String string) {
		s.append(string != null ? string : "null"); //$NON-NLS-1$
	}
	
	public void appendElement(EObject eObject) {
		assert eObject != null;
//		if (eObject == null) {
//			return;
//		}
		int oldSize = s.length();
		EPackage ePackage = eObject.eClass().getEPackage();
		Switch monikerSwitch = getSwitch(ePackage);
		monikerSwitch.doInPackageSwitch(eObject);
		assert s.length() > oldSize;
	}

	public void appendIndex(EObject eObject) {
		if (eObject != null) {
			EObject parent = eObject.eContainer();
			if (parent != null) {
				Object objects = parent.eGet(eObject.eContainingFeature());
				if (objects instanceof List<?>) {
					append(((List<?>)objects).indexOf(eObject));
					return;
				}
			}
		}
		append(0);
	}

	public Switch getSwitch(EPackage ePackage) {
		Switch monikerSwitch = switchMap.get(ePackage);
		if (monikerSwitch == null) {
			Factory factory = factoryMap.get(ePackage);
			if (factory != null) {
				monikerSwitch = factory.create(this);
			}
			if (monikerSwitch == null) {
				monikerSwitch = switchMap.get(null);
				if (monikerSwitch == null) {
					monikerSwitch = new NullSwitch();
					switchMap.put(null, monikerSwitch);
				}
			}
			switchMap.put(ePackage, monikerSwitch);
		}
		return monikerSwitch;
	}

	public Switch getSwitch(Factory factory) {
		EPackage ePackage = factory.getEPackage();
		return getSwitch(ePackage);
	}

	@Override
	public String toString() {
		return s.toString();
	}
}