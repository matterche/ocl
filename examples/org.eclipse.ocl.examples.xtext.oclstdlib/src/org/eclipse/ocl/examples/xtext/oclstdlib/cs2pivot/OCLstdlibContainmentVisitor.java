/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.oclstdlib.cs2pivot;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.examples.common.utils.EcoreUtils;
import org.eclipse.ocl.examples.pivot.AssociativityKind;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibClassCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibIterationCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibRootPackageCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.MetaTypeName;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.PrecedenceCS;

public class OCLstdlibContainmentVisitor extends AbstractOCLstdlibContainmentVisitor
{
	public OCLstdlibContainmentVisitor(CS2PivotConversion context) {
		super(context);
	}

	@Override
	public Continuation<?> visitLibClassCS(LibClassCS csElement) {
		EClass eClass = null;
		MetaTypeName metaType = csElement.getMetaTypeName();
		if ((metaType != null) && !metaType.eIsProxy()) {
			String metaTypeName = metaType.getName();
			eClass = (EClass) EcoreUtils.getNamedElement(PivotPackage.eINSTANCE.getEClassifiers(), metaTypeName);
		}
		if (eClass == null) {
			eClass = PivotPackage.Literals.CLASS;
		}
		@SuppressWarnings("unchecked")
		Class<Type> instanceClass = (Class<Type>)eClass.getInstanceClass();
		@SuppressWarnings("unused")
		Type pivotElement = refreshNamedElement(instanceClass, eClass, csElement);
		return visitClassCS(csElement);
	}

	@Override
	public Continuation<?> visitLibIterationCS(LibIterationCS csElement) {
		Iteration pivotElement = refreshTypedMultiplicityElement(Iteration.class, PivotPackage.Literals.ITERATION, csElement);
		context.refreshTemplateSignature(csElement, pivotElement);
		context.refreshPivotList(Parameter.class, pivotElement.getOwnedIterator(), csElement.getOwnedIterator());
		context.refreshPivotList(Parameter.class, pivotElement.getOwnedAccumulator(), csElement.getOwnedAccumulator());
		context.refreshPivotList(Parameter.class, pivotElement.getOwnedParameter(), csElement.getOwnedParameter());
		return null;
	}

	@Override
	public Continuation<?> visitLibRootPackageCS(LibRootPackageCS csElement) {
		@SuppressWarnings("unused")
		Library pivotElement = refreshPackage(Library.class, PivotPackage.Literals.LIBRARY, csElement);
		importPackages(csElement);			// FIXME This has to be after refreshPackage which is irregular and prevents local realization of ImportCS etc
		return null;
	}

	@Override
	public Continuation<?> visitPrecedenceCS(PrecedenceCS csElement) {
		Precedence pivotElement = refreshNamedElement(Precedence.class, PivotPackage.Literals.PRECEDENCE, csElement);
		pivotElement.setAssociativity(csElement.isRightAssociative() ? AssociativityKind.RIGHT : AssociativityKind.LEFT);
		return null;
	}
}
