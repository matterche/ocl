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
package org.eclipse.ocl.examples.xtext.essentialocl.pivot2cs;

import org.apache.log4j.Logger;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.PrimitiveType;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTFactory;
import org.eclipse.ocl.examples.xtext.base.baseCST.CollectionTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PrimitiveTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TupleTypeCS;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.BaseReferenceVisitor;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.Pivot2CSConversion;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTFactory;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS;

public class EssentialOCLReferenceVisitor extends BaseReferenceVisitor
{
	public static final Logger logger = Logger.getLogger(BaseReferenceVisitor.class);

	public EssentialOCLReferenceVisitor(Pivot2CSConversion context) {
		super(context);		// NB this class is stateless since separate instances exist per CS package
	}

	@Override
	public ElementCS visitClass(org.eclipse.ocl.examples.pivot.Class object) {
		return visitType(object);
	}

	@Override
	public ElementCS visitCollectionType(CollectionType object) {
		CollectionTypeRefCS csRef = BaseCSTFactory.eINSTANCE.createCollectionTypeRefCS();
		csRef.setPivot(object);	
// FIXME		csRef.setType(object.getElementType());
		context.importPackage(object.getElementType().getPackage());
		return csRef;
	}

	@Override
	public ElementCS visitPrimitiveType(PrimitiveType object) {
		PrimitiveTypeRefCS csRef = BaseCSTFactory.eINSTANCE.createPrimitiveTypeRefCS();
		csRef.setPivot(object);	
		csRef.setName(object.getName());
		return csRef;
	}

	@Override
	public ElementCS visitTupleType(TupleType object) {
		TupleTypeCS csRef = BaseCSTFactory.eINSTANCE.createTupleTypeCS();
		csRef.setPivot(object);	
//		csRef.setType(object.getElementType());		// FIXME parts
		return csRef;
	}

	@Override
	public ElementCS visitType(Type object) {
		TypeNameExpCS csRef = EssentialOCLCSTFactory.eINSTANCE.createTypeNameExpCS();
		csRef.setPivot(object);
//		csRef.setElement(object);
		PathNameCS csPathName = csRef.getPathName();
		if (csPathName == null) {
			csPathName = BaseCSTFactory.eINSTANCE.createPathNameCS();
			csRef.setPathName(csPathName);
		}
		context.refreshPathName(csPathName, object, null);
		context.importPackage(object.getPackage());
		return csRef;
	}
}