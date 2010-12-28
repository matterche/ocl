/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: PivotModelManager.java,v 1.1.2.1 2010/12/28 12:17:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.evaluation;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;

public class PivotModelManager extends LazyModelManager
{
	protected final PivotManager pivotManager;
	private Ecore2Pivot ecoreConverter = null;
	
	public PivotModelManager(PivotManager pivotManager, EObject context) {
		super(context);
		this.pivotManager = pivotManager;
	}

	// implements the inherited specification
	@Override
	protected boolean isInstance(Type requiredType, EObject eObject) {
		EClass eClass = eObject.eClass();
		EPackage ePackage = eClass.getEPackage();
		Type objectType;
		if (ePackage == PivotPackage.eINSTANCE) {
			objectType = pivotManager.getPivotType(eClass.getName());
		}
		else {
			Resource resource = eClass.eResource();
			Collection<EObject> roots;
			if (resource != null) {
				roots = resource.getContents();
			}
			else {
				roots = Collections.singletonList(EcoreUtil.getRootContainer(eClass));
			}
			ecoreConverter = new Ecore2Pivot(null, pivotManager);
			ecoreConverter.importObjects(roots, URI.createDeviceURI("temp://eval"));
			objectType = ecoreConverter.getPivot(eClass, Type.class);
//			throw new UnsupportedOperationException();
		}
	    return pivotManager.conformsTo(objectType, requiredType);
	}
}