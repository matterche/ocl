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

package org.eclipse.ocl.ecore.internal;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.ecore.EcoreEnvironment;

/**
 * OCLStandardLibraryPackage emulates the interface of a standard EMF auto-generated package
 * in order to allow the OCL Standard Library to be registered for installation via an extension point.
 */
public interface OCLStandardLibraryPackage extends EPackage
{
	EPackage eINSTANCE = OCLStandardLibraryImpl.stdlibPackage;
	String eNS_URI = EcoreEnvironment.OCL_STANDARD_LIBRARY_NS_URI;
}