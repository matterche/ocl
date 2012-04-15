/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: PivotSaver.java,v 1.8 2011/04/25 09:49:15 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.util.Visitable;

/**
 * PivotSaver ensures that all references to specialized types are terminated
 * by local copies of the specialization.
 */
public abstract class AbstractPivotSaver
{
	public static interface Factory
	{
		LocateVisitor createLocateVisitor(AbstractPivotSaver saver);
		ResolveVisitor createResolveVisitor(AbstractPivotSaver saver);
		EPackage getEPackage();
	}
	
	private static Map<EPackage, Factory> factoryMap = new HashMap<EPackage, Factory>();
	
	public static void addFactory(Factory factory) {
		factoryMap.put(factory.getEPackage(), factory);
	}

	public static interface LocateVisitor
	{
		Object safeVisit(Visitable visitable);		
	}

	public static interface ResolveVisitor
	{
		Object safeVisit(Visitable visitable);
	}
	
	/**
	 * The per-EPackage save visitors that identifies type references.
	 */
	private Map<EPackage, LocateVisitor> locateVisitors = new HashMap<EPackage, LocateVisitor>();
	
	/**
	 * The per-EPackage save visitors that identifies type references.
	 */
	private Map<EPackage, ResolveVisitor> resolveVisitors = new HashMap<EPackage, ResolveVisitor>();

	public abstract void addSpecializingElement(Element object);
	public abstract boolean addSpecializingElement(Element object, Operation referredOperation);
	public abstract boolean addSpecializingElement(Element object, Type referredType);

	protected LocateVisitor getLocateVisitor(EObject eObject) {
		EPackage ePackage = eObject.eClass().getEPackage();
		LocateVisitor locateVisitor = locateVisitors.get(ePackage);
		if (locateVisitor == null) {
			Factory factory = factoryMap.get(ePackage);
			locateVisitor = factory.createLocateVisitor(this);
			locateVisitors.put(ePackage, locateVisitor);
		}
		return locateVisitor;
	}

	protected ResolveVisitor getResolveVisitor(EObject eObject) {
		EPackage ePackage = eObject.eClass().getEPackage();
		ResolveVisitor resolveVisitor = resolveVisitors.get(ePackage);
		if (resolveVisitor == null) {
			Factory factory = factoryMap.get(ePackage);
			resolveVisitor = factory.createResolveVisitor(this);
			resolveVisitors.put(ePackage, resolveVisitor);
		}
		return resolveVisitor;
	}

	public abstract <T extends Operation> T resolveOperation(T referredOperation);
	public abstract <T extends Type> T resolveType(T referredType);
}