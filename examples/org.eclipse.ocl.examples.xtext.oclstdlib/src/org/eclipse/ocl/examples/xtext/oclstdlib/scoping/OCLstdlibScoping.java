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
package org.eclipse.ocl.examples.xtext.oclstdlib.scoping;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.examples.pivot.scoping.Attribution;
import org.eclipse.ocl.examples.xtext.base.attributes.ConstraintCSAttribution;
import org.eclipse.ocl.examples.xtext.oclstdlib.attributes.LibOperationCSAttribution;
import org.eclipse.ocl.examples.xtext.oclstdlib.attributes.LibRootPackageCSAttribution;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.OCLstdlibCSTPackage;

public class OCLstdlibScoping
{	
	public static void init() {
		Map<EClassifier, Attribution> registry = Attribution.REGISTRY;
		registry.put(OCLstdlibCSTPackage.Literals.LIB_CONSTRAINT_CS, ConstraintCSAttribution.INSTANCE);
		registry.put(OCLstdlibCSTPackage.Literals.LIB_ITERATION_CS, LibOperationCSAttribution.INSTANCE);
		registry.put(OCLstdlibCSTPackage.Literals.LIB_OPERATION_CS, LibOperationCSAttribution.INSTANCE);
		registry.put(OCLstdlibCSTPackage.Literals.LIB_ROOT_PACKAGE_CS, LibRootPackageCSAttribution.INSTANCE);
	}
}
