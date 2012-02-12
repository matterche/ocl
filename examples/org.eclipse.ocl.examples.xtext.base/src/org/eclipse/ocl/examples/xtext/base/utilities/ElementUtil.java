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
 * $Id: ElementUtil.java,v 1.10 2011/05/22 21:06:21 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.utilities;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UnspecifiedType;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.WildcardTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.LibraryDiagnostic;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.PivotScopeVisitor;
import org.eclipse.ocl.examples.xtext.base.scope.RootScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.CSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.PivotScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic;

public class ElementUtil
{
	private static final Logger logger = Logger.getLogger(ElementUtil.class);

	public static String getCollectionTypeName(TypedElementCS csTypedElement) {
		String multiplicity = csTypedElement.getMultiplicity();
		if (multiplicity != null) {
			if ("?".equals(multiplicity)) { //$NON-NLS-1$
				return null;
			}
		}
		else {
			int upper = csTypedElement.getUpper();
			if (upper == 1) {
				return null;
			}
		}
		List<String> qualifiers = csTypedElement.getQualifier();
		boolean isOrdered = true;
		boolean isUnique = true;
		if (qualifiers.contains("!ordered")) { //$NON-NLS-1$
			isOrdered = false;
		}
		else if (qualifiers.contains("ordered")) { //$NON-NLS-1$
			isOrdered = true;
		}
		if (qualifiers.contains("!unique")) { //$NON-NLS-1$
			isUnique = false;
		}
		else if (qualifiers.contains("unique")) { //$NON-NLS-1$
			isUnique = true;
		}
		return getCollectionName(isOrdered, isUnique);
	}

	public static String getCollectionName(boolean ordered, boolean unique) {
		if (ordered) {
			return unique ? "OrderedSet" : "Sequence"; //$NON-NLS-1$ //$NON-NLS-2$
		}
		else {
			return unique ? "Set" : "Bag"; //$NON-NLS-1$ //$NON-NLS-2$
		}
	}
	
	public static ModelElementCS getCsElement(Element obj) {
		Resource resource = obj.eResource();
		if (resource == null) {
			return null;
		}
		ResourceSet resourceSet = resource.getResourceSet();
		if (resourceSet == null) {
			return null;
		}
		CS2Pivot cs2Pivot = CS2Pivot.findAdapter(resourceSet);
		if (cs2Pivot == null) {
			return null;
		}
		return cs2Pivot.getCSElement(obj);
	}
	
	public static RootScopeAdapter getDocumentScopeAdapter(ElementCS context) {
		for (ElementCS target = context, parent; (parent = target.getLogicalParent()) != null; target = parent) {
			CSScopeAdapter scopeAdapter = getScopeAdapter(parent);
			if (scopeAdapter instanceof RootScopeAdapter) {
				return (RootScopeAdapter) scopeAdapter;
			}
		}
		return null;
	}

	public static TemplateParameter getFormalTemplateParameter(TemplateParameterSubstitutionCS csTemplateParameterSubstitution) {
		TemplateBindingCS csTemplateBinding = csTemplateParameterSubstitution.getOwningTemplateBinding();
		int index = csTemplateBinding.getOwnedParameterSubstitution().indexOf(csTemplateParameterSubstitution);
		if (index < 0) {
			return null;
		}
		TemplateBinding templateBinding = (TemplateBinding) csTemplateBinding.getPivot();
		TemplateSignature templateSignature = templateBinding.getSignature();
		List<TemplateParameter> templateParameters = templateSignature.getOwnedParameter();
		if (templateParameters.size() <= index) {
			return null;
		}
		return templateParameters.get(index);
	}

	public static ILeafNode getLeafNode(INode node) {
		ILeafNode leafNode = null;
		if (node instanceof ILeafNode) {
			return (ILeafNode) node;
		}
		else {
			for (ILeafNode lNode : node.getLeafNodes()) {
				if (!lNode.isHidden()) {
					leafNode = lNode;
					return leafNode;
				}
			}
		}
		return null;
	}

	public static int getLower(TypedElementCS csTypedElement) {
		String multiplicity = csTypedElement.getMultiplicity();
		if ("*".equals(multiplicity)) {
			return 0;
		}
		else if ("+".equals(multiplicity)) {
			return 1;
		}
		else if ("?".equals(multiplicity)) {
			return 0;
		}
		return csTypedElement.getLower();
	}

	/**
	 * Return the lower bound for scope resolution lookups in element. This is element
	 * unless element is an UnspecifiedType in which case the derived type is returned.
	 */
	public static Element getLowerBound(Element element) {
		if (element instanceof UnspecifiedType) {
			return ((UnspecifiedType)element).getLowerBound();
		}
		else {
			return element;
		}
	}

	public static <T extends NamedElementCS> T getNamedElementCS(Collection<T> namedElements, String name) {
		for (T namedElement : namedElements) {
			if (name.equals(namedElement.getName())) {
				return namedElement;
			}
		}
		return null;
	}

	public static boolean getQualifier(List<String> qualifiers, String trueString, String falseString, boolean defaultValue) {
		if (qualifiers.contains(trueString)) {
			return true;
		}
		else if (qualifiers.contains(falseString)) {
			return false;
		}
		else {
			return defaultValue;
		}
	}

	public static PivotScopeAdapter getScopeAdapter(Element element) {
		if (element == null) {
			logger.warn("getScopeAdapter for null");
			return null;
		}
		if (element.eIsProxy()) {			// Shouldn't happen, but certainly does during development
			logger.warn("getScopeAdapter for proxy " + element);
			return null;
		}
		PivotScopeAdapter adapter = PivotUtil.getAdapter(PivotScopeAdapter.class, element);
		if (adapter != null) {
			return adapter;
		}
		PivotScopeVisitor visitor = new PivotScopeVisitor();
		PivotScopeAdapter scopeAdapter = element.accept(visitor);
		element.eAdapters().add(scopeAdapter);
		return scopeAdapter;	
	}

	public static CSScopeAdapter getScopeAdapter(ElementCS csElement) {
		if (csElement == null) {
			logger.warn("getScopeAdapter for null");
			return null;
		}
		if (csElement.eIsProxy()) {			// Shouldn't happen, but certainly does during development
			logger.warn("getScopeAdapter for proxy " + csElement);
			return null;
		}
		CSScopeAdapter adapter = PivotUtil.getAdapter(CSScopeAdapter.class, csElement);
		if (adapter != null) {
			return adapter;
		}
		BaseCSResource csResource = (BaseCSResource) csElement.eResource();
		CS2PivotResourceAdapter resourceAdapter = CS2PivotResourceAdapter.getAdapter(csResource, null);
		CS2Pivot converter = resourceAdapter.getConverter();		
		EClass eClass = csElement.eClass();
		EPackage ePackage = eClass.getEPackage();
		BaseCSVisitor<CSScopeAdapter, Object> visitor = converter.getScopeVisitor(ePackage);		
		CSScopeAdapter scopeAdapter = csElement.accept(visitor);
		csElement.eAdapters().add(scopeAdapter);
		return scopeAdapter;	
	}

	public static String getText(ElementCS csElement) {
		ICompositeNode node = NodeModelUtils.getNode(csElement);
		return NodeModelUtils.getTokenText(node);
	}

	public static String getText(TypedTypeRefCS csElement, EReference feature) {
		List<INode> nodes = NodeModelUtils.findNodesForFeature(csElement, feature);
		assert nodes.size() == 1;
		if ((nodes == null) || nodes.isEmpty()) {
			return null;
		}
		else if (nodes.size() == 1) {
			return NodeModelUtils.getTokenText(nodes.get(0));
		}
		else {
			StringBuilder s = new StringBuilder();
			for (INode node : nodes) {
				s.append(NodeModelUtils.getTokenText(node));
			}
			return s.toString();
		}
	}

	public static int getUpper(TypedElementCS csTypedElement) {
		String multiplicity = csTypedElement.getMultiplicity();
		if (multiplicity == null) {
			if (csTypedElement.getOwnedType() == null) {		// This is arbitrary; it makes Ecore default serializations work
				return 1;
			}
		}
		else if ("*".equals(multiplicity)) {
			return -1;
		}
		else if ("+".equals(multiplicity)) {
			return -1;
		}
		else if ("?".equals(multiplicity)) {
			return 1;
		}
		return csTypedElement.getUpper();
	}

	public static boolean hasSyntaxError(List<Diagnostic> diagnostics) {
		for (Diagnostic diagnostic : diagnostics) {
			if (diagnostic instanceof LibraryDiagnostic) {
				return true;
			}
			else if (diagnostic instanceof XtextSyntaxDiagnostic) {
				return true;
			}
		}
		return false;
	}

	public static boolean isInOperation(ElementCS csElement) {
		for (EObject eObject = csElement; eObject != null; eObject = eObject.eContainer()) {
			if (eObject instanceof OperationCS) {
				return true;
			}
			else if (eObject instanceof ClassCS) {
				return false;
			}
		}
		return false;
	}

	public static boolean isOrdered(TypedElementCS csTypedElement) {
		return csTypedElement.getQualifier().contains("ordered");
	}

	/**
	 * Return true if element is able to be referenced by OCLinEcore. Other elements await FIXME Bug 354608.
	 */
	@Deprecated
	public static boolean isReferenceable(EObject reference) {
		return (reference instanceof Property) || (reference instanceof Type) || (reference instanceof org.eclipse.ocl.examples.pivot.Package);
	}

	public static boolean isUnique(TypedElementCS csTypedElement) {
		return getQualifier(csTypedElement.getQualifier(), "unique", "!unique", true);
	}

	public static boolean isSpecialization(TemplateBindingCS csTemplateBinding) {
		TypedTypeRefCS csTypedTypeRef = csTemplateBinding.getOwningTemplateBindableElement();
		Element type = csTypedTypeRef.getPivot();
		for (TemplateParameterSubstitutionCS csTemplateParameterSubstitution : csTemplateBinding.getOwnedParameterSubstitution()) {
			TypeRefCS ownedActualParameter = csTemplateParameterSubstitution.getOwnedActualParameter();
			if (ownedActualParameter instanceof WildcardTypeRefCS) {
				return true;
			}
			Type actualParameterClass = (Type) ownedActualParameter.getPivot();
			TemplateParameter owningTemplateParameter = actualParameterClass.getOwningTemplateParameter();
			if (owningTemplateParameter == null) {
				return true;
			}
			TemplateSignature signature = owningTemplateParameter.getSignature();
			TemplateableElement template = signature.getTemplate();
			if (template != type) {
				return true;
			}
		}
		return false;
	}
}
