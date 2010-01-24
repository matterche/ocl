/**
 * <copyright>
 * 
 * Copyright (c) 2010 Eclipse Modeling Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: DebugTest.java,v 1.1.2.1 2010/01/24 15:22:30 ewillink Exp $
 */

package org.eclipse.ocl.uml.tests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.tests.GenericDebugTest;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Type;

/**
 * The JUnit4 GUI does not support re-running individual tests in isolation.
 * 
 * This dummy test is therefore a debugging placeHolder for re-use while debugging.
 */
public class DebugTest
extends GenericDebugTest<EObject, Package, Type, Classifier, Class, DataType, PrimitiveType, Enumeration, Operation, Parameter, Property,
Property, Property, EnumerationLiteral, State, CallOperationAction, SendSignalAction, Constraint> {

	@Override
	public UMLTestReflection.Static getStaticReflection() {
		return UMLTestReflection.Static.INSTANCE;
	}
}
