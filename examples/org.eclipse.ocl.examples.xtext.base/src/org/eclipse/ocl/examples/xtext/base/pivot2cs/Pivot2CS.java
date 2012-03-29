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
 * $Id: Pivot2CS.java,v 1.4 2011/03/01 08:47:48 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.pivot2cs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.AbstractConversion;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.utilities.CSI2PivotMapping;

/**
 * CS2Pivot manages the equivalence between a Concrete Syntax Resources
 * and their corresponding Pivot Resources creating a CS2PivotConversion
 * to update.
 */
public class Pivot2CS extends AbstractConversion implements Adapter
{	
	public static interface Factory {
		BaseDeclarationVisitor createDeclarationVisitor(Pivot2CSConversion converter);
		BaseReferenceVisitor createReferenceVisitor(Pivot2CSConversion converter);

		/**
		 * Return a list of classes for which this Pivot2CS overrides a base Pivot2CS.
		 */
		EClass[] getEClasses();
	}
	
	public static Pivot2CS findAdapter(ResourceSet resourceSet) {
		if (resourceSet == null) {
			return null;
		}
		return PivotUtil.getAdapter(Pivot2CS.class, resourceSet);
	}
	
	protected final MetaModelManager metaModelManager;
	private Map<EClass, Factory> factoryMap = new HashMap<EClass, Factory>();
	
	/**
	 * Mapping of each CS resource to its corresponding pivot Resource.
	 */
	protected final Map<? extends Resource, ? extends Resource> cs2pivotResourceMap;
	
	/**
	 * The pivot element for CS monikers
	 */
	protected Map<String, ModelElementCS> moniker2PivotCSMap1 = null;

	/**
	 * CS to Pivot mapping controller for aliases and CSIs.
	 */
	protected CSI2PivotMapping cs2PivotMapping = null;
	
	public Pivot2CS(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap, MetaModelManager metaModelManager) {
		this.cs2pivotResourceMap = cs2pivotResourceMap;
		this.metaModelManager = metaModelManager;
		metaModelManager.getPivotResourceSet().eAdapters().add(this);	// FIXME Dispose somehow
	}
	
	public Pivot2CS(Pivot2CS aConverter) {
		this.cs2pivotResourceMap = aConverter.cs2pivotResourceMap;
		this.metaModelManager = aConverter.metaModelManager;
	}

	protected void addFactory(Factory factory) {
		for (EClass eClass : factory.getEClasses()) {
			factoryMap.put(eClass, factory);
		}
	}

	public Collection<? extends Resource> getCSResources() {
		return cs2pivotResourceMap.keySet();
	}

	public CSI2PivotMapping getCs2PivotMapping() {
		if (cs2PivotMapping == null) {
			Set<? extends Resource> csResources = cs2pivotResourceMap.keySet();
			cs2PivotMapping = new CSI2PivotMapping(csResources);
			cs2PivotMapping.update(csResources);
		}
		return cs2PivotMapping;
	}

	public Factory getFactory(EClass eClass) {
		return factoryMap.get(eClass);
	}

	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}

	public Resource getPivotResource(Resource csResource) {
		return cs2pivotResourceMap.get(csResource);
	}

	public Collection<? extends Resource> getPivotResources() {
		return cs2pivotResourceMap.values();
	}

	public Notifier getTarget() {
		return metaModelManager.getPivotResourceSet();
	}

	public boolean isAdapterForType(Object type) {
		return type == Pivot2CS.class;
	}

	public void notifyChanged(Notification notification) {
		// Do nothing.
	}

	public void setTarget(Notifier newTarget) {
		assert newTarget == metaModelManager.getPivotResourceSet();
	}
	
	public void update() {
		Pivot2CSConversion conversion = new Pivot2CSConversion(this);
		conversion.update(getCSResources());
	}

	public BaseDeclarationVisitor createDefaultDeclarationVisitor(Pivot2CSConversion conversion) {
		return new BaseDeclarationVisitor(conversion);
	}

	public BaseReferenceVisitor createDefaultReferenceVisitor(Pivot2CSConversion conversion) {
		return new BaseReferenceVisitor(conversion);
	}
}