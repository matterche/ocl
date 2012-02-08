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
package org.eclipse.ocl.examples.xtext.base.scope;

import java.util.Collections;
import java.util.List;

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
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
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
public class BaseScopeView extends AbstractScope implements ScopeView
{
	@Deprecated
	private static ScopeView getParent(MetaModelManager metaModelManager, EObject target, ScopeAdapter scopeAdapter, EReference targetReference) {
//		assert target == scopeAdapter.getTarget();
		EObject parent = null;
		ScopeAdapter parentScope = null;
		if (target instanceof ElementCS) {
			ElementCS csParent = ((ElementCS)target).getLogicalParent();
			if (csParent != null) {
				parentScope = ElementUtil.getScopeAdapter(csParent);
				parent = csParent;
			}
		}
		else if (target instanceof Element) {
			Element pParent = (Element) ((Element)target).eContainer();
			if (pParent != null) {
				parentScope = ElementUtil.getScopeAdapter(pParent);
				parent = pParent;
			}
		}
		if (parentScope == null) {
			return ScopeView.NULLSCOPEVIEW;
		}
		EStructuralFeature eContainingFeature = target.eContainingFeature();
		return new BaseScopeView(metaModelManager, parent, parentScope, target, eContainingFeature, targetReference);
	}
	
	protected final MetaModelManager metaModelManager;
	protected final ScopeAdapter scopeAdapter;					// Adapting the CST node
	protected final EObject target;					
	protected final EObject child;								// Child targeted by containmentFeature, null for child-independent
	protected final EStructuralFeature containmentFeature;		// Selecting child-specific candidates, null for child-independent
	protected final EReference targetReference;					// Selecting permissible candidate types
	
	public BaseScopeView(MetaModelManager metaModelManager, EObject target, ScopeAdapter scopeAdapter, EObject child, EStructuralFeature containmentFeature, EReference targetReference) {
		super(getParent(metaModelManager, target, scopeAdapter, targetReference), false);
		this.metaModelManager = metaModelManager;
		this.scopeAdapter = scopeAdapter;
		this.target = target;
		this.child = child;
		this.containmentFeature = containmentFeature;
		this.targetReference = targetReference;
	}

	public BaseScopeView(MetaModelManager metaModelManager, EObject target, ScopeView scopeView) {
		super(getParent(metaModelManager, target, scopeView.getScopeAdapter(), scopeView.getTargetReference()), false);
		this.metaModelManager = metaModelManager;
		this.scopeAdapter = scopeView.getScopeAdapter();
		this.target = target;
		this.child = scopeView.getChild();
		this.containmentFeature = scopeView.getContainmentFeature();
		this.targetReference = scopeView.getTargetReference();
	}

/*	public void computeLookupWithParents(EnvironmentView environmentView) {
		// FIXME This is not a usefully distinct functionality
		ScopeView outerScope = scopeAdapter.computeTheLookup(scopeAdapter.getTarget(), environmentView, this);
		if (outerScope != null) {
			if (!environmentView.hasFinalResult()) {
				outerScope.computeLookupWithParents(environmentView);
			}
		}
	} */

	@Override
	public Iterable<IEObjectDescription> getAllElements() {
		EnvironmentView environmentView = new EnvironmentView(metaModelManager, targetReference, null);
		try {
//			computeLookupWithParents(environmentView);
			ScopeView aScope = scopeAdapter.computeLookup(target, environmentView, this);
			if (aScope != null) {
				environmentView.computeLookups(aScope);
			}
		} catch (IllegalLibraryException e) {			
		}
		return environmentView.getDescriptions();
	}

	public EObject getChild() {
		return child;
	}

	public EStructuralFeature getContainmentFeature() {
		return containmentFeature;
	}
	
//	@Override
//	public IEObjectDescription getContentByName(String name) {
//		if (name == null)
//			throw new NullPointerException("name"); //$NON-NLS-1$
//		EnvironmentView environmentView = new EnvironmentView(targetReference, name);
//		return computeLookup(environmentView);
//	}

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
			return Collections.singletonList(environmentView.getDescription());
		}
		else {
			List<IEObjectDescription> contents = environmentView.getDescriptions();
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
//			ModelElementRefCS csRef = (ModelElementRefCS) object;
//			List<Namespace> namespaces = csRef.getNamespace();
//			if (ElementUtil.isReferenceable(object) || (namespaces.size() != 0)) {
//				String name = ((NamedElement)object).getName();
//				IEObjectDescription objectDescription = EObjectDescription.create(name, object);
//				return Collections.singletonList(objectDescription);
//			}
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
			ModelElementCS csContext = (ModelElementCS) csRef.eContainer();
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
//			descriptiveName = ((NamedElement)object).getName();
		}
		if (descriptiveName != null) {
			IEObjectDescription objectDescription = EObjectDescription.create(descriptiveName, object);
			return Collections.singletonList(objectDescription);
		}
		return super.getElements(object);		// FIXME Implement
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
			return environmentView.getDescription();
		}
		else {
			return null;			// FIXME Return an 'ambiguous' description
//			return environmentView.getDescriptions().get(0);
		}
	}

	@Deprecated
	public ScopeView getOuterScope() {
		return (ScopeView) getParent();
	}
	
	public ScopeAdapter getScopeAdapter() {
		return scopeAdapter;
	}

	public final EObject getTarget() {
		return target;
	}

	public EReference getTargetReference() {
		return targetReference;
	}

	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}
	
	protected String getNonPivotURI(EObject object) {
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
	protected final Iterable<IEObjectDescription> getAllLocalElements() {
		EnvironmentView environmentView = new EnvironmentView(metaModelManager, targetReference, null);
		scopeAdapter.computeLookup(target, environmentView, this);
		return environmentView.getDescriptions();
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
