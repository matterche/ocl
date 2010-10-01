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
 * $Id: AbstractConversion.java,v 1.1.2.1 2010/10/01 13:49:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

public abstract class AbstractConversion extends EcoreUtil
{	// extends EcoreUtil solely to gain access to protected GEN_MODEL_PACKAGE_NS_URI
	private static final Logger logger = Logger.getLogger(AbstractConversion.class);

	protected static <T> T basicGet(EObject eObject, EAttribute eFeature, Class<T> resultClass) {
		if (!eObject.eIsSet(eFeature)) {
			return null;
		}
		@SuppressWarnings("unchecked")
		T result = (T) eObject.eGet(eFeature);
		return result;
	}

	public static EPackage getEPackage(EObject eObject) {
		for (; eObject != null; eObject = eObject.eContainer()) {
			if (eObject instanceof EPackage) {
				return (EPackage)eObject;
			}
		}
		return null;
	}

	public static boolean isId(String name) {
		int n = name.length();
		if (n == 0)
			return false;
		if (!Character.isJavaIdentifierStart(name.charAt(0)))
			return false;
		for (int i = 1; i < n; i++)
			if (!Character.isJavaIdentifierPart(name.charAt(i)))
				return false;
		return true;
	}

	protected <T> void refreshList(List<? super T> elements, List<? extends T> newElements) {
		int newMax = newElements.size();
		for (int i = 0; i < newMax; i++) {					// Invariant: lists are equal up to index i
			T newElement = newElements.get(i);
			int oldMax = elements.size();
			boolean reused = false;;
			for (int j = i; j < oldMax; j++) {
				Object oldElement = elements.get(j);
				if (oldElement == newElement) {
					if (j != i) {
						elements.remove(j);
						elements.add(i, newElement);
					}
					reused = true;
					break;
				}
			}
			if (!reused) {
				if (i < oldMax) {
					elements.add(i, newElement);
				}
				else {
					elements.add(newElement);
				}
			}
			assert newElements.get(i) == elements.get(i);
		}
		for (int k = elements.size(); k > newMax; ) {
			elements.remove(--k);
		}
		assert newElements.size() == elements.size();
	}

	protected <T> void refreshSet(List<? super T> oldElements, Collection<? extends T> newElements) {
		for (int i = oldElements.size(); i-- > 0;) {	// Remove any oldElements not in newElements
			Object oldElement = oldElements.get(i);
			if (!newElements.contains(oldElement)) {
				oldElements.remove(i);
			}
		}
		for (T newElement : newElements) {				// Add any newElements not in oldElements
			if (!oldElements.contains(newElement)) {
				oldElements.add(newElement);
			}
		}
	}
}