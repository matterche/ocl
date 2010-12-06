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
 * $Id: PivotUtils.java,v 1.1.2.1 2010/12/06 17:20:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;


public class PivotUtils
{	
	public static org.eclipse.ocl.examples.pivot.Package getPackage(EObject object) {
		for (EObject eObject = object; eObject != null; eObject = eObject.eContainer()) {
			if (eObject instanceof org.eclipse.ocl.examples.pivot.Package) {
				return (org.eclipse.ocl.examples.pivot.Package)eObject;
			}
		}
		return null;
	}

	public static org.eclipse.ocl.examples.pivot.Class getTemplateableClass(org.eclipse.ocl.examples.pivot.Class object) {
		TemplateBinding templateBinding = object.getTemplateBindings().get(0);
		TemplateSignature templateSignature = templateBinding.getSignature();
		TemplateableElement unspecializedClass = templateSignature.getTemplate();
		return (org.eclipse.ocl.examples.pivot.Class)unspecializedClass;
	}

	public static <T extends MonikeredElement> List<T> sortByMoniker(List<T> list) {
		Collections.sort(list, new Comparator<MonikeredElement>()
		{
			public int compare(MonikeredElement o1, MonikeredElement o2) {
				return o1.getMoniker().compareTo(o2.getMoniker());
			}
		});
		return list;
	}
}
