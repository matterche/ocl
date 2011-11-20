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
 * TemplateParameterBodies provides the Java implementation bodies of OCL-defined TemplateParameter operations and properties.
 */
@SuppressWarnings("nls")
public class TemplateParameterBodies
{

	/** 
	 * Implementation of the TemplateParameter 'must_be_compatible' invariant.
	 */
	public static class _invariant_must_be_compatible extends AbstractUnaryOperation
	{
		public static _invariant_must_be_compatible INSTANCE = new _invariant_must_be_compatible();
		/*
		Errors in 'http://www.eclipse.org/ocl/3.1.0/Pivot!TemplateParameter'
			bad expression 'default->notEmpty() implies default->isCompatibleWith(parameteredElement)'
		Unresolved operation 'isCompatibleWith' for 'pivot.ecore::pivot::ParameterableElement' and 'pivot.ecore::pivot::ParameterableElement'
		*/
	}







}

