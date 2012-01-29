/**
 * <copyright>
 * 
 * Copyright (c) 2012 E.D.Willink and others.
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

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.values.Value;

/**
 * TypeBodies provides the Java implementation bodies of OCL-defined Type operations and properties.
 */
@SuppressWarnings("nls")
public class TypeBodies
{

	/** 
	 * Implementation of the Type::resolveSelfType '' <body>.
	 */
	public static class _resolveSelfType_body_ extends AbstractBinaryOperation
	{
		public static _resolveSelfType_body_ INSTANCE = new _resolveSelfType_body_();
	
		/*
		self
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self, final Value selfType) throws InvalidValueException {
			
			
			return self;
		}
	}












}

