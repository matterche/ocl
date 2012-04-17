/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: BaseScopeView.java,v 1.8 2011/05/20 18:26:13 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.PrimitiveType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.Attribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.pivot.util.Pivotable;
import org.eclipse.ocl.examples.pivot.utilities.IllegalLibraryException;
import org.eclipse.ocl.examples.pivot.utilities.PivotObjectImpl;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeRefCS;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.AliasAnalysis;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.impl.AbstractScope;

/**
 * ScopeViews support access to some or all of the elements in a scope.
 * Accesses are filtered on the fly since a cache of results does not remain valid
 * for long enough to merit it, with incremental reparsing regularly trashing
 * the CST.
 */
public class BaseScopeView extends AbstractScope implements IScopeView
{
	private static final Logger logger = Logger.getLogger(BaseScopeView.class);

	/**
     * The <code>NULLSCOPEVIEW</code> to be returned by the most outer scope
     */
    public static final IScopeView NULLSCOPEVIEW = new IScopeView()
    {
		public Iterable<IEObjectDescription> getAllElements() {
	   		return Collections.emptyList();
		}

		public Attribution getAttribution() {
			return null;
		}

		public EObject getChild() {
			return null;
		}

		public EStructuralFeature getContainmentFeature() {
			return null;
		}

		public Iterable<IEObjectDescription> getElements(EObject object) {
	   		return Collections.emptyList();
		}

		public Iterable<IEObjectDescription> getElements(QualifiedName name) {
	   		return Collections.emptyList();
		}

		public IScopeView getParent() {
			return NULLSCOPEVIEW;
		}

		public IEObjectDescription getSingleElement(QualifiedName name) {
			return null;
		}

		public IEObjectDescription getSingleElement(EObject object) {
			return null;
		}

		public EObject getTarget() {
			return null;
		}

		public EReference getTargetReference() {
			return null;
		}
    };

	public static void computeLookups(EnvironmentView environmentView, ElementCS parent, EObject child, EStructuralFeature containmentFeature, EReference targetReference) {
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		Attribution attribution = parent != null ? PivotUtil.getAttribution(parent) : null;
		BaseScopeView baseScopeView = new BaseScopeView(metaModelManager, parent, attribution, child, containmentFeature, targetReference);
		environmentView.computeLookups(baseScopeView);
	}

	private static IScopeView getParent(MetaModelManager metaModelManager, EObject target, EReference targetReference) {
		EObject parent = null;
		Attribution parentScope = null;
		if (target instanceof ElementCS) {
			ElementCS csParent = ((ElementCS)target).getLogicalParent();
			if (csParent != null) {
				parentScope = PivotUtil.getAttribution(csParent);
				parent = csParent;
			}
		}
		else if (target instanceof Element) {
			Element pParent = (Element) ((Element)target).eContainer();
			if (pParent != null) {
				parentScope = PivotUtil.getAttribution(pParent);
				parent = pParent;
			}
		}
		if (parentScope == null) {
			return NULLSCOPEVIEW;
		}
		EStructuralFeature eContainingFeature = target.eContainingFeature();
		return new BaseScopeView(metaModelManager, parent, parentScope, target, eContainingFeature, targetReference);
	}
	
	protected final MetaModelManager metaModelManager;
	protected final Attribution attribution;					// Attributes helper for the target CST node
	protected final EObject target;								// The target CST node
	protected final EObject child;								// Child targeted by containmentFeature, null for child-independent
	protected final EStructuralFeature containmentFeature;		// Selecting child-specific candidates, null for child-independent
	protected final EReference targetReference;					// Selecting permissible candidate types
	
	public BaseScopeView(MetaModelManager metaModelManager, EObject target, Attribution attribution, EObject child, EStructuralFeature containmentFeature, EReference targetReference) {
		super(getParent(metaModelManager, target, targetReference), false);
		this.metaModelManager = metaModelManager;
		this.attribution = attribution;
		this.target = target;
		this.child = child;
		this.containmentFeature = containmentFeature;
		this.targetReference = targetReference;
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {
		EnvironmentView environmentView = new EnvironmentView(metaModelManager, targetReference, null);
		try {
//			computeLookupWithParents(environmentView);
			ScopeView aScope = attribution.computeLookup(target, environmentView, this);
			if (aScope != null) {
				environmentView.computeLookups(aScope);
			}
		} catch (IllegalLibraryException e) {			
		}
		return getDescriptions(environmentView);
	}

	@Override
	protected final Iterable<IEObjectDescription> getAllLocalElements() {
		EnvironmentView environmentView = new EnvironmentView(metaModelManager, targetReference, null);
		attribution.computeLookup(target, environmentView, this);
		return getDescriptions(environmentView);
	}
	
	public Attribution getAttribution() {
		return attribution;
	}

	public EObject getChild() {
		return child;
	}

	public EStructuralFeature getContainmentFeature() {
		return containmentFeature;
	}

	private IEObjectDescription getDescription(EnvironmentView environmentView) {
		int contentsSize = environmentView.getSize();
		if (contentsSize == 0) {
			return null;
		}
		if (contentsSize != 1) {
			logger.warn("Unhandled ambiguous content for '" + environmentView.getName() + "'");
		}
		for (Map.Entry<String, Object> entry : environmentView.getEntries()) {
			Object value = entry.getValue();
			if (value instanceof List<?>) {
				List<?> values = (List<?>) value;
				value = values.get(values.size() - 1);
			}
			if (value instanceof EObject) {
				return EObjectDescription.create(entry.getKey(), (EObject) value);
			}
		}
		return null;
	}

	private List<IEObjectDescription> getDescriptions(EnvironmentView environmentView) {
		List<IEObjectDescription> contents = new ArrayList<IEObjectDescription>();
		for (Map.Entry<String, Object> entry : environmentView.getEntries()) {
			Object values = entry.getValue();
			if (values instanceof EObject) {
				contents.add(EObjectDescription.create(entry.getKey(),
					(EObject) values));
			} else if (values instanceof List<?>) {
				for (Object value : (List<?>) values) {
					contents.add(EObjectDescription.create(entry.getKey(),
						(EObject) value));
				}
			}
		}
		return contents;
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
		if (name == null)
			throw new NullPointerException("name"); //$NON-NLS-1$
		EnvironmentView environmentView = new EnvironmentView(metaModelManager, targetReference, name.toString());
		int size = environmentView.computeLookups(this);
		if (size <= 0) {
			return Collections.emptyList();
		}
		else if (size == 1) {
			return Collections.singletonList(getDescription(environmentView));
		}
		else {
			List<IEObjectDescription> contents = getDescriptions(environmentView);
			return contents;
		}
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {
		String descriptiveName = null;
		if (targetReference == BaseCSTPackage.Literals.IMPORT_CS__NAMESPACE) {
			descriptiveName = getNonPivotURI(object);
		}
		else if (targetReference == BaseCSTPackage.Literals.MODEL_ELEMENT_REF_CS__ELEMENT) {
			descriptiveName = getNonPivotURI(object);
		}
		else if (targetReference == BaseCSTPackage.Literals.REFERENCE_CS__OPPOSITE) {
			descriptiveName = ((NamedElement)object).getName();
		}
		else if ((targetReference == BaseCSTPackage.Literals.TYPED_TYPE_REF_CS__TYPE) && (object instanceof Type)) {
			if (object instanceof PrimitiveType) {		// FIXME Redundant if namespaces correct
				descriptiveName = ((PrimitiveType)object).getName();
			}
			else {
				EObject csRef = getTarget();
				while ((csRef.eContainer() instanceof TypeRefCS)
						|| (csRef.eContainer() instanceof TemplateParameterSubstitutionCS)
						|| (csRef.eContainer() instanceof TemplateBindingCS)) {
					csRef = csRef.eContainer();
				}
				ModelElementCS csContext = (ModelElementCS) csRef.eContainer();
				AliasAnalysis aliasAnalysis = AliasAnalysis.getAdapter(EcoreUtil.getRootContainer(csContext).eResource());
				Element context = csContext.getPivot();
				while ((context != null) && !(context instanceof Namespace) && !(context instanceof Type)) {
					EObject container = context.eContainer();
					if (container instanceof Element) {
						context = (Element) container;
					}
					else {
						break;
					}
				}
				QualifiedPath contextPath = new QualifiedPath(aliasAnalysis.getPath(context));
				QualifiedPath objectPath = new QualifiedPath(aliasAnalysis.getPath((Element) object));
				QualifiedPath qualifiedRelativeName = objectPath.deresolve(contextPath);
				IEObjectDescription objectDescription = EObjectDescription.create(qualifiedRelativeName, object);
				return Collections.singletonList(objectDescription);
			}
		}
		else if (object instanceof NamedElement) {
			EObject csRef = getTarget();
			while ((csRef.eContainer() instanceof TypeRefCS)
					|| (csRef.eContainer() instanceof TemplateParameterSubstitutionCS)
					|| (csRef.eContainer() instanceof TemplateBindingCS)) {
				csRef = csRef.eContainer();
			}
			Pivotable csContext = (Pivotable) csRef.eContainer();
			AliasAnalysis aliasAnalysis = AliasAnalysis.getAdapter(csContext.eResource());
			Element context = csContext.getPivot();
			while ((context != null) && !(context instanceof Namespace) && !(context instanceof Type)) {
				EObject container = context.eContainer();
				if (container instanceof Element) {
					context = (Element) container;
				}
				else {
					break;
				}
			}
			QualifiedPath contextPath = new QualifiedPath(aliasAnalysis.getPath(context));
			QualifiedPath objectPath = new QualifiedPath(aliasAnalysis.getPath((Element) object));
			QualifiedPath qualifiedRelativeName = objectPath.deresolve(contextPath);
			IEObjectDescription objectDescription = EObjectDescription.create(qualifiedRelativeName, object);
			return Collections.singletonList(objectDescription);
		}
		if (descriptiveName != null) {
			IEObjectDescription objectDescription = EObjectDescription.create(descriptiveName, object);
			return Collections.singletonList(objectDescription);
		}
		return super.getElements(object);		// FIXME Implement
	}

	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}
	
	private String getNonPivotURI(EObject object) {
		URI uri = null;
		if (object instanceof PivotObjectImpl) {
			EObject target = ((PivotObjectImpl)object).getTarget();
			if (target != null) {
				uri = EcoreUtil.getURI(target);
			}
		}
		if (uri == null) {
			uri = EcoreUtil.getURI(object);
		}
		if (uri == null) {
			return null;
		}
		if (PivotUtil.isPivotURI(uri)) {
			uri = PivotUtil.getNonPivotURI(uri);
		}
		return uri.toString();
	}

	@Override
	public IScopeView getParent() {
		return (IScopeView) super.getParent();
	}

	@Override
	public IEObjectDescription getSingleElement(EObject object) {
		if (object instanceof NamedElement) {
			return EObjectDescription.create(((NamedElement)object).getName(), object);
		}
		else {
			return super.getSingleElement(object);		// FIXME Implement
		}
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		if (name == null)
			throw new NullPointerException("name"); //$NON-NLS-1$
		EnvironmentView environmentView = new EnvironmentView(metaModelManager, targetReference, name.toString());
		int size = environmentView.computeLookups(this);
		if (size <= 0) {
			return null;
		}
		else if (size == 1) {
			return getDescription(environmentView);
		}
		else {
			return null;			// FIXME Return an 'ambiguous' description
//			return environmentView.getDescriptions().get(0);
		}
	}

	public final EObject getTarget() {
		return target;
	}

	public EReference getTargetReference() {
		return targetReference;
	}

	@Override
	public String toString() {
		EObject target = getTarget();
		StringBuilder s = new StringBuilder();
		s.append("["); //$NON-NLS-1$
		s.append(target.eClass().getName());
		if (containmentFeature != null) {
			s.append("::"); //$NON-NLS-1$
			s.append(containmentFeature.getName());
		}
		s.append("] "); //$NON-NLS-1$
		s.append(String.valueOf(target));
		return s.toString();
	}
}
