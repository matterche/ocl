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
 * $Id: DependencyChain.java,v 1.1.2.1 2010/12/11 10:45:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Dependency;

public class DependencyChain extends Dependency<ElementCS>
{
	static final Logger logger = Logger.getLogger(DependencyChain.class);

	private final ENamedElement[] eSteps;
	
	public DependencyChain(ElementCS csElement, ENamedElement... eSteps) {
		super(csElement);
		this.eSteps = eSteps;
		if (eSteps != null) {
			EClass eClass = csElement.eClass();
			for (ENamedElement eStep : eSteps) {
				if (eStep instanceof EClass) {
					EClass eClassStep = (EClass) eStep;
					if (!eClass.isSuperTypeOf(eClassStep)) {
						logger.error(eClass.getName() + " is not a super type of " + eClassStep.getName() + " for " + toString());
					}
					eClass = eClassStep;
				}
				else if (eStep instanceof EReference) {
					EReference eReferenceStep = (EReference) eStep;
					EClass sourceEClass = eReferenceStep.getEContainingClass();
					if (!sourceEClass.isSuperTypeOf(eClass)) {
						logger.error(sourceEClass.getName() + " is not a super type of " + eClass.getName() + " for " + toString());
					}
					eClass = eReferenceStep.getEReferenceType();
				}
				else {
					logger.error(eStep.eClass().getName() + " is not a supported dependdency step for " + toString());
				}
			}
		}
	}

	@Override
	public boolean canExecute() {
		EObject eObject = element;
		if (eSteps != null) {
			for (ENamedElement eStep : eSteps) {
				if (eStep instanceof EReference) {
					EReference eReferenceStep = (EReference) eStep;
					EClass sourceEClass = eReferenceStep.getEContainingClass();
					if (!sourceEClass.isInstance(eObject)) {
						logger.error(eObject.eClass().getName() + " is not an instance of " + sourceEClass.getName() + " for " + toString());
					}
					eObject = (EObject) eObject.eGet(eReferenceStep);
					if (eObject == null) {
						return false;
					}
				}
			}
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append(super.toString());
		if (eSteps != null) {
			for (ENamedElement eStep : eSteps) {
				s.append(" ");
				if (eStep instanceof EClass) {
					s.append("(");
					s.append(eStep.getName());
					s.append(")");
				}
				else if (eStep instanceof EReference) {
					EReference eReferenceStep = (EReference) eStep;
					EClass sourceEClass = eReferenceStep.getEContainingClass();
					s.append(sourceEClass.getName());
					s.append(".");
					s.append(eReferenceStep.getName());
					s.append(":");
					s.append(eReferenceStep.getEReferenceType().getName());
				}
				else {
					s.append("<<");
					s.append(eStep.eClass().getName());
					s.append(">>");
				}
			}
		}
		return s.toString();
	}
}