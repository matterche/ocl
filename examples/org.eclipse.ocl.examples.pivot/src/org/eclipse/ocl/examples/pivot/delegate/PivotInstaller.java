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
 *   C.Damus, K.Hussey, E.D.Willink - Initial API and implementation
 * 
 * </copyright>
 *
 * $Id: PivotInstaller.java,v 1.3 2011/04/25 09:49:15 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.delegate;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.ecore.Pivot2Ecore;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

public class PivotInstaller
{

	public static void installDelegates(MetaModelManager metaModelManager, org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		boolean hasDelegates = false;
		for (Type aType : metaModelManager.getLocalClasses(pivotPackage)) {
			if (installDelegates(metaModelManager, aType)) {
				hasDelegates = true;
			}
		}
		org.eclipse.ocl.examples.pivot.Package primaryPackage = metaModelManager.getPrimaryPackage(pivotPackage);
		EObject eTarget = primaryPackage.getETarget();
		if ((eTarget instanceof EPackage) && hasDelegates) {
			Pivot2Ecore.installDelegates((EPackage) eTarget);
		}
		for (org.eclipse.ocl.examples.pivot.Package nestedPackage : metaModelManager.getLocalPackages(pivotPackage)) {
			installDelegates(metaModelManager, nestedPackage);
		}
	}

	private static boolean installDelegates(MetaModelManager metaModelManager, Type pivotType) {
		boolean hasDelegates = false;
//		CompleteType completeType = metaModelManager.getCompleteType(pivotType);
//		Type modelType = completeType.getModel();
//		if (modelType instanceof org.eclipse.ocl.examples.pivot.Class) {
//			org.eclipse.ocl.examples.pivot.Class modelClass = (org.eclipse.ocl.examples.pivot.Class)modelType;
			for (Operation anOperation : metaModelManager.getLocalOperations(pivotType, null)) {
				if (installDelegates(metaModelManager, anOperation)) {
					hasDelegates = true;
				}
			}
			for (Property aProperty : metaModelManager.getLocalProperties(pivotType, null)) {
				if (installDelegates(metaModelManager, aProperty)) {
					hasDelegates = true;
				}
			}
//		}
		Type primaryType = metaModelManager.getPrimaryType(pivotType);
		EObject eTarget = primaryType.getETarget();
		if (eTarget instanceof EClassifier) {
			EClassifier eClassifier = (EClassifier)eTarget;
			for (Constraint constraint : metaModelManager.getLocalConstraints(pivotType)) {
				if (Pivot2Ecore.installDelegate(eClassifier, constraint, null)) {
					hasDelegates = true;
				}
			}
			if (hasDelegates) {
				Pivot2Ecore.installDelegates(metaModelManager, eClassifier, pivotType);
			}
		}
		return hasDelegates;
	}

	private static boolean installDelegates(MetaModelManager metaModelManager, Property aProperty) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean installDelegates(MetaModelManager metaModelManager,
			Operation anOperation) {
		// TODO Auto-generated method stub
		return false;
	}

/*	public static void prepareDelegates(MetaModelManager metaModelManager, Package pivotPackage) {
		for (Type aType : metaModelManager.getLocalTypes(pivotPackage)) {
			prepareDelegates(metaModelManager, aType);
		}
		for (org.eclipse.ocl.examples.pivot.Package nestedPackage : metaModelManager.getLocalPackages(pivotPackage)) {
			prepareDelegates(metaModelManager, nestedPackage);
		}
	}

	private static void prepareDelegates(MetaModelManager metaModelManager, Type pivotType) {
		for (Operation anOperation : metaModelManager.getLocalOperations(pivotType)) {
			prepareDelegates(metaModelManager, anOperation);
		}
		for (Property aProperty : metaModelManager.getLocalProperties(pivotType)) {
			prepareDelegates(metaModelManager, aProperty);
		}
	}

	private static void prepareDelegates(MetaModelManager metaModelManager, Property pivotProperty) {
		metaModelManager.useCompleteEnvironmentManager().getCompleteProperty(pivotProperty);
	}

	private static void prepareDelegates(MetaModelManager metaModelManager, Operation pivotOperation) {
		metaModelManager.useCompleteEnvironmentManager().getCompleteOperation(pivotOperation);
	} */
}
