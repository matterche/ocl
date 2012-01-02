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
package org.eclipse.ocl.examples.pivot.executor;

import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.library.executor.ReflectiveExecutorPackage;
import org.eclipse.ocl.examples.pivot.AnyType;
import org.eclipse.ocl.examples.pivot.InvalidType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.VoidType;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

public class PivotExecutorPackage extends ReflectiveExecutorPackage
{
	protected final MetaModelManager metaModelManager;
	protected final org.eclipse.ocl.examples.pivot.Package pivotPackage;

	public PivotExecutorPackage(MetaModelManager metaModelManager, org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		super(pivotPackage.getName(), pivotPackage.getNsURI());
		this.metaModelManager = metaModelManager;		
		this.pivotPackage = pivotPackage;		
	}

	@Override
	protected PivotExecutorType createExecutorType(DomainType domainType) {
		if (domainType instanceof InvalidType) {
			return new PivotExecutorInvalidType(this, (InvalidType)domainType);
		}
		else if (domainType instanceof VoidType) {
			return new PivotExecutorVoidType(this, (VoidType)domainType);
		}
		else if (domainType instanceof AnyType) {
			return new PivotExecutorAnyType(this, (AnyType)domainType);
		}
		else {
			return new PivotExecutorType(this, (Type) domainType);
		}
	}

	@Override
	protected Iterable<? extends DomainType> getDomainTypes() {
		return metaModelManager.getLocalClasses(pivotPackage);
	}

	public final MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}
	
	public final org.eclipse.ocl.examples.pivot.Package getPivotPackage() {
		return pivotPackage;
	}
	
	@Override
	protected DomainStandardLibrary getStandardLibrary() {
		return metaModelManager;
	}
}