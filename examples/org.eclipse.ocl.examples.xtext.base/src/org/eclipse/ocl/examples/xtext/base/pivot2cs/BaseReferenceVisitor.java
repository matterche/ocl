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
 * $Id: BaseReferenceVisitor.java,v 1.1.2.1 2010/12/06 17:53:58 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.pivot2cs;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtils;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTFactory;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;

public class BaseReferenceVisitor extends AbstractExtendingVisitor<ElementCS, Pivot2CSConversion>
{
	public static final Logger logger = Logger.getLogger(BaseReferenceVisitor.class);

	public BaseReferenceVisitor(Pivot2CSConversion context) {
		super(context);		// NB this class is stateless since separate instances exist per CS package
	}

	@Override
	public ElementCS visitClass(org.eclipse.ocl.examples.pivot.Class object) {
		org.eclipse.ocl.examples.pivot.Class scopeClass = context.getScope();
		org.eclipse.ocl.examples.pivot.Package scopePackage = PivotUtils.getPackage(scopeClass);
		TypedTypeRefCS csRef = BaseCSTFactory.eINSTANCE.createTypedTypeRefCS();
		csRef.setType(object);
		csRef.setPivot(object);
		org.eclipse.ocl.examples.pivot.Package objectPackage = PivotUtils.getPackage(object);
		if (!object.isPrimitive() && (objectPackage != scopePackage)) {
			context.importPackage(objectPackage);
		}
		// FIXME TemplateBindings
//		if (scopePackage == objectPackage) {
			return csRef;
//		}
		// FIXME cascade paths wrt import aliases
/*		QualifiedTypeRefCS qRef = BaseCSTFactory.eINSTANCE.createQualifiedTypeRefCS();
		qRef.setNamespace(objectPackage);
		qRef.setElement(csRef);
		qRef.setPivot(object);
		return qRef;	// FIXME TemplateBindings
*/	}

	public ElementCS visiting(Visitable visitable) {
		logger.warn("reference-visiting " + ((EObject)visitable).eClass().getName());
		return null;
	}
}