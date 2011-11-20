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
 * PropertyBodies provides the Java implementation bodies of OCL-defined Property operations and properties.
 */
@SuppressWarnings("nls")
public class PropertyBodies
{

	/** 
	 * Implementation of the Property 'binding_to_attribute' invariant.
	 */
	public static class _invariant_binding_to_attribute extends AbstractUnaryOperation
	{
		public static _invariant_binding_to_attribute INSTANCE = new _invariant_binding_to_attribute();
		/*
		Errors in 'http://www.eclipse.org/ocl/3.1.0/Pivot!Property'
			bad expression '(isAttribute(self) and templateParameterSubstitution->notEmpty())
		  implies (templateParameterSubstitution->forAll(ts | isAttribute(ts.formal)))'
		Unresolved property 'templateParameterSubstitution' for 'unknown-type'
		Unresolved property 'templateParameterSubstitution' for 'Boolean'
		Unresolved property 'formal' for 'OclInvalid'
		*/
	}


















}

