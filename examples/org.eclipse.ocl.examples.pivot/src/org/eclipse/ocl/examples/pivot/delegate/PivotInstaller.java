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

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.ecore.Pivot2Ecore;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class PivotInstaller
{
	/**
	 * Install all Constraints from pivotPackage and its nestedPackages as OCL Delegates.
	 * 
	 * @param metaModelManager
	 * @param pivotPackage
	 */
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

	/**
	 * Install all Constraints from pivotType and its operations as OCL Delegates. Returning true if any OCL Delegate installed.
	 * 
	 * @param metaModelManager
	 * @param pivotPackage
	 */
	private static boolean installDelegates(MetaModelManager metaModelManager, Type pivotType) {
		boolean hasDelegates = false;
		Type primaryType = metaModelManager.getPrimaryType(pivotType);
		EObject eTarget = primaryType.getETarget();
		if (eTarget instanceof EClassifier) {
			EClassifier eClassifier = (EClassifier)eTarget;
			for (Constraint constraint : metaModelManager.getLocalConstraints(pivotType)) {
				EModelElement eContext;
				if (constraint.isCallable()) {
					String name = constraint.getName();
					eContext = null;
					for (EOperation candidate : ((EClass) eClassifier).getEOperations()) {
						if (name.equals(candidate.getName()) && EcoreUtil.isInvariant(candidate)) {
							eContext = candidate;
							break;
						}
					}
					if (eContext == null) {
						EOperation eOperation = Pivot2Ecore.createConstraintEOperation(constraint, name);
						((EClass) eClassifier).getEOperations().add(eOperation);
						eContext = eOperation;
					}
				}
				else {
					eContext = eClassifier;
				}
				if (Pivot2Ecore.installDelegate(eContext, constraint, null)) {
					hasDelegates = true;
				}
			}
			for (Operation anOperation : metaModelManager.getLocalOperations(pivotType, null)) {
				EOperation eOperation = (EOperation)anOperation.getETarget();
				if (eOperation != null) {
					Pivot2Ecore.installDelegate(metaModelManager, eOperation);
				}
			}
			for (Property aProperty : metaModelManager.getLocalProperties(pivotType, null)) {
				EStructuralFeature eFeature = (EStructuralFeature)aProperty.getETarget();
				if (eFeature != null) {
					Pivot2Ecore.installDelegate(metaModelManager, eFeature);
				}
			}
			for (EAnnotation eAnnotation : eClassifier.getEAnnotations()) {		// Fix redefines/duplicates
				for (TreeIterator<EObject> tit = eAnnotation.eAllContents(); tit.hasNext(); ) {
					EObject eObject = tit.next();
					if (eObject instanceof EAnnotation) {
						EAnnotation nestedAnnotation = (EAnnotation) eObject;
						if (UML2GenModelUtil.UML2_GEN_MODEL_PACKAGE_1_1_NS_URI.equals(nestedAnnotation.getSource())) {
							nestedAnnotation.setSource(OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
						}
					}
				}
			}
			if (hasDelegates) {
				Pivot2Ecore.installDelegates(metaModelManager, eClassifier, pivotType);
			}
		}
		return hasDelegates;
	}
}
