/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.xtext.completeocl.pivot2cs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.common.utils.ClassUtils;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.util.PivotSwitch;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * 
 */
public class CompleteOCLSplitter
{
	public static Resource separate(MetaModelManager metaModelManager, Resource resource) {
		List<Constraint> allConstraints = new ArrayList<Constraint>();
		for (TreeIterator<EObject> tit = resource.getAllContents(); tit.hasNext(); ) {
			EObject eObject = tit.next();
			if (eObject instanceof Constraint) {
				allConstraints.add((Constraint) eObject);
			}
			else if (eObject instanceof Annotation) {
				tit.prune();
			}
		}
		if (allConstraints.isEmpty()) {
			return null;
		}
		URI uri = resource.getURI();
		URI oclURI = uri.trimFileExtension().appendFileExtension("ocl.pivot");
		Resource oclResource = resource.getResourceSet().createResource(oclURI);	
		Separator separator = new Separator(metaModelManager, oclResource);
		for (Constraint constraint : allConstraints) {
			separator.doSwitch(constraint);
		}
		return oclResource;
	}
	
	public static class Separator extends PivotSwitch<EObject>
	{
		protected final MetaModelManager metaModelManager;
		protected final Resource separateResource;
		private final Map<NamedElement, NamedElement> map = new HashMap<NamedElement, NamedElement>();

		public Separator(MetaModelManager metaModelManager, Resource separateResource) {
			this.metaModelManager = metaModelManager;
			this.separateResource = separateResource;
		}

		@Override
		public EObject caseConstraint(Constraint object) {
			NamedElement parent = (NamedElement) object.eContainer();
			NamedElement separateParent = getSeparate(parent);
			List<Constraint> separateSiblings = separateParent.getOwnedRule();
			separateSiblings.add(object);
			return object;
		}

		@Override
		public EObject caseOperation(Operation object) {
			Type parent = object.getOwningType();
			Type separateParent = getSeparate(parent);
			List<Operation> separateSiblings = separateParent.getOwnedOperation();
			@SuppressWarnings("serial")
			EcoreUtil.Copier copier = new EcoreUtil.Copier(false, true)
			{
				@Override
				protected void copyContainment(EReference eReference, EObject eObject, EObject copyEObject) {
					if (eReference == PivotPackage.Literals.OPERATION__OWNED_PARAMETER) {
						super.copyContainment(eReference, eObject, copyEObject);
					}
				}				
			};
			Operation clone = (Operation) copier.copy(object);
		    copier.copyReferences();
			separateSiblings.add(clone);
			return clone;
		}

		@Override
		public EObject casePackage(org.eclipse.ocl.examples.pivot.Package object) {
			String name = object.getName();
			EObject container = object.eContainer();
			org.eclipse.ocl.examples.pivot.Package separateObject;
			if (container instanceof org.eclipse.ocl.examples.pivot.Package) {
				org.eclipse.ocl.examples.pivot.Package parent = (org.eclipse.ocl.examples.pivot.Package) container;
				org.eclipse.ocl.examples.pivot.Package separateParent = (org.eclipse.ocl.examples.pivot.Package) map.get(parent);
				if (separateParent == null) {
					separateParent = (org.eclipse.ocl.examples.pivot.Package) doSwitch(parent);
					map.put(parent, separateParent);
					metaModelManager.addPackage(separateParent);
				}
				List<org.eclipse.ocl.examples.pivot.Package> separateSiblings = separateParent.getNestedPackage();
				separateObject = PivotUtil.getNamedElement(separateSiblings, name);
				if (separateObject == null) {
					separateObject = (org.eclipse.ocl.examples.pivot.Package) object.eClass().getEPackage().getEFactoryInstance().create(object.eClass());
					separateObject.setName(name);
					separateObject.setNsURI(object.getNsURI());
					separateObject.setNsPrefix(object.getNsPrefix());
					separateSiblings.add(separateObject);
					metaModelManager.addPackage(separateObject);
				}
			}
			else {
				List<EObject> separateSiblings = separateResource.getContents();
				separateObject = (org.eclipse.ocl.examples.pivot.Package) getElementByName(separateSiblings, name);
				if (separateObject == null) {
					separateObject = (org.eclipse.ocl.examples.pivot.Package) object.eClass().getEPackage().getEFactoryInstance().create(object.eClass());
					separateObject.setName(name);
					separateObject.setNsURI(object.getNsURI());
					separateObject.setNsPrefix(object.getNsPrefix());
					separateSiblings.add(separateObject);
					metaModelManager.addPackage(separateObject);
				}
			}
			return separateObject;
		}

		protected org.eclipse.ocl.examples.pivot.Package getSeparatePackage(org.eclipse.ocl.examples.pivot.Package element) {
			org.eclipse.ocl.examples.pivot.Package separate = (org.eclipse.ocl.examples.pivot.Package) map.get(element);
			if (separate == null) {
				separate = (org.eclipse.ocl.examples.pivot.Package) doSwitch(element);
				map.put(element, separate);
				metaModelManager.addPackage(separate);
			}
			return separate;
		}

		@Override
		public EObject caseProperty(Property object) {
			Type parent = object.getOwningType();
			Type separateParent = getSeparate(parent);
			List<Property> separateSiblings = separateParent.getOwnedAttribute();
			@SuppressWarnings("serial")
			EcoreUtil.Copier copier = new EcoreUtil.Copier(false, true)
			{
				@Override
				protected void copyContainment(EReference eReference, EObject eObject, EObject copyEObject) {
				}
			};
			Property clone = (Property) copier.copy(object);
		    copier.copyReferences();
			separateSiblings.add(clone);
			return clone;
		}

		@Override
		public EObject caseType(Type object) {
			org.eclipse.ocl.examples.pivot.Package parent = object.getPackage();
			org.eclipse.ocl.examples.pivot.Package separateParent = getSeparate(parent);
			List<Type> separateSiblings = separateParent.getOwnedType();
			return cloneNamedElement(separateSiblings, object);
		}

		protected <T extends NamedElement> T cloneNamedElement(List<T> separateSiblings, T object) {
			String name = object.getName();
			T separateObject = PivotUtil.getNamedElement(separateSiblings, name);
			if (separateObject == null) {
				@SuppressWarnings("unchecked")
				T castObject = (T) object.eClass().getEPackage().getEFactoryInstance().create(object.eClass());
				separateObject = castObject;
				separateObject.setName(name);
				separateSiblings.add(separateObject);
			}
			return separateObject;
		}

		public NamedElement getElementByName(Iterable<? extends EObject> elements, String name) {
			if (elements == null)
				return null;
			for (EObject element : elements)
				if ((element instanceof NamedElement) && ClassUtils.equals(name, ((NamedElement)element).getName()))
					return (NamedElement)element;
			return null;				
		}

		protected <T extends NamedElement> T getSeparate(T element) {
			NamedElement separate = map.get(element);
			if (separate == null) {
				separate = (NamedElement) doSwitch(element);
				map.put(element, separate);
			}
			@SuppressWarnings("unchecked")
			T castSeparate = (T) separate;
			return castSeparate;
		}		
	}
}
