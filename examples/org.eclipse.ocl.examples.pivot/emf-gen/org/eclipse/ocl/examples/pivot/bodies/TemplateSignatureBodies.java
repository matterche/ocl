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
 *************************************************************************
 * This code is 100% auto-generated
 * from: pivot
 * using: org.eclipse.ocl.examples.codegen.tables.model2tables.mtl
 *
 * Do not edit it.
 */
package org.eclipse.ocl.examples.pivot.bodies;

import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;

/**
 * TemplateSignatureBodies provides the Java implementation bodies of OCL-defined TemplateSignature operations and properties.
 */
@SuppressWarnings("nls")
public class TemplateSignatureBodies
{

	/** 
	 * Implementation of the TemplateSignature 'own_elements' invariant.
	 */
	public static class _invariant_own_elements extends AbstractUnaryOperation
	{
		public static _invariant_own_elements INSTANCE = new _invariant_own_elements();
		/*
		Errors in 'http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateSignature'
			bad expression 'template.ownedElement->includesAll(parameter.parameteredElement - parameter.ownedParameteredElement)'
		Unresolved property 'ownedElement' for 'pivot.ecore::pivot::TemplateableElement'
		Unresolved property 'parameter' for 'OclInvalid'
		Unresolved property 'parameteredElement' for 'OclInvalid'
		Unresolved property 'parameter' for 'OclInvalid'
		Unresolved property 'ownedParameteredElement' for 'OclInvalid'
		Unresolved operation '-' for 'OclInvalid' and 'OclInvalid'
		*/
	}




}

